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
public class wy extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, lg.b, le.d, eh0 {
    public static float A4;
    public static boolean f38406x4;
    public static final boolean[] f38407y4 = new boolean[4];
    public static final org.telegram.ui.Components.sr0 f38408z4 = new org.telegram.ui.Components.sr0(3);
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public gx B1;
    public boolean B2;
    public Long B3;
    public gy C0;
    public hi.b2 C1;
    public qy C2;
    public Drawable C3;
    public org.telegram.ui.Components.av0 D0;
    public org.telegram.ui.ActionBar.w0 D1;
    public ArrayList D2;
    public org.telegram.ui.Components.n5 D3;
    public boolean E;
    public nx E0;
    public final TextPaint E1;
    public String E2;
    public org.telegram.ui.Cells.o E3;
    public boolean F;
    public org.telegram.ui.Components.os F0;
    public fx F1;
    public CharSequence F2;
    public qx F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public FrameLayout G1;
    public org.telegram.ui.Components.xq0 G2;
    public final ex G3;
    public long H;
    public float H0;
    public fx H1;
    public uv H2;
    public final ex H3;
    public ValueAnimator I;
    public float I0;
    public FrameLayout I1;
    public final ArrayList I2;
    public ch0 I3;
    public ValueAnimator J;
    public float J0;
    public org.telegram.ui.Components.qs J1;
    public boolean J2;
    public NotificationCenter.ObserversGroup J3;
    public boolean K;
    public bi.nc K0;
    public org.telegram.ui.Components.ps K1;
    public int K2;
    public NotificationCenter.ObserversGroup K3;
    public boolean L;
    public org.telegram.ui.Components.w70 L0;
    public org.telegram.ui.Cells.m L1;
    public int L2;
    public Drawable L3;
    public boolean M;
    public sx M0;
    public org.telegram.ui.Cells.z2 M1;
    public int M2;
    public int M3;
    public float N;
    public boolean N0;
    public org.telegram.ui.Cells.ya N1;
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
    public fi.j Q1;
    public int Q2;
    public boolean Q3;
    public boolean R;
    public int R0;
    public ArrayList R1;
    public int R2;
    public dv R3;
    public org.telegram.ui.Components.pc S;
    public int S0;
    public boolean S1;
    public int S2;
    public String S3;
    public float T;
    public int T0;
    public org.telegram.ui.ActionBar.d2 T1;
    public int T2;
    public ArrayList T3;
    public boolean U;
    public boolean U0;
    public boolean U1;
    public boolean U2;
    public boolean U3;
    public boolean V;
    public org.telegram.ui.Components.jd0 V0;
    public boolean V1;
    public int V2;
    public CharSequence V3;
    public boolean W;
    public org.telegram.ui.Cells.r2 W0;
    public long W1;
    public wy W2;
    public boolean W3;
    public my X;
    public org.telegram.ui.Cells.r2 X0;
    public TLObject X1;
    public long X2;
    public float X3;
    public xf.h0 Y;
    public boolean Y0;
    public int Y1;
    public TLRPC.Chat Y2;
    public boolean Y3;
    public y41 Z;
    public boolean Z0;
    public int Z1;
    public TLRPC.ChatFull Z2;
    public boolean Z3;
    public final int f38409a;
    public org.telegram.ui.Components.u81 f38410a0;
    public final ArrayList f38411a1;
    public boolean a2;
    public org.telegram.ui.Components.w9 f38412a3;
    public ValueAnimator f38413a4;
    public final le.b f38414b;
    public fg.s0 f38415b0;
    public boolean f38416b1;
    public boolean f38417b2;
    public org.telegram.ui.Components.g9 f38418b3;
    public org.telegram.ui.Components.e50 f38419b4;
    public final le.b f38420c;
    public float f38421c0;
    public boolean f38422c1;
    public boolean f38423c2;
    public long f38424c3;
    public TLRPC.FileLocation f38425c4;
    public final le.b d;
    public ValueAnimator f38426d0;
    public boolean f38427d1;
    public int f38428d2;
    public boolean f38429d3;
    public TLRPC.FileLocation f38430d4;
    public final le.b e;
    public vy[] f38431e0;
    public org.telegram.ui.ActionBar.i2 f38432e1;
    public boolean f38433e2;
    public boolean f38434e3;
    public org.telegram.ui.Components.pc f38435e4;
    public final le.b f38436f;
    public org.telegram.ui.ActionBar.w0 f38437f0;
    public final Paint f38438f1;
    public String f38439f2;
    public AnimatorSet f38440f3;
    public int f38441f4;
    public org.telegram.ui.ActionBar.w0 f38442g0;
    public ImageView f38443g1;
    public String f38444g2;
    public boolean f38445g3;
    public int f38446g4;
    public final le.b h;
    public yy f38447h0;
    public NumberTextView f38448h1;
    public String f38449h2;
    public boolean f38450h3;
    public int f38451h4;
    public boolean f38452i0;
    public final ArrayList f38453i1;
    public boolean f38454i2;
    public float f38455i3;
    public int f38456i4;
    public org.telegram.ui.ActionBar.w0 f38457j0;
    public org.telegram.ui.ActionBar.w0 f38458j1;
    public boolean f38459j2;
    public boolean j3;
    public int f38460j4;
    public org.telegram.ui.ActionBar.w0 f38461k0;
    public org.telegram.ui.ActionBar.w0 f38462k1;
    public boolean f38463k2;
    public int f38464k3;
    public gh.k f38465k4;
    public org.telegram.ui.ActionBar.w0 f38466l0;
    public org.telegram.ui.ActionBar.w0 l1;
    public boolean f38467l2;
    public boolean f38468l3;
    public final zg.e l4;
    public org.telegram.ui.ActionBar.w0 m0;
    public org.telegram.ui.ActionBar.w0 f38469m1;
    public boolean f38470m2;
    public boolean f38471m3;
    public final eh.d f38472m4;
    public final le.b f38473n;
    public org.telegram.ui.Components.pi0 f38474n0;
    public org.telegram.ui.ActionBar.g1 f38475n1;
    public String f38476n2;
    public org.telegram.ui.Components.pc f38477n3;
    public final eh.d f38478n4;
    public org.telegram.ui.ActionBar.g1 f38479o0;
    public org.telegram.ui.ActionBar.g1 f38480o1;
    public String f38481o2;
    public final AnimationNotificationsLocker f38482o3;
    public final eh.c f38483o4;
    public bi.x4 f38484p0;
    public org.telegram.ui.ActionBar.g1 f38485p1;
    public final MessagesStorage.TopicKey f38486p2;
    public boolean f38487p3;
    public final zg.a f38488p4;
    public bi.x4 f38489q0;
    public org.telegram.ui.ActionBar.g1 f38490q1;
    public boolean f38491q2;
    public boolean f38492q3;
    public final zg.a f38493q4;
    public final le.b f38494r;
    public boolean f38495r0;
    public org.telegram.ui.ActionBar.g1 f38496r1;
    public boolean f38497r2;
    public boolean f38498r3;
    public final zg.a f38499r4;
    public final le.b f38500s;
    public boolean f38501s0;
    public org.telegram.ui.ActionBar.g1 f38502s1;
    public boolean f38503s2;
    public boolean f38504s3;
    public final zg.a f38505s4;
    public org.telegram.ui.Components.h20 f38506t0;
    public org.telegram.ui.ActionBar.g1 f38507t1;
    public boolean f38508t2;
    public float f38509t3;
    public lw f38510t4;
    public org.telegram.ui.Components.h20 f38511u0;
    public float f38512u1;
    public boolean f38513u2;
    public ValueAnimator f38514u3;
    public final ArrayList f38515u4;
    public final oh.i v;
    public bi.d f38516v0;
    public float f38517v1;
    public boolean f38518v2;
    public float f38519v3;
    public final RectF f38520v4;
    public boolean f38521w;
    public ih.f f38522w0;
    public AnimatorSet f38523w1;
    public boolean f38524w2;
    public float f38525w3;
    public final RectF f38526w4;
    public int f38527x;
    public int f38528x0;
    public float f38529x1;
    public boolean f38530x2;
    public float f38531x3;
    public boolean f38532y;
    public final UndoView[] f38533y0;
    public gh.g f38534y1;
    public boolean f38535y2;
    public int y3;
    public uw f38536z0;
    public FrameLayout f38537z1;
    public boolean f38538z2;
    public boolean f38539z3;

    public wy(Bundle bundle) {
        super(bundle);
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f38409a = i10;
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
        this.f38414b = new le.b(1, this, wrVar, 350L, false);
        this.f38420c = new le.b(2, this, wrVar, 350L, false);
        this.d = new le.b(3, this, wrVar, 350L, false);
        this.e = new le.b(4, this, wrVar, 350L, false);
        this.f38436f = new le.b(5, this, wrVar, 350L, false);
        this.h = new le.b(6, this, wrVar, 350L, false);
        this.f38473n = new le.b(7, this, wrVar, 350L, false);
        this.f38494r = new le.b(8, this, wrVar, 350L, false);
        this.f38500s = new le.b(9, this, wrVar, 350L, false);
        this.v = new oh.i(new kw(this, 1));
        this.f38527x = -1;
        this.F = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.Q = true;
        this.f38421c0 = 1.0f;
        this.f38533y0 = new UndoView[2];
        this.f38411a1 = new ArrayList();
        this.f38438f1 = new Paint();
        this.f38453i1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.E1 = new TextPaint(1);
        this.U1 = true;
        this.f38423c2 = true;
        this.f38454i2 = true;
        this.f38486p2 = new MessagesStorage.TopicKey();
        this.I2 = new ArrayList();
        this.J2 = true;
        this.f38482o3 = new AnimationNotificationsLocker();
        this.y3 = -1;
        this.G3 = new ex(this, 0);
        this.H3 = new ex(this, 1);
        this.M3 = -4;
        this.N3 = true;
        this.O3 = true;
        this.X3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f38515u4 = arrayList;
        RectF rectF = new RectF();
        this.f38520v4 = rectF;
        RectF rectF2 = new RectF();
        this.f38526w4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        eh.c cVar = new eh.c();
        this.f38483o4 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
        if (i11 >= 31) {
            this.l4 = new zg.e(false);
            eh.d dVar = new eh.d(null);
            this.f38472m4 = dVar;
            dVar.j(new cy(this, 0));
            eh.d dVar2 = new eh.d(null);
            this.f38478n4 = dVar2;
            dVar2.j(new cy(this, 3));
            zg.a aVar = new zg.a(dVar);
            this.f38488p4 = aVar;
            aVar.f48083f = LiteMode.isEnabled(262144);
            zg.a aVar2 = new zg.a(dVar2);
            this.f38499r4 = aVar2;
            aVar2.f48083f = LiteMode.isEnabled(262144);
            this.f38493q4 = new zg.a(dVar);
        } else {
            this.l4 = null;
            this.f38472m4 = null;
            this.f38478n4 = null;
            this.f38488p4 = new zg.a(cVar);
            this.f38499r4 = new zg.a(cVar);
            this.f38493q4 = new zg.a(cVar);
        }
        this.f38505s4 = new zg.a(cVar);
    }

