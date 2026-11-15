package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
public class u91 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is, org.telegram.ui.Components.qg, ie0 {
    public static final HashSet f51834r1 = new HashSet();
    public boolean A0;
    public HashSet B0;
    public boolean C0;
    public boolean D0;
    public int E;
    public fi.x4 E0;
    public boolean F;
    public k91 F0;
    public x81 G;
    public FrameLayout G0;
    public boolean H;
    public x8 H0;
    public boolean I;
    public org.telegram.messenger.r3 I0;
    public boolean J;
    public i91 J0;
    public TLRPC.ChatFull K;
    public boolean K0;
    public boolean L;
    public org.telegram.ui.Components.xi0 L0;
    public org.telegram.ui.Components.v41 M;
    public yw M0;
    public int N;
    public yw N0;
    public g91 O;
    public boolean O0;
    public z81 P;
    public final h2.f P0;
    public t91 Q;
    public rv Q0;
    public org.telegram.ui.ActionBar.z0 R;
    public long R0;
    public org.telegram.ui.ActionBar.z0 S;
    public zh.d S0;
    public org.telegram.ui.ActionBar.z0 T;
    public float T0;
    public org.telegram.ui.ActionBar.z0 U;
    public boolean U0;
    public org.telegram.ui.ActionBar.z0 V;
    public org.telegram.ui.Components.vr V0;
    public boolean W;
    public final boolean W0;
    public float X;
    public ImageView X0;
    public TL_stories.TL_premium_boostsStatus Y;
    public float Y0;
    public long Z;
    public ValueAnimator Z0;
    public final long f51835a;
    public boolean f51836a0;
    public boolean f51837a1;
    public final ArrayList f51838b;
    public final HashSet f51839b0;
    public org.telegram.ui.Components.v61 f51840b1;
    public int f51841c;
    public boolean f51842c0;
    public boolean f51843c1;
    public c91 d;
    public NumberTextView f51844d0;
    public View f51845d1;
    public k0 f51846e;
    public org.telegram.ui.ActionBar.q0 f51847e0;
    public int f51848e1;
    public org.telegram.ui.Components.sn f51849f;
    public org.telegram.ui.ActionBar.q0 f51850f0;
    public int f51851f1;
    public org.telegram.ui.ActionBar.q0 f51852g0;
    public int f51853g1;
    public org.telegram.ui.Components.t00 h;
    public org.telegram.ui.ActionBar.q0 f51854h0;
    public final dh.g f51855h1;
    public org.telegram.ui.ActionBar.q0 f51856i0;
    public final ui.f f51857i1;
    public org.telegram.ui.ActionBar.q0 f51858j0;
    public final ui.f f51859j1;
    public org.telegram.ui.ActionBar.z0 f51860k0;
    public final ui.c f51861k1;
    public org.telegram.ui.ActionBar.z0 f51862l0;
    public final dh.c l1;
    public org.telegram.ui.ActionBar.z0 m0;
    public dh.k f51863m1;
    public q81 f51864n;
    public org.telegram.ui.ActionBar.q0 f51865n0;
    public final ArrayList n1;
    public RadialProgressView f51866o0;
    public final RectF f51867o1;
    public eh0 f51868p0;
    public final RectF f51869p1;
    public org.telegram.ui.ActionBar.q0 f51870q0;
    public int f51871q1;
    public final l91 f51872r;
    public org.telegram.ui.ActionBar.q0 f51873r0;
    public final org.telegram.messenger.h00 f51874s;
    public q91 f51875s0;
    public boolean f51876t0;
    public final boolean f51877u0;
    public final boolean f51878v0;
    public v91 f51879w;
    public final boolean f51880w0;
    public gv f51881x;
    public final boolean f51882x0;
    public int f51883y;
    public final boolean f51884y0;
    public String f51885z0;

