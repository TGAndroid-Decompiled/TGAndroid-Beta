package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sm0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public static final List f41544g1 = Arrays.asList("http", "https");
    public static final List f41545h1 = Collections.singletonList("tg");
    public nt A0;
    public String B0;
    public TLRPC.PaymentForm C0;
    public boolean D;
    public final TLRPC.PaymentReceipt D0;
    public ScrollView E;
    public TLRPC.TL_payments_validatedRequestedInfo E0;
    public boolean F;
    public TLRPC.TL_paymentFormMethod F0;
    public boolean G;
    public TLRPC.TL_shippingOption G0;
    public TextView H;
    public Long H0;
    public final org.telegram.ui.Cells.p4[] I;
    public TLRPC.TL_payments_validateRequestedInfo I0;
    public final ArrayList J;
    public TLRPC.TL_inputPaymentCredentialsGooglePay J0;
    public final org.telegram.ui.Cells.c7[] K;
    public String K0;
    public org.telegram.ui.Cells.t8 L;
    public String L0;
    public final org.telegram.ui.Cells.b9[] M;
    public JSONObject M0;
    public final org.telegram.ui.Cells.x9[] N;
    public org.telegram.messenger.jj N0;
    public FrameLayout O;
    public String O0;
    public FrameLayout P;
    public boolean P0;
    public LinearLayout Q;
    public boolean Q0;
    public org.telegram.ui.Cells.c9 R;
    public String[] R0;
    public org.telegram.ui.Cells.n3 S;
    public boolean S0;
    public qm0 T;
    public boolean T0;
    public TextView U;
    public boolean U0;
    public org.telegram.ui.Cells.r6 V;
    public boolean V0;
    public om0 W;
    public boolean W0;
    public org.telegram.ui.Cells.o5 X;
    public boolean X0;
    public final org.telegram.ui.Cells.a9[] Y;
    public org.telegram.ui.ActionBar.p6 Y0;
    public float Z;
    public rm0 Z0;
    public final ArrayList f41546a;
    public TL_account.Password f41547a0;
    public boolean f41548a1;
    public final HashMap f41549b;
    public boolean f41550b0;
    public TLRPC.InputInvoice f41551b1;
    public final HashMap f41552c;
    public int f41553c0;
    public org.telegram.messenger.q20 f41554c1;
    public final HashMap d;
    public rl0 f41555d0;
    public org.telegram.messenger.q20 f41556d1;
    public com.google.android.gms.internal.clearcut.v0 e;
    public boolean f41557e0;
    public k10 f41558e1;
    public EditTextBoldCursor[] f41559f;
    public sm0 f41560f0;
    public int f41561f1;
    public boolean f41562g0;
    public org.telegram.ui.Cells.m6[] h;
    public boolean f41563h0;
    public boolean f41564i0;
    public String f41565j0;
    public boolean f41566k0;
    public TLRPC.User f41567l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.t0 f41568n;
    public boolean f41569n0;
    public boolean f41570o0;
    public String f41571p0;
    public String f41572q0;
    public org.telegram.ui.Components.iq f41573r;
    public org.telegram.ui.ActionBar.k2 f41574r0;
    public org.telegram.ui.Components.iq f41575s;
    public xl0 f41576s0;
    public ArrayList f41577t0;
    public int f41578u0;
    public boolean f41579v0;
    public AnimatorSet f41580w;
    public String f41581w0;
    public WebView f41582x;
    public String f41583x0;
    public String f41584y;
    public TLRPC.TL_paymentSavedCredentialsCard f41585y0;
    public boolean f41586z0;

    public sm0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, org.telegram.messenger.jj jjVar, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l4, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.k2 k2Var, boolean z11) {
        super(null);
        this.f41546a = new ArrayList();
        this.f41549b = new HashMap();
        this.f41552c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.p4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.c7[3];
        this.M = new org.telegram.ui.Cells.b9[3];
        this.N = new org.telegram.ui.Cells.x9[2];
        this.Y = new org.telegram.ui.Cells.a9[7];
        this.Z = -4.5f;
        this.f41553c0 = 6;
        z0(inputInvoice, paymentForm, jjVar, str, i10, tL_payments_validatedRequestedInfo, tL_shippingOption, l4, str2, str3, tL_payments_validateRequestedInfo, z10, tL_inputPaymentCredentialsGooglePay, k2Var, z11);
    }

    public static void Y(sm0 sm0Var, TL_account.Password password, byte[] bArr) {
        byte[] bArr2;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = org.telegram.messenger.aw.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        ul0 ul0Var = new ul0(1, sm0Var, gettmppassword);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.aw.d(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            gettmppassword.password = d;
            if (d == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                ul0Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(sm0Var.currentAccount).sendRequest(gettmppassword, ul0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        ul0Var.run(null, tL_error2);
    }

    public static void Z(sm0 sm0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        sm0Var.I0(false);
        sm0Var.M0(true, false);
        if (tL_error != null) {
            String str = tL_error.text;
            str.getClass();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -2092780146:
                    if (str.equals("ADDRESS_CITY_INVALID")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1623547228:
                    if (str.equals("ADDRESS_STREET_LINE1_INVALID")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1224177757:
                    if (str.equals("ADDRESS_COUNTRY_INVALID")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1031752045:
                    if (str.equals("REQ_INFO_NAME_INVALID")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -274035920:
                    if (str.equals("ADDRESS_POSTCODE_INVALID")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 417441502:
                    if (str.equals("ADDRESS_STATE_INVALID")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 708423542:
                    if (str.equals("REQ_INFO_PHONE_INVALID")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 863965605:
                    if (str.equals("ADDRESS_STREET_LINE2_INVALID")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 889106340:
                    if (str.equals("REQ_INFO_EMAIL_INVALID")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    sm0Var.J0(2);
                    return;
                case 1:
                    sm0Var.J0(0);
                    return;
                case 2:
                    sm0Var.J0(4);
                    return;
                case 3:
                    sm0Var.J0(6);
                    return;
                case 4:
                    sm0Var.J0(5);
                    return;
                case 5:
                    sm0Var.J0(3);
                    return;
                case 6:
                    sm0Var.J0(9);
                    return;
                case 7:
                    sm0Var.J0(1);
                    return;
                case '\b':
                    sm0Var.J0(7);
                    return;
                default:
                    org.telegram.ui.Components.s4.e0(sm0Var.currentAccount, tL_error, sm0Var, tLObject, new Object[0]);
                    return;
            }
        }
    }

    public static void a0(sm0 sm0Var, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        int i10;
        sm0Var.E0 = tL_payments_validatedRequestedInfo;
        if (sm0Var.C0.saved_info != null && !sm0Var.T0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(sm0Var.currentAccount);
            ag.c3 c3Var = new ag.c3(21);
            if (sm0Var.W0) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            connectionsManager.sendRequest(tL_payments_clearSavedInfo, c3Var, i10);
        }
        sm0Var.y0();
        sm0Var.I0(false);
        sm0Var.M0(true, false);
    }

    public static void b0(sm0 sm0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        sm0Var.I0(false);
        sm0Var.M0(true, false);
        if (tL_error != null) {
            org.telegram.ui.Components.s4.e0(sm0Var.currentAccount, tL_error, sm0Var, tLObject, new Object[0]);
        }
    }

    public static void c0(sm0 sm0Var, org.telegram.ui.Components.wb wbVar, boolean z10, TLRPC.Message message) {
        wbVar.b();
        if (z10) {
            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(un.ga(message.f19814id, org.telegram.messenger.jj.B0(message)));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = message.f19814id;
        tL_payments_getPaymentReceipt.peer = org.telegram.messenger.vp.r1(sm0Var.currentAccount).l1(message.peer_id);
        ConnectionsManager.getInstance(sm0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new ml0(sm0Var, 0), 2);
    }

    public static void d0(sm0 sm0Var) {
        int i10;
        TL_account.resendPasswordEmail resendpasswordemail = new TL_account.resendPasswordEmail();
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(sm0Var.currentAccount);
        ag.c3 c3Var = new ag.c3(21);
        if (sm0Var.W0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        connectionsManager.sendRequest(resendpasswordemail, c3Var, i10);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sm0Var.getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131746137, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.T = L0;
        x1Var.R = org.telegram.messenger.cd.L0(2131689472, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
        sm0Var.showDialog(x1Var);
    }

    public static void e0(sm0 sm0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        wd wdVar = new wd(sm0Var, z10, str, 5);
        if (!z10) {
            byte[] h12 = org.telegram.messenger.i0.h1(str2);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = sm0Var.f41547a0.new_algo;
            if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                updatepasswordsettings.new_settings.new_password_hash = org.telegram.messenger.aw.b(h12, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                if (updatepasswordsettings.new_settings.new_password_hash == null) {
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    tL_error.text = "ALGO_INVALID";
                    wdVar.run(null, tL_error);
                }
                ConnectionsManager.getInstance(sm0Var.currentAccount).sendRequest(updatepasswordsettings, wdVar, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            wdVar.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(sm0Var.currentAccount).sendRequest(updatepasswordsettings, wdVar, 10);
    }

    public static void f0(sm0 sm0Var, TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        org.telegram.ui.Components.s4.e0(sm0Var.currentAccount, tL_error, sm0Var, tL_payments_sendPaymentForm, new Object[0]);
        sm0Var.I0(false);
        sm0Var.M0(false, false);
        sm0Var.f41548a1 = true;
        sm0Var.f41561f1 = 4;
        rm0 rm0Var = sm0Var.Z0;
        if (rm0Var != null) {
            rm0Var.e(4);
        }
    }

    public static void g0(sm0 sm0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.k2 Q;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            rh.h8.l1(sm0Var.getParentActivity(), sm0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, sm0Var.Y0);
        } else if ((tLObject instanceof TLRPC.PaymentReceipt) && (Q = LaunchActivity.Q()) != 0) {
            ?? obj = new Object();
            obj.f20389a = true;
            sm0 sm0Var2 = new sm0((TLRPC.PaymentReceipt) tLObject);
            sm0Var2.f41554c1 = sm0Var.f41554c1;
            sm0Var2.f41556d1 = sm0Var.f41556d1;
            Q.showAsSheet(sm0Var2, obj);
        }
    }

    public static void h0(sm0 sm0Var, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        sm0Var.M0(true, false);
        sm0Var.I0(false);
        if (tLObject != null) {
            sm0Var.f41579v0 = true;
            org.telegram.messenger.d20.i(sm0Var.currentAccount).f15175y = (TL_account.tmpPassword) tLObject;
            org.telegram.messenger.d20.i(sm0Var.currentAccount).v(false);
            sm0Var.y0();
        } else if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            try {
                sm0Var.f41559f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            org.telegram.messenger.i0.F3(3.25f, sm0Var.f41559f[1], null);
            sm0Var.f41559f[1].setText("");
        } else {
            org.telegram.ui.Components.s4.e0(sm0Var.currentAccount, tL_error, sm0Var, gettmppassword, new Object[0]);
        }
    }

    public static void i0(sm0 sm0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.k2 Q;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            rh.h8.l1(sm0Var.getParentActivity(), sm0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, sm0Var.Y0);
        } else if ((tLObject instanceof TLRPC.PaymentReceipt) && (Q = LaunchActivity.Q()) != 0) {
            ?? obj = new Object();
            obj.f20389a = true;
            sm0 sm0Var2 = new sm0((TLRPC.PaymentReceipt) tLObject);
            sm0Var2.f41554c1 = sm0Var.f41554c1;
            sm0Var2.f41556d1 = sm0Var.f41556d1;
            Q.showAsSheet(sm0Var2, obj);
        }
    }

    public static void j0(sm0 sm0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.m0(password, false)) {
                org.telegram.ui.Components.s4.w0(sm0Var.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, null), true);
                return;
            } else if (!password.has_password) {
                sm0Var.f41579v0 = false;
                sm0Var.y0();
                return;
            } else {
                Utilities.e.c(new qd0(sm0Var, password, org.telegram.messenger.i0.h1(str), 17));
                return;
            }
        }
        org.telegram.ui.Components.s4.e0(sm0Var.currentAccount, tL_error, sm0Var, getpassword, new Object[0]);
        sm0Var.M0(true, false);
        sm0Var.I0(false);
    }

    public static void k0(sm0 sm0Var, org.telegram.ui.Components.wb wbVar, boolean z10, TLRPC.Message[] messageArr) {
        wbVar.b();
        if (z10) {
            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(un.ga(messageArr[0].f19814id, org.telegram.messenger.jj.B0(messageArr[0])));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = messageArr[0].f19814id;
        tL_payments_getPaymentReceipt.peer = org.telegram.messenger.vp.r1(sm0Var.currentAccount).l1(messageArr[0].peer_id);
        ConnectionsManager.getInstance(sm0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new ml0(sm0Var, 2), 2);
    }

    public static void l0(org.telegram.ui.sm0 r23, java.lang.String r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sm0.l0(org.telegram.ui.sm0, java.lang.String, android.view.View):void");
    }

    public static void m0(sm0 sm0Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, String str) {
        String G;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(sm0Var.currentAccount).sendRequest(new TL_account.getPassword(), new org.telegram.messenger.voip.u0(8, sm0Var, z10), 8);
            return;
        }
        sm0Var.M0(true, false);
        if (z10) {
            TL_account.Password password = sm0Var.f41547a0;
            password.has_password = false;
            password.current_algo = null;
            sm0Var.T.a(password);
            sm0Var.finishFragment();
        } else if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (sm0Var.getParentActivity() != null) {
                sm0Var.y0();
            }
        } else if (tL_error != null) {
            if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if (tL_error.text.equals("EMAIL_INVALID")) {
                    sm0Var.K0(org.telegram.messenger.cd.L0(2131689472, null), org.telegram.messenger.cd.L0(2131747461, null));
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    if (intValue < 60) {
                        G = org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    sm0Var.K0(org.telegram.messenger.cd.L0(2131689472, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, G));
                    return;
                } else {
                    sm0Var.K0(org.telegram.messenger.cd.L0(2131689472, null), tL_error.text);
                    return;
                }
            }
            sm0Var.f41553c0 = Utilities.z(tL_error.text).intValue();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sm0Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), new rv(29, sm0Var, str));
            String L0 = org.telegram.messenger.cd.L0(2131742846, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.T = L0;
            x1Var.R = org.telegram.messenger.cd.L0(2131742847, null);
            Dialog showDialog = sm0Var.showDialog(x1Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
            }
        }
    }

    public static void n0(org.telegram.ui.sm0 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sm0.n0(org.telegram.ui.sm0):void");
    }

    public static void o0(sm0 sm0Var) {
        int i10 = 0;
        if (org.telegram.messenger.d20.i(sm0Var.currentAccount).f15175y != null && org.telegram.messenger.d20.i(sm0Var.currentAccount).f15175y.valid_until < ConnectionsManager.getInstance(sm0Var.currentAccount).getCurrentTime() + 60) {
            org.telegram.messenger.d20.i(sm0Var.currentAccount).f15175y = null;
            org.telegram.messenger.d20.i(sm0Var.currentAccount).v(false);
        }
        if (org.telegram.messenger.d20.i(sm0Var.currentAccount).f15175y != null) {
            sm0Var.E0();
        } else if (sm0Var.f41559f[1].length() == 0) {
            try {
                sm0Var.f41559f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            org.telegram.messenger.i0.F3(2.5f, sm0Var.f41559f[1], null);
        } else {
            String obj = sm0Var.f41559f[1].getText().toString();
            sm0Var.M0(true, true);
            sm0Var.I0(true);
            TL_account.getPassword getpassword = new TL_account.getPassword();
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(sm0Var.currentAccount);
            aa aaVar = new aa(sm0Var, obj, getpassword, 28);
            if (sm0Var.W0) {
                i10 = 8;
            }
            connectionsManager.sendRequest(getpassword, aaVar, i10 | 2);
        }
    }

    public static void q0(sm0 sm0Var) {
        if (sm0Var.Q0) {
            return;
        }
        sm0Var.M0(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        sm0Var.I0 = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = sm0Var.f41551b1;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (sm0Var.N0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = sm0Var.getMessagesController().l1(sm0Var.N0.f16337k.peer_id);
            tL_inputInvoiceMessage.msg_id = sm0Var.N0.f1();
            sm0Var.I0.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = sm0Var.O0;
            sm0Var.I0.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = sm0Var.I0;
        tL_payments_validateRequestedInfo2.save = sm0Var.T0;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (sm0Var.C0.invoice.name_requested) {
            sm0Var.I0.info.name = sm0Var.f41559f[6].getText().toString();
            sm0Var.I0.info.flags |= 1;
        }
        int i10 = 8;
        if (sm0Var.C0.invoice.phone_requested) {
            sm0Var.I0.info.phone = "+" + sm0Var.f41559f[8].getText().toString() + sm0Var.f41559f[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = sm0Var.I0.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (sm0Var.C0.invoice.email_requested) {
            sm0Var.I0.info.email = sm0Var.f41559f[7].getText().toString().trim();
            sm0Var.I0.info.flags |= 4;
        }
        if (sm0Var.C0.invoice.shipping_address_requested) {
            sm0Var.I0.info.shipping_address = new TLRPC.TL_postAddress();
            sm0Var.I0.info.shipping_address.street_line1 = sm0Var.f41559f[0].getText().toString();
            sm0Var.I0.info.shipping_address.street_line2 = sm0Var.f41559f[1].getText().toString();
            sm0Var.I0.info.shipping_address.city = sm0Var.f41559f[2].getText().toString();
            sm0Var.I0.info.shipping_address.state = sm0Var.f41559f[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = sm0Var.I0.info.shipping_address;
            String str = sm0Var.B0;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = sm0Var.f41559f[5].getText().toString();
            sm0Var.I0.info.flags |= 8;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo3 = sm0Var.I0;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(sm0Var.currentAccount);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo4 = sm0Var.I0;
        org.telegram.ui.Components.t20 t20Var = new org.telegram.ui.Components.t20(29, sm0Var, tL_payments_validateRequestedInfo3);
        if (!sm0Var.W0) {
            i10 = 0;
        }
        connectionsManager.sendRequest(tL_payments_validateRequestedInfo4, t20Var, i10 | 2);
    }

    public static JSONObject t0() {
        List asList = Arrays.asList("AMEX", "DISCOVER", "JCB", "MASTERCARD", "VISA");
        List asList2 = Arrays.asList("PAN_ONLY", "CRYPTOGRAM_3DS");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "CARD");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("allowedAuthMethods", new JSONArray((Collection) asList2));
        jSONObject2.put("allowedCardNetworks", new JSONArray((Collection) asList));
        jSONObject.put("parameters", jSONObject2);
        return jSONObject;
    }

    public final void A0(Context context) {
        int i10;
        Optional empty;
        if (getParentActivity() != null) {
            ae.j jVar = new ae.j();
            if (this.C0.invoice.test) {
                i10 = 3;
            } else {
                i10 = 1;
            }
            if (i10 != 2 && i10 != 1 && i10 != 3) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(i0.a.i(i10, "Invalid environment value "));
            }
            jVar.f425a = i10;
            this.e = new com.google.android.gms.common.api.j(context, v8.p.f50722a, new v8.o(jVar), com.google.android.gms.common.api.i.f4346c);
            try {
                JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                put.put("allowedPaymentMethods", new JSONArray().put(t0()));
                empty = Optional.of(put);
            } catch (JSONException unused) {
                empty = Optional.empty();
            }
            if (!empty.isPresent()) {
                return;
            }
            String jSONObject = ((JSONObject) empty.get()).toString();
            ?? obj = new Object();
            n6.l.h(jSONObject, "isReadyToPayRequestJson cannot be null!");
            obj.f50685f = jSONObject;
            com.google.android.gms.internal.clearcut.v0 v0Var = this.e;
            v0Var.getClass();
            com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
            b10.f4494a = 23705;
            b10.f4496c = new n2.u((Object) obj, 29);
            v0Var.e(0, b10.a()).addOnCompleteListener(getParentActivity(), new sl0(this, 0));
        }
    }

    public final void B0() {
        if (this.f41557e0) {
            return;
        }
        this.f41557e0 = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ml0(this, 3), 10);
    }

    public final boolean C0(org.telegram.ui.ActionBar.z4 z4Var, Activity activity) {
        int i10 = 0;
        if (this.f41551b1 != null) {
            if (z4Var != null) {
                ArrayList arrayList = new ArrayList(z4Var.getFragmentStack());
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                    if (k2Var instanceof sm0) {
                        k2Var.removeSelfFromStack();
                    }
                }
                return true;
            }
            return false;
        }
        String str = this.f41567l0.username;
        if (((str != null && str.equalsIgnoreCase(getMessagesController().f18909t6) && this.O0 == null) || (this.O0 != null && getMessagesController().f18918u6 != null && Objects.equals(this.O0, getMessagesController().f18918u6))) && z4Var != null) {
            ArrayList arrayList2 = new ArrayList(z4Var.getFragmentStack());
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj2;
                if ((k2Var2 instanceof un) || (k2Var2 instanceof PremiumPreviewFragment)) {
                    k2Var2.removeSelfFromStack();
                }
            }
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
            premiumPreviewFragment.f33708p0 = true;
            ((ActionBarLayout) z4Var).S(premiumPreviewFragment, !isFinishing());
            if (activity instanceof LaunchActivity) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ((LaunchActivity) activity).f33391x0.c(false);
            }
            return true;
        }
        return false;
    }

    public final void D0(org.telegram.ui.ActionBar.k2 k2Var) {
        org.telegram.messenger.i0.v1(this.fragmentView);
        if (k2Var instanceof sm0) {
            sm0 sm0Var = (sm0) k2Var;
            sm0Var.Z0 = this.Z0;
            sm0Var.Y0 = this.Y0;
            sm0Var.X0 = this.X0;
            sm0Var.f41585y0 = this.f41585y0;
        }
    }

    public final void E0() {
        long j10;
        String str;
        if (this.Q0) {
            return;
        }
        int i10 = 0;
        M0(false, true);
        TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = new TLRPC.TL_payments_sendPaymentForm();
        TLRPC.InputInvoice inputInvoice = this.f41551b1;
        if (inputInvoice != null) {
            tL_payments_sendPaymentForm.invoice = inputInvoice;
        } else if (this.N0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = getMessagesController().l1(this.N0.f16337k.peer_id);
            tL_inputInvoiceMessage.msg_id = this.N0.f1();
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.O0;
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceSlug;
        }
        tL_payments_sendPaymentForm.form_id = this.C0.form_id;
        if (org.telegram.messenger.d20.i(this.currentAccount).f15175y != null && this.f41585y0 != null) {
            TLRPC.TL_inputPaymentCredentialsSaved tL_inputPaymentCredentialsSaved = new TLRPC.TL_inputPaymentCredentialsSaved();
            tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsSaved;
            tL_inputPaymentCredentialsSaved.f19811id = this.f41585y0.f19924id;
            tL_inputPaymentCredentialsSaved.tmp_password = org.telegram.messenger.d20.i(this.currentAccount).f15175y.tmp_password;
        } else {
            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = this.J0;
            if (tL_inputPaymentCredentialsGooglePay != null) {
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsGooglePay;
            } else {
                TLRPC.TL_inputPaymentCredentials tL_inputPaymentCredentials = new TLRPC.TL_inputPaymentCredentials();
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentials;
                tL_inputPaymentCredentials.save = this.U0;
                tL_inputPaymentCredentials.data = new TLRPC.TL_dataJSON();
                tL_payments_sendPaymentForm.credentials.data.data = this.f41581w0;
            }
        }
        TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = this.E0;
        if (tL_payments_validatedRequestedInfo != null && (str = tL_payments_validatedRequestedInfo.f19925id) != null) {
            tL_payments_sendPaymentForm.requested_info_id = str;
            tL_payments_sendPaymentForm.flags = 1 | tL_payments_sendPaymentForm.flags;
        }
        TLRPC.TL_shippingOption tL_shippingOption = this.G0;
        if (tL_shippingOption != null) {
            tL_payments_sendPaymentForm.shipping_option_id = tL_shippingOption.f19931id;
            tL_payments_sendPaymentForm.flags |= 2;
        }
        if ((this.C0.invoice.flags & 256) != 0) {
            Long l4 = this.H0;
            if (l4 != null) {
                j10 = l4.longValue();
            } else {
                j10 = 0;
            }
            tL_payments_sendPaymentForm.tip_amount = j10;
            tL_payments_sendPaymentForm.flags |= 4;
        }
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.currentAccount);
        ul0 ul0Var = new ul0(0, this, tL_payments_sendPaymentForm);
        if (this.W0) {
            i10 = 8;
        }
        connectionsManager.sendRequest(tL_payments_sendPaymentForm, ul0Var, i10 | 2);
    }

    public final void F0(boolean z10) {
        String str;
        String str2;
        if (!z10 && this.S.getVisibility() == 0) {
            String text = this.S.getText();
            if (text.length() == 0) {
                org.telegram.ui.Cells.n3 n3Var = this.S;
                try {
                    n3Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                org.telegram.messenger.i0.F3(2.5f, n3Var, null);
                return;
            }
            M0(true, true);
            TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
            confirmpasswordemail.code = text;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new ml0(this, 1), 10);
            return;
        }
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        if (z10) {
            this.f41568n.setVisibility(0);
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings;
            passwordinputsettings.flags = 2;
            passwordinputsettings.email = "";
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            str2 = null;
            str = null;
        } else {
            String obj = this.f41559f[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                J0(0);
                return;
            } else if (!obj.equals(this.f41559f[1].getText().toString())) {
                try {
                    Toast.makeText(getParentActivity(), org.telegram.messenger.cd.L0(2131747462, null), 0).show();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                J0(1);
                return;
            } else {
                String obj2 = this.f41559f[2].getText().toString();
                if (obj2.length() < 3) {
                    J0(2);
                    return;
                }
                int lastIndexOf = obj2.lastIndexOf(46);
                int lastIndexOf2 = obj2.lastIndexOf(64);
                if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                    updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
                    TL_account.passwordInputSettings passwordinputsettings2 = new TL_account.passwordInputSettings();
                    updatepasswordsettings.new_settings = passwordinputsettings2;
                    int i10 = passwordinputsettings2.flags;
                    passwordinputsettings2.flags = i10 | 1;
                    passwordinputsettings2.hint = "";
                    passwordinputsettings2.new_algo = this.f41547a0.new_algo;
                    passwordinputsettings2.flags = 3 | i10;
                    passwordinputsettings2.email = obj2.trim();
                    str = obj;
                    str2 = obj2;
                } else {
                    J0(2);
                    return;
                }
            }
        }
        M0(true, true);
        Utilities.e.c(new ag.n0(this, z10, str2, str, updatepasswordsettings, 12));
    }

    public final void G0(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        boolean z11 = true;
        org.telegram.ui.Cells.a9[] a9VarArr = this.Y;
        if (tL_postAddress != null) {
            String str = tL_postAddress.street_line1;
            String str2 = tL_postAddress.street_line2;
            String str3 = tL_postAddress.city;
            String str4 = tL_postAddress.state;
            String str5 = tL_postAddress.country_iso2;
            String str6 = tL_postAddress.post_code;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" ");
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(str3);
            c3.i0.r(sb2, ", ", str4, ", ", str5);
            a9VarArr[2].b(2131232271, a1.g.r(sb2, ", ", str6), org.telegram.messenger.cd.L0(2131747397, null), true);
        }
        org.telegram.ui.Cells.a9 a9Var = a9VarArr[2];
        int i13 = 8;
        if (tL_paymentRequestedInfo.shipping_address != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        a9Var.setVisibility(i10);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            a9VarArr[3].b(2131232099, str7, org.telegram.messenger.cd.L0(2131747428, null), true);
        }
        org.telegram.ui.Cells.a9 a9Var2 = a9VarArr[3];
        if (tL_paymentRequestedInfo.name != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        a9Var2.setVisibility(i11);
        if (tL_paymentRequestedInfo.phone != null) {
            org.telegram.ui.Cells.a9 a9Var3 = a9VarArr[4];
            String b10 = af.b.c().b(tL_paymentRequestedInfo.phone);
            String L0 = org.telegram.messenger.cd.L0(2131747426, null);
            if (tL_paymentRequestedInfo.email == null && this.G0 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            a9Var3.b(2131232082, b10, L0, z10);
        }
        org.telegram.ui.Cells.a9 a9Var4 = a9VarArr[4];
        if (tL_paymentRequestedInfo.phone != null) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        a9Var4.setVisibility(i12);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            org.telegram.ui.Cells.a9 a9Var5 = a9VarArr[5];
            String L02 = org.telegram.messenger.cd.L0(2131747431, null);
            if (this.G0 == null) {
                z11 = false;
            }
            a9Var5.b(2131232221, str8, L02, z11);
        }
        org.telegram.ui.Cells.a9 a9Var6 = a9VarArr[5];
        if (tL_paymentRequestedInfo.email != null) {
            i13 = 0;
        }
        a9Var6.setVisibility(i13);
    }

    public final void H0(TL_account.Password password) {
        boolean z10;
        if (password != null && password.has_password) {
            if (getParentActivity() == null) {
                return;
            }
            y0();
            return;
        }
        this.f41547a0 = password;
        if (password != null && !TextUtils.isEmpty(password.email_unconfirmed_pattern)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41550b0 = z10;
        O0();
    }

    public final void I0(boolean z10) {
        this.P0 = z10;
        this.G = !z10;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null && lVar.getBackButton() != null) {
            this.actionBar.getBackButton().setEnabled(!this.P0);
        }
        org.telegram.ui.Cells.a9 a9Var = this.Y[0];
        if (a9Var != null) {
            a9Var.setEnabled(!this.P0);
        }
    }

    public final void J0(int i10) {
        EditTextBoldCursor editTextBoldCursor = this.f41559f[i10];
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        org.telegram.messenger.i0.F3(2.5f, editTextBoldCursor, null);
    }

    public final void K0(String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = str;
        x1Var.T = str2;
        showDialog(x1Var);
    }

    public final void L0(Runnable runnable) {
        org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(getParentActivity(), false, 1, null);
        h.O = org.telegram.messenger.cd.L0(2131747430, null);
        h.P = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.f41585y0;
        if (tL_paymentSavedCredentialsCard != null) {
            arrayList.add(tL_paymentSavedCredentialsCard.title);
            arrayList2.add(2131232272);
        } else {
            String str = this.f41583x0;
            if (str != null) {
                arrayList.add(str);
                arrayList2.add(2131232272);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.TL_paymentSavedCredentialsCard> arrayList4 = this.C0.saved_credentials;
        int size = arrayList4.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = arrayList4.get(i10);
            i10++;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard3 = tL_paymentSavedCredentialsCard2;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard4 = this.f41585y0;
            if (tL_paymentSavedCredentialsCard4 == null || !Objects.equals(tL_paymentSavedCredentialsCard3.f19924id, tL_paymentSavedCredentialsCard4.f19924id)) {
                arrayList.add(tL_paymentSavedCredentialsCard3.title);
                arrayList2.add(2131232272);
                arrayList3.add(tL_paymentSavedCredentialsCard3);
            }
        }
        ArrayList<TLRPC.TL_paymentFormMethod> arrayList5 = this.C0.additional_methods;
        int size2 = arrayList5.size();
        int i11 = 0;
        while (i11 < size2) {
            TLRPC.TL_paymentFormMethod tL_paymentFormMethod = arrayList5.get(i11);
            i11++;
            arrayList.add(tL_paymentFormMethod.title);
            arrayList2.add(2131232274);
        }
        arrayList.add(org.telegram.messenger.cd.L0(2131747429, null));
        arrayList2.add(2131232043);
        int[] iArr = new int[arrayList2.size()];
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
        }
        org.telegram.ui.Components.t2 t2Var = new org.telegram.ui.Components.t2(this, runnable, arrayList3, arrayList, 1);
        h.L = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        h.M = iArr;
        h.K = t2Var;
        showDialog(h);
    }

    public final void M0(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.f41580w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10 && this.f41568n != null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f41580w = animatorSet2;
            if (z11) {
                this.f41573r.setVisibility(0);
                this.f41568n.setEnabled(false);
                AnimatorSet animatorSet3 = this.f41580w;
                View contentView = this.f41568n.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(contentView, property, 0.1f);
                View contentView2 = this.f41568n.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(contentView2, property2, 0.1f);
                View contentView3 = this.f41568n.getContentView();
                Property property3 = View.ALPHA;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, property3, 0.0f), ObjectAnimator.ofFloat(this.f41573r, property, 1.0f), ObjectAnimator.ofFloat(this.f41573r, property2, 1.0f), ObjectAnimator.ofFloat(this.f41573r, property3, 1.0f));
            } else if (this.f41582x != null) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f41573r, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.f41573r, View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.f41573r, View.ALPHA, 0.0f));
            } else {
                this.f41568n.getContentView().setVisibility(0);
                this.f41568n.setEnabled(true);
                AnimatorSet animatorSet4 = this.f41580w;
                org.telegram.ui.Components.iq iqVar = this.f41573r;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(iqVar, property4, 0.1f);
                org.telegram.ui.Components.iq iqVar2 = this.f41573r;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(iqVar2, property5, 0.1f);
                org.telegram.ui.Components.iq iqVar3 = this.f41573r;
                Property property6 = View.ALPHA;
                animatorSet4.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(iqVar3, property6, 0.0f));
                if (!isFinishing()) {
                    this.f41580w.playTogether(ObjectAnimator.ofFloat(this.f41568n.getContentView(), property4, 1.0f), ObjectAnimator.ofFloat(this.f41568n.getContentView(), property5, 1.0f), ObjectAnimator.ofFloat(this.f41568n.getContentView(), property6, 1.0f));
                }
            }
            this.f41580w.addListener(new lm0(this, z11, 0));
            this.f41580w.setDuration(150L);
            this.f41580w.start();
        } else if (this.U != null) {
            this.f41580w = new AnimatorSet();
            if (z11) {
                this.f41575s.setVisibility(0);
                this.W.setEnabled(false);
                AnimatorSet animatorSet5 = this.f41580w;
                TextView textView = this.U;
                Property property7 = View.SCALE_X;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView, property7, 0.1f);
                TextView textView2 = this.U;
                Property property8 = View.SCALE_Y;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView2, property8, 0.1f);
                TextView textView3 = this.U;
                Property property9 = View.ALPHA;
                animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, property9, 0.0f), ObjectAnimator.ofFloat(this.f41575s, property7, 1.0f), ObjectAnimator.ofFloat(this.f41575s, property8, 1.0f), ObjectAnimator.ofFloat(this.f41575s, property9, 1.0f));
            } else {
                this.U.setVisibility(0);
                this.W.setEnabled(true);
                AnimatorSet animatorSet6 = this.f41580w;
                org.telegram.ui.Components.iq iqVar4 = this.f41575s;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(iqVar4, property10, 0.1f);
                org.telegram.ui.Components.iq iqVar5 = this.f41575s;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(iqVar5, property11, 0.1f);
                org.telegram.ui.Components.iq iqVar6 = this.f41575s;
                Property property12 = View.ALPHA;
                animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(iqVar6, property12, 0.0f), ObjectAnimator.ofFloat(this.U, property10, 1.0f), ObjectAnimator.ofFloat(this.U, property11, 1.0f), ObjectAnimator.ofFloat(this.U, property12, 1.0f));
            }
            this.f41580w.addListener(new lm0(this, z11, 1));
            this.f41580w.setDuration(150L);
            this.f41580w.start();
        }
    }

    public final void N0(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131747370, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("PaymentTransactionMessage2", null, 2131747371, str, this.f41571p0, this.f41572q0));
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751771, null), new sl0(this, 5));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        showDialog(x1Var);
    }

    public final void O0() {
        if (this.f41578u0 == 6) {
            org.telegram.ui.Cells.b9[] b9VarArr = this.M;
            if (b9VarArr[2] != null) {
                int i10 = 0;
                this.f41568n.setVisibility(0);
                TL_account.Password password = this.f41547a0;
                ArrayList arrayList = this.J;
                org.telegram.ui.Cells.p4[] p4VarArr = this.I;
                org.telegram.ui.Cells.x9[] x9VarArr = this.N;
                if (password == null) {
                    M0(true, true);
                    b9VarArr[2].setVisibility(8);
                    x9VarArr[0].setVisibility(8);
                    x9VarArr[1].setVisibility(8);
                    this.S.setVisibility(8);
                    p4VarArr[0].setVisibility(8);
                    p4VarArr[1].setVisibility(8);
                    b9VarArr[0].setVisibility(8);
                    for (int i11 = 0; i11 < 3; i11++) {
                        ((View) this.f41559f[i11].getParent()).setVisibility(8);
                    }
                    while (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setVisibility(8);
                        i10++;
                    }
                    return;
                }
                M0(true, false);
                if (this.f41550b0) {
                    org.telegram.ui.Cells.b9 b9Var = b9VarArr[2];
                    String str = this.f41547a0.email_unconfirmed_pattern;
                    if (str == null) {
                        str = "";
                    }
                    b9Var.setText(org.telegram.messenger.cd.a0("EmailPasswordConfirmText2", null, 2131751200, str));
                    b9VarArr[2].setVisibility(0);
                    x9VarArr[0].setVisibility(0);
                    x9VarArr[1].setVisibility(0);
                    this.S.setVisibility(0);
                    b9VarArr[1].setText("");
                    p4VarArr[0].setVisibility(8);
                    p4VarArr[1].setVisibility(8);
                    b9VarArr[0].setVisibility(8);
                    for (int i12 = 0; i12 < 3; i12++) {
                        ((View) this.f41559f[i12].getParent()).setVisibility(8);
                    }
                    while (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setVisibility(8);
                        i10++;
                    }
                    return;
                }
                b9VarArr[2].setVisibility(8);
                x9VarArr[0].setVisibility(8);
                x9VarArr[1].setVisibility(8);
                b9VarArr[1].setText(org.telegram.messenger.cd.L0(2131747407, null));
                this.S.setVisibility(8);
                p4VarArr[0].setVisibility(0);
                p4VarArr[1].setVisibility(0);
                b9VarArr[0].setVisibility(0);
                for (int i13 = 0; i13 < 3; i13++) {
                    ((View) this.f41559f[i13].getParent()).setVisibility(0);
                }
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((View) arrayList.get(i14)).setVisibility(0);
                }
            }
        }
    }

    public final void P0() {
        org.telegram.ui.Cells.b9[] b9VarArr = this.M;
        if (b9VarArr[0] != null) {
            org.telegram.ui.Cells.c7[] c7VarArr = this.K;
            if (c7VarArr[2] != null) {
                TLRPC.PaymentForm paymentForm = this.C0;
                if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.f41582x != null && this.f41586z0)) {
                    this.L.setVisibility(8);
                    b9VarArr[0].setVisibility(8);
                    org.telegram.ui.Cells.c7 c7Var = c7VarArr[2];
                    org.telegram.ui.ActionBar.a7.a0(c7Var, c7Var.getContext(), 2131231231, org.telegram.ui.ActionBar.t6.f20892b7);
                    return;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.cd.L0(2131747437, null));
                if (this.C0.password_missing) {
                    B0();
                    spannableStringBuilder.append((CharSequence) "\n");
                    int length = spannableStringBuilder.length();
                    String L0 = org.telegram.messenger.cd.L0(2131747436, null);
                    int indexOf = L0.indexOf(42);
                    int lastIndexOf = L0.lastIndexOf(42);
                    spannableStringBuilder.append((CharSequence) L0);
                    if (indexOf != -1 && lastIndexOf != -1) {
                        int i10 = indexOf + length;
                        int i11 = lastIndexOf + length;
                        b9VarArr[0].getTextView().setMovementMethod(new org.telegram.messenger.e0(false));
                        spannableStringBuilder.replace(i11, i11 + 1, (CharSequence) "");
                        spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new pm0(this), i10, i11 - 1, 33);
                    }
                }
                this.L.setEnabled(true);
                b9VarArr[0].setText(spannableStringBuilder);
                this.L.setVisibility(0);
                b9VarArr[0].setVisibility(0);
                org.telegram.ui.Cells.c7 c7Var2 = c7VarArr[2];
                org.telegram.ui.ActionBar.a7.a0(c7Var2, c7Var2.getContext(), 2131231230, org.telegram.ui.ActionBar.t6.f20892b7);
            }
        }
    }

    public final void Q0() {
        this.R0[0] = x0(this.f41577t0);
        this.R.a(org.telegram.messenger.cd.L0(2131747369, null), this.R0[0], true);
        TextView textView = this.U;
        if (textView != null) {
            textView.setText(org.telegram.messenger.cd.a0("PaymentCheckoutPay", null, 2131747427, this.R0[0]));
        }
        if (this.f41576s0 != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.Si);
            int childCount = this.f41576s0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                TextView textView2 = (TextView) this.f41576s0.getChildAt(i10);
                if (textView2.getTag().equals(this.H0)) {
                    org.telegram.ui.ActionBar.t6.C1(themedColor, textView2.getBackground());
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Ti, this.Y0);
                } else {
                    org.telegram.ui.ActionBar.t6.C1(536870911 & themedColor, textView2.getBackground());
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Z8, this.Y0);
                }
                textView2.invalidate();
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21003h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20986g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
    }

    @Override
    public final android.view.View createView(android.content.Context r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sm0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19665p0) {
            TLRPC.PaymentForm paymentForm = this.C0;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            P0();
        } else if (i10 == org.telegram.messenger.zs.f19677r0) {
            TLRPC.PaymentForm paymentForm2 = this.C0;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            P0();
        } else if (i10 == org.telegram.messenger.zs.f19580a1) {
            this.f41548a1 = true;
            removeSelfFromStack();
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.Y0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.E, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21206s8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D8));
        if (this.f41559f != null) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f41559f;
                if (i10 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.c7((View) editTextBoldCursorArr[i10].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20929d6));
                i10++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.H6));
        }
        if (this.h != null) {
            for (int i11 = 0; i11 < this.h.length; i11++) {
            }
        }
        int i12 = 0;
        while (true) {
            org.telegram.ui.Cells.p4[] p4VarArr = this.I;
            if (i12 >= p4VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.c7(p4VarArr[i12], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20929d6));
            i12++;
        }
        for (int i13 = 0; i13 < this.K.length; i13++) {
        }
        for (int i14 = 0; i14 < this.M.length; i14++) {
        }
        int i15 = 0;
        while (true) {
            ArrayList arrayList2 = this.J;
            if (i15 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) arrayList2.get(i15), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20929d6));
            i15++;
        }
        int i16 = 1;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.L, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.L, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        for (int i17 = 0; i17 < this.N.length; i17++) {
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.U, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21204s6));
        while (true) {
            org.telegram.ui.Cells.a9[] a9VarArr = this.Y;
            if (i16 < a9VarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.c7(a9VarArr[i16], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20929d6));
                i16++;
            } else {
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.W, 268435456, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20929d6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(this.W, 268435456, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21020i6));
                return arrayList;
            }
        }
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.G;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i10 == 991) {
            org.telegram.messenger.i0.g3(new org.telegram.ui.Components.ji0(this, i11, intent, 21));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        WebView webView = this.f41582x;
        if (webView != null && this.D) {
            if (z10) {
                webView.loadUrl(this.f41584y);
                this.D = false;
            }
            return false;
        }
        return !this.P0;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.f41578u0 == 4 && this.X0) {
            this.X0 = false;
            this.W.callOnClick();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19665p0);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19677r0);
        if (this.f41578u0 != 4 || this.V0) {
            org.telegram.messenger.zs.f(this.currentAccount).b(this, org.telegram.messenger.zs.f19580a1);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sm0.onFragmentDestroy():void");
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        try {
            int i10 = this.f41578u0;
            if ((i10 == 2 || i10 == 6) && !this.C0.invoice.test) {
                getParentActivity().getWindow().setFlags(8192, 8192);
                org.telegram.messenger.i0.h2();
                return;
            }
            if (org.telegram.messenger.tz.f18180s.length() != 0 && !org.telegram.messenger.tz.A) {
                return;
            }
            getParentActivity().getWindow().clearFlags(8192);
            org.telegram.messenger.i0.h2();
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            ScrollView scrollView = this.E;
            if (scrollView != null) {
                org.telegram.messenger.i0.y3(scrollView, getThemedColor(org.telegram.ui.ActionBar.t6.f21206s8));
            }
            if (this.f41559f != null) {
                getThemedColor(org.telegram.ui.ActionBar.t6.G6);
                int i10 = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.f41559f;
                    if (i10 < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i10];
                        if (editTextBoldCursor != null) {
                            org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.t6.G6, this.Y0);
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11) {
            WebView webView = this.f41582x;
            if (webView != null) {
                if (this.f41578u0 != 4) {
                    TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.F0;
                    if (tL_paymentFormMethod != null) {
                        String str = tL_paymentFormMethod.url;
                        this.f41584y = str;
                        webView.loadUrl(str);
                        return;
                    }
                    String str2 = this.C0.url;
                    this.f41584y = str2;
                    webView.loadUrl(str2);
                    return;
                }
                return;
            }
            int i10 = this.f41578u0;
            if (i10 == 2) {
                org.telegram.messenger.i0.h3(new rl0(this, 3), 100L);
            } else if (i10 == 3) {
                this.f41559f[1].requestFocus();
                org.telegram.messenger.i0.J3(this.f41559f[1]);
            } else if (i10 == 4) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f41559f;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                }
            } else if (i10 == 6 && !this.f41550b0) {
                this.f41559f[0].requestFocus();
                org.telegram.messenger.i0.J3(this.f41559f[0]);
            }
        }
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.k2 k2Var) {
        D0(k2Var);
        return super.presentFragment(k2Var);
    }

    public final void r0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.t6.N0(true);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f20929d6);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.f21020i6);
        frameLayout.setBackground(N0);
        org.telegram.ui.ActionBar.a7.k(frameLayout, N0, N, N2, null);
        this.O.setVisibility(8);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        frameLayout2.setClickable(true);
        this.P.setFocusable(true);
        this.P.setBackgroundResource(2131231223);
        if (this.K0 == null) {
            this.P.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(2.0f));
        } else {
            this.P.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
        }
        this.O.addView(this.P, w7.b6.c(48.0f, -1));
        this.P.setOnClickListener(new nl0(this, 13));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.P.addView(linearLayout, w7.b6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(2131230909);
        linearLayout.addView(imageView, w7.b6.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(2131231225);
        this.P.addView(imageView2, w7.b6.c(-1.0f, -1));
    }

    public final void s0(String str) {
        boolean z10;
        boolean z11;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.w0.f19025b.getSystemService("phone");
            if (str == null && (telephonyManager.getSimState() == 1 || telephonyManager.getPhoneType() == 0)) {
                return;
            }
            if (getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (str != null || z10) {
                if (str == null) {
                    str = af.b.d(telephonyManager.getLine1Number(), false);
                }
                if (!TextUtils.isEmpty(str)) {
                    int i10 = 4;
                    String str2 = null;
                    if (str.length() > 4) {
                        while (true) {
                            if (i10 >= 1) {
                                String substring = str.substring(0, i10);
                                if (((String) this.f41552c.get(substring)) != null) {
                                    str2 = str.substring(i10);
                                    this.f41559f[8].setText(substring);
                                    z11 = true;
                                    break;
                                }
                                i10--;
                            } else {
                                z11 = false;
                                break;
                            }
                        }
                        if (!z11) {
                            str2 = str.substring(1);
                            this.f41559f[8].setText(str.substring(0, 1));
                        }
                    }
                    if (str2 != null) {
                        this.f41559f[9].setText(str2);
                        EditTextBoldCursor editTextBoldCursor = this.f41559f[9];
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final long u0() {
        TLRPC.InputInvoice inputInvoice = this.f41551b1;
        if (inputInvoice instanceof TLRPC.TL_inputInvoiceStars) {
            TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = ((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose;
            if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) {
                return ((TLRPC.TL_inputStorePaymentStarsGift) inputStorePaymentPurpose).stars;
            }
            if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) {
                return ((TLRPC.TL_inputStorePaymentStarsTopup) inputStorePaymentPurpose).stars;
            }
            if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) {
                return ((TLRPC.TL_inputStorePaymentStarsGiveaway) inputStorePaymentPurpose).stars;
            }
            return 0L;
        }
        return 0L;
    }

    public final long v0() {
        TLRPC.InputPeer inputPeer;
        TLRPC.InputInvoice inputInvoice = this.f41551b1;
        if (inputInvoice instanceof TLRPC.TL_inputInvoiceStars) {
            TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = ((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose;
            if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) {
                TLRPC.InputUser inputUser = ((TLRPC.TL_inputStorePaymentStarsGift) inputStorePaymentPurpose).user_id;
                if (inputUser != null) {
                    return inputUser.user_id;
                }
                return 0L;
            } else if ((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) && (inputPeer = ((TLRPC.TL_inputStorePaymentStarsGiveaway) inputStorePaymentPurpose).boost_peer) != null) {
                return org.telegram.messenger.o5.n(inputPeer);
            } else {
                return 0L;
            }
        }
        return 0L;
    }

    public final String w0(ArrayList arrayList) {
        double d;
        long j10 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i10)).amount;
        }
        org.telegram.messenger.cd.D0();
        String upperCase = this.C0.invoice.currency.toUpperCase();
        long abs = Math.abs(j10);
        upperCase.getClass();
        char c10 = 65535;
        switch (upperCase.hashCode()) {
            case 65726:
                if (upperCase.equals("BHD")) {
                    c10 = 0;
                    break;
                }
                break;
            case 65759:
                if (upperCase.equals("BIF")) {
                    c10 = 1;
                    break;
                }
                break;
            case 66267:
                if (upperCase.equals("BYR")) {
                    c10 = 2;
                    break;
                }
                break;
            case 66813:
                if (upperCase.equals("CLF")) {
                    c10 = 3;
                    break;
                }
                break;
            case 66823:
                if (upperCase.equals("CLP")) {
                    c10 = 4;
                    break;
                }
                break;
            case 67122:
                if (upperCase.equals("CVE")) {
                    c10 = 5;
                    break;
                }
                break;
            case 67712:
                if (upperCase.equals("DJF")) {
                    c10 = 6;
                    break;
                }
                break;
            case 70719:
                if (upperCase.equals("GNF")) {
                    c10 = 7;
                    break;
                }
                break;
            case 72732:
                if (upperCase.equals("IQD")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 72777:
                if (upperCase.equals("IRR")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 72801:
                if (upperCase.equals("ISK")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 73631:
                if (upperCase.equals("JOD")) {
                    c10 = 11;
                    break;
                }
                break;
            case 73683:
                if (upperCase.equals("JPY")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 74532:
                if (upperCase.equals("KMF")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 74704:
                if (upperCase.equals("KRW")) {
                    c10 = 14;
                    break;
                }
                break;
            case 74840:
                if (upperCase.equals("KWD")) {
                    c10 = 15;
                    break;
                }
                break;
            case 75863:
                if (upperCase.equals("LYD")) {
                    c10 = 16;
                    break;
                }
                break;
            case 76263:
                if (upperCase.equals("MGA")) {
                    c10 = 17;
                    break;
                }
                break;
            case 76618:
                if (upperCase.equals("MRO")) {
                    c10 = 18;
                    break;
                }
                break;
            case 78388:
                if (upperCase.equals("OMR")) {
                    c10 = 19;
                    break;
                }
                break;
            case 79710:
                if (upperCase.equals("PYG")) {
                    c10 = 20;
                    break;
                }
                break;
            case 81569:
                if (upperCase.equals("RWF")) {
                    c10 = 21;
                    break;
                }
                break;
            case 83210:
                if (upperCase.equals("TND")) {
                    c10 = 22;
                    break;
                }
                break;
            case 83974:
                if (upperCase.equals("UGX")) {
                    c10 = 23;
                    break;
                }
                break;
            case 84517:
                if (upperCase.equals("UYI")) {
                    c10 = 24;
                    break;
                }
                break;
            case 85132:
                if (upperCase.equals("VND")) {
                    c10 = 25;
                    break;
                }
                break;
            case 85367:
                if (upperCase.equals("VUV")) {
                    c10 = 26;
                    break;
                }
                break;
            case 86653:
                if (upperCase.equals("XAF")) {
                    c10 = 27;
                    break;
                }
                break;
            case 87087:
                if (upperCase.equals("XOF")) {
                    c10 = 28;
                    break;
                }
                break;
            case 87118:
                if (upperCase.equals("XPF")) {
                    c10 = 29;
                    break;
                }
                break;
        }
        String str = " %.0f";
        switch (c10) {
            case 0:
            case '\b':
            case 11:
            case 15:
            case 16:
            case 19:
            case 22:
                d = abs / 1000.0d;
                str = " %.3f";
                break;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\n':
            case '\f':
            case '\r':
            case 14:
            case 17:
            case 20:
            case 21:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                d = abs;
                break;
            case 3:
                d = abs / 10000.0d;
                str = " %.4f";
                break;
            case '\t':
                double d10 = ((float) abs) / 100.0f;
                if (abs % 100 != 0) {
                    str = " %.2f";
                }
                d = d10;
                break;
            case 18:
                d = abs / 10.0d;
                str = " %.1f";
                break;
            default:
                d = abs / 100.0d;
                str = " %.2f";
                break;
        }
        return String.format(Locale.US, str, Double.valueOf(d)).trim();
    }

    public final String x0(ArrayList arrayList) {
        long j10 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i10)).amount;
        }
        Long l4 = this.H0;
        if (l4 != null) {
            j10 += l4.longValue();
        }
        return org.telegram.messenger.cd.D0().p(j10, this.C0.invoice.currency);
    }

    public final void y0() {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13 = this.f41578u0;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 == 6) {
                                if (!this.T.c(this.f41581w0, this.f41583x0, this.U0, this.J0, this.f41585y0)) {
                                    sm0 sm0Var = new sm0(this.f41551b1, this.C0, this.N0, this.O0, 4, this.E0, this.G0, this.H0, this.f41581w0, this.f41583x0, this.I0, this.U0, this.J0, this.f41574r0, false);
                                    sm0Var.f41554c1 = this.f41554c1;
                                    sm0Var.f41556d1 = this.f41556d1;
                                    presentFragment(sm0Var, true);
                                    return;
                                }
                                finishFragment();
                                return;
                            }
                            return;
                        }
                        boolean z11 = this.V0;
                        int i14 = org.telegram.messenger.zs.f19580a1;
                        if (z11) {
                            org.telegram.messenger.zs.f(this.currentAccount).n(this, i14);
                        }
                        org.telegram.messenger.zs.f(this.currentAccount).k(i14, new Object[0]);
                        if (getMessagesController().f18846m7 == null) {
                            if (!C0(getParentLayout(), getParentActivity()) && !isFinishing()) {
                                finishFragment();
                                return;
                            }
                            return;
                        }
                        org.telegram.messenger.i0.h3(new rl0(this, 1), 500L);
                        return;
                    }
                    if (this.f41579v0) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    sm0 sm0Var2 = new sm0(this.f41551b1, this.C0, this.N0, this.O0, i12, this.E0, this.G0, this.H0, this.f41581w0, this.f41583x0, this.I0, this.U0, this.J0, this.f41574r0, this.W0);
                    sm0Var2.f41554c1 = this.f41554c1;
                    sm0Var2.f41556d1 = this.f41556d1;
                    presentFragment(sm0Var2, true);
                    return;
                }
                TLRPC.PaymentForm paymentForm = this.C0;
                if (paymentForm.password_missing && (z10 = this.U0)) {
                    sm0 sm0Var3 = new sm0(this.f41551b1, paymentForm, this.N0, this.O0, 6, this.E0, this.G0, this.H0, this.f41581w0, this.f41583x0, this.I0, z10, this.J0, this.f41574r0, this.W0);
                    this.f41560f0 = sm0Var3;
                    sm0Var3.f41554c1 = this.f41554c1;
                    sm0Var3.f41556d1 = this.f41556d1;
                    sm0Var3.H0(this.f41547a0);
                    sm0 sm0Var4 = this.f41560f0;
                    sm0Var4.T = new jm0(this);
                    presentFragment(sm0Var4, this.S0);
                    return;
                }
                qm0 qm0Var = this.T;
                if (qm0Var != null) {
                    qm0Var.c(this.f41581w0, this.f41583x0, this.U0, this.J0, null);
                    finishFragment();
                    return;
                }
                sm0 sm0Var5 = new sm0(this.f41551b1, paymentForm, this.N0, this.O0, 4, this.E0, this.G0, this.H0, this.f41581w0, this.f41583x0, this.I0, this.U0, this.J0, this.f41574r0, this.W0);
                sm0Var5.f41554c1 = this.f41554c1;
                sm0Var5.f41556d1 = this.f41556d1;
                presentFragment(sm0Var5, this.S0);
                return;
            }
            if (this.f41581w0 == null && this.f41583x0 == null) {
                if (this.f41585y0 != null) {
                    if (org.telegram.messenger.d20.i(this.currentAccount).f15175y != null && org.telegram.messenger.d20.i(this.currentAccount).f15175y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                        org.telegram.messenger.d20.i(this.currentAccount).f15175y = null;
                        org.telegram.messenger.d20.i(this.currentAccount).v(false);
                    }
                    if (org.telegram.messenger.d20.i(this.currentAccount).f15175y == null) {
                        i11 = 3;
                    }
                } else {
                    i11 = 2;
                }
                if (i11 != 2 && this.f41583x0 == null && this.f41585y0 == null && this.f41581w0 == null && !this.C0.additional_methods.isEmpty()) {
                    L0(new rl0(this, 0));
                    return;
                }
                sm0 sm0Var6 = new sm0(this.f41551b1, this.C0, this.N0, this.O0, i11, this.E0, this.G0, this.H0, this.f41581w0, this.f41583x0, this.I0, this.U0, this.J0, this.f41574r0, this.W0);
                sm0Var6.f41554c1 = this.f41554c1;
                sm0Var6.f41556d1 = this.f41556d1;
                presentFragment(sm0Var6, this.S0);
                return;
            }
            i11 = 4;
            if (i11 != 2) {
            }
            sm0 sm0Var62 = new sm0(this.f41551b1, this.C0, this.N0, this.O0, i11, this.E0, this.G0, this.H0, this.f41581w0, this.f41583x0, this.I0, this.U0, this.J0, this.f41574r0, this.W0);
            sm0Var62.f41554c1 = this.f41554c1;
            sm0Var62.f41556d1 = this.f41556d1;
            presentFragment(sm0Var62, this.S0);
            return;
        }
        qm0 qm0Var2 = this.T;
        if (qm0Var2 != null) {
            qm0Var2.d(this.I0);
            finishFragment();
            return;
        }
        if (this.C0.invoice.flexible) {
            i10 = 1;
        } else if (this.f41585y0 == null && this.f41581w0 == null) {
            i10 = 2;
        } else {
            if (org.telegram.messenger.d20.i(this.currentAccount).f15175y != null && org.telegram.messenger.d20.i(this.currentAccount).f15175y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                org.telegram.messenger.d20.i(this.currentAccount).f15175y = null;
                org.telegram.messenger.d20.i(this.currentAccount).v(false);
            }
            if (org.telegram.messenger.d20.i(this.currentAccount).f15175y != null) {
                i10 = 4;
            } else {
                i10 = 3;
            }
        }
        if (i10 == 2 && this.f41585y0 == null && this.f41581w0 == null && !this.C0.additional_methods.isEmpty()) {
            L0(new rl0(this, 0));
            return;
        }
        sm0 sm0Var7 = new sm0(this.f41551b1, this.C0, this.N0, this.O0, i10, this.E0, null, null, this.f41581w0, this.f41583x0, this.I0, this.U0, this.J0, this.f41574r0, this.W0);
        sm0Var7.f41554c1 = this.f41554c1;
        sm0Var7.f41556d1 = this.f41556d1;
        presentFragment(sm0Var7, this.S0);
    }

    public final void z0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, org.telegram.messenger.jj jjVar, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l4, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.k2 k2Var, boolean z11) {
        if (k2Var != null) {
            this.currentAccount = k2Var.getCurrentAccount();
        }
        this.f41578u0 = i10;
        this.f41574r0 = k2Var;
        this.f41581w0 = str2;
        this.J0 = tL_inputPaymentCredentialsGooglePay;
        this.E0 = tL_payments_validatedRequestedInfo;
        this.C0 = paymentForm;
        this.G0 = tL_shippingOption;
        this.H0 = l4;
        this.N0 = jjVar;
        this.O0 = str;
        this.f41551b1 = inputInvoice;
        this.U0 = z10;
        this.W0 = z11;
        this.S0 = ("stripe".equals(paymentForm.native_provider) || "smartglocal".equals(this.C0.native_provider)) ? false : true;
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(paymentForm.bot_id));
        this.f41567l0 = Z1;
        if (Z1 != null) {
            this.f41571p0 = Z1.first_name;
        } else {
            this.f41571p0 = "";
        }
        this.f41572q0 = paymentForm.title;
        this.I0 = tL_payments_validateRequestedInfo;
        this.T0 = true;
        if (!z10 && this.f41578u0 != 4) {
            this.U0 = !this.C0.saved_credentials.isEmpty();
        } else {
            this.U0 = z10;
        }
        if (str3 == null) {
            if (this.C0.saved_credentials.isEmpty()) {
                return;
            }
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.C0.saved_credentials.get(0);
            this.f41585y0 = tL_paymentSavedCredentialsCard;
            this.f41583x0 = tL_paymentSavedCredentialsCard.title;
            return;
        }
        this.f41583x0 = str3;
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.k2 k2Var, boolean z10) {
        D0(k2Var);
        return super.presentFragment(k2Var, z10);
    }

    public sm0(TLRPC.PaymentForm paymentForm, org.telegram.messenger.jj jjVar, String str, org.telegram.ui.ActionBar.k2 k2Var) {
        super(null);
        this.f41546a = new ArrayList();
        this.f41549b = new HashMap();
        this.f41552c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.p4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.c7[3];
        this.M = new org.telegram.ui.Cells.b9[3];
        this.N = new org.telegram.ui.Cells.x9[2];
        this.Y = new org.telegram.ui.Cells.a9[7];
        this.Z = -4.5f;
        this.f41553c0 = 6;
        this.V0 = true;
        z0(null, paymentForm, jjVar, str, 4, null, null, null, null, null, null, false, null, k2Var, false);
    }

    public sm0(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        this.f41546a = new ArrayList();
        this.f41549b = new HashMap();
        this.f41552c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.p4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.c7[3];
        this.M = new org.telegram.ui.Cells.b9[3];
        this.N = new org.telegram.ui.Cells.x9[2];
        this.Y = new org.telegram.ui.Cells.a9[7];
        this.Z = -4.5f;
        this.f41553c0 = 6;
        this.f41578u0 = 5;
        TLRPC.PaymentForm paymentForm = new TLRPC.PaymentForm();
        this.C0 = paymentForm;
        this.D0 = paymentReceipt;
        paymentForm.bot_id = paymentReceipt.bot_id;
        paymentForm.invoice = paymentReceipt.invoice;
        paymentForm.provider_id = paymentReceipt.provider_id;
        paymentForm.users = paymentReceipt.users;
        this.G0 = paymentReceipt.shipping;
        long j10 = paymentReceipt.tip_amount;
        if (j10 != 0) {
            this.H0 = Long.valueOf(j10);
        }
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(paymentReceipt.bot_id));
        this.f41567l0 = Z1;
        if (Z1 != null) {
            this.f41571p0 = Z1.first_name;
        } else {
            this.f41571p0 = "";
        }
        this.f41572q0 = paymentReceipt.title;
        if (paymentReceipt.info != null) {
            this.I0 = new TLRPC.TL_payments_validateRequestedInfo();
            if (this.N0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = getMessagesController().i1(paymentReceipt.bot_id);
                this.I0.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = this.O0;
                this.I0.invoice = tL_inputInvoiceSlug;
            }
            this.I0.info = paymentReceipt.info;
        }
        this.f41583x0 = paymentReceipt.credentials_title;
    }

    public sm0(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.k2 k2Var) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, k2Var, false);
        this.V0 = true;
    }
}
