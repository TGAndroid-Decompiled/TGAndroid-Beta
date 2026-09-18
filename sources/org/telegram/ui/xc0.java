package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
public final class xc0 extends gg.t0 {
    public boolean m0;
    public final jd0 f39431n0;

    public xc0(jd0 jd0Var, Context context, int i10, long j3, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context, i10, j3, false, e6Var, false, z10, z11);
        this.f39431n0 = jd0Var;
        this.m0 = true;
    }

    @Override
    public final void K() {
        this.f39431n0.r0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i10;
        jd0 jd0Var = this.f39431n0;
        MessageObject messageObject = jd0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            int i11 = 0;
            if (arrayList != null) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    dd0 dd0Var = (dd0) arrayList.get(i12);
                    if (dd0Var != null && !UserObject.isUserSelf(dd0Var.f32942c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                jd0Var.f34823i0 = ((dd0) arrayList.get(0)).f32940a;
            }
            this.m0 = false;
            org.telegram.ui.ActionBar.v0 v0Var = jd0Var.Z;
            if (i10 != 1) {
                i11 = 8;
            }
            v0Var.setVisibility(i11);
        }
        super.N(arrayList);
    }
}
