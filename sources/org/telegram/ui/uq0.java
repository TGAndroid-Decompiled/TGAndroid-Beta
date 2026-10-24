package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class uq0 implements Runnable {
    public final int f42475a;
    public final PhotoViewer f42476b;
    public final lu0 f42477c;

    public uq0(PhotoViewer photoViewer, lu0 lu0Var, int i10) {
        this.f42475a = i10;
        this.f42476b = photoViewer;
        this.f42477c = lu0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f42475a) {
            case 0:
                PhotoViewer photoViewer = this.f42476b;
                photoViewer.f33608h0.setImageBitmap(null);
                lu0 lu0Var = this.f42477c;
                if (lu0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = lu0Var.f39390m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f33599g0.getParent() != null) {
                        ((WindowManager) photoViewer.f33761y.getSystemService("window")).removeView(photoViewer.f33599g0);
                        photoViewer.Y1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f42476b;
                photoViewer2.f33682p4 = null;
                int i10 = 0;
                photoViewer2.f33582e0.setLayerType(0, null);
                photoViewer2.f33664n4 = 0;
                photoViewer2.H1();
                photoViewer2.a2(this.f42477c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f33739v7 && !photoViewer2.f33749w7 && (arrayList = photoViewer2.f33606g7) != null) {
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
                PhotoViewer photoViewer3 = this.f42476b;
                photoViewer3.f33682p4 = null;
                du0 du0Var = photoViewer3.f33582e0;
                if (du0Var != null) {
                    int i11 = 0;
                    du0Var.setLayerType(0, null);
                    photoViewer3.f33664n4 = 0;
                    photoViewer3.a2(this.f42477c);
                    photoViewer3.f33582e0.setScaleX(1.0f);
                    photoViewer3.f33582e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f33739v7 && !photoViewer3.f33749w7 && (arrayList2 = photoViewer3.f33606g7) != null) {
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
