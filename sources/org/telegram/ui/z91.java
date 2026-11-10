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
public class z91 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, org.telegram.ui.Components.jg, le0 {
    public static final HashSet f52342q1 = new HashSet();
    public HashSet A0;
    public boolean B0;
    public boolean C0;
    public int D;
    public di.g5 D0;
    public boolean E;
    public p91 E0;
    public c91 F;
    public FrameLayout F0;
    public boolean G;
    public x8 G0;
    public boolean H;
    public org.telegram.messenger.r3 H0;
    public boolean I;
    public n91 I0;
    public TLRPC.ChatFull J;
    public boolean J0;
    public boolean K;
    public org.telegram.ui.Components.si0 K0;
    public org.telegram.ui.Components.s41 L;
    public zw L0;
    public int M;
    public zw M0;
    public l91 N;
    public boolean N0;
    public e91 O;
    public final h2.f O0;
    public y91 P;
    public o00 P0;
    public org.telegram.ui.ActionBar.z0 Q;
    public long Q0;
    public org.telegram.ui.ActionBar.z0 R;
    public yh.d R0;
    public org.telegram.ui.ActionBar.z0 S;
    public float S0;
    public org.telegram.ui.ActionBar.z0 T;
    public boolean T0;
    public org.telegram.ui.ActionBar.z0 U;
    public org.telegram.ui.Components.or U0;
    public boolean V;
    public final boolean V0;
    public float W;
    public ImageView W0;
    public TL_stories.TL_premium_boostsStatus X;
    public float X0;
    public long Y;
    public ValueAnimator Y0;
    public boolean Z;
    public boolean Z0;
    public final long f52343a;
    public final HashSet f52344a0;
    public org.telegram.ui.Components.u61 f52345a1;
    public final ArrayList f52346b;
    public boolean f52347b0;
    public boolean f52348b1;
    public int f52349c;
    public NumberTextView f52350c0;
    public View f52351c1;
    public h91 d;
    public org.telegram.ui.ActionBar.r0 f52352d0;
    public int f52353d1;
    public k0 f52354e;
    public org.telegram.ui.ActionBar.r0 f52355e0;
    public int f52356e1;
    public org.telegram.ui.Components.jn f52357f;
    public org.telegram.ui.ActionBar.r0 f52358f0;
    public int f52359f1;
    public org.telegram.ui.ActionBar.r0 f52360g0;
    public final dh.g f52361g1;
    public org.telegram.ui.Components.p00 h;
    public org.telegram.ui.ActionBar.r0 f52362h0;
    public final ri.f f52363h1;
    public org.telegram.ui.ActionBar.r0 f52364i0;
    public final ri.f f52365i1;
    public org.telegram.ui.ActionBar.z0 f52366j0;
    public final ri.c f52367j1;
    public org.telegram.ui.ActionBar.z0 f52368k0;
    public final dh.c f52369k1;
    public org.telegram.ui.ActionBar.z0 f52370l0;
    public dh.k l1;
    public org.telegram.ui.ActionBar.r0 m0;
    public final ArrayList f52371m1;
    public v81 f52372n;
    public RadialProgressView f52373n0;
    public final RectF n1;
    public vq0 f52374o0;
    public final RectF f52375o1;
    public org.telegram.ui.ActionBar.r0 f52376p0;
    public int f52377p1;
    public org.telegram.ui.ActionBar.r0 f52378q0;
    public final q91 f52379r;
    public v91 f52380r0;
    public final org.telegram.messenger.k00 f52381s;
    public boolean f52382s0;
    public final boolean f52383t0;
    public final boolean f52384u0;
    public final boolean f52385v0;
    public aa1 f52386w;
    public final boolean f52387w0;
    public iv f52388x;
    public final boolean f52389x0;
    public int f52390y;
    public String f52391y0;
    public boolean f52392z0;

