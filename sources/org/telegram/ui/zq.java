package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zq implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.f5 {
    public final String f42695a;
    public final boolean f42696b;
    public final Object f42697c;
    public final Object d;
    public final Object e;
    public final Object f42698f;
    public final Object h;

    public zq(yr yrVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f42697c = yrVar;
        this.d = user;
        this.e = tLObject;
        this.f42698f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f42695a = str;
        this.f42696b = z10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean z11 = this.f42696b;
        ((org.telegram.ui.Components.ig) this.f42697c).B((View) this.d, this.e, this.f42695a, this.f42698f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        yr yrVar = (yr) this.f42697c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f42698f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        yrVar.getClass();
        long j10 = ((TLRPC.User) this.d).f19363id;
        int i11 = 1;
        if (yrVar.f42224e1 == 1) {
            i11 = 0;
        }
        yrVar.t0(j10, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f42695a, this.f42696b, i11, false);
    }

    public zq(org.telegram.ui.Components.ig igVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f42697c = igVar;
        this.d = view;
        this.e = obj;
        this.f42695a = str;
        this.f42698f = obj2;
        this.h = photoEntry;
        this.f42696b = z10;
    }
}
