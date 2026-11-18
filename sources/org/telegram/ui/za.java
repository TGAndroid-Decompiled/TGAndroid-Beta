package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class za extends oq0 {
    public final lb f54466a;

    public za(lb lbVar) {
        this.f54466a = lbVar;
    }

    @Override
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Cells.u0 u0Var;
        org.telegram.messenger.fj messageObject;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.fj messageObject2;
        lb lbVar = this.f54466a;
        int childCount = lbVar.f49555w.getChildCount();
        int i10 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i10 >= childCount) {
                return null;
            }
            View childAt = lbVar.f49555w.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                if (fjVar != null && (messageObject2 = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject2.e1() == fjVar.e1()) {
                    imageReceiver = q1Var.getPhotoImage();
                }
            } else if ((childAt instanceof org.telegram.ui.Cells.u0) && (messageObject = (u0Var = (org.telegram.ui.Cells.u0) childAt).getMessageObject()) != null) {
                if (fjVar != null) {
                    if (messageObject.e1() == fjVar.e1()) {
                        imageReceiver = u0Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject.f23988p0 != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= messageObject.f23988p0.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = ((TLRPC.PhotoSize) messageObject.f23988p0.get(i11)).location;
                        if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                            imageReceiver = u0Var.getPhotoImage();
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
                wq0Var.f53497b = iArr[0];
                wq0Var.f53498c = iArr[1];
                wq0Var.d = lbVar.f49555w;
                wq0Var.f53496a = imageReceiver;
                wq0Var.f53499e = imageReceiver.p();
                wq0Var.h = imageReceiver.E();
                wq0Var.f53505l = true;
                return wq0Var;
            }
            i10++;
        }
    }
}
