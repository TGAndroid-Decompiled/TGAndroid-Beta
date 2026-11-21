package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sp implements org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.a5 {
    public final String f52088a;
    public final boolean f52089b;
    public final Object f52090c;
    public final Object d;
    public final Object f52091e;
    public final Object f52092f;
    public final Object h;

    public sp(rq rqVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f52090c = rqVar;
        this.d = user;
        this.f52091e = tLObject;
        this.f52092f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f52088a = str;
        this.f52089b = z10;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        boolean z11 = this.f52089b;
        ((org.telegram.ui.Components.ig) this.f52090c).B((View) this.d, this.f52091e, this.f52088a, this.f52092f, z10, i7, i10, (org.telegram.messenger.ef) this.h, z11);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        rq rqVar = (rq) this.f52090c;
        TLObject tLObject = (TLObject) this.f52091e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f52092f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        rqVar.getClass();
        long j3 = ((TLRPC.User) this.d).f28580id;
        int i10 = 1;
        if (rqVar.f51704e1 == 1) {
            i10 = 0;
        }
        rqVar.y0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f52088a, this.f52089b, i10, false);
    }

    public sp(org.telegram.ui.Components.ig igVar, View view, Object obj, String str, Object obj2, org.telegram.messenger.ef efVar, boolean z10) {
        this.f52090c = igVar;
        this.d = view;
        this.f52091e = obj;
        this.f52088a = str;
        this.f52092f = obj2;
        this.h = efVar;
        this.f52089b = z10;
    }
}
