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
public final class u5 extends x10 implements NotificationCenter.NotificationCenterDelegate {
    public final long L;
    public final int M;
    public TL_stories.TL_premium_boostsStatus N;
    public ChannelBoostsController.CanApplyBoost O;
    public ScrollSlidingTextTabStrip P;
    public final ArrayList Q;
    public final ArrayList R;
    public boolean S;
    public int T;
    public boolean U;
    public int V;
    public final ArrayList W;
    public int X;
    public LimitPreviewView Y;
    public final o5 Z;
    public boolean f43128a0;
    public LinearLayout f43129b0;
    public final TLRPC.Chat f43130c0;
    public String f43131d0;
    public String f43132e0;
    public int f43133f0;
    public int f43134g0;
    public int f43135h0;
    public int f43136i0;

    public u5(long j10) {
        int i9 = UserConfig.selectedAccount;
        this.M = i9;
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.W = new ArrayList();
        this.X = 0;
        this.Z = new o5(this);
        this.f43131d0 = "";
        this.f43132e0 = "";
        this.f43133f0 = 5;
        this.f43134g0 = 5;
        this.L = j10;
        this.f43130c0 = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
    }

    public static void w0(u5 u5Var, Context context, View view, int i9) {
        long j10 = u5Var.L;
        boolean z10 = false;
        if (view instanceof gg.b) {
            gg.b bVar = (gg.b) view;
            TL_stories.Boost boost = bVar.getBoost();
            boolean z11 = boost.giveaway;
            if (z11 && boost.stars > 0) {
                gh.oa.e1(context, u5Var.M, u5Var.L, boost, u5Var.getResourceProvider());
            } else {
                boolean z12 = boost.gift;
                if (((!z12 && !z11) || boost.user_id < 0) && !boost.unclaimed) {
                    if (z11 && boost.user_id == -1) {
                        org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(u5Var.getParentActivity(), u5Var.getResourceProvider());
                        obVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                        obVar.f31343b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                        obVar.f31343b.setSingleLine(false);
                        obVar.f31343b.setMaxLines(2);
                        org.telegram.ui.Components.gc.g(u5Var, obVar, 2750).j();
                    } else if (!z12 && !z11) {
                        u5Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                    }
                } else {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-u5Var.f43130c0.f22380id);
                    int i10 = boost.date;
                    tL_payments_checkedGiftCode.date = i10;
                    tL_payments_checkedGiftCode.via_giveaway = boost.giveaway;
                    int i11 = boost.expires - i10;
                    tL_payments_checkedGiftCode.days = i11 / 86400;
                    tL_payments_checkedGiftCode.months = (i11 / 30) / 86400;
                    if (boost.unclaimed) {
                        tL_payments_checkedGiftCode.to_id = -1L;
                        tL_payments_checkedGiftCode.flags = -1;
                    } else {
                        tL_payments_checkedGiftCode.boost = boost;
                    }
                    new bg.l1(u5Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                }
            }
        }
        if (view instanceof org.telegram.ui.Cells.p8) {
            bg.a0.m(u5Var, u5Var.resourceProvider, j10, null);
        }
        if (view instanceof gg.c) {
            bg.a0.m(u5Var, u5Var.resourceProvider, j10, ((gg.c) view).getPrepaidGiveaway());
        }
        if (((t5) u5Var.W.get(i9)).f48814a == 9) {
            if (u5Var.X == 1) {
                z10 = true;
            }
            u5Var.D0(Boolean.valueOf(z10));
        }
    }

