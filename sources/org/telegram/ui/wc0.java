package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
public final class wc0 extends hg.t0 {
    public boolean m0;
    public final id0 f41924n0;

    public wc0(id0 id0Var, Context context, int i10, long j3, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11) {
        super(context, i10, j3, false, f6Var, false, z10, z11);
        this.f41924n0 = id0Var;
        this.m0 = true;
    }

    @Override
    public final void K() {
        this.f41924n0.r0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i10;
        id0 id0Var = this.f41924n0;
        MessageObject messageObject = id0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            int i11 = 0;
            if (arrayList != null) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    cd0 cd0Var = (cd0) arrayList.get(i12);
                    if (cd0Var != null && !UserObject.isUserSelf(cd0Var.f35102c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                id0Var.f37343i0 = ((cd0) arrayList.get(0)).f35100a;
            }
            this.m0 = false;
            org.telegram.ui.ActionBar.v0 v0Var = id0Var.Z;
            if (i10 != 1) {
                i11 = 8;
            }
            v0Var.setVisibility(i11);
        }
        super.N(arrayList);
    }
}
