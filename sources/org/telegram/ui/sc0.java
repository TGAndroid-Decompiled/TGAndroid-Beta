package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class sc0 implements RequestDelegate {
    public final int f49472a;
    public final dd0 f49473b;
    public final TLRPC.TL_auth_signIn f49474c;

    public sc0(dd0 dd0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i3) {
        this.f49472a = i3;
        this.f49473b = dd0Var;
        this.f49474c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f49472a) {
            case 0:
                final dd0 dd0Var = this.f49473b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f49474c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3;
                        int i10;
                        int i11;
                        int i12;
                        int i13 = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final dd0 dd0Var2 = dd0Var;
                        switch (i13) {
                            case 0:
                                int i14 = dd0Var2.f44648i0;
                                xd0 xd0Var = dd0Var2.f44663v0;
                                dd0Var2.y(false);
                                if (tL_error2 == null) {
                                    dd0Var2.f44646g0 = false;
                                    xd0Var.E1(false, true);
                                    dd0Var2.u();
                                    dd0Var2.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            xd0Var.f51969r0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", dd0Var2.d);
                                        bundle.putString("phoneHash", dd0Var2.f44639c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        dd0Var2.p(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        dd0Var2.f44663v0.D1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        dd0Var2.f44663v0.D1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        dd0Var2.p(new tb0(7, dd0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    dd0Var2.f44647h0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i12 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                                        ConnectionsManager.getInstance(i12).sendRequest(getpassword, new sc0(dd0Var2, tL_auth_signIn2, 1), 10);
                                        dd0Var2.u();
                                        dd0Var2.t();
                                    } else {
                                        dd0Var2.f44646g0 = false;
                                        xd0Var.E1(false, true);
                                        if ((i14 == 3 && ((i11 = dd0Var2.f44649j0) == 4 || i11 == 2 || i11 == 17 || i11 == 16)) || ((i14 == 2 && ((i10 = dd0Var2.f44649j0) == 4 || i10 == 3)) || (i14 == 4 && ((i3 = dd0Var2.f44649j0) == 2 || i3 == 17 || i3 == 16)))) {
                                            dd0Var2.s();
                                        }
                                        if (i14 == 15) {
                                            org.telegram.messenger.hs.e().b(dd0Var2, 257);
                                        } else if (i14 == 2) {
                                            org.telegram.messenger.g0.E3(true);
                                            org.telegram.messenger.hs.e().b(dd0Var2, 257);
                                        } else if (i14 == 3) {
                                            org.telegram.messenger.g0.D3(true);
                                            org.telegram.messenger.hs.e().b(dd0Var2, 258);
                                            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.go(22));
                                        }
                                        dd0Var2.f44645f0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749187, "InvalidPhoneNumber"));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    dd0Var2.c(true);
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
                                                dd0Var2.w();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                xq xqVar = dd0Var2.f44644f;
                                                zq[] zqVarArr = xqVar.f52078f;
                                                if (i15 < zqVarArr.length) {
                                                    zqVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    xqVar.f52077e = false;
                                                    zqVarArr[0].requestFocus();
                                                    return;
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                if (i14 == 3) {
                                    org.telegram.messenger.g0.T();
                                    org.telegram.messenger.g0.D3(false);
                                    return;
                                }
                                return;
                            default:
                                dd0Var2.f44646g0 = false;
                                xd0 xd0Var2 = dd0Var2.f44663v0;
                                xd0Var2.E1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.t4.w0(xd0Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", dd0Var2.d);
                                    bundle2.putString("phoneHash", dd0Var2.f44639c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    dd0Var2.p(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    dd0Var2.f44663v0.D1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    dd0Var2.f44663v0.D1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final dd0 dd0Var2 = this.f49473b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f49474c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3;
                        int i10;
                        int i11;
                        int i12;
                        int i13 = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final dd0 dd0Var22 = dd0Var2;
                        switch (i13) {
                            case 0:
                                int i14 = dd0Var22.f44648i0;
                                xd0 xd0Var = dd0Var22.f44663v0;
                                dd0Var22.y(false);
                                if (tL_error2 == null) {
                                    dd0Var22.f44646g0 = false;
                                    xd0Var.E1(false, true);
                                    dd0Var22.u();
                                    dd0Var22.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            xd0Var.f51969r0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", dd0Var22.d);
                                        bundle.putString("phoneHash", dd0Var22.f44639c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        dd0Var22.p(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        dd0Var22.f44663v0.D1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        dd0Var22.f44663v0.D1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        dd0Var22.p(new tb0(7, dd0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    dd0Var22.f44647h0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i12 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                                        ConnectionsManager.getInstance(i12).sendRequest(getpassword, new sc0(dd0Var22, tL_auth_signIn22, 1), 10);
                                        dd0Var22.u();
                                        dd0Var22.t();
                                    } else {
                                        dd0Var22.f44646g0 = false;
                                        xd0Var.E1(false, true);
                                        if ((i14 == 3 && ((i11 = dd0Var22.f44649j0) == 4 || i11 == 2 || i11 == 17 || i11 == 16)) || ((i14 == 2 && ((i10 = dd0Var22.f44649j0) == 4 || i10 == 3)) || (i14 == 4 && ((i3 = dd0Var22.f44649j0) == 2 || i3 == 17 || i3 == 16)))) {
                                            dd0Var22.s();
                                        }
                                        if (i14 == 15) {
                                            org.telegram.messenger.hs.e().b(dd0Var22, 257);
                                        } else if (i14 == 2) {
                                            org.telegram.messenger.g0.E3(true);
                                            org.telegram.messenger.hs.e().b(dd0Var22, 257);
                                        } else if (i14 == 3) {
                                            org.telegram.messenger.g0.D3(true);
                                            org.telegram.messenger.hs.e().b(dd0Var22, 258);
                                            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.go(22));
                                        }
                                        dd0Var22.f44645f0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749187, "InvalidPhoneNumber"));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    dd0Var22.c(true);
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
                                                dd0Var22.w();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                xq xqVar = dd0Var22.f44644f;
                                                zq[] zqVarArr = xqVar.f52078f;
                                                if (i15 < zqVarArr.length) {
                                                    zqVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    xqVar.f52077e = false;
                                                    zqVarArr[0].requestFocus();
                                                    return;
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                if (i14 == 3) {
                                    org.telegram.messenger.g0.T();
                                    org.telegram.messenger.g0.D3(false);
                                    return;
                                }
                                return;
                            default:
                                dd0Var22.f44646g0 = false;
                                xd0 xd0Var2 = dd0Var22.f44663v0;
                                xd0Var2.E1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.t4.w0(xd0Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", dd0Var22.d);
                                    bundle2.putString("phoneHash", dd0Var22.f44639c);
                                    bundle2.putString("code", tL_auth_signIn22.phone_code);
                                    dd0Var22.p(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    dd0Var22.f44663v0.D1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    dd0Var22.f44663v0.D1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
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
