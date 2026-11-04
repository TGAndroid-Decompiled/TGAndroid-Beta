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
public final class v5 extends l00 implements org.telegram.messenger.cs {
    public final long S;
    public final int T;
    public TL_stories.TL_premium_boostsStatus U;
    public org.telegram.messenger.e3 V;
    public ScrollSlidingTextTabStrip W;
    public final ArrayList X;
    public final ArrayList Y;
    public boolean Z;
    public int f50382a0;
    public boolean f50383b0;
    public int f50384c0;
    public final ArrayList f50385d0;
    public int f50386e0;
    public LimitPreviewView f50387f0;
    public final p5 f50388g0;
    public boolean f50389h0;
    public LinearLayout f50390i0;
    public final TLRPC.Chat f50391j0;
    public String f50392k0;
    public String f50393l0;
    public int m0;
    public int f50394n0;
    public int f50395o0;
    public int f50396p0;

    public v5(long j10) {
        int i3 = org.telegram.messenger.h10.f22829t0;
        this.T = i3;
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.f50385d0 = new ArrayList();
        this.f50386e0 = 0;
        this.f50388g0 = new p5(this);
        this.f50392k0 = "";
        this.f50393l0 = "";
        this.m0 = 5;
        this.f50394n0 = 5;
        this.S = j10;
        this.f50391j0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-j10));
    }

    public static void A0(v5 v5Var, Context context, View view, int i3) {
        long j10 = v5Var.S;
        boolean z10 = false;
        if (view instanceof ch.b) {
            ch.b bVar = (ch.b) view;
            TL_stories.Boost boost = bVar.getBoost();
            boolean z11 = boost.giveaway;
            if (z11 && boost.stars > 0) {
                ci.wb.h1(context, v5Var.T, v5Var.S, boost, v5Var.getResourceProvider());
            } else {
                boolean z12 = boost.gift;
                if (((!z12 && !z11) || boost.user_id < 0) && !boost.unclaimed) {
                    if (z11 && boost.user_id == -1) {
                        org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(v5Var.getParentActivity(), v5Var.getResourceProvider());
                        ibVar.c(2131623981, 36, 36, new String[0]);
                        ibVar.f34651b.setText(org.telegram.messenger.bd.M0(2131753303, null));
                        ibVar.f34651b.setSingleLine(false);
                        ibVar.f34651b.setMaxLines(2);
                        org.telegram.ui.Components.ac.g(v5Var, ibVar, 2750).j();
                    } else if (!z12 && !z11) {
                        v5Var.presentFragment(ProfileActivity.A4(bVar.getDialogId()));
                    }
                } else {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).z1(-v5Var.f50391j0.f27001id);
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
                    new xg.c0(v5Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                }
            }
        }
        if (view instanceof org.telegram.ui.Cells.l8) {
            xg.n.I0(v5Var, v5Var.resourceProvider, j10, null);
        }
        if (view instanceof ch.c) {
            xg.n.I0(v5Var, v5Var.resourceProvider, j10, ((ch.c) view).getPrepaidGiveaway());
        }
        if (((u5) v5Var.f50385d0.get(i3)).f54715a == 9) {
            if (v5Var.f50386e0 == 1) {
                z10 = true;
            }
            v5Var.H0(Boolean.valueOf(z10));
        }
    }

    public final void F0(CountDownLatch countDownLatch, m5 m5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.f50394n0;
        tL_premium_getBoostsList.offset = this.f50392k0;
        int i3 = this.T;
        tL_premium_getBoostsList.peer = org.telegram.messenger.hp.s1(i3).j1(this.S);
        ConnectionsManager.getInstance(i3).sendRequest(tL_premium_getBoostsList, new k5(this, countDownLatch, m5Var, 0), 2);
    }

    public final void G0(CountDownLatch countDownLatch, m5 m5Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.m0;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.f50393l0;
        int i3 = this.T;
        tL_premium_getBoostsList.peer = org.telegram.messenger.hp.s1(i3).j1(this.S);
        ConnectionsManager.getInstance(i3).sendRequest(tL_premium_getBoostsList, new k5(this, countDownLatch, m5Var, 1), 2);
    }

    public final void H0(Boolean bool) {
        if (this.f50389h0) {
            return;
        }
        this.f50389h0 = true;
        if (bool == null) {
            Utilities.f21387e.c(new m5(this, 1));
        } else if (bool.booleanValue()) {
            G0(null, new m5(this, 2));
        } else {
            F0(null, new m5(this, 3));
        }
    }

    public final void I0(boolean z10) {
        int i3;
        int i10;
        View view;
        float f10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f50387f0 == null) {
            LimitPreviewView limitPreviewView = new LimitPreviewView(2131231127, 0, 0, getParentActivity(), this.resourceProvider);
            this.f50387f0 = limitPreviewView;
            limitPreviewView.f31526d0 = true;
            limitPreviewView.setDarkGradientProvider(new x0(this, 5));
        }
        if (this.f50387f0.getParent() != null) {
            ((ViewGroup) this.f50387f0.getParent()).removeView(this.f50387f0);
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.U;
        if (tL_premium_boostsStatus != null) {
            this.f50387f0.g(tL_premium_boostsStatus, false);
            if (z10) {
                this.f50387f0.setAlpha(0.0f);
                this.f50387f0.animate().alpha(1.0f).start();
            }
        }
        TLRPC.Chat chat = this.f50391j0;
        if (org.telegram.messenger.t3.V(chat)) {
            i3 = 2131753589;
        } else {
            i3 = 2131753587;
        }
        String M0 = org.telegram.messenger.bd.M0(i3, null);
        if (org.telegram.messenger.t3.V(chat)) {
            i10 = 2131753588;
        } else {
            i10 = 2131753586;
        }
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(i10, null));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        if (this.U != null) {
            view = this.f50387f0;
        } else {
            view = new View(frameLayout.getContext());
        }
        if (this.U != null) {
            f10 = -2.0f;
        } else {
            f10 = 110.0f;
        }
        frameLayout.addView(view, b8.mf.d(-1, f10, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        j0(M0, X2, frameLayout, new t5(this, getParentActivity()));
    }

    public final void J0(boolean z10) {
        int i3;
        boolean z11;
        int i10;
        int i11;
        int i12;
        boolean z12;
        boolean z13;
        ArrayList arrayList = this.f50385d0;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        arrayList.add(new sg.a(14, false));
        if (this.U != null) {
            arrayList.add(new u5(16, org.telegram.messenger.bd.M0(2131744905, null)));
            arrayList.add(new sg.a(0, false));
            arrayList.add(new sg.a(2, false));
            if (this.U.prepaid_giveaways.size() > 0) {
                arrayList.add(new u5(12, org.telegram.messenger.bd.M0(2131753324, null)));
                for (int i13 = 0; i13 < this.U.prepaid_giveaways.size(); i13++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.U.prepaid_giveaways.get(i13);
                    if (i13 == this.U.prepaid_giveaways.size() - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    ?? aVar = new sg.a(11, true);
                    aVar.f49980e = prepaidGiveaway;
                    aVar.f49981f = z13;
                    arrayList.add(aVar);
                }
                arrayList.add(new u5(6, org.telegram.messenger.bd.M0(2131753286, null)));
            }
            arrayList.add(new u5(13, org.telegram.messenger.bd.M0(2131753606, null)));
            int i14 = this.f50386e0;
            TLRPC.Chat chat = this.f50391j0;
            if (i14 == 0) {
                ArrayList arrayList3 = this.X;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new sg.a(8, false));
                    arrayList.add(new sg.a(2, false));
                } else {
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        TL_stories.Boost boost = (TL_stories.Boost) arrayList3.get(i15);
                        if (i15 == arrayList3.size() - 1 && !this.Z) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        arrayList.add(new u5(boost, z12, this.f50386e0));
                    }
                    if (this.Z) {
                        arrayList.add(new sg.a(9, true));
                    } else {
                        arrayList.add(new sg.a(7, false));
                    }
                    if (org.telegram.messenger.t3.V(chat)) {
                        i12 = 2131753605;
                    } else {
                        i12 = 2131753604;
                    }
                    arrayList.add(new u5(6, org.telegram.messenger.bd.M0(i12, null)));
                }
            } else {
                ArrayList arrayList4 = this.Y;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new sg.a(8, false));
                    arrayList.add(new sg.a(2, false));
                } else {
                    for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                        TL_stories.Boost boost2 = (TL_stories.Boost) arrayList4.get(i16);
                        if (i16 == arrayList4.size() - 1 && !this.f50383b0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        arrayList.add(new u5(boost2, z11, this.f50386e0));
                    }
                    if (this.f50383b0) {
                        arrayList.add(new sg.a(9, true));
                    } else {
                        arrayList.add(new sg.a(7, false));
                    }
                    if (org.telegram.messenger.t3.V(chat)) {
                        i3 = 2131753605;
                    } else {
                        i3 = 2131753604;
                    }
                    arrayList.add(new u5(6, org.telegram.messenger.bd.M0(i3, null)));
                }
            }
            arrayList.add(new u5(1, org.telegram.messenger.bd.M0(2131748922, null)));
            arrayList.add(new u5(3, this.U.boost_url));
            if (org.telegram.messenger.hp.s1(this.T).f23090p4 && org.telegram.messenger.t3.N(chat)) {
                if (org.telegram.messenger.t3.V(chat)) {
                    i10 = 2131753269;
                } else {
                    i10 = 2131753268;
                }
                arrayList.add(new u5(6, org.telegram.messenger.bd.M0(i10, null)));
                arrayList.add(new sg.a(10, true));
                if (org.telegram.messenger.t3.V(chat)) {
                    i11 = 2131753503;
                } else {
                    i11 = 2131753502;
                }
                arrayList.add(new u5(6, org.telegram.messenger.bd.M0(i11, null)));
            } else {
                arrayList.add(new u5(6, ""));
            }
            arrayList.add(new sg.a(15, false));
        }
        p5 p5Var = this.f50388g0;
        if (z10) {
            p5Var.E(arrayList2, arrayList);
        } else {
            p5Var.f();
        }
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        I0(false);
        u4.k kVar = new u4.k();
        kVar.f55567m = false;
        kVar.C = false;
        this.f47063c.setItemAnimator(kVar);
        this.f47063c.setOnItemClickListener(new ei.q4(3, this, context));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.f50390i0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f50390i0.addView(new ei.r1(parentActivity), b8.mf.t(100, 100, 17, 0, 120, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.f50390i0, b8.mf.e(-1, -2, 17));
        this.f50390i0.setAlpha(0.0f);
        if (this.U == null) {
            this.f50390i0.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().G0().a(this.S, new n5(this, 1));
        } else {
            this.f50390i0.setVisibility(8);
            H0(null);
        }
        J0(false);
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.d2 d2Var;
        org.telegram.ui.ActionBar.d2 d2Var2;
        if (i3 == org.telegram.messenger.hs.V2) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            List fragmentStack = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.d2 d2Var3 = null;
            if (fragmentStack.size() >= 2) {
                d2Var = (org.telegram.ui.ActionBar.d2) t4.c.d(2, fragmentStack);
            } else {
                d2Var = null;
            }
            if (d2Var instanceof ln) {
                ((ActionBarLayout) getParentLayout()).d0(d2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            if (fragmentStack2.size() >= 2) {
                d2Var2 = (org.telegram.ui.ActionBar.d2) t4.c.d(2, fragmentStack2);
            } else {
                d2Var2 = null;
            }
            if (booleanValue) {
                if (fragmentStack2.size() >= 3) {
                    d2Var3 = (org.telegram.ui.ActionBar.d2) t4.c.d(3, fragmentStack2);
                }
                if (d2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) getParentLayout()).d0(d2Var2, false);
                }
                finishFragment();
                if (d2Var3 instanceof wm) {
                    xg.j.f(d2Var3, chat, true);
                }
                if (d2Var2 instanceof wm) {
                    xg.j.f(d2Var2, chat, true);
                    return;
                }
                return;
            }
            finishFragment();
            if ((d2Var2 instanceof ProfileActivity) || (d2Var2 instanceof wm)) {
                xg.j.f(d2Var2, chat, false);
            }
        } else if (i3 == org.telegram.messenger.hs.f23283p3) {
            if (this.S == ((Long) objArr[2]).longValue()) {
                this.U = (TL_stories.TL_premium_boostsStatus) objArr[0];
                this.V = (org.telegram.messenger.e3) objArr[1];
            }
        }
    }

    @Override
    public final u4.h0 k0() {
        return this.f50388g0;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.hs.V2);
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23283p3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.hs.V2);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23283p3);
        super.onFragmentDestroy();
    }
}
