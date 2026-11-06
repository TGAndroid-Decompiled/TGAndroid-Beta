package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class r91 extends org.telegram.ui.Components.p61 implements xz {
    public final FrameLayout V;
    public final org.telegram.ui.Components.pj0 W;
    public final v4.b0 f49395a0;
    public final p91 f49396b0;
    public by0 f49397c0;
    public String f49398d0;
    public final ArrayList f49399e0;
    public final ArrayList f49400f0;
    public int f49401g0;
    public int f49402h0;
    public int f49403i0;
    public int f49404j0;
    public int f49405k0;
    public int f49406l0;
    public int m0;
    public boolean f49407n0;
    public boolean f49408o0;
    public final org.telegram.ui.Components.av0 f49409p0;
    public final org.telegram.ui.Components.si0 f49410q0;
    public boolean f49411r0;
    public final bi.g5 f49412s0;
    public final vr0 f49413t0;
    public final ArrayList f49414u0;
    public final v91 f49415v0;

    public r91(v91 v91Var, Context context) {
        super(context, null);
        this.f49415v0 = v91Var;
        this.f49398d0 = "empty";
        this.f49399e0 = new ArrayList();
        this.f49400f0 = new ArrayList();
        this.f49414u0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        this.f49413t0 = new vr0(this, 6);
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.W = pj0Var;
        p91 p91Var = new p91(this);
        this.f49396b0 = p91Var;
        pj0Var.setAdapter(p91Var);
        v4.b0 b0Var = new v4.b0();
        this.f49395a0 = b0Var;
        pj0Var.setLayoutManager(b0Var);
        pj0Var.setOnItemClickListener(new vx0(this, 10));
        pj0Var.setOnScrollListener(new b21(this, 5));
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
        lzVar.setViewType(7);
        lzVar.f35802x = false;
        lzVar.setUseHeaderOffset(true);
        org.telegram.ui.Components.av0 av0Var = new org.telegram.ui.Components.av0(context, lzVar, 1, null);
        this.f49409p0 = av0Var;
        av0Var.d.setText(org.telegram.messenger.hd.M0(2131748166, null));
        av0Var.f31917e.setVisibility(8);
        av0Var.setVisibility(8);
        av0Var.addView(lzVar, 0);
        av0Var.setAnimateLayoutChange(true);
        pj0Var.setEmptyView(av0Var);
        pj0Var.W1 = true;
        pj0Var.X1 = 0;
        frameLayout.addView(av0Var);
        frameLayout.addView(pj0Var);
        N();
        org.telegram.ui.Components.si0 si0Var = new org.telegram.ui.Components.si0(pj0Var, true);
        this.f49410q0 = si0Var;
        pj0Var.setItemsEnterAnimator(si0Var);
        bi.g5 g5Var = new bi.g5(this);
        this.f49412s0 = g5Var;
        setAdapter(g5Var);
    }

    public final void L(String str) {
        int i7;
        if (this.f49411r0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        v91 v91Var = this.f49415v0;
        tL_messages_search.peer = v91Var.getMessagesController().j1(-v91Var.f50619a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f27063q = str;
        ArrayList arrayList = this.f49400f0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((org.telegram.messenger.ij) jg.g.i(1, arrayList)).f1();
        }
        this.f49411r0 = true;
        i7 = ((org.telegram.ui.ActionBar.f2) v91Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_search, new n41(3, this, str));
    }

    public final void M(View view, int i7, String str, boolean z9) {
        this.f49398d0 = str;
        FrameLayout frameLayout = this.V;
        v91 v91Var = this.f49415v0;
        int i10 = 0;
        if (view == frameLayout) {
            by0 by0Var = this.f49397c0;
            if (by0Var != null) {
                org.telegram.messenger.g0.r(by0Var);
                this.f49397c0 = null;
            }
            this.f49411r0 = false;
            this.f49408o0 = false;
            ArrayList arrayList = this.f49399e0;
            arrayList.clear();
            this.f49400f0.clear();
            N();
            if (TextUtils.isEmpty(str)) {
                this.f49407n0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = v91Var.f50622b;
                    if (i10 < arrayList2.size()) {
                        if (((n91) arrayList2.get(i10)).f47974c != null) {
                            arrayList.add(((n91) arrayList2.get(i10)).f47974c);
                            ((n91) arrayList2.get(i10)).f47974c.searchQuery = null;
                        }
                        i10++;
                    } else {
                        N();
                        return;
                    }
                }
            } else {
                N();
                this.f49407n0 = true;
                this.f49409p0.e(true, true);
                by0 by0Var2 = new by0(20, this, str);
                this.f49397c0 = by0Var2;
                org.telegram.messenger.g0.i3(by0Var2, 200L);
            }
        } else if (view instanceof yz) {
            yz yzVar = (yz) view;
            yzVar.f52377c.b(0, false);
            yzVar.h(-v91Var.f50619a, 0L, 0L, 0L, jg.q0.j3[((o91) ((ArrayList) this.f49412s0.f3940b).get(i7)).f48311b], false, str, z9);
        } else if (view instanceof org.telegram.ui.Components.dl0) {
            org.telegram.ui.Components.dl0 dl0Var = (org.telegram.ui.Components.dl0) view;
            dl0Var.f32985a.b(0, false);
            dl0Var.K = str;
            dl0Var.d(false);
        }
    }

    public final void N() {
        this.f49401g0 = -1;
        this.f49402h0 = -1;
        this.f49403i0 = -1;
        this.f49404j0 = -1;
        this.f49405k0 = -1;
        this.f49406l0 = -1;
        this.m0 = 0;
        ArrayList arrayList = this.f49399e0;
        if (!arrayList.isEmpty()) {
            int i7 = this.m0;
            int i10 = i7 + 1;
            this.m0 = i10;
            this.f49401g0 = i7;
            this.f49402h0 = i10;
            int size = arrayList.size() + i10;
            this.m0 = size;
            this.f49403i0 = size;
        }
        ArrayList arrayList2 = this.f49400f0;
        if (!arrayList2.isEmpty()) {
            int i11 = this.m0;
            int i12 = i11 + 1;
            this.m0 = i12;
            this.f49404j0 = i11;
            this.f49405k0 = i12;
            int size2 = arrayList2.size() + i12;
            this.m0 = size2;
            this.f49406l0 = size2;
        }
        this.f49396b0.f();
    }

    @Override
    public final void e() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.f2) this.f49415v0).actionBar;
        kVar.O(null, null);
    }

    @Override
    public final boolean f(rz rzVar) {
        if (rzVar == null) {
            return false;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f49414u0;
            if (i7 >= arrayList.size()) {
                return false;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
            if (ijVar != null && ijVar.f1() == rzVar.f49570b && org.telegram.messenger.ij.B0(ijVar.f23237k) == rzVar.f49569a) {
                return true;
            }
            i7++;
        }
    }

    @Override
    public final void g(org.telegram.messenger.ij ijVar) {
        int i7;
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.ij.B0(ijVar.f23237k);
        boolean C = org.telegram.messenger.m5.C(B0);
        v91 v91Var = this.f49415v0;
        if (C) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (!org.telegram.messenger.m5.E(B0)) {
            i7 = ((org.telegram.ui.ActionBar.f2) v91Var).currentAccount;
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(i7).f21723a).M0(Long.valueOf(-B0));
            if (M0 != null && M0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -M0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        } else {
            bundle.putLong("user_id", B0);
        }
        bundle.putInt("message_id", ijVar.f1());
        v91Var.presentFragment(new an(bundle));
    }

    @Override
    public final void h(org.telegram.messenger.ij ijVar, View view, int i7) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f49414u0;
        if (!arrayList.remove(ijVar)) {
            arrayList.add(ijVar);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.f2) this.f49415v0).actionBar;
            kVar.u();
        }
    }

    @Override
    public final boolean i() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.f2) this.f49415v0).actionBar;
        return kVar.v();
    }
}
