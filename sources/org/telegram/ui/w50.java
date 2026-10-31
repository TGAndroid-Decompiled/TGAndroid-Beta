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
public final class w50 implements Runnable {
    public final int f42880a;
    public final Object f42881b;
    public final Object f42882c;
    public final Object d;
    public final Object e;

    public w50(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f42880a = i10;
        this.d = obj;
        this.f42881b = obj2;
        this.f42882c = obj3;
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
        rm0 rm0Var;
        rm0 rm0Var2;
        Uri fromFile;
        TLObject L03;
        int indexOf;
        int i16 = this.f42880a;
        String str2 = "";
        Object obj = this.e;
        Object obj2 = this.f42882c;
        Object obj3 = this.f42881b;
        Object obj4 = this.d;
        switch (i16) {
            case 0:
                c60.Y((c60) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                return;
            case 1:
                j60 j60Var = (j60) obj4;
                j60Var.d = (ArrayList) obj3;
                j60Var.e = (ArrayList) obj2;
                j60Var.f();
                k60 k60Var = j60Var.f38439r;
                k60Var.f38696b.d.setVisibility(8);
                k60Var.f38696b.e.setText(org.telegram.messenger.cd.a0(null, null, 2131752117, (String) obj));
                k60Var.f38696b.e(false, true);
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                f70 f70Var = (f70) obj3;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.D1;
                try {
                    f70Var.run();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                if (tLObject instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject;
                    Pattern pattern2 = org.telegram.ui.Components.s4.f30123a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str3 = tL_langPackLanguage.base_lang_code;
                    if (str3 != null) {
                        tL_langPackLanguage.base_lang_code = str3.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                    boolean equals = org.telegram.messenger.cd.D0().B.f19497c.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    if (equals) {
                        x1Var.R = org.telegram.messenger.cd.L0(2131749064, null);
                        a02 = org.telegram.messenger.cd.a0("LanguageSame", null, 2131749057, tL_langPackLanguage.name);
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747847, null), null);
                        alertDialog$Builder.i(org.telegram.messenger.cd.L0(2131746000, null), new org.telegram.ui.Components.y0(launchActivity, 0));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        x1Var.R = org.telegram.messenger.cd.L0(2131749054, null);
                        a02 = org.telegram.messenger.cd.a0("LanguageUnknownCustomAlert", null, 2131749055, tL_langPackLanguage.name);
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747847, null), null);
                    } else {
                        x1Var.R = org.telegram.messenger.cd.L0(2131749056, null);
                        if (tL_langPackLanguage.official) {
                            a02 = org.telegram.messenger.cd.a0("LanguageAlert", null, 2131749063, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        } else {
                            a02 = org.telegram.messenger.cd.a0("LanguageCustomAlert", null, 2131749060, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752552, null), new ng.d(24, tL_langPackLanguage, launchActivity));
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
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
                    org.telegram.ui.ActionBar.a7.H(textView, org.telegram.ui.ActionBar.t6.f21057k5, null);
                    org.telegram.ui.ActionBar.a7.D(textView, org.telegram.ui.ActionBar.t6.f21075l5, null);
                    textView.setPadding(org.telegram.messenger.i0.L(23.0f), 0, org.telegram.messenger.i0.L(23.0f), 0);
                    textView.setMovementMethod(new org.telegram.messenger.e0(false));
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21037j5, null);
                    alertDialog$Builder.o(textView);
                    launchActivity.F0(alertDialog$Builder);
                    return;
                } else if (tL_error != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error.text)) {
                        launchActivity.F0(org.telegram.ui.Components.s4.M(launchActivity, null, org.telegram.messenger.cd.L0(2131749053, null)));
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.messenger.z20.q(null, 2131751106, sb2, "\n");
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
                    org.telegram.messenger.i0.g3(new f70(4, fVar, tL_error2));
                    return;
                }
                return;
            case 4:
                ua0 ua0Var = (ua0) obj4;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                org.telegram.ui.Components.vq.e(k2Var.getContext(), ua0Var.f42101b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new org.telegram.ui.Components.vg(19, ua0Var, userArr), k2Var.getResourceProvider(), ua0.d());
                return;
            case 5:
                ra0.y0((ra0) obj4, (TLObject) obj3, (HashSet) obj2, (TLRPC.TL_error) obj);
                return;
            case 6:
                EditText editText = (EditText) obj2;
                ag.u2 u2Var = (ag.u2) obj;
                ((org.telegram.ui.Components.ec0) obj4).a(0.0f);
                ((View) obj3).setTag(2131296713, null);
                if (editText != null) {
                    editText.post(new f70(16, editText, u2Var));
                    return;
                }
                return;
            case 7:
                bd0 bd0Var = (bd0) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                if (str4 != null) {
                    bArr = org.telegram.messenger.i0.h1(str4);
                } else {
                    bArr = null;
                }
                ad0 ad0Var = new ad0(bd0Var, str4, str5, 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = bd0Var.f36182s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str4 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = org.telegram.messenger.aw.b(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error3 = new TLRPC.TL_error();
                            tL_error3.text = "ALGO_INVALID";
                            ad0Var.run(null, tL_error3);
                        }
                    }
                    i11 = ((org.telegram.ui.ActionBar.k2) bd0Var.G).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_auth_recoverPassword, ad0Var, 10);
                    return;
                }
                TLRPC.TL_error tL_error4 = new TLRPC.TL_error();
                tL_error4.text = "PASSWORD_HASH_INVALID";
                ad0Var.run(null, tL_error4);
                return;
            case 8:
                od0 od0Var = (od0) obj4;
                String str6 = (String) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                hf0 hf0Var = od0Var.D;
                hf0Var.s1(false, true);
                od0Var.f40236n = false;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str6);
                    bundle.putString("password", od0Var.h);
                    hf0Var.C1(9, true, bundle, false);
                    return;
                } else if (tL_error5 != null && !tL_error5.text.startsWith("CODE_INVALID")) {
                    if (tL_error5.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error5.text).intValue();
                        if (intValue < 60) {
                            G = org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            G = org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, G));
                        return;
                    }
                    hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error5.text);
                    return;
                } else {
                    od0Var.n(true);
                    return;
                }
            case 9:
                me0 me0Var = (me0) obj4;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                Bundle bundle2 = (Bundle) obj2;
                TLObject tLObject3 = (TLObject) obj;
                hf0 hf0Var2 = me0Var.f39682u0;
                me0Var.f39665f0 = false;
                if (tL_error6 == null) {
                    me0Var.f39676q0 = bundle2;
                    if (tLObject3 instanceof TLRPC.TL_auth_sentCode) {
                        TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject3;
                        me0Var.f39678r0 = tL_auth_sentCode;
                        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                            me0Var.f39668i0 = 17;
                        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                            me0Var.f39668i0 = 16;
                        }
                        hf0Var2.o1(bundle2, tL_auth_sentCode, true);
                    } else if (tLObject3 instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
                        TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) tLObject3;
                        bundle2.putString("product", tL_auth_sentCodePaymentRequired.store_product);
                        bundle2.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
                        bundle2.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
                        bundle2.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
                        bundle2.putString("currency", tL_auth_sentCodePaymentRequired.currency);
                        bundle2.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
                        bundle2.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
                        hf0Var2.C1(18, true, bundle2, true);
                    }
                } else {
                    String str7 = tL_error6.text;
                    if (str7 != null) {
                        if (str7.contains("PHONE_NUMBER_INVALID")) {
                            hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131749189, null));
                        } else if (!tL_error6.text.contains("PHONE_CODE_EMPTY") && !tL_error6.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error6.text.contains("PHONE_CODE_EXPIRED")) {
                                me0Var.c(true);
                                hf0Var2.C1(0, true, null, true);
                                hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, null));
                            } else if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                                hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131750688, null));
                            } else if (tL_error6.code != -1000) {
                                String L04 = org.telegram.messenger.cd.L0(2131746088, null);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.messenger.z20.q(null, 2131751106, sb3, "\n");
                                sb3.append(tL_error6.text);
                                hf0Var2.t1(L04, sb3.toString());
                            }
                        } else {
                            hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131749193, null));
                        }
                    }
                }
                me0Var.y(false);
                return;
            case 10:
                se0.n((se0) obj4, (String) obj3, (String) obj2, (String) obj);
                return;
            case 11:
                c5.m mVar = (c5.m) obj3;
                s3 s3Var = (s3) obj2;
                hf0 hf0Var3 = ((se0) obj4).f41491w;
                hf0Var3.e = true;
                org.telegram.messenger.u1.i().d(mVar.f3801c, new f3(s3Var, 3));
                org.telegram.messenger.u1.i().h = new re0(s3Var, 0);
                org.telegram.messenger.u1 i18 = org.telegram.messenger.u1.i();
                Activity parentActivity = hf0Var3.getParentActivity();
                i12 = ((org.telegram.ui.ActionBar.k2) hf0Var3).currentAccount;
                org.telegram.messenger.c a2 = org.telegram.messenger.c.a(i12);
                hf.b bVar = new hf.b(9, false);
                bVar.m0(mVar);
                i18.l(parentActivity, a2, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(bVar.K()));
                return;
            case 12:
                gf0 gf0Var = (gf0) obj4;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                String str8 = (String) obj;
                gf0Var.M = false;
                hf0 hf0Var4 = gf0Var.f37534a0;
                hf0Var4.D1(false, true);
                if (tL_error7 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject4;
                    if (!TwoStepVerificationActivity.m0(password, true)) {
                        org.telegram.ui.Components.s4.w0(hf0Var4.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, "UpdateAppAlert"), true);
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle3.putString("password", Utilities.f(serializedData.toByteArray()));
                    bundle3.putString("phoneFormated", str8);
                    hf0Var4.C1(6, true, bundle3, false);
                    return;
                }
                hf0Var4.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error7.text);
                return;
            case 13:
                ph0 ph0Var = (ph0) obj4;
                cg.b bVar2 = (cg.b) obj3;
                String str9 = (String) obj2;
                t61 t61Var = (t61) obj;
                sh0 sh0Var = ph0Var.f40673w.d;
                if (bVar2 != null) {
                    sh0Var.f41524w.l(str9, bVar2);
                }
                if (bVar2 != null && !t61Var.f41746b && (i13 = t61Var.f41745a) >= 0) {
                    View m10 = sh0Var.h.m(i13);
                    if (m10 instanceof e61) {
                        ph0Var.f36964r.e = bVar2;
                        e61 e61Var = (e61) m10;
                        e61Var.f36960b.f2739t0.d(false, false);
                        e61Var.g(false);
                    }
                }
                ph0Var.f();
                return;
            case 14:
                si0 si0Var = (si0) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                zf.m1 m1Var = si0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = si0Var.f41529n;
                if (notificationsCustomSettingsActivity.f33400f) {
                    si0Var.f41528f = null;
                    si0Var.d = arrayList;
                    si0Var.e = arrayList2;
                    m1Var.f(arrayList3, null);
                    if (notificationsCustomSettingsActivity.f33400f && !m1Var.e()) {
                        notificationsCustomSettingsActivity.f33399c.c();
                    }
                    si0Var.f();
                    return;
                }
                return;
            case 15:
                sm0 sm0Var = (sm0) obj4;
                TLRPC.Message message = (TLRPC.Message) obj;
                sm0Var.f41548a1 = true;
                sm0Var.f41561f1 = 1;
                sm0Var.C0((org.telegram.ui.ActionBar.z4) obj3, (Activity) obj2);
                TLRPC.InputInvoice inputInvoice = sm0Var.f41551b1;
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
                if (!z12 && (rm0Var2 = sm0Var.Z0) != null) {
                    rm0Var2.e(sm0Var.f41561f1);
                }
                sm0Var.y0();
                if (z12 && (rm0Var = sm0Var.Z0) != null) {
                    rm0Var.e(sm0Var.f41561f1);
                }
                long v02 = sm0Var.v0();
                int i19 = (v02 > 0L ? 1 : (v02 == 0L ? 0 : -1));
                if (i19 > 0) {
                    str2 = org.telegram.messenger.h20.k(sm0Var.getMessagesController().Z1(Long.valueOf(v02)));
                } else if (i19 < 0 && (L0 = sm0Var.getMessagesController().L0(Long.valueOf(-v02))) != null) {
                    str2 = L0.title;
                }
                long u02 = sm0Var.u0();
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
                    L02 = org.telegram.messenger.cd.L0(i15, null);
                }
                if (z12) {
                    if (z11) {
                        a03 = org.telegram.messenger.cd.H(',', "StarsGiveawaySentPopupInfo", (int) u02);
                    } else {
                        if (z10) {
                            str = "StarsGiftSentPopupInfo";
                        } else {
                            str = "StarsAcquiredInfo";
                        }
                        a03 = org.telegram.messenger.cd.K(str, (int) u02, ',', str2);
                    }
                } else {
                    a03 = org.telegram.messenger.cd.a0(null, null, 2131747417, sm0Var.R0[0], sm0Var.f41572q0);
                }
                SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(a03);
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.Components.cc a04 = org.telegram.ui.Components.cc.a0(T);
                    if (i19 != 0 && L02 != null && !z11) {
                        Q = a04.L(i20, L02, W2, org.telegram.messenger.cd.L0(2131743578, null), new vl0(v02, 1));
                    } else {
                        String str10 = L02;
                        if (str10 != null) {
                            Q = a04.I(i20, str10, W2);
                        } else {
                            Q = a04.Q(i20, 36, W2);
                        }
                    }
                    Q.f32143r = false;
                    Q.f32135j = 5000;
                    if (message != null) {
                        kg.z0 z0Var = new kg.z0(sm0Var, Q, z10, message, 4);
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
                sm0.h0((sm0) obj4, (TLObject) obj3, (TLRPC.TL_error) obj2, (TL_account.getTmpPassword) obj);
                return;
            case 17:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj2;
                String str11 = (String) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                Bitmap decodeFile = BitmapFactory.decodeFile(((org.telegram.messenger.ef) obj3).I);
                if (decodeFile == null) {
                    org.telegram.messenger.i0.g3(new qo0(photoViewer, 10));
                    return;
                }
                int[] iArr = new int[11];
                AnimatedFileNative.d(efVar.I, iArr, 0L);
                int max = Math.max(iArr[1], efVar.F);
                int max2 = Math.max(iArr[2], efVar.G);
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
                    org.telegram.messenger.i0.g3(new w50(photoViewer, efVar, str11, createBitmap2, 18));
                    return;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    org.telegram.messenger.i0.g3(new qo0(photoViewer, 11));
                    return;
                }
            case 18:
                PhotoViewer photoViewer2 = (PhotoViewer) obj4;
                org.telegram.messenger.ef efVar2 = (org.telegram.messenger.ef) obj3;
                String str12 = (String) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                if (efVar2.f19510g != null) {
                    try {
                        new File(efVar2.f19510g).delete();
                    } catch (Exception e10) {
                        org.telegram.messenger.f8.g(e10, true);
                    }
                }
                efVar2.d = -1L;
                efVar2.f19510g = str12;
                efVar2.e = null;
                efVar2.f19509f = null;
                photoViewer2.f33579q5.f29346b.setLoading(false);
                es0 es0Var = photoViewer2.d;
                if (es0Var != null) {
                    es0Var.X(photoViewer2.P4);
                }
                hq0 hq0Var = photoViewer2.f33488g1;
                if (hq0Var != null) {
                    hq0Var.setImage(bitmap);
                }
                photoViewer2.h3(0);
                CheckBox checkBox = photoViewer2.N0;
                if (!checkBox.f23905y) {
                    checkBox.callOnClick();
                    return;
                }
                return;
            case 19:
                PhotoViewer photoViewer3 = (PhotoViewer) obj4;
                Bitmap bitmap2 = (Bitmap) obj3;
                boolean[] zArr = (boolean[]) obj2;
                mp0 mp0Var = (mp0) obj;
                ImageView imageView = photoViewer3.f33643x3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap2);
                    photoViewer3.f33643x3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer3.C2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        mp0Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                TLObject tLObject5 = (TLObject) obj3;
                org.telegram.messenger.d20 d20Var = (org.telegram.messenger.d20) obj2;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                PhotoViewer photoViewer4 = ((aq0) obj4).f35697b;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    int i22 = photoViewer4.T;
                    ArrayList arrayList4 = photoViewer4.f7;
                    org.telegram.messenger.vp.r1(i22).V3(tL_photos_photo.users, false);
                    TLRPC.User Z1 = org.telegram.messenger.vp.r1(photoViewer4.T).Z1(Long.valueOf(d20Var.f15165n));
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        int indexOf3 = arrayList4.indexOf(photo);
                        if (indexOf3 >= 0) {
                            arrayList4.set(indexOf3, tL_photos_photo.photo);
                        }
                        if (Z1 != null) {
                            Z1.photo.photo_id = tL_photos_photo.photo.f19817id;
                            d20Var.w(Z1);
                            d20Var.v(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 21:
                rt0.Y((rt0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TL_stars.updatePaidMessagesPrice) obj);
                return;
            case 22:
                PrivacyControlActivity.Z((PrivacyControlActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (boolean[]) obj);
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
                    privacySettingsActivity.f33759a.f();
                    return;
                }
                return;
            case 24:
                org.telegram.ui.ActionBar.x1 x1Var3 = (org.telegram.ui.ActionBar.x1) obj4;
                boolean[] zArr2 = (boolean[]) obj3;
                Activity activity = (Activity) obj2;
                File file = (File) obj;
                RectF rectF = ProfileActivity.R6;
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
                    intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + org.telegram.messenger.cd.D0().y0().format(System.currentTimeMillis()));
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
                    Toast.makeText(activity, org.telegram.messenger.cd.L0(2131751106, null), 0).show();
                    return;
                } else {
                    return;
                }
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                int[] iArr2 = (int[]) obj;
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    RectF rectF2 = ProfileActivity.R6;
                    profileActivity.getClass();
                    org.telegram.ui.Components.cc.a0(profileActivity).f0(tL_error8, false);
                }
                if (profileActivity.f33868n4 == iArr2[0]) {
                    profileActivity.f33868n4 = 0;
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                String[] strArr = (String[]) obj3;
                String str13 = (String) obj2;
                String str14 = (String) obj;
                RectF rectF3 = ProfileActivity.R6;
                if (org.telegram.messenger.i0.E1(profileActivity2.getParentActivity())) {
                    org.telegram.ui.Components.m31.U0(profileActivity2.getParentActivity(), profileActivity2, strArr[0], str13, str14, new k10(profileActivity2, 2), null);
                    return;
                }
                return;
            case 27:
                ProfileActivity profileActivity3 = (ProfileActivity) obj4;
                TLObject tLObject7 = (TLObject) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj;
                if (tLObject7 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity3.f33796d1 != 0) {
                        L03 = profileActivity3.getMessagesController().Z1(Long.valueOf(profileActivity3.f33796d1));
                    } else {
                        L03 = profileActivity3.getMessagesController().L0(Long.valueOf(profileActivity3.f33803e1));
                    }
                    i10.a(profileActivity3.getParentActivity(), 0, tL_username.username, L03, (TL_fragment.TL_collectibleInfo) tLObject7, profileActivity3.f33950z0);
                    return;
                }
                RectF rectF4 = ProfileActivity.R6;
                org.telegram.ui.Components.cc.d0(tL_error9);
                return;
            case 28:
                ProfileActivity.d0((ProfileActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                return;
            default:
                TLObject tLObject8 = (TLObject) obj3;
                org.telegram.messenger.d20 d20Var2 = (org.telegram.messenger.d20) obj2;
                TLRPC.Photo photo2 = (TLRPC.Photo) obj;
                ProfileActivity profileActivity4 = ((dx0) obj4).f36859b;
                profileActivity4.f33864n0.f30928c1--;
                if (tLObject8 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject8;
                    profileActivity4.getMessagesController().V3(tL_photos_photo2.users, false);
                    TLRPC.User Z12 = profileActivity4.getMessagesController().Z1(Long.valueOf(d20Var2.f15165n));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList5 = profileActivity4.f33864n0.V0;
                        if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(photo2)) >= 0) {
                            arrayList5.set(indexOf, photo3);
                        }
                        if (Z12 != null) {
                            Z12.photo.photo_id = tL_photos_photo2.photo.f19817id;
                            d20Var2.w(Z12);
                            d20Var2.v(true);
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
