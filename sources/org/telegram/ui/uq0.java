package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class uq0 implements Runnable {
    public final int f42053a;
    public final PhotoViewer f42054b;
    public final lu0 f42055c;

    public uq0(PhotoViewer photoViewer, lu0 lu0Var, int i10) {
        this.f42053a = i10;
        this.f42054b = photoViewer;
        this.f42055c = lu0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f42053a) {
            case 0:
                PhotoViewer photoViewer = this.f42054b;
                photoViewer.f33299h0.setImageBitmap(null);
                lu0 lu0Var = this.f42055c;
                if (lu0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = lu0Var.f38970m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f33290g0.getParent() != null) {
                        ((WindowManager) photoViewer.f33452y.getSystemService("window")).removeView(photoViewer.f33290g0);
                        photoViewer.W1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f42054b;
                photoViewer2.f33373p4 = null;
                int i10 = 0;
                photoViewer2.f33273e0.setLayerType(0, null);
                photoViewer2.f33355n4 = 0;
                photoViewer2.G1();
                photoViewer2.Y1(this.f42055c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f33430v7 && !photoViewer2.f33440w7 && (arrayList = photoViewer2.f33297g7) != null) {
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
                PhotoViewer photoViewer3 = this.f42054b;
                photoViewer3.f33373p4 = null;
                du0 du0Var = photoViewer3.f33273e0;
                if (du0Var != null) {
                    int i11 = 0;
                    du0Var.setLayerType(0, null);
                    photoViewer3.f33355n4 = 0;
                    photoViewer3.Y1(this.f42055c);
                    photoViewer3.f33273e0.setScaleX(1.0f);
                    photoViewer3.f33273e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f33430v7 && !photoViewer3.f33440w7 && (arrayList2 = photoViewer3.f33297g7) != null) {
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
