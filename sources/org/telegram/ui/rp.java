package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rp implements org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.r4 {
    public final String f50985a;
    public final boolean f50986b;
    public final Object f50987c;
    public final Object d;
    public final Object f50988e;
    public final Object f50989f;
    public final Object h;

    public rp(qq qqVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f50987c = qqVar;
        this.d = user;
        this.f50988e = tLObject;
        this.f50989f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f50985a = str;
        this.f50986b = z10;
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        boolean z11 = this.f50986b;
        ((org.telegram.ui.Components.wf) this.f50987c).B((View) this.d, this.f50988e, this.f50985a, this.f50989f, z10, i7, i10, (org.telegram.messenger.ff) this.h, z11);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        qq qqVar = (qq) this.f50987c;
        TLObject tLObject = (TLObject) this.f50988e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f50989f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        qqVar.getClass();
        long j3 = ((TLRPC.User) this.d).f28200id;
        int i10 = 1;
        if (qqVar.f50721e1 == 1) {
            i10 = 0;
        }
        qqVar.y0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f50985a, this.f50986b, i10, false);
    }

    public rp(org.telegram.ui.Components.wf wfVar, View view, Object obj, String str, Object obj2, org.telegram.messenger.ff ffVar, boolean z10) {
        this.f50987c = wfVar;
        this.d = view;
        this.f50988e = obj;
        this.f50985a = str;
        this.f50989f = obj2;
        this.h = ffVar;
        this.f50986b = z10;
    }
}
