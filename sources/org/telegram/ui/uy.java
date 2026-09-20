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
public class uy extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, mg.b, le.d, fh0 {
    public static boolean f38230w4;
    public static final boolean[] f38231x4 = new boolean[4];
    public static final org.telegram.ui.Components.ur0 f38232y4 = new org.telegram.ui.Components.ur0(3);
    public static float f38233z4;
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public ex B1;
    public boolean B2;
    public Long B3;
    public ey C0;
    public ii.y1 C1;
    public oy C2;
    public Drawable C3;
    public org.telegram.ui.Components.bv0 D0;
    public org.telegram.ui.ActionBar.v0 D1;
    public ArrayList D2;
    public org.telegram.ui.Components.n5 D3;
    public boolean E;
    public lx E0;
    public final TextPaint E1;
    public String E2;
    public org.telegram.ui.Cells.o E3;
    public boolean F;
    public org.telegram.ui.Components.is F0;
    public dx F1;
    public CharSequence F2;
    public ox F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public FrameLayout G1;
    public org.telegram.ui.Components.zq0 G2;
    public final cx G3;
    public long H;
    public float H0;
    public dx H1;
    public yt H2;
    public final cx H3;
    public ValueAnimator I;
    public float I0;
    public FrameLayout I1;
    public final ArrayList I2;
    public dh0 I3;
    public ValueAnimator J;
    public float J0;
    public org.telegram.ui.Components.ks J1;
    public boolean J2;
    public NotificationCenter.ObserversGroup J3;
    public boolean K;
    public ci.eb K0;
    public org.telegram.ui.Components.js K1;
    public int K2;
    public Drawable K3;
    public boolean L;
    public org.telegram.ui.Components.v70 L0;
    public org.telegram.ui.Cells.m L1;
    public int L2;
    public int L3;
    public boolean M;
    public qx M0;
    public org.telegram.ui.Cells.a3 M1;
    public int M2;
    public boolean M3;
    public float N;
    public boolean N0;
    public org.telegram.ui.Cells.xa N1;
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
    public cv Q3;
    public boolean R;
    public int R0;
    public ArrayList R1;
    public int R2;
    public String R3;
    public org.telegram.ui.Components.pc S;
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
    public org.telegram.ui.Components.jd0 V0;
    public boolean V1;
    public int V2;
    public boolean V3;
    public boolean W;
    public org.telegram.ui.Cells.s2 W0;
    public long W1;
    public uy W2;
    public float W3;
    public ky X;
    public org.telegram.ui.Cells.s2 X0;
    public TLObject X1;
    public long X2;
    public boolean X3;
    public yf.g0 Y;
    public boolean Y0;
    public int Y1;
    public TLRPC.Chat Y2;
    public boolean Y3;
    public w41 Z;
    public boolean Z0;
    public int Z1;
    public TLRPC.ChatFull Z2;
    public ValueAnimator Z3;
    public final int f38234a;
    public org.telegram.ui.Components.w81 f38235a0;
    public final ArrayList f38236a1;
    public boolean a2;
    public org.telegram.ui.Components.v9 f38237a3;
    public org.telegram.ui.Components.u40 f38238a4;
    public final le.b f38239b;
    public gg.s0 f38240b0;
    public boolean f38241b1;
    public boolean f38242b2;
    public org.telegram.ui.Components.g9 f38243b3;
    public TLRPC.FileLocation f38244b4;
    public final le.b f38245c;
    public float f38246c0;
    public boolean f38247c1;
    public boolean f38248c2;
    public long f38249c3;
    public TLRPC.FileLocation f38250c4;
    public final le.b d;
    public ValueAnimator f38251d0;
    public boolean f38252d1;
    public int f38253d2;
    public boolean f38254d3;
    public org.telegram.ui.Components.pc f38255d4;
    public final le.b e;
    public ty[] f38256e0;
    public org.telegram.ui.ActionBar.g2 f38257e1;
    public boolean f38258e2;
    public boolean f38259e3;
    public int f38260e4;
    public final le.b f38261f;
    public org.telegram.ui.ActionBar.v0 f38262f0;
    public final Paint f38263f1;
    public String f38264f2;
    public AnimatorSet f38265f3;
    public int f38266f4;
    public org.telegram.ui.ActionBar.v0 f38267g0;
    public ImageView f38268g1;
    public String f38269g2;
    public boolean f38270g3;
    public int f38271g4;
    public final le.b h;
    public wy f38272h0;
    public NumberTextView f38273h1;
    public String f38274h2;
    public boolean f38275h3;
    public int f38276h4;
    public boolean f38277i0;
    public final ArrayList f38278i1;
    public boolean f38279i2;
    public float f38280i3;
    public int f38281i4;
    public org.telegram.ui.ActionBar.v0 f38282j0;
    public org.telegram.ui.ActionBar.v0 f38283j1;
    public boolean f38284j2;
    public boolean j3;
    public hh.k f38285j4;
    public org.telegram.ui.ActionBar.v0 f38286k0;
    public org.telegram.ui.ActionBar.v0 f38287k1;
    public boolean f38288k2;
    public int f38289k3;
    public final ah.i f38290k4;
    public org.telegram.ui.ActionBar.v0 f38291l0;
    public org.telegram.ui.ActionBar.v0 l1;
    public boolean f38292l2;
    public boolean f38293l3;
    public final fh.d l4;
    public org.telegram.ui.ActionBar.v0 m0;
    public org.telegram.ui.ActionBar.v0 f38294m1;
    public boolean f38295m2;
    public boolean f38296m3;
    public final fh.d f38297m4;
    public final le.b f38298n;
    public org.telegram.ui.Components.pi0 f38299n0;
    public org.telegram.ui.ActionBar.f1 f38300n1;
    public String f38301n2;
    public org.telegram.ui.Components.pc f38302n3;
    public final fh.c f38303n4;
    public org.telegram.ui.ActionBar.f1 f38304o0;
    public org.telegram.ui.ActionBar.f1 f38305o1;
    public String f38306o2;
    public final AnimationNotificationsLocker f38307o3;
    public final ah.c f38308o4;
    public ci.f4 f38309p0;
    public org.telegram.ui.ActionBar.f1 f38310p1;
    public final MessagesStorage.TopicKey f38311p2;
    public boolean f38312p3;
    public final ah.c f38313p4;
    public ci.f4 f38314q0;
    public org.telegram.ui.ActionBar.f1 f38315q1;
    public boolean f38316q2;
    public boolean f38317q3;
    public final ah.c f38318q4;
    public final le.b f38319r;
    public boolean f38320r0;
    public org.telegram.ui.ActionBar.f1 f38321r1;
    public boolean f38322r2;
    public boolean f38323r3;
    public final ah.c f38324r4;
    public final le.b f38325s;
    public boolean f38326s0;
    public org.telegram.ui.ActionBar.f1 f38327s1;
    public boolean f38328s2;
    public boolean f38329s3;
    public kw f38330s4;
    public org.telegram.ui.Components.y10 f38331t0;
    public org.telegram.ui.ActionBar.f1 f38332t1;
    public boolean f38333t2;
    public float f38334t3;
    public final ArrayList f38335t4;
    public org.telegram.ui.Components.y10 f38336u0;
    public float f38337u1;
    public boolean f38338u2;
    public ValueAnimator f38339u3;
    public final RectF f38340u4;
    public final ph.i v;
    public ci.d f38341v0;
    public float f38342v1;
    public boolean f38343v2;
    public float f38344v3;
    public final RectF f38345v4;
    public boolean f38346w;
    public jh.f f38347w0;
    public AnimatorSet f38348w1;
    public boolean f38349w2;
    public float f38350w3;
    public int f38351x;
    public int f38352x0;
    public float f38353x1;
    public boolean f38354x2;
    public float f38355x3;
    public boolean f38356y;
    public final UndoView[] f38357y0;
    public hh.g f38358y1;
    public boolean f38359y2;
    public int y3;
    public sw f38360z0;
    public FrameLayout f38361z1;
    public boolean f38362z2;
    public boolean f38363z3;

