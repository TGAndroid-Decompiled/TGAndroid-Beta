package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sq implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.d5 {
    public final String f40600a;
    public final boolean f40601b;
    public final Object f40602c;
    public final Object d;
    public final Object f40603e;
    public final Object f40604f;
    public final Object h;

    public sq(rr rrVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f40602c = rrVar;
        this.d = user;
        this.f40603e = tLObject;
        this.f40604f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f40600a = str;
        this.f40601b = z10;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        boolean z11 = this.f40601b;
        ((org.telegram.ui.Components.ig) this.f40602c).B((View) this.d, this.f40603e, this.f40600a, this.f40604f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        rr rrVar = (rr) this.f40602c;
        TLObject tLObject = (TLObject) this.f40603e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f40604f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        rrVar.getClass();
        long j3 = ((TLRPC.User) this.d).f20184id;
        if (rrVar.f40196e1 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        rrVar.t0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f40600a, this.f40601b, i11, false);
    }

    public sq(org.telegram.ui.Components.ig igVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f40602c = igVar;
        this.d = view;
        this.f40603e = obj;
        this.f40600a = str;
        this.f40604f = obj2;
        this.h = photoEntry;
        this.f40601b = z10;
    }
}
