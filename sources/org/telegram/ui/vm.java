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
    public final ArrayList f43120a;
    public final int[] f43121b = new int[2];
    public final zn f43122c;

    public vm(zn znVar, ArrayList arrayList) {
        this.f43122c = znVar;
        this.f43120a = arrayList;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        zn znVar = this.f43122c;
        if (znVar.f45023x0 != null && i10 >= 0) {
            ArrayList arrayList = this.f43120a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = znVar.f45023x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = znVar.f45023x0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.u1;
                    int[] iArr = this.f43121b;
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
                        dv0Var.f37148b = iArr[0];
                        dv0Var.f37149c = iArr[1];
                        dv0Var.d = znVar.f45023x0;
                        dv0Var.f37147a = imageReceiver;
                        dv0Var.f37150e = imageReceiver.getBitmapSafe();
                        dv0Var.h = imageReceiver.getRoundRadius(true);
                        dv0Var.f37154j = (int) ((znVar.f44967s9 - znVar.f44992u9) - AndroidUtilities.dp(4.0f));
                        dv0Var.f37153i = (int) (znVar.b9(org.telegram.ui.Components.z31.f33557c) + znVar.v.d() + AndroidUtilities.dp(9.0f) + znVar.Ba + znVar.f44970sc);
                        return dv0Var;
                    }
                }
            }
        }
        return null;
    }
}
