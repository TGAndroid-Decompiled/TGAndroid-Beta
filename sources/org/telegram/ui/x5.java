package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class x5 extends d20 implements NotificationCenter.NotificationCenterDelegate {
    public final long R;
    public final int S;
    public TL_stories.TL_premium_boostsStatus T;
    public ChannelBoostsController.CanApplyBoost U;
    public ScrollSlidingTextTabStrip V;
    public final ArrayList W;
    public final ArrayList X;
    public boolean Y;
    public int Z;
    public boolean f45643a0;
    public int f45644b0;
    public final ArrayList f45645c0;
    public int f45646d0;
    public LimitPreviewView f45647e0;
    public final r5 f45648f0;
    public boolean f45649g0;
    public LinearLayout f45650h0;
    public final TLRPC.Chat f45651i0;
    public String f45652j0;
    public String f45653k0;
    public int f45654l0;
    public int m0;
    public int f45655n0;
    public int f45656o0;

    public x5(long j10) {
        int i10 = UserConfig.selectedAccount;
        this.S = i10;
        this.W = new ArrayList();
        this.X = new ArrayList();
        this.f45645c0 = new ArrayList();
        this.f45646d0 = 0;
        this.f45648f0 = new r5(this);
        this.f45652j0 = "";
        this.f45653k0 = "";
        this.f45654l0 = 5;
        this.m0 = 5;
        this.R = j10;
        this.f45651i0 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
    }

    public static void w0(x5 x5Var, Context context, View view, int i10) {
        long j10 = x5Var.R;
        boolean z10 = false;
        if (view instanceof ah.b) {
            ah.b bVar = (ah.b) view;
            TL_stories.Boost boost = bVar.getBoost();
            boolean z11 = boost.giveaway;
            if (z11 && boost.stars > 0) {
                bi.dd.d1(context, x5Var.S, x5Var.R, boost, x5Var.getResourceProvider());
            } else {
                boolean z12 = boost.gift;
                if (((!z12 && !z11) || boost.user_id < 0) && !boost.unclaimed) {
                    if (z11 && boost.user_id == -1) {
                        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(x5Var.getParentActivity(), x5Var.getResourceProvider());
                        ybVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                        ybVar.f35001b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                        ybVar.f35001b.setSingleLine(false);
                        ybVar.f35001b.setMaxLines(2);
                        org.telegram.ui.Components.qc.g(x5Var, ybVar, 2750).j();
                    } else if (!z12 && !z11) {
                        x5Var.presentFragment(ProfileActivity.t4(bVar.getDialogId()));
                    }
                } else {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-x5Var.f45651i0.f22027id);
                    int i11 = boost.date;
                    tL_payments_checkedGiftCode.date = i11;
                    tL_payments_checkedGiftCode.via_giveaway = boost.giveaway;
                    int i12 = boost.expires - i11;
                    tL_payments_checkedGiftCode.days = i12 / 86400;
                    tL_payments_checkedGiftCode.months = (i12 / 30) / 86400;
                    if (boost.unclaimed) {
                        tL_payments_checkedGiftCode.to_id = -1L;
                        tL_payments_checkedGiftCode.flags = -1;
                    } else {
                        tL_payments_checkedGiftCode.boost = boost;
                    }
                    new vg.c0(x5Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                }
            }
        }
        if (view instanceof org.telegram.ui.Cells.v8) {
            vg.n.m(x5Var, x5Var.resourceProvider, j10, null);
        }
        if (view instanceof ah.c) {
            vg.n.m(x5Var, x5Var.resourceProvider, j10, ((ah.c) view).getPrepaidGiveaway());
        }
        if (((w5) x5Var.f45645c0.get(i10)).f47040a == 9) {
            if (x5Var.f45646d0 == 1) {
                z10 = true;
            }
            x5Var.D0(Boolean.valueOf(z10));
        }
    }

    public final void B0(CountDownLatch countDownLatch, o5 o5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.m0;
        tL_premium_getBoostsList.offset = this.f45652j0;
        int i10 = this.S;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.R);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new m5(this, countDownLatch, o5Var, 0), 2);
    }

    public final void C0(CountDownLatch countDownLatch, o5 o5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.f45654l0;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.f45653k0;
        int i10 = this.S;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.R);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new m5(this, countDownLatch, o5Var, 1), 2);
    }

    public final void D0(Boolean bool) {
        if (this.f45649g0) {
            return;
        }
        this.f45649g0 = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new o5(this, 1));
        } else if (bool.booleanValue()) {
            C0(null, new o5(this, 2));
        } else {
            B0(null, new o5(this, 3));
        }
    }

    public final void E0(boolean z10) {
        int i10;
        int i11;
        View view;
        float f7;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f45647e0 == null) {
            LimitPreviewView limitPreviewView = new LimitPreviewView(getParentActivity(), R.drawable.filled_limit_boost, 0, this.resourceProvider, 0);
            this.f45647e0 = limitPreviewView;
            limitPreviewView.f26222c0 = true;
            limitPreviewView.setDarkGradientProvider(new y0(this, 5));
        }
        if (this.f45647e0.getParent() != null) {
            ((ViewGroup) this.f45647e0.getParent()).removeView(this.f45647e0);
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T;
        if (tL_premium_boostsStatus != null) {
            this.f45647e0.g(tL_premium_boostsStatus, false);
            if (z10) {
                this.f45647e0.setAlpha(0.0f);
                this.f45647e0.animate().alpha(1.0f).start();
            }
        }
        TLRPC.Chat chat = this.f45651i0;
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.BoostingBoostForChannels;
        } else {
            i10 = R.string.BoostingBoostForGroups;
        }
        String string = LocaleController.getString(i10);
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i11 = R.string.BoostingBoostForChannelsInfo;
        } else {
            i11 = R.string.BoostingBoostForGroupsInfo;
        }
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i11));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        if (this.T != null) {
            view = this.f45647e0;
        } else {
            view = new View(frameLayout.getContext());
        }
        if (this.T != null) {
            f7 = -2.0f;
        } else {
            f7 = 110.0f;
        }
        frameLayout.addView(view, org.telegram.ui.Components.gb1.h(-1, f7, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        f0(string, replaceTags, frameLayout, new v5(this, getParentActivity()));
    }

    public final void F0(boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        ArrayList arrayList = this.f45645c0;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        arrayList.add(new qg.a(14, false));
        if (this.T != null) {
            arrayList.add(new w5(16, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new qg.a(0, false));
            arrayList.add(new qg.a(2, false));
            if (this.T.prepaid_giveaways.size() > 0) {
                arrayList.add(new w5(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                for (int i14 = 0; i14 < this.T.prepaid_giveaways.size(); i14++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.T.prepaid_giveaways.get(i14);
                    if (i14 == this.T.prepaid_giveaways.size() - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    ?? aVar = new qg.a(11, true);
                    aVar.e = prepaidGiveaway;
                    aVar.f44980f = z13;
                    arrayList.add(aVar);
                }
                arrayList.add(new w5(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new w5(13, LocaleController.getString(R.string.Boosters)));
            int i15 = this.f45646d0;
            TLRPC.Chat chat = this.f45651i0;
            if (i15 == 0) {
                ArrayList arrayList3 = this.W;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new qg.a(8, false));
                    arrayList.add(new qg.a(2, false));
                } else {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        TL_stories.Boost boost = (TL_stories.Boost) arrayList3.get(i16);
                        if (i16 == arrayList3.size() - 1 && !this.Y) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        arrayList.add(new w5(boost, z12, this.f45646d0));
                    }
                    if (this.Y) {
                        arrayList.add(new qg.a(9, true));
                    } else {
                        arrayList.add(new qg.a(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i13 = R.string.BoostersInfoDescription;
                    } else {
                        i13 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new w5(6, LocaleController.getString(i13)));
                }
            } else {
                ArrayList arrayList4 = this.X;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new qg.a(8, false));
                    arrayList.add(new qg.a(2, false));
                } else {
                    for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                        TL_stories.Boost boost2 = (TL_stories.Boost) arrayList4.get(i17);
                        if (i17 == arrayList4.size() - 1 && !this.f45643a0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(new w5(boost2, z11, this.f45646d0));
                    }
                    if (this.f45643a0) {
                        arrayList.add(new qg.a(9, true));
                    } else {
                        arrayList.add(new qg.a(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i10 = R.string.BoostersInfoDescription;
                    } else {
                        i10 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new w5(6, LocaleController.getString(i10)));
                }
            }
            arrayList.add(new w5(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new w5(3, this.T.boost_url));
            if (MessagesController.getInstance(this.S).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i11 = R.string.BoostingShareThisLink;
                } else {
                    i11 = R.string.BoostingShareThisLinkGroup;
                }
                arrayList.add(new w5(6, LocaleController.getString(i11)));
                arrayList.add(new qg.a(10, true));
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i12 = R.string.BoostingGetMoreBoosts2;
                } else {
                    i12 = R.string.BoostingGetMoreBoostsGroup;
                }
                arrayList.add(new w5(6, LocaleController.getString(i12)));
            } else {
                arrayList.add(new w5(6, ""));
            }
            arrayList.add(new qg.a(15, false));
        }
        r5 r5Var = this.f45648f0;
        if (z10) {
            r5Var.E(arrayList2, arrayList);
        } else {
            r5Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        E0(false);
        s4.l lVar = new s4.l();
        lVar.f47763m = false;
        lVar.C = false;
        this.f38716c.setItemAnimator(lVar);
        this.f38716c.setOnItemClickListener(new di.x4(3, this, context));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f45650h0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f45650h0.addView(new di.s1(parentActivity), org.telegram.ui.Components.gb1.x(100, 100, 17, 0, 120, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.f45650h0, org.telegram.ui.Components.gb1.i(-1, -2, 17));
        this.f45650h0.setAlpha(0.0f);
        if (this.T == null) {
            this.f45650h0.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().getBoostsController().getBoostsStats(this.R, new p5(this, 1));
        } else {
            this.f45650h0.setVisibility(8);
            D0(null);
        }
        F0(false);
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.r2 r2Var;
        org.telegram.ui.ActionBar.r2 r2Var2;
        if (i10 == NotificationCenter.boostByChannelCreated) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            List fragmentStack = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.r2 r2Var3 = null;
            if (fragmentStack.size() >= 2) {
                r2Var = (org.telegram.ui.ActionBar.r2) org.telegram.ui.Components.b10.h(2, fragmentStack);
            } else {
                r2Var = null;
            }
            if (r2Var instanceof mo) {
                ((ActionBarLayout) getParentLayout()).c0(r2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            if (fragmentStack2.size() >= 2) {
                r2Var2 = (org.telegram.ui.ActionBar.r2) org.telegram.ui.Components.b10.h(2, fragmentStack2);
            } else {
                r2Var2 = null;
            }
            if (booleanValue) {
                if (fragmentStack2.size() >= 3) {
                    r2Var3 = (org.telegram.ui.ActionBar.r2) org.telegram.ui.Components.b10.h(3, fragmentStack2);
                }
                if (r2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) getParentLayout()).c0(r2Var2, false);
                }
                finishFragment();
                if (r2Var3 instanceof un) {
                    vg.j.f(r2Var3, chat, true);
                }
                if (r2Var2 instanceof un) {
                    vg.j.f(r2Var2, chat, true);
                    return;
                }
                return;
            }
            finishFragment();
            if ((r2Var2 instanceof ProfileActivity) || (r2Var2 instanceof un)) {
                vg.j.f(r2Var2, chat, false);
            }
        } else if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (this.R == ((Long) objArr[2]).longValue()) {
                this.T = (TL_stories.TL_premium_boostsStatus) objArr[0];
                this.U = (ChannelBoostsController.CanApplyBoost) objArr[1];
            }
        }
    }

    @Override
    public final s4.h0 g0() {
        return this.f45648f0;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        super.onFragmentDestroy();
    }
}
