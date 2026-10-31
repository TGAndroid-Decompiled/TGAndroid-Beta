package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class so0 implements Runnable {
    public final int f41622a;
    public final PhotoViewer f41623b;
    public final gs0 f41624c;

    public so0(PhotoViewer photoViewer, gs0 gs0Var, int i10) {
        this.f41622a = i10;
        this.f41623b = photoViewer;
        this.f41624c = gs0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f41622a) {
            case 0:
                PhotoViewer photoViewer = this.f41623b;
                photoViewer.f33496h0.setImageBitmap(null);
                gs0 gs0Var = this.f41624c;
                if (gs0Var != null && !org.telegram.messenger.i0.Q1() && (clippingImageView = gs0Var.f37636m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f33487g0.getParent() != null) {
                        ((WindowManager) photoViewer.D.getSystemService("window")).removeView(photoViewer.f33487g0);
                        photoViewer.Z1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f41623b;
                photoViewer2.f33570p4 = null;
                int i10 = 0;
                photoViewer2.f33470e0.setLayerType(0, null);
                photoViewer2.f33552n4 = 0;
                photoViewer2.I1();
                photoViewer2.b2(this.f41624c);
                MediaController.B().F0();
                if (photoViewer2.f33627v7 && !photoViewer2.f33637w7 && (arrayList = photoViewer2.f33494g7) != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (obj instanceof org.telegram.messenger.ef) {
                            ((org.telegram.messenger.ef) obj).h();
                        }
                    }
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer3 = this.f41623b;
                photoViewer3.f33570p4 = null;
                as0 as0Var = photoViewer3.f33470e0;
                if (as0Var != null) {
                    int i11 = 0;
                    as0Var.setLayerType(0, null);
                    photoViewer3.f33552n4 = 0;
                    photoViewer3.b2(this.f41624c);
                    photoViewer3.f33470e0.setScaleX(1.0f);
                    photoViewer3.f33470e0.setScaleY(1.0f);
                    MediaController.B().F0();
                    if (photoViewer3.f33627v7 && !photoViewer3.f33637w7 && (arrayList2 = photoViewer3.f33494g7) != null) {
                        int size2 = arrayList2.size();
                        while (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            if (obj2 instanceof org.telegram.messenger.ef) {
                                ((org.telegram.messenger.ef) obj2).h();
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
