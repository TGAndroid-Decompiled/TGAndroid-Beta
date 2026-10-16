package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
public final class zc0 extends hg.s0 {
    public boolean m0;
    public final ld0 f42277n0;

    public zc0(ld0 ld0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context, i10, j10, false, c6Var, false, z10, z11);
        this.f42277n0 = ld0Var;
        this.m0 = true;
    }

    @Override
    public final void K() {
        this.f42277n0.q0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i10;
        ld0 ld0Var = this.f42277n0;
        MessageObject messageObject = ld0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            int i11 = 0;
            if (arrayList != null) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    fd0 fd0Var = (fd0) arrayList.get(i12);
                    if (fd0Var != null && !UserObject.isUserSelf(fd0Var.f35510c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                ld0Var.f37695i0 = ((fd0) arrayList.get(0)).f35508a;
            }
            this.m0 = false;
            org.telegram.ui.ActionBar.u0 u0Var = ld0Var.Z;
            if (i10 != 1) {
                i11 = 8;
            }
            u0Var.setVisibility(i11);
        }
        super.N(arrayList);
    }
}
