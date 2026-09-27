package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rq implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.d5 {
    public final String f37217a;
    public final boolean f37218b;
    public final Object f37219c;
    public final Object d;
    public final Object e;
    public final Object f37220f;
    public final Object h;

    public rq(qr qrVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f37219c = qrVar;
        this.d = user;
        this.e = tLObject;
        this.f37220f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f37217a = str;
        this.f37218b = z10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean z11 = this.f37218b;
        ((org.telegram.ui.Components.hg) this.f37219c).B((View) this.d, this.e, this.f37217a, this.f37220f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        qr qrVar = (qr) this.f37219c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f37220f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        qrVar.getClass();
        long j3 = ((TLRPC.User) this.d).f18476id;
        if (qrVar.f36829e1 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        qrVar.t0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f37217a, this.f37218b, i11, false);
    }

    public rq(org.telegram.ui.Components.hg hgVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f37219c = hgVar;
        this.d = view;
        this.e = obj;
        this.f37217a = str;
        this.f37220f = obj2;
        this.h = photoEntry;
        this.f37218b = z10;
    }
}
