package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class ss0 extends VideoPlayerRewinder {
    public final PhotoViewer f41796a;

    public ss0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f41796a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f41796a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f33771z1.f(false);
        org.telegram.ui.Components.ch0.f25313p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f41796a;
        photoViewer.f33771z1.e(false);
        photoViewer.f33771z1.d(!z10);
        photoViewer.f33771z1.f(true);
        photoViewer.f33582e0.invalidate();
        org.telegram.ui.Components.ch0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f41796a;
        photoViewer.f33771z1.g(Math.abs(j10));
        if (z10) {
            photoViewer.f33689q3.h(f7, false);
            photoViewer.f33698r3.invalidate();
        }
        org.telegram.ui.Components.ch0 ch0Var = org.telegram.ui.Components.ch0.f25313p0;
        ch0Var.Q.g(0L);
        if (z10) {
            ch0Var.Z = f7;
            ci.h3 h3Var = ch0Var.f25317b0;
            if (h3Var != null) {
                h3Var.invalidate();
            }
            org.telegram.ui.Components.bh0 bh0Var = ch0Var.h;
            if (bh0Var != null) {
                bh0Var.invalidate();
            }
        }
    }
}
