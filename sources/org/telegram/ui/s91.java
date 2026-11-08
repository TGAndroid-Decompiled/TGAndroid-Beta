package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class s91 extends org.telegram.ui.Components.v61 implements xz {
    public final FrameLayout V;
    public final org.telegram.ui.Components.pj0 W;
    public final v4.b0 f49682a0;
    public final q91 f49683b0;
    public by0 f49684c0;
    public String f49685d0;
    public final ArrayList f49686e0;
    public final ArrayList f49687f0;
    public int f49688g0;
    public int f49689h0;
    public int f49690i0;
    public int f49691j0;
    public int f49692k0;
    public int f49693l0;
    public int m0;
    public boolean f49694n0;
    public boolean f49695o0;
    public final org.telegram.ui.Components.av0 f49696p0;
    public final org.telegram.ui.Components.si0 f49697q0;
    public boolean f49698r0;
    public final bi.g5 f49699s0;
    public final wr0 f49700t0;
    public final ArrayList f49701u0;
    public final w91 f49702v0;

    public s91(w91 w91Var, Context context) {
        super(context, null);
        this.f49702v0 = w91Var;
        this.f49685d0 = "empty";
        this.f49686e0 = new ArrayList();
        this.f49687f0 = new ArrayList();
        this.f49701u0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        this.f49700t0 = new wr0(this, 6);
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.W = pj0Var;
        q91 q91Var = new q91(this);
        this.f49683b0 = q91Var;
        pj0Var.setAdapter(q91Var);
        v4.b0 b0Var = new v4.b0();
        this.f49682a0 = b0Var;
        pj0Var.setLayoutManager(b0Var);
        pj0Var.setOnItemClickListener(new vx0(this, 10));
        pj0Var.setOnScrollListener(new b21(this, 5));
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        mzVar.setViewType(7);
        mzVar.f36172x = false;
        mzVar.setUseHeaderOffset(true);
        org.telegram.ui.Components.av0 av0Var = new org.telegram.ui.Components.av0(context, mzVar, 1, null);
        this.f49696p0 = av0Var;
        av0Var.d.setText(org.telegram.messenger.id.M0(2131748168, null));
        av0Var.f31927e.setVisibility(8);
        av0Var.setVisibility(8);
        av0Var.addView(mzVar, 0);
        av0Var.setAnimateLayoutChange(true);
        pj0Var.setEmptyView(av0Var);
        pj0Var.W1 = true;
        pj0Var.X1 = 0;
        frameLayout.addView(av0Var);
        frameLayout.addView(pj0Var);
        N();
        org.telegram.ui.Components.si0 si0Var = new org.telegram.ui.Components.si0(pj0Var, true);
        this.f49697q0 = si0Var;
        pj0Var.setItemsEnterAnimator(si0Var);
        bi.g5 g5Var = new bi.g5(this);
        this.f49699s0 = g5Var;
        setAdapter(g5Var);
    }

    public final void L(String str) {
        int i7;
        if (this.f49698r0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        w91 w91Var = this.f49702v0;
        tL_messages_search.peer = w91Var.getMessagesController().j1(-w91Var.f50992a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f27067q = str;
        ArrayList arrayList = this.f49687f0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((org.telegram.messenger.ij) jg.g.i(1, arrayList)).f1();
        }
        this.f49698r0 = true;
        i7 = ((org.telegram.ui.ActionBar.f2) w91Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_search, new n41(3, this, str));
    }

    public final void M(View view, int i7, String str, boolean z9) {
        this.f49685d0 = str;
        FrameLayout frameLayout = this.V;
        w91 w91Var = this.f49702v0;
        int i10 = 0;
        if (view == frameLayout) {
            by0 by0Var = this.f49684c0;
            if (by0Var != null) {
                org.telegram.messenger.g0.r(by0Var);
                this.f49684c0 = null;
            }
            this.f49698r0 = false;
            this.f49695o0 = false;
            ArrayList arrayList = this.f49686e0;
            arrayList.clear();
            this.f49687f0.clear();
            N();
            if (TextUtils.isEmpty(str)) {
                this.f49694n0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = w91Var.f50995b;
                    if (i10 < arrayList2.size()) {
                        if (((o91) arrayList2.get(i10)).f48337c != null) {
                            arrayList.add(((o91) arrayList2.get(i10)).f48337c);
                            ((o91) arrayList2.get(i10)).f48337c.searchQuery = null;
                        }
                        i10++;
                    } else {
                        N();
                        return;
                    }
                }
            } else {
                N();
                this.f49694n0 = true;
                this.f49696p0.e(true, true);
                by0 by0Var2 = new by0(20, this, str);
                this.f49684c0 = by0Var2;
                org.telegram.messenger.g0.i3(by0Var2, 200L);
            }
        } else if (view instanceof yz) {
            yz yzVar = (yz) view;
            yzVar.f52362c.b(0, false);
            yzVar.h(-w91Var.f50992a, 0L, 0L, 0L, jg.q0.j3[((p91) ((ArrayList) this.f49699s0.f3940b).get(i7)).f48720b], false, str, z9);
        } else if (view instanceof org.telegram.ui.Components.dl0) {
            org.telegram.ui.Components.dl0 dl0Var = (org.telegram.ui.Components.dl0) view;
            dl0Var.f33035a.b(0, false);
            dl0Var.K = str;
            dl0Var.d(false);
        }
    }

    public final void N() {
        this.f49688g0 = -1;
        this.f49689h0 = -1;
        this.f49690i0 = -1;
        this.f49691j0 = -1;
        this.f49692k0 = -1;
        this.f49693l0 = -1;
        this.m0 = 0;
        ArrayList arrayList = this.f49686e0;
        if (!arrayList.isEmpty()) {
            int i7 = this.m0;
            int i10 = i7 + 1;
            this.m0 = i10;
            this.f49688g0 = i7;
            this.f49689h0 = i10;
            int size = arrayList.size() + i10;
            this.m0 = size;
            this.f49690i0 = size;
        }
        ArrayList arrayList2 = this.f49687f0;
        if (!arrayList2.isEmpty()) {
            int i11 = this.m0;
            int i12 = i11 + 1;
            this.m0 = i12;
            this.f49691j0 = i11;
            this.f49692k0 = i12;
            int size2 = arrayList2.size() + i12;
            this.m0 = size2;
            this.f49693l0 = size2;
        }
        this.f49683b0.f();
    }

    @Override
    public final void e() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.f2) this.f49702v0).actionBar;
        kVar.O(null, null);
    }

    @Override
    public final boolean f(rz rzVar) {
        if (rzVar == null) {
            return false;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f49701u0;
            if (i7 >= arrayList.size()) {
                return false;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
            if (ijVar != null && ijVar.f1() == rzVar.f49569b && org.telegram.messenger.ij.B0(ijVar.f23262k) == rzVar.f49568a) {
                return true;
            }
            i7++;
        }
    }

    @Override
    public final void g(org.telegram.messenger.ij ijVar) {
        int i7;
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.ij.B0(ijVar.f23262k);
        boolean C = org.telegram.messenger.m5.C(B0);
        w91 w91Var = this.f49702v0;
        if (C) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (!org.telegram.messenger.m5.E(B0)) {
            i7 = ((org.telegram.ui.ActionBar.f2) w91Var).currentAccount;
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(i7).f21765a).M0(Long.valueOf(-B0));
            if (M0 != null && M0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -M0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        } else {
            bundle.putLong("user_id", B0);
        }
        bundle.putInt("message_id", ijVar.f1());
        w91Var.presentFragment(new an(bundle));
    }

    @Override
    public final void h(org.telegram.messenger.ij ijVar, View view, int i7) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f49701u0;
        if (!arrayList.remove(ijVar)) {
            arrayList.add(ijVar);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.f2) this.f49702v0).actionBar;
            kVar.u();
        }
    }

    @Override
    public final boolean i() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.f2) this.f49702v0).actionBar;
        return kVar.v();
    }
}
