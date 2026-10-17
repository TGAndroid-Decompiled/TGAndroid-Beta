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
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
public final class zg0 implements Runnable {
    public final int f43744a;
    public final Object f43745b;
    public final Object f43746c;

    public zg0(int i10, Object obj, Object obj2) {
        this.f43744a = i10;
        this.f43745b = obj;
        this.f43746c = obj2;
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
        org.telegram.ui.Components.qc Q;
        String str;
        eo0 eo0Var;
        eo0 eo0Var2;
        hk hkVar;
        String str2 = "";
        switch (this.f43744a) {
            case 0:
                kh0 kh0Var = ((ah0) this.f43745b).f35436a;
                bh0 f02 = kh0Var.f0();
                kh0Var.f38538i0.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.f43746c));
                TLRPC.ChatFull chatFull = kh0Var.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    kh0Var.getMessagesStorage().saveChatLinksCount(kh0Var.f38542n, kh0Var.d.invitesCount);
                }
                kh0Var.h0(f02);
                return;
            case 1:
                wi0 wi0Var = (wi0) this.f43745b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.f43746c;
                if (wi0Var.getParentActivity() != null) {
                    Toast.makeText(wi0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    return;
                }
                return;
            case 2:
                oj0 oj0Var = (oj0) this.f43745b;
                oj0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + ((String) this.f43746c)));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                oj0Var.getContext().startActivity(intent);
                return;
            case 3:
                TLRPC.User user = (TLRPC.User) this.f43746c;
                ((oj0) this.f43745b).dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(user.f20419id));
                    return;
                }
                return;
            case 4:
                ((org.telegram.ui.Components.qy) this.f43745b).run((TLRPC.User) this.f43746c);
                return;
            case 5:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.f43745b, (ArrayList) this.f43746c);
                return;
            case 6:
                ((org.telegram.ui.ActionBar.f3[]) this.f43745b)[0] = null;
                wk0.f42888a = null;
                ((boolean[]) this.f43746c)[0] = true;
                return;
            case 7:
                Runnable runnable = (Runnable) this.f43746c;
                for (vr vrVar : ((PasscodeActivity) this.f43745b).f33217n.f41486f) {
                    vrVar.l(0.0f);
                }
                runnable.run();
                return;
            case 8:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f43746c;
                PasscodeActivity passcodeActivity = ((bl0) this.f43745b).f35707b;
                if (passcodeActivity.f33222y == 0) {
                    i10 = R.string.PasscodeSwitchToPassword;
                } else {
                    i10 = R.string.PasscodeSwitchToPIN;
                }
                e1Var.setText(LocaleController.getString(i10));
                if (passcodeActivity.f33222y == 0) {
                    i11 = R.drawable.msg_permissions;
                } else {
                    i11 = R.drawable.msg_pin_code;
                }
                e1Var.setIcon(i11);
                passcodeActivity.n0();
                if (passcodeActivity.h0()) {
                    passcodeActivity.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f33219s, true, 0.1f, false);
                    return;
                }
                return;
            case 9:
                ((PasskeysActivity) this.f43745b).Y((TL_account.Passkey) this.f43746c);
                return;
            case 10:
                xm0 xm0Var = (xm0) this.f43745b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.f43746c;
                int[] iArr = xm0Var.f43215x;
                int i16 = result.type;
                if (i16 == 2) {
                    if (!(xm0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = xm0Var.G.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) xm0Var.G.get(i17);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    xm0Var.F = tL_secureRequiredType;
                                    xm0Var.O1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i16 == 1) {
                    if (!(xm0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = xm0Var.G.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) xm0Var.G.get(i18);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    xm0Var.F = tL_secureRequiredType2;
                                    xm0Var.O1();
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                } else if (i16 == 3) {
                    if (!(xm0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = xm0Var.G.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) xm0Var.G.get(i19);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    xm0Var.F = tL_secureRequiredType3;
                                    xm0Var.O1();
                                } else {
                                    i19++;
                                }
                            }
                        }
                    }
                } else if (i16 == 4 && !(xm0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = xm0Var.G.size();
                    int i20 = 0;
                    while (true) {
                        if (i20 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) xm0Var.G.get(i20);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                xm0Var.F = tL_secureRequiredType4;
                                xm0Var.O1();
                            } else {
                                i20++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    xm0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    xm0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    xm0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    xm0Var.Y[7].setText(result.number);
                }
                int i21 = result.gender;
                if (i21 != 0) {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            xm0Var.f43212w = "female";
                            xm0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        }
                    } else {
                        xm0Var.f43212w = "male";
                        xm0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str3 = result.nationality;
                    xm0Var.f43203s = str3;
                    String str4 = (String) xm0Var.Y0.get(str3);
                    if (str4 != null) {
                        xm0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str5 = result.issuingCountry;
                    xm0Var.v = str5;
                    String str6 = (String) xm0Var.Y0.get(str5);
                    if (str6 != null) {
                        xm0Var.Y[6].setText(str6);
                    }
                }
                int i22 = result.birthDay;
                if (i22 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    xm0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i22), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i23 = result.expiryDay;
                if (i23 > 0 && (i12 = result.expiryMonth) > 0 && (i13 = result.expiryYear) > 0) {
                    iArr[0] = i13;
                    iArr[1] = i12;
                    iArr[2] = i23;
                    xm0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i23), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    return;
                }
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                xm0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 11:
                xm0 xm0Var2 = (xm0) this.f43745b;
                TLObject tLObject = (TLObject) this.f43746c;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    xm0Var2.J = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.f5.w0(xm0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TwoStepVerificationActivity.m0(xm0Var2.J);
                    xm0Var2.Q1();
                    if (xm0Var2.Z[0].getVisibility() == 0) {
                        xm0Var2.Y[0].requestFocus();
                        AndroidUtilities.showKeyboard(xm0Var2.Y[0]);
                    }
                    if (xm0Var2.N0 == 1) {
                        xm0Var2.A1(true);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                xm0 xm0Var3 = (xm0) this.f43745b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f43746c;
                if (tL_error == null) {
                    xm0Var3.f43178f1 = true;
                    xm0Var3.V0(true);
                    xm0Var3.finishFragment();
                    return;
                }
                xm0Var3.M1(false, false);
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.f5.w0(xm0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    return;
                } else {
                    xm0Var3.L1(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 13:
                ((sm0) this.f43745b).f41142a.K = ((TLRPC.TL_error) this.f43746c).text;
                return;
            case 14:
                ((fo0) this.f43745b).D0(false);
                ((View) this.f43746c).callOnClick();
                return;
            case 15:
                fo0 fo0Var = (fo0) this.f43745b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f43746c;
                fo0Var.H0(true, false);
                if (tL_error2 == null) {
                    if (fo0Var.getParentActivity() != null) {
                        cn0 cn0Var = fo0Var.f36979d0;
                        if (cn0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(cn0Var);
                            fo0Var.f36979d0 = null;
                        }
                        fo0Var.t0();
                        return;
                    }
                    return;
                } else if (tL_error2.text.startsWith("CODE_INVALID")) {
                    org.telegram.ui.Cells.j3 j3Var = fo0Var.S;
                    try {
                        j3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.shakeViewSpring(j3Var, 2.5f);
                    org.telegram.ui.Cells.j3 j3Var2 = fo0Var.S;
                    j3Var2.f22459a.setText("");
                    j3Var2.f22460b = false;
                    j3Var2.setWillNotDraw(true);
                    return;
                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    fo0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    fo0Var.F0(LocaleController.getString(R.string.AppName), tL_error2.text);
                    return;
                }
            case 16:
                fo0.W((fo0) this.f43745b, (TLRPC.TL_payments_validatedRequestedInfo) this.f43746c);
                return;
            case 17:
                fo0 fo0Var2 = (fo0) this.f43745b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.f43746c;
                Context parentActivity = fo0Var2.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.H1;
                }
                if (parentActivity != null) {
                    fo0Var2.f36972a1 = true;
                    fo0Var2.f36985f1 = 1;
                    TLRPC.InputInvoice inputInvoice = fo0Var2.f36975b1;
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
                    if (!z12 && (eo0Var2 = fo0Var2.Z0) != null) {
                        eo0Var2.c(1);
                    }
                    fo0Var2.t0();
                    if (z12 && (eo0Var = fo0Var2.Z0) != null) {
                        eo0Var.c(fo0Var2.f36985f1);
                    }
                    long r02 = fo0Var2.r0();
                    int i24 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                    if (i24 > 0) {
                        str2 = UserObject.getForcedFirstName(fo0Var2.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (i24 < 0 && (chat = fo0Var2.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str2 = chat.title;
                    }
                    long q02 = fo0Var2.q0();
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
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, fo0Var2.R0[0], fo0Var2.f36996q0);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                    if (U2 != null) {
                        org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(U2);
                        if (i24 != 0 && string != null && !z11) {
                            Q = a02.K(i25, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new ai.o4(r02, 2));
                        } else {
                            String str7 = string;
                            if (str7 != null) {
                                Q = a02.M(str7, replaceTags, i25);
                            } else {
                                Q = a02.Q(i25, 36, replaceTags);
                            }
                        }
                        org.telegram.ui.Components.qc qcVar = Q;
                        qcVar.f29647r = false;
                        qcVar.f29639j = 5000;
                        if (messageArr[0] != null) {
                            ci.z3 z3Var = new ci.z3(fo0Var2, qcVar, z10, messageArr, 3);
                            org.telegram.ui.Components.ub ubVar = qcVar.e;
                            if (ubVar != null) {
                                ubVar.setOnClickListener(z3Var);
                            }
                        }
                        qcVar.k(z11);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                PhotoViewer photoViewer = (PhotoViewer) this.f43745b;
                v21.U(photoViewer.E, photoViewer.f33338m4, false, (ci.b) this.f43746c, null);
                return;
            case 19:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f43745b;
                os0 os0Var = (os0) this.f43746c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (os0Var.getWindow() != null) {
                    os0Var.setFocusable(true);
                    sn snVar = photoViewer2.l4;
                    if (snVar != null && (hkVar = snVar.Y) != null) {
                        hkVar.k0(false);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                ((ai.v2) this.f43745b).run((Bitmap) this.f43746c);
                return;
            case 21:
                PhotoViewer photoViewer3 = (PhotoViewer) this.f43745b;
                rg.w0 w0Var = (rg.w0) this.f43746c;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                w0Var.e.h();
                w0Var.f45699c.postRunnable(new ff0(18));
                photoViewer3.f33266e0.removeView(photoViewer3.N1);
                return;
            case 22:
                org.telegram.ui.Components.e6 e6Var = (org.telegram.ui.Components.e6) this.f43745b;
                Bitmap bitmap = (Bitmap) this.f43746c;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                if (e6Var != null) {
                    ArrayList arrayList = e6Var.h;
                    org.telegram.ui.Components.b6 b6Var = e6Var.f25834n;
                    if (b6Var != null) {
                        arrayList.add(b6Var);
                    }
                    org.telegram.ui.Components.b6 b6Var2 = e6Var.f25839r;
                    if (b6Var2 != null) {
                        arrayList.add(b6Var2);
                    }
                    org.telegram.ui.Components.b6 b6Var3 = e6Var.f25841s;
                    if (b6Var3 != null) {
                        arrayList.add(b6Var3);
                    }
                    e6Var.f25834n = new org.telegram.ui.Components.b6(bitmap);
                    e6Var.f25839r = null;
                    e6Var.f25841s = null;
                    e6Var.t();
                    return;
                }
                return;
            case 23:
                pr0 pr0Var = (pr0) this.f43745b;
                pr0Var.getClass();
                ((View) this.f43746c).setOutlineProvider(null);
                PhotoViewer photoViewer4 = pr0Var.f40233c;
                ImageView imageView = photoViewer4.f33439x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                cu0 cu0Var = photoViewer4.E2;
                if (cu0Var != null) {
                    cu0Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 24:
                zs0 zs0Var = (zs0) this.f43745b;
                org.telegram.ui.Components.a81 a81Var = (org.telegram.ui.Components.a81) this.f43746c;
                zs0Var.getClass();
                if (a81Var.p() > 0 && a81Var.n() >= a81Var.p() - 590) {
                    zs0Var.f43799a.f33266e0.invalidate();
                    return;
                }
                return;
            case 25:
                dt0 dt0Var = (dt0) this.f43745b;
                rg.w0 w0Var2 = (rg.w0) this.f43746c;
                w0Var2.e.h();
                w0Var2.f45699c.postRunnable(new ff0(18));
                try {
                    dt0Var.f36321b.f33266e0.removeView(w0Var2);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 26:
                ah.v vVar = (ah.v) this.f43746c;
                PhotoViewer photoViewer5 = ((is0) this.f43745b).f37975b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.f33439x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.f33439x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) vVar.f896b).setImageBitmap(photoViewer5.C3);
                    return;
                }
                return;
            case 27:
                ((nt0) this.f43745b).f39551r.f33333l7.lock();
                ((AnimatorSet) this.f43746c).start();
                return;
            case 28:
                lu0 lu0Var = (lu0) this.f43746c;
                ((nt0) this.f43745b).f39551r.f33393s4 = false;
                if (!lu0Var.f38952s) {
                    lu0Var.f38937a.setVisible(false, true);
                    return;
                }
                return;
            default:
                sv0 sv0Var = (sv0) this.f43745b;
                sv0Var.getClass();
                AndroidUtilities.addToClipboard((String) this.f43746c);
                sv0Var.c(true);
                return;
        }
    }
}
