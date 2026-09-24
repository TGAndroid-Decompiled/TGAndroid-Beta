package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class sm extends lu0 {
    public final ArrayList f37809a;
    public final int[] f37810b = new int[2];
    public final wn f37811c;

    public sm(wn wnVar, ArrayList arrayList) {
        this.f37811c = wnVar;
        this.f37809a = arrayList;
    }

    @Override
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        wn wnVar = this.f37811c;
        if (wnVar.f39680x0 != null && i10 >= 0) {
            ArrayList arrayList = this.f37809a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = wnVar.f39680x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = wnVar.f39680x0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.u1;
                    int[] iArr = this.f37810b;
                    if (z12 && (messageObject2 = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && (richMessageLayout = messageObject2.richLayout) != null) {
                        int[] iArr2 = new int[2];
                        imageReceiver = richMessageLayout.findMediaImageReceiver(pageBlock, iArr2);
                        if (imageReceiver != null) {
                            childAt.getLocationInWindow(iArr);
                            iArr[0] = u1Var.getTextX() + iArr2[0] + iArr[0];
                            iArr[1] = u1Var.getTextY() + iArr2[1] + iArr[1];
                        }
                    } else {
                        imageReceiver = null;
                    }
                    if (imageReceiver != null) {
                        vu0 vu0Var = new vu0();
                        vu0Var.f38805b = iArr[0];
                        vu0Var.f38806c = iArr[1];
                        vu0Var.d = wnVar.f39680x0;
                        vu0Var.f38804a = imageReceiver;
                        vu0Var.e = imageReceiver.getBitmapSafe();
                        vu0Var.h = imageReceiver.getRoundRadius(true);
                        vu0Var.f38810j = (int) ((wnVar.f39625s9 - wnVar.f39650u9) - AndroidUtilities.dp(4.0f));
                        vu0Var.f38809i = (int) (wnVar.W8(org.telegram.ui.Components.g31.f24343c) + wnVar.v.c() + AndroidUtilities.dp(9.0f) + wnVar.Aa + wnVar.f39614rc);
                        return vu0Var;
                    }
                }
            }
        }
        return null;
    }
}
