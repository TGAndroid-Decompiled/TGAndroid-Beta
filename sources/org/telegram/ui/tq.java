package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tq implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.f5 {
    public final String f42087a;
    public final boolean f42088b;
    public final Object f42089c;
    public final Object d;
    public final Object f42090e;
    public final Object f42091f;
    public final Object h;

    public tq(tr trVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f42089c = trVar;
        this.d = user;
        this.f42090e = tLObject;
        this.f42091f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f42087a = str;
        this.f42088b = z10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean z11 = this.f42088b;
        ((org.telegram.ui.Components.jg) this.f42089c).B((View) this.d, this.f42090e, this.f42087a, this.f42091f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        tr trVar = (tr) this.f42089c;
        TLObject tLObject = (TLObject) this.f42090e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f42091f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        trVar.getClass();
        long j3 = ((TLRPC.User) this.d).f20189id;
        int i11 = 1;
        if (trVar.f42109e1 == 1) {
            i11 = 0;
        }
        trVar.t0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f42087a, this.f42088b, i11, false);
    }

    public tq(org.telegram.ui.Components.jg jgVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f42089c = jgVar;
        this.d = view;
        this.f42090e = obj;
        this.f42087a = str;
        this.f42091f = obj2;
        this.h = photoEntry;
        this.f42088b = z10;
    }
}
