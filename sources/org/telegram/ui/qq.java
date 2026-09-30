package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qq implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.d5 {
    public final String f37068a;
    public final boolean f37069b;
    public final Object f37070c;
    public final Object d;
    public final Object e;
    public final Object f37071f;
    public final Object h;

    public qq(pr prVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f37070c = prVar;
        this.d = user;
        this.e = tLObject;
        this.f37071f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f37068a = str;
        this.f37069b = z10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean z11 = this.f37069b;
        ((org.telegram.ui.Components.ig) this.f37070c).B((View) this.d, this.e, this.f37068a, this.f37071f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        pr prVar = (pr) this.f37070c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f37071f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        prVar.getClass();
        long j3 = ((TLRPC.User) this.d).f18499id;
        if (prVar.f36721e1 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        prVar.t0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f37068a, this.f37069b, i11, false);
    }

    public qq(org.telegram.ui.Components.ig igVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f37070c = igVar;
        this.d = view;
        this.e = obj;
        this.f37068a = str;
        this.f37071f = obj2;
        this.h = photoEntry;
        this.f37069b = z10;
    }
}
