package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class qr0 extends AnimatorListenerAdapter {
    public final int f40909a;
    public final View f40910b;
    public final PhotoViewer f40911c;

    public qr0(PhotoViewer photoViewer, View view, int i10) {
        this.f40909a = i10;
        this.f40911c = photoViewer;
        this.f40910b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40909a) {
            case 0:
                PhotoViewer photoViewer = this.f40911c;
                photoViewer.B3 = false;
                this.f40910b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f33753x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                du0 du0Var = photoViewer.E2;
                if (du0Var != null) {
                    du0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f40911c;
                photoViewer2.B3 = false;
                photoViewer2.f33619i4.run();
                AndroidUtilities.runOnUIThread(new bh0(23, this, this.f40910b), 100L);
                return;
        }
    }
}
