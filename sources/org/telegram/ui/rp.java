package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rp implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.t4 {
    public final String f49550a;
    public final boolean f49551b;
    public final Object f49552c;
    public final Object d;
    public final Object f49553e;
    public final Object f49554f;
    public final Object h;

    public rp(qq qqVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z9) {
        this.f49552c = qqVar;
        this.d = user;
        this.f49553e = tLObject;
        this.f49554f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f49550a = str;
        this.f49551b = z9;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        boolean z10 = this.f49551b;
        ((org.telegram.ui.Components.pf) this.f49552c).B((View) this.d, this.f49553e, this.f49550a, this.f49554f, z9, i7, i10, (org.telegram.messenger.gf) this.h, z10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        qq qqVar = (qq) this.f49552c;
        TLObject tLObject = (TLObject) this.f49553e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f49554f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        qqVar.getClass();
        long j3 = ((TLRPC.User) this.d).f27105id;
        int i10 = 1;
        if (qqVar.f49125d1 == 1) {
            i10 = 0;
        }
        qqVar.y0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f49550a, this.f49551b, i10, false);
    }

    public rp(org.telegram.ui.Components.pf pfVar, View view, Object obj, String str, Object obj2, org.telegram.messenger.gf gfVar, boolean z9) {
        this.f49552c = pfVar;
        this.d = view;
        this.f49553e = obj;
        this.f49550a = str;
        this.f49554f = obj2;
        this.h = gfVar;
        this.f49551b = z9;
    }
}
