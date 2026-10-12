package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wq implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.f5 {
    public final String f43608a;
    public final boolean f43609b;
    public final Object f43610c;
    public final Object d;
    public final Object f43611e;
    public final Object f43612f;
    public final Object h;

    public wq(wr wrVar, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.f43610c = wrVar;
        this.d = user;
        this.f43611e = tLObject;
        this.f43612f = tL_chatAdminRights;
        this.h = tL_chatBannedRights;
        this.f43608a = str;
        this.f43609b = z10;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        boolean z11 = this.f43609b;
        ((org.telegram.ui.Components.lg) this.f43610c).B((View) this.d, this.f43611e, this.f43608a, this.f43612f, z10, i10, i11, (MediaController.PhotoEntry) this.h, z11);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        wr wrVar = (wr) this.f43610c;
        TLObject tLObject = (TLObject) this.f43611e;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f43612f;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.h;
        wrVar.getClass();
        long j3 = ((TLRPC.User) this.d).f19950id;
        int i11 = 1;
        if (wrVar.f43626e1 == 1) {
            i11 = 0;
        }
        wrVar.t0(j3, tLObject, tL_chatAdminRights, tL_chatBannedRights, this.f43608a, this.f43609b, i11, false);
    }

    public wq(org.telegram.ui.Components.lg lgVar, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z10) {
        this.f43610c = lgVar;
        this.d = view;
        this.f43611e = obj;
        this.f43608a = str;
        this.f43612f = obj2;
        this.h = photoEntry;
        this.f43609b = z10;
    }
}
