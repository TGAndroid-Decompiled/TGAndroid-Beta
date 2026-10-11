package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
public final class uc0 extends gg.s0 {
    public boolean m0;
    public final gd0 f42558n0;

    public uc0(gd0 gd0Var, Context context, int i10, long j3, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(context, i10, j3, false, d6Var, false, z10, z11);
        this.f42558n0 = gd0Var;
        this.m0 = true;
    }

    @Override
    public final void K() {
        this.f42558n0.q0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i10;
        gd0 gd0Var = this.f42558n0;
        MessageObject messageObject = gd0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            int i11 = 0;
            if (arrayList != null) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    ad0 ad0Var = (ad0) arrayList.get(i12);
                    if (ad0Var != null && !UserObject.isUserSelf(ad0Var.f36075c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                gd0Var.f38060i0 = ((ad0) arrayList.get(0)).f36073a;
            }
            this.m0 = false;
            org.telegram.ui.ActionBar.u0 u0Var = gd0Var.Z;
            if (i10 != 1) {
                i11 = 8;
            }
            u0Var.setVisibility(i11);
        }
        super.N(arrayList);
    }
}
