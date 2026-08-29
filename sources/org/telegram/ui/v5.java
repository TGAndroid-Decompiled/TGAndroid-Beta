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
public final class v5 extends z10 implements NotificationCenter.NotificationCenterDelegate {
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
    public final p5 Z;
    public boolean f43426a0;
    public LinearLayout f43427b0;
    public final TLRPC.Chat f43428c0;
    public String f43429d0;
    public String f43430e0;
    public int f43431f0;
    public int f43432g0;
    public int f43433h0;
    public int f43434i0;

    public v5(long j10) {
        int i10 = UserConfig.selectedAccount;
        this.M = i10;
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.W = new ArrayList();
        this.X = 0;
        this.Z = new p5(this);
        this.f43429d0 = "";
        this.f43430e0 = "";
        this.f43431f0 = 5;
        this.f43432g0 = 5;
        this.L = j10;
        this.f43428c0 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
    }

    public static void x0(v5 v5Var, Context context, View view, int i10) {
        long j10 = v5Var.L;
        boolean z10 = false;
        if (view instanceof jg.b) {
            jg.b bVar = (jg.b) view;
            TL_stories.Boost boost = bVar.getBoost();
            boolean z11 = boost.giveaway;
            if (z11 && boost.stars > 0) {
                jh.ia.e1(context, v5Var.M, v5Var.L, boost, v5Var.getResourceProvider());
            } else {
                boolean z12 = boost.gift;
                if (((!z12 && !z11) || boost.user_id < 0) && !boost.unclaimed) {
                    if (z11 && boost.user_id == -1) {
                        org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(v5Var.getParentActivity(), v5Var.getResourceProvider());
                        ubVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                        ubVar.f33185b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                        ubVar.f33185b.setSingleLine(false);
                        ubVar.f33185b.setMaxLines(2);
                        org.telegram.ui.Components.mc.g(v5Var, ubVar, 2750).j();
                    } else if (!z12 && !z11) {
                        v5Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                    }
                } else {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-v5Var.f43428c0.f22392id);
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
                    new eg.f1(v5Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                }
            }
        }
        if (view instanceof org.telegram.ui.Cells.m8) {
            eg.y.m(v5Var, v5Var.resourceProvider, j10, null);
        }
        if (view instanceof jg.c) {
            eg.y.m(v5Var, v5Var.resourceProvider, j10, ((jg.c) view).getPrepaidGiveaway());
        }
        if (((u5) v5Var.W.get(i10)).f50845a == 9) {
            if (v5Var.X == 1) {
                z10 = true;
            }
            v5Var.E0(Boolean.valueOf(z10));
        }
    }

