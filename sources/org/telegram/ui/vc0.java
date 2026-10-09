package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
public final class vc0 extends gg.s0 {
    public boolean m0;
    public final hd0 f42824n0;

    public vc0(hd0 hd0Var, Context context, int i10, long j3, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context, i10, j3, false, e6Var, false, z10, z11);
        this.f42824n0 = hd0Var;
        this.m0 = true;
    }

    @Override
    public final void K() {
        this.f42824n0.q0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i10;
        hd0 hd0Var = this.f42824n0;
        MessageObject messageObject = hd0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            int i11 = 0;
            if (arrayList != null) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    bd0 bd0Var = (bd0) arrayList.get(i12);
                    if (bd0Var != null && !UserObject.isUserSelf(bd0Var.f36284c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                hd0Var.f38268i0 = ((bd0) arrayList.get(0)).f36282a;
            }
            this.m0 = false;
            org.telegram.ui.ActionBar.v0 v0Var = hd0Var.Z;
            if (i10 != 1) {
                i11 = 8;
            }
            v0Var.setVisibility(i11);
        }
        super.N(arrayList);
    }
}
