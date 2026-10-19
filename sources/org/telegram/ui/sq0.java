package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class sq0 implements Runnable {
    public final int f41512a;
    public final PhotoViewer f41513b;
    public final ju0 f41514c;

    public sq0(PhotoViewer photoViewer, ju0 ju0Var, int i10) {
        this.f41512a = i10;
        this.f41513b = photoViewer;
        this.f41514c = ju0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f41512a) {
            case 0:
                PhotoViewer photoViewer = this.f41513b;
                photoViewer.f33298h0.setImageBitmap(null);
                ju0 ju0Var = this.f41514c;
                if (ju0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = ju0Var.f38353m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f33289g0.getParent() != null) {
                        ((WindowManager) photoViewer.f33451y.getSystemService("window")).removeView(photoViewer.f33289g0);
                        photoViewer.W1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f41513b;
                photoViewer2.f33372p4 = null;
                int i10 = 0;
                photoViewer2.f33272e0.setLayerType(0, null);
                photoViewer2.f33354n4 = 0;
                photoViewer2.G1();
                photoViewer2.Y1(this.f41514c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f33429v7 && !photoViewer2.f33439w7 && (arrayList = photoViewer2.f33296g7) != null) {
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
                PhotoViewer photoViewer3 = this.f41513b;
                photoViewer3.f33372p4 = null;
                bu0 bu0Var = photoViewer3.f33272e0;
                if (bu0Var != null) {
                    int i11 = 0;
                    bu0Var.setLayerType(0, null);
                    photoViewer3.f33354n4 = 0;
                    photoViewer3.Y1(this.f41514c);
                    photoViewer3.f33272e0.setScaleX(1.0f);
                    photoViewer3.f33272e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f33429v7 && !photoViewer3.f33439w7 && (arrayList2 = photoViewer3.f33296g7) != null) {
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