    public final void C0(CountDownLatch countDownLatch, m5 m5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.f43432g0;
        tL_premium_getBoostsList.offset = this.f43429d0;
        int i10 = this.M;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.L);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new k5(this, countDownLatch, m5Var, 0), 2);
    }

    public final void D0(CountDownLatch countDownLatch, m5 m5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.f43431f0;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.f43430e0;
        int i10 = this.M;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i10).getInputPeer(this.L);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new k5(this, countDownLatch, m5Var, 1), 2);
    }

    public final void E0(Boolean bool) {
        if (this.f43426a0) {
            return;
        }
        this.f43426a0 = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new m5(this, 1));
        } else if (bool.booleanValue()) {
            D0(null, new m5(this, 2));
        } else {
            C0(null, new m5(this, 3));
        }
    }

    public final void F0(boolean z10) {
        int i10;
        int i11;
        View view;
        float f9;
        if (getParentActivity() == null) {
            return;
        }
        if (this.Y == null) {
            LimitPreviewView limitPreviewView = new LimitPreviewView(getParentActivity(), R.drawable.filled_limit_boost, 0, this.resourceProvider, 0);
            this.Y = limitPreviewView;
            limitPreviewView.V = true;
            limitPreviewView.setDarkGradientProvider(new c1(this, 5));
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
        TLRPC.Chat chat = this.f43428c0;
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
        if (this.N != null) {
            view = this.Y;
        } else {
            view = new View(frameLayout.getContext());
        }
        if (this.N != null) {
            f9 = -2.0f;
        } else {
            f9 = 110.0f;
        }
        frameLayout.addView(view, i7.f6.d(-1, f9, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        m0(string, replaceTags, frameLayout, new t5(this, getParentActivity()));
    }

    public final void G0(boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        ArrayList arrayList = this.W;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        arrayList.add(new zf.a(14, false));
        if (this.N != null) {
            arrayList.add(new u5(16, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new zf.a(0, false));
            arrayList.add(new zf.a(2, false));
            if (this.N.prepaid_giveaways.size() > 0) {
                arrayList.add(new u5(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                for (int i14 = 0; i14 < this.N.prepaid_giveaways.size(); i14++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.N.prepaid_giveaways.get(i14);
                    if (i14 == this.N.prepaid_giveaways.size() - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    ?? aVar = new zf.a(11, true);
                    aVar.f43181e = prepaidGiveaway;
                    aVar.f43182f = z13;
                    arrayList.add(aVar);
                }
                arrayList.add(new u5(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new u5(13, LocaleController.getString(R.string.Boosters)));
            int i15 = this.X;
            TLRPC.Chat chat = this.f43428c0;
            if (i15 == 0) {
                ArrayList arrayList3 = this.Q;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new zf.a(8, false));
                    arrayList.add(new zf.a(2, false));
                } else {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        TL_stories.Boost boost = (TL_stories.Boost) arrayList3.get(i16);
                        if (i16 == arrayList3.size() - 1 && !this.S) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        arrayList.add(new u5(boost, z12, this.X));
                    }
                    if (this.S) {
                        arrayList.add(new zf.a(9, true));
                    } else {
                        arrayList.add(new zf.a(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i13 = R.string.BoostersInfoDescription;
                    } else {
                        i13 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new u5(6, LocaleController.getString(i13)));
                }
            } else {
                ArrayList arrayList4 = this.R;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new zf.a(8, false));
                    arrayList.add(new zf.a(2, false));
                } else {
                    for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                        TL_stories.Boost boost2 = (TL_stories.Boost) arrayList4.get(i17);
                        if (i17 == arrayList4.size() - 1 && !this.U) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(new u5(boost2, z11, this.X));
                    }
                    if (this.U) {
                        arrayList.add(new zf.a(9, true));
                    } else {
                        arrayList.add(new zf.a(7, false));
                    }
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i10 = R.string.BoostersInfoDescription;
                    } else {
                        i10 = R.string.BoostersInfoGroupDescription;
                    }
                    arrayList.add(new u5(6, LocaleController.getString(i10)));
                }
            }
            arrayList.add(new u5(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new u5(3, this.N.boost_url));
            if (MessagesController.getInstance(this.M).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i11 = R.string.BoostingShareThisLink;
                } else {
                    i11 = R.string.BoostingShareThisLinkGroup;
                }
                arrayList.add(new u5(6, LocaleController.getString(i11)));
                arrayList.add(new zf.a(10, true));
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    i12 = R.string.BoostingGetMoreBoosts2;
                } else {
                    i12 = R.string.BoostingGetMoreBoostsGroup;
                }
                arrayList.add(new u5(6, LocaleController.getString(i12)));
            } else {
                arrayList.add(new u5(6, ""));
            }
            arrayList.add(new zf.a(15, false));
        }
        p5 p5Var = this.Z;
        if (z10) {
            p5Var.E(arrayList2, arrayList);
        } else {
            p5Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        F0(false);
        f2.l lVar = new f2.l();
        lVar.f6463m = false;
        lVar.C = false;
        this.f45015c.setItemAnimator(lVar);
        this.f45015c.setOnItemClickListener(new eg.w0(4, this, context));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f43427b0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f43427b0.addView(new lh.m1(parentActivity), i7.f6.t(100, 100, 17, 0, 120, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.f43427b0, i7.f6.e(-1, -2, 17));
        this.f43427b0.setAlpha(0.0f);
        if (this.N == null) {
            this.f43427b0.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().getBoostsController().getBoostsStats(this.L, new n5(this, 1));
        } else {
            this.f43427b0.setVisibility(8);
            E0(null);
        }
        G0(false);
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
                o2Var = (org.telegram.ui.ActionBar.o2) j7.l1.j(2, fragmentStack);
            } else {
                o2Var = null;
            }
            if (o2Var instanceof ko) {
                ((ActionBarLayout) getParentLayout()).a0(o2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            if (fragmentStack2.size() >= 2) {
                o2Var2 = (org.telegram.ui.ActionBar.o2) j7.l1.j(2, fragmentStack2);
            } else {
                o2Var2 = null;
            }
            if (booleanValue) {
                if (fragmentStack2.size() >= 3) {
                    o2Var3 = (org.telegram.ui.ActionBar.o2) j7.l1.j(3, fragmentStack2);
                }
                if (o2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) getParentLayout()).a0(o2Var2, false);
                }
                finishFragment();
                if (o2Var3 instanceof tn) {
                    eg.s.f(o2Var3, chat, true);
                }
                if (o2Var2 instanceof tn) {
                    eg.s.f(o2Var2, chat, true);
                    return;
                }
                return;
            }
            finishFragment();
            if ((o2Var2 instanceof ProfileActivity) || (o2Var2 instanceof tn)) {
                eg.s.f(o2Var2, chat, false);
            }
        } else if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (this.L == ((Long) objArr[2]).longValue()) {
                this.N = (TL_stories.TL_premium_boostsStatus) objArr[0];
                this.O = (ChannelBoostsController.CanApplyBoost) objArr[1];
            }
        }
    }

    @Override
    public final f2.p0 n0() {
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
