package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class qt0 extends VideoPlayerRewinder {
    public final PhotoViewer f39214a;

    public qt0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f39214a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f39214a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f32117z1.f(false);
        org.telegram.ui.Components.fh0.f24733p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f39214a;
        photoViewer.f32117z1.e(false);
        photoViewer.f32117z1.d(!z10);
        photoViewer.f32117z1.f(true);
        photoViewer.f31928e0.invalidate();
        org.telegram.ui.Components.fh0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f39214a;
        photoViewer.f32117z1.g(Math.abs(j10));
        if (z10) {
            photoViewer.f32035q3.h(f7, false);
            photoViewer.f32044r3.invalidate();
        }
        org.telegram.ui.Components.fh0 fh0Var = org.telegram.ui.Components.fh0.f24733p0;
        fh0Var.Q.g(0L);
        if (z10) {
            fh0Var.Z = f7;
            bi.d4 d4Var = fh0Var.f24737b0;
            if (d4Var != null) {
                d4Var.invalidate();
            }
            org.telegram.ui.Components.eh0 eh0Var = fh0Var.h;
            if (eh0Var != null) {
                eh0Var.invalidate();
            }
        }
    }
}
