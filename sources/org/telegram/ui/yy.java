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
public class yy extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, ng.b, ne.d, ih0 {
    public static float A4;
    public static boolean f41979x4;
    public static final boolean[] f41980y4 = new boolean[4];
    public static final org.telegram.ui.Components.js0 f41981z4 = new org.telegram.ui.Components.js0(3);
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public ix B1;
    public boolean B2;
    public boolean B3;
    public iy C0;
    public ji.y1 C1;
    public sy C2;
    public Long C3;
    public org.telegram.ui.Components.pv0 D0;
    public org.telegram.ui.ActionBar.u0 D1;
    public ArrayList D2;
    public Drawable D3;
    public boolean E;
    public px E0;
    public final TextPaint E1;
    public String E2;
    public org.telegram.ui.Components.q5 E3;
    public boolean F;
    public org.telegram.ui.Components.vs F0;
    public hx F1;
    public CharSequence F2;
    public org.telegram.ui.Cells.o F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public FrameLayout G1;
    public org.telegram.ui.Components.nr0 G2;
    public sx G3;
    public long H;
    public float H0;
    public hx H1;
    public org.telegram.ui.Components.n51 H2;
    public final gx H3;
    public ValueAnimator I;
    public float I0;
    public FrameLayout I1;
    public final ArrayList I2;
    public final gx I3;
    public ValueAnimator J;
    public float J0;
    public org.telegram.ui.Components.xs J1;
    public boolean J2;
    public gh0 J3;
    public boolean K;
    public di.ab K0;
    public org.telegram.ui.Components.ws K1;
    public int K2;
    public NotificationCenter.ObserversGroup K3;
    public boolean L;
    public org.telegram.ui.Components.l80 L0;
    public org.telegram.ui.Cells.m L1;
    public int L2;
    public Drawable L3;
    public boolean M;
    public ux M0;
    public org.telegram.ui.Cells.a3 M1;
    public boolean M2;
    public int M3;
    public float N;
    public boolean N0;
    public org.telegram.ui.Cells.ua N1;
    public int N2;
    public boolean N3;
    public boolean O;
    public boolean O0;
    public Long O1;
    public int O2;
    public boolean O3;
    public int P;
    public long P0;
    public Long P1;
    public int P2;
    public AnimatorSet P3;
    public boolean Q;
    public long Q0;
    public hi.j Q1;
    public int Q2;
    public boolean Q3;
    public boolean R;
    public int R0;
    public ArrayList R1;
    public int R2;
    public gv R3;
    public org.telegram.ui.Components.sc S;
    public int S0;
    public boolean S1;
    public int S2;
    public String S3;
    public float T;
    public int T0;
    public org.telegram.ui.ActionBar.a2 T1;
    public int T2;
    public ArrayList T3;
    public boolean U;
    public boolean U0;
    public boolean U1;
    public int U2;
    public boolean U3;
    public boolean V;
    public org.telegram.ui.Components.ae0 V0;
    public boolean V1;
    public boolean V2;
    public CharSequence V3;
    public boolean W;
    public org.telegram.ui.Cells.s2 W0;
    public long W1;
    public int W2;
    public boolean W3;
    public oy X;
    public org.telegram.ui.Cells.s2 X0;
    public TLObject X1;
    public yy X2;
    public float X3;
    public zf.h0 Y;
    public boolean Y0;
    public int Y1;
    public long Y2;
    public boolean Y3;
    public c51 Z;
    public boolean Z0;
    public int Z1;
    public TLRPC.Chat Z2;
    public boolean Z3;
    public final int f41982a;
    public org.telegram.ui.Components.k91 f41983a0;
    public final ArrayList f41984a1;
    public boolean a2;
    public TLRPC.ChatFull f41985a3;
    public ValueAnimator f41986a4;
    public final ne.b f41987b;
    public hg.r0 f41988b0;
    public boolean f41989b1;
    public boolean f41990b2;
    public org.telegram.ui.Components.z9 f41991b3;
    public org.telegram.ui.Components.i50 f41992b4;
    public final ne.b f41993c;
    public float f41994c0;
    public boolean f41995c1;
    public boolean f41996c2;
    public org.telegram.ui.Components.k9 f41997c3;
    public TLRPC.FileLocation f41998c4;
    public final ne.b d;
    public ValueAnimator f41999d0;
    public boolean f42000d1;
    public int f42001d2;
    public long f42002d3;
    public TLRPC.FileLocation f42003d4;
    public final ne.b e;
    public xy[] f42004e0;
    public org.telegram.ui.ActionBar.f2 f42005e1;
    public boolean f42006e2;
    public boolean f42007e3;
    public org.telegram.ui.Components.sc f42008e4;
    public final ne.b f42009f;
    public org.telegram.ui.ActionBar.u0 f42010f0;
    public final Paint f42011f1;
    public String f42012f2;
    public boolean f42013f3;
    public int f42014f4;
    public org.telegram.ui.ActionBar.u0 f42015g0;
    public ImageView f42016g1;
    public String f42017g2;
    public AnimatorSet f42018g3;
    public int f42019g4;
    public final ne.b h;
    public az f42020h0;
    public NumberTextView f42021h1;
    public String f42022h2;
    public boolean f42023h3;
    public int f42024h4;
    public boolean f42025i0;
    public final ArrayList f42026i1;
    public boolean f42027i2;
    public boolean f42028i3;
    public int f42029i4;
    public org.telegram.ui.ActionBar.u0 f42030j0;
    public org.telegram.ui.ActionBar.u0 f42031j1;
    public boolean f42032j2;
    public float f42033j3;
    public int f42034j4;
    public org.telegram.ui.ActionBar.u0 f42035k0;
    public org.telegram.ui.ActionBar.u0 f42036k1;
    public boolean f42037k2;
    public boolean f42038k3;
    public ih.j f42039k4;
    public org.telegram.ui.ActionBar.u0 f42040l0;
    public org.telegram.ui.ActionBar.u0 l1;
    public boolean f42041l2;
    public int f42042l3;
    public final bh.f l4;
    public org.telegram.ui.ActionBar.u0 m0;
    public org.telegram.ui.ActionBar.u0 f42043m1;
    public boolean f42044m2;
    public boolean f42045m3;
    public final gh.d f42046m4;
    public final ne.b f42047n;
    public org.telegram.ui.Components.gj0 f42048n0;
    public org.telegram.ui.ActionBar.e1 f42049n1;
    public String f42050n2;
    public boolean f42051n3;
    public final gh.d f42052n4;
    public org.telegram.ui.ActionBar.e1 f42053o0;
    public org.telegram.ui.ActionBar.e1 f42054o1;
    public String f42055o2;
    public org.telegram.ui.Components.sc f42056o3;
    public final gh.c f42057o4;
    public di.d4 f42058p0;
    public org.telegram.ui.ActionBar.e1 f42059p1;
    public final MessagesStorage.TopicKey f42060p2;
    public final AnimationNotificationsLocker f42061p3;
    public final bh.b f42062p4;
    public di.d4 f42063q0;
    public org.telegram.ui.ActionBar.e1 f42064q1;
    public boolean f42065q2;
    public boolean f42066q3;
    public final bh.b f42067q4;
    public final ne.b f42068r;
    public boolean f42069r0;
    public org.telegram.ui.ActionBar.e1 f42070r1;
    public boolean f42071r2;
    public boolean f42072r3;
    public final bh.b f42073r4;
    public final ne.b f42074s;
    public boolean f42075s0;
    public org.telegram.ui.ActionBar.e1 f42076s1;
    public boolean f42077s2;
    public boolean f42078s3;
    public final bh.b f42079s4;
    public org.telegram.ui.Components.l20 f42080t0;
    public org.telegram.ui.ActionBar.e1 f42081t1;
    public boolean f42082t2;
    public boolean f42083t3;
    public nw f42084t4;
    public org.telegram.ui.Components.l20 f42085u0;
    public float f42086u1;
    public boolean f42087u2;
    public float f42088u3;
    public final ArrayList f42089u4;
    public final qh.i v;
    public di.d f42090v0;
    public float f42091v1;
    public boolean f42092v2;
    public ValueAnimator f42093v3;
    public final RectF f42094v4;
    public boolean f42095w;
    public kh.f f42096w0;
    public AnimatorSet f42097w1;
    public boolean f42098w2;
    public float f42099w3;
    public final RectF f42100w4;
    public int f42101x;
    public int f42102x0;
    public float f42103x1;
    public boolean f42104x2;
    public float f42105x3;
    public boolean f42106y;
    public final UndoView[] f42107y0;
    public ih.f f42108y1;
    public boolean f42109y2;
    public float y3;
    public ww f42110z0;
    public FrameLayout f42111z1;
    public boolean f42112z2;
    public int f42113z3;

    public yy(Bundle bundle) {
        super(bundle);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f41982a = i10;
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        this.f41987b = new ne.b(1, this, esVar, 350L, false);
        this.f41993c = new ne.b(2, this, esVar, 350L, false);
        this.d = new ne.b(3, this, esVar, 350L, false);
        this.e = new ne.b(4, this, esVar, 350L, false);
        this.f42009f = new ne.b(5, this, esVar, 350L, false);
        this.h = new ne.b(6, this, esVar, 350L, false);
        this.f42047n = new ne.b(7, this, esVar, 350L, false);
        this.f42068r = new ne.b(8, this, esVar, 350L, false);
        this.f42074s = new ne.b(9, this, esVar, 350L, false);
        this.v = new qh.i(new mw(this, 2));
        this.f42101x = -1;
        this.F = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.Q = true;
        this.f41994c0 = 1.0f;
        this.f42107y0 = new UndoView[2];
        this.f41984a1 = new ArrayList();
        this.f42011f1 = new Paint();
        this.f42026i1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.E1 = new TextPaint(1);
        this.U1 = true;
        this.f41996c2 = true;
        this.f42027i2 = true;
        this.f42060p2 = new MessagesStorage.TopicKey();
        this.I2 = new ArrayList();
        this.J2 = true;
        this.f42061p3 = new AnimationNotificationsLocker();
        this.f42113z3 = -1;
        this.H3 = new gx(this, 0);
        this.I3 = new gx(this, 1);
        this.M3 = -4;
        this.N3 = true;
        this.O3 = true;
        this.X3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f42089u4 = arrayList;
        RectF rectF = new RectF();
        this.f42094v4 = rectF;
        RectF rectF2 = new RectF();
        this.f42100w4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        gh.c cVar = new gh.c();
        this.f42057o4 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
        if (i11 >= 31) {
            this.l4 = new bh.f(false);
            gh.d dVar = new gh.d(null);
            this.f42046m4 = dVar;
            dVar.k(new ey(this, 0));
            gh.d dVar2 = new gh.d(null);
            this.f42052n4 = dVar2;
            dVar2.k(new ey(this, 3));
            bh.b bVar = new bh.b(dVar);
            this.f42062p4 = bVar;
            bVar.f2751i = LiteMode.isEnabled(262144);
            bh.b bVar2 = new bh.b(dVar2);
            this.f42073r4 = bVar2;
            bVar2.f2751i = LiteMode.isEnabled(262144);
            this.f42067q4 = new bh.b(dVar);
        } else {
            this.l4 = null;
            this.f42046m4 = null;
            this.f42052n4 = null;
            this.f42062p4 = new bh.b(cVar);
            this.f42073r4 = new bh.b(cVar);
            this.f42067q4 = new bh.b(cVar);
        }
        this.f42079s4 = new bh.b(cVar);
    }

