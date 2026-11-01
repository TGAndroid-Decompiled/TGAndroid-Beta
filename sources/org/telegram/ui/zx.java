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
public class zx extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs, fg.b, fe.e, nf0 {
    public static float A4;
    public static boolean f44112x4;
    public static final boolean[] f44113y4 = new boolean[4];
    public static final org.telegram.ui.Components.rq0 f44114z4 = new org.telegram.ui.Components.rq0(3);
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public nw B1;
    public boolean B2;
    public Long B3;
    public jx C0;
    public bi.f2 C1;
    public tx C2;
    public Drawable C3;
    public boolean D;
    public org.telegram.ui.Components.st0 D0;
    public org.telegram.ui.ActionBar.t0 D1;
    public ArrayList D2;
    public org.telegram.ui.Components.d5 D3;
    public boolean E;
    public tw E0;
    public final TextPaint E1;
    public String E2;
    public org.telegram.ui.Cells.n E3;
    public boolean F;
    public org.telegram.ui.Components.xr F0;
    public lw F1;
    public CharSequence F2;
    public ww F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public FrameLayout G1;
    public org.telegram.ui.Components.tp0 G2;
    public final mw G3;
    public long H;
    public float H0;
    public lw H1;
    public org.telegram.ui.Components.voip.u H2;
    public final mw H3;
    public ValueAnimator I;
    public float I0;
    public FrameLayout I1;
    public final ArrayList I2;
    public e I3;
    public ValueAnimator J;
    public float J0;
    public org.telegram.ui.Components.zr J1;
    public boolean J2;
    public xa.n J3;
    public boolean K;
    public bi.t0 K0;
    public org.telegram.ui.Components.yr K1;
    public int K2;
    public Drawable K3;
    public boolean L;
    public org.telegram.ui.Components.z60 L0;
    public org.telegram.ui.Cells.l L1;
    public int L2;
    public int L3;
    public boolean M;
    public yw M0;
    public org.telegram.ui.Cells.d3 M1;
    public boolean M2;
    public boolean M3;
    public float N;
    public boolean N0;
    public org.telegram.ui.Cells.ma N1;
    public int N2;
    public boolean N3;
    public boolean O;
    public boolean O0;
    public Long O1;
    public int O2;
    public AnimatorSet O3;
    public int P;
    public long P0;
    public Long P1;
    public int P2;
    public boolean P3;
    public boolean Q;
    public long Q0;
    public zh.j Q1;
    public int Q2;
    public nu Q3;
    public boolean R;
    public int R0;
    public ArrayList R1;
    public int R2;
    public String R3;
    public org.telegram.ui.Components.wb S;
    public int S0;
    public boolean S1;
    public int S2;
    public ArrayList S3;
    public float T;
    public int T0;
    public org.telegram.ui.ActionBar.x1 T1;
    public int T2;
    public boolean T3;
    public boolean U;
    public boolean U0;
    public boolean U1;
    public int U2;
    public CharSequence U3;
    public boolean V;
    public org.telegram.ui.Components.gc0 V0;
    public boolean V1;
    public boolean V2;
    public boolean V3;
    public boolean W;
    public org.telegram.ui.Cells.v2 W0;
    public long W1;
    public int W2;
    public float W3;
    public ox X;
    public org.telegram.ui.Cells.v2 X0;
    public TLObject X1;
    public zx X2;
    public boolean X3;
    public rf.a0 Y;
    public boolean Y0;
    public int Y1;
    public long Y2;
    public boolean Y3;
    public q01 Z;
    public boolean Z0;
    public int Z1;
    public TLRPC.Chat Z2;
    public ValueAnimator Z3;
    public final int f44115a;
    public org.telegram.ui.Components.w71 f44116a0;
    public final ArrayList f44117a1;
    public boolean a2;
    public TLRPC.ChatFull f44118a3;
    public org.telegram.ui.Components.b40 f44119a4;
    public final fe.b f44120b;
    public zf.g0 f44121b0;
    public boolean f44122b1;
    public boolean f44123b2;
    public org.telegram.ui.Components.g9 f44124b3;
    public TLRPC.FileLocation f44125b4;
    public final fe.b f44126c;
    public float f44127c0;
    public boolean f44128c1;
    public boolean f44129c2;
    public org.telegram.ui.Components.r8 f44130c3;
    public TLRPC.FileLocation f44131c4;
    public final fe.b d;
    public ValueAnimator f44132d0;
    public boolean f44133d1;
    public int f44134d2;
    public long f44135d3;
    public org.telegram.ui.Components.wb f44136d4;
    public final fe.b e;
    public yx[] f44137e0;
    public org.telegram.ui.ActionBar.c2 f44138e1;
    public boolean f44139e2;
    public boolean f44140e3;
    public int f44141e4;
    public final fe.b f44142f;
    public org.telegram.ui.ActionBar.t0 f44143f0;
    public final Paint f44144f1;
    public String f44145f2;
    public boolean f44146f3;
    public int f44147f4;
    public org.telegram.ui.ActionBar.t0 f44148g0;
    public ImageView f44149g1;
    public String f44150g2;
    public AnimatorSet f44151g3;
    public int f44152g4;
    public final fe.b h;
    public cy f44153h0;
    public NumberTextView f44154h1;
    public String f44155h2;
    public boolean f44156h3;
    public int f44157h4;
    public boolean f44158i0;
    public final ArrayList f44159i1;
    public boolean f44160i2;
    public boolean f44161i3;
    public int f44162i4;
    public org.telegram.ui.ActionBar.t0 f44163j0;
    public org.telegram.ui.ActionBar.t0 f44164j1;
    public boolean f44165j2;
    public float f44166j3;
    public final tg.f f44167j4;
    public org.telegram.ui.ActionBar.t0 f44168k0;
    public org.telegram.ui.ActionBar.t0 f44169k1;
    public boolean f44170k2;
    public boolean f44171k3;
    public final hi.f f44172k4;
    public org.telegram.ui.ActionBar.t0 f44173l0;
    public org.telegram.ui.ActionBar.t0 l1;
    public boolean f44174l2;
    public int f44175l3;
    public final hi.f l4;
    public org.telegram.ui.ActionBar.t0 m0;
    public org.telegram.ui.ActionBar.t0 f44176m1;
    public boolean f44177m2;
    public boolean f44178m3;
    public final hi.c f44179m4;
    public final fe.b f44180n;
    public org.telegram.ui.Components.lh0 f44181n0;
    public org.telegram.ui.ActionBar.b1 f44182n1;
    public String f44183n2;
    public boolean f44184n3;
    public final tg.b f44185n4;
    public org.telegram.ui.ActionBar.b1 f44186o0;
    public org.telegram.ui.ActionBar.b1 f44187o1;
    public String f44188o2;
    public org.telegram.ui.Components.wb f44189o3;
    public final tg.b f44190o4;
    public vh.p2 f44191p0;
    public org.telegram.ui.ActionBar.b1 f44192p1;
    public final org.telegram.messenger.hs f44193p2;
    public final e2.f f44194p3;
    public final tg.b f44195p4;
    public vh.p2 f44196q0;
    public org.telegram.ui.ActionBar.b1 f44197q1;
    public boolean f44198q2;
    public boolean f44199q3;
    public final tg.b f44200q4;
    public final fe.b f44201r;
    public boolean f44202r0;
    public org.telegram.ui.ActionBar.b1 f44203r1;
    public boolean f44204r2;
    public boolean f44205r3;
    public xv f44206r4;
    public final fe.b f44207s;
    public boolean f44208s0;
    public org.telegram.ui.ActionBar.b1 f44209s1;
    public boolean f44210s2;
    public boolean f44211s3;
    public final ArrayList f44212s4;
    public org.telegram.ui.Components.f10 f44213t0;
    public org.telegram.ui.ActionBar.b1 f44214t1;
    public boolean f44215t2;
    public boolean f44216t3;
    public final RectF f44217t4;
    public org.telegram.ui.Components.f10 f44218u0;
    public float f44219u1;
    public boolean f44220u2;
    public float f44221u3;
    public final RectF f44222u4;
    public vh.d f44223v0;
    public float f44224v1;
    public boolean f44225v2;
    public ValueAnimator f44226v3;
    public int f44227v4;
    public final hh.i f44228w;
    public bh.i f44229w0;
    public AnimatorSet f44230w1;
    public boolean f44231w2;
    public float f44232w3;
    public int f44233w4;
    public boolean f44234x;
    public int f44235x0;
    public float f44236x1;
    public boolean f44237x2;
    public float f44238x3;
    public int f44239y;
    public final UndoView[] f44240y0;
    public zg.e f44241y1;
    public boolean f44242y2;
    public float y3;
    public px f44243z0;
    public FrameLayout f44244z1;
    public boolean f44245z2;
    public boolean f44246z3;

    public zx(Bundle bundle) {
        super(bundle);
        int i10;
        int L;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f44115a = i10;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.f44120b = new fe.b(1, this, grVar, 350L, false);
        this.f44126c = new fe.b(2, this, grVar, 350L, false);
        this.d = new fe.b(3, this, grVar, 350L, false);
        this.e = new fe.b(4, this, grVar, 350L, false);
        this.f44142f = new fe.b(5, this, grVar, 350L, false);
        this.h = new fe.b(6, this, grVar, 350L, false);
        this.f44180n = new fe.b(7, this, grVar, 350L, false);
        this.f44201r = new fe.b(8, this, grVar, 350L, false);
        this.f44207s = new fe.b(9, this, grVar, 350L, false);
        this.f44228w = new hh.i(new ev(this, 18));
        this.f44239y = -1;
        this.F = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.Q = true;
        this.f44127c0 = 1.0f;
        this.f44240y0 = new UndoView[2];
        this.f44117a1 = new ArrayList();
        this.f44144f1 = new Paint();
        this.f44159i1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.E1 = new TextPaint(1);
        this.U1 = true;
        this.f44129c2 = true;
        this.f44160i2 = true;
        this.f44193p2 = new Object();
        this.I2 = new ArrayList();
        this.J2 = true;
        this.f44194p3 = new e2.f((int[]) null);
        this.G3 = new mw(this, 0);
        this.H3 = new mw(this, 1);
        this.L3 = -4;
        this.M3 = true;
        this.N3 = true;
        this.W3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f44212s4 = arrayList;
        RectF rectF = new RectF();
        this.f44217t4 = rectF;
        RectF rectF2 = new RectF();
        this.f44222u4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        hi.c d = this.glassEngine.d(new hv(this, 12));
        this.f44179m4 = d;
        if (i11 >= 31) {
            tg.f fVar = new tg.f(false);
            this.f44167j4 = fVar;
            hi.f fVar2 = new hi.f(d);
            this.l4 = fVar2;
            fVar2.f7720f = d;
            fVar2.d = fVar;
            fVar2.e = -2;
            hi.f fVar3 = new hi.f(null);
            this.f44172k4 = fVar3;
            fVar3.f7720f = d;
            fVar3.d = fVar;
            fVar3.e = -3;
            tg.b bVar = new tg.b(fVar2, fVar2, fVar2);
            this.f44195p4 = bVar;
            bVar.f48715k = true;
            if (org.telegram.messenger.tc.e(262144)) {
                L = org.telegram.messenger.i0.L(8.0f);
            } else {
                L = org.telegram.messenger.i0.L(48.0f);
            }
            bVar.d = L;
            bVar.e = L;
            tg.b bVar2 = new tg.b(fVar3, fVar3, fVar3);
            this.f44185n4 = bVar2;
            bVar2.f48715k = true;
            int L2 = org.telegram.messenger.i0.L(48.0f);
            bVar2.d = L2;
            bVar2.e = L2;
            this.f44190o4 = new tg.b(fVar3, fVar3, fVar3);
        } else {
            this.f44167j4 = null;
            this.f44172k4 = null;
            this.l4 = null;
            this.f44185n4 = new tg.b(d, d, d);
            this.f44195p4 = new tg.b(d, d, d);
            this.f44190o4 = new tg.b(d, d, d);
        }
        tg.b bVar3 = new tg.b(d, d, d);
        this.f44200q4 = bVar3;
        tg.b bVar4 = this.f44195p4;
        ei.r rVar = this.glassEngine;
        bVar4.f48714j = rVar;
        this.f44185n4.f48714j = rVar;
        this.f44190o4.f48714j = rVar;
        bVar3.f48714j = rVar;
    }

    public static void A0(zx zxVar) {
        if (!zxVar.N3) {
            vh.p2 p2Var = zxVar.f44196q0;
            if (p2Var != null) {
                if (p2Var.V) {
                    return;
                }
                org.telegram.messenger.i0.E2(p2Var);
            }
            SpannableStringBuilder R2 = org.telegram.messenger.i0.R2(org.telegram.messenger.dd.M0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.t6.uj, 0, new ev(zxVar, 24), null);
            vh.p2 p2Var2 = new vh.p2(zxVar.getParentActivity(), 2);
            p2Var2.q(8.0f);
            p2Var2.d = 8000L;
            p2Var2.i(true);
            p2Var2.p(true);
            p2Var2.h = org.telegram.messenger.i0.f16172q.x - org.telegram.messenger.i0.L(148.0f);
            p2Var2.s(R2);
            p2Var2.l(1.0f, -40.0f);
            p2Var2.h(zxVar.getThemedColor(org.telegram.ui.ActionBar.t6.tj));
            zxVar.f44196q0 = p2Var2;
            p2Var2.setTranslationY((-zxVar.f44147f4) - zxVar.f44157h4);
            ((ViewGroup) zxVar.fragmentView).addView(zxVar.f44196q0, w7.b6.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            zxVar.f44196q0.u();
            return;
        }
        vh.p2 p2Var3 = zxVar.f44191p0;
        if (p2Var3 != null) {
            p2Var3.e(true);
        }
        j4.w o10 = org.telegram.messenger.wp.r1(zxVar.currentAccount).O1().o();
        if (o10 != null && o10.a(zxVar.currentAccount, 1)) {
            zxVar.showDialog(new kg.q0(o10.b(), zxVar.currentAccount, zxVar.getParentActivity(), zxVar, null));
            return;
        }
        vh.o8 D = vh.o8.D(zxVar.getParentActivity(), zxVar.currentAccount);
        D.f51697y = new hw(zxVar);
        D.Q(null);
    }

    public static void B0(zx zxVar) {
        org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, "PREMIUM_CHRISTMAS");
        zxVar.g5();
        org.telegram.ui.Components.wb G = org.telegram.ui.Components.cc.a0(zxVar).G(2131624032, 4, org.telegram.messenger.dd.L0(2131753330, null));
        G.f32201j = 5000;
        G.j();
    }

    public static void C0(org.telegram.ui.zx r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.C0(org.telegram.ui.zx, int):void");
    }

