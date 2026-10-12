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
import android.graphics.drawable.Drawable;
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
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.XiaomiUtilities;
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
public class yy extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, ng.b, ne.d, jh0 {
    public static boolean f42299w4;
    public static final boolean[] f42300x4 = new boolean[4];
    public static final org.telegram.ui.Components.js0 f42301y4 = new org.telegram.ui.Components.js0(3);
    public static float f42302z4;
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public ix B1;
    public boolean B2;
    public Long B3;
    public iy C0;
    public ji.y1 C1;
    public sy C2;
    public Drawable C3;
    public org.telegram.ui.Components.pv0 D0;
    public org.telegram.ui.ActionBar.u0 D1;
    public ArrayList D2;
    public org.telegram.ui.Components.q5 D3;
    public boolean E;
    public px E0;
    public final TextPaint E1;
    public String E2;
    public org.telegram.ui.Cells.o E3;
    public boolean F;
    public org.telegram.ui.Components.vs F0;
    public hx F1;
    public CharSequence F2;
    public sx F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public FrameLayout G1;
    public org.telegram.ui.Components.or0 G2;
    public final gx G3;
    public long H;
    public float H0;
    public hx H1;
    public org.telegram.ui.Components.k31 H2;
    public final gx H3;
    public ValueAnimator I;
    public float I0;
    public FrameLayout I1;
    public final ArrayList I2;
    public hh0 I3;
    public ValueAnimator J;
    public float J0;
    public org.telegram.ui.Components.xs J1;
    public boolean J2;
    public NotificationCenter.ObserversGroup J3;
    public boolean K;
    public di.ab K0;
    public org.telegram.ui.Components.ws K1;
    public int K2;
    public Drawable K3;
    public boolean L;
    public org.telegram.ui.Components.m80 L0;
    public org.telegram.ui.Cells.m L1;
    public int L2;
    public int L3;
    public boolean M;
    public ux M0;
    public org.telegram.ui.Cells.a3 M1;
    public int M2;
    public boolean M3;
    public float N;
    public boolean N0;
    public org.telegram.ui.Cells.ua N1;
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
    public hi.j Q1;
    public int Q2;
    public gv Q3;
    public boolean R;
    public int R0;
    public ArrayList R1;
    public int R2;
    public String R3;
    public org.telegram.ui.Components.sc S;
    public int S0;
    public boolean S1;
    public int S2;
    public ArrayList S3;
    public float T;
    public int T0;
    public org.telegram.ui.ActionBar.a2 T1;
    public int T2;
    public boolean T3;
    public boolean U;
    public boolean U0;
    public boolean U1;
    public boolean U2;
    public CharSequence U3;
    public boolean V;
    public org.telegram.ui.Components.ae0 V0;
    public boolean V1;
    public int V2;
    public boolean V3;
    public boolean W;
    public org.telegram.ui.Cells.s2 W0;
    public long W1;
    public yy W2;
    public float W3;
    public oy X;
    public org.telegram.ui.Cells.s2 X0;
    public TLObject X1;
    public long X2;
    public boolean X3;
    public zf.h0 Y;
    public boolean Y0;
    public int Y1;
    public TLRPC.Chat Y2;
    public boolean Y3;
    public c51 Z;
    public boolean Z0;
    public int Z1;
    public TLRPC.ChatFull Z2;
    public ValueAnimator Z3;
    public final int f42303a;
    public org.telegram.ui.Components.j91 f42304a0;
    public final ArrayList f42305a1;
    public boolean a2;
    public org.telegram.ui.Components.z9 f42306a3;
    public org.telegram.ui.Components.i50 f42307a4;
    public final ne.b f42308b;
    public hg.r0 f42309b0;
    public boolean f42310b1;
    public boolean f42311b2;
    public org.telegram.ui.Components.k9 f42312b3;
    public TLRPC.FileLocation f42313b4;
    public final ne.b f42314c;
    public float f42315c0;
    public boolean f42316c1;
    public boolean f42317c2;
    public long f42318c3;
    public TLRPC.FileLocation f42319c4;
    public final ne.b d;
    public ValueAnimator f42320d0;
    public boolean f42321d1;
    public int f42322d2;
    public boolean f42323d3;
    public org.telegram.ui.Components.sc f42324d4;
    public final ne.b e;
    public xy[] f42325e0;
    public org.telegram.ui.ActionBar.f2 f42326e1;
    public boolean f42327e2;
    public boolean f42328e3;
    public int f42329e4;
    public final ne.b f42330f;
    public org.telegram.ui.ActionBar.u0 f42331f0;
    public final Paint f42332f1;
    public String f42333f2;
    public AnimatorSet f42334f3;
    public int f42335f4;
    public org.telegram.ui.ActionBar.u0 f42336g0;
    public ImageView f42337g1;
    public String f42338g2;
    public boolean f42339g3;
    public int f42340g4;
    public final ne.b h;
    public az f42341h0;
    public NumberTextView f42342h1;
    public String f42343h2;
    public boolean f42344h3;
    public int f42345h4;
    public boolean f42346i0;
    public final ArrayList f42347i1;
    public boolean f42348i2;
    public float f42349i3;
    public int f42350i4;
    public org.telegram.ui.ActionBar.u0 f42351j0;
    public org.telegram.ui.ActionBar.u0 f42352j1;
    public boolean f42353j2;
    public boolean f42354j3;
    public ih.j f42355j4;
    public org.telegram.ui.ActionBar.u0 f42356k0;
    public org.telegram.ui.ActionBar.u0 f42357k1;
    public boolean f42358k2;
    public int f42359k3;
    public final bh.f f42360k4;
    public org.telegram.ui.ActionBar.u0 f42361l0;
    public org.telegram.ui.ActionBar.u0 l1;
    public boolean f42362l2;
    public boolean f42363l3;
    public final gh.d l4;
    public org.telegram.ui.ActionBar.u0 m0;
    public org.telegram.ui.ActionBar.u0 f42364m1;
    public boolean f42365m2;
    public boolean f42366m3;
    public final gh.d f42367m4;
    public final ne.b f42368n;
    public org.telegram.ui.Components.gj0 f42369n0;
    public org.telegram.ui.ActionBar.e1 f42370n1;
    public String f42371n2;
    public org.telegram.ui.Components.sc f42372n3;
    public final gh.c f42373n4;
    public org.telegram.ui.ActionBar.e1 f42374o0;
    public org.telegram.ui.ActionBar.e1 f42375o1;
    public String f42376o2;
    public final AnimationNotificationsLocker f42377o3;
    public final bh.b f42378o4;
    public di.d4 f42379p0;
    public org.telegram.ui.ActionBar.e1 f42380p1;
    public final MessagesStorage.TopicKey f42381p2;
    public boolean f42382p3;
    public final bh.b f42383p4;
    public di.d4 f42384q0;
    public org.telegram.ui.ActionBar.e1 f42385q1;
    public boolean f42386q2;
    public boolean f42387q3;
    public final bh.b f42388q4;
    public final ne.b f42389r;
    public boolean f42390r0;
    public org.telegram.ui.ActionBar.e1 f42391r1;
    public boolean f42392r2;
    public boolean f42393r3;
    public final bh.b f42394r4;
    public final ne.b f42395s;
    public boolean f42396s0;
    public org.telegram.ui.ActionBar.e1 f42397s1;
    public boolean f42398s2;
    public boolean f42399s3;
    public ow f42400s4;
    public org.telegram.ui.Components.l20 f42401t0;
    public org.telegram.ui.ActionBar.e1 f42402t1;
    public boolean f42403t2;
    public float f42404t3;
    public final ArrayList f42405t4;
    public org.telegram.ui.Components.l20 f42406u0;
    public float f42407u1;
    public boolean f42408u2;
    public ValueAnimator f42409u3;
    public final RectF f42410u4;
    public final qh.i v;
    public di.d f42411v0;
    public float f42412v1;
    public boolean f42413v2;
    public float f42414v3;
    public final RectF f42415v4;
    public boolean f42416w;
    public kh.f f42417w0;
    public AnimatorSet f42418w1;
    public boolean f42419w2;
    public float f42420w3;
    public int f42421x;
    public int f42422x0;
    public float f42423x1;
    public boolean f42424x2;
    public float f42425x3;
    public boolean f42426y;
    public final UndoView[] f42427y0;
    public ih.f f42428y1;
    public boolean f42429y2;
    public int y3;
    public ww f42430z0;
    public FrameLayout f42431z1;
    public boolean f42432z2;
    public boolean f42433z3;

    public yy(Bundle bundle) {
        super(bundle);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f42303a = i10;
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        this.f42308b = new ne.b(1, this, esVar, 350L, false);
        this.f42314c = new ne.b(2, this, esVar, 350L, false);
        this.d = new ne.b(3, this, esVar, 350L, false);
        this.e = new ne.b(4, this, esVar, 350L, false);
        this.f42330f = new ne.b(5, this, esVar, 350L, false);
        this.h = new ne.b(6, this, esVar, 350L, false);
        this.f42368n = new ne.b(7, this, esVar, 350L, false);
        this.f42389r = new ne.b(8, this, esVar, 350L, false);
        this.f42395s = new ne.b(9, this, esVar, 350L, false);
        this.v = new qh.i(new nw(this, 2));
        this.f42421x = -1;
        this.F = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.Q = true;
        this.f42315c0 = 1.0f;
        this.f42427y0 = new UndoView[2];
        this.f42305a1 = new ArrayList();
        this.f42332f1 = new Paint();
        this.f42347i1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.E1 = new TextPaint(1);
        this.U1 = true;
        this.f42317c2 = true;
        this.f42348i2 = true;
        this.f42381p2 = new MessagesStorage.TopicKey();
        this.I2 = new ArrayList();
        this.J2 = true;
        this.f42377o3 = new AnimationNotificationsLocker();
        this.y3 = -1;
        this.G3 = new gx(this, 0);
        this.H3 = new gx(this, 1);
        this.L3 = -4;
        this.M3 = true;
        this.N3 = true;
        this.W3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f42405t4 = arrayList;
        RectF rectF = new RectF();
        this.f42410u4 = rectF;
        RectF rectF2 = new RectF();
        this.f42415v4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        gh.c cVar = new gh.c();
        this.f42373n4 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
        if (i11 >= 31) {
            this.f42360k4 = new bh.f(false);
            gh.d dVar = new gh.d(null);
            this.l4 = dVar;
            dVar.j(new ey(this, 0));
            gh.d dVar2 = new gh.d(null);
            this.f42367m4 = dVar2;
            dVar2.j(new ey(this, 3));
            bh.b bVar = new bh.b(dVar);
            this.f42378o4 = bVar;
            bVar.f2747i = LiteMode.isEnabled(262144);
            bh.b bVar2 = new bh.b(dVar2);
            this.f42388q4 = bVar2;
            bVar2.f2747i = LiteMode.isEnabled(262144);
            this.f42383p4 = new bh.b(dVar);
        } else {
            this.f42360k4 = null;
            this.l4 = null;
            this.f42367m4 = null;
            this.f42378o4 = new bh.b(cVar);
            this.f42388q4 = new bh.b(cVar);
            this.f42383p4 = new bh.b(cVar);
        }
        this.f42394r4 = new bh.b(cVar);
    }

    public static void B0(yy yyVar, float f7, ValueAnimator valueAnimator) {
        yyVar.f42325e0[0].setTranslationY((1.0f - yyVar.f42404t3) * f7);
        yyVar.f42404t3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < yyVar.actionBar.getChildCount(); i10++) {
            if (yyVar.actionBar.getChildAt(i10).getVisibility() == 0 && yyVar.actionBar.getChildAt(i10) != yyVar.actionBar.getActionMode() && yyVar.actionBar.getChildAt(i10) != yyVar.actionBar.getBackButton()) {
                yyVar.actionBar.getChildAt(i10).setAlpha(1.0f - yyVar.f42404t3);
            }
        }
        yyVar.B3();
        yyVar.t3();
        View view = yyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void C0(yy yyVar) {
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(yyVar.getParentActivity(), yyVar.resourceProvider);
        acVar.d(R.raw.email_check_inbox, new String[0]);
        acVar.f23513b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.sc.g(yyVar, acVar, 2750).j();
        try {
            yyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void D0(org.telegram.ui.yy r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.D0(org.telegram.ui.yy):void");
    }

    public static void E0(yy yyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() == 1) {
            yh.p1 p1Var = new yh.p1(yyVar.getParentActivity(), yyVar.currentAccount, birthdayState.today.get(0).f19363id, null, null);
            p1Var.W(true);
            yyVar.showDialog(p1Var);
            return;
        }
        ug.m1.f0(0, birthdayState);
    }

    public static void F0(yy yyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.sc M = org.telegram.ui.Components.zc.a0(yyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
            M.f29102j = 5000;
            M.j();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            yyVar.getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (yyVar.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yyVar.getParentActivity(), 0, yyVar.resourceProvider);
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                yyVar.showDialog(alertDialog$Builder.f19548a);
                return;
            }
            return;
        }
        org.telegram.messenger.q.r(R.string.UnknownError, org.telegram.ui.Components.zc.a0(yyVar), R.raw.error, 36);
    }

