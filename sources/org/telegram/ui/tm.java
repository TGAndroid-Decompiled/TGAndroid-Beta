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
    public final ArrayList f40935a;
    public final int[] f40936b = new int[2];
    public final yn f40937c;

    public tm(yn ynVar, ArrayList arrayList) {
        this.f40937c = ynVar;
        this.f40935a = arrayList;
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        yn ynVar = this.f40937c;
        if (ynVar.f43526v0 != null && i10 >= 0) {
            ArrayList arrayList = this.f40935a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = ynVar.f43526v0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ynVar.f43526v0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.u1;
                    int[] iArr = this.f40936b;
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
                        yu0Var.f43621b = iArr[0];
                        yu0Var.f43622c = iArr[1];
                        yu0Var.d = ynVar.f43526v0;
                        yu0Var.f43620a = imageReceiver;
                        yu0Var.f43623e = imageReceiver.getBitmapSafe();
                        yu0Var.h = imageReceiver.getRoundRadius(true);
                        yu0Var.f43627j = (int) ((ynVar.f43469q9 - ynVar.f43497s9) - AndroidUtilities.dp(4.0f));
                        yu0Var.f43626i = (int) (ynVar.X8(org.telegram.ui.Components.s31.f30679c) + ynVar.v.c() + AndroidUtilities.dp(9.0f) + ynVar.f43574ya + ynVar.f43460pc);
                        return yu0Var;
                    }
                }
            }
        }
        return null;
    }
}
