package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class za extends pt0 {
    public final ob f45118a;

    public za(ob obVar) {
        this.f45118a = obVar;
    }

    @Override
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.v0 v0Var;
        MessageObject messageObject2;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject3;
        ob obVar = this.f45118a;
        int childCount = obVar.A.getChildCount();
        int i11 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i11 >= childCount) {
                return null;
            }
            View childAt = obVar.A.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.s1) {
                if (messageObject != null && (messageObject3 = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject3.getId() == messageObject.getId()) {
                    imageReceiver = s1Var.getPhotoImage();
                }
            } else if ((childAt instanceof org.telegram.ui.Cells.v0) && (messageObject2 = (v0Var = (org.telegram.ui.Cells.v0) childAt).getMessageObject()) != null) {
                if (messageObject != null) {
                    if (messageObject2.getId() == messageObject.getId()) {
                        imageReceiver = v0Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject2.photoThumbs != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= messageObject2.photoThumbs.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = messageObject2.photoThumbs.get(i12).location;
                        if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                            imageReceiver = v0Var.getPhotoImage();
                            break;
                        }
                        i12++;
                    }
                }
            }
            if (imageReceiver != null) {
                int[] iArr = new int[2];
                childAt.getLocationInWindow(iArr);
                zt0 zt0Var = new zt0();
                zt0Var.f45317b = iArr[0];
                zt0Var.f45318c = iArr[1];
                zt0Var.d = obVar.A;
                zt0Var.f45316a = imageReceiver;
                zt0Var.f45319e = imageReceiver.getBitmapSafe();
                zt0Var.h = imageReceiver.getRoundRadius(true);
                zt0Var.f45325l = true;
                return zt0Var;
            }
            i11++;
        }
    }
}
