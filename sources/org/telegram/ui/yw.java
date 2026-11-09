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
public class yw extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, pg.b, te.b, ke0 {
    public static float B4;
    public static boolean f52206y4;
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public FrameLayout B1;
    public boolean B2;
    public boolean B3;
    public hw C0;
    public lv C1;
    public boolean C2;
    public Long C3;
    public boolean D;
    public org.telegram.ui.Components.rs0 D0;
    public li.w1 D1;
    public sw D2;
    public Drawable D3;
    public boolean E;
    public rv E0;
    public org.telegram.ui.ActionBar.r0 E1;
    public ArrayList E2;
    public org.telegram.ui.Components.g5 E3;
    public boolean F;
    public org.telegram.ui.Components.nr F0;
    public final TextPaint F1;
    public String F2;
    public org.telegram.ui.Cells.o F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public jv G1;
    public CharSequence G2;
    public uv G3;
    public long H;
    public float H0;
    public FrameLayout H1;
    public org.telegram.ui.Components.qo0 H2;
    public final kv H3;
    public ValueAnimator I;
    public float I0;
    public jv I1;
    public org.telegram.ui.Components.m51 I2;
    public final kv I3;
    public ValueAnimator J;
    public float J0;
    public FrameLayout J1;
    public final ArrayList J2;
    public f J3;
    public boolean K;
    public bi.ec K0;
    public org.telegram.ui.Components.pr K1;
    public boolean K2;
    public ab.b0 K3;
    public boolean L;
    public org.telegram.ui.Components.l60 L0;
    public org.telegram.ui.Components.or L1;
    public int L2;
    public Drawable L3;
    public boolean M;
    public wv M0;
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
    public ot R3;
    public org.telegram.ui.Components.cc S;
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
    public org.telegram.ui.Components.ob0 W0;
    public boolean W1;
    public boolean W2;
    public boolean W3;
    public nw X;
    public org.telegram.ui.Cells.t2 X0;
    public long X1;
    public int X2;
    public float X3;
    public bg.p0 Y;
    public org.telegram.ui.Cells.t2 Y0;
    public TLObject Y1;
    public yw Y2;
    public boolean Y3;
    public fz0 Z;
    public boolean Z0;
    public int Z1;
    public long Z2;
    public boolean Z3;
    public final int f52208a;
    public org.telegram.ui.Components.v61 f52209a0;
    public boolean f52210a1;
    public int f52211a2;
    public TLRPC.Chat f52212a3;
    public ValueAnimator f52213a4;
    public final te.a f52214b;
    public jg.q0 f52215b0;
    public final ArrayList f52216b1;
    public boolean f52217b2;
    public TLRPC.ChatFull f52218b3;
    public org.telegram.ui.Components.k30 f52219b4;
    public final te.a f52220c;
    public float f52221c0;
    public boolean f52222c1;
    public boolean f52223c2;
    public org.telegram.ui.Components.l9 f52224c3;
    public TLRPC.FileLocation f52225c4;
    public final te.a d;
    public ValueAnimator f52226d0;
    public boolean f52227d1;
    public boolean d2;
    public org.telegram.ui.Components.w8 f52228d3;
    public TLRPC.FileLocation f52229d4;
    public final te.a f52230e;
    public xw[] f52231e0;
    public boolean f52232e1;
    public int f52233e2;
    public long f52234e3;
    public org.telegram.ui.Components.cc f52235e4;
    public final te.a f52236f;
    public org.telegram.ui.ActionBar.r0 f52237f0;
    public org.telegram.ui.ActionBar.y1 f52238f1;
    public boolean f52239f2;
    public boolean f52240f3;
    public int f52241f4;
    public org.telegram.ui.ActionBar.r0 f52242g0;
    public final Paint f52243g1;
    public String f52244g2;
    public boolean f52245g3;
    public int f52246g4;
    public final te.a h;
    public ax f52247h0;
    public ImageView f52248h1;
    public String f52249h2;
    public AnimatorSet f52250h3;
    public int f52251h4;
    public boolean f52252i0;
    public NumberTextView f52253i1;
    public String f52254i2;
    public boolean f52255i3;
    public int f52256i4;
    public org.telegram.ui.ActionBar.r0 f52257j0;
    public final ArrayList f52258j1;
    public boolean f52259j2;
    public boolean j3;
    public int f52260j4;
    public org.telegram.ui.ActionBar.r0 f52261k0;
    public org.telegram.ui.ActionBar.r0 f52262k1;
    public boolean f52263k2;
    public float f52264k3;
    public final dh.g f52265k4;
    public org.telegram.ui.ActionBar.r0 f52266l0;
    public org.telegram.ui.ActionBar.r0 l1;
    public boolean f52267l2;
    public boolean f52268l3;
    public final ri.f f52269l4;
    public org.telegram.ui.ActionBar.r0 m0;
    public org.telegram.ui.ActionBar.r0 f52270m1;
    public boolean f52271m2;
    public int f52272m3;
    public final ri.f f52273m4;
    public final te.a f52274n;
    public org.telegram.ui.Components.jg0 f52275n0;
    public org.telegram.ui.ActionBar.r0 n1;
    public boolean f52276n2;
    public boolean f52277n3;
    public final ri.c f52278n4;
    public org.telegram.ui.ActionBar.z0 f52279o0;
    public org.telegram.ui.ActionBar.z0 f52280o1;
    public String f52281o2;
    public boolean f52282o3;
    public final dh.c o4;
    public fi.m3 f52283p0;
    public org.telegram.ui.ActionBar.z0 f52284p1;
    public String f52285p2;
    public org.telegram.ui.Components.cc f52286p3;
    public final dh.c f52287p4;
    public fi.m3 f52288q0;
    public org.telegram.ui.ActionBar.z0 f52289q1;
    public final org.telegram.messenger.xr f52290q2;
    public final h2.f f52291q3;
    public final dh.c f52292q4;
    public final te.a f52293r;
    public boolean f52294r0;
    public org.telegram.ui.ActionBar.z0 f52295r1;
    public boolean f52296r2;
    public boolean f52297r3;
    public final dh.c f52298r4;
    public final te.a f52299s;
    public boolean f52300s0;
    public org.telegram.ui.ActionBar.z0 f52301s1;
    public boolean f52302s2;
    public boolean f52303s3;
    public wu f52304s4;
    public org.telegram.ui.Components.q00 f52305t0;
    public org.telegram.ui.ActionBar.z0 f52306t1;
    public boolean f52307t2;
    public boolean f52308t3;
    public final ArrayList f52309t4;
    public org.telegram.ui.Components.q00 f52310u0;
    public org.telegram.ui.ActionBar.z0 f52311u1;
    public boolean f52312u2;
    public boolean f52313u3;
    public final RectF f52314u4;
    public fi.d f52315v0;
    public float f52316v1;
    public boolean f52317v2;
    public float f52318v3;
    public final RectF f52319v4;
    public final rh.h f52320w;
    public lh.f f52321w0;
    public float f52322w1;
    public boolean f52323w2;
    public ValueAnimator f52324w3;
    public int f52325w4;
    public boolean f52326x;
    public int f52327x0;
    public AnimatorSet f52328x1;
    public boolean f52329x2;
    public float f52330x3;
    public int f52331x4;
    public int f52332y;
    public final UndoView[] f52333y0;
    public float f52334y1;
    public boolean f52335y2;
    public float f52336y3;
    public ow f52337z0;
    public jh.f f52338z1;
    public boolean f52339z2;
    public float f52340z3;
    public static final boolean[] f52207z4 = new boolean[4];
    public static final org.telegram.ui.Components.rp0 A4 = new org.telegram.ui.Components.rp0(3);

    public yw(Bundle bundle) {
        super(bundle);
        int i7;
        int L;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            i7 = 48;
        } else {
            i7 = 0;
        }
        this.f52208a = i7;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.f52214b = new te.a(1, this, xqVar, 350L, false);
        this.f52220c = new te.a(2, this, xqVar, 350L, false);
        this.d = new te.a(3, this, xqVar, 350L, false);
        this.f52230e = new te.a(4, this, xqVar, 350L, false);
        this.f52236f = new te.a(5, this, xqVar, 350L, false);
        this.h = new te.a(6, this, xqVar, 350L, false);
        this.f52274n = new te.a(7, this, xqVar, 350L, false);
        this.f52293r = new te.a(8, this, xqVar, 350L, false);
        this.f52299s = new te.a(9, this, xqVar, 350L, false);
        this.f52320w = new rh.h(new eu(this, 18));
        this.f52332y = -1;
        this.F = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.Q = true;
        this.f52221c0 = 1.0f;
        this.f52333y0 = new UndoView[2];
        this.f52216b1 = new ArrayList();
        this.f52243g1 = new Paint();
        this.f52258j1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.F1 = new TextPaint(1);
        this.V1 = true;
        this.d2 = true;
        this.f52259j2 = true;
        this.f52290q2 = new Object();
        this.J2 = new ArrayList();
        this.K2 = true;
        this.f52291q3 = new h2.f((int[]) null);
        this.H3 = new kv(this, 0);
        this.I3 = new kv(this, 1);
        this.M3 = -4;
        this.N3 = true;
        this.O3 = true;
        this.X3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f52309t4 = arrayList;
        RectF rectF = new RectF();
        this.f52314u4 = rectF;
        RectF rectF2 = new RectF();
        this.f52319v4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        ri.c d = this.glassEngine.d(new hu(this, 12));
        this.f52278n4 = d;
        if (i10 >= 31) {
            dh.g gVar = new dh.g(false);
            this.f52265k4 = gVar;
            ri.f fVar = new ri.f(d);
            this.f52273m4 = fVar;
            fVar.f54585f = d;
            fVar.d = gVar;
            fVar.f54584e = -2;
            ri.f fVar2 = new ri.f(null);
            this.f52269l4 = fVar2;
            fVar2.f54585f = d;
            fVar2.d = gVar;
            fVar2.f54584e = -3;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.f52292q4 = cVar;
            cVar.f8708k = true;
            if (org.telegram.messenger.sc.e(262144)) {
                L = org.telegram.messenger.g0.L(8.0f);
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            cVar.d = L;
            cVar.f8703e = L;
            dh.c cVar2 = new dh.c(fVar2, fVar2, fVar2);
            this.o4 = cVar2;
            cVar2.f8708k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L2;
            cVar2.f8703e = L2;
            this.f52287p4 = new dh.c(fVar2, fVar2, fVar2);
        } else {
            this.f52265k4 = null;
            this.f52269l4 = null;
            this.f52273m4 = null;
            this.o4 = new dh.c(d, d, d);
            this.f52292q4 = new dh.c(d, d, d);
            this.f52287p4 = new dh.c(d, d, d);
        }
        dh.c cVar3 = new dh.c(d, d, d);
        this.f52298r4 = cVar3;
        dh.c cVar4 = this.f52292q4;
        oi.q qVar = this.glassEngine;
        cVar4.f8707j = qVar;
        this.o4.f8707j = qVar;
        this.f52287p4.f8707j = qVar;
        cVar3.f8707j = qVar;
    }

    public static void A0(yw ywVar) {
        if (!ywVar.O3) {
            fi.m3 m3Var = ywVar.f52288q0;
            if (m3Var != null) {
                if (m3Var.V) {
                    return;
                }
                org.telegram.messenger.g0.E2(m3Var);
            }
            SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(org.telegram.messenger.id.N0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.l6.uj, 0, new eu(ywVar, 24), null);
            fi.m3 m3Var2 = new fi.m3(ywVar.getParentActivity(), 2);
            m3Var2.s(8.0f);
            m3Var2.d = 8000L;
            m3Var2.k(true);
            m3Var2.r(true);
            m3Var2.h = org.telegram.messenger.g0.f22563q.x - org.telegram.messenger.g0.L(148.0f);
            m3Var2.u(S2);
            m3Var2.o(1.0f, -40.0f);
            m3Var2.j(ywVar.getThemedColor(org.telegram.ui.ActionBar.l6.tj));
            ywVar.f52288q0 = m3Var2;
            m3Var2.setTranslationY((-ywVar.f52246g4) - ywVar.f52256i4);
            ((ViewGroup) ywVar.fragmentView).addView(ywVar.f52288q0, c8.ha.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            ywVar.f52288q0.w();
            return;
        }
        fi.m3 m3Var3 = ywVar.f52283p0;
        if (m3Var3 != null) {
            m3Var3.f(true);
        }
        di.t6 o4 = org.telegram.messenger.qp.s1(ywVar.currentAccount).P1().o();
        if (o4 != null && o4.a(ywVar.currentAccount, 1)) {
            ywVar.showDialog(new ug.i0(o4.b(), ywVar.currentAccount, ywVar.getParentActivity(), ywVar, null));
            return;
        }
        fi.va D = fi.va.D(ywVar.getParentActivity(), ywVar.currentAccount);
        D.f13012y = new fv(ywVar);
        D.Q(null);
    }

    public static void B0(yw ywVar) {
        org.telegram.messenger.qp.s1(ywVar.currentAccount).k4(0L, "PREMIUM_CHRISTMAS");
        ywVar.g5();
        org.telegram.ui.Components.cc G = org.telegram.ui.Components.hc.a0(ywVar).G(2131624033, 4, org.telegram.messenger.id.M0(2131753330, null));
        G.f32627j = 5000;
        G.j();
    }

    public static void C0(org.telegram.ui.yw r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.C0(org.telegram.ui.yw, int):void");
    }

    public static void D0(yw ywVar) {
        org.telegram.messenger.qp.s1(ywVar.currentAccount).k4(0L, "BIRTHDAY_SETUP");
        ywVar.g5();
        org.telegram.ui.Components.cc K = org.telegram.ui.Components.hc.a0(ywVar).K(2131623981, org.telegram.messenger.id.M0(2131753714, null), org.telegram.messenger.id.M0(2131745495, null), new eu(ywVar, 29));
        K.f32627j = 5000;
        K.j();
    }

    public static void E0(yw ywVar) {
        boolean z9 = true;
        try {
            ((org.telegram.ui.Components.ah0) ((org.telegram.ui.Components.w8) ywVar.N1.h.getImageReceiver().m0).K).H(true);
        } catch (Exception unused) {
        }
        if (ywVar.f52219b4 == null) {
            org.telegram.ui.Components.k30 k30Var = new org.telegram.ui.Components.k30(0, true, true);
            ywVar.f52219b4 = k30Var;
            k30Var.H = true;
            k30Var.f35218a = ywVar;
            k30Var.f35219b = new lw(ywVar);
            ywVar.getMediaDataController().x();
            ywVar.getMessagesController().d3();
            ywVar.getMessagesController().g3(ywVar.getUserConfig().f(), true, ywVar.classGuid);
        }
        TLRPC.User a22 = org.telegram.messenger.qp.s1(ywVar.currentAccount).a2(Long.valueOf(org.telegram.messenger.p10.i(ywVar.currentAccount).e()));
        if (a22 == null) {
            a22 = org.telegram.messenger.p10.i(ywVar.currentAccount).f();
        }
        if (a22 != null) {
            org.telegram.ui.Components.di diVar = ywVar.f52219b4.f35220c;
            if (diVar != null) {
                diVar.P0();
            }
            org.telegram.ui.Components.k30 k30Var2 = ywVar.f52219b4;
            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z9 = false;
            }
            k30Var2.n(z9, new eu(ywVar, 28), new nu(ywVar, 3), 0);
        }
    }

    public static void G0(yw ywVar, float f10, ValueAnimator valueAnimator) {
        ywVar.f52231e0[0].setTranslationY((1.0f - ywVar.f52318v3) * f10);
        ywVar.f52318v3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i7 = 0; i7 < ywVar.actionBar.getChildCount(); i7++) {
            if (ywVar.actionBar.getChildAt(i7).getVisibility() == 0 && ywVar.actionBar.getChildAt(i7) != ywVar.actionBar.getActionMode() && ywVar.actionBar.getChildAt(i7) != ywVar.actionBar.getBackButton()) {
                ywVar.actionBar.getChildAt(i7).setAlpha(1.0f - ywVar.f52318v3);
            }
        }
        ywVar.Q3();
        ywVar.I3();
        View view = ywVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void H0(yw ywVar) {
        org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(ywVar.getParentActivity(), ywVar.resourceProvider);
        kbVar.d(2131624008, new String[0]);
        kbVar.f35292b.setText(org.telegram.messenger.id.M0(2131742811, null));
        org.telegram.ui.Components.cc.g(ywVar, kbVar, 2750).j();
        try {
            ywVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void I0(yw ywVar, org.telegram.messenger.t1 t1Var) {
        ArrayList arrayList = t1Var.f25581c;
        if (arrayList.size() == 1) {
            zh.g1 g1Var = new zh.g1(ywVar.getParentActivity(), ywVar.currentAccount, ((TLRPC.User) arrayList.get(0)).f27105id, null, null);
            g1Var.e1(true);
            ywVar.showDialog(g1Var);
            return;
        }
        wg.f1.l1(0, t1Var);
    }

    public static void J0(yw ywVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.cc I = org.telegram.ui.Components.hc.a0(ywVar).I(2131624033, org.telegram.messenger.id.M0(2131746856, null), org.telegram.messenger.id.M0(2131746855, null));
            I.f32627j = 5000;
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
            ywVar.getMessagesStorage().j2(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (ywVar.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ywVar.getParentActivity(), ywVar.resourceProvider);
                String M0 = org.telegram.messenger.id.M0(2131746852, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131746853, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                ywVar.showDialog(u1Var);
                return;
            }
            return;
        }
        org.telegram.messenger.k5.o(null, 2131743879, org.telegram.ui.Components.hc.a0(ywVar), 2131624011, 36);
    }

    public static void K0(yw ywVar) {
        org.telegram.messenger.qp.s1(ywVar.currentAccount).k4(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        ywVar.g5();
    }

    public static void X2(yw ywVar, float f10) {
        float f11;
        float f12;
        int i7;
        int i10;
        float i11 = Utilities.i(ywVar.f52334y1 * 2.0f, 1.0f, 0.0f);
        rv rvVar = ywVar.E0;
        float f13 = (1.0f - ywVar.f52318v3) * f10 * ywVar.H0;
        float f14 = 1.0f - i11;
        rvVar.setAlpha(f13 * f14);
        int i12 = 0;
        if (!ywVar.K && !ywVar.M) {
            if (ywVar.L) {
                ywVar.E0.setTranslationY((Math.max(ywVar.N, -ywVar.g4()) + (-org.telegram.messenger.g0.L(81.0f))) - org.telegram.messenger.g0.L(8.0f));
                ywVar.E0.setProgressToCollapse(1.0f);
                rv rvVar2 = ywVar.E0;
                rvVar2.setClipTop((int) (org.telegram.messenger.g0.f22557m - rvVar2.getY()));
            }
            f11 = 1.0f - ywVar.H0;
            ywVar.actionBar.setTranslationY(0.0f);
        } else {
            float i13 = Utilities.i((-ywVar.N) / org.telegram.messenger.g0.L(81.0f), 1.0f, 0.0f);
            if (ywVar.f52318v3 == 1.0f) {
                i13 = 1.0f;
            }
            float i14 = Utilities.i(i13 / 0.5f, 1.0f, 0.0f);
            ywVar.E0.setClipTop(0);
            if (!ywVar.K && ywVar.M) {
                ywVar.E0.setTranslationY((-org.telegram.messenger.g0.L(81.0f)) - org.telegram.messenger.g0.L(8.0f));
                ywVar.E0.setProgressToCollapse(1.0f);
                f12 = ywVar.H0;
            } else {
                ywVar.E0.setTranslationY(((ywVar.T / 2.0f) + (Math.max(ywVar.N, -ywVar.g4()) + ywVar.f52330x3)) - org.telegram.messenger.g0.L(8.0f));
                ywVar.E0.l(!ywVar.G3.c(), i13);
                if (!ywVar.M) {
                    f12 = ywVar.H0;
                } else {
                    f11 = 1.0f - i14;
                    ywVar.actionBar.setTranslationY(0.0f);
                }
            }
            f11 = 1.0f - f12;
            ywVar.actionBar.setTranslationY(0.0f);
        }
        float f15 = f11 * f14;
        if (f15 != 1.0f) {
            ywVar.actionBar.getTitlesContainer().setPivotY(org.telegram.messenger.g0.f22557m);
            ywVar.actionBar.getTitlesContainer().setPivotX(org.telegram.messenger.g0.L(20.0f));
            float f16 = (0.6f * f15) + 0.4f;
            ywVar.actionBar.getTitlesContainer().setScaleY(f16);
            ywVar.actionBar.getTitlesContainer().setScaleX(f16);
            ywVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            ywVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-org.telegram.messenger.g0.L(30.0f));
            ywVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f16);
            ywVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f16);
            float f17 = (1.0f - ywVar.f52318v3) * f15;
            ywVar.actionBar.getTitlesContainer().setAlpha(f17);
            FrameLayout titlesContainer = ywVar.actionBar.getTitlesContainer();
            int i15 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
            if (i15 > 0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            titlesContainer.setVisibility(i10);
            ywVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
            FrameLayout additionalSubTitleOverlayContainer = ywVar.actionBar.getAdditionalSubTitleOverlayContainer();
            if (i15 <= 0) {
                i12 = 4;
            }
            additionalSubTitleOverlayContainer.setVisibility(i12);
            return;
        }
        ywVar.actionBar.getTitlesContainer().setScaleY(1.0f);
        ywVar.actionBar.getTitlesContainer().setScaleX(1.0f);
        ywVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
        ywVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
        float f18 = 1.0f - ywVar.f52318v3;
        ywVar.actionBar.getTitlesContainer().setAlpha(f18);
        FrameLayout titlesContainer2 = ywVar.actionBar.getTitlesContainer();
        int i16 = (f18 > 0.0f ? 1 : (f18 == 0.0f ? 0 : -1));
        if (i16 > 0) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        titlesContainer2.setVisibility(i7);
        ywVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f18);
        FrameLayout additionalSubTitleOverlayContainer2 = ywVar.actionBar.getAdditionalSubTitleOverlayContainer();
        if (i16 <= 0) {
            i12 = 4;
        }
        additionalSubTitleOverlayContainer2.setVisibility(i12);
    }

