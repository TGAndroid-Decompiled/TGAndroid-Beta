package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class vq0 implements Runnable {
    public final int f42816a;
    public final PhotoViewer f42817b;
    public final mu0 f42818c;

    public vq0(PhotoViewer photoViewer, mu0 mu0Var, int i10) {
        this.f42816a = i10;
        this.f42817b = photoViewer;
        this.f42818c = mu0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f42816a) {
            case 0:
                PhotoViewer photoViewer = this.f42817b;
                photoViewer.f33606h0.setImageBitmap(null);
                mu0 mu0Var = this.f42818c;
                if (mu0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = mu0Var.f39701m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f33597g0.getParent() != null) {
                        ((WindowManager) photoViewer.f33759y.getSystemService("window")).removeView(photoViewer.f33597g0);
                        photoViewer.Y1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f42817b;
                photoViewer2.f33680p4 = null;
                int i10 = 0;
                photoViewer2.f33580e0.setLayerType(0, null);
                photoViewer2.f33662n4 = 0;
                photoViewer2.H1();
                photoViewer2.a2(this.f42818c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f33737v7 && !photoViewer2.f33747w7 && (arrayList = photoViewer2.f33604g7) != null) {
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
                PhotoViewer photoViewer3 = this.f42817b;
                photoViewer3.f33680p4 = null;
                eu0 eu0Var = photoViewer3.f33580e0;
                if (eu0Var != null) {
                    int i11 = 0;
                    eu0Var.setLayerType(0, null);
                    photoViewer3.f33662n4 = 0;
                    photoViewer3.a2(this.f42818c);
                    photoViewer3.f33580e0.setScaleX(1.0f);
                    photoViewer3.f33580e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f33737v7 && !photoViewer3.f33747w7 && (arrayList2 = photoViewer3.f33604g7) != null) {
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
