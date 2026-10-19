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
public final class wg0 implements Runnable {
    public final int f42872a;
    public final Object f42873b;
    public final Object f42874c;

    public wg0(int i10, Object obj, Object obj2) {
        this.f42872a = i10;
        this.f42873b = obj;
        this.f42874c = obj2;
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
        do0 do0Var;
        do0 do0Var2;
        fk fkVar;
        String str2 = "";
        switch (this.f42872a) {
            case 0:
                hh0 hh0Var = ((xg0) this.f42873b).f43209a;
                yg0 f02 = hh0Var.f0();
                hh0Var.f37634i0.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.f42874c));
                TLRPC.ChatFull chatFull = hh0Var.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    hh0Var.getMessagesStorage().saveChatLinksCount(hh0Var.f37638n, hh0Var.d.invitesCount);
                }
                hh0Var.h0(f02);
                return;
            case 1:
                ti0 ti0Var = (ti0) this.f42873b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.f42874c;
                if (ti0Var.getParentActivity() != null) {
                    Toast.makeText(ti0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    return;
                }
                return;
            case 2:
                mj0 mj0Var = (mj0) this.f42873b;
                mj0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + ((String) this.f42874c)));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                mj0Var.getContext().startActivity(intent);
                return;
            case 3:
                TLRPC.User user = (TLRPC.User) this.f42874c;
                ((mj0) this.f42873b).dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(user.f20422id));
                    return;
                }
                return;
            case 4:
                ((org.telegram.ui.Components.qy) this.f42873b).run((TLRPC.User) this.f42874c);
                return;
            case 5:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.f42873b, (ArrayList) this.f42874c);
                return;
            case 6:
                ((org.telegram.ui.ActionBar.f3[]) this.f42873b)[0] = null;
                uk0.f42005a = null;
                ((boolean[]) this.f42874c)[0] = true;
                return;
            case 7:
                Runnable runnable = (Runnable) this.f42874c;
                for (tr trVar : ((PasscodeActivity) this.f42873b).f33223n.f40961f) {
                    trVar.l(0.0f);
                }
                runnable.run();
                return;
            case 8:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f42874c;
                PasscodeActivity passcodeActivity = ((zk0) this.f42873b).f43765b;
                if (passcodeActivity.f33228y == 0) {
                    i10 = R.string.PasscodeSwitchToPassword;
                } else {
                    i10 = R.string.PasscodeSwitchToPIN;
                }
                e1Var.setText(LocaleController.getString(i10));
                if (passcodeActivity.f33228y == 0) {
                    i11 = R.drawable.msg_permissions;
                } else {
                    i11 = R.drawable.msg_pin_code;
                }
                e1Var.setIcon(i11);
                passcodeActivity.n0();
                if (passcodeActivity.h0()) {
                    passcodeActivity.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f33225s, true, 0.1f, false);
                    return;
                }
                return;
            case 9:
                ((PasskeysActivity) this.f42873b).Y((TL_account.Passkey) this.f42874c);
                return;
            case 10:
                vm0 vm0Var = (vm0) this.f42873b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.f42874c;
                int[] iArr = vm0Var.f42326x;
                int i16 = result.type;
                if (i16 == 2) {
                    if (!(vm0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = vm0Var.G.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) vm0Var.G.get(i17);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    vm0Var.F = tL_secureRequiredType;
                                    vm0Var.O1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i16 == 1) {
                    if (!(vm0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = vm0Var.G.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) vm0Var.G.get(i18);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    vm0Var.F = tL_secureRequiredType2;
                                    vm0Var.O1();
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                } else if (i16 == 3) {
                    if (!(vm0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = vm0Var.G.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) vm0Var.G.get(i19);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    vm0Var.F = tL_secureRequiredType3;
                                    vm0Var.O1();
                                } else {
                                    i19++;
                                }
                            }
                        }
                    }
                } else if (i16 == 4 && !(vm0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = vm0Var.G.size();
                    int i20 = 0;
                    while (true) {
                        if (i20 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) vm0Var.G.get(i20);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                vm0Var.F = tL_secureRequiredType4;
                                vm0Var.O1();
                            } else {
                                i20++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    vm0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    vm0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    vm0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    vm0Var.Y[7].setText(result.number);
                }
                int i21 = result.gender;
                if (i21 != 0) {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            vm0Var.f42323w = "female";
                            vm0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        }
                    } else {
                        vm0Var.f42323w = "male";
                        vm0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str3 = result.nationality;
                    vm0Var.f42314s = str3;
                    String str4 = (String) vm0Var.Y0.get(str3);
                    if (str4 != null) {
                        vm0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str5 = result.issuingCountry;
                    vm0Var.v = str5;
                    String str6 = (String) vm0Var.Y0.get(str5);
                    if (str6 != null) {
                        vm0Var.Y[6].setText(str6);
                    }
                }
                int i22 = result.birthDay;
                if (i22 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    vm0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i22), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i23 = result.expiryDay;
                if (i23 > 0 && (i12 = result.expiryMonth) > 0 && (i13 = result.expiryYear) > 0) {
                    iArr[0] = i13;
                    iArr[1] = i12;
                    iArr[2] = i23;
                    vm0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i23), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    return;
                }
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                vm0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                return;
            case 11:
                vm0 vm0Var2 = (vm0) this.f42873b;
                TLObject tLObject = (TLObject) this.f42874c;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    vm0Var2.J = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.f5.w0(vm0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        return;
                    }
                    TwoStepVerificationActivity.m0(vm0Var2.J);
                    vm0Var2.Q1();
                    if (vm0Var2.Z[0].getVisibility() == 0) {
                        vm0Var2.Y[0].requestFocus();
                        AndroidUtilities.showKeyboard(vm0Var2.Y[0]);
                    }
                    if (vm0Var2.N0 == 1) {
                        vm0Var2.A1(true);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                vm0 vm0Var3 = (vm0) this.f42873b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f42874c;
                if (tL_error == null) {
                    vm0Var3.f42289f1 = true;
                    vm0Var3.V0(true);
                    vm0Var3.finishFragment();
                    return;
                }
                vm0Var3.M1(false, false);
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.f5.w0(vm0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    return;
                } else {
                    vm0Var3.L1(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 13:
                ((qm0) this.f42873b).f40612a.K = ((TLRPC.TL_error) this.f42874c).text;
                return;
            case 14:
                ((eo0) this.f42873b).D0(false);
                ((View) this.f42874c).callOnClick();
                return;
            case 15:
                eo0 eo0Var = (eo0) this.f42873b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f42874c;
                eo0Var.H0(true, false);
                if (tL_error2 == null) {
                    if (eo0Var.getParentActivity() != null) {
                        an0 an0Var = eo0Var.f36707d0;
                        if (an0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(an0Var);
                            eo0Var.f36707d0 = null;
                        }
                        eo0Var.t0();
                        return;
                    }
                    return;
                } else if (tL_error2.text.startsWith("CODE_INVALID")) {
                    org.telegram.ui.Cells.j3 j3Var = eo0Var.S;
                    try {
                        j3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.shakeViewSpring(j3Var, 2.5f);
                    org.telegram.ui.Cells.j3 j3Var2 = eo0Var.S;
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
                    eo0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    eo0Var.F0(LocaleController.getString(R.string.AppName), tL_error2.text);
                    return;
                }
            case 16:
                eo0.W((eo0) this.f42873b, (TLRPC.TL_payments_validatedRequestedInfo) this.f42874c);
                return;
            case 17:
                eo0 eo0Var2 = (eo0) this.f42873b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.f42874c;
                Context parentActivity = eo0Var2.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.H1;
                }
                if (parentActivity != null) {
                    eo0Var2.f36700a1 = true;
                    eo0Var2.f36713f1 = 1;
                    TLRPC.InputInvoice inputInvoice = eo0Var2.f36703b1;
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
                    if (!z12 && (do0Var2 = eo0Var2.Z0) != null) {
                        do0Var2.c(1);
                    }
                    eo0Var2.t0();
                    if (z12 && (do0Var = eo0Var2.Z0) != null) {
                        do0Var.c(eo0Var2.f36713f1);
                    }
                    long r02 = eo0Var2.r0();
                    int i24 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                    if (i24 > 0) {
                        str2 = UserObject.getForcedFirstName(eo0Var2.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (i24 < 0 && (chat = eo0Var2.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str2 = chat.title;
                    }
                    long q02 = eo0Var2.q0();
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
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, eo0Var2.R0[0], eo0Var2.f36724q0);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                    if (U2 != null) {
                        org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(U2);
                        if (i24 != 0 && string != null && !z11) {
                            Q = a02.K(i25, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new ai.m4(r02, 2));
                        } else {
                            String str7 = string;
                            if (str7 != null) {
                                Q = a02.M(str7, replaceTags, i25);
                            } else {
                                Q = a02.Q(i25, 36, replaceTags);
                            }
                        }
                        org.telegram.ui.Components.qc qcVar = Q;
                        qcVar.f29604r = false;
                        qcVar.f29596j = 5000;
                        if (messageArr[0] != null) {
                            ci.z3 z3Var = new ci.z3(eo0Var2, qcVar, z10, messageArr, 3);
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
                PhotoViewer photoViewer = (PhotoViewer) this.f42873b;
                t21.U(photoViewer.E, photoViewer.f33344m4, false, (ci.b) this.f42874c, null);
                return;
            case 19:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f42873b;
                ms0 ms0Var = (ms0) this.f42874c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (ms0Var.getWindow() != null) {
                    ms0Var.setFocusable(true);
                    qn qnVar = photoViewer2.l4;
                    if (qnVar != null && (fkVar = qnVar.Y) != null) {
                        fkVar.k0(false);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                ((ai.z2) this.f42873b).run((Bitmap) this.f42874c);
                return;
            case 21:
                PhotoViewer photoViewer3 = (PhotoViewer) this.f42873b;
                rg.w0 w0Var = (rg.w0) this.f42874c;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                w0Var.e.h();
                w0Var.f45671c.postRunnable(new kj0(18));
                photoViewer3.f33272e0.removeView(photoViewer3.N1);
                return;
            case 22:
                org.telegram.ui.Components.e6 e6Var = (org.telegram.ui.Components.e6) this.f42873b;
                Bitmap bitmap = (Bitmap) this.f42874c;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                if (e6Var != null) {
                    ArrayList arrayList = e6Var.h;
                    org.telegram.ui.Components.b6 b6Var = e6Var.f25806n;
                    if (b6Var != null) {
                        arrayList.add(b6Var);
                    }
                    org.telegram.ui.Components.b6 b6Var2 = e6Var.f25811r;
                    if (b6Var2 != null) {
                        arrayList.add(b6Var2);
                    }
                    org.telegram.ui.Components.b6 b6Var3 = e6Var.f25813s;
                    if (b6Var3 != null) {
                        arrayList.add(b6Var3);
                    }
                    e6Var.f25806n = new org.telegram.ui.Components.b6(bitmap);
                    e6Var.f25811r = null;
                    e6Var.f25813s = null;
                    e6Var.t();
                    return;
                }
                return;
            case 23:
                nr0 nr0Var = (nr0) this.f42873b;
                nr0Var.getClass();
                ((View) this.f42874c).setOutlineProvider(null);
                PhotoViewer photoViewer4 = nr0Var.f39676c;
                ImageView imageView = photoViewer4.f33445x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                au0 au0Var = photoViewer4.E2;
                if (au0Var != null) {
                    au0Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 24:
                xs0 xs0Var = (xs0) this.f42873b;
                org.telegram.ui.Components.b81 b81Var = (org.telegram.ui.Components.b81) this.f42874c;
                xs0Var.getClass();
                if (b81Var.p() > 0 && b81Var.n() >= b81Var.p() - 590) {
                    xs0Var.f43256a.f33272e0.invalidate();
                    return;
                }
                return;
            case 25:
                bt0 bt0Var = (bt0) this.f42873b;
                rg.w0 w0Var2 = (rg.w0) this.f42874c;
                w0Var2.e.h();
                w0Var2.f45671c.postRunnable(new kj0(18));
                try {
                    bt0Var.f35743b.f33272e0.removeView(w0Var2);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 26:
                ah.v vVar = (ah.v) this.f42874c;
                PhotoViewer photoViewer5 = ((gs0) this.f42873b).f37431b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.f33445x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.f33445x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) vVar.f894b).setImageBitmap(photoViewer5.C3);
                    return;
                }
                return;
            case 27:
                ((lt0) this.f42873b).f39047r.f33339l7.lock();
                ((AnimatorSet) this.f42874c).start();
                return;
            case 28:
                ju0 ju0Var = (ju0) this.f42874c;
                ((lt0) this.f42873b).f39047r.f33399s4 = false;
                if (!ju0Var.f38358s) {
                    ju0Var.f38343a.setVisible(false, true);
                    return;
                }
                return;
            default:
                qv0 qv0Var = (qv0) this.f42873b;
                qv0Var.getClass();
                AndroidUtilities.addToClipboard((String) this.f42874c);
                qv0Var.c(true);
                return;
        }
    }
}
