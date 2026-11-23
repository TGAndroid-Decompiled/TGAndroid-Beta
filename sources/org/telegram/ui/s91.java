package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class s91 extends org.telegram.ui.Components.k71 implements a00 {
    public final FrameLayout W;
    public final org.telegram.ui.Components.ek0 f52006a0;
    public final v4.c0 f52007b0;
    public final q91 f52008c0;
    public iy0 f52009d0;
    public String f52010e0;
    public final ArrayList f52011f0;
    public final ArrayList f52012g0;
    public int f52013h0;
    public int f52014i0;
    public int f52015j0;
    public int f52016k0;
    public int f52017l0;
    public int m0;
    public int f52018n0;
    public boolean f52019o0;
    public boolean f52020p0;
    public final org.telegram.ui.Components.mv0 f52021q0;
    public final org.telegram.ui.Components.hj0 f52022r0;
    public boolean f52023s0;
    public final di.i4 f52024t0;
    public final wr0 f52025u0;
    public final ArrayList f52026v0;
    public final w91 f52027w0;

    public s91(w91 w91Var, Context context) {
        super(context, null);
        this.f52027w0 = w91Var;
        this.f52010e0 = "empty";
        this.f52011f0 = new ArrayList();
        this.f52012g0 = new ArrayList();
        this.f52026v0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        this.f52025u0 = new wr0(this, 6);
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f52006a0 = ek0Var;
        q91 q91Var = new q91(this);
        this.f52008c0 = q91Var;
        ek0Var.setAdapter(q91Var);
        v4.c0 c0Var = new v4.c0();
        this.f52007b0 = c0Var;
        ek0Var.setLayoutManager(c0Var);
        ek0Var.setOnItemClickListener(new xx0(this, 10));
        ek0Var.setOnScrollListener(new b21(this, 5));
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
        vzVar.setViewType(7);
        vzVar.f41457x = false;
        vzVar.setUseHeaderOffset(true);
        org.telegram.ui.Components.mv0 mv0Var = new org.telegram.ui.Components.mv0(context, vzVar, 1, null);
        this.f52021q0 = mv0Var;
        mv0Var.d.setText(org.telegram.messenger.gd.N0(2131747974, null));
        mv0Var.f37553e.setVisibility(8);
        mv0Var.setVisibility(8);
        mv0Var.addView(vzVar, 0);
        mv0Var.setAnimateLayoutChange(true);
        ek0Var.setEmptyView(mv0Var);
        ek0Var.X1 = true;
        ek0Var.Y1 = 0;
        frameLayout.addView(mv0Var);
        frameLayout.addView(ek0Var);
        L();
        org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(ek0Var, true);
        this.f52022r0 = hj0Var;
        ek0Var.setItemsEnterAnimator(hj0Var);
        di.i4 i4Var = new di.i4(this);
        this.f52024t0 = i4Var;
        setAdapter(i4Var);
    }

    @Override
    public final void B(org.telegram.messenger.fj fjVar) {
        int i7;
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.fj.B0(fjVar.f24073k);
        boolean C = org.telegram.messenger.n5.C(B0);
        w91 w91Var = this.f52027w0;
        if (C) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (!org.telegram.messenger.n5.E(B0)) {
            i7 = ((org.telegram.ui.ActionBar.g2) w91Var).currentAccount;
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(org.telegram.messenger.c.a(i7).f23343a).O0(Long.valueOf(-B0));
            if (O0 != null && O0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -O0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        } else {
            bundle.putLong("user_id", B0);
        }
        bundle.putInt("message_id", fjVar.e1());
        w91Var.presentFragment(new bn(bundle));
    }

    public final void J(String str) {
        int i7;
        if (this.f52023s0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        w91 w91Var = this.f52027w0;
        tL_messages_search.peer = w91Var.getMessagesController().l1(-w91Var.f53216a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f28603q = str;
        ArrayList arrayList = this.f52012g0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((org.telegram.messenger.fj) i5.c.h(1, arrayList)).e1();
        }
        this.f52023s0 = true;
        i7 = ((org.telegram.ui.ActionBar.g2) w91Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_search, new d31(5, this, str));
    }

    public final void K(View view, int i7, String str, boolean z10) {
        this.f52010e0 = str;
        FrameLayout frameLayout = this.W;
        w91 w91Var = this.f52027w0;
        int i10 = 0;
        if (view == frameLayout) {
            iy0 iy0Var = this.f52009d0;
            if (iy0Var != null) {
                org.telegram.messenger.g0.r(iy0Var);
                this.f52009d0 = null;
            }
            this.f52023s0 = false;
            this.f52020p0 = false;
            ArrayList arrayList = this.f52011f0;
            arrayList.clear();
            this.f52012g0.clear();
            L();
            if (TextUtils.isEmpty(str)) {
                this.f52019o0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = w91Var.f53219b;
                    if (i10 < arrayList2.size()) {
                        if (((o91) arrayList2.get(i10)).f50609c != null) {
                            arrayList.add(((o91) arrayList2.get(i10)).f50609c);
                            ((o91) arrayList2.get(i10)).f50609c.searchQuery = null;
                        }
                        i10++;
                    } else {
                        L();
                        return;
                    }
                }
            } else {
                L();
                this.f52019o0 = true;
                this.f52021q0.e(true, true);
                iy0 iy0Var2 = new iy0(18, this, str);
                this.f52009d0 = iy0Var2;
                org.telegram.messenger.g0.h3(iy0Var2, 200L);
            }
        } else if (view instanceof b00) {
            b00 b00Var = (b00) view;
            b00Var.f45847c.b(0, false);
            b00Var.h(-w91Var.f53216a, 0L, 0L, 0L, jg.q0.f17716k3[((p91) ((ArrayList) this.f52024t0.f8998b).get(i7)).f50915b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.sl0) {
            org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) view;
            sl0Var.f39638a.b(0, false);
            sl0Var.L = str;
            sl0Var.d(false);
        }
    }

    public final void L() {
        this.f52013h0 = -1;
        this.f52014i0 = -1;
        this.f52015j0 = -1;
        this.f52016k0 = -1;
        this.f52017l0 = -1;
        this.m0 = -1;
        this.f52018n0 = 0;
        ArrayList arrayList = this.f52011f0;
        if (!arrayList.isEmpty()) {
            int i7 = this.f52018n0;
            int i10 = i7 + 1;
            this.f52018n0 = i10;
            this.f52013h0 = i7;
            this.f52014i0 = i10;
            int size = arrayList.size() + i10;
            this.f52018n0 = size;
            this.f52015j0 = size;
        }
        ArrayList arrayList2 = this.f52012g0;
        if (!arrayList2.isEmpty()) {
            int i11 = this.f52018n0;
            int i12 = i11 + 1;
            this.f52018n0 = i12;
            this.f52016k0 = i11;
            this.f52017l0 = i12;
            int size2 = arrayList2.size() + i12;
            this.f52018n0 = size2;
            this.m0 = size2;
        }
        this.f52008c0.f();
    }

    @Override
    public final void S(org.telegram.messenger.fj fjVar, View view, int i7) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f52026v0;
        if (!arrayList.remove(fjVar)) {
            arrayList.add(fjVar);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.g2) this.f52027w0).actionBar;
            kVar.w();
        }
    }

    @Override
    public final void h() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.g2) this.f52027w0).actionBar;
        kVar.R(null, null);
    }

    @Override
    public final boolean i0() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.g2) this.f52027w0).actionBar;
        return kVar.x();
    }

    @Override
    public final boolean j(uz uzVar) {
        if (uzVar == null) {
            return false;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f52026v0;
            if (i7 >= arrayList.size()) {
                return false;
            }
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i7);
            if (fjVar != null && fjVar.e1() == uzVar.f52762b && org.telegram.messenger.fj.B0(fjVar.f24073k) == uzVar.f52761a) {
                return true;
            }
            i7++;
        }
    }
}
