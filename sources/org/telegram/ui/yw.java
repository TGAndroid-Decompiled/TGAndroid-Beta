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
public class yw extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is, pg.b, te.b, ie0 {
    public static final boolean[] A4 = new boolean[4];
    public static final org.telegram.ui.Components.tp0 B4 = new org.telegram.ui.Components.tp0(3);
    public static float C4;
    public static boolean f53643z4;
    public ow A0;
    public jh.f A1;
    public boolean A2;
    public float A3;
    public boolean B0;
    public FrameLayout B1;
    public boolean B2;
    public boolean B3;
    public int C0;
    public FrameLayout C1;
    public boolean C2;
    public boolean C3;
    public hw D0;
    public kv D1;
    public boolean D2;
    public Long D3;
    public boolean E;
    public org.telegram.ui.Components.qs0 E0;
    public oi.u1 E1;
    public sw E2;
    public Drawable E3;
    public boolean F;
    public qv F0;
    public org.telegram.ui.ActionBar.q0 F1;
    public ArrayList F2;
    public org.telegram.ui.Components.e5 F3;
    public boolean G;
    public org.telegram.ui.Components.tr G0;
    public final TextPaint G1;
    public String G2;
    public org.telegram.ui.Cells.o G3;
    public TLRPC.RequestPeerType H;
    public boolean H0;
    public iv H1;
    public CharSequence H2;
    public uv H3;
    public long I;
    public float I0;
    public FrameLayout I1;
    public org.telegram.ui.Components.to0 I2;
    public final jv I3;
    public ValueAnimator J;
    public float J0;
    public iv J1;
    public org.telegram.ui.Components.voip.u J2;
    public final jv J3;
    public ValueAnimator K;
    public float K0;
    public FrameLayout K1;
    public final ArrayList K2;
    public f K3;
    public boolean L;
    public rv L0;
    public org.telegram.ui.Components.vr L1;
    public boolean L2;
    public xi.e L3;
    public boolean M;
    public org.telegram.ui.Components.m60 M0;
    public org.telegram.ui.Components.ur M1;
    public int M2;
    public Drawable M3;
    public boolean N;
    public wv N0;
    public org.telegram.ui.Cells.m N1;
    public int N2;
    public int N3;
    public float O;
    public boolean O0;
    public org.telegram.ui.Cells.b3 O1;
    public boolean O2;
    public boolean O3;
    public boolean P;
    public boolean P0;
    public org.telegram.ui.Cells.ma P1;
    public int P2;
    public boolean P3;
    public int Q;
    public long Q0;
    public Long Q1;
    public int Q2;
    public AnimatorSet Q3;
    public boolean R;
    public long R0;
    public Long R1;
    public int R2;
    public boolean R3;
    public boolean S;
    public long S0;
    public mi.j S1;
    public int S2;
    public pt S3;
    public org.telegram.ui.Components.xb T;
    public int T0;
    public ArrayList T1;
    public int T2;
    public String T3;
    public float U;
    public int U0;
    public boolean U1;
    public int U2;
    public ArrayList U3;
    public boolean V;
    public int V0;
    public org.telegram.ui.ActionBar.t1 V1;
    public int V2;
    public boolean V3;
    public boolean W;
    public boolean W0;
    public boolean W1;
    public int W2;
    public CharSequence W3;
    public boolean X;
    public org.telegram.ui.Components.ob0 X0;
    public boolean X1;
    public boolean X2;
    public boolean X3;
    public nw Y;
    public org.telegram.ui.Cells.t2 Y0;
    public long Y1;
    public int Y2;
    public float Y3;
    public bg.o0 Z;
    public org.telegram.ui.Cells.t2 Z0;
    public TLObject Z1;
    public yw Z2;
    public boolean Z3;
    public final int f53644a;
    public az0 f53645a0;
    public boolean f53646a1;
    public int f53647a2;
    public long f53648a3;
    public boolean f53649a4;
    public final te.a f53650b;
    public org.telegram.ui.Components.v61 f53651b0;
    public boolean f53652b1;
    public int f53653b2;
    public TLRPC.Chat f53654b3;
    public ValueAnimator f53655b4;
    public final te.a f53656c;
    public jg.q0 f53657c0;
    public final ArrayList f53658c1;
    public boolean f53659c2;
    public TLRPC.ChatFull f53660c3;
    public org.telegram.ui.Components.m30 f53661c4;
    public final te.a d;
    public float f53662d0;
    public boolean f53663d1;
    public boolean d2;
    public org.telegram.ui.Components.i9 f53664d3;
    public TLRPC.FileLocation f53665d4;
    public final te.a f53666e;
    public ValueAnimator f53667e0;
    public boolean f53668e1;
    public boolean f53669e2;
    public org.telegram.ui.Components.t8 f53670e3;
    public TLRPC.FileLocation f53671e4;
    public final te.a f53672f;
    public xw[] f53673f0;
    public boolean f53674f1;
    public int f53675f2;
    public long f53676f3;
    public org.telegram.ui.Components.xb f53677f4;
    public org.telegram.ui.ActionBar.q0 f53678g0;
    public org.telegram.ui.ActionBar.x1 f53679g1;
    public boolean f53680g2;
    public boolean f53681g3;
    public int f53682g4;
    public final te.a h;
    public org.telegram.ui.ActionBar.q0 f53683h0;
    public final Paint f53684h1;
    public String f53685h2;
    public boolean f53686h3;
    public int f53687h4;
    public ax f53688i0;
    public ImageView f53689i1;
    public String f53690i2;
    public AnimatorSet f53691i3;
    public int f53692i4;
    public boolean f53693j0;
    public NumberTextView f53694j1;
    public String f53695j2;
    public boolean j3;
    public int f53696j4;
    public org.telegram.ui.ActionBar.q0 f53697k0;
    public final ArrayList f53698k1;
    public boolean f53699k2;
    public boolean f53700k3;
    public int f53701k4;
    public org.telegram.ui.ActionBar.q0 f53702l0;
    public org.telegram.ui.ActionBar.q0 l1;
    public boolean f53703l2;
    public float f53704l3;
    public final dh.g f53705l4;
    public org.telegram.ui.ActionBar.q0 m0;
    public org.telegram.ui.ActionBar.q0 f53706m1;
    public boolean f53707m2;
    public boolean f53708m3;
    public final ui.f f53709m4;
    public final te.a f53710n;
    public org.telegram.ui.ActionBar.q0 f53711n0;
    public org.telegram.ui.ActionBar.q0 n1;
    public boolean f53712n2;
    public int f53713n3;
    public final ui.f f53714n4;
    public org.telegram.ui.Components.lg0 f53715o0;
    public org.telegram.ui.ActionBar.q0 f53716o1;
    public boolean f53717o2;
    public boolean f53718o3;
    public final ui.c o4;
    public org.telegram.ui.ActionBar.z0 f53719p0;
    public org.telegram.ui.ActionBar.z0 f53720p1;
    public String f53721p2;
    public boolean f53722p3;
    public final dh.c f53723p4;
    public hi.l3 f53724q0;
    public org.telegram.ui.ActionBar.z0 f53725q1;
    public String f53726q2;
    public org.telegram.ui.Components.xb f53727q3;
    public final dh.c f53728q4;
    public final te.a f53729r;
    public hi.l3 f53730r0;
    public org.telegram.ui.ActionBar.z0 f53731r1;
    public final org.telegram.messenger.ur f53732r2;
    public final h2.f f53733r3;
    public final dh.c f53734r4;
    public final te.a f53735s;
    public boolean f53736s0;
    public org.telegram.ui.ActionBar.z0 f53737s1;
    public boolean f53738s2;
    public boolean f53739s3;
    public final dh.c f53740s4;
    public boolean f53741t0;
    public org.telegram.ui.ActionBar.z0 f53742t1;
    public boolean f53743t2;
    public boolean f53744t3;
    public vu f53745t4;
    public org.telegram.ui.Components.t00 f53746u0;
    public org.telegram.ui.ActionBar.z0 f53747u1;
    public boolean f53748u2;
    public boolean f53749u3;
    public final ArrayList f53750u4;
    public org.telegram.ui.Components.t00 f53751v0;
    public org.telegram.ui.ActionBar.z0 f53752v1;
    public boolean f53753v2;
    public boolean f53754v3;
    public final RectF f53755v4;
    public final rh.h f53756w;
    public hi.d f53757w0;
    public float f53758w1;
    public boolean f53759w2;
    public float f53760w3;
    public final RectF f53761w4;
    public boolean f53762x;
    public lh.f f53763x0;
    public float f53764x1;
    public boolean f53765x2;
    public ValueAnimator f53766x3;
    public int f53767x4;
    public int f53768y;
    public int f53769y0;
    public AnimatorSet f53770y1;
    public boolean f53771y2;
    public float f53772y3;
    public int f53773y4;
    public final UndoView[] f53774z0;
    public float f53775z1;
    public boolean f53776z2;
    public float f53777z3;

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
        this.f53644a = i7;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        this.f53650b = new te.a(1, this, erVar, 350L, false);
        this.f53656c = new te.a(2, this, erVar, 350L, false);
        this.d = new te.a(3, this, erVar, 350L, false);
        this.f53666e = new te.a(4, this, erVar, 350L, false);
        this.f53672f = new te.a(5, this, erVar, 350L, false);
        this.h = new te.a(6, this, erVar, 350L, false);
        this.f53710n = new te.a(7, this, erVar, 350L, false);
        this.f53729r = new te.a(8, this, erVar, 350L, false);
        this.f53735s = new te.a(9, this, erVar, 350L, false);
        this.f53756w = new rh.h(new eu(this, 18));
        this.f53768y = -1;
        this.G = true;
        this.L = false;
        this.M = false;
        this.N = false;
        this.R = true;
        this.f53662d0 = 1.0f;
        this.f53774z0 = new UndoView[2];
        this.f53658c1 = new ArrayList();
        this.f53684h1 = new Paint();
        this.f53698k1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.G1 = new TextPaint(1);
        this.W1 = true;
        this.f53669e2 = true;
        this.f53699k2 = true;
        this.f53732r2 = new Object();
        this.K2 = new ArrayList();
        this.L2 = true;
        this.f53733r3 = new h2.f((int[]) null);
        this.I3 = new jv(this, 0);
        this.J3 = new jv(this, 1);
        this.N3 = -4;
        this.O3 = true;
        this.P3 = true;
        this.Y3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f53750u4 = arrayList;
        RectF rectF = new RectF();
        this.f53755v4 = rectF;
        RectF rectF2 = new RectF();
        this.f53761w4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        ui.c d = this.glassEngine.d(new hu(this, 12));
        this.o4 = d;
        if (i10 >= 31) {
            dh.g gVar = new dh.g(false);
            this.f53705l4 = gVar;
            ui.f fVar = new ui.f(d);
            this.f53714n4 = fVar;
            fVar.f58440f = d;
            fVar.d = gVar;
            fVar.f58439e = -2;
            ui.f fVar2 = new ui.f(null);
            this.f53709m4 = fVar2;
            fVar2.f58440f = d;
            fVar2.d = gVar;
            fVar2.f58439e = -3;
            dh.c cVar = new dh.c(fVar, fVar, fVar);
            this.f53734r4 = cVar;
            cVar.f8097k = true;
            if (org.telegram.messenger.qc.e(262144)) {
                L = org.telegram.messenger.g0.L(8.0f);
            } else {
                L = org.telegram.messenger.g0.L(48.0f);
            }
            cVar.d = L;
            cVar.f8092e = L;
            dh.c cVar2 = new dh.c(fVar2, fVar2, fVar2);
            this.f53723p4 = cVar2;
            cVar2.f8097k = true;
            int L2 = org.telegram.messenger.g0.L(48.0f);
            cVar2.d = L2;
            cVar2.f8092e = L2;
            this.f53728q4 = new dh.c(fVar2, fVar2, fVar2);
        } else {
            this.f53705l4 = null;
            this.f53709m4 = null;
            this.f53714n4 = null;
            this.f53723p4 = new dh.c(d, d, d);
            this.f53734r4 = new dh.c(d, d, d);
            this.f53728q4 = new dh.c(d, d, d);
        }
        dh.c cVar3 = new dh.c(d, d, d);
        this.f53740s4 = cVar3;
        dh.c cVar4 = this.f53734r4;
        ri.q qVar = this.glassEngine;
        cVar4.f8096j = qVar;
        this.f53723p4.f8096j = qVar;
        this.f53728q4.f8096j = qVar;
        cVar3.f8096j = qVar;
    }

    public static void A0(yw ywVar) {
        if (!ywVar.P3) {
            hi.l3 l3Var = ywVar.f53730r0;
            if (l3Var != null) {
                if (l3Var.W) {
                    return;
                }
                org.telegram.messenger.g0.E2(l3Var);
            }
            SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.N0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.j6.xj, 0, new eu(ywVar, 24), null);
            hi.l3 l3Var2 = new hi.l3(ywVar.getParentActivity(), 2);
            l3Var2.s(8.0f);
            l3Var2.d = 8000L;
            l3Var2.k(true);
            l3Var2.r(true);
            l3Var2.h = org.telegram.messenger.g0.f23609q.x - org.telegram.messenger.g0.L(148.0f);
            l3Var2.u(S2);
            l3Var2.o(1.0f, -40.0f);
            l3Var2.j(ywVar.getThemedColor(org.telegram.ui.ActionBar.j6.wj));
            ywVar.f53730r0 = l3Var2;
            l3Var2.setTranslationY((-ywVar.f53687h4) - ywVar.f53696j4);
            ((ViewGroup) ywVar.fragmentView).addView(ywVar.f53730r0, c8.ja.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            ywVar.f53730r0.w();
            return;
        }
        hi.l3 l3Var3 = ywVar.f53724q0;
        if (l3Var3 != null) {
            l3Var3.f(true);
        }
        fi.m6 o4 = org.telegram.messenger.np.s1(ywVar.currentAccount).P1().o();
        if (o4 != null && o4.a(ywVar.currentAccount, 1)) {
            ywVar.showDialog(new ug.j0(o4.b(), ywVar.currentAccount, ywVar.getParentActivity(), ywVar, null));
            return;
        }
        hi.sa D = hi.sa.D(ywVar.getParentActivity(), ywVar.currentAccount);
        D.f15113y = new ev(ywVar);
        D.Q(null);
    }

    public static void B0(yw ywVar) {
        org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, "PREMIUM_CHRISTMAS");
        ywVar.g5();
        org.telegram.ui.Components.xb G = org.telegram.ui.Components.cc.a0(ywVar).G(2131624034, 4, org.telegram.messenger.hd.M0(2131753330, null));
        G.f41643j = 5000;
        G.j();
    }

    public static void C0(org.telegram.ui.yw r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.C0(org.telegram.ui.yw, int):void");
    }

    public static void D0(yw ywVar) {
        org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, "BIRTHDAY_SETUP");
        ywVar.g5();
        org.telegram.ui.Components.xb K = org.telegram.ui.Components.cc.a0(ywVar).K(2131623982, org.telegram.messenger.hd.M0(2131753714, null), org.telegram.messenger.hd.M0(2131745495, null), new eu(ywVar, 29));
        K.f41643j = 5000;
        K.j();
    }

    public static void E0(yw ywVar) {
        boolean z10 = true;
        try {
            ((org.telegram.ui.Components.ch0) ((org.telegram.ui.Components.t8) ywVar.O1.h.getImageReceiver().f22286n0).K).H(true);
        } catch (Exception unused) {
        }
        if (ywVar.f53661c4 == null) {
            org.telegram.ui.Components.m30 m30Var = new org.telegram.ui.Components.m30(0, true, true);
            ywVar.f53661c4 = m30Var;
            m30Var.I = true;
            m30Var.f37040a = ywVar;
            m30Var.f37041b = new lw(ywVar);
            ywVar.getMediaDataController().x();
            ywVar.getMessagesController().d3();
            ywVar.getMessagesController().g3(ywVar.getUserConfig().f(), true, ywVar.classGuid);
        }
        TLRPC.User a22 = org.telegram.messenger.np.s1(ywVar.currentAccount).a2(Long.valueOf(org.telegram.messenger.m10.i(ywVar.currentAccount).e()));
        if (a22 == null) {
            a22 = org.telegram.messenger.m10.i(ywVar.currentAccount).f();
        }
        if (a22 != null) {
            org.telegram.ui.Components.ki kiVar = ywVar.f53661c4.f37042c;
            if (kiVar != null) {
                kiVar.P0();
            }
            org.telegram.ui.Components.m30 m30Var2 = ywVar.f53661c4;
            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            m30Var2.n(z10, new eu(ywVar, 28), new nu(ywVar, 3), 0);
        }
    }

    public static void G0(yw ywVar, float f10, ValueAnimator valueAnimator) {
        ywVar.f53673f0[0].setTranslationY((1.0f - ywVar.f53760w3) * f10);
        ywVar.f53760w3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i7 = 0; i7 < ywVar.actionBar.getChildCount(); i7++) {
            if (ywVar.actionBar.getChildAt(i7).getVisibility() == 0 && ywVar.actionBar.getChildAt(i7) != ywVar.actionBar.getActionMode() && ywVar.actionBar.getChildAt(i7) != ywVar.actionBar.getBackButton()) {
                ywVar.actionBar.getChildAt(i7).setAlpha(1.0f - ywVar.f53760w3);
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
        org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(ywVar.getParentActivity(), ywVar.resourceProvider);
        fbVar.d(2131624009, new String[0]);
        fbVar.f34552b.setText(org.telegram.messenger.hd.M0(2131742811, null));
        org.telegram.ui.Components.xb.g(ywVar, fbVar, 2750).j();
        try {
            ywVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void I0(yw ywVar, org.telegram.messenger.t1 t1Var) {
        ArrayList arrayList = t1Var.f26616c;
        if (arrayList.size() == 1) {
            bi.s2 s2Var = new bi.s2(ywVar.getParentActivity(), ywVar.currentAccount, ((TLRPC.User) arrayList.get(0)).f28200id, null, null);
            s2Var.e1(true);
            ywVar.showDialog(s2Var);
            return;
        }
        wg.c1.l1(0, t1Var);
    }

    public static void J0(yw ywVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.xb I = org.telegram.ui.Components.cc.a0(ywVar).I(2131624034, org.telegram.messenger.hd.M0(2131746856, null), org.telegram.messenger.hd.M0(2131746855, null));
            I.f41643j = 5000;
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
                String M0 = org.telegram.messenger.hd.M0(2131746852, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.hd.M0(2131746853, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                ywVar.showDialog(t1Var);
                return;
            }
            return;
        }
        org.telegram.messenger.k5.n(null, 2131743879, org.telegram.ui.Components.cc.a0(ywVar), 2131624012, 36);
    }

    public static void K0(yw ywVar) {
        org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        ywVar.g5();
    }

    public static void X2(yw ywVar, float f10) {
        float f11;
        float f12;
        int i7;
        int i10;
        float i11 = Utilities.i(ywVar.f53775z1 * 2.0f, 1.0f, 0.0f);
        qv qvVar = ywVar.F0;
        float f13 = (1.0f - ywVar.f53760w3) * f10 * ywVar.I0;
        float f14 = 1.0f - i11;
        qvVar.setAlpha(f13 * f14);
        int i12 = 0;
        if (!ywVar.L && !ywVar.N) {
            if (ywVar.M) {
                ywVar.F0.setTranslationY((Math.max(ywVar.O, -ywVar.g4()) + (-org.telegram.messenger.g0.L(81.0f))) - org.telegram.messenger.g0.L(8.0f));
                ywVar.F0.setProgressToCollapse(1.0f);
                qv qvVar2 = ywVar.F0;
                qvVar2.setClipTop((int) (org.telegram.messenger.g0.f23603m - qvVar2.getY()));
            }
            f11 = 1.0f - ywVar.I0;
            ywVar.actionBar.setTranslationY(0.0f);
        } else {
            float i13 = Utilities.i((-ywVar.O) / org.telegram.messenger.g0.L(81.0f), 1.0f, 0.0f);
            if (ywVar.f53760w3 == 1.0f) {
                i13 = 1.0f;
            }
            float i14 = Utilities.i(i13 / 0.5f, 1.0f, 0.0f);
            ywVar.F0.setClipTop(0);
            if (!ywVar.L && ywVar.N) {
                ywVar.F0.setTranslationY((-org.telegram.messenger.g0.L(81.0f)) - org.telegram.messenger.g0.L(8.0f));
                ywVar.F0.setProgressToCollapse(1.0f);
                f12 = ywVar.I0;
            } else {
                ywVar.F0.setTranslationY(((ywVar.U / 2.0f) + (Math.max(ywVar.O, -ywVar.g4()) + ywVar.f53772y3)) - org.telegram.messenger.g0.L(8.0f));
                ywVar.F0.l(!ywVar.H3.c(), i13);
                if (!ywVar.N) {
                    f12 = ywVar.I0;
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
            ywVar.actionBar.getTitlesContainer().setPivotY(org.telegram.messenger.g0.f23603m);
            ywVar.actionBar.getTitlesContainer().setPivotX(org.telegram.messenger.g0.L(20.0f));
            float f16 = (0.6f * f15) + 0.4f;
            ywVar.actionBar.getTitlesContainer().setScaleY(f16);
            ywVar.actionBar.getTitlesContainer().setScaleX(f16);
            ywVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            ywVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-org.telegram.messenger.g0.L(30.0f));
            ywVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f16);
            ywVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f16);
            float f17 = (1.0f - ywVar.f53760w3) * f15;
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
        float f18 = 1.0f - ywVar.f53760w3;
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
        org.telegram.ui.ActionBar.o4 o4Var;
        if (ywVar.parentLayout != null && ywVar.actionBar != null) {
            float max = Math.max(ywVar.f53666e.f57081e, ywVar.h4());
            float f10 = 1.0f;
            float f11 = 1.0f - ywVar.f53775z1;
            float f12 = max * f11 * f11;
            int i10 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
            if (i10 != 0) {
                if (-1 >= i7) {
                    f10 = 0.0f;
                    i7 = -1;
                }
                if (f10 > 0.0f && i10 > 0 && i7 > 0 && (o4Var = ywVar.parentLayout) != null) {
                    ((ActionBarLayout) o4Var).p(canvas, (int) (f10 * 255.0f * f12), i7);
                }
            }
        }
    }

    public static void Z(yw ywVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, tL_pendingSuggestion.suggestion);
        ywVar.g5();
    }

    public static void a0(yw ywVar, float f10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ywVar.f53760w3 = floatValue;
        ywVar.f53673f0[0].setTranslationY((-f10) * floatValue);
        for (int i7 = 0; i7 < ywVar.actionBar.getChildCount(); i7++) {
            if (ywVar.actionBar.getChildAt(i7).getVisibility() == 0 && ywVar.actionBar.getChildAt(i7) != ywVar.actionBar.getActionMode() && ywVar.actionBar.getChildAt(i7) != ywVar.actionBar.getBackButton()) {
                ywVar.actionBar.getChildAt(i7).setAlpha(1.0f - ywVar.f53760w3);
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
        ArrayList arrayList = ywVar.K2;
        org.telegram.ui.ActionBar.o4 o4Var = ywVar.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).y()) {
            ywVar.finishPreviewFragment();
        } else if (ywVar.T0 == 10) {
            if (ywVar.E2 != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    arrayList2.add(org.telegram.messenger.ur.a(((Long) arrayList.get(i7)).longValue(), 0L));
                }
                ywVar.E2.y(ywVar, arrayList2, null, false, ywVar.L2, ywVar.M2, ywVar.N2, null);
            }
        } else if (org.telegram.messenger.np.s1(ywVar.currentAccount).v2()) {
            b.b(ywVar.currentAccount);
        } else {
            ywVar.presentFragment(new ContactsActivity(a8.p0.k("destroyAfterSelect", true)));
        }
    }

    public static void c0(yw ywVar) {
        org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, "USERPIC_SETUP");
        ywVar.g5();
    }

    public static org.telegram.ui.Cells.t2 c4(xw xwVar) {
        uw uwVar = xwVar.f53331a;
        for (int i7 = 0; i7 < uwVar.getChildCount(); i7++) {
            View childAt = uwVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.t2) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                if (t2Var.Y()) {
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
        bundle.putLong("user_id", org.telegram.messenger.m10.i(ywVar.currentAccount).e());
        ywVar.presentFragment(new an(bundle));
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
        org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, "BIRTHDAY_SETUP");
        ywVar.g5();
    }

    public static void g0(yw ywVar, xw xwVar, View view, int i7) {
        int i10;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.x3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.t2;
        if (z10) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            if (t2Var.f31611o2) {
                ywVar.Z4(t2Var.getDialogId(), view);
                return;
            }
        }
        if (ywVar.U3()) {
            ywVar.A4(view, i7, 0.0f, xwVar.d);
            return;
        }
        int i11 = ywVar.T0;
        if (i11 == 15 && (view instanceof org.telegram.ui.Cells.l8)) {
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
            c50 c50Var = new c50(k10);
            c50Var.Z = new ev(ywVar);
            ywVar.presentFragment(c50Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.b3) && ((i10 = xwVar.f53338s) == 7 || i10 == 8)) {
            jg.k kVar = (jg.k) xwVar.d.N.get(0);
            if (kVar != null && kVar.f56015a == 17) {
                tL_chatlists_chatlistUpdates = kVar.f17167i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                org.telegram.messenger.so soVar = ywVar.getMessagesController().N[xwVar.f53338s - 7];
                if (soVar != null) {
                    int i13 = soVar.f26542a;
                    ?? jaVar = new org.telegram.ui.Components.ja(ywVar, false);
                    jaVar.U1 = -1;
                    jaVar.Y1 = "";
                    jaVar.Z1 = new ArrayList();
                    jaVar.f42498b2 = "";
                    jaVar.d2 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    jaVar.f42500e2 = arrayList;
                    jaVar.f42517v2 = -1;
                    jaVar.f42520y2 = -5;
                    jaVar.U1 = i13;
                    jaVar.W1 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    jaVar.f42499c2 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList arrayList2 = ywVar.getMessagesController().Q0;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i12 >= arrayList2.size()) {
                                break;
                            } else if (((org.telegram.messenger.so) arrayList2.get(i12)).f26542a == i13) {
                                jaVar.Y1 = ((org.telegram.messenger.so) arrayList2.get(i12)).f26543b;
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    jaVar.f1();
                    ywVar.showDialog(jaVar);
                    return;
                }
                return;
            }
        } else if (z10 && !ywVar.actionBar.x() && !ywVar.H3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.t2) view).Z1;
            org.telegram.messenger.g0.P.set(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), imageReceiver.A());
        }
        ywVar.z4(view, i7, xwVar.d);
    }

    public static void h0(yw ywVar) {
        ywVar.presentFragment(new PrivacySettingsActivity());
        org.telegram.messenger.g0.k3(ywVar.parentLayout, "newChatsRow");
    }

    public static void i0(yw ywVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.np.s1(ywVar.currentAccount).o1(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(ywVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new z9(ywVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void j0(yw ywVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(launchActivity, ywVar.currentAccount, tL_attachMenuBot, null, true);
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(ywVar.currentAccount);
        TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.f26461b;
        if (tL_attachMenuBots != null) {
            long j3 = b02.f26458a;
            b02.getMessagesStorage().f27220a.c(new org.telegram.messenger.fk(b02.f26469e, 2, j3, b02, tL_attachMenuBots));
        }
    }

    public static void j1(yw ywVar, boolean z10) {
        if (ywVar.f53673f0 != null && ywVar.O3 != z10) {
            ywVar.O3 = z10;
            int i7 = 0;
            while (true) {
                xw[] xwVarArr = ywVar.f53673f0;
                if (i7 < xwVarArr.length) {
                    if (z10) {
                        xwVarArr[i7].f53331a.setScrollbarFadingEnabled(false);
                    }
                    ywVar.f53673f0[i7].f53331a.setVerticalScrollBarEnabled(z10);
                    if (z10) {
                        ywVar.f53673f0[i7].f53331a.setScrollbarFadingEnabled(true);
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public static void k0(yw ywVar) {
        org.telegram.messenger.np.s1(ywVar.currentAccount).f25280f7.edit().putBoolean("storyhint", false).commit();
    }

    public static void l0(yw ywVar) {
        if (ywVar.f53661c4.g()) {
            org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, "USERPIC_SETUP");
            ywVar.g5();
        }
    }

    public static void n0(yw ywVar) {
        org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, "PREMIUM_GRACE");
        ywVar.g5();
    }

    public static void o0(yw ywVar) {
        org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, "SETUP_PASSKEY");
        ywVar.g5();
    }

    public static void p0(yw ywVar, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        try {
            t1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (tLObject != null) {
            ywVar.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            di.x2 x2Var = new di.x2(ywVar, j3, 25);
            Pattern pattern = org.telegram.ui.Components.t4.f39507a;
            if (ywVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = ywVar.getCurrentAccount();
                    Activity parentActivity = ywVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long e11 = org.telegram.messenger.m10.i(currentAccount).e();
                    TextView textView = new TextView(parentActivity);
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, null);
                    textView.setTextSize(1, 16.0f);
                    if (org.telegram.messenger.hd.f24101a0) {
                        i7 = 5;
                    } else {
                        i7 = 3;
                    }
                    textView.setGravity(i7 | 48);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    alertDialog$Builder.o(frameLayout);
                    org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                    t8Var.u(org.telegram.messenger.g0.L(12.0f));
                    org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(parentActivity);
                    i9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                    if (org.telegram.messenger.hd.f24101a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    frameLayout.addView(i9Var, c8.ja.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(parentActivity);
                    org.telegram.messenger.k5.m(textView2, org.telegram.ui.ActionBar.j6.E8, null, 1, 20.0f);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    if (org.telegram.messenger.hd.f24101a0) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView2.setGravity(i11 | 16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setText(org.telegram.messenger.hd.M0(2131749245, null));
                    boolean z10 = org.telegram.messenger.hd.f24101a0;
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
                    frameLayout.addView(textView2, c8.ja.d(-1, -2.0f, i16, f10, 11.0f, i14, 0.0f));
                    if (org.telegram.messenger.hd.f24101a0) {
                        i15 = 5;
                    } else {
                        i15 = 3;
                    }
                    frameLayout.addView(textView, c8.ja.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                    if (user != null) {
                        if (org.telegram.messenger.q10.z(user)) {
                            t8Var.f39600p = 0.8f;
                            t8Var.g(12);
                            i9Var.j(null, null, t8Var, user);
                        } else if (user.f28200id == e11) {
                            t8Var.f39600p = 0.8f;
                            t8Var.g(1);
                            i9Var.j(null, null, t8Var, user);
                        } else {
                            t8Var.f39600p = 1.0f;
                            t8Var.r(user);
                            i9Var.f(user, t8Var);
                        }
                    } else {
                        t8Var.q(chat);
                        i9Var.f(chat, t8Var);
                    }
                    textView.setText(org.telegram.messenger.g0.X2(str));
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131749265, null), new org.telegram.ui.Components.s(x2Var, 3));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    ywVar.showDialog(alertDialog$Builder.f28392a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.t4.c0(ywVar.currentAccount, tL_error, ywVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        ywVar.getNotificationCenter().k(org.telegram.messenger.ns.f25587v1, Long.valueOf(j3), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public static void p4(an anVar, org.telegram.messenger.gj gjVar) {
        CharSequence charSequence;
        if (gjVar != null && gjVar.r2()) {
            try {
                if (!TextUtils.isEmpty(gjVar.f23875z)) {
                    charSequence = gjVar.f23875z;
                } else {
                    charSequence = gjVar.v;
                }
                CharSequence x12 = org.telegram.messenger.g0.x1(charSequence, gjVar.f23774a2, null);
                if (x12 instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) x12;
                    org.telegram.ui.Components.b00[] b00VarArr = (org.telegram.ui.Components.b00[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.b00.class);
                    if (b00VarArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(b00VarArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(b00VarArr[0]);
                        for (int i7 = 1; i7 < b00VarArr.length; i7++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(b00VarArr[i7]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(b00VarArr[i7]);
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
                        anVar.Sb(gjVar.L1(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
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
        org.telegram.ui.Components.xl0 xl0Var = ywVar.D0.f36062r0;
        if (i7 >= xl0Var.f33355a0 && i7 < xl0Var.f33356b0) {
            org.telegram.ui.Components.b41 G = xl0Var.G(i7);
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
            String M0 = org.telegram.messenger.hd.M0(2131754180, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131754179, "\"" + org.telegram.messenger.q10.p(user) + "\"");
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746321, null), new tr(4, ywVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        }
    }

    public static void r0(yw ywVar, int i7, ArrayList arrayList, boolean z10, HashSet hashSet) {
        HashSet hashSet2;
        if (i7 == 102) {
            ywVar.getMessagesController().f25394t0 = true;
            if (z10) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            ywVar.D4(arrayList, i7, false, false, hashSet2);
            org.telegram.messenger.np messagesController = ywVar.getMessagesController();
            messagesController.f25394t0 = false;
            messagesController.getNotificationCenter().k(org.telegram.messenger.ns.f25566s, Boolean.TRUE);
            ywVar.getMessagesController().J(ywVar.Y2);
            int i10 = ywVar.Y2;
            if (i10 != 0 && ywVar.d4(ywVar.currentAccount, ywVar.f53673f0[0].f53338s, i10, false).size() == 0) {
                ywVar.f53673f0[0].f53331a.setEmptyView(null);
                ywVar.f53673f0[0].f53340x.setVisibility(4);
                ywVar.finishFragment();
                return;
            }
            return;
        }
        ywVar.D4(arrayList, i7, false, false, null);
    }

    public static void t0(yw ywVar, int i7, org.telegram.ui.Components.m60 m60Var) {
        CharSequence charSequence;
        if (ywVar.currentAccount != i7) {
            m60Var.u();
            if (ywVar.getParentActivity() == null) {
                return;
            }
            sw swVar = ywVar.E2;
            LaunchActivity launchActivity = (LaunchActivity) ywVar.getParentActivity();
            ArrayList arrayList = ywVar.F2;
            String str = ywVar.G2;
            CharSequence charSequence2 = ywVar.H2;
            kv kvVar = ywVar.D1;
            if (kvVar != null) {
                charSequence = kvVar.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.O0(i7);
            yw ywVar2 = new yw(ywVar.arguments);
            ywVar2.E2 = swVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    ywVar2.F2 = null;
                } else {
                    ywVar2.F2 = arrayList;
                    ywVar2.G2 = null;
                    ywVar2.O2 = false;
                    if (ywVar2.D1 != null) {
                        ywVar2.v3(charSequence);
                    } else {
                        ywVar2.W3 = charSequence;
                    }
                }
            } else if (str != null) {
                ywVar2.Q4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    ywVar2.H2 = null;
                } else {
                    ywVar2.H2 = charSequence2;
                    ywVar2.G2 = null;
                    ywVar2.F2 = null;
                    if (ywVar2.D1 != null) {
                        ywVar2.v3(charSequence);
                    } else {
                        ywVar2.W3 = charSequence;
                    }
                }
            }
            launchActivity.u0(ywVar2, false, true);
        }
    }

    public static void u0(yw ywVar) {
        String str;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(ywVar.currentAccount);
        if (ywVar.C3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        s12.k4(0L, str);
        ywVar.g5();
    }

    public static void u1(yw ywVar, xw xwVar, float f10) {
        if (ywVar.U != f10) {
            ywVar.U = f10;
            int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            int i10 = 0;
            if (i7 == 0) {
                ywVar.V = false;
            }
            ywVar.F0.setOverscroll(f10);
            xwVar.f53331a.setViewsOffset(f10);
            uw uwVar = xwVar.f53331a;
            if (i7 != 0) {
                i10 = 2;
            }
            uwVar.setOverScrollMode(i10);
            ywVar.fragmentView.invalidate();
            if (f10 > org.telegram.messenger.g0.L(90.0f) && !ywVar.V) {
                qv qvVar = ywVar.F0;
                ValueAnimator valueAnimator = qvVar.I0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    qvVar.i(qvVar.f12205q0, true);
                    ywVar.V = true;
                    ywVar.getOrCreateStoryViewer().x(new eu(ywVar, 4));
                }
            }
        }
    }

    public static void u4(org.telegram.messenger.c cVar) {
        int i7 = cVar.f22778a;
        boolean[] zArr = A4;
        if (!zArr[i7]) {
            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
            s12.X2();
            s12.U2(0, 0, 100, true, null);
            if (s12.f25385s.isEmpty() && !TextUtils.isEmpty(s12.S3)) {
                TLRPC.TL_help_getRecentMeUrls tL_help_getRecentMeUrls = new TLRPC.TL_help_getRecentMeUrls();
                tL_help_getRecentMeUrls.referer = s12.S3;
                s12.getConnectionsManager().sendRequest(tL_help_getRecentMeUrls, new org.telegram.messenger.pj(s12, 4));
            }
            s12.g3(org.telegram.messenger.m10.i(i7).f(), false, 0);
            org.telegram.messenger.g5.r(i7).f();
            org.telegram.messenger.si.b0(i7).u(false);
            org.telegram.messenger.g0.i3(new bh(cVar, 18), 200L);
            Iterator it = s12.f25257d4.iterator();
            while (it.hasNext()) {
                org.telegram.messenger.si.b0(i7).c1((String) it.next(), true, true);
            }
            zArr[i7] = true;
        }
    }

    public static void v0(yw ywVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.G0(launchActivity, ywVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            wc1.a(ywVar.getParentActivity(), new x(ywVar, tL_attachMenuBot, launchActivity, 7), null);
        }
    }

    public static boolean v1(yw ywVar, xw xwVar) {
        if (!ywVar.H3.c()) {
            int i7 = (int) (-ywVar.O);
            int f42 = ywVar.f4();
            int g42 = ywVar.g4();
            if (i7 != 0 && i7 != f42 && i7 != g42 && xwVar.f53331a.canScrollVertically(-1)) {
                if (g42 < i7 && i7 < f42) {
                    int L = org.telegram.messenger.g0.L(48.0f);
                    int i10 = i7 - g42;
                    if (i10 < L / 2) {
                        xwVar.f53332b.w(-i10);
                        return true;
                    }
                    xwVar.f53332b.w(L - i10);
                    return true;
                }
                float f10 = 1.0f;
                if (ywVar.f53760w3 != 1.0f) {
                    f10 = Utilities.i((-ywVar.O) / org.telegram.messenger.g0.L(81.0f), 1.0f, 0.0f);
                }
                if (f10 < ywVar.F0.C0) {
                    xwVar.f53332b.w(-i7);
                    return true;
                }
                xwVar.f53332b.w(g42 - i7);
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
        ArrayList arrayList = ywVar.K2;
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
                    sb2.append(org.telegram.messenger.hd.M0(2131745901, null));
                } else {
                    if (arrayList.size() == 1) {
                        s5 = org.telegram.messenger.m5.l(ywVar.currentAccount, longValue);
                    } else {
                        s5 = org.telegram.messenger.m5.s(ywVar.currentAccount, longValue);
                    }
                    sb2.append(s5);
                }
            }
            return org.telegram.messenger.hd.a0(null, null, 2131745439, sb2.toString());
        }
        return org.telegram.messenger.hd.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public static void x0(final int i7, final long j3, TLRPC.Chat chat, final yw ywVar, final boolean z10, final boolean z11) {
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
                ywVar.getMessagesController().X(2, j3, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i7 == 102 && (i13 = ywVar.Y2) != 0 && ywVar.d4(ywVar.currentAccount, ywVar.f53673f0[0].f53338s, i13, false).size() == 1) {
            ywVar.f53673f0[0].f53340x.setVisibility(4);
        }
        int i14 = -1;
        if (i7 == 102) {
            ywVar.M4(true, true);
            if (ywVar.T1 != null) {
                i12 = 0;
                while (i12 < ywVar.T1.size()) {
                    if (((TLRPC.Dialog) ywVar.T1.get(i12)).f28055id == j3) {
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
            } else if (z11) {
                i11 = 1;
            } else {
                i11 = 95;
            }
            k42.j(i11, j3, new Runnable() {
                @Override
                public final void run() {
                    ywVar.C4(i7, j3, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(ywVar.d4(ywVar.currentAccount, ywVar.f53673f0[0].f53338s, ywVar.Y2, false));
        int i15 = 0;
        while (true) {
            if (i15 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i15)).f28055id == j3) {
                i14 = i15;
                break;
            } else {
                i15++;
            }
        }
        if (i7 == 102) {
            if (i10 >= 0 && i14 < 0 && (arrayList = ywVar.T1) != null) {
                arrayList.remove(i10);
                ywVar.f53673f0[0].f53341y.D();
                ywVar.f53673f0[0].q(true);
                return;
            }
            ywVar.M4(false, true);
        }
    }

    public static void y0(yw ywVar) {
        org.telegram.messenger.v1 a10 = org.telegram.messenger.v1.a(ywVar.currentAccount);
        int i7 = a10.f26921a;
        Set<String> set = a10.d;
        org.telegram.messenger.t1 t1Var = a10.f26923c;
        if (t1Var != null && !set.contains(t1Var.f26614a)) {
            set.add(a10.f26923c.f26614a);
            SharedPreferences.Editor edit = org.telegram.messenger.np.s1(i7).f25280f7.edit();
            edit.putStringSet("bday_hidden", set);
            edit.apply();
            org.telegram.messenger.ns.f(i7).k(org.telegram.messenger.ns.f25503g5, new Object[0]);
        }
        org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, "BIRTHDAY_CONTACTS_TODAY");
        ywVar.g5();
        org.telegram.ui.Components.xb G = org.telegram.ui.Components.cc.a0(ywVar).G(2131624034, 4, org.telegram.messenger.hd.M0(2131753330, null));
        G.f41643j = 5000;
        G.j();
    }

    public static void z0(yw ywVar) {
        org.telegram.messenger.np.s1(ywVar.currentAccount).k4(0L, "PREMIUM_RESTORE");
        ywVar.g5();
    }

    public final boolean A3(long j3) {
        int i7;
        int i10 = this.T0;
        if (i10 != 15 && i10 != 16 && this.f53695j2 == null && this.f53748u2) {
            if (org.telegram.messenger.m5.z(j3)) {
                long j10 = -j3;
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j10));
                if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                    if (!this.f53738s2) {
                        TLRPC.Chat M02 = org.telegram.messenger.np.s1(this.currentAccount).M0(Long.valueOf(j10));
                        if ((org.telegram.messenger.t3.n(M02) || M02.megagroup) && (i7 = this.V0) != 2 && i7 != 3) {
                            return true;
                        }
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M03 = org.telegram.messenger.hd.M0(2131745596, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.S = M03;
                    int i11 = this.V0;
                    if (i11 == 3) {
                        t1Var.U = org.telegram.messenger.hd.M0(2131744091, null);
                    } else if (i11 == 2) {
                        t1Var.U = org.telegram.messenger.hd.M0(2131746587, null);
                    } else {
                        t1Var.U = org.telegram.messenger.hd.M0(2131752440, null);
                    }
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747831, null), null);
                    showDialog(t1Var);
                    return false;
                }
                return true;
            } else if (org.telegram.messenger.m5.C(j3)) {
                if (this.V0 != 0 || this.W0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String M04 = org.telegram.messenger.hd.M0(2131745596, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                    t1Var2.S = M04;
                    int i12 = this.V0;
                    if (i12 == 3) {
                        t1Var2.U = org.telegram.messenger.hd.M0(2131744090, null);
                    } else if (i12 != 0) {
                        t1Var2.U = org.telegram.messenger.hd.M0(2131747176, null);
                    } else {
                        t1Var2.U = org.telegram.messenger.hd.M0(2131749104, null);
                    }
                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131747831, null), null);
                    showDialog(t1Var2);
                    return false;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public final boolean A4(View view, int i7, float f10, org.telegram.ui.Components.tj0 tj0Var) {
        org.telegram.ui.Components.cm0 cm0Var;
        long j3;
        org.telegram.ui.Components.cm0 cm0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long F;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.b3) && tj0Var.d(i7) != 21) {
            if (!this.actionBar.x() && !org.telegram.messenger.g0.Q1() && !this.f53712n2 && (view instanceof org.telegram.ui.Cells.t2)) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                if (!getMessagesController().t2(t2Var.getDialogId()) && !this.H3.c() && t2Var.b0(f10)) {
                    return T4(t2Var);
                }
            }
            uv uvVar = this.H3;
            if (uvVar == null || !uvVar.c()) {
                hw hwVar = this.D0;
                boolean z10 = true;
                if (hwVar != null && tj0Var == (cm0Var2 = hwVar.f36050e0)) {
                    Object I = cm0Var2.I(i7);
                    if (!this.D0.f36050e0.O) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String M0 = org.telegram.messenger.hd.M0(2131752054, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M0;
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) I;
                            if (chat.monoforum) {
                                t1Var.U = org.telegram.messenger.hd.a0("ClearSearchSingleChatAlertText", null, 2131752053, qg.c.i(this.currentAccount, chat, false));
                            } else {
                                t1Var.U = org.telegram.messenger.hd.a0("ClearSearchSingleChatAlertText", null, 2131752053, chat.title);
                            }
                            F = -chat.f28051id;
                        } else if (I instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) I;
                            if (user.f28200id == getUserConfig().f24953n) {
                                t1Var.U = org.telegram.messenger.hd.a0("ClearSearchSingleChatAlertText", null, 2131752053, org.telegram.messenger.hd.M0(2131745901, null));
                            } else {
                                t1Var.U = org.telegram.messenger.hd.a0("ClearSearchSingleUserAlertText", null, 2131752051, org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                            }
                            F = user.f28200id;
                        } else if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(((TLRPC.EncryptedChat) I).user_id));
                            t1Var.U = org.telegram.messenger.hd.a0("ClearSearchSingleUserAlertText", null, 2131752051, org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                            F = org.telegram.messenger.m5.F(encryptedChat.f28059id);
                        }
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752055, null), new ai.c0(this, F, 8));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        showDialog(t1Var);
                        TextView textView = (TextView) t1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, getResourceProvider());
                        }
                        return true;
                    }
                }
                hw hwVar2 = this.D0;
                if (hwVar2 != null && tj0Var == (cm0Var = hwVar2.f36050e0)) {
                    if (this.f53712n2) {
                        z4(view, i7, tj0Var);
                        return false;
                    }
                    if ((view instanceof org.telegram.ui.Cells.f6) && !cm0Var.N(i7)) {
                        j3 = ((org.telegram.ui.Cells.f6) view).getDialogId();
                    } else {
                        j3 = 0;
                    }
                    if (j3 != 0) {
                        Y4(j3, view);
                        return true;
                    }
                } else {
                    Object J = ((jg.m) tj0Var).J(i7);
                    if (J instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) J;
                        if (this.f53712n2) {
                            if ((this.T0 == 3 || U3()) && v5(dialog.f28055id)) {
                                if (this.T0 == 1 && U3() && this.f53717o2 && getMessagesController().t2(dialog.f28055id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f28055id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.T0 != 1) {
                                        z10 = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z10);
                                    bundle.putBoolean("quote", this.P0);
                                    bundle.putBoolean("reply_to", this.O0);
                                    u91 u91Var = new u91(bundle);
                                    u91Var.M0 = this;
                                    presentFragment(u91Var);
                                    return false;
                                }
                                s3(dialog.f28055id, view);
                                o5();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            y4(view);
                            return false;
                        } else if (!this.actionBar.x() || !s4(dialog)) {
                            Y4(dialog.f28055id, view);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final ui.f B() {
        return this.f53714n4;
    }

    public final void B3(boolean z10) {
        mi.j jVar;
        TLRPC.ChatFull chatFull;
        boolean z11;
        org.telegram.ui.Components.vr vrVar = this.L1;
        if (vrVar != null && (jVar = this.S1) != null && (chatFull = this.f53660c3) != null) {
            if (this.f53648a3 != 0 && chatFull.requests_pending > 0 && !this.f53650b.f57082f) {
                z11 = true;
            } else {
                z11 = false;
            }
            vrVar.i(jVar, z11, z10);
            this.S1.setTitle(org.telegram.messenger.hd.G(this.f53660c3.requests_pending, "CommunityPendingRequestsRow", new Object[0]));
        }
    }

    public final void B4(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i7 = 0; i7 < 4; i7++) {
            if (org.telegram.messenger.m10.i(i7).p()) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        Collections.sort(arrayList, new me(24));
        org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(this, view);
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
                int i11 = org.telegram.ui.ActionBar.j6.f28941i6;
                Drawable a02 = org.telegram.ui.ActionBar.j6.a0(getThemedColor(i11), 0, 0);
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
                org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.q6.j(linearLayout, a02, null, M, resourceProvider);
                TLRPC.User f10 = org.telegram.messenger.m10.i(intValue).f();
                org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                t8Var.r(f10);
                hi.q3 q3Var = new hi.q3(this, getParentActivity(), z10);
                linearLayout.addView(q3Var, c8.ja.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(getParentActivity());
                if (z10) {
                    i9Var.setScaleX(0.833f);
                    i9Var.setScaleY(0.833f);
                }
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
                i9Var.getImageReceiver().d = intValue;
                i9Var.f(f10, t8Var);
                q3Var.addView(i9Var, c8.ja.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, getResourceProvider());
                textView.setText(org.telegram.messenger.q10.p(f10));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, c8.ja.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new bi.x2(this, intValue, H, 17));
                H.r(linearLayout, c8.ja.o(230, 48));
            }
        }
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(24.0f), getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.j6.r1(0.15f, -16777216));
        H.f37117z.set(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        H.W(d02);
        H.a0(0.0f, -org.telegram.messenger.g0.L(4.0f));
        H.V(5);
        H.Z();
    }

    public final void C3(org.telegram.ui.xw r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.C3(org.telegram.ui.xw):void");
    }

    public final void C4(int i7, long j3, TLRPC.Chat chat, boolean z10, boolean z11) {
        if (i7 == 103) {
            getMessagesController().X(1, j3, z11);
            return;
        }
        if (chat != null) {
            if (org.telegram.messenger.t3.r0(chat)) {
                getMessagesController().X(0, j3, z11);
            } else {
                getMessagesController().g0(-j3, getMessagesController().a2(Long.valueOf(getUserConfig().e())), null, z11, false);
            }
        } else {
            getMessagesController().X(0, j3, z11);
            if (z10 && z11) {
                getMessagesController().w(j3);
            }
        }
        if (org.telegram.messenger.g0.Q1()) {
            getNotificationCenter().k(org.telegram.messenger.ns.f25572t, Long.valueOf(j3));
        }
        getMessagesController().J(this.Y2);
    }

    public final void D3() {
        getMessagesStorage().getClass();
    }

    public final void D4(java.util.ArrayList r42, int r43, boolean r44, boolean r45, java.util.HashSet r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.D4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    @Override
    public final void E(float f10, int i7) {
        org.telegram.ui.ActionBar.q0 q0Var;
        if (i7 == 3 && (q0Var = this.m0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) q0Var.getIconView().getDrawable();
            if (this.d.f57082f) {
                animatedVectorDrawable.start();
                if (org.telegram.messenger.gz.o() != 0) {
                    TLRPC.TL_help_premiumPromo tL_help_premiumPromo = org.telegram.messenger.si.b0(this.currentAccount).E;
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

    public final void E3() {
        if (this.f53673f0 != null) {
            int w32 = w3();
            int i7 = 0;
            while (true) {
                xw[] xwVarArr = this.f53673f0;
                if (i7 < xwVarArr.length) {
                    xw xwVar = xwVarArr[i7];
                    if (xwVar != null) {
                        uw uwVar = xwVar.f53331a;
                        uwVar.setPadding(0, uwVar.f39613g3, 0, w32);
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void E4(long r14, boolean r16, org.telegram.messenger.so r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.E4(long, boolean, org.telegram.messenger.so, int, boolean):void");
    }

    @Override
    public final List F() {
        return Arrays.asList(new pg.a(org.telegram.messenger.hd.M0(2131751648, null)), new pg.a(org.telegram.messenger.hd.M0(2131752076, null), new eu(this, 14)), new pg.a(org.telegram.messenger.hd.M0(2131751649, null), new eu(this, 15)));
    }

    public final void F3() {
        jh.f fVar = this.A1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.A1.getInputBubbleHeight() + this.f53756w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f));
        }
    }

    public final void F4() {
        if (this.L0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.L0.setBackground(new BitmapDrawable(createBitmap));
        this.L0.setAlpha(0.0f);
        this.L0.setVisibility(0);
        N3();
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        int i10;
        int i11;
        int i12 = 8;
        if (i7 == 1) {
            O3();
            Q3();
            T3();
            G3();
            R3();
            nw nwVar = this.Y;
            te.a aVar = this.f53650b;
            nwVar.setBlurredBackgroundVisibility(aVar.f57081e);
            float a10 = a8.m7.a(aVar.f57081e);
            org.telegram.ui.Components.i9 i9Var = this.f53664d3;
            if (i9Var != null) {
                i9Var.setScaleX(a10);
                this.f53664d3.setScaleY(a10);
                this.f53664d3.setAlpha(a10);
                org.telegram.ui.Components.i9 i9Var2 = this.f53664d3;
                if (a10 > 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                i9Var2.setVisibility(i11);
            }
            if (this.f53757w0 != null) {
                float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, a10);
                this.f53757w0.setScaleX(T1);
                this.f53757w0.setScaleY(T1);
                this.f53757w0.setAlpha(a10);
                hi.d dVar = this.f53757w0;
                int i13 = (a10 > 0.0f ? 1 : (a10 == 0.0f ? 0 : -1));
                if (i13 > 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                dVar.setVisibility(i10);
                this.f53763x0.setAlpha(a10);
                lh.f fVar = this.f53763x0;
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

    public final void G3() {
        int i7;
        xw xwVar;
        boolean z10 = true;
        float e42 = e4(true);
        ow owVar = this.A0;
        if (owVar != null) {
            if (owVar.getAlpha() == e42) {
                z10 = false;
            }
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, e42);
            this.A0.setAlpha(e42);
            this.A0.setScaleX(T1);
            this.A0.setScaleY(T1);
            ow owVar2 = this.A0;
            if (e42 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            owVar2.setVisibility(i7);
            if (z10 && (xwVar = this.f53673f0[0]) != null) {
                xwVar.f53331a.requestLayout();
            }
        }
        e5();
    }

    public final void G4(xw xwVar) {
        int i7;
        org.telegram.ui.Components.pz pzVar;
        if (xwVar.getVisibility() != 0) {
            return;
        }
        int i10 = xwVar.d.f17198w;
        if (xwVar.f53338s == 0 && l4() && xwVar.f53331a.getChildCount() == 0 && xwVar.f53339w == 2) {
            ((v4.b0) xwVar.f53331a.getLayoutManager()).h1(1, (int) this.O);
        }
        xwVar.d.getClass();
        xwVar.d.V();
        int b10 = xwVar.d.b();
        if (b10 == 1 && i10 == 1 && xwVar.d.d(0) == 5) {
            xwVar.q(true);
        } else {
            xwVar.q(false);
            if (b10 > i10 && (i7 = this.T0) != 11 && i7 != 12 && i7 != 13) {
                xwVar.E.b(i10);
            }
        }
        try {
            uw uwVar = xwVar.f53331a;
            if (this.Y2 == 0 && this.f53648a3 == 0) {
                pzVar = xwVar.f53340x;
            } else {
                pzVar = null;
            }
            uwVar.setEmptyView(pzVar);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        C3(xwVar);
    }

    public final void H3() {
        int i7;
        int i10;
        float f10 = this.f53710n.f57081e;
        float T1 = org.telegram.messenger.g0.T1(0.2f, 1.0f, f10);
        oi.u1 u1Var = this.E1;
        int i11 = 8;
        if (u1Var != null) {
            u1Var.setScaleX(T1);
            this.E1.setScaleY(T1);
            this.E1.setAlpha(f10);
            oi.u1 u1Var2 = this.E1;
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            u1Var2.setVisibility(i10);
        }
        jh.f fVar = this.A1;
        if (fVar != null) {
            fVar.setAlpha(f10);
            jh.f fVar2 = this.A1;
            int i12 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i12 > 0) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            fVar2.setVisibility(i7);
            this.A1.getFadeView().setAlpha(f10);
            View fadeView = this.A1.getFadeView();
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
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.I3, f10));
            animatorSet.setInterpolator(org.telegram.ui.Components.er.f34420f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    public final void I3() {
        if (this.actionBar == null) {
            return;
        }
        org.telegram.ui.Components.t00.d(this.actionBar.getBackButton(), Math.max(this.f53760w3, (1.0f - this.f53650b.f57081e) * (1.0f - h4()) * (1.0f - this.f53656c.f57081e)));
    }

    public final void I4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.I4(int):void");
    }

    public final void J3() {
        float f10;
        if (this.f53693j0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.t00.d(this.f53683h0, com.google.android.gms.internal.vision.e2.D(f10, 1.0f - this.f53650b.f57081e, 1.0f - h4(), 1.0f - this.f53656c.f57081e));
    }

    public final void J4(boolean z10, boolean z11) {
        int i7;
        int i10;
        uv uvVar = this.H3;
        if (uvVar != null && uvVar.c()) {
            return;
        }
        if (this.f53673f0[0].f53338s == 0 && l4() && this.f53673f0[0].f53339w == 2) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (this.L && !z11 && !this.F0.g()) {
            i10 = -org.telegram.messenger.g0.L(81.0f);
        } else {
            i10 = 0;
        }
        if (z10) {
            org.telegram.ui.Components.wi0 wi0Var = this.f53673f0[0].f53337r;
            wi0Var.f41354b = 1;
            wi0Var.d(i7, i10, false, false);
            H4();
            return;
        }
        this.f53673f0[0].f53333c.h1(i7, i10);
        H4();
    }

    public final void K3() {
        float f10;
        if (org.telegram.messenger.gz.f23978s.isEmpty()) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.t00.d(this.f53678g0, com.google.android.gms.internal.vision.e2.D(f10, 1.0f - this.f53650b.f57081e, 1.0f - h4(), 1.0f - this.f53656c.f57081e));
    }

    public final void K4(String str, boolean z10) {
        a5(true, false, true, false);
        bg.o0 o0Var = this.Z;
        if (o0Var != null) {
            o0Var.b(true);
        }
        nw nwVar = this.Y;
        if (nwVar != null) {
            nwVar.f40202r.setText(str);
            this.Y.f40202r.setSelection(str.length());
        }
    }

    public final void L3() {
        float f10;
        if (this.T0 != 2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.t00.d(this.f53697k0, com.google.android.gms.internal.vision.e2.D(f10, this.f53672f.f57081e, 1.0f - h4(), 1.0f - this.f53656c.f57081e));
        qv qvVar = this.F0;
        if (qvVar != null) {
            qvVar.invalidate();
        }
    }

    public final void L4(float f10) {
        xw[] xwVarArr;
        this.f53662d0 = f10;
        for (xw xwVar : this.f53673f0) {
            uw uwVar = xwVar.f53331a;
            for (int i7 = 0; i7 < uwVar.getChildCount(); i7++) {
                View childAt = uwVar.getChildAt(i7);
                if (childAt != null && RecyclerView.R(childAt) >= xwVar.d.f17194f + 1) {
                    childAt.setAlpha(f10);
                }
            }
        }
    }

    public final void M3() {
        org.telegram.ui.Components.t00.d(this.m0, com.google.android.gms.internal.vision.e2.D(this.f53650b.f57081e, 1.0f - h4(), 1.0f - this.f53656c.f57081e, this.d.f57081e));
    }

    public final void M4(boolean z10, boolean z11) {
        if (this.f53673f0 != null && this.U1 != z10) {
            if (z10) {
                this.T1 = new ArrayList(d4(this.currentAccount, this.f53673f0[0].f53338s, this.Y2, false));
            } else {
                this.T1 = null;
            }
            this.U1 = z10;
            xw xwVar = this.f53673f0[0];
            xwVar.d.H = z10;
            if (!z10 && z11) {
                if (xwVar.f53331a.c0()) {
                    this.f53673f0[0].f53331a.post(new eu(this, 25));
                } else {
                    this.f53673f0[0].d.f();
                }
            }
        }
    }

    public final void N3() {
        boolean z10;
        rv rvVar;
        if (!this.f53703l2 && ((rvVar = this.L0) == null || rvVar.getBackground() == null || this.L0.getAlpha() < 0.01f || this.L0.getVisibility() == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        f fVar = this.K3;
        if (fVar != null) {
            ((je0) fVar.f46946b).f48314w.a(z10, true);
        }
    }

    public final void N4(boolean z10) {
        xw xwVar;
        if (org.telegram.messenger.gz.o() > 1 && org.telegram.messenger.qc.e(32768)) {
            if (z10) {
                xw[] xwVarArr = this.f53673f0;
                if (xwVarArr != null && (xwVar = xwVarArr[0]) != null) {
                    xwVar.setLayerType(2, null);
                    this.f53673f0[0].setClipChildren(false);
                    this.f53673f0[0].setClipToPadding(false);
                    this.f53673f0[0].f53331a.setClipChildren(false);
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
            if (this.f53673f0 != null) {
                int i7 = 0;
                while (true) {
                    xw[] xwVarArr2 = this.f53673f0;
                    if (i7 >= xwVarArr2.length) {
                        break;
                    }
                    xw xwVar2 = xwVarArr2[i7];
                    if (xwVar2 != null) {
                        xwVar2.setLayerType(0, null);
                        xwVar2.setClipChildren(true);
                        xwVar2.setClipToPadding(true);
                        xwVar2.f53331a.setClipChildren(true);
                    }
                    i7++;
                }
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setLayerType(0, null);
            }
            qv qvVar = this.F0;
            if (qvVar != null) {
                qvVar.setLayerType(0, null);
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
        org.telegram.ui.Components.t00.d(this.f53702l0, (1.0f - this.f53650b.f57081e) * (1.0f - h4()) * (1.0f - this.f53656c.f57081e));
        J3();
        M3();
        K3();
        L3();
    }

    public final void O4(float f10) {
        xw[] xwVarArr = this.f53673f0;
        int i7 = 0;
        if (xwVarArr != null) {
            int paddingTop = xwVarArr[0].f53331a.getPaddingTop() + ((int) f10);
            int i10 = 0;
            while (true) {
                xw[] xwVarArr2 = this.f53673f0;
                if (i10 >= xwVarArr2.length) {
                    break;
                }
                xwVarArr2[i10].f53331a.setTopGlowOffset(paddingTop);
                i10++;
            }
        }
        if (this.fragmentView != null && f10 != this.O) {
            this.O = f10;
            org.telegram.ui.Components.xb xbVar = this.f53727q3;
            if (xbVar != null) {
                xbVar.l();
            }
            if (this.G3 != null) {
                float currentActionBarHeight = 1.0f - ((-f10) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                org.telegram.ui.Cells.o oVar = this.G3;
                float f11 = (int) f10;
                float f12 = oVar.f30782f;
                oVar.h = f11;
                oVar.setTranslationY(f12 + f11);
                this.G3.setAlpha(c8.i9.a(currentActionBarHeight, 0.0f, 1.0f));
                org.telegram.ui.Cells.o oVar2 = this.G3;
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
        String M0 = org.telegram.messenger.hd.M0(i7, null);
        this.Y.f40202r.setContentDescription(M0);
        this.Y.f40202r.setHint(M0);
    }

    public final void P4(float f10) {
        this.f53775z1 = f10;
        n5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (org.telegram.messenger.gz.o() != 0) {
            org.telegram.messenger.qc.e(32768);
        }
        e5();
    }

    public final void Q3() {
        float f10;
        int i7;
        if (this.Y == null) {
            return;
        }
        float a10 = 1.0f - c8.i9.a(((-this.O) - g4()) / org.telegram.messenger.g0.L(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.f53760w3, this.h.f57081e);
        float f11 = this.f53650b.f57081e;
        if (this.T0 != 2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float max2 = f10 * (1.0f - this.f53656c.f57081e) * (1.0f - max) * Math.max(f11, (1.0f - h4()) * a10);
        this.Y.setAlpha(max2);
        nw nwVar = this.Y;
        boolean z10 = false;
        if (max2 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        nwVar.setVisibility(i7);
        if (max2 <= 0.01f) {
            z10 = true;
        }
        this.f53672f.a(z10, true);
    }

    public final void Q4(CharSequence charSequence, String str) {
        if (str != null && !str.isEmpty()) {
            this.G2 = str;
            this.H2 = null;
            this.F2 = null;
            if (this.D1 != null) {
                v3(charSequence);
                return;
            } else {
                this.W3 = charSequence;
                return;
            }
        }
        this.G2 = null;
        this.H2 = null;
    }

    public final void R3() {
        int i7;
        float f10;
        int i10;
        int i11 = 8;
        if (this.f53645a0 != null) {
            if (this.f53651b0 != null) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float f11 = f10 * this.f53650b.f57081e;
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, f11);
            this.f53645a0.setScaleX(T1);
            this.f53645a0.setScaleY(T1);
            this.f53645a0.setAlpha(f11);
            az0 az0Var = this.f53645a0;
            if (f11 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            az0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.v61 v61Var = this.f53651b0;
        te.a aVar = this.f53735s;
        if (v61Var != null) {
            float f12 = 1.0f - aVar.f57081e;
            v61Var.setAlpha(f12);
            org.telegram.ui.Components.v61 v61Var2 = this.f53651b0;
            if (f12 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            v61Var2.setVisibility(i7);
        }
        jg.q0 q0Var = this.f53657c0;
        if (q0Var != null) {
            float f13 = aVar.f57081e;
            q0Var.setAlpha(f13);
            jg.q0 q0Var2 = this.f53657c0;
            if (f13 > 0.0f) {
                i11 = 0;
            }
            q0Var2.setVisibility(i11);
        }
    }

    public final void R4(float f10) {
        if (org.telegram.messenger.gz.o() <= 0) {
            boolean z10 = org.telegram.messenger.r2.f26198a;
        } else if (this.Y3 != f10) {
            boolean z11 = true;
            if (org.telegram.messenger.gz.o() > 1 && org.telegram.messenger.qc.e(32768)) {
                z11 = false;
            }
            this.Z3 = z11;
            this.Y3 = f10;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.Z3) {
                float f11 = (1.0f - this.Y3) * (-org.telegram.messenger.g0.L(40.0f));
                qv qvVar = this.F0;
                if (qvVar != null) {
                    qvVar.setTranslationX(f11);
                }
                nw nwVar = this.Y;
                if (nwVar != null) {
                    nwVar.setTranslationX(f11);
                }
                uv uvVar = this.H3;
                if (uvVar != null && uvVar.getFragmentView() != null && !this.E) {
                    this.H3.getFragmentView().setTranslationX(f11);
                    return;
                }
                return;
            }
            float f12 = 1.0f - this.Y3;
            float f13 = (-org.telegram.messenger.g0.L(4.0f)) * f12;
            float f14 = 1.0f - (f12 * 0.05f);
            qv qvVar2 = this.F0;
            if (qvVar2 != null) {
                qvVar2.setScaleX(f14);
                this.F0.setScaleY(f14);
                this.F0.setTranslationX(f13);
                this.F0.setPivotX(0.0f);
                this.F0.setPivotY(0.0f);
            }
            nw nwVar2 = this.Y;
            if (nwVar2 != null) {
                nwVar2.setTranslationX(f13);
                this.Y.setScaleX(f14);
                this.Y.setScaleY(f14);
            }
            uv uvVar2 = this.H3;
            if (uvVar2 != null && uvVar2.getFragmentView() != null) {
                if (!this.E) {
                    this.H3.getFragmentView().setScaleX(f14);
                    this.H3.getFragmentView().setScaleY(f14);
                    this.H3.getFragmentView().setTranslationX(f13);
                }
                this.H3.getFragmentView().setPivotX(0.0f);
                this.H3.getFragmentView().setPivotY(0.0f);
            }
        }
    }

    public final void S3(boolean z10) {
        int i7;
        int i10;
        if (this.D0 != null && this.actionBar != null) {
            int i11 = org.telegram.messenger.g0.f23604n;
            int measuredHeight = this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(this.f53644a);
            if (this.f53651b0 != null) {
                i7 = org.telegram.messenger.g0.L(50.0f);
            } else {
                i7 = 0;
            }
            int i12 = measuredHeight + i7;
            org.telegram.ui.Components.vr vrVar = this.L1;
            if (vrVar != null) {
                i10 = (int) vrVar.c(org.telegram.messenger.g0.L(7.0f));
            } else {
                i10 = 0;
            }
            int i13 = i12 + i10;
            hw hwVar = this.D0;
            SparseArray sparseArray = hwVar.h;
            hwVar.X0 = i13;
            hwVar.Y0 = i11;
            di.c1 c1Var = hwVar.f36047b0;
            if (z10) {
                c1Var.q1(0, i13, 0, i11);
            } else {
                c1Var.setPadding(0, i13, 0, i11);
            }
            hwVar.P0.j(hwVar.X0, hwVar.Y0, z10);
            org.telegram.ui.Components.wl0 wl0Var = hwVar.f36048c0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wl0Var.getLayoutParams();
            int i14 = marginLayoutParams.topMargin;
            int i15 = hwVar.X0;
            if (i14 != i15 || marginLayoutParams.bottomMargin != hwVar.Y0) {
                marginLayoutParams.topMargin = i15;
                marginLayoutParams.bottomMargin = hwVar.Y0;
                wl0Var.requestLayout();
            }
            org.telegram.ui.Components.jm0.P(hwVar.f36054i0, hwVar.f36057l0, hwVar.X0, hwVar.Y0, z10);
            org.telegram.ui.Components.jm0.P(hwVar.f36058n0, hwVar.f36061q0, hwVar.X0, hwVar.Y0, z10);
            org.telegram.ui.Components.jm0.P(hwVar.f36065u0, hwVar.f36068x0, hwVar.X0, hwVar.Y0, z10);
            org.telegram.ui.Components.cf0 cf0Var = hwVar.f36063s0;
            int i16 = hwVar.X0;
            int i17 = hwVar.Y0;
            cf0Var.setClipToPadding(false);
            org.telegram.ui.Components.u41 u41Var = cf0Var.f33546c;
            cf0Var.K = z10;
            cf0Var.setPadding(0, i16, 0, i17);
            if (z10) {
                u41Var.q1(0, i16, 0, i17);
            } else {
                u41Var.setPadding(0, i16, 0, i17);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) u41Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i16;
            marginLayoutParams2.bottomMargin = -i17;
            cf0Var.K = false;
            org.telegram.ui.Components.il0 il0Var = hwVar.J0;
            if (il0Var != null) {
                il0Var.b(hwVar.X0, hwVar.Y0, z10);
            }
            int size = sparseArray.size();
            for (int i18 = 0; i18 < size; i18++) {
                View view = (View) sparseArray.valueAt(i18);
                if (view instanceof zz) {
                    ((zz) view).j(hwVar.X0, hwVar.Y0, z10);
                }
            }
            for (int i19 = 0; i19 < hwVar.getChildCount(); i19++) {
                if (hwVar.getChildAt(i19) instanceof zz) {
                    ((zz) hwVar.getChildAt(i19)).j(hwVar.X0, hwVar.Y0, z10);
                }
            }
        }
    }

    public final void S4() {
        getContactsController().B();
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.voip.u(8, this, r1), new bh(r1, 17));
        org.telegram.ui.ActionBar.u2 i7 = org.telegram.messenger.i20.i(getParentActivity(), false, 1, getResourceProvider());
        i7.O = n6Var;
        i7.V0 = 49;
        i7.show();
        org.telegram.ui.ActionBar.u2[] u2VarArr = {i7};
        i7.Q(org.telegram.ui.ActionBar.j6.f28922h5);
    }

    public final void T3() {
        if (this.L1 != null) {
            float T1 = org.telegram.messenger.g0.T1(0.98f, 1.0f, 1.0f);
            this.L1.setAlpha(1.0f);
            this.L1.setScaleX(T1);
            this.L1.setScaleY(T1);
            this.L1.setVisibility(0);
        }
    }

    public final boolean T4(org.telegram.ui.Cells.t2 r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.T4(org.telegram.ui.Cells.t2):boolean");
    }

    public boolean U3() {
        if (this.T0 == 10) {
            return true;
        }
        return false;
    }

    public final void U4(boolean z10) {
        float f10;
        this.f53656c.a(z10, true);
        if (this.f53711n0 == null) {
            return;
        }
        AnimatorSet animatorSet = this.Q3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Q3 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.Q3 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            this.f53711n0.setVisibility(0);
        } else {
            this.f53711n0.setSelected(false);
            Drawable background = this.f53711n0.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.ActionBar.q0 q0Var = this.f53711n0;
        Property property = View.ALPHA;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(q0Var, property, f10));
        this.Q3.playTogether(arrayList);
        this.Q3.addListener(new aw(this, z10, 1));
        this.Q3.start();
    }

    public final void V3() {
        if (org.telegram.messenger.g0.Q1()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.n(true);
            }
            TLObject tLObject = this.Z1;
            if (tLObject != null) {
                hw hwVar = this.D0;
                if (hwVar != null) {
                    hwVar.f36050e0.Q(this.Y1, tLObject);
                }
                this.Z1 = null;
                return;
            }
            return;
        }
        this.X1 = true;
    }

    public final void V4() {
        if (!this.B0 && getMessagesController().V0 && getMessagesController().K3 && this.A0 != null && getMessagesController().T0().isEmpty() && !this.isPaused && getUserConfig().Q && !this.inPreviewMode) {
            SharedPreferences e12 = org.telegram.messenger.np.e1();
            if (!e12.getBoolean("filterhint", false)) {
                e12.edit().putBoolean("filterhint", true).apply();
                org.telegram.messenger.g0.i3(new eu(this, 26), 1000L);
            }
        }
    }

    public final void W3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.f29304o0) {
            kVar.n(true);
            this.f53739s3 = false;
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
        org.telegram.ui.Components.voip.u uVar;
        org.telegram.ui.ActionBar.z0 z0Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        int w02;
        int w03;
        int w04;
        int i11;
        int w05;
        org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(this, this.f53702l0);
        int i12 = org.telegram.ui.ActionBar.j6.A8;
        H.S(getThemedColor(i12), getThemedColor(i12));
        H.f37111s = 8;
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) parentActivity;
        } else {
            launchActivity = null;
        }
        float f11 = 64.0f;
        int i13 = 0;
        if (this.f53648a3 != 0) {
            if (org.telegram.messenger.t3.N(this.f53654b3)) {
                H.c(2131232107, org.telegram.messenger.hd.M0(2131751913, null), new av(this, 1), false);
                H.k();
            }
            H.i(new av(this, 4), org.telegram.messenger.hd.M0(2131751912, null), this.f53654b3.collapsed_in_dialogs);
            H.i(new av(this, 5), org.telegram.messenger.hd.M0(2131751911, null), !this.f53654b3.collapsed_in_dialogs);
            H.Z();
            H.X(-org.telegram.messenger.g0.L(64.0f));
        } else if (q4()) {
            H.c(2131232107, org.telegram.messenger.hd.M0(2131754143, null), new av(this, 6), false);
            H.c(2131232183, org.telegram.messenger.hd.M0(2131749276, null), new av(this, 7), false);
            H.Z();
            H.X(-org.telegram.messenger.g0.L(64.0f));
        } else {
            org.telegram.ui.ActionBar.e6 e6Var2 = this.resourceProvider;
            if (e6Var2 != null) {
                q10 = e6Var2.a();
            } else {
                q10 = org.telegram.ui.ActionBar.j6.I.q();
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
            H.c(i7, org.telegram.messenger.hd.M0(i10, null), new av(this, 8), false);
            H.k();
            H.c(2131232484, org.telegram.messenger.hd.M0(2131748273, null), new av(this, 9), false);
            int i14 = 10;
            H.c(2131232505, org.telegram.messenger.hd.M0(2131745901, null), new av(this, 10), false);
            org.telegram.messenger.t0 t0Var = org.telegram.messenger.t0.f26599a;
            if (((org.telegram.messenger.h0) getMessagesController().f25448y7.f25852j0.f14544b).f24006c) {
                H.c(2131231275, org.telegram.messenger.hd.M0(2131743194, null), new eu(this, 0), false);
            } else {
                TLRPC.TL_attachMenuBots tL_attachMenuBots = org.telegram.messenger.si.b0(org.telegram.messenger.m10.f24934t0).f26461b;
                if (launchActivity != null && tL_attachMenuBots != null && (arrayList = tL_attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = tL_attachMenuBots.bots;
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i15);
                        i15++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_side_menu) {
                            fu fuVar2 = new fu(this, tL_attachMenuBot2, launchActivity, i13);
                            org.telegram.ui.Components.voip.u uVar2 = new org.telegram.ui.Components.voip.u(i14, this, tL_attachMenuBot2);
                            org.telegram.ui.ActionBar.e6 e6Var3 = H.d;
                            if (H.f37086e != null) {
                                int i16 = org.telegram.ui.ActionBar.j6.F8;
                                int i17 = org.telegram.ui.ActionBar.j6.E8;
                                f10 = f11;
                                org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(0, H.f37086e, H.d, false, false);
                                z0Var2.setPadding(org.telegram.messenger.g0.L(18.0f), i13, org.telegram.messenger.g0.L(18.0f), i13);
                                if (tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                    charSequence = org.telegram.ui.Cells.l8.b(tL_attachMenuBot2.short_name);
                                } else {
                                    charSequence = tL_attachMenuBot2.short_name;
                                }
                                Pattern pattern = org.telegram.messenger.si.S1;
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
                                    org.telegram.messenger.pz f12 = org.telegram.messenger.t5.f(tL_attachMenuBotIcon.icon, org.telegram.ui.ActionBar.j6.f28832c7, 1.0f, null);
                                    if (f12 != null) {
                                        Integer num = H.f37098k0;
                                        if (num != null) {
                                            w05 = num.intValue();
                                        } else {
                                            w05 = org.telegram.ui.ActionBar.j6.w0(i16, e6Var3);
                                        }
                                        new PorterDuffColorFilter(w05, PorterDuff.Mode.SRC_IN);
                                    }
                                    org.telegram.messenger.gc b10 = org.telegram.messenger.gc.b(tL_attachMenuBotIcon.icon);
                                    fuVar = fuVar2;
                                    z0Var = z0Var2;
                                    e6Var = e6Var3;
                                    uVar = uVar2;
                                    z0Var.k(charSequence, b10, "24_24", f12, tL_attachMenuBot2);
                                    org.telegram.ui.Components.i9 i9Var = z0Var.h;
                                    if (i9Var != null) {
                                        if (org.telegram.messenger.hd.f24101a0) {
                                            i11 = 5;
                                        } else {
                                            i11 = 3;
                                        }
                                        i9Var.setLayoutParams(c8.ja.e(24, 24, i11 | 16));
                                    }
                                } else {
                                    fuVar = fuVar2;
                                    uVar = uVar2;
                                    z0Var = z0Var2;
                                    e6Var = e6Var3;
                                    z0Var.j(charSequence, 2131232073, null);
                                }
                                Integer num2 = H.f37096j0;
                                if (num2 == null && H.f37098k0 == null) {
                                    z0Var.c(i17, i16);
                                } else {
                                    if (num2 != null) {
                                        w02 = num2.intValue();
                                    } else {
                                        w02 = org.telegram.ui.ActionBar.j6.w0(i17, e6Var);
                                    }
                                    Integer num3 = H.f37098k0;
                                    if (num3 != null) {
                                        w03 = num3.intValue();
                                    } else {
                                        w03 = org.telegram.ui.ActionBar.j6.w0(i16, e6Var);
                                    }
                                    z0Var.d(w02, w03);
                                }
                                Integer num4 = H.f37098k0;
                                if (num4 != null) {
                                    w04 = num4.intValue();
                                } else {
                                    w04 = org.telegram.ui.ActionBar.j6.w0(i16, e6Var);
                                }
                                z0Var.setIconColorImage(w04);
                                Integer num5 = H.f37100l0;
                                if (num5 != null) {
                                    z0Var.setSelectorColor(num5.intValue());
                                } else {
                                    z0Var.h(0.12f, i17);
                                }
                                z0Var.setOnClickListener(new org.telegram.ui.Components.n2(23, H, fuVar));
                                z0Var.setOnLongClickListener(new fi.b2(3, H, uVar));
                                int i20 = H.S;
                                if (i20 > 0) {
                                    z0Var.setMinimumWidth(org.telegram.messenger.g0.L(i20));
                                    H.r(z0Var, c8.ja.o(H.S, -2));
                                } else {
                                    H.r(z0Var, c8.ja.o(-1, -2));
                                }
                                arrayList3 = arrayList2;
                                launchActivity = launchActivity2;
                                f11 = f10;
                                i14 = 10;
                                i13 = 0;
                            }
                        }
                        arrayList2 = arrayList3;
                        launchActivity2 = launchActivity;
                        f10 = f11;
                        arrayList3 = arrayList2;
                        launchActivity = launchActivity2;
                        f11 = f10;
                        i14 = 10;
                        i13 = 0;
                    }
                }
            }
            float f13 = f11;
            if (getUserConfig().X) {
                H.c(2131232362, org.telegram.messenger.hd.M0(2131745495, null), new av(this, 3), false);
            }
            org.telegram.ui.ActionBar.z0 z0Var3 = this.f53719p0;
            if (z0Var3 != null) {
                org.telegram.ui.ActionBar.q6.U(z0Var3.f29900b, org.telegram.ui.ActionBar.j6.Ri, getResourceProvider());
                this.f53719p0.setOnClickListener(new org.telegram.ui.Components.vv0(20, this, H));
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26600b.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().f25453z3 && !org.telegram.messenger.gz.f24000z1.isEmpty())) {
                    H.k();
                    H.d(this.f53719p0);
                }
            }
            H.Z();
            H.X(-org.telegram.messenger.g0.L(f13));
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent, boolean z10) {
        uv uvVar;
        rv rvVar;
        ow owVar;
        boolean z11;
        boolean z12;
        if (!this.f53739s3 && (((uvVar = this.H3) == null || !uvVar.c()) && (((rvVar = this.L0) == null || rvVar.getVisibility() != 0) && ((owVar = this.A0) == null || !owVar.f35798n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                ow owVar2 = this.A0;
                if (owVar2 != null && owVar2.getTabsCount() >= 2 && this.A0.getCurrentTabId() != this.A0.getFirstTabId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                ow owVar3 = this.A0;
                if (owVar3 != null && owVar3.getTabsCount() >= 2 && this.A0.getCurrentTabId() != this.A0.getLastTabId()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                org.telegram.messenger.gz.m(this.currentAccount);
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
        if (this.actionBar.c(str)) {
            return;
        }
        org.telegram.ui.ActionBar.y p10 = this.actionBar.p(str);
        boolean z10 = this.X;
        ArrayList arrayList = this.f53698k1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f53689i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f53689i1.setImageDrawable(new org.telegram.ui.ActionBar.x1(true));
            org.telegram.ui.ActionBar.q6.s(this.f53689i1, org.telegram.ui.ActionBar.j6.f29243y8, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            ImageView imageView2 = this.f53689i1;
            int i7 = org.telegram.ui.ActionBar.j6.f29262z8;
            org.telegram.ui.ActionBar.q6.Q(imageView2, org.telegram.ui.ActionBar.j6.h0(getThemedColor(i7), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i7), getResourceProvider());
            this.f53689i1.setOnClickListener(new gu(this, 6));
            p10.addView(this.f53689i1, c8.ja.r(54, 54, 16));
            arrayList.add(this.f53689i1);
        }
        NumberTextView numberTextView = new NumberTextView(p10.getContext());
        this.f53694j1 = numberTextView;
        int i10 = 18;
        numberTextView.setTextSize(18);
        this.f53694j1.setTypeface(org.telegram.messenger.g0.o());
        this.f53694j1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f29243y8));
        NumberTextView numberTextView2 = this.f53694j1;
        if (!this.X) {
            i10 = 72;
        }
        p10.addView(numberTextView2, c8.ja.m(1.0f, 0, -1, i10, 0, 0));
        this.f53694j1.setOnTouchListener(new gi.a(2));
        this.f53706m1 = p10.g(100, 2131232294, org.telegram.messenger.g0.L(48.0f));
        this.n1 = p10.g(104, 2131232257, org.telegram.messenger.g0.L(48.0f));
        this.f53716o1 = p10.g(107, 2131232052, org.telegram.messenger.g0.L(48.0f));
        this.l1 = p10.h(102, 2131232109, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.hd.M0(2131751598, null));
        org.telegram.ui.ActionBar.q0 h = p10.h(0, 2131231244, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.hd.M0(2131754839, null));
        p10.addView(new View(getParentActivity()), c8.ja.o(5, -1));
        this.f53737s1 = h.e(105, 2131232052, org.telegram.messenger.hd.M0(2131754172, null));
        this.f53720p1 = h.e(108, 2131232294, org.telegram.messenger.hd.M0(2131751453, null));
        this.f53725q1 = h.e(109, 2131232047, org.telegram.messenger.hd.M0(2131750812, null));
        this.f53731r1 = h.e(110, 2131232330, org.telegram.messenger.hd.M0(2131750712, null));
        this.f53747u1 = h.e(101, 2131232216, org.telegram.messenger.hd.M0(2131748681, null));
        this.f53742t1 = h.e(103, 2131232093, org.telegram.messenger.hd.M0(2131752089, null));
        this.f53752v1 = h.e(106, 2131232068, org.telegram.messenger.hd.M0(2131753692, null));
        this.n1.setOnLongClickListener(new ru(this, 1));
        arrayList.add(this.f53706m1);
        arrayList.add(this.f53716o1);
        arrayList.add(this.n1);
        arrayList.add(this.l1);
        arrayList.add(h);
        f5(false);
    }

    public final void X4() {
        if (this.T3 == null) {
            for (String str : getMessagesController().T3) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = org.telegram.messenger.hd.M0(2131749319, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.S = M0;
                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749320, null));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131749533, null), new hu(this, 6));
                    showDialog(t1Var, new nu(this, 0));
                    this.T3 = str;
                    return;
                }
            }
        }
    }

    public final void Y3() {
        int i7;
        hw hwVar = this.D0;
        if ((hwVar != null && hwVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f53721p2 != null) {
            i7 = 2;
        } else if (!this.f53712n2) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        hw hwVar2 = new hw(this, getParentActivity(), this, i7, this.T0, this.Y2, this.f53648a3, new ev(this));
        this.D0 = hwVar2;
        this.glassEngine.c(hwVar2);
        ((rw) this.fragmentView).addView(this.D0, this.C0);
        hw hwVar3 = this.D0;
        hwVar3.f36050e0.V = new jw(this);
        hwVar3.f36057l0.setOnItemClickListener(new hu(this, 1));
        this.D0.f36061q0.setOnItemClickListener(new hu(this, 2));
        this.D0.f36068x0.setOnItemClickListener(new mu(this, 0));
        this.D0.f36061q0.setOnItemLongClickListener(new hu(this, 3));
        this.D0.f36047b0.setOnItemClickListener(new hu(this, 4));
        this.D0.f36047b0.setOnItemLongClickListener(new ev(this));
        this.D0.setFilteredSearchViewDelegate(new hu(this, 5));
        this.D0.setAlpha(0.0f);
        this.D0.setScaleX(1.05f);
        this.D0.setScaleY(1.05f);
        this.D0.setVisibility(8);
        this.D0.setBlurredBackgroundDrawableFactory(this.f53728q4);
    }

    public final void Y4(long j3, View view) {
        ArrayList d42;
        int i7;
        s3(j3, view);
        boolean x10 = this.actionBar.x();
        ArrayList arrayList = this.K2;
        boolean z10 = true;
        if (x10) {
            if (arrayList.isEmpty()) {
                n4(true);
                return;
            }
        } else {
            if (this.f53739s3) {
                X3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.p4)) {
                    this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
                }
            } else {
                X3(null);
            }
            org.telegram.messenger.g0.v1(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
            this.actionBar.R(null, null);
            int i10 = this.f53673f0[0].f53338s;
            if ((i10 != 7 && i10 != 8) || (this.actionBar.x() && !this.actionBar.y(null))) {
                d42 = getMessagesController().W0(this.Y2);
            } else {
                d42 = d4(this.currentAccount, this.f53673f0[0].f53338s, this.Y2, this.U1);
            }
            int size = d42.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) d42.get(i12);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (s4(dialog)) {
                        i11++;
                    } else if (!getMessagesController().C2(dialog.f28055id, false)) {
                        break;
                    }
                }
            }
            if (i11 > 1) {
                if (this.f53673f0 != null) {
                    int i13 = 0;
                    while (true) {
                        xw[] xwVarArr = this.f53673f0;
                        if (i13 >= xwVarArr.length) {
                            break;
                        }
                        xwVarArr[i13].d.I = true;
                        i13++;
                    }
                }
                int i14 = org.telegram.messenger.np.D8;
                u5(131072, true);
            }
            if (!this.f53739s3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f53698k1;
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
            ValueAnimator valueAnimator = this.f53766x3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f53766x3 = ValueAnimator.ofFloat(this.f53760w3, 1.0f);
            int i16 = 0;
            while (true) {
                xw[] xwVarArr2 = this.f53673f0;
                if (i16 >= xwVarArr2.length) {
                    break;
                }
                xw xwVar = xwVarArr2[i16];
                if (xwVar != null) {
                    xwVar.f53331a.I0(true);
                }
                i16++;
            }
            if (this.L) {
                i7 = 81;
            } else {
                i7 = 0;
            }
            float max = Math.max(0.0f, org.telegram.messenger.g0.L(i7 + 48) + this.O);
            if (max != 0.0f) {
                this.Q = (int) max;
                this.fragmentView.requestLayout();
            }
            this.f53766x3.addUpdateListener(new iu(this, max, 0));
            this.f53766x3.addListener(new cw(this, max, 1));
            this.f53766x3.setInterpolator(org.telegram.ui.Components.er.f34420f);
            this.f53766x3.setDuration(200L);
            this.f53766x3.start();
            ow owVar = this.A0;
            if (owVar != null) {
                owVar.b(org.telegram.ui.ActionBar.j6.f29233xi, org.telegram.ui.ActionBar.j6.f29214wi, org.telegram.ui.ActionBar.j6.f29195vi, org.telegram.ui.ActionBar.j6.f29252yi, org.telegram.ui.ActionBar.j6.f29205w8);
            }
            org.telegram.ui.ActionBar.x1 x1Var = this.f53679g1;
            if (x1Var != null) {
                x1Var.c(true, 1.0f);
            }
            z10 = false;
        }
        f5(false);
        this.f53694j1.a(arrayList.size(), z10);
    }

    public final void Z3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f53774z0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i7 = 0; i7 < 2; i7++) {
                undoViewArr[i7] = new dw(this, parentActivity);
                FrameLayout.LayoutParams d = c8.ja.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.f53687h4 + this.f53696j4 + d.bottomMargin;
                UndoView undoView = undoViewArr[i7];
                int i10 = this.f53769y0 + 1;
                this.f53769y0 = i10;
                ((rw) this.fragmentView).addView(undoView, i10, d);
            }
        }
    }

    public final void Z4(long j3, View view) {
        String str;
        org.telegram.ui.Components.xb K;
        int i7 = -this.N3;
        this.N3 = i7;
        org.telegram.messenger.g0.F3(i7, view, null);
        org.telegram.messenger.p2.APP_ERROR.a();
        if (j3 >= 0) {
            str = org.telegram.messenger.q10.p(org.telegram.messenger.np.s1(this.currentAccount).a2(Long.valueOf(j3)));
        } else {
            str = "";
        }
        if (getMessagesController().D3()) {
            K = org.telegram.ui.Components.cc.a0(this).Q(2131624217, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131743760, str)));
        } else {
            K = org.telegram.ui.Components.cc.a0(this).K(2131624217, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131743760, str)), org.telegram.messenger.hd.M0(2131743759, null), new eu(this, 8));
        }
        K.j();
    }

    public final void a4(final long j3, final long j10, boolean z10, final u91 u91Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String M0;
        String b02;
        String M02;
        TLRPC.TL_forumTopic f10;
        if (A3(j3)) {
            int i7 = this.T0;
            if (i7 != 11 && i7 != 12 && i7 != 13) {
                if (z10 && ((this.f53685h2 != null && this.f53690i2 != null) || this.f53695j2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (org.telegram.messenger.m5.C(j3)) {
                            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(getMessagesController().a1(Integer.valueOf((int) (4294967295L & j3))).user_id));
                            if (a22 != null) {
                                M0 = org.telegram.messenger.hd.M0(2131745596, null);
                                b02 = org.telegram.messenger.hd.b0(this.f53685h2, org.telegram.messenger.q10.p(a22));
                                M02 = org.telegram.messenger.hd.M0(2131745640, null);
                            } else {
                                return;
                            }
                        } else if (org.telegram.messenger.m5.E(j3)) {
                            if (j3 == getUserConfig().e()) {
                                M0 = org.telegram.messenger.hd.M0(2131745596, null);
                                b02 = org.telegram.messenger.hd.b0(this.f53690i2, org.telegram.messenger.hd.M0(2131745901, null));
                                M02 = org.telegram.messenger.hd.M0(2131745640, null);
                            } else {
                                TLRPC.User a23 = getMessagesController().a2(Long.valueOf(j3));
                                if (a23 != null && this.f53685h2 != null) {
                                    M0 = org.telegram.messenger.hd.M0(2131745596, null);
                                    b02 = org.telegram.messenger.hd.b0(this.f53685h2, org.telegram.messenger.q10.p(a23));
                                    M02 = org.telegram.messenger.hd.M0(2131745640, null);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(-j3));
                            if (M03 != null) {
                                String str = M03.title;
                                if (j10 != 0 && (f10 = getMessagesController().f25383r7.f(M03.f28051id, j10)) != null) {
                                    str = ((Object) str) + " " + f10.title;
                                }
                                if (this.f53695j2 != null) {
                                    M0 = org.telegram.messenger.hd.M0(2131754366, null);
                                    b02 = org.telegram.messenger.hd.b0(this.f53695j2, str);
                                    M02 = org.telegram.messenger.hd.M0(2131754486, null);
                                } else {
                                    M0 = org.telegram.messenger.hd.M0(2131745596, null);
                                    b02 = org.telegram.messenger.hd.b0(this.f53690i2, str);
                                    M02 = org.telegram.messenger.hd.M0(2131745640, null);
                                }
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.g0.X2(b02);
                        alertDialog$Builder.k(M02, new org.telegram.ui.ActionBar.q1() {
                            @Override
                            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                                yw.this.a4(j3, j10, false, u91Var);
                            }
                        });
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        if (showDialog(t1Var) == null) {
                            t1Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == 15) {
                    Runnable m1Var = new bi.m1(this, j3, new d3.e0(this, j3, j10, u91Var, 6), 27);
                    if (j3 < 0) {
                        c5(getMessagesController().M0(Long.valueOf(-j3)), m1Var, null);
                        return;
                    }
                    TLRPC.User a24 = getMessagesController().a2(Long.valueOf(j3));
                    TLRPC.User a25 = getMessagesController().a2(Long.valueOf(this.I));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String a02 = org.telegram.messenger.hd.a0(null, null, 2131754074, org.telegram.messenger.q10.j(a24, true), org.telegram.messenger.q10.j(a25, true));
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                    t1Var2.S = a02;
                    t1Var2.U = TextUtils.concat(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754075, org.telegram.messenger.q10.j(a24, true), org.telegram.messenger.q10.j(a25, true))));
                    alertDialog$Builder2.k(org.telegram.messenger.hd.a0("Send", null, 2131745640, new Object[0]), new zr(m1Var, 5));
                    alertDialog$Builder2.h(org.telegram.messenger.hd.a0("Cancel", null, 2131752589, new Object[0]), new org.telegram.ui.Components.rb0(22));
                    showDialog(t1Var2);
                    return;
                } else if (this.E2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(org.telegram.messenger.ur.a(j3, j10));
                    if (this.E2.y(this, arrayList, null, false, this.L2, this.M2, this.N2, u91Var) && this.f53699k2) {
                        this.E2 = null;
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
            org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().j1(j3);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new di.i3(this, t1Var3, user, chat, j3, tL_messages_checkHistoryImportPeer));
            try {
                t1Var3.r(300L);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Zk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Yk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.dl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.cl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.bl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.al));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ti));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28906g8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Le));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28890f9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28907g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29017m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Zl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29241y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28871e9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28852d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28834c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.M7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.N7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28925h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29034n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28999l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29052o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28961j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28981k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28814b8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28793a8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Z7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Y7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.X7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.W7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.V7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.K7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28813b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29069p6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28979k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.qk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Z5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29263z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29244y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29225x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29206w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29187v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29168u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29148t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29111r9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29092q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29072p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28943i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28815b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28794a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29252yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G8));
    }

    public final void b4(long j3, boolean z10) {
        if (this.f53673f0 != null) {
            int i7 = 0;
            while (true) {
                xw[] xwVarArr = this.f53673f0;
                if (i7 < xwVarArr.length) {
                    int childCount = xwVarArr[i7].f53331a.getChildCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 < childCount) {
                            View childAt = this.f53673f0[i7].f53331a.getChildAt(i10);
                            if (childAt instanceof org.telegram.ui.Cells.t2) {
                                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                                if (t2Var.getDialogId() == j3) {
                                    t2Var.e0(z10, true);
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
        if (this.N0 == null && !org.telegram.messenger.gz.f23992x && (!this.L || this.F0.g())) {
            e11[] e11VarArr = new e11[1];
            TLRPC.User f10 = org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24934t0).f();
            org.telegram.ui.ActionBar.j5 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.F3.f();
                Drawable drawable = this.F3.f34194f[0];
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(titleTextView.getRightDrawable().getBounds());
                rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
                int L = (-(this.actionBar.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                i7 = org.telegram.messenger.g0.L(4.0f) + (rect.centerX() - org.telegram.messenger.g0.L(16.0f));
                org.telegram.ui.Cells.o oVar = this.G3;
                if (oVar != null) {
                    oVar.b(rect.centerX(), rect.centerY());
                }
                i10 = L;
            } else {
                i7 = 0;
                i10 = 0;
            }
            vv vvVar = new vv(this, this, getParentActivity(), Integer.valueOf(i7), getResourceProvider(), e11VarArr);
            if (f10 != null && org.telegram.messenger.m5.g(f10.emoji_status) > 0) {
                vvVar.setExpireDateHint(org.telegram.messenger.m5.g(f10.emoji_status));
            }
            Long l11 = this.D3;
            if (l11 != null) {
                vvVar.setSelected(l11);
            } else {
                Drawable drawable2 = this.F3.f34194f[0];
                if (drawable2 instanceof org.telegram.ui.Components.g5) {
                    l10 = Long.valueOf(((org.telegram.ui.Components.g5) drawable2).h());
                } else {
                    l10 = null;
                }
                vvVar.setSelected(l10);
            }
            vvVar.setSaveState(1);
            vvVar.y(this.F3, titleTextView);
            wv wvVar = new wv(this, vvVar);
            this.N0 = wvVar;
            e11VarArr[0] = wvVar;
            wvVar.showAsDropDown(this.actionBar, org.telegram.messenger.g0.L(16.0f), i10, 48);
            e11VarArr[0].b();
        }
    }

    public final void c5(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.c5(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    @Override
    public final boolean canBeginSlide() {
        ow owVar;
        if (!this.H3.c()) {
            if (this.T0 == 3 && (owVar = this.A0) != null && owVar.getVisibility() == 0 && this.A0.L > 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean closeLastFragment() {
        if (this.H3.c()) {
            this.H3.a();
            hw hwVar = this.D0;
            if (hwVar != null) {
                hwVar.R();
                return true;
            }
            return true;
        }
        return super.closeLastFragment();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.Components.o7 o7Var = new org.telegram.ui.Components.o7(this, context, this.resourceProvider, 3);
        o7Var.setAllowOverlayTitle(true);
        o7Var.H0 = true;
        if (o7Var.G0 == null) {
            bi.v1 v1Var = new bi.v1(o7Var.getContext(), 7);
            o7Var.G0 = v1Var;
            o7Var.addView(v1Var);
        }
        org.telegram.ui.ActionBar.q6.l(o7Var, 3, org.telegram.ui.ActionBar.j6.f29147t8, getResourceProvider());
        org.telegram.ui.ActionBar.q6.a(o7Var, org.telegram.ui.ActionBar.j6.f29262z8, getResourceProvider(), true);
        org.telegram.ui.ActionBar.q6.l(o7Var, 1, org.telegram.ui.ActionBar.j6.f29186v8, getResourceProvider());
        org.telegram.ui.ActionBar.q6.b(o7Var, org.telegram.ui.ActionBar.j6.f29243y8, getResourceProvider(), true);
        if (o7Var.f29330y1 == null) {
            fi.j jVar = new fi.j(o7Var, o7Var.getContext(), o7Var.K0, o7Var.P0);
            o7Var.f29330y1 = jVar;
            jVar.setClipChildren(false);
            o7Var.addView(o7Var.f29330y1);
        }
        o7Var.getAdditionalSubTitleOverlayContainer().setTranslationX(org.telegram.messenger.g0.L(4.0f));
        o7Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-org.telegram.messenger.g0.L(3.0f));
        if (!this.inPreviewMode && (!org.telegram.messenger.g0.Q1() || this.Y2 == 0 || q4())) {
            return o7Var;
        }
        o7Var.setOccupyStatusBar(false);
        return o7Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.createView(android.content.Context):android.view.View");
    }

    public final java.util.ArrayList d4(int r11, int r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.d4(int, int, int, boolean):java.util.ArrayList");
    }

    public final void d5(boolean z10) {
        xw[] xwVarArr;
        char c10;
        char c11;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            xwVarArr = this.f53673f0;
            if (i10 >= xwVarArr.length) {
                break;
            }
            xwVarArr[i10].f53331a.C0();
            i10++;
        }
        if (z10 && xwVarArr.length > 1) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int i11 = xwVarArr[c10].h;
        if (i11 >= 0 && i11 < getMessagesController().T0().size()) {
            org.telegram.messenger.so soVar = (org.telegram.messenger.so) getMessagesController().T0().get(this.f53673f0[c10].h);
            if (soVar.e()) {
                xw xwVar = this.f53673f0[c10];
                xwVar.f53338s = this.T0;
                uw uwVar = xwVar.f53331a;
                int i12 = uw.C3;
                uwVar.D1();
            } else {
                xw[] xwVarArr2 = this.f53673f0;
                if (xwVarArr2[c10 ^ 1].f53338s == 7) {
                    xwVarArr2[c10].f53338s = 8;
                } else {
                    xwVarArr2[c10].f53338s = 7;
                }
                xwVarArr2[c10].f53331a.setScrollEnabled(true);
                org.telegram.messenger.np messagesController = getMessagesController();
                if (this.f53673f0[c10].f53338s == 8) {
                    c11 = 1;
                } else {
                    c11 = 0;
                }
                org.telegram.messenger.so[] soVarArr = messagesController.N;
                org.telegram.messenger.so soVar2 = soVarArr[c11];
                if (soVar2 != soVar) {
                    soVarArr[c11] = soVar;
                    int i13 = c11 ^ 1;
                    if (soVarArr[i13] == soVar) {
                        soVarArr[i13] = null;
                    }
                    if (soVarArr[c11] == null) {
                        if (soVar2 != null) {
                            soVar2.f26550k.clear();
                            soVar2.f26551l.clear();
                        }
                    } else {
                        messagesController.U4(null);
                    }
                }
            }
            xw[] xwVarArr3 = this.f53673f0;
            if (xwVarArr3.length > 1) {
                xwVarArr3[1].F = soVar.f26555p;
            }
            xw xwVar2 = xwVarArr3[c10];
            hv hvVar = xwVar2.d;
            hvVar.h = xwVar2.f53338s;
            hvVar.f();
            xw xwVar3 = this.f53673f0[c10];
            dv dvVar = xwVar3.f53333c;
            if (xwVar3.f53338s == 0 && l4() && this.f53673f0[c10].f53339w == 2) {
                i7 = 1;
            }
            dvVar.h1(i7, (int) this.O);
            C3(this.f53673f0[c10]);
        }
    }

    @Override
    public final void didReceivedNotification(int r27, int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (!(dialog instanceof ki.x2) && super.dismissDialogOnPause(dialog)) {
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
            f10 = 1.0f - this.f53650b.f57081e;
        } else {
            f10 = 1.0f;
        }
        return f10 * (1.0f - h4()) * this.f53729r.f57081e;
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
        az0 az0Var = this.f53645a0;
        if (az0Var != null && az0Var.getVisibility() != 8) {
            f10 = this.f53645a0.getMeasuredHeight();
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
            float f21 = this.f53775z1;
            f12 = (f10 * f21) + com.google.android.gms.internal.vision.e2.z(1.0f, f21, f11, f20);
            f13 = this.f53777z3;
        } else {
            f12 = (f10 * this.f53775z1) + this.O;
            f13 = this.f53777z3;
        }
        float f22 = f12 + f13 + this.U;
        nw nwVar = this.Y;
        if (nwVar != null && nwVar.getVisibility() == 0) {
            f14 = this.Y.getAlpha();
        } else {
            f14 = 0.0f;
        }
        float L = org.telegram.messenger.g0.L(4.0f) * f14;
        ow owVar = this.A0;
        if (owVar != null) {
            owVar.setTranslationY(f22 - L);
            f16 = this.A0.getAlpha();
            f17 = org.telegram.messenger.g0.L(43.0f) * f16;
            f15 = f22 + f17;
        } else {
            f15 = f22;
            f16 = 0.0f;
            f17 = 0.0f;
        }
        org.telegram.ui.Components.vr vrVar = this.L1;
        if (vrVar != null) {
            float f23 = f15 - L;
            int i10 = -org.telegram.messenger.g0.L(3.0f);
            if (this.f53651b0 == null) {
                i7 = org.telegram.messenger.g0.L(44.0f);
            } else {
                i7 = 0;
            }
            vrVar.setTranslationY(org.telegram.messenger.g0.T1(f23, i10 - i7, this.f53650b.f57081e));
            f18 = this.L1.getMetadata().f57097c.f57107a;
            f19 = this.L1.c(0.0f);
        } else {
            f18 = 0.0f;
            f19 = 0.0f;
        }
        org.telegram.ui.Components.ur urVar = this.M1;
        if (urVar != null) {
            urVar.setTranslationY(f22 - L);
            float W1 = org.telegram.messenger.g0.W1(Math.min(f18, f16), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(50.0f));
            org.telegram.ui.Components.ur urVar2 = this.M1;
            float min = Math.min(org.telegram.messenger.g0.L(40.0f), (f19 + f17) - W1);
            Matrix matrix = urVar2.f40150b;
            if (urVar2.f40152e != W1 || urVar2.f40153f != min) {
                urVar2.f40152e = W1;
                urVar2.f40153f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, W1);
                LinearGradient linearGradient = urVar2.f40151c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                urVar2.invalidate();
            }
            this.M1.setAlpha(Math.max(f16, f18));
        }
    }

    public final int f4() {
        if (this.L) {
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
        org.telegram.ui.Components.m60 m60Var = this.M0;
        if (m60Var != null) {
            m60Var.u();
        }
    }

    public final int g4() {
        if (this.L) {
            return org.telegram.messenger.g0.L(81.0f);
        }
        return 0;
    }

    public final void g5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.g5():void");
    }

    @Override
    public final org.telegram.ui.ActionBar.k4 getBackButtonState() {
        if (!q4() && !this.H3.f52061f) {
            return org.telegram.ui.ActionBar.k4.f29338b;
        }
        return org.telegram.ui.ActionBar.k4.f29337a;
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f10) {
        int i7;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Y3, 1.0f);
            this.f53655b4 = ofFloat;
            return ofFloat;
        }
        if (getLayoutContainer() != null && getLayoutContainer().getMeasuredWidth() > 0) {
            i7 = (int) Utilities.i((200.0f / getLayoutContainer().getMeasuredWidth()) * f10, 200.0f, 80.0f);
        } else {
            i7 = 150;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.Y3, 1.0f);
        this.f53655b4 = ofFloat2;
        ofFloat2.addUpdateListener(new lu(this, 1));
        this.f53655b4.setInterpolator(org.telegram.ui.Components.er.f34421g);
        this.f53655b4.setDuration(i7);
        this.f53655b4.start();
        return this.f53655b4;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.getThemeDescriptions():java.util.ArrayList");
    }

    public final float h4() {
        uv uvVar = this.H3;
        if (uvVar != null && uvVar.c()) {
            return this.H3.f52060e;
        }
        return 0.0f;
    }

    public final void h5() {
        di.c1 c1Var;
        uw uwVar;
        boolean z10;
        int i7;
        try {
            kv kvVar = this.D1;
            if (kvVar != null && kvVar.getEditField() != null) {
                this.D1.getEditField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ne));
            }
            NumberTextView numberTextView = this.f53694j1;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f29243y8));
            }
            ow owVar = this.A0;
            int i10 = 0;
            if (owVar != null && (owVar.getSelectorDrawable() instanceof GradientDrawable)) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null && kVar.x()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                GradientDrawable gradientDrawable = (GradientDrawable) this.A0.getSelectorDrawable();
                if (z10) {
                    i7 = org.telegram.ui.ActionBar.j6.f29233xi;
                } else {
                    i7 = org.telegram.ui.ActionBar.j6.K8;
                }
                gradientDrawable.setColor(getThemedColor(i7));
                this.A0.invalidate();
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                if (this.Y2 != 0 || this.f53648a3 != 0) {
                    kVar2.L(getThemedColor(org.telegram.ui.ActionBar.j6.Q8), false);
                    this.actionBar.L(getThemedColor(org.telegram.ui.ActionBar.j6.R8), true);
                }
                if (this.actionBar.x()) {
                    this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
                }
                n5();
            }
            if (this.f53673f0 != null) {
                while (true) {
                    xw[] xwVarArr = this.f53673f0;
                    if (i10 >= xwVarArr.length) {
                        break;
                    }
                    xw xwVar = xwVarArr[i10];
                    if (xwVar != null && (uwVar = xwVar.f53331a) != null) {
                        uwVar.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
                    }
                    i10++;
                }
            }
            hw hwVar = this.D0;
            if (hwVar != null && (c1Var = hwVar.f36047b0) != null) {
                c1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
            }
            oi.u1 u1Var = this.E1;
            if (u1Var != null) {
                u1Var.setScrimViewBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
            }
            hi.l3 l3Var = this.f53724q0;
            if (l3Var != null) {
                l3Var.j(getThemedColor(org.telegram.ui.ActionBar.j6.wj));
            }
            hi.l3 l3Var2 = this.f53730r0;
            if (l3Var2 != null) {
                l3Var2.j(getThemedColor(org.telegram.ui.ActionBar.j6.wj));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final float i4() {
        return -org.telegram.messenger.g0.W1(this.f53650b.f57081e, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(48.0f));
    }

    public final void i5(boolean z10, boolean z11) {
        ?? r52;
        int L0;
        boolean z12;
        xw[] xwVarArr;
        org.telegram.messenger.so soVar;
        boolean z13;
        Object[] objArr;
        v4.m0 m0Var;
        boolean z14;
        boolean z15;
        boolean z16;
        if (this.A0 != null && !this.inPreviewMode && !this.f53739s3) {
            uv uvVar = this.H3;
            if (uvVar == null || !uvVar.c()) {
                org.telegram.ui.Components.m60 m60Var = this.M0;
                String str = null;
                if (m60Var != null) {
                    m60Var.u();
                    this.M0 = null;
                }
                ArrayList T0 = getMessagesController().T0();
                int size = T0.size();
                te.a aVar = this.f53729r;
                boolean z17 = true;
                boolean z18 = false;
                if (size > 1) {
                    if (!z10 && this.A0.getVisibility() == 0) {
                        r52 = 0;
                    } else {
                        if (this.A0.getVisibility() != 0) {
                            z13 = false;
                        } else {
                            z13 = z11;
                        }
                        this.f53762x = true;
                        boolean isEmpty = this.A0.h.isEmpty();
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.S3 == null) {
                                z16 = z11;
                            } else {
                                z16 = false;
                            }
                            if (!this.f53739s3) {
                                aVar.a(this.f53762x, z16);
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
                        ow owVar = this.A0;
                        owVar.h.clear();
                        owVar.f35796k0.clear();
                        owVar.m0.clear();
                        owVar.f35799n0.clear();
                        owVar.f35800o0.clear();
                        owVar.f35801p0.clear();
                        owVar.N = 0;
                        int size2 = T0.size();
                        int i7 = 0;
                        while (i7 < size2) {
                            if (((org.telegram.messenger.so) T0.get(i7)).e()) {
                                this.A0.a(i7, 0, org.telegram.messenger.hd.M0(2131750807, str), null, false, true, ((org.telegram.messenger.so) T0.get(i7)).f26555p);
                                z15 = z18;
                            } else {
                                org.telegram.messenger.so soVar2 = (org.telegram.messenger.so) T0.get(i7);
                                z15 = z18;
                                this.A0.a(i7, soVar2.f26554o, soVar2.f26543b, soVar2.f26544c, soVar2.f26553n, false, ((org.telegram.messenger.so) T0.get(i7)).f26555p);
                            }
                            i7++;
                            z18 = z15;
                            str = null;
                        }
                        boolean z19 = z18;
                        if (currentTabStableId >= 0) {
                            if (objArr != null && !this.A0.h(currentTabStableId)) {
                                while (currentTabId >= 0) {
                                    ow owVar2 = this.A0;
                                    if (owVar2.h(owVar2.f35797l0.get(currentTabId, -1))) {
                                        break;
                                    }
                                    currentTabId--;
                                }
                                if (currentTabId < 0) {
                                    currentTabId = z19 ? 1 : 0;
                                }
                            }
                            if (this.A0.f35797l0.get(this.f53673f0[z19 ? 1 : 0].h, -1) != currentTabStableId) {
                                this.f53673f0[z19 ? 1 : 0].h = currentTabId;
                                isEmpty = true;
                            }
                        }
                        int i10 = z19 ? 1 : 0;
                        while (true) {
                            xw[] xwVarArr2 = this.f53673f0;
                            if (i10 >= xwVarArr2.length) {
                                break;
                            }
                            if (xwVarArr2[i10].h >= T0.size()) {
                                this.f53673f0[i10].h = T0.size() - 1;
                            }
                            this.f53673f0[i10].f53331a.setScrollingTouchSlop(1);
                            i10++;
                        }
                        ow owVar3 = this.A0;
                        di.c1 c1Var = owVar3.G;
                        if (z13) {
                            m0Var = owVar3.f35807t0;
                        } else {
                            m0Var = null;
                        }
                        c1Var.setItemAnimator(m0Var);
                        owVar3.J.f();
                        if (isEmpty) {
                            d5(z19);
                        }
                        ow owVar4 = this.A0;
                        int currentTabId2 = owVar4.getCurrentTabId();
                        ArrayList arrayList = owVar4.h;
                        int i11 = 0;
                        while (true) {
                            if (i11 < arrayList.size()) {
                                if (((org.telegram.ui.Components.fz) arrayList.get(i11)).f34748a == currentTabId2) {
                                    z14 = ((org.telegram.ui.Components.fz) arrayList.get(i11)).f34752f;
                                    break;
                                }
                                i11++;
                            } else {
                                z14 = false;
                                break;
                            }
                        }
                        if (z14) {
                            ow owVar5 = this.A0;
                            ArrayList arrayList2 = owVar5.h;
                            if (!arrayList2.isEmpty()) {
                                r52 = 0;
                                owVar5.f((org.telegram.ui.Components.fz) arrayList2.get(0), 0);
                            }
                        }
                        r52 = 0;
                    }
                } else {
                    r52 = 0;
                    if (this.A0.getVisibility() != 8) {
                        this.A0.setIsEditing(false);
                        U4(false);
                        this.f53722p3 = false;
                        if (this.f53718o3) {
                            this.f53718o3 = false;
                            this.f53673f0[0].setTranslationX(0.0f);
                            this.f53673f0[1].setTranslationX(xwVarArr[0].getMeasuredWidth());
                        }
                        if (this.f53673f0[0].h != this.A0.getDefaultTabId()) {
                            this.f53673f0[0].h = this.A0.getDefaultTabId();
                            hv hvVar = this.f53673f0[0].d;
                            hvVar.h = 0;
                            hvVar.f();
                            xw xwVar = this.f53673f0[0];
                            xwVar.f53338s = this.T0;
                            xwVar.d.f();
                        }
                        this.f53673f0[1].setVisibility(8);
                        xw xwVar2 = this.f53673f0[1];
                        xwVar2.h = 0;
                        hv hvVar2 = xwVar2.d;
                        hvVar2.h = 0;
                        hvVar2.f();
                        xw xwVar3 = this.f53673f0[1];
                        xwVar3.f53338s = this.T0;
                        xwVar3.d.f();
                        this.f53762x = false;
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.S3 == null) {
                                z12 = z11;
                            } else {
                                z12 = false;
                            }
                            if (!this.f53739s3) {
                                aVar.a(false, z12);
                            }
                        }
                        int i12 = 0;
                        while (true) {
                            xw[] xwVarArr3 = this.f53673f0;
                            if (i12 >= xwVarArr3.length) {
                                break;
                            }
                            xw xwVar4 = xwVarArr3[i12];
                            if (xwVar4.f53338s == 0 && xwVar4.f53339w == 2 && l4() && ((L0 = this.f53673f0[i12].f53333c.L0()) == 0 || L0 == 1)) {
                                this.f53673f0[i12].f53333c.h1(1, (int) this.O);
                            }
                            this.f53673f0[i12].f53331a.setScrollingTouchSlop(0);
                            this.f53673f0[i12].f53331a.requestLayout();
                            this.f53673f0[i12].requestLayout();
                            i12++;
                        }
                        this.A0.M = -1;
                        r52 = 0;
                    }
                }
                f5(r52);
                int i13 = this.f53673f0[r52].f53338s;
                if ((i13 == 7 || i13 == 8) && (soVar = getMessagesController().N[i13 - 7]) != null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < T0.size()) {
                            org.telegram.messenger.so soVar3 = (org.telegram.messenger.so) T0.get(i14);
                            if (soVar3 != null && soVar3.f26542a == soVar.f26542a) {
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
        uv uvVar;
        if (!this.f53703l2 && (uvVar = this.H3) != null && uvVar.getFragment() != null) {
            return this.H3.getFragment().isLightStatusBar();
        }
        if (i0.a.h(getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final fi.s6 j4() {
        return getMessagesController().P1();
    }

    public final void j5(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.j5(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    @Override
    public final ui.f k() {
        return this.f53709m4;
    }

    public final UndoView k4() {
        Z3();
        UndoView[] undoViewArr = this.f53774z0;
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
        float f10 = (((-this.f53687h4) - this.f53701k4) - this.f53758w1) - this.f53764x1;
        org.telegram.ui.Components.t00 t00Var = this.f53746u0;
        if (t00Var != null) {
            t00Var.setTranslationY(f10);
        }
        org.telegram.ui.Components.t00 t00Var2 = this.f53751v0;
        if (t00Var2 != null) {
            t00Var2.setTranslationY(f10 - org.telegram.messenger.g0.L(52.0f));
            hi.l3 l3Var = this.f53724q0;
            if (l3Var != null) {
                l3Var.setTranslationY(f10 - org.telegram.messenger.g0.L(52.0f));
            }
        }
    }

    public final boolean l4() {
        if (!this.f53712n2 && this.T0 == 0 && this.f53648a3 == 0 && this.Y2 == 0) {
            org.telegram.messenger.np messagesController = getMessagesController();
            messagesController.getClass();
            if (org.telegram.messenger.gz.f23974q1 && messagesController.R.f(2305843009213693952L | 1) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void l5(boolean z10) {
        boolean z11;
        boolean z12 = this.f53712n2;
        if ((!z12 || this.T0 == 10) && this.Y2 == 0 && this.f53648a3 == 0 && !this.inPreviewMode && ((!this.f53703l2 || z12) && !this.V3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.t00 t00Var = this.f53746u0;
        if (t00Var != null) {
            t00Var.e(z11, z10);
        }
        org.telegram.ui.Components.t00 t00Var2 = this.f53751v0;
        if (t00Var2 != null) {
            t00Var2.e(z11, z10);
        }
    }

    public final boolean m4() {
        ArrayList arrayList = this.F2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void m5(boolean z10, boolean z11) {
        boolean z12;
        int i7;
        if (this.f53715o0 != null) {
            org.telegram.ui.ActionBar.q0 q0Var = this.f53711n0;
            if (q0Var == null || q0Var.getVisibility() != 0) {
                boolean z13 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < getDownloadController().H.size()) {
                        if (getFileLoader().S(((org.telegram.messenger.gj) getDownloadController().H.get(i10)).S0())) {
                            z12 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z12 = false;
                        break;
                    }
                }
                if (getDownloadController().J.size() <= 0 && !z12 && (this.f53683h0.getVisibility() != 0 || this.f53683h0.getAlpha() != 1.0f || z11)) {
                    this.f53693j0 = false;
                } else {
                    this.f53693j0 = true;
                }
                J3();
                boolean z14 = org.telegram.messenger.t0.f26600b.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i11 = this.f53675f2;
                if (i11 == 3 || i11 == 5) {
                    z13 = true;
                }
                org.telegram.ui.ActionBar.z0 z0Var = this.f53719p0;
                if (z14) {
                    if (z13) {
                        i7 = 2131748608;
                    } else {
                        i7 = 2131748607;
                    }
                } else {
                    i7 = 2131748606;
                }
                z0Var.setSubtext(org.telegram.messenger.hd.M0(i7, null));
                this.f53715o0.b(z14, z13, z10);
            }
        }
    }

    public final void n4(boolean z10) {
        int i7;
        boolean z11;
        this.actionBar.w();
        this.K2.clear();
        org.telegram.ui.ActionBar.x1 x1Var = this.f53679g1;
        boolean z12 = true;
        if (x1Var != null) {
            x1Var.c(true, 0.0f);
        }
        ow owVar = this.A0;
        if (owVar != null) {
            owVar.b(org.telegram.ui.ActionBar.j6.K8, org.telegram.ui.ActionBar.j6.I8, org.telegram.ui.ActionBar.j6.J8, org.telegram.ui.ActionBar.j6.L8, org.telegram.ui.ActionBar.j6.f28849d6);
        }
        ValueAnimator valueAnimator = this.f53766x3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f53766x3 = null;
        }
        if (this.f53760w3 == 0.0f) {
            return;
        }
        O4(-f4());
        boolean z13 = false;
        int i10 = 0;
        while (true) {
            xw[] xwVarArr = this.f53673f0;
            if (i10 >= xwVarArr.length) {
                break;
            }
            xw xwVar = xwVarArr[i10];
            if (xwVar != null) {
                xwVar.f53331a.I0(true);
            }
            i10++;
        }
        if (this.L) {
            i7 = 81;
        } else {
            i7 = 0;
        }
        float max = Math.max(0.0f, org.telegram.messenger.g0.L(i7 + 48) + this.O);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f53760w3, 0.0f);
        this.f53766x3 = ofFloat;
        ofFloat.addUpdateListener(new iu(this, max, 1));
        this.f53766x3.addListener(new cw(this, max, 0));
        this.f53766x3.setInterpolator(org.telegram.ui.Components.er.f34420f);
        this.f53766x3.setDuration(200L);
        this.f53766x3.start();
        this.f53646a1 = false;
        ArrayList arrayList = this.f53658c1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                org.telegram.messenger.so soVar = (org.telegram.messenger.so) arrayList.get(i11);
                hz.z0(soVar, soVar.f26547g, soVar.f26543b, soVar.f26544c, soVar.f26553n, soVar.f26552m, soVar.h, soVar.f26548i, soVar.f26549j, false, false, true, true, false, this, null);
                i11++;
                arrayList = arrayList;
                size = size;
                z13 = false;
                z12 = true;
                obj = null;
            }
            arrayList.clear();
        }
        if (this.f53652b1) {
            getMessagesController().m4(this.Y2, 0L, null);
            z11 = 0;
            this.f53652b1 = false;
        } else {
            z11 = 0;
        }
        f5(true);
        if (this.f53673f0 != null) {
            int i12 = z11;
            while (true) {
                xw[] xwVarArr2 = this.f53673f0;
                if (i12 >= xwVarArr2.length) {
                    break;
                }
                xwVarArr2[i12].d.I = z11;
                i12++;
            }
        }
        int i13 = org.telegram.messenger.np.D8;
        int i14 = z11;
        if (z10) {
            i14 = 8192;
        }
        u5(i14 | 196608, true);
    }

    public final void n5() {
        int i7;
        int i10;
        if (this.f53749u3 && this.actionBar != null) {
            if (this.Y2 == 0 && this.f53648a3 == 0) {
                i7 = org.telegram.ui.ActionBar.j6.f29186v8;
            } else {
                i7 = org.telegram.ui.ActionBar.j6.O8;
            }
            int themedColor = getThemedColor(i7);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.j6.f29243y8;
            kVar.H(i0.a.f(this.f53775z1, themedColor, getThemedColor(i11)), false);
            this.actionBar.H(i0.a.f(this.f53775z1, getThemedColor(i11), getThemedColor(i11)), true);
            if (this.Y2 == 0 && this.f53648a3 == 0) {
                i10 = org.telegram.ui.ActionBar.j6.f29147t8;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.N8;
            }
            int themedColor2 = getThemedColor(i10);
            this.actionBar.F(i0.a.f(this.f53775z1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.j6.f29262z8)), false);
        }
    }

    public final void o4(boolean z10) {
        if (this.H3.c()) {
            z10 = true;
        }
        if (!z10 || !this.d2) {
            this.V3 = z10;
            l5(true);
            if (z10) {
                hi.l3 l3Var = this.f53724q0;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                hi.l3 l3Var2 = this.f53730r0;
                if (l3Var2 != null) {
                    l3Var2.f(true);
                }
            }
        }
    }

    public final void o5() {
        org.telegram.ui.Components.to0 to0Var;
        int i7;
        kv kvVar = this.D1;
        ArrayList arrayList = this.K2;
        if (kvVar != null) {
            this.f53710n.a(!arrayList.isEmpty(), true);
            p5();
            if (arrayList.isEmpty()) {
                if (this.T0 == 3 && this.f53685h2 == null) {
                    i7 = 2131750575;
                } else {
                    i7 = 2131745669;
                }
                String M0 = org.telegram.messenger.hd.M0(i7, null);
                if (this.R3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(M0);
                } else {
                    this.actionBar.N(M0, true, 350L, org.telegram.ui.Components.er.h);
                }
                if (this.D1.getTag() != null) {
                    this.D1.z0(false, false, false);
                    this.D1.S();
                    this.D1.setTag(null);
                    this.fragmentView.requestLayout();
                }
            } else {
                if (this.D1.getTag() == null) {
                    if (!m4() && this.G2 == null) {
                        this.D1.setFieldText("");
                    }
                    this.D1.setTag(1);
                    if (!this.X3 && (to0Var = this.I2) != null) {
                        this.X3 = true;
                        String M02 = org.telegram.messenger.hd.M0(2131745429, null);
                        to0Var.j();
                        to0Var.G = M02;
                        hi.k1 k1Var = to0Var.f39756a[0];
                        if (M02 != null) {
                            ((org.telegram.ui.ActionBar.j5) k1Var.f14492f).l(M02, false);
                        }
                        org.telegram.ui.Components.wa0 wa0Var = new org.telegram.ui.Components.wa0(to0Var, 29);
                        to0Var.H = wa0Var;
                        org.telegram.messenger.g0.i3(wa0Var, 1000L);
                    }
                }
                this.E1.e(Math.max(1, arrayList.size()), true);
                int i10 = this.U0 + (!TextUtils.isEmpty(this.D1.getFieldText()) ? 1 : 0);
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
                this.E1.i(i10, j3, true);
                this.D1.l2();
                if (this.R3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(org.telegram.messenger.hd.G(arrayList.size(), "Recipient", new Object[0]));
                } else {
                    this.actionBar.N(org.telegram.messenger.hd.G(arrayList.size(), "Recipient", new Object[0]), false, 350L, org.telegram.ui.Components.er.h);
                }
            }
            this.R3 = arrayList.isEmpty();
        } else if (this.T0 == 10) {
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
        } else if (this.H3.c() && this.H3.getFragment().onBackPressed(z10)) {
            if (z10) {
                this.H3.a();
                hw hwVar = this.D0;
                if (hwVar != null) {
                    hwVar.R();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.m60 m60Var = this.M0;
            if (m60Var != null) {
                if (z10) {
                    m60Var.u();
                    this.M0 = null;
                    return false;
                }
            } else {
                ow owVar = this.A0;
                if (owVar != null && owVar.f35798n) {
                    if (z10) {
                        owVar.setIsEditing(false);
                        U4(false);
                        return false;
                    }
                } else {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar != null && kVar.x()) {
                        if (z10) {
                            hw hwVar2 = this.D0;
                            if (hwVar2 != null && hwVar2.getVisibility() == 0) {
                                this.D0.Q(false);
                            }
                            n4(true);
                            return false;
                        }
                    } else if (this.f53650b.f57082f) {
                        if (z10) {
                            this.Y.f40202r.getText().clear();
                            this.Z.b(false);
                            this.Y.f40202r.clearFocus();
                            return false;
                        }
                    } else {
                        ow owVar2 = this.A0;
                        if (owVar2 != null && owVar2.getVisibility() == 0 && !this.j3) {
                            ow owVar3 = this.A0;
                            if (!owVar3.P && !this.f53718o3) {
                                ArrayList arrayList = owVar3.h;
                                if (!arrayList.isEmpty() && owVar3.M != ((org.telegram.ui.Components.fz) arrayList.get(0)).f34748a) {
                                    if (z10) {
                                        ow owVar4 = this.A0;
                                        ArrayList arrayList2 = owVar4.h;
                                        if (!arrayList2.isEmpty()) {
                                            owVar4.f((org.telegram.ui.Components.fz) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        kv kvVar = this.D1;
                        if (kvVar != null && kvVar.G0()) {
                            if (z10) {
                                this.D1.y0(true);
                            }
                        } else {
                            qv qvVar = this.F0;
                            if (qvVar.P == 0 && qvVar.T.L0() != 0) {
                                qvVar.h.y0(0);
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
        rv rvVar;
        ow owVar;
        if (this.X1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.n(true);
            }
            TLObject tLObject = this.Z1;
            if (tLObject != null) {
                hw hwVar = this.D0;
                if (hwVar != null) {
                    hwVar.f36050e0.Q(this.Y1, tLObject);
                }
                this.Z1 = null;
            }
            this.X1 = false;
        }
        if (!this.L && (owVar = this.A0) != null && owVar.getVisibility() == 0 && this.f53729r.f57082f) {
            int i7 = (int) (-this.O);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i7 != 0 && i7 != currentActionBarHeight && i7 >= currentActionBarHeight / 2) {
                this.f53673f0[0].f53331a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f53774z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        if (!isInPreviewMode() && (rvVar = this.L0) != null && rvVar.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        N3();
        this.f53736s0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        hi.l3 l3Var;
        super.onBecomeFullyVisible();
        if (q4()) {
            SharedPreferences e12 = org.telegram.messenger.np.e1();
            boolean z10 = e12.getBoolean("archivehint", true);
            boolean isEmpty = d4(this.currentAccount, this.T0, this.Y2, false).isEmpty();
            if (z10 && isEmpty) {
                org.telegram.messenger.np.e1().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                e12.edit().putBoolean("archivehint", false).commit();
                S4();
            }
        }
        if (this.f53736s0 && !this.f53741t0 && (l3Var = this.f53724q0) != null && this.P3) {
            this.f53741t0 = true;
            this.f53736s0 = false;
            l3Var.w();
        }
        org.telegram.messenger.g0.i3(new eu(this, 20), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.m60 m60Var = this.M0;
        if (m60Var != null) {
            m60Var.u();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.t1 t1Var;
        super.onDialogDismiss(dialog);
        if (this.Y2 == 0 && this.f53648a3 == 0 && (t1Var = this.V1) != null && dialog == t1Var && getParentActivity() != null) {
            u3(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i7;
        boolean z10;
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        int i10 = 0;
        if (bundle != null) {
            this.f53712n2 = bundle.getBoolean("onlySelect", false);
            this.f53717o2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f53738s2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.T0 = this.arguments.getInt("dialogsType", 0);
            this.P0 = this.arguments.getBoolean("quote", false);
            this.O0 = this.arguments.getBoolean("reply_to", false);
            this.Q0 = this.arguments.getLong("reply_to_author", 0L);
            this.R0 = this.arguments.getLong("reply_to_channel_direct", 0L);
            this.S0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f53685h2 = this.arguments.getString("selectAlertString");
            this.f53690i2 = this.arguments.getString("selectAlertStringGroup");
            this.f53695j2 = this.arguments.getString("addToGroupAlertString");
            this.f53743t2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f53748u2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f53753v2 = this.arguments.getBoolean("afterSignup", false);
            this.Y2 = this.arguments.getInt("folderId", 0);
            long j3 = this.arguments.getLong("community_id", 0L);
            this.f53648a3 = j3;
            if (j3 != 0) {
                this.f53654b3 = getMessagesController().M0(Long.valueOf(this.f53648a3));
                this.f53660c3 = getMessagesController().N0(this.f53648a3);
            }
            this.f53699k2 = this.arguments.getBoolean("resetDelegate", true);
            this.U0 = this.arguments.getInt("messagesCount", 0);
            this.V0 = this.arguments.getInt("hasPoll", 0);
            this.W0 = this.arguments.getBoolean("hasInvoice", false);
            this.f53759w2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f53759w2);
            this.arguments.getInt("otherwiseRelogin");
            this.f53765x2 = this.arguments.getBoolean("allowGroups", true);
            this.f53771y2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f53776z2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.A2 = this.arguments.getBoolean("allowChannels", true);
            this.B2 = this.arguments.getBoolean("allowUsers", true);
            this.C2 = this.arguments.getBoolean("allowBots", true);
            this.D2 = this.arguments.getBoolean("closeFragment", true);
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
        if (this.T0 == 0) {
            this.W1 = org.telegram.messenger.np.f1().getBoolean("askAboutContacts", true);
            org.telegram.messenger.gz.u();
        }
        org.telegram.messenger.ns notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        this.L3 = new xi.e(notificationCenter, this);
        if (this.f53721p2 == null) {
            this.f53675f2 = getConnectionsManager().getConnectionState();
            this.L3.f(org.telegram.messenger.ns.f25514i4);
            if (!this.f53712n2) {
                this.L3.f(org.telegram.messenger.ns.I4);
                this.L3.f(org.telegram.messenger.ns.A4);
                this.L3.c(org.telegram.messenger.ns.P2);
                this.L3.c(org.telegram.messenger.ns.d2);
            }
            xi.e eVar = this.L3;
            eVar.c(org.telegram.messenger.ns.f25566s);
            eVar.c(org.telegram.messenger.ns.O2);
            eVar.c(org.telegram.messenger.ns.f25559r);
            eVar.c(org.telegram.messenger.ns.Y);
            eVar.c(org.telegram.messenger.ns.O);
            eVar.c(org.telegram.messenger.ns.I2);
            eVar.c(org.telegram.messenger.ns.f25504h0);
            eVar.c(org.telegram.messenger.ns.f25492f0);
            eVar.c(org.telegram.messenger.ns.J);
            eVar.c(org.telegram.messenger.ns.K);
            eVar.c(org.telegram.messenger.ns.M);
            eVar.c(org.telegram.messenger.ns.P0);
            eVar.c(org.telegram.messenger.ns.f25567s0);
            eVar.c(org.telegram.messenger.ns.f25558q5);
            eVar.c(org.telegram.messenger.ns.S0);
            eVar.c(org.telegram.messenger.ns.T1);
            eVar.c(org.telegram.messenger.ns.f25474b5);
            eVar.c(org.telegram.messenger.ns.K2);
            eVar.c(org.telegram.messenger.ns.f25481d0);
            eVar.c(org.telegram.messenger.ns.f25568s1);
            eVar.c(org.telegram.messenger.ns.Y4);
            eVar.c(org.telegram.messenger.ns.Z4);
            eVar.c(org.telegram.messenger.ns.N);
            eVar.c(org.telegram.messenger.ns.f25536m5);
            eVar.c(org.telegram.messenger.ns.f25497f5);
            this.L3.f(org.telegram.messenger.ns.f25537n0);
        }
        xi.e eVar2 = this.L3;
        eVar2.c(org.telegram.messenger.ns.f25592w);
        eVar2.c(org.telegram.messenger.ns.S4);
        eVar2.c(org.telegram.messenger.ns.f25468a5);
        eVar2.c(org.telegram.messenger.ns.T);
        eVar2.c(org.telegram.messenger.ns.L4);
        eVar2.c(org.telegram.messenger.ns.f25578t5);
        eVar2.c(org.telegram.messenger.ns.f25591v5);
        eVar2.c(org.telegram.messenger.ns.Z2);
        eVar2.c(org.telegram.messenger.ns.f25483d3);
        eVar2.c(org.telegram.messenger.ns.f25503g5);
        eVar2.c(org.telegram.messenger.ns.f25610y3);
        eVar2.c(org.telegram.messenger.ns.A3);
        eVar2.c(org.telegram.messenger.ns.S5);
        eVar2.c(org.telegram.messenger.ns.T5);
        eVar2.c(org.telegram.messenger.ns.P3);
        eVar2.c(org.telegram.messenger.ns.Q3);
        if (this.T0 == 0) {
            this.L3.c(org.telegram.messenger.ns.f25619z5);
            this.L3.c(org.telegram.messenger.ns.P1);
        }
        u4(getAccountInstance());
        fi.s6 P1 = getMessagesController().P1();
        if (!P1.A) {
            P1.W();
            if (!P1.f12335s) {
                ConnectionsManager.getInstance(P1.f12319a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new fi.p5(P1, 0));
            }
        }
        getMessagesController().b3(this.Y2);
        if (this.S3 != null && !getMessagesStorage().R) {
            pt ptVar = this.S3;
            if (ptVar.getParent() != null) {
                ((ViewGroup) ptVar.getParent()).removeView(ptVar);
            }
            this.S3 = null;
        }
        if (q4()) {
            fi.s6 P12 = getMessagesController().P1();
            if (P12.f12341z) {
                P12.T(true);
            }
        } else {
            getMessagesController().P1().W();
        }
        getContactsController().B();
        if (getMessagesController().f25363p6) {
            org.telegram.messenger.tv G1 = getMessagesController().G1();
            if (!G1.f26736e) {
                G1.g(true);
            }
        }
        if (this.f53648a3 != 0) {
            getMessagesController().V2(0, this.f53648a3, true);
        }
        org.telegram.messenger.v1 a10 = org.telegram.messenger.v1.a(this.currentAccount);
        if (!a10.f26924e) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = a10.f26922b;
            if (j10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                long j11 = currentTimeMillis - j10;
                boolean z11 = org.telegram.messenger.r2.f26198a;
                if (j11 > 43200000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(a10.f26922b);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(currentTimeMillis);
                if (calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            if (z10) {
                a10.f26924e = true;
                ConnectionsManager.getInstance(a10.f26921a).sendRequest(new TL_account.getBirthdays(), new org.telegram.messenger.s1(a10, 0));
            }
        }
        if (this.X) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        this.f53696j4 = i7;
        if (this.X) {
            i10 = org.telegram.messenger.g0.L(64.0f);
        }
        this.f53701k4 = i10;
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        xi.e eVar = this.L3;
        if (eVar != null) {
            eVar.b();
            this.L3 = null;
        }
        kv kvVar = this.D1;
        if (kvVar != null) {
            kvVar.Q0();
        }
        org.telegram.ui.Components.to0 to0Var = this.I2;
        if (to0Var != null) {
            to0Var.j();
        }
        org.telegram.ui.Components.voip.u uVar = this.J2;
        if (uVar != null) {
            org.telegram.messenger.g0.r(uVar);
            this.J2 = null;
        }
        UndoView undoView = this.f53774z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f53733r3.e();
        this.E2 = null;
        int i7 = org.telegram.ui.Components.h10.f35147m1;
    }

    @Override
    public final void onPanTranslationUpdate(float f10) {
        if (this.f53673f0 != null) {
            this.K0 = f10;
            kv kvVar = this.D1;
            int i7 = 0;
            if (kvVar != null && kvVar.G0()) {
                this.fragmentView.setTranslationY(f10);
                while (true) {
                    xw[] xwVarArr = this.f53673f0;
                    if (i7 >= xwVarArr.length) {
                        break;
                    }
                    xwVarArr[i7].setTranslationY(0.0f);
                    i7++;
                }
                if (!this.f53712n2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.xb xbVar = this.f53727q3;
                    if (xbVar != null) {
                        xbVar.l();
                    }
                }
                hw hwVar = this.D0;
                if (hwVar != null) {
                    hwVar.setTranslationY(this.J0);
                    return;
                }
                return;
            }
            while (true) {
                xw[] xwVarArr2 = this.f53673f0;
                if (i7 >= xwVarArr2.length) {
                    break;
                }
                xwVarArr2[i7].setTranslationY(f10);
                i7++;
            }
            if (!this.f53712n2) {
                this.actionBar.setTranslationY(f10);
                org.telegram.ui.Components.xb xbVar2 = this.f53727q3;
                if (xbVar2 != null) {
                    xbVar2.l();
                }
            }
            hw hwVar2 = this.D0;
            if (hwVar2 != null) {
                hwVar2.setTranslationY(this.K0 + this.J0);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.xb xbVar = this.T;
        if (xbVar != null) {
            xbVar.b();
            this.T = null;
        }
        uv uvVar = this.H3;
        if (uvVar != null) {
            uvVar.f52063r = true;
            bw bwVar = uvVar.f52057a;
            if (bwVar != null) {
                bwVar.onPause();
            }
        }
        org.telegram.ui.Components.m60 m60Var = this.M0;
        if (m60Var != null) {
            m60Var.u();
        }
        kv kvVar = this.D1;
        if (kvVar != null) {
            kvVar.S0();
        }
        int i7 = 0;
        UndoView undoView = this.f53774z0[0];
        if (undoView != null) {
            undoView.d(0, true);
        }
        setBulletinDelegate(null);
        if (this.f53673f0 == null) {
            return;
        }
        while (true) {
            xw[] xwVarArr = this.f53673f0;
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
        org.telegram.messenger.b9 b9Var;
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
                                org.telegram.messenger.at.t(this.currentAccount).Y();
                                break;
                            } else {
                                fh0.I0();
                                continue;
                            }
                        case 1:
                            if (iArr[i10] == 0) {
                                org.telegram.messenger.fc.D().i(null);
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
                                SharedPreferences.Editor edit = org.telegram.messenger.np.f1().edit();
                                this.W1 = false;
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
        } else if (i7 == 4) {
            for (int i11 : iArr) {
                if (i11 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 30 && (b9Var = FilesMigrationService.f22251e) != null) {
                b9Var.I0();
            }
        }
    }

    @Override
    public final void onResume() {
        boolean z10;
        xw xwVar;
        hv hvVar;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.Components.cm0 cm0Var;
        rv rvVar;
        super.onResume();
        qv qvVar = this.F0;
        char c10 = 0;
        if (qvVar != null) {
            ArrayList arrayList = qvVar.f12217y;
            fi.s6 s6Var = qvVar.f12208s;
            s6Var.l(s6Var.f12324g);
            s6Var.l(s6Var.h);
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                TL_stories.PeerStories y10 = s6Var.y(((fi.n) arrayList.get(i7)).f12049c);
                if (y10 != null) {
                    s6Var.a0(y10);
                }
            }
        }
        uv uvVar = this.H3;
        if (uvVar != null) {
            uvVar.f52063r = false;
            bw bwVar = uvVar.f52057a;
            if (bwVar != null) {
                bwVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (rvVar = this.L0) != null && rvVar.getVisibility() == 0) {
            this.L0.setVisibility(8);
            this.L0.setBackground(null);
        }
        if (this.f53673f0 != null) {
            int i10 = 0;
            while (true) {
                xw[] xwVarArr = this.f53673f0;
                if (i10 >= xwVarArr.length) {
                    break;
                }
                xwVarArr[i10].d.f();
                i10++;
            }
        }
        kv kvVar = this.D1;
        if (kvVar != null) {
            kvVar.T0();
        }
        long j3 = 0;
        if (!this.f53712n2 && this.Y2 == 0 && this.f53648a3 == 0) {
            getMediaDataController().B(4);
        }
        hw hwVar = this.D0;
        if (hwVar != null && (cm0Var = hwVar.f36050e0) != null) {
            cm0Var.f();
        }
        if (!this.f53753v2 && getUserConfig().f24937a0 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.Y2 == 0 && this.f53648a3 == 0 && this.f53669e2 && !this.f53712n2) {
            int i11 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.f53669e2 = false;
                if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i11 <= 28 || org.telegram.messenger.r2.f26199b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i11 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                org.telegram.messenger.i4 i4Var = new org.telegram.messenger.i4(this, z13, z11, z12, parentActivity);
                if (this.f53753v2 && (z11 || z13)) {
                    j3 = 4000;
                }
                org.telegram.messenger.g0.i3(i4Var, j3);
            }
        } else if (!this.f53712n2 && this.Y2 == 0 && this.f53648a3 == 0 && org.telegram.messenger.b6.i() && !org.telegram.messenger.b6.g()) {
            if (getParentActivity() != null) {
                if (!org.telegram.messenger.np.f1().getBoolean("askedAboutMiuiLockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    int i12 = org.telegram.ui.ActionBar.j6.L5;
                    alertDialog$Builder.m(2131624116, 72, getThemedColor(i12), null);
                    alertDialog$Builder.n(i12, getResourceProvider());
                    String M0 = org.telegram.messenger.hd.M0(2131747298, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.U = M0;
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747300, null), new hu(this, 10));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), new org.telegram.ui.Components.rb0(23));
                    showDialog(t1Var);
                }
            } else {
                return;
            }
        } else if (this.Y2 == 0 && this.f53648a3 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
            if (getParentActivity() != null) {
                if (!org.telegram.messenger.np.f1().getBoolean("askedAboutFSILockscreen", false)) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    int i13 = org.telegram.ui.ActionBar.j6.L5;
                    alertDialog$Builder2.m(2131624116, 72, getThemedColor(i13), null);
                    alertDialog$Builder2.n(i13, getResourceProvider());
                    String M02 = org.telegram.messenger.hd.M0(2131747314, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                    t1Var2.U = M02;
                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747300, null), new hu(this, 11));
                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131751772, null), new org.telegram.ui.Components.rb0(24));
                    showDialog(t1Var2);
                }
            } else {
                return;
            }
        }
        V4();
        if (this.f53673f0 != null) {
            int i14 = 0;
            while (true) {
                xw[] xwVarArr2 = this.f53673f0;
                if (i14 >= xwVarArr2.length) {
                    break;
                }
                xw xwVar2 = xwVarArr2[i14];
                if (xwVar2.f53338s == 0 && xwVar2.f53339w == 2 && xwVar2.f53333c.L0() == 0 && l4()) {
                    this.f53673f0[i14].f53333c.h1(1, (int) this.O);
                }
                if (i14 == 0) {
                    this.f53673f0[i14].d.getClass();
                } else {
                    this.f53673f0[i14].d.getClass();
                }
                i14++;
            }
        }
        X4();
        setBulletinDelegate(new y8(this, 4));
        if (this.f53739s3) {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
        u5(0, false);
        m5(false, true);
        t5(false);
        D3();
        N3();
        if (this.A0 != null && (xwVar = this.f53673f0[0]) != null && (hvVar = xwVar.d) != null) {
            int i15 = hvVar.h;
            if (i15 == 7 || i15 == 8) {
                org.telegram.messenger.so[] soVarArr = getMessagesController().N;
                if (i15 != 7) {
                    c10 = 1;
                }
                org.telegram.messenger.so soVar = soVarArr[c10];
                if (soVar != null) {
                    this.A0.h(soVar.f26554o);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f10) {
        if (org.telegram.messenger.gz.o() <= 0) {
            boolean z11 = org.telegram.messenger.r2.f26198a;
        } else if (this.f53649a4 && this.f53655b4 == null) {
            R4(f10);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.f53684h1.setColor(getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
            y3();
            h5();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        rv rvVar;
        yw ywVar;
        uv uvVar = this.H3;
        if (uvVar != null && uvVar.c()) {
            this.H3.getFragment().onTransitionAnimationEnd(z10, z11);
        } else {
            if (z10 && (rvVar = this.L0) != null && rvVar.getVisibility() == 0) {
                this.L0.setVisibility(8);
                this.L0.setBackground(null);
            }
            if (z10 && this.f53753v2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f42663w0.c(false);
                }
            }
        }
        if (!z10 && (ywVar = this.Z2) != null) {
            ywVar.removeSelfFromStack();
        }
        N3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        uv uvVar = this.H3;
        if (uvVar != null && uvVar.c()) {
            this.H3.getFragment().onTransitionAnimationProgress(z10, f10);
        } else {
            rv rvVar = this.L0;
            if (rvVar != null && rvVar.getVisibility() == 0) {
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
        org.telegram.ui.Components.to0 to0Var = this.I2;
        if (to0Var != null) {
            int i7 = this.currentAccount;
            to0Var.h(i7);
            to0Var.d = org.telegram.messenger.m10.i(org.telegram.messenger.c.a(i7).f22778a).e();
            ArrayList arrayList = to0Var.f39760f;
            arrayList.clear();
            ArrayList arrayList2 = this.K2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            hi.k1 k1Var = to0Var.f39756a[0];
            if (to0Var.f39757b == 1) {
                ((org.telegram.ui.ActionBar.j5) k1Var.f14491e).l(to0Var.c(k1Var), false);
            }
        }
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.f53649a4 = true;
            N4(true);
            return;
        }
        this.f53655b4 = null;
        this.f53649a4 = false;
        N4(false);
        R4(1.0f);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.e2 e2Var) {
        boolean presentFragment = super.presentFragment(e2Var);
        if (presentFragment && this.f53673f0 != null) {
            int i7 = 0;
            while (true) {
                xw[] xwVarArr = this.f53673f0;
                if (i7 >= xwVarArr.length) {
                    break;
                }
                xwVarArr[i7].d.getClass();
                i7++;
            }
        }
        hi.l3 l3Var = this.f53724q0;
        if (l3Var != null) {
            l3Var.f(true);
        }
        hi.l3 l3Var2 = this.f53730r0;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
        org.telegram.ui.Components.xb.e();
        return presentFragment;
    }

    public final boolean q4() {
        if (this.Y2 == 1) {
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
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                if (gjVar.F0() != null && gjVar.F0().size >= 157286400) {
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
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) obj2;
            if (gjVar2.F0() != null && gjVar2.F0().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        if (!getUserConfig().q() && !getMessagesController().D3() && z11 && z10) {
            z12 = true;
        }
        this.d.a(z12, true);
    }

    public final boolean r4(long j3) {
        if (j3 < 0) {
            return false;
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
        if (!org.telegram.messenger.q10.u(a22)) {
            return false;
        }
        ArrayList l10 = org.telegram.messenger.np.s1(this.currentAccount).f25383r7.l(-a22.f28200id);
        if ((l10 != null && !l10.isEmpty()) || !org.telegram.messenger.np.s1(this.currentAccount).f25383r7.e(-a22.f28200id)) {
            return false;
        }
        return true;
    }

    public final void r5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.e5 e5Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        qv qvVar = this.F0;
        org.telegram.ui.Components.e5 e5Var2 = null;
        if (qvVar != null && (e5Var = qvVar.f12187b0) != null && qvVar.f12207r0 != null) {
            Long h = org.telegram.messenger.q10.h(user);
            if (h != null) {
                e5Var.j(h.longValue(), z10);
                e5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z10);
            } else {
                if (user != null) {
                    org.telegram.messenger.np.s1(qvVar.f12193f);
                    if (org.telegram.messenger.np.B2(user)) {
                        if (qvVar.O0 == null) {
                            qvVar.O0 = qvVar.getContext().getResources().getDrawable(2131232308).mutate();
                            qvVar.O0 = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), qvVar.O0);
                        }
                        Drawable drawable = qvVar.O0;
                        int i7 = org.telegram.ui.ActionBar.j6.f29100qi;
                        yw ywVar = qvVar.f12194f0;
                        if (ywVar != null) {
                            e6Var = ywVar.getResourceProvider();
                        } else {
                            e6Var = null;
                        }
                        org.telegram.ui.ActionBar.q6.x(qvVar, drawable, i7, e6Var, PorterDuff.Mode.MULTIPLY);
                        e5Var.g(qvVar.O0, z10);
                        e5Var.m(false, z10);
                    }
                }
                e5Var.g(null, z10);
                e5Var.m(false, z10);
            }
            e5Var.k(Integer.valueOf(qvVar.f(org.telegram.ui.ActionBar.j6.f29100qi)));
            qvVar.f12185a0.invalidate();
        }
        if (this.F3 != null && this.actionBar != null) {
            Long h7 = org.telegram.messenger.q10.h(user);
            this.D3 = null;
            if (h7 != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                this.F3.j(h7.longValue(), z10);
                this.F3.m(z11, z10);
                if (z11) {
                    this.D3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
                }
                this.actionBar.setRightDrawableOnClick(new gu(this, 1));
                n11.t(this.currentAccount);
            } else {
                if (user != null) {
                    org.telegram.messenger.np.s1(this.currentAccount);
                    if (org.telegram.messenger.np.B2(user)) {
                        if (this.M3 == null) {
                            this.M3 = getParentActivity().getResources().getDrawable(2131232308).mutate();
                            this.M3 = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.M3);
                        }
                        Drawable drawable2 = this.M3;
                        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f29100qi);
                        this.f53773y4 = themedColor;
                        drawable2.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                        this.F3.g(this.M3, z10);
                        this.F3.m(false, z10);
                        this.actionBar.setRightDrawableOnClick(new gu(this, 2));
                        n11.t(this.currentAccount);
                    }
                }
                this.F3.g(null, z10);
                this.F3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.e5 e5Var3 = this.F3;
            int i10 = org.telegram.ui.ActionBar.j6.f29100qi;
            e5Var3.k(Integer.valueOf(getThemedColor(i10)));
            org.telegram.ui.Cells.o oVar = this.G3;
            if (oVar != null) {
                oVar.setColor(getThemedColor(i10));
            }
            wv wvVar = this.N0;
            if (wvVar != null && (wvVar.getContentView() instanceof n11)) {
                org.telegram.ui.ActionBar.j5 titleTextView = this.actionBar.getTitleTextView();
                n11 n11Var = (n11) this.N0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.e5 e5Var4 = this.F3;
                    if (rightDrawable == e5Var4) {
                        e5Var2 = e5Var4;
                    }
                }
                n11Var.y(e5Var2, titleTextView);
            }
        }
    }

    public final boolean s3(long j3, View view) {
        if (this.f53712n2 && getMessagesController().t2(j3)) {
            return false;
        }
        Long valueOf = Long.valueOf(j3);
        ArrayList arrayList = this.K2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j3));
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).e0(false, true);
            } else if (view instanceof org.telegram.ui.Cells.f6) {
                ((org.telegram.ui.Cells.f6) view).w(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j3));
        if (view instanceof org.telegram.ui.Cells.t2) {
            ((org.telegram.ui.Cells.t2) view).e0(true, true);
        } else if (view instanceof org.telegram.ui.Cells.f6) {
            ((org.telegram.ui.Cells.f6) view).w(true, true);
        }
        return true;
    }

    public final boolean s4(TLRPC.Dialog dialog) {
        char c10;
        if (dialog == null) {
            return false;
        }
        int i7 = this.f53673f0[0].f53338s;
        org.telegram.messenger.so soVar = null;
        if ((i7 == 7 || i7 == 8) && (!this.actionBar.x() || this.actionBar.y(null))) {
            org.telegram.messenger.so[] soVarArr = getMessagesController().N;
            if (this.f53673f0[0].f53338s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            soVar = soVarArr[c10];
        }
        if (soVar != null) {
            if (soVar.f26549j.indexOfKey(dialog.f28055id) < 0) {
                return false;
            }
            return true;
        }
        return dialog.pinned;
    }

    public final void s5() {
        hi.l3 l3Var;
        boolean X4 = getMessagesController().X4();
        if (this.P3 != X4) {
            k5();
            if (!this.P3 && X4 && (l3Var = this.f53724q0) != null) {
                l3Var.w();
            }
            this.P3 = X4;
        }
        org.telegram.ui.Components.t00 t00Var = this.f53746u0;
        if (t00Var == null) {
            return;
        }
        if (this.T0 == 10) {
            t00Var.setImageResource(2131231195);
            this.f53746u0.setContentDescription(org.telegram.messenger.hd.M0(2131751354, null));
            return;
        }
        t00Var.setImageResource(2131231107);
        this.f53746u0.setContentDescription(org.telegram.messenger.hd.M0(2131748270, null));
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        qv qvVar = this.F0;
        if (qvVar != null) {
            if (this.H0 && !z10) {
                qvVar.setVisibility(0);
            } else {
                qvVar.setVisibility(8);
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
        if (this.f53739s3 && (hwVar = this.D0) != null) {
            ArrayList arrayList = hwVar.D0;
            if (!arrayList.isEmpty()) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    if (o0Var.b((jg.o0) arrayList.get(i7))) {
                        return;
                    }
                }
            }
            arrayList.add(o0Var);
            nw nwVar = this.Y;
            ArrayList arrayList2 = nwVar.G;
            arrayList2.add(o0Var);
            nwVar.J = arrayList2.size() - 1;
            nwVar.e();
            this.Y.f40202r.getText().clear();
            j5(true, null, null, false, true);
        }
    }

    public final boolean t4() {
        if (this.E2 == null && this.f53721p2 == null) {
            return true;
        }
        return false;
    }

    public final void t5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        boolean z12;
        fi.s6 j42;
        ArrayList arrayList;
        boolean z13;
        boolean z14;
        int i7;
        float f10;
        float f11;
        if (this.F0 != null && this.J == null) {
            uv uvVar = this.H3;
            if ((uvVar == null || !uvVar.c()) && !this.f53739s3 && (kVar = this.actionBar) != null && !kVar.x() && !this.f53712n2) {
                hi.sa saVar = hi.sa.G2;
                int i10 = 0;
                if ((saVar != null && saVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
                    z10 = false;
                }
                if (!q4() && j4().I()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f53648a3 != 0) {
                    z12 = false;
                } else if (q4()) {
                    z12 = !j4().h.isEmpty();
                } else {
                    if (!z11 && (((arrayList = (j42 = j4()).f12324g) != null && arrayList.size() > 0) || j42.J())) {
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
                    qv qvVar = this.F0;
                    if (z13 != z15) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    qvVar.p(z10, z14);
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
                        ofFloat.addUpdateListener(new ii(1, this));
                        this.K.addListener(new org.telegram.ui.Cells.w9(this, 26));
                        this.K.setDuration(200L);
                        this.K.setInterpolator(org.telegram.ui.Components.er.f34420f);
                        this.K.start();
                    } else {
                        qv qvVar2 = this.F0;
                        if (z16 && !isInPreviewMode()) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        qvVar2.setVisibility(i7);
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
                        ofFloat2.addUpdateListener(new gw(this, f14, z12, f12));
                        this.J.addListener(new aw(this, z12, 2));
                        this.J.setDuration(200L);
                        this.J.setInterpolator(org.telegram.ui.Components.er.f34420f);
                        this.J.start();
                        return;
                    }
                    this.L = z12;
                    qv qvVar3 = this.F0;
                    if ((z12 || this.M) && !isInPreviewMode()) {
                        i11 = 0;
                    }
                    qvVar3.setVisibility(i11);
                    if (!z12) {
                        O4(0.0f);
                    } else {
                        this.A3 = -org.telegram.messenger.g0.L(81.0f);
                        O4(-f4());
                    }
                    while (true) {
                        xw[] xwVarArr = this.f53673f0;
                        if (i10 >= xwVarArr.length) {
                            break;
                        }
                        xw xwVar = xwVarArr[i10];
                        if (xwVar != null) {
                            xwVar.f53331a.requestLayout();
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
            if (this.Y2 == 0 && this.f53648a3 == 0 && Build.VERSION.SDK_INT >= 33 && fh0.J0(parentActivity)) {
                if (z10) {
                    showDialog(new fh0(parentActivity, !c8.ka.a(), new su(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().V && this.W1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z10) {
                    org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.t4.v(parentActivity, new ku(this, 1)).f28392a;
                    this.V1 = t1Var;
                    showDialog(t1Var);
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
            } else if ((i7 <= 28 || org.telegram.messenger.r2.f26199b) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.u5(int, boolean):void");
    }

    @Override
    public final void v() {
        J4(true, true);
    }

    public final void v3(CharSequence charSequence) {
        int i7;
        if (this.D1 != null) {
            if (this.F2 == null && this.G2 == null && this.H2 == null) {
                return;
            }
            if (this.I2 == null) {
                org.telegram.ui.Components.to0 to0Var = new org.telegram.ui.Components.to0(getParentActivity(), getResourceProvider());
                this.I2 = to0Var;
                to0Var.setLayoutClickListener(new gu(this, 0));
                this.I2.setOnModeChangeListener(new hu(this, 0));
                kv kvVar = this.D1;
                org.telegram.ui.Components.to0 to0Var2 = this.I2;
                if (to0Var2 == null) {
                    kvVar.getClass();
                } else {
                    kvVar.f32254o2 = to0Var2;
                    kvVar.addView(to0Var2, 0, c8.ja.e(-1, 48, 51));
                    kvVar.O3 = false;
                    kvVar.Q();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.I2.getLayoutParams();
                layoutParams.rightMargin = -this.D1.getPaddingRight();
                this.I2.setLayoutParams(layoutParams);
            }
            if (m4()) {
                this.I2.i(this.currentAccount, this.F2);
            } else {
                String str = this.G2;
                if (str != null) {
                    org.telegram.ui.Components.to0 to0Var3 = this.I2;
                    to0Var3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        to0Var3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.H2;
                    if (charSequence2 != null) {
                        org.telegram.ui.Components.to0 to0Var4 = this.I2;
                        to0Var4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            to0Var4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.D1.setFieldText(charSequence);
            }
            kv kvVar2 = this.D1;
            if (m4()) {
                i7 = 2131754454;
            } else {
                i7 = 2131745462;
            }
            kvVar2.setOverrideHint(org.telegram.messenger.hd.M0(i7, null));
            H3();
            if (this.I2.getMode() != 0) {
                this.D1.Q1(false, false);
            }
            p5();
        }
    }

    public final void v4(long j3) {
        char c10;
        long j10 = j3;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j10);
        int i7 = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList arrayList = (ArrayList) getMessagesController().f25430x.f(dialog.community_id);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                v4(((TLRPC.Dialog) obj).f28055id);
            }
            return;
        }
        int i10 = this.f53673f0[0].f53338s;
        org.telegram.messenger.so soVar = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.x() || this.actionBar.y(null))) {
            org.telegram.messenger.so[] soVarArr = getMessagesController().N;
            if (this.f53673f0[0].f53338s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            soVar = soVarArr[c10];
        }
        int i11 = -1;
        if (soVar != null) {
            int i12 = soVar.f26547g;
            int i13 = org.telegram.messenger.np.D8;
            if ((i12 & 64) != 0 && !soVar.a(this.currentAccount, dialog)) {
                M4(true, true);
                z3();
                if (this.T1 != null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= this.T1.size()) {
                            break;
                        } else if (((TLRPC.Dialog) this.T1.get(i14)).f28055id == j10) {
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
            org.telegram.messenger.np messagesController = getMessagesController();
            org.telegram.messenger.vr messagesStorage = messagesController.getMessagesStorage();
            org.telegram.messenger.ol olVar = new org.telegram.messenger.ol(messagesController, j10);
            org.telegram.messenger.p5 p5Var = messagesStorage.f27220a;
            org.telegram.messenger.a4 a4Var = new org.telegram.messenger.a4(messagesStorage, j10, olVar, 5);
            j10 = j10;
            p5Var.c(a4Var);
        }
        getMessagesController().o3(j10, 0L);
        org.telegram.messenger.np messagesController2 = getMessagesController();
        int i16 = dialog.top_message;
        messagesController2.j3(j10, i16, i16, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i15 >= 0) {
            this.T1.remove(i15);
            this.f53673f0[0].f53341y.D();
            this.f53673f0[0].q(true);
        }
    }

    public final boolean v5(long j3) {
        TLRPC.Chat M0;
        kv kvVar;
        if ((this.U0 <= 1 && ((kvVar = this.D1) == null || kvVar.getVisibility() != 0 || TextUtils.isEmpty(this.D1.getFieldText()))) || !org.telegram.messenger.m5.z(j3) || (M0 = getMessagesController().M0(Long.valueOf(-j3))) == null || org.telegram.messenger.t3.N(M0) || !M0.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.t4.r0(this, org.telegram.messenger.hd.M0(2131745310, null), org.telegram.messenger.hd.M0(2131745302, null), null);
        return false;
    }

    public final int w3() {
        if (this.D1 != null) {
            return (int) (this.A1.getInputBubbleHeight() + this.f53756w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f) + org.telegram.messenger.g0.L(2.0f));
        } else if (this.f53648a3 != 0) {
            return org.telegram.messenger.g0.L(72.0f) + this.f53687h4;
        } else {
            return this.f53687h4 + this.f53696j4;
        }
    }

    public final boolean w4(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.User r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.w4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    public final boolean x3() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.K2;
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
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.H;
        if (user != null && !org.telegram.messenger.q10.z(user) && !org.telegram.messenger.q10.x(user)) {
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
        org.telegram.ui.Components.cf0 cf0Var;
        gv gvVar;
        org.telegram.ui.Components.cm0 cm0Var;
        b61 b61Var;
        hw hwVar = this.D0;
        if (hwVar != null && (cm0Var = hwVar.f36050e0) != null && (b61Var = cm0Var.f17097l0) != null) {
            int childCount = b61Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = b61Var.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.o4) {
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) childAt;
                    org.telegram.ui.Components.t8 t8Var = o4Var.f30800c;
                    int i10 = o4Var.h;
                    if (org.telegram.messenger.m5.E(o4Var.f30802f)) {
                        TLRPC.User a22 = org.telegram.messenger.np.s1(i10).a2(Long.valueOf(o4Var.f30802f));
                        o4Var.f30801e = a22;
                        t8Var.r(a22);
                    } else {
                        t8Var.q(org.telegram.messenger.np.s1(i10).M0(Long.valueOf(-o4Var.f30802f)));
                        o4Var.f30801e = null;
                    }
                    o4Var.c(true);
                }
            }
        }
        if (this.f53673f0 != null) {
            int i11 = 0;
            while (true) {
                xw[] xwVarArr = this.f53673f0;
                if (i11 >= xwVarArr.length) {
                    break;
                }
                xw xwVar = xwVarArr[i11];
                if (xwVar != null && (gvVar = xwVar.f53336n) != null) {
                    gvVar.i();
                }
                i11++;
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.I(getThemedColor(org.telegram.ui.ActionBar.j6.G8), true);
            this.actionBar.J(getThemedColor(org.telegram.ui.ActionBar.j6.E8), false, true);
            this.actionBar.J(getThemedColor(org.telegram.ui.ActionBar.j6.F8), true, true);
            this.actionBar.K(getThemedColor(org.telegram.ui.ActionBar.j6.I5), true);
            this.actionBar.updateColors();
        }
        if (this.F3 != null) {
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.f29100qi);
            Drawable drawable = this.M3;
            if (drawable != null && themedColor2 != this.f53773y4) {
                this.f53773y4 = themedColor2;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.Components.e5 e5Var = this.F3;
            if (e5Var != null) {
                e5Var.k(Integer.valueOf(themedColor2));
            }
            org.telegram.ui.Cells.o oVar = this.G3;
            if (oVar != null) {
                oVar.setColor(themedColor2);
            }
        }
        org.telegram.ui.Cells.b3 b3Var = this.O1;
        if (b3Var != null) {
            org.telegram.ui.ActionBar.j6.H1(b3Var.getBackground(), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28941i6, false), true);
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.f53711n0;
        if (q0Var != null) {
            q0Var.setIconColor(getThemedColor(org.telegram.ui.ActionBar.j6.f29186v8));
        }
        kv kvVar = this.D1;
        if (kvVar != null) {
            kvVar.updateColors();
        }
        ow owVar = this.A0;
        if (owVar != null) {
            fh.g gVar = owVar.f35816z0;
            if (gVar != null) {
                gVar.updateColors();
            }
            owVar.invalidate();
        }
        jg.q0 q0Var2 = this.f53657c0;
        if (q0Var2 != null) {
            q0Var2.updateColors();
        }
        hw hwVar2 = this.D0;
        if (hwVar2 != null && (cf0Var = hwVar2.f36063s0) != null) {
            cf0Var.c();
        }
        org.telegram.ui.Components.v61 v61Var = this.f53651b0;
        if (v61Var != null) {
            v61Var.updateColors();
        }
        az0 az0Var = this.f53645a0;
        if (az0Var != null) {
            az0Var.updateColors();
        }
        if (this.L0 != null) {
            int o4 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6), 100);
            if (this.L0.getForeground() instanceof ColorDrawable) {
                if (((ColorDrawable) this.L0.getForeground()).getColor() != o4) {
                    ((ColorDrawable) this.L0.getForeground()).setColor(o4);
                }
            } else {
                this.L0.setForeground(new ColorDrawable(o4));
            }
        }
        org.telegram.ui.Components.t00 t00Var = this.f53746u0;
        if (t00Var != null) {
            t00Var.updateColors();
        }
        org.telegram.ui.Components.t00 t00Var2 = this.f53751v0;
        if (t00Var2 != null) {
            t00Var2.updateColors();
        }
        int i12 = org.telegram.ui.ActionBar.j6.f28849d6;
        this.o4.a(getThemedColor(i12));
        org.telegram.ui.Components.vr vrVar = this.L1;
        if (vrVar != null) {
            vrVar.updateColors();
        }
        org.telegram.ui.Components.ur urVar = this.M1;
        if (urVar != null) {
            urVar.setColor(org.telegram.ui.ActionBar.j6.x0(null, i12, false));
        }
        iv ivVar = this.J1;
        if (ivVar != null) {
            ivVar.updateColors();
        }
        iv ivVar2 = this.H1;
        if (ivVar2 != null) {
            ivVar2.updateColors();
        }
        n5();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        qv qvVar = this.F0;
        if (qvVar != null) {
            qvVar.o();
        }
        if (this.E3 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.Xl)) != this.f53767x4) {
            this.f53767x4 = themedColor;
            this.E3.setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        }
        nw nwVar = this.Y;
        if (nwVar != null) {
            nwVar.updateColors();
        }
    }

    public final void y4(View view) {
        boolean z10;
        int i7;
        int i10;
        String str;
        int i11;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        org.telegram.ui.ActionBar.u2 i12 = org.telegram.messenger.i20.i(getParentActivity(), false, 1, null);
        if (getMessagesStorage().M != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i7 = 2131232216;
        } else {
            i7 = 0;
        }
        if (org.telegram.messenger.gz.f23974q1) {
            i10 = 2131230998;
        } else {
            i10 = 2131231002;
        }
        int[] iArr = {i7, i10};
        if (z10) {
            str = org.telegram.messenger.hd.M0(2131748682, null);
        } else {
            str = null;
        }
        if (org.telegram.messenger.gz.f23974q1) {
            i11 = 2131747246;
        } else {
            i11 = 2131749324;
        }
        CharSequence[] charSequenceArr = {str, org.telegram.messenger.hd.M0(i11, null)};
        k4 k4Var = new k4(this, 1);
        i12.M = charSequenceArr;
        i12.N = iArr;
        i12.L = k4Var;
        showDialog(i12);
    }

    public final void z3() {
        org.telegram.messenger.g0.i3(new av(this, 0), 300L);
    }

    public final void z4(android.view.View r27, int r28, v4.h0 r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw.z4(android.view.View, int, v4.h0):void");
    }
}
