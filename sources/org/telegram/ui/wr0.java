package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class wr0 extends AnimatorListenerAdapter {
    public final int f45390a;
    public final View f45391b;
    public final PhotoViewer f45392c;

    public wr0(PhotoViewer photoViewer, View view, int i10) {
        this.f45390a = i10;
        this.f45392c = photoViewer;
        this.f45391b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45390a) {
            case 0:
                PhotoViewer photoViewer = this.f45392c;
                photoViewer.B3 = false;
                this.f45391b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f35843x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                ju0 ju0Var = photoViewer.E2;
                if (ju0Var != null) {
                    ju0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f45392c;
                photoViewer2.B3 = false;
                photoViewer2.f35709i4.run();
                AndroidUtilities.runOnUIThread(new am0(13, this, this.f45391b), 100L);
                return;
        }
    }
}