    public static void D0(zx zxVar) {
        org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, "BIRTHDAY_SETUP");
        zxVar.g5();
        org.telegram.ui.Components.wb K = org.telegram.ui.Components.cc.a0(zxVar).K(2131623981, org.telegram.messenger.dd.L0(2131753714, null), org.telegram.messenger.dd.L0(2131745512, null), new ev(zxVar, 29));
        K.f32201j = 5000;
        K.j();
    }

    public static void E0(zx zxVar) {
        boolean z10 = true;
        try {
            ((org.telegram.ui.Components.ci0) ((org.telegram.ui.Components.r8) zxVar.M1.h.getImageReceiver().m0).K).H(true);
        } catch (Exception unused) {
        }
        if (zxVar.f44119a4 == null) {
            org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40(0, true, true);
            zxVar.f44119a4 = b40Var;
            b40Var.H = true;
            b40Var.f24618a = zxVar;
            b40Var.f24619b = new nx(zxVar);
            zxVar.getMediaDataController().x();
            zxVar.getMessagesController().b3();
            zxVar.getMessagesController().e3(zxVar.getUserConfig().f(), true, zxVar.classGuid);
        }
        TLRPC.User Z1 = org.telegram.messenger.wp.r1(zxVar.currentAccount).Z1(Long.valueOf(org.telegram.messenger.e20.i(zxVar.currentAccount).e()));
        if (Z1 == null) {
            Z1 = org.telegram.messenger.e20.i(zxVar.currentAccount).f();
        }
        if (Z1 != null) {
            org.telegram.ui.Components.bi biVar = zxVar.f44119a4.f24620c;
            if (biVar != null) {
                biVar.P0();
            }
            org.telegram.ui.Components.b40 b40Var2 = zxVar.f44119a4;
            TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            b40Var2.n(z10, new ev(zxVar, 28), new nv(zxVar, 3), 0);
        }
    }

    public static void G0(zx zxVar, float f7, ValueAnimator valueAnimator) {
        zxVar.f44137e0[0].setTranslationY((1.0f - zxVar.f44221u3) * f7);
        zxVar.f44221u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < zxVar.actionBar.getChildCount(); i10++) {
            if (zxVar.actionBar.getChildAt(i10).getVisibility() == 0 && zxVar.actionBar.getChildAt(i10) != zxVar.actionBar.getActionMode() && zxVar.actionBar.getChildAt(i10) != zxVar.actionBar.getBackButton()) {
                zxVar.actionBar.getChildAt(i10).setAlpha(1.0f - zxVar.f44221u3);
            }
        }
        zxVar.Q3();
        zxVar.I3();
        View view = zxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void H0(zx zxVar) {
        org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(zxVar.getParentActivity(), zxVar.resourceProvider);
        ebVar.d(2131624008, new String[0]);
        ebVar.f25779b.setText(org.telegram.messenger.dd.L0(2131742836, null));
        org.telegram.ui.Components.wb.g(zxVar, ebVar, 2750).j();
        try {
            zxVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void I0(zx zxVar, org.telegram.messenger.w1 w1Var) {
        ArrayList arrayList = w1Var.f18964c;
        if (arrayList.size() == 1) {
            ph.l1 l1Var = new ph.l1(zxVar.getParentActivity(), zxVar.currentAccount, ((TLRPC.User) arrayList.get(0)).f19943id, null, null);
            l1Var.e1(true);
            zxVar.showDialog(l1Var);
            return;
        }
        mg.i2.l1(0, w1Var);
    }

    public static void J0(zx zxVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.wb I = org.telegram.ui.Components.cc.a0(zxVar).I(2131624032, org.telegram.messenger.dd.L0(2131746871, null), org.telegram.messenger.dd.L0(2131746870, null));
            I.f32201j = 5000;
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
            zxVar.getMessagesStorage().j2(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (zxVar.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zxVar.getParentActivity(), zxVar.resourceProvider);
                String L0 = org.telegram.messenger.dd.L0(2131746867, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.dd.L0(2131746868, null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                zxVar.showDialog(x1Var);
                return;
            }
            return;
        }
        org.telegram.messenger.m5.n(null, 2131743904, org.telegram.ui.Components.cc.a0(zxVar), 2131624011, 36);
    }

    public static void K0(zx zxVar) {
        org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        zxVar.g5();
    }

    public static void X2(zx zxVar, float f7) {
        float f10;
        float f11;
        int i10;
        int i11;
        float i12 = Utilities.i(zxVar.f44236x1 * 2.0f, 1.0f, 0.0f);
        tw twVar = zxVar.E0;
        float f12 = (1.0f - zxVar.f44221u3) * f7 * zxVar.H0;
        float f13 = 1.0f - i12;
        twVar.setAlpha(f12 * f13);
        int i13 = 0;
        if (!zxVar.K && !zxVar.M) {
            if (zxVar.L) {
                zxVar.E0.setTranslationY((Math.max(zxVar.N, -zxVar.g4()) + (-org.telegram.messenger.i0.L(81.0f))) - org.telegram.messenger.i0.L(8.0f));
                zxVar.E0.setProgressToCollapse(1.0f);
                tw twVar2 = zxVar.E0;
                twVar2.setClipTop((int) (org.telegram.messenger.i0.f16166m - twVar2.getY()));
            }
            f10 = 1.0f - zxVar.H0;
            zxVar.actionBar.setTranslationY(0.0f);
        } else {
            float i14 = Utilities.i((-zxVar.N) / org.telegram.messenger.i0.L(81.0f), 1.0f, 0.0f);
            if (zxVar.f44221u3 == 1.0f) {
                i14 = 1.0f;
            }
            float i15 = Utilities.i(i14 / 0.5f, 1.0f, 0.0f);
            zxVar.E0.setClipTop(0);
            if (!zxVar.K && zxVar.M) {
                zxVar.E0.setTranslationY((-org.telegram.messenger.i0.L(81.0f)) - org.telegram.messenger.i0.L(8.0f));
                zxVar.E0.setProgressToCollapse(1.0f);
                f11 = zxVar.H0;
            } else {
                zxVar.E0.setTranslationY(((zxVar.T / 2.0f) + (Math.max(zxVar.N, -zxVar.g4()) + zxVar.f44232w3)) - org.telegram.messenger.i0.L(8.0f));
                zxVar.E0.l(!zxVar.F3.c(), i14);
                if (!zxVar.M) {
                    f11 = zxVar.H0;
                } else {
                    f10 = 1.0f - i15;
                    zxVar.actionBar.setTranslationY(0.0f);
                }
            }
            f10 = 1.0f - f11;
            zxVar.actionBar.setTranslationY(0.0f);
        }
        float f14 = f10 * f13;
        if (f14 != 1.0f) {
            zxVar.actionBar.getTitlesContainer().setPivotY(org.telegram.messenger.i0.f16166m);
            zxVar.actionBar.getTitlesContainer().setPivotX(org.telegram.messenger.i0.L(20.0f));
            float f15 = (0.6f * f14) + 0.4f;
            zxVar.actionBar.getTitlesContainer().setScaleY(f15);
            zxVar.actionBar.getTitlesContainer().setScaleX(f15);
            zxVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            zxVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-org.telegram.messenger.i0.L(30.0f));
            zxVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f15);
            zxVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f15);
            float f16 = (1.0f - zxVar.f44221u3) * f14;
            zxVar.actionBar.getTitlesContainer().setAlpha(f16);
            FrameLayout titlesContainer = zxVar.actionBar.getTitlesContainer();
            int i16 = (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1));
            if (i16 > 0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            titlesContainer.setVisibility(i11);
            zxVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f16);
            FrameLayout additionalSubTitleOverlayContainer = zxVar.actionBar.getAdditionalSubTitleOverlayContainer();
            if (i16 <= 0) {
                i13 = 4;
            }
            additionalSubTitleOverlayContainer.setVisibility(i13);
            return;
        }
        zxVar.actionBar.getTitlesContainer().setScaleY(1.0f);
        zxVar.actionBar.getTitlesContainer().setScaleX(1.0f);
        zxVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
        zxVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
        float f17 = 1.0f - zxVar.f44221u3;
        zxVar.actionBar.getTitlesContainer().setAlpha(f17);
        FrameLayout titlesContainer2 = zxVar.actionBar.getTitlesContainer();
        int i17 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
        if (i17 > 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        titlesContainer2.setVisibility(i10);
        zxVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
        FrameLayout additionalSubTitleOverlayContainer2 = zxVar.actionBar.getAdditionalSubTitleOverlayContainer();
        if (i17 <= 0) {
            i13 = 4;
        }
        additionalSubTitleOverlayContainer2.setVisibility(i13);
    }

    public static void Y2(zx zxVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        if (zxVar.parentLayout != null && zxVar.actionBar != null) {
            float max = Math.max(zxVar.e.e, zxVar.h4());
            float f7 = 1.0f;
            float f10 = 1.0f - zxVar.f44236x1;
            float f11 = max * f10 * f10;
            int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            if (i11 != 0) {
                if (-1 >= i10) {
                    f7 = 0.0f;
                    i10 = -1;
                }
                if (f7 > 0.0f && i11 > 0 && i10 > 0 && (z4Var = zxVar.parentLayout) != null) {
                    ((ActionBarLayout) z4Var).p(canvas, (int) (f7 * 255.0f * f11), i10);
                }
            }
        }
    }

    public static void Z(zx zxVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, tL_pendingSuggestion.suggestion);
        zxVar.g5();
    }

    public static void a0(zx zxVar, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        zxVar.f44221u3 = floatValue;
        zxVar.f44137e0[0].setTranslationY((-f7) * floatValue);
        for (int i10 = 0; i10 < zxVar.actionBar.getChildCount(); i10++) {
            if (zxVar.actionBar.getChildAt(i10).getVisibility() == 0 && zxVar.actionBar.getChildAt(i10) != zxVar.actionBar.getActionMode() && zxVar.actionBar.getChildAt(i10) != zxVar.actionBar.getBackButton()) {
                zxVar.actionBar.getChildAt(i10).setAlpha(1.0f - zxVar.f44221u3);
            }
        }
        View view = zxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        zxVar.Q3();
        zxVar.I3();
    }

    public static void b0(zx zxVar) {
        ArrayList arrayList = zxVar.I2;
        org.telegram.ui.ActionBar.z4 z4Var = zxVar.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).x()) {
            zxVar.finishPreviewFragment();
        } else if (zxVar.R0 == 10) {
            if (zxVar.C2 != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList2.add(org.telegram.messenger.hs.a(((Long) arrayList.get(i10)).longValue(), 0L));
                }
                zxVar.C2.z(zxVar, arrayList2, null, false, zxVar.J2, zxVar.K2, zxVar.L2, null);
            }
        } else if (org.telegram.messenger.wp.r1(zxVar.currentAccount).u2()) {
            b.b(zxVar.currentAccount);
        } else {
            zxVar.presentFragment(new ContactsActivity(a1.g.g("destroyAfterSelect", true)));
        }
    }

    public static void c0(zx zxVar) {
        org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, "USERPIC_SETUP");
        zxVar.g5();
    }

    public static org.telegram.ui.Cells.v2 c4(yx yxVar) {
        vx vxVar = yxVar.f43733a;
        for (int i10 = 0; i10 < vxVar.getChildCount(); i10++) {
            View childAt = vxVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.v2) {
                org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) childAt;
                if (v2Var.W()) {
                    return v2Var;
                }
            }
        }
        return null;
    }

    public static void d0(zx zxVar) {
        PasskeysActivity.f0(zxVar.currentAccount, zxVar.getParentActivity(), zxVar.resourceProvider, true);
    }

    public static void e0(zx zxVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", org.telegram.messenger.e20.i(zxVar.currentAccount).e());
        zxVar.presentFragment(new un(bundle));
    }

    public static void f0(zx zxVar, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull a2 = zxVar.getMessagesController().a2(zxVar.getUserConfig().e());
        if (a2 != null) {
            tL_birthday2 = a2.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (a2 != null) {
            a2.flags2 |= 32;
            a2.birthday = tL_birthday;
        }
        zxVar.getMessagesController().l2();
        zxVar.getConnectionsManager().sendRequest(updatebirthday, new aa(zxVar, a2, tL_birthday2, 8), 1024);
        org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, "BIRTHDAY_SETUP");
        zxVar.g5();
    }

    public static void g0(zx zxVar, yx yxVar, View view, int i10) {
        int i11;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.z3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.v2;
        if (z10) {
            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
            if (v2Var.f23239n2) {
                zxVar.Z4(v2Var.getDialogId(), view);
                return;
            }
        }
        if (zxVar.U3()) {
            zxVar.A4(view, i10, 0.0f, yxVar.d);
            return;
        }
        int i12 = zxVar.R0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.p8)) {
            yxVar.d.L();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle g10 = a1.g.g("forImport", true);
            g10.putLongArray("result", new long[]{zxVar.getUserConfig().e()});
            g10.putInt("chatType", 4);
            String string = zxVar.arguments.getString("importTitle");
            if (string != null) {
                g10.putString("title", string);
            }
            b60 b60Var = new b60(g10);
            b60Var.Y = new hw(zxVar);
            zxVar.presentFragment(b60Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.d3) && ((i11 = yxVar.f43739s) == 7 || i11 == 8)) {
            zf.k kVar = (zf.k) yxVar.d.M.get(0);
            if (kVar != null && kVar.f7681a == 17) {
                tL_chatlists_chatlistUpdates = kVar.f55565i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                org.telegram.messenger.bp bpVar = zxVar.getMessagesController().M[yxVar.f43739s - 7];
                if (bpVar != null) {
                    int i14 = bpVar.f15000a;
                    ?? haVar = new org.telegram.ui.Components.ha(zxVar, false);
                    haVar.Q1 = -1;
                    haVar.U1 = "";
                    haVar.V1 = new ArrayList();
                    haVar.X1 = "";
                    haVar.Z1 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    haVar.a2 = arrayList;
                    haVar.f27234r2 = -1;
                    haVar.f27237u2 = -5;
                    haVar.Q1 = i14;
                    haVar.S1 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    haVar.Y1 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList arrayList2 = zxVar.getMessagesController().P0;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            } else if (((org.telegram.messenger.bp) arrayList2.get(i13)).f15000a == i14) {
                                haVar.U1 = ((org.telegram.messenger.bp) arrayList2.get(i13)).f15001b;
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    haVar.f1();
                    zxVar.showDialog(haVar);
                    return;
                }
                return;
            }
        } else if (z10 && !zxVar.actionBar.u() && !zxVar.F3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.v2) view).Y1;
            org.telegram.messenger.i0.P.set(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A());
        }
        zxVar.z4(view, i10, yxVar.d);
    }

    public static void h0(zx zxVar) {
        zxVar.presentFragment(new PrivacySettingsActivity());
        org.telegram.messenger.i0.j3(zxVar.parentLayout, "newChatsRow");
    }

    public static void i0(zx zxVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.wp.r1(zxVar.currentAccount).n1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(zxVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new aa(zxVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void j0(zx zxVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(launchActivity, zxVar.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(zxVar.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.f18636b;
        if (tL_attachMenuBots != null) {
            long j10 = b02.f18633a;
            b02.getMessagesStorage().f16331a.c(new org.telegram.messenger.sk(b02.e, 2, j10, b02, tL_attachMenuBots));
        }
    }

    public static void j1(zx zxVar, boolean z10) {
        if (zxVar.f44137e0 != null && zxVar.M3 != z10) {
            zxVar.M3 = z10;
            int i10 = 0;
            while (true) {
                yx[] yxVarArr = zxVar.f44137e0;
                if (i10 < yxVarArr.length) {
                    if (z10) {
                        yxVarArr[i10].f43733a.setScrollbarFadingEnabled(false);
                    }
                    zxVar.f44137e0[i10].f43733a.setVerticalScrollBarEnabled(z10);
                    if (z10) {
                        zxVar.f44137e0[i10].f43733a.setScrollbarFadingEnabled(true);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public static void k0(zx zxVar) {
        org.telegram.messenger.wp.r1(zxVar.currentAccount).f7.edit().putBoolean("storyhint", false).commit();
    }

    public static void l0(zx zxVar) {
        if (zxVar.f44119a4.g()) {
            org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, "USERPIC_SETUP");
            zxVar.g5();
        }
    }

    public static void n0(zx zxVar) {
        org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, "PREMIUM_GRACE");
        zxVar.g5();
    }

    public static void o0(zx zxVar) {
        org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, "SETUP_PASSKEY");
        zxVar.g5();
    }

    public static void p0(zx zxVar, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        try {
            x1Var.dismiss();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (tLObject != null) {
            zxVar.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            bi.e eVar = new bi.e(zxVar, j10, 14);
            Pattern pattern = org.telegram.ui.Components.s4.f30174a;
            if (zxVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = zxVar.getCurrentAccount();
                    Activity parentActivity = zxVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long e7 = org.telegram.messenger.e20.i(currentAccount).e();
                    TextView textView = new TextView(parentActivity);
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21038j5, null);
                    textView.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.dd.X) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    alertDialog$Builder.o(frameLayout);
                    org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                    r8Var.u(org.telegram.messenger.i0.L(12.0f));
                    org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(parentActivity);
                    g9Var.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
                    if (org.telegram.messenger.dd.X) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    frameLayout.addView(g9Var, w7.b6.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(parentActivity);
                    org.telegram.messenger.m5.m(textView2, org.telegram.ui.ActionBar.t6.E8, null, 1, 20.0f);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    if (org.telegram.messenger.dd.X) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setText(org.telegram.messenger.dd.L0(2131749254, null));
                    boolean z10 = org.telegram.messenger.dd.X;
                    if (z10) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    int i17 = i13 | 48;
                    if (z10) {
                        i14 = 21;
                    } else {
                        i14 = 76;
                    }
                    float f7 = i14;
                    if (z10) {
                        i15 = 76;
                    } else {
                        i15 = 21;
                    }
                    frameLayout.addView(textView2, w7.b6.d(-1, -2.0f, i17, f7, 11.0f, i15, 0.0f));
                    if (org.telegram.messenger.dd.X) {
                        i16 = 5;
                    } else {
                        i16 = 3;
                    }
                    frameLayout.addView(textView, w7.b6.d(-2, -2.0f, i16 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                    if (user != null) {
                        if (org.telegram.messenger.i20.z(user)) {
                            r8Var.f29927p = 0.8f;
                            r8Var.g(12);
                            g9Var.j(null, null, r8Var, user);
                        } else if (user.f19943id == e7) {
                            r8Var.f29927p = 0.8f;
                            r8Var.g(1);
                            g9Var.j(null, null, r8Var, user);
                        } else {
                            r8Var.f29927p = 1.0f;
                            r8Var.r(user);
                            g9Var.e(user, r8Var);
                        }
                    } else {
                        r8Var.q(chat);
                        g9Var.e(chat, r8Var);
                    }
                    textView.setText(org.telegram.messenger.i0.W2(str));
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131749274, null), new org.telegram.ui.Components.t(eVar, 3));
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                    zxVar.showDialog(alertDialog$Builder.f20135a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.s4.e0(zxVar.currentAccount, tL_error, zxVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        zxVar.getNotificationCenter().k(org.telegram.messenger.at.f14801v1, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public static void p4(un unVar, org.telegram.messenger.kj kjVar) {
        CharSequence charSequence;
        if (kjVar != null && kjVar.s2()) {
            try {
                if (!TextUtils.isEmpty(kjVar.f16747z)) {
                    charSequence = kjVar.f16747z;
                } else {
                    charSequence = kjVar.v;
                }
                CharSequence x12 = org.telegram.messenger.i0.x1(charSequence, kjVar.Y1, null);
                if (x12 instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) x12;
                    org.telegram.ui.Components.l00[] l00VarArr = (org.telegram.ui.Components.l00[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.l00.class);
                    if (l00VarArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(l00VarArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(l00VarArr[0]);
                        for (int i10 = 1; i10 < l00VarArr.length; i10++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(l00VarArr[i10]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(l00VarArr[i10]);
                            if (spanStart2 != spanEnd) {
                                if (spanStart2 > spanEnd) {
                                    for (int i11 = spanEnd; i11 <= spanStart2; i11++) {
                                        if (!Character.isWhitespace(spannableStringBuilder.charAt(i11))) {
                                            break;
                                        }
                                    }
                                }
                            }
                            spanEnd = spanStart3;
                        }
                        unVar.Jb(kjVar.M1(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                    }
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public static void q0(zx zxVar, int i10) {
        Object obj;
        TLRPC.User user;
        org.telegram.ui.Components.vm0 vm0Var = zxVar.C0.f26884q0;
        if (i10 >= vm0Var.Z && i10 < vm0Var.f26533a0) {
            org.telegram.ui.Components.b51 G = vm0Var.G(i10);
            if (G != null) {
                obj = G.G;
            } else {
                obj = null;
            }
        } else {
            obj = Boolean.FALSE;
        }
        if (obj instanceof TLRPC.User) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zxVar.getParentActivity(), zxVar.resourceProvider);
            String L0 = org.telegram.messenger.dd.L0(2131754180, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131754179, "\"" + org.telegram.messenger.i20.p(user) + "\"");
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131746336, null), new qv(1, zxVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        }
    }

    public static void r0(zx zxVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        HashSet hashSet2;
        if (i10 == 102) {
            zxVar.getMessagesController().f19237s0 = true;
            if (z10) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            zxVar.D4(arrayList, i10, false, false, hashSet2);
            org.telegram.messenger.wp messagesController = zxVar.getMessagesController();
            messagesController.f19237s0 = false;
            messagesController.getNotificationCenter().k(org.telegram.messenger.at.f14779s, Boolean.TRUE);
            zxVar.getMessagesController().J(zxVar.W2);
            int i11 = zxVar.W2;
            if (i11 != 0 && zxVar.d4(zxVar.currentAccount, zxVar.f44137e0[0].f43739s, i11, false).size() == 0) {
                zxVar.f44137e0[0].f43733a.setEmptyView(null);
                zxVar.f44137e0[0].f43741x.setVisibility(4);
                zxVar.finishFragment();
                return;
            }
            return;
        }
        zxVar.D4(arrayList, i10, false, false, null);
    }

    public static void t0(zx zxVar, int i10, org.telegram.ui.Components.z60 z60Var) {
        CharSequence charSequence;
        if (zxVar.currentAccount != i10) {
            z60Var.u();
            if (zxVar.getParentActivity() == null) {
                return;
            }
            tx txVar = zxVar.C2;
            LaunchActivity launchActivity = (LaunchActivity) zxVar.getParentActivity();
            ArrayList arrayList = zxVar.D2;
            String str = zxVar.E2;
            CharSequence charSequence2 = zxVar.F2;
            nw nwVar = zxVar.B1;
            if (nwVar != null) {
                charSequence = nwVar.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.O0(i10);
            zx zxVar2 = new zx(zxVar.arguments);
            zxVar2.C2 = txVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    zxVar2.D2 = null;
                } else {
                    zxVar2.D2 = arrayList;
                    zxVar2.E2 = null;
                    zxVar2.M2 = false;
                    if (zxVar2.B1 != null) {
                        zxVar2.v3(charSequence);
                    } else {
                        zxVar2.U3 = charSequence;
                    }
                }
            } else if (str != null) {
                zxVar2.Q4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    zxVar2.F2 = null;
                } else {
                    zxVar2.F2 = charSequence2;
                    zxVar2.E2 = null;
                    zxVar2.D2 = null;
                    if (zxVar2.B1 != null) {
                        zxVar2.v3(charSequence);
                    } else {
                        zxVar2.U3 = charSequence;
                    }
                }
            }
            launchActivity.u0(zxVar2, false, true);
        }
    }

    public static void u0(zx zxVar) {
        String str;
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(zxVar.currentAccount);
        if (zxVar.A3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        r12.h4(0L, str);
        zxVar.g5();
    }

    public static void u1(zx zxVar, yx yxVar, float f7) {
        if (zxVar.T != f7) {
            zxVar.T = f7;
            int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            int i11 = 0;
            if (i10 == 0) {
                zxVar.U = false;
            }
            zxVar.E0.setOverscroll(f7);
            yxVar.f43733a.setViewsOffset(f7);
            vx vxVar = yxVar.f43733a;
            if (i10 != 0) {
                i11 = 2;
            }
            vxVar.setOverScrollMode(i11);
            zxVar.fragmentView.invalidate();
            if (f7 > org.telegram.messenger.i0.L(90.0f) && !zxVar.U) {
                tw twVar = zxVar.E0;
                ValueAnimator valueAnimator = twVar.H0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    twVar.i(twVar.f49228p0, true);
                    zxVar.U = true;
                    zxVar.getOrCreateStoryViewer().G(new ev(zxVar, 4));
                }
            }
        }
    }

    public static void u4(org.telegram.messenger.c cVar) {
        int i10 = cVar.f15043a;
        boolean[] zArr = f44113y4;
        if (!zArr[i10]) {
            org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
            r12.V2();
            r12.S2(0, 0, 100, true, null);
            if (r12.f19236s.isEmpty() && !TextUtils.isEmpty(r12.T3)) {
                TLRPC.TL_help_getRecentMeUrls tL_help_getRecentMeUrls = new TLRPC.TL_help_getRecentMeUrls();
                tL_help_getRecentMeUrls.referer = r12.T3;
                r12.getConnectionsManager().sendRequest(tL_help_getRecentMeUrls, new org.telegram.messenger.uj(r12, 4));
            }
            r12.e3(org.telegram.messenger.e20.i(i10).f(), false, 0);
            org.telegram.messenger.i5.r(i10).f();
            org.telegram.messenger.vi.b0(i10).u(false);
            org.telegram.messenger.i0.h3(new rh(cVar, 19), 200L);
            Iterator it = r12.f19118e4.iterator();
            while (it.hasNext()) {
                org.telegram.messenger.vi.b0(i10).c1((String) it.next(), true, true);
            }
            zArr[i10] = true;
        }
    }

    public static void v0(zx zxVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.G0(launchActivity, zxVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            re1.a(zxVar.getParentActivity(), new w(zxVar, tL_attachMenuBot, launchActivity, 7), null);
        }
    }

    public static boolean v1(zx zxVar, yx yxVar) {
        if (!zxVar.F3.c()) {
            int i10 = (int) (-zxVar.N);
            int f42 = zxVar.f4();
            int g42 = zxVar.g4();
            if (i10 != 0 && i10 != f42 && i10 != g42 && yxVar.f43733a.canScrollVertically(-1)) {
                if (g42 < i10 && i10 < f42) {
                    int L = org.telegram.messenger.i0.L(48.0f);
                    int i11 = i10 - g42;
                    if (i11 < L / 2) {
                        yxVar.f43734b.y(-i11);
                        return true;
                    }
                    yxVar.f43734b.y(L - i11);
                    return true;
                }
                float f7 = 1.0f;
                if (zxVar.f44221u3 != 1.0f) {
                    f7 = Utilities.i((-zxVar.N) / org.telegram.messenger.i0.L(81.0f), 1.0f, 0.0f);
                }
                if (f7 < zxVar.E0.B0) {
                    yxVar.f43734b.y(-i10);
                    return true;
                }
                yxVar.f43734b.y(g42 - i10);
                return true;
            }
            return false;
        }
        return false;
    }

    public static void w0(zx zxVar) {
        b.c(zxVar.currentAccount, zxVar.getParentActivity(), zxVar.getResourceProvider());
    }

    public static String w2(zx zxVar) {
        String s10;
        ArrayList arrayList = zxVar.I2;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() < 3) {
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                long longValue = ((Long) obj).longValue();
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                if (longValue == zxVar.getUserConfig().e()) {
                    sb2.append(org.telegram.messenger.dd.L0(2131745918, null));
                } else {
                    if (arrayList.size() == 1) {
                        s10 = org.telegram.messenger.o5.l(zxVar.currentAccount, longValue);
                    } else {
                        s10 = org.telegram.messenger.o5.s(zxVar.currentAccount, longValue);
                    }
                    sb2.append(s10);
                }
            }
            return org.telegram.messenger.dd.a0(null, null, 2131745457, sb2.toString());
        }
        return org.telegram.messenger.dd.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public static void x0(final int i10, final long j10, TLRPC.Chat chat, final zx zxVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        zxVar.n4(false);
        if (i10 == 103 && org.telegram.messenger.w3.T(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || org.telegram.messenger.w3.t0(chat2)) {
                zxVar.getMessagesController().X(2, j10, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i14 = zxVar.W2) != 0 && zxVar.d4(zxVar.currentAccount, zxVar.f44137e0[0].f43739s, i14, false).size() == 1) {
            zxVar.f44137e0[0].f43741x.setVisibility(4);
        }
        int i15 = -1;
        if (i10 == 102) {
            zxVar.M4(true, true);
            if (zxVar.R1 != null) {
                i13 = 0;
                while (i13 < zxVar.R1.size()) {
                    if (((TLRPC.Dialog) zxVar.R1.get(i13)).f19798id == j10) {
                        break;
                    }
                    i13++;
                }
            }
            i13 = -1;
            zxVar.z3();
            i11 = i13;
        } else {
            i11 = -1;
        }
        UndoView k42 = zxVar.k4();
        if (k42 != null) {
            if (i10 == 103) {
                i12 = 0;
            } else if (z11) {
                i12 = 1;
            } else {
                i12 = 95;
            }
            k42.j(i12, j10, new Runnable() {
                @Override
                public final void run() {
                    zxVar.C4(i10, j10, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(zxVar.d4(zxVar.currentAccount, zxVar.f44137e0[0].f43739s, zxVar.W2, false));
        int i16 = 0;
        while (true) {
            if (i16 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i16)).f19798id == j10) {
                i15 = i16;
                break;
            } else {
                i16++;
            }
        }
        if (i10 == 102) {
            if (i11 >= 0 && i15 < 0 && (arrayList = zxVar.R1) != null) {
                arrayList.remove(i11);
                zxVar.f44137e0[0].f43742y.D();
                zxVar.f44137e0[0].q(true);
                return;
            }
            zxVar.M4(false, true);
        }
    }

    public static void y0(zx zxVar) {
        org.telegram.messenger.y1 a2 = org.telegram.messenger.y1.a(zxVar.currentAccount);
        int i10 = a2.f19517a;
        Set<String> set = a2.d;
        org.telegram.messenger.w1 w1Var = a2.f19519c;
        if (w1Var != null && !set.contains(w1Var.f18962a)) {
            set.add(a2.f19519c.f18962a);
            SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(i10).f7.edit();
            edit.putStringSet("bday_hidden", set);
            edit.apply();
            org.telegram.messenger.at.f(i10).k(org.telegram.messenger.at.f14715g5, new Object[0]);
        }
        org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, "BIRTHDAY_CONTACTS_TODAY");
        zxVar.g5();
        org.telegram.ui.Components.wb G = org.telegram.ui.Components.cc.a0(zxVar).G(2131624032, 4, org.telegram.messenger.dd.L0(2131753330, null));
        G.f32201j = 5000;
        G.j();
    }

    public static void z0(zx zxVar) {
        org.telegram.messenger.wp.r1(zxVar.currentAccount).h4(0L, "PREMIUM_RESTORE");
        zxVar.g5();
    }

    public final boolean A3(long j10) {
        int i10;
        int i11 = this.R0;
        if (i11 != 15 && i11 != 16 && this.f44155h2 == null && this.f44210s2) {
            if (org.telegram.messenger.o5.z(j10)) {
                long j11 = -j10;
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j11));
                if (org.telegram.messenger.w3.T(L0) && !L0.megagroup) {
                    if (!this.f44198q2) {
                        TLRPC.Chat L02 = org.telegram.messenger.wp.r1(this.currentAccount).L0(Long.valueOf(j11));
                        if ((org.telegram.messenger.w3.n(L02) || L02.megagroup) && (i10 = this.T0) != 2 && i10 != 3) {
                            return true;
                        }
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String L03 = org.telegram.messenger.dd.L0(2131745613, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.R = L03;
                    int i12 = this.T0;
                    if (i12 == 3) {
                        x1Var.T = org.telegram.messenger.dd.L0(2131744116, null);
                    } else if (i12 == 2) {
                        x1Var.T = org.telegram.messenger.dd.L0(2131746602, null);
                    } else {
                        x1Var.T = org.telegram.messenger.dd.L0(2131752440, null);
                    }
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131747847, null), null);
                    showDialog(x1Var);
                    return false;
                }
                return true;
            } else if (org.telegram.messenger.o5.C(j10)) {
                if (this.T0 != 0 || this.U0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String L04 = org.telegram.messenger.dd.L0(2131745613, null);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                    x1Var2.R = L04;
                    int i13 = this.T0;
                    if (i13 == 3) {
                        x1Var2.T = org.telegram.messenger.dd.L0(2131744115, null);
                    } else if (i13 != 0) {
                        x1Var2.T = org.telegram.messenger.dd.L0(2131747191, null);
                    } else {
                        x1Var2.T = org.telegram.messenger.dd.L0(2131749114, null);
                    }
                    alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131747847, null), null);
                    showDialog(x1Var2);
                    return false;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public final boolean A4(View view, int i10, float f7, org.telegram.ui.Components.tk0 tk0Var) {
        org.telegram.ui.Components.an0 an0Var;
        long j10;
        org.telegram.ui.Components.an0 an0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long F;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.d3) && tk0Var.d(i10) != 21) {
            if (!this.actionBar.u() && !org.telegram.messenger.i0.Q1() && !this.f44174l2 && (view instanceof org.telegram.ui.Cells.v2)) {
                org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
                if (!getMessagesController().s2(v2Var.getDialogId()) && !this.F3.c() && v2Var.Z(f7)) {
                    return T4(v2Var);
                }
            }
            ww wwVar = this.F3;
            if (wwVar == null || !wwVar.c()) {
                jx jxVar = this.C0;
                boolean z10 = true;
                if (jxVar != null && tk0Var == (an0Var2 = jxVar.f26872d0)) {
                    Object I = an0Var2.I(i10);
                    if (!this.C0.f26872d0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String L0 = org.telegram.messenger.dd.L0(2131752054, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                        x1Var.R = L0;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                x1Var.T = org.telegram.messenger.dd.a0("ClearSearchSingleChatAlertText", null, 2131752053, gg.e.i(this.currentAccount, chat, false));
                            } else {
                                x1Var.T = org.telegram.messenger.dd.a0("ClearSearchSingleChatAlertText", null, 2131752053, chat.title);
                            }
                            F = -chat.f19794id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.f19943id == getUserConfig().f15524n) {
                                x1Var.T = org.telegram.messenger.dd.a0("ClearSearchSingleChatAlertText", null, 2131752053, org.telegram.messenger.dd.L0(2131745918, null));
                            } else {
                                x1Var.T = org.telegram.messenger.dd.a0("ClearSearchSingleUserAlertText", null, 2131752051, org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                            }
                            F = user.f19943id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            x1Var.T = org.telegram.messenger.dd.a0("ClearSearchSingleUserAlertText", null, 2131752051, org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name));
                            F = org.telegram.messenger.o5.F(encryptedChat.f19802id);
                        }
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752055, null), new m4.x0(this, F, 6));
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        showDialog(x1Var);
                        TextView textView = (TextView) x1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, getResourceProvider());
                        }
                        return true;
                    }
                }
                jx jxVar2 = this.C0;
                if (jxVar2 != null && tk0Var == (an0Var = jxVar2.f26872d0)) {
                    if (this.f44174l2) {
                        z4(view, i10, tk0Var);
                        return false;
                    }
                    if ((view instanceof org.telegram.ui.Cells.k6) && !an0Var.N(i10)) {
                        j10 = ((org.telegram.ui.Cells.k6) view).getDialogId();
                    } else {
                        j10 = 0;
                    }
                    if (j10 != 0) {
                        Y4(j10, view);
                        return true;
                    }
                } else {
                    Object J = ((zf.m) tk0Var).J(i10);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.f44174l2) {
                            if ((this.R0 == 3 || U3()) && v5(dialog.f19798id)) {
                                if (this.R0 == 1 && U3() && this.f44177m2 && getMessagesController().s2(dialog.f19798id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f19798id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.R0 != 1) {
                                        z10 = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z10);
                                    bundle.putBoolean("quote", this.O0);
                                    bundle.putBoolean("reply_to", this.N0);
                                    nb1 nb1Var = new nb1(bundle);
                                    nb1Var.L0 = this;
                                    presentFragment(nb1Var);
                                    return false;
                                }
                                s3(dialog.f19798id, view);
                                o5();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            y4(view);
                            return false;
                        } else if (!this.actionBar.u() || !s4(dialog)) {
                            Y4(dialog.f19798id, view);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void B3(boolean z10) {
        zh.j jVar;
        TLRPC.ChatFull chatFull;
        boolean z11;
        org.telegram.ui.Components.zr zrVar = this.J1;
        if (zrVar != null && (jVar = this.Q1) != null && (chatFull = this.f44118a3) != null) {
            if (this.Y2 != 0 && chatFull.requests_pending > 0 && !this.f44120b.f7022f) {
                z11 = true;
            } else {
                z11 = false;
            }
            zrVar.i(jVar, z11, z10);
            this.Q1.setTitle(org.telegram.messenger.dd.G(this.f44118a3.requests_pending, "CommunityPendingRequestsRow", new Object[0]));
        }
    }

    public final void B4(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (org.telegram.messenger.e20.i(i10).p()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new f6(24));
        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, view);
        if (arrayList.size() > 0) {
            if (H.x() > 0) {
                H.k();
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                int intValue = ((Integer) obj).intValue();
                if (this.currentAccount == intValue) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                int i12 = org.telegram.ui.ActionBar.t6.f21021i6;
                Drawable a02 = org.telegram.ui.ActionBar.t6.a0(getThemedColor(i12), 0, 0);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
                org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.a7.k(linearLayout, a02, null, N, resourceProvider);
                TLRPC.User f7 = org.telegram.messenger.e20.i(intValue).f();
                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                r8Var.r(f7);
                kg.x xVar = new kg.x(this, getParentActivity(), z10);
                linearLayout.addView(xVar, w7.b6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(getParentActivity());
                if (z10) {
                    g9Var.setScaleX(0.833f);
                    g9Var.setScaleY(0.833f);
                }
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(16.0f));
                g9Var.getImageReceiver().d = intValue;
                g9Var.e(f7, r8Var);
                xVar.addView(g9Var, w7.b6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21038j5, getResourceProvider());
                textView.setText(org.telegram.messenger.i20.p(f7));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.b6.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new jg.w1(this, intValue, H, 14));
                H.r(linearLayout, w7.b6.o(230, 48));
            }
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(24.0f), getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
        d02.getPaint().setShadowLayer(org.telegram.messenger.i0.L(6.0f), 0.0f, org.telegram.messenger.i0.L(1.0f), org.telegram.ui.ActionBar.t6.r1(0.15f, -16777216));
        H.f33050z.set(-org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f));
        H.W(d02);
        H.a0(0.0f, -org.telegram.messenger.i0.L(4.0f));
        H.V(5);
        H.Z();
    }

    @Override
    public final hi.f C() {
        return this.l4;
    }

    public final void C3(org.telegram.ui.yx r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.C3(org.telegram.ui.yx):void");
    }

    public final void C4(int i10, long j10, TLRPC.Chat chat, boolean z10, boolean z11) {
        if (i10 == 103) {
            getMessagesController().X(1, j10, z11);
            return;
        }
        if (chat != null) {
            if (org.telegram.messenger.w3.r0(chat)) {
                getMessagesController().X(0, j10, z11);
            } else {
                getMessagesController().g0(-j10, getMessagesController().Z1(Long.valueOf(getUserConfig().e())), null, z11, false);
            }
        } else {
            getMessagesController().X(0, j10, z11);
            if (z10 && z11) {
                getMessagesController().w(j10);
            }
        }
        if (org.telegram.messenger.i0.Q1()) {
            getNotificationCenter().k(org.telegram.messenger.at.f14786t, Long.valueOf(j10));
        }
        getMessagesController().J(this.W2);
    }

    public final void D3() {
        getMessagesStorage().getClass();
    }

    public final void D4(java.util.ArrayList r42, int r43, boolean r44, boolean r45, java.util.HashSet r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.D4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    @Override
    public final void E(float f7, int i10) {
        org.telegram.ui.ActionBar.t0 t0Var;
        if (i10 == 3 && (t0Var = this.f44173l0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) t0Var.getIconView().getDrawable();
            if (this.d.f7022f) {
                animatedVectorDrawable.start();
                if (org.telegram.messenger.uz.o() != 0) {
                    TLRPC.TL_help_premiumPromo tL_help_premiumPromo = org.telegram.messenger.vi.b0(this.currentAccount).D;
                    String q02 = PremiumPreviewFragment.q0(2);
                    if (tL_help_premiumPromo != null) {
                        int i11 = 0;
                        while (true) {
                            if (i11 < tL_help_premiumPromo.video_sections.size()) {
                                if (tL_help_premiumPromo.video_sections.get(i11).equals(q02)) {
                                    break;
                                }
                                i11++;
                            } else {
                                i11 = -1;
                                break;
                            }
                        }
                        if (i11 != -1) {
                            org.telegram.messenger.b8.G(this.currentAccount).X(tL_help_premiumPromo.videos.get(i11), tL_help_premiumPromo, 3, 0);
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

    public final void E3() {
        if (this.f44137e0 != null) {
            int w32 = w3();
            int i10 = 0;
            while (true) {
                yx[] yxVarArr = this.f44137e0;
                if (i10 < yxVarArr.length) {
                    yx yxVar = yxVarArr[i10];
                    if (yxVar != null) {
                        vx vxVar = yxVar.f43733a;
                        vxVar.setPadding(0, vxVar.f29963f3, 0, w32);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void E4(long r14, boolean r16, org.telegram.messenger.bp r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.E4(long, boolean, org.telegram.messenger.bp, int, boolean):void");
    }

    public final void F3() {
        zg.e eVar = this.f44241y1;
        if (eVar != null) {
            eVar.setBlurredBottomHeight(this.f44241y1.getInputBubbleHeight() + this.f44228w.d() + org.telegram.messenger.i0.L(9.0f) + org.telegram.messenger.i0.L(7.0f));
        }
    }

    public final void F4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.K0.setBackground(new BitmapDrawable(createBitmap));
        this.K0.setAlpha(0.0f);
        this.K0.setVisibility(0);
        N3();
    }

    @Override
    public final List G() {
        return Arrays.asList(new fg.a(org.telegram.messenger.dd.L0(2131751649, null)), new fg.a(org.telegram.messenger.dd.L0(2131752076, null), new ev(this, 14)), new fg.a(org.telegram.messenger.dd.L0(2131751650, null), new ev(this, 15)));
    }

    public final void G3() {
        int i10;
        yx yxVar;
        boolean z10 = true;
        float e42 = e4(true);
        px pxVar = this.f44243z0;
        if (pxVar != null) {
            if (pxVar.getAlpha() == e42) {
                z10 = false;
            }
            float T1 = org.telegram.messenger.i0.T1(0.98f, 1.0f, e42);
            this.f44243z0.setAlpha(e42);
            this.f44243z0.setScaleX(T1);
            this.f44243z0.setScaleY(T1);
            px pxVar2 = this.f44243z0;
            if (e42 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            pxVar2.setVisibility(i10);
            if (z10 && (yxVar = this.f44137e0[0]) != null) {
                yxVar.f43733a.requestLayout();
            }
        }
        e5();
    }

    public final void G4(yx yxVar) {
        int i10;
        org.telegram.ui.Components.zz zzVar;
        if (yxVar.getVisibility() != 0) {
            return;
        }
        int i11 = yxVar.d.f55585w;
        if (yxVar.f43739s == 0 && l4() && yxVar.f43733a.getChildCount() == 0 && yxVar.f43740w == 2) {
            ((s4.a0) yxVar.f43733a.getLayoutManager()).h1(1, (int) this.N);
        }
        yxVar.d.getClass();
        yxVar.d.V();
        int b10 = yxVar.d.b();
        if (b10 == 1 && i11 == 1 && yxVar.d.d(0) == 5) {
            yxVar.q(true);
        } else {
            yxVar.q(false);
            if (b10 > i11 && (i10 = this.R0) != 11 && i10 != 12 && i10 != 13) {
                yxVar.D.b(i11);
            }
        }
        try {
            vx vxVar = yxVar.f43733a;
            if (this.W2 == 0 && this.Y2 == 0) {
                zzVar = yxVar.f43741x;
            } else {
                zzVar = null;
            }
            vxVar.setEmptyView(zzVar);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        C3(yxVar);
    }

    public final void H3() {
        int i10;
        int i11;
        float f7 = this.f44180n.e;
        float T1 = org.telegram.messenger.i0.T1(0.2f, 1.0f, f7);
        bi.f2 f2Var = this.C1;
        int i12 = 8;
        if (f2Var != null) {
            f2Var.setScaleX(T1);
            this.C1.setScaleY(T1);
            this.C1.setAlpha(f7);
            bi.f2 f2Var2 = this.C1;
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            f2Var2.setVisibility(i11);
        }
        zg.e eVar = this.f44241y1;
        if (eVar != null) {
            eVar.setAlpha(f7);
            zg.e eVar2 = this.f44241y1;
            int i13 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            eVar2.setVisibility(i10);
            this.f44241y1.getFadeView().setAlpha(f7);
            View fadeView = this.f44241y1.getFadeView();
            if (i13 > 0) {
                i12 = 0;
            }
            fadeView.setVisibility(i12);
        }
    }

    public final void H4() {
        boolean z10;
        float f7 = 0.0f;
        if (this.N != 0.0f && !(z10 = this.K)) {
            if (z10) {
                f7 = -g4();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.G3, f7));
            animatorSet.setInterpolator(org.telegram.ui.Components.gr.f26523f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    public final void I3() {
        if (this.actionBar == null) {
            return;
        }
        org.telegram.ui.Components.f10.d(this.actionBar.getBackButton(), Math.max(this.f44221u3, (1.0f - this.f44120b.e) * (1.0f - h4()) * (1.0f - this.f44126c.e)));
    }

    public final void I4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.I4(int):void");
    }

    public final void J3() {
        float f7;
        if (this.f44158i0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.f10.d(this.f44148g0, c3.i0.E(f7, 1.0f - this.f44120b.e, 1.0f - h4(), 1.0f - this.f44126c.e));
    }

    public final void J4(boolean z10, boolean z11) {
        int i10;
        int i11;
        ww wwVar = this.F3;
        if (wwVar != null && wwVar.c()) {
            return;
        }
        if (this.f44137e0[0].f43739s == 0 && l4() && this.f44137e0[0].f43740w == 2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.K && !z11 && !this.E0.g()) {
            i11 = -org.telegram.messenger.i0.L(81.0f);
        } else {
            i11 = 0;
        }
        if (z10) {
            org.telegram.ui.Components.wj0 wj0Var = this.f44137e0[0].f43738r;
            wj0Var.f32267b = 1;
            wj0Var.d(i10, i11, false, false);
            H4();
            return;
        }
        this.f44137e0[0].f43735c.h1(i10, i11);
        H4();
    }

    public final void K3() {
        float f7;
        if (org.telegram.messenger.uz.f18549s.isEmpty()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.f10.d(this.f44143f0, c3.i0.E(f7, 1.0f - this.f44120b.e, 1.0f - h4(), 1.0f - this.f44126c.e));
    }

    public final void K4(String str, boolean z10) {
        a5(true, false, true, false);
        ox oxVar = this.X;
        if (oxVar != null) {
            oxVar.f26635r.setText(str);
            this.X.f26635r.setSelection(str.length());
        }
    }

    public final void L3() {
        float f7;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.f10.d(this.f44163j0, c3.i0.E(f7, this.f44142f.e, 1.0f - h4(), 1.0f - this.f44126c.e));
        tw twVar = this.E0;
        if (twVar != null) {
            twVar.invalidate();
        }
    }

    public final void L4(float f7) {
        yx[] yxVarArr;
        this.f44127c0 = f7;
        for (yx yxVar : this.f44137e0) {
            vx vxVar = yxVar.f43733a;
            for (int i10 = 0; i10 < vxVar.getChildCount(); i10++) {
                View childAt = vxVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= yxVar.d.f55581f + 1) {
                    childAt.setAlpha(f7);
                }
            }
        }
    }

    public final void M3() {
        org.telegram.ui.Components.f10.d(this.f44173l0, c3.i0.E(this.f44120b.e, 1.0f - h4(), 1.0f - this.f44126c.e, this.d.e));
    }

    public final void M4(boolean z10, boolean z11) {
        if (this.f44137e0 != null && this.S1 != z10) {
            if (z10) {
                this.R1 = new ArrayList(d4(this.currentAccount, this.f44137e0[0].f43739s, this.W2, false));
            } else {
                this.R1 = null;
            }
            this.S1 = z10;
            yx yxVar = this.f44137e0[0];
            yxVar.d.G = z10;
            if (!z10 && z11) {
                if (yxVar.f43733a.c0()) {
                    this.f44137e0[0].f43733a.post(new ev(this, 25));
                } else {
                    this.f44137e0[0].d.f();
                }
            }
        }
    }

    public final void N3() {
        boolean z10;
        bi.t0 t0Var;
        if (!this.f44165j2 && ((t0Var = this.K0) == null || t0Var.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        e eVar = this.I3;
        if (eVar != null) {
            ((of0) eVar.f36703b).f40151w.a(z10, true);
        }
    }

    public final void N4(boolean z10) {
        yx yxVar;
        if (org.telegram.messenger.uz.o() > 1 && org.telegram.messenger.tc.e(32768)) {
            if (z10) {
                yx[] yxVarArr = this.f44137e0;
                if (yxVarArr != null && (yxVar = yxVarArr[0]) != null) {
                    yxVar.setLayerType(2, null);
                    this.f44137e0[0].setClipChildren(false);
                    this.f44137e0[0].setClipToPadding(false);
                    this.f44137e0[0].f43733a.setClipChildren(false);
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
            if (this.f44137e0 != null) {
                int i10 = 0;
                while (true) {
                    yx[] yxVarArr2 = this.f44137e0;
                    if (i10 >= yxVarArr2.length) {
                        break;
                    }
                    yx yxVar2 = yxVarArr2[i10];
                    if (yxVar2 != null) {
                        yxVar2.setLayerType(0, null);
                        yxVar2.setClipChildren(true);
                        yxVar2.setClipToPadding(true);
                        yxVar2.f43733a.setClipChildren(true);
                    }
                    i10++;
                }
            }
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (lVar2 != null) {
                lVar2.setLayerType(0, null);
            }
            tw twVar = this.E0;
            if (twVar != null) {
                twVar.setLayerType(0, null);
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
        org.telegram.ui.Components.f10.d(this.f44168k0, (1.0f - this.f44120b.e) * (1.0f - h4()) * (1.0f - this.f44126c.e));
        J3();
        M3();
        K3();
        L3();
    }

    public final void O4(float f7) {
        yx[] yxVarArr = this.f44137e0;
        int i10 = 0;
        if (yxVarArr != null) {
            int paddingTop = yxVarArr[0].f43733a.getPaddingTop() + ((int) f7);
            int i11 = 0;
            while (true) {
                yx[] yxVarArr2 = this.f44137e0;
                if (i11 >= yxVarArr2.length) {
                    break;
                }
                yxVarArr2[i11].f43733a.setTopGlowOffset(paddingTop);
                i11++;
            }
        }
        if (this.fragmentView != null && f7 != this.N) {
            this.N = f7;
            org.telegram.ui.Components.wb wbVar = this.f44189o3;
            if (wbVar != null) {
                wbVar.l();
            }
            if (this.E3 != null) {
                float currentActionBarHeight = 1.0f - ((-f7) / org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                org.telegram.ui.Cells.n nVar = this.E3;
                float f10 = (int) f7;
                float f11 = nVar.f22327f;
                nVar.h = f10;
                nVar.setTranslationY(f11 + f10);
                this.E3.setAlpha(w7.u.a(currentActionBarHeight, 0.0f, 1.0f));
                org.telegram.ui.Cells.n nVar2 = this.E3;
                if (currentActionBarHeight <= 0.0f) {
                    i10 = 4;
                }
                nVar2.setVisibility(i10);
            }
            Q3();
            this.fragmentView.invalidate();
        }
    }

    public final void P3() {
        int i10;
        if (h4() > 0.5f) {
            i10 = 2131745723;
        } else {
            i10 = 2131745830;
        }
        String L0 = org.telegram.messenger.dd.L0(i10, null);
        this.X.f26635r.setContentDescription(L0);
        this.X.f26635r.setHint(L0);
    }

    public final void P4(float f7) {
        this.f44236x1 = f7;
        n5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (org.telegram.messenger.uz.o() != 0) {
            org.telegram.messenger.tc.e(32768);
        }
        e5();
    }

    public final void Q3() {
        float f7;
        int i10;
        if (this.X == null) {
            return;
        }
        float a2 = 1.0f - w7.u.a(((-this.N) - g4()) / org.telegram.messenger.i0.L(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.f44221u3, this.h.e);
        float f10 = this.f44120b.e;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float max2 = f7 * (1.0f - this.f44126c.e) * (1.0f - max) * Math.max(f10, (1.0f - h4()) * a2);
        this.X.setAlpha(max2);
        ox oxVar = this.X;
        boolean z10 = false;
        if (max2 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        oxVar.setVisibility(i10);
        if (max2 <= 0.01f) {
            z10 = true;
        }
        this.f44142f.a(z10, true);
    }

    public final void Q4(CharSequence charSequence, String str) {
        if (str != null && !str.isEmpty()) {
            this.E2 = str;
            this.F2 = null;
            this.D2 = null;
            if (this.B1 != null) {
                v3(charSequence);
                return;
            } else {
                this.U3 = charSequence;
                return;
            }
        }
        this.E2 = null;
        this.F2 = null;
    }

    public final void R3() {
        int i10;
        float f7;
        int i11;
        int i12 = 8;
        if (this.Z != null) {
            if (this.f44116a0 != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float f10 = f7 * this.f44120b.e;
            float T1 = org.telegram.messenger.i0.T1(0.98f, 1.0f, f10);
            this.Z.setScaleX(T1);
            this.Z.setScaleY(T1);
            this.Z.setAlpha(f10);
            q01 q01Var = this.Z;
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            q01Var.setVisibility(i11);
        }
        org.telegram.ui.Components.w71 w71Var = this.f44116a0;
        fe.b bVar = this.f44207s;
        if (w71Var != null) {
            float f11 = 1.0f - bVar.e;
            w71Var.setAlpha(f11);
            org.telegram.ui.Components.w71 w71Var2 = this.f44116a0;
            if (f11 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            w71Var2.setVisibility(i10);
        }
        zf.g0 g0Var = this.f44121b0;
        if (g0Var != null) {
            float f12 = bVar.e;
            g0Var.setAlpha(f12);
            zf.g0 g0Var2 = this.f44121b0;
            if (f12 > 0.0f) {
                i12 = 0;
            }
            g0Var2.setVisibility(i12);
        }
    }

    public final void R4(float f7) {
        if (org.telegram.messenger.uz.o() <= 0) {
            boolean z10 = org.telegram.messenger.v2.f18578a;
        } else if (this.W3 != f7) {
            boolean z11 = true;
            if (org.telegram.messenger.uz.o() > 1 && org.telegram.messenger.tc.e(32768)) {
                z11 = false;
            }
            this.X3 = z11;
            this.W3 = f7;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.X3) {
                float f10 = (1.0f - this.W3) * (-org.telegram.messenger.i0.L(40.0f));
                tw twVar = this.E0;
                if (twVar != null) {
                    twVar.setTranslationX(f10);
                }
                ox oxVar = this.X;
                if (oxVar != null) {
                    oxVar.setTranslationX(f10);
                }
                ww wwVar = this.F3;
                if (wwVar != null && wwVar.getFragmentView() != null && !this.D) {
                    this.F3.getFragmentView().setTranslationX(f10);
                    return;
                }
                return;
            }
            float f11 = 1.0f - this.W3;
            float f12 = (-org.telegram.messenger.i0.L(4.0f)) * f11;
            float f13 = 1.0f - (f11 * 0.05f);
            tw twVar2 = this.E0;
            if (twVar2 != null) {
                twVar2.setScaleX(f13);
                this.E0.setScaleY(f13);
                this.E0.setTranslationX(f12);
                this.E0.setPivotX(0.0f);
                this.E0.setPivotY(0.0f);
            }
            ox oxVar2 = this.X;
            if (oxVar2 != null) {
                oxVar2.setTranslationX(f12);
                this.X.setScaleX(f13);
                this.X.setScaleY(f13);
            }
            ww wwVar2 = this.F3;
            if (wwVar2 != null && wwVar2.getFragmentView() != null) {
                if (!this.D) {
                    this.F3.getFragmentView().setScaleX(f13);
                    this.F3.getFragmentView().setScaleY(f13);
                    this.F3.getFragmentView().setTranslationX(f12);
                }
                this.F3.getFragmentView().setPivotX(0.0f);
                this.F3.getFragmentView().setPivotY(0.0f);
            }
        }
    }

    public final void S3(boolean z10) {
        int i10;
        int i11;
        if (this.C0 != null && this.actionBar != null) {
            int i12 = org.telegram.messenger.i0.f16167n;
            int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.i0.L(this.f44115a);
            if (this.f44116a0 != null) {
                i10 = org.telegram.messenger.i0.L(50.0f);
            } else {
                i10 = 0;
            }
            int i13 = measuredHeight + i10;
            org.telegram.ui.Components.zr zrVar = this.J1;
            if (zrVar != null) {
                i11 = (int) zrVar.c(org.telegram.messenger.i0.L(7.0f));
            } else {
                i11 = 0;
            }
            int i14 = i13 + i11;
            jx jxVar = this.C0;
            SparseArray sparseArray = jxVar.h;
            jxVar.W0 = i14;
            jxVar.X0 = i12;
            ag.b1 b1Var = jxVar.f26869a0;
            if (z10) {
                b1Var.q1(0, i14, 0, i12);
            } else {
                b1Var.setPadding(0, i14, 0, i12);
            }
            jxVar.O0.j(jxVar.W0, jxVar.X0, z10);
            org.telegram.ui.Components.um0 um0Var = jxVar.f26870b0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) um0Var.getLayoutParams();
            int i15 = marginLayoutParams.topMargin;
            int i16 = jxVar.W0;
            if (i15 != i16 || marginLayoutParams.bottomMargin != jxVar.X0) {
                marginLayoutParams.topMargin = i16;
                marginLayoutParams.bottomMargin = jxVar.X0;
                um0Var.requestLayout();
            }
            org.telegram.ui.Components.hn0.Q(jxVar.f26876h0, jxVar.f26879k0, jxVar.W0, jxVar.X0, z10);
            org.telegram.ui.Components.hn0.Q(jxVar.m0, jxVar.f26883p0, jxVar.W0, jxVar.X0, z10);
            org.telegram.ui.Components.hn0.Q(jxVar.f26887t0, jxVar.f26890w0, jxVar.W0, jxVar.X0, z10);
            org.telegram.ui.Components.cg0 cg0Var = jxVar.f26885r0;
            int i17 = jxVar.W0;
            int i18 = jxVar.X0;
            cg0Var.setClipToPadding(false);
            org.telegram.ui.Components.v51 v51Var = cg0Var.f25108c;
            cg0Var.J = z10;
            cg0Var.setPadding(0, i17, 0, i18);
            if (z10) {
                v51Var.q1(0, i17, 0, i18);
            } else {
                v51Var.setPadding(0, i17, 0, i18);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) v51Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i17;
            marginLayoutParams2.bottomMargin = -i18;
            cg0Var.J = false;
            org.telegram.ui.Components.hm0 hm0Var = jxVar.I0;
            if (hm0Var != null) {
                hm0Var.b(jxVar.W0, jxVar.X0, z10);
            }
            int size = sparseArray.size();
            for (int i19 = 0; i19 < size; i19++) {
                View view = (View) sparseArray.valueAt(i19);
                if (view instanceof y00) {
                    ((y00) view).j(jxVar.W0, jxVar.X0, z10);
                }
            }
            for (int i20 = 0; i20 < jxVar.getChildCount(); i20++) {
                if (jxVar.getChildAt(i20) instanceof y00) {
                    ((y00) jxVar.getChildAt(i20)).j(jxVar.W0, jxVar.X0, z10);
                }
            }
        }
    }

    public final void S4() {
        getContactsController().B();
        org.telegram.ui.Components.l6 l6Var = new org.telegram.ui.Components.l6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.voip.u(6, this, r1), new rh(r1, 18));
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.a30.h(getParentActivity(), false, 1, getResourceProvider());
        h.N = l6Var;
        h.U0 = 49;
        h.show();
        org.telegram.ui.ActionBar.z2[] z2VarArr = {h};
        h.Q(org.telegram.ui.ActionBar.t6.f21002h5);
    }

    public final void T3() {
        if (this.J1 != null) {
            float T1 = org.telegram.messenger.i0.T1(0.98f, 1.0f, 1.0f);
            this.J1.setAlpha(1.0f);
            this.J1.setScaleX(T1);
            this.J1.setScaleY(T1);
            this.J1.setVisibility(0);
        }
    }

    public final boolean T4(org.telegram.ui.Cells.v2 r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.T4(org.telegram.ui.Cells.v2):boolean");
    }

    public boolean U3() {
        if (this.R0 == 10) {
            return true;
        }
        return false;
    }

    public final void U4(boolean z10) {
        float f7;
        this.f44126c.a(z10, true);
        if (this.m0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.O3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.O3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.O3 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
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
        org.telegram.ui.ActionBar.t0 t0Var = this.m0;
        Property property = View.ALPHA;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(t0Var, property, f7));
        this.O3.playTogether(arrayList);
        this.O3.addListener(new cx(this, z10, 1));
        this.O3.start();
    }

    public final void V3() {
        if (org.telegram.messenger.i0.Q1()) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.k(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                jx jxVar = this.C0;
                if (jxVar != null) {
                    jxVar.f26872d0.Q(this.W1, tLObject);
                }
                this.X1 = null;
                return;
            }
            return;
        }
        this.V1 = true;
    }

    public final void V4() {
        if (!this.A0 && getMessagesController().U0 && getMessagesController().J3 && this.f44243z0 != null && getMessagesController().S0().isEmpty() && !this.isPaused && getUserConfig().P && !this.inPreviewMode) {
            SharedPreferences d12 = org.telegram.messenger.wp.d1();
            if (!d12.getBoolean("filterhint", false)) {
                d12.edit().putBoolean("filterhint", true).apply();
                org.telegram.messenger.i0.h3(new ev(this, 26), 1000L);
            }
        }
    }

    public final void W3() {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null && lVar.f20498n0) {
            lVar.k(true);
            this.f44199q3 = false;
            i5(true, true);
        }
    }

    public final void W4() {
        LaunchActivity launchActivity;
        boolean q6;
        int i10;
        int i11;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        LaunchActivity launchActivity2;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        float f7;
        char c10;
        CharSequence charSequence;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        fv fvVar;
        org.telegram.ui.Components.voip.u uVar;
        int w02;
        int w03;
        int w04;
        int i12;
        int w05;
        org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, this.f44168k0);
        int i13 = org.telegram.ui.ActionBar.t6.A8;
        H.S(getThemedColor(i13), getThemedColor(i13));
        int i14 = 8;
        H.f33044s = 8;
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) parentActivity;
        } else {
            launchActivity = null;
        }
        float f10 = 64.0f;
        int i15 = 0;
        if (this.Y2 != 0) {
            if (org.telegram.messenger.w3.N(this.Z2)) {
                H.c(2131232105, org.telegram.messenger.dd.L0(2131751913, null), new dw(this, 1), false);
                H.k();
            }
            H.i(new dw(this, 4), org.telegram.messenger.dd.L0(2131751912, null), this.Z2.collapsed_in_dialogs);
            H.i(new dw(this, 5), org.telegram.messenger.dd.L0(2131751911, null), !this.Z2.collapsed_in_dialogs);
            H.Z();
            H.X(-org.telegram.messenger.i0.L(64.0f));
        } else if (q4()) {
            H.c(2131232105, org.telegram.messenger.dd.L0(2131754143, null), new dw(this, 6), false);
            H.c(2131232181, org.telegram.messenger.dd.L0(2131749285, null), new dw(this, 7), false);
            H.Z();
            H.X(-org.telegram.messenger.i0.L(64.0f));
        } else {
            org.telegram.ui.ActionBar.p6 p6Var = this.resourceProvider;
            if (p6Var != null) {
                q6 = p6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.t6.I.q();
            }
            if (q6) {
                i10 = 2131231783;
            } else {
                i10 = 2131231842;
            }
            if (q6) {
                i11 = 2131744326;
            } else {
                i11 = 2131744325;
            }
            H.c(i10, org.telegram.messenger.dd.L0(i11, null), new dw(this, 8), false);
            H.k();
            char c11 = '\t';
            H.c(2131232482, org.telegram.messenger.dd.L0(2131748290, null), new dw(this, 9), false);
            H.c(2131232503, org.telegram.messenger.dd.L0(2131745918, null), new dw(this, 10), false);
            org.telegram.messenger.w0 w0Var = org.telegram.messenger.w0.f18944a;
            if (((org.telegram.messenger.j0) getMessagesController().f19300y7.f18033j0.f11588b).f16393c) {
                H.c(2131231276, org.telegram.messenger.dd.L0(2131743220, null), new ev(this, 0), false);
            } else {
                TLRPC.TL_attachMenuBots tL_attachMenuBots = org.telegram.messenger.vi.b0(org.telegram.messenger.e20.f15506s0).f18636b;
                if (launchActivity != null && tL_attachMenuBots != null && (arrayList = tL_attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = tL_attachMenuBots.bots;
                    int size = arrayList3.size();
                    int i16 = 0;
                    while (i16 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i16);
                        i16++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_side_menu) {
                            fv fvVar2 = new fv(this, tL_attachMenuBot2, launchActivity, i15);
                            org.telegram.ui.Components.voip.u uVar2 = new org.telegram.ui.Components.voip.u(i14, this, tL_attachMenuBot2);
                            org.telegram.ui.ActionBar.p6 p6Var2 = H.d;
                            f7 = f10;
                            if (H.e == null) {
                                launchActivity2 = launchActivity;
                                arrayList2 = arrayList3;
                            } else {
                                int i17 = org.telegram.ui.ActionBar.t6.F8;
                                int i18 = org.telegram.ui.ActionBar.t6.E8;
                                org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, H.e, H.d, false, false);
                                b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), i15, org.telegram.messenger.i0.L(18.0f), i15);
                                if (tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                    charSequence = org.telegram.ui.Cells.p8.b(tL_attachMenuBot2.short_name);
                                } else {
                                    charSequence = tL_attachMenuBot2.short_name;
                                }
                                Pattern pattern = org.telegram.messenger.vi.R1;
                                ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList4 = tL_attachMenuBot2.icons;
                                int size2 = arrayList4.size();
                                launchActivity2 = launchActivity;
                                int i19 = 0;
                                while (true) {
                                    if (i19 < size2) {
                                        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList4.get(i19);
                                        int i20 = i19 + 1;
                                        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon3 = tL_attachMenuBotIcon2;
                                        arrayList2 = arrayList3;
                                        if (tL_attachMenuBotIcon3.name.equals("android_side_menu_static")) {
                                            tL_attachMenuBotIcon = tL_attachMenuBotIcon3;
                                            break;
                                        } else {
                                            i19 = i20;
                                            arrayList3 = arrayList2;
                                        }
                                    } else {
                                        arrayList2 = arrayList3;
                                        tL_attachMenuBotIcon = null;
                                        break;
                                    }
                                }
                                if (tL_attachMenuBotIcon != null) {
                                    CharSequence charSequence2 = charSequence;
                                    org.telegram.messenger.d00 f11 = org.telegram.messenger.v5.f(tL_attachMenuBotIcon.icon, org.telegram.ui.ActionBar.t6.f20912c7, 1.0f, null);
                                    if (f11 != null) {
                                        Integer num = H.f33031k0;
                                        if (num != null) {
                                            w05 = num.intValue();
                                        } else {
                                            w05 = org.telegram.ui.ActionBar.t6.w0(i17, p6Var2);
                                        }
                                        new PorterDuffColorFilter(w05, PorterDuff.Mode.SRC_IN);
                                    }
                                    org.telegram.messenger.jc b10 = org.telegram.messenger.jc.b(tL_attachMenuBotIcon.icon);
                                    uVar = uVar2;
                                    fvVar = fvVar2;
                                    b1Var.k(charSequence2, b10, "24_24", f11, tL_attachMenuBot2);
                                    org.telegram.ui.Components.g9 g9Var = b1Var.h;
                                    if (g9Var != null) {
                                        if (org.telegram.messenger.dd.X) {
                                            i12 = 5;
                                        } else {
                                            i12 = 3;
                                        }
                                        g9Var.setLayoutParams(w7.b6.e(24, 24, i12 | 16));
                                    }
                                } else {
                                    fvVar = fvVar2;
                                    uVar = uVar2;
                                    b1Var.j(charSequence, 2131232071, null);
                                }
                                Integer num2 = H.f33029j0;
                                if (num2 == null && H.f33031k0 == null) {
                                    b1Var.c(i18, i17);
                                } else {
                                    if (num2 != null) {
                                        w02 = num2.intValue();
                                    } else {
                                        w02 = org.telegram.ui.ActionBar.t6.w0(i18, p6Var2);
                                    }
                                    Integer num3 = H.f33031k0;
                                    if (num3 != null) {
                                        w03 = num3.intValue();
                                    } else {
                                        w03 = org.telegram.ui.ActionBar.t6.w0(i17, p6Var2);
                                    }
                                    b1Var.d(w02, w03);
                                }
                                Integer num4 = H.f33031k0;
                                if (num4 != null) {
                                    w04 = num4.intValue();
                                } else {
                                    w04 = org.telegram.ui.ActionBar.t6.w0(i17, p6Var2);
                                }
                                b1Var.setIconColorImage(w04);
                                Integer num5 = H.f33033l0;
                                if (num5 != null) {
                                    b1Var.setSelectorColor(num5.intValue());
                                } else {
                                    b1Var.h(0.12f, i18);
                                }
                                c10 = '\t';
                                b1Var.setOnClickListener(new org.telegram.ui.Components.sr(9, H, fvVar));
                                b1Var.setOnLongClickListener(new org.telegram.ui.Components.b0(2, H, uVar));
                                int i21 = H.S;
                                if (i21 > 0) {
                                    b1Var.setMinimumWidth(org.telegram.messenger.i0.L(i21));
                                    H.r(b1Var, w7.b6.o(H.S, -2));
                                } else {
                                    H.r(b1Var, w7.b6.o(-1, -2));
                                }
                                c11 = c10;
                                f10 = f7;
                                launchActivity = launchActivity2;
                                arrayList3 = arrayList2;
                                i14 = 8;
                                i15 = 0;
                            }
                        } else {
                            launchActivity2 = launchActivity;
                            arrayList2 = arrayList3;
                            f7 = f10;
                        }
                        c10 = c11;
                        c11 = c10;
                        f10 = f7;
                        launchActivity = launchActivity2;
                        arrayList3 = arrayList2;
                        i14 = 8;
                        i15 = 0;
                    }
                }
            }
            float f12 = f10;
            if (getUserConfig().W) {
                H.c(2131232360, org.telegram.messenger.dd.L0(2131745512, null), new dw(this, 3), false);
            }
            org.telegram.ui.ActionBar.b1 b1Var2 = this.f44186o0;
            if (b1Var2 != null) {
                org.telegram.ui.ActionBar.a7.V(b1Var2.f20166b, org.telegram.ui.ActionBar.t6.Oi, getResourceProvider());
                this.f44186o0.setOnClickListener(new vu(5, this, H));
                SharedPreferences sharedPreferences = org.telegram.messenger.w0.f18945b.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().y3 && !org.telegram.messenger.uz.f18571z1.isEmpty())) {
                    H.k();
                    H.d(this.f44186o0);
                }
            }
            H.Z();
            H.X(-org.telegram.messenger.i0.L(f12));
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent, boolean z10) {
        ww wwVar;
        bi.t0 t0Var;
        px pxVar;
        boolean z11;
        boolean z12;
        if (!this.f44199q3 && (((wwVar = this.F3) == null || !wwVar.c()) && (((t0Var = this.K0) == null || t0Var.getVisibility() != 0) && ((pxVar = this.f44243z0) == null || !pxVar.f30763n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                px pxVar2 = this.f44243z0;
                if (pxVar2 != null && pxVar2.getTabsCount() >= 2 && this.f44243z0.getCurrentTabId() != this.f44243z0.getFirstTabId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                px pxVar3 = this.f44243z0;
                if (pxVar3 != null && pxVar3.getTabsCount() >= 2 && this.f44243z0.getCurrentTabId() != this.f44243z0.getLastTabId()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                org.telegram.messenger.uz.m(this.currentAccount);
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

    public final void X3(String str) {
        if (this.actionBar.e(str)) {
            return;
        }
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m(str);
        boolean z10 = this.W;
        ArrayList arrayList = this.f44159i1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f44149g1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f44149g1.setImageDrawable(new org.telegram.ui.ActionBar.c2(true));
            org.telegram.ui.ActionBar.a7.t(this.f44149g1, org.telegram.ui.ActionBar.t6.f21314y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.f44149g1;
            int i10 = org.telegram.ui.ActionBar.t6.f21333z8;
            org.telegram.ui.ActionBar.a7.R(imageView2, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i10), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i10), getResourceProvider());
            this.f44149g1.setOnClickListener(new gv(this, 6));
            m10.addView(this.f44149g1, w7.b6.r(54, 54, 16));
            arrayList.add(this.f44149g1);
        }
        NumberTextView numberTextView = new NumberTextView(m10.getContext());
        this.f44154h1 = numberTextView;
        int i11 = 18;
        numberTextView.setTextSize(18);
        this.f44154h1.setTypeface(org.telegram.messenger.i0.o());
        this.f44154h1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.f21314y8));
        NumberTextView numberTextView2 = this.f44154h1;
        if (!this.W) {
            i11 = 72;
        }
        m10.addView(numberTextView2, w7.b6.m(1.0f, 0, -1, i11, 0, 0));
        this.f44154h1.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
        this.f44169k1 = m10.g(100, 2131232292, org.telegram.messenger.i0.L(48.0f));
        this.l1 = m10.g(104, 2131232255, org.telegram.messenger.i0.L(48.0f));
        this.f44176m1 = m10.g(107, 2131232050, org.telegram.messenger.i0.L(48.0f));
        this.f44164j1 = m10.h(102, 2131232107, org.telegram.messenger.dd.L0(2131751599, null), org.telegram.messenger.i0.L(48.0f));
        org.telegram.ui.ActionBar.t0 h = m10.h(0, 2131231245, org.telegram.messenger.dd.L0(2131754839, null), org.telegram.messenger.i0.L(48.0f));
        m10.addView(new View(getParentActivity()), w7.b6.o(5, -1));
        this.f44197q1 = h.e(105, 2131232050, org.telegram.messenger.dd.L0(2131754172, null));
        this.f44182n1 = h.e(108, 2131232292, org.telegram.messenger.dd.L0(2131751454, null));
        this.f44187o1 = h.e(109, 2131232045, org.telegram.messenger.dd.L0(2131750813, null));
        this.f44192p1 = h.e(110, 2131232328, org.telegram.messenger.dd.L0(2131750713, null));
        this.f44209s1 = h.e(101, 2131232214, org.telegram.messenger.dd.L0(2131748696, null));
        this.f44203r1 = h.e(103, 2131232091, org.telegram.messenger.dd.L0(2131752089, null));
        this.f44214t1 = h.e(106, 2131232066, org.telegram.messenger.dd.L0(2131753692, null));
        this.l1.setOnLongClickListener(new tv(this, 1));
        arrayList.add(this.f44169k1);
        arrayList.add(this.f44176m1);
        arrayList.add(this.l1);
        arrayList.add(this.f44164j1);
        arrayList.add(h);
        f5(false);
    }

    public final void X4() {
        if (this.R3 == null) {
            for (String str : getMessagesController().U3) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String L0 = org.telegram.messenger.dd.L0(2131749328, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131749329, null));
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131749542, null), new hv(this, 6));
                    showDialog(x1Var, new nv(this, 0));
                    this.R3 = str;
                    return;
                }
            }
        }
    }

    public final void Y3() {
        int i10;
        jx jxVar = this.C0;
        if ((jxVar != null && jxVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f44183n2 != null) {
            i10 = 2;
        } else if (!this.f44174l2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        jx jxVar2 = new jx(this, getParentActivity(), this, i10, this.R0, this.W2, this.Y2, new hw(this));
        this.C0 = jxVar2;
        this.glassEngine.c(jxVar2);
        ((sx) this.fragmentView).addView(this.C0, this.B0);
        jx jxVar3 = this.C0;
        jxVar3.f26872d0.U = new lx(this);
        jxVar3.f26879k0.setOnItemClickListener(new hv(this, 1));
        this.C0.f26883p0.setOnItemClickListener(new hv(this, 2));
        this.C0.f26890w0.setOnItemClickListener(new mv(this, 0));
        this.C0.f26883p0.setOnItemLongClickListener(new hv(this, 3));
        this.C0.f26869a0.setOnItemClickListener(new hv(this, 4));
        this.C0.f26869a0.setOnItemLongClickListener(new hw(this));
        this.C0.setFilteredSearchViewDelegate(new hv(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.f44190o4);
    }

    public final void Y4(long j10, View view) {
        ArrayList d42;
        int i10;
        s3(j10, view);
        boolean u10 = this.actionBar.u();
        ArrayList arrayList = this.I2;
        boolean z10 = true;
        if (u10) {
            if (arrayList.isEmpty()) {
                n4(true);
                return;
            }
        } else {
            if (this.f44199q3) {
                X3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.a5)) {
                    this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
                }
            } else {
                X3(null);
            }
            org.telegram.messenger.i0.v1(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
            this.actionBar.O(null, null);
            int i11 = this.f44137e0[0].f43739s;
            if ((i11 != 7 && i11 != 8) || (this.actionBar.u() && !this.actionBar.w(null))) {
                d42 = getMessagesController().V0(this.W2);
            } else {
                d42 = d4(this.currentAccount, this.f44137e0[0].f43739s, this.W2, this.S1);
            }
            int size = d42.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) d42.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (s4(dialog)) {
                        i12++;
                    } else if (!getMessagesController().B2(dialog.f19798id, false)) {
                        break;
                    }
                }
            }
            if (i12 > 1) {
                if (this.f44137e0 != null) {
                    int i14 = 0;
                    while (true) {
                        yx[] yxVarArr = this.f44137e0;
                        if (i14 >= yxVarArr.length) {
                            break;
                        }
                        yxVarArr[i14].d.H = true;
                        i14++;
                    }
                }
                int i15 = org.telegram.messenger.wp.D8;
                u5(131072, true);
            }
            if (!this.f44199q3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i16 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f44159i1;
                    if (i16 >= arrayList3.size()) {
                        break;
                    }
                    View view2 = (View) arrayList3.get(i16);
                    view2.setPivotY(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2);
                    org.telegram.messenger.i0.y(view2);
                    arrayList2.add(ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.1f, 1.0f));
                    i16++;
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(200L);
                animatorSet.start();
            }
            ValueAnimator valueAnimator = this.f44226v3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f44226v3 = ValueAnimator.ofFloat(this.f44221u3, 1.0f);
            int i17 = 0;
            while (true) {
                yx[] yxVarArr2 = this.f44137e0;
                if (i17 >= yxVarArr2.length) {
                    break;
                }
                yx yxVar = yxVarArr2[i17];
                if (yxVar != null) {
                    yxVar.f43733a.I0(true);
                }
                i17++;
            }
            if (this.K) {
                i10 = 81;
            } else {
                i10 = 0;
            }
            float max = Math.max(0.0f, org.telegram.messenger.i0.L(i10 + 48) + this.N);
            if (max != 0.0f) {
                this.P = (int) max;
                this.fragmentView.requestLayout();
            }
            this.f44226v3.addUpdateListener(new iv(this, max, 0));
            this.f44226v3.addListener(new ex(this, max, 1));
            this.f44226v3.setInterpolator(org.telegram.ui.Components.gr.f26523f);
            this.f44226v3.setDuration(200L);
            this.f44226v3.start();
            px pxVar = this.f44243z0;
            if (pxVar != null) {
                pxVar.b(org.telegram.ui.ActionBar.t6.ui, org.telegram.ui.ActionBar.t6.ti, org.telegram.ui.ActionBar.t6.si, org.telegram.ui.ActionBar.t6.vi, org.telegram.ui.ActionBar.t6.f21280w8);
            }
            org.telegram.ui.ActionBar.c2 c2Var = this.f44138e1;
            if (c2Var != null) {
                c2Var.c(true, 1.0f);
            }
            z10 = false;
        }
        f5(false);
        this.f44154h1.a(arrayList.size(), z10);
    }

    public final void Z3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f44240y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new fx(this, parentActivity);
                FrameLayout.LayoutParams d = w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.f44147f4 + this.f44157h4 + d.bottomMargin;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.f44235x0 + 1;
                this.f44235x0 = i11;
                ((sx) this.fragmentView).addView(undoView, i11, d);
            }
        }
    }

    public final void Z4(long j10, View view) {
        String str;
        org.telegram.ui.Components.wb K;
        int i10 = -this.L3;
        this.L3 = i10;
        org.telegram.messenger.i0.F3(i10, view, null);
        org.telegram.messenger.t2.APP_ERROR.a();
        if (j10 >= 0) {
            str = org.telegram.messenger.i20.p(org.telegram.messenger.wp.r1(this.currentAccount).Z1(Long.valueOf(j10)));
        } else {
            str = "";
        }
        if (getMessagesController().A3()) {
            K = org.telegram.ui.Components.cc.a0(this).Q(2131624214, 36, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131743786, str)));
        } else {
            K = org.telegram.ui.Components.cc.a0(this).K(2131624214, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131743786, str)), org.telegram.messenger.dd.L0(2131743785, null), new ev(this, 8));
        }
        K.j();
    }

    public final void a4(final long j10, final long j11, boolean z10, final nb1 nb1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String L0;
        String b02;
        String L02;
        TLRPC.TL_forumTopic f7;
        if (A3(j10)) {
            int i10 = this.R0;
            if (i10 != 11 && i10 != 12 && i10 != 13) {
                if (z10 && ((this.f44145f2 != null && this.f44150g2 != null) || this.f44155h2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (org.telegram.messenger.o5.C(j10)) {
                            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(getMessagesController().Z0(Integer.valueOf((int) (4294967295L & j10))).user_id));
                            if (Z1 != null) {
                                L0 = org.telegram.messenger.dd.L0(2131745613, null);
                                b02 = org.telegram.messenger.dd.b0(this.f44145f2, org.telegram.messenger.i20.p(Z1));
                                L02 = org.telegram.messenger.dd.L0(2131745657, null);
                            } else {
                                return;
                            }
                        } else if (org.telegram.messenger.o5.E(j10)) {
                            if (j10 == getUserConfig().e()) {
                                L0 = org.telegram.messenger.dd.L0(2131745613, null);
                                b02 = org.telegram.messenger.dd.b0(this.f44150g2, org.telegram.messenger.dd.L0(2131745918, null));
                                L02 = org.telegram.messenger.dd.L0(2131745657, null);
                            } else {
                                TLRPC.User Z12 = getMessagesController().Z1(Long.valueOf(j10));
                                if (Z12 != null && this.f44145f2 != null) {
                                    L0 = org.telegram.messenger.dd.L0(2131745613, null);
                                    b02 = org.telegram.messenger.dd.b0(this.f44145f2, org.telegram.messenger.i20.p(Z12));
                                    L02 = org.telegram.messenger.dd.L0(2131745657, null);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat L03 = getMessagesController().L0(Long.valueOf(-j10));
                            if (L03 != null) {
                                String str = L03.title;
                                if (j11 != 0 && (f7 = getMessagesController().f19234r7.f(L03.f19794id, j11)) != null) {
                                    str = ((Object) str) + " " + f7.title;
                                }
                                if (this.f44155h2 != null) {
                                    L0 = org.telegram.messenger.dd.L0(2131754366, null);
                                    b02 = org.telegram.messenger.dd.b0(this.f44155h2, str);
                                    L02 = org.telegram.messenger.dd.L0(2131754486, null);
                                } else {
                                    L0 = org.telegram.messenger.dd.L0(2131745613, null);
                                    b02 = org.telegram.messenger.dd.b0(this.f44150g2, str);
                                    L02 = org.telegram.messenger.dd.L0(2131745657, null);
                                }
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.i0.W2(b02);
                        alertDialog$Builder.k(L02, new org.telegram.ui.ActionBar.u1() {
                            @Override
                            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i11) {
                                zx.this.a4(j10, j11, false, nb1Var);
                            }
                        });
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        if (showDialog(x1Var) == null) {
                            x1Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 15) {
                    Runnable i0Var = new a3.i0(this, j10, new a3.h0(this, j10, j11, nb1Var, 5), 17);
                    if (j10 < 0) {
                        c5(getMessagesController().L0(Long.valueOf(-j10)), i0Var, null);
                        return;
                    }
                    TLRPC.User Z13 = getMessagesController().Z1(Long.valueOf(j10));
                    TLRPC.User Z14 = getMessagesController().Z1(Long.valueOf(this.H));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String a02 = org.telegram.messenger.dd.a0(null, null, 2131754074, org.telegram.messenger.i20.j(Z13, true), org.telegram.messenger.i20.j(Z14, true));
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                    x1Var2.R = a02;
                    x1Var2.T = TextUtils.concat(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131754075, org.telegram.messenger.i20.j(Z13, true), org.telegram.messenger.i20.j(Z14, true))));
                    alertDialog$Builder2.k(org.telegram.messenger.dd.a0("Send", null, 2131745657, new Object[0]), new st(i0Var, 4));
                    alertDialog$Builder2.h(org.telegram.messenger.dd.a0("Cancel", null, 2131752589, new Object[0]), new org.telegram.ui.Components.a21(7));
                    showDialog(x1Var2);
                    return;
                } else if (this.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(org.telegram.messenger.hs.a(j10, j11));
                    if (this.C2.z(this, arrayList, null, false, this.J2, this.K2, this.L2, nb1Var) && this.f44160i2) {
                        this.C2 = null;
                        return;
                    }
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            if (org.telegram.messenger.o5.E(j10)) {
                TLRPC.User Z15 = getMessagesController().Z1(Long.valueOf(j10));
                if (!Z15.mutual_contact) {
                    UndoView k42 = k4();
                    if (k42 != null) {
                        k42.j(45, j10, null);
                        return;
                    }
                    return;
                }
                user = Z15;
                chat = null;
            } else {
                TLRPC.Chat L04 = getMessagesController().L0(Long.valueOf(-j10));
                if (org.telegram.messenger.w3.N(L04) && org.telegram.messenger.w3.w(1, L04)) {
                    chat = L04;
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
            org.telegram.ui.ActionBar.x1 x1Var3 = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().i1(j10);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new org.telegram.messenger.wm(this, x1Var3, user, chat, j10, tL_messages_checkHistoryImportPeer, 1));
            try {
                x1Var3.r(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void a5(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.a5(boolean, boolean, boolean, boolean):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Wk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Vk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.al));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Zk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Yk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Xk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20988g8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Gj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20969f9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20989g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21099m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Wl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21312y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20951e9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20933d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20914c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.M7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.N7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21006h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21119n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21080l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21138o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21042j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21062k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20894b8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20874a8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Y7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.W7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.V7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.K7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20893b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21153p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21060k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.nk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21334z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21315y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21299x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21263v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21246u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21227t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21208s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21190r9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21173q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21024i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20895b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20875a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G8));
    }

    public final void b4(long j10, boolean z10) {
        if (this.f44137e0 != null) {
            int i10 = 0;
            while (true) {
                yx[] yxVarArr = this.f44137e0;
                if (i10 < yxVarArr.length) {
                    int childCount = yxVarArr[i10].f43733a.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 < childCount) {
                            View childAt = this.f44137e0[i10].f43733a.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.v2) {
                                org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) childAt;
                                if (v2Var.getDialogId() == j10) {
                                    v2Var.c0(z10, true);
                                    break;
                                }
                            }
                            i11++;
                        }
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void b5() {
        int i10;
        int i11;
        Long l4;
        if (this.M0 == null && !org.telegram.messenger.uz.f18563x && (!this.K || this.E0.g())) {
            x21[] x21VarArr = new x21[1];
            TLRPC.User f7 = org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).f();
            org.telegram.ui.ActionBar.u5 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.D3.f();
                Drawable drawable = this.D3.f25372f[0];
                Rect rect = org.telegram.messenger.i0.Q;
                rect.set(titleTextView.getRightDrawable().getBounds());
                rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
                int L = (-(this.actionBar.getHeight() - rect.centerY())) - org.telegram.messenger.i0.L(16.0f);
                i10 = org.telegram.messenger.i0.L(4.0f) + (rect.centerX() - org.telegram.messenger.i0.L(16.0f));
                org.telegram.ui.Cells.n nVar = this.E3;
                if (nVar != null) {
                    nVar.b(rect.centerX(), rect.centerY());
                }
                i11 = L;
            } else {
                i10 = 0;
                i11 = 0;
            }
            xw xwVar = new xw(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), x21VarArr);
            if (f7 != null && org.telegram.messenger.o5.g(f7.emoji_status) > 0) {
                xwVar.setExpireDateHint(org.telegram.messenger.o5.g(f7.emoji_status));
            }
            Long l10 = this.B3;
            if (l10 != null) {
                xwVar.setSelected(l10);
            } else {
                Drawable drawable2 = this.D3.f25372f[0];
                if (drawable2 instanceof org.telegram.ui.Components.f5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.f5) drawable2).h());
                } else {
                    l4 = null;
                }
                xwVar.setSelected(l4);
            }
            xwVar.setSaveState(1);
            xwVar.y(this.D3, titleTextView);
            yw ywVar = new yw(this, xwVar);
            this.M0 = ywVar;
            x21VarArr[0] = ywVar;
            ywVar.showAsDropDown(this.actionBar, org.telegram.messenger.i0.L(16.0f), i11, 48);
            x21VarArr[0].b();
        }
    }

    public final void c5(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.c5(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    @Override
    public final boolean canBeginSlide() {
        px pxVar;
        if (!this.F3.c()) {
            if (this.R0 == 3 && (pxVar = this.f44243z0) != null && pxVar.getVisibility() == 0 && this.f44243z0.K > 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean closeLastFragment() {
        if (this.F3.c()) {
            this.F3.a();
            jx jxVar = this.C0;
            if (jxVar != null) {
                jxVar.S();
                return true;
            }
            return true;
        }
        return super.closeLastFragment();
    }

    @Override
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        kg.g1 g1Var = new kg.g1(this, context, this.resourceProvider, 4);
        g1Var.setAllowOverlayTitle(true);
        g1Var.G0 = true;
        if (g1Var.F0 == null) {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(g1Var.getContext(), 9);
            g1Var.F0 = a5Var;
            g1Var.addView(a5Var);
        }
        org.telegram.ui.ActionBar.a7.m(g1Var, 3, org.telegram.ui.ActionBar.t6.f21226t8, getResourceProvider());
        org.telegram.ui.ActionBar.a7.a(g1Var, org.telegram.ui.ActionBar.t6.f21333z8, getResourceProvider(), true);
        org.telegram.ui.ActionBar.a7.m(g1Var, 1, org.telegram.ui.ActionBar.t6.f21262v8, getResourceProvider());
        org.telegram.ui.ActionBar.a7.b(g1Var, org.telegram.ui.ActionBar.t6.f21314y8, getResourceProvider(), true);
        if (g1Var.f20523x1 == null) {
            org.telegram.ui.ActionBar.j jVar = new org.telegram.ui.ActionBar.j(g1Var, g1Var.getContext(), g1Var.J0, g1Var.O0);
            g1Var.f20523x1 = jVar;
            jVar.setClipChildren(false);
            g1Var.addView(g1Var.f20523x1);
        }
        g1Var.getAdditionalSubTitleOverlayContainer().setTranslationX(org.telegram.messenger.i0.L(4.0f));
        g1Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-org.telegram.messenger.i0.L(3.0f));
        if (!this.inPreviewMode && (!org.telegram.messenger.i0.Q1() || this.W2 == 0 || q4())) {
            return g1Var;
        }
        g1Var.setOccupyStatusBar(false);
        return g1Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.createView(android.content.Context):android.view.View");
    }

    public final java.util.ArrayList d4(int r11, int r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.d4(int, int, int, boolean):java.util.ArrayList");
    }

    public final void d5(boolean z10) {
        yx[] yxVarArr;
        char c10;
        char c11;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            yxVarArr = this.f44137e0;
            if (i11 >= yxVarArr.length) {
                break;
            }
            yxVarArr[i11].f43733a.C0();
            i11++;
        }
        if (z10 && yxVarArr.length > 1) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int i12 = yxVarArr[c10].h;
        if (i12 >= 0 && i12 < getMessagesController().S0().size()) {
            org.telegram.messenger.bp bpVar = (org.telegram.messenger.bp) getMessagesController().S0().get(this.f44137e0[c10].h);
            if (bpVar.e()) {
                yx yxVar = this.f44137e0[c10];
                yxVar.f43739s = this.R0;
                vx vxVar = yxVar.f43733a;
                int i13 = vx.B3;
                vxVar.D1();
            } else {
                yx[] yxVarArr2 = this.f44137e0;
                if (yxVarArr2[c10 ^ 1].f43739s == 7) {
                    yxVarArr2[c10].f43739s = 8;
                } else {
                    yxVarArr2[c10].f43739s = 7;
                }
                yxVarArr2[c10].f43733a.setScrollEnabled(true);
                org.telegram.messenger.wp messagesController = getMessagesController();
                if (this.f44137e0[c10].f43739s == 8) {
                    c11 = 1;
                } else {
                    c11 = 0;
                }
                org.telegram.messenger.bp[] bpVarArr = messagesController.M;
                org.telegram.messenger.bp bpVar2 = bpVarArr[c11];
                if (bpVar2 != bpVar) {
                    bpVarArr[c11] = bpVar;
                    int i14 = c11 ^ 1;
                    if (bpVarArr[i14] == bpVar) {
                        bpVarArr[i14] = null;
                    }
                    if (bpVarArr[c11] == null) {
                        if (bpVar2 != null) {
                            bpVar2.f15007k.clear();
                            bpVar2.f15008l.clear();
                        }
                    } else {
                        messagesController.Q4(null);
                    }
                }
            }
            yx[] yxVarArr3 = this.f44137e0;
            if (yxVarArr3.length > 1) {
                yxVarArr3[1].E = bpVar.f15012p;
            }
            yx yxVar2 = yxVarArr3[c10];
            kw kwVar = yxVar2.d;
            kwVar.h = yxVar2.f43739s;
            kwVar.f();
            yx yxVar3 = this.f44137e0[c10];
            gw gwVar = yxVar3.f43735c;
            if (yxVar3.f43739s == 0 && l4() && this.f44137e0[c10].f43740w == 2) {
                i10 = 1;
            }
            gwVar.h1(i10, (int) this.N);
            C3(this.f44137e0[c10]);
        }
    }

    @Override
    public final void didReceivedNotification(int r27, int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (!(dialog instanceof xh.m2) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final float e4(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f - this.f44120b.e;
        } else {
            f7 = 1.0f;
        }
        return f7 * (1.0f - h4()) * this.f44201r.e;
    }

    public final void e5() {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        int i10;
        q01 q01Var = this.Z;
        if (q01Var != null && q01Var.getVisibility() != 8) {
            f7 = this.Z.getMeasuredHeight();
        } else {
            f7 = 0.0f;
        }
        if (this.K) {
            f10 = org.telegram.messenger.i0.L(81.0f);
        } else {
            f10 = 0.0f;
        }
        if (this.K) {
            float f19 = this.N;
            float f20 = this.f44236x1;
            f11 = (f7 * f20) + c3.i0.z(1.0f, f20, f10, f19);
            f12 = this.f44238x3;
        } else {
            f11 = (f7 * this.f44236x1) + this.N;
            f12 = this.f44238x3;
        }
        float f21 = f11 + f12 + this.T;
        ox oxVar = this.X;
        if (oxVar != null && oxVar.getVisibility() == 0) {
            f13 = this.X.getAlpha();
        } else {
            f13 = 0.0f;
        }
        float L = org.telegram.messenger.i0.L(4.0f) * f13;
        px pxVar = this.f44243z0;
        if (pxVar != null) {
            pxVar.setTranslationY(f21 - L);
            f15 = this.f44243z0.getAlpha();
            f16 = org.telegram.messenger.i0.L(43.0f) * f15;
            f14 = f21 + f16;
        } else {
            f14 = f21;
            f15 = 0.0f;
            f16 = 0.0f;
        }
        org.telegram.ui.Components.zr zrVar = this.J1;
        if (zrVar != null) {
            float f22 = f14 - L;
            int i11 = -org.telegram.messenger.i0.L(3.0f);
            if (this.f44116a0 == null) {
                i10 = org.telegram.messenger.i0.L(44.0f);
            } else {
                i10 = 0;
            }
            zrVar.setTranslationY(org.telegram.messenger.i0.T1(f22, i11 - i10, this.f44120b.e));
            f17 = this.J1.getMetadata().f7041c.f7049a;
            f18 = this.J1.c(0.0f);
        } else {
            f17 = 0.0f;
            f18 = 0.0f;
        }
        org.telegram.ui.Components.yr yrVar = this.K1;
        if (yrVar != null) {
            yrVar.setTranslationY(f21 - L);
            float W1 = org.telegram.messenger.i0.W1(Math.min(f17, f15), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(50.0f));
            org.telegram.ui.Components.yr yrVar2 = this.K1;
            float min = Math.min(org.telegram.messenger.i0.L(40.0f), (f18 + f16) - W1);
            Matrix matrix = yrVar2.f32893b;
            if (yrVar2.e != W1 || yrVar2.f32895f != min) {
                yrVar2.e = W1;
                yrVar2.f32895f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, W1);
                LinearGradient linearGradient = yrVar2.f32894c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                yrVar2.invalidate();
            }
            this.K1.setAlpha(Math.max(f15, f17));
        }
    }

    public final int f4() {
        if (this.K) {
            return org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.L(81.0f);
        }
        return org.telegram.messenger.i0.L(48.0f);
    }

    public final void f5(boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.f5(boolean):void");
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.z60 z60Var = this.L0;
        if (z60Var != null) {
            z60Var.u();
        }
    }

    public final int g4() {
        if (this.K) {
            return org.telegram.messenger.i0.L(81.0f);
        }
        return 0;
    }

    public final void g5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.g5():void");
    }

    @Override
    public final org.telegram.ui.ActionBar.u4 getBackButtonState() {
        if (!q4() && !this.F3.f38625f) {
            return org.telegram.ui.ActionBar.u4.f21350b;
        }
        return org.telegram.ui.ActionBar.u4.f21349a;
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        int i10;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W3, 1.0f);
            this.Z3 = ofFloat;
            return ofFloat;
        }
        if (getLayoutContainer() != null && getLayoutContainer().getMeasuredWidth() > 0) {
            i10 = (int) Utilities.i((200.0f / getLayoutContainer().getMeasuredWidth()) * f7, 200.0f, 80.0f);
        } else {
            i10 = 150;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.W3, 1.0f);
        this.Z3 = ofFloat2;
        ofFloat2.addUpdateListener(new lv(this, 1));
        this.Z3.setInterpolator(org.telegram.ui.Components.gr.f26524g);
        this.Z3.setDuration(i10);
        this.Z3.start();
        return this.Z3;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.getThemeDescriptions():java.util.ArrayList");
    }

    public final float h4() {
        ww wwVar = this.F3;
        if (wwVar != null && wwVar.c()) {
            return this.F3.e;
        }
        return 0.0f;
    }

    public final void h5() {
        ag.b1 b1Var;
        vx vxVar;
        boolean z10;
        int i10;
        try {
            nw nwVar = this.B1;
            if (nwVar != null && nwVar.getEditField() != null) {
                this.B1.getEditField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.t6.Ke));
            }
            NumberTextView numberTextView = this.f44154h1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.f21314y8));
            }
            px pxVar = this.f44243z0;
            int i11 = 0;
            if (pxVar != null && (pxVar.getSelectorDrawable() instanceof GradientDrawable)) {
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (lVar != null && lVar.u()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                GradientDrawable gradientDrawable = (GradientDrawable) this.f44243z0.getSelectorDrawable();
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.t6.ui;
                } else {
                    i10 = org.telegram.ui.ActionBar.t6.K8;
                }
                gradientDrawable.setColor(getThemedColor(i10));
                this.f44243z0.invalidate();
            }
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (lVar2 != null) {
                if (this.W2 != 0 || this.Y2 != 0) {
                    lVar2.I(getThemedColor(org.telegram.ui.ActionBar.t6.Q8), false);
                    this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.t6.R8), true);
                }
                if (this.actionBar.u()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
                }
                n5();
            }
            if (this.f44137e0 != null) {
                while (true) {
                    yx[] yxVarArr = this.f44137e0;
                    if (i11 >= yxVarArr.length) {
                        break;
                    }
                    yx yxVar = yxVarArr[i11];
                    if (yxVar != null && (vxVar = yxVar.f43733a) != null) {
                        vxVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
                    }
                    i11++;
                }
            }
            jx jxVar = this.C0;
            if (jxVar != null && (b1Var = jxVar.f26869a0) != null) {
                b1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
            }
            bi.f2 f2Var = this.C1;
            if (f2Var != null) {
                f2Var.setScrimViewBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
            }
            vh.p2 p2Var = this.f44191p0;
            if (p2Var != null) {
                p2Var.h(getThemedColor(org.telegram.ui.ActionBar.t6.tj));
            }
            vh.p2 p2Var2 = this.f44196q0;
            if (p2Var2 != null) {
                p2Var2.h(getThemedColor(org.telegram.ui.ActionBar.t6.tj));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final float i4() {
        return -org.telegram.messenger.i0.W1(this.f44120b.e, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(48.0f));
    }

    public final void i5(boolean z10, boolean z11) {
        ?? r52;
        int L0;
        boolean z12;
        yx[] yxVarArr;
        org.telegram.messenger.bp bpVar;
        boolean z13;
        Object[] objArr;
        s4.l0 l0Var;
        boolean z14;
        boolean z15;
        boolean z16;
        if (this.f44243z0 != null && !this.inPreviewMode && !this.f44199q3) {
            ww wwVar = this.F3;
            if (wwVar == null || !wwVar.c()) {
                org.telegram.ui.Components.z60 z60Var = this.L0;
                String str = null;
                if (z60Var != null) {
                    z60Var.u();
                    this.L0 = null;
                }
                ArrayList S0 = getMessagesController().S0();
                int size = S0.size();
                fe.b bVar = this.f44201r;
                boolean z17 = true;
                boolean z18 = false;
                if (size > 1) {
                    if (!z10 && this.f44243z0.getVisibility() == 0) {
                        r52 = 0;
                    } else {
                        if (this.f44243z0.getVisibility() != 0) {
                            z13 = false;
                        } else {
                            z13 = z11;
                        }
                        this.f44234x = true;
                        boolean isEmpty = this.f44243z0.h.isEmpty();
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.Q3 == null) {
                                z16 = z11;
                            } else {
                                z16 = false;
                            }
                            if (!this.f44199q3) {
                                bVar.a(this.f44234x, z16);
                            }
                        }
                        int currentTabId = this.f44243z0.getCurrentTabId();
                        int currentTabStableId = this.f44243z0.getCurrentTabStableId();
                        if (currentTabId != this.f44243z0.getDefaultTabId() && currentTabId >= S0.size()) {
                            this.f44243z0.L = -1;
                            objArr = 1;
                        } else {
                            objArr = null;
                        }
                        px pxVar = this.f44243z0;
                        pxVar.h.clear();
                        pxVar.f30760j0.clear();
                        pxVar.f30762l0.clear();
                        pxVar.m0.clear();
                        pxVar.f30764n0.clear();
                        pxVar.f30765o0.clear();
                        pxVar.M = 0;
                        int size2 = S0.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            if (((org.telegram.messenger.bp) S0.get(i10)).e()) {
                                this.f44243z0.a(i10, 0, org.telegram.messenger.dd.L0(2131750808, str), null, false, true, ((org.telegram.messenger.bp) S0.get(i10)).f15012p);
                                z15 = z18;
                            } else {
                                org.telegram.messenger.bp bpVar2 = (org.telegram.messenger.bp) S0.get(i10);
                                z15 = z18;
                                this.f44243z0.a(i10, bpVar2.f15011o, bpVar2.f15001b, bpVar2.f15002c, bpVar2.f15010n, false, ((org.telegram.messenger.bp) S0.get(i10)).f15012p);
                            }
                            i10++;
                            z18 = z15;
                            str = null;
                        }
                        boolean z19 = z18;
                        if (currentTabStableId >= 0) {
                            if (objArr != null && !this.f44243z0.h(currentTabStableId)) {
                                while (currentTabId >= 0) {
                                    px pxVar2 = this.f44243z0;
                                    if (pxVar2.h(pxVar2.f30761k0.get(currentTabId, -1))) {
                                        break;
                                    }
                                    currentTabId--;
                                }
                                if (currentTabId < 0) {
                                    currentTabId = z19 ? 1 : 0;
                                }
                            }
                            if (this.f44243z0.f30761k0.get(this.f44137e0[z19 ? 1 : 0].h, -1) != currentTabStableId) {
                                this.f44137e0[z19 ? 1 : 0].h = currentTabId;
                                isEmpty = true;
                            }
                        }
                        int i11 = z19 ? 1 : 0;
                        while (true) {
                            yx[] yxVarArr2 = this.f44137e0;
                            if (i11 >= yxVarArr2.length) {
                                break;
                            }
                            if (yxVarArr2[i11].h >= S0.size()) {
                                this.f44137e0[i11].h = S0.size() - 1;
                            }
                            this.f44137e0[i11].f43733a.setScrollingTouchSlop(1);
                            i11++;
                        }
                        px pxVar3 = this.f44243z0;
                        ag.b1 b1Var = pxVar3.F;
                        if (z13) {
                            l0Var = pxVar3.f30771s0;
                        } else {
                            l0Var = null;
                        }
                        b1Var.setItemAnimator(l0Var);
                        pxVar3.I.f();
                        if (isEmpty) {
                            d5(z19);
                        }
                        px pxVar4 = this.f44243z0;
                        int currentTabId2 = pxVar4.getCurrentTabId();
                        ArrayList arrayList = pxVar4.h;
                        int i12 = 0;
                        while (true) {
                            if (i12 < arrayList.size()) {
                                if (((org.telegram.ui.Components.pz) arrayList.get(i12)).f29572a == currentTabId2) {
                                    z14 = ((org.telegram.ui.Components.pz) arrayList.get(i12)).f29575f;
                                    break;
                                }
                                i12++;
                            } else {
                                z14 = false;
                                break;
                            }
                        }
                        if (z14) {
                            px pxVar5 = this.f44243z0;
                            ArrayList arrayList2 = pxVar5.h;
                            if (!arrayList2.isEmpty()) {
                                r52 = 0;
                                pxVar5.f((org.telegram.ui.Components.pz) arrayList2.get(0), 0);
                            }
                        }
                        r52 = 0;
                    }
                } else {
                    r52 = 0;
                    if (this.f44243z0.getVisibility() != 8) {
                        this.f44243z0.setIsEditing(false);
                        U4(false);
                        this.f44184n3 = false;
                        if (this.f44178m3) {
                            this.f44178m3 = false;
                            this.f44137e0[0].setTranslationX(0.0f);
                            this.f44137e0[1].setTranslationX(yxVarArr[0].getMeasuredWidth());
                        }
                        if (this.f44137e0[0].h != this.f44243z0.getDefaultTabId()) {
                            this.f44137e0[0].h = this.f44243z0.getDefaultTabId();
                            kw kwVar = this.f44137e0[0].d;
                            kwVar.h = 0;
                            kwVar.f();
                            yx yxVar = this.f44137e0[0];
                            yxVar.f43739s = this.R0;
                            yxVar.d.f();
                        }
                        this.f44137e0[1].setVisibility(8);
                        yx yxVar2 = this.f44137e0[1];
                        yxVar2.h = 0;
                        kw kwVar2 = yxVar2.d;
                        kwVar2.h = 0;
                        kwVar2.f();
                        yx yxVar3 = this.f44137e0[1];
                        yxVar3.f43739s = this.R0;
                        yxVar3.d.f();
                        this.f44234x = false;
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.Q3 == null) {
                                z12 = z11;
                            } else {
                                z12 = false;
                            }
                            if (!this.f44199q3) {
                                bVar.a(false, z12);
                            }
                        }
                        int i13 = 0;
                        while (true) {
                            yx[] yxVarArr3 = this.f44137e0;
                            if (i13 >= yxVarArr3.length) {
                                break;
                            }
                            yx yxVar4 = yxVarArr3[i13];
                            if (yxVar4.f43739s == 0 && yxVar4.f43740w == 2 && l4() && ((L0 = this.f44137e0[i13].f43735c.L0()) == 0 || L0 == 1)) {
                                this.f44137e0[i13].f43735c.h1(1, (int) this.N);
                            }
                            this.f44137e0[i13].f43733a.setScrollingTouchSlop(0);
                            this.f44137e0[i13].f43733a.requestLayout();
                            this.f44137e0[i13].requestLayout();
                            i13++;
                        }
                        this.f44243z0.L = -1;
                        r52 = 0;
                    }
                }
                f5(r52);
                int i14 = this.f44137e0[r52].f43739s;
                if ((i14 == 7 || i14 == 8) && (bpVar = getMessagesController().M[i14 - 7]) != null) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < S0.size()) {
                            org.telegram.messenger.bp bpVar3 = (org.telegram.messenger.bp) S0.get(i15);
                            if (bpVar3 != null && bpVar3.f15000a == bpVar.f15000a) {
                                break;
                            }
                            i15++;
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
        ww wwVar;
        if (!this.f44165j2 && (wwVar = this.F3) != null && wwVar.getFragment() != null) {
            return this.F3.getFragment().isLightStatusBar();
        }
        if (i0.b.h(getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final th.e5 j4() {
        return getMessagesController().O1();
    }

    public final void j5(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.j5(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    @Override
    public final hi.f k() {
        return this.f44172k4;
    }

    public final UndoView k4() {
        Z3();
        UndoView[] undoViewArr = this.f44240y0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.d(2, true);
            sx sxVar = (sx) this.fragmentView;
            sxVar.removeView(undoViewArr[0]);
            sxVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void k5() {
        float f7 = (((-this.f44147f4) - this.f44162i4) - this.f44219u1) - this.f44224v1;
        org.telegram.ui.Components.f10 f10Var = this.f44213t0;
        if (f10Var != null) {
            f10Var.setTranslationY(f7);
        }
        org.telegram.ui.Components.f10 f10Var2 = this.f44218u0;
        if (f10Var2 != null) {
            f10Var2.setTranslationY(f7 - org.telegram.messenger.i0.L(52.0f));
            vh.p2 p2Var = this.f44191p0;
            if (p2Var != null) {
                p2Var.setTranslationY(f7 - org.telegram.messenger.i0.L(52.0f));
            }
        }
    }

    public final boolean l4() {
        if (!this.f44174l2 && this.R0 == 0 && this.Y2 == 0 && this.W2 == 0) {
            org.telegram.messenger.wp messagesController = getMessagesController();
            messagesController.getClass();
            if (org.telegram.messenger.uz.f18545q1 && messagesController.Q.f(2305843009213693952L | 1) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void l5(boolean z10) {
        boolean z11;
        boolean z12 = this.f44174l2;
        if ((!z12 || this.R0 == 10) && this.W2 == 0 && this.Y2 == 0 && !this.inPreviewMode && ((!this.f44165j2 || z12) && !this.T3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.f10 f10Var = this.f44213t0;
        if (f10Var != null) {
            f10Var.e(z11, z10);
        }
        org.telegram.ui.Components.f10 f10Var2 = this.f44218u0;
        if (f10Var2 != null) {
            f10Var2.e(z11, z10);
        }
    }

    public final boolean m4() {
        ArrayList arrayList = this.D2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void m5(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        if (this.f44181n0 != null) {
            org.telegram.ui.ActionBar.t0 t0Var = this.m0;
            if (t0Var == null || t0Var.getVisibility() != 0) {
                boolean z13 = false;
                int i11 = 0;
                while (true) {
                    if (i11 < getDownloadController().G.size()) {
                        if (getFileLoader().T(((org.telegram.messenger.kj) getDownloadController().G.get(i11)).S0())) {
                            z12 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z12 = false;
                        break;
                    }
                }
                if (getDownloadController().I.size() <= 0 && !z12 && (this.f44148g0.getVisibility() != 0 || this.f44148g0.getAlpha() != 1.0f || z11)) {
                    this.f44158i0 = false;
                } else {
                    this.f44158i0 = true;
                }
                J3();
                boolean z14 = org.telegram.messenger.w0.f18945b.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i12 = this.f44134d2;
                if (i12 == 3 || i12 == 5) {
                    z13 = true;
                }
                org.telegram.ui.ActionBar.b1 b1Var = this.f44186o0;
                if (z14) {
                    if (z13) {
                        i10 = 2131748623;
                    } else {
                        i10 = 2131748622;
                    }
                } else {
                    i10 = 2131748621;
                }
                b1Var.setSubtext(org.telegram.messenger.dd.L0(i10, null));
                this.f44181n0.b(z14, z13, z10);
            }
        }
    }

    public final void n4(boolean z10) {
        int i10;
        boolean z11;
        this.actionBar.t();
        this.I2.clear();
        org.telegram.ui.ActionBar.c2 c2Var = this.f44138e1;
        boolean z12 = true;
        if (c2Var != null) {
            c2Var.c(true, 0.0f);
        }
        px pxVar = this.f44243z0;
        if (pxVar != null) {
            pxVar.b(org.telegram.ui.ActionBar.t6.K8, org.telegram.ui.ActionBar.t6.I8, org.telegram.ui.ActionBar.t6.J8, org.telegram.ui.ActionBar.t6.L8, org.telegram.ui.ActionBar.t6.f20930d6);
        }
        ValueAnimator valueAnimator = this.f44226v3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f44226v3 = null;
        }
        if (this.f44221u3 == 0.0f) {
            return;
        }
        O4(-f4());
        boolean z13 = false;
        int i11 = 0;
        while (true) {
            yx[] yxVarArr = this.f44137e0;
            if (i11 >= yxVarArr.length) {
                break;
            }
            yx yxVar = yxVarArr[i11];
            if (yxVar != null) {
                yxVar.f43733a.I0(true);
            }
            i11++;
        }
        if (this.K) {
            i10 = 81;
        } else {
            i10 = 0;
        }
        float max = Math.max(0.0f, org.telegram.messenger.i0.L(i10 + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f44221u3, 0.0f);
        this.f44226v3 = ofFloat;
        ofFloat.addUpdateListener(new iv(this, max, 1));
        this.f44226v3.addListener(new ex(this, max, 0));
        this.f44226v3.setInterpolator(org.telegram.ui.Components.gr.f26523f);
        this.f44226v3.setDuration(200L);
        this.f44226v3.start();
        this.Y0 = false;
        ArrayList arrayList = this.f44117a1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                org.telegram.messenger.bp bpVar = (org.telegram.messenger.bp) arrayList.get(i12);
                h00.z0(bpVar, bpVar.f15004g, bpVar.f15001b, bpVar.f15002c, bpVar.f15010n, bpVar.f15009m, bpVar.h, bpVar.f15005i, bpVar.f15006j, false, false, true, true, false, this, null);
                i12++;
                arrayList = arrayList;
                size = size;
                z13 = false;
                z12 = true;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.Z0) {
            getMessagesController().j4(this.W2, 0L, null);
            z11 = 0;
            this.Z0 = false;
        } else {
            z11 = 0;
        }
        f5(true);
        if (this.f44137e0 != null) {
            int i13 = z11;
            while (true) {
                yx[] yxVarArr2 = this.f44137e0;
                if (i13 >= yxVarArr2.length) {
                    break;
                }
                yxVarArr2[i13].d.H = z11;
                i13++;
            }
        }
        int i14 = org.telegram.messenger.wp.D8;
        int i15 = z11;
        if (z10) {
            i15 = 8192;
        }
        u5(i15 | 196608, true);
    }

    public final void n5() {
        int i10;
        int i11;
        if (this.f44211s3 && this.actionBar != null) {
            if (this.W2 == 0 && this.Y2 == 0) {
                i10 = org.telegram.ui.ActionBar.t6.f21262v8;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.O8;
            }
            int themedColor = getThemedColor(i10);
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.t6.f21314y8;
            lVar.D(i0.b.f(this.f44236x1, themedColor, getThemedColor(i12)), false);
            this.actionBar.D(i0.b.f(this.f44236x1, getThemedColor(i12), getThemedColor(i12)), true);
            if (this.W2 == 0 && this.Y2 == 0) {
                i11 = org.telegram.ui.ActionBar.t6.f21226t8;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.N8;
            }
            int themedColor2 = getThemedColor(i11);
            this.actionBar.C(i0.b.f(this.f44236x1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.t6.f21333z8)), false);
        }
    }

    public final void o4(boolean z10) {
        if (this.F3.c()) {
            z10 = true;
        }
        if (!z10 || !this.f44123b2) {
            this.T3 = z10;
            l5(true);
            if (z10) {
                vh.p2 p2Var = this.f44191p0;
                if (p2Var != null) {
                    p2Var.e(true);
                }
                vh.p2 p2Var2 = this.f44196q0;
                if (p2Var2 != null) {
                    p2Var2.e(true);
                }
            }
        }
    }

    public final void o5() {
        org.telegram.ui.Components.tp0 tp0Var;
        int i10;
        nw nwVar = this.B1;
        ArrayList arrayList = this.I2;
        if (nwVar != null) {
            this.f44180n.a(!arrayList.isEmpty(), true);
            p5();
            if (arrayList.isEmpty()) {
                if (this.R0 == 3 && this.f44145f2 == null) {
                    i10 = 2131750577;
                } else {
                    i10 = 2131745686;
                }
                String L0 = org.telegram.messenger.dd.L0(i10, null);
                if (this.P3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(L0);
                } else {
                    this.actionBar.K(L0, true, 350L, org.telegram.ui.Components.gr.h);
                }
                if (this.B1.getTag() != null) {
                    this.B1.j0(false, false, false);
                    this.B1.K();
                    this.B1.setTag(null);
                    this.fragmentView.requestLayout();
                }
            } else {
                if (this.B1.getTag() == null) {
                    if (!m4() && this.E2 == null) {
                        this.B1.setFieldText("");
                    }
                    this.B1.setTag(1);
                    if (!this.V3 && (tp0Var = this.G2) != null) {
                        this.V3 = true;
                        String L02 = org.telegram.messenger.dd.L0(2131745447, null);
                        tp0Var.j();
                        tp0Var.F = L02;
                        org.telegram.ui.Components.rp0 rp0Var = tp0Var.f30690a[0];
                        if (L02 != null) {
                            ((org.telegram.ui.ActionBar.u5) rp0Var.h).l(L02, false);
                        }
                        org.telegram.ui.Components.vo0 vo0Var = new org.telegram.ui.Components.vo0(tp0Var, 1);
                        tp0Var.G = vo0Var;
                        org.telegram.messenger.i0.h3(vo0Var, 1000L);
                    }
                }
                this.C1.g(Math.max(1, arrayList.size()), true);
                int i11 = this.S0 + (!TextUtils.isEmpty(this.B1.getFieldText()) ? 1 : 0);
                int size = arrayList.size();
                int i12 = 0;
                long j10 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    long longValue = ((Long) obj).longValue();
                    long M1 = getMessagesController().M1(longValue);
                    if (M1 <= 0 && longValue > 0) {
                        M1 = org.telegram.messenger.o5.k(getMessagesController().H2(longValue));
                    }
                    j10 += M1;
                }
                this.C1.i(i11, j10, true);
                this.B1.Q1();
                if (this.P3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(org.telegram.messenger.dd.G(arrayList.size(), "Recipient", new Object[0]));
                } else {
                    this.actionBar.K(org.telegram.messenger.dd.G(arrayList.size(), "Recipient", new Object[0]), false, 350L, org.telegram.ui.Components.gr.h);
                }
            }
            this.P3 = arrayList.isEmpty();
        } else if (this.R0 == 10) {
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
        } else if (this.F3.c() && this.F3.getFragment().onBackPressed(z10)) {
            if (z10) {
                this.F3.a();
                jx jxVar = this.C0;
                if (jxVar != null) {
                    jxVar.S();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.z60 z60Var = this.L0;
            if (z60Var != null) {
                if (z10) {
                    z60Var.u();
                    this.L0 = null;
                    return false;
                }
            } else {
                px pxVar = this.f44243z0;
                if (pxVar != null && pxVar.f30763n) {
                    if (z10) {
                        pxVar.setIsEditing(false);
                        U4(false);
                        return false;
                    }
                } else {
                    org.telegram.ui.ActionBar.l lVar = this.actionBar;
                    if (lVar != null && lVar.u()) {
                        if (z10) {
                            jx jxVar2 = this.C0;
                            if (jxVar2 != null && jxVar2.getVisibility() == 0) {
                                this.C0.R(false);
                            }
                            n4(true);
                            return false;
                        }
                    } else if (this.f44120b.f7022f) {
                        if (z10) {
                            this.X.f26635r.getText().clear();
                            this.Y.b(false);
                            this.X.f26635r.clearFocus();
                            return false;
                        }
                    } else {
                        px pxVar2 = this.f44243z0;
                        if (pxVar2 != null && pxVar2.getVisibility() == 0 && !this.f44156h3) {
                            px pxVar3 = this.f44243z0;
                            if (!pxVar3.O && !this.f44178m3) {
                                ArrayList arrayList = pxVar3.h;
                                if (!arrayList.isEmpty() && pxVar3.L != ((org.telegram.ui.Components.pz) arrayList.get(0)).f29572a) {
                                    if (z10) {
                                        px pxVar4 = this.f44243z0;
                                        ArrayList arrayList2 = pxVar4.h;
                                        if (!arrayList2.isEmpty()) {
                                            pxVar4.f((org.telegram.ui.Components.pz) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        nw nwVar = this.B1;
                        if (nwVar != null && nwVar.q0()) {
                            if (z10) {
                                this.B1.i0(true);
                            }
                        } else {
                            tw twVar = this.E0;
                            if (twVar.O == 0 && twVar.S.L0() != 0) {
                                twVar.h.y0(0);
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
        bi.t0 t0Var;
        px pxVar;
        if (this.V1) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.k(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                jx jxVar = this.C0;
                if (jxVar != null) {
                    jxVar.f26872d0.Q(this.W1, tLObject);
                }
                this.X1 = null;
            }
            this.V1 = false;
        }
        if (!this.K && (pxVar = this.f44243z0) != null && pxVar.getVisibility() == 0 && this.f44201r.f7022f) {
            int i10 = (int) (-this.N);
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.f44137e0[0].f43733a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f44240y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        if (!isInPreviewMode() && (t0Var = this.K0) != null && t0Var.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        N3();
        this.f44202r0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        vh.p2 p2Var;
        super.onBecomeFullyVisible();
        if (q4()) {
            SharedPreferences d12 = org.telegram.messenger.wp.d1();
            boolean z10 = d12.getBoolean("archivehint", true);
            boolean isEmpty = d4(this.currentAccount, this.R0, this.W2, false).isEmpty();
            if (z10 && isEmpty) {
                org.telegram.messenger.wp.d1().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                d12.edit().putBoolean("archivehint", false).commit();
                S4();
            }
        }
        if (this.f44202r0 && !this.f44208s0 && (p2Var = this.f44191p0) != null && this.N3) {
            this.f44208s0 = true;
            this.f44202r0 = false;
            p2Var.u();
        }
        org.telegram.messenger.i0.h3(new ev(this, 20), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.z60 z60Var = this.L0;
        if (z60Var != null) {
            z60Var.u();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.x1 x1Var;
        super.onDialogDismiss(dialog);
        if (this.W2 == 0 && this.Y2 == 0 && (x1Var = this.T1) != null && dialog == x1Var && getParentActivity() != null) {
            u3(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10;
        boolean z10;
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        int i11 = 0;
        if (bundle != null) {
            this.f44174l2 = bundle.getBoolean("onlySelect", false);
            this.f44177m2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f44198q2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.R0 = this.arguments.getInt("dialogsType", 0);
            this.O0 = this.arguments.getBoolean("quote", false);
            this.N0 = this.arguments.getBoolean("reply_to", false);
            this.P0 = this.arguments.getLong("reply_to_author", 0L);
            this.Q0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f44145f2 = this.arguments.getString("selectAlertString");
            this.f44150g2 = this.arguments.getString("selectAlertStringGroup");
            this.f44155h2 = this.arguments.getString("addToGroupAlertString");
            this.f44204r2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f44210s2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f44215t2 = this.arguments.getBoolean("afterSignup", false);
            this.W2 = this.arguments.getInt("folderId", 0);
            long j10 = this.arguments.getLong("community_id", 0L);
            this.Y2 = j10;
            if (j10 != 0) {
                this.Z2 = getMessagesController().L0(Long.valueOf(this.Y2));
                this.f44118a3 = getMessagesController().M0(this.Y2);
            }
            this.f44160i2 = this.arguments.getBoolean("resetDelegate", true);
            this.S0 = this.arguments.getInt("messagesCount", 0);
            this.T0 = this.arguments.getInt("hasPoll", 0);
            this.U0 = this.arguments.getBoolean("hasInvoice", false);
            this.f44220u2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f44220u2);
            this.arguments.getInt("otherwiseRelogin");
            this.f44225v2 = this.arguments.getBoolean("allowGroups", true);
            this.f44231w2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f44237x2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.f44242y2 = this.arguments.getBoolean("allowChannels", true);
            this.f44245z2 = this.arguments.getBoolean("allowUsers", true);
            this.A2 = this.arguments.getBoolean("allowBots", true);
            this.B2 = this.arguments.getBoolean("closeFragment", true);
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
        if (this.R0 == 0) {
            this.U1 = org.telegram.messenger.wp.e1().getBoolean("askAboutContacts", true);
            org.telegram.messenger.uz.u();
        }
        org.telegram.messenger.at notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        this.J3 = new xa.n(notificationCenter, this);
        if (this.f44183n2 == null) {
            this.f44134d2 = getConnectionsManager().getConnectionState();
            this.J3.h(org.telegram.messenger.at.f14726i4);
            if (!this.f44174l2) {
                this.J3.h(org.telegram.messenger.at.I4);
                this.J3.h(org.telegram.messenger.at.A4);
                this.J3.e(org.telegram.messenger.at.P2);
                this.J3.e(org.telegram.messenger.at.f14694d2);
            }
            xa.n nVar = this.J3;
            nVar.e(org.telegram.messenger.at.f14779s);
            nVar.e(org.telegram.messenger.at.O2);
            nVar.e(org.telegram.messenger.at.f14772r);
            nVar.e(org.telegram.messenger.at.Y);
            nVar.e(org.telegram.messenger.at.O);
            nVar.e(org.telegram.messenger.at.I2);
            nVar.e(org.telegram.messenger.at.f14716h0);
            nVar.e(org.telegram.messenger.at.f14704f0);
            nVar.e(org.telegram.messenger.at.J);
            nVar.e(org.telegram.messenger.at.K);
            nVar.e(org.telegram.messenger.at.M);
            nVar.e(org.telegram.messenger.at.P0);
            nVar.e(org.telegram.messenger.at.f14780s0);
            nVar.e(org.telegram.messenger.at.f14771q5);
            nVar.e(org.telegram.messenger.at.S0);
            nVar.e(org.telegram.messenger.at.T1);
            nVar.e(org.telegram.messenger.at.f14685b5);
            nVar.e(org.telegram.messenger.at.K2);
            nVar.e(org.telegram.messenger.at.f14692d0);
            nVar.e(org.telegram.messenger.at.f14781s1);
            nVar.e(org.telegram.messenger.at.Y4);
            nVar.e(org.telegram.messenger.at.Z4);
            nVar.e(org.telegram.messenger.at.N);
            nVar.e(org.telegram.messenger.at.f14748m5);
            nVar.e(org.telegram.messenger.at.f14709f5);
            this.J3.h(org.telegram.messenger.at.f14749n0);
        }
        xa.n nVar2 = this.J3;
        nVar2.e(org.telegram.messenger.at.f14806w);
        nVar2.e(org.telegram.messenger.at.S4);
        nVar2.e(org.telegram.messenger.at.f14679a5);
        nVar2.e(org.telegram.messenger.at.T);
        nVar2.e(org.telegram.messenger.at.L4);
        nVar2.e(org.telegram.messenger.at.f14792t5);
        nVar2.e(org.telegram.messenger.at.f14805v5);
        nVar2.e(org.telegram.messenger.at.Z2);
        nVar2.e(org.telegram.messenger.at.f14695d3);
        nVar2.e(org.telegram.messenger.at.f14715g5);
        nVar2.e(org.telegram.messenger.at.y3);
        nVar2.e(org.telegram.messenger.at.A3);
        nVar2.e(org.telegram.messenger.at.S5);
        nVar2.e(org.telegram.messenger.at.T5);
        nVar2.e(org.telegram.messenger.at.P3);
        nVar2.e(org.telegram.messenger.at.Q3);
        if (this.R0 == 0) {
            this.J3.e(org.telegram.messenger.at.f14832z5);
            this.J3.e(org.telegram.messenger.at.P1);
        }
        u4(getAccountInstance());
        th.e5 O1 = getMessagesController().O1();
        if (!O1.A) {
            O1.W();
            if (!O1.f48933s) {
                ConnectionsManager.getInstance(O1.f48918a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new th.i4(O1, 0));
            }
        }
        getMessagesController().Z2(this.W2);
        if (this.Q3 != null && !getMessagesStorage().Q) {
            nu nuVar = this.Q3;
            if (nuVar.getParent() != null) {
                ((ViewGroup) nuVar.getParent()).removeView(nuVar);
            }
            this.Q3 = null;
        }
        if (q4()) {
            th.e5 O12 = getMessagesController().O1();
            if (O12.f48939z) {
                O12.T(true);
            }
        } else {
            getMessagesController().O1().W();
        }
        getContactsController().B();
        if (getMessagesController().f19215p6) {
            org.telegram.messenger.hw F1 = getMessagesController().F1();
            if (!F1.e) {
                F1.g(true);
            }
        }
        if (this.Y2 != 0) {
            getMessagesController().T2(0, this.Y2, true);
        }
        org.telegram.messenger.y1 a2 = org.telegram.messenger.y1.a(this.currentAccount);
        if (!a2.e) {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = a2.f19518b;
            if (j11 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                long j12 = currentTimeMillis - j11;
                boolean z11 = org.telegram.messenger.v2.f18578a;
                if (j12 > 43200000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(a2.f19518b);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(currentTimeMillis);
                if (calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            if (z10) {
                a2.e = true;
                ConnectionsManager.getInstance(a2.f19517a).sendRequest(new TL_account.getBirthdays(), new org.telegram.messenger.v1(a2, 0));
            }
        }
        if (this.W) {
            i10 = org.telegram.messenger.i0.L(72.0f);
        } else {
            i10 = 0;
        }
        this.f44157h4 = i10;
        if (this.W) {
            i11 = org.telegram.messenger.i0.L(64.0f);
        }
        this.f44162i4 = i11;
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        xa.n nVar = this.J3;
        if (nVar != null) {
            nVar.a();
            this.J3 = null;
        }
        nw nwVar = this.B1;
        if (nwVar != null) {
            nwVar.z0();
        }
        org.telegram.ui.Components.tp0 tp0Var = this.G2;
        if (tp0Var != null) {
            tp0Var.j();
        }
        org.telegram.ui.Components.voip.u uVar = this.H2;
        if (uVar != null) {
            org.telegram.messenger.i0.r(uVar);
            this.H2 = null;
        }
        UndoView undoView = this.f44240y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f44194p3.e();
        this.C2 = null;
        int i10 = org.telegram.ui.Components.t10.f30487i1;
    }

    @Override
    public final void onPanTranslationUpdate(float f7) {
        if (this.f44137e0 != null) {
            this.J0 = f7;
            nw nwVar = this.B1;
            int i10 = 0;
            if (nwVar != null && nwVar.q0()) {
                this.fragmentView.setTranslationY(f7);
                while (true) {
                    yx[] yxVarArr = this.f44137e0;
                    if (i10 >= yxVarArr.length) {
                        break;
                    }
                    yxVarArr[i10].setTranslationY(0.0f);
                    i10++;
                }
                if (!this.f44174l2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.wb wbVar = this.f44189o3;
                    if (wbVar != null) {
                        wbVar.l();
                    }
                }
                jx jxVar = this.C0;
                if (jxVar != null) {
                    jxVar.setTranslationY(this.I0);
                    return;
                }
                return;
            }
            while (true) {
                yx[] yxVarArr2 = this.f44137e0;
                if (i10 >= yxVarArr2.length) {
                    break;
                }
                yxVarArr2[i10].setTranslationY(f7);
                i10++;
            }
            if (!this.f44174l2) {
                this.actionBar.setTranslationY(f7);
                org.telegram.ui.Components.wb wbVar2 = this.f44189o3;
                if (wbVar2 != null) {
                    wbVar2.l();
                }
            }
            jx jxVar2 = this.C0;
            if (jxVar2 != null) {
                jxVar2.setTranslationY(this.J0 + this.I0);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.wb wbVar = this.S;
        if (wbVar != null) {
            wbVar.b();
            this.S = null;
        }
        ww wwVar = this.F3;
        if (wwVar != null) {
            wwVar.f38627r = true;
            dx dxVar = wwVar.f38622a;
            if (dxVar != null) {
                dxVar.onPause();
            }
        }
        org.telegram.ui.Components.z60 z60Var = this.L0;
        if (z60Var != null) {
            z60Var.u();
        }
        nw nwVar = this.B1;
        if (nwVar != null) {
            nwVar.B0();
        }
        int i10 = 0;
        UndoView undoView = this.f44240y0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        setBulletinDelegate(null);
        if (this.f44137e0 == null) {
            return;
        }
        while (true) {
            yx[] yxVarArr = this.f44137e0;
            if (i10 < yxVarArr.length) {
                yxVarArr[i10].d.getClass();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.messenger.i9 i9Var;
        if (i10 == 1) {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (iArr.length > i11) {
                    String str = strArr[i11];
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
                            if (iArr[i11] == 0) {
                                org.telegram.messenger.pt.t(this.currentAccount).Y();
                                break;
                            } else {
                                hi0.I0();
                                continue;
                            }
                        case 1:
                            if (iArr[i11] == 0) {
                                org.telegram.messenger.ic.D().i(null);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (iArr[i11] == 0) {
                                org.telegram.messenger.i0.g3(new ev(this, 19));
                                getContactsController().l();
                                continue;
                            } else {
                                SharedPreferences.Editor edit = org.telegram.messenger.wp.e1().edit();
                                this.U1 = false;
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
        } else if (i10 == 4) {
            for (int i12 : iArr) {
                if (i12 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 30 && (i9Var = FilesMigrationService.e) != null) {
                i9Var.I0();
            }
        }
    }

    @Override
    public final void onResume() {
        boolean z10;
        yx yxVar;
        kw kwVar;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.Components.an0 an0Var;
        bi.t0 t0Var;
        super.onResume();
        tw twVar = this.E0;
        char c10 = 0;
        if (twVar != null) {
            ArrayList arrayList = twVar.f49241y;
            th.e5 e5Var = twVar.f49232s;
            e5Var.l(e5Var.f48922g);
            e5Var.l(e5Var.h);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.PeerStories y3 = e5Var.y(((th.j) arrayList.get(i10)).f49092c);
                if (y3 != null) {
                    e5Var.a0(y3);
                }
            }
        }
        ww wwVar = this.F3;
        if (wwVar != null) {
            wwVar.f38627r = false;
            dx dxVar = wwVar.f38622a;
            if (dxVar != null) {
                dxVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).x() && (t0Var = this.K0) != null && t0Var.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.f44137e0 != null) {
            int i11 = 0;
            while (true) {
                yx[] yxVarArr = this.f44137e0;
                if (i11 >= yxVarArr.length) {
                    break;
                }
                yxVarArr[i11].d.f();
                i11++;
            }
        }
        nw nwVar = this.B1;
        if (nwVar != null) {
            nwVar.C0();
        }
        long j10 = 0;
        if (!this.f44174l2 && this.W2 == 0 && this.Y2 == 0) {
            getMediaDataController().B(4);
        }
        jx jxVar = this.C0;
        if (jxVar != null && (an0Var = jxVar.f26872d0) != null) {
            an0Var.f();
        }
        if (!this.f44215t2 && getUserConfig().Z != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.W2 == 0 && this.Y2 == 0 && this.f44129c2 && !this.f44174l2) {
            int i12 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.f44129c2 = false;
                if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i12 <= 28 || org.telegram.messenger.v2.f18579b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i12 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                org.telegram.messenger.m4 m4Var = new org.telegram.messenger.m4(this, z13, z11, z12, parentActivity);
                if (this.f44215t2 && (z11 || z13)) {
                    j10 = 4000;
                }
                org.telegram.messenger.i0.h3(m4Var, j10);
            }
        } else if (!this.f44174l2 && this.W2 == 0 && this.Y2 == 0 && org.telegram.messenger.d6.i() && !org.telegram.messenger.d6.f()) {
            if (getParentActivity() != null) {
                if (!org.telegram.messenger.wp.e1().getBoolean("askedAboutMiuiLockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i13 = org.telegram.ui.ActionBar.t6.L5;
                    alertDialog$Builder.m(2131624113, 72, getThemedColor(i13), null);
                    alertDialog$Builder.n(i13, getResourceProvider());
                    String L0 = org.telegram.messenger.dd.L0(2131747314, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.T = L0;
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747316, null), new hv(this, 10));
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131751772, null), new org.telegram.ui.Components.a21(8));
                    showDialog(x1Var);
                }
            } else {
                return;
            }
        } else if (this.W2 == 0 && this.Y2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
            if (getParentActivity() != null) {
                if (!org.telegram.messenger.wp.e1().getBoolean("askedAboutFSILockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    int i14 = org.telegram.ui.ActionBar.t6.L5;
                    alertDialog$Builder2.m(2131624113, 72, getThemedColor(i14), null);
                    alertDialog$Builder2.n(i14, getResourceProvider());
                    String L02 = org.telegram.messenger.dd.L0(2131747330, null);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                    x1Var2.T = L02;
                    alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131747316, null), new hv(this, 11));
                    alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131751772, null), new org.telegram.ui.Components.a21(9));
                    showDialog(x1Var2);
                }
            } else {
                return;
            }
        }
        V4();
        if (this.f44137e0 != null) {
            int i15 = 0;
            while (true) {
                yx[] yxVarArr2 = this.f44137e0;
                if (i15 >= yxVarArr2.length) {
                    break;
                }
                yx yxVar2 = yxVarArr2[i15];
                if (yxVar2.f43739s == 0 && yxVar2.f43740w == 2 && yxVar2.f43735c.L0() == 0 && l4()) {
                    this.f44137e0[i15].f43735c.h1(1, (int) this.N);
                }
                if (i15 == 0) {
                    this.f44137e0[i15].d.getClass();
                } else {
                    this.f44137e0[i15].d.getClass();
                }
                i15++;
            }
        }
        X4();
        setBulletinDelegate(new z8(this, 4));
        if (this.f44199q3) {
            org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        }
        u5(0, false);
        m5(false, true);
        t5(false);
        D3();
        N3();
        if (this.f44243z0 != null && (yxVar = this.f44137e0[0]) != null && (kwVar = yxVar.d) != null) {
            int i16 = kwVar.h;
            if (i16 == 7 || i16 == 8) {
                org.telegram.messenger.bp[] bpVarArr = getMessagesController().M;
                if (i16 != 7) {
                    c10 = 1;
                }
                org.telegram.messenger.bp bpVar = bpVarArr[c10];
                if (bpVar != null) {
                    this.f44243z0.h(bpVar.f15011o);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f7) {
        if (org.telegram.messenger.uz.o() <= 0) {
            boolean z11 = org.telegram.messenger.v2.f18578a;
        } else if (this.Y3 && this.Z3 == null) {
            R4(f7);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f44144f1.setColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
            y3();
            h5();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        bi.t0 t0Var;
        zx zxVar;
        ww wwVar = this.F3;
        if (wwVar != null && wwVar.c()) {
            this.F3.getFragment().onTransitionAnimationEnd(z10, z11);
        } else {
            if (z10 && (t0Var = this.K0) != null && t0Var.getVisibility() == 0) {
                this.K0.setVisibility(8);
                this.K0.setBackground(null);
            }
            if (z10 && this.f44215t2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f33398x0.c(false);
                }
            }
        }
        if (!z10 && (zxVar = this.X2) != null) {
            zxVar.removeSelfFromStack();
        }
        N3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        ww wwVar = this.F3;
        if (wwVar != null && wwVar.c()) {
            this.F3.getFragment().onTransitionAnimationProgress(z10, f7);
        } else {
            bi.t0 t0Var = this.K0;
            if (t0Var != null && t0Var.getVisibility() == 0) {
                if (z10) {
                    this.K0.setAlpha(1.0f - f7);
                } else {
                    this.K0.setAlpha(f7);
                }
            }
        }
        N3();
    }

    public final void p5() {
        org.telegram.ui.Components.tp0 tp0Var = this.G2;
        if (tp0Var != null) {
            int i10 = this.currentAccount;
            tp0Var.h(i10);
            tp0Var.d = org.telegram.messenger.e20.i(org.telegram.messenger.c.a(i10).f15043a).e();
            ArrayList arrayList = tp0Var.f30693f;
            arrayList.clear();
            ArrayList arrayList2 = this.I2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            org.telegram.ui.Components.rp0 rp0Var = tp0Var.f30690a[0];
            if (tp0Var.f30691b == 1) {
                ((org.telegram.ui.ActionBar.u5) rp0Var.f30059f).l(tp0Var.c(rp0Var), false);
            }
        }
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.Y3 = true;
            N4(true);
            return;
        }
        this.Z3 = null;
        this.Y3 = false;
        N4(false);
        R4(1.0f);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.k2 k2Var) {
        boolean presentFragment = super.presentFragment(k2Var);
        if (presentFragment && this.f44137e0 != null) {
            int i10 = 0;
            while (true) {
                yx[] yxVarArr = this.f44137e0;
                if (i10 >= yxVarArr.length) {
                    break;
                }
                yxVarArr[i10].d.getClass();
                i10++;
            }
        }
        vh.p2 p2Var = this.f44191p0;
        if (p2Var != null) {
            p2Var.e(true);
        }
        vh.p2 p2Var2 = this.f44196q0;
        if (p2Var2 != null) {
            p2Var2.e(true);
        }
        org.telegram.ui.Components.wb.e();
        return presentFragment;
    }

    public final boolean q4() {
        if (this.W2 == 1) {
            return true;
        }
        return false;
    }

    public final void q5(boolean z10) {
        boolean z11;
        if (this.f44173l0 == null) {
            return;
        }
        ArrayList arrayList = getDownloadController().G;
        int size = arrayList.size();
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) obj;
                if (kjVar.F0() != null && kjVar.F0().size >= 157286400) {
                    z11 = true;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        ArrayList arrayList2 = getDownloadController().H;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i11);
            i11++;
            org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) obj2;
            if (kjVar2.F0() != null && kjVar2.F0().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        if (!getUserConfig().q() && !getMessagesController().A3() && z11 && z10) {
            z12 = true;
        }
        this.d.a(z12, true);
    }

    public final boolean r4(long j10) {
        if (j10 < 0) {
            return false;
        }
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j10));
        if (!org.telegram.messenger.i20.u(Z1)) {
            return false;
        }
        ArrayList l4 = org.telegram.messenger.wp.r1(this.currentAccount).f19234r7.l(-Z1.f19943id);
        if ((l4 != null && !l4.isEmpty()) || !org.telegram.messenger.wp.r1(this.currentAccount).f19234r7.e(-Z1.f19943id)) {
            return false;
        }
        return true;
    }

    public final void r5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.d5 d5Var;
        org.telegram.ui.ActionBar.p6 p6Var;
        tw twVar = this.E0;
        org.telegram.ui.Components.d5 d5Var2 = null;
        if (twVar != null && (d5Var = twVar.f49210a0) != null && twVar.f49229q0 != null) {
            Long h = org.telegram.messenger.i20.h(user);
            if (h != null) {
                d5Var.j(h.longValue(), z10);
                d5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z10);
            } else {
                if (user != null) {
                    org.telegram.messenger.wp.r1(twVar.f49217f);
                    if (org.telegram.messenger.wp.A2(user)) {
                        if (twVar.N0 == null) {
                            twVar.N0 = twVar.getContext().getResources().getDrawable(2131232306).mutate();
                            twVar.N0 = new org.telegram.ui.Components.e5(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), twVar.N0);
                        }
                        Drawable drawable = twVar.N0;
                        int i10 = org.telegram.ui.ActionBar.t6.ni;
                        zx zxVar = twVar.f49216e0;
                        if (zxVar != null) {
                            p6Var = zxVar.getResourceProvider();
                        } else {
                            p6Var = null;
                        }
                        org.telegram.ui.ActionBar.a7.y(twVar, drawable, i10, p6Var, PorterDuff.Mode.MULTIPLY);
                        d5Var.g(twVar.N0, z10);
                        d5Var.m(false, z10);
                    }
                }
                d5Var.g(null, z10);
                d5Var.m(false, z10);
            }
            d5Var.k(Integer.valueOf(twVar.f(org.telegram.ui.ActionBar.t6.ni)));
            twVar.W.invalidate();
        }
        if (this.D3 != null && this.actionBar != null) {
            Long h10 = org.telegram.messenger.i20.h(user);
            this.B3 = null;
            if (h10 != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                this.D3.j(h10.longValue(), z10);
                this.D3.m(z11, z10);
                if (z11) {
                    this.B3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
                }
                this.actionBar.setRightDrawableOnClick(new gv(this, 1));
                g31.t(this.currentAccount);
            } else {
                if (user != null) {
                    org.telegram.messenger.wp.r1(this.currentAccount);
                    if (org.telegram.messenger.wp.A2(user)) {
                        if (this.K3 == null) {
                            this.K3 = getParentActivity().getResources().getDrawable(2131232306).mutate();
                            this.K3 = new org.telegram.ui.Components.e5(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), this.K3);
                        }
                        Drawable drawable2 = this.K3;
                        int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.ni);
                        this.f44233w4 = themedColor;
                        drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                        this.D3.g(this.K3, z10);
                        this.D3.m(false, z10);
                        this.actionBar.setRightDrawableOnClick(new gv(this, 2));
                        g31.t(this.currentAccount);
                    }
                }
                this.D3.g(null, z10);
                this.D3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.d5 d5Var3 = this.D3;
            int i11 = org.telegram.ui.ActionBar.t6.ni;
            d5Var3.k(Integer.valueOf(getThemedColor(i11)));
            org.telegram.ui.Cells.n nVar = this.E3;
            if (nVar != null) {
                nVar.setColor(getThemedColor(i11));
            }
            yw ywVar = this.M0;
            if (ywVar != null && (ywVar.getContentView() instanceof g31)) {
                org.telegram.ui.ActionBar.u5 titleTextView = this.actionBar.getTitleTextView();
                g31 g31Var = (g31) this.M0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.d5 d5Var4 = this.D3;
                    if (rightDrawable == d5Var4) {
                        d5Var2 = d5Var4;
                    }
                }
                g31Var.y(d5Var2, titleTextView);
            }
        }
    }

    public final boolean s3(long j10, View view) {
        if (this.f44174l2 && getMessagesController().s2(j10)) {
            return false;
        }
        Long valueOf = Long.valueOf(j10);
        ArrayList arrayList = this.I2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j10));
            if (view instanceof org.telegram.ui.Cells.v2) {
                ((org.telegram.ui.Cells.v2) view).c0(false, true);
            } else if (view instanceof org.telegram.ui.Cells.k6) {
                ((org.telegram.ui.Cells.k6) view).y(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j10));
        if (view instanceof org.telegram.ui.Cells.v2) {
            ((org.telegram.ui.Cells.v2) view).c0(true, true);
        } else if (view instanceof org.telegram.ui.Cells.k6) {
            ((org.telegram.ui.Cells.k6) view).y(true, true);
        }
        return true;
    }

    public final boolean s4(TLRPC.Dialog dialog) {
        char c10;
        if (dialog == null) {
            return false;
        }
        int i10 = this.f44137e0[0].f43739s;
        org.telegram.messenger.bp bpVar = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.u() || this.actionBar.w(null))) {
            org.telegram.messenger.bp[] bpVarArr = getMessagesController().M;
            if (this.f44137e0[0].f43739s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            bpVar = bpVarArr[c10];
        }
        if (bpVar != null) {
            if (bpVar.f15006j.indexOfKey(dialog.f19798id) < 0) {
                return false;
            }
            return true;
        }
        return dialog.pinned;
    }

    public final void s5() {
        vh.p2 p2Var;
        boolean T4 = getMessagesController().T4();
        if (this.N3 != T4) {
            k5();
            if (!this.N3 && T4 && (p2Var = this.f44191p0) != null) {
                p2Var.u();
            }
            this.N3 = T4;
        }
        org.telegram.ui.Components.f10 f10Var = this.f44213t0;
        if (f10Var == null) {
            return;
        }
        if (this.R0 == 10) {
            f10Var.setImageResource(2131231195);
            this.f44213t0.setContentDescription(org.telegram.messenger.dd.L0(2131751355, null));
            return;
        }
        f10Var.setImageResource(2131231107);
        this.f44213t0.setContentDescription(org.telegram.messenger.dd.L0(2131748287, null));
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        tw twVar = this.E0;
        if (twVar != null) {
            if (this.G0 && !z10) {
                twVar.setVisibility(0);
            } else {
                twVar.setVisibility(8);
            }
        }
        l5(true);
        g5();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r6, int r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    public final void t3(zf.e0 e0Var) {
        jx jxVar;
        if (this.f44199q3 && (jxVar = this.C0) != null) {
            ArrayList arrayList = jxVar.C0;
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (e0Var.b((zf.e0) arrayList.get(i10))) {
                        return;
                    }
                }
            }
            arrayList.add(e0Var);
            ox oxVar = this.X;
            ArrayList arrayList2 = oxVar.F;
            arrayList2.add(e0Var);
            oxVar.I = arrayList2.size() - 1;
            oxVar.e();
            this.X.f26635r.getText().clear();
            j5(true, null, null, false, true);
        }
    }

    public final boolean t4() {
        if (this.C2 == null && this.f44183n2 == null) {
            return true;
        }
        return false;
    }

    public final void t5(boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        boolean z11;
        boolean z12;
        th.e5 j42;
        ArrayList arrayList;
        boolean z13;
        boolean z14;
        int i10;
        float f7;
        float f10;
        if (this.E0 != null && this.I == null) {
            ww wwVar = this.F3;
            if ((wwVar == null || !wwVar.c()) && !this.f44199q3 && (lVar = this.actionBar) != null && !lVar.u() && !this.f44174l2) {
                vh.o8 o8Var = vh.o8.F2;
                int i11 = 0;
                if ((o8Var != null && o8Var.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
                    z10 = false;
                }
                if (!q4() && j4().I()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.Y2 != 0) {
                    z12 = false;
                } else if (q4()) {
                    z12 = !j4().h.isEmpty();
                } else {
                    if (!z11 && (((arrayList = (j42 = j4()).f48922g) != null && arrayList.size() > 0) || j42.J())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z11 = j4().I();
                }
                this.L = z11;
                boolean z15 = this.G0;
                if (!z11 && !z12) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                this.G0 = z13;
                if (z12 || z13) {
                    tw twVar = this.E0;
                    if (z13 != z15) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    twVar.p(z10, z14);
                }
                boolean z16 = this.G0;
                int i12 = 8;
                float f11 = 0.0f;
                if (z16 != z15) {
                    if (z10) {
                        ValueAnimator valueAnimator = this.J;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        if (this.G0 && !isInPreviewMode()) {
                            this.E0.setVisibility(0);
                        }
                        float f12 = this.H0;
                        if (this.G0) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
                        this.J = ofFloat;
                        ofFloat.addUpdateListener(new cj(1, this));
                        this.J.addListener(new org.telegram.ui.Components.voip.i2(this, 6));
                        this.J.setDuration(200L);
                        this.J.setInterpolator(org.telegram.ui.Components.gr.f26523f);
                        this.J.start();
                    } else {
                        tw twVar2 = this.E0;
                        if (z16 && !isInPreviewMode()) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        twVar2.setVisibility(i10);
                        if (this.G0) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        this.H0 = f7;
                        View view = this.fragmentView;
                        if (view != null) {
                            view.invalidate();
                        }
                    }
                }
                if (z12 != this.M) {
                    this.M = z12;
                    if (z12) {
                        this.E0.l(false, 1.0f);
                    }
                    if (z10 && !isInPreviewMode()) {
                        this.E0.setVisibility(0);
                        float f13 = -this.N;
                        if (!z12) {
                            f11 = f4();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.I = ofFloat2;
                        ofFloat2.addUpdateListener(new ix(this, f13, z12, f11));
                        this.I.addListener(new cx(this, z12, 2));
                        this.I.setDuration(200L);
                        this.I.setInterpolator(org.telegram.ui.Components.gr.f26523f);
                        this.I.start();
                        return;
                    }
                    this.K = z12;
                    tw twVar3 = this.E0;
                    if ((z12 || this.L) && !isInPreviewMode()) {
                        i12 = 0;
                    }
                    twVar3.setVisibility(i12);
                    if (!z12) {
                        O4(0.0f);
                    } else {
                        this.y3 = -org.telegram.messenger.i0.L(81.0f);
                        O4(-f4());
                    }
                    while (true) {
                        yx[] yxVarArr = this.f44137e0;
                        if (i11 >= yxVarArr.length) {
                            break;
                        }
                        yx yxVar = yxVarArr[i11];
                        if (yxVar != null) {
                            yxVar.f43733a.requestLayout();
                        }
                        i11++;
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
            if (this.W2 == 0 && this.Y2 == 0 && Build.VERSION.SDK_INT >= 33 && hi0.J0(parentActivity)) {
                if (z10) {
                    showDialog(new hi0(parentActivity, !w7.c6.a(), new uv(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().U && this.U1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z10) {
                    org.telegram.ui.ActionBar.x1 x1Var = org.telegram.ui.Components.s4.v(parentActivity, new kv(this, 1)).f20135a;
                    this.T1 = x1Var;
                    showDialog(x1Var);
                    return;
                }
                arrayList.add("android.permission.READ_CONTACTS");
                arrayList.add("android.permission.WRITE_CONTACTS");
                arrayList.add("android.permission.GET_ACCOUNTS");
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                }
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                }
                if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                }
            } else if ((i10 <= 28 || org.telegram.messenger.v2.f18579b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.u5(int, boolean):void");
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        int i11;
        int i12;
        int i13 = 8;
        if (i10 == 1) {
            O3();
            Q3();
            T3();
            G3();
            R3();
            ox oxVar = this.X;
            fe.b bVar = this.f44120b;
            oxVar.setBlurredBackgroundVisibility(bVar.e);
            float a2 = w7.n7.a(bVar.e);
            org.telegram.ui.Components.g9 g9Var = this.f44124b3;
            if (g9Var != null) {
                g9Var.setScaleX(a2);
                this.f44124b3.setScaleY(a2);
                this.f44124b3.setAlpha(a2);
                org.telegram.ui.Components.g9 g9Var2 = this.f44124b3;
                if (a2 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                g9Var2.setVisibility(i12);
            }
            if (this.f44223v0 != null) {
                float T1 = org.telegram.messenger.i0.T1(0.9f, 1.0f, a2);
                this.f44223v0.setScaleX(T1);
                this.f44223v0.setScaleY(T1);
                this.f44223v0.setAlpha(a2);
                vh.d dVar = this.f44223v0;
                int i14 = (a2 > 0.0f ? 1 : (a2 == 0.0f ? 0 : -1));
                if (i14 > 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                dVar.setVisibility(i11);
                this.f44229w0.setAlpha(a2);
                bh.i iVar = this.f44229w0;
                if (i14 > 0) {
                    i13 = 0;
                }
                iVar.setVisibility(i13);
            }
        } else if (i10 == 2) {
            O3();
            Q3();
        } else if (i10 == 3) {
            M3();
        } else if (i10 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        } else if (i10 == 5) {
            L3();
        } else if (i10 == 6) {
            O3();
            Q3();
        } else if (i10 == 7) {
            H3();
        } else if (i10 == 8) {
            G3();
            R3();
        } else if (i10 == 9) {
            R3();
        }
    }

    public final void v3(CharSequence charSequence) {
        int i10;
        if (this.B1 != null) {
            if (this.D2 == null && this.E2 == null && this.F2 == null) {
                return;
            }
            if (this.G2 == null) {
                org.telegram.ui.Components.tp0 tp0Var = new org.telegram.ui.Components.tp0(getParentActivity(), getResourceProvider());
                this.G2 = tp0Var;
                tp0Var.setLayoutClickListener(new gv(this, 0));
                this.G2.setOnModeChangeListener(new hv(this, 0));
                nw nwVar = this.B1;
                org.telegram.ui.Components.tp0 tp0Var2 = this.G2;
                if (tp0Var2 == null) {
                    nwVar.getClass();
                } else {
                    nwVar.G1 = tp0Var2;
                    nwVar.addView(tp0Var2, 0, w7.b6.e(-1, 48, 51));
                    nwVar.f23716g3 = false;
                    nwVar.I();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G2.getLayoutParams();
                layoutParams.rightMargin = -this.B1.getPaddingRight();
                this.G2.setLayoutParams(layoutParams);
            }
            if (m4()) {
                this.G2.i(this.currentAccount, this.D2);
            } else {
                String str = this.E2;
                if (str != null) {
                    org.telegram.ui.Components.tp0 tp0Var3 = this.G2;
                    tp0Var3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        tp0Var3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.F2;
                    if (charSequence2 != null) {
                        org.telegram.ui.Components.tp0 tp0Var4 = this.G2;
                        tp0Var4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            tp0Var4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.B1.setFieldText(charSequence);
            }
            nw nwVar2 = this.B1;
            if (m4()) {
                i10 = 2131754454;
            } else {
                i10 = 2131745480;
            }
            nwVar2.setOverrideHint(org.telegram.messenger.dd.L0(i10, null));
            H3();
            if (this.G2.getMode() != 0) {
                this.B1.v1(false, false);
            }
            p5();
        }
    }

    public final void v4(long j10) {
        char c10;
        long j11 = j10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().Q.f(j11);
        int i10 = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList arrayList = (ArrayList) getMessagesController().f19283x.f(dialog.community_id);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                v4(((TLRPC.Dialog) obj).f19798id);
            }
            return;
        }
        int i11 = this.f44137e0[0].f43739s;
        org.telegram.messenger.bp bpVar = null;
        if ((i11 == 7 || i11 == 8) && (!this.actionBar.u() || this.actionBar.w(null))) {
            org.telegram.messenger.bp[] bpVarArr = getMessagesController().M;
            if (this.f44137e0[0].f43739s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            bpVar = bpVarArr[c10];
        }
        int i12 = -1;
        if (bpVar != null) {
            int i13 = bpVar.f15004g;
            int i14 = org.telegram.messenger.wp.D8;
            if ((i13 & 64) != 0 && !bpVar.a(this.currentAccount, dialog)) {
                M4(true, true);
                z3();
                if (this.R1 != null) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= this.R1.size()) {
                            break;
                        } else if (((TLRPC.Dialog) this.R1.get(i15)).f19798id == j11) {
                            i12 = i15;
                            break;
                        } else {
                            i15++;
                        }
                    }
                    if (i12 < 0) {
                        M4(false, false);
                    }
                }
            }
        }
        int i16 = i12;
        if (getMessagesController().s2(j11) || getMessagesController().y2(j11)) {
            org.telegram.messenger.wp messagesController = getMessagesController();
            org.telegram.messenger.is messagesStorage = messagesController.getMessagesStorage();
            org.telegram.messenger.wl wlVar = new org.telegram.messenger.wl(messagesController, j11);
            org.telegram.messenger.r5 r5Var = messagesStorage.f16331a;
            org.telegram.messenger.d4 d4Var = new org.telegram.messenger.d4(messagesStorage, j11, wlVar, 5);
            j11 = j11;
            r5Var.c(d4Var);
        }
        getMessagesController().l3(j11, 0L);
        org.telegram.messenger.wp messagesController2 = getMessagesController();
        int i17 = dialog.top_message;
        messagesController2.h3(j11, i17, i17, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i16 >= 0) {
            this.R1.remove(i16);
            this.f44137e0[0].f43742y.D();
            this.f44137e0[0].q(true);
        }
    }

    public final boolean v5(long j10) {
        TLRPC.Chat L0;
        nw nwVar;
        if ((this.S0 <= 1 && ((nwVar = this.B1) == null || nwVar.getVisibility() != 0 || TextUtils.isEmpty(this.B1.getFieldText()))) || !org.telegram.messenger.o5.z(j10) || (L0 = getMessagesController().L0(Long.valueOf(-j10))) == null || org.telegram.messenger.w3.N(L0) || !L0.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.s4.t0(this, org.telegram.messenger.dd.L0(2131745328, null), org.telegram.messenger.dd.L0(2131745320, null), null);
        return false;
    }

    @Override
    public final void w() {
        J4(true, true);
    }

    public final int w3() {
        if (this.B1 != null) {
            return (int) (this.f44241y1.getInputBubbleHeight() + this.f44228w.d() + org.telegram.messenger.i0.L(9.0f) + org.telegram.messenger.i0.L(7.0f) + org.telegram.messenger.i0.L(2.0f));
        } else if (this.Y2 != 0) {
            return org.telegram.messenger.i0.L(72.0f) + this.f44147f4;
        } else {
            return this.f44147f4 + this.f44157h4;
        }
    }

    public final boolean w4(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.User r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.w4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    public final boolean x3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.I2;
            if (i10 < arrayList.size()) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-((Long) arrayList.get(i10)).longValue()));
                if (L0 != null && !org.telegram.messenger.w3.l(L0)) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    public final boolean x4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.G;
        if (user != null && !org.telegram.messenger.i20.z(user) && !org.telegram.messenger.i20.x(user)) {
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
        org.telegram.ui.Components.cg0 cg0Var;
        jw jwVar;
        org.telegram.ui.Components.an0 an0Var;
        u71 u71Var;
        jx jxVar = this.C0;
        if (jxVar != null && (an0Var = jxVar.f26872d0) != null && (u71Var = an0Var.f55712k0) != null) {
            int childCount = u71Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = u71Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q4) {
                    org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) childAt;
                    org.telegram.ui.Components.r8 r8Var = q4Var.f22824c;
                    int i11 = q4Var.h;
                    if (org.telegram.messenger.o5.E(q4Var.f22825f)) {
                        TLRPC.User Z1 = org.telegram.messenger.wp.r1(i11).Z1(Long.valueOf(q4Var.f22825f));
                        q4Var.e = Z1;
                        r8Var.r(Z1);
                    } else {
                        r8Var.q(org.telegram.messenger.wp.r1(i11).L0(Long.valueOf(-q4Var.f22825f)));
                        q4Var.e = null;
                    }
                    q4Var.c(true);
                }
            }
        }
        if (this.f44137e0 != null) {
            int i12 = 0;
            while (true) {
                yx[] yxVarArr = this.f44137e0;
                if (i12 >= yxVarArr.length) {
                    break;
                }
                yx yxVar = yxVarArr[i12];
                if (yxVar != null && (jwVar = yxVar.f43737n) != null) {
                    jwVar.i();
                }
                i12++;
            }
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.F(getThemedColor(org.telegram.ui.ActionBar.t6.G8), true);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.t6.E8), false, true);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.t6.F8), true, true);
            this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.t6.I5), true);
            this.actionBar.updateColors();
        }
        if (this.D3 != null) {
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.t6.ni);
            Drawable drawable = this.K3;
            if (drawable != null && themedColor2 != this.f44233w4) {
                this.f44233w4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.Components.d5 d5Var = this.D3;
            if (d5Var != null) {
                d5Var.k(Integer.valueOf(themedColor2));
            }
            org.telegram.ui.Cells.n nVar = this.E3;
            if (nVar != null) {
                nVar.setColor(themedColor2);
            }
        }
        org.telegram.ui.Cells.d3 d3Var = this.M1;
        if (d3Var != null) {
            org.telegram.ui.ActionBar.t6.H1(d3Var.getBackground(), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21021i6, false), true);
        }
        org.telegram.ui.ActionBar.t0 t0Var = this.m0;
        if (t0Var != null) {
            t0Var.setIconColor(getThemedColor(org.telegram.ui.ActionBar.t6.f21262v8));
        }
        nw nwVar = this.B1;
        if (nwVar != null) {
            nwVar.updateColors();
        }
        px pxVar = this.f44243z0;
        if (pxVar != null) {
            vg.f fVar = pxVar.f30780y0;
            if (fVar != null) {
                fVar.updateColors();
            }
            pxVar.invalidate();
        }
        zf.g0 g0Var = this.f44121b0;
        if (g0Var != null) {
            g0Var.updateColors();
        }
        jx jxVar2 = this.C0;
        if (jxVar2 != null && (cg0Var = jxVar2.f26885r0) != null) {
            cg0Var.c();
        }
        org.telegram.ui.Components.w71 w71Var = this.f44116a0;
        if (w71Var != null) {
            w71Var.updateColors();
        }
        q01 q01Var = this.Z;
        if (q01Var != null) {
            q01Var.updateColors();
        }
        if (this.K0 != null) {
            int o10 = i0.b.o(getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6), 100);
            if (this.K0.getForeground() instanceof ColorDrawable) {
                if (((ColorDrawable) this.K0.getForeground()).getColor() != o10) {
                    ((ColorDrawable) this.K0.getForeground()).setColor(o10);
                }
            } else {
                this.K0.setForeground(new ColorDrawable(o10));
            }
        }
        org.telegram.ui.Components.f10 f10Var = this.f44213t0;
        if (f10Var != null) {
            f10Var.updateColors();
        }
        org.telegram.ui.Components.f10 f10Var2 = this.f44218u0;
        if (f10Var2 != null) {
            f10Var2.updateColors();
        }
        int i13 = org.telegram.ui.ActionBar.t6.f20930d6;
        this.f44179m4.a(getThemedColor(i13));
        org.telegram.ui.Components.zr zrVar = this.J1;
        if (zrVar != null) {
            zrVar.updateColors();
        }
        org.telegram.ui.Components.yr yrVar = this.K1;
        if (yrVar != null) {
            yrVar.setColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
        }
        lw lwVar = this.H1;
        if (lwVar != null) {
            lwVar.updateColors();
        }
        lw lwVar2 = this.F1;
        if (lwVar2 != null) {
            lwVar2.updateColors();
        }
        n5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        tw twVar = this.E0;
        if (twVar != null) {
            twVar.o();
        }
        if (this.C3 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.Ul)) != this.f44227v4) {
            this.f44227v4 = themedColor;
            this.C3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        ox oxVar = this.X;
        if (oxVar != null) {
            oxVar.updateColors();
        }
    }

    public final void y4(View view) {
        boolean z10;
        int i10;
        int i11;
        String str;
        int i12;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.a30.h(getParentActivity(), false, 1, null);
        if (getMessagesStorage().L != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 2131232214;
        } else {
            i10 = 0;
        }
        if (org.telegram.messenger.uz.f18545q1) {
            i11 = 2131230998;
        } else {
            i11 = 2131231002;
        }
        int[] iArr = {i10, i11};
        if (z10) {
            str = org.telegram.messenger.dd.L0(2131748697, null);
        } else {
            str = null;
        }
        if (org.telegram.messenger.uz.f18545q1) {
            i12 = 2131747262;
        } else {
            i12 = 2131749333;
        }
        CharSequence[] charSequenceArr = {str, org.telegram.messenger.dd.L0(i12, null)};
        l4 l4Var = new l4(this, 1);
        h.L = charSequenceArr;
        h.M = iArr;
        h.K = l4Var;
        showDialog(h);
    }

    public final void z3() {
        org.telegram.messenger.i0.h3(new dw(this, 0), 300L);
    }

    public final void z4(android.view.View r27, int r28, s4.g0 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx.z4(android.view.View, int, s4.g0):void");
    }
}
