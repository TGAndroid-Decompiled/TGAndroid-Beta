package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class zs0 extends OrientationEventListener {
    public final PhotoViewer f44015a;

    public zs0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f44015a = photoViewer;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        et0 et0Var;
        Activity activity;
        int i11;
        PhotoViewer photoViewer = this.f44015a;
        if (photoViewer.T3 != null && (et0Var = photoViewer.f34412v2) != null && et0Var.getVisibility() == 0 && (activity = photoViewer.f34439y) != null && (i11 = photoViewer.V3) != 0) {
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
