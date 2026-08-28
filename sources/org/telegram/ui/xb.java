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
public final class xb extends FrameLayout {
    public final vb A;
    public final org.telegram.ui.Components.wk0 B;
    public ig.k C;
    public boolean D;
    public final LinearLayout E;
    public final TLRPC.Chat F;
    public String G;
    public String H;
    public int I;
    public int J;
    public int K;
    public int L;
    public final long f44445a;
    public final int f44446b;
    public final s91 f44447c;
    public TL_stories.TL_premium_boostsStatus d;
    public final org.telegram.ui.ActionBar.b6 f44448e;
    public ScrollSlidingTextTabStrip f44449f;
    public final ArrayList h;
    public final ArrayList f44450n;
    public boolean f44451r;
    public int f44452s;
    public boolean v;
    public int f44453w;
    public final ArrayList f44454x;
    public int f44455y;

    public xb(s91 s91Var, long j10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(s91Var.getParentActivity());
        int i9 = UserConfig.selectedAccount;
        this.f44446b = i9;
        this.h = new ArrayList();
        this.f44450n = new ArrayList();
        this.f44454x = new ArrayList();
        this.f44455y = 0;
        vb vbVar = new vb(this);
        this.A = vbVar;
        this.G = "";
        this.H = "";
        this.I = 5;
        this.J = 5;
        this.f44447c = s91Var;
        Activity parentActivity = s91Var.getParentActivity();
        this.f44448e = b6Var;
        this.f44445a = j10;
        this.F = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(parentActivity, null);
        this.B = wk0Var;
        wk0Var.setSections(true);
        wk0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22947a7, b6Var));
        wk0Var.setLayoutManager(new f2.m0());
        f2.n nVar = new f2.n();
        nVar.f5532m = false;
        nVar.C = false;
        wk0Var.setItemAnimator(nVar);
        wk0Var.setClipToPadding(false);
        wk0Var.setOnItemClickListener(new qb(this, parentActivity, j10, b6Var, s91Var));
        addView(wk0Var);
        MessagesController.getInstance(i9).getBoostsController().getBoostsStats(j10, new sb(this, 0));
        wk0Var.setAdapter(vbVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        imageView.setAutoRepeat(true);
        imageView.f(R.raw.statistic_preload, 120, 120, null);
        imageView.d();
        TextView g10 = org.telegram.messenger.l0.g(context, 1, 20.0f);
        g10.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.f6.Oi;
        g10.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        g10.setTag(Integer.valueOf(i10));
        g10.setText(LocaleController.getString(R.string.LoadingStats));
        g10.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.f6.Pi;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        textView.setTag(Integer.valueOf(i11));
        org.telegram.messenger.ll.l(R.string.LoadingStatsDescription, textView, 1);
        this.E.addView((View) imageView, g7.e6.t(120, 120, 1, 0, 0, 0, 20));
        this.E.addView(g10, g7.e6.t(-2, -2, 1, 0, 0, 0, 10));
        this.E.addView(textView, g7.e6.q(-2, -2, 1));
        addView(this.E, g7.e6.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.E.setAlpha(0.0f);
        this.E.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        gh.v7.y(i9, false).v();
    }

    public final void a(CountDownLatch countDownLatch, tb tbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.J;
        tL_premium_getBoostsList.offset = this.G;
        int i9 = this.f44446b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i9).getInputPeer(this.f44445a);
        ConnectionsManager.getInstance(i9).sendRequest(tL_premium_getBoostsList, new ub(this, countDownLatch, tbVar, 1), 2);
    }

    public final void b(CountDownLatch countDownLatch, tb tbVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.I;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.H;
        int i9 = this.f44446b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i9).getInputPeer(this.f44445a);
        ConnectionsManager.getInstance(i9).sendRequest(tL_premium_getBoostsList, new ub(this, countDownLatch, tbVar, 0), 2);
    }

    public final void c(Boolean bool) {
        if (this.D) {
            return;
        }
        this.D = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new tb(this, 0));
        } else if (bool.booleanValue()) {
            b(null, new tb(this, 1));
        } else {
            a(null, new tb(this, 2));
        }
    }

    public final void d(boolean z10) {
        int i9;
        boolean z11;
        int i10;
        int i11;
        int i12;
        boolean z12;
        boolean z13;
        ArrayList arrayList = this.f44454x;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.d != null) {
            arrayList.add(new wf.a(4, false));
            arrayList.add(new wb(1, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new wf.a(0, false));
            arrayList.add(new wf.a(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                arrayList.add(new wb(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                for (int i13 = 0; i13 < this.d.prepaid_giveaways.size(); i13++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i13);
                    if (i13 == this.d.prepaid_giveaways.size() - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    ?? aVar = new wf.a(11, true);
                    aVar.f43718e = prepaidGiveaway;
                    aVar.f43719f = z13;
                    arrayList.add(aVar);
                }
                arrayList.add(new wb(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new wb(13, LocaleController.getString(R.string.Boosters)));
            int i14 = this.f44455y;
            TLRPC.Chat chat = this.F;
            if (i14 == 0) {
                ArrayList arrayList3 = this.h;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new wf.a(8, false));
                    arrayList.add(new wf.a(2, false));
                } else {
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        TL_stories.Boost boost = (TL_stories.Boost) arrayList3.get(i15);
                        if (i15 == arrayList3.size() - 1 && !this.f44451r) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        arrayList.add(new wb(boost, z12, this.f44455y));
                    }
                    if (this.f44451r) {
                        arrayList.add(new wf.a(9, true));
                    } else {
                        arrayList.add(new wf.a(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.BoostersInfoDescription;
                    } else {
                        i12 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new wb(6, LocaleController.getString(i12)));
                }
            } else {
                ArrayList arrayList4 = this.f44450n;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new wf.a(8, false));
                    arrayList.add(new wf.a(2, false));
                } else {
                    for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                        TL_stories.Boost boost2 = (TL_stories.Boost) arrayList4.get(i16);
                        if (i16 == arrayList4.size() - 1 && !this.v) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(new wb(boost2, z11, this.f44455y));
                    }
                    if (this.v) {
                        arrayList.add(new wf.a(9, true));
                    } else {
                        arrayList.add(new wf.a(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i9 = R.string.BoostersInfoDescription;
                    } else {
                        i9 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new wb(6, LocaleController.getString(i9)));
                }
            }
            arrayList.add(new wb(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new wb(3, this.d.boost_url));
            if (MessagesController.getInstance(this.f44446b).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i10 = R.string.BoostingShareThisLink;
                } else {
                    i10 = R.string.BoostingShareThisLinkGroup;
                }
                arrayList.add(new wb(6, LocaleController.getString(i10)));
                arrayList.add(new wf.a(10, true));
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i11 = R.string.BoostingGetMoreBoosts2;
                } else {
                    i11 = R.string.BoostingGetMoreBoostsGroup;
                }
                arrayList.add(new wb(6, LocaleController.getString(i11)));
            }
        }
        vb vbVar = this.A;
        if (z10) {
            vbVar.E(arrayList2, arrayList);
        } else {
            vbVar.l();
        }
    }
}
