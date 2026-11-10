package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.UndoView;
public class zw extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, pg.b, te.b, le0 {
    public static float B4;
    public static boolean f52552y4;
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public FrameLayout B1;
    public boolean B2;
    public boolean B3;
    public iw C0;
    public mv C1;
    public boolean C2;
    public Long C3;
    public boolean D;
    public org.telegram.ui.Components.qs0 D0;
    public li.w1 D1;
    public tw D2;
    public Drawable D3;
    public boolean E;
    public sv E0;
    public org.telegram.ui.ActionBar.r0 E1;
    public ArrayList E2;
    public org.telegram.ui.Components.f5 E3;
    public boolean F;
    public org.telegram.ui.Components.mr F0;
    public final TextPaint F1;
    public String F2;
    public org.telegram.ui.Cells.o F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public kv G1;
    public CharSequence G2;
    public vv G3;
    public long H;
    public float H0;
    public FrameLayout H1;
    public org.telegram.ui.Components.po0 H2;
    public final lv H3;
    public ValueAnimator I;
    public float I0;
    public kv I1;
    public org.telegram.ui.Components.h41 I2;
    public final lv I3;
    public ValueAnimator J;
    public float J0;
    public FrameLayout J1;
    public final ArrayList J2;
    public f J3;
    public boolean K;
    public bi.ec K0;
    public org.telegram.ui.Components.or K1;
    public boolean K2;
    public ab.b0 K3;
    public boolean L;
    public org.telegram.ui.Components.k60 L0;
    public org.telegram.ui.Components.nr L1;
    public int L2;
    public Drawable L3;
    public boolean M;
    public xv M0;
    public org.telegram.ui.Cells.m M1;
    public int M2;
    public int M3;
    public float N;
    public boolean N0;
    public org.telegram.ui.Cells.b3 N1;
    public boolean N2;
    public boolean N3;
    public boolean O;
    public boolean O0;
    public org.telegram.ui.Cells.ma O1;
    public int O2;
    public boolean O3;
    public int P;
    public long P0;
    public Long P1;
    public int P2;
    public AnimatorSet P3;
    public boolean Q;
    public long Q0;
    public Long Q1;
    public int Q2;
    public boolean Q3;
    public boolean R;
    public long R0;
    public ji.j R1;
    public int R2;
    public pt R3;
    public org.telegram.ui.Components.bc S;
    public int S0;
    public ArrayList S1;
    public int S2;
    public String S3;
    public float T;
    public int T0;
    public boolean T1;
    public int T2;
    public ArrayList T3;
    public boolean U;
    public int U0;
    public org.telegram.ui.ActionBar.u1 U1;
    public int U2;
    public boolean U3;
    public boolean V;
    public boolean V0;
    public boolean V1;
    public int V2;
    public CharSequence V3;
    public boolean W;
    public org.telegram.ui.Components.nb0 W0;
    public boolean W1;
    public boolean W2;
    public boolean W3;
    public ow X;
    public org.telegram.ui.Cells.t2 X0;
    public long X1;
    public int X2;
    public float X3;
    public bg.p0 Y;
    public org.telegram.ui.Cells.t2 Y0;
    public TLObject Y1;
    public zw Y2;
    public boolean Y3;
    public gz0 Z;
    public boolean Z0;
    public int Z1;
    public long Z2;
    public boolean Z3;
    public final int f52554a;
    public org.telegram.ui.Components.u61 f52555a0;
    public boolean f52556a1;
    public int f52557a2;
    public TLRPC.Chat f52558a3;
    public ValueAnimator f52559a4;
    public final te.a f52560b;
    public jg.q0 f52561b0;
    public final ArrayList f52562b1;
    public boolean f52563b2;
    public TLRPC.ChatFull f52564b3;
    public org.telegram.ui.Components.j30 f52565b4;
    public final te.a f52566c;
    public float f52567c0;
    public boolean f52568c1;
    public boolean f52569c2;
    public org.telegram.ui.Components.k9 f52570c3;
    public TLRPC.FileLocation f52571c4;
    public final te.a d;
    public ValueAnimator f52572d0;
    public boolean f52573d1;
    public boolean d2;
    public org.telegram.ui.Components.v8 f52574d3;
    public TLRPC.FileLocation f52575d4;
    public final te.a f52576e;
    public yw[] f52577e0;
    public boolean f52578e1;
    public int f52579e2;
    public long f52580e3;
    public org.telegram.ui.Components.bc f52581e4;
    public final te.a f52582f;
    public org.telegram.ui.ActionBar.r0 f52583f0;
    public org.telegram.ui.ActionBar.y1 f52584f1;
    public boolean f52585f2;
    public boolean f52586f3;
    public int f52587f4;
    public org.telegram.ui.ActionBar.r0 f52588g0;
    public final Paint f52589g1;
    public String f52590g2;
    public boolean f52591g3;
    public int f52592g4;
    public final te.a h;
    public bx f52593h0;
    public ImageView f52594h1;
    public String f52595h2;
    public AnimatorSet f52596h3;
    public int f52597h4;
    public boolean f52598i0;
    public NumberTextView f52599i1;
    public String f52600i2;
    public boolean f52601i3;
    public int f52602i4;
    public org.telegram.ui.ActionBar.r0 f52603j0;
    public final ArrayList f52604j1;
    public boolean f52605j2;
    public boolean j3;
    public int f52606j4;
    public org.telegram.ui.ActionBar.r0 f52607k0;
    public org.telegram.ui.ActionBar.r0 f52608k1;
    public boolean f52609k2;
    public float f52610k3;
    public final dh.g f52611k4;
    public org.telegram.ui.ActionBar.r0 f52612l0;
    public org.telegram.ui.ActionBar.r0 l1;
    public boolean f52613l2;
    public boolean f52614l3;
    public final ri.f f52615l4;
    public org.telegram.ui.ActionBar.r0 m0;
    public org.telegram.ui.ActionBar.r0 f52616m1;
    public boolean f52617m2;
    public int f52618m3;
    public final ri.f f52619m4;
    public final te.a f52620n;
    public org.telegram.ui.Components.ig0 f52621n0;
    public org.telegram.ui.ActionBar.r0 n1;
    public boolean f52622n2;
    public boolean f52623n3;
    public final ri.c f52624n4;
    public org.telegram.ui.ActionBar.z0 f52625o0;
    public org.telegram.ui.ActionBar.z0 f52626o1;
    public String f52627o2;
    public boolean f52628o3;
    public final dh.c o4;
    public fi.m3 f52629p0;
    public org.telegram.ui.ActionBar.z0 f52630p1;
    public String f52631p2;
    public org.telegram.ui.Components.bc f52632p3;
    public final dh.c f52633p4;
    public fi.m3 f52634q0;
    public org.telegram.ui.ActionBar.z0 f52635q1;
    public final org.telegram.messenger.xr f52636q2;
    public final h2.f f52637q3;
    public final dh.c f52638q4;
    public final te.a f52639r;
    public boolean f52640r0;
    public org.telegram.ui.ActionBar.z0 f52641r1;
    public boolean f52642r2;
    public boolean f52643r3;
    public final dh.c f52644r4;
    public final te.a f52645s;
    public boolean f52646s0;
    public org.telegram.ui.ActionBar.z0 f52647s1;
    public boolean f52648s2;
    public boolean f52649s3;
    public xu f52650s4;
    public org.telegram.ui.Components.p00 f52651t0;
    public org.telegram.ui.ActionBar.z0 f52652t1;
    public boolean f52653t2;
    public boolean f52654t3;
    public final ArrayList f52655t4;
    public org.telegram.ui.Components.p00 f52656u0;
    public org.telegram.ui.ActionBar.z0 f52657u1;
    public boolean f52658u2;
    public boolean f52659u3;
    public final RectF f52660u4;
    public fi.d f52661v0;
    public float f52662v1;
    public boolean f52663v2;
    public float f52664v3;
    public final RectF f52665v4;
    public final rh.h f52666w;
    public lh.f f52667w0;
    public float f52668w1;
    public boolean f52669w2;
    public ValueAnimator f52670w3;
    public int f52671w4;
    public boolean f52672x;
    public int f52673x0;
    public AnimatorSet f52674x1;
    public boolean f52675x2;
    public float f52676x3;
    public int f52677x4;
    public int f52678y;
    public final UndoView[] f52679y0;
    public float f52680y1;
    public boolean f52681y2;
    public float f52682y3;
    public pw f52683z0;
    public jh.f f52684z1;
    public boolean f52685z2;
    public float f52686z3;
    public static final boolean[] f52553z4 = new boolean[4];
    public static final org.telegram.ui.Components.qp0 A4 = new org.telegram.ui.Components.qp0(3);

    public zw(Bundle bundle) {
        super(bundle);
        int i7;
        int L;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            i7 = 48;
        } else {
            i7 = 0;
        }
        this.f52554a = i7;
        org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.h;
        this.f52560b = new te.a(1, this, wqVar, 350L, false);
        this.f52566c = new te.a(2, this, wqVar, 350L, false);
        this.d = new te.a(3, this, wqVar, 350L, false);
        this.f52576e = new te.a(4, this, wqVar, 350L, false);
        this.f52582f = new te.a(5, this, wqVar, 350L, false);
        this.h = new te.a(6, this, wqVar, 350L, false);
        this.f52620n = new te.a(7, this, wqVar, 350L, false);
        this.f52639r = new te.a(8, this, wqVar, 350L, false);
        this.f52645s = new te.a(9, this, wqVar, 350L, false);
        this.f52666w = new rh.h(new fu(this, 18));
        this.f52678y = -1;
        this.F = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.Q = true;
        this.f52567c0 = 1.0f;
        this.f52679y0 = new UndoView[2];
        this.f52562b1 = new ArrayList();
        this.f52589g1 = new Paint();
        this.f52604j1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.F1 = new TextPaint(1);
        this.V1 = true;
        this.d2 = true;
        this.f52605j2 = true;
        this.f52636q2 = new Object();
        this.J2 = new ArrayList();
        this.K2 = true;
        this.f52637q3 = new h2.f((int[]) null);
        this.H3 = new lv(this, 0);
        this.I3 = new lv(this, 1);
        this.M3 = -4;
        this.N3 = true;
        this.O3 = true;
        this.X3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f52655t4 = arrayList;
        RectF rectF = new RectF();
        this.f52660u4 = rectF;
        RectF rectF2 = new RectF();
        this.f52665v4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        ri.c d = this.glassEngine.d(new iu(this, 12));
        this.f52624n4 = d;
        if (i10 >= 31) {
            dh.g gVar = new dh.g(false);
            this.f52611k4 = gVar;
            ri.f fVar = new ri.f(d);
            this.f52619m4 = fVar;
            fVar.f54584f = d;
            fVar.d = gVar;
            fVar.f54583e = -2;
            ri.f fVar2 = new ri.f(null);
            this.f52615l4 = fVar2;
            fVar2.f54584f = d;
            fVar2.d = gVar;
            fVar2.f54583e = -3;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.f52638q4 = cVar;
            cVar.f8713k = true;
            if (org.telegram.messenger.sc.e(262144)) {
                L = org.telegram.messenger.g0.L(8.0f);
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            cVar.d = L;
            cVar.f8708e = L;
            dh.c cVar2 = new dh.c(fVar2, fVar2, fVar2);
            this.o4 = cVar2;
            cVar2.f8713k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L2;
            cVar2.f8708e = L2;
            this.f52633p4 = new dh.c(fVar2, fVar2, fVar2);
        } else {
            this.f52611k4 = null;
            this.f52615l4 = null;
            this.f52619m4 = null;
            this.o4 = new dh.c(d, d, d);
            this.f52638q4 = new dh.c(d, d, d);
            this.f52633p4 = new dh.c(d, d, d);
        }
        dh.c cVar3 = new dh.c(d, d, d);
        this.f52644r4 = cVar3;
        dh.c cVar4 = this.f52638q4;
        oi.q qVar = this.glassEngine;
        cVar4.f8712j = qVar;
        this.o4.f8712j = qVar;
        this.f52633p4.f8712j = qVar;
        cVar3.f8712j = qVar;
    }

    public static void A0(zw zwVar) {
        if (!zwVar.O3) {
            fi.m3 m3Var = zwVar.f52634q0;
            if (m3Var != null) {
                if (m3Var.V) {
                    return;
                }
                org.telegram.messenger.g0.E2(m3Var);
            }
            SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(org.telegram.messenger.id.N0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.m6.uj, 0, new fu(zwVar, 24), null);
            fi.m3 m3Var2 = new fi.m3(zwVar.getParentActivity(), 2);
            m3Var2.s(8.0f);
            m3Var2.d = 8000L;
            m3Var2.k(true);
            m3Var2.r(true);
            m3Var2.h = org.telegram.messenger.g0.f22567q.x - org.telegram.messenger.g0.L(148.0f);
            m3Var2.u(S2);
            m3Var2.o(1.0f, -40.0f);
            m3Var2.j(zwVar.getThemedColor(org.telegram.ui.ActionBar.m6.tj));
            zwVar.f52634q0 = m3Var2;
            m3Var2.setTranslationY((-zwVar.f52592g4) - zwVar.f52602i4);
            ((ViewGroup) zwVar.fragmentView).addView(zwVar.f52634q0, c8.ha.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            zwVar.f52634q0.w();
            return;
        }
        fi.m3 m3Var3 = zwVar.f52629p0;
        if (m3Var3 != null) {
            m3Var3.f(true);
        }
        di.t6 o4 = org.telegram.messenger.qp.s1(zwVar.currentAccount).P1().o();
        if (o4 != null && o4.a(zwVar.currentAccount, 1)) {
            zwVar.showDialog(new ug.i0(o4.b(), zwVar.currentAccount, zwVar.getParentActivity(), zwVar, null));
            return;
        }
        fi.va D = fi.va.D(zwVar.getParentActivity(), zwVar.currentAccount);
        D.f13014y = new gv(zwVar);
        D.Q(null);
    }

    public static void B0(zw zwVar) {
        org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, "PREMIUM_CHRISTMAS");
        zwVar.g5();
        org.telegram.ui.Components.bc G = org.telegram.ui.Components.gc.a0(zwVar).G(2131624033, 4, org.telegram.messenger.id.M0(2131753330, null));
        G.f32203j = 5000;
        G.j();
    }

    public static void C0(org.telegram.ui.zw r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zw.C0(org.telegram.ui.zw, int):void");
    }

