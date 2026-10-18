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
public final class z5 extends a20 implements NotificationCenter.NotificationCenterDelegate {
    public final long P;
    public final int Q;
    public TL_stories.TL_premium_boostsStatus R;
    public ChannelBoostsController.CanApplyBoost S;
    public ScrollSlidingTextTabStrip T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public int X;
    public boolean Y;
    public int Z;
    public final ArrayList f43552a0;
    public int f43553b0;
    public LimitPreviewView f43554c0;
    public final t5 f43555d0;
    public boolean f43556e0;
    public LinearLayout f43557f0;
    public final TLRPC.Chat f43558g0;
    public String f43559h0;
    public String f43560i0;
    public int f43561j0;
    public int f43562k0;
    public int f43563l0;
    public int m0;

    public z5(long j10) {
        int i10 = UserConfig.selectedAccount;
        this.Q = i10;
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.f43552a0 = new ArrayList();
        this.f43553b0 = 0;
        this.f43555d0 = new t5(this);
        this.f43559h0 = "";
        this.f43560i0 = "";
        this.f43561j0 = 5;
        this.f43562k0 = 5;
        this.P = j10;
        this.f43558g0 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
    }

    public static void y0(z5 z5Var, Context context, View view, int i10) {
        long j10 = z5Var.P;
        boolean z10 = false;
        if (view instanceof zg.b) {
            zg.b bVar = (zg.b) view;
            TL_stories.Boost boost = bVar.getBoost();
            boolean z11 = boost.giveaway;
            if (z11 && boost.stars > 0) {
                ai.md.f1(context, z5Var.Q, z5Var.P, boost, z5Var.getResourceProvider());
            } else {
                boolean z12 = boost.gift;
                if (((!z12 && !z11) || boost.user_id < 0) && !boost.unclaimed) {
                    if (z11 && boost.user_id == -1) {
                        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(z5Var.getParentActivity(), z5Var.getResourceProvider());
                        ybVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                        ybVar.f32599b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                        ybVar.f32599b.setSingleLine(false);
                        ybVar.f32599b.setMaxLines(2);
                        org.telegram.ui.Components.qc.g(z5Var, ybVar, 2750).j();
                    } else if (!z12 && !z11) {
                        z5Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                    }
                } else {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-z5Var.f43558g0.f20272id);
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
                    new ug.b0(z5Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                }
            }
        }
        if (view instanceof org.telegram.ui.Cells.q8) {
            ug.m.n(z5Var, z5Var.resourceProvider, j10, null);
        }
        if (view instanceof zg.c) {
            ug.m.n(z5Var, z5Var.resourceProvider, j10, ((zg.c) view).getPrepaidGiveaway());
        }
        if (((y5) z5Var.f43552a0.get(i10)).f44291a == 9) {
            if (z5Var.f43553b0 == 1) {
                z10 = true;
            }
            z5Var.F0(Boolean.valueOf(z10));
        }
    }

