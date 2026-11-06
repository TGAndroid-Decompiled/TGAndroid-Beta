package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qq extends org.telegram.ui.Components.m41 {
    public final db1 f49293e;
    public final long f49294f;
    public final bb1 h;
    public String f49295n;
    public org.telegram.ui.ActionBar.f5 f49296r;
    public boolean f49297s = false;

    public qq(db1 db1Var, long j3, bb1 bb1Var) {
        this.f49293e = db1Var;
        this.f49294f = j3;
        this.h = bb1Var;
        pq pqVar = new pq(this, 0);
        if (db1Var.f45042c) {
            pqVar.run();
        } else {
            db1Var.f45044f.add(pqVar);
        }
    }

    @Override
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.k41 k41Var) {
        int i7;
        boolean z9;
        boolean isEmpty = TextUtils.isEmpty(this.f49295n);
        long j3 = this.f49294f;
        if (isEmpty && j3 != 0) {
            org.telegram.ui.Components.w31 c10 = org.telegram.ui.Components.w31.c(1, 2131232053, org.telegram.messenger.hd.M0(2131751236, null));
            c10.f39836r = true;
            arrayList.add(c10);
            arrayList.add(org.telegram.ui.Components.w31.C(null));
        }
        if (TextUtils.isEmpty(this.f49295n)) {
            arrayList.add(org.telegram.ui.Components.w31.u(org.telegram.messenger.hd.M0(2131751235, null)));
        }
        ArrayList arrayList2 = this.f49293e.f45043e;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat != null && !org.telegram.messenger.t3.n0(chat)) {
                i10++;
                if (!TextUtils.isEmpty(this.f49295n)) {
                    String lowerCase = this.f49295n.toLowerCase();
                    String O3 = org.telegram.messenger.g0.O3(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !jg.g.A(" ", lowerCase, lowerCase2) && !O32.startsWith(O3) && !O32.contains(" ".concat(O3))) {
                    }
                }
                long j10 = chat.f26952id;
                org.telegram.ui.Components.w31 w31Var = new org.telegram.ui.Components.w31(11);
                w31Var.f39840w = true;
                w31Var.f39841x = -j10;
                if (j3 == j10) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                w31Var.L(z9);
                arrayList.add(w31Var);
            }
        }
        if (TextUtils.isEmpty(this.f49295n) && i10 == 0) {
            org.telegram.ui.Components.w31 c11 = org.telegram.ui.Components.w31.c(2, 2131232089, org.telegram.messenger.hd.M0(2131751233, null));
            c11.f39835q = true;
            arrayList.add(c11);
        }
        arrayList.add(org.telegram.ui.Components.w31.C(null));
        org.telegram.ui.ActionBar.f5 f5Var = this.f49296r;
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
        return org.telegram.messenger.hd.M0(2131751232, null);
    }

    @Override
    public final void b0(org.telegram.ui.Components.w31 w31Var, View view) {
        int i7 = w31Var.d;
        bb1 bb1Var = this.h;
        if (i7 == 1) {
            bb1Var.a(null);
            finishFragment();
        } else if (i7 == 2) {
            this.f49297s = true;
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            boolean z9 = org.telegram.messenger.r2.f25191a;
            presentFragment(new g(0));
            e12.edit().putBoolean("channel_intro", true).apply();
        } else if (w31Var.f54440a == 12) {
            finishFragment();
            bb1Var.a(getMessagesController().M0(Long.valueOf(-w31Var.f39841x)));
        }
    }

    @Override
    public final boolean c0(org.telegram.ui.Components.w31 w31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.e5 o4 = this.simpleActionBar.o();
        getResourceProvider();
        org.telegram.ui.ActionBar.f5 b10 = o4.b(0, 2131232486);
        b10.N();
        b10.B0 = new kg.v1(this, 4);
        this.f49296r = b10;
        b10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745837, null));
        this.f49296r.setContentDescription(org.telegram.messenger.hd.M0(2131745837, null));
        this.f49296r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.f35844a.r1();
        this.f35844a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f35844a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f49297s) {
            db1 db1Var = this.f49293e;
            db1Var.f45042c = false;
            db1Var.f45044f.add(new pq(this, 1));
            this.f49297s = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
