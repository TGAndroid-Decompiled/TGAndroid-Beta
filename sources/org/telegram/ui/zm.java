package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class zm extends wu0 {
    public final ArrayList f44881a;
    public final int[] f44882b = new int[2];
    public final eo f44883c;

    public zm(eo eoVar, ArrayList arrayList) {
        this.f44883c = eoVar;
        this.f44881a = arrayList;
    }

    @Override
    public final gv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        eo eoVar = this.f44883c;
        if (eoVar.f37483x0 != null && i10 >= 0) {
            ArrayList arrayList = this.f44881a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = eoVar.f37483x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = eoVar.f37483x0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.u1;
                    int[] iArr = this.f44882b;
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
                        gv0 gv0Var = new gv0();
                        gv0Var.f38148b = iArr[0];
                        gv0Var.f38149c = iArr[1];
                        gv0Var.d = eoVar.f37483x0;
                        gv0Var.f38147a = imageReceiver;
                        gv0Var.f38150e = imageReceiver.getBitmapSafe();
                        gv0Var.h = imageReceiver.getRoundRadius(true);
                        gv0Var.f38154j = (int) ((eoVar.f37427s9 - eoVar.f37452u9) - AndroidUtilities.dp(4.0f));
                        gv0Var.f38153i = (int) (eoVar.b9(org.telegram.ui.Components.d41.f25232c) + eoVar.v.d() + AndroidUtilities.dp(9.0f) + eoVar.Ba + eoVar.f37430sc);
                        return gv0Var;
                    }
                }
            }
        }
        return null;
    }
}