    public static void A0(yy yyVar) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        yyVar.S4();
        org.telegram.ui.Components.sc J = org.telegram.ui.Components.zc.a0(yyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new uv(yyVar, 1));
        J.f28805j = 5000;
        J.j();
    }

    public static void B0(yy yyVar) {
        boolean z10 = true;
        try {
            ((org.telegram.ui.Components.yj0) ((org.telegram.ui.Components.k9) yyVar.M1.h.getImageReceiver().getStaticThumb()).B).H(true);
        } catch (Exception unused) {
        }
        if (yyVar.f41992b4 == null) {
            org.telegram.ui.Components.i50 i50Var = new org.telegram.ui.Components.i50(0, true, true);
            yyVar.f41992b4 = i50Var;
            i50Var.H = true;
            i50Var.f25498a = yyVar;
            i50Var.f25499b = new my(yyVar);
            yyVar.getMediaDataController().checkFeaturedStickers();
            yyVar.getMessagesController().loadSuggestedFilters();
            yyVar.getMessagesController().loadUserInfo(yyVar.getUserConfig().getCurrentUser(), true, yyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(yyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(yyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(yyVar.currentAccount).getCurrentUser();
        }
        if (user != null) {
            org.telegram.ui.Components.vi viVar = yyVar.f41992b4.f25500c;
            if (viVar != null) {
                viVar.e1();
            }
            org.telegram.ui.Components.i50 i50Var2 = yyVar.f41992b4;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            i50Var2.n(z10, new uv(yyVar, 0), new vv(yyVar, 0), 0);
        }
    }

    public static void C0(yy yyVar, float f7, ValueAnimator valueAnimator) {
        yyVar.f42004e0[0].setTranslationY((1.0f - yyVar.f42088u3) * f7);
        yyVar.f42088u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < yyVar.actionBar.getChildCount(); i10++) {
            if (yyVar.actionBar.getChildAt(i10).getVisibility() == 0 && yyVar.actionBar.getChildAt(i10) != yyVar.actionBar.getActionMode() && yyVar.actionBar.getChildAt(i10) != yyVar.actionBar.getBackButton()) {
                yyVar.actionBar.getChildAt(i10).setAlpha(1.0f - yyVar.f42088u3);
            }
        }
        yyVar.C3();
        yyVar.u3();
        View view = yyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void D0(yy yyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() == 1) {
            yh.p1 p1Var = new yh.p1(yyVar.getParentActivity(), yyVar.currentAccount, birthdayState.today.get(0).f19063id, null, null);
            p1Var.W(true);
            yyVar.showDialog(p1Var);
            return;
        }
        ug.m1.f0(0, birthdayState);
    }

    public static void E0(yy yyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.sc M = org.telegram.ui.Components.zc.a0(yyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
            M.f28805j = 5000;
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
                alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                yyVar.showDialog(alertDialog$Builder.f19248a);
                return;
            }
            return;
        }
        org.telegram.messenger.g0.q(R.string.UnknownError, org.telegram.ui.Components.zc.a0(yyVar), R.raw.error, 36);
    }

    public static void F0(yy yyVar) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        yyVar.S4();
    }

    public static void G0(yy yyVar, int i10) {
        Object obj;
        TLRPC.User user;
        org.telegram.ui.Components.no0 no0Var = yyVar.C0.f31630o0;
        if (i10 >= no0Var.X && i10 < no0Var.Y) {
            org.telegram.ui.Components.m61 G = no0Var.G(i10);
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
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
            a2Var.R = string;
            a2Var.T = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.u2(29, yyVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        }
    }

    public static void K2(yy yyVar, float f7) {
        float f10;
        float f11;
        int i10;
        int i11;
        float clamp = Utilities.clamp(yyVar.f42103x1 * 2.0f, 1.0f, 0.0f);
        px pxVar = yyVar.E0;
        float f12 = (1.0f - yyVar.f42088u3) * f7 * yyVar.H0;
        float f13 = 1.0f - clamp;
        pxVar.setAlpha(f12 * f13);
        int i12 = 0;
        if (!yyVar.K && !yyVar.M) {
            if (yyVar.L) {
                yyVar.E0.setTranslationY((Math.max(yyVar.N, -yyVar.S3()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                yyVar.E0.setProgressToCollapse(1.0f);
                px pxVar2 = yyVar.E0;
                pxVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - pxVar2.getY()));
            }
            f10 = 1.0f - yyVar.H0;
            yyVar.actionBar.setTranslationY(0.0f);
        } else {
            float clamp2 = Utilities.clamp((-yyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (yyVar.f42088u3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            yyVar.E0.setClipTop(0);
            if (!yyVar.K && yyVar.M) {
                yyVar.E0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                yyVar.E0.setProgressToCollapse(1.0f);
                f11 = yyVar.H0;
            } else {
                yyVar.E0.setTranslationY(((yyVar.T / 2.0f) + (Math.max(yyVar.N, -yyVar.S3()) + yyVar.f42099w3)) - AndroidUtilities.dp(8.0f));
                yyVar.E0.l(clamp2, !yyVar.G3.c());
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
            float f16 = (1.0f - yyVar.f42088u3) * f14;
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
        float f17 = 1.0f - yyVar.f42088u3;
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
            float max = Math.max(yyVar.e.e, yyVar.T3());
            float f7 = 1.0f;
            float f10 = 1.0f - yyVar.f42103x1;
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

    public static org.telegram.ui.Cells.s2 O3(xy xyVar) {
        uy uyVar = xyVar.f41679a;
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
        yyVar.S4();
    }

    public static void V(yy yyVar, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        yyVar.f42088u3 = floatValue;
        yyVar.f42004e0[0].setTranslationY((-f7) * floatValue);
        for (int i10 = 0; i10 < yyVar.actionBar.getChildCount(); i10++) {
            if (yyVar.actionBar.getChildAt(i10).getVisibility() == 0 && yyVar.actionBar.getChildAt(i10) != yyVar.actionBar.getActionMode() && yyVar.actionBar.getChildAt(i10) != yyVar.actionBar.getBackButton()) {
                yyVar.actionBar.getChildAt(i10).setAlpha(1.0f - yyVar.f42088u3);
            }
        }
        View view = yyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        yyVar.C3();
        yyVar.u3();
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
        yyVar.S4();
    }

    public static void Y(yy yyVar) {
        if (yyVar.f41992b4.g()) {
            MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            yyVar.S4();
        }
    }

    public static void Z(yy yyVar) {
        PasskeysActivity.a0(yyVar.currentAccount, yyVar.getParentActivity(), yyVar.resourceProvider, true);
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
        yyVar.S4();
    }

    public static void b0(yy yyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(yyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(yyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new fa(yyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void b4(fo foVar, MessageObject messageObject) {
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

    public static void c0(yy yyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(yyVar.currentAccount).getClientUserId());
        yyVar.presentFragment(new fo(bundle));
    }

    public static void c1(yy yyVar, boolean z10) {
        if (yyVar.f42004e0 != null && yyVar.N3 != z10) {
            yyVar.N3 = z10;
            int i10 = 0;
            while (true) {
                xy[] xyVarArr = yyVar.f42004e0;
                if (i10 < xyVarArr.length) {
                    if (z10) {
                        xyVarArr[i10].f41679a.setScrollbarFadingEnabled(false);
                    }
                    yyVar.f42004e0[i10].f41679a.setVerticalScrollBarEnabled(z10);
                    if (z10) {
                        yyVar.f42004e0[i10].f41679a.setScrollbarFadingEnabled(true);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public static void d0(org.telegram.ui.yy r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.d0(org.telegram.ui.yy):void");
    }

    public static void e0(yy yyVar, String str) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, str);
        yyVar.S4();
    }

    public static void f0(yy yyVar, xy xyVar, View view, int i10) {
        int i11;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.v3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.s2;
        if (z10) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
            if (s2Var.f21565n2) {
                yyVar.L4(s2Var.getDialogId(), view);
                return;
            }
        }
        if (yyVar.G3()) {
            yyVar.m4(view, i10, 0.0f, xyVar.d);
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
        if ((view instanceof org.telegram.ui.Cells.a3) && ((i11 = xyVar.f41685s) == 7 || i11 == 8)) {
            hg.k kVar = (hg.k) xyVar.d.M.get(0);
            if (kVar != null && kVar.f42904a == 17) {
                tL_chatlists_chatlistUpdates = kVar.f10651i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = yyVar.getMessagesController().selectedDialogFilter[xyVar.f41685s - 7];
                if (dialogFilter != null) {
                    int i14 = dialogFilter.f16400id;
                    ?? dbVar = new org.telegram.ui.Components.db(yyVar, false);
                    dbVar.Y = -1;
                    dbVar.f27473c0 = "";
                    dbVar.f27474d0 = new ArrayList();
                    dbVar.f27476f0 = "";
                    dbVar.f27478h0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    dbVar.f27479i0 = arrayList;
                    dbVar.f27495z0 = -1;
                    dbVar.C0 = -5;
                    dbVar.Y = i14;
                    dbVar.f27471a0 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    dbVar.f27477g0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = yyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i13).f16400id == i14) {
                                dbVar.f27473c0 = arrayList2.get(i13).name;
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
        } else if (z10 && !yyVar.actionBar.t() && !yyVar.G3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.s2) view).Y1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        yyVar.l4(view, i10, xyVar.d);
    }

    public static void g0(yy yyVar) {
        yyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(yyVar.parentLayout, "newChatsRow");
    }

    public static void g4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = f41980y4;
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

    public static void i0(yy yyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.C0(launchActivity, yyVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            uj1.a(yyVar.getParentActivity(), new z(yyVar, tL_attachMenuBot, launchActivity, 8), null);
        }
    }

    public static void k0(yy yyVar) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        yyVar.S4();
    }

    public static void l0(yy yyVar) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        yyVar.S4();
    }

    public static void m0(yy yyVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
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
            Pattern pattern = org.telegram.ui.Components.g5.f24879a;
            if (yyVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = yyVar.getCurrentAccount();
                    Activity parentActivity = yyVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
                    TextView textView = new TextView(parentActivity);
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19707j5, false));
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
                    frameLayout.addView(z9Var, w7.z5.a(40.0f, 22.0f, 5.0f, 22.0f, 0.0f, 40, i11 | 48));
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
                    frameLayout.addView(textView2, w7.z5.a(-2.0f, f7, 11.0f, i15, 0.0f, -1, i17));
                    if (!LocaleController.isRTL) {
                        i16 = 3;
                    }
                    frameLayout.addView(textView, w7.z5.a(-2.0f, 24.0f, 57.0f, 24.0f, 9.0f, -2, i16 | 48));
                    if (user != null) {
                        if (UserObject.isReplyUser(user)) {
                            k9Var.f26292p = 0.8f;
                            k9Var.g(12);
                            z9Var.h(null, null, k9Var, user);
                            gVar = gVar2;
                        } else {
                            gVar = gVar2;
                            if (user.f19063id == clientUserId) {
                                k9Var.f26292p = 0.8f;
                                k9Var.g(1);
                                z9Var.h(null, null, k9Var, user);
                            } else {
                                k9Var.f26292p = 1.0f;
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
                    yyVar.showDialog(alertDialog$Builder.f19248a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.g5.e0(yyVar.currentAccount, tL_error, yyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        yyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j10), tL_messages_checkHistoryImportPeer, tL_error);
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
            yyVar.p4(arrayList, i10, false, false, hashSet2);
            yyVar.getMessagesController().setDialogsInTransaction(false);
            yyVar.getMessagesController().checkIfFolderEmpty(yyVar.W2);
            int i11 = yyVar.W2;
            if (i11 != 0 && yyVar.P3(yyVar.currentAccount, yyVar.f42004e0[0].f41685s, i11, false).size() == 0) {
                yyVar.f42004e0[0].f41679a.setEmptyView(null);
                yyVar.f42004e0[0].f41686w.setVisibility(4);
                yyVar.finishFragment();
                return;
            }
            return;
        }
        yyVar.p4(arrayList, i10, false, false, null);
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
            xyVar.f41679a.setViewsOffset(f7);
            uy uyVar = xyVar.f41679a;
            if (i10 != 0) {
                i11 = 2;
            }
            uyVar.setOverScrollMode(i11);
            yyVar.fragmentView.invalidate();
            if (f7 > AndroidUtilities.dp(90.0f) && !yyVar.U) {
                px pxVar = yyVar.E0;
                ValueAnimator valueAnimator = pxVar.H0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    pxVar.i(pxVar.f3834p0, true);
                    yyVar.U = true;
                    yyVar.getOrCreateStoryViewer().s(new uv(yyVar, 19));
                }
            }
        }
    }

    public static boolean o1(yy yyVar, xy xyVar) {
        if (!yyVar.G3.c()) {
            int i10 = (int) (-yyVar.N);
            int R3 = yyVar.R3();
            int S3 = yyVar.S3();
            if (i10 != 0 && i10 != R3 && i10 != S3 && xyVar.f41679a.canScrollVertically(-1)) {
                if (S3 < i10 && i10 < R3) {
                    int dp = AndroidUtilities.dp(48.0f);
                    int i11 = i10 - S3;
                    if (i11 < dp / 2) {
                        xyVar.f41680b.z(-i11);
                        return true;
                    }
                    xyVar.f41680b.z(dp - i11);
                    return true;
                }
                float f7 = 1.0f;
                if (yyVar.f42088u3 != 1.0f) {
                    f7 = Utilities.clamp((-yyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
                }
                if (f7 < yyVar.E0.B0) {
                    xyVar.f41680b.z(-i10);
                    return true;
                }
                xyVar.f41680b.z(S3 - i10);
                return true;
            }
            return false;
        }
        return false;
    }

    public static void p0(yy yyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(launchActivity, yyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(yyVar.currentAccount).updateAttachMenuBotsInCache();
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
        if (yyVar.B3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        messagesController.removeSuggestion(0L, str);
        yyVar.S4();
    }

    public static void r0(yy yyVar) {
        b.c(yyVar.getParentActivity(), yyVar.currentAccount, yyVar.getResourceProvider());
    }

    public static void s0(final int i10, final long j10, TLRPC.Chat chat, final yy yyVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        yyVar.Z3(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                yyVar.getMessagesController().deleteDialog(j10, 2, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i14 = yyVar.W2) != 0 && yyVar.P3(yyVar.currentAccount, yyVar.f42004e0[0].f41685s, i14, false).size() == 1) {
            yyVar.f42004e0[0].f41686w.setVisibility(4);
        }
        yyVar.f42113z3 = 3;
        int i15 = -1;
        if (i10 == 102) {
            yyVar.y4(true, true);
            if (yyVar.R1 != null) {
                i13 = 0;
                while (i13 < yyVar.R1.size()) {
                    if (((TLRPC.Dialog) yyVar.R1.get(i13)).f18920id == j10) {
                        break;
                    }
                    i13++;
                }
            }
            i13 = -1;
            yyVar.m3();
            i11 = i13;
        } else {
            i11 = -1;
        }
        UndoView W3 = yyVar.W3();
        if (W3 != null) {
            if (i10 == 103) {
                i12 = 0;
            } else if (z11) {
                i12 = 1;
            } else {
                i12 = 95;
            }
            W3.j(i12, j10, new Runnable() {
                @Override
                public final void run() {
                    yyVar.o4(i10, j10, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(yyVar.P3(yyVar.currentAccount, yyVar.f42004e0[0].f41685s, yyVar.W2, false));
        int i16 = 0;
        while (true) {
            if (i16 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i16)).f18920id == j10) {
                i15 = i16;
                break;
            } else {
                i16++;
            }
        }
        if (i10 == 102) {
            if (i11 >= 0 && i15 < 0 && (arrayList = yyVar.R1) != null) {
                arrayList.remove(i11);
                yyVar.f42004e0[0].f41687x.D();
                yyVar.f42004e0[0].q(true);
                return;
            }
            yyVar.y4(false, true);
        }
    }

    public static void t0(yy yyVar) {
        BirthdayController.getInstance(yyVar.currentAccount).hide();
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        yyVar.S4();
        org.telegram.ui.Components.sc G = org.telegram.ui.Components.zc.a0(yyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f28805j = 5000;
        G.j();
    }

    public static void u0(yy yyVar) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        yyVar.S4();
    }

    public static void v0(yy yyVar, int i10, org.telegram.ui.Components.l80 l80Var) {
        CharSequence charSequence;
        if (yyVar.currentAccount != i10) {
            l80Var.u();
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
                    yyVar2.M2 = false;
                    if (yyVar2.B1 != null) {
                        yyVar2.i3(charSequence);
                    } else {
                        yyVar2.V3 = charSequence;
                    }
                }
            } else if (str != null) {
                yyVar2.C4(charSequence, str);
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
                        yyVar2.V3 = charSequence;
                    }
                }
            }
            launchActivity.q0(yyVar2, false, true);
        }
    }

    public static void w0(yy yyVar) {
        if (!yyVar.O3) {
            di.d4 d4Var = yyVar.f42063q0;
            if (d4Var != null) {
                if (d4Var.V) {
                    return;
                }
                AndroidUtilities.removeFromParent(d4Var);
            }
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.g6.Gi, 0, new mw(yyVar, 8));
            di.d4 d4Var2 = new di.d4(yyVar.getParentActivity(), 2);
            d4Var2.q(8.0f);
            d4Var2.d = 8000L;
            d4Var2.i();
            d4Var2.p(true);
            d4Var2.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
            d4Var2.s(replaceSingleTag);
            d4Var2.l(1.0f, -40.0f);
            d4Var2.h(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
            yyVar.f42063q0 = d4Var2;
            d4Var2.setTranslationY((-yyVar.f42019g4) - yyVar.f42029i4);
            ((ViewGroup) yyVar.fragmentView).addView(yyVar.f42063q0, w7.z5.a(240.0f, 12.0f, 0.0f, 68.0f, 40.0f, -1, 87));
            yyVar.f42063q0.u();
            return;
        }
        di.d4 d4Var3 = yyVar.f42058p0;
        if (d4Var3 != null) {
            d4Var3.e(true);
        }
        bi.q8 o10 = MessagesController.getInstance(yyVar.currentAccount).getStoriesController().o();
        if (o10 != null && o10.a(yyVar.currentAccount, 1)) {
            yyVar.showDialog(new sg.j0(o10.b(), yyVar.currentAccount, yyVar.getParentActivity(), yyVar, null));
            return;
        }
        di.kc D = di.kc.D(yyVar.getParentActivity(), yyVar.currentAccount);
        D.f7311x = new ey(yyVar, 4);
        D.Q(null);
    }

    public static void x0(yy yyVar) {
        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(yyVar.getParentActivity(), yyVar.resourceProvider);
        acVar.d(R.raw.email_check_inbox, new String[0]);
        acVar.f23192b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.sc.g(yyVar, acVar, 2750).j();
        try {
            yyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void y0(yy yyVar) {
        MessagesController.getInstance(yyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        yyVar.S4();
        org.telegram.ui.Components.sc G = org.telegram.ui.Components.zc.a0(yyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f28805j = 5000;
        G.j();
    }

    @Override
    public final void A(float f7, int i10) {
        org.telegram.ui.ActionBar.u0 u0Var;
        if (i10 == 3 && (u0Var = this.f42040l0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) u0Var.getIconView().getDrawable();
            if (this.d.f16004f) {
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
        u3();
        org.telegram.ui.Components.l20.d(this.f42035k0, (1.0f - this.f41987b.e) * (1.0f - T3()) * (1.0f - this.f41993c.e));
        v3();
        y3();
        w3();
        x3();
    }

    public final void A4(float f7) {
        xy[] xyVarArr = this.f42004e0;
        int i10 = 0;
        if (xyVarArr != null) {
            int paddingTop = xyVarArr[0].f41679a.getPaddingTop() + ((int) f7);
            int i11 = 0;
            while (true) {
                xy[] xyVarArr2 = this.f42004e0;
                if (i11 >= xyVarArr2.length) {
                    break;
                }
                xyVarArr2[i11].f41679a.setTopGlowOffset(paddingTop);
                i11++;
            }
        }
        if (this.fragmentView != null && f7 != this.N) {
            this.N = f7;
            org.telegram.ui.Components.sc scVar = this.f42056o3;
            if (scVar != null) {
                scVar.l();
            }
            if (this.F3 != null) {
                float currentActionBarHeight = 1.0f - ((-f7) / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                org.telegram.ui.Cells.o oVar = this.F3;
                float f10 = (int) f7;
                float f11 = oVar.f21308f;
                oVar.h = f10;
                oVar.setTranslationY(f11 + f10);
                this.F3.setAlpha(w7.r.a(currentActionBarHeight, 0.0f, 1.0f));
                org.telegram.ui.Cells.o oVar2 = this.F3;
                if (currentActionBarHeight <= 0.0f) {
                    i10 = 4;
                }
                oVar2.setVisibility(i10);
            }
            C3();
            this.fragmentView.invalidate();
        }
    }

    public final void B3() {
        int i10;
        if (T3() > 0.5f) {
            i10 = R.string.SearchTopics;
        } else {
            i10 = R.string.SearchChats;
        }
        String string = LocaleController.getString(i10);
        this.X.f27510r.setContentDescription(string);
        this.X.f27510r.setHint(string);
    }

    public final void B4(float f7) {
        int i10;
        int i11;
        this.f42103x1 = f7;
        if (this.f42078s3 && this.actionBar != null) {
            if (this.W2 == 0 && this.Y2 == 0) {
                i10 = org.telegram.ui.ActionBar.g6.f19935v8;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.O8;
            }
            int themedColor = getThemedColor(i10);
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.g6.f19990y8;
            kVar.D(i0.a.d(this.f42103x1, themedColor, getThemedColor(i12)), false);
            this.actionBar.D(i0.a.d(this.f42103x1, getThemedColor(i12), getThemedColor(i12)), true);
            if (this.W2 == 0 && this.Y2 == 0) {
                i11 = org.telegram.ui.ActionBar.g6.f19899t8;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.N8;
            }
            int themedColor2 = getThemedColor(i11);
            this.actionBar.C(i0.a.d(this.f42103x1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.g6.f20007z8)), false);
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            LiteMode.isEnabled(32768);
        }
        Q4();
    }

    @Override
    public final List C() {
        return Arrays.asList(new ng.a(LocaleController.getString(R.string.DebugDialogsActivity)), new ng.a(LocaleController.getString(R.string.ClearLocalDatabase), new uv(this, 28)), new ng.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new uv(this, 29)));
    }

    public final void C3() {
        float f7;
        int i10;
        if (this.X == null) {
            return;
        }
        float a2 = 1.0f - w7.r.a(((-this.N) - S3()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.f42088u3, this.h.e);
        float f10 = this.f41987b.e;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float max2 = f7 * (1.0f - this.f41993c.e) * (1.0f - max) * Math.max(f10, (1.0f - T3()) * a2);
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
        this.f42009f.a(z10, true);
    }

    public final void C4(CharSequence charSequence, String str) {
        if (str != null && !str.isEmpty()) {
            this.E2 = str;
            this.F2 = null;
            this.D2 = null;
            if (this.B1 != null) {
                i3(charSequence);
                return;
            } else {
                this.V3 = charSequence;
                return;
            }
        }
        this.E2 = null;
        this.F2 = null;
    }

    public final void D3() {
        int i10;
        float f7;
        int i11;
        int i12 = 8;
        if (this.Z != null) {
            if (this.f41983a0 != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float f10 = f7 * this.f41987b.e;
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
        org.telegram.ui.Components.k91 k91Var = this.f41983a0;
        ne.b bVar = this.f42074s;
        if (k91Var != null) {
            float f11 = 1.0f - bVar.e;
            k91Var.setAlpha(f11);
            org.telegram.ui.Components.k91 k91Var2 = this.f41983a0;
            if (f11 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            k91Var2.setVisibility(i10);
        }
        hg.r0 r0Var = this.f41988b0;
        if (r0Var != null) {
            float f12 = bVar.e;
            r0Var.setAlpha(f12);
            hg.r0 r0Var2 = this.f41988b0;
            if (f12 > 0.0f) {
                i12 = 0;
            }
            r0Var2.setVisibility(i12);
        }
    }

    public final void D4(float f7) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.X3 != f7) {
            boolean z10 = true;
            if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
                z10 = false;
            }
            this.Y3 = z10;
            this.X3 = f7;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.Y3) {
                float f10 = (1.0f - this.X3) * (-AndroidUtilities.dp(40.0f));
                px pxVar = this.E0;
                if (pxVar != null) {
                    pxVar.setTranslationX(f10);
                }
                oy oyVar = this.X;
                if (oyVar != null) {
                    oyVar.setTranslationX(f10);
                }
                sx sxVar = this.G3;
                if (sxVar != null && sxVar.getFragmentView() != null && !this.f42106y) {
                    this.G3.getFragmentView().setTranslationX(f10);
                    return;
                }
                return;
            }
            float f11 = 1.0f - this.X3;
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
            sx sxVar2 = this.G3;
            if (sxVar2 != null && sxVar2.getFragmentView() != null) {
                if (!this.f42106y) {
                    this.G3.getFragmentView().setScaleX(f13);
                    this.G3.getFragmentView().setScaleY(f13);
                    this.G3.getFragmentView().setTranslationX(f12);
                }
                this.G3.getFragmentView().setPivotX(0.0f);
                this.G3.getFragmentView().setPivotY(0.0f);
            }
        }
    }

    public final void E3(boolean z10) {
        int i10;
        int i11;
        if (this.C0 != null && this.actionBar != null) {
            int i12 = AndroidUtilities.navigationBarHeight;
            int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f41982a);
            if (this.f41983a0 != null) {
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
            org.telegram.ui.Components.zo0.P(iyVar.f31622f0, iyVar.f31625i0, iyVar.U0, iyVar.V0, z10);
            org.telegram.ui.Components.zo0.P(iyVar.f31627k0, iyVar.f31629n0, iyVar.U0, iyVar.V0, z10);
            org.telegram.ui.Components.zo0.P(iyVar.f31633r0, iyVar.f31636u0, iyVar.U0, iyVar.V0, z10);
            org.telegram.ui.Components.zh0 zh0Var = iyVar.f31631p0;
            int i17 = iyVar.U0;
            int i18 = iyVar.V0;
            zh0Var.setClipToPadding(false);
            org.telegram.ui.Components.i71 i71Var = zh0Var.f31564c;
            zh0Var.J = z10;
            zh0Var.setPadding(0, i17, 0, i18);
            if (z10) {
                i71Var.o1(0, i17, 0, i18);
            } else {
                i71Var.setPadding(0, i17, 0, i18);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) i71Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i17;
            marginLayoutParams2.bottomMargin = -i18;
            zh0Var.J = false;
            org.telegram.ui.Components.xn0 xn0Var = iyVar.G0;
            if (xn0Var != null) {
                xn0Var.b(iyVar.U0, iyVar.V0, z10);
            }
            int size = sparseArray.size();
            for (int i19 = 0; i19 < size; i19++) {
                View view = (View) sparseArray.valueAt(i19);
                if (view instanceof b20) {
                    ((b20) view).j(iyVar.U0, iyVar.V0, z10);
                }
            }
            for (int i20 = 0; i20 < iyVar.getChildCount(); i20++) {
                if (iyVar.getChildAt(i20) instanceof b20) {
                    ((b20) iyVar.getChildAt(i20)).j(iyVar.U0, iyVar.V0, z10);
                }
            }
        }
    }

    public final void E4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.y6 y6Var = new org.telegram.ui.Components.y6(getParentActivity(), this.currentAccount, getResourceProvider(), new org.telegram.ui.Components.n51(16, this, r0), new gj(r0, 18));
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(getParentActivity(), getResourceProvider());
        z2Var.c(y6Var);
        org.telegram.ui.ActionBar.e3 e3Var = z2Var.f20538a;
        e3Var.show();
        org.telegram.ui.ActionBar.e3[] e3VarArr = {e3Var};
        e3Var.fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5));
    }

    public final void F3() {
        if (this.J1 != null) {
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, 1.0f);
            this.J1.setAlpha(1.0f);
            this.J1.setScaleX(lerp);
            this.J1.setScaleY(lerp);
            this.J1.setVisibility(0);
        }
    }

    public final boolean F4(org.telegram.ui.Cells.s2 r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.F4(org.telegram.ui.Cells.s2):boolean");
    }

    public boolean G3() {
        if (this.R0 == 10) {
            return true;
        }
        return false;
    }

    public final void G4(boolean z10) {
        float f7;
        this.f41993c.a(z10, true);
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
        this.P3.playTogether(arrayList);
        this.P3.addListener(new yx(this, z10, 1));
        this.P3.start();
    }

    public final void H3() {
        if (AndroidUtilities.isTablet()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                iy iyVar = this.C0;
                if (iyVar != null) {
                    iyVar.f31618b0.R(this.W1, tLObject);
                }
                this.X1 = null;
                return;
            }
            return;
        }
        this.V1 = true;
    }

    public final void H4() {
        if (!this.A0 && getMessagesController().dialogFiltersLoaded && getMessagesController().showFiltersTooltip && this.f42110z0 != null && getMessagesController().getDialogFilters().isEmpty() && !this.isPaused && getUserConfig().filtersLoaded && !this.inPreviewMode) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("filterhint", false)) {
                globalMainSettings.edit().putBoolean("filterhint", true).apply();
                AndroidUtilities.runOnUIThread(new mw(this, 10), 1000L);
            }
        }
    }

    public final void I3() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.f20142n0) {
            kVar.h(true);
            this.f42066q3 = false;
            T4(true, true);
        }
    }

    public final void I4() {
        LaunchActivity launchActivity;
        boolean q6;
        int i10;
        int i11;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        LaunchActivity launchActivity2;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        float f7;
        CharSequence charSequence;
        org.telegram.ui.Components.n51 n51Var;
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
        org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(this, this.f42035k0);
        int i15 = org.telegram.ui.ActionBar.g6.A8;
        H.S(getThemedColor(i15), getThemedColor(i15));
        H.f26668s = 8;
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) parentActivity;
        } else {
            launchActivity = null;
        }
        float f10 = 64.0f;
        int i16 = 0;
        if (this.Y2 != 0) {
            if (ChatObject.hasAdminRights(this.Z2)) {
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new uv(this, 4), false);
                H.k();
            }
            H.i(new uv(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.Z2.collapsed_in_dialogs);
            H.i(new uv(this, 8), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.Z2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else if (c4()) {
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
                            org.telegram.ui.Components.n51 n51Var2 = new org.telegram.ui.Components.n51(15, this, tL_attachMenuBot2);
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
                                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.g6.f19583c7, 1.0f);
                                    if (svgThumb != null) {
                                        Integer num = H.f26655k0;
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
                                    n51Var = n51Var2;
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
                                        z9Var.setLayoutParams(w7.z5.e(24, 24, i14 | 16));
                                    }
                                } else {
                                    launchActivity2 = launchActivity;
                                    arrayList2 = arrayList3;
                                    n51Var = n51Var2;
                                    c6Var = c6Var3;
                                    CharSequence charSequence3 = charSequence;
                                    e1Var = e1Var2;
                                    i12 = i18;
                                    i13 = i19;
                                    e1Var.g(charSequence3, R.drawable.msg_bot, null);
                                }
                                Integer num2 = H.f26653j0;
                                if (num2 != null) {
                                    w02 = num2.intValue();
                                } else {
                                    w02 = org.telegram.ui.ActionBar.g6.w0(i13, c6Var);
                                }
                                Integer num3 = H.f26655k0;
                                if (num3 != null) {
                                    w03 = num3.intValue();
                                } else {
                                    w03 = org.telegram.ui.ActionBar.g6.w0(i12, c6Var);
                                }
                                e1Var.c(w02, w03);
                                Integer num4 = H.f26655k0;
                                if (num4 != null) {
                                    w04 = num4.intValue();
                                } else {
                                    w04 = org.telegram.ui.ActionBar.g6.w0(i12, c6Var);
                                }
                                e1Var.setIconColorImage(w04);
                                Integer num5 = H.f26657l0;
                                if (num5 != null) {
                                    m12 = num5.intValue();
                                } else {
                                    m12 = org.telegram.ui.ActionBar.g6.m1(0.12f, org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
                                }
                                e1Var.setSelectorColor(m12);
                                e1Var.setOnClickListener(new org.telegram.ui.Components.rt(8, H, yvVar));
                                e1Var.setOnLongClickListener(new bi.g3(3, H, n51Var));
                                int i20 = H.S;
                                if (i20 > 0) {
                                    e1Var.setMinimumWidth(AndroidUtilities.dp(i20));
                                    H.r(e1Var, w7.z5.n(H.S, -2));
                                } else {
                                    H.r(e1Var, w7.z5.n(-1, -2));
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
            org.telegram.ui.ActionBar.e1 e1Var3 = this.f42053o0;
            if (e1Var3 != null) {
                e1Var3.f19420b.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19554ai));
                this.f42053o0.setOnClickListener(new xv(0, this, H));
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                    H.k();
                    H.d(this.f42053o0);
                }
            }
            H.Z();
            H.X(-AndroidUtilities.dp(f11));
        }
    }

    public final void J3(String str) {
        if (this.actionBar.a(str)) {
            return;
        }
        org.telegram.ui.ActionBar.y j10 = this.actionBar.j(str);
        boolean z10 = this.W;
        ArrayList arrayList = this.f42026i1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f42016g1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f42016g1.setImageDrawable(new org.telegram.ui.ActionBar.f2(true));
            this.f42016g1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f19990y8), PorterDuff.Mode.MULTIPLY));
            this.f42016g1.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(org.telegram.ui.ActionBar.g6.f20007z8), 1, -1));
            this.f42016g1.setOnClickListener(new zv(this, 6));
            j10.addView(this.f42016g1, w7.z5.q(54, 54, 16));
            arrayList.add(this.f42016g1);
        }
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.f42021h1 = numberTextView;
        int i10 = 18;
        numberTextView.setTextSize(18);
        this.f42021h1.setTypeface(AndroidUtilities.bold());
        this.f42021h1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19990y8));
        NumberTextView numberTextView2 = this.f42021h1;
        if (!this.W) {
            i10 = 72;
        }
        j10.addView(numberTextView2, w7.z5.m(1.0f, 0, -1, i10, 0, 0));
        this.f42021h1.setOnTouchListener(new ci.d(2));
        this.f42036k1 = j10.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.l1 = j10.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.f42043m1 = j10.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.f42031j1 = j10.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.u0 h = j10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        j10.addView(new View(getParentActivity()), w7.z5.n(5, -1));
        this.f42064q1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.f42049n1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.f42054o1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.f42059p1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.f42076s1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.f42070r1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.f42081t1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.l1.setOnLongClickListener(new hw(this, 1));
        arrayList.add(this.f42036k1);
        arrayList.add(this.f42043m1);
        arrayList.add(this.l1);
        arrayList.add(this.f42031j1);
        arrayList.add(h);
        R4(false);
    }

    public final void J4() {
        if (this.S3 == null) {
            for (String str : getMessagesController().pendingSuggestions) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                    alertDialog$Builder.f19248a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new aw(this, 6));
                    showDialog(alertDialog$Builder.f19248a, new vv(this, 1));
                    this.S3 = str;
                    return;
                }
            }
        }
    }

    public final void K3() {
        int i10;
        iy iyVar = this.C0;
        if ((iyVar != null && iyVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f42050n2 != null) {
            i10 = 2;
        } else if (!this.f42041l2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        iy iyVar2 = new iy(this, getParentActivity(), this, i10, this.R0, this.W2, this.Y2, new ey(this, 1));
        this.C0 = iyVar2;
        ((ry) this.fragmentView).addView(iyVar2, this.B0);
        iy iyVar3 = this.C0;
        iyVar3.f31618b0.U = new ky(this);
        iyVar3.f31625i0.setOnItemClickListener(new aw(this, 1));
        this.C0.f31629n0.setOnItemClickListener(new aw(this, 2));
        this.C0.f31636u0.setOnItemClickListener(new ew(this, 0));
        this.C0.f31629n0.setOnItemLongClickListener(new aw(this, 3));
        this.C0.V.setOnItemClickListener(new aw(this, 4));
        this.C0.V.setOnItemLongClickListener(new ey(this, 2));
        this.C0.setFilteredSearchViewDelegate(new aw(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.f42067q4);
    }

    public final void K4(long j10, View view) {
        ArrayList<TLRPC.Dialog> P3;
        int i10;
        f3(j10, view);
        boolean t10 = this.actionBar.t();
        ArrayList arrayList = this.I2;
        boolean z10 = true;
        if (t10) {
            if (arrayList.isEmpty()) {
                Z3(true);
                return;
            }
        } else {
            if (this.f42066q3) {
                J3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.c5)) {
                    i2.d.y(false, this.actionBar);
                }
            } else {
                J3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
            this.actionBar.O(null, null);
            int i11 = this.f42004e0[0].f41685s;
            if ((i11 != 7 && i11 != 8) || (this.actionBar.t() && !this.actionBar.u(null))) {
                P3 = getMessagesController().getDialogs(this.W2);
            } else {
                P3 = P3(this.currentAccount, this.f42004e0[0].f41685s, this.W2, this.S1);
            }
            int size = P3.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = P3.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (e4(dialog)) {
                        i12++;
                    } else if (!getMessagesController().isPromoDialog(dialog.f18920id, false)) {
                        break;
                    }
                }
            }
            if (i12 > 1) {
                if (this.f42004e0 != null) {
                    int i14 = 0;
                    while (true) {
                        xy[] xyVarArr = this.f42004e0;
                        if (i14 >= xyVarArr.length) {
                            break;
                        }
                        xyVarArr[i14].d.H = true;
                        i14++;
                    }
                }
                e5(MessagesController.UPDATE_MASK_REORDER, true);
            }
            if (!this.f42066q3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f42026i1;
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
            ValueAnimator valueAnimator = this.f42093v3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f42093v3 = ValueAnimator.ofFloat(this.f42088u3, 1.0f);
            int i16 = 0;
            while (true) {
                xy[] xyVarArr2 = this.f42004e0;
                if (i16 >= xyVarArr2.length) {
                    break;
                }
                xy xyVar = xyVarArr2[i16];
                if (xyVar != null) {
                    xyVar.f41679a.I0(true);
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
            this.f42093v3.addUpdateListener(new cw(this, max, 0));
            this.f42093v3.addListener(new cy(this, max, 1));
            this.f42093v3.setInterpolator(org.telegram.ui.Components.es.f24465f);
            this.f42093v3.setDuration(200L);
            this.f42093v3.start();
            ww wwVar = this.f42110z0;
            if (wwVar != null) {
                wwVar.b(org.telegram.ui.ActionBar.g6.Gh, org.telegram.ui.ActionBar.g6.Fh, org.telegram.ui.ActionBar.g6.Eh, org.telegram.ui.ActionBar.g6.Hh, org.telegram.ui.ActionBar.g6.f19954w8);
            }
            org.telegram.ui.ActionBar.f2 f2Var = this.f42005e1;
            if (f2Var != null) {
                f2Var.c(1.0f, true);
            }
            z10 = false;
        }
        R4(false);
        this.f42021h1.a(arrayList.size(), z10);
    }

    public final void L3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f42107y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new dy(this, parentActivity);
                FrameLayout.LayoutParams a2 = w7.z5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83);
                a2.bottomMargin = this.f42019g4 + this.f42029i4 + a2.bottomMargin;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.f42102x0 + 1;
                this.f42102x0 = i11;
                ((ry) this.fragmentView).addView(undoView, i11, a2);
            }
        }
    }

    public final void L4(long j10, View view) {
        String str;
        org.telegram.ui.Components.sc J;
        int i10 = -this.M3;
        this.M3 = i10;
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

    public final void M3(final long j10, final long j11, boolean z10, final kg1 kg1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String string;
        String formatStringSimple;
        String string2;
        String str;
        String str2;
        TLRPC.TL_forumTopic findTopic;
        if (n3(j10)) {
            int i10 = this.R0;
            if (i10 != 11 && i10 != 12 && i10 != 13) {
                if (z10 && ((this.f42012f2 != null && this.f42017g2 != null) || this.f42022h2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (DialogObject.isEncryptedDialog(j10)) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.g0.l(getMessagesController(), j10).user_id));
                            if (user2 != null) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f42012f2, UserObject.getUserName(user2));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                return;
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            if (j10 == getUserConfig().getClientUserId()) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f42017g2, LocaleController.getString(R.string.SavedMessages));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j10));
                                if (user3 != null && this.f42012f2 != null) {
                                    str = LocaleController.getString(R.string.SendMessageTitle);
                                    str2 = LocaleController.formatStringSimple(this.f42012f2, UserObject.getUserName(user3));
                                    string2 = LocaleController.getString(R.string.Send);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j10));
                            if (chat2 != null) {
                                String str3 = chat2.title;
                                if (j11 != 0 && (findTopic = getMessagesController().getTopicsController().findTopic(chat2.f18916id, j11)) != null) {
                                    str3 = ((Object) str3) + " " + findTopic.title;
                                }
                                if (this.f42022h2 != null) {
                                    string = LocaleController.getString(R.string.AddToTheGroupAlertTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f42022h2, str3);
                                    string2 = LocaleController.getString(R.string.Add);
                                } else {
                                    string = LocaleController.getString(R.string.SendMessageTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f42017g2, str3);
                                    string2 = LocaleController.getString(R.string.Send);
                                }
                                String str4 = formatStringSimple;
                                str = string;
                                str2 = str4;
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                        a2Var.R = str;
                        a2Var.T = AndroidUtilities.replaceTags(str2);
                        alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.z1() {
                            @Override
                            public final void g(org.telegram.ui.ActionBar.a2 a2Var2, int i11) {
                                yy.this.M3(j10, j11, false, kg1Var);
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
                    Runnable i0Var = new a3.i0(this, j10, new a3.h0(this, j10, j11, kg1Var, 13), 23);
                    if (j10 < 0) {
                        O4(getMessagesController().getChat(Long.valueOf(-j10)), i0Var, null);
                        return;
                    }
                    TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(j10));
                    TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(this.H));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user4), UserObject.getFirstName(user5));
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19248a;
                    a2Var2.R = formatString;
                    a2Var2.T = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user4), UserObject.getFirstName(user5))));
                    alertDialog$Builder2.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new mu(i0Var, 1));
                    alertDialog$Builder2.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.co0(18));
                    showDialog(a2Var2);
                    return;
                } else if (this.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j10, j11));
                    if (this.C2.w(this, arrayList, null, false, this.J2, this.K2, this.L2, kg1Var) && this.f42027i2) {
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
                    UndoView W3 = W3();
                    if (W3 != null) {
                        W3.j(45, j10, null);
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
                    UndoView W32 = W3();
                    if (W32 != null) {
                        W32.j(46, j10, null);
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

    public final void M4(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.M4(boolean, boolean, boolean, boolean):void");
    }

    public final void N3(long j10, boolean z10) {
        if (this.f42004e0 != null) {
            int i10 = 0;
            while (true) {
                xy[] xyVarArr = this.f42004e0;
                if (i10 < xyVarArr.length) {
                    int childCount = xyVarArr[i10].f41679a.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 < childCount) {
                            View childAt = this.f42004e0[i10].f41679a.getChildAt(i11);
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

    public final void N4() {
        int i10;
        int i11;
        Long l4;
        if (this.M0 == null && !SharedConfig.appLocked && (!this.K || this.E0.g())) {
            i71[] i71VarArr = new i71[1];
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.E3.f();
                Drawable drawable = this.E3.f28197f[0];
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(titleTextView.getRightDrawable().getBounds());
                rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
                int dp = (-(this.actionBar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                i10 = AndroidUtilities.dp(4.0f) + (rect.centerX() - AndroidUtilities.dp(16.0f));
                org.telegram.ui.Cells.o oVar = this.F3;
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
            Long l10 = this.C3;
            if (l10 != null) {
                txVar.setSelected(l10);
            } else {
                Drawable drawable2 = this.E3.f28197f[0];
                if (drawable2 instanceof org.telegram.ui.Components.s5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.s5) drawable2).i());
                } else {
                    l4 = null;
                }
                txVar.setSelected(l4);
            }
            txVar.setSaveState(1);
            txVar.y(this.E3, titleTextView);
            ux uxVar = new ux(this, txVar);
            this.M0 = uxVar;
            i71VarArr[0] = uxVar;
            uxVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i11, 48);
            i71VarArr[0].b();
        }
    }

    public final void O4(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.O4(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final java.util.ArrayList P3(int r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.P3(int, int, int, boolean):java.util.ArrayList");
    }

    public final void P4(boolean z10) {
        xy[] xyVarArr;
        char c10;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            xyVarArr = this.f42004e0;
            if (i12 >= xyVarArr.length) {
                break;
            }
            xyVarArr[i12].f41679a.B0();
            i12++;
        }
        if (z10 && xyVarArr.length > 1) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int i13 = xyVarArr[c10].h;
        if (i13 >= 0 && i13 < getMessagesController().getDialogFilters().size()) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.f42004e0[c10].h);
            if (dialogFilter.isDefault()) {
                xy xyVar = this.f42004e0[c10];
                xyVar.f41685s = this.R0;
                uy uyVar = xyVar.f41679a;
                int i14 = uy.f40506t3;
                uyVar.B1();
            } else {
                xy[] xyVarArr2 = this.f42004e0;
                if (xyVarArr2[c10 ^ 1].f41685s == 7) {
                    xyVarArr2[c10].f41685s = 8;
                } else {
                    xyVarArr2[c10].f41685s = 7;
                }
                xyVarArr2[c10].f41679a.setScrollEnabled(true);
                MessagesController messagesController = getMessagesController();
                if (this.f42004e0[c10].f41685s == 8) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                messagesController.selectDialogFilter(dialogFilter, i10);
            }
            xy[] xyVarArr3 = this.f42004e0;
            if (xyVarArr3.length > 1) {
                xyVarArr3[1].E = dialogFilter.locked;
            }
            xy xyVar2 = xyVarArr3[c10];
            fx fxVar = xyVar2.d;
            fxVar.h = xyVar2.f41685s;
            fxVar.l();
            xy xyVar3 = this.f42004e0[c10];
            bx bxVar = xyVar3.f41681c;
            if (xyVar3.f41685s == 0 && X3() && this.f42004e0[c10].v == 2) {
                i11 = 1;
            }
            bxVar.h1(i11, (int) this.N);
            p3(this.f42004e0[c10]);
        }
    }

    public final float Q3(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f - this.f41987b.e;
        } else {
            f7 = 1.0f;
        }
        return f7 * (1.0f - T3()) * this.f42068r.e;
    }

    public final void Q4() {
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
            float f20 = this.f42103x1;
            f11 = (f7 * f20) + com.google.android.gms.internal.play_billing.k3.y(1.0f, f20, f10, f19);
            f12 = this.f42105x3;
        } else {
            f11 = (f7 * this.f42103x1) + this.N;
            f12 = this.f42105x3;
        }
        float f21 = f11 + f12 + this.T;
        oy oyVar = this.X;
        if (oyVar != null && oyVar.getVisibility() == 0) {
            f13 = this.X.getAlpha();
        } else {
            f13 = 0.0f;
        }
        float dp = AndroidUtilities.dp(4.0f) * f13;
        ww wwVar = this.f42110z0;
        if (wwVar != null) {
            wwVar.setTranslationY(f21 - dp);
            f15 = this.f42110z0.getAlpha();
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
            if (this.f41983a0 == null) {
                i10 = AndroidUtilities.dp(44.0f);
            } else {
                i10 = 0;
            }
            xsVar.setTranslationY(AndroidUtilities.lerp(f22, i11 - i10, this.f41987b.e));
            f17 = this.J1.getMetadata().f16019c.f16027a;
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
            Matrix matrix = wsVar2.f30647b;
            if (wsVar2.e != lerp || wsVar2.f30649f != min) {
                wsVar2.e = lerp;
                wsVar2.f30649f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = wsVar2.f30648c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                wsVar2.invalidate();
            }
            this.K1.setAlpha(Math.max(f15, f17));
        }
    }

    public final int R3() {
        if (this.K) {
            return AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(81.0f);
        }
        return AndroidUtilities.dp(48.0f);
    }

    public final void R4(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.R4(boolean):void");
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        sx sxVar;
        di.ab abVar;
        ww wwVar;
        boolean z11;
        boolean z12;
        if (!this.f42066q3 && (((sxVar = this.G3) == null || !sxVar.c()) && (((abVar = this.K0) == null || abVar.getVisibility() != 0) && ((wwVar = this.f42110z0) == null || !wwVar.f30377n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                ww wwVar2 = this.f42110z0;
                if (wwVar2 != null && wwVar2.getTabsCount() >= 2 && this.f42110z0.getCurrentTabId() != this.f42110z0.getFirstTabId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                ww wwVar3 = this.f42110z0;
                if (wwVar3 != null && wwVar3.getTabsCount() >= 2 && this.f42110z0.getCurrentTabId() != this.f42110z0.getLastTabId()) {
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

    public final int S3() {
        if (this.K) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    public final void S4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.S4():void");
    }

    public final float T3() {
        sx sxVar = this.G3;
        if (sxVar != null && sxVar.c()) {
            return this.G3.e;
        }
        return 0.0f;
    }

    public final void T4(boolean z10, boolean z11) {
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
        if (this.f42110z0 != null && !this.inPreviewMode && !this.f42066q3) {
            sx sxVar = this.G3;
            if (sxVar == null || !sxVar.c()) {
                org.telegram.ui.Components.l80 l80Var = this.L0;
                if (l80Var != null) {
                    l80Var.u();
                    this.L0 = null;
                }
                ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                int size = dialogFilters.size();
                ne.b bVar = this.f42068r;
                boolean z17 = true;
                boolean z18 = false;
                if (size > 1) {
                    if (!z10 && this.f42110z0.getVisibility() == 0) {
                        r52 = 0;
                    } else {
                        if (this.f42110z0.getVisibility() != 0) {
                            z13 = false;
                        } else {
                            z13 = z11;
                        }
                        this.f42095w = true;
                        boolean isEmpty = this.f42110z0.h.isEmpty();
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.R3 == null) {
                                z16 = z11;
                            } else {
                                z16 = false;
                            }
                            if (!this.f42066q3) {
                                bVar.a(this.f42095w, z16);
                            }
                        }
                        int currentTabId = this.f42110z0.getCurrentTabId();
                        int currentTabStableId = this.f42110z0.getCurrentTabStableId();
                        if (currentTabId != this.f42110z0.getDefaultTabId() && currentTabId >= dialogFilters.size()) {
                            this.f42110z0.L = -1;
                            objArr = 1;
                        } else {
                            objArr = null;
                        }
                        ww wwVar = this.f42110z0;
                        wwVar.h.clear();
                        wwVar.f30374j0.clear();
                        wwVar.f30376l0.clear();
                        wwVar.m0.clear();
                        wwVar.f30378n0.clear();
                        wwVar.f30379o0.clear();
                        wwVar.M = 0;
                        int size2 = dialogFilters.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            if (dialogFilters.get(i10).isDefault()) {
                                this.f42110z0.a(i10, 0, LocaleController.getString(R.string.FilterAllChats), null, false, true, dialogFilters.get(i10).locked);
                                z15 = z18;
                            } else {
                                MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(i10);
                                z15 = z18;
                                this.f42110z0.a(i10, dialogFilter2.localId, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, false, dialogFilters.get(i10).locked);
                            }
                            i10++;
                            z18 = z15;
                        }
                        boolean z19 = z18;
                        if (currentTabStableId >= 0) {
                            if (objArr != null && !this.f42110z0.h(currentTabStableId)) {
                                while (currentTabId >= 0) {
                                    ww wwVar2 = this.f42110z0;
                                    if (wwVar2.h(wwVar2.f30375k0.get(currentTabId, -1))) {
                                        break;
                                    }
                                    currentTabId--;
                                }
                                if (currentTabId < 0) {
                                    currentTabId = z19 ? 1 : 0;
                                }
                            }
                            if (this.f42110z0.f30375k0.get(this.f42004e0[z19 ? 1 : 0].h, -1) != currentTabStableId) {
                                this.f42004e0[z19 ? 1 : 0].h = currentTabId;
                                isEmpty = true;
                            }
                        }
                        int i11 = z19 ? 1 : 0;
                        while (true) {
                            xy[] xyVarArr2 = this.f42004e0;
                            if (i11 >= xyVarArr2.length) {
                                break;
                            }
                            if (xyVarArr2[i11].h >= dialogFilters.size()) {
                                this.f42004e0[i11].h = dialogFilters.size() - 1;
                            }
                            this.f42004e0[i11].f41679a.setScrollingTouchSlop(1);
                            i11++;
                        }
                        ww wwVar3 = this.f42110z0;
                        bi.o0 o0Var = wwVar3.F;
                        if (z13) {
                            l0Var = wwVar3.f30385s0;
                        } else {
                            l0Var = null;
                        }
                        o0Var.setItemAnimator(l0Var);
                        wwVar3.I.l();
                        if (isEmpty) {
                            P4(z19);
                        }
                        ww wwVar4 = this.f42110z0;
                        int currentTabId2 = wwVar4.getCurrentTabId();
                        ArrayList arrayList = wwVar4.h;
                        int i12 = 0;
                        while (true) {
                            if (i12 < arrayList.size()) {
                                if (((org.telegram.ui.Components.s00) arrayList.get(i12)).f28686a == currentTabId2) {
                                    z14 = ((org.telegram.ui.Components.s00) arrayList.get(i12)).f28689f;
                                    break;
                                }
                                i12++;
                            } else {
                                z14 = false;
                                break;
                            }
                        }
                        if (z14) {
                            ww wwVar5 = this.f42110z0;
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
                    if (this.f42110z0.getVisibility() != 8) {
                        this.f42110z0.setIsEditing(false);
                        G4(false);
                        this.f42051n3 = false;
                        if (this.f42045m3) {
                            this.f42045m3 = false;
                            this.f42004e0[0].setTranslationX(0.0f);
                            this.f42004e0[1].setTranslationX(xyVarArr[0].getMeasuredWidth());
                        }
                        if (this.f42004e0[0].h != this.f42110z0.getDefaultTabId()) {
                            this.f42004e0[0].h = this.f42110z0.getDefaultTabId();
                            fx fxVar = this.f42004e0[0].d;
                            fxVar.h = 0;
                            fxVar.l();
                            xy xyVar = this.f42004e0[0];
                            xyVar.f41685s = this.R0;
                            xyVar.d.l();
                        }
                        this.f42004e0[1].setVisibility(8);
                        xy xyVar2 = this.f42004e0[1];
                        xyVar2.h = 0;
                        fx fxVar2 = xyVar2.d;
                        fxVar2.h = 0;
                        fxVar2.l();
                        xy xyVar3 = this.f42004e0[1];
                        xyVar3.f41685s = this.R0;
                        xyVar3.d.l();
                        this.f42095w = false;
                        if (this.fragmentView != null) {
                            if (!this.isPaused && this.R3 == null) {
                                z12 = z11;
                            } else {
                                z12 = false;
                            }
                            if (!this.f42066q3) {
                                bVar.a(false, z12);
                            }
                        }
                        int i13 = 0;
                        while (true) {
                            xy[] xyVarArr3 = this.f42004e0;
                            if (i13 >= xyVarArr3.length) {
                                break;
                            }
                            xy xyVar4 = xyVarArr3[i13];
                            if (xyVar4.f41685s == 0 && xyVar4.v == 2 && X3() && ((L0 = this.f42004e0[i13].f41681c.L0()) == 0 || L0 == 1)) {
                                this.f42004e0[i13].f41681c.h1(1, (int) this.N);
                            }
                            this.f42004e0[i13].f41679a.setScrollingTouchSlop(0);
                            this.f42004e0[i13].f41679a.requestLayout();
                            this.f42004e0[i13].requestLayout();
                            i13++;
                        }
                        this.f42110z0.L = -1;
                        r52 = 0;
                    }
                }
                R4(r52);
                int i14 = this.f42004e0[r52].f41685s;
                if ((i14 == 7 || i14 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[i14 - 7]) != null) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < dialogFilters.size()) {
                            MessagesController.DialogFilter dialogFilter3 = dialogFilters.get(i15);
                            if (dialogFilter3 != null && dialogFilter3.f16400id == dialogFilter.f16400id) {
                                break;
                            }
                            i15++;
                        } else {
                            z17 = false;
                            break;
                        }
                    }
                    if (!z17) {
                        P4(false);
                    }
                }
            }
        }
    }

    public final float U3() {
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.f41987b.e);
    }

    public final void U4(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.U4(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    public final bi.x8 V3() {
        return getMessagesController().getStoriesController();
    }

    public final void V4() {
        float f7 = (((-this.f42019g4) - this.f42034j4) - this.f42086u1) - this.f42091v1;
        org.telegram.ui.Components.l20 l20Var = this.f42080t0;
        if (l20Var != null) {
            l20Var.setTranslationY(f7);
        }
        org.telegram.ui.Components.l20 l20Var2 = this.f42085u0;
        if (l20Var2 != null) {
            l20Var2.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            di.d4 d4Var = this.f42058p0;
            if (d4Var != null) {
                d4Var.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    public final UndoView W3() {
        L3();
        UndoView[] undoViewArr = this.f42107y0;
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

    public final void W4(boolean z10) {
        boolean z11;
        boolean z12 = this.f42041l2;
        if ((!z12 || this.R0 == 10) && this.W2 == 0 && this.Y2 == 0 && !this.inPreviewMode && ((!this.f42032j2 || z12) && !this.U3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.l20 l20Var = this.f42080t0;
        if (l20Var != null) {
            l20Var.e(z11, z10);
        }
        org.telegram.ui.Components.l20 l20Var2 = this.f42085u0;
        if (l20Var2 != null) {
            l20Var2.e(z11, z10);
        }
    }

    public final boolean X3() {
        if (!this.f42041l2 && this.R0 == 0 && this.Y2 == 0 && this.W2 == 0 && getMessagesController().hasHiddenArchive()) {
            return true;
        }
        return false;
    }

    public final void X4(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        if (this.f42048n0 != null) {
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
                if (!getDownloadController().hasUnviewedDownloads() && !z12 && (this.f42015g0.getVisibility() != 0 || this.f42015g0.getAlpha() != 1.0f || z11)) {
                    this.f42025i0 = false;
                } else {
                    this.f42025i0 = true;
                }
                v3();
                boolean z14 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i12 = this.f42001d2;
                if (i12 == 3 || i12 == 5) {
                    z13 = true;
                }
                org.telegram.ui.ActionBar.e1 e1Var = this.f42053o0;
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
                this.f42048n0.b(z14, z13, z10);
            }
        }
    }

    public final boolean Y3() {
        ArrayList arrayList = this.D2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void Y4() {
        org.telegram.ui.Components.nr0 nr0Var;
        int i10;
        ix ixVar = this.B1;
        ArrayList arrayList = this.I2;
        if (ixVar != null) {
            this.f42047n.a(!arrayList.isEmpty(), true);
            Z4();
            if (arrayList.isEmpty()) {
                if (this.R0 == 3 && this.f42012f2 == null) {
                    i10 = R.string.ForwardTo;
                } else {
                    i10 = R.string.SelectChat;
                }
                String string = LocaleController.getString(i10);
                if (this.Q3 == arrayList.isEmpty()) {
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
                    if (!Y3() && this.E2 == null) {
                        this.B1.setFieldText("");
                    }
                    this.B1.setTag(1);
                    if (!this.W3 && (nr0Var = this.G2) != null) {
                        this.W3 = true;
                        String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                        nr0Var.j();
                        nr0Var.F = string2;
                        org.telegram.ui.Components.lr0 lr0Var = nr0Var.f27398a[0];
                        if (string2 != null) {
                            lr0Var.e.l(string2, false);
                        }
                        org.telegram.ui.Components.kr0 kr0Var = new org.telegram.ui.Components.kr0(nr0Var, 0);
                        nr0Var.G = kr0Var;
                        AndroidUtilities.runOnUIThread(kr0Var, 1000L);
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
                this.B1.O1();
                if (this.Q3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]));
                } else {
                    this.actionBar.J(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.es.h);
                }
            }
            this.Q3 = arrayList.isEmpty();
        } else if (this.R0 == 10) {
            a4(arrayList.isEmpty());
        }
    }

    public final void Z3(boolean z10) {
        int i10;
        boolean z11;
        this.actionBar.s();
        this.I2.clear();
        org.telegram.ui.ActionBar.f2 f2Var = this.f42005e1;
        boolean z12 = true;
        if (f2Var != null) {
            f2Var.c(0.0f, true);
        }
        ww wwVar = this.f42110z0;
        if (wwVar != null) {
            wwVar.b(org.telegram.ui.ActionBar.g6.K8, org.telegram.ui.ActionBar.g6.I8, org.telegram.ui.ActionBar.g6.J8, org.telegram.ui.ActionBar.g6.L8, org.telegram.ui.ActionBar.g6.f19601d6);
        }
        ValueAnimator valueAnimator = this.f42093v3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f42093v3 = null;
        }
        if (this.f42088u3 == 0.0f) {
            return;
        }
        A4(-R3());
        boolean z13 = false;
        int i11 = 0;
        while (true) {
            xy[] xyVarArr = this.f42004e0;
            if (i11 >= xyVarArr.length) {
                break;
            }
            xy xyVar = xyVarArr[i11];
            if (xyVar != null) {
                xyVar.f41679a.I0(true);
            }
            i11++;
        }
        if (this.K) {
            i10 = 81;
        } else {
            i10 = 0;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp(i10 + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f42088u3, 0.0f);
        this.f42093v3 = ofFloat;
        ofFloat.addUpdateListener(new cw(this, max, 1));
        this.f42093v3.addListener(new cy(this, max, 0));
        this.f42093v3.setInterpolator(org.telegram.ui.Components.es.f24465f);
        this.f42093v3.setDuration(200L);
        this.f42093v3.start();
        this.Y0 = false;
        ArrayList arrayList = this.f41984a1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i12);
                k10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
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
            getMessagesController().reorderPinnedDialogs(this.W2, null, 0L);
            z11 = 0;
            this.Z0 = false;
        } else {
            z11 = 0;
        }
        R4(true);
        if (this.f42004e0 != null) {
            int i13 = z11;
            while (true) {
                xy[] xyVarArr2 = this.f42004e0;
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
        e5(i15 | i14, true);
    }

    public final void Z4() {
        org.telegram.ui.Components.nr0 nr0Var = this.G2;
        if (nr0Var != null) {
            int i10 = this.currentAccount;
            nr0Var.h(i10);
            nr0Var.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
            ArrayList arrayList = nr0Var.f27401f;
            arrayList.clear();
            ArrayList arrayList2 = this.I2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            org.telegram.ui.Components.lr0 lr0Var = nr0Var.f27398a[0];
            if (nr0Var.f27399b == 1) {
                lr0Var.d.l(nr0Var.c(lr0Var), false);
            }
        }
    }

    public final void a4(boolean z10) {
        if (this.G3.c()) {
            z10 = true;
        }
        if (!z10 || !this.f41990b2) {
            this.U3 = z10;
            W4(true);
            if (z10) {
                di.d4 d4Var = this.f42058p0;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                di.d4 d4Var2 = this.f42063q0;
                if (d4Var2 != null) {
                    d4Var2.e(true);
                }
            }
        }
    }

    public final void a5(boolean z10) {
        boolean z11;
        if (this.f42040l0 == null) {
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

    public final void b5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.q5 q5Var;
        px pxVar = this.E0;
        org.telegram.ui.Components.q5 q5Var2 = null;
        if (pxVar != null && (q5Var = pxVar.f3816a0) != null && pxVar.f3835q0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                q5Var.j(emojiStatusDocumentId.longValue(), z10);
                q5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z10);
            } else if (user != null && MessagesController.getInstance(pxVar.f3823f).isPremiumUser(user)) {
                if (pxVar.N0 == null) {
                    pxVar.N0 = pxVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    pxVar.N0 = new org.telegram.ui.Components.r5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), pxVar.N0);
                }
                pxVar.N0.setColorFilter(new PorterDuffColorFilter(pxVar.f(org.telegram.ui.ActionBar.g6.f20015zh), PorterDuff.Mode.MULTIPLY));
                q5Var.g(pxVar.N0, z10);
                q5Var.m(false, z10);
            } else {
                q5Var.g(null, z10);
                q5Var.m(false, z10);
            }
            q5Var.k(Integer.valueOf(pxVar.f(org.telegram.ui.ActionBar.g6.f20015zh)));
            pxVar.W.invalidate();
        }
        if (this.E3 != null && this.actionBar != null) {
            Long emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(user);
            this.C3 = null;
            if (emojiStatusDocumentId2 != null) {
                boolean z11 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
                this.E3.j(emojiStatusDocumentId2.longValue(), z10);
                this.E3.m(z11, z10);
                if (z11) {
                    this.C3 = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
                }
                this.actionBar.setRightDrawableOnClick(new zv(this, 2));
                r71.t(this.currentAccount);
            } else if (user != null && MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
                if (this.L3 == null) {
                    this.L3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    this.L3 = new org.telegram.ui.Components.r5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.L3);
                }
                this.L3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f20015zh), PorterDuff.Mode.MULTIPLY));
                this.E3.g(this.L3, z10);
                this.E3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(new zv(this, 3));
                r71.t(this.currentAccount);
            } else {
                this.E3.g(null, z10);
                this.E3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.q5 q5Var3 = this.E3;
            int i10 = org.telegram.ui.ActionBar.g6.f20015zh;
            q5Var3.k(Integer.valueOf(getThemedColor(i10)));
            org.telegram.ui.Cells.o oVar = this.F3;
            if (oVar != null) {
                oVar.setColor(getThemedColor(i10));
            }
            ux uxVar = this.M0;
            if (uxVar != null && (uxVar.getContentView() instanceof r71)) {
                org.telegram.ui.ActionBar.h5 titleTextView = this.actionBar.getTitleTextView();
                r71 r71Var = (r71) this.M0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.q5 q5Var4 = this.E3;
                    if (rightDrawable == q5Var4) {
                        q5Var2 = q5Var4;
                    }
                }
                r71Var.y(q5Var2, titleTextView);
            }
        }
    }

    public final boolean c4() {
        if (this.W2 == 1) {
            return true;
        }
        return false;
    }

    public final void c5() {
        di.d4 d4Var;
        boolean storiesEnabled = getMessagesController().storiesEnabled();
        if (this.O3 != storiesEnabled) {
            V4();
            if (!this.O3 && storiesEnabled && (d4Var = this.f42058p0) != null) {
                d4Var.u();
            }
            this.O3 = storiesEnabled;
        }
        org.telegram.ui.Components.l20 l20Var = this.f42080t0;
        if (l20Var == null) {
            return;
        }
        if (this.R0 == 10) {
            l20Var.setImageResource(R.drawable.floating_check);
            this.f42080t0.setContentDescription(LocaleController.getString(R.string.Done));
            return;
        }
        l20Var.setImageResource(R.drawable.filled_fab_compose_32);
        this.f42080t0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
    }

    @Override
    public final boolean canBeginSlide() {
        ww wwVar;
        if (!this.G3.c()) {
            if (this.R0 == 3 && (wwVar = this.f42110z0) != null && wwVar.getVisibility() == 0 && this.f42110z0.K > 0) {
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
        b8Var.C(getThemedColor(org.telegram.ui.ActionBar.g6.f19899t8), false);
        b8Var.C(getThemedColor(org.telegram.ui.ActionBar.g6.f20007z8), true);
        b8Var.D(getThemedColor(org.telegram.ui.ActionBar.g6.f19935v8), false);
        b8Var.D(getThemedColor(org.telegram.ui.ActionBar.g6.f19990y8), true);
        b8Var.k();
        b8Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        b8Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.W2 == 0 || c4())) {
            return b8Var;
        }
        b8Var.setOccupyStatusBar(false);
        return b8Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.createView(android.content.Context):android.view.View");
    }

    public final boolean d4(long j10) {
        if (j10 < 0) {
            return false;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f19063id);
        if ((topics != null && !topics.isEmpty()) || !MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f19063id)) {
            return false;
        }
        return true;
    }

    public final void d5(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        boolean z12;
        bi.x8 V3;
        ArrayList arrayList;
        boolean z13;
        boolean z14;
        int i10;
        float f7;
        float f10;
        if (this.E0 != null && this.I == null) {
            sx sxVar = this.G3;
            if ((sxVar == null || !sxVar.c()) && !this.f42066q3 && (kVar = this.actionBar) != null && !kVar.t() && !this.f42041l2) {
                di.kc kcVar = di.kc.F2;
                int i11 = 0;
                if ((kcVar != null && kcVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
                    z10 = false;
                }
                if (!c4() && V3().G()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.Y2 != 0) {
                    z12 = false;
                } else if (c4()) {
                    z12 = !V3().h.isEmpty();
                } else {
                    if (!z11 && (((arrayList = (V3 = V3()).f3970g) != null && arrayList.size() > 0) || V3.H())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z11 = V3().G();
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
                        this.J.addListener(new org.telegram.ui.Components.v61(this, 21));
                        this.J.setDuration(200L);
                        this.J.setInterpolator(org.telegram.ui.Components.es.f24465f);
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
                            f11 = R3();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.I = ofFloat2;
                        ofFloat2.addUpdateListener(new hy(this, f13, z12, f11));
                        this.I.addListener(new yx(this, z12, 2));
                        this.I.setDuration(200L);
                        this.I.setInterpolator(org.telegram.ui.Components.es.f24465f);
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
                        A4(0.0f);
                    } else {
                        this.y3 = -AndroidUtilities.dp(81.0f);
                        A4(-R3());
                    }
                    while (true) {
                        xy[] xyVarArr = this.f42004e0;
                        if (i11 >= xyVarArr.length) {
                            break;
                        }
                        xy xyVar = xyVarArr[i11];
                        if (xyVar != null) {
                            xyVar.f41679a.requestLayout();
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

    public final boolean e4(TLRPC.Dialog dialog) {
        char c10;
        if (dialog == null) {
            return false;
        }
        int i10 = this.f42004e0[0].f41685s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.t() || this.actionBar.u(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f42004e0[0].f41685s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            dialogFilter = dialogFilterArr[c10];
        }
        if (dialogFilter != null) {
            if (dialogFilter.pinnedDialogs.indexOfKey(dialog.f18920id) < 0) {
                return false;
            }
            return true;
        }
        return dialog.pinned;
    }

    public final void e5(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.e5(int, boolean):void");
    }

    public final boolean f3(long j10, View view) {
        if (this.f42041l2 && getMessagesController().isForum(j10)) {
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

    public final boolean f4() {
        if (this.C2 == null && this.f42050n2 == null) {
            return true;
        }
        return false;
    }

    public final boolean f5(long j10) {
        TLRPC.Chat chat;
        ix ixVar;
        if ((this.S0 <= 1 && ((ixVar = this.B1) == null || ixVar.getVisibility() != 0 || TextUtils.isEmpty(this.B1.getFieldText()))) || !DialogObject.isChatDialog(j10) || (chat = getMessagesController().getChat(Long.valueOf(-j10))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.l80 l80Var = this.L0;
        if (l80Var != null) {
            l80Var.u();
        }
    }

    public final void g3(hg.p0 p0Var) {
        iy iyVar;
        if (this.f42066q3 && (iyVar = this.C0) != null) {
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
            this.X.f27510r.getText().clear();
            U4(true, null, null, false, true);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.x4 getBackButtonState() {
        if (!c4() && !this.G3.f39277f) {
            return org.telegram.ui.ActionBar.x4.f20514b;
        }
        return org.telegram.ui.ActionBar.x4.f20513a;
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        int i10;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X3, 1.0f);
            this.f41986a4 = ofFloat;
            return ofFloat;
        }
        if (getLayoutContainer() != null && getLayoutContainer().getMeasuredWidth() > 0) {
            i10 = (int) Utilities.clamp((200.0f / getLayoutContainer().getMeasuredWidth()) * f7, 200.0f, 80.0f);
        } else {
            i10 = 150;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.X3, 1.0f);
        this.f41986a4 = ofFloat2;
        ofFloat2.addUpdateListener(new wv(this, 2));
        this.f41986a4.setInterpolator(org.telegram.ui.Components.es.f24466g);
        this.f41986a4.setDuration(i10);
        this.f41986a4.start();
        return this.f41986a4;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.getThemeDescriptions():java.util.ArrayList");
    }

    public final void h3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.W2 == 0 && this.Y2 == 0 && Build.VERSION.SDK_INT >= 33 && kk0.o(parentActivity)) {
                if (z10) {
                    showDialog(new kk0(parentActivity, !org.telegram.ui.Components.df0.a(), new kw(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().syncContacts && this.U1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z10) {
                    org.telegram.ui.ActionBar.a2 a2Var = org.telegram.ui.Components.g5.v(parentActivity, new dw(this, 1)).f19248a;
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
                    H4();
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

    public final void h4(long j10) {
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
                    h4(dialog2.f18920id);
                }
                return;
            }
            return;
        }
        int i11 = this.f42004e0[0].f41685s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i11 == 7 || i11 == 8) && (!this.actionBar.t() || this.actionBar.u(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f42004e0[0].f41685s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            dialogFilter = dialogFilterArr[c10];
        }
        this.f42113z3 = 2;
        int i12 = -1;
        if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && !dialogFilter.alwaysShow(this.currentAccount, dialog)) {
            y4(true, true);
            m3();
            if (this.R1 != null) {
                int i13 = 0;
                while (true) {
                    if (i13 >= this.R1.size()) {
                        break;
                    } else if (((TLRPC.Dialog) this.R1.get(i13)).f18920id == j10) {
                        i12 = i13;
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i12 < 0) {
                    y4(false, false);
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
            this.f42004e0[0].f41687x.D();
            this.f42004e0[0].q(true);
        }
    }

    public final void i3(CharSequence charSequence) {
        int i10;
        if (this.B1 != null) {
            if (this.D2 == null && this.E2 == null && this.F2 == null) {
                return;
            }
            if (this.G2 == null) {
                org.telegram.ui.Components.nr0 nr0Var = new org.telegram.ui.Components.nr0(getParentActivity(), getResourceProvider());
                this.G2 = nr0Var;
                nr0Var.setLayoutClickListener(new zv(this, 0));
                this.G2.setOnModeChangeListener(new aw(this, 0));
                ix ixVar = this.B1;
                org.telegram.ui.Components.nr0 nr0Var2 = this.G2;
                if (nr0Var2 == null) {
                    ixVar.getClass();
                } else {
                    ixVar.G1 = nr0Var2;
                    ixVar.addView(nr0Var2, 0, w7.z5.e(-1, 48, 51));
                    ixVar.f22592g3 = false;
                    ixVar.L();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G2.getLayoutParams();
                layoutParams.rightMargin = -this.B1.getPaddingRight();
                this.G2.setLayoutParams(layoutParams);
            }
            if (Y3()) {
                this.G2.i(this.currentAccount, this.D2);
            } else {
                String str = this.E2;
                if (str != null) {
                    org.telegram.ui.Components.nr0 nr0Var3 = this.G2;
                    nr0Var3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        nr0Var3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.F2;
                    if (charSequence2 != null) {
                        org.telegram.ui.Components.nr0 nr0Var4 = this.G2;
                        nr0Var4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            nr0Var4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.B1.setFieldText(charSequence);
            }
            ix ixVar2 = this.B1;
            if (Y3()) {
                i10 = R.string.AddCaption;
            } else {
                i10 = R.string.ShareComment;
            }
            ixVar2.setOverrideHint(LocaleController.getString(i10));
            t3();
            if (this.G2.getMode() != 0) {
                this.B1.u1(false, false);
            }
            Z4();
        }
    }

    public final boolean i4(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.User r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.i4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    @Override
    public final boolean isLightStatusBar() {
        sx sxVar;
        if (!this.f42032j2 && (sxVar = this.G3) != null && sxVar.getFragment() != null) {
            return this.G3.getFragment().isLightStatusBar();
        }
        if (i0.a.f(getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6)) > 0.699999988079071d) {
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

    public final boolean j4(TLRPC.User user) {
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

    public final int k3() {
        if (this.B1 != null) {
            return (int) (this.f42108y1.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        } else if (this.Y2 != 0) {
            return AndroidUtilities.dp(72.0f) + this.f42019g4;
        } else {
            return this.f42019g4 + this.f42029i4;
        }
    }

    public final void k4(View view) {
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

    public final boolean l3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.I2;
            if (i10 < arrayList.size()) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-((Long) arrayList.get(i10)).longValue()));
                if (chat != null && !ChatObject.canSendDocument(chat)) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    public final void l4(android.view.View r25, int r26, s4.g0 r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.l4(android.view.View, int, s4.g0):void");
    }

    public final void m3() {
        AndroidUtilities.runOnUIThread(new uv(this, 2), 300L);
    }

    public final boolean m4(View view, int i10, float f7, org.telegram.ui.Components.lm0 lm0Var) {
        org.telegram.ui.Components.so0 so0Var;
        long j10;
        org.telegram.ui.Components.so0 so0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.a3) && lm0Var.j(i10) != 21) {
            if (!this.actionBar.t() && !AndroidUtilities.isTablet() && !this.f42041l2 && (view instanceof org.telegram.ui.Cells.s2)) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (!getMessagesController().isForum(s2Var.getDialogId()) && !this.G3.c() && s2Var.S(f7)) {
                    return F4(s2Var);
                }
            }
            sx sxVar = this.G3;
            if (sxVar == null || !sxVar.c()) {
                iy iyVar = this.C0;
                boolean z10 = true;
                if (iyVar != null && lm0Var == (so0Var2 = iyVar.f31618b0)) {
                    Object J = so0Var2.J(i10);
                    if (!this.C0.f31618b0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                        a2Var.R = string;
                        if (J instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) J;
                            if (chat.monoforum) {
                                a2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, og.d.i(chat, this.currentAccount, false));
                            } else {
                                a2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            makeEncryptedDialogId = -chat.f18916id;
                        } else if (J instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) J;
                            if (user.f19063id == getUserConfig().clientUserId) {
                                a2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                a2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            makeEncryptedDialogId = user.f19063id;
                        } else if (J instanceof TLRPC.EncryptedChat) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) J).user_id));
                            a2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.f18924id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new bi.p1(this, makeEncryptedDialogId, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(a2Var);
                        TextView textView = (TextView) a2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19839q7));
                        }
                        return true;
                    }
                }
                iy iyVar2 = this.C0;
                if (iyVar2 != null && lm0Var == (so0Var = iyVar2.f31618b0)) {
                    if (this.f42041l2) {
                        l4(view, i10, lm0Var);
                        return false;
                    }
                    if ((view instanceof org.telegram.ui.Cells.i6) && !so0Var.O(i10)) {
                        j10 = ((org.telegram.ui.Cells.i6) view).getDialogId();
                    } else {
                        j10 = 0;
                    }
                    if (j10 != 0) {
                        K4(j10, view);
                        return true;
                    }
                } else {
                    Object I = ((hg.m) lm0Var).I(i10);
                    if (I instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) I;
                        if (this.f42041l2) {
                            if ((this.R0 == 3 || G3()) && f5(dialog.f18920id)) {
                                if (this.R0 == 1 && G3() && this.f42044m2 && getMessagesController().isForum(dialog.f18920id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f18920id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.R0 != 1) {
                                        z10 = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z10);
                                    bundle.putBoolean("quote", this.O0);
                                    bundle.putBoolean("reply_to", this.N0);
                                    kg1 kg1Var = new kg1(bundle);
                                    kg1Var.L0 = this;
                                    presentFragment(kg1Var);
                                    return false;
                                }
                                f3(dialog.f18920id, view);
                                Y4();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            k4(view);
                            return false;
                        } else if (!this.actionBar.t() || !e4(dialog)) {
                            K4(dialog.f18920id, view);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean n3(long j10) {
        int i10;
        int i11 = this.R0;
        if (i11 != 15 && i11 != 16 && this.f42022h2 == null && this.f42077s2) {
            if (DialogObject.isChatDialog(j10)) {
                long j11 = -j10;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j11));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    if (this.f42065q2 || !ChatObject.isCanWriteToChannel(j11, this.currentAccount) || (i10 = this.T0) == 2 || i10 == 3) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.SendMessageTitle);
                        int i12 = this.T0;
                        if (i12 == 3) {
                            alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.TodoCantForward);
                        } else if (i12 == 2) {
                            alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.PublicPollCantForward);
                        } else {
                            alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        showDialog(alertDialog$Builder.f19248a);
                        return false;
                    }
                    return true;
                }
                return true;
            } else if (DialogObject.isEncryptedDialog(j10)) {
                if (this.T0 != 0 || this.U0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.f19248a.R = LocaleController.getString(R.string.SendMessageTitle);
                    int i13 = this.T0;
                    if (i13 == 3) {
                        alertDialog$Builder2.f19248a.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i13 != 0) {
                        alertDialog$Builder2.f19248a.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        alertDialog$Builder2.f19248a.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    showDialog(alertDialog$Builder2.f19248a);
                    return false;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public final void n4(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.ActionBar.l5(25));
        org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(this, view);
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
                linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Z(getThemedColor(org.telegram.ui.ActionBar.g6.f19690i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
                k9Var.r(currentUser);
                org.telegram.ui.Components.jh0 jh0Var = new org.telegram.ui.Components.jh0(this, getParentActivity(), z10);
                linearLayout.addView(jh0Var, w7.z5.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(getParentActivity());
                if (z10) {
                    z9Var.setScaleX(0.833f);
                    z9Var.setScaleY(0.833f);
                }
                z9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                z9Var.getImageReceiver().setCurrentAccount(intValue);
                z9Var.e(currentUser, k9Var);
                jh0Var.addView(z9Var, w7.z5.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19707j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.z5.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new org.telegram.ui.Cells.sa(this, intValue, H, 12));
                H.r(linearLayout, w7.z5.n(230, 48));
            }
        }
        ShapeDrawable c02 = org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.m1(0.15f, -16777216));
        H.f26674z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        H.W(c02);
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        H.V(5);
        H.Z();
    }

    public final void o3(boolean z10) {
        hi.j jVar;
        TLRPC.ChatFull chatFull;
        boolean z11;
        org.telegram.ui.Components.xs xsVar = this.J1;
        if (xsVar != null && (jVar = this.Q1) != null && (chatFull = this.f41985a3) != null) {
            if (this.Y2 != 0 && chatFull.requests_pending > 0 && !this.f41987b.f16004f) {
                z11 = true;
            } else {
                z11 = false;
            }
            xsVar.i(jVar, z11, z10);
            this.Q1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.f41985a3.requests_pending, new Object[0]));
        }
    }

    public final void o4(int i10, long j10, TLRPC.Chat chat, boolean z10, boolean z11) {
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
        getMessagesController().checkIfFolderEmpty(this.W2);
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
                iy iyVar = this.C0;
                if (iyVar != null) {
                    iyVar.R();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.l80 l80Var = this.L0;
            if (l80Var != null) {
                if (z10) {
                    l80Var.u();
                    this.L0 = null;
                    return false;
                }
            } else {
                ww wwVar = this.f42110z0;
                if (wwVar != null && wwVar.f30377n) {
                    if (z10) {
                        wwVar.setIsEditing(false);
                        G4(false);
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
                            Z3(true);
                            return false;
                        }
                    } else if (this.f41987b.f16004f) {
                        if (z10) {
                            this.X.f27510r.getText().clear();
                            this.Y.b(false);
                            this.X.f27510r.clearFocus();
                            return false;
                        }
                    } else {
                        ww wwVar2 = this.f42110z0;
                        if (wwVar2 != null && wwVar2.getVisibility() == 0 && !this.f42023h3) {
                            ww wwVar3 = this.f42110z0;
                            if (!wwVar3.O && !this.f42045m3) {
                                ArrayList arrayList = wwVar3.h;
                                if (!arrayList.isEmpty() && wwVar3.L != ((org.telegram.ui.Components.s00) arrayList.get(0)).f28686a) {
                                    if (z10) {
                                        ww wwVar4 = this.f42110z0;
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
                    iyVar.f31618b0.R(this.W1, tLObject);
                }
                this.X1 = null;
            }
            this.V1 = false;
        }
        if (!this.K && (wwVar = this.f42110z0) != null && wwVar.getVisibility() == 0 && this.f42068r.f16004f) {
            int i10 = (int) (-this.N);
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.f42004e0[0].f41679a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f42107y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        if (!isInPreviewMode() && (abVar = this.K0) != null && abVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        z3();
        this.f42069r0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        di.d4 d4Var;
        super.onBecomeFullyVisible();
        if (c4()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z10 = globalMainSettings.getBoolean("archivehint", true);
            boolean isEmpty = P3(this.currentAccount, this.R0, this.W2, false).isEmpty();
            if (z10 && isEmpty) {
                MessagesController.getGlobalMainSettings().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                globalMainSettings.edit().putBoolean("archivehint", false).commit();
                E4();
            }
        }
        if (this.f42069r0 && !this.f42075s0 && (d4Var = this.f42058p0) != null && this.O3) {
            this.f42075s0 = true;
            this.f42069r0 = false;
            d4Var.u();
        }
        AndroidUtilities.runOnUIThread(new mw(this, 4), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.l80 l80Var = this.L0;
        if (l80Var != null) {
            l80Var.u();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.a2 a2Var;
        super.onDialogDismiss(dialog);
        if (this.W2 == 0 && this.Y2 == 0 && (a2Var = this.T1) != null && dialog == a2Var && getParentActivity() != null) {
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
            this.f42041l2 = bundle.getBoolean("onlySelect", false);
            this.f42044m2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f42065q2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.R0 = this.arguments.getInt("dialogsType", 0);
            this.O0 = this.arguments.getBoolean("quote", false);
            this.N0 = this.arguments.getBoolean("reply_to", false);
            this.P0 = this.arguments.getLong("reply_to_author", 0L);
            this.Q0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f42012f2 = this.arguments.getString("selectAlertString");
            this.f42017g2 = this.arguments.getString("selectAlertStringGroup");
            this.f42022h2 = this.arguments.getString("addToGroupAlertString");
            this.f42071r2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f42077s2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f42082t2 = this.arguments.getBoolean("afterSignup", false);
            this.W2 = this.arguments.getInt("folderId", 0);
            long j10 = this.arguments.getLong("community_id", 0L);
            this.Y2 = j10;
            if (j10 != 0) {
                this.Z2 = getMessagesController().getChat(Long.valueOf(this.Y2));
                this.f41985a3 = getMessagesController().getChatFull(this.Y2);
            }
            this.f42027i2 = this.arguments.getBoolean("resetDelegate", true);
            this.S0 = this.arguments.getInt("messagesCount", 0);
            this.T0 = this.arguments.getInt("hasPoll", 0);
            this.U0 = this.arguments.getBoolean("hasInvoice", false);
            this.f42087u2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f42087u2);
            this.arguments.getInt("otherwiseRelogin");
            this.f42092v2 = this.arguments.getBoolean("allowGroups", true);
            this.f42098w2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f42104x2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.f42109y2 = this.arguments.getBoolean("allowChannels", true);
            this.f42112z2 = this.arguments.getBoolean("allowUsers", true);
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
        this.K3 = getNotificationCenter().createObserversGroup(this);
        if (this.f42050n2 == null) {
            this.f42001d2 = getConnectionsManager().getConnectionState();
            this.K3.addGlobal(NotificationCenter.emojiLoaded);
            if (!this.f42041l2) {
                this.K3.addGlobal(NotificationCenter.closeSearchByActiveAction);
                this.K3.addGlobal(NotificationCenter.proxySettingsChanged);
                this.K3.add(NotificationCenter.filterSettingsUpdated);
                this.K3.add(NotificationCenter.dialogsUnreadCounterChanged);
            }
            this.K3.add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.dialogFiltersUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.encryptedChatUpdated).add(NotificationCenter.contactsDidLoad).add(NotificationCenter.appDidLogout).add(NotificationCenter.openedChatChanged).add(NotificationCenter.notificationsSettingsUpdated).add(NotificationCenter.messageReceivedByAck).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messageSendError).add(NotificationCenter.needReloadRecentDialogsSearch).add(NotificationCenter.replyMessagesDidLoad).add(NotificationCenter.topicsDidLoaded).add(NotificationCenter.reloadHints).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.onDownloadingFilesChanged).add(NotificationCenter.needDeleteDialog).add(NotificationCenter.folderBecomeEmpty).add(NotificationCenter.newSuggestionsAvailable).add(NotificationCenter.dialogsUnreadReactionsCounterChanged).add(NotificationCenter.dialogsUnreadPollVotesCounterChanged).add(NotificationCenter.forceImportContactsStart).add(NotificationCenter.userEmojiStatusUpdated).add(NotificationCenter.currentUserPremiumStatusChanged);
            this.K3.addGlobal(NotificationCenter.didSetPasscode);
        }
        this.K3.add(NotificationCenter.messagesDeleted).add(NotificationCenter.onDatabaseMigration).add(NotificationCenter.onDatabaseOpened).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.didClearDatabase).add(NotificationCenter.onDatabaseReset).add(NotificationCenter.storiesUpdated).add(NotificationCenter.storiesEnabledUpdate).add(NotificationCenter.unconfirmedAuthUpdate).add(NotificationCenter.premiumPromoUpdated).add(NotificationCenter.starBalanceUpdated).add(NotificationCenter.starSubscriptionsLoaded).add(NotificationCenter.communityPendingRequestsUpdate).add(NotificationCenter.communitySwitchedCollapsed).add(NotificationCenter.appConfigUpdated).add(NotificationCenter.activeAuctionsUpdated);
        if (this.R0 == 0) {
            this.K3.add(NotificationCenter.chatlistFolderUpdate);
            this.K3.add(NotificationCenter.dialogTranslate);
        }
        g4(getAccountInstance());
        bi.x8 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.f3981s) {
                ConnectionsManager.getInstance(storiesController.f3966a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new bi.k7(storiesController, 0));
            }
        }
        getMessagesController().loadPinnedDialogs(this.W2, 0L, null);
        if (this.R3 != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            gv gvVar = this.R3;
            if (gvVar.getParent() != null) {
                ((ViewGroup) gvVar.getParent()).removeView(gvVar);
            }
            this.R3 = null;
        }
        if (c4()) {
            bi.x8 storiesController2 = getMessagesController().getStoriesController();
            if (storiesController2.f3987z) {
                storiesController2.Q(true);
            }
        } else {
            getMessagesController().getStoriesController().T();
        }
        getContactsController().loadGlobalPrivacySetting();
        if (getMessagesController().savedViewAsChats) {
            getMessagesController().getSavedMessagesController().preloadDialogs(true);
        }
        if (this.Y2 != 0) {
            getMessagesController().loadFullChat(this.Y2, 0, true);
        }
        BirthdayController.getInstance(this.currentAccount).check();
        if (this.W) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.f42029i4 = i10;
        if (this.W) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f42034j4 = i11;
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.ObserversGroup observersGroup = this.K3;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.K3 = null;
        }
        ix ixVar = this.B1;
        if (ixVar != null) {
            ixVar.z0();
        }
        org.telegram.ui.Components.nr0 nr0Var = this.G2;
        if (nr0Var != null) {
            nr0Var.j();
        }
        org.telegram.ui.Components.n51 n51Var = this.H2;
        if (n51Var != null) {
            AndroidUtilities.cancelRunOnUIThread(n51Var);
            this.H2 = null;
        }
        UndoView undoView = this.f42107y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f42061p3.unlock();
        this.C2 = null;
        pb1 pb1Var = pb1.f38870b;
        if (pb1Var != null) {
            pb1Var.dismiss();
            pb1.f38870b = null;
        }
    }

    @Override
    public final void onPanTranslationUpdate(float f7) {
        if (this.f42004e0 != null) {
            this.J0 = f7;
            ix ixVar = this.B1;
            int i10 = 0;
            if (ixVar != null && ixVar.r0()) {
                this.fragmentView.setTranslationY(f7);
                while (true) {
                    xy[] xyVarArr = this.f42004e0;
                    if (i10 >= xyVarArr.length) {
                        break;
                    }
                    xyVarArr[i10].setTranslationY(0.0f);
                    i10++;
                }
                if (!this.f42041l2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.sc scVar = this.f42056o3;
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
                xy[] xyVarArr2 = this.f42004e0;
                if (i10 >= xyVarArr2.length) {
                    break;
                }
                xyVarArr2[i10].setTranslationY(f7);
                i10++;
            }
            if (!this.f42041l2) {
                this.actionBar.setTranslationY(f7);
                org.telegram.ui.Components.sc scVar2 = this.f42056o3;
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
        sx sxVar = this.G3;
        if (sxVar != null) {
            sxVar.f39279r = true;
            zx zxVar = sxVar.f39274a;
            if (zxVar != null) {
                zxVar.onPause();
            }
        }
        org.telegram.ui.Components.l80 l80Var = this.L0;
        if (l80Var != null) {
            l80Var.u();
        }
        ix ixVar = this.B1;
        if (ixVar != null) {
            ixVar.B0();
        }
        int i10 = 0;
        UndoView undoView = this.f42107y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        setBulletinDelegate(null);
        if (this.f42004e0 == null) {
            return;
        }
        while (true) {
            xy[] xyVarArr = this.f42004e0;
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
                                kk0.n();
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
                                AndroidUtilities.runOnUIThread(new mw(this, 3));
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
                H4();
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
            ArrayList arrayList = pxVar.f3845x;
            bi.x8 x8Var = pxVar.f3838s;
            x8Var.l(x8Var.f3970g);
            x8Var.l(x8Var.h);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TL_stories.PeerStories y3 = x8Var.y(((bi.r) arrayList.get(i10)).f3606c);
                if (y3 != null) {
                    x8Var.X(y3);
                }
            }
        }
        sx sxVar = this.G3;
        if (sxVar != null) {
            sxVar.f39279r = false;
            zx zxVar = sxVar.f39274a;
            if (zxVar != null) {
                zxVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (abVar = this.K0) != null && abVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.f42004e0 != null) {
            int i11 = 0;
            while (true) {
                xy[] xyVarArr = this.f42004e0;
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
        if (!this.f42041l2 && this.W2 == 0 && this.Y2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        iy iyVar = this.C0;
        if (iyVar != null && (so0Var = iyVar.f31618b0) != null) {
            so0Var.l();
        }
        if (!this.f42082t2 && getUserConfig().unacceptedTermsOfService != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.W2 == 0 && this.Y2 == 0 && this.f41996c2 && !this.f42041l2) {
            int i12 = Build.VERSION.SDK_INT;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.f41996c2 = false;
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
                if (yyVar.f42082t2 && (z11 || z13)) {
                    j10 = 4000;
                }
                AndroidUtilities.runOnUIThread(q1Var, j10);
            } else {
                yyVar = this;
            }
        } else {
            yyVar = this;
            if (!yyVar.f42041l2 && yyVar.W2 == 0 && yyVar.Y2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(10020)) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
                        alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new aw(this, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.co0(19));
                        showDialog(alertDialog$Builder.f19248a);
                    }
                } else {
                    return;
                }
            } else if (yyVar.W2 == 0 && yyVar.Y2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.g6.L5), null);
                        alertDialog$Builder2.f19248a.T = LocaleController.getString(R.string.PermissionFSILockscreen);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new aw(this, 9));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.co0(20));
                        showDialog(alertDialog$Builder2.f19248a);
                    }
                } else {
                    return;
                }
            }
        }
        H4();
        if (yyVar.f42004e0 != null) {
            int i13 = 0;
            while (true) {
                xy[] xyVarArr2 = yyVar.f42004e0;
                if (i13 >= xyVarArr2.length) {
                    break;
                }
                xy xyVar2 = xyVarArr2[i13];
                if (xyVar2.f41685s == 0 && xyVar2.v == 2 && xyVar2.f41681c.L0() == 0 && X3()) {
                    yyVar.f42004e0[i13].f41681c.h1(1, (int) yyVar.N);
                }
                if (i13 == 0) {
                    yyVar.f42004e0[i13].d.getClass();
                } else {
                    yyVar.f42004e0[i13].d.getClass();
                }
                i13++;
            }
        }
        J4();
        setBulletinDelegate(new c9(this, 4));
        if (yyVar.f42066q3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), yyVar.classGuid);
        }
        e5(0, false);
        X4(false, true);
        d5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            pb1.o(this);
        }
        z3();
        if (yyVar.f42110z0 != null && (xyVar = yyVar.f42004e0[0]) != null && (fxVar = xyVar.d) != null) {
            int i14 = fxVar.h;
            if (i14 == 7 || i14 == 8) {
                MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
                if (i14 != 7) {
                    c10 = 1;
                }
                MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                if (dialogFilter != null) {
                    yyVar.f42110z0.h(dialogFilter.localId);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f7) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.Z3 && this.f41986a4 == null) {
            D4(f7);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        di.ab abVar;
        yy yyVar;
        sx sxVar = this.G3;
        if (sxVar != null && sxVar.c()) {
            this.G3.getFragment().onTransitionAnimationEnd(z10, z11);
        } else {
            if (z10 && (abVar = this.K0) != null && abVar.getVisibility() == 0) {
                this.K0.setVisibility(8);
                this.K0.setBackground(null);
            }
            if (z10 && this.f42082t2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f31849x0.c(false);
                }
            }
        }
        if (!z10 && (yyVar = this.X2) != null) {
            yyVar.removeSelfFromStack();
        }
        z3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        sx sxVar = this.G3;
        if (sxVar != null && sxVar.c()) {
            this.G3.getFragment().onTransitionAnimationProgress(z10, f7);
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
        z3();
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        int i11;
        int i12;
        int i13 = 8;
        if (i10 == 1) {
            A3();
            C3();
            F3();
            s3();
            D3();
            oy oyVar = this.X;
            ne.b bVar = this.f41987b;
            oyVar.setBlurredBackgroundVisibility(bVar.e);
            float b10 = zf.f0.b(bVar.e);
            org.telegram.ui.Components.z9 z9Var = this.f41991b3;
            if (z9Var != null) {
                z9Var.setScaleX(b10);
                this.f41991b3.setScaleY(b10);
                this.f41991b3.setAlpha(b10);
                org.telegram.ui.Components.z9 z9Var2 = this.f41991b3;
                if (b10 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                z9Var2.setVisibility(i12);
            }
            if (this.f42090v0 != null) {
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
                this.f42090v0.setScaleX(lerp);
                this.f42090v0.setScaleY(lerp);
                this.f42090v0.setAlpha(b10);
                di.d dVar = this.f42090v0;
                int i14 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
                if (i14 > 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                dVar.setVisibility(i11);
                this.f42096w0.setAlpha(b10);
                kh.f fVar = this.f42096w0;
                if (i14 > 0) {
                    i13 = 0;
                }
                fVar.setVisibility(i13);
            }
        } else if (i10 == 2) {
            A3();
            C3();
        } else if (i10 == 3) {
            y3();
        } else if (i10 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        } else if (i10 == 5) {
            x3();
        } else if (i10 == 6) {
            A3();
            C3();
        } else if (i10 == 7) {
            t3();
        } else if (i10 == 8) {
            s3();
            D3();
        } else if (i10 == 9) {
            D3();
        }
    }

    public final void p3(xy xyVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i10;
        boolean z14;
        int L0 = xyVar.f41681c.L0();
        int N0 = xyVar.f41681c.N0();
        if (!this.f42023h3 && !this.f42045m3) {
            ww wwVar = this.f42110z0;
            if (wwVar == null || wwVar.getVisibility() != 0 || !this.f42110z0.O) {
                int abs = Math.abs(N0 - L0) + 1;
                if (N0 != -1) {
                    s4.b1 K = xyVar.f41679a.K(N0);
                    if (K != null && K.f44841f == 11) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f41990b2 = z14;
                    if (z14) {
                        a4(false);
                    }
                } else {
                    this.f41990b2 = false;
                }
                int i11 = xyVar.f41685s;
                if (i11 == 7 || i11 == 8) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                    int i12 = xyVar.h;
                    if (i12 >= 0 && i12 < dialogFilters.size() && (dialogFilters.get(xyVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= P3(this.currentAccount, xyVar.f41685s, 1, this.S1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                        boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                        boolean z15 = !isDialogsEndReached;
                        if (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        z11 = z15;
                        if ((abs <= 0 && N0 >= P3(this.currentAccount, xyVar.f41685s, this.W2, this.S1).size() - 10) || (abs == 0 && (((i10 = xyVar.f41685s) == 7 || i10 == 8) && !getMessagesController().isDialogsEndReached(this.W2)))) {
                            boolean isDialogsEndReached2 = getMessagesController().isDialogsEndReached(this.W2);
                            boolean z16 = !isDialogsEndReached2;
                            if (isDialogsEndReached2 && getMessagesController().isServerDialogsEndReached(this.W2)) {
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
                                        yyVar.getMessagesController().loadDialogs(yyVar.W2, -1, 100, z13);
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
                            yyVar.getMessagesController().loadDialogs(yyVar.W2, -1, 100, z13);
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

    public final void p4(java.util.ArrayList r42, int r43, boolean r44, boolean r45, java.util.HashSet r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.p4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.Z3 = true;
            z4(true);
            return;
        }
        this.f41986a4 = null;
        this.Z3 = false;
        z4(false);
        D4(1.0f);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.m2 m2Var) {
        boolean presentFragment = super.presentFragment(m2Var);
        if (presentFragment && this.f42004e0 != null) {
            int i10 = 0;
            while (true) {
                xy[] xyVarArr = this.f42004e0;
                if (i10 >= xyVarArr.length) {
                    break;
                }
                xyVarArr[i10].d.getClass();
                i10++;
            }
        }
        di.d4 d4Var = this.f42058p0;
        if (d4Var != null) {
            d4Var.e(true);
        }
        di.d4 d4Var2 = this.f42063q0;
        if (d4Var2 != null) {
            d4Var2.e(true);
        }
        org.telegram.ui.Components.sc.e();
        return presentFragment;
    }

    public final void q3() {
        if (this.f42004e0 != null) {
            int k32 = k3();
            int i10 = 0;
            while (true) {
                xy[] xyVarArr = this.f42004e0;
                if (i10 < xyVarArr.length) {
                    xy xyVar = xyVarArr[i10];
                    if (xyVar != null) {
                        uy uyVar = xyVar.f41679a;
                        uyVar.setPadding(0, uyVar.W2, 0, k32);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void q4(long r14, boolean r16, org.telegram.messenger.MessagesController.DialogFilter r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.q4(long, boolean, org.telegram.messenger.MessagesController$DialogFilter, int, boolean):void");
    }

    public final void r3() {
        ih.f fVar = this.f42108y1;
        if (fVar != null) {
            fVar.setBlurredBottomHeight(this.f42108y1.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void r4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.K0.setBackground(new BitmapDrawable(createBitmap));
        this.K0.setAlpha(0.0f);
        this.K0.setVisibility(0);
        z3();
    }

    public final void s3() {
        int i10;
        xy xyVar;
        boolean z10 = true;
        float Q3 = Q3(true);
        ww wwVar = this.f42110z0;
        if (wwVar != null) {
            if (wwVar.getAlpha() == Q3) {
                z10 = false;
            }
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, Q3);
            this.f42110z0.setAlpha(Q3);
            this.f42110z0.setScaleX(lerp);
            this.f42110z0.setScaleY(lerp);
            ww wwVar2 = this.f42110z0;
            if (Q3 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            wwVar2.setVisibility(i10);
            if (z10 && (xyVar = this.f42004e0[0]) != null) {
                xyVar.f41679a.requestLayout();
            }
        }
        Q4();
    }

    public final void s4(xy xyVar) {
        int i10;
        org.telegram.ui.Components.f10 f10Var;
        if (xyVar.getVisibility() != 0) {
            return;
        }
        int i11 = xyVar.d.v;
        if (xyVar.f41685s == 0 && X3() && xyVar.f41679a.getChildCount() == 0 && xyVar.v == 2) {
            ((s4.b0) xyVar.f41679a.getLayoutManager()).h1(1, (int) this.N);
        }
        xyVar.d.getClass();
        xyVar.d.U();
        int h = xyVar.d.h();
        if (h == 1 && i11 == 1 && xyVar.d.j(0) == 5) {
            xyVar.q(true);
        } else {
            xyVar.q(false);
            if (h > i11 && (i10 = this.R0) != 11 && i10 != 12 && i10 != 13) {
                xyVar.f41688y.b(i11);
            }
        }
        try {
            uy uyVar = xyVar.f41679a;
            if (this.W2 == 0 && this.Y2 == 0) {
                f10Var = xyVar.f41686w;
            } else {
                f10Var = null;
            }
            uyVar.setEmptyView(f10Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
        p3(xyVar);
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
        W4(true);
        S4();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r6, int r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    @Override
    public final void t() {
        v4(true, true);
    }

    public final void t3() {
        int i10;
        int i11;
        float f7 = this.f42047n.e;
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
        ih.f fVar = this.f42108y1;
        if (fVar != null) {
            fVar.setAlpha(f7);
            ih.f fVar2 = this.f42108y1;
            int i13 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            fVar2.setVisibility(i10);
            this.f42108y1.getFadeView().setAlpha(f7);
            View fadeView = this.f42108y1.getFadeView();
            if (i13 > 0) {
                i12 = 0;
            }
            fadeView.setVisibility(i12);
        }
    }

    public final void t4() {
        boolean z10;
        float f7 = 0.0f;
        if (this.N != 0.0f && !(z10 = this.K)) {
            if (z10) {
                f7 = -S3();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.H3, f7));
            animatorSet.setInterpolator(org.telegram.ui.Components.es.f24465f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    public final void u3() {
        if (this.actionBar == null) {
            return;
        }
        org.telegram.ui.Components.l20.d(this.actionBar.getBackButton(), Math.max(this.f42088u3, (1.0f - this.f41987b.e) * (1.0f - T3()) * (1.0f - this.f41993c.e)));
    }

    public final void u4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.u4(int):void");
    }

    public final void v3() {
        float f7;
        if (this.f42025i0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.l20.d(this.f42015g0, com.google.android.gms.internal.play_billing.k3.C(f7, 1.0f - this.f41987b.e, 1.0f - T3(), 1.0f - this.f41993c.e));
    }

    public final void v4(boolean z10, boolean z11) {
        int i10;
        int i11;
        sx sxVar = this.G3;
        if (sxVar != null && sxVar.c()) {
            return;
        }
        if (this.f42004e0[0].f41685s == 0 && X3() && this.f42004e0[0].v == 2) {
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
            org.telegram.ui.Components.pl0 pl0Var = this.f42004e0[0].f41684r;
            pl0Var.f28051b = 1;
            pl0Var.d(i10, i11, false, false);
            t4();
            return;
        }
        this.f42004e0[0].f41681c.h1(i10, i11);
        t4();
    }

    public final void w3() {
        float f7;
        if (SharedConfig.passcodeHash.isEmpty()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.l20.d(this.f42010f0, com.google.android.gms.internal.play_billing.k3.C(f7, 1.0f - this.f41987b.e, 1.0f - T3(), 1.0f - this.f41993c.e));
    }

    public final void w4(String str, boolean z10) {
        M4(true, false, true, false);
        oy oyVar = this.X;
        if (oyVar != null) {
            oyVar.f27510r.setText(str);
            this.X.f27510r.setSelection(str.length());
        }
    }

    public final void x3() {
        float f7;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.l20.d(this.f42030j0, com.google.android.gms.internal.play_billing.k3.C(f7, this.f42009f.e, 1.0f - T3(), 1.0f - this.f41993c.e));
        px pxVar = this.E0;
        if (pxVar != null) {
            pxVar.invalidate();
        }
    }

    public final void x4(float f7) {
        xy[] xyVarArr;
        this.f41994c0 = f7;
        for (xy xyVar : this.f42004e0) {
            uy uyVar = xyVar.f41679a;
            for (int i10 = 0; i10 < uyVar.getChildCount(); i10++) {
                View childAt = uyVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= xyVar.d.f10666f + 1) {
                    childAt.setAlpha(f7);
                }
            }
        }
    }

    public final void y3() {
        org.telegram.ui.Components.l20.d(this.f42040l0, com.google.android.gms.internal.play_billing.k3.C(this.f41987b.e, 1.0f - T3(), 1.0f - this.f41993c.e, this.d.e));
    }

    public final void y4(boolean z10, boolean z11) {
        if (this.f42004e0 != null && this.S1 != z10) {
            if (z10) {
                this.R1 = new ArrayList(P3(this.currentAccount, this.f42004e0[0].f41685s, this.W2, false));
            } else {
                this.R1 = null;
            }
            this.S1 = z10;
            xy xyVar = this.f42004e0[0];
            xyVar.d.G = z10;
            if (!z10 && z11) {
                if (xyVar.f41679a.b0()) {
                    this.f42004e0[0].f41679a.post(new mw(this, 9));
                } else {
                    this.f42004e0[0].d.l();
                }
            }
        }
    }

    @Override
    public final gh.d z() {
        return this.f42052n4;
    }

    public final void z3() {
        boolean z10;
        di.ab abVar;
        if (!this.f42032j2 && ((abVar = this.K0) == null || abVar.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        gh0 gh0Var = this.J3;
        if (gh0Var != null) {
            gh0Var.f36218a.v.a(z10, true);
        }
    }

    public final void z4(boolean z10) {
        xy xyVar;
        if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
            if (z10) {
                xy[] xyVarArr = this.f42004e0;
                if (xyVarArr != null && (xyVar = xyVarArr[0]) != null) {
                    xyVar.setLayerType(2, null);
                    this.f42004e0[0].setClipChildren(false);
                    this.f42004e0[0].setClipToPadding(false);
                    this.f42004e0[0].f41679a.setClipChildren(false);
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
            if (this.f42004e0 != null) {
                int i10 = 0;
                while (true) {
                    xy[] xyVarArr2 = this.f42004e0;
                    if (i10 >= xyVarArr2.length) {
                        break;
                    }
                    xy xyVar2 = xyVarArr2[i10];
                    if (xyVar2 != null) {
                        xyVar2.setLayerType(0, null);
                        xyVar2.setClipChildren(true);
                        xyVar2.setClipToPadding(true);
                        xyVar2.f41679a.setClipChildren(true);
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
}
