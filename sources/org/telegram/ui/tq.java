package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tq implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.f5 {
    public final String f42281a;
    public final boolean f42282b;
    public final Object f42283c;
    public final Object d;
    public final Object f42284e;
    public final Object f42285f;
    public final Object h;

    public tq(sr srVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f42283c = srVar;
        this.d = user;
        this.f42284e = tLObject;
        this.f42285f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f42281a = str;
        this.f42282b = z10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean z11 = this.f42282b;
        ((org.telegram.ui.Components.jg) this.f42283c).B((View) this.d, this.f42284e, this.f42281a, this.f42285f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        sr srVar = (sr) this.f42283c;
        TLObject tLObject = (TLObject) this.f42284e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f42285f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        srVar.getClass();
        long j3 = ((TLRPC.User) this.d).f20215id;
        int i11 = 1;
        if (srVar.f41831e1 == 1) {
            i11 = 0;
        }
        srVar.t0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f42281a, this.f42282b, i11, false);
    }

    public tq(org.telegram.ui.Components.jg jgVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f42283c = jgVar;
        this.d = view;
        this.f42284e = obj;
        this.f42281a = str;
        this.f42285f = obj2;
        this.h = photoEntry;
        this.f42282b = z10;
    }
}
