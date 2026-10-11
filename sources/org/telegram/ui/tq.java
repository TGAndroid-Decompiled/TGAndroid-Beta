package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tq implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.f5 {
    public final String f42247a;
    public final boolean f42248b;
    public final Object f42249c;
    public final Object d;
    public final Object f42250e;
    public final Object f42251f;
    public final Object h;

    public tq(sr srVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f42249c = srVar;
        this.d = user;
        this.f42250e = tLObject;
        this.f42251f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f42247a = str;
        this.f42248b = z10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean z11 = this.f42248b;
        ((org.telegram.ui.Components.jg) this.f42249c).B((View) this.d, this.f42250e, this.f42247a, this.f42251f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        sr srVar = (sr) this.f42249c;
        TLObject tLObject = (TLObject) this.f42250e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f42251f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        srVar.getClass();
        long j3 = ((TLRPC.User) this.d).f20179id;
        int i11 = 1;
        if (srVar.f41797e1 == 1) {
            i11 = 0;
        }
        srVar.t0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f42247a, this.f42248b, i11, false);
    }

    public tq(org.telegram.ui.Components.jg jgVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f42249c = jgVar;
        this.d = view;
        this.f42250e = obj;
        this.f42247a = str;
        this.f42251f = obj2;
        this.h = photoEntry;
        this.f42248b = z10;
    }
}
