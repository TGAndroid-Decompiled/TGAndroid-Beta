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
public class w91 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs, org.telegram.ui.Components.ah, ke0 {
    public static final HashSet f53215s1 = new HashSet();
    public boolean A0;
    public HashSet B0;
    public boolean C0;
    public boolean D0;
    public int E;
    public fi.w4 E0;
    public boolean F;
    public m91 F0;
    public z81 G;
    public FrameLayout G0;
    public boolean H;
    public y8 H0;
    public boolean I;
    public org.telegram.messenger.t3 I0;
    public boolean J;
    public k91 J0;
    public TLRPC.ChatFull K;
    public boolean K0;
    public boolean L;
    public org.telegram.ui.Components.hj0 L0;
    public org.telegram.ui.Components.i51 M;
    public bx M0;
    public int N;
    public bx N0;
    public i91 O;
    public boolean O0;
    public b91 P;
    public final h2.f P0;
    public v91 Q;
    public tv Q0;
    public org.telegram.ui.ActionBar.y0 R;
    public long R0;
    public org.telegram.ui.ActionBar.y0 S;
    public zh.d S0;
    public org.telegram.ui.ActionBar.y0 T;
    public float T0;
    public org.telegram.ui.ActionBar.y0 U;
    public boolean U0;
    public org.telegram.ui.ActionBar.y0 V;
    public org.telegram.ui.Components.bs V0;
    public boolean W;
    public final boolean W0;
    public float X;
    public ImageView X0;
    public TL_stories.TL_premium_boostsStatus Y;
    public float Y0;
    public long Z;
    public ValueAnimator Z0;
    public final long f53216a;
    public boolean f53217a0;
    public boolean f53218a1;
    public final ArrayList f53219b;
    public final HashSet f53220b0;
    public org.telegram.ui.Components.j71 f53221b1;
    public int f53222c;
    public boolean f53223c0;
    public boolean f53224c1;
    public e91 d;
    public NumberTextView f53225d0;
    public View f53226d1;
    public k0 f53227e;
    public org.telegram.ui.ActionBar.q0 f53228e0;
    public boolean f53229e1;
    public org.telegram.ui.Components.zn f53230f;
    public org.telegram.ui.ActionBar.q0 f53231f0;
    public int f53232f1;
    public org.telegram.ui.ActionBar.q0 f53233g0;
    public int f53234g1;
    public org.telegram.ui.Components.a10 h;
    public org.telegram.ui.ActionBar.q0 f53235h0;
    public int f53236h1;
    public org.telegram.ui.ActionBar.q0 f53237i0;
    public final dh.g f53238i1;
    public org.telegram.ui.ActionBar.q0 f53239j0;
    public final ui.f f53240j1;
    public org.telegram.ui.ActionBar.y0 f53241k0;
    public final ui.f f53242k1;
    public org.telegram.ui.ActionBar.y0 f53243l0;
    public final ui.c l1;
    public org.telegram.ui.ActionBar.y0 m0;
    public final dh.c f53244m1;
    public s81 f53245n;
    public org.telegram.ui.ActionBar.q0 f53246n0;
    public dh.k n1;
    public RadialProgressView f53247o0;
    public final ArrayList f53248o1;
    public gh0 f53249p0;
    public final RectF f53250p1;
    public org.telegram.ui.ActionBar.q0 f53251q0;
    public final RectF f53252q1;
    public final n91 f53253r;
    public org.telegram.ui.ActionBar.q0 f53254r0;
    public int f53255r1;
    public final org.telegram.messenger.d00 f53256s;
    public s91 f53257s0;
    public boolean f53258t0;
    public final boolean f53259u0;
    public final boolean f53260v0;
    public x91 f53261w;
    public final boolean f53262w0;
    public iv f53263x;
    public final boolean f53264x0;
    public int f53265y;
    public final boolean f53266y0;
    public String f53267z0;

