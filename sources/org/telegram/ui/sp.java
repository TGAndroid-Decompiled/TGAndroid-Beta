package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sp implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.z4 {
    public final String f52041a;
    public final boolean f52042b;
    public final Object f52043c;
    public final Object d;
    public final Object f52044e;
    public final Object f52045f;
    public final Object h;

    public sp(rq rqVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f52043c = rqVar;
        this.d = user;
        this.f52044e = tLObject;
        this.f52045f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f52041a = str;
        this.f52042b = z10;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        boolean z11 = this.f52042b;
        ((org.telegram.ui.Components.fg) this.f52043c).B((View) this.d, this.f52044e, this.f52041a, this.f52045f, z10, i7, i10, (org.telegram.messenger.ef) this.h, z11);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        rq rqVar = (rq) this.f52043c;
        TLObject tLObject = (TLObject) this.f52044e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f52045f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        rqVar.getClass();
        long j3 = ((TLRPC.User) this.d).f28554id;
        int i10 = 1;
        if (rqVar.f51740e1 == 1) {
            i10 = 0;
        }
        rqVar.y0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f52041a, this.f52042b, i10, false);
    }

    public sp(org.telegram.ui.Components.fg fgVar, View view, Object obj, String str, Object obj2, org.telegram.messenger.ef efVar, boolean z10) {
        this.f52043c = fgVar;
        this.d = view;
        this.f52044e = obj;
        this.f52041a = str;
        this.f52045f = obj2;
        this.h = efVar;
        this.f52042b = z10;
    }
}
