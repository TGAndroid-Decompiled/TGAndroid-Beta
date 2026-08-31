package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qq implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.y4 {
    public final String f40591a;
    public final boolean f40592b;
    public final Object f40593c;
    public final Object d;
    public final Object f40594e;
    public final Object f40595f;
    public final Object h;

    public qq(qr qrVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z4) {
        this.f40593c = qrVar;
        this.d = user;
        this.f40594e = tLObject;
        this.f40595f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f40591a = str;
        this.f40592b = z4;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        boolean z10 = this.f40592b;
        ((org.telegram.ui.Components.xf) this.f40593c).B((View) this.d, this.f40594e, this.f40591a, this.f40595f, z4, i10, i11, (MediaController.PhotoEntry) this.h, z10);
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        qr qrVar = (qr) this.f40593c;
        TLObject tLObject = (TLObject) this.f40594e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f40595f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        qrVar.getClass();
        long j10 = ((TLRPC.User) this.d).f20990id;
        if (qrVar.f40604b1 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        qrVar.t0(j10, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f40591a, this.f40592b, i11, false);
    }

    public qq(org.telegram.ui.Components.xf xfVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z4) {
        this.f40593c = xfVar;
        this.d = view;
        this.f40594e = obj;
        this.f40591a = str;
        this.f40595f = obj2;
        this.h = photoEntry;
        this.f40592b = z4;
    }
}
