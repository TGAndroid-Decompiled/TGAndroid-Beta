package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgressView;
public final class vg0 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f43010t0;
    public boolean E;
    public int F;
    public String G;
    public Bundle H;
    public TLRPC.TL_auth_sentCode I;
    public int J;
    public final AnimatorSet[] K;
    public AnimatorSet L;
    public org.telegram.ui.Components.m41 M;
    public org.telegram.ui.Components.q20 N;
    public la.h O;
    public int P;
    public final boolean[] Q;
    public org.telegram.ui.ActionBar.a2 R;
    public u8 S;
    public kg0 T;
    public ImageView U;
    public RadialProgressView V;
    public ImageView W;
    public org.telegram.ui.Components.mj0 X;
    public LinearLayout Y;
    public j0 Z;
    public int f43011a;
    public boolean f43012a0;
    public final org.telegram.ui.Components.zw0[] f43013b;
    public jg0 f43014b0;
    public org.telegram.ui.Components.ms f43015c;
    public boolean f43016c0;
    public ValueAnimator d;
    public Runnable f43017d0;
    public boolean f43018e;
    public gw f43019e0;
    public boolean f43020f;
    public TextView f43021f0;
    public boolean f43022g0;
    public Dialog h;
    public boolean f43023h0;
    public final boolean[] f43024i0;
    public final Runnable[] f43025j0;
    public final boolean[] f43026k0;
    public boolean f43027l0;
    public View m0;
    public Dialog f43028n;
    public boolean f43029n0;
    public boolean f43030o0;
    public TLRPC.TL_help_termsOfService f43031p0;
    public int f43032q0;
    public final ArrayList f43033r;
    public boolean f43034r0;
    public final ArrayList f43035s;
    public hd0 f43036s0;
    public boolean v;
    public boolean f43037w;
    public boolean f43038x;
    public boolean f43039y;

    static {
        int i10;
        if (SharedConfig.getDevicePerformanceClass() <= 1) {
            i10 = 150;
        } else {
            i10 = 100;
        }
        f43010t0 = i10;
    }

    public vg0() {
        super(null);
        this.f43013b = new org.telegram.ui.Components.zw0[19];
        this.f43033r = new ArrayList();
        this.f43035s = new ArrayList();
        this.v = true;
        this.f43037w = true;
        this.f43039y = true;
        this.E = false;
        this.F = 0;
        this.K = new AnimatorSet[2];
        this.Q = new boolean[]{true, false};
        this.f43012a0 = false;
        this.f43024i0 = new boolean[2];
        this.f43025j0 = new Runnable[2];
        this.f43026k0 = new boolean[2];
    }

    public static boolean T0(vg0 vg0Var, View view) {
        if (!vg0Var.h1()) {
            return AndroidUtilities.showKeyboard(view);
        }
        return true;
    }

    public static void U(vg0 vg0Var, TLRPC.TL_error tL_error, String str, String str2, String str3) {
        vg0Var.k1(false, true);
        if (tL_error == null) {
            if (str != null && str2 != null && str3 != null) {
                Bundle bundle = new Bundle();
                bundle.putString("phoneFormated", str);
                bundle.putString("phoneHash", str2);
                bundle.putString("code", str3);
                vg0Var.u1(5, true, bundle, false);
                return;
            }
            vg0Var.u1(0, true, null, true);
        } else if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
        } else if (tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("phoneFormated", str);
            bundle2.putString("phoneHash", str2);
            bundle2.putString("code", str3);
            bundle2.putInt("startTime", ConnectionsManager.getInstance(vg0Var.currentAccount).getCurrentTime());
            bundle2.putInt("waitTime", Utilities.parseInt((CharSequence) tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
            vg0Var.u1(8, true, bundle2, false);
        } else {
            vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
        }
    }

    public static void U0(vg0 vg0Var, View view, boolean z10) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(view, 3.5f);
        if (z10 && (view instanceof org.telegram.ui.Components.be0)) {
            Runnable runnable = (Runnable) view.getTag(R.id.timeout_callback);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            org.telegram.ui.Components.be0 be0Var = (org.telegram.ui.Components.be0) view;
            AtomicReference atomicReference = new AtomicReference();
            EditText attachedEditText = be0Var.getAttachedEditText();
            org.telegram.ui.Components.ho hoVar = new org.telegram.ui.Components.ho(attachedEditText, atomicReference, false, 2);
            be0Var.a(1.0f);
            org.telegram.ui.Components.qo0 qo0Var = new org.telegram.ui.Components.qo0(be0Var, view, attachedEditText, hoVar, 17);
            atomicReference.set(qo0Var);
            view.postDelayed(qo0Var, 2000L);
            view.setTag(R.id.timeout_callback, qo0Var);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(hoVar);
            }
        }
    }

    public static void V(vg0 vg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10, m8.d dVar) {
        String str2;
        m8.e eVar = ((b8.f) ((com.google.android.gms.common.api.q) dVar.f3314a)).f3787b;
        if (eVar == null) {
            str2 = null;
        } else {
            str2 = eVar.f16304a;
        }
        if (str2 != null) {
            TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
            tL_auth_requestFirebaseSms.phone_number = str;
            tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
            tL_auth_requestFirebaseSms.safety_net_token = str2;
            tL_auth_requestFirebaseSms.flags |= 1;
            String[] split = str2.split("\\.");
            if (split.length > 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(Base64.decode(split[1].getBytes(StandardCharsets.UTF_8), 0)));
                    boolean optBoolean = jSONObject.optBoolean("basicIntegrity");
                    boolean optBoolean2 = jSONObject.optBoolean("ctsProfileMatch");
                    try {
                        if (optBoolean && optBoolean2) {
                            ConnectionsManager.getInstance(vg0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new md0(1, bundle, auth_sentcode, vg0Var, z10), 10);
                        } else if (!optBoolean && !optBoolean2) {
                            FileLog.d("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                            vg0Var.s1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                        } else if (!optBoolean) {
                            FileLog.d("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                            vg0Var.s1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                        } else if (!optBoolean2) {
                            FileLog.d("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                            vg0Var.s1(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                        }
                    } catch (JSONException e7) {
                        e = e7;
                        FileLog.e(e);
                        FileLog.d("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
                        vg0Var.s1(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
                    }
                } catch (JSONException e10) {
                    e = e10;
                }
            } else {
                FileLog.d("{SAFETYNET_CANT_SPLIT} Resend firebase sms because can't split JWS token");
                vg0Var.s1(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            }
        } else {
            FileLog.d("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
            vg0Var.s1(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
        }
    }

    public static HashSet V0(vg0 vg0Var) {
        List<SubscriptionInfo> list;
        HashSet hashSet = new HashSet();
        try {
            String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                hashSet.add(line1Number);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            SubscriptionManager from = SubscriptionManager.from(vg0Var.getParentActivity());
            if (i10 >= 30) {
                list = from.getCompleteActiveSubscriptionInfoList();
            } else {
                list = null;
            }
            if ((list == null || list.isEmpty()) && i10 >= 28) {
                list = from.getAccessibleSubscriptionInfoList();
            }
            if (list == null || list.isEmpty()) {
                list = from.getActiveSubscriptionInfoList();
            }
            if (list != null) {
                for (int i11 = 0; i11 < list.size(); i11++) {
                    String number = list.get(i11).getNumber();
                    if (!TextUtils.isEmpty(number)) {
                        hashSet.add(number);
                    }
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        return hashSet;
    }

    public static void W(vg0 vg0Var, String str, String str2, String str3) {
        vg0Var.n1(0, true);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(vg0Var.currentAccount).sendRequest(deleteaccount, new ai.q3(vg0Var, str, str2, str3, 8), 10);
    }

    public static int W0(vg0 vg0Var) {
        return vg0Var.currentAccount;
    }

    public static void X(vg0 vg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            FileLog.d("Resend firebase sms because integrity token = null");
            vg0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(vg0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new md0(0, bundle, auth_sentcode, vg0Var, z10), 10);
    }

    public static int X0(vg0 vg0Var) {
        return vg0Var.currentAccount;
    }

    public static int Y0(vg0 vg0Var) {
        return vg0Var.currentAccount;
    }

    public static String f1(Exception exc) {
        if (exc == null) {
            return "NULL";
        }
        String simpleName = exc.getClass().getSimpleName();
        if (exc.getMessage() != null) {
            if (simpleName.length() > 0) {
                simpleName = simpleName.concat(" ");
            }
            StringBuilder v = a1.g.v(simpleName);
            v.append(exc.getMessage());
            simpleName = v.toString();
        }
        return simpleName.toUpperCase().replaceAll(" ", "_");
    }

    public static Bundle j1(int i10, boolean z10) {
        String str;
        try {
            Bundle bundle = new Bundle();
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb2 = new StringBuilder("logininfo2");
            if (z10) {
                str = "_" + i10;
            } else {
                str = "";
            }
            sb2.append(str);
            for (Map.Entry<String, ?> entry : context.getSharedPreferences(sb2.toString(), 0).getAll().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                String[] split = key.split("_\\|_");
                if (split.length == 1) {
                    if (value instanceof String) {
                        bundle.putString(key, (String) value);
                    } else if (value instanceof Integer) {
                        bundle.putInt(key, ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        bundle.putBoolean(key, ((Boolean) value).booleanValue());
                    }
                } else if (split.length == 2) {
                    Bundle bundle2 = bundle.getBundle(split[0]);
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(split[0], bundle2);
                    }
                    if (value instanceof String) {
                        bundle2.putString(split[1], (String) value);
                    } else if (value instanceof Integer) {
                        bundle2.putInt(split[1], ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        bundle2.putBoolean(split[1], ((Boolean) value).booleanValue());
                    }
                }
            }
            return bundle;
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    public static void m1(org.telegram.ui.ActionBar.m2 m2Var, String str, la.h hVar, boolean z10) {
        List list;
        if (m2Var != null && m2Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity());
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
            if (z10) {
                a2Var.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                a2Var.T = LocaleController.getString("BannedPhoneNumber", R.string.BannedPhoneNumber);
            } else if (hVar != null && (list = (List) hVar.f15466c) != null && !list.isEmpty() && ((tt) hVar.f15465b) != null) {
                int i10 = Integer.MAX_VALUE;
                for (String str2 : (List) hVar.f15466c) {
                    int length = str2.replace(" ", "").length();
                    if (length < i10) {
                        i10 = length;
                    }
                }
                if (hf.b.d(str, false).length() - ((tt) hVar.f15465b).f42261c.length() < i10) {
                    a2Var.R = LocaleController.getString(R.string.WrongNumberFormat);
                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ShortNumberInfo", R.string.ShortNumberInfo, ((tt) hVar.f15465b).f42259a, (String) hVar.d));
                } else {
                    a2Var.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    a2Var.T = LocaleController.getString(R.string.InvalidPhoneNumber);
                }
            } else {
                a2Var.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                a2Var.T = LocaleController.getString(R.string.InvalidPhoneNumber);
            }
            alertDialog$Builder.i(LocaleController.getString("BotHelp", R.string.BotHelp), new com.google.firebase.messaging.i(str, m2Var, z10));
            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
            m2Var.showDialog(a2Var);
        }
    }

    public static void n0(vg0 vg0Var, String str, String str2, String str3) {
        if (vg0Var.V.getTag() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vg0Var.getParentActivity());
        alertDialog$Builder.f20368a.T = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
        alertDialog$Builder.f20368a.R = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
        alertDialog$Builder.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new a1.d(vg0Var, str, str2, str3, 13));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        vg0Var.showDialog(alertDialog$Builder.f20368a);
    }

    public static void r1(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(a1.g.D(str, "_|_", str2), (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(a1.g.D(str, "_|_", str2), ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(a1.g.D(str, "_|_", str2), ((Boolean) obj).booleanValue());
                } else {
                    editor.putBoolean(str2, ((Boolean) obj).booleanValue());
                }
            } else if (obj instanceof Bundle) {
                r1((Bundle) obj, editor, str2);
            }
        }
    }

    @Override
    public final void clearViews() {
        View view = this.fragmentView;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                try {
                    onRemoveFromParent();
                    viewGroup.removeViewInLayout(this.fragmentView);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            if (this.f43029n0) {
                this.m0 = this.fragmentView;
            }
            this.fragmentView = null;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && !this.f43029n0) {
            ViewGroup viewGroup2 = (ViewGroup) kVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            this.actionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    @Override
    public final android.view.View createView(android.content.Context r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vg0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didUpdateConnectionState) {
            z1(true, false);
        } else if (i10 == NotificationCenter.newSuggestionsAvailable && this.f43023h0 && !getMessagesController().hasSetupEmailSuggestion()) {
            finishFragment();
        }
    }

    public final void e1() {
        String str;
        Context context = ApplicationLoader.applicationContext;
        StringBuilder sb2 = new StringBuilder("logininfo2");
        if (this.f43038x) {
            str = "_" + this.currentAccount;
        } else {
            str = "";
        }
        sb2.append(str);
        SharedPreferences.Editor edit = context.getSharedPreferences(sb2.toString(), 0).edit();
        edit.clear();
        edit.commit();
    }

    public final void g1(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, boolean z10) {
        int i10;
        if (auth_sentcode instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
            TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) auth_sentcode;
            bundle.putString("product", tL_auth_sentCodePaymentRequired.store_product);
            bundle.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
            bundle.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
            bundle.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
            bundle.putString("currency", tL_auth_sentCodePaymentRequired.currency);
            bundle.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
            bundle.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
            u1(18, true, bundle, true);
            return;
        }
        TLRPC.auth_SentCodeType auth_sentcodetype = auth_sentcode.type;
        if ((auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms) && !auth_sentcodetype.verifiedFirebase && !this.f43030o0) {
            if (PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                TLRPC.TL_auth_sentCodeTypeFirebaseSms tL_auth_sentCodeTypeFirebaseSms = (TLRPC.TL_auth_sentCodeTypeFirebaseSms) auth_sentcode.type;
                n1(0, true);
                this.f43030o0 = true;
                String string = bundle.getString("phoneFormated");
                if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                    IntegrityManager create = IntegrityManagerFactory.create(getParentActivity());
                    String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                    FileLog.d("getting classic integrity with nonce = ".concat(str));
                    create.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new jd0(this, bundle, auth_sentcode, string, z10)).addOnFailureListener(new OnFailureListener(this) {
                        public final vg0 f39304b;

                        {
                            this.f39304b = this;
                        }

                        @Override
                        public final void onFailure(Exception exc) {
                            switch (r4) {
                                case 0:
                                    String str2 = "PLAYINTEGRITY_EXCEPTION_" + vg0.f1(exc);
                                    FileLog.e("{" + str2 + "} Resend firebase sms because integrity threw error", exc);
                                    this.f39304b.s1(bundle, auth_sentcode, str2);
                                    return;
                                default:
                                    FileLog.e(exc);
                                    String str3 = "SAFETYNET_EXCEPTION_" + vg0.f1(exc);
                                    FileLog.d("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                    this.f39304b.s1(bundle, auth_sentcode, str3);
                                    return;
                            }
                        }
                    });
                    return;
                }
                com.google.android.gms.common.api.j jVar = new com.google.android.gms.common.api.j(ApplicationLoader.applicationContext, m8.c.f16303a, (com.google.android.gms.common.api.a) null, (com.google.android.gms.common.api.internal.t) new Object());
                byte[] bArr = auth_sentcode.type.nonce;
                String str2 = BuildVars.SAFETYNET_KEY;
                com.google.android.gms.common.api.internal.t0 t0Var = jVar.h;
                b8.e eVar = new b8.e(t0Var, bArr, str2);
                t0Var.f6689b.d(0, eVar);
                n6.m.n(eVar, new n6.n(new Object())).addOnSuccessListener(new jd0(this, string, auth_sentcode, bundle, z10)).addOnFailureListener(new OnFailureListener(this) {
                    public final vg0 f39304b;

                    {
                        this.f39304b = this;
                    }

                    @Override
                    public final void onFailure(Exception exc) {
                        switch (r4) {
                            case 0:
                                String str22 = "PLAYINTEGRITY_EXCEPTION_" + vg0.f1(exc);
                                FileLog.e("{" + str22 + "} Resend firebase sms because integrity threw error", exc);
                                this.f39304b.s1(bundle, auth_sentcode, str22);
                                return;
                            default:
                                FileLog.e(exc);
                                String str3 = "SAFETYNET_EXCEPTION_" + vg0.f1(exc);
                                FileLog.d("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                this.f39304b.s1(bundle, auth_sentcode, str3);
                                return;
                        }
                    }
                });
                return;
            }
            FileLog.d("{GOOGLE_PLAY_SERVICES_NOT_AVAILABLE} Resend firebase sms because firebase is not available");
            s1(bundle, auth_sentcode, "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE");
            return;
        }
        bundle.putString("phoneHash", auth_sentcode.phone_code_hash);
        TLRPC.auth_CodeType auth_codetype = auth_sentcode.next_type;
        if (auth_codetype instanceof TLRPC.TL_auth_codeTypeCall) {
            bundle.putInt("nextType", 4);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFlashCall) {
            bundle.putInt("nextType", 3);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeSms) {
            bundle.putInt("nextType", 2);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeMissedCall) {
            bundle.putInt("nextType", 11);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFragmentSms) {
            bundle.putInt("nextType", 15);
        }
        if (auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeApp) {
            bundle.putInt("type", 1);
            bundle.putInt("length", auth_sentcode.type.length);
            u1(1, z10, bundle, false);
            return;
        }
        if (auth_sentcode.timeout == 0) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                i10 = 5;
            } else {
                i10 = 60;
            }
            auth_sentcode.timeout = i10;
        }
        bundle.putInt("timeout", auth_sentcode.timeout * 1000);
        TLRPC.auth_SentCodeType auth_sentcodetype2 = auth_sentcode.type;
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt("type", 4);
            bundle.putInt("length", auth_sentcode.type.length);
            u1(4, z10, bundle, false);
        } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", auth_sentcode.type.pattern);
            u1(3, z10, bundle, false);
        } else if (!(auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) && !(auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFragmentSms) {
                bundle.putInt("type", 15);
                bundle.putString("url", auth_sentcode.type.url);
                bundle.putInt("length", auth_sentcode.type.length);
                u1(15, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeMissedCall) {
                bundle.putInt("type", 11);
                bundle.putInt("length", auth_sentcode.type.length);
                bundle.putString("prefix", auth_sentcode.type.prefix);
                u1(11, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSetUpEmailRequired) {
                bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
                u1(12, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
                bundle.putString("emailPattern", auth_sentcode.type.email_pattern);
                bundle.putInt("length", auth_sentcode.type.length);
                bundle.putInt("nextPhoneLoginDate", auth_sentcode.type.next_phone_login_date);
                bundle.putInt("resetAvailablePeriod", auth_sentcode.type.reset_available_period);
                bundle.putInt("resetPendingDate", auth_sentcode.type.reset_pending_date);
                u1(14, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                String str3 = auth_sentcodetype2.beginning;
                if (str3 != null) {
                    bundle.putString("beginning", str3);
                }
                u1(16, z10, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                String str4 = auth_sentcodetype2.beginning;
                if (str4 != null) {
                    bundle.putString("beginning", str4);
                }
                u1(17, z10, bundle, false);
            }
        } else {
            bundle.putInt("type", 2);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
            u1(2, z10, bundle, false);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.a6.a(new e(this, 22), org.telegram.ui.ActionBar.h6.G6, org.telegram.ui.ActionBar.h6.D6, org.telegram.ui.ActionBar.h6.H6, org.telegram.ui.ActionBar.h6.f20877i6, org.telegram.ui.ActionBar.h6.P9, org.telegram.ui.ActionBar.h6.O9, org.telegram.ui.ActionBar.h6.f20914k6, org.telegram.ui.ActionBar.h6.f20932l6, org.telegram.ui.ActionBar.h6.I6, org.telegram.ui.ActionBar.h6.f21026q7, org.telegram.ui.ActionBar.h6.f21171y6, org.telegram.ui.ActionBar.h6.f20878i7, org.telegram.ui.ActionBar.h6.q6, org.telegram.ui.ActionBar.h6.Wh, org.telegram.ui.ActionBar.h6.Q9, org.telegram.ui.ActionBar.h6.f21007p7, org.telegram.ui.ActionBar.h6.J6, org.telegram.ui.ActionBar.h6.Y6, org.telegram.ui.ActionBar.h6.W6, org.telegram.ui.ActionBar.h6.X6, org.telegram.ui.ActionBar.h6.f20857h5, org.telegram.ui.ActionBar.h6.f21025q5, org.telegram.ui.ActionBar.h6.f20894j5);
    }

    public final boolean h1() {
        if (this.f43013b[this.f43011a].a() && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
            return true;
        }
        return false;
    }

    public final boolean i1() {
        if (this.F == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f43023h0;
    }

    public final void k1(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.a2 a2Var;
        if (this.P != 0) {
            if (z10) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.P, true);
            }
            this.P = 0;
        }
        if (i1() && (a2Var = this.R) != null) {
            a2Var.dismiss();
            this.R = null;
        }
        w1(false, z11, false);
    }

    public final void l1(String str, String str2) {
        if (str2 != null && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
            a2Var.R = str;
            a2Var.T = str2;
            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
            showDialog(alertDialog$Builder.f20368a);
        }
    }

    public final void n1(int i10, boolean z10) {
        if (i1() && i10 == 0) {
            if (this.R == null && getParentActivity() != null && !getParentActivity().isFinishing()) {
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(getParentActivity(), 3, null);
                this.R = a2Var;
                a2Var.f20390g0 = false;
                a2Var.show();
                return;
            }
            return;
        }
        this.P = i10;
        w1(true, z10, false);
    }

    public final void o1(TLRPC.TL_auth_authorization tL_auth_authorization, boolean z10) {
        MessagesController.getInstance(this.currentAccount).cleanup();
        ConnectionsManager.getInstance(this.currentAccount).setUserId(tL_auth_authorization.user.f20179id);
        UserConfig.getInstance(this.currentAccount).clearConfig();
        MessagesController.getInstance(this.currentAccount).cleanup();
        UserConfig.getInstance(this.currentAccount).syncContacts = this.f43039y;
        UserConfig.getInstance(this.currentAccount).setCurrentUser(tL_auth_authorization.user);
        UserConfig.getInstance(this.currentAccount).saveConfig(true);
        MessagesStorage.getInstance(this.currentAccount).cleanup(true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_auth_authorization.user);
        MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(arrayList, null, true, true);
        MessagesController.getInstance(this.currentAccount).putUser(tL_auth_authorization.user, false);
        ContactsController.getInstance(this.currentAccount).checkAppAccount();
        MessagesController.getInstance(this.currentAccount).checkPromoInfo(true);
        ConnectionsManager.getInstance(this.currentAccount).updateDcSettings();
        MessagesController.getInstance(this.currentAccount).loadAppConfig();
        MessagesController.getInstance(this.currentAccount).lambda$removeWebBrowserException$517();
        MessagesController.getInstance(this.currentAccount).checkPeerColors(false);
        if (tL_auth_authorization.future_auth_token != null) {
            AuthTokensHelper.saveLogInToken(tL_auth_authorization);
        } else {
            FileLog.d("onAuthSuccess future_auth_token is empty");
        }
        if (z10) {
            MessagesController.getInstance(this.currentAccount).putDialogsEndReachedAfterRegistration();
        }
        MediaDataController.getInstance(this.currentAccount).loadStickersByEmojiOrName("tg_placeholders_android", false, true);
        boolean z11 = tL_auth_authorization.setup_password_required;
        int i10 = tL_auth_authorization.otherwise_relogin_days;
        if (getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(getParentActivity(), false);
        }
        e1();
        if (getParentActivity() instanceof LaunchActivity) {
            if (this.f43038x) {
                this.f43038x = false;
                this.f43029n0 = true;
                ((LaunchActivity) getParentActivity()).L0(this.currentAccount, new i2.y(6, z10));
                this.f43029n0 = false;
                finishFragment();
                return;
            }
            if (z10 && z11) {
                hh1 hh1Var = new hh1(6, null);
                hh1Var.G = i10;
                hh1Var.H = true;
                presentFragment(hh1Var, true);
            } else {
                Bundle i11 = a1.g.i("afterSignup", z10);
                eh0 eh0Var = new eh0();
                eh0Var.l0(i11);
                presentFragment(eh0Var, true);
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
            e41.V(true);
        } else if (getParentActivity() instanceof ExternalActionActivity) {
            ExternalActionActivity externalActionActivity = (ExternalActionActivity) getParentActivity();
            externalActionActivity.d(externalActionActivity.h, externalActionActivity.f33784n, externalActionActivity.v, true, externalActionActivity.f33785r, externalActionActivity.f33786s);
            externalActionActivity.f33781c.X();
            ActionBarLayout actionBarLayout = externalActionActivity.d;
            if (actionBarLayout != null) {
                actionBarLayout.X();
            }
            org.telegram.ui.Components.uw0 uw0Var = externalActionActivity.f33782e;
            if (uw0Var != null) {
                uw0Var.setVisibility(0);
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        ff0 ff0Var = (ff0) this.f43013b[5];
        if (ff0Var != null) {
            ff0Var.L.h(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.f43023h0 || this.f43011a != 12) {
            int i10 = this.f43011a;
            org.telegram.ui.Components.zw0[] zw0VarArr = this.f43013b;
            if (i10 == 0 || (this.F == 3 && i10 == 12)) {
                if (z10) {
                    for (org.telegram.ui.Components.zw0 zw0Var : zw0VarArr) {
                        if (zw0Var != null) {
                            zw0Var.f();
                        }
                    }
                    e1();
                }
                return true;
            } else if (i10 == 6) {
                if (z10) {
                    zw0VarArr[i10].c(true);
                    u1(0, true, null, true);
                    return false;
                }
            } else if (i10 != 7 && i10 != 8) {
                if ((i10 < 1 || i10 > 4) && i10 != 11 && i10 != 15) {
                    if (i10 == 5) {
                        if (z10) {
                            ((ff0) zw0VarArr[i10]).f37670w.callOnClick();
                            return false;
                        }
                    } else if (i10 == 9) {
                        if (z10) {
                            zw0VarArr[i10].c(true);
                            u1(7, true, null, true);
                            return false;
                        }
                    } else if (i10 == 10) {
                        if (z10) {
                            zw0VarArr[i10].c(true);
                            u1(9, true, null, true);
                            return false;
                        }
                    } else if (i10 == 13) {
                        if (z10) {
                            zw0VarArr[i10].c(true);
                            u1(12, true, null, true);
                            return false;
                        }
                    } else if (z10 && zw0VarArr[i10].c(true)) {
                        u1(0, true, null, true);
                        return false;
                    }
                } else if (z10 && zw0VarArr[i10].c(false)) {
                    u1(0, true, null, true);
                    return false;
                }
            } else if (z10) {
                zw0VarArr[i10].c(true);
                u1(6, true, null, true);
            }
        }
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        t1(this.f43013b[this.f43011a].a(), false);
        jg0 jg0Var = this.f43014b0;
        if (jg0Var != null) {
            int i10 = jg0.E;
            jg0Var.a();
        }
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        try {
            if (dialog == this.h) {
                ArrayList arrayList = this.f43033r;
                if (!arrayList.isEmpty() && getParentActivity() != null) {
                    getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
                    return;
                }
            }
            if (dialog == this.f43028n) {
                ArrayList arrayList2 = this.f43035s;
                if (!arrayList2.isEmpty() && getParentActivity() != null) {
                    AndroidUtilities.runOnUIThread(new hd0(this, 0), 200L);
                    getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateConnectionState);
        getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        Runnable[] runnableArr;
        super.onFragmentDestroy();
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.zw0[] zw0VarArr = this.f43013b;
            if (i10 >= zw0VarArr.length) {
                break;
            }
            org.telegram.ui.Components.zw0 zw0Var = zw0VarArr[i10];
            if (zw0Var != null) {
                zw0Var.f();
            }
            i10++;
        }
        org.telegram.ui.ActionBar.a2 a2Var = this.R;
        if (a2Var != null) {
            a2Var.dismiss();
            this.R = null;
        }
        for (Runnable runnable : this.f43025j0) {
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.didUpdateConnectionState);
        getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.f43038x) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        }
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        if (strArr.length != 0 && iArr.length != 0) {
            if (iArr[0] == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.zw0[] zw0VarArr = this.f43013b;
            if (i10 == 6) {
                this.v = false;
                int i11 = this.f43011a;
                if (i11 == 0) {
                    org.telegram.ui.Components.zw0 zw0Var = zw0VarArr[i11];
                    ((ug0) zw0Var).L = true;
                    zw0Var.h(null);
                }
            } else if (i10 == 7) {
                this.f43037w = false;
                int i12 = this.f43011a;
                if (i12 == 0) {
                    ((ug0) zw0VarArr[i12]).p();
                }
            } else if (i10 == 20) {
                if (z10) {
                    ((ff0) zw0VarArr[5]).L.l();
                }
            } else if (i10 == 151 && z10) {
                ff0 ff0Var = (ff0) zw0VarArr[5];
                ff0Var.post(new sd0(ff0Var, 0));
            }
        }
    }

    @Override
    public final void onResume() {
        org.telegram.ui.Components.zw0 zw0Var;
        int i10;
        org.telegram.ui.Components.zw0[] zw0VarArr = this.f43013b;
        super.onResume();
        if (this.f43038x) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        View view = this.fragmentView;
        if (view != null) {
            view.requestLayout();
        }
        try {
            int i11 = this.f43011a;
            if (i11 >= 1 && i11 <= 4) {
                org.telegram.ui.Components.zw0 zw0Var2 = zw0VarArr[i11];
                if ((zw0Var2 instanceof yf0) && (i10 = ((yf0) zw0Var2).T) != 0 && Math.abs((System.currentTimeMillis() / 1000) - i10) >= 86400) {
                    zw0VarArr[this.f43011a].c(true);
                    u1(0, false, null, true);
                }
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        int i12 = this.f43011a;
        if (i12 == 0 && !this.f43016c0 && (zw0Var = zw0VarArr[i12]) != null) {
            zw0Var.j();
        }
        if (h1()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
        int i13 = this.f43011a;
        if (i13 >= 0 && i13 < zw0VarArr.length) {
            zw0VarArr[i13].i();
        }
    }

    public final void p1() {
        if (this.Q[this.J]) {
            if (this.V.getTag() != null) {
                if (getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20368a.R = LocaleController.getString("StopLoadingTitle", R.string.StopLoadingTitle);
                alertDialog$Builder.f20368a.T = LocaleController.getString("StopLoading", R.string.StopLoading);
                alertDialog$Builder.k(LocaleController.getString("WaitMore", R.string.WaitMore), null);
                alertDialog$Builder.h(LocaleController.getString("Stop", R.string.Stop), new nd0(this, 0));
                showDialog(alertDialog$Builder.f20368a);
                return;
            }
            this.f43013b[this.f43011a].h(null);
        }
    }

    public final void q1(String str, TLRPC.auth_SentCode auth_sentcode) {
        this.f43018e = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + str);
        bundle.putString("ephone", "+" + str);
        bundle.putString("phoneFormated", str);
        g1(bundle, auth_sentcode, true);
    }

    public final void s1(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str) {
        if (!this.f43030o0) {
            return;
        }
        k1(false, true);
        this.f43030o0 = false;
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = bundle.getString("phoneFormated");
        tL_auth_resendCode.phone_code_hash = auth_sentcode.phone_code_hash;
        if (str != null) {
            tL_auth_resendCode.flags |= 1;
            tL_auth_resendCode.reason = str;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new zb0(1, this, bundle), 10);
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("currentViewNum", this.f43011a);
            bundle2.putInt("syncContacts", this.f43039y ? 1 : 0);
            for (int i10 = 0; i10 <= this.f43011a; i10++) {
                org.telegram.ui.Components.zw0 zw0Var = this.f43013b[i10];
                if (zw0Var != null) {
                    zw0Var.l(bundle2);
                }
            }
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("logininfo2");
            if (this.f43038x) {
                str = "_" + this.currentAccount;
            } else {
                str = "";
            }
            sb2.append(str);
            SharedPreferences.Editor edit = context.getSharedPreferences(sb2.toString(), 0).edit();
            edit.clear();
            r1(bundle2, edit, null);
            edit.commit();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void t1(boolean z10, boolean z11) {
        if (this.f43012a0 == z10 && z11) {
            return;
        }
        this.f43012a0 = z10;
        if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
            z10 = false;
        }
        if (z10) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            if (z11) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                this.d = duration;
                duration.setInterpolator(org.telegram.ui.Components.is.f27451f);
                this.d.addUpdateListener(new id0(this, 2));
                this.d.addListener(new td0(this, 0));
                this.d.start();
                return;
            }
            this.f43015c.setVisibility(0);
            return;
        }
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        if (z11) {
            ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
            this.d = duration2;
            duration2.setInterpolator(org.telegram.ui.Components.bu.f25024e);
            this.d.addUpdateListener(new id0(this, 0));
            this.d.addListener(new td0(this, 1));
            this.d.start();
            return;
        }
        this.f43015c.setVisibility(8);
    }

    public final void u1(int i10, boolean z10, Bundle bundle, boolean z11) {
        boolean z12;
        int i11;
        int i12;
        int i13;
        if (i10 != 0 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 10 && i10 != 12 && i10 != 17 && i10 != 16) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (i10 == this.f43011a) {
            z10 = false;
        }
        if (z12) {
            if (i10 == 0) {
                this.v = true;
                this.f43037w = true;
            }
            this.J = 1;
            v1(false, z10);
            w1(false, z10, false);
            this.J = 0;
            w1(false, z10, false);
            if (!z10) {
                v1(true, false);
            }
        } else {
            this.J = 0;
            v1(false, z10);
            w1(false, z10, false);
            if (i10 != 8) {
                this.J = 1;
            }
        }
        org.telegram.ui.Components.zw0[] zw0VarArr = this.f43013b;
        if (z10) {
            org.telegram.ui.Components.zw0 zw0Var = zw0VarArr[this.f43011a];
            org.telegram.ui.Components.zw0 zw0Var2 = zw0VarArr[i10];
            this.f43011a = i10;
            ImageView imageView = this.U;
            if (!zw0Var2.b() && !this.f43038x) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            imageView.setVisibility(i12);
            zw0Var2.m(bundle, false);
            setParentActivityTitle(zw0Var2.getHeaderName());
            zw0Var2.j();
            int i14 = AndroidUtilities.displaySize.x;
            if (z11) {
                i14 = -i14;
            }
            zw0Var2.setX(i14);
            zw0Var2.setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new androidx.fragment.app.g(this, z12, zw0Var, 8));
            Property property = View.TRANSLATION_X;
            if (z11) {
                i13 = AndroidUtilities.displaySize.x;
            } else {
                i13 = -AndroidUtilities.displaySize.x;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(zw0Var, property, i13), ObjectAnimator.ofFloat(zw0Var2, property, 0.0f));
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.start();
            t1(zw0Var2.a(), true);
            return;
        }
        ImageView imageView2 = this.U;
        if (!zw0VarArr[i10].b() && !this.f43038x) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        imageView2.setVisibility(i11);
        zw0VarArr[this.f43011a].setVisibility(8);
        zw0VarArr[this.f43011a].g();
        this.f43011a = i10;
        zw0VarArr[i10].m(bundle, false);
        zw0VarArr[i10].setVisibility(0);
        setParentActivityTitle(zw0VarArr[i10].getHeaderName());
        zw0VarArr[i10].j();
        t1(zw0VarArr[i10].a(), false);
    }

    public final void v1(boolean z10, boolean z11) {
        boolean z12;
        TimeInterpolator timeInterpolator;
        int i10 = this.J;
        if (i10 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean[] zArr = this.Q;
        if (zArr[i10] != z10) {
            AnimatorSet[] animatorSetArr = this.K;
            AnimatorSet animatorSet = animatorSetArr[i10];
            if (animatorSet != null) {
                if (z11) {
                    animatorSet.removeAllListeners();
                }
                animatorSetArr[this.J].cancel();
            }
            int i11 = this.J;
            zArr[i11] = z10;
            if (z11) {
                animatorSetArr[i11] = new AnimatorSet();
                if (z12) {
                    this.N.e(z10, z11);
                }
                animatorSetArr[this.J].addListener(new org.telegram.ui.ActionBar.g(this, z12, z10, 5));
                int i12 = 150;
                if (z12) {
                    if (z10) {
                        timeInterpolator = AndroidUtilities.decelerateInterpolator;
                        i12 = 200;
                    } else {
                        timeInterpolator = AndroidUtilities.accelerateInterpolator;
                    }
                } else {
                    timeInterpolator = null;
                }
                animatorSetArr[this.J].setDuration(i12);
                animatorSetArr[this.J].setInterpolator(timeInterpolator);
                animatorSetArr[this.J].start();
            } else if (z12) {
                this.N.e(z10, z11);
            }
        }
    }

    public final void w1(final boolean z10, final boolean z11, boolean z12) {
        boolean z13;
        float f7;
        boolean[] zArr = this.f43024i0;
        if (z11 && zArr[this.J] == z10 && !z12) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k00(this, z10, z11, z12, 1));
            return;
        }
        final int i10 = this.J;
        if (i10 == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean[] zArr2 = this.f43026k0;
        if (!z12 && !z13) {
            zArr[i10] = z10;
            if (z11) {
                boolean z14 = zArr2[i10];
                Runnable[] runnableArr = this.f43025j0;
                if (z14) {
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[i10]);
                    zArr2[this.J] = false;
                    return;
                } else if (z10) {
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            vg0 vg0Var = vg0.this;
                            int i11 = vg0Var.J;
                            vg0Var.J = i10;
                            vg0Var.w1(z10, z11, true);
                            vg0Var.J = i11;
                        }
                    };
                    runnableArr[i10] = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 2000L);
                    zArr2[this.J] = true;
                    return;
                }
            }
        } else {
            zArr2[i10] = false;
            zArr[i10] = z10;
        }
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z13) {
            this.N.f(z10, z11);
            return;
        }
        float f10 = 0.0f;
        if (z11) {
            this.L = new AnimatorSet();
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
            ofFloat.addListener(new f70(1, this, z10));
            ofFloat.addUpdateListener(new id0(this, 1));
            this.L.playTogether(ofFloat);
            this.L.setDuration(150L);
            this.L.start();
        } else if (z10) {
            this.V.setVisibility(0);
            this.V.setScaleX(1.0f);
            this.V.setScaleY(1.0f);
            this.V.setAlpha(1.0f);
        } else {
            this.V.setTag(null);
            this.V.setVisibility(4);
            this.V.setScaleX(0.1f);
            this.V.setScaleY(0.1f);
            this.V.setAlpha(0.0f);
        }
    }

    public final void x1(boolean z10, boolean z11) {
        if (z10 == this.f43034r0) {
            return;
        }
        hd0 hd0Var = this.f43036s0;
        if (hd0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(hd0Var);
            this.f43036s0 = null;
        }
        this.f43034r0 = z10;
        this.W.clearAnimation();
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            this.W.setVisibility(0);
            ViewPropertyAnimator animate = this.W.animate();
            if (z10) {
                f7 = 1.0f;
            }
            animate.alpha(f7).withEndAction(new org.telegram.ui.Components.fs0(8, this, z10)).start();
            return;
        }
        ImageView imageView = this.W;
        if (!z10) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = this.W;
        if (z10) {
            f7 = 1.0f;
        }
        imageView2.setAlpha(f7);
    }

    public final void y1() {
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false));
        ImageView imageView = this.U;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        imageView.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        ImageView imageView2 = this.U;
        int i11 = org.telegram.ui.ActionBar.h6.f20877i6;
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i11, false), 1, -1));
        this.X.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.W.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i11, false), 1, -1));
        RadialProgressView radialProgressView = this.V;
        int i12 = org.telegram.ui.ActionBar.h6.P9;
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.N.g();
        this.M.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.O9, false));
        this.M.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        for (org.telegram.ui.Components.zw0 zw0Var : this.f43013b) {
            zw0Var.n();
        }
        org.telegram.ui.Components.ms msVar = this.f43015c;
        msVar.f28845a.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        int i13 = 0;
        while (true) {
            View[] viewArr = msVar.f28847c;
            if (i13 >= viewArr.length) {
                break;
            }
            View view = viewArr[i13];
            if (view != null) {
                view.setBackground(org.telegram.ui.Components.ms.a(i13));
                if (view instanceof org.telegram.ui.Components.ls) {
                    org.telegram.ui.Components.ls lsVar = (org.telegram.ui.Components.ls) view;
                    lsVar.f28446a.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
                    lsVar.f28447b.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.H6, false));
                }
            }
            i13++;
        }
        jg0 jg0Var = this.f43014b0;
        if (jg0Var != null) {
            int i14 = jg0.E;
            jg0Var.b();
        }
    }

    public final void z1(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        if (this.X != null) {
            int connectionState = getConnectionsManager().getConnectionState();
            if (this.f43032q0 != connectionState || z11) {
                this.f43032q0 = connectionState;
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if (sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i10 = this.f43032q0;
                if (i10 != 3 && i10 != 5) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (i10 != 1 && i10 != 2 && i10 != 4) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (z12) {
                    this.X.b(true, z13, z10);
                    x1(true, z10);
                } else if ((getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty()) || z14) {
                    this.X.b(true, z13, z10);
                    if (this.f43034r0) {
                        return;
                    }
                    hd0 hd0Var = this.f43036s0;
                    if (hd0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(hd0Var);
                    }
                    this.f43034r0 = true;
                    hd0 hd0Var2 = new hd0(this, 1);
                    this.f43036s0 = hd0Var2;
                    AndroidUtilities.runOnUIThread(hd0Var2, 5000L);
                } else {
                    x1(false, z10);
                }
            }
        }
    }

    public vg0(int i10) {
        super(null);
        this.f43013b = new org.telegram.ui.Components.zw0[19];
        this.f43033r = new ArrayList();
        this.f43035s = new ArrayList();
        this.v = true;
        this.f43037w = true;
        this.f43039y = true;
        this.E = false;
        this.F = 0;
        this.K = new AnimatorSet[2];
        this.Q = new boolean[]{true, false};
        this.f43012a0 = false;
        this.f43024i0 = new boolean[2];
        this.f43025j0 = new Runnable[2];
        this.f43026k0 = new boolean[2];
        this.currentAccount = i10;
        this.f43038x = true;
    }
}