    public final void B0(CountDownLatch countDownLatch, l5 l5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.f43134g0;
        tL_premium_getBoostsList.offset = this.f43131d0;
        int i9 = this.M;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i9).getInputPeer(this.L);
        ConnectionsManager.getInstance(i9).sendRequest(tL_premium_getBoostsList, new j5(this, countDownLatch, l5Var, 0), 2);
    }

    public final void C0(CountDownLatch countDownLatch, l5 l5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.f43133f0;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.f43132e0;
        int i9 = this.M;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i9).getInputPeer(this.L);
        ConnectionsManager.getInstance(i9).sendRequest(tL_premium_getBoostsList, new j5(this, countDownLatch, l5Var, 1), 2);
    }

    public final void D0(Boolean bool) {
        if (this.f43128a0) {
            return;
        }
        this.f43128a0 = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new l5(this, 1));
        } else if (bool.booleanValue()) {
            C0(null, new l5(this, 2));
        } else {
            B0(null, new l5(this, 3));
        }
    }

    public final void E0(boolean z10) {
        int i9;
        int i10;
        View view;
        float f10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.Y == null) {
            LimitPreviewView limitPreviewView = new LimitPreviewView(getParentActivity(), R.drawable.filled_limit_boost, 0, this.resourceProvider, 0);
            this.Y = limitPreviewView;
            limitPreviewView.V = true;
            limitPreviewView.setDarkGradientProvider(new b1(this, 5));
        }
        if (this.Y.getParent() != null) {
            ((ViewGroup) this.Y.getParent()).removeView(this.Y);
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.N;
        if (tL_premium_boostsStatus != null) {
            this.Y.e(tL_premium_boostsStatus, false);
            if (z10) {
                this.Y.setAlpha(0.0f);
                this.Y.animate().alpha(1.0f).start();
            }
        }
        TLRPC.Chat chat = this.f43130c0;
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i9 = R.string.BoostingBoostForChannels;
        } else {
            i9 = R.string.BoostingBoostForGroups;
        }
        String string = LocaleController.getString(i9);
        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.BoostingBoostForChannelsInfo;
        } else {
            i10 = R.string.BoostingBoostForGroupsInfo;
        }
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i10));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        if (this.N != null) {
            view = this.Y;
        } else {
            view = new View(frameLayout.getContext());
        }
        if (this.N != null) {
            f10 = -2.0f;
        } else {
            f10 = 110.0f;
        }
        frameLayout.addView(view, g7.e6.d(-1, f10, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        l0(string, replaceTags, frameLayout, new s5(this, getParentActivity()));
    }

    public final void F0(boolean z10) {
        int i9;
        boolean z11;
        int i10;
        int i11;
        int i12;
        boolean z12;
        boolean z13;
        ArrayList arrayList = this.W;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        arrayList.add(new wf.a(14, false));
        if (this.N != null) {
            arrayList.add(new t5(16, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new wf.a(0, false));
            arrayList.add(new wf.a(2, false));
            if (this.N.prepaid_giveaways.size() > 0) {
                arrayList.add(new t5(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                for (int i13 = 0; i13 < this.N.prepaid_giveaways.size(); i13++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.N.prepaid_giveaways.get(i13);
                    if (i13 == this.N.prepaid_giveaways.size() - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    ?? aVar = new wf.a(11, true);
                    aVar.f42855e = prepaidGiveaway;
                    aVar.f42856f = z13;
                    arrayList.add(aVar);
                }
                arrayList.add(new t5(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new t5(13, LocaleController.getString(R.string.Boosters)));
            int i14 = this.X;
            TLRPC.Chat chat = this.f43130c0;
            if (i14 == 0) {
                ArrayList arrayList3 = this.Q;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new wf.a(8, false));
                    arrayList.add(new wf.a(2, false));
                } else {
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        TL_stories.Boost boost = (TL_stories.Boost) arrayList3.get(i15);
                        if (i15 == arrayList3.size() - 1 && !this.S) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        arrayList.add(new t5(boost, z12, this.X));
                    }
                    if (this.S) {
                        arrayList.add(new wf.a(9, true));
                    } else {
                        arrayList.add(new wf.a(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.BoostersInfoDescription;
                    } else {
                        i12 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new t5(6, LocaleController.getString(i12)));
                }
            } else {
                ArrayList arrayList4 = this.R;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new wf.a(8, false));
                    arrayList.add(new wf.a(2, false));
                } else {
                    for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                        TL_stories.Boost boost2 = (TL_stories.Boost) arrayList4.get(i16);
                        if (i16 == arrayList4.size() - 1 && !this.U) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(new t5(boost2, z11, this.X));
                    }
                    if (this.U) {
                        arrayList.add(new wf.a(9, true));
                    } else {
                        arrayList.add(new wf.a(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i9 = R.string.BoostersInfoDescription;
                    } else {
                        i9 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new t5(6, LocaleController.getString(i9)));
                }
            }
            arrayList.add(new t5(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new t5(3, this.N.boost_url));
            if (MessagesController.getInstance(this.M).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i10 = R.string.BoostingShareThisLink;
                } else {
                    i10 = R.string.BoostingShareThisLinkGroup;
                }
                arrayList.add(new t5(6, LocaleController.getString(i10)));
                arrayList.add(new wf.a(10, true));
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i11 = R.string.BoostingGetMoreBoosts2;
                } else {
                    i11 = R.string.BoostingGetMoreBoostsGroup;
                }
                arrayList.add(new t5(6, LocaleController.getString(i11)));
            } else {
                arrayList.add(new t5(6, ""));
            }
            arrayList.add(new wf.a(15, false));
        }
        o5 o5Var = this.Z;
        if (z10) {
            o5Var.E(arrayList2, arrayList);
        } else {
            o5Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        E0(false);
        f2.n nVar = new f2.n();
        nVar.f5532m = false;
        nVar.C = false;
        this.f44314c.setItemAnimator(nVar);
        this.f44314c.setOnItemClickListener(new bg.b1(5, this, context));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f43129b0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f43129b0.addView(new ih.o1(parentActivity), g7.e6.t(100, 100, 17, 0, 120, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.f43129b0, g7.e6.e(-1, -2, 17));
        this.f43129b0.setAlpha(0.0f);
        if (this.N == null) {
            this.f43129b0.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().getBoostsController().getBoostsStats(this.L, new m5(this, 1));
        } else {
            this.f43129b0.setVisibility(8);
            D0(null);
        }
        F0(false);
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.o2 o2Var;
        org.telegram.ui.ActionBar.o2 o2Var2;
        if (i9 == NotificationCenter.boostByChannelCreated) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            List fragmentStack = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.o2 o2Var3 = null;
            if (fragmentStack.size() >= 2) {
                o2Var = (org.telegram.ui.ActionBar.o2) j3.r0.k(2, fragmentStack);
            } else {
                o2Var = null;
            }
            if (o2Var instanceof ho) {
                ((ActionBarLayout) getParentLayout()).a0(o2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            if (fragmentStack2.size() >= 2) {
                o2Var2 = (org.telegram.ui.ActionBar.o2) j3.r0.k(2, fragmentStack2);
            } else {
                o2Var2 = null;
            }
            if (booleanValue) {
                if (fragmentStack2.size() >= 3) {
                    o2Var3 = (org.telegram.ui.ActionBar.o2) j3.r0.k(3, fragmentStack2);
                }
                if (o2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) getParentLayout()).a0(o2Var2, false);
                }
                finishFragment();
                if (o2Var3 instanceof qn) {
                    bg.u.f(o2Var3, chat, true);
                }
                if (o2Var2 instanceof qn) {
                    bg.u.f(o2Var2, chat, true);
                    return;
                }
                return;
            }
            finishFragment();
            if ((o2Var2 instanceof ProfileActivity) || (o2Var2 instanceof qn)) {
                bg.u.f(o2Var2, chat, false);
            }
        } else if (i9 == NotificationCenter.chatWasBoostedByUser) {
            if (this.L == ((Long) objArr[2]).longValue()) {
                this.N = (TL_stories.TL_premium_boostsStatus) objArr[0];
                this.O = (ChannelBoostsController.CanApplyBoost) objArr[1];
            }
        }
    }

    @Override
    public final f2.r0 m0() {
        return this.Z;
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
