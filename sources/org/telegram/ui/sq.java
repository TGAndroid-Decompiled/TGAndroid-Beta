package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sq extends org.telegram.ui.Components.r41 {
    public final cb1 f51258e;
    public final long f51259f;
    public final ab1 h;
    public String f51260n;
    public org.telegram.ui.ActionBar.d5 f51261r;
    public boolean f51262s = false;

    public sq(cb1 cb1Var, long j3, ab1 ab1Var) {
        this.f51258e = cb1Var;
        this.f51259f = j3;
        this.h = ab1Var;
        rq rqVar = new rq(this, 0);
        if (cb1Var.f46060c) {
            rqVar.run();
        } else {
            cb1Var.f46062f.add(rqVar);
        }
    }

    @Override
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.p41 p41Var) {
        int i7;
        boolean z10;
        boolean isEmpty = TextUtils.isEmpty(this.f51260n);
        long j3 = this.f51259f;
        if (isEmpty && j3 != 0) {
            org.telegram.ui.Components.b41 c10 = org.telegram.ui.Components.b41.c(1, 2131232054, org.telegram.messenger.hd.M0(2131751235, null));
            c10.f33190r = true;
            arrayList.add(c10);
            arrayList.add(org.telegram.ui.Components.b41.C(null));
        }
        if (TextUtils.isEmpty(this.f51260n)) {
            arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131751234, null)));
        }
        ArrayList arrayList2 = this.f51258e.f46061e;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat != null && !org.telegram.messenger.t3.n0(chat)) {
                i10++;
                if (!TextUtils.isEmpty(this.f51260n)) {
                    String lowerCase = this.f51260n.toLowerCase();
                    String N3 = org.telegram.messenger.g0.N3(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String N32 = org.telegram.messenger.g0.N3(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !i5.c.A(" ", lowerCase, lowerCase2) && !N32.startsWith(N3) && !N32.contains(" ".concat(N3))) {
                    }
                }
                long j10 = chat.f28051id;
                org.telegram.ui.Components.b41 b41Var = new org.telegram.ui.Components.b41(11);
                b41Var.f33194w = true;
                b41Var.f33195x = -j10;
                if (j3 == j10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b41Var.L(z10);
                arrayList.add(b41Var);
            }
        }
        if (TextUtils.isEmpty(this.f51260n) && i10 == 0) {
            org.telegram.ui.Components.b41 c11 = org.telegram.ui.Components.b41.c(2, 2131232090, org.telegram.messenger.hd.M0(2131751232, null));
            c11.f33189q = true;
            arrayList.add(c11);
        }
        arrayList.add(org.telegram.ui.Components.b41.C(null));
        org.telegram.ui.ActionBar.d5 d5Var = this.f51261r;
        if (d5Var != null) {
            if (i10 > 5) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            d5Var.setVisibility(i7);
        }
    }

    @Override
    public final CharSequence a0() {
        return org.telegram.messenger.hd.M0(2131751231, null);
    }

    @Override
    public final void b0(org.telegram.ui.Components.b41 b41Var, View view) {
        int i7 = b41Var.d;
        ab1 ab1Var = this.h;
        if (i7 == 1) {
            ab1Var.a(null);
            finishFragment();
        } else if (i7 == 2) {
            this.f51262s = true;
            SharedPreferences e12 = org.telegram.messenger.np.e1();
            boolean z10 = org.telegram.messenger.r2.f26206a;
            presentFragment(new g(0));
            e12.edit().putBoolean("channel_intro", true).apply();
        } else if (b41Var.f56015a == 12) {
            finishFragment();
            ab1Var.a(getMessagesController().M0(Long.valueOf(-b41Var.f33195x)));
        }
    }

    @Override
    public final boolean c0(org.telegram.ui.Components.b41 b41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.c5 r10 = this.simpleActionBar.r();
        getResourceProvider();
        org.telegram.ui.ActionBar.d5 b10 = r10.b(0, 2131232487);
        b10.O();
        b10.C0 = new kg.x1(this, 4);
        this.f51261r = b10;
        b10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
        this.f51261r.setContentDescription(org.telegram.messenger.hd.M0(2131745836, null));
        this.f51261r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.f38880a.r1();
        this.f38880a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f38880a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f51262s) {
            cb1 cb1Var = this.f51258e;
            cb1Var.f46060c = false;
            cb1Var.f46062f.add(new rq(this, 1));
            this.f51262s = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
