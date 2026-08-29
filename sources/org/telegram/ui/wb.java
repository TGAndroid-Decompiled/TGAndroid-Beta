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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class wb extends FrameLayout {
    public final ub A;
    public final org.telegram.ui.Components.jl0 B;
    public lg.k C;
    public boolean D;
    public final LinearLayout E;
    public final TLRPC.Chat F;
    public String G;
    public String H;
    public int I;
    public int J;
    public int K;
    public int L;
    public final long f43916a;
    public final int f43917b;
    public final t91 f43918c;
    public TL_stories.TL_premium_boostsStatus d;
    public final org.telegram.ui.ActionBar.c6 f43919e;
    public ScrollSlidingTextTabStrip f43920f;
    public final ArrayList h;
    public final ArrayList f43921n;
    public boolean f43922r;
    public int f43923s;
    public boolean v;
    public int f43924w;
    public final ArrayList f43925x;
    public int f43926y;

    public wb(t91 t91Var, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(t91Var.getParentActivity());
        int i10 = UserConfig.selectedAccount;
        this.f43917b = i10;
        this.h = new ArrayList();
        this.f43921n = new ArrayList();
        this.f43925x = new ArrayList();
        this.f43926y = 0;
        ub ubVar = new ub(this);
        this.A = ubVar;
        this.G = "";
        this.H = "";
        this.I = 5;
        this.J = 5;
        this.f43918c = t91Var;
        Activity parentActivity = t91Var.getParentActivity();
        this.f43919e = c6Var;
        this.f43916a = j10;
        this.F = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(parentActivity, null);
        this.B = jl0Var;
        jl0Var.setSections(true);
        jl0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23009a7, c6Var));
        jl0Var.setLayoutManager(new f2.j0());
        f2.l lVar = new f2.l();
        lVar.f6463m = false;
        lVar.C = false;
        jl0Var.setItemAnimator(lVar);
        jl0Var.setClipToPadding(false);
        jl0Var.setOnItemClickListener(new pb(this, parentActivity, j10, c6Var, t91Var));
        addView(jl0Var);
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j10, new rb(this, 0));
        jl0Var.setAdapter(ubVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        imageView.setAutoRepeat(true);
        imageView.f(R.raw.statistic_preload, 120, 120, null);
        imageView.d();
        TextView h = org.telegram.messenger.x3.h(context, 1, 20.0f);
        h.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.Oi;
        h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        h.setTag(Integer.valueOf(i11));
        h.setText(LocaleController.getString(R.string.LoadingStats));
        h.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.g6.Pi;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        b.i(R.string.LoadingStatsDescription, textView, 1);
        this.E.addView((View) imageView, i7.f6.t(120, 120, 1, 0, 0, 0, 20));
        this.E.addView(h, i7.f6.t(-2, -2, 1, 0, 0, 0, 10));
        this.E.addView(textView, i7.f6.q(-2, -2, 1));
        addView(this.E, i7.f6.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.E.setAlpha(0.0f);
        this.E.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        jh.s7.y(i10, false).v();
    }

    public final void a(CountDownLatch countDownLatch, sb sbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.J;
        tL_premium_getBoostsList.offset = this.G;
        int i10 = this.f43917b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.f43916a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new tb(this, countDownLatch, sbVar, 1), 2);
    }

    public final void b(CountDownLatch countDownLatch, sb sbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.I;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.H;
        int i10 = this.f43917b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.f43916a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new tb(this, countDownLatch, sbVar, 0), 2);
    }

    public final void c(Boolean bool) {
        if (this.D) {
            return;
        }
        this.D = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new sb(this, 0));
        } else if (bool.booleanValue()) {
            b(null, new sb(this, 1));
        } else {
            a(null, new sb(this, 2));
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
        ArrayList arrayList = this.f43925x;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.d != null) {
            arrayList.add(new zf.a(4, false));
            arrayList.add(new vb(1, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new zf.a(0, false));
            arrayList.add(new zf.a(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                arrayList.add(new vb(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                for (int i14 = 0; i14 < this.d.prepaid_giveaways.size(); i14++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i14);
                    if (i14 == this.d.prepaid_giveaways.size() - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    ?? aVar = new zf.a(11, true);
                    aVar.f43495e = prepaidGiveaway;
                    aVar.f43496f = z13;
                    arrayList.add(aVar);
                }
                arrayList.add(new vb(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new vb(13, LocaleController.getString(R.string.Boosters)));
            int i15 = this.f43926y;
            TLRPC.Chat chat = this.F;
            if (i15 == 0) {
                ArrayList arrayList3 = this.h;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new zf.a(8, false));
                    arrayList.add(new zf.a(2, false));
                } else {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        TL_stories.Boost boost = (TL_stories.Boost) arrayList3.get(i16);
                        if (i16 == arrayList3.size() - 1 && !this.f43922r) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        arrayList.add(new vb(boost, z12, this.f43926y));
                    }
                    if (this.f43922r) {
                        arrayList.add(new zf.a(9, true));
                    } else {
                        arrayList.add(new zf.a(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i13 = R.string.BoostersInfoDescription;
                    } else {
                        i13 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new vb(6, LocaleController.getString(i13)));
                }
            } else {
                ArrayList arrayList4 = this.f43921n;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new zf.a(8, false));
                    arrayList.add(new zf.a(2, false));
                } else {
                    for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                        TL_stories.Boost boost2 = (TL_stories.Boost) arrayList4.get(i17);
                        if (i17 == arrayList4.size() - 1 && !this.v) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(new vb(boost2, z11, this.f43926y));
                    }
                    if (this.v) {
                        arrayList.add(new zf.a(9, true));
                    } else {
                        arrayList.add(new zf.a(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i10 = R.string.BoostersInfoDescription;
                    } else {
                        i10 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new vb(6, LocaleController.getString(i10)));
                }
            }
            arrayList.add(new vb(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new vb(3, this.d.boost_url));
            if (MessagesController.getInstance(this.f43917b).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i11 = R.string.BoostingShareThisLink;
                } else {
                    i11 = R.string.BoostingShareThisLinkGroup;
                }
                arrayList.add(new vb(6, LocaleController.getString(i11)));
                arrayList.add(new zf.a(10, true));
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i12 = R.string.BoostingGetMoreBoosts2;
                } else {
                    i12 = R.string.BoostingGetMoreBoostsGroup;
                }
                arrayList.add(new vb(6, LocaleController.getString(i12)));
            }
        }
        ub ubVar = this.A;
        if (z10) {
            ubVar.E(arrayList2, arrayList);
        } else {
            ubVar.l();
        }
    }
}
