package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
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
public final class wj0 implements Runnable {
    public final int f42504a;
    public final Object f42505b;
    public final Object f42506c;

    public wj0(int i10, Object obj, Object obj2) {
        this.f42504a = i10;
        this.f42505b = obj;
        this.f42506c = obj2;
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
        ro0 ro0Var;
        ro0 ro0Var2;
        jk jkVar;
        String str2 = "";
        switch (this.f42504a) {
            case 0:
                ((ft) this.f42505b).run((TLRPC.User) this.f42506c);
                return;
            case 1:
                NotificationsCustomSettingsActivity.U((NotificationsCustomSettingsActivity) this.f42505b, (ArrayList) this.f42506c);
                return;
            case 2:
                Runnable runnable = (Runnable) this.f42506c;
                for (es esVar : ((PasscodeActivity) this.f42505b).f33844n.f35543f) {
                    esVar.l(0.0f);
                }
                runnable.run();
                return;
            case 3:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f42506c;
                PasscodeActivity passcodeActivity = ((ll0) this.f42505b).f38286b;
                if (passcodeActivity.f33849y == 0) {
                    i10 = R.string.PasscodeSwitchToPassword;
                } else {
                    i10 = R.string.PasscodeSwitchToPIN;
                }
                f1Var.setText(LocaleController.getString(i10));
                if (passcodeActivity.f33849y == 0) {
                    i11 = R.drawable.msg_permissions;
                } else {
                    i11 = R.drawable.msg_pin_code;
                }
                f1Var.setIcon(i11);
                passcodeActivity.k0();
                if (passcodeActivity.e0()) {
                    passcodeActivity.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f33846s, true, 0.1f, false);
                    return;
                }
                return;
            case 4:
                ((PasskeysActivity) this.f42505b).X((TL_account.Passkey) this.f42506c);
                return;
            case 5:
                kn0 kn0Var = (kn0) this.f42505b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.f42506c;
                int[] iArr = kn0Var.f38056x;
                int i16 = result.type;
                if (i16 == 2) {
                    if (!(kn0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = kn0Var.G.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) kn0Var.G.get(i17);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    kn0Var.F = tL_secureRequiredType;
                                    kn0Var.P1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i16 == 1) {
                    if (!(kn0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = kn0Var.G.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) kn0Var.G.get(i18);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    kn0Var.F = tL_secureRequiredType2;
                                    kn0Var.P1();
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                } else if (i16 == 3) {
                    if (!(kn0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = kn0Var.G.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) kn0Var.G.get(i19);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    kn0Var.F = tL_secureRequiredType3;
                                    kn0Var.P1();
                                } else {
                                    i19++;
                                }
                            }
                        }
                    }
                } else if (i16 == 4 && !(kn0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = kn0Var.G.size();
                    int i20 = 0;
                    while (true) {
                        if (i20 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) kn0Var.G.get(i20);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                kn0Var.F = tL_secureRequiredType4;
                                kn0Var.P1();
                            } else {
                                i20++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    kn0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    kn0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    kn0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    kn0Var.Y[7].setText(result.number);
                }
                int i21 = result.gender;
                if (i21 != 0) {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            kn0Var.f38053w = "female";
                            kn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        }
                    } else {
                        kn0Var.f38053w = "male";
                        kn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str3 = result.nationality;
                    kn0Var.f38044s = str3;
                    String str4 = (String) kn0Var.Y0.get(str3);
                    if (str4 != null) {
                        kn0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str5 = result.issuingCountry;
                    kn0Var.v = str5;
                    String str6 = (String) kn0Var.Y0.get(str5);
                    if (str6 != null) {
                        kn0Var.Y[6].setText(str6);
                    }
                }
                int i22 = result.birthDay;
                if (i22 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    kn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i22), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i23 = result.expiryDay;
                if (i23 > 0 && (i12 = result.expiryMonth) > 0 && (i13 = result.expiryYear) > 0) {
                    iArr[0] = i13;
                    iArr[1] = i12;
                    iArr[2] = i23;
                    kn0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i23), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    return;
                }
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                kn0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 6:
                kn0 kn0Var2 = (kn0) this.f42505b;
                TLObject tLObject = (TLObject) this.f42506c;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    kn0Var2.J = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.e5.x0(kn0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TwoStepVerificationActivity.m0(kn0Var2.J);
                    kn0Var2.R1();
                    if (kn0Var2.Z[0].getVisibility() == 0) {
                        kn0Var2.Y[0].requestFocus();
                        AndroidUtilities.showKeyboard(kn0Var2.Y[0]);
                    }
                    if (kn0Var2.N0 == 1) {
                        kn0Var2.B1(true);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                kn0 kn0Var3 = (kn0) this.f42505b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f42506c;
                if (tL_error == null) {
                    kn0Var3.f38019f1 = true;
                    kn0Var3.W0(true);
                    kn0Var3.finishFragment();
                    return;
                }
                kn0Var3.N1(false, false);
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.e5.x0(kn0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    return;
                } else {
                    kn0Var3.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 8:
                ((fn0) this.f42505b).f36351a.K = ((TLRPC.TL_error) this.f42506c).text;
                return;
            case 9:
                ((so0) this.f42505b).D0(false);
                ((View) this.f42506c).callOnClick();
                return;
            case 10:
                so0 so0Var = (so0) this.f42505b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f42506c;
                so0Var.H0(true, false);
                if (tL_error2 == null) {
                    if (so0Var.getParentActivity() != null) {
                        pn0 pn0Var = so0Var.f40548d0;
                        if (pn0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(pn0Var);
                            so0Var.f40548d0 = null;
                        }
                        so0Var.t0();
                        return;
                    }
                    return;
                } else if (tL_error2.text.startsWith("CODE_INVALID")) {
                    org.telegram.ui.Cells.k3 k3Var = so0Var.S;
                    try {
                        k3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.shakeViewSpring(k3Var, 2.5f);
                    org.telegram.ui.Cells.k3 k3Var2 = so0Var.S;
                    k3Var2.f22376a.setText("");
                    k3Var2.f22377b = false;
                    k3Var2.setWillNotDraw(true);
                    return;
                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    so0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    so0Var.F0(LocaleController.getString(R.string.AppName), tL_error2.text);
                    return;
                }
            case 11:
                so0.U((so0) this.f42505b, (TLRPC.TL_payments_validatedRequestedInfo) this.f42506c);
                return;
            case 12:
                so0 so0Var2 = (so0) this.f42505b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.f42506c;
                Context parentActivity = so0Var2.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.G1;
                }
                if (parentActivity != null) {
                    so0Var2.f40541a1 = true;
                    so0Var2.f40555f1 = 1;
                    TLRPC.InputInvoice inputInvoice = so0Var2.f40544b1;
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
                    if (!z12 && (ro0Var2 = so0Var2.Z0) != null) {
                        ro0Var2.a(1);
                    }
                    so0Var2.t0();
                    if (z12 && (ro0Var = so0Var2.Z0) != null) {
                        ro0Var.a(so0Var2.f40555f1);
                    }
                    long r02 = so0Var2.r0();
                    int i24 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                    if (i24 > 0) {
                        str2 = UserObject.getForcedFirstName(so0Var2.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (i24 < 0 && (chat = so0Var2.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str2 = chat.title;
                    }
                    long q02 = so0Var2.q0();
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
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, so0Var2.R0[0], so0Var2.f40566q0);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(U);
                        if (i24 != 0 && string != null && !z11) {
                            Q = a02.K(i25, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new tn0(r02, 0));
                        } else {
                            String str7 = string;
                            if (str7 != null) {
                                Q = a02.M(str7, replaceTags, i25);
                            } else {
                                Q = a02.Q(i25, 36, replaceTags);
                            }
                        }
                        org.telegram.ui.Components.rc rcVar = Q;
                        rcVar.f30346r = false;
                        rcVar.f30338j = 5000;
                        if (messageArr[0] != null) {
                            ai.l5 l5Var = new ai.l5(so0Var2, rcVar, z10, messageArr, 3);
                            org.telegram.ui.Components.vb vbVar = rcVar.f30334e;
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
            case 13:
                PhotoViewer photoViewer = (PhotoViewer) this.f42505b;
                b41.R(photoViewer.E, photoViewer.f33965m4, false, (ai.d) this.f42506c, null);
                return;
            case 14:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f42505b;
                bt0 bt0Var = (bt0) this.f42506c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (bt0Var.getWindow() != null) {
                    bt0Var.setFocusable(true);
                    yn ynVar = photoViewer2.l4;
                    if (ynVar != null && (jkVar = ynVar.W) != null) {
                        jkVar.m0(false);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                ((ai.l) this.f42505b).run((Bitmap) this.f42506c);
                return;
            case 16:
                PhotoViewer photoViewer3 = (PhotoViewer) this.f42505b;
                qg.w0 w0Var = (qg.w0) this.f42506c;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                w0Var.f45378e.h();
                w0Var.f45377c.postRunnable(new n21(12));
                photoViewer3.f33894e0.removeView(photoViewer3.N1);
                return;
            case 17:
                org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) this.f42505b;
                Bitmap bitmap = (Bitmap) this.f42506c;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                if (d6Var != null) {
                    ArrayList arrayList = d6Var.h;
                    org.telegram.ui.Components.a6 a6Var = d6Var.f25583n;
                    if (a6Var != null) {
                        arrayList.add(a6Var);
                    }
                    org.telegram.ui.Components.a6 a6Var2 = d6Var.f25588r;
                    if (a6Var2 != null) {
                        arrayList.add(a6Var2);
                    }
                    org.telegram.ui.Components.a6 a6Var3 = d6Var.f25590s;
                    if (a6Var3 != null) {
                        arrayList.add(a6Var3);
                    }
                    d6Var.f25583n = new org.telegram.ui.Components.a6(bitmap);
                    d6Var.f25588r = null;
                    d6Var.f25590s = null;
                    d6Var.t();
                    return;
                }
                return;
            case 18:
                bs0 bs0Var = (bs0) this.f42505b;
                bs0Var.getClass();
                ((View) this.f42506c).setOutlineProvider(null);
                PhotoViewer photoViewer4 = bs0Var.f35190c;
                ImageView imageView = photoViewer4.f34066x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                pu0 pu0Var = photoViewer4.E2;
                if (pu0Var != null) {
                    pu0Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 19:
                mt0 mt0Var = (mt0) this.f42505b;
                org.telegram.ui.Components.d81 d81Var = (org.telegram.ui.Components.d81) this.f42506c;
                mt0Var.getClass();
                if (d81Var.p() > 0 && d81Var.n() >= d81Var.p() - 590) {
                    mt0Var.f38753a.f33894e0.invalidate();
                    return;
                }
                return;
            case 20:
                qt0 qt0Var = (qt0) this.f42505b;
                qg.w0 w0Var2 = (qg.w0) this.f42506c;
                w0Var2.f45378e.h();
                w0Var2.f45377c.postRunnable(new n21(12));
                try {
                    qt0Var.f39818b.f33894e0.removeView(w0Var2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 21:
                ci.m6 m6Var = (ci.m6) this.f42506c;
                PhotoViewer photoViewer5 = ((vs0) this.f42505b).f41811b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.f34066x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.f34066x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) m6Var.f5569b).setImageBitmap(photoViewer5.C3);
                    return;
                }
                return;
            case 22:
                ((au0) this.f42505b).f34918r.f33960l7.lock();
                ((AnimatorSet) this.f42506c).start();
                return;
            case 23:
                yu0 yu0Var = (yu0) this.f42506c;
                ((au0) this.f42505b).f34918r.f34020s4 = false;
                if (!yu0Var.f43635s) {
                    yu0Var.f43619a.setVisible(false, true);
                    return;
                }
                return;
            case 24:
                gw0 gw0Var = (gw0) this.f42505b;
                gw0Var.getClass();
                AndroidUtilities.addToClipboard((String) this.f42506c);
                gw0Var.c(true);
                return;
            case 25:
                gw0 gw0Var2 = (gw0) this.f42505b;
                gw0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) this.f42506c).text, false));
                gw0Var2.c(true);
                return;
            case 26:
                gw0 gw0Var3 = (gw0) this.f42505b;
                SendMessagesHelper.getInstance(gw0Var3.H.currentAccount).deletePollOption(gw0Var3.H, (byte[]) this.f42506c);
                gw0Var3.c(true);
                return;
            case 27:
                PrivacyControlActivity.U((PrivacyControlActivity) this.f42505b, (TLObject) this.f42506c);
                return;
            case 28:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f42505b;
                boolean[] zArr = (boolean[]) this.f42506c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    return;
                }
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f42505b;
                privacySettingsActivity.d = (TL_account.Password) this.f42506c;
                privacySettingsActivity.y0();
                return;
        }
    }
}