    public static void D0(zw zwVar) {
        org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, "BIRTHDAY_SETUP");
        zwVar.g5();
        org.telegram.ui.Components.bc K = org.telegram.ui.Components.gc.a0(zwVar).K(2131623981, org.telegram.messenger.id.M0(2131753714, null), org.telegram.messenger.id.M0(2131745495, null), new fu(zwVar, 29));
        K.f32203j = 5000;
        K.j();
    }

    public static void E0(zw zwVar) {
        boolean z9 = true;
        try {
            ((org.telegram.ui.Components.zg0) ((org.telegram.ui.Components.v8) zwVar.N1.h.getImageReceiver().m0).K).H(true);
        } catch (Exception unused) {
        }
        if (zwVar.f52565b4 == null) {
            org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(0, true, true);
            zwVar.f52565b4 = j30Var;
            j30Var.H = true;
            j30Var.f34825a = zwVar;
            j30Var.f34826b = new mw(zwVar);
            zwVar.getMediaDataController().x();
            zwVar.getMessagesController().d3();
            zwVar.getMessagesController().g3(zwVar.getUserConfig().f(), true, zwVar.classGuid);
        }
        TLRPC.User a22 = org.telegram.messenger.qp.s1(zwVar.currentAccount).a2(Long.valueOf(org.telegram.messenger.p10.i(zwVar.currentAccount).e()));
        if (a22 == null) {
            a22 = org.telegram.messenger.p10.i(zwVar.currentAccount).f();
        }
        if (a22 != null) {
            org.telegram.ui.Components.ci ciVar = zwVar.f52565b4.f34827c;
            if (ciVar != null) {
                ciVar.P0();
            }
            org.telegram.ui.Components.j30 j30Var2 = zwVar.f52565b4;
            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z9 = false;
            }
            j30Var2.n(z9, new fu(zwVar, 28), new ou(zwVar, 3), 0);
        }
    }

    public static void G0(zw zwVar, float f10, ValueAnimator valueAnimator) {
        zwVar.f52577e0[0].setTranslationY((1.0f - zwVar.f52664v3) * f10);
        zwVar.f52664v3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i7 = 0; i7 < zwVar.actionBar.getChildCount(); i7++) {
            if (zwVar.actionBar.getChildAt(i7).getVisibility() == 0 && zwVar.actionBar.getChildAt(i7) != zwVar.actionBar.getActionMode() && zwVar.actionBar.getChildAt(i7) != zwVar.actionBar.getBackButton()) {
                zwVar.actionBar.getChildAt(i7).setAlpha(1.0f - zwVar.f52664v3);
            }
        }
        zwVar.Q3();
        zwVar.I3();
        View view = zwVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void H0(zw zwVar) {
        org.telegram.ui.Components.jb jbVar = new org.telegram.ui.Components.jb(zwVar.getParentActivity(), zwVar.resourceProvider);
        jbVar.d(2131624008, new String[0]);
        jbVar.f34883b.setText(org.telegram.messenger.id.M0(2131742811, null));
        org.telegram.ui.Components.bc.g(zwVar, jbVar, 2750).j();
        try {
            zwVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void I0(zw zwVar, org.telegram.messenger.t1 t1Var) {
        ArrayList arrayList = t1Var.f25585c;
        if (arrayList.size() == 1) {
            zh.g1 g1Var = new zh.g1(zwVar.getParentActivity(), zwVar.currentAccount, ((TLRPC.User) arrayList.get(0)).f27109id, null, null);
            g1Var.e1(true);
            zwVar.showDialog(g1Var);
            return;
        }
        wg.f1.l1(0, t1Var);
    }

    public static void J0(zw zwVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.bc I = org.telegram.ui.Components.gc.a0(zwVar).I(2131624033, org.telegram.messenger.id.M0(2131746856, null), org.telegram.messenger.id.M0(2131746855, null));
            I.f32203j = 5000;
            I.j();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            zwVar.getMessagesStorage().j2(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (zwVar.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zwVar.getParentActivity(), zwVar.resourceProvider);
                String M0 = org.telegram.messenger.id.M0(2131746852, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131746853, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                zwVar.showDialog(u1Var);
                return;
            }
            return;
        }
        org.telegram.messenger.k5.o(null, 2131743879, org.telegram.ui.Components.gc.a0(zwVar), 2131624011, 36);
    }

    public static void K0(zw zwVar) {
        org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        zwVar.g5();
    }

    public static void X2(zw zwVar, float f10) {
        float f11;
        float f12;
        int i7;
        int i10;
        float i11 = Utilities.i(zwVar.f52680y1 * 2.0f, 1.0f, 0.0f);
        sv svVar = zwVar.E0;
        float f13 = (1.0f - zwVar.f52664v3) * f10 * zwVar.H0;
        float f14 = 1.0f - i11;
        svVar.setAlpha(f13 * f14);
        int i12 = 0;
        if (!zwVar.K && !zwVar.M) {
            if (zwVar.L) {
                zwVar.E0.setTranslationY((Math.max(zwVar.N, -zwVar.g4()) + (-org.telegram.messenger.g0.L(81.0f))) - org.telegram.messenger.g0.L(8.0f));
                zwVar.E0.setProgressToCollapse(1.0f);
                sv svVar2 = zwVar.E0;
                svVar2.setClipTop((int) (org.telegram.messenger.g0.f22561m - svVar2.getY()));
            }
            f11 = 1.0f - zwVar.H0;
            zwVar.actionBar.setTranslationY(0.0f);
        } else {
            float i13 = Utilities.i((-zwVar.N) / org.telegram.messenger.g0.L(81.0f), 1.0f, 0.0f);
            if (zwVar.f52664v3 == 1.0f) {
                i13 = 1.0f;
            }
            float i14 = Utilities.i(i13 / 0.5f, 1.0f, 0.0f);
            zwVar.E0.setClipTop(0);
            if (!zwVar.K && zwVar.M) {
                zwVar.E0.setTranslationY((-org.telegram.messenger.g0.L(81.0f)) - org.telegram.messenger.g0.L(8.0f));
                zwVar.E0.setProgressToCollapse(1.0f);
                f12 = zwVar.H0;
            } else {
                zwVar.E0.setTranslationY(((zwVar.T / 2.0f) + (Math.max(zwVar.N, -zwVar.g4()) + zwVar.f52676x3)) - org.telegram.messenger.g0.L(8.0f));
                zwVar.E0.l(!zwVar.G3.c(), i13);
                if (!zwVar.M) {
                    f12 = zwVar.H0;
                } else {
                    f11 = 1.0f - i14;
                    zwVar.actionBar.setTranslationY(0.0f);
                }
            }
            f11 = 1.0f - f12;
            zwVar.actionBar.setTranslationY(0.0f);
        }
        float f15 = f11 * f14;
        if (f15 != 1.0f) {
            zwVar.actionBar.getTitlesContainer().setPivotY(org.telegram.messenger.g0.f22561m);
            zwVar.actionBar.getTitlesContainer().setPivotX(org.telegram.messenger.g0.L(20.0f));
            float f16 = (0.6f * f15) + 0.4f;
            zwVar.actionBar.getTitlesContainer().setScaleY(f16);
            zwVar.actionBar.getTitlesContainer().setScaleX(f16);
            zwVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            zwVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-org.telegram.messenger.g0.L(30.0f));
            zwVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f16);
            zwVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f16);
            float f17 = (1.0f - zwVar.f52664v3) * f15;
            zwVar.actionBar.getTitlesContainer().setAlpha(f17);
            FrameLayout titlesContainer = zwVar.actionBar.getTitlesContainer();
            int i15 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
            if (i15 > 0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            titlesContainer.setVisibility(i10);
            zwVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
            FrameLayout additionalSubTitleOverlayContainer = zwVar.actionBar.getAdditionalSubTitleOverlayContainer();
            if (i15 <= 0) {
                i12 = 4;
            }
            additionalSubTitleOverlayContainer.setVisibility(i12);
            return;
        }
        zwVar.actionBar.getTitlesContainer().setScaleY(1.0f);
        zwVar.actionBar.getTitlesContainer().setScaleX(1.0f);
        zwVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
        zwVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
        float f18 = 1.0f - zwVar.f52664v3;
        zwVar.actionBar.getTitlesContainer().setAlpha(f18);
        FrameLayout titlesContainer2 = zwVar.actionBar.getTitlesContainer();
        int i16 = (f18 > 0.0f ? 1 : (f18 == 0.0f ? 0 : -1));
        if (i16 > 0) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        titlesContainer2.setVisibility(i7);
        zwVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f18);
        FrameLayout additionalSubTitleOverlayContainer2 = zwVar.actionBar.getAdditionalSubTitleOverlayContainer();
        if (i16 <= 0) {
            i12 = 4;
        }
        additionalSubTitleOverlayContainer2.setVisibility(i12);
    }

    public static void Y2(zw zwVar, Canvas canvas, int i7) {
        org.telegram.ui.ActionBar.r4 r4Var;
        if (zwVar.parentLayout != null && zwVar.actionBar != null) {
            float max = Math.max(zwVar.f52576e.f55498e, zwVar.h4());
            float f10 = 1.0f;
            float f11 = 1.0f - zwVar.f52680y1;
            float f12 = max * f11 * f11;
            int i10 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
            if (i10 != 0) {
                if (-1 >= i7) {
                    f10 = 0.0f;
                    i7 = -1;
                }
                if (f10 > 0.0f && i10 > 0 && i7 > 0 && (r4Var = zwVar.parentLayout) != null) {
                    ((ActionBarLayout) r4Var).p(canvas, (int) (f10 * 255.0f * f12), i7);
                }
            }
        }
    }

    public static void Z(zw zwVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, tL_pendingSuggestion.suggestion);
        zwVar.g5();
    }

    public static void a0(zw zwVar, float f10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        zwVar.f52664v3 = floatValue;
        zwVar.f52577e0[0].setTranslationY((-f10) * floatValue);
        for (int i7 = 0; i7 < zwVar.actionBar.getChildCount(); i7++) {
            if (zwVar.actionBar.getChildAt(i7).getVisibility() == 0 && zwVar.actionBar.getChildAt(i7) != zwVar.actionBar.getActionMode() && zwVar.actionBar.getChildAt(i7) != zwVar.actionBar.getBackButton()) {
                zwVar.actionBar.getChildAt(i7).setAlpha(1.0f - zwVar.f52664v3);
            }
        }
        View view = zwVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        zwVar.Q3();
        zwVar.I3();
    }

    public static void b0(zw zwVar) {
        ArrayList arrayList = zwVar.J2;
        org.telegram.ui.ActionBar.r4 r4Var = zwVar.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).y()) {
            zwVar.finishPreviewFragment();
        } else if (zwVar.S0 == 10) {
            if (zwVar.D2 != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    arrayList2.add(org.telegram.messenger.xr.a(((Long) arrayList.get(i7)).longValue(), 0L));
                }
                zwVar.D2.y(zwVar, arrayList2, null, false, zwVar.K2, zwVar.L2, zwVar.M2, null);
            }
        } else if (org.telegram.messenger.qp.s1(zwVar.currentAccount).v2()) {
            b.b(zwVar.currentAccount);
        } else {
            zwVar.presentFragment(new ContactsActivity(a8.p0.k("destroyAfterSelect", true)));
        }
    }

    public static void c0(zw zwVar) {
        org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, "USERPIC_SETUP");
        zwVar.g5();
    }

    public static org.telegram.ui.Cells.t2 c4(yw ywVar) {
        vw vwVar = ywVar.f52125a;
        for (int i7 = 0; i7 < vwVar.getChildCount(); i7++) {
            View childAt = vwVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.t2) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                if (t2Var.V()) {
                    return t2Var;
                }
            }
        }
        return null;
    }

    public static void d0(zw zwVar) {
        PasskeysActivity.f0(zwVar.currentAccount, zwVar.getParentActivity(), zwVar.resourceProvider, true);
    }

    public static void e0(zw zwVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", org.telegram.messenger.p10.i(zwVar.currentAccount).e());
        zwVar.presentFragment(new cn(bundle));
    }

    public static void f0(zw zwVar, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull b22 = zwVar.getMessagesController().b2(zwVar.getUserConfig().e());
        if (b22 != null) {
            tL_birthday2 = b22.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (b22 != null) {
            b22.flags2 |= 32;
            b22.birthday = tL_birthday;
        }
        zwVar.getMessagesController().m2();
        zwVar.getConnectionsManager().sendRequest(updatebirthday, new z9(zwVar, b22, tL_birthday2, 8), 1024);
        org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, "BIRTHDAY_SETUP");
        zwVar.g5();
    }

    public static void g0(zw zwVar, yw ywVar, View view, int i7) {
        int i10;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.x3) {
            return;
        }
        boolean z9 = view instanceof org.telegram.ui.Cells.t2;
        if (z9) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            if (t2Var.f30469n2) {
                zwVar.Z4(t2Var.getDialogId(), view);
                return;
            }
        }
        if (zwVar.U3()) {
            zwVar.A4(view, i7, 0.0f, ywVar.d);
            return;
        }
        int i11 = zwVar.S0;
        if (i11 == 15 && (view instanceof org.telegram.ui.Cells.m8)) {
            ywVar.d.L();
            return;
        }
        int i12 = 0;
        if ((i11 == 11 || i11 == 13) && i7 == 1) {
            Bundle k10 = a8.p0.k("forImport", true);
            k10.putLongArray("result", new long[]{zwVar.getUserConfig().e()});
            k10.putInt("chatType", 4);
            String string = zwVar.arguments.getString("importTitle");
            if (string != null) {
                k10.putString("title", string);
            }
            g50 g50Var = new g50(k10);
            g50Var.Y = new gv(zwVar);
            zwVar.presentFragment(g50Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.b3) && ((i10 = ywVar.f52132s) == 7 || i10 == 8)) {
            jg.l lVar = (jg.l) ywVar.d.M.get(0);
            if (lVar != null && lVar.f54543a == 17) {
                tL_chatlists_chatlistUpdates = lVar.f16824i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                org.telegram.messenger.vo voVar = zwVar.getMessagesController().M[ywVar.f52132s - 7];
                if (voVar != null) {
                    int i13 = voVar.f26074a;
                    ?? maVar = new org.telegram.ui.Components.ma(zwVar, false);
                    maVar.T1 = -1;
                    maVar.X1 = "";
                    maVar.Y1 = new ArrayList();
                    maVar.f39821a2 = "";
                    maVar.f39823c2 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    maVar.d2 = arrayList;
                    maVar.f39840u2 = -1;
                    maVar.f39843x2 = -5;
                    maVar.T1 = i13;
                    maVar.V1 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    maVar.f39822b2 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList arrayList2 = zwVar.getMessagesController().P0;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i12 >= arrayList2.size()) {
                                break;
                            } else if (((org.telegram.messenger.vo) arrayList2.get(i12)).f26074a == i13) {
                                maVar.X1 = ((org.telegram.messenger.vo) arrayList2.get(i12)).f26075b;
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    maVar.f1();
                    zwVar.showDialog(maVar);
                    return;
                }
                return;
            }
        } else if (z9 && !zwVar.actionBar.x() && !zwVar.G3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.t2) view).Y1;
            org.telegram.messenger.g0.P.set(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A());
        }
        zwVar.z4(view, i7, ywVar.d);
    }

    public static void h0(zw zwVar) {
        zwVar.presentFragment(new PrivacySettingsActivity());
        org.telegram.messenger.g0.k3(zwVar.parentLayout, "newChatsRow");
    }

    public static void i0(zw zwVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.qp.s1(zwVar.currentAccount).o1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(zwVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new z9(zwVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void j0(zw zwVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(launchActivity, zwVar.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(zwVar.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.f25806b;
        if (tL_attachMenuBots != null) {
            long j3 = b02.f25803a;
            b02.getMessagesStorage().f26723a.c(new org.telegram.messenger.hk(b02.f25814e, 2, j3, b02, tL_attachMenuBots));
        }
    }

    public static void j1(zw zwVar, boolean z9) {
        if (zwVar.f52577e0 != null && zwVar.N3 != z9) {
            zwVar.N3 = z9;
            int i7 = 0;
            while (true) {
                yw[] ywVarArr = zwVar.f52577e0;
                if (i7 < ywVarArr.length) {
                    if (z9) {
                        ywVarArr[i7].f52125a.setScrollbarFadingEnabled(false);
                    }
                    zwVar.f52577e0[i7].f52125a.setVerticalScrollBarEnabled(z9);
                    if (z9) {
                        zwVar.f52577e0[i7].f52125a.setScrollbarFadingEnabled(true);
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public static void k0(zw zwVar) {
        org.telegram.messenger.qp.s1(zwVar.currentAccount).f24778e7.edit().putBoolean("storyhint", false).commit();
    }

    public static void l0(zw zwVar) {
        if (zwVar.f52565b4.g()) {
            org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, "USERPIC_SETUP");
            zwVar.g5();
        }
    }

    public static void n0(zw zwVar) {
        org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, "PREMIUM_GRACE");
        zwVar.g5();
    }

    public static void o0(zw zwVar) {
        org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, "SETUP_PASSKEY");
        zwVar.g5();
    }

    public static void p0(zw zwVar, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        try {
            u1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (tLObject != null) {
            zwVar.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            bi.r3 r3Var = new bi.r3(zwVar, j3, 25);
            Pattern pattern = org.telegram.ui.Components.u4.f38507a;
            if (zwVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = zwVar.getCurrentAccount();
                    Activity parentActivity = zwVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long e11 = org.telegram.messenger.p10.i(currentAccount).e();
                    TextView textView = new TextView(parentActivity);
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f27998j5, null);
                    textView.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.id.f23161a0) {
                        i7 = 5;
                    } else {
                        i7 = 3;
                    }
                    textView.setGravity(i7 | 48);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    alertDialog$Builder.o(frameLayout);
                    org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
                    v8Var.u(org.telegram.messenger.g0.L(12.0f));
                    org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(parentActivity);
                    k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                    if (org.telegram.messenger.id.f23161a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    frameLayout.addView(k9Var, c8.ha.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(parentActivity);
                    org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.m6.E8, null, 1, 20.0f);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    if (org.telegram.messenger.id.f23161a0) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView2.setGravity(i11 | 16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setText(org.telegram.messenger.id.M0(2131749245, null));
                    boolean z9 = org.telegram.messenger.id.f23161a0;
                    if (z9) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    int i16 = i12 | 48;
                    if (z9) {
                        i13 = 21;
                    } else {
                        i13 = 76;
                    }
                    float f10 = i13;
                    if (z9) {
                        i14 = 76;
                    } else {
                        i14 = 21;
                    }
                    frameLayout.addView(textView2, c8.ha.d(-1, -2.0f, i16, f10, 11.0f, i14, 0.0f));
                    if (org.telegram.messenger.id.f23161a0) {
                        i15 = 5;
                    } else {
                        i15 = 3;
                    }
                    frameLayout.addView(textView, c8.ha.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                    if (user != null) {
                        if (org.telegram.messenger.t10.z(user)) {
                            v8Var.f38925p = 0.8f;
                            v8Var.g(12);
                            k9Var.j(null, null, v8Var, user);
                        } else if (user.f27109id == e11) {
                            v8Var.f38925p = 0.8f;
                            v8Var.g(1);
                            k9Var.j(null, null, v8Var, user);
                        } else {
                            v8Var.f38925p = 1.0f;
                            v8Var.r(user);
                            k9Var.e(user, v8Var);
                        }
                    } else {
                        v8Var.q(chat);
                        k9Var.e(chat, v8Var);
                    }
                    textView.setText(org.telegram.messenger.g0.X2(str));
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131749265, null), new org.telegram.ui.Components.t(r3Var, 3));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    zwVar.showDialog(alertDialog$Builder.f27300a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.u4.c0(zwVar.currentAccount, tL_error, zwVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        zwVar.getNotificationCenter().k(org.telegram.messenger.qs.f25095v1, Long.valueOf(j3), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public static void p4(cn cnVar, org.telegram.messenger.ij ijVar) {
        CharSequence charSequence;
        if (ijVar != null && ijVar.r2()) {
            try {
                if (!TextUtils.isEmpty(ijVar.f23322z)) {
                    charSequence = ijVar.f23322z;
                } else {
                    charSequence = ijVar.v;
                }
                CharSequence x12 = org.telegram.messenger.g0.x1(charSequence, ijVar.Y1, null);
                if (x12 instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) x12;
                    org.telegram.ui.Components.xz[] xzVarArr = (org.telegram.ui.Components.xz[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.xz.class);
                    if (xzVarArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(xzVarArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(xzVarArr[0]);
                        for (int i7 = 1; i7 < xzVarArr.length; i7++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(xzVarArr[i7]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(xzVarArr[i7]);
                            if (spanStart2 != spanEnd) {
                                if (spanStart2 > spanEnd) {
                                    for (int i10 = spanEnd; i10 <= spanStart2; i10++) {
                                        if (!Character.isWhitespace(spannableStringBuilder.charAt(i10))) {
                                            break;
                                        }
                                    }
                                }
                            }
                            spanEnd = spanStart3;
                        }
                        cnVar.Rb(ijVar.L1(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public static void q0(zw zwVar, int i7) {
        Object obj;
        TLRPC.User user;
        org.telegram.ui.Components.tl0 tl0Var = zwVar.C0.f33602q0;
        if (i7 >= tl0Var.Z && i7 < tl0Var.f38732a0) {
            org.telegram.ui.Components.x31 G = tl0Var.G(i7);
            if (G != null) {
                obj = G.G;
            } else {
                obj = null;
            }
        } else {
            obj = Boolean.FALSE;
        }
        if (obj instanceof TLRPC.User) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zwVar.getParentActivity(), zwVar.resourceProvider);
            String M0 = org.telegram.messenger.id.M0(2131754180, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.a0(null, null, 2131754179, "\"" + org.telegram.messenger.t10.p(user) + "\"");
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746321, null), new su(0, zwVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        }
    }

    public static void r0(zw zwVar, int i7, ArrayList arrayList, boolean z9, HashSet hashSet) {
        HashSet hashSet2;
        if (i7 == 102) {
            zwVar.getMessagesController().f24894s0 = true;
            if (z9) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            zwVar.D4(arrayList, i7, false, false, hashSet2);
            org.telegram.messenger.qp messagesController = zwVar.getMessagesController();
            messagesController.f24894s0 = false;
            messagesController.getNotificationCenter().k(org.telegram.messenger.qs.f25074s, Boolean.TRUE);
            zwVar.getMessagesController().J(zwVar.X2);
            int i10 = zwVar.X2;
            if (i10 != 0 && zwVar.d4(zwVar.currentAccount, zwVar.f52577e0[0].f52132s, i10, false).size() == 0) {
                zwVar.f52577e0[0].f52125a.setEmptyView(null);
                zwVar.f52577e0[0].f52134x.setVisibility(4);
                zwVar.finishFragment();
                return;
            }
            return;
        }
        zwVar.D4(arrayList, i7, false, false, null);
    }

    public static void t0(zw zwVar, int i7, org.telegram.ui.Components.k60 k60Var) {
        CharSequence charSequence;
        if (zwVar.currentAccount != i7) {
            k60Var.u();
            if (zwVar.getParentActivity() == null) {
                return;
            }
            tw twVar = zwVar.D2;
            LaunchActivity launchActivity = (LaunchActivity) zwVar.getParentActivity();
            ArrayList arrayList = zwVar.E2;
            String str = zwVar.F2;
            CharSequence charSequence2 = zwVar.G2;
            mv mvVar = zwVar.C1;
            if (mvVar != null) {
                charSequence = mvVar.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.O0(i7);
            zw zwVar2 = new zw(zwVar.arguments);
            zwVar2.D2 = twVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    zwVar2.E2 = null;
                } else {
                    zwVar2.E2 = arrayList;
                    zwVar2.F2 = null;
                    zwVar2.N2 = false;
                    if (zwVar2.C1 != null) {
                        zwVar2.v3(charSequence);
                    } else {
                        zwVar2.V3 = charSequence;
                    }
                }
            } else if (str != null) {
                zwVar2.Q4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    zwVar2.G2 = null;
                } else {
                    zwVar2.G2 = charSequence2;
                    zwVar2.F2 = null;
                    zwVar2.E2 = null;
                    if (zwVar2.C1 != null) {
                        zwVar2.v3(charSequence);
                    } else {
                        zwVar2.V3 = charSequence;
                    }
                }
            }
            launchActivity.u0(zwVar2, false, true);
        }
    }

    public static void u0(zw zwVar) {
        String str;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(zwVar.currentAccount);
        if (zwVar.B3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        s12.k4(0L, str);
        zwVar.g5();
    }

    public static void u1(zw zwVar, yw ywVar, float f10) {
        if (zwVar.T != f10) {
            zwVar.T = f10;
            int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            int i10 = 0;
            if (i7 == 0) {
                zwVar.U = false;
            }
            zwVar.E0.setOverscroll(f10);
            ywVar.f52125a.setViewsOffset(f10);
            vw vwVar = ywVar.f52125a;
            if (i7 != 0) {
                i10 = 2;
            }
            vwVar.setOverScrollMode(i10);
            zwVar.fragmentView.invalidate();
            if (f10 > org.telegram.messenger.g0.L(90.0f) && !zwVar.U) {
                sv svVar = zwVar.E0;
                ValueAnimator valueAnimator = svVar.H0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    svVar.i(svVar.f9551p0, true);
                    zwVar.U = true;
                    zwVar.getOrCreateStoryViewer().x(new fu(zwVar, 4));
                }
            }
        }
    }

    public static void u4(org.telegram.messenger.c cVar) {
        int i7 = cVar.f21770a;
        boolean[] zArr = f52553z4;
        if (!zArr[i7]) {
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
            s12.X2();
            s12.U2(0, 0, 100, true, null);
            if (s12.f24893s.isEmpty() && !TextUtils.isEmpty(s12.R3)) {
                TLRPC.TL_help_getRecentMeUrls tL_help_getRecentMeUrls = new TLRPC.TL_help_getRecentMeUrls();
                tL_help_getRecentMeUrls.referer = s12.R3;
                s12.getConnectionsManager().sendRequest(tL_help_getRecentMeUrls, new org.telegram.messenger.rj(s12, 4));
            }
            s12.g3(org.telegram.messenger.p10.i(i7).f(), false, 0);
            org.telegram.messenger.g5.r(i7).f();
            org.telegram.messenger.ui.b0(i7).u(false);
            org.telegram.messenger.g0.i3(new dh(cVar, 18), 200L);
            Iterator it = s12.f24757c4.iterator();
            while (it.hasNext()) {
                org.telegram.messenger.ui.b0(i7).c1((String) it.next(), true, true);
            }
            zArr[i7] = true;
        }
    }

    public static void v0(zw zwVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.G0(launchActivity, zwVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            ad1.a(zwVar.getParentActivity(), new y(zwVar, tL_attachMenuBot, launchActivity, 7), null);
        }
    }

    public static boolean v1(zw zwVar, yw ywVar) {
        if (!zwVar.G3.c()) {
            int i7 = (int) (-zwVar.N);
            int f42 = zwVar.f4();
            int g42 = zwVar.g4();
            if (i7 != 0 && i7 != f42 && i7 != g42 && ywVar.f52125a.canScrollVertically(-1)) {
                if (g42 < i7 && i7 < f42) {
                    int L = org.telegram.messenger.g0.L(48.0f);
                    int i10 = i7 - g42;
                    if (i10 < L / 2) {
                        ywVar.f52126b.x(-i10);
                        return true;
                    }
                    ywVar.f52126b.x(L - i10);
                    return true;
                }
                float f10 = 1.0f;
                if (zwVar.f52664v3 != 1.0f) {
                    f10 = Utilities.i((-zwVar.N) / org.telegram.messenger.g0.L(81.0f), 1.0f, 0.0f);
                }
                if (f10 < zwVar.E0.B0) {
                    ywVar.f52126b.x(-i7);
                    return true;
                }
                ywVar.f52126b.x(g42 - i7);
                return true;
            }
            return false;
        }
        return false;
    }

    public static void w0(zw zwVar) {
        b.c(zwVar.currentAccount, zwVar.getParentActivity(), zwVar.getResourceProvider());
    }

    public static String w2(zw zwVar) {
        String s5;
        ArrayList arrayList = zwVar.J2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() < 3) {
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                long longValue = ((Long) obj).longValue();
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                if (longValue == zwVar.getUserConfig().e()) {
                    sb2.append(org.telegram.messenger.id.M0(2131745901, null));
                } else {
                    if (arrayList.size() == 1) {
                        s5 = org.telegram.messenger.m5.l(zwVar.currentAccount, longValue);
                    } else {
                        s5 = org.telegram.messenger.m5.s(zwVar.currentAccount, longValue);
                    }
                    sb2.append(s5);
                }
            }
            return org.telegram.messenger.id.a0(null, null, 2131745439, sb2.toString());
        }
        return org.telegram.messenger.id.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public static void x0(final int i7, final long j3, TLRPC.Chat chat, final zw zwVar, final boolean z9, final boolean z10) {
        final TLRPC.Chat chat2;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        zwVar.n4(false);
        if (i7 == 103 && org.telegram.messenger.t3.T(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || org.telegram.messenger.t3.t0(chat2)) {
                zwVar.getMessagesController().X(2, j3, z10);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i7 == 102 && (i13 = zwVar.X2) != 0 && zwVar.d4(zwVar.currentAccount, zwVar.f52577e0[0].f52132s, i13, false).size() == 1) {
            zwVar.f52577e0[0].f52134x.setVisibility(4);
        }
        int i14 = -1;
        if (i7 == 102) {
            zwVar.M4(true, true);
            if (zwVar.S1 != null) {
                i12 = 0;
                while (i12 < zwVar.S1.size()) {
                    if (((TLRPC.Dialog) zwVar.S1.get(i12)).f26964id == j3) {
                        break;
                    }
                    i12++;
                }
            }
            i12 = -1;
            zwVar.z3();
            i10 = i12;
        } else {
            i10 = -1;
        }
        UndoView k42 = zwVar.k4();
        if (k42 != null) {
            if (i7 == 103) {
                i11 = 0;
            } else if (z10) {
                i11 = 1;
            } else {
                i11 = 95;
            }
            k42.j(i11, j3, new Runnable() {
                @Override
                public final void run() {
                    zwVar.C4(i7, j3, chat2, z9, z10);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(zwVar.d4(zwVar.currentAccount, zwVar.f52577e0[0].f52132s, zwVar.X2, false));
        int i15 = 0;
        while (true) {
            if (i15 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i15)).f26964id == j3) {
                i14 = i15;
                break;
            } else {
                i15++;
            }
        }
        if (i7 == 102) {
            if (i10 >= 0 && i14 < 0 && (arrayList = zwVar.S1) != null) {
                arrayList.remove(i10);
                zwVar.f52577e0[0].f52135y.D();
                zwVar.f52577e0[0].q(true);
                return;
            }
            zwVar.M4(false, true);
        }
    }

    public static void y0(zw zwVar) {
        org.telegram.messenger.v1 a10 = org.telegram.messenger.v1.a(zwVar.currentAccount);
        int i7 = a10.f25937a;
        Set<String> set = a10.d;
        org.telegram.messenger.t1 t1Var = a10.f25939c;
        if (t1Var != null && !set.contains(t1Var.f25583a)) {
            set.add(a10.f25939c.f25583a);
            SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(i7).f24778e7.edit();
            edit.putStringSet("bday_hidden", set);
            edit.apply();
            org.telegram.messenger.qs.f(i7).k(org.telegram.messenger.qs.f25011g5, new Object[0]);
        }
        org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, "BIRTHDAY_CONTACTS_TODAY");
        zwVar.g5();
        org.telegram.ui.Components.bc G = org.telegram.ui.Components.gc.a0(zwVar).G(2131624033, 4, org.telegram.messenger.id.M0(2131753330, null));
        G.f32203j = 5000;
        G.j();
    }

    public static void z0(zw zwVar) {
        org.telegram.messenger.qp.s1(zwVar.currentAccount).k4(0L, "PREMIUM_RESTORE");
        zwVar.g5();
    }

    public final boolean A3(long j3) {
        int i7;
        int i10 = this.S0;
        if (i10 != 15 && i10 != 16 && this.f52600i2 == null && this.f52653t2) {
            if (org.telegram.messenger.m5.z(j3)) {
                long j10 = -j3;
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j10));
                if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                    if (!this.f52642r2) {
                        TLRPC.Chat M02 = org.telegram.messenger.qp.s1(this.currentAccount).M0(Long.valueOf(j10));
                        if ((org.telegram.messenger.t3.n(M02) || M02.megagroup) && (i7 = this.U0) != 2 && i7 != 3) {
                            return true;
                        }
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M03 = org.telegram.messenger.id.M0(2131745596, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                    u1Var.R = M03;
                    int i11 = this.U0;
                    if (i11 == 3) {
                        u1Var.T = org.telegram.messenger.id.M0(2131744091, null);
                    } else if (i11 == 2) {
                        u1Var.T = org.telegram.messenger.id.M0(2131746587, null);
                    } else {
                        u1Var.T = org.telegram.messenger.id.M0(2131752440, null);
                    }
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747831, null), null);
                    showDialog(u1Var);
                    return false;
                }
                return true;
            } else if (org.telegram.messenger.m5.C(j3)) {
                if (this.U0 != 0 || this.V0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String M04 = org.telegram.messenger.id.M0(2131745596, null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27300a;
                    u1Var2.R = M04;
                    int i12 = this.U0;
                    if (i12 == 3) {
                        u1Var2.T = org.telegram.messenger.id.M0(2131744090, null);
                    } else if (i12 != 0) {
                        u1Var2.T = org.telegram.messenger.id.M0(2131747176, null);
                    } else {
                        u1Var2.T = org.telegram.messenger.id.M0(2131749104, null);
                    }
                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131747831, null), null);
                    showDialog(u1Var2);
                    return false;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public final boolean A4(View view, int i7, float f10, org.telegram.ui.Components.oj0 oj0Var) {
        org.telegram.ui.Components.yl0 yl0Var;
        long j3;
        org.telegram.ui.Components.yl0 yl0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long F;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.b3) && oj0Var.d(i7) != 21) {
            if (!this.actionBar.x() && !org.telegram.messenger.g0.Q1() && !this.f52617m2 && (view instanceof org.telegram.ui.Cells.t2)) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                if (!getMessagesController().t2(t2Var.getDialogId()) && !this.G3.c() && t2Var.Z(f10)) {
                    return T4(t2Var);
                }
            }
            vv vvVar = this.G3;
            if (vvVar == null || !vvVar.c()) {
                iw iwVar = this.C0;
                boolean z9 = true;
                if (iwVar != null && oj0Var == (yl0Var2 = iwVar.f33590d0)) {
                    Object I = yl0Var2.I(i7);
                    if (!this.C0.f33590d0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String M0 = org.telegram.messenger.id.M0(2131752054, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                        u1Var.R = M0;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                u1Var.T = org.telegram.messenger.id.a0("ClearSearchSingleChatAlertText", null, 2131752053, qg.d.i(this.currentAccount, chat, false));
                            } else {
                                u1Var.T = org.telegram.messenger.id.a0("ClearSearchSingleChatAlertText", null, 2131752053, chat.title);
                            }
                            F = -chat.f26960id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.f27109id == getUserConfig().f24493n) {
                                u1Var.T = org.telegram.messenger.id.a0("ClearSearchSingleChatAlertText", null, 2131752053, org.telegram.messenger.id.M0(2131745901, null));
                            } else {
                                u1Var.T = org.telegram.messenger.id.a0("ClearSearchSingleUserAlertText", null, 2131752051, org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                            }
                            F = user.f27109id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            u1Var.T = org.telegram.messenger.id.a0("ClearSearchSingleUserAlertText", null, 2131752051, org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                            F = org.telegram.messenger.m5.F(encryptedChat.f26968id);
                        }
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752055, null), new di.c1(this, F, 7));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        showDialog(u1Var);
                        TextView textView = (TextView) u1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, getResourceProvider());
                        }
                        return true;
                    }
                }
                iw iwVar2 = this.C0;
                if (iwVar2 != null && oj0Var == (yl0Var = iwVar2.f33590d0)) {
                    if (this.f52617m2) {
                        z4(view, i7, oj0Var);
                        return false;
                    }
                    if ((view instanceof org.telegram.ui.Cells.g6) && !yl0Var.N(i7)) {
                        j3 = ((org.telegram.ui.Cells.g6) view).getDialogId();
                    } else {
                        j3 = 0;
                    }
                    if (j3 != 0) {
                        Y4(j3, view);
                        return true;
                    }
                } else {
                    Object J = ((jg.n) oj0Var).J(i7);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.f52617m2) {
                            if ((this.S0 == 3 || U3()) && v5(dialog.f26964id)) {
                                if (this.S0 == 1 && U3() && this.f52622n2 && getMessagesController().t2(dialog.f26964id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f26964id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.S0 != 1) {
                                        z9 = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z9);
                                    bundle.putBoolean("quote", this.O0);
                                    bundle.putBoolean("reply_to", this.N0);
                                    z91 z91Var = new z91(bundle);
                                    z91Var.L0 = this;
                                    presentFragment(z91Var);
                                    return false;
                                }
                                s3(dialog.f26964id, view);
                                o5();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            y4(view);
                            return false;
                        } else if (!this.actionBar.x() || !s4(dialog)) {
                            Y4(dialog.f26964id, view);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final ri.f B() {
        return this.f52619m4;
    }

    public final void B3(boolean z9) {
        ji.j jVar;
        TLRPC.ChatFull chatFull;
        boolean z10;
        org.telegram.ui.Components.or orVar = this.K1;
        if (orVar != null && (jVar = this.R1) != null && (chatFull = this.f52564b3) != null) {
            if (this.Z2 != 0 && chatFull.requests_pending > 0 && !this.f52560b.f55499f) {
                z10 = true;
            } else {
                z10 = false;
            }
            orVar.i(jVar, z10, z9);
            this.R1.setTitle(org.telegram.messenger.id.G(this.f52564b3.requests_pending, "CommunityPendingRequestsRow", new Object[0]));
        }
    }

    public final void B4(View view) {
        boolean z9;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i7 = 0; i7 < 4; i7++) {
            if (org.telegram.messenger.p10.i(i7).p()) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        Collections.sort(arrayList, new pe(25));
        org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(this, view);
        if (arrayList.size() > 0) {
            if (H.x() > 0) {
                H.k();
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                int intValue = ((Integer) obj).intValue();
                if (this.currentAccount == intValue) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                int i11 = org.telegram.ui.ActionBar.m6.f27982i6;
                Drawable a02 = org.telegram.ui.ActionBar.m6.a0(getThemedColor(i11), 0, 0);
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
                org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.t6.j(linearLayout, a02, null, M, resourceProvider);
                TLRPC.User f10 = org.telegram.messenger.p10.i(intValue).f();
                org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
                v8Var.r(f10);
                fi.r3 r3Var = new fi.r3(this, getParentActivity(), z9);
                linearLayout.addView(r3Var, c8.ha.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getParentActivity());
                if (z9) {
                    k9Var.setScaleX(0.833f);
                    k9Var.setScaleY(0.833f);
                }
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
                k9Var.getImageReceiver().d = intValue;
                k9Var.e(f10, v8Var);
                r3Var.addView(k9Var, c8.ha.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f27998j5, getResourceProvider());
                textView.setText(org.telegram.messenger.t10.p(f10));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, c8.ha.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new bi.la(this, intValue, H, 14));
                H.r(linearLayout, c8.ha.o(230, 48));
            }
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(24.0f), getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.m6.r1(0.15f, -16777216));
        H.f35225z.set(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        H.W(d02);
        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
        H.V(5);
        H.Z();
    }

    public final void C3(org.telegram.ui.yw r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zw.C3(org.telegram.ui.yw):void");
    }

    public final void C4(int i7, long j3, TLRPC.Chat chat, boolean z9, boolean z10) {
        if (i7 == 103) {
            getMessagesController().X(1, j3, z10);
            return;
        }
        if (chat != null) {
            if (org.telegram.messenger.t3.r0(chat)) {
                getMessagesController().X(0, j3, z10);
            } else {
                getMessagesController().g0(-j3, getMessagesController().a2(Long.valueOf(getUserConfig().e())), null, z10, false);
            }
        } else {
            getMessagesController().X(0, j3, z10);
            if (z9 && z10) {
                getMessagesController().w(j3);
            }
        }
        if (org.telegram.messenger.g0.Q1()) {
            getNotificationCenter().k(org.telegram.messenger.qs.f25080t, Long.valueOf(j3));
        }
        getMessagesController().J(this.X2);
    }

    public final void D3() {
        getMessagesStorage().getClass();
    }

    public final void D4(java.util.ArrayList r41, int r42, boolean r43, boolean r44, java.util.HashSet r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zw.D4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    @Override
    public final List E() {
        return Arrays.asList(new pg.a(org.telegram.messenger.id.M0(2131751648, null)), new pg.a(org.telegram.messenger.id.M0(2131752076, null), new fu(this, 14)), new pg.a(org.telegram.messenger.id.M0(2131751649, null), new fu(this, 15)));
    }

    public final void E3() {
        if (this.f52577e0 != null) {
            int w32 = w3();
            int i7 = 0;
            while (true) {
                yw[] ywVarArr = this.f52577e0;
                if (i7 < ywVarArr.length) {
                    yw ywVar = ywVarArr[i7];
                    if (ywVar != null) {
                        vw vwVar = ywVar.f52125a;
                        vwVar.setPadding(0, vwVar.f39930f3, 0, w32);
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void E4(long r14, boolean r16, org.telegram.messenger.vo r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zw.E4(long, boolean, org.telegram.messenger.vo, int, boolean):void");
    }

    @Override
    public final void F(float f10, int i7) {
        org.telegram.ui.ActionBar.r0 r0Var;
        if (i7 == 3 && (r0Var = this.f52612l0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) r0Var.getIconView().getDrawable();
            if (this.d.f55499f) {
                animatedVectorDrawable.start();
                if (org.telegram.messenger.iz.o() != 0) {
                    TLRPC.TL_help_premiumPromo tL_help_premiumPromo = org.telegram.messenger.ui.b0(this.currentAccount).D;
                    String q02 = PremiumPreviewFragment.q0(2);
                    if (tL_help_premiumPromo != null) {
                        int i10 = 0;
                        while (true) {
                            if (i10 < tL_help_premiumPromo.video_sections.size()) {
                                if (tL_help_premiumPromo.video_sections.get(i10).equals(q02)) {
                                    break;
                                }
                                i10++;
                            } else {
                                i10 = -1;
                                break;
                            }
                        }
                        if (i10 != -1) {
                            org.telegram.messenger.w7.G(this.currentAccount).W(tL_help_premiumPromo.videos.get(i10), tL_help_premiumPromo, 3, 0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            animatedVectorDrawable.reset();
        }
    }

    public final void F3() {
        jh.f fVar = this.f52684z1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.f52684z1.getInputBubbleHeight() + this.f52666w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f));
        }
    }

    public final void F4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.K0.setBackground(new BitmapDrawable(createBitmap));
        this.K0.setAlpha(0.0f);
        this.K0.setVisibility(0);
        N3();
    }

    public final void G3() {
        int i7;
        yw ywVar;
        boolean z9 = true;
        float e42 = e4(true);
        pw pwVar = this.f52683z0;
        if (pwVar != null) {
            if (pwVar.getAlpha() == e42) {
                z9 = false;
            }
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, e42);
            this.f52683z0.setAlpha(e42);
            this.f52683z0.setScaleX(T1);
            this.f52683z0.setScaleY(T1);
            pw pwVar2 = this.f52683z0;
            if (e42 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            pwVar2.setVisibility(i7);
            if (z9 && (ywVar = this.f52577e0[0]) != null) {
                ywVar.f52125a.requestLayout();
            }
        }
        e5();
    }

    public final void G4(yw ywVar) {
        int i7;
        org.telegram.ui.Components.lz lzVar;
        if (ywVar.getVisibility() != 0) {
            return;
        }
        int i10 = ywVar.d.f16857w;
        if (ywVar.f52132s == 0 && l4() && ywVar.f52125a.getChildCount() == 0 && ywVar.f52133w == 2) {
            ((v4.b0) ywVar.f52125a.getLayoutManager()).h1(1, (int) this.N);
        }
        ywVar.d.getClass();
        ywVar.d.V();
        int b10 = ywVar.d.b();
        if (b10 == 1 && i10 == 1 && ywVar.d.d(0) == 5) {
            ywVar.q(true);
        } else {
            ywVar.q(false);
            if (b10 > i10 && (i7 = this.S0) != 11 && i7 != 12 && i7 != 13) {
                ywVar.D.b(i10);
            }
        }
        try {
            vw vwVar = ywVar.f52125a;
            if (this.X2 == 0 && this.Z2 == 0) {
                lzVar = ywVar.f52134x;
            } else {
                lzVar = null;
            }
            vwVar.setEmptyView(lzVar);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        C3(ywVar);
    }

    public final void H3() {
        int i7;
        int i10;
        float f10 = this.f52620n.f55498e;
        float T1 = org.telegram.messenger.g0.T1(0.2f, 1.0f, f10);
        li.w1 w1Var = this.D1;
        int i11 = 8;
        if (w1Var != null) {
            w1Var.setScaleX(T1);
            this.D1.setScaleY(T1);
            this.D1.setAlpha(f10);
            li.w1 w1Var2 = this.D1;
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            w1Var2.setVisibility(i10);
        }
        jh.f fVar = this.f52684z1;
        if (fVar != null) {
            fVar.setAlpha(f10);
            jh.f fVar2 = this.f52684z1;
            int i12 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i12 > 0) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            fVar2.setVisibility(i7);
            this.f52684z1.getFadeView().setAlpha(f10);
            View fadeView = this.f52684z1.getFadeView();
            if (i12 > 0) {
                i11 = 0;
            }
            fadeView.setVisibility(i11);
        }
    }

    public final void H4() {
        boolean z9;
        float f10 = 0.0f;
        if (this.N != 0.0f && !(z9 = this.K)) {
            if (z9) {
                f10 = -g4();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.H3, f10));
            animatorSet.setInterpolator(org.telegram.ui.Components.wq.f40046f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    public final void I3() {
        if (this.actionBar == null) {
            return;
        }
        org.telegram.ui.Components.p00.d(this.actionBar.getBackButton(), Math.max(this.f52664v3, (1.0f - this.f52560b.f55498e) * (1.0f - h4()) * (1.0f - this.f52566c.f55498e)));
    }

    public final void I4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zw.I4(int):void");
    }

    public final void J3() {
        float f10;
        if (this.f52598i0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.p00.d(this.f52588g0, com.google.android.recaptcha.internal.a.D(f10, 1.0f - this.f52560b.f55498e, 1.0f - h4(), 1.0f - this.f52566c.f55498e));
    }

    public final void J4(boolean z9, boolean z10) {
        int i7;
        int i10;
        vv vvVar = this.G3;
        if (vvVar != null && vvVar.c()) {
            return;
        }
        if (this.f52577e0[0].f52132s == 0 && l4() && this.f52577e0[0].f52133w == 2) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (this.K && !z10 && !this.E0.g()) {
            i10 = -org.telegram.messenger.g0.L(81.0f);
        } else {
            i10 = 0;
        }
        if (z9) {
            org.telegram.ui.Components.ri0 ri0Var = this.f52577e0[0].f52131r;
            ri0Var.f37666b = 1;
            ri0Var.d(i7, i10, false, false);
            H4();
            return;
        }
        this.f52577e0[0].f52127c.h1(i7, i10);
        H4();
    }

    public final void K3() {
        float f10;
        if (org.telegram.messenger.iz.f23438s.isEmpty()) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.p00.d(this.f52583f0, com.google.android.recaptcha.internal.a.D(f10, 1.0f - this.f52560b.f55498e, 1.0f - h4(), 1.0f - this.f52566c.f55498e));
    }

    public final void K4(String str, boolean z9) {
        a5(true, false, true, false);
        bg.p0 p0Var = this.Y;
        if (p0Var != null) {
            p0Var.b(true);
        }
        ow owVar = this.X;
        if (owVar != null) {
            owVar.f37446r.setText(str);
            this.X.f37446r.setSelection(str.length());
        }
    }

    public final void L3() {
        float f10;
        if (this.S0 != 2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.p00.d(this.f52603j0, com.google.android.recaptcha.internal.a.D(f10, this.f52582f.f55498e, 1.0f - h4(), 1.0f - this.f52566c.f55498e));
        sv svVar = this.E0;
        if (svVar != null) {
            svVar.invalidate();
        }
    }

    public final void L4(float f10) {
        yw[] ywVarArr;
        this.f52567c0 = f10;
        for (yw ywVar : this.f52577e0) {
            vw vwVar = ywVar.f52125a;
            for (int i7 = 0; i7 < vwVar.getChildCount(); i7++) {
                View childAt = vwVar.getChildAt(i7);
                if (childAt != null && RecyclerView.R(childAt) >= ywVar.d.f16853f + 1) {
                    childAt.setAlpha(f10);
                }
            }
        }
    }

    public final void M3() {
        org.telegram.ui.Components.p00.d(this.f52612l0, com.google.android.recaptcha.internal.a.D(this.f52560b.f55498e, 1.0f - h4(), 1.0f - this.f52566c.f55498e, this.d.f55498e));
    }

    public final void M4(boolean z9, boolean z10) {
        if (this.f52577e0 != null && this.T1 != z9) {
            if (z9) {
                this.S1 = new ArrayList(d4(this.currentAccount, this.f52577e0[0].f52132s, this.X2, false));
            } else {
                this.S1 = null;
            }
            this.T1 = z9;
            yw ywVar = this.f52577e0[0];
            ywVar.d.G = z9;
            if (!z9 && z10) {
                if (ywVar.f52125a.c0()) {
                    this.f52577e0[0].f52125a.post(new fu(this, 25));
                } else {
                    this.f52577e0[0].d.f();
                }
            }
        }
    }

    public final void N3() {
        boolean z9;
        bi.ec ecVar;
        if (!this.f52609k2 && ((ecVar = this.K0) == null || ecVar.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8)) {
            z9 = true;
        } else {
            z9 = false;
        }
        f fVar = this.J3;
        if (fVar != null) {
            ((me0) fVar.f45464b).f47935w.a(z9, true);
        }
    }

    public final void N4(boolean z9) {
        yw ywVar;
        if (org.telegram.messenger.iz.o() > 1 && org.telegram.messenger.sc.e(32768)) {
            if (z9) {
                yw[] ywVarArr = this.f52577e0;
                if (ywVarArr != null && (ywVar = ywVarArr[0]) != null) {
                    ywVar.setLayerType(2, null);
                    this.f52577e0[0].setClipChildren(false);
                    this.f52577e0[0].setClipToPadding(false);
                    this.f52577e0[0].f52125a.setClipChildren(false);
                }
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (lVar != null) {
                    lVar.setLayerType(2, null);
                }
                View view = this.fragmentView;
                if (view != null) {
                    ((ViewGroup) view).setClipChildren(false);
                    this.fragmentView.requestLayout();
                    return;
                }
                return;
            }
            if (this.f52577e0 != null) {
                int i7 = 0;
                while (true) {
                    yw[] ywVarArr2 = this.f52577e0;
                    if (i7 >= ywVarArr2.length) {
                        break;
                    }
                    yw ywVar2 = ywVarArr2[i7];
                    if (ywVar2 != null) {
                        ywVar2.setLayerType(0, null);
                        ywVar2.setClipChildren(true);
                        ywVar2.setClipToPadding(true);
                        ywVar2.f52125a.setClipChildren(true);
                    }
                    i7++;
                }
            }
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (lVar2 != null) {
                lVar2.setLayerType(0, null);
            }
            sv svVar = this.E0;
            if (svVar != null) {
                svVar.setLayerType(0, null);
            }
            View view2 = this.fragmentView;
            if (view2 != null) {
                ((ViewGroup) view2).setClipChildren(true);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void O3() {
        I3();
        org.telegram.ui.Components.p00.d(this.f52607k0, (1.0f - this.f52560b.f55498e) * (1.0f - h4()) * (1.0f - this.f52566c.f55498e));
        J3();
        M3();
        K3();
        L3();
    }

    public final void O4(float f10) {
        yw[] ywVarArr = this.f52577e0;
        int i7 = 0;
        if (ywVarArr != null) {
            int paddingTop = ywVarArr[0].f52125a.getPaddingTop() + ((int) f10);
            int i10 = 0;
            while (true) {
                yw[] ywVarArr2 = this.f52577e0;
                if (i10 >= ywVarArr2.length) {
                    break;
                }
                ywVarArr2[i10].f52125a.setTopGlowOffset(paddingTop);
                i10++;
            }
        }
        if (this.fragmentView != null && f10 != this.N) {
            this.N = f10;
            org.telegram.ui.Components.bc bcVar = this.f52632p3;
            if (bcVar != null) {
                bcVar.l();
            }
            if (this.F3 != null) {
                float currentActionBarHeight = 1.0f - ((-f10) / org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                org.telegram.ui.Cells.o oVar = this.F3;
                float f11 = (int) f10;
                float f12 = oVar.f29645f;
                oVar.h = f11;
                oVar.setTranslationY(f12 + f11);
                this.F3.setAlpha(c8.j9.a(currentActionBarHeight, 0.0f, 1.0f));
                org.telegram.ui.Cells.o oVar2 = this.F3;
                if (currentActionBarHeight <= 0.0f) {
                    i7 = 4;
                }
                oVar2.setVisibility(i7);
            }
            Q3();
            this.fragmentView.invalidate();
        }
    }

    public final void P3() {
        int i7;
        if (h4() > 0.5f) {
            i7 = 2131745706;
        } else {
            i7 = 2131745813;
        }
        String M0 = org.telegram.messenger.id.M0(i7, null);
        this.X.f37446r.setContentDescription(M0);
        this.X.f37446r.setHint(M0);
    }

    public final void P4(float f10) {
        this.f52680y1 = f10;
        n5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (org.telegram.messenger.iz.o() != 0) {
            org.telegram.messenger.sc.e(32768);
        }
        e5();
    }

    public final void Q3() {
        float f10;
        int i7;
        if (this.X == null) {
            return;
        }
        float a10 = 1.0f - c8.j9.a(((-this.N) - g4()) / org.telegram.messenger.g0.L(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.f52664v3, this.h.f55498e);
        float f11 = this.f52560b.f55498e;
        if (this.S0 != 2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float max2 = f10 * (1.0f - this.f52566c.f55498e) * (1.0f - max) * Math.max(f11, (1.0f - h4()) * a10);
        this.X.setAlpha(max2);
        ow owVar = this.X;
        boolean z9 = false;
        if (max2 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        owVar.setVisibility(i7);
        if (max2 <= 0.01f) {
            z9 = true;
        }
        this.f52582f.a(z9, true);
    }

    public final void Q4(CharSequence charSequence, String str) {
        if (str != null && !str.isEmpty()) {
            this.F2 = str;
            this.G2 = null;
            this.E2 = null;
            if (this.C1 != null) {
                v3(charSequence);
                return;
            } else {
                this.V3 = charSequence;
                return;
            }
        }
        this.F2 = null;
        this.G2 = null;
    }

    public final void R3() {
        int i7;
        float f10;
        int i10;
        int i11 = 8;
        if (this.Z != null) {
            if (this.f52555a0 != null) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float f11 = f10 * this.f52560b.f55498e;
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, f11);
            this.Z.setScaleX(T1);
            this.Z.setScaleY(T1);
            this.Z.setAlpha(f11);
            gz0 gz0Var = this.Z;
            if (f11 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            gz0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.u61 u61Var = this.f52555a0;
        te.a aVar = this.f52645s;
        if (u61Var != null) {
            float f12 = 1.0f - aVar.f55498e;
            u61Var.setAlpha(f12);
            org.telegram.ui.Components.u61 u61Var2 = this.f52555a0;
            if (f12 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            u61Var2.setVisibility(i7);
        }
        jg.q0 q0Var = this.f52561b0;
        if (q0Var != null) {
            float f13 = aVar.f55498e;
            q0Var.setAlpha(f13);
            jg.q0 q0Var2 = this.f52561b0;
            if (f13 > 0.0f) {
                i11 = 0;
            }
            q0Var2.setVisibility(i11);
        }
    }

    public final void R4(float f10) {
        if (org.telegram.messenger.iz.o() <= 0) {
            boolean z9 = org.telegram.messenger.r2.f25216a;
        } else if (this.X3 != f10) {
            boolean z10 = true;
            if (org.telegram.messenger.iz.o() > 1 && org.telegram.messenger.sc.e(32768)) {
                z10 = false;
            }
            this.Y3 = z10;
            this.X3 = f10;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.Y3) {
                float f11 = (1.0f - this.X3) * (-org.telegram.messenger.g0.L(40.0f));
                sv svVar = this.E0;
                if (svVar != null) {
                    svVar.setTranslationX(f11);
                }
                ow owVar = this.X;
                if (owVar != null) {
                    owVar.setTranslationX(f11);
                }
                vv vvVar = this.G3;
                if (vvVar != null && vvVar.getFragmentView() != null && !this.D) {
                    this.G3.getFragmentView().setTranslationX(f11);
                    return;
                }
                return;
            }
            float f12 = 1.0f - this.X3;
            float f13 = (-org.telegram.messenger.g0.L(4.0f)) * f12;
            float f14 = 1.0f - (f12 * 0.05f);
            sv svVar2 = this.E0;
            if (svVar2 != null) {
                svVar2.setScaleX(f14);
                this.E0.setScaleY(f14);
                this.E0.setTranslationX(f13);
                this.E0.setPivotX(0.0f);
                this.E0.setPivotY(0.0f);
            }
            ow owVar2 = this.X;
            if (owVar2 != null) {
                owVar2.setTranslationX(f13);
                this.X.setScaleX(f14);
                this.X.setScaleY(f14);
            }
            vv vvVar2 = this.G3;
            if (vvVar2 != null && vvVar2.getFragmentView() != null) {
                if (!this.D) {
                    this.G3.getFragmentView().setScaleX(f14);
                    this.G3.getFragmentView().setScaleY(f14);
                    this.G3.getFragmentView().setTranslationX(f13);
                }
                this.G3.getFragmentView().setPivotX(0.0f);
                this.G3.getFragmentView().setPivotY(0.0f);
            }
        }
    }

    public final void S3(boolean z9) {
        int i7;
        int i10;
        if (this.C0 != null && this.actionBar != null) {
            int i11 = org.telegram.messenger.g0.f22562n;
            int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(this.f52554a);
            if (this.f52555a0 != null) {
                i7 = org.telegram.messenger.g0.L(50.0f);
            } else {
                i7 = 0;
            }
            int i12 = measuredHeight + i7;
            org.telegram.ui.Components.or orVar = this.K1;
            if (orVar != null) {
                i10 = (int) orVar.c(org.telegram.messenger.g0.L(7.0f));
            } else {
                i10 = 0;
            }
            int i13 = i12 + i10;
            iw iwVar = this.C0;
            SparseArray sparseArray = iwVar.h;
            iwVar.W0 = i13;
            iwVar.X0 = i11;
            bi.q1 q1Var = iwVar.f33587a0;
            if (z9) {
                q1Var.q1(0, i13, 0, i11);
            } else {
                q1Var.setPadding(0, i13, 0, i11);
            }
            iwVar.O0.j(iwVar.W0, iwVar.X0, z9);
            org.telegram.ui.Components.sl0 sl0Var = iwVar.f33588b0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sl0Var.getLayoutParams();
            int i14 = marginLayoutParams.topMargin;
            int i15 = iwVar.W0;
            if (i14 != i15 || marginLayoutParams.bottomMargin != iwVar.X0) {
                marginLayoutParams.topMargin = i15;
                marginLayoutParams.bottomMargin = iwVar.X0;
                sl0Var.requestLayout();
            }
            org.telegram.ui.Components.fm0.Q(iwVar.f33594h0, iwVar.f33597k0, iwVar.W0, iwVar.X0, z9);
            org.telegram.ui.Components.fm0.Q(iwVar.m0, iwVar.f33601p0, iwVar.W0, iwVar.X0, z9);
            org.telegram.ui.Components.fm0.Q(iwVar.f33605t0, iwVar.f33608w0, iwVar.W0, iwVar.X0, z9);
            org.telegram.ui.Components.ze0 ze0Var = iwVar.f33603r0;
            int i16 = iwVar.W0;
            int i17 = iwVar.X0;
            ze0Var.setClipToPadding(false);
            org.telegram.ui.Components.r41 r41Var = ze0Var.f40923c;
            ze0Var.J = z9;
            ze0Var.setPadding(0, i16, 0, i17);
            if (z9) {
                r41Var.q1(0, i16, 0, i17);
            } else {
                r41Var.setPadding(0, i16, 0, i17);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) r41Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i16;
            marginLayoutParams2.bottomMargin = -i17;
            ze0Var.J = false;
            org.telegram.ui.Components.dl0 dl0Var = iwVar.I0;
            if (dl0Var != null) {
                dl0Var.b(iwVar.W0, iwVar.X0, z9);
            }
            int size = sparseArray.size();
            for (int i18 = 0; i18 < size; i18++) {
                View view = (View) sparseArray.valueAt(i18);
                if (view instanceof b00) {
                    ((b00) view).j(iwVar.W0, iwVar.X0, z9);
                }
            }
            for (int i19 = 0; i19 < iwVar.getChildCount(); i19++) {
                if (iwVar.getChildAt(i19) instanceof b00) {
                    ((b00) iwVar.getChildAt(i19)).j(iwVar.W0, iwVar.X0, z9);
                }
            }
        }
    }

    public final void S4() {
        getContactsController().B();
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.h41(13, this, r1), new dh(r1, 17));
        org.telegram.ui.ActionBar.w2 h = org.telegram.messenger.camera.q.h(getParentActivity(), false, 1, getResourceProvider());
        h.N = o6Var;
        h.U0 = 49;
        h.show();
        org.telegram.ui.ActionBar.w2[] w2VarArr = {h};
        h.P(org.telegram.ui.ActionBar.m6.f27963h5);
    }

    public final void T3() {
        if (this.K1 != null) {
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, 1.0f);
            this.K1.setAlpha(1.0f);
            this.K1.setScaleX(T1);
            this.K1.setScaleY(T1);
            this.K1.setVisibility(0);
        }
    }

    public final boolean T4(org.telegram.ui.Cells.t2 r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zw.T4(org.telegram.ui.Cells.t2):boolean");
    }

    public boolean U3() {
        if (this.S0 == 10) {
            return true;
        }
        return false;
    }

    public final void U4(boolean z9) {
        float f10;
        this.f52566c.a(z9, true);
        if (this.m0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.P3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.P3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.P3 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z9) {
            this.m0.setVisibility(0);
        } else {
            this.m0.setSelected(false);
            Drawable background = this.m0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.ActionBar.r0 r0Var = this.m0;
        Property property = View.ALPHA;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(r0Var, property, f10));
        this.P3.playTogether(arrayList);
        this.P3.addListener(new bw(this, z9, 1));
        this.P3.start();
    }

    public final void V3() {
        if (org.telegram.messenger.g0.Q1()) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.n(true);
            }
            TLObject tLObject = this.Y1;
            if (tLObject != null) {
                iw iwVar = this.C0;
                if (iwVar != null) {
                    iwVar.f33590d0.Q(this.X1, tLObject);
                }
                this.Y1 = null;
                return;
            }
            return;
        }
        this.W1 = true;
    }

    public final void V4() {
        if (!this.A0 && getMessagesController().U0 && getMessagesController().J3 && this.f52683z0 != null && getMessagesController().T0().isEmpty() && !this.isPaused && getUserConfig().P && !this.inPreviewMode) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            if (!e12.getBoolean("filterhint", false)) {
                e12.edit().putBoolean("filterhint", true).apply();
                org.telegram.messenger.g0.i3(new fu(this, 26), 1000L);
            }
        }
    }

    @Override
    public final boolean W(MotionEvent motionEvent, boolean z9) {
        vv vvVar;
        bi.ec ecVar;
        pw pwVar;
        boolean z10;
        boolean z11;
        if (!this.f52643r3 && (((vvVar = this.G3) == null || !vvVar.c()) && (((ecVar = this.K0) == null || ecVar.getVisibility() != 0) && ((pwVar = this.f52683z0) == null || !pwVar.f33380n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                pw pwVar2 = this.f52683z0;
                if (pwVar2 != null && pwVar2.getTabsCount() >= 2 && this.f52683z0.getCurrentTabId() != this.f52683z0.getFirstTabId()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                pw pwVar3 = this.f52683z0;
                if (pwVar3 != null && pwVar3.getTabsCount() >= 2 && this.f52683z0.getCurrentTabId() != this.f52683z0.getLastTabId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                org.telegram.messenger.iz.m(this.currentAccount);
                if (z9) {
                    if (!z11 || z10) {
                    }
                } else {
                    return z10;
                }
            }
            return true;
        }
        return false;
    }

    public final void W3() {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null && lVar.f27691n0) {
            lVar.m();
            this.f52643r3 = false;
            i5(true, true);
        }
    }

    public final void W4() {
        LaunchActivity launchActivity;
        boolean q10;
        int i7;
        int i10;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        LaunchActivity launchActivity2;
        float f10;
        CharSequence charSequence;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        gu guVar;
        org.telegram.ui.Components.h41 h41Var;
        int i11;
        org.telegram.ui.ActionBar.z0 z0Var;
        org.telegram.ui.ActionBar.h6 h6Var;
        int i12;
        int w02;
        int w03;
        int w04;
        int i13;
        int w05;
        org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(this, this.f52607k0);
        int i14 = org.telegram.ui.ActionBar.m6.A8;
        H.S(getThemedColor(i14), getThemedColor(i14));
        H.f35219s = 8;
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) parentActivity;
        } else {
            launchActivity = null;
        }
        float f11 = 64.0f;
        int i15 = 0;
        if (this.Z2 != 0) {
            if (org.telegram.messenger.t3.N(this.f52558a3)) {
                H.c(2131232106, org.telegram.messenger.id.M0(2131751913, null), new cv(this, 1), false);
                H.k();
            }
            H.i(new cv(this, 4), org.telegram.messenger.id.M0(2131751912, null), this.f52558a3.collapsed_in_dialogs);
            H.i(new cv(this, 5), org.telegram.messenger.id.M0(2131751911, null), !this.f52558a3.collapsed_in_dialogs);
            H.Z();
            H.X(-org.telegram.messenger.g0.L(64.0f));
        } else if (q4()) {
            H.c(2131232106, org.telegram.messenger.id.M0(2131754143, null), new cv(this, 6), false);
            H.c(2131232182, org.telegram.messenger.id.M0(2131749276, null), new cv(this, 7), false);
            H.Z();
            H.X(-org.telegram.messenger.g0.L(64.0f));
        } else {
            org.telegram.ui.ActionBar.h6 h6Var2 = this.resourceProvider;
            if (h6Var2 != null) {
                q10 = h6Var2.a();
            } else {
                q10 = org.telegram.ui.ActionBar.m6.I.q();
            }
            if (q10) {
                i7 = 2131231784;
            } else {
                i7 = 2131231843;
            }
            if (q10) {
                i10 = 2131744300;
            } else {
                i10 = 2131744299;
            }
            H.c(i7, org.telegram.messenger.id.M0(i10, null), new cv(this, 8), false);
            H.k();
            H.c(2131232483, org.telegram.messenger.id.M0(2131748273, null), new cv(this, 9), false);
            H.c(2131232504, org.telegram.messenger.id.M0(2131745901, null), new cv(this, 10), false);
            org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f25569a;
            if (((org.telegram.messenger.h0) getMessagesController().f24946x7.f24450j0.f13891b).f22784c) {
                H.c(2131231275, org.telegram.messenger.id.M0(2131743194, null), new fu(this, 0), false);
            } else {
                TLRPC.TL_attachMenuBots tL_attachMenuBots = org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24474s0).f25806b;
                if (launchActivity != null && tL_attachMenuBots != null && (arrayList = tL_attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = tL_attachMenuBots.bots;
                    int size = arrayList3.size();
                    int i16 = 0;
                    while (i16 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i16);
                        i16++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_side_menu) {
                            gu guVar2 = new gu(this, tL_attachMenuBot2, launchActivity, i15);
                            org.telegram.ui.Components.h41 h41Var2 = new org.telegram.ui.Components.h41(15, this, tL_attachMenuBot2);
                            org.telegram.ui.ActionBar.h6 h6Var3 = H.d;
                            if (H.f35194e != null) {
                                int i17 = org.telegram.ui.ActionBar.m6.F8;
                                int i18 = org.telegram.ui.ActionBar.m6.E8;
                                f10 = f11;
                                org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(0, H.f35194e, H.d, false, false);
                                z0Var2.setPadding(org.telegram.messenger.g0.L(18.0f), i15, org.telegram.messenger.g0.L(18.0f), i15);
                                if (tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                    charSequence = org.telegram.ui.Cells.m8.b(tL_attachMenuBot2.short_name);
                                } else {
                                    charSequence = tL_attachMenuBot2.short_name;
                                }
                                Pattern pattern = org.telegram.messenger.ui.R1;
                                ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList4 = tL_attachMenuBot2.icons;
                                int size2 = arrayList4.size();
                                arrayList2 = arrayList3;
                                int i19 = 0;
                                while (true) {
                                    if (i19 < size2) {
                                        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList4.get(i19);
                                        int i20 = i19 + 1;
                                        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon3 = tL_attachMenuBotIcon2;
                                        launchActivity2 = launchActivity;
                                        if (tL_attachMenuBotIcon3.name.equals("android_side_menu_static")) {
                                            tL_attachMenuBotIcon = tL_attachMenuBotIcon3;
                                            break;
                                        } else {
                                            i19 = i20;
                                            launchActivity = launchActivity2;
                                        }
                                    } else {
                                        launchActivity2 = launchActivity;
                                        tL_attachMenuBotIcon = null;
                                        break;
                                    }
                                }
                                if (tL_attachMenuBotIcon != null) {
                                    i11 = 16;
                                    org.telegram.messenger.rz f12 = org.telegram.messenger.t5.f(tL_attachMenuBotIcon.icon, org.telegram.ui.ActionBar.m6.f27873c7, 1.0f, null);
                                    if (f12 != null) {
                                        Integer num = H.f35206k0;
                                        if (num != null) {
                                            w05 = num.intValue();
                                        } else {
                                            w05 = org.telegram.ui.ActionBar.m6.w0(i17, h6Var3);
                                        }
                                        new PorterDuffColorFilter(w05, PorterDuff.Mode.SRC_IN);
                                    }
                                    org.telegram.messenger.hc b10 = org.telegram.messenger.hc.b(tL_attachMenuBotIcon.icon);
                                    guVar = guVar2;
                                    z0Var = z0Var2;
                                    h41Var = h41Var2;
                                    CharSequence charSequence2 = charSequence;
                                    i12 = i17;
                                    h6Var = h6Var3;
                                    z0Var.k(charSequence2, b10, "24_24", f12, tL_attachMenuBot2);
                                    org.telegram.ui.Components.k9 k9Var = z0Var.h;
                                    if (k9Var != null) {
                                        if (org.telegram.messenger.id.f23161a0) {
                                            i13 = 5;
                                        } else {
                                            i13 = 3;
                                        }
                                        k9Var.setLayoutParams(c8.ha.e(24, 24, i13 | 16));
                                    }
                                } else {
                                    guVar = guVar2;
                                    h41Var = h41Var2;
                                    i11 = 16;
                                    z0Var = z0Var2;
                                    CharSequence charSequence3 = charSequence;
                                    h6Var = h6Var3;
                                    i12 = i17;
                                    z0Var.j(charSequence3, 2131232072, null);
                                }
                                Integer num2 = H.f35204j0;
                                if (num2 == null && H.f35206k0 == null) {
                                    z0Var.c(i18, i12);
                                } else {
                                    if (num2 != null) {
                                        w02 = num2.intValue();
                                    } else {
                                        w02 = org.telegram.ui.ActionBar.m6.w0(i18, h6Var);
                                    }
                                    Integer num3 = H.f35206k0;
                                    if (num3 != null) {
                                        w03 = num3.intValue();
                                    } else {
                                        w03 = org.telegram.ui.ActionBar.m6.w0(i12, h6Var);
                                    }
                                    z0Var.d(w02, w03);
                                }
                                Integer num4 = H.f35206k0;
                                if (num4 != null) {
                                    w04 = num4.intValue();
                                } else {
                                    w04 = org.telegram.ui.ActionBar.m6.w0(i12, h6Var);
                                }
                                z0Var.setIconColorImage(w04);
                                Integer num5 = H.f35208l0;
                                if (num5 != null) {
                                    z0Var.setSelectorColor(num5.intValue());
                                } else {
                                    z0Var.h(0.12f, i18);
                                }
                                z0Var.setOnClickListener(new org.telegram.ui.Components.kk(i11, H, guVar));
                                z0Var.setOnLongClickListener(new di.f2(3, H, h41Var));
                                int i21 = H.S;
                                if (i21 > 0) {
                                    z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i21));
                                    H.r(z0Var, c8.ha.o(H.S, -2));
                                } else {
                                    H.r(z0Var, c8.ha.o(-1, -2));
                                }
                                arrayList3 = arrayList2;
                                launchActivity = launchActivity2;
                                f11 = f10;
                                i15 = 0;
                            }
                        }
                        arrayList2 = arrayList3;
                        launchActivity2 = launchActivity;
                        f10 = f11;
                        arrayList3 = arrayList2;
                        launchActivity = launchActivity2;
                        f11 = f10;
                        i15 = 0;
                    }
                }
            }
            float f13 = f11;
            if (getUserConfig().W) {
                H.c(2131232361, org.telegram.messenger.id.M0(2131745495, null), new cv(this, 3), false);
            }
            org.telegram.ui.ActionBar.z0 z0Var3 = this.f52625o0;
            if (z0Var3 != null) {
                org.telegram.ui.ActionBar.t6.U(z0Var3.f28803b, org.telegram.ui.ActionBar.m6.Oi, getResourceProvider());
                this.f52625o0.setOnClickListener(new org.telegram.ui.Components.u41(12, this, H));
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25570b.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().f24952y3 && !org.telegram.messenger.iz.f23460z1.isEmpty())) {
                    H.k();
                    H.d(this.f52625o0);
                }
            }
            H.Z();
            H.X(-org.telegram.messenger.g0.L(f13));
        }
    }

    public final void X3(String str) {
        if (this.actionBar.c(str)) {
            return;
        }
        org.telegram.ui.ActionBar.y p10 = this.actionBar.p(str);
        boolean z9 = this.W;
        ArrayList arrayList = this.f52604j1;
        if (z9) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f52594h1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f52594h1.setImageDrawable(new org.telegram.ui.ActionBar.y1(true));
            org.telegram.ui.ActionBar.t6.s(this.f52594h1, org.telegram.ui.ActionBar.m6.f28284y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.f52594h1;
            int i7 = org.telegram.ui.ActionBar.m6.f28302z8;
            org.telegram.ui.ActionBar.t6.Q(imageView2, org.telegram.ui.ActionBar.m6.h0(getThemedColor(i7), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i7), getResourceProvider());
            this.f52594h1.setOnClickListener(new hu(this, 6));
            p10.addView(this.f52594h1, c8.ha.r(54, 54, 16));
            arrayList.add(this.f52594h1);
        }
        NumberTextView numberTextView = new NumberTextView(p10.getContext());
        this.f52599i1 = numberTextView;
        int i10 = 18;
        numberTextView.setTextSize(18);
        this.f52599i1.setTypeface(org.telegram.messenger.g0.o());
        this.f52599i1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.m6.f28284y8));
        NumberTextView numberTextView2 = this.f52599i1;
        if (!this.W) {
            i10 = 72;
        }
        p10.addView(numberTextView2, c8.ha.m(1.0f, 0, -1, i10, 0, 0));
        this.f52599i1.setOnTouchListener(new ei.b(2));
        this.l1 = p10.g(100, 2131232293, org.telegram.messenger.g0.L(48.0f));
        this.f52616m1 = p10.g(104, 2131232256, org.telegram.messenger.g0.L(48.0f));
        this.n1 = p10.g(107, 2131232051, org.telegram.messenger.g0.L(48.0f));
        this.f52608k1 = p10.h(102, 2131232108, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.id.M0(2131751598, null));
        org.telegram.ui.ActionBar.r0 h = p10.h(0, 2131231244, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.id.M0(2131754839, null));
        p10.addView(new View(getParentActivity()), c8.ha.o(5, -1));
        this.f52641r1 = h.e(105, 2131232051, org.telegram.messenger.id.M0(2131754172, null));
        this.f52626o1 = h.e(108, 2131232293, org.telegram.messenger.id.M0(2131751453, null));
        this.f52630p1 = h.e(109, 2131232046, org.telegram.messenger.id.M0(2131750812, null));
        this.f52635q1 = h.e(110, 2131232329, org.telegram.messenger.id.M0(2131750712, null));
        this.f52652t1 = h.e(101, 2131232215, org.telegram.messenger.id.M0(2131748681, null));
        this.f52647s1 = h.e(103, 2131232092, org.telegram.messenger.id.M0(2131752089, null));
        this.f52657u1 = h.e(106, 2131232067, org.telegram.messenger.id.M0(2131753692, null));
        this.f52616m1.setOnLongClickListener(new tu(this, 1));
        arrayList.add(this.l1);
        arrayList.add(this.n1);
        arrayList.add(this.f52616m1);
        arrayList.add(this.f52608k1);
        arrayList.add(h);
        f5(false);
    }

    public final void X4() {
        if (this.S3 == null) {
            for (String str : getMessagesController().S3) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = org.telegram.messenger.id.M0(2131749319, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749320, null));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131749533, null), new iu(this, 6));
                    showDialog(u1Var, new ou(this, 0));
                    this.S3 = str;
                    return;
                }
            }
        }
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        int i10;
        int i11;
        int i12 = 8;
        if (i7 == 1) {
            O3();
            Q3();
            T3();
            G3();
            R3();
            ow owVar = this.X;
            te.a aVar = this.f52560b;
            owVar.setBlurredBackgroundVisibility(aVar.f55498e);
            float a10 = a8.j7.a(aVar.f55498e);
            org.telegram.ui.Components.k9 k9Var = this.f52570c3;
            if (k9Var != null) {
                k9Var.setScaleX(a10);
                this.f52570c3.setScaleY(a10);
                this.f52570c3.setAlpha(a10);
                org.telegram.ui.Components.k9 k9Var2 = this.f52570c3;
                if (a10 > 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                k9Var2.setVisibility(i11);
            }
            if (this.f52661v0 != null) {
                float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a10);
                this.f52661v0.setScaleX(T1);
                this.f52661v0.setScaleY(T1);
                this.f52661v0.setAlpha(a10);
                fi.d dVar = this.f52661v0;
                int i13 = (a10 > 0.0f ? 1 : (a10 == 0.0f ? 0 : -1));
                if (i13 > 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                dVar.setVisibility(i10);
                this.f52667w0.setAlpha(a10);
                lh.f fVar = this.f52667w0;
                if (i13 > 0) {
                    i12 = 0;
                }
                fVar.setVisibility(i12);
            }
        } else if (i7 == 2) {
            O3();
            Q3();
        } else if (i7 == 3) {
            M3();
        } else if (i7 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        } else if (i7 == 5) {
            L3();
        } else if (i7 == 6) {
            O3();
            Q3();
        } else if (i7 == 7) {
            H3();
        } else if (i7 == 8) {
            G3();
            R3();
        } else if (i7 == 9) {
            R3();
        }
    }

    public final void Y3() {
        int i7;
        iw iwVar = this.C0;
        if ((iwVar != null && iwVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f52627o2 != null) {
            i7 = 2;
        } else if (!this.f52617m2) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        iw iwVar2 = new iw(this, getParentActivity(), this, i7, this.S0, this.X2, this.Z2, new gv(this));
        this.C0 = iwVar2;
        this.glassEngine.c(iwVar2);
        ((sw) this.fragmentView).addView(this.C0, this.B0);
        iw iwVar3 = this.C0;
        iwVar3.f33590d0.U = new kw(this);
        iwVar3.f33597k0.setOnItemClickListener(new iu(this, 1));
        this.C0.f33601p0.setOnItemClickListener(new iu(this, 2));
        this.C0.f33608w0.setOnItemClickListener(new nu(this, 0));
        this.C0.f33601p0.setOnItemLongClickListener(new iu(this, 3));
        this.C0.f33587a0.setOnItemClickListener(new iu(this, 4));
        this.C0.f33587a0.setOnItemLongClickListener(new gv(this));
        this.C0.setFilteredSearchViewDelegate(new iu(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.f52633p4);
    }

    public final void Y4(long j3, View view) {
        ArrayList d42;
        int i7;
        s3(j3, view);
        boolean x10 = this.actionBar.x();
        ArrayList arrayList = this.J2;
        boolean z9 = true;
        if (x10) {
            if (arrayList.isEmpty()) {
                n4(true);
                return;
            }
        } else {
            if (this.f52643r3) {
                X3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.s4)) {
                    this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
                }
            } else {
                X3(null);
            }
            org.telegram.messenger.g0.v1(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
            this.actionBar.Q(null, null);
            int i10 = this.f52577e0[0].f52132s;
            if ((i10 != 7 && i10 != 8) || (this.actionBar.x() && !this.actionBar.y(null))) {
                d42 = getMessagesController().W0(this.X2);
            } else {
                d42 = d4(this.currentAccount, this.f52577e0[0].f52132s, this.X2, this.T1);
            }
            int size = d42.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) d42.get(i12);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (s4(dialog)) {
                        i11++;
                    } else if (!getMessagesController().C2(dialog.f26964id, false)) {
                        break;
                    }
                }
            }
            if (i11 > 1) {
                if (this.f52577e0 != null) {
                    int i13 = 0;
                    while (true) {
                        yw[] ywVarArr = this.f52577e0;
                        if (i13 >= ywVarArr.length) {
                            break;
                        }
                        ywVarArr[i13].d.H = true;
                        i13++;
                    }
                }
                int i14 = org.telegram.messenger.qp.C8;
                u5(131072, true);
            }
            if (!this.f52643r3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f52604j1;
                    if (i15 >= arrayList3.size()) {
                        break;
                    }
                    View view2 = (View) arrayList3.get(i15);
                    view2.setPivotY(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2);
                    org.telegram.messenger.g0.y(view2);
                    arrayList2.add(ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.1f, 1.0f));
                    i15++;
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(200L);
                animatorSet.start();
            }
            ValueAnimator valueAnimator = this.f52670w3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f52670w3 = ValueAnimator.ofFloat(this.f52664v3, 1.0f);
            int i16 = 0;
            while (true) {
                yw[] ywVarArr2 = this.f52577e0;
                if (i16 >= ywVarArr2.length) {
                    break;
                }
                yw ywVar = ywVarArr2[i16];
                if (ywVar != null) {
                    ywVar.f52125a.I0(true);
                }
                i16++;
            }
            if (this.K) {
                i7 = 81;
            } else {
                i7 = 0;
            }
            float max = Math.max(0.0f, org.telegram.messenger.g0.L(i7 + 48) + this.N);
            if (max != 0.0f) {
                this.P = (int) max;
                this.fragmentView.requestLayout();
            }
            this.f52670w3.addUpdateListener(new ju(this, max, 0));
            this.f52670w3.addListener(new dw(this, max, 1));
            this.f52670w3.setInterpolator(org.telegram.ui.Components.wq.f40046f);
            this.f52670w3.setDuration(200L);
            this.f52670w3.start();
            pw pwVar = this.f52683z0;
            if (pwVar != null) {
                pwVar.b(org.telegram.ui.ActionBar.m6.f28218ui, org.telegram.ui.ActionBar.m6.f28198ti, org.telegram.ui.ActionBar.m6.f28179si, org.telegram.ui.ActionBar.m6.f28236vi, org.telegram.ui.ActionBar.m6.f28246w8);
            }
            org.telegram.ui.ActionBar.y1 y1Var = this.f52584f1;
            if (y1Var != null) {
                y1Var.c(true, 1.0f);
            }
            z9 = false;
        }
        f5(false);
        this.f52599i1.a(arrayList.size(), z9);
    }

    public final void Z3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f52679y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i7 = 0; i7 < 2; i7++) {
                undoViewArr[i7] = new ew(this, parentActivity);
                FrameLayout.LayoutParams d = c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.f52592g4 + this.f52602i4 + d.bottomMargin;
                UndoView undoView = undoViewArr[i7];
                int i10 = this.f52673x0 + 1;
                this.f52673x0 = i10;
                ((sw) this.fragmentView).addView(undoView, i10, d);
            }
        }
    }

    public final void Z4(long j3, View view) {
        String str;
        org.telegram.ui.Components.bc K;
        int i7 = -this.M3;
        this.M3 = i7;
        org.telegram.messenger.g0.G3(i7, view, null);
        org.telegram.messenger.p2.APP_ERROR.a();
        if (j3 >= 0) {
            str = org.telegram.messenger.t10.p(org.telegram.messenger.qp.s1(this.currentAccount).a2(Long.valueOf(j3)));
        } else {
            str = "";
        }
        if (getMessagesController().D3()) {
            K = org.telegram.ui.Components.gc.a0(this).Q(2131624216, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131743760, str)));
        } else {
            K = org.telegram.ui.Components.gc.a0(this).K(2131624216, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131743760, str)), org.telegram.messenger.id.M0(2131743759, null), new fu(this, 8));
        }
        K.j();
    }

    public final void a4(final long j3, final long j10, boolean z9, final z91 z91Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String M0;
        String b02;
        String M02;
        TLRPC.TL_forumTopic f10;
        if (A3(j3)) {
            int i7 = this.S0;
            if (i7 != 11 && i7 != 12 && i7 != 13) {
                if (z9 && ((this.f52590g2 != null && this.f52595h2 != null) || this.f52600i2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (org.telegram.messenger.m5.C(j3)) {
                            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(getMessagesController().a1(Integer.valueOf((int) (4294967295L & j3))).user_id));
                            if (a22 != null) {
                                M0 = org.telegram.messenger.id.M0(2131745596, null);
                                b02 = org.telegram.messenger.id.b0(this.f52590g2, org.telegram.messenger.t10.p(a22));
                                M02 = org.telegram.messenger.id.M0(2131745640, null);
                            } else {
                                return;
                            }
                        } else if (org.telegram.messenger.m5.E(j3)) {
                            if (j3 == getUserConfig().e()) {
                                M0 = org.telegram.messenger.id.M0(2131745596, null);
                                b02 = org.telegram.messenger.id.b0(this.f52595h2, org.telegram.messenger.id.M0(2131745901, null));
                                M02 = org.telegram.messenger.id.M0(2131745640, null);
                            } else {
                                TLRPC.User a23 = getMessagesController().a2(Long.valueOf(j3));
                                if (a23 != null && this.f52590g2 != null) {
                                    M0 = org.telegram.messenger.id.M0(2131745596, null);
                                    b02 = org.telegram.messenger.id.b0(this.f52590g2, org.telegram.messenger.t10.p(a23));
                                    M02 = org.telegram.messenger.id.M0(2131745640, null);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(-j3));
                            if (M03 != null) {
                                String str = M03.title;
                                if (j10 != 0 && (f10 = getMessagesController().f24881q7.f(M03.f26960id, j10)) != null) {
                                    str = ((Object) str) + " " + f10.title;
                                }
                                if (this.f52600i2 != null) {
                                    M0 = org.telegram.messenger.id.M0(2131754366, null);
                                    b02 = org.telegram.messenger.id.b0(this.f52600i2, str);
                                    M02 = org.telegram.messenger.id.M0(2131754486, null);
                                } else {
                                    M0 = org.telegram.messenger.id.M0(2131745596, null);
                                    b02 = org.telegram.messenger.id.b0(this.f52595h2, str);
                                    M02 = org.telegram.messenger.id.M0(2131745640, null);
                                }
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.g0.X2(b02);
                        alertDialog$Builder.k(M02, new org.telegram.ui.ActionBar.r1() {
                            @Override
                            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                                zw.this.a4(j3, j10, false, z91Var);
                            }
                        });
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        if (showDialog(u1Var) == null) {
                            u1Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == 15) {
                    Runnable d3Var = new bi.d3(this, j3, new bi.h4(this, j3, j10, z91Var, 6), 26);
                    if (j3 < 0) {
                        c5(getMessagesController().M0(Long.valueOf(-j3)), d3Var, null);
                        return;
                    }
                    TLRPC.User a24 = getMessagesController().a2(Long.valueOf(j3));
                    TLRPC.User a25 = getMessagesController().a2(Long.valueOf(this.H));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String a02 = org.telegram.messenger.id.a0(null, null, 2131754074, org.telegram.messenger.t10.j(a24, true), org.telegram.messenger.t10.j(a25, true));
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27300a;
                    u1Var2.R = a02;
                    u1Var2.T = TextUtils.concat(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131754075, org.telegram.messenger.t10.j(a24, true), org.telegram.messenger.t10.j(a25, true))));
                    alertDialog$Builder2.k(org.telegram.messenger.id.a0("Send", null, 2131745640, new Object[0]), new zr(d3Var, 5));
                    alertDialog$Builder2.h(org.telegram.messenger.id.a0("Cancel", null, 2131752589, new Object[0]), new org.telegram.ui.Components.il0(16));
                    showDialog(u1Var2);
                    return;
                } else if (this.D2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(org.telegram.messenger.xr.a(j3, j10));
                    if (this.D2.y(this, arrayList, null, false, this.K2, this.L2, this.M2, z91Var) && this.f52605j2) {
                        this.D2 = null;
                        return;
                    }
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            if (org.telegram.messenger.m5.E(j3)) {
                TLRPC.User a26 = getMessagesController().a2(Long.valueOf(j3));
                if (!a26.mutual_contact) {
                    UndoView k42 = k4();
                    if (k42 != null) {
                        k42.j(45, j3, null);
                        return;
                    }
                    return;
                }
                user = a26;
                chat = null;
            } else {
                TLRPC.Chat M04 = getMessagesController().M0(Long.valueOf(-j3));
                if (org.telegram.messenger.t3.N(M04) && org.telegram.messenger.t3.w(1, M04)) {
                    chat = M04;
                    user = null;
                } else {
                    UndoView k43 = k4();
                    if (k43 != null) {
                        k43.j(46, j3, null);
                        return;
                    }
                    return;
                }
            }
            org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().j1(j3);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new bi.g4(this, u1Var3, user, chat, j3, tL_messages_checkHistoryImportPeer));
            try {
                u1Var3.r(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void a5(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zw.a5(boolean, boolean, boolean, boolean):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Wk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Vk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.al));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Zk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Yk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Xk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27947g8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Gj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27931f9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27948g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28058m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28282y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27912e9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27893d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27875c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.M7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.N7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27966h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28075n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28040l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28093o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28002j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28022k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27855b8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27835a8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Z7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Y7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.X7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.W7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.V7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.K7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27854b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28110p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28020k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.nk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Z5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28285y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28266x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28247w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28228v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28209u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28189t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28152r9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28133q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28113p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27984i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27856b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27836a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27891d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28236vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G8));
    }

    public final void b4(long j3, boolean z9) {
        if (this.f52577e0 != null) {
            int i7 = 0;
            while (true) {
                yw[] ywVarArr = this.f52577e0;
                if (i7 < ywVarArr.length) {
                    int childCount = ywVarArr[i7].f52125a.getChildCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 < childCount) {
                            View childAt = this.f52577e0[i7].f52125a.getChildAt(i10);
                            if (childAt instanceof org.telegram.ui.Cells.t2) {
                                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                                if (t2Var.getDialogId() == j3) {
                                    t2Var.c0(z9, true);
                                    break;
                                }
                            }
                            i10++;
                        }
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void b5() {
        int i7;
        int i10;
        Long l10;
        if (this.M0 == null && !org.telegram.messenger.iz.f23452x && (!this.K || this.E0.g())) {
            k11[] k11VarArr = new k11[1];
            TLRPC.User f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24474s0).f();
            org.telegram.ui.ActionBar.m5 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.E3.f();
                Drawable drawable = this.E3.f33464f[0];
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(titleTextView.getRightDrawable().getBounds());
                rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
                int L = (-(this.actionBar.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                i7 = org.telegram.messenger.g0.L(4.0f) + (rect.centerX() - org.telegram.messenger.g0.L(16.0f));
                org.telegram.ui.Cells.o oVar = this.F3;
                if (oVar != null) {
                    oVar.b(rect.centerX(), rect.centerY());
                }
                i10 = L;
            } else {
                i7 = 0;
                i10 = 0;
            }
            wv wvVar = new wv(this, this, getParentActivity(), Integer.valueOf(i7), getResourceProvider(), k11VarArr);
            if (f10 != null && org.telegram.messenger.m5.g(f10.emoji_status) > 0) {
                wvVar.setExpireDateHint(org.telegram.messenger.m5.g(f10.emoji_status));
            }
            Long l11 = this.C3;
            if (l11 != null) {
                wvVar.setSelected(l11);
            } else {
                Drawable drawable2 = this.E3.f33464f[0];
                if (drawable2 instanceof org.telegram.ui.Components.h5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.h5) drawable2).h());
                } else {
                    l10 = null;
                }
                wvVar.setSelected(l10);
            }
            wvVar.setSaveState(1);
            wvVar.y(this.E3, titleTextView);
            xv xvVar = new xv(this, wvVar);
            this.M0 = xvVar;
            k11VarArr[0] = xvVar;
            xvVar.showAsDropDown(this.actionBar, org.telegram.messenger.g0.L(16.0f), i10, 48);
            k11VarArr[0].b();
        }
    }

    public final void c5(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zw.c5(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    @Override
    public final boolean canBeginSlide() {
        pw pwVar;
        if (!this.G3.c()) {
            if (this.S0 == 3 && (pwVar = this.f52683z0) != null && pwVar.getVisibility() == 0 && this.f52683z0.K > 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean closeLastFragment() {
        if (this.G3.c()) {
            this.G3.a();
            iw iwVar = this.C0;
            if (iwVar != null) {
                iwVar.S();
                return true;
            }
            return true;
        }
        return super.closeLastFragment();
    }

    @Override
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        org.telegram.ui.Components.q7 q7Var = new org.telegram.ui.Components.q7(this, context, this.resourceProvider, 3);
        q7Var.setAllowOverlayTitle(true);
        q7Var.G0 = true;
        if (q7Var.F0 == null) {
            di.b4 b4Var = new di.b4(q7Var.getContext(), 5);
            q7Var.F0 = b4Var;
            q7Var.addView(b4Var);
        }
        org.telegram.ui.ActionBar.t6.l(q7Var, 3, org.telegram.ui.ActionBar.m6.f28188t8, getResourceProvider());
        org.telegram.ui.ActionBar.t6.a(q7Var, org.telegram.ui.ActionBar.m6.f28302z8, getResourceProvider(), true);
        org.telegram.ui.ActionBar.t6.l(q7Var, 1, org.telegram.ui.ActionBar.m6.f28227v8, getResourceProvider());
        org.telegram.ui.ActionBar.t6.b(q7Var, org.telegram.ui.ActionBar.m6.f28284y8, getResourceProvider(), true);
        if (q7Var.f27715x1 == null) {
            di.j jVar = new di.j(q7Var, q7Var.getContext(), q7Var.J0, q7Var.O0);
            q7Var.f27715x1 = jVar;
            jVar.setClipChildren(false);
            q7Var.addView(q7Var.f27715x1);
        }
        q7Var.getAdditionalSubTitleOverlayContainer().setTranslationX(org.telegram.messenger.g0.L(4.0f));
        q7Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-org.telegram.messenger.g0.L(3.0f));
        if (!this.inPreviewMode && (!org.telegram.messenger.g0.Q1() || this.X2 == 0 || q4())) {
            return q7Var;
        }
        q7Var.setOccupyStatusBar(false);
        return q7Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zw.createView(android.content.Context):android.view.View");
    }

    public final java.util.ArrayList d4(int r11, int r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zw.d4(int, int, int, boolean):java.util.ArrayList");
    }

    public final void d5(boolean z9) {
        yw[] ywVarArr;
        char c10;
        char c11;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ywVarArr = this.f52577e0;
            if (i10 >= ywVarArr.length) {
                break;
            }
            ywVarArr[i10].f52125a.C0();
            i10++;
        }
        if (z9 && ywVarArr.length > 1) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int i11 = ywVarArr[c10].h;
        if (i11 >= 0 && i11 < getMessagesController().T0().size()) {
            org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) getMessagesController().T0().get(this.f52577e0[c10].h);
            if (voVar.e()) {
                yw ywVar = this.f52577e0[c10];
                ywVar.f52132s = this.S0;
                vw vwVar = ywVar.f52125a;
                int i12 = vw.B3;
                vwVar.D1();
            } else {
                yw[] ywVarArr2 = this.f52577e0;
                if (ywVarArr2[c10 ^ 1].f52132s == 7) {
                    ywVarArr2[c10].f52132s = 8;
                } else {
                    ywVarArr2[c10].f52132s = 7;
                }
                ywVarArr2[c10].f52125a.setScrollEnabled(true);
                org.telegram.messenger.qp messagesController = getMessagesController();
                if (this.f52577e0[c10].f52132s == 8) {
                    c11 = 1;
                } else {
                    c11 = 0;
                }
                org.telegram.messenger.vo[] voVarArr = messagesController.M;
                org.telegram.messenger.vo voVar2 = voVarArr[c11];
                if (voVar2 != voVar) {
                    voVarArr[c11] = voVar;
                    int i13 = c11 ^ 1;
                    if (voVarArr[i13] == voVar) {
                        voVarArr[i13] = null;
                    }
                    if (voVarArr[c11] == null) {
                        if (voVar2 != null) {
                            voVar2.f26082k.clear();
                            voVar2.f26083l.clear();
                        }
                    } else {
                        messagesController.T4(null);
                    }
                }
            }
            yw[] ywVarArr3 = this.f52577e0;
            if (ywVarArr3.length > 1) {
                ywVarArr3[1].E = voVar.f26087p;
            }
            yw ywVar2 = ywVarArr3[c10];
            jv jvVar = ywVar2.d;
            jvVar.h = ywVar2.f52132s;
            jvVar.f();
            yw ywVar3 = this.f52577e0[c10];
            fv fvVar = ywVar3.f52127c;
            if (ywVar3.f52132s == 0 && l4() && this.f52577e0[c10].f52133w == 2) {
                i7 = 1;
            }
            fvVar.h1(i7, (int) this.N);
            C3(this.f52577e0[c10]);
        }
    }

    @Override
    public final void didReceivedNotification(int r27, int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zw.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (!(dialog instanceof hi.a3) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final float e4(boolean z9) {
        float f10;
        if (z9) {
            f10 = 1.0f - this.f52560b.f55498e;
        } else {
            f10 = 1.0f;
        }
        return f10 * (1.0f - h4()) * this.f52639r.f55498e;
    }

    public final void e5() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        int i7;
        gz0 gz0Var = this.Z;
        if (gz0Var != null && gz0Var.getVisibility() != 8) {
            f10 = this.Z.getMeasuredHeight();
        } else {
            f10 = 0.0f;
        }
        if (this.K) {
            f11 = org.telegram.messenger.g0.L(81.0f);
        } else {
            f11 = 0.0f;
        }
        if (this.K) {
            float f20 = this.N;
            float f21 = this.f52680y1;
            f12 = (f10 * f21) + com.google.android.recaptcha.internal.a.z(1.0f, f21, f11, f20);
            f13 = this.f52682y3;
        } else {
            f12 = (f10 * this.f52680y1) + this.N;
            f13 = this.f52682y3;
        }
        float f22 = f12 + f13 + this.T;
        ow owVar = this.X;
        if (owVar != null && owVar.getVisibility() == 0) {
            f14 = this.X.getAlpha();
        } else {
            f14 = 0.0f;
        }
        float L = org.telegram.messenger.g0.L(4.0f) * f14;
        pw pwVar = this.f52683z0;
        if (pwVar != null) {
            pwVar.setTranslationY(f22 - L);
            f16 = this.f52683z0.getAlpha();
            f17 = org.telegram.messenger.g0.L(43.0f) * f16;
            f15 = f22 + f17;
        } else {
            f15 = f22;
            f16 = 0.0f;
            f17 = 0.0f;
        }
        org.telegram.ui.Components.or orVar = this.K1;
        if (orVar != null) {
            float f23 = f15 - L;
            int i10 = -org.telegram.messenger.g0.L(3.0f);
            if (this.f52555a0 == null) {
                i7 = org.telegram.messenger.g0.L(44.0f);
            } else {
                i7 = 0;
            }
            orVar.setTranslationY(org.telegram.messenger.g0.T1(f23, i10 - i7, this.f52560b.f55498e));
            f18 = this.K1.getMetadata().f55514c.f55524a;
            f19 = this.K1.c(0.0f);
        } else {
            f18 = 0.0f;
            f19 = 0.0f;
        }
        org.telegram.ui.Components.nr nrVar = this.L1;
        if (nrVar != null) {
            nrVar.setTranslationY(f22 - L);
            float W1 = org.telegram.messenger.g0.W1(Math.min(f18, f16), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(50.0f));
            org.telegram.ui.Components.nr nrVar2 = this.L1;
            float min = Math.min(org.telegram.messenger.g0.L(40.0f), (f19 + f17) - W1);
            Matrix matrix = nrVar2.f36363b;
            if (nrVar2.f36365e != W1 || nrVar2.f36366f != min) {
                nrVar2.f36365e = W1;
                nrVar2.f36366f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, W1);
                LinearGradient linearGradient = nrVar2.f36364c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                nrVar2.invalidate();
            }
            this.L1.setAlpha(Math.max(f16, f18));
        }
    }

    public final int f4() {
        if (this.K) {
            return org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(81.0f);
        }
        return org.telegram.messenger.g0.L(48.0f);
    }

    public final void f5(boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zw.f5(boolean):void");
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.k60 k60Var = this.L0;
        if (k60Var != null) {
            k60Var.u();
        }
    }

    public final int g4() {
        if (this.K) {
            return org.telegram.messenger.g0.L(81.0f);
        }
        return 0;
    }

    public final void g5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zw.g5():void");
    }

    @Override
    public final org.telegram.ui.ActionBar.n4 getBackButtonState() {
        if (!q4() && !this.G3.f43848f) {
            return org.telegram.ui.ActionBar.n4.f28319b;
        }
        return org.telegram.ui.ActionBar.n4.f28318a;
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z9, boolean z10, float f10) {
        int i7;
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X3, 1.0f);
            this.f52559a4 = ofFloat;
            return ofFloat;
        }
        if (getLayoutContainer() != null && getLayoutContainer().getMeasuredWidth() > 0) {
            i7 = (int) Utilities.i((200.0f / getLayoutContainer().getMeasuredWidth()) * f10, 200.0f, 80.0f);
        } else {
            i7 = 150;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.X3, 1.0f);
        this.f52559a4 = ofFloat2;
        ofFloat2.addUpdateListener(new mu(this, 1));
        this.f52559a4.setInterpolator(org.telegram.ui.Components.wq.f40047g);
        this.f52559a4.setDuration(i7);
        this.f52559a4.start();
        return this.f52559a4;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zw.getThemeDescriptions():java.util.ArrayList");
    }

    public final float h4() {
        vv vvVar = this.G3;
        if (vvVar != null && vvVar.c()) {
            return this.G3.f43847e;
        }
        return 0.0f;
    }

    public final void h5() {
        bi.q1 q1Var;
        vw vwVar;
        boolean z9;
        int i7;
        try {
            mv mvVar = this.C1;
            if (mvVar != null && mvVar.getEditField() != null) {
                this.C1.getEditField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.m6.Ke));
            }
            NumberTextView numberTextView = this.f52599i1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.m6.f28284y8));
            }
            pw pwVar = this.f52683z0;
            int i10 = 0;
            if (pwVar != null && (pwVar.getSelectorDrawable() instanceof GradientDrawable)) {
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (lVar != null && lVar.x()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                GradientDrawable gradientDrawable = (GradientDrawable) this.f52683z0.getSelectorDrawable();
                if (z9) {
                    i7 = org.telegram.ui.ActionBar.m6.f28218ui;
                } else {
                    i7 = org.telegram.ui.ActionBar.m6.K8;
                }
                gradientDrawable.setColor(getThemedColor(i7));
                this.f52683z0.invalidate();
            }
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (lVar2 != null) {
                if (this.X2 != 0 || this.Z2 != 0) {
                    lVar2.K(getThemedColor(org.telegram.ui.ActionBar.m6.Q8), false);
                    this.actionBar.K(getThemedColor(org.telegram.ui.ActionBar.m6.R8), true);
                }
                if (this.actionBar.x()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
                }
                n5();
            }
            if (this.f52577e0 != null) {
                while (true) {
                    yw[] ywVarArr = this.f52577e0;
                    if (i10 >= ywVarArr.length) {
                        break;
                    }
                    yw ywVar = ywVarArr[i10];
                    if (ywVar != null && (vwVar = ywVar.f52125a) != null) {
                        vwVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
                    }
                    i10++;
                }
            }
            iw iwVar = this.C0;
            if (iwVar != null && (q1Var = iwVar.f33587a0) != null) {
                q1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
            }
            li.w1 w1Var = this.D1;
            if (w1Var != null) {
                w1Var.setScrimViewBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
            }
            fi.m3 m3Var = this.f52629p0;
            if (m3Var != null) {
                m3Var.j(getThemedColor(org.telegram.ui.ActionBar.m6.tj));
            }
            fi.m3 m3Var2 = this.f52634q0;
            if (m3Var2 != null) {
                m3Var2.j(getThemedColor(org.telegram.ui.ActionBar.m6.tj));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final float i4() {
        return -org.telegram.messenger.g0.W1(this.f52560b.f55498e, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(48.0f));
    }

    public final void i5(boolean z9, boolean z10) {
        ?? r52;
        int L0;
        boolean z11;
        yw[] ywVarArr;
        org.telegram.messenger.vo voVar;
        boolean z12;
        Object[] objArr;
        v4.l0 l0Var;
        boolean z13;
        boolean z14;
        boolean z15;
        if (this.f52683z0 != null && !this.inPreviewMode && !this.f52643r3) {
            vv vvVar = this.G3;
            if (vvVar == null || !vvVar.c()) {
                org.telegram.ui.Components.k60 k60Var = this.L0;
                String str = null;
                if (k60Var != null) {
                    k60Var.u();
                    this.L0 = null;
                }
                ArrayList T0 = getMessagesController().T0();
                int size = T0.size();
                te.a aVar = this.f52639r;
                boolean z16 = true;
                boolean z17 = false;
                if (size > 1) {
                    if (!z9 && this.f52683z0.getVisibility() == 0) {
                        r52 = 0;
                    } else {
                        if (this.f52683z0.getVisibility() != 0) {
                            z12 = false;
                        } else {
                            z12 = z10;
                        }
                        this.f52672x = true;
                        boolean isEmpty = this.f52683z0.h.isEmpty();
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.R3 == null) {
                                z15 = z10;
                            } else {
                                z15 = false;
                            }
                            if (!this.f52643r3) {
                                aVar.a(this.f52672x, z15);
                            }
                        }
                        int currentTabId = this.f52683z0.getCurrentTabId();
                        int currentTabStableId = this.f52683z0.getCurrentTabStableId();
                        if (currentTabId != this.f52683z0.getDefaultTabId() && currentTabId >= T0.size()) {
                            this.f52683z0.L = -1;
                            objArr = 1;
                        } else {
                            objArr = null;
                        }
                        pw pwVar = this.f52683z0;
                        pwVar.h.clear();
                        pwVar.f33377j0.clear();
                        pwVar.f33379l0.clear();
                        pwVar.m0.clear();
                        pwVar.f33381n0.clear();
                        pwVar.f33382o0.clear();
                        pwVar.M = 0;
                        int size2 = T0.size();
                        int i7 = 0;
                        while (i7 < size2) {
                            if (((org.telegram.messenger.vo) T0.get(i7)).e()) {
                                this.f52683z0.a(i7, 0, org.telegram.messenger.id.M0(2131750807, str), null, false, true, ((org.telegram.messenger.vo) T0.get(i7)).f26087p);
                                z14 = z17;
                            } else {
                                org.telegram.messenger.vo voVar2 = (org.telegram.messenger.vo) T0.get(i7);
                                z14 = z17;
                                this.f52683z0.a(i7, voVar2.f26086o, voVar2.f26075b, voVar2.f26076c, voVar2.f26085n, false, ((org.telegram.messenger.vo) T0.get(i7)).f26087p);
                            }
                            i7++;
                            z17 = z14;
                            str = null;
                        }
                        boolean z18 = z17;
                        if (currentTabStableId >= 0) {
                            if (objArr != null && !this.f52683z0.h(currentTabStableId)) {
                                while (currentTabId >= 0) {
                                    pw pwVar2 = this.f52683z0;
                                    if (pwVar2.h(pwVar2.f33378k0.get(currentTabId, -1))) {
                                        break;
                                    }
                                    currentTabId--;
                                }
                                if (currentTabId < 0) {
                                    currentTabId = z18 ? 1 : 0;
                                }
                            }
                            if (this.f52683z0.f33378k0.get(this.f52577e0[z18 ? 1 : 0].h, -1) != currentTabStableId) {
                                this.f52577e0[z18 ? 1 : 0].h = currentTabId;
                                isEmpty = true;
                            }
                        }
                        int i10 = z18 ? 1 : 0;
                        while (true) {
                            yw[] ywVarArr2 = this.f52577e0;
                            if (i10 >= ywVarArr2.length) {
                                break;
                            }
                            if (ywVarArr2[i10].h >= T0.size()) {
                                this.f52577e0[i10].h = T0.size() - 1;
                            }
                            this.f52577e0[i10].f52125a.setScrollingTouchSlop(1);
                            i10++;
                        }
                        pw pwVar3 = this.f52683z0;
                        bi.q1 q1Var = pwVar3.F;
                        if (z12) {
                            l0Var = pwVar3.f33388s0;
                        } else {
                            l0Var = null;
                        }
                        q1Var.setItemAnimator(l0Var);
                        pwVar3.I.f();
                        if (isEmpty) {
                            d5(z18);
                        }
                        pw pwVar4 = this.f52683z0;
                        int currentTabId2 = pwVar4.getCurrentTabId();
                        ArrayList arrayList = pwVar4.h;
                        int i11 = 0;
                        while (true) {
                            if (i11 < arrayList.size()) {
                                if (((org.telegram.ui.Components.bz) arrayList.get(i11)).f32381a == currentTabId2) {
                                    z13 = ((org.telegram.ui.Components.bz) arrayList.get(i11)).f32385f;
                                    break;
                                }
                                i11++;
                            } else {
                                z13 = false;
                                break;
                            }
                        }
                        if (z13) {
                            pw pwVar5 = this.f52683z0;
                            ArrayList arrayList2 = pwVar5.h;
                            if (!arrayList2.isEmpty()) {
                                r52 = 0;
                                pwVar5.f((org.telegram.ui.Components.bz) arrayList2.get(0), 0);
                            }
                        }
                        r52 = 0;
                    }
                } else {
                    r52 = 0;
                    if (this.f52683z0.getVisibility() != 8) {
                        this.f52683z0.setIsEditing(false);
                        U4(false);
                        this.f52628o3 = false;
                        if (this.f52623n3) {
                            this.f52623n3 = false;
                            this.f52577e0[0].setTranslationX(0.0f);
                            this.f52577e0[1].setTranslationX(ywVarArr[0].getMeasuredWidth());
                        }
                        if (this.f52577e0[0].h != this.f52683z0.getDefaultTabId()) {
                            this.f52577e0[0].h = this.f52683z0.getDefaultTabId();
                            jv jvVar = this.f52577e0[0].d;
                            jvVar.h = 0;
                            jvVar.f();
                            yw ywVar = this.f52577e0[0];
                            ywVar.f52132s = this.S0;
                            ywVar.d.f();
                        }
                        this.f52577e0[1].setVisibility(8);
                        yw ywVar2 = this.f52577e0[1];
                        ywVar2.h = 0;
                        jv jvVar2 = ywVar2.d;
                        jvVar2.h = 0;
                        jvVar2.f();
                        yw ywVar3 = this.f52577e0[1];
                        ywVar3.f52132s = this.S0;
                        ywVar3.d.f();
                        this.f52672x = false;
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.R3 == null) {
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            if (!this.f52643r3) {
                                aVar.a(false, z11);
                            }
                        }
                        int i12 = 0;
                        while (true) {
                            yw[] ywVarArr3 = this.f52577e0;
                            if (i12 >= ywVarArr3.length) {
                                break;
                            }
                            yw ywVar4 = ywVarArr3[i12];
                            if (ywVar4.f52132s == 0 && ywVar4.f52133w == 2 && l4() && ((L0 = this.f52577e0[i12].f52127c.L0()) == 0 || L0 == 1)) {
                                this.f52577e0[i12].f52127c.h1(1, (int) this.N);
                            }
                            this.f52577e0[i12].f52125a.setScrollingTouchSlop(0);
                            this.f52577e0[i12].f52125a.requestLayout();
                            this.f52577e0[i12].requestLayout();
                            i12++;
                        }
                        this.f52683z0.L = -1;
                        r52 = 0;
                    }
                }
                f5(r52);
                int i13 = this.f52577e0[r52].f52132s;
                if ((i13 == 7 || i13 == 8) && (voVar = getMessagesController().M[i13 - 7]) != null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < T0.size()) {
                            org.telegram.messenger.vo voVar3 = (org.telegram.messenger.vo) T0.get(i14);
                            if (voVar3 != null && voVar3.f26074a == voVar.f26074a) {
                                break;
                            }
                            i14++;
                        } else {
                            z16 = false;
                            break;
                        }
                    }
                    if (!z16) {
                        d5(false);
                    }
                }
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        vv vvVar;
        if (!this.f52609k2 && (vvVar = this.G3) != null && vvVar.getFragment() != null) {
            return this.G3.getFragment().isLightStatusBar();
        }
        if (i0.a.h(getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final di.z6 j4() {
        return getMessagesController().P1();
    }

    public final void j5(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zw.j5(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    @Override
    public final ri.f k() {
        return this.f52615l4;
    }

    public final UndoView k4() {
        Z3();
        UndoView[] undoViewArr = this.f52679y0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.d(2, true);
            sw swVar = (sw) this.fragmentView;
            swVar.removeView(undoViewArr[0]);
            swVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void k5() {
        float f10 = (((-this.f52592g4) - this.f52606j4) - this.f52662v1) - this.f52668w1;
        org.telegram.ui.Components.p00 p00Var = this.f52651t0;
        if (p00Var != null) {
            p00Var.setTranslationY(f10);
        }
        org.telegram.ui.Components.p00 p00Var2 = this.f52656u0;
        if (p00Var2 != null) {
            p00Var2.setTranslationY(f10 - org.telegram.messenger.g0.L(52.0f));
            fi.m3 m3Var = this.f52629p0;
            if (m3Var != null) {
                m3Var.setTranslationY(f10 - org.telegram.messenger.g0.L(52.0f));
            }
        }
    }

    public final boolean l4() {
        if (!this.f52617m2 && this.S0 == 0 && this.Z2 == 0 && this.X2 == 0) {
            org.telegram.messenger.qp messagesController = getMessagesController();
            messagesController.getClass();
            if (org.telegram.messenger.iz.f23434q1 && messagesController.Q.f(2305843009213693952L | 1) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void l5(boolean z9) {
        boolean z10;
        boolean z11 = this.f52617m2;
        if ((!z11 || this.S0 == 10) && this.X2 == 0 && this.Z2 == 0 && !this.inPreviewMode && ((!this.f52609k2 || z11) && !this.U3)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.p00 p00Var = this.f52651t0;
        if (p00Var != null) {
            p00Var.e(z10, z9);
        }
        org.telegram.ui.Components.p00 p00Var2 = this.f52656u0;
        if (p00Var2 != null) {
            p00Var2.e(z10, z9);
        }
    }

    public final boolean m4() {
        ArrayList arrayList = this.E2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void m5(boolean z9, boolean z10) {
        boolean z11;
        int i7;
        if (this.f52621n0 != null) {
            org.telegram.ui.ActionBar.r0 r0Var = this.m0;
            if (r0Var == null || r0Var.getVisibility() != 0) {
                boolean z12 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < getDownloadController().G.size()) {
                        if (getFileLoader().S(((org.telegram.messenger.ij) getDownloadController().G.get(i10)).S0())) {
                            z11 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z11 = false;
                        break;
                    }
                }
                if (getDownloadController().I.size() <= 0 && !z11 && (this.f52588g0.getVisibility() != 0 || this.f52588g0.getAlpha() != 1.0f || z10)) {
                    this.f52598i0 = false;
                } else {
                    this.f52598i0 = true;
                }
                J3();
                boolean z13 = org.telegram.messenger.t0.f25570b.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i11 = this.f52579e2;
                if (i11 == 3 || i11 == 5) {
                    z12 = true;
                }
                org.telegram.ui.ActionBar.z0 z0Var = this.f52625o0;
                if (z13) {
                    if (z12) {
                        i7 = 2131748608;
                    } else {
                        i7 = 2131748607;
                    }
                } else {
                    i7 = 2131748606;
                }
                z0Var.setSubtext(org.telegram.messenger.id.M0(i7, null));
                this.f52621n0.b(z13, z12, z9);
            }
        }
    }

    public final void n4(boolean z9) {
        int i7;
        boolean z10;
        this.actionBar.w();
        this.J2.clear();
        org.telegram.ui.ActionBar.y1 y1Var = this.f52584f1;
        boolean z11 = true;
        if (y1Var != null) {
            y1Var.c(true, 0.0f);
        }
        pw pwVar = this.f52683z0;
        if (pwVar != null) {
            pwVar.b(org.telegram.ui.ActionBar.m6.K8, org.telegram.ui.ActionBar.m6.I8, org.telegram.ui.ActionBar.m6.J8, org.telegram.ui.ActionBar.m6.L8, org.telegram.ui.ActionBar.m6.f27890d6);
        }
        ValueAnimator valueAnimator = this.f52670w3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f52670w3 = null;
        }
        if (this.f52664v3 == 0.0f) {
            return;
        }
        O4(-f4());
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            yw[] ywVarArr = this.f52577e0;
            if (i10 >= ywVarArr.length) {
                break;
            }
            yw ywVar = ywVarArr[i10];
            if (ywVar != null) {
                ywVar.f52125a.I0(true);
            }
            i10++;
        }
        if (this.K) {
            i7 = 81;
        } else {
            i7 = 0;
        }
        float max = Math.max(0.0f, org.telegram.messenger.g0.L(i7 + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f52664v3, 0.0f);
        this.f52670w3 = ofFloat;
        ofFloat.addUpdateListener(new ju(this, max, 1));
        this.f52670w3.addListener(new dw(this, max, 0));
        this.f52670w3.setInterpolator(org.telegram.ui.Components.wq.f40046f);
        this.f52670w3.setDuration(200L);
        this.f52670w3.start();
        this.Z0 = false;
        ArrayList arrayList = this.f52562b1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) arrayList.get(i11);
                jz.z0(voVar, voVar.f26079g, voVar.f26075b, voVar.f26076c, voVar.f26085n, voVar.f26084m, voVar.h, voVar.f26080i, voVar.f26081j, false, false, true, true, false, this, null);
                i11++;
                arrayList = arrayList;
                size = size;
                z12 = false;
                z11 = true;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.f52556a1) {
            getMessagesController().m4(this.X2, 0L, null);
            z10 = 0;
            this.f52556a1 = false;
        } else {
            z10 = 0;
        }
        f5(true);
        if (this.f52577e0 != null) {
            int i12 = z10;
            while (true) {
                yw[] ywVarArr2 = this.f52577e0;
                if (i12 >= ywVarArr2.length) {
                    break;
                }
                ywVarArr2[i12].d.H = z10;
                i12++;
            }
        }
        int i13 = org.telegram.messenger.qp.C8;
        int i14 = z10;
        if (z9) {
            i14 = 8192;
        }
        u5(i14 | 196608, true);
    }

    public final void n5() {
        int i7;
        int i10;
        if (this.f52654t3 && this.actionBar != null) {
            if (this.X2 == 0 && this.Z2 == 0) {
                i7 = org.telegram.ui.ActionBar.m6.f28227v8;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.O8;
            }
            int themedColor = getThemedColor(i7);
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.m6.f28284y8;
            lVar.G(i0.a.f(this.f52680y1, themedColor, getThemedColor(i11)), false);
            this.actionBar.G(i0.a.f(this.f52680y1, getThemedColor(i11), getThemedColor(i11)), true);
            if (this.X2 == 0 && this.Z2 == 0) {
                i10 = org.telegram.ui.ActionBar.m6.f28188t8;
            } else {
                i10 = org.telegram.ui.ActionBar.m6.N8;
            }
            int themedColor2 = getThemedColor(i10);
            this.actionBar.E(i0.a.f(this.f52680y1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.m6.f28302z8)), false);
        }
    }

    public final void o4(boolean z9) {
        if (this.G3.c()) {
            z9 = true;
        }
        if (!z9 || !this.f52569c2) {
            this.U3 = z9;
            l5(true);
            if (z9) {
                fi.m3 m3Var = this.f52629p0;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                fi.m3 m3Var2 = this.f52634q0;
                if (m3Var2 != null) {
                    m3Var2.f(true);
                }
            }
        }
    }

    public final void o5() {
        org.telegram.ui.Components.po0 po0Var;
        int i7;
        mv mvVar = this.C1;
        ArrayList arrayList = this.J2;
        if (mvVar != null) {
            this.f52620n.a(!arrayList.isEmpty(), true);
            p5();
            if (arrayList.isEmpty()) {
                if (this.S0 == 3 && this.f52590g2 == null) {
                    i7 = 2131750575;
                } else {
                    i7 = 2131745669;
                }
                String M0 = org.telegram.messenger.id.M0(i7, null);
                if (this.Q3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(M0);
                } else {
                    this.actionBar.M(M0, true, 350L, org.telegram.ui.Components.wq.h);
                }
                if (this.C1.getTag() != null) {
                    this.C1.l0(false, false, false);
                    this.C1.L();
                    this.C1.setTag(null);
                    this.fragmentView.requestLayout();
                }
            } else {
                if (this.C1.getTag() == null) {
                    if (!m4() && this.F2 == null) {
                        this.C1.setFieldText("");
                    }
                    this.C1.setTag(1);
                    if (!this.W3 && (po0Var = this.H2) != null) {
                        this.W3 = true;
                        String M02 = org.telegram.messenger.id.M0(2131745429, null);
                        po0Var.j();
                        po0Var.F = M02;
                        fi.i1 i1Var = po0Var.f37046a[0];
                        if (M02 != null) {
                            ((org.telegram.ui.ActionBar.m5) i1Var.f12172f).l(M02, false);
                        }
                        org.telegram.ui.Components.ob0 ob0Var = new org.telegram.ui.Components.ob0(po0Var, 26);
                        po0Var.G = ob0Var;
                        org.telegram.messenger.g0.i3(ob0Var, 1000L);
                    }
                }
                this.D1.e(Math.max(1, arrayList.size()), true);
                int i10 = this.T0 + (!TextUtils.isEmpty(this.C1.getFieldText()) ? 1 : 0);
                int size = arrayList.size();
                int i11 = 0;
                long j3 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    long longValue = ((Long) obj).longValue();
                    long N1 = getMessagesController().N1(longValue);
                    if (N1 <= 0 && longValue > 0) {
                        N1 = org.telegram.messenger.m5.k(getMessagesController().J2(longValue));
                    }
                    j3 += N1;
                }
                this.D1.i(i10, j3, true);
                this.C1.T1();
                if (this.Q3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(org.telegram.messenger.id.G(arrayList.size(), "Recipient", new Object[0]));
                } else {
                    this.actionBar.M(org.telegram.messenger.id.G(arrayList.size(), "Recipient", new Object[0]), false, 350L, org.telegram.ui.Components.wq.h);
                }
            }
            this.Q3 = arrayList.isEmpty();
        } else if (this.S0 == 10) {
            o4(arrayList.isEmpty());
        }
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (hasShownSheet()) {
            if (z9) {
                closeSheet();
                return false;
            }
        } else if (this.G3.c() && this.G3.getFragment().onBackPressed(z9)) {
            if (z9) {
                this.G3.a();
                iw iwVar = this.C0;
                if (iwVar != null) {
                    iwVar.S();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.k60 k60Var = this.L0;
            if (k60Var != null) {
                if (z9) {
                    k60Var.u();
                    this.L0 = null;
                    return false;
                }
            } else {
                pw pwVar = this.f52683z0;
                if (pwVar != null && pwVar.f33380n) {
                    if (z9) {
                        pwVar.setIsEditing(false);
                        U4(false);
                        return false;
                    }
                } else {
                    org.telegram.ui.ActionBar.l lVar = this.actionBar;
                    if (lVar != null && lVar.x()) {
                        if (z9) {
                            iw iwVar2 = this.C0;
                            if (iwVar2 != null && iwVar2.getVisibility() == 0) {
                                this.C0.R(false);
                            }
                            n4(true);
                            return false;
                        }
                    } else if (this.f52560b.f55499f) {
                        if (z9) {
                            this.X.f37446r.getText().clear();
                            this.Y.b(false);
                            this.X.f37446r.clearFocus();
                            return false;
                        }
                    } else {
                        pw pwVar2 = this.f52683z0;
                        if (pwVar2 != null && pwVar2.getVisibility() == 0 && !this.f52601i3) {
                            pw pwVar3 = this.f52683z0;
                            if (!pwVar3.O && !this.f52623n3) {
                                ArrayList arrayList = pwVar3.h;
                                if (!arrayList.isEmpty() && pwVar3.L != ((org.telegram.ui.Components.bz) arrayList.get(0)).f32381a) {
                                    if (z9) {
                                        pw pwVar4 = this.f52683z0;
                                        ArrayList arrayList2 = pwVar4.h;
                                        if (!arrayList2.isEmpty()) {
                                            pwVar4.f((org.telegram.ui.Components.bz) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        mv mvVar = this.C1;
                        if (mvVar != null && mvVar.s0()) {
                            if (z9) {
                                this.C1.k0(true);
                            }
                        } else {
                            sv svVar = this.E0;
                            if (svVar.O == 0 && svVar.S.L0() != 0) {
                                svVar.h.y0(0);
                                return false;
                            }
                            return super.onBackPressed(z9);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        bi.ec ecVar;
        pw pwVar;
        if (this.W1) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.n(true);
            }
            TLObject tLObject = this.Y1;
            if (tLObject != null) {
                iw iwVar = this.C0;
                if (iwVar != null) {
                    iwVar.f33590d0.Q(this.X1, tLObject);
                }
                this.Y1 = null;
            }
            this.W1 = false;
        }
        if (!this.K && (pwVar = this.f52683z0) != null && pwVar.getVisibility() == 0 && this.f52639r.f55499f) {
            int i7 = (int) (-this.N);
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            if (i7 != 0 && i7 != currentActionBarHeight && i7 >= currentActionBarHeight / 2) {
                this.f52577e0[0].f52125a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f52679y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        if (!isInPreviewMode() && (ecVar = this.K0) != null && ecVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        N3();
        this.f52640r0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        fi.m3 m3Var;
        super.onBecomeFullyVisible();
        if (q4()) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            boolean z9 = e12.getBoolean("archivehint", true);
            boolean isEmpty = d4(this.currentAccount, this.S0, this.X2, false).isEmpty();
            if (z9 && isEmpty) {
                org.telegram.messenger.qp.e1().edit().putBoolean("archivehint", false).commit();
                z9 = false;
            }
            if (z9) {
                e12.edit().putBoolean("archivehint", false).commit();
                S4();
            }
        }
        if (this.f52640r0 && !this.f52646s0 && (m3Var = this.f52629p0) != null && this.O3) {
            this.f52646s0 = true;
            this.f52640r0 = false;
            m3Var.w();
        }
        org.telegram.messenger.g0.i3(new fu(this, 20), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.k60 k60Var = this.L0;
        if (k60Var != null) {
            k60Var.u();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.u1 u1Var;
        super.onDialogDismiss(dialog);
        if (this.X2 == 0 && this.Z2 == 0 && (u1Var = this.U1) != null && dialog == u1Var && getParentActivity() != null) {
            u3(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i7;
        boolean z9;
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        int i10 = 0;
        if (bundle != null) {
            this.f52617m2 = bundle.getBoolean("onlySelect", false);
            this.f52622n2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f52642r2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.S0 = this.arguments.getInt("dialogsType", 0);
            this.O0 = this.arguments.getBoolean("quote", false);
            this.N0 = this.arguments.getBoolean("reply_to", false);
            this.P0 = this.arguments.getLong("reply_to_author", 0L);
            this.Q0 = this.arguments.getLong("reply_to_channel_direct", 0L);
            this.R0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f52590g2 = this.arguments.getString("selectAlertString");
            this.f52595h2 = this.arguments.getString("selectAlertStringGroup");
            this.f52600i2 = this.arguments.getString("addToGroupAlertString");
            this.f52648s2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f52653t2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f52658u2 = this.arguments.getBoolean("afterSignup", false);
            this.X2 = this.arguments.getInt("folderId", 0);
            long j3 = this.arguments.getLong("community_id", 0L);
            this.Z2 = j3;
            if (j3 != 0) {
                this.f52558a3 = getMessagesController().M0(Long.valueOf(this.Z2));
                this.f52564b3 = getMessagesController().N0(this.Z2);
            }
            this.f52605j2 = this.arguments.getBoolean("resetDelegate", true);
            this.T0 = this.arguments.getInt("messagesCount", 0);
            this.U0 = this.arguments.getInt("hasPoll", 0);
            this.V0 = this.arguments.getBoolean("hasInvoice", false);
            this.f52663v2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f52663v2);
            this.arguments.getInt("otherwiseRelogin");
            this.f52669w2 = this.arguments.getBoolean("allowGroups", true);
            this.f52675x2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f52681y2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.f52685z2 = this.arguments.getBoolean("allowChannels", true);
            this.A2 = this.arguments.getBoolean("allowUsers", true);
            this.B2 = this.arguments.getBoolean("allowBots", true);
            this.C2 = this.arguments.getBoolean("closeFragment", true);
            this.F = this.arguments.getBoolean("allowGlobalSearch", true);
            this.W = this.arguments.getBoolean("hasMainTabs", false);
            byte[] byteArray = this.arguments.getByteArray("requestPeerType");
            if (byteArray != null) {
                try {
                    SerializedData serializedData = new SerializedData(byteArray);
                    this.G = TLRPC.RequestPeerType.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    serializedData.cleanup();
                } catch (Exception unused) {
                }
            }
            this.H = this.arguments.getLong("requestPeerBotId", 0L);
        }
        if (this.S0 == 0) {
            this.V1 = org.telegram.messenger.qp.f1().getBoolean("askAboutContacts", true);
            org.telegram.messenger.iz.u();
        }
        org.telegram.messenger.qs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        this.K3 = new ab.b0(notificationCenter, this);
        if (this.f52627o2 == null) {
            this.f52579e2 = getConnectionsManager().getConnectionState();
            this.K3.e(org.telegram.messenger.qs.f25022i4);
            if (!this.f52617m2) {
                this.K3.e(org.telegram.messenger.qs.I4);
                this.K3.e(org.telegram.messenger.qs.A4);
                this.K3.c(org.telegram.messenger.qs.P2);
                this.K3.c(org.telegram.messenger.qs.d2);
            }
            ab.b0 b0Var = this.K3;
            b0Var.c(org.telegram.messenger.qs.f25074s);
            b0Var.c(org.telegram.messenger.qs.O2);
            b0Var.c(org.telegram.messenger.qs.f25067r);
            b0Var.c(org.telegram.messenger.qs.Y);
            b0Var.c(org.telegram.messenger.qs.O);
            b0Var.c(org.telegram.messenger.qs.I2);
            b0Var.c(org.telegram.messenger.qs.f25012h0);
            b0Var.c(org.telegram.messenger.qs.f25000f0);
            b0Var.c(org.telegram.messenger.qs.J);
            b0Var.c(org.telegram.messenger.qs.K);
            b0Var.c(org.telegram.messenger.qs.M);
            b0Var.c(org.telegram.messenger.qs.P0);
            b0Var.c(org.telegram.messenger.qs.f25075s0);
            b0Var.c(org.telegram.messenger.qs.f25066q5);
            b0Var.c(org.telegram.messenger.qs.S0);
            b0Var.c(org.telegram.messenger.qs.T1);
            b0Var.c(org.telegram.messenger.qs.f24982b5);
            b0Var.c(org.telegram.messenger.qs.K2);
            b0Var.c(org.telegram.messenger.qs.f24989d0);
            b0Var.c(org.telegram.messenger.qs.f25076s1);
            b0Var.c(org.telegram.messenger.qs.Y4);
            b0Var.c(org.telegram.messenger.qs.Z4);
            b0Var.c(org.telegram.messenger.qs.N);
            b0Var.c(org.telegram.messenger.qs.f25044m5);
            b0Var.c(org.telegram.messenger.qs.f25005f5);
            this.K3.e(org.telegram.messenger.qs.f25045n0);
        }
        ab.b0 b0Var2 = this.K3;
        b0Var2.c(org.telegram.messenger.qs.f25100w);
        b0Var2.c(org.telegram.messenger.qs.S4);
        b0Var2.c(org.telegram.messenger.qs.f24976a5);
        b0Var2.c(org.telegram.messenger.qs.T);
        b0Var2.c(org.telegram.messenger.qs.L4);
        b0Var2.c(org.telegram.messenger.qs.f25086t5);
        b0Var2.c(org.telegram.messenger.qs.f25099v5);
        b0Var2.c(org.telegram.messenger.qs.Z2);
        b0Var2.c(org.telegram.messenger.qs.f24991d3);
        b0Var2.c(org.telegram.messenger.qs.f25011g5);
        b0Var2.c(org.telegram.messenger.qs.f25118y3);
        b0Var2.c(org.telegram.messenger.qs.A3);
        b0Var2.c(org.telegram.messenger.qs.S5);
        b0Var2.c(org.telegram.messenger.qs.T5);
        b0Var2.c(org.telegram.messenger.qs.P3);
        b0Var2.c(org.telegram.messenger.qs.Q3);
        if (this.S0 == 0) {
            this.K3.c(org.telegram.messenger.qs.f25127z5);
            this.K3.c(org.telegram.messenger.qs.P1);
        }
        u4(getAccountInstance());
        di.z6 P1 = getMessagesController().P1();
        if (!P1.A) {
            P1.W();
            if (!P1.f10013s) {
                ConnectionsManager.getInstance(P1.f9997a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new di.y5(P1, 0));
            }
        }
        getMessagesController().b3(this.X2);
        if (this.R3 != null && !getMessagesStorage().Q) {
            pt ptVar = this.R3;
            if (ptVar.getParent() != null) {
                ((ViewGroup) ptVar.getParent()).removeView(ptVar);
            }
            this.R3 = null;
        }
        if (q4()) {
            di.z6 P12 = getMessagesController().P1();
            if (P12.f10019z) {
                P12.T(true);
            }
        } else {
            getMessagesController().P1().W();
        }
        getContactsController().B();
        if (getMessagesController().f24862o6) {
            org.telegram.messenger.vv G1 = getMessagesController().G1();
            if (!G1.f26218e) {
                G1.g(true);
            }
        }
        if (this.Z2 != 0) {
            getMessagesController().V2(0, this.Z2, true);
        }
        org.telegram.messenger.v1 a10 = org.telegram.messenger.v1.a(this.currentAccount);
        if (!a10.f25940e) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = a10.f25938b;
            if (j10 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                long j11 = currentTimeMillis - j10;
                boolean z10 = org.telegram.messenger.r2.f25216a;
                if (j11 > 43200000) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            if (!z9) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(a10.f25938b);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(currentTimeMillis);
                if (calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
            }
            if (z9) {
                a10.f25940e = true;
                ConnectionsManager.getInstance(a10.f25937a).sendRequest(new TL_account.getBirthdays(), new org.telegram.messenger.s1(a10, 0));
            }
        }
        if (this.W) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        this.f52602i4 = i7;
        if (this.W) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        }
        this.f52606j4 = i10;
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        ab.b0 b0Var = this.K3;
        if (b0Var != null) {
            b0Var.b();
            this.K3 = null;
        }
        mv mvVar = this.C1;
        if (mvVar != null) {
            mvVar.B0();
        }
        org.telegram.ui.Components.po0 po0Var = this.H2;
        if (po0Var != null) {
            po0Var.j();
        }
        org.telegram.ui.Components.h41 h41Var = this.I2;
        if (h41Var != null) {
            org.telegram.messenger.g0.r(h41Var);
            this.I2 = null;
        }
        UndoView undoView = this.f52679y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f52637q3.e();
        this.D2 = null;
        int i7 = org.telegram.ui.Components.d10.l1;
    }

    @Override
    public final void onPanTranslationUpdate(float f10) {
        if (this.f52577e0 != null) {
            this.J0 = f10;
            mv mvVar = this.C1;
            int i7 = 0;
            if (mvVar != null && mvVar.s0()) {
                this.fragmentView.setTranslationY(f10);
                while (true) {
                    yw[] ywVarArr = this.f52577e0;
                    if (i7 >= ywVarArr.length) {
                        break;
                    }
                    ywVarArr[i7].setTranslationY(0.0f);
                    i7++;
                }
                if (!this.f52617m2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.bc bcVar = this.f52632p3;
                    if (bcVar != null) {
                        bcVar.l();
                    }
                }
                iw iwVar = this.C0;
                if (iwVar != null) {
                    iwVar.setTranslationY(this.I0);
                    return;
                }
                return;
            }
            while (true) {
                yw[] ywVarArr2 = this.f52577e0;
                if (i7 >= ywVarArr2.length) {
                    break;
                }
                ywVarArr2[i7].setTranslationY(f10);
                i7++;
            }
            if (!this.f52617m2) {
                this.actionBar.setTranslationY(f10);
                org.telegram.ui.Components.bc bcVar2 = this.f52632p3;
                if (bcVar2 != null) {
                    bcVar2.l();
                }
            }
            iw iwVar2 = this.C0;
            if (iwVar2 != null) {
                iwVar2.setTranslationY(this.J0 + this.I0);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.bc bcVar = this.S;
        if (bcVar != null) {
            bcVar.b();
            this.S = null;
        }
        vv vvVar = this.G3;
        if (vvVar != null) {
            vvVar.f43850r = true;
            cw cwVar = vvVar.f43844a;
            if (cwVar != null) {
                cwVar.onPause();
            }
        }
        org.telegram.ui.Components.k60 k60Var = this.L0;
        if (k60Var != null) {
            k60Var.u();
        }
        mv mvVar = this.C1;
        if (mvVar != null) {
            mvVar.D0();
        }
        int i7 = 0;
        UndoView undoView = this.f52679y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        setBulletinDelegate(null);
        if (this.f52577e0 == null) {
            return;
        }
        while (true) {
            yw[] ywVarArr = this.f52577e0;
            if (i7 < ywVarArr.length) {
                ywVarArr[i7].d.getClass();
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.messenger.c9 c9Var;
        if (i7 == 1) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (iArr.length > i10) {
                    String str = strArr[i10];
                    str.getClass();
                    char c10 = 65535;
                    switch (str.hashCode()) {
                        case -1925850455:
                            if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 1365911975:
                            if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 1977429404:
                            if (str.equals("android.permission.READ_CONTACTS")) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            if (iArr[i10] == 0) {
                                org.telegram.messenger.dt.t(this.currentAccount).Y();
                                break;
                            } else {
                                gh0.I0();
                                continue;
                            }
                        case 1:
                            if (iArr[i10] == 0) {
                                org.telegram.messenger.gc.D().i(null);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (iArr[i10] == 0) {
                                org.telegram.messenger.g0.h3(new fu(this, 19));
                                getContactsController().l();
                                continue;
                            } else {
                                SharedPreferences.Editor edit = org.telegram.messenger.qp.f1().edit();
                                this.V1 = false;
                                edit.putBoolean("askAboutContacts", false).commit();
                                break;
                            }
                    }
                }
            }
            if (this.A0) {
                this.A0 = false;
                V4();
            }
        } else if (i7 == 4) {
            for (int i11 : iArr) {
                if (i11 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 30 && (c9Var = FilesMigrationService.f21177e) != null) {
                c9Var.I0();
            }
        }
    }

    @Override
    public final void onResume() {
        boolean z9;
        yw ywVar;
        jv jvVar;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.yl0 yl0Var;
        bi.ec ecVar;
        super.onResume();
        sv svVar = this.E0;
        char c10 = 0;
        if (svVar != null) {
            ArrayList arrayList = svVar.f9564y;
            di.z6 z6Var = svVar.f9555s;
            z6Var.l(z6Var.f10002g);
            z6Var.l(z6Var.h);
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                TL_stories.PeerStories y10 = z6Var.y(((di.n) arrayList.get(i7)).f9371c);
                if (y10 != null) {
                    z6Var.a0(y10);
                }
            }
        }
        vv vvVar = this.G3;
        if (vvVar != null) {
            vvVar.f43850r = false;
            cw cwVar = vvVar.f43844a;
            if (cwVar != null) {
                cwVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (ecVar = this.K0) != null && ecVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.f52577e0 != null) {
            int i10 = 0;
            while (true) {
                yw[] ywVarArr = this.f52577e0;
                if (i10 >= ywVarArr.length) {
                    break;
                }
                ywVarArr[i10].d.f();
                i10++;
            }
        }
        mv mvVar = this.C1;
        if (mvVar != null) {
            mvVar.E0();
        }
        long j3 = 0;
        if (!this.f52617m2 && this.X2 == 0 && this.Z2 == 0) {
            getMediaDataController().B(4);
        }
        iw iwVar = this.C0;
        if (iwVar != null && (yl0Var = iwVar.f33590d0) != null) {
            yl0Var.f();
        }
        if (!this.f52658u2 && getUserConfig().Z != null) {
            z9 = false;
        } else {
            z9 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z9 && this.X2 == 0 && this.Z2 == 0 && this.d2 && !this.f52617m2) {
            int i11 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.d2 = false;
                if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i11 <= 28 || org.telegram.messenger.r2.f25217b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i11 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                org.telegram.messenger.i4 i4Var = new org.telegram.messenger.i4(this, z12, z10, z11, parentActivity);
                if (this.f52658u2 && (z10 || z12)) {
                    j3 = 4000;
                }
                org.telegram.messenger.g0.i3(i4Var, j3);
            }
        } else if (!this.f52617m2 && this.X2 == 0 && this.Z2 == 0 && org.telegram.messenger.as.i() && !org.telegram.messenger.as.g()) {
            if (getParentActivity() != null) {
                if (!org.telegram.messenger.qp.f1().getBoolean("askedAboutMiuiLockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i12 = org.telegram.ui.ActionBar.m6.L5;
                    alertDialog$Builder.m(2131624115, 72, getThemedColor(i12), null);
                    alertDialog$Builder.n(i12, getResourceProvider());
                    String M0 = org.telegram.messenger.id.M0(2131747298, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                    u1Var.T = M0;
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747300, null), new iu(this, 10));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751772, null), new org.telegram.ui.Components.il0(17));
                    showDialog(u1Var);
                }
            } else {
                return;
            }
        } else if (this.X2 == 0 && this.Z2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
            if (getParentActivity() != null) {
                if (!org.telegram.messenger.qp.f1().getBoolean("askedAboutFSILockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    int i13 = org.telegram.ui.ActionBar.m6.L5;
                    alertDialog$Builder2.m(2131624115, 72, getThemedColor(i13), null);
                    alertDialog$Builder2.n(i13, getResourceProvider());
                    String M02 = org.telegram.messenger.id.M0(2131747314, null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27300a;
                    u1Var2.T = M02;
                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747300, null), new iu(this, 11));
                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131751772, null), new org.telegram.ui.Components.il0(18));
                    showDialog(u1Var2);
                }
            } else {
                return;
            }
        }
        V4();
        if (this.f52577e0 != null) {
            int i14 = 0;
            while (true) {
                yw[] ywVarArr2 = this.f52577e0;
                if (i14 >= ywVarArr2.length) {
                    break;
                }
                yw ywVar2 = ywVarArr2[i14];
                if (ywVar2.f52132s == 0 && ywVar2.f52133w == 2 && ywVar2.f52127c.L0() == 0 && l4()) {
                    this.f52577e0[i14].f52127c.h1(1, (int) this.N);
                }
                if (i14 == 0) {
                    this.f52577e0[i14].d.getClass();
                } else {
                    this.f52577e0[i14].d.getClass();
                }
                i14++;
            }
        }
        X4();
        setBulletinDelegate(new y8(this, 4));
        if (this.f52643r3) {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
        u5(0, false);
        m5(false, true);
        t5(false);
        D3();
        N3();
        if (this.f52683z0 != null && (ywVar = this.f52577e0[0]) != null && (jvVar = ywVar.d) != null) {
            int i15 = jvVar.h;
            if (i15 == 7 || i15 == 8) {
                org.telegram.messenger.vo[] voVarArr = getMessagesController().M;
                if (i15 != 7) {
                    c10 = 1;
                }
                org.telegram.messenger.vo voVar = voVarArr[c10];
                if (voVar != null) {
                    this.f52683z0.h(voVar.f26086o);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z9, float f10) {
        if (org.telegram.messenger.iz.o() <= 0) {
            boolean z10 = org.telegram.messenger.r2.f25216a;
        } else if (this.Z3 && this.f52559a4 == null) {
            R4(f10);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f52589g1.setColor(getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
            y3();
            h5();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        bi.ec ecVar;
        zw zwVar;
        vv vvVar = this.G3;
        if (vvVar != null && vvVar.c()) {
            this.G3.getFragment().onTransitionAnimationEnd(z9, z10);
        } else {
            if (z9 && (ecVar = this.K0) != null && ecVar.getVisibility() == 0) {
                this.K0.setVisibility(8);
                this.K0.setBackground(null);
            }
            if (z9 && this.f52658u2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f41291v0.c(false);
                }
            }
        }
        if (!z9 && (zwVar = this.Y2) != null) {
            zwVar.removeSelfFromStack();
        }
        N3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z9, float f10) {
        vv vvVar = this.G3;
        if (vvVar != null && vvVar.c()) {
            this.G3.getFragment().onTransitionAnimationProgress(z9, f10);
        } else {
            bi.ec ecVar = this.K0;
            if (ecVar != null && ecVar.getVisibility() == 0) {
                if (z9) {
                    this.K0.setAlpha(1.0f - f10);
                } else {
                    this.K0.setAlpha(f10);
                }
            }
        }
        N3();
    }

    public final void p5() {
        org.telegram.ui.Components.po0 po0Var = this.H2;
        if (po0Var != null) {
            int i7 = this.currentAccount;
            po0Var.h(i7);
            po0Var.d = org.telegram.messenger.p10.i(org.telegram.messenger.c.a(i7).f21770a).e();
            ArrayList arrayList = po0Var.f37050f;
            arrayList.clear();
            ArrayList arrayList2 = this.J2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            fi.i1 i1Var = po0Var.f37046a[0];
            if (po0Var.f37047b == 1) {
                ((org.telegram.ui.ActionBar.m5) i1Var.f12171e).l(po0Var.c(i1Var), false);
            }
        }
    }

    @Override
    public final void prepareFragmentToSlide(boolean z9, boolean z10) {
        if (!z9 && z10) {
            this.Z3 = true;
            N4(true);
            return;
        }
        this.f52559a4 = null;
        this.Z3 = false;
        N4(false);
        R4(1.0f);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.f2 f2Var) {
        boolean presentFragment = super.presentFragment(f2Var);
        if (presentFragment && this.f52577e0 != null) {
            int i7 = 0;
            while (true) {
                yw[] ywVarArr = this.f52577e0;
                if (i7 >= ywVarArr.length) {
                    break;
                }
                ywVarArr[i7].d.getClass();
                i7++;
            }
        }
        fi.m3 m3Var = this.f52629p0;
        if (m3Var != null) {
            m3Var.f(true);
        }
        fi.m3 m3Var2 = this.f52634q0;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
        org.telegram.ui.Components.bc.e();
        return presentFragment;
    }

    public final boolean q4() {
        if (this.X2 == 1) {
            return true;
        }
        return false;
    }

    public final void q5(boolean z9) {
        boolean z10;
        if (this.f52612l0 == null) {
            return;
        }
        ArrayList arrayList = getDownloadController().G;
        int size = arrayList.size();
        boolean z11 = false;
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                if (ijVar.F0() != null && ijVar.F0().size >= 157286400) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        ArrayList arrayList2 = getDownloadController().H;
        int size2 = arrayList2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i10);
            i10++;
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) obj2;
            if (ijVar2.F0() != null && ijVar2.F0().size >= 157286400) {
                z10 = true;
                break;
            }
        }
        if (!getUserConfig().q() && !getMessagesController().D3() && z10 && z9) {
            z11 = true;
        }
        this.d.a(z11, true);
    }

    public final boolean r4(long j3) {
        if (j3 < 0) {
            return false;
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
        if (!org.telegram.messenger.t10.u(a22)) {
            return false;
        }
        ArrayList l10 = org.telegram.messenger.qp.s1(this.currentAccount).f24881q7.l(-a22.f27109id);
        if ((l10 != null && !l10.isEmpty()) || !org.telegram.messenger.qp.s1(this.currentAccount).f24881q7.e(-a22.f27109id)) {
            return false;
        }
        return true;
    }

    public final void r5(TLRPC.User user, boolean z9) {
        org.telegram.ui.Components.f5 f5Var;
        org.telegram.ui.ActionBar.h6 h6Var;
        sv svVar = this.E0;
        org.telegram.ui.Components.f5 f5Var2 = null;
        if (svVar != null && (f5Var = svVar.f9532a0) != null && svVar.f9552q0 != null) {
            Long h = org.telegram.messenger.t10.h(user);
            if (h != null) {
                f5Var.j(h.longValue(), z9);
                f5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z9);
            } else {
                if (user != null) {
                    org.telegram.messenger.qp.s1(svVar.f9540f);
                    if (org.telegram.messenger.qp.B2(user)) {
                        if (svVar.N0 == null) {
                            svVar.N0 = svVar.getContext().getResources().getDrawable(2131232307).mutate();
                            svVar.N0 = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), svVar.N0);
                        }
                        Drawable drawable = svVar.N0;
                        int i7 = org.telegram.ui.ActionBar.m6.f28083ni;
                        zw zwVar = svVar.f9539e0;
                        if (zwVar != null) {
                            h6Var = zwVar.getResourceProvider();
                        } else {
                            h6Var = null;
                        }
                        org.telegram.ui.ActionBar.t6.x(svVar, drawable, i7, h6Var, PorterDuff.Mode.MULTIPLY);
                        f5Var.g(svVar.N0, z9);
                        f5Var.m(false, z9);
                    }
                }
                f5Var.g(null, z9);
                f5Var.m(false, z9);
            }
            f5Var.k(Integer.valueOf(svVar.f(org.telegram.ui.ActionBar.m6.f28083ni)));
            svVar.W.invalidate();
        }
        if (this.E3 != null && this.actionBar != null) {
            Long h7 = org.telegram.messenger.t10.h(user);
            this.C3 = null;
            if (h7 != null) {
                boolean z10 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                this.E3.j(h7.longValue(), z9);
                this.E3.m(z10, z9);
                if (z10) {
                    this.C3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
                }
                this.actionBar.setRightDrawableOnClick(new hu(this, 1));
                t11.t(this.currentAccount);
            } else {
                if (user != null) {
                    org.telegram.messenger.qp.s1(this.currentAccount);
                    if (org.telegram.messenger.qp.B2(user)) {
                        if (this.L3 == null) {
                            this.L3 = getParentActivity().getResources().getDrawable(2131232307).mutate();
                            this.L3 = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.L3);
                        }
                        Drawable drawable2 = this.L3;
                        int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.f28083ni);
                        this.f52677x4 = themedColor;
                        drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                        this.E3.g(this.L3, z9);
                        this.E3.m(false, z9);
                        this.actionBar.setRightDrawableOnClick(new hu(this, 2));
                        t11.t(this.currentAccount);
                    }
                }
                this.E3.g(null, z9);
                this.E3.m(false, z9);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.f5 f5Var3 = this.E3;
            int i10 = org.telegram.ui.ActionBar.m6.f28083ni;
            f5Var3.k(Integer.valueOf(getThemedColor(i10)));
            org.telegram.ui.Cells.o oVar = this.F3;
            if (oVar != null) {
                oVar.setColor(getThemedColor(i10));
            }
            xv xvVar = this.M0;
            if (xvVar != null && (xvVar.getContentView() instanceof t11)) {
                org.telegram.ui.ActionBar.m5 titleTextView = this.actionBar.getTitleTextView();
                t11 t11Var = (t11) this.M0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.f5 f5Var4 = this.E3;
                    if (rightDrawable == f5Var4) {
                        f5Var2 = f5Var4;
                    }
                }
                t11Var.y(f5Var2, titleTextView);
            }
        }
    }

    public final boolean s3(long j3, View view) {
        if (this.f52617m2 && getMessagesController().t2(j3)) {
            return false;
        }
        Long valueOf = Long.valueOf(j3);
        ArrayList arrayList = this.J2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j3));
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).c0(false, true);
            } else if (view instanceof org.telegram.ui.Cells.g6) {
                ((org.telegram.ui.Cells.g6) view).w(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j3));
        if (view instanceof org.telegram.ui.Cells.t2) {
            ((org.telegram.ui.Cells.t2) view).c0(true, true);
        } else if (view instanceof org.telegram.ui.Cells.g6) {
            ((org.telegram.ui.Cells.g6) view).w(true, true);
        }
        return true;
    }

    public final boolean s4(TLRPC.Dialog dialog) {
        char c10;
        if (dialog == null) {
            return false;
        }
        int i7 = this.f52577e0[0].f52132s;
        org.telegram.messenger.vo voVar = null;
        if ((i7 == 7 || i7 == 8) && (!this.actionBar.x() || this.actionBar.y(null))) {
            org.telegram.messenger.vo[] voVarArr = getMessagesController().M;
            if (this.f52577e0[0].f52132s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            voVar = voVarArr[c10];
        }
        if (voVar != null) {
            if (voVar.f26081j.indexOfKey(dialog.f26964id) < 0) {
                return false;
            }
            return true;
        }
        return dialog.pinned;
    }

    public final void s5() {
        fi.m3 m3Var;
        boolean W4 = getMessagesController().W4();
        if (this.O3 != W4) {
            k5();
            if (!this.O3 && W4 && (m3Var = this.f52629p0) != null) {
                m3Var.w();
            }
            this.O3 = W4;
        }
        org.telegram.ui.Components.p00 p00Var = this.f52651t0;
        if (p00Var == null) {
            return;
        }
        if (this.S0 == 10) {
            p00Var.setImageResource(2131231195);
            this.f52651t0.setContentDescription(org.telegram.messenger.id.M0(2131751354, null));
            return;
        }
        p00Var.setImageResource(2131231107);
        this.f52651t0.setContentDescription(org.telegram.messenger.id.M0(2131748270, null));
    }

    @Override
    public final void setInPreviewMode(boolean z9) {
        super.setInPreviewMode(z9);
        sv svVar = this.E0;
        if (svVar != null) {
            if (this.G0 && !z9) {
                svVar.setVisibility(0);
            } else {
                svVar.setVisibility(8);
            }
        }
        l5(true);
        g5();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r6, int r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zw.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    public final void t3(jg.o0 o0Var) {
        iw iwVar;
        if (this.f52643r3 && (iwVar = this.C0) != null) {
            ArrayList arrayList = iwVar.C0;
            if (!arrayList.isEmpty()) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    if (o0Var.b((jg.o0) arrayList.get(i7))) {
                        return;
                    }
                }
            }
            arrayList.add(o0Var);
            ow owVar = this.X;
            ArrayList arrayList2 = owVar.F;
            arrayList2.add(o0Var);
            owVar.I = arrayList2.size() - 1;
            owVar.e();
            this.X.f37446r.getText().clear();
            j5(true, null, null, false, true);
        }
    }

    public final boolean t4() {
        if (this.D2 == null && this.f52627o2 == null) {
            return true;
        }
        return false;
    }

    public final void t5(boolean z9) {
        org.telegram.ui.ActionBar.l lVar;
        boolean z10;
        boolean z11;
        di.z6 j42;
        ArrayList arrayList;
        boolean z12;
        boolean z13;
        int i7;
        float f10;
        float f11;
        if (this.E0 != null && this.I == null) {
            vv vvVar = this.G3;
            if ((vvVar == null || !vvVar.c()) && !this.f52643r3 && (lVar = this.actionBar) != null && !lVar.x() && !this.f52617m2) {
                fi.va vaVar = fi.va.F2;
                int i10 = 0;
                if ((vaVar != null && vaVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().J0)) {
                    z9 = false;
                }
                if (!q4() && j4().I()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.Z2 != 0) {
                    z11 = false;
                } else if (q4()) {
                    z11 = !j4().h.isEmpty();
                } else {
                    if (!z10 && (((arrayList = (j42 = j4()).f10002g) != null && arrayList.size() > 0) || j42.J())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z10 = j4().I();
                }
                this.L = z10;
                boolean z14 = this.G0;
                if (!z10 && !z11) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                this.G0 = z12;
                if (z11 || z12) {
                    sv svVar = this.E0;
                    if (z12 != z14) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    svVar.p(z9, z13);
                }
                boolean z15 = this.G0;
                int i11 = 8;
                float f12 = 0.0f;
                if (z15 != z14) {
                    if (z9) {
                        ValueAnimator valueAnimator = this.J;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        if (this.G0 && !isInPreviewMode()) {
                            this.E0.setVisibility(0);
                        }
                        float f13 = this.H0;
                        if (this.G0) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f11);
                        this.J = ofFloat;
                        ofFloat.addUpdateListener(new ki(1, this));
                        this.J.addListener(new va(this, 25));
                        this.J.setDuration(200L);
                        this.J.setInterpolator(org.telegram.ui.Components.wq.f40046f);
                        this.J.start();
                    } else {
                        sv svVar2 = this.E0;
                        if (z15 && !isInPreviewMode()) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        svVar2.setVisibility(i7);
                        if (this.G0) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        this.H0 = f10;
                        View view = this.fragmentView;
                        if (view != null) {
                            view.invalidate();
                        }
                    }
                }
                if (z11 != this.M) {
                    this.M = z11;
                    if (z11) {
                        this.E0.l(false, 1.0f);
                    }
                    if (z9 && !isInPreviewMode()) {
                        this.E0.setVisibility(0);
                        float f14 = -this.N;
                        if (!z11) {
                            f12 = f4();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.I = ofFloat2;
                        ofFloat2.addUpdateListener(new hw(this, f14, z11, f12));
                        this.I.addListener(new bw(this, z11, 2));
                        this.I.setDuration(200L);
                        this.I.setInterpolator(org.telegram.ui.Components.wq.f40046f);
                        this.I.start();
                        return;
                    }
                    this.K = z11;
                    sv svVar3 = this.E0;
                    if ((z11 || this.L) && !isInPreviewMode()) {
                        i11 = 0;
                    }
                    svVar3.setVisibility(i11);
                    if (!z11) {
                        O4(0.0f);
                    } else {
                        this.f52686z3 = -org.telegram.messenger.g0.L(81.0f);
                        O4(-f4());
                    }
                    while (true) {
                        yw[] ywVarArr = this.f52577e0;
                        if (i10 >= ywVarArr.length) {
                            break;
                        }
                        yw ywVar = ywVarArr[i10];
                        if (ywVar != null) {
                            ywVar.f52125a.requestLayout();
                        }
                        i10++;
                    }
                    View view2 = this.fragmentView;
                    if (view2 != null) {
                        view2.requestLayout();
                        this.fragmentView.invalidate();
                    }
                }
            }
        }
    }

    public final void u3(boolean z9) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.X2 == 0 && this.Z2 == 0 && Build.VERSION.SDK_INT >= 33 && gh0.J0(parentActivity)) {
                if (z9) {
                    showDialog(new gh0(parentActivity, !c8.ia.a(), new uu(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().U && this.V1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z9) {
                    org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.u4.v(parentActivity, new lu(this, 1)).f27300a;
                    this.U1 = u1Var;
                    showDialog(u1Var);
                    return;
                }
                arrayList.add("android.permission.READ_CONTACTS");
                arrayList.add("android.permission.WRITE_CONTACTS");
                arrayList.add("android.permission.GET_ACCOUNTS");
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33) {
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                }
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                }
                if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                }
            } else if ((i7 <= 28 || org.telegram.messenger.r2.f25217b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
            if (arrayList.isEmpty()) {
                if (this.A0) {
                    this.A0 = false;
                    V4();
                    return;
                }
                return;
            }
            try {
                parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
            } catch (Exception unused) {
            }
        }
    }

    public final void u5(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zw.u5(int, boolean):void");
    }

    @Override
    public final void v() {
        J4(true, true);
    }

    public final void v3(CharSequence charSequence) {
        int i7;
        if (this.C1 != null) {
            if (this.E2 == null && this.F2 == null && this.G2 == null) {
                return;
            }
            if (this.H2 == null) {
                org.telegram.ui.Components.po0 po0Var = new org.telegram.ui.Components.po0(getParentActivity(), getResourceProvider());
                this.H2 = po0Var;
                po0Var.setLayoutClickListener(new hu(this, 0));
                this.H2.setOnModeChangeListener(new iu(this, 0));
                mv mvVar = this.C1;
                org.telegram.ui.Components.po0 po0Var2 = this.H2;
                if (po0Var2 == null) {
                    mvVar.getClass();
                } else {
                    mvVar.G1 = po0Var2;
                    mvVar.addView(po0Var2, 0, c8.ha.e(-1, 48, 51));
                    mvVar.f31072g3 = false;
                    mvVar.I();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.H2.getLayoutParams();
                layoutParams.rightMargin = -this.C1.getPaddingRight();
                this.H2.setLayoutParams(layoutParams);
            }
            if (m4()) {
                this.H2.i(this.currentAccount, this.E2);
            } else {
                String str = this.F2;
                if (str != null) {
                    org.telegram.ui.Components.po0 po0Var3 = this.H2;
                    po0Var3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        po0Var3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.G2;
                    if (charSequence2 != null) {
                        org.telegram.ui.Components.po0 po0Var4 = this.H2;
                        po0Var4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            po0Var4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.C1.setFieldText(charSequence);
            }
            mv mvVar2 = this.C1;
            if (m4()) {
                i7 = 2131754454;
            } else {
                i7 = 2131745462;
            }
            mvVar2.setOverrideHint(org.telegram.messenger.id.M0(i7, null));
            H3();
            if (this.H2.getMode() != 0) {
                this.C1.y1(false, false);
            }
            p5();
        }
    }

    public final void v4(long j3) {
        char c10;
        long j10 = j3;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().Q.f(j10);
        int i7 = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList arrayList = (ArrayList) getMessagesController().f24938x.f(dialog.community_id);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                v4(((TLRPC.Dialog) obj).f26964id);
            }
            return;
        }
        int i10 = this.f52577e0[0].f52132s;
        org.telegram.messenger.vo voVar = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.x() || this.actionBar.y(null))) {
            org.telegram.messenger.vo[] voVarArr = getMessagesController().M;
            if (this.f52577e0[0].f52132s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            voVar = voVarArr[c10];
        }
        int i11 = -1;
        if (voVar != null) {
            int i12 = voVar.f26079g;
            int i13 = org.telegram.messenger.qp.C8;
            if ((i12 & 64) != 0 && !voVar.a(this.currentAccount, dialog)) {
                M4(true, true);
                z3();
                if (this.S1 != null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= this.S1.size()) {
                            break;
                        } else if (((TLRPC.Dialog) this.S1.get(i14)).f26964id == j10) {
                            i11 = i14;
                            break;
                        } else {
                            i14++;
                        }
                    }
                    if (i11 < 0) {
                        M4(false, false);
                    }
                }
            }
        }
        int i15 = i11;
        if (getMessagesController().t2(j10) || getMessagesController().z2(j10)) {
            org.telegram.messenger.qp messagesController = getMessagesController();
            org.telegram.messenger.yr messagesStorage = messagesController.getMessagesStorage();
            org.telegram.messenger.rl rlVar = new org.telegram.messenger.rl(messagesController, j10);
            org.telegram.messenger.p5 p5Var = messagesStorage.f26723a;
            org.telegram.messenger.a4 a4Var = new org.telegram.messenger.a4(messagesStorage, j10, rlVar, 5);
            j10 = j10;
            p5Var.c(a4Var);
        }
        getMessagesController().o3(j10, 0L);
        org.telegram.messenger.qp messagesController2 = getMessagesController();
        int i16 = dialog.top_message;
        messagesController2.j3(j10, i16, i16, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i15 >= 0) {
            this.S1.remove(i15);
            this.f52577e0[0].f52135y.D();
            this.f52577e0[0].q(true);
        }
    }

    public final boolean v5(long j3) {
        TLRPC.Chat M0;
        mv mvVar;
        if ((this.T0 <= 1 && ((mvVar = this.C1) == null || mvVar.getVisibility() != 0 || TextUtils.isEmpty(this.C1.getFieldText()))) || !org.telegram.messenger.m5.z(j3) || (M0 = getMessagesController().M0(Long.valueOf(-j3))) == null || org.telegram.messenger.t3.N(M0) || !M0.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.u4.r0(this, org.telegram.messenger.id.M0(2131745310, null), org.telegram.messenger.id.M0(2131745302, null), null);
        return false;
    }

    public final int w3() {
        if (this.C1 != null) {
            return (int) (this.f52684z1.getInputBubbleHeight() + this.f52666w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(2.0f));
        } else if (this.Z2 != 0) {
            return org.telegram.messenger.g0.L(72.0f) + this.f52592g4;
        } else {
            return this.f52592g4 + this.f52602i4;
        }
    }

    public final boolean w4(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.User r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zw.w4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    public final boolean x3() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.J2;
            if (i7 < arrayList.size()) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-((Long) arrayList.get(i7)).longValue()));
                if (M0 != null && !org.telegram.messenger.t3.l(M0)) {
                    return false;
                }
                i7++;
            } else {
                return true;
            }
        }
    }

    public final boolean x4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.G;
        if (user != null && !org.telegram.messenger.t10.z(user) && !org.telegram.messenger.t10.x(user)) {
            Boolean bool = tL_requestPeerTypeUser.bot;
            if (bool == null || bool.booleanValue() == user.bot) {
                Boolean bool2 = tL_requestPeerTypeUser.premium;
                if (bool2 == null || bool2.booleanValue() == user.premium) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void y3() {
        int themedColor;
        org.telegram.ui.Components.ze0 ze0Var;
        iv ivVar;
        org.telegram.ui.Components.yl0 yl0Var;
        g61 g61Var;
        iw iwVar = this.C0;
        if (iwVar != null && (yl0Var = iwVar.f33590d0) != null && (g61Var = yl0Var.f16750k0) != null) {
            int childCount = g61Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = g61Var.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.o4) {
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) childAt;
                    org.telegram.ui.Components.v8 v8Var = o4Var.f29663c;
                    int i10 = o4Var.h;
                    if (org.telegram.messenger.m5.E(o4Var.f29665f)) {
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(o4Var.f29665f));
                        o4Var.f29664e = a22;
                        v8Var.r(a22);
                    } else {
                        v8Var.q(org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-o4Var.f29665f)));
                        o4Var.f29664e = null;
                    }
                    o4Var.c(true);
                }
            }
        }
        if (this.f52577e0 != null) {
            int i11 = 0;
            while (true) {
                yw[] ywVarArr = this.f52577e0;
                if (i11 >= ywVarArr.length) {
                    break;
                }
                yw ywVar = ywVarArr[i11];
                if (ywVar != null && (ivVar = ywVar.f52130n) != null) {
                    ivVar.i();
                }
                i11++;
            }
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.H(getThemedColor(org.telegram.ui.ActionBar.m6.G8), true);
            this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.m6.E8), false, true);
            this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.m6.F8), true, true);
            this.actionBar.J(getThemedColor(org.telegram.ui.ActionBar.m6.I5), true);
            this.actionBar.updateColors();
        }
        if (this.E3 != null) {
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.m6.f28083ni);
            Drawable drawable = this.L3;
            if (drawable != null && themedColor2 != this.f52677x4) {
                this.f52677x4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.Components.f5 f5Var = this.E3;
            if (f5Var != null) {
                f5Var.k(Integer.valueOf(themedColor2));
            }
            org.telegram.ui.Cells.o oVar = this.F3;
            if (oVar != null) {
                oVar.setColor(themedColor2);
            }
        }
        org.telegram.ui.Cells.b3 b3Var = this.N1;
        if (b3Var != null) {
            org.telegram.ui.ActionBar.m6.H1(b3Var.getBackground(), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27982i6, false), true);
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.m0;
        if (r0Var != null) {
            r0Var.setIconColor(getThemedColor(org.telegram.ui.ActionBar.m6.f28227v8));
        }
        mv mvVar = this.C1;
        if (mvVar != null) {
            mvVar.updateColors();
        }
        pw pwVar = this.f52683z0;
        if (pwVar != null) {
            fh.g gVar = pwVar.f33397y0;
            if (gVar != null) {
                gVar.updateColors();
            }
            pwVar.invalidate();
        }
        jg.q0 q0Var = this.f52561b0;
        if (q0Var != null) {
            q0Var.updateColors();
        }
        iw iwVar2 = this.C0;
        if (iwVar2 != null && (ze0Var = iwVar2.f33603r0) != null) {
            ze0Var.c();
        }
        org.telegram.ui.Components.u61 u61Var = this.f52555a0;
        if (u61Var != null) {
            u61Var.updateColors();
        }
        gz0 gz0Var = this.Z;
        if (gz0Var != null) {
            gz0Var.updateColors();
        }
        if (this.K0 != null) {
            int o4 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6), 100);
            if (this.K0.getForeground() instanceof ColorDrawable) {
                if (((ColorDrawable) this.K0.getForeground()).getColor() != o4) {
                    ((ColorDrawable) this.K0.getForeground()).setColor(o4);
                }
            } else {
                this.K0.setForeground(new ColorDrawable(o4));
            }
        }
        org.telegram.ui.Components.p00 p00Var = this.f52651t0;
        if (p00Var != null) {
            p00Var.updateColors();
        }
        org.telegram.ui.Components.p00 p00Var2 = this.f52656u0;
        if (p00Var2 != null) {
            p00Var2.updateColors();
        }
        int i12 = org.telegram.ui.ActionBar.m6.f27890d6;
        this.f52624n4.a(getThemedColor(i12));
        org.telegram.ui.Components.or orVar = this.K1;
        if (orVar != null) {
            orVar.updateColors();
        }
        org.telegram.ui.Components.nr nrVar = this.L1;
        if (nrVar != null) {
            nrVar.setColor(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
        }
        kv kvVar = this.I1;
        if (kvVar != null) {
            kvVar.updateColors();
        }
        kv kvVar2 = this.G1;
        if (kvVar2 != null) {
            kvVar2.updateColors();
        }
        n5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        sv svVar = this.E0;
        if (svVar != null) {
            svVar.o();
        }
        if (this.D3 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.Ul)) != this.f52671w4) {
            this.f52671w4 = themedColor;
            this.D3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        ow owVar = this.X;
        if (owVar != null) {
            owVar.updateColors();
        }
    }

    public final void y4(View view) {
        boolean z9;
        int i7;
        int i10;
        String str;
        int i11;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        org.telegram.ui.ActionBar.w2 h = org.telegram.messenger.camera.q.h(getParentActivity(), false, 1, null);
        if (getMessagesStorage().L != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i7 = 2131232215;
        } else {
            i7 = 0;
        }
        if (org.telegram.messenger.iz.f23434q1) {
            i10 = 2131230998;
        } else {
            i10 = 2131231002;
        }
        int[] iArr = {i7, i10};
        if (z9) {
            str = org.telegram.messenger.id.M0(2131748682, null);
        } else {
            str = null;
        }
        if (org.telegram.messenger.iz.f23434q1) {
            i11 = 2131747246;
        } else {
            i11 = 2131749324;
        }
        CharSequence[] charSequenceArr = {str, org.telegram.messenger.id.M0(i11, null)};
        k4 k4Var = new k4(this, 1);
        h.L = charSequenceArr;
        h.M = iArr;
        h.K = k4Var;
        showDialog(h);
    }

    public final void z3() {
        org.telegram.messenger.g0.i3(new cv(this, 0), 300L);
    }

    public final void z4(android.view.View r27, int r28, v4.g0 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zw.z4(android.view.View, int, v4.g0):void");
    }
}