    public final void D0(CountDownLatch countDownLatch, q5 q5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.f43562k0;
        tL_premium_getBoostsList.offset = this.f43559h0;
        int i10 = this.Q;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.P);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new o5(this, countDownLatch, q5Var, 0), 2);
    }

    public final void E0(CountDownLatch countDownLatch, q5 q5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.f43561j0;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.f43560i0;
        int i10 = this.Q;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.P);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new o5(this, countDownLatch, q5Var, 1), 2);
    }

    public final void F0(Boolean bool) {
        if (this.f43556e0) {
            return;
        }
        this.f43556e0 = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new q5(this, 1));
        } else if (bool.booleanValue()) {
            E0(null, new q5(this, 2));
        } else {
            D0(null, new q5(this, 3));
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
        if (this.f43554c0 == null) {
            LimitPreviewView limitPreviewView = new LimitPreviewView(getParentActivity(), R.drawable.filled_limit_boost, 0, this.resourceProvider, 0);
            this.f43554c0 = limitPreviewView;
            limitPreviewView.f24281c0 = true;
            limitPreviewView.setDarkGradientProvider(new b1(this, 5));
        }
        if (this.f43554c0.getParent() != null) {
            ((ViewGroup) this.f43554c0.getParent()).removeView(this.f43554c0);
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.R;
        if (tL_premium_boostsStatus != null) {
            this.f43554c0.e(tL_premium_boostsStatus, false);
            if (z10) {
                this.f43554c0.setAlpha(0.0f);
                this.f43554c0.animate().alpha(1.0f).start();
            }
        }
        TLRPC.Chat chat = this.f43558g0;
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
        if (this.R != null) {
            view = this.f43554c0;
        } else {
            view = new View(frameLayout.getContext());
        }
        if (this.R != null) {
            f7 = -2.0f;
        } else {
            f7 = 110.0f;
        }
        frameLayout.addView(view, w7.z5.d(-1, f7, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        m0(string, replaceTags, frameLayout, new x5(this, getParentActivity()));
    }

    public final void H0(boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        ArrayList arrayList = this.f43552a0;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        arrayList.add(new pg.a(14, false));
        if (this.R != null) {
            arrayList.add(new y5(16, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new pg.a(0, false));
            arrayList.add(new pg.a(2, false));
            if (this.R.prepaid_giveaways.size() > 0) {
                arrayList.add(new y5(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                for (int i14 = 0; i14 < this.R.prepaid_giveaways.size(); i14++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.R.prepaid_giveaways.get(i14);
                    if (i14 == this.R.prepaid_giveaways.size() - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    ?? aVar = new pg.a(11, true);
                    aVar.e = prepaidGiveaway;
                    aVar.f43312f = z13;
                    arrayList.add(aVar);
                }
                arrayList.add(new y5(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new y5(13, LocaleController.getString(R.string.Boosters)));
            int i15 = this.f43553b0;
            TLRPC.Chat chat = this.f43558g0;
            if (i15 == 0) {
                ArrayList arrayList3 = this.U;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new pg.a(8, false));
                    arrayList.add(new pg.a(2, false));
                } else {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        TL_stories.Boost boost = (TL_stories.Boost) arrayList3.get(i16);
                        if (i16 == arrayList3.size() - 1 && !this.W) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        arrayList.add(new y5(boost, z12, this.f43553b0));
                    }
                    if (this.W) {
                        arrayList.add(new pg.a(9, true));
                    } else {
                        arrayList.add(new pg.a(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i13 = R.string.BoostersInfoDescription;
                    } else {
                        i13 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new y5(6, LocaleController.getString(i13)));
                }
            } else {
                ArrayList arrayList4 = this.V;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new pg.a(8, false));
                    arrayList.add(new pg.a(2, false));
                } else {
                    for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                        TL_stories.Boost boost2 = (TL_stories.Boost) arrayList4.get(i17);
                        if (i17 == arrayList4.size() - 1 && !this.Y) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(new y5(boost2, z11, this.f43553b0));
                    }
                    if (this.Y) {
                        arrayList.add(new pg.a(9, true));
                    } else {
                        arrayList.add(new pg.a(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i10 = R.string.BoostersInfoDescription;
                    } else {
                        i10 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new y5(6, LocaleController.getString(i10)));
                }
            }
            arrayList.add(new y5(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new y5(3, this.R.boost_url));
            if (MessagesController.getInstance(this.Q).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i11 = R.string.BoostingShareThisLink;
                } else {
                    i11 = R.string.BoostingShareThisLinkGroup;
                }
                arrayList.add(new y5(6, LocaleController.getString(i11)));
                arrayList.add(new pg.a(10, true));
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i12 = R.string.BoostingGetMoreBoosts2;
                } else {
                    i12 = R.string.BoostingGetMoreBoostsGroup;
                }
                arrayList.add(new y5(6, LocaleController.getString(i12)));
            } else {
                arrayList.add(new y5(6, ""));
            }
            arrayList.add(new pg.a(15, false));
        }
        t5 t5Var = this.f43555d0;
        if (z10) {
            t5Var.E(arrayList2, arrayList);
        } else {
            t5Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        G0(false);
        s4.k kVar = new s4.k();
        kVar.f45944m = false;
        kVar.C = false;
        this.f35242c.setItemAnimator(kVar);
        this.f35242c.setOnItemClickListener(new ci.x4(3, this, context));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f43557f0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f43557f0.addView(new ci.s1(parentActivity), w7.z5.t(100, 100, 17, 0, 120, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.f43557f0, w7.z5.e(-1, -2, 17));
        this.f43557f0.setAlpha(0.0f);
        if (this.R == null) {
            this.f43557f0.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().getBoostsController().getBoostsStats(this.P, new r5(this, 1));
        } else {
            this.f43557f0.setVisibility(8);
            F0(null);
        }
        H0(false);
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.n2 n2Var;
        org.telegram.ui.ActionBar.n2 n2Var2;
        if (i10 == NotificationCenter.boostByChannelCreated) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            List fragmentStack = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.n2 n2Var3 = null;
            if (fragmentStack.size() >= 2) {
                n2Var = (org.telegram.ui.ActionBar.n2) r4.c.f(2, fragmentStack);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof ko) {
                ((ActionBarLayout) getParentLayout()).a0(n2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            if (fragmentStack2.size() >= 2) {
                n2Var2 = (org.telegram.ui.ActionBar.n2) r4.c.f(2, fragmentStack2);
            } else {
                n2Var2 = null;
            }
            if (booleanValue) {
                if (fragmentStack2.size() >= 3) {
                    n2Var3 = (org.telegram.ui.ActionBar.n2) r4.c.f(3, fragmentStack2);
                }
                if (n2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) getParentLayout()).a0(n2Var2, false);
                }
                finishFragment();
                if (n2Var3 instanceof sn) {
                    ug.i.f(n2Var3, chat, true);
                }
                if (n2Var2 instanceof sn) {
                    ug.i.f(n2Var2, chat, true);
                    return;
                }
                return;
            }
            finishFragment();
            if ((n2Var2 instanceof ProfileActivity) || (n2Var2 instanceof sn)) {
                ug.i.f(n2Var2, chat, false);
            }
        } else if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (this.P == ((Long) objArr[2]).longValue()) {
                this.R = (TL_stories.TL_premium_boostsStatus) objArr[0];
                this.S = (ChannelBoostsController.CanApplyBoost) objArr[1];
            }
        }
    }

    @Override
    public final s4.g0 n0() {
        return this.f43555d0;
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
