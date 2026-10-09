package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tq implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.f5 {
    public final String f42041a;
    public final boolean f42042b;
    public final Object f42043c;
    public final Object d;
    public final Object f42044e;
    public final Object f42045f;
    public final Object h;

    public tq(tr trVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f42043c = trVar;
        this.d = user;
        this.f42044e = tLObject;
        this.f42045f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f42041a = str;
        this.f42042b = z10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean z11 = this.f42042b;
        ((org.telegram.ui.Components.jg) this.f42043c).B((View) this.d, this.f42044e, this.f42041a, this.f42045f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        tr trVar = (tr) this.f42043c;
        TLObject tLObject = (TLObject) this.f42044e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f42045f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        trVar.getClass();
        long j3 = ((TLRPC.User) this.d).f20185id;
        int i11 = 1;
        if (trVar.f42063e1 == 1) {
            i11 = 0;
        }
        trVar.t0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f42041a, this.f42042b, i11, false);
    }

    public tq(org.telegram.ui.Components.jg jgVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f42043c = jgVar;
        this.d = view;
        this.f42044e = obj;
        this.f42041a = str;
        this.f42045f = obj2;
        this.h = photoEntry;
        this.f42042b = z10;
    }
}
