package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class rm extends iu0 {
    public final ArrayList f43084a;
    public final int[] f43085b = new int[2];
    public final wn f43086c;

    public rm(wn wnVar, ArrayList arrayList) {
        this.f43086c = wnVar;
        this.f43084a = arrayList;
    }

    @Override
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        wn wnVar = this.f43086c;
        if (wnVar.f45339x0 != null && i10 >= 0) {
            ArrayList arrayList = this.f43084a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = wnVar.f45339x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = wnVar.f45339x0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.s1;
                    int[] iArr = this.f43085b;
                    if (z12 && (messageObject2 = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && (richMessageLayout = messageObject2.richLayout) != null) {
                        int[] iArr2 = new int[2];
                        imageReceiver = richMessageLayout.findMediaImageReceiver(pageBlock, iArr2);
                        if (imageReceiver != null) {
                            childAt.getLocationInWindow(iArr);
                            iArr[0] = s1Var.getTextX() + iArr2[0] + iArr[0];
                            iArr[1] = s1Var.getTextY() + iArr2[1] + iArr[1];
                        }
                    } else {
                        imageReceiver = null;
                    }
                    if (imageReceiver != null) {
                        su0 su0Var = new su0();
                        su0Var.f43407b = iArr[0];
                        su0Var.f43408c = iArr[1];
                        su0Var.d = wnVar.f45339x0;
                        su0Var.f43406a = imageReceiver;
                        su0Var.e = imageReceiver.getBitmapSafe();
                        su0Var.h = imageReceiver.getRoundRadius(true);
                        su0Var.f43412j = (int) ((wnVar.I9 - wnVar.K9) - AndroidUtilities.dp(4.0f));
                        su0Var.f43411i = (int) (wnVar.j9(org.telegram.ui.Components.b41.f26732c) + wnVar.v.d() + AndroidUtilities.dp(9.0f) + wnVar.Ra + wnVar.Tc);
                        return su0Var;
                    }
                }
            }
        }
        return null;
    }
}
