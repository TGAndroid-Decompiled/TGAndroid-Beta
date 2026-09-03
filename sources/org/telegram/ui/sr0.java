package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class sr0 extends AnimatorListenerAdapter {
    public final int f41300a;
    public final View f41301b;
    public final PhotoViewer f41302c;

    public sr0(PhotoViewer photoViewer, View view, int i10) {
        this.f41300a = i10;
        this.f41302c = photoViewer;
        this.f41301b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41300a) {
            case 0:
                PhotoViewer photoViewer = this.f41302c;
                photoViewer.f34443y3 = false;
                this.f41301b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f34404u3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                hu0 hu0Var = photoViewer.B2;
                if (hu0Var != null) {
                    hu0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.f34451z2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f41302c;
                photoViewer2.f34443y3 = false;
                photoViewer2.f34271f4.run();
                AndroidUtilities.runOnUIThread(new pr0(1, this, this.f41301b), 100L);
                return;
        }
    }
}
