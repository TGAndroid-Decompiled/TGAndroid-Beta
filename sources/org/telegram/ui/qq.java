package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qq implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.d5 {
    public final String f36966a;
    public final boolean f36967b;
    public final Object f36968c;
    public final Object d;
    public final Object e;
    public final Object f36969f;
    public final Object h;

    public qq(pr prVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f36968c = prVar;
        this.d = user;
        this.e = tLObject;
        this.f36969f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f36966a = str;
        this.f36967b = z10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean z11 = this.f36967b;
        ((org.telegram.ui.Components.hg) this.f36968c).B((View) this.d, this.e, this.f36966a, this.f36969f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        pr prVar = (pr) this.f36968c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f36969f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        prVar.getClass();
        long j3 = ((TLRPC.User) this.d).f18482id;
        if (prVar.f36620e1 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        prVar.t0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f36966a, this.f36967b, i11, false);
    }

    public qq(org.telegram.ui.Components.hg hgVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f36968c = hgVar;
        this.d = view;
        this.e = obj;
        this.f36966a = str;
        this.f36969f = obj2;
        this.h = photoEntry;
        this.f36967b = z10;
    }
}
