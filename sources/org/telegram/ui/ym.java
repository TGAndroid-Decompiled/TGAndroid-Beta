package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ym extends tu0 {
    public final ArrayList f39028a;
    public final int[] f39029b = new int[2];
    public final eo f39030c;

    public ym(eo eoVar, ArrayList arrayList) {
        this.f39030c = eoVar;
        this.f39028a = arrayList;
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        eo eoVar = this.f39030c;
        if (eoVar.f32542x0 != null && i10 >= 0) {
            ArrayList arrayList = this.f39028a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = eoVar.f32542x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = eoVar.f32542x0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.t1;
                    int[] iArr = this.f39029b;
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
                        ev0 ev0Var = new ev0();
                        ev0Var.f32617b = iArr[0];
                        ev0Var.f32618c = iArr[1];
                        ev0Var.d = eoVar.f32542x0;
                        ev0Var.f32616a = imageReceiver;
                        ev0Var.e = imageReceiver.getBitmapSafe();
                        ev0Var.h = imageReceiver.getRoundRadius(true);
                        ev0Var.f32622j = (int) ((eoVar.f32487s9 - eoVar.f32512u9) - AndroidUtilities.dp(4.0f));
                        ev0Var.f32621i = (int) (eoVar.W8(org.telegram.ui.Components.g31.f23231c) + eoVar.v.c() + AndroidUtilities.dp(9.0f) + eoVar.Aa + eoVar.f32490sc);
                        return ev0Var;
                    }
                }
            }
        }
        return null;
    }
}
