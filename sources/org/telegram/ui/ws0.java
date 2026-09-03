package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class ws0 extends VideoPlayerRewinder {
    public final PhotoViewer f39767a;

    public ws0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f39767a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f39767a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f31869w1.f(false);
        org.telegram.ui.Components.mg0.m0.N.f(false);
    }

    @Override
    public final void onRewindStart(boolean z4) {
        PhotoViewer photoViewer = this.f39767a;
        photoViewer.f31869w1.e(false);
        photoViewer.f31869w1.d(!z4);
        photoViewer.f31869w1.f(true);
        photoViewer.f31679b0.invalidate();
        org.telegram.ui.Components.mg0.v(z4);
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f10, boolean z4) {
        PhotoViewer photoViewer = this.f39767a;
        photoViewer.f31869w1.g(Math.abs(j10));
        if (z4) {
            photoViewer.f31789n3.h(f10, false);
            photoViewer.f31798o3.invalidate();
        }
        org.telegram.ui.Components.mg0 mg0Var = org.telegram.ui.Components.mg0.m0;
        mg0Var.N.g(0L);
        if (z4) {
            mg0Var.W = f10;
            nh.a3 a3Var = mg0Var.Y;
            if (a3Var != null) {
                a3Var.invalidate();
            }
            org.telegram.ui.Components.lg0 lg0Var = mg0Var.h;
            if (lg0Var != null) {
                lg0Var.invalidate();
            }
        }
    }
}
