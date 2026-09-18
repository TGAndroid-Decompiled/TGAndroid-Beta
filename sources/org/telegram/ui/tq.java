package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tq implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.d5 {
    public final String f37789a;
    public final boolean f37790b;
    public final Object f37791c;
    public final Object d;
    public final Object e;
    public final Object f37792f;
    public final Object h;

    public tq(sr srVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f37791c = srVar;
        this.d = user;
        this.e = tLObject;
        this.f37792f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f37789a = str;
        this.f37790b = z10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean z11 = this.f37790b;
        ((org.telegram.ui.Components.gg) this.f37791c).B((View) this.d, this.e, this.f37789a, this.f37792f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        sr srVar = (sr) this.f37791c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f37792f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        srVar.getClass();
        long j3 = ((TLRPC.User) this.d).f18443id;
        if (srVar.f37404e1 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        srVar.t0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f37789a, this.f37790b, i11, false);
    }

    public tq(org.telegram.ui.Components.gg ggVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f37791c = ggVar;
        this.d = view;
        this.e = obj;
        this.f37789a = str;
        this.f37792f = obj2;
        this.h = photoEntry;
        this.f37790b = z10;
    }
}
