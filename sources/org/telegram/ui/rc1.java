package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rc1 extends org.telegram.ui.Components.tj0 {
    public org.telegram.ui.Wallet.r E;
    public final WallpapersListActivity F;
    public final Context f50918c;
    public final ArrayList d = new ArrayList();
    public final HashMap f50919e = new HashMap();
    public boolean f50920f = true;
    public String h;
    public String f50921n;
    public String f50922r;
    public int f50923s;
    public int f50924w;
    public boolean f50925x;
    public String f50926y;

    public rc1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.F = wallpapersListActivity;
        this.f50918c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str, boolean z10) {
        int i7;
        if (str != null && this.f50921n != null) {
            str = org.telegram.ui.Cells.y0.m(this.f50921n, " ", str, new StringBuilder("#color"));
        }
        org.telegram.ui.Wallet.r rVar = this.E;
        if (rVar != null) {
            org.telegram.messenger.g0.r(rVar);
            this.E = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.f50919e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.F;
        if (isEmpty) {
            arrayList.clear();
            hashMap.clear();
            this.f50920f = true;
            this.h = null;
            if (this.f50923s != 0) {
                i7 = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i7).cancelRequest(this.f50923s, true);
                this.f50923s = 0;
            }
            wallpapersListActivity.L.c();
        } else {
            wallpapersListActivity.L.b();
            if (z10) {
                arrayList.clear();
                hashMap.clear();
                this.f50920f = true;
                F(str, "", true);
                this.h = str;
                f();
            } else {
                org.telegram.ui.Wallet.r rVar2 = new org.telegram.ui.Wallet.r(22, this, str);
                this.E = rVar2;
                org.telegram.messenger.g0.i3(rVar2, 500L);
            }
        }
        f();
    }

    public final void F(String str, String str2, boolean z10) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.f50923s;
        WallpapersListActivity wallpapersListActivity = this.F;
        if (i18 != 0) {
            i17 = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i17).cancelRequest(this.f50923s, true);
            this.f50923s = 0;
        }
        this.f50926y = str;
        i7 = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).currentAccount;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
        i10 = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).currentAccount;
        TLObject f22 = s12.f2(org.telegram.messenger.np.s1(i10).M3);
        if (!(f22 instanceof TLRPC.User)) {
            if (z10 && !this.f50925x) {
                this.f50925x = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i15 = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).currentAccount;
                tL_contacts_resolveUsername.username = org.telegram.messenger.np.s1(i15).M3;
                i16 = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i16).sendRequest(tL_contacts_resolveUsername, new l(this, 25));
                return;
            }
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = r.b.k("#wallpaper ", str);
        i11 = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = org.telegram.messenger.np.s1(i11).q1((TLRPC.User) f22);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i19 = this.f50924w + 1;
        this.f50924w = i19;
        i12 = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).currentAccount;
        this.f50923s = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getInlineBotResults, new di.u1(this, i19, 10));
        i13 = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
        int i20 = this.f50923s;
        i14 = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).classGuid;
        connectionsManager.bindRequestToGuid(i20, i14);
    }

    @Override
    public final int b() {
        if (TextUtils.isEmpty(this.h)) {
            return 2;
        }
        return (int) Math.ceil(this.d.size() / this.F.O);
    }

    @Override
    public final int d(int i7) {
        if (TextUtils.isEmpty(this.h)) {
            if (i7 == 0) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        Object obj;
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
        if (i10 != 0) {
            if (i10 == 2) {
                ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.hd.M0(2131745815, null));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) view;
        WallpapersListActivity wallpapersListActivity = this.F;
        int i11 = i7 * wallpapersListActivity.O;
        ArrayList arrayList = this.d;
        int ceil = (int) Math.ceil(arrayList.size() / wallpapersListActivity.O);
        int i12 = wallpapersListActivity.O;
        boolean z11 = true;
        if (i11 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 / i12 != ceil - 1) {
            z11 = false;
        }
        taVar.d(i12, z10, z11);
        for (int i13 = 0; i13 < wallpapersListActivity.O; i13++) {
            int i14 = i11 + i13;
            if (i14 < arrayList.size()) {
                obj = arrayList.get(i14);
            } else {
                obj = null;
            }
            taVar.e(wallpapersListActivity.f44884r, obj, "", i13);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout xiVar;
        FrameLayout frameLayout;
        Context context = this.f50918c;
        if (i7 != 0) {
            xiVar = null;
            if (i7 != 1) {
                if (i7 == 2) {
                    frameLayout = new org.telegram.ui.Cells.x3(context, null);
                }
            } else {
                ?? b61Var = new b61(14, context, null);
                b61Var.setItemAnimator(null);
                b61Var.setLayoutAnimation(null);
                jg.b0 b0Var = new jg.b0(20);
                b61Var.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
                b61Var.setClipToPadding(false);
                b0Var.j1(0);
                b61Var.setLayoutManager(b0Var);
                b61Var.setAdapter(new di.i4(this, 9));
                b61Var.setOnItemClickListener(new ux0(this, 13));
                frameLayout = b61Var;
            }
            xiVar = frameLayout;
        } else {
            xiVar = new org.telegram.ui.Components.xi(this, context, 2);
            xiVar.setTag(-33024);
        }
        if (i7 == 1) {
            xiVar.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(60.0f)));
        } else {
            xiVar.setLayoutParams(new v4.p0(-1, -2));
        }
        return new v4.e1(xiVar);
    }
}
