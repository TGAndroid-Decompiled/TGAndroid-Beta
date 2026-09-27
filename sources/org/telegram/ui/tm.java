package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class tm extends ou0 {
    public final ArrayList f37866a;
    public final int[] f37867b = new int[2];
    public final xn f37868c;

    public tm(xn xnVar, ArrayList arrayList) {
        this.f37868c = xnVar;
        this.f37866a = arrayList;
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        xn xnVar = this.f37868c;
        if (xnVar.f39977x0 != null && i10 >= 0) {
            ArrayList arrayList = this.f37866a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = xnVar.f39977x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = xnVar.f39977x0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.u1;
                    int[] iArr = this.f37867b;
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
                        yu0 yu0Var = new yu0();
                        yu0Var.f40326b = iArr[0];
                        yu0Var.f40327c = iArr[1];
                        yu0Var.d = xnVar.f39977x0;
                        yu0Var.f40325a = imageReceiver;
                        yu0Var.e = imageReceiver.getBitmapSafe();
                        yu0Var.h = imageReceiver.getRoundRadius(true);
                        yu0Var.f40331j = (int) ((xnVar.f39922s9 - xnVar.f39947u9) - AndroidUtilities.dp(4.0f));
                        yu0Var.f40330i = (int) (xnVar.W8(org.telegram.ui.Components.i31.f25014c) + xnVar.v.c() + AndroidUtilities.dp(9.0f) + xnVar.Aa + xnVar.f39911rc);
                        return yu0Var;
                    }
                }
            }
        }
        return null;
    }
}
