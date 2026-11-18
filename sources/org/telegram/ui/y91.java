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
public class y91 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs, org.telegram.ui.Components.zg, ke0 {
    public static final HashSet f54108s1 = new HashSet();
    public boolean A0;
    public HashSet B0;
    public boolean C0;
    public boolean D0;
    public int E;
    public fi.v4 E0;
    public boolean F;
    public o91 F0;
    public b91 G;
    public FrameLayout G0;
    public boolean H;
    public x8 H0;
    public boolean I;
    public org.telegram.messenger.t3 I0;
    public boolean J;
    public m91 J0;
    public TLRPC.ChatFull K;
    public boolean K0;
    public boolean L;
    public org.telegram.ui.Components.fj0 L0;
    public org.telegram.ui.Components.g51 M;
    public cx M0;
    public int N;
    public cx N0;
    public k91 O;
    public boolean O0;
    public d91 P;
    public final h2.f P0;
    public x91 Q;
    public uv Q0;
    public org.telegram.ui.ActionBar.z0 R;
    public long R0;
    public org.telegram.ui.ActionBar.z0 S;
    public zh.d S0;
    public org.telegram.ui.ActionBar.z0 T;
    public float T0;
    public org.telegram.ui.ActionBar.z0 U;
    public boolean U0;
    public org.telegram.ui.ActionBar.z0 V;
    public org.telegram.ui.Components.cs V0;
    public boolean W;
    public final boolean W0;
    public float X;
    public ImageView X0;
    public TL_stories.TL_premium_boostsStatus Y;
    public float Y0;
    public long Z;
    public ValueAnimator Z0;
    public final long f54109a;
    public boolean f54110a0;
    public boolean f54111a1;
    public final ArrayList f54112b;
    public final HashSet f54113b0;
    public org.telegram.ui.Components.f71 f54114b1;
    public int f54115c;
    public boolean f54116c0;
    public boolean f54117c1;
    public g91 d;
    public NumberTextView f54118d0;
    public View f54119d1;
    public k0 f54120e;
    public org.telegram.ui.ActionBar.r0 f54121e0;
    public boolean f54122e1;
    public org.telegram.ui.Components.ao f54123f;
    public org.telegram.ui.ActionBar.r0 f54124f0;
    public int f54125f1;
    public org.telegram.ui.ActionBar.r0 f54126g0;
    public int f54127g1;
    public org.telegram.ui.Components.a10 h;
    public org.telegram.ui.ActionBar.r0 f54128h0;
    public int f54129h1;
    public org.telegram.ui.ActionBar.r0 f54130i0;
    public final dh.g f54131i1;
    public org.telegram.ui.ActionBar.r0 f54132j0;
    public final ui.f f54133j1;
    public org.telegram.ui.ActionBar.z0 f54134k0;
    public final ui.f f54135k1;
    public org.telegram.ui.ActionBar.z0 f54136l0;
    public final ui.c l1;
    public org.telegram.ui.ActionBar.z0 m0;
    public final dh.c f54137m1;
    public u81 f54138n;
    public org.telegram.ui.ActionBar.r0 f54139n0;
    public dh.k n1;
    public RadialProgressView f54140o0;
    public final ArrayList f54141o1;
    public hh0 f54142p0;
    public final RectF f54143p1;
    public org.telegram.ui.ActionBar.r0 f54144q0;
    public final RectF f54145q1;
    public final p91 f54146r;
    public org.telegram.ui.ActionBar.r0 f54147r0;
    public int f54148r1;
    public final org.telegram.messenger.e00 f54149s;
    public u91 f54150s0;
    public boolean f54151t0;
    public final boolean f54152u0;
    public final boolean f54153v0;
    public z91 f54154w;
    public final boolean f54155w0;
    public jv f54156x;
    public final boolean f54157x0;
    public int f54158y;
    public final boolean f54159y0;
    public String f54160z0;

