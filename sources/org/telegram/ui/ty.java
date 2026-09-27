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
public class ty extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, mg.b, le.e, ah0 {
    public static boolean f37950v4;
    public static final boolean[] f37951w4 = new boolean[4];
    public static final org.telegram.ui.Components.wr0 f37952x4 = new org.telegram.ui.Components.wr0(3);
    public static float f37953y4;
    public boolean A0;
    public FrameLayout A1;
    public boolean A2;
    public boolean A3;
    public int B0;
    public ax B1;
    public boolean B2;
    public Long B3;
    public ay C0;
    public ii.z1 C1;
    public ny C2;
    public Drawable C3;
    public org.telegram.ui.Components.dv0 D0;
    public org.telegram.ui.ActionBar.w0 D1;
    public ArrayList D2;
    public org.telegram.ui.Components.o5 D3;
    public boolean E;
    public hx E0;
    public final TextPaint E1;
    public String E2;
    public org.telegram.ui.Cells.o E3;
    public boolean F;
    public org.telegram.ui.Components.ks F0;
    public yw F1;
    public CharSequence F2;
    public kx F3;
    public TLRPC.RequestPeerType G;
    public boolean G0;
    public FrameLayout G1;
    public org.telegram.ui.Components.ar0 G2;
    public final zw G3;
    public long H;
    public float H0;
    public yw H1;
    public tv H2;
    public final zw H3;
    public ValueAnimator I;
    public float I0;
    public FrameLayout I1;
    public final ArrayList I2;
    public yg0 I3;
    public ValueAnimator J;
    public float J0;
    public org.telegram.ui.Components.ms J1;
    public boolean J2;
    public NotificationCenter.ObserversGroup J3;
    public boolean K;
    public ci.ab K0;
    public org.telegram.ui.Components.ls K1;
    public int K2;
    public Drawable K3;
    public boolean L;
    public org.telegram.ui.Components.a80 L0;
    public org.telegram.ui.Cells.m L1;
    public int L2;
    public int L3;
    public boolean M;
    public mx M0;
    public org.telegram.ui.Cells.a3 M1;
    public int M2;
    public boolean M3;
    public float N;
    public boolean N0;
    public org.telegram.ui.Cells.wa N1;
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
    public org.telegram.ui.Components.qc S;
    public int S0;
    public boolean S1;
    public int S2;
    public ArrayList S3;
    public float T;
    public int T0;
    public org.telegram.ui.ActionBar.c2 T1;
    public int T2;
    public boolean T3;
    public boolean U;
    public boolean U0;
    public boolean U1;
    public boolean U2;
    public CharSequence U3;
    public boolean V;
    public org.telegram.ui.Components.ld0 V0;
    public boolean V1;
    public int V2;
    public boolean V3;
    public boolean W;
    public org.telegram.ui.Cells.s2 W0;
    public long W1;
    public ty W2;
    public float W3;
    public gy X;
    public org.telegram.ui.Cells.s2 X0;
    public TLObject X1;
    public long X2;
    public boolean X3;
    public yf.g0 Y;
    public boolean Y0;
    public int Y1;
    public TLRPC.Chat Y2;
    public boolean Y3;
    public p41 Z;
    public boolean Z0;
    public int Z1;
    public TLRPC.ChatFull Z2;
    public ValueAnimator Z3;
    public final int f37954a;
    public org.telegram.ui.Components.x81 f37955a0;
    public final ArrayList f37956a1;
    public boolean a2;
    public org.telegram.ui.Components.w9 f37957a3;
    public org.telegram.ui.Components.x40 f37958a4;
    public final le.c f37959b;
    public gg.s0 f37960b0;
    public boolean f37961b1;
    public boolean f37962b2;
    public org.telegram.ui.Components.h9 f37963b3;
    public TLRPC.FileLocation f37964b4;
    public final le.c f37965c;
    public float f37966c0;
    public boolean f37967c1;
    public boolean f37968c2;
    public long f37969c3;
    public TLRPC.FileLocation f37970c4;
    public final le.c d;
    public ValueAnimator f37971d0;
    public boolean f37972d1;
    public int f37973d2;
    public boolean f37974d3;
    public org.telegram.ui.Components.qc f37975d4;
    public final le.c e;
    public sy[] f37976e0;
    public org.telegram.ui.ActionBar.h2 f37977e1;
    public boolean f37978e2;
    public boolean f37979e3;
    public int f37980e4;
    public final le.c f37981f;
    public org.telegram.ui.ActionBar.w0 f37982f0;
    public final Paint f37983f1;
    public String f37984f2;
    public AnimatorSet f37985f3;
    public int f37986f4;
    public org.telegram.ui.ActionBar.w0 f37987g0;
    public ImageView f37988g1;
    public String f37989g2;
    public boolean f37990g3;
    public int f37991g4;
    public final le.c h;
    public vy f37992h0;
    public NumberTextView f37993h1;
    public String f37994h2;
    public boolean f37995h3;
    public int f37996h4;
    public boolean f37997i0;
    public final ArrayList f37998i1;
    public boolean f37999i2;
    public float f38000i3;
    public int f38001i4;
    public org.telegram.ui.ActionBar.w0 f38002j0;
    public org.telegram.ui.ActionBar.w0 f38003j1;
    public boolean f38004j2;
    public boolean j3;
    public final ah.i f38005j4;
    public org.telegram.ui.ActionBar.w0 f38006k0;
    public org.telegram.ui.ActionBar.w0 f38007k1;
    public boolean f38008k2;
    public int f38009k3;
    public final fh.d f38010k4;
    public org.telegram.ui.ActionBar.w0 f38011l0;
    public org.telegram.ui.ActionBar.w0 l1;
    public boolean f38012l2;
    public boolean f38013l3;
    public final fh.d l4;
    public org.telegram.ui.ActionBar.w0 m0;
    public org.telegram.ui.ActionBar.w0 f38014m1;
    public boolean f38015m2;
    public boolean f38016m3;
    public final fh.c f38017m4;
    public final le.c f38018n;
    public org.telegram.ui.Components.si0 f38019n0;
    public org.telegram.ui.ActionBar.g1 f38020n1;
    public String f38021n2;
    public org.telegram.ui.Components.qc f38022n3;
    public final ah.c f38023n4;
    public org.telegram.ui.ActionBar.g1 f38024o0;
    public org.telegram.ui.ActionBar.g1 f38025o1;
    public String f38026o2;
    public final AnimationNotificationsLocker f38027o3;
    public final ah.c f38028o4;
    public ci.e4 f38029p0;
    public org.telegram.ui.ActionBar.g1 f38030p1;
    public final MessagesStorage.TopicKey f38031p2;
    public boolean f38032p3;
    public final ah.c f38033p4;
    public ci.e4 f38034q0;
    public org.telegram.ui.ActionBar.g1 f38035q1;
    public boolean f38036q2;
    public boolean f38037q3;
    public final ah.c f38038q4;
    public final le.c f38039r;
    public boolean f38040r0;
    public org.telegram.ui.ActionBar.g1 f38041r1;
    public boolean f38042r2;
    public boolean f38043r3;
    public hw f38044r4;
    public final le.c f38045s;
    public boolean f38046s0;
    public org.telegram.ui.ActionBar.g1 f38047s1;
    public boolean f38048s2;
    public boolean f38049s3;
    public final ArrayList f38050s4;
    public org.telegram.ui.Components.b20 f38051t0;
    public org.telegram.ui.ActionBar.g1 f38052t1;
    public boolean f38053t2;
    public float f38054t3;
    public final RectF f38055t4;
    public org.telegram.ui.Components.b20 f38056u0;
    public float f38057u1;
    public boolean f38058u2;
    public ValueAnimator f38059u3;
    public final RectF f38060u4;
    public final ph.i v;
    public ci.d f38061v0;
    public float f38062v1;
    public boolean f38063v2;
    public float f38064v3;
    public boolean f38065w;
    public jh.f f38066w0;
    public AnimatorSet f38067w1;
    public boolean f38068w2;
    public float f38069w3;
    public int f38070x;
    public int f38071x0;
    public float f38072x1;
    public boolean f38073x2;
    public float f38074x3;
    public boolean f38075y;
    public final UndoView[] f38076y0;
    public hh.g f38077y1;
    public boolean f38078y2;
    public int y3;
    public iy f38079z0;
    public FrameLayout f38080z1;
    public boolean f38081z2;
    public boolean f38082z3;

