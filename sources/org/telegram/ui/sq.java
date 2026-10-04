package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sq implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.d5 {
    public final String f40607a;
    public final boolean f40608b;
    public final Object f40609c;
    public final Object d;
    public final Object f40610e;
    public final Object f40611f;
    public final Object h;

    public sq(rr rrVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f40609c = rrVar;
        this.d = user;
        this.f40610e = tLObject;
        this.f40611f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f40607a = str;
        this.f40608b = z10;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        boolean z11 = this.f40608b;
        ((org.telegram.ui.Components.ig) this.f40609c).B((View) this.d, this.f40610e, this.f40607a, this.f40611f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        rr rrVar = (rr) this.f40609c;
        TLObject tLObject = (TLObject) this.f40610e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f40611f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        rrVar.getClass();
        long j3 = ((TLRPC.User) this.d).f20189id;
        if (rrVar.f40202e1 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        rrVar.t0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f40607a, this.f40608b, i11, false);
    }

    public sq(org.telegram.ui.Components.ig igVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f40609c = igVar;
        this.d = view;
        this.f40610e = obj;
        this.f40607a = str;
        this.f40611f = obj2;
        this.h = photoEntry;
        this.f40608b = z10;
    }
}