    public w91(Bundle bundle) {
        super(bundle);
        this.f53219b = new ArrayList();
        new ArrayList();
        this.f53253r = new n91(this);
        this.f53265y = 0;
        this.F = true;
        this.H = true;
        this.W = true;
        this.X = 0.0f;
        this.f53220b0 = new HashSet();
        this.C0 = false;
        this.P0 = new h2.f(new int[]{org.telegram.messenger.ks.f25295t5});
        this.T0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f53248o1 = arrayList;
        RectF rectF = new RectF();
        this.f53250p1 = rectF;
        RectF rectF2 = new RectF();
        this.f53252q1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j3 = this.arguments.getLong("chat_id", 0L);
        this.f53216a = j3;
        this.f53259u0 = this.arguments.getBoolean("for_select", false);
        this.f53260v0 = this.arguments.getBoolean("forward_to", false);
        this.f53266y0 = this.arguments.getBoolean("bot_share_to", false);
        this.f53262w0 = this.arguments.getBoolean("quote", false);
        this.f53264x0 = this.arguments.getBoolean("reply_to", false);
        this.f53267z0 = this.arguments.getString("voicechat", null);
        this.A0 = this.arguments.getBoolean("videochat", false);
        this.f53256s = getMessagesController().f25864t7;
        this.W0 = !org.telegram.messenger.f3.w("topics_end_reached_", j3, getUserConfig().k(), false);
        ui.c cVar = new ui.c();
        this.l1 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f53238i1 = new dh.g(false);
            this.f53240j1 = new ui.f(null);
            ui.f fVar = new ui.f(null);
            this.f53242k1 = fVar;
            dh.c cVar2 = new dh.c(fVar, fVar, fVar);
            this.f53244m1 = cVar2;
            cVar2.f8373k = true;
            return;
        }
        this.f53238i1 = null;
        this.f53240j1 = null;
        this.f53242k1 = null;
        this.f53244m1 = new dh.c(cVar, cVar, cVar);
    }

    public static org.telegram.ui.ActionBar.g2 I0(org.telegram.messenger.mp mpVar, org.telegram.messenger.tr trVar, Bundle bundle) {
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
        return new w91(bundle);
    }

    public static org.telegram.ui.ActionBar.g2 J0(LaunchActivity launchActivity, Bundle bundle) {
        return I0(org.telegram.messenger.mp.u1(launchActivity.P), org.telegram.messenger.tr.a0(launchActivity.P), bundle);
    }

    public static void M0(org.telegram.ui.bn r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w91.M0(org.telegram.ui.bn):void");
    }

    public static boolean Z(w91 w91Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(w91Var.currentAccount).f25753g7.edit();
        edit.putLong("dialog_join_requested_time_" + (-w91Var.f53216a), System.currentTimeMillis()).commit();
        Activity parentActivity = w91Var.getParentActivity();
        boolean V = org.telegram.messenger.v3.V(w91Var.g());
        int i7 = org.telegram.ui.Components.o70.f38051u1;
        org.telegram.ui.Components.o70.K0(parentActivity, w91Var, org.telegram.ui.Components.kc.b0(w91Var), V);
        w91Var.S0(true);
        return false;
    }

    public static void a0(w91 w91Var, View view) {
        long j3;
        long j10 = w91Var.f53216a;
        if (w91Var.getParentLayout() != null && !((ActionBarLayout) w91Var.getParentLayout()).y() && (view instanceof t91)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((t91) view).O;
            long j11 = -j10;
            boolean E2 = w91Var.getMessagesController().E2(j11);
            if (tL_forumTopic == null) {
                j3 = 0;
            } else if (E2) {
                j3 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
            } else {
                j3 = tL_forumTopic.f28544id;
            }
            long j12 = j3;
            if (w91Var.f53259u0) {
                x91 x91Var = w91Var.f53261w;
                if (x91Var != null) {
                    z91 z91Var = x91Var.f53897a;
                    Bundle bundle = new Bundle();
                    ca1 ca1Var = z91Var.f54556a;
                    bundle.putLong("dialog_id", ca1Var.f46754c);
                    bundle.putLong("topic_id", tL_forumTopic.f28544id);
                    bundle.putBoolean("exception", true);
                    hx0 hx0Var = new hx0(bundle, null);
                    hx0Var.f48653s = new yi0(24, z91Var, tL_forumTopic);
                    ca1Var.presentFragment(hx0Var);
                }
                bx bxVar = w91Var.M0;
                if (bxVar != null) {
                    bxVar.a4(j11, j12, true, w91Var);
                }
            } else if (w91Var.f53220b0.size() > 0) {
                w91Var.R0(view);
            } else {
                if (w91Var.inPreviewMode && org.telegram.messenger.g0.Q1()) {
                    for (org.telegram.ui.ActionBar.g2 g2Var : w91Var.getParentLayout().getFragmentStack()) {
                        if (g2Var instanceof bx) {
                            bx bxVar2 = (bx) g2Var;
                            if (bxVar2.x4()) {
                                org.telegram.messenger.sr srVar = bxVar2.f46608r2;
                                if (srVar.f26946a == j11 && srVar.f26947b == j12) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    w91Var.R0 = j12;
                    w91Var.Z0(false, false);
                }
                qg.c.n(w91Var, j10, tL_forumTopic, 0);
            }
        }
    }

    public static boolean b0(w91 w91Var, View view, float f10) {
        if (w91Var.f53259u0 || w91Var.getParentLayout() == null || ((ActionBarLayout) w91Var.getParentLayout()).y()) {
            return false;
        }
        if (!w91Var.actionBar.x() && !org.telegram.messenger.g0.Q1() && (view instanceof t91)) {
            t91 t91Var = (t91) view;
            if (t91Var.b0(f10)) {
                w91Var.Q0(t91Var);
                w91Var.O.I0(true);
                w91Var.O.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        w91Var.R0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void f0(w91 w91Var, boolean z10) {
        float f10;
        boolean z11;
        wv wvVar;
        w91Var.f53258t0 = z10;
        ValueAnimator valueAnimator = w91Var.Z0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            w91Var.Z0.cancel();
        }
        if (w91Var.f53221b1 == null) {
            org.telegram.ui.Components.j71 k10 = w91Var.f53257s0.k(8, false);
            w91Var.f53221b1 = k10;
            if (w91Var.N0 != null) {
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, k10, w91Var.getResourceProvider());
            }
            w91Var.f53227e.addView(w91Var.f53221b1, c8.na.c(44.0f, -1));
        }
        float f11 = w91Var.X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w91Var.Z0 = ValueAnimator.ofFloat(f11, f10);
        org.telegram.messenger.g0.X3(w91Var.f53257s0, false, 1.0f, true, true);
        bx bxVar = w91Var.N0;
        if (bxVar != null && (wvVar = bxVar.H3) != null) {
            wvVar.N = !z10;
        }
        if (!z10 && w91Var.f53257s0.getVisibility() == 0 && w91Var.f53257s0.getAlpha() == 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        w91Var.f53218a1 = z11;
        w91Var.Z0.addUpdateListener(new hz0(w91Var, 13));
        w91Var.f53257s0.setVisibility(0);
        if (!z10) {
            w91Var.f53254r0.setVisibility(0);
        } else {
            org.telegram.messenger.g0.Z2(w91Var.getParentActivity(), w91Var.classGuid);
            w91Var.U0(false);
        }
        w91Var.Z0.addListener(new g91(w91Var, z10, 0));
        w91Var.Z0.setDuration(200L);
        w91Var.Z0.setInterpolator(org.telegram.ui.Components.kr.f36858f);
        w91Var.Z0.start();
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25301u4, Boolean.TRUE);
    }

    @Override
    public final ui.f B() {
        return this.f53242k1;
    }

    public final void B0() {
        dh.g gVar;
        View view;
        org.telegram.ui.ActionBar.k kVar;
        float f10;
        int i7;
        if (Build.VERSION.SDK_INT >= 31 && (gVar = this.f53238i1) != null) {
            int L = org.telegram.messenger.g0.L(48.0f);
            int L2 = org.telegram.messenger.g0.L(48.0f) + ((int) this.V0.d(org.telegram.messenger.g0.L(14.0f)));
            bx bxVar = this.N0;
            if (bxVar != null) {
                view = bxVar.fragmentView;
            } else {
                view = this.fragmentView;
            }
            if (bxVar != null) {
                kVar = bxVar.getActionBar();
            } else {
                kVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.f53236h1) - org.telegram.messenger.g0.L(8.0f);
            this.f53250p1.set(0.0f, -L, view.getMeasuredWidth(), kVar.getMeasuredHeight() + L + L2);
            RectF rectF = this.f53252q1;
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
            gVar.g(i7, this.f53248o1);
            gVar.e(this.n1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final void C0() {
        z81 z81Var;
        org.telegram.messenger.d00 d00Var = this.f53256s;
        long j3 = this.f53216a;
        if (!d00Var.e(j3) && (z81Var = this.G) != null) {
            int N0 = z81Var.N0();
            if (this.f53219b.isEmpty() || N0 >= this.f53253r.b() - 5) {
                d00Var.o(j3);
            }
            E0();
        }
    }

    @Override
    public final org.telegram.ui.Components.cu0 D() {
        return this.d;
    }

    public final void D0(boolean z10) {
        String str;
        org.telegram.messenger.mp messagesController = getMessagesController();
        long j3 = this.f53216a;
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
        TLRPC.ChatFull P0 = getMessagesController().P0(j3);
        org.telegram.messenger.t3 t3Var = this.I0;
        if (t3Var != null && ((str = this.f53267z0) != null || this.A0)) {
            org.telegram.ui.Components.voip.c2.l(O0, str, false, Boolean.valueOf(!t3Var.f27034b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f53267z0 = null;
            this.A0 = false;
        } else if (this.f53267z0 != null && z10 && P0 != null && P0.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.f3.n(null, 2131748720, org.telegram.ui.Components.kc.b0(this), 2131624080, 36);
            this.f53267z0 = null;
        }
    }

    public final void E0() {
        boolean z10;
        org.telegram.messenger.d00 d00Var = this.f53256s;
        a0.h hVar = d00Var.f23570a;
        LongSparseIntArray longSparseIntArray = d00Var.f23572c;
        long j3 = this.f53216a;
        if (longSparseIntArray.get(j3, 0) == 1 && (hVar.f(j3) == null || ((ArrayList) hVar.f(j3)).isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K0 = z10;
        if (this.E0 != null) {
            ArrayList arrayList = this.f53219b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((o91) arrayList.get(0)).f50609c != null && ((o91) arrayList.get(0)).f50609c.f28544id == 1)) {
                this.E0.e(this.K0, this.fragmentBeginToShow);
            }
        }
        i91 i91Var = this.O;
        if (i91Var != null) {
            i91Var.K0(i91Var.w1());
        }
        U0(true);
    }

    public final void F0() {
        int i7;
        float f10;
        float f11;
        bx bxVar = this.N0;
        float f12 = 0.0f;
        if (bxVar != null) {
            int L = org.telegram.messenger.g0.L(14.0f);
            org.telegram.ui.Components.bs bsVar = bxVar.L1;
            if (bsVar != null) {
                f10 = bsVar.d(L);
            } else {
                f10 = 0.0f;
            }
            float f13 = f10 + 0.0f;
            org.telegram.ui.Components.bs bsVar2 = this.V0;
            if (bsVar2 != null) {
                float L2 = org.telegram.messenger.g0.L(7.0f);
                org.telegram.ui.Components.bs bsVar3 = this.N0.L1;
                if (bsVar3 != null) {
                    f11 = bsVar3.getMetadata().f57795c.f57805a;
                } else {
                    f11 = 0.0f;
                }
                bsVar2.setTranslationY(f13 - (f11 * L2));
                org.telegram.ui.Components.bs bsVar4 = this.V0;
                int L3 = org.telegram.messenger.g0.L(14.0f);
                int L4 = org.telegram.messenger.g0.L(7.0f);
                org.telegram.ui.Components.bs bsVar5 = this.N0.L1;
                if (bsVar5 != null) {
                    f12 = bsVar5.getMetadata().f57795c.f57805a;
                }
                f12 = bsVar4.d(org.telegram.messenger.g0.W1(f12, L3, L4)) + f13;
            } else {
                f12 = f13;
            }
        } else {
            org.telegram.ui.Components.bs bsVar6 = this.V0;
            if (bsVar6 != null) {
                f12 = 0.0f + bsVar6.d(org.telegram.messenger.g0.L(14.0f));
            }
        }
        int i10 = this.f53236h1 + this.f53232f1;
        if (this.W) {
            i7 = org.telegram.messenger.g0.L(51.0f);
        } else {
            i7 = 0;
        }
        this.O.setPadding(0, (int) f12, 0, i10 + i7);
    }

    public final void G0() {
        this.f53220b0.clear();
        this.actionBar.w();
        org.telegram.messenger.g0.Z3(this.O);
        V0();
    }

    public final void H0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String K0 = org.telegram.messenger.gd.K0(hashSet.size(), "DeleteTopics");
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = K0;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131751486, this.f53256s.f(this.f53216a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            t1Var.U = org.telegram.messenger.gd.N0(2131751485, null);
        }
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new a1.d(this, hashSet, arrayList, runnable, 22));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new l60(17));
        t1Var.show();
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, getResourceProvider());
        }
    }

    @Override
    public final boolean J() {
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
        bundle.putLong("chat_id", this.f53216a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f53230f.getSharedMediaPreloader());
        profileActivity.d5(this.K);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f53230f.getAvatarImageView().getImageReceiver().K() && z10) {
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
            org.telegram.ui.Components.i51 i51Var = this.M;
            if (i7 == 0) {
                i10 = org.telegram.ui.ActionBar.n6.f29737sf;
            } else {
                i10 = org.telegram.ui.ActionBar.n6.f29692q7;
            }
            i51Var.setTextColorKey(i10);
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
        e91 e91Var = this.d;
        if (e91Var != null) {
            if (z10) {
                e91Var.setLayerType(2, null);
                e91Var.setClipChildren(false);
                e91Var.setClipToPadding(false);
            } else {
                e91Var.setLayerType(0, null);
                e91Var.setClipChildren(true);
                e91Var.setClipToPadding(true);
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
            i91 i91Var = this.O;
            if (i91Var != null) {
                float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, this.T0, 0.05f, 1.0f);
                i91Var.setPivotX(0.0f);
                i91Var.setPivotY(0.0f);
                i91Var.setScaleX(t6);
                i91Var.setScaleY(t6);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(t6);
                this.actionBar.setScaleY(t6);
            }
        }
    }

    public final void Q0(org.telegram.ui.Cells.u2 u2Var) {
        boolean z10;
        long j3;
        try {
            u2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232569, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = u2Var.O;
        org.telegram.ui.Components.oo ooVar = new org.telegram.ui.Components.oo(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new d91(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(ooVar.f38227f);
        ooVar.f38235o = 1;
        long j10 = this.f53216a;
        long j11 = -j10;
        ooVar.e(j11, tL_forumTopic.f28544id, null);
        if (org.telegram.messenger.v3.y(15, g())) {
            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                y0Var.j(org.telegram.messenger.gd.N0(2131751440, null), 2131232418, null);
            } else {
                y0Var.j(org.telegram.messenger.gd.N0(2131751441, null), 2131232298, null);
            }
            y0Var.setMinimumWidth(160);
            z10 = false;
            y0Var.setOnClickListener(new View.OnClickListener(this) {
                public final w91 f54313b;

                {
                    this.f54313b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            w91 w91Var = this.f54313b;
                            w91Var.D0 = true;
                            w91Var.O0 = true;
                            org.telegram.messenger.d00 d00Var = w91Var.f53256s;
                            long j12 = w91Var.f53216a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            d00Var.t(j12, tL_forumTopic2.f28544id, !tL_forumTopic2.pinned, w91Var);
                            w91Var.finishPreviewFragment();
                            return;
                        case 1:
                            w91 w91Var2 = this.f54313b;
                            w91Var2.O0 = true;
                            org.telegram.messenger.d00 d00Var2 = w91Var2.f53256s;
                            long j13 = w91Var2.f53216a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            d00Var2.z(tL_forumTopic3.f28544id, j13, true ^ tL_forumTopic3.closed);
                            w91Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f28544id));
                            w91 w91Var3 = this.f54313b;
                            w91Var3.H0(hashSet, new w81(w91Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(y0Var);
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(getParentActivity(), z10, z10);
        if (getMessagesController().u2(j11, tL_forumTopic.f28544id, null)) {
            y0Var2.j(org.telegram.messenger.gd.N0(2131743602, null), 2131232261, null);
        } else {
            y0Var2.j(org.telegram.messenger.gd.N0(2131748121, null), 2131232417, null);
        }
        y0Var2.setMinimumWidth(160);
        y0Var2.setOnClickListener(new fi.k5(this, tL_forumTopic, (Serializable) r32, b10, 8));
        boolean z11 = false;
        r32[0].addView(y0Var2);
        if (org.telegram.messenger.v3.i(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                y0Var3.j(org.telegram.messenger.gd.N0(2131745888, null), 2131232411, null);
            } else {
                y0Var3.j(org.telegram.messenger.gd.N0(2131752027, null), 2131232409, null);
            }
            y0Var3.setMinimumWidth(160);
            y0Var3.setOnClickListener(new View.OnClickListener(this) {
                public final w91 f54313b;

                {
                    this.f54313b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            w91 w91Var = this.f54313b;
                            w91Var.D0 = true;
                            w91Var.O0 = true;
                            org.telegram.messenger.d00 d00Var = w91Var.f53256s;
                            long j12 = w91Var.f53216a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            d00Var.t(j12, tL_forumTopic2.f28544id, !tL_forumTopic2.pinned, w91Var);
                            w91Var.finishPreviewFragment();
                            return;
                        case 1:
                            w91 w91Var2 = this.f54313b;
                            w91Var2.O0 = true;
                            org.telegram.messenger.d00 d00Var2 = w91Var2.f53256s;
                            long j13 = w91Var2.f53216a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            d00Var2.z(tL_forumTopic3.f28544id, j13, true ^ tL_forumTopic3.closed);
                            w91Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f28544id));
                            w91 w91Var3 = this.f54313b;
                            w91Var3.H0(hashSet, new w81(w91Var3, 3));
                            return;
                    }
                }
            });
            z11 = false;
            r32[0].addView(y0Var3);
        }
        if (org.telegram.messenger.v3.e(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.y0 y0Var4 = new org.telegram.ui.ActionBar.y0(getParentActivity(), z11, true);
            y0Var4.j(org.telegram.messenger.gd.K0(1, "DeleteTopics"), 2131232113, null);
            y0Var4.c(org.telegram.ui.ActionBar.n6.f29692q7, org.telegram.ui.ActionBar.n6.f29672p7);
            y0Var4.setMinimumWidth(160);
            y0Var4.setOnClickListener(new View.OnClickListener(this) {
                public final w91 f54313b;

                {
                    this.f54313b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            w91 w91Var = this.f54313b;
                            w91Var.D0 = true;
                            w91Var.O0 = true;
                            org.telegram.messenger.d00 d00Var = w91Var.f53256s;
                            long j12 = w91Var.f53216a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            d00Var.t(j12, tL_forumTopic2.f28544id, !tL_forumTopic2.pinned, w91Var);
                            w91Var.finishPreviewFragment();
                            return;
                        case 1:
                            w91 w91Var2 = this.f54313b;
                            w91Var2.O0 = true;
                            org.telegram.messenger.d00 d00Var2 = w91Var2.f53256s;
                            long j13 = w91Var2.f53216a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            d00Var2.z(tL_forumTopic3.f28544id, j13, true ^ tL_forumTopic3.closed);
                            w91Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f28544id));
                            w91 w91Var3 = this.f54313b;
                            w91Var3.H0(hashSet, new w81(w91Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(y0Var4);
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
            this.parentLayout.getOverlayContainerView().addView(this.Q0, c8.na.c(-1.0f, -1));
        }
        bn bnVar = new bn(a8.p0.j(j10, "chat_id"));
        if (E2) {
            j3 = org.telegram.messenger.n5.o(u2Var.O.from_id);
        } else {
            j3 = u2Var.O.f28544id;
        }
        qg.c.a(bnVar, org.telegram.messenger.sr.a(j11, j3));
        presentFragmentAsPreviewWithMenu(bnVar, r32[0]);
    }

    public final void R0(android.view.View r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w91.R0(android.view.View):void");
    }

    public final void S0(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w91.S0(boolean):void");
    }

    public final void T0() {
        RadialProgressView radialProgressView = this.f53247o0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29737sf));
        this.h.updateColors();
        gh0 gh0Var = this.f53249p0;
        int i7 = org.telegram.ui.ActionBar.n6.f29451d6;
        gh0Var.setBackgroundColor(getThemedColor(i7));
        this.actionBar.setActionModeColor(getThemedColor(i7));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29731s8));
        }
        this.f53257s0.setBackgroundColor(getThemedColor(i7));
    }

    public final void U0(boolean z10) {
        boolean z11;
        if (this.R == null) {
            return;
        }
        org.telegram.messenger.mp messagesController = getMessagesController();
        long j3 = this.f53216a;
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
        int i7 = 0;
        if (!org.telegram.messenger.v3.r0(getMessagesController().O0(Long.valueOf(j3))) && org.telegram.messenger.v3.w(15, O0) && !this.f53258t0 && !this.f53259u0 && !this.K0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.L = z11;
        org.telegram.ui.ActionBar.y0 y0Var = this.R;
        if (!z11) {
            i7 = 8;
        }
        y0Var.setVisibility(i7);
        K0(!this.L, z10);
    }

    public final void V0() {
        boolean z10;
        if (org.telegram.messenger.v3.y(15, g()) && !this.f53220b0.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f53223c0 != z10) {
            this.f53223c0 = z10;
            n91 n91Var = this.f53253r;
            n91Var.k(0, n91Var.b());
        }
    }

    public final void W0(float f10) {
        this.X = f10;
        X0();
        this.f53224c1 = true;
        float f11 = 1.0f - f10;
        this.f53230f.getTitleTextView().setAlpha(f11);
        this.f53230f.getSubtitleTextView().setAlpha(f11);
        org.telegram.ui.Components.j71 j71Var = this.f53221b1;
        if (j71Var != null) {
            j71Var.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
            this.f53221b1.setAlpha(f10);
        }
        this.f53257s0.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
        this.f53257s0.setAlpha(f10);
        if (isInPreviewMode()) {
            this.f53227e.invalidate();
        }
        this.d.invalidate();
        this.O.setAlpha(f11);
        if (this.f53218a1) {
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
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.f29788v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.n6.f29845y8;
        kVar.F(i0.a.f(this.X, themedColor, getThemedColor(i7)), false);
        this.actionBar.F(i0.a.f(this.X, getThemedColor(i7), getThemedColor(i7)), true);
        this.actionBar.E(i0.a.f(this.X, getThemedColor(org.telegram.ui.ActionBar.n6.f29749t8), getThemedColor(org.telegram.ui.ActionBar.n6.f29864z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.f(this.X, getThemedColor(org.telegram.ui.ActionBar.n6.f29731s8), getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6)));
        }
    }

    public final void Y0() {
        fi.w4 w4Var = this.E0;
        if (w4Var != null && w4Var.f37553e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            org.telegram.ui.Components.kq kqVar = new org.telegram.ui.Components.kq(2131231247, 0);
            kqVar.c(org.telegram.messenger.g0.L(16.0f));
            spannableStringBuilder.setSpan(kqVar, 0, 1, 0);
            if (org.telegram.messenger.v3.y(15, g())) {
                this.E0.f37553e.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131747943, null)), spannableStringBuilder, "%s"));
                return;
            }
            String N0 = org.telegram.messenger.gd.N0(2131750457, null);
            TLRPC.TL_forumTopic f10 = getMessagesController().f25864t7.f(this.f53216a, 1L);
            if (f10 != null) {
                N0 = f10.title;
            }
            this.E0.f37553e.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NoTopicsDescriptionUser", null, 2131747942, N0)));
        }
    }

    public final void Z0(boolean z10, boolean z11) {
        z81 z81Var;
        k91 k91Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.O0) {
            z10 = true;
        }
        this.O0 = false;
        org.telegram.messenger.d00 d00Var = this.f53256s;
        long j3 = this.f53216a;
        ArrayList l10 = d00Var.l(j3);
        if (l10 != null) {
            ArrayList arrayList = this.f53219b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            k91 k91Var2 = null;
            if (org.telegram.messenger.n10.v(org.telegram.messenger.mp.u1(this.currentAccount).c2(Long.valueOf(-j3))) && this.f53260v0) {
                arrayList.add(new o91(3, null));
            }
            for (int i7 = 0; i7 < l10.size(); i7++) {
                HashSet hashSet = this.B0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l10.get(i7)).f28544id))) {
                    arrayList.add(new o91(0, (TLRPC.TL_forumTopic) l10.get(i7)));
                }
            }
            if (!arrayList.isEmpty() && !d00Var.e(j3) && this.W0) {
                arrayList.add(new o91(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.L0.b(size + 4);
                z10 = false;
            }
            this.f53265y = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o91 o91Var = (o91) arrayList.get(i10);
                if (o91Var != null && (tL_forumTopic = o91Var.f50609c) != null && tL_forumTopic.hidden) {
                    this.f53265y++;
                }
            }
            i91 i91Var = this.O;
            if (i91Var != null) {
                v4.n0 itemAnimator = i91Var.getItemAnimator();
                if (z10) {
                    k91Var = this.J0;
                } else {
                    k91Var = null;
                }
                if (itemAnimator != k91Var) {
                    i91 i91Var2 = this.O;
                    if (z10) {
                        k91Var2 = this.J0;
                    }
                    i91Var2.setItemAnimator(k91Var2);
                }
            }
            n91 n91Var = this.f53253r;
            if (n91Var != null) {
                n91Var.E(arrayList2, arrayList);
            }
            if ((this.D0 || size == 0) && (z81Var = this.G) != null) {
                z81Var.h1(0, 0);
                this.D0 = false;
            }
        }
        E0();
        Y0();
    }

    @Override
    public final long a() {
        return -this.f53216a;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
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
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        bx bxVar = this.N0;
        if (bxVar != null && bxVar.X) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        this.f53232f1 = i7;
        bx bxVar2 = this.N0;
        if (bxVar2 != null && bxVar2.X) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        } else {
            i10 = 0;
        }
        this.f53234g1 = i10;
        e91 e91Var = new e91(this, context);
        this.d = e91Var;
        this.fragmentView = e91Var;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, e91Var, getResourceProvider());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if ((!org.telegram.messenger.g0.Q1() || ((r4Var2 = this.parentLayout) != null && ((ActionBarLayout) r4Var2).f28771b)) && !this.inPreviewMode) {
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
        this.actionBar.setActionBarMenuOnItemClick(new h91(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final w91 f52923b;

            {
                this.f52923b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var;
                switch (r2) {
                    case 0:
                        w91 w91Var = this.f52923b;
                        if (!w91Var.f53258t0) {
                            w91Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        w91 w91Var2 = this.f52923b;
                        w91Var2.getMessagesController().k2(-w91Var2.f53216a, null, w91Var2.g());
                        w91Var2.S0(false);
                        return;
                    case 2:
                        this.f52923b.finishPreviewFragment();
                        return;
                    case 3:
                        bx bxVar3 = this.f52923b.N0;
                        if (bxVar3 != null && (q0Var = bxVar3.f46573k0) != null) {
                            q0Var.performClick();
                            return;
                        }
                        return;
                    default:
                        w91 w91Var3 = this.f52923b;
                        w91Var3.presentFragment(u81.f0(w91Var3.f53216a, 0L));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        if (this.N0 != null) {
            org.telegram.ui.ActionBar.q0 a10 = s5.a(0, 2131232491);
            this.f53251q0 = a10;
            a10.setOnClickListener(new View.OnClickListener(this) {
                public final w91 f52923b;

                {
                    this.f52923b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.q0 q0Var;
                    switch (r2) {
                        case 0:
                            w91 w91Var = this.f52923b;
                            if (!w91Var.f53258t0) {
                                w91Var.L0(false);
                                return;
                            }
                            return;
                        case 1:
                            w91 w91Var2 = this.f52923b;
                            w91Var2.getMessagesController().k2(-w91Var2.f53216a, null, w91Var2.g());
                            w91Var2.S0(false);
                            return;
                        case 2:
                            this.f52923b.finishPreviewFragment();
                            return;
                        case 3:
                            bx bxVar3 = this.f52923b.N0;
                            if (bxVar3 != null && (q0Var = bxVar3.f46573k0) != null) {
                                q0Var.performClick();
                                return;
                            }
                            return;
                        default:
                            w91 w91Var3 = this.f52923b;
                            w91Var3.presentFragment(u81.f0(w91Var3.f53216a, 0L));
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.q0 a11 = s5.a(0, 2131232491);
            this.f53251q0 = a11;
            a11.O();
            a11.K(new bi.x1(this, 23));
            this.f53251q0.setSearchPaddingStart(56);
            this.f53251q0.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, null));
            EditTextBoldCursor searchField = this.f53251q0.getSearchField();
            org.telegram.ui.ActionBar.u6.U(searchField, org.telegram.ui.ActionBar.n6.G6, getResourceProvider());
            org.telegram.ui.ActionBar.u6.D(searchField, org.telegram.ui.ActionBar.n6.Jj, getResourceProvider());
            org.telegram.ui.ActionBar.u6.v(searchField, org.telegram.ui.ActionBar.n6.Ne, getResourceProvider());
        }
        org.telegram.ui.ActionBar.q0 c10 = s5.c(0, 2131231247, null);
        this.f53254r0 = c10;
        c10.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
        this.f53254r0.e(1, 2131232118, org.telegram.messenger.gd.N0(2131743757, null));
        this.S = this.f53254r0.e(2, 2131232050, org.telegram.messenger.gd.N0(2131754398, null));
        org.telegram.ui.ActionBar.q0 q0Var = this.f53254r0;
        this.U = q0Var.d(14, 0, new org.telegram.ui.Components.nh0(2131623944, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f)), org.telegram.messenger.gd.N0(2131753582, null), true, false, q0Var.f29975n0);
        this.R = this.f53254r0.e(3, 2131232410, org.telegram.messenger.gd.N0(2131751690, null));
        this.V = this.f53254r0.e(15, 2131232338, org.telegram.messenger.gd.N0(2131746034, null));
        this.T = this.f53254r0.d(11, 2131232200, null, org.telegram.messenger.gd.N0(2131748797, null), true, false, null);
        org.telegram.ui.Components.zn znVar = new org.telegram.ui.Components.zn(context, this, false, this.resourceProvider);
        this.f53230f = znVar;
        znVar.getAvatarImageView().setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.zn znVar2 = this.f53230f;
        if ((!org.telegram.messenger.g0.Q1() || ((r4Var = this.parentLayout) != null && ((ActionBarLayout) r4Var).f28771b)) && !this.inPreviewMode) {
            z11 = true;
        } else {
            z11 = false;
        }
        znVar2.setOccupyStatusBar(z11);
        org.telegram.ui.Components.zn znVar3 = this.f53230f;
        long j3 = -this.f53216a;
        if (j3 < 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        znVar3.f42929b = z12;
        znVar3.setClipChildren(false);
        this.actionBar.addView(this.f53230f, 0, c8.na.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.f53259u0) {
            this.f53230f.getAvatarImageView().setOnClickListener(new b8(this, 4));
        }
        this.O = new i91(this, context);
        jh.k kVar2 = new jh.k(this.d);
        ViewGroup viewGroup = this.d;
        dh.c cVar = this.f53244m1;
        cVar.h = kVar2;
        cVar.f8371i = viewGroup;
        i91 i91Var = this.O;
        bx bxVar3 = this.N0;
        if (bxVar3 != null) {
            viewGroup = (ViewGroup) bxVar3.getFragmentView();
        }
        i91 i91Var2 = this.O;
        Objects.requireNonNull(i91Var2);
        this.n1 = new dh.k(i91Var, viewGroup, new p40(i91Var2, 2));
        this.O.D0(new w81(this, 5));
        SpannableString spannableString = new SpannableString("#");
        qg.b d = qg.c.d(getParentActivity(), 0.85f, -1, false);
        d.setBounds(0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(18.0f));
        spannableString.setSpan(new ImageSpan(d, 2), 0, 1, 33);
        iv ivVar = new iv(this, org.telegram.messenger.g0.K2(org.telegram.messenger.gd.N0(2131754718, null), spannableString, "#"), org.telegram.messenger.g0.K2(org.telegram.messenger.gd.N0(2131754720, null), spannableString, "#"));
        this.f53263x = ivVar;
        ivVar.b();
        if (this.F) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        this.E = i11;
        iv ivVar2 = this.f53263x;
        if (i11 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        ivVar2.X = z13;
        k91 k91Var = new k91(this);
        this.O.setHideIfEmpty(false);
        k91Var.f59274m = false;
        k91Var.C = false;
        i91 i91Var3 = this.O;
        this.J0 = k91Var;
        i91Var3.setItemAnimator(k91Var);
        this.O.setOnScrollListener(new l91(this, 0));
        i91 i91Var4 = this.O;
        i91Var4.X1 = true;
        i91Var4.Y1 = 0;
        org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(i91Var4, true);
        this.L0 = hj0Var;
        this.O.setItemsEnterAnimator(hj0Var);
        this.O.setOnItemClickListener(new xx0(this, 9));
        this.O.setOnItemLongClickListener(new x81(this));
        this.O.setOnScrollListener(new l91(this, 1));
        i91 i91Var5 = this.O;
        z81 z81Var = new z81(this);
        this.G = z81Var;
        i91Var5.setLayoutManager(z81Var);
        new SparseArray();
        new HashMap();
        this.O.setAdapter(this.f53253r);
        this.O.setClipToPadding(false);
        this.O.j(new a91(this));
        v91 v91Var = new v91(this);
        this.Q = v91Var;
        b91 b91Var = new b91(this, v91Var);
        this.P = b91Var;
        b91Var.h(this.O);
        this.d.addView(this.O, c8.na.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.O.getLayoutParams()).topMargin = -org.telegram.messenger.g0.L(100.0f);
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(getParentActivity(), this.resourceProvider, false);
        this.h = a10Var;
        this.d.addView(a10Var, org.telegram.ui.Components.a10.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final w91 f52923b;

            {
                this.f52923b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var2;
                switch (r2) {
                    case 0:
                        w91 w91Var = this.f52923b;
                        if (!w91Var.f53258t0) {
                            w91Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        w91 w91Var2 = this.f52923b;
                        w91Var2.getMessagesController().k2(-w91Var2.f53216a, null, w91Var2.g());
                        w91Var2.S0(false);
                        return;
                    case 2:
                        this.f52923b.finishPreviewFragment();
                        return;
                    case 3:
                        bx bxVar32 = this.f52923b.N0;
                        if (bxVar32 != null && (q0Var2 = bxVar32.f46573k0) != null) {
                            q0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        w91 w91Var3 = this.f52923b;
                        w91Var3.presentFragment(u81.f0(w91Var3.f53216a, 0L));
                        return;
                }
            }
        });
        this.h.f33308c.setImageResource(2131231269);
        this.h.f33308c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f33308c.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        this.h.setContentDescription(org.telegram.messenger.gd.N0(2131751690, null));
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
        vzVar.setViewType(24);
        vzVar.setVisibility(8);
        vzVar.f41457x = true;
        s81 s81Var = new s81(context, 1);
        TextView textView = new TextView(context);
        s81Var.d = textView;
        if (org.telegram.messenger.gd.f24314a0) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.kq(2131230874, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131744014, null));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.gd.N0(2131744014, null));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.kq(2131230872, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29843y6, getResourceProvider());
        boolean z14 = org.telegram.messenger.gd.f24314a0;
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
        s81Var.addView(textView, c8.na.d(-2, -2.0f, 81, f10, 0.0f, f11, 32.0f));
        this.f53245n = s81Var;
        textView.setAlpha(0.0f);
        fi.w4 w4Var = new fi.w4(this, context, vzVar);
        this.E0 = w4Var;
        try {
            w4Var.f37551b.getImageReceiver().X(2);
        } catch (Exception unused) {
        }
        this.E0.e(this.K0, this.fragmentBeginToShow);
        this.E0.d.setText(org.telegram.messenger.gd.N0(2131747945, null));
        Y0();
        this.f53245n.addView(vzVar);
        this.f53245n.addView(this.E0);
        this.d.addView(this.f53245n);
        this.O.setEmptyView(this.f53245n);
        this.f53249p0 = new gh0(context, 14);
        org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(context);
        this.M = i51Var;
        this.f53249p0.addView(i51Var);
        this.d.addView(this.f53249p0, c8.na.e(-1, 51, 80));
        this.M.setOnClickListener(new c91(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f53247o0 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(22.0f));
        this.f53247o0.setVisibility(4);
        this.f53249p0.addView(this.f53247o0, c8.na.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.X0 = imageView;
        imageView.setImageResource(2131231987);
        this.X0.setContentDescription(org.telegram.messenger.gd.N0(2131752029, null));
        ImageView imageView2 = this.X0;
        int i12 = org.telegram.ui.ActionBar.n6.Ue;
        imageView2.setBackground(org.telegram.ui.ActionBar.b6.c(null, org.telegram.ui.ActionBar.b6.b(getThemedColor(i12))));
        org.telegram.ui.ActionBar.u6.s(this.X0, i12, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        this.X0.setScaleType(ImageView.ScaleType.CENTER);
        this.f53249p0.addView(this.X0, c8.na.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.X0.setOnClickListener(new View.OnClickListener(this) {
            public final w91 f52923b;

            {
                this.f52923b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var2;
                switch (r2) {
                    case 0:
                        w91 w91Var = this.f52923b;
                        if (!w91Var.f53258t0) {
                            w91Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        w91 w91Var2 = this.f52923b;
                        w91Var2.getMessagesController().k2(-w91Var2.f53216a, null, w91Var2.g());
                        w91Var2.S0(false);
                        return;
                    case 2:
                        this.f52923b.finishPreviewFragment();
                        return;
                    case 3:
                        bx bxVar32 = this.f52923b.N0;
                        if (bxVar32 != null && (q0Var2 = bxVar32.f46573k0) != null) {
                            q0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        w91 w91Var3 = this.f52923b;
                        w91Var3.presentFragment(u81.f0(w91Var3.f53216a, 0L));
                        return;
                }
            }
        });
        this.X0.setVisibility(8);
        S0(false);
        k0 k0Var = new k0(27, context, this);
        this.f53227e = k0Var;
        if (this.N0 == null) {
            this.d.addView(k0Var, c8.na.e(-1, -1, 119));
        }
        s91 s91Var = new s91(this, context);
        this.f53257s0 = s91Var;
        s91Var.setVisibility(8);
        this.f53227e.addView(this.f53257s0, c8.na.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        s91 s91Var2 = this.f53257s0;
        int i13 = org.telegram.ui.ActionBar.n6.f29451d6;
        org.telegram.ui.ActionBar.u6.h(i13, s91Var2, getResourceProvider());
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().F0(this.f53216a, true, null, true, false, 0);
        org.telegram.ui.Components.bs bsVar = new org.telegram.ui.Components.bs(context);
        this.V0 = bsVar;
        bsVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
        fh.g c11 = cVar.c(this.V0, c8.j0.o(this.resourceProvider), false);
        org.telegram.messenger.m10.s(c11, org.telegram.messenger.g0.L(24.0f), 7.0f);
        this.V0.setBlurredBackground(c11);
        this.V0.setOnAnimatedHeightChangedListener(new w81(this, 0));
        this.d.addView(this.V0, c8.na.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            zh.d dVar = new zh.d(g10, this);
            this.S0 = dVar;
            this.V0.addView(dVar.b(), c8.na.o(-1, 40));
            this.V0.i(3, this.S0.b());
            this.V0.h(this.S0.b());
            zh.d dVar2 = this.S0;
            dVar2.f62115m = new x81(this);
            TLRPC.ChatFull chatFull = this.K;
            dVar2.f62112j = chatFull;
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
            y8 y8Var = new y8(this, context, this);
            this.H0 = y8Var;
            this.G0.addView(y8Var);
            this.V0.setCallFragmentContextView(this.H0);
        }
        FrameLayout.LayoutParams c12 = c8.na.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c12.topMargin = org.telegram.messenger.g0.f24220m;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c12);
        }
        C0();
        tv tvVar = new tv(11, context, this);
        this.Q0 = tvVar;
        tvVar.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i13), 100)));
        this.Q0.setFocusable(false);
        this.Q0.setImportantForAccessibility(2);
        this.Q0.setOnClickListener(new View.OnClickListener(this) {
            public final w91 f52923b;

            {
                this.f52923b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var2;
                switch (r2) {
                    case 0:
                        w91 w91Var = this.f52923b;
                        if (!w91Var.f53258t0) {
                            w91Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        w91 w91Var2 = this.f52923b;
                        w91Var2.getMessagesController().k2(-w91Var2.f53216a, null, w91Var2.g());
                        w91Var2.S0(false);
                        return;
                    case 2:
                        this.f52923b.finishPreviewFragment();
                        return;
                    case 3:
                        bx bxVar32 = this.f52923b.N0;
                        if (bxVar32 != null && (q0Var2 = bxVar32.f46573k0) != null) {
                            q0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        w91 w91Var3 = this.f52923b;
                        w91Var3.presentFragment(u81.f0(w91Var3.f53216a, 0L));
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
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) it.next();
                if (g2Var instanceof bx) {
                    bx bxVar4 = (bx) g2Var;
                    if (bxVar4.x4()) {
                        org.telegram.messenger.sr srVar = bxVar4.f46608r2;
                        if (srVar.f26946a == j3) {
                            this.R0 = srVar.f26947b;
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
        x81 x81Var = new x81(this);
        WeakHashMap weakHashMap = r0.i0.f56367a;
        r0.a0.i(view, x81Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i11 = org.telegram.messenger.ks.T;
        long j3 = this.f53216a;
        if (i7 == i11) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.K) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f28493id == j3) {
                S0(false);
                zh.d dVar = this.S0;
                if (dVar != null) {
                    dVar.f62112j = chatFull2;
                    dVar.d(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                D0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i7 == org.telegram.messenger.ks.f25329y5) {
            S0(false);
        } else if (i7 == org.telegram.messenger.ks.f25280r3) {
            if (j3 == (-((Long) objArr[2]).longValue())) {
                this.Y = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i7 == org.telegram.messenger.ks.f25295t5) {
            if (j3 == ((Long) objArr[0]).longValue()) {
                Z0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    C0();
                }
                E0();
            }
        } else if (i7 == org.telegram.messenger.ks.f25276r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.mp.I8;
            if (intValue == 8192) {
                S0(false);
            }
            if ((intValue & 512) > 0) {
                getMessagesController().f25864t7.y(j3, false);
                boolean canScrollVertically = this.O.canScrollVertically(-1);
                Z0(true, false);
                if (!canScrollVertically) {
                    this.G.n0(0);
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25283s) {
            Z0(false, false);
        } else if (i7 == org.telegram.messenger.ks.f25312w2) {
            Long l10 = (Long) objArr[0];
            if (j3 == l10.longValue()) {
                this.I0 = getMessagesController().i1(l10.longValue(), false, null);
                y8 y8Var = this.H0;
                if (y8Var != null) {
                    y8Var.a(!this.fragmentBeginToShow);
                }
                D0(false);
            }
        } else if (i7 == org.telegram.messenger.ks.f25209f0) {
            Z0(false, false);
            S0(true);
        } else if (i7 != org.telegram.messenger.ks.f25302u5 && i7 == org.telegram.messenger.ks.f25289t) {
            removeSelfFromStack(true);
        }
        if (i7 == org.telegram.messenger.ks.f25221h0 && getParentActivity() != null && this.inPreviewMode && org.telegram.messenger.g0.Q1()) {
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
        return getMessagesController().O0(Long.valueOf(this.f53216a));
    }

    @Override
    public final org.telegram.messenger.t3 getGroupCall() {
        org.telegram.messenger.t3 t3Var = this.I0;
        if (t3Var != null && (t3Var.f27034b instanceof TLRPC.TL_groupCall)) {
            return t3Var;
        }
        return null;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        s91 s91Var = this.f53257s0;
        if (s91Var != null && s91Var.f52006a0 != null) {
            int i7 = org.telegram.ui.Cells.y3.h;
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        int i7;
        if (this.f53258t0) {
            i7 = org.telegram.ui.ActionBar.n6.f29451d6;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.f29731s8;
        }
        int themedColor = getThemedColor(i7);
        if (this.actionBar.x()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.f29807w8);
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
        return this.f53240j1;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f53220b0.isEmpty()) {
            if (z10) {
                G0();
                return false;
            }
        } else if (this.f53258t0) {
            if (z10) {
                this.actionBar.A(this.f53251q0.U(false));
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
        org.telegram.messenger.mp messagesController = getMessagesController();
        long j3 = this.f53216a;
        messagesController.b3(0, j3, true);
        long j10 = -j3;
        this.f53229e1 = getMessagesController().z4(j10);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25329y5);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25280r3);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.T);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25295t5);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25276r);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25283s);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25312w2);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25209f0);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25302u5);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25289t);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25221h0);
        Z0(false, false);
        q11.t(this.currentAccount);
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(j3));
        if (org.telegram.messenger.v3.T(O0)) {
            getMessagesController().h5(O0, this.classGuid, false, null);
        }
        Long valueOf = Long.valueOf(j3);
        HashSet hashSet = f53215s1;
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
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25329y5);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25280r3);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.T);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25295t5);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25276r);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25283s);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25312w2);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25209f0);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25302u5);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25289t);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25221h0);
        org.telegram.messenger.mp messagesController = getMessagesController();
        long j3 = this.f53216a;
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
        if (org.telegram.messenger.v3.T(O0)) {
            getMessagesController().h5(O0, this.classGuid, true, null);
        }
        super.onFragmentDestroy();
        if (this.f53229e1) {
            this.f53229e1 = false;
            getMessagesController().h4(-j3);
        }
        bx bxVar = this.N0;
        if (bxVar != null && bxVar.H3 != null) {
            bxVar.getActionBar().setSearchAvatarImageView(null);
            this.N0.H3.N = true;
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        LongSparseIntArray longSparseIntArray = getMessagesController().f25864t7.f23576r;
        long j3 = this.f53216a;
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
        org.telegram.messenger.d00 d00Var = getMessagesController().f25864t7;
        LongSparseIntArray longSparseIntArray = d00Var.f23576r;
        long j3 = this.f53216a;
        longSparseIntArray.put(j3, longSparseIntArray.get(j3, 0) + 1);
        d00Var.y(j3, true);
        this.H = false;
        org.telegram.messenger.g0.Z3(this.O);
        this.H = true;
        setBulletinDelegate(new z8(this, 9));
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
            cVar.a(getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
        }
        if (this.X0 != null && (b10 = org.telegram.ui.ActionBar.b6.b(getThemedColor(org.telegram.ui.ActionBar.n6.Ue))) != this.f53255r1) {
            this.f53255r1 = b10;
            org.telegram.ui.ActionBar.n6.H1(this.X0.getBackground(), b10, true);
        }
        for (int i7 = 0; i7 < 2; i7++) {
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.H(getThemedColor(org.telegram.ui.ActionBar.n6.G8), true);
            this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.n6.E8), false, true);
            this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.n6.F8), true, true);
            this.actionBar.J(getThemedColor(org.telegram.ui.ActionBar.n6.I5), true);
        }
        tv tvVar = this.Q0;
        if (tvVar != null && (tvVar.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.Q0.getForeground()).setColor(i0.a.o(getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6), 100));
        }
        T0();
        try {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setActionModeColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
            }
            iv ivVar = this.f53263x;
            if (ivVar != null) {
                ivVar.i();
            }
            if (this.actionBar != null && this.f53224c1) {
                X0();
            }
            NumberTextView numberTextView = this.f53225d0;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29845y8));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.f53251q0;
            if (q0Var != null && q0Var.getSearchField() != null) {
                this.f53251q0.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.n6.Ne));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        wv wvVar;
        tv tvVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (tvVar = this.Q0) != null) {
            if (tvVar.getParent() != null) {
                ((ViewGroup) this.Q0.getParent()).removeView(this.Q0);
            }
            this.Q0.setBackground(null);
        }
        if (z10) {
            D0(false);
        }
        this.P0.e();
        if (!z10) {
            if (this.f53259u0 && this.I) {
                removeSelfFromStack();
                bx bxVar = this.M0;
                if (bxVar != null) {
                    bxVar.removeSelfFromStack();
                }
            } else if (this.J) {
                removeSelfFromStack();
                bx bxVar2 = this.N0;
                if (bxVar2 != null && (wvVar = bxVar2.H3) != null && wvVar.c()) {
                    this.N0.H3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        tv tvVar = this.Q0;
        if (tvVar != null && tvVar.getVisibility() == 0) {
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
    public final org.telegram.ui.Components.zn r() {
        return this.f53230f;
    }

    @Override
    public final void setPreviewOpenedProgress(float f10) {
        org.telegram.ui.Components.zn znVar = this.f53230f;
        if (znVar != null) {
            znVar.setAlpha(f10);
            this.f53254r0.setAlpha(f10);
            org.telegram.ui.ActionBar.q0 q0Var = this.f53251q0;
            if (q0Var != null) {
                q0Var.setAlpha(f10);
            }
            this.actionBar.getBackButton().setAlpha(f10);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f10) {
        org.telegram.ui.Components.zn znVar = this.f53230f;
        if (znVar != null) {
            znVar.setAlpha(f10);
            this.f53230f.setTranslationX((1.0f - f10) * org.telegram.messenger.g0.L(40.0f));
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
