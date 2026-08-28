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
public final class wm0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.TL_secureRequiredType A;
    public TextView A0;
    public String A1;
    public TLRPC.TL_secureRequiredType B;
    public org.telegram.ui.Components.yy B0;
    public Runnable B1;
    public ArrayList C;
    public org.telegram.ui.Cells.b9 C0;
    public lm0 C1;
    public final TLRPC.TL_secureValue D;
    public org.telegram.ui.Cells.b9 D0;
    public nm0 D1;
    public final TLRPC.TL_secureValue E;
    public ImageView E0;
    public int E1;
    public TL_account.Password F;
    public TextView F0;
    public final org.telegram.ui.Components.cv0[] F1;
    public TLRPC.TL_auth_sentCode G;
    public TextView G0;
    public org.telegram.ui.ActionBar.c2 G1;
    public org.telegram.ui.ActionBar.w0 H;
    public FrameLayout H0;
    public Dialog H1;
    public AnimatorSet I;
    public TextView I0;
    public final ArrayList I1;
    public org.telegram.ui.Components.jq J;
    public int J0;
    public TextView K;
    public final byte[] K0;
    public org.telegram.ui.Components.jq L;
    public final byte[] L0;
    public FrameLayout M;
    public String M0;
    public org.telegram.ui.Cells.ba N;
    public org.telegram.ui.Components.ki N0;
    public View O;
    public int O0;
    public View P;
    public int P0;
    public org.telegram.ui.Cells.a9 Q;
    public final ArrayList Q0;
    public org.telegram.ui.Cells.a9 R;
    public final HashMap R0;
    public org.telegram.ui.Cells.a9 S;
    public final HashMap S0;
    public org.telegram.ui.Cells.ba T;
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
    public String f44148a;
    public LinearLayout f44149a0;
    public byte[] f44150a1;
    public final int f44151b;
    public LinearLayout f44152b0;
    public boolean f44153b1;
    public long f44154c;
    public LinearLayout f44155c0;
    public boolean f44156c1;
    public final String d;
    public LinearLayout f44157d0;
    public wm0 f44158d1;
    public final String f44159e;
    public LinearLayout f44160e0;
    public final ArrayList f44161e1;
    public boolean f44162f;
    public org.telegram.ui.Cells.m4 f44163f0;
    public SecureDocument f44164f1;
    public final ArrayList f44165g0;
    public final ArrayList f44166g1;
    public final String h;
    public org.telegram.ui.Cells.z6 f44167h0;
    public SecureDocument f44168h1;
    public org.telegram.ui.Cells.z6 f44169i0;
    public SecureDocument f44170i1;
    public org.telegram.ui.Cells.b9 f44171j0;
    public final HashMap f44172j1;
    public org.telegram.ui.Cells.b9 f44173k0;
    public final HashMap f44174k1;
    public org.telegram.ui.Cells.b9 f44175l0;
    public final HashMap l1;
    public org.telegram.ui.Cells.b9 m0;
    public final HashMap f44176m1;
    public final String f44177n;
    public org.telegram.ui.Cells.ba f44178n0;
    public final HashMap f44179n1;
    public int f44180o0;
    public final HashMap f44181o1;
    public final boolean[] f44182p0;
    public final HashMap f44183p1;
    public boolean f44184q0;
    public final HashMap f44185q1;
    public final String f44186r;
    public boolean f44187r0;
    public final HashMap f44188r1;
    public String f44189s;
    public TextView f44190s0;
    public HashMap f44191s1;
    public org.telegram.ui.Cells.ba f44192t0;
    public HashMap f44193t1;
    public org.telegram.ui.Cells.ba f44194u0;
    public final HashMap f44195u1;
    public String v;
    public org.telegram.ui.Cells.z6 f44196v0;
    public String f44197v1;
    public String f44198w;
    public LinearLayout f44199w0;
    public String f44200w1;
    public final int[] f44201x;
    public ImageView f44202x0;
    public nm0 f44203x1;
    public TL_account.authorizationForm f44204y;
    public TextView f44205y0;
    public boolean f44206y1;
    public TextView f44207z0;
    public final wl0 f44208z1;

    public wm0(int i9, TL_account.authorizationForm authorizationform, TL_account.Password password, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureValue tL_secureValue, TLRPC.TL_secureRequiredType tL_secureRequiredType2, TLRPC.TL_secureValue tL_secureValue2, HashMap hashMap, HashMap hashMap2) {
        super(null);
        this.f44189s = "";
        this.v = "";
        this.f44201x = new int[3];
        this.f44165g0 = new ArrayList();
        this.f44182p0 = new boolean[3];
        this.f44184q0 = true;
        this.Q0 = new ArrayList();
        this.R0 = new HashMap();
        this.S0 = new HashMap();
        this.T0 = new HashMap();
        this.f44161e1 = new ArrayList();
        this.f44166g1 = new ArrayList();
        this.f44172j1 = new HashMap();
        this.f44174k1 = new HashMap();
        this.l1 = new HashMap();
        this.f44176m1 = new HashMap();
        this.f44179n1 = new HashMap();
        this.f44185q1 = new HashMap();
        this.f44188r1 = new HashMap();
        this.f44195u1 = new HashMap();
        this.f44208z1 = new wl0(this);
        this.f44151b = i9;
        this.f44204y = authorizationform;
        this.A = tL_secureRequiredType;
        if (tL_secureRequiredType != null) {
            this.f44184q0 = tL_secureRequiredType.native_names;
        }
        this.D = tL_secureValue;
        this.B = tL_secureRequiredType2;
        this.E = tL_secureValue2;
        this.F = password;
        this.f44181o1 = hashMap;
        this.f44183p1 = hashMap2;
        if (i9 == 3) {
            this.I1 = new ArrayList();
        } else if (i9 == 7) {
            this.F1 = new org.telegram.ui.Components.cv0[3];
        }
        if (hashMap == null) {
            this.f44181o1 = new HashMap();
        }
        if (hashMap2 == null) {
            this.f44183p1 = new HashMap();
        }
        if (i9 == 5) {
            if (UserConfig.getInstance(this.currentAccount).savedPasswordHash != null && UserConfig.getInstance(this.currentAccount).savedSaltedPassword != null) {
                this.J0 = 1;
                this.K0 = UserConfig.getInstance(this.currentAccount).savedPasswordHash;
                this.L0 = UserConfig.getInstance(this.currentAccount).savedSaltedPassword;
            }
            TL_account.Password password2 = this.F;
            if (password2 == null) {
                w1();
            } else {
                TwoStepVerificationActivity.l0(password2);
                if (this.J0 == 1) {
                    B1(true);
                }
            }
            if (SharedConfig.isPassportConfigLoaded()) {
                return;
            }
            TLRPC.TL_help_getPassportConfig tL_help_getPassportConfig = new TLRPC.TL_help_getPassportConfig();
            tL_help_getPassportConfig.hash = SharedConfig.passportConfigHash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getPassportConfig, new ih.q5(15));
        }
    }

    public static int B0(wm0 wm0Var, String str) {
        wm0Var.getClass();
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

    public static boolean C0(org.telegram.ui.wm0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm0.C0(org.telegram.ui.wm0):boolean");
    }

    public static void I0(wm0 wm0Var, EditTextBoldCursor editTextBoldCursor, String str, Editable editable, boolean z10) {
        String str2;
        String str3;
        String str4;
        String str5;
        HashMap hashMap = wm0Var.f44195u1;
        if (hashMap != null && (str3 = (String) hashMap.get(str)) != null) {
            if (TextUtils.equals(str3, editable)) {
                HashMap hashMap2 = wm0Var.f44191s1;
                if (hashMap2 != null && (str5 = (String) hashMap2.get(str)) != null) {
                    editTextBoldCursor.setErrorText(str5);
                } else {
                    HashMap hashMap3 = wm0Var.f44193t1;
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
            wm0Var.a1(false);
        }
    }

    public static void T(wm0 wm0Var, TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery) {
        TL_account.Password password = wm0Var.F;
        password.email_unconfirmed_pattern = tL_auth_passwordRecovery.email_pattern;
        wm0Var.presentFragment(new ag1(wm0Var.currentAccount, 4, password));
    }

    public static void U(wm0 wm0Var) {
        ArrayList arrayList;
        int i9;
        int i10;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        HashMap hashMap = wm0Var.f44179n1;
        HashMap hashMap2 = wm0Var.f44176m1;
        String str = wm0Var.f44186r;
        ArrayList arrayList2 = new ArrayList();
        int size = wm0Var.f44204y.required_types.size();
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.SecureRequiredType secureRequiredType = wm0Var.f44204y.required_types.get(i11);
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
                            int i12 = 0;
                            while (true) {
                                if (i12 < size2) {
                                    TLRPC.SecureRequiredType secureRequiredType3 = tL_secureRequiredTypeOneOf.types.get(i12);
                                    if (secureRequiredType3 instanceof TLRPC.TL_secureRequiredType) {
                                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) secureRequiredType3;
                                        if (wm0Var.r1(tL_secureRequiredType5, true) != null) {
                                            tL_secureRequiredType = tL_secureRequiredType5;
                                            break;
                                        }
                                    }
                                    i12++;
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
            TLRPC.TL_secureValue r12 = wm0Var.r1(tL_secureRequiredType, true);
            if (r12 == null) {
                Vibrator vibrator = (Vibrator) wm0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                vm0 vm0Var = (vm0) hashMap2.get(tL_secureRequiredType);
                if (vm0Var == null && (tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    vm0Var = (vm0) hashMap2.get(tL_secureRequiredType2);
                }
                AndroidUtilities.shakeView(vm0Var);
                return;
            }
            HashMap hashMap3 = (HashMap) wm0Var.f44185q1.get(o1(tL_secureRequiredType.type));
            if (hashMap3 != null && !hashMap3.isEmpty()) {
                Vibrator vibrator2 = (Vibrator) wm0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                vm0 vm0Var2 = (vm0) hashMap2.get(tL_secureRequiredType);
                if (vm0Var2 == null && (tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    vm0Var2 = (vm0) hashMap2.get(tL_secureRequiredType3);
                }
                AndroidUtilities.shakeView(vm0Var2);
                return;
            }
            boolean z10 = tL_secureRequiredType.selfie_required;
            boolean z11 = tL_secureRequiredType.translation_required;
            ?? obj = new Object();
            obj.f44539a = r12;
            obj.f44540b = z10;
            obj.f44541c = z11;
            arrayList2.add(obj);
        }
        wm0Var.N1(false, true);
        TL_account.acceptAuthorization acceptauthorization = new TL_account.acceptAuthorization();
        acceptauthorization.bot_id = wm0Var.f44154c;
        acceptauthorization.scope = wm0Var.h;
        acceptauthorization.public_key = str;
        JSONObject jSONObject = new JSONObject();
        int size3 = arrayList2.size();
        int i13 = 0;
        while (i13 < size3) {
            xl0 xl0Var = (xl0) arrayList2.get(i13);
            TLRPC.TL_secureValue tL_secureValue = xl0Var.f44539a;
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
                        byte[] i14 = wm0Var.i1(tL_secureData.secret, tL_secureData.data_hash);
                        arrayList = arrayList2;
                        try {
                            jSONObject2.put("data_hash", Base64.encodeToString(tL_secureValue.data.data_hash, 2));
                            jSONObject2.put("secret", Base64.encodeToString(i14, 2));
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
                            i9 = size3;
                            try {
                                i10 = i13;
                                try {
                                    byte[] i16 = wm0Var.i1(tL_secureFile.secret, tL_secureFile.file_hash);
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("file_hash", Base64.encodeToString(tL_secureFile.file_hash, 2));
                                    jSONObject4.put("secret", Base64.encodeToString(i16, 2));
                                    jSONArray.put(jSONObject4);
                                    i15++;
                                    size3 = i9;
                                    i13 = i10;
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                            }
                        }
                        i9 = size3;
                        i10 = i13;
                        jSONObject3.put("files", jSONArray);
                    } else {
                        i9 = size3;
                        i10 = i13;
                    }
                    TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                    if (secureFile instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile;
                        byte[] i17 = wm0Var.i1(tL_secureFile2.secret, tL_secureFile2.file_hash);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("file_hash", Base64.encodeToString(tL_secureFile2.file_hash, 2));
                        jSONObject5.put("secret", Base64.encodeToString(i17, 2));
                        jSONObject3.put("front_side", jSONObject5);
                    }
                    TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile2;
                        byte[] i18 = wm0Var.i1(tL_secureFile3.secret, tL_secureFile3.file_hash);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("file_hash", Base64.encodeToString(tL_secureFile3.file_hash, 2));
                        jSONObject6.put("secret", Base64.encodeToString(i18, 2));
                        jSONObject3.put("reverse_side", jSONObject6);
                    }
                    if (xl0Var.f44540b) {
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile3;
                            byte[] i19 = wm0Var.i1(tL_secureFile4.secret, tL_secureFile4.file_hash);
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("file_hash", Base64.encodeToString(tL_secureFile4.file_hash, 2));
                            jSONObject7.put("secret", Base64.encodeToString(i19, 2));
                            jSONObject3.put("selfie", jSONObject7);
                        }
                    }
                    if (xl0Var.f44541c && !tL_secureValue.translation.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        int size5 = tL_secureValue.translation.size();
                        for (int i20 = 0; i20 < size5; i20++) {
                            TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) tL_secureValue.translation.get(i20);
                            byte[] i110 = wm0Var.i1(tL_secureFile5.secret, tL_secureFile5.file_hash);
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("file_hash", Base64.encodeToString(tL_secureFile5.file_hash, 2));
                            jSONObject8.put("secret", Base64.encodeToString(i110, 2));
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
                i13 = i10 + 1;
                arrayList2 = arrayList;
                size3 = i9;
            }
            arrayList = arrayList2;
            i9 = size3;
            i10 = i13;
            TLRPC.TL_secureValueHash tL_secureValueHash2 = new TLRPC.TL_secureValueHash();
            tL_secureValueHash2.type = tL_secureValue.type;
            tL_secureValueHash2.hash = tL_secureValue.hash;
            acceptauthorization.value_hashes.add(tL_secureValueHash2);
            i13 = i10 + 1;
            arrayList2 = arrayList;
            size3 = i9;
        }
        JSONObject jSONObject9 = new JSONObject();
        try {
            jSONObject9.put("secure_data", jSONObject);
        } catch (Exception unused5) {
        }
        Object obj2 = wm0Var.d;
        if (obj2 != null) {
            try {
                jSONObject9.put("payload", obj2);
            } catch (Exception unused6) {
            }
        }
        Object obj3 = wm0Var.f44159e;
        if (obj3 != null) {
            try {
                jSONObject9.put("nonce", obj3);
            } catch (Exception unused7) {
            }
        }
        b3.b k12 = wm0Var.k1(AndroidUtilities.getStringBytes(jSONObject9.toString()));
        TLRPC.TL_secureCredentialsEncrypted tL_secureCredentialsEncrypted = new TLRPC.TL_secureCredentialsEncrypted();
        acceptauthorization.credentials = tL_secureCredentialsEncrypted;
        tL_secureCredentialsEncrypted.hash = (byte[]) k12.d;
        tL_secureCredentialsEncrypted.data = (byte[]) k12.f1415c;
        try {
            String replace = str.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "");
            Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(replace, 0))));
            acceptauthorization.credentials.secret = cipher.doFinal((byte[]) k12.f1414b);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        ConnectionsManager.getInstance(wm0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(wm0Var.currentAccount).sendRequest(acceptauthorization, new ll0(wm0Var, 1)), wm0Var.classGuid);
    }

    public static void V(wm0 wm0Var, TLRPC.TL_error tL_error, String str, nm0 nm0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        if (tL_error == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("phone", str);
            wm0 wm0Var2 = new wm0(7, wm0Var.f44204y, wm0Var.F, wm0Var.A, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
            wm0Var2.currentAccount = wm0Var.currentAccount;
            wm0Var2.f44150a1 = wm0Var.f44150a1;
            wm0Var2.Y0 = wm0Var.Y0;
            wm0Var2.f44203x1 = nm0Var;
            wm0Var2.G = (TLRPC.TL_auth_sentCode) tLObject;
            wm0Var.presentFragment(wm0Var2, true);
            return;
        }
        org.telegram.ui.Components.y4.f0(wm0Var.currentAccount, tL_error, wm0Var, sendverifyphonecode, str);
    }

    public static void W(wm0 wm0Var, SecureDocument secureDocument, int i9) {
        HashMap hashMap = wm0Var.f44172j1;
        int i10 = wm0Var.O0;
        if (i10 == 1) {
            SecureDocument secureDocument2 = wm0Var.f44164f1;
            if (secureDocument2 != null) {
                um0 um0Var = (um0) hashMap.remove(secureDocument2);
                if (um0Var != null) {
                    wm0Var.f44155c0.removeView(um0Var);
                }
                wm0Var.f44164f1 = null;
            }
        } else if (i10 == 4) {
            if (wm0Var.f44166g1.size() >= 20) {
                return;
            }
        } else if (i10 == 2) {
            SecureDocument secureDocument3 = wm0Var.f44168h1;
            if (secureDocument3 != null) {
                um0 um0Var2 = (um0) hashMap.remove(secureDocument3);
                if (um0Var2 != null) {
                    wm0Var.f44149a0.removeView(um0Var2);
                }
                wm0Var.f44168h1 = null;
            }
        } else if (i10 == 3) {
            SecureDocument secureDocument4 = wm0Var.f44170i1;
            if (secureDocument4 != null) {
                um0 um0Var3 = (um0) hashMap.remove(secureDocument4);
                if (um0Var3 != null) {
                    wm0Var.f44152b0.removeView(um0Var3);
                }
                wm0Var.f44170i1 = null;
            }
        } else if (i10 == 0 && wm0Var.f44161e1.size() >= 20) {
            return;
        }
        wm0Var.f44174k1.put(secureDocument.path, secureDocument);
        wm0Var.H.setEnabled(false);
        wm0Var.H.setAlpha(0.5f);
        FileLoader.getInstance(wm0Var.currentAccount).uploadFile(secureDocument.path, false, true, 16777216);
        wm0Var.R0(secureDocument, i9);
        wm0Var.S1(i9);
    }

    public static void X(org.telegram.ui.wm0 r9, boolean r10, java.lang.String r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm0.X(org.telegram.ui.wm0, boolean, java.lang.String):void");
    }

    public static void Y(int i9, String str, SecureDocument secureDocument, um0 um0Var, wm0 wm0Var) {
        HashMap hashMap = wm0Var.f44174k1;
        wm0Var.f44172j1.remove(secureDocument);
        if (i9 == 1) {
            wm0Var.f44164f1 = null;
            wm0Var.f44155c0.removeView(um0Var);
        } else if (i9 == 4) {
            wm0Var.f44166g1.remove(secureDocument);
            wm0Var.f44157d0.removeView(um0Var);
        } else if (i9 == 2) {
            wm0Var.f44168h1 = null;
            wm0Var.f44149a0.removeView(um0Var);
        } else if (i9 == 3) {
            wm0Var.f44170i1 = null;
            wm0Var.f44152b0.removeView(um0Var);
        } else {
            wm0Var.f44161e1.remove(secureDocument);
            wm0Var.Z.removeView(um0Var);
        }
        if (str != null) {
            HashMap hashMap2 = wm0Var.f44193t1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
            HashMap hashMap3 = wm0Var.f44195u1;
            if (hashMap3 != null) {
                hashMap3.remove(str);
            }
        }
        wm0Var.S1(i9);
        String str2 = secureDocument.path;
        if (str2 != null && hashMap.remove(str2) != null) {
            if (hashMap.isEmpty()) {
                wm0Var.H.setEnabled(true);
                wm0Var.H.setAlpha(1.0f);
            }
            FileLoader.getInstance(wm0Var.currentAccount).cancelFileUpload(secureDocument.path, false);
        }
    }

    public static void Z(wm0 wm0Var) {
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        for (int i9 = 0; i9 < wm0Var.f44204y.values.size(); i9++) {
            deletesecurevalue.types.add(wm0Var.f44204y.values.get(i9).type);
        }
        wm0Var.y1();
        ConnectionsManager.getInstance(wm0Var.currentAccount).sendRequest(deletesecurevalue, new ll0(wm0Var, 2));
    }

    public static boolean Z0(byte[] bArr, Long l10) {
        if (bArr == null || bArr.length != 32) {
            return false;
        }
        int i9 = 0;
        for (byte b10 : bArr) {
            i9 += b10 & 255;
        }
        if (i9 % 255 != 239) {
            return false;
        }
        if (l10 != null && Utilities.bytesToLong(Utilities.computeSHA256(bArr)) != l10.longValue()) {
            return false;
        }
        return true;
    }

    public static void a0(wm0 wm0Var) {
        ag1 ag1Var = new ag1(wm0Var.currentAccount, 0, wm0Var.F);
        ag1Var.U = true;
        wm0Var.presentFragment(ag1Var);
    }

    public static void b0(wm0 wm0Var) {
        if (wm0Var.F.has_recovery) {
            wm0Var.y1();
            ConnectionsManager.getInstance(wm0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(wm0Var.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new ll0(wm0Var, 0), 10), wm0Var.classGuid);
        } else if (wm0Var.getParentActivity() == null) {
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wm0Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.RestorePasswordResetAccount), new kl0(wm0Var, 4));
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
            String string = LocaleController.getString(R.string.RestorePasswordNoEmailText);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.P = string;
            wm0Var.showDialog(c2Var);
        }
    }

    public static void c0(wm0 wm0Var) {
        Activity parentActivity = wm0Var.getParentActivity();
        ve.e.s(parentActivity, "https://telegram.org/deactivate?phone=" + UserConfig.getInstance(wm0Var.currentAccount).getClientPhone());
    }

    public static void d0(wm0 wm0Var) {
        if (Build.VERSION.SDK_INT >= 23 && wm0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            wm0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
            return;
        }
        s9 s9Var = new s9(0);
        s9Var.H = new ul0(wm0Var);
        wm0Var.presentFragment(s9Var);
    }

    public static int e0(wm0 wm0Var) {
        return wm0Var.currentAccount;
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
                int i9 = bArr6[0] & 255;
                return new String(bArr6, i9, length - i9);
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
        int i9 = 0;
        for (int i10 = 0; i10 < 32; i10++) {
            i9 += 255 & bArr[i10];
        }
        int i11 = i9 % 255;
        if (i11 != 239) {
            int nextInt = Utilities.random.nextInt(32);
            int i12 = (bArr[nextInt] & 255) + (239 - i11);
            if (i12 < 255) {
                i12 += 255;
            }
            bArr[nextInt] = (byte) (i12 % 255);
        }
        return bArr;
    }

    public static int q0(wm0 wm0Var) {
        return wm0Var.currentAccount;
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

    public static int r0(wm0 wm0Var) {
        return wm0Var.currentAccount;
    }

    public static int s0(wm0 wm0Var) {
        return wm0Var.currentAccount;
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
        Utilities.globalQueue.postRunnable(new gh.u5(this, z10, obj, 28));
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
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PassportNoDocumentsAdd);
            alertDialog$Builder.f((CharSequence[]) arrayList.toArray(new CharSequence[0]), new v(8, this, arrayList2));
            showDialog(alertDialog$Builder.f22702a);
        }
    }

    public final void D1() {
        boolean z10;
        int size;
        int i9;
        if (getParentActivity() == null) {
            return;
        }
        int i10 = this.O0;
        ArrayList arrayList = this.f44161e1;
        int i11 = 1;
        if (i10 == 0 && arrayList.size() >= 20) {
            M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("PassportUploadMaxReached", R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", 20, new Object[0])));
            return;
        }
        c1();
        org.telegram.ui.Components.ki kiVar = this.N0;
        int i12 = this.O0;
        if (i12 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        kiVar.Q1 = z10;
        if (i12 == 0) {
            size = arrayList.size();
        } else {
            if (i12 == 4) {
                size = this.f44166g1.size();
            }
            kiVar.J1(i11, false);
            this.N0.f30114f0.e0();
            i9 = Build.VERSION.SDK_INT;
            if (i9 != 21 || i9 == 22) {
                AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            }
            this.N0.r1();
            showDialog(this.N0);
        }
        i11 = 20 - size;
        kiVar.J1(i11, false);
        this.N0.f30114f0.e0();
        i9 = Build.VERSION.SDK_INT;
        if (i9 != 21) {
        }
        AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
        this.N0.r1();
        showDialog(this.N0);
    }

    public final void E1(TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, boolean z10) {
        int i9;
        TLRPC.SecureValueType secureValueType;
        int i10;
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        if (arrayList != null) {
            i9 = arrayList.size();
        } else {
            i9 = 0;
        }
        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType.type;
        if (tL_secureRequiredType2 != null) {
            secureValueType = tL_secureRequiredType2.type;
        } else {
            secureValueType = null;
        }
        if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
            i10 = 1;
        } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
            i10 = 2;
        } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) {
            i10 = 3;
        } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail) {
            i10 = 4;
        } else {
            i10 = -1;
        }
        if (i10 != -1) {
            HashMap hashMap4 = this.f44185q1;
            if (!z10) {
                hashMap = (HashMap) hashMap4.get(o1(secureValueType2));
            } else {
                hashMap = null;
            }
            HashMap hashMap5 = (HashMap) hashMap4.get(o1(secureValueType));
            TLRPC.TL_secureValue r12 = r1(tL_secureRequiredType, false);
            TLRPC.TL_secureValue r13 = r1(tL_secureRequiredType2, false);
            HashMap hashMap6 = hashMap;
            TL_account.authorizationForm authorizationform = this.f44204y;
            int i11 = i10;
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
            wm0 wm0Var = new wm0(i11, authorizationform, password, tL_secureRequiredType, r12, tL_secureRequiredType2, r13, hashMap8, hashMap3);
            wm0Var.f44203x1 = new am0(this, secureValueType2, z10, i9);
            wm0Var.currentAccount = this.currentAccount;
            wm0Var.f44150a1 = this.f44150a1;
            wm0Var.Y0 = this.Y0;
            wm0Var.f44154c = this.f44154c;
            wm0Var.f44191s1 = hashMap6;
            wm0Var.f44187r0 = z10;
            wm0Var.f44193t1 = hashMap2;
            wm0Var.C = arrayList;
            if (i11 == 4) {
                wm0Var.Z0 = this.Z0;
            }
            presentFragment(wm0Var);
        }
    }

    public final void F1(int i9) {
        if (i9 == 0) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23 && getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            try {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File generatePicturePath = AndroidUtilities.generatePicturePath();
                if (generatePicturePath != null) {
                    if (i10 >= 24) {
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
        int i9 = this.O0;
        boolean z11 = true;
        if (i9 != 1 && i9 != 4 && (this.A.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.U;
                if (i10 < editTextBoldCursorArr.length) {
                    if (i10 != 5 && i10 != 8 && i10 != 4 && i10 != 6 && editTextBoldCursorArr[i10].length() > 0) {
                        z11 = false;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            z10 = z11;
        } else {
            z10 = false;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.j0(this.O0, 7, this, arrayList, z10));
    }

    public final TLRPC.TL_secureValue H1(TLRPC.TL_secureRequiredType tL_secureRequiredType) {
        if (tL_secureRequiredType == null) {
            return null;
        }
        int size = this.f44204y.values.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (tL_secureRequiredType.type.getClass() == this.f44204y.values.get(i9).type.getClass()) {
                return this.f44204y.values.remove(i9);
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
                    CharSequence charSequence3 = (String) this.U0.get(str2);
                    if (charSequence3 != null) {
                        editTextBoldCursor.setText(charSequence3);
                        break;
                    }
                    break;
                case 1:
                    if ("male".equals(str2)) {
                        this.f44198w = str2;
                        editTextBoldCursor.setText(LocaleController.getString(R.string.PassportMale));
                        break;
                    } else if ("female".equals(str2)) {
                        this.f44198w = str2;
                        editTextBoldCursor.setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                    break;
                case 2:
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    int[] iArr = this.f44201x;
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
                    this.f44189s = str2;
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
        HashMap hashMap2 = this.f44191s1;
        HashMap hashMap3 = this.f44195u1;
        if (hashMap2 != null && (charSequence2 = (String) hashMap2.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence2);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
            return;
        }
        HashMap hashMap4 = this.f44193t1;
        if (hashMap4 != null && (charSequence = (String) hashMap4.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
        }
    }

    public final void K1(int i9, boolean z10, Bundle bundle) {
        if (i9 == 3) {
            this.H.setVisibility(8);
        }
        int i10 = this.E1;
        org.telegram.ui.Components.cv0[] cv0VarArr = this.F1;
        org.telegram.ui.Components.cv0 cv0Var = cv0VarArr[i10];
        org.telegram.ui.Components.cv0 cv0Var2 = cv0VarArr[i9];
        this.E1 = i9;
        cv0Var2.m(bundle, false);
        cv0Var2.j();
        if (z10) {
            cv0Var2.setTranslationX(AndroidUtilities.displaySize.x);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.setDuration(300L);
            animatorSet.playTogether(ObjectAnimator.ofFloat(cv0Var, "translationX", -AndroidUtilities.displaySize.x), ObjectAnimator.ofFloat(cv0Var2, "translationX", 0.0f));
            animatorSet.addListener(new org.telegram.ui.Components.su0(cv0Var2, cv0Var, 6));
            animatorSet.start();
            return;
        }
        cv0Var2.setTranslationX(0.0f);
        cv0Var2.setVisibility(0);
        if (cv0Var != cv0Var2) {
            cv0Var.setVisibility(8);
        }
    }

    public final void L1(org.telegram.tgnet.TLRPC.TL_secureRequiredType r31, java.lang.String r32, java.lang.String r33, org.telegram.tgnet.TLRPC.TL_secureRequiredType r34, java.lang.String r35, boolean r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm0.L1(org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, boolean, int):void");
    }

    public final void M1(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
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
                org.telegram.ui.Components.jq jqVar = this.J;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(jqVar, property4, 0.1f);
                org.telegram.ui.Components.jq jqVar2 = this.J;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(jqVar2, property5, 0.1f);
                org.telegram.ui.Components.jq jqVar3 = this.J;
                Property property6 = View.ALPHA;
                animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(jqVar3, property6, 0.0f), ObjectAnimator.ofFloat(this.H.getContentView(), property4, 1.0f), ObjectAnimator.ofFloat(this.H.getContentView(), property5, 1.0f), ObjectAnimator.ofFloat(this.H.getContentView(), property6, 1.0f));
            }
            this.I.addListener(new bm0(this, z11, 0));
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
                org.telegram.ui.Components.jq jqVar4 = this.L;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(jqVar4, property10, 0.1f);
                org.telegram.ui.Components.jq jqVar5 = this.L;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(jqVar5, property11, 0.1f);
                org.telegram.ui.Components.jq jqVar6 = this.L;
                Property property12 = View.ALPHA;
                animatorSet5.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(jqVar6, property12, 0.0f), ObjectAnimator.ofFloat(this.K, property10, 1.0f), ObjectAnimator.ofFloat(this.K, property11, 1.0f), ObjectAnimator.ofFloat(this.K, property12, 1.0f));
            }
            this.I.addListener(new bm0(this, z11, 1));
            this.I.setDuration(150L);
            this.I.start();
        }
    }

    public final void O1(boolean z10, String str, Runnable runnable, lm0 lm0Var, nm0 nm0Var) {
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
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.AllowReadCall);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        c2Var.P = string;
                        this.H1 = showDialog(c2Var);
                    } else {
                        getParentActivity().requestPermissions((String[]) this.I1.toArray(new String[0]), 6);
                    }
                    this.A1 = str;
                    this.C1 = lm0Var;
                    this.B1 = runnable;
                    this.D1 = nm0Var;
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendverifyphonecode, new fh.h1(this, str, nm0Var, sendverifyphonecode, 15), 2);
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
        if (this.f44204y.values.isEmpty()) {
            this.f44199w0.setVisibility(0);
            this.f44167h0.setVisibility(8);
            this.f44163f0.setVisibility(8);
            this.f44192t0.setVisibility(8);
            this.f44194u0.setVisibility(8);
            this.f44196v0.setVisibility(8);
            return;
        }
        this.f44199w0.setVisibility(8);
        this.f44167h0.setVisibility(0);
        this.f44163f0.setVisibility(0);
        this.f44194u0.setVisibility(0);
        this.f44196v0.setVisibility(0);
        if (!s1(TLRPC.TL_secureValueTypePhone.class) && !s1(TLRPC.TL_secureValueTypeEmail.class) && !s1(TLRPC.TL_secureValueTypePersonalDetails.class) && !s1(TLRPC.TL_secureValueTypePassport.class) && !s1(TLRPC.TL_secureValueTypeInternalPassport.class) && !s1(TLRPC.TL_secureValueTypeIdentityCard.class) && !s1(TLRPC.TL_secureValueTypeDriverLicense.class) && !s1(TLRPC.TL_secureValueTypeAddress.class) && !s1(TLRPC.TL_secureValueTypeUtilityBill.class) && !s1(TLRPC.TL_secureValueTypePassportRegistration.class) && !s1(TLRPC.TL_secureValueTypeTemporaryRegistration.class) && !s1(TLRPC.TL_secureValueTypeBankStatement.class) && !s1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            this.f44192t0.setVisibility(8);
        } else {
            this.f44192t0.setVisibility(0);
        }
    }

    public final void R0(final SecureDocument secureDocument, final int i9) {
        String string;
        final String str;
        String formatDateForBan;
        HashMap hashMap;
        if (i9 == 1) {
            this.f44164f1 = secureDocument;
            if (this.f44155c0 == null) {
                return;
            }
        } else if (i9 == 4) {
            this.f44166g1.add(secureDocument);
            if (this.f44157d0 == null) {
                return;
            }
        } else if (i9 == 2) {
            this.f44168h1 = secureDocument;
            if (this.f44149a0 == null) {
                return;
            }
        } else if (i9 == 3) {
            this.f44170i1 = secureDocument;
            if (this.f44152b0 == null) {
                return;
            }
        } else {
            this.f44161e1.add(secureDocument);
            if (this.Z == null) {
                return;
            }
        }
        if (getParentActivity() == null) {
            return;
        }
        final um0 um0Var = new um0(this, getParentActivity());
        um0Var.setTag(secureDocument);
        um0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
        this.f44172j1.put(secureDocument, um0Var);
        String n12 = n1(secureDocument);
        if (i9 == 1) {
            string = LocaleController.getString(R.string.PassportSelfie);
            this.f44155c0.addView(um0Var, g7.e6.n(-1, -2));
            str = "selfie" + n12;
        } else if (i9 == 4) {
            string = LocaleController.getString(R.string.AttachPhoto);
            this.f44157d0.addView(um0Var, g7.e6.n(-1, -2));
            str = "translation" + n12;
        } else if (i9 == 2) {
            TLRPC.SecureValueType secureValueType = this.B.type;
            if (!(secureValueType instanceof TLRPC.TL_secureValueTypePassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                string = LocaleController.getString(R.string.PassportFrontSide);
            } else {
                string = LocaleController.getString(R.string.PassportMainPage);
            }
            this.f44149a0.addView(um0Var, g7.e6.n(-1, -2));
            str = "front" + n12;
        } else if (i9 == 3) {
            string = LocaleController.getString(R.string.PassportReverseSide);
            this.f44152b0.addView(um0Var, g7.e6.n(-1, -2));
            str = "reverse" + n12;
        } else {
            string = LocaleController.getString(R.string.AttachPhoto);
            this.Z.addView(um0Var, g7.e6.n(-1, -2));
            str = "files" + n12;
        }
        if (str != null && (hashMap = this.f44193t1) != null && (formatDateForBan = (String) hashMap.get(str)) != null) {
            um0Var.f43269b.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23212p7, false));
            this.f44195u1.put(str, "");
        } else {
            formatDateForBan = LocaleController.formatDateForBan(secureDocument.secureFile.date);
        }
        um0Var.f43268a.setText(string);
        um0Var.f43269b.setText(formatDateForBan);
        org.telegram.ui.Components.o9 o9Var = um0Var.f43270c;
        o9Var.getClass();
        o9Var.m(ImageLocation.getForSecureDocument(secureDocument), "48_48", null, null, null, null, 0, null);
        um0Var.f43272f = secureDocument;
        um0Var.a(false);
        um0Var.setOnClickListener(new gh.z0(this, i9, 19));
        um0Var.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                wm0 wm0Var = this;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wm0Var.getParentActivity());
                int i10 = i9;
                if (i10 == 1) {
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PassportDeleteSelfie);
                } else {
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PassportDeleteScan);
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new fh.z2(wm0Var, secureDocument, i10, um0Var, str, 5));
                wm0Var.showDialog(alertDialog$Builder.f22702a);
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
                    this.C0.setLayoutParams(g7.e6.k(0.0f, 25.0f, 0.0f, 0.0f, -1, -2));
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
                this.C0.setLayoutParams(g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
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

    public final void S0(TLRPC.TL_secureFile tL_secureFile, int i9) {
        byte[] bArr = tL_secureFile.secret;
        byte[] bArr2 = tL_secureFile.file_hash;
        byte[] computeSHA512 = Utilities.computeSHA512(i1(bArr, bArr2), bArr2);
        byte[] bArr3 = new byte[32];
        System.arraycopy(computeSHA512, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(computeSHA512, 32, bArr4, 0, 16);
        R0(new SecureDocument(new SecureDocumentKey(bArr3, bArr4), tL_secureFile, null, null, null), i9);
    }

    public final void S1(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm0.S1(int):void");
    }

    public final void T0(ArrayList arrayList) {
        this.f44161e1.clear();
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i9);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                S0((TLRPC.TL_secureFile) secureFile, 0);
            }
        }
    }

    public final org.telegram.ui.vm0 U0(android.content.Context r28, org.telegram.tgnet.TLRPC.TL_secureRequiredType r29, java.util.ArrayList r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm0.U0(android.content.Context, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.util.ArrayList, boolean, boolean):org.telegram.ui.vm0");
    }

    public final void V0(ArrayList arrayList) {
        this.f44166g1.clear();
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i9);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                S0((TLRPC.TL_secureFile) secureFile, 4);
            }
        }
    }

    public final void W0(boolean z10) {
        int i9;
        if (!this.f44156c1) {
            String str = this.f44177n;
            boolean isEmpty = TextUtils.isEmpty(str);
            int i10 = this.f44151b;
            if (!isEmpty) {
                if (z10) {
                    Activity parentActivity = getParentActivity();
                    ve.e.p(parentActivity, Uri.parse(str + "&tg_passport=success"), true, true);
                } else if (!this.f44153b1 && (i10 == 5 || i10 == 0)) {
                    Activity parentActivity2 = getParentActivity();
                    ve.e.p(parentActivity2, Uri.parse(str + "&tg_passport=cancel"), true, true);
                }
                this.f44156c1 = true;
            } else if (this.f44206y1) {
                if (z10 || (!this.f44153b1 && (i10 == 5 || i10 == 0))) {
                    Activity parentActivity3 = getParentActivity();
                    if (z10) {
                        i9 = -1;
                    } else {
                        i9 = 0;
                    }
                    parentActivity3.setResult(i9);
                }
                this.f44156c1 = true;
            }
        }
    }

    public final boolean X0(boolean z10) {
        if (u1()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new kl0(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DiscardChanges);
            String string = LocaleController.getString(R.string.PassportDiscardChanges);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
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
            int i9 = 0;
            if (this.A.native_names && !TextUtils.isEmpty(this.v) && !"EN".equals(str3)) {
                if (this.m0.getVisibility() != 0) {
                    this.m0.setVisibility(0);
                    this.f44163f0.setVisibility(0);
                    this.P.setVisibility(0);
                    int i10 = 0;
                    while (true) {
                        editTextBoldCursorArr = this.W;
                        if (i10 >= editTextBoldCursorArr.length) {
                            break;
                        }
                        ((View) editTextBoldCursorArr[i10].getParent()).setVisibility(0);
                        i10++;
                    }
                    if (editTextBoldCursorArr[0].length() == 0 && this.W[1].length() == 0 && this.W[2].length() == 0) {
                        int i11 = 0;
                        while (true) {
                            boolean[] zArr = this.f44182p0;
                            if (i11 >= zArr.length) {
                                break;
                            } else if (zArr[i11]) {
                                this.W[0].setText(this.U[0].getText());
                                this.W[1].setText(this.U[1].getText());
                                this.W[2].setText(this.U[2].getText());
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                    this.f44169i0.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.f6.f22966b7));
                }
                this.m0.setText(LocaleController.formatString("PassportNativeInfo", R.string.PassportNativeInfo, str2));
                if (str3 != null) {
                    str = LocaleController.getServerString("PassportLanguage_".concat(str3));
                } else {
                    str = null;
                }
                if (str != null) {
                    this.f44163f0.setText(LocaleController.formatString("PassportNativeHeaderLang", R.string.PassportNativeHeaderLang, str));
                } else {
                    this.f44163f0.setText(LocaleController.getString(R.string.PassportNativeHeader));
                }
                for (int i12 = 0; i12 < 3; i12++) {
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 == 2) {
                                if (str != null) {
                                    this.W[i12].setHintText(LocaleController.getString(R.string.PassportSurname));
                                } else {
                                    this.W[i12].setHintText(LocaleController.formatString("PassportSurnameCountry", R.string.PassportSurnameCountry, str2));
                                }
                            }
                        } else if (str != null) {
                            this.W[i12].setHintText(LocaleController.getString(R.string.PassportMidname));
                        } else {
                            this.W[i12].setHintText(LocaleController.formatString("PassportMidnameCountry", R.string.PassportMidnameCountry, str2));
                        }
                    } else if (str != null) {
                        this.W[i12].setHintText(LocaleController.getString(R.string.PassportName));
                    } else {
                        this.W[i12].setHintText(LocaleController.formatString("PassportNameCountry", R.string.PassportNameCountry, str2));
                    }
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new hl0(this, 2));
                }
            } else if (this.m0.getVisibility() != 8) {
                this.m0.setVisibility(8);
                this.f44163f0.setVisibility(8);
                this.P.setVisibility(8);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.W;
                    if (i9 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    ((View) editTextBoldCursorArr2[i9].getParent()).setVisibility(8);
                    i9++;
                }
                if (((this.f44154c != 0 || this.B == null) && this.D != null && !this.f44187r0) || this.E != null) {
                    this.f44169i0.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.f6.f22966b7));
                } else {
                    this.f44169i0.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7));
                }
            }
        }
    }

    public final void a1(boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        String str2;
        if (this.f44175l0 != null) {
            HashMap hashMap = this.f44191s1;
            HashMap hashMap2 = this.f44195u1;
            if (hashMap != null && ((z10 || hashMap2.containsKey("error_all")) && (str2 = (String) this.f44191s1.get("error_all")) != null)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
                if (z10) {
                    hashMap2.put("error_all", "");
                }
            } else {
                spannableStringBuilder = null;
            }
            if (this.f44193t1 != null && ((z10 || hashMap2.containsKey("error_document_all")) && (str = (String) this.f44193t1.get("error_all")) != null)) {
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
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23212p7, false)), 0, spannableStringBuilder.length(), 33);
                this.f44175l0.setText(spannableStringBuilder);
                this.f44175l0.setVisibility(0);
            } else if (this.f44175l0.getVisibility() != 8) {
                this.f44175l0.setVisibility(8);
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
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
        this.f44175l0 = b9Var;
        int i9 = R.drawable.greydivider_top;
        int i10 = org.telegram.ui.ActionBar.f6.f22966b7;
        b9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, i9, i10));
        this.f44175l0.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.Y.addView(this.f44175l0, g7.e6.n(-1, -2));
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
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
            this.f44163f0 = m4Var;
            m4Var.setText(LocaleController.getString(R.string.PassportDocuments));
            org.telegram.ui.Cells.m4 m4Var2 = this.f44163f0;
            int i11 = org.telegram.ui.ActionBar.f6.f23001d6;
            m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
            this.Y.addView(this.f44163f0, g7.e6.n(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.Z = linearLayout;
            linearLayout.setOrientation(1);
            this.Y.addView(this.Z, g7.e6.n(-1, -2));
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
            this.N = baVar;
            baVar.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
            this.Y.addView(this.N, g7.e6.n(-1, -2));
            this.N.setOnClickListener(new il0(this, 7));
            org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context);
            this.f44171j0 = b9Var2;
            b9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider, i10));
            if (this.f44154c != 0) {
                this.f44197v1 = LocaleController.getString(R.string.PassportAddAddressUploadInfo);
            } else {
                TLRPC.SecureValueType secureValueType2 = this.B.type;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                    this.f44197v1 = LocaleController.getString(R.string.PassportAddAgreementInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                    this.f44197v1 = LocaleController.getString(R.string.PassportAddBillInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                    this.f44197v1 = LocaleController.getString(R.string.PassportAddPassportRegistrationInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                    this.f44197v1 = LocaleController.getString(R.string.PassportAddTemporaryRegistrationInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                    this.f44197v1 = LocaleController.getString(R.string.PassportAddBankInfo);
                } else {
                    this.f44197v1 = "";
                }
            }
            String str2 = this.f44197v1;
            HashMap hashMap = this.f44193t1;
            j10 = 0;
            HashMap hashMap2 = this.f44195u1;
            String str3 = str2;
            if (hashMap != null) {
                String str4 = (String) hashMap.get("files_all");
                str3 = str2;
                if (str4 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                    spannableStringBuilder.append((CharSequence) this.f44197v1);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23212p7, false)), 0, str4.length(), 33);
                    hashMap2.put("files_all", "");
                    str3 = spannableStringBuilder;
                }
            }
            this.f44171j0.setText(str3);
            this.Y.addView(this.f44171j0, g7.e6.n(-1, -2));
            if (this.B.translation_required) {
                org.telegram.ui.Cells.m4 m4Var3 = new org.telegram.ui.Cells.m4(context);
                this.f44163f0 = m4Var3;
                m4Var3.setText(LocaleController.getString(R.string.PassportTranslation));
                this.f44163f0.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                this.Y.addView(this.f44163f0, g7.e6.n(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.f44157d0 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.Y.addView(this.f44157d0, g7.e6.n(-1, -2));
                org.telegram.ui.Cells.ba baVar2 = new org.telegram.ui.Cells.ba(context);
                this.T = baVar2;
                baVar2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
                this.Y.addView(this.T, g7.e6.n(-1, -2));
                this.T.setOnClickListener(new il0(this, 8));
                org.telegram.ui.Cells.b9 b9Var3 = new org.telegram.ui.Cells.b9(context);
                this.f44173k0 = b9Var3;
                b9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider, i10));
                if (this.f44154c != 0) {
                    this.f44200w1 = LocaleController.getString(R.string.PassportAddTranslationUploadInfo);
                } else {
                    TLRPC.SecureValueType secureValueType3 = this.B.type;
                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                        this.f44200w1 = LocaleController.getString(R.string.PassportAddTranslationAgreementInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                        this.f44200w1 = LocaleController.getString(R.string.PassportAddTranslationBillInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                        this.f44200w1 = LocaleController.getString(R.string.PassportAddTranslationPassportRegistrationInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                        this.f44200w1 = LocaleController.getString(R.string.PassportAddTranslationTemporaryRegistrationInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                        this.f44200w1 = LocaleController.getString(R.string.PassportAddTranslationBankInfo);
                    } else {
                        this.f44200w1 = "";
                    }
                }
                String str5 = this.f44200w1;
                HashMap hashMap3 = this.f44193t1;
                String str6 = str5;
                if (hashMap3 != null) {
                    String str7 = (String) hashMap3.get("translation_all");
                    str6 = str5;
                    if (str7 != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str7);
                        spannableStringBuilder2.append((CharSequence) "\n\n");
                        spannableStringBuilder2.append((CharSequence) this.f44200w1);
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23212p7, false)), 0, str7.length(), 33);
                        hashMap2.put("translation_all", "");
                        str6 = spannableStringBuilder2;
                    }
                }
                this.f44173k0.setText(str6);
                this.Y.addView(this.f44173k0, g7.e6.n(-1, -2));
            }
        } else {
            j10 = 0;
            this.actionBar.setTitle(LocaleController.getString(R.string.PassportAddress));
        }
        org.telegram.ui.Cells.m4 m4Var4 = new org.telegram.ui.Cells.m4(context);
        this.f44163f0 = m4Var4;
        m4Var4.setText(LocaleController.getString(R.string.PassportAddressHeader));
        this.f44163f0.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        this.Y.addView(this.f44163f0, g7.e6.n(-1, -2));
        this.U = new EditTextBoldCursor[6];
        for (int i12 = 0; i12 < 6; i12++) {
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.U[i12] = editTextBoldCursor;
            rl0 rl0Var = new rl0(context, editTextBoldCursor, 0);
            rl0Var.setWillNotDraw(false);
            this.Y.addView(rl0Var, g7.e6.n(-1, -2));
            int i13 = org.telegram.ui.ActionBar.f6.f23001d6;
            rl0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
            int i14 = 5;
            if (i12 == 5) {
                View view = new View(context);
                this.O = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
                this.Y.addView(this.O, g7.e6.n(-1, 6));
            }
            if (this.f44187r0 && this.B != null) {
                rl0Var.setVisibility(8);
                View view2 = this.O;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            this.U[i12].setTag(Integer.valueOf(i12));
            this.U[i12].setSupportRtlHint(true);
            this.U[i12].setTextSize(1, 16.0f);
            this.U[i12].setHintColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.H6, false));
            this.U[i12].setHeaderHintColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L6, false));
            this.U[i12].setTransformHintToHeader(true);
            EditTextBoldCursor editTextBoldCursor2 = this.U[i12];
            int i15 = org.telegram.ui.ActionBar.f6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
            this.U[i12].setBackgroundDrawable(null);
            this.U[i12].setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
            this.U[i12].setCursorSize(AndroidUtilities.dp(20.0f));
            this.U[i12].setCursorWidth(1.5f);
            this.U[i12].setLineColors(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23127k6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23144l6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23212p7, false));
            if (i12 == 5) {
                this.U[i12].setOnTouchListener(new jl0(this, 2));
                this.U[i12].setInputType(0);
                this.U[i12].setFocusable(false);
            } else {
                this.U[i12].setInputType(16385);
                this.U[i12].setImeOptions(268435461);
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                if (i12 == 5) {
                                    this.U[i12].setHintText(LocaleController.getString(R.string.PassportCountry));
                                    str = "country_code";
                                }
                            } else {
                                this.U[i12].setHintText(LocaleController.getString(R.string.PassportState));
                                str = "state";
                            }
                        } else {
                            this.U[i12].setHintText(LocaleController.getString(R.string.PassportCity));
                            str = "city";
                        }
                    } else {
                        this.U[i12].setHintText(LocaleController.getString(R.string.PassportPostcode));
                        str = "post_code";
                    }
                } else {
                    this.U[i12].setHintText(LocaleController.getString(R.string.PassportStreet2));
                    str = "street_line2";
                }
            } else {
                this.U[i12].setHintText(LocaleController.getString(R.string.PassportStreet1));
                str = "street_line1";
            }
            J1(this.f44181o1, this.U[i12], str);
            if (i12 == 2) {
                this.U[i12].addTextChangedListener(new sl0(this, editTextBoldCursor, str));
                this.U[i12].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            } else {
                this.U[i12].addTextChangedListener(new tl0(this, editTextBoldCursor, str, 0));
            }
            EditTextBoldCursor editTextBoldCursor3 = this.U[i12];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.U[i12].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.U[i12];
            if (!LocaleController.isRTL) {
                i14 = 3;
            }
            editTextBoldCursor4.setGravity(i14 | 16);
            rl0Var.addView(this.U[i12], g7.e6.d(-1, 64.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
            this.U[i12].setOnEditorActionListener(new gl0(this, 4));
        }
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
        this.f44167h0 = z6Var;
        this.Y.addView(z6Var, g7.e6.n(-1, -2));
        if (this.f44187r0 && this.B != null) {
            this.f44163f0.setVisibility(8);
            this.f44167h0.setVisibility(8);
        }
        long j11 = this.f44154c;
        TLRPC.TL_secureValue tL_secureValue = this.E;
        if (((j11 != j10 || this.B == null) && this.D != null && !this.f44187r0) || tL_secureValue != null) {
            if (tL_secureValue != null) {
                T0(tL_secureValue.files);
                V0(tL_secureValue.translation);
            }
            org.telegram.ui.Cells.z6 z6Var2 = this.f44167h0;
            int i16 = R.drawable.greydivider;
            int i17 = org.telegram.ui.ActionBar.f6.f22966b7;
            z6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, i16, i17));
            org.telegram.ui.Cells.ba baVar3 = new org.telegram.ui.Cells.ba(context);
            baVar3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23212p7, false));
            baVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
            if (this.B == null) {
                baVar3.b(LocaleController.getString(R.string.PassportDeleteInfo), false);
            } else {
                baVar3.b(LocaleController.getString(R.string.PassportDeleteDocument), false);
            }
            this.Y.addView(baVar3, g7.e6.n(-1, -2));
            baVar3.setOnClickListener(new il0(this, 9));
            org.telegram.ui.Cells.z6 z6Var3 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
            this.f44167h0 = z6Var3;
            z6Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, i17));
            this.Y.addView(this.f44167h0, g7.e6.n(-1, -2));
        } else {
            org.telegram.ui.Cells.z6 z6Var4 = this.f44167h0;
            int i18 = R.drawable.greydivider_bottom;
            int i19 = org.telegram.ui.ActionBar.f6.f22966b7;
            z6Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, i18, i19));
            if (this.f44187r0 && this.B != null) {
                this.f44171j0.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, i19));
            }
        }
        S1(0);
        S1(4);
    }

    public final void c1() {
        if (getParentActivity() != null && this.N0 == null) {
            org.telegram.ui.Components.ki kiVar = new org.telegram.ui.Components.ki(getParentActivity(), this, false, false);
            this.N0 = kiVar;
            kiVar.V1 = new cm0(this);
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm0.createView(android.content.Context):android.view.View");
    }

    public final void d1() {
        int dp;
        int dp2;
        boolean[] zArr = {true};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new nl0(0, this, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = string;
        boolean z10 = this.f44187r0;
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.A;
        if (z10 && this.B == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeAddress)) {
            c2Var.P = LocaleController.getString(R.string.PassportDeleteAddressAlert);
        } else if (z10 && this.B == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            c2Var.P = LocaleController.getString(R.string.PassportDeletePersonalAlert);
        } else {
            c2Var.P = LocaleController.getString(R.string.PassportDeleteDocumentAlert);
        }
        if (!this.f44187r0 && this.B != null) {
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(getParentActivity(), 1);
            z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                z1Var.e(LocaleController.getString(R.string.PassportDeleteDocumentAddress), "", true, false, false);
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                z1Var.e(LocaleController.getString(R.string.PassportDeleteDocumentPersonal), "", true, false, false);
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
            z1Var.setPadding(dp, 0, dp2, 0);
            frameLayout.addView(z1Var, g7.e6.e(-1, 48, 51));
            z1Var.setOnClickListener(new l8(4, zArr));
            alertDialog$Builder.n(frameLayout);
        }
        showDialog(c2Var);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        EditTextBoldCursor editTextBoldCursor;
        um0 um0Var;
        org.telegram.ui.ActionBar.w0 w0Var;
        if (i9 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            HashMap hashMap = this.f44174k1;
            SecureDocument secureDocument = (SecureDocument) hashMap.get(str);
            if (secureDocument != null) {
                secureDocument.inputFile = (TLRPC.TL_inputFile) objArr[1];
                hashMap.remove(str);
                if (hashMap.isEmpty() && (w0Var = this.H) != null) {
                    w0Var.setEnabled(true);
                    this.H.setAlpha(1.0f);
                }
                HashMap hashMap2 = this.f44172j1;
                if (hashMap2 != null && (um0Var = (um0) hashMap2.get(secureDocument)) != null) {
                    um0Var.a(true);
                }
                HashMap hashMap3 = this.f44195u1;
                if (hashMap3 != null && hashMap3.containsKey("error_document_all")) {
                    hashMap3.remove("error_document_all");
                    a1(false);
                }
                int i11 = secureDocument.type;
                if (i11 == 0) {
                    if (this.f44171j0 != null && !TextUtils.isEmpty(this.f44197v1)) {
                        this.f44171j0.setText(this.f44197v1);
                    }
                    hashMap3.remove("files_all");
                } else if (i11 == 4) {
                    if (this.f44173k0 != null && !TextUtils.isEmpty(this.f44200w1)) {
                        this.f44173k0.setText(this.f44200w1);
                    }
                    hashMap3.remove("translation_all");
                }
            }
        } else if (i9 != NotificationCenter.fileUploadFailed && i9 == NotificationCenter.twoStepPasswordChanged) {
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
        org.telegram.ui.Components.ki kiVar = this.N0;
        if (kiVar != null && this.visibleDialog == kiVar) {
            kiVar.f30114f0.Z(false);
            this.N0.dismissInternal();
            this.N0.f30114f0.c0(true);
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
        int i9;
        String str;
        int i10;
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
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
        this.f44175l0 = b9Var;
        int i11 = R.drawable.greydivider_top;
        int i12 = org.telegram.ui.ActionBar.f6.f22966b7;
        b9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, i11, i12));
        boolean z10 = false;
        this.f44175l0.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        int i13 = -1;
        this.Y.addView(this.f44175l0, g7.e6.n(-1, -2));
        a1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.B;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.A;
        if (tL_secureRequiredType != null) {
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
            this.f44163f0 = m4Var;
            if (this.f44187r0) {
                m4Var.setText(LocaleController.getString(R.string.PassportDocuments));
            } else {
                m4Var.setText(LocaleController.getString(R.string.PassportRequiredDocuments));
            }
            org.telegram.ui.Cells.m4 m4Var2 = this.f44163f0;
            int i14 = org.telegram.ui.ActionBar.f6.f23001d6;
            m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
            this.Y.addView(this.f44163f0, g7.e6.n(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f44149a0 = linearLayout;
            linearLayout.setOrientation(1);
            this.Y.addView(this.f44149a0, g7.e6.n(-1, -2));
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            this.Q = a9Var;
            a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
            this.Y.addView(this.Q, g7.e6.n(-1, -2));
            this.Q.setOnClickListener(new il0(this, 0));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.f44152b0 = linearLayout2;
            linearLayout2.setOrientation(1);
            this.Y.addView(this.f44152b0, g7.e6.n(-1, -2));
            boolean z11 = this.B.selfie_required;
            org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context);
            this.R = a9Var2;
            a9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
            j10 = 0;
            this.R.a(LocaleController.getString(R.string.PassportReverseSide), LocaleController.getString(R.string.PassportReverseSideInfo), z11);
            this.Y.addView(this.R, g7.e6.n(-1, -2));
            this.R.setOnClickListener(new il0(this, 2));
            if (this.B.selfie_required) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.f44155c0 = linearLayout3;
                linearLayout3.setOrientation(1);
                this.Y.addView(this.f44155c0, g7.e6.n(-1, -2));
                org.telegram.ui.Cells.a9 a9Var3 = new org.telegram.ui.Cells.a9(context);
                this.S = a9Var3;
                a9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
                this.S.a(LocaleController.getString(R.string.PassportSelfie), LocaleController.getString(R.string.PassportSelfieInfo), tL_secureRequiredType2.translation_required);
                this.Y.addView(this.S, g7.e6.n(-1, -2));
                this.S.setOnClickListener(new il0(this, 3));
            }
            org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context);
            this.f44171j0 = b9Var2;
            b9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider, i12));
            this.f44171j0.setText(LocaleController.getString(R.string.PassportPersonalUploadInfo));
            this.Y.addView(this.f44171j0, g7.e6.n(-1, -2));
            if (this.B.translation_required) {
                org.telegram.ui.Cells.m4 m4Var3 = new org.telegram.ui.Cells.m4(context);
                this.f44163f0 = m4Var3;
                m4Var3.setText(LocaleController.getString(R.string.PassportTranslation));
                this.f44163f0.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
                this.Y.addView(this.f44163f0, g7.e6.n(-1, -2));
                LinearLayout linearLayout4 = new LinearLayout(context);
                this.f44157d0 = linearLayout4;
                linearLayout4.setOrientation(1);
                this.Y.addView(this.f44157d0, g7.e6.n(-1, -2));
                org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
                this.T = baVar;
                baVar.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
                this.Y.addView(this.T, g7.e6.n(-1, -2));
                this.T.setOnClickListener(new il0(this, 4));
                org.telegram.ui.Cells.b9 b9Var3 = new org.telegram.ui.Cells.b9(context);
                this.f44173k0 = b9Var3;
                b9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider, i12));
                if (this.f44154c != 0) {
                    this.f44200w1 = LocaleController.getString(R.string.PassportAddTranslationUploadInfo);
                } else {
                    TLRPC.SecureValueType secureValueType = this.B.type;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
                        this.f44200w1 = LocaleController.getString(R.string.PassportAddPassportInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                        this.f44200w1 = LocaleController.getString(R.string.PassportAddInternalPassportInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                        this.f44200w1 = LocaleController.getString(R.string.PassportAddIdentityCardInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                        this.f44200w1 = LocaleController.getString(R.string.PassportAddDriverLicenceInfo);
                    } else {
                        this.f44200w1 = "";
                    }
                }
                String str3 = this.f44200w1;
                HashMap hashMap = this.f44193t1;
                String str4 = str3;
                if (hashMap != null) {
                    String str5 = (String) hashMap.get("translation_all");
                    str4 = str3;
                    if (str5 != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str5);
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) this.f44200w1);
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23212p7, false)), 0, str5.length(), 33);
                        this.f44195u1.put("translation_all", "");
                        str4 = spannableStringBuilder;
                    }
                }
                this.f44173k0.setText(str4);
                this.Y.addView(this.f44173k0, g7.e6.n(-1, -2));
            }
        } else {
            j10 = 0;
            org.telegram.ui.Cells.ba baVar2 = new org.telegram.ui.Cells.ba(context);
            this.f44178n0 = baVar2;
            baVar2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
            this.f44178n0.b(LocaleController.getString(R.string.PassportScanPassport), false);
            this.Y.addView(this.f44178n0, g7.e6.n(-1, -2));
            this.f44178n0.setOnClickListener(new il0(this, 5));
            org.telegram.ui.Cells.b9 b9Var4 = new org.telegram.ui.Cells.b9(context);
            this.f44171j0 = b9Var4;
            b9Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider, i12));
            this.f44171j0.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            this.Y.addView(this.f44171j0, g7.e6.n(-1, -2));
        }
        org.telegram.ui.Cells.m4 m4Var4 = new org.telegram.ui.Cells.m4(context);
        this.f44163f0 = m4Var4;
        if (this.f44187r0) {
            m4Var4.setText(LocaleController.getString(R.string.PassportDocument));
        } else {
            m4Var4.setText(LocaleController.getString(R.string.PassportPersonal));
        }
        this.f44163f0.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        this.Y.addView(this.f44163f0, g7.e6.n(-1, -2));
        int i15 = 7;
        if (this.B != null) {
            i9 = 9;
        } else {
            i9 = 7;
        }
        this.U = new EditTextBoldCursor[i9];
        int i16 = 0;
        while (true) {
            HashMap hashMap2 = this.f44181o1;
            if (i16 < i9) {
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.U[i16] = editTextBoldCursor;
                rl0 rl0Var = new rl0(context, editTextBoldCursor, 1);
                rl0Var.setWillNotDraw(z10);
                this.Y.addView(rl0Var, g7.e6.n(i13, 64));
                int i17 = org.telegram.ui.ActionBar.f6.f23001d6;
                rl0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i17, z10));
                if (i16 == i9 - 1) {
                    View view = new View(context);
                    this.O = view;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i17, z10));
                    this.Y.addView(this.O, g7.e6.n(i13, 6));
                }
                if (this.f44187r0 && this.B != null && i16 < i15) {
                    rl0Var.setVisibility(8);
                    View view2 = this.O;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                }
                this.U[i16].setTag(Integer.valueOf(i16));
                this.U[i16].setSupportRtlHint(r42);
                this.U[i16].setTextSize(r42, 16.0f);
                this.U[i16].setHintColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.H6, false));
                EditTextBoldCursor editTextBoldCursor2 = this.U[i16];
                int i18 = org.telegram.ui.ActionBar.f6.G6;
                editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i18, false));
                this.U[i16].setHeaderHintColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L6, false));
                this.U[i16].setTransformHintToHeader(r42);
                this.U[i16].setBackgroundDrawable(null);
                this.U[i16].setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i18, false));
                this.U[i16].setCursorSize(AndroidUtilities.dp(20.0f));
                this.U[i16].setCursorWidth(1.5f);
                this.U[i16].setLineColors(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23127k6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23144l6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23212p7, false));
                int i19 = 5;
                if (i16 != 5 && i16 != 6) {
                    if (i16 != 3 && i16 != 8) {
                        if (i16 == 4) {
                            this.U[i16].setOnTouchListener(new jl0(this, 1));
                            this.U[i16].setInputType(0);
                            this.U[i16].setFocusable(false);
                        } else {
                            this.U[i16].setInputType(16385);
                            this.U[i16].setImeOptions(268435461);
                        }
                    } else {
                        this.U[i16].setOnTouchListener(new kh.r1(7, this, context));
                        this.U[i16].setInputType(0);
                        this.U[i16].setFocusable(false);
                    }
                } else {
                    this.U[i16].setOnTouchListener(new jl0(this, 0));
                    this.U[i16].setInputType(0);
                }
                HashMap hashMap3 = this.f44183p1;
                switch (i16) {
                    case 0:
                        if (tL_secureRequiredType2.native_names) {
                            this.U[i16].setHintText(LocaleController.getString(R.string.PassportNameLatin));
                        } else {
                            this.U[i16].setHintText(LocaleController.getString(R.string.PassportName));
                        }
                        str2 = "first_name";
                        break;
                    case 1:
                        if (tL_secureRequiredType2.native_names) {
                            this.U[i16].setHintText(LocaleController.getString(R.string.PassportMidnameLatin));
                        } else {
                            this.U[i16].setHintText(LocaleController.getString(R.string.PassportMidname));
                        }
                        str2 = "middle_name";
                        break;
                    case 2:
                        if (tL_secureRequiredType2.native_names) {
                            this.U[i16].setHintText(LocaleController.getString(R.string.PassportSurnameLatin));
                        } else {
                            this.U[i16].setHintText(LocaleController.getString(R.string.PassportSurname));
                        }
                        str2 = "last_name";
                        break;
                    case 3:
                        this.U[i16].setHintText(LocaleController.getString(R.string.PassportBirthdate));
                        str2 = "birth_date";
                        break;
                    case 4:
                        this.U[i16].setHintText(LocaleController.getString(R.string.PassportGender));
                        str2 = "gender";
                        break;
                    case 5:
                        this.U[i16].setHintText(LocaleController.getString(R.string.PassportCitizenship));
                        str2 = "country_code";
                        break;
                    case 6:
                        this.U[i16].setHintText(LocaleController.getString(R.string.PassportResidence));
                        str2 = "residence_country_code";
                        break;
                    case 7:
                        this.U[i16].setHintText(LocaleController.getString(R.string.PassportDocumentNumber));
                        str2 = "document_no";
                        hashMap2 = hashMap3;
                        break;
                    case 8:
                        this.U[i16].setHintText(LocaleController.getString(R.string.PassportExpired));
                        str2 = "expiry_date";
                        hashMap2 = hashMap3;
                        break;
                    default:
                        i16++;
                        r42 = 1;
                        i15 = 7;
                        z10 = false;
                        i13 = -1;
                }
                J1(hashMap2, this.U[i16], str2);
                EditTextBoldCursor editTextBoldCursor3 = this.U[i16];
                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                if (i16 != 0 && i16 != 2 && i16 != 1) {
                    this.U[i16].addTextChangedListener(new org.telegram.ui.Components.qw0(this, editTextBoldCursor, str2, hashMap2));
                } else {
                    this.U[i16].addTextChangedListener(new vl0(this, editTextBoldCursor, str2));
                }
                this.U[i16].setPadding(0, 0, 0, 0);
                EditTextBoldCursor editTextBoldCursor4 = this.U[i16];
                if (!LocaleController.isRTL) {
                    i19 = 3;
                }
                editTextBoldCursor4.setGravity(i19 | 16);
                rl0Var.addView(this.U[i16], g7.e6.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                this.U[i16].setOnEditorActionListener(new gl0(this, 1));
                i16++;
                r42 = 1;
                i15 = 7;
                z10 = false;
                i13 = -1;
            } else {
                org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                this.f44169i0 = z6Var;
                this.Y.addView(z6Var, g7.e6.n(-1, -2));
                org.telegram.ui.Cells.m4 m4Var5 = new org.telegram.ui.Cells.m4(context);
                this.f44163f0 = m4Var5;
                m4Var5.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                this.Y.addView(this.f44163f0, g7.e6.n(-1, -2));
                this.W = new EditTextBoldCursor[3];
                int i20 = 0;
                for (int i21 = 3; i20 < i21; i21 = 3) {
                    EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
                    this.W[i20] = editTextBoldCursor5;
                    rl0 rl0Var2 = new rl0(context, editTextBoldCursor5, 2);
                    rl0Var2.setWillNotDraw(false);
                    this.Y.addView(rl0Var2, g7.e6.n(-1, 64));
                    int i22 = org.telegram.ui.ActionBar.f6.f23001d6;
                    rl0Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i22, false));
                    if (i20 == 2) {
                        View view3 = new View(context);
                        this.P = view3;
                        view3.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i22, false));
                        this.Y.addView(this.P, g7.e6.n(-1, 6));
                    }
                    this.W[i20].setTag(Integer.valueOf(i20));
                    this.W[i20].setSupportRtlHint(true);
                    this.W[i20].setTextSize(1, 16.0f);
                    this.W[i20].setHintColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.H6, false));
                    EditTextBoldCursor editTextBoldCursor6 = this.W[i20];
                    int i23 = org.telegram.ui.ActionBar.f6.G6;
                    editTextBoldCursor6.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i23, false));
                    this.W[i20].setHeaderHintColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L6, false));
                    this.W[i20].setTransformHintToHeader(true);
                    this.W[i20].setBackgroundDrawable(null);
                    this.W[i20].setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i23, false));
                    this.W[i20].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.W[i20].setCursorWidth(1.5f);
                    this.W[i20].setLineColors(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23127k6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23144l6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23212p7, false));
                    this.W[i20].setInputType(16385);
                    this.W[i20].setImeOptions(268435461);
                    if (i20 != 0) {
                        if (i20 != 1) {
                            if (i20 == 2) {
                                str = "last_name_native";
                            } else {
                                i20++;
                            }
                        } else {
                            str = "middle_name_native";
                        }
                    } else {
                        str = "first_name_native";
                    }
                    J1(hashMap2, this.W[i20], str);
                    EditTextBoldCursor editTextBoldCursor7 = this.W[i20];
                    editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
                    if (i20 == 0 || i20 == 2 || i20 == 1) {
                        this.W[i20].addTextChangedListener(new tl0(this, editTextBoldCursor5, str, 1));
                    }
                    this.W[i20].setPadding(0, 0, 0, 0);
                    EditTextBoldCursor editTextBoldCursor8 = this.W[i20];
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    editTextBoldCursor8.setGravity(i10 | 16);
                    rl0Var2.addView(this.W[i20], g7.e6.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.W[i20].setOnEditorActionListener(new gl0(this, 2));
                    i20++;
                }
                org.telegram.ui.Cells.b9 b9Var5 = new org.telegram.ui.Cells.b9(context);
                this.m0 = b9Var5;
                this.Y.addView(b9Var5, g7.e6.n(-1, -2));
                long j11 = this.f44154c;
                TLRPC.TL_secureValue tL_secureValue = this.E;
                if (((j11 != j10 || this.B == null) && this.D != null && !this.f44187r0) || tL_secureValue != null) {
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
                    org.telegram.ui.Cells.ba baVar3 = new org.telegram.ui.Cells.ba(context);
                    baVar3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23212p7, false));
                    baVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
                    if (this.B == null) {
                        baVar3.b(LocaleController.getString(R.string.PassportDeleteInfo), false);
                    } else {
                        baVar3.b(LocaleController.getString(R.string.PassportDeleteDocument), false);
                    }
                    this.Y.addView(baVar3, g7.e6.n(-1, -2));
                    baVar3.setOnClickListener(new il0(this, 1));
                    org.telegram.ui.Cells.b9 b9Var6 = this.m0;
                    int i24 = R.drawable.greydivider;
                    int i25 = org.telegram.ui.ActionBar.f6.f22966b7;
                    b9Var6.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, i24, i25));
                    org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                    this.f44167h0 = z6Var2;
                    z6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, i25));
                    this.Y.addView(this.f44167h0, g7.e6.n(-1, -2));
                } else {
                    this.m0.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7));
                }
                P1();
                Y0(false);
                return;
            }
        }
    }

    public final void f1(android.content.Context r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm0.f1(android.content.Context):void");
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
        Collections.sort(this.Q0, new a5.e(10));
        String str2 = UserConfig.getInstance(this.currentAccount).getCurrentUser().phone;
        org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
        String str3 = null;
        baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23229q6, false));
        baVar.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
        int i9 = R.string.PassportPhoneUseSame;
        ne.b c10 = ne.b.c();
        baVar.b(LocaleController.formatString("PassportPhoneUseSame", i9, c10.b("+" + str2)), false);
        this.Y.addView(baVar, g7.e6.n(-1, -2));
        baVar.setOnClickListener(new il0(this, 16));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
        this.f44171j0 = b9Var;
        b9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7));
        this.f44171j0.setText(LocaleController.getString(R.string.PassportPhoneUseSameInfo));
        this.Y.addView(this.f44171j0, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        this.f44163f0 = m4Var;
        m4Var.setText(LocaleController.getString(R.string.PassportPhoneUseOther));
        this.f44163f0.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        this.Y.addView(this.f44163f0, g7.e6.n(-1, -2));
        this.U = new EditTextBoldCursor[3];
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 2) {
                this.U[i10] = new org.telegram.ui.Components.p30(context);
            } else {
                this.U[i10] = new EditTextBoldCursor(context);
            }
            if (i10 == 1) {
                frameLayout = org.telegram.messenger.ll.f(context, 0);
                this.Y.addView(frameLayout, g7.e6.n(-1, 50));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
            } else if (i10 == 2) {
                frameLayout = (ViewGroup) this.U[1].getParent();
            } else {
                frameLayout = new FrameLayout(context);
                this.Y.addView(frameLayout, g7.e6.n(-1, 50));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
            }
            this.U[i10].setTag(Integer.valueOf(i10));
            this.U[i10].setTextSize(1, 16.0f);
            this.U[i10].setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.U[i10];
            int i11 = org.telegram.ui.ActionBar.f6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
            this.U[i10].setBackgroundDrawable(null);
            this.U[i10].setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
            this.U[i10].setCursorSize(AndroidUtilities.dp(20.0f));
            this.U[i10].setCursorWidth(1.5f);
            if (i10 == 0) {
                this.U[i10].setOnTouchListener(new jl0(this, 3));
                this.U[i10].setText(LocaleController.getString(R.string.ChooseCountry));
                this.U[i10].setInputType(0);
                this.U[i10].setFocusable(false);
            } else {
                this.U[i10].setInputType(3);
                if (i10 == 2) {
                    this.U[i10].setImeOptions(268435462);
                } else {
                    this.U[i10].setImeOptions(268435461);
                }
            }
            EditTextBoldCursor editTextBoldCursor2 = this.U[i10];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            int i12 = 5;
            if (i10 == 1) {
                TextView textView = new TextView(context);
                this.f44190s0 = textView;
                textView.setText("+");
                this.f44190s0.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                this.f44190s0.setTextSize(1, 16.0f);
                frameLayout.addView(this.f44190s0, g7.e6.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                this.U[i10].setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
                this.U[i10].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                this.U[i10].setGravity(19);
                frameLayout.addView(this.U[i10], g7.e6.k(0.0f, 12.0f, 16.0f, 6.0f, 55, -2));
                this.U[i10].addTextChangedListener(new km0(this));
            } else if (i10 == 2) {
                this.U[i10].setPadding(0, 0, 0, 0);
                this.U[i10].setGravity(19);
                this.U[i10].setHintText(null);
                this.U[i10].setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                frameLayout.addView(this.U[i10], g7.e6.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                this.U[i10].addTextChangedListener(new rr(this, 3));
            } else {
                this.U[i10].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                EditTextBoldCursor editTextBoldCursor3 = this.U[i10];
                if (!LocaleController.isRTL) {
                    i12 = 3;
                }
                editTextBoldCursor3.setGravity(i12);
                frameLayout.addView(this.U[i10], g7.e6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            }
            this.U[i10].setOnEditorActionListener(new gl0(this, 0));
            if (i10 == 2) {
                this.U[i10].setOnKeyListener(new kg(this, 1));
            }
            if (i10 == 0) {
                View view = new View(context);
                this.f44165g0.add(view);
                view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23002d7, false));
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
        org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context);
        this.f44171j0 = b9Var2;
        b9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7));
        this.f44171j0.setText(LocaleController.getString(R.string.PassportPhoneUploadInfo));
        this.Y.addView(this.f44171j0, g7.e6.n(-1, -2));
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.f23269s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.X, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.f6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.f6.D8));
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Y, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        View view = this.O;
        int i11 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(view, 1, null, null, null, null, i11));
        View view2 = this.P;
        if (view2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(view2, 1, null, null, null, null, i11));
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = this.f44165g0;
            if (i12 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.h6((View) arrayList2.get(i12), 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
            i12++;
        }
        for (Map.Entry entry : this.f44172j1.entrySet()) {
            um0 um0Var = (um0) entry.getValue();
            arrayList.add(new org.telegram.ui.ActionBar.h6(um0Var, 268435456, new Class[]{um0.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(um0Var, 0, new Class[]{um0.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(um0Var, 0, new Class[]{um0.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23386z6));
        }
        int i13 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Y, 268435456, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Y, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i14));
        int i15 = org.telegram.ui.ActionBar.f6.f23386z6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Y, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"valueTextView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Y, 268435456, new Class[]{org.telegram.ui.Cells.ba.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Y, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Y, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        int i16 = org.telegram.ui.ActionBar.f6.f22966b7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Y, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Y, 268435456, new Class[]{vm0.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Y, 4, new Class[]{vm0.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Y, 4, new Class[]{vm0.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Y, 4, new Class[]{vm0.class}, new String[]{"valueTextView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Y, 8, new Class[]{vm0.class}, new String[]{"checkImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Y, 16, new Class[]{org.telegram.ui.Cells.m4.class}, null, null, null, i13));
        int i17 = org.telegram.ui.ActionBar.f6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Y, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Y, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Y, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        if (this.U != null) {
            int i18 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.U;
                if (i18 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.h6((View) editTextBoldCursorArr[i18].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.U[i18], 16777220, null, null, null, null, org.telegram.ui.ActionBar.f6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.U[i18], 8388608, null, null, null, null, org.telegram.ui.ActionBar.f6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.U[i18], 8390656, null, null, null, null, org.telegram.ui.ActionBar.f6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.U[i18], 32, null, null, null, null, org.telegram.ui.ActionBar.f6.f23127k6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.U[i18], 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.f23144l6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.U[i18], 2080, null, null, null, null, org.telegram.ui.ActionBar.f6.f23212p7));
                i18++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 4, null, null, null, null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.f6.H6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 8390656, null, null, null, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.f23127k6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.f23144l6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 2080, null, null, null, null, org.telegram.ui.ActionBar.f6.f23212p7));
        }
        if (this.W != null) {
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.W;
                if (i10 >= editTextBoldCursorArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.h6((View) editTextBoldCursorArr2[i10].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.W[i10], 16777220, null, null, null, null, org.telegram.ui.ActionBar.f6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.W[i10], 8388608, null, null, null, null, org.telegram.ui.ActionBar.f6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.W[i10], 8390656, null, null, null, null, org.telegram.ui.ActionBar.f6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.W[i10], 32, null, null, null, null, org.telegram.ui.ActionBar.f6.f23127k6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.W[i10], 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.f23144l6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.W[i10], 2080, null, null, null, null, org.telegram.ui.ActionBar.f6.f23212p7));
                i10++;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B0, 2048, null, null, null, null, org.telegram.ui.ActionBar.f6.f23073h6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.E0, 8, null, null, null, null, org.telegram.ui.ActionBar.f6.Xd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.F0, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.G0, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f23248r6));
        TextView textView = this.I0;
        int i19 = org.telegram.ui.ActionBar.f6.f23229q6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(textView, 4, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44190s0, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.K, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.th));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.f23259rh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.sh));
        org.telegram.ui.Components.jq jqVar = this.J;
        int i20 = org.telegram.ui.ActionBar.f6.D7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(jqVar, 0, null, null, null, null, i20));
        org.telegram.ui.Components.jq jqVar2 = this.J;
        int i21 = org.telegram.ui.ActionBar.f6.E7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(jqVar2, 0, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.L, 0, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.L, 0, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44202x0, 8, null, null, null, null, org.telegram.ui.ActionBar.f6.Ci));
        TextView textView2 = this.f44205y0;
        int i22 = org.telegram.ui.ActionBar.f6.f23386z6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(textView2, 4, null, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44207z0, 4, null, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A0, 4, null, null, null, null, i19));
        return arrayList;
    }

    public final byte[] i1(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32 || bArr2 == null || bArr2.length != 32) {
            return null;
        }
        byte[] bArr3 = new byte[32];
        System.arraycopy(this.f44150a1, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(this.f44150a1, 32, bArr4, 0, 16);
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

    public final void j1(final TLRPC.TL_secureRequiredType tL_secureRequiredType, final TLRPC.TL_secureRequiredType tL_secureRequiredType2, final ArrayList arrayList, final boolean z10, final hl0 hl0Var, final kl0 kl0Var, final boolean z11) {
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
                final wm0 wm0Var = wm0.this;
                final lm0 lm0Var = kl0Var;
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
                        int i9;
                        TLRPC.TL_secureData tL_secureData;
                        String str2;
                        LinearLayout linearLayout;
                        wm0 wm0Var2 = wm0.this;
                        TLRPC.TL_error tL_error2 = tL_error;
                        String str3 = null;
                        if (tL_error2 != null) {
                            lm0 lm0Var2 = lm0Var;
                            if (lm0Var2 != null) {
                                lm0Var2.T(tL_error2.text, null);
                            }
                            wm0Var2.M1(LocaleController.getString(R.string.AppName), tL_error2.text);
                            return;
                        }
                        boolean z14 = z12;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType3;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType4;
                        boolean z15 = z13;
                        if (z14) {
                            if (tL_secureRequiredType5 != null) {
                                wm0Var2.H1(tL_secureRequiredType5);
                            } else {
                                wm0Var2.H1(tL_secureRequiredType6);
                            }
                        } else {
                            if (z15) {
                                wm0Var2.H1(tL_secureRequiredType6);
                            }
                            wm0Var2.H1(tL_secureRequiredType5);
                        }
                        int i10 = 0;
                        if (wm0Var2.f44151b == 8) {
                            vm0 vm0Var = (vm0) wm0Var2.f44176m1.remove(tL_secureRequiredType6);
                            if (vm0Var != null) {
                                wm0Var2.Y.removeView(vm0Var);
                                View childAt = wm0Var2.Y.getChildAt(linearLayout.getChildCount() - 6);
                                if (childAt instanceof vm0) {
                                    ((vm0) childAt).setNeedDivider(false);
                                }
                            }
                            wm0Var2.Q1();
                        } else {
                            ArrayList arrayList3 = arrayList2;
                            if (tL_secureRequiredType5 != null && arrayList3 != null && arrayList3.size() > 1) {
                                int size = arrayList3.size();
                                int i11 = 0;
                                while (true) {
                                    if (i11 < size) {
                                        TLRPC.TL_secureRequiredType tL_secureRequiredType7 = (TLRPC.TL_secureRequiredType) arrayList3.get(i11);
                                        TLRPC.TL_secureValue r12 = wm0Var2.r1(tL_secureRequiredType7, false);
                                        if (r12 != null) {
                                            TLRPC.TL_secureData tL_secureData2 = r12.data;
                                            if (tL_secureData2 != null) {
                                                str2 = wm0.h1(tL_secureData2.data, wm0Var2.i1(tL_secureData2.secret, tL_secureData2.data_hash), r12.data.data_hash);
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
                                wm0Var2.L1(tL_secureRequiredType6, null, null, tL_secureRequiredType5, str, z14, i10);
                            } else {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType8 = tL_secureRequiredType5;
                                String str4 = str;
                                TLRPC.TL_secureValue r13 = wm0Var2.r1(tL_secureRequiredType6, false);
                                if (r13 != null && (tL_secureData = r13.data) != null) {
                                    str3 = wm0.h1(tL_secureData.data, wm0Var2.i1(tL_secureData.secret, tL_secureData.data_hash), r13.data.data_hash);
                                }
                                if (arrayList3 != null) {
                                    i9 = arrayList3.size();
                                } else {
                                    i9 = 0;
                                }
                                wm0Var2.L1(tL_secureRequiredType6, null, str3, tL_secureRequiredType8, str4, z14, i9);
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

    public final b3.b k1(byte[] bArr) {
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
        System.arraycopy(this.f44150a1, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(this.f44150a1, 32, bArr7, 0, 16);
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
        obj.f1415c = bArr3;
        obj.f1413a = bArr11;
        obj.d = computeSHA256;
        obj.f1414b = p12;
        obj.f1416e = new SecureDocumentKey(bArr4, bArr5);
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
            K1(2, z10, bundle);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", tL_auth_sentCode.type.pattern);
            K1(1, z10, bundle);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSms) {
            bundle.putInt("type", 2);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            K1(0, z10, bundle);
        }
    }

    public final String m1() {
        StringBuilder sb2 = new StringBuilder();
        int i9 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.U;
            if (i9 >= editTextBoldCursorArr.length) {
                break;
            }
            sb2.append((CharSequence) editTextBoldCursorArr[i9].getText());
            sb2.append(",");
            i9++;
        }
        if (this.W != null) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.W;
                if (i10 >= editTextBoldCursorArr2.length) {
                    break;
                }
                sb2.append((CharSequence) editTextBoldCursorArr2[i10].getText());
                sb2.append(",");
                i10++;
            }
        }
        ArrayList arrayList = this.f44161e1;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            sb2.append(((SecureDocument) arrayList.get(i11)).secureFile.f22515id);
        }
        SecureDocument secureDocument = this.f44168h1;
        if (secureDocument != null) {
            sb2.append(secureDocument.secureFile.f22515id);
        }
        SecureDocument secureDocument2 = this.f44170i1;
        if (secureDocument2 != null) {
            sb2.append(secureDocument2.secureFile.f22515id);
        }
        SecureDocument secureDocument3 = this.f44164f1;
        if (secureDocument3 != null) {
            sb2.append(secureDocument3.secureFile.f22515id);
        }
        ArrayList arrayList2 = this.f44166g1;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            sb2.append(((SecureDocument) arrayList2.get(i12)).secureFile.f22515id);
        }
        return sb2.toString();
    }

    @Override
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        if (i10 == -1) {
            if (i9 != 0 && i9 != 2) {
                if (i9 == 1) {
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
            org.telegram.ui.Components.ki kiVar = this.N0;
            if (kiVar != null) {
                kiVar.f30114f0.f0(i9, intent, this.M0);
            }
            this.M0 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i9 = this.f44151b;
        if (i9 == 7) {
            if (z10) {
                int i10 = this.E1;
                org.telegram.ui.Components.cv0[] cv0VarArr = this.F1;
                cv0VarArr[i10].c(true);
                for (org.telegram.ui.Components.cv0 cv0Var : cv0VarArr) {
                    if (cv0Var != null) {
                        cv0Var.f();
                    }
                }
            }
        } else if (i9 != 0 && i9 != 5) {
            if (i9 == 1 || i9 == 2) {
                return !X0(z10);
            }
        } else if (z10) {
            W0(false);
        }
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        if (this.f44151b == 3 && Build.VERSION.SDK_INT >= 23 && dialog == this.H1) {
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
        int i9 = 0;
        W0(false);
        org.telegram.ui.Components.ki kiVar = this.N0;
        if (kiVar != null) {
            kiVar.dismissInternal();
            this.N0.v1();
        }
        if (this.f44151b == 7) {
            while (true) {
                org.telegram.ui.Components.cv0[] cv0VarArr = this.F1;
                if (i9 >= cv0VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.cv0 cv0Var = cv0VarArr[i9];
                if (cv0Var != null) {
                    cv0Var.f();
                }
                i9++;
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
        org.telegram.ui.Components.ki kiVar = this.N0;
        if (kiVar != null) {
            kiVar.x1();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.ki kiVar;
        org.telegram.ui.Cells.ba baVar;
        int i10 = this.f44151b;
        if ((i10 == 1 || i10 == 2) && (kiVar = this.N0) != null) {
            if (i9 == 17) {
                kiVar.f30114f0.T(false);
            } else if (i9 == 21) {
                if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
                    alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new kl0(this, 0));
                    org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
                }
            } else if (i9 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                F1(0);
            } else if (i9 == 22 && iArr != null && iArr.length > 0 && iArr[0] == 0 && (baVar = this.f44178n0) != null) {
                baVar.callOnClick();
            }
        } else if (i10 == 3 && i9 == 6) {
            O1(false, this.A1, this.B1, this.C1, this.D1);
        }
    }

    @Override
    public final void onResume() {
        ViewGroup[] viewGroupArr;
        ViewGroup viewGroup;
        super.onResume();
        org.telegram.ui.Components.ki kiVar = this.N0;
        if (kiVar != null) {
            kiVar.y1();
        }
        if (this.f44151b == 5 && (viewGroupArr = this.V) != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
            this.U[0].requestFocus();
            AndroidUtilities.showKeyboard(this.U[0]);
            AndroidUtilities.runOnUIThread(new hl0(this, 0), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (this.f44158d1 != null) {
            AndroidUtilities.runOnUIThread(new hl0(this, 1));
        }
        int i9 = this.f44151b;
        if (i9 == 5) {
            if (z10) {
                if (this.V[0].getVisibility() == 0) {
                    this.U[0].requestFocus();
                    AndroidUtilities.showKeyboard(this.U[0]);
                }
                if (this.J0 == 2) {
                    B1(false);
                }
            }
        } else if (i9 == 7) {
            if (z10) {
                this.F1[this.E1].j();
            }
        } else if (i9 == 4) {
            if (z10) {
                this.U[0].requestFocus();
                AndroidUtilities.showKeyboard(this.U[0]);
            }
        } else if (i9 == 6) {
            if (z10) {
                this.U[0].requestFocus();
                AndroidUtilities.showKeyboard(this.U[0]);
            }
        } else if (i9 != 2 && i9 != 1) {
        } else {
            c1();
        }
    }

    public final TLRPC.TL_secureValue r1(TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z10) {
        String[] strArr;
        if (tL_secureRequiredType != null) {
            int size = this.f44204y.values.size();
            for (int i9 = 0; i9 < size; i9++) {
                TLRPC.TL_secureValue tL_secureValue = this.f44204y.values.get(i9);
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
                                                    for (int i10 = 0; i10 < strArr.length; i10++) {
                                                        if (!jSONObject.has(strArr[i10]) || TextUtils.isEmpty(jSONObject.getString(strArr[i10]))) {
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
        int size = this.f44204y.values.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (this.f44204y.values.get(i9).type.getClass() == cls) {
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
        String str = this.f44148a;
        if (str != null && !str.equals(m1())) {
            return false;
        }
        return true;
    }

    public final void w1() {
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ll0(this, 3)), this.classGuid);
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
            c2Var.f22766c0 = false;
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

    public wm0(int i9, long j10, String str, String str2, String str3, String str4, String str5, TL_account.authorizationForm authorizationform, TL_account.Password password) {
        this(i9, authorizationform, password, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (HashMap) null, (HashMap) null);
        int i10;
        String o12;
        String str6;
        String str7;
        String str8;
        String str9;
        this.f44154c = j10;
        this.d = str3;
        this.f44159e = str4;
        this.h = str;
        this.f44186r = str2;
        this.f44177n = str5;
        if (i9 != 0 || authorizationform.errors.isEmpty()) {
            return;
        }
        try {
            Collections.sort(authorizationform.errors, new dm0(this));
            int size = authorizationform.errors.size();
            int i11 = 0;
            while (i11 < size) {
                TLRPC.SecureValueError secureValueError = authorizationform.errors.get(i11);
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
                                int i12 = 0;
                                while (i12 < authorizationform.values.size()) {
                                    TLRPC.TL_secureData tL_secureData = authorizationform.values.get(i12).data;
                                    if (tL_secureData == null || !Arrays.equals(tL_secureData.data_hash, tL_secureValueErrorData.data_hash)) {
                                        i12++;
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
                            i10 = size;
                            i11++;
                            size = i10;
                        }
                        str8 = "files";
                    }
                    str8 = "translation";
                }
                HashMap hashMap = (HashMap) this.f44185q1.get(o12);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    i10 = size;
                    this.f44185q1.put(o12, hashMap);
                    this.f44188r1.put(o12, str6);
                } else {
                    i10 = size;
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
                i11++;
                size = i10;
            }
        } catch (Exception unused) {
        }
    }
}
