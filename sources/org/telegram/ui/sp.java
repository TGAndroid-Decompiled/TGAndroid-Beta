package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sp implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.z4 {
    public final String f52043a;
    public final boolean f52044b;
    public final Object f52045c;
    public final Object d;
    public final Object f52046e;
    public final Object f52047f;
    public final Object h;

    public sp(rq rqVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f52045c = rqVar;
        this.d = user;
        this.f52046e = tLObject;
        this.f52047f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f52043a = str;
        this.f52044b = z10;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        boolean z11 = this.f52044b;
        ((org.telegram.ui.Components.fg) this.f52045c).B((View) this.d, this.f52046e, this.f52043a, this.f52047f, z10, i7, i10, (org.telegram.messenger.ef) this.h, z11);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        rq rqVar = (rq) this.f52045c;
        TLObject tLObject = (TLObject) this.f52046e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f52047f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        rqVar.getClass();
        long j3 = ((TLRPC.User) this.d).f28552id;
        int i10 = 1;
        if (rqVar.f51729e1 == 1) {
            i10 = 0;
        }
        rqVar.y0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f52043a, this.f52044b, i10, false);
    }

    public sp(org.telegram.ui.Components.fg fgVar, View view, Object obj, String str, Object obj2, org.telegram.messenger.ef efVar, boolean z10) {
        this.f52045c = fgVar;
        this.d = view;
        this.f52046e = obj;
        this.f52043a = str;
        this.f52047f = obj2;
        this.h = efVar;
        this.f52044b = z10;
    }
}
