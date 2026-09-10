package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
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
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wo0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public static final List f38252g1 = Arrays.asList("http", "https");
    public static final List f38253h1 = Collections.singletonList("tg");
    public wt A0;
    public String B0;
    public TLRPC.PaymentForm C0;
    public final TLRPC.PaymentReceipt D0;
    public ScrollView E;
    public TLRPC.TL_payments_validatedRequestedInfo E0;
    public boolean F;
    public TLRPC.TL_paymentFormMethod F0;
    public boolean G;
    public TLRPC.TL_shippingOption G0;
    public TextView H;
    public Long H0;
    public final org.telegram.ui.Cells.m4[] I;
    public TLRPC.TL_payments_validateRequestedInfo I0;
    public final ArrayList J;
    public TLRPC.TL_inputPaymentCredentialsGooglePay J0;
    public final org.telegram.ui.Cells.c7[] K;
    public String K0;
    public org.telegram.ui.Cells.x8 L;
    public String L0;
    public final org.telegram.ui.Cells.f9[] M;
    public JSONObject M0;
    public final org.telegram.ui.Cells.ga[] N;
    public MessageObject N0;
    public FrameLayout O;
    public String O0;
    public FrameLayout P;
    public boolean P0;
    public LinearLayout Q;
    public boolean Q0;
    public org.telegram.ui.Cells.g9 R;
    public String[] R0;
    public org.telegram.ui.Cells.j3 S;
    public boolean S0;
    public uo0 T;
    public boolean T0;
    public TextView U;
    public boolean U0;
    public org.telegram.ui.Cells.q6 V;
    public boolean V0;
    public so0 W;
    public boolean W0;
    public org.telegram.ui.Cells.l5 X;
    public boolean X0;
    public final org.telegram.ui.Cells.e9[] Y;
    public org.telegram.ui.ActionBar.f6 Y0;
    public float Z;
    public vo0 Z0;
    public final ArrayList f38254a;
    public TL_account.Password f38255a0;
    public boolean f38256a1;
    public final HashMap f38257b;
    public boolean f38258b0;
    public TLRPC.InputInvoice f38259b1;
    public final HashMap f38260c;
    public int f38261c0;
    public Utilities.Callback f38262c1;
    public final HashMap d;
    public tn0 f38263d0;
    public Utilities.Callback f38264d1;
    public com.google.android.gms.internal.clearcut.v0 e;
    public boolean f38265e0;
    public n20 f38266e1;
    public EditTextBoldCursor[] f38267f;
    public wo0 f38268f0;
    public int f38269f1;
    public boolean f38270g0;
    public org.telegram.ui.Cells.l6[] h;
    public boolean f38271h0;
    public boolean f38272i0;
    public String f38273j0;
    public boolean f38274k0;
    public TLRPC.User f38275l0;
    public boolean m0;
    public org.telegram.ui.ActionBar.w0 f38276n;
    public boolean f38277n0;
    public boolean f38278o0;
    public String f38279p0;
    public String f38280q0;
    public org.telegram.ui.Components.zq f38281r;
    public org.telegram.ui.ActionBar.p2 f38282r0;
    public org.telegram.ui.Components.zq f38283s;
    public zn0 f38284s0;
    public ArrayList f38285t0;
    public int f38286u0;
    public AnimatorSet v;
    public boolean f38287v0;
    public WebView f38288w;
    public String f38289w0;
    public String f38290x;
    public String f38291x0;
    public boolean f38292y;
    public TLRPC.TL_paymentSavedCredentialsCard f38293y0;
    public boolean f38294z0;

    public wo0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l4, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.p2 p2Var, boolean z11) {
        super(null);
        this.f38254a = new ArrayList();
        this.f38257b = new HashMap();
        this.f38260c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.m4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.c7[3];
        this.M = new org.telegram.ui.Cells.f9[3];
        this.N = new org.telegram.ui.Cells.ga[2];
        this.Y = new org.telegram.ui.Cells.e9[7];
        this.Z = -4.5f;
        this.f38261c0 = 6;
        u0(inputInvoice, paymentForm, messageObject, str, i10, tL_payments_validatedRequestedInfo, tL_shippingOption, l4, str2, str3, tL_payments_validateRequestedInfo, z10, tL_inputPaymentCredentialsGooglePay, p2Var, z11);
    }

    public static void U(wo0 wo0Var, TL_account.Password password, byte[] bArr) {
        byte[] bArr2;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        rg0 rg0Var = new rg0(6, wo0Var, gettmppassword);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            gettmppassword.password = startCheck;
            if (startCheck == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                rg0Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(wo0Var.currentAccount).sendRequest(gettmppassword, rg0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        rg0Var.run(null, tL_error2);
    }

    public static void V(wo0 wo0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        wo0Var.D0(false);
        wo0Var.H0(true, false);
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
                    wo0Var.E0(2);
                    return;
                case 1:
                    wo0Var.E0(0);
                    return;
                case 2:
                    wo0Var.E0(4);
                    return;
                case 3:
                    wo0Var.E0(6);
                    return;
                case 4:
                    wo0Var.E0(5);
                    return;
                case 5:
                    wo0Var.E0(3);
                    return;
                case 6:
                    wo0Var.E0(9);
                    return;
                case 7:
                    wo0Var.E0(1);
                    return;
                case '\b':
                    wo0Var.E0(7);
                    return;
                default:
                    org.telegram.ui.Components.d5.f0(wo0Var.currentAccount, tL_error, wo0Var, tLObject, new Object[0]);
                    return;
            }
        }
    }

    public static void W(wo0 wo0Var, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        int i10;
        wo0Var.E0 = tL_payments_validatedRequestedInfo;
        if (wo0Var.C0.saved_info != null && !wo0Var.T0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(wo0Var.currentAccount);
            bi.g1 g1Var = new bi.g1(16);
            if (wo0Var.W0) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            connectionsManager.sendRequest(tL_payments_clearSavedInfo, g1Var, i10);
        }
        wo0Var.t0();
        wo0Var.D0(false);
        wo0Var.H0(true, false);
    }

    public static void X(wo0 wo0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        wo0Var.D0(false);
        wo0Var.H0(true, false);
        if (tL_error != null) {
            org.telegram.ui.Components.d5.f0(wo0Var.currentAccount, tL_error, wo0Var, tLObject, new Object[0]);
        }
    }

    public static void Y(wo0 wo0Var, org.telegram.ui.Components.pc pcVar, boolean z10, TLRPC.Message message) {
        pcVar.b();
        if (z10) {
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(eo.Q9(message.f17216id, MessageObject.getDialogId(message)));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = message.f17216id;
        tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(wo0Var.currentAccount).getInputPeer(message.peer_id);
        ConnectionsManager.getInstance(wo0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new wn0(wo0Var, 3), 2);
    }

    public static void Z(wo0 wo0Var) {
        int i10;
        TL_account.resendPasswordEmail resendpasswordemail = new TL_account.resendPasswordEmail();
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(wo0Var.currentAccount);
        bi.g1 g1Var = new bi.g1(16);
        if (wo0Var.W0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        connectionsManager.sendRequest(resendpasswordemail, g1Var, i10);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wo0Var.getParentActivity());
        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        wo0Var.showDialog(alertDialog$Builder.f17528a);
    }

    public static void a0(wo0 wo0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        bi.f2 f2Var = new bi.f2(wo0Var, z10, str, 7);
        if (!z10) {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str2);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = wo0Var.f38255a0.new_algo;
            if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                updatepasswordsettings.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                if (updatepasswordsettings.new_settings.new_password_hash == null) {
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    tL_error.text = "ALGO_INVALID";
                    f2Var.run(null, tL_error);
                }
                ConnectionsManager.getInstance(wo0Var.currentAccount).sendRequest(updatepasswordsettings, f2Var, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            f2Var.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(wo0Var.currentAccount).sendRequest(updatepasswordsettings, f2Var, 10);
    }

    public static void b0(wo0 wo0Var, TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        org.telegram.ui.Components.d5.f0(wo0Var.currentAccount, tL_error, wo0Var, tL_payments_sendPaymentForm, new Object[0]);
        wo0Var.D0(false);
        wo0Var.H0(false, false);
        wo0Var.f38256a1 = true;
        wo0Var.f38269f1 = 4;
        vo0 vo0Var = wo0Var.Z0;
        if (vo0Var != null) {
            vo0Var.a(4);
        }
    }

    public static void c0(wo0 wo0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.p2 R;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            xh.z7.j1(wo0Var.getParentActivity(), wo0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, wo0Var.Y0);
        } else if ((tLObject instanceof TLRPC.PaymentReceipt) && (R = LaunchActivity.R()) != 0) {
            ?? obj = new Object();
            obj.f18485a = true;
            wo0 wo0Var2 = new wo0((TLRPC.PaymentReceipt) tLObject);
            wo0Var2.f38262c1 = wo0Var.f38262c1;
            wo0Var2.f38264d1 = wo0Var.f38264d1;
            R.showAsSheet(wo0Var2, obj);
        }
    }

    public static void d0(wo0 wo0Var, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        wo0Var.H0(true, false);
        wo0Var.D0(false);
        if (tLObject != null) {
            wo0Var.f38287v0 = true;
            UserConfig.getInstance(wo0Var.currentAccount).tmpPassword = (TL_account.tmpPassword) tLObject;
            UserConfig.getInstance(wo0Var.currentAccount).saveConfig(false);
            wo0Var.t0();
        } else if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            try {
                wo0Var.f38267f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeViewSpring(wo0Var.f38267f[1], 3.25f);
            wo0Var.f38267f[1].setText("");
        } else {
            org.telegram.ui.Components.d5.f0(wo0Var.currentAccount, tL_error, wo0Var, gettmppassword, new Object[0]);
        }
    }

    public static void e0(wo0 wo0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.p2 R;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            xh.z7.j1(wo0Var.getParentActivity(), wo0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, wo0Var.Y0);
        } else if ((tLObject instanceof TLRPC.PaymentReceipt) && (R = LaunchActivity.R()) != 0) {
            ?? obj = new Object();
            obj.f18485a = true;
            wo0 wo0Var2 = new wo0((TLRPC.PaymentReceipt) tLObject);
            wo0Var2.f38262c1 = wo0Var.f38262c1;
            wo0Var2.f38264d1 = wo0Var.f38264d1;
            R.showAsSheet(wo0Var2, obj);
        }
    }

    public static void f0(wo0 wo0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.i0(password, false)) {
                org.telegram.ui.Components.d5.x0(wo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            } else if (!password.has_password) {
                wo0Var.f38287v0 = false;
                wo0Var.t0();
                return;
            } else {
                Utilities.globalQueue.postRunnable(new pf0(wo0Var, password, AndroidUtilities.getStringBytes(str), 14));
                return;
            }
        }
        org.telegram.ui.Components.d5.f0(wo0Var.currentAccount, tL_error, wo0Var, getpassword, new Object[0]);
        wo0Var.H0(true, false);
        wo0Var.D0(false);
    }

    public static void g0(wo0 wo0Var, org.telegram.ui.Components.pc pcVar, boolean z10, TLRPC.Message[] messageArr) {
        pcVar.b();
        if (z10) {
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(eo.Q9(messageArr[0].f17216id, MessageObject.getDialogId(messageArr[0])));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = messageArr[0].f17216id;
        tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(wo0Var.currentAccount).getInputPeer(messageArr[0].peer_id);
        ConnectionsManager.getInstance(wo0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new wn0(wo0Var, 2), 2);
    }

    public static void h0(org.telegram.ui.wo0 r23, java.lang.String r24, android.view.View r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wo0.h0(org.telegram.ui.wo0, java.lang.String, android.view.View):void");
    }

    public static void i0(wo0 wo0Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, String str) {
        String formatPluralString;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(wo0Var.currentAccount).sendRequest(new TL_account.getPassword(), new bi.m4(10, wo0Var, z10), 8);
            return;
        }
        wo0Var.H0(true, false);
        if (z10) {
            TL_account.Password password = wo0Var.f38255a0;
            password.has_password = false;
            password.current_algo = null;
            wo0Var.T.a(password);
            wo0Var.finishFragment();
        } else if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (wo0Var.getParentActivity() != null) {
                wo0Var.t0();
            }
        } else if (tL_error != null) {
            if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if (tL_error.text.equals("EMAIL_INVALID")) {
                    wo0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    wo0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    wo0Var.F0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            }
            wo0Var.f38261c0 = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wo0Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new l80(20, wo0Var, str));
            String string = LocaleController.getString(R.string.YourEmailAlmostThereText);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            d2Var.T = string;
            d2Var.R = LocaleController.getString(R.string.YourEmailAlmostThere);
            Dialog showDialog = wo0Var.showDialog(d2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
            }
        }
    }

    public static void j0(org.telegram.ui.wo0 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wo0.j0(org.telegram.ui.wo0):void");
    }

    public static void k0(wo0 wo0Var) {
        int i10 = 0;
        if (UserConfig.getInstance(wo0Var.currentAccount).tmpPassword != null && UserConfig.getInstance(wo0Var.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(wo0Var.currentAccount).getCurrentTime() + 60) {
            UserConfig.getInstance(wo0Var.currentAccount).tmpPassword = null;
            UserConfig.getInstance(wo0Var.currentAccount).saveConfig(false);
        }
        if (UserConfig.getInstance(wo0Var.currentAccount).tmpPassword != null) {
            wo0Var.z0();
        } else if (wo0Var.f38267f[1].length() == 0) {
            try {
                wo0Var.f38267f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeViewSpring(wo0Var.f38267f[1], 2.5f);
        } else {
            String obj = wo0Var.f38267f[1].getText().toString();
            wo0Var.H0(true, true);
            wo0Var.D0(true);
            TL_account.getPassword getpassword = new TL_account.getPassword();
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(wo0Var.currentAccount);
            aa aaVar = new aa(wo0Var, obj, getpassword, 28);
            if (wo0Var.W0) {
                i10 = 8;
            }
            connectionsManager.sendRequest(getpassword, aaVar, i10 | 2);
        }
    }

    public static void m0(wo0 wo0Var) {
        if (wo0Var.Q0) {
            return;
        }
        wo0Var.H0(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        wo0Var.I0 = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = wo0Var.f38259b1;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (wo0Var.N0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = wo0Var.getMessagesController().getInputPeer(wo0Var.N0.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = wo0Var.N0.getId();
            wo0Var.I0.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = wo0Var.O0;
            wo0Var.I0.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = wo0Var.I0;
        tL_payments_validateRequestedInfo2.save = wo0Var.T0;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (wo0Var.C0.invoice.name_requested) {
            wo0Var.I0.info.name = wo0Var.f38267f[6].getText().toString();
            wo0Var.I0.info.flags |= 1;
        }
        int i10 = 8;
        if (wo0Var.C0.invoice.phone_requested) {
            wo0Var.I0.info.phone = "+" + wo0Var.f38267f[8].getText().toString() + wo0Var.f38267f[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = wo0Var.I0.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (wo0Var.C0.invoice.email_requested) {
            wo0Var.I0.info.email = wo0Var.f38267f[7].getText().toString().trim();
            wo0Var.I0.info.flags |= 4;
        }
        if (wo0Var.C0.invoice.shipping_address_requested) {
            wo0Var.I0.info.shipping_address = new TLRPC.TL_postAddress();
            wo0Var.I0.info.shipping_address.street_line1 = wo0Var.f38267f[0].getText().toString();
            wo0Var.I0.info.shipping_address.street_line2 = wo0Var.f38267f[1].getText().toString();
            wo0Var.I0.info.shipping_address.city = wo0Var.f38267f[2].getText().toString();
            wo0Var.I0.info.shipping_address.state = wo0Var.f38267f[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = wo0Var.I0.info.shipping_address;
            String str = wo0Var.B0;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = wo0Var.f38267f[5].getText().toString();
            wo0Var.I0.info.flags |= 8;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo3 = wo0Var.I0;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(wo0Var.currentAccount);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo4 = wo0Var.I0;
        rg0 rg0Var = new rg0(4, wo0Var, tL_payments_validateRequestedInfo3);
        if (!wo0Var.W0) {
            i10 = 0;
        }
        connectionsManager.sendRequest(tL_payments_validateRequestedInfo4, rg0Var, i10 | 2);
    }

    public static JSONObject p0() {
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

    public final void A0(boolean z10) {
        String str;
        String str2;
        if (!z10 && this.S.getVisibility() == 0) {
            String text = this.S.getText();
            if (text.length() == 0) {
                org.telegram.ui.Cells.j3 j3Var = this.S;
                try {
                    j3Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AndroidUtilities.shakeViewSpring(j3Var, 2.5f);
                return;
            }
            H0(true, true);
            TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
            confirmpasswordemail.code = text;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new wn0(this, 0), 10);
            return;
        }
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        if (z10) {
            this.f38276n.setVisibility(0);
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings;
            passwordinputsettings.flags = 2;
            passwordinputsettings.email = "";
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            str = null;
            str2 = null;
        } else {
            String obj = this.f38267f[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                E0(0);
                return;
            } else if (!obj.equals(this.f38267f[1].getText().toString())) {
                try {
                    Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordDoNotMatch), 0).show();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                E0(1);
                return;
            } else {
                String obj2 = this.f38267f[2].getText().toString();
                if (obj2.length() < 3) {
                    E0(2);
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
                    passwordinputsettings2.new_algo = this.f38255a0.new_algo;
                    passwordinputsettings2.flags = 3 | i10;
                    passwordinputsettings2.email = obj2.trim();
                    str = obj2;
                    str2 = obj;
                } else {
                    E0(2);
                    return;
                }
            }
        }
        H0(true, true);
        Utilities.globalQueue.postRunnable(new bi.e2(this, z10, str, str2, updatepasswordsettings));
    }

    public final void B0(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        boolean z11 = true;
        org.telegram.ui.Cells.e9[] e9VarArr = this.Y;
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
            a4.a.z(sb2, ", ", str4, ", ", str5);
            String s10 = a4.a.s(sb2, ", ", str6);
            e9VarArr[2].b(R.drawable.msg_payment_address, s10, LocaleController.getString(R.string.PaymentShippingAddress), true);
        }
        org.telegram.ui.Cells.e9 e9Var = e9VarArr[2];
        int i13 = 8;
        if (tL_paymentRequestedInfo.shipping_address != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        e9Var.setVisibility(i10);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            e9VarArr[3].b(R.drawable.msg_contacts, str7, LocaleController.getString(R.string.PaymentCheckoutName), true);
        }
        org.telegram.ui.Cells.e9 e9Var2 = e9VarArr[3];
        if (tL_paymentRequestedInfo.name != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        e9Var2.setVisibility(i11);
        if (tL_paymentRequestedInfo.phone != null) {
            org.telegram.ui.Cells.e9 e9Var3 = e9VarArr[4];
            String b10 = gf.b.c().b(tL_paymentRequestedInfo.phone);
            String string = LocaleController.getString(R.string.PaymentCheckoutPhoneNumber);
            int i14 = R.drawable.msg_calls;
            if (tL_paymentRequestedInfo.email == null && this.G0 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            e9Var3.b(i14, b10, string, z10);
        }
        org.telegram.ui.Cells.e9 e9Var4 = e9VarArr[4];
        if (tL_paymentRequestedInfo.phone != null) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        e9Var4.setVisibility(i12);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            org.telegram.ui.Cells.e9 e9Var5 = e9VarArr[5];
            String string2 = LocaleController.getString(R.string.PaymentCheckoutEmail);
            int i15 = R.drawable.msg_mention;
            if (this.G0 == null) {
                z11 = false;
            }
            e9Var5.b(i15, str8, string2, z11);
        }
        org.telegram.ui.Cells.e9 e9Var6 = e9VarArr[5];
        if (tL_paymentRequestedInfo.email != null) {
            i13 = 0;
        }
        e9Var6.setVisibility(i13);
    }

    public final void C0(TL_account.Password password) {
        boolean z10;
        if (password != null && password.has_password) {
            if (getParentActivity() == null) {
                return;
            }
            t0();
            return;
        }
        this.f38255a0 = password;
        if (password != null && !TextUtils.isEmpty(password.email_unconfirmed_pattern)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38258b0 = z10;
        J0();
    }

    public final void D0(boolean z10) {
        this.P0 = z10;
        this.G = !z10;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null && lVar.getBackButton() != null) {
            this.actionBar.getBackButton().setEnabled(!this.P0);
        }
        org.telegram.ui.Cells.e9 e9Var = this.Y[0];
        if (e9Var != null) {
            e9Var.setEnabled(!this.P0);
        }
    }

    public final void E0(int i10) {
        EditTextBoldCursor editTextBoldCursor = this.f38267f[i10];
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(editTextBoldCursor, 2.5f);
    }

    public final void F0(String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.R = str;
        d2Var.T = str2;
        showDialog(d2Var);
    }

    public final void G0(Runnable runnable) {
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.f6) null, false);
        h3Var.fixNavigationBar();
        h3Var.title = LocaleController.getString(R.string.PaymentCheckoutMethod);
        h3Var.bigTitle = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.f38293y0;
        if (tL_paymentSavedCredentialsCard != null) {
            arrayList.add(tL_paymentSavedCredentialsCard.title);
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
        } else {
            String str = this.f38291x0;
            if (str != null) {
                arrayList.add(str);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
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
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard4 = this.f38293y0;
            if (tL_paymentSavedCredentialsCard4 == null || !Objects.equals(tL_paymentSavedCredentialsCard3.f17324id, tL_paymentSavedCredentialsCard4.f17324id)) {
                arrayList.add(tL_paymentSavedCredentialsCard3.title);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
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
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_provider));
        }
        arrayList.add(LocaleController.getString(R.string.PaymentCheckoutMethodNewCard));
        arrayList2.add(Integer.valueOf(R.drawable.msg_addbot));
        int[] iArr = new int[arrayList2.size()];
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
        }
        org.telegram.ui.Components.a3 a3Var = new org.telegram.ui.Components.a3(this, runnable, arrayList3, arrayList, 1);
        h3Var.items = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        h3Var.itemIcons = iArr;
        h3Var.onClickListener = a3Var;
        showDialog(h3Var);
    }

    public final void H0(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.v;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10 && this.f38276n != null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.v = animatorSet2;
            if (z11) {
                this.f38281r.setVisibility(0);
                this.f38276n.setEnabled(false);
                AnimatorSet animatorSet3 = this.v;
                View contentView = this.f38276n.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(contentView, property, 0.1f);
                View contentView2 = this.f38276n.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(contentView2, property2, 0.1f);
                View contentView3 = this.f38276n.getContentView();
                Property property3 = View.ALPHA;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, property3, 0.0f), ObjectAnimator.ofFloat(this.f38281r, property, 1.0f), ObjectAnimator.ofFloat(this.f38281r, property2, 1.0f), ObjectAnimator.ofFloat(this.f38281r, property3, 1.0f));
            } else if (this.f38288w != null) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f38281r, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.f38281r, View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.f38281r, View.ALPHA, 0.0f));
            } else {
                this.f38276n.getContentView().setVisibility(0);
                this.f38276n.setEnabled(true);
                AnimatorSet animatorSet4 = this.v;
                org.telegram.ui.Components.zq zqVar = this.f38281r;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(zqVar, property4, 0.1f);
                org.telegram.ui.Components.zq zqVar2 = this.f38281r;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(zqVar2, property5, 0.1f);
                org.telegram.ui.Components.zq zqVar3 = this.f38281r;
                Property property6 = View.ALPHA;
                animatorSet4.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(zqVar3, property6, 0.0f));
                if (!isFinishing()) {
                    this.v.playTogether(ObjectAnimator.ofFloat(this.f38276n.getContentView(), property4, 1.0f), ObjectAnimator.ofFloat(this.f38276n.getContentView(), property5, 1.0f), ObjectAnimator.ofFloat(this.f38276n.getContentView(), property6, 1.0f));
                }
            }
            this.v.addListener(new no0(this, z11, 0));
            this.v.setDuration(150L);
            this.v.start();
        } else if (this.U != null) {
            this.v = new AnimatorSet();
            if (z11) {
                this.f38283s.setVisibility(0);
                this.W.setEnabled(false);
                AnimatorSet animatorSet5 = this.v;
                TextView textView = this.U;
                Property property7 = View.SCALE_X;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView, property7, 0.1f);
                TextView textView2 = this.U;
                Property property8 = View.SCALE_Y;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView2, property8, 0.1f);
                TextView textView3 = this.U;
                Property property9 = View.ALPHA;
                animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, property9, 0.0f), ObjectAnimator.ofFloat(this.f38283s, property7, 1.0f), ObjectAnimator.ofFloat(this.f38283s, property8, 1.0f), ObjectAnimator.ofFloat(this.f38283s, property9, 1.0f));
            } else {
                this.U.setVisibility(0);
                this.W.setEnabled(true);
                AnimatorSet animatorSet6 = this.v;
                org.telegram.ui.Components.zq zqVar4 = this.f38283s;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(zqVar4, property10, 0.1f);
                org.telegram.ui.Components.zq zqVar5 = this.f38283s;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(zqVar5, property11, 0.1f);
                org.telegram.ui.Components.zq zqVar6 = this.f38283s;
                Property property12 = View.ALPHA;
                animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(zqVar6, property12, 0.0f), ObjectAnimator.ofFloat(this.U, property10, 1.0f), ObjectAnimator.ofFloat(this.U, property11, 1.0f), ObjectAnimator.ofFloat(this.U, property12, 1.0f));
            }
            this.v.addListener(new no0(this, z11, 1));
            this.v.setDuration(150L);
            this.v.start();
        }
    }

    public final void I0(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.PaymentTransactionReview);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.R = string;
        d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("PaymentTransactionMessage2", R.string.PaymentTransactionMessage2, str, this.f38279p0, this.f38280q0));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new un0(this, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(d2Var);
    }

    public final void J0() {
        if (this.f38286u0 == 6) {
            org.telegram.ui.Cells.f9[] f9VarArr = this.M;
            if (f9VarArr[2] != null) {
                int i10 = 0;
                this.f38276n.setVisibility(0);
                TL_account.Password password = this.f38255a0;
                ArrayList arrayList = this.J;
                org.telegram.ui.Cells.m4[] m4VarArr = this.I;
                org.telegram.ui.Cells.ga[] gaVarArr = this.N;
                if (password == null) {
                    H0(true, true);
                    f9VarArr[2].setVisibility(8);
                    gaVarArr[0].setVisibility(8);
                    gaVarArr[1].setVisibility(8);
                    this.S.setVisibility(8);
                    m4VarArr[0].setVisibility(8);
                    m4VarArr[1].setVisibility(8);
                    f9VarArr[0].setVisibility(8);
                    for (int i11 = 0; i11 < 3; i11++) {
                        ((View) this.f38267f[i11].getParent()).setVisibility(8);
                    }
                    while (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setVisibility(8);
                        i10++;
                    }
                    return;
                }
                H0(true, false);
                if (this.f38258b0) {
                    org.telegram.ui.Cells.f9 f9Var = f9VarArr[2];
                    int i12 = R.string.EmailPasswordConfirmText2;
                    String str = this.f38255a0.email_unconfirmed_pattern;
                    if (str == null) {
                        str = "";
                    }
                    f9Var.setText(LocaleController.formatString("EmailPasswordConfirmText2", i12, str));
                    f9VarArr[2].setVisibility(0);
                    gaVarArr[0].setVisibility(0);
                    gaVarArr[1].setVisibility(0);
                    this.S.setVisibility(0);
                    f9VarArr[1].setText("");
                    m4VarArr[0].setVisibility(8);
                    m4VarArr[1].setVisibility(8);
                    f9VarArr[0].setVisibility(8);
                    for (int i13 = 0; i13 < 3; i13++) {
                        ((View) this.f38267f[i13].getParent()).setVisibility(8);
                    }
                    while (i10 < arrayList.size()) {
                        ((View) arrayList.get(i10)).setVisibility(8);
                        i10++;
                    }
                    return;
                }
                f9VarArr[2].setVisibility(8);
                gaVarArr[0].setVisibility(8);
                gaVarArr[1].setVisibility(8);
                f9VarArr[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                this.S.setVisibility(8);
                m4VarArr[0].setVisibility(0);
                m4VarArr[1].setVisibility(0);
                f9VarArr[0].setVisibility(0);
                for (int i14 = 0; i14 < 3; i14++) {
                    ((View) this.f38267f[i14].getParent()).setVisibility(0);
                }
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((View) arrayList.get(i15)).setVisibility(0);
                }
            }
        }
    }

    public final void K0() {
        org.telegram.ui.Cells.f9[] f9VarArr = this.M;
        if (f9VarArr[0] != null) {
            org.telegram.ui.Cells.c7[] c7VarArr = this.K;
            if (c7VarArr[2] != null) {
                TLRPC.PaymentForm paymentForm = this.C0;
                if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.f38288w != null && this.f38294z0)) {
                    this.L.setVisibility(8);
                    f9VarArr[0].setVisibility(8);
                    org.telegram.ui.Cells.c7 c7Var = c7VarArr[2];
                    c7Var.setBackground(org.telegram.ui.ActionBar.j6.V0(c7Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f17892b7));
                    return;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine1));
                if (this.C0.password_missing) {
                    w0();
                    spannableStringBuilder.append((CharSequence) "\n");
                    int length = spannableStringBuilder.length();
                    String string = LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine2);
                    int indexOf = string.indexOf(42);
                    int lastIndexOf = string.lastIndexOf(42);
                    spannableStringBuilder.append((CharSequence) string);
                    if (indexOf != -1 && lastIndexOf != -1) {
                        int i10 = indexOf + length;
                        int i11 = lastIndexOf + length;
                        f9VarArr[0].getTextView().setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(i11, i11 + 1, (CharSequence) "");
                        spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new to0(this), i10, i11 - 1, 33);
                    }
                }
                this.L.setEnabled(true);
                f9VarArr[0].setText(spannableStringBuilder);
                this.L.setVisibility(0);
                f9VarArr[0].setVisibility(0);
                org.telegram.ui.Cells.c7 c7Var2 = c7VarArr[2];
                c7Var2.setBackground(org.telegram.ui.ActionBar.j6.V0(c7Var2.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f17892b7));
            }
        }
    }

    public final void L0() {
        this.R0[0] = s0(this.f38285t0);
        this.R.a(LocaleController.getString(R.string.PaymentTransactionTotal), this.R0[0], true);
        TextView textView = this.U;
        if (textView != null) {
            textView.setText(LocaleController.formatString("PaymentCheckoutPay", R.string.PaymentCheckoutPay, this.R0[0]));
        }
        if (this.f38284s0 != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f17956ei);
            int childCount = this.f38284s0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                TextView textView2 = (TextView) this.f38284s0.getChildAt(i10);
                if (textView2.getTag().equals(this.H0)) {
                    org.telegram.ui.ActionBar.j6.w1(themedColor, textView2.getBackground());
                    textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f17974fi));
                } else {
                    org.telegram.ui.ActionBar.j6.w1(536870911 & themedColor, textView2.getBackground());
                    textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Z8));
                }
                textView2.invalidate();
            }
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wo0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.twoStepPasswordChanged) {
            TLRPC.PaymentForm paymentForm = this.C0;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            K0();
        } else if (i10 == NotificationCenter.didRemoveTwoStepPassword) {
            TLRPC.PaymentForm paymentForm2 = this.C0;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            K0();
        } else if (i10 == NotificationCenter.paymentFinished) {
            this.f38256a1 = true;
            removeSelfFromStack();
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.Y0;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f18201s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        org.telegram.ui.Components.zq zqVar = this.f38281r;
        int i11 = org.telegram.ui.ActionBar.j6.D7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(zqVar, 0, null, null, null, null, i11));
        org.telegram.ui.Components.zq zqVar2 = this.f38281r;
        int i12 = org.telegram.ui.ActionBar.j6.E7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(zqVar2, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38283s, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38283s, 0, null, null, null, null, i12));
        if (this.f38267f != null) {
            int i13 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f38267f;
                if (i13 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.l6((View) editTextBoldCursorArr[i13].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38267f[i13], 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38267f[i13], 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
                i13++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
        }
        if (this.h != null) {
            int i14 = 0;
            while (true) {
                org.telegram.ui.Cells.l6[] l6VarArr = this.h;
                if (i14 >= l6VarArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.l6(l6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.h[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.h[i14], 0, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.h[i14], 8192, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f17983g7));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.h[i14], 16384, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18000h7));
                i14++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 8192, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f17983g7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 16384, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18000h7));
        }
        int i15 = 0;
        while (true) {
            org.telegram.ui.Cells.m4[] m4VarArr = this.I;
            if (i15 >= m4VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(m4VarArr[i15], 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(m4VarArr[i15], 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
            i15++;
        }
        int i16 = 0;
        while (true) {
            org.telegram.ui.Cells.c7[] c7VarArr = this.K;
            if (i16 >= c7VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(c7VarArr[i16], 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17892b7));
            i16++;
        }
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.f9[] f9VarArr = this.M;
            if (i17 >= f9VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(f9VarArr[i17], 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17892b7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(f9VarArr[i17], 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(f9VarArr[i17], 2, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
            i17++;
        }
        int i18 = 0;
        while (true) {
            ArrayList arrayList2 = this.J;
            if (i18 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6((View) arrayList2.get(i18), 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
            i18++;
        }
        org.telegram.ui.Cells.j3 j3Var = this.S;
        int i19 = org.telegram.ui.ActionBar.j6.f17928d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(j3Var, 1, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 4, new Class[]{org.telegram.ui.Cells.j3.class}, new String[]{"textView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 8388608, new Class[]{org.telegram.ui.Cells.j3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 4, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 268435456, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 268435456, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        int i21 = 0;
        while (true) {
            org.telegram.ui.Cells.ga[] gaVarArr = this.N;
            if (i21 >= gaVarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(gaVarArr[i21], 268435456, null, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(gaVarArr[i21], 268435456, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(gaVarArr[i21], 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
            i21++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f18199s6));
        int i22 = org.telegram.ui.ActionBar.j6.f17928d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 16, new Class[]{org.telegram.ui.Cells.g9.class}, null, null, null, i22));
        int i23 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.g9.class}, new String[]{"textView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.g9.class}, new String[]{"valueTextView"}, null, null, -1, null, i23));
        int i24 = org.telegram.ui.ActionBar.j6.f18325z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.g9.class}, new String[]{"textView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 262144, new Class[]{org.telegram.ui.Cells.g9.class}, new String[]{"valueTextView"}, null, null, -1, null, i24));
        org.telegram.ui.Cells.e9[] e9VarArr = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.l6(e9VarArr[0], 268435456, null, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e9VarArr[0], 268435456, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        for (int i25 = 1; i25 < e9VarArr.length; i25++) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(e9VarArr[i25], 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(e9VarArr[i25], 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(e9VarArr[i25], 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18325z6));
        }
        org.telegram.ui.Cells.l5 l5Var = this.X;
        int i26 = org.telegram.ui.ActionBar.j6.f17928d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(l5Var, 1, null, null, null, null, i26));
        int i27 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.X, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"nameTextView"}, null, null, -1, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.X, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"detailTextView"}, null, null, -1, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.X, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"detailExTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18325z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.W, 268435456, null, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.W, 268435456, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.G;
    }

    public final void n0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
        this.O.setVisibility(8);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        frameLayout2.setClickable(true);
        this.P.setFocusable(true);
        this.P.setBackgroundResource(R.drawable.googlepay_button_no_shadow_background);
        if (this.K0 == null) {
            this.P.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f));
        } else {
            this.P.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        }
        this.O.addView(this.P, w7.a6.c(48.0f, -1));
        this.P.setOnClickListener(new qn0(this, 12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.P.addView(linearLayout, w7.a6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(R.drawable.buy_with_googlepay_button_content);
        linearLayout.addView(imageView, w7.a6.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(R.drawable.googlepay_button_overlay);
        this.P.addView(imageView2, w7.a6.c(-1.0f, -1));
    }

    public final void o0(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wo0.o0(java.lang.String):void");
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i10 == 991) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.my(this, i11, intent, 29));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        WebView webView = this.f38288w;
        if (webView != null && this.f38292y) {
            if (z10) {
                webView.loadUrl(this.f38290x);
                this.f38292y = false;
            }
            return false;
        }
        return !this.P0;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.f38286u0 == 4 && this.X0) {
            this.X0 = false;
            this.W.callOnClick();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        if (this.f38286u0 != 4 || this.V0) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.paymentFinished);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wo0.onFragmentDestroy():void");
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                int i10 = this.f38286u0;
                if ((i10 == 2 || i10 == 6) && !this.C0.invoice.test) {
                    getParentActivity().getWindow().setFlags(8192, 8192);
                    AndroidUtilities.logFlagSecure();
                } else if (SharedConfig.passcodeHash.length() == 0 || SharedConfig.allowScreenCapture) {
                    getParentActivity().getWindow().clearFlags(8192);
                    AndroidUtilities.logFlagSecure();
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11) {
            WebView webView = this.f38288w;
            if (webView != null) {
                if (this.f38286u0 != 4) {
                    TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.F0;
                    if (tL_paymentFormMethod != null) {
                        String str = tL_paymentFormMethod.url;
                        this.f38290x = str;
                        webView.loadUrl(str);
                        return;
                    }
                    String str2 = this.C0.url;
                    this.f38290x = str2;
                    webView.loadUrl(str2);
                    return;
                }
                return;
            }
            int i10 = this.f38286u0;
            if (i10 == 2) {
                AndroidUtilities.runOnUIThread(new tn0(this, 0), 100L);
            } else if (i10 == 3) {
                this.f38267f[1].requestFocus();
                AndroidUtilities.showKeyboard(this.f38267f[1]);
            } else if (i10 == 4) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f38267f;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                }
            } else if (i10 == 6 && !this.f38258b0) {
                this.f38267f[0].requestFocus();
                AndroidUtilities.showKeyboard(this.f38267f[0]);
            }
        }
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        y0(p2Var);
        return super.presentFragment(p2Var);
    }

    public final long q0() {
        TLRPC.InputInvoice inputInvoice = this.f38259b1;
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

    public final long r0() {
        TLRPC.InputPeer inputPeer;
        TLRPC.InputInvoice inputInvoice = this.f38259b1;
        if (inputInvoice instanceof TLRPC.TL_inputInvoiceStars) {
            TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = ((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose;
            if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) {
                TLRPC.InputUser inputUser = ((TLRPC.TL_inputStorePaymentStarsGift) inputStorePaymentPurpose).user_id;
                if (inputUser != null) {
                    return inputUser.user_id;
                }
                return 0L;
            } else if ((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) && (inputPeer = ((TLRPC.TL_inputStorePaymentStarsGiveaway) inputStorePaymentPurpose).boost_peer) != null) {
                return DialogObject.getPeerDialogId(inputPeer);
            } else {
                return 0L;
            }
        }
        return 0L;
    }

    public final String s0(ArrayList arrayList) {
        long j3 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            j3 += ((TLRPC.TL_labeledPrice) arrayList.get(i10)).amount;
        }
        Long l4 = this.H0;
        if (l4 != null) {
            j3 += l4.longValue();
        }
        return LocaleController.getInstance().formatCurrencyString(j3, this.C0.invoice.currency);
    }

    public final void t0() {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13 = this.f38286u0;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 == 6) {
                                if (!this.T.c(this.f38289w0, this.f38291x0, this.U0, this.J0, this.f38293y0)) {
                                    wo0 wo0Var = new wo0(this.f38259b1, this.C0, this.N0, this.O0, 4, this.E0, this.G0, this.H0, this.f38289w0, this.f38291x0, this.I0, this.U0, this.J0, this.f38282r0, false);
                                    wo0Var.f38262c1 = this.f38262c1;
                                    wo0Var.f38264d1 = this.f38264d1;
                                    presentFragment(wo0Var, true);
                                    return;
                                }
                                finishFragment();
                                return;
                            }
                            return;
                        }
                        if (this.V0) {
                            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.paymentFinished);
                        }
                        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.paymentFinished, new Object[0]);
                        if (getMessagesController().newMessageCallback == null) {
                            if (!x0(getParentLayout(), getParentActivity()) && !isFinishing()) {
                                finishFragment();
                                return;
                            }
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new tn0(this, 2), 500L);
                        return;
                    }
                    if (this.f38287v0) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    wo0 wo0Var2 = new wo0(this.f38259b1, this.C0, this.N0, this.O0, i12, this.E0, this.G0, this.H0, this.f38289w0, this.f38291x0, this.I0, this.U0, this.J0, this.f38282r0, this.W0);
                    wo0Var2.f38262c1 = this.f38262c1;
                    wo0Var2.f38264d1 = this.f38264d1;
                    presentFragment(wo0Var2, true);
                    return;
                }
                TLRPC.PaymentForm paymentForm = this.C0;
                if (paymentForm.password_missing && (z10 = this.U0)) {
                    wo0 wo0Var3 = new wo0(this.f38259b1, paymentForm, this.N0, this.O0, 6, this.E0, this.G0, this.H0, this.f38289w0, this.f38291x0, this.I0, z10, this.J0, this.f38282r0, this.W0);
                    this.f38268f0 = wo0Var3;
                    wo0Var3.f38262c1 = this.f38262c1;
                    wo0Var3.f38264d1 = this.f38264d1;
                    wo0Var3.C0(this.f38255a0);
                    wo0 wo0Var4 = this.f38268f0;
                    wo0Var4.T = new ko0(this);
                    presentFragment(wo0Var4, this.S0);
                    return;
                }
                uo0 uo0Var = this.T;
                if (uo0Var != null) {
                    uo0Var.c(this.f38289w0, this.f38291x0, this.U0, this.J0, null);
                    finishFragment();
                    return;
                }
                wo0 wo0Var5 = new wo0(this.f38259b1, paymentForm, this.N0, this.O0, 4, this.E0, this.G0, this.H0, this.f38289w0, this.f38291x0, this.I0, this.U0, this.J0, this.f38282r0, this.W0);
                wo0Var5.f38262c1 = this.f38262c1;
                wo0Var5.f38264d1 = this.f38264d1;
                presentFragment(wo0Var5, this.S0);
                return;
            }
            if (this.f38289w0 == null && this.f38291x0 == null) {
                if (this.f38293y0 != null) {
                    if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                        UserConfig.getInstance(this.currentAccount).tmpPassword = null;
                        UserConfig.getInstance(this.currentAccount).saveConfig(false);
                    }
                    if (UserConfig.getInstance(this.currentAccount).tmpPassword == null) {
                        i11 = 3;
                    }
                } else {
                    i11 = 2;
                }
                if (i11 != 2 && this.f38291x0 == null && this.f38293y0 == null && this.f38289w0 == null && !this.C0.additional_methods.isEmpty()) {
                    G0(new tn0(this, 1));
                    return;
                }
                wo0 wo0Var6 = new wo0(this.f38259b1, this.C0, this.N0, this.O0, i11, this.E0, this.G0, this.H0, this.f38289w0, this.f38291x0, this.I0, this.U0, this.J0, this.f38282r0, this.W0);
                wo0Var6.f38262c1 = this.f38262c1;
                wo0Var6.f38264d1 = this.f38264d1;
                presentFragment(wo0Var6, this.S0);
                return;
            }
            i11 = 4;
            if (i11 != 2) {
            }
            wo0 wo0Var62 = new wo0(this.f38259b1, this.C0, this.N0, this.O0, i11, this.E0, this.G0, this.H0, this.f38289w0, this.f38291x0, this.I0, this.U0, this.J0, this.f38282r0, this.W0);
            wo0Var62.f38262c1 = this.f38262c1;
            wo0Var62.f38264d1 = this.f38264d1;
            presentFragment(wo0Var62, this.S0);
            return;
        }
        uo0 uo0Var2 = this.T;
        if (uo0Var2 != null) {
            uo0Var2.d(this.I0);
            finishFragment();
            return;
        }
        if (this.C0.invoice.flexible) {
            i10 = 1;
        } else if (this.f38293y0 == null && this.f38289w0 == null) {
            i10 = 2;
        } else {
            if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                UserConfig.getInstance(this.currentAccount).tmpPassword = null;
                UserConfig.getInstance(this.currentAccount).saveConfig(false);
            }
            if (UserConfig.getInstance(this.currentAccount).tmpPassword != null) {
                i10 = 4;
            } else {
                i10 = 3;
            }
        }
        if (i10 == 2 && this.f38293y0 == null && this.f38289w0 == null && !this.C0.additional_methods.isEmpty()) {
            G0(new tn0(this, 1));
            return;
        }
        wo0 wo0Var7 = new wo0(this.f38259b1, this.C0, this.N0, this.O0, i10, this.E0, null, null, this.f38289w0, this.f38291x0, this.I0, this.U0, this.J0, this.f38282r0, this.W0);
        wo0Var7.f38262c1 = this.f38262c1;
        wo0Var7.f38264d1 = this.f38264d1;
        presentFragment(wo0Var7, this.S0);
    }

    public final void u0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l4, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.p2 p2Var, boolean z11) {
        if (p2Var != null) {
            this.currentAccount = p2Var.getCurrentAccount();
        }
        this.f38286u0 = i10;
        this.f38282r0 = p2Var;
        this.f38289w0 = str2;
        this.J0 = tL_inputPaymentCredentialsGooglePay;
        this.E0 = tL_payments_validatedRequestedInfo;
        this.C0 = paymentForm;
        this.G0 = tL_shippingOption;
        this.H0 = l4;
        this.N0 = messageObject;
        this.O0 = str;
        this.f38259b1 = inputInvoice;
        this.U0 = z10;
        this.W0 = z11;
        this.S0 = ("stripe".equals(paymentForm.native_provider) || "smartglocal".equals(this.C0.native_provider)) ? false : true;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(paymentForm.bot_id));
        this.f38275l0 = user;
        if (user != null) {
            this.f38279p0 = user.first_name;
        } else {
            this.f38279p0 = "";
        }
        this.f38280q0 = paymentForm.title;
        this.I0 = tL_payments_validateRequestedInfo;
        this.T0 = true;
        if (!z10 && this.f38286u0 != 4) {
            this.U0 = !this.C0.saved_credentials.isEmpty();
        } else {
            this.U0 = z10;
        }
        if (str3 == null) {
            if (this.C0.saved_credentials.isEmpty()) {
                return;
            }
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.C0.saved_credentials.get(0);
            this.f38293y0 = tL_paymentSavedCredentialsCard;
            this.f38291x0 = tL_paymentSavedCredentialsCard.title;
            return;
        }
        this.f38291x0 = str3;
    }

    public final void v0(Context context) {
        int i10;
        Optional empty;
        if (getParentActivity() != null) {
            com.google.android.gms.internal.cast.a aVar = new com.google.android.gms.internal.cast.a();
            if (this.C0.invoice.test) {
                i10 = 3;
            } else {
                i10 = 1;
            }
            if (i10 != 2 && i10 != 1 && i10 != 3) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(hc.b.j(i10, "Invalid environment value "));
            }
            aVar.f5019a = i10;
            this.e = new com.google.android.gms.common.api.j(context, v8.p.f43274a, new v8.o(aVar), com.google.android.gms.common.api.i.f4808c);
            try {
                JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                put.put("allowedPaymentMethods", new JSONArray().put(p0()));
                empty = Optional.of(put);
            } catch (JSONException unused) {
                empty = Optional.empty();
            }
            if (!empty.isPresent()) {
                return;
            }
            String jSONObject = ((JSONObject) empty.get()).toString();
            ?? obj = new Object();
            n6.l.i(jSONObject, "isReadyToPayRequestJson cannot be null!");
            obj.f43238f = jSONObject;
            com.google.android.gms.internal.clearcut.v0 v0Var = this.e;
            v0Var.getClass();
            com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
            e.f4955a = 23705;
            e.f4957c = new m.g3((Object) obj, 23);
            v0Var.e(0, e.a()).addOnCompleteListener(getParentActivity(), new un0(this, 0));
        }
    }

    public final void w0() {
        if (this.f38265e0) {
            return;
        }
        this.f38265e0 = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new wn0(this, 1), 10);
    }

    public final boolean x0(org.telegram.ui.ActionBar.f5 f5Var, Activity activity) {
        int i10 = 0;
        if (this.f38259b1 != null) {
            if (f5Var != null) {
                ArrayList arrayList = new ArrayList(f5Var.getFragmentStack());
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                    if (p2Var instanceof wo0) {
                        p2Var.removeSelfFromStack();
                    }
                }
                return true;
            }
            return false;
        }
        String str = this.f38275l0.username;
        if (((str != null && str.equalsIgnoreCase(getMessagesController().premiumBotUsername) && this.O0 == null) || (this.O0 != null && getMessagesController().premiumInvoiceSlug != null && Objects.equals(this.O0, getMessagesController().premiumInvoiceSlug))) && f5Var != null) {
            ArrayList arrayList2 = new ArrayList(f5Var.getFragmentStack());
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj2;
                if ((p2Var2 instanceof eo) || (p2Var2 instanceof PremiumPreviewFragment)) {
                    p2Var2.removeSelfFromStack();
                }
            }
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
            premiumPreviewFragment.f30286p0 = true;
            ((ActionBarLayout) f5Var).Q(premiumPreviewFragment, !isFinishing());
            if (activity instanceof LaunchActivity) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ((LaunchActivity) activity).f29971x0.c(false);
            }
            return true;
        }
        return false;
    }

    public final void y0(org.telegram.ui.ActionBar.p2 p2Var) {
        AndroidUtilities.hideKeyboard(this.fragmentView);
        if (p2Var instanceof wo0) {
            wo0 wo0Var = (wo0) p2Var;
            wo0Var.Z0 = this.Z0;
            wo0Var.Y0 = this.Y0;
            wo0Var.X0 = this.X0;
            wo0Var.f38293y0 = this.f38293y0;
        }
    }

    public final void z0() {
        long j3;
        String str;
        if (this.Q0) {
            return;
        }
        int i10 = 0;
        H0(false, true);
        TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = new TLRPC.TL_payments_sendPaymentForm();
        TLRPC.InputInvoice inputInvoice = this.f38259b1;
        if (inputInvoice != null) {
            tL_payments_sendPaymentForm.invoice = inputInvoice;
        } else if (this.N0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(this.N0.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = this.N0.getId();
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.O0;
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceSlug;
        }
        tL_payments_sendPaymentForm.form_id = this.C0.form_id;
        if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && this.f38293y0 != null) {
            TLRPC.TL_inputPaymentCredentialsSaved tL_inputPaymentCredentialsSaved = new TLRPC.TL_inputPaymentCredentialsSaved();
            tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsSaved;
            tL_inputPaymentCredentialsSaved.f17213id = this.f38293y0.f17324id;
            tL_inputPaymentCredentialsSaved.tmp_password = UserConfig.getInstance(this.currentAccount).tmpPassword.tmp_password;
        } else {
            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = this.J0;
            if (tL_inputPaymentCredentialsGooglePay != null) {
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsGooglePay;
            } else {
                TLRPC.TL_inputPaymentCredentials tL_inputPaymentCredentials = new TLRPC.TL_inputPaymentCredentials();
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentials;
                tL_inputPaymentCredentials.save = this.U0;
                tL_inputPaymentCredentials.data = new TLRPC.TL_dataJSON();
                tL_payments_sendPaymentForm.credentials.data.data = this.f38289w0;
            }
        }
        TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = this.E0;
        if (tL_payments_validatedRequestedInfo != null && (str = tL_payments_validatedRequestedInfo.f17325id) != null) {
            tL_payments_sendPaymentForm.requested_info_id = str;
            tL_payments_sendPaymentForm.flags = 1 | tL_payments_sendPaymentForm.flags;
        }
        TLRPC.TL_shippingOption tL_shippingOption = this.G0;
        if (tL_shippingOption != null) {
            tL_payments_sendPaymentForm.shipping_option_id = tL_shippingOption.f17331id;
            tL_payments_sendPaymentForm.flags |= 2;
        }
        if ((this.C0.invoice.flags & 256) != 0) {
            Long l4 = this.H0;
            if (l4 != null) {
                j3 = l4.longValue();
            } else {
                j3 = 0;
            }
            tL_payments_sendPaymentForm.tip_amount = j3;
            tL_payments_sendPaymentForm.flags |= 4;
        }
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.currentAccount);
        rg0 rg0Var = new rg0(5, this, tL_payments_sendPaymentForm);
        if (this.W0) {
            i10 = 8;
        }
        connectionsManager.sendRequest(tL_payments_sendPaymentForm, rg0Var, i10 | 2);
    }

    @Override
    public final boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var, boolean z10) {
        y0(p2Var);
        return super.presentFragment(p2Var, z10);
    }

    public wo0(TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, org.telegram.ui.ActionBar.p2 p2Var) {
        super(null);
        this.f38254a = new ArrayList();
        this.f38257b = new HashMap();
        this.f38260c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.m4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.c7[3];
        this.M = new org.telegram.ui.Cells.f9[3];
        this.N = new org.telegram.ui.Cells.ga[2];
        this.Y = new org.telegram.ui.Cells.e9[7];
        this.Z = -4.5f;
        this.f38261c0 = 6;
        this.V0 = true;
        u0(null, paymentForm, messageObject, str, 4, null, null, null, null, null, null, false, null, p2Var, false);
    }

    public wo0(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        this.f38254a = new ArrayList();
        this.f38257b = new HashMap();
        this.f38260c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.m4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.c7[3];
        this.M = new org.telegram.ui.Cells.f9[3];
        this.N = new org.telegram.ui.Cells.ga[2];
        this.Y = new org.telegram.ui.Cells.e9[7];
        this.Z = -4.5f;
        this.f38261c0 = 6;
        this.f38286u0 = 5;
        TLRPC.PaymentForm paymentForm = new TLRPC.PaymentForm();
        this.C0 = paymentForm;
        this.D0 = paymentReceipt;
        paymentForm.bot_id = paymentReceipt.bot_id;
        paymentForm.invoice = paymentReceipt.invoice;
        paymentForm.provider_id = paymentReceipt.provider_id;
        paymentForm.users = paymentReceipt.users;
        this.G0 = paymentReceipt.shipping;
        long j3 = paymentReceipt.tip_amount;
        if (j3 != 0) {
            this.H0 = Long.valueOf(j3);
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(paymentReceipt.bot_id));
        this.f38275l0 = user;
        if (user != null) {
            this.f38279p0 = user.first_name;
        } else {
            this.f38279p0 = "";
        }
        this.f38280q0 = paymentReceipt.title;
        if (paymentReceipt.info != null) {
            this.I0 = new TLRPC.TL_payments_validateRequestedInfo();
            if (this.N0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(paymentReceipt.bot_id);
                this.I0.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = this.O0;
                this.I0.invoice = tL_inputInvoiceSlug;
            }
            this.I0.info = paymentReceipt.info;
        }
        this.f38291x0 = paymentReceipt.credentials_title;
    }

    public wo0(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.p2 p2Var) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, p2Var, false);
        this.V0 = true;
    }
}
