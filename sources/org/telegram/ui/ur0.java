package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class ur0 extends AnimatorListenerAdapter {
    public final int f44519a;
    public final View f44520b;
    public final PhotoViewer f44521c;

    public ur0(PhotoViewer photoViewer, View view, int i10) {
        this.f44519a = i10;
        this.f44521c = photoViewer;
        this.f44520b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44519a) {
            case 0:
                PhotoViewer photoViewer = this.f44521c;
                photoViewer.B3 = false;
                this.f44520b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f35816x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                hu0 hu0Var = photoViewer.E2;
                if (hu0Var != null) {
                    hu0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.C2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f44521c;
                photoViewer2.B3 = false;
                photoViewer2.f35682i4.run();
                AndroidUtilities.runOnUIThread(new yl0(12, this, this.f44520b), 100L);
                return;
        }
    }
}
