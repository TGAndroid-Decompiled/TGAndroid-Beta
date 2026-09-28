package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qq implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.d5 {
    public final String f36967a;
    public final boolean f36968b;
    public final Object f36969c;
    public final Object d;
    public final Object e;
    public final Object f36970f;
    public final Object h;

    public qq(pr prVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f36969c = prVar;
        this.d = user;
        this.e = tLObject;
        this.f36970f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f36967a = str;
        this.f36968b = z10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean z11 = this.f36968b;
        ((org.telegram.ui.Components.hg) this.f36969c).B((View) this.d, this.e, this.f36967a, this.f36970f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        pr prVar = (pr) this.f36969c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f36970f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        prVar.getClass();
        long j3 = ((TLRPC.User) this.d).f18482id;
        if (prVar.f36621e1 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        prVar.t0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f36967a, this.f36968b, i11, false);
    }

    public qq(org.telegram.ui.Components.hg hgVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f36969c = hgVar;
        this.d = view;
        this.e = obj;
        this.f36967a = str;
        this.f36970f = obj2;
        this.h = photoEntry;
        this.f36968b = z10;
    }
}
