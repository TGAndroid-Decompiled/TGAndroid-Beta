package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class xb0 implements RequestDelegate {
    public final int f53163a;
    public final dc0 f53164b;
    public final TLRPC.TL_auth_signIn f53165c;

    public xb0(dc0 dc0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i7) {
        this.f53163a = i7;
        this.f53164b = dc0Var;
        this.f53165c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f53163a) {
            case 0:
                final dc0 dc0Var = this.f53164b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f53165c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        int i10 = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        dc0 dc0Var2 = dc0Var;
                        switch (i10) {
                            case 0:
                                int i11 = dc0Var2.f46354a;
                                ah.i iVar = dc0Var2.f46358c;
                                ce0 ce0Var = dc0Var2.f46357b0;
                                ce0Var.C1(false, true);
                                if (tL_error2 == null) {
                                    dc0Var2.S = false;
                                    ce0Var.N1(false, true);
                                    dc0Var2.q();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ce0Var.f46110s0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", dc0Var2.H);
                                        bundle.putString("phoneHash", dc0Var2.I);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        ce0Var.M1(5, true, bundle, false);
                                    } else {
                                        ce0Var.G1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new xb0(dc0Var2, tL_auth_signIn2, 1), 10);
                                    dc0Var2.q();
                                } else {
                                    dc0Var2.S = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749179, "InvalidPhoneNumber"));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                dc0Var2.c(true);
                                                ce0Var.M1(0, true, null, true);
                                                ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131752021, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131750687, "FloodWait"));
                                            } else {
                                                String M0 = org.telegram.messenger.hd.M0(2131746071, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.ui.Cells.y0.r("ErrorOccurred", 2131751105, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                ce0Var.D1(M0, sb2.toString());
                                            }
                                        } else {
                                            dc0Var2.r(false);
                                            iVar.post(new bc0(dc0Var2, 0));
                                            return;
                                        }
                                        iVar.setText("");
                                        iVar.requestFocus();
                                        return;
                                    }
                                    return;
                                }
                                if (i11 == 3) {
                                    org.telegram.messenger.g0.T();
                                    org.telegram.messenger.g0.C3(false);
                                    return;
                                }
                                return;
                            default:
                                dc0Var2.S = false;
                                ce0 ce0Var2 = dc0Var2.f46357b0;
                                ce0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.t4.u0(ce0Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131743820, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", dc0Var2.H);
                                    bundle2.putString("phoneHash", dc0Var2.I);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    ce0Var2.M1(6, true, bundle2, false);
                                    return;
                                }
                                ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final dc0 dc0Var2 = this.f53164b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f53165c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        int i10 = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        dc0 dc0Var22 = dc0Var2;
                        switch (i10) {
                            case 0:
                                int i11 = dc0Var22.f46354a;
                                ah.i iVar = dc0Var22.f46358c;
                                ce0 ce0Var = dc0Var22.f46357b0;
                                ce0Var.C1(false, true);
                                if (tL_error2 == null) {
                                    dc0Var22.S = false;
                                    ce0Var.N1(false, true);
                                    dc0Var22.q();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ce0Var.f46110s0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", dc0Var22.H);
                                        bundle.putString("phoneHash", dc0Var22.I);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        ce0Var.M1(5, true, bundle, false);
                                    } else {
                                        ce0Var.G1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new xb0(dc0Var22, tL_auth_signIn22, 1), 10);
                                    dc0Var22.q();
                                } else {
                                    dc0Var22.S = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749179, "InvalidPhoneNumber"));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                dc0Var22.c(true);
                                                ce0Var.M1(0, true, null, true);
                                                ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131752021, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131750687, "FloodWait"));
                                            } else {
                                                String M0 = org.telegram.messenger.hd.M0(2131746071, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.ui.Cells.y0.r("ErrorOccurred", 2131751105, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                ce0Var.D1(M0, sb2.toString());
                                            }
                                        } else {
                                            dc0Var22.r(false);
                                            iVar.post(new bc0(dc0Var22, 0));
                                            return;
                                        }
                                        iVar.setText("");
                                        iVar.requestFocus();
                                        return;
                                    }
                                    return;
                                }
                                if (i11 == 3) {
                                    org.telegram.messenger.g0.T();
                                    org.telegram.messenger.g0.C3(false);
                                    return;
                                }
                                return;
                            default:
                                dc0Var22.S = false;
                                ce0 ce0Var2 = dc0Var22.f46357b0;
                                ce0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.t4.u0(ce0Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131743820, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", dc0Var22.H);
                                    bundle2.putString("phoneHash", dc0Var22.I);
                                    bundle2.putString("code", tL_auth_signIn22.phone_code);
                                    ce0Var2.M1(6, true, bundle2, false);
                                    return;
                                }
                                ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
