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
public class sy extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, mg.b, me.d, dh0 {
    public static boolean f41914w4;
    public static final boolean[] f41915x4 = new boolean[4];
    public static final org.telegram.ui.Components.os0 f41916y4 = new org.telegram.ui.Components.os0(3);
    public static float f41917z4;
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public cx B1;
    public boolean B2;
    public Long B3;
    public cy C0;
    public ii.z1 C1;
    public my C2;
    public Drawable C3;
    public org.telegram.ui.Components.uv0 D0;
    public org.telegram.ui.ActionBar.u0 D1;
    public ArrayList D2;
    public org.telegram.ui.Components.q5 D3;
    public boolean E;
    public jx E0;
    public final TextPaint E1;
    public String E2;
    public org.telegram.ui.Cells.o E3;
    public boolean F;
    public org.telegram.ui.Components.zs F0;
    public bx F1;
    public CharSequence F2;
    public mx F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public FrameLayout G1;
    public org.telegram.ui.Components.sr0 G2;
    public final ax G3;
    public long H;
    public float H0;
    public bx H1;
    public org.telegram.ui.Components.voip.i H2;
    public final ax H3;
    public ValueAnimator I;
    public float I0;
    public FrameLayout I1;
    public final ArrayList I2;
    public bh0 I3;
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
    public org.telegram.ui.Components.p80 L0;
    public org.telegram.ui.Cells.m L1;
    public int L2;
    public int L3;
    public boolean M;
    public ox M0;
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
    public zu Q3;
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
    public org.telegram.ui.Components.ce0 V0;
    public boolean V1;
    public int V2;
    public boolean V3;
    public boolean W;
    public org.telegram.ui.Cells.s2 W0;
    public long W1;
    public sy W2;
    public float W3;
    public iy X;
    public org.telegram.ui.Cells.s2 X0;
    public TLObject X1;
    public long X2;
    public boolean X3;
    public yf.g0 Y;
    public boolean Y0;
    public int Y1;
    public TLRPC.Chat Y2;
    public boolean Y3;
    public u41 Z;
    public boolean Z0;
    public int Z1;
    public TLRPC.ChatFull Z2;
    public ValueAnimator Z3;
    public final int f41918a;
    public org.telegram.ui.Components.o91 f41919a0;
    public final ArrayList f41920a1;
    public boolean a2;
    public org.telegram.ui.Components.y9 f41921a3;
    public org.telegram.ui.Components.n50 f41922a4;
    public final me.b f41923b;
    public gg.r0 f41924b0;
    public boolean f41925b1;
    public boolean f41926b2;
    public org.telegram.ui.Components.j9 f41927b3;
    public TLRPC.FileLocation f41928b4;
    public final me.b f41929c;
    public float f41930c0;
    public boolean f41931c1;
    public boolean f41932c2;
    public long f41933c3;
    public TLRPC.FileLocation f41934c4;
    public final me.b d;
    public ValueAnimator f41935d0;
    public boolean f41936d1;
    public int f41937d2;
    public boolean f41938d3;
    public org.telegram.ui.Components.sc f41939d4;
    public final me.b f41940e;
    public ry[] f41941e0;
    public org.telegram.ui.ActionBar.f2 f41942e1;
    public boolean f41943e2;
    public boolean f41944e3;
    public int f41945e4;
    public final me.b f41946f;
    public org.telegram.ui.ActionBar.u0 f41947f0;
    public final Paint f41948f1;
    public String f41949f2;
    public AnimatorSet f41950f3;
    public int f41951f4;
    public org.telegram.ui.ActionBar.u0 f41952g0;
    public ImageView f41953g1;
    public String f41954g2;
    public boolean f41955g3;
    public int f41956g4;
    public final me.b h;
    public uy f41957h0;
    public NumberTextView f41958h1;
    public String f41959h2;
    public boolean f41960h3;
    public int f41961h4;
    public boolean f41962i0;
    public final ArrayList f41963i1;
    public boolean f41964i2;
    public float f41965i3;
    public int f41966i4;
    public org.telegram.ui.ActionBar.u0 f41967j0;
    public org.telegram.ui.ActionBar.u0 f41968j1;
    public boolean f41969j2;
    public boolean j3;
    public hh.j f41970j4;
    public org.telegram.ui.ActionBar.u0 f41971k0;
    public org.telegram.ui.ActionBar.u0 f41972k1;
    public boolean f41973k2;
    public int f41974k3;
    public final ah.h f41975k4;
    public org.telegram.ui.ActionBar.u0 f41976l0;
    public org.telegram.ui.ActionBar.u0 l1;
    public boolean f41977l2;
    public boolean f41978l3;
    public final fh.d l4;
    public org.telegram.ui.ActionBar.u0 m0;
    public org.telegram.ui.ActionBar.u0 f41979m1;
    public boolean f41980m2;
    public boolean f41981m3;
    public final fh.d f41982m4;
    public final me.b f41983n;
    public org.telegram.ui.Components.lj0 f41984n0;
    public org.telegram.ui.ActionBar.e1 f41985n1;
    public String f41986n2;
    public org.telegram.ui.Components.sc f41987n3;
    public final fh.c f41988n4;
    public org.telegram.ui.ActionBar.e1 f41989o0;
    public org.telegram.ui.ActionBar.e1 f41990o1;
    public String f41991o2;
    public final AnimationNotificationsLocker f41992o3;
    public final ah.c f41993o4;
    public ci.d4 f41994p0;
    public org.telegram.ui.ActionBar.e1 f41995p1;
    public final MessagesStorage.TopicKey f41996p2;
    public boolean f41997p3;
    public final ah.c f41998p4;
    public ci.d4 f41999q0;
    public org.telegram.ui.ActionBar.e1 f42000q1;
    public boolean f42001q2;
    public boolean f42002q3;
    public final ah.c f42003q4;
    public final me.b f42004r;
    public boolean f42005r0;
    public org.telegram.ui.ActionBar.e1 f42006r1;
    public boolean f42007r2;
    public boolean f42008r3;
    public final ah.c f42009r4;
    public final me.b f42010s;
    public boolean f42011s0;
    public org.telegram.ui.ActionBar.e1 f42012s1;
    public boolean f42013s2;
    public boolean f42014s3;
    public hw f42015s4;
    public org.telegram.ui.Components.q20 f42016t0;
    public org.telegram.ui.ActionBar.e1 f42017t1;
    public boolean f42018t2;
    public float f42019t3;
    public final ArrayList f42020t4;
    public org.telegram.ui.Components.q20 f42021u0;
    public float f42022u1;
    public boolean f42023u2;
    public ValueAnimator f42024u3;
    public final RectF f42025u4;
    public final ph.i v;
    public ci.d f42026v0;
    public float f42027v1;
    public boolean f42028v2;
    public float f42029v3;
    public final RectF f42030v4;
    public boolean f42031w;
    public jh.f f42032w0;
    public AnimatorSet f42033w1;
    public boolean f42034w2;
    public float f42035w3;
    public int f42036x;
    public int f42037x0;
    public float f42038x1;
    public boolean f42039x2;
    public float f42040x3;
    public boolean f42041y;
    public final UndoView[] f42042y0;
    public hh.f f42043y1;
    public boolean f42044y2;
    public int y3;
    public qw f42045z0;
    public FrameLayout f42046z1;
    public boolean f42047z2;
    public boolean f42048z3;

