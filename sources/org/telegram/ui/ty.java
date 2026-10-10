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
public class ty extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, mg.b, me.d, eh0 {
    public static boolean f42191w4;
    public static final boolean[] f42192x4 = new boolean[4];
    public static final org.telegram.ui.Components.os0 f42193y4 = new org.telegram.ui.Components.os0(3);
    public static float f42194z4;
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public dx B1;
    public boolean B2;
    public Long B3;
    public dy C0;
    public ii.z1 C1;
    public ny C2;
    public Drawable C3;
    public org.telegram.ui.Components.uv0 D0;
    public org.telegram.ui.ActionBar.v0 D1;
    public ArrayList D2;
    public org.telegram.ui.Components.q5 D3;
    public boolean E;
    public kx E0;
    public final TextPaint E1;
    public String E2;
    public org.telegram.ui.Cells.o E3;
    public boolean F;
    public org.telegram.ui.Components.zs F0;
    public cx F1;
    public CharSequence F2;
    public nx F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public FrameLayout G1;
    public org.telegram.ui.Components.sr0 G2;
    public final bx G3;
    public long H;
    public float H0;
    public cx H1;
    public org.telegram.ui.Components.fa1 H2;
    public final bx H3;
    public ValueAnimator I;
    public float I0;
    public FrameLayout I1;
    public final ArrayList I2;
    public ch0 I3;
    public ValueAnimator J;
    public float J0;
    public org.telegram.ui.Components.bt J1;
    public boolean J2;
    public NotificationCenter.ObserversGroup J3;
    public boolean K;
    public ci.bb K0;
    public org.telegram.ui.Components.at K1;
    public int K2;
    public Drawable K3;
    public boolean L;
    public org.telegram.ui.Components.q80 L0;
    public org.telegram.ui.Cells.m L1;
    public int L2;
    public int L3;
    public boolean M;
    public px M0;
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
    public gi.j Q1;
    public int Q2;
    public av Q3;
    public boolean R;
    public int R0;
    public ArrayList R1;
    public int R2;
    public String R3;
    public org.telegram.ui.Components.tc S;
    public int S0;
    public boolean S1;
    public int S2;
    public ArrayList S3;
    public float T;
    public int T0;
    public org.telegram.ui.ActionBar.b2 T1;
    public int T2;
    public boolean T3;
    public boolean U;
    public boolean U0;
    public boolean U1;
    public boolean U2;
    public CharSequence U3;
    public boolean V;
    public org.telegram.ui.Components.ce0 V0;
    public boolean V1;
    public int V2;
    public boolean V3;
    public boolean W;
    public org.telegram.ui.Cells.s2 W0;
    public long W1;
    public ty W2;
    public float W3;
    public jy X;
    public org.telegram.ui.Cells.s2 X0;
    public TLObject X1;
    public long X2;
    public boolean X3;
    public yf.g0 Y;
    public boolean Y0;
    public int Y1;
    public TLRPC.Chat Y2;
    public boolean Y3;
    public v41 Z;
    public boolean Z0;
    public int Z1;
    public TLRPC.ChatFull Z2;
    public ValueAnimator Z3;
    public final int f42195a;
    public org.telegram.ui.Components.o91 f42196a0;
    public final ArrayList f42197a1;
    public boolean a2;
    public org.telegram.ui.Components.y9 f42198a3;
    public org.telegram.ui.Components.n50 f42199a4;
    public final me.b f42200b;
    public gg.r0 f42201b0;
    public boolean f42202b1;
    public boolean f42203b2;
    public org.telegram.ui.Components.j9 f42204b3;
    public TLRPC.FileLocation f42205b4;
    public final me.b f42206c;
    public float f42207c0;
    public boolean f42208c1;
    public boolean f42209c2;
    public long f42210c3;
    public TLRPC.FileLocation f42211c4;
    public final me.b d;
    public ValueAnimator f42212d0;
    public boolean f42213d1;
    public int f42214d2;
    public boolean f42215d3;
    public org.telegram.ui.Components.tc f42216d4;
    public final me.b f42217e;
    public sy[] f42218e0;
    public org.telegram.ui.ActionBar.g2 f42219e1;
    public boolean f42220e2;
    public boolean f42221e3;
    public int f42222e4;
    public final me.b f42223f;
    public org.telegram.ui.ActionBar.v0 f42224f0;
    public final Paint f42225f1;
    public String f42226f2;
    public AnimatorSet f42227f3;
    public int f42228f4;
    public org.telegram.ui.ActionBar.v0 f42229g0;
    public ImageView f42230g1;
    public String f42231g2;
    public boolean f42232g3;
    public int f42233g4;
    public final me.b h;
    public vy f42234h0;
    public NumberTextView f42235h1;
    public String f42236h2;
    public boolean f42237h3;
    public int f42238h4;
    public boolean f42239i0;
    public final ArrayList f42240i1;
    public boolean f42241i2;
    public float f42242i3;
    public int f42243i4;
    public org.telegram.ui.ActionBar.v0 f42244j0;
    public org.telegram.ui.ActionBar.v0 f42245j1;
    public boolean f42246j2;
    public boolean j3;
    public hh.j f42247j4;
    public org.telegram.ui.ActionBar.v0 f42248k0;
    public org.telegram.ui.ActionBar.v0 f42249k1;
    public boolean f42250k2;
    public int f42251k3;
    public final ah.h f42252k4;
    public org.telegram.ui.ActionBar.v0 f42253l0;
    public org.telegram.ui.ActionBar.v0 l1;
    public boolean f42254l2;
    public boolean f42255l3;
    public final fh.d l4;
    public org.telegram.ui.ActionBar.v0 m0;
    public org.telegram.ui.ActionBar.v0 f42256m1;
    public boolean f42257m2;
    public boolean f42258m3;
    public final fh.d f42259m4;
    public final me.b f42260n;
    public org.telegram.ui.Components.lj0 f42261n0;
    public org.telegram.ui.ActionBar.f1 f42262n1;
    public String f42263n2;
    public org.telegram.ui.Components.tc f42264n3;
    public final fh.c f42265n4;
    public org.telegram.ui.ActionBar.f1 f42266o0;
    public org.telegram.ui.ActionBar.f1 f42267o1;
    public String f42268o2;
    public final AnimationNotificationsLocker f42269o3;
    public final ah.c f42270o4;
    public ci.d4 f42271p0;
    public org.telegram.ui.ActionBar.f1 f42272p1;
    public final MessagesStorage.TopicKey f42273p2;
    public boolean f42274p3;
    public final ah.c f42275p4;
    public ci.d4 f42276q0;
    public org.telegram.ui.ActionBar.f1 f42277q1;
    public boolean f42278q2;
    public boolean f42279q3;
    public final ah.c f42280q4;
    public final me.b f42281r;
    public boolean f42282r0;
    public org.telegram.ui.ActionBar.f1 f42283r1;
    public boolean f42284r2;
    public boolean f42285r3;
    public final ah.c f42286r4;
    public final me.b f42287s;
    public boolean f42288s0;
    public org.telegram.ui.ActionBar.f1 f42289s1;
    public boolean f42290s2;
    public boolean f42291s3;
    public iw f42292s4;
    public org.telegram.ui.Components.q20 f42293t0;
    public org.telegram.ui.ActionBar.f1 f42294t1;
    public boolean f42295t2;
    public float f42296t3;
    public final ArrayList f42297t4;
    public org.telegram.ui.Components.q20 f42298u0;
    public float f42299u1;
    public boolean f42300u2;
    public ValueAnimator f42301u3;
    public final RectF f42302u4;
    public final ph.i v;
    public ci.d f42303v0;
    public float f42304v1;
    public boolean f42305v2;
    public float f42306v3;
    public final RectF f42307v4;
    public boolean f42308w;
    public jh.f f42309w0;
    public AnimatorSet f42310w1;
    public boolean f42311w2;
    public float f42312w3;
    public int f42313x;
    public int f42314x0;
    public float f42315x1;
    public boolean f42316x2;
    public float f42317x3;
    public boolean f42318y;
    public final UndoView[] f42319y0;
    public hh.f f42320y1;
    public boolean f42321y2;
    public int y3;
    public qw f42322z0;
    public FrameLayout f42323z1;
    public boolean f42324z2;
    public boolean f42325z3;

