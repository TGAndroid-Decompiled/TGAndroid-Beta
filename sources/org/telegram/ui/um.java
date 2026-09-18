package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class um extends tu0 {
    public final ArrayList f38027a;
    public final int[] f38028b = new int[2];
    public final zn f38029c;

    public um(zn znVar, ArrayList arrayList) {
        this.f38029c = znVar;
        this.f38027a = arrayList;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        zn znVar = this.f38029c;
        if (znVar.f40488x0 != null && i10 >= 0) {
            ArrayList arrayList = this.f38027a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = znVar.f40488x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = znVar.f40488x0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.u1;
                    int[] iArr = this.f38028b;
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
                        dv0 dv0Var = new dv0();
                        dv0Var.f33093b = iArr[0];
                        dv0Var.f33094c = iArr[1];
                        dv0Var.d = znVar.f40488x0;
                        dv0Var.f33092a = imageReceiver;
                        dv0Var.e = imageReceiver.getBitmapSafe();
                        dv0Var.h = imageReceiver.getRoundRadius(true);
                        dv0Var.f33098j = (int) ((znVar.f40433s9 - znVar.f40458u9) - AndroidUtilities.dp(4.0f));
                        dv0Var.f33097i = (int) (znVar.W8(org.telegram.ui.Components.i31.f24833c) + znVar.v.c() + AndroidUtilities.dp(9.0f) + znVar.Aa + znVar.f40422rc);
                        return dv0Var;
                    }
                }
            }
        }
        return null;
    }
}
