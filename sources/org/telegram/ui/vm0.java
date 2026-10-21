package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Base64;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SecureDocumentKey;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vm0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout A0;
    public String A1;
    public ImageView B0;
    public mm0 B1;
    public TextView C0;
    public boolean C1;
    public TextView D0;
    public final vl0 D1;
    public final TLRPC.TL_secureRequiredType E;
    public TextView E0;
    public String E1;
    public TLRPC.TL_secureRequiredType F;
    public org.telegram.ui.Components.vz F0;
    public Runnable F1;
    public ArrayList G;
    public org.telegram.ui.Cells.d9 G0;
    public km0 G1;
    public final TLRPC.TL_secureValue H;
    public org.telegram.ui.Cells.d9 H0;
    public mm0 H1;
    public final TLRPC.TL_secureValue I;
    public ImageView I0;
    public int I1;
    public TL_account.Password J;
    public TextView J0;
    public final org.telegram.ui.Components.qw0[] J1;
    public TLRPC.TL_auth_sentCode K;
    public TextView K0;
    public org.telegram.ui.ActionBar.b2 K1;
    public org.telegram.ui.ActionBar.u0 L;
    public FrameLayout L0;
    public Dialog L1;
    public AnimatorSet M;
    public TextView M0;
    public final ArrayList M1;
    public org.telegram.ui.Components.dr N;
    public int N0;
    public TextView O;
    public final byte[] O0;
    public org.telegram.ui.Components.dr P;
    public final byte[] P0;
    public FrameLayout Q;
    public String Q0;
    public org.telegram.ui.Cells.ba R;
    public org.telegram.ui.Components.ti R0;
    public View S;
    public int S0;
    public View T;
    public int T0;
    public org.telegram.ui.Cells.c9 U;
    public final ArrayList U0;
    public org.telegram.ui.Cells.c9 V;
    public final HashMap V0;
    public org.telegram.ui.Cells.c9 W;
    public final HashMap W0;
    public org.telegram.ui.Cells.ba X;
    public final HashMap X0;
    public EditTextBoldCursor[] Y;
    public HashMap Y0;
    public ViewGroup[] Z;
    public boolean Z0;
    public String f42281a;
    public EditTextBoldCursor[] f42282a0;
    public boolean f42283a1;
    public final int f42284b;
    public ScrollView f42285b0;
    public long f42286b1;
    public long f42287c;
    public LinearLayout f42288c0;
    public byte[] f42289c1;
    public final String d;
    public LinearLayout f42290d0;
    public String f42291d1;
    public final String e;
    public LinearLayout f42292e0;
    public byte[] f42293e1;
    public boolean f42294f;
    public LinearLayout f42295f0;
    public boolean f42296f1;
    public LinearLayout f42297g0;
    public boolean f42298g1;
    public final String h;
    public LinearLayout f42299h0;
    public vm0 f42300h1;
    public LinearLayout f42301i0;
    public final ArrayList f42302i1;
    public org.telegram.ui.Cells.l4 f42303j0;
    public SecureDocument f42304j1;
    public final ArrayList f42305k0;
    public final ArrayList f42306k1;
    public org.telegram.ui.Cells.z6 f42307l0;
    public SecureDocument l1;
    public org.telegram.ui.Cells.z6 m0;
    public SecureDocument f42308m1;
    public final String f42309n;
    public org.telegram.ui.Cells.d9 f42310n0;
    public final HashMap f42311n1;
    public org.telegram.ui.Cells.d9 f42312o0;
    public final HashMap f42313o1;
    public org.telegram.ui.Cells.d9 f42314p0;
    public final HashMap f42315p1;
    public org.telegram.ui.Cells.d9 f42316q0;
    public final HashMap f42317q1;
    public final String f42318r;
    public org.telegram.ui.Cells.ba f42319r0;
    public final HashMap f42320r1;
    public String f42321s;
    public int f42322s0;
    public final HashMap f42323s1;
    public final boolean[] f42324t0;
    public final HashMap f42325t1;
    public boolean f42326u0;
    public final HashMap f42327u1;
    public String v;
    public boolean f42328v0;
    public final HashMap f42329v1;
    public String f42330w;
    public TextView f42331w0;
    public HashMap f42332w1;
    public final int[] f42333x;
    public org.telegram.ui.Cells.ba f42334x0;
    public HashMap f42335x1;
    public TL_account.authorizationForm f42336y;
    public org.telegram.ui.Cells.ba f42337y0;
    public final HashMap f42338y1;
    public org.telegram.ui.Cells.z6 f42339z0;
    public String f42340z1;

    public vm0(int i10, TL_account.authorizationForm authorizationform, TL_account.Password password, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureValue tL_secureValue, TLRPC.TL_secureRequiredType tL_secureRequiredType2, TLRPC.TL_secureValue tL_secureValue2, HashMap hashMap, HashMap hashMap2) {
        super(null);
        this.f42321s = "";
        this.v = "";
        this.f42333x = new int[3];
        this.f42305k0 = new ArrayList();
        this.f42324t0 = new boolean[3];
        this.f42326u0 = true;
        this.U0 = new ArrayList();
        this.V0 = new HashMap();
        this.W0 = new HashMap();
        this.X0 = new HashMap();
        this.f42302i1 = new ArrayList();
        this.f42306k1 = new ArrayList();
        this.f42311n1 = new HashMap();
        this.f42313o1 = new HashMap();
        this.f42315p1 = new HashMap();
        this.f42317q1 = new HashMap();
        this.f42320r1 = new HashMap();
        this.f42327u1 = new HashMap();
        this.f42329v1 = new HashMap();
        this.f42338y1 = new HashMap();
        this.D1 = new vl0(this);
        this.f42284b = i10;
        this.f42336y = authorizationform;
        this.E = tL_secureRequiredType;
        if (tL_secureRequiredType != null) {
            this.f42326u0 = tL_secureRequiredType.native_names;
        }
        this.H = tL_secureValue;
        this.F = tL_secureRequiredType2;
        this.I = tL_secureValue2;
        this.J = password;
        this.f42323s1 = hashMap;
        this.f42325t1 = hashMap2;
        if (i10 == 3) {
            this.M1 = new ArrayList();
        } else if (i10 == 7) {
            this.J1 = new org.telegram.ui.Components.qw0[3];
        }
        if (hashMap == null) {
            this.f42323s1 = new HashMap();
        }
        if (hashMap2 == null) {
            this.f42325t1 = new HashMap();
        }
        if (i10 == 5) {
            if (UserConfig.getInstance(this.currentAccount).savedPasswordHash != null && UserConfig.getInstance(this.currentAccount).savedSaltedPassword != null) {
                this.N0 = 1;
                this.O0 = UserConfig.getInstance(this.currentAccount).savedPasswordHash;
                this.P0 = UserConfig.getInstance(this.currentAccount).savedSaltedPassword;
            }
            TL_account.Password password2 = this.J;
            if (password2 == null) {
                v1();
            } else {
                TwoStepVerificationActivity.m0(password2);
                if (this.N0 == 1) {
                    A1(true);
                }
            }
            if (SharedConfig.isPassportConfigLoaded()) {
                return;
            }
            TLRPC.TL_help_getPassportConfig tL_help_getPassportConfig = new TLRPC.TL_help_getPassportConfig();
            tL_help_getPassportConfig.hash = SharedConfig.passportConfigHash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getPassportConfig, new ci.e6(18));
        }
    }

    public static int B0(vm0 vm0Var, String str) {
        vm0Var.getClass();
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2006252145:
                if (str.equals("residence_country_code")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1537298398:
                if (str.equals("last_name_native")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1249512767:
                if (str.equals("gender")) {
                    c10 = 2;
                    break;
                }
                break;
            case -796150911:
                if (str.equals("street_line1")) {
                    c10 = 3;
                    break;
                }
                break;
            case -796150910:
                if (str.equals("street_line2")) {
                    c10 = 4;
                    break;
                }
                break;
            case -160985414:
                if (str.equals("first_name")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3053931:
                if (str.equals("city")) {
                    c10 = 6;
                    break;
                }
                break;
            case 109757585:
                if (str.equals("state")) {
                    c10 = 7;
                    break;
                }
                break;
            case 421072629:
                if (str.equals("middle_name")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 451516732:
                if (str.equals("first_name_native")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 475919162:
                if (str.equals("expiry_date")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 506677093:
                if (str.equals("document_no")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1168724782:
                if (str.equals("birth_date")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 1181577377:
                if (str.equals("middle_name_native")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 1481071862:
                if (str.equals("country_code")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2002465324:
                if (str.equals("post_code")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2013122196:
                if (str.equals("last_name")) {
                    c10 = 16;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 26;
            case 1:
            case 16:
                return 22;
            case 2:
                return 24;
            case 3:
                return 29;
            case 4:
                return 30;
            case 5:
            case '\t':
                return 20;
            case 6:
                return 32;
            case 7:
                return 33;
            case '\b':
            case '\r':
                return 21;
            case '\n':
                return 28;
            case 11:
                return 27;
            case '\f':
                return 23;
            case 14:
                return 25;
            case 15:
                return 31;
            default:
                return 100;
        }
    }

    public static boolean C0(org.telegram.ui.vm0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vm0.C0(org.telegram.ui.vm0):boolean");
    }

    public static void I0(vm0 vm0Var, EditTextBoldCursor editTextBoldCursor, String str, Editable editable, boolean z10) {
        String str2;
        String str3;
        String str4;
        String str5;
        HashMap hashMap = vm0Var.f42338y1;
        if (hashMap != null && (str3 = (String) hashMap.get(str)) != null) {
            if (TextUtils.equals(str3, editable)) {
                HashMap hashMap2 = vm0Var.f42332w1;
                if (hashMap2 != null && (str5 = (String) hashMap2.get(str)) != null) {
                    editTextBoldCursor.setErrorText(str5);
                } else {
                    HashMap hashMap3 = vm0Var.f42335x1;
                    if (hashMap3 != null && (str4 = (String) hashMap3.get(str)) != null) {
                        editTextBoldCursor.setErrorText(str4);
                    }
                }
            } else {
                editTextBoldCursor.setErrorText(null);
            }
        } else {
            editTextBoldCursor.setErrorText(null);
        }
        if (z10) {
            str2 = "error_document_all";
        } else {
            str2 = "error_all";
        }
        if (hashMap != null && hashMap.containsKey(str2)) {
            hashMap.remove(str2);
            vm0Var.Z0(false);
        }
    }

    public static void L0(vm0 vm0Var, int i10) {
        vm0Var.currentAccount = i10;
    }

    public static int M0(vm0 vm0Var) {
        return vm0Var.currentAccount;
    }

    public static void U(vm0 vm0Var, TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery) {
        TL_account.Password password = vm0Var.J;
        password.email_unconfirmed_pattern = tL_auth_passwordRecovery.email_pattern;
        vm0Var.presentFragment(new vf1(vm0Var.currentAccount, 4, password));
    }

    public static void V(vm0 vm0Var) {
        ArrayList arrayList;
        int i10;
        int i11;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        HashMap hashMap = vm0Var.f42320r1;
        HashMap hashMap2 = vm0Var.f42317q1;
        String str = vm0Var.f42318r;
        ArrayList arrayList2 = new ArrayList();
        int size = vm0Var.f42336y.required_types.size();
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.SecureRequiredType secureRequiredType = vm0Var.f42336y.required_types.get(i12);
            if (secureRequiredType instanceof TLRPC.TL_secureRequiredType) {
                tL_secureRequiredType = (TLRPC.TL_secureRequiredType) secureRequiredType;
            } else {
                if (secureRequiredType instanceof TLRPC.TL_secureRequiredTypeOneOf) {
                    TLRPC.TL_secureRequiredTypeOneOf tL_secureRequiredTypeOneOf = (TLRPC.TL_secureRequiredTypeOneOf) secureRequiredType;
                    if (!tL_secureRequiredTypeOneOf.types.isEmpty()) {
                        TLRPC.SecureRequiredType secureRequiredType2 = tL_secureRequiredTypeOneOf.types.get(0);
                        if (secureRequiredType2 instanceof TLRPC.TL_secureRequiredType) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) secureRequiredType2;
                            int size2 = tL_secureRequiredTypeOneOf.types.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 < size2) {
                                    TLRPC.SecureRequiredType secureRequiredType3 = tL_secureRequiredTypeOneOf.types.get(i13);
                                    if (secureRequiredType3 instanceof TLRPC.TL_secureRequiredType) {
                                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) secureRequiredType3;
                                        if (vm0Var.q1(tL_secureRequiredType5, true) != null) {
                                            tL_secureRequiredType = tL_secureRequiredType5;
                                            break;
                                        }
                                    }
                                    i13++;
                                } else {
                                    tL_secureRequiredType = tL_secureRequiredType4;
                                    break;
                                }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            TLRPC.TL_secureValue q12 = vm0Var.q1(tL_secureRequiredType, true);
            if (q12 == null) {
                Vibrator vibrator = (Vibrator) vm0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                um0 um0Var = (um0) hashMap2.get(tL_secureRequiredType);
                if (um0Var == null && (tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    um0Var = (um0) hashMap2.get(tL_secureRequiredType2);
                }
                AndroidUtilities.shakeView(um0Var);
                return;
            }
            HashMap hashMap3 = (HashMap) vm0Var.f42327u1.get(n1(tL_secureRequiredType.type));
            if (hashMap3 != null && !hashMap3.isEmpty()) {
                Vibrator vibrator2 = (Vibrator) vm0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                um0 um0Var2 = (um0) hashMap2.get(tL_secureRequiredType);
                if (um0Var2 == null && (tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    um0Var2 = (um0) hashMap2.get(tL_secureRequiredType3);
                }
                AndroidUtilities.shakeView(um0Var2);
                return;
            }
            boolean z10 = tL_secureRequiredType.selfie_required;
            boolean z11 = tL_secureRequiredType.translation_required;
            ?? obj = new Object();
            obj.f42894a = q12;
            obj.f42895b = z10;
            obj.f42896c = z11;
            arrayList2.add(obj);
        }
        vm0Var.M1(false, true);
        TL_account.acceptAuthorization acceptauthorization = new TL_account.acceptAuthorization();
        acceptauthorization.bot_id = vm0Var.f42287c;
        acceptauthorization.scope = vm0Var.h;
        acceptauthorization.public_key = str;
        JSONObject jSONObject = new JSONObject();
        int size3 = arrayList2.size();
        int i14 = 0;
        while (i14 < size3) {
            wl0 wl0Var = (wl0) arrayList2.get(i14);
            TLRPC.TL_secureValue tL_secureValue = wl0Var.f42894a;
            JSONObject jSONObject2 = new JSONObject();
            TLRPC.SecurePlainData securePlainData = tL_secureValue.plain_data;
            if (securePlainData != null) {
                if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
                    TLRPC.TL_securePlainEmail tL_securePlainEmail = (TLRPC.TL_securePlainEmail) securePlainData;
                } else if (securePlainData instanceof TLRPC.TL_securePlainPhone) {
                    TLRPC.TL_securePlainPhone tL_securePlainPhone = (TLRPC.TL_securePlainPhone) securePlainData;
                }
            } else {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    TLRPC.TL_secureData tL_secureData = tL_secureValue.data;
                    if (tL_secureData != null) {
                        byte[] h12 = vm0Var.h1(tL_secureData.secret, tL_secureData.data_hash);
                        arrayList = arrayList2;
                        try {
                            jSONObject2.put("data_hash", Base64.encodeToString(tL_secureValue.data.data_hash, 2));
                            jSONObject2.put("secret", Base64.encodeToString(h12, 2));
                            jSONObject3.put("data", jSONObject2);
                        } catch (Exception unused) {
                        }
                    } else {
                        arrayList = arrayList2;
                    }
                    if (!tL_secureValue.files.isEmpty()) {
                        JSONArray jSONArray = new JSONArray();
                        int i15 = 0;
                        for (int size4 = tL_secureValue.files.size(); i15 < size4; size4 = size4) {
                            TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) tL_secureValue.files.get(i15);
                            i10 = size3;
                            try {
                                i11 = i14;
                                try {
                                    byte[] h13 = vm0Var.h1(tL_secureFile.secret, tL_secureFile.file_hash);
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("file_hash", Base64.encodeToString(tL_secureFile.file_hash, 2));
                                    jSONObject4.put("secret", Base64.encodeToString(h13, 2));
                                    jSONArray.put(jSONObject4);
                                    i15++;
                                    size3 = i10;
                                    i14 = i11;
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                            }
                        }
                        i10 = size3;
                        i11 = i14;
                        jSONObject3.put("files", jSONArray);
                    } else {
                        i10 = size3;
                        i11 = i14;
                    }
                    TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                    if (secureFile instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile;
                        byte[] h14 = vm0Var.h1(tL_secureFile2.secret, tL_secureFile2.file_hash);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("file_hash", Base64.encodeToString(tL_secureFile2.file_hash, 2));
                        jSONObject5.put("secret", Base64.encodeToString(h14, 2));
                        jSONObject3.put("front_side", jSONObject5);
                    }
                    TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile2;
                        byte[] h15 = vm0Var.h1(tL_secureFile3.secret, tL_secureFile3.file_hash);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("file_hash", Base64.encodeToString(tL_secureFile3.file_hash, 2));
                        jSONObject6.put("secret", Base64.encodeToString(h15, 2));
                        jSONObject3.put("reverse_side", jSONObject6);
                    }
                    if (wl0Var.f42895b) {
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile3;
                            byte[] h16 = vm0Var.h1(tL_secureFile4.secret, tL_secureFile4.file_hash);
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("file_hash", Base64.encodeToString(tL_secureFile4.file_hash, 2));
                            jSONObject7.put("secret", Base64.encodeToString(h16, 2));
                            jSONObject3.put("selfie", jSONObject7);
                        }
                    }
                    if (wl0Var.f42896c && !tL_secureValue.translation.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        int size5 = tL_secureValue.translation.size();
                        for (int i16 = 0; i16 < size5; i16++) {
                            TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) tL_secureValue.translation.get(i16);
                            byte[] h17 = vm0Var.h1(tL_secureFile5.secret, tL_secureFile5.file_hash);
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("file_hash", Base64.encodeToString(tL_secureFile5.file_hash, 2));
                            jSONObject8.put("secret", Base64.encodeToString(h17, 2));
                            jSONArray2.put(jSONObject8);
                        }
                        jSONObject3.put("translation", jSONArray2);
                    }
                    jSONObject.put(n1(tL_secureValue.type), jSONObject3);
                } catch (Exception unused4) {
                }
                TLRPC.TL_secureValueHash tL_secureValueHash = new TLRPC.TL_secureValueHash();
                tL_secureValueHash.type = tL_secureValue.type;
                tL_secureValueHash.hash = tL_secureValue.hash;
                acceptauthorization.value_hashes.add(tL_secureValueHash);
                i14 = i11 + 1;
                arrayList2 = arrayList;
                size3 = i10;
            }
            arrayList = arrayList2;
            i10 = size3;
            i11 = i14;
            TLRPC.TL_secureValueHash tL_secureValueHash2 = new TLRPC.TL_secureValueHash();
            tL_secureValueHash2.type = tL_secureValue.type;
            tL_secureValueHash2.hash = tL_secureValue.hash;
            acceptauthorization.value_hashes.add(tL_secureValueHash2);
            i14 = i11 + 1;
            arrayList2 = arrayList;
            size3 = i10;
        }
        JSONObject jSONObject9 = new JSONObject();
        try {
            jSONObject9.put("secure_data", jSONObject);
        } catch (Exception unused5) {
        }
        Object obj2 = vm0Var.d;
        if (obj2 != null) {
            try {
                jSONObject9.put("payload", obj2);
            } catch (Exception unused6) {
            }
        }
        Object obj3 = vm0Var.e;
        if (obj3 != null) {
            try {
                jSONObject9.put("nonce", obj3);
            } catch (Exception unused7) {
            }
        }
        com.google.android.gms.internal.cast.z5 j12 = vm0Var.j1(AndroidUtilities.getStringBytes(jSONObject9.toString()));
        TLRPC.TL_secureCredentialsEncrypted tL_secureCredentialsEncrypted = new TLRPC.TL_secureCredentialsEncrypted();
        acceptauthorization.credentials = tL_secureCredentialsEncrypted;
        tL_secureCredentialsEncrypted.hash = (byte[]) j12.d;
        tL_secureCredentialsEncrypted.data = (byte[]) j12.f6880a;
        try {
            String replace = str.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "");
            Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(replace, 0))));
            acceptauthorization.credentials.secret = cipher.doFinal((byte[]) j12.f6882c);
        } catch (Exception e) {
            FileLog.e(e);
        }
        ConnectionsManager.getInstance(vm0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(vm0Var.currentAccount).sendRequest(acceptauthorization, new ll0(vm0Var, 1)), vm0Var.classGuid);
    }

    public static void W(vm0 vm0Var, TLRPC.TL_error tL_error, String str, mm0 mm0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        if (tL_error == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("phone", str);
            vm0 vm0Var2 = new vm0(7, vm0Var.f42336y, vm0Var.J, vm0Var.E, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
            vm0Var2.currentAccount = vm0Var.currentAccount;
            vm0Var2.f42293e1 = vm0Var.f42293e1;
            vm0Var2.f42289c1 = vm0Var.f42289c1;
            vm0Var2.B1 = mm0Var;
            vm0Var2.K = (TLRPC.TL_auth_sentCode) tLObject;
            vm0Var.presentFragment(vm0Var2, true);
            return;
        }
        org.telegram.ui.Components.f5.e0(vm0Var.currentAccount, tL_error, vm0Var, sendverifyphonecode, str);
    }

    public static void X(vm0 vm0Var, SecureDocument secureDocument, int i10) {
        HashMap hashMap = vm0Var.f42311n1;
        int i11 = vm0Var.S0;
        if (i11 == 1) {
            SecureDocument secureDocument2 = vm0Var.f42304j1;
            if (secureDocument2 != null) {
                tm0 tm0Var = (tm0) hashMap.remove(secureDocument2);
                if (tm0Var != null) {
                    vm0Var.f42297g0.removeView(tm0Var);
                }
                vm0Var.f42304j1 = null;
            }
        } else if (i11 == 4) {
            if (vm0Var.f42306k1.size() >= 20) {
                return;
            }
        } else if (i11 == 2) {
            SecureDocument secureDocument3 = vm0Var.l1;
            if (secureDocument3 != null) {
                tm0 tm0Var2 = (tm0) hashMap.remove(secureDocument3);
                if (tm0Var2 != null) {
                    vm0Var.f42292e0.removeView(tm0Var2);
                }
                vm0Var.l1 = null;
            }
        } else if (i11 == 3) {
            SecureDocument secureDocument4 = vm0Var.f42308m1;
            if (secureDocument4 != null) {
                tm0 tm0Var3 = (tm0) hashMap.remove(secureDocument4);
                if (tm0Var3 != null) {
                    vm0Var.f42295f0.removeView(tm0Var3);
                }
                vm0Var.f42308m1 = null;
            }
        } else if (i11 == 0 && vm0Var.f42302i1.size() >= 20) {
            return;
        }
        vm0Var.f42313o1.put(secureDocument.path, secureDocument);
        vm0Var.L.setEnabled(false);
        vm0Var.L.setAlpha(0.5f);
        FileLoader.getInstance(vm0Var.currentAccount).uploadFile(secureDocument.path, false, true, 16777216);
        vm0Var.Q0(secureDocument, i10);
        vm0Var.R1(i10);
    }

    public static void Y(org.telegram.ui.vm0 r9, boolean r10, java.lang.String r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vm0.Y(org.telegram.ui.vm0, boolean, java.lang.String):void");
    }

    public static boolean Y0(byte[] bArr, Long l4) {
        if (bArr == null || bArr.length != 32) {
            return false;
        }
        int i10 = 0;
        for (byte b10 : bArr) {
            i10 += b10 & 255;
        }
        if (i10 % 255 != 239) {
            return false;
        }
        if (l4 != null && Utilities.bytesToLong(Utilities.computeSHA256(bArr)) != l4.longValue()) {
            return false;
        }
        return true;
    }

    public static void Z(int i10, String str, SecureDocument secureDocument, tm0 tm0Var, vm0 vm0Var) {
        HashMap hashMap = vm0Var.f42313o1;
        vm0Var.f42311n1.remove(secureDocument);
        if (i10 == 1) {
            vm0Var.f42304j1 = null;
            vm0Var.f42297g0.removeView(tm0Var);
        } else if (i10 == 4) {
            vm0Var.f42306k1.remove(secureDocument);
            vm0Var.f42299h0.removeView(tm0Var);
        } else if (i10 == 2) {
            vm0Var.l1 = null;
            vm0Var.f42292e0.removeView(tm0Var);
        } else if (i10 == 3) {
            vm0Var.f42308m1 = null;
            vm0Var.f42295f0.removeView(tm0Var);
        } else {
            vm0Var.f42302i1.remove(secureDocument);
            vm0Var.f42290d0.removeView(tm0Var);
        }
        if (str != null) {
            HashMap hashMap2 = vm0Var.f42335x1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
            HashMap hashMap3 = vm0Var.f42338y1;
            if (hashMap3 != null) {
                hashMap3.remove(str);
            }
        }
        vm0Var.R1(i10);
        String str2 = secureDocument.path;
        if (str2 != null && hashMap.remove(str2) != null) {
            if (hashMap.isEmpty()) {
                vm0Var.L.setEnabled(true);
                vm0Var.L.setAlpha(1.0f);
            }
            FileLoader.getInstance(vm0Var.currentAccount).cancelFileUpload(secureDocument.path, false);
        }
    }

    public static void a0(vm0 vm0Var) {
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        for (int i10 = 0; i10 < vm0Var.f42336y.values.size(); i10++) {
            deletesecurevalue.types.add(vm0Var.f42336y.values.get(i10).type);
        }
        vm0Var.x1();
        ConnectionsManager.getInstance(vm0Var.currentAccount).sendRequest(deletesecurevalue, new ll0(vm0Var, 2));
    }

    public static void b0(vm0 vm0Var) {
        vf1 vf1Var = new vf1(vm0Var.currentAccount, 0, vm0Var.J);
        vf1Var.Y = true;
        vm0Var.presentFragment(vf1Var);
    }

    public static void c0(vm0 vm0Var) {
        if (vm0Var.J.has_recovery) {
            vm0Var.x1();
            ConnectionsManager.getInstance(vm0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(vm0Var.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new ll0(vm0Var, 0), 10), vm0Var.classGuid);
        } else if (vm0Var.getParentActivity() == null) {
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vm0Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.RestorePasswordResetAccount), new kl0(vm0Var, 4));
            alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
            String string = LocaleController.getString(R.string.RestorePasswordNoEmailText);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
            b2Var.T = string;
            vm0Var.showDialog(b2Var);
        }
    }

    public static void d0(vm0 vm0Var) {
        Activity parentActivity = vm0Var.getParentActivity();
        pf.d.r(parentActivity, "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(vm0Var.currentAccount).getClientPhone());
    }

    public static int e0(vm0 vm0Var) {
        return vm0Var.currentAccount;
    }

    public static String g1(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr != null && bArr2 != null && bArr2.length == 32 && bArr3 != null && bArr3.length == 32) {
            byte[] computeSHA512 = Utilities.computeSHA512(bArr2, bArr3);
            byte[] bArr4 = new byte[32];
            System.arraycopy(computeSHA512, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(computeSHA512, 32, bArr5, 0, 16);
            int length = bArr.length;
            byte[] bArr6 = new byte[length];
            System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
            Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, length, 0, 0);
            if (Arrays.equals(Utilities.computeSHA256(bArr6), bArr3)) {
                int i10 = bArr6[0] & 255;
                return new String(bArr6, i10, length - i10);
            }
            return null;
        }
        return null;
    }

    public static String m1(SecureDocument secureDocument) {
        byte[] bArr;
        if (secureDocument != null) {
            TLRPC.TL_secureFile tL_secureFile = secureDocument.secureFile;
            if (tL_secureFile != null && (bArr = tL_secureFile.file_hash) != null) {
                return Base64.encodeToString(bArr, 2);
            }
            byte[] bArr2 = secureDocument.fileHash;
            if (bArr2 != null) {
                return Base64.encodeToString(bArr2, 2);
            }
            return "";
        }
        return "";
    }

    public static String n1(TLRPC.SecureValueType secureValueType) {
        if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
            return "personal_details";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
            return "passport";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
            return "internal_passport";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
            return "driver_license";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
            return "identity_card";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
            return "utility_bill";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
            return "address";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
            return "bank_statement";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
            return "rental_agreement";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
            return "temporary_registration";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
            return "passport_registration";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
            return "email";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
            return "phone";
        }
        return "";
    }

    public static byte[] o1() {
        byte[] bArr = new byte[32];
        Utilities.random.nextBytes(bArr);
        int i10 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            i10 += 255 & bArr[i11];
        }
        int i12 = i10 % 255;
        if (i12 != 239) {
            int nextInt = Utilities.random.nextInt(32);
            int i13 = (bArr[nextInt] & 255) + (239 - i12);
            if (i13 < 255) {
                i13 += 255;
            }
            bArr[nextInt] = (byte) (i13 % 255);
        }
        return bArr;
    }

    public static String p1(TLRPC.SecureValueType secureValueType) {
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
            return LocaleController.getString(R.string.ActionBotDocumentPassport);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
            return LocaleController.getString(R.string.ActionBotDocumentDriverLicence);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
            return LocaleController.getString(R.string.ActionBotDocumentIdentityCard);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
            return LocaleController.getString(R.string.ActionBotDocumentUtilityBill);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
            return LocaleController.getString(R.string.ActionBotDocumentBankStatement);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
            return LocaleController.getString(R.string.ActionBotDocumentRentalAgreement);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
            return LocaleController.getString(R.string.ActionBotDocumentInternalPassport);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
            return LocaleController.getString(R.string.ActionBotDocumentPassportRegistration);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
            return LocaleController.getString(R.string.ActionBotDocumentTemporaryRegistration);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
            return LocaleController.getString(R.string.ActionBotDocumentPhone);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
            return LocaleController.getString(R.string.ActionBotDocumentEmail);
        }
        return "";
    }

    public static int q0(vm0 vm0Var) {
        return vm0Var.currentAccount;
    }

    public static int r0(vm0 vm0Var) {
        return vm0Var.currentAccount;
    }

    public static int s0(vm0 vm0Var) {
        return vm0Var.currentAccount;
    }

    public static boolean s1(TLRPC.SecureValueType secureValueType) {
        if (!(secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) && !(secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) && !(secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) && !(secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) && !(secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement)) {
            return false;
        }
        return true;
    }

    public static boolean u1(TLRPC.SecureValueType secureValueType) {
        if (!(secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) && !(secureValueType instanceof TLRPC.TL_secureValueTypePassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
            return false;
        }
        return true;
    }

    public final void A1(boolean z10) {
        String obj;
        if (z10) {
            obj = null;
        } else {
            obj = this.Y[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                z1(false);
                return;
            }
            M1(true, true);
        }
        Utilities.globalQueue.postRunnable(new x70(this, z10, obj, 3));
    }

    public final void B1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (r1(TLRPC.TL_secureValueTypePhone.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentPhone));
            arrayList2.add(TLRPC.TL_secureValueTypePhone.class);
        }
        if (r1(TLRPC.TL_secureValueTypeEmail.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentEmail));
            arrayList2.add(TLRPC.TL_secureValueTypeEmail.class);
        }
        if (r1(TLRPC.TL_secureValueTypePersonalDetails.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentIdentity));
            arrayList2.add(TLRPC.TL_secureValueTypePersonalDetails.class);
        }
        if (r1(TLRPC.TL_secureValueTypePassport.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentPassport));
            arrayList2.add(TLRPC.TL_secureValueTypePassport.class);
        }
        if (r1(TLRPC.TL_secureValueTypeInternalPassport.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentInternalPassport));
            arrayList2.add(TLRPC.TL_secureValueTypeInternalPassport.class);
        }
        if (r1(TLRPC.TL_secureValueTypePassportRegistration.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentPassportRegistration));
            arrayList2.add(TLRPC.TL_secureValueTypePassportRegistration.class);
        }
        if (r1(TLRPC.TL_secureValueTypeTemporaryRegistration.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentTemporaryRegistration));
            arrayList2.add(TLRPC.TL_secureValueTypeTemporaryRegistration.class);
        }
        if (r1(TLRPC.TL_secureValueTypeIdentityCard.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentIdentityCard));
            arrayList2.add(TLRPC.TL_secureValueTypeIdentityCard.class);
        }
        if (r1(TLRPC.TL_secureValueTypeDriverLicense.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentDriverLicence));
            arrayList2.add(TLRPC.TL_secureValueTypeDriverLicense.class);
        }
        if (r1(TLRPC.TL_secureValueTypeAddress.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentAddress));
            arrayList2.add(TLRPC.TL_secureValueTypeAddress.class);
        }
        if (r1(TLRPC.TL_secureValueTypeUtilityBill.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentUtilityBill));
            arrayList2.add(TLRPC.TL_secureValueTypeUtilityBill.class);
        }
        if (r1(TLRPC.TL_secureValueTypeBankStatement.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentBankStatement));
            arrayList2.add(TLRPC.TL_secureValueTypeBankStatement.class);
        }
        if (r1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentRentalAgreement));
            arrayList2.add(TLRPC.TL_secureValueTypeRentalAgreement.class);
        }
        if (getParentActivity() != null && !arrayList.isEmpty()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.PassportNoDocumentsAdd);
            alertDialog$Builder.f((CharSequence[]) arrayList.toArray(new CharSequence[0]), new mg.j(9, this, arrayList2));
            showDialog(alertDialog$Builder.f20605a);
        }
    }

    public final void C1() {
        boolean z10;
        int size;
        if (getParentActivity() == null) {
            return;
        }
        int i10 = this.S0;
        ArrayList arrayList = this.f42302i1;
        int i11 = 1;
        if (i10 == 0 && arrayList.size() >= 20) {
            L1(LocaleController.getString(R.string.AppName), LocaleController.formatString("PassportUploadMaxReached", R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", 20, new Object[0])));
            return;
        }
        b1();
        org.telegram.ui.Components.ti tiVar = this.R0;
        int i12 = this.S0;
        if (i12 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        tiVar.X1 = z10;
        if (i12 == 0) {
            size = arrayList.size();
        } else {
            if (i12 == 4) {
                size = this.f42306k1.size();
            }
            tiVar.N1(i11, false);
            this.R0.f30558j0.f0();
            this.R0.t1();
            showDialog(this.R0);
        }
        i11 = 20 - size;
        tiVar.N1(i11, false);
        this.R0.f30558j0.f0();
        this.R0.t1();
        showDialog(this.R0);
    }

    public final void D1(TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, boolean z10) {
        int i10;
        TLRPC.SecureValueType secureValueType;
        int i11;
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType.type;
        if (tL_secureRequiredType2 != null) {
            secureValueType = tL_secureRequiredType2.type;
        } else {
            secureValueType = null;
        }
        if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
            i11 = 1;
        } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
            i11 = 2;
        } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) {
            i11 = 3;
        } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail) {
            i11 = 4;
        } else {
            i11 = -1;
        }
        if (i11 != -1) {
            HashMap hashMap4 = this.f42327u1;
            if (!z10) {
                hashMap = (HashMap) hashMap4.get(n1(secureValueType2));
            } else {
                hashMap = null;
            }
            HashMap hashMap5 = (HashMap) hashMap4.get(n1(secureValueType));
            TLRPC.TL_secureValue q12 = q1(tL_secureRequiredType, false);
            TLRPC.TL_secureValue q13 = q1(tL_secureRequiredType2, false);
            HashMap hashMap6 = hashMap;
            TL_account.authorizationForm authorizationform = this.f42336y;
            int i12 = i11;
            TL_account.Password password = this.J;
            HashMap hashMap7 = this.f42315p1;
            HashMap hashMap8 = (HashMap) hashMap7.get(tL_secureRequiredType);
            if (tL_secureRequiredType2 != null) {
                hashMap2 = hashMap5;
                hashMap3 = (HashMap) hashMap7.get(tL_secureRequiredType2);
            } else {
                hashMap2 = hashMap5;
                hashMap3 = null;
            }
            vm0 vm0Var = new vm0(i12, authorizationform, password, tL_secureRequiredType, q12, tL_secureRequiredType2, q13, hashMap8, hashMap3);
            vm0Var.B1 = new zl0(this, secureValueType2, z10, i10);
            vm0Var.currentAccount = this.currentAccount;
            vm0Var.f42293e1 = this.f42293e1;
            vm0Var.f42289c1 = this.f42289c1;
            vm0Var.f42287c = this.f42287c;
            vm0Var.f42332w1 = hashMap6;
            vm0Var.f42328v0 = z10;
            vm0Var.f42335x1 = hashMap2;
            vm0Var.G = arrayList;
            if (i12 == 4) {
                vm0Var.f42291d1 = this.f42291d1;
            }
            presentFragment(vm0Var);
        }
    }

    public final void E1(int i10) {
        if (i10 == 0) {
            int i11 = Build.VERSION.SDK_INT;
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            try {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File generatePicturePath = AndroidUtilities.generatePicturePath();
                if (generatePicturePath != null) {
                    if (i11 >= 24) {
                        Activity parentActivity = getParentActivity();
                        intent.putExtra("output", FileProvider.d(parentActivity, ApplicationLoader.getApplicationId() + ".provider", generatePicturePath));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(generatePicturePath));
                    }
                    this.Q0 = generatePicturePath.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void F1(ArrayList arrayList) {
        boolean z10;
        if (arrayList.isEmpty()) {
            return;
        }
        int i10 = this.S0;
        boolean z11 = true;
        if (i10 != 1 && i10 != 4 && (this.E.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            int i11 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Y;
                if (i11 < editTextBoldCursorArr.length) {
                    if (i11 != 5 && i11 != 8 && i11 != 4 && i11 != 6 && editTextBoldCursorArr[i11].length() > 0) {
                        z11 = false;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            z10 = z11;
        } else {
            z10 = false;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.k0(this.S0, 7, this, arrayList, z10));
    }

    public final TLRPC.TL_secureValue G1(TLRPC.TL_secureRequiredType tL_secureRequiredType) {
        if (tL_secureRequiredType == null) {
            return null;
        }
        int size = this.f42336y.values.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (tL_secureRequiredType.type.getClass() == this.f42336y.values.get(i10).type.getClass()) {
                return this.f42336y.values.remove(i10);
            }
        }
        return null;
    }

    public final void H1(View view) {
        while (view != null && this.f42288c0.indexOfChild(view) < 0) {
            view = (View) view.getParent();
        }
        if (view != null) {
            this.f42285b0.smoothScrollTo(0, view.getTop() - ((this.f42285b0.getMeasuredHeight() - view.getMeasuredHeight()) / 2));
        }
    }

    public final void I1(HashMap hashMap, EditTextBoldCursor editTextBoldCursor, String str) {
        CharSequence charSequence;
        CharSequence charSequence2;
        String str2 = (String) hashMap.get(str);
        if (str2 != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -2006252145:
                    if (str.equals("residence_country_code")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1249512767:
                    if (str.equals("gender")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 475919162:
                    if (str.equals("expiry_date")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1481071862:
                    if (str.equals("country_code")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    this.v = str2;
                    CharSequence charSequence3 = (String) this.Y0.get(str2);
                    if (charSequence3 != null) {
                        editTextBoldCursor.setText(charSequence3);
                        break;
                    }
                    break;
                case 1:
                    if ("male".equals(str2)) {
                        this.f42330w = str2;
                        editTextBoldCursor.setText(LocaleController.getString(R.string.PassportMale));
                        break;
                    } else if ("female".equals(str2)) {
                        this.f42330w = str2;
                        editTextBoldCursor.setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                    break;
                case 2:
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    int[] iArr = this.f42333x;
                    if (!isEmpty) {
                        String[] split = str2.split("\\.");
                        if (split.length == 3) {
                            iArr[0] = Utilities.parseInt((CharSequence) split[2]).intValue();
                            iArr[1] = Utilities.parseInt((CharSequence) split[1]).intValue();
                            iArr[2] = Utilities.parseInt((CharSequence) split[0]).intValue();
                            editTextBoldCursor.setText(str2);
                            break;
                        }
                    }
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    editTextBoldCursor.setText(LocaleController.getString(R.string.PassportNoExpireDate));
                    break;
                case 3:
                    this.f42321s = str2;
                    CharSequence charSequence4 = (String) this.Y0.get(str2);
                    if (charSequence4 != null) {
                        editTextBoldCursor.setText(charSequence4);
                        break;
                    }
                    break;
                default:
                    editTextBoldCursor.setText(str2);
                    break;
            }
        }
        HashMap hashMap2 = this.f42332w1;
        HashMap hashMap3 = this.f42338y1;
        if (hashMap2 != null && (charSequence2 = (String) hashMap2.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence2);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
            return;
        }
        HashMap hashMap4 = this.f42335x1;
        if (hashMap4 != null && (charSequence = (String) hashMap4.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
        }
    }

    public final void J1(Bundle bundle, int i10, boolean z10) {
        if (i10 == 3) {
            this.L.setVisibility(8);
        }
        int i11 = this.I1;
        org.telegram.ui.Components.qw0[] qw0VarArr = this.J1;
        org.telegram.ui.Components.qw0 qw0Var = qw0VarArr[i11];
        org.telegram.ui.Components.qw0 qw0Var2 = qw0VarArr[i10];
        this.I1 = i10;
        qw0Var2.m(bundle, false);
        qw0Var2.j();
        if (z10) {
            qw0Var2.setTranslationX(AndroidUtilities.displaySize.x);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.setDuration(300L);
            animatorSet.playTogether(ObjectAnimator.ofFloat(qw0Var, "translationX", -AndroidUtilities.displaySize.x), ObjectAnimator.ofFloat(qw0Var2, "translationX", 0.0f));
            animatorSet.addListener(new org.telegram.ui.Components.nl0(qw0Var2, qw0Var, 9));
            animatorSet.start();
            return;
        }
        qw0Var2.setTranslationX(0.0f);
        qw0Var2.setVisibility(0);
        if (qw0Var != qw0Var2) {
            qw0Var.setVisibility(8);
        }
    }

    public final void K1(org.telegram.tgnet.TLRPC.TL_secureRequiredType r31, java.lang.String r32, java.lang.String r33, org.telegram.tgnet.TLRPC.TL_secureRequiredType r34, java.lang.String r35, boolean r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vm0.K1(org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, boolean, int):void");
    }

    public final void L1(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
        b2Var.R = str;
        b2Var.T = str2;
        showDialog(b2Var);
    }

    public final void M1(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.M;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10 && this.L != null) {
            this.M = new AnimatorSet();
            if (z11) {
                this.N.setVisibility(0);
                this.L.setEnabled(false);
                AnimatorSet animatorSet2 = this.M;
                View contentView = this.L.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(contentView, property, 0.1f);
                View contentView2 = this.L.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(contentView2, property2, 0.1f);
                View contentView3 = this.L.getContentView();
                Property property3 = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, property3, 0.0f), ObjectAnimator.ofFloat(this.N, property, 1.0f), ObjectAnimator.ofFloat(this.N, property2, 1.0f), ObjectAnimator.ofFloat(this.N, property3, 1.0f));
            } else {
                this.L.getContentView().setVisibility(0);
                this.L.setEnabled(true);
                AnimatorSet animatorSet3 = this.M;
                org.telegram.ui.Components.dr drVar = this.N;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(drVar, property4, 0.1f);
                org.telegram.ui.Components.dr drVar2 = this.N;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(drVar2, property5, 0.1f);
                org.telegram.ui.Components.dr drVar3 = this.N;
                Property property6 = View.ALPHA;
                animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(drVar3, property6, 0.0f), ObjectAnimator.ofFloat(this.L.getContentView(), property4, 1.0f), ObjectAnimator.ofFloat(this.L.getContentView(), property5, 1.0f), ObjectAnimator.ofFloat(this.L.getContentView(), property6, 1.0f));
            }
            this.M.addListener(new am0(this, z11, 0));
            this.M.setDuration(150L);
            this.M.start();
        } else if (this.O != null) {
            this.M = new AnimatorSet();
            if (z11) {
                this.P.setVisibility(0);
                this.Q.setEnabled(false);
                AnimatorSet animatorSet4 = this.M;
                TextView textView = this.O;
                Property property7 = View.SCALE_X;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView, property7, 0.1f);
                TextView textView2 = this.O;
                Property property8 = View.SCALE_Y;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView2, property8, 0.1f);
                TextView textView3 = this.O;
                Property property9 = View.ALPHA;
                animatorSet4.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, property9, 0.0f), ObjectAnimator.ofFloat(this.P, property7, 1.0f), ObjectAnimator.ofFloat(this.P, property8, 1.0f), ObjectAnimator.ofFloat(this.P, property9, 1.0f));
            } else {
                this.O.setVisibility(0);
                this.Q.setEnabled(true);
                AnimatorSet animatorSet5 = this.M;
                org.telegram.ui.Components.dr drVar4 = this.P;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(drVar4, property10, 0.1f);
                org.telegram.ui.Components.dr drVar5 = this.P;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(drVar5, property11, 0.1f);
                org.telegram.ui.Components.dr drVar6 = this.P;
                Property property12 = View.ALPHA;
                animatorSet5.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(drVar6, property12, 0.0f), ObjectAnimator.ofFloat(this.O, property10, 1.0f), ObjectAnimator.ofFloat(this.O, property11, 1.0f), ObjectAnimator.ofFloat(this.O, property12, 1.0f));
            }
            this.M.addListener(new am0(this, z11, 1));
            this.M.setDuration(150L);
            this.M.start();
        }
    }

    public final void N1(boolean z10, String str, Runnable runnable, km0 km0Var, mm0 mm0Var) {
        boolean z11;
        boolean z12;
        boolean z13;
        TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        if (telephonyManager.getSimState() != 1 && telephonyManager.getPhoneType() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (getParentActivity() != null && z11) {
            if (getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10) {
                this.M1.clear();
                if (!z12) {
                    this.M1.add("android.permission.READ_PHONE_STATE");
                }
                if (!this.M1.isEmpty()) {
                    if (getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.AllowReadCall);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
                        b2Var.T = string;
                        this.L1 = showDialog(b2Var);
                    } else {
                        getParentActivity().requestPermissions((String[]) this.M1.toArray(new String[0]), 6);
                    }
                    this.E1 = str;
                    this.G1 = km0Var;
                    this.F1 = runnable;
                    this.H1 = mm0Var;
                    return;
                }
            }
        } else {
            z12 = true;
        }
        TL_account.sendVerifyPhoneCode sendverifyphonecode = new TL_account.sendVerifyPhoneCode();
        sendverifyphonecode.phone_number = str;
        TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
        sendverifyphonecode.settings = tL_codeSettings;
        if (z11 && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        tL_codeSettings.allow_flashcall = z13;
        tL_codeSettings.allow_app_hash = PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices();
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
        if (sendverifyphonecode.settings.allow_app_hash) {
            sharedPreferences.edit().putString("sms_hash", BuildVars.getSmsHash()).commit();
        } else {
            sharedPreferences.edit().remove("sms_hash").commit();
        }
        if (sendverifyphonecode.settings.allow_flashcall) {
            try {
                String line1Number = telephonyManager.getLine1Number();
                if (!TextUtils.isEmpty(line1Number)) {
                    sendverifyphonecode.settings.current_number = PhoneNumberUtils.compare(str, line1Number);
                    TLRPC.TL_codeSettings tL_codeSettings2 = sendverifyphonecode.settings;
                    if (!tL_codeSettings2.current_number) {
                        tL_codeSettings2.allow_flashcall = false;
                    }
                } else {
                    TLRPC.TL_codeSettings tL_codeSettings3 = sendverifyphonecode.settings;
                    tL_codeSettings3.unknown_number = true;
                    tL_codeSettings3.current_number = false;
                }
            } catch (Exception e) {
                sendverifyphonecode.settings.allow_flashcall = false;
                FileLog.e(e);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendverifyphonecode, new ai.k2(this, str, mm0Var, sendverifyphonecode, 14), 2);
    }

    public final void O1() {
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        if (tL_secureRequiredType != null) {
            this.actionBar.setTitle(p1(tL_secureRequiredType.type));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.PassportPersonal));
        }
        R1(2);
        R1(3);
        R1(1);
        R1(4);
    }

    public final void P1() {
        if (this.f42336y.values.isEmpty()) {
            this.A0.setVisibility(0);
            this.f42307l0.setVisibility(8);
            this.f42303j0.setVisibility(8);
            this.f42334x0.setVisibility(8);
            this.f42337y0.setVisibility(8);
            this.f42339z0.setVisibility(8);
            return;
        }
        this.A0.setVisibility(8);
        this.f42307l0.setVisibility(0);
        this.f42303j0.setVisibility(0);
        this.f42337y0.setVisibility(0);
        this.f42339z0.setVisibility(0);
        if (!r1(TLRPC.TL_secureValueTypePhone.class) && !r1(TLRPC.TL_secureValueTypeEmail.class) && !r1(TLRPC.TL_secureValueTypePersonalDetails.class) && !r1(TLRPC.TL_secureValueTypePassport.class) && !r1(TLRPC.TL_secureValueTypeInternalPassport.class) && !r1(TLRPC.TL_secureValueTypeIdentityCard.class) && !r1(TLRPC.TL_secureValueTypeDriverLicense.class) && !r1(TLRPC.TL_secureValueTypeAddress.class) && !r1(TLRPC.TL_secureValueTypeUtilityBill.class) && !r1(TLRPC.TL_secureValueTypePassportRegistration.class) && !r1(TLRPC.TL_secureValueTypeTemporaryRegistration.class) && !r1(TLRPC.TL_secureValueTypeBankStatement.class) && !r1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            this.f42334x0.setVisibility(8);
        } else {
            this.f42334x0.setVisibility(0);
        }
    }

    public final void Q0(final SecureDocument secureDocument, final int i10) {
        String string;
        final String str;
        String formatDateForBan;
        HashMap hashMap;
        if (i10 == 1) {
            this.f42304j1 = secureDocument;
            if (this.f42297g0 == null) {
                return;
            }
        } else if (i10 == 4) {
            this.f42306k1.add(secureDocument);
            if (this.f42299h0 == null) {
                return;
            }
        } else if (i10 == 2) {
            this.l1 = secureDocument;
            if (this.f42292e0 == null) {
                return;
            }
        } else if (i10 == 3) {
            this.f42308m1 = secureDocument;
            if (this.f42295f0 == null) {
                return;
            }
        } else {
            this.f42302i1.add(secureDocument);
            if (this.f42290d0 == null) {
                return;
            }
        }
        if (getParentActivity() == null) {
            return;
        }
        final tm0 tm0Var = new tm0(this, getParentActivity());
        tm0Var.setTag(secureDocument);
        tm0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(true));
        this.f42311n1.put(secureDocument, tm0Var);
        String m12 = m1(secureDocument);
        if (i10 == 1) {
            string = LocaleController.getString(R.string.PassportSelfie);
            this.f42297g0.addView(tm0Var, w7.z5.n(-1, -2));
            str = "selfie" + m12;
        } else if (i10 == 4) {
            string = LocaleController.getString(R.string.AttachPhoto);
            this.f42299h0.addView(tm0Var, w7.z5.n(-1, -2));
            str = "translation" + m12;
        } else if (i10 == 2) {
            TLRPC.SecureValueType secureValueType = this.F.type;
            if (!(secureValueType instanceof TLRPC.TL_secureValueTypePassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                string = LocaleController.getString(R.string.PassportFrontSide);
            } else {
                string = LocaleController.getString(R.string.PassportMainPage);
            }
            this.f42292e0.addView(tm0Var, w7.z5.n(-1, -2));
            str = "front" + m12;
        } else if (i10 == 3) {
            string = LocaleController.getString(R.string.PassportReverseSide);
            this.f42295f0.addView(tm0Var, w7.z5.n(-1, -2));
            str = "reverse" + m12;
        } else {
            string = LocaleController.getString(R.string.AttachPhoto);
            this.f42290d0.addView(tm0Var, w7.z5.n(-1, -2));
            str = "files" + m12;
        }
        if (str != null && (hashMap = this.f42335x1) != null && (formatDateForBan = (String) hashMap.get(str)) != null) {
            tm0Var.f41700b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21211p7, false));
            this.f42338y1.put(str, "");
        } else {
            formatDateForBan = LocaleController.formatDateForBan(secureDocument.secureFile.date);
        }
        tm0Var.f41699a.setText(string);
        tm0Var.f41700b.setText(formatDateForBan);
        org.telegram.ui.Components.w9 w9Var = tm0Var.f41701c;
        w9Var.getClass();
        w9Var.m(ImageLocation.getForSecureDocument(secureDocument), "48_48", null, null, null, null, 0, null);
        tm0Var.f41702f = secureDocument;
        tm0Var.a(false);
        tm0Var.setOnClickListener(new ai.n1(this, i10, 22));
        tm0Var.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                vm0 vm0Var = this;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vm0Var.getParentActivity());
                int i11 = i10;
                if (i11 == 1) {
                    alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.PassportDeleteSelfie);
                } else {
                    alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.PassportDeleteScan);
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ai.j6(vm0Var, secureDocument, i11, tm0Var, str, 4));
                vm0Var.showDialog(alertDialog$Builder.f20605a);
                return true;
            }
        });
    }

    public final void Q1() {
        ImageView imageView = this.I0;
        if (imageView != null) {
            TL_account.Password password = this.J;
            if (password != null && this.N0 == 0) {
                if (!password.has_password) {
                    this.G0.setVisibility(0);
                    this.I0.setVisibility(0);
                    this.J0.setVisibility(0);
                    this.K0.setVisibility(0);
                    this.L0.setVisibility(8);
                    this.Z[0].setVisibility(8);
                    this.L.setVisibility(8);
                    this.M0.setVisibility(8);
                    this.H0.setVisibility(8);
                    this.G0.setLayoutParams(w7.z5.k(0.0f, 25.0f, 0.0f, 0.0f, -1, -2));
                    this.F0.setVisibility(8);
                    return;
                }
                this.G0.setVisibility(0);
                this.I0.setVisibility(8);
                this.J0.setVisibility(8);
                this.K0.setVisibility(8);
                this.F0.setVisibility(8);
                this.L0.setVisibility(0);
                this.Z[0].setVisibility(0);
                this.L.setVisibility(0);
                this.M0.setVisibility(0);
                this.H0.setVisibility(0);
                this.G0.setLayoutParams(w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                if (this.Y != null) {
                    TL_account.Password password2 = this.J;
                    if (password2 != null && !TextUtils.isEmpty(password2.hint)) {
                        this.Y[0].setHint(this.J.hint);
                        return;
                    } else {
                        this.Y[0].setHint(LocaleController.getString(R.string.LoginPassword));
                        return;
                    }
                }
                return;
            }
            imageView.setVisibility(8);
            this.J0.setVisibility(8);
            this.K0.setVisibility(8);
            this.L0.setVisibility(8);
            this.Z[0].setVisibility(8);
            this.L.setVisibility(8);
            this.M0.setVisibility(8);
            this.H0.setVisibility(8);
            this.G0.setVisibility(8);
            this.F0.setVisibility(0);
        }
    }

    public final void R0(TLRPC.TL_secureFile tL_secureFile, int i10) {
        byte[] bArr = tL_secureFile.secret;
        byte[] bArr2 = tL_secureFile.file_hash;
        byte[] computeSHA512 = Utilities.computeSHA512(h1(bArr, bArr2), bArr2);
        byte[] bArr3 = new byte[32];
        System.arraycopy(computeSHA512, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(computeSHA512, 32, bArr4, 0, 16);
        Q0(new SecureDocument(new SecureDocumentKey(bArr3, bArr4), tL_secureFile, null, null, null), i10);
    }

    public final void R1(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vm0.R1(int):void");
    }

    public final void S0(ArrayList arrayList) {
        this.f42302i1.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i10);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                R0((TLRPC.TL_secureFile) secureFile, 0);
            }
        }
    }

    public final org.telegram.ui.um0 T0(android.content.Context r28, org.telegram.tgnet.TLRPC.TL_secureRequiredType r29, java.util.ArrayList r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vm0.T0(android.content.Context, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.util.ArrayList, boolean, boolean):org.telegram.ui.um0");
    }

    public final void U0(ArrayList arrayList) {
        this.f42306k1.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i10);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                R0((TLRPC.TL_secureFile) secureFile, 4);
            }
        }
    }

    public final void V0(boolean z10) {
        int i10;
        if (!this.f42298g1) {
            String str = this.f42309n;
            boolean isEmpty = TextUtils.isEmpty(str);
            int i11 = this.f42284b;
            if (!isEmpty) {
                if (z10) {
                    Activity parentActivity = getParentActivity();
                    pf.d.o(parentActivity, Uri.parse(str + "&tg_passport=success"), true, true);
                } else if (!this.f42296f1 && (i11 == 5 || i11 == 0)) {
                    Activity parentActivity2 = getParentActivity();
                    pf.d.o(parentActivity2, Uri.parse(str + "&tg_passport=cancel"), true, true);
                }
                this.f42298g1 = true;
            } else if (this.C1) {
                if (z10 || (!this.f42296f1 && (i11 == 5 || i11 == 0))) {
                    Activity parentActivity3 = getParentActivity();
                    if (z10) {
                        i10 = -1;
                    } else {
                        i10 = 0;
                    }
                    parentActivity3.setResult(i10);
                }
                this.f42298g1 = true;
            }
        }
    }

    public final boolean W0(boolean z10) {
        if (t1()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new kl0(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.DiscardChanges);
            String string = LocaleController.getString(R.string.PassportDiscardChanges);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
            b2Var.T = string;
            showDialog(b2Var);
            return true;
        }
        return true;
    }

    public final void X0(boolean z10) {
        String str;
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.f42282a0 != null) {
            String str2 = (String) this.Y0.get(this.v);
            String str3 = SharedConfig.getCountryLangs().get(this.v);
            int i10 = 0;
            if (this.E.native_names && !TextUtils.isEmpty(this.v) && !"EN".equals(str3)) {
                if (this.f42316q0.getVisibility() != 0) {
                    this.f42316q0.setVisibility(0);
                    this.f42303j0.setVisibility(0);
                    this.T.setVisibility(0);
                    int i11 = 0;
                    while (true) {
                        editTextBoldCursorArr = this.f42282a0;
                        if (i11 >= editTextBoldCursorArr.length) {
                            break;
                        }
                        ((View) editTextBoldCursorArr[i11].getParent()).setVisibility(0);
                        i11++;
                    }
                    if (editTextBoldCursorArr[0].length() == 0 && this.f42282a0[1].length() == 0 && this.f42282a0[2].length() == 0) {
                        int i12 = 0;
                        while (true) {
                            boolean[] zArr = this.f42324t0;
                            if (i12 >= zArr.length) {
                                break;
                            } else if (zArr[i12]) {
                                this.f42282a0[0].setText(this.Y[0].getText());
                                this.f42282a0[1].setText(this.Y[1].getText());
                                this.f42282a0[2].setText(this.Y[2].getText());
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    this.m0.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f20952b7));
                }
                this.f42316q0.setText(LocaleController.formatString("PassportNativeInfo", R.string.PassportNativeInfo, str2));
                if (str3 != null) {
                    str = LocaleController.getServerString("PassportLanguage_".concat(str3));
                } else {
                    str = null;
                }
                if (str != null) {
                    this.f42303j0.setText(LocaleController.formatString("PassportNativeHeaderLang", R.string.PassportNativeHeaderLang, str));
                } else {
                    this.f42303j0.setText(LocaleController.getString(R.string.PassportNativeHeader));
                }
                for (int i13 = 0; i13 < 3; i13++) {
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 == 2) {
                                if (str != null) {
                                    this.f42282a0[i13].setHintText(LocaleController.getString(R.string.PassportSurname));
                                } else {
                                    this.f42282a0[i13].setHintText(LocaleController.formatString("PassportSurnameCountry", R.string.PassportSurnameCountry, str2));
                                }
                            }
                        } else if (str != null) {
                            this.f42282a0[i13].setHintText(LocaleController.getString(R.string.PassportMidname));
                        } else {
                            this.f42282a0[i13].setHintText(LocaleController.formatString("PassportMidnameCountry", R.string.PassportMidnameCountry, str2));
                        }
                    } else if (str != null) {
                        this.f42282a0[i13].setHintText(LocaleController.getString(R.string.PassportName));
                    } else {
                        this.f42282a0[i13].setHintText(LocaleController.formatString("PassportNameCountry", R.string.PassportNameCountry, str2));
                    }
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new hl0(this, 2));
                }
            } else if (this.f42316q0.getVisibility() != 8) {
                this.f42316q0.setVisibility(8);
                this.f42303j0.setVisibility(8);
                this.T.setVisibility(8);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.f42282a0;
                    if (i10 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    ((View) editTextBoldCursorArr2[i10].getParent()).setVisibility(8);
                    i10++;
                }
                if (((this.f42287c != 0 || this.F == null) && this.H != null && !this.f42328v0) || this.I != null) {
                    this.m0.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f20952b7));
                } else {
                    this.m0.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20952b7));
                }
            }
        }
    }

    public final void Z0(boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        String str2;
        if (this.f42314p0 != null) {
            HashMap hashMap = this.f42332w1;
            HashMap hashMap2 = this.f42338y1;
            if (hashMap != null && ((z10 || hashMap2.containsKey("error_all")) && (str2 = (String) this.f42332w1.get("error_all")) != null)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
                if (z10) {
                    hashMap2.put("error_all", "");
                }
            } else {
                spannableStringBuilder = null;
            }
            if (this.f42335x1 != null && ((z10 || hashMap2.containsKey("error_document_all")) && (str = (String) this.f42335x1.get("error_all")) != null)) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(str);
                } else {
                    spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) str);
                }
                if (z10) {
                    hashMap2.put("error_document_all", "");
                }
            }
            if (spannableStringBuilder != null) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21211p7, false)), 0, spannableStringBuilder.length(), 33);
                this.f42314p0.setText(spannableStringBuilder);
                this.f42314p0.setVisibility(0);
            } else if (this.f42314p0.getVisibility() != 8) {
                this.f42314p0.setVisibility(8);
            }
        }
    }

    public final void a1(Context context) {
        long j10;
        String str;
        this.Y0 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.Y0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context);
        this.f42314p0 = d9Var;
        int i10 = R.drawable.greydivider_top;
        int i11 = org.telegram.ui.ActionBar.h6.f20952b7;
        d9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, i10, i11));
        this.f42314p0.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.f42288c0.addView(this.f42314p0, w7.z5.n(-1, -2));
        Z0(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        if (tL_secureRequiredType != null) {
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ActionBotDocumentRentalAgreement));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ActionBotDocumentBankStatement));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ActionBotDocumentUtilityBill));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ActionBotDocumentPassportRegistration));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ActionBotDocumentTemporaryRegistration));
            }
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
            this.f42303j0 = l4Var;
            l4Var.setText(LocaleController.getString(R.string.PassportDocuments));
            org.telegram.ui.Cells.l4 l4Var2 = this.f42303j0;
            int i12 = org.telegram.ui.ActionBar.h6.f20990d6;
            l4Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
            this.f42288c0.addView(this.f42303j0, w7.z5.n(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f42290d0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f42288c0.addView(this.f42290d0, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
            this.R = baVar;
            baVar.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(true));
            this.f42288c0.addView(this.R, w7.z5.n(-1, -2));
            this.R.setOnClickListener(new il0(this, 7));
            org.telegram.ui.Cells.d9 d9Var2 = new org.telegram.ui.Cells.d9(context);
            this.f42310n0 = d9Var2;
            d9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider, i11));
            if (this.f42287c != 0) {
                this.f42340z1 = LocaleController.getString(R.string.PassportAddAddressUploadInfo);
            } else {
                TLRPC.SecureValueType secureValueType2 = this.F.type;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                    this.f42340z1 = LocaleController.getString(R.string.PassportAddAgreementInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                    this.f42340z1 = LocaleController.getString(R.string.PassportAddBillInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                    this.f42340z1 = LocaleController.getString(R.string.PassportAddPassportRegistrationInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                    this.f42340z1 = LocaleController.getString(R.string.PassportAddTemporaryRegistrationInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                    this.f42340z1 = LocaleController.getString(R.string.PassportAddBankInfo);
                } else {
                    this.f42340z1 = "";
                }
            }
            String str2 = this.f42340z1;
            HashMap hashMap = this.f42335x1;
            j10 = 0;
            HashMap hashMap2 = this.f42338y1;
            String str3 = str2;
            if (hashMap != null) {
                String str4 = (String) hashMap.get("files_all");
                str3 = str2;
                if (str4 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                    spannableStringBuilder.append((CharSequence) this.f42340z1);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21211p7, false)), 0, str4.length(), 33);
                    hashMap2.put("files_all", "");
                    str3 = spannableStringBuilder;
                }
            }
            this.f42310n0.setText(str3);
            this.f42288c0.addView(this.f42310n0, w7.z5.n(-1, -2));
            if (this.F.translation_required) {
                org.telegram.ui.Cells.l4 l4Var3 = new org.telegram.ui.Cells.l4(context);
                this.f42303j0 = l4Var3;
                l4Var3.setText(LocaleController.getString(R.string.PassportTranslation));
                this.f42303j0.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                this.f42288c0.addView(this.f42303j0, w7.z5.n(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.f42299h0 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.f42288c0.addView(this.f42299h0, w7.z5.n(-1, -2));
                org.telegram.ui.Cells.ba baVar2 = new org.telegram.ui.Cells.ba(context);
                this.X = baVar2;
                baVar2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(true));
                this.f42288c0.addView(this.X, w7.z5.n(-1, -2));
                this.X.setOnClickListener(new il0(this, 8));
                org.telegram.ui.Cells.d9 d9Var3 = new org.telegram.ui.Cells.d9(context);
                this.f42312o0 = d9Var3;
                d9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider, i11));
                if (this.f42287c != 0) {
                    this.A1 = LocaleController.getString(R.string.PassportAddTranslationUploadInfo);
                } else {
                    TLRPC.SecureValueType secureValueType3 = this.F.type;
                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                        this.A1 = LocaleController.getString(R.string.PassportAddTranslationAgreementInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                        this.A1 = LocaleController.getString(R.string.PassportAddTranslationBillInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                        this.A1 = LocaleController.getString(R.string.PassportAddTranslationPassportRegistrationInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                        this.A1 = LocaleController.getString(R.string.PassportAddTranslationTemporaryRegistrationInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                        this.A1 = LocaleController.getString(R.string.PassportAddTranslationBankInfo);
                    } else {
                        this.A1 = "";
                    }
                }
                String str5 = this.A1;
                HashMap hashMap3 = this.f42335x1;
                String str6 = str5;
                if (hashMap3 != null) {
                    String str7 = (String) hashMap3.get("translation_all");
                    str6 = str5;
                    if (str7 != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str7);
                        spannableStringBuilder2.append((CharSequence) "\n\n");
                        spannableStringBuilder2.append((CharSequence) this.A1);
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21211p7, false)), 0, str7.length(), 33);
                        hashMap2.put("translation_all", "");
                        str6 = spannableStringBuilder2;
                    }
                }
                this.f42312o0.setText(str6);
                this.f42288c0.addView(this.f42312o0, w7.z5.n(-1, -2));
            }
        } else {
            j10 = 0;
            this.actionBar.setTitle(LocaleController.getString(R.string.PassportAddress));
        }
        org.telegram.ui.Cells.l4 l4Var4 = new org.telegram.ui.Cells.l4(context);
        this.f42303j0 = l4Var4;
        l4Var4.setText(LocaleController.getString(R.string.PassportAddressHeader));
        this.f42303j0.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false));
        this.f42288c0.addView(this.f42303j0, w7.z5.n(-1, -2));
        this.Y = new EditTextBoldCursor[6];
        for (int i13 = 0; i13 < 6; i13++) {
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.Y[i13] = editTextBoldCursor;
            ql0 ql0Var = new ql0(context, editTextBoldCursor, 0);
            ql0Var.setWillNotDraw(false);
            this.f42288c0.addView(ql0Var, w7.z5.n(-1, -2));
            int i14 = org.telegram.ui.ActionBar.h6.f20990d6;
            ql0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
            int i15 = 5;
            if (i13 == 5) {
                View view = new View(context);
                this.S = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
                this.f42288c0.addView(this.S, w7.z5.n(-1, 6));
            }
            if (this.f42328v0 && this.F != null) {
                ql0Var.setVisibility(8);
                View view2 = this.S;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            this.Y[i13].setTag(Integer.valueOf(i13));
            this.Y[i13].setSupportRtlHint(true);
            this.Y[i13].setTextSize(1, 16.0f);
            this.Y[i13].setHintColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.H6, false));
            this.Y[i13].setHeaderHintColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L6, false));
            this.Y[i13].setTransformHintToHeader(true);
            EditTextBoldCursor editTextBoldCursor2 = this.Y[i13];
            int i16 = org.telegram.ui.ActionBar.h6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
            this.Y[i13].setBackgroundDrawable(null);
            this.Y[i13].setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
            this.Y[i13].setCursorSize(AndroidUtilities.dp(20.0f));
            this.Y[i13].setCursorWidth(1.5f);
            this.Y[i13].setLineColors(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21117k6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21134l6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21211p7, false));
            if (i13 == 5) {
                this.Y[i13].setOnTouchListener(new jl0(this, 2));
                this.Y[i13].setInputType(0);
                this.Y[i13].setFocusable(false);
            } else {
                this.Y[i13].setInputType(16385);
                this.Y[i13].setImeOptions(268435461);
            }
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 != 4) {
                                if (i13 == 5) {
                                    this.Y[i13].setHintText(LocaleController.getString(R.string.PassportCountry));
                                    str = "country_code";
                                }
                            } else {
                                this.Y[i13].setHintText(LocaleController.getString(R.string.PassportState));
                                str = "state";
                            }
                        } else {
                            this.Y[i13].setHintText(LocaleController.getString(R.string.PassportCity));
                            str = "city";
                        }
                    } else {
                        this.Y[i13].setHintText(LocaleController.getString(R.string.PassportPostcode));
                        str = "post_code";
                    }
                } else {
                    this.Y[i13].setHintText(LocaleController.getString(R.string.PassportStreet2));
                    str = "street_line2";
                }
            } else {
                this.Y[i13].setHintText(LocaleController.getString(R.string.PassportStreet1));
                str = "street_line1";
            }
            I1(this.f42323s1, this.Y[i13], str);
            if (i13 == 2) {
                this.Y[i13].addTextChangedListener(new rl0(this, editTextBoldCursor, str));
                this.Y[i13].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            } else {
                this.Y[i13].addTextChangedListener(new sl0(this, editTextBoldCursor, str, 0));
            }
            EditTextBoldCursor editTextBoldCursor3 = this.Y[i13];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.Y[i13].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.Y[i13];
            if (!LocaleController.isRTL) {
                i15 = 3;
            }
            editTextBoldCursor4.setGravity(i15 | 16);
            ql0Var.addView(this.Y[i13], w7.z5.d(-1, 64.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
            this.Y[i13].setOnEditorActionListener(new gl0(this, 4));
        }
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
        this.f42307l0 = z6Var;
        this.f42288c0.addView(z6Var, w7.z5.n(-1, -2));
        if (this.f42328v0 && this.F != null) {
            this.f42303j0.setVisibility(8);
            this.f42307l0.setVisibility(8);
        }
        int i17 = (this.f42287c > j10 ? 1 : (this.f42287c == j10 ? 0 : -1));
        TLRPC.TL_secureValue tL_secureValue = this.I;
        if (((i17 != 0 || this.F == null) && this.H != null && !this.f42328v0) || tL_secureValue != null) {
            if (tL_secureValue != null) {
                S0(tL_secureValue.files);
                U0(tL_secureValue.translation);
            }
            org.telegram.ui.Cells.z6 z6Var2 = this.f42307l0;
            int i18 = R.drawable.greydivider;
            int i19 = org.telegram.ui.ActionBar.h6.f20952b7;
            z6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, i18, i19));
            org.telegram.ui.Cells.ba baVar3 = new org.telegram.ui.Cells.ba(context);
            baVar3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21211p7, false));
            baVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(true));
            if (this.F == null) {
                baVar3.b(LocaleController.getString(R.string.PassportDeleteInfo), false);
            } else {
                baVar3.b(LocaleController.getString(R.string.PassportDeleteDocument), false);
            }
            this.f42288c0.addView(baVar3, w7.z5.n(-1, -2));
            baVar3.setOnClickListener(new il0(this, 9));
            org.telegram.ui.Cells.z6 z6Var3 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
            this.f42307l0 = z6Var3;
            z6Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, i19));
            this.f42288c0.addView(this.f42307l0, w7.z5.n(-1, -2));
        } else {
            org.telegram.ui.Cells.z6 z6Var4 = this.f42307l0;
            int i20 = R.drawable.greydivider_bottom;
            int i21 = org.telegram.ui.ActionBar.h6.f20952b7;
            z6Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, i20, i21));
            if (this.f42328v0 && this.F != null) {
                this.f42310n0.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, i21));
            }
        }
        R1(0);
        R1(4);
    }

    public final void b1() {
        if (getParentActivity() != null && this.R0 == null) {
            org.telegram.ui.Components.ti tiVar = new org.telegram.ui.Components.ti(getParentActivity(), this, false, false);
            this.R0 = tiVar;
            tiVar.f30538c2 = new bm0(this);
        }
    }

    public final void c1() {
        int dp;
        int dp2;
        boolean[] zArr = {true};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new xu(26, this, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
        b2Var.R = string;
        boolean z10 = this.f42328v0;
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.E;
        if (z10 && this.F == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeAddress)) {
            b2Var.T = LocaleController.getString(R.string.PassportDeleteAddressAlert);
        } else if (z10 && this.F == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            b2Var.T = LocaleController.getString(R.string.PassportDeletePersonalAlert);
        } else {
            b2Var.T = LocaleController.getString(R.string.PassportDeleteDocumentAlert);
        }
        if (!this.f42328v0 && this.F != null) {
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(getParentActivity(), 1);
            a2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(false));
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                a2Var.e(LocaleController.getString(R.string.PassportDeleteDocumentAddress), "", true, false, false);
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                a2Var.e(LocaleController.getString(R.string.PassportDeleteDocumentPersonal), "", true, false, false);
            }
            if (LocaleController.isRTL) {
                dp = AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(8.0f);
            }
            if (LocaleController.isRTL) {
                dp2 = AndroidUtilities.dp(8.0f);
            } else {
                dp2 = AndroidUtilities.dp(16.0f);
            }
            a2Var.setPadding(dp, 0, dp2, 0);
            frameLayout.addView(a2Var, w7.z5.e(-1, 48, 51));
            a2Var.setOnClickListener(new o8(4, zArr));
            alertDialog$Builder.n(frameLayout);
        }
        showDialog(b2Var);
    }

    @Override
    public final android.view.View createView(android.content.Context r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vm0.createView(android.content.Context):android.view.View");
    }

    public final void d1(Context context) {
        long j10;
        int i10;
        String str;
        int i11;
        String str2;
        this.Y0 = new HashMap();
        ?? r42 = 1;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.Y0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context);
        this.f42314p0 = d9Var;
        int i12 = R.drawable.greydivider_top;
        int i13 = org.telegram.ui.ActionBar.h6.f20952b7;
        d9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, i12, i13));
        boolean z10 = false;
        this.f42314p0.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        int i14 = -1;
        this.f42288c0.addView(this.f42314p0, w7.z5.n(-1, -2));
        Z0(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.E;
        if (tL_secureRequiredType != null) {
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
            this.f42303j0 = l4Var;
            if (this.f42328v0) {
                l4Var.setText(LocaleController.getString(R.string.PassportDocuments));
            } else {
                l4Var.setText(LocaleController.getString(R.string.PassportRequiredDocuments));
            }
            org.telegram.ui.Cells.l4 l4Var2 = this.f42303j0;
            int i15 = org.telegram.ui.ActionBar.h6.f20990d6;
            l4Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
            this.f42288c0.addView(this.f42303j0, w7.z5.n(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f42292e0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f42288c0.addView(this.f42292e0, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.c9 c9Var = new org.telegram.ui.Cells.c9(context);
            this.U = c9Var;
            c9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(true));
            this.f42288c0.addView(this.U, w7.z5.n(-1, -2));
            this.U.setOnClickListener(new il0(this, 0));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.f42295f0 = linearLayout2;
            linearLayout2.setOrientation(1);
            this.f42288c0.addView(this.f42295f0, w7.z5.n(-1, -2));
            boolean z11 = this.F.selfie_required;
            org.telegram.ui.Cells.c9 c9Var2 = new org.telegram.ui.Cells.c9(context);
            this.V = c9Var2;
            c9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(true));
            j10 = 0;
            this.V.a(LocaleController.getString(R.string.PassportReverseSide), LocaleController.getString(R.string.PassportReverseSideInfo), z11);
            this.f42288c0.addView(this.V, w7.z5.n(-1, -2));
            this.V.setOnClickListener(new il0(this, 2));
            if (this.F.selfie_required) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.f42297g0 = linearLayout3;
                linearLayout3.setOrientation(1);
                this.f42288c0.addView(this.f42297g0, w7.z5.n(-1, -2));
                org.telegram.ui.Cells.c9 c9Var3 = new org.telegram.ui.Cells.c9(context);
                this.W = c9Var3;
                c9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(true));
                this.W.a(LocaleController.getString(R.string.PassportSelfie), LocaleController.getString(R.string.PassportSelfieInfo), tL_secureRequiredType2.translation_required);
                this.f42288c0.addView(this.W, w7.z5.n(-1, -2));
                this.W.setOnClickListener(new il0(this, 3));
            }
            org.telegram.ui.Cells.d9 d9Var2 = new org.telegram.ui.Cells.d9(context);
            this.f42310n0 = d9Var2;
            d9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider, i13));
            this.f42310n0.setText(LocaleController.getString(R.string.PassportPersonalUploadInfo));
            this.f42288c0.addView(this.f42310n0, w7.z5.n(-1, -2));
            if (this.F.translation_required) {
                org.telegram.ui.Cells.l4 l4Var3 = new org.telegram.ui.Cells.l4(context);
                this.f42303j0 = l4Var3;
                l4Var3.setText(LocaleController.getString(R.string.PassportTranslation));
                this.f42303j0.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
                this.f42288c0.addView(this.f42303j0, w7.z5.n(-1, -2));
                LinearLayout linearLayout4 = new LinearLayout(context);
                this.f42299h0 = linearLayout4;
                linearLayout4.setOrientation(1);
                this.f42288c0.addView(this.f42299h0, w7.z5.n(-1, -2));
                org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
                this.X = baVar;
                baVar.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(true));
                this.f42288c0.addView(this.X, w7.z5.n(-1, -2));
                this.X.setOnClickListener(new il0(this, 4));
                org.telegram.ui.Cells.d9 d9Var3 = new org.telegram.ui.Cells.d9(context);
                this.f42312o0 = d9Var3;
                d9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider, i13));
                if (this.f42287c != 0) {
                    this.A1 = LocaleController.getString(R.string.PassportAddTranslationUploadInfo);
                } else {
                    TLRPC.SecureValueType secureValueType = this.F.type;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
                        this.A1 = LocaleController.getString(R.string.PassportAddPassportInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                        this.A1 = LocaleController.getString(R.string.PassportAddInternalPassportInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                        this.A1 = LocaleController.getString(R.string.PassportAddIdentityCardInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                        this.A1 = LocaleController.getString(R.string.PassportAddDriverLicenceInfo);
                    } else {
                        this.A1 = "";
                    }
                }
                String str3 = this.A1;
                HashMap hashMap = this.f42335x1;
                String str4 = str3;
                if (hashMap != null) {
                    String str5 = (String) hashMap.get("translation_all");
                    str4 = str3;
                    if (str5 != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str5);
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) this.A1);
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21211p7, false)), 0, str5.length(), 33);
                        this.f42338y1.put("translation_all", "");
                        str4 = spannableStringBuilder;
                    }
                }
                this.f42312o0.setText(str4);
                this.f42288c0.addView(this.f42312o0, w7.z5.n(-1, -2));
            }
        } else {
            j10 = 0;
            org.telegram.ui.Cells.ba baVar2 = new org.telegram.ui.Cells.ba(context);
            this.f42319r0 = baVar2;
            baVar2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(true));
            this.f42319r0.b(LocaleController.getString(R.string.PassportScanPassport), false);
            this.f42288c0.addView(this.f42319r0, w7.z5.n(-1, -2));
            this.f42319r0.setOnClickListener(new il0(this, 5));
            org.telegram.ui.Cells.d9 d9Var4 = new org.telegram.ui.Cells.d9(context);
            this.f42310n0 = d9Var4;
            d9Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider, i13));
            this.f42310n0.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            this.f42288c0.addView(this.f42310n0, w7.z5.n(-1, -2));
        }
        org.telegram.ui.Cells.l4 l4Var4 = new org.telegram.ui.Cells.l4(context);
        this.f42303j0 = l4Var4;
        if (this.f42328v0) {
            l4Var4.setText(LocaleController.getString(R.string.PassportDocument));
        } else {
            l4Var4.setText(LocaleController.getString(R.string.PassportPersonal));
        }
        this.f42303j0.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false));
        this.f42288c0.addView(this.f42303j0, w7.z5.n(-1, -2));
        int i16 = 7;
        if (this.F != null) {
            i10 = 9;
        } else {
            i10 = 7;
        }
        this.Y = new EditTextBoldCursor[i10];
        int i17 = 0;
        while (true) {
            HashMap hashMap2 = this.f42323s1;
            if (i17 < i10) {
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.Y[i17] = editTextBoldCursor;
                ql0 ql0Var = new ql0(context, editTextBoldCursor, 1);
                ql0Var.setWillNotDraw(z10);
                this.f42288c0.addView(ql0Var, w7.z5.n(i14, 64));
                int i18 = org.telegram.ui.ActionBar.h6.f20990d6;
                ql0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i18, z10));
                if (i17 == i10 - 1) {
                    View view = new View(context);
                    this.S = view;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i18, z10));
                    this.f42288c0.addView(this.S, w7.z5.n(i14, 6));
                }
                if (this.f42328v0 && this.F != null && i17 < i16) {
                    ql0Var.setVisibility(8);
                    View view2 = this.S;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                }
                this.Y[i17].setTag(Integer.valueOf(i17));
                this.Y[i17].setSupportRtlHint(r42);
                this.Y[i17].setTextSize(r42, 16.0f);
                this.Y[i17].setHintColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.H6, false));
                EditTextBoldCursor editTextBoldCursor2 = this.Y[i17];
                int i19 = org.telegram.ui.ActionBar.h6.G6;
                editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i19, false));
                this.Y[i17].setHeaderHintColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L6, false));
                this.Y[i17].setTransformHintToHeader(r42);
                this.Y[i17].setBackgroundDrawable(null);
                this.Y[i17].setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i19, false));
                this.Y[i17].setCursorSize(AndroidUtilities.dp(20.0f));
                this.Y[i17].setCursorWidth(1.5f);
                this.Y[i17].setLineColors(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21117k6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21134l6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21211p7, false));
                int i20 = 5;
                if (i17 != 5 && i17 != 6) {
                    if (i17 != 3 && i17 != 8) {
                        if (i17 == 4) {
                            this.Y[i17].setOnTouchListener(new jl0(this, 1));
                            this.Y[i17].setInputType(0);
                            this.Y[i17].setFocusable(false);
                        } else {
                            this.Y[i17].setInputType(16385);
                            this.Y[i17].setImeOptions(268435461);
                        }
                    } else {
                        this.Y[i17].setOnTouchListener(new ei.p1(7, this, context));
                        this.Y[i17].setInputType(0);
                        this.Y[i17].setFocusable(false);
                    }
                } else {
                    this.Y[i17].setOnTouchListener(new jl0(this, 0));
                    this.Y[i17].setInputType(0);
                }
                HashMap hashMap3 = this.f42325t1;
                switch (i17) {
                    case 0:
                        if (tL_secureRequiredType2.native_names) {
                            this.Y[i17].setHintText(LocaleController.getString(R.string.PassportNameLatin));
                        } else {
                            this.Y[i17].setHintText(LocaleController.getString(R.string.PassportName));
                        }
                        str2 = "first_name";
                        break;
                    case 1:
                        if (tL_secureRequiredType2.native_names) {
                            this.Y[i17].setHintText(LocaleController.getString(R.string.PassportMidnameLatin));
                        } else {
                            this.Y[i17].setHintText(LocaleController.getString(R.string.PassportMidname));
                        }
                        str2 = "middle_name";
                        break;
                    case 2:
                        if (tL_secureRequiredType2.native_names) {
                            this.Y[i17].setHintText(LocaleController.getString(R.string.PassportSurnameLatin));
                        } else {
                            this.Y[i17].setHintText(LocaleController.getString(R.string.PassportSurname));
                        }
                        str2 = "last_name";
                        break;
                    case 3:
                        this.Y[i17].setHintText(LocaleController.getString(R.string.PassportBirthdate));
                        str2 = "birth_date";
                        break;
                    case 4:
                        this.Y[i17].setHintText(LocaleController.getString(R.string.PassportGender));
                        str2 = "gender";
                        break;
                    case 5:
                        this.Y[i17].setHintText(LocaleController.getString(R.string.PassportCitizenship));
                        str2 = "country_code";
                        break;
                    case 6:
                        this.Y[i17].setHintText(LocaleController.getString(R.string.PassportResidence));
                        str2 = "residence_country_code";
                        break;
                    case 7:
                        this.Y[i17].setHintText(LocaleController.getString(R.string.PassportDocumentNumber));
                        str2 = "document_no";
                        hashMap2 = hashMap3;
                        break;
                    case 8:
                        this.Y[i17].setHintText(LocaleController.getString(R.string.PassportExpired));
                        str2 = "expiry_date";
                        hashMap2 = hashMap3;
                        break;
                    default:
                        i17++;
                        r42 = 1;
                        i16 = 7;
                        z10 = false;
                        i14 = -1;
                }
                I1(hashMap2, this.Y[i17], str2);
                EditTextBoldCursor editTextBoldCursor3 = this.Y[i17];
                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                if (i17 != 0 && i17 != 2 && i17 != 1) {
                    this.Y[i17].addTextChangedListener(new org.telegram.ui.Components.ey0(this, editTextBoldCursor, str2, hashMap2));
                } else {
                    this.Y[i17].addTextChangedListener(new ul0(this, editTextBoldCursor, str2));
                }
                this.Y[i17].setPadding(0, 0, 0, 0);
                EditTextBoldCursor editTextBoldCursor4 = this.Y[i17];
                if (!LocaleController.isRTL) {
                    i20 = 3;
                }
                editTextBoldCursor4.setGravity(i20 | 16);
                ql0Var.addView(this.Y[i17], w7.z5.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                this.Y[i17].setOnEditorActionListener(new gl0(this, 1));
                i17++;
                r42 = 1;
                i16 = 7;
                z10 = false;
                i14 = -1;
            } else {
                org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                this.m0 = z6Var;
                this.f42288c0.addView(z6Var, w7.z5.n(-1, -2));
                org.telegram.ui.Cells.l4 l4Var5 = new org.telegram.ui.Cells.l4(context);
                this.f42303j0 = l4Var5;
                l4Var5.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false));
                this.f42288c0.addView(this.f42303j0, w7.z5.n(-1, -2));
                this.f42282a0 = new EditTextBoldCursor[3];
                int i21 = 0;
                for (int i22 = 3; i21 < i22; i22 = 3) {
                    EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
                    this.f42282a0[i21] = editTextBoldCursor5;
                    ql0 ql0Var2 = new ql0(context, editTextBoldCursor5, 2);
                    ql0Var2.setWillNotDraw(false);
                    this.f42288c0.addView(ql0Var2, w7.z5.n(-1, 64));
                    int i23 = org.telegram.ui.ActionBar.h6.f20990d6;
                    ql0Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i23, false));
                    if (i21 == 2) {
                        View view3 = new View(context);
                        this.T = view3;
                        view3.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i23, false));
                        this.f42288c0.addView(this.T, w7.z5.n(-1, 6));
                    }
                    this.f42282a0[i21].setTag(Integer.valueOf(i21));
                    this.f42282a0[i21].setSupportRtlHint(true);
                    this.f42282a0[i21].setTextSize(1, 16.0f);
                    this.f42282a0[i21].setHintColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.H6, false));
                    EditTextBoldCursor editTextBoldCursor6 = this.f42282a0[i21];
                    int i24 = org.telegram.ui.ActionBar.h6.G6;
                    editTextBoldCursor6.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i24, false));
                    this.f42282a0[i21].setHeaderHintColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L6, false));
                    this.f42282a0[i21].setTransformHintToHeader(true);
                    this.f42282a0[i21].setBackgroundDrawable(null);
                    this.f42282a0[i21].setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i24, false));
                    this.f42282a0[i21].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.f42282a0[i21].setCursorWidth(1.5f);
                    this.f42282a0[i21].setLineColors(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21117k6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21134l6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21211p7, false));
                    this.f42282a0[i21].setInputType(16385);
                    this.f42282a0[i21].setImeOptions(268435461);
                    if (i21 != 0) {
                        if (i21 != 1) {
                            if (i21 == 2) {
                                str = "last_name_native";
                            } else {
                                i21++;
                            }
                        } else {
                            str = "middle_name_native";
                        }
                    } else {
                        str = "first_name_native";
                    }
                    I1(hashMap2, this.f42282a0[i21], str);
                    EditTextBoldCursor editTextBoldCursor7 = this.f42282a0[i21];
                    editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
                    if (i21 == 0 || i21 == 2 || i21 == 1) {
                        this.f42282a0[i21].addTextChangedListener(new sl0(this, editTextBoldCursor5, str, 1));
                    }
                    this.f42282a0[i21].setPadding(0, 0, 0, 0);
                    EditTextBoldCursor editTextBoldCursor8 = this.f42282a0[i21];
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    editTextBoldCursor8.setGravity(i11 | 16);
                    ql0Var2.addView(this.f42282a0[i21], w7.z5.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.f42282a0[i21].setOnEditorActionListener(new gl0(this, 2));
                    i21++;
                }
                org.telegram.ui.Cells.d9 d9Var5 = new org.telegram.ui.Cells.d9(context);
                this.f42316q0 = d9Var5;
                this.f42288c0.addView(d9Var5, w7.z5.n(-1, -2));
                int i25 = (this.f42287c > j10 ? 1 : (this.f42287c == j10 ? 0 : -1));
                TLRPC.TL_secureValue tL_secureValue = this.I;
                if (((i25 != 0 || this.F == null) && this.H != null && !this.f42328v0) || tL_secureValue != null) {
                    if (tL_secureValue != null) {
                        S0(tL_secureValue.files);
                        TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                        if (secureFile instanceof TLRPC.TL_secureFile) {
                            R0((TLRPC.TL_secureFile) secureFile, 2);
                        }
                        TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                        if (secureFile2 instanceof TLRPC.TL_secureFile) {
                            R0((TLRPC.TL_secureFile) secureFile2, 3);
                        }
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            R0((TLRPC.TL_secureFile) secureFile3, 1);
                        }
                        U0(tL_secureValue.translation);
                    }
                    org.telegram.ui.Cells.ba baVar3 = new org.telegram.ui.Cells.ba(context);
                    baVar3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21211p7, false));
                    baVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(true));
                    if (this.F == null) {
                        baVar3.b(LocaleController.getString(R.string.PassportDeleteInfo), false);
                    } else {
                        baVar3.b(LocaleController.getString(R.string.PassportDeleteDocument), false);
                    }
                    this.f42288c0.addView(baVar3, w7.z5.n(-1, -2));
                    baVar3.setOnClickListener(new il0(this, 1));
                    org.telegram.ui.Cells.d9 d9Var6 = this.f42316q0;
                    int i26 = R.drawable.greydivider;
                    int i27 = org.telegram.ui.ActionBar.h6.f20952b7;
                    d9Var6.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, i26, i27));
                    org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                    this.f42307l0 = z6Var2;
                    z6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, i27));
                    this.f42288c0.addView(this.f42307l0, w7.z5.n(-1, -2));
                } else {
                    this.f42316q0.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20952b7));
                }
                O1();
                X0(false);
                return;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        EditTextBoldCursor editTextBoldCursor;
        tm0 tm0Var;
        org.telegram.ui.ActionBar.u0 u0Var;
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            HashMap hashMap = this.f42313o1;
            SecureDocument secureDocument = (SecureDocument) hashMap.get(str);
            if (secureDocument != null) {
                secureDocument.inputFile = (TLRPC.TL_inputFile) objArr[1];
                hashMap.remove(str);
                if (hashMap.isEmpty() && (u0Var = this.L) != null) {
                    u0Var.setEnabled(true);
                    this.L.setAlpha(1.0f);
                }
                HashMap hashMap2 = this.f42311n1;
                if (hashMap2 != null && (tm0Var = (tm0) hashMap2.get(secureDocument)) != null) {
                    tm0Var.a(true);
                }
                HashMap hashMap3 = this.f42338y1;
                if (hashMap3 != null && hashMap3.containsKey("error_document_all")) {
                    hashMap3.remove("error_document_all");
                    Z0(false);
                }
                int i12 = secureDocument.type;
                if (i12 == 0) {
                    if (this.f42310n0 != null && !TextUtils.isEmpty(this.f42340z1)) {
                        this.f42310n0.setText(this.f42340z1);
                    }
                    hashMap3.remove("files_all");
                } else if (i12 == 4) {
                    if (this.f42312o0 != null && !TextUtils.isEmpty(this.A1)) {
                        this.f42312o0.setText(this.A1);
                    }
                    hashMap3.remove("translation_all");
                }
            }
        } else if (i10 != NotificationCenter.fileUploadFailed && i10 == NotificationCenter.twoStepPasswordChanged) {
            if (objArr != null && objArr.length > 0) {
                Object obj = objArr[7];
                if (obj != null && (editTextBoldCursor = this.Y[0]) != null) {
                    editTextBoldCursor.setText((String) obj);
                }
                if (objArr[6] == null) {
                    TL_account.TL_password tL_password = new TL_account.TL_password();
                    this.J = tL_password;
                    tL_password.current_algo = (TLRPC.PasswordKdfAlgo) objArr[1];
                    tL_password.new_secure_algo = (TLRPC.SecurePasswordKdfAlgo) objArr[2];
                    tL_password.secure_random = (byte[]) objArr[3];
                    tL_password.has_recovery = !TextUtils.isEmpty((String) objArr[4]);
                    TL_account.Password password = this.J;
                    password.hint = (String) objArr[5];
                    password.srp_id = -1L;
                    byte[] bArr = new byte[256];
                    password.srp_B = bArr;
                    Utilities.random.nextBytes(bArr);
                    EditTextBoldCursor editTextBoldCursor2 = this.Y[0];
                    if (editTextBoldCursor2 != null && editTextBoldCursor2.length() > 0) {
                        this.N0 = 2;
                    }
                }
            } else {
                this.J = null;
                v1();
            }
            Q1();
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.ti tiVar = this.R0;
        if (tiVar != null && this.visibleDialog == tiVar) {
            tiVar.f30558j0.a0(false);
            this.R0.dismissInternal();
            this.R0.f30558j0.d0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.R0 && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    public final void e1(android.content.Context r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vm0.e1(android.content.Context):void");
    }

    public final void f1(Context context) {
        String str;
        ViewGroup frameLayout;
        this.actionBar.setTitle(LocaleController.getString(R.string.PassportPhone));
        this.Y0 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.U0.add(0, split[2]);
                this.V0.put(split[2], split[0]);
                this.W0.put(split[0], split[2]);
                if (split.length > 3) {
                    this.X0.put(split[0], split[3]);
                }
                this.Y0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        Collections.sort(this.U0, new jg0(16));
        String str2 = UserConfig.getInstance(this.currentAccount).getCurrentUser().phone;
        org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
        String str3 = null;
        baVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false));
        baVar.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(true));
        baVar.b(LocaleController.formatString("PassportPhoneUseSame", R.string.PassportPhoneUseSame, jf.b.c().b("+" + str2)), false);
        this.f42288c0.addView(baVar, w7.z5.n(-1, -2));
        baVar.setOnClickListener(new il0(this, 16));
        org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context);
        this.f42310n0 = d9Var;
        d9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20952b7));
        this.f42310n0.setText(LocaleController.getString(R.string.PassportPhoneUseSameInfo));
        this.f42288c0.addView(this.f42310n0, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        this.f42303j0 = l4Var;
        l4Var.setText(LocaleController.getString(R.string.PassportPhoneUseOther));
        this.f42303j0.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false));
        this.f42288c0.addView(this.f42303j0, w7.z5.n(-1, -2));
        this.Y = new EditTextBoldCursor[3];
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 2) {
                this.Y[i10] = new org.telegram.ui.Components.o40(context);
            } else {
                this.Y[i10] = new EditTextBoldCursor(context);
            }
            if (i10 == 1) {
                frameLayout = org.telegram.messenger.mk.e(context, 0);
                this.f42288c0.addView(frameLayout, w7.z5.n(-1, 50));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false));
            } else if (i10 == 2) {
                frameLayout = (ViewGroup) this.Y[1].getParent();
            } else {
                frameLayout = new FrameLayout(context);
                this.f42288c0.addView(frameLayout, w7.z5.n(-1, 50));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false));
            }
            this.Y[i10].setTag(Integer.valueOf(i10));
            this.Y[i10].setTextSize(1, 16.0f);
            this.Y[i10].setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.Y[i10];
            int i11 = org.telegram.ui.ActionBar.h6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            this.Y[i10].setBackgroundDrawable(null);
            this.Y[i10].setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            this.Y[i10].setCursorSize(AndroidUtilities.dp(20.0f));
            this.Y[i10].setCursorWidth(1.5f);
            if (i10 == 0) {
                this.Y[i10].setOnTouchListener(new jl0(this, 3));
                this.Y[i10].setText(LocaleController.getString(R.string.ChooseCountry));
                this.Y[i10].setInputType(0);
                this.Y[i10].setFocusable(false);
            } else {
                this.Y[i10].setInputType(3);
                if (i10 == 2) {
                    this.Y[i10].setImeOptions(268435462);
                } else {
                    this.Y[i10].setImeOptions(268435461);
                }
            }
            EditTextBoldCursor editTextBoldCursor2 = this.Y[i10];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            int i12 = 5;
            if (i10 == 1) {
                TextView textView = new TextView(context);
                this.f42331w0 = textView;
                textView.setText("+");
                this.f42331w0.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                this.f42331w0.setTextSize(1, 16.0f);
                frameLayout.addView(this.f42331w0, w7.z5.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                this.Y[i10].setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
                this.Y[i10].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                this.Y[i10].setGravity(19);
                frameLayout.addView(this.Y[i10], w7.z5.k(0.0f, 12.0f, 16.0f, 6.0f, 55, -2));
                this.Y[i10].addTextChangedListener(new jm0(this));
            } else if (i10 == 2) {
                this.Y[i10].setPadding(0, 0, 0, 0);
                this.Y[i10].setGravity(19);
                this.Y[i10].setHintText(null);
                this.Y[i10].setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                frameLayout.addView(this.Y[i10], w7.z5.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                this.Y[i10].addTextChangedListener(new pr(this, 3));
            } else {
                this.Y[i10].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                EditTextBoldCursor editTextBoldCursor3 = this.Y[i10];
                if (!LocaleController.isRTL) {
                    i12 = 3;
                }
                editTextBoldCursor3.setGravity(i12);
                frameLayout.addView(this.Y[i10], w7.z5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            }
            this.Y[i10].setOnEditorActionListener(new gl0(this, 0));
            if (i10 == 2) {
                this.Y[i10].setOnKeyListener(new lg(this, 1));
            }
            if (i10 == 0) {
                View view = new View(context);
                this.f42305k0.add(view);
                view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20991d7, false));
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
            }
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (telephonyManager != null) {
                str3 = telephonyManager.getSimCountryIso().toUpperCase();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (str3 != null && (str = (String) this.Y0.get(str3)) != null && this.U0.indexOf(str) != -1) {
            this.Y[1].setText((CharSequence) this.V0.get(str));
        }
        org.telegram.ui.Cells.d9 d9Var2 = new org.telegram.ui.Cells.d9(context);
        this.f42310n0 = d9Var2;
        d9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20952b7));
        this.f42310n0.setText(LocaleController.getString(R.string.PassportPhoneUploadInfo));
        this.f42288c0.addView(this.f42310n0, w7.z5.n(-1, -2));
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20932a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f21269s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42285b0, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21325v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21288t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.h6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.D8));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42288c0, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21111k0, null, null, org.telegram.ui.ActionBar.h6.f20991d7));
        View view = this.S;
        int i12 = org.telegram.ui.ActionBar.h6.f20990d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i12));
        View view2 = this.T;
        if (view2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(view2, 1, null, null, null, null, i12));
        }
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = this.f42305k0;
            if (i13 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.j6((View) arrayList2.get(i13), 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20991d7));
            i13++;
        }
        for (Map.Entry entry : this.f42311n1.entrySet()) {
            tm0 tm0Var = (tm0) entry.getValue();
            arrayList.add(new org.telegram.ui.ActionBar.j6(tm0Var, 268435456, new Class[]{tm0.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20990d6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(tm0Var, 0, new Class[]{tm0.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(tm0Var, 0, new Class[]{tm0.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21395z6));
        }
        int i14 = org.telegram.ui.ActionBar.h6.f20990d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42288c0, 268435456, new Class[]{org.telegram.ui.Cells.c9.class}, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42288c0, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"textView"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.h6.f21395z6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42288c0, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"valueTextView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42288c0, 268435456, new Class[]{org.telegram.ui.Cells.ba.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42288c0, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42288c0, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        int i17 = org.telegram.ui.ActionBar.h6.f20952b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42288c0, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42288c0, 268435456, new Class[]{um0.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42288c0, 4, new Class[]{um0.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42288c0, 4, new Class[]{um0.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20991d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42288c0, 4, new Class[]{um0.class}, new String[]{"valueTextView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42288c0, 8, new Class[]{um0.class}, new String[]{"checkImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42288c0, 16, new Class[]{org.telegram.ui.Cells.l4.class}, null, null, null, i14));
        int i18 = org.telegram.ui.ActionBar.h6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42288c0, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42288c0, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42288c0, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        if (this.Y != null) {
            int i19 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Y;
                if (i19 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.j6((View) editTextBoldCursorArr[i19].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20990d6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y[i19], 16777220, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y[i19], 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y[i19], 8390656, null, null, null, null, org.telegram.ui.ActionBar.h6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y[i19], 32, null, null, null, null, org.telegram.ui.ActionBar.h6.f21117k6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y[i19], 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.f21134l6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y[i19], 2080, null, null, null, null, org.telegram.ui.ActionBar.h6.f21211p7));
                i19++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4, null, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.H6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 8390656, null, null, null, null, i18));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.f21117k6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.f21134l6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 2080, null, null, null, null, org.telegram.ui.ActionBar.h6.f21211p7));
        }
        if (this.f42282a0 != null) {
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.f42282a0;
                if (i11 >= editTextBoldCursorArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.j6((View) editTextBoldCursorArr2[i11].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20990d6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42282a0[i11], 16777220, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42282a0[i11], 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42282a0[i11], 8390656, null, null, null, null, org.telegram.ui.ActionBar.h6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42282a0[i11], 32, null, null, null, null, org.telegram.ui.ActionBar.h6.f21117k6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42282a0[i11], 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.f21134l6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42282a0[i11], 2080, null, null, null, null, org.telegram.ui.ActionBar.h6.f21211p7));
                i11++;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F0, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f21062h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I0, 8, null, null, null, null, org.telegram.ui.ActionBar.h6.Xd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.J0, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.K0, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21247r6));
        TextView textView = this.M0;
        int i20 = org.telegram.ui.ActionBar.h6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(textView, 4, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42331w0, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.O, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21297th));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.f21258rh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.f21277sh));
        org.telegram.ui.Components.dr drVar = this.N;
        int i21 = org.telegram.ui.ActionBar.h6.D7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(drVar, 0, null, null, null, null, i21));
        org.telegram.ui.Components.dr drVar2 = this.N;
        int i22 = org.telegram.ui.ActionBar.h6.E7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(drVar2, 0, null, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.P, 0, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.P, 0, null, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.B0, 8, null, null, null, null, org.telegram.ui.ActionBar.h6.Ci));
        TextView textView2 = this.C0;
        int i23 = org.telegram.ui.ActionBar.h6.f21395z6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(textView2, 4, null, null, null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.D0, 4, null, null, null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E0, 4, null, null, null, null, i20));
        return arrayList;
    }

    public final byte[] h1(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32 || bArr2 == null || bArr2.length != 32) {
            return null;
        }
        byte[] bArr3 = new byte[32];
        System.arraycopy(this.f42293e1, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(this.f42293e1, 32, bArr4, 0, 16);
        byte[] bArr5 = new byte[32];
        System.arraycopy(this.f42289c1, 0, bArr5, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr5, bArr3, bArr4, 0, 32, 0, 0);
        if (!Y0(bArr5, null)) {
            return null;
        }
        byte[] computeSHA512 = Utilities.computeSHA512(bArr5, bArr2);
        byte[] bArr6 = new byte[32];
        System.arraycopy(computeSHA512, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(computeSHA512, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(bArr, 0, bArr8, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        return bArr8;
    }

    public final void i1(final TLRPC.TL_secureRequiredType tL_secureRequiredType, final TLRPC.TL_secureRequiredType tL_secureRequiredType2, final ArrayList arrayList, final boolean z10, final hl0 hl0Var, final kl0 kl0Var, final boolean z11) {
        if (tL_secureRequiredType == null) {
            return;
        }
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        if (z11 && tL_secureRequiredType2 != null) {
            deletesecurevalue.types.add(tL_secureRequiredType2.type);
        } else {
            if (z10) {
                deletesecurevalue.types.add(tL_secureRequiredType.type);
            }
            if (tL_secureRequiredType2 != null) {
                deletesecurevalue.types.add(tL_secureRequiredType2.type);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletesecurevalue, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                final vm0 vm0Var = vm0.this;
                final km0 km0Var = kl0Var;
                final boolean z12 = z11;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType3 = tL_secureRequiredType2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                final boolean z13 = z10;
                final ArrayList arrayList2 = arrayList;
                final Runnable runnable = hl0Var;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        TLRPC.TL_secureData tL_secureData;
                        String str2;
                        LinearLayout linearLayout;
                        vm0 vm0Var2 = vm0.this;
                        TLRPC.TL_error tL_error2 = tL_error;
                        String str3 = null;
                        if (tL_error2 != null) {
                            km0 km0Var2 = km0Var;
                            if (km0Var2 != null) {
                                km0Var2.p(tL_error2.text, null);
                            }
                            vm0Var2.L1(LocaleController.getString(R.string.AppName), tL_error2.text);
                            return;
                        }
                        boolean z14 = z12;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType3;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType4;
                        boolean z15 = z13;
                        if (z14) {
                            if (tL_secureRequiredType5 != null) {
                                vm0Var2.G1(tL_secureRequiredType5);
                            } else {
                                vm0Var2.G1(tL_secureRequiredType6);
                            }
                        } else {
                            if (z15) {
                                vm0Var2.G1(tL_secureRequiredType6);
                            }
                            vm0Var2.G1(tL_secureRequiredType5);
                        }
                        int i10 = 0;
                        if (vm0Var2.f42284b == 8) {
                            um0 um0Var = (um0) vm0Var2.f42317q1.remove(tL_secureRequiredType6);
                            if (um0Var != null) {
                                vm0Var2.f42288c0.removeView(um0Var);
                                View childAt = vm0Var2.f42288c0.getChildAt(linearLayout.getChildCount() - 6);
                                if (childAt instanceof um0) {
                                    ((um0) childAt).setNeedDivider(false);
                                }
                            }
                            vm0Var2.P1();
                        } else {
                            ArrayList arrayList3 = arrayList2;
                            if (tL_secureRequiredType5 != null && arrayList3 != null && arrayList3.size() > 1) {
                                int size = arrayList3.size();
                                int i11 = 0;
                                while (true) {
                                    if (i11 < size) {
                                        TLRPC.TL_secureRequiredType tL_secureRequiredType7 = (TLRPC.TL_secureRequiredType) arrayList3.get(i11);
                                        TLRPC.TL_secureValue q12 = vm0Var2.q1(tL_secureRequiredType7, false);
                                        if (q12 != null) {
                                            TLRPC.TL_secureData tL_secureData2 = q12.data;
                                            if (tL_secureData2 != null) {
                                                str2 = vm0.g1(tL_secureData2.data, vm0Var2.h1(tL_secureData2.secret, tL_secureData2.data_hash), q12.data.data_hash);
                                            } else {
                                                str2 = null;
                                            }
                                            str = str2;
                                            tL_secureRequiredType5 = tL_secureRequiredType7;
                                        } else {
                                            i11++;
                                        }
                                    } else {
                                        str = null;
                                        break;
                                    }
                                }
                                if (tL_secureRequiredType5 == null) {
                                    tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) arrayList3.get(0);
                                }
                            } else {
                                str = null;
                            }
                            if (z15) {
                                if (arrayList3 != null) {
                                    i10 = arrayList3.size();
                                }
                                vm0Var2.K1(tL_secureRequiredType6, null, null, tL_secureRequiredType5, str, z14, i10);
                            } else {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType8 = tL_secureRequiredType5;
                                String str4 = str;
                                TLRPC.TL_secureValue q13 = vm0Var2.q1(tL_secureRequiredType6, false);
                                if (q13 != null && (tL_secureData = q13.data) != null) {
                                    str3 = vm0.g1(tL_secureData.data, vm0Var2.h1(tL_secureData.secret, tL_secureData.data_hash), q13.data.data_hash);
                                }
                                if (arrayList3 != null) {
                                    i10 = arrayList3.size();
                                }
                                vm0Var2.K1(tL_secureRequiredType6, null, str3, tL_secureRequiredType8, str4, z14, i10);
                            }
                        }
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                });
            }
        });
    }

    public final com.google.android.gms.internal.cast.z5 j1(byte[] bArr) {
        byte[] o12 = o1();
        int nextInt = Utilities.random.nextInt(208) + 32;
        while ((bArr.length + nextInt) % 16 != 0) {
            nextInt++;
        }
        byte[] bArr2 = new byte[nextInt];
        Utilities.random.nextBytes(bArr2);
        bArr2[0] = (byte) nextInt;
        int length = nextInt + bArr.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, nextInt);
        System.arraycopy(bArr, 0, bArr3, nextInt, bArr.length);
        byte[] computeSHA256 = Utilities.computeSHA256(bArr3);
        byte[] computeSHA512 = Utilities.computeSHA512(o12, computeSHA256);
        byte[] bArr4 = new byte[32];
        System.arraycopy(computeSHA512, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(computeSHA512, 32, bArr5, 0, 16);
        Utilities.aesCbcEncryptionByteArraySafe(bArr3, bArr4, bArr5, 0, length, 0, 1);
        byte[] bArr6 = new byte[32];
        System.arraycopy(this.f42293e1, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(this.f42293e1, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(this.f42289c1, 0, bArr8, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        byte[] computeSHA5122 = Utilities.computeSHA512(bArr8, computeSHA256);
        byte[] bArr9 = new byte[32];
        System.arraycopy(computeSHA5122, 0, bArr9, 0, 32);
        byte[] bArr10 = new byte[16];
        System.arraycopy(computeSHA5122, 32, bArr10, 0, 16);
        byte[] bArr11 = new byte[32];
        System.arraycopy(o12, 0, bArr11, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr11, bArr9, bArr10, 0, 32, 0, 1);
        ?? obj = new Object();
        obj.f6880a = bArr3;
        obj.f6881b = bArr11;
        obj.d = computeSHA256;
        obj.f6882c = o12;
        obj.e = new SecureDocumentKey(bArr4, bArr5);
        return obj;
    }

    public final void k1(Bundle bundle, TLRPC.TL_auth_sentCode tL_auth_sentCode, boolean z10) {
        bundle.putString("phoneHash", tL_auth_sentCode.phone_code_hash);
        TLRPC.auth_CodeType auth_codetype = tL_auth_sentCode.next_type;
        if (auth_codetype instanceof TLRPC.TL_auth_codeTypeCall) {
            bundle.putInt("nextType", 4);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFlashCall) {
            bundle.putInt("nextType", 3);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeSms) {
            bundle.putInt("nextType", 2);
        }
        if (tL_auth_sentCode.timeout == 0) {
            tL_auth_sentCode.timeout = 60;
        }
        bundle.putInt("timeout", tL_auth_sentCode.timeout * 1000);
        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt("type", 4);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            J1(bundle, 2, z10);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", tL_auth_sentCode.type.pattern);
            J1(bundle, 1, z10);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSms) {
            bundle.putInt("type", 2);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            J1(bundle, 0, z10);
        }
    }

    public final String l1() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.Y;
            if (i10 >= editTextBoldCursorArr.length) {
                break;
            }
            sb2.append((CharSequence) editTextBoldCursorArr[i10].getText());
            sb2.append(",");
            i10++;
        }
        if (this.f42282a0 != null) {
            int i11 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.f42282a0;
                if (i11 >= editTextBoldCursorArr2.length) {
                    break;
                }
                sb2.append((CharSequence) editTextBoldCursorArr2[i11].getText());
                sb2.append(",");
                i11++;
            }
        }
        ArrayList arrayList = this.f42302i1;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            sb2.append(((SecureDocument) arrayList.get(i12)).secureFile.f20411id);
        }
        SecureDocument secureDocument = this.l1;
        if (secureDocument != null) {
            sb2.append(secureDocument.secureFile.f20411id);
        }
        SecureDocument secureDocument2 = this.f42308m1;
        if (secureDocument2 != null) {
            sb2.append(secureDocument2.secureFile.f20411id);
        }
        SecureDocument secureDocument3 = this.f42304j1;
        if (secureDocument3 != null) {
            sb2.append(secureDocument3.secureFile.f20411id);
        }
        ArrayList arrayList2 = this.f42306k1;
        int size2 = arrayList2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            sb2.append(((SecureDocument) arrayList2.get(i13)).secureFile.f20411id);
        }
        return sb2.toString();
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            if (i10 != 0 && i10 != 2) {
                if (i10 == 1) {
                    if (intent != null && intent.getData() != null) {
                        ArrayList arrayList = new ArrayList();
                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                        sendingMediaInfo.uri = intent.getData();
                        arrayList.add(sendingMediaInfo);
                        F1(arrayList);
                        return;
                    } else if (getParentActivity() != null) {
                        Toast.makeText(getParentActivity(), LocaleController.getString(R.string.UnsupportedAttachment), 0).show();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            b1();
            org.telegram.ui.Components.ti tiVar = this.R0;
            if (tiVar != null) {
                tiVar.f30558j0.g0(i10, intent, this.Q0);
            }
            this.Q0 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i10 = this.f42284b;
        if (i10 == 7) {
            if (z10) {
                int i11 = this.I1;
                org.telegram.ui.Components.qw0[] qw0VarArr = this.J1;
                qw0VarArr[i11].c(true);
                for (org.telegram.ui.Components.qw0 qw0Var : qw0VarArr) {
                    if (qw0Var != null) {
                        qw0Var.f();
                    }
                }
            }
        } else if (i10 != 0 && i10 != 5) {
            if (i10 == 1 || i10 == 2) {
                return !W0(z10);
            }
        } else if (z10) {
            V0(false);
        }
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        if (this.f42284b == 3 && dialog == this.L1) {
            ArrayList arrayList = this.M1;
            if (!arrayList.isEmpty()) {
                getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        int i10 = 0;
        V0(false);
        org.telegram.ui.Components.ti tiVar = this.R0;
        if (tiVar != null) {
            tiVar.dismissInternal();
            this.R0.y1();
        }
        if (this.f42284b == 7) {
            while (true) {
                org.telegram.ui.Components.qw0[] qw0VarArr = this.J1;
                if (i10 >= qw0VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.qw0 qw0Var = qw0VarArr[i10];
                if (qw0Var != null) {
                    qw0Var.f();
                }
                i10++;
            }
            org.telegram.ui.ActionBar.b2 b2Var = this.K1;
            if (b2Var != null) {
                try {
                    b2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.K1 = null;
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.ti tiVar = this.R0;
        if (tiVar != null) {
            tiVar.A1();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.ti tiVar;
        org.telegram.ui.Cells.ba baVar;
        int i11 = this.f42284b;
        if ((i11 == 1 || i11 == 2) && (tiVar = this.R0) != null) {
            if (i10 == 17) {
                tiVar.f30558j0.U(false);
            } else if (i10 == 21) {
                if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
                    alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new kl0(this, 0));
                    org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                }
            } else if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                E1(0);
            } else if (i10 == 22 && iArr != null && iArr.length > 0 && iArr[0] == 0 && (baVar = this.f42319r0) != null) {
                baVar.callOnClick();
            }
        } else if (i11 == 3 && i10 == 6) {
            N1(false, this.E1, this.F1, this.G1, this.H1);
        }
    }

    @Override
    public final void onResume() {
        ViewGroup[] viewGroupArr;
        ViewGroup viewGroup;
        super.onResume();
        org.telegram.ui.Components.ti tiVar = this.R0;
        if (tiVar != null) {
            tiVar.B1();
        }
        if (this.f42284b == 5 && (viewGroupArr = this.Z) != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
            this.Y[0].requestFocus();
            AndroidUtilities.showKeyboard(this.Y[0]);
            AndroidUtilities.runOnUIThread(new hl0(this, 0), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (this.f42300h1 != null) {
            AndroidUtilities.runOnUIThread(new hl0(this, 1));
        }
        int i10 = this.f42284b;
        if (i10 == 5) {
            if (z10) {
                if (this.Z[0].getVisibility() == 0) {
                    this.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(this.Y[0]);
                }
                if (this.N0 == 2) {
                    A1(false);
                }
            }
        } else if (i10 == 7) {
            if (z10) {
                this.J1[this.I1].j();
            }
        } else if (i10 == 4) {
            if (z10) {
                this.Y[0].requestFocus();
                AndroidUtilities.showKeyboard(this.Y[0]);
            }
        } else if (i10 == 6) {
            if (z10) {
                this.Y[0].requestFocus();
                AndroidUtilities.showKeyboard(this.Y[0]);
            }
        } else if (i10 != 2 && i10 != 1) {
        } else {
            b1();
        }
    }

    public final TLRPC.TL_secureValue q1(TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z10) {
        String[] strArr;
        if (tL_secureRequiredType != null) {
            int size = this.f42336y.values.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.TL_secureValue tL_secureValue = this.f42336y.values.get(i10);
                if (tL_secureRequiredType.type.getClass() == tL_secureValue.type.getClass()) {
                    if (z10) {
                        if (!tL_secureRequiredType.selfie_required || (tL_secureValue.selfie instanceof TLRPC.TL_secureFile)) {
                            if (!tL_secureRequiredType.translation_required || !tL_secureValue.translation.isEmpty()) {
                                if (!s1(tL_secureRequiredType.type) || !tL_secureValue.files.isEmpty()) {
                                    if (!u1(tL_secureRequiredType.type) || (tL_secureValue.front_side instanceof TLRPC.TL_secureFile)) {
                                        TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
                                        if ((!(secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) && !(secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard)) || (tL_secureValue.reverse_side instanceof TLRPC.TL_secureFile)) {
                                            boolean z11 = secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails;
                                            if (z11 || (secureValueType instanceof TLRPC.TL_secureValueTypeAddress)) {
                                                if (z11) {
                                                    strArr = tL_secureRequiredType.native_names ? new String[]{"first_name_native", "last_name_native", "birth_date", "gender", "country_code", "residence_country_code"} : new String[]{"first_name", "last_name", "birth_date", "gender", "country_code", "residence_country_code"};
                                                } else {
                                                    strArr = new String[]{"street_line1", "street_line2", "post_code", "city", "state", "country_code"};
                                                }
                                                try {
                                                    TLRPC.TL_secureData tL_secureData = tL_secureValue.data;
                                                    JSONObject jSONObject = new JSONObject(g1(tL_secureData.data, h1(tL_secureData.secret, tL_secureData.data_hash), tL_secureValue.data.data_hash));
                                                    for (int i11 = 0; i11 < strArr.length; i11++) {
                                                        if (!jSONObject.has(strArr[i11]) || TextUtils.isEmpty(jSONObject.getString(strArr[i11]))) {
                                                            return null;
                                                        }
                                                    }
                                                } catch (Throwable unused) {
                                                    return null;
                                                }
                                            }
                                        } else {
                                            return null;
                                        }
                                    } else {
                                        return null;
                                    }
                                } else {
                                    return null;
                                }
                            } else {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    return tL_secureValue;
                }
            }
            return null;
        }
        return null;
    }

    public final boolean r1(Class cls) {
        int size = this.f42336y.values.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f42336y.values.get(i10).type.getClass() == cls) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.Q0 = bundle.getString("path");
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.Q0;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final boolean t1() {
        String str = this.f42281a;
        if (str != null && !str.equals(l1())) {
            return false;
        }
        return true;
    }

    public final void v1() {
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ll0(this, 3)), this.classGuid);
    }

    public final void w1() {
        org.telegram.ui.ActionBar.b2 b2Var = this.K1;
        if (b2Var == null) {
            return;
        }
        try {
            b2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.K1 = null;
    }

    public final void x1() {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.K1 == null) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
            this.K1 = b2Var;
            b2Var.f20665g0 = false;
            b2Var.show();
        }
    }

    public final void y1(View view) {
        if (view == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        AndroidUtilities.shakeView(view);
        H1(view);
    }

    public final void z1(boolean z10) {
        if (getParentActivity() == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        if (z10) {
            this.Y[0].setText("");
        }
        AndroidUtilities.shakeView(this.Y[0]);
    }

    public vm0(int i10, long j10, String str, String str2, String str3, String str4, String str5, TL_account.authorizationForm authorizationform, TL_account.Password password) {
        this(i10, authorizationform, password, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (HashMap) null, (HashMap) null);
        int i11;
        String n12;
        String str6;
        String str7;
        String str8;
        String str9;
        this.f42287c = j10;
        this.d = str3;
        this.e = str4;
        this.h = str;
        this.f42318r = str2;
        this.f42309n = str5;
        if (i10 != 0 || authorizationform.errors.isEmpty()) {
            return;
        }
        try {
            Collections.sort(authorizationform.errors, new cm0(this));
            int size = authorizationform.errors.size();
            int i12 = 0;
            while (i12 < size) {
                TLRPC.SecureValueError secureValueError = authorizationform.errors.get(i12);
                byte[] bArr = null;
                if (secureValueError instanceof TLRPC.TL_secureValueErrorFrontSide) {
                    TLRPC.TL_secureValueErrorFrontSide tL_secureValueErrorFrontSide = (TLRPC.TL_secureValueErrorFrontSide) secureValueError;
                    n12 = n1(tL_secureValueErrorFrontSide.type);
                    str6 = tL_secureValueErrorFrontSide.text;
                    bArr = tL_secureValueErrorFrontSide.file_hash;
                    str7 = null;
                    str8 = "front";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorReverseSide) {
                    TLRPC.TL_secureValueErrorReverseSide tL_secureValueErrorReverseSide = (TLRPC.TL_secureValueErrorReverseSide) secureValueError;
                    n12 = n1(tL_secureValueErrorReverseSide.type);
                    str6 = tL_secureValueErrorReverseSide.text;
                    bArr = tL_secureValueErrorReverseSide.file_hash;
                    str7 = null;
                    str8 = "reverse";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorSelfie) {
                    TLRPC.TL_secureValueErrorSelfie tL_secureValueErrorSelfie = (TLRPC.TL_secureValueErrorSelfie) secureValueError;
                    n12 = n1(tL_secureValueErrorSelfie.type);
                    str6 = tL_secureValueErrorSelfie.text;
                    bArr = tL_secureValueErrorSelfie.file_hash;
                    str7 = null;
                    str8 = "selfie";
                } else {
                    if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFile) {
                        TLRPC.TL_secureValueErrorTranslationFile tL_secureValueErrorTranslationFile = (TLRPC.TL_secureValueErrorTranslationFile) secureValueError;
                        n12 = n1(tL_secureValueErrorTranslationFile.type);
                        str6 = tL_secureValueErrorTranslationFile.text;
                        bArr = tL_secureValueErrorTranslationFile.file_hash;
                        str7 = null;
                    } else if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFiles) {
                        TLRPC.TL_secureValueErrorTranslationFiles tL_secureValueErrorTranslationFiles = (TLRPC.TL_secureValueErrorTranslationFiles) secureValueError;
                        n12 = n1(tL_secureValueErrorTranslationFiles.type);
                        str6 = tL_secureValueErrorTranslationFiles.text;
                        str7 = null;
                    } else {
                        if (secureValueError instanceof TLRPC.TL_secureValueErrorFile) {
                            TLRPC.TL_secureValueErrorFile tL_secureValueErrorFile = (TLRPC.TL_secureValueErrorFile) secureValueError;
                            n12 = n1(tL_secureValueErrorFile.type);
                            str6 = tL_secureValueErrorFile.text;
                            bArr = tL_secureValueErrorFile.file_hash;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueErrorFiles) {
                            TLRPC.TL_secureValueErrorFiles tL_secureValueErrorFiles = (TLRPC.TL_secureValueErrorFiles) secureValueError;
                            n12 = n1(tL_secureValueErrorFiles.type);
                            str6 = tL_secureValueErrorFiles.text;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueError) {
                            TLRPC.TL_secureValueError tL_secureValueError = (TLRPC.TL_secureValueError) secureValueError;
                            n12 = n1(tL_secureValueError.type);
                            str6 = tL_secureValueError.text;
                            bArr = tL_secureValueError.hash;
                            str7 = null;
                            str8 = "error_all";
                        } else {
                            if (secureValueError instanceof TLRPC.TL_secureValueErrorData) {
                                TLRPC.TL_secureValueErrorData tL_secureValueErrorData = (TLRPC.TL_secureValueErrorData) secureValueError;
                                int i13 = 0;
                                while (i13 < authorizationform.values.size()) {
                                    TLRPC.TL_secureData tL_secureData = authorizationform.values.get(i13).data;
                                    if (tL_secureData == null || !Arrays.equals(tL_secureData.data_hash, tL_secureValueErrorData.data_hash)) {
                                        i13++;
                                        size = size;
                                    } else {
                                        n12 = n1(tL_secureValueErrorData.type);
                                        str6 = tL_secureValueErrorData.text;
                                        String str10 = tL_secureValueErrorData.field;
                                        bArr = tL_secureValueErrorData.data_hash;
                                        str7 = str10;
                                        str8 = "data";
                                    }
                                }
                            }
                            i11 = size;
                            i12++;
                            size = i11;
                        }
                        str8 = "files";
                    }
                    str8 = "translation";
                }
                HashMap hashMap = (HashMap) this.f42327u1.get(n12);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    i11 = size;
                    this.f42327u1.put(n12, hashMap);
                    this.f42329v1.put(n12, str6);
                } else {
                    i11 = size;
                }
                if (bArr != null) {
                    str9 = Base64.encodeToString(bArr, 2);
                } else {
                    str9 = "";
                }
                switch (str8.hashCode()) {
                    case -1840647503:
                        if (!str8.equals("translation")) {
                            continue;
                        } else if (bArr != null) {
                            hashMap.put("translation" + str9, str6);
                            break;
                        } else {
                            hashMap.put("translation_all", str6);
                            break;
                        }
                    case -906020504:
                        if (str8.equals("selfie")) {
                            hashMap.put("selfie" + str9, str6);
                            break;
                        } else {
                            continue;
                        }
                    case 3076010:
                        if (!str8.equals("data")) {
                            continue;
                        } else if (str7 == null) {
                            break;
                        } else {
                            hashMap.put(str7, str6);
                            break;
                        }
                    case 97434231:
                        if (!str8.equals("files")) {
                            continue;
                        } else if (bArr != null) {
                            hashMap.put("files" + str9, str6);
                            break;
                        } else {
                            hashMap.put("files_all", str6);
                            break;
                        }
                    case 97705513:
                        if (str8.equals("front")) {
                            hashMap.put("front" + str9, str6);
                            break;
                        } else {
                            continue;
                        }
                    case 329856746:
                        if (str8.equals("error_all")) {
                            hashMap.put("error_all", str6);
                            break;
                        } else {
                            continue;
                        }
                    case 1099846370:
                        if (str8.equals("reverse")) {
                            hashMap.put("reverse" + str9, str6);
                            break;
                        } else {
                            continue;
                        }
                    default:
                        continue;
                }
                i12++;
                size = i11;
            }
        } catch (Exception unused) {
        }
    }
}
