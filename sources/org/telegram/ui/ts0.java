package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class ts0 extends VideoPlayerRewinder {
    public final PhotoViewer f42068a;

    public ts0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f42068a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f42068a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f33769z1.f(false);
        org.telegram.ui.Components.dh0.f25631p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f42068a;
        photoViewer.f33769z1.e(false);
        photoViewer.f33769z1.d(!z10);
        photoViewer.f33769z1.f(true);
        photoViewer.f33580e0.invalidate();
        org.telegram.ui.Components.dh0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f42068a;
        photoViewer.f33769z1.g(Math.abs(j10));
        if (z10) {
            photoViewer.f33687q3.h(f7, false);
            photoViewer.f33696r3.invalidate();
        }
        org.telegram.ui.Components.dh0 dh0Var = org.telegram.ui.Components.dh0.f25631p0;
        dh0Var.Q.g(0L);
        if (z10) {
            dh0Var.Z = f7;
            ci.h3 h3Var = dh0Var.f25635b0;
            if (h3Var != null) {
                h3Var.invalidate();
            }
            org.telegram.ui.Components.ch0 ch0Var = dh0Var.h;
            if (ch0Var != null) {
                ch0Var.invalidate();
            }
        }
    }
}
