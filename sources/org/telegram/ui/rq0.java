package org.telegram.ui;

import android.view.MotionEvent;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
public final class rq0 extends VideoPlayerRewinder {
    public final PhotoViewer f41271a;

    public rq0(PhotoViewer photoViewer, VideoFramesRewinder videoFramesRewinder) {
        super(videoFramesRewinder);
        this.f41271a = photoViewer;
    }

    @Override
    public final void onRewindCanceled() {
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        PhotoViewer photoViewer = this.f41271a;
        PhotoViewer.d(photoViewer, obtain);
        photoViewer.f33659z1.f(false);
        org.telegram.ui.Components.jf0.f27345p0.Q.f(false);
    }

    @Override
    public final void onRewindStart(boolean z10) {
        PhotoViewer photoViewer = this.f41271a;
        photoViewer.f33659z1.e(false);
        photoViewer.f33659z1.d(!z10);
        photoViewer.f33659z1.f(true);
        photoViewer.f33470e0.invalidate();
        org.telegram.ui.Components.jf0.v(z10);
    }

    @Override
    public final void updateRewindProgressUi(long j10, float f7, boolean z10) {
        PhotoViewer photoViewer = this.f41271a;
        photoViewer.f33659z1.g(Math.abs(j10));
        if (z10) {
            photoViewer.f33577q3.h(false, f7);
            photoViewer.f33586r3.invalidate();
        }
        org.telegram.ui.Components.jf0 jf0Var = org.telegram.ui.Components.jf0.f27345p0;
        jf0Var.Q.g(0L);
        if (z10) {
            jf0Var.Z = f7;
            ih.c cVar = jf0Var.f27349b0;
            if (cVar != null) {
                cVar.invalidate();
            }
            org.telegram.ui.Components.if0 if0Var = jf0Var.h;
            if (if0Var != null) {
                if0Var.invalidate();
            }
        }
    }
}
