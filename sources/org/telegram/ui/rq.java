package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rq implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.y4 {
    public final String f37941a;
    public final boolean f37942b;
    public final Object f37943c;
    public final Object d;
    public final Object e;
    public final Object f37944f;
    public final Object h;

    public rq(rr rrVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z4) {
        this.f37943c = rrVar;
        this.d = user;
        this.e = tLObject;
        this.f37944f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f37941a = str;
        this.f37942b = z4;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        boolean z10 = this.f37942b;
        ((org.telegram.ui.Components.xf) this.f37943c).B((View) this.d, this.e, this.f37941a, this.f37944f, z4, i10, i11, (MediaController.PhotoEntry) this.h, z10);
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        rr rrVar = (rr) this.f37943c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f37944f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        rrVar.getClass();
        long j10 = ((TLRPC.User) this.d).f19306id;
        if (rrVar.f37960b1 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        rrVar.t0(j10, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f37941a, this.f37942b, i11, false);
    }

    public rq(org.telegram.ui.Components.xf xfVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z4) {
        this.f37943c = xfVar;
        this.d = view;
        this.e = obj;
        this.f37941a = str;
        this.f37944f = obj2;
        this.h = photoEntry;
        this.f37942b = z4;
    }
}
