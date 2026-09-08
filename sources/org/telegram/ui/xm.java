package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class xm extends su0 {
    public final ArrayList f42787a;
    public final int[] f42788b = new int[2];
    public final co f42789c;

    public xm(co coVar, ArrayList arrayList) {
        this.f42789c = coVar;
        this.f42787a = arrayList;
    }

    @Override
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        co coVar = this.f42789c;
        if (coVar.f35500x0 != null && i10 >= 0) {
            ArrayList arrayList = this.f42787a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = coVar.f35500x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = coVar.f35500x0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.t1;
                    int[] iArr = this.f42788b;
                    if (z12 && (messageObject2 = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && (richMessageLayout = messageObject2.richLayout) != null) {
                        int[] iArr2 = new int[2];
                        imageReceiver = richMessageLayout.findMediaImageReceiver(pageBlock, iArr2);
                        if (imageReceiver != null) {
                            childAt.getLocationInWindow(iArr);
                            iArr[0] = t1Var.getTextX() + iArr2[0] + iArr[0];
                            iArr[1] = t1Var.getTextY() + iArr2[1] + iArr[1];
                        }
                    } else {
                        imageReceiver = null;
                    }
                    if (imageReceiver != null) {
                        cv0 cv0Var = new cv0();
                        cv0Var.f35568b = iArr[0];
                        cv0Var.f35569c = iArr[1];
                        cv0Var.d = coVar.f35500x0;
                        cv0Var.f35567a = imageReceiver;
                        cv0Var.f35570e = imageReceiver.getBitmapSafe();
                        cv0Var.h = imageReceiver.getRoundRadius(true);
                        cv0Var.f35574j = (int) ((coVar.f35445s9 - coVar.f35470u9) - AndroidUtilities.dp(4.0f));
                        cv0Var.f35573i = (int) (coVar.W8(org.telegram.ui.Components.s21.f30205c) + coVar.v.c() + AndroidUtilities.dp(9.0f) + coVar.Aa + coVar.f35448sc);
                        return cv0Var;
                    }
                }
            }
        }
        return null;
    }
}
