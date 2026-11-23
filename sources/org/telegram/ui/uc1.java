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
public final class uc1 extends org.telegram.ui.Components.dk0 {
    public org.telegram.ui.Wallet.u4 E;
    public final WallpapersListActivity F;
    public final Context f52538c;
    public final ArrayList d = new ArrayList();
    public final HashMap f52539e = new HashMap();
    public boolean f52540f = true;
    public String h;
    public String f52541n;
    public String f52542r;
    public int f52543s;
    public int f52544w;
    public boolean f52545x;
    public String f52546y;

    public uc1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.F = wallpapersListActivity;
        this.f52538c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59169f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str, boolean z10) {
        int i7;
        if (str != null && this.f52541n != null) {
            str = p5.c.m(this.f52541n, " ", str, new StringBuilder("#color"));
        }
        org.telegram.ui.Wallet.u4 u4Var = this.E;
        if (u4Var != null) {
            org.telegram.messenger.g0.r(u4Var);
            this.E = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.f52539e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.F;
        if (isEmpty) {
            arrayList.clear();
            hashMap.clear();
            this.f52540f = true;
            this.h = null;
            if (this.f52543s != 0) {
                i7 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i7).cancelRequest(this.f52543s, true);
                this.f52543s = 0;
            }
            wallpapersListActivity.L.c();
        } else {
            wallpapersListActivity.L.b();
            if (z10) {
                arrayList.clear();
                hashMap.clear();
                this.f52540f = true;
                F(str, "", true);
                this.h = str;
                f();
            } else {
                org.telegram.ui.Wallet.u4 u4Var2 = new org.telegram.ui.Wallet.u4(16, this, str);
                this.E = u4Var2;
                org.telegram.messenger.g0.h3(u4Var2, 500L);
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
        int i18 = this.f52543s;
        WallpapersListActivity wallpapersListActivity = this.F;
        if (i18 != 0) {
            i17 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i17).cancelRequest(this.f52543s, true);
            this.f52543s = 0;
        }
        this.f52546y = str;
        i7 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
        i10 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
        TLObject h22 = u12.h2(org.telegram.messenger.np.u1(i10).O3);
        if (!(h22 instanceof TLRPC.User)) {
            if (z10 && !this.f52545x) {
                this.f52545x = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i15 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
                tL_contacts_resolveUsername.username = org.telegram.messenger.np.u1(i15).O3;
                i16 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i16).sendRequest(tL_contacts_resolveUsername, new l(this, 25));
                return;
            }
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = p5.c.k("#wallpaper ", str);
        i11 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = org.telegram.messenger.np.u1(i11).s1((TLRPC.User) h22);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i19 = this.f52544w + 1;
        this.f52544w = i19;
        i12 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
        this.f52543s = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getInlineBotResults, new di.w1(this, i19, 10));
        i13 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
        int i20 = this.f52543s;
        i14 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).classGuid;
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
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        Object obj;
        int i10 = f1Var.f59169f;
        View view = f1Var.f59165a;
        if (i10 != 0) {
            if (i10 == 2) {
                ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.hd.N0(2131745619, null));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
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
        vaVar.d(i12, z10, z11);
        for (int i13 = 0; i13 < wallpapersListActivity.O; i13++) {
            int i14 = i11 + i13;
            if (i14 < arrayList.size()) {
                obj = arrayList.get(i14);
            } else {
                obj = null;
            }
            vaVar.e(wallpapersListActivity.f45436r, obj, "", i13);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout gjVar;
        FrameLayout frameLayout;
        Context context = this.f52538c;
        if (i7 != 0) {
            gjVar = null;
            if (i7 != 1) {
                if (i7 == 2) {
                    frameLayout = new org.telegram.ui.Cells.y3(context, null);
                }
            } else {
                ?? f61Var = new f61(14, context, null);
                f61Var.setItemAnimator(null);
                f61Var.setLayoutAnimation(null);
                jg.b0 b0Var = new jg.b0(20);
                f61Var.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
                f61Var.setClipToPadding(false);
                b0Var.j1(0);
                f61Var.setLayoutManager(b0Var);
                f61Var.setAdapter(new di.l4(this, 9));
                f61Var.setOnItemClickListener(new zx0(this, 13));
                frameLayout = f61Var;
            }
            gjVar = frameLayout;
        } else {
            gjVar = new org.telegram.ui.Components.gj(this, context, 2);
            gjVar.setTag(-33024);
        }
        if (i7 == 1) {
            gjVar.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(60.0f)));
        } else {
            gjVar.setLayoutParams(new v4.q0(-1, -2));
        }
        return new v4.f1(gjVar);
    }
}
