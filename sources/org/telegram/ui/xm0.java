package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
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
import android.text.method.PasswordTransformationMethod;
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
import java.util.Iterator;
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
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SecureDocumentKey;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class xm0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final TLRPC.TL_secureRequiredType A;
    public TextView A0;
    public String A1;
    public TLRPC.TL_secureRequiredType B;
    public org.telegram.ui.Components.az B0;
    public Runnable B1;
    public ArrayList C;
    public org.telegram.ui.Cells.x8 C0;
    public mm0 C1;
    public final TLRPC.TL_secureValue D;
    public org.telegram.ui.Cells.x8 D0;
    public om0 D1;
    public final TLRPC.TL_secureValue E;
    public ImageView E0;
    public int E1;
    public TL_account.Password F;
    public TextView F0;
    public final org.telegram.ui.Components.ev0[] F1;
    public TLRPC.TL_auth_sentCode G;
    public TextView G0;
    public org.telegram.ui.ActionBar.b2 G1;
    public org.telegram.ui.ActionBar.v0 H;
    public FrameLayout H0;
    public Dialog H1;
    public AnimatorSet I;
    public TextView I0;
    public final ArrayList I1;
    public org.telegram.ui.Components.hq J;
    public int J0;
    public TextView K;
    public final byte[] K0;
    public org.telegram.ui.Components.hq L;
    public final byte[] L0;
    public FrameLayout M;
    public String M0;
    public org.telegram.ui.Cells.x9 N;
    public org.telegram.ui.Components.gi N0;
    public View O;
    public int O0;
    public View P;
    public int P0;
    public org.telegram.ui.Cells.w8 Q;
    public final ArrayList Q0;
    public org.telegram.ui.Cells.w8 R;
    public final HashMap R0;
    public org.telegram.ui.Cells.w8 S;
    public final HashMap S0;
    public org.telegram.ui.Cells.x9 T;
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

    public String f44479a;

    public LinearLayout f44480a0;

    public byte[] f44481a1;

    public final int f44482b;

    public LinearLayout f44483b0;

    public boolean f44484b1;

    public long f44485c;

    public LinearLayout f44486c0;

    public boolean f44487c1;
    public final String d;

    public LinearLayout f44488d0;

    public xm0 f44489d1;

    public final String f44490e;

    public LinearLayout f44491e0;

    public final ArrayList f44492e1;

    public boolean f44493f;

    public org.telegram.ui.Cells.j4 f44494f0;

    public SecureDocument f44495f1;

    public final ArrayList f44496g0;

    public final ArrayList f44497g1;
    public final String h;

    public org.telegram.ui.Cells.w6 f44498h0;

    public SecureDocument f44499h1;

    public org.telegram.ui.Cells.w6 f44500i0;

    public SecureDocument f44501i1;

    public org.telegram.ui.Cells.x8 f44502j0;

    public final HashMap f44503j1;

    public org.telegram.ui.Cells.x8 f44504k0;

    public final HashMap f44505k1;

    public org.telegram.ui.Cells.x8 f44506l0;
    public final HashMap l1;
    public org.telegram.ui.Cells.x8 m0;

    public final HashMap f44507m1;

    public final String f44508n;

    public org.telegram.ui.Cells.x9 f44509n0;

    public final HashMap f44510n1;

    public int f44511o0;

    public final HashMap f44512o1;

    public final boolean[] f44513p0;

    public final HashMap f44514p1;

    public boolean f44515q0;

    public final HashMap f44516q1;

    public final String f44517r;

    public boolean f44518r0;

    public final HashMap f44519r1;

    public String f44520s;

    public TextView f44521s0;

    public HashMap f44522s1;

    public org.telegram.ui.Cells.x9 f44523t0;

    public HashMap f44524t1;

    public org.telegram.ui.Cells.x9 f44525u0;

    public final HashMap f44526u1;
    public String v;

    public org.telegram.ui.Cells.w6 f44527v0;

    public String f44528v1;

    public String f44529w;

    public LinearLayout f44530w0;

    public String f44531w1;

    public final int[] f44532x;

    public ImageView f44533x0;

    public om0 f44534x1;

    public TL_account.authorizationForm f44535y;

    public TextView f44536y0;

    public boolean f44537y1;

    public TextView f44538z0;

    public final xl0 f44539z1;

    public xm0(int i10, TL_account.authorizationForm authorizationform, TL_account.Password password, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureValue tL_secureValue, TLRPC.TL_secureRequiredType tL_secureRequiredType2, TLRPC.TL_secureValue tL_secureValue2, HashMap map, HashMap map2) {
        super(null);
        this.f44520s = "";
        this.v = "";
        this.f44532x = new int[3];
        this.f44496g0 = new ArrayList();
        this.f44513p0 = new boolean[3];
        this.f44515q0 = true;
        this.Q0 = new ArrayList();
        this.R0 = new HashMap();
        this.S0 = new HashMap();
        this.T0 = new HashMap();
        this.f44492e1 = new ArrayList();
        this.f44497g1 = new ArrayList();
        this.f44503j1 = new HashMap();
        this.f44505k1 = new HashMap();
        this.l1 = new HashMap();
        this.f44507m1 = new HashMap();
        this.f44510n1 = new HashMap();
        this.f44516q1 = new HashMap();
        this.f44519r1 = new HashMap();
        this.f44526u1 = new HashMap();
        this.f44539z1 = new xl0(this);
        this.f44482b = i10;
        this.f44535y = authorizationform;
        this.A = tL_secureRequiredType;
        if (tL_secureRequiredType != null) {
            this.f44515q0 = tL_secureRequiredType.native_names;
        }
        this.D = tL_secureValue;
        this.B = tL_secureRequiredType2;
        this.E = tL_secureValue2;
        this.F = password;
        this.f44512o1 = map;
        this.f44514p1 = map2;
        if (i10 == 3) {
            this.I1 = new ArrayList();
        } else if (i10 == 7) {
            this.F1 = new org.telegram.ui.Components.ev0[3];
        }
        if (map == null) {
            this.f44512o1 = new HashMap();
        }
        if (map2 == null) {
            this.f44514p1 = new HashMap();
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getPassportConfig, new jh.m5(15));
        }
    }

    public static int C0(xm0 xm0Var, String str) {
        xm0Var.getClass();
        str.getClass();
        switch (str) {
            case "residence_country_code":
                return 26;
            case "last_name_native":
            case "last_name":
                return 22;
            case "gender":
                return 24;
            case "street_line1":
                return 29;
            case "street_line2":
                return 30;
            case "first_name":
            case "first_name_native":
                return 20;
            case "city":
                return 32;
            case "state":
                return 33;
            case "middle_name":
            case "middle_name_native":
                return 21;
            case "expiry_date":
                return 28;
            case "document_no":
                return 27;
            case "birth_date":
                return 23;
            case "country_code":
                return 25;
            case "post_code":
                return 31;
            default:
                return 100;
        }
    }

    public static boolean D0(xm0 xm0Var) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        boolean z10;
        View view;
        ArrayList arrayList = xm0Var.f44497g1;
        ArrayList arrayList2 = xm0Var.f44492e1;
        HashMap map = xm0Var.f44503j1;
        HashMap map2 = xm0Var.f44526u1;
        if (xm0Var.B != null) {
            if (map2.containsKey("error_all") || map2.containsKey("error_document_all")) {
                xm0Var.z1(xm0Var.f44506l0);
                return true;
            }
            if (xm0Var.N != null) {
                if (arrayList2.isEmpty()) {
                    xm0Var.z1(xm0Var.N);
                    return true;
                }
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    SecureDocument secureDocument = (SecureDocument) arrayList2.get(i10);
                    String str = "files" + n1(secureDocument);
                    if (str != null && map2.containsKey(str)) {
                        xm0Var.z1((View) map.get(secureDocument));
                        return true;
                    }
                }
            }
            if (map2.containsKey("files_all") || map2.containsKey("translation_all")) {
                xm0Var.z1(xm0Var.f44502j0);
                return true;
            }
            View view2 = xm0Var.Q;
            if (view2 != null) {
                if (xm0Var.f44499h1 == null) {
                    xm0Var.z1(view2);
                    return true;
                }
                if (map2.containsKey("front" + n1(xm0Var.f44499h1))) {
                    xm0Var.z1((View) map.get(xm0Var.f44499h1));
                    return true;
                }
            }
            TLRPC.SecureValueType secureValueType = xm0Var.B.type;
            if (((secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) || (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense)) && (view = xm0Var.R) != null) {
                if (xm0Var.f44501i1 == null) {
                    xm0Var.z1(view);
                    return true;
                }
                if (map2.containsKey("reverse" + n1(xm0Var.f44501i1))) {
                    xm0Var.z1((View) map.get(xm0Var.f44501i1));
                    return true;
                }
            }
            View view3 = xm0Var.S;
            if (view3 != null && xm0Var.f44485c != 0) {
                if (xm0Var.f44495f1 == null) {
                    xm0Var.z1(view3);
                    return true;
                }
                if (map2.containsKey("selfie" + n1(xm0Var.f44495f1))) {
                    xm0Var.z1((View) map.get(xm0Var.f44495f1));
                    return true;
                }
            }
            if (xm0Var.T != null && xm0Var.f44485c != 0) {
                if (arrayList.isEmpty()) {
                    xm0Var.z1(xm0Var.T);
                    return true;
                }
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    SecureDocument secureDocument2 = (SecureDocument) arrayList.get(i11);
                    if (map2.containsKey("translation" + n1(secureDocument2))) {
                        xm0Var.z1((View) map.get(secureDocument2));
                        return true;
                    }
                }
            }
        }
        for (int i12 = 0; i12 < 2; i12++) {
            if (i12 == 0) {
                editTextBoldCursorArr = xm0Var.U;
            } else {
                org.telegram.ui.Cells.x8 x8Var = xm0Var.m0;
                editTextBoldCursorArr = (x8Var == null || x8Var.getVisibility() != 0) ? null : xm0Var.W;
            }
            if (editTextBoldCursorArr != null) {
                int i13 = 0;
                while (i13 < editTextBoldCursorArr.length) {
                    boolean zHasErrorText = editTextBoldCursorArr[i13].hasErrorText();
                    if (!map2.isEmpty()) {
                        TLRPC.SecureValueType secureValueType2 = xm0Var.A.type;
                        String str2 = "country_code";
                        if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                            if (i12 == 0) {
                                switch (i13) {
                                    case 0:
                                        str2 = "first_name";
                                        break;
                                    case 1:
                                        str2 = "middle_name";
                                        break;
                                    case 2:
                                        str2 = "last_name";
                                        break;
                                    case 3:
                                        str2 = "birth_date";
                                        break;
                                    case 4:
                                        str2 = "gender";
                                        break;
                                    case 5:
                                        break;
                                    case 6:
                                        str2 = "residence_country_code";
                                        break;
                                    case 7:
                                        str2 = "document_no";
                                        break;
                                    case 8:
                                        str2 = "expiry_date";
                                        break;
                                    default:
                                        str2 = null;
                                        break;
                                }
                            } else if (i13 == 0) {
                                str2 = "first_name_native";
                            } else if (i13 != 1) {
                                str2 = i13 != 2 ? null : "last_name_native";
                            } else {
                                str2 = "middle_name_native";
                            }
                        } else if (!(secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress)) {
                            str2 = null;
                        } else if (i13 == 0) {
                            str2 = "street_line1";
                        } else if (i13 == 1) {
                            str2 = "street_line2";
                        } else if (i13 == 2) {
                            str2 = "post_code";
                        } else if (i13 == 3) {
                            str2 = "city";
                        } else if (i13 == 4) {
                            str2 = "state";
                        } else if (i13 != 5) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            String str3 = (String) map2.get(str2);
                            if (!TextUtils.isEmpty(str3) && str3.equals(editTextBoldCursorArr[i13].getText().toString())) {
                                zHasErrorText = true;
                            }
                        }
                    }
                    if (!xm0Var.f44518r0 || xm0Var.B == null || i13 >= 7) {
                        if (!zHasErrorText) {
                            int length = editTextBoldCursorArr[i13].length();
                            int i14 = xm0Var.f44482b;
                            if (i14 != 1) {
                                if (i14 == 2) {
                                    if (i13 == 1) {
                                        continue;
                                    } else if (i13 == 3) {
                                        if (length < 2) {
                                            zHasErrorText = true;
                                        }
                                    } else if (i13 == 4) {
                                        if (!"US".equals(xm0Var.f44520s)) {
                                            continue;
                                        } else if (length < 2) {
                                            zHasErrorText = true;
                                        }
                                    } else if (i13 == 2 && (length < 2 || length > 10)) {
                                        zHasErrorText = true;
                                    }
                                }
                                z10 = false;
                                if (!zHasErrorText) {
                                    zHasErrorText = true;
                                }
                                if (zHasErrorText) {
                                    xm0Var.z1(editTextBoldCursorArr[i13]);
                                    return true;
                                }
                            } else if (i13 != 8) {
                                if ((i12 == 0 && (i13 == 0 || i13 == 2 || i13 == 1)) || (i12 == 1 && (i13 == 0 || i13 == 1 || i13 == 2))) {
                                    if (length > 255) {
                                        zHasErrorText = true;
                                    }
                                    if ((i12 == 0 && i13 == 1) || (i12 == 1 && i13 == 1)) {
                                        z10 = true;
                                    }
                                    if (!zHasErrorText && !z10 && length == 0) {
                                        zHasErrorText = true;
                                    }
                                    if (zHasErrorText) {
                                        xm0Var.z1(editTextBoldCursorArr[i13]);
                                        return true;
                                    }
                                } else if (i13 == 7 && length > 24) {
                                    zHasErrorText = true;
                                }
                                z10 = false;
                                if (!zHasErrorText) {
                                    zHasErrorText = true;
                                }
                                if (zHasErrorText) {
                                    xm0Var.z1(editTextBoldCursorArr[i13]);
                                    return true;
                                }
                            } else {
                                continue;
                            }
                        } else if (zHasErrorText) {
                            xm0Var.z1(editTextBoldCursorArr[i13]);
                            return true;
                        }
                    }
                    i13++;
                }
            }
        }
        return false;
    }

    public static void J0(xm0 xm0Var, EditTextBoldCursor editTextBoldCursor, String str, Editable editable, boolean z10) {
        String str2;
        String str3;
        String str4;
        HashMap map = xm0Var.f44526u1;
        if (map == null || (str2 = (String) map.get(str)) == null || !TextUtils.equals(str2, editable)) {
            editTextBoldCursor.setErrorText(null);
        } else {
            HashMap map2 = xm0Var.f44522s1;
            if (map2 == null || (str4 = (String) map2.get(str)) == null) {
                HashMap map3 = xm0Var.f44524t1;
                if (map3 != null && (str3 = (String) map3.get(str)) != null) {
                    editTextBoldCursor.setErrorText(str3);
                }
            } else {
                editTextBoldCursor.setErrorText(str4);
            }
        }
        String str5 = z10 ? "error_document_all" : "error_all";
        if (map == null || !map.containsKey(str5)) {
            return;
        }
        map.remove(str5);
        xm0Var.a1(false);
    }

    public static void U(xm0 xm0Var, TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery) {
        TL_account.Password password = xm0Var.F;
        password.email_unconfirmed_pattern = tL_auth_passwordRecovery.email_pattern;
        xm0Var.presentFragment(new zf1(xm0Var.currentAccount, 4, password));
    }

    public static void V(xm0 xm0Var) {
        ArrayList arrayList;
        int i10;
        int i11;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        HashMap map = xm0Var.f44510n1;
        HashMap map2 = xm0Var.f44507m1;
        String str = xm0Var.f44517r;
        ArrayList arrayList2 = new ArrayList();
        int size = xm0Var.f44535y.required_types.size();
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.SecureRequiredType secureRequiredType = xm0Var.f44535y.required_types.get(i12);
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
                                if (i13 >= size2) {
                                    tL_secureRequiredType = tL_secureRequiredType4;
                                    break;
                                }
                                TLRPC.SecureRequiredType secureRequiredType3 = tL_secureRequiredTypeOneOf.types.get(i13);
                                if (secureRequiredType3 instanceof TLRPC.TL_secureRequiredType) {
                                    TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) secureRequiredType3;
                                    if (xm0Var.r1(tL_secureRequiredType5, true) != null) {
                                        tL_secureRequiredType = tL_secureRequiredType5;
                                        break;
                                    }
                                }
                                i13++;
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
            TLRPC.TL_secureValue tL_secureValueR1 = xm0Var.r1(tL_secureRequiredType, true);
            if (tL_secureValueR1 == null) {
                Vibrator vibrator = (Vibrator) xm0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                wm0 wm0Var = (wm0) map2.get(tL_secureRequiredType);
                if (wm0Var == null && (tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) map.get(tL_secureRequiredType)) != null) {
                    wm0Var = (wm0) map2.get(tL_secureRequiredType2);
                }
                AndroidUtilities.shakeView(wm0Var);
                return;
            }
            HashMap map3 = (HashMap) xm0Var.f44516q1.get(o1(tL_secureRequiredType.type));
            if (map3 != null && !map3.isEmpty()) {
                Vibrator vibrator2 = (Vibrator) xm0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                wm0 wm0Var2 = (wm0) map2.get(tL_secureRequiredType);
                if (wm0Var2 == null && (tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) map.get(tL_secureRequiredType)) != null) {
                    wm0Var2 = (wm0) map2.get(tL_secureRequiredType3);
                }
                AndroidUtilities.shakeView(wm0Var2);
                return;
            }
            boolean z10 = tL_secureRequiredType.selfie_required;
            boolean z11 = tL_secureRequiredType.translation_required;
            yl0 yl0Var = new yl0();
            yl0Var.f44844a = tL_secureValueR1;
            yl0Var.f44845b = z10;
            yl0Var.f44846c = z11;
            arrayList2.add(yl0Var);
        }
        xm0Var.N1(false, true);
        TL_account.acceptAuthorization acceptauthorization = new TL_account.acceptAuthorization();
        acceptauthorization.bot_id = xm0Var.f44485c;
        acceptauthorization.scope = xm0Var.h;
        acceptauthorization.public_key = str;
        JSONObject jSONObject = new JSONObject();
        int size3 = arrayList2.size();
        int i14 = 0;
        while (i14 < size3) {
            yl0 yl0Var2 = (yl0) arrayList2.get(i14);
            TLRPC.TL_secureValue tL_secureValue = yl0Var2.f44844a;
            JSONObject jSONObject2 = new JSONObject();
            TLRPC.SecurePlainData securePlainData = tL_secureValue.plain_data;
            if (securePlainData == null) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    TLRPC.TL_secureData tL_secureData = tL_secureValue.data;
                    if (tL_secureData != null) {
                        byte[] bArrI1 = xm0Var.i1(tL_secureData.secret, tL_secureData.data_hash);
                        arrayList = arrayList2;
                        try {
                            jSONObject2.put("data_hash", Base64.encodeToString(tL_secureValue.data.data_hash, 2));
                            jSONObject2.put("secret", Base64.encodeToString(bArrI1, 2));
                            jSONObject3.put("data", jSONObject2);
                        } catch (Exception unused) {
                            i10 = size3;
                        }
                    } else {
                        arrayList = arrayList2;
                    }
                    if (tL_secureValue.files.isEmpty()) {
                        i10 = size3;
                        i11 = i14;
                    } else {
                        JSONArray jSONArray = new JSONArray();
                        int i15 = 0;
                        for (int size4 = tL_secureValue.files.size(); i15 < size4; size4 = size4) {
                            TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) tL_secureValue.files.get(i15);
                            i10 = size3;
                            try {
                                i11 = i14;
                                try {
                                    byte[] bArrI2 = xm0Var.i1(tL_secureFile.secret, tL_secureFile.file_hash);
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("file_hash", Base64.encodeToString(tL_secureFile.file_hash, 2));
                                    jSONObject4.put("secret", Base64.encodeToString(bArrI2, 2));
                                    jSONArray.put(jSONObject4);
                                    i15++;
                                    size3 = i10;
                                    i14 = i11;
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                                i11 = i14;
                            }
                        }
                        i10 = size3;
                        i11 = i14;
                        jSONObject3.put("files", jSONArray);
                    }
                    TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                    if (secureFile instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile;
                        byte[] bArrI3 = xm0Var.i1(tL_secureFile2.secret, tL_secureFile2.file_hash);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("file_hash", Base64.encodeToString(tL_secureFile2.file_hash, 2));
                        jSONObject5.put("secret", Base64.encodeToString(bArrI3, 2));
                        jSONObject3.put("front_side", jSONObject5);
                    }
                    TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile2;
                        byte[] bArrI4 = xm0Var.i1(tL_secureFile3.secret, tL_secureFile3.file_hash);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("file_hash", Base64.encodeToString(tL_secureFile3.file_hash, 2));
                        jSONObject6.put("secret", Base64.encodeToString(bArrI4, 2));
                        jSONObject3.put("reverse_side", jSONObject6);
                    }
                    if (yl0Var2.f44845b) {
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile3;
                            byte[] bArrI5 = xm0Var.i1(tL_secureFile4.secret, tL_secureFile4.file_hash);
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("file_hash", Base64.encodeToString(tL_secureFile4.file_hash, 2));
                            jSONObject7.put("secret", Base64.encodeToString(bArrI5, 2));
                            jSONObject3.put("selfie", jSONObject7);
                        }
                    }
                    if (yl0Var2.f44846c && !tL_secureValue.translation.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        int size5 = tL_secureValue.translation.size();
                        for (int i16 = 0; i16 < size5; i16++) {
                            TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) tL_secureValue.translation.get(i16);
                            byte[] bArrI6 = xm0Var.i1(tL_secureFile5.secret, tL_secureFile5.file_hash);
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("file_hash", Base64.encodeToString(tL_secureFile5.file_hash, 2));
                            jSONObject8.put("secret", Base64.encodeToString(bArrI6, 2));
                            jSONArray2.put(jSONObject8);
                        }
                        jSONObject3.put("translation", jSONArray2);
                    }
                    jSONObject.put(o1(tL_secureValue.type), jSONObject3);
                } catch (Exception unused4) {
                    arrayList = arrayList2;
                }
                TLRPC.TL_secureValueHash tL_secureValueHash = new TLRPC.TL_secureValueHash();
                tL_secureValueHash.type = tL_secureValue.type;
                tL_secureValueHash.hash = tL_secureValue.hash;
                acceptauthorization.value_hashes.add(tL_secureValueHash);
                i14 = i11 + 1;
                arrayList2 = arrayList;
                size3 = i10;
            } else if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
            } else if (securePlainData instanceof TLRPC.TL_securePlainPhone) {
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
        Object obj = xm0Var.d;
        if (obj != null) {
            try {
                jSONObject9.put("payload", obj);
            } catch (Exception unused6) {
            }
        }
        Object obj2 = xm0Var.f44490e;
        if (obj2 != null) {
            try {
                jSONObject9.put("nonce", obj2);
            } catch (Exception unused7) {
            }
        }
        af.h hVarK1 = xm0Var.k1(AndroidUtilities.getStringBytes(jSONObject9.toString()));
        TLRPC.TL_secureCredentialsEncrypted tL_secureCredentialsEncrypted = new TLRPC.TL_secureCredentialsEncrypted();
        acceptauthorization.credentials = tL_secureCredentialsEncrypted;
        tL_secureCredentialsEncrypted.hash = (byte[]) hVarK1.d;
        tL_secureCredentialsEncrypted.data = (byte[]) hVarK1.f276c;
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", ""), 0)));
            Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, rSAPublicKey);
            acceptauthorization.credentials.secret = cipher.doFinal((byte[]) hVarK1.f275b);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        ConnectionsManager.getInstance(xm0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(xm0Var.currentAccount).sendRequest(acceptauthorization, new ll0(xm0Var, 1)), xm0Var.classGuid);
    }

    public static void W(xm0 xm0Var, TLRPC.TL_error tL_error, String str, om0 om0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        if (tL_error != null) {
            org.telegram.ui.Components.y4.f0(xm0Var.currentAccount, tL_error, xm0Var, sendverifyphonecode, str);
            return;
        }
        HashMap map = new HashMap();
        map.put("phone", str);
        xm0 xm0Var2 = new xm0(7, xm0Var.f44535y, xm0Var.F, xm0Var.A, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, map, (HashMap) null);
        xm0Var2.currentAccount = xm0Var.currentAccount;
        xm0Var2.f44481a1 = xm0Var.f44481a1;
        xm0Var2.Y0 = xm0Var.Y0;
        xm0Var2.f44534x1 = om0Var;
        xm0Var2.G = (TLRPC.TL_auth_sentCode) tLObject;
        xm0Var.presentFragment(xm0Var2, true);
    }

    public static void X(xm0 xm0Var, SecureDocument secureDocument, int i10) {
        HashMap map = xm0Var.f44503j1;
        int i11 = xm0Var.O0;
        if (i11 == 1) {
            SecureDocument secureDocument2 = xm0Var.f44495f1;
            if (secureDocument2 != null) {
                vm0 vm0Var = (vm0) map.remove(secureDocument2);
                if (vm0Var != null) {
                    xm0Var.f44486c0.removeView(vm0Var);
                }
                xm0Var.f44495f1 = null;
            }
        } else if (i11 == 4) {
            if (xm0Var.f44497g1.size() >= 20) {
                return;
            }
        } else if (i11 == 2) {
            SecureDocument secureDocument3 = xm0Var.f44499h1;
            if (secureDocument3 != null) {
                vm0 vm0Var2 = (vm0) map.remove(secureDocument3);
                if (vm0Var2 != null) {
                    xm0Var.f44480a0.removeView(vm0Var2);
                }
                xm0Var.f44499h1 = null;
            }
        } else if (i11 == 3) {
            SecureDocument secureDocument4 = xm0Var.f44501i1;
            if (secureDocument4 != null) {
                vm0 vm0Var3 = (vm0) map.remove(secureDocument4);
                if (vm0Var3 != null) {
                    xm0Var.f44483b0.removeView(vm0Var3);
                }
                xm0Var.f44501i1 = null;
            }
        } else if (i11 == 0 && xm0Var.f44492e1.size() >= 20) {
            return;
        }
        xm0Var.f44505k1.put(secureDocument.path, secureDocument);
        xm0Var.H.setEnabled(false);
        xm0Var.H.setAlpha(0.5f);
        FileLoader.getInstance(xm0Var.currentAccount).uploadFile(secureDocument.path, false, true, 16777216);
        xm0Var.R0(secureDocument, i10);
        xm0Var.S1(i10);
    }

    public static void Y(xm0 xm0Var, boolean z10, String str) {
        byte[] bArr;
        byte[] x8;
        km0 km0Var;
        TL_account.Password password;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo;
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRPStartCheck;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        if (!z10) {
            if (xm0Var.F.current_algo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                x8 = SRPHelper.getX(AndroidUtilities.getStringBytes(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) xm0Var.F.current_algo);
            } else {
                bArr = null;
            }
            km0Var = new km0(xm0Var, z10, bArr, getpasswordsettings, str);
            password = xm0Var.F;
            passwordKdfAlgo = password.current_algo;
            if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "PASSWORD_HASH_INVALID";
                km0Var.run(null, tL_error);
                return;
            }
            tL_inputCheckPasswordSRPStartCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
            getpasswordsettings.password = tL_inputCheckPasswordSRPStartCheck;
            if (tL_inputCheckPasswordSRPStartCheck == null) {
                ConnectionsManager.getInstance(xm0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(xm0Var.currentAccount).sendRequest(getpasswordsettings, km0Var, 10), xm0Var.classGuid);
            } else {
                TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                tL_error2.text = "ALGO_INVALID";
                km0Var.run(null, tL_error2);
            }
        }
        x8 = xm0Var.K0;
        bArr = x8;
        km0Var = new km0(xm0Var, z10, bArr, getpasswordsettings, str);
        password = xm0Var.F;
        passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_error tL_error3 = new TLRPC.TL_error();
            tL_error3.text = "PASSWORD_HASH_INVALID";
            km0Var.run(null, tL_error3);
            return;
        }
        tL_inputCheckPasswordSRPStartCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        getpasswordsettings.password = tL_inputCheckPasswordSRPStartCheck;
        if (tL_inputCheckPasswordSRPStartCheck == null) {
            ConnectionsManager.getInstance(xm0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(xm0Var.currentAccount).sendRequest(getpasswordsettings, km0Var, 10), xm0Var.classGuid);
        } else {
            TLRPC.TL_error tL_error4 = new TLRPC.TL_error();
            tL_error4.text = "ALGO_INVALID";
            km0Var.run(null, tL_error4);
        }
    }

    public static void Z(int i10, String str, SecureDocument secureDocument, vm0 vm0Var, xm0 xm0Var) {
        HashMap map = xm0Var.f44505k1;
        xm0Var.f44503j1.remove(secureDocument);
        if (i10 == 1) {
            xm0Var.f44495f1 = null;
            xm0Var.f44486c0.removeView(vm0Var);
        } else if (i10 == 4) {
            xm0Var.f44497g1.remove(secureDocument);
            xm0Var.f44488d0.removeView(vm0Var);
        } else if (i10 == 2) {
            xm0Var.f44499h1 = null;
            xm0Var.f44480a0.removeView(vm0Var);
        } else if (i10 == 3) {
            xm0Var.f44501i1 = null;
            xm0Var.f44483b0.removeView(vm0Var);
        } else {
            xm0Var.f44492e1.remove(secureDocument);
            xm0Var.Z.removeView(vm0Var);
        }
        if (str != null) {
            HashMap map2 = xm0Var.f44524t1;
            if (map2 != null) {
                map2.remove(str);
            }
            HashMap map3 = xm0Var.f44526u1;
            if (map3 != null) {
                map3.remove(str);
            }
        }
        xm0Var.S1(i10);
        String str2 = secureDocument.path;
        if (str2 == null || map.remove(str2) == null) {
            return;
        }
        if (map.isEmpty()) {
            xm0Var.H.setEnabled(true);
            xm0Var.H.setAlpha(1.0f);
        }
        FileLoader.getInstance(xm0Var.currentAccount).cancelFileUpload(secureDocument.path, false);
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
        return l10 == null || Utilities.bytesToLong(Utilities.computeSHA256(bArr)) == l10.longValue();
    }

    public static void a0(xm0 xm0Var) {
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        for (int i10 = 0; i10 < xm0Var.f44535y.values.size(); i10++) {
            deletesecurevalue.types.add(xm0Var.f44535y.values.get(i10).type);
        }
        xm0Var.y1();
        ConnectionsManager.getInstance(xm0Var.currentAccount).sendRequest(deletesecurevalue, new ll0(xm0Var, 2));
    }

    public static void b0(xm0 xm0Var) {
        zf1 zf1Var = new zf1(xm0Var.currentAccount, 0, xm0Var.F);
        zf1Var.U = true;
        xm0Var.presentFragment(zf1Var);
    }

    public static void c0(xm0 xm0Var) {
        if (xm0Var.F.has_recovery) {
            xm0Var.y1();
            ConnectionsManager.getInstance(xm0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(xm0Var.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new ll0(xm0Var, 0), 10), xm0Var.classGuid);
            return;
        }
        if (xm0Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xm0Var.getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.RestorePasswordResetAccount), new kl0(xm0Var, 4));
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
        String string = LocaleController.getString(R.string.RestorePasswordNoEmailText);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.P = string;
        xm0Var.showDialog(b2Var);
    }

    public static void e0(xm0 xm0Var) {
        if (Build.VERSION.SDK_INT >= 23 && xm0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            xm0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
            return;
        }
        t9 t9Var = new t9(0);
        t9Var.H = new vl0(xm0Var);
        xm0Var.presentFragment(t9Var);
    }

    public static String h1(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr2.length != 32 || bArr3 == null || bArr3.length != 32) {
            return null;
        }
        byte[] bArrComputeSHA512 = Utilities.computeSHA512(bArr2, bArr3);
        byte[] bArr4 = new byte[32];
        System.arraycopy(bArrComputeSHA512, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(bArrComputeSHA512, 32, bArr5, 0, 16);
        int length = bArr.length;
        byte[] bArr6 = new byte[length];
        System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
        Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, length, 0, 0);
        if (!Arrays.equals(Utilities.computeSHA256(bArr6), bArr3)) {
            return null;
        }
        int i10 = bArr6[0] & 255;
        return new String(bArr6, i10, length - i10);
    }

    public static String n1(SecureDocument secureDocument) {
        byte[] bArr;
        if (secureDocument == null) {
            return "";
        }
        TLRPC.TL_secureFile tL_secureFile = secureDocument.secureFile;
        if (tL_secureFile != null && (bArr = tL_secureFile.file_hash) != null) {
            return Base64.encodeToString(bArr, 2);
        }
        byte[] bArr2 = secureDocument.fileHash;
        return bArr2 != null ? Base64.encodeToString(bArr2, 2) : "";
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
        return secureValueType instanceof TLRPC.TL_secureValueTypePhone ? "phone" : "";
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
            int iNextInt = Utilities.random.nextInt(32);
            int i13 = (bArr[iNextInt] & 255) + (239 - i12);
            if (i13 < 255) {
                i13 += 255;
            }
            bArr[iNextInt] = (byte) (i13 % 255);
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
        return secureValueType instanceof TLRPC.TL_secureValueTypeEmail ? LocaleController.getString(R.string.ActionBotDocumentEmail) : "";
    }

    public static boolean t1(TLRPC.SecureValueType secureValueType) {
        return (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) || (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) || (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) || (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) || (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement);
    }

    public static boolean v1(TLRPC.SecureValueType secureValueType) {
        return (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) || (secureValueType instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard);
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
        String string;
        if (z10) {
            string = null;
        } else {
            string = this.U[0].getText().toString();
            if (TextUtils.isEmpty(string)) {
                A1(false);
                return;
            }
            N1(true, true);
        }
        Utilities.globalQueue.postRunnable(new hh.t5(this, z10, string, 28));
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
        if (getParentActivity() == null || arrayList.isEmpty()) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PassportNoDocumentsAdd);
        alertDialog$Builder.f((CharSequence[]) arrayList.toArray(new CharSequence[0]), new w(8, this, arrayList2));
        showDialog(alertDialog$Builder.f22702a);
    }

    public final void D1() {
        int size;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        int i11 = this.O0;
        ArrayList arrayList = this.f44492e1;
        int i12 = 1;
        if (i11 == 0 && arrayList.size() >= 20) {
            M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("PassportUploadMaxReached", R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", 20, new Object[0])));
            return;
        }
        c1();
        org.telegram.ui.Components.gi giVar = this.N0;
        int i13 = this.O0;
        giVar.Q1 = i13 == 1;
        if (i13 != 0) {
            if (i13 == 4) {
                size = this.f44497g1.size();
            }
            giVar.J1(i12, false);
            this.N0.f28650f0.f0();
            i10 = Build.VERSION.SDK_INT;
            if (i10 != 21 || i10 == 22) {
                AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            }
            this.N0.r1();
            showDialog(this.N0);
        }
        size = arrayList.size();
        i12 = 20 - size;
        giVar.J1(i12, false);
        this.N0.f28650f0.f0();
        i10 = Build.VERSION.SDK_INT;
        if (i10 != 21) {
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
        } else {
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
        }
        this.N0.r1();
        showDialog(this.N0);
    }

    public final void E1(TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, boolean z10) {
        int i10;
        int size = arrayList != null ? arrayList.size() : 0;
        TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2 != null ? tL_secureRequiredType2.type : null;
        if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
            i10 = 1;
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
            i10 = 2;
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
            i10 = 3;
        } else {
            i10 = secureValueType instanceof TLRPC.TL_secureValueTypeEmail ? 4 : -1;
        }
        if (i10 != -1) {
            HashMap map = this.f44516q1;
            HashMap map2 = !z10 ? (HashMap) map.get(o1(secureValueType)) : null;
            HashMap map3 = (HashMap) map.get(o1(secureValueType2));
            TLRPC.TL_secureValue tL_secureValueR1 = r1(tL_secureRequiredType, false);
            TLRPC.TL_secureValue tL_secureValueR2 = r1(tL_secureRequiredType2, false);
            HashMap map4 = map2;
            TL_account.authorizationForm authorizationform = this.f44535y;
            int i11 = i10;
            TL_account.Password password = this.F;
            HashMap map5 = this.l1;
            xm0 xm0Var = new xm0(i11, authorizationform, password, tL_secureRequiredType, tL_secureValueR1, tL_secureRequiredType2, tL_secureValueR2, (HashMap) map5.get(tL_secureRequiredType), tL_secureRequiredType2 != null ? (HashMap) map5.get(tL_secureRequiredType2) : null);
            xm0Var.f44534x1 = new bm0(this, secureValueType, z10, size);
            xm0Var.currentAccount = this.currentAccount;
            xm0Var.f44481a1 = this.f44481a1;
            xm0Var.Y0 = this.Y0;
            xm0Var.f44485c = this.f44485c;
            xm0Var.f44522s1 = map4;
            xm0Var.f44518r0 = z10;
            xm0Var.f44524t1 = map3;
            xm0Var.C = arrayList;
            if (i11 == 4) {
                xm0Var.Z0 = this.Z0;
            }
            presentFragment(xm0Var);
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
                File fileGeneratePicturePath = AndroidUtilities.generatePicturePath();
                if (fileGeneratePicturePath != null) {
                    if (i11 >= 24) {
                        intent.putExtra("output", FileProvider.d(getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", fileGeneratePicturePath));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(fileGeneratePicturePath));
                    }
                    this.M0 = fileGeneratePicturePath.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
            } catch (Exception e9) {
                FileLog.e(e9);
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
        if (i10 == 1 || i10 == 4 || !(this.A.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            z10 = false;
        } else {
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
        }
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.j0(this.O0, 7, this, arrayList, z10));
    }

    public final TLRPC.TL_secureValue H1(TLRPC.TL_secureRequiredType tL_secureRequiredType) {
        if (tL_secureRequiredType == null) {
            return null;
        }
        int size = this.f44535y.values.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (tL_secureRequiredType.type.getClass() == this.f44535y.values.get(i10).type.getClass()) {
                return this.f44535y.values.remove(i10);
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

    public final void J1(HashMap map, EditTextBoldCursor editTextBoldCursor, String str) {
        CharSequence charSequence;
        CharSequence charSequence2;
        String str2 = (String) map.get(str);
        if (str2 != null) {
            switch (str) {
                case "residence_country_code":
                    this.v = str2;
                    CharSequence charSequence3 = (String) this.U0.get(str2);
                    if (charSequence3 != null) {
                        editTextBoldCursor.setText(charSequence3);
                        break;
                    }
                    break;
                case "gender":
                    if ("male".equals(str2)) {
                        this.f44529w = str2;
                        editTextBoldCursor.setText(LocaleController.getString(R.string.PassportMale));
                        break;
                    } else {
                        if ("female".equals(str2)) {
                            this.f44529w = str2;
                            editTextBoldCursor.setText(LocaleController.getString(R.string.PassportFemale));
                        }
                        break;
                    }
                    break;
                case "expiry_date":
                    boolean zIsEmpty = TextUtils.isEmpty(str2);
                    int[] iArr = this.f44532x;
                    if (zIsEmpty) {
                        iArr[2] = 0;
                        iArr[1] = 0;
                        iArr[0] = 0;
                        editTextBoldCursor.setText(LocaleController.getString(R.string.PassportNoExpireDate));
                        break;
                    } else {
                        String[] strArrSplit = str2.split("\\.");
                        if (strArrSplit.length != 3) {
                            iArr[2] = 0;
                            iArr[1] = 0;
                            iArr[0] = 0;
                            editTextBoldCursor.setText(LocaleController.getString(R.string.PassportNoExpireDate));
                        } else {
                            iArr[0] = Utilities.parseInt((CharSequence) strArrSplit[2]).intValue();
                            iArr[1] = Utilities.parseInt((CharSequence) strArrSplit[1]).intValue();
                            iArr[2] = Utilities.parseInt((CharSequence) strArrSplit[0]).intValue();
                            editTextBoldCursor.setText(str2);
                        }
                        break;
                    }
                    break;
                case "country_code":
                    this.f44520s = str2;
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
        HashMap map2 = this.f44522s1;
        HashMap map3 = this.f44526u1;
        if (map2 != null && (charSequence2 = (String) map2.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence2);
            map3.put(str, editTextBoldCursor.getText().toString());
            return;
        }
        HashMap map4 = this.f44524t1;
        if (map4 == null || (charSequence = (String) map4.get(str)) == null) {
            return;
        }
        editTextBoldCursor.setErrorText(charSequence);
        map3.put(str, editTextBoldCursor.getText().toString());
    }

    public final void K1(int i10, boolean z10, Bundle bundle) {
        int i11 = 8;
        if (i10 == 3) {
            this.H.setVisibility(8);
        }
        int i12 = this.E1;
        org.telegram.ui.Components.ev0[] ev0VarArr = this.F1;
        org.telegram.ui.Components.ev0 ev0Var = ev0VarArr[i12];
        org.telegram.ui.Components.ev0 ev0Var2 = ev0VarArr[i10];
        this.E1 = i10;
        ev0Var2.m(bundle, false);
        ev0Var2.j();
        if (!z10) {
            ev0Var2.setTranslationX(0.0f);
            ev0Var2.setVisibility(0);
            if (ev0Var != ev0Var2) {
                ev0Var.setVisibility(8);
                return;
            }
            return;
        }
        ev0Var2.setTranslationX(AndroidUtilities.displaySize.x);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(300L);
        animatorSet.playTogether(ObjectAnimator.ofFloat(ev0Var, "translationX", -AndroidUtilities.displaySize.x), ObjectAnimator.ofFloat(ev0Var2, "translationX", 0.0f));
        animatorSet.addListener(new org.telegram.ui.Components.fk0(ev0Var2, ev0Var, i11));
        animatorSet.start();
    }

    public final void L1(TLRPC.TL_secureRequiredType tL_secureRequiredType, String str, String str2, TLRPC.TL_secureRequiredType tL_secureRequiredType2, String str3, boolean z10, int i10) {
        char c10;
        StringBuilder sb2;
        TLRPC.SecureValueType secureValueType;
        TLRPC.TL_secureValue tL_secureValue;
        wm0 wm0Var;
        String[] strArr;
        String[] strArr2;
        int i11;
        StringBuilder sb3;
        String[] strArr3;
        JSONObject jSONObject;
        int i12;
        String[] strArr4;
        JSONObject jSONObject2;
        String[] strArr5;
        JSONObject jSONObject3;
        HashMap map;
        HashMap map2;
        String[] strArr6;
        StringBuilder sb4;
        int i13;
        String[] strArr7;
        HashMap map3;
        HashMap map4;
        JSONObject jSONObject4;
        String string;
        String str4;
        Iterator<String> itKeys;
        String next;
        int i14;
        int i15;
        String string2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        HashMap map5;
        TLRPC.TL_secureRequiredType tL_secureRequiredType4;
        HashMap map6;
        TLRPC.SecureValueType secureValueType2;
        TLRPC.SecureValueType secureValueType3;
        boolean z11;
        TLRPC.SecureValueType secureValueType4;
        int i16;
        boolean z12;
        TLRPC.SecureValueType secureValueType5;
        String str5 = str2;
        wm0 wm0VarU0 = (wm0) this.f44507m1.get(tL_secureRequiredType);
        if (wm0VarU0 == null) {
            if (this.f44482b != 8) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (tL_secureRequiredType2 != null) {
                arrayList.add(tL_secureRequiredType2);
            }
            LinearLayout linearLayout = this.Y;
            View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 6);
            if (childAt instanceof wm0) {
                ((wm0) childAt).setNeedDivider(true);
            }
            wm0VarU0 = U0(getParentActivity(), tL_secureRequiredType, arrayList, true, true);
            Q1();
        }
        wm0 wm0Var2 = wm0VarU0;
        HashMap map7 = (HashMap) this.l1.get(tL_secureRequiredType);
        HashMap map8 = tL_secureRequiredType2 != null ? (HashMap) this.l1.get(tL_secureRequiredType2) : null;
        TLRPC.TL_secureValue tL_secureValueR1 = r1(tL_secureRequiredType, true);
        TLRPC.TL_secureValue tL_secureValueR2 = r1(tL_secureRequiredType2, true);
        if (str5 == null || this.U0 != null) {
            c10 = 2;
            this.U0 = null;
        } else {
            this.U0 = new HashMap();
            try {
                c10 = 2;
                try {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt")));
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String[] strArrSplit = line.split(";");
                            this.U0.put(strArrSplit[1], strArrSplit[2]);
                        }
                        bufferedReader.close();
                    } catch (Exception e9) {
                        e = e9;
                        FileLog.e(e);
                    }
                } catch (Exception e10) {
                    e = e10;
                    FileLog.e(e);
                    if (str != null) {
                        secureValueType5 = tL_secureRequiredType.type;
                        if (secureValueType5 instanceof TLRPC.TL_secureValueTypePhone) {
                            string2 = oe.b.c().b("+".concat(str));
                            wm0Var = wm0Var2;
                        } else {
                            wm0Var = wm0Var2;
                            if (secureValueType5 instanceof TLRPC.TL_secureValueTypeEmail) {
                                string2 = str;
                            } else {
                                tL_secureValue = tL_secureValueR1;
                                string2 = null;
                            }
                        }
                        tL_secureValue = tL_secureValueR1;
                    } else {
                        if (this.f44482b != 8) {
                            sb2 = null;
                        } else {
                            sb2 = null;
                        }
                        if (str5 != null) {
                            if (map7 == null) {
                                return;
                            }
                            map7.clear();
                            secureValueType = tL_secureRequiredType.type;
                            tL_secureValue = tL_secureValueR1;
                            wm0Var = wm0Var2;
                            if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                                i14 = this.f44482b;
                                if (i14 == 0) {
                                    i15 = 8;
                                    if (i14 == 8) {
                                        if (tL_secureRequiredType2 == null) {
                                            String[] strArr8 = new String[10];
                                            strArr8[0] = "first_name";
                                            strArr8[1] = "middle_name";
                                            strArr8[c10] = "last_name";
                                            strArr8[3] = "first_name_native";
                                            strArr8[4] = "middle_name_native";
                                            strArr8[5] = "last_name_native";
                                            strArr8[6] = "birth_date";
                                            strArr8[7] = "gender";
                                            strArr2 = strArr8;
                                            i15 = 8;
                                            strArr2[8] = "country_code";
                                            strArr2[9] = "residence_country_code";
                                        } else {
                                            i15 = 8;
                                        }
                                    }
                                    strArr2 = null;
                                } else {
                                    i15 = 8;
                                    if (i14 == 8) {
                                        if (tL_secureRequiredType2 == null) {
                                            String[] strArr9 = new String[10];
                                            strArr9[0] = "first_name";
                                            strArr9[1] = "middle_name";
                                            strArr9[c10] = "last_name";
                                            strArr9[3] = "first_name_native";
                                            strArr9[4] = "middle_name_native";
                                            strArr9[5] = "last_name_native";
                                            strArr9[6] = "birth_date";
                                            strArr9[7] = "gender";
                                            strArr2 = strArr9;
                                            i15 = 8;
                                            strArr2[8] = "country_code";
                                            strArr2[9] = "residence_country_code";
                                        } else {
                                            i15 = 8;
                                        }
                                    }
                                    strArr2 = null;
                                }
                                if (i14 != 0) {
                                }
                            } else {
                                if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                                }
                                strArr = null;
                                strArr2 = null;
                            }
                            if (strArr2 == null) {
                                sb3 = sb2;
                                strArr3 = strArr;
                                jSONObject = null;
                                i12 = 0;
                                strArr4 = null;
                                while (i12 < 2) {
                                    if (i12 == 0) {
                                        if (str5 != null) {
                                            try {
                                                jSONObject2 = new JSONObject(str5);
                                                strArr5 = strArr2;
                                            } catch (Exception unused) {
                                                sb2 = sb3;
                                            }
                                        } else {
                                            strArr5 = strArr4;
                                            jSONObject2 = jSONObject;
                                        }
                                        if (strArr5 != null) {
                                            try {
                                                itKeys = jSONObject2.keys();
                                                while (itKeys.hasNext()) {
                                                    Iterator<String> it = itKeys;
                                                    next = itKeys.next();
                                                    if (i12 == 0) {
                                                        map7.put(next, jSONObject2.getString(next));
                                                    } else {
                                                        map8.put(next, jSONObject2.getString(next));
                                                    }
                                                    itKeys = it;
                                                }
                                            } catch (Throwable th) {
                                                FileLog.e(th);
                                            }
                                            i13 = 0;
                                            while (i13 < strArr5.length) {
                                                if (jSONObject2.has(strArr5[i13])) {
                                                    if (sb3 == null) {
                                                        sb2 = new StringBuilder();
                                                    } else {
                                                        sb2 = sb3;
                                                    }
                                                    strArr7 = strArr5;
                                                    try {
                                                        string = jSONObject2.getString(strArr7[i13]);
                                                        if (string != null) {
                                                            map3 = map7;
                                                            map4 = map8;
                                                            jSONObject4 = jSONObject2;
                                                        } else {
                                                            map3 = map7;
                                                            map4 = map8;
                                                            jSONObject4 = jSONObject2;
                                                        }
                                                    } catch (Exception unused2) {
                                                    }
                                                } else {
                                                    strArr7 = strArr5;
                                                    map3 = map7;
                                                    map4 = map8;
                                                    jSONObject4 = jSONObject2;
                                                    sb2 = sb3;
                                                }
                                                i13++;
                                                sb3 = sb2;
                                                strArr5 = strArr7;
                                                map7 = map3;
                                                map8 = map4;
                                                jSONObject2 = jSONObject4;
                                            }
                                        }
                                        strArr6 = strArr5;
                                        map = map7;
                                        map2 = map8;
                                        jSONObject3 = jSONObject2;
                                        sb4 = sb3;
                                        i12++;
                                        str5 = str2;
                                        sb3 = sb4;
                                        strArr4 = strArr6;
                                        map7 = map;
                                        map8 = map2;
                                        jSONObject = jSONObject3;
                                    } else {
                                        if (map8 == null) {
                                            jSONObject3 = jSONObject;
                                            map = map7;
                                            map2 = map8;
                                            strArr6 = strArr4;
                                            sb4 = sb3;
                                            i12 = i12;
                                        } else {
                                            if (str3 != null) {
                                                jSONObject2 = new JSONObject(str3);
                                                strArr5 = strArr3;
                                            } else {
                                                strArr5 = strArr4;
                                                jSONObject2 = jSONObject;
                                            }
                                            if (strArr5 != null) {
                                                itKeys = jSONObject2.keys();
                                                while (itKeys.hasNext()) {
                                                    Iterator<String> it2 = itKeys;
                                                    next = itKeys.next();
                                                    if (i12 == 0) {
                                                        map7.put(next, jSONObject2.getString(next));
                                                    } else {
                                                        map8.put(next, jSONObject2.getString(next));
                                                    }
                                                    itKeys = it2;
                                                }
                                                i13 = 0;
                                                while (i13 < strArr5.length) {
                                                    if (jSONObject2.has(strArr5[i13])) {
                                                        if (sb3 == null) {
                                                            sb2 = new StringBuilder();
                                                        } else {
                                                            sb2 = sb3;
                                                        }
                                                        strArr7 = strArr5;
                                                        string = jSONObject2.getString(strArr7[i13]);
                                                        if (string != null) {
                                                            map3 = map7;
                                                            map4 = map8;
                                                            jSONObject4 = jSONObject2;
                                                        } else {
                                                            map3 = map7;
                                                            map4 = map8;
                                                            jSONObject4 = jSONObject2;
                                                        }
                                                    } else {
                                                        strArr7 = strArr5;
                                                        map3 = map7;
                                                        map4 = map8;
                                                        jSONObject4 = jSONObject2;
                                                        sb2 = sb3;
                                                    }
                                                    i13++;
                                                    sb3 = sb2;
                                                    strArr5 = strArr7;
                                                    map7 = map3;
                                                    map8 = map4;
                                                    jSONObject2 = jSONObject4;
                                                }
                                            }
                                            strArr6 = strArr5;
                                            map = map7;
                                            map2 = map8;
                                            jSONObject3 = jSONObject2;
                                            sb4 = sb3;
                                        }
                                        i12++;
                                        str5 = str2;
                                        sb3 = sb4;
                                        strArr4 = strArr6;
                                        map7 = map;
                                        map8 = map2;
                                        jSONObject = jSONObject3;
                                    }
                                }
                                sb2 = sb3;
                            } else {
                                sb3 = sb2;
                                strArr3 = strArr;
                                jSONObject = null;
                                i12 = 0;
                                strArr4 = null;
                                while (i12 < 2) {
                                    if (i12 == 0) {
                                        if (str5 != null) {
                                            jSONObject2 = new JSONObject(str5);
                                            strArr5 = strArr2;
                                        } else {
                                            strArr5 = strArr4;
                                            jSONObject2 = jSONObject;
                                        }
                                        if (strArr5 != null) {
                                            itKeys = jSONObject2.keys();
                                            while (itKeys.hasNext()) {
                                                Iterator<String> it3 = itKeys;
                                                next = itKeys.next();
                                                if (i12 == 0) {
                                                    map7.put(next, jSONObject2.getString(next));
                                                } else {
                                                    map8.put(next, jSONObject2.getString(next));
                                                }
                                                itKeys = it3;
                                            }
                                            i13 = 0;
                                            while (i13 < strArr5.length) {
                                                if (jSONObject2.has(strArr5[i13])) {
                                                    if (sb3 == null) {
                                                        sb2 = new StringBuilder();
                                                    } else {
                                                        sb2 = sb3;
                                                    }
                                                    strArr7 = strArr5;
                                                    string = jSONObject2.getString(strArr7[i13]);
                                                    if (string != null) {
                                                        map3 = map7;
                                                        map4 = map8;
                                                        jSONObject4 = jSONObject2;
                                                    } else {
                                                        map3 = map7;
                                                        map4 = map8;
                                                        jSONObject4 = jSONObject2;
                                                    }
                                                } else {
                                                    strArr7 = strArr5;
                                                    map3 = map7;
                                                    map4 = map8;
                                                    jSONObject4 = jSONObject2;
                                                    sb2 = sb3;
                                                }
                                                i13++;
                                                sb3 = sb2;
                                                strArr5 = strArr7;
                                                map7 = map3;
                                                map8 = map4;
                                                jSONObject2 = jSONObject4;
                                            }
                                        }
                                        strArr6 = strArr5;
                                        map = map7;
                                        map2 = map8;
                                        jSONObject3 = jSONObject2;
                                        sb4 = sb3;
                                        i12++;
                                        str5 = str2;
                                        sb3 = sb4;
                                        strArr4 = strArr6;
                                        map7 = map;
                                        map8 = map2;
                                        jSONObject = jSONObject3;
                                    } else {
                                        if (map8 == null) {
                                            jSONObject3 = jSONObject;
                                            map = map7;
                                            map2 = map8;
                                            strArr6 = strArr4;
                                            sb4 = sb3;
                                            i12 = i12;
                                        } else {
                                            if (str3 != null) {
                                                jSONObject2 = new JSONObject(str3);
                                                strArr5 = strArr3;
                                            } else {
                                                strArr5 = strArr4;
                                                jSONObject2 = jSONObject;
                                            }
                                            if (strArr5 != null) {
                                                itKeys = jSONObject2.keys();
                                                while (itKeys.hasNext()) {
                                                    Iterator<String> it4 = itKeys;
                                                    next = itKeys.next();
                                                    if (i12 == 0) {
                                                        map7.put(next, jSONObject2.getString(next));
                                                    } else {
                                                        map8.put(next, jSONObject2.getString(next));
                                                    }
                                                    itKeys = it4;
                                                }
                                                i13 = 0;
                                                while (i13 < strArr5.length) {
                                                    if (jSONObject2.has(strArr5[i13])) {
                                                        if (sb3 == null) {
                                                            sb2 = new StringBuilder();
                                                        } else {
                                                            sb2 = sb3;
                                                        }
                                                        strArr7 = strArr5;
                                                        string = jSONObject2.getString(strArr7[i13]);
                                                        if (string != null) {
                                                            map3 = map7;
                                                            map4 = map8;
                                                            jSONObject4 = jSONObject2;
                                                        } else {
                                                            map3 = map7;
                                                            map4 = map8;
                                                            jSONObject4 = jSONObject2;
                                                        }
                                                    } else {
                                                        strArr7 = strArr5;
                                                        map3 = map7;
                                                        map4 = map8;
                                                        jSONObject4 = jSONObject2;
                                                        sb2 = sb3;
                                                    }
                                                    i13++;
                                                    sb3 = sb2;
                                                    strArr5 = strArr7;
                                                    map7 = map3;
                                                    map8 = map4;
                                                    jSONObject2 = jSONObject4;
                                                }
                                            }
                                            strArr6 = strArr5;
                                            map = map7;
                                            map2 = map8;
                                            jSONObject3 = jSONObject2;
                                            sb4 = sb3;
                                        }
                                        i12++;
                                        str5 = str2;
                                        sb3 = sb4;
                                        strArr4 = strArr6;
                                        map7 = map;
                                        map8 = map2;
                                        jSONObject = jSONObject3;
                                    }
                                }
                                sb2 = sb3;
                            }
                        } else {
                            if (map7 == null) {
                                return;
                            }
                            map7.clear();
                            secureValueType = tL_secureRequiredType.type;
                            tL_secureValue = tL_secureValueR1;
                            wm0Var = wm0Var2;
                            if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                                i14 = this.f44482b;
                                if (i14 == 0) {
                                    i15 = 8;
                                    if (i14 == 8) {
                                        if (tL_secureRequiredType2 == null) {
                                            String[] strArr10 = new String[10];
                                            strArr10[0] = "first_name";
                                            strArr10[1] = "middle_name";
                                            strArr10[c10] = "last_name";
                                            strArr10[3] = "first_name_native";
                                            strArr10[4] = "middle_name_native";
                                            strArr10[5] = "last_name_native";
                                            strArr10[6] = "birth_date";
                                            strArr10[7] = "gender";
                                            strArr2 = strArr10;
                                            i15 = 8;
                                            strArr2[8] = "country_code";
                                            strArr2[9] = "residence_country_code";
                                        } else {
                                            i15 = 8;
                                        }
                                    }
                                    strArr2 = null;
                                } else {
                                    i15 = 8;
                                    if (i14 == 8) {
                                        if (tL_secureRequiredType2 == null) {
                                            String[] strArr11 = new String[10];
                                            strArr11[0] = "first_name";
                                            strArr11[1] = "middle_name";
                                            strArr11[c10] = "last_name";
                                            strArr11[3] = "first_name_native";
                                            strArr11[4] = "middle_name_native";
                                            strArr11[5] = "last_name_native";
                                            strArr11[6] = "birth_date";
                                            strArr11[7] = "gender";
                                            strArr2 = strArr11;
                                            i15 = 8;
                                            strArr2[8] = "country_code";
                                            strArr2[9] = "residence_country_code";
                                        } else {
                                            i15 = 8;
                                        }
                                    }
                                    strArr2 = null;
                                }
                                if (i14 != 0) {
                                }
                            } else {
                                if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                                }
                                strArr = null;
                                strArr2 = null;
                            }
                            if (strArr2 == null) {
                                sb3 = sb2;
                                strArr3 = strArr;
                                jSONObject = null;
                                i12 = 0;
                                strArr4 = null;
                                while (i12 < 2) {
                                    if (i12 == 0) {
                                        if (str5 != null) {
                                            jSONObject2 = new JSONObject(str5);
                                            strArr5 = strArr2;
                                        } else {
                                            strArr5 = strArr4;
                                            jSONObject2 = jSONObject;
                                        }
                                        if (strArr5 != null) {
                                            itKeys = jSONObject2.keys();
                                            while (itKeys.hasNext()) {
                                                Iterator<String> it5 = itKeys;
                                                next = itKeys.next();
                                                if (i12 == 0) {
                                                    map7.put(next, jSONObject2.getString(next));
                                                } else {
                                                    map8.put(next, jSONObject2.getString(next));
                                                }
                                                itKeys = it5;
                                            }
                                            i13 = 0;
                                            while (i13 < strArr5.length) {
                                                if (jSONObject2.has(strArr5[i13])) {
                                                    if (sb3 == null) {
                                                        sb2 = new StringBuilder();
                                                    } else {
                                                        sb2 = sb3;
                                                    }
                                                    strArr7 = strArr5;
                                                    string = jSONObject2.getString(strArr7[i13]);
                                                    if (string != null) {
                                                        map3 = map7;
                                                        map4 = map8;
                                                        jSONObject4 = jSONObject2;
                                                    } else {
                                                        map3 = map7;
                                                        map4 = map8;
                                                        jSONObject4 = jSONObject2;
                                                    }
                                                } else {
                                                    strArr7 = strArr5;
                                                    map3 = map7;
                                                    map4 = map8;
                                                    jSONObject4 = jSONObject2;
                                                    sb2 = sb3;
                                                }
                                                i13++;
                                                sb3 = sb2;
                                                strArr5 = strArr7;
                                                map7 = map3;
                                                map8 = map4;
                                                jSONObject2 = jSONObject4;
                                            }
                                        }
                                        strArr6 = strArr5;
                                        map = map7;
                                        map2 = map8;
                                        jSONObject3 = jSONObject2;
                                        sb4 = sb3;
                                        i12++;
                                        str5 = str2;
                                        sb3 = sb4;
                                        strArr4 = strArr6;
                                        map7 = map;
                                        map8 = map2;
                                        jSONObject = jSONObject3;
                                    } else {
                                        if (map8 == null) {
                                            jSONObject3 = jSONObject;
                                            map = map7;
                                            map2 = map8;
                                            strArr6 = strArr4;
                                            sb4 = sb3;
                                            i12 = i12;
                                        } else {
                                            if (str3 != null) {
                                                jSONObject2 = new JSONObject(str3);
                                                strArr5 = strArr3;
                                            } else {
                                                strArr5 = strArr4;
                                                jSONObject2 = jSONObject;
                                            }
                                            if (strArr5 != null) {
                                                itKeys = jSONObject2.keys();
                                                while (itKeys.hasNext()) {
                                                    Iterator<String> it6 = itKeys;
                                                    next = itKeys.next();
                                                    if (i12 == 0) {
                                                        map7.put(next, jSONObject2.getString(next));
                                                    } else {
                                                        map8.put(next, jSONObject2.getString(next));
                                                    }
                                                    itKeys = it6;
                                                }
                                                i13 = 0;
                                                while (i13 < strArr5.length) {
                                                    if (jSONObject2.has(strArr5[i13])) {
                                                        if (sb3 == null) {
                                                            sb2 = new StringBuilder();
                                                        } else {
                                                            sb2 = sb3;
                                                        }
                                                        strArr7 = strArr5;
                                                        string = jSONObject2.getString(strArr7[i13]);
                                                        if (string != null) {
                                                            map3 = map7;
                                                            map4 = map8;
                                                            jSONObject4 = jSONObject2;
                                                        } else {
                                                            map3 = map7;
                                                            map4 = map8;
                                                            jSONObject4 = jSONObject2;
                                                        }
                                                    } else {
                                                        strArr7 = strArr5;
                                                        map3 = map7;
                                                        map4 = map8;
                                                        jSONObject4 = jSONObject2;
                                                        sb2 = sb3;
                                                    }
                                                    i13++;
                                                    sb3 = sb2;
                                                    strArr5 = strArr7;
                                                    map7 = map3;
                                                    map8 = map4;
                                                    jSONObject2 = jSONObject4;
                                                }
                                            }
                                            strArr6 = strArr5;
                                            map = map7;
                                            map2 = map8;
                                            jSONObject3 = jSONObject2;
                                            sb4 = sb3;
                                        }
                                        i12++;
                                        str5 = str2;
                                        sb3 = sb4;
                                        strArr4 = strArr6;
                                        map7 = map;
                                        map8 = map2;
                                        jSONObject = jSONObject3;
                                    }
                                }
                                sb2 = sb3;
                            } else {
                                sb3 = sb2;
                                strArr3 = strArr;
                                jSONObject = null;
                                i12 = 0;
                                strArr4 = null;
                                while (i12 < 2) {
                                    if (i12 == 0) {
                                        if (str5 != null) {
                                            jSONObject2 = new JSONObject(str5);
                                            strArr5 = strArr2;
                                        } else {
                                            strArr5 = strArr4;
                                            jSONObject2 = jSONObject;
                                        }
                                        if (strArr5 != null) {
                                            itKeys = jSONObject2.keys();
                                            while (itKeys.hasNext()) {
                                                Iterator<String> it7 = itKeys;
                                                next = itKeys.next();
                                                if (i12 == 0) {
                                                    map7.put(next, jSONObject2.getString(next));
                                                } else {
                                                    map8.put(next, jSONObject2.getString(next));
                                                }
                                                itKeys = it7;
                                            }
                                            i13 = 0;
                                            while (i13 < strArr5.length) {
                                                if (jSONObject2.has(strArr5[i13])) {
                                                    if (sb3 == null) {
                                                        sb2 = new StringBuilder();
                                                    } else {
                                                        sb2 = sb3;
                                                    }
                                                    strArr7 = strArr5;
                                                    string = jSONObject2.getString(strArr7[i13]);
                                                    if (string != null) {
                                                        map3 = map7;
                                                        map4 = map8;
                                                        jSONObject4 = jSONObject2;
                                                    } else {
                                                        map3 = map7;
                                                        map4 = map8;
                                                        jSONObject4 = jSONObject2;
                                                    }
                                                } else {
                                                    strArr7 = strArr5;
                                                    map3 = map7;
                                                    map4 = map8;
                                                    jSONObject4 = jSONObject2;
                                                    sb2 = sb3;
                                                }
                                                i13++;
                                                sb3 = sb2;
                                                strArr5 = strArr7;
                                                map7 = map3;
                                                map8 = map4;
                                                jSONObject2 = jSONObject4;
                                            }
                                        }
                                        strArr6 = strArr5;
                                        map = map7;
                                        map2 = map8;
                                        jSONObject3 = jSONObject2;
                                        sb4 = sb3;
                                        i12++;
                                        str5 = str2;
                                        sb3 = sb4;
                                        strArr4 = strArr6;
                                        map7 = map;
                                        map8 = map2;
                                        jSONObject = jSONObject3;
                                    } else {
                                        if (map8 == null) {
                                            jSONObject3 = jSONObject;
                                            map = map7;
                                            map2 = map8;
                                            strArr6 = strArr4;
                                            sb4 = sb3;
                                            i12 = i12;
                                        } else {
                                            if (str3 != null) {
                                                jSONObject2 = new JSONObject(str3);
                                                strArr5 = strArr3;
                                            } else {
                                                strArr5 = strArr4;
                                                jSONObject2 = jSONObject;
                                            }
                                            if (strArr5 != null) {
                                                itKeys = jSONObject2.keys();
                                                while (itKeys.hasNext()) {
                                                    Iterator<String> it8 = itKeys;
                                                    next = itKeys.next();
                                                    if (i12 == 0) {
                                                        map7.put(next, jSONObject2.getString(next));
                                                    } else {
                                                        map8.put(next, jSONObject2.getString(next));
                                                    }
                                                    itKeys = it8;
                                                }
                                                i13 = 0;
                                                while (i13 < strArr5.length) {
                                                    if (jSONObject2.has(strArr5[i13])) {
                                                        if (sb3 == null) {
                                                            sb2 = new StringBuilder();
                                                        } else {
                                                            sb2 = sb3;
                                                        }
                                                        strArr7 = strArr5;
                                                        string = jSONObject2.getString(strArr7[i13]);
                                                        if (string != null) {
                                                            map3 = map7;
                                                            map4 = map8;
                                                            jSONObject4 = jSONObject2;
                                                        } else {
                                                            map3 = map7;
                                                            map4 = map8;
                                                            jSONObject4 = jSONObject2;
                                                        }
                                                    } else {
                                                        strArr7 = strArr5;
                                                        map3 = map7;
                                                        map4 = map8;
                                                        jSONObject4 = jSONObject2;
                                                        sb2 = sb3;
                                                    }
                                                    i13++;
                                                    sb3 = sb2;
                                                    strArr5 = strArr7;
                                                    map7 = map3;
                                                    map8 = map4;
                                                    jSONObject2 = jSONObject4;
                                                }
                                            }
                                            strArr6 = strArr5;
                                            map = map7;
                                            map2 = map8;
                                            jSONObject3 = jSONObject2;
                                            sb4 = sb3;
                                        }
                                        i12++;
                                        str5 = str2;
                                        sb3 = sb4;
                                        strArr4 = strArr6;
                                        map7 = map;
                                        map8 = map2;
                                        jSONObject = jSONObject3;
                                    }
                                }
                                sb2 = sb3;
                            }
                        }
                        if (sb2 != null) {
                            string2 = sb2.toString();
                        } else {
                            string2 = null;
                        }
                    }
                    if (z10) {
                        tL_secureRequiredType3 = tL_secureRequiredType;
                        map5 = null;
                    } else {
                        tL_secureRequiredType3 = tL_secureRequiredType;
                        map5 = (HashMap) this.f44516q1.get(o1(tL_secureRequiredType3.type));
                    }
                    if (tL_secureRequiredType2 != null) {
                        tL_secureRequiredType4 = tL_secureRequiredType2;
                        map6 = (HashMap) this.f44516q1.get(o1(tL_secureRequiredType4.type));
                    } else {
                        tL_secureRequiredType4 = tL_secureRequiredType2;
                        map6 = null;
                    }
                    if (map5 != null) {
                        secureValueType2 = tL_secureRequiredType3.type;
                        if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                            if (TextUtils.isEmpty(string2)) {
                                if (tL_secureRequiredType4 == null) {
                                    string2 = LocaleController.getString(R.string.PassportPersonalDetailsInfo);
                                } else if (this.f44482b == 8) {
                                    string2 = LocaleController.getString(R.string.PassportDocuments);
                                } else if (i10 == 1) {
                                    secureValueType4 = tL_secureRequiredType4.type;
                                    if (secureValueType4 instanceof TLRPC.TL_secureValueTypePassport) {
                                        string2 = LocaleController.getString(R.string.PassportIdentityPassport);
                                    } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                        string2 = LocaleController.getString(R.string.PassportIdentityInternalPassport);
                                    } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                        string2 = LocaleController.getString(R.string.PassportIdentityDriverLicence);
                                    } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                        string2 = LocaleController.getString(R.string.PassportIdentityID);
                                    }
                                } else {
                                    string2 = LocaleController.getString(R.string.PassportIdentityDocumentInfo);
                                }
                                z11 = false;
                            }
                            z11 = false;
                        } else {
                            if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                                if (TextUtils.isEmpty(string2)) {
                                    if (tL_secureRequiredType4 == null) {
                                        string2 = LocaleController.getString(R.string.PassportAddressNoUploadInfo);
                                    } else if (this.f44482b == 8) {
                                        string2 = LocaleController.getString(R.string.PassportDocuments);
                                    } else if (i10 == 1) {
                                        secureValueType3 = tL_secureRequiredType4.type;
                                        if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                            string2 = LocaleController.getString(R.string.PassportAddAgreementInfo);
                                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                            string2 = LocaleController.getString(R.string.PassportAddBillInfo);
                                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                            string2 = LocaleController.getString(R.string.PassportAddPassportRegistrationInfo);
                                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                            string2 = LocaleController.getString(R.string.PassportAddTemporaryRegistrationInfo);
                                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                            string2 = LocaleController.getString(R.string.PassportAddBankInfo);
                                        }
                                    } else {
                                        string2 = LocaleController.getString(R.string.PassportAddressInfo);
                                    }
                                    z11 = false;
                                }
                            } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) {
                                if (TextUtils.isEmpty(string2)) {
                                    string2 = LocaleController.getString(R.string.PassportPhoneInfo);
                                }
                            } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail) {
                                string2 = LocaleController.getString(R.string.PassportEmailInfo);
                            }
                            z11 = false;
                        }
                    } else {
                        secureValueType2 = tL_secureRequiredType3.type;
                        if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                            if (TextUtils.isEmpty(string2)) {
                                if (tL_secureRequiredType4 == null) {
                                    string2 = LocaleController.getString(R.string.PassportPersonalDetailsInfo);
                                } else if (this.f44482b == 8) {
                                    string2 = LocaleController.getString(R.string.PassportDocuments);
                                } else if (i10 == 1) {
                                    secureValueType4 = tL_secureRequiredType4.type;
                                    if (secureValueType4 instanceof TLRPC.TL_secureValueTypePassport) {
                                        string2 = LocaleController.getString(R.string.PassportIdentityPassport);
                                    } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                        string2 = LocaleController.getString(R.string.PassportIdentityInternalPassport);
                                    } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                        string2 = LocaleController.getString(R.string.PassportIdentityDriverLicence);
                                    } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                        string2 = LocaleController.getString(R.string.PassportIdentityID);
                                    }
                                } else {
                                    string2 = LocaleController.getString(R.string.PassportIdentityDocumentInfo);
                                }
                                z11 = false;
                            }
                            z11 = false;
                        } else {
                            if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                                if (TextUtils.isEmpty(string2)) {
                                    if (tL_secureRequiredType4 == null) {
                                        string2 = LocaleController.getString(R.string.PassportAddressNoUploadInfo);
                                    } else if (this.f44482b == 8) {
                                        string2 = LocaleController.getString(R.string.PassportDocuments);
                                    } else if (i10 == 1) {
                                        secureValueType3 = tL_secureRequiredType4.type;
                                        if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                            string2 = LocaleController.getString(R.string.PassportAddAgreementInfo);
                                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                            string2 = LocaleController.getString(R.string.PassportAddBillInfo);
                                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                            string2 = LocaleController.getString(R.string.PassportAddPassportRegistrationInfo);
                                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                            string2 = LocaleController.getString(R.string.PassportAddTemporaryRegistrationInfo);
                                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                            string2 = LocaleController.getString(R.string.PassportAddBankInfo);
                                        }
                                    } else {
                                        string2 = LocaleController.getString(R.string.PassportAddressInfo);
                                    }
                                    z11 = false;
                                }
                            } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) {
                                if (TextUtils.isEmpty(string2)) {
                                    string2 = LocaleController.getString(R.string.PassportPhoneInfo);
                                }
                            } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail) {
                                string2 = LocaleController.getString(R.string.PassportEmailInfo);
                            }
                            z11 = false;
                        }
                    }
                    wm0Var.setValue(string2);
                    TextView textView = wm0Var.f44148b;
                    if (z11) {
                        i16 = org.telegram.ui.ActionBar.g6.f23269p7;
                    } else {
                        i16 = org.telegram.ui.ActionBar.g6.f23441z6;
                    }
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                    if (z11) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    wm0Var.setChecked(z12);
                }
            } catch (Exception e11) {
                e = e11;
                c10 = 2;
            }
        }
        if (str != null) {
            secureValueType5 = tL_secureRequiredType.type;
            if (secureValueType5 instanceof TLRPC.TL_secureValueTypePhone) {
                string2 = oe.b.c().b("+".concat(str));
                wm0Var = wm0Var2;
            } else {
                wm0Var = wm0Var2;
                if (secureValueType5 instanceof TLRPC.TL_secureValueTypeEmail) {
                    string2 = str;
                } else {
                    tL_secureValue = tL_secureValueR1;
                    string2 = null;
                }
            }
            tL_secureValue = tL_secureValueR1;
        } else {
            if (this.f44482b != 8 || tL_secureRequiredType2 == null || (TextUtils.isEmpty(str3) && tL_secureValueR2 == null)) {
                sb2 = null;
            } else {
                sb2 = new StringBuilder();
                if (i10 > 1) {
                    sb2.append(q1(tL_secureRequiredType2.type));
                } else if (TextUtils.isEmpty(str3)) {
                    sb2.append(LocaleController.getString(R.string.PassportDocuments));
                }
            }
            if (str5 != null && str3 == null) {
                wm0Var = wm0Var2;
                tL_secureValue = tL_secureValueR1;
            } else {
                if (map7 == null) {
                    return;
                }
                map7.clear();
                secureValueType = tL_secureRequiredType.type;
                tL_secureValue = tL_secureValueR1;
                wm0Var = wm0Var2;
                if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                    i14 = this.f44482b;
                    if (i14 == 0 || z10) {
                        i15 = 8;
                        if (i14 == 8) {
                            if (tL_secureRequiredType2 == null) {
                                String[] strArr12 = new String[10];
                                strArr12[0] = "first_name";
                                strArr12[1] = "middle_name";
                                strArr12[c10] = "last_name";
                                strArr12[3] = "first_name_native";
                                strArr12[4] = "middle_name_native";
                                strArr12[5] = "last_name_native";
                                strArr12[6] = "birth_date";
                                strArr12[7] = "gender";
                                strArr2 = strArr12;
                                i15 = 8;
                                strArr2[8] = "country_code";
                                strArr2[9] = "residence_country_code";
                            } else {
                                i15 = 8;
                            }
                        }
                        strArr2 = null;
                    } else {
                        String[] strArr13 = new String[10];
                        strArr13[0] = "first_name";
                        strArr13[1] = "middle_name";
                        strArr13[c10] = "last_name";
                        strArr13[3] = "first_name_native";
                        strArr13[4] = "middle_name_native";
                        strArr13[5] = "last_name_native";
                        strArr13[6] = "birth_date";
                        strArr13[7] = "gender";
                        strArr2 = strArr13;
                        i15 = 8;
                        strArr2[8] = "country_code";
                        strArr2[9] = "residence_country_code";
                    }
                    strArr = (i14 != 0 || (i14 == i15 && tL_secureRequiredType2 != null)) ? new String[]{"document_no", "expiry_date"} : null;
                } else if ((secureValueType instanceof TLRPC.TL_secureValueTypeAddress) || (((i11 = this.f44482b) != 0 || z10) && !(i11 == 8 && tL_secureRequiredType2 == null))) {
                    strArr = null;
                    strArr2 = null;
                } else {
                    strArr2 = new String[]{"street_line1", "street_line2", "post_code", "city", "state", "country_code"};
                }
                if (strArr2 == null || strArr != null) {
                    sb3 = sb2;
                    strArr3 = strArr;
                    jSONObject = null;
                    i12 = 0;
                    strArr4 = null;
                    while (i12 < 2) {
                        if (i12 == 0) {
                            if (str5 != null) {
                                jSONObject2 = new JSONObject(str5);
                                strArr5 = strArr2;
                            } else {
                                strArr5 = strArr4;
                                jSONObject2 = jSONObject;
                            }
                            if (strArr5 != null && jSONObject2 != null) {
                                itKeys = jSONObject2.keys();
                                while (itKeys.hasNext()) {
                                    Iterator<String> it9 = itKeys;
                                    next = itKeys.next();
                                    if (i12 == 0) {
                                        map7.put(next, jSONObject2.getString(next));
                                    } else {
                                        map8.put(next, jSONObject2.getString(next));
                                    }
                                    itKeys = it9;
                                }
                                i13 = 0;
                                while (i13 < strArr5.length) {
                                    if (jSONObject2.has(strArr5[i13])) {
                                        if (sb3 == null) {
                                            sb2 = new StringBuilder();
                                        } else {
                                            sb2 = sb3;
                                        }
                                        strArr7 = strArr5;
                                        string = jSONObject2.getString(strArr7[i13]);
                                        if (string != null || TextUtils.isEmpty(string)) {
                                            map3 = map7;
                                        } else {
                                            map3 = map7;
                                            if (!"first_name_native".equals(strArr7[i13]) && !"middle_name_native".equals(strArr7[i13]) && !"last_name_native".equals(strArr7[i13])) {
                                                if (sb2.length() > 0) {
                                                    if ("last_name".equals(strArr7[i13]) || "last_name_native".equals(strArr7[i13]) || "middle_name".equals(strArr7[i13]) || "middle_name_native".equals(strArr7[i13])) {
                                                        sb2.append(" ");
                                                    } else {
                                                        sb2.append(", ");
                                                    }
                                                }
                                                String str6 = strArr7[i13];
                                                map4 = map8;
                                                int iHashCode = str6.hashCode();
                                                jSONObject4 = jSONObject2;
                                                if (iHashCode != -2006252145) {
                                                    if (iHashCode != -1249512767) {
                                                        if (iHashCode == 1481071862 && str6.equals("country_code")) {
                                                            str4 = (String) this.U0.get(string);
                                                            if (str4 != null) {
                                                                sb2.append(str4);
                                                            }
                                                        }
                                                    } else if (str6.equals("gender")) {
                                                        if ("male".equals(string)) {
                                                            sb2.append(LocaleController.getString(R.string.PassportMale));
                                                        } else if ("female".equals(string)) {
                                                            sb2.append(LocaleController.getString(R.string.PassportFemale));
                                                        }
                                                    }
                                                    sb2.append(string);
                                                } else if (str6.equals("residence_country_code")) {
                                                    str4 = (String) this.U0.get(string);
                                                    if (str4 != null) {
                                                        sb2.append(str4);
                                                    }
                                                } else {
                                                    sb2.append(string);
                                                }
                                            }
                                        }
                                        map4 = map8;
                                        jSONObject4 = jSONObject2;
                                    } else {
                                        strArr7 = strArr5;
                                        map3 = map7;
                                        map4 = map8;
                                        jSONObject4 = jSONObject2;
                                        sb2 = sb3;
                                    }
                                    i13++;
                                    sb3 = sb2;
                                    strArr5 = strArr7;
                                    map7 = map3;
                                    map8 = map4;
                                    jSONObject2 = jSONObject4;
                                }
                            }
                            strArr6 = strArr5;
                            map = map7;
                            map2 = map8;
                            jSONObject3 = jSONObject2;
                            sb4 = sb3;
                            i12++;
                            str5 = str2;
                            sb3 = sb4;
                            strArr4 = strArr6;
                            map7 = map;
                            map8 = map2;
                            jSONObject = jSONObject3;
                        } else {
                            if (map8 == null) {
                                jSONObject3 = jSONObject;
                                map = map7;
                                map2 = map8;
                                strArr6 = strArr4;
                                sb4 = sb3;
                                i12 = i12;
                            } else {
                                if (str3 != null) {
                                    jSONObject2 = new JSONObject(str3);
                                    strArr5 = strArr3;
                                } else {
                                    strArr5 = strArr4;
                                    jSONObject2 = jSONObject;
                                }
                                if (strArr5 != null) {
                                    itKeys = jSONObject2.keys();
                                    while (itKeys.hasNext()) {
                                        Iterator<String> it10 = itKeys;
                                        next = itKeys.next();
                                        if (i12 == 0) {
                                            map7.put(next, jSONObject2.getString(next));
                                        } else {
                                            map8.put(next, jSONObject2.getString(next));
                                        }
                                        itKeys = it10;
                                    }
                                    i13 = 0;
                                    while (i13 < strArr5.length) {
                                        if (jSONObject2.has(strArr5[i13])) {
                                            if (sb3 == null) {
                                                sb2 = new StringBuilder();
                                            } else {
                                                sb2 = sb3;
                                            }
                                            strArr7 = strArr5;
                                            string = jSONObject2.getString(strArr7[i13]);
                                            if (string != null) {
                                                map3 = map7;
                                                map4 = map8;
                                                jSONObject4 = jSONObject2;
                                            } else {
                                                map3 = map7;
                                                map4 = map8;
                                                jSONObject4 = jSONObject2;
                                            }
                                        } else {
                                            strArr7 = strArr5;
                                            map3 = map7;
                                            map4 = map8;
                                            jSONObject4 = jSONObject2;
                                            sb2 = sb3;
                                        }
                                        i13++;
                                        sb3 = sb2;
                                        strArr5 = strArr7;
                                        map7 = map3;
                                        map8 = map4;
                                        jSONObject2 = jSONObject4;
                                    }
                                }
                                strArr6 = strArr5;
                                map = map7;
                                map2 = map8;
                                jSONObject3 = jSONObject2;
                                sb4 = sb3;
                            }
                            i12++;
                            str5 = str2;
                            sb3 = sb4;
                            strArr4 = strArr6;
                            map7 = map;
                            map8 = map2;
                            jSONObject = jSONObject3;
                        }
                    }
                    sb2 = sb3;
                }
            }
            if (sb2 != null) {
                string2 = sb2.toString();
            } else {
                string2 = null;
            }
        }
        if (z10) {
            tL_secureRequiredType3 = tL_secureRequiredType;
            map5 = (HashMap) this.f44516q1.get(o1(tL_secureRequiredType3.type));
        } else {
            tL_secureRequiredType3 = tL_secureRequiredType;
            map5 = null;
        }
        if (tL_secureRequiredType2 != null) {
            tL_secureRequiredType4 = tL_secureRequiredType2;
            map6 = (HashMap) this.f44516q1.get(o1(tL_secureRequiredType4.type));
        } else {
            tL_secureRequiredType4 = tL_secureRequiredType2;
            map6 = null;
        }
        if ((map5 != null || map5.size() <= 0) && (map6 == null || map6.size() <= 0)) {
            secureValueType2 = tL_secureRequiredType3.type;
            if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                if (TextUtils.isEmpty(string2)) {
                    if (tL_secureRequiredType4 == null) {
                        string2 = LocaleController.getString(R.string.PassportPersonalDetailsInfo);
                    } else if (this.f44482b == 8) {
                        string2 = LocaleController.getString(R.string.PassportDocuments);
                    } else if (i10 == 1) {
                        secureValueType4 = tL_secureRequiredType4.type;
                        if (secureValueType4 instanceof TLRPC.TL_secureValueTypePassport) {
                            string2 = LocaleController.getString(R.string.PassportIdentityPassport);
                        } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                            string2 = LocaleController.getString(R.string.PassportIdentityInternalPassport);
                        } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                            string2 = LocaleController.getString(R.string.PassportIdentityDriverLicence);
                        } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                            string2 = LocaleController.getString(R.string.PassportIdentityID);
                        }
                    } else {
                        string2 = LocaleController.getString(R.string.PassportIdentityDocumentInfo);
                    }
                    z11 = false;
                }
                z11 = false;
            } else {
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                    if (TextUtils.isEmpty(string2)) {
                        if (tL_secureRequiredType4 == null) {
                            string2 = LocaleController.getString(R.string.PassportAddressNoUploadInfo);
                        } else if (this.f44482b == 8) {
                            string2 = LocaleController.getString(R.string.PassportDocuments);
                        } else if (i10 == 1) {
                            secureValueType3 = tL_secureRequiredType4.type;
                            if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                string2 = LocaleController.getString(R.string.PassportAddAgreementInfo);
                            } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                string2 = LocaleController.getString(R.string.PassportAddBillInfo);
                            } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                string2 = LocaleController.getString(R.string.PassportAddPassportRegistrationInfo);
                            } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                string2 = LocaleController.getString(R.string.PassportAddTemporaryRegistrationInfo);
                            } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                string2 = LocaleController.getString(R.string.PassportAddBankInfo);
                            }
                        } else {
                            string2 = LocaleController.getString(R.string.PassportAddressInfo);
                        }
                        z11 = false;
                    }
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) {
                    if (TextUtils.isEmpty(string2)) {
                        string2 = LocaleController.getString(R.string.PassportPhoneInfo);
                    }
                } else if ((secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail) && TextUtils.isEmpty(string2)) {
                    string2 = LocaleController.getString(R.string.PassportEmailInfo);
                }
                z11 = false;
            }
        } else {
            string2 = !z10 ? (String) this.f44519r1.get(o1(tL_secureRequiredType3.type)) : null;
            if (string2 == null) {
                string2 = (String) this.f44519r1.get(o1(tL_secureRequiredType4.type));
            }
            wm0Var = wm0Var;
            z11 = true;
        }
        wm0Var.setValue(string2);
        TextView textView2 = wm0Var.f44148b;
        if (z11) {
            i16 = org.telegram.ui.ActionBar.g6.f23269p7;
        } else {
            i16 = org.telegram.ui.ActionBar.g6.f23441z6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        if (z11 || this.f44482b == 8 || (((!z10 || tL_secureRequiredType4 == null) && (z10 || tL_secureValue == null)) || (tL_secureRequiredType4 != null && tL_secureValueR2 == null))) {
            z12 = false;
        } else {
            z12 = true;
        }
        wm0Var.setChecked(z12);
    }

    public final void M1(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = str;
        b2Var.P = str2;
        showDialog(b2Var);
    }

    public final void N1(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.I;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i10 = 1;
        int i11 = 0;
        if (z10 && this.H != null) {
            this.I = new AnimatorSet();
            if (z11) {
                this.J.setVisibility(0);
                this.H.setEnabled(false);
                AnimatorSet animatorSet2 = this.I;
                View contentView = this.H.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(contentView, (Property<View, Float>) property, 0.1f);
                View contentView2 = this.H.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(contentView2, (Property<View, Float>) property2, 0.1f);
                View contentView3 = this.H.getContentView();
                Property property3 = View.ALPHA;
                animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.J, (Property<org.telegram.ui.Components.hq, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.J, (Property<org.telegram.ui.Components.hq, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.J, (Property<org.telegram.ui.Components.hq, Float>) property3, 1.0f));
            } else {
                this.H.getContentView().setVisibility(0);
                this.H.setEnabled(true);
                AnimatorSet animatorSet3 = this.I;
                org.telegram.ui.Components.hq hqVar = this.J;
                Property property4 = View.SCALE_X;
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(hqVar, (Property<org.telegram.ui.Components.hq, Float>) property4, 0.1f);
                org.telegram.ui.Components.hq hqVar2 = this.J;
                Property property5 = View.SCALE_Y;
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(hqVar2, (Property<org.telegram.ui.Components.hq, Float>) property5, 0.1f);
                org.telegram.ui.Components.hq hqVar3 = this.J;
                Property property6 = View.ALPHA;
                animatorSet3.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4, ObjectAnimator.ofFloat(hqVar3, (Property<org.telegram.ui.Components.hq, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.H.getContentView(), (Property<View, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.H.getContentView(), (Property<View, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.H.getContentView(), (Property<View, Float>) property6, 1.0f));
            }
            this.I.addListener(new cm0(this, z11, i11));
            this.I.setDuration(150L);
            this.I.start();
            return;
        }
        if (this.K != null) {
            this.I = new AnimatorSet();
            if (z11) {
                this.L.setVisibility(0);
                this.M.setEnabled(false);
                AnimatorSet animatorSet4 = this.I;
                TextView textView = this.K;
                Property property7 = View.SCALE_X;
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property7, 0.1f);
                TextView textView2 = this.K;
                Property property8 = View.SCALE_Y;
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property8, 0.1f);
                TextView textView3 = this.K;
                Property property9 = View.ALPHA;
                animatorSet4.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat6, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.L, (Property<org.telegram.ui.Components.hq, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.L, (Property<org.telegram.ui.Components.hq, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.L, (Property<org.telegram.ui.Components.hq, Float>) property9, 1.0f));
            } else {
                this.K.setVisibility(0);
                this.M.setEnabled(true);
                AnimatorSet animatorSet5 = this.I;
                org.telegram.ui.Components.hq hqVar4 = this.L;
                Property property10 = View.SCALE_X;
                ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(hqVar4, (Property<org.telegram.ui.Components.hq, Float>) property10, 0.1f);
                org.telegram.ui.Components.hq hqVar5 = this.L;
                Property property11 = View.SCALE_Y;
                ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(hqVar5, (Property<org.telegram.ui.Components.hq, Float>) property11, 0.1f);
                org.telegram.ui.Components.hq hqVar6 = this.L;
                Property property12 = View.ALPHA;
                animatorSet5.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, ObjectAnimator.ofFloat(hqVar6, (Property<org.telegram.ui.Components.hq, Float>) property12, 0.0f), ObjectAnimator.ofFloat(this.K, (Property<TextView, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.K, (Property<TextView, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.K, (Property<TextView, Float>) property12, 1.0f));
            }
            this.I.addListener(new cm0(this, z11, i10));
            this.I.setDuration(150L);
            this.I.start();
        }
    }

    public final void O1(boolean z10, String str, Runnable runnable, mm0 mm0Var, om0 om0Var) {
        boolean z11;
        TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        boolean z12 = (telephonyManager.getSimState() == 1 || telephonyManager.getPhoneType() == 0) ? false : true;
        if (getParentActivity() == null || Build.VERSION.SDK_INT < 23 || !z12) {
            z11 = true;
        } else {
            z11 = getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            if (z10) {
                this.I1.clear();
                if (!z11) {
                    this.I1.add("android.permission.READ_PHONE_STATE");
                }
                if (!this.I1.isEmpty()) {
                    if (getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.AllowReadCall);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                        b2Var.P = string;
                        this.H1 = showDialog(b2Var);
                    } else {
                        getParentActivity().requestPermissions((String[]) this.I1.toArray(new String[0]), 6);
                    }
                    this.A1 = str;
                    this.C1 = mm0Var;
                    this.B1 = runnable;
                    this.D1 = om0Var;
                    return;
                }
            }
        }
        TL_account.sendVerifyPhoneCode sendverifyphonecode = new TL_account.sendVerifyPhoneCode();
        sendverifyphonecode.phone_number = str;
        TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
        sendverifyphonecode.settings = tL_codeSettings;
        tL_codeSettings.allow_flashcall = z12 && z11;
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
                if (TextUtils.isEmpty(line1Number)) {
                    TLRPC.TL_codeSettings tL_codeSettings2 = sendverifyphonecode.settings;
                    tL_codeSettings2.unknown_number = true;
                    tL_codeSettings2.current_number = false;
                } else {
                    sendverifyphonecode.settings.current_number = PhoneNumberUtils.compare(str, line1Number);
                    TLRPC.TL_codeSettings tL_codeSettings3 = sendverifyphonecode.settings;
                    if (!tL_codeSettings3.current_number) {
                        tL_codeSettings3.allow_flashcall = false;
                    }
                }
            } catch (Exception e9) {
                sendverifyphonecode.settings.allow_flashcall = false;
                FileLog.e(e9);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendverifyphonecode, new gh.f1(this, str, om0Var, sendverifyphonecode, 13), 2);
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
        if (this.f44535y.values.isEmpty()) {
            this.f44530w0.setVisibility(0);
            this.f44498h0.setVisibility(8);
            this.f44494f0.setVisibility(8);
            this.f44523t0.setVisibility(8);
            this.f44525u0.setVisibility(8);
            this.f44527v0.setVisibility(8);
            return;
        }
        this.f44530w0.setVisibility(8);
        this.f44498h0.setVisibility(0);
        this.f44494f0.setVisibility(0);
        this.f44525u0.setVisibility(0);
        this.f44527v0.setVisibility(0);
        if (s1(TLRPC.TL_secureValueTypePhone.class) || s1(TLRPC.TL_secureValueTypeEmail.class) || s1(TLRPC.TL_secureValueTypePersonalDetails.class) || s1(TLRPC.TL_secureValueTypePassport.class) || s1(TLRPC.TL_secureValueTypeInternalPassport.class) || s1(TLRPC.TL_secureValueTypeIdentityCard.class) || s1(TLRPC.TL_secureValueTypeDriverLicense.class) || s1(TLRPC.TL_secureValueTypeAddress.class) || s1(TLRPC.TL_secureValueTypeUtilityBill.class) || s1(TLRPC.TL_secureValueTypePassportRegistration.class) || s1(TLRPC.TL_secureValueTypeTemporaryRegistration.class) || s1(TLRPC.TL_secureValueTypeBankStatement.class) || s1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            this.f44523t0.setVisibility(0);
        } else {
            this.f44523t0.setVisibility(8);
        }
    }

    public final void R0(final SecureDocument secureDocument, final int i10) {
        String string;
        final String str;
        String dateForBan;
        HashMap map;
        if (i10 == 1) {
            this.f44495f1 = secureDocument;
            if (this.f44486c0 == null) {
                return;
            }
        } else if (i10 == 4) {
            this.f44497g1.add(secureDocument);
            if (this.f44488d0 == null) {
                return;
            }
        } else if (i10 == 2) {
            this.f44499h1 = secureDocument;
            if (this.f44480a0 == null) {
                return;
            }
        } else if (i10 == 3) {
            this.f44501i1 = secureDocument;
            if (this.f44483b0 == null) {
                return;
            }
        } else {
            this.f44492e1.add(secureDocument);
            if (this.Z == null) {
                return;
            }
        }
        if (getParentActivity() == null) {
            return;
        }
        final vm0 vm0Var = new vm0(this, getParentActivity());
        vm0Var.setTag(secureDocument);
        vm0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
        this.f44503j1.put(secureDocument, vm0Var);
        String strN1 = n1(secureDocument);
        if (i10 == 1) {
            string = LocaleController.getString(R.string.PassportSelfie);
            this.f44486c0.addView(vm0Var, h7.z5.n(-1, -2));
            str = "selfie" + strN1;
        } else if (i10 == 4) {
            string = LocaleController.getString(R.string.AttachPhoto);
            this.f44488d0.addView(vm0Var, h7.z5.n(-1, -2));
            str = "translation" + strN1;
        } else if (i10 == 2) {
            TLRPC.SecureValueType secureValueType = this.B.type;
            string = ((secureValueType instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) ? LocaleController.getString(R.string.PassportMainPage) : LocaleController.getString(R.string.PassportFrontSide);
            this.f44480a0.addView(vm0Var, h7.z5.n(-1, -2));
            str = "front" + strN1;
        } else if (i10 == 3) {
            string = LocaleController.getString(R.string.PassportReverseSide);
            this.f44483b0.addView(vm0Var, h7.z5.n(-1, -2));
            str = "reverse" + strN1;
        } else {
            string = LocaleController.getString(R.string.AttachPhoto);
            this.Z.addView(vm0Var, h7.z5.n(-1, -2));
            str = "files" + strN1;
        }
        if (str == null || (map = this.f44524t1) == null || (dateForBan = (String) map.get(str)) == null) {
            dateForBan = LocaleController.formatDateForBan(secureDocument.secureFile.date);
        } else {
            vm0Var.f43486b.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
            this.f44526u1.put(str, "");
        }
        vm0Var.f43485a.setText(string);
        vm0Var.f43486b.setText(dateForBan);
        org.telegram.ui.Components.n9 n9Var = vm0Var.f43487c;
        n9Var.getClass();
        n9Var.m(ImageLocation.getForSecureDocument(secureDocument), "48_48", null, null, null, null, 0, null);
        vm0Var.f43489f = secureDocument;
        vm0Var.a(false);
        vm0Var.setOnClickListener(new hh.z0(this, i10, 19));
        vm0Var.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                xm0 xm0Var = this;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xm0Var.getParentActivity());
                int i11 = i10;
                if (i11 == 1) {
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PassportDeleteSelfie);
                } else {
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PassportDeleteScan);
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new gh.u2(xm0Var, secureDocument, i11, vm0Var, str, 5));
                xm0Var.showDialog(alertDialog$Builder.f22702a);
                return true;
            }
        });
    }

    public final void R1() {
        ImageView imageView = this.E0;
        if (imageView == null) {
            return;
        }
        TL_account.Password password = this.F;
        if (password == null || this.J0 != 0) {
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
            return;
        }
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
            this.C0.setLayoutParams(h7.z5.k(0.0f, 25.0f, 0.0f, 0.0f, -1, -2));
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
        this.C0.setLayoutParams(h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        if (this.U != null) {
            TL_account.Password password2 = this.F;
            if (password2 == null || TextUtils.isEmpty(password2.hint)) {
                this.U[0].setHint(LocaleController.getString(R.string.LoginPassword));
            } else {
                this.U[0].setHint(this.F.hint);
            }
        }
    }

    public final void S0(TLRPC.TL_secureFile tL_secureFile, int i10) {
        byte[] bArr = tL_secureFile.secret;
        byte[] bArr2 = tL_secureFile.file_hash;
        byte[] bArrComputeSHA512 = Utilities.computeSHA512(i1(bArr, bArr2), bArr2);
        byte[] bArr3 = new byte[32];
        System.arraycopy(bArrComputeSHA512, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArrComputeSHA512, 32, bArr4, 0, 16);
        R0(new SecureDocument(new SecureDocumentKey(bArr3, bArr4), tL_secureFile, null, null, null), i10);
    }

    public final void S1(int i10) {
        boolean z10 = true;
        if (i10 == 0) {
            if (this.N == null) {
                return;
            }
            if (this.f44492e1.size() >= 1) {
                this.N.b(LocaleController.getString(R.string.PassportUploadAdditinalDocument), false);
                return;
            } else {
                this.N.b(LocaleController.getString(R.string.PassportUploadDocument), false);
                return;
            }
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.w8 w8Var = this.S;
            if (w8Var == null) {
                return;
            }
            w8Var.setVisibility(this.f44495f1 != null ? 8 : 0);
            return;
        }
        if (i10 == 4) {
            if (this.T == null) {
                return;
            }
            if (this.f44497g1.size() >= 1) {
                this.T.b(LocaleController.getString(R.string.PassportUploadAdditinalDocument), false);
                return;
            } else {
                this.T.b(LocaleController.getString(R.string.PassportUploadDocument), false);
                return;
            }
        }
        if (i10 != 2) {
            if (i10 != 3 || this.R == null) {
                return;
            }
            TLRPC.SecureValueType secureValueType = this.B.type;
            if ((secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) || (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                this.f44483b0.setVisibility(0);
                this.R.setVisibility(this.f44501i1 != null ? 8 : 0);
                return;
            } else {
                this.f44483b0.setVisibility(8);
                this.R.setVisibility(8);
                return;
            }
        }
        org.telegram.ui.Cells.w8 w8Var2 = this.Q;
        if (w8Var2 == null) {
            return;
        }
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.B;
        if (tL_secureRequiredType == null) {
            z10 = false;
        } else if (!tL_secureRequiredType.selfie_required) {
            TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType.type;
            if (!(secureValueType2 instanceof TLRPC.TL_secureValueTypeIdentityCard) && !(secureValueType2 instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                z10 = false;
            }
        }
        TLRPC.SecureValueType secureValueType3 = tL_secureRequiredType.type;
        if ((secureValueType3 instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType3 instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
            w8Var2.a(LocaleController.getString(R.string.PassportMainPage), LocaleController.getString(R.string.PassportMainPageInfo), z10);
        } else {
            w8Var2.a(LocaleController.getString(R.string.PassportFrontSide), LocaleController.getString(R.string.PassportFrontSideInfo), z10);
        }
        this.Q.setVisibility(this.f44499h1 != null ? 8 : 0);
    }

    public final void T0(ArrayList arrayList) {
        this.f44492e1.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i10);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                S0((TLRPC.TL_secureFile) secureFile, 0);
            }
        }
    }

    public final wm0 U0(Context context, TLRPC.TL_secureRequiredType tL_secureRequiredType, ArrayList arrayList, boolean z10, boolean z11) {
        String string;
        String str;
        String strH1;
        String str2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        String str3;
        TLRPC.TL_secureValue tL_secureValueR1;
        String string2;
        int size = arrayList != null ? arrayList.size() : 0;
        wm0 wm0Var = new wm0(context);
        int i10 = this.f44482b;
        int i11 = i10 == 8 ? 21 : 51;
        TextView textView = new TextView(context);
        wm0Var.f44147a = textView;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = null;
        org.telegram.messenger.rl.p(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        boolean z12 = LocaleController.isRTL;
        wm0Var.addView(textView, h7.z5.d(-2, -2.0f, (z12 ? 5 : 3) | 48, z12 ? i11 : 21, 10.0f, z12 ? 21 : i11, 0.0f));
        TextView textView2 = new TextView(context);
        wm0Var.f44148b = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23441z6, false));
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z13 = LocaleController.isRTL;
        int i12 = (z13 ? 5 : 3) | 48;
        float f10 = z13 ? i11 : 21;
        if (z13) {
            i11 = 21;
        }
        wm0Var.addView(textView2, h7.z5.d(-2, -2.0f, i12, f10, 35.0f, i11, 0.0f));
        ImageView imageView = new ImageView(context);
        wm0Var.f44149c = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Mh, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageResource(R.drawable.sticker_added);
        wm0Var.addView(imageView, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 25.0f, 21.0f, 0.0f));
        wm0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
        TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
        if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
            if (arrayList == null || arrayList.isEmpty()) {
                string2 = LocaleController.getString(R.string.PassportPersonalDetails);
            } else if (z10 && arrayList.size() == 1) {
                string2 = q1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type);
            } else {
                string2 = (z10 && arrayList.size() == 2) ? LocaleController.formatString("PassportTwoDocuments", R.string.PassportTwoDocuments, q1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type), q1(((TLRPC.TL_secureRequiredType) arrayList.get(1)).type)) : LocaleController.getString(R.string.PassportIdentityDocument);
            }
            wm0Var.a(string2, !z11);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
            if (arrayList == null || arrayList.isEmpty()) {
                string = LocaleController.getString(R.string.PassportAddress);
            } else if (z10 && arrayList.size() == 1) {
                string = q1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type);
            } else {
                string = (z10 && arrayList.size() == 2) ? LocaleController.formatString("PassportTwoDocuments", R.string.PassportTwoDocuments, q1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type), q1(((TLRPC.TL_secureRequiredType) arrayList.get(1)).type)) : LocaleController.getString(R.string.PassportResidentialAddress);
            }
            wm0Var.a(string, !z11);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
            wm0Var.a(LocaleController.getString(R.string.PassportPhone), !z11);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
            wm0Var.a(LocaleController.getString(R.string.PassportEmail), !z11);
        }
        if (i10 == 8) {
            LinearLayout linearLayout = this.Y;
            linearLayout.addView(wm0Var, linearLayout.getChildCount() - 5, h7.z5.n(-1, -2));
        } else {
            this.Y.addView(wm0Var, h7.z5.n(-1, -2));
        }
        wm0Var.setOnClickListener(new ag.u1(arrayList, tL_secureRequiredType, this, z10));
        this.f44507m1.put(tL_secureRequiredType, wm0Var);
        HashMap map = new HashMap();
        HashMap map2 = this.l1;
        map2.put(tL_secureRequiredType, map);
        TLRPC.TL_secureValue tL_secureValueR2 = r1(tL_secureRequiredType, false);
        if (tL_secureValueR2 != null) {
            TLRPC.SecurePlainData securePlainData = tL_secureValueR2.plain_data;
            if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
                str = ((TLRPC.TL_securePlainEmail) securePlainData).email;
            } else if (securePlainData instanceof TLRPC.TL_securePlainPhone) {
                str = ((TLRPC.TL_securePlainPhone) securePlainData).phone;
            } else {
                TLRPC.TL_secureData tL_secureData = tL_secureValueR2.data;
                if (tL_secureData != null) {
                    strH1 = h1(tL_secureData.data, i1(tL_secureData.secret, tL_secureData.data_hash), tL_secureValueR2.data.data_hash);
                    str = null;
                } else {
                    str = null;
                    strH1 = null;
                }
            }
            strH1 = null;
        } else {
            str = null;
            strH1 = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            str2 = str;
            tL_secureRequiredType2 = null;
            str3 = null;
        } else {
            int size2 = arrayList.size();
            String strH2 = null;
            int i13 = 0;
            boolean z14 = false;
            while (i13 < size2) {
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) arrayList.get(i13);
                map2.put(tL_secureRequiredType4, new HashMap());
                this.f44510n1.put(tL_secureRequiredType4, tL_secureRequiredType);
                String str4 = str;
                if (!z14 && (tL_secureValueR1 = r1(tL_secureRequiredType4, false)) != null) {
                    TLRPC.TL_secureData tL_secureData2 = tL_secureValueR1.data;
                    if (tL_secureData2 != null) {
                        strH2 = h1(tL_secureData2.data, i1(tL_secureData2.secret, tL_secureData2.data_hash), tL_secureValueR1.data.data_hash);
                    }
                    tL_secureRequiredType3 = tL_secureRequiredType4;
                    z14 = true;
                }
                i13++;
                str = str4;
            }
            str2 = str;
            if (tL_secureRequiredType3 == null) {
                tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) arrayList.get(0);
            }
            str3 = strH2;
            tL_secureRequiredType2 = tL_secureRequiredType3;
        }
        L1(tL_secureRequiredType, str2, strH1, tL_secureRequiredType2, str3, z10, size);
        return wm0Var;
    }

    public final void V0(ArrayList arrayList) {
        this.f44497g1.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i10);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                S0((TLRPC.TL_secureFile) secureFile, 4);
            }
        }
    }

    public final void W0(boolean z10) {
        if (this.f44487c1) {
            return;
        }
        String str = this.f44508n;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        int i10 = this.f44482b;
        if (zIsEmpty) {
            if (this.f44537y1) {
                if (z10 || (!this.f44484b1 && (i10 == 5 || i10 == 0))) {
                    getParentActivity().setResult(z10 ? -1 : 0);
                }
                this.f44487c1 = true;
                return;
            }
            return;
        }
        if (z10) {
            we.e.p(getParentActivity(), Uri.parse(str + "&tg_passport=success"), true, true);
        } else if (!this.f44484b1 && (i10 == 5 || i10 == 0)) {
            we.e.p(getParentActivity(), Uri.parse(str + "&tg_passport=cancel"), true, true);
        }
        this.f44487c1 = true;
    }

    public final boolean X0(boolean z10) {
        if (u1()) {
            return false;
        }
        if (!z10) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new kl0(this, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DiscardChanges);
        String string = LocaleController.getString(R.string.PassportDiscardChanges);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.P = string;
        showDialog(b2Var);
        return true;
    }

    public final void Y0(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.W == null) {
            return;
        }
        String str = (String) this.U0.get(this.v);
        String str2 = SharedConfig.getCountryLangs().get(this.v);
        int i10 = 0;
        if (!this.A.native_names || TextUtils.isEmpty(this.v) || "EN".equals(str2)) {
            if (this.m0.getVisibility() != 8) {
                this.m0.setVisibility(8);
                this.f44494f0.setVisibility(8);
                this.P.setVisibility(8);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.W;
                    if (i10 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    ((View) editTextBoldCursorArr2[i10].getParent()).setVisibility(8);
                    i10++;
                }
                if (((this.f44485c == 0 && this.B != null) || this.D == null || this.f44518r0) && this.E == null) {
                    this.f44500i0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                    return;
                } else {
                    this.f44500i0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23018b7));
                    return;
                }
            }
            return;
        }
        int i11 = 2;
        if (this.m0.getVisibility() != 0) {
            this.m0.setVisibility(0);
            this.f44494f0.setVisibility(0);
            this.P.setVisibility(0);
            int i12 = 0;
            while (true) {
                editTextBoldCursorArr = this.W;
                if (i12 >= editTextBoldCursorArr.length) {
                    break;
                }
                ((View) editTextBoldCursorArr[i12].getParent()).setVisibility(0);
                i12++;
            }
            if (editTextBoldCursorArr[0].length() == 0 && this.W[1].length() == 0 && this.W[2].length() == 0) {
                int i13 = 0;
                while (true) {
                    boolean[] zArr = this.f44513p0;
                    if (i13 >= zArr.length) {
                        break;
                    }
                    if (zArr[i13]) {
                        this.W[0].setText(this.U[0].getText());
                        this.W[1].setText(this.U[1].getText());
                        this.W[2].setText(this.U[2].getText());
                        break;
                    }
                    i13++;
                }
            }
            this.f44500i0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23018b7));
        }
        this.m0.setText(LocaleController.formatString("PassportNativeInfo", R.string.PassportNativeInfo, str));
        String serverString = str2 != null ? LocaleController.getServerString("PassportLanguage_".concat(str2)) : null;
        if (serverString != null) {
            this.f44494f0.setText(LocaleController.formatString("PassportNativeHeaderLang", R.string.PassportNativeHeaderLang, serverString));
        } else {
            this.f44494f0.setText(LocaleController.getString(R.string.PassportNativeHeader));
        }
        for (int i14 = 0; i14 < 3; i14++) {
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2) {
                        if (serverString != null) {
                            this.W[i14].setHintText(LocaleController.getString(R.string.PassportSurname));
                        } else {
                            this.W[i14].setHintText(LocaleController.formatString("PassportSurnameCountry", R.string.PassportSurnameCountry, str));
                        }
                    }
                } else if (serverString != null) {
                    this.W[i14].setHintText(LocaleController.getString(R.string.PassportMidname));
                } else {
                    this.W[i14].setHintText(LocaleController.formatString("PassportMidnameCountry", R.string.PassportMidnameCountry, str));
                }
            } else if (serverString != null) {
                this.W[i14].setHintText(LocaleController.getString(R.string.PassportName));
            } else {
                this.W[i14].setHintText(LocaleController.formatString("PassportNameCountry", R.string.PassportNameCountry, str));
            }
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new hl0(this, i11));
        }
    }

    public final void a1(boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        String str2;
        if (this.f44506l0 == null) {
            return;
        }
        HashMap map = this.f44522s1;
        HashMap map2 = this.f44526u1;
        if (map == null || (!(z10 || map2.containsKey("error_all")) || (str2 = (String) this.f44522s1.get("error_all")) == null)) {
            spannableStringBuilder = null;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(str2);
            if (z10) {
                map2.put("error_all", "");
            }
        }
        if (this.f44524t1 != null && ((z10 || map2.containsKey("error_document_all")) && (str = (String) this.f44524t1.get("error_all")) != null)) {
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder(str);
            } else {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) str);
            }
            if (z10) {
                map2.put("error_document_all", "");
            }
        }
        if (spannableStringBuilder != null) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false)), 0, spannableStringBuilder.length(), 33);
            this.f44506l0.setText(spannableStringBuilder);
            this.f44506l0.setVisibility(0);
        } else if (this.f44506l0.getVisibility() != 8) {
            this.f44506l0.setVisibility(8);
        }
    }

    public final void b1(Context context) {
        int i10;
        long j10;
        int i11;
        String str;
        String str2;
        String str3;
        this.U0 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] strArrSplit = line.split(";");
                this.U0.put(strArrSplit[1], strArrSplit[2]);
            }
            bufferedReader.close();
            while (true) {
                int i12 = 4;
                if (i11 >= 6) {
                    break;
                }
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.U[i11] = editTextBoldCursor;
                sl0 sl0Var = new sl0(context, editTextBoldCursor, i10);
                sl0Var.setWillNotDraw(false);
                this.Y.addView(sl0Var, h7.z5.n(-1, -2));
                int i13 = org.telegram.ui.ActionBar.g6.f23053d6;
                sl0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                if (i11 == 5) {
                    View view = new View(context);
                    this.O = view;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                    this.Y.addView(this.O, h7.z5.n(-1, 6));
                }
                if (this.f44518r0 && this.B != null) {
                    sl0Var.setVisibility(8);
                    View view2 = this.O;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                }
                this.U[i11].setTag(Integer.valueOf(i11));
                this.U[i11].setSupportRtlHint(true);
                this.U[i11].setTextSize(1, 16.0f);
                this.U[i11].setHintColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
                this.U[i11].setHeaderHintColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L6, false));
                this.U[i11].setTransformHintToHeader(true);
                EditTextBoldCursor editTextBoldCursor2 = this.U[i11];
                int i14 = org.telegram.ui.ActionBar.g6.G6;
                editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
                this.U[i11].setBackgroundDrawable(null);
                this.U[i11].setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
                this.U[i11].setCursorSize(AndroidUtilities.dp(20.0f));
                this.U[i11].setCursorWidth(1.5f);
                this.U[i11].setLineColors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23181k6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23198l6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
                if (i11 == 5) {
                    this.U[i11].setOnTouchListener(new jl0(this, 2));
                    this.U[i11].setInputType(0);
                    this.U[i11].setFocusable(false);
                } else {
                    this.U[i11].setInputType(16385);
                    this.U[i11].setImeOptions(268435461);
                }
                if (i11 == 0) {
                    this.U[i11].setHintText(LocaleController.getString(R.string.PassportStreet1));
                    str = "street_line1";
                } else if (i11 == 1) {
                    this.U[i11].setHintText(LocaleController.getString(R.string.PassportStreet2));
                    str = "street_line2";
                } else if (i11 == 2) {
                    this.U[i11].setHintText(LocaleController.getString(R.string.PassportPostcode));
                    str = "post_code";
                } else if (i11 == 3) {
                    this.U[i11].setHintText(LocaleController.getString(R.string.PassportCity));
                    str = "city";
                } else if (i11 != 4) {
                    if (i11 == 5) {
                        this.U[i11].setHintText(LocaleController.getString(R.string.PassportCountry));
                        str = "country_code";
                    }
                    i11++;
                } else {
                    this.U[i11].setHintText(LocaleController.getString(R.string.PassportState));
                    str = "state";
                }
                J1(this.f44512o1, this.U[i11], str);
                if (i11 == 2) {
                    this.U[i11].addTextChangedListener(new tl0(this, editTextBoldCursor, str));
                    this.U[i11].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
                } else {
                    this.U[i11].addTextChangedListener(new ul0(this, editTextBoldCursor, str, i10));
                }
                EditTextBoldCursor editTextBoldCursor3 = this.U[i11];
                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                this.U[i11].setPadding(0, 0, 0, 0);
                this.U[i11].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                sl0Var.addView(this.U[i11], h7.z5.d(-1, 64.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                this.U[i11].setOnEditorActionListener(new gl0(this, i12));
                i11++;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
        this.f44506l0 = x8Var;
        int i15 = R.drawable.greydivider_top;
        int i16 = org.telegram.ui.ActionBar.g6.f23018b7;
        x8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, i15, i16));
        i10 = 0;
        this.f44506l0.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.Y.addView(this.f44506l0, h7.z5.n(-1, -2));
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
            org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context);
            this.f44494f0 = j4Var;
            j4Var.setText(LocaleController.getString(R.string.PassportDocuments));
            org.telegram.ui.Cells.j4 j4Var2 = this.f44494f0;
            int i17 = org.telegram.ui.ActionBar.g6.f23053d6;
            j4Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
            this.Y.addView(this.f44494f0, h7.z5.n(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.Z = linearLayout;
            linearLayout.setOrientation(1);
            this.Y.addView(this.Z, h7.z5.n(-1, -2));
            org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
            this.N = x9Var;
            x9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
            this.Y.addView(this.N, h7.z5.n(-1, -2));
            this.N.setOnClickListener(new il0(this, 7));
            org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context);
            this.f44502j0 = x8Var2;
            x8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, i16));
            if (this.f44485c != 0) {
                this.f44528v1 = LocaleController.getString(R.string.PassportAddAddressUploadInfo);
            } else {
                TLRPC.SecureValueType secureValueType2 = this.B.type;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                    this.f44528v1 = LocaleController.getString(R.string.PassportAddAgreementInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                    this.f44528v1 = LocaleController.getString(R.string.PassportAddBillInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                    this.f44528v1 = LocaleController.getString(R.string.PassportAddPassportRegistrationInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                    this.f44528v1 = LocaleController.getString(R.string.PassportAddTemporaryRegistrationInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                    this.f44528v1 = LocaleController.getString(R.string.PassportAddBankInfo);
                } else {
                    this.f44528v1 = "";
                }
            }
            String str4 = this.f44528v1;
            HashMap map = this.f44524t1;
            j10 = 0;
            HashMap map2 = this.f44526u1;
            CharSequence charSequence = str4;
            if (map != null && (str3 = (String) map.get("files_all")) != null) {
                charSequence = str4;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) this.f44528v1);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false)), 0, str3.length(), 33);
                map2.put("files_all", "");
                charSequence = spannableStringBuilder;
            }
            charSequence = str4;
            this.f44502j0.setText(charSequence);
            this.Y.addView(this.f44502j0, h7.z5.n(-1, -2));
            if (this.B.translation_required) {
                org.telegram.ui.Cells.j4 j4Var3 = new org.telegram.ui.Cells.j4(context);
                this.f44494f0 = j4Var3;
                j4Var3.setText(LocaleController.getString(R.string.PassportTranslation));
                this.f44494f0.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                this.Y.addView(this.f44494f0, h7.z5.n(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.f44488d0 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.Y.addView(this.f44488d0, h7.z5.n(-1, -2));
                org.telegram.ui.Cells.x9 x9Var2 = new org.telegram.ui.Cells.x9(context);
                this.T = x9Var2;
                x9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                this.Y.addView(this.T, h7.z5.n(-1, -2));
                this.T.setOnClickListener(new il0(this, 8));
                org.telegram.ui.Cells.x8 x8Var3 = new org.telegram.ui.Cells.x8(context);
                this.f44504k0 = x8Var3;
                x8Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, i16));
                if (this.f44485c != 0) {
                    this.f44531w1 = LocaleController.getString(R.string.PassportAddTranslationUploadInfo);
                } else {
                    TLRPC.SecureValueType secureValueType3 = this.B.type;
                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                        this.f44531w1 = LocaleController.getString(R.string.PassportAddTranslationAgreementInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                        this.f44531w1 = LocaleController.getString(R.string.PassportAddTranslationBillInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                        this.f44531w1 = LocaleController.getString(R.string.PassportAddTranslationPassportRegistrationInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                        this.f44531w1 = LocaleController.getString(R.string.PassportAddTranslationTemporaryRegistrationInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                        this.f44531w1 = LocaleController.getString(R.string.PassportAddTranslationBankInfo);
                    } else {
                        this.f44531w1 = "";
                    }
                }
                String str5 = this.f44531w1;
                HashMap map3 = this.f44524t1;
                CharSequence charSequence2 = str5;
                if (map3 != null && (str2 = (String) map3.get("translation_all")) != null) {
                    charSequence2 = str5;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
                    spannableStringBuilder2.append((CharSequence) "\n\n");
                    spannableStringBuilder2.append((CharSequence) this.f44531w1);
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false)), 0, str2.length(), 33);
                    map2.put("translation_all", "");
                    charSequence2 = spannableStringBuilder2;
                }
                charSequence2 = str5;
                this.f44504k0.setText(charSequence2);
                this.Y.addView(this.f44504k0, h7.z5.n(-1, -2));
            }
        } else {
            j10 = 0;
            this.actionBar.setTitle(LocaleController.getString(R.string.PassportAddress));
        }
        org.telegram.ui.Cells.j4 j4Var4 = new org.telegram.ui.Cells.j4(context);
        this.f44494f0 = j4Var4;
        j4Var4.setText(LocaleController.getString(R.string.PassportAddressHeader));
        this.f44494f0.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        this.Y.addView(this.f44494f0, h7.z5.n(-1, -2));
        this.U = new EditTextBoldCursor[6];
        i11 = 0;
        org.telegram.ui.Cells.w6 w6Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
        this.f44498h0 = w6Var;
        this.Y.addView(w6Var, h7.z5.n(-1, -2));
        if (this.f44518r0 && this.B != null) {
            this.f44494f0.setVisibility(8);
            this.f44498h0.setVisibility(8);
        }
        long j11 = this.f44485c;
        TLRPC.TL_secureValue tL_secureValue = this.E;
        if (((j11 == j10 && this.B != null) || this.D == null || this.f44518r0) && tL_secureValue == null) {
            org.telegram.ui.Cells.w6 w6Var2 = this.f44498h0;
            int i18 = R.drawable.greydivider_bottom;
            int i19 = org.telegram.ui.ActionBar.g6.f23018b7;
            w6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, i18, i19));
            if (this.f44518r0 && this.B != null) {
                this.f44502j0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, i19));
            }
        } else {
            if (tL_secureValue != null) {
                T0(tL_secureValue.files);
                V0(tL_secureValue.translation);
            }
            org.telegram.ui.Cells.w6 w6Var3 = this.f44498h0;
            int i20 = R.drawable.greydivider;
            int i21 = org.telegram.ui.ActionBar.g6.f23018b7;
            w6Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, i20, i21));
            org.telegram.ui.Cells.x9 x9Var3 = new org.telegram.ui.Cells.x9(context);
            x9Var3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
            x9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
            if (this.B == null) {
                x9Var3.b(LocaleController.getString(R.string.PassportDeleteInfo), false);
            } else {
                x9Var3.b(LocaleController.getString(R.string.PassportDeleteDocument), false);
            }
            this.Y.addView(x9Var3, h7.z5.n(-1, -2));
            x9Var3.setOnClickListener(new il0(this, 9));
            org.telegram.ui.Cells.w6 w6Var4 = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
            this.f44498h0 = w6Var4;
            w6Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, i21));
            this.Y.addView(this.f44498h0, h7.z5.n(-1, -2));
        }
        S1(0);
        S1(4);
    }

    public final void c1() {
        if (getParentActivity() != null && this.N0 == null) {
            org.telegram.ui.Components.gi giVar = new org.telegram.ui.Components.gi(getParentActivity(), this, false, false);
            this.N0 = giVar;
            giVar.V1 = new dm0(this);
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        TLRPC.User user;
        boolean z10;
        ArrayList arrayList;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        boolean z11;
        boolean z12;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TLRPC.User currentUser;
        org.telegram.ui.Components.gi giVar;
        Context context2 = context;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new gm0(this));
        int i12 = 5;
        int i13 = 2;
        int i14 = this.f44482b;
        if (i14 == 7) {
            org.telegram.ui.ActionBar.v1 v1Var = new org.telegram.ui.ActionBar.v1(this, context2, i12);
            this.X = v1Var;
            this.fragmentView = v1Var;
            v1Var.setFillViewport(true);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.X, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23322s8, false));
        } else {
            FrameLayout frameLayout = new FrameLayout(context2);
            this.fragmentView = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
            gh.q3 q3Var = new gh.q3(context2, i13);
            this.X = q3Var;
            q3Var.setFillViewport(true);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.X, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23322s8, false));
            frameLayout.addView(this.X, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i14 == 0 ? 48.0f : 0.0f));
            LinearLayout linearLayout = new LinearLayout(context2);
            this.Y = linearLayout;
            linearLayout.setOrientation(1);
            this.X.addView(this.Y, new FrameLayout.LayoutParams(-1, -2));
        }
        if (i14 != 0 && i14 != 8) {
            this.H = this.actionBar.n().h(2, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            org.telegram.ui.Components.hq hqVar = new org.telegram.ui.Components.hq(context2, 1);
            this.J = hqVar;
            hqVar.setAlpha(0.0f);
            this.J.setScaleX(0.1f);
            this.J.setScaleY(0.1f);
            this.J.setVisibility(4);
            this.H.addView(this.J, h7.z5.c(-1.0f, -1));
            if ((i14 == 1 || i14 == 2) && (giVar = this.N0) != null) {
                try {
                    if (giVar.isShowing()) {
                        this.N0.dismiss();
                    }
                } catch (Exception unused) {
                }
                this.N0.v1();
                this.N0 = null;
            }
        }
        if (i14 == 5) {
            if (this.f44535y != null) {
                int i15 = 0;
                while (true) {
                    if (i15 >= this.f44535y.users.size()) {
                        currentUser = null;
                        break;
                    }
                    TLRPC.User user2 = this.f44535y.users.get(i15);
                    int i16 = i15;
                    if (user2.f22527id == this.f44485c) {
                        currentUser = user2;
                        break;
                    }
                    i15 = i16 + 1;
                }
            } else {
                currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
            }
            FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
            this.actionBar.setTitle(LocaleController.getString(R.string.TelegramPassport));
            org.telegram.ui.Components.az azVar = new org.telegram.ui.Components.az(context2, null);
            this.B0 = azVar;
            azVar.b();
            frameLayout2.addView(this.B0, h7.z5.c(-1.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context2);
            this.H0 = frameLayout3;
            this.Y.addView(frameLayout3, h7.z5.n(-1, 100));
            org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context2);
            n9Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            this.H0.addView(n9Var, h7.z5.d(64, 64.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
            n9Var.e(currentUser, new org.telegram.ui.Components.y8(0, currentUser));
            org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context2);
            this.C0 = x8Var;
            x8Var.getTextView().setGravity(1);
            if (this.f44485c == 0) {
                this.C0.setText(LocaleController.getString(R.string.PassportSelfRequest));
            } else {
                this.C0.setText(AndroidUtilities.replaceTags(LocaleController.formatString("PassportRequest", R.string.PassportRequest, UserObject.getFirstName(currentUser))));
            }
            ((FrameLayout.LayoutParams) this.C0.getTextView().getLayoutParams()).gravity = 1;
            this.Y.addView(this.C0, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
            ImageView imageView = new ImageView(context2);
            this.E0 = imageView;
            imageView.setImageResource(R.drawable.no_password);
            this.E0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
            this.Y.addView(this.E0, h7.z5.t(-2, -2, 49, 0, 13, 0, 0));
            TextView textView = new TextView(context2);
            this.F0 = textView;
            textView.setTextSize(1, 14.0f);
            this.F0.setGravity(1);
            this.F0.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(17.0f));
            this.F0.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
            this.F0.setText(LocaleController.getString(R.string.TelegramPassportCreatePasswordInfo));
            this.Y.addView(this.F0, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 10.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(context2);
            this.G0 = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23301r6, false));
            this.G0.setGravity(17);
            this.G0.setTextSize(1, 16.0f);
            this.G0.setTypeface(AndroidUtilities.bold());
            this.G0.setText(LocaleController.getString(R.string.TelegramPassportCreatePassword));
            this.Y.addView(this.G0, h7.z5.d(-1, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 9.0f, 21.0f, 0.0f));
            this.G0.setOnClickListener(new il0(this, 10));
            this.U = new EditTextBoldCursor[1];
            this.V = new ViewGroup[]{new FrameLayout(context2)};
            this.Y.addView(this.V[0], h7.z5.n(-1, 50));
            this.V[0].setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            this.U[0] = new EditTextBoldCursor(context2);
            this.U[0].setTag(0);
            this.U[0].setTextSize(1, 16.0f);
            this.U[0].setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.U[0];
            int i17 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
            this.U[0].setBackgroundDrawable(null);
            this.U[0].setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
            this.U[0].setCursorSize(AndroidUtilities.dp(20.0f));
            this.U[0].setCursorWidth(1.5f);
            this.U[0].setInputType(129);
            this.U[0].setMaxLines(1);
            this.U[0].setLines(1);
            this.U[0].setSingleLine(true);
            this.U[0].setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.U[0].setTypeface(Typeface.DEFAULT);
            this.U[0].setImeOptions(268435462);
            this.U[0].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            this.U[0].setGravity(LocaleController.isRTL ? 5 : 3);
            this.V[0].addView(this.U[0], h7.z5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            this.U[0].setOnEditorActionListener(new gl0(this, 5));
            this.U[0].setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.j0(3));
            org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context2);
            this.D0 = x8Var2;
            x8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
            this.D0.setText(LocaleController.formatString("PassportRequestPasswordInfo", R.string.PassportRequestPasswordInfo, new Object[0]));
            this.Y.addView(this.D0, h7.z5.n(-1, -2));
            TextView textView3 = new TextView(context2);
            this.I0 = textView3;
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
            this.I0.setTextSize(1, 14.0f);
            this.I0.setText(LocaleController.getString(R.string.ForgotPassword));
            this.I0.setPadding(0, 0, 0, 0);
            this.Y.addView(this.I0, h7.z5.t(-2, 30, (LocaleController.isRTL ? 5 : 3) | 48, 21, 0, 21, 0));
            this.I0.setOnClickListener(new il0(this, 11));
            R1();
        } else if (i14 == 0) {
            if (this.f44535y == null) {
                user = null;
                break;
            }
            int i18 = 0;
            while (true) {
                if (i18 >= this.f44535y.users.size()) {
                    user = null;
                    break;
                }
                TLRPC.User user3 = this.f44535y.users.get(i18);
                if (user3.f22527id == this.f44485c) {
                    user = user3;
                    break;
                }
                i18++;
            }
            FrameLayout frameLayout4 = (FrameLayout) this.fragmentView;
            this.actionBar.setTitle(LocaleController.getString(R.string.TelegramPassport));
            this.actionBar.n().a(1, R.drawable.msg_info);
            if (user != null) {
                FrameLayout frameLayout5 = new FrameLayout(context2);
                this.Y.addView(frameLayout5, h7.z5.n(-1, 100));
                org.telegram.ui.Components.n9 n9Var2 = new org.telegram.ui.Components.n9(context2);
                n9Var2.setRoundRadius(AndroidUtilities.dp(32.0f));
                frameLayout5.addView(n9Var2, h7.z5.d(64, 64.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
                n9Var2.e(user, new org.telegram.ui.Components.y8(0, user));
                org.telegram.ui.Cells.x8 x8Var3 = new org.telegram.ui.Cells.x8(context2);
                this.f44502j0 = x8Var3;
                x8Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context2, R.drawable.greydivider_top, org.telegram.ui.ActionBar.g6.f23018b7));
                this.f44502j0.setText(AndroidUtilities.replaceTags(LocaleController.formatString("PassportRequest", R.string.PassportRequest, UserObject.getFirstName(user))));
                this.f44502j0.getTextView().setGravity(1);
                ((FrameLayout.LayoutParams) this.f44502j0.getTextView().getLayoutParams()).gravity = 1;
                this.Y.addView(this.f44502j0, h7.z5.n(-1, -2));
            }
            org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context2);
            this.f44494f0 = j4Var;
            j4Var.setText(LocaleController.getString(R.string.PassportRequestedInformation));
            this.f44494f0.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            this.Y.addView(this.f44494f0, h7.z5.n(-1, -2));
            TL_account.authorizationForm authorizationform = this.f44535y;
            if (authorizationform != null) {
                int size = authorizationform.required_types.size();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                boolean z13 = false;
                int i19 = 0;
                boolean z14 = false;
                int i20 = 0;
                for (int i21 = 0; i21 < size; i21++) {
                    TLRPC.SecureRequiredType secureRequiredType = this.f44535y.required_types.get(i21);
                    if (secureRequiredType instanceof TLRPC.TL_secureRequiredType) {
                        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) secureRequiredType;
                        if (v1(tL_secureRequiredType3.type)) {
                            arrayList4.add(tL_secureRequiredType3);
                            i19++;
                        } else if (t1(tL_secureRequiredType3.type)) {
                            arrayList5.add(tL_secureRequiredType3);
                            i20++;
                        } else {
                            TLRPC.SecureValueType secureValueType = tL_secureRequiredType3.type;
                            if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                                z13 = true;
                            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                                z14 = true;
                            }
                        }
                    } else if (secureRequiredType instanceof TLRPC.TL_secureRequiredTypeOneOf) {
                        TLRPC.TL_secureRequiredTypeOneOf tL_secureRequiredTypeOneOf = (TLRPC.TL_secureRequiredTypeOneOf) secureRequiredType;
                        if (!tL_secureRequiredTypeOneOf.types.isEmpty()) {
                            TLRPC.SecureRequiredType secureRequiredType2 = tL_secureRequiredTypeOneOf.types.get(0);
                            if (secureRequiredType2 instanceof TLRPC.TL_secureRequiredType) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) secureRequiredType2;
                                if (v1(tL_secureRequiredType4.type)) {
                                    int size2 = tL_secureRequiredTypeOneOf.types.size();
                                    for (int i22 = 0; i22 < size2; i22++) {
                                        TLRPC.SecureRequiredType secureRequiredType3 = tL_secureRequiredTypeOneOf.types.get(i22);
                                        if (secureRequiredType3 instanceof TLRPC.TL_secureRequiredType) {
                                            arrayList4.add((TLRPC.TL_secureRequiredType) secureRequiredType3);
                                        }
                                    }
                                    i19++;
                                } else if (t1(tL_secureRequiredType4.type)) {
                                    int size3 = tL_secureRequiredTypeOneOf.types.size();
                                    for (int i23 = 0; i23 < size3; i23++) {
                                        TLRPC.SecureRequiredType secureRequiredType4 = tL_secureRequiredTypeOneOf.types.get(i23);
                                        if (secureRequiredType4 instanceof TLRPC.TL_secureRequiredType) {
                                            arrayList5.add((TLRPC.TL_secureRequiredType) secureRequiredType4);
                                        }
                                    }
                                    i20++;
                                }
                            }
                        }
                    }
                }
                boolean z15 = !z13 || i19 > 1;
                boolean z16 = !z14 || i20 > 1;
                for (int i24 = 0; i24 < size; i24++) {
                    TLRPC.SecureRequiredType secureRequiredType5 = this.f44535y.required_types.get(i24);
                    if (secureRequiredType5 instanceof TLRPC.TL_secureRequiredType) {
                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) secureRequiredType5;
                        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType5.type;
                        if ((secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) || (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail)) {
                            tL_secureRequiredType2 = tL_secureRequiredType5;
                            arrayList = null;
                            z11 = false;
                        } else {
                            if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                                if (z15) {
                                    arrayList3 = null;
                                } else {
                                    arrayList3 = arrayList4;
                                }
                                arrayList = arrayList3;
                                z11 = false;
                            } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                                if (z16) {
                                    arrayList3 = null;
                                } else {
                                    arrayList3 = arrayList5;
                                }
                                arrayList = arrayList3;
                                z11 = false;
                            } else {
                                if (z15 && v1(secureValueType2)) {
                                    arrayList2 = new ArrayList();
                                    arrayList2.add(tL_secureRequiredType5);
                                    tL_secureRequiredType5 = new TLRPC.TL_secureRequiredType();
                                    tL_secureRequiredType5.type = new TLRPC.TL_secureValueTypePersonalDetails();
                                } else if (z16 && t1(tL_secureRequiredType5.type)) {
                                    arrayList2 = new ArrayList();
                                    arrayList2.add(tL_secureRequiredType5);
                                    tL_secureRequiredType5 = new TLRPC.TL_secureRequiredType();
                                    tL_secureRequiredType5.type = new TLRPC.TL_secureValueTypeAddress();
                                }
                                arrayList = arrayList2;
                                z11 = true;
                            }
                            tL_secureRequiredType2 = tL_secureRequiredType5;
                        }
                        if (i24 == size - 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        U0(context, tL_secureRequiredType2, arrayList, z11, z12);
                    } else if (secureRequiredType5 instanceof TLRPC.TL_secureRequiredTypeOneOf) {
                        TLRPC.TL_secureRequiredTypeOneOf tL_secureRequiredTypeOneOf2 = (TLRPC.TL_secureRequiredTypeOneOf) secureRequiredType5;
                        if (!tL_secureRequiredTypeOneOf2.types.isEmpty()) {
                            TLRPC.SecureRequiredType secureRequiredType6 = tL_secureRequiredTypeOneOf2.types.get(0);
                            if (secureRequiredType6 instanceof TLRPC.TL_secureRequiredType) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = (TLRPC.TL_secureRequiredType) secureRequiredType6;
                                if ((z15 && v1(tL_secureRequiredType6.type)) || (z16 && t1(tL_secureRequiredType6.type))) {
                                    arrayList = new ArrayList();
                                    int size4 = tL_secureRequiredTypeOneOf2.types.size();
                                    for (int i25 = 0; i25 < size4; i25++) {
                                        TLRPC.SecureRequiredType secureRequiredType7 = tL_secureRequiredTypeOneOf2.types.get(i25);
                                        if (secureRequiredType7 instanceof TLRPC.TL_secureRequiredType) {
                                            arrayList.add((TLRPC.TL_secureRequiredType) secureRequiredType7);
                                        }
                                    }
                                    if (v1(tL_secureRequiredType6.type)) {
                                        tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                                        tL_secureRequiredType.type = new TLRPC.TL_secureValueTypePersonalDetails();
                                    } else {
                                        tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                                        tL_secureRequiredType.type = new TLRPC.TL_secureValueTypeAddress();
                                    }
                                    tL_secureRequiredType2 = tL_secureRequiredType;
                                    z11 = true;
                                    if (i24 == size - 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    U0(context, tL_secureRequiredType2, arrayList, z11, z12);
                                }
                            }
                        }
                    }
                }
                context2 = context;
            }
            if (user != null) {
                org.telegram.ui.Cells.x8 x8Var4 = new org.telegram.ui.Cells.x8(context2);
                this.f44502j0 = x8Var4;
                x8Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                org.telegram.ui.Cells.x8 x8Var5 = this.f44502j0;
                int i26 = org.telegram.ui.ActionBar.g6.B6;
                x8Var5.setLinkTextColorKey(i26);
                if (TextUtils.isEmpty(this.f44535y.privacy_policy_url)) {
                    z10 = false;
                    this.f44502j0.setText(AndroidUtilities.replaceTags(LocaleController.formatString("PassportNoPolicy", R.string.PassportNoPolicy, UserObject.getFirstName(user), user.username)));
                } else {
                    String string = LocaleController.formatString("PassportPolicy", R.string.PassportPolicy, UserObject.getFirstName(user), user.username);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    int iIndexOf = string.indexOf(42);
                    int iLastIndexOf = string.lastIndexOf(42);
                    if (iIndexOf != -1 && iLastIndexOf != -1) {
                        this.f44502j0.getTextView().setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(iLastIndexOf, iLastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(iIndexOf, iIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new nm0(this), iIndexOf, iLastIndexOf - 1, 33);
                    }
                    this.f44502j0.setText(spannableStringBuilder);
                    z10 = false;
                }
                this.f44502j0.getTextView().setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, i26, z10));
                this.f44502j0.getTextView().setGravity(1);
                this.Y.addView(this.f44502j0, h7.z5.n(-1, -2));
            }
            FrameLayout frameLayout6 = new FrameLayout(context2);
            this.M = frameLayout6;
            frameLayout6.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23312rh, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23331sh, false)));
            frameLayout4.addView(this.M, h7.z5.e(-1, 48, 80));
            this.M.setOnClickListener(new il0(this, 15));
            TextView textView4 = new TextView(context2);
            this.K = textView4;
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(8.0f));
            this.K.setCompoundDrawablesWithIntrinsicBounds(R.drawable.authorize, 0, 0, 0);
            this.K.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.th, false));
            this.K.setText(LocaleController.getString(R.string.PassportAuthorize));
            this.K.setTextSize(1, 14.0f);
            this.K.setGravity(17);
            this.K.setTypeface(AndroidUtilities.bold());
            this.M.addView(this.K, h7.z5.e(-2, -1, 17));
            org.telegram.ui.Components.hq hqVar2 = new org.telegram.ui.Components.hq(context2, 0);
            this.L = hqVar2;
            hqVar2.setVisibility(4);
            this.M.addView(this.L, h7.z5.c(-1.0f, -1));
            View view = new View(context2);
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            frameLayout4.addView(view, h7.z5.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        } else if (i14 == 1) {
            e1(context);
            if (this.f44479a == null) {
                this.f44479a = m1();
            }
        } else if (i14 == 2) {
            b1(context);
            if (this.f44479a == null) {
                this.f44479a = m1();
            }
        } else if (i14 == 3) {
            g1(context);
        } else {
            int i27 = 6;
            if (i14 == 4) {
                this.actionBar.setTitle(LocaleController.getString(R.string.PassportEmail));
                if (TextUtils.isEmpty(this.Z0)) {
                    i10 = -1;
                } else {
                    org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context2);
                    x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
                    x9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                    x9Var.b(LocaleController.formatString("PassportPhoneUseSame", R.string.PassportPhoneUseSame, this.Z0), false);
                    this.Y.addView(x9Var, h7.z5.n(-1, -2));
                    x9Var.setOnClickListener(new il0(this, i27));
                    org.telegram.ui.Cells.x8 x8Var6 = new org.telegram.ui.Cells.x8(context2);
                    this.f44502j0 = x8Var6;
                    x8Var6.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                    this.f44502j0.setText(LocaleController.getString(R.string.PassportPhoneUseSameEmailInfo));
                    i10 = -1;
                    this.Y.addView(this.f44502j0, h7.z5.n(-1, -2));
                }
                this.U = new EditTextBoldCursor[1];
                FrameLayout frameLayout7 = new FrameLayout(context2);
                this.Y.addView(frameLayout7, h7.z5.n(i10, 50));
                frameLayout7.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                this.U[0] = new EditTextBoldCursor(context2);
                this.U[0].setTag(0);
                this.U[0].setTextSize(1, 16.0f);
                this.U[0].setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
                EditTextBoldCursor editTextBoldCursor2 = this.U[0];
                int i28 = org.telegram.ui.ActionBar.g6.G6;
                editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i28, false));
                this.U[0].setBackgroundDrawable(null);
                this.U[0].setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i28, false));
                this.U[0].setCursorSize(AndroidUtilities.dp(20.0f));
                this.U[0].setCursorWidth(1.5f);
                this.U[0].setInputType(33);
                this.U[0].setImeOptions(268435462);
                this.U[0].setHint(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                TLRPC.TL_secureValue tL_secureValue = this.D;
                if (tL_secureValue != null) {
                    TLRPC.SecurePlainData securePlainData = tL_secureValue.plain_data;
                    if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
                        TLRPC.TL_securePlainEmail tL_securePlainEmail = (TLRPC.TL_securePlainEmail) securePlainData;
                        if (TextUtils.isEmpty(tL_securePlainEmail.email)) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                            this.U[0].setText(tL_securePlainEmail.email);
                        }
                    } else {
                        i11 = 0;
                    }
                } else {
                    i11 = 0;
                }
                EditTextBoldCursor editTextBoldCursor3 = this.U[i11];
                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                this.U[i11].setPadding(i11, i11, i11, AndroidUtilities.dp(6.0f));
                this.U[i11].setGravity(LocaleController.isRTL ? 5 : 3);
                frameLayout7.addView(this.U[i11], h7.z5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                this.U[i11].setOnEditorActionListener(new gl0(this, 3));
                org.telegram.ui.Cells.x8 x8Var7 = new org.telegram.ui.Cells.x8(context2);
                this.f44502j0 = x8Var7;
                x8Var7.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                this.f44502j0.setText(LocaleController.getString(R.string.PassportEmailUploadInfo));
                this.Y.addView(this.f44502j0, h7.z5.n(-1, -2));
            } else {
                HashMap map = this.f44512o1;
                if (i14 == 6) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PassportEmail));
                    this.U = new EditTextBoldCursor[1];
                    FrameLayout frameLayout8 = new FrameLayout(context2);
                    this.Y.addView(frameLayout8, h7.z5.n(-1, 50));
                    frameLayout8.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                    this.U[0] = new EditTextBoldCursor(context2);
                    this.U[0].setTag(0);
                    this.U[0].setTextSize(1, 16.0f);
                    this.U[0].setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
                    EditTextBoldCursor editTextBoldCursor4 = this.U[0];
                    int i29 = org.telegram.ui.ActionBar.g6.G6;
                    editTextBoldCursor4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i29, false));
                    this.U[0].setBackgroundDrawable(null);
                    this.U[0].setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i29, false));
                    this.U[0].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.U[0].setCursorWidth(1.5f);
                    this.U[0].setInputType(3);
                    this.U[0].setImeOptions(268435462);
                    this.U[0].setHint(LocaleController.getString(R.string.PassportEmailCode));
                    EditTextBoldCursor editTextBoldCursor5 = this.U[0];
                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                    this.U[0].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                    this.U[0].setGravity(LocaleController.isRTL ? 5 : 3);
                    frameLayout8.addView(this.U[0], h7.z5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                    this.U[0].setOnEditorActionListener(new gl0(this, i27));
                    this.U[0].addTextChangedListener(new p0(this, 12));
                    org.telegram.ui.Cells.x8 x8Var8 = new org.telegram.ui.Cells.x8(context2);
                    this.f44502j0 = x8Var8;
                    x8Var8.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                    this.f44502j0.setText(LocaleController.formatString("PassportEmailVerifyInfo", R.string.PassportEmailVerifyInfo, map.get("email")));
                    this.Y.addView(this.f44502j0, h7.z5.n(-1, -2));
                } else if (i14 == 7) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PassportPhone));
                    FrameLayout frameLayout9 = new FrameLayout(context2);
                    this.X.addView(frameLayout9, h7.z5.x(-1, -2, 51));
                    for (int i30 = 0; i30 < 3; i30++) {
                        tm0 tm0Var = new tm0(this, context2, i30 + 2);
                        org.telegram.ui.Components.ev0[] ev0VarArr = this.F1;
                        ev0VarArr[i30] = tm0Var;
                        tm0Var.setVisibility(8);
                        frameLayout9.addView(ev0VarArr[i30], h7.z5.d(-1, -1.0f, 51, AndroidUtilities.isTablet() ? 26.0f : 18.0f, 30.0f, AndroidUtilities.isTablet() ? 26.0f : 18.0f, 0.0f));
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("phone", (String) map.get("phone"));
                    l1(bundle, this.G, false);
                } else if (i14 == 8) {
                    f1(context);
                }
            }
        }
        return this.fragmentView;
    }

    public final void d1() {
        boolean[] zArr = {true};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new nl0(0, this, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string;
        boolean z10 = this.f44518r0;
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.A;
        if (z10 && this.B == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeAddress)) {
            b2Var.P = LocaleController.getString(R.string.PassportDeleteAddressAlert);
        } else if (z10 && this.B == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            b2Var.P = LocaleController.getString(R.string.PassportDeletePersonalAlert);
        } else {
            b2Var.P = LocaleController.getString(R.string.PassportDeleteDocumentAlert);
        }
        if (!this.f44518r0 && this.B != null) {
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(getParentActivity(), 1);
            y1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                y1Var.e(LocaleController.getString(R.string.PassportDeleteDocumentAddress), "", true, false, false);
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                y1Var.e(LocaleController.getString(R.string.PassportDeleteDocumentPersonal), "", true, false, false);
            }
            y1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            frameLayout.addView(y1Var, h7.z5.e(-1, 48, 51));
            y1Var.setOnClickListener(new m8(4, zArr));
            alertDialog$Builder.n(frameLayout);
        }
        showDialog(b2Var);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        EditTextBoldCursor editTextBoldCursor;
        vm0 vm0Var;
        org.telegram.ui.ActionBar.v0 v0Var;
        if (i10 != NotificationCenter.fileUploaded) {
            if (i10 != NotificationCenter.fileUploadFailed && i10 == NotificationCenter.twoStepPasswordChanged) {
                if (objArr == null || objArr.length <= 0) {
                    this.F = null;
                    w1();
                } else {
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
                }
                R1();
                return;
            }
            return;
        }
        String str = (String) objArr[0];
        HashMap map = this.f44505k1;
        SecureDocument secureDocument = (SecureDocument) map.get(str);
        if (secureDocument != null) {
            secureDocument.inputFile = (TLRPC.TL_inputFile) objArr[1];
            map.remove(str);
            if (map.isEmpty() && (v0Var = this.H) != null) {
                v0Var.setEnabled(true);
                this.H.setAlpha(1.0f);
            }
            HashMap map2 = this.f44503j1;
            if (map2 != null && (vm0Var = (vm0) map2.get(secureDocument)) != null) {
                vm0Var.a(true);
            }
            HashMap map3 = this.f44526u1;
            if (map3 != null && map3.containsKey("error_document_all")) {
                map3.remove("error_document_all");
                a1(false);
            }
            int i12 = secureDocument.type;
            if (i12 == 0) {
                if (this.f44502j0 != null && !TextUtils.isEmpty(this.f44528v1)) {
                    this.f44502j0.setText(this.f44528v1);
                }
                map3.remove("files_all");
                return;
            }
            if (i12 == 4) {
                if (this.f44504k0 != null && !TextUtils.isEmpty(this.f44531w1)) {
                    this.f44504k0.setText(this.f44531w1);
                }
                map3.remove("translation_all");
            }
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.gi giVar = this.N0;
        if (giVar == null || this.visibleDialog != giVar) {
            super.dismissCurrentDialog();
            return;
        }
        giVar.f28650f0.a0(false);
        this.N0.dismissInternal();
        this.N0.f28650f0.d0(true);
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.N0 && super.dismissDialogOnPause(dialog);
    }

    public final void e1(Context context) {
        boolean z10;
        int i10;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        long j10;
        int i11;
        int i12;
        int i13;
        String str;
        String str2;
        String str3;
        this.U0 = new HashMap();
        ?? r10 = 1;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] strArrSplit = line.split(";");
                this.U0.put(strArrSplit[1], strArrSplit[2]);
            }
            bufferedReader.close();
            while (true) {
                HashMap map = this.f44512o1;
                if (i13 >= i12) {
                    org.telegram.ui.Cells.w6 w6Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
                    this.f44500i0 = w6Var;
                    this.Y.addView(w6Var, h7.z5.n(-1, -2));
                    org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context);
                    this.f44494f0 = j4Var;
                    j4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                    this.Y.addView(this.f44494f0, h7.z5.n(-1, -2));
                    this.W = new EditTextBoldCursor[3];
                    int i14 = 0;
                    for (int i15 = 3; i14 < i15; i15 = 3) {
                        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                        this.W[i14] = editTextBoldCursor;
                        sl0 sl0Var = new sl0(context, editTextBoldCursor, 2);
                        sl0Var.setWillNotDraw(false);
                        this.Y.addView(sl0Var, h7.z5.n(-1, 64));
                        int i16 = org.telegram.ui.ActionBar.g6.f23053d6;
                        sl0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                        if (i14 == 2) {
                            View view = new View(context);
                            this.P = view;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                            this.Y.addView(this.P, h7.z5.n(-1, 6));
                        }
                        this.W[i14].setTag(Integer.valueOf(i14));
                        this.W[i14].setSupportRtlHint(true);
                        this.W[i14].setTextSize(1, 16.0f);
                        this.W[i14].setHintColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
                        EditTextBoldCursor editTextBoldCursor2 = this.W[i14];
                        int i17 = org.telegram.ui.ActionBar.g6.G6;
                        editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                        this.W[i14].setHeaderHintColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L6, false));
                        this.W[i14].setTransformHintToHeader(true);
                        this.W[i14].setBackgroundDrawable(null);
                        this.W[i14].setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                        this.W[i14].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.W[i14].setCursorWidth(1.5f);
                        this.W[i14].setLineColors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23181k6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23198l6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
                        this.W[i14].setInputType(16385);
                        this.W[i14].setImeOptions(268435461);
                        if (i14 == 0) {
                            str = "first_name_native";
                        } else if (i14 != 1) {
                            if (i14 == 2) {
                                str = "last_name_native";
                            }
                            i14++;
                        } else {
                            str = "middle_name_native";
                        }
                        J1(map, this.W[i14], str);
                        EditTextBoldCursor editTextBoldCursor3 = this.W[i14];
                        editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                        if (i14 == 0 || i14 == 2 || i14 == 1) {
                            this.W[i14].addTextChangedListener(new ul0(this, editTextBoldCursor, str, 1));
                        }
                        this.W[i14].setPadding(0, 0, 0, 0);
                        this.W[i14].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                        sl0Var.addView(this.W[i14], h7.z5.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                        this.W[i14].setOnEditorActionListener(new gl0(this, 2));
                        i14++;
                    }
                    org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
                    this.m0 = x8Var;
                    this.Y.addView(x8Var, h7.z5.n(-1, -2));
                    long j11 = this.f44485c;
                    TLRPC.TL_secureValue tL_secureValue = this.E;
                    if (((j11 == j10 && this.B != null) || this.D == null || this.f44518r0) && tL_secureValue == null) {
                        this.m0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                    } else {
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
                        org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
                        x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
                        x9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                        if (this.B == null) {
                            x9Var.b(LocaleController.getString(R.string.PassportDeleteInfo), false);
                        } else {
                            x9Var.b(LocaleController.getString(R.string.PassportDeleteDocument), false);
                        }
                        this.Y.addView(x9Var, h7.z5.n(-1, -2));
                        x9Var.setOnClickListener(new il0(this, 1));
                        org.telegram.ui.Cells.x8 x8Var2 = this.m0;
                        int i18 = R.drawable.greydivider;
                        int i19 = org.telegram.ui.ActionBar.g6.f23018b7;
                        x8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, i18, i19));
                        org.telegram.ui.Cells.w6 w6Var2 = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
                        this.f44498h0 = w6Var2;
                        w6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, i19));
                        this.Y.addView(this.f44498h0, h7.z5.n(-1, -2));
                    }
                    P1();
                    Y0(false);
                    return;
                }
                EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
                this.U[i13] = editTextBoldCursor4;
                sl0 sl0Var2 = new sl0(context, editTextBoldCursor4, 1);
                sl0Var2.setWillNotDraw(z10);
                this.Y.addView(sl0Var2, h7.z5.n(i10, 64));
                int i20 = org.telegram.ui.ActionBar.g6.f23053d6;
                sl0Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i20, z10));
                if (i13 == i12 - 1) {
                    View view2 = new View(context);
                    this.O = view2;
                    view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i20, z10));
                    this.Y.addView(this.O, h7.z5.n(i10, 6));
                }
                if (this.f44518r0 && this.B != null && i13 < i11) {
                    sl0Var2.setVisibility(8);
                    View view3 = this.O;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                }
                this.U[i13].setTag(Integer.valueOf(i13));
                this.U[i13].setSupportRtlHint(r10);
                this.U[i13].setTextSize(r10, 16.0f);
                this.U[i13].setHintColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
                EditTextBoldCursor editTextBoldCursor5 = this.U[i13];
                int i21 = org.telegram.ui.ActionBar.g6.G6;
                editTextBoldCursor5.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i21, false));
                this.U[i13].setHeaderHintColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L6, false));
                this.U[i13].setTransformHintToHeader(r10);
                this.U[i13].setBackgroundDrawable(null);
                this.U[i13].setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i21, false));
                this.U[i13].setCursorSize(AndroidUtilities.dp(20.0f));
                this.U[i13].setCursorWidth(1.5f);
                this.U[i13].setLineColors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23181k6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23198l6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
                if (i13 == 5 || i13 == 6) {
                    this.U[i13].setOnTouchListener(new jl0(this, 0));
                    this.U[i13].setInputType(0);
                } else if (i13 == 3 || i13 == 8) {
                    this.U[i13].setOnTouchListener(new lh.p1(7, this, context));
                    this.U[i13].setInputType(0);
                    this.U[i13].setFocusable(false);
                } else if (i13 == 4) {
                    this.U[i13].setOnTouchListener(new jl0(this, 1));
                    this.U[i13].setInputType(0);
                    this.U[i13].setFocusable(false);
                } else {
                    this.U[i13].setInputType(16385);
                    this.U[i13].setImeOptions(268435461);
                }
                HashMap map2 = this.f44514p1;
                switch (i13) {
                    case 0:
                        if (tL_secureRequiredType.native_names) {
                            this.U[i13].setHintText(LocaleController.getString(R.string.PassportNameLatin));
                        } else {
                            this.U[i13].setHintText(LocaleController.getString(R.string.PassportName));
                        }
                        str2 = "first_name";
                        J1(map, this.U[i13], str2);
                        EditTextBoldCursor editTextBoldCursor6 = this.U[i13];
                        editTextBoldCursor6.setSelection(editTextBoldCursor6.length());
                        if (i13 != 0 || i13 == 2 || i13 == 1) {
                            this.U[i13].addTextChangedListener(new wl0(this, editTextBoldCursor4, str2));
                        } else {
                            this.U[i13].addTextChangedListener(new org.telegram.ui.Components.sw0(this, editTextBoldCursor4, str2, map));
                        }
                        this.U[i13].setPadding(0, 0, 0, 0);
                        this.U[i13].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                        sl0Var2.addView(this.U[i13], h7.z5.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                        this.U[i13].setOnEditorActionListener(new gl0(this, 1));
                        break;
                    case 1:
                        if (tL_secureRequiredType.native_names) {
                            this.U[i13].setHintText(LocaleController.getString(R.string.PassportMidnameLatin));
                        } else {
                            this.U[i13].setHintText(LocaleController.getString(R.string.PassportMidname));
                        }
                        str2 = "middle_name";
                        J1(map, this.U[i13], str2);
                        EditTextBoldCursor editTextBoldCursor7 = this.U[i13];
                        editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
                        if (i13 != 0) {
                            this.U[i13].addTextChangedListener(new wl0(this, editTextBoldCursor4, str2));
                        } else {
                            this.U[i13].addTextChangedListener(new wl0(this, editTextBoldCursor4, str2));
                        }
                        this.U[i13].setPadding(0, 0, 0, 0);
                        this.U[i13].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                        sl0Var2.addView(this.U[i13], h7.z5.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                        this.U[i13].setOnEditorActionListener(new gl0(this, 1));
                        break;
                    case 2:
                        if (tL_secureRequiredType.native_names) {
                            this.U[i13].setHintText(LocaleController.getString(R.string.PassportSurnameLatin));
                        } else {
                            this.U[i13].setHintText(LocaleController.getString(R.string.PassportSurname));
                        }
                        str2 = "last_name";
                        J1(map, this.U[i13], str2);
                        EditTextBoldCursor editTextBoldCursor8 = this.U[i13];
                        editTextBoldCursor8.setSelection(editTextBoldCursor8.length());
                        if (i13 != 0) {
                            this.U[i13].addTextChangedListener(new wl0(this, editTextBoldCursor4, str2));
                        } else {
                            this.U[i13].addTextChangedListener(new wl0(this, editTextBoldCursor4, str2));
                        }
                        this.U[i13].setPadding(0, 0, 0, 0);
                        this.U[i13].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                        sl0Var2.addView(this.U[i13], h7.z5.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                        this.U[i13].setOnEditorActionListener(new gl0(this, 1));
                        break;
                    case 3:
                        this.U[i13].setHintText(LocaleController.getString(R.string.PassportBirthdate));
                        str2 = "birth_date";
                        J1(map, this.U[i13], str2);
                        EditTextBoldCursor editTextBoldCursor9 = this.U[i13];
                        editTextBoldCursor9.setSelection(editTextBoldCursor9.length());
                        if (i13 != 0) {
                            this.U[i13].addTextChangedListener(new wl0(this, editTextBoldCursor4, str2));
                        } else {
                            this.U[i13].addTextChangedListener(new wl0(this, editTextBoldCursor4, str2));
                        }
                        this.U[i13].setPadding(0, 0, 0, 0);
                        this.U[i13].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                        sl0Var2.addView(this.U[i13], h7.z5.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                        this.U[i13].setOnEditorActionListener(new gl0(this, 1));
                        break;
                    case 4:
                        this.U[i13].setHintText(LocaleController.getString(R.string.PassportGender));
                        str2 = "gender";
                        J1(map, this.U[i13], str2);
                        EditTextBoldCursor editTextBoldCursor10 = this.U[i13];
                        editTextBoldCursor10.setSelection(editTextBoldCursor10.length());
                        if (i13 != 0) {
                            this.U[i13].addTextChangedListener(new wl0(this, editTextBoldCursor4, str2));
                        } else {
                            this.U[i13].addTextChangedListener(new wl0(this, editTextBoldCursor4, str2));
                        }
                        this.U[i13].setPadding(0, 0, 0, 0);
                        this.U[i13].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                        sl0Var2.addView(this.U[i13], h7.z5.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                        this.U[i13].setOnEditorActionListener(new gl0(this, 1));
                        break;
                    case 5:
                        this.U[i13].setHintText(LocaleController.getString(R.string.PassportCitizenship));
                        str2 = "country_code";
                        J1(map, this.U[i13], str2);
                        EditTextBoldCursor editTextBoldCursor11 = this.U[i13];
                        editTextBoldCursor11.setSelection(editTextBoldCursor11.length());
                        if (i13 != 0) {
                            this.U[i13].addTextChangedListener(new wl0(this, editTextBoldCursor4, str2));
                        } else {
                            this.U[i13].addTextChangedListener(new wl0(this, editTextBoldCursor4, str2));
                        }
                        this.U[i13].setPadding(0, 0, 0, 0);
                        this.U[i13].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                        sl0Var2.addView(this.U[i13], h7.z5.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                        this.U[i13].setOnEditorActionListener(new gl0(this, 1));
                        break;
                    case 6:
                        this.U[i13].setHintText(LocaleController.getString(R.string.PassportResidence));
                        str2 = "residence_country_code";
                        J1(map, this.U[i13], str2);
                        EditTextBoldCursor editTextBoldCursor12 = this.U[i13];
                        editTextBoldCursor12.setSelection(editTextBoldCursor12.length());
                        if (i13 != 0) {
                            this.U[i13].addTextChangedListener(new wl0(this, editTextBoldCursor4, str2));
                        } else {
                            this.U[i13].addTextChangedListener(new wl0(this, editTextBoldCursor4, str2));
                        }
                        this.U[i13].setPadding(0, 0, 0, 0);
                        this.U[i13].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                        sl0Var2.addView(this.U[i13], h7.z5.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                        this.U[i13].setOnEditorActionListener(new gl0(this, 1));
                        break;
                    case 7:
                        this.U[i13].setHintText(LocaleController.getString(R.string.PassportDocumentNumber));
                        str2 = "document_no";
                        map = map2;
                        J1(map, this.U[i13], str2);
                        EditTextBoldCursor editTextBoldCursor13 = this.U[i13];
                        editTextBoldCursor13.setSelection(editTextBoldCursor13.length());
                        if (i13 != 0) {
                            this.U[i13].addTextChangedListener(new wl0(this, editTextBoldCursor4, str2));
                        } else {
                            this.U[i13].addTextChangedListener(new wl0(this, editTextBoldCursor4, str2));
                        }
                        this.U[i13].setPadding(0, 0, 0, 0);
                        this.U[i13].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                        sl0Var2.addView(this.U[i13], h7.z5.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                        this.U[i13].setOnEditorActionListener(new gl0(this, 1));
                        break;
                    case 8:
                        this.U[i13].setHintText(LocaleController.getString(R.string.PassportExpired));
                        str2 = "expiry_date";
                        map = map2;
                        J1(map, this.U[i13], str2);
                        EditTextBoldCursor editTextBoldCursor14 = this.U[i13];
                        editTextBoldCursor14.setSelection(editTextBoldCursor14.length());
                        if (i13 != 0) {
                            this.U[i13].addTextChangedListener(new wl0(this, editTextBoldCursor4, str2));
                        } else {
                            this.U[i13].addTextChangedListener(new wl0(this, editTextBoldCursor4, str2));
                        }
                        this.U[i13].setPadding(0, 0, 0, 0);
                        this.U[i13].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                        sl0Var2.addView(this.U[i13], h7.z5.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                        this.U[i13].setOnEditorActionListener(new gl0(this, 1));
                        break;
                }
                i13++;
                r10 = 1;
                i11 = 7;
                z10 = false;
                i10 = -1;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        org.telegram.ui.Cells.x8 x8Var3 = new org.telegram.ui.Cells.x8(context);
        this.f44506l0 = x8Var3;
        int i22 = R.drawable.greydivider_top;
        int i23 = org.telegram.ui.ActionBar.g6.f23018b7;
        x8Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, i22, i23));
        z10 = false;
        this.f44506l0.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        i10 = -1;
        this.Y.addView(this.f44506l0, h7.z5.n(-1, -2));
        a1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.B;
        tL_secureRequiredType = this.A;
        if (tL_secureRequiredType2 != null) {
            org.telegram.ui.Cells.j4 j4Var2 = new org.telegram.ui.Cells.j4(context);
            this.f44494f0 = j4Var2;
            if (this.f44518r0) {
                j4Var2.setText(LocaleController.getString(R.string.PassportDocuments));
            } else {
                j4Var2.setText(LocaleController.getString(R.string.PassportRequiredDocuments));
            }
            org.telegram.ui.Cells.j4 j4Var3 = this.f44494f0;
            int i24 = org.telegram.ui.ActionBar.g6.f23053d6;
            j4Var3.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i24, false));
            this.Y.addView(this.f44494f0, h7.z5.n(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f44480a0 = linearLayout;
            linearLayout.setOrientation(1);
            this.Y.addView(this.f44480a0, h7.z5.n(-1, -2));
            org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
            this.Q = w8Var;
            w8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
            this.Y.addView(this.Q, h7.z5.n(-1, -2));
            this.Q.setOnClickListener(new il0(this, 0));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.f44483b0 = linearLayout2;
            linearLayout2.setOrientation(1);
            this.Y.addView(this.f44483b0, h7.z5.n(-1, -2));
            boolean z11 = this.B.selfie_required;
            org.telegram.ui.Cells.w8 w8Var2 = new org.telegram.ui.Cells.w8(context);
            this.R = w8Var2;
            w8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
            j10 = 0;
            this.R.a(LocaleController.getString(R.string.PassportReverseSide), LocaleController.getString(R.string.PassportReverseSideInfo), z11);
            this.Y.addView(this.R, h7.z5.n(-1, -2));
            this.R.setOnClickListener(new il0(this, 2));
            if (this.B.selfie_required) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.f44486c0 = linearLayout3;
                linearLayout3.setOrientation(1);
                this.Y.addView(this.f44486c0, h7.z5.n(-1, -2));
                org.telegram.ui.Cells.w8 w8Var3 = new org.telegram.ui.Cells.w8(context);
                this.S = w8Var3;
                w8Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                this.S.a(LocaleController.getString(R.string.PassportSelfie), LocaleController.getString(R.string.PassportSelfieInfo), tL_secureRequiredType.translation_required);
                this.Y.addView(this.S, h7.z5.n(-1, -2));
                this.S.setOnClickListener(new il0(this, 3));
            }
            org.telegram.ui.Cells.x8 x8Var4 = new org.telegram.ui.Cells.x8(context);
            this.f44502j0 = x8Var4;
            x8Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, i23));
            this.f44502j0.setText(LocaleController.getString(R.string.PassportPersonalUploadInfo));
            this.Y.addView(this.f44502j0, h7.z5.n(-1, -2));
            if (this.B.translation_required) {
                org.telegram.ui.Cells.j4 j4Var4 = new org.telegram.ui.Cells.j4(context);
                this.f44494f0 = j4Var4;
                j4Var4.setText(LocaleController.getString(R.string.PassportTranslation));
                this.f44494f0.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i24, false));
                this.Y.addView(this.f44494f0, h7.z5.n(-1, -2));
                LinearLayout linearLayout4 = new LinearLayout(context);
                this.f44488d0 = linearLayout4;
                linearLayout4.setOrientation(1);
                this.Y.addView(this.f44488d0, h7.z5.n(-1, -2));
                org.telegram.ui.Cells.x9 x9Var2 = new org.telegram.ui.Cells.x9(context);
                this.T = x9Var2;
                x9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                this.Y.addView(this.T, h7.z5.n(-1, -2));
                this.T.setOnClickListener(new il0(this, 4));
                org.telegram.ui.Cells.x8 x8Var5 = new org.telegram.ui.Cells.x8(context);
                this.f44504k0 = x8Var5;
                x8Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, i23));
                if (this.f44485c != 0) {
                    this.f44531w1 = LocaleController.getString(R.string.PassportAddTranslationUploadInfo);
                } else {
                    TLRPC.SecureValueType secureValueType = this.B.type;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
                        this.f44531w1 = LocaleController.getString(R.string.PassportAddPassportInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                        this.f44531w1 = LocaleController.getString(R.string.PassportAddInternalPassportInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                        this.f44531w1 = LocaleController.getString(R.string.PassportAddIdentityCardInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                        this.f44531w1 = LocaleController.getString(R.string.PassportAddDriverLicenceInfo);
                    } else {
                        this.f44531w1 = "";
                    }
                }
                String str4 = this.f44531w1;
                HashMap map3 = this.f44524t1;
                CharSequence charSequence = str4;
                if (map3 != null && (str3 = (String) map3.get("translation_all")) != null) {
                    charSequence = str4;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                    spannableStringBuilder.append((CharSequence) this.f44531w1);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false)), 0, str3.length(), 33);
                    this.f44526u1.put("translation_all", "");
                    charSequence = spannableStringBuilder;
                }
                charSequence = str4;
                this.f44504k0.setText(charSequence);
                this.Y.addView(this.f44504k0, h7.z5.n(-1, -2));
            }
        } else {
            j10 = 0;
            org.telegram.ui.Cells.x9 x9Var3 = new org.telegram.ui.Cells.x9(context);
            this.f44509n0 = x9Var3;
            x9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
            this.f44509n0.b(LocaleController.getString(R.string.PassportScanPassport), false);
            this.Y.addView(this.f44509n0, h7.z5.n(-1, -2));
            this.f44509n0.setOnClickListener(new il0(this, 5));
            org.telegram.ui.Cells.x8 x8Var6 = new org.telegram.ui.Cells.x8(context);
            this.f44502j0 = x8Var6;
            x8Var6.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, i23));
            this.f44502j0.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            this.Y.addView(this.f44502j0, h7.z5.n(-1, -2));
        }
        org.telegram.ui.Cells.j4 j4Var5 = new org.telegram.ui.Cells.j4(context);
        this.f44494f0 = j4Var5;
        if (this.f44518r0) {
            j4Var5.setText(LocaleController.getString(R.string.PassportDocument));
        } else {
            j4Var5.setText(LocaleController.getString(R.string.PassportPersonal));
        }
        this.f44494f0.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        this.Y.addView(this.f44494f0, h7.z5.n(-1, -2));
        i11 = 7;
        i12 = this.B != null ? 9 : 7;
        this.U = new EditTextBoldCursor[i12];
        i13 = 0;
    }

    public final void f1(Context context) {
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        xm0 xm0Var = this;
        Context context2 = context;
        xm0Var.actionBar.setTitle(LocaleController.getString(R.string.TelegramPassport));
        xm0Var.actionBar.n().a(1, R.drawable.msg_info);
        org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context2);
        xm0Var.f44494f0 = j4Var;
        j4Var.setText(LocaleController.getString(R.string.PassportProvidedInformation));
        xm0Var.f44494f0.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        xm0Var.Y.addView(xm0Var.f44494f0, h7.z5.n(-1, -2));
        org.telegram.ui.Cells.w6 w6Var = new org.telegram.ui.Cells.w6(context2, (org.telegram.messenger.rl) null);
        xm0Var.f44498h0 = w6Var;
        int i10 = R.drawable.greydivider;
        int i11 = org.telegram.ui.ActionBar.g6.f23018b7;
        w6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context2, i10, i11));
        xm0Var.Y.addView(xm0Var.f44498h0, h7.z5.n(-1, -2));
        org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context2);
        xm0Var.f44523t0 = x9Var;
        x9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
        xm0Var.f44523t0.b(LocaleController.getString(R.string.PassportNoDocumentsAdd), true);
        xm0Var.Y.addView(xm0Var.f44523t0, h7.z5.n(-1, -2));
        xm0Var.f44523t0.setOnClickListener(new il0(xm0Var, 12));
        org.telegram.ui.Cells.x9 x9Var2 = new org.telegram.ui.Cells.x9(context2);
        xm0Var.f44525u0 = x9Var2;
        x9Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
        xm0Var.f44525u0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
        xm0Var.f44525u0.b(LocaleController.getString(R.string.TelegramPassportDelete), false);
        xm0Var.Y.addView(xm0Var.f44525u0, h7.z5.n(-1, -2));
        xm0Var.f44525u0.setOnClickListener(new il0(xm0Var, 13));
        org.telegram.ui.Cells.w6 w6Var2 = new org.telegram.ui.Cells.w6(context2, (org.telegram.messenger.rl) null);
        xm0Var.f44527v0 = w6Var2;
        w6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context2, R.drawable.greydivider_bottom, i11));
        xm0Var.Y.addView(xm0Var.f44527v0, h7.z5.n(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context2);
        xm0Var.f44530w0 = linearLayout;
        linearLayout.setOrientation(1);
        xm0Var.f44530w0.setGravity(17);
        xm0Var.f44530w0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context2, R.drawable.greydivider_bottom, i11));
        if (AndroidUtilities.isTablet()) {
            xm0Var.Y.addView(xm0Var.f44530w0, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(528.0f) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        } else {
            xm0Var.Y.addView(xm0Var.f44530w0, new LinearLayout.LayoutParams(-1, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        ImageView imageView = new ImageView(context2);
        xm0Var.f44533x0 = imageView;
        imageView.setImageResource(R.drawable.no_passport);
        xm0Var.f44533x0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ci, false), PorterDuff.Mode.MULTIPLY));
        xm0Var.f44530w0.addView(xm0Var.f44533x0, h7.z5.n(-2, -2));
        TextView textView = new TextView(context2);
        xm0Var.f44536y0 = textView;
        int i12 = org.telegram.ui.ActionBar.g6.f23441z6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        xm0Var.f44536y0.setGravity(17);
        xm0Var.f44536y0.setTextSize(1, 15.0f);
        xm0Var.f44536y0.setTypeface(AndroidUtilities.bold());
        xm0Var.f44536y0.setText(LocaleController.getString(R.string.PassportNoDocuments));
        TextView textViewI = org.telegram.ui.Cells.pa.i(xm0Var.f44530w0, xm0Var.f44536y0, h7.z5.t(-2, -2, 17, 0, 16, 0, 0), context2);
        xm0Var.f44538z0 = textViewI;
        textViewI.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        xm0Var.f44538z0.setGravity(17);
        xm0Var.f44538z0.setTextSize(1, 14.0f);
        xm0Var.f44538z0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        xm0Var.f44538z0.setText(LocaleController.getString(R.string.PassportNoDocumentsInfo));
        TextView textViewI2 = org.telegram.ui.Cells.pa.i(xm0Var.f44530w0, xm0Var.f44538z0, h7.z5.t(-2, -2, 17, 0, 14, 0, 0), context2);
        xm0Var.A0 = textViewI2;
        int i13 = org.telegram.ui.ActionBar.g6.q6;
        textViewI2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        xm0Var.A0.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        xm0Var.A0.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i13, false), 32), 7, -1));
        xm0Var.A0.setGravity(17);
        xm0Var.A0.setTextSize(1, 15.0f);
        xm0Var.A0.setTypeface(AndroidUtilities.bold());
        xm0Var.A0.setGravity(17);
        xm0Var.A0.setText(LocaleController.getString(R.string.PassportNoDocumentsAdd).toUpperCase());
        xm0Var.f44530w0.addView(xm0Var.A0, h7.z5.t(-2, 30, 17, 0, 12, 0, 0));
        xm0Var.A0.setOnClickListener(new il0(xm0Var, 14));
        int size = xm0Var.f44535y.values.size();
        int i14 = 0;
        while (i14 < size) {
            TLRPC.TL_secureValue tL_secureValue = xm0Var.f44535y.values.get(i14);
            if (v1(tL_secureValue.type)) {
                arrayList = new ArrayList();
                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = tL_secureValue.type;
                tL_secureRequiredType2.selfie_required = true;
                tL_secureRequiredType2.translation_required = true;
                arrayList.add(tL_secureRequiredType2);
                tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType.type = new TLRPC.TL_secureValueTypePersonalDetails();
            } else {
                if (t1(tL_secureValue.type)) {
                    arrayList = new ArrayList();
                    TLRPC.TL_secureRequiredType tL_secureRequiredType3 = new TLRPC.TL_secureRequiredType();
                    tL_secureRequiredType3.type = tL_secureValue.type;
                    tL_secureRequiredType3.translation_required = true;
                    arrayList.add(tL_secureRequiredType3);
                    tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                    tL_secureRequiredType.type = new TLRPC.TL_secureValueTypeAddress();
                } else {
                    TLRPC.TL_secureRequiredType tL_secureRequiredType4 = new TLRPC.TL_secureRequiredType();
                    tL_secureRequiredType4.type = tL_secureValue.type;
                    tL_secureRequiredType = tL_secureRequiredType4;
                    arrayList = null;
                    z10 = false;
                }
                if (i14 == size - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                xm0Var.U0(context2, tL_secureRequiredType, arrayList, z10, z11);
                i14++;
                xm0Var = this;
                context2 = context;
            }
            z10 = true;
            if (i14 == size - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            xm0Var.U0(context2, tL_secureRequiredType, arrayList, z10, z11);
            i14++;
            xm0Var = this;
            context2 = context;
        }
        Q1();
    }

    public final void g1(Context context) {
        String str;
        ViewGroup frameLayout;
        this.actionBar.setTitle(LocaleController.getString(R.string.PassportPhone));
        this.U0 = new HashMap();
        int i10 = 3;
        int i11 = 1;
        int i12 = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] strArrSplit = line.split(";");
                this.Q0.add(0, strArrSplit[2]);
                this.R0.put(strArrSplit[2], strArrSplit[0]);
                this.S0.put(strArrSplit[0], strArrSplit[2]);
                if (strArrSplit.length > 3) {
                    this.T0.put(strArrSplit[0], strArrSplit[3]);
                }
                this.U0.put(strArrSplit[1], strArrSplit[2]);
            }
            bufferedReader.close();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        Collections.sort(this.Q0, new a5.f(11));
        String str2 = UserConfig.getInstance(this.currentAccount).getCurrentUser().phone;
        org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
        String upperCase = null;
        x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
        x9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
        x9Var.b(LocaleController.formatString("PassportPhoneUseSame", R.string.PassportPhoneUseSame, oe.b.c().b("+" + str2)), false);
        this.Y.addView(x9Var, h7.z5.n(-1, -2));
        x9Var.setOnClickListener(new il0(this, 16));
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
        this.f44502j0 = x8Var;
        x8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
        this.f44502j0.setText(LocaleController.getString(R.string.PassportPhoneUseSameInfo));
        this.Y.addView(this.f44502j0, h7.z5.n(-1, -2));
        org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context);
        this.f44494f0 = j4Var;
        j4Var.setText(LocaleController.getString(R.string.PassportPhoneUseOther));
        this.f44494f0.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        this.Y.addView(this.f44494f0, h7.z5.n(-1, -2));
        this.U = new EditTextBoldCursor[3];
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 2) {
                this.U[i13] = new org.telegram.ui.Components.u30(context);
            } else {
                this.U[i13] = new EditTextBoldCursor(context);
            }
            if (i13 == 1) {
                frameLayout = org.telegram.messenger.y1.g(context, 0);
                this.Y.addView(frameLayout, h7.z5.n(-1, 50));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            } else if (i13 == 2) {
                frameLayout = (ViewGroup) this.U[1].getParent();
            } else {
                frameLayout = new FrameLayout(context);
                this.Y.addView(frameLayout, h7.z5.n(-1, 50));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            }
            this.U[i13].setTag(Integer.valueOf(i13));
            this.U[i13].setTextSize(1, 16.0f);
            this.U[i13].setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.U[i13];
            int i14 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
            this.U[i13].setBackgroundDrawable(null);
            this.U[i13].setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
            this.U[i13].setCursorSize(AndroidUtilities.dp(20.0f));
            this.U[i13].setCursorWidth(1.5f);
            if (i13 == 0) {
                this.U[i13].setOnTouchListener(new jl0(this, i10));
                this.U[i13].setText(LocaleController.getString(R.string.ChooseCountry));
                this.U[i13].setInputType(0);
                this.U[i13].setFocusable(false);
            } else {
                this.U[i13].setInputType(3);
                if (i13 == 2) {
                    this.U[i13].setImeOptions(268435462);
                } else {
                    this.U[i13].setImeOptions(268435461);
                }
            }
            EditTextBoldCursor editTextBoldCursor2 = this.U[i13];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            if (i13 == 1) {
                TextView textView = new TextView(context);
                this.f44521s0 = textView;
                textView.setText("+");
                this.f44521s0.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
                this.f44521s0.setTextSize(1, 16.0f);
                frameLayout.addView(this.f44521s0, h7.z5.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                this.U[i13].setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
                this.U[i13].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                this.U[i13].setGravity(19);
                frameLayout.addView(this.U[i13], h7.z5.k(0.0f, 12.0f, 16.0f, 6.0f, 55, -2));
                this.U[i13].addTextChangedListener(new lm0(this));
            } else if (i13 == 2) {
                this.U[i13].setPadding(0, 0, 0, 0);
                this.U[i13].setGravity(19);
                this.U[i13].setHintText(null);
                this.U[i13].setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                frameLayout.addView(this.U[i13], h7.z5.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                this.U[i13].addTextChangedListener(new tr(this, i10));
            } else {
                this.U[i13].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                this.U[i13].setGravity(LocaleController.isRTL ? 5 : 3);
                frameLayout.addView(this.U[i13], h7.z5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            }
            this.U[i13].setOnEditorActionListener(new gl0(this, i12));
            if (i13 == 2) {
                this.U[i13].setOnKeyListener(new mg(this, i11));
            }
            if (i13 == 0) {
                View view = new View(context);
                this.f44496g0.add(view);
                view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23054d7, false));
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
            }
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (telephonyManager != null) {
                upperCase = telephonyManager.getSimCountryIso().toUpperCase();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (upperCase != null && (str = (String) this.U0.get(upperCase)) != null && this.Q0.indexOf(str) != -1) {
            this.U[1].setText((CharSequence) this.R0.get(str));
        }
        org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context);
        this.f44502j0 = x8Var2;
        x8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
        this.f44502j0.setText(LocaleController.getString(R.string.PassportPhoneUploadInfo));
        this.Y.addView(this.f44502j0, h7.z5.n(-1, -2));
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23322s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.X, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        View view = this.O;
        int i12 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i12));
        View view2 = this.P;
        if (view2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(view2, 1, null, null, null, null, i12));
        }
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = this.f44496g0;
            if (i13 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6((View) arrayList2.get(i13), 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
            i13++;
        }
        Iterator it = this.f44503j1.entrySet().iterator();
        while (it.hasNext()) {
            vm0 vm0Var = (vm0) ((Map.Entry) it.next()).getValue();
            arrayList.add(new org.telegram.ui.ActionBar.i6(vm0Var, 268435456, new Class[]{vm0.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(vm0Var, 0, new Class[]{vm0.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(vm0Var, 0, new Class[]{vm0.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23441z6));
        }
        int i14 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 268435456, new Class[]{org.telegram.ui.Cells.w8.class}, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.g6.f23441z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 268435456, new Class[]{org.telegram.ui.Cells.x9.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        int i17 = org.telegram.ui.ActionBar.g6.f23018b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 268435456, new Class[]{wm0.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 4, new Class[]{wm0.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 4, new Class[]{wm0.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 4, new Class[]{wm0.class}, new String[]{"valueTextView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 8, new Class[]{wm0.class}, new String[]{"checkImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 16, new Class[]{org.telegram.ui.Cells.j4.class}, null, null, null, i14));
        int i18 = org.telegram.ui.ActionBar.g6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        if (this.U != null) {
            int i19 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.U;
                if (i19 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.i6((View) editTextBoldCursorArr[i19].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.U[i19], 16777220, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.U[i19], 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.U[i19], 8390656, null, null, null, null, org.telegram.ui.ActionBar.g6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.U[i19], 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f23181k6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.U[i19], 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f23198l6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.U[i19], 2080, null, null, null, null, org.telegram.ui.ActionBar.g6.f23269p7));
                i19++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4, null, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 8390656, null, null, null, null, i18));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f23181k6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f23198l6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 2080, null, null, null, null, org.telegram.ui.ActionBar.g6.f23269p7));
        }
        if (this.W != null) {
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.W;
                if (i11 >= editTextBoldCursorArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.i6((View) editTextBoldCursorArr2[i11].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.W[i11], 16777220, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.W[i11], 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.W[i11], 8390656, null, null, null, null, org.telegram.ui.ActionBar.g6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.W[i11], 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f23181k6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.W[i11], 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f23198l6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.W[i11], 2080, null, null, null, null, org.telegram.ui.ActionBar.g6.f23269p7));
                i11++;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B0, 2048, null, null, null, null, org.telegram.ui.ActionBar.g6.f23125h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E0, 8, null, null, null, null, org.telegram.ui.ActionBar.g6.Xd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.F0, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.G0, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23301r6));
        TextView textView = this.I0;
        int i20 = org.telegram.ui.ActionBar.g6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44521s0, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.K, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.th));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f23312rh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f23331sh));
        org.telegram.ui.Components.hq hqVar = this.J;
        int i21 = org.telegram.ui.ActionBar.g6.D7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(hqVar, 0, null, null, null, null, i21));
        org.telegram.ui.Components.hq hqVar2 = this.J;
        int i22 = org.telegram.ui.ActionBar.g6.E7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(hqVar2, 0, null, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, 0, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, 0, null, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44533x0, 8, null, null, null, null, org.telegram.ui.ActionBar.g6.Ci));
        TextView textView2 = this.f44536y0;
        int i23 = org.telegram.ui.ActionBar.g6.f23441z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView2, 4, null, null, null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44538z0, 4, null, null, null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A0, 4, null, null, null, null, i20));
        return arrayList;
    }

    public final byte[] i1(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32 || bArr2 == null || bArr2.length != 32) {
            return null;
        }
        byte[] bArr3 = new byte[32];
        System.arraycopy(this.f44481a1, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(this.f44481a1, 32, bArr4, 0, 16);
        byte[] bArr5 = new byte[32];
        System.arraycopy(this.Y0, 0, bArr5, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr5, bArr3, bArr4, 0, 32, 0, 0);
        if (!Z0(bArr5, null)) {
            return null;
        }
        byte[] bArrComputeSHA512 = Utilities.computeSHA512(bArr5, bArr2);
        byte[] bArr6 = new byte[32];
        System.arraycopy(bArrComputeSHA512, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(bArrComputeSHA512, 32, bArr7, 0, 16);
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
        if (!z11 || tL_secureRequiredType2 == null) {
            if (z10) {
                deletesecurevalue.types.add(tL_secureRequiredType.type);
            }
            if (tL_secureRequiredType2 != null) {
                deletesecurevalue.types.add(tL_secureRequiredType2.type);
            }
        } else {
            deletesecurevalue.types.add(tL_secureRequiredType2.type);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletesecurevalue, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                final xm0 xm0Var = this.f41380a;
                final mm0 mm0Var = kl0Var;
                final boolean z12 = z11;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType3 = tL_secureRequiredType2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                final boolean z13 = z10;
                final ArrayList arrayList2 = arrayList;
                final Runnable runnable = hl0Var;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String strH1;
                        TLRPC.TL_secureData tL_secureData;
                        xm0 xm0Var2 = xm0Var;
                        TLRPC.TL_error tL_error2 = tL_error;
                        String strH2 = null;
                        if (tL_error2 != null) {
                            mm0 mm0Var2 = mm0Var;
                            if (mm0Var2 != null) {
                                mm0Var2.S(tL_error2.text, null);
                            }
                            xm0Var2.M1(LocaleController.getString(R.string.AppName), tL_error2.text);
                            return;
                        }
                        boolean z14 = z12;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType3;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType4;
                        boolean z15 = z13;
                        if (!z14) {
                            if (z15) {
                                xm0Var2.H1(tL_secureRequiredType6);
                            }
                            xm0Var2.H1(tL_secureRequiredType5);
                        } else if (tL_secureRequiredType5 != null) {
                            xm0Var2.H1(tL_secureRequiredType5);
                        } else {
                            xm0Var2.H1(tL_secureRequiredType6);
                        }
                        if (xm0Var2.f44482b == 8) {
                            wm0 wm0Var = (wm0) xm0Var2.f44507m1.remove(tL_secureRequiredType6);
                            if (wm0Var != null) {
                                xm0Var2.Y.removeView(wm0Var);
                                LinearLayout linearLayout = xm0Var2.Y;
                                View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 6);
                                if (childAt instanceof wm0) {
                                    ((wm0) childAt).setNeedDivider(false);
                                }
                            }
                            xm0Var2.Q1();
                        } else {
                            ArrayList arrayList3 = arrayList2;
                            if (tL_secureRequiredType5 == null || arrayList3 == null || arrayList3.size() <= 1) {
                                strH1 = null;
                            } else {
                                int size = arrayList3.size();
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= size) {
                                        strH1 = null;
                                        break;
                                    }
                                    TLRPC.TL_secureRequiredType tL_secureRequiredType7 = (TLRPC.TL_secureRequiredType) arrayList3.get(i10);
                                    TLRPC.TL_secureValue tL_secureValueR1 = xm0Var2.r1(tL_secureRequiredType7, false);
                                    if (tL_secureValueR1 != null) {
                                        TLRPC.TL_secureData tL_secureData2 = tL_secureValueR1.data;
                                        strH1 = tL_secureData2 != null ? xm0.h1(tL_secureData2.data, xm0Var2.i1(tL_secureData2.secret, tL_secureData2.data_hash), tL_secureValueR1.data.data_hash) : null;
                                        tL_secureRequiredType5 = tL_secureRequiredType7;
                                        break;
                                    }
                                    i10++;
                                }
                                if (tL_secureRequiredType5 == null) {
                                    tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) arrayList3.get(0);
                                }
                            }
                            if (z15) {
                                xm0Var2.L1(tL_secureRequiredType6, null, null, tL_secureRequiredType5, strH1, z14, arrayList3 != null ? arrayList3.size() : 0);
                            } else {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType8 = tL_secureRequiredType5;
                                String str = strH1;
                                TLRPC.TL_secureValue tL_secureValueR2 = xm0Var2.r1(tL_secureRequiredType6, false);
                                if (tL_secureValueR2 != null && (tL_secureData = tL_secureValueR2.data) != null) {
                                    strH2 = xm0.h1(tL_secureData.data, xm0Var2.i1(tL_secureData.secret, tL_secureData.data_hash), tL_secureValueR2.data.data_hash);
                                }
                                xm0Var2.L1(tL_secureRequiredType6, null, strH2, tL_secureRequiredType8, str, z14, arrayList3 != null ? arrayList3.size() : 0);
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

    public final af.h k1(byte[] bArr) {
        byte[] bArrP1 = p1();
        int iNextInt = Utilities.random.nextInt(208) + 32;
        while ((bArr.length + iNextInt) % 16 != 0) {
            iNextInt++;
        }
        byte[] bArr2 = new byte[iNextInt];
        Utilities.random.nextBytes(bArr2);
        bArr2[0] = (byte) iNextInt;
        int length = iNextInt + bArr.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, iNextInt);
        System.arraycopy(bArr, 0, bArr3, iNextInt, bArr.length);
        byte[] bArrComputeSHA256 = Utilities.computeSHA256(bArr3);
        byte[] bArrComputeSHA512 = Utilities.computeSHA512(bArrP1, bArrComputeSHA256);
        byte[] bArr4 = new byte[32];
        System.arraycopy(bArrComputeSHA512, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(bArrComputeSHA512, 32, bArr5, 0, 16);
        Utilities.aesCbcEncryptionByteArraySafe(bArr3, bArr4, bArr5, 0, length, 0, 1);
        byte[] bArr6 = new byte[32];
        System.arraycopy(this.f44481a1, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(this.f44481a1, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(this.Y0, 0, bArr8, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        byte[] bArrComputeSHA513 = Utilities.computeSHA512(bArr8, bArrComputeSHA256);
        byte[] bArr9 = new byte[32];
        System.arraycopy(bArrComputeSHA513, 0, bArr9, 0, 32);
        byte[] bArr10 = new byte[16];
        System.arraycopy(bArrComputeSHA513, 32, bArr10, 0, 16);
        byte[] bArr11 = new byte[32];
        System.arraycopy(bArrP1, 0, bArr11, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr11, bArr9, bArr10, 0, 32, 0, 1);
        af.h hVar = new af.h();
        hVar.f276c = bArr3;
        hVar.f274a = bArr11;
        hVar.d = bArrComputeSHA256;
        hVar.f275b = bArrP1;
        hVar.f277e = new SecureDocumentKey(bArr4, bArr5);
        return hVar;
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
        ArrayList arrayList = this.f44492e1;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            sb2.append(((SecureDocument) arrayList.get(i12)).secureFile.f22515id);
        }
        SecureDocument secureDocument = this.f44499h1;
        if (secureDocument != null) {
            sb2.append(secureDocument.secureFile.f22515id);
        }
        SecureDocument secureDocument2 = this.f44501i1;
        if (secureDocument2 != null) {
            sb2.append(secureDocument2.secureFile.f22515id);
        }
        SecureDocument secureDocument3 = this.f44495f1;
        if (secureDocument3 != null) {
            sb2.append(secureDocument3.secureFile.f22515id);
        }
        ArrayList arrayList2 = this.f44497g1;
        int size2 = arrayList2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            sb2.append(((SecureDocument) arrayList2.get(i13)).secureFile.f22515id);
        }
        return sb2.toString();
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            if (i10 == 0 || i10 == 2) {
                c1();
                org.telegram.ui.Components.gi giVar = this.N0;
                if (giVar != null) {
                    giVar.f28650f0.g0(i10, intent, this.M0);
                }
                this.M0 = null;
                return;
            }
            if (i10 == 1) {
                if (intent == null || intent.getData() == null) {
                    if (getParentActivity() == null) {
                        return;
                    }
                    Toast.makeText(getParentActivity(), LocaleController.getString(R.string.UnsupportedAttachment), 0).show();
                } else {
                    ArrayList arrayList = new ArrayList();
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                    sendingMediaInfo.uri = intent.getData();
                    arrayList.add(sendingMediaInfo);
                    G1(arrayList);
                }
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i10 = this.f44482b;
        if (i10 == 7) {
            if (z10) {
                int i11 = this.E1;
                org.telegram.ui.Components.ev0[] ev0VarArr = this.F1;
                ev0VarArr[i11].c(true);
                for (org.telegram.ui.Components.ev0 ev0Var : ev0VarArr) {
                    if (ev0Var != null) {
                        ev0Var.f();
                    }
                }
            }
        } else if (i10 == 0 || i10 == 5) {
            if (z10) {
                W0(false);
            }
        } else if (i10 == 1 || i10 == 2) {
            return !X0(z10);
        }
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        if (this.f44482b == 3 && Build.VERSION.SDK_INT >= 23 && dialog == this.H1) {
            ArrayList arrayList = this.I1;
            if (arrayList.isEmpty()) {
                return;
            }
            getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
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
        org.telegram.ui.Components.gi giVar = this.N0;
        if (giVar != null) {
            giVar.dismissInternal();
            this.N0.v1();
        }
        if (this.f44482b == 7) {
            while (true) {
                org.telegram.ui.Components.ev0[] ev0VarArr = this.F1;
                if (i10 >= ev0VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.ev0 ev0Var = ev0VarArr[i10];
                if (ev0Var != null) {
                    ev0Var.f();
                }
                i10++;
            }
            org.telegram.ui.ActionBar.b2 b2Var = this.G1;
            if (b2Var != null) {
                try {
                    b2Var.dismiss();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                this.G1 = null;
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.gi giVar = this.N0;
        if (giVar != null) {
            giVar.x1();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.gi giVar;
        org.telegram.ui.Cells.x9 x9Var;
        int i11 = this.f44482b;
        if ((i11 != 1 && i11 != 2) || (giVar = this.N0) == null) {
            if (i11 == 3 && i10 == 6) {
                O1(false, this.A1, this.B1, this.C1, this.D1);
                return;
            }
            return;
        }
        if (i10 == 17) {
            giVar.f28650f0.U(false);
            return;
        }
        if (i10 == 21) {
            if (getParentActivity() == null || iArr == null || iArr.length == 0 || iArr[0] == 0) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
            alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new kl0(this, 0));
            i0.a.C(R.string.OK, alertDialog$Builder, null);
            return;
        }
        if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            F1(0);
            return;
        }
        if (i10 != 22 || iArr == null || iArr.length <= 0 || iArr[0] != 0 || (x9Var = this.f44509n0) == null) {
            return;
        }
        x9Var.callOnClick();
    }

    @Override
    public final void onResume() {
        ViewGroup[] viewGroupArr;
        ViewGroup viewGroup;
        super.onResume();
        org.telegram.ui.Components.gi giVar = this.N0;
        if (giVar != null) {
            giVar.y1();
        }
        if (this.f44482b == 5 && (viewGroupArr = this.V) != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
            this.U[0].requestFocus();
            AndroidUtilities.showKeyboard(this.U[0]);
            AndroidUtilities.runOnUIThread(new hl0(this, 0), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (this.f44489d1 != null) {
            AndroidUtilities.runOnUIThread(new hl0(this, 1));
        }
        int i10 = this.f44482b;
        if (i10 == 5) {
            if (z10) {
                if (this.V[0].getVisibility() == 0) {
                    this.U[0].requestFocus();
                    AndroidUtilities.showKeyboard(this.U[0]);
                }
                if (this.J0 == 2) {
                    B1(false);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 7) {
            if (z10) {
                this.F1[this.E1].j();
                return;
            }
            return;
        }
        if (i10 == 4) {
            if (z10) {
                this.U[0].requestFocus();
                AndroidUtilities.showKeyboard(this.U[0]);
                return;
            }
            return;
        }
        if (i10 == 6) {
            if (z10) {
                this.U[0].requestFocus();
                AndroidUtilities.showKeyboard(this.U[0]);
                return;
            }
            return;
        }
        if (i10 == 2 || i10 == 1) {
            c1();
        }
    }

    public final TLRPC.TL_secureValue r1(TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z10) {
        if (tL_secureRequiredType == null) {
            return null;
        }
        int size = this.f44535y.values.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.TL_secureValue tL_secureValue = this.f44535y.values.get(i10);
            if (tL_secureRequiredType.type.getClass() == tL_secureValue.type.getClass()) {
                if (z10) {
                    if (tL_secureRequiredType.selfie_required && !(tL_secureValue.selfie instanceof TLRPC.TL_secureFile)) {
                        return null;
                    }
                    if (tL_secureRequiredType.translation_required && tL_secureValue.translation.isEmpty()) {
                        return null;
                    }
                    if (t1(tL_secureRequiredType.type) && tL_secureValue.files.isEmpty()) {
                        return null;
                    }
                    if (v1(tL_secureRequiredType.type) && !(tL_secureValue.front_side instanceof TLRPC.TL_secureFile)) {
                        return null;
                    }
                    TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
                    if (((secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) || (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard)) && !(tL_secureValue.reverse_side instanceof TLRPC.TL_secureFile)) {
                        return null;
                    }
                    boolean z11 = secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails;
                    if (z11 || (secureValueType instanceof TLRPC.TL_secureValueTypeAddress)) {
                        String[] strArr = z11 ? tL_secureRequiredType.native_names ? new String[]{"first_name_native", "last_name_native", "birth_date", "gender", "country_code", "residence_country_code"} : new String[]{"first_name", "last_name", "birth_date", "gender", "country_code", "residence_country_code"} : new String[]{"street_line1", "street_line2", "post_code", "city", "state", "country_code"};
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
                }
                return tL_secureValue;
            }
        }
        return null;
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.M0 = bundle.getString("path");
    }

    public final boolean s1(Class cls) {
        int size = this.f44535y.values.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f44535y.values.get(i10).type.getClass() == cls) {
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
        String str = this.f44479a;
        return str == null || str.equals(m1());
    }

    public final void w1() {
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ll0(this, 3)), this.classGuid);
    }

    public final void x1() {
        org.telegram.ui.ActionBar.b2 b2Var = this.G1;
        if (b2Var == null) {
            return;
        }
        try {
            b2Var.dismiss();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        this.G1 = null;
    }

    public final void y1() {
        if (getParentActivity() == null || getParentActivity().isFinishing() || this.G1 != null) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
        this.G1 = b2Var;
        b2Var.f22747c0 = false;
        b2Var.show();
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

    public xm0(int i10, long j10, String str, String str2, String str3, String str4, String str5, TL_account.authorizationForm authorizationform, TL_account.Password password) {
        String strO1;
        String str6;
        String str7;
        String str8;
        String strEncodeToString;
        this(i10, authorizationform, password, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (HashMap) null, (HashMap) null);
        this.f44485c = j10;
        this.d = str3;
        this.f44490e = str4;
        this.h = str;
        this.f44517r = str2;
        this.f44508n = str5;
        if (i10 != 0 || authorizationform.errors.isEmpty()) {
            return;
        }
        try {
            Collections.sort(authorizationform.errors, new em0(this));
            int size = authorizationform.errors.size();
            int i11 = 0;
            while (i11 < size) {
                TLRPC.SecureValueError secureValueError = authorizationform.errors.get(i11);
                byte[] bArr = null;
                if (secureValueError instanceof TLRPC.TL_secureValueErrorFrontSide) {
                    TLRPC.TL_secureValueErrorFrontSide tL_secureValueErrorFrontSide = (TLRPC.TL_secureValueErrorFrontSide) secureValueError;
                    strO1 = o1(tL_secureValueErrorFrontSide.type);
                    str6 = tL_secureValueErrorFrontSide.text;
                    bArr = tL_secureValueErrorFrontSide.file_hash;
                    str7 = null;
                    str8 = "front";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorReverseSide) {
                    TLRPC.TL_secureValueErrorReverseSide tL_secureValueErrorReverseSide = (TLRPC.TL_secureValueErrorReverseSide) secureValueError;
                    strO1 = o1(tL_secureValueErrorReverseSide.type);
                    str6 = tL_secureValueErrorReverseSide.text;
                    bArr = tL_secureValueErrorReverseSide.file_hash;
                    str7 = null;
                    str8 = "reverse";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorSelfie) {
                    TLRPC.TL_secureValueErrorSelfie tL_secureValueErrorSelfie = (TLRPC.TL_secureValueErrorSelfie) secureValueError;
                    strO1 = o1(tL_secureValueErrorSelfie.type);
                    str6 = tL_secureValueErrorSelfie.text;
                    bArr = tL_secureValueErrorSelfie.file_hash;
                    str7 = null;
                    str8 = "selfie";
                } else {
                    if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFile) {
                        TLRPC.TL_secureValueErrorTranslationFile tL_secureValueErrorTranslationFile = (TLRPC.TL_secureValueErrorTranslationFile) secureValueError;
                        strO1 = o1(tL_secureValueErrorTranslationFile.type);
                        str6 = tL_secureValueErrorTranslationFile.text;
                        bArr = tL_secureValueErrorTranslationFile.file_hash;
                        str7 = null;
                    } else {
                        if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFiles) {
                            TLRPC.TL_secureValueErrorTranslationFiles tL_secureValueErrorTranslationFiles = (TLRPC.TL_secureValueErrorTranslationFiles) secureValueError;
                            strO1 = o1(tL_secureValueErrorTranslationFiles.type);
                            str6 = tL_secureValueErrorTranslationFiles.text;
                            str7 = null;
                        } else {
                            if (secureValueError instanceof TLRPC.TL_secureValueErrorFile) {
                                TLRPC.TL_secureValueErrorFile tL_secureValueErrorFile = (TLRPC.TL_secureValueErrorFile) secureValueError;
                                strO1 = o1(tL_secureValueErrorFile.type);
                                str6 = tL_secureValueErrorFile.text;
                                bArr = tL_secureValueErrorFile.file_hash;
                                str7 = null;
                            } else if (secureValueError instanceof TLRPC.TL_secureValueErrorFiles) {
                                TLRPC.TL_secureValueErrorFiles tL_secureValueErrorFiles = (TLRPC.TL_secureValueErrorFiles) secureValueError;
                                strO1 = o1(tL_secureValueErrorFiles.type);
                                str6 = tL_secureValueErrorFiles.text;
                                str7 = null;
                            } else if (secureValueError instanceof TLRPC.TL_secureValueError) {
                                TLRPC.TL_secureValueError tL_secureValueError = (TLRPC.TL_secureValueError) secureValueError;
                                strO1 = o1(tL_secureValueError.type);
                                str6 = tL_secureValueError.text;
                                bArr = tL_secureValueError.hash;
                                str7 = null;
                                str8 = "error_all";
                            } else {
                                if (secureValueError instanceof TLRPC.TL_secureValueErrorData) {
                                    TLRPC.TL_secureValueErrorData tL_secureValueErrorData = (TLRPC.TL_secureValueErrorData) secureValueError;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < authorizationform.values.size()) {
                                            TLRPC.TL_secureData tL_secureData = authorizationform.values.get(i12).data;
                                            if (tL_secureData == null || !Arrays.equals(tL_secureData.data_hash, tL_secureValueErrorData.data_hash)) {
                                                i12++;
                                                size = size;
                                            } else {
                                                strO1 = o1(tL_secureValueErrorData.type);
                                                str6 = tL_secureValueErrorData.text;
                                                String str9 = tL_secureValueErrorData.field;
                                                bArr = tL_secureValueErrorData.data_hash;
                                                str7 = str9;
                                                str8 = "data";
                                            }
                                        }
                                    }
                                }
                                size = size;
                            }
                            str8 = "files";
                        }
                        i11++;
                        size = size;
                    }
                    str8 = "translation";
                }
                HashMap map = (HashMap) this.f44516q1.get(strO1);
                if (map == null) {
                    map = new HashMap();
                    this.f44516q1.put(strO1, map);
                    this.f44519r1.put(strO1, str6);
                }
                if (bArr != null) {
                    strEncodeToString = Base64.encodeToString(bArr, 2);
                } else {
                    strEncodeToString = "";
                }
                switch (str8.hashCode()) {
                    case -1840647503:
                        if (str8.equals("translation")) {
                            if (bArr != null) {
                                map.put("translation" + strEncodeToString, str6);
                            } else {
                                map.put("translation_all", str6);
                            }
                        }
                        break;
                    case -906020504:
                        if (str8.equals("selfie")) {
                            map.put("selfie" + strEncodeToString, str6);
                        }
                        break;
                    case 3076010:
                        if (str8.equals("data") && str7 != null) {
                            map.put(str7, str6);
                        }
                        break;
                    case 97434231:
                        if (str8.equals("files")) {
                            if (bArr != null) {
                                map.put("files" + strEncodeToString, str6);
                            } else {
                                map.put("files_all", str6);
                            }
                        }
                        break;
                    case 97705513:
                        if (str8.equals("front")) {
                            map.put("front" + strEncodeToString, str6);
                        }
                        break;
                    case 329856746:
                        if (str8.equals("error_all")) {
                            map.put("error_all", str6);
                        }
                        break;
                    case 1099846370:
                        if (str8.equals("reverse")) {
                            map.put("reverse" + strEncodeToString, str6);
                        }
                        break;
                }
                i11++;
                size = size;
            }
        } catch (Exception unused) {
        }
    }
}
