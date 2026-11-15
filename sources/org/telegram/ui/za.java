package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class za extends mq0 {
    public final lb f53882a;

    public za(lb lbVar) {
        this.f53882a = lbVar;
    }

    @Override
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t0 t0Var;
        org.telegram.messenger.gj messageObject;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.gj messageObject2;
        lb lbVar = this.f53882a;
        int childCount = lbVar.f48954w.getChildCount();
        int i10 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i10 >= childCount) {
                return null;
            }
            View childAt = lbVar.f48954w.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                if (gjVar != null && (messageObject2 = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject2.e1() == gjVar.e1()) {
                    imageReceiver = q1Var.getPhotoImage();
                }
            } else if ((childAt instanceof org.telegram.ui.Cells.t0) && (messageObject = (t0Var = (org.telegram.ui.Cells.t0) childAt).getMessageObject()) != null) {
                if (gjVar != null) {
                    if (messageObject.e1() == gjVar.e1()) {
                        imageReceiver = t0Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject.f23839p0 != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= messageObject.f23839p0.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = ((TLRPC.PhotoSize) messageObject.f23839p0.get(i11)).location;
                        if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                            imageReceiver = t0Var.getPhotoImage();
                            break;
                        }
                        i11++;
                    }
                }
            }
            if (imageReceiver != null) {
                int[] iArr = new int[2];
                childAt.getLocationInWindow(iArr);
                uq0 uq0Var = new uq0();
                uq0Var.f51998b = iArr[0];
                uq0Var.f51999c = iArr[1];
                uq0Var.d = lbVar.f48954w;
                uq0Var.f51997a = imageReceiver;
                uq0Var.f52000e = imageReceiver.p();
                uq0Var.h = imageReceiver.E();
                uq0Var.f52006l = true;
                return uq0Var;
            }
            i10++;
        }
    }
}
