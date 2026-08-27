package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class ze0 implements RequestDelegate {

    public final int f45152a;

    public final mf0 f45153b;

    public final TLRPC.TL_auth_signIn f45154c;

    public ze0(mf0 mf0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f45152a = i10;
        this.f45153b = mf0Var;
        this.f45154c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f45152a) {
            case 0:
                final int i10 = 0;
                final mf0 mf0Var = this.f45153b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f45154c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i11;
                        int i12;
                        int i13;
                        switch (i10) {
                            case 0:
                                final mf0 mf0Var2 = mf0Var;
                                int i14 = mf0Var2.f40481b0;
                                ig0 ig0Var = mf0Var2.f40497o0;
                                mf0Var2.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    mf0Var2.f40479a0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        mf0Var2.W = false;
                                        ig0Var.v1(false, true);
                                        if ((i14 == 3 && ((i13 = mf0Var2.f40483c0) == 4 || i13 == 2 || i13 == 17 || i13 == 16)) || ((i14 == 2 && ((i12 = mf0Var2.f40483c0) == 4 || i12 == 3)) || (i14 == 4 && ((i11 = mf0Var2.f40483c0) == 2 || i11 == 17 || i11 == 16)))) {
                                            mf0Var2.t();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(mf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(mf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(mf0Var2, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gc(26));
                                        }
                                        mf0Var2.V = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                mf0Var2.y();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                mf0Var2.c(true);
                                                ig0Var.u1(0, true, null, true);
                                                ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                ur urVar = mf0Var2.f40487f;
                                                wr[] wrVarArr = urVar.f43279f;
                                                if (i15 >= wrVarArr.length) {
                                                    urVar.f43278e = false;
                                                    wrVarArr[0].requestFocus();
                                                } else {
                                                    wrVarArr[i15].setText("");
                                                    i15++;
                                                }
                                            }
                                        }
                                    } else {
                                        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).sendRequest(new TL_account.getPassword(), new ze0(mf0Var2, tL_auth_signIn2, 1), 10);
                                        mf0Var2.w();
                                        mf0Var2.u();
                                    }
                                    break;
                                } else {
                                    mf0Var2.W = false;
                                    ig0Var.v1(false, true);
                                    mf0Var2.w();
                                    mf0Var2.u();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ig0Var.f39095l0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", mf0Var2.d);
                                        bundle.putString("phoneHash", mf0Var2.f40482c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        final int i16 = 0;
                                        mf0Var2.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i16) {
                                                    case 0:
                                                        mf0Var2.f40497o0.u1(5, true, bundle, false);
                                                        break;
                                                    default:
                                                        mf0Var2.f40497o0.u1(6, true, bundle, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        mf0Var2.q(new ff0(1, mf0Var2, tLObject2));
                                    }
                                }
                                if (i14 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                }
                                break;
                            default:
                                final mf0 mf0Var3 = mf0Var;
                                mf0Var3.W = false;
                                ig0 ig0Var2 = mf0Var3.f40497o0;
                                ig0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.y4.x0(ig0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                    } else {
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", mf0Var3.d);
                                        bundle2.putString("phoneHash", mf0Var3.f40482c);
                                        bundle2.putString("code", tL_auth_signIn.phone_code);
                                        final int i17 = 1;
                                        mf0Var3.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i17) {
                                                    case 0:
                                                        mf0Var3.f40497o0.u1(5, true, bundle2, false);
                                                        break;
                                                    default:
                                                        mf0Var3.f40497o0.u1(6, true, bundle2, false);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final mf0 mf0Var2 = this.f45153b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f45154c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i12;
                        int i13;
                        int i14;
                        switch (i11) {
                            case 0:
                                final mf0 mf0Var3 = mf0Var2;
                                int i15 = mf0Var3.f40481b0;
                                ig0 ig0Var = mf0Var3.f40497o0;
                                mf0Var3.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn3 = tL_auth_signIn2;
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    mf0Var3.f40479a0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        mf0Var3.W = false;
                                        ig0Var.v1(false, true);
                                        if ((i15 == 3 && ((i14 = mf0Var3.f40483c0) == 4 || i14 == 2 || i14 == 17 || i14 == 16)) || ((i15 == 2 && ((i13 = mf0Var3.f40483c0) == 4 || i13 == 3)) || (i15 == 4 && ((i12 = mf0Var3.f40483c0) == 2 || i12 == 17 || i12 == 16)))) {
                                            mf0Var3.t();
                                        }
                                        if (i15 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(mf0Var3, NotificationCenter.didReceiveSmsCode);
                                        } else if (i15 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(mf0Var3, NotificationCenter.didReceiveSmsCode);
                                        } else if (i15 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(mf0Var3, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gc(26));
                                        }
                                        mf0Var3.V = true;
                                        if (i15 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                mf0Var3.y();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                mf0Var3.c(true);
                                                ig0Var.u1(0, true, null, true);
                                                ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                            int i16 = 0;
                                            while (true) {
                                                ur urVar = mf0Var3.f40487f;
                                                wr[] wrVarArr = urVar.f43279f;
                                                if (i16 >= wrVarArr.length) {
                                                    urVar.f43278e = false;
                                                    wrVarArr[0].requestFocus();
                                                } else {
                                                    wrVarArr[i16].setText("");
                                                    i16++;
                                                }
                                            }
                                        }
                                    } else {
                                        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).sendRequest(new TL_account.getPassword(), new ze0(mf0Var3, tL_auth_signIn3, 1), 10);
                                        mf0Var3.w();
                                        mf0Var3.u();
                                    }
                                    break;
                                } else {
                                    mf0Var3.W = false;
                                    ig0Var.v1(false, true);
                                    mf0Var3.w();
                                    mf0Var3.u();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ig0Var.f39095l0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", mf0Var3.d);
                                        bundle.putString("phoneHash", mf0Var3.f40482c);
                                        bundle.putString("code", tL_auth_signIn3.phone_code);
                                        final int i17 = 0;
                                        mf0Var3.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i17) {
                                                    case 0:
                                                        mf0Var3.f40497o0.u1(5, true, bundle, false);
                                                        break;
                                                    default:
                                                        mf0Var3.f40497o0.u1(6, true, bundle, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        mf0Var3.q(new ff0(1, mf0Var3, tLObject2));
                                    }
                                }
                                if (i15 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                }
                                break;
                            default:
                                final mf0 mf0Var4 = mf0Var2;
                                mf0Var4.W = false;
                                ig0 ig0Var2 = mf0Var4.f40497o0;
                                ig0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.y4.x0(ig0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                    } else {
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", mf0Var4.d);
                                        bundle2.putString("phoneHash", mf0Var4.f40482c);
                                        bundle2.putString("code", tL_auth_signIn2.phone_code);
                                        final int i18 = 1;
                                        mf0Var4.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i18) {
                                                    case 0:
                                                        mf0Var4.f40497o0.u1(5, true, bundle2, false);
                                                        break;
                                                    default:
                                                        mf0Var4.f40497o0.u1(6, true, bundle2, false);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
