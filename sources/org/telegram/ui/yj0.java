package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
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
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yj0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public org.telegram.ui.Cells.x6 A0;
    public String A1;
    public LinearLayout B0;
    public String B1;
    public ImageView C0;
    public pj0 C1;
    public TextView D0;
    public boolean D1;
    public TL_account.authorizationForm E;
    public TextView E0;
    public final zi0 E1;
    public final TLRPC.TL_secureRequiredType F;
    public TextView F0;
    public String F1;
    public TLRPC.TL_secureRequiredType G;
    public org.telegram.ui.Components.gy G0;
    public Runnable G1;
    public ArrayList H;
    public org.telegram.ui.Cells.y8 H0;
    public nj0 H1;
    public final TLRPC.TL_secureValue I;
    public org.telegram.ui.Cells.y8 I0;
    public pj0 I1;
    public final TLRPC.TL_secureValue J;
    public ImageView J0;
    public int J1;
    public TL_account.Password K;
    public TextView K0;
    public final org.telegram.ui.Components.vt0[] K1;
    public TLRPC.TL_auth_sentCode L;
    public TextView L0;
    public org.telegram.ui.ActionBar.s1 L1;
    public org.telegram.ui.ActionBar.q0 M;
    public FrameLayout M0;
    public Dialog M1;
    public AnimatorSet N;
    public TextView N0;
    public final ArrayList N1;
    public org.telegram.ui.Components.aq O;
    public int O0;
    public int O1;
    public TextView P;
    public final byte[] P0;
    public int P1;
    public org.telegram.ui.Components.aq Q;
    public final byte[] Q0;
    public int Q1;
    public FrameLayout R;
    public String R0;
    public org.telegram.ui.Cells.v9 S;
    public org.telegram.ui.Components.bi S0;
    public View T;
    public int T0;
    public View U;
    public int U0;
    public org.telegram.ui.Cells.x8 V;
    public final ArrayList V0;
    public org.telegram.ui.Cells.x8 W;
    public final HashMap W0;
    public org.telegram.ui.Cells.x8 X;
    public final HashMap X0;
    public org.telegram.ui.Cells.v9 Y;
    public final HashMap Y0;
    public EditTextBoldCursor[] Z;
    public HashMap Z0;
    public String f52284a;
    public ViewGroup[] f52285a0;
    public boolean f52286a1;
    public final int f52287b;
    public EditTextBoldCursor[] f52288b0;
    public boolean f52289b1;
    public long f52290c;
    public ScrollView f52291c0;
    public long f52292c1;
    public final String d;
    public LinearLayout f52293d0;
    public byte[] f52294d1;
    public final String f52295e;
    public LinearLayout f52296e0;
    public String f52297e1;
    public boolean f52298f;
    public LinearLayout f52299f0;
    public byte[] f52300f1;
    public LinearLayout f52301g0;
    public boolean f52302g1;
    public final String h;
    public LinearLayout f52303h0;
    public boolean f52304h1;
    public LinearLayout f52305i0;
    public yj0 f52306i1;
    public LinearLayout f52307j0;
    public final ArrayList f52308j1;
    public org.telegram.ui.Cells.n4 f52309k0;
    public org.telegram.messenger.wv k1;
    public final ArrayList f52310l0;
    public final ArrayList f52311l1;
    public org.telegram.ui.Cells.x6 m0;
    public org.telegram.messenger.wv m1;
    public final String f52312n;
    public org.telegram.ui.Cells.x6 f52313n0;
    public org.telegram.messenger.wv f52314n1;
    public org.telegram.ui.Cells.y8 f52315o0;
    public final HashMap f52316o1;
    public org.telegram.ui.Cells.y8 f52317p0;
    public final HashMap f52318p1;
    public org.telegram.ui.Cells.y8 f52319q0;
    public final HashMap f52320q1;
    public final String f52321r;
    public org.telegram.ui.Cells.y8 f52322r0;
    public final HashMap f52323r1;
    public String f52324s;
    public org.telegram.ui.Cells.v9 f52325s0;
    public final HashMap f52326s1;
    public int f52327t0;
    public final HashMap f52328t1;
    public final boolean[] f52329u0;
    public final HashMap f52330u1;
    public boolean f52331v0;
    public final HashMap f52332v1;
    public String f52333w;
    public boolean f52334w0;
    public final HashMap f52335w1;
    public String f52336x;
    public TextView f52337x0;
    public HashMap f52338x1;
    public final int[] f52339y;
    public org.telegram.ui.Cells.v9 f52340y0;
    public HashMap f52341y1;
    public org.telegram.ui.Cells.v9 f52342z0;
    public final HashMap f52343z1;

    public yj0(int i3, TL_account.authorizationForm authorizationform, TL_account.Password password, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureValue tL_secureValue, TLRPC.TL_secureRequiredType tL_secureRequiredType2, TLRPC.TL_secureValue tL_secureValue2, HashMap hashMap, HashMap hashMap2) {
        super(null);
        this.f52324s = "";
        this.f52333w = "";
        this.f52339y = new int[3];
        this.f52310l0 = new ArrayList();
        this.f52329u0 = new boolean[3];
        this.f52331v0 = true;
        this.V0 = new ArrayList();
        this.W0 = new HashMap();
        this.X0 = new HashMap();
        this.Y0 = new HashMap();
        this.f52308j1 = new ArrayList();
        this.f52311l1 = new ArrayList();
        this.f52316o1 = new HashMap();
        this.f52318p1 = new HashMap();
        this.f52320q1 = new HashMap();
        this.f52323r1 = new HashMap();
        this.f52326s1 = new HashMap();
        this.f52332v1 = new HashMap();
        this.f52335w1 = new HashMap();
        this.f52343z1 = new HashMap();
        this.E1 = new zi0(this);
        this.f52287b = i3;
        this.E = authorizationform;
        this.F = tL_secureRequiredType;
        if (tL_secureRequiredType != null) {
            this.f52331v0 = tL_secureRequiredType.native_names;
        }
        this.I = tL_secureValue;
        this.G = tL_secureRequiredType2;
        this.J = tL_secureValue2;
        this.K = password;
        this.f52328t1 = hashMap;
        this.f52330u1 = hashMap2;
        if (i3 == 3) {
            this.N1 = new ArrayList();
        } else if (i3 == 7) {
            this.K1 = new org.telegram.ui.Components.vt0[3];
        }
        if (hashMap == null) {
            this.f52328t1 = new HashMap();
        }
        if (hashMap2 == null) {
            this.f52330u1 = new HashMap();
        }
        if (i3 == 5) {
            if (org.telegram.messenger.h10.i(this.currentAccount).f22846k0 != null && org.telegram.messenger.h10.i(this.currentAccount).f22847l0 != null) {
                this.O0 = 1;
                this.P0 = org.telegram.messenger.h10.i(this.currentAccount).f22846k0;
                this.Q0 = org.telegram.messenger.h10.i(this.currentAccount).f22847l0;
            }
            TL_account.Password password2 = this.K;
            if (password2 == null) {
                A1();
            } else {
                TwoStepVerificationActivity.r0(password2);
                if (this.O0 == 1) {
                    F1(true);
                }
            }
            if (org.telegram.messenger.az.f21638j0 != null) {
                return;
            }
            TLRPC.TL_help_getPassportConfig tL_help_getPassportConfig = new TLRPC.TL_help_getPassportConfig();
            tL_help_getPassportConfig.hash = org.telegram.messenger.az.f21641k0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getPassportConfig, new ei.u5(24));
        }
    }

    public static int G0(yj0 yj0Var, String str) {
        yj0Var.getClass();
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2006252145:
                if (str.equals("residence_country_code")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1537298398:
                if (str.equals("last_name_native")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1249512767:
                if (str.equals("gender")) {
                    c2 = 2;
                    break;
                }
                break;
            case -796150911:
                if (str.equals("street_line1")) {
                    c2 = 3;
                    break;
                }
                break;
            case -796150910:
                if (str.equals("street_line2")) {
                    c2 = 4;
                    break;
                }
                break;
            case -160985414:
                if (str.equals("first_name")) {
                    c2 = 5;
                    break;
                }
                break;
            case 3053931:
                if (str.equals("city")) {
                    c2 = 6;
                    break;
                }
                break;
            case 109757585:
                if (str.equals("state")) {
                    c2 = 7;
                    break;
                }
                break;
            case 421072629:
                if (str.equals("middle_name")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 451516732:
                if (str.equals("first_name_native")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 475919162:
                if (str.equals("expiry_date")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 506677093:
                if (str.equals("document_no")) {
                    c2 = 11;
                    break;
                }
                break;
            case 1168724782:
                if (str.equals("birth_date")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 1181577377:
                if (str.equals("middle_name_native")) {
                    c2 = '\r';
                    break;
                }
                break;
            case 1481071862:
                if (str.equals("country_code")) {
                    c2 = 14;
                    break;
                }
                break;
            case 2002465324:
                if (str.equals("post_code")) {
                    c2 = 15;
                    break;
                }
                break;
            case 2013122196:
                if (str.equals("last_name")) {
                    c2 = 16;
                    break;
                }
                break;
        }
        switch (c2) {
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

    public static boolean H0(org.telegram.ui.yj0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yj0.H0(org.telegram.ui.yj0):boolean");
    }

    public static int M0(yj0 yj0Var) {
        return yj0Var.currentAccount;
    }

    public static void N0(yj0 yj0Var, EditTextBoldCursor editTextBoldCursor, String str, Editable editable, boolean z10) {
        String str2;
        String str3;
        String str4;
        String str5;
        HashMap hashMap = yj0Var.f52343z1;
        if (hashMap != null && (str3 = (String) hashMap.get(str)) != null) {
            if (TextUtils.equals(str3, editable)) {
                HashMap hashMap2 = yj0Var.f52338x1;
                if (hashMap2 != null && (str5 = (String) hashMap2.get(str)) != null) {
                    editTextBoldCursor.setErrorText(str5);
                } else {
                    HashMap hashMap3 = yj0Var.f52341y1;
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
            yj0Var.e1(false);
        }
    }

    public static void Q0(yj0 yj0Var, int i3) {
        yj0Var.currentAccount = i3;
    }

    public static int R0(yj0 yj0Var) {
        return yj0Var.currentAccount;
    }

    public static void T1(EditTextBoldCursor[] editTextBoldCursorArr, boolean z10, boolean z11) {
        if (editTextBoldCursorArr != null) {
            for (EditTextBoldCursor editTextBoldCursor : editTextBoldCursorArr) {
                if (editTextBoldCursor != null) {
                    org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, null);
                    if (z10) {
                        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 34, org.telegram.ui.ActionBar.k6.H6, null);
                        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 35, org.telegram.ui.ActionBar.k6.L6, null);
                        if (z11) {
                            int paddingLeft = editTextBoldCursor.getPaddingLeft();
                            int paddingTop = editTextBoldCursor.getPaddingTop();
                            int paddingRight = editTextBoldCursor.getPaddingRight();
                            int paddingBottom = editTextBoldCursor.getPaddingBottom();
                            org.telegram.ui.ActionBar.r6.G(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f28007k6, org.telegram.ui.ActionBar.k6.f28026l6, org.telegram.ui.ActionBar.k6.f28102p7, null);
                            if (editTextBoldCursor.getPaddingLeft() != paddingLeft || editTextBoldCursor.getPaddingTop() != paddingTop || editTextBoldCursor.getPaddingRight() != paddingRight || editTextBoldCursor.getPaddingBottom() != paddingBottom) {
                                editTextBoldCursor.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void Z(yj0 yj0Var, TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery) {
        TL_account.Password password = yj0Var.K;
        password.email_unconfirmed_pattern = tL_auth_passwordRecovery.email_pattern;
        yj0Var.presentFragment(new ra1(yj0Var.currentAccount, 4, password));
    }

    public static void a0(yj0 yj0Var) {
        ArrayList arrayList;
        int i3;
        int i10;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        HashMap hashMap = yj0Var.f52326s1;
        HashMap hashMap2 = yj0Var.f52323r1;
        String str = yj0Var.f52321r;
        ArrayList arrayList2 = new ArrayList();
        int size = yj0Var.E.required_types.size();
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.SecureRequiredType secureRequiredType = yj0Var.E.required_types.get(i11);
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
                                        if (yj0Var.v1(tL_secureRequiredType5, true) != null) {
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
            TLRPC.TL_secureValue v12 = yj0Var.v1(tL_secureRequiredType, true);
            if (v12 == null) {
                Vibrator vibrator = (Vibrator) yj0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                xj0 xj0Var = (xj0) hashMap2.get(tL_secureRequiredType);
                if (xj0Var == null && (tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    xj0Var = (xj0) hashMap2.get(tL_secureRequiredType2);
                }
                org.telegram.messenger.g0.F3(xj0Var);
                return;
            }
            HashMap hashMap3 = (HashMap) yj0Var.f52332v1.get(s1(tL_secureRequiredType.type));
            if (hashMap3 != null && !hashMap3.isEmpty()) {
                Vibrator vibrator2 = (Vibrator) yj0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                xj0 xj0Var2 = (xj0) hashMap2.get(tL_secureRequiredType);
                if (xj0Var2 == null && (tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    xj0Var2 = (xj0) hashMap2.get(tL_secureRequiredType3);
                }
                org.telegram.messenger.g0.F3(xj0Var2);
                return;
            }
            boolean z10 = tL_secureRequiredType.selfie_required;
            boolean z11 = tL_secureRequiredType.translation_required;
            ?? obj = new Object();
            obj.f43788a = v12;
            obj.f43789b = z10;
            obj.f43790c = z11;
            arrayList2.add(obj);
        }
        yj0Var.R1(false, true);
        TL_account.acceptAuthorization acceptauthorization = new TL_account.acceptAuthorization();
        acceptauthorization.bot_id = yj0Var.f52290c;
        acceptauthorization.scope = yj0Var.h;
        acceptauthorization.public_key = str;
        JSONObject jSONObject = new JSONObject();
        int size3 = arrayList2.size();
        int i13 = 0;
        while (i13 < size3) {
            aj0 aj0Var = (aj0) arrayList2.get(i13);
            TLRPC.TL_secureValue tL_secureValue = aj0Var.f43788a;
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
                        byte[] m1 = yj0Var.m1(tL_secureData.secret, tL_secureData.data_hash);
                        arrayList = arrayList2;
                        try {
                            jSONObject2.put("data_hash", Base64.encodeToString(tL_secureValue.data.data_hash, 2));
                            jSONObject2.put("secret", Base64.encodeToString(m1, 2));
                            jSONObject3.put("data", jSONObject2);
                        } catch (Exception unused) {
                        }
                    } else {
                        arrayList = arrayList2;
                    }
                    if (!tL_secureValue.files.isEmpty()) {
                        JSONArray jSONArray = new JSONArray();
                        int i14 = 0;
                        for (int size4 = tL_secureValue.files.size(); i14 < size4; size4 = size4) {
                            TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) tL_secureValue.files.get(i14);
                            i3 = size3;
                            try {
                                i10 = i13;
                                try {
                                    byte[] m12 = yj0Var.m1(tL_secureFile.secret, tL_secureFile.file_hash);
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("file_hash", Base64.encodeToString(tL_secureFile.file_hash, 2));
                                    jSONObject4.put("secret", Base64.encodeToString(m12, 2));
                                    jSONArray.put(jSONObject4);
                                    i14++;
                                    size3 = i3;
                                    i13 = i10;
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                            }
                        }
                        i3 = size3;
                        i10 = i13;
                        jSONObject3.put("files", jSONArray);
                    } else {
                        i3 = size3;
                        i10 = i13;
                    }
                    TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                    if (secureFile instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile;
                        byte[] m13 = yj0Var.m1(tL_secureFile2.secret, tL_secureFile2.file_hash);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("file_hash", Base64.encodeToString(tL_secureFile2.file_hash, 2));
                        jSONObject5.put("secret", Base64.encodeToString(m13, 2));
                        jSONObject3.put("front_side", jSONObject5);
                    }
                    TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile2;
                        byte[] m14 = yj0Var.m1(tL_secureFile3.secret, tL_secureFile3.file_hash);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("file_hash", Base64.encodeToString(tL_secureFile3.file_hash, 2));
                        jSONObject6.put("secret", Base64.encodeToString(m14, 2));
                        jSONObject3.put("reverse_side", jSONObject6);
                    }
                    if (aj0Var.f43789b) {
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile3;
                            byte[] m15 = yj0Var.m1(tL_secureFile4.secret, tL_secureFile4.file_hash);
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("file_hash", Base64.encodeToString(tL_secureFile4.file_hash, 2));
                            jSONObject7.put("secret", Base64.encodeToString(m15, 2));
                            jSONObject3.put("selfie", jSONObject7);
                        }
                    }
                    if (aj0Var.f43790c && !tL_secureValue.translation.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        int size5 = tL_secureValue.translation.size();
                        for (int i15 = 0; i15 < size5; i15++) {
                            TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) tL_secureValue.translation.get(i15);
                            byte[] m16 = yj0Var.m1(tL_secureFile5.secret, tL_secureFile5.file_hash);
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("file_hash", Base64.encodeToString(tL_secureFile5.file_hash, 2));
                            jSONObject8.put("secret", Base64.encodeToString(m16, 2));
                            jSONArray2.put(jSONObject8);
                        }
                        jSONObject3.put("translation", jSONArray2);
                    }
                    jSONObject.put(s1(tL_secureValue.type), jSONObject3);
                } catch (Exception unused4) {
                }
                TLRPC.TL_secureValueHash tL_secureValueHash = new TLRPC.TL_secureValueHash();
                tL_secureValueHash.type = tL_secureValue.type;
                tL_secureValueHash.hash = tL_secureValue.hash;
                acceptauthorization.value_hashes.add(tL_secureValueHash);
                i13 = i10 + 1;
                arrayList2 = arrayList;
                size3 = i3;
            }
            arrayList = arrayList2;
            i3 = size3;
            i10 = i13;
            TLRPC.TL_secureValueHash tL_secureValueHash2 = new TLRPC.TL_secureValueHash();
            tL_secureValueHash2.type = tL_secureValue.type;
            tL_secureValueHash2.hash = tL_secureValue.hash;
            acceptauthorization.value_hashes.add(tL_secureValueHash2);
            i13 = i10 + 1;
            arrayList2 = arrayList;
            size3 = i3;
        }
        JSONObject jSONObject9 = new JSONObject();
        try {
            jSONObject9.put("secure_data", jSONObject);
        } catch (Exception unused5) {
        }
        Object obj2 = yj0Var.d;
        if (obj2 != null) {
            try {
                jSONObject9.put("payload", obj2);
            } catch (Exception unused6) {
            }
        }
        Object obj3 = yj0Var.f52295e;
        if (obj3 != null) {
            try {
                jSONObject9.put("nonce", obj3);
            } catch (Exception unused7) {
            }
        }
        b8.ke o12 = yj0Var.o1(org.telegram.messenger.g0.h1(jSONObject9.toString()));
        TLRPC.TL_secureCredentialsEncrypted tL_secureCredentialsEncrypted = new TLRPC.TL_secureCredentialsEncrypted();
        acceptauthorization.credentials = tL_secureCredentialsEncrypted;
        tL_secureCredentialsEncrypted.hash = (byte[]) o12.f2718e;
        tL_secureCredentialsEncrypted.data = (byte[]) o12.d;
        try {
            String replace = str.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "");
            Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(replace, 0))));
            acceptauthorization.credentials.secret = cipher.doFinal((byte[]) o12.f2717c);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ConnectionsManager.getInstance(yj0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(yj0Var.currentAccount).sendRequest(acceptauthorization, new qi0(yj0Var, 1)), yj0Var.classGuid);
    }

    public static void b0(yj0 yj0Var, TLRPC.TL_error tL_error, String str, pj0 pj0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        if (tL_error == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("phone", str);
            yj0 yj0Var2 = new yj0(7, yj0Var.E, yj0Var.K, yj0Var.F, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
            yj0Var2.currentAccount = yj0Var.currentAccount;
            yj0Var2.f52300f1 = yj0Var.f52300f1;
            yj0Var2.f52294d1 = yj0Var.f52294d1;
            yj0Var2.C1 = pj0Var;
            yj0Var2.L = (TLRPC.TL_auth_sentCode) tLObject;
            yj0Var.presentFragment(yj0Var2, true);
            return;
        }
        org.telegram.ui.Components.t4.e0(yj0Var.currentAccount, tL_error, yj0Var, sendverifyphonecode, str);
    }

    public static void c0(yj0 yj0Var, org.telegram.messenger.wv wvVar, int i3) {
        String str = wvVar.f26264c;
        HashMap hashMap = yj0Var.f52316o1;
        int i10 = yj0Var.T0;
        if (i10 == 1) {
            org.telegram.messenger.wv wvVar2 = yj0Var.k1;
            if (wvVar2 != null) {
                wj0 wj0Var = (wj0) hashMap.remove(wvVar2);
                if (wj0Var != null) {
                    yj0Var.f52303h0.removeView(wj0Var);
                }
                yj0Var.k1 = null;
            }
        } else if (i10 == 4) {
            if (yj0Var.f52311l1.size() >= 20) {
                return;
            }
        } else if (i10 == 2) {
            org.telegram.messenger.wv wvVar3 = yj0Var.m1;
            if (wvVar3 != null) {
                wj0 wj0Var2 = (wj0) hashMap.remove(wvVar3);
                if (wj0Var2 != null) {
                    yj0Var.f52299f0.removeView(wj0Var2);
                }
                yj0Var.m1 = null;
            }
        } else if (i10 == 3) {
            org.telegram.messenger.wv wvVar4 = yj0Var.f52314n1;
            if (wvVar4 != null) {
                wj0 wj0Var3 = (wj0) hashMap.remove(wvVar4);
                if (wj0Var3 != null) {
                    yj0Var.f52301g0.removeView(wj0Var3);
                }
                yj0Var.f52314n1 = null;
            }
        } else if (i10 == 0 && yj0Var.f52308j1.size() >= 20) {
            return;
        }
        yj0Var.f52318p1.put(str, wvVar);
        yj0Var.M.setEnabled(false);
        yj0Var.M.setAlpha(0.5f);
        org.telegram.messenger.w7.G(yj0Var.currentAccount).i0(false, 16777216, str, true);
        yj0Var.V0(wvVar, i3);
        yj0Var.X1(i3);
    }

    public static void d0(org.telegram.ui.yj0 r9, boolean r10, java.lang.String r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yj0.d0(org.telegram.ui.yj0, boolean, java.lang.String):void");
    }

    public static boolean d1(byte[] bArr, Long l10) {
        if (bArr != null && bArr.length == 32) {
            int i3 = 0;
            for (byte b10 : bArr) {
                i3 += b10 & 255;
            }
            if (i3 % 255 == 239 && (l10 == null || Utilities.g(Utilities.o(bArr.length, bArr)) == l10.longValue())) {
                return true;
            }
        }
        return false;
    }

    public static void e0(int i3, String str, org.telegram.messenger.wv wvVar, wj0 wj0Var, yj0 yj0Var) {
        String str2 = wvVar.f26264c;
        HashMap hashMap = yj0Var.f52318p1;
        yj0Var.f52316o1.remove(wvVar);
        if (i3 == 1) {
            yj0Var.k1 = null;
            yj0Var.f52303h0.removeView(wj0Var);
        } else if (i3 == 4) {
            yj0Var.f52311l1.remove(wvVar);
            yj0Var.f52305i0.removeView(wj0Var);
        } else if (i3 == 2) {
            yj0Var.m1 = null;
            yj0Var.f52299f0.removeView(wj0Var);
        } else if (i3 == 3) {
            yj0Var.f52314n1 = null;
            yj0Var.f52301g0.removeView(wj0Var);
        } else {
            yj0Var.f52308j1.remove(wvVar);
            yj0Var.f52296e0.removeView(wj0Var);
        }
        if (str != null) {
            HashMap hashMap2 = yj0Var.f52341y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
            HashMap hashMap3 = yj0Var.f52343z1;
            if (hashMap3 != null) {
                hashMap3.remove(str);
            }
        }
        yj0Var.X1(i3);
        if (str2 != null && hashMap.remove(str2) != null) {
            if (hashMap.isEmpty()) {
                yj0Var.M.setEnabled(true);
                yj0Var.M.setAlpha(1.0f);
            }
            org.telegram.messenger.w7.G(yj0Var.currentAccount).b(str2, false);
        }
    }

    public static void f0(yj0 yj0Var) {
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        for (int i3 = 0; i3 < yj0Var.E.values.size(); i3++) {
            deletesecurevalue.types.add(yj0Var.E.values.get(i3).type);
        }
        yj0Var.C1();
        ConnectionsManager.getInstance(yj0Var.currentAccount).sendRequest(deletesecurevalue, new qi0(yj0Var, 2));
    }

    public static void g0(yj0 yj0Var) {
        ra1 ra1Var = new ra1(yj0Var.currentAccount, 0, yj0Var.K);
        ra1Var.Z = true;
        yj0Var.presentFragment(ra1Var);
    }

    public static void h0(yj0 yj0Var) {
        if (yj0Var.K.has_recovery) {
            yj0Var.C1();
            ConnectionsManager.getInstance(yj0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(yj0Var.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new qi0(yj0Var, 0), 10), yj0Var.classGuid);
        } else if (yj0Var.getParentActivity() == null) {
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yj0Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131746080, null), new pi0(yj0Var, 4));
            String M0 = org.telegram.messenger.bd.M0(2131746081, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131746083, null);
            yj0Var.showDialog(s1Var);
        }
    }

    public static void i0(yj0 yj0Var) {
        Activity parentActivity = yj0Var.getParentActivity();
        sf.c.t(parentActivity, "https://telegram.org/deactivate?phone=" + org.telegram.messenger.h10.i(yj0Var.currentAccount).d());
    }

    public static int j0(yj0 yj0Var) {
        return yj0Var.currentAccount;
    }

    public static String l1(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr != null && bArr2 != null && bArr2.length == 32 && bArr3 != null && bArr3.length == 32) {
            byte[] r5 = Utilities.r(bArr2, bArr3);
            byte[] bArr4 = new byte[32];
            System.arraycopy(r5, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(r5, 32, bArr5, 0, 16);
            int length = bArr.length;
            byte[] bArr6 = new byte[length];
            System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
            Utilities.b(bArr6, bArr4, bArr5, 0, length, 0, 0);
            if (Arrays.equals(Utilities.o(length, bArr6), bArr3)) {
                int i3 = bArr6[0] & 255;
                return new String(bArr6, i3, length - i3);
            }
            return null;
        }
        return null;
    }

    public static int m0(yj0 yj0Var) {
        return yj0Var.currentAccount;
    }

    public static int n0(yj0 yj0Var) {
        return yj0Var.currentAccount;
    }

    public static String r1(org.telegram.messenger.wv wvVar) {
        byte[] bArr;
        if (wvVar != null) {
            TLRPC.TL_secureFile tL_secureFile = wvVar.f26263b;
            if (tL_secureFile != null && (bArr = tL_secureFile.file_hash) != null) {
                return Base64.encodeToString(bArr, 2);
            }
            byte[] bArr2 = wvVar.f26266f;
            if (bArr2 != null) {
                return Base64.encodeToString(bArr2, 2);
            }
            return "";
        }
        return "";
    }

    public static String s1(TLRPC.SecureValueType secureValueType) {
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

    public static byte[] t1() {
        byte[] bArr = new byte[32];
        Utilities.f21385b.nextBytes(bArr);
        int i3 = 0;
        for (int i10 = 0; i10 < 32; i10++) {
            i3 += 255 & bArr[i10];
        }
        int i11 = i3 % 255;
        if (i11 != 239) {
            int nextInt = Utilities.f21385b.nextInt(32);
            int i12 = (bArr[nextInt] & 255) + (239 - i11);
            if (i12 < 255) {
                i12 += 255;
            }
            bArr[nextInt] = (byte) (i12 % 255);
        }
        return bArr;
    }

    public static String u1(TLRPC.SecureValueType secureValueType) {
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
            return org.telegram.messenger.bd.M0(2131754676, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
            return org.telegram.messenger.bd.M0(2131754681, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
            return org.telegram.messenger.bd.M0(2131754678, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
            return org.telegram.messenger.bd.M0(2131754671, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
            return org.telegram.messenger.bd.M0(2131754682, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
            return org.telegram.messenger.bd.M0(2131754673, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
            return org.telegram.messenger.bd.M0(2131754677, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
            return org.telegram.messenger.bd.M0(2131754675, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
            return org.telegram.messenger.bd.M0(2131754672, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
            return org.telegram.messenger.bd.M0(2131754674, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
            return org.telegram.messenger.bd.M0(2131754680, null);
        }
        return "";
    }

    public static int v0(yj0 yj0Var) {
        return yj0Var.currentAccount;
    }

    public static int w0(yj0 yj0Var) {
        return yj0Var.currentAccount;
    }

    public static int x0(yj0 yj0Var) {
        return yj0Var.currentAccount;
    }

    public static boolean x1(TLRPC.SecureValueType secureValueType) {
        if (!(secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) && !(secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) && !(secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) && !(secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) && !(secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement)) {
            return false;
        }
        return true;
    }

    public static int z0(yj0 yj0Var) {
        return yj0Var.currentAccount;
    }

    public static boolean z1(TLRPC.SecureValueType secureValueType) {
        if (!(secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) && !(secureValueType instanceof TLRPC.TL_secureValueTypePassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
            return false;
        }
        return true;
    }

    public final void A1() {
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new qi0(this, 3)), this.classGuid);
    }

    public final void B1() {
        org.telegram.ui.ActionBar.s1 s1Var = this.L1;
        if (s1Var == null) {
            return;
        }
        try {
            s1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.L1 = null;
    }

    public final void C1() {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.L1 == null) {
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, getParentActivity(), null);
            this.L1 = s1Var;
            s1Var.f28546j0 = false;
            s1Var.show();
        }
    }

    public final void D1(View view) {
        if (view == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        org.telegram.messenger.g0.F3(view);
        M1(view);
    }

    public final void E1(boolean z10) {
        if (getParentActivity() == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        if (z10) {
            this.Z[0].setText("");
        }
        org.telegram.messenger.g0.F3(this.Z[0]);
    }

    public final void F1(boolean z10) {
        String obj;
        if (z10) {
            obj = null;
        } else {
            obj = this.Z[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                E1(false);
                return;
            }
            R1(true, true);
        }
        Utilities.f21387e.c(new a60(this, z10, obj, 3));
    }

    public final void G1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (w1(TLRPC.TL_secureValueTypePhone.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754674, null));
            arrayList2.add(TLRPC.TL_secureValueTypePhone.class);
        }
        if (w1(TLRPC.TL_secureValueTypeEmail.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754680, null));
            arrayList2.add(TLRPC.TL_secureValueTypeEmail.class);
        }
        if (w1(TLRPC.TL_secureValueTypePersonalDetails.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754679, null));
            arrayList2.add(TLRPC.TL_secureValueTypePersonalDetails.class);
        }
        if (w1(TLRPC.TL_secureValueTypePassport.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754676, null));
            arrayList2.add(TLRPC.TL_secureValueTypePassport.class);
        }
        if (w1(TLRPC.TL_secureValueTypeInternalPassport.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754677, null));
            arrayList2.add(TLRPC.TL_secureValueTypeInternalPassport.class);
        }
        if (w1(TLRPC.TL_secureValueTypePassportRegistration.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754675, null));
            arrayList2.add(TLRPC.TL_secureValueTypePassportRegistration.class);
        }
        if (w1(TLRPC.TL_secureValueTypeTemporaryRegistration.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754672, null));
            arrayList2.add(TLRPC.TL_secureValueTypeTemporaryRegistration.class);
        }
        if (w1(TLRPC.TL_secureValueTypeIdentityCard.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754678, null));
            arrayList2.add(TLRPC.TL_secureValueTypeIdentityCard.class);
        }
        if (w1(TLRPC.TL_secureValueTypeDriverLicense.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754681, null));
            arrayList2.add(TLRPC.TL_secureValueTypeDriverLicense.class);
        }
        if (w1(TLRPC.TL_secureValueTypeAddress.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754683, null));
            arrayList2.add(TLRPC.TL_secureValueTypeAddress.class);
        }
        if (w1(TLRPC.TL_secureValueTypeUtilityBill.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754671, null));
            arrayList2.add(TLRPC.TL_secureValueTypeUtilityBill.class);
        }
        if (w1(TLRPC.TL_secureValueTypeBankStatement.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754682, null));
            arrayList2.add(TLRPC.TL_secureValueTypeBankStatement.class);
        }
        if (w1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            arrayList.add(org.telegram.messenger.bd.M0(2131754673, null));
            arrayList2.add(TLRPC.TL_secureValueTypeRentalAgreement.class);
        }
        if (getParentActivity() != null && !arrayList.isEmpty()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131747504, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            alertDialog$Builder.f((CharSequence[]) arrayList.toArray(new CharSequence[0]), new u(8, this, arrayList2));
            showDialog(s1Var);
        }
    }

    public final void H1() {
        boolean z10;
        int size;
        if (getParentActivity() == null) {
            return;
        }
        int i3 = this.T0;
        ArrayList arrayList = this.f52308j1;
        int i10 = 1;
        if (i3 == 0 && arrayList.size() >= 20) {
            Q1(org.telegram.messenger.bd.M0(2131689472, null), org.telegram.messenger.bd.a0("PassportUploadMaxReached", null, 2131747459, org.telegram.messenger.bd.G(20, "Files", new Object[0])));
            return;
        }
        g1();
        org.telegram.ui.Components.bi biVar = this.S0;
        int i11 = this.T0;
        if (i11 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        biVar.P3 = z10;
        if (i11 == 0) {
            size = arrayList.size();
        } else {
            if (i11 == 4) {
                size = this.f52311l1.size();
            }
            biVar.y1(i10, false);
            this.S0.f32215b2.i0();
            this.S0.e1();
            showDialog(this.S0);
        }
        i10 = 20 - size;
        biVar.y1(i10, false);
        this.S0.f32215b2.i0();
        this.S0.e1();
        showDialog(this.S0);
    }

    public final void I1(TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, boolean z10) {
        int i3;
        TLRPC.SecureValueType secureValueType;
        int i10;
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        if (arrayList != null) {
            i3 = arrayList.size();
        } else {
            i3 = 0;
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
            HashMap hashMap4 = this.f52332v1;
            if (!z10) {
                hashMap = (HashMap) hashMap4.get(s1(secureValueType2));
            } else {
                hashMap = null;
            }
            HashMap hashMap5 = (HashMap) hashMap4.get(s1(secureValueType));
            TLRPC.TL_secureValue v12 = v1(tL_secureRequiredType, false);
            TLRPC.TL_secureValue v13 = v1(tL_secureRequiredType2, false);
            HashMap hashMap6 = hashMap;
            TL_account.authorizationForm authorizationform = this.E;
            int i11 = i10;
            TL_account.Password password = this.K;
            HashMap hashMap7 = this.f52320q1;
            HashMap hashMap8 = (HashMap) hashMap7.get(tL_secureRequiredType);
            if (tL_secureRequiredType2 != null) {
                hashMap2 = hashMap5;
                hashMap3 = (HashMap) hashMap7.get(tL_secureRequiredType2);
            } else {
                hashMap2 = hashMap5;
                hashMap3 = null;
            }
            yj0 yj0Var = new yj0(i11, authorizationform, password, tL_secureRequiredType, v12, tL_secureRequiredType2, v13, hashMap8, hashMap3);
            yj0Var.C1 = new dj0(this, secureValueType2, z10, i3);
            yj0Var.currentAccount = this.currentAccount;
            yj0Var.f52300f1 = this.f52300f1;
            yj0Var.f52294d1 = this.f52294d1;
            yj0Var.f52290c = this.f52290c;
            yj0Var.f52338x1 = hashMap6;
            yj0Var.f52334w0 = z10;
            yj0Var.f52341y1 = hashMap2;
            yj0Var.H = arrayList;
            if (i11 == 4) {
                yj0Var.f52297e1 = this.f52297e1;
            }
            presentFragment(yj0Var);
        }
    }

    public final void J1(int i3) {
        if (i3 == 0) {
            int i10 = Build.VERSION.SDK_INT;
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            try {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File q02 = org.telegram.messenger.g0.q0(null, false);
                if (q02 != null) {
                    if (i10 >= 24) {
                        Activity parentActivity = getParentActivity();
                        org.telegram.messenger.t0.d();
                        intent.putExtra("output", FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", q02));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(q02));
                    }
                    this.R0 = q02.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void K1(ArrayList arrayList) {
        boolean z10;
        if (arrayList.isEmpty()) {
            return;
        }
        int i3 = this.T0;
        boolean z11 = true;
        if (i3 != 1 && i3 != 4 && (this.F.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Z;
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
        Utilities.f21387e.c(new org.telegram.messenger.voip.j0(this.T0, 7, this, arrayList, z10));
    }

    public final TLRPC.TL_secureValue L1(TLRPC.TL_secureRequiredType tL_secureRequiredType) {
        if (tL_secureRequiredType == null) {
            return null;
        }
        int size = this.E.values.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (tL_secureRequiredType.type.getClass() == this.E.values.get(i3).type.getClass()) {
                return this.E.values.remove(i3);
            }
        }
        return null;
    }

    public final void M1(View view) {
        while (view != null && this.f52293d0.indexOfChild(view) < 0) {
            view = (View) view.getParent();
        }
        if (view != null) {
            this.f52291c0.smoothScrollTo(0, view.getTop() - ((this.f52291c0.getMeasuredHeight() - view.getMeasuredHeight()) / 2));
        }
    }

    public final void N1(HashMap hashMap, EditTextBoldCursor editTextBoldCursor, String str) {
        CharSequence charSequence;
        CharSequence charSequence2;
        String str2 = (String) hashMap.get(str);
        if (str2 != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -2006252145:
                    if (str.equals("residence_country_code")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1249512767:
                    if (str.equals("gender")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 475919162:
                    if (str.equals("expiry_date")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1481071862:
                    if (str.equals("country_code")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    this.f52333w = str2;
                    CharSequence charSequence3 = (String) this.Z0.get(str2);
                    if (charSequence3 != null) {
                        editTextBoldCursor.setText(charSequence3);
                        break;
                    }
                    break;
                case 1:
                    if ("male".equals(str2)) {
                        this.f52336x = str2;
                        editTextBoldCursor.setText(org.telegram.messenger.bd.M0(2131747516, null));
                        break;
                    } else if ("female".equals(str2)) {
                        this.f52336x = str2;
                        editTextBoldCursor.setText(org.telegram.messenger.bd.M0(2131747577, null));
                        break;
                    }
                    break;
                case 2:
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    int[] iArr = this.f52339y;
                    if (!isEmpty) {
                        String[] split = str2.split("\\.");
                        if (split.length == 3) {
                            iArr[0] = Utilities.z(split[2]).intValue();
                            iArr[1] = Utilities.z(split[1]).intValue();
                            iArr[2] = Utilities.z(split[0]).intValue();
                            editTextBoldCursor.setText(str2);
                            break;
                        }
                    }
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    editTextBoldCursor.setText(org.telegram.messenger.bd.M0(2131747502, null));
                    break;
                case 3:
                    this.f52324s = str2;
                    CharSequence charSequence4 = (String) this.Z0.get(str2);
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
        HashMap hashMap2 = this.f52338x1;
        HashMap hashMap3 = this.f52343z1;
        if (hashMap2 != null && (charSequence2 = (String) hashMap2.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence2);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
            return;
        }
        HashMap hashMap4 = this.f52341y1;
        if (hashMap4 != null && (charSequence = (String) hashMap4.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
        }
    }

    public final void O1(Bundle bundle, int i3, boolean z10) {
        if (i3 == 3) {
            this.M.setVisibility(8);
        }
        int i10 = this.J1;
        org.telegram.ui.Components.vt0[] vt0VarArr = this.K1;
        org.telegram.ui.Components.vt0 vt0Var = vt0VarArr[i10];
        org.telegram.ui.Components.vt0 vt0Var2 = vt0VarArr[i3];
        this.J1 = i3;
        vt0Var2.m(bundle, false);
        vt0Var2.j();
        if (z10) {
            Point point = org.telegram.messenger.g0.f22608q;
            vt0Var2.setTranslationX(point.x);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.setDuration(300L);
            animatorSet.playTogether(ObjectAnimator.ofFloat(vt0Var, "translationX", -point.x), ObjectAnimator.ofFloat(vt0Var2, "translationX", 0.0f));
            animatorSet.addListener(new org.telegram.ui.Components.ri0(vt0Var2, vt0Var, 9));
            animatorSet.start();
            return;
        }
        vt0Var2.setTranslationX(0.0f);
        vt0Var2.setVisibility(0);
        if (vt0Var != vt0Var2) {
            vt0Var.setVisibility(8);
        }
    }

    public final void P1(org.telegram.tgnet.TLRPC.TL_secureRequiredType r31, java.lang.String r32, java.lang.String r33, org.telegram.tgnet.TLRPC.TL_secureRequiredType r34, java.lang.String r35, boolean r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yj0.P1(org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, boolean, int):void");
    }

    public final void Q1(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = str;
        s1Var.U = str2;
        showDialog(s1Var);
    }

    public final void R1(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.N;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10 && this.M != null) {
            this.N = new AnimatorSet();
            if (z11) {
                this.O.setVisibility(0);
                this.M.setEnabled(false);
                AnimatorSet animatorSet2 = this.N;
                View contentView = this.M.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(contentView, property, 0.1f);
                View contentView2 = this.M.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(contentView2, property2, 0.1f);
                View contentView3 = this.M.getContentView();
                Property property3 = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, property3, 0.0f), ObjectAnimator.ofFloat(this.O, property, 1.0f), ObjectAnimator.ofFloat(this.O, property2, 1.0f), ObjectAnimator.ofFloat(this.O, property3, 1.0f));
            } else {
                this.M.getContentView().setVisibility(0);
                this.M.setEnabled(true);
                AnimatorSet animatorSet3 = this.N;
                org.telegram.ui.Components.aq aqVar = this.O;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(aqVar, property4, 0.1f);
                org.telegram.ui.Components.aq aqVar2 = this.O;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(aqVar2, property5, 0.1f);
                org.telegram.ui.Components.aq aqVar3 = this.O;
                Property property6 = View.ALPHA;
                animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(aqVar3, property6, 0.0f), ObjectAnimator.ofFloat(this.M.getContentView(), property4, 1.0f), ObjectAnimator.ofFloat(this.M.getContentView(), property5, 1.0f), ObjectAnimator.ofFloat(this.M.getContentView(), property6, 1.0f));
            }
            this.N.addListener(new ej0(this, z11, 0));
            this.N.setDuration(150L);
            this.N.start();
        } else if (this.P != null) {
            this.N = new AnimatorSet();
            if (z11) {
                this.Q.setVisibility(0);
                this.R.setEnabled(false);
                AnimatorSet animatorSet4 = this.N;
                TextView textView = this.P;
                Property property7 = View.SCALE_X;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView, property7, 0.1f);
                TextView textView2 = this.P;
                Property property8 = View.SCALE_Y;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView2, property8, 0.1f);
                TextView textView3 = this.P;
                Property property9 = View.ALPHA;
                animatorSet4.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, property9, 0.0f), ObjectAnimator.ofFloat(this.Q, property7, 1.0f), ObjectAnimator.ofFloat(this.Q, property8, 1.0f), ObjectAnimator.ofFloat(this.Q, property9, 1.0f));
            } else {
                this.P.setVisibility(0);
                this.R.setEnabled(true);
                AnimatorSet animatorSet5 = this.N;
                org.telegram.ui.Components.aq aqVar4 = this.Q;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(aqVar4, property10, 0.1f);
                org.telegram.ui.Components.aq aqVar5 = this.Q;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(aqVar5, property11, 0.1f);
                org.telegram.ui.Components.aq aqVar6 = this.Q;
                Property property12 = View.ALPHA;
                animatorSet5.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(aqVar6, property12, 0.0f), ObjectAnimator.ofFloat(this.P, property10, 1.0f), ObjectAnimator.ofFloat(this.P, property11, 1.0f), ObjectAnimator.ofFloat(this.P, property12, 1.0f));
            }
            this.N.addListener(new ej0(this, z11, 1));
            this.N.setDuration(150L);
            this.N.start();
        }
    }

    public final void S1(boolean z10, String str, Runnable runnable, nj0 nj0Var, pj0 pj0Var) {
        boolean z11;
        boolean z12;
        boolean z13;
        TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.f25457b.getSystemService("phone");
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
                this.N1.clear();
                if (!z12) {
                    this.N1.add("android.permission.READ_PHONE_STATE");
                }
                if (!this.N1.isEmpty()) {
                    if (getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f27343a.S = org.telegram.messenger.bd.M0(2131689472, null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                        String M0 = org.telegram.messenger.bd.M0(2131754275, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.U = M0;
                        this.M1 = showDialog(s1Var);
                    } else {
                        getParentActivity().requestPermissions((String[]) this.N1.toArray(new String[0]), 6);
                    }
                    this.F1 = str;
                    this.H1 = nj0Var;
                    this.G1 = runnable;
                    this.I1 = pj0Var;
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
        tL_codeSettings.allow_app_hash = org.telegram.messenger.lt.f24103b.hasServices();
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25457b.getSharedPreferences("mainconfig", 0);
        if (sendverifyphonecode.settings.allow_app_hash) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            boolean z14 = org.telegram.messenger.r2.f25040a;
            org.telegram.messenger.t0.u();
            edit.putString("sms_hash", "O2P2z+/jBpJ").commit();
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
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendverifyphonecode, new ai.q1(this, str, pj0Var, sendverifyphonecode, 15), 2);
    }

    public final void U1() {
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.G;
        if (tL_secureRequiredType != null) {
            this.actionBar.setTitle(u1(tL_secureRequiredType.type));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131747500, null));
        }
        X1(2);
        X1(3);
        X1(1);
        X1(4);
    }

    public final void V0(final org.telegram.messenger.wv wvVar, final int i3) {
        String M0;
        final String str;
        String v;
        HashMap hashMap;
        if (i3 == 1) {
            this.k1 = wvVar;
            if (this.f52303h0 == null) {
                return;
            }
        } else if (i3 == 4) {
            this.f52311l1.add(wvVar);
            if (this.f52305i0 == null) {
                return;
            }
        } else if (i3 == 2) {
            this.m1 = wvVar;
            if (this.f52299f0 == null) {
                return;
            }
        } else if (i3 == 3) {
            this.f52314n1 = wvVar;
            if (this.f52301g0 == null) {
                return;
            }
        } else {
            this.f52308j1.add(wvVar);
            if (this.f52296e0 == null) {
                return;
            }
        }
        if (getParentActivity() == null) {
            return;
        }
        final wj0 wj0Var = new wj0(this, getParentActivity());
        wj0Var.setTag(wvVar);
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27878d6);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27972i6);
        wj0Var.setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(wj0Var, N0, N, N2, null);
        this.f52316o1.put(wvVar, wj0Var);
        String r12 = r1(wvVar);
        if (i3 == 1) {
            M0 = org.telegram.messenger.bd.M0(2131747471, null);
            this.f52303h0.addView(wj0Var, b8.mf.o(-1, -2));
            str = "selfie" + r12;
        } else if (i3 == 4) {
            M0 = org.telegram.messenger.bd.M0(2131753948, null);
            this.f52305i0.addView(wj0Var, b8.mf.o(-1, -2));
            str = "translation" + r12;
        } else if (i3 == 2) {
            TLRPC.SecureValueType secureValueType = this.G.type;
            if (!(secureValueType instanceof TLRPC.TL_secureValueTypePassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                M0 = org.telegram.messenger.bd.M0(2131747576, null);
            } else {
                M0 = org.telegram.messenger.bd.M0(2131747518, null);
            }
            this.f52299f0.addView(wj0Var, b8.mf.o(-1, -2));
            str = "front" + r12;
        } else if (i3 == 3) {
            M0 = org.telegram.messenger.bd.M0(2131747480, null);
            this.f52301g0.addView(wj0Var, b8.mf.o(-1, -2));
            str = "reverse" + r12;
        } else {
            M0 = org.telegram.messenger.bd.M0(2131753948, null);
            this.f52296e0.addView(wj0Var, b8.mf.o(-1, -2));
            str = "files" + r12;
        }
        TextView textView = wj0Var.f51185b;
        if (str != null && (hashMap = this.f52341y1) != null && (v = (String) hashMap.get(str)) != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28102p7, null);
            this.f52343z1.put(str, "");
        } else {
            v = org.telegram.messenger.bd.v(wvVar.f26263b.date);
        }
        wj0Var.f51184a.setText(M0);
        textView.setText(v);
        org.telegram.ui.Components.k9 k9Var = wj0Var.f51186c;
        k9Var.getClass();
        ?? obj = new Object();
        obj.h = wvVar;
        k9Var.n(obj, "48_48", null, null, null, null, 0, null);
        wj0Var.f51188f = wvVar;
        wj0Var.a(false);
        wj0Var.setOnClickListener(new bi.q(this, i3, 26));
        wj0Var.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                yj0 yj0Var = this;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yj0Var.getParentActivity());
                int i10 = i3;
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                if (i10 == 1) {
                    s1Var.U = org.telegram.messenger.bd.M0(2131747590, null);
                } else {
                    s1Var.U = org.telegram.messenger.bd.M0(2131747592, null);
                }
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                s1Var.S = org.telegram.messenger.bd.M0(2131689472, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), new ai.m3(yj0Var, wvVar, i10, wj0Var, str, 5));
                yj0Var.showDialog(s1Var);
                return true;
            }
        });
    }

    public final void V1() {
        if (this.E.values.isEmpty()) {
            this.B0.setVisibility(0);
            this.m0.setVisibility(8);
            this.f52309k0.setVisibility(8);
            this.f52340y0.setVisibility(8);
            this.f52342z0.setVisibility(8);
            this.A0.setVisibility(8);
            return;
        }
        this.B0.setVisibility(8);
        this.m0.setVisibility(0);
        this.f52309k0.setVisibility(0);
        this.f52342z0.setVisibility(0);
        this.A0.setVisibility(0);
        if (!w1(TLRPC.TL_secureValueTypePhone.class) && !w1(TLRPC.TL_secureValueTypeEmail.class) && !w1(TLRPC.TL_secureValueTypePersonalDetails.class) && !w1(TLRPC.TL_secureValueTypePassport.class) && !w1(TLRPC.TL_secureValueTypeInternalPassport.class) && !w1(TLRPC.TL_secureValueTypeIdentityCard.class) && !w1(TLRPC.TL_secureValueTypeDriverLicense.class) && !w1(TLRPC.TL_secureValueTypeAddress.class) && !w1(TLRPC.TL_secureValueTypeUtilityBill.class) && !w1(TLRPC.TL_secureValueTypePassportRegistration.class) && !w1(TLRPC.TL_secureValueTypeTemporaryRegistration.class) && !w1(TLRPC.TL_secureValueTypeBankStatement.class) && !w1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            this.f52340y0.setVisibility(8);
        } else {
            this.f52340y0.setVisibility(0);
        }
    }

    public final void W0(TLRPC.TL_secureFile tL_secureFile, int i3) {
        byte[] bArr = tL_secureFile.secret;
        byte[] bArr2 = tL_secureFile.file_hash;
        byte[] r5 = Utilities.r(m1(bArr, bArr2), bArr2);
        byte[] bArr3 = new byte[32];
        System.arraycopy(r5, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(r5, 32, bArr4, 0, 16);
        V0(new org.telegram.messenger.wv(new org.telegram.messenger.xv(bArr3, bArr4), tL_secureFile, null, null, null), i3);
    }

    public final void W1() {
        ImageView imageView = this.J0;
        if (imageView != null) {
            TL_account.Password password = this.K;
            if (password != null && this.O0 == 0) {
                if (!password.has_password) {
                    this.H0.setVisibility(0);
                    this.J0.setVisibility(0);
                    this.K0.setVisibility(0);
                    this.L0.setVisibility(0);
                    this.M0.setVisibility(8);
                    this.f52285a0[0].setVisibility(8);
                    this.M.setVisibility(8);
                    this.N0.setVisibility(8);
                    this.I0.setVisibility(8);
                    this.H0.setLayoutParams(b8.mf.k(0.0f, 25.0f, 0.0f, 0.0f, -1, -2));
                    this.G0.setVisibility(8);
                    return;
                }
                this.H0.setVisibility(0);
                this.J0.setVisibility(8);
                this.K0.setVisibility(8);
                this.L0.setVisibility(8);
                this.G0.setVisibility(8);
                this.M0.setVisibility(0);
                this.f52285a0[0].setVisibility(0);
                this.M.setVisibility(0);
                this.N0.setVisibility(0);
                this.I0.setVisibility(0);
                this.H0.setLayoutParams(b8.mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                if (this.Z != null) {
                    TL_account.Password password2 = this.K;
                    if (password2 != null && !TextUtils.isEmpty(password2.hint)) {
                        this.Z[0].setHint(this.K.hint);
                        return;
                    } else {
                        this.Z[0].setHint(org.telegram.messenger.bd.M0(2131748734, null));
                        return;
                    }
                }
                return;
            }
            imageView.setVisibility(8);
            this.K0.setVisibility(8);
            this.L0.setVisibility(8);
            this.M0.setVisibility(8);
            this.f52285a0[0].setVisibility(8);
            this.M.setVisibility(8);
            this.N0.setVisibility(8);
            this.I0.setVisibility(8);
            this.H0.setVisibility(8);
            this.G0.setVisibility(0);
        }
    }

    public final void X0(ArrayList arrayList) {
        this.f52308j1.clear();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i3);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                W0((TLRPC.TL_secureFile) secureFile, 0);
            }
        }
    }

    public final void X1(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yj0.X1(int):void");
    }

    public final org.telegram.ui.xj0 Y0(android.content.Context r28, org.telegram.tgnet.TLRPC.TL_secureRequiredType r29, java.util.ArrayList r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yj0.Y0(android.content.Context, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.util.ArrayList, boolean, boolean):org.telegram.ui.xj0");
    }

    public final void Z0(ArrayList arrayList) {
        this.f52311l1.clear();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i3);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                W0((TLRPC.TL_secureFile) secureFile, 4);
            }
        }
    }

    public final void a1(boolean z10) {
        int i3;
        if (!this.f52304h1) {
            String str = this.f52312n;
            boolean isEmpty = TextUtils.isEmpty(str);
            int i10 = this.f52287b;
            if (!isEmpty) {
                if (z10) {
                    Activity parentActivity = getParentActivity();
                    sf.c.q(parentActivity, Uri.parse(str + "&tg_passport=success"), true, true);
                } else if (!this.f52302g1 && (i10 == 5 || i10 == 0)) {
                    Activity parentActivity2 = getParentActivity();
                    sf.c.q(parentActivity2, Uri.parse(str + "&tg_passport=cancel"), true, true);
                }
                this.f52304h1 = true;
            } else if (this.D1) {
                if (z10 || (!this.f52302g1 && (i10 == 5 || i10 == 0))) {
                    Activity parentActivity3 = getParentActivity();
                    if (z10) {
                        i3 = -1;
                    } else {
                        i3 = 0;
                    }
                    parentActivity3.setResult(i3);
                }
                this.f52304h1 = true;
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    public final boolean b1(boolean z10) {
        if (y1()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747588, null), new pi0(this, 1));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            String M0 = org.telegram.messenger.bd.M0(2131751406, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131747587, null);
            showDialog(s1Var);
        }
        return true;
    }

    public final void c1(boolean z10) {
        String str;
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.f52288b0 != null) {
            String str2 = (String) this.Z0.get(this.f52333w);
            String str3 = (String) org.telegram.messenger.az.n().get(this.f52333w);
            int i3 = 0;
            if (this.F.native_names && !TextUtils.isEmpty(this.f52333w) && !"EN".equals(str3)) {
                if (this.f52322r0.getVisibility() != 0) {
                    this.f52322r0.setVisibility(0);
                    this.f52309k0.setVisibility(0);
                    this.U.setVisibility(0);
                    int i10 = 0;
                    while (true) {
                        editTextBoldCursorArr = this.f52288b0;
                        if (i10 >= editTextBoldCursorArr.length) {
                            break;
                        }
                        ((View) editTextBoldCursorArr[i10].getParent()).setVisibility(0);
                        i10++;
                    }
                    if (editTextBoldCursorArr[0].length() == 0 && this.f52288b0[1].length() == 0 && this.f52288b0[2].length() == 0) {
                        int i11 = 0;
                        while (true) {
                            boolean[] zArr = this.f52329u0;
                            if (i11 >= zArr.length) {
                                break;
                            } else if (zArr[i11]) {
                                this.f52288b0[0].setText(this.Z[0].getText());
                                this.f52288b0[1].setText(this.Z[1].getText());
                                this.f52288b0[2].setText(this.Z[2].getText());
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                    org.telegram.ui.ActionBar.r6.a0(this.f52313n0, getParentActivity(), 2131231229, org.telegram.ui.ActionBar.k6.f27843b7);
                }
                this.f52322r0.setText(org.telegram.messenger.bd.a0("PassportNativeInfo", null, 2131747506, str2));
                if (str3 != null) {
                    String concat = "PassportLanguage_".concat(str3);
                    str = org.telegram.messenger.bd.E0().Y.b(concat);
                    if (str == null) {
                        org.telegram.messenger.bd E0 = org.telegram.messenger.bd.E0();
                        E0.i();
                        str = E0.W.b(concat);
                    }
                } else {
                    str = null;
                }
                if (str != null) {
                    this.f52309k0.setText(org.telegram.messenger.bd.a0("PassportNativeHeaderLang", null, 2131747507, str));
                } else {
                    this.f52309k0.setText(org.telegram.messenger.bd.M0(2131747508, null));
                }
                for (int i12 = 0; i12 < 3; i12++) {
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 == 2) {
                                if (str != null) {
                                    this.f52288b0[i12].setHintText(org.telegram.messenger.bd.M0(2131747466, null));
                                } else {
                                    this.f52288b0[i12].setHintText(org.telegram.messenger.bd.a0("PassportSurnameCountry", null, 2131747465, str2));
                                }
                            }
                        } else if (str != null) {
                            this.f52288b0[i12].setHintText(org.telegram.messenger.bd.M0(2131747515, null));
                        } else {
                            this.f52288b0[i12].setHintText(org.telegram.messenger.bd.a0("PassportMidnameCountry", null, 2131747514, str2));
                        }
                    } else if (str != null) {
                        this.f52288b0[i12].setHintText(org.telegram.messenger.bd.M0(2131747512, null));
                    } else {
                        this.f52288b0[i12].setHintText(org.telegram.messenger.bd.a0("PassportNameCountry", null, 2131747510, str2));
                    }
                }
                if (z10) {
                    org.telegram.messenger.g0.h3(new mi0(this, 2));
                }
            } else if (this.f52322r0.getVisibility() != 8) {
                this.f52322r0.setVisibility(8);
                this.f52309k0.setVisibility(8);
                this.U.setVisibility(8);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.f52288b0;
                    if (i3 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    ((View) editTextBoldCursorArr2[i3].getParent()).setVisibility(8);
                    i3++;
                }
                if (((this.f52290c != 0 || this.G == null) && this.I != null && !this.f52334w0) || this.J != null) {
                    org.telegram.ui.ActionBar.r6.a0(this.f52313n0, getParentActivity(), 2131231229, org.telegram.ui.ActionBar.k6.f27843b7);
                } else {
                    org.telegram.ui.ActionBar.r6.a0(this.f52313n0, getParentActivity(), 2131231230, org.telegram.ui.ActionBar.k6.f27843b7);
                }
            }
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yj0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        EditTextBoldCursor editTextBoldCursor;
        wj0 wj0Var;
        org.telegram.ui.ActionBar.q0 q0Var;
        if (i3 == org.telegram.messenger.hs.U1) {
            String str = (String) objArr[0];
            HashMap hashMap = this.f52318p1;
            org.telegram.messenger.wv wvVar = (org.telegram.messenger.wv) hashMap.get(str);
            if (wvVar != null) {
                wvVar.d = (TLRPC.TL_inputFile) objArr[1];
                hashMap.remove(str);
                if (hashMap.isEmpty() && (q0Var = this.M) != null) {
                    q0Var.setEnabled(true);
                    this.M.setAlpha(1.0f);
                }
                HashMap hashMap2 = this.f52316o1;
                if (hashMap2 != null && (wj0Var = (wj0) hashMap2.get(wvVar)) != null) {
                    wj0Var.a(true);
                }
                HashMap hashMap3 = this.f52343z1;
                if (hashMap3 != null && hashMap3.containsKey("error_document_all")) {
                    hashMap3.remove("error_document_all");
                    e1(false);
                }
                int i11 = wvVar.f26267i;
                if (i11 == 0) {
                    if (this.f52315o0 != null && !TextUtils.isEmpty(this.A1)) {
                        this.f52315o0.setText(this.A1);
                    }
                    hashMap3.remove("files_all");
                } else if (i11 == 4) {
                    if (this.f52317p0 != null && !TextUtils.isEmpty(this.B1)) {
                        this.f52317p0.setText(this.B1);
                    }
                    hashMap3.remove("translation_all");
                }
            }
        } else if (i3 != org.telegram.messenger.hs.V1 && i3 == org.telegram.messenger.hs.f23280p0) {
            if (objArr.length > 0) {
                Object obj = objArr[7];
                if (obj != null && (editTextBoldCursor = this.Z[0]) != null) {
                    editTextBoldCursor.setText((String) obj);
                }
                if (objArr[6] == null) {
                    TL_account.TL_password tL_password = new TL_account.TL_password();
                    this.K = tL_password;
                    tL_password.current_algo = (TLRPC.PasswordKdfAlgo) objArr[1];
                    tL_password.new_secure_algo = (TLRPC.SecurePasswordKdfAlgo) objArr[2];
                    tL_password.secure_random = (byte[]) objArr[3];
                    tL_password.has_recovery = !TextUtils.isEmpty((String) objArr[4]);
                    TL_account.Password password = this.K;
                    password.hint = (String) objArr[5];
                    password.srp_id = -1L;
                    byte[] bArr = new byte[256];
                    password.srp_B = bArr;
                    Utilities.f21385b.nextBytes(bArr);
                    EditTextBoldCursor editTextBoldCursor2 = this.Z[0];
                    if (editTextBoldCursor2 != null && editTextBoldCursor2.length() > 0) {
                        this.O0 = 2;
                    }
                }
            } else {
                this.K = null;
                A1();
            }
            W1();
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.bi biVar = this.S0;
        if (biVar != null && this.visibleDialog == biVar) {
            biVar.f32215b2.d0(false);
            this.S0.K();
            this.S0.f32215b2.g0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.S0 && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    public final void e1(boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        String str2;
        if (this.f52319q0 != null) {
            HashMap hashMap = this.f52338x1;
            HashMap hashMap2 = this.f52343z1;
            if (hashMap != null && ((z10 || hashMap2.containsKey("error_all")) && (str2 = (String) this.f52338x1.get("error_all")) != null)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
                if (z10) {
                    hashMap2.put("error_all", "");
                }
            } else {
                spannableStringBuilder = null;
            }
            if (this.f52341y1 != null && ((z10 || hashMap2.containsKey("error_document_all")) && (str = (String) this.f52341y1.get("error_all")) != null)) {
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
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.f28102p7, null), 0, spannableStringBuilder.length(), 33);
                this.f52319q0.setText(spannableStringBuilder);
                this.f52319q0.setVisibility(0);
            } else if (this.f52319q0.getVisibility() != 8) {
                this.f52319q0.setVisibility(8);
            }
        }
    }

    public final void f1(Context context) {
        long j10;
        String str;
        this.Z0 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.Z0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
        this.f52319q0 = y8Var;
        int i3 = org.telegram.ui.ActionBar.k6.f27843b7;
        org.telegram.ui.ActionBar.r6.a0(y8Var, context, 2131231231, i3);
        this.f52319q0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        this.f52293d0.addView(this.f52319q0, b8.mf.o(-1, -2));
        e1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.G;
        if (tL_secureRequiredType != null) {
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131754673, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131754682, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131754671, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131754675, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131754672, null));
            }
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
            this.f52309k0 = n4Var;
            n4Var.setText(org.telegram.messenger.bd.M0(2131747584, null));
            org.telegram.ui.Cells.n4 n4Var2 = this.f52309k0;
            int i10 = org.telegram.ui.ActionBar.k6.f27878d6;
            org.telegram.ui.ActionBar.r6.i(i10, n4Var2, null);
            j10 = 0;
            this.f52293d0.addView(this.f52309k0, b8.mf.o(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f52296e0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f52293d0.addView(this.f52296e0, b8.mf.o(-1, -2));
            org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context);
            this.S = v9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
            int i11 = org.telegram.ui.ActionBar.k6.f27972i6;
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
            v9Var.setBackground(N0);
            org.telegram.ui.ActionBar.r6.k(v9Var, N0, N, N2, null);
            this.f52293d0.addView(this.S, b8.mf.o(-1, -2));
            this.S.setOnClickListener(new ni0(this, 7));
            org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context);
            this.f52315o0 = y8Var2;
            org.telegram.ui.ActionBar.r6.a0(y8Var2, context, 2131231229, i3);
            if (this.f52290c != 0) {
                this.A1 = org.telegram.messenger.bd.M0(2131747635, null);
            } else {
                TLRPC.SecureValueType secureValueType2 = this.G.type;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                    this.A1 = org.telegram.messenger.bd.M0(2131747633, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                    this.A1 = org.telegram.messenger.bd.M0(2131747629, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                    this.A1 = org.telegram.messenger.bd.M0(2131747619, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                    this.A1 = org.telegram.messenger.bd.M0(2131747617, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                    this.A1 = org.telegram.messenger.bd.M0(2131747631, null);
                } else {
                    this.A1 = "";
                }
            }
            String str2 = this.A1;
            HashMap hashMap = this.f52341y1;
            HashMap hashMap2 = this.f52343z1;
            String str3 = str2;
            if (hashMap != null) {
                String str4 = (String) hashMap.get("files_all");
                str3 = str2;
                if (str4 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                    spannableStringBuilder.append((CharSequence) this.A1);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.f28102p7, null), 0, str4.length(), 33);
                    hashMap2.put("files_all", "");
                    str3 = spannableStringBuilder;
                }
            }
            this.f52315o0.setText(str3);
            this.f52293d0.addView(this.f52315o0, b8.mf.o(-1, -2));
            if (this.G.translation_required) {
                org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(context);
                this.f52309k0 = n4Var3;
                n4Var3.setText(org.telegram.messenger.bd.M0(2131747463, null));
                org.telegram.ui.ActionBar.r6.i(i10, this.f52309k0, null);
                this.f52293d0.addView(this.f52309k0, b8.mf.o(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.f52305i0 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.f52293d0.addView(this.f52305i0, b8.mf.o(-1, -2));
                org.telegram.ui.Cells.v9 v9Var2 = new org.telegram.ui.Cells.v9(context);
                this.Y = v9Var2;
                org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.k6.N0(true);
                org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i10);
                org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i11);
                v9Var2.setBackground(N02);
                org.telegram.ui.ActionBar.r6.k(v9Var2, N02, N3, N4, null);
                this.f52293d0.addView(this.Y, b8.mf.o(-1, -2));
                this.Y.setOnClickListener(new ni0(this, 8));
                org.telegram.ui.Cells.y8 y8Var3 = new org.telegram.ui.Cells.y8(context);
                this.f52317p0 = y8Var3;
                org.telegram.ui.ActionBar.r6.a0(y8Var3, context, 2131231229, i3);
                if (this.f52290c != 0) {
                    this.B1 = org.telegram.messenger.bd.M0(2131747611, null);
                } else {
                    TLRPC.SecureValueType secureValueType3 = this.G.type;
                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                        this.B1 = org.telegram.messenger.bd.M0(2131747616, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                        this.B1 = org.telegram.messenger.bd.M0(2131747614, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                        this.B1 = org.telegram.messenger.bd.M0(2131747613, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                        this.B1 = org.telegram.messenger.bd.M0(2131747612, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                        this.B1 = org.telegram.messenger.bd.M0(2131747615, null);
                    } else {
                        this.B1 = "";
                    }
                }
                String str5 = this.B1;
                HashMap hashMap3 = this.f52341y1;
                String str6 = str5;
                if (hashMap3 != null) {
                    String str7 = (String) hashMap3.get("translation_all");
                    str6 = str5;
                    if (str7 != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str7);
                        spannableStringBuilder2.append((CharSequence) "\n\n");
                        spannableStringBuilder2.append((CharSequence) this.B1);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.f28102p7, null), 0, str7.length(), 33);
                        hashMap2.put("translation_all", "");
                        str6 = spannableStringBuilder2;
                    }
                }
                this.f52317p0.setText(str6);
                this.f52293d0.addView(this.f52317p0, b8.mf.o(-1, -2));
            }
        } else {
            j10 = 0;
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131747610, null));
        }
        org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(context);
        this.f52309k0 = n4Var4;
        n4Var4.setText(org.telegram.messenger.bd.M0(2131747609, null));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, this.f52309k0, null);
        this.f52293d0.addView(this.f52309k0, b8.mf.o(-1, -2));
        this.Z = new EditTextBoldCursor[6];
        for (int i12 = 0; i12 < 6; i12++) {
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.Z[i12] = editTextBoldCursor;
            vi0 vi0Var = new vi0(context, editTextBoldCursor, 0);
            vi0Var.setWillNotDraw(false);
            this.f52293d0.addView(vi0Var, b8.mf.o(-1, -2));
            int i13 = org.telegram.ui.ActionBar.k6.f27878d6;
            org.telegram.ui.ActionBar.r6.i(i13, vi0Var, null);
            int i14 = 5;
            if (i12 == 5) {
                View view = new View(context);
                this.T = view;
                org.telegram.ui.ActionBar.r6.i(i13, view, null);
                this.f52293d0.addView(this.T, b8.mf.o(-1, 6));
            }
            if (this.f52334w0 && this.G != null) {
                vi0Var.setVisibility(8);
                View view2 = this.T;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            this.Z[i12].setTag(Integer.valueOf(i12));
            this.Z[i12].setSupportRtlHint(true);
            this.Z[i12].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.B(this.Z[i12], org.telegram.ui.ActionBar.k6.H6, null);
            org.telegram.ui.ActionBar.r6.A(this.Z[i12], org.telegram.ui.ActionBar.k6.L6, null);
            this.Z[i12].setTransformHintToHeader(true);
            EditTextBoldCursor editTextBoldCursor2 = this.Z[i12];
            int i15 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor2, i15, null);
            this.Z[i12].setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.r6.w(this.Z[i12], i15, null);
            this.Z[i12].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.Z[i12].setCursorWidth(1.5f);
            org.telegram.ui.ActionBar.r6.G(this.Z[i12], org.telegram.ui.ActionBar.k6.f28007k6, org.telegram.ui.ActionBar.k6.f28026l6, org.telegram.ui.ActionBar.k6.f28102p7, null);
            if (i12 == 5) {
                this.Z[i12].setOnTouchListener(new oi0(this, 2));
                this.Z[i12].setInputType(0);
                this.Z[i12].setFocusable(false);
            } else {
                this.Z[i12].setInputType(16385);
                this.Z[i12].setImeOptions(268435461);
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                if (i12 == 5) {
                                    this.Z[i12].setHintText(org.telegram.messenger.bd.M0(2131747602, null));
                                    str = "country_code";
                                }
                            } else {
                                this.Z[i12].setHintText(org.telegram.messenger.bd.M0(2131747469, null));
                                str = "state";
                            }
                        } else {
                            this.Z[i12].setHintText(org.telegram.messenger.bd.M0(2131747603, null));
                            str = "city";
                        }
                    } else {
                        this.Z[i12].setHintText(org.telegram.messenger.bd.M0(2131747488, null));
                        str = "post_code";
                    }
                } else {
                    this.Z[i12].setHintText(org.telegram.messenger.bd.M0(2131747467, null));
                    str = "street_line2";
                }
            } else {
                this.Z[i12].setHintText(org.telegram.messenger.bd.M0(2131747468, null));
                str = "street_line1";
            }
            N1(this.f52328t1, this.Z[i12], str);
            if (i12 == 2) {
                this.Z[i12].addTextChangedListener(new wi0(this, editTextBoldCursor, str));
                this.Z[i12].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            } else {
                this.Z[i12].addTextChangedListener(new xi0(this, editTextBoldCursor, str, 0));
            }
            EditTextBoldCursor editTextBoldCursor3 = this.Z[i12];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.Z[i12].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.Z[i12];
            if (!org.telegram.messenger.bd.f21784a0) {
                i14 = 3;
            }
            editTextBoldCursor4.setGravity(i14 | 16);
            vi0Var.addView(this.Z[i12], b8.mf.d(-1, 64.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
            this.Z[i12].setOnEditorActionListener(new li0(this, 4));
        }
        org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
        this.m0 = x6Var;
        this.f52293d0.addView(x6Var, b8.mf.o(-1, -2));
        if (this.f52334w0 && this.G != null) {
            this.f52309k0.setVisibility(8);
            this.m0.setVisibility(8);
        }
        int i16 = (this.f52290c > j10 ? 1 : (this.f52290c == j10 ? 0 : -1));
        TLRPC.TL_secureValue tL_secureValue = this.J;
        if (((i16 != 0 || this.G == null) && this.I != null && !this.f52334w0) || tL_secureValue != null) {
            if (tL_secureValue != null) {
                X0(tL_secureValue.files);
                Z0(tL_secureValue.translation);
            }
            org.telegram.ui.Cells.x6 x6Var2 = this.m0;
            int i17 = org.telegram.ui.ActionBar.k6.f27843b7;
            org.telegram.ui.ActionBar.r6.a0(x6Var2, context, 2131231229, i17);
            org.telegram.ui.Cells.v9 v9Var3 = new org.telegram.ui.Cells.v9(context);
            org.telegram.ui.ActionBar.r6.V(v9Var3.getTextView(), org.telegram.ui.ActionBar.k6.f28102p7, null);
            org.telegram.ui.Cells.y N03 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27878d6);
            org.telegram.ui.ActionBar.n6 N6 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27972i6);
            v9Var3.setBackground(N03);
            org.telegram.ui.ActionBar.r6.k(v9Var3, N03, N5, N6, null);
            if (this.G == null) {
                v9Var3.b(org.telegram.messenger.bd.M0(2131747595, null), false);
            } else {
                v9Var3.b(org.telegram.messenger.bd.M0(2131747600, null), false);
            }
            this.f52293d0.addView(v9Var3, b8.mf.o(-1, -2));
            v9Var3.setOnClickListener(new ni0(this, 9));
            org.telegram.ui.Cells.x6 x6Var3 = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
            this.m0 = x6Var3;
            org.telegram.ui.ActionBar.r6.a0(x6Var3, context, 2131231230, i17);
            this.f52293d0.addView(this.m0, b8.mf.o(-1, -2));
        } else {
            org.telegram.ui.Cells.x6 x6Var4 = this.m0;
            int i18 = org.telegram.ui.ActionBar.k6.f27843b7;
            org.telegram.ui.ActionBar.r6.a0(x6Var4, context, 2131231230, i18);
            if (this.f52334w0 && this.G != null) {
                org.telegram.ui.ActionBar.r6.a0(this.f52315o0, context, 2131231230, i18);
            }
        }
        X1(0);
        X1(4);
    }

    public final void g1() {
        if (getParentActivity() != null && this.S0 == null) {
            org.telegram.ui.Components.bi biVar = new org.telegram.ui.Components.bi(getParentActivity(), this, false, false);
            this.S0 = biVar;
            biVar.U3 = new yi0(this);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52291c0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28160s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        int i3 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f52310l0;
            if (i10 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) arrayList2.get(i10), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27879d7));
            i10++;
        }
        for (Map.Entry entry : this.f52316o1.entrySet()) {
            arrayList.add(new org.telegram.ui.ActionBar.t6((wj0) entry.getValue(), 268435456, new Class[]{wj0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
        }
        int i11 = org.telegram.ui.ActionBar.k6.f27878d6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52293d0, 268435456, new Class[]{org.telegram.ui.Cells.x8.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52293d0, 268435456, new Class[]{org.telegram.ui.Cells.v9.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52293d0, 268435456, new Class[]{xj0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        if (this.Z != null) {
            int i12 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Z;
                if (i12 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) editTextBoldCursorArr[i12].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.Z[i12], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.Z[i12], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28007k6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.Z[i12], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28026l6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.Z[i12], 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28102p7));
                i12++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28007k6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28026l6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28102p7));
        }
        if (this.f52288b0 != null) {
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.f52288b0;
                if (i3 >= editTextBoldCursorArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) editTextBoldCursorArr2[i3].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52288b0[i3], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52288b0[i3], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28007k6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52288b0[i3], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28026l6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52288b0[i3], 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28102p7));
                i3++;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.G0, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27955h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27929fi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27948gi));
        return arrayList;
    }

    public final void h1() {
        int L;
        int L2;
        boolean[] zArr = {true};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), new rb0(4, this, zArr));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        String M0 = org.telegram.messenger.bd.M0(2131689472, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        boolean z10 = this.f52334w0;
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        if (z10 && this.G == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeAddress)) {
            s1Var.U = org.telegram.messenger.bd.M0(2131747601, null);
        } else if (z10 && this.G == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            s1Var.U = org.telegram.messenger.bd.M0(2131747594, null);
        } else {
            s1Var.U = org.telegram.messenger.bd.M0(2131747598, null);
        }
        if (!this.f52334w0 && this.G != null) {
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(getParentActivity(), 1);
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(false);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27972i6);
            c2Var.setBackground(N0);
            org.telegram.ui.ActionBar.r6.k(c2Var, N0, null, N, null);
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                c2Var.e(org.telegram.messenger.bd.M0(2131747599, null), "", true, false, false);
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                c2Var.e(org.telegram.messenger.bd.M0(2131747597, null), "", true, false, false);
            }
            if (org.telegram.messenger.bd.f21784a0) {
                L = org.telegram.messenger.g0.L(16.0f);
            } else {
                L = org.telegram.messenger.g0.L(8.0f);
            }
            if (org.telegram.messenger.bd.f21784a0) {
                L2 = org.telegram.messenger.g0.L(8.0f);
            } else {
                L2 = org.telegram.messenger.g0.L(16.0f);
            }
            c2Var.setPadding(L, 0, L2, 0);
            frameLayout.addView(c2Var, b8.mf.e(-1, 48, 51));
            c2Var.setOnClickListener(new k8(4, zArr));
            alertDialog$Builder.o(frameLayout);
        }
        showDialog(s1Var);
    }

    public final void i1(Context context) {
        int i3;
        String str;
        int i10;
        int i11;
        String str2;
        String str3;
        int i12;
        this.Z0 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.Z0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
        this.f52319q0 = y8Var;
        int i13 = org.telegram.ui.ActionBar.k6.f27843b7;
        org.telegram.ui.ActionBar.r6.a0(y8Var, context, 2131231231, i13);
        this.f52319q0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        int i14 = -1;
        this.f52293d0.addView(this.f52319q0, b8.mf.o(-1, -2));
        e1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.G;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.F;
        org.telegram.ui.ActionBar.e6 e6Var = null;
        if (tL_secureRequiredType != null) {
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
            this.f52309k0 = n4Var;
            if (this.f52334w0) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131747584, null));
            } else {
                n4Var.setText(org.telegram.messenger.bd.M0(2131747483, null));
            }
            org.telegram.ui.Cells.n4 n4Var2 = this.f52309k0;
            int i15 = org.telegram.ui.ActionBar.k6.f27878d6;
            org.telegram.ui.ActionBar.r6.i(i15, n4Var2, null);
            this.f52293d0.addView(this.f52309k0, b8.mf.o(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f52299f0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f52293d0.addView(this.f52299f0, b8.mf.o(-1, -2));
            org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
            this.V = x8Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i15);
            int i16 = org.telegram.ui.ActionBar.k6.f27972i6;
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i16);
            x8Var.setBackground(N0);
            org.telegram.ui.ActionBar.r6.k(x8Var, N0, N, N2, null);
            this.f52293d0.addView(this.V, b8.mf.o(-1, -2));
            this.V.setOnClickListener(new ni0(this, 0));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.f52301g0 = linearLayout2;
            linearLayout2.setOrientation(1);
            this.f52293d0.addView(this.f52301g0, b8.mf.o(-1, -2));
            boolean z10 = this.G.selfie_required;
            org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context);
            this.W = x8Var2;
            org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i15);
            org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i16);
            x8Var2.setBackground(N02);
            org.telegram.ui.ActionBar.r6.k(x8Var2, N02, N3, N4, null);
            this.W.a(org.telegram.messenger.bd.M0(2131747480, null), org.telegram.messenger.bd.M0(2131747479, null), z10);
            this.f52293d0.addView(this.W, b8.mf.o(-1, -2));
            this.W.setOnClickListener(new ni0(this, 2));
            if (this.G.selfie_required) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.f52303h0 = linearLayout3;
                linearLayout3.setOrientation(1);
                this.f52293d0.addView(this.f52303h0, b8.mf.o(-1, -2));
                org.telegram.ui.Cells.x8 x8Var3 = new org.telegram.ui.Cells.x8(context);
                this.X = x8Var3;
                org.telegram.ui.Cells.y N03 = org.telegram.ui.ActionBar.k6.N0(true);
                org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i15);
                org.telegram.ui.ActionBar.n6 N6 = org.telegram.ui.ActionBar.r6.N(i16);
                x8Var3.setBackground(N03);
                org.telegram.ui.ActionBar.r6.k(x8Var3, N03, N5, N6, null);
                this.X.a(org.telegram.messenger.bd.M0(2131747471, null), org.telegram.messenger.bd.M0(2131747470, null), tL_secureRequiredType2.translation_required);
                this.f52293d0.addView(this.X, b8.mf.o(-1, -2));
                this.X.setOnClickListener(new ni0(this, 3));
            }
            org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context);
            this.f52315o0 = y8Var2;
            org.telegram.ui.ActionBar.r6.a0(y8Var2, context, 2131231229, i13);
            this.f52315o0.setText(org.telegram.messenger.bd.M0(2131747497, null));
            this.f52293d0.addView(this.f52315o0, b8.mf.o(-1, -2));
            if (this.G.translation_required) {
                org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(context);
                this.f52309k0 = n4Var3;
                n4Var3.setText(org.telegram.messenger.bd.M0(2131747463, null));
                org.telegram.ui.ActionBar.r6.i(i15, this.f52309k0, null);
                this.f52293d0.addView(this.f52309k0, b8.mf.o(-1, -2));
                LinearLayout linearLayout4 = new LinearLayout(context);
                this.f52305i0 = linearLayout4;
                linearLayout4.setOrientation(1);
                this.f52293d0.addView(this.f52305i0, b8.mf.o(-1, -2));
                org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context);
                this.Y = v9Var;
                org.telegram.ui.Cells.y N04 = org.telegram.ui.ActionBar.k6.N0(true);
                org.telegram.ui.ActionBar.n6 N7 = org.telegram.ui.ActionBar.r6.N(i15);
                org.telegram.ui.ActionBar.n6 N8 = org.telegram.ui.ActionBar.r6.N(i16);
                v9Var.setBackground(N04);
                org.telegram.ui.ActionBar.r6.k(v9Var, N04, N7, N8, null);
                this.f52293d0.addView(this.Y, b8.mf.o(-1, -2));
                this.Y.setOnClickListener(new ni0(this, 4));
                org.telegram.ui.Cells.y8 y8Var3 = new org.telegram.ui.Cells.y8(context);
                this.f52317p0 = y8Var3;
                org.telegram.ui.ActionBar.r6.a0(y8Var3, context, 2131231229, i13);
                if (this.f52290c != 0) {
                    this.B1 = org.telegram.messenger.bd.M0(2131747611, null);
                } else {
                    TLRPC.SecureValueType secureValueType = this.G.type;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
                        this.B1 = org.telegram.messenger.bd.M0(2131747621, null);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                        this.B1 = org.telegram.messenger.bd.M0(2131747624, null);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                        this.B1 = org.telegram.messenger.bd.M0(2131747626, null);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                        this.B1 = org.telegram.messenger.bd.M0(2131747627, null);
                    } else {
                        this.B1 = "";
                    }
                }
                String str4 = this.B1;
                HashMap hashMap = this.f52341y1;
                String str5 = str4;
                if (hashMap != null) {
                    String str6 = (String) hashMap.get("translation_all");
                    str5 = str4;
                    if (str6 != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str6);
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) this.B1);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.f28102p7, null), 0, str6.length(), 33);
                        this.f52343z1.put("translation_all", "");
                        str5 = spannableStringBuilder;
                    }
                }
                this.f52317p0.setText(str5);
                this.f52293d0.addView(this.f52317p0, b8.mf.o(-1, -2));
            }
        } else {
            org.telegram.ui.Cells.v9 v9Var2 = new org.telegram.ui.Cells.v9(context);
            this.f52325s0 = v9Var2;
            org.telegram.ui.Cells.y N05 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N9 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27878d6);
            org.telegram.ui.ActionBar.n6 N10 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27972i6);
            v9Var2.setBackground(N05);
            org.telegram.ui.ActionBar.r6.k(v9Var2, N05, N9, N10, null);
            this.f52325s0.b(org.telegram.messenger.bd.M0(2131747478, null), false);
            this.f52293d0.addView(this.f52325s0, b8.mf.o(-1, -2));
            this.f52325s0.setOnClickListener(new ni0(this, 5));
            org.telegram.ui.Cells.y8 y8Var4 = new org.telegram.ui.Cells.y8(context);
            this.f52315o0 = y8Var4;
            org.telegram.ui.ActionBar.r6.a0(y8Var4, context, 2131231229, i13);
            this.f52315o0.setText(org.telegram.messenger.bd.M0(2131747477, null));
            this.f52293d0.addView(this.f52315o0, b8.mf.o(-1, -2));
        }
        org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(context);
        this.f52309k0 = n4Var4;
        if (this.f52334w0) {
            n4Var4.setText(org.telegram.messenger.bd.M0(2131747586, null));
        } else {
            n4Var4.setText(org.telegram.messenger.bd.M0(2131747500, null));
        }
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, this.f52309k0, null);
        this.f52293d0.addView(this.f52309k0, b8.mf.o(-1, -2));
        int i17 = 7;
        if (this.G != null) {
            i3 = 9;
        } else {
            i3 = 7;
        }
        this.Z = new EditTextBoldCursor[i3];
        int i18 = 0;
        while (true) {
            int i19 = 6;
            HashMap hashMap2 = this.f52328t1;
            if (i18 < i3) {
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.Z[i18] = editTextBoldCursor;
                vi0 vi0Var = new vi0(context, editTextBoldCursor, 1);
                vi0Var.setWillNotDraw(false);
                this.f52293d0.addView(vi0Var, b8.mf.o(i14, 64));
                int i20 = org.telegram.ui.ActionBar.k6.f27878d6;
                org.telegram.ui.ActionBar.r6.i(i20, vi0Var, e6Var);
                if (i18 == i3 - 1) {
                    View view = new View(context);
                    this.T = view;
                    org.telegram.ui.ActionBar.r6.i(i20, view, e6Var);
                    this.f52293d0.addView(this.T, b8.mf.o(i14, 6));
                }
                if (this.f52334w0 && this.G != null && i18 < i17) {
                    vi0Var.setVisibility(8);
                    View view2 = this.T;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                }
                this.Z[i18].setTag(Integer.valueOf(i18));
                this.Z[i18].setSupportRtlHint(true);
                this.Z[i18].setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.B(this.Z[i18], org.telegram.ui.ActionBar.k6.H6, null);
                EditTextBoldCursor editTextBoldCursor2 = this.Z[i18];
                int i21 = org.telegram.ui.ActionBar.k6.G6;
                org.telegram.ui.ActionBar.r6.V(editTextBoldCursor2, i21, null);
                org.telegram.ui.ActionBar.r6.A(this.Z[i18], org.telegram.ui.ActionBar.k6.L6, null);
                this.Z[i18].setTransformHintToHeader(true);
                this.Z[i18].setBackgroundDrawable(null);
                org.telegram.ui.ActionBar.r6.w(this.Z[i18], i21, null);
                this.Z[i18].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                this.Z[i18].setCursorWidth(1.5f);
                org.telegram.ui.ActionBar.r6.G(this.Z[i18], org.telegram.ui.ActionBar.k6.f28007k6, org.telegram.ui.ActionBar.k6.f28026l6, org.telegram.ui.ActionBar.k6.f28102p7, null);
                if (i18 == 5 || i18 == 6) {
                    i11 = 7;
                    this.Z[i18].setOnTouchListener(new oi0(this, 0));
                    this.Z[i18].setInputType(0);
                } else if (i18 != 3 && i18 != 8) {
                    if (i18 == 4) {
                        this.Z[i18].setOnTouchListener(new oi0(this, 1));
                        this.Z[i18].setInputType(0);
                        this.Z[i18].setFocusable(false);
                    } else {
                        this.Z[i18].setInputType(16385);
                        this.Z[i18].setImeOptions(268435461);
                    }
                    i11 = 7;
                } else {
                    i11 = 7;
                    this.Z[i18].setOnTouchListener(new gi.n1(7, this, context));
                    this.Z[i18].setInputType(0);
                    this.Z[i18].setFocusable(false);
                }
                HashMap hashMap3 = this.f52330u1;
                switch (i18) {
                    case 0:
                        if (tL_secureRequiredType2.native_names) {
                            this.Z[i18].setHintText(org.telegram.messenger.bd.M0(2131747509, null));
                        } else {
                            this.Z[i18].setHintText(org.telegram.messenger.bd.M0(2131747512, null));
                        }
                        str2 = "first_name";
                        break;
                    case 1:
                        if (tL_secureRequiredType2.native_names) {
                            this.Z[i18].setHintText(org.telegram.messenger.bd.M0(2131747513, null));
                        } else {
                            this.Z[i18].setHintText(org.telegram.messenger.bd.M0(2131747515, null));
                        }
                        str2 = "middle_name";
                        break;
                    case 2:
                        if (tL_secureRequiredType2.native_names) {
                            this.Z[i18].setHintText(org.telegram.messenger.bd.M0(2131747464, null));
                        } else {
                            this.Z[i18].setHintText(org.telegram.messenger.bd.M0(2131747466, null));
                        }
                        str2 = "last_name";
                        break;
                    case 3:
                        this.Z[i18].setHintText(org.telegram.messenger.bd.M0(2131747605, null));
                        str2 = "birth_date";
                        break;
                    case 4:
                        this.Z[i18].setHintText(org.telegram.messenger.bd.M0(2131747574, null));
                        str2 = "gender";
                        break;
                    case 5:
                        this.Z[i18].setHintText(org.telegram.messenger.bd.M0(2131747604, null));
                        str2 = "country_code";
                        break;
                    case 6:
                        this.Z[i18].setHintText(org.telegram.messenger.bd.M0(2131747482, null));
                        str2 = "residence_country_code";
                        break;
                    case 7:
                        this.Z[i18].setHintText(org.telegram.messenger.bd.M0(2131747585, null));
                        str3 = "document_no";
                        String str7 = str3;
                        hashMap2 = hashMap3;
                        str2 = str7;
                        break;
                    case 8:
                        this.Z[i18].setHintText(org.telegram.messenger.bd.M0(2131747578, null));
                        str3 = "expiry_date";
                        String str72 = str3;
                        hashMap2 = hashMap3;
                        str2 = str72;
                        break;
                    default:
                        i18++;
                        i17 = i11;
                        i14 = -1;
                        e6Var = null;
                }
                N1(hashMap2, this.Z[i18], str2);
                EditTextBoldCursor editTextBoldCursor3 = this.Z[i18];
                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                if (i18 != 0 && i18 != 2 && i18 != 1) {
                    this.Z[i18].addTextChangedListener(new org.telegram.ui.Components.kv0(this, editTextBoldCursor, str2, hashMap2));
                } else {
                    this.Z[i18].addTextChangedListener(new xi0(this, editTextBoldCursor, str2, 1));
                }
                this.Z[i18].setPadding(0, 0, 0, 0);
                EditTextBoldCursor editTextBoldCursor4 = this.Z[i18];
                if (org.telegram.messenger.bd.f21784a0) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                editTextBoldCursor4.setGravity(i12 | 16);
                vi0Var.addView(this.Z[i18], b8.mf.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                this.Z[i18].setOnEditorActionListener(new li0(this, 1));
                i18++;
                i17 = i11;
                i14 = -1;
                e6Var = null;
            } else {
                org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                this.f52313n0 = x6Var;
                this.f52293d0.addView(x6Var, b8.mf.o(-1, -2));
                org.telegram.ui.Cells.n4 n4Var5 = new org.telegram.ui.Cells.n4(context);
                this.f52309k0 = n4Var5;
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, n4Var5, null);
                this.f52293d0.addView(this.f52309k0, b8.mf.o(-1, -2));
                int i22 = 3;
                this.f52288b0 = new EditTextBoldCursor[3];
                int i23 = 0;
                while (i23 < i22) {
                    EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
                    this.f52288b0[i23] = editTextBoldCursor5;
                    vi0 vi0Var2 = new vi0(context, editTextBoldCursor5, 2);
                    vi0Var2.setWillNotDraw(false);
                    this.f52293d0.addView(vi0Var2, b8.mf.o(-1, 64));
                    int i24 = org.telegram.ui.ActionBar.k6.f27878d6;
                    org.telegram.ui.ActionBar.r6.i(i24, vi0Var2, null);
                    if (i23 == 2) {
                        View view3 = new View(context);
                        this.U = view3;
                        org.telegram.ui.ActionBar.r6.i(i24, view3, null);
                        this.f52293d0.addView(this.U, b8.mf.o(-1, i19));
                    }
                    this.f52288b0[i23].setTag(Integer.valueOf(i23));
                    this.f52288b0[i23].setSupportRtlHint(true);
                    this.f52288b0[i23].setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.r6.B(this.f52288b0[i23], org.telegram.ui.ActionBar.k6.H6, null);
                    EditTextBoldCursor editTextBoldCursor6 = this.f52288b0[i23];
                    int i25 = org.telegram.ui.ActionBar.k6.G6;
                    org.telegram.ui.ActionBar.r6.V(editTextBoldCursor6, i25, null);
                    org.telegram.ui.ActionBar.r6.A(this.f52288b0[i23], org.telegram.ui.ActionBar.k6.L6, null);
                    this.f52288b0[i23].setTransformHintToHeader(true);
                    this.f52288b0[i23].setBackgroundDrawable(null);
                    org.telegram.ui.ActionBar.r6.w(this.f52288b0[i23], i25, null);
                    this.f52288b0[i23].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                    this.f52288b0[i23].setCursorWidth(1.5f);
                    org.telegram.ui.ActionBar.r6.G(this.f52288b0[i23], org.telegram.ui.ActionBar.k6.f28007k6, org.telegram.ui.ActionBar.k6.f28026l6, org.telegram.ui.ActionBar.k6.f28102p7, null);
                    this.f52288b0[i23].setInputType(16385);
                    this.f52288b0[i23].setImeOptions(268435461);
                    if (i23 != 0) {
                        if (i23 != 1) {
                            if (i23 == 2) {
                                str = "last_name_native";
                            } else {
                                i23++;
                                i22 = 3;
                                i19 = 6;
                            }
                        } else {
                            str = "middle_name_native";
                        }
                    } else {
                        str = "first_name_native";
                    }
                    N1(hashMap2, this.f52288b0[i23], str);
                    EditTextBoldCursor editTextBoldCursor7 = this.f52288b0[i23];
                    editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
                    if (i23 == 0 || i23 == 2 || i23 == 1) {
                        this.f52288b0[i23].addTextChangedListener(new xi0(this, editTextBoldCursor5, str, 2));
                    }
                    this.f52288b0[i23].setPadding(0, 0, 0, 0);
                    EditTextBoldCursor editTextBoldCursor8 = this.f52288b0[i23];
                    if (org.telegram.messenger.bd.f21784a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    editTextBoldCursor8.setGravity(i10 | 16);
                    vi0Var2.addView(this.f52288b0[i23], b8.mf.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.f52288b0[i23].setOnEditorActionListener(new li0(this, 2));
                    i23++;
                    i22 = 3;
                    i19 = 6;
                }
                org.telegram.ui.Cells.y8 y8Var5 = new org.telegram.ui.Cells.y8(context);
                this.f52322r0 = y8Var5;
                this.f52293d0.addView(y8Var5, b8.mf.o(-1, -2));
                int i26 = (this.f52290c > 0L ? 1 : (this.f52290c == 0L ? 0 : -1));
                TLRPC.TL_secureValue tL_secureValue = this.J;
                if (((i26 != 0 || this.G == null) && this.I != null && !this.f52334w0) || tL_secureValue != null) {
                    if (tL_secureValue != null) {
                        X0(tL_secureValue.files);
                        TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                        if (secureFile instanceof TLRPC.TL_secureFile) {
                            W0((TLRPC.TL_secureFile) secureFile, 2);
                        }
                        TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                        if (secureFile2 instanceof TLRPC.TL_secureFile) {
                            W0((TLRPC.TL_secureFile) secureFile2, 3);
                        }
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            W0((TLRPC.TL_secureFile) secureFile3, 1);
                        }
                        Z0(tL_secureValue.translation);
                    }
                    org.telegram.ui.Cells.v9 v9Var3 = new org.telegram.ui.Cells.v9(context);
                    org.telegram.ui.ActionBar.r6.V(v9Var3.getTextView(), org.telegram.ui.ActionBar.k6.f28102p7, null);
                    org.telegram.ui.Cells.y N06 = org.telegram.ui.ActionBar.k6.N0(true);
                    org.telegram.ui.ActionBar.n6 N11 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27878d6);
                    org.telegram.ui.ActionBar.n6 N12 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27972i6);
                    v9Var3.setBackground(N06);
                    org.telegram.ui.ActionBar.r6.k(v9Var3, N06, N11, N12, null);
                    if (this.G == null) {
                        v9Var3.b(org.telegram.messenger.bd.M0(2131747595, null), false);
                    } else {
                        v9Var3.b(org.telegram.messenger.bd.M0(2131747600, null), false);
                    }
                    this.f52293d0.addView(v9Var3, b8.mf.o(-1, -2));
                    v9Var3.setOnClickListener(new ni0(this, 1));
                    org.telegram.ui.Cells.y8 y8Var6 = this.f52322r0;
                    int i27 = org.telegram.ui.ActionBar.k6.f27843b7;
                    org.telegram.ui.ActionBar.r6.a0(y8Var6, context, 2131231229, i27);
                    org.telegram.ui.Cells.x6 x6Var2 = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                    this.m0 = x6Var2;
                    org.telegram.ui.ActionBar.r6.a0(x6Var2, context, 2131231230, i27);
                    this.f52293d0.addView(this.m0, b8.mf.o(-1, -2));
                } else {
                    org.telegram.ui.ActionBar.r6.a0(this.f52322r0, context, 2131231230, org.telegram.ui.ActionBar.k6.f27843b7);
                }
                U1();
                c1(false);
                return;
            }
        }
    }

    public final void j1(android.content.Context r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yj0.j1(android.content.Context):void");
    }

    public final void k1(Context context) {
        String str;
        String str2;
        TelephonyManager telephonyManager;
        ViewGroup frameLayout;
        this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131747496, null));
        this.Z0 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.V0.add(0, split[2]);
                this.W0.put(split[2], split[0]);
                this.X0.put(split[0], split[2]);
                if (split.length > 3) {
                    this.Y0.put(split[0], split[3]);
                }
                this.Z0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        Collections.sort(this.V0, new vg.i1(1));
        String str3 = org.telegram.messenger.h10.i(this.currentAccount).f().phone;
        org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context);
        org.telegram.ui.ActionBar.r6.V(v9Var.getTextView(), org.telegram.ui.ActionBar.k6.f28121q6, null);
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
        int i3 = org.telegram.ui.ActionBar.k6.f27878d6;
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27972i6);
        v9Var.setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(v9Var, N0, N, N2, null);
        v9Var.b(org.telegram.messenger.bd.a0("PassportPhoneUseSame", null, 2131747492, mf.b.c().b("+" + str3)), false);
        this.f52293d0.addView(v9Var, b8.mf.o(-1, -2));
        v9Var.setOnClickListener(new ni0(this, 16));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
        this.f52315o0 = y8Var;
        org.telegram.ui.ActionBar.r6.a0(y8Var, context, 2131231230, org.telegram.ui.ActionBar.k6.f27843b7);
        this.f52315o0.setText(org.telegram.messenger.bd.M0(2131747490, null));
        this.f52293d0.addView(this.f52315o0, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        this.f52309k0 = n4Var;
        n4Var.setText(org.telegram.messenger.bd.M0(2131747493, null));
        org.telegram.ui.ActionBar.r6.i(i3, this.f52309k0, null);
        this.f52293d0.addView(this.f52309k0, b8.mf.o(-1, -2));
        this.Z = new EditTextBoldCursor[3];
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 2) {
                this.Z[i10] = new org.telegram.ui.Components.r20(context);
            } else {
                this.Z[i10] = new EditTextBoldCursor(context);
            }
            if (i10 == 1) {
                frameLayout = org.telegram.messenger.k5.f(context, 0);
                this.f52293d0.addView(frameLayout, b8.mf.o(-1, 50));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, frameLayout, null);
            } else if (i10 == 2) {
                frameLayout = (ViewGroup) this.Z[1].getParent();
            } else {
                frameLayout = new FrameLayout(context);
                this.f52293d0.addView(frameLayout, b8.mf.o(-1, 50));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, frameLayout, null);
            }
            this.Z[i10].setTag(Integer.valueOf(i10));
            this.Z[i10].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.E(this.Z[i10], org.telegram.ui.ActionBar.k6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.Z[i10];
            int i11 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i11, null);
            this.Z[i10].setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.r6.w(this.Z[i10], i11, null);
            this.Z[i10].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.Z[i10].setCursorWidth(1.5f);
            if (i10 == 0) {
                this.Z[i10].setOnTouchListener(new oi0(this, 3));
                this.Z[i10].setText(org.telegram.messenger.bd.M0(2131752134, null));
                this.Z[i10].setInputType(0);
                this.Z[i10].setFocusable(false);
            } else {
                this.Z[i10].setInputType(3);
                if (i10 == 2) {
                    this.Z[i10].setImeOptions(268435462);
                } else {
                    this.Z[i10].setImeOptions(268435461);
                }
            }
            EditTextBoldCursor editTextBoldCursor2 = this.Z[i10];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            int i12 = 5;
            if (i10 == 1) {
                TextView textView = new TextView(context);
                this.f52337x0 = textView;
                textView.setText("+");
                org.telegram.ui.ActionBar.r6.V(this.f52337x0, i11, null);
                this.f52337x0.setTextSize(1, 16.0f);
                frameLayout.addView(this.f52337x0, b8.mf.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                this.Z[i10].setPadding(org.telegram.messenger.g0.L(10.0f), 0, 0, 0);
                this.Z[i10].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                this.Z[i10].setGravity(19);
                frameLayout.addView(this.Z[i10], b8.mf.k(0.0f, 12.0f, 16.0f, 6.0f, 55, -2));
                this.Z[i10].addTextChangedListener(new ij0(this, 1));
            } else if (i10 == 2) {
                this.Z[i10].setPadding(0, 0, 0, 0);
                this.Z[i10].setGravity(19);
                this.Z[i10].setHintText(null);
                this.Z[i10].setHint(org.telegram.messenger.bd.M0(2131747380, null));
                frameLayout.addView(this.Z[i10], b8.mf.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                this.Z[i10].addTextChangedListener(new wq(this, 3));
            } else {
                this.Z[i10].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                EditTextBoldCursor editTextBoldCursor3 = this.Z[i10];
                if (!org.telegram.messenger.bd.f21784a0) {
                    i12 = 3;
                }
                editTextBoldCursor3.setGravity(i12);
                frameLayout.addView(this.Z[i10], b8.mf.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            }
            this.Z[i10].setOnEditorActionListener(new li0(this, 0));
            if (i10 == 2) {
                this.Z[i10].setOnKeyListener(new vf(this, 1));
            }
            if (i10 == 0) {
                View view = new View(context);
                this.f52310l0.add(view);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27879d7, view, null);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
            }
        }
        try {
            telephonyManager = (TelephonyManager) org.telegram.messenger.t0.f25457b.getSystemService("phone");
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        if (telephonyManager != null) {
            str = telephonyManager.getSimCountryIso().toUpperCase();
            if (str != null && (str2 = (String) this.Z0.get(str)) != null && this.V0.indexOf(str2) != -1) {
                this.Z[1].setText((CharSequence) this.W0.get(str2));
            }
            org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context);
            this.f52315o0 = y8Var2;
            org.telegram.ui.ActionBar.r6.a0(y8Var2, context, 2131231230, org.telegram.ui.ActionBar.k6.f27843b7);
            this.f52315o0.setText(org.telegram.messenger.bd.M0(2131747494, null));
            this.f52293d0.addView(this.f52315o0, b8.mf.o(-1, -2));
        }
        str = null;
        if (str != null) {
            this.Z[1].setText((CharSequence) this.W0.get(str2));
        }
        org.telegram.ui.Cells.y8 y8Var22 = new org.telegram.ui.Cells.y8(context);
        this.f52315o0 = y8Var22;
        org.telegram.ui.ActionBar.r6.a0(y8Var22, context, 2131231230, org.telegram.ui.ActionBar.k6.f27843b7);
        this.f52315o0.setText(org.telegram.messenger.bd.M0(2131747494, null));
        this.f52293d0.addView(this.f52315o0, b8.mf.o(-1, -2));
    }

    public final byte[] m1(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32 || bArr2 == null || bArr2.length != 32) {
            return null;
        }
        byte[] bArr3 = new byte[32];
        System.arraycopy(this.f52300f1, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(this.f52300f1, 32, bArr4, 0, 16);
        byte[] bArr5 = new byte[32];
        System.arraycopy(this.f52294d1, 0, bArr5, 0, 32);
        Utilities.b(bArr5, bArr3, bArr4, 0, 32, 0, 0);
        if (!d1(bArr5, null)) {
            return null;
        }
        byte[] r5 = Utilities.r(bArr5, bArr2);
        byte[] bArr6 = new byte[32];
        System.arraycopy(r5, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(r5, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(bArr, 0, bArr8, 0, 32);
        Utilities.b(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        return bArr8;
    }

    public final void n1(final TLRPC.TL_secureRequiredType tL_secureRequiredType, final TLRPC.TL_secureRequiredType tL_secureRequiredType2, final ArrayList arrayList, final boolean z10, final mi0 mi0Var, final pi0 pi0Var, final boolean z11) {
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
                final yj0 yj0Var = yj0.this;
                final nj0 nj0Var = pi0Var;
                final boolean z12 = z11;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType3 = tL_secureRequiredType2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                final boolean z13 = z10;
                final ArrayList arrayList2 = arrayList;
                final Runnable runnable = mi0Var;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        String str;
                        TLRPC.TL_secureData tL_secureData;
                        String str2;
                        LinearLayout linearLayout;
                        yj0 yj0Var2 = yj0.this;
                        TLRPC.TL_error tL_error2 = tL_error;
                        String str3 = null;
                        if (tL_error2 != null) {
                            nj0 nj0Var2 = nj0Var;
                            if (nj0Var2 != null) {
                                nj0Var2.f(tL_error2.text, null);
                            }
                            yj0Var2.Q1(org.telegram.messenger.bd.M0(2131689472, null), tL_error2.text);
                            return;
                        }
                        boolean z14 = z12;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType3;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType4;
                        boolean z15 = z13;
                        if (z14) {
                            if (tL_secureRequiredType5 != null) {
                                yj0Var2.L1(tL_secureRequiredType5);
                            } else {
                                yj0Var2.L1(tL_secureRequiredType6);
                            }
                        } else {
                            if (z15) {
                                yj0Var2.L1(tL_secureRequiredType6);
                            }
                            yj0Var2.L1(tL_secureRequiredType5);
                        }
                        int i3 = 0;
                        if (yj0Var2.f52287b == 8) {
                            xj0 xj0Var = (xj0) yj0Var2.f52323r1.remove(tL_secureRequiredType6);
                            if (xj0Var != null) {
                                yj0Var2.f52293d0.removeView(xj0Var);
                                View childAt = yj0Var2.f52293d0.getChildAt(linearLayout.getChildCount() - 6);
                                if (childAt instanceof xj0) {
                                    ((xj0) childAt).setNeedDivider(false);
                                }
                            }
                            yj0Var2.V1();
                        } else {
                            ArrayList arrayList3 = arrayList2;
                            if (tL_secureRequiredType5 != null && arrayList3 != null && arrayList3.size() > 1) {
                                int size = arrayList3.size();
                                int i10 = 0;
                                while (true) {
                                    if (i10 < size) {
                                        TLRPC.TL_secureRequiredType tL_secureRequiredType7 = (TLRPC.TL_secureRequiredType) arrayList3.get(i10);
                                        TLRPC.TL_secureValue v12 = yj0Var2.v1(tL_secureRequiredType7, false);
                                        if (v12 != null) {
                                            TLRPC.TL_secureData tL_secureData2 = v12.data;
                                            if (tL_secureData2 != null) {
                                                str2 = yj0.l1(tL_secureData2.data, yj0Var2.m1(tL_secureData2.secret, tL_secureData2.data_hash), v12.data.data_hash);
                                            } else {
                                                str2 = null;
                                            }
                                            str = str2;
                                            tL_secureRequiredType5 = tL_secureRequiredType7;
                                        } else {
                                            i10++;
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
                                    i3 = arrayList3.size();
                                }
                                yj0Var2.P1(tL_secureRequiredType6, null, null, tL_secureRequiredType5, str, z14, i3);
                            } else {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType8 = tL_secureRequiredType5;
                                String str4 = str;
                                TLRPC.TL_secureValue v13 = yj0Var2.v1(tL_secureRequiredType6, false);
                                if (v13 != null && (tL_secureData = v13.data) != null) {
                                    str3 = yj0.l1(tL_secureData.data, yj0Var2.m1(tL_secureData.secret, tL_secureData.data_hash), v13.data.data_hash);
                                }
                                if (arrayList3 != null) {
                                    i3 = arrayList3.size();
                                }
                                yj0Var2.P1(tL_secureRequiredType6, null, str3, tL_secureRequiredType8, str4, z14, i3);
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

    public final b8.ke o1(byte[] bArr) {
        byte[] t12 = t1();
        int nextInt = Utilities.f21385b.nextInt(208) + 32;
        while ((bArr.length + nextInt) % 16 != 0) {
            nextInt++;
        }
        byte[] bArr2 = new byte[nextInt];
        Utilities.f21385b.nextBytes(bArr2);
        bArr2[0] = (byte) nextInt;
        int length = nextInt + bArr.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, nextInt);
        System.arraycopy(bArr, 0, bArr3, nextInt, bArr.length);
        byte[] o10 = Utilities.o(length, bArr3);
        byte[] r5 = Utilities.r(t12, o10);
        byte[] bArr4 = new byte[32];
        System.arraycopy(r5, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(r5, 32, bArr5, 0, 16);
        Utilities.b(bArr3, bArr4, bArr5, 0, length, 0, 1);
        byte[] bArr6 = new byte[32];
        System.arraycopy(this.f52300f1, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(this.f52300f1, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(this.f52294d1, 0, bArr8, 0, 32);
        Utilities.b(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        byte[] r9 = Utilities.r(bArr8, o10);
        byte[] bArr9 = new byte[32];
        System.arraycopy(r9, 0, bArr9, 0, 32);
        byte[] bArr10 = new byte[16];
        System.arraycopy(r9, 32, bArr10, 0, 16);
        byte[] bArr11 = new byte[32];
        System.arraycopy(t12, 0, bArr11, 0, 32);
        Utilities.b(bArr11, bArr9, bArr10, 0, 32, 0, 1);
        b8.ke keVar = new b8.ke(14);
        keVar.d = bArr3;
        keVar.f2716b = bArr11;
        keVar.f2718e = o10;
        keVar.f2717c = t12;
        keVar.f2719f = new org.telegram.messenger.xv(bArr4, bArr5);
        return keVar;
    }

    @Override
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        if (i10 == -1) {
            if (i3 != 0 && i3 != 2) {
                if (i3 == 1) {
                    if (intent != null && intent.getData() != null) {
                        ArrayList arrayList = new ArrayList();
                        ?? obj = new Object();
                        obj.f26475a = intent.getData();
                        arrayList.add(obj);
                        K1(arrayList);
                        return;
                    } else if (getParentActivity() != null) {
                        Toast.makeText(getParentActivity(), org.telegram.messenger.bd.M0(2131743843, null), 0).show();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            g1();
            org.telegram.ui.Components.bi biVar = this.S0;
            if (biVar != null) {
                biVar.f32215b2.j0(i3, intent, this.R0);
            }
            this.R0 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i3 = this.f52287b;
        if (i3 == 7) {
            if (z10) {
                int i10 = this.J1;
                org.telegram.ui.Components.vt0[] vt0VarArr = this.K1;
                vt0VarArr[i10].c(true);
                for (org.telegram.ui.Components.vt0 vt0Var : vt0VarArr) {
                    if (vt0Var != null) {
                        vt0Var.f();
                    }
                }
            }
        } else if (i3 != 0 && i3 != 5) {
            if (i3 == 1 || i3 == 2) {
                return !b1(z10);
            }
        } else if (z10) {
            a1(false);
        }
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        if (this.f52287b == 3 && dialog == this.M1) {
            ArrayList arrayList = this.N1;
            if (!arrayList.isEmpty()) {
                getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.U1);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.V1);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23280p0);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23293r0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.U1);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.V1);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23280p0);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23293r0);
        int i3 = 0;
        a1(false);
        org.telegram.ui.Components.bi biVar = this.S0;
        if (biVar != null) {
            biVar.K();
            this.S0.j1();
        }
        if (this.f52287b == 7) {
            while (true) {
                org.telegram.ui.Components.vt0[] vt0VarArr = this.K1;
                if (i3 >= vt0VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.vt0 vt0Var = vt0VarArr[i3];
                if (vt0Var != null) {
                    vt0Var.f();
                }
                i3++;
            }
            org.telegram.ui.ActionBar.s1 s1Var = this.L1;
            if (s1Var != null) {
                try {
                    s1Var.dismiss();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                this.L1 = null;
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.bi biVar = this.S0;
        if (biVar != null) {
            biVar.l1();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.bi biVar;
        org.telegram.ui.Cells.v9 v9Var;
        int i10 = this.f52287b;
        if ((i10 == 1 || i10 == 2) && (biVar = this.S0) != null) {
            if (i3 == 17) {
                biVar.f32215b2.W(false);
            } else if (i3 == 21) {
                if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = org.telegram.messenger.bd.M0(2131689472, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = M0;
                    s1Var.U = org.telegram.messenger.bd.M0(2131747320, null);
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747308, null), new pi0(this, 0));
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                    alertDialog$Builder.p();
                }
            } else if (i3 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                J1(0);
            } else if (i3 == 22 && iArr != null && iArr.length > 0 && iArr[0] == 0 && (v9Var = this.f52325s0) != null) {
                v9Var.callOnClick();
            }
        } else if (i10 == 3 && i3 == 6) {
            S1(false, this.F1, this.G1, this.H1, this.I1);
        }
    }

    @Override
    public final void onResume() {
        ViewGroup[] viewGroupArr;
        ViewGroup viewGroup;
        super.onResume();
        org.telegram.ui.Components.bi biVar = this.S0;
        if (biVar != null) {
            biVar.m1();
        }
        if (this.f52287b == 5 && (viewGroupArr = this.f52285a0) != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
            this.Z[0].requestFocus();
            org.telegram.messenger.g0.K3(this.Z[0]);
            org.telegram.messenger.g0.i3(new mi0(this, 0), 200L);
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yj0.onThemeColorsChanged():void");
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (this.f52306i1 != null) {
            org.telegram.messenger.g0.h3(new mi0(this, 1));
        }
        int i3 = this.f52287b;
        if (i3 == 5) {
            if (z10) {
                if (this.f52285a0[0].getVisibility() == 0) {
                    this.Z[0].requestFocus();
                    org.telegram.messenger.g0.K3(this.Z[0]);
                }
                if (this.O0 == 2) {
                    F1(false);
                }
            }
        } else if (i3 == 7) {
            if (z10) {
                this.K1[this.J1].j();
            }
        } else if (i3 == 4) {
            if (z10) {
                this.Z[0].requestFocus();
                org.telegram.messenger.g0.K3(this.Z[0]);
            }
        } else if (i3 == 6) {
            if (z10) {
                this.Z[0].requestFocus();
                org.telegram.messenger.g0.K3(this.Z[0]);
            }
        } else if (i3 != 2 && i3 != 1) {
        } else {
            g1();
        }
    }

    public final void p1(Bundle bundle, TLRPC.TL_auth_sentCode tL_auth_sentCode, boolean z10) {
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
            O1(bundle, 2, z10);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", tL_auth_sentCode.type.pattern);
            O1(bundle, 1, z10);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSms) {
            bundle.putInt("type", 2);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            O1(bundle, 0, z10);
        }
    }

    public final String q1() {
        StringBuilder sb2 = new StringBuilder();
        int i3 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.Z;
            if (i3 >= editTextBoldCursorArr.length) {
                break;
            }
            sb2.append((CharSequence) editTextBoldCursorArr[i3].getText());
            sb2.append(",");
            i3++;
        }
        if (this.f52288b0 != null) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.f52288b0;
                if (i10 >= editTextBoldCursorArr2.length) {
                    break;
                }
                sb2.append((CharSequence) editTextBoldCursorArr2[i10].getText());
                sb2.append(",");
                i10++;
            }
        }
        ArrayList arrayList = this.f52308j1;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            sb2.append(((org.telegram.messenger.wv) arrayList.get(i11)).f26263b.f27138id);
        }
        org.telegram.messenger.wv wvVar = this.m1;
        if (wvVar != null) {
            sb2.append(wvVar.f26263b.f27138id);
        }
        org.telegram.messenger.wv wvVar2 = this.f52314n1;
        if (wvVar2 != null) {
            sb2.append(wvVar2.f26263b.f27138id);
        }
        org.telegram.messenger.wv wvVar3 = this.k1;
        if (wvVar3 != null) {
            sb2.append(wvVar3.f26263b.f27138id);
        }
        ArrayList arrayList2 = this.f52311l1;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            sb2.append(((org.telegram.messenger.wv) arrayList2.get(i12)).f26263b.f27138id);
        }
        return sb2.toString();
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.R0 = bundle.getString("path");
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.R0;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final TLRPC.TL_secureValue v1(TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z10) {
        String[] strArr;
        if (tL_secureRequiredType != null) {
            int size = this.E.values.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.TL_secureValue tL_secureValue = this.E.values.get(i3);
                if (tL_secureRequiredType.type.getClass() == tL_secureValue.type.getClass()) {
                    if (z10) {
                        if (!tL_secureRequiredType.selfie_required || (tL_secureValue.selfie instanceof TLRPC.TL_secureFile)) {
                            if (!tL_secureRequiredType.translation_required || !tL_secureValue.translation.isEmpty()) {
                                if (!x1(tL_secureRequiredType.type) || !tL_secureValue.files.isEmpty()) {
                                    if (!z1(tL_secureRequiredType.type) || (tL_secureValue.front_side instanceof TLRPC.TL_secureFile)) {
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
                                                    JSONObject jSONObject = new JSONObject(l1(tL_secureData.data, m1(tL_secureData.secret, tL_secureData.data_hash), tL_secureValue.data.data_hash));
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

    public final boolean w1(Class cls) {
        int size = this.E.values.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.E.values.get(i3).type.getClass() == cls) {
                return false;
            }
        }
        return true;
    }

    public final boolean y1() {
        String str = this.f52284a;
        if (str != null && !str.equals(q1())) {
            return false;
        }
        return true;
    }

    public yj0(int i3, long j10, String str, String str2, String str3, String str4, String str5, TL_account.authorizationForm authorizationform, TL_account.Password password) {
        this(i3, authorizationform, password, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (HashMap) null, (HashMap) null);
        int i10;
        String s12;
        String str6;
        String str7;
        String str8;
        String str9;
        this.f52290c = j10;
        this.d = str3;
        this.f52295e = str4;
        this.h = str;
        this.f52321r = str2;
        this.f52312n = str5;
        if (i3 != 0 || authorizationform.errors.isEmpty()) {
            return;
        }
        try {
            Collections.sort(authorizationform.errors, new fj0(this));
            int size = authorizationform.errors.size();
            int i11 = 0;
            while (i11 < size) {
                TLRPC.SecureValueError secureValueError = authorizationform.errors.get(i11);
                byte[] bArr = null;
                if (secureValueError instanceof TLRPC.TL_secureValueErrorFrontSide) {
                    TLRPC.TL_secureValueErrorFrontSide tL_secureValueErrorFrontSide = (TLRPC.TL_secureValueErrorFrontSide) secureValueError;
                    s12 = s1(tL_secureValueErrorFrontSide.type);
                    str6 = tL_secureValueErrorFrontSide.text;
                    bArr = tL_secureValueErrorFrontSide.file_hash;
                    str7 = null;
                    str8 = "front";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorReverseSide) {
                    TLRPC.TL_secureValueErrorReverseSide tL_secureValueErrorReverseSide = (TLRPC.TL_secureValueErrorReverseSide) secureValueError;
                    s12 = s1(tL_secureValueErrorReverseSide.type);
                    str6 = tL_secureValueErrorReverseSide.text;
                    bArr = tL_secureValueErrorReverseSide.file_hash;
                    str7 = null;
                    str8 = "reverse";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorSelfie) {
                    TLRPC.TL_secureValueErrorSelfie tL_secureValueErrorSelfie = (TLRPC.TL_secureValueErrorSelfie) secureValueError;
                    s12 = s1(tL_secureValueErrorSelfie.type);
                    str6 = tL_secureValueErrorSelfie.text;
                    bArr = tL_secureValueErrorSelfie.file_hash;
                    str7 = null;
                    str8 = "selfie";
                } else {
                    if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFile) {
                        TLRPC.TL_secureValueErrorTranslationFile tL_secureValueErrorTranslationFile = (TLRPC.TL_secureValueErrorTranslationFile) secureValueError;
                        s12 = s1(tL_secureValueErrorTranslationFile.type);
                        str6 = tL_secureValueErrorTranslationFile.text;
                        bArr = tL_secureValueErrorTranslationFile.file_hash;
                        str7 = null;
                    } else if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFiles) {
                        TLRPC.TL_secureValueErrorTranslationFiles tL_secureValueErrorTranslationFiles = (TLRPC.TL_secureValueErrorTranslationFiles) secureValueError;
                        s12 = s1(tL_secureValueErrorTranslationFiles.type);
                        str6 = tL_secureValueErrorTranslationFiles.text;
                        str7 = null;
                    } else {
                        if (secureValueError instanceof TLRPC.TL_secureValueErrorFile) {
                            TLRPC.TL_secureValueErrorFile tL_secureValueErrorFile = (TLRPC.TL_secureValueErrorFile) secureValueError;
                            s12 = s1(tL_secureValueErrorFile.type);
                            str6 = tL_secureValueErrorFile.text;
                            bArr = tL_secureValueErrorFile.file_hash;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueErrorFiles) {
                            TLRPC.TL_secureValueErrorFiles tL_secureValueErrorFiles = (TLRPC.TL_secureValueErrorFiles) secureValueError;
                            s12 = s1(tL_secureValueErrorFiles.type);
                            str6 = tL_secureValueErrorFiles.text;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueError) {
                            TLRPC.TL_secureValueError tL_secureValueError = (TLRPC.TL_secureValueError) secureValueError;
                            s12 = s1(tL_secureValueError.type);
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
                                        s12 = s1(tL_secureValueErrorData.type);
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
                HashMap hashMap = (HashMap) this.f52332v1.get(s12);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    i10 = size;
                    this.f52332v1.put(s12, hashMap);
                    this.f52335w1.put(s12, str6);
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
