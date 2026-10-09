package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class vm extends uu0 {
    public final ArrayList f42902a;
    public final int[] f42903b = new int[2];
    public final zn f42904c;

    public vm(zn znVar, ArrayList arrayList) {
        this.f42904c = znVar;
        this.f42902a = arrayList;
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        zn znVar = this.f42904c;
        if (znVar.f44990x0 != null && i10 >= 0) {
            ArrayList arrayList = this.f42902a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = znVar.f44990x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = znVar.f44990x0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.u1;
                    int[] iArr = this.f42903b;
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
                        ev0 ev0Var = new ev0();
                        ev0Var.f37357b = iArr[0];
                        ev0Var.f37358c = iArr[1];
                        ev0Var.d = znVar.f44990x0;
                        ev0Var.f37356a = imageReceiver;
                        ev0Var.f37359e = imageReceiver.getBitmapSafe();
                        ev0Var.h = imageReceiver.getRoundRadius(true);
                        ev0Var.f37363j = (int) ((znVar.f44934s9 - znVar.f44959u9) - AndroidUtilities.dp(4.0f));
                        ev0Var.f37362i = (int) (znVar.b9(org.telegram.ui.Components.y31.f33117c) + znVar.v.d() + AndroidUtilities.dp(9.0f) + znVar.Ba + znVar.f44937sc);
                        return ev0Var;
                    }
                }
            }
        }
        return null;
    }
}
