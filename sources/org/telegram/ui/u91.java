package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u91 extends org.telegram.ui.Components.g71 implements b00 {
    public final FrameLayout W;
    public final org.telegram.ui.Components.ck0 f52477a0;
    public final v4.c0 f52478b0;
    public final s91 f52479c0;
    public b31 f52480d0;
    public String f52481e0;
    public final ArrayList f52482f0;
    public final ArrayList f52483g0;
    public int f52484h0;
    public int f52485i0;
    public int f52486j0;
    public int f52487k0;
    public int f52488l0;
    public int m0;
    public int f52489n0;
    public boolean f52490o0;
    public boolean f52491p0;
    public final org.telegram.ui.Components.kv0 f52492q0;
    public final org.telegram.ui.Components.fj0 f52493r0;
    public boolean f52494s0;
    public final di.i4 f52495t0;
    public final xr0 f52496u0;
    public final ArrayList f52497v0;
    public final y91 f52498w0;

    public u91(y91 y91Var, Context context) {
        super(context, null);
        this.f52498w0 = y91Var;
        this.f52481e0 = "empty";
        this.f52482f0 = new ArrayList();
        this.f52483g0 = new ArrayList();
        this.f52497v0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        this.f52496u0 = new xr0(this, 6);
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.f52477a0 = ck0Var;
        s91 s91Var = new s91(this);
        this.f52479c0 = s91Var;
        ck0Var.setAdapter(s91Var);
        v4.c0 c0Var = new v4.c0();
        this.f52478b0 = c0Var;
        ck0Var.setLayoutManager(c0Var);
        ck0Var.setOnItemClickListener(new zx0(this, 10));
        ck0Var.setOnScrollListener(new c21(this, 5));
        org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(context, null);
        wzVar.setViewType(7);
        wzVar.f41829x = false;
        wzVar.setUseHeaderOffset(true);
        org.telegram.ui.Components.kv0 kv0Var = new org.telegram.ui.Components.kv0(context, wzVar, 1, null);
        this.f52492q0 = kv0Var;
        kv0Var.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
        kv0Var.f36896e.setVisibility(8);
        kv0Var.setVisibility(8);
        kv0Var.addView(wzVar, 0);
        kv0Var.setAnimateLayoutChange(true);
        ck0Var.setEmptyView(kv0Var);
        ck0Var.X1 = true;
        ck0Var.Y1 = 0;
        frameLayout.addView(kv0Var);
        frameLayout.addView(ck0Var);
        J();
        org.telegram.ui.Components.fj0 fj0Var = new org.telegram.ui.Components.fj0(ck0Var, true);
        this.f52493r0 = fj0Var;
        ck0Var.setItemsEnterAnimator(fj0Var);
        di.i4 i4Var = new di.i4(this);
        this.f52495t0 = i4Var;
        setAdapter(i4Var);
    }

    public final void H(String str) {
        int i7;
        if (this.f52494s0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        y91 y91Var = this.f52498w0;
        tL_messages_search.peer = y91Var.getMessagesController().l1(-y91Var.f54109a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f28516q = str;
        ArrayList arrayList = this.f52483g0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((org.telegram.messenger.fj) i5.c.h(1, arrayList)).e1();
        }
        this.f52494s0 = true;
        i7 = ((org.telegram.ui.ActionBar.h2) y91Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_search, new e31(5, this, str));
    }

    public final void I(View view, int i7, String str, boolean z10) {
        this.f52481e0 = str;
        FrameLayout frameLayout = this.W;
        y91 y91Var = this.f52498w0;
        int i10 = 0;
        if (view == frameLayout) {
            b31 b31Var = this.f52480d0;
            if (b31Var != null) {
                org.telegram.messenger.g0.r(b31Var);
                this.f52480d0 = null;
            }
            this.f52494s0 = false;
            this.f52491p0 = false;
            ArrayList arrayList = this.f52482f0;
            arrayList.clear();
            this.f52483g0.clear();
            J();
            if (TextUtils.isEmpty(str)) {
                this.f52490o0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = y91Var.f54112b;
                    if (i10 < arrayList2.size()) {
                        if (((q91) arrayList2.get(i10)).f51182c != null) {
                            arrayList.add(((q91) arrayList2.get(i10)).f51182c);
                            ((q91) arrayList2.get(i10)).f51182c.searchQuery = null;
                        }
                        i10++;
                    } else {
                        J();
                        return;
                    }
                }
            } else {
                J();
                this.f52490o0 = true;
                this.f52492q0.e(true, true);
                b31 b31Var2 = new b31(12, this, str);
                this.f52480d0 = b31Var2;
                org.telegram.messenger.g0.h3(b31Var2, 200L);
            }
        } else if (view instanceof c00) {
            c00 c00Var = (c00) view;
            c00Var.f46333c.b(0, false);
            c00Var.h(-y91Var.f54109a, 0L, 0L, 0L, jg.q0.f17623k3[((r91) ((ArrayList) this.f52495t0.f9010b).get(i7)).f51549b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.ql0) {
            org.telegram.ui.Components.ql0 ql0Var = (org.telegram.ui.Components.ql0) view;
            ql0Var.f38827a.b(0, false);
            ql0Var.L = str;
            ql0Var.d(false);
        }
    }

    public final void J() {
        this.f52484h0 = -1;
        this.f52485i0 = -1;
        this.f52486j0 = -1;
        this.f52487k0 = -1;
        this.f52488l0 = -1;
        this.m0 = -1;
        this.f52489n0 = 0;
        ArrayList arrayList = this.f52482f0;
        if (!arrayList.isEmpty()) {
            int i7 = this.f52489n0;
            int i10 = i7 + 1;
            this.f52489n0 = i10;
            this.f52484h0 = i7;
            this.f52485i0 = i10;
            int size = arrayList.size() + i10;
            this.f52489n0 = size;
            this.f52486j0 = size;
        }
        ArrayList arrayList2 = this.f52483g0;
        if (!arrayList2.isEmpty()) {
            int i11 = this.f52489n0;
            int i12 = i11 + 1;
            this.f52489n0 = i12;
            this.f52487k0 = i11;
            this.f52488l0 = i12;
            int size2 = arrayList2.size() + i12;
            this.f52489n0 = size2;
            this.m0 = size2;
        }
        this.f52479c0.f();
    }

    @Override
    public final boolean V1() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.h2) this.f52498w0).actionBar;
        return kVar.y();
    }

    @Override
    public final void Z0(org.telegram.messenger.fj fjVar, View view, int i7) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f52497v0;
        if (!arrayList.remove(fjVar)) {
            arrayList.add(fjVar);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.h2) this.f52498w0).actionBar;
            kVar.x();
        }
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.h2) this.f52498w0).actionBar;
        kVar.S(null, null);
    }

    @Override
    public final boolean r0(vz vzVar) {
        if (vzVar == null) {
            return false;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f52497v0;
            if (i7 >= arrayList.size()) {
                return false;
            }
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i7);
            if (fjVar != null && fjVar.e1() == vzVar.f52887b && org.telegram.messenger.fj.B0(fjVar.f23968k) == vzVar.f52886a) {
                return true;
            }
            i7++;
        }
    }

    @Override
    public final void t0(org.telegram.messenger.fj fjVar) {
        int i7;
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.fj.B0(fjVar.f23968k);
        boolean C = org.telegram.messenger.n5.C(B0);
        y91 y91Var = this.f52498w0;
        if (C) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (!org.telegram.messenger.n5.E(B0)) {
            i7 = ((org.telegram.ui.ActionBar.h2) y91Var).currentAccount;
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(org.telegram.messenger.c.a(i7).f23221a).O0(Long.valueOf(-B0));
            if (O0 != null && O0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -O0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        } else {
            bundle.putLong("user_id", B0);
        }
        bundle.putInt("message_id", fjVar.e1());
        y91Var.presentFragment(new bn(bundle));
    }
}
