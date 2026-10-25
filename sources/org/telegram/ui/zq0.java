package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class zq0 implements Runnable {
    public final int f46346a;
    public final PhotoViewer f46347b;
    public final qu0 f46348c;

    public zq0(PhotoViewer photoViewer, qu0 qu0Var, int i10) {
        this.f46346a = i10;
        this.f46347b = photoViewer;
        this.f46348c = qu0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f46346a) {
            case 0:
                PhotoViewer photoViewer = this.f46347b;
                photoViewer.f35669h0.setImageBitmap(null);
                qu0 qu0Var = this.f46348c;
                if (qu0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = qu0Var.f42925m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f35661g0.getParent() != null) {
                        ((WindowManager) photoViewer.f35822y.getSystemService("window")).removeView(photoViewer.f35661g0);
                        photoViewer.Y1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f46347b;
                photoViewer2.f35743p4 = null;
                int i10 = 0;
                photoViewer2.f35643e0.setLayerType(0, null);
                photoViewer2.f35725n4 = 0;
                photoViewer2.H1();
                photoViewer2.a2(this.f46348c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f35800v7 && !photoViewer2.f35810w7 && (arrayList = photoViewer2.g7) != null) {
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
                PhotoViewer photoViewer3 = this.f46347b;
                photoViewer3.f35743p4 = null;
                iu0 iu0Var = photoViewer3.f35643e0;
                if (iu0Var != null) {
                    int i11 = 0;
                    iu0Var.setLayerType(0, null);
                    photoViewer3.f35725n4 = 0;
                    photoViewer3.a2(this.f46348c);
                    photoViewer3.f35643e0.setScaleX(1.0f);
                    photoViewer3.f35643e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f35800v7 && !photoViewer3.f35810w7 && (arrayList2 = photoViewer3.g7) != null) {
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
