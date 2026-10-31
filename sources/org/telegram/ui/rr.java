package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class rr extends org.telegram.ui.Components.r51 {
    public final zc1 e;
    public final long f41272f;
    public final xc1 h;
    public String f41273n;
    public org.telegram.ui.ActionBar.p5 f41274r;
    public boolean f41275s = false;

    public rr(zc1 zc1Var, long j10, xc1 xc1Var) {
        this.e = zc1Var;
        this.f41272f = j10;
        this.h = xc1Var;
        qr qrVar = new qr(this, 0);
        if (zc1Var.f44124c) {
            qrVar.run();
        } else {
            zc1Var.f44125f.add(qrVar);
        }
    }

    @Override
    public final void Y(ArrayList arrayList, org.telegram.ui.Components.p51 p51Var) {
        int i10;
        boolean z10;
        boolean isEmpty = TextUtils.isEmpty(this.f41273n);
        long j10 = this.f41272f;
        if (isEmpty && j10 != 0) {
            org.telegram.ui.Components.a51 c10 = org.telegram.ui.Components.a51.c(1, 2131232052, org.telegram.messenger.cd.L0(2131751236, null));
            c10.f24298r = true;
            arrayList.add(c10);
            arrayList.add(org.telegram.ui.Components.a51.C(null));
        }
        if (TextUtils.isEmpty(this.f41273n)) {
            arrayList.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131751235, null)));
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
                if (!TextUtils.isEmpty(this.f41273n)) {
                    String lowerCase = this.f41273n.toLowerCase();
                    String N3 = org.telegram.messenger.i0.N3(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !sc.e.y(" ", lowerCase, lowerCase2) && !N32.startsWith(N3) && !N32.contains(" ".concat(N3))) {
                    }
                }
                long j11 = chat.f19793id;
                org.telegram.ui.Components.a51 a51Var = new org.telegram.ui.Components.a51(11);
                a51Var.f24302w = true;
                a51Var.f24303x = -j11;
                if (j10 == j11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a51Var.L(z10);
                arrayList.add(a51Var);
            }
        }
        if (TextUtils.isEmpty(this.f41273n) && i11 == 0) {
            org.telegram.ui.Components.a51 c11 = org.telegram.ui.Components.a51.c(2, 2131232088, org.telegram.messenger.cd.L0(2131751233, null));
            c11.f24297q = true;
            arrayList.add(c11);
        }
        arrayList.add(org.telegram.ui.Components.a51.C(null));
        org.telegram.ui.ActionBar.p5 p5Var = this.f41274r;
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
    public final CharSequence Z() {
        return org.telegram.messenger.cd.L0(2131751232, null);
    }

    @Override
    public final void a0(org.telegram.ui.Components.a51 a51Var, View view) {
        int i10 = a51Var.d;
        xc1 xc1Var = this.h;
        if (i10 == 1) {
            xc1Var.a(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f41275s = true;
            SharedPreferences d12 = org.telegram.messenger.vp.d1();
            boolean z10 = org.telegram.messenger.v2.f18448a;
            presentFragment(new f(0));
            d12.edit().putBoolean("channel_intro", true).apply();
        } else if (a51Var.f7680a == 12) {
            finishFragment();
            xc1Var.a(getMessagesController().L0(Long.valueOf(-a51Var.f24303x)));
        }
    }

    @Override
    public final boolean b0(org.telegram.ui.Components.a51 a51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.o5 o10 = this.simpleActionBar.o();
        getResourceProvider();
        org.telegram.ui.ActionBar.p5 b10 = o10.b(0, 2131232485);
        b10.N();
        b10.B0 = new ag.l3(this, 4);
        this.f41274r = b10;
        b10.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
        this.f41274r.setContentDescription(org.telegram.messenger.cd.L0(2131745853, null));
        this.f41274r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.f29837a.r1();
        this.f29837a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f29837a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f41275s) {
            zc1 zc1Var = this.e;
            zc1Var.f44124c = false;
            zc1Var.f44125f.add(new qr(this, 1));
            this.f41275s = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
