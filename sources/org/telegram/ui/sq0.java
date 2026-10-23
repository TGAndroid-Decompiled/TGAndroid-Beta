package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class sq0 implements Runnable {
    public final int f41522a;
    public final PhotoViewer f41523b;
    public final ju0 f41524c;

    public sq0(PhotoViewer photoViewer, ju0 ju0Var, int i10) {
        this.f41522a = i10;
        this.f41523b = photoViewer;
        this.f41524c = ju0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f41522a) {
            case 0:
                PhotoViewer photoViewer = this.f41523b;
                photoViewer.f33309h0.setImageBitmap(null);
                ju0 ju0Var = this.f41524c;
                if (ju0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = ju0Var.f38364m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f33300g0.getParent() != null) {
                        ((WindowManager) photoViewer.f33462y.getSystemService("window")).removeView(photoViewer.f33300g0);
                        photoViewer.Y1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f41523b;
                photoViewer2.f33383p4 = null;
                int i10 = 0;
                photoViewer2.f33283e0.setLayerType(0, null);
                photoViewer2.f33365n4 = 0;
                photoViewer2.H1();
                photoViewer2.a2(this.f41524c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f33440v7 && !photoViewer2.f33450w7 && (arrayList = photoViewer2.f33307g7) != null) {
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
                PhotoViewer photoViewer3 = this.f41523b;
                photoViewer3.f33383p4 = null;
                bu0 bu0Var = photoViewer3.f33283e0;
                if (bu0Var != null) {
                    int i11 = 0;
                    bu0Var.setLayerType(0, null);
                    photoViewer3.f33365n4 = 0;
                    photoViewer3.a2(this.f41524c);
                    photoViewer3.f33283e0.setScaleX(1.0f);
                    photoViewer3.f33283e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f33440v7 && !photoViewer3.f33450w7 && (arrayList2 = photoViewer3.f33307g7) != null) {
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
