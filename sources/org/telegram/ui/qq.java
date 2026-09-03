package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qq implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.y4 {
    public final String f40560a;
    public final boolean f40561b;
    public final Object f40562c;
    public final Object d;
    public final Object f40563e;
    public final Object f40564f;
    public final Object h;

    public qq(qr qrVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z4) {
        this.f40562c = qrVar;
        this.d = user;
        this.f40563e = tLObject;
        this.f40564f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f40560a = str;
        this.f40561b = z4;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        boolean z10 = this.f40561b;
        ((org.telegram.ui.Components.xf) this.f40562c).B((View) this.d, this.f40563e, this.f40560a, this.f40564f, z4, i10, i11, (MediaController.PhotoEntry) this.h, z10);
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        qr qrVar = (qr) this.f40562c;
        TLObject tLObject = (TLObject) this.f40563e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f40564f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        qrVar.getClass();
        long j10 = ((TLRPC.User) this.d).f20992id;
        if (qrVar.f40572b1 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        qrVar.t0(j10, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f40560a, this.f40561b, i11, false);
    }

    public qq(org.telegram.ui.Components.xf xfVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z4) {
        this.f40562c = xfVar;
        this.d = view;
        this.f40563e = obj;
        this.f40560a = str;
        this.f40564f = obj2;
        this.h = photoEntry;
        this.f40561b = z4;
    }
}
