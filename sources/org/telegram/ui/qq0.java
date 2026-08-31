package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class qq0 implements Runnable {
    public final int f40596a;
    public final PhotoViewer f40597b;
    public final lu0 f40598c;

    public qq0(PhotoViewer photoViewer, lu0 lu0Var, int i10) {
        this.f40596a = i10;
        this.f40597b = photoViewer;
        this.f40598c = lu0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f40596a) {
            case 0:
                PhotoViewer photoViewer = this.f40597b;
                photoViewer.f34258e0.setImageBitmap(null);
                lu0 lu0Var = this.f40598c;
                if (lu0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = lu0Var.f38874m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f34248d0.getParent() != null) {
                        ((WindowManager) photoViewer.f34439y.getSystemService("window")).removeView(photoViewer.f34248d0);
                        photoViewer.V1();
                        return;
                    }
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f40597b;
                photoViewer2.f34332m4 = null;
                int i10 = 0;
                photoViewer2.f34230b0.setLayerType(0, null);
                photoViewer2.f34316k4 = 0;
                photoViewer2.F1();
                photoViewer2.X1(this.f40598c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f34391s7 && !photoViewer2.f34399t7 && (arrayList = photoViewer2.f34255d7) != null) {
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
                PhotoViewer photoViewer3 = this.f40597b;
                photoViewer3.f34332m4 = null;
                du0 du0Var = photoViewer3.f34230b0;
                if (du0Var != null) {
                    int i11 = 0;
                    du0Var.setLayerType(0, null);
                    photoViewer3.f34316k4 = 0;
                    photoViewer3.X1(this.f40598c);
                    photoViewer3.f34230b0.setScaleX(1.0f);
                    photoViewer3.f34230b0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f34391s7 && !photoViewer3.f34399t7 && (arrayList2 = photoViewer3.f34255d7) != null) {
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
