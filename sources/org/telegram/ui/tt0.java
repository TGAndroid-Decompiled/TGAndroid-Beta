package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class tt0 extends OrientationEventListener {
    public final PhotoViewer f40208a;

    public tt0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f40208a = photoViewer;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        yt0 yt0Var;
        Activity activity;
        int i11;
        PhotoViewer photoViewer = this.f40208a;
        if (photoViewer.W3 != null && (yt0Var = photoViewer.f32110y2) != null && yt0Var.getVisibility() == 0 && (activity = photoViewer.f32107y) != null && (i11 = photoViewer.Y3) != 0) {
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