    public z91(Bundle bundle) {
        super(bundle);
        this.f52346b = new ArrayList();
        new ArrayList();
        this.f52379r = new q91(this);
        this.f52390y = 0;
        this.E = true;
        this.G = true;
        this.V = true;
        this.W = 0.0f;
        this.f52344a0 = new HashSet();
        this.B0 = false;
        this.O0 = new h2.f(new int[]{org.telegram.messenger.qs.f25066q5});
        this.S0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f52371m1 = arrayList;
        RectF rectF = new RectF();
        this.n1 = rectF;
        RectF rectF2 = new RectF();
        this.f52375o1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j3 = this.arguments.getLong("chat_id", 0L);
        this.f52343a = j3;
        this.f52383t0 = this.arguments.getBoolean("for_select", false);
        this.f52384u0 = this.arguments.getBoolean("forward_to", false);
        this.f52389x0 = this.arguments.getBoolean("bot_share_to", false);
        this.f52385v0 = this.arguments.getBoolean("quote", false);
        this.f52387w0 = this.arguments.getBoolean("reply_to", false);
        this.f52391y0 = this.arguments.getString("voicechat", null);
        this.f52392z0 = this.arguments.getBoolean("videochat", false);
        this.f52381s = getMessagesController().f24881q7;
        this.V0 = !org.telegram.messenger.k5.w("topics_end_reached_", j3, getUserConfig().k(), false);
        ri.c cVar = new ri.c();
        this.f52367j1 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f52361g1 = new dh.g(false);
            this.f52363h1 = new ri.f(null);
            ri.f fVar = new ri.f(null);
            this.f52365i1 = fVar;
            dh.c cVar2 = new dh.c(fVar, fVar, fVar);
            this.f52369k1 = cVar2;
            cVar2.f8713k = true;
            return;
        }
        this.f52361g1 = null;
        this.f52363h1 = null;
        this.f52365i1 = null;
        this.f52369k1 = new dh.c(cVar, cVar, cVar);
    }

    public static org.telegram.ui.ActionBar.f2 I0(org.telegram.messenger.qp qpVar, org.telegram.messenger.yr yrVar, Bundle bundle) {
        long j3 = bundle.getLong("chat_id");
        if (j3 != 0) {
            TLRPC.Dialog S0 = qpVar.S0(-j3);
            if (S0 != null && S0.view_forum_as_messages) {
                return new cn(bundle);
            }
            TLRPC.ChatFull N0 = qpVar.N0(j3);
            if (N0 == null) {
                N0 = yrVar.F0(j3, true, new CountDownLatch(1), false, false, 0);
            }
            if (N0 != null && N0.view_forum_as_messages) {
                return new cn(bundle);
            }
        }
        return new z91(bundle);
    }

    public static org.telegram.ui.ActionBar.f2 J0(LaunchActivity launchActivity, Bundle bundle) {
        return I0(org.telegram.messenger.qp.s1(launchActivity.O), org.telegram.messenger.yr.a0(launchActivity.O), bundle);
    }

    public static void M0(org.telegram.ui.cn r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z91.M0(org.telegram.ui.cn):void");
    }

    public static boolean Z(z91 z91Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(z91Var.currentAccount).f24768d7.edit();
        edit.putLong("dialog_join_requested_time_" + (-z91Var.f52343a), System.currentTimeMillis()).commit();
        Activity parentActivity = z91Var.getParentActivity();
        boolean V = org.telegram.messenger.t3.V(z91Var.g());
        int i7 = org.telegram.ui.Components.b70.f32131t1;
        org.telegram.ui.Components.b70.J0(parentActivity, z91Var, org.telegram.ui.Components.gc.a0(z91Var), V);
        z91Var.S0(true);
        return false;
    }

    public static void a0(z91 z91Var, View view) {
        long j3;
        long j10 = z91Var.f52343a;
        if (z91Var.getParentLayout() != null && !((ActionBarLayout) z91Var.getParentLayout()).y() && (view instanceof w91)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((w91) view).N;
            long j11 = -j10;
            boolean y22 = z91Var.getMessagesController().y2(j11);
            if (tL_forumTopic == null) {
                j3 = 0;
            } else if (y22) {
                j3 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
            } else {
                j3 = tL_forumTopic.f27012id;
            }
            long j12 = j3;
            if (z91Var.f52383t0) {
                aa1 aa1Var = z91Var.f52386w;
                if (aa1Var != null) {
                    ca1 ca1Var = aa1Var.f43624a;
                    Bundle bundle = new Bundle();
                    fa1 fa1Var = ca1Var.f44287a;
                    bundle.putLong("dialog_id", fa1Var.f45671c);
                    bundle.putLong("topic_id", tL_forumTopic.f27012id);
                    bundle.putBoolean("exception", true);
                    lx0 lx0Var = new lx0(bundle, null);
                    lx0Var.f47730s = new ok0(21, ca1Var, tL_forumTopic);
                    fa1Var.presentFragment(lx0Var);
                }
                zw zwVar = z91Var.L0;
                if (zwVar != null) {
                    zwVar.a4(j11, j12, true, z91Var);
                }
            } else if (z91Var.f52344a0.size() > 0) {
                z91Var.R0(view);
            } else {
                if (z91Var.inPreviewMode && org.telegram.messenger.g0.Q1()) {
                    for (org.telegram.ui.ActionBar.f2 f2Var : z91Var.getParentLayout().getFragmentStack()) {
                        if (f2Var instanceof zw) {
                            zw zwVar2 = (zw) f2Var;
                            if (zwVar2.t4()) {
                                org.telegram.messenger.xr xrVar = zwVar2.f52636q2;
                                if (xrVar.f26524a == j11 && xrVar.f26525b == j12) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    z91Var.Q0 = j12;
                    z91Var.Z0(false, false);
                }
                qg.d.m(z91Var, j10, tL_forumTopic, 0);
            }
        }
    }

    public static boolean b0(z91 z91Var, View view, float f10) {
        if (z91Var.f52383t0 || z91Var.getParentLayout() == null || ((ActionBarLayout) z91Var.getParentLayout()).y()) {
            return false;
        }
        if (!z91Var.actionBar.x() && !org.telegram.messenger.g0.Q1() && (view instanceof w91)) {
            w91 w91Var = (w91) view;
            if (w91Var.Z(f10)) {
                z91Var.Q0(w91Var);
                z91Var.N.I0(true);
                z91Var.N.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        z91Var.R0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void f0(z91 z91Var, boolean z9) {
        float f10;
        boolean z10;
        vv vvVar;
        z91Var.f52382s0 = z9;
        ValueAnimator valueAnimator = z91Var.Y0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            z91Var.Y0.cancel();
        }
        if (z91Var.f52345a1 == null) {
            org.telegram.ui.Components.u61 n10 = z91Var.f52380r0.n(8, false);
            z91Var.f52345a1 = n10;
            if (z91Var.M0 != null) {
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, n10, z91Var.getResourceProvider());
            }
            z91Var.f52354e.addView(z91Var.f52345a1, c8.ha.c(44.0f, -1));
        }
        float f11 = z91Var.W;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        z91Var.Y0 = ValueAnimator.ofFloat(f11, f10);
        org.telegram.messenger.g0.Z3(z91Var.f52380r0, false, 1.0f, true, true);
        zw zwVar = z91Var.M0;
        if (zwVar != null && (vvVar = zwVar.G3) != null) {
            vvVar.M = !z9;
        }
        if (!z9 && z91Var.f52380r0.getVisibility() == 0 && z91Var.f52380r0.getAlpha() == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        z91Var.Z0 = z10;
        z91Var.Y0.addUpdateListener(new kz0(z91Var, 13));
        z91Var.f52380r0.setVisibility(0);
        if (!z9) {
            z91Var.f52378q0.setVisibility(0);
        } else {
            org.telegram.messenger.g0.a3(z91Var.getParentActivity(), z91Var.classGuid);
            z91Var.U0(false);
        }
        z91Var.Y0.addListener(new j91(z91Var, z9, 0));
        z91Var.Y0.setDuration(200L);
        z91Var.Y0.setInterpolator(org.telegram.ui.Components.wq.f40046f);
        z91Var.Y0.start();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25072r4, Boolean.TRUE);
    }

    @Override
    public final ri.f B() {
        return this.f52365i1;
    }

    public final void B0() {
        dh.g gVar;
        View view;
        org.telegram.ui.ActionBar.l lVar;
        float f10;
        int i7;
        if (Build.VERSION.SDK_INT >= 31 && (gVar = this.f52361g1) != null) {
            int L = org.telegram.messenger.g0.L(48.0f);
            int L2 = org.telegram.messenger.g0.L(48.0f) + ((int) this.U0.c(org.telegram.messenger.g0.L(14.0f)));
            zw zwVar = this.M0;
            if (zwVar != null) {
                view = zwVar.fragmentView;
            } else {
                view = this.fragmentView;
            }
            if (zwVar != null) {
                lVar = zwVar.getActionBar();
            } else {
                lVar = this.actionBar;
            }
            int measuredHeight = (view.getMeasuredHeight() - this.f52359f1) - org.telegram.messenger.g0.L(8.0f);
            this.n1.set(0.0f, -L, view.getMeasuredWidth(), lVar.getMeasuredHeight() + L + L2);
            RectF rectF = this.f52375o1;
            rectF.set(0.0f, measuredHeight - org.telegram.messenger.g0.L(56.0f), view.getMeasuredWidth(), measuredHeight);
            if (org.telegram.messenger.sc.e(262144)) {
                f10 = 0.0f;
            } else {
                f10 = -org.telegram.messenger.g0.L(48.0f);
            }
            rectF.inset(0.0f, f10);
            if (this.M0 != null) {
                i7 = 2;
            } else {
                i7 = 1;
            }
            gVar.g(i7, this.f52371m1);
            gVar.e(this.l1, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final void C0() {
        c91 c91Var;
        org.telegram.messenger.k00 k00Var = this.f52381s;
        long j3 = this.f52343a;
        if (!k00Var.e(j3) && (c91Var = this.F) != null) {
            int N0 = c91Var.N0();
            if (this.f52346b.isEmpty() || N0 >= this.f52379r.b() - 5) {
                k00Var.o(j3);
            }
            E0();
        }
    }

    @Override
    public final org.telegram.ui.Components.st0 D() {
        return this.d;
    }

    public final void D0(boolean z9) {
        String str;
        org.telegram.messenger.qp messagesController = getMessagesController();
        long j3 = this.f52343a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        TLRPC.ChatFull N0 = getMessagesController().N0(j3);
        org.telegram.messenger.r3 r3Var = this.H0;
        if (r3Var != null && ((str = this.f52391y0) != null || this.f52392z0)) {
            org.telegram.ui.Components.voip.y1.l(M0, str, false, Boolean.valueOf(!r3Var.f25226b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f52391y0 = null;
            this.f52392z0 = false;
        } else if (this.f52391y0 != null && z9 && N0 != null && N0.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.k5.o(null, 2131748913, org.telegram.ui.Components.gc.a0(this), 2131624079, 36);
            this.f52391y0 = null;
        }
    }

    public final void E0() {
        boolean z9;
        org.telegram.messenger.k00 k00Var = this.f52381s;
        a0.h hVar = k00Var.f23644a;
        LongSparseIntArray longSparseIntArray = k00Var.f23646c;
        long j3 = this.f52343a;
        if (longSparseIntArray.get(j3, 0) == 1 && (hVar.f(j3) == null || ((ArrayList) hVar.f(j3)).isEmpty())) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.J0 = z9;
        if (this.D0 != null) {
            ArrayList arrayList = this.f52346b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((r91) arrayList.get(0)).f49322c != null && ((r91) arrayList.get(0)).f49322c.f27012id == 1)) {
                this.D0.e(this.J0, this.fragmentBeginToShow);
            }
        }
        l91 l91Var = this.N;
        if (l91Var != null) {
            l91Var.K0(l91Var.w1());
        }
        U0(true);
    }

    public final void F0() {
        int i7;
        float f10;
        float f11;
        zw zwVar = this.M0;
        float f12 = 0.0f;
        if (zwVar != null) {
            int L = org.telegram.messenger.g0.L(14.0f);
            org.telegram.ui.Components.or orVar = zwVar.K1;
            if (orVar != null) {
                f10 = orVar.c(L);
            } else {
                f10 = 0.0f;
            }
            float f13 = f10 + 0.0f;
            org.telegram.ui.Components.or orVar2 = this.U0;
            if (orVar2 != null) {
                float L2 = org.telegram.messenger.g0.L(7.0f);
                org.telegram.ui.Components.or orVar3 = this.M0.K1;
                if (orVar3 != null) {
                    f11 = orVar3.getMetadata().f55514c.f55524a;
                } else {
                    f11 = 0.0f;
                }
                orVar2.setTranslationY(f13 - (f11 * L2));
                org.telegram.ui.Components.or orVar4 = this.U0;
                int L3 = org.telegram.messenger.g0.L(14.0f);
                int L4 = org.telegram.messenger.g0.L(7.0f);
                org.telegram.ui.Components.or orVar5 = this.M0.K1;
                if (orVar5 != null) {
                    f12 = orVar5.getMetadata().f55514c.f55524a;
                }
                f12 = orVar4.c(org.telegram.messenger.g0.W1(f12, L3, L4)) + f13;
            } else {
                f12 = f13;
            }
        } else {
            org.telegram.ui.Components.or orVar6 = this.U0;
            if (orVar6 != null) {
                f12 = 0.0f + orVar6.c(org.telegram.messenger.g0.L(14.0f));
            }
        }
        int i10 = this.f52359f1 + this.f52353d1;
        if (this.V) {
            i7 = org.telegram.messenger.g0.L(51.0f);
        } else {
            i7 = 0;
        }
        this.N.setPadding(0, (int) f12, 0, i10 + i7);
    }

    public final void G0() {
        this.f52344a0.clear();
        this.actionBar.w();
        org.telegram.messenger.g0.b4(this.N);
        V0();
    }

    public final void H0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String K0 = org.telegram.messenger.id.K0(hashSet.size(), "DeleteTopics");
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.R = K0;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            u1Var.T = org.telegram.messenger.id.a0(null, null, 2131751498, this.f52381s.f(this.f52343a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            u1Var.T = org.telegram.messenger.id.M0(2131751497, null);
        }
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new a1.d(this, hashSet, arrayList, runnable, 22));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new jo0(10));
        u1Var.show();
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, getResourceProvider());
        }
    }

    @Override
    public final boolean J() {
        return false;
    }

    public final void K0(boolean z9, boolean z10) {
        boolean z11 = true;
        this.h.e(!z9, (this.fragmentBeginToShow && z10) ? false : false);
    }

    @Override
    public final long L() {
        return 0L;
    }

    public final void L0(boolean z9) {
        int i7;
        TLRPC.Chat g10;
        TLRPC.ChatPhoto chatPhoto;
        if (z9 && (g10 = g()) != null && ((chatPhoto = g10.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z9 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.f52343a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f52357f.getSharedMediaPreloader());
        profileActivity.d5(this.J);
        if (this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f52357f.getAvatarImageView().getImageReceiver().J() && z9) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        profileActivity.j5(i7);
        presentFragment(profileActivity);
    }

    public final void N0(int i7) {
        int i10;
        int i11;
        if (this.M != i7) {
            this.M = i7;
            org.telegram.ui.Components.s41 s41Var = this.L;
            if (i7 == 0) {
                i10 = org.telegram.ui.ActionBar.m6.f28119pf;
            } else {
                i10 = org.telegram.ui.ActionBar.m6.f28131q7;
            }
            s41Var.setTextColorKey(i10);
            ImageView imageView = this.W0;
            if (i7 == 1) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
            S0(false);
        }
    }

    public final void O0(boolean z9) {
        if (org.telegram.messenger.iz.o() == 0) {
            return;
        }
        h91 h91Var = this.d;
        if (h91Var != null) {
            if (z9) {
                h91Var.setLayerType(2, null);
                h91Var.setClipChildren(false);
                h91Var.setClipToPadding(false);
            } else {
                h91Var.setLayerType(0, null);
                h91Var.setClipChildren(true);
                h91Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void P0(float f10) {
        if (org.telegram.messenger.iz.o() != 0) {
            this.S0 = f10;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            l91 l91Var = this.N;
            if (l91Var != null) {
                float v = com.google.android.recaptcha.internal.a.v(1.0f, this.S0, 0.05f, 1.0f);
                l91Var.setPivotX(0.0f);
                l91Var.setPivotY(0.0f);
                l91Var.setScaleX(v);
                l91Var.setScaleY(v);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(v);
                this.actionBar.setScaleY(v);
            }
        }
    }

    public final void Q0(org.telegram.ui.Cells.t2 t2Var) {
        boolean z9;
        long j3;
        try {
            t2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232564, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = t2Var.N;
        org.telegram.ui.Components.xn xnVar = new org.telegram.ui.Components.xn(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new g91(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(xnVar.f40357f);
        xnVar.f40365o = 1;
        long j10 = this.f52343a;
        long j11 = -j10;
        xnVar.e(j11, tL_forumTopic.f27012id, null);
        if (org.telegram.messenger.t3.y(15, g())) {
            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                z0Var.j(org.telegram.messenger.id.M0(2131751452, null), 2131232413, null);
            } else {
                z0Var.j(org.telegram.messenger.id.M0(2131751453, null), 2131232293, null);
            }
            z0Var.setMinimumWidth(160);
            z9 = false;
            z0Var.setOnClickListener(new View.OnClickListener(this) {
                public final z91 f43986b;

                {
                    this.f43986b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            z91 z91Var = this.f43986b;
                            z91Var.C0 = true;
                            z91Var.N0 = true;
                            org.telegram.messenger.k00 k00Var = z91Var.f52381s;
                            long j12 = z91Var.f52343a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            k00Var.t(j12, tL_forumTopic2.f27012id, !tL_forumTopic2.pinned, z91Var);
                            z91Var.finishPreviewFragment();
                            return;
                        case 1:
                            z91 z91Var2 = this.f43986b;
                            z91Var2.N0 = true;
                            org.telegram.messenger.k00 k00Var2 = z91Var2.f52381s;
                            long j13 = z91Var2.f52343a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            k00Var2.z(tL_forumTopic3.f27012id, j13, true ^ tL_forumTopic3.closed);
                            z91Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f27012id));
                            z91 z91Var3 = this.f43986b;
                            z91Var3.H0(hashSet, new z81(z91Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(z0Var);
        } else {
            z9 = false;
        }
        org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(getParentActivity(), z9, z9);
        if (getMessagesController().r2(j11, tL_forumTopic.f27012id, null)) {
            z0Var2.j(org.telegram.messenger.id.M0(2131743849, null), 2131232256, null);
        } else {
            z0Var2.j(org.telegram.messenger.id.M0(2131748314, null), 2131232412, null);
        }
        z0Var2.setMinimumWidth(160);
        z0Var2.setOnClickListener(new di.u5(this, tL_forumTopic, (Serializable) r32, b10, 6));
        boolean z10 = false;
        r32[0].addView(z0Var2);
        if (org.telegram.messenger.t3.i(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                z0Var3.j(org.telegram.messenger.id.M0(2131746084, null), 2131232406, null);
            } else {
                z0Var3.j(org.telegram.messenger.id.M0(2131752039, null), 2131232404, null);
            }
            z0Var3.setMinimumWidth(160);
            z0Var3.setOnClickListener(new View.OnClickListener(this) {
                public final z91 f43986b;

                {
                    this.f43986b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            z91 z91Var = this.f43986b;
                            z91Var.C0 = true;
                            z91Var.N0 = true;
                            org.telegram.messenger.k00 k00Var = z91Var.f52381s;
                            long j12 = z91Var.f52343a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            k00Var.t(j12, tL_forumTopic2.f27012id, !tL_forumTopic2.pinned, z91Var);
                            z91Var.finishPreviewFragment();
                            return;
                        case 1:
                            z91 z91Var2 = this.f43986b;
                            z91Var2.N0 = true;
                            org.telegram.messenger.k00 k00Var2 = z91Var2.f52381s;
                            long j13 = z91Var2.f52343a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            k00Var2.z(tL_forumTopic3.f27012id, j13, true ^ tL_forumTopic3.closed);
                            z91Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f27012id));
                            z91 z91Var3 = this.f43986b;
                            z91Var3.H0(hashSet, new z81(z91Var3, 3));
                            return;
                    }
                }
            });
            z10 = false;
            r32[0].addView(z0Var3);
        }
        if (org.telegram.messenger.t3.e(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(getParentActivity(), z10, true);
            z0Var4.j(org.telegram.messenger.id.K0(1, "DeleteTopics"), 2131232108, null);
            z0Var4.c(org.telegram.ui.ActionBar.m6.f28131q7, org.telegram.ui.ActionBar.m6.f28111p7);
            z0Var4.setMinimumWidth(160);
            z0Var4.setOnClickListener(new View.OnClickListener(this) {
                public final z91 f43986b;

                {
                    this.f43986b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r3) {
                        case 0:
                            z91 z91Var = this.f43986b;
                            z91Var.C0 = true;
                            z91Var.N0 = true;
                            org.telegram.messenger.k00 k00Var = z91Var.f52381s;
                            long j12 = z91Var.f52343a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            k00Var.t(j12, tL_forumTopic2.f27012id, !tL_forumTopic2.pinned, z91Var);
                            z91Var.finishPreviewFragment();
                            return;
                        case 1:
                            z91 z91Var2 = this.f43986b;
                            z91Var2.N0 = true;
                            org.telegram.messenger.k00 k00Var2 = z91Var2.f52381s;
                            long j13 = z91Var2.f52343a;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            k00Var2.z(tL_forumTopic3.f27012id, j13, true ^ tL_forumTopic3.closed);
                            z91Var2.finishPreviewFragment();
                            return;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.f27012id));
                            z91 z91Var3 = this.f43986b;
                            z91Var3.H0(hashSet, new z81(z91Var3, 3));
                            return;
                    }
                }
            });
            r32[0].addView(z0Var4);
        }
        boolean y22 = getMessagesController().y2(j11);
        if (this.P0 != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            this.parentLayout.getView().draw(canvas);
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
            this.P0.setBackground(new BitmapDrawable(createBitmap));
            this.P0.setAlpha(0.0f);
            if (this.P0.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.parentLayout.getOverlayContainerView().addView(this.P0, c8.ha.c(-1.0f, -1));
        }
        cn cnVar = new cn(a8.p0.j(j10, "chat_id"));
        if (y22) {
            j3 = org.telegram.messenger.m5.o(t2Var.N.from_id);
        } else {
            j3 = t2Var.N.f27012id;
        }
        qg.d.a(cnVar, org.telegram.messenger.xr.a(j11, j3));
        presentFragmentAsPreviewWithMenu(cnVar, r32[0]);
    }

    public final void R0(android.view.View r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z91.R0(android.view.View):void");
    }

    public final void S0(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z91.S0(boolean):void");
    }

    public final void T0() {
        RadialProgressView radialProgressView = this.f52373n0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.m6.f28119pf));
        this.h.updateColors();
        vq0 vq0Var = this.f52374o0;
        int i7 = org.telegram.ui.ActionBar.m6.f27890d6;
        vq0Var.setBackgroundColor(getThemedColor(i7));
        this.actionBar.setActionModeColor(getThemedColor(i7));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.m6.f28170s8));
        }
        this.f52380r0.setBackgroundColor(getThemedColor(i7));
    }

    public final void U0(boolean z9) {
        boolean z10;
        if (this.Q == null) {
            return;
        }
        org.telegram.messenger.qp messagesController = getMessagesController();
        long j3 = this.f52343a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        int i7 = 0;
        if (!org.telegram.messenger.t3.r0(getMessagesController().M0(Long.valueOf(j3))) && org.telegram.messenger.t3.w(15, M0) && !this.f52382s0 && !this.f52383t0 && !this.J0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K = z10;
        org.telegram.ui.ActionBar.z0 z0Var = this.Q;
        if (!z10) {
            i7 = 8;
        }
        z0Var.setVisibility(i7);
        K0(!this.K, z9);
    }

    public final void V0() {
        boolean z9;
        if (org.telegram.messenger.t3.y(15, g()) && !this.f52344a0.isEmpty()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f52347b0 != z9) {
            this.f52347b0 = z9;
            q91 q91Var = this.f52379r;
            q91Var.k(0, q91Var.b());
        }
    }

    @Override
    public final boolean W(MotionEvent motionEvent, boolean z9) {
        return false;
    }

    public final void W0(float f10) {
        this.W = f10;
        X0();
        this.f52348b1 = true;
        float f11 = 1.0f - f10;
        this.f52357f.getTitleTextView().setAlpha(f11);
        this.f52357f.getSubtitleTextView().setAlpha(f11);
        org.telegram.ui.Components.u61 u61Var = this.f52345a1;
        if (u61Var != null) {
            u61Var.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
            this.f52345a1.setAlpha(f10);
        }
        this.f52380r0.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
        this.f52380r0.setAlpha(f10);
        if (isInPreviewMode()) {
            this.f52354e.invalidate();
        }
        this.d.invalidate();
        this.N.setAlpha(f11);
        if (this.Z0) {
            float z9 = com.google.android.recaptcha.internal.a.z(1.0f, this.W, 0.02f, 0.98f);
            this.N.setScaleX(z9);
            this.N.setScaleY(z9);
        }
    }

    public final void X0() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.f28227v8);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.m6.f28284y8;
        lVar.G(i0.a.f(this.W, themedColor, getThemedColor(i7)), false);
        this.actionBar.G(i0.a.f(this.W, getThemedColor(i7), getThemedColor(i7)), true);
        this.actionBar.E(i0.a.f(this.W, getThemedColor(org.telegram.ui.ActionBar.m6.f28188t8), getThemedColor(org.telegram.ui.ActionBar.m6.f28302z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.f(this.W, getThemedColor(org.telegram.ui.ActionBar.m6.f28170s8), getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6)));
        }
    }

    public final void Y0() {
        di.g5 g5Var = this.D0;
        if (g5Var != null && g5Var.f32368e != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
            org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131231244, 0);
            wpVar.c(org.telegram.messenger.g0.L(16.0f));
            spannableStringBuilder.setSpan(wpVar, 0, 1, 0);
            if (org.telegram.messenger.t3.y(15, g())) {
                this.D0.f32368e.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748136, null)), spannableStringBuilder, "%s"));
                return;
            }
            String M0 = org.telegram.messenger.id.M0(2131750474, null);
            TLRPC.TL_forumTopic f10 = getMessagesController().f24881q7.f(this.f52343a, 1L);
            if (f10 != null) {
                M0 = f10.title;
            }
            this.D0.f32368e.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("NoTopicsDescriptionUser", null, 2131748135, M0)));
        }
    }

    public final void Z0(boolean z9, boolean z10) {
        c91 c91Var;
        n91 n91Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z9 && this.N0) {
            z9 = true;
        }
        this.N0 = false;
        org.telegram.messenger.k00 k00Var = this.f52381s;
        long j3 = this.f52343a;
        ArrayList l10 = k00Var.l(j3);
        if (l10 != null) {
            ArrayList arrayList = this.f52346b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            n91 n91Var2 = null;
            if (org.telegram.messenger.t10.u(org.telegram.messenger.qp.s1(this.currentAccount).a2(Long.valueOf(-j3))) && this.f52384u0) {
                arrayList.add(new r91(3, null));
            }
            for (int i7 = 0; i7 < l10.size(); i7++) {
                HashSet hashSet = this.A0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l10.get(i7)).f27012id))) {
                    arrayList.add(new r91(0, (TLRPC.TL_forumTopic) l10.get(i7)));
                }
            }
            if (!arrayList.isEmpty() && !k00Var.e(j3) && this.V0) {
                arrayList.add(new r91(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z10 && size2 > size) {
                this.K0.b(size + 4);
                z9 = false;
            }
            this.f52390y = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                r91 r91Var = (r91) arrayList.get(i10);
                if (r91Var != null && (tL_forumTopic = r91Var.f49322c) != null && tL_forumTopic.hidden) {
                    this.f52390y++;
                }
            }
            l91 l91Var = this.N;
            if (l91Var != null) {
                v4.l0 itemAnimator = l91Var.getItemAnimator();
                if (z9) {
                    n91Var = this.I0;
                } else {
                    n91Var = null;
                }
                if (itemAnimator != n91Var) {
                    l91 l91Var2 = this.N;
                    if (z9) {
                        n91Var2 = this.I0;
                    }
                    l91Var2.setItemAnimator(n91Var2);
                }
            }
            q91 q91Var = this.f52379r;
            if (q91Var != null) {
                q91Var.E(arrayList2, arrayList);
            }
            if ((this.C0 || size == 0) && (c91Var = this.F) != null) {
                c91Var.h1(0, 0);
                this.C0 = false;
            }
        }
        E0();
        Y0();
    }

    @Override
    public final long a() {
        return -this.f52343a;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28188t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28227v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28170s8));
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
        boolean z9;
        boolean z10;
        boolean z11;
        int i11;
        boolean z12;
        SpannableStringBuilder spannableStringBuilder;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        zw zwVar = this.M0;
        if (zwVar != null && zwVar.W) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        this.f52353d1 = i7;
        zw zwVar2 = this.M0;
        if (zwVar2 != null && zwVar2.W) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        } else {
            i10 = 0;
        }
        this.f52356e1 = i10;
        h91 h91Var = new h91(this, context);
        this.d = h91Var;
        this.fragmentView = h91Var;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, h91Var, getResourceProvider());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if ((!org.telegram.messenger.g0.Q1() || ((r4Var2 = this.parentLayout) != null && ((ActionBarLayout) r4Var2).f27237b)) && !this.inPreviewMode) {
            z9 = true;
        } else {
            z9 = false;
        }
        lVar.setOccupyStatusBar(z9);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.actionBar.setActionBarMenuOnItemClick(new k91(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final z91 f51965b;

            {
                this.f51965b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.r0 r0Var;
                switch (r2) {
                    case 0:
                        z91 z91Var = this.f51965b;
                        if (!z91Var.f52382s0) {
                            z91Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        z91 z91Var2 = this.f51965b;
                        z91Var2.getMessagesController().i2(-z91Var2.f52343a, null, z91Var2.g());
                        z91Var2.S0(false);
                        return;
                    case 2:
                        this.f51965b.finishPreviewFragment();
                        return;
                    case 3:
                        zw zwVar3 = this.f51965b.M0;
                        if (zwVar3 != null && (r0Var = zwVar3.f52603j0) != null) {
                            r0Var.performClick();
                            return;
                        }
                        return;
                    default:
                        z91 z91Var3 = this.f51965b;
                        z91Var3.presentFragment(x81.f0(z91Var3.f52343a, 0L));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        if (this.M0 != null) {
            org.telegram.ui.ActionBar.r0 a10 = s5.a(0, 2131232486);
            this.f52376p0 = a10;
            a10.setOnClickListener(new View.OnClickListener(this) {
                public final z91 f51965b;

                {
                    this.f51965b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.r0 r0Var;
                    switch (r2) {
                        case 0:
                            z91 z91Var = this.f51965b;
                            if (!z91Var.f52382s0) {
                                z91Var.L0(false);
                                return;
                            }
                            return;
                        case 1:
                            z91 z91Var2 = this.f51965b;
                            z91Var2.getMessagesController().i2(-z91Var2.f52343a, null, z91Var2.g());
                            z91Var2.S0(false);
                            return;
                        case 2:
                            this.f51965b.finishPreviewFragment();
                            return;
                        case 3:
                            zw zwVar3 = this.f51965b.M0;
                            if (zwVar3 != null && (r0Var = zwVar3.f52603j0) != null) {
                                r0Var.performClick();
                                return;
                            }
                            return;
                        default:
                            z91 z91Var3 = this.f51965b;
                            z91Var3.presentFragment(x81.f0(z91Var3.f52343a, 0L));
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.r0 a11 = s5.a(0, 2131232486);
            this.f52376p0 = a11;
            a11.N();
            a11.J(new kg.v1(this, 22));
            this.f52376p0.setSearchPaddingStart(56);
            this.f52376p0.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
            EditTextBoldCursor searchField = this.f52376p0.getSearchField();
            org.telegram.ui.ActionBar.t6.U(searchField, org.telegram.ui.ActionBar.m6.G6, getResourceProvider());
            org.telegram.ui.ActionBar.t6.D(searchField, org.telegram.ui.ActionBar.m6.Gj, getResourceProvider());
            org.telegram.ui.ActionBar.t6.v(searchField, org.telegram.ui.ActionBar.m6.Ke, getResourceProvider());
        }
        org.telegram.ui.ActionBar.r0 c10 = s5.c(0, 2131231244, null);
        this.f52378q0 = c10;
        c10.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        this.f52378q0.e(1, 2131232113, org.telegram.messenger.id.M0(2131744002, null));
        this.R = this.f52378q0.e(2, 2131232045, org.telegram.messenger.id.M0(2131754401, null));
        org.telegram.ui.ActionBar.r0 r0Var = this.f52378q0;
        this.T = r0Var.d(14, 0, new org.telegram.ui.Components.zg0(2131623944, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f)), org.telegram.messenger.id.M0(2131753585, null), true, false, r0Var.m0);
        this.Q = this.f52378q0.e(3, 2131232405, org.telegram.messenger.id.M0(2131751702, null));
        this.U = this.f52378q0.e(15, 2131232333, org.telegram.messenger.id.M0(2131746230, null));
        this.S = this.f52378q0.d(11, 2131232195, null, org.telegram.messenger.id.M0(2131748990, null), true, false, null);
        org.telegram.ui.Components.jn jnVar = new org.telegram.ui.Components.jn(context, this, false, this.resourceProvider);
        this.f52357f = jnVar;
        jnVar.getAvatarImageView().setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.jn jnVar2 = this.f52357f;
        if ((!org.telegram.messenger.g0.Q1() || ((r4Var = this.parentLayout) != null && ((ActionBarLayout) r4Var).f27237b)) && !this.inPreviewMode) {
            z10 = true;
        } else {
            z10 = false;
        }
        jnVar2.setOccupyStatusBar(z10);
        org.telegram.ui.Components.jn jnVar3 = this.f52357f;
        long j3 = -this.f52343a;
        if (j3 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        jnVar3.f34992b = z11;
        jnVar3.setClipChildren(false);
        this.actionBar.addView(this.f52357f, 0, c8.ha.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.f52383t0) {
            this.f52357f.getAvatarImageView().setOnClickListener(new z7(this, 4));
        }
        this.N = new l91(this, context);
        jh.k kVar = new jh.k(this.d);
        ViewGroup viewGroup = this.d;
        dh.c cVar = this.f52369k1;
        cVar.h = kVar;
        cVar.f8711i = viewGroup;
        l91 l91Var = this.N;
        zw zwVar3 = this.M0;
        if (zwVar3 != null) {
            viewGroup = (ViewGroup) zwVar3.getFragmentView();
        }
        l91 l91Var2 = this.N;
        Objects.requireNonNull(l91Var2);
        this.l1 = new dh.k(l91Var, viewGroup, new q40(l91Var2, 2));
        this.N.D0(new z81(this, 5));
        SpannableString spannableString = new SpannableString("#");
        qg.c c11 = qg.d.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        iv ivVar = new iv(this, org.telegram.messenger.g0.K2(org.telegram.messenger.id.M0(2131754719, null), spannableString, "#"), org.telegram.messenger.g0.K2(org.telegram.messenger.id.M0(2131754721, null), spannableString, "#"));
        this.f52388x = ivVar;
        ivVar.b();
        if (this.E) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        this.D = i11;
        iv ivVar2 = this.f52388x;
        if (i11 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        ivVar2.X = z12;
        n91 n91Var = new n91(this);
        this.N.setHideIfEmpty(false);
        n91Var.f57079m = false;
        n91Var.C = false;
        l91 l91Var3 = this.N;
        this.I0 = n91Var;
        l91Var3.setItemAnimator(n91Var);
        this.N.setOnScrollListener(new o91(this, 0));
        l91 l91Var4 = this.N;
        l91Var4.W1 = true;
        l91Var4.X1 = 0;
        org.telegram.ui.Components.si0 si0Var = new org.telegram.ui.Components.si0(l91Var4, true);
        this.K0 = si0Var;
        this.N.setItemsEnterAnimator(si0Var);
        this.N.setOnItemClickListener(new ay0(this, 9));
        this.N.setOnItemLongClickListener(new a91(this));
        this.N.setOnScrollListener(new o91(this, 1));
        l91 l91Var5 = this.N;
        c91 c91Var = new c91(this);
        this.F = c91Var;
        l91Var5.setLayoutManager(c91Var);
        new SparseArray();
        new HashMap();
        this.N.setAdapter(this.f52379r);
        this.N.setClipToPadding(false);
        this.N.j(new d91(this));
        y91 y91Var = new y91(this);
        this.P = y91Var;
        e91 e91Var = new e91(this, y91Var);
        this.O = e91Var;
        e91Var.h(this.N);
        this.d.addView(this.N, c8.ha.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = -org.telegram.messenger.g0.L(100.0f);
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(getParentActivity(), this.resourceProvider, false);
        this.h = p00Var;
        this.d.addView(p00Var, org.telegram.ui.Components.p00.b());
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final z91 f51965b;

            {
                this.f51965b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.r0 r0Var2;
                switch (r2) {
                    case 0:
                        z91 z91Var = this.f51965b;
                        if (!z91Var.f52382s0) {
                            z91Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        z91 z91Var2 = this.f51965b;
                        z91Var2.getMessagesController().i2(-z91Var2.f52343a, null, z91Var2.g());
                        z91Var2.S0(false);
                        return;
                    case 2:
                        this.f51965b.finishPreviewFragment();
                        return;
                    case 3:
                        zw zwVar32 = this.f51965b.M0;
                        if (zwVar32 != null && (r0Var2 = zwVar32.f52603j0) != null) {
                            r0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        z91 z91Var3 = this.f51965b;
                        z91Var3.presentFragment(x81.f0(z91Var3.f52343a, 0L));
                        return;
                }
            }
        });
        this.h.f36738c.setImageResource(2131231266);
        this.h.f36738c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.f36738c.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        this.h.setContentDescription(org.telegram.messenger.id.M0(2131751702, null));
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
        lzVar.setViewType(24);
        lzVar.setVisibility(8);
        lzVar.f35774x = true;
        v81 v81Var = new v81(context, 1);
        TextView textView = new TextView(context);
        v81Var.d = textView;
        if (org.telegram.messenger.id.f23161a0) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(2131230874, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131744259, null));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131744259, null));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(2131230872, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28282y6, getResourceProvider());
        boolean z13 = org.telegram.messenger.id.f23161a0;
        if (z13) {
            f10 = 72.0f;
        } else {
            f10 = 32.0f;
        }
        if (z13) {
            f11 = 32.0f;
        } else {
            f11 = 72.0f;
        }
        v81Var.addView(textView, c8.ha.d(-2, -2.0f, 81, f10, 0.0f, f11, 32.0f));
        this.f52372n = v81Var;
        textView.setAlpha(0.0f);
        di.g5 g5Var = new di.g5(this, context, lzVar);
        this.D0 = g5Var;
        try {
            g5Var.f32366b.getImageReceiver().W(2);
        } catch (Exception unused) {
        }
        this.D0.e(this.J0, this.fragmentBeginToShow);
        this.D0.d.setText(org.telegram.messenger.id.M0(2131748138, null));
        Y0();
        this.f52372n.addView(lzVar);
        this.f52372n.addView(this.D0);
        this.d.addView(this.f52372n);
        this.N.setEmptyView(this.f52372n);
        this.f52374o0 = new vq0(context, 12);
        org.telegram.ui.Components.s41 s41Var = new org.telegram.ui.Components.s41(context);
        this.L = s41Var;
        this.f52374o0.addView(s41Var);
        this.d.addView(this.f52374o0, c8.ha.e(-1, 51, 80));
        this.L.setOnClickListener(new f91(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f52373n0 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(22.0f));
        this.f52373n0.setVisibility(4);
        this.f52374o0.addView(this.f52373n0, c8.ha.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(2131231983);
        this.W0.setContentDescription(org.telegram.messenger.id.M0(2131752041, null));
        ImageView imageView2 = this.W0;
        int i12 = org.telegram.ui.ActionBar.m6.Re;
        imageView2.setBackground(org.telegram.ui.ActionBar.b6.c(null, org.telegram.ui.ActionBar.b6.b(getThemedColor(i12))));
        org.telegram.ui.ActionBar.t6.s(this.W0, i12, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        this.W0.setScaleType(ImageView.ScaleType.CENTER);
        this.f52374o0.addView(this.W0, c8.ha.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.W0.setOnClickListener(new View.OnClickListener(this) {
            public final z91 f51965b;

            {
                this.f51965b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.r0 r0Var2;
                switch (r2) {
                    case 0:
                        z91 z91Var = this.f51965b;
                        if (!z91Var.f52382s0) {
                            z91Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        z91 z91Var2 = this.f51965b;
                        z91Var2.getMessagesController().i2(-z91Var2.f52343a, null, z91Var2.g());
                        z91Var2.S0(false);
                        return;
                    case 2:
                        this.f51965b.finishPreviewFragment();
                        return;
                    case 3:
                        zw zwVar32 = this.f51965b.M0;
                        if (zwVar32 != null && (r0Var2 = zwVar32.f52603j0) != null) {
                            r0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        z91 z91Var3 = this.f51965b;
                        z91Var3.presentFragment(x81.f0(z91Var3.f52343a, 0L));
                        return;
                }
            }
        });
        this.W0.setVisibility(8);
        S0(false);
        k0 k0Var = new k0(27, context, this);
        this.f52354e = k0Var;
        if (this.M0 == null) {
            this.d.addView(k0Var, c8.ha.e(-1, -1, 119));
        }
        v91 v91Var = new v91(this, context);
        this.f52380r0 = v91Var;
        v91Var.setVisibility(8);
        this.f52354e.addView(this.f52380r0, c8.ha.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        v91 v91Var2 = this.f52380r0;
        int i13 = org.telegram.ui.ActionBar.m6.f27890d6;
        org.telegram.ui.ActionBar.t6.h(i13, v91Var2, getResourceProvider());
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().F0(this.f52343a, true, null, true, false, 0);
        org.telegram.ui.Components.or orVar = new org.telegram.ui.Components.or(context);
        this.U0 = orVar;
        orVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
        fh.g c12 = cVar.c(this.U0, c8.g0.n(this.resourceProvider), false);
        org.telegram.messenger.camera.q.p(c12, org.telegram.messenger.g0.L(24.0f), 7.0f);
        this.U0.setBlurredBackground(c12);
        this.U0.setOnAnimatedHeightChangedListener(new z81(this, 0));
        this.d.addView(this.U0, c8.ha.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            yh.d dVar = new yh.d(g10, this);
            this.R0 = dVar;
            this.U0.addView(dVar.b(), c8.ha.o(-1, 40));
            this.U0.h(3, this.R0.b());
            this.U0.g(this.R0.b());
            yh.d dVar2 = this.R0;
            dVar2.f59526m = new a91(this);
            TLRPC.ChatFull chatFull = this.J;
            dVar2.f59523j = chatFull;
            if (chatFull != null) {
                dVar2.d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.F0 = frameLayout;
            this.U0.addView(frameLayout);
            this.U0.h(4, this.F0);
            this.U0.g(this.F0);
            this.U0.i(this.F0, true, false);
            x8 x8Var = new x8(this, context, this);
            this.G0 = x8Var;
            this.F0.addView(x8Var);
            this.U0.setCallFragmentContextView(this.G0);
        }
        FrameLayout.LayoutParams c13 = c8.ha.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c13.topMargin = org.telegram.messenger.g0.f22561m;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c13);
        }
        C0();
        o00 o00Var = new o00(10, context, this);
        this.P0 = o00Var;
        o00Var.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i13), 100)));
        this.P0.setFocusable(false);
        this.P0.setImportantForAccessibility(2);
        this.P0.setOnClickListener(new View.OnClickListener(this) {
            public final z91 f51965b;

            {
                this.f51965b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.r0 r0Var2;
                switch (r2) {
                    case 0:
                        z91 z91Var = this.f51965b;
                        if (!z91Var.f52382s0) {
                            z91Var.L0(false);
                            return;
                        }
                        return;
                    case 1:
                        z91 z91Var2 = this.f51965b;
                        z91Var2.getMessagesController().i2(-z91Var2.f52343a, null, z91Var2.g());
                        z91Var2.S0(false);
                        return;
                    case 2:
                        this.f51965b.finishPreviewFragment();
                        return;
                    case 3:
                        zw zwVar32 = this.f51965b.M0;
                        if (zwVar32 != null && (r0Var2 = zwVar32.f52603j0) != null) {
                            r0Var2.performClick();
                            return;
                        }
                        return;
                    default:
                        z91 z91Var3 = this.f51965b;
                        z91Var3.presentFragment(x81.f0(z91Var3.f52343a, 0L));
                        return;
                }
            }
        });
        this.P0.setFitsSystemWindows(true);
        this.V = true;
        if (this.inPreviewMode && org.telegram.messenger.g0.Q1()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) it.next();
                if (f2Var instanceof zw) {
                    zw zwVar4 = (zw) f2Var;
                    if (zwVar4.t4()) {
                        org.telegram.messenger.xr xrVar = zwVar4.f52636q2;
                        if (xrVar.f26524a == j3) {
                            this.Q0 = xrVar.f26525b;
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
        a91 a91Var = new a91(this);
        WeakHashMap weakHashMap = r0.i0.f54202a;
        r0.a0.i(view, a91Var);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i11 = org.telegram.messenger.qs.T;
        long j3 = this.f52343a;
        if (i7 == i11) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.J) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.f26961id == j3) {
                S0(false);
                yh.d dVar = this.R0;
                if (dVar != null) {
                    dVar.f59523j = chatFull2;
                    dVar.d(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                D0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i7 == org.telegram.messenger.qs.f25099v5) {
            S0(false);
        } else if (i7 == org.telegram.messenger.qs.f25058p3) {
            if (j3 == (-((Long) objArr[2]).longValue())) {
                this.X = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i7 == org.telegram.messenger.qs.f25066q5) {
            if (j3 == ((Long) objArr[0]).longValue()) {
                Z0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    C0();
                }
                E0();
            }
        } else if (i7 == org.telegram.messenger.qs.f25067r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.qp.C8;
            if (intValue == 8192) {
                S0(false);
            }
            if ((intValue & 512) > 0) {
                getMessagesController().f24881q7.y(j3, false);
                boolean canScrollVertically = this.N.canScrollVertically(-1);
                Z0(true, false);
                if (!canScrollVertically) {
                    this.F.n0(0);
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25074s) {
            Z0(false, false);
        } else if (i7 == org.telegram.messenger.qs.f25103w2) {
            Long l10 = (Long) objArr[0];
            if (j3 == l10.longValue()) {
                this.H0 = getMessagesController().g1(l10.longValue(), false, null);
                x8 x8Var = this.G0;
                if (x8Var != null) {
                    x8Var.a(!this.fragmentBeginToShow);
                }
                D0(false);
            }
        } else if (i7 == org.telegram.messenger.qs.f25000f0) {
            Z0(false, false);
            S0(true);
        } else if (i7 != org.telegram.messenger.qs.f25073r5 && i7 == org.telegram.messenger.qs.f25080t) {
            removeSelfFromStack(true);
        }
        if (i7 == org.telegram.messenger.qs.f25012h0 && getParentActivity() != null && this.inPreviewMode && org.telegram.messenger.g0.Q1()) {
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue == (-j3) && !booleanValue) {
                if (this.Q0 != longValue2) {
                    this.Q0 = longValue2;
                    Z0(false, false);
                }
            } else if (this.Q0 != 0) {
                this.Q0 = 0L;
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
        return getMessagesController().M0(Long.valueOf(this.f52343a));
    }

    @Override
    public final org.telegram.messenger.r3 getGroupCall() {
        org.telegram.messenger.r3 r3Var = this.H0;
        if (r3Var != null && (r3Var.f25226b instanceof TLRPC.TL_groupCall)) {
            return r3Var;
        }
        return null;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        v91 v91Var = this.f52380r0;
        if (v91Var != null && v91Var.W != null) {
            int i7 = org.telegram.ui.Cells.x3.h;
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        int i7;
        if (this.f52382s0) {
            i7 = org.telegram.ui.ActionBar.m6.f27890d6;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.f28170s8;
        }
        int themedColor = getThemedColor(i7);
        if (this.actionBar.x()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.f28246w8);
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
    public final ri.f k() {
        return this.f52363h1;
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (!this.f52344a0.isEmpty()) {
            if (z9) {
                G0();
                return false;
            }
        } else if (this.f52382s0) {
            if (z9) {
                this.actionBar.A(this.f52376p0.T(false));
            }
        } else {
            return super.onBackPressed(z9);
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.m();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qp messagesController = getMessagesController();
        long j3 = this.f52343a;
        messagesController.V2(0, j3, true);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25099v5);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25058p3);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.T);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25066q5);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25067r);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25074s);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25103w2);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25000f0);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25073r5);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25080t);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25012h0);
        Z0(false, false);
        t11.t(this.currentAccount);
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j3));
        if (org.telegram.messenger.t3.T(M0)) {
            getMessagesController().V4(M0, this.classGuid, false, null);
        }
        Long valueOf = Long.valueOf(j3);
        HashSet hashSet = f52342q1;
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
        this.O0.e();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25099v5);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25058p3);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.T);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25066q5);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25067r);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25074s);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25103w2);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25000f0);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25073r5);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25080t);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25012h0);
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f52343a));
        if (org.telegram.messenger.t3.T(M0)) {
            getMessagesController().V4(M0, this.classGuid, true, null);
        }
        super.onFragmentDestroy();
        zw zwVar = this.M0;
        if (zwVar != null && zwVar.G3 != null) {
            zwVar.getActionBar().setSearchAvatarImageView(null);
            this.M0.G3.M = true;
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        LongSparseIntArray longSparseIntArray = getMessagesController().f24881q7.f23648f;
        long j3 = this.f52343a;
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
        org.telegram.messenger.k00 k00Var = getMessagesController().f24881q7;
        LongSparseIntArray longSparseIntArray = k00Var.f23648f;
        long j3 = this.f52343a;
        longSparseIntArray.put(j3, longSparseIntArray.get(j3, 0) + 1);
        k00Var.y(j3, true);
        this.G = false;
        org.telegram.messenger.g0.b4(this.N);
        this.G = true;
        setBulletinDelegate(new y8(this, 9));
        if (this.inPreviewMode && !getMessagesController().t2(-j3)) {
            finishFragment();
        }
    }

    @Override
    public final void onSlideProgress(boolean z9, float f10) {
        if (org.telegram.messenger.iz.o() != 0 && this.T0) {
            P0(f10);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int b10;
        super.onThemeColorsChanged();
        ri.c cVar = this.f52367j1;
        if (cVar != null) {
            cVar.a(getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
        }
        if (this.W0 != null && (b10 = org.telegram.ui.ActionBar.b6.b(getThemedColor(org.telegram.ui.ActionBar.m6.Re))) != this.f52377p1) {
            this.f52377p1 = b10;
            org.telegram.ui.ActionBar.m6.H1(this.W0.getBackground(), b10, true);
        }
        for (int i7 = 0; i7 < 2; i7++) {
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.H(getThemedColor(org.telegram.ui.ActionBar.m6.G8), true);
            this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.m6.E8), false, true);
            this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.m6.F8), true, true);
            this.actionBar.J(getThemedColor(org.telegram.ui.ActionBar.m6.I5), true);
        }
        o00 o00Var = this.P0;
        if (o00Var != null && (o00Var.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.P0.getForeground()).setColor(i0.a.o(getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6), 100));
        }
        T0();
        try {
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (lVar2 != null) {
                lVar2.setActionModeColor(getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
            }
            iv ivVar = this.f52388x;
            if (ivVar != null) {
                ivVar.i();
            }
            if (this.actionBar != null && this.f52348b1) {
                X0();
            }
            NumberTextView numberTextView = this.f52350c0;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.m6.f28284y8));
            }
            org.telegram.ui.ActionBar.r0 r0Var = this.f52376p0;
            if (r0Var != null && r0Var.getSearchField() != null) {
                this.f52376p0.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.m6.Ke));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        vv vvVar;
        o00 o00Var;
        super.onTransitionAnimationEnd(z9, z10);
        if (z9 && (o00Var = this.P0) != null) {
            if (o00Var.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.P0.setBackground(null);
        }
        if (z9) {
            D0(false);
        }
        this.O0.e();
        if (!z9) {
            if (this.f52383t0 && this.H) {
                removeSelfFromStack();
                zw zwVar = this.L0;
                if (zwVar != null) {
                    zwVar.removeSelfFromStack();
                }
            } else if (this.I) {
                removeSelfFromStack();
                zw zwVar2 = this.M0;
                if (zwVar2 != null && (vvVar = zwVar2.G3) != null && vvVar.c()) {
                    this.M0.G3.a();
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z9, float f10) {
        o00 o00Var = this.P0;
        if (o00Var != null && o00Var.getVisibility() == 0) {
            if (z9) {
                this.P0.setAlpha(1.0f - f10);
            } else {
                this.P0.setAlpha(f10);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        super.onTransitionAnimationStart(z9, z10);
        this.O0.d();
    }

    @Override
    public final void prepareFragmentToSlide(boolean z9, boolean z10) {
        if (!z9 && z10) {
            this.T0 = true;
            O0(true);
            return;
        }
        this.T0 = false;
        O0(false);
        P0(1.0f);
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.jn r() {
        return this.f52357f;
    }

    @Override
    public final void setPreviewOpenedProgress(float f10) {
        org.telegram.ui.Components.jn jnVar = this.f52357f;
        if (jnVar != null) {
            jnVar.setAlpha(f10);
            this.f52378q0.setAlpha(f10);
            org.telegram.ui.ActionBar.r0 r0Var = this.f52376p0;
            if (r0Var != null) {
                r0Var.setAlpha(f10);
            }
            this.actionBar.getBackButton().setAlpha(f10);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f10) {
        org.telegram.ui.Components.jn jnVar = this.f52357f;
        if (jnVar != null) {
            jnVar.setAlpha(f10);
            this.f52357f.setTranslationX((1.0f - f10) * org.telegram.messenger.g0.L(40.0f));
        }
    }

    @Override
    public final void v() {
        this.N.y0(0);
    }

    @Override
    public final void s() {
    }

    @Override
    public final void l(int i7, int i10, boolean z9, int i11, boolean z10, int i12) {
    }
}
