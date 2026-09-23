package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rq implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.d5 {
    public final String f36914a;
    public final boolean f36915b;
    public final Object f36916c;
    public final Object d;
    public final Object e;
    public final Object f36917f;
    public final Object h;

    public rq(qr qrVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f36916c = qrVar;
        this.d = user;
        this.e = tLObject;
        this.f36917f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f36914a = str;
        this.f36915b = z10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean z11 = this.f36915b;
        ((org.telegram.ui.Components.gg) this.f36916c).B((View) this.d, this.e, this.f36914a, this.f36917f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        qr qrVar = (qr) this.f36916c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f36917f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        qrVar.getClass();
        long j3 = ((TLRPC.User) this.d).f18230id;
        if (qrVar.f36557e1 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        qrVar.t0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f36914a, this.f36915b, i11, false);
    }

    public rq(org.telegram.ui.Components.gg ggVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f36916c = ggVar;
        this.d = view;
        this.e = obj;
        this.f36914a = str;
        this.f36917f = obj2;
        this.h = photoEntry;
        this.f36915b = z10;
    }
}
