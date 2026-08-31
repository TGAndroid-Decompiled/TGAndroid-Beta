package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class rs0 extends VideoPlayerRewinder {
    public final PhotoViewer f41048a;

    public rs0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f41048a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f41048a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f34421w1.f(false);
        org.telegram.ui.Components.ng0.m0.N.f(false);
    }

    @Override
    public final void onRewindStart(boolean z4) {
        PhotoViewer photoViewer = this.f41048a;
        photoViewer.f34421w1.e(false);
        photoViewer.f34421w1.d(!z4);
        photoViewer.f34421w1.f(true);
        photoViewer.f34230b0.invalidate();
        org.telegram.ui.Components.ng0.v(z4);
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f10, boolean z4) {
        PhotoViewer photoViewer = this.f41048a;
        photoViewer.f34421w1.g(Math.abs(j10));
        if (z4) {
            photoViewer.f34341n3.h(f10, false);
            photoViewer.f34350o3.invalidate();
        }
        org.telegram.ui.Components.ng0 ng0Var = org.telegram.ui.Components.ng0.m0;
        ng0Var.N.g(0L);
        if (z4) {
            ng0Var.W = f10;
            oh.b3 b3Var = ng0Var.Y;
            if (b3Var != null) {
                b3Var.invalidate();
            }
            org.telegram.ui.Components.mg0 mg0Var = ng0Var.h;
            if (mg0Var != null) {
                mg0Var.invalidate();
            }
        }
    }
}
