package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u91 extends org.telegram.ui.Components.j71 implements b00 {
    public final FrameLayout W;
    public final org.telegram.ui.Components.ek0 f52474a0;
    public final v4.b0 f52475b0;
    public final s91 f52476c0;
    public b31 f52477d0;
    public String f52478e0;
    public final ArrayList f52479f0;
    public final ArrayList f52480g0;
    public int f52481h0;
    public int f52482i0;
    public int f52483j0;
    public int f52484k0;
    public int f52485l0;
    public int m0;
    public int f52486n0;
    public boolean f52487o0;
    public boolean f52488p0;
    public final org.telegram.ui.Components.nv0 f52489q0;
    public final org.telegram.ui.Components.hj0 f52490r0;
    public boolean f52491s0;
    public final di.i4 f52492t0;
    public final yr0 f52493u0;
    public final ArrayList f52494v0;
    public final y91 f52495w0;

    public u91(y91 y91Var, Context context) {
        super(context, null);
        this.f52495w0 = y91Var;
        this.f52478e0 = "empty";
        this.f52479f0 = new ArrayList();
        this.f52480g0 = new ArrayList();
        this.f52494v0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        this.f52493u0 = new yr0(this, 6);
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f52474a0 = ek0Var;
        s91 s91Var = new s91(this);
        this.f52476c0 = s91Var;
        ek0Var.setAdapter(s91Var);
        v4.b0 b0Var = new v4.b0();
        this.f52475b0 = b0Var;
        ek0Var.setLayoutManager(b0Var);
        ek0Var.setOnItemClickListener(new zx0(this, 10));
        ek0Var.setOnScrollListener(new c21(this, 5));
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
        yzVar.setViewType(7);
        yzVar.f42563x = false;
        yzVar.setUseHeaderOffset(true);
        org.telegram.ui.Components.nv0 nv0Var = new org.telegram.ui.Components.nv0(context, yzVar, 1, null);
        this.f52489q0 = nv0Var;
        nv0Var.d.setText(org.telegram.messenger.hd.N0(2131747974, null));
        nv0Var.f37962e.setVisibility(8);
        nv0Var.setVisibility(8);
        nv0Var.addView(yzVar, 0);
        nv0Var.setAnimateLayoutChange(true);
        ek0Var.setEmptyView(nv0Var);
        ek0Var.X1 = true;
        ek0Var.Y1 = 0;
        frameLayout.addView(nv0Var);
        frameLayout.addView(ek0Var);
        J();
        org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(ek0Var, true);
        this.f52490r0 = hj0Var;
        ek0Var.setItemsEnterAnimator(hj0Var);
        di.i4 i4Var = new di.i4(this);
        this.f52492t0 = i4Var;
        setAdapter(i4Var);
    }

    public final void H(String str) {
        int i7;
        if (this.f52491s0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        y91 y91Var = this.f52495w0;
        tL_messages_search.peer = y91Var.getMessagesController().l1(-y91Var.f54075a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f28509q = str;
        ArrayList arrayList = this.f52480g0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((org.telegram.messenger.gj) i5.c.h(1, arrayList)).e1();
        }
        this.f52491s0 = true;
        i7 = ((org.telegram.ui.ActionBar.g2) y91Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_search, new e31(5, this, str));
    }

    public final void I(View view, int i7, String str, boolean z10) {
        this.f52478e0 = str;
        FrameLayout frameLayout = this.W;
        y91 y91Var = this.f52495w0;
        int i10 = 0;
        if (view == frameLayout) {
            b31 b31Var = this.f52477d0;
            if (b31Var != null) {
                org.telegram.messenger.g0.r(b31Var);
                this.f52477d0 = null;
            }
            this.f52491s0 = false;
            this.f52488p0 = false;
            ArrayList arrayList = this.f52479f0;
            arrayList.clear();
            this.f52480g0.clear();
            J();
            if (TextUtils.isEmpty(str)) {
                this.f52487o0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = y91Var.f54078b;
                    if (i10 < arrayList2.size()) {
                        if (((q91) arrayList2.get(i10)).f51084c != null) {
                            arrayList.add(((q91) arrayList2.get(i10)).f51084c);
                            ((q91) arrayList2.get(i10)).f51084c.searchQuery = null;
                        }
                        i10++;
                    } else {
                        J();
                        return;
                    }
                }
            } else {
                J();
                this.f52487o0 = true;
                this.f52489q0.e(true, true);
                b31 b31Var2 = new b31(12, this, str);
                this.f52477d0 = b31Var2;
                org.telegram.messenger.g0.h3(b31Var2, 200L);
            }
        } else if (view instanceof c00) {
            c00 c00Var = (c00) view;
            c00Var.f46343c.b(0, false);
            c00Var.h(-y91Var.f54075a, 0L, 0L, 0L, jg.q0.f17614k3[((r91) ((ArrayList) this.f52492t0.f9001b).get(i7)).f51558b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.sl0) {
            org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) view;
            sl0Var.f39571a.b(0, false);
            sl0Var.L = str;
            sl0Var.d(false);
        }
    }

    public final void J() {
        this.f52481h0 = -1;
        this.f52482i0 = -1;
        this.f52483j0 = -1;
        this.f52484k0 = -1;
        this.f52485l0 = -1;
        this.m0 = -1;
        this.f52486n0 = 0;
        ArrayList arrayList = this.f52479f0;
        if (!arrayList.isEmpty()) {
            int i7 = this.f52486n0;
            int i10 = i7 + 1;
            this.f52486n0 = i10;
            this.f52481h0 = i7;
            this.f52482i0 = i10;
            int size = arrayList.size() + i10;
            this.f52486n0 = size;
            this.f52483j0 = size;
        }
        ArrayList arrayList2 = this.f52480g0;
        if (!arrayList2.isEmpty()) {
            int i11 = this.f52486n0;
            int i12 = i11 + 1;
            this.f52486n0 = i12;
            this.f52484k0 = i11;
            this.f52485l0 = i12;
            int size2 = arrayList2.size() + i12;
            this.f52486n0 = size2;
            this.m0 = size2;
        }
        this.f52476c0.f();
    }

    @Override
    public final boolean V1() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.g2) this.f52495w0).actionBar;
        return kVar.x();
    }

    @Override
    public final void Z0(org.telegram.messenger.gj gjVar, View view, int i7) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f52494v0;
        if (!arrayList.remove(gjVar)) {
            arrayList.add(gjVar);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.g2) this.f52495w0).actionBar;
            kVar.w();
        }
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.g2) this.f52495w0).actionBar;
        kVar.R(null, null);
    }

    @Override
    public final boolean r0(vz vzVar) {
        if (vzVar == null) {
            return false;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f52494v0;
            if (i7 >= arrayList.size()) {
                return false;
            }
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i7);
            if (gjVar != null && gjVar.e1() == vzVar.f52890b && org.telegram.messenger.gj.B0(gjVar.f24177k) == vzVar.f52889a) {
                return true;
            }
            i7++;
        }
    }

    @Override
    public final void t0(org.telegram.messenger.gj gjVar) {
        int i7;
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.gj.B0(gjVar.f24177k);
        boolean C = org.telegram.messenger.n5.C(B0);
        y91 y91Var = this.f52495w0;
        if (C) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (!org.telegram.messenger.n5.E(B0)) {
            i7 = ((org.telegram.ui.ActionBar.g2) y91Var).currentAccount;
            TLRPC.Chat O0 = org.telegram.messenger.np.u1(org.telegram.messenger.c.a(i7).f23166a).O0(Long.valueOf(-B0));
            if (O0 != null && O0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -O0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        } else {
            bundle.putLong("user_id", B0);
        }
        bundle.putInt("message_id", gjVar.e1());
        y91Var.presentFragment(new bn(bundle));
    }
}
