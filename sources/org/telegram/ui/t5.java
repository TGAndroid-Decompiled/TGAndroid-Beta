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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class t5 extends o10 implements org.telegram.messenger.vs {
    public final long R;
    public final int S;
    public TL_stories.TL_premium_boostsStatus T;
    public org.telegram.messenger.h3 U;
    public ScrollSlidingTextTabStrip V;
    public final ArrayList W;
    public final ArrayList X;
    public boolean Y;
    public int Z;
    public boolean f41534a0;
    public int f41535b0;
    public final ArrayList f41536c0;
    public int f41537d0;
    public LimitPreviewView f41538e0;
    public final m5 f41539f0;
    public boolean f41540g0;
    public LinearLayout f41541h0;
    public final TLRPC.Chat f41542i0;
    public String f41543j0;
    public String f41544k0;
    public int f41545l0;
    public int m0;
    public int f41546n0;
    public int f41547o0;

    public t5(long j10) {
        int i10 = org.telegram.messenger.e20.f15506s0;
        this.S = i10;
        this.W = new ArrayList();
        this.X = new ArrayList();
        this.f41536c0 = new ArrayList();
        this.f41537d0 = 0;
        this.f41539f0 = new m5(this);
        this.f41543j0 = "";
        this.f41544k0 = "";
        this.f41545l0 = 5;
        this.m0 = 5;
        this.R = j10;
        this.f41542i0 = org.telegram.messenger.wp.r1(i10).L0(Long.valueOf(-j10));
    }

    public static void A0(t5 t5Var, Context context, View view, int i10) {
        long j10 = t5Var.R;
        boolean z10 = false;
        if (view instanceof rg.b) {
            rg.b bVar = (rg.b) view;
            TL_stories.Boost boost = bVar.getBoost();
            boolean z11 = boost.giveaway;
            if (z11 && boost.stars > 0) {
                rh.h8.h1(context, t5Var.S, t5Var.R, boost, t5Var.getResourceProvider());
            } else {
                boolean z12 = boost.gift;
                if (((!z12 && !z11) || boost.user_id < 0) && !boost.unclaimed) {
                    if (z11 && boost.user_id == -1) {
                        org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(t5Var.getParentActivity(), t5Var.getResourceProvider());
                        ebVar.c(2131623981, 36, 36, new String[0]);
                        ebVar.f25779b.setText(org.telegram.messenger.dd.L0(2131753303, null));
                        ebVar.f25779b.setSingleLine(false);
                        ebVar.f25779b.setMaxLines(2);
                        org.telegram.ui.Components.wb.g(t5Var, ebVar, 2750).j();
                    } else if (!z12 && !z11) {
                        t5Var.presentFragment(ProfileActivity.A4(bVar.getDialogId()));
                    }
                } else {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).y1(-t5Var.f41542i0.f19794id);
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
                    new mg.y0(t5Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                }
            }
        }
        if (view instanceof org.telegram.ui.Cells.p8) {
            mg.v.I0(t5Var, t5Var.resourceProvider, j10, null);
        }
        if (view instanceof rg.c) {
            mg.v.I0(t5Var, t5Var.resourceProvider, j10, ((rg.c) view).getPrepaidGiveaway());
        }
        if (((s5) t5Var.f41536c0.get(i10)).f7681a == 9) {
            if (t5Var.f41537d0 == 1) {
                z10 = true;
            }
            t5Var.H0(Boolean.valueOf(z10));
        }
    }

    public final void F0(CountDownLatch countDownLatch, j5 j5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.m0;
        tL_premium_getBoostsList.offset = this.f41543j0;
        int i10 = this.S;
        tL_premium_getBoostsList.peer = org.telegram.messenger.wp.r1(i10).i1(this.R);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new h5(this, countDownLatch, j5Var, 0), 2);
    }

    public final void G0(CountDownLatch countDownLatch, j5 j5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.f41545l0;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.f41544k0;
        int i10 = this.S;
        tL_premium_getBoostsList.peer = org.telegram.messenger.wp.r1(i10).i1(this.R);
        ConnectionsManager.getInstance(i10).sendRequest(tL_premium_getBoostsList, new h5(this, countDownLatch, j5Var, 1), 2);
    }

    public final void H0(Boolean bool) {
        if (this.f41540g0) {
            return;
        }
        this.f41540g0 = true;
        if (bool == null) {
            Utilities.e.c(new j5(this, 1));
        } else if (bool.booleanValue()) {
            G0(null, new j5(this, 2));
        } else {
            F0(null, new j5(this, 3));
        }
    }

    public final void I0(boolean z10) {
        int i10;
        int i11;
        View view;
        float f7;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f41538e0 == null) {
            LimitPreviewView limitPreviewView = new LimitPreviewView(2131231127, 0, 0, getParentActivity(), this.resourceProvider);
            this.f41538e0 = limitPreviewView;
            limitPreviewView.f24103c0 = true;
            limitPreviewView.setDarkGradientProvider(new y0(this, 5));
        }
        if (this.f41538e0.getParent() != null) {
            ((ViewGroup) this.f41538e0.getParent()).removeView(this.f41538e0);
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T;
        if (tL_premium_boostsStatus != null) {
            this.f41538e0.g(tL_premium_boostsStatus, false);
            if (z10) {
                this.f41538e0.setAlpha(0.0f);
                this.f41538e0.animate().alpha(1.0f).start();
            }
        }
        TLRPC.Chat chat = this.f41542i0;
        if (org.telegram.messenger.w3.V(chat)) {
            i10 = 2131753589;
        } else {
            i10 = 2131753587;
        }
        String L0 = org.telegram.messenger.dd.L0(i10, null);
        if (org.telegram.messenger.w3.V(chat)) {
            i11 = 2131753588;
        } else {
            i11 = 2131753586;
        }
        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(i11, null));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        if (this.T != null) {
            view = this.f41538e0;
        } else {
            view = new View(frameLayout.getContext());
        }
        if (this.T != null) {
            f7 = -2.0f;
        } else {
            f7 = 110.0f;
        }
        frameLayout.addView(view, w7.b6.d(-1, f7, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        j0(L0, W2, frameLayout, new r5(this, getParentActivity()));
    }

    public final void J0(boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        ArrayList arrayList = this.f41536c0;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        arrayList.add(new hg.b(14, false));
        if (this.T != null) {
            arrayList.add(new s5(16, org.telegram.messenger.dd.L0(2131744913, null)));
            arrayList.add(new hg.b(0, false));
            arrayList.add(new hg.b(2, false));
            if (this.T.prepaid_giveaways.size() > 0) {
                arrayList.add(new s5(12, org.telegram.messenger.dd.L0(2131753324, null)));
                for (int i14 = 0; i14 < this.T.prepaid_giveaways.size(); i14++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.T.prepaid_giveaways.get(i14);
                    if (i14 == this.T.prepaid_giveaways.size() - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    ?? bVar = new hg.b(11, true);
                    bVar.e = prepaidGiveaway;
                    bVar.f41219f = z13;
                    arrayList.add(bVar);
                }
                arrayList.add(new s5(6, org.telegram.messenger.dd.L0(2131753286, null)));
            }
            arrayList.add(new s5(13, org.telegram.messenger.dd.L0(2131753606, null)));
            int i15 = this.f41537d0;
            TLRPC.Chat chat = this.f41542i0;
            if (i15 == 0) {
                ArrayList arrayList3 = this.W;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new hg.b(8, false));
                    arrayList.add(new hg.b(2, false));
                } else {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        TL_stories.Boost boost = (TL_stories.Boost) arrayList3.get(i16);
                        if (i16 == arrayList3.size() - 1 && !this.Y) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        arrayList.add(new s5(boost, z12, this.f41537d0));
                    }
                    if (this.Y) {
                        arrayList.add(new hg.b(9, true));
                    } else {
                        arrayList.add(new hg.b(7, false));
                    }
                    if (org.telegram.messenger.w3.V(chat)) {
                        i13 = 2131753605;
                    } else {
                        i13 = 2131753604;
                    }
                    arrayList.add(new s5(6, org.telegram.messenger.dd.L0(i13, null)));
                }
            } else {
                ArrayList arrayList4 = this.X;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new hg.b(8, false));
                    arrayList.add(new hg.b(2, false));
                } else {
                    for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                        TL_stories.Boost boost2 = (TL_stories.Boost) arrayList4.get(i17);
                        if (i17 == arrayList4.size() - 1 && !this.f41534a0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(new s5(boost2, z11, this.f41537d0));
                    }
                    if (this.f41534a0) {
                        arrayList.add(new hg.b(9, true));
                    } else {
                        arrayList.add(new hg.b(7, false));
                    }
                    if (org.telegram.messenger.w3.V(chat)) {
                        i10 = 2131753605;
                    } else {
                        i10 = 2131753604;
                    }
                    arrayList.add(new s5(6, org.telegram.messenger.dd.L0(i10, null)));
                }
            }
            arrayList.add(new s5(1, org.telegram.messenger.dd.L0(2131748924, null)));
            arrayList.add(new s5(3, this.T.boost_url));
            if (org.telegram.messenger.wp.r1(this.S).f19222q4 && org.telegram.messenger.w3.N(chat)) {
                if (org.telegram.messenger.w3.V(chat)) {
                    i11 = 2131753269;
                } else {
                    i11 = 2131753268;
                }
                arrayList.add(new s5(6, org.telegram.messenger.dd.L0(i11, null)));
                arrayList.add(new hg.b(10, true));
                if (org.telegram.messenger.w3.V(chat)) {
                    i12 = 2131753503;
                } else {
                    i12 = 2131753502;
                }
                arrayList.add(new s5(6, org.telegram.messenger.dd.L0(i12, null)));
            } else {
                arrayList.add(new s5(6, ""));
            }
            arrayList.add(new hg.b(15, false));
        }
        m5 m5Var = this.f41539f0;
        if (z10) {
            m5Var.E(arrayList2, arrayList);
        } else {
            m5Var.f();
        }
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        I0(false);
        s4.j jVar = new s4.j();
        jVar.f47938m = false;
        jVar.C = false;
        this.f40007c.setItemAnimator(jVar);
        this.f40007c.setOnItemClickListener(new mg.q0(2, this, context));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f41541h0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f41541h0.addView(new n5(parentActivity), w7.b6.t(100, 100, 17, 0, 120, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.f41541h0, w7.b6.e(-1, -2, 17));
        this.f41541h0.setAlpha(0.0f);
        if (this.T == null) {
            this.f41541h0.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().G0().a(this.R, new k5(this, 1));
        } else {
            this.f41541h0.setVisibility(8);
            H0(null);
        }
        J0(false);
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.k2 k2Var;
        org.telegram.ui.ActionBar.k2 k2Var2;
        if (i10 == org.telegram.messenger.at.V2) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            List fragmentStack = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.k2 k2Var3 = null;
            if (fragmentStack.size() >= 2) {
                k2Var = (org.telegram.ui.ActionBar.k2) sc.e.g(2, fragmentStack);
            } else {
                k2Var = null;
            }
            if (k2Var instanceof oo) {
                ((ActionBarLayout) getParentLayout()).c0(k2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            if (fragmentStack2.size() >= 2) {
                k2Var2 = (org.telegram.ui.ActionBar.k2) sc.e.g(2, fragmentStack2);
            } else {
                k2Var2 = null;
            }
            if (booleanValue) {
                if (fragmentStack2.size() >= 3) {
                    k2Var3 = (org.telegram.ui.ActionBar.k2) sc.e.g(3, fragmentStack2);
                }
                if (k2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) getParentLayout()).c0(k2Var2, false);
                }
                finishFragment();
                if (k2Var3 instanceof un) {
                    mg.p.f(k2Var3, chat, true);
                }
                if (k2Var2 instanceof un) {
                    mg.p.f(k2Var2, chat, true);
                    return;
                }
                return;
            }
            finishFragment();
            if ((k2Var2 instanceof ProfileActivity) || (k2Var2 instanceof un)) {
                mg.p.f(k2Var2, chat, false);
            }
        } else if (i10 == org.telegram.messenger.at.f14764p3) {
            if (this.R == ((Long) objArr[2]).longValue()) {
                this.T = (TL_stories.TL_premium_boostsStatus) objArr[0];
                this.U = (org.telegram.messenger.h3) objArr[1];
            }
        }
    }

    @Override
    public final s4.g0 k0() {
        return this.f41539f0;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.at.V2);
        getNotificationCenter().c(this, org.telegram.messenger.at.f14764p3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.at.V2);
        getNotificationCenter().n(this, org.telegram.messenger.at.f14764p3);
        super.onFragmentDestroy();
    }
}
