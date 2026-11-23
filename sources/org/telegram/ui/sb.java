package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class sb extends FrameLayout {
    public int E;
    public final qb F;
    public final org.telegram.ui.Components.ek0 G;
    public boolean H;
    public final LinearLayout I;
    public final TLRPC.Chat J;
    public String K;
    public String L;
    public int M;
    public int N;
    public int O;
    public int P;
    public final long f51992a;
    public final int f51993b;
    public final c51 f51994c;
    public TL_stories.TL_premium_boostsStatus d;
    public final org.telegram.ui.ActionBar.h6 f51995e;
    public ScrollSlidingTextTabStrip f51996f;
    public final ArrayList h;
    public final ArrayList f51997n;
    public boolean f51998r;
    public int f51999s;
    public boolean f52000w;
    public int f52001x;
    public final ArrayList f52002y;

    public sb(c51 c51Var, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        super(c51Var.getParentActivity());
        int i7 = org.telegram.messenger.k10.f24968t0;
        this.f51993b = i7;
        this.h = new ArrayList();
        this.f51997n = new ArrayList();
        this.f52002y = new ArrayList();
        this.E = 0;
        qb qbVar = new qb(this);
        this.F = qbVar;
        this.K = "";
        this.L = "";
        this.M = 5;
        this.N = 5;
        this.f51994c = c51Var;
        Activity parentActivity = c51Var.getParentActivity();
        this.f51995e = h6Var;
        this.f51992a = j3;
        this.J = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(-j3));
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(parentActivity, null);
        this.G = ek0Var;
        ek0Var.setSections(true);
        ek0Var.setCaptureSectionsDecoratorAllowed(true);
        ek0Var.setLayoutManager(new v4.c0());
        v4.k kVar = new v4.k();
        kVar.f59194m = false;
        kVar.C = false;
        ek0Var.setItemAnimator(kVar);
        ek0Var.setClipToPadding(false);
        ek0Var.setOnItemClickListener(new mb(this, parentActivity, j3, h6Var, c51Var));
        addView(ek0Var);
        org.telegram.messenger.np.u1(i7).I0().a(j3, new r3(this, 1));
        ek0Var.setAdapter(qbVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.I = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        imageView.setAutoRepeat(true);
        imageView.f(2131624229, 120, 120, null);
        imageView.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.m6.Fj;
        org.telegram.ui.ActionBar.t6.U(textView, i10, null);
        textView.setTag(Integer.valueOf(i10));
        textView.setText(org.telegram.messenger.hd.N0(2131748584, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.m6.Gj;
        org.telegram.ui.ActionBar.t6.U(textView2, i11, null);
        textView2.setTag(Integer.valueOf(i11));
        textView2.setText(org.telegram.messenger.hd.N0(2131748583, null));
        textView2.setGravity(1);
        this.I.addView((View) imageView, c8.ma.t(120, 120, 1, 0, 0, 0, 20));
        this.I.addView(textView, c8.ma.t(-2, -2, 1, 0, 0, 0, 10));
        this.I.addView(textView2, c8.ma.r(-2, -2, 1));
        addView(this.I, c8.ma.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.I.setAlpha(0.0f);
        this.I.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        di.y8.y(i7, false).v();
    }

    public final void a(CountDownLatch countDownLatch, ob obVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.N;
        tL_premium_getBoostsList.offset = this.K;
        int i7 = this.f51993b;
        tL_premium_getBoostsList.peer = org.telegram.messenger.np.u1(i7).l1(this.f51992a);
        ConnectionsManager.getInstance(i7).sendRequest(tL_premium_getBoostsList, new pb(this, countDownLatch, obVar, 1), 2);
    }

    public final void b(CountDownLatch countDownLatch, ob obVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.M;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.L;
        int i7 = this.f51993b;
        tL_premium_getBoostsList.peer = org.telegram.messenger.np.u1(i7).l1(this.f51992a);
        ConnectionsManager.getInstance(i7).sendRequest(tL_premium_getBoostsList, new pb(this, countDownLatch, obVar, 0), 2);
    }

    public final void c(Boolean bool) {
        if (this.H) {
            return;
        }
        this.H = true;
        if (bool == null) {
            Utilities.f22810e.c(new ob(this, 0));
        } else if (bool.booleanValue()) {
            b(null, new ob(this, 1));
        } else {
            a(null, new ob(this, 2));
        }
    }

    public final void d(boolean z10) {
        int i7;
        boolean z11;
        int i10;
        int i11;
        int i12;
        boolean z12;
        boolean z13;
        ArrayList arrayList = this.f52002y;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.d != null) {
            arrayList.add(new rg.a(4, false));
            arrayList.add(new rb(1, org.telegram.messenger.hd.N0(2131744652, null)));
            arrayList.add(new rg.a(0, false));
            arrayList.add(new rg.a(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                arrayList.add(new rb(12, org.telegram.messenger.hd.N0(2131753321, null)));
                for (int i13 = 0; i13 < this.d.prepaid_giveaways.size(); i13++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i13);
                    if (i13 == this.d.prepaid_giveaways.size() - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    ?? aVar = new rg.a(11, true);
                    aVar.f51534e = prepaidGiveaway;
                    aVar.f51535f = z13;
                    arrayList.add(aVar);
                }
                arrayList.add(new rb(6, org.telegram.messenger.hd.N0(2131753283, null)));
            }
            arrayList.add(new rb(13, org.telegram.messenger.hd.N0(2131753603, null)));
            int i14 = this.E;
            TLRPC.Chat chat = this.J;
            if (i14 == 0) {
                ArrayList arrayList3 = this.h;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new rg.a(8, false));
                    arrayList.add(new rg.a(2, false));
                } else {
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        TL_stories.Boost boost = (TL_stories.Boost) arrayList3.get(i15);
                        if (i15 == arrayList3.size() - 1 && !this.f51998r) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        arrayList.add(new rb(boost, z12, this.E));
                    }
                    if (this.f51998r) {
                        arrayList.add(new rg.a(9, true));
                    } else {
                        arrayList.add(new rg.a(7, false));
                    }
                    if (org.telegram.messenger.v3.V(chat)) {
                        i12 = 2131753602;
                    } else {
                        i12 = 2131753601;
                    }
                    arrayList.add(new rb(6, org.telegram.messenger.hd.N0(i12, null)));
                }
            } else {
                ArrayList arrayList4 = this.f51997n;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new rg.a(8, false));
                    arrayList.add(new rg.a(2, false));
                } else {
                    for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                        TL_stories.Boost boost2 = (TL_stories.Boost) arrayList4.get(i16);
                        if (i16 == arrayList4.size() - 1 && !this.f52000w) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(new rb(boost2, z11, this.E));
                    }
                    if (this.f52000w) {
                        arrayList.add(new rg.a(9, true));
                    } else {
                        arrayList.add(new rg.a(7, false));
                    }
                    if (org.telegram.messenger.v3.V(chat)) {
                        i7 = 2131753602;
                    } else {
                        i7 = 2131753601;
                    }
                    arrayList.add(new rb(6, org.telegram.messenger.hd.N0(i7, null)));
                }
            }
            arrayList.add(new rb(1, org.telegram.messenger.hd.N0(2131748721, null)));
            arrayList.add(new rb(3, this.d.boost_url));
            if (org.telegram.messenger.np.u1(this.f51993b).f25958s4 && org.telegram.messenger.v3.N(chat)) {
                if (org.telegram.messenger.v3.V(chat)) {
                    i10 = 2131753266;
                } else {
                    i10 = 2131753265;
                }
                arrayList.add(new rb(6, org.telegram.messenger.hd.N0(i10, null)));
                arrayList.add(new rg.a(10, true));
                if (org.telegram.messenger.v3.V(chat)) {
                    i11 = 2131753500;
                } else {
                    i11 = 2131753499;
                }
                arrayList.add(new rb(6, org.telegram.messenger.hd.N0(i11, null)));
            }
        }
        qb qbVar = this.F;
        if (z10) {
            qbVar.E(arrayList2, arrayList);
        } else {
            qbVar.f();
        }
    }
}