    public static void Y2(yw ywVar, Canvas canvas, int i7) {
        org.telegram.ui.ActionBar.q4 q4Var;
        if (ywVar.parentLayout != null && ywVar.actionBar != null) {
            float max = Math.max(ywVar.f52230e.f55499e, ywVar.h4());
            float f10 = 1.0f;
            float f11 = 1.0f - ywVar.f52334y1;
            float f12 = max * f11 * f11;
            int i10 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
            if (i10 != 0) {
                if (-1 >= i7) {
                    f10 = 0.0f;
                    i7 = -1;
                }
                if (f10 > 0.0f && i10 > 0 && i7 > 0 && (q4Var = ywVar.parentLayout) != null) {
                    ((ActionBarLayout) q4Var).p(canvas, (int) (f10 * 255.0f * f12), i7);
                }
            }
        }
    }

    public static void Z(yw ywVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        org.telegram.messenger.qp.s1(ywVar.currentAccount).k4(0L, tL_pendingSuggestion.suggestion);
        ywVar.g5();
    }

    public static void a0(yw ywVar, float f10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ywVar.f52318v3 = floatValue;
        ywVar.f52231e0[0].setTranslationY((-f10) * floatValue);
        for (int i7 = 0; i7 < ywVar.actionBar.getChildCount(); i7++) {
            if (ywVar.actionBar.getChildAt(i7).getVisibility() == 0 && ywVar.actionBar.getChildAt(i7) != ywVar.actionBar.getActionMode() && ywVar.actionBar.getChildAt(i7) != ywVar.actionBar.getBackButton()) {
                ywVar.actionBar.getChildAt(i7).setAlpha(1.0f - ywVar.f52318v3);
            }
        }
        View view = ywVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        ywVar.Q3();
        ywVar.I3();
    }

