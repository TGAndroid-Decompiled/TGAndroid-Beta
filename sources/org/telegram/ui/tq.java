package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tq implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.c5 {
    public final String f37863a;
    public final boolean f37864b;
    public final Object f37865c;
    public final Object d;
    public final Object e;
    public final Object f37866f;
    public final Object h;

    public tq(sr srVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f37865c = srVar;
        this.d = user;
        this.e = tLObject;
        this.f37866f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f37863a = str;
        this.f37864b = z10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean z11 = this.f37864b;
        ((org.telegram.ui.Components.gg) this.f37865c).B((View) this.d, this.e, this.f37863a, this.f37866f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        sr srVar = (sr) this.f37865c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f37866f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        srVar.getClass();
        long j3 = ((TLRPC.User) this.d).f18475id;
        if (srVar.f37459e1 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        srVar.t0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f37863a, this.f37864b, i11, false);
    }

    public tq(org.telegram.ui.Components.gg ggVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f37865c = ggVar;
        this.d = view;
        this.e = obj;
        this.f37863a = str;
        this.f37866f = obj2;
        this.h = photoEntry;
        this.f37864b = z10;
    }
}
