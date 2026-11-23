package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class za extends oq0 {
    public final lb f54557a;

    public za(lb lbVar) {
        this.f54557a = lbVar;
    }

    @Override
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Cells.v0 v0Var;
        org.telegram.messenger.fj messageObject;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.fj messageObject2;
        lb lbVar = this.f54557a;
        int childCount = lbVar.f49707w.getChildCount();
        int i10 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i10 >= childCount) {
                return null;
            }
            View childAt = lbVar.f49707w.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.r1) {
                if (fjVar != null && (messageObject2 = (r1Var = (org.telegram.ui.Cells.r1) childAt).getMessageObject()) != null && messageObject2.e1() == fjVar.e1()) {
                    imageReceiver = r1Var.getPhotoImage();
                }
            } else if ((childAt instanceof org.telegram.ui.Cells.v0) && (messageObject = (v0Var = (org.telegram.ui.Cells.v0) childAt).getMessageObject()) != null) {
                if (fjVar != null) {
                    if (messageObject.e1() == fjVar.e1()) {
                        imageReceiver = v0Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject.f24093p0 != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= messageObject.f24093p0.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = ((TLRPC.PhotoSize) messageObject.f24093p0.get(i11)).location;
                        if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                            imageReceiver = v0Var.getPhotoImage();
                            break;
                        }
                        i11++;
                    }
                }
            }
            if (imageReceiver != null) {
                int[] iArr = new int[2];
                childAt.getLocationInWindow(iArr);
                wq0 wq0Var = new wq0();
                wq0Var.f53727b = iArr[0];
                wq0Var.f53728c = iArr[1];
                wq0Var.d = lbVar.f49707w;
                wq0Var.f53726a = imageReceiver;
                wq0Var.f53729e = imageReceiver.p();
                wq0Var.h = imageReceiver.F();
                wq0Var.f53735l = true;
                return wq0Var;
            }
            i10++;
        }
    }
}