    public static void G0(yy yyVar) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        yyVar.R4();
    }

    public static void K2(yy yyVar, float f7) {
        float f10;
        float f11;
        int i10;
        int i11;
        float clamp = Utilities.clamp(yyVar.f42423x1 * 2.0f, 1.0f, 0.0f);
        px pxVar = yyVar.E0;
        float f12 = (1.0f - yyVar.f42404t3) * f7 * yyVar.H0;
        float f13 = 1.0f - clamp;
        pxVar.setAlpha(f12 * f13);
        int i12 = 0;
        if (!yyVar.K && !yyVar.M) {
            if (yyVar.L) {
                yyVar.E0.setTranslationY((Math.max(yyVar.N, -yyVar.R3()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                yyVar.E0.setProgressToCollapse(1.0f);
                px pxVar2 = yyVar.E0;
                pxVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - pxVar2.getY()));
            }
            f10 = 1.0f - yyVar.H0;
            yyVar.actionBar.setTranslationY(0.0f);
        } else {
            float clamp2 = Utilities.clamp((-yyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (yyVar.f42404t3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            yyVar.E0.setClipTop(0);
            if (!yyVar.K && yyVar.M) {
                yyVar.E0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                yyVar.E0.setProgressToCollapse(1.0f);
                f11 = yyVar.H0;
            } else {
                yyVar.E0.setTranslationY(((yyVar.T / 2.0f) + (Math.max(yyVar.N, -yyVar.R3()) + yyVar.f42414v3)) - AndroidUtilities.dp(8.0f));
                yyVar.E0.l(clamp2, !yyVar.F3.c());
                if (!yyVar.M) {
                    f11 = yyVar.H0;
                } else {
                    f10 = 1.0f - clamp3;
                    yyVar.actionBar.setTranslationY(0.0f);
                }
            }
            f10 = 1.0f - f11;
            yyVar.actionBar.setTranslationY(0.0f);
        }
        float f14 = f10 * f13;
        if (f14 != 1.0f) {
            yyVar.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
            yyVar.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
            float f15 = (0.6f * f14) + 0.4f;
            yyVar.actionBar.getTitlesContainer().setScaleY(f15);
            yyVar.actionBar.getTitlesContainer().setScaleX(f15);
            yyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            yyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
            yyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f15);
            yyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f15);
            float f16 = (1.0f - yyVar.f42404t3) * f14;
            yyVar.actionBar.getTitlesContainer().setAlpha(f16);
            FrameLayout titlesContainer = yyVar.actionBar.getTitlesContainer();
            int i13 = (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            titlesContainer.setVisibility(i11);
            yyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f16);
            FrameLayout additionalSubTitleOverlayContainer = yyVar.actionBar.getAdditionalSubTitleOverlayContainer();
            if (i13 <= 0) {
                i12 = 4;
            }
            additionalSubTitleOverlayContainer.setVisibility(i12);
            return;
        }
        yyVar.actionBar.getTitlesContainer().setScaleY(1.0f);
        yyVar.actionBar.getTitlesContainer().setScaleX(1.0f);
        yyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
        yyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
        float f17 = 1.0f - yyVar.f42404t3;
        yyVar.actionBar.getTitlesContainer().setAlpha(f17);
        FrameLayout titlesContainer2 = yyVar.actionBar.getTitlesContainer();
        int i14 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
        if (i14 > 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        titlesContainer2.setVisibility(i10);
        yyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
        FrameLayout additionalSubTitleOverlayContainer2 = yyVar.actionBar.getAdditionalSubTitleOverlayContainer();
        if (i14 <= 0) {
            i12 = 4;
        }
        additionalSubTitleOverlayContainer2.setVisibility(i12);
    }

    public static void L2(yy yyVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        if (yyVar.parentLayout != null && yyVar.actionBar != null) {
            float max = Math.max(yyVar.e.e, yyVar.S3());
            float f7 = 1.0f;
            float f10 = 1.0f - yyVar.f42423x1;
            float f11 = max * f10 * f10;
            int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            if (i11 != 0) {
                if (-1 >= i10) {
                    f7 = 0.0f;
                    i10 = -1;
                }
                if (f7 > 0.0f && i11 > 0 && i10 > 0 && (b5Var = yyVar.parentLayout) != null) {
                    ((ActionBarLayout) b5Var).p(canvas, (int) (f7 * 255.0f * f11), i10);
                }
            }
        }
    }

    public static org.telegram.ui.Cells.s2 N3(xy xyVar) {
        uy uyVar = xyVar.f41980a;
        for (int i10 = 0; i10 < uyVar.getChildCount(); i10++) {
            View childAt = uyVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s2) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt;
                if (s2Var.P()) {
                    return s2Var;
                }
            }
        }
        return null;
    }

    public static void U(yy yyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        yyVar.R4();
    }

    public static void V(yy yyVar, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        yyVar.f42404t3 = floatValue;
        yyVar.f42325e0[0].setTranslationY((-f7) * floatValue);
        for (int i10 = 0; i10 < yyVar.actionBar.getChildCount(); i10++) {
            if (yyVar.actionBar.getChildAt(i10).getVisibility() == 0 && yyVar.actionBar.getChildAt(i10) != yyVar.actionBar.getActionMode() && yyVar.actionBar.getChildAt(i10) != yyVar.actionBar.getBackButton()) {
                yyVar.actionBar.getChildAt(i10).setAlpha(1.0f - yyVar.f42404t3);
            }
        }
        View view = yyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        yyVar.B3();
        yyVar.t3();
    }

    public static void W(yy yyVar) {
        ArrayList arrayList = yyVar.I2;
        org.telegram.ui.ActionBar.b5 b5Var = yyVar.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).y()) {
            yyVar.finishPreviewFragment();
        } else if (yyVar.R0 == 10) {
            if (yyVar.C2 != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i10)).longValue(), 0L));
                }
                yyVar.C2.w(yyVar, arrayList2, null, false, yyVar.J2, yyVar.K2, yyVar.L2, null);
            }
        } else if (MessagesController.getInstance(yyVar.currentAccount).isFrozen()) {
            b.b(yyVar.currentAccount);
        } else {
            yyVar.presentFragment(new ContactsActivity(a1.g.h("destroyAfterSelect", true)));
        }
    }

    public static void X(yy yyVar) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        yyVar.R4();
    }

    public static void Y(yy yyVar) {
        PasskeysActivity.a0(yyVar.currentAccount, yyVar.getParentActivity(), yyVar.resourceProvider, true);
    }

    public static void Z(yy yyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(yyVar.currentAccount).getClientUserId());
        yyVar.presentFragment(new fo(bundle));
    }

    public static void a0(yy yyVar, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = yyVar.getMessagesController().getUserFull(yyVar.getUserConfig().getClientUserId());
        if (userFull != null) {
            tL_birthday2 = userFull.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        yyVar.getMessagesController().invalidateContentSettings();
        yyVar.getConnectionsManager().sendRequest(updatebirthday, new fa(yyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        yyVar.R4();
    }

    public static void a4(fo foVar, MessageObject messageObject) {
        CharSequence charSequence;
        if (messageObject != null && messageObject.hasHighlightedWords()) {
            try {
                if (!TextUtils.isEmpty(messageObject.caption)) {
                    charSequence = messageObject.caption;
                } else {
                    charSequence = messageObject.messageText;
                }
                CharSequence highlightText = AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (org.telegram.ui.ActionBar.c6) null);
                if (highlightText instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) highlightText;
                    org.telegram.ui.Components.q10[] q10VarArr = (org.telegram.ui.Components.q10[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.q10.class);
                    if (q10VarArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(q10VarArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(q10VarArr[0]);
                        for (int i10 = 1; i10 < q10VarArr.length; i10++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(q10VarArr[i10]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(q10VarArr[i10]);
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
                        foVar.qb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void b0(yy yyVar, String str) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, str);
        yyVar.R4();
    }

    public static void c0(yy yyVar, xy xyVar, View view, int i10) {
        int i11;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.v3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.s2;
        if (z10) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
            if (s2Var.f21868n2) {
                yyVar.K4(s2Var.getDialogId(), view);
                return;
            }
        }
        if (yyVar.F3()) {
            yyVar.l4(view, i10, 0.0f, xyVar.d);
            return;
        }
        int i12 = yyVar.R0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.r8)) {
            xyVar.d.K();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle h = a1.g.h("forImport", true);
            h.putLongArray("result", new long[]{yyVar.getUserConfig().getClientUserId()});
            h.putInt("chatType", 4);
            String string = yyVar.arguments.getString("importTitle");
            if (string != null) {
                h.putString("title", string);
            }
            p70 p70Var = new p70(h);
            p70Var.Y = new cx(yyVar);
            yyVar.presentFragment(p70Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.a3) && ((i11 = xyVar.f41986s) == 7 || i11 == 8)) {
            hg.k kVar = (hg.k) xyVar.d.M.get(0);
            if (kVar != null && kVar.f43203a == 17) {
                tL_chatlists_chatlistUpdates = kVar.f10647i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = yyVar.getMessagesController().selectedDialogFilter[xyVar.f41986s - 7];
                if (dialogFilter != null) {
                    int i14 = dialogFilter.f16708id;
                    ?? dbVar = new org.telegram.ui.Components.db(yyVar, false);
                    dbVar.Y = -1;
                    dbVar.f27770c0 = "";
                    dbVar.f27771d0 = new ArrayList();
                    dbVar.f27773f0 = "";
                    dbVar.f27775h0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    dbVar.f27776i0 = arrayList;
                    dbVar.f27792z0 = -1;
                    dbVar.C0 = -5;
                    dbVar.Y = i14;
                    dbVar.f27768a0 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    dbVar.f27774g0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = yyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i13).f16708id == i14) {
                                dbVar.f27770c0 = arrayList2.get(i13).name;
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    dbVar.T();
                    yyVar.showDialog(dbVar);
                    return;
                }
                return;
            }
        } else if (z10 && !yyVar.actionBar.t() && !yyVar.F3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.s2) view).Y1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        yyVar.k4(view, i10, xyVar.d);
    }

    public static void c1(yy yyVar, boolean z10) {
        if (yyVar.f42325e0 != null && yyVar.M3 != z10) {
            yyVar.M3 = z10;
            int i10 = 0;
            while (true) {
                xy[] xyVarArr = yyVar.f42325e0;
                if (i10 < xyVarArr.length) {
                    if (z10) {
                        xyVarArr[i10].f41980a.setScrollbarFadingEnabled(false);
                    }
                    yyVar.f42325e0[i10].f41980a.setVerticalScrollBarEnabled(z10);
                    if (z10) {
                        yyVar.f42325e0[i10].f41980a.setScrollbarFadingEnabled(true);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public static void d0(yy yyVar) {
        yyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(yyVar.parentLayout, "newChatsRow");
    }

    public static void e0(yy yyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(yyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(yyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new fa(yyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void f0(yy yyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(launchActivity, yyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(yyVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void f4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = f42300x4;
        if (!zArr[currentAccount]) {
            MessagesController messagesController = accountInstance.getMessagesController();
            messagesController.loadGlobalNotificationsSettings();
            messagesController.loadDialogs(0, 0, 100, true);
            messagesController.loadHintDialogs();
            messagesController.loadUserInfo(accountInstance.getUserConfig().getCurrentUser(), false, 0);
            accountInstance.getContactsController().checkInviteText();
            accountInstance.getMediaDataController().checkAllMedia(false);
            AndroidUtilities.runOnUIThread(new gj(accountInstance, 19), 200L);
            Iterator<String> it = messagesController.diceEmojies.iterator();
            while (it.hasNext()) {
                accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
            }
            zArr[currentAccount] = true;
        }
    }

    public static void h0(yy yyVar) {
        if (yyVar.f42307a4.g()) {
            MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            yyVar.R4();
        }
    }

    public static void j0(yy yyVar) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        yyVar.R4();
    }

    public static void k0(yy yyVar) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        yyVar.R4();
    }

    public static void l0(yy yyVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        bi.g gVar;
        try {
            a2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject != null) {
            yyVar.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            bi.g gVar2 = new bi.g(yyVar, j10, 25);
            Pattern pattern = org.telegram.ui.Components.g5.f25184a;
            if (yyVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = yyVar.getCurrentAccount();
                    Activity parentActivity = yyVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
                    TextView textView = new TextView(parentActivity);
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20007j5, false));
                    textView.setTextSize(1, 16.0f);
                    int i16 = 5;
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 48);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    alertDialog$Builder.n(frameLayout);
                    org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
                    k9Var.u(AndroidUtilities.dp(12.0f));
                    org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(parentActivity);
                    z9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    frameLayout.addView(z9Var, w7.a6.a(40.0f, 22.0f, 5.0f, 22.0f, 0.0f, 40, i11 | 48));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E8, false));
                    textView2.setTextSize(1, 20.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    textView2.setGravity(i12 | 16);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setText(LocaleController.getString(R.string.ImportMessages));
                    boolean z10 = LocaleController.isRTL;
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
                    frameLayout.addView(textView2, w7.a6.a(-2.0f, f7, 11.0f, i15, 0.0f, -1, i17));
                    if (!LocaleController.isRTL) {
                        i16 = 3;
                    }
                    frameLayout.addView(textView, w7.a6.a(-2.0f, 24.0f, 57.0f, 24.0f, 9.0f, -2, i16 | 48));
                    if (user != null) {
                        if (UserObject.isReplyUser(user)) {
                            k9Var.f26627p = 0.8f;
                            k9Var.g(12);
                            z9Var.h(null, null, k9Var, user);
                            gVar = gVar2;
                        } else {
                            gVar = gVar2;
                            if (user.f19363id == clientUserId) {
                                k9Var.f26627p = 0.8f;
                                k9Var.g(1);
                                z9Var.h(null, null, k9Var, user);
                            } else {
                                k9Var.f26627p = 1.0f;
                                k9Var.m(currentAccount, user);
                                z9Var.e(user, k9Var);
                            }
                        }
                    } else {
                        gVar = gVar2;
                        k9Var.k(currentAccount, chat);
                        z9Var.e(chat, k9Var);
                    }
                    textView.setText(AndroidUtilities.replaceTags(str));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Import), new org.telegram.ui.Components.s(gVar, 3));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    yyVar.showDialog(alertDialog$Builder.f19548a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.g5.e0(yyVar.currentAccount, tL_error, yyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        yyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public static void m0(yy yyVar, int i10) {
        Object obj;
        TLRPC.User user;
        org.telegram.ui.Components.no0 no0Var = yyVar.C0.f31927o0;
        if (i10 >= no0Var.X && i10 < no0Var.Y) {
            org.telegram.ui.Components.l61 G = no0Var.G(i10);
            if (G != null) {
                obj = G.G;
            } else {
                obj = null;
            }
        } else {
            obj = Boolean.FALSE;
        }
        if (obj instanceof TLRPC.User) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yyVar.getParentActivity(), 0, yyVar.resourceProvider);
            String string = LocaleController.getString(R.string.AppsClearSearch);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
            a2Var.R = string;
            a2Var.T = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new gw(0, yyVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        }
    }

    public static void n0(yy yyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        HashSet hashSet2;
        if (i10 == 102) {
            yyVar.getMessagesController().setDialogsInTransaction(true);
            if (z10) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            yyVar.o4(arrayList, i10, false, false, hashSet2);
            yyVar.getMessagesController().setDialogsInTransaction(false);
            yyVar.getMessagesController().checkIfFolderEmpty(yyVar.V2);
            int i11 = yyVar.V2;
            if (i11 != 0 && yyVar.O3(yyVar.currentAccount, yyVar.f42325e0[0].f41986s, i11, false).size() == 0) {
                yyVar.f42325e0[0].f41980a.setEmptyView(null);
                yyVar.f42325e0[0].f41987w.setVisibility(4);
                yyVar.finishFragment();
                return;
            }
            return;
        }
        yyVar.o4(arrayList, i10, false, false, null);
    }

    public static void n1(yy yyVar, xy xyVar, float f7) {
        if (yyVar.T != f7) {
            yyVar.T = f7;
            int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            int i11 = 0;
            if (i10 == 0) {
                yyVar.U = false;
            }
            yyVar.E0.setOverscroll(f7);
            xyVar.f41980a.setViewsOffset(f7);
            uy uyVar = xyVar.f41980a;
            if (i10 != 0) {
                i11 = 2;
            }
            uyVar.setOverScrollMode(i11);
            yyVar.fragmentView.invalidate();
            if (f7 > AndroidUtilities.dp(90.0f) && !yyVar.U) {
                px pxVar = yyVar.E0;
                ValueAnimator valueAnimator = pxVar.H0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    pxVar.i(pxVar.f3830p0, true);
                    yyVar.U = true;
                    yyVar.getOrCreateStoryViewer().s(new uv(yyVar, 19));
                }
            }
        }
    }

    public static boolean o1(yy yyVar, xy xyVar) {
        if (!yyVar.F3.c()) {
            int i10 = (int) (-yyVar.N);
            int Q3 = yyVar.Q3();
            int R3 = yyVar.R3();
            if (i10 != 0 && i10 != Q3 && i10 != R3 && xyVar.f41980a.canScrollVertically(-1)) {
                if (R3 < i10 && i10 < Q3) {
                    int dp = AndroidUtilities.dp(48.0f);
                    int i11 = i10 - R3;
                    if (i11 < dp / 2) {
                        xyVar.f41981b.z(-i11);
                        return true;
                    }
                    xyVar.f41981b.z(dp - i11);
                    return true;
                }
                float f7 = 1.0f;
                if (yyVar.f42404t3 != 1.0f) {
                    f7 = Utilities.clamp((-yyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
                }
                if (f7 < yyVar.E0.B0) {
                    xyVar.f41981b.z(-i10);
                    return true;
                }
                xyVar.f41981b.z(R3 - i10);
                return true;
            }
            return false;
        }
        return false;
    }

    public static void p0(yy yyVar, int i10, org.telegram.ui.Components.m80 m80Var) {
        CharSequence charSequence;
        if (yyVar.currentAccount != i10) {
            m80Var.u();
            if (yyVar.getParentActivity() == null) {
                return;
            }
            sy syVar = yyVar.C2;
            LaunchActivity launchActivity = (LaunchActivity) yyVar.getParentActivity();
            ArrayList arrayList = yyVar.D2;
            String str = yyVar.E2;
            CharSequence charSequence2 = yyVar.F2;
            ix ixVar = yyVar.B1;
            if (ixVar != null) {
                charSequence = ixVar.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.K0(i10);
            yy yyVar2 = new yy(yyVar.arguments);
            yyVar2.C2 = syVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    yyVar2.D2 = null;
                } else {
                    yyVar2.D2 = arrayList;
                    yyVar2.E2 = null;
                    if (yyVar2.B1 != null) {
                        yyVar2.i3(charSequence);
                    } else {
                        yyVar2.U3 = charSequence;
                    }
                }
            } else if (str != null) {
                yyVar2.B4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    yyVar2.F2 = null;
                } else {
                    yyVar2.F2 = charSequence2;
                    yyVar2.E2 = null;
                    yyVar2.D2 = null;
                    if (yyVar2.B1 != null) {
                        yyVar2.i3(charSequence);
                    } else {
                        yyVar2.U3 = charSequence;
                    }
                }
            }
            launchActivity.q0(yyVar2, false, true);
        }
    }

    public static String p2(yy yyVar) {
        String shortName;
        ArrayList arrayList = yyVar.I2;
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
                if (longValue == yyVar.getUserConfig().getClientUserId()) {
                    sb2.append(LocaleController.getString(R.string.SavedMessages));
                } else {
                    if (arrayList.size() == 1) {
                        shortName = DialogObject.getName(yyVar.currentAccount, longValue);
                    } else {
                        shortName = DialogObject.getShortName(yyVar.currentAccount, longValue);
                    }
                    sb2.append(shortName);
                }
            }
            return LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        }
        return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
    }

    public static void q0(yy yyVar) {
        String str;
        MessagesController messagesController = MessagesController.getInstance(yyVar.currentAccount);
        if (yyVar.A3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        messagesController.removeSuggestion(0L, str);
        yyVar.R4();
    }

    public static void r0(yy yyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.C0(launchActivity, yyVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            vj1.a(yyVar.getParentActivity(), new z(yyVar, tL_attachMenuBot, launchActivity, 7), null);
        }
    }

    public static void s0(yy yyVar) {
        b.c(yyVar.getParentActivity(), yyVar.currentAccount, yyVar.getResourceProvider());
    }

    public static void t0(final int i10, final long j10, TLRPC.Chat chat, final yy yyVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        yyVar.Y3(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                yyVar.getMessagesController().deleteDialog(j10, 2, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i14 = yyVar.V2) != 0 && yyVar.O3(yyVar.currentAccount, yyVar.f42325e0[0].f41986s, i14, false).size() == 1) {
            yyVar.f42325e0[0].f41987w.setVisibility(4);
        }
        yyVar.y3 = 3;
        int i15 = -1;
        if (i10 == 102) {
            yyVar.x4(true, true);
            if (yyVar.R1 != null) {
                i13 = 0;
                while (i13 < yyVar.R1.size()) {
                    if (((TLRPC.Dialog) yyVar.R1.get(i13)).f19220id == j10) {
                        break;
                    }
                    i13++;
                }
            }
            i13 = -1;
            yyVar.l3();
            i11 = i13;
        } else {
            i11 = -1;
        }
        UndoView V3 = yyVar.V3();
        if (V3 != null) {
            if (i10 == 103) {
                i12 = 0;
            } else if (z11) {
                i12 = 1;
            } else {
                i12 = 95;
            }
            V3.j(i12, j10, new Runnable() {
                @Override
                public final void run() {
                    yyVar.n4(i10, j10, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(yyVar.O3(yyVar.currentAccount, yyVar.f42325e0[0].f41986s, yyVar.V2, false));
        int i16 = 0;
        while (true) {
            if (i16 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i16)).f19220id == j10) {
                i15 = i16;
                break;
            } else {
                i16++;
            }
        }
        if (i10 == 102) {
            if (i11 >= 0 && i15 < 0 && (arrayList = yyVar.R1) != null) {
                arrayList.remove(i11);
                yyVar.f42325e0[0].f41988x.D();
                yyVar.f42325e0[0].q(true);
                return;
            }
            yyVar.x4(false, true);
        }
    }

    public static void u0(yy yyVar) {
        BirthdayController.getInstance(yyVar.currentAccount).hide();
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        yyVar.R4();
        org.telegram.ui.Components.sc G = org.telegram.ui.Components.zc.a0(yyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f29102j = 5000;
        G.j();
    }

    public static void v0(yy yyVar) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        yyVar.R4();
    }

    public static void w0(yy yyVar) {
        if (!yyVar.N3) {
            di.d4 d4Var = yyVar.f42384q0;
            if (d4Var != null) {
                if (d4Var.V) {
                    return;
                }
                AndroidUtilities.removeFromParent(d4Var);
            }
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.g6.Gi, 0, new nw(yyVar, 8));
            di.d4 d4Var2 = new di.d4(yyVar.getParentActivity(), 2);
            d4Var2.q(8.0f);
            d4Var2.d = 8000L;
            d4Var2.i();
            d4Var2.p(true);
            d4Var2.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
            d4Var2.s(replaceSingleTag);
            d4Var2.l(1.0f, -40.0f);
            d4Var2.h(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
            yyVar.f42384q0 = d4Var2;
            d4Var2.setTranslationY((-yyVar.f42335f4) - yyVar.f42345h4);
            ((ViewGroup) yyVar.fragmentView).addView(yyVar.f42384q0, w7.a6.a(240.0f, 12.0f, 0.0f, 68.0f, 40.0f, -1, 87));
            yyVar.f42384q0.u();
            return;
        }
        di.d4 d4Var3 = yyVar.f42379p0;
        if (d4Var3 != null) {
            d4Var3.e(true);
        }
        bi.q8 o10 = MessagesController.getInstance(yyVar.currentAccount).getStoriesController().o();
        if (o10 != null && o10.a(yyVar.currentAccount, 1)) {
            yyVar.showDialog(new sg.j0(o10.b(), yyVar.currentAccount, yyVar.getParentActivity(), yyVar, null));
            return;
        }
        di.kc D = di.kc.D(yyVar.getParentActivity(), yyVar.currentAccount);
        D.f7308x = new ey(yyVar, 4);
        D.Q(null);
    }

    public static void x0(yy yyVar) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        yyVar.R4();
        org.telegram.ui.Components.sc G = org.telegram.ui.Components.zc.a0(yyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f29102j = 5000;
        G.j();
    }

    public static void y0(yy yyVar) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        yyVar.R4();
        org.telegram.ui.Components.sc J = org.telegram.ui.Components.zc.a0(yyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new uv(yyVar, 1));
        J.f29102j = 5000;
        J.j();
    }

    public static void z0(yy yyVar) {
        boolean z10 = true;
        try {
            ((org.telegram.ui.Components.yj0) ((org.telegram.ui.Components.k9) yyVar.M1.h.getImageReceiver().getStaticThumb()).B).H(true);
        } catch (Exception unused) {
        }
        if (yyVar.f42307a4 == null) {
            org.telegram.ui.Components.i50 i50Var = new org.telegram.ui.Components.i50(0, true, true);
            yyVar.f42307a4 = i50Var;
            i50Var.H = true;
            i50Var.f25829a = yyVar;
            i50Var.f25830b = new my(yyVar);
            yyVar.getMediaDataController().checkFeaturedStickers();
            yyVar.getMessagesController().loadSuggestedFilters();
            yyVar.getMessagesController().loadUserInfo(yyVar.getUserConfig().getCurrentUser(), true, yyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(yyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(yyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(yyVar.currentAccount).getCurrentUser();
        }
        if (user != null) {
            org.telegram.ui.Components.vi viVar = yyVar.f42307a4.f25831c;
            if (viVar != null) {
                viVar.e1();
            }
            org.telegram.ui.Components.i50 i50Var2 = yyVar.f42307a4;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            i50Var2.n(z10, new uv(yyVar, 0), new vv(yyVar, 0), 0);
        }
    }

    public final void A3() {
        int i10;
        if (S3() > 0.5f) {
            i10 = R.string.SearchTopics;
        } else {
            i10 = R.string.SearchChats;
        }
        String string = LocaleController.getString(i10);
        this.X.f27815r.setContentDescription(string);
        this.X.f27815r.setHint(string);
    }

    public final void A4(float f7) {
        int i10;
        int i11;
        this.f42423x1 = f7;
        if (this.f42393r3 && this.actionBar != null) {
            if (this.V2 == 0 && this.X2 == 0) {
                i10 = org.telegram.ui.ActionBar.g6.f20235v8;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.O8;
            }
            int themedColor = getThemedColor(i10);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.g6.f20290y8;
            kVar.D(i0.a.d(this.f42423x1, themedColor, getThemedColor(i12)), false);
            this.actionBar.D(i0.a.d(this.f42423x1, getThemedColor(i12), getThemedColor(i12)), true);
            if (this.V2 == 0 && this.X2 == 0) {
                i11 = org.telegram.ui.ActionBar.g6.f20199t8;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.N8;
            }
            int themedColor2 = getThemedColor(i11);
            this.actionBar.B(i0.a.d(this.f42423x1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.g6.f20307z8)), false);
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            LiteMode.isEnabled(32768);
        }
        P4();
    }

    @Override
    public final List B() {
        return Arrays.asList(new ng.a(LocaleController.getString(R.string.DebugDialogsActivity)), new ng.a(LocaleController.getString(R.string.ClearLocalDatabase), new uv(this, 28)), new ng.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new uv(this, 29)));
    }

    public final void B3() {
        float f7;
        int i10;
        if (this.X == null) {
            return;
        }
        float a2 = 1.0f - w7.s.a(((-this.N) - R3()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.f42404t3, this.h.e);
        float f10 = this.f42308b.e;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float max2 = f7 * (1.0f - this.f42314c.e) * (1.0f - max) * Math.max(f10, (1.0f - S3()) * a2);
        this.X.setAlpha(max2);
        oy oyVar = this.X;
        boolean z10 = false;
        if (max2 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        oyVar.setVisibility(i10);
        if (max2 <= 0.01f) {
            z10 = true;
        }
        this.f42330f.a(z10, true);
    }

    public final void B4(CharSequence charSequence, String str) {
        if (str != null && !str.isEmpty()) {
            this.E2 = str;
            this.F2 = null;
            this.D2 = null;
            if (this.B1 != null) {
                i3(charSequence);
                return;
            } else {
                this.U3 = charSequence;
                return;
            }
        }
        this.E2 = null;
        this.F2 = null;
    }

    @Override
    public final void C(float f7, int i10) {
        org.telegram.ui.ActionBar.u0 u0Var;
        if (i10 == 3 && (u0Var = this.f42361l0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) u0Var.getIconView().getDrawable();
            if (this.d.f16293f) {
                animatedVectorDrawable.start();
                if (SharedConfig.getDevicePerformanceClass() != 0) {
                    TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(this.currentAccount).getPremiumPromo();
                    String l02 = PremiumPreviewFragment.l0(2);
                    if (premiumPromo != null) {
                        int i11 = 0;
                        while (true) {
                            if (i11 < premiumPromo.video_sections.size()) {
                                if (premiumPromo.video_sections.get(i11).equals(l02)) {
                                    break;
                                }
                                i11++;
                            } else {
                                i11 = -1;
                                break;
                            }
                        }
                        if (i11 != -1) {
                            FileLoader.getInstance(this.currentAccount).loadFile(premiumPromo.videos.get(i11), premiumPromo, 3, 0);
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

    public final void C3() {
        int i10;
        float f7;
        int i11;
        int i12 = 8;
        if (this.Z != null) {
            if (this.f42304a0 != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float f10 = f7 * this.f42308b.e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f10);
            this.Z.setScaleX(lerp);
            this.Z.setScaleY(lerp);
            this.Z.setAlpha(f10);
            c51 c51Var = this.Z;
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c51Var.setVisibility(i11);
        }
        org.telegram.ui.Components.j91 j91Var = this.f42304a0;
        ne.b bVar = this.f42395s;
        if (j91Var != null) {
            float f11 = 1.0f - bVar.e;
            j91Var.setAlpha(f11);
            org.telegram.ui.Components.j91 j91Var2 = this.f42304a0;
            if (f11 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            j91Var2.setVisibility(i10);
        }
        hg.r0 r0Var = this.f42309b0;
        if (r0Var != null) {
            float f12 = bVar.e;
            r0Var.setAlpha(f12);
            hg.r0 r0Var2 = this.f42309b0;
            if (f12 > 0.0f) {
                i12 = 0;
            }
            r0Var2.setVisibility(i12);
        }
    }

    public final void C4(float f7) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.W3 != f7) {
            boolean z10 = true;
            if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
                z10 = false;
            }
            this.X3 = z10;
            this.W3 = f7;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.X3) {
                float f10 = (1.0f - this.W3) * (-AndroidUtilities.dp(40.0f));
                px pxVar = this.E0;
                if (pxVar != null) {
                    pxVar.setTranslationX(f10);
                }
                oy oyVar = this.X;
                if (oyVar != null) {
                    oyVar.setTranslationX(f10);
                }
                sx sxVar = this.F3;
                if (sxVar != null && sxVar.getFragmentView() != null && !this.f42426y) {
                    this.F3.getFragmentView().setTranslationX(f10);
                    return;
                }
                return;
            }
            float f11 = 1.0f - this.W3;
            float f12 = (-AndroidUtilities.dp(4.0f)) * f11;
            float f13 = 1.0f - (f11 * 0.05f);
            px pxVar2 = this.E0;
            if (pxVar2 != null) {
                pxVar2.setScaleX(f13);
                this.E0.setScaleY(f13);
                this.E0.setTranslationX(f12);
                this.E0.setPivotX(0.0f);
                this.E0.setPivotY(0.0f);
            }
            oy oyVar2 = this.X;
            if (oyVar2 != null) {
                oyVar2.setTranslationX(f12);
                this.X.setScaleX(f13);
                this.X.setScaleY(f13);
            }
            sx sxVar2 = this.F3;
            if (sxVar2 != null && sxVar2.getFragmentView() != null) {
                if (!this.f42426y) {
                    this.F3.getFragmentView().setScaleX(f13);
                    this.F3.getFragmentView().setScaleY(f13);
                    this.F3.getFragmentView().setTranslationX(f12);
                }
                this.F3.getFragmentView().setPivotX(0.0f);
                this.F3.getFragmentView().setPivotY(0.0f);
            }
        }
    }

    public final void D3(boolean z10) {
        int i10;
        int i11;
        if (this.C0 != null && this.actionBar != null) {
            int i12 = AndroidUtilities.navigationBarHeight;
            int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f42303a);
            if (this.f42304a0 != null) {
                i10 = AndroidUtilities.dp(50.0f);
            } else {
                i10 = 0;
            }
            int i13 = measuredHeight + i10;
            org.telegram.ui.Components.xs xsVar = this.J1;
            if (xsVar != null) {
                i11 = (int) xsVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i14 = i13 + i11;
            iy iyVar = this.C0;
            SparseArray sparseArray = iyVar.h;
            iyVar.U0 = i14;
            iyVar.V0 = i12;
            bi.o0 o0Var = iyVar.V;
            if (z10) {
                o0Var.o1(0, i14, 0, i12);
            } else {
                o0Var.setPadding(0, i14, 0, i12);
            }
            iyVar.M0.j(iyVar.U0, iyVar.V0, z10);
            org.telegram.ui.Components.mo0 mo0Var = iyVar.W;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mo0Var.getLayoutParams();
            int i15 = marginLayoutParams.topMargin;
            int i16 = iyVar.U0;
            if (i15 != i16 || marginLayoutParams.bottomMargin != iyVar.V0) {
                marginLayoutParams.topMargin = i16;
                marginLayoutParams.bottomMargin = iyVar.V0;
                mo0Var.requestLayout();
            }
            org.telegram.ui.Components.zo0.P(iyVar.f31919f0, iyVar.f31922i0, iyVar.U0, iyVar.V0, z10);
            org.telegram.ui.Components.zo0.P(iyVar.f31924k0, iyVar.f31926n0, iyVar.U0, iyVar.V0, z10);
            org.telegram.ui.Components.zo0.P(iyVar.f31930r0, iyVar.f31933u0, iyVar.U0, iyVar.V0, z10);
            org.telegram.ui.Components.zh0 zh0Var = iyVar.f31928p0;
            int i17 = iyVar.U0;
            int i18 = iyVar.V0;
            zh0Var.setClipToPadding(false);
            org.telegram.ui.Components.h71 h71Var = zh0Var.f31870c;
            zh0Var.J = z10;
            zh0Var.setPadding(0, i17, 0, i18);
            if (z10) {
                h71Var.o1(0, i17, 0, i18);
            } else {
                h71Var.setPadding(0, i17, 0, i18);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) h71Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i17;
            marginLayoutParams2.bottomMargin = -i18;
            zh0Var.J = false;
            org.telegram.ui.Components.yn0 yn0Var = iyVar.G0;
            if (yn0Var != null) {
                yn0Var.b(iyVar.U0, iyVar.V0, z10);
            }
            int size = sparseArray.size();
            for (int i19 = 0; i19 < size; i19++) {
                View view = (View) sparseArray.valueAt(i19);
                if (view instanceof c20) {
                    ((c20) view).j(iyVar.U0, iyVar.V0, z10);
                }
            }
            for (int i20 = 0; i20 < iyVar.getChildCount(); i20++) {
                if (iyVar.getChildAt(i20) instanceof c20) {
                    ((c20) iyVar.getChildAt(i20)).j(iyVar.U0, iyVar.V0, z10);
                }
            }
        }
    }

    public final void D4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.y6 y6Var = new org.telegram.ui.Components.y6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.k31(21, this, r0), new gj(r0, 18));
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(getParentActivity(), getResourceProvider());
        z2Var.c(y6Var);
        org.telegram.ui.ActionBar.e3 e3Var = z2Var.f20838a;
        e3Var.show();
        org.telegram.ui.ActionBar.e3[] e3VarArr = {e3Var};
        e3Var.fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.f19972h5));
    }

    public final void E3() {
        if (this.J1 != null) {
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, 1.0f);
            this.J1.setAlpha(1.0f);
            this.J1.setScaleX(lerp);
            this.J1.setScaleY(lerp);
            this.J1.setVisibility(0);
        }
    }

    public final boolean E4(org.telegram.ui.Cells.s2 r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.E4(org.telegram.ui.Cells.s2):boolean");
    }

    public boolean F3() {
        if (this.R0 == 10) {
            return true;
        }
        return false;
    }

    public final void F4(boolean z10) {
        float f7;
        this.f42314c.a(z10, true);
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
        org.telegram.ui.ActionBar.u0 u0Var = this.m0;
        Property property = View.ALPHA;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(u0Var, property, f7));
        this.O3.playTogether(arrayList);
        this.O3.addListener(new yx(this, z10, 1));
        this.O3.start();
    }

    public final void G3() {
        if (AndroidUtilities.isTablet()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                iy iyVar = this.C0;
                if (iyVar != null) {
                    iyVar.f31915b0.R(this.W1, tLObject);
                }
                this.X1 = null;
                return;
            }
            return;
        }
        this.V1 = true;
    }

    public final void G4() {
        if (!this.A0 && getMessagesController().dialogFiltersLoaded && getMessagesController().showFiltersTooltip && this.f42430z0 != null && getMessagesController().getDialogFilters().isEmpty() && !this.isPaused && getUserConfig().filtersLoaded && !this.inPreviewMode) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("filterhint", false)) {
                globalMainSettings.edit().putBoolean("filterhint", true).apply();
                AndroidUtilities.runOnUIThread(new nw(this, 10), 1000L);
            }
        }
    }

    public final void H3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.f20442n0) {
            kVar.h(true);
            this.f42382p3 = false;
            S4(true, true);
        }
    }

    public final void H4() {
        LaunchActivity launchActivity;
        boolean q6;
        int i10;
        int i11;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        LaunchActivity launchActivity2;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        float f7;
        CharSequence charSequence;
        org.telegram.ui.Components.k31 k31Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.e1 e1Var;
        int i12;
        int i13;
        int w02;
        int w03;
        int w04;
        int m12;
        CharSequence charSequence2;
        int i14;
        int w05;
        org.telegram.ui.Components.m80 H = org.telegram.ui.Components.m80.H(this, this.f42356k0);
        int i15 = org.telegram.ui.ActionBar.g6.A8;
        H.S(getThemedColor(i15), getThemedColor(i15));
        H.f27298s = 8;
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) parentActivity;
        } else {
            launchActivity = null;
        }
        float f10 = 64.0f;
        int i16 = 0;
        if (this.X2 != 0) {
            if (ChatObject.hasAdminRights(this.Y2)) {
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new uv(this, 4), false);
                H.k();
            }
            H.i(new uv(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.Y2.collapsed_in_dialogs);
            H.i(new uv(this, 8), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.Y2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else if (b4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new uv(this, 9), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new uv(this, 10), false);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else {
            org.telegram.ui.ActionBar.c6 c6Var2 = this.resourceProvider;
            if (c6Var2 != null) {
                q6 = c6Var2.a();
            } else {
                q6 = org.telegram.ui.ActionBar.g6.I.q();
            }
            if (q6) {
                i10 = R.drawable.menu_day_mode_24;
            } else {
                i10 = R.drawable.menu_night_mode_24;
            }
            if (q6) {
                i11 = R.string.SwitchThemeToDay;
            } else {
                i11 = R.string.SwitchThemeToNight;
            }
            H.c(i10, LocaleController.getString(i11), new uv(this, 11), false);
            H.k();
            H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new uv(this, 12), false);
            H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new uv(this, 13), false);
            ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
            if (applicationLoader != null) {
                applicationLoader.addItemOptions(H);
            }
            if (getMessagesController().config.walletAvailable.get()) {
                H.c(R.drawable.ic_gram, LocaleController.getString(R.string.WalletAttachMoney), new uv(this, 14), false);
            } else {
                TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
                if (launchActivity != null && attachMenuBots != null && (arrayList = attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList3 = attachMenuBots.bots;
                    int size = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList3.get(i17);
                        i17++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_side_menu) {
                            yv yvVar = new yv(this, tL_attachMenuBot2, launchActivity, 0);
                            org.telegram.ui.Components.k31 k31Var2 = new org.telegram.ui.Components.k31(20, this, tL_attachMenuBot2);
                            org.telegram.ui.ActionBar.c6 c6Var3 = H.d;
                            if (H.e != null) {
                                int i18 = org.telegram.ui.ActionBar.g6.F8;
                                int i19 = org.telegram.ui.ActionBar.g6.E8;
                                f7 = f10;
                                org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(0, H.e, H.d, false, false);
                                e1Var2.setPadding(AndroidUtilities.dp(18.0f), i16, AndroidUtilities.dp(18.0f), i16);
                                if (tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                    charSequence = org.telegram.ui.Cells.r8.a(tL_attachMenuBot2.short_name);
                                } else {
                                    charSequence = tL_attachMenuBot2.short_name;
                                }
                                TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot2);
                                if (sideAttachMenuBotIcon != null) {
                                    launchActivity2 = launchActivity;
                                    arrayList2 = arrayList3;
                                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.g6.f19883c7, 1.0f);
                                    if (svgThumb != null) {
                                        Integer num = H.f27285k0;
                                        if (num != null) {
                                            w05 = num.intValue();
                                        } else {
                                            w05 = org.telegram.ui.ActionBar.g6.w0(i18, c6Var3);
                                        }
                                        charSequence2 = charSequence;
                                        svgThumb.setColorFilter(new PorterDuffColorFilter(w05, PorterDuff.Mode.SRC_IN));
                                    } else {
                                        charSequence2 = charSequence;
                                    }
                                    k31Var = k31Var2;
                                    e1Var = e1Var2;
                                    i13 = i19;
                                    i12 = i18;
                                    c6Var = c6Var3;
                                    e1Var.h(charSequence2, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                                    org.telegram.ui.Components.z9 z9Var = e1Var.h;
                                    if (z9Var != null) {
                                        if (LocaleController.isRTL) {
                                            i14 = 5;
                                        } else {
                                            i14 = 3;
                                        }
                                        z9Var.setLayoutParams(w7.a6.e(24, 24, i14 | 16));
                                    }
                                } else {
                                    launchActivity2 = launchActivity;
                                    arrayList2 = arrayList3;
                                    k31Var = k31Var2;
                                    c6Var = c6Var3;
                                    CharSequence charSequence3 = charSequence;
                                    e1Var = e1Var2;
                                    i12 = i18;
                                    i13 = i19;
                                    e1Var.g(charSequence3, R.drawable.msg_bot, null);
                                }
                                Integer num2 = H.f27283j0;
                                if (num2 != null) {
                                    w02 = num2.intValue();
                                } else {
                                    w02 = org.telegram.ui.ActionBar.g6.w0(i13, c6Var);
                                }
                                Integer num3 = H.f27285k0;
                                if (num3 != null) {
                                    w03 = num3.intValue();
                                } else {
                                    w03 = org.telegram.ui.ActionBar.g6.w0(i12, c6Var);
                                }
                                e1Var.c(w02, w03);
                                Integer num4 = H.f27285k0;
                                if (num4 != null) {
                                    w04 = num4.intValue();
                                } else {
                                    w04 = org.telegram.ui.ActionBar.g6.w0(i12, c6Var);
                                }
                                e1Var.setIconColorImage(w04);
                                Integer num5 = H.f27287l0;
                                if (num5 != null) {
                                    m12 = num5.intValue();
                                } else {
                                    m12 = org.telegram.ui.ActionBar.g6.m1(0.12f, org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
                                }
                                e1Var.setSelectorColor(m12);
                                e1Var.setOnClickListener(new org.telegram.ui.Components.rt(8, H, yvVar));
                                e1Var.setOnLongClickListener(new bi.g3(3, H, k31Var));
                                int i20 = H.S;
                                if (i20 > 0) {
                                    e1Var.setMinimumWidth(AndroidUtilities.dp(i20));
                                    H.r(e1Var, w7.a6.n(H.S, -2));
                                } else {
                                    H.r(e1Var, w7.a6.n(-1, -2));
                                }
                                launchActivity = launchActivity2;
                                arrayList3 = arrayList2;
                                f10 = f7;
                                i16 = 0;
                            }
                        }
                        launchActivity2 = launchActivity;
                        arrayList2 = arrayList3;
                        f7 = f10;
                        launchActivity = launchActivity2;
                        arrayList3 = arrayList2;
                        f10 = f7;
                        i16 = 0;
                    }
                }
            }
            float f11 = f10;
            if (getUserConfig().showCallsTab) {
                H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new uv(this, 6), false);
            }
            org.telegram.ui.ActionBar.e1 e1Var3 = this.f42374o0;
            if (e1Var3 != null) {
                e1Var3.f19720b.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19854ai));
                this.f42374o0.setOnClickListener(new xv(0, this, H));
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                    H.k();
                    H.d(this.f42374o0);
                }
            }
            H.Z();
            H.X(-AndroidUtilities.dp(f11));
        }
    }

    public final void I3(String str) {
        if (this.actionBar.a(str)) {
            return;
        }
        org.telegram.ui.ActionBar.y j10 = this.actionBar.j(str);
        boolean z10 = this.W;
        ArrayList arrayList = this.f42347i1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f42337g1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f42337g1.setImageDrawable(new org.telegram.ui.ActionBar.f2(true));
            this.f42337g1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f20290y8), PorterDuff.Mode.MULTIPLY));
            this.f42337g1.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(org.telegram.ui.ActionBar.g6.f20307z8), 1, -1));
            this.f42337g1.setOnClickListener(new zv(this, 6));
            j10.addView(this.f42337g1, w7.a6.q(54, 54, 16));
            arrayList.add(this.f42337g1);
        }
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f42342h1 = numberTextView;
        int i10 = 18;
        numberTextView.setTextSize(18);
        this.f42342h1.setTypeface(AndroidUtilities.bold());
        this.f42342h1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20290y8));
        NumberTextView numberTextView2 = this.f42342h1;
        if (!this.W) {
            i10 = 72;
        }
        j10.addView(numberTextView2, w7.a6.m(1.0f, 0, -1, i10, 0, 0));
        this.f42342h1.setOnTouchListener(new ci.d(2));
        this.f42357k1 = j10.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.l1 = j10.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.f42364m1 = j10.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.f42352j1 = j10.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.u0 h = j10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        j10.addView(new View(getParentActivity()), w7.a6.n(5, -1));
        this.f42385q1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.f42370n1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.f42375o1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.f42380p1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.f42397s1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.f42391r1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.f42402t1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.l1.setOnLongClickListener(new iw(this, 1));
        arrayList.add(this.f42357k1);
        arrayList.add(this.f42364m1);
        arrayList.add(this.l1);
        arrayList.add(this.f42352j1);
        arrayList.add(h);
        Q4(false);
    }

    public final void I4() {
        if (this.R3 == null) {
            for (String str : getMessagesController().pendingSuggestions) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                    alertDialog$Builder.f19548a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new aw(this, 6));
                    showDialog(alertDialog$Builder.f19548a, new vv(this, 1));
                    this.R3 = str;
                    return;
                }
            }
        }
    }

    public final void J3() {
        int i10;
        iy iyVar = this.C0;
        if ((iyVar != null && iyVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f42371n2 != null) {
            i10 = 2;
        } else if (!this.f42362l2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        iy iyVar2 = new iy(this, getParentActivity(), this, i10, this.R0, this.V2, this.X2, new ey(this, 1));
        this.C0 = iyVar2;
        ((ry) this.fragmentView).addView(iyVar2, this.B0);
        iy iyVar3 = this.C0;
        iyVar3.f31915b0.U = new ky(this);
        iyVar3.f31922i0.setOnItemClickListener(new aw(this, 1));
        this.C0.f31926n0.setOnItemClickListener(new aw(this, 2));
        this.C0.f31933u0.setOnItemClickListener(new ew(this, 0));
        this.C0.f31926n0.setOnItemLongClickListener(new aw(this, 3));
        this.C0.V.setOnItemClickListener(new aw(this, 4));
        this.C0.V.setOnItemLongClickListener(new ey(this, 2));
        this.C0.setFilteredSearchViewDelegate(new aw(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.f42383p4);
    }

    public final void J4(long j10, View view) {
        ArrayList<TLRPC.Dialog> O3;
        int i10;
        f3(j10, view);
        boolean t10 = this.actionBar.t();
        ArrayList arrayList = this.I2;
        boolean z10 = true;
        if (t10) {
            if (arrayList.isEmpty()) {
                Y3(true);
                return;
            }
        } else {
            if (this.f42382p3) {
                I3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.c5)) {
                    i2.d.v(false, this.actionBar);
                }
            } else {
                I3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
            this.actionBar.O(null, null);
            int i11 = this.f42325e0[0].f41986s;
            if ((i11 != 7 && i11 != 8) || (this.actionBar.t() && !this.actionBar.u(null))) {
                O3 = getMessagesController().getDialogs(this.V2);
            } else {
                O3 = O3(this.currentAccount, this.f42325e0[0].f41986s, this.V2, this.S1);
            }
            int size = O3.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = O3.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (d4(dialog)) {
                        i12++;
                    } else if (!getMessagesController().isPromoDialog(dialog.f19220id, false)) {
                        break;
                    }
                }
            }
            if (i12 > 1) {
                if (this.f42325e0 != null) {
                    int i14 = 0;
                    while (true) {
                        xy[] xyVarArr = this.f42325e0;
                        if (i14 >= xyVarArr.length) {
                            break;
                        }
                        xyVarArr[i14].d.H = true;
                        i14++;
                    }
                }
                d5(MessagesController.UPDATE_MASK_REORDER, true);
            }
            if (!this.f42382p3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f42347i1;
                    if (i15 >= arrayList3.size()) {
                        break;
                    }
                    View view2 = (View) arrayList3.get(i15);
                    view2.setPivotY(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2);
                    AndroidUtilities.clearDrawableAnimation(view2);
                    arrayList2.add(ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.1f, 1.0f));
                    i15++;
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(200L);
                animatorSet.start();
            }
            ValueAnimator valueAnimator = this.f42409u3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f42409u3 = ValueAnimator.ofFloat(this.f42404t3, 1.0f);
            int i16 = 0;
            while (true) {
                xy[] xyVarArr2 = this.f42325e0;
                if (i16 >= xyVarArr2.length) {
                    break;
                }
                xy xyVar = xyVarArr2[i16];
                if (xyVar != null) {
                    xyVar.f41980a.I0(true);
                }
                i16++;
            }
            if (this.K) {
                i10 = 81;
            } else {
                i10 = 0;
            }
            float max = Math.max(0.0f, AndroidUtilities.dp(i10 + 48) + this.N);
            if (max != 0.0f) {
                this.P = (int) max;
                this.fragmentView.requestLayout();
            }
            this.f42409u3.addUpdateListener(new cw(this, max, 0));
            this.f42409u3.addListener(new cy(this, max, 1));
            this.f42409u3.setInterpolator(org.telegram.ui.Components.es.f24771f);
            this.f42409u3.setDuration(200L);
            this.f42409u3.start();
            ww wwVar = this.f42430z0;
            if (wwVar != null) {
                wwVar.b(org.telegram.ui.ActionBar.g6.Gh, org.telegram.ui.ActionBar.g6.Fh, org.telegram.ui.ActionBar.g6.Eh, org.telegram.ui.ActionBar.g6.Hh, org.telegram.ui.ActionBar.g6.f20254w8);
            }
            org.telegram.ui.ActionBar.f2 f2Var = this.f42326e1;
            if (f2Var != null) {
                f2Var.c(1.0f, true);
            }
            z10 = false;
        }
        Q4(false);
        this.f42342h1.a(arrayList.size(), z10);
    }

    public final void K3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f42427y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new dy(this, parentActivity);
                FrameLayout.LayoutParams a2 = w7.a6.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83);
                a2.bottomMargin = this.f42335f4 + this.f42345h4 + a2.bottomMargin;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.f42422x0 + 1;
                this.f42422x0 = i11;
                ((ry) this.fragmentView).addView(undoView, i11, a2);
            }
        }
    }

    public final void K4(long j10, View view) {
        String str;
        org.telegram.ui.Components.sc J;
        int i10 = -this.L3;
        this.L3 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (j10 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)));
        } else {
            str = "";
        }
        if (getMessagesController().premiumFeaturesBlocked()) {
            J = org.telegram.ui.Components.zc.a0(this).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = org.telegram.ui.Components.zc.a0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new uv(this, 23));
        }
        J.j();
    }

    public final void L3(final long j10, final long j11, boolean z10, final lg1 lg1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String string;
        String formatStringSimple;
        String string2;
        String str;
        String str2;
        TLRPC.TL_forumTopic findTopic;
        if (m3(j10)) {
            int i10 = this.R0;
            if (i10 != 11 && i10 != 12 && i10 != 13) {
                if (z10 && ((this.f42333f2 != null && this.f42338g2 != null) || this.f42343h2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (DialogObject.isEncryptedDialog(j10)) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.q.m(getMessagesController(), j10).user_id));
                            if (user2 != null) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f42333f2, UserObject.getUserName(user2));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                return;
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            if (j10 == getUserConfig().getClientUserId()) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f42338g2, LocaleController.getString(R.string.SavedMessages));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j10));
                                if (user3 != null && this.f42333f2 != null) {
                                    str = LocaleController.getString(R.string.SendMessageTitle);
                                    str2 = LocaleController.formatStringSimple(this.f42333f2, UserObject.getUserName(user3));
                                    string2 = LocaleController.getString(R.string.Send);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j10));
                            if (chat2 != null) {
                                String str3 = chat2.title;
                                if (j11 != 0 && (findTopic = getMessagesController().getTopicsController().findTopic(chat2.f19216id, j11)) != null) {
                                    str3 = ((Object) str3) + " " + findTopic.title;
                                }
                                if (this.f42343h2 != null) {
                                    string = LocaleController.getString(R.string.AddToTheGroupAlertTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f42343h2, str3);
                                    string2 = LocaleController.getString(R.string.Add);
                                } else {
                                    string = LocaleController.getString(R.string.SendMessageTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f42338g2, str3);
                                    string2 = LocaleController.getString(R.string.Send);
                                }
                                String str4 = formatStringSimple;
                                str = string;
                                str2 = str4;
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                        a2Var.R = str;
                        a2Var.T = AndroidUtilities.replaceTags(str2);
                        alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.z1() {
                            @Override
                            public final void g(org.telegram.ui.ActionBar.a2 a2Var2, int i11) {
                                yy.this.L3(j10, j11, false, lg1Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        if (showDialog(a2Var) == null) {
                            a2Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 15) {
                    Runnable i0Var = new a3.i0(this, j10, new a3.h0(this, j10, j11, lg1Var, 14), 23);
                    if (j10 < 0) {
                        N4(getMessagesController().getChat(Long.valueOf(-j10)), i0Var, null);
                        return;
                    }
                    TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(j10));
                    TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(this.H));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user4), UserObject.getFirstName(user5));
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19548a;
                    a2Var2.R = formatString;
                    a2Var2.T = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user4), UserObject.getFirstName(user5))));
                    alertDialog$Builder2.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new mu(i0Var, 1));
                    alertDialog$Builder2.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.zg0(20));
                    showDialog(a2Var2);
                    return;
                } else if (this.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j11));
                    if (this.C2.w(this, arrayList, null, false, this.J2, this.K2, this.L2, lg1Var) && this.f42348i2) {
                        this.C2 = null;
                        return;
                    }
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            if (DialogObject.isUserDialog(j10)) {
                TLRPC.User user6 = getMessagesController().getUser(Long.valueOf(j10));
                if (!user6.mutual_contact) {
                    UndoView V3 = V3();
                    if (V3 != null) {
                        V3.j(45, j10, null);
                        return;
                    }
                    return;
                }
                user = user6;
                chat = null;
            } else {
                TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(-j10));
                if (ChatObject.hasAdminRights(chat3) && ChatObject.canChangeChatInfo(chat3)) {
                    chat = chat3;
                    user = null;
                } else {
                    UndoView V32 = V3();
                    if (V32 != null) {
                        V32.j(46, j10, null);
                        return;
                    }
                    return;
                }
            }
            org.telegram.ui.ActionBar.a2 a2Var3 = new org.telegram.ui.ActionBar.a2(getParentActivity(), 3, null);
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().getInputPeer(j10);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new uw(this, a2Var3, user, chat, j10, tL_messages_checkHistoryImportPeer));
            try {
                a2Var3.q(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void L4(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.L4(boolean, boolean, boolean, boolean):void");
    }

    public final void M3(long j10, boolean z10) {
        if (this.f42325e0 != null) {
            int i10 = 0;
            while (true) {
                xy[] xyVarArr = this.f42325e0;
                if (i10 < xyVarArr.length) {
                    int childCount = xyVarArr[i10].f41980a.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 < childCount) {
                            View childAt = this.f42325e0[i10].f41980a.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.s2) {
                                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt;
                                if (s2Var.getDialogId() == j10) {
                                    s2Var.V(z10, true);
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

    public final void M4() {
        int i10;
        int i11;
        Long l4;
        if (this.M0 == null && !SharedConfig.appLocked && (!this.K || this.E0.g())) {
            i71[] i71VarArr = new i71[1];
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.D3.f();
                Drawable drawable = this.D3.f28516f[0];
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(titleTextView.getRightDrawable().getBounds());
                rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
                int dp = (-(this.actionBar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                i10 = AndroidUtilities.dp(4.0f) + (rect.centerX() - AndroidUtilities.dp(16.0f));
                org.telegram.ui.Cells.o oVar = this.E3;
                if (oVar != null) {
                    oVar.b(rect.centerX(), rect.centerY());
                }
                i11 = dp;
            } else {
                i10 = 0;
                i11 = 0;
            }
            tx txVar = new tx(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), i71VarArr);
            if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
                txVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
            }
            Long l10 = this.B3;
            if (l10 != null) {
                txVar.setSelected(l10);
            } else {
                Drawable drawable2 = this.D3.f28516f[0];
                if (drawable2 instanceof org.telegram.ui.Components.s5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.s5) drawable2).i());
                } else {
                    l4 = null;
                }
                txVar.setSelected(l4);
            }
            txVar.setSaveState(1);
            txVar.y(this.D3, titleTextView);
            ux uxVar = new ux(this, txVar);
            this.M0 = uxVar;
            i71VarArr[0] = uxVar;
            uxVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i11, 48);
            i71VarArr[0].b();
        }
    }

    public final void N4(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.N4(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final java.util.ArrayList O3(int r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.O3(int, int, int, boolean):java.util.ArrayList");
    }

    public final void O4(boolean z10) {
        xy[] xyVarArr;
        char c10;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            xyVarArr = this.f42325e0;
            if (i12 >= xyVarArr.length) {
                break;
            }
            xyVarArr[i12].f41980a.B0();
            i12++;
        }
        if (z10 && xyVarArr.length > 1) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int i13 = xyVarArr[c10].h;
        if (i13 >= 0 && i13 < getMessagesController().getDialogFilters().size()) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.f42325e0[c10].h);
            if (dialogFilter.isDefault()) {
                xy xyVar = this.f42325e0[c10];
                xyVar.f41986s = this.R0;
                uy uyVar = xyVar.f41980a;
                int i14 = uy.f40814t3;
                uyVar.B1();
            } else {
                xy[] xyVarArr2 = this.f42325e0;
                if (xyVarArr2[c10 ^ 1].f41986s == 7) {
                    xyVarArr2[c10].f41986s = 8;
                } else {
                    xyVarArr2[c10].f41986s = 7;
                }
                xyVarArr2[c10].f41980a.setScrollEnabled(true);
                MessagesController messagesController = getMessagesController();
                if (this.f42325e0[c10].f41986s == 8) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                messagesController.selectDialogFilter(dialogFilter, i10);
            }
            xy[] xyVarArr3 = this.f42325e0;
            if (xyVarArr3.length > 1) {
                xyVarArr3[1].E = dialogFilter.locked;
            }
            xy xyVar2 = xyVarArr3[c10];
            fx fxVar = xyVar2.d;
            fxVar.h = xyVar2.f41986s;
            fxVar.l();
            xy xyVar3 = this.f42325e0[c10];
            bx bxVar = xyVar3.f41982c;
            if (xyVar3.f41986s == 0 && W3() && this.f42325e0[c10].v == 2) {
                i11 = 1;
            }
            bxVar.h1(i11, (int) this.N);
            o3(this.f42325e0[c10]);
        }
    }

    public final float P3(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f - this.f42308b.e;
        } else {
            f7 = 1.0f;
        }
        return f7 * (1.0f - S3()) * this.f42389r.e;
    }

    public final void P4() {
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
        c51 c51Var = this.Z;
        if (c51Var != null && c51Var.getVisibility() != 8) {
            f7 = this.Z.getMeasuredHeight();
        } else {
            f7 = 0.0f;
        }
        if (this.K) {
            f10 = AndroidUtilities.dp(81.0f);
        } else {
            f10 = 0.0f;
        }
        if (this.K) {
            float f19 = this.N;
            float f20 = this.f42423x1;
            f11 = (f7 * f20) + com.google.android.gms.internal.play_billing.k3.y(1.0f, f20, f10, f19);
            f12 = this.f42420w3;
        } else {
            f11 = (f7 * this.f42423x1) + this.N;
            f12 = this.f42420w3;
        }
        float f21 = f11 + f12 + this.T;
        oy oyVar = this.X;
        if (oyVar != null && oyVar.getVisibility() == 0) {
            f13 = this.X.getAlpha();
        } else {
            f13 = 0.0f;
        }
        float dp = AndroidUtilities.dp(4.0f) * f13;
        ww wwVar = this.f42430z0;
        if (wwVar != null) {
            wwVar.setTranslationY(f21 - dp);
            f15 = this.f42430z0.getAlpha();
            f16 = AndroidUtilities.dp(43.0f) * f15;
            f14 = f21 + f16;
        } else {
            f14 = f21;
            f15 = 0.0f;
            f16 = 0.0f;
        }
        org.telegram.ui.Components.xs xsVar = this.J1;
        if (xsVar != null) {
            float f22 = f14 - dp;
            int i11 = -AndroidUtilities.dp(3.0f);
            if (this.f42304a0 == null) {
                i10 = AndroidUtilities.dp(44.0f);
            } else {
                i10 = 0;
            }
            xsVar.setTranslationY(AndroidUtilities.lerp(f22, i11 - i10, this.f42308b.e));
            f17 = this.J1.getMetadata().f16308c.f16316a;
            f18 = this.J1.c(0.0f);
        } else {
            f17 = 0.0f;
            f18 = 0.0f;
        }
        org.telegram.ui.Components.ws wsVar = this.K1;
        if (wsVar != null) {
            wsVar.setTranslationY(f21 - dp);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f17, f15));
            org.telegram.ui.Components.ws wsVar2 = this.K1;
            float min = Math.min(AndroidUtilities.dp(40.0f), (f18 + f16) - lerp);
            Matrix matrix = wsVar2.f30955b;
            if (wsVar2.e != lerp || wsVar2.f30957f != min) {
                wsVar2.e = lerp;
                wsVar2.f30957f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = wsVar2.f30956c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                wsVar2.invalidate();
            }
            this.K1.setAlpha(Math.max(f15, f17));
        }
    }

    public final int Q3() {
        if (this.K) {
            return AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(81.0f);
        }
        return AndroidUtilities.dp(48.0f);
    }

    public final void Q4(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.Q4(boolean):void");
    }

    public final int R3() {
        if (this.K) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    public final void R4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.R4():void");
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        sx sxVar;
        di.ab abVar;
        ww wwVar;
        boolean z11;
        boolean z12;
        if (!this.f42382p3 && (((sxVar = this.F3) == null || !sxVar.c()) && (((abVar = this.K0) == null || abVar.getVisibility() != 0) && ((wwVar = this.f42430z0) == null || !wwVar.f30711n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                ww wwVar2 = this.f42430z0;
                if (wwVar2 != null && wwVar2.getTabsCount() >= 2 && this.f42430z0.getCurrentTabId() != this.f42430z0.getFirstTabId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                ww wwVar3 = this.f42430z0;
                if (wwVar3 != null && wwVar3.getTabsCount() >= 2 && this.f42430z0.getCurrentTabId() != this.f42430z0.getLastTabId()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                SharedConfig.getChatSwipeAction(this.currentAccount);
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

    public final float S3() {
        sx sxVar = this.F3;
        if (sxVar != null && sxVar.c()) {
            return this.F3.e;
        }
        return 0.0f;
    }

    public final void S4(boolean z10, boolean z11) {
        ?? r52;
        int L0;
        boolean z12;
        xy[] xyVarArr;
        MessagesController.DialogFilter dialogFilter;
        boolean z13;
        Object[] objArr;
        s4.l0 l0Var;
        boolean z14;
        boolean z15;
        boolean z16;
        if (this.f42430z0 != null && !this.inPreviewMode && !this.f42382p3) {
            sx sxVar = this.F3;
            if (sxVar == null || !sxVar.c()) {
                org.telegram.ui.Components.m80 m80Var = this.L0;
                if (m80Var != null) {
                    m80Var.u();
                    this.L0 = null;
                }
                ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                int size = dialogFilters.size();
                ne.b bVar = this.f42389r;
                boolean z17 = true;
                boolean z18 = false;
                if (size > 1) {
                    if (!z10 && this.f42430z0.getVisibility() == 0) {
                        r52 = 0;
                    } else {
                        if (this.f42430z0.getVisibility() != 0) {
                            z13 = false;
                        } else {
                            z13 = z11;
                        }
                        this.f42416w = true;
                        boolean isEmpty = this.f42430z0.h.isEmpty();
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.Q3 == null) {
                                z16 = z11;
                            } else {
                                z16 = false;
                            }
                            if (!this.f42382p3) {
                                bVar.a(this.f42416w, z16);
                            }
                        }
                        int currentTabId = this.f42430z0.getCurrentTabId();
                        int currentTabStableId = this.f42430z0.getCurrentTabStableId();
                        if (currentTabId != this.f42430z0.getDefaultTabId() && currentTabId >= dialogFilters.size()) {
                            this.f42430z0.L = -1;
                            objArr = 1;
                        } else {
                            objArr = null;
                        }
                        ww wwVar = this.f42430z0;
                        wwVar.h.clear();
                        wwVar.f30708j0.clear();
                        wwVar.f30710l0.clear();
                        wwVar.m0.clear();
                        wwVar.f30712n0.clear();
                        wwVar.f30713o0.clear();
                        wwVar.M = 0;
                        int size2 = dialogFilters.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            if (dialogFilters.get(i10).isDefault()) {
                                this.f42430z0.a(i10, 0, LocaleController.getString(R.string.FilterAllChats), null, false, true, dialogFilters.get(i10).locked);
                                z15 = z18;
                            } else {
                                MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(i10);
                                z15 = z18;
                                this.f42430z0.a(i10, dialogFilter2.localId, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, false, dialogFilters.get(i10).locked);
                            }
                            i10++;
                            z18 = z15;
                        }
                        boolean z19 = z18;
                        if (currentTabStableId >= 0) {
                            if (objArr != null && !this.f42430z0.h(currentTabStableId)) {
                                while (currentTabId >= 0) {
                                    ww wwVar2 = this.f42430z0;
                                    if (wwVar2.h(wwVar2.f30709k0.get(currentTabId, -1))) {
                                        break;
                                    }
                                    currentTabId--;
                                }
                                if (currentTabId < 0) {
                                    currentTabId = z19 ? 1 : 0;
                                }
                            }
                            if (this.f42430z0.f30709k0.get(this.f42325e0[z19 ? 1 : 0].h, -1) != currentTabStableId) {
                                this.f42325e0[z19 ? 1 : 0].h = currentTabId;
                                isEmpty = true;
                            }
                        }
                        int i11 = z19 ? 1 : 0;
                        while (true) {
                            xy[] xyVarArr2 = this.f42325e0;
                            if (i11 >= xyVarArr2.length) {
                                break;
                            }
                            if (xyVarArr2[i11].h >= dialogFilters.size()) {
                                this.f42325e0[i11].h = dialogFilters.size() - 1;
                            }
                            this.f42325e0[i11].f41980a.setScrollingTouchSlop(1);
                            i11++;
                        }
                        ww wwVar3 = this.f42430z0;
                        bi.o0 o0Var = wwVar3.F;
                        if (z13) {
                            l0Var = wwVar3.f30719s0;
                        } else {
                            l0Var = null;
                        }
                        o0Var.setItemAnimator(l0Var);
                        wwVar3.I.l();
                        if (isEmpty) {
                            O4(z19);
                        }
                        ww wwVar4 = this.f42430z0;
                        int currentTabId2 = wwVar4.getCurrentTabId();
                        ArrayList arrayList = wwVar4.h;
                        int i12 = 0;
                        while (true) {
                            if (i12 < arrayList.size()) {
                                if (((org.telegram.ui.Components.s00) arrayList.get(i12)).f28978a == currentTabId2) {
                                    z14 = ((org.telegram.ui.Components.s00) arrayList.get(i12)).f28981f;
                                    break;
                                }
                                i12++;
                            } else {
                                z14 = false;
                                break;
                            }
                        }
                        if (z14) {
                            ww wwVar5 = this.f42430z0;
                            ArrayList arrayList2 = wwVar5.h;
                            if (!arrayList2.isEmpty()) {
                                r52 = 0;
                                wwVar5.f((org.telegram.ui.Components.s00) arrayList2.get(0), 0);
                            }
                        }
                        r52 = 0;
                    }
                } else {
                    r52 = 0;
                    if (this.f42430z0.getVisibility() != 8) {
                        this.f42430z0.setIsEditing(false);
                        F4(false);
                        this.f42366m3 = false;
                        if (this.f42363l3) {
                            this.f42363l3 = false;
                            this.f42325e0[0].setTranslationX(0.0f);
                            this.f42325e0[1].setTranslationX(xyVarArr[0].getMeasuredWidth());
                        }
                        if (this.f42325e0[0].h != this.f42430z0.getDefaultTabId()) {
                            this.f42325e0[0].h = this.f42430z0.getDefaultTabId();
                            fx fxVar = this.f42325e0[0].d;
                            fxVar.h = 0;
                            fxVar.l();
                            xy xyVar = this.f42325e0[0];
                            xyVar.f41986s = this.R0;
                            xyVar.d.l();
                        }
                        this.f42325e0[1].setVisibility(8);
                        xy xyVar2 = this.f42325e0[1];
                        xyVar2.h = 0;
                        fx fxVar2 = xyVar2.d;
                        fxVar2.h = 0;
                        fxVar2.l();
                        xy xyVar3 = this.f42325e0[1];
                        xyVar3.f41986s = this.R0;
                        xyVar3.d.l();
                        this.f42416w = false;
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.Q3 == null) {
                                z12 = z11;
                            } else {
                                z12 = false;
                            }
                            if (!this.f42382p3) {
                                bVar.a(false, z12);
                            }
                        }
                        int i13 = 0;
                        while (true) {
                            xy[] xyVarArr3 = this.f42325e0;
                            if (i13 >= xyVarArr3.length) {
                                break;
                            }
                            xy xyVar4 = xyVarArr3[i13];
                            if (xyVar4.f41986s == 0 && xyVar4.v == 2 && W3() && ((L0 = this.f42325e0[i13].f41982c.L0()) == 0 || L0 == 1)) {
                                this.f42325e0[i13].f41982c.h1(1, (int) this.N);
                            }
                            this.f42325e0[i13].f41980a.setScrollingTouchSlop(0);
                            this.f42325e0[i13].f41980a.requestLayout();
                            this.f42325e0[i13].requestLayout();
                            i13++;
                        }
                        this.f42430z0.L = -1;
                        r52 = 0;
                    }
                }
                Q4(r52);
                int i14 = this.f42325e0[r52].f41986s;
                if ((i14 == 7 || i14 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[i14 - 7]) != null) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < dialogFilters.size()) {
                            MessagesController.DialogFilter dialogFilter3 = dialogFilters.get(i15);
                            if (dialogFilter3 != null && dialogFilter3.f16708id == dialogFilter.f16708id) {
                                break;
                            }
                            i15++;
                        } else {
                            z17 = false;
                            break;
                        }
                    }
                    if (!z17) {
                        O4(false);
                    }
                }
            }
        }
    }

    public final float T3() {
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.f42308b.e);
    }

    public final void T4(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.T4(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    public final bi.x8 U3() {
        return getMessagesController().getStoriesController();
    }

    public final void U4() {
        float f7 = (((-this.f42335f4) - this.f42350i4) - this.f42407u1) - this.f42412v1;
        org.telegram.ui.Components.l20 l20Var = this.f42401t0;
        if (l20Var != null) {
            l20Var.setTranslationY(f7);
        }
        org.telegram.ui.Components.l20 l20Var2 = this.f42406u0;
        if (l20Var2 != null) {
            l20Var2.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            di.d4 d4Var = this.f42379p0;
            if (d4Var != null) {
                d4Var.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    public final UndoView V3() {
        K3();
        UndoView[] undoViewArr = this.f42427y0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.e(2, true);
            ry ryVar = (ry) this.fragmentView;
            ryVar.removeView(undoViewArr[0]);
            ryVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void V4(boolean z10) {
        boolean z11;
        boolean z12 = this.f42362l2;
        if ((!z12 || this.R0 == 10) && this.V2 == 0 && this.X2 == 0 && !this.inPreviewMode && ((!this.f42353j2 || z12) && !this.T3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.l20 l20Var = this.f42401t0;
        if (l20Var != null) {
            l20Var.e(z11, z10);
        }
        org.telegram.ui.Components.l20 l20Var2 = this.f42406u0;
        if (l20Var2 != null) {
            l20Var2.e(z11, z10);
        }
    }

    public final boolean W3() {
        if (!this.f42362l2 && this.R0 == 0 && this.X2 == 0 && this.V2 == 0 && getMessagesController().hasHiddenArchive()) {
            return true;
        }
        return false;
    }

    public final void W4(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        if (this.f42369n0 != null) {
            org.telegram.ui.ActionBar.u0 u0Var = this.m0;
            if (u0Var == null || u0Var.getVisibility() != 0) {
                boolean z13 = false;
                int i11 = 0;
                while (true) {
                    if (i11 < getDownloadController().downloadingFiles.size()) {
                        if (getFileLoader().isLoadingFile(getDownloadController().downloadingFiles.get(i11).getFileName())) {
                            z12 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z12 = false;
                        break;
                    }
                }
                if (!getDownloadController().hasUnviewedDownloads() && !z12 && (this.f42336g0.getVisibility() != 0 || this.f42336g0.getAlpha() != 1.0f || z11)) {
                    this.f42346i0 = false;
                } else {
                    this.f42346i0 = true;
                }
                u3();
                boolean z14 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i12 = this.f42322d2;
                if (i12 == 3 || i12 == 5) {
                    z13 = true;
                }
                org.telegram.ui.ActionBar.e1 e1Var = this.f42374o0;
                if (z14) {
                    if (z13) {
                        i10 = R.string.MenuProxyConnected;
                    } else {
                        i10 = R.string.MenuProxyConnecting;
                    }
                } else {
                    i10 = R.string.MenuProxyDisabled;
                }
                e1Var.setSubtext(LocaleController.getString(i10));
                this.f42369n0.b(z14, z13, z10);
            }
        }
    }

    public final boolean X3() {
        ArrayList arrayList = this.D2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void X4() {
        org.telegram.ui.Components.or0 or0Var;
        int i10;
        ix ixVar = this.B1;
        ArrayList arrayList = this.I2;
        if (ixVar != null) {
            this.f42368n.a(!arrayList.isEmpty(), true);
            Y4();
            if (arrayList.isEmpty()) {
                if (this.R0 == 3 && this.f42333f2 == null) {
                    i10 = R.string.ForwardTo;
                } else {
                    i10 = R.string.SelectChat;
                }
                String string = LocaleController.getString(i10);
                if (this.P3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(string);
                } else {
                    this.actionBar.J(string, true, 350L, org.telegram.ui.Components.es.h);
                }
                if (this.B1.getTag() != null) {
                    this.B1.l0(false, false, false);
                    this.B1.N();
                    this.B1.setTag(null);
                    this.fragmentView.requestLayout();
                }
            } else {
                if (this.B1.getTag() == null) {
                    if (!X3() && this.E2 == null) {
                        this.B1.setFieldText("");
                    }
                    this.B1.setTag(1);
                    if (!this.V3 && (or0Var = this.G2) != null) {
                        this.V3 = true;
                        String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                        or0Var.j();
                        or0Var.F = string2;
                        org.telegram.ui.Components.mr0 mr0Var = or0Var.f28030a[0];
                        if (string2 != null) {
                            mr0Var.e.l(string2, false);
                        }
                        org.telegram.ui.Components.lr0 lr0Var = new org.telegram.ui.Components.lr0(or0Var, 0);
                        or0Var.G = lr0Var;
                        AndroidUtilities.runOnUIThread(lr0Var, 1000L);
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
                    long sendPaidMessagesStars = getMessagesController().getSendPaidMessagesStars(longValue);
                    if (sendPaidMessagesStars <= 0 && longValue > 0) {
                        sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(getMessagesController().isUserContactBlocked(longValue));
                    }
                    j10 += sendPaidMessagesStars;
                }
                this.C1.i(i11, j10, true);
                this.B1.Q1();
                if (this.P3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]));
                } else {
                    this.actionBar.J(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.es.h);
                }
            }
            this.P3 = arrayList.isEmpty();
        } else if (this.R0 == 10) {
            Z3(arrayList.isEmpty());
        }
    }

    public final void Y3(boolean z10) {
        int i10;
        boolean z11;
        this.actionBar.s();
        this.I2.clear();
        org.telegram.ui.ActionBar.f2 f2Var = this.f42326e1;
        boolean z12 = true;
        if (f2Var != null) {
            f2Var.c(0.0f, true);
        }
        ww wwVar = this.f42430z0;
        if (wwVar != null) {
            wwVar.b(org.telegram.ui.ActionBar.g6.K8, org.telegram.ui.ActionBar.g6.I8, org.telegram.ui.ActionBar.g6.J8, org.telegram.ui.ActionBar.g6.L8, org.telegram.ui.ActionBar.g6.f19901d6);
        }
        ValueAnimator valueAnimator = this.f42409u3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f42409u3 = null;
        }
        if (this.f42404t3 == 0.0f) {
            return;
        }
        z4(-Q3());
        boolean z13 = false;
        int i11 = 0;
        while (true) {
            xy[] xyVarArr = this.f42325e0;
            if (i11 >= xyVarArr.length) {
                break;
            }
            xy xyVar = xyVarArr[i11];
            if (xyVar != null) {
                xyVar.f41980a.I0(true);
            }
            i11++;
        }
        if (this.K) {
            i10 = 81;
        } else {
            i10 = 0;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp(i10 + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f42404t3, 0.0f);
        this.f42409u3 = ofFloat;
        ofFloat.addUpdateListener(new cw(this, max, 1));
        this.f42409u3.addListener(new cy(this, max, 0));
        this.f42409u3.setInterpolator(org.telegram.ui.Components.es.f24771f);
        this.f42409u3.setDuration(200L);
        this.f42409u3.start();
        this.Y0 = false;
        ArrayList arrayList = this.f42305a1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i12);
                l10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
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
            getMessagesController().reorderPinnedDialogs(this.V2, null, 0L);
            z11 = 0;
            this.Z0 = false;
        } else {
            z11 = 0;
        }
        Q4(true);
        if (this.f42325e0 != null) {
            int i13 = z11;
            while (true) {
                xy[] xyVarArr2 = this.f42325e0;
                if (i13 >= xyVarArr2.length) {
                    break;
                }
                xyVarArr2[i13].d.H = z11;
                i13++;
            }
        }
        int i14 = MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK;
        int i15 = z11;
        if (z10) {
            i15 = MessagesController.UPDATE_MASK_CHAT;
        }
        d5(i15 | i14, true);
    }

    public final void Y4() {
        org.telegram.ui.Components.or0 or0Var = this.G2;
        if (or0Var != null) {
            int i10 = this.currentAccount;
            or0Var.h(i10);
            or0Var.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
            ArrayList arrayList = or0Var.f28033f;
            arrayList.clear();
            ArrayList arrayList2 = this.I2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            org.telegram.ui.Components.mr0 mr0Var = or0Var.f28030a[0];
            if (or0Var.f28031b == 1) {
                mr0Var.d.l(or0Var.c(mr0Var), false);
            }
        }
    }

    public final void Z3(boolean z10) {
        if (this.F3.c()) {
            z10 = true;
        }
        if (!z10 || !this.f42311b2) {
            this.T3 = z10;
            V4(true);
            if (z10) {
                di.d4 d4Var = this.f42379p0;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                di.d4 d4Var2 = this.f42384q0;
                if (d4Var2 != null) {
                    d4Var2.e(true);
                }
            }
        }
    }

    public final void Z4(boolean z10) {
        boolean z11;
        if (this.f42361l0 == null) {
            return;
        }
        ArrayList<MessageObject> arrayList = getDownloadController().downloadingFiles;
        int size = arrayList.size();
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                MessageObject messageObject = arrayList.get(i10);
                i10++;
                MessageObject messageObject2 = messageObject;
                if (messageObject2.getDocument() != null && messageObject2.getDocument().size >= 157286400) {
                    z11 = true;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        ArrayList<MessageObject> arrayList2 = getDownloadController().recentDownloadingFiles;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                break;
            }
            MessageObject messageObject3 = arrayList2.get(i11);
            i11++;
            MessageObject messageObject4 = messageObject3;
            if (messageObject4.getDocument() != null && messageObject4.getDocument().size >= 157286400) {
                z11 = true;
                break;
            }
        }
        if (!getUserConfig().isPremium() && !getMessagesController().premiumFeaturesBlocked() && z11 && z10) {
            z12 = true;
        }
        this.d.a(z12, true);
    }

    public final void a5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.q5 q5Var;
        px pxVar = this.E0;
        org.telegram.ui.Components.q5 q5Var2 = null;
        if (pxVar != null && (q5Var = pxVar.f3812a0) != null && pxVar.f3831q0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                q5Var.j(emojiStatusDocumentId.longValue(), z10);
                q5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z10);
            } else if (user != null && MessagesController.getInstance(pxVar.f3819f).isPremiumUser(user)) {
                if (pxVar.N0 == null) {
                    pxVar.N0 = pxVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    pxVar.N0 = new org.telegram.ui.Components.r5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), pxVar.N0);
                }
                pxVar.N0.setColorFilter(new PorterDuffColorFilter(pxVar.f(org.telegram.ui.ActionBar.g6.f20315zh), PorterDuff.Mode.MULTIPLY));
                q5Var.g(pxVar.N0, z10);
                q5Var.m(false, z10);
            } else {
                q5Var.g(null, z10);
                q5Var.m(false, z10);
            }
            q5Var.k(Integer.valueOf(pxVar.f(org.telegram.ui.ActionBar.g6.f20315zh)));
            pxVar.W.invalidate();
        }
        if (this.D3 != null && this.actionBar != null) {
            Long emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(user);
            this.B3 = null;
            if (emojiStatusDocumentId2 != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                this.D3.j(emojiStatusDocumentId2.longValue(), z10);
                this.D3.m(z11, z10);
                if (z11) {
                    this.B3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
                }
                this.actionBar.setRightDrawableOnClick(new zv(this, 2));
                r71.t(this.currentAccount);
            } else if (user != null && MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
                if (this.K3 == null) {
                    this.K3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    this.K3 = new org.telegram.ui.Components.r5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.K3);
                }
                this.K3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f20315zh), PorterDuff.Mode.MULTIPLY));
                this.D3.g(this.K3, z10);
                this.D3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(new zv(this, 3));
                r71.t(this.currentAccount);
            } else {
                this.D3.g(null, z10);
                this.D3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.q5 q5Var3 = this.D3;
            int i10 = org.telegram.ui.ActionBar.g6.f20315zh;
            q5Var3.k(Integer.valueOf(getThemedColor(i10)));
            org.telegram.ui.Cells.o oVar = this.E3;
            if (oVar != null) {
                oVar.setColor(getThemedColor(i10));
            }
            ux uxVar = this.M0;
            if (uxVar != null && (uxVar.getContentView() instanceof r71)) {
                org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
                r71 r71Var = (r71) this.M0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.q5 q5Var4 = this.D3;
                    if (rightDrawable == q5Var4) {
                        q5Var2 = q5Var4;
                    }
                }
                r71Var.y(q5Var2, titleTextView);
            }
        }
    }

    public final boolean b4() {
        if (this.V2 == 1) {
            return true;
        }
        return false;
    }

    public final void b5() {
        di.d4 d4Var;
        boolean storiesEnabled = getMessagesController().storiesEnabled();
        if (this.N3 != storiesEnabled) {
            U4();
            if (!this.N3 && storiesEnabled && (d4Var = this.f42379p0) != null) {
                d4Var.u();
            }
            this.N3 = storiesEnabled;
        }
        org.telegram.ui.Components.l20 l20Var = this.f42401t0;
        if (l20Var == null) {
            return;
        }
        if (this.R0 == 10) {
            l20Var.setImageResource(R.drawable.floating_check);
            this.f42401t0.setContentDescription(LocaleController.getString(R.string.Done));
            return;
        }
        l20Var.setImageResource(R.drawable.filled_fab_compose_32);
        this.f42401t0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
    }

    public final boolean c4(long j10) {
        if (j10 < 0) {
            return false;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f19363id);
        if ((topics != null && !topics.isEmpty()) || !MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f19363id)) {
            return false;
        }
        return true;
    }

    public final void c5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        boolean z12;
        bi.x8 U3;
        ArrayList arrayList;
        boolean z13;
        boolean z14;
        int i10;
        float f7;
        float f10;
        if (this.E0 != null && this.I == null) {
            sx sxVar = this.F3;
            if ((sxVar == null || !sxVar.c()) && !this.f42382p3 && (kVar = this.actionBar) != null && !kVar.t() && !this.f42362l2) {
                di.kc kcVar = di.kc.F2;
                int i11 = 0;
                if ((kcVar != null && kcVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
                    z10 = false;
                }
                if (!b4() && U3().G()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.X2 != 0) {
                    z12 = false;
                } else if (b4()) {
                    z12 = !U3().h.isEmpty();
                } else {
                    if (!z11 && (((arrayList = (U3 = U3()).f3966g) != null && arrayList.size() > 0) || U3.H())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z11 = U3().G();
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
                    px pxVar = this.E0;
                    if (z13 != z15) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    pxVar.q(z10, z14);
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
                        ofFloat.addUpdateListener(new hj(1, this));
                        this.J.addListener(new org.telegram.ui.Components.u61(this, 21));
                        this.J.setDuration(200L);
                        this.J.setInterpolator(org.telegram.ui.Components.es.f24771f);
                        this.J.start();
                    } else {
                        px pxVar2 = this.E0;
                        if (z16 && !isInPreviewMode()) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        pxVar2.setVisibility(i10);
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
                        this.E0.l(1.0f, false);
                    }
                    if (z10 && !isInPreviewMode()) {
                        this.E0.setVisibility(0);
                        float f13 = -this.N;
                        if (!z12) {
                            f11 = Q3();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.I = ofFloat2;
                        ofFloat2.addUpdateListener(new hy(this, f13, z12, f11));
                        this.I.addListener(new yx(this, z12, 2));
                        this.I.setDuration(200L);
                        this.I.setInterpolator(org.telegram.ui.Components.es.f24771f);
                        this.I.start();
                        return;
                    }
                    this.K = z12;
                    px pxVar3 = this.E0;
                    if ((z12 || this.L) && !isInPreviewMode()) {
                        i12 = 0;
                    }
                    pxVar3.setVisibility(i12);
                    if (!z12) {
                        z4(0.0f);
                    } else {
                        this.f42425x3 = -AndroidUtilities.dp(81.0f);
                        z4(-Q3());
                    }
                    while (true) {
                        xy[] xyVarArr = this.f42325e0;
                        if (i11 >= xyVarArr.length) {
                            break;
                        }
                        xy xyVar = xyVarArr[i11];
                        if (xyVar != null) {
                            xyVar.f41980a.requestLayout();
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

    @Override
    public final boolean canBeginSlide() {
        ww wwVar;
        if (!this.F3.c()) {
            if (this.R0 == 3 && (wwVar = this.f42430z0) != null && wwVar.getVisibility() == 0 && this.f42430z0.K > 0) {
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
            iy iyVar = this.C0;
            if (iyVar != null) {
                iyVar.R();
                return true;
            }
            return true;
        }
        return super.closeLastFragment();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.Components.b8 b8Var = new org.telegram.ui.Components.b8(this, context, this.resourceProvider, 3);
        b8Var.setAllowOverlayTitle(true);
        b8Var.L();
        b8Var.B(getThemedColor(org.telegram.ui.ActionBar.g6.f20199t8), false);
        b8Var.B(getThemedColor(org.telegram.ui.ActionBar.g6.f20307z8), true);
        b8Var.D(getThemedColor(org.telegram.ui.ActionBar.g6.f20235v8), false);
        b8Var.D(getThemedColor(org.telegram.ui.ActionBar.g6.f20290y8), true);
        b8Var.k();
        b8Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        b8Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.V2 == 0 || b4())) {
            return b8Var;
        }
        b8Var.setOccupyStatusBar(false);
        return b8Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.createView(android.content.Context):android.view.View");
    }

    public final boolean d4(TLRPC.Dialog dialog) {
        char c10;
        if (dialog == null) {
            return false;
        }
        int i10 = this.f42325e0[0].f41986s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.t() || this.actionBar.u(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f42325e0[0].f41986s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            dialogFilter = dialogFilterArr[c10];
        }
        if (dialogFilter != null) {
            if (dialogFilter.pinnedDialogs.indexOfKey(dialog.f19220id) < 0) {
                return false;
            }
            return true;
        }
        return dialog.pinned;
    }

    public final void d5(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.d5(int, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int r30, int r31, java.lang.Object... r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (!(dialog instanceof fi.k3) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e4() {
        if (this.C2 == null && this.f42371n2 == null) {
            return true;
        }
        return false;
    }

    public final boolean e5(long j10) {
        TLRPC.Chat chat;
        ix ixVar;
        if ((this.S0 <= 1 && ((ixVar = this.B1) == null || ixVar.getVisibility() != 0 || TextUtils.isEmpty(this.B1.getFieldText()))) || !DialogObject.isChatDialog(j10) || (chat = getMessagesController().getChat(Long.valueOf(-j10))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    public final boolean f3(long j10, View view) {
        if (this.f42362l2 && getMessagesController().isForum(j10)) {
            return false;
        }
        Long valueOf = Long.valueOf(j10);
        ArrayList arrayList = this.I2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j10));
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).V(false, true);
            } else if (view instanceof org.telegram.ui.Cells.i6) {
                ((org.telegram.ui.Cells.i6) view).t(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j10));
        if (view instanceof org.telegram.ui.Cells.s2) {
            ((org.telegram.ui.Cells.s2) view).V(true, true);
        } else if (view instanceof org.telegram.ui.Cells.i6) {
            ((org.telegram.ui.Cells.i6) view).t(true, true);
        }
        return true;
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.m80 m80Var = this.L0;
        if (m80Var != null) {
            m80Var.u();
        }
    }

    public final void g3(hg.p0 p0Var) {
        iy iyVar;
        if (this.f42382p3 && (iyVar = this.C0) != null) {
            ArrayList arrayList = iyVar.A0;
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (p0Var.b((hg.p0) arrayList.get(i10))) {
                        return;
                    }
                }
            }
            arrayList.add(p0Var);
            oy oyVar = this.X;
            ArrayList arrayList2 = oyVar.F;
            arrayList2.add(p0Var);
            oyVar.I = arrayList2.size() - 1;
            oyVar.f();
            this.X.f27815r.getText().clear();
            T4(true, null, null, false, true);
        }
    }

    public final void g4(long j10) {
        char c10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j10);
        int i10 = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList<TLRPC.Dialog> dialogsByCommunity = getMessagesController().getDialogsByCommunity(dialog.community_id);
            if (dialogsByCommunity != null) {
                int size = dialogsByCommunity.size();
                while (i10 < size) {
                    TLRPC.Dialog dialog2 = dialogsByCommunity.get(i10);
                    i10++;
                    g4(dialog2.f19220id);
                }
                return;
            }
            return;
        }
        int i11 = this.f42325e0[0].f41986s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i11 == 7 || i11 == 8) && (!this.actionBar.t() || this.actionBar.u(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f42325e0[0].f41986s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            dialogFilter = dialogFilterArr[c10];
        }
        this.y3 = 2;
        int i12 = -1;
        if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && !dialogFilter.alwaysShow(this.currentAccount, dialog)) {
            x4(true, true);
            l3();
            if (this.R1 != null) {
                int i13 = 0;
                while (true) {
                    if (i13 >= this.R1.size()) {
                        break;
                    } else if (((TLRPC.Dialog) this.R1.get(i13)).f19220id == j10) {
                        i12 = i13;
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i12 < 0) {
                    x4(false, false);
                }
            }
        }
        int i14 = i12;
        if (getMessagesController().isForum(j10) || getMessagesController().isMonoForumWithManageRights(j10)) {
            getMessagesController().markAllTopicsAsRead(j10);
        }
        getMessagesController().markMentionsAsRead(j10, 0L);
        MessagesController messagesController = getMessagesController();
        int i15 = dialog.top_message;
        messagesController.markDialogAsRead(j10, i15, i15, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i14 >= 0) {
            this.R1.remove(i14);
            this.f42325e0[0].f41988x.D();
            this.f42325e0[0].q(true);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.x4 getBackButtonState() {
        if (!b4() && !this.F3.f39584f) {
            return org.telegram.ui.ActionBar.x4.f20814b;
        }
        return org.telegram.ui.ActionBar.x4.f20813a;
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
            i10 = (int) Utilities.clamp((200.0f / getLayoutContainer().getMeasuredWidth()) * f7, 200.0f, 80.0f);
        } else {
            i10 = 150;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.W3, 1.0f);
        this.Z3 = ofFloat2;
        ofFloat2.addUpdateListener(new wv(this, 2));
        this.Z3.setInterpolator(org.telegram.ui.Components.es.f24772g);
        this.Z3.setDuration(i10);
        this.Z3.start();
        return this.Z3;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.getThemeDescriptions():java.util.ArrayList");
    }

    public final void h3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.V2 == 0 && this.X2 == 0 && Build.VERSION.SDK_INT >= 33 && lk0.o(parentActivity)) {
                if (z10) {
                    showDialog(new lk0(parentActivity, !org.telegram.ui.Components.cf0.a(), new lw(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().syncContacts && this.U1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z10) {
                    org.telegram.ui.ActionBar.a2 a2Var = org.telegram.ui.Components.g5.v(parentActivity, new dw(this, 1)).f19548a;
                    this.T1 = a2Var;
                    showDialog(a2Var);
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
            } else if ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
            if (arrayList.isEmpty()) {
                if (this.A0) {
                    this.A0 = false;
                    G4();
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

    public final boolean h4(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.User r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.h4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    public final void i3(CharSequence charSequence) {
        int i10;
        if (this.B1 != null) {
            if (this.D2 == null && this.E2 == null && this.F2 == null) {
                return;
            }
            if (this.G2 == null) {
                org.telegram.ui.Components.or0 or0Var = new org.telegram.ui.Components.or0(getParentActivity(), getResourceProvider());
                this.G2 = or0Var;
                or0Var.setLayoutClickListener(new zv(this, 0));
                this.G2.setOnModeChangeListener(new aw(this, 0));
                ix ixVar = this.B1;
                org.telegram.ui.Components.or0 or0Var2 = this.G2;
                if (or0Var2 == null) {
                    ixVar.getClass();
                } else {
                    ixVar.G1 = or0Var2;
                    ixVar.addView(or0Var2, 0, w7.a6.e(-1, 48, 51));
                    ixVar.f22892g3 = false;
                    ixVar.L();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G2.getLayoutParams();
                layoutParams.rightMargin = -this.B1.getPaddingRight();
                this.G2.setLayoutParams(layoutParams);
            }
            if (X3()) {
                this.G2.i(this.currentAccount, this.D2);
            } else {
                String str = this.E2;
                if (str != null) {
                    org.telegram.ui.Components.or0 or0Var3 = this.G2;
                    or0Var3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        or0Var3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.F2;
                    if (charSequence2 != null) {
                        org.telegram.ui.Components.or0 or0Var4 = this.G2;
                        or0Var4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            or0Var4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.B1.setFieldText(charSequence);
            }
            ix ixVar2 = this.B1;
            if (X3()) {
                i10 = R.string.AddCaption;
            } else {
                i10 = R.string.ShareComment;
            }
            ixVar2.setOverrideHint(LocaleController.getString(i10));
            s3();
            if (this.G2.getMode() != 0) {
                this.B1.v1(false, false);
            }
            Y4();
        }
    }

    public final boolean i4(TLRPC.User user) {
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.G;
        if (user != null && !UserObject.isReplyUser(user) && !UserObject.isDeleted(user)) {
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

    @Override
    public final boolean isLightStatusBar() {
        sx sxVar;
        if (!this.f42353j2 && (sxVar = this.F3) != null && sxVar.getFragment() != null) {
            return this.F3.getFragment().isLightStatusBar();
        }
        if (i0.a.f(getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.j3():void");
    }

    public final void j4(View view) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        String str = null;
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.c6) null, false);
        e3Var.fixNavigationBar();
        if (getMessagesStorage().getArchiveUnreadCount() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = R.drawable.msg_markread;
        } else {
            i10 = 0;
        }
        if (SharedConfig.archiveHidden) {
            i11 = R.drawable.chats_pin;
        } else {
            i11 = R.drawable.chats_unpin;
        }
        int[] iArr = {i10, i11};
        if (z10) {
            str = LocaleController.getString(R.string.MarkAllAsRead);
        }
        if (SharedConfig.archiveHidden) {
            i12 = R.string.PinInTheList;
        } else {
            i12 = R.string.HideAboveTheList;
        }
        CharSequence[] charSequenceArr = {str, LocaleController.getString(i12)};
        o4 o4Var = new o4(this, 1);
        e3Var.items = charSequenceArr;
        e3Var.itemIcons = iArr;
        e3Var.onClickListener = o4Var;
        showDialog(e3Var);
    }

    public final int k3() {
        if (this.B1 != null) {
            return (int) (this.f42428y1.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        } else if (this.X2 != 0) {
            return AndroidUtilities.dp(72.0f) + this.f42335f4;
        } else {
            return this.f42335f4 + this.f42345h4;
        }
    }

    public final void k4(android.view.View r25, int r26, s4.g0 r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.k4(android.view.View, int, s4.g0):void");
    }

    public final void l3() {
        AndroidUtilities.runOnUIThread(new uv(this, 2), 300L);
    }

    public final boolean l4(View view, int i10, float f7, org.telegram.ui.Components.lm0 lm0Var) {
        org.telegram.ui.Components.so0 so0Var;
        long j10;
        org.telegram.ui.Components.so0 so0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.a3) && lm0Var.j(i10) != 21) {
            if (!this.actionBar.t() && !AndroidUtilities.isTablet() && !this.f42362l2 && (view instanceof org.telegram.ui.Cells.s2)) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (!getMessagesController().isForum(s2Var.getDialogId()) && !this.F3.c() && s2Var.S(f7)) {
                    return E4(s2Var);
                }
            }
            sx sxVar = this.F3;
            if (sxVar == null || !sxVar.c()) {
                iy iyVar = this.C0;
                boolean z10 = true;
                if (iyVar != null && lm0Var == (so0Var2 = iyVar.f31915b0)) {
                    Object J = so0Var2.J(i10);
                    if (!this.C0.f31915b0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                        a2Var.R = string;
                        if (J instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) J;
                            if (chat.monoforum) {
                                a2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, og.d.i(chat, this.currentAccount, false));
                            } else {
                                a2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            makeEncryptedDialogId = -chat.f19216id;
                        } else if (J instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) J;
                            if (user.f19363id == getUserConfig().clientUserId) {
                                a2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                a2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            makeEncryptedDialogId = user.f19363id;
                        } else if (J instanceof TLRPC.EncryptedChat) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) J).user_id));
                            a2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.f19224id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new bi.p1(this, makeEncryptedDialogId, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(a2Var);
                        TextView textView = (TextView) a2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20139q7));
                        }
                        return true;
                    }
                }
                iy iyVar2 = this.C0;
                if (iyVar2 != null && lm0Var == (so0Var = iyVar2.f31915b0)) {
                    if (this.f42362l2) {
                        k4(view, i10, lm0Var);
                        return false;
                    }
                    if ((view instanceof org.telegram.ui.Cells.i6) && !so0Var.O(i10)) {
                        j10 = ((org.telegram.ui.Cells.i6) view).getDialogId();
                    } else {
                        j10 = 0;
                    }
                    if (j10 != 0) {
                        J4(j10, view);
                        return true;
                    }
                } else {
                    Object I = ((hg.m) lm0Var).I(i10);
                    if (I instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) I;
                        if (this.f42362l2) {
                            if ((this.R0 == 3 || F3()) && e5(dialog.f19220id)) {
                                if (this.R0 == 1 && F3() && this.f42365m2 && getMessagesController().isForum(dialog.f19220id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f19220id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.R0 != 1) {
                                        z10 = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z10);
                                    bundle.putBoolean("quote", this.O0);
                                    bundle.putBoolean("reply_to", this.N0);
                                    lg1 lg1Var = new lg1(bundle);
                                    lg1Var.L0 = this;
                                    presentFragment(lg1Var);
                                    return false;
                                }
                                f3(dialog.f19220id, view);
                                X4();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            j4(view);
                            return false;
                        } else if (!this.actionBar.t() || !d4(dialog)) {
                            J4(dialog.f19220id, view);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean m3(long j10) {
        int i10;
        int i11 = this.R0;
        if (i11 != 15 && i11 != 16 && this.f42343h2 == null && this.f42398s2) {
            if (DialogObject.isChatDialog(j10)) {
                long j11 = -j10;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j11));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    if (this.f42386q2 || !ChatObject.isCanWriteToChannel(j11, this.currentAccount) || (i10 = this.T0) == 2 || i10 == 3) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.SendMessageTitle);
                        int i12 = this.T0;
                        if (i12 == 3) {
                            alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.TodoCantForward);
                        } else if (i12 == 2) {
                            alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.PublicPollCantForward);
                        } else {
                            alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        showDialog(alertDialog$Builder.f19548a);
                        return false;
                    }
                    return true;
                }
                return true;
            } else if (DialogObject.isEncryptedDialog(j10)) {
                if (this.T0 != 0 || this.U0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.f19548a.R = LocaleController.getString(R.string.SendMessageTitle);
                    int i13 = this.T0;
                    if (i13 == 3) {
                        alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i13 != 0) {
                        alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    showDialog(alertDialog$Builder2.f19548a);
                    return false;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public final void m4(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.ActionBar.l5(25));
        org.telegram.ui.Components.m80 H = org.telegram.ui.Components.m80.H(this, view);
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
                linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Z(getThemedColor(org.telegram.ui.ActionBar.g6.f19990i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
                k9Var.r(currentUser);
                org.telegram.ui.Components.jh0 jh0Var = new org.telegram.ui.Components.jh0(this, getParentActivity(), z10);
                linearLayout.addView(jh0Var, w7.a6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(getParentActivity());
                if (z10) {
                    z9Var.setScaleX(0.833f);
                    z9Var.setScaleY(0.833f);
                }
                z9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                z9Var.getImageReceiver().setCurrentAccount(intValue);
                z9Var.e(currentUser, k9Var);
                jh0Var.addView(z9Var, w7.a6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20007j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.a6.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new org.telegram.ui.Cells.sa(this, intValue, H, 12));
                H.r(linearLayout, w7.a6.n(230, 48));
            }
        }
        ShapeDrawable c02 = org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.m1(0.15f, -16777216));
        H.f27304z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        H.W(c02);
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        H.V(5);
        H.Z();
    }

    public final void n3(boolean z10) {
        hi.j jVar;
        TLRPC.ChatFull chatFull;
        boolean z11;
        org.telegram.ui.Components.xs xsVar = this.J1;
        if (xsVar != null && (jVar = this.Q1) != null && (chatFull = this.Z2) != null) {
            if (this.X2 != 0 && chatFull.requests_pending > 0 && !this.f42308b.f16293f) {
                z11 = true;
            } else {
                z11 = false;
            }
            xsVar.i(jVar, z11, z10);
            this.Q1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.Z2.requests_pending, new Object[0]));
        }
    }

    public final void n4(int i10, long j10, TLRPC.Chat chat, boolean z10, boolean z11) {
        if (i10 == 103) {
            getMessagesController().deleteDialog(j10, 1, z11);
            return;
        }
        if (chat != null) {
            if (ChatObject.isNotInChat(chat)) {
                getMessagesController().deleteDialog(j10, 0, z11);
            } else {
                getMessagesController().deleteParticipantFromChat(-j10, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, false);
            }
        } else {
            getMessagesController().deleteDialog(j10, 0, z11);
            if (z10 && z11) {
                getMessagesController().blockPeer(j10);
            }
        }
        if (AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(j10));
        }
        getMessagesController().checkIfFolderEmpty(this.V2);
    }

    public final void o3(xy xyVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i10;
        boolean z14;
        int L0 = xyVar.f41982c.L0();
        int N0 = xyVar.f41982c.N0();
        if (!this.f42339g3 && !this.f42363l3) {
            ww wwVar = this.f42430z0;
            if (wwVar == null || wwVar.getVisibility() != 0 || !this.f42430z0.O) {
                int abs = Math.abs(N0 - L0) + 1;
                if (N0 != -1) {
                    s4.b1 K = xyVar.f41980a.K(N0);
                    if (K != null && K.f44841f == 11) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f42311b2 = z14;
                    if (z14) {
                        Z3(false);
                    }
                } else {
                    this.f42311b2 = false;
                }
                int i11 = xyVar.f41986s;
                if (i11 == 7 || i11 == 8) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                    int i12 = xyVar.h;
                    if (i12 >= 0 && i12 < dialogFilters.size() && (dialogFilters.get(xyVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= O3(this.currentAccount, xyVar.f41986s, 1, this.S1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                        boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                        boolean z15 = !isDialogsEndReached;
                        if (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        z11 = z15;
                        if ((abs <= 0 && N0 >= O3(this.currentAccount, xyVar.f41986s, this.V2, this.S1).size() - 10) || (abs == 0 && (((i10 = xyVar.f41986s) == 7 || i10 == 8) && !getMessagesController().isDialogsEndReached(this.V2)))) {
                            boolean isDialogsEndReached2 = getMessagesController().isDialogsEndReached(this.V2);
                            boolean z16 = !isDialogsEndReached2;
                            if (isDialogsEndReached2 && getMessagesController().isServerDialogsEndReached(this.V2)) {
                                z13 = z16;
                                z12 = false;
                            } else {
                                z13 = z16;
                                z12 = true;
                            }
                        } else {
                            z12 = false;
                            z13 = false;
                        }
                        if (!z12 || z10) {
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    yy yyVar = yy.this;
                                    if (z12) {
                                        yyVar.getMessagesController().loadDialogs(yyVar.V2, -1, 100, z13);
                                    }
                                    if (z10) {
                                        yyVar.getMessagesController().loadDialogs(1, -1, 100, z11);
                                    } else {
                                        yyVar.getClass();
                                    }
                                }
                            });
                        }
                        return;
                    }
                }
                z10 = false;
                z11 = false;
                if (abs <= 0) {
                }
                z12 = false;
                z13 = false;
                if (!z12) {
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        yy yyVar = yy.this;
                        if (z12) {
                            yyVar.getMessagesController().loadDialogs(yyVar.V2, -1, 100, z13);
                        }
                        if (z10) {
                            yyVar.getMessagesController().loadDialogs(1, -1, 100, z11);
                        } else {
                            yyVar.getClass();
                        }
                    }
                });
            }
        }
    }

    public final void o4(java.util.ArrayList r43, int r44, boolean r45, boolean r46, java.util.HashSet r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.o4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
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
                iy iyVar = this.C0;
                if (iyVar != null) {
                    iyVar.R();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.m80 m80Var = this.L0;
            if (m80Var != null) {
                if (z10) {
                    m80Var.u();
                    this.L0 = null;
                    return false;
                }
            } else {
                ww wwVar = this.f42430z0;
                if (wwVar != null && wwVar.f30711n) {
                    if (z10) {
                        wwVar.setIsEditing(false);
                        F4(false);
                        return false;
                    }
                } else {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar != null && kVar.t()) {
                        if (z10) {
                            iy iyVar2 = this.C0;
                            if (iyVar2 != null && iyVar2.getVisibility() == 0) {
                                this.C0.Q(false);
                            }
                            Y3(true);
                            return false;
                        }
                    } else if (this.f42308b.f16293f) {
                        if (z10) {
                            this.X.f27815r.getText().clear();
                            this.Y.b(false);
                            this.X.f27815r.clearFocus();
                            return false;
                        }
                    } else {
                        ww wwVar2 = this.f42430z0;
                        if (wwVar2 != null && wwVar2.getVisibility() == 0 && !this.f42339g3) {
                            ww wwVar3 = this.f42430z0;
                            if (!wwVar3.O && !this.f42363l3) {
                                ArrayList arrayList = wwVar3.h;
                                if (!arrayList.isEmpty() && wwVar3.L != ((org.telegram.ui.Components.s00) arrayList.get(0)).f28978a) {
                                    if (z10) {
                                        ww wwVar4 = this.f42430z0;
                                        ArrayList arrayList2 = wwVar4.h;
                                        if (!arrayList2.isEmpty()) {
                                            wwVar4.f((org.telegram.ui.Components.s00) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        ix ixVar = this.B1;
                        if (ixVar != null && ixVar.r0()) {
                            if (z10) {
                                this.B1.k0(true);
                            }
                        } else {
                            px pxVar = this.E0;
                            if (pxVar.O == 0 && pxVar.S.L0() != 0) {
                                pxVar.h.x0(0);
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
        di.ab abVar;
        ww wwVar;
        if (this.V1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                iy iyVar = this.C0;
                if (iyVar != null) {
                    iyVar.f31915b0.R(this.W1, tLObject);
                }
                this.X1 = null;
            }
            this.V1 = false;
        }
        if (!this.K && (wwVar = this.f42430z0) != null && wwVar.getVisibility() == 0 && this.f42389r.f16293f) {
            int i10 = (int) (-this.N);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.f42325e0[0].f41980a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f42427y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        if (!isInPreviewMode() && (abVar = this.K0) != null && abVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        y3();
        this.f42390r0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        di.d4 d4Var;
        super.onBecomeFullyVisible();
        if (b4()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z10 = globalMainSettings.getBoolean("archivehint", true);
            boolean isEmpty = O3(this.currentAccount, this.R0, this.V2, false).isEmpty();
            if (z10 && isEmpty) {
                MessagesController.getGlobalMainSettings().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                globalMainSettings.edit().putBoolean("archivehint", false).commit();
                D4();
            }
        }
        if (this.f42390r0 && !this.f42396s0 && (d4Var = this.f42379p0) != null && this.N3) {
            this.f42396s0 = true;
            this.f42390r0 = false;
            d4Var.u();
        }
        AndroidUtilities.runOnUIThread(new nw(this, 4), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.m80 m80Var = this.L0;
        if (m80Var != null) {
            m80Var.u();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.a2 a2Var;
        super.onDialogDismiss(dialog);
        if (this.V2 == 0 && this.X2 == 0 && (a2Var = this.T1) != null && dialog == a2Var && getParentActivity() != null) {
            h3(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10;
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        int i11 = 0;
        if (bundle != null) {
            this.f42362l2 = bundle.getBoolean("onlySelect", false);
            this.f42365m2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f42386q2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.R0 = this.arguments.getInt("dialogsType", 0);
            this.O0 = this.arguments.getBoolean("quote", false);
            this.N0 = this.arguments.getBoolean("reply_to", false);
            this.P0 = this.arguments.getLong("reply_to_author", 0L);
            this.Q0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f42333f2 = this.arguments.getString("selectAlertString");
            this.f42338g2 = this.arguments.getString("selectAlertStringGroup");
            this.f42343h2 = this.arguments.getString("addToGroupAlertString");
            this.f42392r2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f42398s2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f42403t2 = this.arguments.getBoolean("afterSignup", false);
            this.V2 = this.arguments.getInt("folderId", 0);
            long j10 = this.arguments.getLong("community_id", 0L);
            this.X2 = j10;
            if (j10 != 0) {
                this.Y2 = getMessagesController().getChat(Long.valueOf(this.X2));
                this.Z2 = getMessagesController().getChatFull(this.X2);
            }
            this.f42348i2 = this.arguments.getBoolean("resetDelegate", true);
            this.S0 = this.arguments.getInt("messagesCount", 0);
            this.T0 = this.arguments.getInt("hasPoll", 0);
            this.U0 = this.arguments.getBoolean("hasInvoice", false);
            this.f42408u2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f42408u2);
            this.arguments.getInt("otherwiseRelogin");
            this.f42413v2 = this.arguments.getBoolean("allowGroups", true);
            this.f42419w2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f42424x2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.f42429y2 = this.arguments.getBoolean("allowChannels", true);
            this.f42432z2 = this.arguments.getBoolean("allowUsers", true);
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
            this.U1 = MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts", true);
            SharedConfig.loadProxyList();
        }
        this.J3 = getNotificationCenter().createObserversGroup(this);
        if (this.f42371n2 == null) {
            this.f42322d2 = getConnectionsManager().getConnectionState();
            this.J3.addGlobal(NotificationCenter.emojiLoaded);
            if (!this.f42362l2) {
                this.J3.addGlobal(NotificationCenter.closeSearchByActiveAction);
                this.J3.addGlobal(NotificationCenter.proxySettingsChanged);
                this.J3.add(NotificationCenter.filterSettingsUpdated);
                this.J3.add(NotificationCenter.dialogsUnreadCounterChanged);
            }
            this.J3.add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.dialogFiltersUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.encryptedChatUpdated).add(NotificationCenter.contactsDidLoad).add(NotificationCenter.appDidLogout).add(NotificationCenter.openedChatChanged).add(NotificationCenter.notificationsSettingsUpdated).add(NotificationCenter.messageReceivedByAck).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messageSendError).add(NotificationCenter.needReloadRecentDialogsSearch).add(NotificationCenter.replyMessagesDidLoad).add(NotificationCenter.topicsDidLoaded).add(NotificationCenter.reloadHints).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.onDownloadingFilesChanged).add(NotificationCenter.needDeleteDialog).add(NotificationCenter.folderBecomeEmpty).add(NotificationCenter.newSuggestionsAvailable).add(NotificationCenter.dialogsUnreadReactionsCounterChanged).add(NotificationCenter.dialogsUnreadPollVotesCounterChanged).add(NotificationCenter.forceImportContactsStart).add(NotificationCenter.userEmojiStatusUpdated).add(NotificationCenter.currentUserPremiumStatusChanged);
            this.J3.addGlobal(NotificationCenter.didSetPasscode);
        }
        this.J3.add(NotificationCenter.messagesDeleted).add(NotificationCenter.onDatabaseMigration).add(NotificationCenter.onDatabaseOpened).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.didClearDatabase).add(NotificationCenter.onDatabaseReset).add(NotificationCenter.storiesUpdated).add(NotificationCenter.storiesEnabledUpdate).add(NotificationCenter.unconfirmedAuthUpdate).add(NotificationCenter.premiumPromoUpdated).add(NotificationCenter.starBalanceUpdated).add(NotificationCenter.starSubscriptionsLoaded).add(NotificationCenter.communityPendingRequestsUpdate).add(NotificationCenter.communitySwitchedCollapsed).add(NotificationCenter.appConfigUpdated).add(NotificationCenter.activeAuctionsUpdated);
        if (this.R0 == 0) {
            this.J3.add(NotificationCenter.chatlistFolderUpdate);
            this.J3.add(NotificationCenter.dialogTranslate);
        }
        f4(getAccountInstance());
        bi.x8 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.f3977s) {
                ConnectionsManager.getInstance(storiesController.f3962a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new bi.k7(storiesController, 0));
            }
        }
        getMessagesController().loadPinnedDialogs(this.V2, 0L, null);
        if (this.Q3 != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            gv gvVar = this.Q3;
            if (gvVar.getParent() != null) {
                ((ViewGroup) gvVar.getParent()).removeView(gvVar);
            }
            this.Q3 = null;
        }
        if (b4()) {
            bi.x8 storiesController2 = getMessagesController().getStoriesController();
            if (storiesController2.f3983z) {
                storiesController2.Q(true);
            }
        } else {
            getMessagesController().getStoriesController().T();
        }
        getContactsController().loadGlobalPrivacySetting();
        if (getMessagesController().savedViewAsChats) {
            getMessagesController().getSavedMessagesController().preloadDialogs(true);
        }
        if (this.X2 != 0) {
            getMessagesController().loadFullChat(this.X2, 0, true);
        }
        BirthdayController.getInstance(this.currentAccount).check();
        if (this.W) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.f42345h4 = i10;
        if (this.W) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f42350i4 = i11;
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.ObserversGroup observersGroup = this.J3;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.J3 = null;
        }
        ix ixVar = this.B1;
        if (ixVar != null) {
            ixVar.z0();
        }
        org.telegram.ui.Components.or0 or0Var = this.G2;
        if (or0Var != null) {
            or0Var.j();
        }
        org.telegram.ui.Components.k31 k31Var = this.H2;
        if (k31Var != null) {
            AndroidUtilities.cancelRunOnUIThread(k31Var);
            this.H2 = null;
        }
        UndoView undoView = this.f42427y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f42377o3.unlock();
        this.C2 = null;
        pb1 pb1Var = pb1.f39178b;
        if (pb1Var != null) {
            pb1Var.dismiss();
            pb1.f39178b = null;
        }
    }

    @Override
    public final void onPanTranslationUpdate(float f7) {
        if (this.f42325e0 != null) {
            this.J0 = f7;
            ix ixVar = this.B1;
            int i10 = 0;
            if (ixVar != null && ixVar.r0()) {
                this.fragmentView.setTranslationY(f7);
                while (true) {
                    xy[] xyVarArr = this.f42325e0;
                    if (i10 >= xyVarArr.length) {
                        break;
                    }
                    xyVarArr[i10].setTranslationY(0.0f);
                    i10++;
                }
                if (!this.f42362l2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.sc scVar = this.f42372n3;
                    if (scVar != null) {
                        scVar.l();
                    }
                }
                iy iyVar = this.C0;
                if (iyVar != null) {
                    iyVar.setTranslationY(this.I0);
                    return;
                }
                return;
            }
            while (true) {
                xy[] xyVarArr2 = this.f42325e0;
                if (i10 >= xyVarArr2.length) {
                    break;
                }
                xyVarArr2[i10].setTranslationY(f7);
                i10++;
            }
            if (!this.f42362l2) {
                this.actionBar.setTranslationY(f7);
                org.telegram.ui.Components.sc scVar2 = this.f42372n3;
                if (scVar2 != null) {
                    scVar2.l();
                }
            }
            iy iyVar2 = this.C0;
            if (iyVar2 != null) {
                iyVar2.setTranslationY(this.J0 + this.I0);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.sc scVar = this.S;
        if (scVar != null) {
            scVar.b();
            this.S = null;
        }
        sx sxVar = this.F3;
        if (sxVar != null) {
            sxVar.f39586r = true;
            zx zxVar = sxVar.f39581a;
            if (zxVar != null) {
                zxVar.onPause();
            }
        }
        org.telegram.ui.Components.m80 m80Var = this.L0;
        if (m80Var != null) {
            m80Var.u();
        }
        ix ixVar = this.B1;
        if (ixVar != null) {
            ixVar.B0();
        }
        int i10 = 0;
        UndoView undoView = this.f42427y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        setBulletinDelegate(null);
        if (this.f42325e0 == null) {
            return;
        }
        while (true) {
            xy[] xyVarArr = this.f42325e0;
            if (i10 < xyVarArr.length) {
                xyVarArr[i10].d.getClass();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        FilesMigrationService.FilesMigrationBottomSheet filesMigrationBottomSheet;
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
                                NotificationsController.getInstance(this.currentAccount).showNotifications();
                                break;
                            } else {
                                lk0.n();
                                continue;
                            }
                        case 1:
                            if (iArr[i11] == 0) {
                                ImageLoader.getInstance().checkMediaPaths();
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (iArr[i11] == 0) {
                                AndroidUtilities.runOnUIThread(new nw(this, 3));
                                getContactsController().forceImportContacts();
                                continue;
                            } else {
                                SharedPreferences.Editor edit = MessagesController.getGlobalNotificationsSettings().edit();
                                this.U1 = false;
                                edit.putBoolean("askAboutContacts", false).commit();
                                break;
                            }
                    }
                }
            }
            if (this.A0) {
                this.A0 = false;
                G4();
            }
        } else if (i10 == 4) {
            for (int i12 : iArr) {
                if (i12 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 30 && (filesMigrationBottomSheet = FilesMigrationService.filesMigrationBottomSheet) != null) {
                filesMigrationBottomSheet.migrateOldFolder();
            }
        }
    }

    @Override
    public final void onResume() {
        boolean z10;
        yy yyVar;
        xy xyVar;
        fx fxVar;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.Components.so0 so0Var;
        di.ab abVar;
        super.onResume();
        px pxVar = this.E0;
        char c10 = 0;
        if (pxVar != null) {
            ArrayList arrayList = pxVar.f3841x;
            bi.x8 x8Var = pxVar.f3834s;
            x8Var.l(x8Var.f3966g);
            x8Var.l(x8Var.h);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.PeerStories y3 = x8Var.y(((bi.r) arrayList.get(i10)).f3602c);
                if (y3 != null) {
                    x8Var.X(y3);
                }
            }
        }
        sx sxVar = this.F3;
        if (sxVar != null) {
            sxVar.f39586r = false;
            zx zxVar = sxVar.f39581a;
            if (zxVar != null) {
                zxVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (abVar = this.K0) != null && abVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.f42325e0 != null) {
            int i11 = 0;
            while (true) {
                xy[] xyVarArr = this.f42325e0;
                if (i11 >= xyVarArr.length) {
                    break;
                }
                xyVarArr[i11].d.l();
                i11++;
            }
        }
        ix ixVar = this.B1;
        if (ixVar != null) {
            ixVar.C0();
        }
        long j10 = 0;
        if (!this.f42362l2 && this.V2 == 0 && this.X2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        iy iyVar = this.C0;
        if (iyVar != null && (so0Var = iyVar.f31915b0) != null) {
            so0Var.l();
        }
        if (!this.f42403t2 && getUserConfig().unacceptedTermsOfService != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.V2 == 0 && this.X2 == 0 && this.f42317c2 && !this.f42362l2) {
            int i12 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.f42317c2 = false;
                if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i12 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i12 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                yyVar = this;
                org.telegram.messenger.q1 q1Var = new org.telegram.messenger.q1(yyVar, z13, z11, z12, parentActivity);
                if (yyVar.f42403t2 && (z11 || z13)) {
                    j10 = 4000;
                }
                AndroidUtilities.runOnUIThread(q1Var, j10);
            } else {
                yyVar = this;
            }
        } else {
            yyVar = this;
            if (!yyVar.f42362l2 && yyVar.V2 == 0 && yyVar.X2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(10020)) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
                        alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new aw(this, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.zg0(21));
                        showDialog(alertDialog$Builder.f19548a);
                    }
                } else {
                    return;
                }
            } else if (yyVar.V2 == 0 && yyVar.X2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
                        alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.PermissionFSILockscreen);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new aw(this, 9));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.zg0(22));
                        showDialog(alertDialog$Builder2.f19548a);
                    }
                } else {
                    return;
                }
            }
        }
        G4();
        if (yyVar.f42325e0 != null) {
            int i13 = 0;
            while (true) {
                xy[] xyVarArr2 = yyVar.f42325e0;
                if (i13 >= xyVarArr2.length) {
                    break;
                }
                xy xyVar2 = xyVarArr2[i13];
                if (xyVar2.f41986s == 0 && xyVar2.v == 2 && xyVar2.f41982c.L0() == 0 && W3()) {
                    yyVar.f42325e0[i13].f41982c.h1(1, (int) yyVar.N);
                }
                if (i13 == 0) {
                    yyVar.f42325e0[i13].d.getClass();
                } else {
                    yyVar.f42325e0[i13].d.getClass();
                }
                i13++;
            }
        }
        I4();
        setBulletinDelegate(new c9(this, 4));
        if (yyVar.f42382p3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), yyVar.classGuid);
        }
        d5(0, false);
        W4(false, true);
        c5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            pb1.o(this);
        }
        y3();
        if (yyVar.f42430z0 != null && (xyVar = yyVar.f42325e0[0]) != null && (fxVar = xyVar.d) != null) {
            int i14 = fxVar.h;
            if (i14 == 7 || i14 == 8) {
                MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
                if (i14 != 7) {
                    c10 = 1;
                }
                MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                if (dialogFilter != null) {
                    yyVar.f42430z0.h(dialogFilter.localId);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f7) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.Y3 && this.Z3 == null) {
            C4(f7);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        di.ab abVar;
        yy yyVar;
        sx sxVar = this.F3;
        if (sxVar != null && sxVar.c()) {
            this.F3.getFragment().onTransitionAnimationEnd(z10, z11);
        } else {
            if (z10 && (abVar = this.K0) != null && abVar.getVisibility() == 0) {
                this.K0.setVisibility(8);
                this.K0.setBackground(null);
            }
            if (z10 && this.f42403t2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f32147x0.c(false);
                }
            }
        }
        if (!z10 && (yyVar = this.W2) != null) {
            yyVar.removeSelfFromStack();
        }
        y3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        sx sxVar = this.F3;
        if (sxVar != null && sxVar.c()) {
            this.F3.getFragment().onTransitionAnimationProgress(z10, f7);
        } else {
            di.ab abVar = this.K0;
            if (abVar != null && abVar.getVisibility() == 0) {
                if (z10) {
                    this.K0.setAlpha(1.0f - f7);
                } else {
                    this.K0.setAlpha(f7);
                }
            }
        }
        y3();
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        int i11;
        int i12;
        int i13 = 8;
        if (i10 == 1) {
            z3();
            B3();
            E3();
            r3();
            C3();
            oy oyVar = this.X;
            ne.b bVar = this.f42308b;
            oyVar.setBlurredBackgroundVisibility(bVar.e);
            float b10 = zf.f0.b(bVar.e);
            org.telegram.ui.Components.z9 z9Var = this.f42306a3;
            if (z9Var != null) {
                z9Var.setScaleX(b10);
                this.f42306a3.setScaleY(b10);
                this.f42306a3.setAlpha(b10);
                org.telegram.ui.Components.z9 z9Var2 = this.f42306a3;
                if (b10 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                z9Var2.setVisibility(i12);
            }
            if (this.f42411v0 != null) {
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
                this.f42411v0.setScaleX(lerp);
                this.f42411v0.setScaleY(lerp);
                this.f42411v0.setAlpha(b10);
                di.d dVar = this.f42411v0;
                int i14 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
                if (i14 > 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                dVar.setVisibility(i11);
                this.f42417w0.setAlpha(b10);
                kh.f fVar = this.f42417w0;
                if (i14 > 0) {
                    i13 = 0;
                }
                fVar.setVisibility(i13);
            }
        } else if (i10 == 2) {
            z3();
            B3();
        } else if (i10 == 3) {
            x3();
        } else if (i10 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        } else if (i10 == 5) {
            w3();
        } else if (i10 == 6) {
            z3();
            B3();
        } else if (i10 == 7) {
            s3();
        } else if (i10 == 8) {
            r3();
            C3();
        } else if (i10 == 9) {
            C3();
        }
    }

    public final void p3() {
        if (this.f42325e0 != null) {
            int k32 = k3();
            int i10 = 0;
            while (true) {
                xy[] xyVarArr = this.f42325e0;
                if (i10 < xyVarArr.length) {
                    xy xyVar = xyVarArr[i10];
                    if (xyVar != null) {
                        uy uyVar = xyVar.f41980a;
                        uyVar.setPadding(0, uyVar.W2, 0, k32);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void p4(long r14, boolean r16, org.telegram.messenger.MessagesController.DialogFilter r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.p4(long, boolean, org.telegram.messenger.MessagesController$DialogFilter, int, boolean):void");
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.Y3 = true;
            y4(true);
            return;
        }
        this.Z3 = null;
        this.Y3 = false;
        y4(false);
        C4(1.0f);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.m2 m2Var) {
        boolean presentFragment = super.presentFragment(m2Var);
        if (presentFragment && this.f42325e0 != null) {
            int i10 = 0;
            while (true) {
                xy[] xyVarArr = this.f42325e0;
                if (i10 >= xyVarArr.length) {
                    break;
                }
                xyVarArr[i10].d.getClass();
                i10++;
            }
        }
        di.d4 d4Var = this.f42379p0;
        if (d4Var != null) {
            d4Var.e(true);
        }
        di.d4 d4Var2 = this.f42384q0;
        if (d4Var2 != null) {
            d4Var2.e(true);
        }
        org.telegram.ui.Components.sc.e();
        return presentFragment;
    }

    public final void q3() {
        ih.f fVar = this.f42428y1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.f42428y1.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void q4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.K0.setBackground(new BitmapDrawable(createBitmap));
        this.K0.setAlpha(0.0f);
        this.K0.setVisibility(0);
        y3();
    }

    public final void r3() {
        int i10;
        xy xyVar;
        boolean z10 = true;
        float P3 = P3(true);
        ww wwVar = this.f42430z0;
        if (wwVar != null) {
            if (wwVar.getAlpha() == P3) {
                z10 = false;
            }
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, P3);
            this.f42430z0.setAlpha(P3);
            this.f42430z0.setScaleX(lerp);
            this.f42430z0.setScaleY(lerp);
            ww wwVar2 = this.f42430z0;
            if (P3 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            wwVar2.setVisibility(i10);
            if (z10 && (xyVar = this.f42325e0[0]) != null) {
                xyVar.f41980a.requestLayout();
            }
        }
        P4();
    }

    public final void r4(xy xyVar) {
        int i10;
        org.telegram.ui.Components.f10 f10Var;
        if (xyVar.getVisibility() != 0) {
            return;
        }
        int i11 = xyVar.d.v;
        if (xyVar.f41986s == 0 && W3() && xyVar.f41980a.getChildCount() == 0 && xyVar.v == 2) {
            ((s4.b0) xyVar.f41980a.getLayoutManager()).h1(1, (int) this.N);
        }
        xyVar.d.getClass();
        xyVar.d.U();
        int h = xyVar.d.h();
        if (h == 1 && i11 == 1 && xyVar.d.j(0) == 5) {
            xyVar.q(true);
        } else {
            xyVar.q(false);
            if (h > i11 && (i10 = this.R0) != 11 && i10 != 12 && i10 != 13) {
                xyVar.f41989y.b(i11);
            }
        }
        try {
            uy uyVar = xyVar.f41980a;
            if (this.V2 == 0 && this.X2 == 0) {
                f10Var = xyVar.f41987w;
            } else {
                f10Var = null;
            }
            uyVar.setEmptyView(f10Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
        o3(xyVar);
    }

    public final void s3() {
        int i10;
        int i11;
        float f7 = this.f42368n.e;
        float lerp = AndroidUtilities.lerp(0.2f, 1.0f, f7);
        ji.y1 y1Var = this.C1;
        int i12 = 8;
        if (y1Var != null) {
            y1Var.setScaleX(lerp);
            this.C1.setScaleY(lerp);
            this.C1.setAlpha(f7);
            ji.y1 y1Var2 = this.C1;
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            y1Var2.setVisibility(i11);
        }
        ih.f fVar = this.f42428y1;
        if (fVar != null) {
            fVar.setAlpha(f7);
            ih.f fVar2 = this.f42428y1;
            int i13 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            fVar2.setVisibility(i10);
            this.f42428y1.getFadeView().setAlpha(f7);
            View fadeView = this.f42428y1.getFadeView();
            if (i13 > 0) {
                i12 = 0;
            }
            fadeView.setVisibility(i12);
        }
    }

    public final void s4() {
        boolean z10;
        float f7 = 0.0f;
        if (this.N != 0.0f && !(z10 = this.K)) {
            if (z10) {
                f7 = -R3();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.G3, f7));
            animatorSet.setInterpolator(org.telegram.ui.Components.es.f24771f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        px pxVar = this.E0;
        if (pxVar != null) {
            if (this.G0 && !z10) {
                pxVar.setVisibility(0);
            } else {
                pxVar.setVisibility(8);
            }
        }
        V4(true);
        R4();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r6, int r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    @Override
    public final void t() {
        u4(true, true);
    }

    public final void t3() {
        if (this.actionBar == null) {
            return;
        }
        org.telegram.ui.Components.l20.d(this.actionBar.getBackButton(), Math.max(this.f42404t3, (1.0f - this.f42308b.e) * (1.0f - S3()) * (1.0f - this.f42314c.e)));
    }

    public final void t4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.t4(int):void");
    }

    public final void u3() {
        float f7;
        if (this.f42346i0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.l20.d(this.f42336g0, com.google.android.gms.internal.play_billing.k3.C(f7, 1.0f - this.f42308b.e, 1.0f - S3(), 1.0f - this.f42314c.e));
    }

    public final void u4(boolean z10, boolean z11) {
        int i10;
        int i11;
        sx sxVar = this.F3;
        if (sxVar != null && sxVar.c()) {
            return;
        }
        if (this.f42325e0[0].f41986s == 0 && W3() && this.f42325e0[0].v == 2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.K && !z11 && !this.E0.g()) {
            i11 = -AndroidUtilities.dp(81.0f);
        } else {
            i11 = 0;
        }
        if (z10) {
            org.telegram.ui.Components.pl0 pl0Var = this.f42325e0[0].f41985r;
            pl0Var.f28360b = 1;
            pl0Var.c(i10, i11, false, false);
            s4();
            return;
        }
        this.f42325e0[0].f41982c.h1(i10, i11);
        s4();
    }

    public final void v3() {
        float f7;
        if (SharedConfig.passcodeHash.isEmpty()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.l20.d(this.f42331f0, com.google.android.gms.internal.play_billing.k3.C(f7, 1.0f - this.f42308b.e, 1.0f - S3(), 1.0f - this.f42314c.e));
    }

    public final void v4(String str, boolean z10) {
        L4(true, false, true, false);
        oy oyVar = this.X;
        if (oyVar != null) {
            oyVar.f27815r.setText(str);
            this.X.f27815r.setSelection(str.length());
        }
    }

    public final void w3() {
        float f7;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.l20.d(this.f42351j0, com.google.android.gms.internal.play_billing.k3.C(f7, this.f42330f.e, 1.0f - S3(), 1.0f - this.f42314c.e));
        px pxVar = this.E0;
        if (pxVar != null) {
            pxVar.invalidate();
        }
    }

    public final void w4(float f7) {
        xy[] xyVarArr;
        this.f42315c0 = f7;
        for (xy xyVar : this.f42325e0) {
            uy uyVar = xyVar.f41980a;
            for (int i10 = 0; i10 < uyVar.getChildCount(); i10++) {
                View childAt = uyVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= xyVar.d.f10662f + 1) {
                    childAt.setAlpha(f7);
                }
            }
        }
    }

    public final void x3() {
        org.telegram.ui.Components.l20.d(this.f42361l0, com.google.android.gms.internal.play_billing.k3.C(this.f42308b.e, 1.0f - S3(), 1.0f - this.f42314c.e, this.d.e));
    }

    public final void x4(boolean z10, boolean z11) {
        if (this.f42325e0 != null && this.S1 != z10) {
            if (z10) {
                this.R1 = new ArrayList(O3(this.currentAccount, this.f42325e0[0].f41986s, this.V2, false));
            } else {
                this.R1 = null;
            }
            this.S1 = z10;
            xy xyVar = this.f42325e0[0];
            xyVar.d.G = z10;
            if (!z10 && z11) {
                if (xyVar.f41980a.b0()) {
                    this.f42325e0[0].f41980a.post(new nw(this, 9));
                } else {
                    this.f42325e0[0].d.l();
                }
            }
        }
    }

    public final void y3() {
        boolean z10;
        di.ab abVar;
        if (!this.f42353j2 && ((abVar = this.K0) == null || abVar.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        hh0 hh0Var = this.I3;
        if (hh0Var != null) {
            hh0Var.f36821a.v.a(z10, true);
        }
    }

    public final void y4(boolean z10) {
        xy xyVar;
        if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
            if (z10) {
                xy[] xyVarArr = this.f42325e0;
                if (xyVarArr != null && (xyVar = xyVarArr[0]) != null) {
                    xyVar.setLayerType(2, null);
                    this.f42325e0[0].setClipChildren(false);
                    this.f42325e0[0].setClipToPadding(false);
                    this.f42325e0[0].f41980a.setClipChildren(false);
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
            if (this.f42325e0 != null) {
                int i10 = 0;
                while (true) {
                    xy[] xyVarArr2 = this.f42325e0;
                    if (i10 >= xyVarArr2.length) {
                        break;
                    }
                    xy xyVar2 = xyVarArr2[i10];
                    if (xyVar2 != null) {
                        xyVar2.setLayerType(0, null);
                        xyVar2.setClipChildren(true);
                        xyVar2.setClipToPadding(true);
                        xyVar2.f41980a.setClipChildren(true);
                    }
                    i10++;
                }
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setLayerType(0, null);
            }
            px pxVar = this.E0;
            if (pxVar != null) {
                pxVar.setLayerType(0, null);
            }
            View view2 = this.fragmentView;
            if (view2 != null) {
                ((ViewGroup) view2).setClipChildren(true);
                this.fragmentView.requestLayout();
            }
        }
    }

    @Override
    public final gh.d z() {
        return this.f42367m4;
    }

    public final void z3() {
        t3();
        org.telegram.ui.Components.l20.d(this.f42356k0, (1.0f - this.f42308b.e) * (1.0f - S3()) * (1.0f - this.f42314c.e));
        u3();
        x3();
        v3();
        w3();
    }

    public final void z4(float f7) {
        xy[] xyVarArr = this.f42325e0;
        int i10 = 0;
        if (xyVarArr != null) {
            int paddingTop = xyVarArr[0].f41980a.getPaddingTop() + ((int) f7);
            int i11 = 0;
            while (true) {
                xy[] xyVarArr2 = this.f42325e0;
                if (i11 >= xyVarArr2.length) {
                    break;
                }
                xyVarArr2[i11].f41980a.setTopGlowOffset(paddingTop);
                i11++;
            }
        }
        if (this.fragmentView != null && f7 != this.N) {
            this.N = f7;
            org.telegram.ui.Components.sc scVar = this.f42372n3;
            if (scVar != null) {
                scVar.l();
            }
            if (this.E3 != null) {
                float currentActionBarHeight = 1.0f - ((-f7) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                org.telegram.ui.Cells.o oVar = this.E3;
                float f10 = (int) f7;
                float f11 = oVar.f21601f;
                oVar.h = f10;
                oVar.setTranslationY(f11 + f10);
                this.E3.setAlpha(w7.s.a(currentActionBarHeight, 0.0f, 1.0f));
                org.telegram.ui.Cells.o oVar2 = this.E3;
                if (currentActionBarHeight <= 0.0f) {
                    i10 = 4;
                }
                oVar2.setVisibility(i10);
            }
            B3();
            this.fragmentView.invalidate();
        }
    }
}