    public ty(Bundle bundle) {
        super(bundle);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f42195a = i10;
        org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.h;
        this.f42200b = new me.b(1, this, isVar, 350L, false);
        this.f42206c = new me.b(2, this, isVar, 350L, false);
        this.d = new me.b(3, this, isVar, 350L, false);
        this.f42217e = new me.b(4, this, isVar, 350L, false);
        this.f42223f = new me.b(5, this, isVar, 350L, false);
        this.h = new me.b(6, this, isVar, 350L, false);
        this.f42260n = new me.b(7, this, isVar, 350L, false);
        this.f42281r = new me.b(8, this, isVar, 350L, false);
        this.f42287s = new me.b(9, this, isVar, 350L, false);
        this.v = new ph.i(new hw(this, 2));
        this.f42313x = -1;
        this.F = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.Q = true;
        this.f42207c0 = 1.0f;
        this.f42319y0 = new UndoView[2];
        this.f42197a1 = new ArrayList();
        this.f42225f1 = new Paint();
        this.f42240i1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.E1 = new TextPaint(1);
        this.U1 = true;
        this.f42209c2 = true;
        this.f42241i2 = true;
        this.f42273p2 = new MessagesStorage.TopicKey();
        this.I2 = new ArrayList();
        this.J2 = true;
        this.f42269o3 = new AnimationNotificationsLocker();
        this.y3 = -1;
        this.G3 = new bx(this, 0);
        this.H3 = new bx(this, 1);
        this.L3 = -4;
        this.M3 = true;
        this.N3 = true;
        this.W3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f42297t4 = arrayList;
        RectF rectF = new RectF();
        this.f42302u4 = rectF;
        RectF rectF2 = new RectF();
        this.f42307v4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        fh.c cVar = new fh.c();
        this.f42265n4 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.i6.f20801d6));
        if (i11 >= 31) {
            this.f42252k4 = new ah.h(false);
            fh.d dVar = new fh.d(null);
            this.l4 = dVar;
            dVar.j(new yx(this, 0));
            fh.d dVar2 = new fh.d(null);
            this.f42259m4 = dVar2;
            dVar2.j(new yx(this, 3));
            ah.c cVar2 = new ah.c(dVar);
            this.f42270o4 = cVar2;
            cVar2.f547i = LiteMode.isEnabled(262144);
            ah.c cVar3 = new ah.c(dVar2);
            this.f42280q4 = cVar3;
            cVar3.f547i = LiteMode.isEnabled(262144);
            this.f42275p4 = new ah.c(dVar);
        } else {
            this.f42252k4 = null;
            this.l4 = null;
            this.f42259m4 = null;
            this.f42270o4 = new ah.c(cVar);
            this.f42280q4 = new ah.c(cVar);
            this.f42275p4 = new ah.c(cVar);
        }
        this.f42286r4 = new ah.c(cVar);
    }

    public static void B0(ty tyVar, float f7, ValueAnimator valueAnimator) {
        tyVar.f42218e0[0].setTranslationY((1.0f - tyVar.f42296t3) * f7);
        tyVar.f42296t3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < tyVar.actionBar.getChildCount(); i10++) {
            if (tyVar.actionBar.getChildAt(i10).getVisibility() == 0 && tyVar.actionBar.getChildAt(i10) != tyVar.actionBar.getActionMode() && tyVar.actionBar.getChildAt(i10) != tyVar.actionBar.getBackButton()) {
                tyVar.actionBar.getChildAt(i10).setAlpha(1.0f - tyVar.f42296t3);
            }
        }
        tyVar.B3();
        tyVar.t3();
        View view = tyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void C0(ty tyVar) {
        org.telegram.ui.Components.bc bcVar = new org.telegram.ui.Components.bc(tyVar.getParentActivity(), tyVar.resourceProvider);
        bcVar.d(R.raw.email_check_inbox, new String[0]);
        bcVar.f24917b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.tc.g(tyVar, bcVar, 2750).j();
        try {
            tyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void D0(org.telegram.ui.ty r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.D0(org.telegram.ui.ty):void");
    }

    public static void E0(ty tyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() == 1) {
            xh.r1 r1Var = new xh.r1(tyVar.getParentActivity(), tyVar.currentAccount, birthdayState.today.get(0).f20189id, null, null);
            r1Var.W(true);
            tyVar.showDialog(r1Var);
            return;
        }
        tg.m1.f0(0, birthdayState);
    }

    public static void F0(ty tyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.tc M = org.telegram.ui.Components.ad.a0(tyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
            M.f31096j = 5000;
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
            tyVar.getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (tyVar.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tyVar.getParentActivity(), 0, tyVar.resourceProvider);
                alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                tyVar.showDialog(alertDialog$Builder.f20378a);
                return;
            }
            return;
        }
        org.telegram.messenger.q.q(R.string.UnknownError, org.telegram.ui.Components.ad.a0(tyVar), R.raw.error, 36);
    }

    public static void G0(ty tyVar) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        tyVar.R4();
    }

    public static void K2(ty tyVar, float f7) {
        float f10;
        float f11;
        int i10;
        int i11;
        float clamp = Utilities.clamp(tyVar.f42315x1 * 2.0f, 1.0f, 0.0f);
        kx kxVar = tyVar.E0;
        float f12 = (1.0f - tyVar.f42296t3) * f7 * tyVar.H0;
        float f13 = 1.0f - clamp;
        kxVar.setAlpha(f12 * f13);
        int i12 = 0;
        if (!tyVar.K && !tyVar.M) {
            if (tyVar.L) {
                tyVar.E0.setTranslationY((Math.max(tyVar.N, -tyVar.R3()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                tyVar.E0.setProgressToCollapse(1.0f);
                kx kxVar2 = tyVar.E0;
                kxVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - kxVar2.getY()));
            }
            f10 = 1.0f - tyVar.H0;
            tyVar.actionBar.setTranslationY(0.0f);
        } else {
            float clamp2 = Utilities.clamp((-tyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (tyVar.f42296t3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            tyVar.E0.setClipTop(0);
            if (!tyVar.K && tyVar.M) {
                tyVar.E0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                tyVar.E0.setProgressToCollapse(1.0f);
                f11 = tyVar.H0;
            } else {
                tyVar.E0.setTranslationY(((tyVar.T / 2.0f) + (Math.max(tyVar.N, -tyVar.R3()) + tyVar.f42306v3)) - AndroidUtilities.dp(8.0f));
                tyVar.E0.l(clamp2, !tyVar.F3.c());
                if (!tyVar.M) {
                    f11 = tyVar.H0;
                } else {
                    f10 = 1.0f - clamp3;
                    tyVar.actionBar.setTranslationY(0.0f);
                }
            }
            f10 = 1.0f - f11;
            tyVar.actionBar.setTranslationY(0.0f);
        }
        float f14 = f10 * f13;
        if (f14 != 1.0f) {
            tyVar.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
            tyVar.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
            float f15 = (0.6f * f14) + 0.4f;
            tyVar.actionBar.getTitlesContainer().setScaleY(f15);
            tyVar.actionBar.getTitlesContainer().setScaleX(f15);
            tyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            tyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
            tyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f15);
            tyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f15);
            float f16 = (1.0f - tyVar.f42296t3) * f14;
            tyVar.actionBar.getTitlesContainer().setAlpha(f16);
            FrameLayout titlesContainer = tyVar.actionBar.getTitlesContainer();
            int i13 = (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            titlesContainer.setVisibility(i11);
            tyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f16);
            FrameLayout additionalSubTitleOverlayContainer = tyVar.actionBar.getAdditionalSubTitleOverlayContainer();
            if (i13 <= 0) {
                i12 = 4;
            }
            additionalSubTitleOverlayContainer.setVisibility(i12);
            return;
        }
        tyVar.actionBar.getTitlesContainer().setScaleY(1.0f);
        tyVar.actionBar.getTitlesContainer().setScaleX(1.0f);
        tyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
        tyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
        float f17 = 1.0f - tyVar.f42296t3;
        tyVar.actionBar.getTitlesContainer().setAlpha(f17);
        FrameLayout titlesContainer2 = tyVar.actionBar.getTitlesContainer();
        int i14 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
        if (i14 > 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        titlesContainer2.setVisibility(i10);
        tyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
        FrameLayout additionalSubTitleOverlayContainer2 = tyVar.actionBar.getAdditionalSubTitleOverlayContainer();
        if (i14 <= 0) {
            i12 = 4;
        }
        additionalSubTitleOverlayContainer2.setVisibility(i12);
    }

    public static void L2(ty tyVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        if (tyVar.parentLayout != null && tyVar.actionBar != null) {
            float max = Math.max(tyVar.f42217e.f16341e, tyVar.S3());
            float f7 = 1.0f;
            float f10 = 1.0f - tyVar.f42315x1;
            float f11 = max * f10 * f10;
            int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            if (i11 != 0) {
                if (-1 >= i10) {
                    f7 = 0.0f;
                    i10 = -1;
                }
                if (f7 > 0.0f && i11 > 0 && i10 > 0 && (d5Var = tyVar.parentLayout) != null) {
                    ((ActionBarLayout) d5Var).p(canvas, (int) (f7 * 255.0f * f11), i10);
                }
            }
        }
    }

    public static org.telegram.ui.Cells.s2 N3(sy syVar) {
        py pyVar = syVar.f41834a;
        for (int i10 = 0; i10 < pyVar.getChildCount(); i10++) {
            View childAt = pyVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s2) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt;
                if (s2Var.P()) {
                    return s2Var;
                }
            }
        }
        return null;
    }

    public static void U(ty tyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        tyVar.R4();
    }

    public static void V(ty tyVar, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        tyVar.f42296t3 = floatValue;
        tyVar.f42218e0[0].setTranslationY((-f7) * floatValue);
        for (int i10 = 0; i10 < tyVar.actionBar.getChildCount(); i10++) {
            if (tyVar.actionBar.getChildAt(i10).getVisibility() == 0 && tyVar.actionBar.getChildAt(i10) != tyVar.actionBar.getActionMode() && tyVar.actionBar.getChildAt(i10) != tyVar.actionBar.getBackButton()) {
                tyVar.actionBar.getChildAt(i10).setAlpha(1.0f - tyVar.f42296t3);
            }
        }
        View view = tyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        tyVar.B3();
        tyVar.t3();
    }

    public static void W(ty tyVar) {
        ArrayList arrayList = tyVar.I2;
        org.telegram.ui.ActionBar.d5 d5Var = tyVar.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).y()) {
            tyVar.finishPreviewFragment();
        } else if (tyVar.R0 == 10) {
            if (tyVar.C2 != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i10)).longValue(), 0L));
                }
                tyVar.C2.w(tyVar, arrayList2, null, false, tyVar.J2, tyVar.K2, tyVar.L2, null);
            }
        } else if (MessagesController.getInstance(tyVar.currentAccount).isFrozen()) {
            b.b(tyVar.currentAccount);
        } else {
            tyVar.presentFragment(new ContactsActivity(a1.g.i("destroyAfterSelect", true)));
        }
    }

    public static void X(ty tyVar) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        tyVar.R4();
    }

    public static void Y(ty tyVar) {
        PasskeysActivity.a0(tyVar.currentAccount, tyVar.getParentActivity(), tyVar.resourceProvider, true);
    }

    public static void Z(ty tyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(tyVar.currentAccount).getClientUserId());
        tyVar.presentFragment(new zn(bundle));
    }

    public static void a0(ty tyVar, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = tyVar.getMessagesController().getUserFull(tyVar.getUserConfig().getClientUserId());
        if (userFull != null) {
            tL_birthday2 = userFull.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        tyVar.getMessagesController().invalidateContentSettings();
        tyVar.getConnectionsManager().sendRequest(updatebirthday, new ba(tyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        tyVar.R4();
    }

    public static void a4(zn znVar, MessageObject messageObject) {
        CharSequence charSequence;
        if (messageObject != null && messageObject.hasHighlightedWords()) {
            try {
                if (!TextUtils.isEmpty(messageObject.caption)) {
                    charSequence = messageObject.caption;
                } else {
                    charSequence = messageObject.messageText;
                }
                CharSequence highlightText = AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (org.telegram.ui.ActionBar.e6) null);
                if (highlightText instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) highlightText;
                    org.telegram.ui.Components.v10[] v10VarArr = (org.telegram.ui.Components.v10[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.v10.class);
                    if (v10VarArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(v10VarArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(v10VarArr[0]);
                        for (int i10 = 1; i10 < v10VarArr.length; i10++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(v10VarArr[i10]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(v10VarArr[i10]);
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
                        znVar.qb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                    }
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public static void b0(ty tyVar, String str) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, str);
        tyVar.R4();
    }

    public static void c0(ty tyVar, sy syVar, View view, int i10) {
        int i11;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.v3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.s2;
        if (z10) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
            if (s2Var.f22834n2) {
                tyVar.K4(s2Var.getDialogId(), view);
                return;
            }
        }
        if (tyVar.F3()) {
            tyVar.l4(view, i10, 0.0f, syVar.d);
            return;
        }
        int i12 = tyVar.R0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.r8)) {
            syVar.d.K();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle i14 = a1.g.i("forImport", true);
            i14.putLongArray("result", new long[]{tyVar.getUserConfig().getClientUserId()});
            i14.putInt("chatType", 4);
            String string = tyVar.arguments.getString("importTitle");
            if (string != null) {
                i14.putString("title", string);
            }
            j70 j70Var = new j70(i14);
            j70Var.Y = new xw(tyVar);
            tyVar.presentFragment(j70Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.a3) && ((i11 = syVar.f41841s) == 7 || i11 == 8)) {
            gg.k kVar = (gg.k) syVar.d.M.get(0);
            if (kVar != null && kVar.f17129a == 17) {
                tL_chatlists_chatlistUpdates = kVar.f10704i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = tyVar.getMessagesController().selectedDialogFilter[syVar.f41841s - 7];
                if (dialogFilter != null) {
                    int i15 = dialogFilter.f17256id;
                    ?? ebVar = new org.telegram.ui.Components.eb(tyVar, false);
                    ebVar.Y = -1;
                    ebVar.f30917c0 = "";
                    ebVar.f30918d0 = new ArrayList();
                    ebVar.f30920f0 = "";
                    ebVar.f30922h0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    ebVar.f30923i0 = arrayList;
                    ebVar.f30939z0 = -1;
                    ebVar.C0 = -5;
                    ebVar.Y = i15;
                    ebVar.f30915a0 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    ebVar.f30921g0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = tyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i13).f17256id == i15) {
                                ebVar.f30917c0 = arrayList2.get(i13).name;
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    ebVar.T();
                    tyVar.showDialog(ebVar);
                    return;
                }
                return;
            }
        } else if (z10 && !tyVar.actionBar.t() && !tyVar.F3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.s2) view).Y1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        tyVar.k4(view, i10, syVar.d);
    }

    public static void c1(ty tyVar, boolean z10) {
        if (tyVar.f42218e0 != null && tyVar.M3 != z10) {
            tyVar.M3 = z10;
            int i10 = 0;
            while (true) {
                sy[] syVarArr = tyVar.f42218e0;
                if (i10 < syVarArr.length) {
                    if (z10) {
                        syVarArr[i10].f41834a.setScrollbarFadingEnabled(false);
                    }
                    tyVar.f42218e0[i10].f41834a.setVerticalScrollBarEnabled(z10);
                    if (z10) {
                        tyVar.f42218e0[i10].f41834a.setScrollbarFadingEnabled(true);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public static void d0(ty tyVar) {
        tyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(tyVar.parentLayout, "newChatsRow");
    }

    public static void e0(ty tyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(tyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(tyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new ba(tyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void f0(ty tyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(launchActivity, tyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(tyVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void f4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = f42192x4;
        if (!zArr[currentAccount]) {
            MessagesController messagesController = accountInstance.getMessagesController();
            messagesController.loadGlobalNotificationsSettings();
            messagesController.loadDialogs(0, 0, 100, true);
            messagesController.loadHintDialogs();
            messagesController.loadUserInfo(accountInstance.getUserConfig().getCurrentUser(), false, 0);
            accountInstance.getContactsController().checkInviteText();
            accountInstance.getMediaDataController().checkAllMedia(false);
            AndroidUtilities.runOnUIThread(new cj(accountInstance, 19), 200L);
            Iterator<String> it = messagesController.diceEmojies.iterator();
            while (it.hasNext()) {
                accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
            }
            zArr[currentAccount] = true;
        }
    }

    public static void h0(ty tyVar) {
        if (tyVar.f42199a4.g()) {
            MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            tyVar.R4();
        }
    }

    public static void j0(ty tyVar) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        tyVar.R4();
    }

    public static void k0(ty tyVar) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        tyVar.R4();
    }

    public static void l0(ty tyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ai.j jVar;
        try {
            b2Var.dismiss();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (tLObject != null) {
            tyVar.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            ai.j jVar2 = new ai.j(tyVar, j3, 25);
            Pattern pattern = org.telegram.ui.Components.g5.f26609a;
            if (tyVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = tyVar.getCurrentAccount();
                    Activity parentActivity = tyVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
                    TextView textView = new TextView(parentActivity);
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20909j5, false));
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
                    org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
                    j9Var.u(AndroidUtilities.dp(12.0f));
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(parentActivity);
                    y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    frameLayout.addView(y9Var, w7.x5.a(40.0f, 22.0f, 5.0f, 22.0f, 0.0f, 40, i11 | 48));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E8, false));
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
                    frameLayout.addView(textView2, w7.x5.a(-2.0f, f7, 11.0f, i15, 0.0f, -1, i17));
                    if (!LocaleController.isRTL) {
                        i16 = 3;
                    }
                    frameLayout.addView(textView, w7.x5.a(-2.0f, 24.0f, 57.0f, 24.0f, 9.0f, -2, i16 | 48));
                    if (user != null) {
                        if (UserObject.isReplyUser(user)) {
                            j9Var.f27608p = 0.8f;
                            j9Var.g(12);
                            y9Var.h(null, null, j9Var, user);
                            jVar = jVar2;
                        } else {
                            jVar = jVar2;
                            if (user.f20189id == clientUserId) {
                                j9Var.f27608p = 0.8f;
                                j9Var.g(1);
                                y9Var.h(null, null, j9Var, user);
                            } else {
                                j9Var.f27608p = 1.0f;
                                j9Var.m(currentAccount, user);
                                y9Var.e(user, j9Var);
                            }
                        }
                    } else {
                        jVar = jVar2;
                        j9Var.k(currentAccount, chat);
                        y9Var.e(chat, j9Var);
                    }
                    textView.setText(AndroidUtilities.replaceTags(str));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Import), new org.telegram.ui.Components.s(jVar, 3));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    tyVar.showDialog(alertDialog$Builder.f20378a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.g5.e0(tyVar.currentAccount, tL_error, tyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        tyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j3), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public static void m0(ty tyVar, int i10) {
        Object obj;
        TLRPC.User user;
        org.telegram.ui.Components.so0 so0Var = tyVar.C0.f26139o0;
        if (i10 >= so0Var.X && i10 < so0Var.Y) {
            org.telegram.ui.Components.q61 G = so0Var.G(i10);
            if (G != null) {
                obj = G.G;
            } else {
                obj = null;
            }
        } else {
            obj = Boolean.FALSE;
        }
        if (obj instanceof TLRPC.User) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tyVar.getParentActivity(), 0, tyVar.resourceProvider);
            String string = LocaleController.getString(R.string.AppsClearSearch);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
            b2Var.R = string;
            b2Var.T = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.y2(27, tyVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        }
    }

    public static void n0(ty tyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        HashSet hashSet2;
        if (i10 == 102) {
            tyVar.getMessagesController().setDialogsInTransaction(true);
            if (z10) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            tyVar.o4(arrayList, i10, false, false, hashSet2);
            tyVar.getMessagesController().setDialogsInTransaction(false);
            tyVar.getMessagesController().checkIfFolderEmpty(tyVar.V2);
            int i11 = tyVar.V2;
            if (i11 != 0 && tyVar.O3(tyVar.currentAccount, tyVar.f42218e0[0].f41841s, i11, false).size() == 0) {
                tyVar.f42218e0[0].f41834a.setEmptyView(null);
                tyVar.f42218e0[0].f41842w.setVisibility(4);
                tyVar.finishFragment();
                return;
            }
            return;
        }
        tyVar.o4(arrayList, i10, false, false, null);
    }

    public static void n1(ty tyVar, sy syVar, float f7) {
        if (tyVar.T != f7) {
            tyVar.T = f7;
            int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            int i11 = 0;
            if (i10 == 0) {
                tyVar.U = false;
            }
            tyVar.E0.setOverscroll(f7);
            syVar.f41834a.setViewsOffset(f7);
            py pyVar = syVar.f41834a;
            if (i10 != 0) {
                i11 = 2;
            }
            pyVar.setOverScrollMode(i11);
            tyVar.fragmentView.invalidate();
            if (f7 > AndroidUtilities.dp(90.0f) && !tyVar.U) {
                kx kxVar = tyVar.E0;
                ValueAnimator valueAnimator = kxVar.H0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    kxVar.i(kxVar.f680p0, true);
                    tyVar.U = true;
                    tyVar.getOrCreateStoryViewer().s(new ov(tyVar, 19));
                }
            }
        }
    }

    public static boolean o1(ty tyVar, sy syVar) {
        if (!tyVar.F3.c()) {
            int i10 = (int) (-tyVar.N);
            int Q3 = tyVar.Q3();
            int R3 = tyVar.R3();
            if (i10 != 0 && i10 != Q3 && i10 != R3 && syVar.f41834a.canScrollVertically(-1)) {
                if (R3 < i10 && i10 < Q3) {
                    int dp = AndroidUtilities.dp(48.0f);
                    int i11 = i10 - R3;
                    if (i11 < dp / 2) {
                        syVar.f41835b.x(-i11);
                        return true;
                    }
                    syVar.f41835b.x(dp - i11);
                    return true;
                }
                float f7 = 1.0f;
                if (tyVar.f42296t3 != 1.0f) {
                    f7 = Utilities.clamp((-tyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
                }
                if (f7 < tyVar.E0.B0) {
                    syVar.f41835b.x(-i10);
                    return true;
                }
                syVar.f41835b.x(R3 - i10);
                return true;
            }
            return false;
        }
        return false;
    }

    public static void p0(ty tyVar, int i10, org.telegram.ui.Components.q80 q80Var) {
        CharSequence charSequence;
        if (tyVar.currentAccount != i10) {
            q80Var.u();
            if (tyVar.getParentActivity() == null) {
                return;
            }
            ny nyVar = tyVar.C2;
            LaunchActivity launchActivity = (LaunchActivity) tyVar.getParentActivity();
            ArrayList arrayList = tyVar.D2;
            String str = tyVar.E2;
            CharSequence charSequence2 = tyVar.F2;
            dx dxVar = tyVar.B1;
            if (dxVar != null) {
                charSequence = dxVar.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.K0(i10);
            ty tyVar2 = new ty(tyVar.arguments);
            tyVar2.C2 = nyVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    tyVar2.D2 = null;
                } else {
                    tyVar2.D2 = arrayList;
                    tyVar2.E2 = null;
                    if (tyVar2.B1 != null) {
                        tyVar2.i3(charSequence);
                    } else {
                        tyVar2.U3 = charSequence;
                    }
                }
            } else if (str != null) {
                tyVar2.B4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    tyVar2.F2 = null;
                } else {
                    tyVar2.F2 = charSequence2;
                    tyVar2.E2 = null;
                    tyVar2.D2 = null;
                    if (tyVar2.B1 != null) {
                        tyVar2.i3(charSequence);
                    } else {
                        tyVar2.U3 = charSequence;
                    }
                }
            }
            launchActivity.q0(tyVar2, false, true);
        }
    }

    public static String p2(ty tyVar) {
        String shortName;
        ArrayList arrayList = tyVar.I2;
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
                if (longValue == tyVar.getUserConfig().getClientUserId()) {
                    sb2.append(LocaleController.getString(R.string.SavedMessages));
                } else {
                    if (arrayList.size() == 1) {
                        shortName = DialogObject.getName(tyVar.currentAccount, longValue);
                    } else {
                        shortName = DialogObject.getShortName(tyVar.currentAccount, longValue);
                    }
                    sb2.append(shortName);
                }
            }
            return LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        }
        return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
    }

    public static void q0(ty tyVar) {
        String str;
        MessagesController messagesController = MessagesController.getInstance(tyVar.currentAccount);
        if (tyVar.A3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        messagesController.removeSuggestion(0L, str);
        tyVar.R4();
    }

    public static void r0(ty tyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.C0(launchActivity, tyVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            oj1.a(tyVar.getParentActivity(), new z(tyVar, tL_attachMenuBot, launchActivity, 7), null);
        }
    }

    public static void s0(ty tyVar) {
        b.c(tyVar.getParentActivity(), tyVar.currentAccount, tyVar.getResourceProvider());
    }

    public static void t0(final int i10, final long j3, TLRPC.Chat chat, final ty tyVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        tyVar.Y3(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                tyVar.getMessagesController().deleteDialog(j3, 2, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i14 = tyVar.V2) != 0 && tyVar.O3(tyVar.currentAccount, tyVar.f42218e0[0].f41841s, i14, false).size() == 1) {
            tyVar.f42218e0[0].f41842w.setVisibility(4);
        }
        tyVar.y3 = 3;
        int i15 = -1;
        if (i10 == 102) {
            tyVar.x4(true, true);
            if (tyVar.R1 != null) {
                i13 = 0;
                while (i13 < tyVar.R1.size()) {
                    if (((TLRPC.Dialog) tyVar.R1.get(i13)).f20046id == j3) {
                        break;
                    }
                    i13++;
                }
            }
            i13 = -1;
            tyVar.l3();
            i11 = i13;
        } else {
            i11 = -1;
        }
        UndoView V3 = tyVar.V3();
        if (V3 != null) {
            if (i10 == 103) {
                i12 = 0;
            } else if (z11) {
                i12 = 1;
            } else {
                i12 = 95;
            }
            V3.j(i12, j3, new Runnable() {
                @Override
                public final void run() {
                    tyVar.n4(i10, j3, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(tyVar.O3(tyVar.currentAccount, tyVar.f42218e0[0].f41841s, tyVar.V2, false));
        int i16 = 0;
        while (true) {
            if (i16 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i16)).f20046id == j3) {
                i15 = i16;
                break;
            } else {
                i16++;
            }
        }
        if (i10 == 102) {
            if (i11 >= 0 && i15 < 0 && (arrayList = tyVar.R1) != null) {
                arrayList.remove(i11);
                tyVar.f42218e0[0].f41843x.D();
                tyVar.f42218e0[0].q(true);
                return;
            }
            tyVar.x4(false, true);
        }
    }

    public static void u0(ty tyVar) {
        BirthdayController.getInstance(tyVar.currentAccount).hide();
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        tyVar.R4();
        org.telegram.ui.Components.tc G = org.telegram.ui.Components.ad.a0(tyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f31096j = 5000;
        G.j();
    }

    public static void v0(ty tyVar) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        tyVar.R4();
    }

    public static void w0(ty tyVar) {
        if (!tyVar.N3) {
            ci.d4 d4Var = tyVar.f42276q0;
            if (d4Var != null) {
                if (d4Var.V) {
                    return;
                }
                AndroidUtilities.removeFromParent(d4Var);
            }
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.i6.Gi, 0, new hw(tyVar, 8));
            ci.d4 d4Var2 = new ci.d4(tyVar.getParentActivity(), 2);
            d4Var2.q(8.0f);
            d4Var2.d = 8000L;
            d4Var2.i();
            d4Var2.p(true);
            d4Var2.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
            d4Var2.s(replaceSingleTag);
            d4Var2.l(1.0f, -40.0f);
            d4Var2.h(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
            tyVar.f42276q0 = d4Var2;
            d4Var2.setTranslationY((-tyVar.f42228f4) - tyVar.f42238h4);
            ((ViewGroup) tyVar.fragmentView).addView(tyVar.f42276q0, w7.x5.a(240.0f, 12.0f, 0.0f, 68.0f, 40.0f, -1, 87));
            tyVar.f42276q0.u();
            return;
        }
        ci.d4 d4Var3 = tyVar.f42271p0;
        if (d4Var3 != null) {
            d4Var3.e(true);
        }
        ai.g9 o9 = MessagesController.getInstance(tyVar.currentAccount).getStoriesController().o();
        if (o9 != null && o9.a(tyVar.currentAccount, 1)) {
            tyVar.showDialog(new rg.j0(o9.b(), tyVar.currentAccount, tyVar.getParentActivity(), tyVar, null));
            return;
        }
        ci.lc D = ci.lc.D(tyVar.getParentActivity(), tyVar.currentAccount);
        D.f5533x = new yx(tyVar, 4);
        D.Q(null);
    }

    public static void x0(ty tyVar) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        tyVar.R4();
        org.telegram.ui.Components.tc G = org.telegram.ui.Components.ad.a0(tyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f31096j = 5000;
        G.j();
    }

    public static void y0(ty tyVar) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        tyVar.R4();
        org.telegram.ui.Components.tc J = org.telegram.ui.Components.ad.a0(tyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new ov(tyVar, 1));
        J.f31096j = 5000;
        J.j();
    }

    public static void z0(ty tyVar) {
        boolean z10 = true;
        try {
            ((org.telegram.ui.Components.dk0) ((org.telegram.ui.Components.j9) tyVar.M1.h.getImageReceiver().getStaticThumb()).B).H(true);
        } catch (Exception unused) {
        }
        if (tyVar.f42199a4 == null) {
            org.telegram.ui.Components.n50 n50Var = new org.telegram.ui.Components.n50(0, true, true);
            tyVar.f42199a4 = n50Var;
            n50Var.H = true;
            n50Var.f28984a = tyVar;
            n50Var.f28985b = new hy(tyVar);
            tyVar.getMediaDataController().checkFeaturedStickers();
            tyVar.getMessagesController().loadSuggestedFilters();
            tyVar.getMessagesController().loadUserInfo(tyVar.getUserConfig().getCurrentUser(), true, tyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(tyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(tyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(tyVar.currentAccount).getCurrentUser();
        }
        if (user != null) {
            org.telegram.ui.Components.yi yiVar = tyVar.f42199a4.f28986c;
            if (yiVar != null) {
                yiVar.e1();
            }
            org.telegram.ui.Components.n50 n50Var2 = tyVar.f42199a4;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            n50Var2.n(z10, new ov(tyVar, 0), new pv(tyVar, 0), 0);
        }
    }

    @Override
    public final void A(float f7, int i10) {
        org.telegram.ui.ActionBar.v0 v0Var;
        if (i10 == 3 && (v0Var = this.f42253l0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) v0Var.getIconView().getDrawable();
            if (this.d.f16342f) {
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

    public final void A3() {
        int i10;
        if (S3() > 0.5f) {
            i10 = R.string.SearchTopics;
        } else {
            i10 = R.string.SearchChats;
        }
        String string = LocaleController.getString(i10);
        this.X.f30958r.setContentDescription(string);
        this.X.f30958r.setHint(string);
    }

    public final void A4(float f7) {
        int i10;
        int i11;
        this.f42315x1 = f7;
        if (this.f42285r3 && this.actionBar != null) {
            if (this.V2 == 0 && this.X2 == 0) {
                i10 = org.telegram.ui.ActionBar.i6.f21134v8;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.O8;
            }
            int themedColor = getThemedColor(i10);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.i6.f21187y8;
            kVar.D(i0.a.d(this.f42315x1, themedColor, getThemedColor(i12)), false);
            this.actionBar.D(i0.a.d(this.f42315x1, getThemedColor(i12), getThemedColor(i12)), true);
            if (this.V2 == 0 && this.X2 == 0) {
                i11 = org.telegram.ui.ActionBar.i6.f21098t8;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.N8;
            }
            int themedColor2 = getThemedColor(i11);
            this.actionBar.C(i0.a.d(this.f42315x1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.i6.f21205z8)), false);
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
        return Arrays.asList(new mg.a(LocaleController.getString(R.string.DebugDialogsActivity)), new mg.a(LocaleController.getString(R.string.ClearLocalDatabase), new ov(this, 28)), new mg.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new ov(this, 29)));
    }

    public final void B3() {
        float f7;
        int i10;
        if (this.X == null) {
            return;
        }
        float a2 = 1.0f - w7.o.a(((-this.N) - R3()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.f42296t3, this.h.f16341e);
        float f10 = this.f42200b.f16341e;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float max2 = f7 * (1.0f - this.f42206c.f16341e) * (1.0f - max) * Math.max(f10, (1.0f - S3()) * a2);
        this.X.setAlpha(max2);
        jy jyVar = this.X;
        boolean z10 = false;
        if (max2 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        jyVar.setVisibility(i10);
        if (max2 <= 0.01f) {
            z10 = true;
        }
        this.f42223f.a(z10, true);
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

    public final void C3() {
        int i10;
        float f7;
        int i11;
        int i12 = 8;
        if (this.Z != null) {
            if (this.f42196a0 != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float f10 = f7 * this.f42200b.f16341e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f10);
            this.Z.setScaleX(lerp);
            this.Z.setScaleY(lerp);
            this.Z.setAlpha(f10);
            v41 v41Var = this.Z;
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            v41Var.setVisibility(i11);
        }
        org.telegram.ui.Components.o91 o91Var = this.f42196a0;
        me.b bVar = this.f42287s;
        if (o91Var != null) {
            float f11 = 1.0f - bVar.f16341e;
            o91Var.setAlpha(f11);
            org.telegram.ui.Components.o91 o91Var2 = this.f42196a0;
            if (f11 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            o91Var2.setVisibility(i10);
        }
        gg.r0 r0Var = this.f42201b0;
        if (r0Var != null) {
            float f12 = bVar.f16341e;
            r0Var.setAlpha(f12);
            gg.r0 r0Var2 = this.f42201b0;
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
                kx kxVar = this.E0;
                if (kxVar != null) {
                    kxVar.setTranslationX(f10);
                }
                jy jyVar = this.X;
                if (jyVar != null) {
                    jyVar.setTranslationX(f10);
                }
                nx nxVar = this.F3;
                if (nxVar != null && nxVar.getFragmentView() != null && !this.f42318y) {
                    this.F3.getFragmentView().setTranslationX(f10);
                    return;
                }
                return;
            }
            float f11 = 1.0f - this.W3;
            float f12 = (-AndroidUtilities.dp(4.0f)) * f11;
            float f13 = 1.0f - (f11 * 0.05f);
            kx kxVar2 = this.E0;
            if (kxVar2 != null) {
                kxVar2.setScaleX(f13);
                this.E0.setScaleY(f13);
                this.E0.setTranslationX(f12);
                this.E0.setPivotX(0.0f);
                this.E0.setPivotY(0.0f);
            }
            jy jyVar2 = this.X;
            if (jyVar2 != null) {
                jyVar2.setTranslationX(f12);
                this.X.setScaleX(f13);
                this.X.setScaleY(f13);
            }
            nx nxVar2 = this.F3;
            if (nxVar2 != null && nxVar2.getFragmentView() != null) {
                if (!this.f42318y) {
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
            int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f42195a);
            if (this.f42196a0 != null) {
                i10 = AndroidUtilities.dp(50.0f);
            } else {
                i10 = 0;
            }
            int i13 = measuredHeight + i10;
            org.telegram.ui.Components.bt btVar = this.J1;
            if (btVar != null) {
                i11 = (int) btVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i14 = i13 + i11;
            dy dyVar = this.C0;
            SparseArray sparseArray = dyVar.h;
            dyVar.U0 = i14;
            dyVar.V0 = i12;
            ai.w0 w0Var = dyVar.V;
            if (z10) {
                w0Var.o1(0, i14, 0, i12);
            } else {
                w0Var.setPadding(0, i14, 0, i12);
            }
            dyVar.M0.j(dyVar.U0, dyVar.V0, z10);
            org.telegram.ui.Components.ro0 ro0Var = dyVar.W;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ro0Var.getLayoutParams();
            int i15 = marginLayoutParams.topMargin;
            int i16 = dyVar.U0;
            if (i15 != i16 || marginLayoutParams.bottomMargin != dyVar.V0) {
                marginLayoutParams.topMargin = i16;
                marginLayoutParams.bottomMargin = dyVar.V0;
                ro0Var.requestLayout();
            }
            org.telegram.ui.Components.ep0.P(dyVar.f26131f0, dyVar.f26134i0, dyVar.U0, dyVar.V0, z10);
            org.telegram.ui.Components.ep0.P(dyVar.f26136k0, dyVar.f26138n0, dyVar.U0, dyVar.V0, z10);
            org.telegram.ui.Components.ep0.P(dyVar.f26142r0, dyVar.f26145u0, dyVar.U0, dyVar.V0, z10);
            org.telegram.ui.Components.ei0 ei0Var = dyVar.f26140p0;
            int i17 = dyVar.U0;
            int i18 = dyVar.V0;
            ei0Var.setClipToPadding(false);
            org.telegram.ui.Components.l71 l71Var = ei0Var.f26056c;
            ei0Var.J = z10;
            ei0Var.setPadding(0, i17, 0, i18);
            if (z10) {
                l71Var.o1(0, i17, 0, i18);
            } else {
                l71Var.setPadding(0, i17, 0, i18);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) l71Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i17;
            marginLayoutParams2.bottomMargin = -i18;
            ei0Var.J = false;
            org.telegram.ui.Components.co0 co0Var = dyVar.G0;
            if (co0Var != null) {
                co0Var.b(dyVar.U0, dyVar.V0, z10);
            }
            int size = sparseArray.size();
            for (int i19 = 0; i19 < size; i19++) {
                View view = (View) sparseArray.valueAt(i19);
                if (view instanceof w10) {
                    ((w10) view).j(dyVar.U0, dyVar.V0, z10);
                }
            }
            for (int i20 = 0; i20 < dyVar.getChildCount(); i20++) {
                if (dyVar.getChildAt(i20) instanceof w10) {
                    ((w10) dyVar.getChildAt(i20)).j(dyVar.U0, dyVar.V0, z10);
                }
            }
        }
    }

    public final void D4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.x6 x6Var = new org.telegram.ui.Components.x6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.fa1(10, this, r0), new cj(r0, 18));
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(getParentActivity(), getResourceProvider());
        a3Var.c(x6Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f20384a;
        f3Var.show();
        org.telegram.ui.ActionBar.f3[] f3VarArr = {f3Var};
        f3Var.fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.i6.f20872h5));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.E4(org.telegram.ui.Cells.s2):boolean");
    }

    public boolean F3() {
        if (this.R0 == 10) {
            return true;
        }
        return false;
    }

    public final void F4(boolean z10) {
        float f7;
        this.f42206c.a(z10, true);
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
        org.telegram.ui.ActionBar.v0 v0Var = this.m0;
        Property property = View.ALPHA;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(v0Var, property, f7));
        this.O3.playTogether(arrayList);
        this.O3.addListener(new tx(this, z10, 1));
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
                dy dyVar = this.C0;
                if (dyVar != null) {
                    dyVar.f26127b0.R(this.W1, tLObject);
                }
                this.X1 = null;
                return;
            }
            return;
        }
        this.V1 = true;
    }

    public final void G4() {
        if (!this.A0 && getMessagesController().dialogFiltersLoaded && getMessagesController().showFiltersTooltip && this.f42322z0 != null && getMessagesController().getDialogFilters().isEmpty() && !this.isPaused && getUserConfig().filtersLoaded && !this.inPreviewMode) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("filterhint", false)) {
                globalMainSettings.edit().putBoolean("filterhint", true).apply();
                AndroidUtilities.runOnUIThread(new hw(this, 10), 1000L);
            }
        }
    }

    public final void H3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.f21289n0) {
            kVar.h(true);
            this.f42274p3 = false;
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
        org.telegram.ui.Components.fa1 fa1Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.f1 f1Var;
        int i12;
        int i13;
        int w02;
        int w03;
        int w04;
        int m12;
        CharSequence charSequence2;
        int i14;
        int w05;
        org.telegram.ui.Components.q80 H = org.telegram.ui.Components.q80.H(this, this.f42248k0);
        int i15 = org.telegram.ui.ActionBar.i6.A8;
        H.S(getThemedColor(i15), getThemedColor(i15));
        H.f30120s = 8;
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
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new ov(this, 4), false);
                H.k();
            }
            H.i(new ov(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.Y2.collapsed_in_dialogs);
            H.i(new ov(this, 8), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.Y2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else if (b4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new ov(this, 9), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new ov(this, 10), false);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else {
            org.telegram.ui.ActionBar.e6 e6Var2 = this.resourceProvider;
            if (e6Var2 != null) {
                q6 = e6Var2.a();
            } else {
                q6 = org.telegram.ui.ActionBar.i6.I.q();
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
            H.c(i10, LocaleController.getString(i11), new ov(this, 11), false);
            H.k();
            H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new ov(this, 12), false);
            H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new ov(this, 13), false);
            ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
            if (applicationLoader != null) {
                applicationLoader.addItemOptions(H);
            }
            if (getMessagesController().config.walletAvailable.get()) {
                H.c(R.drawable.ic_gram, LocaleController.getString(R.string.WalletAttachMoney), new ov(this, 14), false);
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
                            sv svVar = new sv(this, tL_attachMenuBot2, launchActivity, 0);
                            org.telegram.ui.Components.fa1 fa1Var2 = new org.telegram.ui.Components.fa1(9, this, tL_attachMenuBot2);
                            org.telegram.ui.ActionBar.e6 e6Var3 = H.d;
                            if (H.f30095e != null) {
                                int i18 = org.telegram.ui.ActionBar.i6.F8;
                                int i19 = org.telegram.ui.ActionBar.i6.E8;
                                f7 = f10;
                                org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(0, H.f30095e, H.d, false, false);
                                f1Var2.setPadding(AndroidUtilities.dp(18.0f), i16, AndroidUtilities.dp(18.0f), i16);
                                if (tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                    charSequence = org.telegram.ui.Cells.r8.a(tL_attachMenuBot2.short_name);
                                } else {
                                    charSequence = tL_attachMenuBot2.short_name;
                                }
                                TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot2);
                                if (sideAttachMenuBotIcon != null) {
                                    launchActivity2 = launchActivity;
                                    arrayList2 = arrayList3;
                                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.i6.f20785c7, 1.0f);
                                    if (svgThumb != null) {
                                        Integer num = H.f30107k0;
                                        if (num != null) {
                                            w05 = num.intValue();
                                        } else {
                                            w05 = org.telegram.ui.ActionBar.i6.w0(i18, e6Var3);
                                        }
                                        charSequence2 = charSequence;
                                        svgThumb.setColorFilter(new PorterDuffColorFilter(w05, PorterDuff.Mode.SRC_IN));
                                    } else {
                                        charSequence2 = charSequence;
                                    }
                                    fa1Var = fa1Var2;
                                    f1Var = f1Var2;
                                    i13 = i19;
                                    i12 = i18;
                                    e6Var = e6Var3;
                                    f1Var.h(charSequence2, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                                    org.telegram.ui.Components.y9 y9Var = f1Var.h;
                                    if (y9Var != null) {
                                        if (LocaleController.isRTL) {
                                            i14 = 5;
                                        } else {
                                            i14 = 3;
                                        }
                                        y9Var.setLayoutParams(w7.x5.e(24, 24, i14 | 16));
                                    }
                                } else {
                                    launchActivity2 = launchActivity;
                                    arrayList2 = arrayList3;
                                    fa1Var = fa1Var2;
                                    e6Var = e6Var3;
                                    CharSequence charSequence3 = charSequence;
                                    f1Var = f1Var2;
                                    i12 = i18;
                                    i13 = i19;
                                    f1Var.g(charSequence3, R.drawable.msg_bot, null);
                                }
                                Integer num2 = H.f30105j0;
                                if (num2 != null) {
                                    w02 = num2.intValue();
                                } else {
                                    w02 = org.telegram.ui.ActionBar.i6.w0(i13, e6Var);
                                }
                                Integer num3 = H.f30107k0;
                                if (num3 != null) {
                                    w03 = num3.intValue();
                                } else {
                                    w03 = org.telegram.ui.ActionBar.i6.w0(i12, e6Var);
                                }
                                f1Var.c(w02, w03);
                                Integer num4 = H.f30107k0;
                                if (num4 != null) {
                                    w04 = num4.intValue();
                                } else {
                                    w04 = org.telegram.ui.ActionBar.i6.w0(i12, e6Var);
                                }
                                f1Var.setIconColorImage(w04);
                                Integer num5 = H.f30109l0;
                                if (num5 != null) {
                                    m12 = num5.intValue();
                                } else {
                                    m12 = org.telegram.ui.ActionBar.i6.m1(0.12f, org.telegram.ui.ActionBar.i6.w0(i13, e6Var));
                                }
                                f1Var.setSelectorColor(m12);
                                f1Var.setOnClickListener(new org.telegram.ui.Components.vt(8, H, svVar));
                                f1Var.setOnLongClickListener(new ai.r3(3, H, fa1Var));
                                int i20 = H.S;
                                if (i20 > 0) {
                                    f1Var.setMinimumWidth(AndroidUtilities.dp(i20));
                                    H.r(f1Var, w7.x5.n(H.S, -2));
                                } else {
                                    H.r(f1Var, w7.x5.n(-1, -2));
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
                H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new ov(this, 6), false);
            }
            org.telegram.ui.ActionBar.f1 f1Var3 = this.f42266o0;
            if (f1Var3 != null) {
                f1Var3.f20580b.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20756ai));
                this.f42266o0.setOnClickListener(new rv(0, this, H));
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                    H.k();
                    H.d(this.f42266o0);
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
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(str);
        boolean z10 = this.W;
        ArrayList arrayList = this.f42240i1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f42230g1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f42230g1.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
            this.f42230g1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.f21187y8), PorterDuff.Mode.MULTIPLY));
            this.f42230g1.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(org.telegram.ui.ActionBar.i6.f21205z8), 1, -1));
            this.f42230g1.setOnClickListener(new uv(this, 6));
            j3.addView(this.f42230g1, w7.x5.q(54, 54, 16));
            arrayList.add(this.f42230g1);
        }
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f42235h1 = numberTextView;
        int i10 = 18;
        numberTextView.setTextSize(18);
        this.f42235h1.setTypeface(AndroidUtilities.bold());
        this.f42235h1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21187y8));
        NumberTextView numberTextView2 = this.f42235h1;
        if (!this.W) {
            i10 = 72;
        }
        j3.addView(numberTextView2, w7.x5.m(1.0f, 0, -1, i10, 0, 0));
        this.f42235h1.setOnTouchListener(new bi.d(2));
        this.f42249k1 = j3.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.l1 = j3.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.f42256m1 = j3.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.f42245j1 = j3.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.v0 h = j3.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        j3.addView(new View(getParentActivity()), w7.x5.n(5, -1));
        this.f42277q1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.f42262n1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.f42267o1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.f42272p1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.f42289s1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.f42283r1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.f42294t1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.l1.setOnLongClickListener(new cw(this, 1));
        arrayList.add(this.f42249k1);
        arrayList.add(this.f42256m1);
        arrayList.add(this.l1);
        arrayList.add(this.f42245j1);
        arrayList.add(h);
        Q4(false);
    }

    public final void I4() {
        if (this.R3 == null) {
            for (String str : getMessagesController().pendingSuggestions) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                    alertDialog$Builder.f20378a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new vv(this, 6));
                    showDialog(alertDialog$Builder.f20378a, new pv(this, 1));
                    this.R3 = str;
                    return;
                }
            }
        }
    }

    public final void J3() {
        int i10;
        dy dyVar = this.C0;
        if ((dyVar != null && dyVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f42263n2 != null) {
            i10 = 2;
        } else if (!this.f42254l2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        dy dyVar2 = new dy(this, getParentActivity(), this, i10, this.R0, this.V2, this.X2, new yx(this, 1));
        this.C0 = dyVar2;
        ((my) this.fragmentView).addView(dyVar2, this.B0);
        dy dyVar3 = this.C0;
        dyVar3.f26127b0.U = new fy(this);
        dyVar3.f26134i0.setOnItemClickListener(new vv(this, 1));
        this.C0.f26138n0.setOnItemClickListener(new vv(this, 2));
        this.C0.f26145u0.setOnItemClickListener(new zv(this, 0));
        this.C0.f26138n0.setOnItemLongClickListener(new vv(this, 3));
        this.C0.V.setOnItemClickListener(new vv(this, 4));
        this.C0.V.setOnItemLongClickListener(new yx(this, 2));
        this.C0.setFilteredSearchViewDelegate(new vv(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.f42275p4);
    }

    public final void J4(long j3, View view) {
        ArrayList<TLRPC.Dialog> O3;
        int i10;
        f3(j3, view);
        boolean t10 = this.actionBar.t();
        ArrayList arrayList = this.I2;
        boolean z10 = true;
        if (t10) {
            if (arrayList.isEmpty()) {
                Y3(true);
                return;
            }
        } else {
            if (this.f42274p3) {
                I3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.e5)) {
                    hg.c.v(false, this.actionBar);
                }
            } else {
                I3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20801d6));
            this.actionBar.O(null, null);
            int i11 = this.f42218e0[0].f41841s;
            if ((i11 != 7 && i11 != 8) || (this.actionBar.t() && !this.actionBar.u(null))) {
                O3 = getMessagesController().getDialogs(this.V2);
            } else {
                O3 = O3(this.currentAccount, this.f42218e0[0].f41841s, this.V2, this.S1);
            }
            int size = O3.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = O3.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (d4(dialog)) {
                        i12++;
                    } else if (!getMessagesController().isPromoDialog(dialog.f20046id, false)) {
                        break;
                    }
                }
            }
            if (i12 > 1) {
                if (this.f42218e0 != null) {
                    int i14 = 0;
                    while (true) {
                        sy[] syVarArr = this.f42218e0;
                        if (i14 >= syVarArr.length) {
                            break;
                        }
                        syVarArr[i14].d.H = true;
                        i14++;
                    }
                }
                d5(MessagesController.UPDATE_MASK_REORDER, true);
            }
            if (!this.f42274p3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f42240i1;
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
            ValueAnimator valueAnimator = this.f42301u3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f42301u3 = ValueAnimator.ofFloat(this.f42296t3, 1.0f);
            int i16 = 0;
            while (true) {
                sy[] syVarArr2 = this.f42218e0;
                if (i16 >= syVarArr2.length) {
                    break;
                }
                sy syVar = syVarArr2[i16];
                if (syVar != null) {
                    syVar.f41834a.I0(true);
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
            this.f42301u3.addUpdateListener(new xv(this, max, 0));
            this.f42301u3.addListener(new wx(this, max, 1));
            this.f42301u3.setInterpolator(org.telegram.ui.Components.is.f27443f);
            this.f42301u3.setDuration(200L);
            this.f42301u3.start();
            qw qwVar = this.f42322z0;
            if (qwVar != null) {
                qwVar.b(org.telegram.ui.ActionBar.i6.Gh, org.telegram.ui.ActionBar.i6.Fh, org.telegram.ui.ActionBar.i6.Eh, org.telegram.ui.ActionBar.i6.Hh, org.telegram.ui.ActionBar.i6.f21152w8);
            }
            org.telegram.ui.ActionBar.g2 g2Var = this.f42219e1;
            if (g2Var != null) {
                g2Var.c(1.0f, true);
            }
            z10 = false;
        }
        Q4(false);
        this.f42235h1.a(arrayList.size(), z10);
    }

    public final void K3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f42319y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new xx(this, parentActivity);
                FrameLayout.LayoutParams a2 = w7.x5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83);
                a2.bottomMargin = this.f42228f4 + this.f42238h4 + a2.bottomMargin;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.f42314x0 + 1;
                this.f42314x0 = i11;
                ((my) this.fragmentView).addView(undoView, i11, a2);
            }
        }
    }

    public final void K4(long j3, View view) {
        String str;
        org.telegram.ui.Components.tc J;
        int i10 = -this.L3;
        this.L3 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (j3 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)));
        } else {
            str = "";
        }
        if (getMessagesController().premiumFeaturesBlocked()) {
            J = org.telegram.ui.Components.ad.a0(this).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = org.telegram.ui.Components.ad.a0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new ov(this, 23));
        }
        J.j();
    }

    public final void L3(final long j3, final long j10, boolean z10, final fg1 fg1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String string;
        String formatStringSimple;
        String string2;
        String str;
        String str2;
        TLRPC.TL_forumTopic findTopic;
        if (m3(j3)) {
            int i10 = this.R0;
            if (i10 != 11 && i10 != 12 && i10 != 13) {
                if (z10 && ((this.f42226f2 != null && this.f42231g2 != null) || this.f42236h2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (DialogObject.isEncryptedDialog(j3)) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.q.l(getMessagesController(), j3).user_id));
                            if (user2 != null) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f42226f2, UserObject.getUserName(user2));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                return;
                            }
                        } else if (DialogObject.isUserDialog(j3)) {
                            if (j3 == getUserConfig().getClientUserId()) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f42231g2, LocaleController.getString(R.string.SavedMessages));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j3));
                                if (user3 != null && this.f42226f2 != null) {
                                    str = LocaleController.getString(R.string.SendMessageTitle);
                                    str2 = LocaleController.formatStringSimple(this.f42226f2, UserObject.getUserName(user3));
                                    string2 = LocaleController.getString(R.string.Send);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j3));
                            if (chat2 != null) {
                                String str3 = chat2.title;
                                if (j10 != 0 && (findTopic = getMessagesController().getTopicsController().findTopic(chat2.f20042id, j10)) != null) {
                                    str3 = ((Object) str3) + " " + findTopic.title;
                                }
                                if (this.f42236h2 != null) {
                                    string = LocaleController.getString(R.string.AddToTheGroupAlertTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f42236h2, str3);
                                    string2 = LocaleController.getString(R.string.Add);
                                } else {
                                    string = LocaleController.getString(R.string.SendMessageTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f42231g2, str3);
                                    string2 = LocaleController.getString(R.string.Send);
                                }
                                String str4 = formatStringSimple;
                                str = string;
                                str2 = str4;
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
                        b2Var.R = str;
                        b2Var.T = AndroidUtilities.replaceTags(str2);
                        alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.a2() {
                            @Override
                            public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i11) {
                                ty.this.L3(j3, j10, false, fg1Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        if (showDialog(b2Var) == null) {
                            b2Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 15) {
                    Runnable h0Var = new a3.h0(this, j3, new a3.g0(this, j3, j10, fg1Var, 14), 24);
                    if (j3 < 0) {
                        N4(getMessagesController().getChat(Long.valueOf(-j3)), h0Var, null);
                        return;
                    }
                    TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(j3));
                    TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(this.H));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user4), UserObject.getFirstName(user5));
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20378a;
                    b2Var2.R = formatString;
                    b2Var2.T = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user4), UserObject.getFirstName(user5))));
                    alertDialog$Builder2.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new gu(h0Var, 1));
                    alertDialog$Builder2.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.ge0(25));
                    showDialog(b2Var2);
                    return;
                } else if (this.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j3, j10));
                    if (this.C2.w(this, arrayList, null, false, this.J2, this.K2, this.L2, fg1Var) && this.f42241i2) {
                        this.C2 = null;
                        return;
                    }
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            if (DialogObject.isUserDialog(j3)) {
                TLRPC.User user6 = getMessagesController().getUser(Long.valueOf(j3));
                if (!user6.mutual_contact) {
                    UndoView V3 = V3();
                    if (V3 != null) {
                        V3.j(45, j3, null);
                        return;
                    }
                    return;
                }
                user = user6;
                chat = null;
            } else {
                TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(-j3));
                if (ChatObject.hasAdminRights(chat3) && ChatObject.canChangeChatInfo(chat3)) {
                    chat = chat3;
                    user = null;
                } else {
                    UndoView V32 = V3();
                    if (V32 != null) {
                        V32.j(46, j3, null);
                        return;
                    }
                    return;
                }
            }
            org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().getInputPeer(j3);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new ow(this, b2Var3, user, chat, j3, tL_messages_checkHistoryImportPeer));
            try {
                b2Var3.q(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void L4(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.L4(boolean, boolean, boolean, boolean):void");
    }

    public final void M3(long j3, boolean z10) {
        if (this.f42218e0 != null) {
            int i10 = 0;
            while (true) {
                sy[] syVarArr = this.f42218e0;
                if (i10 < syVarArr.length) {
                    int childCount = syVarArr[i10].f41834a.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 < childCount) {
                            View childAt = this.f42218e0[i10].f41834a.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.s2) {
                                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt;
                                if (s2Var.getDialogId() == j3) {
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
            b71[] b71VarArr = new b71[1];
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            org.telegram.ui.ActionBar.j5 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.D3.f();
                Drawable drawable = this.D3.f30011f[0];
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
            ox oxVar = new ox(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), b71VarArr);
            if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
                oxVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
            }
            Long l10 = this.B3;
            if (l10 != null) {
                oxVar.setSelected(l10);
            } else {
                Drawable drawable2 = this.D3.f30011f[0];
                if (drawable2 instanceof org.telegram.ui.Components.s5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.s5) drawable2).i());
                } else {
                    l4 = null;
                }
                oxVar.setSelected(l4);
            }
            oxVar.setSaveState(1);
            oxVar.y(this.D3, titleTextView);
            px pxVar = new px(this, oxVar);
            this.M0 = pxVar;
            b71VarArr[0] = pxVar;
            pxVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i11, 48);
            b71VarArr[0].b();
        }
    }

    public final void N4(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.N4(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final java.util.ArrayList O3(int r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.O3(int, int, int, boolean):java.util.ArrayList");
    }

    public final void O4(boolean z10) {
        sy[] syVarArr;
        char c10;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            syVarArr = this.f42218e0;
            if (i12 >= syVarArr.length) {
                break;
            }
            syVarArr[i12].f41834a.B0();
            i12++;
        }
        if (z10 && syVarArr.length > 1) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int i13 = syVarArr[c10].h;
        if (i13 >= 0 && i13 < getMessagesController().getDialogFilters().size()) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.f42218e0[c10].h);
            if (dialogFilter.isDefault()) {
                sy syVar = this.f42218e0[c10];
                syVar.f41841s = this.R0;
                py pyVar = syVar.f41834a;
                int i14 = py.f40957t3;
                pyVar.B1();
            } else {
                sy[] syVarArr2 = this.f42218e0;
                if (syVarArr2[c10 ^ 1].f41841s == 7) {
                    syVarArr2[c10].f41841s = 8;
                } else {
                    syVarArr2[c10].f41841s = 7;
                }
                syVarArr2[c10].f41834a.setScrollEnabled(true);
                MessagesController messagesController = getMessagesController();
                if (this.f42218e0[c10].f41841s == 8) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                messagesController.selectDialogFilter(dialogFilter, i10);
            }
            sy[] syVarArr3 = this.f42218e0;
            if (syVarArr3.length > 1) {
                syVarArr3[1].E = dialogFilter.locked;
            }
            sy syVar2 = syVarArr3[c10];
            ax axVar = syVar2.d;
            axVar.h = syVar2.f41841s;
            axVar.l();
            sy syVar3 = this.f42218e0[c10];
            ww wwVar = syVar3.f41836c;
            if (syVar3.f41841s == 0 && W3() && this.f42218e0[c10].v == 2) {
                i11 = 1;
            }
            wwVar.h1(i11, (int) this.N);
            o3(this.f42218e0[c10]);
        }
    }

    public final float P3(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f - this.f42200b.f16341e;
        } else {
            f7 = 1.0f;
        }
        return f7 * (1.0f - S3()) * this.f42281r.f16341e;
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
        v41 v41Var = this.Z;
        if (v41Var != null && v41Var.getVisibility() != 8) {
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
            float f20 = this.f42315x1;
            f11 = (f7 * f20) + com.google.android.gms.internal.vision.e2.y(1.0f, f20, f10, f19);
            f12 = this.f42312w3;
        } else {
            f11 = (f7 * this.f42315x1) + this.N;
            f12 = this.f42312w3;
        }
        float f21 = f11 + f12 + this.T;
        jy jyVar = this.X;
        if (jyVar != null && jyVar.getVisibility() == 0) {
            f13 = this.X.getAlpha();
        } else {
            f13 = 0.0f;
        }
        float dp = AndroidUtilities.dp(4.0f) * f13;
        qw qwVar = this.f42322z0;
        if (qwVar != null) {
            qwVar.setTranslationY(f21 - dp);
            f15 = this.f42322z0.getAlpha();
            f16 = AndroidUtilities.dp(43.0f) * f15;
            f14 = f21 + f16;
        } else {
            f14 = f21;
            f15 = 0.0f;
            f16 = 0.0f;
        }
        org.telegram.ui.Components.bt btVar = this.J1;
        if (btVar != null) {
            float f22 = f14 - dp;
            int i11 = -AndroidUtilities.dp(3.0f);
            if (this.f42196a0 == null) {
                i10 = AndroidUtilities.dp(44.0f);
            } else {
                i10 = 0;
            }
            btVar.setTranslationY(AndroidUtilities.lerp(f22, i11 - i10, this.f42200b.f16341e));
            f17 = this.J1.getMetadata().f16359c.f16369a;
            f18 = this.J1.c(0.0f);
        } else {
            f17 = 0.0f;
            f18 = 0.0f;
        }
        org.telegram.ui.Components.at atVar = this.K1;
        if (atVar != null) {
            atVar.setTranslationY(f21 - dp);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f17, f15));
            org.telegram.ui.Components.at atVar2 = this.K1;
            float min = Math.min(AndroidUtilities.dp(40.0f), (f18 + f16) - lerp);
            Matrix matrix = atVar2.f24620b;
            if (atVar2.f24622e != lerp || atVar2.f24623f != min) {
                atVar2.f24622e = lerp;
                atVar2.f24623f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = atVar2.f24621c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                atVar2.invalidate();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.Q4(boolean):void");
    }

    public final int R3() {
        if (this.K) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    public final void R4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.R4():void");
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        nx nxVar;
        ci.bb bbVar;
        qw qwVar;
        boolean z11;
        boolean z12;
        if (!this.f42274p3 && (((nxVar = this.F3) == null || !nxVar.c()) && (((bbVar = this.K0) == null || bbVar.getVisibility() != 0) && ((qwVar = this.f42322z0) == null || !qwVar.f24787n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                qw qwVar2 = this.f42322z0;
                if (qwVar2 != null && qwVar2.getTabsCount() >= 2 && this.f42322z0.getCurrentTabId() != this.f42322z0.getFirstTabId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                qw qwVar3 = this.f42322z0;
                if (qwVar3 != null && qwVar3.getTabsCount() >= 2 && this.f42322z0.getCurrentTabId() != this.f42322z0.getLastTabId()) {
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
        nx nxVar = this.F3;
        if (nxVar != null && nxVar.c()) {
            return this.F3.f39472e;
        }
        return 0.0f;
    }

    public final void S4(boolean z10, boolean z11) {
        ?? r52;
        int L0;
        boolean z12;
        sy[] syVarArr;
        MessagesController.DialogFilter dialogFilter;
        boolean z13;
        Object[] objArr;
        s4.n0 n0Var;
        boolean z14;
        boolean z15;
        boolean z16;
        if (this.f42322z0 != null && !this.inPreviewMode && !this.f42274p3) {
            nx nxVar = this.F3;
            if (nxVar == null || !nxVar.c()) {
                org.telegram.ui.Components.q80 q80Var = this.L0;
                if (q80Var != null) {
                    q80Var.u();
                    this.L0 = null;
                }
                ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                int size = dialogFilters.size();
                me.b bVar = this.f42281r;
                boolean z17 = true;
                boolean z18 = false;
                if (size > 1) {
                    if (!z10 && this.f42322z0.getVisibility() == 0) {
                        r52 = 0;
                    } else {
                        if (this.f42322z0.getVisibility() != 0) {
                            z13 = false;
                        } else {
                            z13 = z11;
                        }
                        this.f42308w = true;
                        boolean isEmpty = this.f42322z0.h.isEmpty();
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.Q3 == null) {
                                z16 = z11;
                            } else {
                                z16 = false;
                            }
                            if (!this.f42274p3) {
                                bVar.a(this.f42308w, z16);
                            }
                        }
                        int currentTabId = this.f42322z0.getCurrentTabId();
                        int currentTabStableId = this.f42322z0.getCurrentTabStableId();
                        if (currentTabId != this.f42322z0.getDefaultTabId() && currentTabId >= dialogFilters.size()) {
                            this.f42322z0.L = -1;
                            objArr = 1;
                        } else {
                            objArr = null;
                        }
                        qw qwVar = this.f42322z0;
                        qwVar.h.clear();
                        qwVar.f24784j0.clear();
                        qwVar.f24786l0.clear();
                        qwVar.m0.clear();
                        qwVar.f24788n0.clear();
                        qwVar.f24789o0.clear();
                        qwVar.M = 0;
                        int size2 = dialogFilters.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            if (dialogFilters.get(i10).isDefault()) {
                                this.f42322z0.a(i10, 0, LocaleController.getString(R.string.FilterAllChats), null, false, true, dialogFilters.get(i10).locked);
                                z15 = z18;
                            } else {
                                MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(i10);
                                z15 = z18;
                                this.f42322z0.a(i10, dialogFilter2.localId, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, false, dialogFilters.get(i10).locked);
                            }
                            i10++;
                            z18 = z15;
                        }
                        boolean z19 = z18;
                        if (currentTabStableId >= 0) {
                            if (objArr != null && !this.f42322z0.h(currentTabStableId)) {
                                while (currentTabId >= 0) {
                                    qw qwVar2 = this.f42322z0;
                                    if (qwVar2.h(qwVar2.f24785k0.get(currentTabId, -1))) {
                                        break;
                                    }
                                    currentTabId--;
                                }
                                if (currentTabId < 0) {
                                    currentTabId = z19 ? 1 : 0;
                                }
                            }
                            if (this.f42322z0.f24785k0.get(this.f42218e0[z19 ? 1 : 0].h, -1) != currentTabStableId) {
                                this.f42218e0[z19 ? 1 : 0].h = currentTabId;
                                isEmpty = true;
                            }
                        }
                        int i11 = z19 ? 1 : 0;
                        while (true) {
                            sy[] syVarArr2 = this.f42218e0;
                            if (i11 >= syVarArr2.length) {
                                break;
                            }
                            if (syVarArr2[i11].h >= dialogFilters.size()) {
                                this.f42218e0[i11].h = dialogFilters.size() - 1;
                            }
                            this.f42218e0[i11].f41834a.setScrollingTouchSlop(1);
                            i11++;
                        }
                        qw qwVar3 = this.f42322z0;
                        ai.w0 w0Var = qwVar3.F;
                        if (z13) {
                            n0Var = qwVar3.f24795s0;
                        } else {
                            n0Var = null;
                        }
                        w0Var.setItemAnimator(n0Var);
                        qwVar3.I.l();
                        if (isEmpty) {
                            O4(z19);
                        }
                        qw qwVar4 = this.f42322z0;
                        int currentTabId2 = qwVar4.getCurrentTabId();
                        ArrayList arrayList = qwVar4.h;
                        int i12 = 0;
                        while (true) {
                            if (i12 < arrayList.size()) {
                                if (((org.telegram.ui.Components.x00) arrayList.get(i12)).f32794a == currentTabId2) {
                                    z14 = ((org.telegram.ui.Components.x00) arrayList.get(i12)).f32798f;
                                    break;
                                }
                                i12++;
                            } else {
                                z14 = false;
                                break;
                            }
                        }
                        if (z14) {
                            qw qwVar5 = this.f42322z0;
                            ArrayList arrayList2 = qwVar5.h;
                            if (!arrayList2.isEmpty()) {
                                r52 = 0;
                                qwVar5.f((org.telegram.ui.Components.x00) arrayList2.get(0), 0);
                            }
                        }
                        r52 = 0;
                    }
                } else {
                    r52 = 0;
                    if (this.f42322z0.getVisibility() != 8) {
                        this.f42322z0.setIsEditing(false);
                        F4(false);
                        this.f42258m3 = false;
                        if (this.f42255l3) {
                            this.f42255l3 = false;
                            this.f42218e0[0].setTranslationX(0.0f);
                            this.f42218e0[1].setTranslationX(syVarArr[0].getMeasuredWidth());
                        }
                        if (this.f42218e0[0].h != this.f42322z0.getDefaultTabId()) {
                            this.f42218e0[0].h = this.f42322z0.getDefaultTabId();
                            ax axVar = this.f42218e0[0].d;
                            axVar.h = 0;
                            axVar.l();
                            sy syVar = this.f42218e0[0];
                            syVar.f41841s = this.R0;
                            syVar.d.l();
                        }
                        this.f42218e0[1].setVisibility(8);
                        sy syVar2 = this.f42218e0[1];
                        syVar2.h = 0;
                        ax axVar2 = syVar2.d;
                        axVar2.h = 0;
                        axVar2.l();
                        sy syVar3 = this.f42218e0[1];
                        syVar3.f41841s = this.R0;
                        syVar3.d.l();
                        this.f42308w = false;
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.Q3 == null) {
                                z12 = z11;
                            } else {
                                z12 = false;
                            }
                            if (!this.f42274p3) {
                                bVar.a(false, z12);
                            }
                        }
                        int i13 = 0;
                        while (true) {
                            sy[] syVarArr3 = this.f42218e0;
                            if (i13 >= syVarArr3.length) {
                                break;
                            }
                            sy syVar4 = syVarArr3[i13];
                            if (syVar4.f41841s == 0 && syVar4.v == 2 && W3() && ((L0 = this.f42218e0[i13].f41836c.L0()) == 0 || L0 == 1)) {
                                this.f42218e0[i13].f41836c.h1(1, (int) this.N);
                            }
                            this.f42218e0[i13].f41834a.setScrollingTouchSlop(0);
                            this.f42218e0[i13].f41834a.requestLayout();
                            this.f42218e0[i13].requestLayout();
                            i13++;
                        }
                        this.f42322z0.L = -1;
                        r52 = 0;
                    }
                }
                Q4(r52);
                int i14 = this.f42218e0[r52].f41841s;
                if ((i14 == 7 || i14 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[i14 - 7]) != null) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < dialogFilters.size()) {
                            MessagesController.DialogFilter dialogFilter3 = dialogFilters.get(i15);
                            if (dialogFilter3 != null && dialogFilter3.f17256id == dialogFilter.f17256id) {
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
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.f42200b.f16341e);
    }

    public final void T4(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.T4(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    public final ai.m9 U3() {
        return getMessagesController().getStoriesController();
    }

    public final void U4() {
        float f7 = (((-this.f42228f4) - this.f42243i4) - this.f42299u1) - this.f42304v1;
        org.telegram.ui.Components.q20 q20Var = this.f42293t0;
        if (q20Var != null) {
            q20Var.setTranslationY(f7);
        }
        org.telegram.ui.Components.q20 q20Var2 = this.f42298u0;
        if (q20Var2 != null) {
            q20Var2.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            ci.d4 d4Var = this.f42271p0;
            if (d4Var != null) {
                d4Var.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    public final UndoView V3() {
        K3();
        UndoView[] undoViewArr = this.f42319y0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.e(2, true);
            my myVar = (my) this.fragmentView;
            myVar.removeView(undoViewArr[0]);
            myVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void V4(boolean z10) {
        boolean z11;
        boolean z12 = this.f42254l2;
        if ((!z12 || this.R0 == 10) && this.V2 == 0 && this.X2 == 0 && !this.inPreviewMode && ((!this.f42246j2 || z12) && !this.T3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.q20 q20Var = this.f42293t0;
        if (q20Var != null) {
            q20Var.e(z11, z10);
        }
        org.telegram.ui.Components.q20 q20Var2 = this.f42298u0;
        if (q20Var2 != null) {
            q20Var2.e(z11, z10);
        }
    }

    public final boolean W3() {
        if (!this.f42254l2 && this.R0 == 0 && this.X2 == 0 && this.V2 == 0 && getMessagesController().hasHiddenArchive()) {
            return true;
        }
        return false;
    }

    public final void W4(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        if (this.f42261n0 != null) {
            org.telegram.ui.ActionBar.v0 v0Var = this.m0;
            if (v0Var == null || v0Var.getVisibility() != 0) {
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
                if (!getDownloadController().hasUnviewedDownloads() && !z12 && (this.f42229g0.getVisibility() != 0 || this.f42229g0.getAlpha() != 1.0f || z11)) {
                    this.f42239i0 = false;
                } else {
                    this.f42239i0 = true;
                }
                u3();
                boolean z14 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i12 = this.f42214d2;
                if (i12 == 3 || i12 == 5) {
                    z13 = true;
                }
                org.telegram.ui.ActionBar.f1 f1Var = this.f42266o0;
                if (z14) {
                    if (z13) {
                        i10 = R.string.MenuProxyConnected;
                    } else {
                        i10 = R.string.MenuProxyConnecting;
                    }
                } else {
                    i10 = R.string.MenuProxyDisabled;
                }
                f1Var.setSubtext(LocaleController.getString(i10));
                this.f42261n0.b(z14, z13, z10);
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
        org.telegram.ui.Components.sr0 sr0Var;
        int i10;
        dx dxVar = this.B1;
        ArrayList arrayList = this.I2;
        if (dxVar != null) {
            this.f42260n.a(!arrayList.isEmpty(), true);
            Y4();
            if (arrayList.isEmpty()) {
                if (this.R0 == 3 && this.f42226f2 == null) {
                    i10 = R.string.ForwardTo;
                } else {
                    i10 = R.string.SelectChat;
                }
                String string = LocaleController.getString(i10);
                if (this.P3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(string);
                } else {
                    this.actionBar.J(string, true, 350L, org.telegram.ui.Components.is.h);
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
                    if (!this.V3 && (sr0Var = this.G2) != null) {
                        this.V3 = true;
                        String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                        sr0Var.j();
                        sr0Var.F = string2;
                        org.telegram.ui.Components.qr0 qr0Var = sr0Var.f30839a[0];
                        if (string2 != null) {
                            qr0Var.f30280e.l(string2, false);
                        }
                        org.telegram.ui.Components.cd0 cd0Var = new org.telegram.ui.Components.cd0(sr0Var, 29);
                        sr0Var.G = cd0Var;
                        AndroidUtilities.runOnUIThread(cd0Var, 1000L);
                    }
                }
                this.C1.g(Math.max(1, arrayList.size()), true);
                int i11 = this.S0 + (!TextUtils.isEmpty(this.B1.getFieldText()) ? 1 : 0);
                int size = arrayList.size();
                int i12 = 0;
                long j3 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    long longValue = ((Long) obj).longValue();
                    long sendPaidMessagesStars = getMessagesController().getSendPaidMessagesStars(longValue);
                    if (sendPaidMessagesStars <= 0 && longValue > 0) {
                        sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(getMessagesController().isUserContactBlocked(longValue));
                    }
                    j3 += sendPaidMessagesStars;
                }
                this.C1.i(i11, j3, true);
                this.B1.Q1();
                if (this.P3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]));
                } else {
                    this.actionBar.J(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.is.h);
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
        org.telegram.ui.ActionBar.g2 g2Var = this.f42219e1;
        boolean z12 = true;
        if (g2Var != null) {
            g2Var.c(0.0f, true);
        }
        qw qwVar = this.f42322z0;
        if (qwVar != null) {
            qwVar.b(org.telegram.ui.ActionBar.i6.K8, org.telegram.ui.ActionBar.i6.I8, org.telegram.ui.ActionBar.i6.J8, org.telegram.ui.ActionBar.i6.L8, org.telegram.ui.ActionBar.i6.f20801d6);
        }
        ValueAnimator valueAnimator = this.f42301u3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f42301u3 = null;
        }
        if (this.f42296t3 == 0.0f) {
            return;
        }
        z4(-Q3());
        boolean z13 = false;
        int i11 = 0;
        while (true) {
            sy[] syVarArr = this.f42218e0;
            if (i11 >= syVarArr.length) {
                break;
            }
            sy syVar = syVarArr[i11];
            if (syVar != null) {
                syVar.f41834a.I0(true);
            }
            i11++;
        }
        if (this.K) {
            i10 = 81;
        } else {
            i10 = 0;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp(i10 + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f42296t3, 0.0f);
        this.f42301u3 = ofFloat;
        ofFloat.addUpdateListener(new xv(this, max, 1));
        this.f42301u3.addListener(new wx(this, max, 0));
        this.f42301u3.setInterpolator(org.telegram.ui.Components.is.f27443f);
        this.f42301u3.setDuration(200L);
        this.f42301u3.start();
        this.Y0 = false;
        ArrayList arrayList = this.f42197a1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i12);
                f10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
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
        if (this.f42218e0 != null) {
            int i13 = z11;
            while (true) {
                sy[] syVarArr2 = this.f42218e0;
                if (i13 >= syVarArr2.length) {
                    break;
                }
                syVarArr2[i13].d.H = z11;
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
        org.telegram.ui.Components.sr0 sr0Var = this.G2;
        if (sr0Var != null) {
            int i10 = this.currentAccount;
            sr0Var.h(i10);
            sr0Var.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
            ArrayList arrayList = sr0Var.f30843f;
            arrayList.clear();
            ArrayList arrayList2 = this.I2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            org.telegram.ui.Components.qr0 qr0Var = sr0Var.f30839a[0];
            if (sr0Var.f30840b == 1) {
                qr0Var.d.l(sr0Var.c(qr0Var), false);
            }
        }
    }

    public final void Z3(boolean z10) {
        if (this.F3.c()) {
            z10 = true;
        }
        if (!z10 || !this.f42203b2) {
            this.T3 = z10;
            V4(true);
            if (z10) {
                ci.d4 d4Var = this.f42271p0;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                ci.d4 d4Var2 = this.f42276q0;
                if (d4Var2 != null) {
                    d4Var2.e(true);
                }
            }
        }
    }

    public final void Z4(boolean z10) {
        boolean z11;
        if (this.f42253l0 == null) {
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
        kx kxVar = this.E0;
        org.telegram.ui.Components.q5 q5Var2 = null;
        if (kxVar != null && (q5Var = kxVar.f661a0) != null && kxVar.f681q0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                q5Var.j(emojiStatusDocumentId.longValue(), z10);
                q5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z10);
            } else if (user != null && MessagesController.getInstance(kxVar.f669f).isPremiumUser(user)) {
                if (kxVar.N0 == null) {
                    kxVar.N0 = kxVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    kxVar.N0 = new org.telegram.ui.Components.r5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), kxVar.N0);
                }
                kxVar.N0.setColorFilter(new PorterDuffColorFilter(kxVar.f(org.telegram.ui.ActionBar.i6.f21214zh), PorterDuff.Mode.MULTIPLY));
                q5Var.g(kxVar.N0, z10);
                q5Var.m(false, z10);
            } else {
                q5Var.g(null, z10);
                q5Var.m(false, z10);
            }
            q5Var.k(Integer.valueOf(kxVar.f(org.telegram.ui.ActionBar.i6.f21214zh)));
            kxVar.W.invalidate();
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
                this.actionBar.setRightDrawableOnClick(new uv(this, 2));
                k71.t(this.currentAccount);
            } else if (user != null && MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
                if (this.K3 == null) {
                    this.K3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    this.K3 = new org.telegram.ui.Components.r5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.K3);
                }
                this.K3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.f21214zh), PorterDuff.Mode.MULTIPLY));
                this.D3.g(this.K3, z10);
                this.D3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(new uv(this, 3));
                k71.t(this.currentAccount);
            } else {
                this.D3.g(null, z10);
                this.D3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.q5 q5Var3 = this.D3;
            int i10 = org.telegram.ui.ActionBar.i6.f21214zh;
            q5Var3.k(Integer.valueOf(getThemedColor(i10)));
            org.telegram.ui.Cells.o oVar = this.E3;
            if (oVar != null) {
                oVar.setColor(getThemedColor(i10));
            }
            px pxVar = this.M0;
            if (pxVar != null && (pxVar.getContentView() instanceof k71)) {
                org.telegram.ui.ActionBar.j5 titleTextView = this.actionBar.getTitleTextView();
                k71 k71Var = (k71) this.M0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.q5 q5Var4 = this.D3;
                    if (rightDrawable == q5Var4) {
                        q5Var2 = q5Var4;
                    }
                }
                k71Var.y(q5Var2, titleTextView);
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
        ci.d4 d4Var;
        boolean storiesEnabled = getMessagesController().storiesEnabled();
        if (this.N3 != storiesEnabled) {
            U4();
            if (!this.N3 && storiesEnabled && (d4Var = this.f42271p0) != null) {
                d4Var.u();
            }
            this.N3 = storiesEnabled;
        }
        org.telegram.ui.Components.q20 q20Var = this.f42293t0;
        if (q20Var == null) {
            return;
        }
        if (this.R0 == 10) {
            q20Var.setImageResource(R.drawable.floating_check);
            this.f42293t0.setContentDescription(LocaleController.getString(R.string.Done));
            return;
        }
        q20Var.setImageResource(R.drawable.filled_fab_compose_32);
        this.f42293t0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
    }

    public final boolean c4(long j3) {
        if (j3 < 0) {
            return false;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f20189id);
        if ((topics != null && !topics.isEmpty()) || !MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f20189id)) {
            return false;
        }
        return true;
    }

    public final void c5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        boolean z12;
        ai.m9 U3;
        ArrayList arrayList;
        boolean z13;
        boolean z14;
        int i10;
        float f7;
        float f10;
        if (this.E0 != null && this.I == null) {
            nx nxVar = this.F3;
            if ((nxVar == null || !nxVar.c()) && !this.f42274p3 && (kVar = this.actionBar) != null && !kVar.t() && !this.f42254l2) {
                ci.lc lcVar = ci.lc.F2;
                int i11 = 0;
                if ((lcVar != null && lcVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
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
                    if (!z11 && (((arrayList = (U3 = U3()).f1411g) != null && arrayList.size() > 0) || U3.H())) {
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
                    kx kxVar = this.E0;
                    if (z13 != z15) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    kxVar.q(z10, z14);
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
                        ofFloat.addUpdateListener(new dj(1, this));
                        this.J.addListener(new org.telegram.ui.Components.j91(this, 18));
                        this.J.setDuration(200L);
                        this.J.setInterpolator(org.telegram.ui.Components.is.f27443f);
                        this.J.start();
                    } else {
                        kx kxVar2 = this.E0;
                        if (z16 && !isInPreviewMode()) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        kxVar2.setVisibility(i10);
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
                        ofFloat2.addUpdateListener(new cy(this, f13, z12, f11));
                        this.I.addListener(new tx(this, z12, 2));
                        this.I.setDuration(200L);
                        this.I.setInterpolator(org.telegram.ui.Components.is.f27443f);
                        this.I.start();
                        return;
                    }
                    this.K = z12;
                    kx kxVar3 = this.E0;
                    if ((z12 || this.L) && !isInPreviewMode()) {
                        i12 = 0;
                    }
                    kxVar3.setVisibility(i12);
                    if (!z12) {
                        z4(0.0f);
                    } else {
                        this.f42317x3 = -AndroidUtilities.dp(81.0f);
                        z4(-Q3());
                    }
                    while (true) {
                        sy[] syVarArr = this.f42218e0;
                        if (i11 >= syVarArr.length) {
                            break;
                        }
                        sy syVar = syVarArr[i11];
                        if (syVar != null) {
                            syVar.f41834a.requestLayout();
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
        qw qwVar;
        if (!this.F3.c()) {
            if (this.R0 == 3 && (qwVar = this.f42322z0) != null && qwVar.getVisibility() == 0 && this.f42322z0.K > 0) {
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
            dy dyVar = this.C0;
            if (dyVar != null) {
                dyVar.R();
                return true;
            }
            return true;
        }
        return super.closeLastFragment();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.Components.a8 a8Var = new org.telegram.ui.Components.a8(this, context, this.resourceProvider, 3);
        a8Var.setAllowOverlayTitle(true);
        a8Var.L();
        a8Var.C(getThemedColor(org.telegram.ui.ActionBar.i6.f21098t8), false);
        a8Var.C(getThemedColor(org.telegram.ui.ActionBar.i6.f21205z8), true);
        a8Var.D(getThemedColor(org.telegram.ui.ActionBar.i6.f21134v8), false);
        a8Var.D(getThemedColor(org.telegram.ui.ActionBar.i6.f21187y8), true);
        a8Var.k();
        a8Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        a8Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.V2 == 0 || b4())) {
            return a8Var;
        }
        a8Var.setOccupyStatusBar(false);
        return a8Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.createView(android.content.Context):android.view.View");
    }

    public final boolean d4(TLRPC.Dialog dialog) {
        char c10;
        if (dialog == null) {
            return false;
        }
        int i10 = this.f42218e0[0].f41841s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.t() || this.actionBar.u(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f42218e0[0].f41841s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            dialogFilter = dialogFilterArr[c10];
        }
        if (dialogFilter != null) {
            if (dialogFilter.pinnedDialogs.indexOfKey(dialog.f20046id) < 0) {
                return false;
            }
            return true;
        }
        return dialog.pinned;
    }

    public final void d5(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.d5(int, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int r30, int r31, java.lang.Object... r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (!(dialog instanceof ei.k3) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e4() {
        if (this.C2 == null && this.f42263n2 == null) {
            return true;
        }
        return false;
    }

    public final boolean e5(long j3) {
        TLRPC.Chat chat;
        dx dxVar;
        if ((this.S0 <= 1 && ((dxVar = this.B1) == null || dxVar.getVisibility() != 0 || TextUtils.isEmpty(this.B1.getFieldText()))) || !DialogObject.isChatDialog(j3) || (chat = getMessagesController().getChat(Long.valueOf(-j3))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    public final boolean f3(long j3, View view) {
        if (this.f42254l2 && getMessagesController().isForum(j3)) {
            return false;
        }
        Long valueOf = Long.valueOf(j3);
        ArrayList arrayList = this.I2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j3));
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).V(false, true);
            } else if (view instanceof org.telegram.ui.Cells.i6) {
                ((org.telegram.ui.Cells.i6) view).t(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j3));
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
        org.telegram.ui.Components.q80 q80Var = this.L0;
        if (q80Var != null) {
            q80Var.u();
        }
    }

    public final void g3(gg.p0 p0Var) {
        dy dyVar;
        if (this.f42274p3 && (dyVar = this.C0) != null) {
            ArrayList arrayList = dyVar.A0;
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (p0Var.b((gg.p0) arrayList.get(i10))) {
                        return;
                    }
                }
            }
            arrayList.add(p0Var);
            jy jyVar = this.X;
            ArrayList arrayList2 = jyVar.F;
            arrayList2.add(p0Var);
            jyVar.I = arrayList2.size() - 1;
            jyVar.f();
            this.X.f30958r.getText().clear();
            T4(true, null, null, false, true);
        }
    }

    public final void g4(long j3) {
        char c10;
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j3);
        int i10 = 0;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            ArrayList<TLRPC.Dialog> dialogsByCommunity = getMessagesController().getDialogsByCommunity(dialog.community_id);
            if (dialogsByCommunity != null) {
                int size = dialogsByCommunity.size();
                while (i10 < size) {
                    TLRPC.Dialog dialog2 = dialogsByCommunity.get(i10);
                    i10++;
                    g4(dialog2.f20046id);
                }
                return;
            }
            return;
        }
        int i11 = this.f42218e0[0].f41841s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i11 == 7 || i11 == 8) && (!this.actionBar.t() || this.actionBar.u(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f42218e0[0].f41841s == 8) {
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
                    } else if (((TLRPC.Dialog) this.R1.get(i13)).f20046id == j3) {
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
        if (getMessagesController().isForum(j3) || getMessagesController().isMonoForumWithManageRights(j3)) {
            getMessagesController().markAllTopicsAsRead(j3);
        }
        getMessagesController().markMentionsAsRead(j3, 0L);
        MessagesController messagesController = getMessagesController();
        int i15 = dialog.top_message;
        messagesController.markDialogAsRead(j3, i15, i15, dialog.last_message_date, false, 0L, 0, true, 0);
        if (i14 >= 0) {
            this.R1.remove(i14);
            this.f42218e0[0].f41843x.D();
            this.f42218e0[0].q(true);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.y4 getBackButtonState() {
        if (!b4() && !this.F3.f39473f) {
            return org.telegram.ui.ActionBar.y4.f21733b;
        }
        return org.telegram.ui.ActionBar.y4.f21732a;
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
        ofFloat2.addUpdateListener(new qv(this, 2));
        this.Z3.setInterpolator(org.telegram.ui.Components.is.f27444g);
        this.Z3.setDuration(i10);
        this.Z3.start();
        return this.Z3;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.getThemeDescriptions():java.util.ArrayList");
    }

    public final void h3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.V2 == 0 && this.X2 == 0 && Build.VERSION.SDK_INT >= 33 && gk0.p(parentActivity)) {
                if (z10) {
                    showDialog(new gk0(parentActivity, !org.telegram.ui.Components.gf0.a(), new fw(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().syncContacts && this.U1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z10) {
                    org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.g5.v(parentActivity, new yv(this, 1)).f20378a;
                    this.T1 = b2Var;
                    showDialog(b2Var);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.h4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    public final void i3(CharSequence charSequence) {
        int i10;
        if (this.B1 != null) {
            if (this.D2 == null && this.E2 == null && this.F2 == null) {
                return;
            }
            if (this.G2 == null) {
                org.telegram.ui.Components.sr0 sr0Var = new org.telegram.ui.Components.sr0(getParentActivity(), getResourceProvider());
                this.G2 = sr0Var;
                sr0Var.setLayoutClickListener(new uv(this, 0));
                this.G2.setOnModeChangeListener(new vv(this, 0));
                dx dxVar = this.B1;
                org.telegram.ui.Components.sr0 sr0Var2 = this.G2;
                if (sr0Var2 == null) {
                    dxVar.getClass();
                } else {
                    dxVar.G1 = sr0Var2;
                    dxVar.addView(sr0Var2, 0, w7.x5.e(-1, 48, 51));
                    dxVar.f23898g3 = false;
                    dxVar.L();
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
                    org.telegram.ui.Components.sr0 sr0Var3 = this.G2;
                    sr0Var3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        sr0Var3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.F2;
                    if (charSequence2 != null) {
                        org.telegram.ui.Components.sr0 sr0Var4 = this.G2;
                        sr0Var4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            sr0Var4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.B1.setFieldText(charSequence);
            }
            dx dxVar2 = this.B1;
            if (X3()) {
                i10 = R.string.AddCaption;
            } else {
                i10 = R.string.ShareComment;
            }
            dxVar2.setOverrideHint(LocaleController.getString(i10));
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
        nx nxVar;
        if (!this.f42246j2 && (nxVar = this.F3) != null && nxVar.getFragment() != null) {
            return this.F3.getFragment().isLightStatusBar();
        }
        if (i0.a.f(getThemedColor(org.telegram.ui.ActionBar.i6.f20801d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.j3():void");
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
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.e6) null, false);
        f3Var.fixNavigationBar();
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
        tv tvVar = new tv(this, 0);
        f3Var.items = charSequenceArr;
        f3Var.itemIcons = iArr;
        f3Var.onClickListener = tvVar;
        showDialog(f3Var);
    }

    public final int k3() {
        if (this.B1 != null) {
            return (int) (this.f42320y1.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        } else if (this.X2 != 0) {
            return AndroidUtilities.dp(72.0f) + this.f42228f4;
        } else {
            return this.f42228f4 + this.f42238h4;
        }
    }

    public final void k4(android.view.View r25, int r26, s4.i0 r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.k4(android.view.View, int, s4.i0):void");
    }

    public final void l3() {
        AndroidUtilities.runOnUIThread(new ov(this, 2), 300L);
    }

    public final boolean l4(View view, int i10, float f7, org.telegram.ui.Components.qm0 qm0Var) {
        org.telegram.ui.Components.xo0 xo0Var;
        long j3;
        org.telegram.ui.Components.xo0 xo0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.a3) && qm0Var.j(i10) != 21) {
            if (!this.actionBar.t() && !AndroidUtilities.isTablet() && !this.f42254l2 && (view instanceof org.telegram.ui.Cells.s2)) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (!getMessagesController().isForum(s2Var.getDialogId()) && !this.F3.c() && s2Var.S(f7)) {
                    return E4(s2Var);
                }
            }
            nx nxVar = this.F3;
            if (nxVar == null || !nxVar.c()) {
                dy dyVar = this.C0;
                boolean z10 = true;
                if (dyVar != null && qm0Var == (xo0Var2 = dyVar.f26127b0)) {
                    Object J = xo0Var2.J(i10);
                    if (!this.C0.f26127b0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
                        b2Var.R = string;
                        if (J instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) J;
                            if (chat.monoforum) {
                                b2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, ng.d.i(chat, this.currentAccount, false));
                            } else {
                                b2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            makeEncryptedDialogId = -chat.f20042id;
                        } else if (J instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) J;
                            if (user.f20189id == getUserConfig().clientUserId) {
                                b2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                b2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            makeEncryptedDialogId = user.f20189id;
                        } else if (J instanceof TLRPC.EncryptedChat) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) J).user_id));
                            b2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.f20050id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new ai.z1(this, makeEncryptedDialogId, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(b2Var);
                        TextView textView = (TextView) b2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21041q7));
                        }
                        return true;
                    }
                }
                dy dyVar2 = this.C0;
                if (dyVar2 != null && qm0Var == (xo0Var = dyVar2.f26127b0)) {
                    if (this.f42254l2) {
                        k4(view, i10, qm0Var);
                        return false;
                    }
                    if ((view instanceof org.telegram.ui.Cells.i6) && !xo0Var.O(i10)) {
                        j3 = ((org.telegram.ui.Cells.i6) view).getDialogId();
                    } else {
                        j3 = 0;
                    }
                    if (j3 != 0) {
                        J4(j3, view);
                        return true;
                    }
                } else {
                    Object I = ((gg.m) qm0Var).I(i10);
                    if (I instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) I;
                        if (this.f42254l2) {
                            if ((this.R0 == 3 || F3()) && e5(dialog.f20046id)) {
                                if (this.R0 == 1 && F3() && this.f42257m2 && getMessagesController().isForum(dialog.f20046id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f20046id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.R0 != 1) {
                                        z10 = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z10);
                                    bundle.putBoolean("quote", this.O0);
                                    bundle.putBoolean("reply_to", this.N0);
                                    fg1 fg1Var = new fg1(bundle);
                                    fg1Var.L0 = this;
                                    presentFragment(fg1Var);
                                    return false;
                                }
                                f3(dialog.f20046id, view);
                                X4();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            j4(view);
                            return false;
                        } else if (!this.actionBar.t() || !d4(dialog)) {
                            J4(dialog.f20046id, view);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean m3(long j3) {
        int i10;
        int i11 = this.R0;
        if (i11 != 15 && i11 != 16 && this.f42236h2 == null && this.f42290s2) {
            if (DialogObject.isChatDialog(j3)) {
                long j10 = -j3;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    if (this.f42278q2 || !ChatObject.isCanWriteToChannel(j10, this.currentAccount) || (i10 = this.T0) == 2 || i10 == 3) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.SendMessageTitle);
                        int i12 = this.T0;
                        if (i12 == 3) {
                            alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.TodoCantForward);
                        } else if (i12 == 2) {
                            alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.PublicPollCantForward);
                        } else {
                            alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        showDialog(alertDialog$Builder.f20378a);
                        return false;
                    }
                    return true;
                }
                return true;
            } else if (DialogObject.isEncryptedDialog(j3)) {
                if (this.T0 != 0 || this.U0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.f20378a.R = LocaleController.getString(R.string.SendMessageTitle);
                    int i13 = this.T0;
                    if (i13 == 3) {
                        alertDialog$Builder2.f20378a.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i13 != 0) {
                        alertDialog$Builder2.f20378a.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        alertDialog$Builder2.f20378a.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    showDialog(alertDialog$Builder2.f20378a);
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
        Collections.sort(arrayList, new gf(21));
        org.telegram.ui.Components.q80 H = org.telegram.ui.Components.q80.H(this, view);
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
                linearLayout.setBackground(org.telegram.ui.ActionBar.i6.Z(getThemedColor(org.telegram.ui.ActionBar.i6.f20892i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
                j9Var.r(currentUser);
                org.telegram.ui.Components.lh0 lh0Var = new org.telegram.ui.Components.lh0(this, getParentActivity(), z10);
                linearLayout.addView(lh0Var, w7.x5.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(getParentActivity());
                if (z10) {
                    y9Var.setScaleX(0.833f);
                    y9Var.setScaleY(0.833f);
                }
                y9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                y9Var.getImageReceiver().setCurrentAccount(intValue);
                y9Var.e(currentUser, j9Var);
                lh0Var.addView(y9Var, w7.x5.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20909j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.x5.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new org.telegram.ui.Cells.sa(this, intValue, H, 12));
                H.r(linearLayout, w7.x5.n(230, 48));
            }
        }
        ShapeDrawable c02 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.i6.f20801d6));
        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.m1(0.15f, -16777216));
        H.f30126z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        H.W(c02);
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        H.V(5);
        H.Z();
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        int i11;
        int i12;
        int i13 = 8;
        if (i10 == 1) {
            z3();
            B3();
            E3();
            r3();
            C3();
            jy jyVar = this.X;
            me.b bVar = this.f42200b;
            jyVar.setBlurredBackgroundVisibility(bVar.f16341e);
            float b10 = yf.e0.b(bVar.f16341e);
            org.telegram.ui.Components.y9 y9Var = this.f42198a3;
            if (y9Var != null) {
                y9Var.setScaleX(b10);
                this.f42198a3.setScaleY(b10);
                this.f42198a3.setAlpha(b10);
                org.telegram.ui.Components.y9 y9Var2 = this.f42198a3;
                if (b10 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                y9Var2.setVisibility(i12);
            }
            if (this.f42303v0 != null) {
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
                this.f42303v0.setScaleX(lerp);
                this.f42303v0.setScaleY(lerp);
                this.f42303v0.setAlpha(b10);
                ci.d dVar = this.f42303v0;
                int i14 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
                if (i14 > 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                dVar.setVisibility(i11);
                this.f42309w0.setAlpha(b10);
                jh.f fVar = this.f42309w0;
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

    public final void n3(boolean z10) {
        gi.j jVar;
        TLRPC.ChatFull chatFull;
        boolean z11;
        org.telegram.ui.Components.bt btVar = this.J1;
        if (btVar != null && (jVar = this.Q1) != null && (chatFull = this.Z2) != null) {
            if (this.X2 != 0 && chatFull.requests_pending > 0 && !this.f42200b.f16342f) {
                z11 = true;
            } else {
                z11 = false;
            }
            btVar.i(jVar, z11, z10);
            this.Q1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.Z2.requests_pending, new Object[0]));
        }
    }

    public final void n4(int i10, long j3, TLRPC.Chat chat, boolean z10, boolean z11) {
        if (i10 == 103) {
            getMessagesController().deleteDialog(j3, 1, z11);
            return;
        }
        if (chat != null) {
            if (ChatObject.isNotInChat(chat)) {
                getMessagesController().deleteDialog(j3, 0, z11);
            } else {
                getMessagesController().deleteParticipantFromChat(-j3, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, false);
            }
        } else {
            getMessagesController().deleteDialog(j3, 0, z11);
            if (z10 && z11) {
                getMessagesController().blockPeer(j3);
            }
        }
        if (AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(j3));
        }
        getMessagesController().checkIfFolderEmpty(this.V2);
    }

    public final void o3(sy syVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i10;
        boolean z14;
        int L0 = syVar.f41836c.L0();
        int N0 = syVar.f41836c.N0();
        if (!this.f42232g3 && !this.f42255l3) {
            qw qwVar = this.f42322z0;
            if (qwVar == null || qwVar.getVisibility() != 0 || !this.f42322z0.O) {
                int abs = Math.abs(N0 - L0) + 1;
                if (N0 != -1) {
                    s4.d1 K = syVar.f41834a.K(N0);
                    if (K != null && K.f47706f == 11) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f42203b2 = z14;
                    if (z14) {
                        Z3(false);
                    }
                } else {
                    this.f42203b2 = false;
                }
                int i11 = syVar.f41841s;
                if (i11 == 7 || i11 == 8) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                    int i12 = syVar.h;
                    if (i12 >= 0 && i12 < dialogFilters.size() && (dialogFilters.get(syVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= O3(this.currentAccount, syVar.f41841s, 1, this.S1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                        boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                        boolean z15 = !isDialogsEndReached;
                        if (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        z11 = z15;
                        if ((abs <= 0 && N0 >= O3(this.currentAccount, syVar.f41841s, this.V2, this.S1).size() - 10) || (abs == 0 && (((i10 = syVar.f41841s) == 7 || i10 == 8) && !getMessagesController().isDialogsEndReached(this.V2)))) {
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
                                    ty tyVar = ty.this;
                                    if (z12) {
                                        tyVar.getMessagesController().loadDialogs(tyVar.V2, -1, 100, z13);
                                    }
                                    if (z10) {
                                        tyVar.getMessagesController().loadDialogs(1, -1, 100, z11);
                                    } else {
                                        tyVar.getClass();
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
                        ty tyVar = ty.this;
                        if (z12) {
                            tyVar.getMessagesController().loadDialogs(tyVar.V2, -1, 100, z13);
                        }
                        if (z10) {
                            tyVar.getMessagesController().loadDialogs(1, -1, 100, z11);
                        } else {
                            tyVar.getClass();
                        }
                    }
                });
            }
        }
    }

    public final void o4(java.util.ArrayList r40, int r41, boolean r42, boolean r43, java.util.HashSet r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.o4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
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
                dy dyVar = this.C0;
                if (dyVar != null) {
                    dyVar.R();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.q80 q80Var = this.L0;
            if (q80Var != null) {
                if (z10) {
                    q80Var.u();
                    this.L0 = null;
                    return false;
                }
            } else {
                qw qwVar = this.f42322z0;
                if (qwVar != null && qwVar.f24787n) {
                    if (z10) {
                        qwVar.setIsEditing(false);
                        F4(false);
                        return false;
                    }
                } else {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar != null && kVar.t()) {
                        if (z10) {
                            dy dyVar2 = this.C0;
                            if (dyVar2 != null && dyVar2.getVisibility() == 0) {
                                this.C0.Q(false);
                            }
                            Y3(true);
                            return false;
                        }
                    } else if (this.f42200b.f16342f) {
                        if (z10) {
                            this.X.f30958r.getText().clear();
                            this.Y.b(false);
                            this.X.f30958r.clearFocus();
                            return false;
                        }
                    } else {
                        qw qwVar2 = this.f42322z0;
                        if (qwVar2 != null && qwVar2.getVisibility() == 0 && !this.f42232g3) {
                            qw qwVar3 = this.f42322z0;
                            if (!qwVar3.O && !this.f42255l3) {
                                ArrayList arrayList = qwVar3.h;
                                if (!arrayList.isEmpty() && qwVar3.L != ((org.telegram.ui.Components.x00) arrayList.get(0)).f32794a) {
                                    if (z10) {
                                        qw qwVar4 = this.f42322z0;
                                        ArrayList arrayList2 = qwVar4.h;
                                        if (!arrayList2.isEmpty()) {
                                            qwVar4.f((org.telegram.ui.Components.x00) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        dx dxVar = this.B1;
                        if (dxVar != null && dxVar.r0()) {
                            if (z10) {
                                this.B1.k0(true);
                            }
                        } else {
                            kx kxVar = this.E0;
                            if (kxVar.O == 0 && kxVar.S.L0() != 0) {
                                kxVar.h.x0(0);
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
        ci.bb bbVar;
        qw qwVar;
        if (this.V1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                dy dyVar = this.C0;
                if (dyVar != null) {
                    dyVar.f26127b0.R(this.W1, tLObject);
                }
                this.X1 = null;
            }
            this.V1 = false;
        }
        if (!this.K && (qwVar = this.f42322z0) != null && qwVar.getVisibility() == 0 && this.f42281r.f16342f) {
            int i10 = (int) (-this.N);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.f42218e0[0].f41834a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f42319y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        if (!isInPreviewMode() && (bbVar = this.K0) != null && bbVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        y3();
        this.f42282r0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        ci.d4 d4Var;
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
        if (this.f42282r0 && !this.f42288s0 && (d4Var = this.f42271p0) != null && this.N3) {
            this.f42288s0 = true;
            this.f42282r0 = false;
            d4Var.u();
        }
        AndroidUtilities.runOnUIThread(new hw(this, 4), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.q80 q80Var = this.L0;
        if (q80Var != null) {
            q80Var.u();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.b2 b2Var;
        super.onDialogDismiss(dialog);
        if (this.V2 == 0 && this.X2 == 0 && (b2Var = this.T1) != null && dialog == b2Var && getParentActivity() != null) {
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
            this.f42254l2 = bundle.getBoolean("onlySelect", false);
            this.f42257m2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f42278q2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.R0 = this.arguments.getInt("dialogsType", 0);
            this.O0 = this.arguments.getBoolean("quote", false);
            this.N0 = this.arguments.getBoolean("reply_to", false);
            this.P0 = this.arguments.getLong("reply_to_author", 0L);
            this.Q0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f42226f2 = this.arguments.getString("selectAlertString");
            this.f42231g2 = this.arguments.getString("selectAlertStringGroup");
            this.f42236h2 = this.arguments.getString("addToGroupAlertString");
            this.f42284r2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f42290s2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f42295t2 = this.arguments.getBoolean("afterSignup", false);
            this.V2 = this.arguments.getInt("folderId", 0);
            long j3 = this.arguments.getLong("community_id", 0L);
            this.X2 = j3;
            if (j3 != 0) {
                this.Y2 = getMessagesController().getChat(Long.valueOf(this.X2));
                this.Z2 = getMessagesController().getChatFull(this.X2);
            }
            this.f42241i2 = this.arguments.getBoolean("resetDelegate", true);
            this.S0 = this.arguments.getInt("messagesCount", 0);
            this.T0 = this.arguments.getInt("hasPoll", 0);
            this.U0 = this.arguments.getBoolean("hasInvoice", false);
            this.f42300u2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f42300u2);
            this.arguments.getInt("otherwiseRelogin");
            this.f42305v2 = this.arguments.getBoolean("allowGroups", true);
            this.f42311w2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f42316x2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.f42321y2 = this.arguments.getBoolean("allowChannels", true);
            this.f42324z2 = this.arguments.getBoolean("allowUsers", true);
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
        if (this.f42263n2 == null) {
            this.f42214d2 = getConnectionsManager().getConnectionState();
            this.J3.addGlobal(NotificationCenter.emojiLoaded);
            if (!this.f42254l2) {
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
        ai.m9 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.f1422s) {
                ConnectionsManager.getInstance(storiesController.f1406a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new ai.z7(storiesController, 0));
            }
        }
        getMessagesController().loadPinnedDialogs(this.V2, 0L, null);
        if (this.Q3 != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            av avVar = this.Q3;
            if (avVar.getParent() != null) {
                ((ViewGroup) avVar.getParent()).removeView(avVar);
            }
            this.Q3 = null;
        }
        if (b4()) {
            ai.m9 storiesController2 = getMessagesController().getStoriesController();
            if (storiesController2.f1428z) {
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
        this.f42238h4 = i10;
        if (this.W) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f42243i4 = i11;
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
        dx dxVar = this.B1;
        if (dxVar != null) {
            dxVar.z0();
        }
        org.telegram.ui.Components.sr0 sr0Var = this.G2;
        if (sr0Var != null) {
            sr0Var.j();
        }
        org.telegram.ui.Components.fa1 fa1Var = this.H2;
        if (fa1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(fa1Var);
            this.H2 = null;
        }
        UndoView undoView = this.f42319y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f42269o3.unlock();
        this.C2 = null;
        jb1 jb1Var = jb1.f38948b;
        if (jb1Var != null) {
            jb1Var.dismiss();
            jb1.f38948b = null;
        }
    }

    @Override
    public final void onPanTranslationUpdate(float f7) {
        if (this.f42218e0 != null) {
            this.J0 = f7;
            dx dxVar = this.B1;
            int i10 = 0;
            if (dxVar != null && dxVar.r0()) {
                this.fragmentView.setTranslationY(f7);
                while (true) {
                    sy[] syVarArr = this.f42218e0;
                    if (i10 >= syVarArr.length) {
                        break;
                    }
                    syVarArr[i10].setTranslationY(0.0f);
                    i10++;
                }
                if (!this.f42254l2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.tc tcVar = this.f42264n3;
                    if (tcVar != null) {
                        tcVar.l();
                    }
                }
                dy dyVar = this.C0;
                if (dyVar != null) {
                    dyVar.setTranslationY(this.I0);
                    return;
                }
                return;
            }
            while (true) {
                sy[] syVarArr2 = this.f42218e0;
                if (i10 >= syVarArr2.length) {
                    break;
                }
                syVarArr2[i10].setTranslationY(f7);
                i10++;
            }
            if (!this.f42254l2) {
                this.actionBar.setTranslationY(f7);
                org.telegram.ui.Components.tc tcVar2 = this.f42264n3;
                if (tcVar2 != null) {
                    tcVar2.l();
                }
            }
            dy dyVar2 = this.C0;
            if (dyVar2 != null) {
                dyVar2.setTranslationY(this.J0 + this.I0);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.tc tcVar = this.S;
        if (tcVar != null) {
            tcVar.b();
            this.S = null;
        }
        nx nxVar = this.F3;
        if (nxVar != null) {
            nxVar.f39475r = true;
            ux uxVar = nxVar.f39469a;
            if (uxVar != null) {
                uxVar.onPause();
            }
        }
        org.telegram.ui.Components.q80 q80Var = this.L0;
        if (q80Var != null) {
            q80Var.u();
        }
        dx dxVar = this.B1;
        if (dxVar != null) {
            dxVar.B0();
        }
        int i10 = 0;
        UndoView undoView = this.f42319y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        setBulletinDelegate(null);
        if (this.f42218e0 == null) {
            return;
        }
        while (true) {
            sy[] syVarArr = this.f42218e0;
            if (i10 < syVarArr.length) {
                syVarArr[i10].d.getClass();
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
                                gk0.o();
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
                                AndroidUtilities.runOnUIThread(new hw(this, 3));
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
        ty tyVar;
        sy syVar;
        ax axVar;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.Components.xo0 xo0Var;
        ci.bb bbVar;
        super.onResume();
        kx kxVar = this.E0;
        char c10 = 0;
        if (kxVar != null) {
            ArrayList arrayList = kxVar.f691x;
            ai.m9 m9Var = kxVar.f684s;
            m9Var.l(m9Var.f1411g);
            m9Var.l(m9Var.h);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.PeerStories y3 = m9Var.y(((ai.w) arrayList.get(i10)).f1841c);
                if (y3 != null) {
                    m9Var.X(y3);
                }
            }
        }
        nx nxVar = this.F3;
        if (nxVar != null) {
            nxVar.f39475r = false;
            ux uxVar = nxVar.f39469a;
            if (uxVar != null) {
                uxVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (bbVar = this.K0) != null && bbVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.f42218e0 != null) {
            int i11 = 0;
            while (true) {
                sy[] syVarArr = this.f42218e0;
                if (i11 >= syVarArr.length) {
                    break;
                }
                syVarArr[i11].d.l();
                i11++;
            }
        }
        dx dxVar = this.B1;
        if (dxVar != null) {
            dxVar.C0();
        }
        long j3 = 0;
        if (!this.f42254l2 && this.V2 == 0 && this.X2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        dy dyVar = this.C0;
        if (dyVar != null && (xo0Var = dyVar.f26127b0) != null) {
            xo0Var.l();
        }
        if (!this.f42295t2 && getUserConfig().unacceptedTermsOfService != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.V2 == 0 && this.X2 == 0 && this.f42209c2 && !this.f42254l2) {
            int i12 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.f42209c2 = false;
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
                tyVar = this;
                org.telegram.messenger.o1 o1Var = new org.telegram.messenger.o1(tyVar, z13, z11, z12, parentActivity);
                if (tyVar.f42295t2 && (z11 || z13)) {
                    j3 = 4000;
                }
                AndroidUtilities.runOnUIThread(o1Var, j3);
            } else {
                tyVar = this;
            }
        } else {
            tyVar = this;
            if (!tyVar.f42254l2 && tyVar.V2 == 0 && tyVar.X2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(10020)) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.i6.L5), null);
                        alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new vv(this, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.ge0(26));
                        showDialog(alertDialog$Builder.f20378a);
                    }
                } else {
                    return;
                }
            } else if (tyVar.V2 == 0 && tyVar.X2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.i6.L5), null);
                        alertDialog$Builder2.f20378a.T = LocaleController.getString(R.string.PermissionFSILockscreen);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new vv(this, 9));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.ge0(27));
                        showDialog(alertDialog$Builder2.f20378a);
                    }
                } else {
                    return;
                }
            }
        }
        G4();
        if (tyVar.f42218e0 != null) {
            int i13 = 0;
            while (true) {
                sy[] syVarArr2 = tyVar.f42218e0;
                if (i13 >= syVarArr2.length) {
                    break;
                }
                sy syVar2 = syVarArr2[i13];
                if (syVar2.f41841s == 0 && syVar2.v == 2 && syVar2.f41836c.L0() == 0 && W3()) {
                    tyVar.f42218e0[i13].f41836c.h1(1, (int) tyVar.N);
                }
                if (i13 == 0) {
                    tyVar.f42218e0[i13].d.getClass();
                } else {
                    tyVar.f42218e0[i13].d.getClass();
                }
                i13++;
            }
        }
        I4();
        setBulletinDelegate(new y8(this, 4));
        if (tyVar.f42274p3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), tyVar.classGuid);
        }
        d5(0, false);
        W4(false, true);
        c5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            jb1.p(this);
        }
        y3();
        if (tyVar.f42322z0 != null && (syVar = tyVar.f42218e0[0]) != null && (axVar = syVar.d) != null) {
            int i14 = axVar.h;
            if (i14 == 7 || i14 == 8) {
                MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
                if (i14 != 7) {
                    c10 = 1;
                }
                MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                if (dialogFilter != null) {
                    tyVar.f42322z0.h(dialogFilter.localId);
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
        ci.bb bbVar;
        ty tyVar;
        nx nxVar = this.F3;
        if (nxVar != null && nxVar.c()) {
            this.F3.getFragment().onTransitionAnimationEnd(z10, z11);
        } else {
            if (z10 && (bbVar = this.K0) != null && bbVar.getVisibility() == 0) {
                this.K0.setVisibility(8);
                this.K0.setBackground(null);
            }
            if (z10 && this.f42295t2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f33859x0.c(false);
                }
            }
        }
        if (!z10 && (tyVar = this.W2) != null) {
            tyVar.removeSelfFromStack();
        }
        y3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        nx nxVar = this.F3;
        if (nxVar != null && nxVar.c()) {
            this.F3.getFragment().onTransitionAnimationProgress(z10, f7);
        } else {
            ci.bb bbVar = this.K0;
            if (bbVar != null && bbVar.getVisibility() == 0) {
                if (z10) {
                    this.K0.setAlpha(1.0f - f7);
                } else {
                    this.K0.setAlpha(f7);
                }
            }
        }
        y3();
    }

    public final void p3() {
        if (this.f42218e0 != null) {
            int k32 = k3();
            int i10 = 0;
            while (true) {
                sy[] syVarArr = this.f42218e0;
                if (i10 < syVarArr.length) {
                    sy syVar = syVarArr[i10];
                    if (syVar != null) {
                        py pyVar = syVar.f41834a;
                        pyVar.setPadding(0, pyVar.W2, 0, k32);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void p4(long r14, boolean r16, org.telegram.messenger.MessagesController.DialogFilter r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.p4(long, boolean, org.telegram.messenger.MessagesController$DialogFilter, int, boolean):void");
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
    public final boolean presentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        boolean presentFragment = super.presentFragment(n2Var);
        if (presentFragment && this.f42218e0 != null) {
            int i10 = 0;
            while (true) {
                sy[] syVarArr = this.f42218e0;
                if (i10 >= syVarArr.length) {
                    break;
                }
                syVarArr[i10].d.getClass();
                i10++;
            }
        }
        ci.d4 d4Var = this.f42271p0;
        if (d4Var != null) {
            d4Var.e(true);
        }
        ci.d4 d4Var2 = this.f42276q0;
        if (d4Var2 != null) {
            d4Var2.e(true);
        }
        org.telegram.ui.Components.tc.e();
        return presentFragment;
    }

    public final void q3() {
        hh.f fVar = this.f42320y1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.f42320y1.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void q4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20801d6));
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
        sy syVar;
        boolean z10 = true;
        float P3 = P3(true);
        qw qwVar = this.f42322z0;
        if (qwVar != null) {
            if (qwVar.getAlpha() == P3) {
                z10 = false;
            }
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, P3);
            this.f42322z0.setAlpha(P3);
            this.f42322z0.setScaleX(lerp);
            this.f42322z0.setScaleY(lerp);
            qw qwVar2 = this.f42322z0;
            if (P3 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            qwVar2.setVisibility(i10);
            if (z10 && (syVar = this.f42218e0[0]) != null) {
                syVar.f41834a.requestLayout();
            }
        }
        P4();
    }

    public final void r4(sy syVar) {
        int i10;
        org.telegram.ui.Components.k10 k10Var;
        if (syVar.getVisibility() != 0) {
            return;
        }
        int i11 = syVar.d.v;
        if (syVar.f41841s == 0 && W3() && syVar.f41834a.getChildCount() == 0 && syVar.v == 2) {
            ((s4.d0) syVar.f41834a.getLayoutManager()).h1(1, (int) this.N);
        }
        syVar.d.getClass();
        syVar.d.U();
        int h = syVar.d.h();
        if (h == 1 && i11 == 1 && syVar.d.j(0) == 5) {
            syVar.q(true);
        } else {
            syVar.q(false);
            if (h > i11 && (i10 = this.R0) != 11 && i10 != 12 && i10 != 13) {
                syVar.f41844y.b(i11);
            }
        }
        try {
            py pyVar = syVar.f41834a;
            if (this.V2 == 0 && this.X2 == 0) {
                k10Var = syVar.f41842w;
            } else {
                k10Var = null;
            }
            pyVar.setEmptyView(k10Var);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        o3(syVar);
    }

    @Override
    public final void s() {
        u4(true, true);
    }

    public final void s3() {
        int i10;
        int i11;
        float f7 = this.f42260n.f16341e;
        float lerp = AndroidUtilities.lerp(0.2f, 1.0f, f7);
        ii.z1 z1Var = this.C1;
        int i12 = 8;
        if (z1Var != null) {
            z1Var.setScaleX(lerp);
            this.C1.setScaleY(lerp);
            this.C1.setAlpha(f7);
            ii.z1 z1Var2 = this.C1;
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            z1Var2.setVisibility(i11);
        }
        hh.f fVar = this.f42320y1;
        if (fVar != null) {
            fVar.setAlpha(f7);
            hh.f fVar2 = this.f42320y1;
            int i13 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            fVar2.setVisibility(i10);
            this.f42320y1.getFadeView().setAlpha(f7);
            View fadeView = this.f42320y1.getFadeView();
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
            animatorSet.setInterpolator(org.telegram.ui.Components.is.f27443f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        kx kxVar = this.E0;
        if (kxVar != null) {
            if (this.G0 && !z10) {
                kxVar.setVisibility(0);
            } else {
                kxVar.setVisibility(8);
            }
        }
        V4(true);
        R4();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r6, int r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    public final void t3() {
        if (this.actionBar == null) {
            return;
        }
        org.telegram.ui.Components.q20.d(this.actionBar.getBackButton(), Math.max(this.f42296t3, (1.0f - this.f42200b.f16341e) * (1.0f - S3()) * (1.0f - this.f42206c.f16341e)));
    }

    public final void t4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.t4(int):void");
    }

    public final void u3() {
        float f7;
        if (this.f42239i0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.q20.d(this.f42229g0, com.google.android.gms.internal.vision.e2.C(f7, 1.0f - this.f42200b.f16341e, 1.0f - S3(), 1.0f - this.f42206c.f16341e));
    }

    public final void u4(boolean z10, boolean z11) {
        int i10;
        int i11;
        nx nxVar = this.F3;
        if (nxVar != null && nxVar.c()) {
            return;
        }
        if (this.f42218e0[0].f41841s == 0 && W3() && this.f42218e0[0].v == 2) {
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
            org.telegram.ui.Components.ul0 ul0Var = this.f42218e0[0].f41840r;
            ul0Var.f31548b = 1;
            ul0Var.c(i10, i11, false, false);
            s4();
            return;
        }
        this.f42218e0[0].f41836c.h1(i10, i11);
        s4();
    }

    public final void v3() {
        float f7;
        if (SharedConfig.passcodeHash.isEmpty()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.q20.d(this.f42224f0, com.google.android.gms.internal.vision.e2.C(f7, 1.0f - this.f42200b.f16341e, 1.0f - S3(), 1.0f - this.f42206c.f16341e));
    }

    public final void v4(String str, boolean z10) {
        L4(true, false, true, false);
        jy jyVar = this.X;
        if (jyVar != null) {
            jyVar.f30958r.setText(str);
            this.X.f30958r.setSelection(str.length());
        }
    }

    public final void w3() {
        float f7;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.q20.d(this.f42244j0, com.google.android.gms.internal.vision.e2.C(f7, this.f42223f.f16341e, 1.0f - S3(), 1.0f - this.f42206c.f16341e));
        kx kxVar = this.E0;
        if (kxVar != null) {
            kxVar.invalidate();
        }
    }

    public final void w4(float f7) {
        sy[] syVarArr;
        this.f42207c0 = f7;
        for (sy syVar : this.f42218e0) {
            py pyVar = syVar.f41834a;
            for (int i10 = 0; i10 < pyVar.getChildCount(); i10++) {
                View childAt = pyVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= syVar.d.f10720f + 1) {
                    childAt.setAlpha(f7);
                }
            }
        }
    }

    public final void x3() {
        org.telegram.ui.Components.q20.d(this.f42253l0, com.google.android.gms.internal.vision.e2.C(this.f42200b.f16341e, 1.0f - S3(), 1.0f - this.f42206c.f16341e, this.d.f16341e));
    }

    public final void x4(boolean z10, boolean z11) {
        if (this.f42218e0 != null && this.S1 != z10) {
            if (z10) {
                this.R1 = new ArrayList(O3(this.currentAccount, this.f42218e0[0].f41841s, this.V2, false));
            } else {
                this.R1 = null;
            }
            this.S1 = z10;
            sy syVar = this.f42218e0[0];
            syVar.d.G = z10;
            if (!z10 && z11) {
                if (syVar.f41834a.b0()) {
                    this.f42218e0[0].f41834a.post(new hw(this, 9));
                } else {
                    this.f42218e0[0].d.l();
                }
            }
        }
    }

    @Override
    public final fh.d y() {
        return this.f42259m4;
    }

    public final void y3() {
        boolean z10;
        ci.bb bbVar;
        if (!this.f42246j2 && ((bbVar = this.K0) == null || bbVar.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ch0 ch0Var = this.I3;
        if (ch0Var != null) {
            ch0Var.f36716a.v.a(z10, true);
        }
    }

    public final void y4(boolean z10) {
        sy syVar;
        if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
            if (z10) {
                sy[] syVarArr = this.f42218e0;
                if (syVarArr != null && (syVar = syVarArr[0]) != null) {
                    syVar.setLayerType(2, null);
                    this.f42218e0[0].setClipChildren(false);
                    this.f42218e0[0].setClipToPadding(false);
                    this.f42218e0[0].f41834a.setClipChildren(false);
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
            if (this.f42218e0 != null) {
                int i10 = 0;
                while (true) {
                    sy[] syVarArr2 = this.f42218e0;
                    if (i10 >= syVarArr2.length) {
                        break;
                    }
                    sy syVar2 = syVarArr2[i10];
                    if (syVar2 != null) {
                        syVar2.setLayerType(0, null);
                        syVar2.setClipChildren(true);
                        syVar2.setClipToPadding(true);
                        syVar2.f41834a.setClipChildren(true);
                    }
                    i10++;
                }
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setLayerType(0, null);
            }
            kx kxVar = this.E0;
            if (kxVar != null) {
                kxVar.setLayerType(0, null);
            }
            View view2 = this.fragmentView;
            if (view2 != null) {
                ((ViewGroup) view2).setClipChildren(true);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void z3() {
        t3();
        org.telegram.ui.Components.q20.d(this.f42248k0, (1.0f - this.f42200b.f16341e) * (1.0f - S3()) * (1.0f - this.f42206c.f16341e));
        u3();
        x3();
        v3();
        w3();
    }

    public final void z4(float f7) {
        sy[] syVarArr = this.f42218e0;
        int i10 = 0;
        if (syVarArr != null) {
            int paddingTop = syVarArr[0].f41834a.getPaddingTop() + ((int) f7);
            int i11 = 0;
            while (true) {
                sy[] syVarArr2 = this.f42218e0;
                if (i11 >= syVarArr2.length) {
                    break;
                }
                syVarArr2[i11].f41834a.setTopGlowOffset(paddingTop);
                i11++;
            }
        }
        if (this.fragmentView != null && f7 != this.N) {
            this.N = f7;
            org.telegram.ui.Components.tc tcVar = this.f42264n3;
            if (tcVar != null) {
                tcVar.l();
            }
            if (this.E3 != null) {
                float currentActionBarHeight = 1.0f - ((-f7) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                org.telegram.ui.Cells.o oVar = this.E3;
                float f10 = (int) f7;
                float f11 = oVar.f22564f;
                oVar.h = f10;
                oVar.setTranslationY(f11 + f10);
                this.E3.setAlpha(w7.o.a(currentActionBarHeight, 0.0f, 1.0f));
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
