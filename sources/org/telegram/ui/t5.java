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
public final class t5 extends q00 implements org.telegram.messenger.ls {
    public final long R;
    public final int S;
    public TL_stories.TL_premium_boostsStatus T;
    public org.telegram.messenger.e3 U;
    public ScrollSlidingTextTabStrip V;
    public final ArrayList W;
    public final ArrayList X;
    public boolean Y;
    public int Z;
    public boolean f50075a0;
    public int f50076b0;
    public final ArrayList f50077c0;
    public int f50078d0;
    public LimitPreviewView f50079e0;
    public final n5 f50080f0;
    public boolean f50081g0;
    public LinearLayout f50082h0;
    public final TLRPC.Chat f50083i0;
    public String f50084j0;
    public String f50085k0;
    public int f50086l0;
    public int m0;
    public int f50087n0;
    public int f50088o0;

    public t5(long j3) {
        int i7 = org.telegram.messenger.p10.f24470s0;
        this.S = i7;
        this.W = new ArrayList();
        this.X = new ArrayList();
        this.f50077c0 = new ArrayList();
        this.f50078d0 = 0;
        this.f50080f0 = new n5(this);
        this.f50084j0 = "";
        this.f50085k0 = "";
        this.f50086l0 = 5;
        this.m0 = 5;
        this.R = j3;
        this.f50083i0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
    }

    public static void A0(t5 t5Var, Context context, View view, int i7) {
        long j3 = t5Var.R;
        boolean z9 = false;
        if (view instanceof bh.b) {
            bh.b bVar = (bh.b) view;
            TL_stories.Boost boost = bVar.getBoost();
            boolean z10 = boost.giveaway;
            if (z10 && boost.stars > 0) {
                bi.dd.h1(context, t5Var.S, t5Var.R, boost, t5Var.getResourceProvider());
            } else {
                boolean z11 = boost.gift;
                if (((!z11 && !z10) || boost.user_id < 0) && !boost.unclaimed) {
                    if (z10 && boost.user_id == -1) {
                        org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(t5Var.getParentActivity(), t5Var.getResourceProvider());
                        kbVar.c(2131623981, 36, 36, new String[0]);
                        kbVar.f35292b.setText(org.telegram.messenger.id.M0(2131753303, null));
                        kbVar.f35292b.setSingleLine(false);
                        kbVar.f35292b.setMaxLines(2);
                        org.telegram.ui.Components.cc.g(t5Var, kbVar, 2750).j();
                    } else if (!z11 && !z10) {
                        t5Var.presentFragment(ProfileActivity.D4(bVar.getDialogId()));
                    }
                } else {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).z1(-t5Var.f50083i0.f26956id);
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
                    new wg.c0(t5Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                }
            }
        }
        if (view instanceof org.telegram.ui.Cells.m8) {
            wg.l.I0(t5Var, t5Var.resourceProvider, j3, null);
        }
        if (view instanceof bh.c) {
            wg.l.I0(t5Var, t5Var.resourceProvider, j3, ((bh.c) view).getPrepaidGiveaway());
        }
        if (((s5) t5Var.f50077c0.get(i7)).f54544a == 9) {
            if (t5Var.f50078d0 == 1) {
                z9 = true;
            }
            t5Var.H0(Boolean.valueOf(z9));
        }
    }

    public final void F0(CountDownLatch countDownLatch, k5 k5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.m0;
        tL_premium_getBoostsList.offset = this.f50084j0;
        int i7 = this.S;
        tL_premium_getBoostsList.peer = org.telegram.messenger.qp.s1(i7).j1(this.R);
        ConnectionsManager.getInstance(i7).sendRequest(tL_premium_getBoostsList, new i5(this, countDownLatch, k5Var, 0), 2);
    }

    public final void G0(CountDownLatch countDownLatch, k5 k5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.f50086l0;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.f50085k0;
        int i7 = this.S;
        tL_premium_getBoostsList.peer = org.telegram.messenger.qp.s1(i7).j1(this.R);
        ConnectionsManager.getInstance(i7).sendRequest(tL_premium_getBoostsList, new i5(this, countDownLatch, k5Var, 1), 2);
    }

