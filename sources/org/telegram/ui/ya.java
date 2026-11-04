package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ya extends eq0 {
    public final kb f52236a;

    public ya(kb kbVar) {
        this.f52236a = kbVar;
    }

    @Override
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t0 t0Var;
        org.telegram.messenger.zi messageObject;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.zi messageObject2;
        kb kbVar = this.f52236a;
        int childCount = kbVar.f46885w.getChildCount();
        int i10 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i10 >= childCount) {
                return null;
            }
            View childAt = kbVar.f46885w.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                if (ziVar != null && (messageObject2 = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject2.f1() == ziVar.f1()) {
                    imageReceiver = q1Var.getPhotoImage();
                }
            } else if ((childAt instanceof org.telegram.ui.Cells.t0) && (messageObject = (t0Var = (org.telegram.ui.Cells.t0) childAt).getMessageObject()) != null) {
                if (ziVar != null) {
                    if (messageObject.f1() == ziVar.f1()) {
                        imageReceiver = t0Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject.f26878n0 != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= messageObject.f26878n0.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = ((TLRPC.PhotoSize) messageObject.f26878n0.get(i11)).location;
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
                mq0 mq0Var = new mq0();
                mq0Var.f47752b = iArr[0];
                mq0Var.f47753c = iArr[1];
                mq0Var.d = kbVar.f46885w;
                mq0Var.f47751a = imageReceiver;
                mq0Var.f47754e = imageReceiver.p();
                mq0Var.h = imageReceiver.E();
                mq0Var.f47760l = true;
                return mq0Var;
            }
            i10++;
        }
    }
}
