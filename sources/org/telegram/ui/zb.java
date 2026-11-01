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
public final class zb extends FrameLayout {
    public int D;
    public final xb E;
    public final org.telegram.ui.Components.uk0 F;
    public boolean G;
    public final LinearLayout H;
    public final TLRPC.Chat I;
    public String J;
    public String K;
    public int L;
    public int M;
    public int N;
    public int O;
    public final long f43874a;
    public final int f43875b;
    public final s61 f43876c;
    public TL_stories.TL_premium_boostsStatus d;
    public final org.telegram.ui.ActionBar.p6 e;
    public ScrollSlidingTextTabStrip f43877f;
    public final ArrayList h;
    public final ArrayList f43878n;
    public boolean f43879r;
    public int f43880s;
    public boolean f43881w;
    public int f43882x;
    public final ArrayList f43883y;

    public zb(s61 s61Var, long j10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(s61Var.getParentActivity());
        int i10 = org.telegram.messenger.e20.f15506s0;
        this.f43875b = i10;
        this.h = new ArrayList();
        this.f43878n = new ArrayList();
        this.f43883y = new ArrayList();
        this.D = 0;
        xb xbVar = new xb(this);
        this.E = xbVar;
        this.J = "";
        this.K = "";
        this.L = 5;
        this.M = 5;
        this.f43876c = s61Var;
        Activity parentActivity = s61Var.getParentActivity();
        this.e = p6Var;
        this.f43874a = j10;
        this.I = org.telegram.messenger.wp.r1(i10).L0(Long.valueOf(-j10));
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(parentActivity, null);
        this.F = uk0Var;
        uk0Var.setSections(true);
        uk0Var.setCaptureSectionsDecoratorAllowed(true);
        uk0Var.setLayoutManager(new s4.a0());
        s4.j jVar = new s4.j();
        jVar.f47938m = false;
        jVar.C = false;
        uk0Var.setItemAnimator(jVar);
        uk0Var.setClipToPadding(false);
        uk0Var.setOnItemClickListener(new tb(this, parentActivity, j10, p6Var, s61Var));
        addView(uk0Var);
        org.telegram.messenger.wp.r1(i10).G0().a(j10, new s3(this, 1));
        uk0Var.setAdapter(xbVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.H = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        imageView.setAutoRepeat(true);
        imageView.f(2131624226, 120, 120, null);
        imageView.d();
        TextView g10 = org.telegram.messenger.m5.g(context, 1, 20.0f);
        g10.setTypeface(org.telegram.messenger.i0.o());
        int i11 = org.telegram.ui.ActionBar.t6.Cj;
        org.telegram.ui.ActionBar.a7.V(g10, i11, null);
        g10.setTag(Integer.valueOf(i11));
        g10.setText(org.telegram.messenger.dd.L0(2131748787, null));
        g10.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.t6.Dj;
        org.telegram.ui.ActionBar.a7.V(textView, i12, null);
        textView.setTag(Integer.valueOf(i12));
        textView.setText(org.telegram.messenger.dd.L0(2131748786, null));
        textView.setGravity(1);
        this.H.addView((View) imageView, w7.b6.t(120, 120, 1, 0, 0, 0, 20));
        this.H.addView(g10, w7.b6.t(-2, -2, 1, 0, 0, 0, 10));
        this.H.addView(textView, w7.b6.r(-2, -2, 1));
        addView(this.H, w7.b6.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.H.setAlpha(0.0f);
        this.H.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        rh.e6.y(i10, false).v();
    }

    public final void a(CountDownLatch countDownLatch, vb vbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.M;
        tL_premium_getBoostsList.offset = this.J;
        int i10 = this.f43875b;
        tL_premium_getBoostsList.peer = org.telegram.messenger.wp.r1(i10).i1(this.f43874a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new wb(this, countDownLatch, vbVar, 1), 2);
    }

    public final void b(CountDownLatch countDownLatch, vb vbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.L;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.K;
        int i10 = this.f43875b;
        tL_premium_getBoostsList.peer = org.telegram.messenger.wp.r1(i10).i1(this.f43874a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new wb(this, countDownLatch, vbVar, 0), 2);
    }

    public final void c(Boolean bool) {
        if (this.G) {
            return;
        }
        this.G = true;
        if (bool == null) {
            Utilities.e.c(new vb(this, 0));
        } else if (bool.booleanValue()) {
            b(null, new vb(this, 1));
        } else {
            a(null, new vb(this, 2));
        }
    }

    public final void d(boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        ArrayList arrayList = this.f43883y;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.d != null) {
            arrayList.add(new hg.b(4, false));
            arrayList.add(new yb(1, org.telegram.messenger.dd.L0(2131744913, null)));
            arrayList.add(new hg.b(0, false));
            arrayList.add(new hg.b(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                arrayList.add(new yb(12, org.telegram.messenger.dd.L0(2131753324, null)));
                for (int i14 = 0; i14 < this.d.prepaid_giveaways.size(); i14++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i14);
                    if (i14 == this.d.prepaid_giveaways.size() - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    ?? bVar = new hg.b(11, true);
                    bVar.e = prepaidGiveaway;
                    bVar.f43629f = z13;
                    arrayList.add(bVar);
                }
                arrayList.add(new yb(6, org.telegram.messenger.dd.L0(2131753286, null)));
            }
            arrayList.add(new yb(13, org.telegram.messenger.dd.L0(2131753606, null)));
            int i15 = this.D;
            TLRPC.Chat chat = this.I;
            if (i15 == 0) {
                ArrayList arrayList3 = this.h;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new hg.b(8, false));
                    arrayList.add(new hg.b(2, false));
                } else {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        TL_stories.Boost boost = (TL_stories.Boost) arrayList3.get(i16);
                        if (i16 == arrayList3.size() - 1 && !this.f43879r) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        arrayList.add(new yb(boost, z12, this.D));
                    }
                    if (this.f43879r) {
                        arrayList.add(new hg.b(9, true));
                    } else {
                        arrayList.add(new hg.b(7, false));
                    }
                    if (org.telegram.messenger.w3.V(chat)) {
                        i13 = 2131753605;
                    } else {
                        i13 = 2131753604;
                    }
                    arrayList.add(new yb(6, org.telegram.messenger.dd.L0(i13, null)));
                }
            } else {
                ArrayList arrayList4 = this.f43878n;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new hg.b(8, false));
                    arrayList.add(new hg.b(2, false));
                } else {
                    for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                        TL_stories.Boost boost2 = (TL_stories.Boost) arrayList4.get(i17);
                        if (i17 == arrayList4.size() - 1 && !this.f43881w) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(new yb(boost2, z11, this.D));
                    }
                    if (this.f43881w) {
                        arrayList.add(new hg.b(9, true));
                    } else {
                        arrayList.add(new hg.b(7, false));
                    }
                    if (org.telegram.messenger.w3.V(chat)) {
                        i10 = 2131753605;
                    } else {
                        i10 = 2131753604;
                    }
                    arrayList.add(new yb(6, org.telegram.messenger.dd.L0(i10, null)));
                }
            }
            arrayList.add(new yb(1, org.telegram.messenger.dd.L0(2131748924, null)));
            arrayList.add(new yb(3, this.d.boost_url));
            if (org.telegram.messenger.wp.r1(this.f43875b).f19222q4 && org.telegram.messenger.w3.N(chat)) {
                if (org.telegram.messenger.w3.V(chat)) {
                    i11 = 2131753269;
                } else {
                    i11 = 2131753268;
                }
                arrayList.add(new yb(6, org.telegram.messenger.dd.L0(i11, null)));
                arrayList.add(new hg.b(10, true));
                if (org.telegram.messenger.w3.V(chat)) {
                    i12 = 2131753503;
                } else {
                    i12 = 2131753502;
                }
                arrayList.add(new yb(6, org.telegram.messenger.dd.L0(i12, null)));
            }
        }
        xb xbVar = this.E;
        if (z10) {
            xbVar.E(arrayList2, arrayList);
        } else {
            xbVar.f();
        }
    }
}
