package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tq implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.c5 {
    public final String f37864a;
    public final boolean f37865b;
    public final Object f37866c;
    public final Object d;
    public final Object e;
    public final Object f37867f;
    public final Object h;

    public tq(sr srVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f37866c = srVar;
        this.d = user;
        this.e = tLObject;
        this.f37867f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f37864a = str;
        this.f37865b = z10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean z11 = this.f37865b;
        ((org.telegram.ui.Components.gg) this.f37866c).B((View) this.d, this.e, this.f37864a, this.f37867f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        sr srVar = (sr) this.f37866c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f37867f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        srVar.getClass();
        long j3 = ((TLRPC.User) this.d).f18490id;
        if (srVar.f37483e1 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        srVar.t0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f37864a, this.f37865b, i11, false);
    }

    public tq(org.telegram.ui.Components.gg ggVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f37866c = ggVar;
        this.d = view;
        this.e = obj;
        this.f37864a = str;
        this.f37867f = obj2;
        this.h = photoEntry;
        this.f37865b = z10;
    }
}
