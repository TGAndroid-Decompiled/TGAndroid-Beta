package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xq implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.c5 {
    public final String f38797a;
    public final boolean f38798b;
    public final Object f38799c;
    public final Object d;
    public final Object e;
    public final Object f38800f;
    public final Object h;

    public xq(wr wrVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f38799c = wrVar;
        this.d = user;
        this.e = tLObject;
        this.f38800f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f38797a = str;
        this.f38798b = z10;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        boolean z11 = this.f38798b;
        ((org.telegram.ui.Components.jg) this.f38799c).B((View) this.d, this.e, this.f38797a, this.f38800f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        wr wrVar = (wr) this.f38799c;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f38800f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        wrVar.getClass();
        long j3 = ((TLRPC.User) this.d).f17342id;
        if (wrVar.f38329e1 == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        wrVar.t0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f38797a, this.f38798b, i11, false);
    }

    public xq(org.telegram.ui.Components.jg jgVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f38799c = jgVar;
        this.d = view;
        this.e = obj;
        this.f38797a = str;
        this.f38800f = obj2;
        this.h = photoEntry;
        this.f38798b = z10;
    }
}
