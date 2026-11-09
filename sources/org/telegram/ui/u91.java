package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u91 extends org.telegram.ui.Components.w61 implements zz {
    public final FrameLayout V;
    public final org.telegram.ui.Components.qj0 W;
    public final v4.b0 f50324a0;
    public final s91 f50325b0;
    public ax0 f50326c0;
    public String f50327d0;
    public final ArrayList f50328e0;
    public final ArrayList f50329f0;
    public int f50330g0;
    public int f50331h0;
    public int f50332i0;
    public int f50333j0;
    public int f50334k0;
    public int f50335l0;
    public int m0;
    public boolean f50336n0;
    public boolean f50337o0;
    public final org.telegram.ui.Components.cv0 f50338p0;
    public final org.telegram.ui.Components.ti0 f50339q0;
    public boolean f50340r0;
    public final bi.g5 f50341s0;
    public final yr0 f50342t0;
    public final ArrayList f50343u0;
    public final y91 f50344v0;

    public u91(y91 y91Var, Context context) {
        super(context, null);
        this.f50344v0 = y91Var;
        this.f50327d0 = "empty";
        this.f50328e0 = new ArrayList();
        this.f50329f0 = new ArrayList();
        this.f50343u0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        this.f50342t0 = new yr0(this, 6);
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.W = qj0Var;
        s91 s91Var = new s91(this);
        this.f50325b0 = s91Var;
        qj0Var.setAdapter(s91Var);
        v4.b0 b0Var = new v4.b0();
        this.f50324a0 = b0Var;
        qj0Var.setLayoutManager(b0Var);
        qj0Var.setOnItemClickListener(new zx0(this, 10));
        qj0Var.setOnScrollListener(new d21(this, 5));
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        mzVar.setViewType(7);
        mzVar.f36181x = false;
        mzVar.setUseHeaderOffset(true);
        org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(context, mzVar, 1, null);
        this.f50338p0 = cv0Var;
        cv0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        cv0Var.f32768e.setVisibility(8);
        cv0Var.setVisibility(8);
        cv0Var.addView(mzVar, 0);
        cv0Var.setAnimateLayoutChange(true);
        qj0Var.setEmptyView(cv0Var);
        qj0Var.W1 = true;
        qj0Var.X1 = 0;
        frameLayout.addView(cv0Var);
        frameLayout.addView(qj0Var);
        N();
        org.telegram.ui.Components.ti0 ti0Var = new org.telegram.ui.Components.ti0(qj0Var, true);
        this.f50339q0 = ti0Var;
        qj0Var.setItemsEnterAnimator(ti0Var);
        bi.g5 g5Var = new bi.g5(this);
        this.f50341s0 = g5Var;
        setAdapter(g5Var);
    }

    public final void L(String str) {
        int i7;
        if (this.f50340r0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        y91 y91Var = this.f50344v0;
        tL_messages_search.peer = y91Var.getMessagesController().j1(-y91Var.f52013a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f27067q = str;
        ArrayList arrayList = this.f50329f0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((org.telegram.messenger.ij) jg.g.i(1, arrayList)).e1();
        }
        this.f50340r0 = true;
        i7 = ((org.telegram.ui.ActionBar.f2) y91Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_search, new o41(3, this, str));
    }

    public final void M(View view, int i7, String str, boolean z9) {
        this.f50327d0 = str;
        FrameLayout frameLayout = this.V;
        y91 y91Var = this.f50344v0;
        int i10 = 0;
        if (view == frameLayout) {
            ax0 ax0Var = this.f50326c0;
            if (ax0Var != null) {
                org.telegram.messenger.g0.r(ax0Var);
                this.f50326c0 = null;
            }
            this.f50340r0 = false;
            this.f50337o0 = false;
            ArrayList arrayList = this.f50328e0;
            arrayList.clear();
            this.f50329f0.clear();
            N();
            if (TextUtils.isEmpty(str)) {
                this.f50336n0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = y91Var.f52016b;
                    if (i10 < arrayList2.size()) {
                        if (((q91) arrayList2.get(i10)).f48989c != null) {
                            arrayList.add(((q91) arrayList2.get(i10)).f48989c);
                            ((q91) arrayList2.get(i10)).f48989c.searchQuery = null;
                        }
                        i10++;
                    } else {
                        N();
                        return;
                    }
                }
            } else {
                N();
                this.f50336n0 = true;
                this.f50338p0.e(true, true);
                ax0 ax0Var2 = new ax0(21, this, str);
                this.f50326c0 = ax0Var2;
                org.telegram.messenger.g0.i3(ax0Var2, 200L);
            }
        } else if (view instanceof a00) {
            a00 a00Var = (a00) view;
            a00Var.f43514c.b(0, false);
            a00Var.h(-y91Var.f52013a, 0L, 0L, 0L, jg.q0.j3[((r91) ((ArrayList) this.f50341s0.f3940b).get(i7)).f49356b], false, str, z9);
        } else if (view instanceof org.telegram.ui.Components.el0) {
            org.telegram.ui.Components.el0 el0Var = (org.telegram.ui.Components.el0) view;
            el0Var.f33437a.b(0, false);
            el0Var.K = str;
            el0Var.d(false);
        }
    }

    public final void N() {
        this.f50330g0 = -1;
        this.f50331h0 = -1;
        this.f50332i0 = -1;
        this.f50333j0 = -1;
        this.f50334k0 = -1;
        this.f50335l0 = -1;
        this.m0 = 0;
        ArrayList arrayList = this.f50328e0;
        if (!arrayList.isEmpty()) {
            int i7 = this.m0;
            int i10 = i7 + 1;
            this.m0 = i10;
            this.f50330g0 = i7;
            this.f50331h0 = i10;
            int size = arrayList.size() + i10;
            this.m0 = size;
            this.f50332i0 = size;
        }
        ArrayList arrayList2 = this.f50329f0;
        if (!arrayList2.isEmpty()) {
            int i11 = this.m0;
            int i12 = i11 + 1;
            this.m0 = i12;
            this.f50333j0 = i11;
            this.f50334k0 = i12;
            int size2 = arrayList2.size() + i12;
            this.m0 = size2;
            this.f50335l0 = size2;
        }
        this.f50325b0.f();
    }

    @Override
    public final void e() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.f2) this.f50344v0).actionBar;
        kVar.P(null, null);
    }

    @Override
    public final boolean f(tz tzVar) {
        if (tzVar == null) {
            return false;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f50343u0;
            if (i7 >= arrayList.size()) {
                return false;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
            if (ijVar != null && ijVar.e1() == tzVar.f50268b && org.telegram.messenger.ij.B0(ijVar.f23262k) == tzVar.f50267a) {
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
        y91 y91Var = this.f50344v0;
        if (C) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (!org.telegram.messenger.m5.E(B0)) {
            i7 = ((org.telegram.ui.ActionBar.f2) y91Var).currentAccount;
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(i7).f21765a).M0(Long.valueOf(-B0));
            if (M0 != null && M0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -M0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        } else {
            bundle.putLong("user_id", B0);
        }
        bundle.putInt("message_id", ijVar.e1());
        y91Var.presentFragment(new cn(bundle));
    }

    @Override
    public final void h(org.telegram.messenger.ij ijVar, View view, int i7) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f50343u0;
        if (!arrayList.remove(ijVar)) {
            arrayList.add(ijVar);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.f2) this.f50344v0).actionBar;
            kVar.v();
        }
    }

    @Override
    public final boolean i() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.f2) this.f50344v0).actionBar;
        return kVar.w();
    }
}
