package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class tq extends org.telegram.ui.Components.d51 {
    public final eb1 f52446e;
    public final long f52447f;
    public final cb1 h;
    public String f52448n;
    public org.telegram.ui.ActionBar.g5 f52449r;
    public boolean f52450s = false;

    public tq(eb1 eb1Var, long j3, cb1 cb1Var) {
        this.f52446e = eb1Var;
        this.f52447f = j3;
        this.h = cb1Var;
        sq sqVar = new sq(this, 0);
        if (eb1Var.f47493c) {
            sqVar.run();
        } else {
            eb1Var.f47495f.add(sqVar);
        }
    }

    @Override
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.b51 b51Var) {
        int i7;
        boolean z10;
        boolean isEmpty = TextUtils.isEmpty(this.f52448n);
        long j3 = this.f52447f;
        if (isEmpty && j3 != 0) {
            org.telegram.ui.Components.n41 c10 = org.telegram.ui.Components.n41.c(1, 2131232058, org.telegram.messenger.gd.N0(2131751223, null));
            c10.f37661s = true;
            arrayList.add(c10);
            arrayList.add(org.telegram.ui.Components.n41.C(null));
        }
        if (TextUtils.isEmpty(this.f52448n)) {
            i5.c.s(2131751222, null, arrayList);
        }
        ArrayList arrayList2 = this.f52446e.f47494e;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat != null && !org.telegram.messenger.v3.n0(chat)) {
                i10++;
                if (!TextUtils.isEmpty(this.f52448n)) {
                    String lowerCase = this.f52448n.toLowerCase();
                    String M3 = org.telegram.messenger.g0.M3(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !i5.c.B(" ", lowerCase, lowerCase2) && !M32.startsWith(M3) && !M32.contains(" ".concat(M3))) {
                    }
                }
                long j10 = chat.f28492id;
                org.telegram.ui.Components.n41 n41Var = new org.telegram.ui.Components.n41(11);
                n41Var.f37665x = true;
                n41Var.f37666y = -j10;
                if (j3 == j10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n41Var.L(z10);
                arrayList.add(n41Var);
            }
        }
        if (TextUtils.isEmpty(this.f52448n) && i10 == 0) {
            org.telegram.ui.Components.n41 c11 = org.telegram.ui.Components.n41.c(2, 2131232094, org.telegram.messenger.gd.N0(2131751220, null));
            c11.f37660r = true;
            arrayList.add(c11);
        }
        arrayList.add(org.telegram.ui.Components.n41.C(null));
        org.telegram.ui.ActionBar.g5 g5Var = this.f52449r;
        if (g5Var != null) {
            if (i10 > 5) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            g5Var.setVisibility(i7);
        }
    }

    @Override
    public final CharSequence a0() {
        return org.telegram.messenger.gd.N0(2131751219, null);
    }

    @Override
    public final void b0(org.telegram.ui.Components.n41 n41Var, View view) {
        int i7 = n41Var.d;
        cb1 cb1Var = this.h;
        if (i7 == 1) {
            cb1Var.a(null);
            finishFragment();
        } else if (i7 == 2) {
            this.f52450s = true;
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            boolean z10 = org.telegram.messenger.s2.f26829a;
            presentFragment(new g(0));
            g12.edit().putBoolean("channel_intro", true).apply();
        } else if (n41Var.f56712a == 12) {
            finishFragment();
            cb1Var.a(getMessagesController().O0(Long.valueOf(-n41Var.f37666y)));
        }
    }

    @Override
    public final boolean c0(org.telegram.ui.Components.n41 n41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.f5 t6 = this.simpleActionBar.t();
        getResourceProvider();
        org.telegram.ui.ActionBar.g5 b10 = t6.b(0, 2131232491);
        b10.O();
        b10.C0 = new bi.x1(this, 5);
        this.f52449r = b10;
        b10.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, null));
        this.f52449r.setContentDescription(org.telegram.messenger.gd.N0(2131745640, null));
        this.f52449r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.f34213a.r1();
        this.f34213a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f34213a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f52450s) {
            eb1 eb1Var = this.f52446e;
            eb1Var.f47493c = false;
            eb1Var.f47495f.add(new sq(this, 1));
            this.f52450s = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
