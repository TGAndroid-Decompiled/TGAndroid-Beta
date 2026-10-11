package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class vm extends tu0 {
    public final ArrayList f43086a;
    public final int[] f43087b = new int[2];
    public final zn f43088c;

    public vm(zn znVar, ArrayList arrayList) {
        this.f43088c = znVar;
        this.f43086a = arrayList;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        zn znVar = this.f43088c;
        if (znVar.f44989x0 != null && i10 >= 0) {
            ArrayList arrayList = this.f43086a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = znVar.f44989x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = znVar.f44989x0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.u1;
                    int[] iArr = this.f43087b;
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
                        dv0Var.f37114b = iArr[0];
                        dv0Var.f37115c = iArr[1];
                        dv0Var.d = znVar.f44989x0;
                        dv0Var.f37113a = imageReceiver;
                        dv0Var.f37116e = imageReceiver.getBitmapSafe();
                        dv0Var.h = imageReceiver.getRoundRadius(true);
                        dv0Var.f37120j = (int) ((znVar.f44933s9 - znVar.f44958u9) - AndroidUtilities.dp(4.0f));
                        dv0Var.f37119i = (int) (znVar.b9(org.telegram.ui.Components.a41.f24434c) + znVar.v.d() + AndroidUtilities.dp(9.0f) + znVar.Ba + znVar.f44936sc);
                        return dv0Var;
                    }
                }
            }
        }
        return null;
    }
}
