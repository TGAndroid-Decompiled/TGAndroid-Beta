package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wq implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.d5 {
    public final String f42457a;
    public final boolean f42458b;
    public final Object f42459c;
    public final Object d;
    public final Object f42460e;
    public final Object f42461f;
    public final Object h;

    public wq(vr vrVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f42459c = vrVar;
        this.d = user;
        this.f42460e = tLObject;
        this.f42461f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f42457a = str;
        this.f42458b = z10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean z11 = this.f42458b;
        ((org.telegram.ui.Components.hg) this.f42459c).B((View) this.d, this.f42460e, this.f42457a, this.f42461f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        vr vrVar = (vr) this.f42459c;
        TLObject tLObject = (TLObject) this.f42460e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f42461f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        vrVar.getClass();
        long j3 = ((TLRPC.User) this.d).f20016id;
        if (vrVar.f41643e1 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        vrVar.t0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f42457a, this.f42458b, i11, false);
    }

    public wq(org.telegram.ui.Components.hg hgVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f42459c = hgVar;
        this.d = view;
        this.f42460e = obj;
        this.f42457a = str;
        this.f42461f = obj2;
        this.h = photoEntry;
        this.f42458b = z10;
    }
}