    public y91(Bundle bundle) {
        super(bundle);
        this.f54112b = new ArrayList();
        new ArrayList();
        this.f54146r = new p91(this);
        this.f54158y = 0;
        this.F = true;
        this.H = true;
        this.W = true;
        this.X = 0.0f;
        this.f54113b0 = new HashSet();
        this.C0 = false;
        this.P0 = new h2.f(new int[]{org.telegram.messenger.ks.s5});
        this.T0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f54141o1 = arrayList;
        RectF rectF = new RectF();
        this.f54143p1 = rectF;
        RectF rectF2 = new RectF();
        this.f54145q1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j3 = this.arguments.getLong("chat_id", 0L);
        this.f54109a = j3;
        this.f54152u0 = this.arguments.getBoolean("for_select", false);
        this.f54153v0 = this.arguments.getBoolean("forward_to", false);
        this.f54159y0 = this.arguments.getBoolean("bot_share_to", false);
        this.f54155w0 = this.arguments.getBoolean("quote", false);
        this.f54157x0 = this.arguments.getBoolean("reply_to", false);
        this.f54160z0 = this.arguments.getString("voicechat", null);
        this.A0 = this.arguments.getBoolean("videochat", false);
        this.f54149s = getMessagesController().f25771t7;
        this.W0 = !org.telegram.messenger.f3.w("topics_end_reached_", j3, getUserConfig().k(), false);
        ui.c cVar = new ui.c();
        this.l1 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f54131i1 = new dh.g(false);
            this.f54133j1 = new ui.f(null);
            ui.f fVar = new ui.f(null);
            this.f54135k1 = fVar;
            dh.c cVar2 = new dh.c(fVar, fVar, fVar);
            this.f54137m1 = cVar2;
            cVar2.f8382k = true;
            return;
        }
        this.f54131i1 = null;
        this.f54133j1 = null;
        this.f54135k1 = null;
        this.f54137m1 = new dh.c(cVar, cVar, cVar);
    }

    public static org.telegram.ui.ActionBar.h2 I0(org.telegram.messenger.mp mpVar, org.telegram.messenger.tr trVar, Bundle bundle) {
        long j3 = bundle.getLong("chat_id");
        if (j3 != 0) {
            TLRPC.Dialog U0 = mpVar.U0(-j3);
            if (U0 != null && U0.view_forum_as_messages) {
                return new bn(bundle);
            }
            TLRPC.ChatFull P0 = mpVar.P0(j3);
            if (P0 == null) {
                P0 = trVar.F0(j3, true, new CountDownLatch(1), false, false, 0);
            }
            if (P0 != null && P0.view_forum_as_messages) {
                return new bn(bundle);
            }
        }
        return new y91(bundle);
    }

    public static org.telegram.ui.ActionBar.h2 J0(LaunchActivity launchActivity, Bundle bundle) {
        return I0(org.telegram.messenger.mp.u1(launchActivity.P), org.telegram.messenger.tr.a0(launchActivity.P), bundle);
    }

    public static void M0(org.telegram.ui.bn r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y91.M0(org.telegram.ui.bn):void");
    }

    public static boolean Z(y91 y91Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(y91Var.currentAccount).f25660g7.edit();
        edit.putLong("dialog_join_requested_time_" + (-y91Var.f54109a), System.currentTimeMillis()).commit();
        Activity parentActivity = y91Var.getParentActivity();
        boolean V = org.telegram.messenger.v3.V(y91Var.g());
        int i7 = org.telegram.ui.Components.p70.f38303u1;
        org.telegram.ui.Components.p70.K0(parentActivity, y91Var, org.telegram.ui.Components.lc.b0(y91Var), V);
        y91Var.S0(true);
        return false;
    }

    public static void a0(y91 y91Var, View view) {
        long j3;
        long j10 = y91Var.f54109a;
        if (y91Var.getParentLayout() != null && !((ActionBarLayout) y91Var.getParentLayout()).y() && (view instanceof v91)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((v91) view).O;
            long j11 = -j10;
            boolean E2 = y91Var.getMessagesController().E2(j11);
            if (tL_forumTopic == null) {
                j3 = 0;
            } else if (E2) {
                j3 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
            } else {
                j3 = tL_forumTopic.f28457id;
            }
            long j12 = j3;
            if (y91Var.f54152u0) {
                z91 z91Var = y91Var.f54154w;
                if (z91Var != null) {
                    ba1 ba1Var = z91Var.f54465a;
                    Bundle bundle = new Bundle();
                    ea1 ea1Var = ba1Var.f45807a;
                    bundle.putLong("dialog_id", ea1Var.f47191c);
                    bundle.putLong("topic_id", tL_forumTopic.f28457id);
                    bundle.putBoolean("exception", true);
                    jx0 jx0Var = new jx0(bundle, null);
                    jx0Var.f49117s = new aj0(24, ba1Var, tL_forumTopic);
                    ea1Var.presentFragment(jx0Var);
                }
                cx cxVar = y91Var.M0;
                if (cxVar != null) {
                    cxVar.a4(j11, j12, true, y91Var);
                }
            } else if (y91Var.f54113b0.size() > 0) {
                y91Var.R0(view);
            } else {
                if (y91Var.inPreviewMode && org.telegram.messenger.g0.Q1()) {
                    for (org.telegram.ui.ActionBar.h2 h2Var : y91Var.getParentLayout().getFragmentStack()) {
                        if (h2Var instanceof cx) {
                            cx cxVar2 = (cx) h2Var;
                            if (cxVar2.x4()) {
                                org.telegram.messenger.sr srVar = cxVar2.f46742r2;
                                if (srVar.f26847a == j11 && srVar.f26848b == j12) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    y91Var.R0 = j12;
                    y91Var.Z0(false, false);
                }
                qg.c.n(y91Var, j10, tL_forumTopic, 0);
            }
        }
    }

    public static boolean b0(y91 y91Var, View view, float f10) {
        if (y91Var.f54152u0 || y91Var.getParentLayout() == null || ((ActionBarLayout) y91Var.getParentLayout()).y()) {
            return false;
        }
        if (!y91Var.actionBar.y() && !org.telegram.messenger.g0.Q1() && (view instanceof v91)) {
            v91 v91Var = (v91) view;
            if (v91Var.Z(f10)) {
                y91Var.Q0(v91Var);
                y91Var.O.I0(true);
                y91Var.O.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        y91Var.R0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void f0(y91 y91Var, boolean z10) {
        float f10;
        boolean z11;
        xv xvVar;
        y91Var.f54151t0 = z10;
        ValueAnimator valueAnimator = y91Var.Z0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            y91Var.Z0.cancel();
        }
        if (y91Var.f54114b1 == null) {
            org.telegram.ui.Components.f71 i7 = y91Var.f54150s0.i(8, false);
            y91Var.f54114b1 = i7;
            if (y91Var.N0 != null) {
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, i7, y91Var.getResourceProvider());
            }
            y91Var.f54120e.addView(y91Var.f54114b1, c8.ma.c(44.0f, -1));
        }
        float f11 = y91Var.X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        y91Var.Z0 = ValueAnimator.ofFloat(f11, f10);
        org.telegram.messenger.g0.X3(y91Var.f54150s0, false, 1.0f, true, true);
        cx cxVar = y91Var.N0;
        if (cxVar != null && (xvVar = cxVar.H3) != null) {
            xvVar.N = !z10;
        }
        if (!z10 && y91Var.f54150s0.getVisibility() == 0 && y91Var.f54150s0.getAlpha() == 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        y91Var.f54111a1 = z11;
        y91Var.Z0.addUpdateListener(new iz0(y91Var, 13));
        y91Var.f54150s0.setVisibility(0);
        if (!z10) {
            y91Var.f54147r0.setVisibility(0);
        } else {
            org.telegram.messenger.g0.Z2(y91Var.getParentActivity(), y91Var.classGuid);
            y91Var.U0(false);
        }
        y91Var.Z0.addListener(new i91(y91Var, z10, 0));
        y91Var.Z0.setDuration(200L);
        y91Var.Z0.setInterpolator(org.telegram.ui.Components.lr.f37208f);
        y91Var.Z0.start();
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25197t4, Boolean.TRUE);
    }

    @Override
    public final ui.f B() {
        return this.f54135k1;
    }

    public final void B0() {
        dh.g gVar;
        View view;
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        int i7;
        if (Build.VERSION.SDK_INT >= 31 && (gVar = this.f54131i1) != null) {
            int L = org.telegram.messenger.g0.L(48.0f);
            int L2 = org.telegram.messenger.g0.L(48.0f) + ((int) this.V0.d(org.telegram.messenger.g0.L(14.0f)));
            cx cxVar = this.N0;
            if (cxVar != null) {
                view = cxVar.fragmentView;
            } else {
                view = this.fragmentView;
            }
            if (cxVar != null) {
                kVar = cxVar.getActionBar();
            } else {
                kVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.f54129h1) - org.telegram.messenger.g0.L(8.0f);
            this.f54143p1.set(0.0f, -L, view.getMeasuredWidth(), kVar.getMeasuredHeight() + L + L2);
            RectF rectF = this.f54145q1;
            rectF.set(0.0f, measuredHeight - org.telegram.messenger.g0.L(56.0f), view.getMeasuredWidth(), measuredHeight);
            if (org.telegram.messenger.pc.e(262144)) {
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
            gVar.g(i7, this.f54141o1);
            gVar.e(this.n1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final void C0() {
        b91 b91Var;
        org.telegram.messenger.e00 e00Var = this.f54149s;
        long j3 = this.f54109a;
        if (!e00Var.e(j3) && (b91Var = this.G) != null) {
            int N0 = b91Var.N0();
            if (this.f54112b.isEmpty() || N0 >= this.f54146r.b() - 5) {
                e00Var.o(j3);
            }
            E0();
        }
    }

    public final void D0(boolean z10) {
        String str;
        org.telegram.messenger.mp messagesController = getMessagesController();
        long j3 = this.f54109a;
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
        TLRPC.ChatFull P0 = getMessagesController().P0(j3);
        org.telegram.messenger.t3 t3Var = this.I0;
        if (t3Var != null && ((str = this.f54160z0) != null || this.A0)) {
            org.telegram.ui.Components.voip.b2.l(O0, str, false, Boolean.valueOf(!t3Var.f26937b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f54160z0 = null;
            this.A0 = false;
        } else if (this.f54160z0 != null && z10 && P0 != null && P0.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.f3.n(null, 2131748721, org.telegram.ui.Components.lc.b0(this), 2131624080, 36);
            this.f54160z0 = null;
        }
    }

    @Override
    public final org.telegram.ui.Components.au0 E() {
        return this.d;
    }

    public final void E0() {
        boolean z10;
        org.telegram.messenger.e00 e00Var = this.f54149s;
        a0.h hVar = e00Var.f23623a;
        LongSparseIntArray longSparseIntArray = e00Var.f23625c;
        long j3 = this.f54109a;
        if (longSparseIntArray.get(j3, 0) == 1 && (hVar.f(j3) == null || ((ArrayList) hVar.f(j3)).isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K0 = z10;
        if (this.E0 != null) {
            ArrayList arrayList = this.f54112b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((q91) arrayList.get(0)).f51182c != null && ((q91) arrayList.get(0)).f51182c.f28457id == 1)) {
                this.E0.e(this.K0, this.fragmentBeginToShow);
            }
        }
        k91 k91Var = this.O;
        if (k91Var != null) {
            k91Var.K0(k91Var.w1());
        }
        U0(true);
    }

    public final void F0() {
        int i7;
        float f10;
        float f11;
        cx cxVar = this.N0;
        float f12 = 0.0f;
        if (cxVar != null) {
            int L = org.telegram.messenger.g0.L(14.0f);
            org.telegram.ui.Components.cs csVar = cxVar.L1;
            if (csVar != null) {
                f10 = csVar.d(L);
            } else {
                f10 = 0.0f;
            }
            float f13 = f10 + 0.0f;
            org.telegram.ui.Components.cs csVar2 = this.V0;
            if (csVar2 != null) {
                float L2 = org.telegram.messenger.g0.L(7.0f);
                org.telegram.ui.Components.cs csVar3 = this.N0.L1;
                if (csVar3 != null) {
                    f11 = csVar3.getMetadata().f57673c.f57683a;
                } else {
                    f11 = 0.0f;
                }
                csVar2.setTranslationY(f13 - (f11 * L2));
                org.telegram.ui.Components.cs csVar4 = this.V0;
                int L3 = org.telegram.messenger.g0.L(14.0f);
                int L4 = org.telegram.messenger.g0.L(7.0f);
                org.telegram.ui.Components.cs csVar5 = this.N0.L1;
                if (csVar5 != null) {
                    f12 = csVar5.getMetadata().f57673c.f57683a;
                }
                f12 = csVar4.d(org.telegram.messenger.g0.W1(f12, L3, L4)) + f13;
            } else {
                f12 = f13;
            }
        } else {
            org.telegram.ui.Components.cs csVar6 = this.V0;
            if (csVar6 != null) {
                f12 = 0.0f + csVar6.d(org.telegram.messenger.g0.L(14.0f));
            }
        }
        int i10 = this.f54129h1 + this.f54125f1;
        if (this.W) {
            i7 = org.telegram.messenger.g0.L(51.0f);
        } else {
            i7 = 0;
        }
        this.O.setPadding(0, (int) f12, 0, i10 + i7);
    }

    public final void G0() {
        this.f54113b0.clear();
        this.actionBar.x();
        org.telegram.messenger.g0.Z3(this.O);
        V0();
    }

    public final void H0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String K0 = org.telegram.messenger.gd.K0(hashSet.size(), "DeleteTopics");
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = K0;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            u1Var.U = org.telegram.messenger.gd.a0(null, null, 2131751487, this.f54149s.f(this.f54109a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            u1Var.U = org.telegram.messenger.gd.M0(2131751486, null);
        }
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new a1.d(this, hashSet, arrayList, runnable, 22));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new l60(17));
        u1Var.show();
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29637q7, getResourceProvider());
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
        bundle.putLong("chat_id", this.f54109a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f54123f.getSharedMediaPreloader());
        profileActivity.d5(this.K);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f54123f.getAvatarImageView().getImageReceiver().J() && z10) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        profileActivity.j5(i7);
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
            org.telegram.ui.Components.g51 g51Var = this.M;
            if (i7 == 0) {
                i10 = org.telegram.ui.ActionBar.n6.f29682sf;
            } else {
                i10 = org.telegram.ui.ActionBar.n6.f29637q7;
            }
            g51Var.setTextColorKey(i10);
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
        if (org.telegram.messenger.bz.o() == 0) {
            return;
        }
        g91 g91Var = this.d;
        if (g91Var != null) {
            if (z10) {
                g91Var.setLayerType(2, null);
                g91Var.setClipChildren(false);
                g91Var.setClipToPadding(false);
            } else {
                g91Var.setLayerType(0, null);
                g91Var.setClipChildren(true);
                g91Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void P0(float f10) {
        if (org.telegram.messenger.bz.o() != 0) {
            this.T0 = f10;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            k91 k91Var = this.O;
            if (k91Var != null) {
                float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, this.T0, 0.05f, 1.0f);
                k91Var.setPivotX(0.0f);
                k91Var.setPivotY(0.0f);
                k91Var.setScaleX(t6);
                k91Var.setScaleY(t6);
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
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232566, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = t2Var.O;
        org.telegram.ui.Components.po poVar = new org.telegram.ui.Components.po(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new f91(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(poVar.f38508f);
        poVar.f38516o = 1;
        long j10 = this.f54109a;
        long j11 = -j10;
        poVar.e(j11, tL_forumTopic.f28457id, null);
        if (org.telegram.messenger.v3.y(15, g())) {
            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                z0Var.j(org.telegram.messenger.gd.M0(2131751441, null), 2131232415, null);
            } else {
                z0Var.j(org.telegram.messenger.gd.M0(2131751442, null), 2131232295, null);
            }
            z0Var.setMinimumWidth(160);
            z10 = false;
            z0Var.setOnClickListener(new View.OnClickListener(this) {
                public final y91 f45514b;

                {
                    this.f45514b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            y91 y91Var = this.f45514b;
                            y91Var.D0 = true;
                            y91Var.O0 = true;
                            org.telegram.messenger.e00 e00Var = y91Var.f54149s;
                            long j12 = y91Var.f54109a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            e00Var.t(j12, tL_forumTopic2.f28457id, !tL_forumTopic2.pinned, y91Var);
                            y91Var.finishPreviewFragment();
                            return;
                        case 1:
                            y91 y91Var2 = this.f45514b;
                            y91Var2.O0 = true;
                            org.telegram.messenger.e00 e00Var2 = y91Var2.f54149s;
                            long j13 = y91Var2.f54109a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            e00Var2.z(tL_forumTopic3.f28457id, j13, true ^ tL_forumTopic3.closed);
                            y91Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f28457id));
                            y91 y91Var3 = this.f45514b;
                            y91Var3.H0(hashSet, new y81(y91Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(z0Var);
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(getParentActivity(), z10, z10);
        if (getMessagesController().u2(j11, tL_forumTopic.f28457id, null)) {
            z0Var2.j(org.telegram.messenger.gd.M0(2131743612, null), 2131232258, null);
        } else {
            z0Var2.j(org.telegram.messenger.gd.M0(2131748122, null), 2131232414, null);
        }
        z0Var2.setMinimumWidth(160);
        z0Var2.setOnClickListener(new fi.j5(this, tL_forumTopic, (Serializable) r32, b10, 6));
        boolean z11 = false;
        r32[0].addView(z0Var2);
        if (org.telegram.messenger.v3.i(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                z0Var3.j(org.telegram.messenger.gd.M0(2131745889, null), 2131232408, null);
            } else {
                z0Var3.j(org.telegram.messenger.gd.M0(2131752028, null), 2131232406, null);
            }
            z0Var3.setMinimumWidth(160);
            z0Var3.setOnClickListener(new View.OnClickListener(this) {
                public final y91 f45514b;

                {
                    this.f45514b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            y91 y91Var = this.f45514b;
                            y91Var.D0 = true;
                            y91Var.O0 = true;
                            org.telegram.messenger.e00 e00Var = y91Var.f54149s;
                            long j12 = y91Var.f54109a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            e00Var.t(j12, tL_forumTopic2.f28457id, !tL_forumTopic2.pinned, y91Var);
                            y91Var.finishPreviewFragment();
                            return;
                        case 1:
                            y91 y91Var2 = this.f45514b;
                            y91Var2.O0 = true;
                            org.telegram.messenger.e00 e00Var2 = y91Var2.f54149s;
                            long j13 = y91Var2.f54109a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            e00Var2.z(tL_forumTopic3.f28457id, j13, true ^ tL_forumTopic3.closed);
                            y91Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f28457id));
                            y91 y91Var3 = this.f45514b;
                            y91Var3.H0(hashSet, new y81(y91Var3, 3));
                            return;
                    }
                }
            });
            z11 = false;
            r32[0].addView(z0Var3);
        }
        if (org.telegram.messenger.v3.e(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(getParentActivity(), z11, true);
            z0Var4.j(org.telegram.messenger.gd.K0(1, "DeleteTopics"), 2131232110, null);
            z0Var4.c(org.telegram.ui.ActionBar.n6.f29637q7, org.telegram.ui.ActionBar.n6.f29617p7);
            z0Var4.setMinimumWidth(160);
            z0Var4.setOnClickListener(new View.OnClickListener(this) {
                public final y91 f45514b;

                {
                    this.f45514b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            y91 y91Var = this.f45514b;
                            y91Var.D0 = true;
                            y91Var.O0 = true;
                            org.telegram.messenger.e00 e00Var = y91Var.f54149s;
                            long j12 = y91Var.f54109a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            e00Var.t(j12, tL_forumTopic2.f28457id, !tL_forumTopic2.pinned, y91Var);
                            y91Var.finishPreviewFragment();
                            return;
                        case 1:
                            y91 y91Var2 = this.f45514b;
                            y91Var2.O0 = true;
                            org.telegram.messenger.e00 e00Var2 = y91Var2.f54149s;
                            long j13 = y91Var2.f54109a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            e00Var2.z(tL_forumTopic3.f28457id, j13, true ^ tL_forumTopic3.closed);
                            y91Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f28457id));
                            y91 y91Var3 = this.f45514b;
                            y91Var3.H0(hashSet, new y81(y91Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(z0Var4);
        }
        boolean E2 = getMessagesController().E2(j11);
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
            this.parentLayout.getOverlayContainerView().addView(this.Q0, c8.ma.c(-1.0f, -1));
        }
        bn bnVar = new bn(a8.p0.j(j10, "chat_id"));
        if (E2) {
            j3 = org.telegram.messenger.n5.o(t2Var.O.from_id);
        } else {
            j3 = t2Var.O.f28457id;
        }
        qg.c.a(bnVar, org.telegram.messenger.sr.a(j11, j3));
        presentFragmentAsPreviewWithMenu(bnVar, r32[0]);
    }

    public final void R0(android.view.View r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y91.R0(android.view.View):void");
    }

    public final void S0(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y91.S0(boolean):void");
    }

    public final void T0() {
        RadialProgressView radialProgressView = this.f54140o0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29682sf));
        this.h.updateColors();
        hh0 hh0Var = this.f54142p0;
        int i7 = org.telegram.ui.ActionBar.n6.f29396d6;
        hh0Var.setBackgroundColor(getThemedColor(i7));
        this.actionBar.setActionModeColor(getThemedColor(i7));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29676s8));
        }
        this.f54150s0.setBackgroundColor(getThemedColor(i7));
    }

    public final void U0(boolean z10) {
        boolean z11;
        if (this.R == null) {
            return;
        }
        org.telegram.messenger.mp messagesController = getMessagesController();
        long j3 = this.f54109a;
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
        int i7 = 0;
        if (!org.telegram.messenger.v3.r0(getMessagesController().O0(Long.valueOf(j3))) && org.telegram.messenger.v3.w(15, O0) && !this.f54151t0 && !this.f54152u0 && !this.K0) {
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
        if (org.telegram.messenger.v3.y(15, g()) && !this.f54113b0.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f54116c0 != z10) {
            this.f54116c0 = z10;
            p91 p91Var = this.f54146r;
            p91Var.k(0, p91Var.b());
        }
    }

    public final void W0(float f10) {
        this.X = f10;
        X0();
        this.f54117c1 = true;
        float f11 = 1.0f - f10;
        this.f54123f.getTitleTextView().setAlpha(f11);
        this.f54123f.getSubtitleTextView().setAlpha(f11);
        org.telegram.ui.Components.f71 f71Var = this.f54114b1;
        if (f71Var != null) {
            f71Var.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
            this.f54114b1.setAlpha(f10);
        }
        this.f54150s0.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
        this.f54150s0.setAlpha(f10);
        if (isInPreviewMode()) {
            this.f54120e.invalidate();
        }
        this.d.invalidate();
        this.O.setAlpha(f11);
        if (this.f54111a1) {
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
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.f29733v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.n6.f29790y8;
        kVar.I(i0.a.f(this.X, themedColor, getThemedColor(i7)), false);
        this.actionBar.I(i0.a.f(this.X, getThemedColor(i7), getThemedColor(i7)), true);
        this.actionBar.G(i0.a.f(this.X, getThemedColor(org.telegram.ui.ActionBar.n6.f29694t8), getThemedColor(org.telegram.ui.ActionBar.n6.f29809z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.f(this.X, getThemedColor(org.telegram.ui.ActionBar.n6.f29676s8), getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6)));
        }
    }

    public final void Y0() {
        fi.v4 v4Var = this.E0;
        if (v4Var != null && v4Var.f36896e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(2131231244, 0);
            lqVar.c(org.telegram.messenger.g0.L(16.0f));
            spannableStringBuilder.setSpan(lqVar, 0, 1, 0);
            if (org.telegram.messenger.v3.y(15, g())) {
                this.E0.f36896e.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131747944, null)), spannableStringBuilder, "%s"));
                return;
            }
            String M0 = org.telegram.messenger.gd.M0(2131750458, null);
            TLRPC.TL_forumTopic f10 = getMessagesController().f25771t7.f(this.f54109a, 1L);
            if (f10 != null) {
                M0 = f10.title;
            }
            this.E0.f36896e.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NoTopicsDescriptionUser", null, 2131747943, M0)));
        }
    }

    public final void Z0(boolean z10, boolean z11) {
        b91 b91Var;
        m91 m91Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.O0) {
            z10 = true;
        }
        this.O0 = false;
        org.telegram.messenger.e00 e00Var = this.f54149s;
        long j3 = this.f54109a;
        ArrayList l10 = e00Var.l(j3);
        if (l10 != null) {
            ArrayList arrayList = this.f54112b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            m91 m91Var2 = null;
            if (org.telegram.messenger.o10.v(org.telegram.messenger.mp.u1(this.currentAccount).c2(Long.valueOf(-j3))) && this.f54153v0) {
                arrayList.add(new q91(3, null));
            }
            for (int i7 = 0; i7 < l10.size(); i7++) {
                HashSet hashSet = this.B0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l10.get(i7)).f28457id))) {
                    arrayList.add(new q91(0, (TLRPC.TL_forumTopic) l10.get(i7)));
                }
            }
            if (!arrayList.isEmpty() && !e00Var.e(j3) && this.W0) {
                arrayList.add(new q91(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.L0.b(size + 4);
                z10 = false;
            }
            this.f54158y = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                q91 q91Var = (q91) arrayList.get(i10);
                if (q91Var != null && (tL_forumTopic = q91Var.f51182c) != null && tL_forumTopic.hidden) {
                    this.f54158y++;
                }
            }
            k91 k91Var = this.O;
            if (k91Var != null) {
                v4.n0 itemAnimator = k91Var.getItemAnimator();
                if (z10) {
                    m91Var = this.J0;
                } else {
                    m91Var = null;
                }
                if (itemAnimator != m91Var) {
                    k91 k91Var2 = this.O;
                    if (z10) {
                        m91Var2 = this.J0;
                    }
                    k91Var2.setItemAnimator(m91Var2);
                }
            }
            p91 p91Var = this.f54146r;
            if (p91Var != null) {
                p91Var.E(arrayList2, arrayList);
            }
            if ((this.D0 || size == 0) && (b91Var = this.G) != null) {
                b91Var.h1(0, 0);
                this.D0 = false;
            }
        }
        E0();
        Y0();
    }

    @Override
    public final long a() {
        return -this.f54109a;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29694t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29733v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29676s8));
    }

    @Override
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
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
        org.telegram.ui.ActionBar.s4 s4Var;
        org.telegram.ui.ActionBar.s4 s4Var2;
        cx cxVar = this.N0;
        if (cxVar != null && cxVar.X) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        this.f54125f1 = i7;
        cx cxVar2 = this.N0;
        if (cxVar2 != null && cxVar2.X) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        } else {
            i10 = 0;
        }
        this.f54127g1 = i10;
        g91 g91Var = new g91(this, context);
        this.d = g91Var;
        this.fragmentView = g91Var;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, g91Var, getResourceProvider());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if ((!org.telegram.messenger.g0.Q1() || ((s4Var2 = this.parentLayout) != null && ((ActionBarLayout) s4Var2).f28682b)) && !this.inPreviewMode) {
            z10 = true;
        } else {
            z10 = false;
        }
        kVar.setOccupyStatusBar(z10);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.actionBar.setActionBarMenuOnItemClick(new j91(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final y91 f53757b;

            {
                this.f53757b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.r0 r0Var;
                switch (r2) {
                    case 0:
                        y91 y91Var = this.f53757b;
                        if (!y91Var.f54151t0) {
                            y91Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        y91 y91Var2 = this.f53757b;
                        y91Var2.getMessagesController().k2(-y91Var2.f54109a, null, y91Var2.g());
                        y91Var2.S0(false);
                        return;
                    case 2:
                        this.f53757b.finishPreviewFragment();
                        return;
                    case 3:
                        cx cxVar3 = this.f53757b.N0;
                        if (cxVar3 != null && (r0Var = cxVar3.f46707k0) != null) {
                            r0Var.performClick();
                            return;
                        }
                        return;
                    default:
                        y91 y91Var3 = this.f53757b;
                        y91Var3.presentFragment(w81.f0(y91Var3.f54109a, 0L));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.z t6 = this.actionBar.t();
        if (this.N0 != null) {
            org.telegram.ui.ActionBar.r0 a10 = t6.a(0, 2131232488);
            this.f54144q0 = a10;
            a10.setOnClickListener(new View.OnClickListener(this) {
                public final y91 f53757b;

                {
                    this.f53757b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.r0 r0Var;
                    switch (r2) {
                        case 0:
                            y91 y91Var = this.f53757b;
                            if (!y91Var.f54151t0) {
                                y91Var.L0(false);
                                return;
                            }
                            return;
                        case 1:
                            y91 y91Var2 = this.f53757b;
                            y91Var2.getMessagesController().k2(-y91Var2.f54109a, null, y91Var2.g());
                            y91Var2.S0(false);
                            return;
                        case 2:
                            this.f53757b.finishPreviewFragment();
                            return;
                        case 3:
                            cx cxVar3 = this.f53757b.N0;
                            if (cxVar3 != null && (r0Var = cxVar3.f46707k0) != null) {
                                r0Var.performClick();
                                return;
                            }
                            return;
                        default:
                            y91 y91Var3 = this.f53757b;
                            y91Var3.presentFragment(w81.f0(y91Var3.f54109a, 0L));
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.r0 a11 = t6.a(0, 2131232488);
            this.f54144q0 = a11;
            a11.O();
            a11.K(new bi.s1(this, 23));
            this.f54144q0.setSearchPaddingStart(56);
            this.f54144q0.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745641, null));
            EditTextBoldCursor searchField = this.f54144q0.getSearchField();
            org.telegram.ui.ActionBar.u6.U(searchField, org.telegram.ui.ActionBar.n6.G6, getResourceProvider());
            org.telegram.ui.ActionBar.u6.D(searchField, org.telegram.ui.ActionBar.n6.Jj, getResourceProvider());
            org.telegram.ui.ActionBar.u6.v(searchField, org.telegram.ui.ActionBar.n6.Ne, getResourceProvider());
        }
        org.telegram.ui.ActionBar.r0 c10 = t6.c(0, 2131231244, null);
        this.f54147r0 = c10;
        c10.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
        this.f54147r0.e(1, 2131232115, org.telegram.messenger.gd.M0(2131743767, null));
        this.S = this.f54147r0.e(2, 2131232047, org.telegram.messenger.gd.M0(2131754399, null));
        org.telegram.ui.ActionBar.r0 r0Var = this.f54147r0;
        this.U = r0Var.d(14, 0, new org.telegram.ui.Components.mh0(2131623944, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f)), org.telegram.messenger.gd.M0(2131753583, null), true, false, r0Var.f29934n0);
        this.R = this.f54147r0.e(3, 2131232407, org.telegram.messenger.gd.M0(2131751691, null));
        this.V = this.f54147r0.e(15, 2131232335, org.telegram.messenger.gd.M0(2131746035, null));
        this.T = this.f54147r0.d(11, 2131232197, null, org.telegram.messenger.gd.M0(2131748798, null), true, false, null);
        org.telegram.ui.Components.ao aoVar = new org.telegram.ui.Components.ao(context, this, false, this.resourceProvider);
        this.f54123f = aoVar;
        aoVar.getAvatarImageView().setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.ao aoVar2 = this.f54123f;
        if ((!org.telegram.messenger.g0.Q1() || ((s4Var = this.parentLayout) != null && ((ActionBarLayout) s4Var).f28682b)) && !this.inPreviewMode) {
            z11 = true;
        } else {
            z11 = false;
        }
        aoVar2.setOccupyStatusBar(z11);
        org.telegram.ui.Components.ao aoVar3 = this.f54123f;
        long j3 = -this.f54109a;
        if (j3 < 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        aoVar3.f33376b = z12;
        aoVar3.setClipChildren(false);
        this.actionBar.addView(this.f54123f, 0, c8.ma.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.f54152u0) {
            this.f54123f.getAvatarImageView().setOnClickListener(new a8(this, 4));
        }
        this.O = new k91(this, context);
        jh.k kVar2 = new jh.k(this.d);
        ViewGroup viewGroup = this.d;
        dh.c cVar = this.f54137m1;
        cVar.h = kVar2;
        cVar.f8380i = viewGroup;
        k91 k91Var = this.O;
        cx cxVar3 = this.N0;
        if (cxVar3 != null) {
            viewGroup = (ViewGroup) cxVar3.getFragmentView();
        }
        k91 k91Var2 = this.O;
        Objects.requireNonNull(k91Var2);
        this.n1 = new dh.k(k91Var, viewGroup, new q40(k91Var2, 2));
        this.O.D0(new y81(this, 5));
        SpannableString spannableString = new SpannableString("#");
        qg.b d = qg.c.d(getParentActivity(), 0.85f, -1, false);
        d.setBounds(0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(18.0f));
        spannableString.setSpan(new ImageSpan(d, 2), 0, 1, 33);
        jv jvVar = new jv(this, org.telegram.messenger.g0.K2(org.telegram.messenger.gd.M0(2131754719, null), spannableString, "#"), org.telegram.messenger.g0.K2(org.telegram.messenger.gd.M0(2131754721, null), spannableString, "#"));
        this.f54156x = jvVar;
        jvVar.b();
        if (this.F) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        this.E = i11;
        jv jvVar2 = this.f54156x;
        if (i11 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        jvVar2.X = z13;
        m91 m91Var = new m91(this);
        this.O.setHideIfEmpty(false);
        m91Var.f59151m = false;
        m91Var.C = false;
        k91 k91Var3 = this.O;
        this.J0 = m91Var;
        k91Var3.setItemAnimator(m91Var);
        this.O.setOnScrollListener(new n91(this, 0));
        k91 k91Var4 = this.O;
        k91Var4.X1 = true;
        k91Var4.Y1 = 0;
        org.telegram.ui.Components.fj0 fj0Var = new org.telegram.ui.Components.fj0(k91Var4, true);
        this.L0 = fj0Var;
        this.O.setItemsEnterAnimator(fj0Var);
        this.O.setOnItemClickListener(new zx0(this, 9));
        this.O.setOnItemLongClickListener(new z81(this));
        this.O.setOnScrollListener(new n91(this, 1));
        k91 k91Var5 = this.O;
        b91 b91Var = new b91(this);
        this.G = b91Var;
        k91Var5.setLayoutManager(b91Var);
        new SparseArray();
        new HashMap();
        this.O.setAdapter(this.f54146r);
        this.O.setClipToPadding(false);
        this.O.j(new c91(this));
        x91 x91Var = new x91(this);
        this.Q = x91Var;
        d91 d91Var = new d91(this, x91Var);
        this.P = d91Var;
        d91Var.h(this.O);
        this.d.addView(this.O, c8.ma.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.O.getLayoutParams()).topMargin = -org.telegram.messenger.g0.L(100.0f);
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(getParentActivity(), this.resourceProvider, false);
        this.h = a10Var;
        this.d.addView(a10Var, org.telegram.ui.Components.a10.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final y91 f53757b;

            {
                this.f53757b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.r0 r0Var2;
                switch (r2) {
                    case 0:
                        y91 y91Var = this.f53757b;
                        if (!y91Var.f54151t0) {
                            y91Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        y91 y91Var2 = this.f53757b;
                        y91Var2.getMessagesController().k2(-y91Var2.f54109a, null, y91Var2.g());
                        y91Var2.S0(false);
                        return;
                    case 2:
                        this.f53757b.finishPreviewFragment();
                        return;
                    case 3:
                        cx cxVar32 = this.f53757b.N0;
                        if (cxVar32 != null && (r0Var2 = cxVar32.f46707k0) != null) {
                            r0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        y91 y91Var3 = this.f53757b;
                        y91Var3.presentFragment(w81.f0(y91Var3.f54109a, 0L));
                        return;
                }
            }
        });
        this.h.f33212c.setImageResource(2131231266);
        this.h.f33212c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f33212c.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        this.h.setContentDescription(org.telegram.messenger.gd.M0(2131751691, null));
        org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(context, null);
        wzVar.setViewType(24);
        wzVar.setVisibility(8);
        wzVar.f41829x = true;
        u81 u81Var = new u81(context, 1);
        TextView textView = new TextView(context);
        u81Var.d = textView;
        if (org.telegram.messenger.gd.f24216a0) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.lq(2131230874, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.M0(2131744024, null));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.gd.M0(2131744024, null));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.lq(2131230872, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29788y6, getResourceProvider());
        boolean z14 = org.telegram.messenger.gd.f24216a0;
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
        u81Var.addView(textView, c8.ma.d(-2, -2.0f, 81, f10, 0.0f, f11, 32.0f));
        this.f54138n = u81Var;
        textView.setAlpha(0.0f);
        fi.v4 v4Var = new fi.v4(this, context, wzVar);
        this.E0 = v4Var;
        try {
            v4Var.f36894b.getImageReceiver().W(2);
        } catch (Exception unused) {
        }
        this.E0.e(this.K0, this.fragmentBeginToShow);
        this.E0.d.setText(org.telegram.messenger.gd.M0(2131747946, null));
        Y0();
        this.f54138n.addView(wzVar);
        this.f54138n.addView(this.E0);
        this.d.addView(this.f54138n);
        this.O.setEmptyView(this.f54138n);
        this.f54142p0 = new hh0(context, 14);
        org.telegram.ui.Components.g51 g51Var = new org.telegram.ui.Components.g51(context);
        this.M = g51Var;
        this.f54142p0.addView(g51Var);
        this.d.addView(this.f54142p0, c8.ma.e(-1, 51, 80));
        this.M.setOnClickListener(new e91(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f54140o0 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(22.0f));
        this.f54140o0.setVisibility(4);
        this.f54142p0.addView(this.f54140o0, c8.ma.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.X0 = imageView;
        imageView.setImageResource(2131231984);
        this.X0.setContentDescription(org.telegram.messenger.gd.M0(2131752030, null));
        ImageView imageView2 = this.X0;
        int i12 = org.telegram.ui.ActionBar.n6.Ue;
        imageView2.setBackground(org.telegram.ui.ActionBar.b6.c(null, org.telegram.ui.ActionBar.b6.b(getThemedColor(i12))));
        org.telegram.ui.ActionBar.u6.s(this.X0, i12, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        this.X0.setScaleType(ImageView.ScaleType.CENTER);
        this.f54142p0.addView(this.X0, c8.ma.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.X0.setOnClickListener(new View.OnClickListener(this) {
            public final y91 f53757b;

            {
                this.f53757b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.r0 r0Var2;
                switch (r2) {
                    case 0:
                        y91 y91Var = this.f53757b;
                        if (!y91Var.f54151t0) {
                            y91Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        y91 y91Var2 = this.f53757b;
                        y91Var2.getMessagesController().k2(-y91Var2.f54109a, null, y91Var2.g());
                        y91Var2.S0(false);
                        return;
                    case 2:
                        this.f53757b.finishPreviewFragment();
                        return;
                    case 3:
                        cx cxVar32 = this.f53757b.N0;
                        if (cxVar32 != null && (r0Var2 = cxVar32.f46707k0) != null) {
                            r0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        y91 y91Var3 = this.f53757b;
                        y91Var3.presentFragment(w81.f0(y91Var3.f54109a, 0L));
                        return;
                }
            }
        });
        this.X0.setVisibility(8);
        S0(false);
        k0 k0Var = new k0(27, context, this);
        this.f54120e = k0Var;
        if (this.N0 == null) {
            this.d.addView(k0Var, c8.ma.e(-1, -1, 119));
        }
        u91 u91Var = new u91(this, context);
        this.f54150s0 = u91Var;
        u91Var.setVisibility(8);
        this.f54120e.addView(this.f54150s0, c8.ma.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        u91 u91Var2 = this.f54150s0;
        int i13 = org.telegram.ui.ActionBar.n6.f29396d6;
        org.telegram.ui.ActionBar.u6.h(i13, u91Var2, getResourceProvider());
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().F0(this.f54109a, true, null, true, false, 0);
        org.telegram.ui.Components.cs csVar = new org.telegram.ui.Components.cs(context);
        this.V0 = csVar;
        csVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
        fh.g c11 = cVar.c(this.V0, c8.i0.o(this.resourceProvider), false);
        org.telegram.messenger.n10.s(c11, org.telegram.messenger.g0.L(24.0f), 7.0f);
        this.V0.setBlurredBackground(c11);
        this.V0.setOnAnimatedHeightChangedListener(new y81(this, 0));
        this.d.addView(this.V0, c8.ma.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            zh.d dVar = new zh.d(g10, this);
            this.S0 = dVar;
            this.V0.addView(dVar.b(), c8.ma.o(-1, 40));
            this.V0.i(3, this.S0.b());
            this.V0.h(this.S0.b());
            zh.d dVar2 = this.S0;
            dVar2.f61986m = new z81(this);
            TLRPC.ChatFull chatFull = this.K;
            dVar2.f61983j = chatFull;
            if (chatFull != null) {
                dVar2.d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.G0 = frameLayout;
            this.V0.addView(frameLayout);
            this.V0.i(4, this.G0);
            this.V0.h(this.G0);
            this.V0.j(this.G0, true, false);
            x8 x8Var = new x8(this, context, this);
            this.H0 = x8Var;
            this.G0.addView(x8Var);
            this.V0.setCallFragmentContextView(this.H0);
        }
        FrameLayout.LayoutParams c12 = c8.ma.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c12.topMargin = org.telegram.messenger.g0.f24115m;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c12);
        }
        C0();
        uv uvVar = new uv(11, context, this);
        this.Q0 = uvVar;
        uvVar.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i13), 100)));
        this.Q0.setFocusable(false);
        this.Q0.setImportantForAccessibility(2);
        this.Q0.setOnClickListener(new View.OnClickListener(this) {
            public final y91 f53757b;

            {
                this.f53757b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.r0 r0Var2;
                switch (r2) {
                    case 0:
                        y91 y91Var = this.f53757b;
                        if (!y91Var.f54151t0) {
                            y91Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        y91 y91Var2 = this.f53757b;
                        y91Var2.getMessagesController().k2(-y91Var2.f54109a, null, y91Var2.g());
                        y91Var2.S0(false);
                        return;
                    case 2:
                        this.f53757b.finishPreviewFragment();
                        return;
                    case 3:
                        cx cxVar32 = this.f53757b.N0;
                        if (cxVar32 != null && (r0Var2 = cxVar32.f46707k0) != null) {
                            r0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        y91 y91Var3 = this.f53757b;
                        y91Var3.presentFragment(w81.f0(y91Var3.f54109a, 0L));
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
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) it.next();
                if (h2Var instanceof cx) {
                    cx cxVar4 = (cx) h2Var;
                    if (cxVar4.x4()) {
                        org.telegram.messenger.sr srVar = cxVar4.f46742r2;
                        if (srVar.f26847a == j3) {
                            this.R0 = srVar.f26848b;
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
        if (org.telegram.messenger.v3.R(g())) {
            getMessagesController().I0().a(j3, new r3(this, 27));
        }
        View view = this.fragmentView;
        z81 z81Var = new z81(this);
        WeakHashMap weakHashMap = r0.i0.f56244a;
        r0.a0.i(view, z81Var);
        return this.fragmentView;
    }

    @Override
    public final long d() {
        return 0L;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i11 = org.telegram.messenger.ks.T;
        long j3 = this.f54109a;
        if (i7 == i11) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.K) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f28406id == j3) {
                S0(false);
                zh.d dVar = this.S0;
                if (dVar != null) {
                    dVar.f61983j = chatFull2;
                    dVar.d(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                D0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i7 == org.telegram.messenger.ks.f25225x5) {
            S0(false);
        } else if (i7 == org.telegram.messenger.ks.f25183r3) {
            if (j3 == (-((Long) objArr[2]).longValue())) {
                this.Y = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i7 == org.telegram.messenger.ks.s5) {
            if (j3 == ((Long) objArr[0]).longValue()) {
                Z0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    C0();
                }
                E0();
            }
        } else if (i7 == org.telegram.messenger.ks.f25179r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.mp.I8;
            if (intValue == 8192) {
                S0(false);
            }
            if ((intValue & 512) > 0) {
                getMessagesController().f25771t7.y(j3, false);
                boolean canScrollVertically = this.O.canScrollVertically(-1);
                Z0(true, false);
                if (!canScrollVertically) {
                    this.G.n0(0);
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25186s) {
            Z0(false, false);
        } else if (i7 == org.telegram.messenger.ks.f25215w2) {
            Long l10 = (Long) objArr[0];
            if (j3 == l10.longValue()) {
                this.I0 = getMessagesController().i1(l10.longValue(), false, null);
                x8 x8Var = this.H0;
                if (x8Var != null) {
                    x8Var.a(!this.fragmentBeginToShow);
                }
                D0(false);
            }
        } else if (i7 == org.telegram.messenger.ks.f25112f0) {
            Z0(false, false);
            S0(true);
        } else if (i7 != org.telegram.messenger.ks.f25198t5 && i7 == org.telegram.messenger.ks.f25192t) {
            removeSelfFromStack(true);
        }
        if (i7 == org.telegram.messenger.ks.f25124h0 && getParentActivity() != null && this.inPreviewMode && org.telegram.messenger.g0.Q1()) {
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
        return getMessagesController().O0(Long.valueOf(this.f54109a));
    }

    @Override
    public final org.telegram.messenger.t3 getGroupCall() {
        org.telegram.messenger.t3 t3Var = this.I0;
        if (t3Var != null && (t3Var.f26937b instanceof TLRPC.TL_groupCall)) {
            return t3Var;
        }
        return null;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        u91 u91Var = this.f54150s0;
        if (u91Var != null && u91Var.f52477a0 != null) {
            int i7 = org.telegram.ui.Cells.x3.h;
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        int i7;
        if (this.f54151t0) {
            i7 = org.telegram.ui.ActionBar.n6.f29396d6;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.f29676s8;
        }
        int themedColor = getThemedColor(i7);
        if (this.actionBar.y()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.f29752w8);
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
        return this.f54133j1;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f54113b0.isEmpty()) {
            if (z10) {
                G0();
                return false;
            }
        } else if (this.f54151t0) {
            if (z10) {
                this.actionBar.B(this.f54144q0.U(false));
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
            kVar.n();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.mp messagesController = getMessagesController();
        long j3 = this.f54109a;
        messagesController.b3(0, j3, true);
        long j10 = -j3;
        this.f54122e1 = getMessagesController().z4(j10);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25225x5);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25183r3);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.T);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.s5);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25179r);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25186s);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25215w2);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25112f0);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25198t5);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25192t);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25124h0);
        Z0(false, false);
        r11.t(this.currentAccount);
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(j3));
        if (org.telegram.messenger.v3.T(O0)) {
            getMessagesController().h5(O0, this.classGuid, false, null);
        }
        Long valueOf = Long.valueOf(j3);
        HashSet hashSet = f54108s1;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Long.valueOf(j3));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().l1(j10);
            getConnectionsManager().sendRequest(getnotifyexceptions, null);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        this.P0.e();
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25225x5);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25183r3);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.T);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.s5);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25179r);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25186s);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25215w2);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25112f0);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25198t5);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25192t);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25124h0);
        org.telegram.messenger.mp messagesController = getMessagesController();
        long j3 = this.f54109a;
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
        if (org.telegram.messenger.v3.T(O0)) {
            getMessagesController().h5(O0, this.classGuid, true, null);
        }
        super.onFragmentDestroy();
        if (this.f54122e1) {
            this.f54122e1 = false;
            getMessagesController().h4(-j3);
        }
        cx cxVar = this.N0;
        if (cxVar != null && cxVar.H3 != null) {
            cxVar.getActionBar().setSearchAvatarImageView(null);
            this.N0.H3.N = true;
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        LongSparseIntArray longSparseIntArray = getMessagesController().f25771t7.f23629r;
        long j3 = this.f54109a;
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
        org.telegram.messenger.e00 e00Var = getMessagesController().f25771t7;
        LongSparseIntArray longSparseIntArray = e00Var.f23629r;
        long j3 = this.f54109a;
        longSparseIntArray.put(j3, longSparseIntArray.get(j3, 0) + 1);
        e00Var.y(j3, true);
        this.H = false;
        org.telegram.messenger.g0.Z3(this.O);
        this.H = true;
        setBulletinDelegate(new y8(this, 9));
        if (this.inPreviewMode && !getMessagesController().y2(-j3)) {
            finishFragment();
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f10) {
        if (org.telegram.messenger.bz.o() != 0 && this.U0) {
            P0(f10);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int b10;
        super.onThemeColorsChanged();
        ui.c cVar = this.l1;
        if (cVar != null) {
            cVar.a(getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6));
        }
        if (this.X0 != null && (b10 = org.telegram.ui.ActionBar.b6.b(getThemedColor(org.telegram.ui.ActionBar.n6.Ue))) != this.f54148r1) {
            this.f54148r1 = b10;
            org.telegram.ui.ActionBar.n6.H1(this.X0.getBackground(), b10, true);
        }
        for (int i7 = 0; i7 < 2; i7++) {
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.J(getThemedColor(org.telegram.ui.ActionBar.n6.G8), true);
            this.actionBar.K(getThemedColor(org.telegram.ui.ActionBar.n6.E8), false, true);
            this.actionBar.K(getThemedColor(org.telegram.ui.ActionBar.n6.F8), true, true);
            this.actionBar.L(getThemedColor(org.telegram.ui.ActionBar.n6.I5), true);
        }
        uv uvVar = this.Q0;
        if (uvVar != null && (uvVar.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.Q0.getForeground()).setColor(i0.a.o(getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6), 100));
        }
        T0();
        try {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setActionModeColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6));
            }
            jv jvVar = this.f54156x;
            if (jvVar != null) {
                jvVar.i();
            }
            if (this.actionBar != null && this.f54117c1) {
                X0();
            }
            NumberTextView numberTextView = this.f54118d0;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29790y8));
            }
            org.telegram.ui.ActionBar.r0 r0Var = this.f54144q0;
            if (r0Var != null && r0Var.getSearchField() != null) {
                this.f54144q0.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.n6.Ne));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        xv xvVar;
        uv uvVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (uvVar = this.Q0) != null) {
            if (uvVar.getParent() != null) {
                ((ViewGroup) this.Q0.getParent()).removeView(this.Q0);
            }
            this.Q0.setBackground(null);
        }
        if (z10) {
            D0(false);
        }
        this.P0.e();
        if (!z10) {
            if (this.f54152u0 && this.I) {
                removeSelfFromStack();
                cx cxVar = this.M0;
                if (cxVar != null) {
                    cxVar.removeSelfFromStack();
                }
            } else if (this.J) {
                removeSelfFromStack();
                cx cxVar2 = this.N0;
                if (cxVar2 != null && (xvVar = cxVar2.H3) != null && xvVar.c()) {
                    this.N0.H3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        uv uvVar = this.Q0;
        if (uvVar != null && uvVar.getVisibility() == 0) {
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
    public final org.telegram.ui.Components.ao r() {
        return this.f54123f;
    }

    @Override
    public final void setPreviewOpenedProgress(float f10) {
        org.telegram.ui.Components.ao aoVar = this.f54123f;
        if (aoVar != null) {
            aoVar.setAlpha(f10);
            this.f54147r0.setAlpha(f10);
            org.telegram.ui.ActionBar.r0 r0Var = this.f54144q0;
            if (r0Var != null) {
                r0Var.setAlpha(f10);
            }
            this.actionBar.getBackButton().setAlpha(f10);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f10) {
        org.telegram.ui.Components.ao aoVar = this.f54123f;
        if (aoVar != null) {
            aoVar.setAlpha(f10);
            this.f54123f.setTranslationX((1.0f - f10) * org.telegram.messenger.g0.L(40.0f));
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
