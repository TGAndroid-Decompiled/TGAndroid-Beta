package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class qr0 implements Runnable {
    public final int f39527a;
    public final PhotoViewer f39528b;
    public final kv0 f39529c;

    public qr0(PhotoViewer photoViewer, kv0 kv0Var, int i10) {
        this.f39527a = i10;
        this.f39528b = photoViewer;
        this.f39529c = kv0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f39527a) {
            case 0:
                PhotoViewer photoViewer = this.f39528b;
                photoViewer.f32252h0.setImageBitmap(null);
                kv0 kv0Var = this.f39529c;
                if (kv0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = kv0Var.f37760m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f32243g0.getParent() != null) {
                        ((WindowManager) photoViewer.f32405y.getSystemService("window")).removeView(photoViewer.f32243g0);
                        photoViewer.W1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f39528b;
                photoViewer2.f32326p4 = null;
                int i10 = 0;
                photoViewer2.f32226e0.setLayerType(0, null);
                photoViewer2.f32308n4 = 0;
                photoViewer2.G1();
                photoViewer2.Y1(this.f39529c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f32383v7 && !photoViewer2.f32393w7 && (arrayList = photoViewer2.f32250g7) != null) {
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
                PhotoViewer photoViewer3 = this.f39528b;
                photoViewer3.f32326p4 = null;
                cv0 cv0Var = photoViewer3.f32226e0;
                if (cv0Var != null) {
                    int i11 = 0;
                    cv0Var.setLayerType(0, null);
                    photoViewer3.f32308n4 = 0;
                    photoViewer3.Y1(this.f39529c);
                    photoViewer3.f32226e0.setScaleX(1.0f);
                    photoViewer3.f32226e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f32383v7 && !photoViewer3.f32393w7 && (arrayList2 = photoViewer3.f32250g7) != null) {
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
