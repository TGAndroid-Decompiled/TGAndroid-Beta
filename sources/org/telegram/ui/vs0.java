package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class vs0 extends OrientationEventListener {
    public final PhotoViewer f42267a;

    public vs0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f42267a = photoViewer;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        at0 at0Var;
        Activity activity;
        int i11;
        PhotoViewer photoViewer = this.f42267a;
        if (photoViewer.W3 != null && (at0Var = photoViewer.f33448y2) != null && at0Var.getVisibility() == 0 && (activity = photoViewer.f33445y) != null && (i11 = photoViewer.Y3) != 0) {
            if (i11 == 1) {
                if (i10 >= 240 && i10 <= 300) {
                    photoViewer.Z3 = true;
                } else if (photoViewer.Z3 && i10 > 0) {
                    if (i10 >= 330 || i10 <= 30) {
                        activity.setRequestedOrientation(photoViewer.X3);
                        photoViewer.Y3 = 0;
                        photoViewer.Z3 = false;
                    }
                }
            } else if (i10 > 0 && (i10 >= 330 || i10 <= 30)) {
                photoViewer.Z3 = true;
            } else if (photoViewer.Z3 && i10 >= 240 && i10 <= 300) {
                activity.setRequestedOrientation(photoViewer.X3);
                photoViewer.Y3 = 0;
                photoViewer.Z3 = false;
            }
        }
    }
}
