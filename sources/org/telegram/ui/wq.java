package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wq implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.d5 {
    public final String f42456a;
    public final boolean f42457b;
    public final Object f42458c;
    public final Object d;
    public final Object f42459e;
    public final Object f42460f;
    public final Object h;

    public wq(vr vrVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f42458c = vrVar;
        this.d = user;
        this.f42459e = tLObject;
        this.f42460f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f42456a = str;
        this.f42457b = z10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean z11 = this.f42457b;
        ((org.telegram.ui.Components.hg) this.f42458c).B((View) this.d, this.f42459e, this.f42456a, this.f42460f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        vr vrVar = (vr) this.f42458c;
        TLObject tLObject = (TLObject) this.f42459e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f42460f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        vrVar.getClass();
        long j3 = ((TLRPC.User) this.d).f20016id;
        if (vrVar.f41642e1 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        vrVar.t0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f42456a, this.f42457b, i11, false);
    }

    public wq(org.telegram.ui.Components.hg hgVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f42458c = hgVar;
        this.d = view;
        this.f42459e = obj;
        this.f42456a = str;
        this.f42460f = obj2;
        this.h = photoEntry;
        this.f42457b = z10;
    }
}
