package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class wm extends tu0 {
    public final ArrayList f39258a;
    public final int[] f39259b = new int[2];
    public final bo f39260c;

    public wm(bo boVar, ArrayList arrayList) {
        this.f39260c = boVar;
        this.f39258a = arrayList;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        bo boVar = this.f39260c;
        if (boVar.f32519x0 != null && i10 >= 0) {
            ArrayList arrayList = this.f39258a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = boVar.f32519x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = boVar.f32519x0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.t1;
                    int[] iArr = this.f39259b;
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
                        dv0 dv0Var = new dv0();
                        dv0Var.f33097b = iArr[0];
                        dv0Var.f33098c = iArr[1];
                        dv0Var.d = boVar.f32519x0;
                        dv0Var.f33096a = imageReceiver;
                        dv0Var.e = imageReceiver.getBitmapSafe();
                        dv0Var.h = imageReceiver.getRoundRadius(true);
                        dv0Var.f33102j = (int) ((boVar.f32464s9 - boVar.f32489u9) - AndroidUtilities.dp(4.0f));
                        dv0Var.f33101i = (int) (boVar.W8(org.telegram.ui.Components.t21.f28041c) + boVar.v.c() + AndroidUtilities.dp(9.0f) + boVar.Aa + boVar.f32453rc);
                        return dv0Var;
                    }
                }
            }
        }
        return null;
    }
}