    public sy(Bundle bundle) {
        super(bundle);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f41918a = i10;
        org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.h;
        this.f41923b = new me.b(1, this, isVar, 350L, false);
        this.f41929c = new me.b(2, this, isVar, 350L, false);
        this.d = new me.b(3, this, isVar, 350L, false);
        this.f41940e = new me.b(4, this, isVar, 350L, false);
        this.f41946f = new me.b(5, this, isVar, 350L, false);
        this.h = new me.b(6, this, isVar, 350L, false);
        this.f41983n = new me.b(7, this, isVar, 350L, false);
        this.f42004r = new me.b(8, this, isVar, 350L, false);
        this.f42010s = new me.b(9, this, isVar, 350L, false);
        this.v = new ph.i(new gw(this, 2));
        this.f42036x = -1;
        this.F = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.Q = true;
        this.f41930c0 = 1.0f;
        this.f42042y0 = new UndoView[2];
        this.f41920a1 = new ArrayList();
        this.f41948f1 = new Paint();
        this.f41963i1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.E1 = new TextPaint(1);
        this.U1 = true;
        this.f41932c2 = true;
        this.f41964i2 = true;
        this.f41996p2 = new MessagesStorage.TopicKey();
        this.I2 = new ArrayList();
        this.J2 = true;
        this.f41992o3 = new AnimationNotificationsLocker();
        this.y3 = -1;
        this.G3 = new ax(this, 0);
        this.H3 = new ax(this, 1);
        this.L3 = -4;
        this.M3 = true;
        this.N3 = true;
        this.W3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f42020t4 = arrayList;
        RectF rectF = new RectF();
        this.f42025u4 = rectF;
        RectF rectF2 = new RectF();
        this.f42030v4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        fh.c cVar = new fh.c();
        this.f41988n4 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6));
        if (i11 >= 31) {
            this.f41975k4 = new ah.h(false);
            fh.d dVar = new fh.d(null);
            this.l4 = dVar;
            dVar.j(new xx(this, 0));
            fh.d dVar2 = new fh.d(null);
            this.f41982m4 = dVar2;
            dVar2.j(new xx(this, 3));
            ah.c cVar2 = new ah.c(dVar);
            this.f41993o4 = cVar2;
            cVar2.f547i = LiteMode.isEnabled(262144);
            ah.c cVar3 = new ah.c(dVar2);
            this.f42003q4 = cVar3;
            cVar3.f547i = LiteMode.isEnabled(262144);
            this.f41998p4 = new ah.c(dVar);
        } else {
            this.f41975k4 = null;
            this.l4 = null;
            this.f41982m4 = null;
            this.f41993o4 = new ah.c(cVar);
            this.f42003q4 = new ah.c(cVar);
            this.f41998p4 = new ah.c(cVar);
        }
        this.f42009r4 = new ah.c(cVar);
    }

    public static void B0(sy syVar, float f7, ValueAnimator valueAnimator) {
        syVar.f41941e0[0].setTranslationY((1.0f - syVar.f42019t3) * f7);
        syVar.f42019t3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < syVar.actionBar.getChildCount(); i10++) {
            if (syVar.actionBar.getChildAt(i10).getVisibility() == 0 && syVar.actionBar.getChildAt(i10) != syVar.actionBar.getActionMode() && syVar.actionBar.getChildAt(i10) != syVar.actionBar.getBackButton()) {
                syVar.actionBar.getChildAt(i10).setAlpha(1.0f - syVar.f42019t3);
            }
        }
        syVar.B3();
        syVar.t3();
        View view = syVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void C0(sy syVar) {
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(syVar.getParentActivity(), syVar.resourceProvider);
        acVar.d(R.raw.email_check_inbox, new String[0]);
        acVar.f24555b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.sc.g(syVar, acVar, 2750).j();
        try {
            syVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void D0(org.telegram.ui.sy r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.D0(org.telegram.ui.sy):void");
    }

    public static void E0(sy syVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() == 1) {
            xh.r1 r1Var = new xh.r1(syVar.getParentActivity(), syVar.currentAccount, birthdayState.today.get(0).f20215id, null, null);
            r1Var.W(true);
            syVar.showDialog(r1Var);
            return;
        }
        tg.m1.f0(0, birthdayState);
    }

    public static void F0(sy syVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.sc M = org.telegram.ui.Components.ad.a0(syVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
            M.f30833j = 5000;
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
            syVar.getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (syVar.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(syVar.getParentActivity(), 0, syVar.resourceProvider);
                alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                syVar.showDialog(alertDialog$Builder.f20404a);
                return;
            }
            return;
        }
        org.telegram.messenger.q.q(R.string.UnknownError, org.telegram.ui.Components.ad.a0(syVar), R.raw.error, 36);
    }

    public static void G0(sy syVar) {
        MessagesController.getInstance(syVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        syVar.R4();
    }

    public static void K2(sy syVar, float f7) {
        float f10;
        float f11;
        int i10;
        int i11;
        float clamp = Utilities.clamp(syVar.f42038x1 * 2.0f, 1.0f, 0.0f);
        jx jxVar = syVar.E0;
        float f12 = (1.0f - syVar.f42019t3) * f7 * syVar.H0;
        float f13 = 1.0f - clamp;
        jxVar.setAlpha(f12 * f13);
        int i12 = 0;
        if (!syVar.K && !syVar.M) {
            if (syVar.L) {
                syVar.E0.setTranslationY((Math.max(syVar.N, -syVar.R3()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                syVar.E0.setProgressToCollapse(1.0f);
                jx jxVar2 = syVar.E0;
                jxVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - jxVar2.getY()));
            }
            f10 = 1.0f - syVar.H0;
            syVar.actionBar.setTranslationY(0.0f);
        } else {
            float clamp2 = Utilities.clamp((-syVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (syVar.f42019t3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            syVar.E0.setClipTop(0);
            if (!syVar.K && syVar.M) {
                syVar.E0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                syVar.E0.setProgressToCollapse(1.0f);
                f11 = syVar.H0;
            } else {
                syVar.E0.setTranslationY(((syVar.T / 2.0f) + (Math.max(syVar.N, -syVar.R3()) + syVar.f42029v3)) - AndroidUtilities.dp(8.0f));
                syVar.E0.l(clamp2, !syVar.F3.c());
                if (!syVar.M) {
                    f11 = syVar.H0;
                } else {
                    f10 = 1.0f - clamp3;
                    syVar.actionBar.setTranslationY(0.0f);
                }
            }
            f10 = 1.0f - f11;
            syVar.actionBar.setTranslationY(0.0f);
        }
        float f14 = f10 * f13;
        if (f14 != 1.0f) {
            syVar.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
            syVar.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
            float f15 = (0.6f * f14) + 0.4f;
            syVar.actionBar.getTitlesContainer().setScaleY(f15);
            syVar.actionBar.getTitlesContainer().setScaleX(f15);
            syVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            syVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
            syVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f15);
            syVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f15);
            float f16 = (1.0f - syVar.f42019t3) * f14;
            syVar.actionBar.getTitlesContainer().setAlpha(f16);
            FrameLayout titlesContainer = syVar.actionBar.getTitlesContainer();
            int i13 = (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            titlesContainer.setVisibility(i11);
            syVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f16);
            FrameLayout additionalSubTitleOverlayContainer = syVar.actionBar.getAdditionalSubTitleOverlayContainer();
            if (i13 <= 0) {
                i12 = 4;
            }
            additionalSubTitleOverlayContainer.setVisibility(i12);
            return;
        }
        syVar.actionBar.getTitlesContainer().setScaleY(1.0f);
        syVar.actionBar.getTitlesContainer().setScaleX(1.0f);
        syVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
        syVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
        float f17 = 1.0f - syVar.f42019t3;
        syVar.actionBar.getTitlesContainer().setAlpha(f17);
        FrameLayout titlesContainer2 = syVar.actionBar.getTitlesContainer();
        int i14 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
        if (i14 > 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        titlesContainer2.setVisibility(i10);
        syVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
        FrameLayout additionalSubTitleOverlayContainer2 = syVar.actionBar.getAdditionalSubTitleOverlayContainer();
        if (i14 <= 0) {
            i12 = 4;
        }
        additionalSubTitleOverlayContainer2.setVisibility(i12);
    }

    public static void L2(sy syVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        if (syVar.parentLayout != null && syVar.actionBar != null) {
            float max = Math.max(syVar.f41940e.f16401e, syVar.S3());
            float f7 = 1.0f;
            float f10 = 1.0f - syVar.f42038x1;
            float f11 = max * f10 * f10;
            int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            if (i11 != 0) {
                if (-1 >= i10) {
                    f7 = 0.0f;
                    i10 = -1;
                }
                if (f7 > 0.0f && i11 > 0 && i10 > 0 && (b5Var = syVar.parentLayout) != null) {
                    ((ActionBarLayout) b5Var).p(canvas, (int) (f7 * 255.0f * f11), i10);
                }
            }
        }
    }

    public static org.telegram.ui.Cells.s2 N3(ry ryVar) {
        oy oyVar = ryVar.f41564a;
        for (int i10 = 0; i10 < oyVar.getChildCount(); i10++) {
            View childAt = oyVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s2) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt;
                if (s2Var.P()) {
                    return s2Var;
                }
            }
        }
        return null;
    }

    public static void U(sy syVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(syVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        syVar.R4();
    }

    public static void V(sy syVar, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        syVar.f42019t3 = floatValue;
        syVar.f41941e0[0].setTranslationY((-f7) * floatValue);
        for (int i10 = 0; i10 < syVar.actionBar.getChildCount(); i10++) {
            if (syVar.actionBar.getChildAt(i10).getVisibility() == 0 && syVar.actionBar.getChildAt(i10) != syVar.actionBar.getActionMode() && syVar.actionBar.getChildAt(i10) != syVar.actionBar.getBackButton()) {
                syVar.actionBar.getChildAt(i10).setAlpha(1.0f - syVar.f42019t3);
            }
        }
        View view = syVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        syVar.B3();
        syVar.t3();
    }

    public static void W(sy syVar) {
        ArrayList arrayList = syVar.I2;
        org.telegram.ui.ActionBar.b5 b5Var = syVar.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).y()) {
            syVar.finishPreviewFragment();
        } else if (syVar.R0 == 10) {
            if (syVar.C2 != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i10)).longValue(), 0L));
                }
                syVar.C2.w(syVar, arrayList2, null, false, syVar.J2, syVar.K2, syVar.L2, null);
            }
        } else if (MessagesController.getInstance(syVar.currentAccount).isFrozen()) {
            b.b(syVar.currentAccount);
        } else {
            syVar.presentFragment(new ContactsActivity(a1.g.i("destroyAfterSelect", true)));
        }
    }

    public static void X(sy syVar) {
        MessagesController.getInstance(syVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        syVar.R4();
    }

    public static void Y(sy syVar) {
        PasskeysActivity.a0(syVar.currentAccount, syVar.getParentActivity(), syVar.resourceProvider, true);
    }

    public static void Z(sy syVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(syVar.currentAccount).getClientUserId());
        syVar.presentFragment(new zn(bundle));
    }

    public static void a0(sy syVar, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = syVar.getMessagesController().getUserFull(syVar.getUserConfig().getClientUserId());
        if (userFull != null) {
            tL_birthday2 = userFull.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        syVar.getMessagesController().invalidateContentSettings();
        syVar.getConnectionsManager().sendRequest(updatebirthday, new aa(syVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(syVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        syVar.R4();
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
                CharSequence highlightText = AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (org.telegram.ui.ActionBar.d6) null);
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

    public static void b0(sy syVar, String str) {
        MessagesController.getInstance(syVar.currentAccount).removeSuggestion(0L, str);
        syVar.R4();
    }

    public static void c0(sy syVar, ry ryVar, View view, int i10) {
        int i11;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.v3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.s2;
        if (z10) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
            if (s2Var.f22858n2) {
                syVar.K4(s2Var.getDialogId(), view);
                return;
            }
        }
        if (syVar.F3()) {
            syVar.l4(view, i10, 0.0f, ryVar.d);
            return;
        }
        int i12 = syVar.R0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.r8)) {
            ryVar.d.K();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle i14 = a1.g.i("forImport", true);
            i14.putLongArray("result", new long[]{syVar.getUserConfig().getClientUserId()});
            i14.putInt("chatType", 4);
            String string = syVar.arguments.getString("importTitle");
            if (string != null) {
                i14.putString("title", string);
            }
            j70 j70Var = new j70(i14);
            j70Var.Y = new ww(syVar);
            syVar.presentFragment(j70Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.a3) && ((i11 = ryVar.f41571s) == 7 || i11 == 8)) {
            gg.k kVar = (gg.k) ryVar.d.M.get(0);
            if (kVar != null && kVar.f17211a == 17) {
                tL_chatlists_chatlistUpdates = kVar.f10703i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = syVar.getMessagesController().selectedDialogFilter[ryVar.f41571s - 7];
                if (dialogFilter != null) {
                    int i15 = dialogFilter.f17287id;
                    ?? dbVar = new org.telegram.ui.Components.db(syVar, false);
                    dbVar.Y = -1;
                    dbVar.f30997c0 = "";
                    dbVar.f30998d0 = new ArrayList();
                    dbVar.f31000f0 = "";
                    dbVar.f31002h0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    dbVar.f31003i0 = arrayList;
                    dbVar.f31019z0 = -1;
                    dbVar.C0 = -5;
                    dbVar.Y = i15;
                    dbVar.f30995a0 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    dbVar.f31001g0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = syVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i13).f17287id == i15) {
                                dbVar.f30997c0 = arrayList2.get(i13).name;
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    dbVar.T();
                    syVar.showDialog(dbVar);
                    return;
                }
                return;
            }
        } else if (z10 && !syVar.actionBar.t() && !syVar.F3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.s2) view).Y1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        syVar.k4(view, i10, ryVar.d);
    }

    public static void c1(sy syVar, boolean z10) {
        if (syVar.f41941e0 != null && syVar.M3 != z10) {
            syVar.M3 = z10;
            int i10 = 0;
            while (true) {
                ry[] ryVarArr = syVar.f41941e0;
                if (i10 < ryVarArr.length) {
                    if (z10) {
                        ryVarArr[i10].f41564a.setScrollbarFadingEnabled(false);
                    }
                    syVar.f41941e0[i10].f41564a.setVerticalScrollBarEnabled(z10);
                    if (z10) {
                        syVar.f41941e0[i10].f41564a.setScrollbarFadingEnabled(true);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public static void d0(sy syVar) {
        syVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(syVar.parentLayout, "newChatsRow");
    }

    public static void e0(sy syVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(syVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(syVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new aa(syVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void f0(sy syVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(launchActivity, syVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(syVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void f4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = f41915x4;
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

    public static void h0(sy syVar) {
        if (syVar.f41922a4.g()) {
            MessagesController.getInstance(syVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            syVar.R4();
        }
    }

    public static void j0(sy syVar) {
        MessagesController.getInstance(syVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        syVar.R4();
    }

    public static void k0(sy syVar) {
        MessagesController.getInstance(syVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        syVar.R4();
    }

    public static void l0(sy syVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ai.j jVar;
        try {
            a2Var.dismiss();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (tLObject != null) {
            syVar.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            ai.j jVar2 = new ai.j(syVar, j3, 25);
            Pattern pattern = org.telegram.ui.Components.g5.f26658a;
            if (syVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = syVar.getCurrentAccount();
                    Activity parentActivity = syVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
                    TextView textView = new TextView(parentActivity);
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20930j5, false));
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
                    org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.d6) null);
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
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E8, false));
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
                            j9Var.f27666p = 0.8f;
                            j9Var.g(12);
                            y9Var.h(null, null, j9Var, user);
                            jVar = jVar2;
                        } else {
                            jVar = jVar2;
                            if (user.f20215id == clientUserId) {
                                j9Var.f27666p = 0.8f;
                                j9Var.g(1);
                                y9Var.h(null, null, j9Var, user);
                            } else {
                                j9Var.f27666p = 1.0f;
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
                    syVar.showDialog(alertDialog$Builder.f20404a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.g5.e0(syVar.currentAccount, tL_error, syVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        syVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j3), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public static void m0(sy syVar, int i10) {
        Object obj;
        TLRPC.User user;
        org.telegram.ui.Components.so0 so0Var = syVar.C0.f26177o0;
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
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(syVar.getParentActivity(), 0, syVar.resourceProvider);
            String string = LocaleController.getString(R.string.AppsClearSearch);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
            a2Var.R = string;
            a2Var.T = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.y2(28, syVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        }
    }

    public static void n0(sy syVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        HashSet hashSet2;
        if (i10 == 102) {
            syVar.getMessagesController().setDialogsInTransaction(true);
            if (z10) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            syVar.o4(arrayList, i10, false, false, hashSet2);
            syVar.getMessagesController().setDialogsInTransaction(false);
            syVar.getMessagesController().checkIfFolderEmpty(syVar.V2);
            int i11 = syVar.V2;
            if (i11 != 0 && syVar.O3(syVar.currentAccount, syVar.f41941e0[0].f41571s, i11, false).size() == 0) {
                syVar.f41941e0[0].f41564a.setEmptyView(null);
                syVar.f41941e0[0].f41572w.setVisibility(4);
                syVar.finishFragment();
                return;
            }
            return;
        }
        syVar.o4(arrayList, i10, false, false, null);
    }

    public static void n1(sy syVar, ry ryVar, float f7) {
        if (syVar.T != f7) {
            syVar.T = f7;
            int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            int i11 = 0;
            if (i10 == 0) {
                syVar.U = false;
            }
            syVar.E0.setOverscroll(f7);
            ryVar.f41564a.setViewsOffset(f7);
            oy oyVar = ryVar.f41564a;
            if (i10 != 0) {
                i11 = 2;
            }
            oyVar.setOverScrollMode(i11);
            syVar.fragmentView.invalidate();
            if (f7 > AndroidUtilities.dp(90.0f) && !syVar.U) {
                jx jxVar = syVar.E0;
                ValueAnimator valueAnimator = jxVar.H0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    jxVar.i(jxVar.f680p0, true);
                    syVar.U = true;
                    syVar.getOrCreateStoryViewer().s(new nv(syVar, 19));
                }
            }
        }
    }

    public static boolean o1(sy syVar, ry ryVar) {
        if (!syVar.F3.c()) {
            int i10 = (int) (-syVar.N);
            int Q3 = syVar.Q3();
            int R3 = syVar.R3();
            if (i10 != 0 && i10 != Q3 && i10 != R3 && ryVar.f41564a.canScrollVertically(-1)) {
                if (R3 < i10 && i10 < Q3) {
                    int dp = AndroidUtilities.dp(48.0f);
                    int i11 = i10 - R3;
                    if (i11 < dp / 2) {
                        ryVar.f41565b.x(-i11);
                        return true;
                    }
                    ryVar.f41565b.x(dp - i11);
                    return true;
                }
                float f7 = 1.0f;
                if (syVar.f42019t3 != 1.0f) {
                    f7 = Utilities.clamp((-syVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
                }
                if (f7 < syVar.E0.B0) {
                    ryVar.f41565b.x(-i10);
                    return true;
                }
                ryVar.f41565b.x(R3 - i10);
                return true;
            }
            return false;
        }
        return false;
    }

    public static void p0(sy syVar, int i10, org.telegram.ui.Components.p80 p80Var) {
        CharSequence charSequence;
        if (syVar.currentAccount != i10) {
            p80Var.u();
            if (syVar.getParentActivity() == null) {
                return;
            }
            my myVar = syVar.C2;
            LaunchActivity launchActivity = (LaunchActivity) syVar.getParentActivity();
            ArrayList arrayList = syVar.D2;
            String str = syVar.E2;
            CharSequence charSequence2 = syVar.F2;
            cx cxVar = syVar.B1;
            if (cxVar != null) {
                charSequence = cxVar.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.K0(i10);
            sy syVar2 = new sy(syVar.arguments);
            syVar2.C2 = myVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    syVar2.D2 = null;
                } else {
                    syVar2.D2 = arrayList;
                    syVar2.E2 = null;
                    if (syVar2.B1 != null) {
                        syVar2.i3(charSequence);
                    } else {
                        syVar2.U3 = charSequence;
                    }
                }
            } else if (str != null) {
                syVar2.B4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    syVar2.F2 = null;
                } else {
                    syVar2.F2 = charSequence2;
                    syVar2.E2 = null;
                    syVar2.D2 = null;
                    if (syVar2.B1 != null) {
                        syVar2.i3(charSequence);
                    } else {
                        syVar2.U3 = charSequence;
                    }
                }
            }
            launchActivity.q0(syVar2, false, true);
        }
    }

    public static String p2(sy syVar) {
        String shortName;
        ArrayList arrayList = syVar.I2;
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
                if (longValue == syVar.getUserConfig().getClientUserId()) {
                    sb2.append(LocaleController.getString(R.string.SavedMessages));
                } else {
                    if (arrayList.size() == 1) {
                        shortName = DialogObject.getName(syVar.currentAccount, longValue);
                    } else {
                        shortName = DialogObject.getShortName(syVar.currentAccount, longValue);
                    }
                    sb2.append(shortName);
                }
            }
            return LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        }
        return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
    }

    public static void q0(sy syVar) {
        String str;
        MessagesController messagesController = MessagesController.getInstance(syVar.currentAccount);
        if (syVar.A3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        messagesController.removeSuggestion(0L, str);
        syVar.R4();
    }

    public static void r0(sy syVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.C0(launchActivity, syVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            mj1.a(syVar.getParentActivity(), new y(syVar, tL_attachMenuBot, launchActivity, 7), null);
        }
    }

    public static void s0(sy syVar) {
        b.c(syVar.getParentActivity(), syVar.currentAccount, syVar.getResourceProvider());
    }

    public static void t0(final int i10, final long j3, TLRPC.Chat chat, final sy syVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        syVar.Y3(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                syVar.getMessagesController().deleteDialog(j3, 2, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i14 = syVar.V2) != 0 && syVar.O3(syVar.currentAccount, syVar.f41941e0[0].f41571s, i14, false).size() == 1) {
            syVar.f41941e0[0].f41572w.setVisibility(4);
        }
        syVar.y3 = 3;
        int i15 = -1;
        if (i10 == 102) {
            syVar.x4(true, true);
            if (syVar.R1 != null) {
                i13 = 0;
                while (i13 < syVar.R1.size()) {
                    if (((TLRPC.Dialog) syVar.R1.get(i13)).f20072id == j3) {
                        break;
                    }
                    i13++;
                }
            }
            i13 = -1;
            syVar.l3();
            i11 = i13;
        } else {
            i11 = -1;
        }
        UndoView V3 = syVar.V3();
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
                    syVar.n4(i10, j3, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(syVar.O3(syVar.currentAccount, syVar.f41941e0[0].f41571s, syVar.V2, false));
        int i16 = 0;
        while (true) {
            if (i16 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i16)).f20072id == j3) {
                i15 = i16;
                break;
            } else {
                i16++;
            }
        }
        if (i10 == 102) {
            if (i11 >= 0 && i15 < 0 && (arrayList = syVar.R1) != null) {
                arrayList.remove(i11);
                syVar.f41941e0[0].f41573x.D();
                syVar.f41941e0[0].q(true);
                return;
            }
            syVar.x4(false, true);
        }
    }

    public static void u0(sy syVar) {
        BirthdayController.getInstance(syVar.currentAccount).hide();
        MessagesController.getInstance(syVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        syVar.R4();
        org.telegram.ui.Components.sc G = org.telegram.ui.Components.ad.a0(syVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f30833j = 5000;
        G.j();
    }

    public static void v0(sy syVar) {
        MessagesController.getInstance(syVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        syVar.R4();
    }

    public static void w0(sy syVar) {
        if (!syVar.N3) {
            ci.d4 d4Var = syVar.f41999q0;
            if (d4Var != null) {
                if (d4Var.V) {
                    return;
                }
                AndroidUtilities.removeFromParent(d4Var);
            }
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.h6.Gi, 0, new gw(syVar, 8));
            ci.d4 d4Var2 = new ci.d4(syVar.getParentActivity(), 2);
            d4Var2.q(8.0f);
            d4Var2.d = 8000L;
            d4Var2.i();
            d4Var2.p(true);
            d4Var2.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
            d4Var2.s(replaceSingleTag);
            d4Var2.l(1.0f, -40.0f);
            d4Var2.h(syVar.getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
            syVar.f41999q0 = d4Var2;
            d4Var2.setTranslationY((-syVar.f41951f4) - syVar.f41961h4);
            ((ViewGroup) syVar.fragmentView).addView(syVar.f41999q0, w7.x5.a(240.0f, 12.0f, 0.0f, 68.0f, 40.0f, -1, 87));
            syVar.f41999q0.u();
            return;
        }
        ci.d4 d4Var3 = syVar.f41994p0;
        if (d4Var3 != null) {
            d4Var3.e(true);
        }
        ai.g9 o9 = MessagesController.getInstance(syVar.currentAccount).getStoriesController().o();
        if (o9 != null && o9.a(syVar.currentAccount, 1)) {
            syVar.showDialog(new rg.j0(o9.b(), syVar.currentAccount, syVar.getParentActivity(), syVar, null));
            return;
        }
        ci.lc D = ci.lc.D(syVar.getParentActivity(), syVar.currentAccount);
        D.f5532x = new xx(syVar, 4);
        D.Q(null);
    }

    public static void x0(sy syVar) {
        MessagesController.getInstance(syVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        syVar.R4();
        org.telegram.ui.Components.sc G = org.telegram.ui.Components.ad.a0(syVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f30833j = 5000;
        G.j();
    }

    public static void y0(sy syVar) {
        MessagesController.getInstance(syVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        syVar.R4();
        org.telegram.ui.Components.sc J = org.telegram.ui.Components.ad.a0(syVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new nv(syVar, 1));
        J.f30833j = 5000;
        J.j();
    }

    public static void z0(sy syVar) {
        boolean z10 = true;
        try {
            ((org.telegram.ui.Components.dk0) ((org.telegram.ui.Components.j9) syVar.M1.h.getImageReceiver().getStaticThumb()).B).H(true);
        } catch (Exception unused) {
        }
        if (syVar.f41922a4 == null) {
            org.telegram.ui.Components.n50 n50Var = new org.telegram.ui.Components.n50(0, true, true);
            syVar.f41922a4 = n50Var;
            n50Var.H = true;
            n50Var.f29024a = syVar;
            n50Var.f29025b = new gy(syVar);
            syVar.getMediaDataController().checkFeaturedStickers();
            syVar.getMessagesController().loadSuggestedFilters();
            syVar.getMessagesController().loadUserInfo(syVar.getUserConfig().getCurrentUser(), true, syVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(syVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(syVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(syVar.currentAccount).getCurrentUser();
        }
        if (user != null) {
            org.telegram.ui.Components.yi yiVar = syVar.f41922a4.f29026c;
            if (yiVar != null) {
                yiVar.e1();
            }
            org.telegram.ui.Components.n50 n50Var2 = syVar.f41922a4;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            n50Var2.n(z10, new nv(syVar, 0), new ov(syVar, 0), 0);
        }
    }

    @Override
    public final void A(float f7, int i10) {
        org.telegram.ui.ActionBar.u0 u0Var;
        if (i10 == 3 && (u0Var = this.f41976l0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) u0Var.getIconView().getDrawable();
            if (this.d.f16402f) {
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
        this.X.f31038r.setContentDescription(string);
        this.X.f31038r.setHint(string);
    }

    public final void A4(float f7) {
        int i10;
        int i11;
        this.f42038x1 = f7;
        if (this.f42008r3 && this.actionBar != null) {
            if (this.V2 == 0 && this.X2 == 0) {
                i10 = org.telegram.ui.ActionBar.h6.f21156v8;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.O8;
            }
            int themedColor = getThemedColor(i10);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.h6.f21209y8;
            kVar.D(i0.a.d(this.f42038x1, themedColor, getThemedColor(i12)), false);
            this.actionBar.D(i0.a.d(this.f42038x1, getThemedColor(i12), getThemedColor(i12)), true);
            if (this.V2 == 0 && this.X2 == 0) {
                i11 = org.telegram.ui.ActionBar.h6.f21120t8;
            } else {
                i11 = org.telegram.ui.ActionBar.h6.N8;
            }
            int themedColor2 = getThemedColor(i11);
            this.actionBar.C(i0.a.d(this.f42038x1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.h6.f21227z8)), false);
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
        return Arrays.asList(new mg.a(LocaleController.getString(R.string.DebugDialogsActivity)), new mg.a(LocaleController.getString(R.string.ClearLocalDatabase), new nv(this, 28)), new mg.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new nv(this, 29)));
    }

    public final void B3() {
        float f7;
        int i10;
        if (this.X == null) {
            return;
        }
        float a2 = 1.0f - w7.o.a(((-this.N) - R3()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.f42019t3, this.h.f16401e);
        float f10 = this.f41923b.f16401e;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float max2 = f7 * (1.0f - this.f41929c.f16401e) * (1.0f - max) * Math.max(f10, (1.0f - S3()) * a2);
        this.X.setAlpha(max2);
        iy iyVar = this.X;
        boolean z10 = false;
        if (max2 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        iyVar.setVisibility(i10);
        if (max2 <= 0.01f) {
            z10 = true;
        }
        this.f41946f.a(z10, true);
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
            if (this.f41919a0 != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float f10 = f7 * this.f41923b.f16401e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f10);
            this.Z.setScaleX(lerp);
            this.Z.setScaleY(lerp);
            this.Z.setAlpha(f10);
            u41 u41Var = this.Z;
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            u41Var.setVisibility(i11);
        }
        org.telegram.ui.Components.o91 o91Var = this.f41919a0;
        me.b bVar = this.f42010s;
        if (o91Var != null) {
            float f11 = 1.0f - bVar.f16401e;
            o91Var.setAlpha(f11);
            org.telegram.ui.Components.o91 o91Var2 = this.f41919a0;
            if (f11 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            o91Var2.setVisibility(i10);
        }
        gg.r0 r0Var = this.f41924b0;
        if (r0Var != null) {
            float f12 = bVar.f16401e;
            r0Var.setAlpha(f12);
            gg.r0 r0Var2 = this.f41924b0;
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
                jx jxVar = this.E0;
                if (jxVar != null) {
                    jxVar.setTranslationX(f10);
                }
                iy iyVar = this.X;
                if (iyVar != null) {
                    iyVar.setTranslationX(f10);
                }
                mx mxVar = this.F3;
                if (mxVar != null && mxVar.getFragmentView() != null && !this.f42041y) {
                    this.F3.getFragmentView().setTranslationX(f10);
                    return;
                }
                return;
            }
            float f11 = 1.0f - this.W3;
            float f12 = (-AndroidUtilities.dp(4.0f)) * f11;
            float f13 = 1.0f - (f11 * 0.05f);
            jx jxVar2 = this.E0;
            if (jxVar2 != null) {
                jxVar2.setScaleX(f13);
                this.E0.setScaleY(f13);
                this.E0.setTranslationX(f12);
                this.E0.setPivotX(0.0f);
                this.E0.setPivotY(0.0f);
            }
            iy iyVar2 = this.X;
            if (iyVar2 != null) {
                iyVar2.setTranslationX(f12);
                this.X.setScaleX(f13);
                this.X.setScaleY(f13);
            }
            mx mxVar2 = this.F3;
            if (mxVar2 != null && mxVar2.getFragmentView() != null) {
                if (!this.f42041y) {
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
            int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f41918a);
            if (this.f41919a0 != null) {
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
            cy cyVar = this.C0;
            SparseArray sparseArray = cyVar.h;
            cyVar.U0 = i14;
            cyVar.V0 = i12;
            ai.w0 w0Var = cyVar.V;
            if (z10) {
                w0Var.o1(0, i14, 0, i12);
            } else {
                w0Var.setPadding(0, i14, 0, i12);
            }
            cyVar.M0.j(cyVar.U0, cyVar.V0, z10);
            org.telegram.ui.Components.ro0 ro0Var = cyVar.W;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ro0Var.getLayoutParams();
            int i15 = marginLayoutParams.topMargin;
            int i16 = cyVar.U0;
            if (i15 != i16 || marginLayoutParams.bottomMargin != cyVar.V0) {
                marginLayoutParams.topMargin = i16;
                marginLayoutParams.bottomMargin = cyVar.V0;
                ro0Var.requestLayout();
            }
            org.telegram.ui.Components.ep0.P(cyVar.f26169f0, cyVar.f26172i0, cyVar.U0, cyVar.V0, z10);
            org.telegram.ui.Components.ep0.P(cyVar.f26174k0, cyVar.f26176n0, cyVar.U0, cyVar.V0, z10);
            org.telegram.ui.Components.ep0.P(cyVar.f26180r0, cyVar.f26183u0, cyVar.U0, cyVar.V0, z10);
            org.telegram.ui.Components.di0 di0Var = cyVar.f26178p0;
            int i17 = cyVar.U0;
            int i18 = cyVar.V0;
            di0Var.setClipToPadding(false);
            org.telegram.ui.Components.l71 l71Var = di0Var.f25781c;
            di0Var.J = z10;
            di0Var.setPadding(0, i17, 0, i18);
            if (z10) {
                l71Var.o1(0, i17, 0, i18);
            } else {
                l71Var.setPadding(0, i17, 0, i18);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) l71Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i17;
            marginLayoutParams2.bottomMargin = -i18;
            di0Var.J = false;
            org.telegram.ui.Components.co0 co0Var = cyVar.G0;
            if (co0Var != null) {
                co0Var.b(cyVar.U0, cyVar.V0, z10);
            }
            int size = sparseArray.size();
            for (int i19 = 0; i19 < size; i19++) {
                View view = (View) sparseArray.valueAt(i19);
                if (view instanceof v10) {
                    ((v10) view).j(cyVar.U0, cyVar.V0, z10);
                }
            }
            for (int i20 = 0; i20 < cyVar.getChildCount(); i20++) {
                if (cyVar.getChildAt(i20) instanceof v10) {
                    ((v10) cyVar.getChildAt(i20)).j(cyVar.U0, cyVar.V0, z10);
                }
            }
        }
    }

    public final void D4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.x6 x6Var = new org.telegram.ui.Components.x6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.voip.i(9, this, r0), new cj(r0, 18));
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(getParentActivity(), getResourceProvider());
        z2Var.c(x6Var);
        org.telegram.ui.ActionBar.e3 e3Var = z2Var.f21746a;
        e3Var.show();
        org.telegram.ui.ActionBar.e3[] e3VarArr = {e3Var};
        e3Var.fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.h6.f20893h5));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.E4(org.telegram.ui.Cells.s2):boolean");
    }

    public boolean F3() {
        if (this.R0 == 10) {
            return true;
        }
        return false;
    }

    public final void F4(boolean z10) {
        float f7;
        this.f41929c.a(z10, true);
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
        this.O3.addListener(new sx(this, z10, 1));
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
                cy cyVar = this.C0;
                if (cyVar != null) {
                    cyVar.f26165b0.R(this.W1, tLObject);
                }
                this.X1 = null;
                return;
            }
            return;
        }
        this.V1 = true;
    }

    public final void G4() {
        if (!this.A0 && getMessagesController().dialogFiltersLoaded && getMessagesController().showFiltersTooltip && this.f42045z0 != null && getMessagesController().getDialogFilters().isEmpty() && !this.isPaused && getUserConfig().filtersLoaded && !this.inPreviewMode) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("filterhint", false)) {
                globalMainSettings.edit().putBoolean("filterhint", true).apply();
                AndroidUtilities.runOnUIThread(new gw(this, 10), 1000L);
            }
        }
    }

    public final void H3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.f21322n0) {
            kVar.h(true);
            this.f41997p3 = false;
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
        org.telegram.ui.Components.voip.i iVar;
        org.telegram.ui.ActionBar.d6 d6Var;
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
        org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(this, this.f41971k0);
        int i15 = org.telegram.ui.ActionBar.h6.A8;
        H.S(getThemedColor(i15), getThemedColor(i15));
        H.f29779s = 8;
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
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new nv(this, 4), false);
                H.k();
            }
            H.i(new nv(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.Y2.collapsed_in_dialogs);
            H.i(new nv(this, 8), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.Y2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else if (b4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new nv(this, 9), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new nv(this, 10), false);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else {
            org.telegram.ui.ActionBar.d6 d6Var2 = this.resourceProvider;
            if (d6Var2 != null) {
                q6 = d6Var2.a();
            } else {
                q6 = org.telegram.ui.ActionBar.h6.I.q();
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
            H.c(i10, LocaleController.getString(i11), new nv(this, 11), false);
            H.k();
            H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new nv(this, 12), false);
            H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new nv(this, 13), false);
            ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
            if (applicationLoader != null) {
                applicationLoader.addItemOptions(H);
            }
            if (getMessagesController().config.walletAvailable.get()) {
                H.c(R.drawable.ic_gram, LocaleController.getString(R.string.WalletAttachMoney), new nv(this, 14), false);
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
                            rv rvVar = new rv(this, tL_attachMenuBot2, launchActivity, 0);
                            org.telegram.ui.Components.voip.i iVar2 = new org.telegram.ui.Components.voip.i(8, this, tL_attachMenuBot2);
                            org.telegram.ui.ActionBar.d6 d6Var3 = H.d;
                            if (H.f29754e != null) {
                                int i18 = org.telegram.ui.ActionBar.h6.F8;
                                int i19 = org.telegram.ui.ActionBar.h6.E8;
                                f7 = f10;
                                org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(0, H.f29754e, H.d, false, false);
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
                                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.h6.f20806c7, 1.0f);
                                    if (svgThumb != null) {
                                        Integer num = H.f29766k0;
                                        if (num != null) {
                                            w05 = num.intValue();
                                        } else {
                                            w05 = org.telegram.ui.ActionBar.h6.w0(i18, d6Var3);
                                        }
                                        charSequence2 = charSequence;
                                        svgThumb.setColorFilter(new PorterDuffColorFilter(w05, PorterDuff.Mode.SRC_IN));
                                    } else {
                                        charSequence2 = charSequence;
                                    }
                                    iVar = iVar2;
                                    e1Var = e1Var2;
                                    i13 = i19;
                                    i12 = i18;
                                    d6Var = d6Var3;
                                    e1Var.h(charSequence2, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                                    org.telegram.ui.Components.y9 y9Var = e1Var.h;
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
                                    iVar = iVar2;
                                    d6Var = d6Var3;
                                    CharSequence charSequence3 = charSequence;
                                    e1Var = e1Var2;
                                    i12 = i18;
                                    i13 = i19;
                                    e1Var.g(charSequence3, R.drawable.msg_bot, null);
                                }
                                Integer num2 = H.f29764j0;
                                if (num2 != null) {
                                    w02 = num2.intValue();
                                } else {
                                    w02 = org.telegram.ui.ActionBar.h6.w0(i13, d6Var);
                                }
                                Integer num3 = H.f29766k0;
                                if (num3 != null) {
                                    w03 = num3.intValue();
                                } else {
                                    w03 = org.telegram.ui.ActionBar.h6.w0(i12, d6Var);
                                }
                                e1Var.c(w02, w03);
                                Integer num4 = H.f29766k0;
                                if (num4 != null) {
                                    w04 = num4.intValue();
                                } else {
                                    w04 = org.telegram.ui.ActionBar.h6.w0(i12, d6Var);
                                }
                                e1Var.setIconColorImage(w04);
                                Integer num5 = H.f29768l0;
                                if (num5 != null) {
                                    m12 = num5.intValue();
                                } else {
                                    m12 = org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
                                }
                                e1Var.setSelectorColor(m12);
                                e1Var.setOnClickListener(new org.telegram.ui.Components.vt(8, H, rvVar));
                                e1Var.setOnLongClickListener(new ai.r3(3, H, iVar));
                                int i20 = H.S;
                                if (i20 > 0) {
                                    e1Var.setMinimumWidth(AndroidUtilities.dp(i20));
                                    H.r(e1Var, w7.x5.n(H.S, -2));
                                } else {
                                    H.r(e1Var, w7.x5.n(-1, -2));
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
                H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new nv(this, 6), false);
            }
            org.telegram.ui.ActionBar.e1 e1Var3 = this.f41989o0;
            if (e1Var3 != null) {
                e1Var3.f20585b.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20777ai));
                this.f41989o0.setOnClickListener(new qv(0, this, H));
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                    H.k();
                    H.d(this.f41989o0);
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
        org.telegram.ui.ActionBar.y j3 = this.actionBar.j(str);
        boolean z10 = this.W;
        ArrayList arrayList = this.f41963i1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f41953g1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f41953g1.setImageDrawable(new org.telegram.ui.ActionBar.f2(true));
            this.f41953g1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f21209y8), PorterDuff.Mode.MULTIPLY));
            this.f41953g1.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f21227z8), 1, -1));
            this.f41953g1.setOnClickListener(new tv(this, 6));
            j3.addView(this.f41953g1, w7.x5.q(54, 54, 16));
            arrayList.add(this.f41953g1);
        }
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f41958h1 = numberTextView;
        int i10 = 18;
        numberTextView.setTextSize(18);
        this.f41958h1.setTypeface(AndroidUtilities.bold());
        this.f41958h1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21209y8));
        NumberTextView numberTextView2 = this.f41958h1;
        if (!this.W) {
            i10 = 72;
        }
        j3.addView(numberTextView2, w7.x5.m(1.0f, 0, -1, i10, 0, 0));
        this.f41958h1.setOnTouchListener(new bi.d(2));
        this.f41972k1 = j3.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.l1 = j3.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.f41979m1 = j3.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.f41968j1 = j3.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.u0 h = j3.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        j3.addView(new View(getParentActivity()), w7.x5.n(5, -1));
        this.f42000q1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.f41985n1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.f41990o1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.f41995p1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.f42012s1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.f42006r1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.f42017t1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.l1.setOnLongClickListener(new bw(this, 1));
        arrayList.add(this.f41972k1);
        arrayList.add(this.f41979m1);
        arrayList.add(this.l1);
        arrayList.add(this.f41968j1);
        arrayList.add(h);
        Q4(false);
    }

    public final void I4() {
        if (this.R3 == null) {
            for (String str : getMessagesController().pendingSuggestions) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                    alertDialog$Builder.f20404a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new uv(this, 6));
                    showDialog(alertDialog$Builder.f20404a, new ov(this, 1));
                    this.R3 = str;
                    return;
                }
            }
        }
    }

    public final void J3() {
        int i10;
        cy cyVar = this.C0;
        if ((cyVar != null && cyVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f41986n2 != null) {
            i10 = 2;
        } else if (!this.f41977l2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        cy cyVar2 = new cy(this, getParentActivity(), this, i10, this.R0, this.V2, this.X2, new xx(this, 1));
        this.C0 = cyVar2;
        ((ly) this.fragmentView).addView(cyVar2, this.B0);
        cy cyVar3 = this.C0;
        cyVar3.f26165b0.U = new ey(this);
        cyVar3.f26172i0.setOnItemClickListener(new uv(this, 1));
        this.C0.f26176n0.setOnItemClickListener(new uv(this, 2));
        this.C0.f26183u0.setOnItemClickListener(new yv(this, 0));
        this.C0.f26176n0.setOnItemLongClickListener(new uv(this, 3));
        this.C0.V.setOnItemClickListener(new uv(this, 4));
        this.C0.V.setOnItemLongClickListener(new xx(this, 2));
        this.C0.setFilteredSearchViewDelegate(new uv(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.f41998p4);
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
            if (this.f41997p3) {
                I3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.c5)) {
                    hg.c.v(false, this.actionBar);
                }
            } else {
                I3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6));
            this.actionBar.O(null, null);
            int i11 = this.f41941e0[0].f41571s;
            if ((i11 != 7 && i11 != 8) || (this.actionBar.t() && !this.actionBar.u(null))) {
                O3 = getMessagesController().getDialogs(this.V2);
            } else {
                O3 = O3(this.currentAccount, this.f41941e0[0].f41571s, this.V2, this.S1);
            }
            int size = O3.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = O3.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (d4(dialog)) {
                        i12++;
                    } else if (!getMessagesController().isPromoDialog(dialog.f20072id, false)) {
                        break;
                    }
                }
            }
            if (i12 > 1) {
                if (this.f41941e0 != null) {
                    int i14 = 0;
                    while (true) {
                        ry[] ryVarArr = this.f41941e0;
                        if (i14 >= ryVarArr.length) {
                            break;
                        }
                        ryVarArr[i14].d.H = true;
                        i14++;
                    }
                }
                d5(MessagesController.UPDATE_MASK_REORDER, true);
            }
            if (!this.f41997p3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f41963i1;
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
            ValueAnimator valueAnimator = this.f42024u3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f42024u3 = ValueAnimator.ofFloat(this.f42019t3, 1.0f);
            int i16 = 0;
            while (true) {
                ry[] ryVarArr2 = this.f41941e0;
                if (i16 >= ryVarArr2.length) {
                    break;
                }
                ry ryVar = ryVarArr2[i16];
                if (ryVar != null) {
                    ryVar.f41564a.I0(true);
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
            this.f42024u3.addUpdateListener(new wv(this, max, 0));
            this.f42024u3.addListener(new vx(this, max, 1));
            this.f42024u3.setInterpolator(org.telegram.ui.Components.is.f27500f);
            this.f42024u3.setDuration(200L);
            this.f42024u3.start();
            qw qwVar = this.f42045z0;
            if (qwVar != null) {
                qwVar.b(org.telegram.ui.ActionBar.h6.Gh, org.telegram.ui.ActionBar.h6.Fh, org.telegram.ui.ActionBar.h6.Eh, org.telegram.ui.ActionBar.h6.Hh, org.telegram.ui.ActionBar.h6.f21174w8);
            }
            org.telegram.ui.ActionBar.f2 f2Var = this.f41942e1;
            if (f2Var != null) {
                f2Var.c(1.0f, true);
            }
            z10 = false;
        }
        Q4(false);
        this.f41958h1.a(arrayList.size(), z10);
    }

    public final void K3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f42042y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new wx(this, parentActivity);
                FrameLayout.LayoutParams a2 = w7.x5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83);
                a2.bottomMargin = this.f41951f4 + this.f41961h4 + a2.bottomMargin;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.f42037x0 + 1;
                this.f42037x0 = i11;
                ((ly) this.fragmentView).addView(undoView, i11, a2);
            }
        }
    }

    public final void K4(long j3, View view) {
        String str;
        org.telegram.ui.Components.sc J;
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
            J = org.telegram.ui.Components.ad.a0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new nv(this, 23));
        }
        J.j();
    }

    public final void L3(final long j3, final long j10, boolean z10, final eg1 eg1Var) {
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
                if (z10 && ((this.f41949f2 != null && this.f41954g2 != null) || this.f41959h2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (DialogObject.isEncryptedDialog(j3)) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.q.l(getMessagesController(), j3).user_id));
                            if (user2 != null) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f41949f2, UserObject.getUserName(user2));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                return;
                            }
                        } else if (DialogObject.isUserDialog(j3)) {
                            if (j3 == getUserConfig().getClientUserId()) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f41954g2, LocaleController.getString(R.string.SavedMessages));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j3));
                                if (user3 != null && this.f41949f2 != null) {
                                    str = LocaleController.getString(R.string.SendMessageTitle);
                                    str2 = LocaleController.formatStringSimple(this.f41949f2, UserObject.getUserName(user3));
                                    string2 = LocaleController.getString(R.string.Send);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j3));
                            if (chat2 != null) {
                                String str3 = chat2.title;
                                if (j10 != 0 && (findTopic = getMessagesController().getTopicsController().findTopic(chat2.f20068id, j10)) != null) {
                                    str3 = ((Object) str3) + " " + findTopic.title;
                                }
                                if (this.f41959h2 != null) {
                                    string = LocaleController.getString(R.string.AddToTheGroupAlertTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f41959h2, str3);
                                    string2 = LocaleController.getString(R.string.Add);
                                } else {
                                    string = LocaleController.getString(R.string.SendMessageTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f41954g2, str3);
                                    string2 = LocaleController.getString(R.string.Send);
                                }
                                String str4 = formatStringSimple;
                                str = string;
                                str2 = str4;
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                        a2Var.R = str;
                        a2Var.T = AndroidUtilities.replaceTags(str2);
                        alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.z1() {
                            @Override
                            public final void f(org.telegram.ui.ActionBar.a2 a2Var2, int i11) {
                                sy.this.L3(j3, j10, false, eg1Var);
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
                    Runnable h0Var = new a3.h0(this, j3, new a3.g0(this, j3, j10, eg1Var, 14), 23);
                    if (j3 < 0) {
                        N4(getMessagesController().getChat(Long.valueOf(-j3)), h0Var, null);
                        return;
                    }
                    TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(j3));
                    TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(this.H));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user4), UserObject.getFirstName(user5));
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f20404a;
                    a2Var2.R = formatString;
                    a2Var2.T = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user4), UserObject.getFirstName(user5))));
                    alertDialog$Builder2.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new fu(h0Var, 1));
                    alertDialog$Builder2.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.zd0(27));
                    showDialog(a2Var2);
                    return;
                } else if (this.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j3, j10));
                    if (this.C2.w(this, arrayList, null, false, this.J2, this.K2, this.L2, eg1Var) && this.f41964i2) {
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
            org.telegram.ui.ActionBar.a2 a2Var3 = new org.telegram.ui.ActionBar.a2(getParentActivity(), 3, null);
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().getInputPeer(j3);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new ow(this, a2Var3, user, chat, j3, tL_messages_checkHistoryImportPeer));
            try {
                a2Var3.q(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void L4(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.L4(boolean, boolean, boolean, boolean):void");
    }

    public final void M3(long j3, boolean z10) {
        if (this.f41941e0 != null) {
            int i10 = 0;
            while (true) {
                ry[] ryVarArr = this.f41941e0;
                if (i10 < ryVarArr.length) {
                    int childCount = ryVarArr[i10].f41564a.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 < childCount) {
                            View childAt = this.f41941e0[i10].f41564a.getChildAt(i11);
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
            a71[] a71VarArr = new a71[1];
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.D3.f();
                Drawable drawable = this.D3.f30114f[0];
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
            nx nxVar = new nx(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), a71VarArr);
            if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
                nxVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
            }
            Long l10 = this.B3;
            if (l10 != null) {
                nxVar.setSelected(l10);
            } else {
                Drawable drawable2 = this.D3.f30114f[0];
                if (drawable2 instanceof org.telegram.ui.Components.s5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.s5) drawable2).i());
                } else {
                    l4 = null;
                }
                nxVar.setSelected(l4);
            }
            nxVar.setSaveState(1);
            nxVar.y(this.D3, titleTextView);
            ox oxVar = new ox(this, nxVar);
            this.M0 = oxVar;
            a71VarArr[0] = oxVar;
            oxVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i11, 48);
            a71VarArr[0].b();
        }
    }

    public final void N4(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.N4(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final java.util.ArrayList O3(int r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.O3(int, int, int, boolean):java.util.ArrayList");
    }

    public final void O4(boolean z10) {
        ry[] ryVarArr;
        char c10;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ryVarArr = this.f41941e0;
            if (i12 >= ryVarArr.length) {
                break;
            }
            ryVarArr[i12].f41564a.B0();
            i12++;
        }
        if (z10 && ryVarArr.length > 1) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int i13 = ryVarArr[c10].h;
        if (i13 >= 0 && i13 < getMessagesController().getDialogFilters().size()) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.f41941e0[c10].h);
            if (dialogFilter.isDefault()) {
                ry ryVar = this.f41941e0[c10];
                ryVar.f41571s = this.R0;
                oy oyVar = ryVar.f41564a;
                int i14 = oy.f40677t3;
                oyVar.B1();
            } else {
                ry[] ryVarArr2 = this.f41941e0;
                if (ryVarArr2[c10 ^ 1].f41571s == 7) {
                    ryVarArr2[c10].f41571s = 8;
                } else {
                    ryVarArr2[c10].f41571s = 7;
                }
                ryVarArr2[c10].f41564a.setScrollEnabled(true);
                MessagesController messagesController = getMessagesController();
                if (this.f41941e0[c10].f41571s == 8) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                messagesController.selectDialogFilter(dialogFilter, i10);
            }
            ry[] ryVarArr3 = this.f41941e0;
            if (ryVarArr3.length > 1) {
                ryVarArr3[1].E = dialogFilter.locked;
            }
            ry ryVar2 = ryVarArr3[c10];
            zw zwVar = ryVar2.d;
            zwVar.h = ryVar2.f41571s;
            zwVar.l();
            ry ryVar3 = this.f41941e0[c10];
            vw vwVar = ryVar3.f41566c;
            if (ryVar3.f41571s == 0 && W3() && this.f41941e0[c10].v == 2) {
                i11 = 1;
            }
            vwVar.h1(i11, (int) this.N);
            o3(this.f41941e0[c10]);
        }
    }

    public final float P3(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f - this.f41923b.f16401e;
        } else {
            f7 = 1.0f;
        }
        return f7 * (1.0f - S3()) * this.f42004r.f16401e;
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
        u41 u41Var = this.Z;
        if (u41Var != null && u41Var.getVisibility() != 8) {
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
            float f20 = this.f42038x1;
            f11 = (f7 * f20) + com.google.android.gms.internal.vision.e2.y(1.0f, f20, f10, f19);
            f12 = this.f42035w3;
        } else {
            f11 = (f7 * this.f42038x1) + this.N;
            f12 = this.f42035w3;
        }
        float f21 = f11 + f12 + this.T;
        iy iyVar = this.X;
        if (iyVar != null && iyVar.getVisibility() == 0) {
            f13 = this.X.getAlpha();
        } else {
            f13 = 0.0f;
        }
        float dp = AndroidUtilities.dp(4.0f) * f13;
        qw qwVar = this.f42045z0;
        if (qwVar != null) {
            qwVar.setTranslationY(f21 - dp);
            f15 = this.f42045z0.getAlpha();
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
            if (this.f41919a0 == null) {
                i10 = AndroidUtilities.dp(44.0f);
            } else {
                i10 = 0;
            }
            btVar.setTranslationY(AndroidUtilities.lerp(f22, i11 - i10, this.f41923b.f16401e));
            f17 = this.J1.getMetadata().f16419c.f16429a;
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
            Matrix matrix = atVar2.f24662b;
            if (atVar2.f24664e != lerp || atVar2.f24665f != min) {
                atVar2.f24664e = lerp;
                atVar2.f24665f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = atVar2.f24663c;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.Q4(boolean):void");
    }

    public final int R3() {
        if (this.K) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    public final void R4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.R4():void");
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        mx mxVar;
        ci.bb bbVar;
        qw qwVar;
        boolean z11;
        boolean z12;
        if (!this.f41997p3 && (((mxVar = this.F3) == null || !mxVar.c()) && (((bbVar = this.K0) == null || bbVar.getVisibility() != 0) && ((qwVar = this.f42045z0) == null || !qwVar.f24829n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                qw qwVar2 = this.f42045z0;
                if (qwVar2 != null && qwVar2.getTabsCount() >= 2 && this.f42045z0.getCurrentTabId() != this.f42045z0.getFirstTabId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                qw qwVar3 = this.f42045z0;
                if (qwVar3 != null && qwVar3.getTabsCount() >= 2 && this.f42045z0.getCurrentTabId() != this.f42045z0.getLastTabId()) {
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
        mx mxVar = this.F3;
        if (mxVar != null && mxVar.c()) {
            return this.F3.f39229e;
        }
        return 0.0f;
    }

    public final void S4(boolean z10, boolean z11) {
        ?? r52;
        int L0;
        boolean z12;
        ry[] ryVarArr;
        MessagesController.DialogFilter dialogFilter;
        boolean z13;
        Object[] objArr;
        s4.n0 n0Var;
        boolean z14;
        boolean z15;
        boolean z16;
        if (this.f42045z0 != null && !this.inPreviewMode && !this.f41997p3) {
            mx mxVar = this.F3;
            if (mxVar == null || !mxVar.c()) {
                org.telegram.ui.Components.p80 p80Var = this.L0;
                if (p80Var != null) {
                    p80Var.u();
                    this.L0 = null;
                }
                ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                int size = dialogFilters.size();
                me.b bVar = this.f42004r;
                boolean z17 = true;
                boolean z18 = false;
                if (size > 1) {
                    if (!z10 && this.f42045z0.getVisibility() == 0) {
                        r52 = 0;
                    } else {
                        if (this.f42045z0.getVisibility() != 0) {
                            z13 = false;
                        } else {
                            z13 = z11;
                        }
                        this.f42031w = true;
                        boolean isEmpty = this.f42045z0.h.isEmpty();
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.Q3 == null) {
                                z16 = z11;
                            } else {
                                z16 = false;
                            }
                            if (!this.f41997p3) {
                                bVar.a(this.f42031w, z16);
                            }
                        }
                        int currentTabId = this.f42045z0.getCurrentTabId();
                        int currentTabStableId = this.f42045z0.getCurrentTabStableId();
                        if (currentTabId != this.f42045z0.getDefaultTabId() && currentTabId >= dialogFilters.size()) {
                            this.f42045z0.L = -1;
                            objArr = 1;
                        } else {
                            objArr = null;
                        }
                        qw qwVar = this.f42045z0;
                        qwVar.h.clear();
                        qwVar.f24826j0.clear();
                        qwVar.f24828l0.clear();
                        qwVar.m0.clear();
                        qwVar.f24830n0.clear();
                        qwVar.f24831o0.clear();
                        qwVar.M = 0;
                        int size2 = dialogFilters.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            if (dialogFilters.get(i10).isDefault()) {
                                this.f42045z0.a(i10, 0, LocaleController.getString(R.string.FilterAllChats), null, false, true, dialogFilters.get(i10).locked);
                                z15 = z18;
                            } else {
                                MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(i10);
                                z15 = z18;
                                this.f42045z0.a(i10, dialogFilter2.localId, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, false, dialogFilters.get(i10).locked);
                            }
                            i10++;
                            z18 = z15;
                        }
                        boolean z19 = z18;
                        if (currentTabStableId >= 0) {
                            if (objArr != null && !this.f42045z0.h(currentTabStableId)) {
                                while (currentTabId >= 0) {
                                    qw qwVar2 = this.f42045z0;
                                    if (qwVar2.h(qwVar2.f24827k0.get(currentTabId, -1))) {
                                        break;
                                    }
                                    currentTabId--;
                                }
                                if (currentTabId < 0) {
                                    currentTabId = z19 ? 1 : 0;
                                }
                            }
                            if (this.f42045z0.f24827k0.get(this.f41941e0[z19 ? 1 : 0].h, -1) != currentTabStableId) {
                                this.f41941e0[z19 ? 1 : 0].h = currentTabId;
                                isEmpty = true;
                            }
                        }
                        int i11 = z19 ? 1 : 0;
                        while (true) {
                            ry[] ryVarArr2 = this.f41941e0;
                            if (i11 >= ryVarArr2.length) {
                                break;
                            }
                            if (ryVarArr2[i11].h >= dialogFilters.size()) {
                                this.f41941e0[i11].h = dialogFilters.size() - 1;
                            }
                            this.f41941e0[i11].f41564a.setScrollingTouchSlop(1);
                            i11++;
                        }
                        qw qwVar3 = this.f42045z0;
                        ai.w0 w0Var = qwVar3.F;
                        if (z13) {
                            n0Var = qwVar3.f24837s0;
                        } else {
                            n0Var = null;
                        }
                        w0Var.setItemAnimator(n0Var);
                        qwVar3.I.l();
                        if (isEmpty) {
                            O4(z19);
                        }
                        qw qwVar4 = this.f42045z0;
                        int currentTabId2 = qwVar4.getCurrentTabId();
                        ArrayList arrayList = qwVar4.h;
                        int i12 = 0;
                        while (true) {
                            if (i12 < arrayList.size()) {
                                if (((org.telegram.ui.Components.x00) arrayList.get(i12)).f32824a == currentTabId2) {
                                    z14 = ((org.telegram.ui.Components.x00) arrayList.get(i12)).f32828f;
                                    break;
                                }
                                i12++;
                            } else {
                                z14 = false;
                                break;
                            }
                        }
                        if (z14) {
                            qw qwVar5 = this.f42045z0;
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
                    if (this.f42045z0.getVisibility() != 8) {
                        this.f42045z0.setIsEditing(false);
                        F4(false);
                        this.f41981m3 = false;
                        if (this.f41978l3) {
                            this.f41978l3 = false;
                            this.f41941e0[0].setTranslationX(0.0f);
                            this.f41941e0[1].setTranslationX(ryVarArr[0].getMeasuredWidth());
                        }
                        if (this.f41941e0[0].h != this.f42045z0.getDefaultTabId()) {
                            this.f41941e0[0].h = this.f42045z0.getDefaultTabId();
                            zw zwVar = this.f41941e0[0].d;
                            zwVar.h = 0;
                            zwVar.l();
                            ry ryVar = this.f41941e0[0];
                            ryVar.f41571s = this.R0;
                            ryVar.d.l();
                        }
                        this.f41941e0[1].setVisibility(8);
                        ry ryVar2 = this.f41941e0[1];
                        ryVar2.h = 0;
                        zw zwVar2 = ryVar2.d;
                        zwVar2.h = 0;
                        zwVar2.l();
                        ry ryVar3 = this.f41941e0[1];
                        ryVar3.f41571s = this.R0;
                        ryVar3.d.l();
                        this.f42031w = false;
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.Q3 == null) {
                                z12 = z11;
                            } else {
                                z12 = false;
                            }
                            if (!this.f41997p3) {
                                bVar.a(false, z12);
                            }
                        }
                        int i13 = 0;
                        while (true) {
                            ry[] ryVarArr3 = this.f41941e0;
                            if (i13 >= ryVarArr3.length) {
                                break;
                            }
                            ry ryVar4 = ryVarArr3[i13];
                            if (ryVar4.f41571s == 0 && ryVar4.v == 2 && W3() && ((L0 = this.f41941e0[i13].f41566c.L0()) == 0 || L0 == 1)) {
                                this.f41941e0[i13].f41566c.h1(1, (int) this.N);
                            }
                            this.f41941e0[i13].f41564a.setScrollingTouchSlop(0);
                            this.f41941e0[i13].f41564a.requestLayout();
                            this.f41941e0[i13].requestLayout();
                            i13++;
                        }
                        this.f42045z0.L = -1;
                        r52 = 0;
                    }
                }
                Q4(r52);
                int i14 = this.f41941e0[r52].f41571s;
                if ((i14 == 7 || i14 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[i14 - 7]) != null) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < dialogFilters.size()) {
                            MessagesController.DialogFilter dialogFilter3 = dialogFilters.get(i15);
                            if (dialogFilter3 != null && dialogFilter3.f17287id == dialogFilter.f17287id) {
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
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.f41923b.f16401e);
    }

    public final void T4(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.T4(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    public final ai.m9 U3() {
        return getMessagesController().getStoriesController();
    }

    public final void U4() {
        float f7 = (((-this.f41951f4) - this.f41966i4) - this.f42022u1) - this.f42027v1;
        org.telegram.ui.Components.q20 q20Var = this.f42016t0;
        if (q20Var != null) {
            q20Var.setTranslationY(f7);
        }
        org.telegram.ui.Components.q20 q20Var2 = this.f42021u0;
        if (q20Var2 != null) {
            q20Var2.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            ci.d4 d4Var = this.f41994p0;
            if (d4Var != null) {
                d4Var.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    public final UndoView V3() {
        K3();
        UndoView[] undoViewArr = this.f42042y0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.e(2, true);
            ly lyVar = (ly) this.fragmentView;
            lyVar.removeView(undoViewArr[0]);
            lyVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void V4(boolean z10) {
        boolean z11;
        boolean z12 = this.f41977l2;
        if ((!z12 || this.R0 == 10) && this.V2 == 0 && this.X2 == 0 && !this.inPreviewMode && ((!this.f41969j2 || z12) && !this.T3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.q20 q20Var = this.f42016t0;
        if (q20Var != null) {
            q20Var.e(z11, z10);
        }
        org.telegram.ui.Components.q20 q20Var2 = this.f42021u0;
        if (q20Var2 != null) {
            q20Var2.e(z11, z10);
        }
    }

    public final boolean W3() {
        if (!this.f41977l2 && this.R0 == 0 && this.X2 == 0 && this.V2 == 0 && getMessagesController().hasHiddenArchive()) {
            return true;
        }
        return false;
    }

    public final void W4(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        if (this.f41984n0 != null) {
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
                if (!getDownloadController().hasUnviewedDownloads() && !z12 && (this.f41952g0.getVisibility() != 0 || this.f41952g0.getAlpha() != 1.0f || z11)) {
                    this.f41962i0 = false;
                } else {
                    this.f41962i0 = true;
                }
                u3();
                boolean z14 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i12 = this.f41937d2;
                if (i12 == 3 || i12 == 5) {
                    z13 = true;
                }
                org.telegram.ui.ActionBar.e1 e1Var = this.f41989o0;
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
                this.f41984n0.b(z14, z13, z10);
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
        cx cxVar = this.B1;
        ArrayList arrayList = this.I2;
        if (cxVar != null) {
            this.f41983n.a(!arrayList.isEmpty(), true);
            Y4();
            if (arrayList.isEmpty()) {
                if (this.R0 == 3 && this.f41949f2 == null) {
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
                        org.telegram.ui.Components.qr0 qr0Var = sr0Var.f30919a[0];
                        if (string2 != null) {
                            qr0Var.f30314e.l(string2, false);
                        }
                        org.telegram.ui.Components.pr0 pr0Var = new org.telegram.ui.Components.pr0(sr0Var, 0);
                        sr0Var.G = pr0Var;
                        AndroidUtilities.runOnUIThread(pr0Var, 1000L);
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
        org.telegram.ui.ActionBar.f2 f2Var = this.f41942e1;
        boolean z12 = true;
        if (f2Var != null) {
            f2Var.c(0.0f, true);
        }
        qw qwVar = this.f42045z0;
        if (qwVar != null) {
            qwVar.b(org.telegram.ui.ActionBar.h6.K8, org.telegram.ui.ActionBar.h6.I8, org.telegram.ui.ActionBar.h6.J8, org.telegram.ui.ActionBar.h6.L8, org.telegram.ui.ActionBar.h6.f20822d6);
        }
        ValueAnimator valueAnimator = this.f42024u3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f42024u3 = null;
        }
        if (this.f42019t3 == 0.0f) {
            return;
        }
        z4(-Q3());
        boolean z13 = false;
        int i11 = 0;
        while (true) {
            ry[] ryVarArr = this.f41941e0;
            if (i11 >= ryVarArr.length) {
                break;
            }
            ry ryVar = ryVarArr[i11];
            if (ryVar != null) {
                ryVar.f41564a.I0(true);
            }
            i11++;
        }
        if (this.K) {
            i10 = 81;
        } else {
            i10 = 0;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp(i10 + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f42019t3, 0.0f);
        this.f42024u3 = ofFloat;
        ofFloat.addUpdateListener(new wv(this, max, 1));
        this.f42024u3.addListener(new vx(this, max, 0));
        this.f42024u3.setInterpolator(org.telegram.ui.Components.is.f27500f);
        this.f42024u3.setDuration(200L);
        this.f42024u3.start();
        this.Y0 = false;
        ArrayList arrayList = this.f41920a1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i12);
                e10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
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
        if (this.f41941e0 != null) {
            int i13 = z11;
            while (true) {
                ry[] ryVarArr2 = this.f41941e0;
                if (i13 >= ryVarArr2.length) {
                    break;
                }
                ryVarArr2[i13].d.H = z11;
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
            ArrayList arrayList = sr0Var.f30923f;
            arrayList.clear();
            ArrayList arrayList2 = this.I2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            org.telegram.ui.Components.qr0 qr0Var = sr0Var.f30919a[0];
            if (sr0Var.f30920b == 1) {
                qr0Var.d.l(sr0Var.c(qr0Var), false);
            }
        }
    }

    public final void Z3(boolean z10) {
        if (this.F3.c()) {
            z10 = true;
        }
        if (!z10 || !this.f41926b2) {
            this.T3 = z10;
            V4(true);
            if (z10) {
                ci.d4 d4Var = this.f41994p0;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                ci.d4 d4Var2 = this.f41999q0;
                if (d4Var2 != null) {
                    d4Var2.e(true);
                }
            }
        }
    }

    public final void Z4(boolean z10) {
        boolean z11;
        if (this.f41976l0 == null) {
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
        jx jxVar = this.E0;
        org.telegram.ui.Components.q5 q5Var2 = null;
        if (jxVar != null && (q5Var = jxVar.f661a0) != null && jxVar.f681q0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                q5Var.j(emojiStatusDocumentId.longValue(), z10);
                q5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z10);
            } else if (user != null && MessagesController.getInstance(jxVar.f669f).isPremiumUser(user)) {
                if (jxVar.N0 == null) {
                    jxVar.N0 = jxVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    jxVar.N0 = new org.telegram.ui.Components.r5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), jxVar.N0);
                }
                jxVar.N0.setColorFilter(new PorterDuffColorFilter(jxVar.f(org.telegram.ui.ActionBar.h6.f21236zh), PorterDuff.Mode.MULTIPLY));
                q5Var.g(jxVar.N0, z10);
                q5Var.m(false, z10);
            } else {
                q5Var.g(null, z10);
                q5Var.m(false, z10);
            }
            q5Var.k(Integer.valueOf(jxVar.f(org.telegram.ui.ActionBar.h6.f21236zh)));
            jxVar.W.invalidate();
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
                this.actionBar.setRightDrawableOnClick(new tv(this, 2));
                j71.t(this.currentAccount);
            } else if (user != null && MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
                if (this.K3 == null) {
                    this.K3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    this.K3 = new org.telegram.ui.Components.r5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.K3);
                }
                this.K3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f21236zh), PorterDuff.Mode.MULTIPLY));
                this.D3.g(this.K3, z10);
                this.D3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(new tv(this, 3));
                j71.t(this.currentAccount);
            } else {
                this.D3.g(null, z10);
                this.D3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.q5 q5Var3 = this.D3;
            int i10 = org.telegram.ui.ActionBar.h6.f21236zh;
            q5Var3.k(Integer.valueOf(getThemedColor(i10)));
            org.telegram.ui.Cells.o oVar = this.E3;
            if (oVar != null) {
                oVar.setColor(getThemedColor(i10));
            }
            ox oxVar = this.M0;
            if (oxVar != null && (oxVar.getContentView() instanceof j71)) {
                org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
                j71 j71Var = (j71) this.M0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.q5 q5Var4 = this.D3;
                    if (rightDrawable == q5Var4) {
                        q5Var2 = q5Var4;
                    }
                }
                j71Var.y(q5Var2, titleTextView);
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
            if (!this.N3 && storiesEnabled && (d4Var = this.f41994p0) != null) {
                d4Var.u();
            }
            this.N3 = storiesEnabled;
        }
        org.telegram.ui.Components.q20 q20Var = this.f42016t0;
        if (q20Var == null) {
            return;
        }
        if (this.R0 == 10) {
            q20Var.setImageResource(R.drawable.floating_check);
            this.f42016t0.setContentDescription(LocaleController.getString(R.string.Done));
            return;
        }
        q20Var.setImageResource(R.drawable.filled_fab_compose_32);
        this.f42016t0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
    }

    public final boolean c4(long j3) {
        if (j3 < 0) {
            return false;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f20215id);
        if ((topics != null && !topics.isEmpty()) || !MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f20215id)) {
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
            mx mxVar = this.F3;
            if ((mxVar == null || !mxVar.c()) && !this.f41997p3 && (kVar = this.actionBar) != null && !kVar.t() && !this.f41977l2) {
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
                    jx jxVar = this.E0;
                    if (z13 != z15) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    jxVar.q(z10, z14);
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
                        this.J.setInterpolator(org.telegram.ui.Components.is.f27500f);
                        this.J.start();
                    } else {
                        jx jxVar2 = this.E0;
                        if (z16 && !isInPreviewMode()) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        jxVar2.setVisibility(i10);
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
                        ofFloat2.addUpdateListener(new ay(this, f13, z12, f11));
                        this.I.addListener(new sx(this, z12, 2));
                        this.I.setDuration(200L);
                        this.I.setInterpolator(org.telegram.ui.Components.is.f27500f);
                        this.I.start();
                        return;
                    }
                    this.K = z12;
                    jx jxVar3 = this.E0;
                    if ((z12 || this.L) && !isInPreviewMode()) {
                        i12 = 0;
                    }
                    jxVar3.setVisibility(i12);
                    if (!z12) {
                        z4(0.0f);
                    } else {
                        this.f42040x3 = -AndroidUtilities.dp(81.0f);
                        z4(-Q3());
                    }
                    while (true) {
                        ry[] ryVarArr = this.f41941e0;
                        if (i11 >= ryVarArr.length) {
                            break;
                        }
                        ry ryVar = ryVarArr[i11];
                        if (ryVar != null) {
                            ryVar.f41564a.requestLayout();
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
            if (this.R0 == 3 && (qwVar = this.f42045z0) != null && qwVar.getVisibility() == 0 && this.f42045z0.K > 0) {
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
            cy cyVar = this.C0;
            if (cyVar != null) {
                cyVar.R();
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
        a8Var.C(getThemedColor(org.telegram.ui.ActionBar.h6.f21120t8), false);
        a8Var.C(getThemedColor(org.telegram.ui.ActionBar.h6.f21227z8), true);
        a8Var.D(getThemedColor(org.telegram.ui.ActionBar.h6.f21156v8), false);
        a8Var.D(getThemedColor(org.telegram.ui.ActionBar.h6.f21209y8), true);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.createView(android.content.Context):android.view.View");
    }

    public final boolean d4(TLRPC.Dialog dialog) {
        char c10;
        if (dialog == null) {
            return false;
        }
        int i10 = this.f41941e0[0].f41571s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.t() || this.actionBar.u(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f41941e0[0].f41571s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            dialogFilter = dialogFilterArr[c10];
        }
        if (dialogFilter != null) {
            if (dialogFilter.pinnedDialogs.indexOfKey(dialog.f20072id) < 0) {
                return false;
            }
            return true;
        }
        return dialog.pinned;
    }

    public final void d5(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.d5(int, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int r30, int r31, java.lang.Object... r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.didReceivedNotification(int, int, java.lang.Object[]):void");
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
        if (this.C2 == null && this.f41986n2 == null) {
            return true;
        }
        return false;
    }

    public final boolean e5(long j3) {
        TLRPC.Chat chat;
        cx cxVar;
        if ((this.S0 <= 1 && ((cxVar = this.B1) == null || cxVar.getVisibility() != 0 || TextUtils.isEmpty(this.B1.getFieldText()))) || !DialogObject.isChatDialog(j3) || (chat = getMessagesController().getChat(Long.valueOf(-j3))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    public final boolean f3(long j3, View view) {
        if (this.f41977l2 && getMessagesController().isForum(j3)) {
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
        org.telegram.ui.Components.p80 p80Var = this.L0;
        if (p80Var != null) {
            p80Var.u();
        }
    }

    public final void g3(gg.p0 p0Var) {
        cy cyVar;
        if (this.f41997p3 && (cyVar = this.C0) != null) {
            ArrayList arrayList = cyVar.A0;
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (p0Var.b((gg.p0) arrayList.get(i10))) {
                        return;
                    }
                }
            }
            arrayList.add(p0Var);
            iy iyVar = this.X;
            ArrayList arrayList2 = iyVar.F;
            arrayList2.add(p0Var);
            iyVar.I = arrayList2.size() - 1;
            iyVar.f();
            this.X.f31038r.getText().clear();
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
                    g4(dialog2.f20072id);
                }
                return;
            }
            return;
        }
        int i11 = this.f41941e0[0].f41571s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i11 == 7 || i11 == 8) && (!this.actionBar.t() || this.actionBar.u(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f41941e0[0].f41571s == 8) {
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
                    } else if (((TLRPC.Dialog) this.R1.get(i13)).f20072id == j3) {
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
            this.f41941e0[0].f41573x.D();
            this.f41941e0[0].q(true);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.x4 getBackButtonState() {
        if (!b4() && !this.F3.f39230f) {
            return org.telegram.ui.ActionBar.x4.f21719b;
        }
        return org.telegram.ui.ActionBar.x4.f21718a;
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
        ofFloat2.addUpdateListener(new pv(this, 2));
        this.Z3.setInterpolator(org.telegram.ui.Components.is.f27501g);
        this.Z3.setDuration(i10);
        this.Z3.start();
        return this.Z3;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.getThemeDescriptions():java.util.ArrayList");
    }

    public final void h3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.V2 == 0 && this.X2 == 0 && Build.VERSION.SDK_INT >= 33 && fk0.p(parentActivity)) {
                if (z10) {
                    showDialog(new fk0(parentActivity, !org.telegram.ui.Components.ff0.a(), new ew(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().syncContacts && this.U1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z10) {
                    org.telegram.ui.ActionBar.a2 a2Var = org.telegram.ui.Components.g5.v(parentActivity, new xv(this, 1)).f20404a;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.h4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
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
                sr0Var.setLayoutClickListener(new tv(this, 0));
                this.G2.setOnModeChangeListener(new uv(this, 0));
                cx cxVar = this.B1;
                org.telegram.ui.Components.sr0 sr0Var2 = this.G2;
                if (sr0Var2 == null) {
                    cxVar.getClass();
                } else {
                    cxVar.G1 = sr0Var2;
                    cxVar.addView(sr0Var2, 0, w7.x5.e(-1, 48, 51));
                    cxVar.f23922g3 = false;
                    cxVar.L();
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
            cx cxVar2 = this.B1;
            if (X3()) {
                i10 = R.string.AddCaption;
            } else {
                i10 = R.string.ShareComment;
            }
            cxVar2.setOverrideHint(LocaleController.getString(i10));
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
        mx mxVar;
        if (!this.f41969j2 && (mxVar = this.F3) != null && mxVar.getFragment() != null) {
            return this.F3.getFragment().isLightStatusBar();
        }
        if (i0.a.f(getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.j3():void");
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
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.d6) null, false);
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
        sv svVar = new sv(this, 0);
        e3Var.items = charSequenceArr;
        e3Var.itemIcons = iArr;
        e3Var.onClickListener = svVar;
        showDialog(e3Var);
    }

    public final int k3() {
        if (this.B1 != null) {
            return (int) (this.f42043y1.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        } else if (this.X2 != 0) {
            return AndroidUtilities.dp(72.0f) + this.f41951f4;
        } else {
            return this.f41951f4 + this.f41961h4;
        }
    }

    public final void k4(android.view.View r25, int r26, s4.i0 r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.k4(android.view.View, int, s4.i0):void");
    }

    public final void l3() {
        AndroidUtilities.runOnUIThread(new nv(this, 2), 300L);
    }

    public final boolean l4(View view, int i10, float f7, org.telegram.ui.Components.qm0 qm0Var) {
        org.telegram.ui.Components.xo0 xo0Var;
        long j3;
        org.telegram.ui.Components.xo0 xo0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.a3) && qm0Var.j(i10) != 21) {
            if (!this.actionBar.t() && !AndroidUtilities.isTablet() && !this.f41977l2 && (view instanceof org.telegram.ui.Cells.s2)) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (!getMessagesController().isForum(s2Var.getDialogId()) && !this.F3.c() && s2Var.S(f7)) {
                    return E4(s2Var);
                }
            }
            mx mxVar = this.F3;
            if (mxVar == null || !mxVar.c()) {
                cy cyVar = this.C0;
                boolean z10 = true;
                if (cyVar != null && qm0Var == (xo0Var2 = cyVar.f26165b0)) {
                    Object J = xo0Var2.J(i10);
                    if (!this.C0.f26165b0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                        a2Var.R = string;
                        if (J instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) J;
                            if (chat.monoforum) {
                                a2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, ng.d.i(chat, this.currentAccount, false));
                            } else {
                                a2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            makeEncryptedDialogId = -chat.f20068id;
                        } else if (J instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) J;
                            if (user.f20215id == getUserConfig().clientUserId) {
                                a2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                a2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            makeEncryptedDialogId = user.f20215id;
                        } else if (J instanceof TLRPC.EncryptedChat) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) J).user_id));
                            a2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.f20076id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new ai.z1(this, makeEncryptedDialogId, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(a2Var);
                        TextView textView = (TextView) a2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21062q7));
                        }
                        return true;
                    }
                }
                cy cyVar2 = this.C0;
                if (cyVar2 != null && qm0Var == (xo0Var = cyVar2.f26165b0)) {
                    if (this.f41977l2) {
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
                        if (this.f41977l2) {
                            if ((this.R0 == 3 || F3()) && e5(dialog.f20072id)) {
                                if (this.R0 == 1 && F3() && this.f41980m2 && getMessagesController().isForum(dialog.f20072id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f20072id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.R0 != 1) {
                                        z10 = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z10);
                                    bundle.putBoolean("quote", this.O0);
                                    bundle.putBoolean("reply_to", this.N0);
                                    eg1 eg1Var = new eg1(bundle);
                                    eg1Var.L0 = this;
                                    presentFragment(eg1Var);
                                    return false;
                                }
                                f3(dialog.f20072id, view);
                                X4();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            j4(view);
                            return false;
                        } else if (!this.actionBar.t() || !d4(dialog)) {
                            J4(dialog.f20072id, view);
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
        if (i11 != 15 && i11 != 16 && this.f41959h2 == null && this.f42013s2) {
            if (DialogObject.isChatDialog(j3)) {
                long j10 = -j3;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    if (this.f42001q2 || !ChatObject.isCanWriteToChannel(j10, this.currentAccount) || (i10 = this.T0) == 2 || i10 == 3) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.SendMessageTitle);
                        int i12 = this.T0;
                        if (i12 == 3) {
                            alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.TodoCantForward);
                        } else if (i12 == 2) {
                            alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.PublicPollCantForward);
                        } else {
                            alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        showDialog(alertDialog$Builder.f20404a);
                        return false;
                    }
                    return true;
                }
                return true;
            } else if (DialogObject.isEncryptedDialog(j3)) {
                if (this.T0 != 0 || this.U0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.f20404a.R = LocaleController.getString(R.string.SendMessageTitle);
                    int i13 = this.T0;
                    if (i13 == 3) {
                        alertDialog$Builder2.f20404a.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i13 != 0) {
                        alertDialog$Builder2.f20404a.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        alertDialog$Builder2.f20404a.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    showDialog(alertDialog$Builder2.f20404a);
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
        Collections.sort(arrayList, new ff(21));
        org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(this, view);
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
                linearLayout.setBackground(org.telegram.ui.ActionBar.h6.Z(getThemedColor(org.telegram.ui.ActionBar.h6.f20913i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.d6) null);
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
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20930j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.x5.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new org.telegram.ui.Cells.sa(this, intValue, H, 12));
                H.r(linearLayout, w7.x5.n(230, 48));
            }
        }
        ShapeDrawable c02 = org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6));
        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.h6.m1(0.15f, -16777216));
        H.f29785z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
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
            iy iyVar = this.X;
            me.b bVar = this.f41923b;
            iyVar.setBlurredBackgroundVisibility(bVar.f16401e);
            float b10 = yf.e0.b(bVar.f16401e);
            org.telegram.ui.Components.y9 y9Var = this.f41921a3;
            if (y9Var != null) {
                y9Var.setScaleX(b10);
                this.f41921a3.setScaleY(b10);
                this.f41921a3.setAlpha(b10);
                org.telegram.ui.Components.y9 y9Var2 = this.f41921a3;
                if (b10 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                y9Var2.setVisibility(i12);
            }
            if (this.f42026v0 != null) {
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
                this.f42026v0.setScaleX(lerp);
                this.f42026v0.setScaleY(lerp);
                this.f42026v0.setAlpha(b10);
                ci.d dVar = this.f42026v0;
                int i14 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
                if (i14 > 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                dVar.setVisibility(i11);
                this.f42032w0.setAlpha(b10);
                jh.f fVar = this.f42032w0;
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
            if (this.X2 != 0 && chatFull.requests_pending > 0 && !this.f41923b.f16402f) {
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

    public final void o3(ry ryVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i10;
        boolean z14;
        int L0 = ryVar.f41566c.L0();
        int N0 = ryVar.f41566c.N0();
        if (!this.f41955g3 && !this.f41978l3) {
            qw qwVar = this.f42045z0;
            if (qwVar == null || qwVar.getVisibility() != 0 || !this.f42045z0.O) {
                int abs = Math.abs(N0 - L0) + 1;
                if (N0 != -1) {
                    s4.d1 K = ryVar.f41564a.K(N0);
                    if (K != null && K.f47786f == 11) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f41926b2 = z14;
                    if (z14) {
                        Z3(false);
                    }
                } else {
                    this.f41926b2 = false;
                }
                int i11 = ryVar.f41571s;
                if (i11 == 7 || i11 == 8) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                    int i12 = ryVar.h;
                    if (i12 >= 0 && i12 < dialogFilters.size() && (dialogFilters.get(ryVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= O3(this.currentAccount, ryVar.f41571s, 1, this.S1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                        boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                        boolean z15 = !isDialogsEndReached;
                        if (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        z11 = z15;
                        if ((abs <= 0 && N0 >= O3(this.currentAccount, ryVar.f41571s, this.V2, this.S1).size() - 10) || (abs == 0 && (((i10 = ryVar.f41571s) == 7 || i10 == 8) && !getMessagesController().isDialogsEndReached(this.V2)))) {
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
                                    sy syVar = sy.this;
                                    if (z12) {
                                        syVar.getMessagesController().loadDialogs(syVar.V2, -1, 100, z13);
                                    }
                                    if (z10) {
                                        syVar.getMessagesController().loadDialogs(1, -1, 100, z11);
                                    } else {
                                        syVar.getClass();
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
                        sy syVar = sy.this;
                        if (z12) {
                            syVar.getMessagesController().loadDialogs(syVar.V2, -1, 100, z13);
                        }
                        if (z10) {
                            syVar.getMessagesController().loadDialogs(1, -1, 100, z11);
                        } else {
                            syVar.getClass();
                        }
                    }
                });
            }
        }
    }

    public final void o4(java.util.ArrayList r41, int r42, boolean r43, boolean r44, java.util.HashSet r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.o4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
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
                cy cyVar = this.C0;
                if (cyVar != null) {
                    cyVar.R();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.p80 p80Var = this.L0;
            if (p80Var != null) {
                if (z10) {
                    p80Var.u();
                    this.L0 = null;
                    return false;
                }
            } else {
                qw qwVar = this.f42045z0;
                if (qwVar != null && qwVar.f24829n) {
                    if (z10) {
                        qwVar.setIsEditing(false);
                        F4(false);
                        return false;
                    }
                } else {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar != null && kVar.t()) {
                        if (z10) {
                            cy cyVar2 = this.C0;
                            if (cyVar2 != null && cyVar2.getVisibility() == 0) {
                                this.C0.Q(false);
                            }
                            Y3(true);
                            return false;
                        }
                    } else if (this.f41923b.f16402f) {
                        if (z10) {
                            this.X.f31038r.getText().clear();
                            this.Y.b(false);
                            this.X.f31038r.clearFocus();
                            return false;
                        }
                    } else {
                        qw qwVar2 = this.f42045z0;
                        if (qwVar2 != null && qwVar2.getVisibility() == 0 && !this.f41955g3) {
                            qw qwVar3 = this.f42045z0;
                            if (!qwVar3.O && !this.f41978l3) {
                                ArrayList arrayList = qwVar3.h;
                                if (!arrayList.isEmpty() && qwVar3.L != ((org.telegram.ui.Components.x00) arrayList.get(0)).f32824a) {
                                    if (z10) {
                                        qw qwVar4 = this.f42045z0;
                                        ArrayList arrayList2 = qwVar4.h;
                                        if (!arrayList2.isEmpty()) {
                                            qwVar4.f((org.telegram.ui.Components.x00) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        cx cxVar = this.B1;
                        if (cxVar != null && cxVar.r0()) {
                            if (z10) {
                                this.B1.k0(true);
                            }
                        } else {
                            jx jxVar = this.E0;
                            if (jxVar.O == 0 && jxVar.S.L0() != 0) {
                                jxVar.h.x0(0);
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
                cy cyVar = this.C0;
                if (cyVar != null) {
                    cyVar.f26165b0.R(this.W1, tLObject);
                }
                this.X1 = null;
            }
            this.V1 = false;
        }
        if (!this.K && (qwVar = this.f42045z0) != null && qwVar.getVisibility() == 0 && this.f42004r.f16402f) {
            int i10 = (int) (-this.N);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.f41941e0[0].f41564a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f42042y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        if (!isInPreviewMode() && (bbVar = this.K0) != null && bbVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        y3();
        this.f42005r0 = true;
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
        if (this.f42005r0 && !this.f42011s0 && (d4Var = this.f41994p0) != null && this.N3) {
            this.f42011s0 = true;
            this.f42005r0 = false;
            d4Var.u();
        }
        AndroidUtilities.runOnUIThread(new gw(this, 4), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.p80 p80Var = this.L0;
        if (p80Var != null) {
            p80Var.u();
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
            this.f41977l2 = bundle.getBoolean("onlySelect", false);
            this.f41980m2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f42001q2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.R0 = this.arguments.getInt("dialogsType", 0);
            this.O0 = this.arguments.getBoolean("quote", false);
            this.N0 = this.arguments.getBoolean("reply_to", false);
            this.P0 = this.arguments.getLong("reply_to_author", 0L);
            this.Q0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f41949f2 = this.arguments.getString("selectAlertString");
            this.f41954g2 = this.arguments.getString("selectAlertStringGroup");
            this.f41959h2 = this.arguments.getString("addToGroupAlertString");
            this.f42007r2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f42013s2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f42018t2 = this.arguments.getBoolean("afterSignup", false);
            this.V2 = this.arguments.getInt("folderId", 0);
            long j3 = this.arguments.getLong("community_id", 0L);
            this.X2 = j3;
            if (j3 != 0) {
                this.Y2 = getMessagesController().getChat(Long.valueOf(this.X2));
                this.Z2 = getMessagesController().getChatFull(this.X2);
            }
            this.f41964i2 = this.arguments.getBoolean("resetDelegate", true);
            this.S0 = this.arguments.getInt("messagesCount", 0);
            this.T0 = this.arguments.getInt("hasPoll", 0);
            this.U0 = this.arguments.getBoolean("hasInvoice", false);
            this.f42023u2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f42023u2);
            this.arguments.getInt("otherwiseRelogin");
            this.f42028v2 = this.arguments.getBoolean("allowGroups", true);
            this.f42034w2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f42039x2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.f42044y2 = this.arguments.getBoolean("allowChannels", true);
            this.f42047z2 = this.arguments.getBoolean("allowUsers", true);
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
        if (this.f41986n2 == null) {
            this.f41937d2 = getConnectionsManager().getConnectionState();
            this.J3.addGlobal(NotificationCenter.emojiLoaded);
            if (!this.f41977l2) {
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
            zu zuVar = this.Q3;
            if (zuVar.getParent() != null) {
                ((ViewGroup) zuVar.getParent()).removeView(zuVar);
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
        this.f41961h4 = i10;
        if (this.W) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f41966i4 = i11;
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
        cx cxVar = this.B1;
        if (cxVar != null) {
            cxVar.z0();
        }
        org.telegram.ui.Components.sr0 sr0Var = this.G2;
        if (sr0Var != null) {
            sr0Var.j();
        }
        org.telegram.ui.Components.voip.i iVar = this.H2;
        if (iVar != null) {
            AndroidUtilities.cancelRunOnUIThread(iVar);
            this.H2 = null;
        }
        UndoView undoView = this.f42042y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f41992o3.unlock();
        this.C2 = null;
        ib1 ib1Var = ib1.f38684b;
        if (ib1Var != null) {
            ib1Var.dismiss();
            ib1.f38684b = null;
        }
    }

    @Override
    public final void onPanTranslationUpdate(float f7) {
        if (this.f41941e0 != null) {
            this.J0 = f7;
            cx cxVar = this.B1;
            int i10 = 0;
            if (cxVar != null && cxVar.r0()) {
                this.fragmentView.setTranslationY(f7);
                while (true) {
                    ry[] ryVarArr = this.f41941e0;
                    if (i10 >= ryVarArr.length) {
                        break;
                    }
                    ryVarArr[i10].setTranslationY(0.0f);
                    i10++;
                }
                if (!this.f41977l2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.sc scVar = this.f41987n3;
                    if (scVar != null) {
                        scVar.l();
                    }
                }
                cy cyVar = this.C0;
                if (cyVar != null) {
                    cyVar.setTranslationY(this.I0);
                    return;
                }
                return;
            }
            while (true) {
                ry[] ryVarArr2 = this.f41941e0;
                if (i10 >= ryVarArr2.length) {
                    break;
                }
                ryVarArr2[i10].setTranslationY(f7);
                i10++;
            }
            if (!this.f41977l2) {
                this.actionBar.setTranslationY(f7);
                org.telegram.ui.Components.sc scVar2 = this.f41987n3;
                if (scVar2 != null) {
                    scVar2.l();
                }
            }
            cy cyVar2 = this.C0;
            if (cyVar2 != null) {
                cyVar2.setTranslationY(this.J0 + this.I0);
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
        mx mxVar = this.F3;
        if (mxVar != null) {
            mxVar.f39232r = true;
            tx txVar = mxVar.f39226a;
            if (txVar != null) {
                txVar.onPause();
            }
        }
        org.telegram.ui.Components.p80 p80Var = this.L0;
        if (p80Var != null) {
            p80Var.u();
        }
        cx cxVar = this.B1;
        if (cxVar != null) {
            cxVar.B0();
        }
        int i10 = 0;
        UndoView undoView = this.f42042y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        setBulletinDelegate(null);
        if (this.f41941e0 == null) {
            return;
        }
        while (true) {
            ry[] ryVarArr = this.f41941e0;
            if (i10 < ryVarArr.length) {
                ryVarArr[i10].d.getClass();
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
                                fk0.o();
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
                                AndroidUtilities.runOnUIThread(new gw(this, 3));
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
        sy syVar;
        ry ryVar;
        zw zwVar;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.Components.xo0 xo0Var;
        ci.bb bbVar;
        super.onResume();
        jx jxVar = this.E0;
        char c10 = 0;
        if (jxVar != null) {
            ArrayList arrayList = jxVar.f691x;
            ai.m9 m9Var = jxVar.f684s;
            m9Var.l(m9Var.f1411g);
            m9Var.l(m9Var.h);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.PeerStories y3 = m9Var.y(((ai.w) arrayList.get(i10)).f1841c);
                if (y3 != null) {
                    m9Var.X(y3);
                }
            }
        }
        mx mxVar = this.F3;
        if (mxVar != null) {
            mxVar.f39232r = false;
            tx txVar = mxVar.f39226a;
            if (txVar != null) {
                txVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (bbVar = this.K0) != null && bbVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.f41941e0 != null) {
            int i11 = 0;
            while (true) {
                ry[] ryVarArr = this.f41941e0;
                if (i11 >= ryVarArr.length) {
                    break;
                }
                ryVarArr[i11].d.l();
                i11++;
            }
        }
        cx cxVar = this.B1;
        if (cxVar != null) {
            cxVar.C0();
        }
        long j3 = 0;
        if (!this.f41977l2 && this.V2 == 0 && this.X2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        cy cyVar = this.C0;
        if (cyVar != null && (xo0Var = cyVar.f26165b0) != null) {
            xo0Var.l();
        }
        if (!this.f42018t2 && getUserConfig().unacceptedTermsOfService != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.V2 == 0 && this.X2 == 0 && this.f41932c2 && !this.f41977l2) {
            int i12 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.f41932c2 = false;
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
                syVar = this;
                org.telegram.messenger.o1 o1Var = new org.telegram.messenger.o1(syVar, z13, z11, z12, parentActivity);
                if (syVar.f42018t2 && (z11 || z13)) {
                    j3 = 4000;
                }
                AndroidUtilities.runOnUIThread(o1Var, j3);
            } else {
                syVar = this;
            }
        } else {
            syVar = this;
            if (!syVar.f41977l2 && syVar.V2 == 0 && syVar.X2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(10020)) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.h6.L5), null);
                        alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new uv(this, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.zd0(28));
                        showDialog(alertDialog$Builder.f20404a);
                    }
                } else {
                    return;
                }
            } else if (syVar.V2 == 0 && syVar.X2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.h6.L5), null);
                        alertDialog$Builder2.f20404a.T = LocaleController.getString(R.string.PermissionFSILockscreen);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new uv(this, 9));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.zd0(29));
                        showDialog(alertDialog$Builder2.f20404a);
                    }
                } else {
                    return;
                }
            }
        }
        G4();
        if (syVar.f41941e0 != null) {
            int i13 = 0;
            while (true) {
                ry[] ryVarArr2 = syVar.f41941e0;
                if (i13 >= ryVarArr2.length) {
                    break;
                }
                ry ryVar2 = ryVarArr2[i13];
                if (ryVar2.f41571s == 0 && ryVar2.v == 2 && ryVar2.f41566c.L0() == 0 && W3()) {
                    syVar.f41941e0[i13].f41566c.h1(1, (int) syVar.N);
                }
                if (i13 == 0) {
                    syVar.f41941e0[i13].d.getClass();
                } else {
                    syVar.f41941e0[i13].d.getClass();
                }
                i13++;
            }
        }
        I4();
        setBulletinDelegate(new x8(this, 4));
        if (syVar.f41997p3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), syVar.classGuid);
        }
        d5(0, false);
        W4(false, true);
        c5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            ib1.p(this);
        }
        y3();
        if (syVar.f42045z0 != null && (ryVar = syVar.f41941e0[0]) != null && (zwVar = ryVar.d) != null) {
            int i14 = zwVar.h;
            if (i14 == 7 || i14 == 8) {
                MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
                if (i14 != 7) {
                    c10 = 1;
                }
                MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                if (dialogFilter != null) {
                    syVar.f42045z0.h(dialogFilter.localId);
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
        sy syVar;
        mx mxVar = this.F3;
        if (mxVar != null && mxVar.c()) {
            this.F3.getFragment().onTransitionAnimationEnd(z10, z11);
        } else {
            if (z10 && (bbVar = this.K0) != null && bbVar.getVisibility() == 0) {
                this.K0.setVisibility(8);
                this.K0.setBackground(null);
            }
            if (z10 && this.f42018t2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f33883x0.c(false);
                }
            }
        }
        if (!z10 && (syVar = this.W2) != null) {
            syVar.removeSelfFromStack();
        }
        y3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        mx mxVar = this.F3;
        if (mxVar != null && mxVar.c()) {
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
        if (this.f41941e0 != null) {
            int k32 = k3();
            int i10 = 0;
            while (true) {
                ry[] ryVarArr = this.f41941e0;
                if (i10 < ryVarArr.length) {
                    ry ryVar = ryVarArr[i10];
                    if (ryVar != null) {
                        oy oyVar = ryVar.f41564a;
                        oyVar.setPadding(0, oyVar.W2, 0, k32);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void p4(long r14, boolean r16, org.telegram.messenger.MessagesController.DialogFilter r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.p4(long, boolean, org.telegram.messenger.MessagesController$DialogFilter, int, boolean):void");
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
        if (presentFragment && this.f41941e0 != null) {
            int i10 = 0;
            while (true) {
                ry[] ryVarArr = this.f41941e0;
                if (i10 >= ryVarArr.length) {
                    break;
                }
                ryVarArr[i10].d.getClass();
                i10++;
            }
        }
        ci.d4 d4Var = this.f41994p0;
        if (d4Var != null) {
            d4Var.e(true);
        }
        ci.d4 d4Var2 = this.f41999q0;
        if (d4Var2 != null) {
            d4Var2.e(true);
        }
        org.telegram.ui.Components.sc.e();
        return presentFragment;
    }

    public final void q3() {
        hh.f fVar = this.f42043y1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.f42043y1.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void q4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6));
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
        ry ryVar;
        boolean z10 = true;
        float P3 = P3(true);
        qw qwVar = this.f42045z0;
        if (qwVar != null) {
            if (qwVar.getAlpha() == P3) {
                z10 = false;
            }
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, P3);
            this.f42045z0.setAlpha(P3);
            this.f42045z0.setScaleX(lerp);
            this.f42045z0.setScaleY(lerp);
            qw qwVar2 = this.f42045z0;
            if (P3 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            qwVar2.setVisibility(i10);
            if (z10 && (ryVar = this.f41941e0[0]) != null) {
                ryVar.f41564a.requestLayout();
            }
        }
        P4();
    }

    public final void r4(ry ryVar) {
        int i10;
        org.telegram.ui.Components.k10 k10Var;
        if (ryVar.getVisibility() != 0) {
            return;
        }
        int i11 = ryVar.d.v;
        if (ryVar.f41571s == 0 && W3() && ryVar.f41564a.getChildCount() == 0 && ryVar.v == 2) {
            ((s4.d0) ryVar.f41564a.getLayoutManager()).h1(1, (int) this.N);
        }
        ryVar.d.getClass();
        ryVar.d.U();
        int h = ryVar.d.h();
        if (h == 1 && i11 == 1 && ryVar.d.j(0) == 5) {
            ryVar.q(true);
        } else {
            ryVar.q(false);
            if (h > i11 && (i10 = this.R0) != 11 && i10 != 12 && i10 != 13) {
                ryVar.f41574y.b(i11);
            }
        }
        try {
            oy oyVar = ryVar.f41564a;
            if (this.V2 == 0 && this.X2 == 0) {
                k10Var = ryVar.f41572w;
            } else {
                k10Var = null;
            }
            oyVar.setEmptyView(k10Var);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        o3(ryVar);
    }

    @Override
    public final void s() {
        u4(true, true);
    }

    public final void s3() {
        int i10;
        int i11;
        float f7 = this.f41983n.f16401e;
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
        hh.f fVar = this.f42043y1;
        if (fVar != null) {
            fVar.setAlpha(f7);
            hh.f fVar2 = this.f42043y1;
            int i13 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            fVar2.setVisibility(i10);
            this.f42043y1.getFadeView().setAlpha(f7);
            View fadeView = this.f42043y1.getFadeView();
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
            animatorSet.setInterpolator(org.telegram.ui.Components.is.f27500f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        jx jxVar = this.E0;
        if (jxVar != null) {
            if (this.G0 && !z10) {
                jxVar.setVisibility(0);
            } else {
                jxVar.setVisibility(8);
            }
        }
        V4(true);
        R4();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r6, int r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    public final void t3() {
        if (this.actionBar == null) {
            return;
        }
        org.telegram.ui.Components.q20.d(this.actionBar.getBackButton(), Math.max(this.f42019t3, (1.0f - this.f41923b.f16401e) * (1.0f - S3()) * (1.0f - this.f41929c.f16401e)));
    }

    public final void t4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sy.t4(int):void");
    }

    public final void u3() {
        float f7;
        if (this.f41962i0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.q20.d(this.f41952g0, com.google.android.gms.internal.vision.e2.C(f7, 1.0f - this.f41923b.f16401e, 1.0f - S3(), 1.0f - this.f41929c.f16401e));
    }

    public final void u4(boolean z10, boolean z11) {
        int i10;
        int i11;
        mx mxVar = this.F3;
        if (mxVar != null && mxVar.c()) {
            return;
        }
        if (this.f41941e0[0].f41571s == 0 && W3() && this.f41941e0[0].v == 2) {
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
            org.telegram.ui.Components.ul0 ul0Var = this.f41941e0[0].f41570r;
            ul0Var.f31630b = 1;
            ul0Var.c(i10, i11, false, false);
            s4();
            return;
        }
        this.f41941e0[0].f41566c.h1(i10, i11);
        s4();
    }

    public final void v3() {
        float f7;
        if (SharedConfig.passcodeHash.isEmpty()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.q20.d(this.f41947f0, com.google.android.gms.internal.vision.e2.C(f7, 1.0f - this.f41923b.f16401e, 1.0f - S3(), 1.0f - this.f41929c.f16401e));
    }

    public final void v4(String str, boolean z10) {
        L4(true, false, true, false);
        iy iyVar = this.X;
        if (iyVar != null) {
            iyVar.f31038r.setText(str);
            this.X.f31038r.setSelection(str.length());
        }
    }

    public final void w3() {
        float f7;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.q20.d(this.f41967j0, com.google.android.gms.internal.vision.e2.C(f7, this.f41946f.f16401e, 1.0f - S3(), 1.0f - this.f41929c.f16401e));
        jx jxVar = this.E0;
        if (jxVar != null) {
            jxVar.invalidate();
        }
    }

    public final void w4(float f7) {
        ry[] ryVarArr;
        this.f41930c0 = f7;
        for (ry ryVar : this.f41941e0) {
            oy oyVar = ryVar.f41564a;
            for (int i10 = 0; i10 < oyVar.getChildCount(); i10++) {
                View childAt = oyVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= ryVar.d.f10719f + 1) {
                    childAt.setAlpha(f7);
                }
            }
        }
    }

    public final void x3() {
        org.telegram.ui.Components.q20.d(this.f41976l0, com.google.android.gms.internal.vision.e2.C(this.f41923b.f16401e, 1.0f - S3(), 1.0f - this.f41929c.f16401e, this.d.f16401e));
    }

    public final void x4(boolean z10, boolean z11) {
        if (this.f41941e0 != null && this.S1 != z10) {
            if (z10) {
                this.R1 = new ArrayList(O3(this.currentAccount, this.f41941e0[0].f41571s, this.V2, false));
            } else {
                this.R1 = null;
            }
            this.S1 = z10;
            ry ryVar = this.f41941e0[0];
            ryVar.d.G = z10;
            if (!z10 && z11) {
                if (ryVar.f41564a.b0()) {
                    this.f41941e0[0].f41564a.post(new gw(this, 9));
                } else {
                    this.f41941e0[0].d.l();
                }
            }
        }
    }

    @Override
    public final fh.d y() {
        return this.f41982m4;
    }

    public final void y3() {
        boolean z10;
        ci.bb bbVar;
        if (!this.f41969j2 && ((bbVar = this.K0) == null || bbVar.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        bh0 bh0Var = this.I3;
        if (bh0Var != null) {
            bh0Var.f36422a.v.a(z10, true);
        }
    }

    public final void y4(boolean z10) {
        ry ryVar;
        if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
            if (z10) {
                ry[] ryVarArr = this.f41941e0;
                if (ryVarArr != null && (ryVar = ryVarArr[0]) != null) {
                    ryVar.setLayerType(2, null);
                    this.f41941e0[0].setClipChildren(false);
                    this.f41941e0[0].setClipToPadding(false);
                    this.f41941e0[0].f41564a.setClipChildren(false);
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
            if (this.f41941e0 != null) {
                int i10 = 0;
                while (true) {
                    ry[] ryVarArr2 = this.f41941e0;
                    if (i10 >= ryVarArr2.length) {
                        break;
                    }
                    ry ryVar2 = ryVarArr2[i10];
                    if (ryVar2 != null) {
                        ryVar2.setLayerType(0, null);
                        ryVar2.setClipChildren(true);
                        ryVar2.setClipToPadding(true);
                        ryVar2.f41564a.setClipChildren(true);
                    }
                    i10++;
                }
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setLayerType(0, null);
            }
            jx jxVar = this.E0;
            if (jxVar != null) {
                jxVar.setLayerType(0, null);
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
        org.telegram.ui.Components.q20.d(this.f41971k0, (1.0f - this.f41923b.f16401e) * (1.0f - S3()) * (1.0f - this.f41929c.f16401e));
        u3();
        x3();
        v3();
        w3();
    }

    public final void z4(float f7) {
        ry[] ryVarArr = this.f41941e0;
        int i10 = 0;
        if (ryVarArr != null) {
            int paddingTop = ryVarArr[0].f41564a.getPaddingTop() + ((int) f7);
            int i11 = 0;
            while (true) {
                ry[] ryVarArr2 = this.f41941e0;
                if (i11 >= ryVarArr2.length) {
                    break;
                }
                ryVarArr2[i11].f41564a.setTopGlowOffset(paddingTop);
                i11++;
            }
        }
        if (this.fragmentView != null && f7 != this.N) {
            this.N = f7;
            org.telegram.ui.Components.sc scVar = this.f41987n3;
            if (scVar != null) {
                scVar.l();
            }
            if (this.E3 != null) {
                float currentActionBarHeight = 1.0f - ((-f7) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                org.telegram.ui.Cells.o oVar = this.E3;
                float f10 = (int) f7;
                float f11 = oVar.f22588f;
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
