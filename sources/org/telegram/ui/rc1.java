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
public final class rc1 extends org.telegram.ui.Components.oj0 {
    public org.telegram.ui.Wallet.n D;
    public final WallpapersListActivity E;
    public final Context f49483c;
    public final ArrayList d = new ArrayList();
    public final HashMap f49484e = new HashMap();
    public boolean f49485f = true;
    public String h;
    public String f49486n;
    public String f49487r;
    public int f49488s;
    public int f49489w;
    public boolean f49490x;
    public String f49491y;

    public rc1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.E = wallpapersListActivity;
        this.f49483c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f56955f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str, boolean z9) {
        int i7;
        if (str != null && this.f49486n != null) {
            str = org.telegram.ui.Cells.f1.n(this.f49486n, " ", str, new StringBuilder("#color"));
        }
        org.telegram.ui.Wallet.n nVar = this.D;
        if (nVar != null) {
            org.telegram.messenger.g0.r(nVar);
            this.D = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.f49484e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (isEmpty) {
            arrayList.clear();
            hashMap.clear();
            this.f49485f = true;
            this.h = null;
            if (this.f49488s != 0) {
                i7 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i7).cancelRequest(this.f49488s, true);
                this.f49488s = 0;
            }
            wallpapersListActivity.K.c();
        } else {
            wallpapersListActivity.K.b();
            if (z9) {
                arrayList.clear();
                hashMap.clear();
                this.f49485f = true;
                F(str, "", true);
                this.h = str;
                f();
            } else {
                org.telegram.ui.Wallet.n nVar2 = new org.telegram.ui.Wallet.n(26, this, str);
                this.D = nVar2;
                org.telegram.messenger.g0.i3(nVar2, 500L);
            }
        }
        f();
    }

    public final void F(String str, String str2, boolean z9) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.f49488s;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (i18 != 0) {
            i17 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i17).cancelRequest(this.f49488s, true);
            this.f49488s = 0;
        }
        this.f49491y = str;
        i7 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        i10 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
        TLObject f22 = s12.f2(org.telegram.messenger.qp.s1(i10).L3);
        if (!(f22 instanceof TLRPC.User)) {
            if (z9 && !this.f49490x) {
                this.f49490x = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i15 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
                tL_contacts_resolveUsername.username = org.telegram.messenger.qp.s1(i15).L3;
                i16 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i16).sendRequest(tL_contacts_resolveUsername, new l(this, 25));
                return;
            }
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = rf.b.i("#wallpaper ", str);
        i11 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = org.telegram.messenger.qp.s1(i11).q1((TLRPC.User) f22);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i19 = this.f49489w + 1;
        this.f49489w = i19;
        i12 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
        this.f49488s = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getInlineBotResults, new bi.j2(this, i19, 10));
        i13 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
        int i20 = this.f49488s;
        i14 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).classGuid;
        connectionsManager.bindRequestToGuid(i20, i14);
    }

    @Override
    public final int b() {
        if (TextUtils.isEmpty(this.h)) {
            return 2;
        }
        return (int) Math.ceil(this.d.size() / this.E.N);
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
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        Object obj;
        int i10 = d1Var.f56955f;
        View view = d1Var.f56951a;
        if (i10 != 0) {
            if (i10 == 2) {
                ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.hd.M0(2131745816, null));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
        WallpapersListActivity wallpapersListActivity = this.E;
        int i11 = i7 * wallpapersListActivity.N;
        ArrayList arrayList = this.d;
        int ceil = (int) Math.ceil(arrayList.size() / wallpapersListActivity.N);
        int i12 = wallpapersListActivity.N;
        boolean z10 = true;
        if (i11 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i11 / i12 != ceil - 1) {
            z10 = false;
        }
        uaVar.d(i12, z9, z10);
        for (int i13 = 0; i13 < wallpapersListActivity.N; i13++) {
            int i14 = i11 + i13;
            if (i14 < arrayList.size()) {
                obj = arrayList.get(i14);
            } else {
                obj = null;
            }
            uaVar.e(wallpapersListActivity.f43493r, obj, "", i13);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout piVar;
        FrameLayout frameLayout;
        Context context = this.f49483c;
        if (i7 != 0) {
            piVar = null;
            if (i7 != 1) {
                if (i7 == 2) {
                    frameLayout = new org.telegram.ui.Cells.x3(context, null);
                }
            } else {
                ?? e61Var = new e61(14, context, null);
                e61Var.setItemAnimator(null);
                e61Var.setLayoutAnimation(null);
                jg.b0 b0Var = new jg.b0(20);
                e61Var.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
                e61Var.setClipToPadding(false);
                b0Var.j1(0);
                e61Var.setLayoutManager(b0Var);
                e61Var.setAdapter(new bi.k5(this, 9));
                e61Var.setOnItemClickListener(new vx0(this, 13));
                frameLayout = e61Var;
            }
            piVar = frameLayout;
        } else {
            piVar = new org.telegram.ui.Components.pi(this, context, 2);
            piVar.setTag(-33024);
        }
        if (i7 == 1) {
            piVar.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(60.0f)));
        } else {
            piVar.setLayoutParams(new v4.o0(-1, -2));
        }
        return new v4.d1(piVar);
    }
}
