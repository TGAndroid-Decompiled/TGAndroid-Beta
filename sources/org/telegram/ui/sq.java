package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sq implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.d5 {
    public final String f40601a;
    public final boolean f40602b;
    public final Object f40603c;
    public final Object d;
    public final Object f40604e;
    public final Object f40605f;
    public final Object h;

    public sq(rr rrVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f40603c = rrVar;
        this.d = user;
        this.f40604e = tLObject;
        this.f40605f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f40601a = str;
        this.f40602b = z10;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        boolean z11 = this.f40602b;
        ((org.telegram.ui.Components.ig) this.f40603c).B((View) this.d, this.f40604e, this.f40601a, this.f40605f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        rr rrVar = (rr) this.f40603c;
        TLObject tLObject = (TLObject) this.f40604e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f40605f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        rrVar.getClass();
        long j3 = ((TLRPC.User) this.d).f20185id;
        if (rrVar.f40197e1 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        rrVar.t0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f40601a, this.f40602b, i11, false);
    }

    public sq(org.telegram.ui.Components.ig igVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f40603c = igVar;
        this.d = view;
        this.f40604e = obj;
        this.f40601a = str;
        this.f40605f = obj2;
        this.h = photoEntry;
        this.f40602b = z10;
    }
}
