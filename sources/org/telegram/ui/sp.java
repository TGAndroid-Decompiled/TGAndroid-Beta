package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sp implements org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.z4 {
    public final String f52123a;
    public final boolean f52124b;
    public final Object f52125c;
    public final Object d;
    public final Object f52126e;
    public final Object f52127f;
    public final Object h;

    public sp(rq rqVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f52125c = rqVar;
        this.d = user;
        this.f52126e = tLObject;
        this.f52127f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f52123a = str;
        this.f52124b = z10;
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        boolean z11 = this.f52124b;
        ((org.telegram.ui.Components.hg) this.f52125c).B((View) this.d, this.f52126e, this.f52123a, this.f52127f, z10, i7, i10, (org.telegram.messenger.ef) this.h, z11);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        rq rqVar = (rq) this.f52125c;
        TLObject tLObject = (TLObject) this.f52126e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f52127f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        rqVar.getClass();
        long j3 = ((TLRPC.User) this.d).f28641id;
        int i10 = 1;
        if (rqVar.f51823e1 == 1) {
            i10 = 0;
        }
        rqVar.y0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f52123a, this.f52124b, i10, false);
    }

    public sp(org.telegram.ui.Components.hg hgVar, View view, Object obj, String str, Object obj2, org.telegram.messenger.ef efVar, boolean z10) {
        this.f52125c = hgVar;
        this.d = view;
        this.f52126e = obj;
        this.f52123a = str;
        this.f52127f = obj2;
        this.h = efVar;
        this.f52124b = z10;
    }
}
