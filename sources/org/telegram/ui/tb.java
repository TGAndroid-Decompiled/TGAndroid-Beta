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
public final class tb extends FrameLayout {
    public int D;
    public final rb E;
    public final org.telegram.ui.Components.qj0 F;
    public boolean G;
    public final LinearLayout H;
    public final TLRPC.Chat I;
    public String J;
    public String K;
    public int L;
    public int M;
    public int N;
    public int O;
    public final long f50139a;
    public final int f50140b;
    public final d51 f50141c;
    public TL_stories.TL_premium_boostsStatus d;
    public final org.telegram.ui.ActionBar.g6 f50142e;
    public ScrollSlidingTextTabStrip f50143f;
    public final ArrayList h;
    public final ArrayList f50144n;
    public boolean f50145r;
    public int f50146s;
    public boolean f50147w;
    public int f50148x;
    public final ArrayList f50149y;

    public tb(d51 d51Var, long j3, org.telegram.ui.ActionBar.g6 g6Var) {
        super(d51Var.getParentActivity());
        int i7 = org.telegram.messenger.p10.f24470s0;
        this.f50140b = i7;
        this.h = new ArrayList();
        this.f50144n = new ArrayList();
        this.f50149y = new ArrayList();
        this.D = 0;
        rb rbVar = new rb(this);
        this.E = rbVar;
        this.J = "";
        this.K = "";
        this.L = 5;
        this.M = 5;
        this.f50141c = d51Var;
        Activity parentActivity = d51Var.getParentActivity();
        this.f50142e = g6Var;
        this.f50139a = j3;
        this.I = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(parentActivity, null);
        this.F = qj0Var;
        qj0Var.setSections(true);
        qj0Var.setCaptureSectionsDecoratorAllowed(true);
        qj0Var.setLayoutManager(new v4.b0());
        v4.k kVar = new v4.k();
        kVar.f57083m = false;
        kVar.C = false;
        qj0Var.setItemAnimator(kVar);
        qj0Var.setClipToPadding(false);
        qj0Var.setOnItemClickListener(new nb(this, parentActivity, j3, g6Var, d51Var));
        addView(qj0Var);
        org.telegram.messenger.qp.s1(i7).G0().a(j3, new r3(this, 1));
        qj0Var.setAdapter(rbVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.H = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        imageView.setAutoRepeat(true);
        imageView.f(2131624228, 120, 120, null);
        imageView.d();
        TextView g10 = org.telegram.messenger.k5.g(context, 1, 20.0f);
        g10.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.l6.Cj;
        org.telegram.ui.ActionBar.s6.U(g10, i10, null);
        g10.setTag(Integer.valueOf(i10));
        g10.setText(org.telegram.messenger.id.M0(2131748777, null));
        g10.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.l6.Dj;
        org.telegram.ui.ActionBar.s6.U(textView, i11, null);
        textView.setTag(Integer.valueOf(i11));
        textView.setText(org.telegram.messenger.id.M0(2131748776, null));
        textView.setGravity(1);
        this.H.addView((View) imageView, c8.ha.t(120, 120, 1, 0, 0, 0, 20));
        this.H.addView(g10, c8.ha.t(-2, -2, 1, 0, 0, 0, 10));
        this.H.addView(textView, c8.ha.r(-2, -2, 1));
        addView(this.H, c8.ha.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.H.setAlpha(0.0f);
        this.H.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        bi.ea.y(i7, false).v();
    }

    public final void a(CountDownLatch countDownLatch, pb pbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.M;
        tL_premium_getBoostsList.offset = this.J;
        int i7 = this.f50140b;
        tL_premium_getBoostsList.peer = org.telegram.messenger.qp.s1(i7).j1(this.f50139a);
        ConnectionsManager.getInstance(i7).sendRequest(tL_premium_getBoostsList, new qb(this, countDownLatch, pbVar, 1), 2);
    }

    public final void b(CountDownLatch countDownLatch, pb pbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.L;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.K;
        int i7 = this.f50140b;
        tL_premium_getBoostsList.peer = org.telegram.messenger.qp.s1(i7).j1(this.f50139a);
        ConnectionsManager.getInstance(i7).sendRequest(tL_premium_getBoostsList, new qb(this, countDownLatch, pbVar, 0), 2);
    }

    public final void c(Boolean bool) {
        if (this.G) {
            return;
        }
        this.G = true;
        if (bool == null) {
            Utilities.f21336e.c(new pb(this, 0));
        } else if (bool.booleanValue()) {
            b(null, new pb(this, 1));
        } else {
            a(null, new pb(this, 2));
        }
    }

    public final void d(boolean z9) {
        int i7;
        boolean z10;
        int i10;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        ArrayList arrayList = this.f50149y;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.d != null) {
            arrayList.add(new rg.a(4, false));
            arrayList.add(new sb(1, org.telegram.messenger.id.M0(2131744895, null)));
            arrayList.add(new rg.a(0, false));
            arrayList.add(new rg.a(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                arrayList.add(new sb(12, org.telegram.messenger.id.M0(2131753324, null)));
                for (int i13 = 0; i13 < this.d.prepaid_giveaways.size(); i13++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i13);
                    if (i13 == this.d.prepaid_giveaways.size() - 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    ?? aVar = new rg.a(11, true);
                    aVar.f49854e = prepaidGiveaway;
                    aVar.f49855f = z12;
                    arrayList.add(aVar);
                }
                arrayList.add(new sb(6, org.telegram.messenger.id.M0(2131753286, null)));
            }
            arrayList.add(new sb(13, org.telegram.messenger.id.M0(2131753606, null)));
            int i14 = this.D;
            TLRPC.Chat chat = this.I;
            if (i14 == 0) {
                ArrayList arrayList3 = this.h;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new rg.a(8, false));
                    arrayList.add(new rg.a(2, false));
                } else {
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        TL_stories.Boost boost = (TL_stories.Boost) arrayList3.get(i15);
                        if (i15 == arrayList3.size() - 1 && !this.f50145r) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(new sb(boost, z11, this.D));
                    }
                    if (this.f50145r) {
                        arrayList.add(new rg.a(9, true));
                    } else {
                        arrayList.add(new rg.a(7, false));
                    }
                    if (org.telegram.messenger.t3.V(chat)) {
                        i12 = 2131753605;
                    } else {
                        i12 = 2131753604;
                    }
                    arrayList.add(new sb(6, org.telegram.messenger.id.M0(i12, null)));
                }
            } else {
                ArrayList arrayList4 = this.f50144n;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new rg.a(8, false));
                    arrayList.add(new rg.a(2, false));
                } else {
                    for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                        TL_stories.Boost boost2 = (TL_stories.Boost) arrayList4.get(i16);
                        if (i16 == arrayList4.size() - 1 && !this.f50147w) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        arrayList.add(new sb(boost2, z10, this.D));
                    }
                    if (this.f50147w) {
                        arrayList.add(new rg.a(9, true));
                    } else {
                        arrayList.add(new rg.a(7, false));
                    }
                    if (org.telegram.messenger.t3.V(chat)) {
                        i7 = 2131753605;
                    } else {
                        i7 = 2131753604;
                    }
                    arrayList.add(new sb(6, org.telegram.messenger.id.M0(i7, null)));
                }
            }
            arrayList.add(new sb(1, org.telegram.messenger.id.M0(2131748914, null)));
            arrayList.add(new sb(3, this.d.boost_url));
            if (org.telegram.messenger.qp.s1(this.f50140b).f24865p4 && org.telegram.messenger.t3.N(chat)) {
                if (org.telegram.messenger.t3.V(chat)) {
                    i10 = 2131753269;
                } else {
                    i10 = 2131753268;
                }
                arrayList.add(new sb(6, org.telegram.messenger.id.M0(i10, null)));
                arrayList.add(new rg.a(10, true));
                if (org.telegram.messenger.t3.V(chat)) {
                    i11 = 2131753503;
                } else {
                    i11 = 2131753502;
                }
                arrayList.add(new sb(6, org.telegram.messenger.id.M0(i11, null)));
            }
        }
        rb rbVar = this.E;
        if (z9) {
            rbVar.E(arrayList2, arrayList);
        } else {
            rbVar.f();
        }
    }
}
