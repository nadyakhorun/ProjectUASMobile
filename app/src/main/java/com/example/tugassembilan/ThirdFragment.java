package com.example.tugassembilan;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class ThirdFragment extends Fragment {

    private static final String YOUTUBE_VIDEO_ID_1 = "IPRBKGxCCZQ";
    private static final String YOUTUBE_VIDEO_ID_2 = "DbOa2bGLNWA";
    private static final String YOUTUBE_VIDEO_ID_3 = "BfQTQv6PXww";
    private static final String YOUTUBE_VIDEO_ID_4 = "CIP0esJ6MMs";
    private YouTubePlayerView youTubePlayerView;
    private YouTubePlayer youTubePlayer;
    private boolean isVideoOpen = false;

    public ThirdFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_third, container, false);

        // Initialize YouTube Player View
        youTubePlayerView = view.findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);

        // Set up ImageButton click listeners
        ImageButton imageButton1 = view.findViewById(R.id.image1);
        imageButton1.setOnClickListener(v -> loadVideo(YOUTUBE_VIDEO_ID_1));

        ImageButton imageButton2 = view.findViewById(R.id.image2);
        imageButton2.setOnClickListener(v -> loadVideo(YOUTUBE_VIDEO_ID_2));

        ImageButton imageButton3 = view.findViewById(R.id.image3);
        imageButton3.setOnClickListener(v -> loadVideo(YOUTUBE_VIDEO_ID_3));

        ImageButton imageButton4 = view.findViewById(R.id.image4);
        imageButton4.setOnClickListener(v -> loadVideo(YOUTUBE_VIDEO_ID_4));

        // Set up KeyEvent callback for handling back button
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener((v, keyCode, event) -> {
            if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_UP) {
                // Check if YouTubePlayerView is visible and handle back button
                if (isVideoOpen) {
                    closeVideo();
                    return true;  // consume the back button event
                }
            }
            return false;  // do not consume the back button event
        });

        return view;
    }

    private void loadVideo(String videoId) {
        // Show the YouTubePlayerView
        youTubePlayerView.setVisibility(View.VISIBLE);

        // Load and play the YouTube video
        youTubePlayerView.getYouTubePlayerWhenReady(youTubePlayer -> {
            if (youTubePlayer != null) {
                youTubePlayer.loadVideo(videoId, 0);
                this.youTubePlayer = youTubePlayer;
                isVideoOpen = true;
            }
        });
    }

    private void closeVideo() {
        // Hide the YouTubePlayerView
        youTubePlayerView.setVisibility(View.GONE);

        // Release resources associated with the YouTubePlayerView
        if (youTubePlayer != null) {
            youTubePlayer.pause();
            youTubePlayer.cueVideo("", 0);
            isVideoOpen = false;
        }
    }
}