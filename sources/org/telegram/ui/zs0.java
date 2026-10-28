package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class zs0 extends VideoPlayerRewinder {
    public final PhotoViewer f46355a;

    public zs0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f46355a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f46355a;
        PhotoViewer.k(photoViewer, obtain);
        photoViewer.f35859z1.f(false);
        org.telegram.ui.Components.dh0.f27444p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f46355a;
        photoViewer.f35859z1.e(false);
        photoViewer.f35859z1.d(!z10);
        photoViewer.f35859z1.f(true);
        photoViewer.f35670e0.invalidate();
        org.telegram.ui.Components.dh0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f46355a;
        photoViewer.f35859z1.g(Math.abs(j10));
        if (z10) {
            photoViewer.f35778q3.h(f7, false);
            photoViewer.f35787r3.invalidate();
        }
        org.telegram.ui.Components.dh0 dh0Var = org.telegram.ui.Components.dh0.f27444p0;
        dh0Var.Q.g(0L);
        if (z10) {
            dh0Var.Z = f7;
            di.h3 h3Var = dh0Var.f27448b0;
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
