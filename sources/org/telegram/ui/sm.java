package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class sm extends au0 {
    public final ArrayList f41325a;
    public final int[] f41326b = new int[2];
    public final xn f41327c;

    public sm(xn xnVar, ArrayList arrayList) {
        this.f41327c = xnVar;
        this.f41325a = arrayList;
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        xn xnVar = this.f41327c;
        if (xnVar.f43362u0 != null && i10 >= 0) {
            ArrayList arrayList = this.f41325a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = xnVar.f43362u0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = xnVar.f43362u0.getChildAt(i11);
                    boolean z11 = childAt instanceof org.telegram.ui.Cells.t1;
                    int[] iArr = this.f41326b;
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
                        lu0 lu0Var = new lu0();
                        lu0Var.f38865b = iArr[0];
                        lu0Var.f38866c = iArr[1];
                        lu0Var.d = xnVar.f43362u0;
                        lu0Var.f38864a = imageReceiver;
                        lu0Var.f38867e = imageReceiver.getBitmapSafe();
                        lu0Var.h = imageReceiver.getRoundRadius(true);
                        lu0Var.f38871j = (int) ((xnVar.f43310p9 - xnVar.f43336r9) - AndroidUtilities.dp(4.0f));
                        lu0Var.f38870i = (int) (xnVar.W8(org.telegram.ui.Components.t21.f31255c) + xnVar.v.c() + AndroidUtilities.dp(9.0f) + xnVar.f43413xa + xnVar.f43313pc);
                        return lu0Var;
                    }
                }
            }
        }
        return null;
    }
}
