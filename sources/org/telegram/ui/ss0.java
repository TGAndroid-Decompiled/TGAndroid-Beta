package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class ss0 extends OrientationEventListener {
    public final PhotoViewer f38434a;

    public ss0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f38434a = photoViewer;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        xs0 xs0Var;
        Activity activity;
        int i11;
        PhotoViewer photoViewer = this.f38434a;
        if (photoViewer.T3 != null && (xs0Var = photoViewer.f31886v2) != null && xs0Var.getVisibility() == 0 && (activity = photoViewer.f31913y) != null && (i11 = photoViewer.V3) != 0) {
            if (i11 == 1) {
                if (i10 >= 240 && i10 <= 300) {
                    photoViewer.W3 = true;
                } else if (photoViewer.W3 && i10 > 0) {
                    if (i10 >= 330 || i10 <= 30) {
                        activity.setRequestedOrientation(photoViewer.U3);
                        photoViewer.V3 = 0;
                        photoViewer.W3 = false;
                    }
                }
            } else if (i10 > 0 && (i10 >= 330 || i10 <= 30)) {
                photoViewer.W3 = true;
            } else if (photoViewer.W3 && i10 >= 240 && i10 <= 300) {
                activity.setRequestedOrientation(photoViewer.U3);
                photoViewer.V3 = 0;
                photoViewer.W3 = false;
            }
        }
    }
}
