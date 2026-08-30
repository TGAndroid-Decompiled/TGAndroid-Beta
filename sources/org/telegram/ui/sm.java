package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class sm extends yt0 {
    public final ArrayList f38406a;
    public final int[] f38407b = new int[2];
    public final xn f38408c;

    public sm(xn xnVar, ArrayList arrayList) {
        this.f38408c = xnVar;
        this.f38406a = arrayList;
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        xn xnVar = this.f38408c;
        if (xnVar.f40193u0 != null && i10 >= 0) {
            ArrayList arrayList = this.f38406a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = xnVar.f40193u0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = xnVar.f40193u0.getChildAt(i11);
                    boolean z11 = childAt instanceof org.telegram.ui.Cells.t1;
                    int[] iArr = this.f38407b;
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
                        ju0 ju0Var = new ju0();
                        ju0Var.f35496b = iArr[0];
                        ju0Var.f35497c = iArr[1];
                        ju0Var.d = xnVar.f40193u0;
                        ju0Var.f35495a = imageReceiver;
                        ju0Var.e = imageReceiver.getBitmapSafe();
                        ju0Var.h = imageReceiver.getRoundRadius(true);
                        ju0Var.f35501j = (int) ((xnVar.f40141p9 - xnVar.f40167r9) - AndroidUtilities.dp(4.0f));
                        ju0Var.f35500i = (int) (xnVar.W8(org.telegram.ui.Components.s21.f28616c) + xnVar.v.c() + AndroidUtilities.dp(9.0f) + xnVar.f40244xa + xnVar.f40144pc);
                        return ju0Var;
                    }
                }
            }
        }
        return null;
    }
}
