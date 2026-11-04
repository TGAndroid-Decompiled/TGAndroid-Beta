package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class wb0 implements RequestDelegate {
    public final int f50768a;
    public final cc0 f50769b;
    public final TLRPC.TL_auth_signIn f50770c;

    public wb0(cc0 cc0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i3) {
        this.f50768a = i3;
        this.f50769b = cc0Var;
        this.f50770c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f50768a) {
            case 0:
                final cc0 cc0Var = this.f50769b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f50770c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3;
                        int i10 = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        cc0 cc0Var2 = cc0Var;
                        switch (i10) {
                            case 0:
                                int i11 = cc0Var2.f44295a;
                                bh.g gVar = cc0Var2.f44299c;
                                xd0 xd0Var = cc0Var2.f44298b0;
                                xd0Var.t1(false, true);
                                if (tL_error2 == null) {
                                    cc0Var2.S = false;
                                    xd0Var.E1(false, true);
                                    cc0Var2.q();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            xd0Var.f51969r0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", cc0Var2.H);
                                        bundle.putString("phoneHash", cc0Var2.I);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        xd0Var.D1(5, true, bundle, false);
                                    } else {
                                        xd0Var.x1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                                    ConnectionsManager.getInstance(i3).sendRequest(getpassword, new wb0(cc0Var2, tL_auth_signIn2, 1), 10);
                                    cc0Var2.q();
                                } else {
                                    cc0Var2.S = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749187, "InvalidPhoneNumber"));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                cc0Var2.c(true);
                                                xd0Var.D1(0, true, null, true);
                                                xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131750688, "FloodWait"));
                                            } else {
                                                String M0 = org.telegram.messenger.bd.M0(2131746081, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751106, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                xd0Var.u1(M0, sb2.toString());
                                            }
                                        } else {
                                            cc0Var2.r(false);
                                            gVar.post(new ac0(cc0Var2, 0));
                                            return;
                                        }
                                        gVar.setText("");
                                        gVar.requestFocus();
                                        return;
                                    }
                                    return;
                                }
                                if (i11 == 3) {
                                    org.telegram.messenger.g0.T();
                                    org.telegram.messenger.g0.D3(false);
                                    return;
                                }
                                return;
                            default:
                                cc0Var2.S = false;
                                xd0 xd0Var2 = cc0Var2.f44298b0;
                                xd0Var2.E1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.t4.w0(xd0Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", cc0Var2.H);
                                    bundle2.putString("phoneHash", cc0Var2.I);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    xd0Var2.D1(6, true, bundle2, false);
                                    return;
                                }
                                xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final cc0 cc0Var2 = this.f50769b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f50770c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3;
                        int i10 = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        cc0 cc0Var22 = cc0Var2;
                        switch (i10) {
                            case 0:
                                int i11 = cc0Var22.f44295a;
                                bh.g gVar = cc0Var22.f44299c;
                                xd0 xd0Var = cc0Var22.f44298b0;
                                xd0Var.t1(false, true);
                                if (tL_error2 == null) {
                                    cc0Var22.S = false;
                                    xd0Var.E1(false, true);
                                    cc0Var22.q();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            xd0Var.f51969r0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", cc0Var22.H);
                                        bundle.putString("phoneHash", cc0Var22.I);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        xd0Var.D1(5, true, bundle, false);
                                    } else {
                                        xd0Var.x1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                                    ConnectionsManager.getInstance(i3).sendRequest(getpassword, new wb0(cc0Var22, tL_auth_signIn22, 1), 10);
                                    cc0Var22.q();
                                } else {
                                    cc0Var22.S = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749187, "InvalidPhoneNumber"));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                cc0Var22.c(true);
                                                xd0Var.D1(0, true, null, true);
                                                xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131750688, "FloodWait"));
                                            } else {
                                                String M0 = org.telegram.messenger.bd.M0(2131746081, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751106, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                xd0Var.u1(M0, sb2.toString());
                                            }
                                        } else {
                                            cc0Var22.r(false);
                                            gVar.post(new ac0(cc0Var22, 0));
                                            return;
                                        }
                                        gVar.setText("");
                                        gVar.requestFocus();
                                        return;
                                    }
                                    return;
                                }
                                if (i11 == 3) {
                                    org.telegram.messenger.g0.T();
                                    org.telegram.messenger.g0.D3(false);
                                    return;
                                }
                                return;
                            default:
                                cc0Var22.S = false;
                                xd0 xd0Var2 = cc0Var22.f44298b0;
                                xd0Var2.E1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.t4.w0(xd0Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", cc0Var22.H);
                                    bundle2.putString("phoneHash", cc0Var22.I);
                                    bundle2.putString("code", tL_auth_signIn22.phone_code);
                                    xd0Var2.D1(6, true, bundle2, false);
                                    return;
                                }
                                xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
