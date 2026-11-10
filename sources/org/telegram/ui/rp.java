package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rp implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.s4 {
    public final String f49489a;
    public final boolean f49490b;
    public final Object f49491c;
    public final Object d;
    public final Object f49492e;
    public final Object f49493f;
    public final Object h;

    public rp(rq rqVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z9) {
        this.f49491c = rqVar;
        this.d = user;
        this.f49492e = tLObject;
        this.f49493f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f49489a = str;
        this.f49490b = z9;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        boolean z10 = this.f49490b;
        ((org.telegram.ui.Components.of) this.f49491c).B((View) this.d, this.f49492e, this.f49489a, this.f49493f, z9, i7, i10, (org.telegram.messenger.gf) this.h, z10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        rq rqVar = (rq) this.f49491c;
        TLObject tLObject = (TLObject) this.f49492e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f49493f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        rqVar.getClass();
        long j3 = ((TLRPC.User) this.d).f27109id;
        int i10 = 1;
        if (rqVar.f49506d1 == 1) {
            i10 = 0;
        }
        rqVar.y0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f49489a, this.f49490b, i10, false);
    }

    public rp(org.telegram.ui.Components.of ofVar, View view, Object obj, String str, Object obj2, org.telegram.messenger.gf gfVar, boolean z9) {
        this.f49491c = ofVar;
        this.d = view;
        this.f49492e = obj;
        this.f49489a = str;
        this.f49493f = obj2;
        this.h = gfVar;
        this.f49490b = z9;
    }
}
