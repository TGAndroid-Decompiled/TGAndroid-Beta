package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class tq0 implements Runnable {
    public final int f41811a;
    public final PhotoViewer f41812b;
    public final lu0 f41813c;

    public tq0(PhotoViewer photoViewer, lu0 lu0Var, int i10) {
        this.f41811a = i10;
        this.f41812b = photoViewer;
        this.f41813c = lu0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f41811a) {
            case 0:
                PhotoViewer photoViewer = this.f41812b;
                photoViewer.f33292h0.setImageBitmap(null);
                lu0 lu0Var = this.f41813c;
                if (lu0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = lu0Var.f38946m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f33283g0.getParent() != null) {
                        ((WindowManager) photoViewer.f33445y.getSystemService("window")).removeView(photoViewer.f33283g0);
                        photoViewer.W1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f41812b;
                photoViewer2.f33366p4 = null;
                int i10 = 0;
                photoViewer2.f33266e0.setLayerType(0, null);
                photoViewer2.f33348n4 = 0;
                photoViewer2.G1();
                photoViewer2.Y1(this.f41813c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f33423v7 && !photoViewer2.f33433w7 && (arrayList = photoViewer2.f33290g7) != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (obj instanceof MediaController.PhotoEntry) {
                            ((MediaController.PhotoEntry) obj).deleteAll();
                        }
                    }
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer3 = this.f41812b;
                photoViewer3.f33366p4 = null;
                du0 du0Var = photoViewer3.f33266e0;
                if (du0Var != null) {
                    int i11 = 0;
                    du0Var.setLayerType(0, null);
                    photoViewer3.f33348n4 = 0;
                    photoViewer3.Y1(this.f41813c);
                    photoViewer3.f33266e0.setScaleX(1.0f);
                    photoViewer3.f33266e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f33423v7 && !photoViewer3.f33433w7 && (arrayList2 = photoViewer3.f33290g7) != null) {
                        int size2 = arrayList2.size();
                        while (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            if (obj2 instanceof MediaController.PhotoEntry) {
                                ((MediaController.PhotoEntry) obj2).deleteAll();
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
