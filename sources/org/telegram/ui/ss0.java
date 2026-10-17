package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class ss0 extends VideoPlayerRewinder {
    public final PhotoViewer f41489a;

    public ss0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f41489a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f41489a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f33455z1.f(false);
        org.telegram.ui.Components.zg0.f32905p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f41489a;
        photoViewer.f33455z1.e(false);
        photoViewer.f33455z1.d(!z10);
        photoViewer.f33455z1.f(true);
        photoViewer.f33266e0.invalidate();
        org.telegram.ui.Components.zg0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f41489a;
        photoViewer.f33455z1.g(Math.abs(j10));
        if (z10) {
            photoViewer.f33373q3.h(f7, false);
            photoViewer.f33382r3.invalidate();
        }
        org.telegram.ui.Components.zg0 zg0Var = org.telegram.ui.Components.zg0.f32905p0;
        zg0Var.Q.g(0L);
        if (z10) {
            zg0Var.Z = f7;
            ci.i3 i3Var = zg0Var.f32909b0;
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
