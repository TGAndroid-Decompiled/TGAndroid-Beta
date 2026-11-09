package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sq extends org.telegram.ui.Components.o41 {
    public final gb1 f49973e;
    public final long f49974f;
    public final eb1 h;
    public String f49975n;
    public org.telegram.ui.ActionBar.f5 f49976r;
    public boolean f49977s = false;

    public sq(gb1 gb1Var, long j3, eb1 eb1Var) {
        this.f49973e = gb1Var;
        this.f49974f = j3;
        this.h = eb1Var;
        rq rqVar = new rq(this, 0);
        if (gb1Var.f45956c) {
            rqVar.run();
        } else {
            gb1Var.f45958f.add(rqVar);
        }
    }

    @Override
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.m41 m41Var) {
        int i7;
        boolean z9;
        boolean isEmpty = TextUtils.isEmpty(this.f49975n);
        long j3 = this.f49974f;
        if (isEmpty && j3 != 0) {
            org.telegram.ui.Components.y31 c10 = org.telegram.ui.Components.y31.c(1, 2131232053, org.telegram.messenger.id.M0(2131751235, null));
            c10.f40574r = true;
            arrayList.add(c10);
            arrayList.add(org.telegram.ui.Components.y31.C(null));
        }
        if (TextUtils.isEmpty(this.f49975n)) {
            arrayList.add(org.telegram.ui.Components.y31.u(org.telegram.messenger.id.M0(2131751234, null)));
        }
        ArrayList arrayList2 = this.f49973e.f45957e;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat != null && !org.telegram.messenger.t3.n0(chat)) {
                i10++;
                if (!TextUtils.isEmpty(this.f49975n)) {
                    String lowerCase = this.f49975n.toLowerCase();
                    String O3 = org.telegram.messenger.g0.O3(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !jg.g.A(" ", lowerCase, lowerCase2) && !O32.startsWith(O3) && !O32.contains(" ".concat(O3))) {
                    }
                }
                long j10 = chat.f26956id;
                org.telegram.ui.Components.y31 y31Var = new org.telegram.ui.Components.y31(11);
                y31Var.f40578w = true;
                y31Var.f40579x = -j10;
                if (j3 == j10) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                y31Var.L(z9);
                arrayList.add(y31Var);
            }
        }
        if (TextUtils.isEmpty(this.f49975n) && i10 == 0) {
            org.telegram.ui.Components.y31 c11 = org.telegram.ui.Components.y31.c(2, 2131232089, org.telegram.messenger.id.M0(2131751232, null));
            c11.f40573q = true;
            arrayList.add(c11);
        }
        arrayList.add(org.telegram.ui.Components.y31.C(null));
        org.telegram.ui.ActionBar.f5 f5Var = this.f49976r;
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
        return org.telegram.messenger.id.M0(2131751231, null);
    }

    @Override
    public final void b0(org.telegram.ui.Components.y31 y31Var, View view) {
        int i7 = y31Var.d;
        eb1 eb1Var = this.h;
        if (i7 == 1) {
            eb1Var.a(null);
            finishFragment();
        } else if (i7 == 2) {
            this.f49977s = true;
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            boolean z9 = org.telegram.messenger.r2.f25212a;
            presentFragment(new g(0));
            e12.edit().putBoolean("channel_intro", true).apply();
        } else if (y31Var.f54544a == 12) {
            finishFragment();
            eb1Var.a(getMessagesController().M0(Long.valueOf(-y31Var.f40579x)));
        }
    }

    @Override
    public final boolean c0(org.telegram.ui.Components.y31 y31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.e5 p10 = this.simpleActionBar.p();
        getResourceProvider();
        org.telegram.ui.ActionBar.f5 b10 = p10.b(0, 2131232486);
        b10.N();
        b10.B0 = new kg.v1(this, 4);
        this.f49976r = b10;
        b10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        this.f49976r.setContentDescription(org.telegram.messenger.id.M0(2131745836, null));
        this.f49976r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.f36649a.r1();
        this.f36649a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.f36649a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f49977s) {
            gb1 gb1Var = this.f49973e;
            gb1Var.f45956c = false;
            gb1Var.f45958f.add(new rq(this, 1));
            this.f49977s = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
