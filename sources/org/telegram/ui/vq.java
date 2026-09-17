package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vq implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.b5 {
    public final String f38488a;
    public final boolean f38489b;
    public final Object f38490c;
    public final Object d;
    public final Object e;
    public final Object f38491f;
    public final Object h;

    public vq(ur urVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f38490c = urVar;
        this.d = user;
        this.e = tLObject;
        this.f38491f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f38488a = str;
        this.f38489b = z10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean z11 = this.f38489b;
        ((org.telegram.ui.Components.fg) this.f38490c).B((View) this.d, this.e, this.f38488a, this.f38491f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        ur urVar = (ur) this.f38490c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f38491f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        urVar.getClass();
        long j3 = ((TLRPC.User) this.d).f18268id;
        if (urVar.f38129e1 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        urVar.t0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f38488a, this.f38489b, i11, false);
    }

    public vq(org.telegram.ui.Components.fg fgVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f38490c = fgVar;
        this.d = view;
        this.e = obj;
        this.f38488a = str;
        this.f38491f = obj2;
        this.h = photoEntry;
        this.f38489b = z10;
    }
}
