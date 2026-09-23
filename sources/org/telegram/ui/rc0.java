package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
public final class rc0 extends gg.t0 {
    public boolean m0;
    public final dd0 f36794n0;

    public rc0(dd0 dd0Var, Context context, int i10, long j3, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(context, i10, j3, false, d6Var, false, z10, z11);
        this.f36794n0 = dd0Var;
        this.m0 = true;
    }

    @Override
    public final void K() {
        this.f36794n0.r0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i10;
        dd0 dd0Var = this.f36794n0;
        MessageObject messageObject = dd0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            int i11 = 0;
            if (arrayList != null) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    xc0 xc0Var = (xc0) arrayList.get(i12);
                    if (xc0Var != null && !UserObject.isUserSelf(xc0Var.f39241c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                dd0Var.f32592i0 = ((xc0) arrayList.get(0)).f39239a;
            }
            this.m0 = false;
            org.telegram.ui.ActionBar.v0 v0Var = dd0Var.Z;
            if (i10 != 1) {
                i11 = 8;
            }
            v0Var.setVisibility(i11);
        }
        super.N(arrayList);
    }
}
