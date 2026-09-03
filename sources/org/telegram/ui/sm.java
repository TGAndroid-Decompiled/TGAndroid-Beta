package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class sm extends fu0 {
    public final ArrayList f41270a;
    public final int[] f41271b = new int[2];
    public final xn f41272c;

    public sm(xn xnVar, ArrayList arrayList) {
        this.f41272c = xnVar;
        this.f41270a = arrayList;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        xn xnVar = this.f41272c;
        if (xnVar.f43340u0 != null && i10 >= 0) {
            ArrayList arrayList = this.f41270a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = xnVar.f43340u0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = xnVar.f43340u0.getChildAt(i11);
                    boolean z11 = childAt instanceof org.telegram.ui.Cells.t1;
                    int[] iArr = this.f41271b;
                    if (z11 && (messageObject2 = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && (richMessageLayout = messageObject2.richLayout) != null) {
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
                        qu0 qu0Var = new qu0();
                        qu0Var.f40679b = iArr[0];
                        qu0Var.f40680c = iArr[1];
                        qu0Var.d = xnVar.f43340u0;
                        qu0Var.f40678a = imageReceiver;
                        qu0Var.f40681e = imageReceiver.getBitmapSafe();
                        qu0Var.h = imageReceiver.getRoundRadius(true);
                        qu0Var.f40685j = (int) ((xnVar.f43288p9 - xnVar.f43314r9) - AndroidUtilities.dp(4.0f));
                        qu0Var.f40684i = (int) (xnVar.W8(org.telegram.ui.Components.s21.f30977c) + xnVar.v.c() + AndroidUtilities.dp(9.0f) + xnVar.f43391xa + xnVar.f43291pc);
                        return qu0Var;
                    }
                }
            }
        }
        return null;
    }
}
