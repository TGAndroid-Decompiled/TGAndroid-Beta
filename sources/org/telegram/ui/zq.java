package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class zq implements q0.a {
    public final int f45301a;

    public zq(int i10) {
        this.f45301a = i10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        boolean z11;
        long j10;
        boolean z12 = true;
        switch (this.f45301a) {
            case 0:
                TLRPC.User user = (TLRPC.User) obj;
                return;
            case 1:
                View view = (View) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f26252m1;
                if (view instanceof org.telegram.ui.Cells.r5) {
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
                    if (r5Var.getPhotoEntry() != null && r5Var.getPhotoEntry().hasSpoiler) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    r5Var.c(z10, Float.valueOf(250.0f));
                    if (r5Var.getPhotoEntry() != null && r5Var.getPhotoEntry().isHighQuality()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    r5Var.setHighQuality(z11);
                    if (r5Var.getPhotoEntry() != null) {
                        j10 = r5Var.getPhotoEntry().starsAmount;
                    } else {
                        j10 = 0;
                    }
                    if (ChatAttachAlertPhotoLayout.f26254o1.size() <= 1) {
                        z12 = false;
                    }
                    r5Var.f(j10, z12);
                    return;
                }
                return;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.dn0) {
                    ((org.telegram.ui.Components.dn0) view2).a(false, true);
                    return;
                }
                return;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.dn0) {
                    ((org.telegram.ui.Components.dn0) view3).a(false, true);
                    return;
                }
                return;
        }
    }
}
