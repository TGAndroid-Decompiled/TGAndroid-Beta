package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class sj0 implements Runnable {
    public final int f37902a;
    public final Object f37903b;
    public final Object f37904c;

    public sj0(int i10, Object obj, Object obj2) {
        this.f37902a = i10;
        this.f37903b = obj;
        this.f37904c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        String formatPluralString;
        boolean z10;
        boolean z11;
        TLRPC.Chat chat;
        int i14;
        int i15;
        String string;
        String formatString;
        org.telegram.ui.Components.rc Q;
        String str;
        mo0 mo0Var;
        mo0 mo0Var2;
        jk jkVar;
        String str2 = "";
        switch (this.f37902a) {
            case 0:
                wj0 wj0Var = (wj0) this.f37903b;
                wj0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + ((String) this.f37904c)));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                wj0Var.getContext().startActivity(intent);
                return;
            case 1:
                TLRPC.User user = (TLRPC.User) this.f37904c;
                ((wj0) this.f37903b).dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(user.f18499id));
                    return;
                }
                return;
            case 2:
                ((bt) this.f37903b).run((TLRPC.User) this.f37904c);
                return;
            case 3:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.f37903b, (ArrayList) this.f37904c);
                return;
            case 4:
                Runnable runnable = (Runnable) this.f37904c;
                for (as asVar : ((PasscodeActivity) this.f37903b).f31248n.f40347f) {
                    asVar.l(0.0f);
                }
                runnable.run();
                return;
            case 5:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f37904c;
                PasscodeActivity passcodeActivity = ((gl0) this.f37903b).f34102b;
                if (passcodeActivity.f31253y == 0) {
                    i10 = R.string.PasscodeSwitchToPassword;
                } else {
                    i10 = R.string.PasscodeSwitchToPIN;
                }
                e1Var.setText(LocaleController.getString(i10));
                if (passcodeActivity.f31253y == 0) {
                    i11 = R.drawable.msg_permissions;
                } else {
                    i11 = R.drawable.msg_pin_code;
                }
                e1Var.setIcon(i11);
                passcodeActivity.k0();
                if (passcodeActivity.e0()) {
                    passcodeActivity.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f31250s, true, 0.1f, false);
                    return;
                }
                return;
            case 6:
                ((PasskeysActivity) this.f37903b).Y((TL_account.Passkey) this.f37904c);
                return;
            case 7:
                fn0 fn0Var = (fn0) this.f37903b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.f37904c;
                int[] iArr = fn0Var.f33839x;
                int i16 = result.type;
                if (i16 == 2) {
                    if (!(fn0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = fn0Var.G.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) fn0Var.G.get(i17);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    fn0Var.F = tL_secureRequiredType;
                                    fn0Var.P1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i16 == 1) {
                    if (!(fn0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = fn0Var.G.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) fn0Var.G.get(i18);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    fn0Var.F = tL_secureRequiredType2;
                                    fn0Var.P1();
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                } else if (i16 == 3) {
                    if (!(fn0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = fn0Var.G.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) fn0Var.G.get(i19);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    fn0Var.F = tL_secureRequiredType3;
                                    fn0Var.P1();
                                } else {
                                    i19++;
                                }
                            }
                        }
                    }
                } else if (i16 == 4 && !(fn0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = fn0Var.G.size();
                    int i20 = 0;
                    while (true) {
                        if (i20 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) fn0Var.G.get(i20);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                fn0Var.F = tL_secureRequiredType4;
                                fn0Var.P1();
                            } else {
                                i20++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    fn0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    fn0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    fn0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    fn0Var.Y[7].setText(result.number);
                }
                int i21 = result.gender;
                if (i21 != 0) {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            fn0Var.f33836w = "female";
                            fn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        }
                    } else {
                        fn0Var.f33836w = "male";
                        fn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str3 = result.nationality;
                    fn0Var.f33827s = str3;
                    String str4 = (String) fn0Var.Y0.get(str3);
                    if (str4 != null) {
                        fn0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str5 = result.issuingCountry;
                    fn0Var.v = str5;
                    String str6 = (String) fn0Var.Y0.get(str5);
                    if (str6 != null) {
                        fn0Var.Y[6].setText(str6);
                    }
                }
                int i22 = result.birthDay;
                if (i22 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    fn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i22), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i23 = result.expiryDay;
                if (i23 > 0 && (i12 = result.expiryMonth) > 0 && (i13 = result.expiryYear) > 0) {
                    iArr[0] = i13;
                    iArr[1] = i12;
                    iArr[2] = i23;
                    fn0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i23), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    return;
                }
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                fn0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 8:
                fn0 fn0Var2 = (fn0) this.f37903b;
                TLObject tLObject = (TLObject) this.f37904c;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    fn0Var2.J = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.e5.x0(fn0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TwoStepVerificationActivity.m0(fn0Var2.J);
                    fn0Var2.R1();
                    if (fn0Var2.Z[0].getVisibility() == 0) {
                        fn0Var2.Y[0].requestFocus();
                        AndroidUtilities.showKeyboard(fn0Var2.Y[0]);
                    }
                    if (fn0Var2.N0 == 1) {
                        fn0Var2.B1(true);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                fn0 fn0Var3 = (fn0) this.f37903b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f37904c;
                if (tL_error == null) {
                    fn0Var3.f33802f1 = true;
                    fn0Var3.W0(true);
                    fn0Var3.finishFragment();
                    return;
                }
                fn0Var3.N1(false, false);
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.e5.x0(fn0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    return;
                } else {
                    fn0Var3.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 10:
                ((an0) this.f37903b).f32275a.K = ((TLRPC.TL_error) this.f37904c).text;
                return;
            case 11:
                ((no0) this.f37903b).D0(false);
                ((View) this.f37904c).callOnClick();
                return;
            case 12:
                no0 no0Var = (no0) this.f37903b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f37904c;
                no0Var.H0(true, false);
                if (tL_error2 == null) {
                    if (no0Var.getParentActivity() != null) {
                        kn0 kn0Var = no0Var.f36058d0;
                        if (kn0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(kn0Var);
                            no0Var.f36058d0 = null;
                        }
                        no0Var.t0();
                        return;
                    }
                    return;
                } else if (tL_error2.text.startsWith("CODE_INVALID")) {
                    org.telegram.ui.Cells.k3 k3Var = no0Var.S;
                    try {
                        k3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.shakeViewSpring(k3Var, 2.5f);
                    org.telegram.ui.Cells.k3 k3Var2 = no0Var.S;
                    k3Var2.f20573a.setText("");
                    k3Var2.f20574b = false;
                    k3Var2.setWillNotDraw(true);
                    return;
                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    no0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    no0Var.F0(LocaleController.getString(R.string.AppName), tL_error2.text);
                    return;
                }
            case 13:
                no0.W((no0) this.f37903b, (TLRPC.TL_payments_validatedRequestedInfo) this.f37904c);
                return;
            case 14:
                no0 no0Var2 = (no0) this.f37903b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.f37904c;
                Context parentActivity = no0Var2.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.G1;
                }
                if (parentActivity != null) {
                    no0Var2.f36051a1 = true;
                    no0Var2.f36064f1 = 1;
                    TLRPC.InputInvoice inputInvoice = no0Var2.f36054b1;
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
                    if (!z12 && (mo0Var2 = no0Var2.Z0) != null) {
                        mo0Var2.a(1);
                    }
                    no0Var2.t0();
                    if (z12 && (mo0Var = no0Var2.Z0) != null) {
                        mo0Var.a(no0Var2.f36064f1);
                    }
                    long r02 = no0Var2.r0();
                    int i24 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                    if (i24 > 0) {
                        str2 = UserObject.getForcedFirstName(no0Var2.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (i24 < 0 && (chat = no0Var2.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str2 = chat.title;
                    }
                    long q02 = no0Var2.q0();
                    if (z12) {
                        if (!z10 && !z11) {
                            i14 = R.raw.stars_topup;
                        } else {
                            i14 = R.raw.stars_send;
                        }
                    } else {
                        i14 = R.raw.payment_success;
                    }
                    int i25 = i14;
                    if (!z12) {
                        string = null;
                    } else {
                        if (z11) {
                            i15 = R.string.StarsGiveawaySentPopup;
                        } else if (z10) {
                            i15 = R.string.StarsGiftSentPopup;
                        } else {
                            i15 = R.string.StarsAcquired;
                        }
                        string = LocaleController.getString(i15);
                    }
                    if (z12) {
                        if (z11) {
                            formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                        } else {
                            if (z10) {
                                str = "StarsGiftSentPopupInfo";
                            } else {
                                str = "StarsAcquiredInfo";
                            }
                            formatString = LocaleController.formatPluralStringComma(str, (int) q02, str2);
                        }
                    } else {
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, no0Var2.R0[0], no0Var2.f36075q0);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                    if (U2 != null) {
                        org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(U2);
                        if (i24 != 0 && string != null && !z11) {
                            Q = a02.K(i25, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new on0(r02, 0));
                        } else {
                            String str7 = string;
                            if (str7 != null) {
                                Q = a02.M(str7, replaceTags, i25);
                            } else {
                                Q = a02.Q(i25, 36, replaceTags);
                            }
                        }
                        org.telegram.ui.Components.rc rcVar = Q;
                        rcVar.f27954r = false;
                        rcVar.f27946j = 5000;
                        if (messageArr[0] != null) {
                            ai.l5 l5Var = new ai.l5(no0Var2, rcVar, z10, messageArr, 3);
                            org.telegram.ui.Components.vb vbVar = rcVar.e;
                            if (vbVar != null) {
                                vbVar.setOnClickListener(l5Var);
                            }
                        }
                        rcVar.k(z11);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                PhotoViewer photoViewer = (PhotoViewer) this.f37903b;
                z31.T(photoViewer.E, photoViewer.f31368m4, false, (ai.d) this.f37904c, null);
                return;
            case 16:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f37903b;
                ys0 ys0Var = (ys0) this.f37904c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (ys0Var.getWindow() != null) {
                    ys0Var.setFocusable(true);
                    wn wnVar = photoViewer2.l4;
                    if (wnVar != null && (jkVar = wnVar.Y) != null) {
                        jkVar.m0(false);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                ((ai.l) this.f37903b).run((Bitmap) this.f37904c);
                return;
            case 18:
                PhotoViewer photoViewer3 = (PhotoViewer) this.f37903b;
                qg.x0 x0Var = (qg.x0) this.f37904c;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                x0Var.e.h();
                x0Var.f42087c.postRunnable(new l21(12));
                photoViewer3.f31297e0.removeView(photoViewer3.N1);
                return;
            case 19:
                org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) this.f37903b;
                Bitmap bitmap = (Bitmap) this.f37904c;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                if (d6Var != null) {
                    ArrayList arrayList = d6Var.h;
                    org.telegram.ui.Components.a6 a6Var = d6Var.f23539n;
                    if (a6Var != null) {
                        arrayList.add(a6Var);
                    }
                    org.telegram.ui.Components.a6 a6Var2 = d6Var.f23544r;
                    if (a6Var2 != null) {
                        arrayList.add(a6Var2);
                    }
                    org.telegram.ui.Components.a6 a6Var3 = d6Var.f23546s;
                    if (a6Var3 != null) {
                        arrayList.add(a6Var3);
                    }
                    d6Var.f23539n = new org.telegram.ui.Components.a6(bitmap);
                    d6Var.f23544r = null;
                    d6Var.f23546s = null;
                    d6Var.t();
                    return;
                }
                return;
            case 20:
                yr0 yr0Var = (yr0) this.f37903b;
                yr0Var.getClass();
                ((View) this.f37904c).setOutlineProvider(null);
                PhotoViewer photoViewer4 = yr0Var.f40350c;
                ImageView imageView = photoViewer4.f31469x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                mu0 mu0Var = photoViewer4.E2;
                if (mu0Var != null) {
                    mu0Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 21:
                jt0 jt0Var = (jt0) this.f37903b;
                org.telegram.ui.Components.v71 v71Var = (org.telegram.ui.Components.v71) this.f37904c;
                jt0Var.getClass();
                if (v71Var.p() > 0 && v71Var.n() >= v71Var.p() - 590) {
                    jt0Var.f34958a.f31297e0.invalidate();
                    return;
                }
                return;
            case 22:
                nt0 nt0Var = (nt0) this.f37903b;
                qg.x0 x0Var2 = (qg.x0) this.f37904c;
                x0Var2.e.h();
                x0Var2.f42087c.postRunnable(new l21(12));
                try {
                    nt0Var.f36138b.f31297e0.removeView(x0Var2);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 23:
                ci.m6 m6Var = (ci.m6) this.f37904c;
                PhotoViewer photoViewer5 = ((ss0) this.f37903b).f37967b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.f31469x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.f31469x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) m6Var.f5178b).setImageBitmap(photoViewer5.C3);
                    return;
                }
                return;
            case 24:
                ((xt0) this.f37903b).f40092r.f31363l7.lock();
                ((AnimatorSet) this.f37904c).start();
                return;
            case 25:
                vu0 vu0Var = (vu0) this.f37904c;
                ((xt0) this.f37903b).f40092r.f31423s4 = false;
                if (!vu0Var.f38922s) {
                    vu0Var.f38907a.setVisible(false, true);
                    return;
                }
                return;
            case 26:
                dw0 dw0Var = (dw0) this.f37903b;
                dw0Var.getClass();
                AndroidUtilities.addToClipboard((String) this.f37904c);
                dw0Var.c(true);
                return;
            case 27:
                dw0 dw0Var2 = (dw0) this.f37903b;
                dw0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) this.f37904c).text, false));
                dw0Var2.c(true);
                return;
            case 28:
                dw0 dw0Var3 = (dw0) this.f37903b;
                SendMessagesHelper.getInstance(dw0Var3.H.currentAccount).deletePollOption(dw0Var3.H, (byte[]) this.f37904c);
                dw0Var3.c(true);
                return;
            default:
                PrivacyControlActivity.W((PrivacyControlActivity) this.f37903b, (TLObject) this.f37904c);
                return;
        }
    }
}
