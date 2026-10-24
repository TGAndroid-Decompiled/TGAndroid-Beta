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
public final class y5 extends b20 implements NotificationCenter.NotificationCenterDelegate {
    public final long R;
    public final int S;
    public TL_stories.TL_premium_boostsStatus T;
    public ChannelBoostsController.CanApplyBoost U;
    public ScrollSlidingTextTabStrip V;
    public final ArrayList W;
    public final ArrayList X;
    public boolean Y;
    public int Z;
    public boolean f43748a0;
    public int f43749b0;
    public final ArrayList f43750c0;
    public int f43751d0;
    public LimitPreviewView f43752e0;
    public final s5 f43753f0;
    public boolean f43754g0;
    public LinearLayout f43755h0;
    public final TLRPC.Chat f43756i0;
    public String f43757j0;
    public String f43758k0;
    public int f43759l0;
    public int m0;
    public int f43760n0;
    public int f43761o0;

    public y5(long j10) {
        int i10 = UserConfig.selectedAccount;
        this.S = i10;
        this.W = new ArrayList();
        this.X = new ArrayList();
        this.f43750c0 = new ArrayList();
        this.f43751d0 = 0;
        this.f43753f0 = new s5(this);
        this.f43757j0 = "";
        this.f43758k0 = "";
        this.f43759l0 = 5;
        this.m0 = 5;
        this.R = j10;
        this.f43756i0 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
    }

    public static void y0(y5 y5Var, Context context, View view, int i10) {
        long j10 = y5Var.R;
        boolean z10 = false;
        if (view instanceof zg.b) {
            zg.b bVar = (zg.b) view;
            TL_stories.Boost boost = bVar.getBoost();
            boolean z11 = boost.giveaway;
            if (z11 && boost.stars > 0) {
                ai.nd.f1(context, y5Var.S, y5Var.R, boost, y5Var.getResourceProvider());
            } else {
                boolean z12 = boost.gift;
                if (((!z12 && !z11) || boost.user_id < 0) && !boost.unclaimed) {
                    if (z11 && boost.user_id == -1) {
                        org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(y5Var.getParentActivity(), y5Var.getResourceProvider());
                        wbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                        wbVar.f32176b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                        wbVar.f32176b.setSingleLine(false);
                        wbVar.f32176b.setMaxLines(2);
                        org.telegram.ui.Components.oc.g(y5Var, wbVar, 2750).j();
                    } else if (!z12 && !z11) {
                        y5Var.presentFragment(ProfileActivity.o4(bVar.getDialogId()));
                    }
                } else {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-y5Var.f43756i0.f20344id);
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
                    new ug.a0(y5Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                }
            }
        }
        if (view instanceof org.telegram.ui.Cells.r8) {
            ug.l.m(y5Var, y5Var.resourceProvider, j10, null);
        }
        if (view instanceof zg.c) {
            ug.l.m(y5Var, y5Var.resourceProvider, j10, ((zg.c) view).getPrepaidGiveaway());
        }
        if (((x5) y5Var.f43750c0.get(i10)).f44712a == 9) {
            if (y5Var.f43751d0 == 1) {
                z10 = true;
            }
            y5Var.F0(Boolean.valueOf(z10));
        }
    }

