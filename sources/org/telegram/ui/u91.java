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
    public final org.telegram.ui.Components.ek0 f52486a0;
    public final v4.c0 f52487b0;
    public final s91 f52488c0;
    public mz0 f52489d0;
    public String f52490e0;
    public final ArrayList f52491f0;
    public final ArrayList f52492g0;
    public int f52493h0;
    public int f52494i0;
    public int f52495j0;
    public int f52496k0;
    public int f52497l0;
    public int m0;
    public int f52498n0;
    public boolean f52499o0;
    public boolean f52500p0;
    public final org.telegram.ui.Components.nv0 f52501q0;
    public final org.telegram.ui.Components.hj0 f52502r0;
    public boolean f52503s0;
    public final di.i4 f52504t0;
    public final xr0 f52505u0;
    public final ArrayList f52506v0;
    public final y91 f52507w0;

    public u91(y91 y91Var, Context context) {
        super(context, null);
        this.f52507w0 = y91Var;
        this.f52490e0 = "empty";
        this.f52491f0 = new ArrayList();
        this.f52492g0 = new ArrayList();
        this.f52506v0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        this.f52505u0 = new xr0(this, 6);
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f52486a0 = ek0Var;
        s91 s91Var = new s91(this);
        this.f52488c0 = s91Var;
        ek0Var.setAdapter(s91Var);
        v4.c0 c0Var = new v4.c0();
        this.f52487b0 = c0Var;
        ek0Var.setLayoutManager(c0Var);
        ek0Var.setOnItemClickListener(new zx0(this, 10));
        ek0Var.setOnScrollListener(new d21(this, 5));
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
        yzVar.setViewType(7);
        yzVar.f42606x = false;
        yzVar.setUseHeaderOffset(true);
        org.telegram.ui.Components.nv0 nv0Var = new org.telegram.ui.Components.nv0(context, yzVar, 1, null);
        this.f52501q0 = nv0Var;
        nv0Var.d.setText(org.telegram.messenger.hd.N0(2131747974, null));
        nv0Var.f37996e.setVisibility(8);
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
        this.f52502r0 = hj0Var;
        ek0Var.setItemsEnterAnimator(hj0Var);
        di.i4 i4Var = new di.i4(this);
        this.f52504t0 = i4Var;
        setAdapter(i4Var);
    }

    public final void H(String str) {
        int i7;
        if (this.f52503s0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        y91 y91Var = this.f52507w0;
        tL_messages_search.peer = y91Var.getMessagesController().l1(-y91Var.f54099a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f28545q = str;
        ArrayList arrayList = this.f52492g0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((org.telegram.messenger.gj) i5.c.h(1, arrayList)).e1();
        }
        this.f52503s0 = true;
        i7 = ((org.telegram.ui.ActionBar.g2) y91Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_search, new e31(5, this, str));
    }

    public final void I(View view, int i7, String str, boolean z10) {
        this.f52490e0 = str;
        FrameLayout frameLayout = this.W;
        y91 y91Var = this.f52507w0;
        int i10 = 0;
        if (view == frameLayout) {
            mz0 mz0Var = this.f52489d0;
            if (mz0Var != null) {
                org.telegram.messenger.g0.r(mz0Var);
                this.f52489d0 = null;
            }
            this.f52503s0 = false;
            this.f52500p0 = false;
            ArrayList arrayList = this.f52491f0;
            arrayList.clear();
            this.f52492g0.clear();
            J();
            if (TextUtils.isEmpty(str)) {
                this.f52499o0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = y91Var.f54102b;
                    if (i10 < arrayList2.size()) {
                        if (((q91) arrayList2.get(i10)).f51153c != null) {
                            arrayList.add(((q91) arrayList2.get(i10)).f51153c);
                            ((q91) arrayList2.get(i10)).f51153c.searchQuery = null;
                        }
                        i10++;
                    } else {
                        J();
                        return;
                    }
                }
            } else {
                J();
                this.f52499o0 = true;
                this.f52501q0.e(true, true);
                mz0 mz0Var2 = new mz0(14, this, str);
                this.f52489d0 = mz0Var2;
                org.telegram.messenger.g0.h3(mz0Var2, 200L);
            }
        } else if (view instanceof c00) {
            c00 c00Var = (c00) view;
            c00Var.f46350c.b(0, false);
            c00Var.h(-y91Var.f54099a, 0L, 0L, 0L, jg.q0.f17648k3[((r91) ((ArrayList) this.f52504t0.f9037b).get(i7)).f51527b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.sl0) {
            org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) view;
            sl0Var.f39616a.b(0, false);
            sl0Var.L = str;
            sl0Var.d(false);
        }
    }

    public final void J() {
        this.f52493h0 = -1;
        this.f52494i0 = -1;
        this.f52495j0 = -1;
        this.f52496k0 = -1;
        this.f52497l0 = -1;
        this.m0 = -1;
        this.f52498n0 = 0;
        ArrayList arrayList = this.f52491f0;
        if (!arrayList.isEmpty()) {
            int i7 = this.f52498n0;
            int i10 = i7 + 1;
            this.f52498n0 = i10;
            this.f52493h0 = i7;
            this.f52494i0 = i10;
            int size = arrayList.size() + i10;
            this.f52498n0 = size;
            this.f52495j0 = size;
        }
        ArrayList arrayList2 = this.f52492g0;
        if (!arrayList2.isEmpty()) {
            int i11 = this.f52498n0;
            int i12 = i11 + 1;
            this.f52498n0 = i12;
            this.f52496k0 = i11;
            this.f52497l0 = i12;
            int size2 = arrayList2.size() + i12;
            this.f52498n0 = size2;
            this.m0 = size2;
        }
        this.f52488c0.f();
    }

    @Override
    public final boolean V1() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.g2) this.f52507w0).actionBar;
        return kVar.x();
    }

    @Override
    public final void Z0(org.telegram.messenger.gj gjVar, View view, int i7) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f52506v0;
        if (!arrayList.remove(gjVar)) {
            arrayList.add(gjVar);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.g2) this.f52507w0).actionBar;
            kVar.w();
        }
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.g2) this.f52507w0).actionBar;
        kVar.R(null, null);
    }

    @Override
    public final boolean r0(vz vzVar) {
        if (vzVar == null) {
            return false;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f52506v0;
            if (i7 >= arrayList.size()) {
                return false;
            }
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i7);
            if (gjVar != null && gjVar.e1() == vzVar.f52922b && org.telegram.messenger.gj.B0(gjVar.f24213k) == vzVar.f52921a) {
                return true;
            }
            i7++;
        }
    }

    @Override
    public final void t0(org.telegram.messenger.gj gjVar) {
        int i7;
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.gj.B0(gjVar.f24213k);
        boolean C = org.telegram.messenger.n5.C(B0);
        y91 y91Var = this.f52507w0;
        if (C) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (!org.telegram.messenger.n5.E(B0)) {
            i7 = ((org.telegram.ui.ActionBar.g2) y91Var).currentAccount;
            TLRPC.Chat O0 = org.telegram.messenger.np.u1(org.telegram.messenger.c.a(i7).f23202a).O0(Long.valueOf(-B0));
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
