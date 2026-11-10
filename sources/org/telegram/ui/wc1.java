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
public final class wc1 extends org.telegram.ui.Components.oj0 {
    public sb1 D;
    public final WallpapersListActivity E;
    public final Context f50991c;
    public final ArrayList d = new ArrayList();
    public final HashMap f50992e = new HashMap();
    public boolean f50993f = true;
    public String h;
    public String f50994n;
    public String f50995r;
    public int f50996s;
    public int f50997w;
    public boolean f50998x;
    public String f50999y;

    public wc1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.E = wallpapersListActivity;
        this.f50991c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57056f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str, boolean z9) {
        int i7;
        if (str != null && this.f50994n != null) {
            str = org.telegram.ui.Cells.f1.n(this.f50994n, " ", str, new StringBuilder("#color"));
        }
        sb1 sb1Var = this.D;
        if (sb1Var != null) {
            org.telegram.messenger.g0.r(sb1Var);
            this.D = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.f50992e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (isEmpty) {
            arrayList.clear();
            hashMap.clear();
            this.f50993f = true;
            this.h = null;
            if (this.f50996s != 0) {
                i7 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i7).cancelRequest(this.f50996s, true);
                this.f50996s = 0;
            }
            wallpapersListActivity.K.c();
        } else {
            wallpapersListActivity.K.b();
            if (z9) {
                arrayList.clear();
                hashMap.clear();
                this.f50993f = true;
                F(str, "", true);
                this.h = str;
                f();
            } else {
                sb1 sb1Var2 = new sb1(27, this, str);
                this.D = sb1Var2;
                org.telegram.messenger.g0.i3(sb1Var2, 500L);
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
        int i18 = this.f50996s;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (i18 != 0) {
            i17 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i17).cancelRequest(this.f50996s, true);
            this.f50996s = 0;
        }
        this.f50999y = str;
        i7 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        i10 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
        TLObject f22 = s12.f2(org.telegram.messenger.qp.s1(i10).L3);
        if (!(f22 instanceof TLRPC.User)) {
            if (z9 && !this.f50998x) {
                this.f50998x = true;
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
        int i19 = this.f50997w + 1;
        this.f50997w = i19;
        i12 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
        this.f50996s = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getInlineBotResults, new bi.j2(this, i19, 10));
        i13 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
        int i20 = this.f50996s;
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
        int i10 = d1Var.f57056f;
        View view = d1Var.f57052a;
        if (i10 != 0) {
            if (i10 == 2) {
                ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.id.M0(2131745815, null));
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
            uaVar.e(wallpapersListActivity.f43502r, obj, "", i13);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout oiVar;
        FrameLayout frameLayout;
        Context context = this.f50991c;
        if (i7 != 0) {
            oiVar = null;
            if (i7 != 1) {
                if (i7 == 2) {
                    frameLayout = new org.telegram.ui.Cells.x3(context, null);
                }
            } else {
                ?? g61Var = new g61(14, context, null);
                g61Var.setItemAnimator(null);
                g61Var.setLayoutAnimation(null);
                jg.b0 b0Var = new jg.b0(20);
                g61Var.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
                g61Var.setClipToPadding(false);
                b0Var.j1(0);
                g61Var.setLayoutManager(b0Var);
                g61Var.setAdapter(new bi.k5(this, 9));
                g61Var.setOnItemClickListener(new ay0(this, 13));
                frameLayout = g61Var;
            }
            oiVar = frameLayout;
        } else {
            oiVar = new org.telegram.ui.Components.oi(this, context, 2);
            oiVar.setTag(-33024);
        }
        if (i7 == 1) {
            oiVar.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(60.0f)));
        } else {
            oiVar.setLayoutParams(new v4.o0(-1, -2));
        }
        return new v4.d1(oiVar);
    }
}