    public final void H0(Boolean bool) {
        if (this.f50081g0) {
            return;
        }
        this.f50081g0 = true;
        if (bool == null) {
            Utilities.f21336e.c(new k5(this, 1));
        } else if (bool.booleanValue()) {
            G0(null, new k5(this, 2));
        } else {
            F0(null, new k5(this, 3));
        }
    }

    public final void I0(boolean z9) {
        int i7;
        int i10;
        View view;
        float f10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f50079e0 == null) {
            LimitPreviewView limitPreviewView = new LimitPreviewView(2131231127, 0, 0, getParentActivity(), this.resourceProvider);
            this.f50079e0 = limitPreviewView;
            limitPreviewView.f31459c0 = true;
            limitPreviewView.setDarkGradientProvider(new w0(this, 5));
        }
        if (this.f50079e0.getParent() != null) {
            ((ViewGroup) this.f50079e0.getParent()).removeView(this.f50079e0);
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T;
        if (tL_premium_boostsStatus != null) {
            this.f50079e0.g(tL_premium_boostsStatus, false);
            if (z9) {
                this.f50079e0.setAlpha(0.0f);
                this.f50079e0.animate().alpha(1.0f).start();
            }
        }
        TLRPC.Chat chat = this.f50083i0;
        if (org.telegram.messenger.t3.V(chat)) {
            i7 = 2131753589;
        } else {
            i7 = 2131753587;
        }
        String M0 = org.telegram.messenger.id.M0(i7, null);
        if (org.telegram.messenger.t3.V(chat)) {
            i10 = 2131753588;
        } else {
            i10 = 2131753586;
        }
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(i10, null));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        if (this.T != null) {
            view = this.f50079e0;
        } else {
            view = new View(frameLayout.getContext());
        }
        if (this.T != null) {
            f10 = -2.0f;
        } else {
            f10 = 110.0f;
        }
        frameLayout.addView(view, c8.ha.d(-1, f10, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        j0(M0, X2, frameLayout, new r5(this, getParentActivity()));
    }

    public final void J0(boolean z9) {
        int i7;
        boolean z10;
        int i10;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        ArrayList arrayList = this.f50077c0;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        arrayList.add(new rg.a(14, false));
        if (this.T != null) {
            arrayList.add(new s5(16, org.telegram.messenger.id.M0(2131744895, null)));
            arrayList.add(new rg.a(0, false));
            arrayList.add(new rg.a(2, false));
            if (this.T.prepaid_giveaways.size() > 0) {
                arrayList.add(new s5(12, org.telegram.messenger.id.M0(2131753324, null)));
                for (int i13 = 0; i13 < this.T.prepaid_giveaways.size(); i13++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.T.prepaid_giveaways.get(i13);
                    if (i13 == this.T.prepaid_giveaways.size() - 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    ?? aVar = new rg.a(11, true);
                    aVar.f49761e = prepaidGiveaway;
                    aVar.f49762f = z12;
                    arrayList.add(aVar);
                }
                arrayList.add(new s5(6, org.telegram.messenger.id.M0(2131753286, null)));
            }
            arrayList.add(new s5(13, org.telegram.messenger.id.M0(2131753606, null)));
            int i14 = this.f50078d0;
            TLRPC.Chat chat = this.f50083i0;
            if (i14 == 0) {
                ArrayList arrayList3 = this.W;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new rg.a(8, false));
                    arrayList.add(new rg.a(2, false));
                } else {
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        TL_stories.Boost boost = (TL_stories.Boost) arrayList3.get(i15);
                        if (i15 == arrayList3.size() - 1 && !this.Y) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(new s5(boost, z11, this.f50078d0));
                    }
                    if (this.Y) {
                        arrayList.add(new rg.a(9, true));
                    } else {
                        arrayList.add(new rg.a(7, false));
                    }
                    if (org.telegram.messenger.t3.V(chat)) {
                        i12 = 2131753605;
                    } else {
                        i12 = 2131753604;
                    }
                    arrayList.add(new s5(6, org.telegram.messenger.id.M0(i12, null)));
                }
            } else {
                ArrayList arrayList4 = this.X;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new rg.a(8, false));
                    arrayList.add(new rg.a(2, false));
                } else {
                    for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                        TL_stories.Boost boost2 = (TL_stories.Boost) arrayList4.get(i16);
                        if (i16 == arrayList4.size() - 1 && !this.f50075a0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        arrayList.add(new s5(boost2, z10, this.f50078d0));
                    }
                    if (this.f50075a0) {
                        arrayList.add(new rg.a(9, true));
                    } else {
                        arrayList.add(new rg.a(7, false));
                    }
                    if (org.telegram.messenger.t3.V(chat)) {
                        i7 = 2131753605;
                    } else {
                        i7 = 2131753604;
                    }
                    arrayList.add(new s5(6, org.telegram.messenger.id.M0(i7, null)));
                }
            }
            arrayList.add(new s5(1, org.telegram.messenger.id.M0(2131748914, null)));
            arrayList.add(new s5(3, this.T.boost_url));
            if (org.telegram.messenger.qp.s1(this.S).f24865p4 && org.telegram.messenger.t3.N(chat)) {
                if (org.telegram.messenger.t3.V(chat)) {
                    i10 = 2131753269;
                } else {
                    i10 = 2131753268;
                }
                arrayList.add(new s5(6, org.telegram.messenger.id.M0(i10, null)));
                arrayList.add(new rg.a(10, true));
                if (org.telegram.messenger.t3.V(chat)) {
                    i11 = 2131753503;
                } else {
                    i11 = 2131753502;
                }
                arrayList.add(new s5(6, org.telegram.messenger.id.M0(i11, null)));
            } else {
                arrayList.add(new s5(6, ""));
            }
            arrayList.add(new rg.a(15, false));
        }
        n5 n5Var = this.f50080f0;
        if (z9) {
            n5Var.E(arrayList2, arrayList);
        } else {
            n5Var.f();
        }
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        I0(false);
        v4.k kVar = new v4.k();
        kVar.f57083m = false;
        kVar.C = false;
        this.f48842c.setItemAnimator(kVar);
        this.f48842c.setOnItemClickListener(new di.q4(3, this, context));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f50082h0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f50082h0.addView(new di.m1(parentActivity), c8.ha.t(100, 100, 17, 0, 120, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.f50082h0, c8.ha.e(-1, -2, 17));
        this.f50082h0.setAlpha(0.0f);
        if (this.T == null) {
            this.f50082h0.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().G0().a(this.R, new l5(this, 1));
        } else {
            this.f50082h0.setVisibility(8);
            H0(null);
        }
        J0(false);
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.f2 f2Var;
        org.telegram.ui.ActionBar.f2 f2Var2;
        if (i7 == org.telegram.messenger.qs.V2) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            List fragmentStack = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.f2 f2Var3 = null;
            if (fragmentStack.size() >= 2) {
                f2Var = (org.telegram.ui.ActionBar.f2) rf.b.g(2, fragmentStack);
            } else {
                f2Var = null;
            }
            if (f2Var instanceof rn) {
                ((ActionBarLayout) getParentLayout()).d0(f2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            if (fragmentStack2.size() >= 2) {
                f2Var2 = (org.telegram.ui.ActionBar.f2) rf.b.g(2, fragmentStack2);
            } else {
                f2Var2 = null;
            }
            if (booleanValue) {
                if (fragmentStack2.size() >= 3) {
                    f2Var3 = (org.telegram.ui.ActionBar.f2) rf.b.g(3, fragmentStack2);
                }
                if (f2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) getParentLayout()).d0(f2Var2, false);
                }
                finishFragment();
                if (f2Var3 instanceof cn) {
                    wg.h.f(f2Var3, chat, true);
                }
                if (f2Var2 instanceof cn) {
                    wg.h.f(f2Var2, chat, true);
                    return;
                }
                return;
            }
            finishFragment();
            if ((f2Var2 instanceof ProfileActivity) || (f2Var2 instanceof cn)) {
                wg.h.f(f2Var2, chat, false);
            }
        } else if (i7 == org.telegram.messenger.qs.f25054p3) {
            if (this.R == ((Long) objArr[2]).longValue()) {
                this.T = (TL_stories.TL_premium_boostsStatus) objArr[0];
                this.U = (org.telegram.messenger.e3) objArr[1];
            }
        }
    }

    @Override
    public final v4.g0 k0() {
        return this.f50080f0;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.qs.V2);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25054p3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.qs.V2);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25054p3);
        super.onFragmentDestroy();
    }
}
