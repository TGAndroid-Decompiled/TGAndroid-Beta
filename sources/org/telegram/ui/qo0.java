package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class qo0 implements Runnable {
    public final int f40866a;
    public final PhotoViewer f40867b;
    public final fs0 f40868c;

    public qo0(PhotoViewer photoViewer, fs0 fs0Var, int i10) {
        this.f40866a = i10;
        this.f40867b = photoViewer;
        this.f40868c = fs0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f40866a) {
            case 0:
                PhotoViewer photoViewer = this.f40867b;
                photoViewer.f33503h0.setImageBitmap(null);
                fs0 fs0Var = this.f40868c;
                if (fs0Var != null && !org.telegram.messenger.i0.Q1() && (clippingImageView = fs0Var.f37224m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f33494g0.getParent() != null) {
                        ((WindowManager) photoViewer.D.getSystemService("window")).removeView(photoViewer.f33494g0);
                        photoViewer.Z1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f40867b;
                photoViewer2.f33577p4 = null;
                int i10 = 0;
                photoViewer2.f33477e0.setLayerType(0, null);
                photoViewer2.f33559n4 = 0;
                photoViewer2.I1();
                photoViewer2.b2(this.f40868c);
                MediaController.B().F0();
                if (photoViewer2.f33634v7 && !photoViewer2.f33644w7 && (arrayList = photoViewer2.f33501g7) != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (obj instanceof org.telegram.messenger.ff) {
                            ((org.telegram.messenger.ff) obj).h();
                        }
                    }
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer3 = this.f40867b;
                photoViewer3.f33577p4 = null;
                zr0 zr0Var = photoViewer3.f33477e0;
                if (zr0Var != null) {
                    int i11 = 0;
                    zr0Var.setLayerType(0, null);
                    photoViewer3.f33559n4 = 0;
                    photoViewer3.b2(this.f40868c);
                    photoViewer3.f33477e0.setScaleX(1.0f);
                    photoViewer3.f33477e0.setScaleY(1.0f);
                    MediaController.B().F0();
                    if (photoViewer3.f33634v7 && !photoViewer3.f33644w7 && (arrayList2 = photoViewer3.f33501g7) != null) {
                        int size2 = arrayList2.size();
                        while (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            if (obj2 instanceof org.telegram.messenger.ff) {
                                ((org.telegram.messenger.ff) obj2).h();
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
