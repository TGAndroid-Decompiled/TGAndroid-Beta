package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class v91 extends org.telegram.ui.Components.v61 implements a00 {
    public final FrameLayout V;
    public final org.telegram.ui.Components.pj0 W;
    public final v4.b0 f50662a0;
    public final t91 f50663b0;
    public rw0 f50664c0;
    public String f50665d0;
    public final ArrayList f50666e0;
    public final ArrayList f50667f0;
    public int f50668g0;
    public int f50669h0;
    public int f50670i0;
    public int f50671j0;
    public int f50672k0;
    public int f50673l0;
    public int m0;
    public boolean f50674n0;
    public boolean f50675o0;
    public final org.telegram.ui.Components.bv0 f50676p0;
    public final org.telegram.ui.Components.si0 f50677q0;
    public boolean f50678r0;
    public final bi.g5 f50679s0;
    public final zr0 f50680t0;
    public final ArrayList f50681u0;
    public final z91 f50682v0;

    public v91(z91 z91Var, Context context) {
        super(context, null);
        this.f50682v0 = z91Var;
        this.f50665d0 = "empty";
        this.f50666e0 = new ArrayList();
        this.f50667f0 = new ArrayList();
        this.f50681u0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        this.f50680t0 = new zr0(this, 6);
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.W = pj0Var;
        t91 t91Var = new t91(this);
        this.f50663b0 = t91Var;
        pj0Var.setAdapter(t91Var);
        v4.b0 b0Var = new v4.b0();
        this.f50662a0 = b0Var;
        pj0Var.setLayoutManager(b0Var);
        pj0Var.setOnItemClickListener(new ay0(this, 10));
        pj0Var.setOnScrollListener(new e21(this, 5));
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
        lzVar.setViewType(7);
        lzVar.f35774x = false;
        lzVar.setUseHeaderOffset(true);
        org.telegram.ui.Components.bv0 bv0Var = new org.telegram.ui.Components.bv0(context, lzVar, 1, null);
        this.f50676p0 = bv0Var;
        bv0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        bv0Var.f32368e.setVisibility(8);
        bv0Var.setVisibility(8);
        bv0Var.addView(lzVar, 0);
        bv0Var.setAnimateLayoutChange(true);
        pj0Var.setEmptyView(bv0Var);
        pj0Var.W1 = true;
        pj0Var.X1 = 0;
        frameLayout.addView(bv0Var);
        frameLayout.addView(pj0Var);
        N();
        org.telegram.ui.Components.si0 si0Var = new org.telegram.ui.Components.si0(pj0Var, true);
        this.f50677q0 = si0Var;
        pj0Var.setItemsEnterAnimator(si0Var);
        bi.g5 g5Var = new bi.g5(this);
        this.f50679s0 = g5Var;
        setAdapter(g5Var);
    }

    public final void L(String str) {
        int i7;
        if (this.f50678r0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        z91 z91Var = this.f50682v0;
        tL_messages_search.peer = z91Var.getMessagesController().j1(-z91Var.f52343a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f27071q = str;
        ArrayList arrayList = this.f50667f0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((org.telegram.messenger.ij) jg.g.i(1, arrayList)).e1();
        }
        this.f50678r0 = true;
        i7 = ((org.telegram.ui.ActionBar.f2) z91Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_search, new p41(3, this, str));
    }

    public final void M(View view, int i7, String str, boolean z9) {
        this.f50665d0 = str;
        FrameLayout frameLayout = this.V;
        z91 z91Var = this.f50682v0;
        int i10 = 0;
        if (view == frameLayout) {
            rw0 rw0Var = this.f50664c0;
            if (rw0Var != null) {
                org.telegram.messenger.g0.r(rw0Var);
                this.f50664c0 = null;
            }
            this.f50678r0 = false;
            this.f50675o0 = false;
            ArrayList arrayList = this.f50666e0;
            arrayList.clear();
            this.f50667f0.clear();
            N();
            if (TextUtils.isEmpty(str)) {
                this.f50674n0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = z91Var.f52346b;
                    if (i10 < arrayList2.size()) {
                        if (((r91) arrayList2.get(i10)).f49322c != null) {
                            arrayList.add(((r91) arrayList2.get(i10)).f49322c);
                            ((r91) arrayList2.get(i10)).f49322c.searchQuery = null;
                        }
                        i10++;
                    } else {
                        N();
                        return;
                    }
                }
            } else {
                N();
                this.f50674n0 = true;
                this.f50676p0.e(true, true);
                rw0 rw0Var2 = new rw0(22, this, str);
                this.f50664c0 = rw0Var2;
                org.telegram.messenger.g0.i3(rw0Var2, 200L);
            }
        } else if (view instanceof b00) {
            b00 b00Var = (b00) view;
            b00Var.f43864c.b(0, false);
            b00Var.h(-z91Var.f52343a, 0L, 0L, 0L, jg.q0.j3[((s91) ((ArrayList) this.f50679s0.f3937b).get(i7)).f49765b], false, str, z9);
        } else if (view instanceof org.telegram.ui.Components.dl0) {
            org.telegram.ui.Components.dl0 dl0Var = (org.telegram.ui.Components.dl0) view;
            dl0Var.f33022a.b(0, false);
            dl0Var.K = str;
            dl0Var.d(false);
        }
    }

    public final void N() {
        this.f50668g0 = -1;
        this.f50669h0 = -1;
        this.f50670i0 = -1;
        this.f50671j0 = -1;
        this.f50672k0 = -1;
        this.f50673l0 = -1;
        this.m0 = 0;
        ArrayList arrayList = this.f50666e0;
        if (!arrayList.isEmpty()) {
            int i7 = this.m0;
            int i10 = i7 + 1;
            this.m0 = i10;
            this.f50668g0 = i7;
            this.f50669h0 = i10;
            int size = arrayList.size() + i10;
            this.m0 = size;
            this.f50670i0 = size;
        }
        ArrayList arrayList2 = this.f50667f0;
        if (!arrayList2.isEmpty()) {
            int i11 = this.m0;
            int i12 = i11 + 1;
            this.m0 = i12;
            this.f50671j0 = i11;
            this.f50672k0 = i12;
            int size2 = arrayList2.size() + i12;
            this.m0 = size2;
            this.f50673l0 = size2;
        }
        this.f50663b0.f();
    }

    @Override
    public final void e() {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.f2) this.f50682v0).actionBar;
        lVar.Q(null, null);
    }

    @Override
    public final boolean f(uz uzVar) {
        if (uzVar == null) {
            return false;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f50681u0;
            if (i7 >= arrayList.size()) {
                return false;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
            if (ijVar != null && ijVar.e1() == uzVar.f50596b && org.telegram.messenger.ij.B0(ijVar.f23266k) == uzVar.f50595a) {
                return true;
            }
            i7++;
        }
    }

    @Override
    public final void g(org.telegram.messenger.ij ijVar) {
        int i7;
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.ij.B0(ijVar.f23266k);
        boolean C = org.telegram.messenger.m5.C(B0);
        z91 z91Var = this.f50682v0;
        if (C) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (!org.telegram.messenger.m5.E(B0)) {
            i7 = ((org.telegram.ui.ActionBar.f2) z91Var).currentAccount;
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(i7).f21770a).M0(Long.valueOf(-B0));
            if (M0 != null && M0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -M0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        } else {
            bundle.putLong("user_id", B0);
        }
        bundle.putInt("message_id", ijVar.e1());
        z91Var.presentFragment(new cn(bundle));
    }

    @Override
    public final void h(org.telegram.messenger.ij ijVar, View view, int i7) {
        org.telegram.ui.ActionBar.l lVar;
        ArrayList arrayList = this.f50681u0;
        if (!arrayList.remove(ijVar)) {
            arrayList.add(ijVar);
        }
        if (arrayList.isEmpty()) {
            lVar = ((org.telegram.ui.ActionBar.f2) this.f50682v0).actionBar;
            lVar.w();
        }
    }

    @Override
    public final boolean i() {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.f2) this.f50682v0).actionBar;
        return lVar.x();
    }
}
