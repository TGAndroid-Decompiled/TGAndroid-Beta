package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class qs0 extends VideoPlayerRewinder {
    public final PhotoViewer f40966a;

    public qs0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f40966a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f40966a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f33472z1.f(false);
        org.telegram.ui.Components.ah0.f24602p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f40966a;
        photoViewer.f33472z1.e(false);
        photoViewer.f33472z1.d(!z10);
        photoViewer.f33472z1.f(true);
        photoViewer.f33283e0.invalidate();
        org.telegram.ui.Components.ah0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f40966a;
        photoViewer.f33472z1.g(Math.abs(j10));
        if (z10) {
            photoViewer.f33390q3.h(f7, false);
            photoViewer.f33399r3.invalidate();
        }
        org.telegram.ui.Components.ah0 ah0Var = org.telegram.ui.Components.ah0.f24602p0;
        ah0Var.Q.g(0L);
        if (z10) {
            ah0Var.Z = f7;
            ci.i3 i3Var = ah0Var.f24606b0;
            if (i3Var != null) {
                i3Var.invalidate();
            }
            org.telegram.ui.Components.zg0 zg0Var = ah0Var.h;
            if (zg0Var != null) {
                zg0Var.invalidate();
            }
        }
    }
}
