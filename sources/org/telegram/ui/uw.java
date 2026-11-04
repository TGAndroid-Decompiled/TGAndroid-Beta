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
public class uw extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, qg.b, qe.b, de0 {
    public static float B4;
    public static boolean f50199y4;
    public jw A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public boolean B0;
    public FrameLayout B1;
    public boolean B2;
    public boolean B3;
    public int C0;
    public gv C1;
    public boolean C2;
    public Long C3;
    public cw D0;
    public mi.x1 D1;
    public nw D2;
    public Drawable D3;
    public boolean E;
    public org.telegram.ui.Components.os0 E0;
    public org.telegram.ui.ActionBar.q0 E1;
    public ArrayList E2;
    public org.telegram.ui.Components.e5 E3;
    public boolean F;
    public mv F0;
    public final TextPaint F1;
    public String F2;
    public org.telegram.ui.Cells.o F3;
    public boolean G;
    public org.telegram.ui.Components.nr G0;
    public ev G1;
    public CharSequence G2;
    public pv G3;
    public TLRPC.RequestPeerType H;
    public boolean H0;
    public FrameLayout H1;
    public org.telegram.ui.Components.ro0 H2;
    public final fv H3;
    public long I;
    public float I0;
    public ev I1;
    public org.telegram.ui.Components.p11 I2;
    public final fv I3;
    public ValueAnimator J;
    public float J0;
    public FrameLayout J1;
    public final ArrayList J2;
    public f J3;
    public ValueAnimator K;
    public float K0;
    public org.telegram.ui.Components.pr K1;
    public boolean K2;
    public za.p K3;
    public boolean L;
    public org.telegram.ui.Components.voip.r0 L0;
    public org.telegram.ui.Components.or L1;
    public int L2;
    public Drawable L3;
    public boolean M;
    public org.telegram.ui.Components.f60 M0;
    public org.telegram.ui.Cells.m M1;
    public int M2;
    public int M3;
    public boolean N;
    public rv N0;
    public org.telegram.ui.Cells.b3 N1;
    public boolean N2;
    public boolean N3;
    public float O;
    public boolean O0;
    public org.telegram.ui.Cells.ma O1;
    public int O2;
    public boolean O3;
    public boolean P;
    public boolean P0;
    public Long P1;
    public int P2;
    public AnimatorSet P3;
    public int Q;
    public long Q0;
    public Long Q1;
    public int Q2;
    public boolean Q3;
    public boolean R;
    public long R0;
    public ki.j R1;
    public int R2;
    public kt R3;
    public boolean S;
    public int S0;
    public ArrayList S1;
    public int S2;
    public String S3;
    public org.telegram.ui.Components.ac T;
    public int T0;
    public boolean T1;
    public int T2;
    public ArrayList T3;
    public float U;
    public int U0;
    public org.telegram.ui.ActionBar.s1 U1;
    public int U2;
    public boolean U3;
    public boolean V;
    public boolean V0;
    public boolean V1;
    public int V2;
    public CharSequence V3;
    public boolean W;
    public org.telegram.ui.Components.ib0 W0;
    public boolean W1;
    public boolean W2;
    public boolean W3;
    public boolean X;
    public org.telegram.ui.Cells.t2 X0;
    public long X1;
    public int X2;
    public float X3;
    public iw Y;
    public org.telegram.ui.Cells.t2 Y0;
    public TLObject Y1;
    public uw Y2;
    public boolean Y3;
    public cg.o0 Z;
    public boolean Z0;
    public int Z1;
    public long Z2;
    public boolean Z3;
    public final int f50201a;
    public sy0 f50202a0;
    public boolean f50203a1;
    public int f50204a2;
    public TLRPC.Chat f50205a3;
    public ValueAnimator f50206a4;
    public final qe.a f50207b;
    public org.telegram.ui.Components.m61 f50208b0;
    public final ArrayList f50209b1;
    public boolean f50210b2;
    public TLRPC.ChatFull f50211b3;
    public org.telegram.ui.Components.f30 f50212b4;
    public final qe.a f50213c;
    public kg.n0 f50214c0;
    public boolean f50215c1;
    public boolean c2;
    public org.telegram.ui.Components.k9 f50216c3;
    public TLRPC.FileLocation f50217c4;
    public final qe.a d;
    public float f50218d0;
    public boolean f50219d1;
    public boolean f50220d2;
    public org.telegram.ui.Components.u8 f50221d3;
    public TLRPC.FileLocation f50222d4;
    public final qe.a f50223e;
    public ValueAnimator f50224e0;
    public boolean f50225e1;
    public int f50226e2;
    public long f50227e3;
    public org.telegram.ui.Components.ac f50228e4;
    public final qe.a f50229f;
    public tw[] f50230f0;
    public org.telegram.ui.ActionBar.w1 f50231f1;
    public boolean f50232f2;
    public boolean f50233f3;
    public int f50234f4;
    public org.telegram.ui.ActionBar.q0 f50235g0;
    public final Paint f50236g1;
    public String f50237g2;
    public boolean f50238g3;
    public int f50239g4;
    public final qe.a h;
    public org.telegram.ui.ActionBar.q0 f50240h0;
    public ImageView f50241h1;
    public String f50242h2;
    public AnimatorSet f50243h3;
    public int f50244h4;
    public ww f50245i0;
    public NumberTextView f50246i1;
    public String f50247i2;
    public boolean i3;
    public int f50248i4;
    public boolean f50249j0;
    public final ArrayList f50250j1;
    public boolean f50251j2;
    public boolean f50252j3;
    public int f50253j4;
    public org.telegram.ui.ActionBar.q0 f50254k0;
    public org.telegram.ui.ActionBar.q0 k1;
    public boolean f50255k2;
    public float f50256k3;
    public final eh.g f50257k4;
    public org.telegram.ui.ActionBar.q0 f50258l0;
    public org.telegram.ui.ActionBar.q0 f50259l1;
    public boolean f50260l2;
    public boolean f50261l3;
    public final si.f f50262l4;
    public org.telegram.ui.ActionBar.q0 m0;
    public org.telegram.ui.ActionBar.q0 m1;
    public boolean f50263m2;
    public int f50264m3;
    public final si.f f50265m4;
    public final qe.a f50266n;
    public org.telegram.ui.ActionBar.q0 f50267n0;
    public org.telegram.ui.ActionBar.q0 f50268n1;
    public boolean f50269n2;
    public boolean f50270n3;
    public final si.c n4;
    public org.telegram.ui.Components.lg0 f50271o0;
    public org.telegram.ui.ActionBar.y0 f50272o1;
    public String f50273o2;
    public boolean f50274o3;
    public final eh.c f50275o4;
    public org.telegram.ui.ActionBar.y0 f50276p0;
    public org.telegram.ui.ActionBar.y0 f50277p1;
    public String f50278p2;
    public org.telegram.ui.Components.ac f50279p3;
    public final eh.c f50280p4;
    public gi.l3 f50281q0;
    public org.telegram.ui.ActionBar.y0 f50282q1;
    public final org.telegram.messenger.pr f50283q2;
    public final g2.g f50284q3;
    public final eh.c f50285q4;
    public final qe.a f50286r;
    public gi.l3 f50287r0;
    public org.telegram.ui.ActionBar.y0 f50288r1;
    public boolean f50289r2;
    public boolean f50290r3;
    public final eh.c f50291r4;
    public final qe.a f50292s;
    public boolean f50293s0;
    public org.telegram.ui.ActionBar.y0 f50294s1;
    public boolean f50295s2;
    public boolean f50296s3;
    public ru f50297s4;
    public boolean f50298t0;
    public org.telegram.ui.ActionBar.y0 f50299t1;
    public boolean f50300t2;
    public boolean f50301t3;
    public final ArrayList f50302t4;
    public org.telegram.ui.Components.l00 f50303u0;
    public org.telegram.ui.ActionBar.y0 f50304u1;
    public boolean f50305u2;
    public boolean f50306u3;
    public final RectF f50307u4;
    public org.telegram.ui.Components.l00 f50308v0;
    public float f50309v1;
    public boolean f50310v2;
    public float f50311v3;
    public final RectF f50312v4;
    public final sh.h f50313w;
    public gi.d f50314w0;
    public float f50315w1;
    public boolean f50316w2;
    public ValueAnimator f50317w3;
    public int f50318w4;
    public boolean f50319x;
    public mh.f f50320x0;
    public AnimatorSet f50321x1;
    public boolean f50322x2;
    public float f50323x3;
    public int f50324x4;
    public int f50325y;
    public int f50326y0;
    public float f50327y1;
    public boolean f50328y2;
    public float f50329y3;
    public final UndoView[] f50330z0;
    public kh.f f50331z1;
    public boolean f50332z2;
    public float f50333z3;
    public static final boolean[] f50200z4 = new boolean[4];
    public static final org.telegram.ui.Components.qp0 A4 = new org.telegram.ui.Components.qp0(3);

    public uw(Bundle bundle) {
        super(bundle);
        int i3;
        int L;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            i3 = 48;
        } else {
            i3 = 0;
        }
        this.f50201a = i3;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.f50207b = new qe.a(1, this, xqVar, 350L, false);
        this.f50213c = new qe.a(2, this, xqVar, 350L, false);
        this.d = new qe.a(3, this, xqVar, 350L, false);
        this.f50223e = new qe.a(4, this, xqVar, 350L, false);
        this.f50229f = new qe.a(5, this, xqVar, 350L, false);
        this.h = new qe.a(6, this, xqVar, 350L, false);
        this.f50266n = new qe.a(7, this, xqVar, 350L, false);
        this.f50286r = new qe.a(8, this, xqVar, 350L, false);
        this.f50292s = new qe.a(9, this, xqVar, 350L, false);
        this.f50313w = new sh.h(new au(this, 18));
        this.f50325y = -1;
        this.G = true;
        this.L = false;
        this.M = false;
        this.N = false;
        this.R = true;
        this.f50218d0 = 1.0f;
        this.f50330z0 = new UndoView[2];
        this.f50209b1 = new ArrayList();
        this.f50236g1 = new Paint();
        this.f50250j1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.F1 = new TextPaint(1);
        this.V1 = true;
        this.f50220d2 = true;
        this.f50251j2 = true;
        this.f50283q2 = new Object();
        this.J2 = new ArrayList();
        this.K2 = true;
        this.f50284q3 = new g2.g((int[]) null);
        this.H3 = new fv(this, 0);
        this.I3 = new fv(this, 1);
        this.M3 = -4;
        this.N3 = true;
        this.O3 = true;
        this.X3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f50302t4 = arrayList;
        RectF rectF = new RectF();
        this.f50307u4 = rectF;
        RectF rectF2 = new RectF();
        this.f50312v4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        si.c d = this.glassEngine.d(new du(this, 12));
        this.n4 = d;
        if (i10 >= 31) {
            eh.g gVar = new eh.g(false);
            this.f50257k4 = gVar;
            si.f fVar = new si.f(d);
            this.f50265m4 = fVar;
            fVar.f54756f = d;
            fVar.d = gVar;
            fVar.f54755e = -2;
            si.f fVar2 = new si.f(null);
            this.f50262l4 = fVar2;
            fVar2.f54756f = d;
            fVar2.d = gVar;
            fVar2.f54755e = -3;
            eh.c cVar = new eh.c(fVar, fVar, fVar);
            this.f50285q4 = cVar;
            cVar.f9988k = true;
            if (org.telegram.messenger.lc.e(262144)) {
                L = org.telegram.messenger.g0.L(8.0f);
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            cVar.d = L;
            cVar.f9983e = L;
            eh.c cVar2 = new eh.c(fVar2, fVar2, fVar2);
            this.f50275o4 = cVar2;
            cVar2.f9988k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L2;
            cVar2.f9983e = L2;
            this.f50280p4 = new eh.c(fVar2, fVar2, fVar2);
        } else {
            this.f50257k4 = null;
            this.f50262l4 = null;
            this.f50265m4 = null;
            this.f50275o4 = new eh.c(d, d, d);
            this.f50285q4 = new eh.c(d, d, d);
            this.f50280p4 = new eh.c(d, d, d);
        }
        eh.c cVar3 = new eh.c(d, d, d);
        this.f50291r4 = cVar3;
        eh.c cVar4 = this.f50285q4;
        pi.q qVar = this.glassEngine;
        cVar4.f9987j = qVar;
        this.f50275o4.f9987j = qVar;
        this.f50280p4.f9987j = qVar;
        cVar3.f9987j = qVar;
    }

    public static void A0(uw uwVar) {
        if (!uwVar.O3) {
            gi.l3 l3Var = uwVar.f50287r0;
            if (l3Var != null) {
                if (l3Var.W) {
                    return;
                }
                org.telegram.messenger.g0.E2(l3Var);
            }
            SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(org.telegram.messenger.bd.N0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.k6.uj, 0, new au(uwVar, 24), null);
            gi.l3 l3Var2 = new gi.l3(uwVar.getParentActivity(), 2);
            l3Var2.s(8.0f);
            l3Var2.d = 8000L;
            l3Var2.k(true);
            l3Var2.r(true);
            l3Var2.h = org.telegram.messenger.g0.f22608q.x - org.telegram.messenger.g0.L(148.0f);
            l3Var2.u(S2);
            l3Var2.o(1.0f, -40.0f);
            l3Var2.j(uwVar.getThemedColor(org.telegram.ui.ActionBar.k6.tj));
            uwVar.f50287r0 = l3Var2;
            l3Var2.setTranslationY((-uwVar.f50239g4) - uwVar.f50248i4);
            ((ViewGroup) uwVar.fragmentView).addView(uwVar.f50287r0, b8.mf.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            uwVar.f50287r0.w();
            return;
        }
        gi.l3 l3Var3 = uwVar.f50281q0;
        if (l3Var3 != null) {
            l3Var3.f(true);
        }
        ei.t6 o10 = org.telegram.messenger.hp.s1(uwVar.currentAccount).P1().o();
        if (o10 != null && o10.a(uwVar.currentAccount, 1)) {
            uwVar.showDialog(new vg.i0(o10.b(), uwVar.currentAccount, uwVar.getParentActivity(), uwVar, null));
            return;
        }
        gi.va D = gi.va.D(uwVar.getParentActivity(), uwVar.currentAccount);
        D.f13776y = new av(uwVar);
        D.Q(null);
    }

    public static void B0(uw uwVar) {
        org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, "PREMIUM_CHRISTMAS");
        uwVar.g5();
        org.telegram.ui.Components.ac G = org.telegram.ui.Components.fc.a0(uwVar).G(2131624033, 4, org.telegram.messenger.bd.M0(2131753330, null));
        G.f31792j = 5000;
        G.j();
    }

    public static void C0(org.telegram.ui.uw r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.C0(org.telegram.ui.uw, int):void");
    }

