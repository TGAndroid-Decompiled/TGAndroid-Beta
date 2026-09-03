package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class um extends fu0 {
    public final ArrayList f38888a;
    public final int[] f38889b = new int[2];
    public final zn f38890c;

    public um(zn znVar, ArrayList arrayList) {
        this.f38890c = znVar;
        this.f38888a = arrayList;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        zn znVar = this.f38890c;
        if (znVar.f40759u0 != null && i10 >= 0) {
            ArrayList arrayList = this.f38888a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = znVar.f40759u0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = znVar.f40759u0.getChildAt(i11);
                    boolean z11 = childAt instanceof org.telegram.ui.Cells.s1;
                    int[] iArr = this.f38889b;
                    if (z11 && (messageObject2 = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && (richMessageLayout = messageObject2.richLayout) != null) {
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
                        qu0 qu0Var = new qu0();
                        qu0Var.f37488b = iArr[0];
                        qu0Var.f37489c = iArr[1];
                        qu0Var.d = znVar.f40759u0;
                        qu0Var.f37487a = imageReceiver;
                        qu0Var.e = imageReceiver.getBitmapSafe();
                        qu0Var.h = imageReceiver.getRoundRadius(true);
                        qu0Var.f37493j = (int) ((znVar.f40707p9 - znVar.f40733r9) - AndroidUtilities.dp(4.0f));
                        qu0Var.f37492i = (int) (znVar.W8(org.telegram.ui.Components.s21.f28657c) + znVar.v.c() + AndroidUtilities.dp(9.0f) + znVar.f40810xa + znVar.f40710pc);
                        return qu0Var;
                    }
                }
            }
        }
        return null;
    }
}
