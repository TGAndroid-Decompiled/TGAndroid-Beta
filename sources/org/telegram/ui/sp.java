package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sp implements org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.a5 {
    public final String f52092a;
    public final boolean f52093b;
    public final Object f52094c;
    public final Object d;
    public final Object f52095e;
    public final Object f52096f;
    public final Object h;

    public sp(rq rqVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f52094c = rqVar;
        this.d = user;
        this.f52095e = tLObject;
        this.f52096f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f52092a = str;
        this.f52093b = z10;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        boolean z11 = this.f52093b;
        ((org.telegram.ui.Components.ig) this.f52094c).B((View) this.d, this.f52095e, this.f52092a, this.f52096f, z10, i7, i10, (org.telegram.messenger.ff) this.h, z11);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        rq rqVar = (rq) this.f52094c;
        TLObject tLObject = (TLObject) this.f52095e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f52096f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        rqVar.getClass();
        long j3 = ((TLRPC.User) this.d).f28583id;
        int i10 = 1;
        if (rqVar.f51708e1 == 1) {
            i10 = 0;
        }
        rqVar.y0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f52092a, this.f52093b, i10, false);
    }

    public sp(org.telegram.ui.Components.ig igVar, View view, Object obj, String str, Object obj2, org.telegram.messenger.ff ffVar, boolean z10) {
        this.f52094c = igVar;
        this.d = view;
        this.f52095e = obj;
        this.f52092a = str;
        this.f52096f = obj2;
        this.h = ffVar;
        this.f52093b = z10;
    }
}