    public static void D0(uw uwVar) {
        org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, "BIRTHDAY_SETUP");
        uwVar.g5();
        org.telegram.ui.Components.ac K = org.telegram.ui.Components.fc.a0(uwVar).K(2131623981, org.telegram.messenger.bd.M0(2131753714, null), org.telegram.messenger.bd.M0(2131745505, null), new au(uwVar, 29));
        K.f31792j = 5000;
        K.j();
    }

    public static void E0(uw uwVar) {
        boolean z10 = true;
        try {
            ((org.telegram.ui.Components.ch0) ((org.telegram.ui.Components.u8) uwVar.N1.h.getImageReceiver().f21256n0).K).H(true);
        } catch (Exception unused) {
        }
        if (uwVar.f50212b4 == null) {
            org.telegram.ui.Components.f30 f30Var = new org.telegram.ui.Components.f30(0, true, true);
            uwVar.f50212b4 = f30Var;
            f30Var.I = true;
            f30Var.f33681a = uwVar;
            f30Var.f33682b = new gw(uwVar);
            uwVar.getMediaDataController().x();
            uwVar.getMessagesController().d3();
            uwVar.getMessagesController().g3(uwVar.getUserConfig().f(), true, uwVar.classGuid);
        }
        TLRPC.User a22 = org.telegram.messenger.hp.s1(uwVar.currentAccount).a2(Long.valueOf(org.telegram.messenger.h10.i(uwVar.currentAccount).e()));
        if (a22 == null) {
            a22 = org.telegram.messenger.h10.i(uwVar.currentAccount).f();
        }
        if (a22 != null) {
            org.telegram.ui.Components.bi biVar = uwVar.f50212b4.f33683c;
            if (biVar != null) {
                biVar.P0();
            }
            org.telegram.ui.Components.f30 f30Var2 = uwVar.f50212b4;
            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            f30Var2.n(z10, new au(uwVar, 28), new ju(uwVar, 3), 0);
        }
    }

    public static void G0(uw uwVar, float f10, ValueAnimator valueAnimator) {
        uwVar.f50230f0[0].setTranslationY((1.0f - uwVar.f50311v3) * f10);
        uwVar.f50311v3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i3 = 0; i3 < uwVar.actionBar.getChildCount(); i3++) {
            if (uwVar.actionBar.getChildAt(i3).getVisibility() == 0 && uwVar.actionBar.getChildAt(i3) != uwVar.actionBar.getActionMode() && uwVar.actionBar.getChildAt(i3) != uwVar.actionBar.getBackButton()) {
                uwVar.actionBar.getChildAt(i3).setAlpha(1.0f - uwVar.f50311v3);
            }
        }
        uwVar.Q3();
        uwVar.I3();
        View view = uwVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void H0(uw uwVar) {
        org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(uwVar.getParentActivity(), uwVar.resourceProvider);
        ibVar.d(2131624008, new String[0]);
        ibVar.f34651b.setText(org.telegram.messenger.bd.M0(2131742821, null));
        org.telegram.ui.Components.ac.g(uwVar, ibVar, 2750).j();
        try {
            uwVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void I0(uw uwVar, org.telegram.messenger.t1 t1Var) {
        ArrayList arrayList = t1Var.f25475c;
        if (arrayList.size() == 1) {
            ai.b3 b3Var = new ai.b3(uwVar.getParentActivity(), uwVar.currentAccount, ((TLRPC.User) arrayList.get(0)).f27150id, null, null);
            b3Var.e1(true);
            uwVar.showDialog(b3Var);
            return;
        }
        xg.e1.l1(0, t1Var);
    }

    public static void J0(uw uwVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.ac I = org.telegram.ui.Components.fc.a0(uwVar).I(2131624033, org.telegram.messenger.bd.M0(2131746864, null), org.telegram.messenger.bd.M0(2131746863, null));
            I.f31792j = 5000;
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
            uwVar.getMessagesStorage().j2(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (uwVar.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, uwVar.getParentActivity(), uwVar.resourceProvider);
                String M0 = org.telegram.messenger.bd.M0(2131746860, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.M0(2131746861, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                uwVar.showDialog(s1Var);
                return;
            }
            return;
        }
        org.telegram.messenger.k5.o(null, 2131743889, org.telegram.ui.Components.fc.a0(uwVar), 2131624011, 36);
    }

    public static void K0(uw uwVar) {
        org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        uwVar.g5();
    }

    public static void X2(uw uwVar, float f10) {
        float f11;
        float f12;
        int i3;
        int i10;
        float i11 = Utilities.i(uwVar.f50327y1 * 2.0f, 1.0f, 0.0f);
        mv mvVar = uwVar.F0;
        float f13 = (1.0f - uwVar.f50311v3) * f10 * uwVar.I0;
        float f14 = 1.0f - i11;
        mvVar.setAlpha(f13 * f14);
        int i12 = 0;
        if (!uwVar.L && !uwVar.N) {
            if (uwVar.M) {
                uwVar.F0.setTranslationY((Math.max(uwVar.O, -uwVar.g4()) + (-org.telegram.messenger.g0.L(81.0f))) - org.telegram.messenger.g0.L(8.0f));
                uwVar.F0.setProgressToCollapse(1.0f);
                mv mvVar2 = uwVar.F0;
                mvVar2.setClipTop((int) (org.telegram.messenger.g0.f22602m - mvVar2.getY()));
            }
            f11 = 1.0f - uwVar.I0;
            uwVar.actionBar.setTranslationY(0.0f);
        } else {
            float i13 = Utilities.i((-uwVar.O) / org.telegram.messenger.g0.L(81.0f), 1.0f, 0.0f);
            if (uwVar.f50311v3 == 1.0f) {
                i13 = 1.0f;
            }
            float i14 = Utilities.i(i13 / 0.5f, 1.0f, 0.0f);
            uwVar.F0.setClipTop(0);
            if (!uwVar.L && uwVar.N) {
                uwVar.F0.setTranslationY((-org.telegram.messenger.g0.L(81.0f)) - org.telegram.messenger.g0.L(8.0f));
                uwVar.F0.setProgressToCollapse(1.0f);
                f12 = uwVar.I0;
            } else {
                uwVar.F0.setTranslationY(((uwVar.U / 2.0f) + (Math.max(uwVar.O, -uwVar.g4()) + uwVar.f50323x3)) - org.telegram.messenger.g0.L(8.0f));
                uwVar.F0.l(!uwVar.G3.c(), i13);
                if (!uwVar.N) {
                    f12 = uwVar.I0;
                } else {
                    f11 = 1.0f - i14;
                    uwVar.actionBar.setTranslationY(0.0f);
                }
            }
            f11 = 1.0f - f12;
            uwVar.actionBar.setTranslationY(0.0f);
        }
        float f15 = f11 * f14;
        if (f15 != 1.0f) {
            uwVar.actionBar.getTitlesContainer().setPivotY(org.telegram.messenger.g0.f22602m);
            uwVar.actionBar.getTitlesContainer().setPivotX(org.telegram.messenger.g0.L(20.0f));
            float f16 = (0.6f * f15) + 0.4f;
            uwVar.actionBar.getTitlesContainer().setScaleY(f16);
            uwVar.actionBar.getTitlesContainer().setScaleX(f16);
            uwVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            uwVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-org.telegram.messenger.g0.L(30.0f));
            uwVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f16);
            uwVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f16);
            float f17 = (1.0f - uwVar.f50311v3) * f15;
            uwVar.actionBar.getTitlesContainer().setAlpha(f17);
            FrameLayout titlesContainer = uwVar.actionBar.getTitlesContainer();
            int i15 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
            if (i15 > 0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            titlesContainer.setVisibility(i10);
            uwVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
            FrameLayout additionalSubTitleOverlayContainer = uwVar.actionBar.getAdditionalSubTitleOverlayContainer();
            if (i15 <= 0) {
                i12 = 4;
            }
            additionalSubTitleOverlayContainer.setVisibility(i12);
            return;
        }
        uwVar.actionBar.getTitlesContainer().setScaleY(1.0f);
        uwVar.actionBar.getTitlesContainer().setScaleX(1.0f);
        uwVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
        uwVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
        float f18 = 1.0f - uwVar.f50311v3;
        uwVar.actionBar.getTitlesContainer().setAlpha(f18);
        FrameLayout titlesContainer2 = uwVar.actionBar.getTitlesContainer();
        int i16 = (f18 > 0.0f ? 1 : (f18 == 0.0f ? 0 : -1));
        if (i16 > 0) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        titlesContainer2.setVisibility(i3);
        uwVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f18);
        FrameLayout additionalSubTitleOverlayContainer2 = uwVar.actionBar.getAdditionalSubTitleOverlayContainer();
        if (i16 <= 0) {
            i12 = 4;
        }
        additionalSubTitleOverlayContainer2.setVisibility(i12);
    }

    public static void Y2(uw uwVar, Canvas canvas, int i3) {
        org.telegram.ui.ActionBar.q4 q4Var;
        if (uwVar.parentLayout != null && uwVar.actionBar != null) {
            float max = Math.max(uwVar.f50223e.f53840e, uwVar.h4());
            float f10 = 1.0f;
            float f11 = 1.0f - uwVar.f50327y1;
            float f12 = max * f11 * f11;
            int i10 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
            if (i10 != 0) {
                if (-1 >= i3) {
                    f10 = 0.0f;
                    i3 = -1;
                }
                if (f10 > 0.0f && i10 > 0 && i3 > 0 && (q4Var = uwVar.parentLayout) != null) {
                    ((ActionBarLayout) q4Var).p(canvas, (int) (f10 * 255.0f * f12), i3);
                }
            }
        }
    }

    public static void Z(uw uwVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, tL_pendingSuggestion.suggestion);
        uwVar.g5();
    }

    public static void a0(uw uwVar, float f10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        uwVar.f50311v3 = floatValue;
        uwVar.f50230f0[0].setTranslationY((-f10) * floatValue);
        for (int i3 = 0; i3 < uwVar.actionBar.getChildCount(); i3++) {
            if (uwVar.actionBar.getChildAt(i3).getVisibility() == 0 && uwVar.actionBar.getChildAt(i3) != uwVar.actionBar.getActionMode() && uwVar.actionBar.getChildAt(i3) != uwVar.actionBar.getBackButton()) {
                uwVar.actionBar.getChildAt(i3).setAlpha(1.0f - uwVar.f50311v3);
            }
        }
        View view = uwVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        uwVar.Q3();
        uwVar.I3();
    }

    public static void b0(uw uwVar) {
        ArrayList arrayList = uwVar.J2;
        org.telegram.ui.ActionBar.q4 q4Var = uwVar.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).y()) {
            uwVar.finishPreviewFragment();
        } else if (uwVar.S0 == 10) {
            if (uwVar.D2 != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    arrayList2.add(org.telegram.messenger.pr.a(((Long) arrayList.get(i3)).longValue(), 0L));
                }
                uwVar.D2.y(uwVar, arrayList2, null, false, uwVar.K2, uwVar.L2, uwVar.M2, null);
            }
        } else if (org.telegram.messenger.hp.s1(uwVar.currentAccount).v2()) {
            b.b(uwVar.currentAccount);
        } else {
            uwVar.presentFragment(new ContactsActivity(a1.g.k("destroyAfterSelect", true)));
        }
    }

    public static void c0(uw uwVar) {
        org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, "USERPIC_SETUP");
        uwVar.g5();
    }

    public static org.telegram.ui.Cells.t2 c4(tw twVar) {
        pw pwVar = twVar.f49897a;
        for (int i3 = 0; i3 < pwVar.getChildCount(); i3++) {
            View childAt = pwVar.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.t2) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                if (t2Var.V()) {
                    return t2Var;
                }
            }
        }
        return null;
    }

    public static void d0(uw uwVar) {
        PasskeysActivity.f0(uwVar.currentAccount, uwVar.getParentActivity(), uwVar.resourceProvider, true);
    }

    public static void e0(uw uwVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", org.telegram.messenger.h10.i(uwVar.currentAccount).e());
        uwVar.presentFragment(new wm(bundle));
    }

    public static void f0(uw uwVar, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull b22 = uwVar.getMessagesController().b2(uwVar.getUserConfig().e());
        if (b22 != null) {
            tL_birthday2 = b22.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (b22 != null) {
            b22.flags2 |= 32;
            b22.birthday = tL_birthday;
        }
        uwVar.getMessagesController().m2();
        uwVar.getConnectionsManager().sendRequest(updatebirthday, new y9(uwVar, b22, tL_birthday2, 8), 1024);
        org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, "BIRTHDAY_SETUP");
        uwVar.g5();
    }

    public static void g0(uw uwVar, tw twVar, View view, int i3) {
        int i10;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.x3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.t2;
        if (z10) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            if (t2Var.f30534o2) {
                uwVar.Z4(t2Var.getDialogId(), view);
                return;
            }
        }
        if (uwVar.U3()) {
            uwVar.A4(view, i3, 0.0f, twVar.d);
            return;
        }
        int i11 = uwVar.S0;
        if (i11 == 15 && (view instanceof org.telegram.ui.Cells.l8)) {
            twVar.d.L();
            return;
        }
        int i12 = 0;
        if ((i11 == 11 || i11 == 13) && i3 == 1) {
            Bundle k10 = a1.g.k("forImport", true);
            k10.putLongArray("result", new long[]{uwVar.getUserConfig().e()});
            k10.putInt("chatType", 4);
            String string = uwVar.arguments.getString("importTitle");
            if (string != null) {
                k10.putString("title", string);
            }
            y40 y40Var = new y40(k10);
            y40Var.Z = new av(uwVar);
            uwVar.presentFragment(y40Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.b3) && ((i10 = twVar.f49904s) == 7 || i10 == 8)) {
            kg.k kVar = (kg.k) twVar.d.N.get(0);
            if (kVar != null && kVar.f54715a == 17) {
                tL_chatlists_chatlistUpdates = kVar.f17065i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                org.telegram.messenger.mo moVar = uwVar.getMessagesController().N[twVar.f49904s - 7];
                if (moVar != null) {
                    int i13 = moVar.f24237a;
                    ?? maVar = new org.telegram.ui.Components.ma(uwVar, false);
                    maVar.R1 = -1;
                    maVar.V1 = "";
                    maVar.W1 = new ArrayList();
                    maVar.Y1 = "";
                    maVar.f37846a2 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    maVar.f37847b2 = arrayList;
                    maVar.f37863s2 = -1;
                    maVar.f37866v2 = -5;
                    maVar.R1 = i13;
                    maVar.T1 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    maVar.Z1 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList arrayList2 = uwVar.getMessagesController().Q0;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i12 >= arrayList2.size()) {
                                break;
                            } else if (((org.telegram.messenger.mo) arrayList2.get(i12)).f24237a == i13) {
                                maVar.V1 = ((org.telegram.messenger.mo) arrayList2.get(i12)).f24238b;
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    maVar.f1();
                    uwVar.showDialog(maVar);
                    return;
                }
                return;
            }
        } else if (z10 && !uwVar.actionBar.v() && !uwVar.G3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.t2) view).Z1;
            org.telegram.messenger.g0.P.set(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), imageReceiver.A());
        }
        uwVar.z4(view, i3, twVar.d);
    }

    public static void h0(uw uwVar) {
        uwVar.presentFragment(new PrivacySettingsActivity());
        org.telegram.messenger.g0.k3(uwVar.parentLayout, "newChatsRow");
    }

    public static void i0(uw uwVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.hp.s1(uwVar.currentAccount).o1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(uwVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new y9(uwVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void j0(uw uwVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(launchActivity, uwVar.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(uwVar.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.f24011b;
        if (tL_attachMenuBots != null) {
            long j10 = b02.f24008a;
            b02.getMessagesStorage().f24934a.c(new org.telegram.messenger.yj(b02.f24019e, 2, j10, b02, tL_attachMenuBots));
        }
    }

    public static void j1(uw uwVar, boolean z10) {
        if (uwVar.f50230f0 != null && uwVar.N3 != z10) {
            uwVar.N3 = z10;
            int i3 = 0;
            while (true) {
                tw[] twVarArr = uwVar.f50230f0;
                if (i3 < twVarArr.length) {
                    if (z10) {
                        twVarArr[i3].f49897a.setScrollbarFadingEnabled(false);
                    }
                    uwVar.f50230f0[i3].f49897a.setVerticalScrollBarEnabled(z10);
                    if (z10) {
                        uwVar.f50230f0[i3].f49897a.setScrollbarFadingEnabled(true);
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public static void k0(uw uwVar) {
        org.telegram.messenger.hp.s1(uwVar.currentAccount).f22999e7.edit().putBoolean("storyhint", false).commit();
    }

    public static void l0(uw uwVar) {
        if (uwVar.f50212b4.g()) {
            org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, "USERPIC_SETUP");
            uwVar.g5();
        }
    }

    public static void n0(uw uwVar) {
        org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, "PREMIUM_GRACE");
        uwVar.g5();
    }

    public static void o0(uw uwVar) {
        org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, "SETUP_PASSKEY");
        uwVar.g5();
    }

    public static void p0(uw uwVar, org.telegram.ui.ActionBar.s1 s1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        try {
            s1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (tLObject != null) {
            uwVar.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            ci.e3 e3Var = new ci.e3(uwVar, j10, 25);
            Pattern pattern = org.telegram.ui.Components.t4.f38241a;
            if (uwVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = uwVar.getCurrentAccount();
                    Activity parentActivity = uwVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long e11 = org.telegram.messenger.h10.i(currentAccount).e();
                    TextView textView = new TextView(parentActivity);
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, null);
                    textView.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.bd.f21784a0) {
                        i3 = 5;
                    } else {
                        i3 = 3;
                    }
                    textView.setGravity(i3 | 48);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    alertDialog$Builder.o(frameLayout);
                    org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
                    u8Var.u(org.telegram.messenger.g0.L(12.0f));
                    org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(parentActivity);
                    k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                    if (org.telegram.messenger.bd.f21784a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    frameLayout.addView(k9Var, b8.mf.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(parentActivity);
                    org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.E8, null, 1, 20.0f);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    if (org.telegram.messenger.bd.f21784a0) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView2.setGravity(i11 | 16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setText(org.telegram.messenger.bd.M0(2131749253, null));
                    boolean z10 = org.telegram.messenger.bd.f21784a0;
                    if (z10) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    int i16 = i12 | 48;
                    if (z10) {
                        i13 = 21;
                    } else {
                        i13 = 76;
                    }
                    float f10 = i13;
                    if (z10) {
                        i14 = 76;
                    } else {
                        i14 = 21;
                    }
                    frameLayout.addView(textView2, b8.mf.d(-1, -2.0f, i16, f10, 11.0f, i14, 0.0f));
                    if (org.telegram.messenger.bd.f21784a0) {
                        i15 = 5;
                    } else {
                        i15 = 3;
                    }
                    frameLayout.addView(textView, b8.mf.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                    if (user != null) {
                        if (org.telegram.messenger.l10.z(user)) {
                            u8Var.f38691p = 0.8f;
                            u8Var.g(12);
                            k9Var.j(null, null, u8Var, user);
                        } else if (user.f27150id == e11) {
                            u8Var.f38691p = 0.8f;
                            u8Var.g(1);
                            k9Var.j(null, null, u8Var, user);
                        } else {
                            u8Var.f38691p = 1.0f;
                            u8Var.r(user);
                            k9Var.e(user, u8Var);
                        }
                    } else {
                        u8Var.q(chat);
                        k9Var.e(chat, u8Var);
                    }
                    textView.setText(org.telegram.messenger.g0.X2(str));
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131749273, null), new org.telegram.ui.Components.t(e3Var, 3));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    uwVar.showDialog(alertDialog$Builder.f27343a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.t4.e0(uwVar.currentAccount, tL_error, uwVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        uwVar.getNotificationCenter().k(org.telegram.messenger.hs.f23320v1, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public static void p4(wm wmVar, org.telegram.messenger.zi ziVar) {
        CharSequence charSequence;
        if (ziVar != null && ziVar.s2()) {
            try {
                if (!TextUtils.isEmpty(ziVar.f26924z)) {
                    charSequence = ziVar.f26924z;
                } else {
                    charSequence = ziVar.v;
                }
                CharSequence x12 = org.telegram.messenger.g0.x1(charSequence, ziVar.Y1, null);
                if (x12 instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) x12;
                    org.telegram.ui.Components.tz[] tzVarArr = (org.telegram.ui.Components.tz[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.tz.class);
                    if (tzVarArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(tzVarArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(tzVarArr[0]);
                        for (int i3 = 1; i3 < tzVarArr.length; i3++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(tzVarArr[i3]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(tzVarArr[i3]);
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
                        wmVar.Ob(ziVar.M1(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public static void q0(uw uwVar, int i3) {
        Object obj;
        TLRPC.User user;
        org.telegram.ui.Components.wl0 wl0Var = uwVar.D0.f34763r0;
        if (i3 >= wl0Var.f39769a0 && i3 < wl0Var.f39770b0) {
            org.telegram.ui.Components.r31 G = wl0Var.G(i3);
            if (G != null) {
                obj = G.G;
            } else {
                obj = null;
            }
        } else {
            obj = Boolean.FALSE;
        }
        if (obj instanceof TLRPC.User) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, uwVar.getParentActivity(), uwVar.resourceProvider);
            String M0 = org.telegram.messenger.bd.M0(2131754180, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131754179, "\"" + org.telegram.messenger.l10.p(user) + "\"");
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746329, null), new org.telegram.ui.Components.i41(10, uwVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        }
    }

    public static void r0(uw uwVar, int i3, ArrayList arrayList, boolean z10, HashSet hashSet) {
        HashSet hashSet2;
        if (i3 == 102) {
            uwVar.getMessagesController().f23122t0 = true;
            if (z10) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            uwVar.D4(arrayList, i3, false, false, hashSet2);
            org.telegram.messenger.hp messagesController = uwVar.getMessagesController();
            messagesController.f23122t0 = false;
            messagesController.getNotificationCenter().k(org.telegram.messenger.hs.f23298s, Boolean.TRUE);
            uwVar.getMessagesController().J(uwVar.X2);
            int i10 = uwVar.X2;
            if (i10 != 0 && uwVar.d4(uwVar.currentAccount, uwVar.f50230f0[0].f49904s, i10, false).size() == 0) {
                uwVar.f50230f0[0].f49897a.setEmptyView(null);
                uwVar.f50230f0[0].f49906x.setVisibility(4);
                uwVar.finishFragment();
                return;
            }
            return;
        }
        uwVar.D4(arrayList, i3, false, false, null);
    }

    public static void t0(uw uwVar, int i3, org.telegram.ui.Components.f60 f60Var) {
        CharSequence charSequence;
        if (uwVar.currentAccount != i3) {
            f60Var.u();
            if (uwVar.getParentActivity() == null) {
                return;
            }
            nw nwVar = uwVar.D2;
            LaunchActivity launchActivity = (LaunchActivity) uwVar.getParentActivity();
            ArrayList arrayList = uwVar.E2;
            String str = uwVar.F2;
            CharSequence charSequence2 = uwVar.G2;
            gv gvVar = uwVar.C1;
            if (gvVar != null) {
                charSequence = gvVar.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.O0(i3);
            uw uwVar2 = new uw(uwVar.arguments);
            uwVar2.D2 = nwVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    uwVar2.E2 = null;
                } else {
                    uwVar2.E2 = arrayList;
                    uwVar2.F2 = null;
                    uwVar2.N2 = false;
                    if (uwVar2.C1 != null) {
                        uwVar2.v3(charSequence);
                    } else {
                        uwVar2.V3 = charSequence;
                    }
                }
            } else if (str != null) {
                uwVar2.Q4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    uwVar2.G2 = null;
                } else {
                    uwVar2.G2 = charSequence2;
                    uwVar2.F2 = null;
                    uwVar2.E2 = null;
                    if (uwVar2.C1 != null) {
                        uwVar2.v3(charSequence);
                    } else {
                        uwVar2.V3 = charSequence;
                    }
                }
            }
            launchActivity.u0(uwVar2, false, true);
        }
    }

    public static void u0(uw uwVar) {
        String str;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(uwVar.currentAccount);
        if (uwVar.B3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        s12.k4(0L, str);
        uwVar.g5();
    }

    public static void u1(uw uwVar, tw twVar, float f10) {
        if (uwVar.U != f10) {
            uwVar.U = f10;
            int i3 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            int i10 = 0;
            if (i3 == 0) {
                uwVar.V = false;
            }
            uwVar.F0.setOverscroll(f10);
            twVar.f49897a.setViewsOffset(f10);
            pw pwVar = twVar.f49897a;
            if (i3 != 0) {
                i10 = 2;
            }
            pwVar.setOverScrollMode(i10);
            uwVar.fragmentView.invalidate();
            if (f10 > org.telegram.messenger.g0.L(90.0f) && !uwVar.V) {
                mv mvVar = uwVar.F0;
                ValueAnimator valueAnimator = mvVar.I0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    mvVar.i(mvVar.f10843q0, true);
                    uwVar.V = true;
                    uwVar.getOrCreateStoryViewer().G(new au(uwVar, 4));
                }
            }
        }
    }

    public static void u4(org.telegram.messenger.c cVar) {
        int i3 = cVar.f21919a;
        boolean[] zArr = f50200z4;
        if (!zArr[i3]) {
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
            s12.X2();
            s12.U2(0, 0, 100, true, null);
            if (s12.f23113s.isEmpty() && !TextUtils.isEmpty(s12.S3)) {
                TLRPC.TL_help_getRecentMeUrls tL_help_getRecentMeUrls = new TLRPC.TL_help_getRecentMeUrls();
                tL_help_getRecentMeUrls.referer = s12.S3;
                s12.getConnectionsManager().sendRequest(tL_help_getRecentMeUrls, new org.telegram.messenger.ij(s12, 4));
            }
            s12.g3(org.telegram.messenger.h10.i(i3).f(), false, 0);
            org.telegram.messenger.g5.r(i3).f();
            org.telegram.messenger.li.b0(i3).u(false);
            org.telegram.messenger.g0.i3(new xg(cVar, 18), 200L);
            Iterator it = s12.f22986d4.iterator();
            while (it.hasNext()) {
                org.telegram.messenger.li.b0(i3).c1((String) it.next(), true, true);
            }
            zArr[i3] = true;
        }
    }

    public static void v0(uw uwVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.G0(launchActivity, uwVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            rc1.a(uwVar.getParentActivity(), new z(uwVar, tL_attachMenuBot, launchActivity, 7), null);
        }
    }

    public static boolean v1(uw uwVar, tw twVar) {
        if (!uwVar.G3.c()) {
            int i3 = (int) (-uwVar.O);
            int f42 = uwVar.f4();
            int g42 = uwVar.g4();
            if (i3 != 0 && i3 != f42 && i3 != g42 && twVar.f49897a.canScrollVertically(-1)) {
                if (g42 < i3 && i3 < f42) {
                    int L = org.telegram.messenger.g0.L(48.0f);
                    int i10 = i3 - g42;
                    if (i10 < L / 2) {
                        twVar.f49898b.y(-i10);
                        return true;
                    }
                    twVar.f49898b.y(L - i10);
                    return true;
                }
                float f10 = 1.0f;
                if (uwVar.f50311v3 != 1.0f) {
                    f10 = Utilities.i((-uwVar.O) / org.telegram.messenger.g0.L(81.0f), 1.0f, 0.0f);
                }
                if (f10 < uwVar.F0.C0) {
                    twVar.f49898b.y(-i3);
                    return true;
                }
                twVar.f49898b.y(g42 - i3);
                return true;
            }
            return false;
        }
        return false;
    }

    public static void w0(uw uwVar) {
        b.c(uwVar.currentAccount, uwVar.getParentActivity(), uwVar.getResourceProvider());
    }

    public static String w2(uw uwVar) {
        String s6;
        ArrayList arrayList = uwVar.J2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() < 3) {
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                long longValue = ((Long) obj).longValue();
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                if (longValue == uwVar.getUserConfig().e()) {
                    sb2.append(org.telegram.messenger.bd.M0(2131745911, null));
                } else {
                    if (arrayList.size() == 1) {
                        s6 = org.telegram.messenger.m5.l(uwVar.currentAccount, longValue);
                    } else {
                        s6 = org.telegram.messenger.m5.s(uwVar.currentAccount, longValue);
                    }
                    sb2.append(s6);
                }
            }
            return org.telegram.messenger.bd.a0(null, null, 2131745449, sb2.toString());
        }
        return org.telegram.messenger.bd.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public static void x0(final int i3, final long j10, TLRPC.Chat chat, final uw uwVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        uwVar.n4(false);
        if (i3 == 103 && org.telegram.messenger.t3.T(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || org.telegram.messenger.t3.t0(chat2)) {
                uwVar.getMessagesController().X(2, j10, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i3 == 102 && (i13 = uwVar.X2) != 0 && uwVar.d4(uwVar.currentAccount, uwVar.f50230f0[0].f49904s, i13, false).size() == 1) {
            uwVar.f50230f0[0].f49906x.setVisibility(4);
        }
        int i14 = -1;
        if (i3 == 102) {
            uwVar.M4(true, true);
            if (uwVar.S1 != null) {
                i12 = 0;
                while (i12 < uwVar.S1.size()) {
                    if (((TLRPC.Dialog) uwVar.S1.get(i12)).f27005id == j10) {
                        break;
                    }
                    i12++;
                }
            }
            i12 = -1;
            uwVar.z3();
            i10 = i12;
        } else {
            i10 = -1;
        }
        UndoView k42 = uwVar.k4();
        if (k42 != null) {
            if (i3 == 103) {
                i11 = 0;
            } else if (z11) {
                i11 = 1;
            } else {
                i11 = 95;
            }
            k42.j(i11, j10, new Runnable() {
                @Override
                public final void run() {
                    uwVar.C4(i3, j10, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(uwVar.d4(uwVar.currentAccount, uwVar.f50230f0[0].f49904s, uwVar.X2, false));
        int i15 = 0;
        while (true) {
            if (i15 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i15)).f27005id == j10) {
                i14 = i15;
                break;
            } else {
                i15++;
            }
        }
        if (i3 == 102) {
            if (i10 >= 0 && i14 < 0 && (arrayList = uwVar.S1) != null) {
                arrayList.remove(i10);
                uwVar.f50230f0[0].f49907y.D();
                uwVar.f50230f0[0].q(true);
                return;
            }
            uwVar.M4(false, true);
        }
    }

    public static void y0(uw uwVar) {
        org.telegram.messenger.v1 a10 = org.telegram.messenger.v1.a(uwVar.currentAccount);
        int i3 = a10.f25814a;
        Set<String> set = a10.d;
        org.telegram.messenger.t1 t1Var = a10.f25816c;
        if (t1Var != null && !set.contains(t1Var.f25473a)) {
            set.add(a10.f25816c.f25473a);
            SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(i3).f22999e7.edit();
            edit.putStringSet("bday_hidden", set);
            edit.apply();
            org.telegram.messenger.hs.f(i3).k(org.telegram.messenger.hs.f23236g5, new Object[0]);
        }
        org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, "BIRTHDAY_CONTACTS_TODAY");
        uwVar.g5();
        org.telegram.ui.Components.ac G = org.telegram.ui.Components.fc.a0(uwVar).G(2131624033, 4, org.telegram.messenger.bd.M0(2131753330, null));
        G.f31792j = 5000;
        G.j();
    }

    public static void z0(uw uwVar) {
        org.telegram.messenger.hp.s1(uwVar.currentAccount).k4(0L, "PREMIUM_RESTORE");
        uwVar.g5();
    }

    public final boolean A3(long j10) {
        int i3;
        int i10 = this.S0;
        if (i10 != 15 && i10 != 16 && this.f50247i2 == null && this.f50300t2) {
            if (org.telegram.messenger.m5.z(j10)) {
                long j11 = -j10;
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j11));
                if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                    if (!this.f50289r2) {
                        TLRPC.Chat M02 = org.telegram.messenger.hp.s1(this.currentAccount).M0(Long.valueOf(j11));
                        if ((org.telegram.messenger.t3.n(M02) || M02.megagroup) && (i3 = this.U0) != 2 && i3 != 3) {
                            return true;
                        }
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M03 = org.telegram.messenger.bd.M0(2131745606, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = M03;
                    int i11 = this.U0;
                    if (i11 == 3) {
                        s1Var.U = org.telegram.messenger.bd.M0(2131744101, null);
                    } else if (i11 == 2) {
                        s1Var.U = org.telegram.messenger.bd.M0(2131746595, null);
                    } else {
                        s1Var.U = org.telegram.messenger.bd.M0(2131752440, null);
                    }
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747839, null), null);
                    showDialog(s1Var);
                    return false;
                }
                return true;
            } else if (org.telegram.messenger.m5.C(j10)) {
                if (this.U0 != 0 || this.V0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String M04 = org.telegram.messenger.bd.M0(2131745606, null);
                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                    s1Var2.S = M04;
                    int i12 = this.U0;
                    if (i12 == 3) {
                        s1Var2.U = org.telegram.messenger.bd.M0(2131744100, null);
                    } else if (i12 != 0) {
                        s1Var2.U = org.telegram.messenger.bd.M0(2131747184, null);
                    } else {
                        s1Var2.U = org.telegram.messenger.bd.M0(2131749112, null);
                    }
                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131747839, null), null);
                    showDialog(s1Var2);
                    return false;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public final boolean A4(View view, int i3, float f10, org.telegram.ui.Components.sj0 sj0Var) {
        org.telegram.ui.Components.bm0 bm0Var;
        long j10;
        org.telegram.ui.Components.bm0 bm0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long F;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.b3) && sj0Var.d(i3) != 21) {
            if (!this.actionBar.v() && !org.telegram.messenger.g0.Q1() && !this.f50263m2 && (view instanceof org.telegram.ui.Cells.t2)) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                if (!getMessagesController().t2(t2Var.getDialogId()) && !this.G3.c() && t2Var.Z(f10)) {
                    return T4(t2Var);
                }
            }
            pv pvVar = this.G3;
            if (pvVar == null || !pvVar.c()) {
                cw cwVar = this.D0;
                boolean z10 = true;
                if (cwVar != null && sj0Var == (bm0Var2 = cwVar.f34751e0)) {
                    Object I = bm0Var2.I(i3);
                    if (!this.D0.f34751e0.O) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String M0 = org.telegram.messenger.bd.M0(2131752054, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.S = M0;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                s1Var.U = org.telegram.messenger.bd.a0("ClearSearchSingleChatAlertText", null, 2131752053, rg.c.i(this.currentAccount, chat, false));
                            } else {
                                s1Var.U = org.telegram.messenger.bd.a0("ClearSearchSingleChatAlertText", null, 2131752053, chat.title);
                            }
                            F = -chat.f27001id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.f27150id == getUserConfig().f22848n) {
                                s1Var.U = org.telegram.messenger.bd.a0("ClearSearchSingleChatAlertText", null, 2131752053, org.telegram.messenger.bd.M0(2131745911, null));
                            } else {
                                s1Var.U = org.telegram.messenger.bd.a0("ClearSearchSingleUserAlertText", null, 2131752051, org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                            }
                            F = user.f27150id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            s1Var.U = org.telegram.messenger.bd.a0("ClearSearchSingleUserAlertText", null, 2131752051, org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                            F = org.telegram.messenger.m5.F(encryptedChat.f27009id);
                        }
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752055, null), new ei.c1(this, F, 8));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        showDialog(s1Var);
                        TextView textView = (TextView) s1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, getResourceProvider());
                        }
                        return true;
                    }
                }
                cw cwVar2 = this.D0;
                if (cwVar2 != null && sj0Var == (bm0Var = cwVar2.f34751e0)) {
                    if (this.f50263m2) {
                        z4(view, i3, sj0Var);
                        return false;
                    }
                    if ((view instanceof org.telegram.ui.Cells.f6) && !bm0Var.N(i3)) {
                        j10 = ((org.telegram.ui.Cells.f6) view).getDialogId();
                    } else {
                        j10 = 0;
                    }
                    if (j10 != 0) {
                        Y4(j10, view);
                        return true;
                    }
                } else {
                    Object J = ((kg.m) sj0Var).J(i3);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.f50263m2) {
                            if ((this.S0 == 3 || U3()) && v5(dialog.f27005id)) {
                                if (this.S0 == 1 && U3() && this.f50269n2 && getMessagesController().t2(dialog.f27005id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f27005id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.S0 != 1) {
                                        z10 = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z10);
                                    bundle.putBoolean("quote", this.P0);
                                    bundle.putBoolean("reply_to", this.O0);
                                    m91 m91Var = new m91(bundle);
                                    m91Var.M0 = this;
                                    presentFragment(m91Var);
                                    return false;
                                }
                                s3(dialog.f27005id, view);
                                o5();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            y4(view);
                            return false;
                        } else if (!this.actionBar.v() || !s4(dialog)) {
                            Y4(dialog.f27005id, view);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final si.f B() {
        return this.f50265m4;
    }

    public final void B3(boolean z10) {
        ki.j jVar;
        TLRPC.ChatFull chatFull;
        boolean z11;
        org.telegram.ui.Components.pr prVar = this.K1;
        if (prVar != null && (jVar = this.R1) != null && (chatFull = this.f50211b3) != null) {
            if (this.Z2 != 0 && chatFull.requests_pending > 0 && !this.f50207b.f53841f) {
                z11 = true;
            } else {
                z11 = false;
            }
            prVar.i(jVar, z11, z10);
            this.R1.setTitle(org.telegram.messenger.bd.G(this.f50211b3.requests_pending, "CommunityPendingRequestsRow", new Object[0]));
        }
    }

    public final void B4(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i3 = 0; i3 < 4; i3++) {
            if (org.telegram.messenger.h10.i(i3).p()) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.d80(12));
        org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(this, view);
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
                    z10 = true;
                } else {
                    z10 = false;
                }
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                int i11 = org.telegram.ui.ActionBar.k6.f27972i6;
                Drawable a02 = org.telegram.ui.ActionBar.k6.a0(getThemedColor(i11), 0, 0);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
                org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.r6.k(linearLayout, a02, null, N, resourceProvider);
                TLRPC.User f10 = org.telegram.messenger.h10.i(intValue).f();
                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
                u8Var.r(f10);
                gi.q3 q3Var = new gi.q3(this, getParentActivity(), z10);
                linearLayout.addView(q3Var, b8.mf.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getParentActivity());
                if (z10) {
                    k9Var.setScaleX(0.833f);
                    k9Var.setScaleY(0.833f);
                }
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
                k9Var.getImageReceiver().d = intValue;
                k9Var.e(f10, u8Var);
                q3Var.addView(k9Var, b8.mf.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, getResourceProvider());
                textView.setText(org.telegram.messenger.l10.p(f10));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, b8.mf.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new ai.h3(this, intValue, H, 16));
                H.r(linearLayout, b8.mf.o(230, 48));
            }
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(24.0f), getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, -16777216));
        H.f33753z.set(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        H.W(d02);
        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
        H.V(5);
        H.Z();
    }

    public final void C3(org.telegram.ui.tw r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.C3(org.telegram.ui.tw):void");
    }

    public final void C4(int i3, long j10, TLRPC.Chat chat, boolean z10, boolean z11) {
        if (i3 == 103) {
            getMessagesController().X(1, j10, z11);
            return;
        }
        if (chat != null) {
            if (org.telegram.messenger.t3.r0(chat)) {
                getMessagesController().X(0, j10, z11);
            } else {
                getMessagesController().g0(-j10, getMessagesController().a2(Long.valueOf(getUserConfig().e())), null, z11, false);
            }
        } else {
            getMessagesController().X(0, j10, z11);
            if (z10 && z11) {
                getMessagesController().w(j10);
            }
        }
        if (org.telegram.messenger.g0.Q1()) {
            getNotificationCenter().k(org.telegram.messenger.hs.f23305t, Long.valueOf(j10));
        }
        getMessagesController().J(this.X2);
    }

    public final void D3() {
        getMessagesStorage().getClass();
    }

    public final void D4(java.util.ArrayList r40, int r41, boolean r42, boolean r43, java.util.HashSet r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.D4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    @Override
    public final List E() {
        return Arrays.asList(new qg.a(org.telegram.messenger.bd.M0(2131751649, null)), new qg.a(org.telegram.messenger.bd.M0(2131752076, null), new au(this, 14)), new qg.a(org.telegram.messenger.bd.M0(2131751650, null), new au(this, 15)));
    }

    public final void E3() {
        if (this.f50230f0 != null) {
            int w32 = w3();
            int i3 = 0;
            while (true) {
                tw[] twVarArr = this.f50230f0;
                if (i3 < twVarArr.length) {
                    tw twVar = twVarArr[i3];
                    if (twVar != null) {
                        pw pwVar = twVar.f49897a;
                        pwVar.setPadding(0, pwVar.f39972g3, 0, w32);
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void E4(long r14, boolean r16, org.telegram.messenger.mo r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.E4(long, boolean, org.telegram.messenger.mo, int, boolean):void");
    }

    @Override
    public final void F(float f10, int i3) {
        org.telegram.ui.ActionBar.q0 q0Var;
        if (i3 == 3 && (q0Var = this.m0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) q0Var.getIconView().getDrawable();
            if (this.d.f53841f) {
                animatedVectorDrawable.start();
                if (org.telegram.messenger.az.o() != 0) {
                    TLRPC.TL_help_premiumPromo tL_help_premiumPromo = org.telegram.messenger.li.b0(this.currentAccount).E;
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
                            org.telegram.messenger.w7.G(this.currentAccount).X(tL_help_premiumPromo.videos.get(i10), tL_help_premiumPromo, 3, 0);
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
        kh.f fVar = this.f50331z1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.f50331z1.getInputBubbleHeight() + this.f50313w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f));
        }
    }

    public final void F4() {
        if (this.L0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.L0.setBackground(new BitmapDrawable(createBitmap));
        this.L0.setAlpha(0.0f);
        this.L0.setVisibility(0);
        N3();
    }

    public final void G3() {
        int i3;
        tw twVar;
        boolean z10 = true;
        float e42 = e4(true);
        jw jwVar = this.A0;
        if (jwVar != null) {
            if (jwVar.getAlpha() == e42) {
                z10 = false;
            }
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, e42);
            this.A0.setAlpha(e42);
            this.A0.setScaleX(T1);
            this.A0.setScaleY(T1);
            jw jwVar2 = this.A0;
            if (e42 > 0.0f) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            jwVar2.setVisibility(i3);
            if (z10 && (twVar = this.f50230f0[0]) != null) {
                twVar.f49897a.requestLayout();
            }
        }
        e5();
    }

    public final void G4(tw twVar) {
        int i3;
        org.telegram.ui.Components.iz izVar;
        if (twVar.getVisibility() != 0) {
            return;
        }
        int i10 = twVar.d.f17095w;
        if (twVar.f49904s == 0 && l4() && twVar.f49897a.getChildCount() == 0 && twVar.f49905w == 2) {
            ((u4.b0) twVar.f49897a.getLayoutManager()).h1(1, (int) this.O);
        }
        twVar.d.getClass();
        twVar.d.V();
        int b10 = twVar.d.b();
        if (b10 == 1 && i10 == 1 && twVar.d.d(0) == 5) {
            twVar.q(true);
        } else {
            twVar.q(false);
            if (b10 > i10 && (i3 = this.S0) != 11 && i3 != 12 && i3 != 13) {
                twVar.E.b(i10);
            }
        }
        try {
            pw pwVar = twVar.f49897a;
            if (this.X2 == 0 && this.Z2 == 0) {
                izVar = twVar.f49906x;
            } else {
                izVar = null;
            }
            pwVar.setEmptyView(izVar);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        C3(twVar);
    }

    public final void H3() {
        int i3;
        int i10;
        float f10 = this.f50266n.f53840e;
        float T1 = org.telegram.messenger.g0.T1(0.2f, 1.0f, f10);
        mi.x1 x1Var = this.D1;
        int i11 = 8;
        if (x1Var != null) {
            x1Var.setScaleX(T1);
            this.D1.setScaleY(T1);
            this.D1.setAlpha(f10);
            mi.x1 x1Var2 = this.D1;
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            x1Var2.setVisibility(i10);
        }
        kh.f fVar = this.f50331z1;
        if (fVar != null) {
            fVar.setAlpha(f10);
            kh.f fVar2 = this.f50331z1;
            int i12 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i12 > 0) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            fVar2.setVisibility(i3);
            this.f50331z1.getFadeView().setAlpha(f10);
            View fadeView = this.f50331z1.getFadeView();
            if (i12 > 0) {
                i11 = 0;
            }
            fadeView.setVisibility(i11);
        }
    }

    public final void H4() {
        boolean z10;
        float f10 = 0.0f;
        if (this.O != 0.0f && !(z10 = this.L)) {
            if (z10) {
                f10 = -g4();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.H3, f10));
            animatorSet.setInterpolator(org.telegram.ui.Components.xq.f40452f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    public final void I3() {
        if (this.actionBar == null) {
            return;
        }
        org.telegram.ui.Components.l00.d(this.actionBar.getBackButton(), Math.max(this.f50311v3, (1.0f - this.f50207b.f53840e) * (1.0f - h4()) * (1.0f - this.f50213c.f53840e)));
    }

    public final void I4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.I4(int):void");
    }

    public final void J3() {
        float f10;
        if (this.f50249j0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.l00.d(this.f50240h0, com.google.android.recaptcha.internal.a.C(f10, 1.0f - this.f50207b.f53840e, 1.0f - h4(), 1.0f - this.f50213c.f53840e));
    }

    public final void J4(boolean z10, boolean z11) {
        int i3;
        int i10;
        pv pvVar = this.G3;
        if (pvVar != null && pvVar.c()) {
            return;
        }
        if (this.f50230f0[0].f49904s == 0 && l4() && this.f50230f0[0].f49905w == 2) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (this.L && !z11 && !this.F0.g()) {
            i10 = -org.telegram.messenger.g0.L(81.0f);
        } else {
            i10 = 0;
        }
        if (z10) {
            org.telegram.ui.Components.vi0 vi0Var = this.f50230f0[0].f49903r;
            vi0Var.f39126b = 1;
            vi0Var.d(i3, i10, false, false);
            H4();
            return;
        }
        this.f50230f0[0].f49899c.h1(i3, i10);
        H4();
    }

    public final void K3() {
        float f10;
        if (org.telegram.messenger.az.f21661s.isEmpty()) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.l00.d(this.f50235g0, com.google.android.recaptcha.internal.a.C(f10, 1.0f - this.f50207b.f53840e, 1.0f - h4(), 1.0f - this.f50213c.f53840e));
    }

    public final void K4(String str, boolean z10) {
        a5(true, false, true, false);
        cg.o0 o0Var = this.Z;
        if (o0Var != null) {
            o0Var.b(true);
        }
        iw iwVar = this.Y;
        if (iwVar != null) {
            iwVar.f36302r.setText(str);
            this.Y.f36302r.setSelection(str.length());
        }
    }

    public final void L3() {
        float f10;
        if (this.S0 != 2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.l00.d(this.f50254k0, com.google.android.recaptcha.internal.a.C(f10, this.f50229f.f53840e, 1.0f - h4(), 1.0f - this.f50213c.f53840e));
        mv mvVar = this.F0;
        if (mvVar != null) {
            mvVar.invalidate();
        }
    }

    public final void L4(float f10) {
        tw[] twVarArr;
        this.f50218d0 = f10;
        for (tw twVar : this.f50230f0) {
            pw pwVar = twVar.f49897a;
            for (int i3 = 0; i3 < pwVar.getChildCount(); i3++) {
                View childAt = pwVar.getChildAt(i3);
                if (childAt != null && RecyclerView.R(childAt) >= twVar.d.f17091f + 1) {
                    childAt.setAlpha(f10);
                }
            }
        }
    }

    public final void M3() {
        org.telegram.ui.Components.l00.d(this.m0, com.google.android.recaptcha.internal.a.C(this.f50207b.f53840e, 1.0f - h4(), 1.0f - this.f50213c.f53840e, this.d.f53840e));
    }

    public final void M4(boolean z10, boolean z11) {
        if (this.f50230f0 != null && this.T1 != z10) {
            if (z10) {
                this.S1 = new ArrayList(d4(this.currentAccount, this.f50230f0[0].f49904s, this.X2, false));
            } else {
                this.S1 = null;
            }
            this.T1 = z10;
            tw twVar = this.f50230f0[0];
            twVar.d.H = z10;
            if (!z10 && z11) {
                if (twVar.f49897a.c0()) {
                    this.f50230f0[0].f49897a.post(new au(this, 25));
                } else {
                    this.f50230f0[0].d.f();
                }
            }
        }
    }

    public final void N3() {
        boolean z10;
        org.telegram.ui.Components.voip.r0 r0Var;
        if (!this.f50255k2 && ((r0Var = this.L0) == null || r0Var.getBackground() == null || this.L0.getAlpha() < 0.01f || this.L0.getVisibility() == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        f fVar = this.J3;
        if (fVar != null) {
            ((ee0) fVar.f45115b).f44971w.a(z10, true);
        }
    }

    public final void N4(boolean z10) {
        tw twVar;
        if (org.telegram.messenger.az.o() > 1 && org.telegram.messenger.lc.e(32768)) {
            if (z10) {
                tw[] twVarArr = this.f50230f0;
                if (twVarArr != null && (twVar = twVarArr[0]) != null) {
                    twVar.setLayerType(2, null);
                    this.f50230f0[0].setClipChildren(false);
                    this.f50230f0[0].setClipToPadding(false);
                    this.f50230f0[0].f49897a.setClipChildren(false);
                }
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.setLayerType(2, null);
                }
                View view = this.fragmentView;
                if (view != null) {
                    ((ViewGroup) view).setClipChildren(false);
                    this.fragmentView.requestLayout();
                    return;
                }
                return;
            }
            if (this.f50230f0 != null) {
                int i3 = 0;
                while (true) {
                    tw[] twVarArr2 = this.f50230f0;
                    if (i3 >= twVarArr2.length) {
                        break;
                    }
                    tw twVar2 = twVarArr2[i3];
                    if (twVar2 != null) {
                        twVar2.setLayerType(0, null);
                        twVar2.setClipChildren(true);
                        twVar2.setClipToPadding(true);
                        twVar2.f49897a.setClipChildren(true);
                    }
                    i3++;
                }
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setLayerType(0, null);
            }
            mv mvVar = this.F0;
            if (mvVar != null) {
                mvVar.setLayerType(0, null);
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
        org.telegram.ui.Components.l00.d(this.f50258l0, (1.0f - this.f50207b.f53840e) * (1.0f - h4()) * (1.0f - this.f50213c.f53840e));
        J3();
        M3();
        K3();
        L3();
    }

    public final void O4(float f10) {
        tw[] twVarArr = this.f50230f0;
        int i3 = 0;
        if (twVarArr != null) {
            int paddingTop = twVarArr[0].f49897a.getPaddingTop() + ((int) f10);
            int i10 = 0;
            while (true) {
                tw[] twVarArr2 = this.f50230f0;
                if (i10 >= twVarArr2.length) {
                    break;
                }
                twVarArr2[i10].f49897a.setTopGlowOffset(paddingTop);
                i10++;
            }
        }
        if (this.fragmentView != null && f10 != this.O) {
            this.O = f10;
            org.telegram.ui.Components.ac acVar = this.f50279p3;
            if (acVar != null) {
                acVar.l();
            }
            if (this.F3 != null) {
                float currentActionBarHeight = 1.0f - ((-f10) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                org.telegram.ui.Cells.o oVar = this.F3;
                float f11 = (int) f10;
                float f12 = oVar.f29721f;
                oVar.h = f11;
                oVar.setTranslationY(f12 + f11);
                this.F3.setAlpha(b8.be.a(currentActionBarHeight, 0.0f, 1.0f));
                org.telegram.ui.Cells.o oVar2 = this.F3;
                if (currentActionBarHeight <= 0.0f) {
                    i3 = 4;
                }
                oVar2.setVisibility(i3);
            }
            Q3();
            this.fragmentView.invalidate();
        }
    }

    public final void P3() {
        int i3;
        if (h4() > 0.5f) {
            i3 = 2131745716;
        } else {
            i3 = 2131745823;
        }
        String M0 = org.telegram.messenger.bd.M0(i3, null);
        this.Y.f36302r.setContentDescription(M0);
        this.Y.f36302r.setHint(M0);
    }

    public final void P4(float f10) {
        this.f50327y1 = f10;
        n5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (org.telegram.messenger.az.o() != 0) {
            org.telegram.messenger.lc.e(32768);
        }
        e5();
    }

    public final void Q3() {
        float f10;
        int i3;
        if (this.Y == null) {
            return;
        }
        float a10 = 1.0f - b8.be.a(((-this.O) - g4()) / org.telegram.messenger.g0.L(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.f50311v3, this.h.f53840e);
        float f11 = this.f50207b.f53840e;
        if (this.S0 != 2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float max2 = f10 * (1.0f - this.f50213c.f53840e) * (1.0f - max) * Math.max(f11, (1.0f - h4()) * a10);
        this.Y.setAlpha(max2);
        iw iwVar = this.Y;
        boolean z10 = false;
        if (max2 > 0.0f) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        iwVar.setVisibility(i3);
        if (max2 <= 0.01f) {
            z10 = true;
        }
        this.f50229f.a(z10, true);
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
        int i3;
        float f10;
        int i10;
        int i11 = 8;
        if (this.f50202a0 != null) {
            if (this.f50208b0 != null) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float f11 = f10 * this.f50207b.f53840e;
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, f11);
            this.f50202a0.setScaleX(T1);
            this.f50202a0.setScaleY(T1);
            this.f50202a0.setAlpha(f11);
            sy0 sy0Var = this.f50202a0;
            if (f11 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            sy0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.m61 m61Var = this.f50208b0;
        qe.a aVar = this.f50292s;
        if (m61Var != null) {
            float f12 = 1.0f - aVar.f53840e;
            m61Var.setAlpha(f12);
            org.telegram.ui.Components.m61 m61Var2 = this.f50208b0;
            if (f12 > 0.0f) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            m61Var2.setVisibility(i3);
        }
        kg.n0 n0Var = this.f50214c0;
        if (n0Var != null) {
            float f13 = aVar.f53840e;
            n0Var.setAlpha(f13);
            kg.n0 n0Var2 = this.f50214c0;
            if (f13 > 0.0f) {
                i11 = 0;
            }
            n0Var2.setVisibility(i11);
        }
    }

    public final void R4(float f10) {
        if (org.telegram.messenger.az.o() <= 0) {
            boolean z10 = org.telegram.messenger.r2.f25040a;
        } else if (this.X3 != f10) {
            boolean z11 = true;
            if (org.telegram.messenger.az.o() > 1 && org.telegram.messenger.lc.e(32768)) {
                z11 = false;
            }
            this.Y3 = z11;
            this.X3 = f10;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.Y3) {
                float f11 = (1.0f - this.X3) * (-org.telegram.messenger.g0.L(40.0f));
                mv mvVar = this.F0;
                if (mvVar != null) {
                    mvVar.setTranslationX(f11);
                }
                iw iwVar = this.Y;
                if (iwVar != null) {
                    iwVar.setTranslationX(f11);
                }
                pv pvVar = this.G3;
                if (pvVar != null && pvVar.getFragmentView() != null && !this.E) {
                    this.G3.getFragmentView().setTranslationX(f11);
                    return;
                }
                return;
            }
            float f12 = 1.0f - this.X3;
            float f13 = (-org.telegram.messenger.g0.L(4.0f)) * f12;
            float f14 = 1.0f - (f12 * 0.05f);
            mv mvVar2 = this.F0;
            if (mvVar2 != null) {
                mvVar2.setScaleX(f14);
                this.F0.setScaleY(f14);
                this.F0.setTranslationX(f13);
                this.F0.setPivotX(0.0f);
                this.F0.setPivotY(0.0f);
            }
            iw iwVar2 = this.Y;
            if (iwVar2 != null) {
                iwVar2.setTranslationX(f13);
                this.Y.setScaleX(f14);
                this.Y.setScaleY(f14);
            }
            pv pvVar2 = this.G3;
            if (pvVar2 != null && pvVar2.getFragmentView() != null) {
                if (!this.E) {
                    this.G3.getFragmentView().setScaleX(f14);
                    this.G3.getFragmentView().setScaleY(f14);
                    this.G3.getFragmentView().setTranslationX(f13);
                }
                this.G3.getFragmentView().setPivotX(0.0f);
                this.G3.getFragmentView().setPivotY(0.0f);
            }
        }
    }

    public final void S3(boolean z10) {
        int i3;
        int i10;
        if (this.D0 != null && this.actionBar != null) {
            int i11 = org.telegram.messenger.g0.f22603n;
            int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(this.f50201a);
            if (this.f50208b0 != null) {
                i3 = org.telegram.messenger.g0.L(50.0f);
            } else {
                i3 = 0;
            }
            int i12 = measuredHeight + i3;
            org.telegram.ui.Components.pr prVar = this.K1;
            if (prVar != null) {
                i10 = (int) prVar.c(org.telegram.messenger.g0.L(7.0f));
            } else {
                i10 = 0;
            }
            int i13 = i12 + i10;
            cw cwVar = this.D0;
            SparseArray sparseArray = cwVar.h;
            cwVar.X0 = i13;
            cwVar.Y0 = i11;
            ci.j1 j1Var = cwVar.f34748b0;
            if (z10) {
                j1Var.q1(0, i13, 0, i11);
            } else {
                j1Var.setPadding(0, i13, 0, i11);
            }
            cwVar.P0.j(cwVar.X0, cwVar.Y0, z10);
            org.telegram.ui.Components.vl0 vl0Var = cwVar.f34749c0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vl0Var.getLayoutParams();
            int i14 = marginLayoutParams.topMargin;
            int i15 = cwVar.X0;
            if (i14 != i15 || marginLayoutParams.bottomMargin != cwVar.Y0) {
                marginLayoutParams.topMargin = i15;
                marginLayoutParams.bottomMargin = cwVar.Y0;
                vl0Var.requestLayout();
            }
            org.telegram.ui.Components.im0.Q(cwVar.f34755i0, cwVar.f34758l0, cwVar.X0, cwVar.Y0, z10);
            org.telegram.ui.Components.im0.Q(cwVar.f34759n0, cwVar.f34762q0, cwVar.X0, cwVar.Y0, z10);
            org.telegram.ui.Components.im0.Q(cwVar.f34766u0, cwVar.f34769x0, cwVar.X0, cwVar.Y0, z10);
            org.telegram.ui.Components.bf0 bf0Var = cwVar.f34764s0;
            int i16 = cwVar.X0;
            int i17 = cwVar.Y0;
            bf0Var.setClipToPadding(false);
            org.telegram.ui.Components.l41 l41Var = bf0Var.f32170c;
            bf0Var.K = z10;
            bf0Var.setPadding(0, i16, 0, i17);
            if (z10) {
                l41Var.q1(0, i16, 0, i17);
            } else {
                l41Var.setPadding(0, i16, 0, i17);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) l41Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i16;
            marginLayoutParams2.bottomMargin = -i17;
            bf0Var.K = false;
            org.telegram.ui.Components.hl0 hl0Var = cwVar.J0;
            if (hl0Var != null) {
                hl0Var.b(cwVar.X0, cwVar.Y0, z10);
            }
            int size = sparseArray.size();
            for (int i18 = 0; i18 < size; i18++) {
                View view = (View) sparseArray.valueAt(i18);
                if (view instanceof wz) {
                    ((wz) view).j(cwVar.X0, cwVar.Y0, z10);
                }
            }
            for (int i19 = 0; i19 < cwVar.getChildCount(); i19++) {
                if (cwVar.getChildAt(i19) instanceof wz) {
                    ((wz) cwVar.getChildAt(i19)).j(cwVar.X0, cwVar.Y0, z10);
                }
            }
        }
    }

    public final void S4() {
        getContactsController().B();
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.p11(17, this, r1), new xg(r1, 17));
        org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(getParentActivity(), false, 1, getResourceProvider());
        h.O = n6Var;
        h.V0 = 49;
        h.show();
        org.telegram.ui.ActionBar.t2[] t2VarArr = {h};
        h.P(org.telegram.ui.ActionBar.k6.f27954h5);
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

    public final boolean T4(org.telegram.ui.Cells.t2 r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.T4(org.telegram.ui.Cells.t2):boolean");
    }

    public boolean U3() {
        if (this.S0 == 10) {
            return true;
        }
        return false;
    }

    public final void U4(boolean z10) {
        float f10;
        this.f50213c.a(z10, true);
        if (this.f50267n0 == null) {
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
        if (z10) {
            this.f50267n0.setVisibility(0);
        } else {
            this.f50267n0.setSelected(false);
            Drawable background = this.f50267n0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.ActionBar.q0 q0Var = this.f50267n0;
        Property property = View.ALPHA;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(q0Var, property, f10));
        this.P3.playTogether(arrayList);
        this.P3.addListener(new vv(this, z10, 1));
        this.P3.start();
    }

    public final void V3() {
        if (org.telegram.messenger.g0.Q1()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.l(true);
            }
            TLObject tLObject = this.Y1;
            if (tLObject != null) {
                cw cwVar = this.D0;
                if (cwVar != null) {
                    cwVar.f34751e0.Q(this.X1, tLObject);
                }
                this.Y1 = null;
                return;
            }
            return;
        }
        this.W1 = true;
    }

    public final void V4() {
        if (!this.B0 && getMessagesController().V0 && getMessagesController().K3 && this.A0 != null && getMessagesController().T0().isEmpty() && !this.isPaused && getUserConfig().Q && !this.inPreviewMode) {
            SharedPreferences e12 = org.telegram.messenger.hp.e1();
            if (!e12.getBoolean("filterhint", false)) {
                e12.edit().putBoolean("filterhint", true).apply();
                org.telegram.messenger.g0.i3(new au(this, 26), 1000L);
            }
        }
    }

    @Override
    public final boolean W(MotionEvent motionEvent, boolean z10) {
        pv pvVar;
        org.telegram.ui.Components.voip.r0 r0Var;
        jw jwVar;
        boolean z11;
        boolean z12;
        if (!this.f50290r3 && (((pvVar = this.G3) == null || !pvVar.c()) && (((r0Var = this.L0) == null || r0Var.getVisibility() != 0) && ((jwVar = this.A0) == null || !jwVar.f32459n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                jw jwVar2 = this.A0;
                if (jwVar2 != null && jwVar2.getTabsCount() >= 2 && this.A0.getCurrentTabId() != this.A0.getFirstTabId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                jw jwVar3 = this.A0;
                if (jwVar3 != null && jwVar3.getTabsCount() >= 2 && this.A0.getCurrentTabId() != this.A0.getLastTabId()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                org.telegram.messenger.az.m(this.currentAccount);
                if (z10) {
                    if (!z12 || z11) {
                    }
                } else {
                    return z11;
                }
            }
            return true;
        }
        return false;
    }

    public final void W3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.f27728o0) {
            kVar.k();
            this.f50290r3 = false;
            i5(true, true);
        }
    }

    public final void W4() {
        LaunchActivity launchActivity;
        boolean q10;
        int i3;
        int i10;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        LaunchActivity launchActivity2;
        float f10;
        CharSequence charSequence;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        bu buVar;
        org.telegram.ui.Components.p11 p11Var;
        org.telegram.ui.ActionBar.y0 y0Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i11;
        int w02;
        int w03;
        int w04;
        int i12;
        int w05;
        org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(this, this.f50258l0);
        int i13 = org.telegram.ui.ActionBar.k6.A8;
        H.S(getThemedColor(i13), getThemedColor(i13));
        H.f33747s = 8;
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) parentActivity;
        } else {
            launchActivity = null;
        }
        float f11 = 64.0f;
        int i14 = 0;
        if (this.Z2 != 0) {
            if (org.telegram.messenger.t3.N(this.f50205a3)) {
                H.c(2131232106, org.telegram.messenger.bd.M0(2131751913, null), new wu(this, 1), false);
                H.k();
            }
            H.i(new wu(this, 4), org.telegram.messenger.bd.M0(2131751912, null), this.f50205a3.collapsed_in_dialogs);
            H.i(new wu(this, 5), org.telegram.messenger.bd.M0(2131751911, null), !this.f50205a3.collapsed_in_dialogs);
            H.Z();
            H.X(-org.telegram.messenger.g0.L(64.0f));
        } else if (q4()) {
            H.c(2131232106, org.telegram.messenger.bd.M0(2131754143, null), new wu(this, 6), false);
            H.c(2131232182, org.telegram.messenger.bd.M0(2131749284, null), new wu(this, 7), false);
            H.Z();
            H.X(-org.telegram.messenger.g0.L(64.0f));
        } else {
            org.telegram.ui.ActionBar.e6 e6Var2 = this.resourceProvider;
            if (e6Var2 != null) {
                q10 = e6Var2.a();
            } else {
                q10 = org.telegram.ui.ActionBar.k6.I.q();
            }
            if (q10) {
                i3 = 2131231784;
            } else {
                i3 = 2131231843;
            }
            if (q10) {
                i10 = 2131744310;
            } else {
                i10 = 2131744309;
            }
            H.c(i3, org.telegram.messenger.bd.M0(i10, null), new wu(this, 8), false);
            H.k();
            H.c(2131232483, org.telegram.messenger.bd.M0(2131748281, null), new wu(this, 9), false);
            H.c(2131232504, org.telegram.messenger.bd.M0(2131745911, null), new wu(this, 10), false);
            org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f25456a;
            if (((org.telegram.messenger.h0) getMessagesController().f23167x7.f24662j0.f13688b).f22814c) {
                H.c(2131231275, org.telegram.messenger.bd.M0(2131743204, null), new au(this, 0), false);
            } else {
                TLRPC.TL_attachMenuBots tL_attachMenuBots = org.telegram.messenger.li.b0(org.telegram.messenger.h10.f22829t0).f24011b;
                if (launchActivity != null && tL_attachMenuBots != null && (arrayList = tL_attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = tL_attachMenuBots.bots;
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i15);
                        i15++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_side_menu) {
                            bu buVar2 = new bu(this, tL_attachMenuBot2, launchActivity, i14);
                            org.telegram.ui.Components.p11 p11Var2 = new org.telegram.ui.Components.p11(19, this, tL_attachMenuBot2);
                            org.telegram.ui.ActionBar.e6 e6Var3 = H.d;
                            if (H.f33722e != null) {
                                int i16 = org.telegram.ui.ActionBar.k6.F8;
                                int i17 = org.telegram.ui.ActionBar.k6.E8;
                                f10 = f11;
                                org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(0, H.f33722e, H.d, false, false);
                                y0Var2.setPadding(org.telegram.messenger.g0.L(18.0f), i14, org.telegram.messenger.g0.L(18.0f), i14);
                                if (tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                    charSequence = org.telegram.ui.Cells.l8.b(tL_attachMenuBot2.short_name);
                                } else {
                                    charSequence = tL_attachMenuBot2.short_name;
                                }
                                Pattern pattern = org.telegram.messenger.li.S1;
                                ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList4 = tL_attachMenuBot2.icons;
                                int size2 = arrayList4.size();
                                arrayList2 = arrayList3;
                                int i18 = 0;
                                while (true) {
                                    if (i18 < size2) {
                                        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList4.get(i18);
                                        int i19 = i18 + 1;
                                        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon3 = tL_attachMenuBotIcon2;
                                        launchActivity2 = launchActivity;
                                        if (tL_attachMenuBotIcon3.name.equals("android_side_menu_static")) {
                                            tL_attachMenuBotIcon = tL_attachMenuBotIcon3;
                                            break;
                                        } else {
                                            i18 = i19;
                                            launchActivity = launchActivity2;
                                        }
                                    } else {
                                        launchActivity2 = launchActivity;
                                        tL_attachMenuBotIcon = null;
                                        break;
                                    }
                                }
                                if (tL_attachMenuBotIcon != null) {
                                    org.telegram.messenger.jz f12 = org.telegram.messenger.t5.f(tL_attachMenuBotIcon.icon, org.telegram.ui.ActionBar.k6.f27862c7, 1.0f, null);
                                    if (f12 != null) {
                                        Integer num = H.f33734k0;
                                        if (num != null) {
                                            w05 = num.intValue();
                                        } else {
                                            w05 = org.telegram.ui.ActionBar.k6.w0(i16, e6Var3);
                                        }
                                        new PorterDuffColorFilter(w05, PorterDuff.Mode.SRC_IN);
                                    }
                                    org.telegram.messenger.ac b10 = org.telegram.messenger.ac.b(tL_attachMenuBotIcon.icon);
                                    buVar = buVar2;
                                    y0Var = y0Var2;
                                    p11Var = p11Var2;
                                    CharSequence charSequence2 = charSequence;
                                    i11 = i16;
                                    e6Var = e6Var3;
                                    y0Var.k(charSequence2, b10, "24_24", f12, tL_attachMenuBot2);
                                    org.telegram.ui.Components.k9 k9Var = y0Var.h;
                                    if (k9Var != null) {
                                        if (org.telegram.messenger.bd.f21784a0) {
                                            i12 = 5;
                                        } else {
                                            i12 = 3;
                                        }
                                        k9Var.setLayoutParams(b8.mf.e(24, 24, i12 | 16));
                                    }
                                } else {
                                    buVar = buVar2;
                                    p11Var = p11Var2;
                                    y0Var = y0Var2;
                                    CharSequence charSequence3 = charSequence;
                                    e6Var = e6Var3;
                                    i11 = i16;
                                    y0Var.j(charSequence3, 2131232072, null);
                                }
                                Integer num2 = H.f33732j0;
                                if (num2 == null && H.f33734k0 == null) {
                                    y0Var.c(i17, i11);
                                } else {
                                    if (num2 != null) {
                                        w02 = num2.intValue();
                                    } else {
                                        w02 = org.telegram.ui.ActionBar.k6.w0(i17, e6Var);
                                    }
                                    Integer num3 = H.f33734k0;
                                    if (num3 != null) {
                                        w03 = num3.intValue();
                                    } else {
                                        w03 = org.telegram.ui.ActionBar.k6.w0(i11, e6Var);
                                    }
                                    y0Var.d(w02, w03);
                                }
                                Integer num4 = H.f33734k0;
                                if (num4 != null) {
                                    w04 = num4.intValue();
                                } else {
                                    w04 = org.telegram.ui.ActionBar.k6.w0(i11, e6Var);
                                }
                                y0Var.setIconColorImage(w04);
                                Integer num5 = H.f33736l0;
                                if (num5 != null) {
                                    y0Var.setSelectorColor(num5.intValue());
                                } else {
                                    y0Var.h(0.12f, i17);
                                }
                                y0Var.setOnClickListener(new org.telegram.ui.Components.q2(22, H, buVar));
                                y0Var.setOnLongClickListener(new ei.j2(3, H, p11Var));
                                int i20 = H.S;
                                if (i20 > 0) {
                                    y0Var.setMinimumWidth(org.telegram.messenger.g0.L(i20));
                                    H.r(y0Var, b8.mf.o(H.S, -2));
                                } else {
                                    H.r(y0Var, b8.mf.o(-1, -2));
                                }
                                arrayList3 = arrayList2;
                                launchActivity = launchActivity2;
                                f11 = f10;
                                i14 = 0;
                            }
                        }
                        arrayList2 = arrayList3;
                        launchActivity2 = launchActivity;
                        f10 = f11;
                        arrayList3 = arrayList2;
                        launchActivity = launchActivity2;
                        f11 = f10;
                        i14 = 0;
                    }
                }
            }
            float f13 = f11;
            if (getUserConfig().X) {
                H.c(2131232361, org.telegram.messenger.bd.M0(2131745505, null), new wu(this, 3), false);
            }
            org.telegram.ui.ActionBar.y0 y0Var3 = this.f50276p0;
            if (y0Var3 != null) {
                org.telegram.ui.ActionBar.r6.V(y0Var3.f28813b, org.telegram.ui.ActionBar.k6.Oi, getResourceProvider());
                this.f50276p0.setOnClickListener(new org.telegram.ui.Components.ux0(18, this, H));
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25457b.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().f23182z3 && !org.telegram.messenger.az.f21683z1.isEmpty())) {
                    H.k();
                    H.d(this.f50276p0);
                }
            }
            H.Z();
            H.X(-org.telegram.messenger.g0.L(f13));
        }
    }

    public final void X3(String str) {
        if (this.actionBar.e(str)) {
            return;
        }
        org.telegram.ui.ActionBar.x n4 = this.actionBar.n(str);
        boolean z10 = this.X;
        ArrayList arrayList = this.f50250j1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f50241h1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f50241h1.setImageDrawable(new org.telegram.ui.ActionBar.w1(true));
            org.telegram.ui.ActionBar.r6.t(this.f50241h1, org.telegram.ui.ActionBar.k6.f28275y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.f50241h1;
            int i3 = org.telegram.ui.ActionBar.k6.f28292z8;
            org.telegram.ui.ActionBar.r6.R(imageView2, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i3), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i3), getResourceProvider());
            this.f50241h1.setOnClickListener(new cu(this, 6));
            n4.addView(this.f50241h1, b8.mf.r(54, 54, 16));
            arrayList.add(this.f50241h1);
        }
        NumberTextView numberTextView = new NumberTextView(n4.getContext());
        this.f50246i1 = numberTextView;
        int i10 = 18;
        numberTextView.setTextSize(18);
        this.f50246i1.setTypeface(org.telegram.messenger.g0.o());
        this.f50246i1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f28275y8));
        NumberTextView numberTextView2 = this.f50246i1;
        if (!this.X) {
            i10 = 72;
        }
        n4.addView(numberTextView2, b8.mf.m(1.0f, 0, -1, i10, 0, 0));
        this.f50246i1.setOnTouchListener(new fi.a(2));
        this.f50259l1 = n4.g(100, 2131232293, org.telegram.messenger.g0.L(48.0f));
        this.m1 = n4.g(104, 2131232256, org.telegram.messenger.g0.L(48.0f));
        this.f50268n1 = n4.g(107, 2131232051, org.telegram.messenger.g0.L(48.0f));
        this.k1 = n4.h(102, 2131232108, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.bd.M0(2131751599, null));
        org.telegram.ui.ActionBar.q0 h = n4.h(0, 2131231244, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.bd.M0(2131754839, null));
        n4.addView(new View(getParentActivity()), b8.mf.o(5, -1));
        this.f50288r1 = h.e(105, 2131232051, org.telegram.messenger.bd.M0(2131754172, null));
        this.f50272o1 = h.e(108, 2131232293, org.telegram.messenger.bd.M0(2131751454, null));
        this.f50277p1 = h.e(109, 2131232046, org.telegram.messenger.bd.M0(2131750813, null));
        this.f50282q1 = h.e(110, 2131232329, org.telegram.messenger.bd.M0(2131750713, null));
        this.f50299t1 = h.e(101, 2131232215, org.telegram.messenger.bd.M0(2131748689, null));
        this.f50294s1 = h.e(103, 2131232092, org.telegram.messenger.bd.M0(2131752089, null));
        this.f50304u1 = h.e(106, 2131232067, org.telegram.messenger.bd.M0(2131753692, null));
        this.m1.setOnLongClickListener(new nu(this, 1));
        arrayList.add(this.f50259l1);
        arrayList.add(this.f50268n1);
        arrayList.add(this.m1);
        arrayList.add(this.k1);
        arrayList.add(h);
        f5(false);
    }

    public final void X4() {
        if (this.S3 == null) {
            for (String str : getMessagesController().T3) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = org.telegram.messenger.bd.M0(2131749327, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = M0;
                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131749328, null));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131749541, null), new du(this, 6));
                    showDialog(s1Var, new ju(this, 0));
                    this.S3 = str;
                    return;
                }
            }
        }
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        int i10;
        int i11;
        int i12 = 8;
        if (i3 == 1) {
            O3();
            Q3();
            T3();
            G3();
            R3();
            iw iwVar = this.Y;
            qe.a aVar = this.f50207b;
            iwVar.setBlurredBackgroundVisibility(aVar.f53840e);
            float a10 = b8.v9.a(aVar.f53840e);
            org.telegram.ui.Components.k9 k9Var = this.f50216c3;
            if (k9Var != null) {
                k9Var.setScaleX(a10);
                this.f50216c3.setScaleY(a10);
                this.f50216c3.setAlpha(a10);
                org.telegram.ui.Components.k9 k9Var2 = this.f50216c3;
                if (a10 > 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                k9Var2.setVisibility(i11);
            }
            if (this.f50314w0 != null) {
                float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a10);
                this.f50314w0.setScaleX(T1);
                this.f50314w0.setScaleY(T1);
                this.f50314w0.setAlpha(a10);
                gi.d dVar = this.f50314w0;
                int i13 = (a10 > 0.0f ? 1 : (a10 == 0.0f ? 0 : -1));
                if (i13 > 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                dVar.setVisibility(i10);
                this.f50320x0.setAlpha(a10);
                mh.f fVar = this.f50320x0;
                if (i13 > 0) {
                    i12 = 0;
                }
                fVar.setVisibility(i12);
            }
        } else if (i3 == 2) {
            O3();
            Q3();
        } else if (i3 == 3) {
            M3();
        } else if (i3 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        } else if (i3 == 5) {
            L3();
        } else if (i3 == 6) {
            O3();
            Q3();
        } else if (i3 == 7) {
            H3();
        } else if (i3 == 8) {
            G3();
            R3();
        } else if (i3 == 9) {
            R3();
        }
    }

    public final void Y3() {
        int i3;
        cw cwVar = this.D0;
        if ((cwVar != null && cwVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f50273o2 != null) {
            i3 = 2;
        } else if (!this.f50263m2) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        cw cwVar2 = new cw(this, getParentActivity(), this, i3, this.S0, this.X2, this.Z2, new av(this));
        this.D0 = cwVar2;
        this.glassEngine.c(cwVar2);
        ((mw) this.fragmentView).addView(this.D0, this.C0);
        cw cwVar3 = this.D0;
        cwVar3.f34751e0.V = new ew(this);
        cwVar3.f34758l0.setOnItemClickListener(new du(this, 1));
        this.D0.f34762q0.setOnItemClickListener(new du(this, 2));
        this.D0.f34769x0.setOnItemClickListener(new iu(this, 0));
        this.D0.f34762q0.setOnItemLongClickListener(new du(this, 3));
        this.D0.f34748b0.setOnItemClickListener(new du(this, 4));
        this.D0.f34748b0.setOnItemLongClickListener(new av(this));
        this.D0.setFilteredSearchViewDelegate(new du(this, 5));
        this.D0.setAlpha(0.0f);
        this.D0.setScaleX(1.05f);
        this.D0.setScaleY(1.05f);
        this.D0.setVisibility(8);
        this.D0.setBlurredBackgroundDrawableFactory(this.f50280p4);
    }

    public final void Y4(long j10, View view) {
        ArrayList d42;
        int i3;
        s3(j10, view);
        boolean v = this.actionBar.v();
        ArrayList arrayList = this.J2;
        boolean z10 = true;
        if (v) {
            if (arrayList.isEmpty()) {
                n4(true);
                return;
            }
        } else {
            if (this.f50290r3) {
                X3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.r4)) {
                    this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
                }
            } else {
                X3(null);
            }
            org.telegram.messenger.g0.v1(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
            this.actionBar.O(null, null);
            int i10 = this.f50230f0[0].f49904s;
            if ((i10 != 7 && i10 != 8) || (this.actionBar.v() && !this.actionBar.w(null))) {
                d42 = getMessagesController().W0(this.X2);
            } else {
                d42 = d4(this.currentAccount, this.f50230f0[0].f49904s, this.X2, this.T1);
            }
            int size = d42.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) d42.get(i12);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (s4(dialog)) {
                        i11++;
                    } else if (!getMessagesController().C2(dialog.f27005id, false)) {
                        break;
                    }
                }
            }
            if (i11 > 1) {
                if (this.f50230f0 != null) {
                    int i13 = 0;
                    while (true) {
                        tw[] twVarArr = this.f50230f0;
                        if (i13 >= twVarArr.length) {
                            break;
                        }
                        twVarArr[i13].d.I = true;
                        i13++;
                    }
                }
                int i14 = org.telegram.messenger.hp.C8;
                u5(131072, true);
            }
            if (!this.f50290r3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f50250j1;
                    if (i15 >= arrayList3.size()) {
                        break;
                    }
                    View view2 = (View) arrayList3.get(i15);
                    view2.setPivotY(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2);
                    org.telegram.messenger.g0.y(view2);
                    arrayList2.add(ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.1f, 1.0f));
                    i15++;
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(200L);
                animatorSet.start();
            }
            ValueAnimator valueAnimator = this.f50317w3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f50317w3 = ValueAnimator.ofFloat(this.f50311v3, 1.0f);
            int i16 = 0;
            while (true) {
                tw[] twVarArr2 = this.f50230f0;
                if (i16 >= twVarArr2.length) {
                    break;
                }
                tw twVar = twVarArr2[i16];
                if (twVar != null) {
                    twVar.f49897a.I0(true);
                }
                i16++;
            }
            if (this.L) {
                i3 = 81;
            } else {
                i3 = 0;
            }
            float max = Math.max(0.0f, org.telegram.messenger.g0.L(i3 + 48) + this.O);
            if (max != 0.0f) {
                this.Q = (int) max;
                this.fragmentView.requestLayout();
            }
            this.f50317w3.addUpdateListener(new eu(this, max, 0));
            this.f50317w3.addListener(new xv(this, max, 1));
            this.f50317w3.setInterpolator(org.telegram.ui.Components.xq.f40452f);
            this.f50317w3.setDuration(200L);
            this.f50317w3.start();
            jw jwVar = this.A0;
            if (jwVar != null) {
                jwVar.b(org.telegram.ui.ActionBar.k6.f28207ui, org.telegram.ui.ActionBar.k6.f28188ti, org.telegram.ui.ActionBar.k6.f28169si, org.telegram.ui.ActionBar.k6.f28226vi, org.telegram.ui.ActionBar.k6.f28236w8);
            }
            org.telegram.ui.ActionBar.w1 w1Var = this.f50231f1;
            if (w1Var != null) {
                w1Var.c(true, 1.0f);
            }
            z10 = false;
        }
        f5(false);
        this.f50246i1.a(arrayList.size(), z10);
    }

    public final void Z3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f50330z0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i3 = 0; i3 < 2; i3++) {
                undoViewArr[i3] = new yv(this, parentActivity);
                FrameLayout.LayoutParams d = b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.f50239g4 + this.f50248i4 + d.bottomMargin;
                UndoView undoView = undoViewArr[i3];
                int i10 = this.f50326y0 + 1;
                this.f50326y0 = i10;
                ((mw) this.fragmentView).addView(undoView, i10, d);
            }
        }
    }

    public final void Z4(long j10, View view) {
        String str;
        org.telegram.ui.Components.ac K;
        int i3 = -this.M3;
        this.M3 = i3;
        org.telegram.messenger.g0.G3(i3, view, null);
        org.telegram.messenger.p2.APP_ERROR.a();
        if (j10 >= 0) {
            str = org.telegram.messenger.l10.p(org.telegram.messenger.hp.s1(this.currentAccount).a2(Long.valueOf(j10)));
        } else {
            str = "";
        }
        if (getMessagesController().D3()) {
            K = org.telegram.ui.Components.fc.a0(this).Q(2131624216, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131743770, str)));
        } else {
            K = org.telegram.ui.Components.fc.a0(this).K(2131624216, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131743770, str)), org.telegram.messenger.bd.M0(2131743769, null), new au(this, 8));
        }
        K.j();
    }

    public final void a4(final long j10, final long j11, boolean z10, final m91 m91Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String M0;
        String b02;
        String M02;
        TLRPC.TL_forumTopic f10;
        if (A3(j10)) {
            int i3 = this.S0;
            if (i3 != 11 && i3 != 12 && i3 != 13) {
                if (z10 && ((this.f50237g2 != null && this.f50242h2 != null) || this.f50247i2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (org.telegram.messenger.m5.C(j10)) {
                            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(getMessagesController().a1(Integer.valueOf((int) (4294967295L & j10))).user_id));
                            if (a22 != null) {
                                M0 = org.telegram.messenger.bd.M0(2131745606, null);
                                b02 = org.telegram.messenger.bd.b0(this.f50237g2, org.telegram.messenger.l10.p(a22));
                                M02 = org.telegram.messenger.bd.M0(2131745650, null);
                            } else {
                                return;
                            }
                        } else if (org.telegram.messenger.m5.E(j10)) {
                            if (j10 == getUserConfig().e()) {
                                M0 = org.telegram.messenger.bd.M0(2131745606, null);
                                b02 = org.telegram.messenger.bd.b0(this.f50242h2, org.telegram.messenger.bd.M0(2131745911, null));
                                M02 = org.telegram.messenger.bd.M0(2131745650, null);
                            } else {
                                TLRPC.User a23 = getMessagesController().a2(Long.valueOf(j10));
                                if (a23 != null && this.f50237g2 != null) {
                                    M0 = org.telegram.messenger.bd.M0(2131745606, null);
                                    b02 = org.telegram.messenger.bd.b0(this.f50237g2, org.telegram.messenger.l10.p(a23));
                                    M02 = org.telegram.messenger.bd.M0(2131745650, null);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(-j10));
                            if (M03 != null) {
                                String str = M03.title;
                                if (j11 != 0 && (f10 = getMessagesController().f23102q7.f(M03.f27001id, j11)) != null) {
                                    str = ((Object) str) + " " + f10.title;
                                }
                                if (this.f50247i2 != null) {
                                    M0 = org.telegram.messenger.bd.M0(2131754366, null);
                                    b02 = org.telegram.messenger.bd.b0(this.f50247i2, str);
                                    M02 = org.telegram.messenger.bd.M0(2131754486, null);
                                } else {
                                    M0 = org.telegram.messenger.bd.M0(2131745606, null);
                                    b02 = org.telegram.messenger.bd.b0(this.f50242h2, str);
                                    M02 = org.telegram.messenger.bd.M0(2131745650, null);
                                }
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.g0.X2(b02);
                        alertDialog$Builder.k(M02, new org.telegram.ui.ActionBar.p1() {
                            @Override
                            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i10) {
                                uw.this.a4(j10, j11, false, m91Var);
                            }
                        });
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        if (showDialog(s1Var) == null) {
                            s1Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i3 == 15) {
                    Runnable r1Var = new ai.r1(this, j10, new c3.f0(this, j10, j11, m91Var, 6), 27);
                    if (j10 < 0) {
                        c5(getMessagesController().M0(Long.valueOf(-j10)), r1Var, null);
                        return;
                    }
                    TLRPC.User a24 = getMessagesController().a2(Long.valueOf(j10));
                    TLRPC.User a25 = getMessagesController().a2(Long.valueOf(this.I));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String a02 = org.telegram.messenger.bd.a0(null, null, 2131754074, org.telegram.messenger.l10.j(a24, true), org.telegram.messenger.l10.j(a25, true));
                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                    s1Var2.S = a02;
                    s1Var2.U = TextUtils.concat(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131754075, org.telegram.messenger.l10.j(a24, true), org.telegram.messenger.l10.j(a25, true))));
                    alertDialog$Builder2.k(org.telegram.messenger.bd.a0("Send", null, 2131745650, new Object[0]), new ur(r1Var, 5));
                    alertDialog$Builder2.h(org.telegram.messenger.bd.a0("Cancel", null, 2131752589, new Object[0]), new org.telegram.ui.Components.lf0(21));
                    showDialog(s1Var2);
                    return;
                } else if (this.D2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(org.telegram.messenger.pr.a(j10, j11));
                    if (this.D2.y(this, arrayList, null, false, this.K2, this.L2, this.M2, m91Var) && this.f50251j2) {
                        this.D2 = null;
                        return;
                    }
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            if (org.telegram.messenger.m5.E(j10)) {
                TLRPC.User a26 = getMessagesController().a2(Long.valueOf(j10));
                if (!a26.mutual_contact) {
                    UndoView k42 = k4();
                    if (k42 != null) {
                        k42.j(45, j10, null);
                        return;
                    }
                    return;
                }
                user = a26;
                chat = null;
            } else {
                TLRPC.Chat M04 = getMessagesController().M0(Long.valueOf(-j10));
                if (org.telegram.messenger.t3.N(M04) && org.telegram.messenger.t3.w(1, M04)) {
                    chat = M04;
                    user = null;
                } else {
                    UndoView k43 = k4();
                    if (k43 != null) {
                        k43.j(46, j10, null);
                        return;
                    }
                    return;
                }
            }
            org.telegram.ui.ActionBar.s1 s1Var3 = new org.telegram.ui.ActionBar.s1(3, getParentActivity(), null);
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().j1(j10);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new ci.r3(this, s1Var3, user, chat, j10, tL_messages_checkHistoryImportPeer));
            try {
                s1Var3.r(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void a5(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.a5(boolean, boolean, boolean, boolean):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.al));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Yk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27938g8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27920f9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27939g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28046m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28273y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27901e9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27881d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27864c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.M7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.N7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27957h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28065n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28029l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28084o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27992j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28010k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27844b8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27825a8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Y7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.W7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.V7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27843b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28101p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28008k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.nk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28293z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28257x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28237w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28217v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28199u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28180t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28161s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.r9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28124q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28104p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27975i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27845b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27826a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28226vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G8));
    }

    public final void b4(long j10, boolean z10) {
        if (this.f50230f0 != null) {
            int i3 = 0;
            while (true) {
                tw[] twVarArr = this.f50230f0;
                if (i3 < twVarArr.length) {
                    int childCount = twVarArr[i3].f49897a.getChildCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 < childCount) {
                            View childAt = this.f50230f0[i3].f49897a.getChildAt(i10);
                            if (childAt instanceof org.telegram.ui.Cells.t2) {
                                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                                if (t2Var.getDialogId() == j10) {
                                    t2Var.c0(z10, true);
                                    break;
                                }
                            }
                            i10++;
                        }
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void b5() {
        int i3;
        int i10;
        Long l10;
        if (this.N0 == null && !org.telegram.messenger.az.f21675x && (!this.L || this.F0.g())) {
            x01[] x01VarArr = new x01[1];
            TLRPC.User f10 = org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).f();
            org.telegram.ui.ActionBar.k5 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.E3.f();
                Drawable drawable = this.E3.f33286f[0];
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(titleTextView.getRightDrawable().getBounds());
                rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
                int L = (-(this.actionBar.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                i3 = org.telegram.messenger.g0.L(4.0f) + (rect.centerX() - org.telegram.messenger.g0.L(16.0f));
                org.telegram.ui.Cells.o oVar = this.F3;
                if (oVar != null) {
                    oVar.b(rect.centerX(), rect.centerY());
                }
                i10 = L;
            } else {
                i3 = 0;
                i10 = 0;
            }
            qv qvVar = new qv(this, this, getParentActivity(), Integer.valueOf(i3), getResourceProvider(), x01VarArr);
            if (f10 != null && org.telegram.messenger.m5.g(f10.emoji_status) > 0) {
                qvVar.setExpireDateHint(org.telegram.messenger.m5.g(f10.emoji_status));
            }
            Long l11 = this.C3;
            if (l11 != null) {
                qvVar.setSelected(l11);
            } else {
                Drawable drawable2 = this.E3.f33286f[0];
                if (drawable2 instanceof org.telegram.ui.Components.g5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.g5) drawable2).h());
                } else {
                    l10 = null;
                }
                qvVar.setSelected(l10);
            }
            qvVar.setSaveState(1);
            qvVar.y(this.E3, titleTextView);
            rv rvVar = new rv(this, qvVar);
            this.N0 = rvVar;
            x01VarArr[0] = rvVar;
            rvVar.showAsDropDown(this.actionBar, org.telegram.messenger.g0.L(16.0f), i10, 48);
            x01VarArr[0].b();
        }
    }

    public final void c5(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.c5(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    @Override
    public final boolean canBeginSlide() {
        jw jwVar;
        if (!this.G3.c()) {
            if (this.S0 == 3 && (jwVar = this.A0) != null && jwVar.getVisibility() == 0 && this.A0.L > 0) {
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
            cw cwVar = this.D0;
            if (cwVar != null) {
                cwVar.S();
                return true;
            }
            return true;
        }
        return super.closeLastFragment();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.Components.p7 p7Var = new org.telegram.ui.Components.p7(this, context, this.resourceProvider, 3);
        p7Var.setAllowOverlayTitle(true);
        p7Var.H0 = true;
        if (p7Var.G0 == null) {
            ai.d2 d2Var = new ai.d2(p7Var.getContext(), 7);
            p7Var.G0 = d2Var;
            p7Var.addView(d2Var);
        }
        org.telegram.ui.ActionBar.r6.m(p7Var, 3, org.telegram.ui.ActionBar.k6.f28179t8, getResourceProvider());
        org.telegram.ui.ActionBar.r6.a(p7Var, org.telegram.ui.ActionBar.k6.f28292z8, getResourceProvider(), true);
        org.telegram.ui.ActionBar.r6.m(p7Var, 1, org.telegram.ui.ActionBar.k6.f28216v8, getResourceProvider());
        org.telegram.ui.ActionBar.r6.b(p7Var, org.telegram.ui.ActionBar.k6.f28275y8, getResourceProvider(), true);
        if (p7Var.f27754y1 == null) {
            ei.k kVar = new ei.k(p7Var, p7Var.getContext(), p7Var.K0, p7Var.P0);
            p7Var.f27754y1 = kVar;
            kVar.setClipChildren(false);
            p7Var.addView(p7Var.f27754y1);
        }
        p7Var.getAdditionalSubTitleOverlayContainer().setTranslationX(org.telegram.messenger.g0.L(4.0f));
        p7Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-org.telegram.messenger.g0.L(3.0f));
        if (!this.inPreviewMode && (!org.telegram.messenger.g0.Q1() || this.X2 == 0 || q4())) {
            return p7Var;
        }
        p7Var.setOccupyStatusBar(false);
        return p7Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.createView(android.content.Context):android.view.View");
    }

    public final java.util.ArrayList d4(int r11, int r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.d4(int, int, int, boolean):java.util.ArrayList");
    }

    public final void d5(boolean z10) {
        tw[] twVarArr;
        char c2;
        char c10;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            twVarArr = this.f50230f0;
            if (i10 >= twVarArr.length) {
                break;
            }
            twVarArr[i10].f49897a.C0();
            i10++;
        }
        if (z10 && twVarArr.length > 1) {
            c2 = 1;
        } else {
            c2 = 0;
        }
        int i11 = twVarArr[c2].h;
        if (i11 >= 0 && i11 < getMessagesController().T0().size()) {
            org.telegram.messenger.mo moVar = (org.telegram.messenger.mo) getMessagesController().T0().get(this.f50230f0[c2].h);
            if (moVar.e()) {
                tw twVar = this.f50230f0[c2];
                twVar.f49904s = this.S0;
                pw pwVar = twVar.f49897a;
                int i12 = pw.C3;
                pwVar.D1();
            } else {
                tw[] twVarArr2 = this.f50230f0;
                if (twVarArr2[c2 ^ 1].f49904s == 7) {
                    twVarArr2[c2].f49904s = 8;
                } else {
                    twVarArr2[c2].f49904s = 7;
                }
                twVarArr2[c2].f49897a.setScrollEnabled(true);
                org.telegram.messenger.hp messagesController = getMessagesController();
                if (this.f50230f0[c2].f49904s == 8) {
                    c10 = 1;
                } else {
                    c10 = 0;
                }
                org.telegram.messenger.mo[] moVarArr = messagesController.N;
                org.telegram.messenger.mo moVar2 = moVarArr[c10];
                if (moVar2 != moVar) {
                    moVarArr[c10] = moVar;
                    int i13 = c10 ^ 1;
                    if (moVarArr[i13] == moVar) {
                        moVarArr[i13] = null;
                    }
                    if (moVarArr[c10] == null) {
                        if (moVar2 != null) {
                            moVar2.f24245k.clear();
                            moVar2.f24246l.clear();
                        }
                    } else {
                        messagesController.T4(null);
                    }
                }
            }
            tw[] twVarArr3 = this.f50230f0;
            if (twVarArr3.length > 1) {
                twVarArr3[1].F = moVar.f24250p;
            }
            tw twVar2 = twVarArr3[c2];
            dv dvVar = twVar2.d;
            dvVar.h = twVar2.f49904s;
            dvVar.f();
            tw twVar3 = this.f50230f0[c2];
            zu zuVar = twVar3.f49899c;
            if (twVar3.f49904s == 0 && l4() && this.f50230f0[c2].f49905w == 2) {
                i3 = 1;
            }
            zuVar.h1(i3, (int) this.O);
            C3(this.f50230f0[c2]);
        }
    }

    @Override
    public final void didReceivedNotification(int r27, int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (!(dialog instanceof ii.a3) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final float e4(boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f - this.f50207b.f53840e;
        } else {
            f10 = 1.0f;
        }
        return f10 * (1.0f - h4()) * this.f50286r.f53840e;
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
        int i3;
        sy0 sy0Var = this.f50202a0;
        if (sy0Var != null && sy0Var.getVisibility() != 8) {
            f10 = this.f50202a0.getMeasuredHeight();
        } else {
            f10 = 0.0f;
        }
        if (this.L) {
            f11 = org.telegram.messenger.g0.L(81.0f);
        } else {
            f11 = 0.0f;
        }
        if (this.L) {
            float f20 = this.O;
            float f21 = this.f50327y1;
            f12 = (f10 * f21) + com.google.android.recaptcha.internal.a.y(1.0f, f21, f11, f20);
            f13 = this.f50329y3;
        } else {
            f12 = (f10 * this.f50327y1) + this.O;
            f13 = this.f50329y3;
        }
        float f22 = f12 + f13 + this.U;
        iw iwVar = this.Y;
        if (iwVar != null && iwVar.getVisibility() == 0) {
            f14 = this.Y.getAlpha();
        } else {
            f14 = 0.0f;
        }
        float L = org.telegram.messenger.g0.L(4.0f) * f14;
        jw jwVar = this.A0;
        if (jwVar != null) {
            jwVar.setTranslationY(f22 - L);
            f16 = this.A0.getAlpha();
            f17 = org.telegram.messenger.g0.L(43.0f) * f16;
            f15 = f22 + f17;
        } else {
            f15 = f22;
            f16 = 0.0f;
            f17 = 0.0f;
        }
        org.telegram.ui.Components.pr prVar = this.K1;
        if (prVar != null) {
            float f23 = f15 - L;
            int i10 = -org.telegram.messenger.g0.L(3.0f);
            if (this.f50208b0 == null) {
                i3 = org.telegram.messenger.g0.L(44.0f);
            } else {
                i3 = 0;
            }
            prVar.setTranslationY(org.telegram.messenger.g0.T1(f23, i10 - i3, this.f50207b.f53840e));
            f18 = this.K1.getMetadata().f53856c.f53866a;
            f19 = this.K1.c(0.0f);
        } else {
            f18 = 0.0f;
            f19 = 0.0f;
        }
        org.telegram.ui.Components.or orVar = this.L1;
        if (orVar != null) {
            orVar.setTranslationY(f22 - L);
            float W1 = org.telegram.messenger.g0.W1(Math.min(f18, f16), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(50.0f));
            org.telegram.ui.Components.or orVar2 = this.L1;
            float min = Math.min(org.telegram.messenger.g0.L(40.0f), (f19 + f17) - W1);
            Matrix matrix = orVar2.f36925b;
            if (orVar2.f36927e != W1 || orVar2.f36928f != min) {
                orVar2.f36927e = W1;
                orVar2.f36928f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, W1);
                LinearGradient linearGradient = orVar2.f36926c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                orVar2.invalidate();
            }
            this.L1.setAlpha(Math.max(f16, f18));
        }
    }

    public final int f4() {
        if (this.L) {
            return org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(81.0f);
        }
        return org.telegram.messenger.g0.L(48.0f);
    }

    public final void f5(boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.f5(boolean):void");
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.f60 f60Var = this.M0;
        if (f60Var != null) {
            f60Var.u();
        }
    }

    public final int g4() {
        if (this.L) {
            return org.telegram.messenger.g0.L(81.0f);
        }
        return 0;
    }

    public final void g5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.g5():void");
    }

    @Override
    public final org.telegram.ui.ActionBar.m4 getBackButtonState() {
        if (!q4() && !this.G3.f47829f) {
            return org.telegram.ui.ActionBar.m4.f28341b;
        }
        return org.telegram.ui.ActionBar.m4.f28340a;
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f10) {
        int i3;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X3, 1.0f);
            this.f50206a4 = ofFloat;
            return ofFloat;
        }
        if (getLayoutContainer() != null && getLayoutContainer().getMeasuredWidth() > 0) {
            i3 = (int) Utilities.i((200.0f / getLayoutContainer().getMeasuredWidth()) * f10, 200.0f, 80.0f);
        } else {
            i3 = 150;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.X3, 1.0f);
        this.f50206a4 = ofFloat2;
        ofFloat2.addUpdateListener(new hu(this, 1));
        this.f50206a4.setInterpolator(org.telegram.ui.Components.xq.f40453g);
        this.f50206a4.setDuration(i3);
        this.f50206a4.start();
        return this.f50206a4;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.getThemeDescriptions():java.util.ArrayList");
    }

    public final float h4() {
        pv pvVar = this.G3;
        if (pvVar != null && pvVar.c()) {
            return this.G3.f47828e;
        }
        return 0.0f;
    }

    public final void h5() {
        ci.j1 j1Var;
        pw pwVar;
        boolean z10;
        int i3;
        try {
            gv gvVar = this.C1;
            if (gvVar != null && gvVar.getEditField() != null) {
                this.C1.getEditField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ke));
            }
            NumberTextView numberTextView = this.f50246i1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f28275y8));
            }
            jw jwVar = this.A0;
            int i10 = 0;
            if (jwVar != null && (jwVar.getSelectorDrawable() instanceof GradientDrawable)) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null && kVar.v()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                GradientDrawable gradientDrawable = (GradientDrawable) this.A0.getSelectorDrawable();
                if (z10) {
                    i3 = org.telegram.ui.ActionBar.k6.f28207ui;
                } else {
                    i3 = org.telegram.ui.ActionBar.k6.K8;
                }
                gradientDrawable.setColor(getThemedColor(i3));
                this.A0.invalidate();
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                if (this.X2 != 0 || this.Z2 != 0) {
                    kVar2.I(getThemedColor(org.telegram.ui.ActionBar.k6.Q8), false);
                    this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.k6.R8), true);
                }
                if (this.actionBar.v()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
                }
                n5();
            }
            if (this.f50230f0 != null) {
                while (true) {
                    tw[] twVarArr = this.f50230f0;
                    if (i10 >= twVarArr.length) {
                        break;
                    }
                    tw twVar = twVarArr[i10];
                    if (twVar != null && (pwVar = twVar.f49897a) != null) {
                        pwVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
                    }
                    i10++;
                }
            }
            cw cwVar = this.D0;
            if (cwVar != null && (j1Var = cwVar.f34748b0) != null) {
                j1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
            }
            mi.x1 x1Var = this.D1;
            if (x1Var != null) {
                x1Var.setScrimViewBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
            }
            gi.l3 l3Var = this.f50281q0;
            if (l3Var != null) {
                l3Var.j(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
            }
            gi.l3 l3Var2 = this.f50287r0;
            if (l3Var2 != null) {
                l3Var2.j(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final float i4() {
        return -org.telegram.messenger.g0.W1(this.f50207b.f53840e, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(48.0f));
    }

    public final void i5(boolean z10, boolean z11) {
        ?? r5;
        int L0;
        boolean z12;
        tw[] twVarArr;
        org.telegram.messenger.mo moVar;
        boolean z13;
        Object[] objArr;
        u4.m0 m0Var;
        boolean z14;
        boolean z15;
        boolean z16;
        if (this.A0 != null && !this.inPreviewMode && !this.f50290r3) {
            pv pvVar = this.G3;
            if (pvVar == null || !pvVar.c()) {
                org.telegram.ui.Components.f60 f60Var = this.M0;
                String str = null;
                if (f60Var != null) {
                    f60Var.u();
                    this.M0 = null;
                }
                ArrayList T0 = getMessagesController().T0();
                int size = T0.size();
                qe.a aVar = this.f50286r;
                boolean z17 = true;
                boolean z18 = false;
                if (size > 1) {
                    if (!z10 && this.A0.getVisibility() == 0) {
                        r5 = 0;
                    } else {
                        if (this.A0.getVisibility() != 0) {
                            z13 = false;
                        } else {
                            z13 = z11;
                        }
                        this.f50319x = true;
                        boolean isEmpty = this.A0.h.isEmpty();
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.R3 == null) {
                                z16 = z11;
                            } else {
                                z16 = false;
                            }
                            if (!this.f50290r3) {
                                aVar.a(this.f50319x, z16);
                            }
                        }
                        int currentTabId = this.A0.getCurrentTabId();
                        int currentTabStableId = this.A0.getCurrentTabStableId();
                        if (currentTabId != this.A0.getDefaultTabId() && currentTabId >= T0.size()) {
                            this.A0.M = -1;
                            objArr = 1;
                        } else {
                            objArr = null;
                        }
                        jw jwVar = this.A0;
                        jwVar.h.clear();
                        jwVar.f32457k0.clear();
                        jwVar.m0.clear();
                        jwVar.f32460n0.clear();
                        jwVar.f32461o0.clear();
                        jwVar.f32462p0.clear();
                        jwVar.N = 0;
                        int size2 = T0.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            if (((org.telegram.messenger.mo) T0.get(i3)).e()) {
                                this.A0.a(i3, 0, org.telegram.messenger.bd.M0(2131750808, str), null, false, true, ((org.telegram.messenger.mo) T0.get(i3)).f24250p);
                                z15 = z18;
                            } else {
                                org.telegram.messenger.mo moVar2 = (org.telegram.messenger.mo) T0.get(i3);
                                z15 = z18;
                                this.A0.a(i3, moVar2.f24249o, moVar2.f24238b, moVar2.f24239c, moVar2.f24248n, false, ((org.telegram.messenger.mo) T0.get(i3)).f24250p);
                            }
                            i3++;
                            z18 = z15;
                            str = null;
                        }
                        boolean z19 = z18;
                        if (currentTabStableId >= 0) {
                            if (objArr != null && !this.A0.h(currentTabStableId)) {
                                while (currentTabId >= 0) {
                                    jw jwVar2 = this.A0;
                                    if (jwVar2.h(jwVar2.f32458l0.get(currentTabId, -1))) {
                                        break;
                                    }
                                    currentTabId--;
                                }
                                if (currentTabId < 0) {
                                    currentTabId = z19 ? 1 : 0;
                                }
                            }
                            if (this.A0.f32458l0.get(this.f50230f0[z19 ? 1 : 0].h, -1) != currentTabStableId) {
                                this.f50230f0[z19 ? 1 : 0].h = currentTabId;
                                isEmpty = true;
                            }
                        }
                        int i10 = z19 ? 1 : 0;
                        while (true) {
                            tw[] twVarArr2 = this.f50230f0;
                            if (i10 >= twVarArr2.length) {
                                break;
                            }
                            if (twVarArr2[i10].h >= T0.size()) {
                                this.f50230f0[i10].h = T0.size() - 1;
                            }
                            this.f50230f0[i10].f49897a.setScrollingTouchSlop(1);
                            i10++;
                        }
                        jw jwVar3 = this.A0;
                        ci.j1 j1Var = jwVar3.G;
                        if (z13) {
                            m0Var = jwVar3.f32468t0;
                        } else {
                            m0Var = null;
                        }
                        j1Var.setItemAnimator(m0Var);
                        jwVar3.J.f();
                        if (isEmpty) {
                            d5(z19);
                        }
                        jw jwVar4 = this.A0;
                        int currentTabId2 = jwVar4.getCurrentTabId();
                        ArrayList arrayList = jwVar4.h;
                        int i11 = 0;
                        while (true) {
                            if (i11 < arrayList.size()) {
                                if (((org.telegram.ui.Components.yy) arrayList.get(i11)).f40853a == currentTabId2) {
                                    z14 = ((org.telegram.ui.Components.yy) arrayList.get(i11)).f40857f;
                                    break;
                                }
                                i11++;
                            } else {
                                z14 = false;
                                break;
                            }
                        }
                        if (z14) {
                            jw jwVar5 = this.A0;
                            ArrayList arrayList2 = jwVar5.h;
                            if (!arrayList2.isEmpty()) {
                                r5 = 0;
                                jwVar5.f((org.telegram.ui.Components.yy) arrayList2.get(0), 0);
                            }
                        }
                        r5 = 0;
                    }
                } else {
                    r5 = 0;
                    if (this.A0.getVisibility() != 8) {
                        this.A0.setIsEditing(false);
                        U4(false);
                        this.f50274o3 = false;
                        if (this.f50270n3) {
                            this.f50270n3 = false;
                            this.f50230f0[0].setTranslationX(0.0f);
                            this.f50230f0[1].setTranslationX(twVarArr[0].getMeasuredWidth());
                        }
                        if (this.f50230f0[0].h != this.A0.getDefaultTabId()) {
                            this.f50230f0[0].h = this.A0.getDefaultTabId();
                            dv dvVar = this.f50230f0[0].d;
                            dvVar.h = 0;
                            dvVar.f();
                            tw twVar = this.f50230f0[0];
                            twVar.f49904s = this.S0;
                            twVar.d.f();
                        }
                        this.f50230f0[1].setVisibility(8);
                        tw twVar2 = this.f50230f0[1];
                        twVar2.h = 0;
                        dv dvVar2 = twVar2.d;
                        dvVar2.h = 0;
                        dvVar2.f();
                        tw twVar3 = this.f50230f0[1];
                        twVar3.f49904s = this.S0;
                        twVar3.d.f();
                        this.f50319x = false;
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.R3 == null) {
                                z12 = z11;
                            } else {
                                z12 = false;
                            }
                            if (!this.f50290r3) {
                                aVar.a(false, z12);
                            }
                        }
                        int i12 = 0;
                        while (true) {
                            tw[] twVarArr3 = this.f50230f0;
                            if (i12 >= twVarArr3.length) {
                                break;
                            }
                            tw twVar4 = twVarArr3[i12];
                            if (twVar4.f49904s == 0 && twVar4.f49905w == 2 && l4() && ((L0 = this.f50230f0[i12].f49899c.L0()) == 0 || L0 == 1)) {
                                this.f50230f0[i12].f49899c.h1(1, (int) this.O);
                            }
                            this.f50230f0[i12].f49897a.setScrollingTouchSlop(0);
                            this.f50230f0[i12].f49897a.requestLayout();
                            this.f50230f0[i12].requestLayout();
                            i12++;
                        }
                        this.A0.M = -1;
                        r5 = 0;
                    }
                }
                f5(r5);
                int i13 = this.f50230f0[r5].f49904s;
                if ((i13 == 7 || i13 == 8) && (moVar = getMessagesController().N[i13 - 7]) != null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < T0.size()) {
                            org.telegram.messenger.mo moVar3 = (org.telegram.messenger.mo) T0.get(i14);
                            if (moVar3 != null && moVar3.f24237a == moVar.f24237a) {
                                break;
                            }
                            i14++;
                        } else {
                            z17 = false;
                            break;
                        }
                    }
                    if (!z17) {
                        d5(false);
                    }
                }
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        pv pvVar;
        if (!this.f50255k2 && (pvVar = this.G3) != null && pvVar.getFragment() != null) {
            return this.G3.getFragment().isLightStatusBar();
        }
        if (i0.a.h(getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final ei.z6 j4() {
        return getMessagesController().P1();
    }

    public final void j5(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.j5(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    @Override
    public final si.f k() {
        return this.f50262l4;
    }

    public final UndoView k4() {
        Z3();
        UndoView[] undoViewArr = this.f50330z0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.d(2, true);
            mw mwVar = (mw) this.fragmentView;
            mwVar.removeView(undoViewArr[0]);
            mwVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void k5() {
        float f10 = (((-this.f50239g4) - this.f50253j4) - this.f50309v1) - this.f50315w1;
        org.telegram.ui.Components.l00 l00Var = this.f50303u0;
        if (l00Var != null) {
            l00Var.setTranslationY(f10);
        }
        org.telegram.ui.Components.l00 l00Var2 = this.f50308v0;
        if (l00Var2 != null) {
            l00Var2.setTranslationY(f10 - org.telegram.messenger.g0.L(52.0f));
            gi.l3 l3Var = this.f50281q0;
            if (l3Var != null) {
                l3Var.setTranslationY(f10 - org.telegram.messenger.g0.L(52.0f));
            }
        }
    }

    public final boolean l4() {
        if (!this.f50263m2 && this.S0 == 0 && this.Z2 == 0 && this.X2 == 0) {
            org.telegram.messenger.hp messagesController = getMessagesController();
            messagesController.getClass();
            if (org.telegram.messenger.az.f21657q1 && messagesController.R.f(2305843009213693952L | 1) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void l5(boolean z10) {
        boolean z11;
        boolean z12 = this.f50263m2;
        if ((!z12 || this.S0 == 10) && this.X2 == 0 && this.Z2 == 0 && !this.inPreviewMode && ((!this.f50255k2 || z12) && !this.U3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.l00 l00Var = this.f50303u0;
        if (l00Var != null) {
            l00Var.e(z11, z10);
        }
        org.telegram.ui.Components.l00 l00Var2 = this.f50308v0;
        if (l00Var2 != null) {
            l00Var2.e(z11, z10);
        }
    }

    public final boolean m4() {
        ArrayList arrayList = this.E2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void m5(boolean z10, boolean z11) {
        boolean z12;
        int i3;
        if (this.f50271o0 != null) {
            org.telegram.ui.ActionBar.q0 q0Var = this.f50267n0;
            if (q0Var == null || q0Var.getVisibility() != 0) {
                boolean z13 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < getDownloadController().H.size()) {
                        if (getFileLoader().T(((org.telegram.messenger.zi) getDownloadController().H.get(i10)).S0())) {
                            z12 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z12 = false;
                        break;
                    }
                }
                if (getDownloadController().J.size() <= 0 && !z12 && (this.f50240h0.getVisibility() != 0 || this.f50240h0.getAlpha() != 1.0f || z11)) {
                    this.f50249j0 = false;
                } else {
                    this.f50249j0 = true;
                }
                J3();
                boolean z14 = org.telegram.messenger.t0.f25457b.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i11 = this.f50226e2;
                if (i11 == 3 || i11 == 5) {
                    z13 = true;
                }
                org.telegram.ui.ActionBar.y0 y0Var = this.f50276p0;
                if (z14) {
                    if (z13) {
                        i3 = 2131748616;
                    } else {
                        i3 = 2131748615;
                    }
                } else {
                    i3 = 2131748614;
                }
                y0Var.setSubtext(org.telegram.messenger.bd.M0(i3, null));
                this.f50271o0.b(z14, z13, z10);
            }
        }
    }

    public final void n4(boolean z10) {
        int i3;
        boolean z11;
        this.actionBar.u();
        this.J2.clear();
        org.telegram.ui.ActionBar.w1 w1Var = this.f50231f1;
        boolean z12 = true;
        if (w1Var != null) {
            w1Var.c(true, 0.0f);
        }
        jw jwVar = this.A0;
        if (jwVar != null) {
            jwVar.b(org.telegram.ui.ActionBar.k6.K8, org.telegram.ui.ActionBar.k6.I8, org.telegram.ui.ActionBar.k6.J8, org.telegram.ui.ActionBar.k6.L8, org.telegram.ui.ActionBar.k6.f27878d6);
        }
        ValueAnimator valueAnimator = this.f50317w3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f50317w3 = null;
        }
        if (this.f50311v3 == 0.0f) {
            return;
        }
        O4(-f4());
        boolean z13 = false;
        int i10 = 0;
        while (true) {
            tw[] twVarArr = this.f50230f0;
            if (i10 >= twVarArr.length) {
                break;
            }
            tw twVar = twVarArr[i10];
            if (twVar != null) {
                twVar.f49897a.I0(true);
            }
            i10++;
        }
        if (this.L) {
            i3 = 81;
        } else {
            i3 = 0;
        }
        float max = Math.max(0.0f, org.telegram.messenger.g0.L(i3 + 48) + this.O);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f50311v3, 0.0f);
        this.f50317w3 = ofFloat;
        ofFloat.addUpdateListener(new eu(this, max, 1));
        this.f50317w3.addListener(new xv(this, max, 0));
        this.f50317w3.setInterpolator(org.telegram.ui.Components.xq.f40452f);
        this.f50317w3.setDuration(200L);
        this.f50317w3.start();
        this.Z0 = false;
        ArrayList arrayList = this.f50209b1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                org.telegram.messenger.mo moVar = (org.telegram.messenger.mo) arrayList.get(i11);
                ez.z0(moVar, moVar.f24242g, moVar.f24238b, moVar.f24239c, moVar.f24248n, moVar.f24247m, moVar.h, moVar.f24243i, moVar.f24244j, false, false, true, true, false, this, null);
                i11++;
                arrayList = arrayList;
                size = size;
                z13 = false;
                z12 = true;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.f50203a1) {
            getMessagesController().m4(this.X2, 0L, null);
            z11 = 0;
            this.f50203a1 = false;
        } else {
            z11 = 0;
        }
        f5(true);
        if (this.f50230f0 != null) {
            int i12 = z11;
            while (true) {
                tw[] twVarArr2 = this.f50230f0;
                if (i12 >= twVarArr2.length) {
                    break;
                }
                twVarArr2[i12].d.I = z11;
                i12++;
            }
        }
        int i13 = org.telegram.messenger.hp.C8;
        int i14 = z11;
        if (z10) {
            i14 = 8192;
        }
        u5(i14 | 196608, true);
    }

    public final void n5() {
        int i3;
        int i10;
        if (this.f50301t3 && this.actionBar != null) {
            if (this.X2 == 0 && this.Z2 == 0) {
                i3 = org.telegram.ui.ActionBar.k6.f28216v8;
            } else {
                i3 = org.telegram.ui.ActionBar.k6.O8;
            }
            int themedColor = getThemedColor(i3);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.k6.f28275y8;
            kVar.D(i0.a.f(this.f50327y1, themedColor, getThemedColor(i11)), false);
            this.actionBar.D(i0.a.f(this.f50327y1, getThemedColor(i11), getThemedColor(i11)), true);
            if (this.X2 == 0 && this.Z2 == 0) {
                i10 = org.telegram.ui.ActionBar.k6.f28179t8;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.N8;
            }
            int themedColor2 = getThemedColor(i10);
            this.actionBar.C(i0.a.f(this.f50327y1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.k6.f28292z8)), false);
        }
    }

    public final void o4(boolean z10) {
        if (this.G3.c()) {
            z10 = true;
        }
        if (!z10 || !this.c2) {
            this.U3 = z10;
            l5(true);
            if (z10) {
                gi.l3 l3Var = this.f50281q0;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                gi.l3 l3Var2 = this.f50287r0;
                if (l3Var2 != null) {
                    l3Var2.f(true);
                }
            }
        }
    }

    public final void o5() {
        org.telegram.ui.Components.ro0 ro0Var;
        int i3;
        gv gvVar = this.C1;
        ArrayList arrayList = this.J2;
        if (gvVar != null) {
            this.f50266n.a(!arrayList.isEmpty(), true);
            p5();
            if (arrayList.isEmpty()) {
                if (this.S0 == 3 && this.f50237g2 == null) {
                    i3 = 2131750576;
                } else {
                    i3 = 2131745679;
                }
                String M0 = org.telegram.messenger.bd.M0(i3, null);
                if (this.Q3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(M0);
                } else {
                    this.actionBar.K(M0, true, 350L, org.telegram.ui.Components.xq.h);
                }
                if (this.C1.getTag() != null) {
                    this.C1.k0(false, false, false);
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
                    if (!this.W3 && (ro0Var = this.H2) != null) {
                        this.W3 = true;
                        String M02 = org.telegram.messenger.bd.M0(2131745439, null);
                        ro0Var.j();
                        ro0Var.G = M02;
                        gi.i1 i1Var = ro0Var.f37763a[0];
                        if (M02 != null) {
                            ((org.telegram.ui.ActionBar.k5) i1Var.f12945f).l(M02, false);
                        }
                        org.telegram.ui.Components.jb0 jb0Var = new org.telegram.ui.Components.jb0(ro0Var, 28);
                        ro0Var.H = jb0Var;
                        org.telegram.messenger.g0.i3(jb0Var, 1000L);
                    }
                }
                this.D1.e(Math.max(1, arrayList.size()), true);
                int i10 = this.T0 + (!TextUtils.isEmpty(this.C1.getFieldText()) ? 1 : 0);
                int size = arrayList.size();
                int i11 = 0;
                long j10 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    long longValue = ((Long) obj).longValue();
                    long N1 = getMessagesController().N1(longValue);
                    if (N1 <= 0 && longValue > 0) {
                        N1 = org.telegram.messenger.m5.k(getMessagesController().J2(longValue));
                    }
                    j10 += N1;
                }
                this.D1.i(i10, j10, true);
                this.C1.S1();
                if (this.Q3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(org.telegram.messenger.bd.G(arrayList.size(), "Recipient", new Object[0]));
                } else {
                    this.actionBar.K(org.telegram.messenger.bd.G(arrayList.size(), "Recipient", new Object[0]), false, 350L, org.telegram.ui.Components.xq.h);
                }
            }
            this.Q3 = arrayList.isEmpty();
        } else if (this.S0 == 10) {
            o4(arrayList.isEmpty());
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else if (this.G3.c() && this.G3.getFragment().onBackPressed(z10)) {
            if (z10) {
                this.G3.a();
                cw cwVar = this.D0;
                if (cwVar != null) {
                    cwVar.S();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.f60 f60Var = this.M0;
            if (f60Var != null) {
                if (z10) {
                    f60Var.u();
                    this.M0 = null;
                    return false;
                }
            } else {
                jw jwVar = this.A0;
                if (jwVar != null && jwVar.f32459n) {
                    if (z10) {
                        jwVar.setIsEditing(false);
                        U4(false);
                        return false;
                    }
                } else {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar != null && kVar.v()) {
                        if (z10) {
                            cw cwVar2 = this.D0;
                            if (cwVar2 != null && cwVar2.getVisibility() == 0) {
                                this.D0.R(false);
                            }
                            n4(true);
                            return false;
                        }
                    } else if (this.f50207b.f53841f) {
                        if (z10) {
                            this.Y.f36302r.getText().clear();
                            this.Z.b(false);
                            this.Y.f36302r.clearFocus();
                            return false;
                        }
                    } else {
                        jw jwVar2 = this.A0;
                        if (jwVar2 != null && jwVar2.getVisibility() == 0 && !this.i3) {
                            jw jwVar3 = this.A0;
                            if (!jwVar3.P && !this.f50270n3) {
                                ArrayList arrayList = jwVar3.h;
                                if (!arrayList.isEmpty() && jwVar3.M != ((org.telegram.ui.Components.yy) arrayList.get(0)).f40853a) {
                                    if (z10) {
                                        jw jwVar4 = this.A0;
                                        ArrayList arrayList2 = jwVar4.h;
                                        if (!arrayList2.isEmpty()) {
                                            jwVar4.f((org.telegram.ui.Components.yy) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        gv gvVar = this.C1;
                        if (gvVar != null && gvVar.r0()) {
                            if (z10) {
                                this.C1.j0(true);
                            }
                        } else {
                            mv mvVar = this.F0;
                            if (mvVar.P == 0 && mvVar.T.L0() != 0) {
                                mvVar.h.y0(0);
                                return false;
                            }
                            return super.onBackPressed(z10);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        org.telegram.ui.Components.voip.r0 r0Var;
        jw jwVar;
        if (this.W1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.l(true);
            }
            TLObject tLObject = this.Y1;
            if (tLObject != null) {
                cw cwVar = this.D0;
                if (cwVar != null) {
                    cwVar.f34751e0.Q(this.X1, tLObject);
                }
                this.Y1 = null;
            }
            this.W1 = false;
        }
        if (!this.L && (jwVar = this.A0) != null && jwVar.getVisibility() == 0 && this.f50286r.f53841f) {
            int i3 = (int) (-this.O);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i3 != 0 && i3 != currentActionBarHeight && i3 >= currentActionBarHeight / 2) {
                this.f50230f0[0].f49897a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f50330z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        if (!isInPreviewMode() && (r0Var = this.L0) != null && r0Var.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        N3();
        this.f50293s0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        gi.l3 l3Var;
        super.onBecomeFullyVisible();
        if (q4()) {
            SharedPreferences e12 = org.telegram.messenger.hp.e1();
            boolean z10 = e12.getBoolean("archivehint", true);
            boolean isEmpty = d4(this.currentAccount, this.S0, this.X2, false).isEmpty();
            if (z10 && isEmpty) {
                org.telegram.messenger.hp.e1().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                e12.edit().putBoolean("archivehint", false).commit();
                S4();
            }
        }
        if (this.f50293s0 && !this.f50298t0 && (l3Var = this.f50281q0) != null && this.O3) {
            this.f50298t0 = true;
            this.f50293s0 = false;
            l3Var.w();
        }
        org.telegram.messenger.g0.i3(new au(this, 20), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.f60 f60Var = this.M0;
        if (f60Var != null) {
            f60Var.u();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.s1 s1Var;
        super.onDialogDismiss(dialog);
        if (this.X2 == 0 && this.Z2 == 0 && (s1Var = this.U1) != null && dialog == s1Var && getParentActivity() != null) {
            u3(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i3;
        boolean z10;
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        int i10 = 0;
        if (bundle != null) {
            this.f50263m2 = bundle.getBoolean("onlySelect", false);
            this.f50269n2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f50289r2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.S0 = this.arguments.getInt("dialogsType", 0);
            this.P0 = this.arguments.getBoolean("quote", false);
            this.O0 = this.arguments.getBoolean("reply_to", false);
            this.Q0 = this.arguments.getLong("reply_to_author", 0L);
            this.R0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f50237g2 = this.arguments.getString("selectAlertString");
            this.f50242h2 = this.arguments.getString("selectAlertStringGroup");
            this.f50247i2 = this.arguments.getString("addToGroupAlertString");
            this.f50295s2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f50300t2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f50305u2 = this.arguments.getBoolean("afterSignup", false);
            this.X2 = this.arguments.getInt("folderId", 0);
            long j10 = this.arguments.getLong("community_id", 0L);
            this.Z2 = j10;
            if (j10 != 0) {
                this.f50205a3 = getMessagesController().M0(Long.valueOf(this.Z2));
                this.f50211b3 = getMessagesController().N0(this.Z2);
            }
            this.f50251j2 = this.arguments.getBoolean("resetDelegate", true);
            this.T0 = this.arguments.getInt("messagesCount", 0);
            this.U0 = this.arguments.getInt("hasPoll", 0);
            this.V0 = this.arguments.getBoolean("hasInvoice", false);
            this.f50310v2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f50310v2);
            this.arguments.getInt("otherwiseRelogin");
            this.f50316w2 = this.arguments.getBoolean("allowGroups", true);
            this.f50322x2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f50328y2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.f50332z2 = this.arguments.getBoolean("allowChannels", true);
            this.A2 = this.arguments.getBoolean("allowUsers", true);
            this.B2 = this.arguments.getBoolean("allowBots", true);
            this.C2 = this.arguments.getBoolean("closeFragment", true);
            this.G = this.arguments.getBoolean("allowGlobalSearch", true);
            this.X = this.arguments.getBoolean("hasMainTabs", false);
            byte[] byteArray = this.arguments.getByteArray("requestPeerType");
            if (byteArray != null) {
                try {
                    SerializedData serializedData = new SerializedData(byteArray);
                    this.H = TLRPC.RequestPeerType.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    serializedData.cleanup();
                } catch (Exception unused) {
                }
            }
            this.I = this.arguments.getLong("requestPeerBotId", 0L);
        }
        if (this.S0 == 0) {
            this.V1 = org.telegram.messenger.hp.f1().getBoolean("askAboutContacts", true);
            org.telegram.messenger.az.u();
        }
        org.telegram.messenger.hs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        this.K3 = new za.p(notificationCenter, this);
        if (this.f50273o2 == null) {
            this.f50226e2 = getConnectionsManager().getConnectionState();
            this.K3.d(org.telegram.messenger.hs.f23246i4);
            if (!this.f50263m2) {
                this.K3.d(org.telegram.messenger.hs.I4);
                this.K3.d(org.telegram.messenger.hs.A4);
                this.K3.b(org.telegram.messenger.hs.P2);
                this.K3.b(org.telegram.messenger.hs.f23215d2);
            }
            za.p pVar = this.K3;
            pVar.b(org.telegram.messenger.hs.f23298s);
            pVar.b(org.telegram.messenger.hs.O2);
            pVar.b(org.telegram.messenger.hs.f23292r);
            pVar.b(org.telegram.messenger.hs.Y);
            pVar.b(org.telegram.messenger.hs.O);
            pVar.b(org.telegram.messenger.hs.I2);
            pVar.b(org.telegram.messenger.hs.f23237h0);
            pVar.b(org.telegram.messenger.hs.f23225f0);
            pVar.b(org.telegram.messenger.hs.J);
            pVar.b(org.telegram.messenger.hs.K);
            pVar.b(org.telegram.messenger.hs.M);
            pVar.b(org.telegram.messenger.hs.P0);
            pVar.b(org.telegram.messenger.hs.f23299s0);
            pVar.b(org.telegram.messenger.hs.f23291q5);
            pVar.b(org.telegram.messenger.hs.S0);
            pVar.b(org.telegram.messenger.hs.T1);
            pVar.b(org.telegram.messenger.hs.f23207b5);
            pVar.b(org.telegram.messenger.hs.K2);
            pVar.b(org.telegram.messenger.hs.f23213d0);
            pVar.b(org.telegram.messenger.hs.f23300s1);
            pVar.b(org.telegram.messenger.hs.Y4);
            pVar.b(org.telegram.messenger.hs.Z4);
            pVar.b(org.telegram.messenger.hs.N);
            pVar.b(org.telegram.messenger.hs.f23268m5);
            pVar.b(org.telegram.messenger.hs.f23230f5);
            this.K3.d(org.telegram.messenger.hs.f23269n0);
        }
        za.p pVar2 = this.K3;
        pVar2.b(org.telegram.messenger.hs.f23325w);
        pVar2.b(org.telegram.messenger.hs.S4);
        pVar2.b(org.telegram.messenger.hs.f23201a5);
        pVar2.b(org.telegram.messenger.hs.T);
        pVar2.b(org.telegram.messenger.hs.L4);
        pVar2.b(org.telegram.messenger.hs.f23311t5);
        pVar2.b(org.telegram.messenger.hs.f23324v5);
        pVar2.b(org.telegram.messenger.hs.Z2);
        pVar2.b(org.telegram.messenger.hs.f23216d3);
        pVar2.b(org.telegram.messenger.hs.f23236g5);
        pVar2.b(org.telegram.messenger.hs.f23343y3);
        pVar2.b(org.telegram.messenger.hs.A3);
        pVar2.b(org.telegram.messenger.hs.S5);
        pVar2.b(org.telegram.messenger.hs.T5);
        pVar2.b(org.telegram.messenger.hs.P3);
        pVar2.b(org.telegram.messenger.hs.Q3);
        if (this.S0 == 0) {
            this.K3.b(org.telegram.messenger.hs.f23352z5);
            this.K3.b(org.telegram.messenger.hs.P1);
        }
        u4(getAccountInstance());
        ei.z6 P1 = getMessagesController().P1();
        if (!P1.A) {
            P1.W();
            if (!P1.f11290s) {
                ConnectionsManager.getInstance(P1.f11274a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new ei.x5(P1, 0));
            }
        }
        getMessagesController().b3(this.X2);
        if (this.R3 != null && !getMessagesStorage().R) {
            kt ktVar = this.R3;
            if (ktVar.getParent() != null) {
                ((ViewGroup) ktVar.getParent()).removeView(ktVar);
            }
            this.R3 = null;
        }
        if (q4()) {
            ei.z6 P12 = getMessagesController().P1();
            if (P12.f11296z) {
                P12.T(true);
            }
        } else {
            getMessagesController().P1().W();
        }
        getContactsController().B();
        if (getMessagesController().f23083o6) {
            org.telegram.messenger.nv G1 = getMessagesController().G1();
            if (!G1.f24437e) {
                G1.g(true);
            }
        }
        if (this.Z2 != 0) {
            getMessagesController().V2(0, this.Z2, true);
        }
        org.telegram.messenger.v1 a10 = org.telegram.messenger.v1.a(this.currentAccount);
        if (!a10.f25817e) {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = a10.f25815b;
            if (j11 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                long j12 = currentTimeMillis - j11;
                boolean z11 = org.telegram.messenger.r2.f25040a;
                if (j12 > 43200000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(a10.f25815b);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(currentTimeMillis);
                if (calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            if (z10) {
                a10.f25817e = true;
                ConnectionsManager.getInstance(a10.f25814a).sendRequest(new TL_account.getBirthdays(), new org.telegram.messenger.s1(a10, 0));
            }
        }
        if (this.X) {
            i3 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i3 = 0;
        }
        this.f50248i4 = i3;
        if (this.X) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        }
        this.f50253j4 = i10;
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        za.p pVar = this.K3;
        if (pVar != null) {
            pVar.a();
            this.K3 = null;
        }
        gv gvVar = this.C1;
        if (gvVar != null) {
            gvVar.A0();
        }
        org.telegram.ui.Components.ro0 ro0Var = this.H2;
        if (ro0Var != null) {
            ro0Var.j();
        }
        org.telegram.ui.Components.p11 p11Var = this.I2;
        if (p11Var != null) {
            org.telegram.messenger.g0.r(p11Var);
            this.I2 = null;
        }
        UndoView undoView = this.f50330z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f50284q3.e();
        this.D2 = null;
        int i3 = org.telegram.ui.Components.a10.f31704j1;
    }

    @Override
    public final void onPanTranslationUpdate(float f10) {
        if (this.f50230f0 != null) {
            this.K0 = f10;
            gv gvVar = this.C1;
            int i3 = 0;
            if (gvVar != null && gvVar.r0()) {
                this.fragmentView.setTranslationY(f10);
                while (true) {
                    tw[] twVarArr = this.f50230f0;
                    if (i3 >= twVarArr.length) {
                        break;
                    }
                    twVarArr[i3].setTranslationY(0.0f);
                    i3++;
                }
                if (!this.f50263m2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.ac acVar = this.f50279p3;
                    if (acVar != null) {
                        acVar.l();
                    }
                }
                cw cwVar = this.D0;
                if (cwVar != null) {
                    cwVar.setTranslationY(this.J0);
                    return;
                }
                return;
            }
            while (true) {
                tw[] twVarArr2 = this.f50230f0;
                if (i3 >= twVarArr2.length) {
                    break;
                }
                twVarArr2[i3].setTranslationY(f10);
                i3++;
            }
            if (!this.f50263m2) {
                this.actionBar.setTranslationY(f10);
                org.telegram.ui.Components.ac acVar2 = this.f50279p3;
                if (acVar2 != null) {
                    acVar2.l();
                }
            }
            cw cwVar2 = this.D0;
            if (cwVar2 != null) {
                cwVar2.setTranslationY(this.K0 + this.J0);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.ac acVar = this.T;
        if (acVar != null) {
            acVar.b();
            this.T = null;
        }
        pv pvVar = this.G3;
        if (pvVar != null) {
            pvVar.f47831r = true;
            wv wvVar = pvVar.f47825a;
            if (wvVar != null) {
                wvVar.onPause();
            }
        }
        org.telegram.ui.Components.f60 f60Var = this.M0;
        if (f60Var != null) {
            f60Var.u();
        }
        gv gvVar = this.C1;
        if (gvVar != null) {
            gvVar.C0();
        }
        int i3 = 0;
        UndoView undoView = this.f50330z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        setBulletinDelegate(null);
        if (this.f50230f0 == null) {
            return;
        }
        while (true) {
            tw[] twVarArr = this.f50230f0;
            if (i3 < twVarArr.length) {
                twVarArr[i3].d.getClass();
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        org.telegram.messenger.b9 b9Var;
        if (i3 == 1) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (iArr.length > i10) {
                    String str = strArr[i10];
                    str.getClass();
                    char c2 = 65535;
                    switch (str.hashCode()) {
                        case -1925850455:
                            if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 1365911975:
                            if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 1977429404:
                            if (str.equals("android.permission.READ_CONTACTS")) {
                                c2 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c2) {
                        case 0:
                            if (iArr[i10] == 0) {
                                org.telegram.messenger.us.t(this.currentAccount).Y();
                                break;
                            } else {
                                zg0.I0();
                                continue;
                            }
                        case 1:
                            if (iArr[i10] == 0) {
                                org.telegram.messenger.zb.D().i(null);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (iArr[i10] == 0) {
                                org.telegram.messenger.g0.h3(new au(this, 19));
                                getContactsController().l();
                                continue;
                            } else {
                                SharedPreferences.Editor edit = org.telegram.messenger.hp.f1().edit();
                                this.V1 = false;
                                edit.putBoolean("askAboutContacts", false).commit();
                                break;
                            }
                    }
                }
            }
            if (this.B0) {
                this.B0 = false;
                V4();
            }
        } else if (i3 == 4) {
            for (int i11 : iArr) {
                if (i11 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 30 && (b9Var = FilesMigrationService.f21222e) != null) {
                b9Var.I0();
            }
        }
    }

    @Override
    public final void onResume() {
        boolean z10;
        tw twVar;
        dv dvVar;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.Components.bm0 bm0Var;
        org.telegram.ui.Components.voip.r0 r0Var;
        super.onResume();
        mv mvVar = this.F0;
        char c2 = 0;
        if (mvVar != null) {
            ArrayList arrayList = mvVar.f10855y;
            ei.z6 z6Var = mvVar.f10846s;
            z6Var.l(z6Var.f11279g);
            z6Var.l(z6Var.h);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TL_stories.PeerStories y9 = z6Var.y(((ei.o) arrayList.get(i3)).f10682c);
                if (y9 != null) {
                    z6Var.a0(y9);
                }
            }
        }
        pv pvVar = this.G3;
        if (pvVar != null) {
            pvVar.f47831r = false;
            wv wvVar = pvVar.f47825a;
            if (wvVar != null) {
                wvVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (r0Var = this.L0) != null && r0Var.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        if (this.f50230f0 != null) {
            int i10 = 0;
            while (true) {
                tw[] twVarArr = this.f50230f0;
                if (i10 >= twVarArr.length) {
                    break;
                }
                twVarArr[i10].d.f();
                i10++;
            }
        }
        gv gvVar = this.C1;
        if (gvVar != null) {
            gvVar.D0();
        }
        long j10 = 0;
        if (!this.f50263m2 && this.X2 == 0 && this.Z2 == 0) {
            getMediaDataController().B(4);
        }
        cw cwVar = this.D0;
        if (cwVar != null && (bm0Var = cwVar.f34751e0) != null) {
            bm0Var.f();
        }
        if (!this.f50305u2 && getUserConfig().f22832a0 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.X2 == 0 && this.Z2 == 0 && this.f50220d2 && !this.f50263m2) {
            int i11 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.f50220d2 = false;
                if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i11 <= 28 || org.telegram.messenger.r2.f25041b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i11 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                org.telegram.messenger.j4 j4Var = new org.telegram.messenger.j4(this, z13, z11, z12, parentActivity);
                if (this.f50305u2 && (z11 || z13)) {
                    j10 = 4000;
                }
                org.telegram.messenger.g0.i3(j4Var, j10);
            }
        } else if (!this.f50263m2 && this.X2 == 0 && this.Z2 == 0 && org.telegram.messenger.sr.i() && !org.telegram.messenger.sr.g()) {
            if (getParentActivity() != null) {
                if (!org.telegram.messenger.hp.f1().getBoolean("askedAboutMiuiLockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i12 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder.m(2131624115, 72, getThemedColor(i12), null);
                    alertDialog$Builder.n(i12, getResourceProvider());
                    String M0 = org.telegram.messenger.bd.M0(2131747306, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.U = M0;
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747308, null), new du(this, 10));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751772, null), new org.telegram.ui.Components.lf0(22));
                    showDialog(s1Var);
                }
            } else {
                return;
            }
        } else if (this.X2 == 0 && this.Z2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
            if (getParentActivity() != null) {
                if (!org.telegram.messenger.hp.f1().getBoolean("askedAboutFSILockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    int i13 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder2.m(2131624115, 72, getThemedColor(i13), null);
                    alertDialog$Builder2.n(i13, getResourceProvider());
                    String M02 = org.telegram.messenger.bd.M0(2131747322, null);
                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                    s1Var2.U = M02;
                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747308, null), new du(this, 11));
                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131751772, null), new org.telegram.ui.Components.lf0(23));
                    showDialog(s1Var2);
                }
            } else {
                return;
            }
        }
        V4();
        if (this.f50230f0 != null) {
            int i14 = 0;
            while (true) {
                tw[] twVarArr2 = this.f50230f0;
                if (i14 >= twVarArr2.length) {
                    break;
                }
                tw twVar2 = twVarArr2[i14];
                if (twVar2.f49904s == 0 && twVar2.f49905w == 2 && twVar2.f49899c.L0() == 0 && l4()) {
                    this.f50230f0[i14].f49899c.h1(1, (int) this.O);
                }
                if (i14 == 0) {
                    this.f50230f0[i14].d.getClass();
                } else {
                    this.f50230f0[i14].d.getClass();
                }
                i14++;
            }
        }
        X4();
        setBulletinDelegate(new x8(this, 4));
        if (this.f50290r3) {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
        u5(0, false);
        m5(false, true);
        t5(false);
        D3();
        N3();
        if (this.A0 != null && (twVar = this.f50230f0[0]) != null && (dvVar = twVar.d) != null) {
            int i15 = dvVar.h;
            if (i15 == 7 || i15 == 8) {
                org.telegram.messenger.mo[] moVarArr = getMessagesController().N;
                if (i15 != 7) {
                    c2 = 1;
                }
                org.telegram.messenger.mo moVar = moVarArr[c2];
                if (moVar != null) {
                    this.A0.h(moVar.f24249o);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f10) {
        if (org.telegram.messenger.az.o() <= 0) {
            boolean z11 = org.telegram.messenger.r2.f25040a;
        } else if (this.Z3 && this.f50206a4 == null) {
            R4(f10);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f50236g1.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
            y3();
            h5();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.voip.r0 r0Var;
        uw uwVar;
        pv pvVar = this.G3;
        if (pvVar != null && pvVar.c()) {
            this.G3.getFragment().onTransitionAnimationEnd(z10, z11);
        } else {
            if (z10 && (r0Var = this.L0) != null && r0Var.getVisibility() == 0) {
                this.L0.setVisibility(8);
                this.L0.setBackground(null);
            }
            if (z10 && this.f50305u2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f41328y0.c(false);
                }
            }
        }
        if (!z10 && (uwVar = this.Y2) != null) {
            uwVar.removeSelfFromStack();
        }
        N3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        pv pvVar = this.G3;
        if (pvVar != null && pvVar.c()) {
            this.G3.getFragment().onTransitionAnimationProgress(z10, f10);
        } else {
            org.telegram.ui.Components.voip.r0 r0Var = this.L0;
            if (r0Var != null && r0Var.getVisibility() == 0) {
                if (z10) {
                    this.L0.setAlpha(1.0f - f10);
                } else {
                    this.L0.setAlpha(f10);
                }
            }
        }
        N3();
    }

    public final void p5() {
        org.telegram.ui.Components.ro0 ro0Var = this.H2;
        if (ro0Var != null) {
            int i3 = this.currentAccount;
            ro0Var.h(i3);
            ro0Var.d = org.telegram.messenger.h10.i(org.telegram.messenger.c.a(i3).f21919a).e();
            ArrayList arrayList = ro0Var.f37767f;
            arrayList.clear();
            ArrayList arrayList2 = this.J2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            gi.i1 i1Var = ro0Var.f37763a[0];
            if (ro0Var.f37764b == 1) {
                ((org.telegram.ui.ActionBar.k5) i1Var.f12944e).l(ro0Var.c(i1Var), false);
            }
        }
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.Z3 = true;
            N4(true);
            return;
        }
        this.f50206a4 = null;
        this.Z3 = false;
        N4(false);
        R4(1.0f);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.d2 d2Var) {
        boolean presentFragment = super.presentFragment(d2Var);
        if (presentFragment && this.f50230f0 != null) {
            int i3 = 0;
            while (true) {
                tw[] twVarArr = this.f50230f0;
                if (i3 >= twVarArr.length) {
                    break;
                }
                twVarArr[i3].d.getClass();
                i3++;
            }
        }
        gi.l3 l3Var = this.f50281q0;
        if (l3Var != null) {
            l3Var.f(true);
        }
        gi.l3 l3Var2 = this.f50287r0;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
        org.telegram.ui.Components.ac.e();
        return presentFragment;
    }

    public final boolean q4() {
        if (this.X2 == 1) {
            return true;
        }
        return false;
    }

    public final void q5(boolean z10) {
        boolean z11;
        if (this.m0 == null) {
            return;
        }
        ArrayList arrayList = getDownloadController().H;
        int size = arrayList.size();
        boolean z12 = false;
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                if (ziVar.F0() != null && ziVar.F0().size >= 157286400) {
                    z11 = true;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        ArrayList arrayList2 = getDownloadController().I;
        int size2 = arrayList2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i10);
            i10++;
            org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) obj2;
            if (ziVar2.F0() != null && ziVar2.F0().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        if (!getUserConfig().q() && !getMessagesController().D3() && z11 && z10) {
            z12 = true;
        }
        this.d.a(z12, true);
    }

    public final boolean r4(long j10) {
        if (j10 < 0) {
            return false;
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j10));
        if (!org.telegram.messenger.l10.u(a22)) {
            return false;
        }
        ArrayList l10 = org.telegram.messenger.hp.s1(this.currentAccount).f23102q7.l(-a22.f27150id);
        if ((l10 != null && !l10.isEmpty()) || !org.telegram.messenger.hp.s1(this.currentAccount).f23102q7.e(-a22.f27150id)) {
            return false;
        }
        return true;
    }

    public final void r5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.e5 e5Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        mv mvVar = this.F0;
        org.telegram.ui.Components.e5 e5Var2 = null;
        if (mvVar != null && (e5Var = mvVar.f10825b0) != null && mvVar.f10845r0 != null) {
            Long h = org.telegram.messenger.l10.h(user);
            if (h != null) {
                e5Var.j(h.longValue(), z10);
                e5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z10);
            } else {
                if (user != null) {
                    org.telegram.messenger.hp.s1(mvVar.f10831f);
                    if (org.telegram.messenger.hp.B2(user)) {
                        if (mvVar.O0 == null) {
                            mvVar.O0 = mvVar.getContext().getResources().getDrawable(2131232307).mutate();
                            mvVar.O0 = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), mvVar.O0);
                        }
                        Drawable drawable = mvVar.O0;
                        int i3 = org.telegram.ui.ActionBar.k6.f28073ni;
                        uw uwVar = mvVar.f10832f0;
                        if (uwVar != null) {
                            e6Var = uwVar.getResourceProvider();
                        } else {
                            e6Var = null;
                        }
                        org.telegram.ui.ActionBar.r6.y(mvVar, drawable, i3, e6Var, PorterDuff.Mode.MULTIPLY);
                        e5Var.g(mvVar.O0, z10);
                        e5Var.m(false, z10);
                    }
                }
                e5Var.g(null, z10);
                e5Var.m(false, z10);
            }
            e5Var.k(Integer.valueOf(mvVar.f(org.telegram.ui.ActionBar.k6.f28073ni)));
            mvVar.f10823a0.invalidate();
        }
        if (this.E3 != null && this.actionBar != null) {
            Long h7 = org.telegram.messenger.l10.h(user);
            this.C3 = null;
            if (h7 != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                this.E3.j(h7.longValue(), z10);
                this.E3.m(z11, z10);
                if (z11) {
                    this.C3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
                }
                this.actionBar.setRightDrawableOnClick(new cu(this, 1));
                g11.t(this.currentAccount);
            } else {
                if (user != null) {
                    org.telegram.messenger.hp.s1(this.currentAccount);
                    if (org.telegram.messenger.hp.B2(user)) {
                        if (this.L3 == null) {
                            this.L3 = getParentActivity().getResources().getDrawable(2131232307).mutate();
                            this.L3 = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.L3);
                        }
                        Drawable drawable2 = this.L3;
                        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f28073ni);
                        this.f50324x4 = themedColor;
                        drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                        this.E3.g(this.L3, z10);
                        this.E3.m(false, z10);
                        this.actionBar.setRightDrawableOnClick(new cu(this, 2));
                        g11.t(this.currentAccount);
                    }
                }
                this.E3.g(null, z10);
                this.E3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.e5 e5Var3 = this.E3;
            int i10 = org.telegram.ui.ActionBar.k6.f28073ni;
            e5Var3.k(Integer.valueOf(getThemedColor(i10)));
            org.telegram.ui.Cells.o oVar = this.F3;
            if (oVar != null) {
                oVar.setColor(getThemedColor(i10));
            }
            rv rvVar = this.N0;
            if (rvVar != null && (rvVar.getContentView() instanceof g11)) {
                org.telegram.ui.ActionBar.k5 titleTextView = this.actionBar.getTitleTextView();
                g11 g11Var = (g11) this.N0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.e5 e5Var4 = this.E3;
                    if (rightDrawable == e5Var4) {
                        e5Var2 = e5Var4;
                    }
                }
                g11Var.y(e5Var2, titleTextView);
            }
        }
    }

    public final boolean s3(long j10, View view) {
        if (this.f50263m2 && getMessagesController().t2(j10)) {
            return false;
        }
        Long valueOf = Long.valueOf(j10);
        ArrayList arrayList = this.J2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j10));
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).c0(false, true);
            } else if (view instanceof org.telegram.ui.Cells.f6) {
                ((org.telegram.ui.Cells.f6) view).w(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j10));
        if (view instanceof org.telegram.ui.Cells.t2) {
            ((org.telegram.ui.Cells.t2) view).c0(true, true);
        } else if (view instanceof org.telegram.ui.Cells.f6) {
            ((org.telegram.ui.Cells.f6) view).w(true, true);
        }
        return true;
    }

    public final boolean s4(TLRPC.Dialog dialog) {
        char c2;
        if (dialog == null) {
            return false;
        }
        int i3 = this.f50230f0[0].f49904s;
        org.telegram.messenger.mo moVar = null;
        if ((i3 == 7 || i3 == 8) && (!this.actionBar.v() || this.actionBar.w(null))) {
            org.telegram.messenger.mo[] moVarArr = getMessagesController().N;
            if (this.f50230f0[0].f49904s == 8) {
                c2 = 1;
            } else {
                c2 = 0;
            }
            moVar = moVarArr[c2];
        }
        if (moVar != null) {
            if (moVar.f24244j.indexOfKey(dialog.f27005id) < 0) {
                return false;
            }
            return true;
        }
        return dialog.pinned;
    }

    public final void s5() {
        gi.l3 l3Var;
        boolean W4 = getMessagesController().W4();
        if (this.O3 != W4) {
            k5();
            if (!this.O3 && W4 && (l3Var = this.f50281q0) != null) {
                l3Var.w();
            }
            this.O3 = W4;
        }
        org.telegram.ui.Components.l00 l00Var = this.f50303u0;
        if (l00Var == null) {
            return;
        }
        if (this.S0 == 10) {
            l00Var.setImageResource(2131231195);
            this.f50303u0.setContentDescription(org.telegram.messenger.bd.M0(2131751355, null));
            return;
        }
        l00Var.setImageResource(2131231107);
        this.f50303u0.setContentDescription(org.telegram.messenger.bd.M0(2131748278, null));
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        mv mvVar = this.F0;
        if (mvVar != null) {
            if (this.H0 && !z10) {
                mvVar.setVisibility(0);
            } else {
                mvVar.setVisibility(8);
            }
        }
        l5(true);
        g5();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r6, int r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    public final void t3(kg.l0 l0Var) {
        cw cwVar;
        if (this.f50290r3 && (cwVar = this.D0) != null) {
            ArrayList arrayList = cwVar.D0;
            if (!arrayList.isEmpty()) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (l0Var.b((kg.l0) arrayList.get(i3))) {
                        return;
                    }
                }
            }
            arrayList.add(l0Var);
            iw iwVar = this.Y;
            ArrayList arrayList2 = iwVar.G;
            arrayList2.add(l0Var);
            iwVar.J = arrayList2.size() - 1;
            iwVar.e();
            this.Y.f36302r.getText().clear();
            j5(true, null, null, false, true);
        }
    }

    public final boolean t4() {
        if (this.D2 == null && this.f50273o2 == null) {
            return true;
        }
        return false;
    }

    public final void t5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        boolean z12;
        ei.z6 j42;
        ArrayList arrayList;
        boolean z13;
        boolean z14;
        int i3;
        float f10;
        float f11;
        if (this.F0 != null && this.J == null) {
            pv pvVar = this.G3;
            if ((pvVar == null || !pvVar.c()) && !this.f50290r3 && (kVar = this.actionBar) != null && !kVar.v() && !this.f50263m2) {
                gi.va vaVar = gi.va.G2;
                int i10 = 0;
                if ((vaVar != null && vaVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().L0)) {
                    z10 = false;
                }
                if (!q4() && j4().I()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.Z2 != 0) {
                    z12 = false;
                } else if (q4()) {
                    z12 = !j4().h.isEmpty();
                } else {
                    if (!z11 && (((arrayList = (j42 = j4()).f11279g) != null && arrayList.size() > 0) || j42.J())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z11 = j4().I();
                }
                this.M = z11;
                boolean z15 = this.H0;
                if (!z11 && !z12) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.H0 = z13;
                if (z12 || z13) {
                    mv mvVar = this.F0;
                    if (z13 != z15) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    mvVar.p(z10, z14);
                }
                boolean z16 = this.H0;
                int i11 = 8;
                float f12 = 0.0f;
                if (z16 != z15) {
                    if (z10) {
                        ValueAnimator valueAnimator = this.K;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        if (this.H0 && !isInPreviewMode()) {
                            this.F0.setVisibility(0);
                        }
                        float f13 = this.I0;
                        if (this.H0) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f11);
                        this.K = ofFloat;
                        ofFloat.addUpdateListener(new ei(1, this));
                        this.K.addListener(new org.telegram.ui.Cells.w9(this, 25));
                        this.K.setDuration(200L);
                        this.K.setInterpolator(org.telegram.ui.Components.xq.f40452f);
                        this.K.start();
                    } else {
                        mv mvVar2 = this.F0;
                        if (z16 && !isInPreviewMode()) {
                            i3 = 0;
                        } else {
                            i3 = 8;
                        }
                        mvVar2.setVisibility(i3);
                        if (this.H0) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        this.I0 = f10;
                        View view = this.fragmentView;
                        if (view != null) {
                            view.invalidate();
                        }
                    }
                }
                if (z12 != this.N) {
                    this.N = z12;
                    if (z12) {
                        this.F0.l(false, 1.0f);
                    }
                    if (z10 && !isInPreviewMode()) {
                        this.F0.setVisibility(0);
                        float f14 = -this.O;
                        if (!z12) {
                            f12 = f4();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.J = ofFloat2;
                        ofFloat2.addUpdateListener(new bw(this, f14, z12, f12));
                        this.J.addListener(new vv(this, z12, 2));
                        this.J.setDuration(200L);
                        this.J.setInterpolator(org.telegram.ui.Components.xq.f40452f);
                        this.J.start();
                        return;
                    }
                    this.L = z12;
                    mv mvVar3 = this.F0;
                    if ((z12 || this.M) && !isInPreviewMode()) {
                        i11 = 0;
                    }
                    mvVar3.setVisibility(i11);
                    if (!z12) {
                        O4(0.0f);
                    } else {
                        this.f50333z3 = -org.telegram.messenger.g0.L(81.0f);
                        O4(-f4());
                    }
                    while (true) {
                        tw[] twVarArr = this.f50230f0;
                        if (i10 >= twVarArr.length) {
                            break;
                        }
                        tw twVar = twVarArr[i10];
                        if (twVar != null) {
                            twVar.f49897a.requestLayout();
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

    public final void u3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.X2 == 0 && this.Z2 == 0 && Build.VERSION.SDK_INT >= 33 && zg0.J0(parentActivity)) {
                if (z10) {
                    showDialog(new zg0(parentActivity, !b8.nf.a(), new ou(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().V && this.V1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z10) {
                    org.telegram.ui.ActionBar.s1 s1Var = org.telegram.ui.Components.t4.v(parentActivity, new gu(this, 1)).f27343a;
                    this.U1 = s1Var;
                    showDialog(s1Var);
                    return;
                }
                arrayList.add("android.permission.READ_CONTACTS");
                arrayList.add("android.permission.WRITE_CONTACTS");
                arrayList.add("android.permission.GET_ACCOUNTS");
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 33) {
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                }
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                }
                if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                }
            } else if ((i3 <= 28 || org.telegram.messenger.r2.f25041b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
            if (arrayList.isEmpty()) {
                if (this.B0) {
                    this.B0 = false;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.u5(int, boolean):void");
    }

    @Override
    public final void v() {
        J4(true, true);
    }

    public final void v3(CharSequence charSequence) {
        int i3;
        if (this.C1 != null) {
            if (this.E2 == null && this.F2 == null && this.G2 == null) {
                return;
            }
            if (this.H2 == null) {
                org.telegram.ui.Components.ro0 ro0Var = new org.telegram.ui.Components.ro0(getParentActivity(), getResourceProvider());
                this.H2 = ro0Var;
                ro0Var.setLayoutClickListener(new cu(this, 0));
                this.H2.setOnModeChangeListener(new du(this, 0));
                gv gvVar = this.C1;
                org.telegram.ui.Components.ro0 ro0Var2 = this.H2;
                if (ro0Var2 == null) {
                    gvVar.getClass();
                } else {
                    gvVar.H1 = ro0Var2;
                    gvVar.addView(ro0Var2, 0, b8.mf.e(-1, 48, 51));
                    gvVar.f31132h3 = false;
                    gvVar.I();
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
                    org.telegram.ui.Components.ro0 ro0Var3 = this.H2;
                    ro0Var3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        ro0Var3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.G2;
                    if (charSequence2 != null) {
                        org.telegram.ui.Components.ro0 ro0Var4 = this.H2;
                        ro0Var4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            ro0Var4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.C1.setFieldText(charSequence);
            }
            gv gvVar2 = this.C1;
            if (m4()) {
                i3 = 2131754454;
            } else {
                i3 = 2131745472;
            }
            gvVar2.setOverrideHint(org.telegram.messenger.bd.M0(i3, null));
            H3();
            if (this.H2.getMode() != 0) {
                this.C1.x1(false, false);
            }
            p5();
        }
    }

    public final void v4(long j10) {
        char c2;
        long j11 = j10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j11);
        int i3 = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList arrayList = (ArrayList) getMessagesController().f23159x.f(dialog.community_id);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                v4(((TLRPC.Dialog) obj).f27005id);
            }
            return;
        }
        int i10 = this.f50230f0[0].f49904s;
        org.telegram.messenger.mo moVar = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.v() || this.actionBar.w(null))) {
            org.telegram.messenger.mo[] moVarArr = getMessagesController().N;
            if (this.f50230f0[0].f49904s == 8) {
                c2 = 1;
            } else {
                c2 = 0;
            }
            moVar = moVarArr[c2];
        }
        int i11 = -1;
        if (moVar != null) {
            int i12 = moVar.f24242g;
            int i13 = org.telegram.messenger.hp.C8;
            if ((i12 & 64) != 0 && !moVar.a(this.currentAccount, dialog)) {
                M4(true, true);
                z3();
                if (this.S1 != null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= this.S1.size()) {
                            break;
                        } else if (((TLRPC.Dialog) this.S1.get(i14)).f27005id == j11) {
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
        if (getMessagesController().t2(j11) || getMessagesController().z2(j11)) {
            org.telegram.messenger.hp messagesController = getMessagesController();
            org.telegram.messenger.qr messagesStorage = messagesController.getMessagesStorage();
            org.telegram.messenger.hl hlVar = new org.telegram.messenger.hl(messagesController, j11);
            org.telegram.messenger.p5 p5Var = messagesStorage.f24934a;
            org.telegram.messenger.a4 a4Var = new org.telegram.messenger.a4(messagesStorage, j11, hlVar, 5);
            j11 = j11;
            p5Var.c(a4Var);
        }
        getMessagesController().o3(j11, 0L);
        org.telegram.messenger.hp messagesController2 = getMessagesController();
        int i16 = dialog.top_message;
        messagesController2.j3(j11, i16, i16, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i15 >= 0) {
            this.S1.remove(i15);
            this.f50230f0[0].f49907y.D();
            this.f50230f0[0].q(true);
        }
    }

    public final boolean v5(long j10) {
        TLRPC.Chat M0;
        gv gvVar;
        if ((this.T0 <= 1 && ((gvVar = this.C1) == null || gvVar.getVisibility() != 0 || TextUtils.isEmpty(this.C1.getFieldText()))) || !org.telegram.messenger.m5.z(j10) || (M0 = getMessagesController().M0(Long.valueOf(-j10))) == null || org.telegram.messenger.t3.N(M0) || !M0.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.t4.t0(this, org.telegram.messenger.bd.M0(2131745320, null), org.telegram.messenger.bd.M0(2131745312, null), null);
        return false;
    }

    public final int w3() {
        if (this.C1 != null) {
            return (int) (this.f50331z1.getInputBubbleHeight() + this.f50313w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(2.0f));
        } else if (this.Z2 != 0) {
            return org.telegram.messenger.g0.L(72.0f) + this.f50239g4;
        } else {
            return this.f50239g4 + this.f50248i4;
        }
    }

    public final boolean w4(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.User r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.w4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    public final boolean x3() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.J2;
            if (i3 < arrayList.size()) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-((Long) arrayList.get(i3)).longValue()));
                if (M0 != null && !org.telegram.messenger.t3.l(M0)) {
                    return false;
                }
                i3++;
            } else {
                return true;
            }
        }
    }

    public final boolean x4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.H;
        if (user != null && !org.telegram.messenger.l10.z(user) && !org.telegram.messenger.l10.x(user)) {
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
        org.telegram.ui.Components.bf0 bf0Var;
        cv cvVar;
        org.telegram.ui.Components.bm0 bm0Var;
        u51 u51Var;
        cw cwVar = this.D0;
        if (cwVar != null && (bm0Var = cwVar.f34751e0) != null && (u51Var = bm0Var.f16970l0) != null) {
            int childCount = u51Var.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = u51Var.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Cells.o4) {
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) childAt;
                    org.telegram.ui.Components.u8 u8Var = o4Var.f29739c;
                    int i10 = o4Var.h;
                    if (org.telegram.messenger.m5.E(o4Var.f29741f)) {
                        TLRPC.User a22 = org.telegram.messenger.hp.s1(i10).a2(Long.valueOf(o4Var.f29741f));
                        o4Var.f29740e = a22;
                        u8Var.r(a22);
                    } else {
                        u8Var.q(org.telegram.messenger.hp.s1(i10).M0(Long.valueOf(-o4Var.f29741f)));
                        o4Var.f29740e = null;
                    }
                    o4Var.c(true);
                }
            }
        }
        if (this.f50230f0 != null) {
            int i11 = 0;
            while (true) {
                tw[] twVarArr = this.f50230f0;
                if (i11 >= twVarArr.length) {
                    break;
                }
                tw twVar = twVarArr[i11];
                if (twVar != null && (cvVar = twVar.f49902n) != null) {
                    cvVar.i();
                }
                i11++;
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.E(getThemedColor(org.telegram.ui.ActionBar.k6.G8), true);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.k6.E8), false, true);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.k6.F8), true, true);
            this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.k6.I5), true);
            this.actionBar.updateColors();
        }
        if (this.E3 != null) {
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.f28073ni);
            Drawable drawable = this.L3;
            if (drawable != null && themedColor2 != this.f50324x4) {
                this.f50324x4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.Components.e5 e5Var = this.E3;
            if (e5Var != null) {
                e5Var.k(Integer.valueOf(themedColor2));
            }
            org.telegram.ui.Cells.o oVar = this.F3;
            if (oVar != null) {
                oVar.setColor(themedColor2);
            }
        }
        org.telegram.ui.Cells.b3 b3Var = this.N1;
        if (b3Var != null) {
            org.telegram.ui.ActionBar.k6.H1(b3Var.getBackground(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27972i6, false), true);
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.f50267n0;
        if (q0Var != null) {
            q0Var.setIconColor(getThemedColor(org.telegram.ui.ActionBar.k6.f28216v8));
        }
        gv gvVar = this.C1;
        if (gvVar != null) {
            gvVar.updateColors();
        }
        jw jwVar = this.A0;
        if (jwVar != null) {
            gh.g gVar = jwVar.f32477z0;
            if (gVar != null) {
                gVar.updateColors();
            }
            jwVar.invalidate();
        }
        kg.n0 n0Var = this.f50214c0;
        if (n0Var != null) {
            n0Var.updateColors();
        }
        cw cwVar2 = this.D0;
        if (cwVar2 != null && (bf0Var = cwVar2.f34764s0) != null) {
            bf0Var.c();
        }
        org.telegram.ui.Components.m61 m61Var = this.f50208b0;
        if (m61Var != null) {
            m61Var.updateColors();
        }
        sy0 sy0Var = this.f50202a0;
        if (sy0Var != null) {
            sy0Var.updateColors();
        }
        if (this.L0 != null) {
            int o10 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6), 100);
            if (this.L0.getForeground() instanceof ColorDrawable) {
                if (((ColorDrawable) this.L0.getForeground()).getColor() != o10) {
                    ((ColorDrawable) this.L0.getForeground()).setColor(o10);
                }
            } else {
                this.L0.setForeground(new ColorDrawable(o10));
            }
        }
        org.telegram.ui.Components.l00 l00Var = this.f50303u0;
        if (l00Var != null) {
            l00Var.updateColors();
        }
        org.telegram.ui.Components.l00 l00Var2 = this.f50308v0;
        if (l00Var2 != null) {
            l00Var2.updateColors();
        }
        int i12 = org.telegram.ui.ActionBar.k6.f27878d6;
        this.n4.a(getThemedColor(i12));
        org.telegram.ui.Components.pr prVar = this.K1;
        if (prVar != null) {
            prVar.updateColors();
        }
        org.telegram.ui.Components.or orVar = this.L1;
        if (orVar != null) {
            orVar.setColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        }
        ev evVar = this.I1;
        if (evVar != null) {
            evVar.updateColors();
        }
        ev evVar2 = this.G1;
        if (evVar2 != null) {
            evVar2.updateColors();
        }
        n5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        mv mvVar = this.F0;
        if (mvVar != null) {
            mvVar.o();
        }
        if (this.D3 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Ul)) != this.f50318w4) {
            this.f50318w4 = themedColor;
            this.D3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        iw iwVar = this.Y;
        if (iwVar != null) {
            iwVar.updateColors();
        }
    }

    public final void y4(View view) {
        boolean z10;
        int i3;
        int i10;
        String str;
        int i11;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(getParentActivity(), false, 1, null);
        if (getMessagesStorage().M != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i3 = 2131232215;
        } else {
            i3 = 0;
        }
        if (org.telegram.messenger.az.f21657q1) {
            i10 = 2131230998;
        } else {
            i10 = 2131231002;
        }
        int[] iArr = {i3, i10};
        if (z10) {
            str = org.telegram.messenger.bd.M0(2131748690, null);
        } else {
            str = null;
        }
        if (org.telegram.messenger.az.f21657q1) {
            i11 = 2131747254;
        } else {
            i11 = 2131749332;
        }
        CharSequence[] charSequenceArr = {str, org.telegram.messenger.bd.M0(i11, null)};
        m4 m4Var = new m4(this, 1);
        h.M = charSequenceArr;
        h.N = iArr;
        h.L = m4Var;
        showDialog(h);
    }

    public final void z3() {
        org.telegram.messenger.g0.i3(new wu(this, 0), 300L);
    }

    public final void z4(android.view.View r27, int r28, u4.h0 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uw.z4(android.view.View, int, u4.h0):void");
    }
}
