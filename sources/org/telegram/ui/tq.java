package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class tq extends org.telegram.ui.Components.e51 {
    public final gb1 f52318e;
    public final long f52319f;
    public final eb1 h;
    public String f52320n;
    public org.telegram.ui.ActionBar.g5 f52321r;
    public boolean f52322s = false;

    public tq(gb1 gb1Var, long j3, eb1 eb1Var) {
        this.f52318e = gb1Var;
        this.f52319f = j3;
        this.h = eb1Var;
        sq sqVar = new sq(this, 0);
        if (gb1Var.f47977c) {
            sqVar.run();
        } else {
            gb1Var.f47979f.add(sqVar);
        }
    }

    @Override
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.c51 c51Var) {
        int i7;
        boolean z10;
        boolean isEmpty = TextUtils.isEmpty(this.f52320n);
        long j3 = this.f52319f;
        if (isEmpty && j3 != 0) {
            org.telegram.ui.Components.o41 c10 = org.telegram.ui.Components.o41.c(1, 2131232055, org.telegram.messenger.hd.N0(2131751223, null));
            c10.f38064s = true;
            arrayList.add(c10);
            arrayList.add(org.telegram.ui.Components.o41.C(null));
        }
        if (TextUtils.isEmpty(this.f52320n)) {
            i5.c.s(2131751222, null, arrayList);
        }
        ArrayList arrayList2 = this.f52318e.f47978e;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat != null && !org.telegram.messenger.v3.n0(chat)) {
                i10++;
                if (!TextUtils.isEmpty(this.f52320n)) {
                    String lowerCase = this.f52320n.toLowerCase();
                    String M3 = org.telegram.messenger.g0.M3(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !i5.c.B(" ", lowerCase, lowerCase2) && !M32.startsWith(M3) && !M32.contains(" ".concat(M3))) {
                    }
                }
                long j10 = chat.f28398id;
                org.telegram.ui.Components.o41 o41Var = new org.telegram.ui.Components.o41(11);
                o41Var.f38068x = true;
                o41Var.f38069y = -j10;
                if (j3 == j10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o41Var.L(z10);
                arrayList.add(o41Var);
            }
        }
        if (TextUtils.isEmpty(this.f52320n) && i10 == 0) {
            org.telegram.ui.Components.o41 c11 = org.telegram.ui.Components.o41.c(2, 2131232091, org.telegram.messenger.hd.N0(2131751220, null));
            c11.f38063r = true;
            arrayList.add(c11);
        }
        arrayList.add(org.telegram.ui.Components.o41.C(null));
        org.telegram.ui.ActionBar.g5 g5Var = this.f52321r;
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
        return org.telegram.messenger.hd.N0(2131751219, null);
    }

    @Override
    public final void b0(org.telegram.ui.Components.o41 o41Var, View view) {
        int i7 = o41Var.d;
        eb1 eb1Var = this.h;
        if (i7 == 1) {
            eb1Var.a(null);
            finishFragment();
        } else if (i7 == 2) {
            this.f52322s = true;
            SharedPreferences g12 = org.telegram.messenger.np.g1();
            boolean z10 = org.telegram.messenger.s2.f26694a;
            presentFragment(new g(0));
            g12.edit().putBoolean("channel_intro", true).apply();
        } else if (o41Var.f56599a == 12) {
            finishFragment();
            eb1Var.a(getMessagesController().O0(Long.valueOf(-o41Var.f38069y)));
        }
    }

    @Override
    public final boolean c0(org.telegram.ui.Components.o41 o41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.f5 t6 = this.simpleActionBar.t();
        getResourceProvider();
        org.telegram.ui.ActionBar.g5 b10 = t6.b(0, 2131232488);
        b10.O();
        b10.C0 = new bi.x1(this, 5);
        this.f52321r = b10;
        b10.setSearchFieldHint(org.telegram.messenger.hd.N0(2131745640, null));
        this.f52321r.setContentDescription(org.telegram.messenger.hd.N0(2131745640, null));
        this.f52321r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.f34671a.r1();
        this.f34671a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f34671a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f52322s) {
            gb1 gb1Var = this.f52318e;
            gb1Var.f47977c = false;
            gb1Var.f47979f.add(new sq(this, 1));
            this.f52322s = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
