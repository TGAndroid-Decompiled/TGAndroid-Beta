package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class za extends pq0 {
    public final lb f54475a;

    public za(lb lbVar) {
        this.f54475a = lbVar;
    }

    @Override
    public final xq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Cells.v0 v0Var;
        org.telegram.messenger.gj messageObject;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.gj messageObject2;
        lb lbVar = this.f54475a;
        int childCount = lbVar.f49548w.getChildCount();
        int i10 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i10 >= childCount) {
                return null;
            }
            View childAt = lbVar.f49548w.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.r1) {
                if (gjVar != null && (messageObject2 = (r1Var = (org.telegram.ui.Cells.r1) childAt).getMessageObject()) != null && messageObject2.e1() == gjVar.e1()) {
                    imageReceiver = r1Var.getPhotoImage();
                }
            } else if ((childAt instanceof org.telegram.ui.Cells.v0) && (messageObject = (v0Var = (org.telegram.ui.Cells.v0) childAt).getMessageObject()) != null) {
                if (gjVar != null) {
                    if (messageObject.e1() == gjVar.e1()) {
                        imageReceiver = v0Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject.f24197p0 != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= messageObject.f24197p0.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = ((TLRPC.PhotoSize) messageObject.f24197p0.get(i11)).location;
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
                xq0 xq0Var = new xq0();
                xq0Var.f53899b = iArr[0];
                xq0Var.f53900c = iArr[1];
                xq0Var.d = lbVar.f49548w;
                xq0Var.f53898a = imageReceiver;
                xq0Var.f53901e = imageReceiver.p();
                xq0Var.h = imageReceiver.E();
                xq0Var.f53907l = true;
                return xq0Var;
            }
            i10++;
        }
    }
}
