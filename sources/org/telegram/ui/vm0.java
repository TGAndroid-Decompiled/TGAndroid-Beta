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
public final class vm0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.TL_secureRequiredType A;
    public TextView A0;
    public String A1;
    public TLRPC.TL_secureRequiredType B;
    public org.telegram.ui.Components.hz B0;
    public Runnable B1;
    public ArrayList C;
    public org.telegram.ui.Cells.y8 C0;
    public jm0 C1;
    public final TLRPC.TL_secureValue D;
    public org.telegram.ui.Cells.y8 D0;
    public lm0 D1;
    public final TLRPC.TL_secureValue E;
    public ImageView E0;
    public int E1;
    public TL_account.Password F;
    public TextView F0;
    public final org.telegram.ui.Components.mv0[] F1;
    public TLRPC.TL_auth_sentCode G;
    public TextView G0;
    public org.telegram.ui.ActionBar.c2 G1;
    public org.telegram.ui.ActionBar.w0 H;
    public FrameLayout H0;
    public Dialog H1;
    public AnimatorSet I;
    public TextView I0;
    public final ArrayList I1;
    public org.telegram.ui.Components.nq J;
    public int J0;
    public TextView K;
    public final byte[] K0;
    public org.telegram.ui.Components.nq L;
    public final byte[] L0;
    public FrameLayout M;
    public String M0;
    public org.telegram.ui.Cells.y9 N;
    public org.telegram.ui.Components.ni N0;
    public View O;
    public int O0;
    public View P;
    public int P0;
    public org.telegram.ui.Cells.x8 Q;
    public final ArrayList Q0;
    public org.telegram.ui.Cells.x8 R;
    public final HashMap R0;
    public org.telegram.ui.Cells.x8 S;
    public final HashMap S0;
    public org.telegram.ui.Cells.y9 T;
    public final HashMap T0;
    public EditTextBoldCursor[] U;
    public HashMap U0;
    public ViewGroup[] V;
    public boolean V0;
    public EditTextBoldCursor[] W;
    public boolean W0;
    public ScrollView X;
    public long X0;
    public LinearLayout Y;
    public byte[] Y0;
    public LinearLayout Z;
    public String Z0;
    public String f43622a;
    public LinearLayout f43623a0;
    public byte[] f43624a1;
    public final int f43625b;
    public LinearLayout f43626b0;
    public boolean f43627b1;
    public long f43628c;
    public LinearLayout f43629c0;
    public boolean f43630c1;
    public final String d;
    public LinearLayout f43631d0;
    public vm0 f43632d1;
    public final String f43633e;
    public LinearLayout f43634e0;
    public final ArrayList f43635e1;
    public boolean f43636f;
    public org.telegram.ui.Cells.k4 f43637f0;
    public SecureDocument f43638f1;
    public final ArrayList f43639g0;
    public final ArrayList f43640g1;
    public final String h;
    public org.telegram.ui.Cells.x6 f43641h0;
    public SecureDocument f43642h1;
    public org.telegram.ui.Cells.x6 f43643i0;
    public SecureDocument f43644i1;
    public org.telegram.ui.Cells.y8 f43645j0;
    public final HashMap f43646j1;
    public org.telegram.ui.Cells.y8 f43647k0;
    public final HashMap f43648k1;
    public org.telegram.ui.Cells.y8 f43649l0;
    public final HashMap l1;
    public org.telegram.ui.Cells.y8 m0;
    public final HashMap f43650m1;
    public final String f43651n;
    public org.telegram.ui.Cells.y9 f43652n0;
    public final HashMap f43653n1;
    public int f43654o0;
    public final HashMap f43655o1;
    public final boolean[] f43656p0;
    public final HashMap f43657p1;
    public boolean f43658q0;
    public final HashMap f43659q1;
    public final String f43660r;
    public boolean f43661r0;
    public final HashMap f43662r1;
    public String f43663s;
    public TextView f43664s0;
    public HashMap f43665s1;
    public org.telegram.ui.Cells.y9 f43666t0;
    public HashMap f43667t1;
    public org.telegram.ui.Cells.y9 f43668u0;
    public final HashMap f43669u1;
    public String v;
    public org.telegram.ui.Cells.x6 f43670v0;
    public String f43671v1;
    public String f43672w;
    public LinearLayout f43673w0;
    public String f43674w1;
    public final int[] f43675x;
    public ImageView f43676x0;
    public lm0 f43677x1;
    public TL_account.authorizationForm f43678y;
    public TextView f43679y0;
    public boolean f43680y1;
    public TextView f43681z0;
    public final ul0 f43682z1;

    public vm0(int i10, TL_account.authorizationForm authorizationform, TL_account.Password password, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureValue tL_secureValue, TLRPC.TL_secureRequiredType tL_secureRequiredType2, TLRPC.TL_secureValue tL_secureValue2, HashMap hashMap, HashMap hashMap2) {
        super(null);
        this.f43663s = "";
        this.v = "";
        this.f43675x = new int[3];
        this.f43639g0 = new ArrayList();
        this.f43656p0 = new boolean[3];
        this.f43658q0 = true;
        this.Q0 = new ArrayList();
        this.R0 = new HashMap();
        this.S0 = new HashMap();
        this.T0 = new HashMap();
        this.f43635e1 = new ArrayList();
        this.f43640g1 = new ArrayList();
        this.f43646j1 = new HashMap();
        this.f43648k1 = new HashMap();
        this.l1 = new HashMap();
        this.f43650m1 = new HashMap();
        this.f43653n1 = new HashMap();
        this.f43659q1 = new HashMap();
        this.f43662r1 = new HashMap();
        this.f43669u1 = new HashMap();
        this.f43682z1 = new ul0(this);
        this.f43625b = i10;
        this.f43678y = authorizationform;
        this.A = tL_secureRequiredType;
        if (tL_secureRequiredType != null) {
            this.f43658q0 = tL_secureRequiredType.native_names;
        }
        this.D = tL_secureValue;
        this.B = tL_secureRequiredType2;
        this.E = tL_secureValue2;
        this.F = password;
        this.f43655o1 = hashMap;
        this.f43657p1 = hashMap2;
        if (i10 == 3) {
            this.I1 = new ArrayList();
        } else if (i10 == 7) {
            this.F1 = new org.telegram.ui.Components.mv0[3];
        }
        if (hashMap == null) {
            this.f43655o1 = new HashMap();
        }
        if (hashMap2 == null) {
            this.f43657p1 = new HashMap();
        }
        if (i10 == 5) {
            if (UserConfig.getInstance(this.currentAccount).savedPasswordHash != null && UserConfig.getInstance(this.currentAccount).savedSaltedPassword != null) {
                this.J0 = 1;
                this.K0 = UserConfig.getInstance(this.currentAccount).savedPasswordHash;
                this.L0 = UserConfig.getInstance(this.currentAccount).savedSaltedPassword;
            }
            TL_account.Password password2 = this.F;
            if (password2 == null) {
                w1();
            } else {
                TwoStepVerificationActivity.m0(password2);
                if (this.J0 == 1) {
                    B1(true);
                }
            }
            if (SharedConfig.isPassportConfigLoaded()) {
                return;
            }
            TLRPC.TL_help_getPassportConfig tL_help_getPassportConfig = new TLRPC.TL_help_getPassportConfig();
            tL_help_getPassportConfig.hash = SharedConfig.passportConfigHash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getPassportConfig, new lh.o5(15));
        }
    }

    public static int C0(vm0 vm0Var, String str) {
        vm0Var.getClass();
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -2006252145:
                if (str.equals("residence_country_code")) {
                    c3 = 0;
                    break;
                }
                break;
            case -1537298398:
                if (str.equals("last_name_native")) {
                    c3 = 1;
                    break;
                }
                break;
            case -1249512767:
                if (str.equals("gender")) {
                    c3 = 2;
                    break;
                }
                break;
            case -796150911:
                if (str.equals("street_line1")) {
                    c3 = 3;
                    break;
                }
                break;
            case -796150910:
                if (str.equals("street_line2")) {
                    c3 = 4;
                    break;
                }
                break;
            case -160985414:
                if (str.equals("first_name")) {
                    c3 = 5;
                    break;
                }
                break;
            case 3053931:
                if (str.equals("city")) {
                    c3 = 6;
                    break;
                }
                break;
            case 109757585:
                if (str.equals("state")) {
                    c3 = 7;
                    break;
                }
                break;
            case 421072629:
                if (str.equals("middle_name")) {
                    c3 = '\b';
                    break;
                }
                break;
            case 451516732:
                if (str.equals("first_name_native")) {
                    c3 = '\t';
                    break;
                }
                break;
            case 475919162:
                if (str.equals("expiry_date")) {
                    c3 = '\n';
                    break;
                }
                break;
            case 506677093:
                if (str.equals("document_no")) {
                    c3 = 11;
                    break;
                }
                break;
            case 1168724782:
                if (str.equals("birth_date")) {
                    c3 = '\f';
                    break;
                }
                break;
            case 1181577377:
                if (str.equals("middle_name_native")) {
                    c3 = '\r';
                    break;
                }
                break;
            case 1481071862:
                if (str.equals("country_code")) {
                    c3 = 14;
                    break;
                }
                break;
            case 2002465324:
                if (str.equals("post_code")) {
                    c3 = 15;
                    break;
                }
                break;
            case 2013122196:
                if (str.equals("last_name")) {
                    c3 = 16;
                    break;
                }
                break;
        }
        switch (c3) {
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

    public static boolean D0(org.telegram.ui.vm0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vm0.D0(org.telegram.ui.vm0):boolean");
    }

    public static void J0(vm0 vm0Var, EditTextBoldCursor editTextBoldCursor, String str, Editable editable, boolean z10) {
        String str2;
        String str3;
        String str4;
        String str5;
        HashMap hashMap = vm0Var.f43669u1;
        if (hashMap != null && (str3 = (String) hashMap.get(str)) != null) {
            if (TextUtils.equals(str3, editable)) {
                HashMap hashMap2 = vm0Var.f43665s1;
                if (hashMap2 != null && (str5 = (String) hashMap2.get(str)) != null) {
                    editTextBoldCursor.setErrorText(str5);
                } else {
                    HashMap hashMap3 = vm0Var.f43667t1;
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
            vm0Var.a1(false);
        }
    }

    public static void U(vm0 vm0Var, TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery) {
        TL_account.Password password = vm0Var.F;
        password.email_unconfirmed_pattern = tL_auth_passwordRecovery.email_pattern;
        vm0Var.presentFragment(new cg1(vm0Var.currentAccount, 4, password));
    }

    public static void V(vm0 vm0Var) {
        ArrayList arrayList;
        int i10;
        int i11;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        HashMap hashMap = vm0Var.f43653n1;
        HashMap hashMap2 = vm0Var.f43650m1;
        String str = vm0Var.f43660r;
        ArrayList arrayList2 = new ArrayList();
        int size = vm0Var.f43678y.required_types.size();
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.SecureRequiredType secureRequiredType = vm0Var.f43678y.required_types.get(i12);
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
                                        if (vm0Var.r1(tL_secureRequiredType5, true) != null) {
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
            TLRPC.TL_secureValue r12 = vm0Var.r1(tL_secureRequiredType, true);
            if (r12 == null) {
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
            HashMap hashMap3 = (HashMap) vm0Var.f43659q1.get(o1(tL_secureRequiredType.type));
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
            obj.f43619a = r12;
            obj.f43620b = z10;
            obj.f43621c = z11;
            arrayList2.add(obj);
        }
        vm0Var.N1(false, true);
        TL_account.acceptAuthorization acceptauthorization = new TL_account.acceptAuthorization();
        acceptauthorization.bot_id = vm0Var.f43628c;
        acceptauthorization.scope = vm0Var.h;
        acceptauthorization.public_key = str;
        JSONObject jSONObject = new JSONObject();
        int size3 = arrayList2.size();
        int i14 = 0;
        while (i14 < size3) {
            vl0 vl0Var = (vl0) arrayList2.get(i14);
            TLRPC.TL_secureValue tL_secureValue = vl0Var.f43619a;
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
                        byte[] i15 = vm0Var.i1(tL_secureData.secret, tL_secureData.data_hash);
                        arrayList = arrayList2;
                        try {
                            jSONObject2.put("data_hash", Base64.encodeToString(tL_secureValue.data.data_hash, 2));
                            jSONObject2.put("secret", Base64.encodeToString(i15, 2));
                            jSONObject3.put("data", jSONObject2);
                        } catch (Exception unused) {
                        }
                    } else {
                        arrayList = arrayList2;
                    }
                    if (!tL_secureValue.files.isEmpty()) {
                        JSONArray jSONArray = new JSONArray();
                        int i16 = 0;
                        for (int size4 = tL_secureValue.files.size(); i16 < size4; size4 = size4) {
                            TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) tL_secureValue.files.get(i16);
                            i10 = size3;
                            try {
                                i11 = i14;
                                try {
                                    byte[] i17 = vm0Var.i1(tL_secureFile.secret, tL_secureFile.file_hash);
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("file_hash", Base64.encodeToString(tL_secureFile.file_hash, 2));
                                    jSONObject4.put("secret", Base64.encodeToString(i17, 2));
                                    jSONArray.put(jSONObject4);
                                    i16++;
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
                        byte[] i18 = vm0Var.i1(tL_secureFile2.secret, tL_secureFile2.file_hash);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("file_hash", Base64.encodeToString(tL_secureFile2.file_hash, 2));
                        jSONObject5.put("secret", Base64.encodeToString(i18, 2));
                        jSONObject3.put("front_side", jSONObject5);
                    }
                    TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile2;
                        byte[] i19 = vm0Var.i1(tL_secureFile3.secret, tL_secureFile3.file_hash);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("file_hash", Base64.encodeToString(tL_secureFile3.file_hash, 2));
                        jSONObject6.put("secret", Base64.encodeToString(i19, 2));
                        jSONObject3.put("reverse_side", jSONObject6);
                    }
                    if (vl0Var.f43620b) {
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile3;
                            byte[] i110 = vm0Var.i1(tL_secureFile4.secret, tL_secureFile4.file_hash);
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("file_hash", Base64.encodeToString(tL_secureFile4.file_hash, 2));
                            jSONObject7.put("secret", Base64.encodeToString(i110, 2));
                            jSONObject3.put("selfie", jSONObject7);
                        }
                    }
                    if (vl0Var.f43621c && !tL_secureValue.translation.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        int size5 = tL_secureValue.translation.size();
                        for (int i20 = 0; i20 < size5; i20++) {
                            TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) tL_secureValue.translation.get(i20);
                            byte[] i111 = vm0Var.i1(tL_secureFile5.secret, tL_secureFile5.file_hash);
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("file_hash", Base64.encodeToString(tL_secureFile5.file_hash, 2));
                            jSONObject8.put("secret", Base64.encodeToString(i111, 2));
                            jSONArray2.put(jSONObject8);
                        }
                        jSONObject3.put("translation", jSONArray2);
                    }
                    jSONObject.put(o1(tL_secureValue.type), jSONObject3);
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
        Object obj3 = vm0Var.f43633e;
        if (obj3 != null) {
            try {
                jSONObject9.put("nonce", obj3);
            } catch (Exception unused7) {
            }
        }
        a5.j k12 = vm0Var.k1(AndroidUtilities.getStringBytes(jSONObject9.toString()));
        TLRPC.TL_secureCredentialsEncrypted tL_secureCredentialsEncrypted = new TLRPC.TL_secureCredentialsEncrypted();
        acceptauthorization.credentials = tL_secureCredentialsEncrypted;
        tL_secureCredentialsEncrypted.hash = (byte[]) k12.d;
        tL_secureCredentialsEncrypted.data = (byte[]) k12.f213c;
        try {
            String replace = str.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "");
            Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(replace, 0))));
            acceptauthorization.credentials.secret = cipher.doFinal((byte[]) k12.f212b);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        ConnectionsManager.getInstance(vm0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(vm0Var.currentAccount).sendRequest(acceptauthorization, new il0(vm0Var, 1)), vm0Var.classGuid);
    }

    public static void W(vm0 vm0Var, TLRPC.TL_error tL_error, String str, lm0 lm0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        if (tL_error == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("phone", str);
            vm0 vm0Var2 = new vm0(7, vm0Var.f43678y, vm0Var.F, vm0Var.A, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
            vm0Var2.currentAccount = vm0Var.currentAccount;
            vm0Var2.f43624a1 = vm0Var.f43624a1;
            vm0Var2.Y0 = vm0Var.Y0;
            vm0Var2.f43677x1 = lm0Var;
            vm0Var2.G = (TLRPC.TL_auth_sentCode) tLObject;
            vm0Var.presentFragment(vm0Var2, true);
            return;
        }
        org.telegram.ui.Components.c5.f0(vm0Var.currentAccount, tL_error, vm0Var, sendverifyphonecode, str);
    }

    public static void X(vm0 vm0Var, SecureDocument secureDocument, int i10) {
        HashMap hashMap = vm0Var.f43646j1;
        int i11 = vm0Var.O0;
        if (i11 == 1) {
            SecureDocument secureDocument2 = vm0Var.f43638f1;
            if (secureDocument2 != null) {
                tm0 tm0Var = (tm0) hashMap.remove(secureDocument2);
                if (tm0Var != null) {
                    vm0Var.f43629c0.removeView(tm0Var);
                }
                vm0Var.f43638f1 = null;
            }
        } else if (i11 == 4) {
            if (vm0Var.f43640g1.size() >= 20) {
                return;
            }
        } else if (i11 == 2) {
            SecureDocument secureDocument3 = vm0Var.f43642h1;
            if (secureDocument3 != null) {
                tm0 tm0Var2 = (tm0) hashMap.remove(secureDocument3);
                if (tm0Var2 != null) {
                    vm0Var.f43623a0.removeView(tm0Var2);
                }
                vm0Var.f43642h1 = null;
            }
        } else if (i11 == 3) {
            SecureDocument secureDocument4 = vm0Var.f43644i1;
            if (secureDocument4 != null) {
                tm0 tm0Var3 = (tm0) hashMap.remove(secureDocument4);
                if (tm0Var3 != null) {
                    vm0Var.f43626b0.removeView(tm0Var3);
                }
                vm0Var.f43644i1 = null;
            }
        } else if (i11 == 0 && vm0Var.f43635e1.size() >= 20) {
            return;
        }
        vm0Var.f43648k1.put(secureDocument.path, secureDocument);
        vm0Var.H.setEnabled(false);
        vm0Var.H.setAlpha(0.5f);
        FileLoader.getInstance(vm0Var.currentAccount).uploadFile(secureDocument.path, false, true, 16777216);
        vm0Var.R0(secureDocument, i10);
        vm0Var.S1(i10);
    }

    public static void Y(org.telegram.ui.vm0 r9, boolean r10, java.lang.String r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vm0.Y(org.telegram.ui.vm0, boolean, java.lang.String):void");
    }

    public static void Z(int i10, String str, SecureDocument secureDocument, tm0 tm0Var, vm0 vm0Var) {
        HashMap hashMap = vm0Var.f43648k1;
        vm0Var.f43646j1.remove(secureDocument);
        if (i10 == 1) {
            vm0Var.f43638f1 = null;
            vm0Var.f43629c0.removeView(tm0Var);
        } else if (i10 == 4) {
            vm0Var.f43640g1.remove(secureDocument);
            vm0Var.f43631d0.removeView(tm0Var);
        } else if (i10 == 2) {
            vm0Var.f43642h1 = null;
            vm0Var.f43623a0.removeView(tm0Var);
        } else if (i10 == 3) {
            vm0Var.f43644i1 = null;
            vm0Var.f43626b0.removeView(tm0Var);
        } else {
            vm0Var.f43635e1.remove(secureDocument);
            vm0Var.Z.removeView(tm0Var);
        }
        if (str != null) {
            HashMap hashMap2 = vm0Var.f43667t1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
            HashMap hashMap3 = vm0Var.f43669u1;
            if (hashMap3 != null) {
                hashMap3.remove(str);
            }
        }
        vm0Var.S1(i10);
        String str2 = secureDocument.path;
        if (str2 != null && hashMap.remove(str2) != null) {
            if (hashMap.isEmpty()) {
                vm0Var.H.setEnabled(true);
                vm0Var.H.setAlpha(1.0f);
            }
            FileLoader.getInstance(vm0Var.currentAccount).cancelFileUpload(secureDocument.path, false);
        }
    }

    public static boolean Z0(byte[] bArr, Long l10) {
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
        if (l10 != null && Utilities.bytesToLong(Utilities.computeSHA256(bArr)) != l10.longValue()) {
            return false;
        }
        return true;
    }

    public static void a0(vm0 vm0Var) {
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        for (int i10 = 0; i10 < vm0Var.f43678y.values.size(); i10++) {
            deletesecurevalue.types.add(vm0Var.f43678y.values.get(i10).type);
        }
        vm0Var.y1();
        ConnectionsManager.getInstance(vm0Var.currentAccount).sendRequest(deletesecurevalue, new il0(vm0Var, 2));
    }

    public static void b0(vm0 vm0Var) {
        cg1 cg1Var = new cg1(vm0Var.currentAccount, 0, vm0Var.F);
        cg1Var.U = true;
        vm0Var.presentFragment(cg1Var);
    }

    public static void c0(vm0 vm0Var) {
        if (vm0Var.F.has_recovery) {
            vm0Var.y1();
            ConnectionsManager.getInstance(vm0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(vm0Var.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new il0(vm0Var, 0), 10), vm0Var.classGuid);
        } else if (vm0Var.getParentActivity() == null) {
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vm0Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.RestorePasswordResetAccount), new hl0(vm0Var, 4));
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
            String string = LocaleController.getString(R.string.RestorePasswordNoEmailText);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.P = string;
            vm0Var.showDialog(c2Var);
        }
    }

    public static void d0(vm0 vm0Var) {
        Activity parentActivity = vm0Var.getParentActivity();
        ye.d.s(parentActivity, "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(vm0Var.currentAccount).getClientPhone());
    }

    public static void e0(vm0 vm0Var) {
        if (Build.VERSION.SDK_INT >= 23 && vm0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            vm0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
            return;
        }
        r9 r9Var = new r9(0);
        r9Var.H = new sl0(vm0Var);
        vm0Var.presentFragment(r9Var);
    }

    public static int f0(vm0 vm0Var) {
        return vm0Var.currentAccount;
    }

    public static String h1(byte[] bArr, byte[] bArr2, byte[] bArr3) {
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

    public static String n1(SecureDocument secureDocument) {
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

    public static String o1(TLRPC.SecureValueType secureValueType) {
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

    public static byte[] p1() {
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

    public static String q1(TLRPC.SecureValueType secureValueType) {
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

    public static int r0(vm0 vm0Var) {
        return vm0Var.currentAccount;
    }

    public static int s0(vm0 vm0Var) {
        return vm0Var.currentAccount;
    }

    public static int t0(vm0 vm0Var) {
        return vm0Var.currentAccount;
    }

    public static boolean t1(TLRPC.SecureValueType secureValueType) {
        if (!(secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) && !(secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) && !(secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) && !(secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) && !(secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement)) {
            return false;
        }
        return true;
    }

    public static boolean v1(TLRPC.SecureValueType secureValueType) {
        if (!(secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) && !(secureValueType instanceof TLRPC.TL_secureValueTypePassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
            return false;
        }
        return true;
    }

    public final void A1(boolean z10) {
        if (getParentActivity() == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        if (z10) {
            this.U[0].setText("");
        }
        AndroidUtilities.shakeView(this.U[0]);
    }

    public final void B1(boolean z10) {
        String obj;
        if (z10) {
            obj = null;
        } else {
            obj = this.U[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                A1(false);
                return;
            }
            N1(true, true);
        }
        Utilities.globalQueue.postRunnable(new jh.r5(this, z10, obj, 28));
    }

    public final void C1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (s1(TLRPC.TL_secureValueTypePhone.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentPhone));
            arrayList2.add(TLRPC.TL_secureValueTypePhone.class);
        }
        if (s1(TLRPC.TL_secureValueTypeEmail.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentEmail));
            arrayList2.add(TLRPC.TL_secureValueTypeEmail.class);
        }
        if (s1(TLRPC.TL_secureValueTypePersonalDetails.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentIdentity));
            arrayList2.add(TLRPC.TL_secureValueTypePersonalDetails.class);
        }
        if (s1(TLRPC.TL_secureValueTypePassport.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentPassport));
            arrayList2.add(TLRPC.TL_secureValueTypePassport.class);
        }
        if (s1(TLRPC.TL_secureValueTypeInternalPassport.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentInternalPassport));
            arrayList2.add(TLRPC.TL_secureValueTypeInternalPassport.class);
        }
        if (s1(TLRPC.TL_secureValueTypePassportRegistration.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentPassportRegistration));
            arrayList2.add(TLRPC.TL_secureValueTypePassportRegistration.class);
        }
        if (s1(TLRPC.TL_secureValueTypeTemporaryRegistration.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentTemporaryRegistration));
            arrayList2.add(TLRPC.TL_secureValueTypeTemporaryRegistration.class);
        }
        if (s1(TLRPC.TL_secureValueTypeIdentityCard.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentIdentityCard));
            arrayList2.add(TLRPC.TL_secureValueTypeIdentityCard.class);
        }
        if (s1(TLRPC.TL_secureValueTypeDriverLicense.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentDriverLicence));
            arrayList2.add(TLRPC.TL_secureValueTypeDriverLicense.class);
        }
        if (s1(TLRPC.TL_secureValueTypeAddress.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentAddress));
            arrayList2.add(TLRPC.TL_secureValueTypeAddress.class);
        }
        if (s1(TLRPC.TL_secureValueTypeUtilityBill.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentUtilityBill));
            arrayList2.add(TLRPC.TL_secureValueTypeUtilityBill.class);
        }
        if (s1(TLRPC.TL_secureValueTypeBankStatement.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentBankStatement));
            arrayList2.add(TLRPC.TL_secureValueTypeBankStatement.class);
        }
        if (s1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentRentalAgreement));
            arrayList2.add(TLRPC.TL_secureValueTypeRentalAgreement.class);
        }
        if (getParentActivity() != null && !arrayList.isEmpty()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.PassportNoDocumentsAdd);
            alertDialog$Builder.f((CharSequence[]) arrayList.toArray(new CharSequence[0]), new ag.y1(9, this, arrayList2));
            showDialog(alertDialog$Builder.f22714a);
        }
    }

    public final void D1() {
        boolean z10;
        int size;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        int i11 = this.O0;
        ArrayList arrayList = this.f43635e1;
        int i12 = 1;
        if (i11 == 0 && arrayList.size() >= 20) {
            M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("PassportUploadMaxReached", R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", 20, new Object[0])));
            return;
        }
        c1();
        org.telegram.ui.Components.ni niVar = this.N0;
        int i13 = this.O0;
        if (i13 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        niVar.Q1 = z10;
        if (i13 == 0) {
            size = arrayList.size();
        } else {
            if (i13 == 4) {
                size = this.f43640g1.size();
            }
            niVar.J1(i12, false);
            this.N0.f31005f0.f0();
            i10 = Build.VERSION.SDK_INT;
            if (i10 != 21 || i10 == 22) {
                AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            }
            this.N0.r1();
            showDialog(this.N0);
        }
        i12 = 20 - size;
        niVar.J1(i12, false);
        this.N0.f31005f0.f0();
        i10 = Build.VERSION.SDK_INT;
        if (i10 != 21) {
        }
        AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
        this.N0.r1();
        showDialog(this.N0);
    }

    public final void E1(TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, boolean z10) {
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
            HashMap hashMap4 = this.f43659q1;
            if (!z10) {
                hashMap = (HashMap) hashMap4.get(o1(secureValueType2));
            } else {
                hashMap = null;
            }
            HashMap hashMap5 = (HashMap) hashMap4.get(o1(secureValueType));
            TLRPC.TL_secureValue r12 = r1(tL_secureRequiredType, false);
            TLRPC.TL_secureValue r13 = r1(tL_secureRequiredType2, false);
            HashMap hashMap6 = hashMap;
            TL_account.authorizationForm authorizationform = this.f43678y;
            int i12 = i11;
            TL_account.Password password = this.F;
            HashMap hashMap7 = this.l1;
            HashMap hashMap8 = (HashMap) hashMap7.get(tL_secureRequiredType);
            if (tL_secureRequiredType2 != null) {
                hashMap2 = hashMap5;
                hashMap3 = (HashMap) hashMap7.get(tL_secureRequiredType2);
            } else {
                hashMap2 = hashMap5;
                hashMap3 = null;
            }
            vm0 vm0Var = new vm0(i12, authorizationform, password, tL_secureRequiredType, r12, tL_secureRequiredType2, r13, hashMap8, hashMap3);
            vm0Var.f43677x1 = new yl0(this, secureValueType2, z10, i10);
            vm0Var.currentAccount = this.currentAccount;
            vm0Var.f43624a1 = this.f43624a1;
            vm0Var.Y0 = this.Y0;
            vm0Var.f43628c = this.f43628c;
            vm0Var.f43665s1 = hashMap6;
            vm0Var.f43661r0 = z10;
            vm0Var.f43667t1 = hashMap2;
            vm0Var.C = arrayList;
            if (i12 == 4) {
                vm0Var.Z0 = this.Z0;
            }
            presentFragment(vm0Var);
        }
    }

    public final void F1(int i10) {
        if (i10 == 0) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 && getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
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
                    this.M0 = generatePicturePath.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public final void G1(ArrayList arrayList) {
        boolean z10;
        if (arrayList.isEmpty()) {
            return;
        }
        int i10 = this.O0;
        boolean z11 = true;
        if (i10 != 1 && i10 != 4 && (this.A.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            int i11 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.U;
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
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.k0(this.O0, 7, this, arrayList, z10));
    }

    public final TLRPC.TL_secureValue H1(TLRPC.TL_secureRequiredType tL_secureRequiredType) {
        if (tL_secureRequiredType == null) {
            return null;
        }
        int size = this.f43678y.values.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (tL_secureRequiredType.type.getClass() == this.f43678y.values.get(i10).type.getClass()) {
                return this.f43678y.values.remove(i10);
            }
        }
        return null;
    }

    public final void I1(View view) {
        while (view != null && this.Y.indexOfChild(view) < 0) {
            view = (View) view.getParent();
        }
        if (view != null) {
            this.X.smoothScrollTo(0, view.getTop() - ((this.X.getMeasuredHeight() - view.getMeasuredHeight()) / 2));
        }
    }

    public final void J1(HashMap hashMap, EditTextBoldCursor editTextBoldCursor, String str) {
        CharSequence charSequence;
        CharSequence charSequence2;
        String str2 = (String) hashMap.get(str);
        if (str2 != null) {
            char c3 = 65535;
            switch (str.hashCode()) {
                case -2006252145:
                    if (str.equals("residence_country_code")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case -1249512767:
                    if (str.equals("gender")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 475919162:
                    if (str.equals("expiry_date")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 1481071862:
                    if (str.equals("country_code")) {
                        c3 = 3;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    this.v = str2;
                    CharSequence charSequence3 = (String) this.U0.get(str2);
                    if (charSequence3 != null) {
                        editTextBoldCursor.setText(charSequence3);
                        break;
                    }
                    break;
                case 1:
                    if ("male".equals(str2)) {
                        this.f43672w = str2;
                        editTextBoldCursor.setText(LocaleController.getString(R.string.PassportMale));
                        break;
                    } else if ("female".equals(str2)) {
                        this.f43672w = str2;
                        editTextBoldCursor.setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                    break;
                case 2:
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    int[] iArr = this.f43675x;
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
                    this.f43663s = str2;
                    CharSequence charSequence4 = (String) this.U0.get(str2);
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
        HashMap hashMap2 = this.f43665s1;
        HashMap hashMap3 = this.f43669u1;
        if (hashMap2 != null && (charSequence2 = (String) hashMap2.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence2);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
            return;
        }
        HashMap hashMap4 = this.f43667t1;
        if (hashMap4 != null && (charSequence = (String) hashMap4.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
        }
    }

    public final void K1(Bundle bundle, int i10, boolean z10) {
        if (i10 == 3) {
            this.H.setVisibility(8);
        }
        int i11 = this.E1;
        org.telegram.ui.Components.mv0[] mv0VarArr = this.F1;
        org.telegram.ui.Components.mv0 mv0Var = mv0VarArr[i11];
        org.telegram.ui.Components.mv0 mv0Var2 = mv0VarArr[i10];
        this.E1 = i10;
        mv0Var2.m(bundle, false);
        mv0Var2.j();
        if (z10) {
            mv0Var2.setTranslationX(AndroidUtilities.displaySize.x);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.setDuration(300L);
            animatorSet.playTogether(ObjectAnimator.ofFloat(mv0Var, "translationX", -AndroidUtilities.displaySize.x), ObjectAnimator.ofFloat(mv0Var2, "translationX", 0.0f));
            animatorSet.addListener(new org.telegram.ui.Components.ok0(mv0Var2, mv0Var, 9));
            animatorSet.start();
            return;
        }
        mv0Var2.setTranslationX(0.0f);
        mv0Var2.setVisibility(0);
        if (mv0Var != mv0Var2) {
            mv0Var.setVisibility(8);
        }
    }

    public final void L1(org.telegram.tgnet.TLRPC.TL_secureRequiredType r31, java.lang.String r32, java.lang.String r33, org.telegram.tgnet.TLRPC.TL_secureRequiredType r34, java.lang.String r35, boolean r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vm0.L1(org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, boolean, int):void");
    }

    public final void M1(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = str;
        c2Var.P = str2;
        showDialog(c2Var);
    }

    public final void N1(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.I;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10 && this.H != null) {
            this.I = new AnimatorSet();
            if (z11) {
                this.J.setVisibility(0);
                this.H.setEnabled(false);
                AnimatorSet animatorSet2 = this.I;
                View contentView = this.H.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(contentView, property, 0.1f);
                View contentView2 = this.H.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(contentView2, property2, 0.1f);
                View contentView3 = this.H.getContentView();
                Property property3 = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, property3, 0.0f), ObjectAnimator.ofFloat(this.J, property, 1.0f), ObjectAnimator.ofFloat(this.J, property2, 1.0f), ObjectAnimator.ofFloat(this.J, property3, 1.0f));
            } else {
                this.H.getContentView().setVisibility(0);
                this.H.setEnabled(true);
                AnimatorSet animatorSet3 = this.I;
                org.telegram.ui.Components.nq nqVar = this.J;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(nqVar, property4, 0.1f);
                org.telegram.ui.Components.nq nqVar2 = this.J;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(nqVar2, property5, 0.1f);
                org.telegram.ui.Components.nq nqVar3 = this.J;
                Property property6 = View.ALPHA;
                animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(nqVar3, property6, 0.0f), ObjectAnimator.ofFloat(this.H.getContentView(), property4, 1.0f), ObjectAnimator.ofFloat(this.H.getContentView(), property5, 1.0f), ObjectAnimator.ofFloat(this.H.getContentView(), property6, 1.0f));
            }
            this.I.addListener(new zl0(this, z11, 0));
            this.I.setDuration(150L);
            this.I.start();
        } else if (this.K != null) {
            this.I = new AnimatorSet();
            if (z11) {
                this.L.setVisibility(0);
                this.M.setEnabled(false);
                AnimatorSet animatorSet4 = this.I;
                TextView textView = this.K;
                Property property7 = View.SCALE_X;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView, property7, 0.1f);
                TextView textView2 = this.K;
                Property property8 = View.SCALE_Y;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView2, property8, 0.1f);
                TextView textView3 = this.K;
                Property property9 = View.ALPHA;
                animatorSet4.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, property9, 0.0f), ObjectAnimator.ofFloat(this.L, property7, 1.0f), ObjectAnimator.ofFloat(this.L, property8, 1.0f), ObjectAnimator.ofFloat(this.L, property9, 1.0f));
            } else {
                this.K.setVisibility(0);
                this.M.setEnabled(true);
                AnimatorSet animatorSet5 = this.I;
                org.telegram.ui.Components.nq nqVar4 = this.L;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(nqVar4, property10, 0.1f);
                org.telegram.ui.Components.nq nqVar5 = this.L;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(nqVar5, property11, 0.1f);
                org.telegram.ui.Components.nq nqVar6 = this.L;
                Property property12 = View.ALPHA;
                animatorSet5.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(nqVar6, property12, 0.0f), ObjectAnimator.ofFloat(this.K, property10, 1.0f), ObjectAnimator.ofFloat(this.K, property11, 1.0f), ObjectAnimator.ofFloat(this.K, property12, 1.0f));
            }
            this.I.addListener(new zl0(this, z11, 1));
            this.I.setDuration(150L);
            this.I.start();
        }
    }

    public final void O1(boolean z10, String str, Runnable runnable, jm0 jm0Var, lm0 lm0Var) {
        boolean z11;
        boolean z12;
        boolean z13;
        TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        if (telephonyManager.getSimState() != 1 && telephonyManager.getPhoneType() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (getParentActivity() != null && Build.VERSION.SDK_INT >= 23 && z11) {
            if (getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10) {
                this.I1.clear();
                if (!z12) {
                    this.I1.add("android.permission.READ_PHONE_STATE");
                }
                if (!this.I1.isEmpty()) {
                    if (getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.AllowReadCall);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                        c2Var.P = string;
                        this.H1 = showDialog(c2Var);
                    } else {
                        getParentActivity().requestPermissions((String[]) this.I1.toArray(new String[0]), 6);
                    }
                    this.A1 = str;
                    this.C1 = jm0Var;
                    this.B1 = runnable;
                    this.D1 = lm0Var;
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
            } catch (Exception e10) {
                sendverifyphonecode.settings.allow_flashcall = false;
                FileLog.e(e10);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendverifyphonecode, new ih.c1(this, str, lm0Var, sendverifyphonecode, 13), 2);
    }

    public final void P1() {
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.B;
        if (tL_secureRequiredType != null) {
            this.actionBar.setTitle(q1(tL_secureRequiredType.type));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.PassportPersonal));
        }
        S1(2);
        S1(3);
        S1(1);
        S1(4);
    }

    public final void Q1() {
        if (this.f43678y.values.isEmpty()) {
            this.f43673w0.setVisibility(0);
            this.f43641h0.setVisibility(8);
            this.f43637f0.setVisibility(8);
            this.f43666t0.setVisibility(8);
            this.f43668u0.setVisibility(8);
            this.f43670v0.setVisibility(8);
            return;
        }
        this.f43673w0.setVisibility(8);
        this.f43641h0.setVisibility(0);
        this.f43637f0.setVisibility(0);
        this.f43668u0.setVisibility(0);
        this.f43670v0.setVisibility(0);
        if (!s1(TLRPC.TL_secureValueTypePhone.class) && !s1(TLRPC.TL_secureValueTypeEmail.class) && !s1(TLRPC.TL_secureValueTypePersonalDetails.class) && !s1(TLRPC.TL_secureValueTypePassport.class) && !s1(TLRPC.TL_secureValueTypeInternalPassport.class) && !s1(TLRPC.TL_secureValueTypeIdentityCard.class) && !s1(TLRPC.TL_secureValueTypeDriverLicense.class) && !s1(TLRPC.TL_secureValueTypeAddress.class) && !s1(TLRPC.TL_secureValueTypeUtilityBill.class) && !s1(TLRPC.TL_secureValueTypePassportRegistration.class) && !s1(TLRPC.TL_secureValueTypeTemporaryRegistration.class) && !s1(TLRPC.TL_secureValueTypeBankStatement.class) && !s1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            this.f43666t0.setVisibility(8);
        } else {
            this.f43666t0.setVisibility(0);
        }
    }

    public final void R0(final SecureDocument secureDocument, final int i10) {
        String string;
        final String str;
        String formatDateForBan;
        HashMap hashMap;
        if (i10 == 1) {
            this.f43638f1 = secureDocument;
            if (this.f43629c0 == null) {
                return;
            }
        } else if (i10 == 4) {
            this.f43640g1.add(secureDocument);
            if (this.f43631d0 == null) {
                return;
            }
        } else if (i10 == 2) {
            this.f43642h1 = secureDocument;
            if (this.f43623a0 == null) {
                return;
            }
        } else if (i10 == 3) {
            this.f43644i1 = secureDocument;
            if (this.f43626b0 == null) {
                return;
            }
        } else {
            this.f43635e1.add(secureDocument);
            if (this.Z == null) {
                return;
            }
        }
        if (getParentActivity() == null) {
            return;
        }
        final tm0 tm0Var = new tm0(this, getParentActivity());
        tm0Var.setTag(secureDocument);
        tm0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
        this.f43646j1.put(secureDocument, tm0Var);
        String n12 = n1(secureDocument);
        if (i10 == 1) {
            string = LocaleController.getString(R.string.PassportSelfie);
            this.f43629c0.addView(tm0Var, i7.f6.n(-1, -2));
            str = "selfie" + n12;
        } else if (i10 == 4) {
            string = LocaleController.getString(R.string.AttachPhoto);
            this.f43631d0.addView(tm0Var, i7.f6.n(-1, -2));
            str = "translation" + n12;
        } else if (i10 == 2) {
            TLRPC.SecureValueType secureValueType = this.B.type;
            if (!(secureValueType instanceof TLRPC.TL_secureValueTypePassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                string = LocaleController.getString(R.string.PassportFrontSide);
            } else {
                string = LocaleController.getString(R.string.PassportMainPage);
            }
            this.f43623a0.addView(tm0Var, i7.f6.n(-1, -2));
            str = "front" + n12;
        } else if (i10 == 3) {
            string = LocaleController.getString(R.string.PassportReverseSide);
            this.f43626b0.addView(tm0Var, i7.f6.n(-1, -2));
            str = "reverse" + n12;
        } else {
            string = LocaleController.getString(R.string.AttachPhoto);
            this.Z.addView(tm0Var, i7.f6.n(-1, -2));
            str = "files" + n12;
        }
        if (str != null && (hashMap = this.f43667t1) != null && (formatDateForBan = (String) hashMap.get(str)) != null) {
            tm0Var.f42731b.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23279p7, false));
            this.f43669u1.put(str, "");
        } else {
            formatDateForBan = LocaleController.formatDateForBan(secureDocument.secureFile.date);
        }
        tm0Var.f42730a.setText(string);
        tm0Var.f42731b.setText(formatDateForBan);
        org.telegram.ui.Components.t9 t9Var = tm0Var.f42732c;
        t9Var.getClass();
        t9Var.m(ImageLocation.getForSecureDocument(secureDocument), "48_48", null, null, null, null, 0, null);
        tm0Var.f42734f = secureDocument;
        tm0Var.a(false);
        tm0Var.setOnClickListener(new jh.y0(this, i10, 19));
        tm0Var.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                vm0 vm0Var = this;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vm0Var.getParentActivity());
                int i11 = i10;
                if (i11 == 1) {
                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.PassportDeleteSelfie);
                } else {
                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.PassportDeleteScan);
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new bg.p3(vm0Var, secureDocument, i11, tm0Var, str, 6));
                vm0Var.showDialog(alertDialog$Builder.f22714a);
                return true;
            }
        });
    }

    public final void R1() {
        ImageView imageView = this.E0;
        if (imageView != null) {
            TL_account.Password password = this.F;
            if (password != null && this.J0 == 0) {
                if (!password.has_password) {
                    this.C0.setVisibility(0);
                    this.E0.setVisibility(0);
                    this.F0.setVisibility(0);
                    this.G0.setVisibility(0);
                    this.H0.setVisibility(8);
                    this.V[0].setVisibility(8);
                    this.H.setVisibility(8);
                    this.I0.setVisibility(8);
                    this.D0.setVisibility(8);
                    this.C0.setLayoutParams(i7.f6.k(0.0f, 25.0f, 0.0f, 0.0f, -1, -2));
                    this.B0.setVisibility(8);
                    return;
                }
                this.C0.setVisibility(0);
                this.E0.setVisibility(8);
                this.F0.setVisibility(8);
                this.G0.setVisibility(8);
                this.B0.setVisibility(8);
                this.H0.setVisibility(0);
                this.V[0].setVisibility(0);
                this.H.setVisibility(0);
                this.I0.setVisibility(0);
                this.D0.setVisibility(0);
                this.C0.setLayoutParams(i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                if (this.U != null) {
                    TL_account.Password password2 = this.F;
                    if (password2 != null && !TextUtils.isEmpty(password2.hint)) {
                        this.U[0].setHint(this.F.hint);
                        return;
                    } else {
                        this.U[0].setHint(LocaleController.getString(R.string.LoginPassword));
                        return;
                    }
                }
                return;
            }
            imageView.setVisibility(8);
            this.F0.setVisibility(8);
            this.G0.setVisibility(8);
            this.H0.setVisibility(8);
            this.V[0].setVisibility(8);
            this.H.setVisibility(8);
            this.I0.setVisibility(8);
            this.D0.setVisibility(8);
            this.C0.setVisibility(8);
            this.B0.setVisibility(0);
        }
    }

    public final void S0(TLRPC.TL_secureFile tL_secureFile, int i10) {
        byte[] bArr = tL_secureFile.secret;
        byte[] bArr2 = tL_secureFile.file_hash;
        byte[] computeSHA512 = Utilities.computeSHA512(i1(bArr, bArr2), bArr2);
        byte[] bArr3 = new byte[32];
        System.arraycopy(computeSHA512, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(computeSHA512, 32, bArr4, 0, 16);
        R0(new SecureDocument(new SecureDocumentKey(bArr3, bArr4), tL_secureFile, null, null, null), i10);
    }

    public final void S1(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vm0.S1(int):void");
    }

    public final void T0(ArrayList arrayList) {
        this.f43635e1.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i10);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                S0((TLRPC.TL_secureFile) secureFile, 0);
            }
        }
    }

    public final org.telegram.ui.um0 U0(android.content.Context r28, org.telegram.tgnet.TLRPC.TL_secureRequiredType r29, java.util.ArrayList r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vm0.U0(android.content.Context, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.util.ArrayList, boolean, boolean):org.telegram.ui.um0");
    }

    public final void V0(ArrayList arrayList) {
        this.f43640g1.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i10);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                S0((TLRPC.TL_secureFile) secureFile, 4);
            }
        }
    }

    public final void W0(boolean z10) {
        int i10;
        if (!this.f43630c1) {
            String str = this.f43651n;
            boolean isEmpty = TextUtils.isEmpty(str);
            int i11 = this.f43625b;
            if (!isEmpty) {
                if (z10) {
                    Activity parentActivity = getParentActivity();
                    ye.d.p(parentActivity, Uri.parse(str + "&tg_passport=success"), true, true);
                } else if (!this.f43627b1 && (i11 == 5 || i11 == 0)) {
                    Activity parentActivity2 = getParentActivity();
                    ye.d.p(parentActivity2, Uri.parse(str + "&tg_passport=cancel"), true, true);
                }
                this.f43630c1 = true;
            } else if (this.f43680y1) {
                if (z10 || (!this.f43627b1 && (i11 == 5 || i11 == 0))) {
                    Activity parentActivity3 = getParentActivity();
                    if (z10) {
                        i10 = -1;
                    } else {
                        i10 = 0;
                    }
                    parentActivity3.setResult(i10);
                }
                this.f43630c1 = true;
            }
        }
    }

    public final boolean X0(boolean z10) {
        if (u1()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new hl0(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.DiscardChanges);
            String string = LocaleController.getString(R.string.PassportDiscardChanges);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.P = string;
            showDialog(c2Var);
            return true;
        }
        return true;
    }

    public final void Y0(boolean z10) {
        String str;
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.W != null) {
            String str2 = (String) this.U0.get(this.v);
            String str3 = SharedConfig.getCountryLangs().get(this.v);
            int i10 = 0;
            if (this.A.native_names && !TextUtils.isEmpty(this.v) && !"EN".equals(str3)) {
                if (this.m0.getVisibility() != 0) {
                    this.m0.setVisibility(0);
                    this.f43637f0.setVisibility(0);
                    this.P.setVisibility(0);
                    int i11 = 0;
                    while (true) {
                        editTextBoldCursorArr = this.W;
                        if (i11 >= editTextBoldCursorArr.length) {
                            break;
                        }
                        ((View) editTextBoldCursorArr[i11].getParent()).setVisibility(0);
                        i11++;
                    }
                    if (editTextBoldCursorArr[0].length() == 0 && this.W[1].length() == 0 && this.W[2].length() == 0) {
                        int i12 = 0;
                        while (true) {
                            boolean[] zArr = this.f43656p0;
                            if (i12 >= zArr.length) {
                                break;
                            } else if (zArr[i12]) {
                                this.W[0].setText(this.U[0].getText());
                                this.W[1].setText(this.U[1].getText());
                                this.W[2].setText(this.U[2].getText());
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    this.f43643i0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23028b7));
                }
                this.m0.setText(LocaleController.formatString("PassportNativeInfo", R.string.PassportNativeInfo, str2));
                if (str3 != null) {
                    str = LocaleController.getServerString("PassportLanguage_".concat(str3));
                } else {
                    str = null;
                }
                if (str != null) {
                    this.f43637f0.setText(LocaleController.formatString("PassportNativeHeaderLang", R.string.PassportNativeHeaderLang, str));
                } else {
                    this.f43637f0.setText(LocaleController.getString(R.string.PassportNativeHeader));
                }
                for (int i13 = 0; i13 < 3; i13++) {
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 == 2) {
                                if (str != null) {
                                    this.W[i13].setHintText(LocaleController.getString(R.string.PassportSurname));
                                } else {
                                    this.W[i13].setHintText(LocaleController.formatString("PassportSurnameCountry", R.string.PassportSurnameCountry, str2));
                                }
                            }
                        } else if (str != null) {
                            this.W[i13].setHintText(LocaleController.getString(R.string.PassportMidname));
                        } else {
                            this.W[i13].setHintText(LocaleController.formatString("PassportMidnameCountry", R.string.PassportMidnameCountry, str2));
                        }
                    } else if (str != null) {
                        this.W[i13].setHintText(LocaleController.getString(R.string.PassportName));
                    } else {
                        this.W[i13].setHintText(LocaleController.formatString("PassportNameCountry", R.string.PassportNameCountry, str2));
                    }
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new el0(this, 2));
                }
            } else if (this.m0.getVisibility() != 8) {
                this.m0.setVisibility(8);
                this.f43637f0.setVisibility(8);
                this.P.setVisibility(8);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.W;
                    if (i10 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    ((View) editTextBoldCursorArr2[i10].getParent()).setVisibility(8);
                    i10++;
                }
                if (((this.f43628c != 0 || this.B == null) && this.D != null && !this.f43661r0) || this.E != null) {
                    this.f43643i0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23028b7));
                } else {
                    this.f43643i0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7));
                }
            }
        }
    }

    public final void a1(boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        String str2;
        if (this.f43649l0 != null) {
            HashMap hashMap = this.f43665s1;
            HashMap hashMap2 = this.f43669u1;
            if (hashMap != null && ((z10 || hashMap2.containsKey("error_all")) && (str2 = (String) this.f43665s1.get("error_all")) != null)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
                if (z10) {
                    hashMap2.put("error_all", "");
                }
            } else {
                spannableStringBuilder = null;
            }
            if (this.f43667t1 != null && ((z10 || hashMap2.containsKey("error_document_all")) && (str = (String) this.f43667t1.get("error_all")) != null)) {
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
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23279p7, false)), 0, spannableStringBuilder.length(), 33);
                this.f43649l0.setText(spannableStringBuilder);
                this.f43649l0.setVisibility(0);
            } else if (this.f43649l0.getVisibility() != 8) {
                this.f43649l0.setVisibility(8);
            }
        }
    }

    public final void b1(Context context) {
        long j10;
        String str;
        this.U0 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.U0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
        this.f43649l0 = y8Var;
        int i10 = R.drawable.greydivider_top;
        int i11 = org.telegram.ui.ActionBar.g6.f23028b7;
        y8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, i10, i11));
        this.f43649l0.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.Y.addView(this.f43649l0, i7.f6.n(-1, -2));
        a1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.B;
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
            org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context);
            this.f43637f0 = k4Var;
            k4Var.setText(LocaleController.getString(R.string.PassportDocuments));
            org.telegram.ui.Cells.k4 k4Var2 = this.f43637f0;
            int i12 = org.telegram.ui.ActionBar.g6.f23062d6;
            k4Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            this.Y.addView(this.f43637f0, i7.f6.n(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.Z = linearLayout;
            linearLayout.setOrientation(1);
            this.Y.addView(this.Z, i7.f6.n(-1, -2));
            org.telegram.ui.Cells.y9 y9Var = new org.telegram.ui.Cells.y9(context);
            this.N = y9Var;
            y9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
            this.Y.addView(this.N, i7.f6.n(-1, -2));
            this.N.setOnClickListener(new fl0(this, 7));
            org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context);
            this.f43645j0 = y8Var2;
            y8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, i11));
            if (this.f43628c != 0) {
                this.f43671v1 = LocaleController.getString(R.string.PassportAddAddressUploadInfo);
            } else {
                TLRPC.SecureValueType secureValueType2 = this.B.type;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                    this.f43671v1 = LocaleController.getString(R.string.PassportAddAgreementInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                    this.f43671v1 = LocaleController.getString(R.string.PassportAddBillInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                    this.f43671v1 = LocaleController.getString(R.string.PassportAddPassportRegistrationInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                    this.f43671v1 = LocaleController.getString(R.string.PassportAddTemporaryRegistrationInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                    this.f43671v1 = LocaleController.getString(R.string.PassportAddBankInfo);
                } else {
                    this.f43671v1 = "";
                }
            }
            String str2 = this.f43671v1;
            HashMap hashMap = this.f43667t1;
            j10 = 0;
            HashMap hashMap2 = this.f43669u1;
            String str3 = str2;
            if (hashMap != null) {
                String str4 = (String) hashMap.get("files_all");
                str3 = str2;
                if (str4 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                    spannableStringBuilder.append((CharSequence) this.f43671v1);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23279p7, false)), 0, str4.length(), 33);
                    hashMap2.put("files_all", "");
                    str3 = spannableStringBuilder;
                }
            }
            this.f43645j0.setText(str3);
            this.Y.addView(this.f43645j0, i7.f6.n(-1, -2));
            if (this.B.translation_required) {
                org.telegram.ui.Cells.k4 k4Var3 = new org.telegram.ui.Cells.k4(context);
                this.f43637f0 = k4Var3;
                k4Var3.setText(LocaleController.getString(R.string.PassportTranslation));
                this.f43637f0.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                this.Y.addView(this.f43637f0, i7.f6.n(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.f43631d0 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.Y.addView(this.f43631d0, i7.f6.n(-1, -2));
                org.telegram.ui.Cells.y9 y9Var2 = new org.telegram.ui.Cells.y9(context);
                this.T = y9Var2;
                y9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                this.Y.addView(this.T, i7.f6.n(-1, -2));
                this.T.setOnClickListener(new fl0(this, 8));
                org.telegram.ui.Cells.y8 y8Var3 = new org.telegram.ui.Cells.y8(context);
                this.f43647k0 = y8Var3;
                y8Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, i11));
                if (this.f43628c != 0) {
                    this.f43674w1 = LocaleController.getString(R.string.PassportAddTranslationUploadInfo);
                } else {
                    TLRPC.SecureValueType secureValueType3 = this.B.type;
                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                        this.f43674w1 = LocaleController.getString(R.string.PassportAddTranslationAgreementInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                        this.f43674w1 = LocaleController.getString(R.string.PassportAddTranslationBillInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                        this.f43674w1 = LocaleController.getString(R.string.PassportAddTranslationPassportRegistrationInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                        this.f43674w1 = LocaleController.getString(R.string.PassportAddTranslationTemporaryRegistrationInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                        this.f43674w1 = LocaleController.getString(R.string.PassportAddTranslationBankInfo);
                    } else {
                        this.f43674w1 = "";
                    }
                }
                String str5 = this.f43674w1;
                HashMap hashMap3 = this.f43667t1;
                String str6 = str5;
                if (hashMap3 != null) {
                    String str7 = (String) hashMap3.get("translation_all");
                    str6 = str5;
                    if (str7 != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str7);
                        spannableStringBuilder2.append((CharSequence) "\n\n");
                        spannableStringBuilder2.append((CharSequence) this.f43674w1);
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23279p7, false)), 0, str7.length(), 33);
                        hashMap2.put("translation_all", "");
                        str6 = spannableStringBuilder2;
                    }
                }
                this.f43647k0.setText(str6);
                this.Y.addView(this.f43647k0, i7.f6.n(-1, -2));
            }
        } else {
            j10 = 0;
            this.actionBar.setTitle(LocaleController.getString(R.string.PassportAddress));
        }
        org.telegram.ui.Cells.k4 k4Var4 = new org.telegram.ui.Cells.k4(context);
        this.f43637f0 = k4Var4;
        k4Var4.setText(LocaleController.getString(R.string.PassportAddressHeader));
        this.f43637f0.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        this.Y.addView(this.f43637f0, i7.f6.n(-1, -2));
        this.U = new EditTextBoldCursor[6];
        for (int i13 = 0; i13 < 6; i13++) {
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.U[i13] = editTextBoldCursor;
            pl0 pl0Var = new pl0(context, editTextBoldCursor, 0);
            pl0Var.setWillNotDraw(false);
            this.Y.addView(pl0Var, i7.f6.n(-1, -2));
            int i14 = org.telegram.ui.ActionBar.g6.f23062d6;
            pl0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
            int i15 = 5;
            if (i13 == 5) {
                View view = new View(context);
                this.O = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
                this.Y.addView(this.O, i7.f6.n(-1, 6));
            }
            if (this.f43661r0 && this.B != null) {
                pl0Var.setVisibility(8);
                View view2 = this.O;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            this.U[i13].setTag(Integer.valueOf(i13));
            this.U[i13].setSupportRtlHint(true);
            this.U[i13].setTextSize(1, 16.0f);
            this.U[i13].setHintColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
            this.U[i13].setHeaderHintColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L6, false));
            this.U[i13].setTransformHintToHeader(true);
            EditTextBoldCursor editTextBoldCursor2 = this.U[i13];
            int i16 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
            this.U[i13].setBackgroundDrawable(null);
            this.U[i13].setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
            this.U[i13].setCursorSize(AndroidUtilities.dp(20.0f));
            this.U[i13].setCursorWidth(1.5f);
            this.U[i13].setLineColors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23189k6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23206l6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23279p7, false));
            if (i13 == 5) {
                this.U[i13].setOnTouchListener(new gl0(this, 2));
                this.U[i13].setInputType(0);
                this.U[i13].setFocusable(false);
            } else {
                this.U[i13].setInputType(16385);
                this.U[i13].setImeOptions(268435461);
            }
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 != 4) {
                                if (i13 == 5) {
                                    this.U[i13].setHintText(LocaleController.getString(R.string.PassportCountry));
                                    str = "country_code";
                                }
                            } else {
                                this.U[i13].setHintText(LocaleController.getString(R.string.PassportState));
                                str = "state";
                            }
                        } else {
                            this.U[i13].setHintText(LocaleController.getString(R.string.PassportCity));
                            str = "city";
                        }
                    } else {
                        this.U[i13].setHintText(LocaleController.getString(R.string.PassportPostcode));
                        str = "post_code";
                    }
                } else {
                    this.U[i13].setHintText(LocaleController.getString(R.string.PassportStreet2));
                    str = "street_line2";
                }
            } else {
                this.U[i13].setHintText(LocaleController.getString(R.string.PassportStreet1));
                str = "street_line1";
            }
            J1(this.f43655o1, this.U[i13], str);
            if (i13 == 2) {
                this.U[i13].addTextChangedListener(new ql0(this, editTextBoldCursor, str));
                this.U[i13].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            } else {
                this.U[i13].addTextChangedListener(new rl0(this, editTextBoldCursor, str, 0));
            }
            EditTextBoldCursor editTextBoldCursor3 = this.U[i13];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.U[i13].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.U[i13];
            if (!LocaleController.isRTL) {
                i15 = 3;
            }
            editTextBoldCursor4.setGravity(i15 | 16);
            pl0Var.addView(this.U[i13], i7.f6.d(-1, 64.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
            this.U[i13].setOnEditorActionListener(new dl0(this, 4));
        }
        org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context, (b) null);
        this.f43641h0 = x6Var;
        this.Y.addView(x6Var, i7.f6.n(-1, -2));
        if (this.f43661r0 && this.B != null) {
            this.f43637f0.setVisibility(8);
            this.f43641h0.setVisibility(8);
        }
        long j11 = this.f43628c;
        TLRPC.TL_secureValue tL_secureValue = this.E;
        if (((j11 != j10 || this.B == null) && this.D != null && !this.f43661r0) || tL_secureValue != null) {
            if (tL_secureValue != null) {
                T0(tL_secureValue.files);
                V0(tL_secureValue.translation);
            }
            org.telegram.ui.Cells.x6 x6Var2 = this.f43641h0;
            int i17 = R.drawable.greydivider;
            int i18 = org.telegram.ui.ActionBar.g6.f23028b7;
            x6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, i17, i18));
            org.telegram.ui.Cells.y9 y9Var3 = new org.telegram.ui.Cells.y9(context);
            y9Var3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23279p7, false));
            y9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
            if (this.B == null) {
                y9Var3.b(LocaleController.getString(R.string.PassportDeleteInfo), false);
            } else {
                y9Var3.b(LocaleController.getString(R.string.PassportDeleteDocument), false);
            }
            this.Y.addView(y9Var3, i7.f6.n(-1, -2));
            y9Var3.setOnClickListener(new fl0(this, 9));
            org.telegram.ui.Cells.x6 x6Var3 = new org.telegram.ui.Cells.x6(context, (b) null);
            this.f43641h0 = x6Var3;
            x6Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, i18));
            this.Y.addView(this.f43641h0, i7.f6.n(-1, -2));
        } else {
            org.telegram.ui.Cells.x6 x6Var4 = this.f43641h0;
            int i19 = R.drawable.greydivider_bottom;
            int i20 = org.telegram.ui.ActionBar.g6.f23028b7;
            x6Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, i19, i20));
            if (this.f43661r0 && this.B != null) {
                this.f43645j0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, i20));
            }
        }
        S1(0);
        S1(4);
    }

    public final void c1() {
        if (getParentActivity() != null && this.N0 == null) {
            org.telegram.ui.Components.ni niVar = new org.telegram.ui.Components.ni(getParentActivity(), this, false, false);
            this.N0 = niVar;
            niVar.V1 = new am0(this);
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vm0.createView(android.content.Context):android.view.View");
    }

    public final void d1() {
        int dp;
        int dp2;
        boolean[] zArr = {true};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new kl0(0, this, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = string;
        boolean z10 = this.f43661r0;
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.A;
        if (z10 && this.B == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeAddress)) {
            c2Var.P = LocaleController.getString(R.string.PassportDeleteAddressAlert);
        } else if (z10 && this.B == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            c2Var.P = LocaleController.getString(R.string.PassportDeletePersonalAlert);
        } else {
            c2Var.P = LocaleController.getString(R.string.PassportDeleteDocumentAlert);
        }
        if (!this.f43661r0 && this.B != null) {
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(getParentActivity(), 1);
            y1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                y1Var.e(LocaleController.getString(R.string.PassportDeleteDocumentAddress), "", true, false, false);
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                y1Var.e(LocaleController.getString(R.string.PassportDeleteDocumentPersonal), "", true, false, false);
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
            y1Var.setPadding(dp, 0, dp2, 0);
            frameLayout.addView(y1Var, i7.f6.e(-1, 48, 51));
            y1Var.setOnClickListener(new k8(4, zArr));
            alertDialog$Builder.n(frameLayout);
        }
        showDialog(c2Var);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        EditTextBoldCursor editTextBoldCursor;
        tm0 tm0Var;
        org.telegram.ui.ActionBar.w0 w0Var;
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            HashMap hashMap = this.f43648k1;
            SecureDocument secureDocument = (SecureDocument) hashMap.get(str);
            if (secureDocument != null) {
                secureDocument.inputFile = (TLRPC.TL_inputFile) objArr[1];
                hashMap.remove(str);
                if (hashMap.isEmpty() && (w0Var = this.H) != null) {
                    w0Var.setEnabled(true);
                    this.H.setAlpha(1.0f);
                }
                HashMap hashMap2 = this.f43646j1;
                if (hashMap2 != null && (tm0Var = (tm0) hashMap2.get(secureDocument)) != null) {
                    tm0Var.a(true);
                }
                HashMap hashMap3 = this.f43669u1;
                if (hashMap3 != null && hashMap3.containsKey("error_document_all")) {
                    hashMap3.remove("error_document_all");
                    a1(false);
                }
                int i12 = secureDocument.type;
                if (i12 == 0) {
                    if (this.f43645j0 != null && !TextUtils.isEmpty(this.f43671v1)) {
                        this.f43645j0.setText(this.f43671v1);
                    }
                    hashMap3.remove("files_all");
                } else if (i12 == 4) {
                    if (this.f43647k0 != null && !TextUtils.isEmpty(this.f43674w1)) {
                        this.f43647k0.setText(this.f43674w1);
                    }
                    hashMap3.remove("translation_all");
                }
            }
        } else if (i10 != NotificationCenter.fileUploadFailed && i10 == NotificationCenter.twoStepPasswordChanged) {
            if (objArr != null && objArr.length > 0) {
                Object obj = objArr[7];
                if (obj != null && (editTextBoldCursor = this.U[0]) != null) {
                    editTextBoldCursor.setText((String) obj);
                }
                if (objArr[6] == null) {
                    TL_account.TL_password tL_password = new TL_account.TL_password();
                    this.F = tL_password;
                    tL_password.current_algo = (TLRPC.PasswordKdfAlgo) objArr[1];
                    tL_password.new_secure_algo = (TLRPC.SecurePasswordKdfAlgo) objArr[2];
                    tL_password.secure_random = (byte[]) objArr[3];
                    tL_password.has_recovery = !TextUtils.isEmpty((String) objArr[4]);
                    TL_account.Password password = this.F;
                    password.hint = (String) objArr[5];
                    password.srp_id = -1L;
                    byte[] bArr = new byte[256];
                    password.srp_B = bArr;
                    Utilities.random.nextBytes(bArr);
                    EditTextBoldCursor editTextBoldCursor2 = this.U[0];
                    if (editTextBoldCursor2 != null && editTextBoldCursor2.length() > 0) {
                        this.J0 = 2;
                    }
                }
            } else {
                this.F = null;
                w1();
            }
            R1();
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.ni niVar = this.N0;
        if (niVar != null && this.visibleDialog == niVar) {
            niVar.f31005f0.a0(false);
            this.N0.dismissInternal();
            this.N0.f31005f0.d0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.N0 && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    public final void e1(Context context) {
        long j10;
        int i10;
        String str;
        int i11;
        String str2;
        this.U0 = new HashMap();
        ?? r42 = 1;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.U0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
        this.f43649l0 = y8Var;
        int i12 = R.drawable.greydivider_top;
        int i13 = org.telegram.ui.ActionBar.g6.f23028b7;
        y8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, i12, i13));
        boolean z10 = false;
        this.f43649l0.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        int i14 = -1;
        this.Y.addView(this.f43649l0, i7.f6.n(-1, -2));
        a1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.B;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.A;
        if (tL_secureRequiredType != null) {
            org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context);
            this.f43637f0 = k4Var;
            if (this.f43661r0) {
                k4Var.setText(LocaleController.getString(R.string.PassportDocuments));
            } else {
                k4Var.setText(LocaleController.getString(R.string.PassportRequiredDocuments));
            }
            org.telegram.ui.Cells.k4 k4Var2 = this.f43637f0;
            int i15 = org.telegram.ui.ActionBar.g6.f23062d6;
            k4Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
            this.Y.addView(this.f43637f0, i7.f6.n(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f43623a0 = linearLayout;
            linearLayout.setOrientation(1);
            this.Y.addView(this.f43623a0, i7.f6.n(-1, -2));
            org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
            this.Q = x8Var;
            x8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
            this.Y.addView(this.Q, i7.f6.n(-1, -2));
            this.Q.setOnClickListener(new fl0(this, 0));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.f43626b0 = linearLayout2;
            linearLayout2.setOrientation(1);
            this.Y.addView(this.f43626b0, i7.f6.n(-1, -2));
            boolean z11 = this.B.selfie_required;
            org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context);
            this.R = x8Var2;
            x8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
            j10 = 0;
            this.R.a(LocaleController.getString(R.string.PassportReverseSide), LocaleController.getString(R.string.PassportReverseSideInfo), z11);
            this.Y.addView(this.R, i7.f6.n(-1, -2));
            this.R.setOnClickListener(new fl0(this, 2));
            if (this.B.selfie_required) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.f43629c0 = linearLayout3;
                linearLayout3.setOrientation(1);
                this.Y.addView(this.f43629c0, i7.f6.n(-1, -2));
                org.telegram.ui.Cells.x8 x8Var3 = new org.telegram.ui.Cells.x8(context);
                this.S = x8Var3;
                x8Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                this.S.a(LocaleController.getString(R.string.PassportSelfie), LocaleController.getString(R.string.PassportSelfieInfo), tL_secureRequiredType2.translation_required);
                this.Y.addView(this.S, i7.f6.n(-1, -2));
                this.S.setOnClickListener(new fl0(this, 3));
            }
            org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context);
            this.f43645j0 = y8Var2;
            y8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, i13));
            this.f43645j0.setText(LocaleController.getString(R.string.PassportPersonalUploadInfo));
            this.Y.addView(this.f43645j0, i7.f6.n(-1, -2));
            if (this.B.translation_required) {
                org.telegram.ui.Cells.k4 k4Var3 = new org.telegram.ui.Cells.k4(context);
                this.f43637f0 = k4Var3;
                k4Var3.setText(LocaleController.getString(R.string.PassportTranslation));
                this.f43637f0.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
                this.Y.addView(this.f43637f0, i7.f6.n(-1, -2));
                LinearLayout linearLayout4 = new LinearLayout(context);
                this.f43631d0 = linearLayout4;
                linearLayout4.setOrientation(1);
                this.Y.addView(this.f43631d0, i7.f6.n(-1, -2));
                org.telegram.ui.Cells.y9 y9Var = new org.telegram.ui.Cells.y9(context);
                this.T = y9Var;
                y9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                this.Y.addView(this.T, i7.f6.n(-1, -2));
                this.T.setOnClickListener(new fl0(this, 4));
                org.telegram.ui.Cells.y8 y8Var3 = new org.telegram.ui.Cells.y8(context);
                this.f43647k0 = y8Var3;
                y8Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, i13));
                if (this.f43628c != 0) {
                    this.f43674w1 = LocaleController.getString(R.string.PassportAddTranslationUploadInfo);
                } else {
                    TLRPC.SecureValueType secureValueType = this.B.type;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
                        this.f43674w1 = LocaleController.getString(R.string.PassportAddPassportInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                        this.f43674w1 = LocaleController.getString(R.string.PassportAddInternalPassportInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                        this.f43674w1 = LocaleController.getString(R.string.PassportAddIdentityCardInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                        this.f43674w1 = LocaleController.getString(R.string.PassportAddDriverLicenceInfo);
                    } else {
                        this.f43674w1 = "";
                    }
                }
                String str3 = this.f43674w1;
                HashMap hashMap = this.f43667t1;
                String str4 = str3;
                if (hashMap != null) {
                    String str5 = (String) hashMap.get("translation_all");
                    str4 = str3;
                    if (str5 != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str5);
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) this.f43674w1);
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23279p7, false)), 0, str5.length(), 33);
                        this.f43669u1.put("translation_all", "");
                        str4 = spannableStringBuilder;
                    }
                }
                this.f43647k0.setText(str4);
                this.Y.addView(this.f43647k0, i7.f6.n(-1, -2));
            }
        } else {
            j10 = 0;
            org.telegram.ui.Cells.y9 y9Var2 = new org.telegram.ui.Cells.y9(context);
            this.f43652n0 = y9Var2;
            y9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
            this.f43652n0.b(LocaleController.getString(R.string.PassportScanPassport), false);
            this.Y.addView(this.f43652n0, i7.f6.n(-1, -2));
            this.f43652n0.setOnClickListener(new fl0(this, 5));
            org.telegram.ui.Cells.y8 y8Var4 = new org.telegram.ui.Cells.y8(context);
            this.f43645j0 = y8Var4;
            y8Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, i13));
            this.f43645j0.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            this.Y.addView(this.f43645j0, i7.f6.n(-1, -2));
        }
        org.telegram.ui.Cells.k4 k4Var4 = new org.telegram.ui.Cells.k4(context);
        this.f43637f0 = k4Var4;
        if (this.f43661r0) {
            k4Var4.setText(LocaleController.getString(R.string.PassportDocument));
        } else {
            k4Var4.setText(LocaleController.getString(R.string.PassportPersonal));
        }
        this.f43637f0.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        this.Y.addView(this.f43637f0, i7.f6.n(-1, -2));
        int i16 = 7;
        if (this.B != null) {
            i10 = 9;
        } else {
            i10 = 7;
        }
        this.U = new EditTextBoldCursor[i10];
        int i17 = 0;
        while (true) {
            HashMap hashMap2 = this.f43655o1;
            if (i17 < i10) {
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.U[i17] = editTextBoldCursor;
                pl0 pl0Var = new pl0(context, editTextBoldCursor, 1);
                pl0Var.setWillNotDraw(z10);
                this.Y.addView(pl0Var, i7.f6.n(i14, 64));
                int i18 = org.telegram.ui.ActionBar.g6.f23062d6;
                pl0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i18, z10));
                if (i17 == i10 - 1) {
                    View view = new View(context);
                    this.O = view;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i18, z10));
                    this.Y.addView(this.O, i7.f6.n(i14, 6));
                }
                if (this.f43661r0 && this.B != null && i17 < i16) {
                    pl0Var.setVisibility(8);
                    View view2 = this.O;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                }
                this.U[i17].setTag(Integer.valueOf(i17));
                this.U[i17].setSupportRtlHint(r42);
                this.U[i17].setTextSize(r42, 16.0f);
                this.U[i17].setHintColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
                EditTextBoldCursor editTextBoldCursor2 = this.U[i17];
                int i19 = org.telegram.ui.ActionBar.g6.G6;
                editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i19, false));
                this.U[i17].setHeaderHintColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L6, false));
                this.U[i17].setTransformHintToHeader(r42);
                this.U[i17].setBackgroundDrawable(null);
                this.U[i17].setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i19, false));
                this.U[i17].setCursorSize(AndroidUtilities.dp(20.0f));
                this.U[i17].setCursorWidth(1.5f);
                this.U[i17].setLineColors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23189k6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23206l6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23279p7, false));
                int i20 = 5;
                if (i17 != 5 && i17 != 6) {
                    if (i17 != 3 && i17 != 8) {
                        if (i17 == 4) {
                            this.U[i17].setOnTouchListener(new gl0(this, 1));
                            this.U[i17].setInputType(0);
                            this.U[i17].setFocusable(false);
                        } else {
                            this.U[i17].setInputType(16385);
                            this.U[i17].setImeOptions(268435461);
                        }
                    } else {
                        this.U[i17].setOnTouchListener(new nh.o1(7, this, context));
                        this.U[i17].setInputType(0);
                        this.U[i17].setFocusable(false);
                    }
                } else {
                    this.U[i17].setOnTouchListener(new gl0(this, 0));
                    this.U[i17].setInputType(0);
                }
                HashMap hashMap3 = this.f43657p1;
                switch (i17) {
                    case 0:
                        if (tL_secureRequiredType2.native_names) {
                            this.U[i17].setHintText(LocaleController.getString(R.string.PassportNameLatin));
                        } else {
                            this.U[i17].setHintText(LocaleController.getString(R.string.PassportName));
                        }
                        str2 = "first_name";
                        break;
                    case 1:
                        if (tL_secureRequiredType2.native_names) {
                            this.U[i17].setHintText(LocaleController.getString(R.string.PassportMidnameLatin));
                        } else {
                            this.U[i17].setHintText(LocaleController.getString(R.string.PassportMidname));
                        }
                        str2 = "middle_name";
                        break;
                    case 2:
                        if (tL_secureRequiredType2.native_names) {
                            this.U[i17].setHintText(LocaleController.getString(R.string.PassportSurnameLatin));
                        } else {
                            this.U[i17].setHintText(LocaleController.getString(R.string.PassportSurname));
                        }
                        str2 = "last_name";
                        break;
                    case 3:
                        this.U[i17].setHintText(LocaleController.getString(R.string.PassportBirthdate));
                        str2 = "birth_date";
                        break;
                    case 4:
                        this.U[i17].setHintText(LocaleController.getString(R.string.PassportGender));
                        str2 = "gender";
                        break;
                    case 5:
                        this.U[i17].setHintText(LocaleController.getString(R.string.PassportCitizenship));
                        str2 = "country_code";
                        break;
                    case 6:
                        this.U[i17].setHintText(LocaleController.getString(R.string.PassportResidence));
                        str2 = "residence_country_code";
                        break;
                    case 7:
                        this.U[i17].setHintText(LocaleController.getString(R.string.PassportDocumentNumber));
                        str2 = "document_no";
                        hashMap2 = hashMap3;
                        break;
                    case 8:
                        this.U[i17].setHintText(LocaleController.getString(R.string.PassportExpired));
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
                J1(hashMap2, this.U[i17], str2);
                EditTextBoldCursor editTextBoldCursor3 = this.U[i17];
                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                if (i17 != 0 && i17 != 2 && i17 != 1) {
                    this.U[i17].addTextChangedListener(new org.telegram.ui.Components.bx0(this, editTextBoldCursor, str2, hashMap2));
                } else {
                    this.U[i17].addTextChangedListener(new tl0(this, editTextBoldCursor, str2));
                }
                this.U[i17].setPadding(0, 0, 0, 0);
                EditTextBoldCursor editTextBoldCursor4 = this.U[i17];
                if (!LocaleController.isRTL) {
                    i20 = 3;
                }
                editTextBoldCursor4.setGravity(i20 | 16);
                pl0Var.addView(this.U[i17], i7.f6.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                this.U[i17].setOnEditorActionListener(new dl0(this, 1));
                i17++;
                r42 = 1;
                i16 = 7;
                z10 = false;
                i14 = -1;
            } else {
                org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context, (b) null);
                this.f43643i0 = x6Var;
                this.Y.addView(x6Var, i7.f6.n(-1, -2));
                org.telegram.ui.Cells.k4 k4Var5 = new org.telegram.ui.Cells.k4(context);
                this.f43637f0 = k4Var5;
                k4Var5.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                this.Y.addView(this.f43637f0, i7.f6.n(-1, -2));
                this.W = new EditTextBoldCursor[3];
                int i21 = 0;
                for (int i22 = 3; i21 < i22; i22 = 3) {
                    EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
                    this.W[i21] = editTextBoldCursor5;
                    pl0 pl0Var2 = new pl0(context, editTextBoldCursor5, 2);
                    pl0Var2.setWillNotDraw(false);
                    this.Y.addView(pl0Var2, i7.f6.n(-1, 64));
                    int i23 = org.telegram.ui.ActionBar.g6.f23062d6;
                    pl0Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i23, false));
                    if (i21 == 2) {
                        View view3 = new View(context);
                        this.P = view3;
                        view3.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i23, false));
                        this.Y.addView(this.P, i7.f6.n(-1, 6));
                    }
                    this.W[i21].setTag(Integer.valueOf(i21));
                    this.W[i21].setSupportRtlHint(true);
                    this.W[i21].setTextSize(1, 16.0f);
                    this.W[i21].setHintColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
                    EditTextBoldCursor editTextBoldCursor6 = this.W[i21];
                    int i24 = org.telegram.ui.ActionBar.g6.G6;
                    editTextBoldCursor6.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i24, false));
                    this.W[i21].setHeaderHintColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L6, false));
                    this.W[i21].setTransformHintToHeader(true);
                    this.W[i21].setBackgroundDrawable(null);
                    this.W[i21].setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i24, false));
                    this.W[i21].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.W[i21].setCursorWidth(1.5f);
                    this.W[i21].setLineColors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23189k6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23206l6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23279p7, false));
                    this.W[i21].setInputType(16385);
                    this.W[i21].setImeOptions(268435461);
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
                    J1(hashMap2, this.W[i21], str);
                    EditTextBoldCursor editTextBoldCursor7 = this.W[i21];
                    editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
                    if (i21 == 0 || i21 == 2 || i21 == 1) {
                        this.W[i21].addTextChangedListener(new rl0(this, editTextBoldCursor5, str, 1));
                    }
                    this.W[i21].setPadding(0, 0, 0, 0);
                    EditTextBoldCursor editTextBoldCursor8 = this.W[i21];
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    editTextBoldCursor8.setGravity(i11 | 16);
                    pl0Var2.addView(this.W[i21], i7.f6.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.W[i21].setOnEditorActionListener(new dl0(this, 2));
                    i21++;
                }
                org.telegram.ui.Cells.y8 y8Var5 = new org.telegram.ui.Cells.y8(context);
                this.m0 = y8Var5;
                this.Y.addView(y8Var5, i7.f6.n(-1, -2));
                long j11 = this.f43628c;
                TLRPC.TL_secureValue tL_secureValue = this.E;
                if (((j11 != j10 || this.B == null) && this.D != null && !this.f43661r0) || tL_secureValue != null) {
                    if (tL_secureValue != null) {
                        T0(tL_secureValue.files);
                        TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                        if (secureFile instanceof TLRPC.TL_secureFile) {
                            S0((TLRPC.TL_secureFile) secureFile, 2);
                        }
                        TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                        if (secureFile2 instanceof TLRPC.TL_secureFile) {
                            S0((TLRPC.TL_secureFile) secureFile2, 3);
                        }
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            S0((TLRPC.TL_secureFile) secureFile3, 1);
                        }
                        V0(tL_secureValue.translation);
                    }
                    org.telegram.ui.Cells.y9 y9Var3 = new org.telegram.ui.Cells.y9(context);
                    y9Var3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23279p7, false));
                    y9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                    if (this.B == null) {
                        y9Var3.b(LocaleController.getString(R.string.PassportDeleteInfo), false);
                    } else {
                        y9Var3.b(LocaleController.getString(R.string.PassportDeleteDocument), false);
                    }
                    this.Y.addView(y9Var3, i7.f6.n(-1, -2));
                    y9Var3.setOnClickListener(new fl0(this, 1));
                    org.telegram.ui.Cells.y8 y8Var6 = this.m0;
                    int i25 = R.drawable.greydivider;
                    int i26 = org.telegram.ui.ActionBar.g6.f23028b7;
                    y8Var6.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, i25, i26));
                    org.telegram.ui.Cells.x6 x6Var2 = new org.telegram.ui.Cells.x6(context, (b) null);
                    this.f43641h0 = x6Var2;
                    x6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, i26));
                    this.Y.addView(this.f43641h0, i7.f6.n(-1, -2));
                } else {
                    this.m0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7));
                }
                P1();
                Y0(false);
                return;
            }
        }
    }

    public final void f1(android.content.Context r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vm0.f1(android.content.Context):void");
    }

    public final void g1(Context context) {
        String str;
        ViewGroup frameLayout;
        this.actionBar.setTitle(LocaleController.getString(R.string.PassportPhone));
        this.U0 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.Q0.add(0, split[2]);
                this.R0.put(split[2], split[0]);
                this.S0.put(split[0], split[2]);
                if (split.length > 3) {
                    this.T0.put(split[0], split[3]);
                }
                this.U0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Collections.sort(this.Q0, new c5.e(13));
        String str2 = UserConfig.getInstance(this.currentAccount).getCurrentUser().phone;
        org.telegram.ui.Cells.y9 y9Var = new org.telegram.ui.Cells.y9(context);
        String str3 = null;
        y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
        y9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
        int i10 = R.string.PassportPhoneUseSame;
        qe.b c3 = qe.b.c();
        y9Var.b(LocaleController.formatString("PassportPhoneUseSame", i10, c3.b("+" + str2)), false);
        this.Y.addView(y9Var, i7.f6.n(-1, -2));
        y9Var.setOnClickListener(new fl0(this, 16));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
        this.f43645j0 = y8Var;
        y8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7));
        this.f43645j0.setText(LocaleController.getString(R.string.PassportPhoneUseSameInfo));
        this.Y.addView(this.f43645j0, i7.f6.n(-1, -2));
        org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context);
        this.f43637f0 = k4Var;
        k4Var.setText(LocaleController.getString(R.string.PassportPhoneUseOther));
        this.f43637f0.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        this.Y.addView(this.f43637f0, i7.f6.n(-1, -2));
        this.U = new EditTextBoldCursor[3];
        for (int i11 = 0; i11 < 3; i11++) {
            if (i11 == 2) {
                this.U[i11] = new org.telegram.ui.Components.d40(context);
            } else {
                this.U[i11] = new EditTextBoldCursor(context);
            }
            if (i11 == 1) {
                frameLayout = org.telegram.messenger.x3.g(context, 0);
                this.Y.addView(frameLayout, i7.f6.n(-1, 50));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
            } else if (i11 == 2) {
                frameLayout = (ViewGroup) this.U[1].getParent();
            } else {
                frameLayout = new FrameLayout(context);
                this.Y.addView(frameLayout, i7.f6.n(-1, 50));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
            }
            this.U[i11].setTag(Integer.valueOf(i11));
            this.U[i11].setTextSize(1, 16.0f);
            this.U[i11].setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.U[i11];
            int i12 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            this.U[i11].setBackgroundDrawable(null);
            this.U[i11].setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            this.U[i11].setCursorSize(AndroidUtilities.dp(20.0f));
            this.U[i11].setCursorWidth(1.5f);
            if (i11 == 0) {
                this.U[i11].setOnTouchListener(new gl0(this, 3));
                this.U[i11].setText(LocaleController.getString(R.string.ChooseCountry));
                this.U[i11].setInputType(0);
                this.U[i11].setFocusable(false);
            } else {
                this.U[i11].setInputType(3);
                if (i11 == 2) {
                    this.U[i11].setImeOptions(268435462);
                } else {
                    this.U[i11].setImeOptions(268435461);
                }
            }
            EditTextBoldCursor editTextBoldCursor2 = this.U[i11];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            int i13 = 5;
            if (i11 == 1) {
                TextView textView = new TextView(context);
                this.f43664s0 = textView;
                textView.setText("+");
                this.f43664s0.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                this.f43664s0.setTextSize(1, 16.0f);
                frameLayout.addView(this.f43664s0, i7.f6.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                this.U[i11].setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
                this.U[i11].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                this.U[i11].setGravity(19);
                frameLayout.addView(this.U[i11], i7.f6.k(0.0f, 12.0f, 16.0f, 6.0f, 55, -2));
                this.U[i11].addTextChangedListener(new im0(this));
            } else if (i11 == 2) {
                this.U[i11].setPadding(0, 0, 0, 0);
                this.U[i11].setGravity(19);
                this.U[i11].setHintText(null);
                this.U[i11].setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                frameLayout.addView(this.U[i11], i7.f6.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                this.U[i11].addTextChangedListener(new rr(this, 3));
            } else {
                this.U[i11].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                EditTextBoldCursor editTextBoldCursor3 = this.U[i11];
                if (!LocaleController.isRTL) {
                    i13 = 3;
                }
                editTextBoldCursor3.setGravity(i13);
                frameLayout.addView(this.U[i11], i7.f6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            }
            this.U[i11].setOnEditorActionListener(new dl0(this, 0));
            if (i11 == 2) {
                this.U[i11].setOnKeyListener(new jg(this, 1));
            }
            if (i11 == 0) {
                View view = new View(context);
                this.f43639g0.add(view);
                view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23063d7, false));
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
            }
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (telephonyManager != null) {
                str3 = telephonyManager.getSimCountryIso().toUpperCase();
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        if (str3 != null && (str = (String) this.U0.get(str3)) != null && this.Q0.indexOf(str) != -1) {
            this.U[1].setText((CharSequence) this.R0.get(str));
        }
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context);
        this.f43645j0 = y8Var2;
        y8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7));
        this.f43645j0.setText(LocaleController.getString(R.string.PassportPhoneUploadInfo));
        this.Y.addView(this.f43645j0, i7.f6.n(-1, -2));
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23329s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.X, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        View view = this.O;
        int i12 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i12));
        View view2 = this.P;
        if (view2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(view2, 1, null, null, null, null, i12));
        }
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = this.f43639g0;
            if (i13 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6((View) arrayList2.get(i13), 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
            i13++;
        }
        for (Map.Entry entry : this.f43646j1.entrySet()) {
            tm0 tm0Var = (tm0) entry.getValue();
            arrayList.add(new org.telegram.ui.ActionBar.i6(tm0Var, 268435456, new Class[]{tm0.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(tm0Var, 0, new Class[]{tm0.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(tm0Var, 0, new Class[]{tm0.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23450z6));
        }
        int i14 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 268435456, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.g6.f23450z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 268435456, new Class[]{org.telegram.ui.Cells.y9.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        int i17 = org.telegram.ui.ActionBar.g6.f23028b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 268435456, new Class[]{um0.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 4, new Class[]{um0.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 4, new Class[]{um0.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 4, new Class[]{um0.class}, new String[]{"valueTextView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 8, new Class[]{um0.class}, new String[]{"checkImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 16, new Class[]{org.telegram.ui.Cells.k4.class}, null, null, null, i14));
        int i18 = org.telegram.ui.ActionBar.g6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        if (this.U != null) {
            int i19 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.U;
                if (i19 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.i6((View) editTextBoldCursorArr[i19].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.U[i19], 16777220, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.U[i19], 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.U[i19], 8390656, null, null, null, null, org.telegram.ui.ActionBar.g6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.U[i19], 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f23189k6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.U[i19], 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f23206l6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.U[i19], 2080, null, null, null, null, org.telegram.ui.ActionBar.g6.f23279p7));
                i19++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4, null, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 8390656, null, null, null, null, i18));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f23189k6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f23206l6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 2080, null, null, null, null, org.telegram.ui.ActionBar.g6.f23279p7));
        }
        if (this.W != null) {
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.W;
                if (i11 >= editTextBoldCursorArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.i6((View) editTextBoldCursorArr2[i11].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.W[i11], 16777220, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.W[i11], 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.W[i11], 8390656, null, null, null, null, org.telegram.ui.ActionBar.g6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.W[i11], 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f23189k6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.W[i11], 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f23206l6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.W[i11], 2080, null, null, null, null, org.telegram.ui.ActionBar.g6.f23279p7));
                i11++;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B0, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.f23134h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E0, 8, null, null, null, null, org.telegram.ui.ActionBar.g6.Xd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.F0, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.G0, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.r6));
        TextView textView = this.I0;
        int i20 = org.telegram.ui.ActionBar.g6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43664s0, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.K, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23357th));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f23319rh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f23338sh));
        org.telegram.ui.Components.nq nqVar = this.J;
        int i21 = org.telegram.ui.ActionBar.g6.D7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(nqVar, 0, null, null, null, null, i21));
        org.telegram.ui.Components.nq nqVar2 = this.J;
        int i22 = org.telegram.ui.ActionBar.g6.E7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(nqVar2, 0, null, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, 0, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, 0, null, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43676x0, 8, null, null, null, null, org.telegram.ui.ActionBar.g6.Ci));
        TextView textView2 = this.f43679y0;
        int i23 = org.telegram.ui.ActionBar.g6.f23450z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView2, 4, null, null, null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43681z0, 4, null, null, null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A0, 4, null, null, null, null, i20));
        return arrayList;
    }

    public final byte[] i1(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32 || bArr2 == null || bArr2.length != 32) {
            return null;
        }
        byte[] bArr3 = new byte[32];
        System.arraycopy(this.f43624a1, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(this.f43624a1, 32, bArr4, 0, 16);
        byte[] bArr5 = new byte[32];
        System.arraycopy(this.Y0, 0, bArr5, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr5, bArr3, bArr4, 0, 32, 0, 0);
        if (!Z0(bArr5, null)) {
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

    public final void j1(final TLRPC.TL_secureRequiredType tL_secureRequiredType, final TLRPC.TL_secureRequiredType tL_secureRequiredType2, final ArrayList arrayList, final boolean z10, final el0 el0Var, final hl0 hl0Var, final boolean z11) {
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
                final jm0 jm0Var = hl0Var;
                final boolean z12 = z11;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType3 = tL_secureRequiredType2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                final boolean z13 = z10;
                final ArrayList arrayList2 = arrayList;
                final Runnable runnable = el0Var;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        int i10;
                        TLRPC.TL_secureData tL_secureData;
                        String str2;
                        LinearLayout linearLayout;
                        vm0 vm0Var2 = vm0.this;
                        TLRPC.TL_error tL_error2 = tL_error;
                        String str3 = null;
                        if (tL_error2 != null) {
                            jm0 jm0Var2 = jm0Var;
                            if (jm0Var2 != null) {
                                jm0Var2.M(tL_error2.text, null);
                            }
                            vm0Var2.M1(LocaleController.getString(R.string.AppName), tL_error2.text);
                            return;
                        }
                        boolean z14 = z12;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType3;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType4;
                        boolean z15 = z13;
                        if (z14) {
                            if (tL_secureRequiredType5 != null) {
                                vm0Var2.H1(tL_secureRequiredType5);
                            } else {
                                vm0Var2.H1(tL_secureRequiredType6);
                            }
                        } else {
                            if (z15) {
                                vm0Var2.H1(tL_secureRequiredType6);
                            }
                            vm0Var2.H1(tL_secureRequiredType5);
                        }
                        int i11 = 0;
                        if (vm0Var2.f43625b == 8) {
                            um0 um0Var = (um0) vm0Var2.f43650m1.remove(tL_secureRequiredType6);
                            if (um0Var != null) {
                                vm0Var2.Y.removeView(um0Var);
                                View childAt = vm0Var2.Y.getChildAt(linearLayout.getChildCount() - 6);
                                if (childAt instanceof um0) {
                                    ((um0) childAt).setNeedDivider(false);
                                }
                            }
                            vm0Var2.Q1();
                        } else {
                            ArrayList arrayList3 = arrayList2;
                            if (tL_secureRequiredType5 != null && arrayList3 != null && arrayList3.size() > 1) {
                                int size = arrayList3.size();
                                int i12 = 0;
                                while (true) {
                                    if (i12 < size) {
                                        TLRPC.TL_secureRequiredType tL_secureRequiredType7 = (TLRPC.TL_secureRequiredType) arrayList3.get(i12);
                                        TLRPC.TL_secureValue r12 = vm0Var2.r1(tL_secureRequiredType7, false);
                                        if (r12 != null) {
                                            TLRPC.TL_secureData tL_secureData2 = r12.data;
                                            if (tL_secureData2 != null) {
                                                str2 = vm0.h1(tL_secureData2.data, vm0Var2.i1(tL_secureData2.secret, tL_secureData2.data_hash), r12.data.data_hash);
                                            } else {
                                                str2 = null;
                                            }
                                            str = str2;
                                            tL_secureRequiredType5 = tL_secureRequiredType7;
                                        } else {
                                            i12++;
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
                                    i11 = arrayList3.size();
                                }
                                vm0Var2.L1(tL_secureRequiredType6, null, null, tL_secureRequiredType5, str, z14, i11);
                            } else {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType8 = tL_secureRequiredType5;
                                String str4 = str;
                                TLRPC.TL_secureValue r13 = vm0Var2.r1(tL_secureRequiredType6, false);
                                if (r13 != null && (tL_secureData = r13.data) != null) {
                                    str3 = vm0.h1(tL_secureData.data, vm0Var2.i1(tL_secureData.secret, tL_secureData.data_hash), r13.data.data_hash);
                                }
                                if (arrayList3 != null) {
                                    i10 = arrayList3.size();
                                } else {
                                    i10 = 0;
                                }
                                vm0Var2.L1(tL_secureRequiredType6, null, str3, tL_secureRequiredType8, str4, z14, i10);
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

    public final a5.j k1(byte[] bArr) {
        byte[] p12 = p1();
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
        byte[] computeSHA512 = Utilities.computeSHA512(p12, computeSHA256);
        byte[] bArr4 = new byte[32];
        System.arraycopy(computeSHA512, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(computeSHA512, 32, bArr5, 0, 16);
        Utilities.aesCbcEncryptionByteArraySafe(bArr3, bArr4, bArr5, 0, length, 0, 1);
        byte[] bArr6 = new byte[32];
        System.arraycopy(this.f43624a1, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(this.f43624a1, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(this.Y0, 0, bArr8, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        byte[] computeSHA5122 = Utilities.computeSHA512(bArr8, computeSHA256);
        byte[] bArr9 = new byte[32];
        System.arraycopy(computeSHA5122, 0, bArr9, 0, 32);
        byte[] bArr10 = new byte[16];
        System.arraycopy(computeSHA5122, 32, bArr10, 0, 16);
        byte[] bArr11 = new byte[32];
        System.arraycopy(p12, 0, bArr11, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr11, bArr9, bArr10, 0, 32, 0, 1);
        ?? obj = new Object();
        obj.f213c = bArr3;
        obj.f211a = bArr11;
        obj.d = computeSHA256;
        obj.f212b = p12;
        obj.f214e = new SecureDocumentKey(bArr4, bArr5);
        return obj;
    }

    public final void l1(Bundle bundle, TLRPC.TL_auth_sentCode tL_auth_sentCode, boolean z10) {
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
            K1(bundle, 2, z10);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", tL_auth_sentCode.type.pattern);
            K1(bundle, 1, z10);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSms) {
            bundle.putInt("type", 2);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            K1(bundle, 0, z10);
        }
    }

    public final String m1() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.U;
            if (i10 >= editTextBoldCursorArr.length) {
                break;
            }
            sb2.append((CharSequence) editTextBoldCursorArr[i10].getText());
            sb2.append(",");
            i10++;
        }
        if (this.W != null) {
            int i11 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.W;
                if (i11 >= editTextBoldCursorArr2.length) {
                    break;
                }
                sb2.append((CharSequence) editTextBoldCursorArr2[i11].getText());
                sb2.append(",");
                i11++;
            }
        }
        ArrayList arrayList = this.f43635e1;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            sb2.append(((SecureDocument) arrayList.get(i12)).secureFile.f22527id);
        }
        SecureDocument secureDocument = this.f43642h1;
        if (secureDocument != null) {
            sb2.append(secureDocument.secureFile.f22527id);
        }
        SecureDocument secureDocument2 = this.f43644i1;
        if (secureDocument2 != null) {
            sb2.append(secureDocument2.secureFile.f22527id);
        }
        SecureDocument secureDocument3 = this.f43638f1;
        if (secureDocument3 != null) {
            sb2.append(secureDocument3.secureFile.f22527id);
        }
        ArrayList arrayList2 = this.f43640g1;
        int size2 = arrayList2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            sb2.append(((SecureDocument) arrayList2.get(i13)).secureFile.f22527id);
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
                        G1(arrayList);
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
            c1();
            org.telegram.ui.Components.ni niVar = this.N0;
            if (niVar != null) {
                niVar.f31005f0.g0(i10, intent, this.M0);
            }
            this.M0 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i10 = this.f43625b;
        if (i10 == 7) {
            if (z10) {
                int i11 = this.E1;
                org.telegram.ui.Components.mv0[] mv0VarArr = this.F1;
                mv0VarArr[i11].c(true);
                for (org.telegram.ui.Components.mv0 mv0Var : mv0VarArr) {
                    if (mv0Var != null) {
                        mv0Var.f();
                    }
                }
            }
        } else if (i10 != 0 && i10 != 5) {
            if (i10 == 1 || i10 == 2) {
                return !X0(z10);
            }
        } else if (z10) {
            W0(false);
        }
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        if (this.f43625b == 3 && Build.VERSION.SDK_INT >= 23 && dialog == this.H1) {
            ArrayList arrayList = this.I1;
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
        W0(false);
        org.telegram.ui.Components.ni niVar = this.N0;
        if (niVar != null) {
            niVar.dismissInternal();
            this.N0.v1();
        }
        if (this.f43625b == 7) {
            while (true) {
                org.telegram.ui.Components.mv0[] mv0VarArr = this.F1;
                if (i10 >= mv0VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.mv0 mv0Var = mv0VarArr[i10];
                if (mv0Var != null) {
                    mv0Var.f();
                }
                i10++;
            }
            org.telegram.ui.ActionBar.c2 c2Var = this.G1;
            if (c2Var != null) {
                try {
                    c2Var.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                this.G1 = null;
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.ni niVar = this.N0;
        if (niVar != null) {
            niVar.x1();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.ni niVar;
        org.telegram.ui.Cells.y9 y9Var;
        int i11 = this.f43625b;
        if ((i11 == 1 || i11 == 2) && (niVar = this.N0) != null) {
            if (i10 == 17) {
                niVar.f31005f0.U(false);
            } else if (i10 == 21) {
                if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
                    alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new hl0(this, 0));
                    j7.l1.C(R.string.OK, alertDialog$Builder, null);
                }
            } else if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                F1(0);
            } else if (i10 == 22 && iArr != null && iArr.length > 0 && iArr[0] == 0 && (y9Var = this.f43652n0) != null) {
                y9Var.callOnClick();
            }
        } else if (i11 == 3 && i10 == 6) {
            O1(false, this.A1, this.B1, this.C1, this.D1);
        }
    }

    @Override
    public final void onResume() {
        ViewGroup[] viewGroupArr;
        ViewGroup viewGroup;
        super.onResume();
        org.telegram.ui.Components.ni niVar = this.N0;
        if (niVar != null) {
            niVar.y1();
        }
        if (this.f43625b == 5 && (viewGroupArr = this.V) != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
            this.U[0].requestFocus();
            AndroidUtilities.showKeyboard(this.U[0]);
            AndroidUtilities.runOnUIThread(new el0(this, 0), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (this.f43632d1 != null) {
            AndroidUtilities.runOnUIThread(new el0(this, 1));
        }
        int i10 = this.f43625b;
        if (i10 == 5) {
            if (z10) {
                if (this.V[0].getVisibility() == 0) {
                    this.U[0].requestFocus();
                    AndroidUtilities.showKeyboard(this.U[0]);
                }
                if (this.J0 == 2) {
                    B1(false);
                }
            }
        } else if (i10 == 7) {
            if (z10) {
                this.F1[this.E1].j();
            }
        } else if (i10 == 4) {
            if (z10) {
                this.U[0].requestFocus();
                AndroidUtilities.showKeyboard(this.U[0]);
            }
        } else if (i10 == 6) {
            if (z10) {
                this.U[0].requestFocus();
                AndroidUtilities.showKeyboard(this.U[0]);
            }
        } else if (i10 != 2 && i10 != 1) {
        } else {
            c1();
        }
    }

    public final TLRPC.TL_secureValue r1(TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z10) {
        String[] strArr;
        if (tL_secureRequiredType != null) {
            int size = this.f43678y.values.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.TL_secureValue tL_secureValue = this.f43678y.values.get(i10);
                if (tL_secureRequiredType.type.getClass() == tL_secureValue.type.getClass()) {
                    if (z10) {
                        if (!tL_secureRequiredType.selfie_required || (tL_secureValue.selfie instanceof TLRPC.TL_secureFile)) {
                            if (!tL_secureRequiredType.translation_required || !tL_secureValue.translation.isEmpty()) {
                                if (!t1(tL_secureRequiredType.type) || !tL_secureValue.files.isEmpty()) {
                                    if (!v1(tL_secureRequiredType.type) || (tL_secureValue.front_side instanceof TLRPC.TL_secureFile)) {
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
                                                    JSONObject jSONObject = new JSONObject(h1(tL_secureData.data, i1(tL_secureData.secret, tL_secureData.data_hash), tL_secureValue.data.data_hash));
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

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.M0 = bundle.getString("path");
    }

    public final boolean s1(Class cls) {
        int size = this.f43678y.values.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f43678y.values.get(i10).type.getClass() == cls) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.M0;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final boolean u1() {
        String str = this.f43622a;
        if (str != null && !str.equals(m1())) {
            return false;
        }
        return true;
    }

    public final void w1() {
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new il0(this, 3)), this.classGuid);
    }

    public final void x1() {
        org.telegram.ui.ActionBar.c2 c2Var = this.G1;
        if (c2Var == null) {
            return;
        }
        try {
            c2Var.dismiss();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.G1 = null;
    }

    public final void y1() {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.G1 == null) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
            this.G1 = c2Var;
            c2Var.f22783c0 = false;
            c2Var.show();
        }
    }

    public final void z1(View view) {
        if (view == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        AndroidUtilities.shakeView(view);
        I1(view);
    }

    public vm0(int i10, long j10, String str, String str2, String str3, String str4, String str5, TL_account.authorizationForm authorizationform, TL_account.Password password) {
        this(i10, authorizationform, password, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (HashMap) null, (HashMap) null);
        int i11;
        String o12;
        String str6;
        String str7;
        String str8;
        String str9;
        this.f43628c = j10;
        this.d = str3;
        this.f43633e = str4;
        this.h = str;
        this.f43660r = str2;
        this.f43651n = str5;
        if (i10 != 0 || authorizationform.errors.isEmpty()) {
            return;
        }
        try {
            Collections.sort(authorizationform.errors, new bm0(this));
            int size = authorizationform.errors.size();
            int i12 = 0;
            while (i12 < size) {
                TLRPC.SecureValueError secureValueError = authorizationform.errors.get(i12);
                byte[] bArr = null;
                if (secureValueError instanceof TLRPC.TL_secureValueErrorFrontSide) {
                    TLRPC.TL_secureValueErrorFrontSide tL_secureValueErrorFrontSide = (TLRPC.TL_secureValueErrorFrontSide) secureValueError;
                    o12 = o1(tL_secureValueErrorFrontSide.type);
                    str6 = tL_secureValueErrorFrontSide.text;
                    bArr = tL_secureValueErrorFrontSide.file_hash;
                    str7 = null;
                    str8 = "front";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorReverseSide) {
                    TLRPC.TL_secureValueErrorReverseSide tL_secureValueErrorReverseSide = (TLRPC.TL_secureValueErrorReverseSide) secureValueError;
                    o12 = o1(tL_secureValueErrorReverseSide.type);
                    str6 = tL_secureValueErrorReverseSide.text;
                    bArr = tL_secureValueErrorReverseSide.file_hash;
                    str7 = null;
                    str8 = "reverse";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorSelfie) {
                    TLRPC.TL_secureValueErrorSelfie tL_secureValueErrorSelfie = (TLRPC.TL_secureValueErrorSelfie) secureValueError;
                    o12 = o1(tL_secureValueErrorSelfie.type);
                    str6 = tL_secureValueErrorSelfie.text;
                    bArr = tL_secureValueErrorSelfie.file_hash;
                    str7 = null;
                    str8 = "selfie";
                } else {
                    if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFile) {
                        TLRPC.TL_secureValueErrorTranslationFile tL_secureValueErrorTranslationFile = (TLRPC.TL_secureValueErrorTranslationFile) secureValueError;
                        o12 = o1(tL_secureValueErrorTranslationFile.type);
                        str6 = tL_secureValueErrorTranslationFile.text;
                        bArr = tL_secureValueErrorTranslationFile.file_hash;
                        str7 = null;
                    } else if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFiles) {
                        TLRPC.TL_secureValueErrorTranslationFiles tL_secureValueErrorTranslationFiles = (TLRPC.TL_secureValueErrorTranslationFiles) secureValueError;
                        o12 = o1(tL_secureValueErrorTranslationFiles.type);
                        str6 = tL_secureValueErrorTranslationFiles.text;
                        str7 = null;
                    } else {
                        if (secureValueError instanceof TLRPC.TL_secureValueErrorFile) {
                            TLRPC.TL_secureValueErrorFile tL_secureValueErrorFile = (TLRPC.TL_secureValueErrorFile) secureValueError;
                            o12 = o1(tL_secureValueErrorFile.type);
                            str6 = tL_secureValueErrorFile.text;
                            bArr = tL_secureValueErrorFile.file_hash;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueErrorFiles) {
                            TLRPC.TL_secureValueErrorFiles tL_secureValueErrorFiles = (TLRPC.TL_secureValueErrorFiles) secureValueError;
                            o12 = o1(tL_secureValueErrorFiles.type);
                            str6 = tL_secureValueErrorFiles.text;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueError) {
                            TLRPC.TL_secureValueError tL_secureValueError = (TLRPC.TL_secureValueError) secureValueError;
                            o12 = o1(tL_secureValueError.type);
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
                                        o12 = o1(tL_secureValueErrorData.type);
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
                HashMap hashMap = (HashMap) this.f43659q1.get(o12);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    i11 = size;
                    this.f43659q1.put(o12, hashMap);
                    this.f43662r1.put(o12, str6);
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
