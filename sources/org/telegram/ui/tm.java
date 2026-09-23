package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class tm extends mu0 {
    public final ArrayList f37714a;
    public final int[] f37715b = new int[2];
    public final xn f37716c;

    public tm(xn xnVar, ArrayList arrayList) {
        this.f37716c = xnVar;
        this.f37714a = arrayList;
    }

    @Override
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        xn xnVar = this.f37716c;
        if (xnVar.f39596x0 != null && i10 >= 0) {
            ArrayList arrayList = this.f37714a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = xnVar.f39596x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = xnVar.f39596x0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.t1;
                    int[] iArr = this.f37715b;
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
                        wu0 wu0Var = new wu0();
                        wu0Var.f39095b = iArr[0];
                        wu0Var.f39096c = iArr[1];
                        wu0Var.d = xnVar.f39596x0;
                        wu0Var.f39094a = imageReceiver;
                        wu0Var.e = imageReceiver.getBitmapSafe();
                        wu0Var.h = imageReceiver.getRoundRadius(true);
                        wu0Var.f39100j = (int) ((xnVar.f39541s9 - xnVar.f39566u9) - AndroidUtilities.dp(4.0f));
                        wu0Var.f39099i = (int) (xnVar.W8(org.telegram.ui.Components.s21.f27802c) + xnVar.v.c() + AndroidUtilities.dp(9.0f) + xnVar.Aa + xnVar.f39530rc);
                        return wu0Var;
                    }
                }
            }
        }
        return null;
    }
}