    public static void A0(wy wyVar) {
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        wyVar.U4();
        org.telegram.ui.Components.pc G = org.telegram.ui.Components.wc.a0(wyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f26081j = 5000;
        G.j();
    }

    public static void B0(Activity activity, Boolean bool) {
        if (!bool.booleanValue()) {
            return;
        }
        if (!org.telegram.ui.Components.me0.c()) {
            org.telegram.ui.Components.me0.h();
        } else {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
    }

    public static void C0(wy wyVar) {
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        wyVar.U4();
        org.telegram.ui.Components.pc J = org.telegram.ui.Components.wc.a0(wyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new rv(wyVar, 1));
        J.f26081j = 5000;
        J.j();
    }

    public static void D0(wy wyVar) {
        boolean z10 = true;
        try {
            ((org.telegram.ui.Components.hj0) ((org.telegram.ui.Components.g9) wyVar.M1.h.getImageReceiver().getStaticThumb()).B).H(true);
        } catch (Exception unused) {
        }
        if (wyVar.f38419b4 == null) {
            org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(0, true, true);
            wyVar.f38419b4 = e50Var;
            e50Var.H = true;
            e50Var.f22552a = wyVar;
            e50Var.f22553b = new ky(wyVar);
            wyVar.getMediaDataController().checkFeaturedStickers();
            wyVar.getMessagesController().loadSuggestedFilters();
            wyVar.getMessagesController().loadUserInfo(wyVar.getUserConfig().getCurrentUser(), true, wyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(wyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(wyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(wyVar.currentAccount).getCurrentUser();
        }
        if (user != null) {
            org.telegram.ui.Components.yi yiVar = wyVar.f38419b4.f22554c;
            if (yiVar != null) {
                yiVar.c1();
            }
            org.telegram.ui.Components.e50 e50Var2 = wyVar.f38419b4;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            e50Var2.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : false, new rv(wyVar, 0), new sv(wyVar, 0), 0);
        }
    }

    public static void E0(wy wyVar, float f7, ValueAnimator valueAnimator) {
        wyVar.f38431e0[0].setTranslationY((1.0f - wyVar.f38509t3) * f7);
        wyVar.f38509t3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < wyVar.actionBar.getChildCount(); i10++) {
            if (wyVar.actionBar.getChildAt(i10).getVisibility() == 0 && wyVar.actionBar.getChildAt(i10) != wyVar.actionBar.getActionMode() && wyVar.actionBar.getChildAt(i10) != wyVar.actionBar.getBackButton()) {
                wyVar.actionBar.getChildAt(i10).setAlpha(1.0f - wyVar.f38509t3);
            }
        }
        wyVar.E3();
        wyVar.w3();
        View view = wyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void F0(wy wyVar) {
        org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(wyVar.getParentActivity(), wyVar.resourceProvider);
        xbVar.d(R.raw.email_check_inbox, new String[0]);
        xbVar.f29000b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.pc.g(wyVar, xbVar, 2750).j();
        try {
            wyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void G0(org.telegram.ui.wy r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.G0(org.telegram.ui.wy):void");
    }

    public static void H0(wy wyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() == 1) {
            wh.p1 p1Var = new wh.p1(wyVar.getParentActivity(), wyVar.currentAccount, birthdayState.today.get(0).f17342id, null, null);
            p1Var.V(true);
            wyVar.showDialog(p1Var);
            return;
        }
        sg.p1.e0(0, birthdayState);
    }

    public static void I0(wy wyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.pc M = org.telegram.ui.Components.wc.a0(wyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
            M.f26081j = 5000;
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
            wyVar.getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (wyVar.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wyVar.getParentActivity(), 0, wyVar.resourceProvider);
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                wyVar.showDialog(alertDialog$Builder.f17528a);
                return;
            }
            return;
        }
        org.telegram.messenger.a2.o(R.string.UnknownError, org.telegram.ui.Components.wc.a0(wyVar), R.raw.error, 36);
    }

    public static void J0(wy wyVar) {
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        wyVar.U4();
    }

    public static void N2(wy wyVar, float f7) {
        float f10;
        float f11;
        int i10;
        int i11;
        float clamp = Utilities.clamp(wyVar.f38529x1 * 2.0f, 1.0f, 0.0f);
        nx nxVar = wyVar.E0;
        float f12 = (1.0f - wyVar.f38509t3) * f7 * wyVar.H0;
        float f13 = 1.0f - clamp;
        nxVar.setAlpha(f12 * f13);
        int i12 = 0;
        if (!wyVar.K && !wyVar.M) {
            if (wyVar.L) {
                wyVar.E0.setTranslationY((Math.max(wyVar.N, -wyVar.U3()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                wyVar.E0.setProgressToCollapse(1.0f);
                nx nxVar2 = wyVar.E0;
                nxVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - nxVar2.getY()));
            }
            f10 = 1.0f - wyVar.H0;
            wyVar.actionBar.setTranslationY(0.0f);
        } else {
            float clamp2 = Utilities.clamp((-wyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (wyVar.f38509t3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            wyVar.E0.setClipTop(0);
            if (!wyVar.K && wyVar.M) {
                wyVar.E0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                wyVar.E0.setProgressToCollapse(1.0f);
                f11 = wyVar.H0;
            } else {
                wyVar.E0.setTranslationY(((wyVar.T / 2.0f) + (Math.max(wyVar.N, -wyVar.U3()) + wyVar.f38519v3)) - AndroidUtilities.dp(8.0f));
                wyVar.E0.l(clamp2, !wyVar.F3.c());
                if (!wyVar.M) {
                    f11 = wyVar.H0;
                } else {
                    f10 = 1.0f - clamp3;
                    wyVar.actionBar.setTranslationY(0.0f);
                }
            }
            f10 = 1.0f - f11;
            wyVar.actionBar.setTranslationY(0.0f);
        }
        float f14 = f10 * f13;
        if (f14 != 1.0f) {
            wyVar.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
            wyVar.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
            float f15 = (0.6f * f14) + 0.4f;
            wyVar.actionBar.getTitlesContainer().setScaleY(f15);
            wyVar.actionBar.getTitlesContainer().setScaleX(f15);
            wyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            wyVar.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
            wyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f15);
            wyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f15);
            float f16 = (1.0f - wyVar.f38509t3) * f14;
            wyVar.actionBar.getTitlesContainer().setAlpha(f16);
            FrameLayout titlesContainer = wyVar.actionBar.getTitlesContainer();
            int i13 = (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            titlesContainer.setVisibility(i11);
            wyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f16);
            FrameLayout additionalSubTitleOverlayContainer = wyVar.actionBar.getAdditionalSubTitleOverlayContainer();
            if (i13 <= 0) {
                i12 = 4;
            }
            additionalSubTitleOverlayContainer.setVisibility(i12);
            return;
        }
        wyVar.actionBar.getTitlesContainer().setScaleY(1.0f);
        wyVar.actionBar.getTitlesContainer().setScaleX(1.0f);
        wyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
        wyVar.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
        float f17 = 1.0f - wyVar.f38509t3;
        wyVar.actionBar.getTitlesContainer().setAlpha(f17);
        FrameLayout titlesContainer2 = wyVar.actionBar.getTitlesContainer();
        int i14 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
        if (i14 > 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        titlesContainer2.setVisibility(i10);
        wyVar.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f17);
        FrameLayout additionalSubTitleOverlayContainer2 = wyVar.actionBar.getAdditionalSubTitleOverlayContainer();
        if (i14 <= 0) {
            i12 = 4;
        }
        additionalSubTitleOverlayContainer2.setVisibility(i12);
    }

    public static void O2(wy wyVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.f5 f5Var;
        if (wyVar.parentLayout != null && wyVar.actionBar != null) {
            float max = Math.max(wyVar.e.e, wyVar.V3());
            float f7 = 1.0f;
            float f10 = 1.0f - wyVar.f38529x1;
            float f11 = max * f10 * f10;
            int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            if (i11 != 0) {
                if (-1 >= i10) {
                    i10 = -1;
                    f7 = 0.0f;
                }
                if (f7 > 0.0f && i11 > 0 && i10 > 0 && (f5Var = wyVar.parentLayout) != null) {
                    ((ActionBarLayout) f5Var).p(canvas, (int) (f7 * 255.0f * f11), i10);
                }
            }
        }
    }

    public static org.telegram.ui.Cells.r2 Q3(vy vyVar) {
        sy syVar = vyVar.f37645a;
        for (int i10 = 0; i10 < syVar.getChildCount(); i10++) {
            View childAt = syVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                if (r2Var.P()) {
                    return r2Var;
                }
            }
        }
        return null;
    }

    public static void U(wy wyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        wyVar.U4();
    }

    public static void V(wy wyVar, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        wyVar.f38509t3 = floatValue;
        wyVar.f38431e0[0].setTranslationY((-f7) * floatValue);
        for (int i10 = 0; i10 < wyVar.actionBar.getChildCount(); i10++) {
            if (wyVar.actionBar.getChildAt(i10).getVisibility() == 0 && wyVar.actionBar.getChildAt(i10) != wyVar.actionBar.getActionMode() && wyVar.actionBar.getChildAt(i10) != wyVar.actionBar.getBackButton()) {
                wyVar.actionBar.getChildAt(i10).setAlpha(1.0f - wyVar.f38509t3);
            }
        }
        View view = wyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        wyVar.E3();
        wyVar.w3();
    }

    public static void W(wy wyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(wyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(wyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new aa(wyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void Y(wy wyVar) {
        ArrayList arrayList = wyVar.I2;
        org.telegram.ui.ActionBar.f5 f5Var = wyVar.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).y()) {
            wyVar.finishPreviewFragment();
        } else if (wyVar.R0 == 10) {
            if (wyVar.C2 != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i10)).longValue(), 0L));
                }
                wyVar.C2.v(wyVar, arrayList2, null, false, wyVar.J2, wyVar.K2, wyVar.L2, null);
            }
        } else if (MessagesController.getInstance(wyVar.currentAccount).isFrozen()) {
            b.b(wyVar.currentAccount);
        } else {
            wyVar.presentFragment(new ContactsActivity(a4.a.i("destroyAfterSelect", true)));
        }
    }

    public static void Z(wy wyVar) {
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        wyVar.U4();
    }

    public static void a0(wy wyVar) {
        PasskeysActivity.a0(wyVar.currentAccount, wyVar.getParentActivity(), wyVar.resourceProvider, true);
    }

    public static void b0(wy wyVar, int i10, org.telegram.ui.Components.w70 w70Var) {
        CharSequence charSequence;
        if (wyVar.currentAccount != i10) {
            w70Var.u();
            if (wyVar.getParentActivity() == null) {
                return;
            }
            qy qyVar = wyVar.C2;
            LaunchActivity launchActivity = (LaunchActivity) wyVar.getParentActivity();
            ArrayList arrayList = wyVar.D2;
            String str = wyVar.E2;
            CharSequence charSequence2 = wyVar.F2;
            gx gxVar = wyVar.B1;
            if (gxVar != null) {
                charSequence = gxVar.getFieldText();
            } else {
                charSequence = null;
            }
            launchActivity.K0(i10);
            wy wyVar2 = new wy(wyVar.arguments);
            wyVar2.C2 = qyVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList.isEmpty()) {
                    wyVar2.D2 = null;
                } else {
                    wyVar2.D2 = arrayList;
                    wyVar2.E2 = null;
                    if (wyVar2.B1 != null) {
                        wyVar2.l3(charSequence);
                    } else {
                        wyVar2.V3 = charSequence;
                    }
                }
            } else if (str != null) {
                wyVar2.E4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    wyVar2.F2 = null;
                } else {
                    wyVar2.F2 = charSequence2;
                    wyVar2.E2 = null;
                    wyVar2.D2 = null;
                    if (wyVar2.B1 != null) {
                        wyVar2.l3(charSequence);
                    } else {
                        wyVar2.V3 = charSequence;
                    }
                }
            }
            launchActivity.q0(wyVar2, false, true);
        }
    }

    public static void c0(wy wyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(wyVar.currentAccount).getClientUserId());
        wyVar.presentFragment(new eo(bundle));
    }

    public static void d0(wy wyVar, TL_account.TL_birthday tL_birthday) {
        TL_account.TL_birthday tL_birthday2;
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = wyVar.getMessagesController().getUserFull(wyVar.getUserConfig().getClientUserId());
        if (userFull != null) {
            tL_birthday2 = userFull.birthday;
        } else {
            tL_birthday2 = null;
        }
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        wyVar.getMessagesController().invalidateContentSettings();
        wyVar.getConnectionsManager().sendRequest(updatebirthday, new aa(wyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        wyVar.U4();
    }

    public static void d4(eo eoVar, MessageObject messageObject) {
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
                    org.telegram.ui.Components.m10[] m10VarArr = (org.telegram.ui.Components.m10[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.m10.class);
                    if (m10VarArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(m10VarArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(m10VarArr[0]);
                        for (int i10 = 1; i10 < m10VarArr.length; i10++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(m10VarArr[i10]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(m10VarArr[i10]);
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
                        eoVar.mb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void e0(wy wyVar, String str) {
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, str);
        wyVar.U4();
    }

    public static void f0(wy wyVar, vy vyVar, View view, int i10) {
        int i11;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.u3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.r2;
        if (z10) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            if (r2Var.f19817n2) {
                wyVar.N4(r2Var.getDialogId(), view);
                return;
            }
        }
        if (wyVar.I3()) {
            wyVar.o4(view, i10, 0.0f, vyVar.d);
            return;
        }
        int i12 = wyVar.R0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.s8)) {
            vyVar.d.K();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle i14 = a4.a.i("forImport", true);
            i14.putLongArray("result", new long[]{wyVar.getUserConfig().getClientUserId()});
            i14.putInt("chatType", 4);
            String string = wyVar.arguments.getString("importTitle");
            if (string != null) {
                i14.putString("title", string);
            }
            k70 k70Var = new k70(i14);
            k70Var.Y = new ax(wyVar);
            wyVar.presentFragment(k70Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.z2) && ((i11 = vyVar.f37651s) == 7 || i11 == 8)) {
            fg.k kVar = (fg.k) vyVar.d.M.get(0);
            if (kVar != null && kVar.f14046a == 17) {
                tL_chatlists_chatlistUpdates = kVar.f8089i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = wyVar.getMessagesController().selectedDialogFilter[vyVar.f37651s - 7];
                if (dialogFilter != null) {
                    int i15 = dialogFilter.f14645id;
                    ?? abVar = new org.telegram.ui.Components.ab(wyVar, false);
                    abVar.Y = -1;
                    abVar.f24538c0 = "";
                    abVar.f24539d0 = new ArrayList();
                    abVar.f24541f0 = "";
                    abVar.f24543h0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    abVar.f24544i0 = arrayList;
                    abVar.f24560z0 = -1;
                    abVar.C0 = -5;
                    abVar.Y = i15;
                    abVar.f24536a0 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    abVar.f24542g0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = wyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i13).f14645id == i15) {
                                abVar.f24538c0 = arrayList2.get(i13).name;
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    abVar.S();
                    wyVar.showDialog(abVar);
                    return;
                }
                return;
            }
        } else if (z10 && !wyVar.actionBar.s() && !wyVar.F3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.r2) view).Y1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        wyVar.n4(view, i10, vyVar.d);
    }

    public static void f1(wy wyVar, boolean z10) {
        if (wyVar.f38431e0 != null && wyVar.N3 != z10) {
            wyVar.N3 = z10;
            int i10 = 0;
            while (true) {
                vy[] vyVarArr = wyVar.f38431e0;
                if (i10 < vyVarArr.length) {
                    if (z10) {
                        vyVarArr[i10].f37645a.setScrollbarFadingEnabled(false);
                    }
                    wyVar.f38431e0[i10].f37645a.setVerticalScrollBarEnabled(z10);
                    if (z10) {
                        wyVar.f38431e0[i10].f37645a.setScrollbarFadingEnabled(true);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public static void g0(wy wyVar) {
        wyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(wyVar.parentLayout, "newChatsRow");
    }

    public static void i0(wy wyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        if (wyVar.getParentActivity() != null) {
            wyVar.f38508t2 = false;
            if (z10 || z11 || z12) {
                wyVar.A0 = true;
                if (z10 && hk0.n(activity)) {
                    org.telegram.ui.Components.me0.g(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.jn(1, new pf(25, wyVar, activity)));
                } else if (z11 && wyVar.U1 && wyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.d5.w(activity, new bw(wyVar, 0)).f17528a;
                    wyVar.T1 = d2Var;
                    wyVar.showDialog(d2Var);
                } else if (z12 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    if (activity instanceof h5) {
                        org.telegram.ui.ActionBar.d2 w10 = ((h5) activity).w(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                        wyVar.T1 = w10;
                        wyVar.showDialog(w10);
                    }
                } else {
                    wyVar.k3(true);
                }
            }
        }
    }

    public static void i4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = f38407y4;
        if (!zArr[currentAccount]) {
            MessagesController messagesController = accountInstance.getMessagesController();
            messagesController.loadGlobalNotificationsSettings();
            messagesController.loadDialogs(0, 0, 100, true);
            messagesController.loadHintDialogs();
            messagesController.loadUserInfo(accountInstance.getUserConfig().getCurrentUser(), false, 0);
            accountInstance.getContactsController().checkInviteText();
            accountInstance.getMediaDataController().checkAllMedia(false);
            AndroidUtilities.runOnUIThread(new fj(accountInstance, 18), 200L);
            Iterator<String> it = messagesController.diceEmojies.iterator();
            while (it.hasNext()) {
                accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
            }
            zArr[currentAccount] = true;
        }
    }

    public static void j0(wy wyVar) {
        if (wyVar.f38419b4.h()) {
            MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            wyVar.U4();
        }
    }

    public static void l0(wy wyVar) {
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        wyVar.U4();
    }

    public static void m0(wy wyVar) {
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        wyVar.U4();
    }

    public static void n0(wy wyVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        bi.va vaVar;
        try {
            d2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject != null) {
            wyVar.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            bi.va vaVar2 = new bi.va(wyVar, j3, 18);
            Pattern pattern = org.telegram.ui.Components.d5.f22289a;
            if (wyVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = wyVar.getCurrentAccount();
                    Activity parentActivity = wyVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
                    TextView textView = new TextView(parentActivity);
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false));
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
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(parentActivity);
                    w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    frameLayout.addView(w9Var, w7.a6.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
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
                    frameLayout.addView(textView2, w7.a6.d(-1, -2.0f, i17, f7, 11.0f, i15, 0.0f));
                    if (!LocaleController.isRTL) {
                        i16 = 3;
                    }
                    frameLayout.addView(textView, w7.a6.d(-2, -2.0f, i16 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                    if (user != null) {
                        if (UserObject.isReplyUser(user)) {
                            g9Var.f23286p = 0.8f;
                            g9Var.g(12);
                            w9Var.h(null, null, g9Var, user);
                            vaVar = vaVar2;
                        } else {
                            vaVar = vaVar2;
                            if (user.f17342id == clientUserId) {
                                g9Var.f23286p = 0.8f;
                                g9Var.g(1);
                                w9Var.h(null, null, g9Var, user);
                            } else {
                                g9Var.f23286p = 1.0f;
                                g9Var.m(currentAccount, user);
                                w9Var.e(user, g9Var);
                            }
                        }
                    } else {
                        vaVar = vaVar2;
                        g9Var.k(currentAccount, chat);
                        w9Var.e(chat, g9Var);
                    }
                    textView.setText(AndroidUtilities.replaceTags(str));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Import), new org.telegram.ui.Components.t(vaVar, 3));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    wyVar.showDialog(alertDialog$Builder.f17528a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.d5.f0(wyVar.currentAccount, tL_error, wyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        wyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j3), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public static void o0(wy wyVar, int i10) {
        Object obj;
        TLRPC.User user;
        org.telegram.ui.Components.un0 un0Var = wyVar.C0.f23725o0;
        if (i10 >= un0Var.X && i10 < un0Var.Y) {
            org.telegram.ui.Components.v51 G = un0Var.G(i10);
            if (G != null) {
                obj = G.G;
            } else {
                obj = null;
            }
        } else {
            obj = Boolean.FALSE;
        }
        if (obj instanceof TLRPC.User) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wyVar.getParentActivity(), 0, wyVar.resourceProvider);
            String string = LocaleController.getString(R.string.AppsClearSearch);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            d2Var.R = string;
            d2Var.T = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.km(21, wyVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        }
    }

    public static void p0(wy wyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        HashSet hashSet2;
        if (i10 == 102) {
            wyVar.getMessagesController().setDialogsInTransaction(true);
            if (z10) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            wyVar.r4(arrayList, i10, false, false, hashSet2);
            wyVar.getMessagesController().setDialogsInTransaction(false);
            wyVar.getMessagesController().checkIfFolderEmpty(wyVar.V2);
            int i11 = wyVar.V2;
            if (i11 != 0 && wyVar.R3(wyVar.currentAccount, wyVar.f38431e0[0].f37651s, i11, false).size() == 0) {
                wyVar.f38431e0[0].f37645a.setEmptyView(null);
                wyVar.f38431e0[0].f37652w.setVisibility(4);
                wyVar.finishFragment();
                return;
            }
            return;
        }
        wyVar.r4(arrayList, i10, false, false, null);
    }

    public static void q1(wy wyVar, vy vyVar, float f7) {
        if (wyVar.T != f7) {
            wyVar.T = f7;
            int i10 = 0;
            int i11 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i11 == 0) {
                wyVar.U = false;
            }
            wyVar.E0.setOverscroll(f7);
            vyVar.f37645a.setViewsOffset(f7);
            sy syVar = vyVar.f37645a;
            if (i11 != 0) {
                i10 = 2;
            }
            syVar.setOverScrollMode(i10);
            wyVar.fragmentView.invalidate();
            if (f7 > AndroidUtilities.dp(90.0f) && !wyVar.U) {
                nx nxVar = wyVar.E0;
                ValueAnimator valueAnimator = nxVar.H0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    nxVar.i(nxVar.f48615p0, true);
                    wyVar.U = true;
                    wyVar.getOrCreateStoryViewer().s(new rv(wyVar, 18));
                }
            }
        }
    }

    public static void r0(wy wyVar) {
        String str;
        MessagesController messagesController = MessagesController.getInstance(wyVar.currentAccount);
        if (wyVar.A3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        messagesController.removeSuggestion(0L, str);
        wyVar.U4();
    }

    public static boolean r1(wy wyVar, vy vyVar) {
        if (!wyVar.F3.c()) {
            int i10 = (int) (-wyVar.N);
            int T3 = wyVar.T3();
            int U3 = wyVar.U3();
            if (i10 != 0 && i10 != T3 && i10 != U3 && vyVar.f37645a.canScrollVertically(-1)) {
                if (U3 < i10 && i10 < T3) {
                    int dp = AndroidUtilities.dp(48.0f);
                    int i11 = i10 - U3;
                    if (i11 < dp / 2) {
                        vyVar.f37646b.u(-i11);
                        return true;
                    }
                    vyVar.f37646b.u(dp - i11);
                    return true;
                }
                float f7 = 1.0f;
                if (wyVar.f38509t3 != 1.0f) {
                    f7 = Utilities.clamp((-wyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
                }
                if (f7 < wyVar.E0.B0) {
                    vyVar.f37646b.u(-i10);
                    return true;
                }
                vyVar.f37646b.u(U3 - i10);
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
        if (!org.telegram.ui.Components.me0.c()) {
            org.telegram.ui.Components.me0.h();
        } else {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
    }

    public static String s2(wy wyVar) {
        String shortName;
        ArrayList arrayList = wyVar.I2;
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
                if (longValue == wyVar.getUserConfig().getClientUserId()) {
                    sb2.append(LocaleController.getString(R.string.SavedMessages));
                } else {
                    if (arrayList.size() == 1) {
                        shortName = DialogObject.getName(wyVar.currentAccount, longValue);
                    } else {
                        shortName = DialogObject.getShortName(wyVar.currentAccount, longValue);
                    }
                    sb2.append(shortName);
                }
            }
            return LocaleController.formatString(R.string.ShareSendToChats, sb2.toString());
        }
        return LocaleController.formatPluralString("ShareSendToMany", arrayList.size(), new Object[0]);
    }

    public static void t0(wy wyVar) {
        b.c(wyVar.getParentActivity(), wyVar.currentAccount, wyVar.getResourceProvider());
    }

    public static void u0(final int i10, final long j3, TLRPC.Chat chat, final wy wyVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        wyVar.b4(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                wyVar.getMessagesController().deleteDialog(j3, 2, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i14 = wyVar.V2) != 0 && wyVar.R3(wyVar.currentAccount, wyVar.f38431e0[0].f37651s, i14, false).size() == 1) {
            wyVar.f38431e0[0].f37652w.setVisibility(4);
        }
        wyVar.y3 = 3;
        int i15 = -1;
        if (i10 == 102) {
            wyVar.A4(true, true);
            if (wyVar.R1 != null) {
                i13 = 0;
                while (i13 < wyVar.R1.size()) {
                    if (((TLRPC.Dialog) wyVar.R1.get(i13)).f17199id == j3) {
                        break;
                    }
                    i13++;
                }
            }
            i13 = -1;
            wyVar.o3();
            i11 = i13;
        } else {
            i11 = -1;
        }
        UndoView Y3 = wyVar.Y3();
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
                    wyVar.q4(i10, j3, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(wyVar.R3(wyVar.currentAccount, wyVar.f38431e0[0].f37651s, wyVar.V2, false));
        int i16 = 0;
        while (true) {
            if (i16 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i16)).f17199id == j3) {
                i15 = i16;
                break;
            } else {
                i16++;
            }
        }
        if (i10 == 102) {
            if (i11 >= 0 && i15 < 0 && (arrayList = wyVar.R1) != null) {
                arrayList.remove(i11);
                wyVar.f38431e0[0].f37653x.D();
                wyVar.f38431e0[0].q(true);
                return;
            }
            wyVar.A4(false, true);
        }
    }

    public static void v0(wy wyVar) {
        BirthdayController.getInstance(wyVar.currentAccount).hide();
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        wyVar.U4();
        org.telegram.ui.Components.pc G = org.telegram.ui.Components.wc.a0(wyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f26081j = 5000;
        G.j();
    }

    public static void w0(wy wyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.C0(launchActivity, wyVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            qj1.a(wyVar.getParentActivity(), new rh(wyVar, tL_attachMenuBot, launchActivity), null);
        }
    }

    public static void x0(wy wyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(launchActivity, wyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(wyVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void y0(wy wyVar) {
        MessagesController.getInstance(wyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        wyVar.U4();
    }

    public static void z0(wy wyVar) {
        if (!wyVar.O3) {
            bi.x4 x4Var = wyVar.f38489q0;
            if (x4Var != null) {
                if (x4Var.V) {
                    return;
                }
                AndroidUtilities.removeFromParent(x4Var);
            }
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.j6.Gi, 0, new kw(wyVar, 7));
            bi.x4 x4Var2 = new bi.x4(wyVar.getParentActivity(), 2);
            x4Var2.q(8.0f);
            x4Var2.d = 8000L;
            x4Var2.i();
            x4Var2.p(true);
            x4Var2.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
            x4Var2.s(replaceSingleTag);
            x4Var2.l(1.0f, -40.0f);
            x4Var2.h(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
            wyVar.f38489q0 = x4Var2;
            x4Var2.setTranslationY((-wyVar.f38446g4) - wyVar.f38456i4);
            ((ViewGroup) wyVar.fragmentView).addView(wyVar.f38489q0, w7.a6.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            wyVar.f38489q0.u();
            return;
        }
        bi.x4 x4Var3 = wyVar.f38484p0;
        if (x4Var3 != null) {
            x4Var3.e(true);
        }
        j4.w o9 = MessagesController.getInstance(wyVar.currentAccount).getStoriesController().o();
        if (o9 != null && o9.a(wyVar.currentAccount, 1)) {
            wyVar.showDialog(new qg.k0(o9.b(), wyVar.currentAccount, wyVar.getParentActivity(), wyVar, null));
            return;
        }
        bi.ce E = bi.ce.E(wyVar.getParentActivity(), wyVar.currentAccount);
        E.f2504x = new cy(wyVar, 4);
        E.R(null);
    }

    public final void A3() {
        org.telegram.ui.Components.h20.d(this.f38466l0, com.google.android.gms.internal.vision.e2.C(this.f38414b.e, 1.0f - V3(), 1.0f - this.f38420c.e, this.d.e));
    }

    public final void A4(boolean z10, boolean z11) {
        if (this.f38431e0 != null && this.S1 != z10) {
            if (z10) {
                this.R1 = new ArrayList(R3(this.currentAccount, this.f38431e0[0].f37651s, this.V2, false));
            } else {
                this.R1 = null;
            }
            this.S1 = z10;
            vy vyVar = this.f38431e0[0];
            vyVar.d.G = z10;
            if (!z10 && z11) {
                if (vyVar.f37645a.b0()) {
                    this.f38431e0[0].f37645a.post(new kw(this, 8));
                } else {
                    this.f38431e0[0].d.l();
                }
            }
        }
    }

    @Override
    public final void B(float f7, int i10) {
        org.telegram.ui.ActionBar.w0 w0Var;
        if (i10 == 3 && (w0Var = this.f38466l0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) w0Var.getIconView().getDrawable();
            if (this.d.f12870f) {
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

    public final void B3() {
        boolean z10;
        bi.nc ncVar;
        if (!this.f38459j2 && ((ncVar = this.K0) == null || ncVar.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ch0 ch0Var = this.I3;
        if (ch0Var != null) {
            ch0Var.f31669a.v.a(z10, true);
        }
    }

    public final void B4(boolean z10) {
        vy vyVar;
        if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
            if (z10) {
                vy[] vyVarArr = this.f38431e0;
                if (vyVarArr != null && (vyVar = vyVarArr[0]) != null) {
                    vyVar.setLayerType(2, null);
                    this.f38431e0[0].setClipChildren(false);
                    this.f38431e0[0].setClipToPadding(false);
                    this.f38431e0[0].f37645a.setClipChildren(false);
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
            if (this.f38431e0 != null) {
                int i10 = 0;
                while (true) {
                    vy[] vyVarArr2 = this.f38431e0;
                    if (i10 >= vyVarArr2.length) {
                        break;
                    }
                    vy vyVar2 = vyVarArr2[i10];
                    if (vyVar2 != null) {
                        vyVar2.setLayerType(0, null);
                        vyVar2.setClipChildren(true);
                        vyVar2.setClipToPadding(true);
                        vyVar2.f37645a.setClipChildren(true);
                    }
                    i10++;
                }
            }
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (lVar2 != null) {
                lVar2.setLayerType(0, null);
            }
            nx nxVar = this.E0;
            if (nxVar != null) {
                nxVar.setLayerType(0, null);
            }
            View view2 = this.fragmentView;
            if (view2 != null) {
                ((ViewGroup) view2).setClipChildren(true);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void C3() {
        w3();
        org.telegram.ui.Components.h20.d(this.f38461k0, (1.0f - this.f38414b.e) * (1.0f - V3()) * (1.0f - this.f38420c.e));
        x3();
        A3();
        y3();
        z3();
    }

    public final void C4(float f7) {
        vy[] vyVarArr = this.f38431e0;
        int i10 = 0;
        if (vyVarArr != null) {
            int paddingTop = vyVarArr[0].f37645a.getPaddingTop() + ((int) f7);
            int i11 = 0;
            while (true) {
                vy[] vyVarArr2 = this.f38431e0;
                if (i11 >= vyVarArr2.length) {
                    break;
                }
                vyVarArr2[i11].f37645a.setTopGlowOffset(paddingTop);
                i11++;
            }
        }
        if (this.fragmentView != null && f7 != this.N) {
            this.N = f7;
            org.telegram.ui.Components.pc pcVar = this.f38477n3;
            if (pcVar != null) {
                pcVar.l();
            }
            if (this.E3 != null) {
                float currentActionBarHeight = 1.0f - ((-f7) / org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                org.telegram.ui.Cells.o oVar = this.E3;
                float f10 = (int) f7;
                float f11 = oVar.f19588f;
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

    public final void D3() {
        int i10;
        if (V3() > 0.5f) {
            i10 = R.string.SearchTopics;
        } else {
            i10 = R.string.SearchChats;
        }
        String string = LocaleController.getString(i10);
        this.X.f24572r.setContentDescription(string);
        this.X.f24572r.setHint(string);
    }

    public final void D4(float f7) {
        int i10;
        int i11;
        this.f38529x1 = f7;
        if (this.f38498r3 && this.actionBar != null) {
            if (this.V2 == 0 && this.X2 == 0) {
                i10 = org.telegram.ui.ActionBar.j6.f18256v8;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.O8;
            }
            int themedColor = getThemedColor(i10);
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.j6.f18308y8;
            lVar.C(i0.a.d(this.f38529x1, themedColor, getThemedColor(i12)), false);
            this.actionBar.C(i0.a.d(this.f38529x1, getThemedColor(i12), getThemedColor(i12)), true);
            if (this.V2 == 0 && this.X2 == 0) {
                i11 = org.telegram.ui.ActionBar.j6.f18220t8;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.N8;
            }
            int themedColor2 = getThemedColor(i11);
            this.actionBar.A(i0.a.d(this.f38529x1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.j6.f18327z8)), false);
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
        float max = Math.max(this.f38509t3, this.h.e);
        float f10 = this.f38414b.e;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float max2 = f7 * (1.0f - this.f38420c.e) * (1.0f - max) * Math.max(f10, (1.0f - V3()) * a2);
        this.X.setAlpha(max2);
        my myVar = this.X;
        boolean z10 = false;
        if (max2 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        myVar.setVisibility(i10);
        if (max2 <= 0.01f) {
            z10 = true;
        }
        this.f38436f.a(z10, true);
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
                this.V3 = charSequence;
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
            if (this.f38410a0 != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float f10 = f7 * this.f38414b.e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f10);
            this.Z.setScaleX(lerp);
            this.Z.setScaleY(lerp);
            this.Z.setAlpha(f10);
            y41 y41Var = this.Z;
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            y41Var.setVisibility(i11);
        }
        org.telegram.ui.Components.u81 u81Var = this.f38410a0;
        le.b bVar = this.f38500s;
        if (u81Var != null) {
            float f11 = 1.0f - bVar.e;
            u81Var.setAlpha(f11);
            org.telegram.ui.Components.u81 u81Var2 = this.f38410a0;
            if (f11 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            u81Var2.setVisibility(i10);
        }
        fg.s0 s0Var = this.f38415b0;
        if (s0Var != null) {
            float f12 = bVar.e;
            s0Var.setAlpha(f12);
            fg.s0 s0Var2 = this.f38415b0;
            if (f12 > 0.0f) {
                i12 = 0;
            }
            s0Var2.setVisibility(i12);
        }
    }

    public final void F4(float f7) {
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
                nx nxVar = this.E0;
                if (nxVar != null) {
                    nxVar.setTranslationX(f10);
                }
                my myVar = this.X;
                if (myVar != null) {
                    myVar.setTranslationX(f10);
                }
                qx qxVar = this.F3;
                if (qxVar != null && qxVar.getFragmentView() != null && !this.f38532y) {
                    this.F3.getFragmentView().setTranslationX(f10);
                    return;
                }
                return;
            }
            float f11 = 1.0f - this.X3;
            float f12 = (-AndroidUtilities.dp(4.0f)) * f11;
            float f13 = 1.0f - (f11 * 0.05f);
            nx nxVar2 = this.E0;
            if (nxVar2 != null) {
                nxVar2.setScaleX(f13);
                this.E0.setScaleY(f13);
                this.E0.setTranslationX(f12);
                this.E0.setPivotX(0.0f);
                this.E0.setPivotY(0.0f);
            }
            my myVar2 = this.X;
            if (myVar2 != null) {
                myVar2.setTranslationX(f12);
                this.X.setScaleX(f13);
                this.X.setScaleY(f13);
            }
            qx qxVar2 = this.F3;
            if (qxVar2 != null && qxVar2.getFragmentView() != null) {
                if (!this.f38532y) {
                    this.F3.getFragmentView().setScaleX(f13);
                    this.F3.getFragmentView().setScaleY(f13);
                    this.F3.getFragmentView().setTranslationX(f12);
                }
                this.F3.getFragmentView().setPivotX(0.0f);
                this.F3.getFragmentView().setPivotY(0.0f);
            }
        }
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
        int i11;
        int i12;
        int i13 = 8;
        if (i10 == 1) {
            C3();
            E3();
            H3();
            u3();
            F3();
            my myVar = this.X;
            le.b bVar = this.f38414b;
            myVar.setBlurredBackgroundVisibility(bVar.e);
            float b10 = xf.f0.b(bVar.e);
            org.telegram.ui.Components.w9 w9Var = this.f38412a3;
            if (w9Var != null) {
                w9Var.setScaleX(b10);
                this.f38412a3.setScaleY(b10);
                this.f38412a3.setAlpha(b10);
                org.telegram.ui.Components.w9 w9Var2 = this.f38412a3;
                if (b10 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                w9Var2.setVisibility(i12);
            }
            if (this.f38516v0 != null) {
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
                this.f38516v0.setScaleX(lerp);
                this.f38516v0.setScaleY(lerp);
                this.f38516v0.setAlpha(b10);
                bi.d dVar = this.f38516v0;
                int i14 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
                if (i14 > 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                dVar.setVisibility(i11);
                this.f38522w0.setAlpha(b10);
                ih.f fVar = this.f38522w0;
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

    public final void G3(boolean z10) {
        int i10;
        int i11;
        if (this.C0 != null && this.actionBar != null) {
            int i12 = AndroidUtilities.navigationBarHeight;
            int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f38409a);
            if (this.f38410a0 != null) {
                i10 = AndroidUtilities.dp(50.0f);
            } else {
                i10 = 0;
            }
            int i13 = measuredHeight + i10;
            org.telegram.ui.Components.qs qsVar = this.J1;
            if (qsVar != null) {
                i11 = (int) qsVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i14 = i13 + i11;
            gy gyVar = this.C0;
            SparseArray sparseArray = gyVar.h;
            gyVar.U0 = i14;
            gyVar.V0 = i12;
            bi.y1 y1Var = gyVar.V;
            if (z10) {
                y1Var.n1(0, i14, 0, i12);
            } else {
                y1Var.setPadding(0, i14, 0, i12);
            }
            gyVar.M0.j(gyVar.U0, gyVar.V0, z10);
            org.telegram.ui.Components.tn0 tn0Var = gyVar.W;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tn0Var.getLayoutParams();
            int i15 = marginLayoutParams.topMargin;
            int i16 = gyVar.U0;
            if (i15 != i16 || marginLayoutParams.bottomMargin != gyVar.V0) {
                marginLayoutParams.topMargin = i16;
                marginLayoutParams.bottomMargin = gyVar.V0;
                tn0Var.requestLayout();
            }
            org.telegram.ui.Components.ho0.P(gyVar.f23717f0, gyVar.f23720i0, gyVar.U0, gyVar.V0, z10);
            org.telegram.ui.Components.ho0.P(gyVar.f23722k0, gyVar.f23724n0, gyVar.U0, gyVar.V0, z10);
            org.telegram.ui.Components.ho0.P(gyVar.f23728r0, gyVar.f23731u0, gyVar.U0, gyVar.V0, z10);
            org.telegram.ui.Components.ih0 ih0Var = gyVar.f23726p0;
            int i17 = gyVar.U0;
            int i18 = gyVar.V0;
            ih0Var.setClipToPadding(false);
            org.telegram.ui.Components.r61 r61Var = ih0Var.f24022c;
            ih0Var.J = z10;
            ih0Var.setPadding(0, i17, 0, i18);
            if (z10) {
                r61Var.n1(0, i17, 0, i18);
            } else {
                r61Var.setPadding(0, i17, 0, i18);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) r61Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i17;
            marginLayoutParams2.bottomMargin = -i18;
            ih0Var.J = false;
            org.telegram.ui.Components.fn0 fn0Var = gyVar.G0;
            if (fn0Var != null) {
                fn0Var.b(gyVar.U0, gyVar.V0, z10);
            }
            int size = sparseArray.size();
            for (int i19 = 0; i19 < size; i19++) {
                View view = (View) sparseArray.valueAt(i19);
                if (view instanceof z10) {
                    ((z10) view).j(gyVar.U0, gyVar.V0, z10);
                }
            }
            for (int i20 = 0; i20 < gyVar.getChildCount(); i20++) {
                if (gyVar.getChildAt(i20) instanceof z10) {
                    ((z10) gyVar.getChildAt(i20)).j(gyVar.U0, gyVar.V0, z10);
                }
            }
        }
    }

    public final void G4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.u6 u6Var = new org.telegram.ui.Components.u6(getParentActivity(), this.currentAccount, getResourceProvider(), new uv(2, this, r0), new fj(r0, 17));
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(getParentActivity(), getResourceProvider());
        c3Var.c(u6Var);
        org.telegram.ui.ActionBar.h3 h3Var = c3Var.f17571a;
        h3Var.show();
        org.telegram.ui.ActionBar.h3[] h3VarArr = {h3Var};
        h3Var.fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.f17998h5));
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

    public final boolean H4(org.telegram.ui.Cells.r2 r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.H4(org.telegram.ui.Cells.r2):boolean");
    }

    public boolean I3() {
        if (this.R0 == 10) {
            return true;
        }
        return false;
    }

    public final void I4(boolean z10) {
        float f7;
        this.f38420c.a(z10, true);
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
        org.telegram.ui.ActionBar.w0 w0Var = this.m0;
        Property property = View.ALPHA;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(w0Var, property, f7));
        this.P3.playTogether(arrayList);
        this.P3.addListener(new wx(this, z10, 1));
        this.P3.start();
    }

    public final void J3() {
        if (AndroidUtilities.isTablet()) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.h(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                gy gyVar = this.C0;
                if (gyVar != null) {
                    gyVar.f23713b0.R(this.W1, tLObject);
                }
                this.X1 = null;
                return;
            }
            return;
        }
        this.V1 = true;
    }

    public final void J4() {
        if (!this.A0 && getMessagesController().dialogFiltersLoaded && getMessagesController().showFiltersTooltip && this.f38536z0 != null && getMessagesController().getDialogFilters().isEmpty() && !this.isPaused && getUserConfig().filtersLoaded && !this.inPreviewMode) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("filterhint", false)) {
                globalMainSettings.edit().putBoolean("filterhint", true).apply();
                AndroidUtilities.runOnUIThread(new kw(this, 9), 1000L);
            }
        }
    }

    public final void K3() {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null && lVar.f18389n0) {
            lVar.h(true);
            this.f38487p3 = false;
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
        uv uvVar;
        int i12;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i13;
        int v02;
        int v03;
        int v04;
        int l1;
        CharSequence charSequence2;
        int i14;
        int v05;
        org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(this, this.f38461k0);
        int i15 = org.telegram.ui.ActionBar.j6.A8;
        H.S(getThemedColor(i15), getThemedColor(i15));
        H.f28701s = 8;
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) parentActivity;
        } else {
            launchActivity = null;
        }
        int i16 = 0;
        if (this.X2 != 0) {
            if (ChatObject.hasAdminRights(this.Y2)) {
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new rv(this, 4), false);
                H.k();
            }
            H.i(new rv(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.Y2.collapsed_in_dialogs);
            H.i(new rv(this, 8), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.Y2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else if (e4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new rv(this, 9), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new rv(this, 10), false);
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
            H.c(i10, LocaleController.getString(i11), new rv(this, 11), false);
            H.k();
            H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new rv(this, 12), false);
            H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new rv(this, 13), false);
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
                        vv vvVar = new vv(this, tL_attachMenuBot2, launchActivity, 0);
                        uv uvVar2 = new uv(1, this, tL_attachMenuBot2);
                        org.telegram.ui.ActionBar.f6 f6Var3 = H.d;
                        if (H.e != null) {
                            int i18 = org.telegram.ui.ActionBar.j6.F8;
                            int i19 = org.telegram.ui.ActionBar.j6.E8;
                            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, H.e, H.d, false, false);
                            g1Var2.setPadding(AndroidUtilities.dp(18.0f), i16, AndroidUtilities.dp(18.0f), i16);
                            if (tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                charSequence = org.telegram.ui.Cells.s8.a(tL_attachMenuBot2.short_name);
                            } else {
                                charSequence = tL_attachMenuBot2.short_name;
                            }
                            TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot2);
                            if (sideAttachMenuBotIcon != null) {
                                launchActivity2 = launchActivity;
                                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.j6.f17911c7, 1.0f);
                                if (svgThumb != null) {
                                    Integer num = H.f28688k0;
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
                                uvVar = uvVar2;
                                i13 = i18;
                                g1Var = g1Var2;
                                f6Var = f6Var3;
                                g1Var.h(charSequence2, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                                org.telegram.ui.Components.w9 w9Var = g1Var.h;
                                if (w9Var != null) {
                                    if (LocaleController.isRTL) {
                                        i14 = 5;
                                    } else {
                                        i14 = 3;
                                    }
                                    w9Var.setLayoutParams(w7.a6.e(24, 24, i14 | 16));
                                }
                            } else {
                                launchActivity2 = launchActivity;
                                uvVar = uvVar2;
                                i12 = i19;
                                g1Var = g1Var2;
                                f6Var = f6Var3;
                                CharSequence charSequence3 = charSequence;
                                i13 = i18;
                                g1Var.g(charSequence3, R.drawable.msg_bot, null);
                            }
                            Integer num2 = H.f28686j0;
                            if (num2 != null) {
                                v02 = num2.intValue();
                            } else {
                                v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
                            }
                            Integer num3 = H.f28688k0;
                            if (num3 != null) {
                                v03 = num3.intValue();
                            } else {
                                v03 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
                            }
                            g1Var.c(v02, v03);
                            Integer num4 = H.f28688k0;
                            if (num4 != null) {
                                v04 = num4.intValue();
                            } else {
                                v04 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
                            }
                            g1Var.setIconColorImage(v04);
                            Integer num5 = H.f28690l0;
                            if (num5 != null) {
                                l1 = num5.intValue();
                            } else {
                                l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
                            }
                            g1Var.setSelectorColor(l1);
                            g1Var.setOnClickListener(new org.telegram.ui.Components.u10(5, H, vvVar));
                            g1Var.setOnLongClickListener(new org.telegram.ui.Components.b0(2, H, uvVar));
                            int i20 = H.S;
                            if (i20 > 0) {
                                g1Var.setMinimumWidth(AndroidUtilities.dp(i20));
                                H.r(g1Var, w7.a6.n(H.S, -2));
                            } else {
                                H.r(g1Var, w7.a6.n(-1, -2));
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
                H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new rv(this, 6), false);
            }
            org.telegram.ui.ActionBar.g1 g1Var3 = this.f38479o0;
            if (g1Var3 != null) {
                g1Var3.f17724b.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f17883ai));
                this.f38479o0.setOnClickListener(new org.telegram.ui.Components.u10(27, this, H));
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                    H.k();
                    H.d(this.f38479o0);
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
        ArrayList arrayList = this.f38453i1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f38443g1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f38443g1.setImageDrawable(new org.telegram.ui.ActionBar.i2(true));
            this.f38443g1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f18308y8), PorterDuff.Mode.MULTIPLY));
            this.f38443g1.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.f18327z8), 1, -1));
            this.f38443g1.setOnClickListener(new xv(this, 6));
            j3.addView(this.f38443g1, w7.a6.q(54, 54, 16));
            arrayList.add(this.f38443g1);
        }
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.f38448h1 = numberTextView;
        numberTextView.setTextSize(18);
        this.f38448h1.setTypeface(AndroidUtilities.bold());
        this.f38448h1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18308y8));
        NumberTextView numberTextView2 = this.f38448h1;
        if (this.W) {
            i10 = 18;
        } else {
            i10 = 72;
        }
        j3.addView(numberTextView2, w7.a6.m(1.0f, 0, -1, i10, 0, 0));
        this.f38448h1.setOnTouchListener(new ai.h(2));
        this.f38462k1 = j3.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.l1 = j3.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.f38469m1 = j3.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.f38458j1 = j3.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.w0 h = j3.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        j3.addView(new View(getParentActivity()), w7.a6.n(5, -1));
        this.f38490q1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.f38475n1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.f38480o1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.f38485p1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.f38502s1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.f38496r1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.f38507t1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.l1.setOnLongClickListener(new fw(this, 0));
        arrayList.add(this.f38462k1);
        arrayList.add(this.f38469m1);
        arrayList.add(this.l1);
        arrayList.add(this.f38458j1);
        arrayList.add(h);
        T4(false);
    }

    public final void L4() {
        if (this.S3 == null) {
            for (String str : getMessagesController().pendingSuggestions) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                    alertDialog$Builder.f17528a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new yv(this, 6));
                    showDialog(alertDialog$Builder.f17528a, new sv(this, 1));
                    this.S3 = str;
                    return;
                }
            }
        }
    }

    public final void M3() {
        int i10;
        gy gyVar = this.C0;
        if ((gyVar != null && gyVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f38476n2 != null) {
            i10 = 2;
        } else if (!this.f38467l2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        gy gyVar2 = new gy(this, getParentActivity(), this, i10, this.R0, this.V2, this.X2, new cy(this, 1));
        this.C0 = gyVar2;
        ((py) this.fragmentView).addView(gyVar2, this.B0);
        gy gyVar3 = this.C0;
        gyVar3.f23713b0.U = new iy(this);
        gyVar3.f23720i0.setOnItemClickListener(new yv(this, 1));
        this.C0.f23724n0.setOnItemClickListener(new yv(this, 2));
        this.C0.f23731u0.setOnItemClickListener(new cw(this, 0));
        this.C0.f23724n0.setOnItemLongClickListener(new yv(this, 3));
        this.C0.V.setOnItemClickListener(new yv(this, 4));
        this.C0.V.setOnItemLongClickListener(new cy(this, 2));
        this.C0.setFilteredSearchViewDelegate(new yv(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.f38493q4);
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
            if (this.f38487p3) {
                L3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.g5)) {
                    com.google.android.gms.internal.vision.e2.t(false, this.actionBar);
                }
            } else {
                L3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
            this.actionBar.O(null, null);
            int i11 = this.f38431e0[0].f37651s;
            if ((i11 != 7 && i11 != 8) || (this.actionBar.s() && !this.actionBar.t(null))) {
                R3 = getMessagesController().getDialogs(this.V2);
            } else {
                R3 = R3(this.currentAccount, this.f38431e0[0].f37651s, this.V2, this.S1);
            }
            int size = R3.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = R3.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (g4(dialog)) {
                        i12++;
                    } else if (!getMessagesController().isPromoDialog(dialog.f17199id, false)) {
                        break;
                    }
                }
            }
            if (i12 > 1) {
                if (this.f38431e0 != null) {
                    int i14 = 0;
                    while (true) {
                        vy[] vyVarArr = this.f38431e0;
                        if (i14 >= vyVarArr.length) {
                            break;
                        }
                        vyVarArr[i14].d.H = true;
                        i14++;
                    }
                }
                g5(MessagesController.UPDATE_MASK_REORDER, true);
            }
            if (!this.f38487p3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f38453i1;
                    if (i15 >= arrayList3.size()) {
                        break;
                    }
                    View view2 = (View) arrayList3.get(i15);
                    view2.setPivotY(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2);
                    AndroidUtilities.clearDrawableAnimation(view2);
                    arrayList2.add(ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.1f, 1.0f));
                    i15++;
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(200L);
                animatorSet.start();
            }
            ValueAnimator valueAnimator = this.f38514u3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f38514u3 = ValueAnimator.ofFloat(this.f38509t3, 1.0f);
            int i16 = 0;
            while (true) {
                vy[] vyVarArr2 = this.f38431e0;
                if (i16 >= vyVarArr2.length) {
                    break;
                }
                vy vyVar = vyVarArr2[i16];
                if (vyVar != null) {
                    vyVar.f37645a.I0(true);
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
            this.f38514u3.addUpdateListener(new zv(this, max, 0));
            this.f38514u3.addListener(new zx(this, max, 1));
            this.f38514u3.setInterpolator(org.telegram.ui.Components.wr.f28819f);
            this.f38514u3.setDuration(200L);
            this.f38514u3.start();
            uw uwVar = this.f38536z0;
            if (uwVar != null) {
                uwVar.b(org.telegram.ui.ActionBar.j6.Gh, org.telegram.ui.ActionBar.j6.Fh, org.telegram.ui.ActionBar.j6.Eh, org.telegram.ui.ActionBar.j6.Hh, org.telegram.ui.ActionBar.j6.f18273w8);
            }
            org.telegram.ui.ActionBar.i2 i2Var = this.f38432e1;
            if (i2Var != null) {
                i2Var.c(1.0f, true);
            }
            z10 = false;
        }
        T4(false);
        this.f38448h1.a(arrayList.size(), z10);
    }

    public final void N3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f38533y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new ay(this, parentActivity);
                FrameLayout.LayoutParams d = w7.a6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.f38446g4 + this.f38456i4 + d.bottomMargin;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.f38528x0 + 1;
                this.f38528x0 = i11;
                ((py) this.fragmentView).addView(undoView, i11, d);
            }
        }
    }

    public final void N4(long j3, View view) {
        String str;
        org.telegram.ui.Components.pc J;
        int i10 = -this.M3;
        this.M3 = i10;
        AndroidUtilities.shakeViewSpring(view, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (j3 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)));
        } else {
            str = "";
        }
        if (getMessagesController().premiumFeaturesBlocked()) {
            J = org.telegram.ui.Components.wc.a0(this).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
        } else {
            J = org.telegram.ui.Components.wc.a0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new rv(this, 22));
        }
        J.j();
    }

    public final void O3(final long j3, final long j10, boolean z10, final ig1 ig1Var) {
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
                if (z10 && ((this.f38439f2 != null && this.f38444g2 != null) || this.f38449h2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (DialogObject.isEncryptedDialog(j3)) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.a2.m(getMessagesController(), j3).user_id));
                            if (user2 != null) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f38439f2, UserObject.getUserName(user2));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                return;
                            }
                        } else if (DialogObject.isUserDialog(j3)) {
                            if (j3 == getUserConfig().getClientUserId()) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f38444g2, LocaleController.getString(R.string.SavedMessages));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j3));
                                if (user3 != null && this.f38439f2 != null) {
                                    str = LocaleController.getString(R.string.SendMessageTitle);
                                    str2 = LocaleController.formatStringSimple(this.f38439f2, UserObject.getUserName(user3));
                                    string2 = LocaleController.getString(R.string.Send);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j3));
                            if (chat2 != null) {
                                String str3 = chat2.title;
                                if (j10 != 0 && (findTopic = getMessagesController().getTopicsController().findTopic(chat2.f17195id, j10)) != null) {
                                    str3 = ((Object) str3) + " " + findTopic.title;
                                }
                                if (this.f38449h2 != null) {
                                    string = LocaleController.getString(R.string.AddToTheGroupAlertTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f38449h2, str3);
                                    string2 = LocaleController.getString(R.string.Add);
                                } else {
                                    string = LocaleController.getString(R.string.SendMessageTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f38444g2, str3);
                                    string2 = LocaleController.getString(R.string.Send);
                                }
                                String str4 = formatStringSimple;
                                str = string;
                                str2 = str4;
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                        d2Var.R = str;
                        d2Var.T = AndroidUtilities.replaceTags(str2);
                        alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.c2() {
                            @Override
                            public final void f(org.telegram.ui.ActionBar.d2 d2Var2, int i11) {
                                wy.this.O3(j3, j10, false, ig1Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        if (showDialog(d2Var) == null) {
                            d2Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 15) {
                    Runnable h0Var = new a3.h0(this, j3, new a3.g0(this, j3, j10, ig1Var, 11), 18);
                    if (j3 < 0) {
                        Q4(getMessagesController().getChat(Long.valueOf(-j3)), h0Var, null);
                        return;
                    }
                    TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(j3));
                    TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(this.H));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user4), UserObject.getFirstName(user5));
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f17528a;
                    d2Var2.R = formatString;
                    d2Var2.T = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user4), UserObject.getFirstName(user5))));
                    alertDialog$Builder2.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new iu(h0Var, 1));
                    alertDialog$Builder2.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.gp0(16));
                    showDialog(d2Var2);
                    return;
                } else if (this.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j3, j10));
                    if (this.C2.v(this, arrayList, null, false, this.J2, this.K2, this.L2, ig1Var) && this.f38454i2) {
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
            org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().getInputPeer(j3);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new sw(this, d2Var3, user, chat, j3, tL_messages_checkHistoryImportPeer));
            try {
                d2Var3.q(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void O4(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.O4(boolean, boolean, boolean, boolean):void");
    }

    public final void P3(long j3, boolean z10) {
        if (this.f38431e0 != null) {
            int i10 = 0;
            while (true) {
                vy[] vyVarArr = this.f38431e0;
                if (i10 < vyVarArr.length) {
                    int childCount = vyVarArr[i10].f37645a.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 < childCount) {
                            View childAt = this.f38431e0[i10].f37645a.getChildAt(i11);
                            if (childAt instanceof org.telegram.ui.Cells.r2) {
                                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                                if (r2Var.getDialogId() == j3) {
                                    r2Var.V(z10, true);
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
            c71[] c71VarArr = new c71[1];
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            org.telegram.ui.ActionBar.l5 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.D3.f();
                Drawable drawable = this.D3.f25412f[0];
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
            rx rxVar = new rx(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), c71VarArr);
            if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
                rxVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
            }
            Long l10 = this.B3;
            if (l10 != null) {
                rxVar.setSelected(l10);
            } else {
                Drawable drawable2 = this.D3.f25412f[0];
                if (drawable2 instanceof org.telegram.ui.Components.p5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.p5) drawable2).i());
                } else {
                    l4 = null;
                }
                rxVar.setSelected(l4);
            }
            rxVar.setSaveState(1);
            rxVar.y(this.D3, titleTextView);
            sx sxVar = new sx(this, rxVar);
            this.M0 = sxVar;
            c71VarArr[0] = sxVar;
            sxVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i11, 48);
            c71VarArr[0].b();
        }
    }

    public final void Q4(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.Q4(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final java.util.ArrayList R3(int r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.R3(int, int, int, boolean):java.util.ArrayList");
    }

    public final void R4(boolean z10) {
        vy[] vyVarArr;
        char c10;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            vyVarArr = this.f38431e0;
            if (i12 >= vyVarArr.length) {
                break;
            }
            vyVarArr[i12].f37645a.B0();
            i12++;
        }
        if (z10 && vyVarArr.length > 1) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int i13 = vyVarArr[c10].h;
        if (i13 >= 0 && i13 < getMessagesController().getDialogFilters().size()) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.f38431e0[c10].h);
            if (dialogFilter.isDefault()) {
                vy vyVar = this.f38431e0[c10];
                vyVar.f37651s = this.R0;
                sy syVar = vyVar.f37645a;
                int i14 = sy.f36776v3;
                syVar.z1();
            } else {
                vy[] vyVarArr2 = this.f38431e0;
                if (vyVarArr2[c10 ^ 1].f37651s == 7) {
                    vyVarArr2[c10].f37651s = 8;
                } else {
                    vyVarArr2[c10].f37651s = 7;
                }
                vyVarArr2[c10].f37645a.setScrollEnabled(true);
                MessagesController messagesController = getMessagesController();
                if (this.f38431e0[c10].f37651s == 8) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                messagesController.selectDialogFilter(dialogFilter, i10);
            }
            vy[] vyVarArr3 = this.f38431e0;
            if (vyVarArr3.length > 1) {
                vyVarArr3[1].E = dialogFilter.locked;
            }
            vy vyVar2 = vyVarArr3[c10];
            dx dxVar = vyVar2.d;
            dxVar.h = vyVar2.f37651s;
            dxVar.l();
            vy vyVar3 = this.f38431e0[c10];
            zw zwVar = vyVar3.f37647c;
            if (vyVar3.f37651s == 0 && Z3() && this.f38431e0[c10].v == 2) {
                i11 = 1;
            }
            zwVar.h1(i11, (int) this.N);
            r3(this.f38431e0[c10]);
        }
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        qx qxVar;
        bi.nc ncVar;
        uw uwVar;
        boolean z11;
        boolean z12;
        if (!this.f38487p3 && (((qxVar = this.F3) == null || !qxVar.c()) && (((ncVar = this.K0) == null || ncVar.getVisibility() != 0) && ((uwVar = this.f38536z0) == null || !uwVar.f26528n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                uw uwVar2 = this.f38536z0;
                if (uwVar2 != null && uwVar2.getTabsCount() >= 2 && this.f38536z0.getCurrentTabId() != this.f38536z0.getFirstTabId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                uw uwVar3 = this.f38536z0;
                if (uwVar3 != null && uwVar3.getTabsCount() >= 2 && this.f38536z0.getCurrentTabId() != this.f38536z0.getLastTabId()) {
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
            f7 = 1.0f - this.f38414b.e;
        } else {
            f7 = 1.0f;
        }
        return f7 * (1.0f - V3()) * this.f38494r.e;
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
        y41 y41Var = this.Z;
        if (y41Var != null && y41Var.getVisibility() != 8) {
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
            float f20 = this.f38529x1;
            f11 = (f7 * f20) + com.google.android.gms.internal.vision.e2.z(1.0f, f20, f10, f19);
            f12 = this.f38525w3;
        } else {
            f11 = (f7 * this.f38529x1) + this.N;
            f12 = this.f38525w3;
        }
        float f21 = f11 + f12 + this.T;
        my myVar = this.X;
        if (myVar != null && myVar.getVisibility() == 0) {
            f13 = this.X.getAlpha();
        } else {
            f13 = 0.0f;
        }
        float dp = AndroidUtilities.dp(4.0f) * f13;
        uw uwVar = this.f38536z0;
        if (uwVar != null) {
            uwVar.setTranslationY(f21 - dp);
            f15 = this.f38536z0.getAlpha();
            f16 = AndroidUtilities.dp(43.0f) * f15;
            f14 = f21 + f16;
        } else {
            f14 = f21;
            f15 = 0.0f;
            f16 = 0.0f;
        }
        org.telegram.ui.Components.qs qsVar = this.J1;
        if (qsVar != null) {
            float f22 = f14 - dp;
            int i11 = -AndroidUtilities.dp(3.0f);
            if (this.f38410a0 == null) {
                i10 = AndroidUtilities.dp(44.0f);
            } else {
                i10 = 0;
            }
            qsVar.setTranslationY(AndroidUtilities.lerp(f22, i11 - i10, this.f38414b.e));
            f17 = this.J1.getMetadata().f12885c.f12893a;
            f18 = this.J1.c(0.0f);
        } else {
            f17 = 0.0f;
            f18 = 0.0f;
        }
        org.telegram.ui.Components.ps psVar = this.K1;
        if (psVar != null) {
            psVar.setTranslationY(f21 - dp);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f17, f15));
            org.telegram.ui.Components.ps psVar2 = this.K1;
            float min = Math.min(AndroidUtilities.dp(40.0f), (f18 + f16) - lerp);
            Matrix matrix = psVar2.f26243b;
            if (psVar2.e != lerp || psVar2.f26245f != min) {
                psVar2.e = lerp;
                psVar2.f26245f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = psVar2.f26244c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                psVar2.invalidate();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.T4(boolean):void");
    }

    public final int U3() {
        if (this.K) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    public final void U4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.U4():void");
    }

    public final float V3() {
        qx qxVar = this.F3;
        if (qxVar != null && qxVar.c()) {
            return this.F3.e;
        }
        return 0.0f;
    }

    public final void V4(boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.V4(boolean, boolean):void");
    }

    public final float W3() {
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.f38414b.e);
    }

    public final void W4(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.W4(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    public final zh.i5 X3() {
        return getMessagesController().getStoriesController();
    }

    public final void X4() {
        float f7 = (((-this.f38446g4) - this.f38460j4) - this.f38512u1) - this.f38517v1;
        org.telegram.ui.Components.h20 h20Var = this.f38506t0;
        if (h20Var != null) {
            h20Var.setTranslationY(f7);
        }
        org.telegram.ui.Components.h20 h20Var2 = this.f38511u0;
        if (h20Var2 != null) {
            h20Var2.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            bi.x4 x4Var = this.f38484p0;
            if (x4Var != null) {
                x4Var.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    public final UndoView Y3() {
        N3();
        UndoView[] undoViewArr = this.f38533y0;
        UndoView undoView = undoViewArr[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.e(2, true);
            py pyVar = (py) this.fragmentView;
            pyVar.removeView(undoViewArr[0]);
            pyVar.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void Y4(boolean z10) {
        boolean z11;
        boolean z12 = this.f38467l2;
        if ((!z12 || this.R0 == 10) && this.V2 == 0 && this.X2 == 0 && !this.inPreviewMode && ((!this.f38459j2 || z12) && !this.U3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.h20 h20Var = this.f38506t0;
        if (h20Var != null) {
            h20Var.e(z11, z10);
        }
        org.telegram.ui.Components.h20 h20Var2 = this.f38511u0;
        if (h20Var2 != null) {
            h20Var2.e(z11, z10);
        }
    }

    public final boolean Z3() {
        if (!this.f38467l2 && this.R0 == 0 && this.X2 == 0 && this.V2 == 0 && getMessagesController().hasHiddenArchive()) {
            return true;
        }
        return false;
    }

    public final void Z4(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        if (this.f38474n0 != null) {
            org.telegram.ui.ActionBar.w0 w0Var = this.m0;
            if (w0Var == null || w0Var.getVisibility() != 0) {
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
                if (!getDownloadController().hasUnviewedDownloads() && !z12 && (this.f38442g0.getVisibility() != 0 || this.f38442g0.getAlpha() != 1.0f || z11)) {
                    this.f38452i0 = false;
                } else {
                    this.f38452i0 = true;
                }
                x3();
                boolean z14 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i12 = this.f38428d2;
                z13 = (i12 == 3 || i12 == 5) ? true : true;
                org.telegram.ui.ActionBar.g1 g1Var = this.f38479o0;
                if (z14) {
                    if (z13) {
                        i10 = R.string.MenuProxyConnected;
                    } else {
                        i10 = R.string.MenuProxyConnecting;
                    }
                } else {
                    i10 = R.string.MenuProxyDisabled;
                }
                g1Var.setSubtext(LocaleController.getString(i10));
                this.f38474n0.b(z14, z13, z10);
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
        org.telegram.ui.Components.xq0 xq0Var;
        int i10;
        gx gxVar = this.B1;
        ArrayList arrayList = this.I2;
        if (gxVar != null) {
            this.f38473n.a(!arrayList.isEmpty(), true);
            b5();
            if (arrayList.isEmpty()) {
                if (this.R0 == 3 && this.f38439f2 == null) {
                    i10 = R.string.ForwardTo;
                } else {
                    i10 = R.string.SelectChat;
                }
                String string = LocaleController.getString(i10);
                if (this.Q3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(string);
                } else {
                    this.actionBar.J(string, true, 350L, org.telegram.ui.Components.wr.h);
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
                    if (!this.W3 && (xq0Var = this.G2) != null) {
                        this.W3 = true;
                        String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                        xq0Var.j();
                        xq0Var.F = string2;
                        org.telegram.ui.Components.vq0 vq0Var = xq0Var.f29126a[0];
                        if (string2 != null) {
                            vq0Var.e.l(string2, false);
                        }
                        org.telegram.ui.Components.kc0 kc0Var = new org.telegram.ui.Components.kc0(xq0Var, 29);
                        xq0Var.G = kc0Var;
                        AndroidUtilities.runOnUIThread(kc0Var, 1000L);
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
                if (this.Q3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]));
                } else {
                    this.actionBar.J(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.wr.h);
                }
            }
            this.Q3 = arrayList.isEmpty();
        } else if (this.R0 == 10) {
            c4(arrayList.isEmpty());
        }
    }

    public final void b4(boolean z10) {
        int i10;
        boolean z11;
        this.actionBar.r();
        this.I2.clear();
        org.telegram.ui.ActionBar.i2 i2Var = this.f38432e1;
        if (i2Var != null) {
            i2Var.c(0.0f, true);
        }
        uw uwVar = this.f38536z0;
        if (uwVar != null) {
            uwVar.b(org.telegram.ui.ActionBar.j6.K8, org.telegram.ui.ActionBar.j6.I8, org.telegram.ui.ActionBar.j6.J8, org.telegram.ui.ActionBar.j6.L8, org.telegram.ui.ActionBar.j6.f17928d6);
        }
        ValueAnimator valueAnimator = this.f38514u3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f38514u3 = null;
        }
        if (this.f38509t3 == 0.0f) {
            return;
        }
        C4(-T3());
        int i11 = 0;
        while (true) {
            vy[] vyVarArr = this.f38431e0;
            if (i11 >= vyVarArr.length) {
                break;
            }
            vy vyVar = vyVarArr[i11];
            if (vyVar != null) {
                vyVar.f37645a.I0(true);
            }
            i11++;
        }
        if (this.K) {
            i10 = 81;
        } else {
            i10 = 0;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp(i10 + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38509t3, 0.0f);
        this.f38514u3 = ofFloat;
        ofFloat.addUpdateListener(new zv(this, max, 1));
        this.f38514u3.addListener(new zx(this, max, 0));
        this.f38514u3.setInterpolator(org.telegram.ui.Components.wr.f28819f);
        this.f38514u3.setDuration(200L);
        this.f38514u3.start();
        this.Y0 = false;
        ArrayList arrayList = this.f38411a1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i12);
                h10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
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
        if (this.f38431e0 != null) {
            int i13 = 0;
            while (true) {
                vy[] vyVarArr2 = this.f38431e0;
                if (i13 >= vyVarArr2.length) {
                    break;
                }
                vyVarArr2[i13].d.H = z11;
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
        org.telegram.ui.Components.xq0 xq0Var = this.G2;
        if (xq0Var != null) {
            int i10 = this.currentAccount;
            xq0Var.h(i10);
            xq0Var.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
            ArrayList arrayList = xq0Var.f29129f;
            arrayList.clear();
            ArrayList arrayList2 = this.I2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            org.telegram.ui.Components.vq0 vq0Var = xq0Var.f29126a[0];
            if (xq0Var.f29127b == 1) {
                vq0Var.d.l(xq0Var.c(vq0Var), false);
            }
        }
    }

    public final void c4(boolean z10) {
        if (this.F3.c()) {
            z10 = true;
        }
        if (!z10 || !this.f38417b2) {
            this.U3 = z10;
            Y4(true);
            if (z10) {
                bi.x4 x4Var = this.f38484p0;
                if (x4Var != null) {
                    x4Var.e(true);
                }
                bi.x4 x4Var2 = this.f38489q0;
                if (x4Var2 != null) {
                    x4Var2.e(true);
                }
            }
        }
    }

    public final void c5(boolean z10) {
        boolean z11;
        if (this.f38466l0 == null) {
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
        uw uwVar;
        if (!this.F3.c()) {
            if (this.R0 == 3 && (uwVar = this.f38536z0) != null && uwVar.getVisibility() == 0 && this.f38536z0.K > 0) {
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
            gy gyVar = this.C0;
            if (gyVar != null) {
                gyVar.R();
                return true;
            }
            return true;
        }
        return super.closeLastFragment();
    }

    @Override
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        org.telegram.ui.Components.y7 y7Var = new org.telegram.ui.Components.y7(this, context, this.resourceProvider, 3);
        y7Var.setAllowOverlayTitle(true);
        y7Var.L();
        y7Var.A(getThemedColor(org.telegram.ui.ActionBar.j6.f18220t8), false);
        y7Var.A(getThemedColor(org.telegram.ui.ActionBar.j6.f18327z8), true);
        y7Var.C(getThemedColor(org.telegram.ui.ActionBar.j6.f18256v8), false);
        y7Var.C(getThemedColor(org.telegram.ui.ActionBar.j6.f18308y8), true);
        y7Var.k();
        y7Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        y7Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.V2 == 0 || e4())) {
            return y7Var;
        }
        y7Var.setOccupyStatusBar(false);
        return y7Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.createView(android.content.Context):android.view.View");
    }

    public final void d5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.n5 n5Var;
        nx nxVar = this.E0;
        org.telegram.ui.Components.n5 n5Var2 = null;
        if (nxVar != null && (n5Var = nxVar.f48597a0) != null && nxVar.f48616q0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                n5Var.j(emojiStatusDocumentId.longValue(), z10);
                n5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z10);
            } else if (user != null && MessagesController.getInstance(nxVar.f48604f).isPremiumUser(user)) {
                if (nxVar.N0 == null) {
                    nxVar.N0 = nxVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    nxVar.N0 = new org.telegram.ui.Components.o5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), nxVar.N0);
                }
                nxVar.N0.setColorFilter(new PorterDuffColorFilter(nxVar.f(org.telegram.ui.ActionBar.j6.f18336zh), PorterDuff.Mode.MULTIPLY));
                n5Var.g(nxVar.N0, z10);
                n5Var.m(false, z10);
            } else {
                n5Var.g(null, z10);
                n5Var.m(false, z10);
            }
            n5Var.k(Integer.valueOf(nxVar.f(org.telegram.ui.ActionBar.j6.f18336zh)));
            nxVar.W.invalidate();
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
                this.actionBar.setRightDrawableOnClick(new xv(this, 2));
                l71.t(this.currentAccount);
            } else if (user != null && MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
                if (this.L3 == null) {
                    this.L3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    this.L3 = new org.telegram.ui.Components.o5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.L3);
                }
                this.L3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f18336zh), PorterDuff.Mode.MULTIPLY));
                this.D3.g(this.L3, z10);
                this.D3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(new xv(this, 3));
                l71.t(this.currentAccount);
            } else {
                this.D3.g(null, z10);
                this.D3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.n5 n5Var3 = this.D3;
            int i10 = org.telegram.ui.ActionBar.j6.f18336zh;
            n5Var3.k(Integer.valueOf(getThemedColor(i10)));
            org.telegram.ui.Cells.o oVar = this.E3;
            if (oVar != null) {
                oVar.setColor(getThemedColor(i10));
            }
            sx sxVar = this.M0;
            if (sxVar != null && (sxVar.getContentView() instanceof l71)) {
                org.telegram.ui.ActionBar.l5 titleTextView = this.actionBar.getTitleTextView();
                l71 l71Var = (l71) this.M0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.n5 n5Var4 = this.D3;
                    if (rightDrawable == n5Var4) {
                        n5Var2 = n5Var4;
                    }
                }
                l71Var.y(n5Var2, titleTextView);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r27, int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (!(dialog instanceof di.n3) && super.dismissDialogOnPause(dialog)) {
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
        bi.x4 x4Var;
        boolean storiesEnabled = getMessagesController().storiesEnabled();
        if (this.O3 != storiesEnabled) {
            X4();
            if (!this.O3 && storiesEnabled && (x4Var = this.f38484p0) != null) {
                x4Var.u();
            }
            this.O3 = storiesEnabled;
        }
        org.telegram.ui.Components.h20 h20Var = this.f38506t0;
        if (h20Var == null) {
            return;
        }
        if (this.R0 == 10) {
            h20Var.setImageResource(R.drawable.floating_check);
            this.f38506t0.setContentDescription(LocaleController.getString(R.string.Done));
            return;
        }
        h20Var.setImageResource(R.drawable.filled_fab_compose_32);
        this.f38506t0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
    }

    public final boolean f4(long j3) {
        if (j3 < 0) {
            return false;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f17342id);
        if ((topics != null && !topics.isEmpty()) || !MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f17342id)) {
            return false;
        }
        return true;
    }

    public final void f5(boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        boolean z11;
        boolean z12;
        zh.i5 X3;
        ArrayList arrayList;
        boolean z13;
        boolean z14;
        int i10;
        float f7;
        float f10;
        if (this.E0 != null && this.I == null) {
            qx qxVar = this.F3;
            if ((qxVar == null || !qxVar.c()) && !this.f38487p3 && (lVar = this.actionBar) != null && !lVar.s() && !this.f38467l2) {
                bi.ce ceVar = bi.ce.F2;
                int i11 = 0;
                if ((ceVar != null && ceVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
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
                    if (!z11 && (((arrayList = (X3 = X3()).f48503g) != null && arrayList.size() > 0) || X3.H())) {
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
                    nx nxVar = this.E0;
                    if (z13 != z15) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    nxVar.p(z10, z14);
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
                        ofFloat.addUpdateListener(new ej(1, this));
                        this.J.addListener(new org.telegram.ui.Components.voip.v2(this, 7));
                        this.J.setDuration(200L);
                        this.J.setInterpolator(org.telegram.ui.Components.wr.f28819f);
                        this.J.start();
                    } else {
                        nx nxVar2 = this.E0;
                        if (z16 && !isInPreviewMode()) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        nxVar2.setVisibility(i10);
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
                        ofFloat2.addUpdateListener(new fy(this, f13, z12, f11));
                        this.I.addListener(new wx(this, z12, 2));
                        this.I.setDuration(200L);
                        this.I.setInterpolator(org.telegram.ui.Components.wr.f28819f);
                        this.I.start();
                        return;
                    }
                    this.K = z12;
                    nx nxVar3 = this.E0;
                    if ((z12 || this.L) && !isInPreviewMode()) {
                        i12 = 0;
                    }
                    nxVar3.setVisibility(i12);
                    if (!z12) {
                        C4(0.0f);
                    } else {
                        this.f38531x3 = -AndroidUtilities.dp(81.0f);
                        C4(-T3());
                    }
                    while (true) {
                        vy[] vyVarArr = this.f38431e0;
                        if (i11 >= vyVarArr.length) {
                            break;
                        }
                        vy vyVar = vyVarArr[i11];
                        if (vyVar != null) {
                            vyVar.f37645a.requestLayout();
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
        org.telegram.ui.Components.w70 w70Var = this.L0;
        if (w70Var != null) {
            w70Var.u();
        }
    }

    public final boolean g4(TLRPC.Dialog dialog) {
        char c10;
        if (dialog == null) {
            return false;
        }
        int i10 = this.f38431e0[0].f37651s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.s() || this.actionBar.t(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f38431e0[0].f37651s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            dialogFilter = dialogFilterArr[c10];
        }
        if (dialogFilter != null) {
            if (dialogFilter.pinnedDialogs.indexOfKey(dialog.f17199id) < 0) {
                return false;
            }
            return true;
        }
        return dialog.pinned;
    }

    public final void g5(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.g5(int, boolean):void");
    }

    @Override
    public final org.telegram.ui.ActionBar.b5 getBackButtonState() {
        if (!e4() && !this.F3.f36223f) {
            return org.telegram.ui.ActionBar.b5.f17554b;
        }
        return org.telegram.ui.ActionBar.b5.f17553a;
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        int i10;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X3, 1.0f);
            this.f38413a4 = ofFloat;
            return ofFloat;
        }
        if (getLayoutContainer() != null && getLayoutContainer().getMeasuredWidth() > 0) {
            i10 = (int) Utilities.clamp((200.0f / getLayoutContainer().getMeasuredWidth()) * f7, 200.0f, 80.0f);
        } else {
            i10 = 150;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.X3, 1.0f);
        this.f38413a4 = ofFloat2;
        ofFloat2.addUpdateListener(new tv(this, 2));
        this.f38413a4.setInterpolator(org.telegram.ui.Components.wr.f28820g);
        this.f38413a4.setDuration(i10);
        this.f38413a4.start();
        return this.f38413a4;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.getThemeDescriptions():java.util.ArrayList");
    }

    public final boolean h4() {
        if (this.C2 == null && this.f38476n2 == null) {
            return true;
        }
        return false;
    }

    public final boolean h5(long j3) {
        TLRPC.Chat chat;
        gx gxVar;
        if ((this.S0 <= 1 && ((gxVar = this.B1) == null || gxVar.getVisibility() != 0 || TextUtils.isEmpty(this.B1.getFieldText()))) || !DialogObject.isChatDialog(j3) || (chat = getMessagesController().getChat(Long.valueOf(-j3))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.d5.u0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    public final boolean i3(long j3, View view) {
        if (this.f38467l2 && getMessagesController().isForum(j3)) {
            return false;
        }
        Long valueOf = Long.valueOf(j3);
        ArrayList arrayList = this.I2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j3));
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).V(false, true);
            } else if (view instanceof org.telegram.ui.Cells.j6) {
                ((org.telegram.ui.Cells.j6) view).s(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j3));
        if (view instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view).V(true, true);
        } else if (view instanceof org.telegram.ui.Cells.j6) {
            ((org.telegram.ui.Cells.j6) view).s(true, true);
        }
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        qx qxVar;
        if (!this.f38459j2 && (qxVar = this.F3) != null && qxVar.getFragment() != null) {
            return this.F3.getFragment().isLightStatusBar();
        }
        if (i0.a.f(getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j3(fg.q0 q0Var) {
        gy gyVar;
        if (this.f38487p3 && (gyVar = this.C0) != null) {
            ArrayList arrayList = gyVar.A0;
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (q0Var.b((fg.q0) arrayList.get(i10))) {
                        return;
                    }
                }
            }
            arrayList.add(q0Var);
            my myVar = this.X;
            ArrayList arrayList2 = myVar.F;
            arrayList2.add(q0Var);
            myVar.I = arrayList2.size() - 1;
            myVar.f();
            this.X.f24572r.getText().clear();
            W4(true, null, null, false, true);
        }
    }

    public final void j4(long r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.j4(long):void");
    }

    public final void k3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.V2 == 0 && this.X2 == 0 && Build.VERSION.SDK_INT >= 33 && hk0.n(parentActivity)) {
                if (z10) {
                    showDialog(new hk0(parentActivity, !org.telegram.ui.Components.me0.c(), new iw(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().syncContacts && this.U1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z10) {
                    org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.d5.w(parentActivity, new bw(this, 1)).f17528a;
                    this.T1 = d2Var;
                    showDialog(d2Var);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.k4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    public final void l3(CharSequence charSequence) {
        int i10;
        if (this.B1 != null) {
            if (this.D2 == null && this.E2 == null && this.F2 == null) {
                return;
            }
            if (this.G2 == null) {
                org.telegram.ui.Components.xq0 xq0Var = new org.telegram.ui.Components.xq0(getParentActivity(), getResourceProvider());
                this.G2 = xq0Var;
                xq0Var.setLayoutClickListener(new xv(this, 0));
                this.G2.setOnModeChangeListener(new yv(this, 0));
                gx gxVar = this.B1;
                org.telegram.ui.Components.xq0 xq0Var2 = this.G2;
                if (xq0Var2 == null) {
                    gxVar.getClass();
                } else {
                    gxVar.F1 = xq0Var2;
                    gxVar.addView(xq0Var2, 0, w7.a6.e(-1, 48, 51));
                    gxVar.f20853f3 = false;
                    gxVar.N();
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
                    org.telegram.ui.Components.xq0 xq0Var3 = this.G2;
                    xq0Var3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        xq0Var3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.F2;
                    if (charSequence2 != null) {
                        org.telegram.ui.Components.xq0 xq0Var4 = this.G2;
                        xq0Var4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            xq0Var4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.B1.setFieldText(charSequence);
            }
            gx gxVar2 = this.B1;
            if (a4()) {
                i10 = R.string.AddCaption;
            } else {
                i10 = R.string.ShareComment;
            }
            gxVar2.setOverrideHint(LocaleController.getString(i10));
            v3();
            if (this.G2.getMode() != 0) {
                this.B1.x1(false, false);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.m3():void");
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
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.f6) null, false);
        h3Var.fixNavigationBar();
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
        wv wvVar = new wv(this, 0);
        h3Var.items = charSequenceArr;
        h3Var.itemIcons = iArr;
        h3Var.onClickListener = wvVar;
        showDialog(h3Var);
    }

    public final int n3() {
        if (this.B1 != null) {
            return (int) (this.f38534y1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        } else if (this.X2 != 0) {
            return AndroidUtilities.dp(72.0f) + this.f38446g4;
        } else {
            return this.f38446g4 + this.f38456i4;
        }
    }

    public final void n4(android.view.View r26, int r27, s4.h0 r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.n4(android.view.View, int, s4.h0):void");
    }

    public final void o3() {
        AndroidUtilities.runOnUIThread(new rv(this, 2), 300L);
    }

    public final boolean o4(View view, int i10, float f7, org.telegram.ui.Components.ul0 ul0Var) {
        org.telegram.ui.Components.ao0 ao0Var;
        long j3;
        org.telegram.ui.Components.ao0 ao0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.z2) && ul0Var.j(i10) != 21) {
            if (!this.actionBar.s() && !AndroidUtilities.isTablet() && !this.f38467l2 && (view instanceof org.telegram.ui.Cells.r2)) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                if (!getMessagesController().isForum(r2Var.getDialogId()) && !this.F3.c() && r2Var.S(f7)) {
                    return H4(r2Var);
                }
            }
            qx qxVar = this.F3;
            if (qxVar == null || !qxVar.c()) {
                gy gyVar = this.C0;
                boolean z10 = true;
                if (gyVar != null && ul0Var == (ao0Var2 = gyVar.f23713b0)) {
                    Object J = ao0Var2.J(i10);
                    if (!this.C0.f23713b0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                        d2Var.R = string;
                        if (J instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) J;
                            if (chat.monoforum) {
                                d2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, mg.d.i(chat, this.currentAccount, false));
                            } else {
                                d2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            makeEncryptedDialogId = -chat.f17195id;
                        } else if (J instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) J;
                            if (user.f17342id == getUserConfig().clientUserId) {
                                d2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                d2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            makeEncryptedDialogId = user.f17342id;
                        } else if (J instanceof TLRPC.EncryptedChat) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) J).user_id));
                            d2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.f17203id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new bi.za(this, makeEncryptedDialogId, 7));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(d2Var);
                        TextView textView = (TextView) d2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18162q7));
                        }
                        return true;
                    }
                }
                gy gyVar2 = this.C0;
                if (gyVar2 != null && ul0Var == (ao0Var = gyVar2.f23713b0)) {
                    if (this.f38467l2) {
                        n4(view, i10, ul0Var);
                        return false;
                    }
                    if ((view instanceof org.telegram.ui.Cells.j6) && !ao0Var.O(i10)) {
                        j3 = ((org.telegram.ui.Cells.j6) view).getDialogId();
                    } else {
                        j3 = 0;
                    }
                    if (j3 != 0) {
                        M4(j3, view);
                        return true;
                    }
                } else {
                    Object I = ((fg.m) ul0Var).I(i10);
                    if (I instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) I;
                        if (this.f38467l2) {
                            if ((this.R0 == 3 || I3()) && h5(dialog.f17199id)) {
                                if (this.R0 == 1 && I3() && this.f38470m2 && getMessagesController().isForum(dialog.f17199id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f17199id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.R0 != 1) {
                                        z10 = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z10);
                                    bundle.putBoolean("quote", this.O0);
                                    bundle.putBoolean("reply_to", this.N0);
                                    ig1 ig1Var = new ig1(bundle);
                                    ig1Var.L0 = this;
                                    presentFragment(ig1Var);
                                    return false;
                                }
                                i3(dialog.f17199id, view);
                                a5();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            m4(view);
                            return false;
                        } else if (!this.actionBar.s() || !g4(dialog)) {
                            M4(dialog.f17199id, view);
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
                gy gyVar = this.C0;
                if (gyVar != null) {
                    gyVar.R();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.w70 w70Var = this.L0;
            if (w70Var != null) {
                if (z10) {
                    w70Var.u();
                    this.L0 = null;
                    return false;
                }
            } else {
                uw uwVar = this.f38536z0;
                if (uwVar != null && uwVar.f26528n) {
                    if (z10) {
                        uwVar.setIsEditing(false);
                        I4(false);
                        return false;
                    }
                } else {
                    org.telegram.ui.ActionBar.l lVar = this.actionBar;
                    if (lVar != null && lVar.s()) {
                        if (z10) {
                            gy gyVar2 = this.C0;
                            if (gyVar2 != null && gyVar2.getVisibility() == 0) {
                                this.C0.Q(false);
                            }
                            b4(true);
                            return false;
                        }
                    } else if (this.f38414b.f12870f) {
                        if (z10) {
                            this.X.f24572r.getText().clear();
                            this.Y.b(false);
                            this.X.f24572r.clearFocus();
                            return false;
                        }
                    } else {
                        uw uwVar2 = this.f38536z0;
                        if (uwVar2 != null && uwVar2.getVisibility() == 0 && !this.f38445g3) {
                            uw uwVar3 = this.f38536z0;
                            if (!uwVar3.O && !this.f38468l3) {
                                ArrayList arrayList = uwVar3.h;
                                if (!arrayList.isEmpty() && uwVar3.L != ((org.telegram.ui.Components.n00) arrayList.get(0)).f25349a) {
                                    if (z10) {
                                        uw uwVar4 = this.f38536z0;
                                        ArrayList arrayList2 = uwVar4.h;
                                        if (!arrayList2.isEmpty()) {
                                            uwVar4.f((org.telegram.ui.Components.n00) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        gx gxVar = this.B1;
                        if (gxVar != null && gxVar.t0()) {
                            if (z10) {
                                this.B1.m0(true);
                            }
                        } else {
                            nx nxVar = this.E0;
                            if (nxVar.O == 0 && nxVar.S.L0() != 0) {
                                nxVar.h.x0(0);
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
        bi.nc ncVar;
        uw uwVar;
        if (this.V1) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.h(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                gy gyVar = this.C0;
                if (gyVar != null) {
                    gyVar.f23713b0.R(this.W1, tLObject);
                }
                this.X1 = null;
            }
            this.V1 = false;
        }
        if (!this.K && (uwVar = this.f38536z0) != null && uwVar.getVisibility() == 0 && this.f38494r.f12870f) {
            int i10 = (int) (-this.N);
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.f38431e0[0].f37645a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f38533y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        if (!isInPreviewMode() && (ncVar = this.K0) != null && ncVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        B3();
        this.f38495r0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        bi.x4 x4Var;
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
        if (this.f38495r0 && !this.f38501s0 && (x4Var = this.f38484p0) != null && this.O3) {
            this.f38501s0 = true;
            this.f38495r0 = false;
            x4Var.u();
        }
        AndroidUtilities.runOnUIThread(new kw(this, 3), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.w70 w70Var = this.L0;
        if (w70Var != null) {
            w70Var.u();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.d2 d2Var;
        super.onDialogDismiss(dialog);
        if (this.V2 == 0 && this.X2 == 0 && (d2Var = this.T1) != null && dialog == d2Var && getParentActivity() != null) {
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
            this.f38467l2 = bundle.getBoolean("onlySelect", false);
            this.f38470m2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f38491q2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.R0 = this.arguments.getInt("dialogsType", 0);
            this.O0 = this.arguments.getBoolean("quote", false);
            this.N0 = this.arguments.getBoolean("reply_to", false);
            this.P0 = this.arguments.getLong("reply_to_author", 0L);
            this.Q0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f38439f2 = this.arguments.getString("selectAlertString");
            this.f38444g2 = this.arguments.getString("selectAlertStringGroup");
            this.f38449h2 = this.arguments.getString("addToGroupAlertString");
            this.f38497r2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f38503s2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f38508t2 = this.arguments.getBoolean("afterSignup", false);
            this.V2 = this.arguments.getInt("folderId", 0);
            long j3 = this.arguments.getLong("community_id", 0L);
            this.X2 = j3;
            if (j3 != 0) {
                this.Y2 = getMessagesController().getChat(Long.valueOf(this.X2));
                this.Z2 = getMessagesController().getChatFull(this.X2);
            }
            this.f38454i2 = this.arguments.getBoolean("resetDelegate", true);
            this.S0 = this.arguments.getInt("messagesCount", 0);
            this.T0 = this.arguments.getInt("hasPoll", 0);
            this.U0 = this.arguments.getBoolean("hasInvoice", false);
            this.f38513u2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f38513u2);
            this.arguments.getInt("otherwiseRelogin");
            this.f38518v2 = this.arguments.getBoolean("allowGroups", true);
            this.f38524w2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f38530x2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.f38535y2 = this.arguments.getBoolean("allowChannels", true);
            this.f38538z2 = this.arguments.getBoolean("allowUsers", true);
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
        this.K3 = NotificationCenter.getGlobalInstance().createObserversGroup(this);
        if (this.f38476n2 == null) {
            this.f38428d2 = getConnectionsManager().getConnectionState();
            this.K3.add(NotificationCenter.emojiLoaded);
            if (!this.f38467l2) {
                this.K3.add(NotificationCenter.closeSearchByActiveAction);
                this.K3.add(NotificationCenter.proxySettingsChanged);
                this.J3.add(NotificationCenter.filterSettingsUpdated);
                this.J3.add(NotificationCenter.dialogsUnreadCounterChanged);
            }
            this.J3.add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.dialogFiltersUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.encryptedChatUpdated).add(NotificationCenter.contactsDidLoad).add(NotificationCenter.appDidLogout).add(NotificationCenter.openedChatChanged).add(NotificationCenter.notificationsSettingsUpdated).add(NotificationCenter.messageReceivedByAck).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messageSendError).add(NotificationCenter.needReloadRecentDialogsSearch).add(NotificationCenter.replyMessagesDidLoad).add(NotificationCenter.topicsDidLoaded).add(NotificationCenter.reloadHints).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.onDownloadingFilesChanged).add(NotificationCenter.needDeleteDialog).add(NotificationCenter.folderBecomeEmpty).add(NotificationCenter.newSuggestionsAvailable).add(NotificationCenter.dialogsUnreadReactionsCounterChanged).add(NotificationCenter.dialogsUnreadPollVotesCounterChanged).add(NotificationCenter.forceImportContactsStart).add(NotificationCenter.userEmojiStatusUpdated).add(NotificationCenter.currentUserPremiumStatusChanged);
            this.K3.add(NotificationCenter.didSetPasscode);
        }
        this.J3.add(NotificationCenter.messagesDeleted).add(NotificationCenter.onDatabaseMigration).add(NotificationCenter.onDatabaseOpened).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.didClearDatabase).add(NotificationCenter.onDatabaseReset).add(NotificationCenter.storiesUpdated).add(NotificationCenter.storiesEnabledUpdate).add(NotificationCenter.unconfirmedAuthUpdate).add(NotificationCenter.premiumPromoUpdated).add(NotificationCenter.starBalanceUpdated).add(NotificationCenter.starSubscriptionsLoaded).add(NotificationCenter.communityPendingRequestsUpdate).add(NotificationCenter.communitySwitchedCollapsed).add(NotificationCenter.appConfigUpdated).add(NotificationCenter.activeAuctionsUpdated);
        if (this.R0 == 0) {
            this.J3.add(NotificationCenter.chatlistFolderUpdate);
            this.J3.add(NotificationCenter.dialogTranslate);
        }
        i4(getAccountInstance());
        zh.i5 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.f48514s) {
                ConnectionsManager.getInstance(storiesController.f48499a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new zh.j4(storiesController, 0));
            }
        }
        getMessagesController().loadPinnedDialogs(this.V2, 0L, null);
        if (this.R3 != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            dv dvVar = this.R3;
            if (dvVar.getParent() != null) {
                ((ViewGroup) dvVar.getParent()).removeView(dvVar);
            }
            this.R3 = null;
        }
        if (e4()) {
            zh.i5 storiesController2 = getMessagesController().getStoriesController();
            if (storiesController2.f48520z) {
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
        this.f38456i4 = i10;
        if (this.W) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f38460j4 = i11;
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
        NotificationCenter.ObserversGroup observersGroup2 = this.K3;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.K3 = null;
        }
        gx gxVar = this.B1;
        if (gxVar != null) {
            gxVar.B0();
        }
        org.telegram.ui.Components.xq0 xq0Var = this.G2;
        if (xq0Var != null) {
            xq0Var.j();
        }
        uv uvVar = this.H2;
        if (uvVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uvVar);
            this.H2 = null;
        }
        UndoView undoView = this.f38533y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f38482o3.unlock();
        this.C2 = null;
        nb1 nb1Var = nb1.f35201b;
        if (nb1Var != null) {
            nb1Var.dismiss();
            nb1.f35201b = null;
        }
    }

    @Override
    public final void onPanTranslationUpdate(float f7) {
        if (this.f38431e0 != null) {
            this.J0 = f7;
            gx gxVar = this.B1;
            int i10 = 0;
            if (gxVar != null && gxVar.t0()) {
                this.fragmentView.setTranslationY(f7);
                while (true) {
                    vy[] vyVarArr = this.f38431e0;
                    if (i10 >= vyVarArr.length) {
                        break;
                    }
                    vyVarArr[i10].setTranslationY(0.0f);
                    i10++;
                }
                if (!this.f38467l2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.pc pcVar = this.f38477n3;
                    if (pcVar != null) {
                        pcVar.l();
                    }
                }
                gy gyVar = this.C0;
                if (gyVar != null) {
                    gyVar.setTranslationY(this.I0);
                    return;
                }
                return;
            }
            while (true) {
                vy[] vyVarArr2 = this.f38431e0;
                if (i10 >= vyVarArr2.length) {
                    break;
                }
                vyVarArr2[i10].setTranslationY(f7);
                i10++;
            }
            if (!this.f38467l2) {
                this.actionBar.setTranslationY(f7);
                org.telegram.ui.Components.pc pcVar2 = this.f38477n3;
                if (pcVar2 != null) {
                    pcVar2.l();
                }
            }
            gy gyVar2 = this.C0;
            if (gyVar2 != null) {
                gyVar2.setTranslationY(this.J0 + this.I0);
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
        qx qxVar = this.F3;
        if (qxVar != null) {
            qxVar.f36225r = true;
            xx xxVar = qxVar.f36220a;
            if (xxVar != null) {
                xxVar.onPause();
            }
        }
        org.telegram.ui.Components.w70 w70Var = this.L0;
        if (w70Var != null) {
            w70Var.u();
        }
        gx gxVar = this.B1;
        if (gxVar != null) {
            gxVar.D0();
        }
        int i10 = 0;
        UndoView undoView = this.f38533y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        setBulletinDelegate(null);
        if (this.f38431e0 == null) {
            return;
        }
        while (true) {
            vy[] vyVarArr = this.f38431e0;
            if (i10 < vyVarArr.length) {
                vyVarArr[i10].d.getClass();
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
                                hk0.m();
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
                                AndroidUtilities.runOnUIThread(new kw(this, 2));
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
        wy wyVar;
        vy vyVar;
        dx dxVar;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.Components.ao0 ao0Var;
        bi.nc ncVar;
        super.onResume();
        nx nxVar = this.E0;
        char c10 = 0;
        if (nxVar != null) {
            ArrayList arrayList = nxVar.f48626x;
            zh.i5 i5Var = nxVar.f48619s;
            i5Var.l(i5Var.f48503g);
            i5Var.l(i5Var.h);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.PeerStories y3 = i5Var.y(((zh.j) arrayList.get(i11)).f48525c);
                if (y3 != null) {
                    i5Var.X(y3);
                }
            }
        }
        qx qxVar = this.F3;
        if (qxVar != null) {
            qxVar.f36225r = false;
            xx xxVar = qxVar.f36220a;
            if (xxVar != null) {
                xxVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (ncVar = this.K0) != null && ncVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.f38431e0 != null) {
            int i12 = 0;
            while (true) {
                vy[] vyVarArr = this.f38431e0;
                if (i12 >= vyVarArr.length) {
                    break;
                }
                vyVarArr[i12].d.l();
                i12++;
            }
        }
        gx gxVar = this.B1;
        if (gxVar != null) {
            gxVar.E0();
        }
        long j3 = 0;
        if (!this.f38467l2 && this.V2 == 0 && this.X2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        gy gyVar = this.C0;
        if (gyVar != null && (ao0Var = gyVar.f23713b0) != null) {
            ao0Var.l();
        }
        if (!this.f38508t2 && getUserConfig().unacceptedTermsOfService != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.V2 == 0 && this.X2 == 0 && this.f38423c2 && !this.f38467l2 && (i10 = Build.VERSION.SDK_INT) >= 23) {
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.f38423c2 = false;
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
                wyVar = this;
                org.telegram.messenger.q1 q1Var = new org.telegram.messenger.q1(wyVar, z13, z11, z12, parentActivity);
                if (wyVar.f38508t2 && (z11 || z13)) {
                    j3 = 4000;
                }
                AndroidUtilities.runOnUIThread(q1Var, j3);
            } else {
                wyVar = this;
            }
        } else {
            wyVar = this;
            if (!wyVar.f38467l2 && wyVar.V2 == 0 && wyVar.X2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(10020)) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.j6.L5), null);
                        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new yv(this, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.gp0(17));
                        showDialog(alertDialog$Builder.f17528a);
                    }
                } else {
                    return;
                }
            } else if (wyVar.V2 == 0 && wyVar.X2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.j6.L5), null);
                        alertDialog$Builder2.f17528a.T = LocaleController.getString(R.string.PermissionFSILockscreen);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new yv(this, 9));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.gp0(18));
                        showDialog(alertDialog$Builder2.f17528a);
                    }
                } else {
                    return;
                }
            }
        }
        J4();
        if (wyVar.f38431e0 != null) {
            int i13 = 0;
            while (true) {
                vy[] vyVarArr2 = wyVar.f38431e0;
                if (i13 >= vyVarArr2.length) {
                    break;
                }
                vy vyVar2 = vyVarArr2[i13];
                if (vyVar2.f37651s == 0 && vyVar2.v == 2 && vyVar2.f37647c.L0() == 0 && Z3()) {
                    wyVar.f38431e0[i13].f37647c.h1(1, (int) wyVar.N);
                }
                if (i13 == 0) {
                    wyVar.f38431e0[i13].d.getClass();
                } else {
                    wyVar.f38431e0[i13].d.getClass();
                }
                i13++;
            }
        }
        L4();
        setBulletinDelegate(new z8(this, 4));
        if (wyVar.f38487p3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), wyVar.classGuid);
        }
        g5(0, false);
        Z4(false, true);
        f5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            nb1.n(this);
        }
        B3();
        if (wyVar.f38536z0 != null && (vyVar = wyVar.f38431e0[0]) != null && (dxVar = vyVar.d) != null) {
            int i14 = dxVar.h;
            if (i14 == 7 || i14 == 8) {
                MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
                if (i14 != 7) {
                    c10 = 1;
                }
                MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                if (dialogFilter != null) {
                    wyVar.f38536z0.h(dialogFilter.localId);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f7) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.Z3 && this.f38413a4 == null) {
            F4(f7);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        bi.nc ncVar;
        wy wyVar;
        qx qxVar = this.F3;
        if (qxVar != null && qxVar.c()) {
            this.F3.getFragment().onTransitionAnimationEnd(z10, z11);
        } else {
            if (z10 && (ncVar = this.K0) != null && ncVar.getVisibility() == 0) {
                this.K0.setVisibility(8);
                this.K0.setBackground(null);
            }
            if (z10 && this.f38508t2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f29971x0.c(false);
                }
            }
        }
        if (!z10 && (wyVar = this.W2) != null) {
            wyVar.removeSelfFromStack();
        }
        B3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        qx qxVar = this.F3;
        if (qxVar != null && qxVar.c()) {
            this.F3.getFragment().onTransitionAnimationProgress(z10, f7);
        } else {
            bi.nc ncVar = this.K0;
            if (ncVar != null && ncVar.getVisibility() == 0) {
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
        if (i11 != 15 && i11 != 16 && this.f38449h2 == null && this.f38503s2) {
            if (DialogObject.isChatDialog(j3)) {
                long j10 = -j3;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    if (this.f38491q2 || !ChatObject.isCanWriteToChannel(j10, this.currentAccount) || (i10 = this.T0) == 2 || i10 == 3) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.SendMessageTitle);
                        int i12 = this.T0;
                        if (i12 == 3) {
                            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.TodoCantForward);
                        } else if (i12 == 2) {
                            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.PublicPollCantForward);
                        } else {
                            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        showDialog(alertDialog$Builder.f17528a);
                        return false;
                    }
                    return true;
                }
                return true;
            } else if (DialogObject.isEncryptedDialog(j3)) {
                if (this.T0 != 0 || this.U0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.f17528a.R = LocaleController.getString(R.string.SendMessageTitle);
                    int i13 = this.T0;
                    if (i13 == 3) {
                        alertDialog$Builder2.f17528a.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i13 != 0) {
                        alertDialog$Builder2.f17528a.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        alertDialog$Builder2.f17528a.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    showDialog(alertDialog$Builder2.f17528a);
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
        Collections.sort(arrayList, new org.telegram.ui.Components.m9(14));
        org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(this, view);
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
                linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(getThemedColor(org.telegram.ui.ActionBar.j6.f18017i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
                g9Var.r(currentUser);
                org.telegram.ui.Components.sg0 sg0Var = new org.telegram.ui.Components.sg0(this, getParentActivity(), z10);
                linearLayout.addView(sg0Var, w7.a6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getParentActivity());
                if (z10) {
                    w9Var.setScaleX(0.833f);
                    w9Var.setScaleY(0.833f);
                }
                w9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                w9Var.getImageReceiver().setCurrentAccount(intValue);
                w9Var.e(currentUser, g9Var);
                sg0Var.addView(w9Var, w7.a6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18034j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.a6.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new org.telegram.ui.Cells.wa(this, intValue, H, 11));
                H.r(linearLayout, w7.a6.n(230, 48));
            }
        }
        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
        H.f28707z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        H.W(b02);
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        H.V(5);
        H.Z();
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.Z3 = true;
            B4(true);
            return;
        }
        this.f38413a4 = null;
        this.Z3 = false;
        B4(false);
        F4(1.0f);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        boolean presentFragment = super.presentFragment(p2Var);
        if (presentFragment && this.f38431e0 != null) {
            int i10 = 0;
            while (true) {
                vy[] vyVarArr = this.f38431e0;
                if (i10 >= vyVarArr.length) {
                    break;
                }
                vyVarArr[i10].d.getClass();
                i10++;
            }
        }
        bi.x4 x4Var = this.f38484p0;
        if (x4Var != null) {
            x4Var.e(true);
        }
        bi.x4 x4Var2 = this.f38489q0;
        if (x4Var2 != null) {
            x4Var2.e(true);
        }
        org.telegram.ui.Components.pc.e();
        return presentFragment;
    }

    public final void q3(boolean z10) {
        fi.j jVar;
        TLRPC.ChatFull chatFull;
        boolean z11;
        org.telegram.ui.Components.qs qsVar = this.J1;
        if (qsVar != null && (jVar = this.Q1) != null && (chatFull = this.Z2) != null) {
            if (this.X2 != 0 && chatFull.requests_pending > 0 && !this.f38414b.f12870f) {
                z11 = true;
            } else {
                z11 = false;
            }
            qsVar.i(jVar, z11, z10);
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

    public final void r3(vy vyVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i10;
        boolean z14;
        int L0 = vyVar.f37647c.L0();
        int N0 = vyVar.f37647c.N0();
        if (!this.f38445g3 && !this.f38468l3) {
            uw uwVar = this.f38536z0;
            if (uwVar == null || uwVar.getVisibility() != 0 || !this.f38536z0.O) {
                int abs = Math.abs(N0 - L0) + 1;
                if (N0 != -1) {
                    s4.c1 K = vyVar.f37645a.K(N0);
                    if (K != null && K.f41613f == 11) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f38417b2 = z14;
                    if (z14) {
                        c4(false);
                    }
                } else {
                    this.f38417b2 = false;
                }
                int i11 = vyVar.f37651s;
                if (i11 == 7 || i11 == 8) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                    int i12 = vyVar.h;
                    if (i12 >= 0 && i12 < dialogFilters.size() && (dialogFilters.get(vyVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= R3(this.currentAccount, vyVar.f37651s, 1, this.S1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                        boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                        boolean z15 = !isDialogsEndReached;
                        if (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) {
                            z10 = z15;
                            z11 = false;
                        } else {
                            z10 = z15;
                            z11 = true;
                        }
                        if ((abs <= 0 && N0 >= R3(this.currentAccount, vyVar.f37651s, this.V2, this.S1).size() - 10) || (abs == 0 && (((i10 = vyVar.f37651s) == 7 || i10 == 8) && !getMessagesController().isDialogsEndReached(this.V2)))) {
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
                                    wy wyVar = wy.this;
                                    if (z12) {
                                        wyVar.getMessagesController().loadDialogs(wyVar.V2, -1, 100, z13);
                                    }
                                    if (z11) {
                                        wyVar.getMessagesController().loadDialogs(1, -1, 100, z10);
                                    } else {
                                        wyVar.getClass();
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
                        wy wyVar = wy.this;
                        if (z12) {
                            wyVar.getMessagesController().loadDialogs(wyVar.V2, -1, 100, z13);
                        }
                        if (z11) {
                            wyVar.getMessagesController().loadDialogs(1, -1, 100, z10);
                        } else {
                            wyVar.getClass();
                        }
                    }
                });
            }
        }
    }

    public final void r4(java.util.ArrayList r45, int r46, boolean r47, boolean r48, java.util.HashSet r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.r4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    public final void s3() {
        if (this.f38431e0 != null) {
            int n32 = n3();
            int i10 = 0;
            while (true) {
                vy[] vyVarArr = this.f38431e0;
                if (i10 < vyVarArr.length) {
                    vy vyVar = vyVarArr[i10];
                    if (vyVar != null) {
                        sy syVar = vyVar.f37645a;
                        syVar.setPadding(0, syVar.Y2, 0, n32);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void s4(long r14, boolean r16, org.telegram.messenger.MessagesController.DialogFilter r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.s4(long, boolean, org.telegram.messenger.MessagesController$DialogFilter, int, boolean):void");
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        nx nxVar = this.E0;
        if (nxVar != null) {
            if (this.G0 && !z10) {
                nxVar.setVisibility(0);
            } else {
                nxVar.setVisibility(8);
            }
        }
        Y4(true);
        U4();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r6, int r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    public final void t3() {
        gh.g gVar = this.f38534y1;
        if (gVar != null) {
            gVar.setBlurredBottomHeight(this.f38534y1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void t4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
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
        vy vyVar;
        boolean z10 = true;
        float S3 = S3(true);
        uw uwVar = this.f38536z0;
        if (uwVar != null) {
            if (uwVar.getAlpha() == S3) {
                z10 = false;
            }
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, S3);
            this.f38536z0.setAlpha(S3);
            this.f38536z0.setScaleX(lerp);
            this.f38536z0.setScaleY(lerp);
            uw uwVar2 = this.f38536z0;
            if (S3 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            uwVar2.setVisibility(i10);
            if (z10 && (vyVar = this.f38431e0[0]) != null) {
                vyVar.f37645a.requestLayout();
            }
        }
        S4();
    }

    public final void u4(vy vyVar) {
        int i10;
        org.telegram.ui.Components.a10 a10Var;
        if (vyVar.getVisibility() != 0) {
            return;
        }
        int i11 = vyVar.d.v;
        if (vyVar.f37651s == 0 && Z3() && vyVar.f37645a.getChildCount() == 0 && vyVar.v == 2) {
            ((s4.c0) vyVar.f37645a.getLayoutManager()).h1(1, (int) this.N);
        }
        vyVar.d.getClass();
        vyVar.d.U();
        int h = vyVar.d.h();
        if (h == 1 && i11 == 1 && vyVar.d.j(0) == 5) {
            vyVar.q(true);
        } else {
            vyVar.q(false);
            if (h > i11 && (i10 = this.R0) != 11 && i10 != 12 && i10 != 13) {
                vyVar.f37654y.b(i11);
            }
        }
        try {
            sy syVar = vyVar.f37645a;
            if (this.V2 == 0 && this.X2 == 0) {
                a10Var = vyVar.f37652w;
            } else {
                a10Var = null;
            }
            syVar.setEmptyView(a10Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
        r3(vyVar);
    }

    public final void v3() {
        int i10;
        int i11;
        float f7 = this.f38473n.e;
        float lerp = AndroidUtilities.lerp(0.2f, 1.0f, f7);
        hi.b2 b2Var = this.C1;
        int i12 = 8;
        if (b2Var != null) {
            b2Var.setScaleX(lerp);
            this.C1.setScaleY(lerp);
            this.C1.setAlpha(f7);
            hi.b2 b2Var2 = this.C1;
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            b2Var2.setVisibility(i11);
        }
        gh.g gVar = this.f38534y1;
        if (gVar != null) {
            gVar.setAlpha(f7);
            gh.g gVar2 = this.f38534y1;
            int i13 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            gVar2.setVisibility(i10);
            this.f38534y1.getFadeView().setAlpha(f7);
            View fadeView = this.f38534y1.getFadeView();
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
            animatorSet.setInterpolator(org.telegram.ui.Components.wr.f28819f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    public final void w3() {
        if (this.actionBar == null) {
            return;
        }
        org.telegram.ui.Components.h20.d(this.actionBar.getBackButton(), Math.max(this.f38509t3, (1.0f - this.f38414b.e) * (1.0f - V3()) * (1.0f - this.f38420c.e)));
    }

    public final void w4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wy.w4(int):void");
    }

    @Override
    public final eh.d x() {
        return this.f38478n4;
    }

    public final void x3() {
        float f7;
        if (this.f38452i0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.h20.d(this.f38442g0, com.google.android.gms.internal.vision.e2.C(f7, 1.0f - this.f38414b.e, 1.0f - V3(), 1.0f - this.f38420c.e));
    }

    public final void x4(boolean z10, boolean z11) {
        int i10;
        int i11;
        qx qxVar = this.F3;
        if (qxVar != null && qxVar.c()) {
            return;
        }
        if (this.f38431e0[0].f37651s == 0 && Z3() && this.f38431e0[0].v == 2) {
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
            org.telegram.ui.Components.yk0 yk0Var = this.f38431e0[0].f37650r;
            yk0Var.f29444b = 1;
            yk0Var.c(i10, i11, false, false);
            v4();
            return;
        }
        this.f38431e0[0].f37647c.h1(i10, i11);
        v4();
    }

    public final void y3() {
        float f7;
        if (SharedConfig.passcodeHash.isEmpty()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.h20.d(this.f38437f0, com.google.android.gms.internal.vision.e2.C(f7, 1.0f - this.f38414b.e, 1.0f - V3(), 1.0f - this.f38420c.e));
    }

    public final void y4(String str, boolean z10) {
        O4(true, false, true, false);
        my myVar = this.X;
        if (myVar != null) {
            myVar.f24572r.setText(str);
            this.X.f24572r.setSelection(str.length());
        }
    }

    @Override
    public final List z() {
        return Arrays.asList(new lg.a(LocaleController.getString(R.string.DebugDialogsActivity)), new lg.a(LocaleController.getString(R.string.ClearLocalDatabase), new rv(this, 27)), new lg.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new rv(this, 28)));
    }

    public final void z3() {
        float f7;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.h20.d(this.f38457j0, com.google.android.gms.internal.vision.e2.C(f7, this.f38436f.e, 1.0f - V3(), 1.0f - this.f38420c.e));
        nx nxVar = this.E0;
        if (nxVar != null) {
            nxVar.invalidate();
        }
    }

    public final void z4(float f7) {
        vy[] vyVarArr;
        this.f38421c0 = f7;
        for (vy vyVar : this.f38431e0) {
            sy syVar = vyVar.f37645a;
            for (int i10 = 0; i10 < syVar.getChildCount(); i10++) {
                View childAt = syVar.getChildAt(i10);
                if (childAt != null && RecyclerView.R(childAt) >= vyVar.d.f8139f + 1) {
                    childAt.setAlpha(f7);
                }
            }
        }
    }
}