    public final void D0(CountDownLatch countDownLatch, p5 p5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.m0;
        tL_premium_getBoostsList.offset = this.f43757j0;
        int i10 = this.S;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.R);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new n5(this, countDownLatch, p5Var, 0), 2);
    }

    public final void E0(CountDownLatch countDownLatch, p5 p5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.f43759l0;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.f43758k0;
        int i10 = this.S;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.R);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new n5(this, countDownLatch, p5Var, 1), 2);
    }

    public final void F0(Boolean bool) {
        if (this.f43754g0) {
            return;
        }
        this.f43754g0 = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new p5(this, 1));
        } else if (bool.booleanValue()) {
            E0(null, new p5(this, 2));
        } else {
            D0(null, new p5(this, 3));
        }
    }

    public final void G0(boolean z10) {
        int i10;
        int i11;
        View view;
        float f7;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f43752e0 == null) {
            LimitPreviewView limitPreviewView = new LimitPreviewView(getParentActivity(), R.drawable.filled_limit_boost, 0, this.resourceProvider, 0);
            this.f43752e0 = limitPreviewView;
            limitPreviewView.f24430c0 = true;
            limitPreviewView.setDarkGradientProvider(new a1(this, 5));
        }
        if (this.f43752e0.getParent() != null) {
            ((ViewGroup) this.f43752e0.getParent()).removeView(this.f43752e0);
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T;
        if (tL_premium_boostsStatus != null) {
            this.f43752e0.g(tL_premium_boostsStatus, false);
            if (z10) {
                this.f43752e0.setAlpha(0.0f);
                this.f43752e0.animate().alpha(1.0f).start();
            }
        }
        TLRPC.Chat chat = this.f43756i0;
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
            view = this.f43752e0;
        } else {
            view = new View(frameLayout.getContext());
        }
        if (this.T != null) {
            f7 = -2.0f;
        } else {
            f7 = 110.0f;
        }
        frameLayout.addView(view, w7.z5.d(-1, f7, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        m0(string, replaceTags, frameLayout, new w5(this, getParentActivity()));
    }

    public final void H0(boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        ArrayList arrayList = this.f43750c0;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        arrayList.add(new pg.a(14, false));
        if (this.T != null) {
            arrayList.add(new x5(16, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new pg.a(0, false));
            arrayList.add(new pg.a(2, false));
            if (this.T.prepaid_giveaways.size() > 0) {
                arrayList.add(new x5(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                for (int i14 = 0; i14 < this.T.prepaid_giveaways.size(); i14++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.T.prepaid_giveaways.get(i14);
                    if (i14 == this.T.prepaid_giveaways.size() - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    ?? aVar = new pg.a(11, true);
                    aVar.e = prepaidGiveaway;
                    aVar.f43473f = z13;
                    arrayList.add(aVar);
                }
                arrayList.add(new x5(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new x5(13, LocaleController.getString(R.string.Boosters)));
            int i15 = this.f43751d0;
            TLRPC.Chat chat = this.f43756i0;
            if (i15 == 0) {
                ArrayList arrayList3 = this.W;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new pg.a(8, false));
                    arrayList.add(new pg.a(2, false));
                } else {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        TL_stories.Boost boost = (TL_stories.Boost) arrayList3.get(i16);
                        if (i16 == arrayList3.size() - 1 && !this.Y) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        arrayList.add(new x5(boost, z12, this.f43751d0));
                    }
                    if (this.Y) {
                        arrayList.add(new pg.a(9, true));
                    } else {
                        arrayList.add(new pg.a(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i13 = R.string.BoostersInfoDescription;
                    } else {
                        i13 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new x5(6, LocaleController.getString(i13)));
                }
            } else {
                ArrayList arrayList4 = this.X;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new pg.a(8, false));
                    arrayList.add(new pg.a(2, false));
                } else {
                    for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                        TL_stories.Boost boost2 = (TL_stories.Boost) arrayList4.get(i17);
                        if (i17 == arrayList4.size() - 1 && !this.f43748a0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(new x5(boost2, z11, this.f43751d0));
                    }
                    if (this.f43748a0) {
                        arrayList.add(new pg.a(9, true));
                    } else {
                        arrayList.add(new pg.a(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i10 = R.string.BoostersInfoDescription;
                    } else {
                        i10 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new x5(6, LocaleController.getString(i10)));
                }
            }
            arrayList.add(new x5(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new x5(3, this.T.boost_url));
            if (MessagesController.getInstance(this.S).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i11 = R.string.BoostingShareThisLink;
                } else {
                    i11 = R.string.BoostingShareThisLinkGroup;
                }
                arrayList.add(new x5(6, LocaleController.getString(i11)));
                arrayList.add(new pg.a(10, true));
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i12 = R.string.BoostingGetMoreBoosts2;
                } else {
                    i12 = R.string.BoostingGetMoreBoostsGroup;
                }
                arrayList.add(new x5(6, LocaleController.getString(i12)));
            } else {
                arrayList.add(new x5(6, ""));
            }
            arrayList.add(new pg.a(15, false));
        }
        s5 s5Var = this.f43753f0;
        if (z10) {
            s5Var.E(arrayList2, arrayList);
        } else {
            s5Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        G0(false);
        s4.k kVar = new s4.k();
        kVar.f46376m = false;
        kVar.C = false;
        this.f35894c.setItemAnimator(kVar);
        this.f35894c.setOnItemClickListener(new ci.x4(3, this, context));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f43755h0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f43755h0.addView(new ci.s1(parentActivity), w7.z5.t(100, 100, 17, 0, 120, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.f43755h0, w7.z5.e(-1, -2, 17));
        this.f43755h0.setAlpha(0.0f);
        if (this.T == null) {
            this.f43755h0.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().getBoostsController().getBoostsStats(this.R, new q5(this, 1));
        } else {
            this.f43755h0.setVisibility(8);
            F0(null);
        }
        H0(false);
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.o2 o2Var;
        org.telegram.ui.ActionBar.o2 o2Var2;
        if (i10 == NotificationCenter.boostByChannelCreated) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            List fragmentStack = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.o2 o2Var3 = null;
            if (fragmentStack.size() >= 2) {
                o2Var = (org.telegram.ui.ActionBar.o2) si.o0.g(2, fragmentStack);
            } else {
                o2Var = null;
            }
            if (o2Var instanceof ko) {
                ((ActionBarLayout) getParentLayout()).b0(o2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            if (fragmentStack2.size() >= 2) {
                o2Var2 = (org.telegram.ui.ActionBar.o2) si.o0.g(2, fragmentStack2);
            } else {
                o2Var2 = null;
            }
            if (booleanValue) {
                if (fragmentStack2.size() >= 3) {
                    o2Var3 = (org.telegram.ui.ActionBar.o2) si.o0.g(3, fragmentStack2);
                }
                if (o2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) getParentLayout()).b0(o2Var2, false);
                }
                finishFragment();
                if (o2Var3 instanceof sn) {
                    ug.h.f(o2Var3, chat, true);
                }
                if (o2Var2 instanceof sn) {
                    ug.h.f(o2Var2, chat, true);
                    return;
                }
                return;
            }
            finishFragment();
            if ((o2Var2 instanceof ProfileActivity) || (o2Var2 instanceof sn)) {
                ug.h.f(o2Var2, chat, false);
            }
        } else if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (this.R == ((Long) objArr[2]).longValue()) {
                this.T = (TL_stories.TL_premium_boostsStatus) objArr[0];
                this.U = (ChannelBoostsController.CanApplyBoost) objArr[1];
            }
        }
    }

    @Override
    public final s4.g0 n0() {
        return this.f43753f0;
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
