package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sp implements org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.a5 {
    public final String f52064a;
    public final boolean f52065b;
    public final Object f52066c;
    public final Object d;
    public final Object f52067e;
    public final Object f52068f;
    public final Object h;

    public sp(rq rqVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f52066c = rqVar;
        this.d = user;
        this.f52067e = tLObject;
        this.f52068f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f52064a = str;
        this.f52065b = z10;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        boolean z11 = this.f52065b;
        ((org.telegram.ui.Components.hg) this.f52066c).B((View) this.d, this.f52067e, this.f52064a, this.f52068f, z10, i7, i10, (org.telegram.messenger.ff) this.h, z11);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        rq rqVar = (rq) this.f52066c;
        TLObject tLObject = (TLObject) this.f52067e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f52068f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        rqVar.getClass();
        long j3 = ((TLRPC.User) this.d).f28547id;
        int i10 = 1;
        if (rqVar.f51738e1 == 1) {
            i10 = 0;
        }
        rqVar.y0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f52064a, this.f52065b, i10, false);
    }

    public sp(org.telegram.ui.Components.hg hgVar, View view, Object obj, String str, Object obj2, org.telegram.messenger.ff ffVar, boolean z10) {
        this.f52066c = hgVar;
        this.d = view;
        this.f52067e = obj;
        this.f52064a = str;
        this.f52068f = obj2;
        this.h = ffVar;
        this.f52065b = z10;
    }
}
