package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class yo0 extends VideoPlayerRewinder {
    public final PhotoViewer f52374a;

    public yo0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f52374a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f52374a;
        PhotoViewer.d(photoViewer, obtain);
        photoViewer.A1.f(false);
        org.telegram.ui.Components.ie0.f34683q0.R.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f52374a;
        photoViewer.A1.e(false);
        photoViewer.A1.d(!z10);
        photoViewer.A1.f(true);
        photoViewer.f41420f0.invalidate();
        org.telegram.ui.Components.ie0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f10, boolean z10) {
        PhotoViewer photoViewer = this.f52374a;
        photoViewer.A1.g(Math.abs(j10));
        if (z10) {
            photoViewer.f41526r3.h(false, f10);
            photoViewer.f41535s3.invalidate();
        }
        org.telegram.ui.Components.ie0 ie0Var = org.telegram.ui.Components.ie0.f34683q0;
        ie0Var.R.g(0L);
        if (z10) {
            ie0Var.f34685a0 = f10;
            ei.e3 e3Var = ie0Var.f34689c0;
            if (e3Var != null) {
                e3Var.invalidate();
            }
            org.telegram.ui.Components.ge0 ge0Var = ie0Var.h;
            if (ge0Var != null) {
                ge0Var.invalidate();
            }
        }
    }
}
