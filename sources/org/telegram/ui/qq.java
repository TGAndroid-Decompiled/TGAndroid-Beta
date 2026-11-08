package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qq extends org.telegram.ui.Components.n41 {
    public final eb1 f49295e;
    public final long f49296f;
    public final cb1 h;
    public String f49297n;
    public org.telegram.ui.ActionBar.f5 f49298r;
    public boolean f49299s = false;

    public qq(eb1 eb1Var, long j3, cb1 cb1Var) {
        this.f49295e = eb1Var;
        this.f49296f = j3;
        this.h = cb1Var;
        pq pqVar = new pq(this, 0);
        if (eb1Var.f45258c) {
            pqVar.run();
        } else {
            eb1Var.f45260f.add(pqVar);
        }
    }

    @Override
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.l41 l41Var) {
        int i7;
        boolean z9;
        boolean isEmpty = TextUtils.isEmpty(this.f49297n);
        long j3 = this.f49296f;
        if (isEmpty && j3 != 0) {
            org.telegram.ui.Components.x31 c10 = org.telegram.ui.Components.x31.c(1, 2131232053, org.telegram.messenger.id.M0(2131751236, null));
            c10.f40186r = true;
            arrayList.add(c10);
            arrayList.add(org.telegram.ui.Components.x31.C(null));
        }
        if (TextUtils.isEmpty(this.f49297n)) {
            arrayList.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.id.M0(2131751235, null)));
        }
        ArrayList arrayList2 = this.f49295e.f45259e;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat != null && !org.telegram.messenger.t3.n0(chat)) {
                i10++;
                if (!TextUtils.isEmpty(this.f49297n)) {
                    String lowerCase = this.f49297n.toLowerCase();
                    String O3 = org.telegram.messenger.g0.O3(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !jg.g.A(" ", lowerCase, lowerCase2) && !O32.startsWith(O3) && !O32.contains(" ".concat(O3))) {
                    }
                }
                long j10 = chat.f26956id;
                org.telegram.ui.Components.x31 x31Var = new org.telegram.ui.Components.x31(11);
                x31Var.f40190w = true;
                x31Var.f40191x = -j10;
                if (j3 == j10) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                x31Var.L(z9);
                arrayList.add(x31Var);
            }
        }
        if (TextUtils.isEmpty(this.f49297n) && i10 == 0) {
            org.telegram.ui.Components.x31 c11 = org.telegram.ui.Components.x31.c(2, 2131232089, org.telegram.messenger.id.M0(2131751233, null));
            c11.f40185q = true;
            arrayList.add(c11);
        }
        arrayList.add(org.telegram.ui.Components.x31.C(null));
        org.telegram.ui.ActionBar.f5 f5Var = this.f49298r;
        if (f5Var != null) {
            if (i10 > 5) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            f5Var.setVisibility(i7);
        }
    }

    @Override
    public final CharSequence a0() {
        return org.telegram.messenger.id.M0(2131751232, null);
    }

    @Override
    public final void b0(org.telegram.ui.Components.x31 x31Var, View view) {
        int i7 = x31Var.d;
        cb1 cb1Var = this.h;
        if (i7 == 1) {
            cb1Var.a(null);
            finishFragment();
        } else if (i7 == 2) {
            this.f49299s = true;
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            boolean z9 = org.telegram.messenger.r2.f25212a;
            presentFragment(new g(0));
            e12.edit().putBoolean("channel_intro", true).apply();
        } else if (x31Var.f54531a == 12) {
            finishFragment();
            cb1Var.a(getMessagesController().M0(Long.valueOf(-x31Var.f40191x)));
        }
    }

    @Override
    public final boolean c0(org.telegram.ui.Components.x31 x31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.e5 o4 = this.simpleActionBar.o();
        getResourceProvider();
        org.telegram.ui.ActionBar.f5 b10 = o4.b(0, 2131232486);
        b10.N();
        b10.B0 = new kg.v1(this, 4);
        this.f49298r = b10;
        b10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745839, null));
        this.f49298r.setContentDescription(org.telegram.messenger.id.M0(2131745839, null));
        this.f49298r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.f36243a.r1();
        this.f36243a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f36243a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f49299s) {
            eb1 eb1Var = this.f49295e;
            eb1Var.f45258c = false;
            eb1Var.f45260f.add(new pq(this, 1));
            this.f49299s = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