    public static void b0(yw ywVar) {
        ArrayList arrayList = ywVar.J2;
        org.telegram.ui.ActionBar.q4 q4Var = ywVar.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).y()) {
            ywVar.finishPreviewFragment();
        } else if (ywVar.S0 == 10) {
            if (ywVar.D2 != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    arrayList2.add(org.telegram.messenger.xr.a(((Long) arrayList.get(i7)).longValue(), 0L));
                }
                ywVar.D2.y(ywVar, arrayList2, null, false, ywVar.K2, ywVar.L2, ywVar.M2, null);
            }
        } else if (org.telegram.messenger.qp.s1(ywVar.currentAccount).v2()) {
            b.b(ywVar.currentAccount);
        } else {
            ywVar.presentFragment(new ContactsActivity(a8.p0.k("destroyAfterSelect", true)));
        }
    }

    public static void c0(yw ywVar) {
        org.telegram.messenger.qp.s1(ywVar.currentAccount).k4(0L, "USERPIC_SETUP");
        ywVar.g5();
    }

    public static org.telegram.ui.Cells.t2 c4(xw xwVar) {
        uw uwVar = xwVar.f51772a;
        for (int i7 = 0; i7 < uwVar.getChildCount(); i7++) {
            View childAt = uwVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.t2) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                if (t2Var.V()) {
                    return t2Var;
                }
            }
        }
        return null;
    }

    public static void d0(yw ywVar) {
        PasskeysActivity.f0(ywVar.currentAccount, ywVar.getParentActivity(), ywVar.resourceProvider, true);
    }

    public static void e0(yw ywVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", org.telegram.messenger.p10.i(ywVar.currentAccount).e());
        ywVar.presentFragment(new cn(bundle));
    }

    public static void f0(yw ywVar, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull b22 = ywVar.getMessagesController().b2(ywVar.getUserConfig().e());
        if (b22 != null) {
            tL_birthday2 = b22.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (b22 != null) {
            b22.flags2 |= 32;
            b22.birthday = tL_birthday;
        }
        ywVar.getMessagesController().m2();
        ywVar.getConnectionsManager().sendRequest(updatebirthday, new z9(ywVar, b22, tL_birthday2, 8), 1024);
        org.telegram.messenger.qp.s1(ywVar.currentAccount).k4(0L, "BIRTHDAY_SETUP");
        ywVar.g5();
    }

    public static void g0(yw ywVar, xw xwVar, View view, int i7) {
        int i10;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.x3) {
            return;
        }
        boolean z9 = view instanceof org.telegram.ui.Cells.t2;
        if (z9) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            if (t2Var.f30458n2) {
                ywVar.Z4(t2Var.getDialogId(), view);
                return;
            }
        }
        if (ywVar.U3()) {
            ywVar.A4(view, i7, 0.0f, xwVar.d);
            return;
        }
        int i11 = ywVar.S0;
        if (i11 == 15 && (view instanceof org.telegram.ui.Cells.m8)) {
            xwVar.d.L();
            return;
        }
        int i12 = 0;
        if ((i11 == 11 || i11 == 13) && i7 == 1) {
            Bundle k10 = a8.p0.k("forImport", true);
            k10.putLongArray("result", new long[]{ywVar.getUserConfig().e()});
            k10.putInt("chatType", 4);
            String string = ywVar.arguments.getString("importTitle");
            if (string != null) {
                k10.putString("title", string);
            }
            f50 f50Var = new f50(k10);
            f50Var.Y = new fv(ywVar);
            ywVar.presentFragment(f50Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.b3) && ((i10 = xwVar.f51779s) == 7 || i10 == 8)) {
            jg.l lVar = (jg.l) xwVar.d.M.get(0);
            if (lVar != null && lVar.f54544a == 17) {
                tL_chatlists_chatlistUpdates = lVar.f16824i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                org.telegram.messenger.vo voVar = ywVar.getMessagesController().M[xwVar.f51779s - 7];
                if (voVar != null) {
                    int i13 = voVar.f26070a;
                    ?? naVar = new org.telegram.ui.Components.na(ywVar, false);
                    naVar.Q1 = -1;
                    naVar.U1 = "";
                    naVar.V1 = new ArrayList();
                    naVar.X1 = "";
                    naVar.Z1 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    naVar.f40240a2 = arrayList;
                    naVar.f40256r2 = -1;
                    naVar.f40259u2 = -5;
                    naVar.Q1 = i13;
                    naVar.S1 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    naVar.Y1 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList arrayList2 = ywVar.getMessagesController().P0;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i12 >= arrayList2.size()) {
                                break;
                            } else if (((org.telegram.messenger.vo) arrayList2.get(i12)).f26070a == i13) {
                                naVar.U1 = ((org.telegram.messenger.vo) arrayList2.get(i12)).f26071b;
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    naVar.f1();
                    ywVar.showDialog(naVar);
                    return;
                }
                return;
            }
        } else if (z9 && !ywVar.actionBar.w() && !ywVar.G3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.t2) view).Y1;
            org.telegram.messenger.g0.P.set(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A());
        }
        ywVar.z4(view, i7, xwVar.d);
    }

    public static void h0(yw ywVar) {
        ywVar.presentFragment(new PrivacySettingsActivity());
        org.telegram.messenger.g0.k3(ywVar.parentLayout, "newChatsRow");
    }

    public static void i0(yw ywVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.qp.s1(ywVar.currentAccount).o1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(ywVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new z9(ywVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void j0(yw ywVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(launchActivity, ywVar.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(ywVar.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.f25802b;
        if (tL_attachMenuBots != null) {
            long j3 = b02.f25799a;
            b02.getMessagesStorage().f26719a.c(new org.telegram.messenger.hk(b02.f25810e, 2, j3, b02, tL_attachMenuBots));
        }
    }

    public static void j1(yw ywVar, boolean z9) {
        if (ywVar.f52231e0 != null && ywVar.N3 != z9) {
            ywVar.N3 = z9;
            int i7 = 0;
            while (true) {
                xw[] xwVarArr = ywVar.f52231e0;
                if (i7 < xwVarArr.length) {
                    if (z9) {
                        xwVarArr[i7].f51772a.setScrollbarFadingEnabled(false);
                    }
                    ywVar.f52231e0[i7].f51772a.setVerticalScrollBarEnabled(z9);
                    if (z9) {
                        ywVar.f52231e0[i7].f51772a.setScrollbarFadingEnabled(true);
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public static void k0(yw ywVar) {
        org.telegram.messenger.qp.s1(ywVar.currentAccount).f24774e7.edit().putBoolean("storyhint", false).commit();
    }

    public static void l0(yw ywVar) {
        if (ywVar.f52219b4.g()) {
            org.telegram.messenger.qp.s1(ywVar.currentAccount).k4(0L, "USERPIC_SETUP");
            ywVar.g5();
        }
    }

    public static void n0(yw ywVar) {
        org.telegram.messenger.qp.s1(ywVar.currentAccount).k4(0L, "PREMIUM_GRACE");
        ywVar.g5();
    }

    public static void o0(yw ywVar) {
        org.telegram.messenger.qp.s1(ywVar.currentAccount).k4(0L, "SETUP_PASSKEY");
        ywVar.g5();
    }

    public static void p0(yw ywVar, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
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
            ywVar.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            bi.r3 r3Var = new bi.r3(ywVar, j3, 25);
            Pattern pattern = org.telegram.ui.Components.v4.f38913a;
            if (ywVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = ywVar.getCurrentAccount();
                    Activity parentActivity = ywVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long e11 = org.telegram.messenger.p10.i(currentAccount).e();
                    TextView textView = new TextView(parentActivity);
                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f27973j5, null);
                    textView.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.id.f23157a0) {
                        i7 = 5;
                    } else {
                        i7 = 3;
                    }
                    textView.setGravity(i7 | 48);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    alertDialog$Builder.o(frameLayout);
                    org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
                    w8Var.u(org.telegram.messenger.g0.L(12.0f));
                    org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(parentActivity);
                    l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                    if (org.telegram.messenger.id.f23157a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    frameLayout.addView(l9Var, c8.ha.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(parentActivity);
                    org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.l6.E8, null, 1, 20.0f);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    if (org.telegram.messenger.id.f23157a0) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView2.setGravity(i11 | 16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setText(org.telegram.messenger.id.M0(2131749245, null));
                    boolean z9 = org.telegram.messenger.id.f23157a0;
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
                    if (org.telegram.messenger.id.f23157a0) {
                        i15 = 5;
                    } else {
                        i15 = 3;
                    }
                    frameLayout.addView(textView, c8.ha.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                    if (user != null) {
                        if (org.telegram.messenger.t10.z(user)) {
                            w8Var.f39982p = 0.8f;
                            w8Var.g(12);
                            l9Var.j(null, null, w8Var, user);
                        } else if (user.f27105id == e11) {
                            w8Var.f39982p = 0.8f;
                            w8Var.g(1);
                            l9Var.j(null, null, w8Var, user);
                        } else {
                            w8Var.f39982p = 1.0f;
                            w8Var.r(user);
                            l9Var.e(user, w8Var);
                        }
                    } else {
                        w8Var.q(chat);
                        l9Var.e(chat, w8Var);
                    }
                    textView.setText(org.telegram.messenger.g0.X2(str));
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131749265, null), new org.telegram.ui.Components.u(r3Var, 3));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    ywVar.showDialog(alertDialog$Builder.f27296a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.v4.c0(ywVar.currentAccount, tL_error, ywVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        ywVar.getNotificationCenter().k(org.telegram.messenger.qs.f25091v1, Long.valueOf(j3), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public static void p4(cn cnVar, org.telegram.messenger.ij ijVar) {
        CharSequence charSequence;
        if (ijVar != null && ijVar.r2()) {
            try {
                if (!TextUtils.isEmpty(ijVar.f23318z)) {
                    charSequence = ijVar.f23318z;
                } else {
                    charSequence = ijVar.v;
                }
                CharSequence x12 = org.telegram.messenger.g0.x1(charSequence, ijVar.Y1, null);
                if (x12 instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) x12;
                    org.telegram.ui.Components.yz[] yzVarArr = (org.telegram.ui.Components.yz[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.yz.class);
                    if (yzVarArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(yzVarArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(yzVarArr[0]);
                        for (int i7 = 1; i7 < yzVarArr.length; i7++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(yzVarArr[i7]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(yzVarArr[i7]);
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

    public static void q0(yw ywVar, int i7) {
        Object obj;
        TLRPC.User user;
        org.telegram.ui.Components.ul0 ul0Var = ywVar.C0.f34007q0;
        if (i7 >= ul0Var.Z && i7 < ul0Var.f39791a0) {
            org.telegram.ui.Components.y31 G = ul0Var.G(i7);
            if (G != null) {
                obj = G.G;
            } else {
                obj = null;
            }
        } else {
            obj = Boolean.FALSE;
        }
        if (obj instanceof TLRPC.User) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ywVar.getParentActivity(), ywVar.resourceProvider);
            String M0 = org.telegram.messenger.id.M0(2131754180, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.a0(null, null, 2131754179, "\"" + org.telegram.messenger.t10.p(user) + "\"");
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746321, null), new ru(0, ywVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        }
    }

    public static void r0(yw ywVar, int i7, ArrayList arrayList, boolean z9, HashSet hashSet) {
        HashSet hashSet2;
        if (i7 == 102) {
            ywVar.getMessagesController().f24890s0 = true;
            if (z9) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            ywVar.D4(arrayList, i7, false, false, hashSet2);
            org.telegram.messenger.qp messagesController = ywVar.getMessagesController();
            messagesController.f24890s0 = false;
            messagesController.getNotificationCenter().k(org.telegram.messenger.qs.f25070s, Boolean.TRUE);
            ywVar.getMessagesController().J(ywVar.X2);
            int i10 = ywVar.X2;
            if (i10 != 0 && ywVar.d4(ywVar.currentAccount, ywVar.f52231e0[0].f51779s, i10, false).size() == 0) {
                ywVar.f52231e0[0].f51772a.setEmptyView(null);
                ywVar.f52231e0[0].f51781x.setVisibility(4);
                ywVar.finishFragment();
                return;
            }
            return;
        }
        ywVar.D4(arrayList, i7, false, false, null);
    }

    public static void t0(yw ywVar, int i7, org.telegram.ui.Components.l60 l60Var) {
        CharSequence charSequence;
        if (ywVar.currentAccount != i7) {
            l60Var.u();
            if (ywVar.getParentActivity() == null) {
                return;
            }
            sw swVar = ywVar.D2;
            LaunchActivity launchActivity = (LaunchActivity) ywVar.getParentActivity();
            ArrayList arrayList = ywVar.E2;
            String str = ywVar.F2;
            CharSequence charSequence2 = ywVar.G2;
            lv lvVar = ywVar.C1;
            if (lvVar != null) {
                charSequence = lvVar.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.O0(i7);
            yw ywVar2 = new yw(ywVar.arguments);
            ywVar2.D2 = swVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    ywVar2.E2 = null;
                } else {
                    ywVar2.E2 = arrayList;
                    ywVar2.F2 = null;
                    ywVar2.N2 = false;
                    if (ywVar2.C1 != null) {
                        ywVar2.v3(charSequence);
                    } else {
                        ywVar2.V3 = charSequence;
                    }
                }
            } else if (str != null) {
                ywVar2.Q4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    ywVar2.G2 = null;
                } else {
                    ywVar2.G2 = charSequence2;
                    ywVar2.F2 = null;
                    ywVar2.E2 = null;
                    if (ywVar2.C1 != null) {
                        ywVar2.v3(charSequence);
                    } else {
                        ywVar2.V3 = charSequence;
                    }
                }
            }
            launchActivity.u0(ywVar2, false, true);
        }
    }

    public static void u0(yw ywVar) {
        String str;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(ywVar.currentAccount);
        if (ywVar.B3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        s12.k4(0L, str);
        ywVar.g5();
    }

    public static void u1(yw ywVar, xw xwVar, float f10) {
        if (ywVar.T != f10) {
            ywVar.T = f10;
            int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            int i10 = 0;
            if (i7 == 0) {
                ywVar.U = false;
            }
            ywVar.E0.setOverscroll(f10);
            xwVar.f51772a.setViewsOffset(f10);
            uw uwVar = xwVar.f51772a;
            if (i7 != 0) {
                i10 = 2;
            }
            uwVar.setOverScrollMode(i10);
            ywVar.fragmentView.invalidate();
            if (f10 > org.telegram.messenger.g0.L(90.0f) && !ywVar.U) {
                rv rvVar = ywVar.E0;
                ValueAnimator valueAnimator = rvVar.H0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    rvVar.i(rvVar.f9546p0, true);
                    ywVar.U = true;
                    ywVar.getOrCreateStoryViewer().x(new eu(ywVar, 4));
                }
            }
        }
    }

    public static void u4(org.telegram.messenger.c cVar) {
        int i7 = cVar.f21765a;
        boolean[] zArr = f52207z4;
        if (!zArr[i7]) {
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
            s12.X2();
            s12.U2(0, 0, 100, true, null);
            if (s12.f24889s.isEmpty() && !TextUtils.isEmpty(s12.R3)) {
                TLRPC.TL_help_getRecentMeUrls tL_help_getRecentMeUrls = new TLRPC.TL_help_getRecentMeUrls();
                tL_help_getRecentMeUrls.referer = s12.R3;
                s12.getConnectionsManager().sendRequest(tL_help_getRecentMeUrls, new org.telegram.messenger.rj(s12, 4));
            }
            s12.g3(org.telegram.messenger.p10.i(i7).f(), false, 0);
            org.telegram.messenger.g5.r(i7).f();
            org.telegram.messenger.ui.b0(i7).u(false);
            org.telegram.messenger.g0.i3(new dh(cVar, 18), 200L);
            Iterator it = s12.f24753c4.iterator();
            while (it.hasNext()) {
                org.telegram.messenger.ui.b0(i7).c1((String) it.next(), true, true);
            }
            zArr[i7] = true;
        }
    }

    public static void v0(yw ywVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.G0(launchActivity, ywVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            zc1.a(ywVar.getParentActivity(), new y(ywVar, tL_attachMenuBot, launchActivity, 7), null);
        }
    }

    public static boolean v1(yw ywVar, xw xwVar) {
        if (!ywVar.G3.c()) {
            int i7 = (int) (-ywVar.N);
            int f42 = ywVar.f4();
            int g42 = ywVar.g4();
            if (i7 != 0 && i7 != f42 && i7 != g42 && xwVar.f51772a.canScrollVertically(-1)) {
                if (g42 < i7 && i7 < f42) {
                    int L = org.telegram.messenger.g0.L(48.0f);
                    int i10 = i7 - g42;
                    if (i10 < L / 2) {
                        xwVar.f51773b.x(-i10);
                        return true;
                    }
                    xwVar.f51773b.x(L - i10);
                    return true;
                }
                float f10 = 1.0f;
                if (ywVar.f52318v3 != 1.0f) {
                    f10 = Utilities.i((-ywVar.N) / org.telegram.messenger.g0.L(81.0f), 1.0f, 0.0f);
                }
                if (f10 < ywVar.E0.B0) {
                    xwVar.f51773b.x(-i7);
                    return true;
                }
                xwVar.f51773b.x(g42 - i7);
                return true;
            }
            return false;
        }
        return false;
    }

    public static void w0(yw ywVar) {
        b.c(ywVar.currentAccount, ywVar.getParentActivity(), ywVar.getResourceProvider());
    }

    public static String w2(yw ywVar) {
        String s5;
        ArrayList arrayList = ywVar.J2;
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
                if (longValue == ywVar.getUserConfig().e()) {
                    sb2.append(org.telegram.messenger.id.M0(2131745901, null));
                } else {
                    if (arrayList.size() == 1) {
                        s5 = org.telegram.messenger.m5.l(ywVar.currentAccount, longValue);
                    } else {
                        s5 = org.telegram.messenger.m5.s(ywVar.currentAccount, longValue);
                    }
                    sb2.append(s5);
                }
            }
            return org.telegram.messenger.id.a0(null, null, 2131745439, sb2.toString());
        }
        return org.telegram.messenger.id.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public static void x0(final int i7, final long j3, TLRPC.Chat chat, final yw ywVar, final boolean z9, final boolean z10) {
        final TLRPC.Chat chat2;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        ywVar.n4(false);
        if (i7 == 103 && org.telegram.messenger.t3.T(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || org.telegram.messenger.t3.t0(chat2)) {
                ywVar.getMessagesController().X(2, j3, z10);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i7 == 102 && (i13 = ywVar.X2) != 0 && ywVar.d4(ywVar.currentAccount, ywVar.f52231e0[0].f51779s, i13, false).size() == 1) {
            ywVar.f52231e0[0].f51781x.setVisibility(4);
        }
        int i14 = -1;
        if (i7 == 102) {
            ywVar.M4(true, true);
            if (ywVar.S1 != null) {
                i12 = 0;
                while (i12 < ywVar.S1.size()) {
                    if (((TLRPC.Dialog) ywVar.S1.get(i12)).f26960id == j3) {
                        break;
                    }
                    i12++;
                }
            }
            i12 = -1;
            ywVar.z3();
            i10 = i12;
        } else {
            i10 = -1;
        }
        UndoView k42 = ywVar.k4();
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
                    ywVar.C4(i7, j3, chat2, z9, z10);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(ywVar.d4(ywVar.currentAccount, ywVar.f52231e0[0].f51779s, ywVar.X2, false));
        int i15 = 0;
        while (true) {
            if (i15 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i15)).f26960id == j3) {
                i14 = i15;
                break;
            } else {
                i15++;
            }
        }
        if (i7 == 102) {
            if (i10 >= 0 && i14 < 0 && (arrayList = ywVar.S1) != null) {
                arrayList.remove(i10);
                ywVar.f52231e0[0].f51782y.D();
                ywVar.f52231e0[0].q(true);
                return;
            }
            ywVar.M4(false, true);
        }
    }

    public static void y0(yw ywVar) {
        org.telegram.messenger.v1 a10 = org.telegram.messenger.v1.a(ywVar.currentAccount);
        int i7 = a10.f25933a;
        Set<String> set = a10.d;
        org.telegram.messenger.t1 t1Var = a10.f25935c;
        if (t1Var != null && !set.contains(t1Var.f25579a)) {
            set.add(a10.f25935c.f25579a);
            SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(i7).f24774e7.edit();
            edit.putStringSet("bday_hidden", set);
            edit.apply();
            org.telegram.messenger.qs.f(i7).k(org.telegram.messenger.qs.f25007g5, new Object[0]);
        }
        org.telegram.messenger.qp.s1(ywVar.currentAccount).k4(0L, "BIRTHDAY_CONTACTS_TODAY");
        ywVar.g5();
        org.telegram.ui.Components.cc G = org.telegram.ui.Components.hc.a0(ywVar).G(2131624033, 4, org.telegram.messenger.id.M0(2131753330, null));
        G.f32627j = 5000;
        G.j();
    }

    public static void z0(yw ywVar) {
        org.telegram.messenger.qp.s1(ywVar.currentAccount).k4(0L, "PREMIUM_RESTORE");
        ywVar.g5();
    }

    public final boolean A3(long j3) {
        int i7;
        int i10 = this.S0;
        if (i10 != 15 && i10 != 16 && this.f52254i2 == null && this.f52307t2) {
            if (org.telegram.messenger.m5.z(j3)) {
                long j10 = -j3;
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j10));
                if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                    if (!this.f52296r2) {
                        TLRPC.Chat M02 = org.telegram.messenger.qp.s1(this.currentAccount).M0(Long.valueOf(j10));
                        if ((org.telegram.messenger.t3.n(M02) || M02.megagroup) && (i7 = this.U0) != 2 && i7 != 3) {
                            return true;
                        }
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M03 = org.telegram.messenger.id.M0(2131745596, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
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
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
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

    public final boolean A4(View view, int i7, float f10, org.telegram.ui.Components.pj0 pj0Var) {
        org.telegram.ui.Components.zl0 zl0Var;
        long j3;
        org.telegram.ui.Components.zl0 zl0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long F;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.b3) && pj0Var.d(i7) != 21) {
            if (!this.actionBar.w() && !org.telegram.messenger.g0.Q1() && !this.f52271m2 && (view instanceof org.telegram.ui.Cells.t2)) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                if (!getMessagesController().t2(t2Var.getDialogId()) && !this.G3.c() && t2Var.Z(f10)) {
                    return T4(t2Var);
                }
            }
            uv uvVar = this.G3;
            if (uvVar == null || !uvVar.c()) {
                hw hwVar = this.C0;
                boolean z9 = true;
                if (hwVar != null && pj0Var == (zl0Var2 = hwVar.f33995d0)) {
                    Object I = zl0Var2.I(i7);
                    if (!this.C0.f33995d0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String M0 = org.telegram.messenger.id.M0(2131752054, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.R = M0;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                u1Var.T = org.telegram.messenger.id.a0("ClearSearchSingleChatAlertText", null, 2131752053, qg.d.i(this.currentAccount, chat, false));
                            } else {
                                u1Var.T = org.telegram.messenger.id.a0("ClearSearchSingleChatAlertText", null, 2131752053, chat.title);
                            }
                            F = -chat.f26956id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.f27105id == getUserConfig().f24489n) {
                                u1Var.T = org.telegram.messenger.id.a0("ClearSearchSingleChatAlertText", null, 2131752053, org.telegram.messenger.id.M0(2131745901, null));
                            } else {
                                u1Var.T = org.telegram.messenger.id.a0("ClearSearchSingleUserAlertText", null, 2131752051, org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                            }
                            F = user.f27105id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            u1Var.T = org.telegram.messenger.id.a0("ClearSearchSingleUserAlertText", null, 2131752051, org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                            F = org.telegram.messenger.m5.F(encryptedChat.f26964id);
                        }
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752055, null), new di.c1(this, F, 7));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        showDialog(u1Var);
                        TextView textView = (TextView) u1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, getResourceProvider());
                        }
                        return true;
                    }
                }
                hw hwVar2 = this.C0;
                if (hwVar2 != null && pj0Var == (zl0Var = hwVar2.f33995d0)) {
                    if (this.f52271m2) {
                        z4(view, i7, pj0Var);
                        return false;
                    }
                    if ((view instanceof org.telegram.ui.Cells.g6) && !zl0Var.N(i7)) {
                        j3 = ((org.telegram.ui.Cells.g6) view).getDialogId();
                    } else {
                        j3 = 0;
                    }
                    if (j3 != 0) {
                        Y4(j3, view);
                        return true;
                    }
                } else {
                    Object J = ((jg.n) pj0Var).J(i7);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.f52271m2) {
                            if ((this.S0 == 3 || U3()) && v5(dialog.f26960id)) {
                                if (this.S0 == 1 && U3() && this.f52276n2 && getMessagesController().t2(dialog.f26960id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f26960id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.S0 != 1) {
                                        z9 = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z9);
                                    bundle.putBoolean("quote", this.O0);
                                    bundle.putBoolean("reply_to", this.N0);
                                    y91 y91Var = new y91(bundle);
                                    y91Var.L0 = this;
                                    presentFragment(y91Var);
                                    return false;
                                }
                                s3(dialog.f26960id, view);
                                o5();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            y4(view);
                            return false;
                        } else if (!this.actionBar.w() || !s4(dialog)) {
                            Y4(dialog.f26960id, view);
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
        return this.f52273m4;
    }

    public final void B3(boolean z9) {
        ji.j jVar;
        TLRPC.ChatFull chatFull;
        boolean z10;
        org.telegram.ui.Components.pr prVar = this.K1;
        if (prVar != null && (jVar = this.R1) != null && (chatFull = this.f52218b3) != null) {
            if (this.Z2 != 0 && chatFull.requests_pending > 0 && !this.f52214b.f55500f) {
                z10 = true;
            } else {
                z10 = false;
            }
            prVar.i(jVar, z10, z9);
            this.R1.setTitle(org.telegram.messenger.id.G(this.f52218b3.requests_pending, "CommunityPendingRequestsRow", new Object[0]));
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
        Collections.sort(arrayList, new oe(25));
        org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(this, view);
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
                int i11 = org.telegram.ui.ActionBar.l6.f27957i6;
                Drawable a02 = org.telegram.ui.ActionBar.l6.a0(getThemedColor(i11), 0, 0);
                org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i11);
                org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.s6.j(linearLayout, a02, null, M, resourceProvider);
                TLRPC.User f10 = org.telegram.messenger.p10.i(intValue).f();
                org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
                w8Var.r(f10);
                fi.r3 r3Var = new fi.r3(this, getParentActivity(), z9);
                linearLayout.addView(r3Var, c8.ha.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(getParentActivity());
                if (z9) {
                    l9Var.setScaleX(0.833f);
                    l9Var.setScaleY(0.833f);
                }
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
                l9Var.getImageReceiver().d = intValue;
                l9Var.e(f10, w8Var);
                r3Var.addView(l9Var, c8.ha.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f27973j5, getResourceProvider());
                textView.setText(org.telegram.messenger.t10.p(f10));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, c8.ha.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new bi.la(this, intValue, H, 14));
                H.r(linearLayout, c8.ha.o(230, 48));
            }
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(24.0f), getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.l6.r1(0.15f, -16777216));
        H.f35623z.set(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        H.W(d02);
        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
        H.V(5);
        H.Z();
    }

    public final void C3(org.telegram.ui.xw r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.C3(org.telegram.ui.xw):void");
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
            getNotificationCenter().k(org.telegram.messenger.qs.f25076t, Long.valueOf(j3));
        }
        getMessagesController().J(this.X2);
    }

    public final void D3() {
        getMessagesStorage().getClass();
    }

    public final void D4(java.util.ArrayList r41, int r42, boolean r43, boolean r44, java.util.HashSet r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.D4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    @Override
    public final List E() {
        return Arrays.asList(new pg.a(org.telegram.messenger.id.M0(2131751648, null)), new pg.a(org.telegram.messenger.id.M0(2131752076, null), new eu(this, 14)), new pg.a(org.telegram.messenger.id.M0(2131751649, null), new eu(this, 15)));
    }

    public final void E3() {
        if (this.f52231e0 != null) {
            int w32 = w3();
            int i7 = 0;
            while (true) {
                xw[] xwVarArr = this.f52231e0;
                if (i7 < xwVarArr.length) {
                    xw xwVar = xwVarArr[i7];
                    if (xwVar != null) {
                        uw uwVar = xwVar.f51772a;
                        uwVar.setPadding(0, uwVar.f40345f3, 0, w32);
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void E4(long r14, boolean r16, org.telegram.messenger.vo r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.E4(long, boolean, org.telegram.messenger.vo, int, boolean):void");
    }

    @Override
    public final void F(float f10, int i7) {
        org.telegram.ui.ActionBar.r0 r0Var;
        if (i7 == 3 && (r0Var = this.f52266l0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) r0Var.getIconView().getDrawable();
            if (this.d.f55500f) {
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
        jh.f fVar = this.f52338z1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.f52338z1.getInputBubbleHeight() + this.f52320w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f));
        }
    }

    public final void F4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
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
        xw xwVar;
        boolean z9 = true;
        float e42 = e4(true);
        ow owVar = this.f52337z0;
        if (owVar != null) {
            if (owVar.getAlpha() == e42) {
                z9 = false;
            }
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, e42);
            this.f52337z0.setAlpha(e42);
            this.f52337z0.setScaleX(T1);
            this.f52337z0.setScaleY(T1);
            ow owVar2 = this.f52337z0;
            if (e42 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            owVar2.setVisibility(i7);
            if (z9 && (xwVar = this.f52231e0[0]) != null) {
                xwVar.f51772a.requestLayout();
            }
        }
        e5();
    }

    public final void G4(xw xwVar) {
        int i7;
        org.telegram.ui.Components.mz mzVar;
        if (xwVar.getVisibility() != 0) {
            return;
        }
        int i10 = xwVar.d.f16857w;
        if (xwVar.f51779s == 0 && l4() && xwVar.f51772a.getChildCount() == 0 && xwVar.f51780w == 2) {
            ((v4.b0) xwVar.f51772a.getLayoutManager()).h1(1, (int) this.N);
        }
        xwVar.d.getClass();
        xwVar.d.V();
        int b10 = xwVar.d.b();
        if (b10 == 1 && i10 == 1 && xwVar.d.d(0) == 5) {
            xwVar.q(true);
        } else {
            xwVar.q(false);
            if (b10 > i10 && (i7 = this.S0) != 11 && i7 != 12 && i7 != 13) {
                xwVar.D.b(i10);
            }
        }
        try {
            uw uwVar = xwVar.f51772a;
            if (this.X2 == 0 && this.Z2 == 0) {
                mzVar = xwVar.f51781x;
            } else {
                mzVar = null;
            }
            uwVar.setEmptyView(mzVar);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        C3(xwVar);
    }

    public final void H3() {
        int i7;
        int i10;
        float f10 = this.f52274n.f55499e;
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
        jh.f fVar = this.f52338z1;
        if (fVar != null) {
            fVar.setAlpha(f10);
            jh.f fVar2 = this.f52338z1;
            int i12 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i12 > 0) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            fVar2.setVisibility(i7);
            this.f52338z1.getFadeView().setAlpha(f10);
            View fadeView = this.f52338z1.getFadeView();
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
            animatorSet.setInterpolator(org.telegram.ui.Components.xq.f40458f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    public final void I3() {
        if (this.actionBar == null) {
            return;
        }
        org.telegram.ui.Components.q00.d(this.actionBar.getBackButton(), Math.max(this.f52318v3, (1.0f - this.f52214b.f55499e) * (1.0f - h4()) * (1.0f - this.f52220c.f55499e)));
    }

    public final void I4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.I4(int):void");
    }

    public final void J3() {
        float f10;
        if (this.f52252i0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.q00.d(this.f52242g0, com.google.android.recaptcha.internal.a.D(f10, 1.0f - this.f52214b.f55499e, 1.0f - h4(), 1.0f - this.f52220c.f55499e));
    }

    public final void J4(boolean z9, boolean z10) {
        int i7;
        int i10;
        uv uvVar = this.G3;
        if (uvVar != null && uvVar.c()) {
            return;
        }
        if (this.f52231e0[0].f51779s == 0 && l4() && this.f52231e0[0].f51780w == 2) {
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
            org.telegram.ui.Components.si0 si0Var = this.f52231e0[0].f51778r;
            si0Var.f38080b = 1;
            si0Var.d(i7, i10, false, false);
            H4();
            return;
        }
        this.f52231e0[0].f51774c.h1(i7, i10);
        H4();
    }

    public final void K3() {
        float f10;
        if (org.telegram.messenger.iz.f23434s.isEmpty()) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.q00.d(this.f52237f0, com.google.android.recaptcha.internal.a.D(f10, 1.0f - this.f52214b.f55499e, 1.0f - h4(), 1.0f - this.f52220c.f55499e));
    }

    public final void K4(String str, boolean z9) {
        a5(true, false, true, false);
        bg.p0 p0Var = this.Y;
        if (p0Var != null) {
            p0Var.b(true);
        }
        nw nwVar = this.X;
        if (nwVar != null) {
            nwVar.f37857r.setText(str);
            this.X.f37857r.setSelection(str.length());
        }
    }

    public final void L3() {
        float f10;
        if (this.S0 != 2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.q00.d(this.f52257j0, com.google.android.recaptcha.internal.a.D(f10, this.f52236f.f55499e, 1.0f - h4(), 1.0f - this.f52220c.f55499e));
        rv rvVar = this.E0;
        if (rvVar != null) {
            rvVar.invalidate();
        }
    }

    public final void L4(float f10) {
        xw[] xwVarArr;
        this.f52221c0 = f10;
        for (xw xwVar : this.f52231e0) {
            uw uwVar = xwVar.f51772a;
            for (int i7 = 0; i7 < uwVar.getChildCount(); i7++) {
                View childAt = uwVar.getChildAt(i7);
                if (childAt != null && RecyclerView.R(childAt) >= xwVar.d.f16853f + 1) {
                    childAt.setAlpha(f10);
                }
            }
        }
    }

    public final void M3() {
        org.telegram.ui.Components.q00.d(this.f52266l0, com.google.android.recaptcha.internal.a.D(this.f52214b.f55499e, 1.0f - h4(), 1.0f - this.f52220c.f55499e, this.d.f55499e));
    }

    public final void M4(boolean z9, boolean z10) {
        if (this.f52231e0 != null && this.T1 != z9) {
            if (z9) {
                this.S1 = new ArrayList(d4(this.currentAccount, this.f52231e0[0].f51779s, this.X2, false));
            } else {
                this.S1 = null;
            }
            this.T1 = z9;
            xw xwVar = this.f52231e0[0];
            xwVar.d.G = z9;
            if (!z9 && z10) {
                if (xwVar.f51772a.c0()) {
                    this.f52231e0[0].f51772a.post(new eu(this, 25));
                } else {
                    this.f52231e0[0].d.f();
                }
            }
        }
    }

    public final void N3() {
        boolean z9;
        bi.ec ecVar;
        if (!this.f52263k2 && ((ecVar = this.K0) == null || ecVar.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8)) {
            z9 = true;
        } else {
            z9 = false;
        }
        f fVar = this.J3;
        if (fVar != null) {
            ((le0) fVar.f45545b).f47584w.a(z9, true);
        }
    }

    public final void N4(boolean z9) {
        xw xwVar;
        if (org.telegram.messenger.iz.o() > 1 && org.telegram.messenger.sc.e(32768)) {
            if (z9) {
                xw[] xwVarArr = this.f52231e0;
                if (xwVarArr != null && (xwVar = xwVarArr[0]) != null) {
                    xwVar.setLayerType(2, null);
                    this.f52231e0[0].setClipChildren(false);
                    this.f52231e0[0].setClipToPadding(false);
                    this.f52231e0[0].f51772a.setClipChildren(false);
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
            if (this.f52231e0 != null) {
                int i7 = 0;
                while (true) {
                    xw[] xwVarArr2 = this.f52231e0;
                    if (i7 >= xwVarArr2.length) {
                        break;
                    }
                    xw xwVar2 = xwVarArr2[i7];
                    if (xwVar2 != null) {
                        xwVar2.setLayerType(0, null);
                        xwVar2.setClipChildren(true);
                        xwVar2.setClipToPadding(true);
                        xwVar2.f51772a.setClipChildren(true);
                    }
                    i7++;
                }
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setLayerType(0, null);
            }
            rv rvVar = this.E0;
            if (rvVar != null) {
                rvVar.setLayerType(0, null);
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
        org.telegram.ui.Components.q00.d(this.f52261k0, (1.0f - this.f52214b.f55499e) * (1.0f - h4()) * (1.0f - this.f52220c.f55499e));
        J3();
        M3();
        K3();
        L3();
    }

    public final void O4(float f10) {
        xw[] xwVarArr = this.f52231e0;
        int i7 = 0;
        if (xwVarArr != null) {
            int paddingTop = xwVarArr[0].f51772a.getPaddingTop() + ((int) f10);
            int i10 = 0;
            while (true) {
                xw[] xwVarArr2 = this.f52231e0;
                if (i10 >= xwVarArr2.length) {
                    break;
                }
                xwVarArr2[i10].f51772a.setTopGlowOffset(paddingTop);
                i10++;
            }
        }
        if (this.fragmentView != null && f10 != this.N) {
            this.N = f10;
            org.telegram.ui.Components.cc ccVar = this.f52286p3;
            if (ccVar != null) {
                ccVar.l();
            }
            if (this.F3 != null) {
                float currentActionBarHeight = 1.0f - ((-f10) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                org.telegram.ui.Cells.o oVar = this.F3;
                float f11 = (int) f10;
                float f12 = oVar.f29634f;
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
        this.X.f37857r.setContentDescription(M0);
        this.X.f37857r.setHint(M0);
    }

    public final void P4(float f10) {
        this.f52334y1 = f10;
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
        float max = Math.max(this.f52318v3, this.h.f55499e);
        float f11 = this.f52214b.f55499e;
        if (this.S0 != 2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float max2 = f10 * (1.0f - this.f52220c.f55499e) * (1.0f - max) * Math.max(f11, (1.0f - h4()) * a10);
        this.X.setAlpha(max2);
        nw nwVar = this.X;
        boolean z9 = false;
        if (max2 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        nwVar.setVisibility(i7);
        if (max2 <= 0.01f) {
            z9 = true;
        }
        this.f52236f.a(z9, true);
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
            if (this.f52209a0 != null) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float f11 = f10 * this.f52214b.f55499e;
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, f11);
            this.Z.setScaleX(T1);
            this.Z.setScaleY(T1);
            this.Z.setAlpha(f11);
            fz0 fz0Var = this.Z;
            if (f11 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            fz0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.v61 v61Var = this.f52209a0;
        te.a aVar = this.f52299s;
        if (v61Var != null) {
            float f12 = 1.0f - aVar.f55499e;
            v61Var.setAlpha(f12);
            org.telegram.ui.Components.v61 v61Var2 = this.f52209a0;
            if (f12 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            v61Var2.setVisibility(i7);
        }
        jg.q0 q0Var = this.f52215b0;
        if (q0Var != null) {
            float f13 = aVar.f55499e;
            q0Var.setAlpha(f13);
            jg.q0 q0Var2 = this.f52215b0;
            if (f13 > 0.0f) {
                i11 = 0;
            }
            q0Var2.setVisibility(i11);
        }
    }

    public final void R4(float f10) {
        if (org.telegram.messenger.iz.o() <= 0) {
            boolean z9 = org.telegram.messenger.r2.f25212a;
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
                rv rvVar = this.E0;
                if (rvVar != null) {
                    rvVar.setTranslationX(f11);
                }
                nw nwVar = this.X;
                if (nwVar != null) {
                    nwVar.setTranslationX(f11);
                }
                uv uvVar = this.G3;
                if (uvVar != null && uvVar.getFragmentView() != null && !this.D) {
                    this.G3.getFragmentView().setTranslationX(f11);
                    return;
                }
                return;
            }
            float f12 = 1.0f - this.X3;
            float f13 = (-org.telegram.messenger.g0.L(4.0f)) * f12;
            float f14 = 1.0f - (f12 * 0.05f);
            rv rvVar2 = this.E0;
            if (rvVar2 != null) {
                rvVar2.setScaleX(f14);
                this.E0.setScaleY(f14);
                this.E0.setTranslationX(f13);
                this.E0.setPivotX(0.0f);
                this.E0.setPivotY(0.0f);
            }
            nw nwVar2 = this.X;
            if (nwVar2 != null) {
                nwVar2.setTranslationX(f13);
                this.X.setScaleX(f14);
                this.X.setScaleY(f14);
            }
            uv uvVar2 = this.G3;
            if (uvVar2 != null && uvVar2.getFragmentView() != null) {
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
            int i11 = org.telegram.messenger.g0.f22558n;
            int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(this.f52208a);
            if (this.f52209a0 != null) {
                i7 = org.telegram.messenger.g0.L(50.0f);
            } else {
                i7 = 0;
            }
            int i12 = measuredHeight + i7;
            org.telegram.ui.Components.pr prVar = this.K1;
            if (prVar != null) {
                i10 = (int) prVar.c(org.telegram.messenger.g0.L(7.0f));
            } else {
                i10 = 0;
            }
            int i13 = i12 + i10;
            hw hwVar = this.C0;
            SparseArray sparseArray = hwVar.h;
            hwVar.W0 = i13;
            hwVar.X0 = i11;
            bi.q1 q1Var = hwVar.f33992a0;
            if (z9) {
                q1Var.q1(0, i13, 0, i11);
            } else {
                q1Var.setPadding(0, i13, 0, i11);
            }
            hwVar.O0.j(hwVar.W0, hwVar.X0, z9);
            org.telegram.ui.Components.tl0 tl0Var = hwVar.f33993b0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tl0Var.getLayoutParams();
            int i14 = marginLayoutParams.topMargin;
            int i15 = hwVar.W0;
            if (i14 != i15 || marginLayoutParams.bottomMargin != hwVar.X0) {
                marginLayoutParams.topMargin = i15;
                marginLayoutParams.bottomMargin = hwVar.X0;
                tl0Var.requestLayout();
            }
            org.telegram.ui.Components.gm0.Q(hwVar.f33999h0, hwVar.f34002k0, hwVar.W0, hwVar.X0, z9);
            org.telegram.ui.Components.gm0.Q(hwVar.m0, hwVar.f34006p0, hwVar.W0, hwVar.X0, z9);
            org.telegram.ui.Components.gm0.Q(hwVar.f34010t0, hwVar.f34013w0, hwVar.W0, hwVar.X0, z9);
            org.telegram.ui.Components.af0 af0Var = hwVar.f34008r0;
            int i16 = hwVar.W0;
            int i17 = hwVar.X0;
            af0Var.setClipToPadding(false);
            org.telegram.ui.Components.r41 r41Var = af0Var.f31781c;
            af0Var.J = z9;
            af0Var.setPadding(0, i16, 0, i17);
            if (z9) {
                r41Var.q1(0, i16, 0, i17);
            } else {
                r41Var.setPadding(0, i16, 0, i17);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) r41Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i16;
            marginLayoutParams2.bottomMargin = -i17;
            af0Var.J = false;
            org.telegram.ui.Components.el0 el0Var = hwVar.I0;
            if (el0Var != null) {
                el0Var.b(hwVar.W0, hwVar.X0, z9);
            }
            int size = sparseArray.size();
            for (int i18 = 0; i18 < size; i18++) {
                View view = (View) sparseArray.valueAt(i18);
                if (view instanceof a00) {
                    ((a00) view).j(hwVar.W0, hwVar.X0, z9);
                }
            }
            for (int i19 = 0; i19 < hwVar.getChildCount(); i19++) {
                if (hwVar.getChildAt(i19) instanceof a00) {
                    ((a00) hwVar.getChildAt(i19)).j(hwVar.W0, hwVar.X0, z9);
                }
            }
        }
    }

    public final void S4() {
        getContactsController().B();
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.m51(12, this, r1), new dh(r1, 17));
        org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(getParentActivity(), false, 1, getResourceProvider());
        h.N = p6Var;
        h.U0 = 49;
        h.show();
        org.telegram.ui.ActionBar.v2[] v2VarArr = {h};
        h.P(org.telegram.ui.ActionBar.l6.f27938h5);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.T4(org.telegram.ui.Cells.t2):boolean");
    }

    public boolean U3() {
        if (this.S0 == 10) {
            return true;
        }
        return false;
    }

    public final void U4(boolean z9) {
        float f10;
        this.f52220c.a(z9, true);
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
        this.P3.addListener(new aw(this, z9, 1));
        this.P3.start();
    }

    public final void V3() {
        if (org.telegram.messenger.g0.Q1()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.m(true);
            }
            TLObject tLObject = this.Y1;
            if (tLObject != null) {
                hw hwVar = this.C0;
                if (hwVar != null) {
                    hwVar.f33995d0.Q(this.X1, tLObject);
                }
                this.Y1 = null;
                return;
            }
            return;
        }
        this.W1 = true;
    }

    public final void V4() {
        if (!this.A0 && getMessagesController().U0 && getMessagesController().J3 && this.f52337z0 != null && getMessagesController().T0().isEmpty() && !this.isPaused && getUserConfig().P && !this.inPreviewMode) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            if (!e12.getBoolean("filterhint", false)) {
                e12.edit().putBoolean("filterhint", true).apply();
                org.telegram.messenger.g0.i3(new eu(this, 26), 1000L);
            }
        }
    }

    @Override
    public final boolean W(MotionEvent motionEvent, boolean z9) {
        uv uvVar;
        bi.ec ecVar;
        ow owVar;
        boolean z10;
        boolean z11;
        if (!this.f52297r3 && (((uvVar = this.G3) == null || !uvVar.c()) && (((ecVar = this.K0) == null || ecVar.getVisibility() != 0) && ((owVar = this.f52337z0) == null || !owVar.f33782n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                ow owVar2 = this.f52337z0;
                if (owVar2 != null && owVar2.getTabsCount() >= 2 && this.f52337z0.getCurrentTabId() != this.f52337z0.getFirstTabId()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                ow owVar3 = this.f52337z0;
                if (owVar3 != null && owVar3.getTabsCount() >= 2 && this.f52337z0.getCurrentTabId() != this.f52337z0.getLastTabId()) {
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
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.f27664n0) {
            kVar.l();
            this.f52297r3 = false;
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
        fu fuVar;
        org.telegram.ui.Components.m51 m51Var;
        int i11;
        org.telegram.ui.ActionBar.z0 z0Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i12;
        int w02;
        int w03;
        int w04;
        int i13;
        int w05;
        org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(this, this.f52261k0);
        int i14 = org.telegram.ui.ActionBar.l6.A8;
        H.S(getThemedColor(i14), getThemedColor(i14));
        H.f35617s = 8;
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) parentActivity;
        } else {
            launchActivity = null;
        }
        float f11 = 64.0f;
        int i15 = 0;
        if (this.Z2 != 0) {
            if (org.telegram.messenger.t3.N(this.f52212a3)) {
                H.c(2131232106, org.telegram.messenger.id.M0(2131751913, null), new bv(this, 1), false);
                H.k();
            }
            H.i(new bv(this, 4), org.telegram.messenger.id.M0(2131751912, null), this.f52212a3.collapsed_in_dialogs);
            H.i(new bv(this, 5), org.telegram.messenger.id.M0(2131751911, null), !this.f52212a3.collapsed_in_dialogs);
            H.Z();
            H.X(-org.telegram.messenger.g0.L(64.0f));
        } else if (q4()) {
            H.c(2131232106, org.telegram.messenger.id.M0(2131754143, null), new bv(this, 6), false);
            H.c(2131232182, org.telegram.messenger.id.M0(2131749276, null), new bv(this, 7), false);
            H.Z();
            H.X(-org.telegram.messenger.g0.L(64.0f));
        } else {
            org.telegram.ui.ActionBar.g6 g6Var2 = this.resourceProvider;
            if (g6Var2 != null) {
                q10 = g6Var2.a();
            } else {
                q10 = org.telegram.ui.ActionBar.l6.I.q();
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
            H.c(i7, org.telegram.messenger.id.M0(i10, null), new bv(this, 8), false);
            H.k();
            H.c(2131232483, org.telegram.messenger.id.M0(2131748273, null), new bv(this, 9), false);
            H.c(2131232504, org.telegram.messenger.id.M0(2131745901, null), new bv(this, 10), false);
            org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f25565a;
            if (((org.telegram.messenger.h0) getMessagesController().f24942x7.f24446j0.f13889b).f22780c) {
                H.c(2131231275, org.telegram.messenger.id.M0(2131743194, null), new eu(this, 0), false);
            } else {
                TLRPC.TL_attachMenuBots tL_attachMenuBots = org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24470s0).f25802b;
                if (launchActivity != null && tL_attachMenuBots != null && (arrayList = tL_attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = tL_attachMenuBots.bots;
                    int size = arrayList3.size();
                    int i16 = 0;
                    while (i16 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i16);
                        i16++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_side_menu) {
                            fu fuVar2 = new fu(this, tL_attachMenuBot2, launchActivity, i15);
                            org.telegram.ui.Components.m51 m51Var2 = new org.telegram.ui.Components.m51(14, this, tL_attachMenuBot2);
                            org.telegram.ui.ActionBar.g6 g6Var3 = H.d;
                            if (H.f35592e != null) {
                                int i17 = org.telegram.ui.ActionBar.l6.F8;
                                int i18 = org.telegram.ui.ActionBar.l6.E8;
                                f10 = f11;
                                org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(0, H.f35592e, H.d, false, false);
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
                                    org.telegram.messenger.rz f12 = org.telegram.messenger.t5.f(tL_attachMenuBotIcon.icon, org.telegram.ui.ActionBar.l6.f27848c7, 1.0f, null);
                                    if (f12 != null) {
                                        Integer num = H.f35604k0;
                                        if (num != null) {
                                            w05 = num.intValue();
                                        } else {
                                            w05 = org.telegram.ui.ActionBar.l6.w0(i17, g6Var3);
                                        }
                                        new PorterDuffColorFilter(w05, PorterDuff.Mode.SRC_IN);
                                    }
                                    org.telegram.messenger.hc b10 = org.telegram.messenger.hc.b(tL_attachMenuBotIcon.icon);
                                    fuVar = fuVar2;
                                    z0Var = z0Var2;
                                    m51Var = m51Var2;
                                    CharSequence charSequence2 = charSequence;
                                    i12 = i17;
                                    g6Var = g6Var3;
                                    z0Var.k(charSequence2, b10, "24_24", f12, tL_attachMenuBot2);
                                    org.telegram.ui.Components.l9 l9Var = z0Var.h;
                                    if (l9Var != null) {
                                        if (org.telegram.messenger.id.f23157a0) {
                                            i13 = 5;
                                        } else {
                                            i13 = 3;
                                        }
                                        l9Var.setLayoutParams(c8.ha.e(24, 24, i13 | 16));
                                    }
                                } else {
                                    fuVar = fuVar2;
                                    m51Var = m51Var2;
                                    i11 = 16;
                                    z0Var = z0Var2;
                                    CharSequence charSequence3 = charSequence;
                                    g6Var = g6Var3;
                                    i12 = i17;
                                    z0Var.j(charSequence3, 2131232072, null);
                                }
                                Integer num2 = H.f35602j0;
                                if (num2 == null && H.f35604k0 == null) {
                                    z0Var.c(i18, i12);
                                } else {
                                    if (num2 != null) {
                                        w02 = num2.intValue();
                                    } else {
                                        w02 = org.telegram.ui.ActionBar.l6.w0(i18, g6Var);
                                    }
                                    Integer num3 = H.f35604k0;
                                    if (num3 != null) {
                                        w03 = num3.intValue();
                                    } else {
                                        w03 = org.telegram.ui.ActionBar.l6.w0(i12, g6Var);
                                    }
                                    z0Var.d(w02, w03);
                                }
                                Integer num4 = H.f35604k0;
                                if (num4 != null) {
                                    w04 = num4.intValue();
                                } else {
                                    w04 = org.telegram.ui.ActionBar.l6.w0(i12, g6Var);
                                }
                                z0Var.setIconColorImage(w04);
                                Integer num5 = H.f35606l0;
                                if (num5 != null) {
                                    z0Var.setSelectorColor(num5.intValue());
                                } else {
                                    z0Var.h(0.12f, i18);
                                }
                                z0Var.setOnClickListener(new org.telegram.ui.Components.lk(i11, H, fuVar));
                                z0Var.setOnLongClickListener(new di.f2(3, H, m51Var));
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
                H.c(2131232361, org.telegram.messenger.id.M0(2131745495, null), new bv(this, 3), false);
            }
            org.telegram.ui.ActionBar.z0 z0Var3 = this.f52279o0;
            if (z0Var3 != null) {
                org.telegram.ui.ActionBar.s6.U(z0Var3.f28818b, org.telegram.ui.ActionBar.l6.Oi, getResourceProvider());
                this.f52279o0.setOnClickListener(new org.telegram.ui.Components.u41(12, this, H));
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25566b.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().f24948y3 && !org.telegram.messenger.iz.f23456z1.isEmpty())) {
                    H.k();
                    H.d(this.f52279o0);
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
        org.telegram.ui.ActionBar.y o4 = this.actionBar.o(str);
        boolean z9 = this.W;
        ArrayList arrayList = this.f52258j1;
        if (z9) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f52248h1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f52248h1.setImageDrawable(new org.telegram.ui.ActionBar.y1(true));
            org.telegram.ui.ActionBar.s6.s(this.f52248h1, org.telegram.ui.ActionBar.l6.f28259y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.f52248h1;
            int i7 = org.telegram.ui.ActionBar.l6.f28277z8;
            org.telegram.ui.ActionBar.s6.Q(imageView2, org.telegram.ui.ActionBar.l6.h0(getThemedColor(i7), 1, -1), null, org.telegram.ui.ActionBar.s6.M(i7), getResourceProvider());
            this.f52248h1.setOnClickListener(new gu(this, 6));
            o4.addView(this.f52248h1, c8.ha.r(54, 54, 16));
            arrayList.add(this.f52248h1);
        }
        NumberTextView numberTextView = new NumberTextView(o4.getContext());
        this.f52253i1 = numberTextView;
        int i10 = 18;
        numberTextView.setTextSize(18);
        this.f52253i1.setTypeface(org.telegram.messenger.g0.o());
        this.f52253i1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.l6.f28259y8));
        NumberTextView numberTextView2 = this.f52253i1;
        if (!this.W) {
            i10 = 72;
        }
        o4.addView(numberTextView2, c8.ha.m(1.0f, 0, -1, i10, 0, 0));
        this.f52253i1.setOnTouchListener(new ei.b(2));
        this.l1 = o4.g(100, 2131232293, org.telegram.messenger.g0.L(48.0f));
        this.f52270m1 = o4.g(104, 2131232256, org.telegram.messenger.g0.L(48.0f));
        this.n1 = o4.g(107, 2131232051, org.telegram.messenger.g0.L(48.0f));
        this.f52262k1 = o4.h(102, 2131232108, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.id.M0(2131751598, null));
        org.telegram.ui.ActionBar.r0 h = o4.h(0, 2131231244, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.id.M0(2131754839, null));
        o4.addView(new View(getParentActivity()), c8.ha.o(5, -1));
        this.f52295r1 = h.e(105, 2131232051, org.telegram.messenger.id.M0(2131754172, null));
        this.f52280o1 = h.e(108, 2131232293, org.telegram.messenger.id.M0(2131751453, null));
        this.f52284p1 = h.e(109, 2131232046, org.telegram.messenger.id.M0(2131750812, null));
        this.f52289q1 = h.e(110, 2131232329, org.telegram.messenger.id.M0(2131750712, null));
        this.f52306t1 = h.e(101, 2131232215, org.telegram.messenger.id.M0(2131748681, null));
        this.f52301s1 = h.e(103, 2131232092, org.telegram.messenger.id.M0(2131752089, null));
        this.f52311u1 = h.e(106, 2131232067, org.telegram.messenger.id.M0(2131753692, null));
        this.f52270m1.setOnLongClickListener(new su(this, 1));
        arrayList.add(this.l1);
        arrayList.add(this.n1);
        arrayList.add(this.f52270m1);
        arrayList.add(this.f52262k1);
        arrayList.add(h);
        f5(false);
    }

    public final void X4() {
        if (this.S3 == null) {
            for (String str : getMessagesController().S3) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = org.telegram.messenger.id.M0(2131749319, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749320, null));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131749533, null), new hu(this, 6));
                    showDialog(u1Var, new nu(this, 0));
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
            nw nwVar = this.X;
            te.a aVar = this.f52214b;
            nwVar.setBlurredBackgroundVisibility(aVar.f55499e);
            float a10 = a8.j7.a(aVar.f55499e);
            org.telegram.ui.Components.l9 l9Var = this.f52224c3;
            if (l9Var != null) {
                l9Var.setScaleX(a10);
                this.f52224c3.setScaleY(a10);
                this.f52224c3.setAlpha(a10);
                org.telegram.ui.Components.l9 l9Var2 = this.f52224c3;
                if (a10 > 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                l9Var2.setVisibility(i11);
            }
            if (this.f52315v0 != null) {
                float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a10);
                this.f52315v0.setScaleX(T1);
                this.f52315v0.setScaleY(T1);
                this.f52315v0.setAlpha(a10);
                fi.d dVar = this.f52315v0;
                int i13 = (a10 > 0.0f ? 1 : (a10 == 0.0f ? 0 : -1));
                if (i13 > 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                dVar.setVisibility(i10);
                this.f52321w0.setAlpha(a10);
                lh.f fVar = this.f52321w0;
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
        hw hwVar = this.C0;
        if ((hwVar != null && hwVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f52281o2 != null) {
            i7 = 2;
        } else if (!this.f52271m2) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        hw hwVar2 = new hw(this, getParentActivity(), this, i7, this.S0, this.X2, this.Z2, new fv(this));
        this.C0 = hwVar2;
        this.glassEngine.c(hwVar2);
        ((rw) this.fragmentView).addView(this.C0, this.B0);
        hw hwVar3 = this.C0;
        hwVar3.f33995d0.U = new jw(this);
        hwVar3.f34002k0.setOnItemClickListener(new hu(this, 1));
        this.C0.f34006p0.setOnItemClickListener(new hu(this, 2));
        this.C0.f34013w0.setOnItemClickListener(new mu(this, 0));
        this.C0.f34006p0.setOnItemLongClickListener(new hu(this, 3));
        this.C0.f33992a0.setOnItemClickListener(new hu(this, 4));
        this.C0.f33992a0.setOnItemLongClickListener(new fv(this));
        this.C0.setFilteredSearchViewDelegate(new hu(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.f52287p4);
    }

    public final void Y4(long j3, View view) {
        ArrayList d42;
        int i7;
        s3(j3, view);
        boolean w10 = this.actionBar.w();
        ArrayList arrayList = this.J2;
        boolean z9 = true;
        if (w10) {
            if (arrayList.isEmpty()) {
                n4(true);
                return;
            }
        } else {
            if (this.f52297r3) {
                X3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.r4)) {
                    this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
                }
            } else {
                X3(null);
            }
            org.telegram.messenger.g0.v1(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
            this.actionBar.P(null, null);
            int i10 = this.f52231e0[0].f51779s;
            if ((i10 != 7 && i10 != 8) || (this.actionBar.w() && !this.actionBar.x(null))) {
                d42 = getMessagesController().W0(this.X2);
            } else {
                d42 = d4(this.currentAccount, this.f52231e0[0].f51779s, this.X2, this.T1);
            }
            int size = d42.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) d42.get(i12);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (s4(dialog)) {
                        i11++;
                    } else if (!getMessagesController().C2(dialog.f26960id, false)) {
                        break;
                    }
                }
            }
            if (i11 > 1) {
                if (this.f52231e0 != null) {
                    int i13 = 0;
                    while (true) {
                        xw[] xwVarArr = this.f52231e0;
                        if (i13 >= xwVarArr.length) {
                            break;
                        }
                        xwVarArr[i13].d.H = true;
                        i13++;
                    }
                }
                int i14 = org.telegram.messenger.qp.C8;
                u5(131072, true);
            }
            if (!this.f52297r3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f52258j1;
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
            ValueAnimator valueAnimator = this.f52324w3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f52324w3 = ValueAnimator.ofFloat(this.f52318v3, 1.0f);
            int i16 = 0;
            while (true) {
                xw[] xwVarArr2 = this.f52231e0;
                if (i16 >= xwVarArr2.length) {
                    break;
                }
                xw xwVar = xwVarArr2[i16];
                if (xwVar != null) {
                    xwVar.f51772a.I0(true);
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
            this.f52324w3.addUpdateListener(new iu(this, max, 0));
            this.f52324w3.addListener(new cw(this, max, 1));
            this.f52324w3.setInterpolator(org.telegram.ui.Components.xq.f40458f);
            this.f52324w3.setDuration(200L);
            this.f52324w3.start();
            ow owVar = this.f52337z0;
            if (owVar != null) {
                owVar.b(org.telegram.ui.ActionBar.l6.f28193ui, org.telegram.ui.ActionBar.l6.f28173ti, org.telegram.ui.ActionBar.l6.f28154si, org.telegram.ui.ActionBar.l6.f28211vi, org.telegram.ui.ActionBar.l6.f28221w8);
            }
            org.telegram.ui.ActionBar.y1 y1Var = this.f52238f1;
            if (y1Var != null) {
                y1Var.c(true, 1.0f);
            }
            z9 = false;
        }
        f5(false);
        this.f52253i1.a(arrayList.size(), z9);
    }

    public final void Z3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f52333y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i7 = 0; i7 < 2; i7++) {
                undoViewArr[i7] = new dw(this, parentActivity);
                FrameLayout.LayoutParams d = c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.f52246g4 + this.f52256i4 + d.bottomMargin;
                UndoView undoView = undoViewArr[i7];
                int i10 = this.f52327x0 + 1;
                this.f52327x0 = i10;
                ((rw) this.fragmentView).addView(undoView, i10, d);
            }
        }
    }

    public final void Z4(long j3, View view) {
        String str;
        org.telegram.ui.Components.cc K;
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
            K = org.telegram.ui.Components.hc.a0(this).Q(2131624216, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131743760, str)));
        } else {
            K = org.telegram.ui.Components.hc.a0(this).K(2131624216, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131743760, str)), org.telegram.messenger.id.M0(2131743759, null), new eu(this, 8));
        }
        K.j();
    }

    public final void a4(final long j3, final long j10, boolean z9, final y91 y91Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String M0;
        String b02;
        String M02;
        TLRPC.TL_forumTopic f10;
        if (A3(j3)) {
            int i7 = this.S0;
            if (i7 != 11 && i7 != 12 && i7 != 13) {
                if (z9 && ((this.f52244g2 != null && this.f52249h2 != null) || this.f52254i2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (org.telegram.messenger.m5.C(j3)) {
                            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(getMessagesController().a1(Integer.valueOf((int) (4294967295L & j3))).user_id));
                            if (a22 != null) {
                                M0 = org.telegram.messenger.id.M0(2131745596, null);
                                b02 = org.telegram.messenger.id.b0(this.f52244g2, org.telegram.messenger.t10.p(a22));
                                M02 = org.telegram.messenger.id.M0(2131745640, null);
                            } else {
                                return;
                            }
                        } else if (org.telegram.messenger.m5.E(j3)) {
                            if (j3 == getUserConfig().e()) {
                                M0 = org.telegram.messenger.id.M0(2131745596, null);
                                b02 = org.telegram.messenger.id.b0(this.f52249h2, org.telegram.messenger.id.M0(2131745901, null));
                                M02 = org.telegram.messenger.id.M0(2131745640, null);
                            } else {
                                TLRPC.User a23 = getMessagesController().a2(Long.valueOf(j3));
                                if (a23 != null && this.f52244g2 != null) {
                                    M0 = org.telegram.messenger.id.M0(2131745596, null);
                                    b02 = org.telegram.messenger.id.b0(this.f52244g2, org.telegram.messenger.t10.p(a23));
                                    M02 = org.telegram.messenger.id.M0(2131745640, null);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(-j3));
                            if (M03 != null) {
                                String str = M03.title;
                                if (j10 != 0 && (f10 = getMessagesController().f24877q7.f(M03.f26956id, j10)) != null) {
                                    str = ((Object) str) + " " + f10.title;
                                }
                                if (this.f52254i2 != null) {
                                    M0 = org.telegram.messenger.id.M0(2131754366, null);
                                    b02 = org.telegram.messenger.id.b0(this.f52254i2, str);
                                    M02 = org.telegram.messenger.id.M0(2131754486, null);
                                } else {
                                    M0 = org.telegram.messenger.id.M0(2131745596, null);
                                    b02 = org.telegram.messenger.id.b0(this.f52249h2, str);
                                    M02 = org.telegram.messenger.id.M0(2131745640, null);
                                }
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.g0.X2(b02);
                        alertDialog$Builder.k(M02, new org.telegram.ui.ActionBar.r1() {
                            @Override
                            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                                yw.this.a4(j3, j10, false, y91Var);
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
                    Runnable d3Var = new bi.d3(this, j3, new bi.h4(this, j3, j10, y91Var, 6), 26);
                    if (j3 < 0) {
                        c5(getMessagesController().M0(Long.valueOf(-j3)), d3Var, null);
                        return;
                    }
                    TLRPC.User a24 = getMessagesController().a2(Long.valueOf(j3));
                    TLRPC.User a25 = getMessagesController().a2(Long.valueOf(this.H));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String a02 = org.telegram.messenger.id.a0(null, null, 2131754074, org.telegram.messenger.t10.j(a24, true), org.telegram.messenger.t10.j(a25, true));
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                    u1Var2.R = a02;
                    u1Var2.T = TextUtils.concat(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131754075, org.telegram.messenger.t10.j(a24, true), org.telegram.messenger.t10.j(a25, true))));
                    alertDialog$Builder2.k(org.telegram.messenger.id.a0("Send", null, 2131745640, new Object[0]), new yr(d3Var, 5));
                    alertDialog$Builder2.h(org.telegram.messenger.id.a0("Cancel", null, 2131752589, new Object[0]), new org.telegram.ui.Components.jl0(16));
                    showDialog(u1Var2);
                    return;
                } else if (this.D2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(org.telegram.messenger.xr.a(j3, j10));
                    if (this.D2.y(this, arrayList, null, false, this.K2, this.L2, this.M2, y91Var) && this.f52259j2) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.a5(boolean, boolean, boolean, boolean):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Wk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Vk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.al));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Zk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Yk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Xk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27922g8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Gj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27906f9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.S9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.R9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27923g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28033m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28257y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27887e9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27868d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27850c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.M7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.N7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27941h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28050n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28015l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28068o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27977j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27997k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.L7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27830b8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27810a8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Z7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Y7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.X7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.W7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.V7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.K7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27829b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28085p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27995k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.nk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Z5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28260y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28241x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28222w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28203v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28184u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28164t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28127r9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28108q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28088p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27959i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27831b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27811a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.U9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.T9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28211vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G8));
    }

    public final void b4(long j3, boolean z9) {
        if (this.f52231e0 != null) {
            int i7 = 0;
            while (true) {
                xw[] xwVarArr = this.f52231e0;
                if (i7 < xwVarArr.length) {
                    int childCount = xwVarArr[i7].f51772a.getChildCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 < childCount) {
                            View childAt = this.f52231e0[i7].f51772a.getChildAt(i10);
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
        if (this.M0 == null && !org.telegram.messenger.iz.f23448x && (!this.K || this.E0.g())) {
            j11[] j11VarArr = new j11[1];
            TLRPC.User f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).f();
            org.telegram.ui.ActionBar.l5 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.E3.f();
                Drawable drawable = this.E3.f33866f[0];
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
            vv vvVar = new vv(this, this, getParentActivity(), Integer.valueOf(i7), getResourceProvider(), j11VarArr);
            if (f10 != null && org.telegram.messenger.m5.g(f10.emoji_status) > 0) {
                vvVar.setExpireDateHint(org.telegram.messenger.m5.g(f10.emoji_status));
            }
            Long l11 = this.C3;
            if (l11 != null) {
                vvVar.setSelected(l11);
            } else {
                Drawable drawable2 = this.E3.f33866f[0];
                if (drawable2 instanceof org.telegram.ui.Components.i5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.i5) drawable2).h());
                } else {
                    l10 = null;
                }
                vvVar.setSelected(l10);
            }
            vvVar.setSaveState(1);
            vvVar.y(this.E3, titleTextView);
            wv wvVar = new wv(this, vvVar);
            this.M0 = wvVar;
            j11VarArr[0] = wvVar;
            wvVar.showAsDropDown(this.actionBar, org.telegram.messenger.g0.L(16.0f), i10, 48);
            j11VarArr[0].b();
        }
    }

    public final void c5(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.c5(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    @Override
    public final boolean canBeginSlide() {
        ow owVar;
        if (!this.G3.c()) {
            if (this.S0 == 3 && (owVar = this.f52337z0) != null && owVar.getVisibility() == 0 && this.f52337z0.K > 0) {
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
            hw hwVar = this.C0;
            if (hwVar != null) {
                hwVar.S();
                return true;
            }
            return true;
        }
        return super.closeLastFragment();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.Components.r7 r7Var = new org.telegram.ui.Components.r7(this, context, this.resourceProvider, 3);
        r7Var.setAllowOverlayTitle(true);
        r7Var.G0 = true;
        if (r7Var.F0 == null) {
            di.b4 b4Var = new di.b4(r7Var.getContext(), 5);
            r7Var.F0 = b4Var;
            r7Var.addView(b4Var);
        }
        org.telegram.ui.ActionBar.s6.l(r7Var, 3, org.telegram.ui.ActionBar.l6.f28163t8, getResourceProvider());
        org.telegram.ui.ActionBar.s6.a(r7Var, org.telegram.ui.ActionBar.l6.f28277z8, getResourceProvider(), true);
        org.telegram.ui.ActionBar.s6.l(r7Var, 1, org.telegram.ui.ActionBar.l6.f28202v8, getResourceProvider());
        org.telegram.ui.ActionBar.s6.b(r7Var, org.telegram.ui.ActionBar.l6.f28259y8, getResourceProvider(), true);
        if (r7Var.f27688x1 == null) {
            di.j jVar = new di.j(r7Var, r7Var.getContext(), r7Var.J0, r7Var.O0);
            r7Var.f27688x1 = jVar;
            jVar.setClipChildren(false);
            r7Var.addView(r7Var.f27688x1);
        }
        r7Var.getAdditionalSubTitleOverlayContainer().setTranslationX(org.telegram.messenger.g0.L(4.0f));
        r7Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-org.telegram.messenger.g0.L(3.0f));
        if (!this.inPreviewMode && (!org.telegram.messenger.g0.Q1() || this.X2 == 0 || q4())) {
            return r7Var;
        }
        r7Var.setOccupyStatusBar(false);
        return r7Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.createView(android.content.Context):android.view.View");
    }

    public final java.util.ArrayList d4(int r11, int r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.d4(int, int, int, boolean):java.util.ArrayList");
    }

    public final void d5(boolean z9) {
        xw[] xwVarArr;
        char c10;
        char c11;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            xwVarArr = this.f52231e0;
            if (i10 >= xwVarArr.length) {
                break;
            }
            xwVarArr[i10].f51772a.C0();
            i10++;
        }
        if (z9 && xwVarArr.length > 1) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int i11 = xwVarArr[c10].h;
        if (i11 >= 0 && i11 < getMessagesController().T0().size()) {
            org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) getMessagesController().T0().get(this.f52231e0[c10].h);
            if (voVar.e()) {
                xw xwVar = this.f52231e0[c10];
                xwVar.f51779s = this.S0;
                uw uwVar = xwVar.f51772a;
                int i12 = uw.B3;
                uwVar.D1();
            } else {
                xw[] xwVarArr2 = this.f52231e0;
                if (xwVarArr2[c10 ^ 1].f51779s == 7) {
                    xwVarArr2[c10].f51779s = 8;
                } else {
                    xwVarArr2[c10].f51779s = 7;
                }
                xwVarArr2[c10].f51772a.setScrollEnabled(true);
                org.telegram.messenger.qp messagesController = getMessagesController();
                if (this.f52231e0[c10].f51779s == 8) {
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
                            voVar2.f26078k.clear();
                            voVar2.f26079l.clear();
                        }
                    } else {
                        messagesController.T4(null);
                    }
                }
            }
            xw[] xwVarArr3 = this.f52231e0;
            if (xwVarArr3.length > 1) {
                xwVarArr3[1].E = voVar.f26083p;
            }
            xw xwVar2 = xwVarArr3[c10];
            iv ivVar = xwVar2.d;
            ivVar.h = xwVar2.f51779s;
            ivVar.f();
            xw xwVar3 = this.f52231e0[c10];
            ev evVar = xwVar3.f51774c;
            if (xwVar3.f51779s == 0 && l4() && this.f52231e0[c10].f51780w == 2) {
                i7 = 1;
            }
            evVar.h1(i7, (int) this.N);
            C3(this.f52231e0[c10]);
        }
    }

    @Override
    public final void didReceivedNotification(int r27, int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.didReceivedNotification(int, int, java.lang.Object[]):void");
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
            f10 = 1.0f - this.f52214b.f55499e;
        } else {
            f10 = 1.0f;
        }
        return f10 * (1.0f - h4()) * this.f52293r.f55499e;
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
        fz0 fz0Var = this.Z;
        if (fz0Var != null && fz0Var.getVisibility() != 8) {
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
            float f21 = this.f52334y1;
            f12 = (f10 * f21) + com.google.android.recaptcha.internal.a.z(1.0f, f21, f11, f20);
            f13 = this.f52336y3;
        } else {
            f12 = (f10 * this.f52334y1) + this.N;
            f13 = this.f52336y3;
        }
        float f22 = f12 + f13 + this.T;
        nw nwVar = this.X;
        if (nwVar != null && nwVar.getVisibility() == 0) {
            f14 = this.X.getAlpha();
        } else {
            f14 = 0.0f;
        }
        float L = org.telegram.messenger.g0.L(4.0f) * f14;
        ow owVar = this.f52337z0;
        if (owVar != null) {
            owVar.setTranslationY(f22 - L);
            f16 = this.f52337z0.getAlpha();
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
            if (this.f52209a0 == null) {
                i7 = org.telegram.messenger.g0.L(44.0f);
            } else {
                i7 = 0;
            }
            prVar.setTranslationY(org.telegram.messenger.g0.T1(f23, i10 - i7, this.f52214b.f55499e));
            f18 = this.K1.getMetadata().f55515c.f55525a;
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
            Matrix matrix = orVar2.f36772b;
            if (orVar2.f36774e != W1 || orVar2.f36775f != min) {
                orVar2.f36774e = W1;
                orVar2.f36775f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, W1);
                LinearGradient linearGradient = orVar2.f36773c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                orVar2.invalidate();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.f5(boolean):void");
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.l60 l60Var = this.L0;
        if (l60Var != null) {
            l60Var.u();
        }
    }

    public final int g4() {
        if (this.K) {
            return org.telegram.messenger.g0.L(81.0f);
        }
        return 0;
    }

    public final void g5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.g5():void");
    }

    @Override
    public final org.telegram.ui.ActionBar.m4 getBackButtonState() {
        if (!q4() && !this.G3.f52709f) {
            return org.telegram.ui.ActionBar.m4.f28296b;
        }
        return org.telegram.ui.ActionBar.m4.f28295a;
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z9, boolean z10, float f10) {
        int i7;
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X3, 1.0f);
            this.f52213a4 = ofFloat;
            return ofFloat;
        }
        if (getLayoutContainer() != null && getLayoutContainer().getMeasuredWidth() > 0) {
            i7 = (int) Utilities.i((200.0f / getLayoutContainer().getMeasuredWidth()) * f10, 200.0f, 80.0f);
        } else {
            i7 = 150;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.X3, 1.0f);
        this.f52213a4 = ofFloat2;
        ofFloat2.addUpdateListener(new lu(this, 1));
        this.f52213a4.setInterpolator(org.telegram.ui.Components.xq.f40459g);
        this.f52213a4.setDuration(i7);
        this.f52213a4.start();
        return this.f52213a4;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.getThemeDescriptions():java.util.ArrayList");
    }

    public final float h4() {
        uv uvVar = this.G3;
        if (uvVar != null && uvVar.c()) {
            return this.G3.f52708e;
        }
        return 0.0f;
    }

    public final void h5() {
        bi.q1 q1Var;
        uw uwVar;
        boolean z9;
        int i7;
        try {
            lv lvVar = this.C1;
            if (lvVar != null && lvVar.getEditField() != null) {
                this.C1.getEditField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.l6.Ke));
            }
            NumberTextView numberTextView = this.f52253i1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.l6.f28259y8));
            }
            ow owVar = this.f52337z0;
            int i10 = 0;
            if (owVar != null && (owVar.getSelectorDrawable() instanceof GradientDrawable)) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null && kVar.w()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                GradientDrawable gradientDrawable = (GradientDrawable) this.f52337z0.getSelectorDrawable();
                if (z9) {
                    i7 = org.telegram.ui.ActionBar.l6.f28193ui;
                } else {
                    i7 = org.telegram.ui.ActionBar.l6.K8;
                }
                gradientDrawable.setColor(getThemedColor(i7));
                this.f52337z0.invalidate();
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                if (this.X2 != 0 || this.Z2 != 0) {
                    kVar2.J(getThemedColor(org.telegram.ui.ActionBar.l6.Q8), false);
                    this.actionBar.J(getThemedColor(org.telegram.ui.ActionBar.l6.R8), true);
                }
                if (this.actionBar.w()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
                }
                n5();
            }
            if (this.f52231e0 != null) {
                while (true) {
                    xw[] xwVarArr = this.f52231e0;
                    if (i10 >= xwVarArr.length) {
                        break;
                    }
                    xw xwVar = xwVarArr[i10];
                    if (xwVar != null && (uwVar = xwVar.f51772a) != null) {
                        uwVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
                    }
                    i10++;
                }
            }
            hw hwVar = this.C0;
            if (hwVar != null && (q1Var = hwVar.f33992a0) != null) {
                q1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
            }
            li.w1 w1Var = this.D1;
            if (w1Var != null) {
                w1Var.setScrimViewBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
            }
            fi.m3 m3Var = this.f52283p0;
            if (m3Var != null) {
                m3Var.j(getThemedColor(org.telegram.ui.ActionBar.l6.tj));
            }
            fi.m3 m3Var2 = this.f52288q0;
            if (m3Var2 != null) {
                m3Var2.j(getThemedColor(org.telegram.ui.ActionBar.l6.tj));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final float i4() {
        return -org.telegram.messenger.g0.W1(this.f52214b.f55499e, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(48.0f));
    }

    public final void i5(boolean z9, boolean z10) {
        ?? r52;
        int L0;
        boolean z11;
        xw[] xwVarArr;
        org.telegram.messenger.vo voVar;
        boolean z12;
        Object[] objArr;
        v4.l0 l0Var;
        boolean z13;
        boolean z14;
        boolean z15;
        if (this.f52337z0 != null && !this.inPreviewMode && !this.f52297r3) {
            uv uvVar = this.G3;
            if (uvVar == null || !uvVar.c()) {
                org.telegram.ui.Components.l60 l60Var = this.L0;
                String str = null;
                if (l60Var != null) {
                    l60Var.u();
                    this.L0 = null;
                }
                ArrayList T0 = getMessagesController().T0();
                int size = T0.size();
                te.a aVar = this.f52293r;
                boolean z16 = true;
                boolean z17 = false;
                if (size > 1) {
                    if (!z9 && this.f52337z0.getVisibility() == 0) {
                        r52 = 0;
                    } else {
                        if (this.f52337z0.getVisibility() != 0) {
                            z12 = false;
                        } else {
                            z12 = z10;
                        }
                        this.f52326x = true;
                        boolean isEmpty = this.f52337z0.h.isEmpty();
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.R3 == null) {
                                z15 = z10;
                            } else {
                                z15 = false;
                            }
                            if (!this.f52297r3) {
                                aVar.a(this.f52326x, z15);
                            }
                        }
                        int currentTabId = this.f52337z0.getCurrentTabId();
                        int currentTabStableId = this.f52337z0.getCurrentTabStableId();
                        if (currentTabId != this.f52337z0.getDefaultTabId() && currentTabId >= T0.size()) {
                            this.f52337z0.L = -1;
                            objArr = 1;
                        } else {
                            objArr = null;
                        }
                        ow owVar = this.f52337z0;
                        owVar.h.clear();
                        owVar.f33779j0.clear();
                        owVar.f33781l0.clear();
                        owVar.m0.clear();
                        owVar.f33783n0.clear();
                        owVar.f33784o0.clear();
                        owVar.M = 0;
                        int size2 = T0.size();
                        int i7 = 0;
                        while (i7 < size2) {
                            if (((org.telegram.messenger.vo) T0.get(i7)).e()) {
                                this.f52337z0.a(i7, 0, org.telegram.messenger.id.M0(2131750807, str), null, false, true, ((org.telegram.messenger.vo) T0.get(i7)).f26083p);
                                z14 = z17;
                            } else {
                                org.telegram.messenger.vo voVar2 = (org.telegram.messenger.vo) T0.get(i7);
                                z14 = z17;
                                this.f52337z0.a(i7, voVar2.f26082o, voVar2.f26071b, voVar2.f26072c, voVar2.f26081n, false, ((org.telegram.messenger.vo) T0.get(i7)).f26083p);
                            }
                            i7++;
                            z17 = z14;
                            str = null;
                        }
                        boolean z18 = z17;
                        if (currentTabStableId >= 0) {
                            if (objArr != null && !this.f52337z0.h(currentTabStableId)) {
                                while (currentTabId >= 0) {
                                    ow owVar2 = this.f52337z0;
                                    if (owVar2.h(owVar2.f33780k0.get(currentTabId, -1))) {
                                        break;
                                    }
                                    currentTabId--;
                                }
                                if (currentTabId < 0) {
                                    currentTabId = z18 ? 1 : 0;
                                }
                            }
                            if (this.f52337z0.f33780k0.get(this.f52231e0[z18 ? 1 : 0].h, -1) != currentTabStableId) {
                                this.f52231e0[z18 ? 1 : 0].h = currentTabId;
                                isEmpty = true;
                            }
                        }
                        int i10 = z18 ? 1 : 0;
                        while (true) {
                            xw[] xwVarArr2 = this.f52231e0;
                            if (i10 >= xwVarArr2.length) {
                                break;
                            }
                            if (xwVarArr2[i10].h >= T0.size()) {
                                this.f52231e0[i10].h = T0.size() - 1;
                            }
                            this.f52231e0[i10].f51772a.setScrollingTouchSlop(1);
                            i10++;
                        }
                        ow owVar3 = this.f52337z0;
                        bi.q1 q1Var = owVar3.F;
                        if (z12) {
                            l0Var = owVar3.f33790s0;
                        } else {
                            l0Var = null;
                        }
                        q1Var.setItemAnimator(l0Var);
                        owVar3.I.f();
                        if (isEmpty) {
                            d5(z18);
                        }
                        ow owVar4 = this.f52337z0;
                        int currentTabId2 = owVar4.getCurrentTabId();
                        ArrayList arrayList = owVar4.h;
                        int i11 = 0;
                        while (true) {
                            if (i11 < arrayList.size()) {
                                if (((org.telegram.ui.Components.cz) arrayList.get(i11)).f32790a == currentTabId2) {
                                    z13 = ((org.telegram.ui.Components.cz) arrayList.get(i11)).f32794f;
                                    break;
                                }
                                i11++;
                            } else {
                                z13 = false;
                                break;
                            }
                        }
                        if (z13) {
                            ow owVar5 = this.f52337z0;
                            ArrayList arrayList2 = owVar5.h;
                            if (!arrayList2.isEmpty()) {
                                r52 = 0;
                                owVar5.f((org.telegram.ui.Components.cz) arrayList2.get(0), 0);
                            }
                        }
                        r52 = 0;
                    }
                } else {
                    r52 = 0;
                    if (this.f52337z0.getVisibility() != 8) {
                        this.f52337z0.setIsEditing(false);
                        U4(false);
                        this.f52282o3 = false;
                        if (this.f52277n3) {
                            this.f52277n3 = false;
                            this.f52231e0[0].setTranslationX(0.0f);
                            this.f52231e0[1].setTranslationX(xwVarArr[0].getMeasuredWidth());
                        }
                        if (this.f52231e0[0].h != this.f52337z0.getDefaultTabId()) {
                            this.f52231e0[0].h = this.f52337z0.getDefaultTabId();
                            iv ivVar = this.f52231e0[0].d;
                            ivVar.h = 0;
                            ivVar.f();
                            xw xwVar = this.f52231e0[0];
                            xwVar.f51779s = this.S0;
                            xwVar.d.f();
                        }
                        this.f52231e0[1].setVisibility(8);
                        xw xwVar2 = this.f52231e0[1];
                        xwVar2.h = 0;
                        iv ivVar2 = xwVar2.d;
                        ivVar2.h = 0;
                        ivVar2.f();
                        xw xwVar3 = this.f52231e0[1];
                        xwVar3.f51779s = this.S0;
                        xwVar3.d.f();
                        this.f52326x = false;
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.R3 == null) {
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            if (!this.f52297r3) {
                                aVar.a(false, z11);
                            }
                        }
                        int i12 = 0;
                        while (true) {
                            xw[] xwVarArr3 = this.f52231e0;
                            if (i12 >= xwVarArr3.length) {
                                break;
                            }
                            xw xwVar4 = xwVarArr3[i12];
                            if (xwVar4.f51779s == 0 && xwVar4.f51780w == 2 && l4() && ((L0 = this.f52231e0[i12].f51774c.L0()) == 0 || L0 == 1)) {
                                this.f52231e0[i12].f51774c.h1(1, (int) this.N);
                            }
                            this.f52231e0[i12].f51772a.setScrollingTouchSlop(0);
                            this.f52231e0[i12].f51772a.requestLayout();
                            this.f52231e0[i12].requestLayout();
                            i12++;
                        }
                        this.f52337z0.L = -1;
                        r52 = 0;
                    }
                }
                f5(r52);
                int i13 = this.f52231e0[r52].f51779s;
                if ((i13 == 7 || i13 == 8) && (voVar = getMessagesController().M[i13 - 7]) != null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < T0.size()) {
                            org.telegram.messenger.vo voVar3 = (org.telegram.messenger.vo) T0.get(i14);
                            if (voVar3 != null && voVar3.f26070a == voVar.f26070a) {
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
        uv uvVar;
        if (!this.f52263k2 && (uvVar = this.G3) != null && uvVar.getFragment() != null) {
            return this.G3.getFragment().isLightStatusBar();
        }
        if (i0.a.h(getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6)) > 0.699999988079071d) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.j5(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    @Override
    public final ri.f k() {
        return this.f52269l4;
    }

    public final UndoView k4() {
        Z3();
        UndoView[] undoViewArr = this.f52333y0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.d(2, true);
            rw rwVar = (rw) this.fragmentView;
            rwVar.removeView(undoViewArr[0]);
            rwVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void k5() {
        float f10 = (((-this.f52246g4) - this.f52260j4) - this.f52316v1) - this.f52322w1;
        org.telegram.ui.Components.q00 q00Var = this.f52305t0;
        if (q00Var != null) {
            q00Var.setTranslationY(f10);
        }
        org.telegram.ui.Components.q00 q00Var2 = this.f52310u0;
        if (q00Var2 != null) {
            q00Var2.setTranslationY(f10 - org.telegram.messenger.g0.L(52.0f));
            fi.m3 m3Var = this.f52283p0;
            if (m3Var != null) {
                m3Var.setTranslationY(f10 - org.telegram.messenger.g0.L(52.0f));
            }
        }
    }

    public final boolean l4() {
        if (!this.f52271m2 && this.S0 == 0 && this.Z2 == 0 && this.X2 == 0) {
            org.telegram.messenger.qp messagesController = getMessagesController();
            messagesController.getClass();
            if (org.telegram.messenger.iz.f23430q1 && messagesController.Q.f(2305843009213693952L | 1) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void l5(boolean z9) {
        boolean z10;
        boolean z11 = this.f52271m2;
        if ((!z11 || this.S0 == 10) && this.X2 == 0 && this.Z2 == 0 && !this.inPreviewMode && ((!this.f52263k2 || z11) && !this.U3)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.q00 q00Var = this.f52305t0;
        if (q00Var != null) {
            q00Var.e(z10, z9);
        }
        org.telegram.ui.Components.q00 q00Var2 = this.f52310u0;
        if (q00Var2 != null) {
            q00Var2.e(z10, z9);
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
        if (this.f52275n0 != null) {
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
                if (getDownloadController().I.size() <= 0 && !z11 && (this.f52242g0.getVisibility() != 0 || this.f52242g0.getAlpha() != 1.0f || z10)) {
                    this.f52252i0 = false;
                } else {
                    this.f52252i0 = true;
                }
                J3();
                boolean z13 = org.telegram.messenger.t0.f25566b.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i11 = this.f52233e2;
                if (i11 == 3 || i11 == 5) {
                    z12 = true;
                }
                org.telegram.ui.ActionBar.z0 z0Var = this.f52279o0;
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
                this.f52275n0.b(z13, z12, z9);
            }
        }
    }

    public final void n4(boolean z9) {
        int i7;
        boolean z10;
        this.actionBar.v();
        this.J2.clear();
        org.telegram.ui.ActionBar.y1 y1Var = this.f52238f1;
        boolean z11 = true;
        if (y1Var != null) {
            y1Var.c(true, 0.0f);
        }
        ow owVar = this.f52337z0;
        if (owVar != null) {
            owVar.b(org.telegram.ui.ActionBar.l6.K8, org.telegram.ui.ActionBar.l6.I8, org.telegram.ui.ActionBar.l6.J8, org.telegram.ui.ActionBar.l6.L8, org.telegram.ui.ActionBar.l6.f27865d6);
        }
        ValueAnimator valueAnimator = this.f52324w3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f52324w3 = null;
        }
        if (this.f52318v3 == 0.0f) {
            return;
        }
        O4(-f4());
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            xw[] xwVarArr = this.f52231e0;
            if (i10 >= xwVarArr.length) {
                break;
            }
            xw xwVar = xwVarArr[i10];
            if (xwVar != null) {
                xwVar.f51772a.I0(true);
            }
            i10++;
        }
        if (this.K) {
            i7 = 81;
        } else {
            i7 = 0;
        }
        float max = Math.max(0.0f, org.telegram.messenger.g0.L(i7 + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f52318v3, 0.0f);
        this.f52324w3 = ofFloat;
        ofFloat.addUpdateListener(new iu(this, max, 1));
        this.f52324w3.addListener(new cw(this, max, 0));
        this.f52324w3.setInterpolator(org.telegram.ui.Components.xq.f40458f);
        this.f52324w3.setDuration(200L);
        this.f52324w3.start();
        this.Z0 = false;
        ArrayList arrayList = this.f52216b1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) arrayList.get(i11);
                iz.z0(voVar, voVar.f26075g, voVar.f26071b, voVar.f26072c, voVar.f26081n, voVar.f26080m, voVar.h, voVar.f26076i, voVar.f26077j, false, false, true, true, false, this, null);
                i11++;
                arrayList = arrayList;
                size = size;
                z12 = false;
                z11 = true;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.f52210a1) {
            getMessagesController().m4(this.X2, 0L, null);
            z10 = 0;
            this.f52210a1 = false;
        } else {
            z10 = 0;
        }
        f5(true);
        if (this.f52231e0 != null) {
            int i12 = z10;
            while (true) {
                xw[] xwVarArr2 = this.f52231e0;
                if (i12 >= xwVarArr2.length) {
                    break;
                }
                xwVarArr2[i12].d.H = z10;
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
        if (this.f52308t3 && this.actionBar != null) {
            if (this.X2 == 0 && this.Z2 == 0) {
                i7 = org.telegram.ui.ActionBar.l6.f28202v8;
            } else {
                i7 = org.telegram.ui.ActionBar.l6.O8;
            }
            int themedColor = getThemedColor(i7);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.l6.f28259y8;
            kVar.E(i0.a.f(this.f52334y1, themedColor, getThemedColor(i11)), false);
            this.actionBar.E(i0.a.f(this.f52334y1, getThemedColor(i11), getThemedColor(i11)), true);
            if (this.X2 == 0 && this.Z2 == 0) {
                i10 = org.telegram.ui.ActionBar.l6.f28163t8;
            } else {
                i10 = org.telegram.ui.ActionBar.l6.N8;
            }
            int themedColor2 = getThemedColor(i10);
            this.actionBar.D(i0.a.f(this.f52334y1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.l6.f28277z8)), false);
        }
    }

    public final void o4(boolean z9) {
        if (this.G3.c()) {
            z9 = true;
        }
        if (!z9 || !this.f52223c2) {
            this.U3 = z9;
            l5(true);
            if (z9) {
                fi.m3 m3Var = this.f52283p0;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                fi.m3 m3Var2 = this.f52288q0;
                if (m3Var2 != null) {
                    m3Var2.f(true);
                }
            }
        }
    }

    public final void o5() {
        org.telegram.ui.Components.qo0 qo0Var;
        int i7;
        lv lvVar = this.C1;
        ArrayList arrayList = this.J2;
        if (lvVar != null) {
            this.f52274n.a(!arrayList.isEmpty(), true);
            p5();
            if (arrayList.isEmpty()) {
                if (this.S0 == 3 && this.f52244g2 == null) {
                    i7 = 2131750575;
                } else {
                    i7 = 2131745669;
                }
                String M0 = org.telegram.messenger.id.M0(i7, null);
                if (this.Q3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(M0);
                } else {
                    this.actionBar.L(M0, true, 350L, org.telegram.ui.Components.xq.h);
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
                    if (!this.W3 && (qo0Var = this.H2) != null) {
                        this.W3 = true;
                        String M02 = org.telegram.messenger.id.M0(2131745429, null);
                        qo0Var.j();
                        qo0Var.F = M02;
                        fi.i1 i1Var = qo0Var.f37447a[0];
                        if (M02 != null) {
                            ((org.telegram.ui.ActionBar.l5) i1Var.f12168f).l(M02, false);
                        }
                        org.telegram.ui.Components.pb0 pb0Var = new org.telegram.ui.Components.pb0(qo0Var, 26);
                        qo0Var.G = pb0Var;
                        org.telegram.messenger.g0.i3(pb0Var, 1000L);
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
                    this.actionBar.L(org.telegram.messenger.id.G(arrayList.size(), "Recipient", new Object[0]), false, 350L, org.telegram.ui.Components.xq.h);
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
                hw hwVar = this.C0;
                if (hwVar != null) {
                    hwVar.S();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.l60 l60Var = this.L0;
            if (l60Var != null) {
                if (z9) {
                    l60Var.u();
                    this.L0 = null;
                    return false;
                }
            } else {
                ow owVar = this.f52337z0;
                if (owVar != null && owVar.f33782n) {
                    if (z9) {
                        owVar.setIsEditing(false);
                        U4(false);
                        return false;
                    }
                } else {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar != null && kVar.w()) {
                        if (z9) {
                            hw hwVar2 = this.C0;
                            if (hwVar2 != null && hwVar2.getVisibility() == 0) {
                                this.C0.R(false);
                            }
                            n4(true);
                            return false;
                        }
                    } else if (this.f52214b.f55500f) {
                        if (z9) {
                            this.X.f37857r.getText().clear();
                            this.Y.b(false);
                            this.X.f37857r.clearFocus();
                            return false;
                        }
                    } else {
                        ow owVar2 = this.f52337z0;
                        if (owVar2 != null && owVar2.getVisibility() == 0 && !this.f52255i3) {
                            ow owVar3 = this.f52337z0;
                            if (!owVar3.O && !this.f52277n3) {
                                ArrayList arrayList = owVar3.h;
                                if (!arrayList.isEmpty() && owVar3.L != ((org.telegram.ui.Components.cz) arrayList.get(0)).f32790a) {
                                    if (z9) {
                                        ow owVar4 = this.f52337z0;
                                        ArrayList arrayList2 = owVar4.h;
                                        if (!arrayList2.isEmpty()) {
                                            owVar4.f((org.telegram.ui.Components.cz) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        lv lvVar = this.C1;
                        if (lvVar != null && lvVar.s0()) {
                            if (z9) {
                                this.C1.k0(true);
                            }
                        } else {
                            rv rvVar = this.E0;
                            if (rvVar.O == 0 && rvVar.S.L0() != 0) {
                                rvVar.h.y0(0);
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
        ow owVar;
        if (this.W1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.m(true);
            }
            TLObject tLObject = this.Y1;
            if (tLObject != null) {
                hw hwVar = this.C0;
                if (hwVar != null) {
                    hwVar.f33995d0.Q(this.X1, tLObject);
                }
                this.Y1 = null;
            }
            this.W1 = false;
        }
        if (!this.K && (owVar = this.f52337z0) != null && owVar.getVisibility() == 0 && this.f52293r.f55500f) {
            int i7 = (int) (-this.N);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i7 != 0 && i7 != currentActionBarHeight && i7 >= currentActionBarHeight / 2) {
                this.f52231e0[0].f51772a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f52333y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        if (!isInPreviewMode() && (ecVar = this.K0) != null && ecVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        N3();
        this.f52294r0 = true;
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
        if (this.f52294r0 && !this.f52300s0 && (m3Var = this.f52283p0) != null && this.O3) {
            this.f52300s0 = true;
            this.f52294r0 = false;
            m3Var.w();
        }
        org.telegram.messenger.g0.i3(new eu(this, 20), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.l60 l60Var = this.L0;
        if (l60Var != null) {
            l60Var.u();
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
            this.f52271m2 = bundle.getBoolean("onlySelect", false);
            this.f52276n2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f52296r2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.S0 = this.arguments.getInt("dialogsType", 0);
            this.O0 = this.arguments.getBoolean("quote", false);
            this.N0 = this.arguments.getBoolean("reply_to", false);
            this.P0 = this.arguments.getLong("reply_to_author", 0L);
            this.Q0 = this.arguments.getLong("reply_to_channel_direct", 0L);
            this.R0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f52244g2 = this.arguments.getString("selectAlertString");
            this.f52249h2 = this.arguments.getString("selectAlertStringGroup");
            this.f52254i2 = this.arguments.getString("addToGroupAlertString");
            this.f52302s2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f52307t2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f52312u2 = this.arguments.getBoolean("afterSignup", false);
            this.X2 = this.arguments.getInt("folderId", 0);
            long j3 = this.arguments.getLong("community_id", 0L);
            this.Z2 = j3;
            if (j3 != 0) {
                this.f52212a3 = getMessagesController().M0(Long.valueOf(this.Z2));
                this.f52218b3 = getMessagesController().N0(this.Z2);
            }
            this.f52259j2 = this.arguments.getBoolean("resetDelegate", true);
            this.T0 = this.arguments.getInt("messagesCount", 0);
            this.U0 = this.arguments.getInt("hasPoll", 0);
            this.V0 = this.arguments.getBoolean("hasInvoice", false);
            this.f52317v2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f52317v2);
            this.arguments.getInt("otherwiseRelogin");
            this.f52323w2 = this.arguments.getBoolean("allowGroups", true);
            this.f52329x2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f52335y2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.f52339z2 = this.arguments.getBoolean("allowChannels", true);
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
        if (this.f52281o2 == null) {
            this.f52233e2 = getConnectionsManager().getConnectionState();
            this.K3.e(org.telegram.messenger.qs.f25018i4);
            if (!this.f52271m2) {
                this.K3.e(org.telegram.messenger.qs.I4);
                this.K3.e(org.telegram.messenger.qs.A4);
                this.K3.c(org.telegram.messenger.qs.P2);
                this.K3.c(org.telegram.messenger.qs.d2);
            }
            ab.b0 b0Var = this.K3;
            b0Var.c(org.telegram.messenger.qs.f25070s);
            b0Var.c(org.telegram.messenger.qs.O2);
            b0Var.c(org.telegram.messenger.qs.f25063r);
            b0Var.c(org.telegram.messenger.qs.Y);
            b0Var.c(org.telegram.messenger.qs.O);
            b0Var.c(org.telegram.messenger.qs.I2);
            b0Var.c(org.telegram.messenger.qs.f25008h0);
            b0Var.c(org.telegram.messenger.qs.f24996f0);
            b0Var.c(org.telegram.messenger.qs.J);
            b0Var.c(org.telegram.messenger.qs.K);
            b0Var.c(org.telegram.messenger.qs.M);
            b0Var.c(org.telegram.messenger.qs.P0);
            b0Var.c(org.telegram.messenger.qs.f25071s0);
            b0Var.c(org.telegram.messenger.qs.f25062q5);
            b0Var.c(org.telegram.messenger.qs.S0);
            b0Var.c(org.telegram.messenger.qs.T1);
            b0Var.c(org.telegram.messenger.qs.f24978b5);
            b0Var.c(org.telegram.messenger.qs.K2);
            b0Var.c(org.telegram.messenger.qs.f24985d0);
            b0Var.c(org.telegram.messenger.qs.f25072s1);
            b0Var.c(org.telegram.messenger.qs.Y4);
            b0Var.c(org.telegram.messenger.qs.Z4);
            b0Var.c(org.telegram.messenger.qs.N);
            b0Var.c(org.telegram.messenger.qs.f25040m5);
            b0Var.c(org.telegram.messenger.qs.f25001f5);
            this.K3.e(org.telegram.messenger.qs.f25041n0);
        }
        ab.b0 b0Var2 = this.K3;
        b0Var2.c(org.telegram.messenger.qs.f25096w);
        b0Var2.c(org.telegram.messenger.qs.S4);
        b0Var2.c(org.telegram.messenger.qs.f24972a5);
        b0Var2.c(org.telegram.messenger.qs.T);
        b0Var2.c(org.telegram.messenger.qs.L4);
        b0Var2.c(org.telegram.messenger.qs.f25082t5);
        b0Var2.c(org.telegram.messenger.qs.f25095v5);
        b0Var2.c(org.telegram.messenger.qs.Z2);
        b0Var2.c(org.telegram.messenger.qs.f24987d3);
        b0Var2.c(org.telegram.messenger.qs.f25007g5);
        b0Var2.c(org.telegram.messenger.qs.f25114y3);
        b0Var2.c(org.telegram.messenger.qs.A3);
        b0Var2.c(org.telegram.messenger.qs.S5);
        b0Var2.c(org.telegram.messenger.qs.T5);
        b0Var2.c(org.telegram.messenger.qs.P3);
        b0Var2.c(org.telegram.messenger.qs.Q3);
        if (this.S0 == 0) {
            this.K3.c(org.telegram.messenger.qs.f25123z5);
            this.K3.c(org.telegram.messenger.qs.P1);
        }
        u4(getAccountInstance());
        di.z6 P1 = getMessagesController().P1();
        if (!P1.A) {
            P1.W();
            if (!P1.f10008s) {
                ConnectionsManager.getInstance(P1.f9992a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new di.y5(P1, 0));
            }
        }
        getMessagesController().b3(this.X2);
        if (this.R3 != null && !getMessagesStorage().Q) {
            ot otVar = this.R3;
            if (otVar.getParent() != null) {
                ((ViewGroup) otVar.getParent()).removeView(otVar);
            }
            this.R3 = null;
        }
        if (q4()) {
            di.z6 P12 = getMessagesController().P1();
            if (P12.f10014z) {
                P12.T(true);
            }
        } else {
            getMessagesController().P1().W();
        }
        getContactsController().B();
        if (getMessagesController().f24858o6) {
            org.telegram.messenger.vv G1 = getMessagesController().G1();
            if (!G1.f26214e) {
                G1.g(true);
            }
        }
        if (this.Z2 != 0) {
            getMessagesController().V2(0, this.Z2, true);
        }
        org.telegram.messenger.v1 a10 = org.telegram.messenger.v1.a(this.currentAccount);
        if (!a10.f25936e) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = a10.f25934b;
            if (j10 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                long j11 = currentTimeMillis - j10;
                boolean z10 = org.telegram.messenger.r2.f25212a;
                if (j11 > 43200000) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            if (!z9) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(a10.f25934b);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(currentTimeMillis);
                if (calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
            }
            if (z9) {
                a10.f25936e = true;
                ConnectionsManager.getInstance(a10.f25933a).sendRequest(new TL_account.getBirthdays(), new org.telegram.messenger.s1(a10, 0));
            }
        }
        if (this.W) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        this.f52256i4 = i7;
        if (this.W) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        }
        this.f52260j4 = i10;
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
        lv lvVar = this.C1;
        if (lvVar != null) {
            lvVar.B0();
        }
        org.telegram.ui.Components.qo0 qo0Var = this.H2;
        if (qo0Var != null) {
            qo0Var.j();
        }
        org.telegram.ui.Components.m51 m51Var = this.I2;
        if (m51Var != null) {
            org.telegram.messenger.g0.r(m51Var);
            this.I2 = null;
        }
        UndoView undoView = this.f52333y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f52291q3.e();
        this.D2 = null;
        int i7 = org.telegram.ui.Components.e10.f33256i1;
    }

    @Override
    public final void onPanTranslationUpdate(float f10) {
        if (this.f52231e0 != null) {
            this.J0 = f10;
            lv lvVar = this.C1;
            int i7 = 0;
            if (lvVar != null && lvVar.s0()) {
                this.fragmentView.setTranslationY(f10);
                while (true) {
                    xw[] xwVarArr = this.f52231e0;
                    if (i7 >= xwVarArr.length) {
                        break;
                    }
                    xwVarArr[i7].setTranslationY(0.0f);
                    i7++;
                }
                if (!this.f52271m2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.cc ccVar = this.f52286p3;
                    if (ccVar != null) {
                        ccVar.l();
                    }
                }
                hw hwVar = this.C0;
                if (hwVar != null) {
                    hwVar.setTranslationY(this.I0);
                    return;
                }
                return;
            }
            while (true) {
                xw[] xwVarArr2 = this.f52231e0;
                if (i7 >= xwVarArr2.length) {
                    break;
                }
                xwVarArr2[i7].setTranslationY(f10);
                i7++;
            }
            if (!this.f52271m2) {
                this.actionBar.setTranslationY(f10);
                org.telegram.ui.Components.cc ccVar2 = this.f52286p3;
                if (ccVar2 != null) {
                    ccVar2.l();
                }
            }
            hw hwVar2 = this.C0;
            if (hwVar2 != null) {
                hwVar2.setTranslationY(this.J0 + this.I0);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.cc ccVar = this.S;
        if (ccVar != null) {
            ccVar.b();
            this.S = null;
        }
        uv uvVar = this.G3;
        if (uvVar != null) {
            uvVar.f52711r = true;
            bw bwVar = uvVar.f52705a;
            if (bwVar != null) {
                bwVar.onPause();
            }
        }
        org.telegram.ui.Components.l60 l60Var = this.L0;
        if (l60Var != null) {
            l60Var.u();
        }
        lv lvVar = this.C1;
        if (lvVar != null) {
            lvVar.D0();
        }
        int i7 = 0;
        UndoView undoView = this.f52333y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        setBulletinDelegate(null);
        if (this.f52231e0 == null) {
            return;
        }
        while (true) {
            xw[] xwVarArr = this.f52231e0;
            if (i7 < xwVarArr.length) {
                xwVarArr[i7].d.getClass();
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
                                fh0.I0();
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
                                org.telegram.messenger.g0.h3(new eu(this, 19));
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
            if (Build.VERSION.SDK_INT >= 30 && (c9Var = FilesMigrationService.f21172e) != null) {
                c9Var.I0();
            }
        }
    }

    @Override
    public final void onResume() {
        boolean z9;
        xw xwVar;
        iv ivVar;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.zl0 zl0Var;
        bi.ec ecVar;
        super.onResume();
        rv rvVar = this.E0;
        char c10 = 0;
        if (rvVar != null) {
            ArrayList arrayList = rvVar.f9559y;
            di.z6 z6Var = rvVar.f9550s;
            z6Var.l(z6Var.f9997g);
            z6Var.l(z6Var.h);
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                TL_stories.PeerStories y10 = z6Var.y(((di.n) arrayList.get(i7)).f9366c);
                if (y10 != null) {
                    z6Var.a0(y10);
                }
            }
        }
        uv uvVar = this.G3;
        if (uvVar != null) {
            uvVar.f52711r = false;
            bw bwVar = uvVar.f52705a;
            if (bwVar != null) {
                bwVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (ecVar = this.K0) != null && ecVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.f52231e0 != null) {
            int i10 = 0;
            while (true) {
                xw[] xwVarArr = this.f52231e0;
                if (i10 >= xwVarArr.length) {
                    break;
                }
                xwVarArr[i10].d.f();
                i10++;
            }
        }
        lv lvVar = this.C1;
        if (lvVar != null) {
            lvVar.E0();
        }
        long j3 = 0;
        if (!this.f52271m2 && this.X2 == 0 && this.Z2 == 0) {
            getMediaDataController().B(4);
        }
        hw hwVar = this.C0;
        if (hwVar != null && (zl0Var = hwVar.f33995d0) != null) {
            zl0Var.f();
        }
        if (!this.f52312u2 && getUserConfig().Z != null) {
            z9 = false;
        } else {
            z9 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z9 && this.X2 == 0 && this.Z2 == 0 && this.d2 && !this.f52271m2) {
            int i11 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.d2 = false;
                if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i11 <= 28 || org.telegram.messenger.r2.f25213b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
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
                if (this.f52312u2 && (z10 || z12)) {
                    j3 = 4000;
                }
                org.telegram.messenger.g0.i3(i4Var, j3);
            }
        } else if (!this.f52271m2 && this.X2 == 0 && this.Z2 == 0 && org.telegram.messenger.as.i() && !org.telegram.messenger.as.g()) {
            if (getParentActivity() != null) {
                if (!org.telegram.messenger.qp.f1().getBoolean("askedAboutMiuiLockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i12 = org.telegram.ui.ActionBar.l6.L5;
                    alertDialog$Builder.m(2131624115, 72, getThemedColor(i12), null);
                    alertDialog$Builder.n(i12, getResourceProvider());
                    String M0 = org.telegram.messenger.id.M0(2131747298, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.T = M0;
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747300, null), new hu(this, 10));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751772, null), new org.telegram.ui.Components.jl0(17));
                    showDialog(u1Var);
                }
            } else {
                return;
            }
        } else if (this.X2 == 0 && this.Z2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
            if (getParentActivity() != null) {
                if (!org.telegram.messenger.qp.f1().getBoolean("askedAboutFSILockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    int i13 = org.telegram.ui.ActionBar.l6.L5;
                    alertDialog$Builder2.m(2131624115, 72, getThemedColor(i13), null);
                    alertDialog$Builder2.n(i13, getResourceProvider());
                    String M02 = org.telegram.messenger.id.M0(2131747314, null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                    u1Var2.T = M02;
                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747300, null), new hu(this, 11));
                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131751772, null), new org.telegram.ui.Components.jl0(18));
                    showDialog(u1Var2);
                }
            } else {
                return;
            }
        }
        V4();
        if (this.f52231e0 != null) {
            int i14 = 0;
            while (true) {
                xw[] xwVarArr2 = this.f52231e0;
                if (i14 >= xwVarArr2.length) {
                    break;
                }
                xw xwVar2 = xwVarArr2[i14];
                if (xwVar2.f51779s == 0 && xwVar2.f51780w == 2 && xwVar2.f51774c.L0() == 0 && l4()) {
                    this.f52231e0[i14].f51774c.h1(1, (int) this.N);
                }
                if (i14 == 0) {
                    this.f52231e0[i14].d.getClass();
                } else {
                    this.f52231e0[i14].d.getClass();
                }
                i14++;
            }
        }
        X4();
        setBulletinDelegate(new y8(this, 4));
        if (this.f52297r3) {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
        u5(0, false);
        m5(false, true);
        t5(false);
        D3();
        N3();
        if (this.f52337z0 != null && (xwVar = this.f52231e0[0]) != null && (ivVar = xwVar.d) != null) {
            int i15 = ivVar.h;
            if (i15 == 7 || i15 == 8) {
                org.telegram.messenger.vo[] voVarArr = getMessagesController().M;
                if (i15 != 7) {
                    c10 = 1;
                }
                org.telegram.messenger.vo voVar = voVarArr[c10];
                if (voVar != null) {
                    this.f52337z0.h(voVar.f26082o);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z9, float f10) {
        if (org.telegram.messenger.iz.o() <= 0) {
            boolean z10 = org.telegram.messenger.r2.f25212a;
        } else if (this.Z3 && this.f52213a4 == null) {
            R4(f10);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f52243g1.setColor(getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
            y3();
            h5();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        bi.ec ecVar;
        yw ywVar;
        uv uvVar = this.G3;
        if (uvVar != null && uvVar.c()) {
            this.G3.getFragment().onTransitionAnimationEnd(z9, z10);
        } else {
            if (z9 && (ecVar = this.K0) != null && ecVar.getVisibility() == 0) {
                this.K0.setVisibility(8);
                this.K0.setBackground(null);
            }
            if (z9 && this.f52312u2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f41300v0.c(false);
                }
            }
        }
        if (!z9 && (ywVar = this.Y2) != null) {
            ywVar.removeSelfFromStack();
        }
        N3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z9, float f10) {
        uv uvVar = this.G3;
        if (uvVar != null && uvVar.c()) {
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
        org.telegram.ui.Components.qo0 qo0Var = this.H2;
        if (qo0Var != null) {
            int i7 = this.currentAccount;
            qo0Var.h(i7);
            qo0Var.d = org.telegram.messenger.p10.i(org.telegram.messenger.c.a(i7).f21765a).e();
            ArrayList arrayList = qo0Var.f37451f;
            arrayList.clear();
            ArrayList arrayList2 = this.J2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            fi.i1 i1Var = qo0Var.f37447a[0];
            if (qo0Var.f37448b == 1) {
                ((org.telegram.ui.ActionBar.l5) i1Var.f12167e).l(qo0Var.c(i1Var), false);
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
        this.f52213a4 = null;
        this.Z3 = false;
        N4(false);
        R4(1.0f);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.f2 f2Var) {
        boolean presentFragment = super.presentFragment(f2Var);
        if (presentFragment && this.f52231e0 != null) {
            int i7 = 0;
            while (true) {
                xw[] xwVarArr = this.f52231e0;
                if (i7 >= xwVarArr.length) {
                    break;
                }
                xwVarArr[i7].d.getClass();
                i7++;
            }
        }
        fi.m3 m3Var = this.f52283p0;
        if (m3Var != null) {
            m3Var.f(true);
        }
        fi.m3 m3Var2 = this.f52288q0;
        if (m3Var2 != null) {
            m3Var2.f(true);
        }
        org.telegram.ui.Components.cc.e();
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
        if (this.f52266l0 == null) {
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
        ArrayList l10 = org.telegram.messenger.qp.s1(this.currentAccount).f24877q7.l(-a22.f27105id);
        if ((l10 != null && !l10.isEmpty()) || !org.telegram.messenger.qp.s1(this.currentAccount).f24877q7.e(-a22.f27105id)) {
            return false;
        }
        return true;
    }

    public final void r5(TLRPC.User user, boolean z9) {
        org.telegram.ui.Components.g5 g5Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        rv rvVar = this.E0;
        org.telegram.ui.Components.g5 g5Var2 = null;
        if (rvVar != null && (g5Var = rvVar.f9527a0) != null && rvVar.f9547q0 != null) {
            Long h = org.telegram.messenger.t10.h(user);
            if (h != null) {
                g5Var.j(h.longValue(), z9);
                g5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z9);
            } else {
                if (user != null) {
                    org.telegram.messenger.qp.s1(rvVar.f9535f);
                    if (org.telegram.messenger.qp.B2(user)) {
                        if (rvVar.N0 == null) {
                            rvVar.N0 = rvVar.getContext().getResources().getDrawable(2131232307).mutate();
                            rvVar.N0 = new org.telegram.ui.Components.h5(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), rvVar.N0);
                        }
                        Drawable drawable = rvVar.N0;
                        int i7 = org.telegram.ui.ActionBar.l6.f28058ni;
                        yw ywVar = rvVar.f9534e0;
                        if (ywVar != null) {
                            g6Var = ywVar.getResourceProvider();
                        } else {
                            g6Var = null;
                        }
                        org.telegram.ui.ActionBar.s6.x(rvVar, drawable, i7, g6Var, PorterDuff.Mode.MULTIPLY);
                        g5Var.g(rvVar.N0, z9);
                        g5Var.m(false, z9);
                    }
                }
                g5Var.g(null, z9);
                g5Var.m(false, z9);
            }
            g5Var.k(Integer.valueOf(rvVar.f(org.telegram.ui.ActionBar.l6.f28058ni)));
            rvVar.W.invalidate();
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
                this.actionBar.setRightDrawableOnClick(new gu(this, 1));
                s11.t(this.currentAccount);
            } else {
                if (user != null) {
                    org.telegram.messenger.qp.s1(this.currentAccount);
                    if (org.telegram.messenger.qp.B2(user)) {
                        if (this.L3 == null) {
                            this.L3 = getParentActivity().getResources().getDrawable(2131232307).mutate();
                            this.L3 = new org.telegram.ui.Components.h5(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.L3);
                        }
                        Drawable drawable2 = this.L3;
                        int themedColor = getThemedColor(org.telegram.ui.ActionBar.l6.f28058ni);
                        this.f52331x4 = themedColor;
                        drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                        this.E3.g(this.L3, z9);
                        this.E3.m(false, z9);
                        this.actionBar.setRightDrawableOnClick(new gu(this, 2));
                        s11.t(this.currentAccount);
                    }
                }
                this.E3.g(null, z9);
                this.E3.m(false, z9);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.g5 g5Var3 = this.E3;
            int i10 = org.telegram.ui.ActionBar.l6.f28058ni;
            g5Var3.k(Integer.valueOf(getThemedColor(i10)));
            org.telegram.ui.Cells.o oVar = this.F3;
            if (oVar != null) {
                oVar.setColor(getThemedColor(i10));
            }
            wv wvVar = this.M0;
            if (wvVar != null && (wvVar.getContentView() instanceof s11)) {
                org.telegram.ui.ActionBar.l5 titleTextView = this.actionBar.getTitleTextView();
                s11 s11Var = (s11) this.M0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.g5 g5Var4 = this.E3;
                    if (rightDrawable == g5Var4) {
                        g5Var2 = g5Var4;
                    }
                }
                s11Var.y(g5Var2, titleTextView);
            }
        }
    }

    public final boolean s3(long j3, View view) {
        if (this.f52271m2 && getMessagesController().t2(j3)) {
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
        int i7 = this.f52231e0[0].f51779s;
        org.telegram.messenger.vo voVar = null;
        if ((i7 == 7 || i7 == 8) && (!this.actionBar.w() || this.actionBar.x(null))) {
            org.telegram.messenger.vo[] voVarArr = getMessagesController().M;
            if (this.f52231e0[0].f51779s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            voVar = voVarArr[c10];
        }
        if (voVar != null) {
            if (voVar.f26077j.indexOfKey(dialog.f26960id) < 0) {
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
            if (!this.O3 && W4 && (m3Var = this.f52283p0) != null) {
                m3Var.w();
            }
            this.O3 = W4;
        }
        org.telegram.ui.Components.q00 q00Var = this.f52305t0;
        if (q00Var == null) {
            return;
        }
        if (this.S0 == 10) {
            q00Var.setImageResource(2131231195);
            this.f52305t0.setContentDescription(org.telegram.messenger.id.M0(2131751354, null));
            return;
        }
        q00Var.setImageResource(2131231107);
        this.f52305t0.setContentDescription(org.telegram.messenger.id.M0(2131748270, null));
    }

    @Override
    public final void setInPreviewMode(boolean z9) {
        super.setInPreviewMode(z9);
        rv rvVar = this.E0;
        if (rvVar != null) {
            if (this.G0 && !z9) {
                rvVar.setVisibility(0);
            } else {
                rvVar.setVisibility(8);
            }
        }
        l5(true);
        g5();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r6, int r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    public final void t3(jg.o0 o0Var) {
        hw hwVar;
        if (this.f52297r3 && (hwVar = this.C0) != null) {
            ArrayList arrayList = hwVar.C0;
            if (!arrayList.isEmpty()) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    if (o0Var.b((jg.o0) arrayList.get(i7))) {
                        return;
                    }
                }
            }
            arrayList.add(o0Var);
            nw nwVar = this.X;
            ArrayList arrayList2 = nwVar.F;
            arrayList2.add(o0Var);
            nwVar.I = arrayList2.size() - 1;
            nwVar.e();
            this.X.f37857r.getText().clear();
            j5(true, null, null, false, true);
        }
    }

    public final boolean t4() {
        if (this.D2 == null && this.f52281o2 == null) {
            return true;
        }
        return false;
    }

    public final void t5(boolean z9) {
        org.telegram.ui.ActionBar.k kVar;
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
            uv uvVar = this.G3;
            if ((uvVar == null || !uvVar.c()) && !this.f52297r3 && (kVar = this.actionBar) != null && !kVar.w() && !this.f52271m2) {
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
                    if (!z10 && (((arrayList = (j42 = j4()).f9997g) != null && arrayList.size() > 0) || j42.J())) {
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
                    rv rvVar = this.E0;
                    if (z12 != z14) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    rvVar.p(z9, z13);
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
                        this.J.setInterpolator(org.telegram.ui.Components.xq.f40458f);
                        this.J.start();
                    } else {
                        rv rvVar2 = this.E0;
                        if (z15 && !isInPreviewMode()) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        rvVar2.setVisibility(i7);
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
                        ofFloat2.addUpdateListener(new gw(this, f14, z11, f12));
                        this.I.addListener(new aw(this, z11, 2));
                        this.I.setDuration(200L);
                        this.I.setInterpolator(org.telegram.ui.Components.xq.f40458f);
                        this.I.start();
                        return;
                    }
                    this.K = z11;
                    rv rvVar3 = this.E0;
                    if ((z11 || this.L) && !isInPreviewMode()) {
                        i11 = 0;
                    }
                    rvVar3.setVisibility(i11);
                    if (!z11) {
                        O4(0.0f);
                    } else {
                        this.f52340z3 = -org.telegram.messenger.g0.L(81.0f);
                        O4(-f4());
                    }
                    while (true) {
                        xw[] xwVarArr = this.f52231e0;
                        if (i10 >= xwVarArr.length) {
                            break;
                        }
                        xw xwVar = xwVarArr[i10];
                        if (xwVar != null) {
                            xwVar.f51772a.requestLayout();
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
            if (this.X2 == 0 && this.Z2 == 0 && Build.VERSION.SDK_INT >= 33 && fh0.J0(parentActivity)) {
                if (z9) {
                    showDialog(new fh0(parentActivity, !c8.ia.a(), new tu(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().U && this.V1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z9) {
                    org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.v4.v(parentActivity, new ku(this, 1)).f27296a;
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
            } else if ((i7 <= 28 || org.telegram.messenger.r2.f25213b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.u5(int, boolean):void");
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
                org.telegram.ui.Components.qo0 qo0Var = new org.telegram.ui.Components.qo0(getParentActivity(), getResourceProvider());
                this.H2 = qo0Var;
                qo0Var.setLayoutClickListener(new gu(this, 0));
                this.H2.setOnModeChangeListener(new hu(this, 0));
                lv lvVar = this.C1;
                org.telegram.ui.Components.qo0 qo0Var2 = this.H2;
                if (qo0Var2 == null) {
                    lvVar.getClass();
                } else {
                    lvVar.G1 = qo0Var2;
                    lvVar.addView(qo0Var2, 0, c8.ha.e(-1, 48, 51));
                    lvVar.f31061g3 = false;
                    lvVar.I();
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
                    org.telegram.ui.Components.qo0 qo0Var3 = this.H2;
                    qo0Var3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        qo0Var3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.G2;
                    if (charSequence2 != null) {
                        org.telegram.ui.Components.qo0 qo0Var4 = this.H2;
                        qo0Var4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            qo0Var4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.C1.setFieldText(charSequence);
            }
            lv lvVar2 = this.C1;
            if (m4()) {
                i7 = 2131754454;
            } else {
                i7 = 2131745462;
            }
            lvVar2.setOverrideHint(org.telegram.messenger.id.M0(i7, null));
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
            ArrayList arrayList = (ArrayList) getMessagesController().f24934x.f(dialog.community_id);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                v4(((TLRPC.Dialog) obj).f26960id);
            }
            return;
        }
        int i10 = this.f52231e0[0].f51779s;
        org.telegram.messenger.vo voVar = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.w() || this.actionBar.x(null))) {
            org.telegram.messenger.vo[] voVarArr = getMessagesController().M;
            if (this.f52231e0[0].f51779s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            voVar = voVarArr[c10];
        }
        int i11 = -1;
        if (voVar != null) {
            int i12 = voVar.f26075g;
            int i13 = org.telegram.messenger.qp.C8;
            if ((i12 & 64) != 0 && !voVar.a(this.currentAccount, dialog)) {
                M4(true, true);
                z3();
                if (this.S1 != null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= this.S1.size()) {
                            break;
                        } else if (((TLRPC.Dialog) this.S1.get(i14)).f26960id == j10) {
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
            org.telegram.messenger.p5 p5Var = messagesStorage.f26719a;
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
            this.f52231e0[0].f51782y.D();
            this.f52231e0[0].q(true);
        }
    }

    public final boolean v5(long j3) {
        TLRPC.Chat M0;
        lv lvVar;
        if ((this.T0 <= 1 && ((lvVar = this.C1) == null || lvVar.getVisibility() != 0 || TextUtils.isEmpty(this.C1.getFieldText()))) || !org.telegram.messenger.m5.z(j3) || (M0 = getMessagesController().M0(Long.valueOf(-j3))) == null || org.telegram.messenger.t3.N(M0) || !M0.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.v4.r0(this, org.telegram.messenger.id.M0(2131745310, null), org.telegram.messenger.id.M0(2131745302, null), null);
        return false;
    }

    public final int w3() {
        if (this.C1 != null) {
            return (int) (this.f52338z1.getInputBubbleHeight() + this.f52320w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(2.0f));
        } else if (this.Z2 != 0) {
            return org.telegram.messenger.g0.L(72.0f) + this.f52246g4;
        } else {
            return this.f52246g4 + this.f52256i4;
        }
    }

    public final boolean w4(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.User r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.w4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
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
        org.telegram.ui.Components.af0 af0Var;
        hv hvVar;
        org.telegram.ui.Components.zl0 zl0Var;
        f61 f61Var;
        hw hwVar = this.C0;
        if (hwVar != null && (zl0Var = hwVar.f33995d0) != null && (f61Var = zl0Var.f16750k0) != null) {
            int childCount = f61Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = f61Var.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.o4) {
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) childAt;
                    org.telegram.ui.Components.w8 w8Var = o4Var.f29652c;
                    int i10 = o4Var.h;
                    if (org.telegram.messenger.m5.E(o4Var.f29654f)) {
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(o4Var.f29654f));
                        o4Var.f29653e = a22;
                        w8Var.r(a22);
                    } else {
                        w8Var.q(org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-o4Var.f29654f)));
                        o4Var.f29653e = null;
                    }
                    o4Var.c(true);
                }
            }
        }
        if (this.f52231e0 != null) {
            int i11 = 0;
            while (true) {
                xw[] xwVarArr = this.f52231e0;
                if (i11 >= xwVarArr.length) {
                    break;
                }
                xw xwVar = xwVarArr[i11];
                if (xwVar != null && (hvVar = xwVar.f51777n) != null) {
                    hvVar.i();
                }
                i11++;
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.G(getThemedColor(org.telegram.ui.ActionBar.l6.G8), true);
            this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.l6.E8), false, true);
            this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.l6.F8), true, true);
            this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.l6.I5), true);
            this.actionBar.updateColors();
        }
        if (this.E3 != null) {
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.l6.f28058ni);
            Drawable drawable = this.L3;
            if (drawable != null && themedColor2 != this.f52331x4) {
                this.f52331x4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.Components.g5 g5Var = this.E3;
            if (g5Var != null) {
                g5Var.k(Integer.valueOf(themedColor2));
            }
            org.telegram.ui.Cells.o oVar = this.F3;
            if (oVar != null) {
                oVar.setColor(themedColor2);
            }
        }
        org.telegram.ui.Cells.b3 b3Var = this.N1;
        if (b3Var != null) {
            org.telegram.ui.ActionBar.l6.H1(b3Var.getBackground(), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27957i6, false), true);
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.m0;
        if (r0Var != null) {
            r0Var.setIconColor(getThemedColor(org.telegram.ui.ActionBar.l6.f28202v8));
        }
        lv lvVar = this.C1;
        if (lvVar != null) {
            lvVar.updateColors();
        }
        ow owVar = this.f52337z0;
        if (owVar != null) {
            fh.g gVar = owVar.f33799y0;
            if (gVar != null) {
                gVar.updateColors();
            }
            owVar.invalidate();
        }
        jg.q0 q0Var = this.f52215b0;
        if (q0Var != null) {
            q0Var.updateColors();
        }
        hw hwVar2 = this.C0;
        if (hwVar2 != null && (af0Var = hwVar2.f34008r0) != null) {
            af0Var.c();
        }
        org.telegram.ui.Components.v61 v61Var = this.f52209a0;
        if (v61Var != null) {
            v61Var.updateColors();
        }
        fz0 fz0Var = this.Z;
        if (fz0Var != null) {
            fz0Var.updateColors();
        }
        if (this.K0 != null) {
            int o4 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6), 100);
            if (this.K0.getForeground() instanceof ColorDrawable) {
                if (((ColorDrawable) this.K0.getForeground()).getColor() != o4) {
                    ((ColorDrawable) this.K0.getForeground()).setColor(o4);
                }
            } else {
                this.K0.setForeground(new ColorDrawable(o4));
            }
        }
        org.telegram.ui.Components.q00 q00Var = this.f52305t0;
        if (q00Var != null) {
            q00Var.updateColors();
        }
        org.telegram.ui.Components.q00 q00Var2 = this.f52310u0;
        if (q00Var2 != null) {
            q00Var2.updateColors();
        }
        int i12 = org.telegram.ui.ActionBar.l6.f27865d6;
        this.f52278n4.a(getThemedColor(i12));
        org.telegram.ui.Components.pr prVar = this.K1;
        if (prVar != null) {
            prVar.updateColors();
        }
        org.telegram.ui.Components.or orVar = this.L1;
        if (orVar != null) {
            orVar.setColor(org.telegram.ui.ActionBar.l6.x0(null, i12, false));
        }
        jv jvVar = this.I1;
        if (jvVar != null) {
            jvVar.updateColors();
        }
        jv jvVar2 = this.G1;
        if (jvVar2 != null) {
            jvVar2.updateColors();
        }
        n5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        rv rvVar = this.E0;
        if (rvVar != null) {
            rvVar.o();
        }
        if (this.D3 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.l6.Ul)) != this.f52325w4) {
            this.f52325w4 = themedColor;
            this.D3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        nw nwVar = this.X;
        if (nwVar != null) {
            nwVar.updateColors();
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
        org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(getParentActivity(), false, 1, null);
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
        if (org.telegram.messenger.iz.f23430q1) {
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
        if (org.telegram.messenger.iz.f23430q1) {
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
        org.telegram.messenger.g0.i3(new bv(this, 0), 300L);
    }

    public final void z4(android.view.View r27, int r28, v4.g0 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.z4(android.view.View, int, v4.g0):void");
    }
}