    public uy(Bundle bundle) {
        super(bundle);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f38234a = i10;
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
        this.f38239b = new le.b(1, this, qrVar, 350L, false);
        this.f38245c = new le.b(2, this, qrVar, 350L, false);
        this.d = new le.b(3, this, qrVar, 350L, false);
        this.e = new le.b(4, this, qrVar, 350L, false);
        this.f38261f = new le.b(5, this, qrVar, 350L, false);
        this.h = new le.b(6, this, qrVar, 350L, false);
        this.f38298n = new le.b(7, this, qrVar, 350L, false);
        this.f38319r = new le.b(8, this, qrVar, 350L, false);
        this.f38325s = new le.b(9, this, qrVar, 350L, false);
        this.v = new ph.i(new jw(this, 1));
        this.f38351x = -1;
        this.F = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.Q = true;
        this.f38246c0 = 1.0f;
        this.f38357y0 = new UndoView[2];
        this.f38236a1 = new ArrayList();
        this.f38263f1 = new Paint();
        this.f38278i1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.E1 = new TextPaint(1);
        this.U1 = true;
        this.f38248c2 = true;
        this.f38279i2 = true;
        this.f38311p2 = new MessagesStorage.TopicKey();
        this.I2 = new ArrayList();
        this.J2 = true;
        this.f38307o3 = new AnimationNotificationsLocker();
        this.y3 = -1;
        this.G3 = new cx(this, 0);
        this.H3 = new cx(this, 1);
        this.L3 = -4;
        this.M3 = true;
        this.N3 = true;
        this.W3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f38335t4 = arrayList;
        RectF rectF = new RectF();
        this.f38340u4 = rectF;
        RectF rectF2 = new RectF();
        this.f38345v4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        fh.c cVar = new fh.c();
        this.f38303n4 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.f19094d6));
        if (i11 >= 31) {
            this.f38290k4 = new ah.i(false);
            fh.d dVar = new fh.d(null);
            this.l4 = dVar;
            dVar.k(new zx(this, 0));
            fh.d dVar2 = new fh.d(null);
            this.f38297m4 = dVar2;
            dVar2.k(new zx(this, 3));
            ah.c cVar2 = new ah.c(dVar);
            this.f38308o4 = cVar2;
            cVar2.f427i = LiteMode.isEnabled(262144);
            ah.c cVar3 = new ah.c(dVar2);
            this.f38318q4 = cVar3;
            cVar3.f427i = LiteMode.isEnabled(262144);
            this.f38313p4 = new ah.c(dVar);
        } else {
            this.f38290k4 = null;
            this.l4 = null;
            this.f38297m4 = null;
            this.f38308o4 = new ah.c(cVar);
            this.f38318q4 = new ah.c(cVar);
            this.f38313p4 = new ah.c(cVar);
        }
        this.f38324r4 = new ah.c(cVar);
    }

    public static void A0(uy uyVar) {
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        uyVar.U4();
        org.telegram.ui.Components.pc G = org.telegram.ui.Components.xc.a0(uyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f27252j = 5000;
        G.j();
    }

    public static void B0(Activity activity, Boolean bool) {
        if (!bool.booleanValue()) {
            return;
        }
        if (!org.telegram.ui.Components.le0.c()) {
            org.telegram.ui.Components.le0.h();
        } else {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
    }

    public static void C0(uy uyVar) {
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        uyVar.U4();
        org.telegram.ui.Components.pc J = org.telegram.ui.Components.xc.a0(uyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new qv(uyVar, 1));
        J.f27252j = 5000;
        J.j();
    }

    public static void D0(uy uyVar) {
        boolean z10 = true;
        try {
            ((org.telegram.ui.Components.hj0) ((org.telegram.ui.Components.g9) uyVar.M1.h.getImageReceiver().getStaticThumb()).B).H(true);
        } catch (Exception unused) {
        }
        if (uyVar.f38238a4 == null) {
            org.telegram.ui.Components.u40 u40Var = new org.telegram.ui.Components.u40(0, true, true);
            uyVar.f38238a4 = u40Var;
            u40Var.H = true;
            u40Var.f28531a = uyVar;
            u40Var.f28532b = new iy(uyVar);
            uyVar.getMediaDataController().checkFeaturedStickers();
            uyVar.getMessagesController().loadSuggestedFilters();
            uyVar.getMessagesController().loadUserInfo(uyVar.getUserConfig().getCurrentUser(), true, uyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(uyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(uyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(uyVar.currentAccount).getCurrentUser();
        }
        if (user != null) {
            org.telegram.ui.Components.vi viVar = uyVar.f38238a4.f28533c;
            if (viVar != null) {
                viVar.c1();
            }
            org.telegram.ui.Components.u40 u40Var2 = uyVar.f38238a4;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            u40Var2.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : false, new qv(uyVar, 0), new rv(uyVar, 0), 0);
        }
    }

    public static void E0(uy uyVar, float f7, ValueAnimator valueAnimator) {
        uyVar.f38256e0[0].setTranslationY((1.0f - uyVar.f38334t3) * f7);
        uyVar.f38334t3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < uyVar.actionBar.getChildCount(); i10++) {
            if (uyVar.actionBar.getChildAt(i10).getVisibility() == 0 && uyVar.actionBar.getChildAt(i10) != uyVar.actionBar.getActionMode() && uyVar.actionBar.getChildAt(i10) != uyVar.actionBar.getBackButton()) {
                uyVar.actionBar.getChildAt(i10).setAlpha(1.0f - uyVar.f38334t3);
            }
        }
        uyVar.E3();
        uyVar.w3();
        View view = uyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void F0(uy uyVar) {
        org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(uyVar.getParentActivity(), uyVar.resourceProvider);
        xbVar.d(R.raw.email_check_inbox, new String[0]);
        xbVar.f30222b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.pc.g(uyVar, xbVar, 2750).j();
        try {
            uyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void G0(org.telegram.ui.uy r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.G0(org.telegram.ui.uy):void");
    }

    public static void H0(uy uyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() == 1) {
            xh.r1 r1Var = new xh.r1(uyVar.getParentActivity(), uyVar.currentAccount, birthdayState.today.get(0).f18475id, null, null);
            r1Var.V(true);
            uyVar.showDialog(r1Var);
            return;
        }
        tg.m1.e0(0, birthdayState);
    }

    public static void I0(uy uyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.pc M = org.telegram.ui.Components.xc.a0(uyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
            M.f27252j = 5000;
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
            uyVar.getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (uyVar.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar.getParentActivity(), 0, uyVar.resourceProvider);
                alertDialog$Builder.f18654a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f18654a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                uyVar.showDialog(alertDialog$Builder.f18654a);
                return;
            }
            return;
        }
        org.telegram.messenger.l0.o(R.string.UnknownError, org.telegram.ui.Components.xc.a0(uyVar), R.raw.error, 36);
    }

    public static void J0(uy uyVar) {
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        uyVar.U4();
    }

    public static void N2(uy uyVar, float f7) {
        float f10;
        float f11;
        int i10;
        int i11;
        float clamp = Utilities.clamp(uyVar.f38353x1 * 2.0f, 1.0f, 0.0f);
        lx lxVar = uyVar.E0;
        float f12 = (1.0f - uyVar.f38334t3) * f7 * uyVar.H0;
        float f13 = 1.0f - clamp;
        lxVar.setAlpha(f12 * f13);
        int i12 = 0;
        if (!uyVar.K && !uyVar.M) {
            if (uyVar.L) {
                uyVar.E0.setTranslationY((Math.max(uyVar.N, -uyVar.U3()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                uyVar.E0.setProgressToCollapse(1.0f);
                lx lxVar2 = uyVar.E0;
                lxVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - lxVar2.getY()));
            }
            f10 = 1.0f - uyVar.H0;
            uyVar.actionBar.setTranslationY(0.0f);
        } else {
            float clamp2 = Utilities.clamp((-uyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (uyVar.f38334t3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            uyVar.E0.setClipTop(0);
            if (!uyVar.K && uyVar.M) {
                uyVar.E0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                uyVar.E0.setProgressToCollapse(1.0f);
                f11 = uyVar.H0;
            } else {
                uyVar.E0.setTranslationY(((uyVar.T / 2.0f) + (Math.max(uyVar.N, -uyVar.U3()) + uyVar.f38344v3)) - AndroidUtilities.dp(8.0f));
                uyVar.E0.l(clamp2, !uyVar.F3.c());
                if (!uyVar.M) {
                    f11 = uyVar.H0;
                } else {
                    f10 = 1.0f - clamp3;
                    uyVar.actionBar.setTranslationY(0.0f);
                }
            }
            f10 = 1.0f - f11;
            uyVar.actionBar.setTranslationY(0.0f);
        }
        float f14 = f10 * f13;
        if (f14 != 1.0f) {
            uyVar.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
            uyVar.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
            float f15 = (0.6f * f14) + 0.4f;
            uyVar.actionBar.getTitlesContainer().setScaleY(f15);
            uyVar.actionBar.getTitlesContainer().setScaleX(f15);
            uyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            uyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
            uyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f15);
            uyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f15);
            float f16 = (1.0f - uyVar.f38334t3) * f14;
            uyVar.actionBar.getTitlesContainer().setAlpha(f16);
            FrameLayout titlesContainer = uyVar.actionBar.getTitlesContainer();
            int i13 = (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            titlesContainer.setVisibility(i11);
            uyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f16);
            FrameLayout additionalSubTitleOverlayContainer = uyVar.actionBar.getAdditionalSubTitleOverlayContainer();
            if (i13 <= 0) {
                i12 = 4;
            }
            additionalSubTitleOverlayContainer.setVisibility(i12);
            return;
        }
        uyVar.actionBar.getTitlesContainer().setScaleY(1.0f);
        uyVar.actionBar.getTitlesContainer().setScaleX(1.0f);
        uyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
        uyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
        float f17 = 1.0f - uyVar.f38334t3;
        uyVar.actionBar.getTitlesContainer().setAlpha(f17);
        FrameLayout titlesContainer2 = uyVar.actionBar.getTitlesContainer();
        int i14 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
        if (i14 > 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        titlesContainer2.setVisibility(i10);
        uyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
        FrameLayout additionalSubTitleOverlayContainer2 = uyVar.actionBar.getAdditionalSubTitleOverlayContainer();
        if (i14 <= 0) {
            i12 = 4;
        }
        additionalSubTitleOverlayContainer2.setVisibility(i12);
    }

    public static void O2(uy uyVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        if (uyVar.parentLayout != null && uyVar.actionBar != null) {
            float max = Math.max(uyVar.e.e, uyVar.V3());
            float f7 = 1.0f;
            float f10 = 1.0f - uyVar.f38353x1;
            float f11 = max * f10 * f10;
            int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            if (i11 != 0) {
                if (-1 >= i10) {
                    i10 = -1;
                    f7 = 0.0f;
                }
                if (f7 > 0.0f && i11 > 0 && i10 > 0 && (d5Var = uyVar.parentLayout) != null) {
                    ((ActionBarLayout) d5Var).p(canvas, (int) (f7 * 255.0f * f11), i10);
                }
            }
        }
    }

    public static org.telegram.ui.Cells.s2 Q3(ty tyVar) {
        qy qyVar = tyVar.f37904a;
        for (int i10 = 0; i10 < qyVar.getChildCount(); i10++) {
            View childAt = qyVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s2) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt;
                if (s2Var.P()) {
                    return s2Var;
                }
            }
        }
        return null;
    }

    public static void U(uy uyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        uyVar.U4();
    }

    public static void V(uy uyVar, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        uyVar.f38334t3 = floatValue;
        uyVar.f38256e0[0].setTranslationY((-f7) * floatValue);
        for (int i10 = 0; i10 < uyVar.actionBar.getChildCount(); i10++) {
            if (uyVar.actionBar.getChildAt(i10).getVisibility() == 0 && uyVar.actionBar.getChildAt(i10) != uyVar.actionBar.getActionMode() && uyVar.actionBar.getChildAt(i10) != uyVar.actionBar.getBackButton()) {
                uyVar.actionBar.getChildAt(i10).setAlpha(1.0f - uyVar.f38334t3);
            }
        }
        View view = uyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        uyVar.E3();
        uyVar.w3();
    }

    public static void W(uy uyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(uyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(uyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new ba(uyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void Y(uy uyVar) {
        ArrayList arrayList = uyVar.I2;
        org.telegram.ui.ActionBar.d5 d5Var = uyVar.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).y()) {
            uyVar.finishPreviewFragment();
        } else if (uyVar.R0 == 10) {
            if (uyVar.C2 != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i10)).longValue(), 0L));
                }
                uyVar.C2.u(uyVar, arrayList2, null, false, uyVar.J2, uyVar.K2, uyVar.L2, null);
            }
        } else if (MessagesController.getInstance(uyVar.currentAccount).isFrozen()) {
            b.b(uyVar.currentAccount);
        } else {
            uyVar.presentFragment(new ContactsActivity(a4.a.i("destroyAfterSelect", true)));
        }
    }

    public static void Z(uy uyVar) {
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        uyVar.U4();
    }

    public static void a0(uy uyVar) {
        PasskeysActivity.a0(uyVar.currentAccount, uyVar.getParentActivity(), uyVar.resourceProvider, true);
    }

    public static void b0(uy uyVar, int i10, org.telegram.ui.Components.v70 v70Var) {
        CharSequence charSequence;
        if (uyVar.currentAccount != i10) {
            v70Var.u();
            if (uyVar.getParentActivity() == null) {
                return;
            }
            oy oyVar = uyVar.C2;
            LaunchActivity launchActivity = (LaunchActivity) uyVar.getParentActivity();
            ArrayList arrayList = uyVar.D2;
            String str = uyVar.E2;
            CharSequence charSequence2 = uyVar.F2;
            ex exVar = uyVar.B1;
            if (exVar != null) {
                charSequence = exVar.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.K0(i10);
            uy uyVar2 = new uy(uyVar.arguments);
            uyVar2.C2 = oyVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    uyVar2.D2 = null;
                } else {
                    uyVar2.D2 = arrayList;
                    uyVar2.E2 = null;
                    if (uyVar2.B1 != null) {
                        uyVar2.l3(charSequence);
                    } else {
                        uyVar2.U3 = charSequence;
                    }
                }
            } else if (str != null) {
                uyVar2.E4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    uyVar2.F2 = null;
                } else {
                    uyVar2.F2 = charSequence2;
                    uyVar2.E2 = null;
                    uyVar2.D2 = null;
                    if (uyVar2.B1 != null) {
                        uyVar2.l3(charSequence);
                    } else {
                        uyVar2.U3 = charSequence;
                    }
                }
            }
            launchActivity.q0(uyVar2, false, true);
        }
    }

    public static void c0(uy uyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(uyVar.currentAccount).getClientUserId());
        uyVar.presentFragment(new zn(bundle));
    }

    public static void d0(uy uyVar, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = uyVar.getMessagesController().getUserFull(uyVar.getUserConfig().getClientUserId());
        if (userFull != null) {
            tL_birthday2 = userFull.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        uyVar.getMessagesController().invalidateContentSettings();
        uyVar.getConnectionsManager().sendRequest(updatebirthday, new ba(uyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        uyVar.U4();
    }

    public static void d4(zn znVar, MessageObject messageObject) {
        CharSequence charSequence;
        if (messageObject != null && messageObject.hasHighlightedWords()) {
            try {
                if (!TextUtils.isEmpty(messageObject.caption)) {
                    charSequence = messageObject.caption;
                } else {
                    charSequence = messageObject.messageText;
                }
                CharSequence highlightText = AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (org.telegram.ui.ActionBar.f6) null);
                if (highlightText instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) highlightText;
                    org.telegram.ui.Components.e10[] e10VarArr = (org.telegram.ui.Components.e10[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.e10.class);
                    if (e10VarArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(e10VarArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(e10VarArr[0]);
                        for (int i10 = 1; i10 < e10VarArr.length; i10++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(e10VarArr[i10]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(e10VarArr[i10]);
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
                        znVar.mb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void e0(uy uyVar, String str) {
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, str);
        uyVar.U4();
    }

    public static void f0(uy uyVar, ty tyVar, View view, int i10) {
        int i11;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.w3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.s2;
        if (z10) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
            if (s2Var.f20988n2) {
                uyVar.N4(s2Var.getDialogId(), view);
                return;
            }
        }
        if (uyVar.I3()) {
            uyVar.o4(view, i10, 0.0f, tyVar.d);
            return;
        }
        int i12 = uyVar.R0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.s8)) {
            tyVar.d.K();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle i14 = a4.a.i("forImport", true);
            i14.putLongArray("result", new long[]{uyVar.getUserConfig().getClientUserId()});
            i14.putInt("chatType", 4);
            String string = uyVar.arguments.getString("importTitle");
            if (string != null) {
                i14.putString("title", string);
            }
            l70 l70Var = new l70(i14);
            l70Var.Y = new yw(uyVar);
            uyVar.presentFragment(l70Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.a3) && ((i11 = tyVar.f37910s) == 7 || i11 == 8)) {
            gg.k kVar = (gg.k) tyVar.d.M.get(0);
            if (kVar != null && kVar.f15704a == 17) {
                tL_chatlists_chatlistUpdates = kVar.f9806i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = uyVar.getMessagesController().selectedDialogFilter[tyVar.f37910s - 7];
                if (dialogFilter != null) {
                    int i15 = dialogFilter.f15822id;
                    ?? abVar = new org.telegram.ui.Components.ab(uyVar, false);
                    abVar.Y = -1;
                    abVar.f23101c0 = "";
                    abVar.f23102d0 = new ArrayList();
                    abVar.f23104f0 = "";
                    abVar.f23106h0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    abVar.f23107i0 = arrayList;
                    abVar.f23123z0 = -1;
                    abVar.C0 = -5;
                    abVar.Y = i15;
                    abVar.f23099a0 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    abVar.f23105g0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = uyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i13).f15822id == i15) {
                                abVar.f23101c0 = arrayList2.get(i13).name;
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    abVar.S();
                    uyVar.showDialog(abVar);
                    return;
                }
                return;
            }
        } else if (z10 && !uyVar.actionBar.s() && !uyVar.F3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.s2) view).Y1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        uyVar.n4(view, i10, tyVar.d);
    }

    public static void f1(uy uyVar, boolean z10) {
        if (uyVar.f38256e0 != null && uyVar.M3 != z10) {
            uyVar.M3 = z10;
            int i10 = 0;
            while (true) {
                ty[] tyVarArr = uyVar.f38256e0;
                if (i10 < tyVarArr.length) {
                    if (z10) {
                        tyVarArr[i10].f37904a.setScrollbarFadingEnabled(false);
                    }
                    uyVar.f38256e0[i10].f37904a.setVerticalScrollBarEnabled(z10);
                    if (z10) {
                        uyVar.f38256e0[i10].f37904a.setScrollbarFadingEnabled(true);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public static void g0(uy uyVar) {
        uyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(uyVar.parentLayout, "newChatsRow");
    }

    public static void i0(uy uyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        if (uyVar.getParentActivity() != null) {
            uyVar.f38333t2 = false;
            if (z10 || z11 || z12) {
                uyVar.A0 = true;
                if (z10 && ik0.n(activity)) {
                    org.telegram.ui.Components.le0.g(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.dn(1, new of(25, uyVar, activity)));
                } else if (z11 && uyVar.U1 && uyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.d5.w(activity, new aw(uyVar, 0)).f18654a;
                    uyVar.T1 = b2Var;
                    uyVar.showDialog(b2Var);
                } else if (z12 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    if (activity instanceof h5) {
                        org.telegram.ui.ActionBar.b2 w10 = ((h5) activity).w(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                        uyVar.T1 = w10;
                        uyVar.showDialog(w10);
                    }
                } else {
                    uyVar.k3(true);
                }
            }
        }
    }

    public static void i4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = f38231x4;
        if (!zArr[currentAccount]) {
            MessagesController messagesController = accountInstance.getMessagesController();
            messagesController.loadGlobalNotificationsSettings();
            messagesController.loadDialogs(0, 0, 100, true);
            messagesController.loadHintDialogs();
            messagesController.loadUserInfo(accountInstance.getUserConfig().getCurrentUser(), false, 0);
            accountInstance.getContactsController().checkInviteText();
            accountInstance.getMediaDataController().checkAllMedia(false);
            AndroidUtilities.runOnUIThread(new cj(accountInstance, 18), 200L);
            Iterator<String> it = messagesController.diceEmojies.iterator();
            while (it.hasNext()) {
                accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
            }
            zArr[currentAccount] = true;
        }
    }

    public static void j0(uy uyVar) {
        if (uyVar.f38238a4.h()) {
            MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            uyVar.U4();
        }
    }

    public static void l0(uy uyVar) {
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        uyVar.U4();
    }

    public static void m0(uy uyVar) {
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        uyVar.U4();
    }

    public static void n0(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ai.j jVar;
        try {
            b2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject != null) {
            uyVar.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            ai.j jVar2 = new ai.j(uyVar, j3, 23);
            Pattern pattern = org.telegram.ui.Components.d5.f23492a;
            if (uyVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = uyVar.getCurrentAccount();
                    Activity parentActivity = uyVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
                    TextView textView = new TextView(parentActivity);
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19201j5, false));
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
                    org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
                    g9Var.u(AndroidUtilities.dp(12.0f));
                    org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(parentActivity);
                    v9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    frameLayout.addView(v9Var, w7.y5.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
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
                    frameLayout.addView(textView2, w7.y5.d(-1, -2.0f, i17, f7, 11.0f, i15, 0.0f));
                    if (!LocaleController.isRTL) {
                        i16 = 3;
                    }
                    frameLayout.addView(textView, w7.y5.d(-2, -2.0f, i16 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                    if (user != null) {
                        if (UserObject.isReplyUser(user)) {
                            g9Var.f24302p = 0.8f;
                            g9Var.g(12);
                            v9Var.h(null, null, g9Var, user);
                            jVar = jVar2;
                        } else {
                            jVar = jVar2;
                            if (user.f18475id == clientUserId) {
                                g9Var.f24302p = 0.8f;
                                g9Var.g(1);
                                v9Var.h(null, null, g9Var, user);
                            } else {
                                g9Var.f24302p = 1.0f;
                                g9Var.m(currentAccount, user);
                                v9Var.e(user, g9Var);
                            }
                        }
                    } else {
                        jVar = jVar2;
                        g9Var.k(currentAccount, chat);
                        v9Var.e(chat, g9Var);
                    }
                    textView.setText(AndroidUtilities.replaceTags(str));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Import), new org.telegram.ui.Components.s(jVar, 3));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    uyVar.showDialog(alertDialog$Builder.f18654a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.d5.f0(uyVar.currentAccount, tL_error, uyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        uyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j3), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public static void o0(uy uyVar, int i10) {
        Object obj;
        TLRPC.User user;
        org.telegram.ui.Components.zn0 zn0Var = uyVar.C0.f26208p0;
        if (i10 >= zn0Var.X && i10 < zn0Var.Y) {
            org.telegram.ui.Components.w51 G = zn0Var.G(i10);
            if (G != null) {
                obj = G.G;
            } else {
                obj = null;
            }
        } else {
            obj = Boolean.FALSE;
        }
        if (obj instanceof TLRPC.User) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar.getParentActivity(), 0, uyVar.resourceProvider);
            String string = LocaleController.getString(R.string.AppsClearSearch);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
            b2Var.R = string;
            b2Var.T = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.a3(26, uyVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        }
    }

    public static void p0(uy uyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        HashSet hashSet2;
        if (i10 == 102) {
            uyVar.getMessagesController().setDialogsInTransaction(true);
            if (z10) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            uyVar.r4(arrayList, i10, false, false, hashSet2);
            uyVar.getMessagesController().setDialogsInTransaction(false);
            uyVar.getMessagesController().checkIfFolderEmpty(uyVar.V2);
            int i11 = uyVar.V2;
            if (i11 != 0 && uyVar.R3(uyVar.currentAccount, uyVar.f38256e0[0].f37910s, i11, false).size() == 0) {
                uyVar.f38256e0[0].f37904a.setEmptyView(null);
                uyVar.f38256e0[0].f37911w.setVisibility(4);
                uyVar.finishFragment();
                return;
            }
            return;
        }
        uyVar.r4(arrayList, i10, false, false, null);
    }

    public static void q1(uy uyVar, ty tyVar, float f7) {
        if (uyVar.T != f7) {
            uyVar.T = f7;
            int i10 = 0;
            int i11 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i11 == 0) {
                uyVar.U = false;
            }
            uyVar.E0.setOverscroll(f7);
            tyVar.f37904a.setViewsOffset(f7);
            qy qyVar = tyVar.f37904a;
            if (i11 != 0) {
                i10 = 2;
            }
            qyVar.setOverScrollMode(i10);
            uyVar.fragmentView.invalidate();
            if (f7 > AndroidUtilities.dp(90.0f) && !uyVar.U) {
                lx lxVar = uyVar.E0;
                ValueAnimator valueAnimator = lxVar.H0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    lxVar.i(lxVar.f559p0, true);
                    uyVar.U = true;
                    uyVar.getOrCreateStoryViewer().s(new qv(uyVar, 18));
                }
            }
        }
    }

    public static void r0(uy uyVar) {
        String str;
        MessagesController messagesController = MessagesController.getInstance(uyVar.currentAccount);
        if (uyVar.A3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        messagesController.removeSuggestion(0L, str);
        uyVar.U4();
    }

    public static boolean r1(uy uyVar, ty tyVar) {
        if (!uyVar.F3.c()) {
            int i10 = (int) (-uyVar.N);
            int T3 = uyVar.T3();
            int U3 = uyVar.U3();
            if (i10 != 0 && i10 != T3 && i10 != U3 && tyVar.f37904a.canScrollVertically(-1)) {
                if (U3 < i10 && i10 < T3) {
                    int dp = AndroidUtilities.dp(48.0f);
                    int i11 = i10 - U3;
                    if (i11 < dp / 2) {
                        tyVar.f37905b.v(-i11);
                        return true;
                    }
                    tyVar.f37905b.v(dp - i11);
                    return true;
                }
                float f7 = 1.0f;
                if (uyVar.f38334t3 != 1.0f) {
                    f7 = Utilities.clamp((-uyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
                }
                if (f7 < uyVar.E0.B0) {
                    tyVar.f37905b.v(-i10);
                    return true;
                }
                tyVar.f37905b.v(U3 - i10);
                return true;
            }
            return false;
        }
        return false;
    }

    public static void s0(Activity activity, Boolean bool) {
        if (!bool.booleanValue()) {
            return;
        }
        if (!org.telegram.ui.Components.le0.c()) {
            org.telegram.ui.Components.le0.h();
        } else {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
    }

    public static String s2(uy uyVar) {
        String shortName;
        ArrayList arrayList = uyVar.I2;
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
                if (longValue == uyVar.getUserConfig().getClientUserId()) {
                    sb2.append(LocaleController.getString(R.string.SavedMessages));
                } else {
                    if (arrayList.size() == 1) {
                        shortName = DialogObject.getName(uyVar.currentAccount, longValue);
                    } else {
                        shortName = DialogObject.getShortName(uyVar.currentAccount, longValue);
                    }
                    sb2.append(shortName);
                }
            }
            return LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        }
        return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
    }

    public static void t0(uy uyVar) {
        b.c(uyVar.getParentActivity(), uyVar.currentAccount, uyVar.getResourceProvider());
    }

    public static void u0(final int i10, final long j3, TLRPC.Chat chat, final uy uyVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        uyVar.b4(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                uyVar.getMessagesController().deleteDialog(j3, 2, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i14 = uyVar.V2) != 0 && uyVar.R3(uyVar.currentAccount, uyVar.f38256e0[0].f37910s, i14, false).size() == 1) {
            uyVar.f38256e0[0].f37911w.setVisibility(4);
        }
        uyVar.y3 = 3;
        int i15 = -1;
        if (i10 == 102) {
            uyVar.A4(true, true);
            if (uyVar.R1 != null) {
                i13 = 0;
                while (i13 < uyVar.R1.size()) {
                    if (((TLRPC.Dialog) uyVar.R1.get(i13)).f18332id == j3) {
                        break;
                    }
                    i13++;
                }
            }
            i13 = -1;
            uyVar.o3();
            i11 = i13;
        } else {
            i11 = -1;
        }
        UndoView Y3 = uyVar.Y3();
        if (Y3 != null) {
            if (i10 == 103) {
                i12 = 0;
            } else if (z11) {
                i12 = 1;
            } else {
                i12 = 95;
            }
            Y3.j(i12, j3, new Runnable() {
                @Override
                public final void run() {
                    uyVar.q4(i10, j3, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(uyVar.R3(uyVar.currentAccount, uyVar.f38256e0[0].f37910s, uyVar.V2, false));
        int i16 = 0;
        while (true) {
            if (i16 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i16)).f18332id == j3) {
                i15 = i16;
                break;
            } else {
                i16++;
            }
        }
        if (i10 == 102) {
            if (i11 >= 0 && i15 < 0 && (arrayList = uyVar.R1) != null) {
                arrayList.remove(i11);
                uyVar.f38256e0[0].f37912x.D();
                uyVar.f38256e0[0].q(true);
                return;
            }
            uyVar.A4(false, true);
        }
    }

    public static void v0(uy uyVar) {
        BirthdayController.getInstance(uyVar.currentAccount).hide();
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        uyVar.U4();
        org.telegram.ui.Components.pc G = org.telegram.ui.Components.xc.a0(uyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f27252j = 5000;
        G.j();
    }

    public static void w0(uy uyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.C0(launchActivity, uyVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            lj1.a(uyVar.getParentActivity(), new rh(uyVar, tL_attachMenuBot, launchActivity), null);
        }
    }

    public static void x0(uy uyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(launchActivity, uyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(uyVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void y0(uy uyVar) {
        MessagesController.getInstance(uyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        uyVar.U4();
    }

    public static void z0(uy uyVar) {
        if (!uyVar.N3) {
            ci.f4 f4Var = uyVar.f38314q0;
            if (f4Var != null) {
                if (f4Var.V) {
                    return;
                }
                AndroidUtilities.removeFromParent(f4Var);
            }
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.j6.Gi, 0, new jw(uyVar, 7));
            ci.f4 f4Var2 = new ci.f4(uyVar.getParentActivity(), 2);
            f4Var2.q(8.0f);
            f4Var2.d = 8000L;
            f4Var2.i();
            f4Var2.p(true);
            f4Var2.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
            f4Var2.s(replaceSingleTag);
            f4Var2.l(1.0f, -40.0f);
            f4Var2.h(uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
            uyVar.f38314q0 = f4Var2;
            f4Var2.setTranslationY((-uyVar.f38266f4) - uyVar.f38276h4);
            ((ViewGroup) uyVar.fragmentView).addView(uyVar.f38314q0, w7.y5.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            uyVar.f38314q0.u();
            return;
        }
        ci.f4 f4Var3 = uyVar.f38309p0;
        if (f4Var3 != null) {
            f4Var3.e(true);
        }
        ai.f9 o9 = MessagesController.getInstance(uyVar.currentAccount).getStoriesController().o();
        if (o9 != null && o9.a(uyVar.currentAccount, 1)) {
            uyVar.showDialog(new rg.j0(o9.b(), uyVar.currentAccount, uyVar.getParentActivity(), uyVar, null));
            return;
        }
        ci.oc E = ci.oc.E(uyVar.getParentActivity(), uyVar.currentAccount);
        E.f5279x = new zx(uyVar, 4);
        E.R(null);
    }

    public final void A3() {
        org.telegram.ui.Components.y10.d(this.f38291l0, com.google.android.gms.internal.vision.e2.C(this.f38239b.e, 1.0f - V3(), 1.0f - this.f38245c.e, this.d.e));
    }

    public final void A4(boolean z10, boolean z11) {
        if (this.f38256e0 != null && this.S1 != z10) {
            if (z10) {
                this.R1 = new ArrayList(R3(this.currentAccount, this.f38256e0[0].f37910s, this.V2, false));
            } else {
                this.R1 = null;
            }
            this.S1 = z10;
            ty tyVar = this.f38256e0[0];
            tyVar.d.G = z10;
            if (!z10 && z11) {
                if (tyVar.f37904a.c0()) {
                    this.f38256e0[0].f37904a.post(new jw(this, 8));
                } else {
                    this.f38256e0[0].d.l();
                }
            }
        }
    }

    public final void B3() {
        boolean z10;
        ci.eb ebVar;
        if (!this.f38284j2 && ((ebVar = this.K0) == null || ebVar.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        dh0 dh0Var = this.I3;
        if (dh0Var != null) {
            dh0Var.f33046a.v.a(z10, true);
        }
    }

    public final void B4(boolean z10) {
        ty tyVar;
        if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
            if (z10) {
                ty[] tyVarArr = this.f38256e0;
                if (tyVarArr != null && (tyVar = tyVarArr[0]) != null) {
                    tyVar.setLayerType(2, null);
                    this.f38256e0[0].setClipChildren(false);
                    this.f38256e0[0].setClipToPadding(false);
                    this.f38256e0[0].f37904a.setClipChildren(false);
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
            if (this.f38256e0 != null) {
                int i10 = 0;
                while (true) {
                    ty[] tyVarArr2 = this.f38256e0;
                    if (i10 >= tyVarArr2.length) {
                        break;
                    }
                    ty tyVar2 = tyVarArr2[i10];
                    if (tyVar2 != null) {
                        tyVar2.setLayerType(0, null);
                        tyVar2.setClipChildren(true);
                        tyVar2.setClipToPadding(true);
                        tyVar2.f37904a.setClipChildren(true);
                    }
                    i10++;
                }
            }
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setLayerType(0, null);
            }
            lx lxVar = this.E0;
            if (lxVar != null) {
                lxVar.setLayerType(0, null);
            }
            View view2 = this.fragmentView;
            if (view2 != null) {
                ((ViewGroup) view2).setClipChildren(true);
                this.fragmentView.requestLayout();
            }
        }
    }

    @Override
    public final void C(float f7, int i10) {
        org.telegram.ui.ActionBar.v0 v0Var;
        if (i10 == 3 && (v0Var = this.f38291l0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) v0Var.getIconView().getDrawable();
            if (this.d.f14170f) {
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
                        }
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23) {
                animatedVectorDrawable.reset();
            } else {
                animatedVectorDrawable.setVisible(false, true);
            }
        }
    }

    public final void C3() {
        w3();
        org.telegram.ui.Components.y10.d(this.f38286k0, (1.0f - this.f38239b.e) * (1.0f - V3()) * (1.0f - this.f38245c.e));
        x3();
        A3();
        y3();
        z3();
    }

    public final void C4(float f7) {
        ty[] tyVarArr = this.f38256e0;
        int i10 = 0;
        if (tyVarArr != null) {
            int paddingTop = tyVarArr[0].f37904a.getPaddingTop() + ((int) f7);
            int i11 = 0;
            while (true) {
                ty[] tyVarArr2 = this.f38256e0;
                if (i11 >= tyVarArr2.length) {
                    break;
                }
                tyVarArr2[i11].f37904a.setTopGlowOffset(paddingTop);
                i11++;
            }
        }
        if (this.fragmentView != null && f7 != this.N) {
            this.N = f7;
            org.telegram.ui.Components.pc pcVar = this.f38302n3;
            if (pcVar != null) {
                pcVar.l();
            }
            if (this.E3 != null) {
                float currentActionBarHeight = 1.0f - ((-f7) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                org.telegram.ui.Cells.o oVar = this.E3;
                float f10 = (int) f7;
                float f11 = oVar.f20715f;
                oVar.h = f10;
                oVar.setTranslationY(f11 + f10);
                this.E3.setAlpha(w7.q.a(currentActionBarHeight, 0.0f, 1.0f));
                org.telegram.ui.Cells.o oVar2 = this.E3;
                if (currentActionBarHeight <= 0.0f) {
                    i10 = 4;
                }
                oVar2.setVisibility(i10);
            }
            E3();
            this.fragmentView.invalidate();
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
        int i11;
        int i12;
        int i13 = 8;
        if (i10 == 1) {
            C3();
            E3();
            H3();
            u3();
            F3();
            ky kyVar = this.X;
            le.b bVar = this.f38239b;
            kyVar.setBlurredBackgroundVisibility(bVar.e);
            float b10 = yf.e0.b(bVar.e);
            org.telegram.ui.Components.v9 v9Var = this.f38237a3;
            if (v9Var != null) {
                v9Var.setScaleX(b10);
                this.f38237a3.setScaleY(b10);
                this.f38237a3.setAlpha(b10);
                org.telegram.ui.Components.v9 v9Var2 = this.f38237a3;
                if (b10 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                v9Var2.setVisibility(i12);
            }
            if (this.f38341v0 != null) {
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
                this.f38341v0.setScaleX(lerp);
                this.f38341v0.setScaleY(lerp);
                this.f38341v0.setAlpha(b10);
                ci.d dVar = this.f38341v0;
                int i14 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
                if (i14 > 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                dVar.setVisibility(i11);
                this.f38347w0.setAlpha(b10);
                jh.f fVar = this.f38347w0;
                if (i14 > 0) {
                    i13 = 0;
                }
                fVar.setVisibility(i13);
            }
        } else if (i10 == 2) {
            C3();
            E3();
        } else if (i10 == 3) {
            A3();
        } else if (i10 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        } else if (i10 == 5) {
            z3();
        } else if (i10 == 6) {
            C3();
            E3();
        } else if (i10 == 7) {
            v3();
        } else if (i10 == 8) {
            u3();
            F3();
        } else if (i10 == 9) {
            F3();
        }
    }

    public final void D3() {
        int i10;
        if (V3() > 0.5f) {
            i10 = R.string.SearchTopics;
        } else {
            i10 = R.string.SearchChats;
        }
        String string = LocaleController.getString(i10);
        this.X.f22856r.setContentDescription(string);
        this.X.f22856r.setHint(string);
    }

    public final void D4(float f7) {
        int i10;
        int i11;
        this.f38353x1 = f7;
        if (this.f38323r3 && this.actionBar != null) {
            if (this.V2 == 0 && this.X2 == 0) {
                i10 = org.telegram.ui.ActionBar.j6.f19427v8;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.O8;
            }
            int themedColor = getThemedColor(i10);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.j6.f19479y8;
            kVar.B(i0.a.d(this.f38353x1, themedColor, getThemedColor(i12)), false);
            this.actionBar.B(i0.a.d(this.f38353x1, getThemedColor(i12), getThemedColor(i12)), true);
            if (this.V2 == 0 && this.X2 == 0) {
                i11 = org.telegram.ui.ActionBar.j6.f19391t8;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.N8;
            }
            int themedColor2 = getThemedColor(i11);
            this.actionBar.A(i0.a.d(this.f38353x1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.j6.f19498z8)), false);
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            LiteMode.isEnabled(32768);
        }
        S4();
    }

    public final void E3() {
        float f7;
        int i10;
        if (this.X == null) {
            return;
        }
        float a2 = 1.0f - w7.q.a(((-this.N) - U3()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.f38334t3, this.h.e);
        float f10 = this.f38239b.e;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float max2 = f7 * (1.0f - this.f38245c.e) * (1.0f - max) * Math.max(f10, (1.0f - V3()) * a2);
        this.X.setAlpha(max2);
        ky kyVar = this.X;
        boolean z10 = false;
        if (max2 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        kyVar.setVisibility(i10);
        if (max2 <= 0.01f) {
            z10 = true;
        }
        this.f38261f.a(z10, true);
    }

    public final void E4(CharSequence charSequence, String str) {
        if (str != null && !str.isEmpty()) {
            this.E2 = str;
            this.F2 = null;
            this.D2 = null;
            if (this.B1 != null) {
                l3(charSequence);
                return;
            } else {
                this.U3 = charSequence;
                return;
            }
        }
        this.E2 = null;
        this.F2 = null;
    }

    public final void F3() {
        int i10;
        float f7;
        int i11;
        int i12 = 8;
        if (this.Z != null) {
            if (this.f38235a0 != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float f10 = f7 * this.f38239b.e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f10);
            this.Z.setScaleX(lerp);
            this.Z.setScaleY(lerp);
            this.Z.setAlpha(f10);
            w41 w41Var = this.Z;
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            w41Var.setVisibility(i11);
        }
        org.telegram.ui.Components.w81 w81Var = this.f38235a0;
        le.b bVar = this.f38325s;
        if (w81Var != null) {
            float f11 = 1.0f - bVar.e;
            w81Var.setAlpha(f11);
            org.telegram.ui.Components.w81 w81Var2 = this.f38235a0;
            if (f11 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            w81Var2.setVisibility(i10);
        }
        gg.s0 s0Var = this.f38240b0;
        if (s0Var != null) {
            float f12 = bVar.e;
            s0Var.setAlpha(f12);
            gg.s0 s0Var2 = this.f38240b0;
            if (f12 > 0.0f) {
                i12 = 0;
            }
            s0Var2.setVisibility(i12);
        }
    }

    public final void F4(float f7) {
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
                lx lxVar = this.E0;
                if (lxVar != null) {
                    lxVar.setTranslationX(f10);
                }
                ky kyVar = this.X;
                if (kyVar != null) {
                    kyVar.setTranslationX(f10);
                }
                ox oxVar = this.F3;
                if (oxVar != null && oxVar.getFragmentView() != null && !this.f38356y) {
                    this.F3.getFragmentView().setTranslationX(f10);
                    return;
                }
                return;
            }
            float f11 = 1.0f - this.W3;
            float f12 = (-AndroidUtilities.dp(4.0f)) * f11;
            float f13 = 1.0f - (f11 * 0.05f);
            lx lxVar2 = this.E0;
            if (lxVar2 != null) {
                lxVar2.setScaleX(f13);
                this.E0.setScaleY(f13);
                this.E0.setTranslationX(f12);
                this.E0.setPivotX(0.0f);
                this.E0.setPivotY(0.0f);
            }
            ky kyVar2 = this.X;
            if (kyVar2 != null) {
                kyVar2.setTranslationX(f12);
                this.X.setScaleX(f13);
                this.X.setScaleY(f13);
            }
            ox oxVar2 = this.F3;
            if (oxVar2 != null && oxVar2.getFragmentView() != null) {
                if (!this.f38356y) {
                    this.F3.getFragmentView().setScaleX(f13);
                    this.F3.getFragmentView().setScaleY(f13);
                    this.F3.getFragmentView().setTranslationX(f12);
                }
                this.F3.getFragmentView().setPivotX(0.0f);
                this.F3.getFragmentView().setPivotY(0.0f);
            }
        }
    }

    public final void G3(boolean z10) {
        int i10;
        int i11;
        if (this.C0 != null && this.actionBar != null) {
            int i12 = AndroidUtilities.navigationBarHeight;
            int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f38234a);
            if (this.f38235a0 != null) {
                i10 = AndroidUtilities.dp(50.0f);
            } else {
                i10 = 0;
            }
            int i13 = measuredHeight + i10;
            org.telegram.ui.Components.ks ksVar = this.J1;
            if (ksVar != null) {
                i11 = (int) ksVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i14 = i13 + i11;
            ey eyVar = this.C0;
            SparseArray sparseArray = eyVar.h;
            eyVar.V0 = i14;
            eyVar.W0 = i12;
            ai.w0 w0Var = eyVar.W;
            if (z10) {
                w0Var.p1(0, i14, 0, i12);
            } else {
                w0Var.setPadding(0, i14, 0, i12);
            }
            eyVar.N0.j(eyVar.V0, eyVar.W0, z10);
            org.telegram.ui.Components.yn0 yn0Var = eyVar.f26194a0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) yn0Var.getLayoutParams();
            int i15 = marginLayoutParams.topMargin;
            int i16 = eyVar.V0;
            if (i15 != i16 || marginLayoutParams.bottomMargin != eyVar.W0) {
                marginLayoutParams.topMargin = i16;
                marginLayoutParams.bottomMargin = eyVar.W0;
                yn0Var.requestLayout();
            }
            org.telegram.ui.Components.lo0.Q(eyVar.f26200g0, eyVar.f26203j0, eyVar.V0, eyVar.W0, z10);
            org.telegram.ui.Components.lo0.Q(eyVar.f26205l0, eyVar.f26207o0, eyVar.V0, eyVar.W0, z10);
            org.telegram.ui.Components.lo0.Q(eyVar.f26211s0, eyVar.f26214v0, eyVar.V0, eyVar.W0, z10);
            org.telegram.ui.Components.ih0 ih0Var = eyVar.f26209q0;
            int i17 = eyVar.V0;
            int i18 = eyVar.W0;
            ih0Var.setClipToPadding(false);
            ih0Var.J = z10;
            ih0Var.setPadding(0, i17, 0, i18);
            org.telegram.ui.Components.s61 s61Var = ih0Var.f25049c;
            if (z10) {
                s61Var.p1(0, i17, 0, i18);
            } else {
                s61Var.setPadding(0, i17, 0, i18);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) s61Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i17;
            marginLayoutParams2.bottomMargin = -i18;
            ih0Var.J = false;
            org.telegram.ui.Components.in0 in0Var = eyVar.H0;
            if (in0Var != null) {
                in0Var.b(eyVar.V0, eyVar.W0, z10);
            }
            int size = sparseArray.size();
            for (int i19 = 0; i19 < size; i19++) {
                View view = (View) sparseArray.valueAt(i19);
                if (view instanceof x10) {
                    ((x10) view).j(eyVar.V0, eyVar.W0, z10);
                }
            }
            for (int i20 = 0; i20 < eyVar.getChildCount(); i20++) {
                if (eyVar.getChildAt(i20) instanceof x10) {
                    ((x10) eyVar.getChildAt(i20)).j(eyVar.V0, eyVar.W0, z10);
                }
            }
        }
    }

    public final void G4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.u6 u6Var = new org.telegram.ui.Components.u6(getParentActivity(), this.currentAccount, getResourceProvider(), new yt(5, this, r0), new cj(r0, 17));
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(getParentActivity(), getResourceProvider());
        a3Var.c(u6Var);
        org.telegram.ui.ActionBar.f3 f3Var = a3Var.f18659a;
        f3Var.show();
        org.telegram.ui.ActionBar.f3[] f3VarArr = {f3Var};
        f3Var.fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.f19165h5));
    }

    public final void H3() {
        if (this.J1 != null) {
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, 1.0f);
            this.J1.setAlpha(1.0f);
            this.J1.setScaleX(lerp);
            this.J1.setScaleY(lerp);
            this.J1.setVisibility(0);
        }
    }

    public final boolean H4(org.telegram.ui.Cells.s2 r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.H4(org.telegram.ui.Cells.s2):boolean");
    }

    public boolean I3() {
        if (this.R0 == 10) {
            return true;
        }
        return false;
    }

    public final void I4(boolean z10) {
        float f7;
        this.f38245c.a(z10, true);
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
        this.O3.addListener(new ux(this, z10, 1));
        this.O3.start();
    }

    public final void J3() {
        if (AndroidUtilities.isTablet()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                ey eyVar = this.C0;
                if (eyVar != null) {
                    eyVar.f26196c0.R(this.W1, tLObject);
                }
                this.X1 = null;
                return;
            }
            return;
        }
        this.V1 = true;
    }

    public final void J4() {
        if (!this.A0 && getMessagesController().dialogFiltersLoaded && getMessagesController().showFiltersTooltip && this.f38360z0 != null && getMessagesController().getDialogFilters().isEmpty() && !this.isPaused && getUserConfig().filtersLoaded && !this.inPreviewMode) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("filterhint", false)) {
                globalMainSettings.edit().putBoolean("filterhint", true).apply();
                AndroidUtilities.runOnUIThread(new jw(this, 9), 1000L);
            }
        }
    }

    public final void K3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.f19537n0) {
            kVar.h(true);
            this.f38312p3 = false;
            V4(true, true);
        }
    }

    public final void K4() {
        LaunchActivity launchActivity;
        boolean q6;
        int i10;
        int i11;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        LaunchActivity launchActivity2;
        CharSequence charSequence;
        yt ytVar;
        int i12;
        org.telegram.ui.ActionBar.f1 f1Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i13;
        int v02;
        int v03;
        int v04;
        int l1;
        CharSequence charSequence2;
        int i14;
        int v05;
        org.telegram.ui.Components.v70 H = org.telegram.ui.Components.v70.H(this, this.f38286k0);
        int i15 = org.telegram.ui.ActionBar.j6.A8;
        H.S(getThemedColor(i15), getThemedColor(i15));
        H.f28994s = 8;
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) parentActivity;
        } else {
            launchActivity = null;
        }
        int i16 = 0;
        if (this.X2 != 0) {
            if (ChatObject.hasAdminRights(this.Y2)) {
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new qv(this, 4), false);
                H.k();
            }
            H.i(new qv(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.Y2.collapsed_in_dialogs);
            H.i(new qv(this, 8), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.Y2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else if (e4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new qv(this, 9), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new qv(this, 10), false);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else {
            org.telegram.ui.ActionBar.f6 f6Var2 = this.resourceProvider;
            if (f6Var2 != null) {
                q6 = f6Var2.a();
            } else {
                q6 = org.telegram.ui.ActionBar.j6.I.q();
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
            H.c(i10, LocaleController.getString(i11), new qv(this, 11), false);
            H.k();
            H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new qv(this, 12), false);
            H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new qv(this, 13), false);
            ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
            if (applicationLoader != null) {
                applicationLoader.addItemOptions(H);
            }
            TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
            if (launchActivity != null && attachMenuBots != null && (arrayList = attachMenuBots.bots) != null && !arrayList.isEmpty()) {
                ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = attachMenuBots.bots;
                int size = arrayList2.size();
                int i17 = 0;
                while (i17 < size) {
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i17);
                    i17++;
                    TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                    if (tL_attachMenuBot2.show_in_side_menu) {
                        uv uvVar = new uv(this, tL_attachMenuBot2, launchActivity, 0);
                        yt ytVar2 = new yt(4, this, tL_attachMenuBot2);
                        org.telegram.ui.ActionBar.f6 f6Var3 = H.d;
                        if (H.e != null) {
                            int i18 = org.telegram.ui.ActionBar.j6.F8;
                            int i19 = org.telegram.ui.ActionBar.j6.E8;
                            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(0, H.e, H.d, false, false);
                            f1Var2.setPadding(AndroidUtilities.dp(18.0f), i16, AndroidUtilities.dp(18.0f), i16);
                            if (tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                charSequence = org.telegram.ui.Cells.s8.a(tL_attachMenuBot2.short_name);
                            } else {
                                charSequence = tL_attachMenuBot2.short_name;
                            }
                            TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot2);
                            if (sideAttachMenuBotIcon != null) {
                                launchActivity2 = launchActivity;
                                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.j6.f19077c7, 1.0f);
                                if (svgThumb != null) {
                                    Integer num = H.f28981k0;
                                    if (num != null) {
                                        v05 = num.intValue();
                                    } else {
                                        v05 = org.telegram.ui.ActionBar.j6.v0(i18, f6Var3);
                                    }
                                    charSequence2 = charSequence;
                                    svgThumb.setColorFilter(new PorterDuffColorFilter(v05, PorterDuff.Mode.SRC_IN));
                                } else {
                                    charSequence2 = charSequence;
                                }
                                i12 = i19;
                                ytVar = ytVar2;
                                i13 = i18;
                                f1Var = f1Var2;
                                f6Var = f6Var3;
                                f1Var.h(charSequence2, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                                org.telegram.ui.Components.v9 v9Var = f1Var.h;
                                if (v9Var != null) {
                                    if (LocaleController.isRTL) {
                                        i14 = 5;
                                    } else {
                                        i14 = 3;
                                    }
                                    v9Var.setLayoutParams(w7.y5.e(24, 24, i14 | 16));
                                }
                            } else {
                                launchActivity2 = launchActivity;
                                ytVar = ytVar2;
                                i12 = i19;
                                f1Var = f1Var2;
                                f6Var = f6Var3;
                                CharSequence charSequence3 = charSequence;
                                i13 = i18;
                                f1Var.g(charSequence3, R.drawable.msg_bot, null);
                            }
                            Integer num2 = H.f28979j0;
                            if (num2 != null) {
                                v02 = num2.intValue();
                            } else {
                                v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
                            }
                            Integer num3 = H.f28981k0;
                            if (num3 != null) {
                                v03 = num3.intValue();
                            } else {
                                v03 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
                            }
                            f1Var.c(v02, v03);
                            Integer num4 = H.f28981k0;
                            if (num4 != null) {
                                v04 = num4.intValue();
                            } else {
                                v04 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
                            }
                            f1Var.setIconColorImage(v04);
                            Integer num5 = H.f28983l0;
                            if (num5 != null) {
                                l1 = num5.intValue();
                            } else {
                                l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
                            }
                            f1Var.setSelectorColor(l1);
                            f1Var.setOnClickListener(new org.telegram.ui.Components.dt(8, H, uvVar));
                            f1Var.setOnLongClickListener(new ai.q3(3, H, ytVar));
                            int i20 = H.S;
                            if (i20 > 0) {
                                f1Var.setMinimumWidth(AndroidUtilities.dp(i20));
                                H.r(f1Var, w7.y5.n(H.S, -2));
                            } else {
                                H.r(f1Var, w7.y5.n(-1, -2));
                            }
                            launchActivity = launchActivity2;
                            i16 = 0;
                        }
                    }
                    launchActivity2 = launchActivity;
                    launchActivity = launchActivity2;
                    i16 = 0;
                }
            }
            if (getUserConfig().showCallsTab) {
                H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new qv(this, 6), false);
            }
            org.telegram.ui.ActionBar.f1 f1Var3 = this.f38304o0;
            if (f1Var3 != null) {
                f1Var3.f18844b.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19049ai));
                this.f38304o0.setOnClickListener(new tv(0, this, H));
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                    H.k();
                    H.d(this.f38304o0);
                }
            }
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        }
    }

    public final void L3(String str) {
        int i10;
        if (this.actionBar.a(str)) {
            return;
        }
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(str);
        boolean z10 = this.W;
        ArrayList arrayList = this.f38278i1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f38268g1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f38268g1.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
            this.f38268g1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f19479y8), PorterDuff.Mode.MULTIPLY));
            this.f38268g1.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.f19498z8), 1, -1));
            this.f38268g1.setOnClickListener(new wv(this, 6));
            j3.addView(this.f38268g1, w7.y5.q(54, 54, 16));
            arrayList.add(this.f38268g1);
        }
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f38273h1 = numberTextView;
        numberTextView.setTextSize(18);
        this.f38273h1.setTypeface(AndroidUtilities.bold());
        this.f38273h1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19479y8));
        NumberTextView numberTextView2 = this.f38273h1;
        if (this.W) {
            i10 = 18;
        } else {
            i10 = 72;
        }
        j3.addView(numberTextView2, w7.y5.m(1.0f, 0, -1, i10, 0, 0));
        this.f38273h1.setOnTouchListener(new bi.d(2));
        this.f38287k1 = j3.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.l1 = j3.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.f38294m1 = j3.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.f38283j1 = j3.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.v0 h = j3.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        j3.addView(new View(getParentActivity()), w7.y5.n(5, -1));
        this.f38315q1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.f38300n1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.f38305o1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.f38310p1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.f38327s1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.f38321r1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.f38332t1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.l1.setOnLongClickListener(new ew(this, 0));
        arrayList.add(this.f38287k1);
        arrayList.add(this.f38294m1);
        arrayList.add(this.l1);
        arrayList.add(this.f38283j1);
        arrayList.add(h);
        T4(false);
    }

    public final void L4() {
        if (this.R3 == null) {
            for (String str : getMessagesController().pendingSuggestions) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f18654a.R = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                    alertDialog$Builder.f18654a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new xv(this, 6));
                    showDialog(alertDialog$Builder.f18654a, new rv(this, 1));
                    this.R3 = str;
                    return;
                }
            }
        }
    }

    public final void M3() {
        int i10;
        ey eyVar = this.C0;
        if ((eyVar != null && eyVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f38301n2 != null) {
            i10 = 2;
        } else if (!this.f38292l2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        ey eyVar2 = new ey(this, getParentActivity(), this, i10, this.R0, this.V2, this.X2, new zx(this, 1));
        this.C0 = eyVar2;
        ((ny) this.fragmentView).addView(eyVar2, this.B0);
        ey eyVar3 = this.C0;
        eyVar3.f26196c0.U = new gy(this);
        eyVar3.f26203j0.setOnItemClickListener(new xv(this, 1));
        this.C0.f26207o0.setOnItemClickListener(new xv(this, 2));
        this.C0.f26214v0.setOnItemClickListener(new bw(this, 0));
        this.C0.f26207o0.setOnItemLongClickListener(new xv(this, 3));
        this.C0.W.setOnItemClickListener(new xv(this, 4));
        this.C0.W.setOnItemLongClickListener(new zx(this, 2));
        this.C0.setFilteredSearchViewDelegate(new xv(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.f38313p4);
    }

    public final void M4(long j3, View view) {
        ArrayList<TLRPC.Dialog> R3;
        int i10;
        i3(j3, view);
        boolean s10 = this.actionBar.s();
        ArrayList arrayList = this.I2;
        boolean z10 = true;
        if (s10) {
            if (arrayList.isEmpty()) {
                b4(true);
                return;
            }
        } else {
            if (this.f38312p3) {
                L3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.e5)) {
                    hg.k0.v(false, this.actionBar);
                }
            } else {
                L3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19094d6));
            this.actionBar.O(null, null);
            int i11 = this.f38256e0[0].f37910s;
            if ((i11 != 7 && i11 != 8) || (this.actionBar.s() && !this.actionBar.t(null))) {
                R3 = getMessagesController().getDialogs(this.V2);
            } else {
                R3 = R3(this.currentAccount, this.f38256e0[0].f37910s, this.V2, this.S1);
            }
            int size = R3.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = R3.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (g4(dialog)) {
                        i12++;
                    } else if (!getMessagesController().isPromoDialog(dialog.f18332id, false)) {
                        break;
                    }
                }
            }
            if (i12 > 1) {
                if (this.f38256e0 != null) {
                    int i14 = 0;
                    while (true) {
                        ty[] tyVarArr = this.f38256e0;
                        if (i14 >= tyVarArr.length) {
                            break;
                        }
                        tyVarArr[i14].d.H = true;
                        i14++;
                    }
                }
                g5(MessagesController.UPDATE_MASK_REORDER, true);
            }
            if (!this.f38312p3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f38278i1;
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
            ValueAnimator valueAnimator = this.f38339u3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f38339u3 = ValueAnimator.ofFloat(this.f38334t3, 1.0f);
            int i16 = 0;
            while (true) {
                ty[] tyVarArr2 = this.f38256e0;
                if (i16 >= tyVarArr2.length) {
                    break;
                }
                ty tyVar = tyVarArr2[i16];
                if (tyVar != null) {
                    tyVar.f37904a.J0(true);
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
            this.f38339u3.addUpdateListener(new yv(this, max, 0));
            this.f38339u3.addListener(new xx(this, max, 1));
            this.f38339u3.setInterpolator(org.telegram.ui.Components.qr.f27642f);
            this.f38339u3.setDuration(200L);
            this.f38339u3.start();
            sw swVar = this.f38360z0;
            if (swVar != null) {
                swVar.b(org.telegram.ui.ActionBar.j6.Gh, org.telegram.ui.ActionBar.j6.Fh, org.telegram.ui.ActionBar.j6.Eh, org.telegram.ui.ActionBar.j6.Hh, org.telegram.ui.ActionBar.j6.f19445w8);
            }
            org.telegram.ui.ActionBar.g2 g2Var = this.f38257e1;
            if (g2Var != null) {
                g2Var.c(1.0f, true);
            }
            z10 = false;
        }
        T4(false);
        this.f38273h1.a(arrayList.size(), z10);
    }

    public final void N3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f38357y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new yx(this, parentActivity);
                FrameLayout.LayoutParams d = w7.y5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.f38266f4 + this.f38276h4 + d.bottomMargin;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.f38352x0 + 1;
                this.f38352x0 = i11;
                ((ny) this.fragmentView).addView(undoView, i11, d);
            }
        }
    }

    public final void N4(long j3, View view) {
        String str;
        org.telegram.ui.Components.pc J;
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
            J = org.telegram.ui.Components.xc.a0(this).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = org.telegram.ui.Components.xc.a0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new qv(this, 22));
        }
        J.j();
    }

    public final void O3(final long j3, final long j10, boolean z10, final fg1 fg1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String string;
        String formatStringSimple;
        String string2;
        String str;
        String str2;
        TLRPC.TL_forumTopic findTopic;
        if (p3(j3)) {
            int i10 = this.R0;
            if (i10 != 11 && i10 != 12 && i10 != 13) {
                if (z10 && ((this.f38264f2 != null && this.f38269g2 != null) || this.f38274h2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (DialogObject.isEncryptedDialog(j3)) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.l0.k(getMessagesController(), j3).user_id));
                            if (user2 != null) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f38264f2, UserObject.getUserName(user2));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                return;
                            }
                        } else if (DialogObject.isUserDialog(j3)) {
                            if (j3 == getUserConfig().getClientUserId()) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f38269g2, LocaleController.getString(R.string.SavedMessages));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j3));
                                if (user3 != null && this.f38264f2 != null) {
                                    str = LocaleController.getString(R.string.SendMessageTitle);
                                    str2 = LocaleController.formatStringSimple(this.f38264f2, UserObject.getUserName(user3));
                                    string2 = LocaleController.getString(R.string.Send);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j3));
                            if (chat2 != null) {
                                String str3 = chat2.title;
                                if (j10 != 0 && (findTopic = getMessagesController().getTopicsController().findTopic(chat2.f18328id, j10)) != null) {
                                    str3 = ((Object) str3) + " " + findTopic.title;
                                }
                                if (this.f38274h2 != null) {
                                    string = LocaleController.getString(R.string.AddToTheGroupAlertTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f38274h2, str3);
                                    string2 = LocaleController.getString(R.string.Add);
                                } else {
                                    string = LocaleController.getString(R.string.SendMessageTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f38269g2, str3);
                                    string2 = LocaleController.getString(R.string.Send);
                                }
                                String str4 = formatStringSimple;
                                str = string;
                                str2 = str4;
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                        b2Var.R = str;
                        b2Var.T = AndroidUtilities.replaceTags(str2);
                        alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.a2() {
                            @Override
                            public final void k(org.telegram.ui.ActionBar.b2 b2Var2, int i11) {
                                uy.this.O3(j3, j10, false, fg1Var);
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
                        Q4(getMessagesController().getChat(Long.valueOf(-j3)), h0Var, null);
                        return;
                    }
                    TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(j3));
                    TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(this.H));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user4), UserObject.getFirstName(user5));
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f18654a;
                    b2Var2.R = formatString;
                    b2Var2.T = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user4), UserObject.getFirstName(user5))));
                    alertDialog$Builder2.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new fu(h0Var, 2));
                    alertDialog$Builder2.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.ig0(22));
                    showDialog(b2Var2);
                    return;
                } else if (this.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j3, j10));
                    if (this.C2.u(this, arrayList, null, false, this.J2, this.K2, this.L2, fg1Var) && this.f38279i2) {
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
                    UndoView Y3 = Y3();
                    if (Y3 != null) {
                        Y3.j(45, j3, null);
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
                    UndoView Y32 = Y3();
                    if (Y32 != null) {
                        Y32.j(46, j3, null);
                        return;
                    }
                    return;
                }
            }
            org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().getInputPeer(j3);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new qw(this, b2Var3, user, chat, j3, tL_messages_checkHistoryImportPeer));
            try {
                b2Var3.q(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void O4(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.O4(boolean, boolean, boolean, boolean):void");
    }

    public final void P3(long j3, boolean z10) {
        if (this.f38256e0 != null) {
            int i10 = 0;
            while (true) {
                ty[] tyVarArr = this.f38256e0;
                if (i10 < tyVarArr.length) {
                    int childCount = tyVarArr[i10].f37904a.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 < childCount) {
                            View childAt = this.f38256e0[i10].f37904a.getChildAt(i11);
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

    public final void P4() {
        int i10;
        int i11;
        Long l4;
        if (this.M0 == null && !SharedConfig.appLocked && (!this.K || this.E0.g())) {
            a71[] a71VarArr = new a71[1];
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            org.telegram.ui.ActionBar.j5 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.D3.f();
                Drawable drawable = this.D3.f26565f[0];
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
            px pxVar = new px(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), a71VarArr);
            if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
                pxVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
            }
            Long l10 = this.B3;
            if (l10 != null) {
                pxVar.setSelected(l10);
            } else {
                Drawable drawable2 = this.D3.f26565f[0];
                if (drawable2 instanceof org.telegram.ui.Components.p5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.p5) drawable2).i());
                } else {
                    l4 = null;
                }
                pxVar.setSelected(l4);
            }
            pxVar.setSaveState(1);
            pxVar.y(this.D3, titleTextView);
            qx qxVar = new qx(this, pxVar);
            this.M0 = qxVar;
            a71VarArr[0] = qxVar;
            qxVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i11, 48);
            a71VarArr[0].b();
        }
    }

    public final void Q4(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.Q4(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final java.util.ArrayList R3(int r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.R3(int, int, int, boolean):java.util.ArrayList");
    }

    public final void R4(boolean z10) {
        ty[] tyVarArr;
        char c10;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            tyVarArr = this.f38256e0;
            if (i12 >= tyVarArr.length) {
                break;
            }
            tyVarArr[i12].f37904a.C0();
            i12++;
        }
        if (z10 && tyVarArr.length > 1) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int i13 = tyVarArr[c10].h;
        if (i13 >= 0 && i13 < getMessagesController().getDialogFilters().size()) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.f38256e0[c10].h);
            if (dialogFilter.isDefault()) {
                ty tyVar = this.f38256e0[c10];
                tyVar.f37910s = this.R0;
                qy qyVar = tyVar.f37904a;
                int i14 = qy.f36981v3;
                qyVar.B1();
            } else {
                ty[] tyVarArr2 = this.f38256e0;
                if (tyVarArr2[c10 ^ 1].f37910s == 7) {
                    tyVarArr2[c10].f37910s = 8;
                } else {
                    tyVarArr2[c10].f37910s = 7;
                }
                tyVarArr2[c10].f37904a.setScrollEnabled(true);
                MessagesController messagesController = getMessagesController();
                if (this.f38256e0[c10].f37910s == 8) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                messagesController.selectDialogFilter(dialogFilter, i10);
            }
            ty[] tyVarArr3 = this.f38256e0;
            if (tyVarArr3.length > 1) {
                tyVarArr3[1].E = dialogFilter.locked;
            }
            ty tyVar2 = tyVarArr3[c10];
            bx bxVar = tyVar2.d;
            bxVar.h = tyVar2.f37910s;
            bxVar.l();
            ty tyVar3 = this.f38256e0[c10];
            xw xwVar = tyVar3.f37906c;
            if (tyVar3.f37910s == 0 && Z3() && this.f38256e0[c10].v == 2) {
                i11 = 1;
            }
            xwVar.h1(i11, (int) this.N);
            r3(this.f38256e0[c10]);
        }
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        ox oxVar;
        ci.eb ebVar;
        sw swVar;
        boolean z11;
        boolean z12;
        if (!this.f38312p3 && (((oxVar = this.F3) == null || !oxVar.c()) && (((ebVar = this.K0) == null || ebVar.getVisibility() != 0) && ((swVar = this.f38360z0) == null || !swVar.f25586n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                sw swVar2 = this.f38360z0;
                if (swVar2 != null && swVar2.getTabsCount() >= 2 && this.f38360z0.getCurrentTabId() != this.f38360z0.getFirstTabId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                sw swVar3 = this.f38360z0;
                if (swVar3 != null && swVar3.getTabsCount() >= 2 && this.f38360z0.getCurrentTabId() != this.f38360z0.getLastTabId()) {
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

    public final float S3(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f - this.f38239b.e;
        } else {
            f7 = 1.0f;
        }
        return f7 * (1.0f - V3()) * this.f38319r.e;
    }

    public final void S4() {
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
        w41 w41Var = this.Z;
        if (w41Var != null && w41Var.getVisibility() != 8) {
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
            float f20 = this.f38353x1;
            f11 = (f7 * f20) + com.google.android.gms.internal.vision.e2.z(1.0f, f20, f10, f19);
            f12 = this.f38350w3;
        } else {
            f11 = (f7 * this.f38353x1) + this.N;
            f12 = this.f38350w3;
        }
        float f21 = f11 + f12 + this.T;
        ky kyVar = this.X;
        if (kyVar != null && kyVar.getVisibility() == 0) {
            f13 = this.X.getAlpha();
        } else {
            f13 = 0.0f;
        }
        float dp = AndroidUtilities.dp(4.0f) * f13;
        sw swVar = this.f38360z0;
        if (swVar != null) {
            swVar.setTranslationY(f21 - dp);
            f15 = this.f38360z0.getAlpha();
            f16 = AndroidUtilities.dp(43.0f) * f15;
            f14 = f21 + f16;
        } else {
            f14 = f21;
            f15 = 0.0f;
            f16 = 0.0f;
        }
        org.telegram.ui.Components.ks ksVar = this.J1;
        if (ksVar != null) {
            float f22 = f14 - dp;
            int i11 = -AndroidUtilities.dp(3.0f);
            if (this.f38235a0 == null) {
                i10 = AndroidUtilities.dp(44.0f);
            } else {
                i10 = 0;
            }
            ksVar.setTranslationY(AndroidUtilities.lerp(f22, i11 - i10, this.f38239b.e));
            f17 = this.J1.getMetadata().f14185c.f14193a;
            f18 = this.J1.c(0.0f);
        } else {
            f17 = 0.0f;
            f18 = 0.0f;
        }
        org.telegram.ui.Components.js jsVar = this.K1;
        if (jsVar != null) {
            jsVar.setTranslationY(f21 - dp);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f17, f15));
            org.telegram.ui.Components.js jsVar2 = this.K1;
            float min = Math.min(AndroidUtilities.dp(40.0f), (f18 + f16) - lerp);
            Matrix matrix = jsVar2.f25437b;
            if (jsVar2.e != lerp || jsVar2.f25439f != min) {
                jsVar2.e = lerp;
                jsVar2.f25439f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = jsVar2.f25438c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                jsVar2.invalidate();
            }
            this.K1.setAlpha(Math.max(f15, f17));
        }
    }

    public final int T3() {
        if (this.K) {
            return AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(81.0f);
        }
        return AndroidUtilities.dp(48.0f);
    }

    public final void T4(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.T4(boolean):void");
    }

    public final int U3() {
        if (this.K) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    public final void U4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.U4():void");
    }

    public final float V3() {
        ox oxVar = this.F3;
        if (oxVar != null && oxVar.c()) {
            return this.F3.e;
        }
        return 0.0f;
    }

    public final void V4(boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.V4(boolean, boolean):void");
    }

    public final float W3() {
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.f38239b.e);
    }

    public final void W4(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.W4(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    public final ai.l9 X3() {
        return getMessagesController().getStoriesController();
    }

    public final void X4() {
        float f7 = (((-this.f38266f4) - this.f38281i4) - this.f38337u1) - this.f38342v1;
        org.telegram.ui.Components.y10 y10Var = this.f38331t0;
        if (y10Var != null) {
            y10Var.setTranslationY(f7);
        }
        org.telegram.ui.Components.y10 y10Var2 = this.f38336u0;
        if (y10Var2 != null) {
            y10Var2.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            ci.f4 f4Var = this.f38309p0;
            if (f4Var != null) {
                f4Var.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    public final UndoView Y3() {
        N3();
        UndoView[] undoViewArr = this.f38357y0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.e(2, true);
            ny nyVar = (ny) this.fragmentView;
            nyVar.removeView(undoViewArr[0]);
            nyVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void Y4(boolean z10) {
        boolean z11;
        boolean z12 = this.f38292l2;
        if ((!z12 || this.R0 == 10) && this.V2 == 0 && this.X2 == 0 && !this.inPreviewMode && ((!this.f38284j2 || z12) && !this.T3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.y10 y10Var = this.f38331t0;
        if (y10Var != null) {
            y10Var.e(z11, z10);
        }
        org.telegram.ui.Components.y10 y10Var2 = this.f38336u0;
        if (y10Var2 != null) {
            y10Var2.e(z11, z10);
        }
    }

    public final boolean Z3() {
        if (!this.f38292l2 && this.R0 == 0 && this.X2 == 0 && this.V2 == 0 && getMessagesController().hasHiddenArchive()) {
            return true;
        }
        return false;
    }

    public final void Z4(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        if (this.f38299n0 != null) {
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
                if (!getDownloadController().hasUnviewedDownloads() && !z12 && (this.f38267g0.getVisibility() != 0 || this.f38267g0.getAlpha() != 1.0f || z11)) {
                    this.f38277i0 = false;
                } else {
                    this.f38277i0 = true;
                }
                x3();
                boolean z14 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i12 = this.f38253d2;
                z13 = (i12 == 3 || i12 == 5) ? true : true;
                org.telegram.ui.ActionBar.f1 f1Var = this.f38304o0;
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
                this.f38299n0.b(z14, z13, z10);
            }
        }
    }

    public final boolean a4() {
        ArrayList arrayList = this.D2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void a5() {
        org.telegram.ui.Components.zq0 zq0Var;
        int i10;
        ex exVar = this.B1;
        ArrayList arrayList = this.I2;
        if (exVar != null) {
            this.f38298n.a(!arrayList.isEmpty(), true);
            b5();
            if (arrayList.isEmpty()) {
                if (this.R0 == 3 && this.f38264f2 == null) {
                    i10 = R.string.ForwardTo;
                } else {
                    i10 = R.string.SelectChat;
                }
                String string = LocaleController.getString(i10);
                if (this.P3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(string);
                } else {
                    this.actionBar.J(string, true, 350L, org.telegram.ui.Components.qr.h);
                }
                if (this.B1.getTag() != null) {
                    this.B1.n0(false, false, false);
                    this.B1.P();
                    this.B1.setTag(null);
                    this.fragmentView.requestLayout();
                }
            } else {
                if (this.B1.getTag() == null) {
                    if (!a4() && this.E2 == null) {
                        this.B1.setFieldText("");
                    }
                    this.B1.setTag(1);
                    if (!this.V3 && (zq0Var = this.G2) != null) {
                        this.V3 = true;
                        String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                        zq0Var.j();
                        zq0Var.F = string2;
                        org.telegram.ui.Components.xq0 xq0Var = zq0Var.f30901a[0];
                        if (string2 != null) {
                            xq0Var.e.l(string2, false);
                        }
                        org.telegram.ui.Components.jc0 jc0Var = new org.telegram.ui.Components.jc0(zq0Var, 29);
                        zq0Var.G = jc0Var;
                        AndroidUtilities.runOnUIThread(jc0Var, 1000L);
                    }
                }
                this.C1.g(Math.max(1, arrayList.size()), true);
                int i11 = this.S0 + (!TextUtils.isEmpty(this.B1.getFieldText()) ? 1 : 0);
                int size = arrayList.size();
                long j3 = 0;
                int i12 = 0;
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
                this.B1.R1();
                if (this.P3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]));
                } else {
                    this.actionBar.J(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.qr.h);
                }
            }
            this.P3 = arrayList.isEmpty();
        } else if (this.R0 == 10) {
            c4(arrayList.isEmpty());
        }
    }

    public final void b4(boolean z10) {
        int i10;
        boolean z11;
        this.actionBar.r();
        this.I2.clear();
        org.telegram.ui.ActionBar.g2 g2Var = this.f38257e1;
        if (g2Var != null) {
            g2Var.c(0.0f, true);
        }
        sw swVar = this.f38360z0;
        if (swVar != null) {
            swVar.b(org.telegram.ui.ActionBar.j6.K8, org.telegram.ui.ActionBar.j6.I8, org.telegram.ui.ActionBar.j6.J8, org.telegram.ui.ActionBar.j6.L8, org.telegram.ui.ActionBar.j6.f19094d6);
        }
        ValueAnimator valueAnimator = this.f38339u3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f38339u3 = null;
        }
        if (this.f38334t3 == 0.0f) {
            return;
        }
        C4(-T3());
        int i11 = 0;
        while (true) {
            ty[] tyVarArr = this.f38256e0;
            if (i11 >= tyVarArr.length) {
                break;
            }
            ty tyVar = tyVarArr[i11];
            if (tyVar != null) {
                tyVar.f37904a.J0(true);
            }
            i11++;
        }
        if (this.K) {
            i10 = 81;
        } else {
            i10 = 0;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp(i10 + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38334t3, 0.0f);
        this.f38339u3 = ofFloat;
        ofFloat.addUpdateListener(new yv(this, max, 1));
        this.f38339u3.addListener(new xx(this, max, 0));
        this.f38339u3.setInterpolator(org.telegram.ui.Components.qr.f27642f);
        this.f38339u3.setDuration(200L);
        this.f38339u3.start();
        this.Y0 = false;
        ArrayList arrayList = this.f38236a1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i12);
                f10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
                i12++;
                arrayList = arrayList;
                size = size;
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
        T4(true);
        if (this.f38256e0 != null) {
            int i13 = 0;
            while (true) {
                ty[] tyVarArr2 = this.f38256e0;
                if (i13 >= tyVarArr2.length) {
                    break;
                }
                tyVarArr2[i13].d.H = z11;
                i13++;
            }
        }
        int i14 = MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK;
        int i15 = z11;
        if (z10) {
            i15 = MessagesController.UPDATE_MASK_CHAT;
        }
        g5(i15 | i14, true);
    }

    public final void b5() {
        org.telegram.ui.Components.zq0 zq0Var = this.G2;
        if (zq0Var != null) {
            int i10 = this.currentAccount;
            zq0Var.h(i10);
            zq0Var.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
            ArrayList arrayList = zq0Var.f30904f;
            arrayList.clear();
            ArrayList arrayList2 = this.I2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            org.telegram.ui.Components.xq0 xq0Var = zq0Var.f30901a[0];
            if (zq0Var.f30902b == 1) {
                xq0Var.d.l(zq0Var.c(xq0Var), false);
            }
        }
    }

    public final void c4(boolean z10) {
        if (this.F3.c()) {
            z10 = true;
        }
        if (!z10 || !this.f38242b2) {
            this.T3 = z10;
            Y4(true);
            if (z10) {
                ci.f4 f4Var = this.f38309p0;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                ci.f4 f4Var2 = this.f38314q0;
                if (f4Var2 != null) {
                    f4Var2.e(true);
                }
            }
        }
    }

    public final void c5(boolean z10) {
        boolean z11;
        if (this.f38291l0 == null) {
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

    @Override
    public final boolean canBeginSlide() {
        sw swVar;
        if (!this.F3.c()) {
            if (this.R0 == 3 && (swVar = this.f38360z0) != null && swVar.getVisibility() == 0 && this.f38360z0.K > 0) {
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
            ey eyVar = this.C0;
            if (eyVar != null) {
                eyVar.S();
                return true;
            }
            return true;
        }
        return super.closeLastFragment();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.Components.x7 x7Var = new org.telegram.ui.Components.x7(this, context, this.resourceProvider, 3);
        x7Var.setAllowOverlayTitle(true);
        x7Var.L();
        x7Var.A(getThemedColor(org.telegram.ui.ActionBar.j6.f19391t8), false);
        x7Var.A(getThemedColor(org.telegram.ui.ActionBar.j6.f19498z8), true);
        x7Var.B(getThemedColor(org.telegram.ui.ActionBar.j6.f19427v8), false);
        x7Var.B(getThemedColor(org.telegram.ui.ActionBar.j6.f19479y8), true);
        x7Var.k();
        x7Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        x7Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.V2 == 0 || e4())) {
            return x7Var;
        }
        x7Var.setOccupyStatusBar(false);
        return x7Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.createView(android.content.Context):android.view.View");
    }

    public final void d5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.n5 n5Var;
        lx lxVar = this.E0;
        org.telegram.ui.Components.n5 n5Var2 = null;
        if (lxVar != null && (n5Var = lxVar.f541a0) != null && lxVar.f560q0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                n5Var.j(emojiStatusDocumentId.longValue(), z10);
                n5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z10);
            } else if (user != null && MessagesController.getInstance(lxVar.f548f).isPremiumUser(user)) {
                if (lxVar.N0 == null) {
                    lxVar.N0 = lxVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    lxVar.N0 = new org.telegram.ui.Components.o5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), lxVar.N0);
                }
                lxVar.N0.setColorFilter(new PorterDuffColorFilter(lxVar.f(org.telegram.ui.ActionBar.j6.f19507zh), PorterDuff.Mode.MULTIPLY));
                n5Var.g(lxVar.N0, z10);
                n5Var.m(false, z10);
            } else {
                n5Var.g(null, z10);
                n5Var.m(false, z10);
            }
            n5Var.k(Integer.valueOf(lxVar.f(org.telegram.ui.ActionBar.j6.f19507zh)));
            lxVar.W.invalidate();
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
                this.actionBar.setRightDrawableOnClick(new wv(this, 2));
                j71.t(this.currentAccount);
            } else if (user != null && MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
                if (this.K3 == null) {
                    this.K3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    this.K3 = new org.telegram.ui.Components.o5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.K3);
                }
                this.K3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f19507zh), PorterDuff.Mode.MULTIPLY));
                this.D3.g(this.K3, z10);
                this.D3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(new wv(this, 3));
                j71.t(this.currentAccount);
            } else {
                this.D3.g(null, z10);
                this.D3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.n5 n5Var3 = this.D3;
            int i10 = org.telegram.ui.ActionBar.j6.f19507zh;
            n5Var3.k(Integer.valueOf(getThemedColor(i10)));
            org.telegram.ui.Cells.o oVar = this.E3;
            if (oVar != null) {
                oVar.setColor(getThemedColor(i10));
            }
            qx qxVar = this.M0;
            if (qxVar != null && (qxVar.getContentView() instanceof j71)) {
                org.telegram.ui.ActionBar.j5 titleTextView = this.actionBar.getTitleTextView();
                j71 j71Var = (j71) this.M0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.n5 n5Var4 = this.D3;
                    if (rightDrawable == n5Var4) {
                        n5Var2 = n5Var4;
                    }
                }
                j71Var.y(n5Var2, titleTextView);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r27, int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.didReceivedNotification(int, int, java.lang.Object[]):void");
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
        if (this.V2 == 1) {
            return true;
        }
        return false;
    }

    public final void e5() {
        ci.f4 f4Var;
        boolean storiesEnabled = getMessagesController().storiesEnabled();
        if (this.N3 != storiesEnabled) {
            X4();
            if (!this.N3 && storiesEnabled && (f4Var = this.f38309p0) != null) {
                f4Var.u();
            }
            this.N3 = storiesEnabled;
        }
        org.telegram.ui.Components.y10 y10Var = this.f38331t0;
        if (y10Var == null) {
            return;
        }
        if (this.R0 == 10) {
            y10Var.setImageResource(R.drawable.floating_check);
            this.f38331t0.setContentDescription(LocaleController.getString(R.string.Done));
            return;
        }
        y10Var.setImageResource(R.drawable.filled_fab_compose_32);
        this.f38331t0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
    }

    public final boolean f4(long j3) {
        if (j3 < 0) {
            return false;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f18475id);
        if ((topics != null && !topics.isEmpty()) || !MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f18475id)) {
            return false;
        }
        return true;
    }

    public final void f5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        boolean z12;
        ai.l9 X3;
        ArrayList arrayList;
        boolean z13;
        boolean z14;
        int i10;
        float f7;
        float f10;
        if (this.E0 != null && this.I == null) {
            ox oxVar = this.F3;
            if ((oxVar == null || !oxVar.c()) && !this.f38312p3 && (kVar = this.actionBar) != null && !kVar.s() && !this.f38292l2) {
                ci.oc ocVar = ci.oc.F2;
                int i11 = 0;
                if ((ocVar != null && ocVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
                    z10 = false;
                }
                if (!e4() && X3().G()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.X2 != 0) {
                    z12 = false;
                } else if (e4()) {
                    z12 = !X3().h.isEmpty();
                } else {
                    if (!z11 && (((arrayList = (X3 = X3()).f1197g) != null && arrayList.size() > 0) || X3.H())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z11 = X3().G();
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
                    lx lxVar = this.E0;
                    if (z13 != z15) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    lxVar.p(z10, z14);
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
                        ofFloat.addUpdateListener(new bj(1, this));
                        this.J.addListener(new org.telegram.ui.Components.r81(this, 18));
                        this.J.setDuration(200L);
                        this.J.setInterpolator(org.telegram.ui.Components.qr.f27642f);
                        this.J.start();
                    } else {
                        lx lxVar2 = this.E0;
                        if (z16 && !isInPreviewMode()) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        lxVar2.setVisibility(i10);
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
                            f11 = T3();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.I = ofFloat2;
                        ofFloat2.addUpdateListener(new dy(this, f13, z12, f11));
                        this.I.addListener(new ux(this, z12, 2));
                        this.I.setDuration(200L);
                        this.I.setInterpolator(org.telegram.ui.Components.qr.f27642f);
                        this.I.start();
                        return;
                    }
                    this.K = z12;
                    lx lxVar3 = this.E0;
                    if ((z12 || this.L) && !isInPreviewMode()) {
                        i12 = 0;
                    }
                    lxVar3.setVisibility(i12);
                    if (!z12) {
                        C4(0.0f);
                    } else {
                        this.f38355x3 = -AndroidUtilities.dp(81.0f);
                        C4(-T3());
                    }
                    while (true) {
                        ty[] tyVarArr = this.f38256e0;
                        if (i11 >= tyVarArr.length) {
                            break;
                        }
                        ty tyVar = tyVarArr[i11];
                        if (tyVar != null) {
                            tyVar.f37904a.requestLayout();
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
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.v70 v70Var = this.L0;
        if (v70Var != null) {
            v70Var.u();
        }
    }

    public final boolean g4(TLRPC.Dialog dialog) {
        char c10;
        if (dialog == null) {
            return false;
        }
        int i10 = this.f38256e0[0].f37910s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f38256e0[0].f37910s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            dialogFilter = dialogFilterArr[c10];
        }
        if (dialogFilter != null) {
            if (dialogFilter.pinnedDialogs.indexOfKey(dialog.f18332id) < 0) {
                return false;
            }
            return true;
        }
        return dialog.pinned;
    }

    public final void g5(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.g5(int, boolean):void");
    }

    @Override
    public final org.telegram.ui.ActionBar.z4 getBackButtonState() {
        if (!e4() && !this.F3.f35598f) {
            return org.telegram.ui.ActionBar.z4.f19969b;
        }
        return org.telegram.ui.ActionBar.z4.f19968a;
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
        ofFloat2.addUpdateListener(new sv(this, 2));
        this.Z3.setInterpolator(org.telegram.ui.Components.qr.f27643g);
        this.Z3.setDuration(i10);
        this.Z3.start();
        return this.Z3;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.getThemeDescriptions():java.util.ArrayList");
    }

    public final boolean h4() {
        if (this.C2 == null && this.f38301n2 == null) {
            return true;
        }
        return false;
    }

    public final boolean h5(long j3) {
        TLRPC.Chat chat;
        ex exVar;
        if ((this.S0 <= 1 && ((exVar = this.B1) == null || exVar.getVisibility() != 0 || TextUtils.isEmpty(this.B1.getFieldText()))) || !DialogObject.isChatDialog(j3) || (chat = getMessagesController().getChat(Long.valueOf(-j3))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.d5.u0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    public final boolean i3(long j3, View view) {
        if (this.f38292l2 && getMessagesController().isForum(j3)) {
            return false;
        }
        Long valueOf = Long.valueOf(j3);
        ArrayList arrayList = this.I2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j3));
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).V(false, true);
            } else if (view instanceof org.telegram.ui.Cells.j6) {
                ((org.telegram.ui.Cells.j6) view).s(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j3));
        if (view instanceof org.telegram.ui.Cells.s2) {
            ((org.telegram.ui.Cells.s2) view).V(true, true);
        } else if (view instanceof org.telegram.ui.Cells.j6) {
            ((org.telegram.ui.Cells.j6) view).s(true, true);
        }
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        ox oxVar;
        if (!this.f38284j2 && (oxVar = this.F3) != null && oxVar.getFragment() != null) {
            return this.F3.getFragment().isLightStatusBar();
        }
        if (i0.a.f(getThemedColor(org.telegram.ui.ActionBar.j6.f19094d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j3(gg.q0 q0Var) {
        ey eyVar;
        if (this.f38312p3 && (eyVar = this.C0) != null) {
            ArrayList arrayList = eyVar.B0;
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (q0Var.b((gg.q0) arrayList.get(i10))) {
                        return;
                    }
                }
            }
            arrayList.add(q0Var);
            ky kyVar = this.X;
            ArrayList arrayList2 = kyVar.F;
            arrayList2.add(q0Var);
            kyVar.I = arrayList2.size() - 1;
            kyVar.f();
            this.X.f22856r.getText().clear();
            W4(true, null, null, false, true);
        }
    }

    public final void j4(long r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.j4(long):void");
    }

    public final void k3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.V2 == 0 && this.X2 == 0 && Build.VERSION.SDK_INT >= 33 && ik0.n(parentActivity)) {
                if (z10) {
                    showDialog(new ik0(parentActivity, !org.telegram.ui.Components.le0.c(), new hw(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().syncContacts && this.U1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z10) {
                    org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.d5.w(parentActivity, new aw(this, 1)).f18654a;
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
                    J4();
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

    public final boolean k4(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.User r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.k4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    public final void l3(CharSequence charSequence) {
        int i10;
        if (this.B1 != null) {
            if (this.D2 == null && this.E2 == null && this.F2 == null) {
                return;
            }
            if (this.G2 == null) {
                org.telegram.ui.Components.zq0 zq0Var = new org.telegram.ui.Components.zq0(getParentActivity(), getResourceProvider());
                this.G2 = zq0Var;
                zq0Var.setLayoutClickListener(new wv(this, 0));
                this.G2.setOnModeChangeListener(new xv(this, 0));
                ex exVar = this.B1;
                org.telegram.ui.Components.zq0 zq0Var2 = this.G2;
                if (zq0Var2 == null) {
                    exVar.getClass();
                } else {
                    exVar.F1 = zq0Var2;
                    exVar.addView(zq0Var2, 0, w7.y5.e(-1, 48, 51));
                    exVar.f21989f3 = false;
                    exVar.N();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G2.getLayoutParams();
                layoutParams.rightMargin = -this.B1.getPaddingRight();
                this.G2.setLayoutParams(layoutParams);
            }
            if (a4()) {
                this.G2.i(this.currentAccount, this.D2);
            } else {
                String str = this.E2;
                if (str != null) {
                    org.telegram.ui.Components.zq0 zq0Var3 = this.G2;
                    zq0Var3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        zq0Var3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.F2;
                    if (charSequence2 != null) {
                        org.telegram.ui.Components.zq0 zq0Var4 = this.G2;
                        zq0Var4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            zq0Var4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.B1.setFieldText(charSequence);
            }
            ex exVar2 = this.B1;
            if (a4()) {
                i10 = R.string.AddCaption;
            } else {
                i10 = R.string.ShareComment;
            }
            exVar2.setOverrideHint(LocaleController.getString(i10));
            v3();
            if (this.G2.getMode() != 0) {
                this.B1.w1(false, false);
            }
            b5();
        }
    }

    public final boolean l4(TLRPC.User user) {
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

    public final void m3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.m3():void");
    }

    public final void m4(View view) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        String str = null;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.f6) null, false);
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
        vv vvVar = new vv(this, 0);
        f3Var.items = charSequenceArr;
        f3Var.itemIcons = iArr;
        f3Var.onClickListener = vvVar;
        showDialog(f3Var);
    }

    public final int n3() {
        if (this.B1 != null) {
            return (int) (this.f38358y1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        } else if (this.X2 != 0) {
            return AndroidUtilities.dp(72.0f) + this.f38266f4;
        } else {
            return this.f38266f4 + this.f38276h4;
        }
    }

    public final void n4(android.view.View r25, int r26, s4.h0 r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.n4(android.view.View, int, s4.h0):void");
    }

    public final void o3() {
        AndroidUtilities.runOnUIThread(new qv(this, 2), 300L);
    }

    public final boolean o4(View view, int i10, float f7, org.telegram.ui.Components.ul0 ul0Var) {
        org.telegram.ui.Components.eo0 eo0Var;
        long j3;
        org.telegram.ui.Components.eo0 eo0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.a3) && ul0Var.j(i10) != 21) {
            if (!this.actionBar.s() && !AndroidUtilities.isTablet() && !this.f38292l2 && (view instanceof org.telegram.ui.Cells.s2)) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (!getMessagesController().isForum(s2Var.getDialogId()) && !this.F3.c() && s2Var.S(f7)) {
                    return H4(s2Var);
                }
            }
            ox oxVar = this.F3;
            if (oxVar == null || !oxVar.c()) {
                ey eyVar = this.C0;
                boolean z10 = true;
                if (eyVar != null && ul0Var == (eo0Var2 = eyVar.f26196c0)) {
                    Object J = eo0Var2.J(i10);
                    if (!this.C0.f26196c0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                        b2Var.R = string;
                        if (J instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) J;
                            if (chat.monoforum) {
                                b2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, ng.d.i(chat, this.currentAccount, false));
                            } else {
                                b2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            makeEncryptedDialogId = -chat.f18328id;
                        } else if (J instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) J;
                            if (user.f18475id == getUserConfig().clientUserId) {
                                b2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                b2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            makeEncryptedDialogId = user.f18475id;
                        } else if (J instanceof TLRPC.EncryptedChat) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) J).user_id));
                            b2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.f18336id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new ai.z1(this, makeEncryptedDialogId, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(b2Var);
                        TextView textView = (TextView) b2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19333q7));
                        }
                        return true;
                    }
                }
                ey eyVar2 = this.C0;
                if (eyVar2 != null && ul0Var == (eo0Var = eyVar2.f26196c0)) {
                    if (this.f38292l2) {
                        n4(view, i10, ul0Var);
                        return false;
                    }
                    if ((view instanceof org.telegram.ui.Cells.j6) && !eo0Var.O(i10)) {
                        j3 = ((org.telegram.ui.Cells.j6) view).getDialogId();
                    } else {
                        j3 = 0;
                    }
                    if (j3 != 0) {
                        M4(j3, view);
                        return true;
                    }
                } else {
                    Object I = ((gg.m) ul0Var).I(i10);
                    if (I instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) I;
                        if (this.f38292l2) {
                            if ((this.R0 == 3 || I3()) && h5(dialog.f18332id)) {
                                if (this.R0 == 1 && I3() && this.f38295m2 && getMessagesController().isForum(dialog.f18332id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f18332id);
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
                                i3(dialog.f18332id, view);
                                a5();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            m4(view);
                            return false;
                        } else if (!this.actionBar.s() || !g4(dialog)) {
                            M4(dialog.f18332id, view);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
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
                ey eyVar = this.C0;
                if (eyVar != null) {
                    eyVar.S();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.v70 v70Var = this.L0;
            if (v70Var != null) {
                if (z10) {
                    v70Var.u();
                    this.L0 = null;
                    return false;
                }
            } else {
                sw swVar = this.f38360z0;
                if (swVar != null && swVar.f25586n) {
                    if (z10) {
                        swVar.setIsEditing(false);
                        I4(false);
                        return false;
                    }
                } else {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar != null && kVar.s()) {
                        if (z10) {
                            ey eyVar2 = this.C0;
                            if (eyVar2 != null && eyVar2.getVisibility() == 0) {
                                this.C0.R(false);
                            }
                            b4(true);
                            return false;
                        }
                    } else if (this.f38239b.f14170f) {
                        if (z10) {
                            this.X.f22856r.getText().clear();
                            this.Y.b(false);
                            this.X.f22856r.clearFocus();
                            return false;
                        }
                    } else {
                        sw swVar2 = this.f38360z0;
                        if (swVar2 != null && swVar2.getVisibility() == 0 && !this.f38270g3) {
                            sw swVar3 = this.f38360z0;
                            if (!swVar3.O && !this.f38293l3) {
                                ArrayList arrayList = swVar3.h;
                                if (!arrayList.isEmpty() && swVar3.L != ((org.telegram.ui.Components.g00) arrayList.get(0)).f24220a) {
                                    if (z10) {
                                        sw swVar4 = this.f38360z0;
                                        ArrayList arrayList2 = swVar4.h;
                                        if (!arrayList2.isEmpty()) {
                                            swVar4.f((org.telegram.ui.Components.g00) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        ex exVar = this.B1;
                        if (exVar != null && exVar.t0()) {
                            if (z10) {
                                this.B1.m0(true);
                            }
                        } else {
                            lx lxVar = this.E0;
                            if (lxVar.O == 0 && lxVar.S.L0() != 0) {
                                lxVar.h.y0(0);
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
        ci.eb ebVar;
        sw swVar;
        if (this.V1) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                ey eyVar = this.C0;
                if (eyVar != null) {
                    eyVar.f26196c0.R(this.W1, tLObject);
                }
                this.X1 = null;
            }
            this.V1 = false;
        }
        if (!this.K && (swVar = this.f38360z0) != null && swVar.getVisibility() == 0 && this.f38319r.f14170f) {
            int i10 = (int) (-this.N);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.f38256e0[0].f37904a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f38357y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        if (!isInPreviewMode() && (ebVar = this.K0) != null && ebVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        B3();
        this.f38320r0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        ci.f4 f4Var;
        super.onBecomeFullyVisible();
        if (e4()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z10 = globalMainSettings.getBoolean("archivehint", true);
            boolean isEmpty = R3(this.currentAccount, this.R0, this.V2, false).isEmpty();
            if (z10 && isEmpty) {
                MessagesController.getGlobalMainSettings().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                globalMainSettings.edit().putBoolean("archivehint", false).commit();
                G4();
            }
        }
        if (this.f38320r0 && !this.f38326s0 && (f4Var = this.f38309p0) != null && this.N3) {
            this.f38326s0 = true;
            this.f38320r0 = false;
            f4Var.u();
        }
        AndroidUtilities.runOnUIThread(new jw(this, 3), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.v70 v70Var = this.L0;
        if (v70Var != null) {
            v70Var.u();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.b2 b2Var;
        super.onDialogDismiss(dialog);
        if (this.V2 == 0 && this.X2 == 0 && (b2Var = this.T1) != null && dialog == b2Var && getParentActivity() != null) {
            k3(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10;
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        int i11 = 0;
        if (bundle != null) {
            this.f38292l2 = bundle.getBoolean("onlySelect", false);
            this.f38295m2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f38316q2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.R0 = this.arguments.getInt("dialogsType", 0);
            this.O0 = this.arguments.getBoolean("quote", false);
            this.N0 = this.arguments.getBoolean("reply_to", false);
            this.P0 = this.arguments.getLong("reply_to_author", 0L);
            this.Q0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f38264f2 = this.arguments.getString("selectAlertString");
            this.f38269g2 = this.arguments.getString("selectAlertStringGroup");
            this.f38274h2 = this.arguments.getString("addToGroupAlertString");
            this.f38322r2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f38328s2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f38333t2 = this.arguments.getBoolean("afterSignup", false);
            this.V2 = this.arguments.getInt("folderId", 0);
            long j3 = this.arguments.getLong("community_id", 0L);
            this.X2 = j3;
            if (j3 != 0) {
                this.Y2 = getMessagesController().getChat(Long.valueOf(this.X2));
                this.Z2 = getMessagesController().getChatFull(this.X2);
            }
            this.f38279i2 = this.arguments.getBoolean("resetDelegate", true);
            this.S0 = this.arguments.getInt("messagesCount", 0);
            this.T0 = this.arguments.getInt("hasPoll", 0);
            this.U0 = this.arguments.getBoolean("hasInvoice", false);
            this.f38338u2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f38338u2);
            this.arguments.getInt("otherwiseRelogin");
            this.f38343v2 = this.arguments.getBoolean("allowGroups", true);
            this.f38349w2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f38354x2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.f38359y2 = this.arguments.getBoolean("allowChannels", true);
            this.f38362z2 = this.arguments.getBoolean("allowUsers", true);
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
        if (this.f38301n2 == null) {
            this.f38253d2 = getConnectionsManager().getConnectionState();
            this.J3.addGlobal(NotificationCenter.emojiLoaded);
            if (!this.f38292l2) {
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
        i4(getAccountInstance());
        ai.l9 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.f1208s) {
                ConnectionsManager.getInstance(storiesController.f1193a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new ai.x7(storiesController, 0));
            }
        }
        getMessagesController().loadPinnedDialogs(this.V2, 0L, null);
        if (this.Q3 != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            cv cvVar = this.Q3;
            if (cvVar.getParent() != null) {
                ((ViewGroup) cvVar.getParent()).removeView(cvVar);
            }
            this.Q3 = null;
        }
        if (e4()) {
            ai.l9 storiesController2 = getMessagesController().getStoriesController();
            if (storiesController2.f1214z) {
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
        this.f38276h4 = i10;
        if (this.W) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f38281i4 = i11;
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
        ex exVar = this.B1;
        if (exVar != null) {
            exVar.B0();
        }
        org.telegram.ui.Components.zq0 zq0Var = this.G2;
        if (zq0Var != null) {
            zq0Var.j();
        }
        yt ytVar = this.H2;
        if (ytVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ytVar);
            this.H2 = null;
        }
        UndoView undoView = this.f38357y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f38307o3.unlock();
        this.C2 = null;
        jb1 jb1Var = jb1.f34888b;
        if (jb1Var != null) {
            jb1Var.dismiss();
            jb1.f34888b = null;
        }
    }

    @Override
    public final void onPanTranslationUpdate(float f7) {
        if (this.f38256e0 != null) {
            this.J0 = f7;
            ex exVar = this.B1;
            int i10 = 0;
            if (exVar != null && exVar.t0()) {
                this.fragmentView.setTranslationY(f7);
                while (true) {
                    ty[] tyVarArr = this.f38256e0;
                    if (i10 >= tyVarArr.length) {
                        break;
                    }
                    tyVarArr[i10].setTranslationY(0.0f);
                    i10++;
                }
                if (!this.f38292l2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.pc pcVar = this.f38302n3;
                    if (pcVar != null) {
                        pcVar.l();
                    }
                }
                ey eyVar = this.C0;
                if (eyVar != null) {
                    eyVar.setTranslationY(this.I0);
                    return;
                }
                return;
            }
            while (true) {
                ty[] tyVarArr2 = this.f38256e0;
                if (i10 >= tyVarArr2.length) {
                    break;
                }
                tyVarArr2[i10].setTranslationY(f7);
                i10++;
            }
            if (!this.f38292l2) {
                this.actionBar.setTranslationY(f7);
                org.telegram.ui.Components.pc pcVar2 = this.f38302n3;
                if (pcVar2 != null) {
                    pcVar2.l();
                }
            }
            ey eyVar2 = this.C0;
            if (eyVar2 != null) {
                eyVar2.setTranslationY(this.J0 + this.I0);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.pc pcVar = this.S;
        if (pcVar != null) {
            pcVar.b();
            this.S = null;
        }
        ox oxVar = this.F3;
        if (oxVar != null) {
            oxVar.f35600r = true;
            vx vxVar = oxVar.f35595a;
            if (vxVar != null) {
                vxVar.onPause();
            }
        }
        org.telegram.ui.Components.v70 v70Var = this.L0;
        if (v70Var != null) {
            v70Var.u();
        }
        ex exVar = this.B1;
        if (exVar != null) {
            exVar.D0();
        }
        int i10 = 0;
        UndoView undoView = this.f38357y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        setBulletinDelegate(null);
        if (this.f38256e0 == null) {
            return;
        }
        while (true) {
            ty[] tyVarArr = this.f38256e0;
            if (i10 < tyVarArr.length) {
                tyVarArr[i10].d.getClass();
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
                                ik0.m();
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
                                AndroidUtilities.runOnUIThread(new jw(this, 2));
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
                J4();
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
        uy uyVar;
        ty tyVar;
        bx bxVar;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.Components.eo0 eo0Var;
        ci.eb ebVar;
        super.onResume();
        lx lxVar = this.E0;
        char c10 = 0;
        if (lxVar != null) {
            ArrayList arrayList = lxVar.f570x;
            ai.l9 l9Var = lxVar.f563s;
            l9Var.l(l9Var.f1197g);
            l9Var.l(l9Var.h);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.PeerStories y3 = l9Var.y(((ai.w) arrayList.get(i11)).f1639c);
                if (y3 != null) {
                    l9Var.X(y3);
                }
            }
        }
        ox oxVar = this.F3;
        if (oxVar != null) {
            oxVar.f35600r = false;
            vx vxVar = oxVar.f35595a;
            if (vxVar != null) {
                vxVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (ebVar = this.K0) != null && ebVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.f38256e0 != null) {
            int i12 = 0;
            while (true) {
                ty[] tyVarArr = this.f38256e0;
                if (i12 >= tyVarArr.length) {
                    break;
                }
                tyVarArr[i12].d.l();
                i12++;
            }
        }
        ex exVar = this.B1;
        if (exVar != null) {
            exVar.E0();
        }
        long j3 = 0;
        if (!this.f38292l2 && this.V2 == 0 && this.X2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        ey eyVar = this.C0;
        if (eyVar != null && (eo0Var = eyVar.f26196c0) != null) {
            eo0Var.l();
        }
        if (!this.f38333t2 && getUserConfig().unacceptedTermsOfService != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.V2 == 0 && this.X2 == 0 && this.f38248c2 && !this.f38292l2 && (i10 = Build.VERSION.SDK_INT) >= 23) {
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.f38248c2 = false;
                if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i10 >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                uyVar = this;
                org.telegram.messenger.n1 n1Var = new org.telegram.messenger.n1(uyVar, z13, z11, z12, parentActivity);
                if (uyVar.f38333t2 && (z11 || z13)) {
                    j3 = 4000;
                }
                AndroidUtilities.runOnUIThread(n1Var, j3);
            } else {
                uyVar = this;
            }
        } else {
            uyVar = this;
            if (!uyVar.f38292l2 && uyVar.V2 == 0 && uyVar.X2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(10020)) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.j6.L5), null);
                        alertDialog$Builder.f18654a.T = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new xv(this, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.ig0(23));
                        showDialog(alertDialog$Builder.f18654a);
                    }
                } else {
                    return;
                }
            } else if (uyVar.V2 == 0 && uyVar.X2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.j6.L5), null);
                        alertDialog$Builder2.f18654a.T = LocaleController.getString(R.string.PermissionFSILockscreen);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new xv(this, 9));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.ig0(24));
                        showDialog(alertDialog$Builder2.f18654a);
                    }
                } else {
                    return;
                }
            }
        }
        J4();
        if (uyVar.f38256e0 != null) {
            int i13 = 0;
            while (true) {
                ty[] tyVarArr2 = uyVar.f38256e0;
                if (i13 >= tyVarArr2.length) {
                    break;
                }
                ty tyVar2 = tyVarArr2[i13];
                if (tyVar2.f37910s == 0 && tyVar2.v == 2 && tyVar2.f37906c.L0() == 0 && Z3()) {
                    uyVar.f38256e0[i13].f37906c.h1(1, (int) uyVar.N);
                }
                if (i13 == 0) {
                    uyVar.f38256e0[i13].d.getClass();
                } else {
                    uyVar.f38256e0[i13].d.getClass();
                }
                i13++;
            }
        }
        L4();
        setBulletinDelegate(new a9(this, 4));
        if (uyVar.f38312p3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), uyVar.classGuid);
        }
        g5(0, false);
        Z4(false, true);
        f5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            jb1.n(this);
        }
        B3();
        if (uyVar.f38360z0 != null && (tyVar = uyVar.f38256e0[0]) != null && (bxVar = tyVar.d) != null) {
            int i14 = bxVar.h;
            if (i14 == 7 || i14 == 8) {
                MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
                if (i14 != 7) {
                    c10 = 1;
                }
                MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                if (dialogFilter != null) {
                    uyVar.f38360z0.h(dialogFilter.localId);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f7) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.Y3 && this.Z3 == null) {
            F4(f7);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        ci.eb ebVar;
        uy uyVar;
        ox oxVar = this.F3;
        if (oxVar != null && oxVar.c()) {
            this.F3.getFragment().onTransitionAnimationEnd(z10, z11);
        } else {
            if (z10 && (ebVar = this.K0) != null && ebVar.getVisibility() == 0) {
                this.K0.setVisibility(8);
                this.K0.setBackground(null);
            }
            if (z10 && this.f38333t2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f31142x0.c(false);
                }
            }
        }
        if (!z10 && (uyVar = this.W2) != null) {
            uyVar.removeSelfFromStack();
        }
        B3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        ox oxVar = this.F3;
        if (oxVar != null && oxVar.c()) {
            this.F3.getFragment().onTransitionAnimationProgress(z10, f7);
        } else {
            ci.eb ebVar = this.K0;
            if (ebVar != null && ebVar.getVisibility() == 0) {
                if (z10) {
                    this.K0.setAlpha(1.0f - f7);
                } else {
                    this.K0.setAlpha(f7);
                }
            }
        }
        B3();
    }

    public final boolean p3(long j3) {
        int i10;
        int i11 = this.R0;
        if (i11 != 15 && i11 != 16 && this.f38274h2 == null && this.f38328s2) {
            if (DialogObject.isChatDialog(j3)) {
                long j10 = -j3;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    if (this.f38316q2 || !ChatObject.isCanWriteToChannel(j10, this.currentAccount) || (i10 = this.T0) == 2 || i10 == 3) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f18654a.R = LocaleController.getString(R.string.SendMessageTitle);
                        int i12 = this.T0;
                        if (i12 == 3) {
                            alertDialog$Builder.f18654a.T = LocaleController.getString(R.string.TodoCantForward);
                        } else if (i12 == 2) {
                            alertDialog$Builder.f18654a.T = LocaleController.getString(R.string.PublicPollCantForward);
                        } else {
                            alertDialog$Builder.f18654a.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        showDialog(alertDialog$Builder.f18654a);
                        return false;
                    }
                    return true;
                }
                return true;
            } else if (DialogObject.isEncryptedDialog(j3)) {
                if (this.T0 != 0 || this.U0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.f18654a.R = LocaleController.getString(R.string.SendMessageTitle);
                    int i13 = this.T0;
                    if (i13 == 3) {
                        alertDialog$Builder2.f18654a.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i13 != 0) {
                        alertDialog$Builder2.f18654a.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        alertDialog$Builder2.f18654a.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    showDialog(alertDialog$Builder2.f18654a);
                    return false;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public final void p4(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new df(21));
        org.telegram.ui.Components.v70 H = org.telegram.ui.Components.v70.H(this, view);
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
                linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(getThemedColor(org.telegram.ui.ActionBar.j6.f19184i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
                g9Var.r(currentUser);
                org.telegram.ui.Components.sg0 sg0Var = new org.telegram.ui.Components.sg0(this, getParentActivity(), z10);
                linearLayout.addView(sg0Var, w7.y5.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(getParentActivity());
                if (z10) {
                    v9Var.setScaleX(0.833f);
                    v9Var.setScaleY(0.833f);
                }
                v9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                v9Var.getImageReceiver().setCurrentAccount(intValue);
                v9Var.e(currentUser, g9Var);
                sg0Var.addView(v9Var, w7.y5.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19201j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.y5.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new org.telegram.ui.Cells.va(this, intValue, H, 11));
                H.r(linearLayout, w7.y5.n(230, 48));
            }
        }
        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.j6.f19094d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
        H.f29000z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        H.W(b02);
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        H.V(5);
        H.Z();
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.Y3 = true;
            B4(true);
            return;
        }
        this.Z3 = null;
        this.Y3 = false;
        B4(false);
        F4(1.0f);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        boolean presentFragment = super.presentFragment(n2Var);
        if (presentFragment && this.f38256e0 != null) {
            int i10 = 0;
            while (true) {
                ty[] tyVarArr = this.f38256e0;
                if (i10 >= tyVarArr.length) {
                    break;
                }
                tyVarArr[i10].d.getClass();
                i10++;
            }
        }
        ci.f4 f4Var = this.f38309p0;
        if (f4Var != null) {
            f4Var.e(true);
        }
        ci.f4 f4Var2 = this.f38314q0;
        if (f4Var2 != null) {
            f4Var2.e(true);
        }
        org.telegram.ui.Components.pc.e();
        return presentFragment;
    }

    public final void q3(boolean z10) {
        gi.j jVar;
        TLRPC.ChatFull chatFull;
        boolean z11;
        org.telegram.ui.Components.ks ksVar = this.J1;
        if (ksVar != null && (jVar = this.Q1) != null && (chatFull = this.Z2) != null) {
            if (this.X2 != 0 && chatFull.requests_pending > 0 && !this.f38239b.f14170f) {
                z11 = true;
            } else {
                z11 = false;
            }
            ksVar.i(jVar, z11, z10);
            this.Q1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.Z2.requests_pending, new Object[0]));
        }
    }

    public final void q4(int i10, long j3, TLRPC.Chat chat, boolean z10, boolean z11) {
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

    @Override
    public final void r() {
        x4(true, true);
    }

    public final void r3(ty tyVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i10;
        boolean z14;
        int L0 = tyVar.f37906c.L0();
        int N0 = tyVar.f37906c.N0();
        if (!this.f38270g3 && !this.f38293l3) {
            sw swVar = this.f38360z0;
            if (swVar == null || swVar.getVisibility() != 0 || !this.f38360z0.O) {
                int abs = Math.abs(N0 - L0) + 1;
                if (N0 != -1) {
                    s4.c1 L = tyVar.f37904a.L(N0);
                    if (L != null && L.f42977f == 11) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f38242b2 = z14;
                    if (z14) {
                        c4(false);
                    }
                } else {
                    this.f38242b2 = false;
                }
                int i11 = tyVar.f37910s;
                if (i11 == 7 || i11 == 8) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                    int i12 = tyVar.h;
                    if (i12 >= 0 && i12 < dialogFilters.size() && (dialogFilters.get(tyVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= R3(this.currentAccount, tyVar.f37910s, 1, this.S1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                        boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                        boolean z15 = !isDialogsEndReached;
                        if (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) {
                            z10 = z15;
                            z11 = false;
                        } else {
                            z10 = z15;
                            z11 = true;
                        }
                        if ((abs <= 0 && N0 >= R3(this.currentAccount, tyVar.f37910s, this.V2, this.S1).size() - 10) || (abs == 0 && (((i10 = tyVar.f37910s) == 7 || i10 == 8) && !getMessagesController().isDialogsEndReached(this.V2)))) {
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
                        if (!z12 || z11) {
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    uy uyVar = uy.this;
                                    if (z12) {
                                        uyVar.getMessagesController().loadDialogs(uyVar.V2, -1, 100, z13);
                                    }
                                    if (z11) {
                                        uyVar.getMessagesController().loadDialogs(1, -1, 100, z10);
                                    } else {
                                        uyVar.getClass();
                                    }
                                }
                            });
                        }
                        return;
                    }
                }
                z11 = false;
                z10 = false;
                if (abs <= 0) {
                }
                z12 = false;
                z13 = false;
                if (!z12) {
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        uy uyVar = uy.this;
                        if (z12) {
                            uyVar.getMessagesController().loadDialogs(uyVar.V2, -1, 100, z13);
                        }
                        if (z11) {
                            uyVar.getMessagesController().loadDialogs(1, -1, 100, z10);
                        } else {
                            uyVar.getClass();
                        }
                    }
                });
            }
        }
    }

    public final void r4(java.util.ArrayList r46, int r47, boolean r48, boolean r49, java.util.HashSet r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.r4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    public final void s3() {
        if (this.f38256e0 != null) {
            int n32 = n3();
            int i10 = 0;
            while (true) {
                ty[] tyVarArr = this.f38256e0;
                if (i10 < tyVarArr.length) {
                    ty tyVar = tyVarArr[i10];
                    if (tyVar != null) {
                        qy qyVar = tyVar.f37904a;
                        qyVar.setPadding(0, qyVar.Y2, 0, n32);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void s4(long r14, boolean r16, org.telegram.messenger.MessagesController.DialogFilter r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.s4(long, boolean, org.telegram.messenger.MessagesController$DialogFilter, int, boolean):void");
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        lx lxVar = this.E0;
        if (lxVar != null) {
            if (this.G0 && !z10) {
                lxVar.setVisibility(0);
            } else {
                lxVar.setVisibility(8);
            }
        }
        Y4(true);
        U4();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r6, int r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    public final void t3() {
        hh.g gVar = this.f38358y1;
        if (gVar != null) {
            gVar.setBlurredBottomHeight(this.f38358y1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void t4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19094d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.K0.setBackground(new BitmapDrawable(createBitmap));
        this.K0.setAlpha(0.0f);
        this.K0.setVisibility(0);
        B3();
    }

    public final void u3() {
        int i10;
        ty tyVar;
        boolean z10 = true;
        float S3 = S3(true);
        sw swVar = this.f38360z0;
        if (swVar != null) {
            if (swVar.getAlpha() == S3) {
                z10 = false;
            }
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, S3);
            this.f38360z0.setAlpha(S3);
            this.f38360z0.setScaleX(lerp);
            this.f38360z0.setScaleY(lerp);
            sw swVar2 = this.f38360z0;
            if (S3 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            swVar2.setVisibility(i10);
            if (z10 && (tyVar = this.f38256e0[0]) != null) {
                tyVar.f37904a.requestLayout();
            }
        }
        S4();
    }

    public final void u4(ty tyVar) {
        int i10;
        org.telegram.ui.Components.t00 t00Var;
        if (tyVar.getVisibility() != 0) {
            return;
        }
        int i11 = tyVar.d.v;
        if (tyVar.f37910s == 0 && Z3() && tyVar.f37904a.getChildCount() == 0 && tyVar.v == 2) {
            ((s4.c0) tyVar.f37904a.getLayoutManager()).h1(1, (int) this.N);
        }
        tyVar.d.getClass();
        tyVar.d.U();
        int h = tyVar.d.h();
        if (h == 1 && i11 == 1 && tyVar.d.j(0) == 5) {
            tyVar.q(true);
        } else {
            tyVar.q(false);
            if (h > i11 && (i10 = this.R0) != 11 && i10 != 12 && i10 != 13) {
                tyVar.f37913y.b(i11);
            }
        }
        try {
            qy qyVar = tyVar.f37904a;
            if (this.V2 == 0 && this.X2 == 0) {
                t00Var = tyVar.f37911w;
            } else {
                t00Var = null;
            }
            qyVar.setEmptyView(t00Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
        r3(tyVar);
    }

    public final void v3() {
        int i10;
        int i11;
        float f7 = this.f38298n.e;
        float lerp = AndroidUtilities.lerp(0.2f, 1.0f, f7);
        ii.y1 y1Var = this.C1;
        int i12 = 8;
        if (y1Var != null) {
            y1Var.setScaleX(lerp);
            this.C1.setScaleY(lerp);
            this.C1.setAlpha(f7);
            ii.y1 y1Var2 = this.C1;
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            y1Var2.setVisibility(i11);
        }
        hh.g gVar = this.f38358y1;
        if (gVar != null) {
            gVar.setAlpha(f7);
            hh.g gVar2 = this.f38358y1;
            int i13 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            gVar2.setVisibility(i10);
            this.f38358y1.getFadeView().setAlpha(f7);
            View fadeView = this.f38358y1.getFadeView();
            if (i13 > 0) {
                i12 = 0;
            }
            fadeView.setVisibility(i12);
        }
    }

    public final void v4() {
        boolean z10;
        float f7 = 0.0f;
        if (this.N != 0.0f && !(z10 = this.K)) {
            if (z10) {
                f7 = -U3();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.G3, f7));
            animatorSet.setInterpolator(org.telegram.ui.Components.qr.f27642f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    public final void w3() {
        if (this.actionBar == null) {
            return;
        }
        org.telegram.ui.Components.y10.d(this.actionBar.getBackButton(), Math.max(this.f38334t3, (1.0f - this.f38239b.e) * (1.0f - V3()) * (1.0f - this.f38245c.e)));
    }

    public final void w4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy.w4(int):void");
    }

    @Override
    public final fh.d x() {
        return this.f38297m4;
    }

    public final void x3() {
        float f7;
        if (this.f38277i0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.y10.d(this.f38267g0, com.google.android.gms.internal.vision.e2.C(f7, 1.0f - this.f38239b.e, 1.0f - V3(), 1.0f - this.f38245c.e));
    }

    public final void x4(boolean z10, boolean z11) {
        int i10;
        int i11;
        ox oxVar = this.F3;
        if (oxVar != null && oxVar.c()) {
            return;
        }
        if (this.f38256e0[0].f37910s == 0 && Z3() && this.f38256e0[0].v == 2) {
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
            org.telegram.ui.Components.yk0 yk0Var = this.f38256e0[0].f37909r;
            yk0Var.f30571b = 1;
            yk0Var.d(i10, i11, false, false);
            v4();
            return;
        }
        this.f38256e0[0].f37906c.h1(i10, i11);
        v4();
    }

    public final void y3() {
        float f7;
        if (SharedConfig.passcodeHash.isEmpty()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.y10.d(this.f38262f0, com.google.android.gms.internal.vision.e2.C(f7, 1.0f - this.f38239b.e, 1.0f - V3(), 1.0f - this.f38245c.e));
    }

    public final void y4(String str, boolean z10) {
        O4(true, false, true, false);
        ky kyVar = this.X;
        if (kyVar != null) {
            kyVar.f22856r.setText(str);
            this.X.f22856r.setSelection(str.length());
        }
    }

    @Override
    public final List z() {
        return Arrays.asList(new mg.a(LocaleController.getString(R.string.DebugDialogsActivity)), new mg.a(LocaleController.getString(R.string.ClearLocalDatabase), new qv(this, 27)), new mg.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new qv(this, 28)));
    }

    public final void z3() {
        float f7;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.y10.d(this.f38282j0, com.google.android.gms.internal.vision.e2.C(f7, this.f38261f.e, 1.0f - V3(), 1.0f - this.f38245c.e));
        lx lxVar = this.E0;
        if (lxVar != null) {
            lxVar.invalidate();
        }
    }

    public final void z4(float f7) {
        ty[] tyVarArr;
        this.f38246c0 = f7;
        for (ty tyVar : this.f38256e0) {
            qy qyVar = tyVar.f37904a;
            for (int i10 = 0; i10 < qyVar.getChildCount(); i10++) {
                View childAt = qyVar.getChildAt(i10);
                if (childAt != null && RecyclerView.S(childAt) >= tyVar.d.f9855f + 1) {
                    childAt.setAlpha(f7);
                }
            }
        }
    }
}
