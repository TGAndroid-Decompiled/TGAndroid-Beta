package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class qs0 extends VideoPlayerRewinder {
    public final PhotoViewer f40956a;

    public qs0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f40956a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f40956a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f33461z1.f(false);
        org.telegram.ui.Components.zg0.f32927p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f40956a;
        photoViewer.f33461z1.e(false);
        photoViewer.f33461z1.d(!z10);
        photoViewer.f33461z1.f(true);
        photoViewer.f33272e0.invalidate();
        org.telegram.ui.Components.zg0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f40956a;
        photoViewer.f33461z1.g(Math.abs(j10));
        if (z10) {
            photoViewer.f33379q3.h(f7, false);
            photoViewer.f33388r3.invalidate();
        }
        org.telegram.ui.Components.zg0 zg0Var = org.telegram.ui.Components.zg0.f32927p0;
        zg0Var.Q.g(0L);
        if (z10) {
            zg0Var.Z = f7;
            ci.i3 i3Var = zg0Var.f32931b0;
            if (i3Var != null) {
                i3Var.invalidate();
            }
            org.telegram.ui.Components.yg0 yg0Var = zg0Var.h;
            if (yg0Var != null) {
                yg0Var.invalidate();
            }
        }
    }
}
