package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vq implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.b5 {
    public final String f38493a;
    public final boolean f38494b;
    public final Object f38495c;
    public final Object d;
    public final Object e;
    public final Object f38496f;
    public final Object h;

    public vq(ur urVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f38495c = urVar;
        this.d = user;
        this.e = tLObject;
        this.f38496f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f38493a = str;
        this.f38494b = z10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean z11 = this.f38494b;
        ((org.telegram.ui.Components.fg) this.f38495c).B((View) this.d, this.e, this.f38493a, this.f38496f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        ur urVar = (ur) this.f38495c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f38496f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        urVar.getClass();
        long j3 = ((TLRPC.User) this.d).f18268id;
        if (urVar.f38134e1 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        urVar.t0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f38493a, this.f38494b, i11, false);
    }

    public vq(org.telegram.ui.Components.fg fgVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f38495c = fgVar;
        this.d = view;
        this.e = obj;
        this.f38493a = str;
        this.f38496f = obj2;
        this.h = photoEntry;
        this.f38494b = z10;
    }
}
