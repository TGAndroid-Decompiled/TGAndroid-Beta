package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
public final class vn0 extends AnimatorListenerAdapter {
    public final int f50566a;
    public final View f50567b;
    public final PhotoViewer f50568c;

    public vn0(PhotoViewer photoViewer, View view, int i3) {
        this.f50566a = i3;
        this.f50568c = photoViewer;
        this.f50567b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50566a) {
            case 0:
                PhotoViewer photoViewer = this.f50568c;
                photoViewer.C3 = false;
                this.f50567b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f41591y3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                fq0 fq0Var = photoViewer.F2;
                if (fq0Var != null) {
                    fq0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.D2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f50568c;
                photoViewer2.C3 = false;
                photoViewer2.f41457j4.run();
                org.telegram.messenger.g0.i3(new hk0(6, this, this.f50567b), 100L);
                return;
        }
    }
}