    public ty(Bundle bundle) {
        super(bundle);
        int i10;
        int dp;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            i10 = 48;
        } else {
            i10 = 0;
        }
        this.f37954a = i10;
        org.telegram.ui.Components.sr srVar = org.telegram.ui.Components.sr.h;
        this.f37959b = new le.c(1, this, srVar, 350L, false);
        this.f37965c = new le.c(2, this, srVar, 350L, false);
        this.d = new le.c(3, this, srVar, 350L, false);
        this.e = new le.c(4, this, srVar, 350L, false);
        this.f37981f = new le.c(5, this, srVar, 350L, false);
        this.h = new le.c(6, this, srVar, 350L, false);
        this.f38018n = new le.c(7, this, srVar, 350L, false);
        this.f38039r = new le.c(8, this, srVar, 350L, false);
        this.f38045s = new le.c(9, this, srVar, 350L, false);
        this.v = new ph.i(new iw(this, 0));
        this.f38070x = -1;
        this.F = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.Q = true;
        this.f37966c0 = 1.0f;
        this.f38076y0 = new UndoView[2];
        this.f37956a1 = new ArrayList();
        this.f37983f1 = new Paint();
        this.f37998i1 = new ArrayList();
        new RectF();
        new Paint(1);
        this.E1 = new TextPaint(1);
        this.U1 = true;
        this.f37968c2 = true;
        this.f37999i2 = true;
        this.f38031p2 = new MessagesStorage.TopicKey();
        this.I2 = new ArrayList();
        this.J2 = true;
        this.f38027o3 = new AnimationNotificationsLocker();
        this.y3 = -1;
        this.G3 = new zw(this, 0);
        this.H3 = new zw(this, 1);
        this.L3 = -4;
        this.M3 = true;
        this.N3 = true;
        this.W3 = 1.0f;
        ArrayList arrayList = new ArrayList();
        this.f38050s4 = arrayList;
        RectF rectF = new RectF();
        this.f38055t4 = rectF;
        RectF rectF2 = new RectF();
        this.f38060u4 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        fh.c d = this.glassEngine.d(new wv(this, 11));
        this.f38017m4 = d;
        if (i11 >= 31) {
            ah.i iVar = new ah.i();
            this.f38005j4 = iVar;
            fh.d dVar = new fh.d(d);
            this.l4 = dVar;
            dVar.f9062f = d;
            dVar.d = iVar;
            dVar.e = -2;
            fh.d dVar2 = new fh.d(null);
            this.f38010k4 = dVar2;
            dVar2.f9062f = d;
            dVar2.d = iVar;
            dVar2.e = -3;
            ah.c cVar = new ah.c(dVar);
            this.f38033p4 = cVar;
            cVar.f427i = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                dp = AndroidUtilities.dp(8.0f);
            } else {
                dp = AndroidUtilities.dp(48.0f);
            }
            cVar.f423b = dp;
            cVar.f424c = dp;
            ah.c cVar2 = new ah.c(dVar2);
            this.f38023n4 = cVar2;
            cVar2.f427i = LiteMode.isEnabled(262144);
            int dp2 = AndroidUtilities.dp(48.0f);
            cVar2.f423b = dp2;
            cVar2.f424c = dp2;
            this.f38028o4 = new ah.c(dVar2);
        } else {
            this.f38005j4 = null;
            this.f38010k4 = null;
            this.l4 = null;
            this.f38023n4 = new ah.c(d);
            this.f38033p4 = new ah.c(d);
            this.f38028o4 = new ah.c(d);
        }
        ah.c cVar3 = new ah.c(d);
        this.f38038q4 = cVar3;
        ah.c cVar4 = this.f38033p4;
        li.l lVar = this.glassEngine;
        cVar4.h = lVar;
        this.f38023n4.h = lVar;
        this.f38028o4.h = lVar;
        cVar3.h = lVar;
    }

    public static void A0(ty tyVar) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        tyVar.d5();
        org.telegram.ui.Components.qc G = org.telegram.ui.Components.xc.a0(tyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f27691j = 5000;
        G.j();
    }

    public static void B0(Activity activity, Boolean bool) {
        if (!bool.booleanValue()) {
            return;
        }
        if (!org.telegram.ui.Components.ne0.c()) {
            org.telegram.ui.Components.ne0.h();
        } else {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
    }

    public static void C0(org.telegram.ui.ty r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.C0(org.telegram.ui.ty, int):void");
    }

    public static void D0(ty tyVar) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        tyVar.d5();
        org.telegram.ui.Components.qc J = org.telegram.ui.Components.xc.a0(tyVar).J(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new nv(tyVar, 2));
        J.f27691j = 5000;
        J.j();
    }

    public static void E0(ty tyVar) {
        boolean z10 = true;
        try {
            ((org.telegram.ui.Components.kj0) ((org.telegram.ui.Components.h9) tyVar.M1.h.getImageReceiver().getStaticThumb()).B).H(true);
        } catch (Exception unused) {
        }
        if (tyVar.f37958a4 == null) {
            org.telegram.ui.Components.x40 x40Var = new org.telegram.ui.Components.x40(0, true, true);
            tyVar.f37958a4 = x40Var;
            x40Var.H = true;
            x40Var.f30246a = tyVar;
            x40Var.f30247b = new fy(tyVar);
            tyVar.getMediaDataController().checkFeaturedStickers();
            tyVar.getMessagesController().loadSuggestedFilters();
            tyVar.getMessagesController().loadUserInfo(tyVar.getUserConfig().getCurrentUser(), true, tyVar.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(tyVar.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(tyVar.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(tyVar.currentAccount).getCurrentUser();
        }
        if (user != null) {
            org.telegram.ui.Components.wi wiVar = tyVar.f37958a4.f30248c;
            if (wiVar != null) {
                wiVar.a1();
            }
            org.telegram.ui.Components.x40 x40Var2 = tyVar.f37958a4;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            x40Var2.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : false, new nv(tyVar, 1), new ov(tyVar, 0), 0);
        }
    }

    public static void F0(ty tyVar, float f7, ValueAnimator valueAnimator) {
        tyVar.f37976e0[0].setTranslationY((1.0f - tyVar.f38054t3) * f7);
        tyVar.f38054t3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i10 = 0; i10 < tyVar.actionBar.getChildCount(); i10++) {
            if (tyVar.actionBar.getChildAt(i10).getVisibility() == 0 && tyVar.actionBar.getChildAt(i10) != tyVar.actionBar.getActionMode() && tyVar.actionBar.getChildAt(i10) != tyVar.actionBar.getBackButton()) {
                tyVar.actionBar.getChildAt(i10).setAlpha(1.0f - tyVar.f38054t3);
            }
        }
        tyVar.N3();
        tyVar.F3();
        View view = tyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static void G0(ty tyVar) {
        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(tyVar.getParentActivity(), tyVar.resourceProvider);
        ybVar.d(R.raw.email_check_inbox, new String[0]);
        ybVar.f30642b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        org.telegram.ui.Components.qc.g(tyVar, ybVar, 2750).j();
        try {
            tyVar.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void H0(org.telegram.ui.ty r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.H0(org.telegram.ui.ty):void");
    }

    public static void I0(ty tyVar, BirthdayController.BirthdayState birthdayState) {
        if (birthdayState.today.size() == 1) {
            xh.r1 r1Var = new xh.r1(tyVar.getParentActivity(), tyVar.currentAccount, birthdayState.today.get(0).f18476id, null, null);
            r1Var.V(true);
            tyVar.showDialog(r1Var);
            return;
        }
        tg.m1.e0(0, birthdayState);
    }

    public static void J0(ty tyVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(tyVar).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
            M.f27691j = 5000;
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
                alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                tyVar.showDialog(alertDialog$Builder.f18655a);
                return;
            }
            return;
        }
        org.telegram.messenger.l0.o(R.string.UnknownError, org.telegram.ui.Components.xc.a0(tyVar), R.raw.error, 36);
    }

    public static void K0(ty tyVar) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        tyVar.d5();
    }

    public static void U(ty tyVar, TLRPC.TL_pendingSuggestion tL_pendingSuggestion) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        tyVar.d5();
    }

    public static void V(ty tyVar, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        tyVar.f38054t3 = floatValue;
        tyVar.f37976e0[0].setTranslationY((-f7) * floatValue);
        for (int i10 = 0; i10 < tyVar.actionBar.getChildCount(); i10++) {
            if (tyVar.actionBar.getChildAt(i10).getVisibility() == 0 && tyVar.actionBar.getChildAt(i10) != tyVar.actionBar.getActionMode() && tyVar.actionBar.getChildAt(i10) != tyVar.actionBar.getBackButton()) {
                tyVar.actionBar.getChildAt(i10).setAlpha(1.0f - tyVar.f38054t3);
            }
        }
        View view = tyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        tyVar.N3();
        tyVar.F3();
    }

    public static void X(ty tyVar) {
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
                tyVar.C2.u(tyVar, arrayList2, null, false, tyVar.J2, tyVar.K2, tyVar.L2, null);
            }
        } else if (MessagesController.getInstance(tyVar.currentAccount).isFrozen()) {
            b.b(tyVar.currentAccount);
        } else {
            tyVar.presentFragment(new ContactsActivity(a4.a.i("destroyAfterSelect", true)));
        }
    }

    public static void X2(ty tyVar, float f7) {
        float f10;
        float f11;
        int i10;
        int i11;
        float clamp = Utilities.clamp(tyVar.f38072x1 * 2.0f, 1.0f, 0.0f);
        hx hxVar = tyVar.E0;
        float f12 = (1.0f - tyVar.f38054t3) * f7 * tyVar.H0;
        float f13 = 1.0f - clamp;
        hxVar.setAlpha(f12 * f13);
        int i12 = 0;
        if (!tyVar.K && !tyVar.M) {
            if (tyVar.L) {
                tyVar.E0.setTranslationY((Math.max(tyVar.N, -tyVar.d4()) + (-AndroidUtilities.dp(81.0f))) - AndroidUtilities.dp(8.0f));
                tyVar.E0.setProgressToCollapse(1.0f);
                hx hxVar2 = tyVar.E0;
                hxVar2.setClipTop((int) (AndroidUtilities.statusBarHeight - hxVar2.getY()));
            }
            f10 = 1.0f - tyVar.H0;
            tyVar.actionBar.setTranslationY(0.0f);
        } else {
            float clamp2 = Utilities.clamp((-tyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (tyVar.f38054t3 == 1.0f) {
                clamp2 = 1.0f;
            }
            float clamp3 = Utilities.clamp(clamp2 / 0.5f, 1.0f, 0.0f);
            tyVar.E0.setClipTop(0);
            if (!tyVar.K && tyVar.M) {
                tyVar.E0.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                tyVar.E0.setProgressToCollapse(1.0f);
                f11 = tyVar.H0;
            } else {
                tyVar.E0.setTranslationY(((tyVar.T / 2.0f) + (Math.max(tyVar.N, -tyVar.d4()) + tyVar.f38064v3)) - AndroidUtilities.dp(8.0f));
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
            float f16 = (1.0f - tyVar.f38054t3) * f14;
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
        float f17 = 1.0f - tyVar.f38054t3;
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

    public static void Y(ty tyVar) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        tyVar.d5();
    }

    public static void Y2(ty tyVar, Canvas canvas, int i10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        if (tyVar.parentLayout != null && tyVar.actionBar != null) {
            float max = Math.max(tyVar.e.e, tyVar.e4());
            float f7 = 1.0f;
            float f10 = 1.0f - tyVar.f38072x1;
            float f11 = max * f10 * f10;
            int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            if (i11 != 0) {
                if (-1 >= i10) {
                    i10 = -1;
                    f7 = 0.0f;
                }
                if (f7 > 0.0f && i11 > 0 && i10 > 0 && (d5Var = tyVar.parentLayout) != null) {
                    ((ActionBarLayout) d5Var).p(canvas, (int) (f7 * 255.0f * f11), i10);
                }
            }
        }
    }

    public static void Z(ty tyVar) {
        PasskeysActivity.a0(tyVar.currentAccount, tyVar.getParentActivity(), tyVar.resourceProvider, true);
    }

    public static org.telegram.ui.Cells.s2 Z3(sy syVar) {
        py pyVar = syVar.f37593a;
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

    public static void a0(ty tyVar, int i10, org.telegram.ui.Components.a80 a80Var) {
        CharSequence charSequence;
        if (tyVar.currentAccount != i10) {
            a80Var.u();
            if (tyVar.getParentActivity() == null) {
                return;
            }
            ny nyVar = tyVar.C2;
            LaunchActivity launchActivity = (LaunchActivity) tyVar.getParentActivity();
            ArrayList arrayList = tyVar.D2;
            String str = tyVar.E2;
            CharSequence charSequence2 = tyVar.F2;
            ax axVar = tyVar.B1;
            if (axVar != null) {
                charSequence = axVar.getFieldText();
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
                        tyVar2.v3(charSequence);
                    } else {
                        tyVar2.U3 = charSequence;
                    }
                }
            } else if (str != null) {
                tyVar2.N4(charSequence, str);
            } else if (charSequence2 != null) {
                if (charSequence2.length() == 0) {
                    tyVar2.F2 = null;
                } else {
                    tyVar2.F2 = charSequence2;
                    tyVar2.E2 = null;
                    tyVar2.D2 = null;
                    if (tyVar2.B1 != null) {
                        tyVar2.v3(charSequence);
                    } else {
                        tyVar2.U3 = charSequence;
                    }
                }
            }
            launchActivity.q0(tyVar2, false, true);
        }
    }

    public static void b0(ty tyVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(tyVar.currentAccount).getClientUserId());
        tyVar.presentFragment(new xn(bundle));
    }

    public static void c0(ty tyVar, TL_account.TL_birthday tL_birthday) {
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
        tyVar.getConnectionsManager().sendRequest(updatebirthday, new da(tyVar, userFull, tL_birthday2, 8), 1024);
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        tyVar.d5();
    }

    public static void d0(ty tyVar, String str) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, str);
        tyVar.d5();
    }

    public static void e0(ty tyVar, sy syVar, View view, int i10) {
        int i11;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        if (view instanceof org.telegram.ui.Cells.v3) {
            return;
        }
        boolean z10 = view instanceof org.telegram.ui.Cells.s2;
        if (z10) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
            if (s2Var.f20987n2) {
                tyVar.W4(s2Var.getDialogId(), view);
                return;
            }
        }
        if (tyVar.R3()) {
            tyVar.x4(view, i10, 0.0f, syVar.d);
            return;
        }
        int i12 = tyVar.R0;
        if (i12 == 15 && (view instanceof org.telegram.ui.Cells.r8)) {
            syVar.d.K();
            return;
        }
        int i13 = 0;
        if ((i12 == 11 || i12 == 13) && i10 == 1) {
            Bundle i14 = a4.a.i("forImport", true);
            i14.putLongArray("result", new long[]{tyVar.getUserConfig().getClientUserId()});
            i14.putInt("chatType", 4);
            String string = tyVar.arguments.getString("importTitle");
            if (string != null) {
                i14.putString("title", string);
            }
            j70 j70Var = new j70(i14);
            j70Var.Y = new uw(tyVar);
            tyVar.presentFragment(j70Var);
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.a3) && ((i11 = syVar.f37599s) == 7 || i11 == 8)) {
            gg.k kVar = (gg.k) syVar.d.M.get(0);
            if (kVar != null && kVar.f15754a == 17) {
                tL_chatlists_chatlistUpdates = kVar.f9793i;
            } else {
                tL_chatlists_chatlistUpdates = null;
            }
            if (tL_chatlists_chatlistUpdates != null) {
                MessagesController.DialogFilter dialogFilter = tyVar.getMessagesController().selectedDialogFilter[syVar.f37599s - 7];
                if (dialogFilter != null) {
                    int i15 = dialogFilter.f15826id;
                    ?? bbVar = new org.telegram.ui.Components.bb(tyVar, false);
                    bbVar.Y = -1;
                    bbVar.f23816c0 = "";
                    bbVar.f23817d0 = new ArrayList();
                    bbVar.f23819f0 = "";
                    bbVar.f23821h0 = new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    bbVar.f23822i0 = arrayList;
                    bbVar.f23838z0 = -1;
                    bbVar.C0 = -5;
                    bbVar.Y = i15;
                    bbVar.f23814a0 = tL_chatlists_chatlistUpdates;
                    arrayList.clear();
                    bbVar.f23820g0 = tL_chatlists_chatlistUpdates.missing_peers;
                    ArrayList<MessagesController.DialogFilter> arrayList2 = tyVar.getMessagesController().dialogFilters;
                    if (arrayList2 != null) {
                        while (true) {
                            if (i13 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i13).f15826id == i15) {
                                bbVar.f23816c0 = arrayList2.get(i13).name;
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    bbVar.S();
                    tyVar.showDialog(bbVar);
                    return;
                }
                return;
            }
        } else if (z10 && !tyVar.actionBar.t() && !tyVar.F3.c()) {
            ImageReceiver imageReceiver = ((org.telegram.ui.Cells.s2) view).Y1;
            AndroidUtilities.rectTmp.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        }
        tyVar.w4(view, i10, syVar.d);
    }

    public static void f0(ty tyVar) {
        tyVar.presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(tyVar.parentLayout, "newChatsRow");
    }

    public static void h0(ty tyVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        if (tyVar.getParentActivity() != null) {
            tyVar.f38053t2 = false;
            if (z10 || z11 || z12) {
                tyVar.A0 = true;
                if (z10 && bk0.n(activity)) {
                    org.telegram.ui.Components.ne0.g(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.fn(1, new et(2, tyVar, activity)));
                } else if (z11 && tyVar.U1 && tyVar.getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                    org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.e5.w(activity, new yv(tyVar, 0)).f18655a;
                    tyVar.T1 = c2Var;
                    tyVar.showDialog(c2Var);
                } else if (z12 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    if (activity instanceof j5) {
                        org.telegram.ui.ActionBar.c2 w10 = ((j5) activity).w(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                        tyVar.T1 = w10;
                        tyVar.showDialog(w10);
                    }
                } else {
                    tyVar.u3(true);
                }
            }
        }
    }

    public static void i0(ty tyVar) {
        if (tyVar.f37958a4.h()) {
            MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            tyVar.d5();
        }
    }

    public static void j1(ty tyVar, boolean z10) {
        if (tyVar.f37976e0 != null && tyVar.M3 != z10) {
            tyVar.M3 = z10;
            int i10 = 0;
            while (true) {
                sy[] syVarArr = tyVar.f37976e0;
                if (i10 < syVarArr.length) {
                    if (z10) {
                        syVarArr[i10].f37593a.setScrollbarFadingEnabled(false);
                    }
                    tyVar.f37976e0[i10].f37593a.setVerticalScrollBarEnabled(z10);
                    if (z10) {
                        tyVar.f37976e0[i10].f37593a.setScrollbarFadingEnabled(true);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public static void k0(ty tyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(tyVar.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(tyVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new da(tyVar, tL_attachMenuBot, launchActivity, 9), 66);
    }

    public static void l0(ty tyVar) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        tyVar.d5();
    }

    public static void m0(ty tyVar) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        tyVar.d5();
    }

    public static void m4(xn xnVar, MessageObject messageObject) {
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
                    org.telegram.ui.Components.g10[] g10VarArr = (org.telegram.ui.Components.g10[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.g10.class);
                    if (g10VarArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(g10VarArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(g10VarArr[0]);
                        for (int i10 = 1; i10 < g10VarArr.length; i10++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(g10VarArr[i10]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(g10VarArr[i10]);
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
                        xnVar.mb(messageObject.getRealId(), spanStart, charSequence.subSequence(spanStart, spanEnd).toString());
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void n0(ty tyVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ai.j jVar;
        try {
            c2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject != null) {
            tyVar.arguments.getString("importTitle");
            String str = ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text;
            ai.j jVar2 = new ai.j(tyVar, j3, 23);
            Pattern pattern = org.telegram.ui.Components.e5.f23875a;
            if (tyVar.getParentActivity() != null) {
                if (chat != null || user != null) {
                    int currentAccount = tyVar.getCurrentAccount();
                    Activity parentActivity = tyVar.getParentActivity();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
                    TextView textView = new TextView(parentActivity);
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19164j5, false));
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
                    org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.e6) null);
                    h9Var.u(AndroidUtilities.dp(12.0f));
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(parentActivity);
                    w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    frameLayout.addView(w9Var, w7.y5.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(parentActivity);
                    textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.E8, false));
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
                            h9Var.f24767p = 0.8f;
                            h9Var.g(12);
                            w9Var.h(null, null, h9Var, user);
                            jVar = jVar2;
                        } else {
                            jVar = jVar2;
                            if (user.f18476id == clientUserId) {
                                h9Var.f24767p = 0.8f;
                                h9Var.g(1);
                                w9Var.h(null, null, h9Var, user);
                            } else {
                                h9Var.f24767p = 1.0f;
                                h9Var.m(currentAccount, user);
                                w9Var.e(user, h9Var);
                            }
                        }
                    } else {
                        jVar = jVar2;
                        h9Var.k(currentAccount, chat);
                        w9Var.e(chat, h9Var);
                    }
                    textView.setText(AndroidUtilities.replaceTags(str));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Import), new org.telegram.ui.Components.s(jVar, 3));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    tyVar.showDialog(alertDialog$Builder.f18655a);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.e5.f0(tyVar.currentAccount, tL_error, tyVar, tL_messages_checkHistoryImportPeer, new Object[0]);
        tyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j3), tL_messages_checkHistoryImportPeer, tL_error);
    }

    public static void o0(ty tyVar, int i10) {
        Object obj;
        TLRPC.User user;
        org.telegram.ui.Components.ao0 ao0Var = tyVar.C0.f26508p0;
        if (i10 >= ao0Var.X && i10 < ao0Var.Y) {
            org.telegram.ui.Components.x51 G = ao0Var.G(i10);
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
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
            c2Var.R = string;
            c2Var.T = LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"");
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.Components.w2(27, tyVar, (TLRPC.User) obj));
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        }
    }

    public static void p0(ty tyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        HashSet hashSet2;
        if (i10 == 102) {
            tyVar.getMessagesController().setDialogsInTransaction(true);
            if (z10) {
                hashSet2 = hashSet;
            } else {
                hashSet2 = null;
            }
            tyVar.A4(arrayList, i10, false, false, hashSet2);
            tyVar.getMessagesController().setDialogsInTransaction(false);
            tyVar.getMessagesController().checkIfFolderEmpty(tyVar.V2);
            int i11 = tyVar.V2;
            if (i11 != 0 && tyVar.a4(tyVar.currentAccount, tyVar.f37976e0[0].f37599s, i11, false).size() == 0) {
                tyVar.f37976e0[0].f37593a.setEmptyView(null);
                tyVar.f37976e0[0].f37600w.setVisibility(4);
                tyVar.finishFragment();
                return;
            }
            return;
        }
        tyVar.A4(arrayList, i10, false, false, null);
    }

    public static void r0(ty tyVar) {
        String str;
        MessagesController messagesController = MessagesController.getInstance(tyVar.currentAccount);
        if (tyVar.A3) {
            str = "PREMIUM_UPGRADE";
        } else {
            str = "PREMIUM_ANNUAL";
        }
        messagesController.removeSuggestion(0L, str);
        tyVar.d5();
    }

    public static void r4(AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        boolean[] zArr = f37951w4;
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

    public static void s0(Activity activity, Boolean bool) {
        if (!bool.booleanValue()) {
            return;
        }
        if (!org.telegram.ui.Components.ne0.c()) {
            org.telegram.ui.Components.ne0.h();
        } else {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
    }

    public static void t0(ty tyVar) {
        b.c(tyVar.getParentActivity(), tyVar.currentAccount, tyVar.getResourceProvider());
    }

    public static void u0(final int i10, final long j3, TLRPC.Chat chat, final ty tyVar, final boolean z10, final boolean z11) {
        final TLRPC.Chat chat2;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        tyVar.k4(false);
        if (i10 == 103 && ChatObject.isChannel(chat)) {
            chat2 = chat;
            if (!chat2.megagroup || ChatObject.isPublic(chat2)) {
                tyVar.getMessagesController().deleteDialog(j3, 2, z11);
                return;
            }
        } else {
            chat2 = chat;
        }
        if (i10 == 102 && (i14 = tyVar.V2) != 0 && tyVar.a4(tyVar.currentAccount, tyVar.f37976e0[0].f37599s, i14, false).size() == 1) {
            tyVar.f37976e0[0].f37600w.setVisibility(4);
        }
        tyVar.y3 = 3;
        int i15 = -1;
        if (i10 == 102) {
            tyVar.J4(true, true);
            if (tyVar.R1 != null) {
                i13 = 0;
                while (i13 < tyVar.R1.size()) {
                    if (((TLRPC.Dialog) tyVar.R1.get(i13)).f18333id == j3) {
                        break;
                    }
                    i13++;
                }
            }
            i13 = -1;
            tyVar.x3();
            i11 = i13;
        } else {
            i11 = -1;
        }
        UndoView h42 = tyVar.h4();
        if (h42 != null) {
            if (i10 == 103) {
                i12 = 0;
            } else if (z11) {
                i12 = 1;
            } else {
                i12 = 95;
            }
            h42.j(i12, j3, new Runnable() {
                @Override
                public final void run() {
                    tyVar.z4(i10, j3, chat2, z10, z11);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(tyVar.a4(tyVar.currentAccount, tyVar.f37976e0[0].f37599s, tyVar.V2, false));
        int i16 = 0;
        while (true) {
            if (i16 >= arrayList2.size()) {
                break;
            } else if (((TLRPC.Dialog) arrayList2.get(i16)).f18333id == j3) {
                i15 = i16;
                break;
            } else {
                i16++;
            }
        }
        if (i10 == 102) {
            if (i11 >= 0 && i15 < 0 && (arrayList = tyVar.R1) != null) {
                arrayList.remove(i11);
                tyVar.f37976e0[0].f37601x.D();
                tyVar.f37976e0[0].q(true);
                return;
            }
            tyVar.J4(false, true);
        }
    }

    public static void u1(ty tyVar, sy syVar, float f7) {
        if (tyVar.T != f7) {
            tyVar.T = f7;
            int i10 = 0;
            int i11 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i11 == 0) {
                tyVar.U = false;
            }
            tyVar.E0.setOverscroll(f7);
            syVar.f37593a.setViewsOffset(f7);
            py pyVar = syVar.f37593a;
            if (i11 != 0) {
                i10 = 2;
            }
            pyVar.setOverScrollMode(i10);
            tyVar.fragmentView.invalidate();
            if (f7 > AndroidUtilities.dp(90.0f) && !tyVar.U) {
                hx hxVar = tyVar.E0;
                ValueAnimator valueAnimator = hxVar.H0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    hxVar.i(hxVar.f566p0, true);
                    tyVar.U = true;
                    tyVar.getOrCreateStoryViewer().s(new nv(tyVar, 16));
                }
            }
        }
    }

    public static void v0(ty tyVar) {
        BirthdayController.getInstance(tyVar.currentAccount).hide();
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        tyVar.d5();
        org.telegram.ui.Components.qc G = org.telegram.ui.Components.xc.a0(tyVar).G(R.raw.gift, 4, LocaleController.getString(R.string.BoostingPremiumChristmasToast));
        G.f27691j = 5000;
        G.j();
    }

    public static boolean v1(ty tyVar, sy syVar) {
        if (!tyVar.F3.c()) {
            int i10 = (int) (-tyVar.N);
            int c42 = tyVar.c4();
            int d42 = tyVar.d4();
            if (i10 != 0 && i10 != c42 && i10 != d42 && syVar.f37593a.canScrollVertically(-1)) {
                if (d42 < i10 && i10 < c42) {
                    int dp = AndroidUtilities.dp(48.0f);
                    int i11 = i10 - d42;
                    if (i11 < dp / 2) {
                        syVar.f37594b.v(-i11);
                        return true;
                    }
                    syVar.f37594b.v(dp - i11);
                    return true;
                }
                float f7 = 1.0f;
                if (tyVar.f38054t3 != 1.0f) {
                    f7 = Utilities.clamp((-tyVar.N) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
                }
                if (f7 < tyVar.E0.B0) {
                    syVar.f37594b.v(-i10);
                    return true;
                }
                syVar.f37594b.v(d42 - i10);
                return true;
            }
            return false;
        }
        return false;
    }

    public static void w0(ty tyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
            LaunchActivity.C0(launchActivity, tyVar.currentAccount, tL_attachMenuBot, null, true);
        } else {
            cj1.a(tyVar.getParentActivity(), new a0(tyVar, tL_attachMenuBot, launchActivity, 8), null);
        }
    }

    public static String w2(ty tyVar) {
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

    public static void x0(ty tyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(launchActivity, tyVar.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(tyVar.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void y0(ty tyVar) {
        MessagesController.getInstance(tyVar.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        tyVar.d5();
    }

    public static void z0(ty tyVar) {
        if (!tyVar.N3) {
            ci.e4 e4Var = tyVar.f38034q0;
            if (e4Var != null) {
                if (e4Var.V) {
                    return;
                }
                AndroidUtilities.removeFromParent(e4Var);
            }
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.i6.Gi, 0, new iw(tyVar, 7));
            ci.e4 e4Var2 = new ci.e4(tyVar.getParentActivity(), 2);
            e4Var2.q(8.0f);
            e4Var2.d = 8000L;
            e4Var2.i();
            e4Var2.p(true);
            e4Var2.h = AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f);
            e4Var2.s(replaceSingleTag);
            e4Var2.l(1.0f, -40.0f);
            e4Var2.h(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
            tyVar.f38034q0 = e4Var2;
            e4Var2.setTranslationY((-tyVar.f37986f4) - tyVar.f37996h4);
            ((ViewGroup) tyVar.fragmentView).addView(tyVar.f38034q0, w7.y5.d(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            tyVar.f38034q0.u();
            return;
        }
        ci.e4 e4Var3 = tyVar.f38029p0;
        if (e4Var3 != null) {
            e4Var3.e(true);
        }
        ai.f9 o9 = MessagesController.getInstance(tyVar.currentAccount).getStoriesController().o();
        if (o9 != null && o9.a(tyVar.currentAccount, 1)) {
            tyVar.showDialog(new rg.j0(o9.b(), tyVar.currentAccount, tyVar.getParentActivity(), tyVar, null));
            return;
        }
        ci.kc E = ci.kc.E(tyVar.getParentActivity(), tyVar.currentAccount);
        E.f5056x = new zx(tyVar);
        E.R(null);
    }

    public final void A3(sy syVar) {
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final boolean z13;
        int i10;
        boolean z14;
        int L0 = syVar.f37595c.L0();
        int N0 = syVar.f37595c.N0();
        if (!this.f37990g3 && !this.f38013l3) {
            iy iyVar = this.f38079z0;
            if (iyVar == null || iyVar.getVisibility() != 0 || !this.f38079z0.O) {
                int abs = Math.abs(N0 - L0) + 1;
                if (N0 != -1) {
                    s4.c1 L = syVar.f37593a.L(N0);
                    if (L != null && L.f43008f == 11) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f37962b2 = z14;
                    if (z14) {
                        l4(false);
                    }
                } else {
                    this.f37962b2 = false;
                }
                int i11 = syVar.f37599s;
                if (i11 == 7 || i11 == 8) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
                    int i12 = syVar.h;
                    if (i12 >= 0 && i12 < dialogFilters.size() && (dialogFilters.get(syVar.h).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && N0 >= a4(this.currentAccount, syVar.f37599s, 1, this.S1).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                        boolean isDialogsEndReached = getMessagesController().isDialogsEndReached(1);
                        boolean z15 = !isDialogsEndReached;
                        if (isDialogsEndReached && getMessagesController().isServerDialogsEndReached(1)) {
                            z10 = z15;
                            z11 = false;
                        } else {
                            z10 = z15;
                            z11 = true;
                        }
                        if ((abs <= 0 && N0 >= a4(this.currentAccount, syVar.f37599s, this.V2, this.S1).size() - 10) || (abs == 0 && (((i10 = syVar.f37599s) == 7 || i10 == 8) && !getMessagesController().isDialogsEndReached(this.V2)))) {
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
                                    ty tyVar = ty.this;
                                    if (z12) {
                                        tyVar.getMessagesController().loadDialogs(tyVar.V2, -1, 100, z13);
                                    }
                                    if (z11) {
                                        tyVar.getMessagesController().loadDialogs(1, -1, 100, z10);
                                    } else {
                                        tyVar.getClass();
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
                        ty tyVar = ty.this;
                        if (z12) {
                            tyVar.getMessagesController().loadDialogs(tyVar.V2, -1, 100, z13);
                        }
                        if (z11) {
                            tyVar.getMessagesController().loadDialogs(1, -1, 100, z10);
                        } else {
                            tyVar.getClass();
                        }
                    }
                });
            }
        }
    }

    public final void A4(java.util.ArrayList r40, int r41, boolean r42, boolean r43, java.util.HashSet r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.A4(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    public final void B3() {
        if (this.f37976e0 != null) {
            int w32 = w3();
            int i10 = 0;
            while (true) {
                sy[] syVarArr = this.f37976e0;
                if (i10 < syVarArr.length) {
                    sy syVar = syVarArr[i10];
                    if (syVar != null) {
                        py pyVar = syVar.f37593a;
                        pyVar.setPadding(0, pyVar.Y2, 0, w32);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void B4(long r14, boolean r16, org.telegram.messenger.MessagesController.DialogFilter r17, int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.B4(long, boolean, org.telegram.messenger.MessagesController$DialogFilter, int, boolean):void");
    }

    @Override
    public final void C(float f7, int i10) {
        org.telegram.ui.ActionBar.w0 w0Var;
        if (i10 == 3 && (w0Var = this.f38011l0) != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) w0Var.getIconView().getDrawable();
            if (this.d.f14203f) {
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
        hh.g gVar = this.f38077y1;
        if (gVar != null) {
            gVar.setBlurredBottomHeight(this.f38077y1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        }
    }

    public final void C4() {
        if (this.K0 == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6));
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.K0.setBackground(new BitmapDrawable(createBitmap));
        this.K0.setAlpha(0.0f);
        this.K0.setVisibility(0);
        K3();
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        int i11;
        int i12;
        int i13 = 8;
        if (i10 == 1) {
            L3();
            N3();
            Q3();
            D3();
            O3();
            gy gyVar = this.X;
            le.c cVar = this.f37959b;
            gyVar.setBlurredBackgroundVisibility(cVar.e);
            float b10 = yf.e0.b(cVar.e);
            org.telegram.ui.Components.w9 w9Var = this.f37957a3;
            if (w9Var != null) {
                w9Var.setScaleX(b10);
                this.f37957a3.setScaleY(b10);
                this.f37957a3.setAlpha(b10);
                org.telegram.ui.Components.w9 w9Var2 = this.f37957a3;
                if (b10 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                w9Var2.setVisibility(i12);
            }
            if (this.f38061v0 != null) {
                float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
                this.f38061v0.setScaleX(lerp);
                this.f38061v0.setScaleY(lerp);
                this.f38061v0.setAlpha(b10);
                ci.d dVar = this.f38061v0;
                int i14 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
                if (i14 > 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                dVar.setVisibility(i11);
                this.f38066w0.setAlpha(b10);
                jh.f fVar2 = this.f38066w0;
                if (i14 > 0) {
                    i13 = 0;
                }
                fVar2.setVisibility(i13);
            }
        } else if (i10 == 2) {
            L3();
            N3();
        } else if (i10 == 3) {
            J3();
        } else if (i10 == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        } else if (i10 == 5) {
            I3();
        } else if (i10 == 6) {
            L3();
            N3();
        } else if (i10 == 7) {
            E3();
        } else if (i10 == 8) {
            D3();
            O3();
        } else if (i10 == 9) {
            O3();
        }
    }

    public final void D3() {
        int i10;
        sy syVar;
        boolean z10 = true;
        float b42 = b4(true);
        iy iyVar = this.f38079z0;
        if (iyVar != null) {
            if (iyVar.getAlpha() == b42) {
                z10 = false;
            }
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, b42);
            this.f38079z0.setAlpha(b42);
            this.f38079z0.setScaleX(lerp);
            this.f38079z0.setScaleY(lerp);
            iy iyVar2 = this.f38079z0;
            if (b42 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            iyVar2.setVisibility(i10);
            if (z10 && (syVar = this.f37976e0[0]) != null) {
                syVar.f37593a.requestLayout();
            }
        }
        b5();
    }

    public final void D4(sy syVar) {
        int i10;
        org.telegram.ui.Components.v00 v00Var;
        if (syVar.getVisibility() != 0) {
            return;
        }
        int i11 = syVar.d.v;
        if (syVar.f37599s == 0 && i4() && syVar.f37593a.getChildCount() == 0 && syVar.v == 2) {
            ((s4.c0) syVar.f37593a.getLayoutManager()).h1(1, (int) this.N);
        }
        syVar.d.getClass();
        syVar.d.U();
        int h = syVar.d.h();
        if (h == 1 && i11 == 1 && syVar.d.j(0) == 5) {
            syVar.q(true);
        } else {
            syVar.q(false);
            if (h > i11 && (i10 = this.R0) != 11 && i10 != 12 && i10 != 13) {
                syVar.f37602y.b(i11);
            }
        }
        try {
            py pyVar = syVar.f37593a;
            if (this.V2 == 0 && this.X2 == 0) {
                v00Var = syVar.f37600w;
            } else {
                v00Var = null;
            }
            pyVar.setEmptyView(v00Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
        A3(syVar);
    }

    public final void E3() {
        int i10;
        int i11;
        float f7 = this.f38018n.e;
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
        hh.g gVar = this.f38077y1;
        if (gVar != null) {
            gVar.setAlpha(f7);
            hh.g gVar2 = this.f38077y1;
            int i13 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i13 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            gVar2.setVisibility(i10);
            this.f38077y1.getFadeView().setAlpha(f7);
            View fadeView = this.f38077y1.getFadeView();
            if (i13 > 0) {
                i12 = 0;
            }
            fadeView.setVisibility(i12);
        }
    }

    public final void E4() {
        boolean z10;
        float f7 = 0.0f;
        if (this.N != 0.0f && !(z10 = this.K)) {
            if (z10) {
                f7 = -d4();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.G3, f7));
            animatorSet.setInterpolator(org.telegram.ui.Components.sr.f28359f);
            animatorSet.setDuration(250L);
            animatorSet.start();
        }
    }

    public final void F3() {
        if (this.actionBar == null) {
            return;
        }
        org.telegram.ui.Components.b20.d(this.actionBar.getBackButton(), Math.max(this.f38054t3, (1.0f - this.f37959b.e) * (1.0f - e4()) * (1.0f - this.f37965c.e)));
    }

    public final void F4(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.F4(int):void");
    }

    public final void G3() {
        float f7;
        if (this.f37997i0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.b20.d(this.f37987g0, com.google.android.gms.internal.vision.e2.C(f7, 1.0f - this.f37959b.e, 1.0f - e4(), 1.0f - this.f37965c.e));
    }

    public final void G4(boolean z10, boolean z11) {
        int i10;
        int i11;
        kx kxVar = this.F3;
        if (kxVar != null && kxVar.c()) {
            return;
        }
        if (this.f37976e0[0].f37599s == 0 && i4() && this.f37976e0[0].v == 2) {
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
            org.telegram.ui.Components.bl0 bl0Var = this.f37976e0[0].f37598r;
            bl0Var.f23064b = 1;
            bl0Var.d(i10, i11, false, false);
            E4();
            return;
        }
        this.f37976e0[0].f37595c.h1(i10, i11);
        E4();
    }

    public final void H3() {
        float f7;
        if (SharedConfig.passcodeHash.isEmpty()) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.b20.d(this.f37982f0, com.google.android.gms.internal.vision.e2.C(f7, 1.0f - this.f37959b.e, 1.0f - e4(), 1.0f - this.f37965c.e));
    }

    public final void H4(String str, boolean z10) {
        X4(true, false, true, false);
        gy gyVar = this.X;
        if (gyVar != null) {
            gyVar.f23850r.setText(str);
            this.X.f23850r.setSelection(str.length());
        }
    }

    public final void I3() {
        float f7;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.b20.d(this.f38002j0, com.google.android.gms.internal.vision.e2.C(f7, this.f37981f.e, 1.0f - e4(), 1.0f - this.f37965c.e));
        hx hxVar = this.E0;
        if (hxVar != null) {
            hxVar.invalidate();
        }
    }

    public final void I4(float f7) {
        sy[] syVarArr;
        this.f37966c0 = f7;
        for (sy syVar : this.f37976e0) {
            py pyVar = syVar.f37593a;
            for (int i10 = 0; i10 < pyVar.getChildCount(); i10++) {
                View childAt = pyVar.getChildAt(i10);
                if (childAt != null && RecyclerView.S(childAt) >= syVar.d.f9842f + 1) {
                    childAt.setAlpha(f7);
                }
            }
        }
    }

    public final void J3() {
        org.telegram.ui.Components.b20.d(this.f38011l0, com.google.android.gms.internal.vision.e2.C(this.f37959b.e, 1.0f - e4(), 1.0f - this.f37965c.e, this.d.e));
    }

    public final void J4(boolean z10, boolean z11) {
        if (this.f37976e0 != null && this.S1 != z10) {
            if (z10) {
                this.R1 = new ArrayList(a4(this.currentAccount, this.f37976e0[0].f37599s, this.V2, false));
            } else {
                this.R1 = null;
            }
            this.S1 = z10;
            sy syVar = this.f37976e0[0];
            syVar.d.G = z10;
            if (!z10 && z11) {
                if (syVar.f37593a.c0()) {
                    this.f37976e0[0].f37593a.post(new iw(this, 8));
                } else {
                    this.f37976e0[0].d.l();
                }
            }
        }
    }

    public final void K3() {
        boolean z10;
        ci.ab abVar;
        if (!this.f38004j2 && ((abVar = this.K0) == null || abVar.getBackground() == null || this.K0.getAlpha() < 0.01f || this.K0.getVisibility() == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        yg0 yg0Var = this.I3;
        if (yg0Var != null) {
            yg0Var.f40212a.v.a(z10, true);
        }
    }

    public final void K4(boolean z10) {
        sy syVar;
        if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
            if (z10) {
                sy[] syVarArr = this.f37976e0;
                if (syVarArr != null && (syVar = syVarArr[0]) != null) {
                    syVar.setLayerType(2, null);
                    this.f37976e0[0].setClipChildren(false);
                    this.f37976e0[0].setClipToPadding(false);
                    this.f37976e0[0].f37593a.setClipChildren(false);
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
            if (this.f37976e0 != null) {
                int i10 = 0;
                while (true) {
                    sy[] syVarArr2 = this.f37976e0;
                    if (i10 >= syVarArr2.length) {
                        break;
                    }
                    sy syVar2 = syVarArr2[i10];
                    if (syVar2 != null) {
                        syVar2.setLayerType(0, null);
                        syVar2.setClipChildren(true);
                        syVar2.setClipToPadding(true);
                        syVar2.f37593a.setClipChildren(true);
                    }
                    i10++;
                }
            }
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (lVar2 != null) {
                lVar2.setLayerType(0, null);
            }
            hx hxVar = this.E0;
            if (hxVar != null) {
                hxVar.setLayerType(0, null);
            }
            View view2 = this.fragmentView;
            if (view2 != null) {
                ((ViewGroup) view2).setClipChildren(true);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void L3() {
        F3();
        org.telegram.ui.Components.b20.d(this.f38006k0, (1.0f - this.f37959b.e) * (1.0f - e4()) * (1.0f - this.f37965c.e));
        G3();
        J3();
        H3();
        I3();
    }

    public final void L4(float f7) {
        sy[] syVarArr = this.f37976e0;
        int i10 = 0;
        if (syVarArr != null) {
            int paddingTop = syVarArr[0].f37593a.getPaddingTop() + ((int) f7);
            int i11 = 0;
            while (true) {
                sy[] syVarArr2 = this.f37976e0;
                if (i11 >= syVarArr2.length) {
                    break;
                }
                syVarArr2[i11].f37593a.setTopGlowOffset(paddingTop);
                i11++;
            }
        }
        if (this.fragmentView != null && f7 != this.N) {
            this.N = f7;
            org.telegram.ui.Components.qc qcVar = this.f38022n3;
            if (qcVar != null) {
                qcVar.l();
            }
            if (this.E3 != null) {
                float currentActionBarHeight = 1.0f - ((-f7) / org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                org.telegram.ui.Cells.o oVar = this.E3;
                float f10 = (int) f7;
                float f11 = oVar.f20733f;
                oVar.h = f10;
                oVar.setTranslationY(f11 + f10);
                this.E3.setAlpha(w7.q.a(currentActionBarHeight, 0.0f, 1.0f));
                org.telegram.ui.Cells.o oVar2 = this.E3;
                if (currentActionBarHeight <= 0.0f) {
                    i10 = 4;
                }
                oVar2.setVisibility(i10);
            }
            N3();
            this.fragmentView.invalidate();
        }
    }

    public final void M3() {
        int i10;
        if (e4() > 0.5f) {
            i10 = R.string.SearchTopics;
        } else {
            i10 = R.string.SearchChats;
        }
        String string = LocaleController.getString(i10);
        this.X.f23850r.setContentDescription(string);
        this.X.f23850r.setHint(string);
    }

    public final void M4(float f7) {
        int i10;
        int i11;
        this.f38072x1 = f7;
        if (this.f38043r3 && this.actionBar != null) {
            if (this.V2 == 0 && this.X2 == 0) {
                i10 = org.telegram.ui.ActionBar.i6.f19392v8;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.O8;
            }
            int themedColor = getThemedColor(i10);
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.i6.f19444y8;
            lVar.E(i0.a.d(this.f38072x1, themedColor, getThemedColor(i12)), false);
            this.actionBar.E(i0.a.d(this.f38072x1, getThemedColor(i12), getThemedColor(i12)), true);
            if (this.V2 == 0 && this.X2 == 0) {
                i11 = org.telegram.ui.ActionBar.i6.f19356t8;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.N8;
            }
            int themedColor2 = getThemedColor(i11);
            this.actionBar.B(i0.a.d(this.f38072x1, themedColor2, getThemedColor(org.telegram.ui.ActionBar.i6.f19463z8)), false);
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (SharedConfig.getDevicePerformanceClass() != 0) {
            LiteMode.isEnabled(32768);
        }
        b5();
    }

    public final void N3() {
        float f7;
        int i10;
        if (this.X == null) {
            return;
        }
        float a2 = 1.0f - w7.q.a(((-this.N) - d4()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
        float max = Math.max(this.f38054t3, this.h.e);
        float f10 = this.f37959b.e;
        if (this.R0 != 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float max2 = f7 * (1.0f - this.f37965c.e) * (1.0f - max) * Math.max(f10, (1.0f - e4()) * a2);
        this.X.setAlpha(max2);
        gy gyVar = this.X;
        boolean z10 = false;
        if (max2 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        gyVar.setVisibility(i10);
        if (max2 <= 0.01f) {
            z10 = true;
        }
        this.f37981f.a(z10, true);
    }

    public final void N4(CharSequence charSequence, String str) {
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

    public final void O3() {
        int i10;
        float f7;
        int i11;
        int i12 = 8;
        if (this.Z != null) {
            if (this.f37955a0 != null) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float f10 = f7 * this.f37959b.e;
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, f10);
            this.Z.setScaleX(lerp);
            this.Z.setScaleY(lerp);
            this.Z.setAlpha(f10);
            p41 p41Var = this.Z;
            if (f10 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            p41Var.setVisibility(i11);
        }
        org.telegram.ui.Components.x81 x81Var = this.f37955a0;
        le.c cVar = this.f38045s;
        if (x81Var != null) {
            float f11 = 1.0f - cVar.e;
            x81Var.setAlpha(f11);
            org.telegram.ui.Components.x81 x81Var2 = this.f37955a0;
            if (f11 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            x81Var2.setVisibility(i10);
        }
        gg.s0 s0Var = this.f37960b0;
        if (s0Var != null) {
            float f12 = cVar.e;
            s0Var.setAlpha(f12);
            gg.s0 s0Var2 = this.f37960b0;
            if (f12 > 0.0f) {
                i12 = 0;
            }
            s0Var2.setVisibility(i12);
        }
    }

    public final void O4(float f7) {
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
                hx hxVar = this.E0;
                if (hxVar != null) {
                    hxVar.setTranslationX(f10);
                }
                gy gyVar = this.X;
                if (gyVar != null) {
                    gyVar.setTranslationX(f10);
                }
                kx kxVar = this.F3;
                if (kxVar != null && kxVar.getFragmentView() != null && !this.f38075y) {
                    this.F3.getFragmentView().setTranslationX(f10);
                    return;
                }
                return;
            }
            float f11 = 1.0f - this.W3;
            float f12 = (-AndroidUtilities.dp(4.0f)) * f11;
            float f13 = 1.0f - (f11 * 0.05f);
            hx hxVar2 = this.E0;
            if (hxVar2 != null) {
                hxVar2.setScaleX(f13);
                this.E0.setScaleY(f13);
                this.E0.setTranslationX(f12);
                this.E0.setPivotX(0.0f);
                this.E0.setPivotY(0.0f);
            }
            gy gyVar2 = this.X;
            if (gyVar2 != null) {
                gyVar2.setTranslationX(f12);
                this.X.setScaleX(f13);
                this.X.setScaleY(f13);
            }
            kx kxVar2 = this.F3;
            if (kxVar2 != null && kxVar2.getFragmentView() != null) {
                if (!this.f38075y) {
                    this.F3.getFragmentView().setScaleX(f13);
                    this.F3.getFragmentView().setScaleY(f13);
                    this.F3.getFragmentView().setTranslationX(f12);
                }
                this.F3.getFragmentView().setPivotX(0.0f);
                this.F3.getFragmentView().setPivotY(0.0f);
            }
        }
    }

    public final void P3(boolean z10) {
        int i10;
        int i11;
        if (this.C0 != null && this.actionBar != null) {
            int i12 = AndroidUtilities.navigationBarHeight;
            int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.f37954a);
            if (this.f37955a0 != null) {
                i10 = AndroidUtilities.dp(50.0f);
            } else {
                i10 = 0;
            }
            int i13 = measuredHeight + i10;
            org.telegram.ui.Components.ms msVar = this.J1;
            if (msVar != null) {
                i11 = (int) msVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i14 = i13 + i11;
            ay ayVar = this.C0;
            SparseArray sparseArray = ayVar.h;
            ayVar.V0 = i14;
            ayVar.W0 = i12;
            ai.w0 w0Var = ayVar.W;
            if (z10) {
                w0Var.p1(0, i14, 0, i12);
            } else {
                w0Var.setPadding(0, i14, 0, i12);
            }
            ayVar.N0.j(ayVar.V0, ayVar.W0, z10);
            org.telegram.ui.Components.zn0 zn0Var = ayVar.f26494a0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zn0Var.getLayoutParams();
            int i15 = marginLayoutParams.topMargin;
            int i16 = ayVar.V0;
            if (i15 != i16 || marginLayoutParams.bottomMargin != ayVar.W0) {
                marginLayoutParams.topMargin = i16;
                marginLayoutParams.bottomMargin = ayVar.W0;
                zn0Var.requestLayout();
            }
            org.telegram.ui.Components.mo0.Q(ayVar.f26500g0, ayVar.f26503j0, ayVar.V0, ayVar.W0, z10);
            org.telegram.ui.Components.mo0.Q(ayVar.f26505l0, ayVar.f26507o0, ayVar.V0, ayVar.W0, z10);
            org.telegram.ui.Components.mo0.Q(ayVar.f26511s0, ayVar.f26514v0, ayVar.V0, ayVar.W0, z10);
            org.telegram.ui.Components.lh0 lh0Var = ayVar.f26509q0;
            int i17 = ayVar.V0;
            int i18 = ayVar.W0;
            lh0Var.setClipToPadding(false);
            lh0Var.J = z10;
            lh0Var.setPadding(0, i17, 0, i18);
            org.telegram.ui.Components.t61 t61Var = lh0Var.f26051c;
            if (z10) {
                t61Var.p1(0, i17, 0, i18);
            } else {
                t61Var.setPadding(0, i17, 0, i18);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) t61Var.getLayoutParams();
            marginLayoutParams2.topMargin = -i17;
            marginLayoutParams2.bottomMargin = -i18;
            lh0Var.J = false;
            org.telegram.ui.Components.kn0 kn0Var = ayVar.H0;
            if (kn0Var != null) {
                kn0Var.b(ayVar.V0, ayVar.W0, z10);
            }
            int size = sparseArray.size();
            for (int i19 = 0; i19 < size; i19++) {
                View view = (View) sparseArray.valueAt(i19);
                if (view instanceof w10) {
                    ((w10) view).j(ayVar.V0, ayVar.W0, z10);
                }
            }
            for (int i20 = 0; i20 < ayVar.getChildCount(); i20++) {
                if (ayVar.getChildAt(i20) instanceof w10) {
                    ((w10) ayVar.getChildAt(i20)).j(ayVar.V0, ayVar.W0, z10);
                }
            }
        }
    }

    public final void P4() {
        getContactsController().loadGlobalPrivacySetting();
        org.telegram.ui.Components.v6 v6Var = new org.telegram.ui.Components.v6(getParentActivity(), this.currentAccount, getResourceProvider(), new tv(1, this, r0), new cj(r0, 17));
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(getParentActivity(), getResourceProvider());
        b3Var.c(v6Var);
        org.telegram.ui.ActionBar.g3 g3Var = b3Var.f18683a;
        g3Var.show();
        org.telegram.ui.ActionBar.g3[] g3VarArr = {g3Var};
        g3Var.fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.i6.f19128h5));
    }

    public final void Q3() {
        if (this.J1 != null) {
            float lerp = AndroidUtilities.lerp(0.98f, 1.0f, 1.0f);
            this.J1.setAlpha(1.0f);
            this.J1.setScaleX(lerp);
            this.J1.setScaleY(lerp);
            this.J1.setVisibility(0);
        }
    }

    public final boolean Q4(org.telegram.ui.Cells.s2 r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.Q4(org.telegram.ui.Cells.s2):boolean");
    }

    public boolean R3() {
        if (this.R0 == 10) {
            return true;
        }
        return false;
    }

    public final void R4(boolean z10) {
        float f7;
        this.f37965c.a(z10, true);
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
        org.telegram.ui.ActionBar.w0 w0Var = this.m0;
        Property property = View.ALPHA;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(w0Var, property, f7));
        this.O3.playTogether(arrayList);
        this.O3.addListener(new qx(this, z10, 1));
        this.O3.start();
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        kx kxVar;
        ci.ab abVar;
        iy iyVar;
        boolean z11;
        boolean z12;
        if (!this.f38032p3 && (((kxVar = this.F3) == null || !kxVar.c()) && (((abVar = this.K0) == null || abVar.getVisibility() != 0) && ((iyVar = this.f38079z0) == null || !iyVar.f26257n)))) {
            if (motionEvent.getY() >= this.actionBar.getMeasuredHeight()) {
                iy iyVar2 = this.f38079z0;
                if (iyVar2 != null && iyVar2.getTabsCount() >= 2 && this.f38079z0.getCurrentTabId() != this.f38079z0.getFirstTabId()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                iy iyVar3 = this.f38079z0;
                if (iyVar3 != null && iyVar3.getTabsCount() >= 2 && this.f38079z0.getCurrentTabId() != this.f38079z0.getLastTabId()) {
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

    public final void S3() {
        if (AndroidUtilities.isTablet()) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.i(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                ay ayVar = this.C0;
                if (ayVar != null) {
                    ayVar.f26496c0.R(this.W1, tLObject);
                }
                this.X1 = null;
                return;
            }
            return;
        }
        this.V1 = true;
    }

    public final void S4() {
        if (!this.A0 && getMessagesController().dialogFiltersLoaded && getMessagesController().showFiltersTooltip && this.f38079z0 != null && getMessagesController().getDialogFilters().isEmpty() && !this.isPaused && getUserConfig().filtersLoaded && !this.inPreviewMode) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("filterhint", false)) {
                globalMainSettings.edit().putBoolean("filterhint", true).apply();
                AndroidUtilities.runOnUIThread(new iw(this, 9), 1000L);
            }
        }
    }

    public final void T3() {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null && lVar.f19570n0) {
            lVar.i(true);
            this.f38032p3 = false;
            e5(true, true);
        }
    }

    public final void T4() {
        LaunchActivity launchActivity;
        boolean q6;
        int i10;
        int i11;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        LaunchActivity launchActivity2;
        CharSequence charSequence;
        tv tvVar;
        int i12;
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i13;
        int v02;
        int v03;
        int v04;
        int l1;
        CharSequence charSequence2;
        int i14;
        int v05;
        org.telegram.ui.Components.a80 H = org.telegram.ui.Components.a80.H(this, this.f38006k0);
        int i15 = org.telegram.ui.ActionBar.i6.A8;
        H.S(getThemedColor(i15), getThemedColor(i15));
        H.f22606s = 8;
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) parentActivity;
        } else {
            launchActivity = null;
        }
        int i16 = 0;
        if (this.X2 != 0) {
            if (ChatObject.hasAdminRights(this.Y2)) {
                H.c(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new nv(this, 4), false);
                H.k();
            }
            H.i(new nv(this, 6), LocaleController.getString(R.string.CommunityMenuShowAsOneChat), this.Y2.collapsed_in_dialogs);
            H.i(new nv(this, 7), LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), !this.Y2.collapsed_in_dialogs);
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        } else if (n4()) {
            H.c(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new nv(this, 8), false);
            H.c(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new nv(this, 9), false);
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
            H.c(i10, LocaleController.getString(i11), new nv(this, 10), false);
            H.k();
            H.c(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new nv(this, 11), false);
            H.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new nv(this, 12), false);
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
                        sv svVar = new sv(this, tL_attachMenuBot2, launchActivity, 0);
                        tv tvVar2 = new tv(0, this, tL_attachMenuBot2);
                        org.telegram.ui.ActionBar.e6 e6Var3 = H.d;
                        if (H.e != null) {
                            int i18 = org.telegram.ui.ActionBar.i6.F8;
                            int i19 = org.telegram.ui.ActionBar.i6.E8;
                            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(0, H.e, H.d, false, false);
                            g1Var2.setPadding(AndroidUtilities.dp(18.0f), i16, AndroidUtilities.dp(18.0f), i16);
                            if (tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                charSequence = org.telegram.ui.Cells.r8.a(tL_attachMenuBot2.short_name);
                            } else {
                                charSequence = tL_attachMenuBot2.short_name;
                            }
                            TLRPC.TL_attachMenuBotIcon sideAttachMenuBotIcon = MediaDataController.getSideAttachMenuBotIcon(tL_attachMenuBot2);
                            if (sideAttachMenuBotIcon != null) {
                                launchActivity2 = launchActivity;
                                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(sideAttachMenuBotIcon.icon, org.telegram.ui.ActionBar.i6.f19040c7, 1.0f);
                                if (svgThumb != null) {
                                    Integer num = H.f22593k0;
                                    if (num != null) {
                                        v05 = num.intValue();
                                    } else {
                                        v05 = org.telegram.ui.ActionBar.i6.v0(i18, e6Var3);
                                    }
                                    charSequence2 = charSequence;
                                    svgThumb.setColorFilter(new PorterDuffColorFilter(v05, PorterDuff.Mode.SRC_IN));
                                } else {
                                    charSequence2 = charSequence;
                                }
                                i12 = i19;
                                tvVar = tvVar2;
                                i13 = i18;
                                g1Var = g1Var2;
                                e6Var = e6Var3;
                                g1Var.h(charSequence2, ImageLocation.getForDocument(sideAttachMenuBotIcon.icon), "24_24", svgThumb, tL_attachMenuBot2);
                                org.telegram.ui.Components.w9 w9Var = g1Var.h;
                                if (w9Var != null) {
                                    if (LocaleController.isRTL) {
                                        i14 = 5;
                                    } else {
                                        i14 = 3;
                                    }
                                    w9Var.setLayoutParams(w7.y5.e(24, 24, i14 | 16));
                                }
                            } else {
                                launchActivity2 = launchActivity;
                                tvVar = tvVar2;
                                i12 = i19;
                                g1Var = g1Var2;
                                e6Var = e6Var3;
                                CharSequence charSequence3 = charSequence;
                                i13 = i18;
                                g1Var.g(charSequence3, R.drawable.msg_bot, null);
                            }
                            Integer num2 = H.f22591j0;
                            if (num2 != null) {
                                v02 = num2.intValue();
                            } else {
                                v02 = org.telegram.ui.ActionBar.i6.v0(i12, e6Var);
                            }
                            Integer num3 = H.f22593k0;
                            if (num3 != null) {
                                v03 = num3.intValue();
                            } else {
                                v03 = org.telegram.ui.ActionBar.i6.v0(i13, e6Var);
                            }
                            g1Var.c(v02, v03);
                            Integer num4 = H.f22593k0;
                            if (num4 != null) {
                                v04 = num4.intValue();
                            } else {
                                v04 = org.telegram.ui.ActionBar.i6.v0(i13, e6Var);
                            }
                            g1Var.setIconColorImage(v04);
                            Integer num5 = H.f22595l0;
                            if (num5 != null) {
                                l1 = num5.intValue();
                            } else {
                                l1 = org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.v0(i12, e6Var));
                            }
                            g1Var.setSelectorColor(l1);
                            g1Var.setOnClickListener(new org.telegram.ui.Components.ft(8, H, svVar));
                            g1Var.setOnLongClickListener(new ai.q3(3, H, tvVar));
                            int i20 = H.S;
                            if (i20 > 0) {
                                g1Var.setMinimumWidth(AndroidUtilities.dp(i20));
                                H.r(g1Var, w7.y5.n(H.S, -2));
                            } else {
                                H.r(g1Var, w7.y5.n(-1, -2));
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
                H.c(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new nv(this, 5), false);
            }
            org.telegram.ui.ActionBar.g1 g1Var3 = this.f38024o0;
            if (g1Var3 != null) {
                g1Var3.f18881b.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f19012ai));
                this.f38024o0.setOnClickListener(new rv(0, this, H));
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                    H.k();
                    H.d(this.f38024o0);
                }
            }
            H.Z();
            H.X(-AndroidUtilities.dp(64.0f));
        }
    }

    public final void U3(String str) {
        int i10;
        if (this.actionBar.a(str)) {
            return;
        }
        org.telegram.ui.ActionBar.a0 k10 = this.actionBar.k(str);
        boolean z10 = this.W;
        ArrayList arrayList = this.f37998i1;
        if (z10) {
            ImageView imageView = new ImageView(getParentActivity());
            this.f37988g1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f37988g1.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
            this.f37988g1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.f19444y8), PorterDuff.Mode.MULTIPLY));
            this.f37988g1.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(org.telegram.ui.ActionBar.i6.f19463z8), 1, -1));
            this.f37988g1.setOnClickListener(new vv(this, 6));
            k10.addView(this.f37988g1, w7.y5.q(54, 54, 16));
            arrayList.add(this.f37988g1);
        }
        NumberTextView numberTextView = new NumberTextView(k10.getContext());
        this.f37993h1 = numberTextView;
        numberTextView.setTextSize(18);
        this.f37993h1.setTypeface(AndroidUtilities.bold());
        this.f37993h1.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f19444y8));
        NumberTextView numberTextView2 = this.f37993h1;
        if (this.W) {
            i10 = 18;
        } else {
            i10 = 72;
        }
        k10.addView(numberTextView2, w7.y5.m(1.0f, 0, -1, i10, 0, 0));
        this.f37993h1.setOnTouchListener(new bi.d(2));
        this.f38007k1 = k10.g(100, R.drawable.msg_pin, AndroidUtilities.dp(48.0f));
        this.l1 = k10.g(104, R.drawable.msg_mute, AndroidUtilities.dp(48.0f));
        this.f38014m1 = k10.g(107, R.drawable.msg_archive, AndroidUtilities.dp(48.0f));
        this.f38003j1 = k10.h(102, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.w0 h = k10.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(48.0f));
        k10.addView(new View(getParentActivity()), w7.y5.n(5, -1));
        this.f38035q1 = h.e(105, R.drawable.msg_archive, LocaleController.getString(R.string.Archive));
        this.f38020n1 = h.e(108, R.drawable.msg_pin, LocaleController.getString(R.string.DialogPin));
        this.f38025o1 = h.e(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.f38030p1 = h.e(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.f38047s1 = h.e(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.f38041r1 = h.e(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.f38052t1 = h.e(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.l1.setOnLongClickListener(new bw(this, 1));
        arrayList.add(this.f38007k1);
        arrayList.add(this.f38014m1);
        arrayList.add(this.l1);
        arrayList.add(this.f38003j1);
        arrayList.add(h);
        c5(false);
    }

    public final void U4() {
        if (this.R3 == null) {
            for (String str : getMessagesController().pendingSuggestions) {
                if ("AUTOARCHIVE_POPULAR".equals(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.HideNewChatsAlertTitle);
                    alertDialog$Builder.f18655a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.GoToSettings), new wv(this, 6));
                    showDialog(alertDialog$Builder.f18655a, new ov(this, 1));
                    this.R3 = str;
                    return;
                }
            }
        }
    }

    public final void V3() {
        int i10;
        ay ayVar = this.C0;
        if ((ayVar != null && ayVar.getParent() == this.fragmentView) || this.fragmentView == null || getParentActivity() == null) {
            return;
        }
        if (this.f38021n2 != null) {
            i10 = 2;
        } else if (!this.f38012l2) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        ay ayVar2 = new ay(this, getParentActivity(), this, i10, this.R0, this.V2, this.X2, new zx(this));
        this.C0 = ayVar2;
        this.glassEngine.c(ayVar2);
        ((my) this.fragmentView).addView(this.C0, this.B0);
        ay ayVar3 = this.C0;
        ayVar3.f26496c0.U = new dy(this);
        ayVar3.f26503j0.setOnItemClickListener(new wv(this, 1));
        this.C0.f26507o0.setOnItemClickListener(new wv(this, 2));
        this.C0.f26514v0.setOnItemClickListener(new zv(this, 0));
        this.C0.f26507o0.setOnItemLongClickListener(new wv(this, 3));
        this.C0.W.setOnItemClickListener(new wv(this, 4));
        this.C0.W.setOnItemLongClickListener(new zx(this));
        this.C0.setFilteredSearchViewDelegate(new wv(this, 5));
        this.C0.setAlpha(0.0f);
        this.C0.setScaleX(1.05f);
        this.C0.setScaleY(1.05f);
        this.C0.setVisibility(8);
        this.C0.setBlurredBackgroundDrawableFactory(this.f38028o4);
    }

    public final void V4(long j3, View view) {
        ArrayList<TLRPC.Dialog> a42;
        int i10;
        s3(j3, view);
        boolean t10 = this.actionBar.t();
        ArrayList arrayList = this.I2;
        boolean z10 = true;
        if (t10) {
            if (arrayList.isEmpty()) {
                k4(true);
                return;
            }
        } else {
            if (this.f38032p3) {
                U3("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.e5)) {
                    hg.k0.v(false, this.actionBar);
                }
            } else {
                U3(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6));
            this.actionBar.P(null, null);
            int i11 = this.f37976e0[0].f37599s;
            if ((i11 != 7 && i11 != 8) || (this.actionBar.t() && !this.actionBar.u(null))) {
                a42 = getMessagesController().getDialogs(this.V2);
            } else {
                a42 = a4(this.currentAccount, this.f37976e0[0].f37599s, this.V2, this.S1);
            }
            int size = a42.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TLRPC.Dialog dialog = a42.get(i13);
                if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                    if (p4(dialog)) {
                        i12++;
                    } else if (!getMessagesController().isPromoDialog(dialog.f18333id, false)) {
                        break;
                    }
                }
            }
            if (i12 > 1) {
                if (this.f37976e0 != null) {
                    int i14 = 0;
                    while (true) {
                        sy[] syVarArr = this.f37976e0;
                        if (i14 >= syVarArr.length) {
                            break;
                        }
                        syVarArr[i14].d.H = true;
                        i14++;
                    }
                }
                p5(MessagesController.UPDATE_MASK_REORDER, true);
            }
            if (!this.f38032p3) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f37998i1;
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
            ValueAnimator valueAnimator = this.f38059u3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f38059u3 = ValueAnimator.ofFloat(this.f38054t3, 1.0f);
            int i16 = 0;
            while (true) {
                sy[] syVarArr2 = this.f37976e0;
                if (i16 >= syVarArr2.length) {
                    break;
                }
                sy syVar = syVarArr2[i16];
                if (syVar != null) {
                    syVar.f37593a.J0(true);
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
            this.f38059u3.addUpdateListener(new xv(this, max, 0));
            this.f38059u3.addListener(new tx(this, max, 1));
            this.f38059u3.setInterpolator(org.telegram.ui.Components.sr.f28359f);
            this.f38059u3.setDuration(200L);
            this.f38059u3.start();
            iy iyVar = this.f38079z0;
            if (iyVar != null) {
                iyVar.b(org.telegram.ui.ActionBar.i6.Gh, org.telegram.ui.ActionBar.i6.Fh, org.telegram.ui.ActionBar.i6.Eh, org.telegram.ui.ActionBar.i6.Hh, org.telegram.ui.ActionBar.i6.f19410w8);
            }
            org.telegram.ui.ActionBar.h2 h2Var = this.f37977e1;
            if (h2Var != null) {
                h2Var.c(1.0f, true);
            }
            z10 = false;
        }
        c5(false);
        this.f37993h1.a(arrayList.size(), z10);
    }

    public final void W3() {
        Activity parentActivity;
        UndoView[] undoViewArr = this.f38076y0;
        if (undoViewArr[0] == null && (parentActivity = getParentActivity()) != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                undoViewArr[i10] = new ux(this, parentActivity);
                FrameLayout.LayoutParams d = w7.y5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                d.bottomMargin = this.f37986f4 + this.f37996h4 + d.bottomMargin;
                UndoView undoView = undoViewArr[i10];
                int i11 = this.f38071x0 + 1;
                this.f38071x0 = i11;
                ((my) this.fragmentView).addView(undoView, i11, d);
            }
        }
    }

    public final void W4(long j3, View view) {
        String str;
        org.telegram.ui.Components.qc J;
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
            J = org.telegram.ui.Components.xc.a0(this).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new nv(this, 20));
        }
        J.j();
    }

    public final void X3(final long j3, final long j10, boolean z10, final wf1 wf1Var) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String string;
        String formatStringSimple;
        String string2;
        String str;
        String str2;
        TLRPC.TL_forumTopic findTopic;
        if (y3(j3)) {
            int i10 = this.R0;
            if (i10 != 11 && i10 != 12 && i10 != 13) {
                if (z10 && ((this.f37984f2 != null && this.f37989g2 != null) || this.f37994h2 != null)) {
                    if (getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        if (DialogObject.isEncryptedDialog(j3)) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(org.telegram.messenger.l0.k(getMessagesController(), j3).user_id));
                            if (user2 != null) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f37984f2, UserObject.getUserName(user2));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                return;
                            }
                        } else if (DialogObject.isUserDialog(j3)) {
                            if (j3 == getUserConfig().getClientUserId()) {
                                str = LocaleController.getString(R.string.SendMessageTitle);
                                str2 = LocaleController.formatStringSimple(this.f37989g2, LocaleController.getString(R.string.SavedMessages));
                                string2 = LocaleController.getString(R.string.Send);
                            } else {
                                TLRPC.User user3 = getMessagesController().getUser(Long.valueOf(j3));
                                if (user3 != null && this.f37984f2 != null) {
                                    str = LocaleController.getString(R.string.SendMessageTitle);
                                    str2 = LocaleController.formatStringSimple(this.f37984f2, UserObject.getUserName(user3));
                                    string2 = LocaleController.getString(R.string.Send);
                                } else {
                                    return;
                                }
                            }
                        } else {
                            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j3));
                            if (chat2 != null) {
                                String str3 = chat2.title;
                                if (j10 != 0 && (findTopic = getMessagesController().getTopicsController().findTopic(chat2.f18329id, j10)) != null) {
                                    str3 = ((Object) str3) + " " + findTopic.title;
                                }
                                if (this.f37994h2 != null) {
                                    string = LocaleController.getString(R.string.AddToTheGroupAlertTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f37994h2, str3);
                                    string2 = LocaleController.getString(R.string.Add);
                                } else {
                                    string = LocaleController.getString(R.string.SendMessageTitle);
                                    formatStringSimple = LocaleController.formatStringSimple(this.f37989g2, str3);
                                    string2 = LocaleController.getString(R.string.Send);
                                }
                                String str4 = formatStringSimple;
                                str = string;
                                str2 = str4;
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                        c2Var.R = str;
                        c2Var.T = AndroidUtilities.replaceTags(str2);
                        alertDialog$Builder.k(string2, new org.telegram.ui.ActionBar.b2() {
                            @Override
                            public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i11) {
                                ty.this.X3(j3, j10, false, wf1Var);
                            }
                        });
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        if (showDialog(c2Var) == null) {
                            c2Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == 15) {
                    Runnable h0Var = new a3.h0(this, j3, new a3.g0(this, j3, j10, wf1Var, 14), 23);
                    if (j3 < 0) {
                        Z4(getMessagesController().getChat(Long.valueOf(-j3)), h0Var, null);
                        return;
                    }
                    TLRPC.User user4 = getMessagesController().getUser(Long.valueOf(j3));
                    TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(this.H));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user4), UserObject.getFirstName(user5));
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f18655a;
                    c2Var2.R = formatString;
                    c2Var2.T = TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user4), UserObject.getFirstName(user5))));
                    alertDialog$Builder2.k(LocaleController.formatString("Send", R.string.Send, new Object[0]), new au(h0Var, 3));
                    alertDialog$Builder2.h(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new org.telegram.ui.Components.voip.e1(4));
                    showDialog(c2Var2);
                    return;
                } else if (this.C2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(j3, j10));
                    if (this.C2.u(this, arrayList, null, false, this.J2, this.K2, this.L2, wf1Var) && this.f37999i2) {
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
                    UndoView h42 = h4();
                    if (h42 != null) {
                        h42.j(45, j3, null);
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
                    UndoView h43 = h4();
                    if (h43 != null) {
                        h43.j(46, j3, null);
                        return;
                    }
                    return;
                }
            }
            org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
            TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer = new TLRPC.TL_messages_checkHistoryImportPeer();
            tL_messages_checkHistoryImportPeer.peer = getMessagesController().getInputPeer(j3);
            getConnectionsManager().sendRequest(tL_messages_checkHistoryImportPeer, new ow(this, c2Var3, user, chat, j3, tL_messages_checkHistoryImportPeer));
            try {
                c2Var3.q(300L);
            } catch (Exception unused) {
            }
        }
    }

    public final void X4(boolean r16, boolean r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.X4(boolean, boolean, boolean, boolean):void");
    }

    public final void Y3(long j3, boolean z10) {
        if (this.f37976e0 != null) {
            int i10 = 0;
            while (true) {
                sy[] syVarArr = this.f37976e0;
                if (i10 < syVarArr.length) {
                    int childCount = syVarArr[i10].f37593a.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 < childCount) {
                            View childAt = this.f37976e0[i10].f37593a.getChildAt(i11);
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

    public final void Y4() {
        int i10;
        int i11;
        Long l4;
        if (this.M0 == null && !SharedConfig.appLocked && (!this.K || this.E0.g())) {
            t61[] t61VarArr = new t61[1];
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            org.telegram.ui.ActionBar.j5 titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView != null && titleTextView.getRightDrawable() != null) {
                this.D3.f();
                Drawable drawable = this.D3.f26971f[0];
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
            lx lxVar = new lx(this, this, getParentActivity(), Integer.valueOf(i10), getResourceProvider(), t61VarArr);
            if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
                lxVar.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
            }
            Long l10 = this.B3;
            if (l10 != null) {
                lxVar.setSelected(l10);
            } else {
                Drawable drawable2 = this.D3.f26971f[0];
                if (drawable2 instanceof org.telegram.ui.Components.q5) {
                    l4 = Long.valueOf(((org.telegram.ui.Components.q5) drawable2).i());
                } else {
                    l4 = null;
                }
                lxVar.setSelected(l4);
            }
            lxVar.setSaveState(1);
            lxVar.y(this.D3, titleTextView);
            mx mxVar = new mx(this, lxVar);
            this.M0 = mxVar;
            t61VarArr[0] = mxVar;
            mxVar.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i11, 48);
            t61VarArr[0].b();
        }
    }

    public final void Z4(org.telegram.tgnet.TLRPC.Chat r14, java.lang.Runnable r15, java.lang.Runnable r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.Z4(org.telegram.tgnet.TLRPC$Chat, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final java.util.ArrayList a4(int r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.a4(int, int, int, boolean):java.util.ArrayList");
    }

    public final void a5(boolean z10) {
        sy[] syVarArr;
        char c10;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            syVarArr = this.f37976e0;
            if (i12 >= syVarArr.length) {
                break;
            }
            syVarArr[i12].f37593a.C0();
            i12++;
        }
        if (z10 && syVarArr.length > 1) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        int i13 = syVarArr[c10].h;
        if (i13 >= 0 && i13 < getMessagesController().getDialogFilters().size()) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.f37976e0[c10].h);
            if (dialogFilter.isDefault()) {
                sy syVar = this.f37976e0[c10];
                syVar.f37599s = this.R0;
                py pyVar = syVar.f37593a;
                int i14 = py.f36563v3;
                pyVar.B1();
            } else {
                sy[] syVarArr2 = this.f37976e0;
                if (syVarArr2[c10 ^ 1].f37599s == 7) {
                    syVarArr2[c10].f37599s = 8;
                } else {
                    syVarArr2[c10].f37599s = 7;
                }
                syVarArr2[c10].f37593a.setScrollEnabled(true);
                MessagesController messagesController = getMessagesController();
                if (this.f37976e0[c10].f37599s == 8) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                messagesController.selectDialogFilter(dialogFilter, i10);
            }
            sy[] syVarArr3 = this.f37976e0;
            if (syVarArr3.length > 1) {
                syVarArr3[1].E = dialogFilter.locked;
            }
            sy syVar2 = syVarArr3[c10];
            xw xwVar = syVar2.d;
            xwVar.h = syVar2.f37599s;
            xwVar.l();
            sy syVar3 = this.f37976e0[c10];
            tw twVar = syVar3.f37595c;
            if (syVar3.f37599s == 0 && i4() && this.f37976e0[c10].v == 2) {
                i11 = 1;
            }
            twVar.h1(i11, (int) this.N);
            A3(this.f37976e0[c10]);
        }
    }

    public final float b4(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f - this.f37959b.e;
        } else {
            f7 = 1.0f;
        }
        return f7 * (1.0f - e4()) * this.f38039r.e;
    }

    public final void b5() {
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
        p41 p41Var = this.Z;
        if (p41Var != null && p41Var.getVisibility() != 8) {
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
            float f20 = this.f38072x1;
            f11 = (f7 * f20) + com.google.android.gms.internal.vision.e2.z(1.0f, f20, f10, f19);
            f12 = this.f38069w3;
        } else {
            f11 = (f7 * this.f38072x1) + this.N;
            f12 = this.f38069w3;
        }
        float f21 = f11 + f12 + this.T;
        gy gyVar = this.X;
        if (gyVar != null && gyVar.getVisibility() == 0) {
            f13 = this.X.getAlpha();
        } else {
            f13 = 0.0f;
        }
        float dp = AndroidUtilities.dp(4.0f) * f13;
        iy iyVar = this.f38079z0;
        if (iyVar != null) {
            iyVar.setTranslationY(f21 - dp);
            f15 = this.f38079z0.getAlpha();
            f16 = AndroidUtilities.dp(43.0f) * f15;
            f14 = f21 + f16;
        } else {
            f14 = f21;
            f15 = 0.0f;
            f16 = 0.0f;
        }
        org.telegram.ui.Components.ms msVar = this.J1;
        if (msVar != null) {
            float f22 = f14 - dp;
            int i11 = -AndroidUtilities.dp(3.0f);
            if (this.f37955a0 == null) {
                i10 = AndroidUtilities.dp(44.0f);
            } else {
                i10 = 0;
            }
            msVar.setTranslationY(AndroidUtilities.lerp(f22, i11 - i10, this.f37959b.e));
            f17 = this.J1.getMetadata().f14218c.f14226a;
            f18 = this.J1.c(0.0f);
        } else {
            f17 = 0.0f;
            f18 = 0.0f;
        }
        org.telegram.ui.Components.ls lsVar = this.K1;
        if (lsVar != null) {
            lsVar.setTranslationY(f21 - dp);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f17, f15));
            org.telegram.ui.Components.ls lsVar2 = this.K1;
            float min = Math.min(AndroidUtilities.dp(40.0f), (f18 + f16) - lerp);
            Matrix matrix = lsVar2.f26128b;
            if (lsVar2.e != lerp || lsVar2.f26130f != min) {
                lsVar2.e = lerp;
                lsVar2.f26130f = min;
                matrix.reset();
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, lerp);
                LinearGradient linearGradient = lsVar2.f26129c;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                lsVar2.invalidate();
            }
            this.K1.setAlpha(Math.max(f15, f17));
        }
    }

    public final int c4() {
        if (this.K) {
            return AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(81.0f);
        }
        return AndroidUtilities.dp(48.0f);
    }

    public final void c5(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.c5(boolean):void");
    }

    @Override
    public final boolean canBeginSlide() {
        iy iyVar;
        if (!this.F3.c()) {
            if (this.R0 == 3 && (iyVar = this.f38079z0) != null && iyVar.getVisibility() == 0 && this.f38079z0.K > 0) {
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
            ay ayVar = this.C0;
            if (ayVar != null) {
                ayVar.S();
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
        y7Var.M();
        y7Var.B(getThemedColor(org.telegram.ui.ActionBar.i6.f19356t8), false);
        y7Var.B(getThemedColor(org.telegram.ui.ActionBar.i6.f19463z8), true);
        y7Var.E(getThemedColor(org.telegram.ui.ActionBar.i6.f19392v8), false);
        y7Var.E(getThemedColor(org.telegram.ui.ActionBar.i6.f19444y8), true);
        y7Var.l();
        y7Var.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        y7Var.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (!this.inPreviewMode && (!AndroidUtilities.isTablet() || this.V2 == 0 || n4())) {
            return y7Var;
        }
        y7Var.setOccupyStatusBar(false);
        return y7Var;
    }

    @Override
    public final android.view.View createView(android.content.Context r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.createView(android.content.Context):android.view.View");
    }

    public final int d4() {
        if (this.K) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    public final void d5() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.d5():void");
    }

    @Override
    public final void didReceivedNotification(int r27, int r28, java.lang.Object... r29) {
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

    public final float e4() {
        kx kxVar = this.F3;
        if (kxVar != null && kxVar.c()) {
            return this.F3.e;
        }
        return 0.0f;
    }

    public final void e5(boolean r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.e5(boolean, boolean):void");
    }

    public final float f4() {
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.f37959b.e);
    }

    public final void f5(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.f5(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.Components.a80 a80Var = this.L0;
        if (a80Var != null) {
            a80Var.u();
        }
    }

    public final ai.l9 g4() {
        return getMessagesController().getStoriesController();
    }

    public final void g5() {
        float f7 = (((-this.f37986f4) - this.f38001i4) - this.f38057u1) - this.f38062v1;
        org.telegram.ui.Components.b20 b20Var = this.f38051t0;
        if (b20Var != null) {
            b20Var.setTranslationY(f7);
        }
        org.telegram.ui.Components.b20 b20Var2 = this.f38056u0;
        if (b20Var2 != null) {
            b20Var2.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            ci.e4 e4Var = this.f38029p0;
            if (e4Var != null) {
                e4Var.setTranslationY(f7 - AndroidUtilities.dp(52.0f));
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.z4 getBackButtonState() {
        if (!n4() && !this.F3.f33414f) {
            return org.telegram.ui.ActionBar.z4.f19975b;
        }
        return org.telegram.ui.ActionBar.z4.f19974a;
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
        this.Z3.setInterpolator(org.telegram.ui.Components.sr.f28360g);
        this.Z3.setDuration(i10);
        this.Z3.start();
        return this.Z3;
    }

    @Override
    public final java.util.ArrayList getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.getThemeDescriptions():java.util.ArrayList");
    }

    public final UndoView h4() {
        W3();
        UndoView[] undoViewArr = this.f38076y0;
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

    public final void h5(boolean z10) {
        boolean z11;
        boolean z12 = this.f38012l2;
        if ((!z12 || this.R0 == 10) && this.V2 == 0 && this.X2 == 0 && !this.inPreviewMode && ((!this.f38004j2 || z12) && !this.T3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.b20 b20Var = this.f38051t0;
        if (b20Var != null) {
            b20Var.e(z11, z10);
        }
        org.telegram.ui.Components.b20 b20Var2 = this.f38056u0;
        if (b20Var2 != null) {
            b20Var2.e(z11, z10);
        }
    }

    public final boolean i4() {
        if (!this.f38012l2 && this.R0 == 0 && this.X2 == 0 && this.V2 == 0 && getMessagesController().hasHiddenArchive()) {
            return true;
        }
        return false;
    }

    public final void i5(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        if (this.f38019n0 != null) {
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
                if (!getDownloadController().hasUnviewedDownloads() && !z12 && (this.f37987g0.getVisibility() != 0 || this.f37987g0.getAlpha() != 1.0f || z11)) {
                    this.f37997i0 = false;
                } else {
                    this.f37997i0 = true;
                }
                G3();
                boolean z14 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i12 = this.f37973d2;
                z13 = (i12 == 3 || i12 == 5) ? true : true;
                org.telegram.ui.ActionBar.g1 g1Var = this.f38024o0;
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
                this.f38019n0.b(z14, z13, z10);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        kx kxVar;
        if (!this.f38004j2 && (kxVar = this.F3) != null && kxVar.getFragment() != null) {
            return this.F3.getFragment().isLightStatusBar();
        }
        if (i0.a.f(getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean j4() {
        ArrayList arrayList = this.D2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void j5() {
        org.telegram.ui.Components.ar0 ar0Var;
        int i10;
        ax axVar = this.B1;
        ArrayList arrayList = this.I2;
        if (axVar != null) {
            this.f38018n.a(!arrayList.isEmpty(), true);
            k5();
            if (arrayList.isEmpty()) {
                if (this.R0 == 3 && this.f37984f2 == null) {
                    i10 = R.string.ForwardTo;
                } else {
                    i10 = R.string.SelectChat;
                }
                String string = LocaleController.getString(i10);
                if (this.P3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(string);
                } else {
                    this.actionBar.K(string, true, 350L, org.telegram.ui.Components.sr.h);
                }
                if (this.B1.getTag() != null) {
                    this.B1.n0(false, false, false);
                    this.B1.P();
                    this.B1.setTag(null);
                    this.fragmentView.requestLayout();
                }
            } else {
                if (this.B1.getTag() == null) {
                    if (!j4() && this.E2 == null) {
                        this.B1.setFieldText("");
                    }
                    this.B1.setTag(1);
                    if (!this.V3 && (ar0Var = this.G2) != null) {
                        this.V3 = true;
                        String string2 = LocaleController.getString(R.string.ShareTapToEditMedia);
                        ar0Var.j();
                        ar0Var.F = string2;
                        org.telegram.ui.Components.yq0 yq0Var = ar0Var.f22739a[0];
                        if (string2 != null) {
                            yq0Var.e.l(string2, false);
                        }
                        org.telegram.ui.Components.xq0 xq0Var = new org.telegram.ui.Components.xq0(ar0Var, 0);
                        ar0Var.G = xq0Var;
                        AndroidUtilities.runOnUIThread(xq0Var, 1000L);
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
                this.B1.Q1();
                if (this.P3 == arrayList.isEmpty()) {
                    this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]));
                } else {
                    this.actionBar.K(LocaleController.formatPluralString("Recipient", arrayList.size(), new Object[0]), false, 350L, org.telegram.ui.Components.sr.h);
                }
            }
            this.P3 = arrayList.isEmpty();
        } else if (this.R0 == 10) {
            l4(arrayList.isEmpty());
        }
    }

    public final void k4(boolean z10) {
        int i10;
        boolean z11;
        this.actionBar.s();
        this.I2.clear();
        org.telegram.ui.ActionBar.h2 h2Var = this.f37977e1;
        if (h2Var != null) {
            h2Var.c(0.0f, true);
        }
        iy iyVar = this.f38079z0;
        if (iyVar != null) {
            iyVar.b(org.telegram.ui.ActionBar.i6.K8, org.telegram.ui.ActionBar.i6.I8, org.telegram.ui.ActionBar.i6.J8, org.telegram.ui.ActionBar.i6.L8, org.telegram.ui.ActionBar.i6.f19057d6);
        }
        ValueAnimator valueAnimator = this.f38059u3;
        Object obj = null;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f38059u3 = null;
        }
        if (this.f38054t3 == 0.0f) {
            return;
        }
        L4(-c4());
        int i11 = 0;
        while (true) {
            sy[] syVarArr = this.f37976e0;
            if (i11 >= syVarArr.length) {
                break;
            }
            sy syVar = syVarArr[i11];
            if (syVar != null) {
                syVar.f37593a.J0(true);
            }
            i11++;
        }
        if (this.K) {
            i10 = 81;
        } else {
            i10 = 0;
        }
        float max = Math.max(0.0f, AndroidUtilities.dp(i10 + 48) + this.N);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38054t3, 0.0f);
        this.f38059u3 = ofFloat;
        ofFloat.addUpdateListener(new xv(this, max, 1));
        this.f38059u3.addListener(new tx(this, max, 0));
        this.f38059u3.setInterpolator(org.telegram.ui.Components.sr.f28359f);
        this.f38059u3.setDuration(200L);
        this.f38059u3.start();
        this.Y0 = false;
        ArrayList arrayList = this.f37956a1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList.get(i12);
                e10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
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
        c5(true);
        if (this.f37976e0 != null) {
            int i13 = 0;
            while (true) {
                sy[] syVarArr2 = this.f37976e0;
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
        p5(i15 | i14, true);
    }

    public final void k5() {
        org.telegram.ui.Components.ar0 ar0Var = this.G2;
        if (ar0Var != null) {
            int i10 = this.currentAccount;
            ar0Var.h(i10);
            ar0Var.d = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
            ArrayList arrayList = ar0Var.f22742f;
            arrayList.clear();
            ArrayList arrayList2 = this.I2;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            org.telegram.ui.Components.yq0 yq0Var = ar0Var.f22739a[0];
            if (ar0Var.f22740b == 1) {
                yq0Var.d.l(ar0Var.c(yq0Var), false);
            }
        }
    }

    public final void l4(boolean z10) {
        if (this.F3.c()) {
            z10 = true;
        }
        if (!z10 || !this.f37962b2) {
            this.T3 = z10;
            h5(true);
            if (z10) {
                ci.e4 e4Var = this.f38029p0;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                ci.e4 e4Var2 = this.f38034q0;
                if (e4Var2 != null) {
                    e4Var2.e(true);
                }
            }
        }
    }

    public final void l5(boolean z10) {
        boolean z11;
        if (this.f38011l0 == null) {
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

    public final void m5(TLRPC.User user, boolean z10) {
        org.telegram.ui.Components.o5 o5Var;
        hx hxVar = this.E0;
        org.telegram.ui.Components.o5 o5Var2 = null;
        if (hxVar != null && (o5Var = hxVar.f548a0) != null && hxVar.f567q0 != null) {
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
            if (emojiStatusDocumentId != null) {
                o5Var.j(emojiStatusDocumentId.longValue(), z10);
                o5Var.m(user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible, z10);
            } else if (user != null && MessagesController.getInstance(hxVar.f555f).isPremiumUser(user)) {
                if (hxVar.N0 == null) {
                    hxVar.N0 = hxVar.getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    hxVar.N0 = new org.telegram.ui.Components.p5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), hxVar.N0);
                }
                hxVar.N0.setColorFilter(new PorterDuffColorFilter(hxVar.f(org.telegram.ui.ActionBar.i6.f19472zh), PorterDuff.Mode.MULTIPLY));
                o5Var.g(hxVar.N0, z10);
                o5Var.m(false, z10);
            } else {
                o5Var.g(null, z10);
                o5Var.m(false, z10);
            }
            o5Var.k(Integer.valueOf(hxVar.f(org.telegram.ui.ActionBar.i6.f19472zh)));
            hxVar.W.invalidate();
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
                this.actionBar.setRightDrawableOnClick(new vv(this, 2));
                c71.t(this.currentAccount);
            } else if (user != null && MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
                if (this.K3 == null) {
                    this.K3 = getParentActivity().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                    this.K3 = new org.telegram.ui.Components.p5(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.K3);
                }
                this.K3.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.f19472zh), PorterDuff.Mode.MULTIPLY));
                this.D3.g(this.K3, z10);
                this.D3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(new vv(this, 3));
                c71.t(this.currentAccount);
            } else {
                this.D3.g(null, z10);
                this.D3.m(false, z10);
                this.actionBar.setRightDrawableOnClick(null);
            }
            org.telegram.ui.Components.o5 o5Var3 = this.D3;
            int i10 = org.telegram.ui.ActionBar.i6.f19472zh;
            o5Var3.k(Integer.valueOf(getThemedColor(i10)));
            org.telegram.ui.Cells.o oVar = this.E3;
            if (oVar != null) {
                oVar.setColor(getThemedColor(i10));
            }
            mx mxVar = this.M0;
            if (mxVar != null && (mxVar.getContentView() instanceof c71)) {
                org.telegram.ui.ActionBar.j5 titleTextView = this.actionBar.getTitleTextView();
                c71 c71Var = (c71) this.M0.getContentView();
                if (titleTextView != null) {
                    Drawable rightDrawable = titleTextView.getRightDrawable();
                    org.telegram.ui.Components.o5 o5Var4 = this.D3;
                    if (rightDrawable == o5Var4) {
                        o5Var2 = o5Var4;
                    }
                }
                c71Var.y(o5Var2, titleTextView);
            }
        }
    }

    public final boolean n4() {
        if (this.V2 == 1) {
            return true;
        }
        return false;
    }

    public final void n5() {
        ci.e4 e4Var;
        boolean storiesEnabled = getMessagesController().storiesEnabled();
        if (this.N3 != storiesEnabled) {
            g5();
            if (!this.N3 && storiesEnabled && (e4Var = this.f38029p0) != null) {
                e4Var.u();
            }
            this.N3 = storiesEnabled;
        }
        org.telegram.ui.Components.b20 b20Var = this.f38051t0;
        if (b20Var == null) {
            return;
        }
        if (this.R0 == 10) {
            b20Var.setImageResource(R.drawable.floating_check);
            this.f38051t0.setContentDescription(LocaleController.getString(R.string.Done));
            return;
        }
        b20Var.setImageResource(R.drawable.filled_fab_compose_32);
        this.f38051t0.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
    }

    public final boolean o4(long j3) {
        if (j3 < 0) {
            return false;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.f18476id);
        if ((topics != null && !topics.isEmpty()) || !MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.f18476id)) {
            return false;
        }
        return true;
    }

    public final void o5(boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        boolean z11;
        boolean z12;
        ai.l9 g42;
        ArrayList arrayList;
        boolean z13;
        boolean z14;
        int i10;
        float f7;
        float f10;
        if (this.E0 != null && this.I == null) {
            kx kxVar = this.F3;
            if ((kxVar == null || !kxVar.c()) && !this.f38032p3 && (lVar = this.actionBar) != null && !lVar.t() && !this.f38012l2) {
                ci.kc kcVar = ci.kc.F2;
                int i11 = 0;
                if ((kcVar != null && kcVar.d) || (getLastStoryViewer() != null && getLastStoryViewer().K0)) {
                    z10 = false;
                }
                if (!n4() && g4().G()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.X2 != 0) {
                    z12 = false;
                } else if (n4()) {
                    z12 = !g4().h.isEmpty();
                } else {
                    if (!z11 && (((arrayList = (g42 = g4()).f1198g) != null && arrayList.size() > 0) || g42.H())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z11 = g4().G();
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
                    hx hxVar = this.E0;
                    if (z13 != z15) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    hxVar.p(z10, z14);
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
                        this.J.addListener(new org.telegram.ui.Components.s81(this, 18));
                        this.J.setDuration(200L);
                        this.J.setInterpolator(org.telegram.ui.Components.sr.f28359f);
                        this.J.start();
                    } else {
                        hx hxVar2 = this.E0;
                        if (z16 && !isInPreviewMode()) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        hxVar2.setVisibility(i10);
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
                            f11 = c4();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.I = ofFloat2;
                        ofFloat2.addUpdateListener(new yx(this, f13, z12, f11));
                        this.I.addListener(new qx(this, z12, 2));
                        this.I.setDuration(200L);
                        this.I.setInterpolator(org.telegram.ui.Components.sr.f28359f);
                        this.I.start();
                        return;
                    }
                    this.K = z12;
                    hx hxVar3 = this.E0;
                    if ((z12 || this.L) && !isInPreviewMode()) {
                        i12 = 0;
                    }
                    hxVar3.setVisibility(i12);
                    if (!z12) {
                        L4(0.0f);
                    } else {
                        this.f38074x3 = -AndroidUtilities.dp(81.0f);
                        L4(-c4());
                    }
                    while (true) {
                        sy[] syVarArr = this.f37976e0;
                        if (i11 >= syVarArr.length) {
                            break;
                        }
                        sy syVar = syVarArr[i11];
                        if (syVar != null) {
                            syVar.f37593a.requestLayout();
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
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else if (this.F3.c() && this.F3.getFragment().onBackPressed(z10)) {
            if (z10) {
                this.F3.a();
                ay ayVar = this.C0;
                if (ayVar != null) {
                    ayVar.S();
                    return false;
                }
            }
        } else {
            org.telegram.ui.Components.a80 a80Var = this.L0;
            if (a80Var != null) {
                if (z10) {
                    a80Var.u();
                    this.L0 = null;
                    return false;
                }
            } else {
                iy iyVar = this.f38079z0;
                if (iyVar != null && iyVar.f26257n) {
                    if (z10) {
                        iyVar.setIsEditing(false);
                        R4(false);
                        return false;
                    }
                } else {
                    org.telegram.ui.ActionBar.l lVar = this.actionBar;
                    if (lVar != null && lVar.t()) {
                        if (z10) {
                            ay ayVar2 = this.C0;
                            if (ayVar2 != null && ayVar2.getVisibility() == 0) {
                                this.C0.R(false);
                            }
                            k4(true);
                            return false;
                        }
                    } else if (this.f37959b.f14203f) {
                        if (z10) {
                            this.X.f23850r.getText().clear();
                            this.Y.b(false);
                            this.X.f23850r.clearFocus();
                            return false;
                        }
                    } else {
                        iy iyVar2 = this.f38079z0;
                        if (iyVar2 != null && iyVar2.getVisibility() == 0 && !this.f37990g3) {
                            iy iyVar3 = this.f38079z0;
                            if (!iyVar3.O && !this.f38013l3) {
                                ArrayList arrayList = iyVar3.h;
                                if (!arrayList.isEmpty() && iyVar3.L != ((org.telegram.ui.Components.i00) arrayList.get(0)).f24973a) {
                                    if (z10) {
                                        iy iyVar4 = this.f38079z0;
                                        ArrayList arrayList2 = iyVar4.h;
                                        if (!arrayList2.isEmpty()) {
                                            iyVar4.f((org.telegram.ui.Components.i00) arrayList2.get(0), 0);
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        ax axVar = this.B1;
                        if (axVar != null && axVar.t0()) {
                            if (z10) {
                                this.B1.m0(true);
                            }
                        } else {
                            hx hxVar = this.E0;
                            if (hxVar.O == 0 && hxVar.S.L0() != 0) {
                                hxVar.h.y0(0);
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
        ci.ab abVar;
        iy iyVar;
        if (this.V1) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.i(true);
            }
            TLObject tLObject = this.X1;
            if (tLObject != null) {
                ay ayVar = this.C0;
                if (ayVar != null) {
                    ayVar.f26496c0.R(this.W1, tLObject);
                }
                this.X1 = null;
            }
            this.V1 = false;
        }
        if (!this.K && (iyVar = this.f38079z0) != null && iyVar.getVisibility() == 0 && this.f38039r.f14203f) {
            int i10 = (int) (-this.N);
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            if (i10 != 0 && i10 != currentActionBarHeight && i10 >= currentActionBarHeight / 2) {
                this.f37976e0[0].f37593a.canScrollVertically(1);
            }
        }
        UndoView undoView = this.f38076y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        if (!isInPreviewMode() && (abVar = this.K0) != null && abVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        super.onBecomeFullyHidden();
        K3();
        this.f38040r0 = true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        ci.e4 e4Var;
        super.onBecomeFullyVisible();
        if (n4()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z10 = globalMainSettings.getBoolean("archivehint", true);
            boolean isEmpty = a4(this.currentAccount, this.R0, this.V2, false).isEmpty();
            if (z10 && isEmpty) {
                MessagesController.getGlobalMainSettings().edit().putBoolean("archivehint", false).commit();
                z10 = false;
            }
            if (z10) {
                globalMainSettings.edit().putBoolean("archivehint", false).commit();
                P4();
            }
        }
        if (this.f38040r0 && !this.f38046s0 && (e4Var = this.f38029p0) != null && this.N3) {
            this.f38046s0 = true;
            this.f38040r0 = false;
            e4Var.u();
        }
        AndroidUtilities.runOnUIThread(new iw(this, 2), 200L);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.a80 a80Var = this.L0;
        if (a80Var != null) {
            a80Var.u();
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.c2 c2Var;
        super.onDialogDismiss(dialog);
        if (this.V2 == 0 && this.X2 == 0 && (c2Var = this.T1) != null && dialog == c2Var && getParentActivity() != null) {
            u3(false);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10;
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        int i11 = 0;
        if (bundle != null) {
            this.f38012l2 = bundle.getBoolean("onlySelect", false);
            this.f38015m2 = this.arguments.getBoolean("canSelectTopics", false);
            this.f38036q2 = this.arguments.getBoolean("cantSendToChannels", false);
            this.R0 = this.arguments.getInt("dialogsType", 0);
            this.O0 = this.arguments.getBoolean("quote", false);
            this.N0 = this.arguments.getBoolean("reply_to", false);
            this.P0 = this.arguments.getLong("reply_to_author", 0L);
            this.Q0 = this.arguments.getLong("forward_into_channel", 0L);
            this.f37984f2 = this.arguments.getString("selectAlertString");
            this.f37989g2 = this.arguments.getString("selectAlertStringGroup");
            this.f37994h2 = this.arguments.getString("addToGroupAlertString");
            this.f38042r2 = this.arguments.getBoolean("allowSwitchAccount");
            this.f38048s2 = this.arguments.getBoolean("checkCanWrite", true);
            this.f38053t2 = this.arguments.getBoolean("afterSignup", false);
            this.V2 = this.arguments.getInt("folderId", 0);
            long j3 = this.arguments.getLong("community_id", 0L);
            this.X2 = j3;
            if (j3 != 0) {
                this.Y2 = getMessagesController().getChat(Long.valueOf(this.X2));
                this.Z2 = getMessagesController().getChatFull(this.X2);
            }
            this.f37999i2 = this.arguments.getBoolean("resetDelegate", true);
            this.S0 = this.arguments.getInt("messagesCount", 0);
            this.T0 = this.arguments.getInt("hasPoll", 0);
            this.U0 = this.arguments.getBoolean("hasInvoice", false);
            this.f38058u2 = this.arguments.getBoolean("showSetPasswordConfirm", this.f38058u2);
            this.arguments.getInt("otherwiseRelogin");
            this.f38063v2 = this.arguments.getBoolean("allowGroups", true);
            this.f38068w2 = this.arguments.getBoolean("allowMegagroups", true);
            this.f38073x2 = this.arguments.getBoolean("allowLegacyGroups", true);
            this.f38078y2 = this.arguments.getBoolean("allowChannels", true);
            this.f38081z2 = this.arguments.getBoolean("allowUsers", true);
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
        if (this.f38021n2 == null) {
            this.f37973d2 = getConnectionsManager().getConnectionState();
            this.J3.addGlobal(NotificationCenter.emojiLoaded);
            if (!this.f38012l2) {
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
        r4(getAccountInstance());
        ai.l9 storiesController = getMessagesController().getStoriesController();
        if (!storiesController.A) {
            storiesController.T();
            if (!storiesController.f1209s) {
                ConnectionsManager.getInstance(storiesController.f1194a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new ai.y7(storiesController, 0));
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
        if (n4()) {
            ai.l9 storiesController2 = getMessagesController().getStoriesController();
            if (storiesController2.f1215z) {
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
        this.f37996h4 = i10;
        if (this.W) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.f38001i4 = i11;
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
        ax axVar = this.B1;
        if (axVar != null) {
            axVar.B0();
        }
        org.telegram.ui.Components.ar0 ar0Var = this.G2;
        if (ar0Var != null) {
            ar0Var.j();
        }
        tv tvVar = this.H2;
        if (tvVar != null) {
            AndroidUtilities.cancelRunOnUIThread(tvVar);
            this.H2 = null;
        }
        UndoView undoView = this.f38076y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f38027o3.unlock();
        this.C2 = null;
        za1 za1Var = za1.f40456b;
        if (za1Var != null) {
            za1Var.dismiss();
            za1.f40456b = null;
        }
    }

    @Override
    public final void onPanTranslationUpdate(float f7) {
        if (this.f37976e0 != null) {
            this.J0 = f7;
            ax axVar = this.B1;
            int i10 = 0;
            if (axVar != null && axVar.t0()) {
                this.fragmentView.setTranslationY(f7);
                while (true) {
                    sy[] syVarArr = this.f37976e0;
                    if (i10 >= syVarArr.length) {
                        break;
                    }
                    syVarArr[i10].setTranslationY(0.0f);
                    i10++;
                }
                if (!this.f38012l2) {
                    this.actionBar.setTranslationY(0.0f);
                    org.telegram.ui.Components.qc qcVar = this.f38022n3;
                    if (qcVar != null) {
                        qcVar.l();
                    }
                }
                ay ayVar = this.C0;
                if (ayVar != null) {
                    ayVar.setTranslationY(this.I0);
                    return;
                }
                return;
            }
            while (true) {
                sy[] syVarArr2 = this.f37976e0;
                if (i10 >= syVarArr2.length) {
                    break;
                }
                syVarArr2[i10].setTranslationY(f7);
                i10++;
            }
            if (!this.f38012l2) {
                this.actionBar.setTranslationY(f7);
                org.telegram.ui.Components.qc qcVar2 = this.f38022n3;
                if (qcVar2 != null) {
                    qcVar2.l();
                }
            }
            ay ayVar2 = this.C0;
            if (ayVar2 != null) {
                ayVar2.setTranslationY(this.J0 + this.I0);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.qc qcVar = this.S;
        if (qcVar != null) {
            qcVar.b();
            this.S = null;
        }
        kx kxVar = this.F3;
        if (kxVar != null) {
            kxVar.f33416r = true;
            rx rxVar = kxVar.f33411a;
            if (rxVar != null) {
                rxVar.onPause();
            }
        }
        org.telegram.ui.Components.a80 a80Var = this.L0;
        if (a80Var != null) {
            a80Var.u();
        }
        ax axVar = this.B1;
        if (axVar != null) {
            axVar.D0();
        }
        int i10 = 0;
        UndoView undoView = this.f38076y0[0];
        if (undoView != null) {
            undoView.e(0, true);
        }
        setBulletinDelegate(null);
        if (this.f37976e0 == null) {
            return;
        }
        while (true) {
            sy[] syVarArr = this.f37976e0;
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
                                bk0.m();
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
                                AndroidUtilities.runOnUIThread(new iw(this, 1));
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
                S4();
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
        xw xwVar;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.Components.fo0 fo0Var;
        ci.ab abVar;
        super.onResume();
        hx hxVar = this.E0;
        char c10 = 0;
        if (hxVar != null) {
            ArrayList arrayList = hxVar.f577x;
            ai.l9 l9Var = hxVar.f570s;
            l9Var.l(l9Var.f1198g);
            l9Var.l(l9Var.h);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.PeerStories y3 = l9Var.y(((ai.w) arrayList.get(i11)).f1642c);
                if (y3 != null) {
                    l9Var.X(y3);
                }
            }
        }
        kx kxVar = this.F3;
        if (kxVar != null) {
            kxVar.f33416r = false;
            rx rxVar = kxVar.f33411a;
            if (rxVar != null) {
                rxVar.onResume();
            }
        }
        if (!((ActionBarLayout) this.parentLayout).y() && (abVar = this.K0) != null && abVar.getVisibility() == 0) {
            this.K0.setVisibility(8);
            this.K0.setBackground(null);
        }
        if (this.f37976e0 != null) {
            int i12 = 0;
            while (true) {
                sy[] syVarArr = this.f37976e0;
                if (i12 >= syVarArr.length) {
                    break;
                }
                syVarArr[i12].d.l();
                i12++;
            }
        }
        ax axVar = this.B1;
        if (axVar != null) {
            axVar.E0();
        }
        long j3 = 0;
        if (!this.f38012l2 && this.V2 == 0 && this.X2 == 0) {
            getMediaDataController().checkStickers(4);
        }
        ay ayVar = this.C0;
        if (ayVar != null && (fo0Var = ayVar.f26496c0) != null) {
            fo0Var.l();
        }
        if (!this.f38053t2 && getUserConfig().unacceptedTermsOfService != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        NotificationManager notificationManager = (NotificationManager) getParentActivity().getSystemService("notification");
        if (z10 && this.V2 == 0 && this.X2 == 0 && this.f37968c2 && !this.f38012l2 && (i10 = Build.VERSION.SDK_INT) >= 23) {
            Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.f37968c2 = false;
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
                tyVar = this;
                org.telegram.messenger.o1 o1Var = new org.telegram.messenger.o1(tyVar, z13, z11, z12, parentActivity);
                if (tyVar.f38053t2 && (z11 || z13)) {
                    j3 = 4000;
                }
                AndroidUtilities.runOnUIThread(o1Var, j3);
            } else {
                tyVar = this;
            }
        } else {
            tyVar = this;
            if (!tyVar.f38012l2 && tyVar.V2 == 0 && tyVar.X2 == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(10020)) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.i6.L5), null);
                        alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.PermissionXiaomiLockscreen);
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new wv(this, 9));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.voip.e1(5));
                        showDialog(alertDialog$Builder.f18655a);
                    }
                } else {
                    return;
                }
            } else if (tyVar.V2 == 0 && tyVar.X2 == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
                if (getParentActivity() != null) {
                    if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder2.m(R.raw.permission_request_apk, 72, getThemedColor(org.telegram.ui.ActionBar.i6.L5), null);
                        alertDialog$Builder2.f18655a.T = LocaleController.getString(R.string.PermissionFSILockscreen);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new wv(this, 10));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new org.telegram.ui.Components.voip.e1(6));
                        showDialog(alertDialog$Builder2.f18655a);
                    }
                } else {
                    return;
                }
            }
        }
        S4();
        if (tyVar.f37976e0 != null) {
            int i13 = 0;
            while (true) {
                sy[] syVarArr2 = tyVar.f37976e0;
                if (i13 >= syVarArr2.length) {
                    break;
                }
                sy syVar2 = syVarArr2[i13];
                if (syVar2.f37599s == 0 && syVar2.v == 2 && syVar2.f37595c.L0() == 0 && i4()) {
                    tyVar.f37976e0[i13].f37595c.h1(1, (int) tyVar.N);
                }
                if (i13 == 0) {
                    tyVar.f37976e0[i13].d.getClass();
                } else {
                    tyVar.f37976e0[i13].d.getClass();
                }
                i13++;
            }
        }
        U4();
        setBulletinDelegate(new c9(this, 4));
        if (tyVar.f38032p3) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), tyVar.classGuid);
        }
        p5(0, false);
        i5(false, true);
        o5(false);
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            za1.n(this);
        }
        K3();
        if (tyVar.f38079z0 != null && (syVar = tyVar.f37976e0[0]) != null && (xwVar = syVar.d) != null) {
            int i14 = xwVar.h;
            if (i14 == 7 || i14 == 8) {
                MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
                if (i14 != 7) {
                    c10 = 1;
                }
                MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                if (dialogFilter != null) {
                    tyVar.f38079z0.h(dialogFilter.localId);
                }
            }
        }
    }

    @Override
    public final void onSlideProgress(boolean z10, float f7) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.Y3 && this.Z3 == null) {
            O4(f7);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        ci.ab abVar;
        ty tyVar;
        kx kxVar = this.F3;
        if (kxVar != null && kxVar.c()) {
            this.F3.getFragment().onTransitionAnimationEnd(z10, z11);
        } else {
            if (z10 && (abVar = this.K0) != null && abVar.getVisibility() == 0) {
                this.K0.setVisibility(8);
                this.K0.setBackground(null);
            }
            if (z10 && this.f38053t2) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).f31146x0.c(false);
                }
            }
        }
        if (!z10 && (tyVar = this.W2) != null) {
            tyVar.removeSelfFromStack();
        }
        K3();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        kx kxVar = this.F3;
        if (kxVar != null && kxVar.c()) {
            this.F3.getFragment().onTransitionAnimationProgress(z10, f7);
        } else {
            ci.ab abVar = this.K0;
            if (abVar != null && abVar.getVisibility() == 0) {
                if (z10) {
                    this.K0.setAlpha(1.0f - f7);
                } else {
                    this.K0.setAlpha(f7);
                }
            }
        }
        K3();
    }

    public final boolean p4(TLRPC.Dialog dialog) {
        char c10;
        if (dialog == null) {
            return false;
        }
        int i10 = this.f37976e0[0].f37599s;
        MessagesController.DialogFilter dialogFilter = null;
        if ((i10 == 7 || i10 == 8) && (!this.actionBar.t() || this.actionBar.u(null))) {
            MessagesController.DialogFilter[] dialogFilterArr = getMessagesController().selectedDialogFilter;
            if (this.f37976e0[0].f37599s == 8) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            dialogFilter = dialogFilterArr[c10];
        }
        if (dialogFilter != null) {
            if (dialogFilter.pinnedDialogs.indexOfKey(dialog.f18333id) < 0) {
                return false;
            }
            return true;
        }
        return dialog.pinned;
    }

    public final void p5(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.p5(int, boolean):void");
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.Y3 = true;
            K4(true);
            return;
        }
        this.Z3 = null;
        this.Y3 = false;
        K4(false);
        O4(1.0f);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        boolean presentFragment = super.presentFragment(o2Var);
        if (presentFragment && this.f37976e0 != null) {
            int i10 = 0;
            while (true) {
                sy[] syVarArr = this.f37976e0;
                if (i10 >= syVarArr.length) {
                    break;
                }
                syVarArr[i10].d.getClass();
                i10++;
            }
        }
        ci.e4 e4Var = this.f38029p0;
        if (e4Var != null) {
            e4Var.e(true);
        }
        ci.e4 e4Var2 = this.f38034q0;
        if (e4Var2 != null) {
            e4Var2.e(true);
        }
        org.telegram.ui.Components.qc.e();
        return presentFragment;
    }

    public final boolean q4() {
        if (this.C2 == null && this.f38021n2 == null) {
            return true;
        }
        return false;
    }

    public final boolean q5(long j3) {
        TLRPC.Chat chat;
        ax axVar;
        if ((this.S0 <= 1 && ((axVar = this.B1) == null || axVar.getVisibility() != 0 || TextUtils.isEmpty(this.B1.getFieldText()))) || !DialogObject.isChatDialog(j3) || (chat = getMessagesController().getChat(Long.valueOf(-j3))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        org.telegram.ui.Components.e5.u0(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError), null);
        return false;
    }

    @Override
    public final void r() {
        G4(true, true);
    }

    public final boolean s3(long j3, View view) {
        if (this.f38012l2 && getMessagesController().isForum(j3)) {
            return false;
        }
        Long valueOf = Long.valueOf(j3);
        ArrayList arrayList = this.I2;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Long.valueOf(j3));
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).V(false, true);
            } else if (view instanceof org.telegram.ui.Cells.i6) {
                ((org.telegram.ui.Cells.i6) view).s(false, true);
            }
            return false;
        }
        arrayList.add(Long.valueOf(j3));
        if (view instanceof org.telegram.ui.Cells.s2) {
            ((org.telegram.ui.Cells.s2) view).V(true, true);
        } else if (view instanceof org.telegram.ui.Cells.i6) {
            ((org.telegram.ui.Cells.i6) view).s(true, true);
        }
        return true;
    }

    public final void s4(long r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.s4(long):void");
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        super.setInPreviewMode(z10);
        hx hxVar = this.E0;
        if (hxVar != null) {
            if (this.G0 && !z10) {
                hxVar.setVisibility(0);
            } else {
                hxVar.setVisibility(8);
            }
        }
        h5(true);
        d5();
    }

    @Override
    public final void setTitleOverlayText(java.lang.String r6, int r7, java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    public final void t3(gg.q0 q0Var) {
        ay ayVar;
        if (this.f38032p3 && (ayVar = this.C0) != null) {
            ArrayList arrayList = ayVar.B0;
            if (!arrayList.isEmpty()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (q0Var.b((gg.q0) arrayList.get(i10))) {
                        return;
                    }
                }
            }
            arrayList.add(q0Var);
            gy gyVar = this.X;
            ArrayList arrayList2 = gyVar.F;
            arrayList2.add(q0Var);
            gyVar.I = arrayList2.size() - 1;
            gyVar.f();
            this.X.f23850r.getText().clear();
            f5(true, null, null, false, true);
        }
    }

    public final boolean t4(org.telegram.tgnet.TLRPC.Chat r6, org.telegram.tgnet.TLRPC.User r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.t4(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):boolean");
    }

    public final void u3(boolean z10) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            ArrayList arrayList = new ArrayList();
            if (this.V2 == 0 && this.X2 == 0 && Build.VERSION.SDK_INT >= 33 && bk0.n(parentActivity)) {
                if (z10) {
                    showDialog(new bk0(parentActivity, !org.telegram.ui.Components.ne0.c(), new fw(parentActivity, 1)));
                    return;
                }
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (getUserConfig().syncContacts && this.U1 && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                if (z10) {
                    org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.e5.w(parentActivity, new yv(this, 1)).f18655a;
                    this.T1 = c2Var;
                    showDialog(c2Var);
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
                    S4();
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

    public final boolean u4(TLRPC.User user) {
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

    public final void v3(CharSequence charSequence) {
        int i10;
        if (this.B1 != null) {
            if (this.D2 == null && this.E2 == null && this.F2 == null) {
                return;
            }
            if (this.G2 == null) {
                org.telegram.ui.Components.ar0 ar0Var = new org.telegram.ui.Components.ar0(getParentActivity(), getResourceProvider());
                this.G2 = ar0Var;
                ar0Var.setLayoutClickListener(new vv(this, 0));
                this.G2.setOnModeChangeListener(new wv(this, 0));
                ax axVar = this.B1;
                org.telegram.ui.Components.ar0 ar0Var2 = this.G2;
                if (ar0Var2 == null) {
                    axVar.getClass();
                } else {
                    axVar.G1 = ar0Var2;
                    axVar.addView(ar0Var2, 0, w7.y5.e(-1, 48, 51));
                    axVar.f21998g3 = false;
                    axVar.N();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G2.getLayoutParams();
                layoutParams.rightMargin = -this.B1.getPaddingRight();
                this.G2.setLayoutParams(layoutParams);
            }
            if (j4()) {
                this.G2.i(this.currentAccount, this.D2);
            } else {
                String str = this.E2;
                if (str != null) {
                    org.telegram.ui.Components.ar0 ar0Var3 = this.G2;
                    ar0Var3.g(this.currentAccount);
                    if (!str.isEmpty()) {
                        ar0Var3.e(str, true);
                    }
                } else {
                    CharSequence charSequence2 = this.F2;
                    if (charSequence2 != null) {
                        org.telegram.ui.Components.ar0 ar0Var4 = this.G2;
                        ar0Var4.g(this.currentAccount);
                        if (charSequence2.length() > 0) {
                            ar0Var4.e(charSequence2, true);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(charSequence)) {
                this.B1.setFieldText(charSequence);
            }
            ax axVar2 = this.B1;
            if (j4()) {
                i10 = R.string.AddCaption;
            } else {
                i10 = R.string.ShareComment;
            }
            axVar2.setOverrideHint(LocaleController.getString(i10));
            E3();
            if (this.G2.getMode() != 0) {
                this.B1.w1(false, false);
            }
            k5();
        }
    }

    public final void v4(View view) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        String str = null;
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.e6) null, false);
        g3Var.fixNavigationBar();
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
        uv uvVar = new uv(this, 0);
        g3Var.items = charSequenceArr;
        g3Var.itemIcons = iArr;
        g3Var.onClickListener = uvVar;
        showDialog(g3Var);
    }

    public final int w3() {
        if (this.B1 != null) {
            return (int) (this.f38077y1.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        } else if (this.X2 != 0) {
            return AndroidUtilities.dp(72.0f) + this.f37986f4;
        } else {
            return this.f37986f4 + this.f37996h4;
        }
    }

    public final void w4(android.view.View r25, int r26, s4.h0 r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty.w4(android.view.View, int, s4.h0):void");
    }

    @Override
    public final fh.d x() {
        return this.l4;
    }

    public final void x3() {
        AndroidUtilities.runOnUIThread(new nv(this, 3), 300L);
    }

    public final boolean x4(View view, int i10, float f7, org.telegram.ui.Components.xl0 xl0Var) {
        org.telegram.ui.Components.fo0 fo0Var;
        long j3;
        org.telegram.ui.Components.fo0 fo0Var2;
        TLRPC.EncryptedChat encryptedChat;
        long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof org.telegram.ui.Cells.a3) && xl0Var.j(i10) != 21) {
            if (!this.actionBar.t() && !AndroidUtilities.isTablet() && !this.f38012l2 && (view instanceof org.telegram.ui.Cells.s2)) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (!getMessagesController().isForum(s2Var.getDialogId()) && !this.F3.c() && s2Var.S(f7)) {
                    return Q4(s2Var);
                }
            }
            kx kxVar = this.F3;
            if (kxVar == null || !kxVar.c()) {
                ay ayVar = this.C0;
                boolean z10 = true;
                if (ayVar != null && xl0Var == (fo0Var2 = ayVar.f26496c0)) {
                    Object J = fo0Var2.J(i10);
                    if (!this.C0.f26496c0.N) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                        c2Var.R = string;
                        if (J instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) J;
                            if (chat.monoforum) {
                                c2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, ng.d.i(chat, this.currentAccount, false));
                            } else {
                                c2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title);
                            }
                            makeEncryptedDialogId = -chat.f18329id;
                        } else if (J instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) J;
                            if (user.f18476id == getUserConfig().clientUserId) {
                                c2Var.T = LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages));
                            } else {
                                c2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name));
                            }
                            makeEncryptedDialogId = user.f18476id;
                        } else if (J instanceof TLRPC.EncryptedChat) {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) J).user_id));
                            c2Var.T = LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.f18337id);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new ai.z1(this, makeEncryptedDialogId, 8));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        showDialog(c2Var);
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f19297q7));
                        }
                        return true;
                    }
                }
                ay ayVar2 = this.C0;
                if (ayVar2 != null && xl0Var == (fo0Var = ayVar2.f26496c0)) {
                    if (this.f38012l2) {
                        w4(view, i10, xl0Var);
                        return false;
                    }
                    if ((view instanceof org.telegram.ui.Cells.i6) && !fo0Var.O(i10)) {
                        j3 = ((org.telegram.ui.Cells.i6) view).getDialogId();
                    } else {
                        j3 = 0;
                    }
                    if (j3 != 0) {
                        V4(j3, view);
                        return true;
                    }
                } else {
                    Object I = ((gg.m) xl0Var).I(i10);
                    if (I instanceof TLRPC.Dialog) {
                        TLRPC.Dialog dialog = (TLRPC.Dialog) I;
                        if (this.f38012l2) {
                            if ((this.R0 == 3 || R3()) && q5(dialog.f18333id)) {
                                if (this.R0 == 1 && R3() && this.f38015m2 && getMessagesController().isForum(dialog.f18333id)) {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -dialog.f18333id);
                                    bundle.putBoolean("for_select", true);
                                    bundle.putBoolean("forward_to", true);
                                    if (this.R0 != 1) {
                                        z10 = false;
                                    }
                                    bundle.putBoolean("bot_share_to", z10);
                                    bundle.putBoolean("quote", this.O0);
                                    bundle.putBoolean("reply_to", this.N0);
                                    wf1 wf1Var = new wf1(bundle);
                                    wf1Var.L0 = this;
                                    presentFragment(wf1Var);
                                    return false;
                                }
                                s3(dialog.f18333id, view);
                                j5();
                                return true;
                            }
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            v4(view);
                            return false;
                        } else if (!this.actionBar.t() || !p4(dialog)) {
                            V4(dialog.f18333id, view);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean y3(long j3) {
        int i10;
        int i11 = this.R0;
        if (i11 != 15 && i11 != 16 && this.f37994h2 == null && this.f38048s2) {
            if (DialogObject.isChatDialog(j3)) {
                long j10 = -j3;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
                if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    if (this.f38036q2 || !ChatObject.isCanWriteToChannel(j10, this.currentAccount) || (i10 = this.T0) == 2 || i10 == 3) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.SendMessageTitle);
                        int i12 = this.T0;
                        if (i12 == 3) {
                            alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.TodoCantForward);
                        } else if (i12 == 2) {
                            alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.PublicPollCantForward);
                        } else {
                            alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.ChannelCantSendMessage);
                        }
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        showDialog(alertDialog$Builder.f18655a);
                        return false;
                    }
                    return true;
                }
                return true;
            } else if (DialogObject.isEncryptedDialog(j3)) {
                if (this.T0 != 0 || this.U0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.f18655a.R = LocaleController.getString(R.string.SendMessageTitle);
                    int i13 = this.T0;
                    if (i13 == 3) {
                        alertDialog$Builder2.f18655a.T = LocaleController.getString(R.string.TodoCantForwardSecretChat);
                    } else if (i13 != 0) {
                        alertDialog$Builder2.f18655a.T = LocaleController.getString(R.string.PollCantForwardSecretChat);
                    } else {
                        alertDialog$Builder2.f18655a.T = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
                    }
                    alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    showDialog(alertDialog$Builder2.f18655a);
                    return false;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public final void y4(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new ff(21));
        org.telegram.ui.Components.a80 H = org.telegram.ui.Components.a80.H(this, view);
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
                linearLayout.setBackground(org.telegram.ui.ActionBar.i6.Y(getThemedColor(org.telegram.ui.ActionBar.i6.f19147i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.e6) null);
                h9Var.r(currentUser);
                org.telegram.ui.Components.vg0 vg0Var = new org.telegram.ui.Components.vg0(this, getParentActivity(), z10);
                linearLayout.addView(vg0Var, w7.y5.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getParentActivity());
                if (z10) {
                    w9Var.setScaleX(0.833f);
                    w9Var.setScaleY(0.833f);
                }
                w9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                w9Var.getImageReceiver().setCurrentAccount(intValue);
                w9Var.e(currentUser, h9Var);
                vg0Var.addView(w9Var, w7.y5.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f19164j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.y5.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new org.telegram.ui.Cells.ua(this, intValue, H, 11));
                H.r(linearLayout, w7.y5.n(230, 48));
            }
        }
        ShapeDrawable b02 = org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(24.0f), getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.l1(0.15f, -16777216));
        H.f22612z.set(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        H.W(b02);
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        H.V(5);
        H.Z();
    }

    @Override
    public final List z() {
        return Arrays.asList(new mg.a(LocaleController.getString(R.string.DebugDialogsActivity)), new mg.a(LocaleController.getString(R.string.ClearLocalDatabase), new nv(this, 26)), new mg.a(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new nv(this, 27)));
    }

    public final void z3(boolean z10) {
        gi.j jVar;
        TLRPC.ChatFull chatFull;
        boolean z11;
        org.telegram.ui.Components.ms msVar = this.J1;
        if (msVar != null && (jVar = this.Q1) != null && (chatFull = this.Z2) != null) {
            if (this.X2 != 0 && chatFull.requests_pending > 0 && !this.f37959b.f14203f) {
                z11 = true;
            } else {
                z11 = false;
            }
            msVar.i(jVar, z11, z10);
            this.Q1.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.Z2.requests_pending, new Object[0]));
        }
    }

    public final void z4(int i10, long j3, TLRPC.Chat chat, boolean z10, boolean z11) {
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
}
