package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class vq0 implements Runnable {
    public final int f39167a;
    public final PhotoViewer f39168b;
    public final qu0 f39169c;

    public vq0(PhotoViewer photoViewer, qu0 qu0Var, int i10) {
        this.f39167a = i10;
        this.f39168b = photoViewer;
        this.f39169c = qu0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f39167a) {
            case 0:
                PhotoViewer photoViewer = this.f39168b;
                photoViewer.f31706e0.setImageBitmap(null);
                qu0 qu0Var = this.f39169c;
                if (qu0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = qu0Var.f37496m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f31697d0.getParent() != null) {
                        ((WindowManager) photoViewer.f31887y.getSystemService("window")).removeView(photoViewer.f31697d0);
                        photoViewer.V1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f39168b;
                photoViewer2.f31780m4 = null;
                int i10 = 0;
                photoViewer2.f31679b0.setLayerType(0, null);
                photoViewer2.f31764k4 = 0;
                photoViewer2.F1();
                photoViewer2.X1(this.f39169c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f31839s7 && !photoViewer2.f31847t7 && (arrayList = photoViewer2.f31704d7) != null) {
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
                PhotoViewer photoViewer3 = this.f39168b;
                photoViewer3.f31780m4 = null;
                iu0 iu0Var = photoViewer3.f31679b0;
                if (iu0Var != null) {
                    int i11 = 0;
                    iu0Var.setLayerType(0, null);
                    photoViewer3.f31764k4 = 0;
                    photoViewer3.X1(this.f39169c);
                    photoViewer3.f31679b0.setScaleX(1.0f);
                    photoViewer3.f31679b0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f31839s7 && !photoViewer3.f31847t7 && (arrayList2 = photoViewer3.f31704d7) != null) {
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