    public u91(Bundle bundle) {
        super(bundle);
        this.f51838b = new ArrayList();
        new ArrayList();
        this.f51872r = new l91(this);
        this.f51883y = 0;
        this.F = true;
        this.H = true;
        this.W = true;
        this.X = 0.0f;
        this.f51839b0 = new HashSet();
        this.C0 = false;
        this.P0 = new h2.f(new int[]{org.telegram.messenger.ns.f25559q5});
        this.T0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.n1 = arrayList;
        RectF rectF = new RectF();
        this.f51867o1 = rectF;
        RectF rectF2 = new RectF();
        this.f51869p1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j3 = this.arguments.getLong("chat_id", 0L);
        this.f51835a = j3;
        this.f51877u0 = this.arguments.getBoolean("for_select", false);
        this.f51878v0 = this.arguments.getBoolean("forward_to", false);
        this.f51884y0 = this.arguments.getBoolean("bot_share_to", false);
        this.f51880w0 = this.arguments.getBoolean("quote", false);
        this.f51882x0 = this.arguments.getBoolean("reply_to", false);
        this.f51885z0 = this.arguments.getString("voicechat", null);
        this.A0 = this.arguments.getBoolean("videochat", false);
        this.f51874s = getMessagesController().f25386r7;
        this.W0 = !org.telegram.messenger.k5.w("topics_end_reached_", j3, getUserConfig().k(), false);
        ui.c cVar = new ui.c();
        this.f51861k1 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f51855h1 = new dh.g(false);
            this.f51857i1 = new ui.f(null);
            ui.f fVar = new ui.f(null);
            this.f51859j1 = fVar;
            dh.c cVar2 = new dh.c(fVar, fVar, fVar);
            this.l1 = cVar2;
            cVar2.f8100k = true;
            return;
        }
        this.f51855h1 = null;
        this.f51857i1 = null;
        this.f51859j1 = null;
        this.l1 = new dh.c(cVar, cVar, cVar);
    }

    public static org.telegram.ui.ActionBar.e2 I0(org.telegram.messenger.np npVar, org.telegram.messenger.vr vrVar, Bundle bundle) {
        long j3 = bundle.getLong("chat_id");
        if (j3 != 0) {
            TLRPC.Dialog S0 = npVar.S0(-j3);
            if (S0 != null && S0.view_forum_as_messages) {
                return new an(bundle);
            }
            TLRPC.ChatFull N0 = npVar.N0(j3);
            if (N0 == null) {
                N0 = vrVar.F0(j3, true, new CountDownLatch(1), false, false, 0);
            }
            if (N0 != null && N0.view_forum_as_messages) {
                return new an(bundle);
            }
        }
        return new u91(bundle);
    }

    public static org.telegram.ui.ActionBar.e2 J0(LaunchActivity launchActivity, Bundle bundle) {
        return I0(org.telegram.messenger.np.s1(launchActivity.P), org.telegram.messenger.vr.a0(launchActivity.P), bundle);
    }

    public static void M0(org.telegram.ui.an r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u91.M0(org.telegram.ui.an):void");
    }

    public static boolean Z(u91 u91Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = org.telegram.messenger.np.s1(u91Var.currentAccount).f25273e7.edit();
        edit.putLong("dialog_join_requested_time_" + (-u91Var.f51835a), System.currentTimeMillis()).commit();
        Activity parentActivity = u91Var.getParentActivity();
        boolean V = org.telegram.messenger.t3.V(u91Var.g());
        int i7 = org.telegram.ui.Components.e70.f34228u1;
        org.telegram.ui.Components.e70.J0(parentActivity, u91Var, org.telegram.ui.Components.cc.a0(u91Var), V);
        u91Var.S0(true);
        return false;
    }

    public static void a0(u91 u91Var, View view) {
        long j3;
        long j10 = u91Var.f51835a;
        if (u91Var.getParentLayout() != null && !((ActionBarLayout) u91Var.getParentLayout()).y() && (view instanceof r91)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((r91) view).O;
            long j11 = -j10;
            boolean y22 = u91Var.getMessagesController().y2(j11);
            if (tL_forumTopic == null) {
                j3 = 0;
            } else if (y22) {
                j3 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
            } else {
                j3 = tL_forumTopic.f28103id;
            }
            long j12 = j3;
            if (u91Var.f51877u0) {
                v91 v91Var = u91Var.f51879w;
                if (v91Var != null) {
                    x91 x91Var = v91Var.f52175a;
                    Bundle bundle = new Bundle();
                    aa1 aa1Var = x91Var.f53132a;
                    bundle.putLong("dialog_id", aa1Var.f44982c);
                    bundle.putLong("topic_id", tL_forumTopic.f28103id);
                    bundle.putBoolean("exception", true);
                    fx0 fx0Var = new fx0(bundle, null);
                    fx0Var.f47218s = new xi0(25, x91Var, tL_forumTopic);
                    aa1Var.presentFragment(fx0Var);
                }
                yw ywVar = u91Var.M0;
                if (ywVar != null) {
                    ywVar.a4(j11, j12, true, u91Var);
                }
            } else if (u91Var.f51839b0.size() > 0) {
                u91Var.R0(view);
            } else {
                if (u91Var.inPreviewMode && org.telegram.messenger.g0.Q1()) {
                    for (org.telegram.ui.ActionBar.e2 e2Var : u91Var.getParentLayout().getFragmentStack()) {
                        if (e2Var instanceof yw) {
                            yw ywVar2 = (yw) e2Var;
                            if (ywVar2.t4()) {
                                org.telegram.messenger.ur urVar = ywVar2.f53697r2;
                                if (urVar.f26861a == j11 && urVar.f26862b == j12) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    u91Var.R0 = j12;
                    u91Var.Z0(false, false);
                }
                qg.c.m(u91Var, j10, tL_forumTopic, 0);
            }
        }
    }

    public static boolean b0(u91 u91Var, View view, float f10) {
        if (u91Var.f51877u0 || u91Var.getParentLayout() == null || ((ActionBarLayout) u91Var.getParentLayout()).y()) {
            return false;
        }
        if (!u91Var.actionBar.x() && !org.telegram.messenger.g0.Q1() && (view instanceof r91)) {
            r91 r91Var = (r91) view;
            if (r91Var.b0(f10)) {
                u91Var.Q0(r91Var);
                u91Var.O.I0(true);
                u91Var.O.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        u91Var.R0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void f0(u91 u91Var, boolean z10) {
        float f10;
        boolean z11;
        uv uvVar;
        u91Var.f51876t0 = z10;
        ValueAnimator valueAnimator = u91Var.Z0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            u91Var.Z0.cancel();
        }
        if (u91Var.f51840b1 == null) {
            org.telegram.ui.Components.v61 i7 = u91Var.f51875s0.i(8, false);
            u91Var.f51840b1 = i7;
            if (u91Var.N0 != null) {
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, i7, u91Var.getResourceProvider());
            }
            u91Var.f51846e.addView(u91Var.f51840b1, c8.ja.c(44.0f, -1));
        }
        float f11 = u91Var.X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u91Var.Z0 = ValueAnimator.ofFloat(f11, f10);
        org.telegram.messenger.g0.Y3(u91Var.f51875s0, false, 1.0f, true, true);
        yw ywVar = u91Var.N0;
        if (ywVar != null && (uvVar = ywVar.H3) != null) {
            uvVar.N = !z10;
        }
        if (!z10 && u91Var.f51875s0.getVisibility() == 0 && u91Var.f51875s0.getAlpha() == 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        u91Var.f51837a1 = z11;
        u91Var.Z0.addUpdateListener(new ez0(u91Var, 13));
        u91Var.f51875s0.setVisibility(0);
        if (!z10) {
            u91Var.f51873r0.setVisibility(0);
        } else {
            org.telegram.messenger.g0.a3(u91Var.getParentActivity(), u91Var.classGuid);
            u91Var.U0(false);
        }
        u91Var.Z0.addListener(new e91(u91Var, z10, 0));
        u91Var.Z0.setDuration(200L);
        u91Var.Z0.setInterpolator(org.telegram.ui.Components.er.f34419f);
        u91Var.Z0.start();
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25565r4, Boolean.TRUE);
    }

    @Override
    public final ui.f B() {
        return this.f51859j1;
    }

    public final void B0() {
        dh.g gVar;
        View view;
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        int i7;
        if (Build.VERSION.SDK_INT >= 31 && (gVar = this.f51855h1) != null) {
            int L = org.telegram.messenger.g0.L(48.0f);
            int L2 = org.telegram.messenger.g0.L(48.0f) + ((int) this.V0.c(org.telegram.messenger.g0.L(14.0f)));
            yw ywVar = this.N0;
            if (ywVar != null) {
                view = ywVar.fragmentView;
            } else {
                view = this.fragmentView;
            }
            if (ywVar != null) {
                kVar = ywVar.getActionBar();
            } else {
                kVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.f51853g1) - org.telegram.messenger.g0.L(8.0f);
            this.f51867o1.set(0.0f, -L, view.getMeasuredWidth(), kVar.getMeasuredHeight() + L + L2);
            RectF rectF = this.f51869p1;
            rectF.set(0.0f, measuredHeight - org.telegram.messenger.g0.L(56.0f), view.getMeasuredWidth(), measuredHeight);
            if (org.telegram.messenger.qc.e(262144)) {
                f10 = 0.0f;
            } else {
                f10 = -org.telegram.messenger.g0.L(48.0f);
            }
            rectF.inset(0.0f, f10);
            if (this.N0 != null) {
                i7 = 2;
            } else {
                i7 = 1;
            }
            gVar.g(i7, this.n1);
            gVar.e(this.f51863m1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final void C0() {
        x81 x81Var;
        org.telegram.messenger.h00 h00Var = this.f51874s;
        long j3 = this.f51835a;
        if (!h00Var.e(j3) && (x81Var = this.G) != null) {
            int N0 = x81Var.N0();
            if (this.f51838b.isEmpty() || N0 >= this.f51872r.b() - 5) {
                h00Var.o(j3);
            }
            E0();
        }
    }

    @Override
    public final org.telegram.ui.Components.st0 D() {
        return this.d;
    }

    public final void D0(boolean z10) {
        String str;
        org.telegram.messenger.np messagesController = getMessagesController();
        long j3 = this.f51835a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        TLRPC.ChatFull N0 = getMessagesController().N0(j3);
        org.telegram.messenger.r3 r3Var = this.I0;
        if (r3Var != null && ((str = this.f51885z0) != null || this.A0)) {
            org.telegram.ui.Components.voip.c2.l(M0, str, false, Boolean.valueOf(!r3Var.f26216b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f51885z0 = null;
            this.A0 = false;
        } else if (this.f51885z0 != null && z10 && N0 != null && N0.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.k5.n(null, 2131748913, org.telegram.ui.Components.cc.a0(this), 2131624080, 36);
            this.f51885z0 = null;
        }
    }

    public final void E0() {
        boolean z10;
        org.telegram.messenger.h00 h00Var = this.f51874s;
        a0.h hVar = h00Var.f24011a;
        LongSparseIntArray longSparseIntArray = h00Var.f24013c;
        long j3 = this.f51835a;
        if (longSparseIntArray.get(j3, 0) == 1 && (hVar.f(j3) == null || ((ArrayList) hVar.f(j3)).isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K0 = z10;
        if (this.E0 != null) {
            ArrayList arrayList = this.f51838b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((m91) arrayList.get(0)).f49187c != null && ((m91) arrayList.get(0)).f49187c.f28103id == 1)) {
                this.E0.e(this.K0, this.fragmentBeginToShow);
            }
        }
        g91 g91Var = this.O;
        if (g91Var != null) {
            g91Var.K0(g91Var.w1());
        }
        U0(true);
    }

    public final void F0() {
        int i7;
        float f10;
        float f11;
        yw ywVar = this.N0;
        float f12 = 0.0f;
        if (ywVar != null) {
            int L = org.telegram.messenger.g0.L(14.0f);
            org.telegram.ui.Components.vr vrVar = ywVar.L1;
            if (vrVar != null) {
                f10 = vrVar.c(L);
            } else {
                f10 = 0.0f;
            }
            float f13 = f10 + 0.0f;
            org.telegram.ui.Components.vr vrVar2 = this.V0;
            if (vrVar2 != null) {
                float L2 = org.telegram.messenger.g0.L(7.0f);
                org.telegram.ui.Components.vr vrVar3 = this.N0.L1;
                if (vrVar3 != null) {
                    f11 = vrVar3.getMetadata().f57101c.f57111a;
                } else {
                    f11 = 0.0f;
                }
                vrVar2.setTranslationY(f13 - (f11 * L2));
                org.telegram.ui.Components.vr vrVar4 = this.V0;
                int L3 = org.telegram.messenger.g0.L(14.0f);
                int L4 = org.telegram.messenger.g0.L(7.0f);
                org.telegram.ui.Components.vr vrVar5 = this.N0.L1;
                if (vrVar5 != null) {
                    f12 = vrVar5.getMetadata().f57101c.f57111a;
                }
                f12 = vrVar4.c(org.telegram.messenger.g0.W1(f12, L3, L4)) + f13;
            } else {
                f12 = f13;
            }
        } else {
            org.telegram.ui.Components.vr vrVar6 = this.V0;
            if (vrVar6 != null) {
                f12 = 0.0f + vrVar6.c(org.telegram.messenger.g0.L(14.0f));
            }
        }
        int i10 = this.f51853g1 + this.f51848e1;
        if (this.W) {
            i7 = org.telegram.messenger.g0.L(51.0f);
        } else {
            i7 = 0;
        }
        this.O.setPadding(0, (int) f12, 0, i10 + i7);
    }

    public final void G0() {
        this.f51839b0.clear();
        this.actionBar.w();
        org.telegram.messenger.g0.a4(this.O);
        V0();
    }

    public final void H0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String K0 = org.telegram.messenger.hd.K0(hashSet.size(), "DeleteTopics");
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = K0;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131751498, this.f51874s.f(this.f51835a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            t1Var.U = org.telegram.messenger.hd.M0(2131751497, null);
        }
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new a1.d(this, hashSet, arrayList, runnable, 22));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new t70(16));
        t1Var.show();
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, getResourceProvider());
        }
    }

    @Override
    public final boolean K() {
        return false;
    }

    public final void K0(boolean z10, boolean z11) {
        boolean z12 = true;
        this.h.e(!z10, (this.fragmentBeginToShow && z11) ? false : false);
    }

    public final void L0(boolean z10) {
        int i7;
        TLRPC.Chat g10;
        TLRPC.ChatPhoto chatPhoto;
        if (z10 && (g10 = g()) != null && ((chatPhoto = g10.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.f51835a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f51849f.getSharedMediaPreloader());
        profileActivity.c5(this.K);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f51849f.getAvatarImageView().getImageReceiver().J() && z10) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        profileActivity.i5(i7);
        presentFragment(profileActivity);
    }

    @Override
    public final long M() {
        return 0L;
    }

    public final void N0(int i7) {
        int i10;
        int i11;
        if (this.N != i7) {
            this.N = i7;
            org.telegram.ui.Components.v41 v41Var = this.M;
            if (i7 == 0) {
                i10 = org.telegram.ui.ActionBar.j6.f29135sf;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f29090q7;
            }
            v41Var.setTextColorKey(i10);
            ImageView imageView = this.X0;
            if (i7 == 1) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
            S0(false);
        }
    }

    public final void O0(boolean z10) {
        if (org.telegram.messenger.gz.o() == 0) {
            return;
        }
        c91 c91Var = this.d;
        if (c91Var != null) {
            if (z10) {
                c91Var.setLayerType(2, null);
                c91Var.setClipChildren(false);
                c91Var.setClipToPadding(false);
            } else {
                c91Var.setLayerType(0, null);
                c91Var.setClipChildren(true);
                c91Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void P0(float f10) {
        if (org.telegram.messenger.gz.o() != 0) {
            this.T0 = f10;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            g91 g91Var = this.O;
            if (g91Var != null) {
                float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, this.T0, 0.05f, 1.0f);
                g91Var.setPivotX(0.0f);
                g91Var.setPivotY(0.0f);
                g91Var.setScaleX(t6);
                g91Var.setScaleY(t6);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(t6);
                this.actionBar.setScaleY(t6);
            }
        }
    }

    public final void Q0(org.telegram.ui.Cells.t2 t2Var) {
        boolean z10;
        long j3;
        try {
            t2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232565, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = t2Var.O;
        org.telegram.ui.Components.io ioVar = new org.telegram.ui.Components.io(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new b91(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(ioVar.f35665f);
        ioVar.f35673o = 1;
        long j10 = this.f51835a;
        long j11 = -j10;
        ioVar.e(j11, tL_forumTopic.f28103id, null);
        if (org.telegram.messenger.t3.y(15, g())) {
            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                z0Var.j(org.telegram.messenger.hd.M0(2131751452, null), 2131232414, null);
            } else {
                z0Var.j(org.telegram.messenger.hd.M0(2131751453, null), 2131232294, null);
            }
            z0Var.setMinimumWidth(160);
            z10 = false;
            z0Var.setOnClickListener(new View.OnClickListener(this) {
                public final u91 f52502b;

                {
                    this.f52502b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            u91 u91Var = this.f52502b;
                            u91Var.D0 = true;
                            u91Var.O0 = true;
                            org.telegram.messenger.h00 h00Var = u91Var.f51874s;
                            long j12 = u91Var.f51835a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            h00Var.t(j12, tL_forumTopic2.f28103id, !tL_forumTopic2.pinned, u91Var);
                            u91Var.finishPreviewFragment();
                            return;
                        case 1:
                            u91 u91Var2 = this.f52502b;
                            u91Var2.O0 = true;
                            org.telegram.messenger.h00 h00Var2 = u91Var2.f51874s;
                            long j13 = u91Var2.f51835a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            h00Var2.z(tL_forumTopic3.f28103id, j13, true ^ tL_forumTopic3.closed);
                            u91Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f28103id));
                            u91 u91Var3 = this.f52502b;
                            u91Var3.H0(hashSet, new u81(u91Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(z0Var);
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(getParentActivity(), z10, z10);
        if (getMessagesController().r2(j11, tL_forumTopic.f28103id, null)) {
            z0Var2.j(org.telegram.messenger.hd.M0(2131743849, null), 2131232257, null);
        } else {
            z0Var2.j(org.telegram.messenger.hd.M0(2131748314, null), 2131232413, null);
        }
        z0Var2.setMinimumWidth(160);
        z0Var2.setOnClickListener(new fi.l5(this, tL_forumTopic, (Serializable) r32, b10, 6));
        boolean z11 = false;
        r32[0].addView(z0Var2);
        if (org.telegram.messenger.t3.i(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                z0Var3.j(org.telegram.messenger.hd.M0(2131746084, null), 2131232407, null);
            } else {
                z0Var3.j(org.telegram.messenger.hd.M0(2131752039, null), 2131232405, null);
            }
            z0Var3.setMinimumWidth(160);
            z0Var3.setOnClickListener(new View.OnClickListener(this) {
                public final u91 f52502b;

                {
                    this.f52502b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            u91 u91Var = this.f52502b;
                            u91Var.D0 = true;
                            u91Var.O0 = true;
                            org.telegram.messenger.h00 h00Var = u91Var.f51874s;
                            long j12 = u91Var.f51835a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            h00Var.t(j12, tL_forumTopic2.f28103id, !tL_forumTopic2.pinned, u91Var);
                            u91Var.finishPreviewFragment();
                            return;
                        case 1:
                            u91 u91Var2 = this.f52502b;
                            u91Var2.O0 = true;
                            org.telegram.messenger.h00 h00Var2 = u91Var2.f51874s;
                            long j13 = u91Var2.f51835a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            h00Var2.z(tL_forumTopic3.f28103id, j13, true ^ tL_forumTopic3.closed);
                            u91Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f28103id));
                            u91 u91Var3 = this.f52502b;
                            u91Var3.H0(hashSet, new u81(u91Var3, 3));
                            return;
                    }
                }
            });
            z11 = false;
            r32[0].addView(z0Var3);
        }
        if (org.telegram.messenger.t3.e(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(getParentActivity(), z11, true);
            z0Var4.j(org.telegram.messenger.hd.K0(1, "DeleteTopics"), 2131232109, null);
            z0Var4.c(org.telegram.ui.ActionBar.j6.f29090q7, org.telegram.ui.ActionBar.j6.f29070p7);
            z0Var4.setMinimumWidth(160);
            z0Var4.setOnClickListener(new View.OnClickListener(this) {
                public final u91 f52502b;

                {
                    this.f52502b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            u91 u91Var = this.f52502b;
                            u91Var.D0 = true;
                            u91Var.O0 = true;
                            org.telegram.messenger.h00 h00Var = u91Var.f51874s;
                            long j12 = u91Var.f51835a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            h00Var.t(j12, tL_forumTopic2.f28103id, !tL_forumTopic2.pinned, u91Var);
                            u91Var.finishPreviewFragment();
                            return;
                        case 1:
                            u91 u91Var2 = this.f52502b;
                            u91Var2.O0 = true;
                            org.telegram.messenger.h00 h00Var2 = u91Var2.f51874s;
                            long j13 = u91Var2.f51835a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            h00Var2.z(tL_forumTopic3.f28103id, j13, true ^ tL_forumTopic3.closed);
                            u91Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f28103id));
                            u91 u91Var3 = this.f52502b;
                            u91Var3.H0(hashSet, new u81(u91Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(z0Var4);
        }
        boolean y22 = getMessagesController().y2(j11);
        if (this.Q0 != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            this.parentLayout.getView().draw(canvas);
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
            this.Q0.setBackground(new BitmapDrawable(createBitmap));
            this.Q0.setAlpha(0.0f);
            if (this.Q0.getParent() != null) {
                ((ViewGroup) this.Q0.getParent()).removeView(this.Q0);
            }
            this.parentLayout.getOverlayContainerView().addView(this.Q0, c8.ja.c(-1.0f, -1));
        }
        an anVar = new an(a8.p0.j(j10, "chat_id"));
        if (y22) {
            j3 = org.telegram.messenger.m5.o(t2Var.O.from_id);
        } else {
            j3 = t2Var.O.f28103id;
        }
        qg.c.a(anVar, org.telegram.messenger.ur.a(j11, j3));
        presentFragmentAsPreviewWithMenu(anVar, r32[0]);
    }

    public final void R0(android.view.View r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u91.R0(android.view.View):void");
    }

    public final void S0(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u91.S0(boolean):void");
    }

    public final void T0() {
        RadialProgressView radialProgressView = this.f51866o0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.j6.f29135sf));
        this.h.updateColors();
        eh0 eh0Var = this.f51868p0;
        int i7 = org.telegram.ui.ActionBar.j6.f28849d6;
        eh0Var.setBackgroundColor(getThemedColor(i7));
        this.actionBar.setActionModeColor(getThemedColor(i7));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f29129s8));
        }
        this.f51875s0.setBackgroundColor(getThemedColor(i7));
    }

    public final void U0(boolean z10) {
        boolean z11;
        if (this.R == null) {
            return;
        }
        org.telegram.messenger.np messagesController = getMessagesController();
        long j3 = this.f51835a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        int i7 = 0;
        if (!org.telegram.messenger.t3.r0(getMessagesController().M0(Long.valueOf(j3))) && org.telegram.messenger.t3.w(15, M0) && !this.f51876t0 && !this.f51877u0 && !this.K0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.L = z11;
        org.telegram.ui.ActionBar.z0 z0Var = this.R;
        if (!z11) {
            i7 = 8;
        }
        z0Var.setVisibility(i7);
        K0(!this.L, z10);
    }

    public final void V0() {
        boolean z10;
        if (org.telegram.messenger.t3.y(15, g()) && !this.f51839b0.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f51842c0 != z10) {
            this.f51842c0 = z10;
            l91 l91Var = this.f51872r;
            l91Var.k(0, l91Var.b());
        }
    }

    public final void W0(float f10) {
        this.X = f10;
        X0();
        this.f51843c1 = true;
        float f11 = 1.0f - f10;
        this.f51849f.getTitleTextView().setAlpha(f11);
        this.f51849f.getSubtitleTextView().setAlpha(f11);
        org.telegram.ui.Components.v61 v61Var = this.f51840b1;
        if (v61Var != null) {
            v61Var.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
            this.f51840b1.setAlpha(f10);
        }
        this.f51875s0.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
        this.f51875s0.setAlpha(f10);
        if (isInPreviewMode()) {
            this.f51846e.invalidate();
        }
        this.d.invalidate();
        this.O.setAlpha(f11);
        if (this.f51837a1) {
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.X, 0.02f, 0.98f);
            this.O.setScaleX(z10);
            this.O.setScaleY(z10);
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void X0() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f29186v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.j6.f29243y8;
        kVar.H(i0.a.f(this.X, themedColor, getThemedColor(i7)), false);
        this.actionBar.H(i0.a.f(this.X, getThemedColor(i7), getThemedColor(i7)), true);
        this.actionBar.F(i0.a.f(this.X, getThemedColor(org.telegram.ui.ActionBar.j6.f29147t8), getThemedColor(org.telegram.ui.ActionBar.j6.f29262z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.f(this.X, getThemedColor(org.telegram.ui.ActionBar.j6.f29129s8), getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6)));
        }
    }

    public final void Y0() {
        fi.x4 x4Var = this.E0;
        if (x4Var != null && x4Var.f33709e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(2131231244, 0);
            eqVar.c(org.telegram.messenger.g0.L(16.0f));
            spannableStringBuilder.setSpan(eqVar, 0, 1, 0);
            if (org.telegram.messenger.t3.y(15, g())) {
                this.E0.f33709e.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131748136, null)), spannableStringBuilder, "%s"));
                return;
            }
            String M0 = org.telegram.messenger.hd.M0(2131750474, null);
            TLRPC.TL_forumTopic f10 = getMessagesController().f25386r7.f(this.f51835a, 1L);
            if (f10 != null) {
                M0 = f10.title;
            }
            this.E0.f33709e.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("NoTopicsDescriptionUser", null, 2131748135, M0)));
        }
    }

    public final void Z0(boolean z10, boolean z11) {
        x81 x81Var;
        i91 i91Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.O0) {
            z10 = true;
        }
        this.O0 = false;
        org.telegram.messenger.h00 h00Var = this.f51874s;
        long j3 = this.f51835a;
        ArrayList l10 = h00Var.l(j3);
        if (l10 != null) {
            ArrayList arrayList = this.f51838b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            i91 i91Var2 = null;
            if (org.telegram.messenger.q10.u(org.telegram.messenger.np.s1(this.currentAccount).a2(Long.valueOf(-j3))) && this.f51878v0) {
                arrayList.add(new m91(3, null));
            }
            for (int i7 = 0; i7 < l10.size(); i7++) {
                HashSet hashSet = this.B0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l10.get(i7)).f28103id))) {
                    arrayList.add(new m91(0, (TLRPC.TL_forumTopic) l10.get(i7)));
                }
            }
            if (!arrayList.isEmpty() && !h00Var.e(j3) && this.W0) {
                arrayList.add(new m91(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.L0.b(size + 4);
                z10 = false;
            }
            this.f51883y = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                m91 m91Var = (m91) arrayList.get(i10);
                if (m91Var != null && (tL_forumTopic = m91Var.f49187c) != null && tL_forumTopic.hidden) {
                    this.f51883y++;
                }
            }
            g91 g91Var = this.O;
            if (g91Var != null) {
                v4.m0 itemAnimator = g91Var.getItemAnimator();
                if (z10) {
                    i91Var = this.J0;
                } else {
                    i91Var = null;
                }
                if (itemAnimator != i91Var) {
                    g91 g91Var2 = this.O;
                    if (z10) {
                        i91Var2 = this.J0;
                    }
                    g91Var2.setItemAnimator(i91Var2);
                }
            }
            l91 l91Var = this.f51872r;
            if (l91Var != null) {
                l91Var.E(arrayList2, arrayList);
            }
            if ((this.D0 || size == 0) && (x81Var = this.G) != null) {
                x81Var.h1(0, 0);
                this.D0 = false;
            }
        }
        E0();
        Y0();
    }

    @Override
    public final long a() {
        return -this.f51835a;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override
    public final long b() {
        return 0L;
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        SpannableStringBuilder spannableStringBuilder;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.o4 o4Var2;
        yw ywVar = this.N0;
        if (ywVar != null && ywVar.X) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        this.f51848e1 = i7;
        yw ywVar2 = this.N0;
        if (ywVar2 != null && ywVar2.X) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        } else {
            i10 = 0;
        }
        this.f51851f1 = i10;
        c91 c91Var = new c91(this, context);
        this.d = c91Var;
        this.fragmentView = c91Var;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, c91Var, getResourceProvider());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if ((!org.telegram.messenger.g0.Q1() || ((o4Var2 = this.parentLayout) != null && ((ActionBarLayout) o4Var2).f28328b)) && !this.inPreviewMode) {
            z10 = true;
        } else {
            z10 = false;
        }
        kVar.setOccupyStatusBar(z10);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.actionBar.setActionBarMenuOnItemClick(new f91(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final u91 f51492b;

            {
                this.f51492b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var;
                switch (r2) {
                    case 0:
                        u91 u91Var = this.f51492b;
                        if (!u91Var.f51876t0) {
                            u91Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        u91 u91Var2 = this.f51492b;
                        u91Var2.getMessagesController().i2(-u91Var2.f51835a, null, u91Var2.g());
                        u91Var2.S0(false);
                        return;
                    case 2:
                        this.f51492b.finishPreviewFragment();
                        return;
                    case 3:
                        yw ywVar3 = this.f51492b.N0;
                        if (ywVar3 != null && (q0Var = ywVar3.f53662k0) != null) {
                            q0Var.performClick();
                            return;
                        }
                        return;
                    default:
                        u91 u91Var3 = this.f51492b;
                        u91Var3.presentFragment(s81.f0(u91Var3.f51835a, 0L));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        if (this.N0 != null) {
            org.telegram.ui.ActionBar.q0 a10 = s5.a(0, 2131232487);
            this.f51870q0 = a10;
            a10.setOnClickListener(new View.OnClickListener(this) {
                public final u91 f51492b;

                {
                    this.f51492b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.q0 q0Var;
                    switch (r2) {
                        case 0:
                            u91 u91Var = this.f51492b;
                            if (!u91Var.f51876t0) {
                                u91Var.L0(false);
                                return;
                            }
                            return;
                        case 1:
                            u91 u91Var2 = this.f51492b;
                            u91Var2.getMessagesController().i2(-u91Var2.f51835a, null, u91Var2.g());
                            u91Var2.S0(false);
                            return;
                        case 2:
                            this.f51492b.finishPreviewFragment();
                            return;
                        case 3:
                            yw ywVar3 = this.f51492b.N0;
                            if (ywVar3 != null && (q0Var = ywVar3.f53662k0) != null) {
                                q0Var.performClick();
                                return;
                            }
                            return;
                        default:
                            u91 u91Var3 = this.f51492b;
                            u91Var3.presentFragment(s81.f0(u91Var3.f51835a, 0L));
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.q0 a11 = s5.a(0, 2131232487);
            this.f51870q0 = a11;
            a11.O();
            a11.K(new kg.x1(this, 22));
            this.f51870q0.setSearchPaddingStart(56);
            this.f51870q0.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
            EditTextBoldCursor searchField = this.f51870q0.getSearchField();
            org.telegram.ui.ActionBar.q6.U(searchField, org.telegram.ui.ActionBar.j6.G6, getResourceProvider());
            org.telegram.ui.ActionBar.q6.D(searchField, org.telegram.ui.ActionBar.j6.Jj, getResourceProvider());
            org.telegram.ui.ActionBar.q6.v(searchField, org.telegram.ui.ActionBar.j6.Ne, getResourceProvider());
        }
        org.telegram.ui.ActionBar.q0 c10 = s5.c(0, 2131231244, null);
        this.f51873r0 = c10;
        c10.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        this.f51873r0.e(1, 2131232114, org.telegram.messenger.hd.M0(2131744002, null));
        this.S = this.f51873r0.e(2, 2131232046, org.telegram.messenger.hd.M0(2131754401, null));
        org.telegram.ui.ActionBar.q0 q0Var = this.f51873r0;
        this.U = q0Var.d(14, 0, new org.telegram.ui.Components.ch0(2131623944, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f)), org.telegram.messenger.hd.M0(2131753585, null), true, false, q0Var.f29513n0);
        this.R = this.f51873r0.e(3, 2131232406, org.telegram.messenger.hd.M0(2131751702, null));
        this.V = this.f51873r0.e(15, 2131232334, org.telegram.messenger.hd.M0(2131746230, null));
        this.T = this.f51873r0.d(11, 2131232196, null, org.telegram.messenger.hd.M0(2131748990, null), true, false, null);
        org.telegram.ui.Components.sn snVar = new org.telegram.ui.Components.sn(context, this, false, this.resourceProvider);
        this.f51849f = snVar;
        snVar.getAvatarImageView().setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.sn snVar2 = this.f51849f;
        if ((!org.telegram.messenger.g0.Q1() || ((o4Var = this.parentLayout) != null && ((ActionBarLayout) o4Var).f28328b)) && !this.inPreviewMode) {
            z11 = true;
        } else {
            z11 = false;
        }
        snVar2.setOccupyStatusBar(z11);
        org.telegram.ui.Components.sn snVar3 = this.f51849f;
        long j3 = -this.f51835a;
        if (j3 < 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        snVar3.f39346b = z12;
        snVar3.setClipChildren(false);
        this.actionBar.addView(this.f51849f, 0, c8.ja.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.f51877u0) {
            this.f51849f.getAvatarImageView().setOnClickListener(new a8(this, 4));
        }
        this.O = new g91(this, context);
        jh.k kVar2 = new jh.k(this.d);
        ViewGroup viewGroup = this.d;
        dh.c cVar = this.l1;
        cVar.h = kVar2;
        cVar.f8098i = viewGroup;
        g91 g91Var = this.O;
        yw ywVar3 = this.N0;
        if (ywVar3 != null) {
            viewGroup = (ViewGroup) ywVar3.getFragmentView();
        }
        g91 g91Var2 = this.O;
        Objects.requireNonNull(g91Var2);
        this.f51863m1 = new dh.k(g91Var, viewGroup, new n40(g91Var2, 2));
        this.O.D0(new u81(this, 5));
        SpannableString spannableString = new SpannableString("#");
        qg.b c11 = qg.c.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        gv gvVar = new gv(this, org.telegram.messenger.g0.K2(org.telegram.messenger.hd.M0(2131754719, null), spannableString, "#"), org.telegram.messenger.g0.K2(org.telegram.messenger.hd.M0(2131754721, null), spannableString, "#"));
        this.f51881x = gvVar;
        gvVar.b();
        if (this.F) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        this.E = i11;
        gv gvVar2 = this.f51881x;
        if (i11 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        gvVar2.X = z13;
        i91 i91Var = new i91(this);
        this.O.setHideIfEmpty(false);
        i91Var.f58564m = false;
        i91Var.C = false;
        g91 g91Var3 = this.O;
        this.J0 = i91Var;
        g91Var3.setItemAnimator(i91Var);
        this.O.setOnScrollListener(new j91(this, 0));
        g91 g91Var4 = this.O;
        g91Var4.X1 = true;
        g91Var4.Y1 = 0;
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(g91Var4, true);
        this.L0 = xi0Var;
        this.O.setItemsEnterAnimator(xi0Var);
        this.O.setOnItemClickListener(new ux0(this, 9));
        this.O.setOnItemLongClickListener(new v81(this));
        this.O.setOnScrollListener(new j91(this, 1));
        g91 g91Var5 = this.O;
        x81 x81Var = new x81(this);
        this.G = x81Var;
        g91Var5.setLayoutManager(x81Var);
        new SparseArray();
        new HashMap();
        this.O.setAdapter(this.f51872r);
        this.O.setClipToPadding(false);
        this.O.j(new y81(this));
        t91 t91Var = new t91(this);
        this.Q = t91Var;
        z81 z81Var = new z81(this, t91Var);
        this.P = z81Var;
        z81Var.h(this.O);
        this.d.addView(this.O, c8.ja.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.O.getLayoutParams()).topMargin = -org.telegram.messenger.g0.L(100.0f);
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(getParentActivity(), this.resourceProvider, false);
        this.h = t00Var;
        this.d.addView(t00Var, org.telegram.ui.Components.t00.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final u91 f51492b;

            {
                this.f51492b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var2;
                switch (r2) {
                    case 0:
                        u91 u91Var = this.f51492b;
                        if (!u91Var.f51876t0) {
                            u91Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        u91 u91Var2 = this.f51492b;
                        u91Var2.getMessagesController().i2(-u91Var2.f51835a, null, u91Var2.g());
                        u91Var2.S0(false);
                        return;
                    case 2:
                        this.f51492b.finishPreviewFragment();
                        return;
                    case 3:
                        yw ywVar32 = this.f51492b.N0;
                        if (ywVar32 != null && (q0Var2 = ywVar32.f53662k0) != null) {
                            q0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        u91 u91Var3 = this.f51492b;
                        u91Var3.presentFragment(s81.f0(u91Var3.f51835a, 0L));
                        return;
                }
            }
        });
        this.h.f39465c.setImageResource(2131231266);
        this.h.f39465c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f39465c.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        this.h.setContentDescription(org.telegram.messenger.hd.M0(2131751702, null));
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        pzVar.setViewType(24);
        pzVar.setVisibility(8);
        pzVar.f38448x = true;
        q81 q81Var = new q81(context, 1);
        TextView textView = new TextView(context);
        q81Var.d = textView;
        if (org.telegram.messenger.hd.f24104a0) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(2131230874, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131744259, null));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131744259, null));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(2131230872, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29241y6, getResourceProvider());
        boolean z14 = org.telegram.messenger.hd.f24104a0;
        if (z14) {
            f10 = 72.0f;
        } else {
            f10 = 32.0f;
        }
        if (z14) {
            f11 = 32.0f;
        } else {
            f11 = 72.0f;
        }
        q81Var.addView(textView, c8.ja.d(-2, -2.0f, 81, f10, 0.0f, f11, 32.0f));
        this.f51864n = q81Var;
        textView.setAlpha(0.0f);
        fi.x4 x4Var = new fi.x4(this, context, pzVar);
        this.E0 = x4Var;
        try {
            x4Var.f33707b.getImageReceiver().W(2);
        } catch (Exception unused) {
        }
        this.E0.e(this.K0, this.fragmentBeginToShow);
        this.E0.d.setText(org.telegram.messenger.hd.M0(2131748138, null));
        Y0();
        this.f51864n.addView(pzVar);
        this.f51864n.addView(this.E0);
        this.d.addView(this.f51864n);
        this.O.setEmptyView(this.f51864n);
        this.f51868p0 = new eh0(context, 14);
        org.telegram.ui.Components.v41 v41Var = new org.telegram.ui.Components.v41(context);
        this.M = v41Var;
        this.f51868p0.addView(v41Var);
        this.d.addView(this.f51868p0, c8.ja.e(-1, 51, 80));
        this.M.setOnClickListener(new a91(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f51866o0 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(22.0f));
        this.f51866o0.setVisibility(4);
        this.f51868p0.addView(this.f51866o0, c8.ja.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.X0 = imageView;
        imageView.setImageResource(2131231983);
        this.X0.setContentDescription(org.telegram.messenger.hd.M0(2131752041, null));
        ImageView imageView2 = this.X0;
        int i12 = org.telegram.ui.ActionBar.j6.Ue;
        imageView2.setBackground(org.telegram.ui.ActionBar.y5.c(null, org.telegram.ui.ActionBar.y5.b(getThemedColor(i12))));
        org.telegram.ui.ActionBar.q6.s(this.X0, i12, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        this.X0.setScaleType(ImageView.ScaleType.CENTER);
        this.f51868p0.addView(this.X0, c8.ja.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.X0.setOnClickListener(new View.OnClickListener(this) {
            public final u91 f51492b;

            {
                this.f51492b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var2;
                switch (r2) {
                    case 0:
                        u91 u91Var = this.f51492b;
                        if (!u91Var.f51876t0) {
                            u91Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        u91 u91Var2 = this.f51492b;
                        u91Var2.getMessagesController().i2(-u91Var2.f51835a, null, u91Var2.g());
                        u91Var2.S0(false);
                        return;
                    case 2:
                        this.f51492b.finishPreviewFragment();
                        return;
                    case 3:
                        yw ywVar32 = this.f51492b.N0;
                        if (ywVar32 != null && (q0Var2 = ywVar32.f53662k0) != null) {
                            q0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        u91 u91Var3 = this.f51492b;
                        u91Var3.presentFragment(s81.f0(u91Var3.f51835a, 0L));
                        return;
                }
            }
        });
        this.X0.setVisibility(8);
        S0(false);
        k0 k0Var = new k0(27, context, this);
        this.f51846e = k0Var;
        if (this.N0 == null) {
            this.d.addView(k0Var, c8.ja.e(-1, -1, 119));
        }
        q91 q91Var = new q91(this, context);
        this.f51875s0 = q91Var;
        q91Var.setVisibility(8);
        this.f51846e.addView(this.f51875s0, c8.ja.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        q91 q91Var2 = this.f51875s0;
        int i13 = org.telegram.ui.ActionBar.j6.f28849d6;
        org.telegram.ui.ActionBar.q6.h(i13, q91Var2, getResourceProvider());
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().F0(this.f51835a, true, null, true, false, 0);
        org.telegram.ui.Components.vr vrVar = new org.telegram.ui.Components.vr(context);
        this.V0 = vrVar;
        vrVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
        fh.g c12 = cVar.c(this.V0, c8.g0.n(this.resourceProvider), false);
        org.telegram.messenger.i20.r(c12, org.telegram.messenger.g0.L(24.0f), 7.0f);
        this.V0.setBlurredBackground(c12);
        this.V0.setOnAnimatedHeightChangedListener(new u81(this, 0));
        this.d.addView(this.V0, c8.ja.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            zh.d dVar = new zh.d(g10, this);
            this.S0 = dVar;
            this.V0.addView(dVar.b(), c8.ja.o(-1, 40));
            this.V0.h(3, this.S0.b());
            this.V0.g(this.S0.b());
            zh.d dVar2 = this.S0;
            dVar2.f61420m = new v81(this);
            TLRPC.ChatFull chatFull = this.K;
            dVar2.f61417j = chatFull;
            if (chatFull != null) {
                dVar2.d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.G0 = frameLayout;
            this.V0.addView(frameLayout);
            this.V0.h(4, this.G0);
            this.V0.g(this.G0);
            this.V0.i(this.G0, true, false);
            x8 x8Var = new x8(this, context, this);
            this.H0 = x8Var;
            this.G0.addView(x8Var);
            this.V0.setCallFragmentContextView(this.H0);
        }
        FrameLayout.LayoutParams c13 = c8.ja.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c13.topMargin = org.telegram.messenger.g0.f23605m;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c13);
        }
        C0();
        rv rvVar = new rv(11, context, this);
        this.Q0 = rvVar;
        rvVar.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i13), 100)));
        this.Q0.setFocusable(false);
        this.Q0.setImportantForAccessibility(2);
        this.Q0.setOnClickListener(new View.OnClickListener(this) {
            public final u91 f51492b;

            {
                this.f51492b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var2;
                switch (r2) {
                    case 0:
                        u91 u91Var = this.f51492b;
                        if (!u91Var.f51876t0) {
                            u91Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        u91 u91Var2 = this.f51492b;
                        u91Var2.getMessagesController().i2(-u91Var2.f51835a, null, u91Var2.g());
                        u91Var2.S0(false);
                        return;
                    case 2:
                        this.f51492b.finishPreviewFragment();
                        return;
                    case 3:
                        yw ywVar32 = this.f51492b.N0;
                        if (ywVar32 != null && (q0Var2 = ywVar32.f53662k0) != null) {
                            q0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        u91 u91Var3 = this.f51492b;
                        u91Var3.presentFragment(s81.f0(u91Var3.f51835a, 0L));
                        return;
                }
            }
        });
        this.Q0.setFitsSystemWindows(true);
        this.W = true;
        if (this.inPreviewMode && org.telegram.messenger.g0.Q1()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) it.next();
                if (e2Var instanceof yw) {
                    yw ywVar4 = (yw) e2Var;
                    if (ywVar4.t4()) {
                        org.telegram.messenger.ur urVar = ywVar4.f53697r2;
                        if (urVar.f26861a == j3) {
                            this.R0 = urVar.f26862b;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            Z0(false, false);
        }
        S0(false);
        T0();
        if (org.telegram.messenger.t3.R(g())) {
            getMessagesController().G0().a(j3, new r3(this, 26));
        }
        View view = this.fragmentView;
        v81 v81Var = new v81(this);
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.a0.i(view, v81Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i11 = org.telegram.messenger.ns.T;
        long j3 = this.f51835a;
        if (i7 == i11) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.K) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f28052id == j3) {
                S0(false);
                zh.d dVar = this.S0;
                if (dVar != null) {
                    dVar.f61417j = chatFull2;
                    dVar.d(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                D0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i7 == org.telegram.messenger.ns.f25592v5) {
            S0(false);
        } else if (i7 == org.telegram.messenger.ns.f25551p3) {
            if (j3 == (-((Long) objArr[2]).longValue())) {
                this.Y = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i7 == org.telegram.messenger.ns.f25559q5) {
            if (j3 == ((Long) objArr[0]).longValue()) {
                Z0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    C0();
                }
                E0();
            }
        } else if (i7 == org.telegram.messenger.ns.f25560r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.np.D8;
            if (intValue == 8192) {
                S0(false);
            }
            if ((intValue & 512) > 0) {
                getMessagesController().f25386r7.y(j3, false);
                boolean canScrollVertically = this.O.canScrollVertically(-1);
                Z0(true, false);
                if (!canScrollVertically) {
                    this.G.n0(0);
                }
            }
        } else if (i7 == org.telegram.messenger.ns.f25567s) {
            Z0(false, false);
        } else if (i7 == org.telegram.messenger.ns.f25596w2) {
            Long l10 = (Long) objArr[0];
            if (j3 == l10.longValue()) {
                this.I0 = getMessagesController().g1(l10.longValue(), false, null);
                x8 x8Var = this.H0;
                if (x8Var != null) {
                    x8Var.a(!this.fragmentBeginToShow);
                }
                D0(false);
            }
        } else if (i7 == org.telegram.messenger.ns.f25493f0) {
            Z0(false, false);
            S0(true);
        } else if (i7 != org.telegram.messenger.ns.f25566r5 && i7 == org.telegram.messenger.ns.f25573t) {
            removeSelfFromStack(true);
        }
        if (i7 == org.telegram.messenger.ns.f25505h0 && getParentActivity() != null && this.inPreviewMode && org.telegram.messenger.g0.Q1()) {
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue == (-j3) && !booleanValue) {
                if (this.R0 != longValue2) {
                    this.R0 = longValue2;
                    Z0(false, false);
                }
            } else if (this.R0 != 0) {
                this.R0 = 0L;
                Z0(false, false);
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final TLRPC.Chat g() {
        return getMessagesController().M0(Long.valueOf(this.f51835a));
    }

    @Override
    public final org.telegram.messenger.r3 getGroupCall() {
        org.telegram.messenger.r3 r3Var = this.I0;
        if (r3Var != null && (r3Var.f26216b instanceof TLRPC.TL_groupCall)) {
            return r3Var;
        }
        return null;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        q91 q91Var = this.f51875s0;
        if (q91Var != null && q91Var.f50509a0 != null) {
            int i7 = org.telegram.ui.Cells.x3.h;
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        int i7;
        if (this.f51876t0) {
            i7 = org.telegram.ui.ActionBar.j6.f28849d6;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.f29129s8;
        }
        int themedColor = getThemedColor(i7);
        if (this.actionBar.x()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f29205w8);
        }
        if (i0.a.h(themedColor) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final TLRPC.User j() {
        return null;
    }

    @Override
    public final ui.f k() {
        return this.f51857i1;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f51839b0.isEmpty()) {
            if (z10) {
                G0();
                return false;
            }
        } else if (this.f51876t0) {
            if (z10) {
                this.actionBar.A(this.f51870q0.U(false));
            }
        } else {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.n(true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.np messagesController = getMessagesController();
        long j3 = this.f51835a;
        messagesController.V2(0, j3, true);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25592v5);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25551p3);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.T);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25559q5);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25560r);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25567s);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25596w2);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25493f0);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25566r5);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25573t);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25505h0);
        Z0(false, false);
        n11.t(this.currentAccount);
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j3));
        if (org.telegram.messenger.t3.T(M0)) {
            getMessagesController().W4(M0, this.classGuid, false, null);
        }
        Long valueOf = Long.valueOf(j3);
        HashSet hashSet = f51834r1;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Long.valueOf(j3));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().j1(-j3);
            getConnectionsManager().sendRequest(getnotifyexceptions, null);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        this.P0.e();
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25592v5);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25551p3);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.T);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25559q5);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25560r);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25567s);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25596w2);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25493f0);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25566r5);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25573t);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25505h0);
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f51835a));
        if (org.telegram.messenger.t3.T(M0)) {
            getMessagesController().W4(M0, this.classGuid, true, null);
        }
        super.onFragmentDestroy();
        yw ywVar = this.N0;
        if (ywVar != null && ywVar.H3 != null) {
            ywVar.getActionBar().setSearchAvatarImageView(null);
            this.N0.H3.N = true;
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        LongSparseIntArray longSparseIntArray = getMessagesController().f25386r7.f24015f;
        long j3 = this.f51835a;
        int i7 = 0;
        int i10 = longSparseIntArray.get(j3, 0) - 1;
        if (i10 >= 0) {
            i7 = i10;
        }
        longSparseIntArray.put(j3, i7);
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.h00 h00Var = getMessagesController().f25386r7;
        LongSparseIntArray longSparseIntArray = h00Var.f24015f;
        long j3 = this.f51835a;
        longSparseIntArray.put(j3, longSparseIntArray.get(j3, 0) + 1);
        h00Var.y(j3, true);
        this.H = false;
        org.telegram.messenger.g0.a4(this.O);
        this.H = true;
        setBulletinDelegate(new y8(this, 9));
        if (this.inPreviewMode && !getMessagesController().t2(-j3)) {
            finishFragment();
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f10) {
        if (org.telegram.messenger.gz.o() != 0 && this.U0) {
            P0(f10);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int b10;
        super.onThemeColorsChanged();
        ui.c cVar = this.f51861k1;
        if (cVar != null) {
            cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
        }
        if (this.X0 != null && (b10 = org.telegram.ui.ActionBar.y5.b(getThemedColor(org.telegram.ui.ActionBar.j6.Ue))) != this.f51871q1) {
            this.f51871q1 = b10;
            org.telegram.ui.ActionBar.j6.H1(this.X0.getBackground(), b10, true);
        }
        for (int i7 = 0; i7 < 2; i7++) {
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.I(getThemedColor(org.telegram.ui.ActionBar.j6.G8), true);
            this.actionBar.J(getThemedColor(org.telegram.ui.ActionBar.j6.E8), false, true);
            this.actionBar.J(getThemedColor(org.telegram.ui.ActionBar.j6.F8), true, true);
            this.actionBar.K(getThemedColor(org.telegram.ui.ActionBar.j6.I5), true);
        }
        rv rvVar = this.Q0;
        if (rvVar != null && (rvVar.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.Q0.getForeground()).setColor(i0.a.o(getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6), 100));
        }
        T0();
        try {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setActionModeColor(getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
            }
            gv gvVar = this.f51881x;
            if (gvVar != null) {
                gvVar.i();
            }
            if (this.actionBar != null && this.f51843c1) {
                X0();
            }
            NumberTextView numberTextView = this.f51844d0;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f29243y8));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.f51870q0;
            if (q0Var != null && q0Var.getSearchField() != null) {
                this.f51870q0.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ne));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        uv uvVar;
        rv rvVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (rvVar = this.Q0) != null) {
            if (rvVar.getParent() != null) {
                ((ViewGroup) this.Q0.getParent()).removeView(this.Q0);
            }
            this.Q0.setBackground(null);
        }
        if (z10) {
            D0(false);
        }
        this.P0.e();
        if (!z10) {
            if (this.f51877u0 && this.I) {
                removeSelfFromStack();
                yw ywVar = this.M0;
                if (ywVar != null) {
                    ywVar.removeSelfFromStack();
                }
            } else if (this.J) {
                removeSelfFromStack();
                yw ywVar2 = this.N0;
                if (ywVar2 != null && (uvVar = ywVar2.H3) != null && uvVar.c()) {
                    this.N0.H3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        rv rvVar = this.Q0;
        if (rvVar != null && rvVar.getVisibility() == 0) {
            if (z10) {
                this.Q0.setAlpha(1.0f - f10);
            } else {
                this.Q0.setAlpha(f10);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.P0.d();
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.U0 = true;
            O0(true);
            return;
        }
        this.U0 = false;
        O0(false);
        P0(1.0f);
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.sn r() {
        return this.f51849f;
    }

    @Override
    public final void setPreviewOpenedProgress(float f10) {
        org.telegram.ui.Components.sn snVar = this.f51849f;
        if (snVar != null) {
            snVar.setAlpha(f10);
            this.f51873r0.setAlpha(f10);
            org.telegram.ui.ActionBar.q0 q0Var = this.f51870q0;
            if (q0Var != null) {
                q0Var.setAlpha(f10);
            }
            this.actionBar.getBackButton().setAlpha(f10);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f10) {
        org.telegram.ui.Components.sn snVar = this.f51849f;
        if (snVar != null) {
            snVar.setAlpha(f10);
            this.f51849f.setTranslationX((1.0f - f10) * org.telegram.messenger.g0.L(40.0f));
        }
    }

    @Override
    public final void v() {
        this.O.y0(0);
    }

    @Override
    public final void s() {
    }

    @Override
    public final void l(int i7, int i10, boolean z10, int i11, boolean z11, int i12) {
    }
}
