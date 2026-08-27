package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
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

public final class yb extends FrameLayout {
    public final wb A;
    public final org.telegram.ui.Components.zk0 B;
    public jg.k C;
    public boolean D;
    public final LinearLayout E;
    public final TLRPC.Chat F;
    public String G;
    public String H;
    public int I;
    public int J;
    public int K;
    public int L;

    public final long f44752a;

    public final int f44753b;

    public final q91 f44754c;
    public TL_stories.TL_premium_boostsStatus d;

    public final org.telegram.ui.ActionBar.c6 f44755e;

    public ScrollSlidingTextTabStrip f44756f;
    public final ArrayList h;

    public final ArrayList f44757n;

    public boolean f44758r;

    public int f44759s;
    public boolean v;

    public int f44760w;

    public final ArrayList f44761x;

    public int f44762y;

    public yb(q91 q91Var, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(q91Var.getParentActivity());
        int i10 = UserConfig.selectedAccount;
        this.f44753b = i10;
        this.h = new ArrayList();
        this.f44757n = new ArrayList();
        this.f44761x = new ArrayList();
        this.f44762y = 0;
        wb wbVar = new wb(this);
        this.A = wbVar;
        this.G = "";
        this.H = "";
        this.I = 5;
        this.J = 5;
        this.f44754c = q91Var;
        Activity parentActivity = q91Var.getParentActivity();
        this.f44755e = c6Var;
        this.f44752a = j10;
        this.F = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(parentActivity, null);
        this.B = zk0Var;
        zk0Var.setSections(true);
        zk0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f22999a7, c6Var));
        zk0Var.setLayoutManager(new f2.k0());
        f2.l lVar = new f2.l();
        lVar.f5819m = false;
        lVar.C = false;
        zk0Var.setItemAnimator(lVar);
        zk0Var.setClipToPadding(false);
        zk0Var.setOnItemClickListener(new rb(this, parentActivity, j10, c6Var, q91Var));
        addView(zk0Var);
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j10, new tb(this, 0));
        zk0Var.setAdapter(wbVar);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        ri0Var.setAutoRepeat(true);
        ri0Var.f(R.raw.statistic_preload, 120, 120, null);
        ri0Var.d();
        TextView textViewH = org.telegram.messenger.y1.h(context, 1, 20.0f);
        textViewH.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.Oi;
        textViewH.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textViewH.setTag(Integer.valueOf(i11));
        textViewH.setText(LocaleController.getString(R.string.LoadingStats));
        textViewH.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.g6.Pi;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        org.telegram.messenger.rl.i(R.string.LoadingStatsDescription, textView, 1);
        this.E.addView(ri0Var, h7.z5.t(120, 120, 1, 0, 0, 0, 20));
        this.E.addView(textViewH, h7.z5.t(-2, -2, 1, 0, 0, 0, 10));
        this.E.addView(textView, h7.z5.q(-2, -2, 1));
        addView(this.E, h7.z5.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.E.setAlpha(0.0f);
        this.E.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        hh.u7.y(i10, false).v();
    }

    public final void a(CountDownLatch countDownLatch, ub ubVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.J;
        tL_premium_getBoostsList.offset = this.G;
        int i10 = this.f44753b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.f44752a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new vb(this, countDownLatch, ubVar, 1), 2);
    }

    public final void b(CountDownLatch countDownLatch, ub ubVar) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.I;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.H;
        int i10 = this.f44753b;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.f44752a);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new vb(this, countDownLatch, ubVar, 0), 2);
    }

    public final void c(Boolean bool) {
        if (this.D) {
            return;
        }
        this.D = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new ub(this, 0));
        } else if (bool.booleanValue()) {
            b(null, new ub(this, 1));
        } else {
            a(null, new ub(this, 2));
        }
    }

    public final void d(boolean z10) {
        ArrayList arrayList = this.f44761x;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.d != null) {
            arrayList.add(new xb(4, false));
            arrayList.add(new xb(1, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new xb(0, false));
            arrayList.add(new xb(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                arrayList.add(new xb(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                int i10 = 0;
                while (i10 < this.d.prepaid_giveaways.size()) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i10);
                    boolean z11 = i10 == this.d.prepaid_giveaways.size() - 1;
                    xb xbVar = new xb(11, true);
                    xbVar.f44369e = prepaidGiveaway;
                    xbVar.f44370f = z11;
                    arrayList.add(xbVar);
                    i10++;
                }
                arrayList.add(new xb(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new xb(13, LocaleController.getString(R.string.Boosters)));
            int i11 = this.f44762y;
            TLRPC.Chat chat = this.F;
            if (i11 == 0) {
                ArrayList arrayList3 = this.h;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new xb(8, false));
                    arrayList.add(new xb(2, false));
                } else {
                    int i12 = 0;
                    while (i12 < arrayList3.size()) {
                        arrayList.add(new xb((TL_stories.Boost) arrayList3.get(i12), i12 == arrayList3.size() - 1 && !this.f44758r, this.f44762y));
                        i12++;
                    }
                    if (this.f44758r) {
                        arrayList.add(new xb(9, true));
                    } else {
                        arrayList.add(new xb(7, false));
                    }
                    arrayList.add(new xb(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            } else {
                ArrayList arrayList4 = this.f44757n;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new xb(8, false));
                    arrayList.add(new xb(2, false));
                } else {
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        arrayList.add(new xb((TL_stories.Boost) arrayList4.get(i13), i13 == arrayList4.size() - 1 && !this.v, this.f44762y));
                        i13++;
                    }
                    if (this.v) {
                        arrayList.add(new xb(9, true));
                    } else {
                        arrayList.add(new xb(7, false));
                    }
                    arrayList.add(new xb(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            }
            arrayList.add(new xb(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new xb(3, this.d.boost_url));
            if (MessagesController.getInstance(this.f44753b).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                arrayList.add(new xb(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingShareThisLink : R.string.BoostingShareThisLinkGroup)));
                arrayList.add(new xb(10, true));
                arrayList.add(new xb(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoosts2 : R.string.BoostingGetMoreBoostsGroup)));
            }
        }
        wb wbVar = this.A;
        if (z10) {
            wbVar.E(arrayList2, arrayList);
        } else {
            wbVar.l();
        }
    }
}
