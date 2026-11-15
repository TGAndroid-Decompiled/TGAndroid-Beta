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
public final class t5 extends p00 implements org.telegram.messenger.is {
    public final long S;
    public final int T;
    public TL_stories.TL_premium_boostsStatus U;
    public org.telegram.messenger.e3 V;
    public ScrollSlidingTextTabStrip W;
    public final ArrayList X;
    public final ArrayList Y;
    public boolean Z;
    public int f51359a0;
    public boolean f51360b0;
    public int f51361c0;
    public final ArrayList f51362d0;
    public int f51363e0;
    public LimitPreviewView f51364f0;
    public final n5 f51365g0;
    public boolean f51366h0;
    public LinearLayout f51367i0;
    public final TLRPC.Chat f51368j0;
    public String f51369k0;
    public String f51370l0;
    public int m0;
    public int f51371n0;
    public int f51372o0;
    public int f51373p0;

    public t5(long j3) {
        int i7 = org.telegram.messenger.m10.f24940t0;
        this.T = i7;
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.f51362d0 = new ArrayList();
        this.f51363e0 = 0;
        this.f51365g0 = new n5(this);
        this.f51369k0 = "";
        this.f51370l0 = "";
        this.m0 = 5;
        this.f51371n0 = 5;
        this.S = j3;
        this.f51368j0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-j3));
    }

    public static void A0(t5 t5Var, Context context, View view, int i7) {
        long j3 = t5Var.S;
        boolean z10 = false;
        if (view instanceof bh.b) {
            bh.b bVar = (bh.b) view;
            TL_stories.Boost boost = bVar.getBoost();
            boolean z11 = boost.giveaway;
            if (z11 && boost.stars > 0) {
                di.lb.h1(context, t5Var.T, t5Var.S, boost, t5Var.getResourceProvider());
            } else {
                boolean z12 = boost.gift;
                if (((!z12 && !z11) || boost.user_id < 0) && !boost.unclaimed) {
                    if (z11 && boost.user_id == -1) {
                        org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(t5Var.getParentActivity(), t5Var.getResourceProvider());
                        fbVar.c(2131623982, 36, 36, new String[0]);
                        fbVar.f34556b.setText(org.telegram.messenger.hd.M0(2131753303, null));
                        fbVar.f34556b.setSingleLine(false);
                        fbVar.f34556b.setMaxLines(2);
                        org.telegram.ui.Components.xb.g(t5Var, fbVar, 2750).j();
                    } else if (!z12 && !z11) {
                        t5Var.presentFragment(ProfileActivity.C4(bVar.getDialogId()));
                    }
                } else {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).z1(-t5Var.f51368j0.f28051id);
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
                    new wg.a0(t5Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                }
            }
        }
        if (view instanceof org.telegram.ui.Cells.l8) {
            wg.l.I0(t5Var, t5Var.resourceProvider, j3, null);
        }
        if (view instanceof bh.c) {
            wg.l.I0(t5Var, t5Var.resourceProvider, j3, ((bh.c) view).getPrepaidGiveaway());
        }
        if (((s5) t5Var.f51362d0.get(i7)).f56015a == 9) {
            if (t5Var.f51363e0 == 1) {
                z10 = true;
            }
            t5Var.H0(Boolean.valueOf(z10));
        }
    }

    public final void F0(CountDownLatch countDownLatch, k5 k5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.f51371n0;
        tL_premium_getBoostsList.offset = this.f51369k0;
        int i7 = this.T;
        tL_premium_getBoostsList.peer = org.telegram.messenger.np.s1(i7).j1(this.S);
        ConnectionsManager.getInstance(i7).sendRequest(tL_premium_getBoostsList, new i5(this, countDownLatch, k5Var, 0), 2);
    }

    public final void G0(CountDownLatch countDownLatch, k5 k5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.m0;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.f51370l0;
        int i7 = this.T;
        tL_premium_getBoostsList.peer = org.telegram.messenger.np.s1(i7).j1(this.S);
        ConnectionsManager.getInstance(i7).sendRequest(tL_premium_getBoostsList, new i5(this, countDownLatch, k5Var, 1), 2);
    }

    public final void H0(Boolean bool) {
        if (this.f51366h0) {
            return;
        }
        this.f51366h0 = true;
        if (bool == null) {
            Utilities.f22416e.c(new k5(this, 1));
        } else if (bool.booleanValue()) {
            G0(null, new k5(this, 2));
        } else {
            F0(null, new k5(this, 3));
        }
    }

    public final void I0(boolean z10) {
        int i7;
        int i10;
        View view;
        float f10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f51364f0 == null) {
            LimitPreviewView limitPreviewView = new LimitPreviewView(2131231127, 0, 0, getParentActivity(), this.resourceProvider);
            this.f51364f0 = limitPreviewView;
            limitPreviewView.f32633d0 = true;
            limitPreviewView.setDarkGradientProvider(new w0(this, 5));
        }
        if (this.f51364f0.getParent() != null) {
            ((ViewGroup) this.f51364f0.getParent()).removeView(this.f51364f0);
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.U;
        if (tL_premium_boostsStatus != null) {
            this.f51364f0.g(tL_premium_boostsStatus, false);
            if (z10) {
                this.f51364f0.setAlpha(0.0f);
                this.f51364f0.animate().alpha(1.0f).start();
            }
        }
        TLRPC.Chat chat = this.f51368j0;
        if (org.telegram.messenger.t3.V(chat)) {
            i7 = 2131753589;
        } else {
            i7 = 2131753587;
        }
        String M0 = org.telegram.messenger.hd.M0(i7, null);
        if (org.telegram.messenger.t3.V(chat)) {
            i10 = 2131753588;
        } else {
            i10 = 2131753586;
        }
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i10, null));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        if (this.U != null) {
            view = this.f51364f0;
        } else {
            view = new View(frameLayout.getContext());
        }
        if (this.U != null) {
            f10 = -2.0f;
        } else {
            f10 = 110.0f;
        }
        frameLayout.addView(view, c8.ja.d(-1, f10, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        j0(M0, X2, frameLayout, new r5(this, getParentActivity()));
    }

    public final void J0(boolean z10) {
        int i7;
        boolean z11;
        int i10;
        int i11;
        int i12;
        boolean z12;
        boolean z13;
        ArrayList arrayList = this.f51362d0;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        arrayList.add(new rg.a(14, false));
        if (this.U != null) {
            arrayList.add(new s5(16, org.telegram.messenger.hd.M0(2131744895, null)));
            arrayList.add(new rg.a(0, false));
            arrayList.add(new rg.a(2, false));
            if (this.U.prepaid_giveaways.size() > 0) {
                arrayList.add(new s5(12, org.telegram.messenger.hd.M0(2131753324, null)));
                for (int i13 = 0; i13 < this.U.prepaid_giveaways.size(); i13++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.U.prepaid_giveaways.get(i13);
                    if (i13 == this.U.prepaid_giveaways.size() - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    ?? aVar = new rg.a(11, true);
                    aVar.f51097e = prepaidGiveaway;
                    aVar.f51098f = z13;
                    arrayList.add(aVar);
                }
                arrayList.add(new s5(6, org.telegram.messenger.hd.M0(2131753286, null)));
            }
            arrayList.add(new s5(13, org.telegram.messenger.hd.M0(2131753606, null)));
            int i14 = this.f51363e0;
            TLRPC.Chat chat = this.f51368j0;
            if (i14 == 0) {
                ArrayList arrayList3 = this.X;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new rg.a(8, false));
                    arrayList.add(new rg.a(2, false));
                } else {
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        TL_stories.Boost boost = (TL_stories.Boost) arrayList3.get(i15);
                        if (i15 == arrayList3.size() - 1 && !this.Z) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        arrayList.add(new s5(boost, z12, this.f51363e0));
                    }
                    if (this.Z) {
                        arrayList.add(new rg.a(9, true));
                    } else {
                        arrayList.add(new rg.a(7, false));
                    }
                    if (org.telegram.messenger.t3.V(chat)) {
                        i12 = 2131753605;
                    } else {
                        i12 = 2131753604;
                    }
                    arrayList.add(new s5(6, org.telegram.messenger.hd.M0(i12, null)));
                }
            } else {
                ArrayList arrayList4 = this.Y;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new rg.a(8, false));
                    arrayList.add(new rg.a(2, false));
                } else {
                    for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                        TL_stories.Boost boost2 = (TL_stories.Boost) arrayList4.get(i16);
                        if (i16 == arrayList4.size() - 1 && !this.f51360b0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(new s5(boost2, z11, this.f51363e0));
                    }
                    if (this.f51360b0) {
                        arrayList.add(new rg.a(9, true));
                    } else {
                        arrayList.add(new rg.a(7, false));
                    }
                    if (org.telegram.messenger.t3.V(chat)) {
                        i7 = 2131753605;
                    } else {
                        i7 = 2131753604;
                    }
                    arrayList.add(new s5(6, org.telegram.messenger.hd.M0(i7, null)));
                }
            }
            arrayList.add(new s5(1, org.telegram.messenger.hd.M0(2131748914, null)));
            arrayList.add(new s5(3, this.U.boost_url));
            if (org.telegram.messenger.np.s1(this.T).f25373q4 && org.telegram.messenger.t3.N(chat)) {
                if (org.telegram.messenger.t3.V(chat)) {
                    i10 = 2131753269;
                } else {
                    i10 = 2131753268;
                }
                arrayList.add(new s5(6, org.telegram.messenger.hd.M0(i10, null)));
                arrayList.add(new rg.a(10, true));
                if (org.telegram.messenger.t3.V(chat)) {
                    i11 = 2131753503;
                } else {
                    i11 = 2131753502;
                }
                arrayList.add(new s5(6, org.telegram.messenger.hd.M0(i11, null)));
            } else {
                arrayList.add(new s5(6, ""));
            }
            arrayList.add(new rg.a(15, false));
        }
        n5 n5Var = this.f51365g0;
        if (z10) {
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
        kVar.f58564m = false;
        kVar.C = false;
        this.f50075c.setItemAnimator(kVar);
        this.f50075c.setOnItemClickListener(new fi.i4(3, this, context));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f51367i0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f51367i0.addView(new fi.k1(parentActivity), c8.ja.t(100, 100, 17, 0, 120, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.f51367i0, c8.ja.e(-1, -2, 17));
        this.f51367i0.setAlpha(0.0f);
        if (this.U == null) {
            this.f51367i0.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().G0().a(this.S, new l5(this, 1));
        } else {
            this.f51367i0.setVisibility(8);
            H0(null);
        }
        J0(false);
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.e2 e2Var;
        org.telegram.ui.ActionBar.e2 e2Var2;
        if (i7 == org.telegram.messenger.ns.V2) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            List fragmentStack = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.e2 e2Var3 = null;
            if (fragmentStack.size() >= 2) {
                e2Var = (org.telegram.ui.ActionBar.e2) r.b.h(2, fragmentStack);
            } else {
                e2Var = null;
            }
            if (e2Var instanceof qn) {
                ((ActionBarLayout) getParentLayout()).d0(e2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            if (fragmentStack2.size() >= 2) {
                e2Var2 = (org.telegram.ui.ActionBar.e2) r.b.h(2, fragmentStack2);
            } else {
                e2Var2 = null;
            }
            if (booleanValue) {
                if (fragmentStack2.size() >= 3) {
                    e2Var3 = (org.telegram.ui.ActionBar.e2) r.b.h(3, fragmentStack2);
                }
                if (e2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) getParentLayout()).d0(e2Var2, false);
                }
                finishFragment();
                if (e2Var3 instanceof an) {
                    wg.h.f(e2Var3, chat, true);
                }
                if (e2Var2 instanceof an) {
                    wg.h.f(e2Var2, chat, true);
                    return;
                }
                return;
            }
            finishFragment();
            if ((e2Var2 instanceof ProfileActivity) || (e2Var2 instanceof an)) {
                wg.h.f(e2Var2, chat, false);
            }
        } else if (i7 == org.telegram.messenger.ns.f25551p3) {
            if (this.S == ((Long) objArr[2]).longValue()) {
                this.U = (TL_stories.TL_premium_boostsStatus) objArr[0];
                this.V = (org.telegram.messenger.e3) objArr[1];
            }
        }
    }

    @Override
    public final v4.h0 k0() {
        return this.f51365g0;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ns.V2);
        getNotificationCenter().c(this, org.telegram.messenger.ns.f25551p3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.ns.V2);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25551p3);
        super.onFragmentDestroy();
    }
}
