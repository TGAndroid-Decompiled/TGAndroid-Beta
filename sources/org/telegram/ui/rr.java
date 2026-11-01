package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class rr extends org.telegram.ui.Components.s51 {
    public final xc1 e;
    public final long f41138f;
    public final vc1 h;
    public String f41139n;
    public org.telegram.ui.ActionBar.p5 f41140r;
    public boolean f41141s = false;

    public rr(xc1 xc1Var, long j10, vc1 vc1Var) {
        this.e = xc1Var;
        this.f41138f = j10;
        this.h = vc1Var;
        qr qrVar = new qr(this, 0);
        if (xc1Var.f43352c) {
            qrVar.run();
        } else {
            xc1Var.f43353f.add(qrVar);
        }
    }

    @Override
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.q51 q51Var) {
        int i10;
        boolean z10;
        boolean isEmpty = TextUtils.isEmpty(this.f41139n);
        long j10 = this.f41138f;
        if (isEmpty && j10 != 0) {
            org.telegram.ui.Components.b51 c10 = org.telegram.ui.Components.b51.c(1, 2131232052, org.telegram.messenger.dd.L0(2131751236, null));
            c10.f24649r = true;
            arrayList.add(c10);
            arrayList.add(org.telegram.ui.Components.b51.C(null));
        }
        if (TextUtils.isEmpty(this.f41139n)) {
            arrayList.add(org.telegram.ui.Components.b51.u(org.telegram.messenger.dd.L0(2131751235, null)));
        }
        ArrayList arrayList2 = this.e.e;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat != null && !org.telegram.messenger.w3.n0(chat)) {
                i11++;
                if (!TextUtils.isEmpty(this.f41139n)) {
                    String lowerCase = this.f41139n.toLowerCase();
                    String N3 = org.telegram.messenger.i0.N3(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !sc.e.y(" ", lowerCase, lowerCase2) && !N32.startsWith(N3) && !N32.contains(" ".concat(N3))) {
                    }
                }
                long j11 = chat.f19794id;
                org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(11);
                b51Var.f24653w = true;
                b51Var.f24654x = -j11;
                if (j10 == j11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b51Var.L(z10);
                arrayList.add(b51Var);
            }
        }
        if (TextUtils.isEmpty(this.f41139n) && i11 == 0) {
            org.telegram.ui.Components.b51 c11 = org.telegram.ui.Components.b51.c(2, 2131232088, org.telegram.messenger.dd.L0(2131751233, null));
            c11.f24648q = true;
            arrayList.add(c11);
        }
        arrayList.add(org.telegram.ui.Components.b51.C(null));
        org.telegram.ui.ActionBar.p5 p5Var = this.f41140r;
        if (p5Var != null) {
            if (i11 > 5) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            p5Var.setVisibility(i10);
        }
    }

    @Override
    public final CharSequence a0() {
        return org.telegram.messenger.dd.L0(2131751232, null);
    }

    @Override
    public final void b0(org.telegram.ui.Components.b51 b51Var, View view) {
        int i10 = b51Var.d;
        vc1 vc1Var = this.h;
        if (i10 == 1) {
            vc1Var.a(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f41141s = true;
            SharedPreferences d12 = org.telegram.messenger.wp.d1();
            boolean z10 = org.telegram.messenger.v2.f18578a;
            presentFragment(new f(0));
            d12.edit().putBoolean("channel_intro", true).apply();
        } else if (b51Var.f7681a == 12) {
            finishFragment();
            vc1Var.a(getMessagesController().L0(Long.valueOf(-b51Var.f24654x)));
        }
    }

    @Override
    public final boolean c0(org.telegram.ui.Components.b51 b51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.o5 o10 = this.simpleActionBar.o();
        getResourceProvider();
        org.telegram.ui.ActionBar.p5 b10 = o10.b(0, 2131232485);
        b10.N();
        b10.B0 = new ag.l3(this, 4);
        this.f41140r = b10;
        b10.setSearchFieldHint(org.telegram.messenger.dd.L0(2131745853, null));
        this.f41140r.setContentDescription(org.telegram.messenger.dd.L0(2131745853, null));
        this.f41140r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.f30217a.r1();
        this.f30217a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f30217a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f41141s) {
            xc1 xc1Var = this.e;
            xc1Var.f43352c = false;
            xc1Var.f43353f.add(new qr(this, 1));
            this.f41141s = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
