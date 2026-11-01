package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.CheckBox;
public final class v50 implements Runnable {
    public final int f42416a;
    public final Object f42417b;
    public final Object f42418c;
    public final Object d;
    public final Object e;

    public v50(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f42416a = i10;
        this.d = obj;
        this.f42417b = obj2;
        this.f42418c = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        String a02;
        int i10;
        byte[] bArr;
        int i11;
        String G;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        TLRPC.Chat L0;
        int i14;
        int i15;
        String L02;
        String a03;
        org.telegram.ui.Components.wb Q;
        String str;
        pm0 pm0Var;
        pm0 pm0Var2;
        Uri fromFile;
        TLObject L03;
        int indexOf;
        int i16 = this.f42416a;
        String str2 = "";
        Object obj = this.e;
        Object obj2 = this.f42418c;
        Object obj3 = this.f42417b;
        Object obj4 = this.d;
        switch (i16) {
            case 0:
                b60.Z((b60) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                return;
            case 1:
                i60 i60Var = (i60) obj4;
                i60Var.d = (ArrayList) obj3;
                i60Var.e = (ArrayList) obj2;
                i60Var.f();
                j60 j60Var = i60Var.f37953r;
                j60Var.f38283b.d.setVisibility(8);
                j60Var.f38283b.e.setText(org.telegram.messenger.dd.a0(null, null, 2131752117, (String) obj));
                j60Var.f38283b.e(false, true);
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                y60 y60Var = (y60) obj3;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.D1;
                try {
                    y60Var.run();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                if (tLObject instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject;
                    Pattern pattern2 = org.telegram.ui.Components.s4.f30174a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str3 = tL_langPackLanguage.base_lang_code;
                    if (str3 != null) {
                        tL_langPackLanguage.base_lang_code = str3.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                    boolean equals = org.telegram.messenger.dd.D0().B.f14593c.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    if (equals) {
                        x1Var.R = org.telegram.messenger.dd.L0(2131749064, null);
                        a02 = org.telegram.messenger.dd.a0("LanguageSame", null, 2131749057, tL_langPackLanguage.name);
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131747847, null), null);
                        alertDialog$Builder.i(org.telegram.messenger.dd.L0(2131746000, null), new org.telegram.ui.Components.y0(launchActivity, 0));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        x1Var.R = org.telegram.messenger.dd.L0(2131749054, null);
                        a02 = org.telegram.messenger.dd.a0("LanguageUnknownCustomAlert", null, 2131749055, tL_langPackLanguage.name);
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131747847, null), null);
                    } else {
                        x1Var.R = org.telegram.messenger.dd.L0(2131749056, null);
                        if (tL_langPackLanguage.official) {
                            a02 = org.telegram.messenger.dd.a0("LanguageAlert", null, 2131749063, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        } else {
                            a02 = org.telegram.messenger.dd.a0("LanguageCustomAlert", null, 2131749060, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752552, null), new ng.d(24, tL_langPackLanguage, launchActivity));
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i0.W2(a02));
                    int indexOf2 = TextUtils.indexOf((CharSequence) spannableStringBuilder, '[');
                    if (indexOf2 != -1) {
                        int i17 = indexOf2 + 1;
                        i10 = TextUtils.indexOf((CharSequence) spannableStringBuilder, ']', i17);
                        if (i10 != -1) {
                            spannableStringBuilder.delete(i10, i10 + 1);
                            spannableStringBuilder.delete(indexOf2, i17);
                        }
                    } else {
                        i10 = -1;
                    }
                    if (indexOf2 != -1 && i10 != -1) {
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.l3(tL_langPackLanguage.translations_url, alertDialog$Builder), indexOf2, i10 - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.a7.H(textView, org.telegram.ui.ActionBar.t6.f21058k5, null);
                    org.telegram.ui.ActionBar.a7.D(textView, org.telegram.ui.ActionBar.t6.f21076l5, null);
                    textView.setPadding(org.telegram.messenger.i0.L(23.0f), 0, org.telegram.messenger.i0.L(23.0f), 0);
                    textView.setMovementMethod(new org.telegram.messenger.e0(false));
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21038j5, null);
                    alertDialog$Builder.o(textView);
                    launchActivity.F0(alertDialog$Builder);
                    return;
                } else if (tL_error != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error.text)) {
                        launchActivity.F0(org.telegram.ui.Components.s4.M(launchActivity, null, org.telegram.messenger.dd.L0(2131749053, null)));
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.messenger.a30.q(null, 2131751106, sb2, "\n");
                    sb2.append(tL_error.text);
                    launchActivity.F0(org.telegram.ui.Components.s4.M(launchActivity, null, sb2.toString()));
                    return;
                } else {
                    return;
                }
            case 3:
                org.telegram.ui.ActionBar.x1 x1Var2 = (org.telegram.ui.ActionBar.x1) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                f fVar = (f) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern3 = LaunchActivity.D1;
                try {
                    x1Var2.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject2 instanceof TLRPC.TL_authorization)) {
                    org.telegram.messenger.i0.g3(new y60(5, fVar, tL_error2));
                    return;
                }
                return;
            case 4:
                ta0 ta0Var = (ta0) obj4;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                org.telegram.ui.Components.vq.e(k2Var.getContext(), ta0Var.f41598b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new org.telegram.ui.Components.vg(20, ta0Var, userArr), k2Var.getResourceProvider(), ta0.d());
                return;
            case 5:
                qa0.z0((qa0) obj4, (TLObject) obj3, (HashSet) obj2, (TLRPC.TL_error) obj);
                return;
            case 6:
                EditText editText = (EditText) obj2;
                ag.u2 u2Var = (ag.u2) obj;
                ((org.telegram.ui.Components.ec0) obj4).a(0.0f);
                ((View) obj3).setTag(2131296713, null);
                if (editText != null) {
                    editText.post(new y60(17, editText, u2Var));
                    return;
                }
                return;
            case 7:
                ad0 ad0Var = (ad0) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                if (str4 != null) {
                    bArr = org.telegram.messenger.i0.h1(str4);
                } else {
                    bArr = null;
                }
                zc0 zc0Var = new zc0(ad0Var, str4, str5, 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ad0Var.f35759s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str4 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = org.telegram.messenger.bw.b(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error3 = new TLRPC.TL_error();
                            tL_error3.text = "ALGO_INVALID";
                            zc0Var.run(null, tL_error3);
                        }
                    }
                    i11 = ((org.telegram.ui.ActionBar.k2) ad0Var.G).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_auth_recoverPassword, zc0Var, 10);
                    return;
                }
                TLRPC.TL_error tL_error4 = new TLRPC.TL_error();
                tL_error4.text = "PASSWORD_HASH_INVALID";
                zc0Var.run(null, tL_error4);
                return;
            case 8:
                nd0 nd0Var = (nd0) obj4;
                String str6 = (String) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                gf0 gf0Var = nd0Var.D;
                gf0Var.t1(false, true);
                nd0Var.f39863n = false;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str6);
                    bundle.putString("password", nd0Var.h);
                    gf0Var.D1(9, true, bundle, false);
                    return;
                } else if (tL_error5 != null && !tL_error5.text.startsWith("CODE_INVALID")) {
                    if (tL_error5.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error5.text).intValue();
                        if (intValue < 60) {
                            G = org.telegram.messenger.dd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            G = org.telegram.messenger.dd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, G));
                        return;
                    }
                    gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error5.text);
                    return;
                } else {
                    nd0Var.n(true);
                    return;
                }
            case 9:
                le0 le0Var = (le0) obj4;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                Bundle bundle2 = (Bundle) obj2;
                TLObject tLObject3 = (TLObject) obj;
                gf0 gf0Var2 = le0Var.f39259u0;
                le0Var.f39242f0 = false;
                if (tL_error6 == null) {
                    le0Var.f39253q0 = bundle2;
                    if (tLObject3 instanceof TLRPC.TL_auth_sentCode) {
                        TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject3;
                        le0Var.f39255r0 = tL_auth_sentCode;
                        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                            le0Var.f39245i0 = 17;
                        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                            le0Var.f39245i0 = 16;
                        }
                        gf0Var2.p1(bundle2, tL_auth_sentCode, true);
                    } else if (tLObject3 instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
                        TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) tLObject3;
                        bundle2.putString("product", tL_auth_sentCodePaymentRequired.store_product);
                        bundle2.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
                        bundle2.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
                        bundle2.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
                        bundle2.putString("currency", tL_auth_sentCodePaymentRequired.currency);
                        bundle2.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
                        bundle2.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
                        gf0Var2.D1(18, true, bundle2, true);
                    }
                } else {
                    String str7 = tL_error6.text;
                    if (str7 != null) {
                        if (str7.contains("PHONE_NUMBER_INVALID")) {
                            gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131749189, null));
                        } else if (!tL_error6.text.contains("PHONE_CODE_EMPTY") && !tL_error6.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error6.text.contains("PHONE_CODE_EXPIRED")) {
                                le0Var.c(true);
                                gf0Var2.D1(0, true, null, true);
                                gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131752021, null));
                            } else if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                                gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131750688, null));
                            } else if (tL_error6.code != -1000) {
                                String L04 = org.telegram.messenger.dd.L0(2131746088, null);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.messenger.a30.q(null, 2131751106, sb3, "\n");
                                sb3.append(tL_error6.text);
                                gf0Var2.u1(L04, sb3.toString());
                            }
                        } else {
                            gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131749193, null));
                        }
                    }
                }
                le0Var.x(false);
                return;
            case 10:
                re0.n((re0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 11:
                c5.m mVar = (c5.m) obj3;
                s3 s3Var = (s3) obj2;
                gf0 gf0Var3 = ((re0) obj4).f41074w;
                gf0Var3.e = true;
                org.telegram.messenger.u1.i().d(mVar.f3801c, new f3(s3Var, 3));
                org.telegram.messenger.u1.i().h = new qe0(s3Var, 0);
                org.telegram.messenger.u1 i18 = org.telegram.messenger.u1.i();
                Activity parentActivity = gf0Var3.getParentActivity();
                i12 = ((org.telegram.ui.ActionBar.k2) gf0Var3).currentAccount;
                org.telegram.messenger.c a2 = org.telegram.messenger.c.a(i12);
                hf.b bVar = new hf.b(9, false);
                bVar.m0(mVar);
                i18.l(parentActivity, a2, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(bVar.K()));
                return;
            case 12:
                ff0 ff0Var = (ff0) obj4;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                String str8 = (String) obj;
                ff0Var.M = false;
                gf0 gf0Var4 = ff0Var.f37124a0;
                gf0Var4.E1(false, true);
                if (tL_error7 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject4;
                    if (!TwoStepVerificationActivity.n0(password, true)) {
                        org.telegram.ui.Components.s4.w0(gf0Var4.getParentActivity(), org.telegram.messenger.dd.L0(2131743846, "UpdateAppAlert"), true);
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle3.putString("password", Utilities.f(serializedData.toByteArray()));
                    bundle3.putString("phoneFormated", str8);
                    gf0Var4.D1(6, true, bundle3, false);
                    return;
                }
                gf0Var4.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error7.text);
                return;
            case 13:
                nh0 nh0Var = (nh0) obj4;
                cg.b bVar2 = (cg.b) obj3;
                String str9 = (String) obj2;
                r61 r61Var = (r61) obj;
                qh0 qh0Var = nh0Var.f39911w.d;
                if (bVar2 != null) {
                    qh0Var.f40792w.l(str9, bVar2);
                }
                if (bVar2 != null && !r61Var.f40991b && (i13 = r61Var.f40990a) >= 0) {
                    View m10 = qh0Var.h.m(i13);
                    if (m10 instanceof c61) {
                        nh0Var.f36210r.e = bVar2;
                        c61 c61Var = (c61) m10;
                        c61Var.f36206b.f2739t0.d(false, false);
                        c61Var.g(false);
                    }
                }
                nh0Var.f();
                return;
            case 14:
                qi0 qi0Var = (qi0) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                zf.m1 m1Var = qi0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = qi0Var.f40800n;
                if (notificationsCustomSettingsActivity.f33407f) {
                    qi0Var.f40799f = null;
                    qi0Var.d = arrayList;
                    qi0Var.e = arrayList2;
                    m1Var.f(arrayList3, null);
                    if (notificationsCustomSettingsActivity.f33407f && !m1Var.e()) {
                        notificationsCustomSettingsActivity.f33406c.c();
                    }
                    qi0Var.f();
                    return;
                }
                return;
            case 15:
                qm0 qm0Var = (qm0) obj4;
                TLRPC.Message message = (TLRPC.Message) obj;
                qm0Var.f40814a1 = true;
                qm0Var.f40827f1 = 1;
                qm0Var.D0((org.telegram.ui.ActionBar.z4) obj3, (Activity) obj2);
                TLRPC.InputInvoice inputInvoice = qm0Var.f40817b1;
                boolean z12 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                if (z12 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12 && (pm0Var2 = qm0Var.Z0) != null) {
                    pm0Var2.e(qm0Var.f40827f1);
                }
                qm0Var.z0();
                if (z12 && (pm0Var = qm0Var.Z0) != null) {
                    pm0Var.e(qm0Var.f40827f1);
                }
                long w02 = qm0Var.w0();
                int i19 = (w02 > 0L ? 1 : (w02 == 0L ? 0 : -1));
                if (i19 > 0) {
                    str2 = org.telegram.messenger.i20.k(qm0Var.getMessagesController().Z1(Long.valueOf(w02)));
                } else if (i19 < 0 && (L0 = qm0Var.getMessagesController().L0(Long.valueOf(-w02))) != null) {
                    str2 = L0.title;
                }
                long v02 = qm0Var.v0();
                if (z12) {
                    if (!z10 && !z11) {
                        i14 = 2131624224;
                    } else {
                        i14 = 2131624223;
                    }
                } else {
                    i14 = 2131624112;
                }
                int i20 = i14;
                if (!z12) {
                    L02 = null;
                } else {
                    if (z11) {
                        i15 = 2131745110;
                    } else if (z10) {
                        i15 = 2131745118;
                    } else {
                        i15 = 2131745177;
                    }
                    L02 = org.telegram.messenger.dd.L0(i15, null);
                }
                if (z12) {
                    if (z11) {
                        a03 = org.telegram.messenger.dd.H(',', "StarsGiveawaySentPopupInfo", (int) v02);
                    } else {
                        if (z10) {
                            str = "StarsGiftSentPopupInfo";
                        } else {
                            str = "StarsAcquiredInfo";
                        }
                        a03 = org.telegram.messenger.dd.K(str, (int) v02, ',', str2);
                    }
                } else {
                    a03 = org.telegram.messenger.dd.a0(null, null, 2131747417, qm0Var.R0[0], qm0Var.f40838q0);
                }
                SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(a03);
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.Components.cc a04 = org.telegram.ui.Components.cc.a0(T);
                    if (i19 != 0 && L02 != null && !z11) {
                        Q = a04.L(i20, L02, W2, org.telegram.messenger.dd.L0(2131743578, null), new tl0(w02, 1));
                    } else {
                        String str10 = L02;
                        if (str10 != null) {
                            Q = a04.I(i20, str10, W2);
                        } else {
                            Q = a04.Q(i20, 36, W2);
                        }
                    }
                    Q.f32209r = false;
                    Q.f32201j = 5000;
                    if (message != null) {
                        kg.z0 z0Var = new kg.z0(qm0Var, Q, z10, message, 4);
                        org.telegram.ui.Components.bb bbVar = Q.e;
                        if (bbVar != null) {
                            bbVar.setOnClickListener(z0Var);
                        }
                    }
                    Q.k(z11);
                    return;
                }
                return;
            case 16:
                qm0.i0((qm0) obj4, (TLObject) obj3, (TLRPC.TL_error) obj2, (TL_account.getTmpPassword) obj);
                return;
            case 17:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj2;
                String str11 = (String) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                Bitmap decodeFile = BitmapFactory.decodeFile(((org.telegram.messenger.ff) obj3).I);
                if (decodeFile == null) {
                    org.telegram.messenger.i0.g3(new oo0(photoViewer, 10));
                    return;
                }
                int[] iArr = new int[11];
                AnimatedFileNative.d(ffVar.I, iArr, 0L);
                int max = Math.max(iArr[1], ffVar.F);
                int max2 = Math.max(iArr[2], ffVar.G);
                if ((iArr[8] / 90) % 2 == 1) {
                    max2 = max;
                    max = max2;
                }
                float f7 = max;
                float f10 = max2;
                float max3 = Math.max(decodeFile.getWidth() / f7, decodeFile.getHeight() / f10);
                int i21 = (int) (f10 * max3);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap((int) (f7 * max3), i21, config);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
                float max4 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max4, max4);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2, paint);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str11));
                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    fileOutputStream.close();
                    Bitmap createBitmap2 = Bitmap.createBitmap(org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(26.0f), config);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
                    float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
                    canvas2.scale(max5, max5);
                    canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
                    org.telegram.messenger.i0.g3(new v50(photoViewer, ffVar, str11, createBitmap2, 18));
                    return;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    org.telegram.messenger.i0.g3(new oo0(photoViewer, 11));
                    return;
                }
            case 18:
                PhotoViewer photoViewer2 = (PhotoViewer) obj4;
                org.telegram.messenger.ff ffVar2 = (org.telegram.messenger.ff) obj3;
                String str12 = (String) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                if (ffVar2.f14606g != null) {
                    try {
                        new File(ffVar2.f14606g).delete();
                    } catch (Exception e10) {
                        org.telegram.messenger.f8.g(e10, true);
                    }
                }
                ffVar2.d = -1L;
                ffVar2.f14606g = str12;
                ffVar2.e = null;
                ffVar2.f14605f = null;
                photoViewer2.f33586q5.f29411b.setLoading(false);
                ds0 ds0Var = photoViewer2.d;
                if (ds0Var != null) {
                    ds0Var.X(photoViewer2.P4);
                }
                fq0 fq0Var = photoViewer2.f33495g1;
                if (fq0Var != null) {
                    fq0Var.setImage(bitmap);
                }
                photoViewer2.h3(0);
                CheckBox checkBox = photoViewer2.N0;
                if (!checkBox.f23906y) {
                    checkBox.callOnClick();
                    return;
                }
                return;
            case 19:
                PhotoViewer photoViewer3 = (PhotoViewer) obj4;
                Bitmap bitmap2 = (Bitmap) obj3;
                boolean[] zArr = (boolean[]) obj2;
                kp0 kp0Var = (kp0) obj;
                ImageView imageView = photoViewer3.f33650x3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap2);
                    photoViewer3.f33650x3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer3.C2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        kp0Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                TLObject tLObject5 = (TLObject) obj3;
                org.telegram.messenger.e20 e20Var = (org.telegram.messenger.e20) obj2;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                PhotoViewer photoViewer4 = ((yp0) obj4).f43706b;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    int i22 = photoViewer4.T;
                    ArrayList arrayList4 = photoViewer4.f7;
                    org.telegram.messenger.wp.r1(i22).V3(tL_photos_photo.users, false);
                    TLRPC.User Z1 = org.telegram.messenger.wp.r1(photoViewer4.T).Z1(Long.valueOf(e20Var.f15524n));
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        int indexOf3 = arrayList4.indexOf(photo);
                        if (indexOf3 >= 0) {
                            arrayList4.set(indexOf3, tL_photos_photo.photo);
                        }
                        if (Z1 != null) {
                            Z1.photo.photo_id = tL_photos_photo.photo.f19818id;
                            e20Var.w(Z1);
                            e20Var.v(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 21:
                qt0.Z((qt0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TL_stars.updatePaidMessagesPrice) obj);
                return;
            case 22:
                PrivacyControlActivity.a0((PrivacyControlActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (boolean[]) obj);
                return;
            case 23:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj4;
                TLObject tLObject6 = (TLObject) obj2;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) obj;
                try {
                    ((org.telegram.ui.ActionBar.x1) obj3).dismiss();
                } catch (Exception e11) {
                    org.telegram.messenger.f8.g(e11, true);
                }
                if (tLObject6 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.Q = true;
                    privacySettingsActivity.getContactsController().H = setaccountttl.ttl.days;
                    privacySettingsActivity.f33766a.f();
                    return;
                }
                return;
            case 24:
                org.telegram.ui.ActionBar.x1 x1Var3 = (org.telegram.ui.ActionBar.x1) obj4;
                boolean[] zArr2 = (boolean[]) obj3;
                Activity activity = (Activity) obj2;
                File file = (File) obj;
                RectF rectF = ProfileActivity.S6;
                try {
                    x1Var3.dismiss();
                } catch (Exception unused2) {
                }
                if (zArr2[0]) {
                    int i23 = Build.VERSION.SDK_INT;
                    if (i23 >= 24) {
                        org.telegram.messenger.w0.d();
                        fromFile = FileProvider.d(activity, "org.telegram.messenger.beta.provider", file);
                    } else {
                        fromFile = Uri.fromFile(file);
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    if (i23 >= 24) {
                        intent.addFlags(1);
                    }
                    intent.setType("message/rfc822");
                    intent.putExtra("android.intent.extra.EMAIL", "");
                    intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + org.telegram.messenger.dd.D0().y0().format(System.currentTimeMillis()));
                    intent.putExtra("android.intent.extra.STREAM", fromFile);
                    if (activity != null) {
                        try {
                            activity.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
                            return;
                        } catch (Exception e12) {
                            org.telegram.messenger.f8.g(e12, true);
                            return;
                        }
                    }
                    return;
                } else if (activity != null) {
                    Toast.makeText(activity, org.telegram.messenger.dd.L0(2131751106, null), 0).show();
                    return;
                } else {
                    return;
                }
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                int[] iArr2 = (int[]) obj;
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    RectF rectF2 = ProfileActivity.S6;
                    profileActivity.getClass();
                    org.telegram.ui.Components.cc.a0(profileActivity).f0(tL_error8, false);
                }
                if (profileActivity.f33875n4 == iArr2[0]) {
                    profileActivity.f33875n4 = 0;
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                String[] strArr = (String[]) obj3;
                String str13 = (String) obj2;
                String str14 = (String) obj;
                RectF rectF3 = ProfileActivity.S6;
                if (org.telegram.messenger.i0.E1(profileActivity2.getParentActivity())) {
                    org.telegram.ui.Components.n31.U0(profileActivity2.getParentActivity(), profileActivity2, strArr[0], str13, str14, new j10(profileActivity2, 2), null);
                    return;
                }
                return;
            case 27:
                ProfileActivity profileActivity3 = (ProfileActivity) obj4;
                TLObject tLObject7 = (TLObject) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj;
                if (tLObject7 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity3.f33803d1 != 0) {
                        L03 = profileActivity3.getMessagesController().Z1(Long.valueOf(profileActivity3.f33803d1));
                    } else {
                        L03 = profileActivity3.getMessagesController().L0(Long.valueOf(profileActivity3.f33810e1));
                    }
                    h10.a(profileActivity3.getParentActivity(), 0, tL_username.username, L03, (TL_fragment.TL_collectibleInfo) tLObject7, profileActivity3.f33957z0);
                    return;
                }
                RectF rectF4 = ProfileActivity.S6;
                org.telegram.ui.Components.cc.d0(tL_error9);
                return;
            case 28:
                ProfileActivity.e0((ProfileActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                return;
            default:
                TLObject tLObject8 = (TLObject) obj3;
                org.telegram.messenger.e20 e20Var2 = (org.telegram.messenger.e20) obj2;
                TLRPC.Photo photo2 = (TLRPC.Photo) obj;
                ProfileActivity profileActivity4 = ((cx0) obj4).f36436b;
                profileActivity4.f33871n0.f31287c1--;
                if (tLObject8 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject8;
                    profileActivity4.getMessagesController().V3(tL_photos_photo2.users, false);
                    TLRPC.User Z12 = profileActivity4.getMessagesController().Z1(Long.valueOf(e20Var2.f15524n));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList5 = profileActivity4.f33871n0.V0;
                        if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(photo2)) >= 0) {
                            arrayList5.set(indexOf, photo3);
                        }
                        if (Z12 != null) {
                            Z12.photo.photo_id = tL_photos_photo2.photo.f19818id;
                            e20Var2.w(Z12);
                            e20Var2.v(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
