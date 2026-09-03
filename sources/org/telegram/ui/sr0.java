package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class sr0 extends AnimatorListenerAdapter {
    public final int f38299a;
    public final View f38300b;
    public final PhotoViewer f38301c;

    public sr0(PhotoViewer photoViewer, View view, int i10) {
        this.f38299a = i10;
        this.f38301c = photoViewer;
        this.f38300b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38299a) {
            case 0:
                PhotoViewer photoViewer = this.f38301c;
                photoViewer.f31891y3 = false;
                this.f38300b.setOutlineProvider(null);
                ImageView imageView = photoViewer.f31852u3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                hu0 hu0Var = photoViewer.B2;
                if (hu0Var != null) {
                    hu0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.f31899z2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer2 = this.f38301c;
                photoViewer2.f31891y3 = false;
                photoViewer2.f31719f4.run();
                AndroidUtilities.runOnUIThread(new gr0(2, this, this.f38300b), 100L);
                return;
        }
    }
}
