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
public final class rb extends FrameLayout {
    public int E;
    public final pb F;
    public final org.telegram.ui.Components.tj0 G;
    public boolean H;
    public final LinearLayout I;
    public final TLRPC.Chat J;
    public String K;
    public String L;
    public int M;
    public int N;
    public int O;
    public int P;
    public final long f49175a;
    public final int f49176b;
    public final r41 f49177c;
    public TL_stories.TL_premium_boostsStatus d;
    public final org.telegram.ui.ActionBar.e6 f49178e;
    public ScrollSlidingTextTabStrip f49179f;
    public final ArrayList h;
    public final ArrayList f49180n;
    public boolean f49181r;
    public int f49182s;
    public boolean f49183w;
    public int f49184x;
    public final ArrayList f49185y;

    public rb(r41 r41Var, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(r41Var.getParentActivity());
        int i3 = org.telegram.messenger.h10.f22829t0;
        this.f49176b = i3;
        this.h = new ArrayList();
        this.f49180n = new ArrayList();
        this.f49185y = new ArrayList();
        this.E = 0;
        pb pbVar = new pb(this);
        this.F = pbVar;
        this.K = "";
        this.L = "";
        this.M = 5;
        this.N = 5;
        this.f49177c = r41Var;
        Activity parentActivity = r41Var.getParentActivity();
        this.f49178e = e6Var;
        this.f49175a = j10;
        this.J = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-j10));
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(parentActivity, null);
        this.G = tj0Var;
        tj0Var.setSections(true);
        tj0Var.setCaptureSectionsDecoratorAllowed(true);
        tj0Var.setLayoutManager(new u4.b0());
        u4.k kVar = new u4.k();
        kVar.f55567m = false;
        kVar.C = false;
        tj0Var.setItemAnimator(kVar);
        tj0Var.setClipToPadding(false);
        tj0Var.setOnItemClickListener(new lb(this, parentActivity, j10, e6Var, r41Var));
        addView(tj0Var);
        org.telegram.messenger.hp.s1(i3).G0().a(j10, new s3(this, 1));
        tj0Var.setAdapter(pbVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.I = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        imageView.setAutoRepeat(true);
        imageView.f(2131624228, 120, 120, null);
        imageView.d();
        TextView g7 = org.telegram.messenger.k5.g(context, 1, 20.0f);
        g7.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.k6.Cj;
        org.telegram.ui.ActionBar.r6.V(g7, i10, null);
        g7.setTag(Integer.valueOf(i10));
        g7.setText(org.telegram.messenger.bd.M0(2131748785, null));
        g7.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Dj;
        org.telegram.ui.ActionBar.r6.V(textView, i11, null);
        textView.setTag(Integer.valueOf(i11));
        textView.setText(org.telegram.messenger.bd.M0(2131748784, null));
        textView.setGravity(1);
        this.I.addView((View) imageView, b8.mf.t(120, 120, 1, 0, 0, 0, 20));
        this.I.addView(g7, b8.mf.t(-2, -2, 1, 0, 0, 0, 10));
        this.I.addView(textView, b8.mf.r(-2, -2, 1));
        addView(this.I, b8.mf.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.I.setAlpha(0.0f);
        this.I.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        ci.e9.y(i3, false).v();
    }

    public final void a(CountDownLatch countDownLatch, nb nbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.N;
        tL_premium_getBoostsList.offset = this.K;
        int i3 = this.f49176b;
        tL_premium_getBoostsList.peer = org.telegram.messenger.hp.s1(i3).j1(this.f49175a);
        ConnectionsManager.getInstance(i3).sendRequest(tL_premium_getBoostsList, new ob(this, countDownLatch, nbVar, 1), 2);
    }

    public final void b(CountDownLatch countDownLatch, nb nbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.M;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.L;
        int i3 = this.f49176b;
        tL_premium_getBoostsList.peer = org.telegram.messenger.hp.s1(i3).j1(this.f49175a);
        ConnectionsManager.getInstance(i3).sendRequest(tL_premium_getBoostsList, new ob(this, countDownLatch, nbVar, 0), 2);
    }

    public final void c(Boolean bool) {
        if (this.H) {
            return;
        }
        this.H = true;
        if (bool == null) {
            Utilities.f21387e.c(new nb(this, 0));
        } else if (bool.booleanValue()) {
            b(null, new nb(this, 1));
        } else {
            a(null, new nb(this, 2));
        }
    }

    public final void d(boolean z10) {
        int i3;
        boolean z11;
        int i10;
        int i11;
        int i12;
        boolean z12;
        boolean z13;
        ArrayList arrayList = this.f49185y;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.d != null) {
            arrayList.add(new sg.a(4, false));
            arrayList.add(new qb(1, org.telegram.messenger.bd.M0(2131744905, null)));
            arrayList.add(new sg.a(0, false));
            arrayList.add(new sg.a(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                arrayList.add(new qb(12, org.telegram.messenger.bd.M0(2131753324, null)));
                for (int i13 = 0; i13 < this.d.prepaid_giveaways.size(); i13++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i13);
                    if (i13 == this.d.prepaid_giveaways.size() - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    ?? aVar = new sg.a(11, true);
                    aVar.f48832e = prepaidGiveaway;
                    aVar.f48833f = z13;
                    arrayList.add(aVar);
                }
                arrayList.add(new qb(6, org.telegram.messenger.bd.M0(2131753286, null)));
            }
            arrayList.add(new qb(13, org.telegram.messenger.bd.M0(2131753606, null)));
            int i14 = this.E;
            TLRPC.Chat chat = this.J;
            if (i14 == 0) {
                ArrayList arrayList3 = this.h;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new sg.a(8, false));
                    arrayList.add(new sg.a(2, false));
                } else {
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        TL_stories.Boost boost = (TL_stories.Boost) arrayList3.get(i15);
                        if (i15 == arrayList3.size() - 1 && !this.f49181r) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        arrayList.add(new qb(boost, z12, this.E));
                    }
                    if (this.f49181r) {
                        arrayList.add(new sg.a(9, true));
                    } else {
                        arrayList.add(new sg.a(7, false));
                    }
                    if (org.telegram.messenger.t3.V(chat)) {
                        i12 = 2131753605;
                    } else {
                        i12 = 2131753604;
                    }
                    arrayList.add(new qb(6, org.telegram.messenger.bd.M0(i12, null)));
                }
            } else {
                ArrayList arrayList4 = this.f49180n;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new sg.a(8, false));
                    arrayList.add(new sg.a(2, false));
                } else {
                    for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                        TL_stories.Boost boost2 = (TL_stories.Boost) arrayList4.get(i16);
                        if (i16 == arrayList4.size() - 1 && !this.f49183w) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(new qb(boost2, z11, this.E));
                    }
                    if (this.f49183w) {
                        arrayList.add(new sg.a(9, true));
                    } else {
                        arrayList.add(new sg.a(7, false));
                    }
                    if (org.telegram.messenger.t3.V(chat)) {
                        i3 = 2131753605;
                    } else {
                        i3 = 2131753604;
                    }
                    arrayList.add(new qb(6, org.telegram.messenger.bd.M0(i3, null)));
                }
            }
            arrayList.add(new qb(1, org.telegram.messenger.bd.M0(2131748922, null)));
            arrayList.add(new qb(3, this.d.boost_url));
            if (org.telegram.messenger.hp.s1(this.f49176b).f23090p4 && org.telegram.messenger.t3.N(chat)) {
                if (org.telegram.messenger.t3.V(chat)) {
                    i10 = 2131753269;
                } else {
                    i10 = 2131753268;
                }
                arrayList.add(new qb(6, org.telegram.messenger.bd.M0(i10, null)));
                arrayList.add(new sg.a(10, true));
                if (org.telegram.messenger.t3.V(chat)) {
                    i11 = 2131753503;
                } else {
                    i11 = 2131753502;
                }
                arrayList.add(new qb(6, org.telegram.messenger.bd.M0(i11, null)));
            }
        }
        pb pbVar = this.F;
        if (z10) {
            pbVar.E(arrayList2, arrayList);
        } else {
            pbVar.f();
        }
    }
}
