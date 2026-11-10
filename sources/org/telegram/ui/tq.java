package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class tq extends org.telegram.ui.Components.o41 {
    public final hb1 f50322e;
    public final long f50323f;
    public final fb1 h;
    public String f50324n;
    public org.telegram.ui.ActionBar.g5 f50325r;
    public boolean f50326s = false;

    public tq(hb1 hb1Var, long j3, fb1 fb1Var) {
        this.f50322e = hb1Var;
        this.f50323f = j3;
        this.h = fb1Var;
        sq sqVar = new sq(this, 0);
        if (hb1Var.f46293c) {
            sqVar.run();
        } else {
            hb1Var.f46295f.add(sqVar);
        }
    }

    @Override
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.m41 m41Var) {
        int i7;
        boolean z9;
        boolean isEmpty = TextUtils.isEmpty(this.f50324n);
        long j3 = this.f50323f;
        if (isEmpty && j3 != 0) {
            org.telegram.ui.Components.x31 c10 = org.telegram.ui.Components.x31.c(1, 2131232053, org.telegram.messenger.id.M0(2131751235, null));
            c10.f40162r = true;
            arrayList.add(c10);
            arrayList.add(org.telegram.ui.Components.x31.C(null));
        }
        if (TextUtils.isEmpty(this.f50324n)) {
            arrayList.add(org.telegram.ui.Components.x31.u(org.telegram.messenger.id.M0(2131751234, null)));
        }
        ArrayList arrayList2 = this.f50322e.f46294e;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat != null && !org.telegram.messenger.t3.n0(chat)) {
                i10++;
                if (!TextUtils.isEmpty(this.f50324n)) {
                    String lowerCase = this.f50324n.toLowerCase();
                    String O3 = org.telegram.messenger.g0.O3(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !jg.g.A(" ", lowerCase, lowerCase2) && !O32.startsWith(O3) && !O32.contains(" ".concat(O3))) {
                    }
                }
                long j10 = chat.f26960id;
                org.telegram.ui.Components.x31 x31Var = new org.telegram.ui.Components.x31(11);
                x31Var.f40166w = true;
                x31Var.f40167x = -j10;
                if (j3 == j10) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                x31Var.L(z9);
                arrayList.add(x31Var);
            }
        }
        if (TextUtils.isEmpty(this.f50324n) && i10 == 0) {
            org.telegram.ui.Components.x31 c11 = org.telegram.ui.Components.x31.c(2, 2131232089, org.telegram.messenger.id.M0(2131751232, null));
            c11.f40161q = true;
            arrayList.add(c11);
        }
        arrayList.add(org.telegram.ui.Components.x31.C(null));
        org.telegram.ui.ActionBar.g5 g5Var = this.f50325r;
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
        return org.telegram.messenger.id.M0(2131751231, null);
    }

    @Override
    public final void b0(org.telegram.ui.Components.x31 x31Var, View view) {
        int i7 = x31Var.d;
        fb1 fb1Var = this.h;
        if (i7 == 1) {
            fb1Var.a(null);
            finishFragment();
        } else if (i7 == 2) {
            this.f50326s = true;
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            boolean z9 = org.telegram.messenger.r2.f25216a;
            presentFragment(new g(0));
            e12.edit().putBoolean("channel_intro", true).apply();
        } else if (x31Var.f54543a == 12) {
            finishFragment();
            fb1Var.a(getMessagesController().M0(Long.valueOf(-x31Var.f40167x)));
        }
    }

    @Override
    public final boolean c0(org.telegram.ui.Components.x31 x31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.f5 q10 = this.simpleActionBar.q();
        getResourceProvider();
        org.telegram.ui.ActionBar.g5 b10 = q10.b(0, 2131232486);
        b10.N();
        b10.B0 = new kg.v1(this, 4);
        this.f50325r = b10;
        b10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        this.f50325r.setContentDescription(org.telegram.messenger.id.M0(2131745836, null));
        this.f50325r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.f36518a.r1();
        this.f36518a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f36518a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f50326s) {
            hb1 hb1Var = this.f50322e;
            hb1Var.f46293c = false;
            hb1Var.f46295f.add(new sq(this, 1));
            this.f50326s = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
