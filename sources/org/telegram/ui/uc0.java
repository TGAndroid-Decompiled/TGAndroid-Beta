package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class uc0 implements RequestDelegate {
    public final int f50370a;
    public final gd0 f50371b;
    public final TLRPC.TL_auth_signIn f50372c;

    public uc0(gd0 gd0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i7) {
        this.f50370a = i7;
        this.f50371b = gd0Var;
        this.f50372c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f50370a) {
            case 0:
                final gd0 gd0Var = this.f50371b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f50372c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        int i10;
                        int i11;
                        int i12;
                        int i13 = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final gd0 gd0Var2 = gd0Var;
                        switch (i13) {
                            case 0:
                                int i14 = gd0Var2.f45939h0;
                                ce0 ce0Var = gd0Var2.f45954u0;
                                gd0Var2.y(false);
                                if (tL_error2 == null) {
                                    gd0Var2.f45937f0 = false;
                                    ce0Var.N1(false, true);
                                    gd0Var2.u();
                                    gd0Var2.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ce0Var.f44757q0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", gd0Var2.d);
                                        bundle.putString("phoneHash", gd0Var2.f45931c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        gd0Var2.p(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        gd0Var2.f45954u0.M1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        gd0Var2.f45954u0.M1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        gd0Var2.p(new zc0(2, gd0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    gd0Var2.f45938g0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i12 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
                                        ConnectionsManager.getInstance(i12).sendRequest(getpassword, new uc0(gd0Var2, tL_auth_signIn2, 1), 10);
                                        gd0Var2.u();
                                        gd0Var2.t();
                                    } else {
                                        gd0Var2.f45937f0 = false;
                                        ce0Var.N1(false, true);
                                        if ((i14 == 3 && ((i11 = gd0Var2.f45940i0) == 4 || i11 == 2 || i11 == 17 || i11 == 16)) || ((i14 == 2 && ((i10 = gd0Var2.f45940i0) == 4 || i10 == 3)) || (i14 == 4 && ((i7 = gd0Var2.f45940i0) == 2 || i7 == 17 || i7 == 16)))) {
                                            gd0Var2.s();
                                        }
                                        if (i14 == 15) {
                                            org.telegram.messenger.qs.e().b(gd0Var2, 257);
                                        } else if (i14 == 2) {
                                            org.telegram.messenger.g0.E3(true);
                                            org.telegram.messenger.qs.e().b(gd0Var2, 257);
                                        } else if (i14 == 3) {
                                            org.telegram.messenger.g0.D3(true);
                                            org.telegram.messenger.qs.e().b(gd0Var2, 258);
                                            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.l10(21));
                                        }
                                        gd0Var2.f45935e0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131749178, "InvalidPhoneNumber"));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    gd0Var2.c(true);
                                                    ce0Var.M1(0, true, null, true);
                                                    ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131752021, "CodeExpired"));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131750688, "FloodWait"));
                                                } else {
                                                    String M0 = org.telegram.messenger.hd.M0(2131746072, null);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751106, sb2, "\n");
                                                    sb2.append(tL_error2.text);
                                                    ce0Var.D1(M0, sb2.toString());
                                                }
                                            } else {
                                                gd0Var2.w();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                yq yqVar = gd0Var2.f45936f;
                                                br[] brVarArr = yqVar.f52294f;
                                                if (i15 < brVarArr.length) {
                                                    brVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    yqVar.f52293e = false;
                                                    brVarArr[0].requestFocus();
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
                                gd0Var2.f45937f0 = false;
                                ce0 ce0Var2 = gd0Var2.f45954u0;
                                ce0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.v4.u0(ce0Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131743821, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", gd0Var2.d);
                                    bundle2.putString("phoneHash", gd0Var2.f45931c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    gd0Var2.p(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    gd0Var2.f45954u0.M1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    gd0Var2.f45954u0.M1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final gd0 gd0Var2 = this.f50371b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f50372c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        int i10;
                        int i11;
                        int i12;
                        int i13 = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final gd0 gd0Var22 = gd0Var2;
                        switch (i13) {
                            case 0:
                                int i14 = gd0Var22.f45939h0;
                                ce0 ce0Var = gd0Var22.f45954u0;
                                gd0Var22.y(false);
                                if (tL_error2 == null) {
                                    gd0Var22.f45937f0 = false;
                                    ce0Var.N1(false, true);
                                    gd0Var22.u();
                                    gd0Var22.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ce0Var.f44757q0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", gd0Var22.d);
                                        bundle.putString("phoneHash", gd0Var22.f45931c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        gd0Var22.p(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        gd0Var22.f45954u0.M1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        gd0Var22.f45954u0.M1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        gd0Var22.p(new zc0(2, gd0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    gd0Var22.f45938g0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i12 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
                                        ConnectionsManager.getInstance(i12).sendRequest(getpassword, new uc0(gd0Var22, tL_auth_signIn22, 1), 10);
                                        gd0Var22.u();
                                        gd0Var22.t();
                                    } else {
                                        gd0Var22.f45937f0 = false;
                                        ce0Var.N1(false, true);
                                        if ((i14 == 3 && ((i11 = gd0Var22.f45940i0) == 4 || i11 == 2 || i11 == 17 || i11 == 16)) || ((i14 == 2 && ((i10 = gd0Var22.f45940i0) == 4 || i10 == 3)) || (i14 == 4 && ((i7 = gd0Var22.f45940i0) == 2 || i7 == 17 || i7 == 16)))) {
                                            gd0Var22.s();
                                        }
                                        if (i14 == 15) {
                                            org.telegram.messenger.qs.e().b(gd0Var22, 257);
                                        } else if (i14 == 2) {
                                            org.telegram.messenger.g0.E3(true);
                                            org.telegram.messenger.qs.e().b(gd0Var22, 257);
                                        } else if (i14 == 3) {
                                            org.telegram.messenger.g0.D3(true);
                                            org.telegram.messenger.qs.e().b(gd0Var22, 258);
                                            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.l10(21));
                                        }
                                        gd0Var22.f45935e0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131749178, "InvalidPhoneNumber"));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    gd0Var22.c(true);
                                                    ce0Var.M1(0, true, null, true);
                                                    ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131752021, "CodeExpired"));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131750688, "FloodWait"));
                                                } else {
                                                    String M0 = org.telegram.messenger.hd.M0(2131746072, null);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751106, sb2, "\n");
                                                    sb2.append(tL_error2.text);
                                                    ce0Var.D1(M0, sb2.toString());
                                                }
                                            } else {
                                                gd0Var22.w();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                yq yqVar = gd0Var22.f45936f;
                                                br[] brVarArr = yqVar.f52294f;
                                                if (i15 < brVarArr.length) {
                                                    brVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    yqVar.f52293e = false;
                                                    brVarArr[0].requestFocus();
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
                                gd0Var22.f45937f0 = false;
                                ce0 ce0Var2 = gd0Var22.f45954u0;
                                ce0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.v4.u0(ce0Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131743821, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", gd0Var22.d);
                                    bundle2.putString("phoneHash", gd0Var22.f45931c);
                                    bundle2.putString("code", tL_auth_signIn22.phone_code);
                                    gd0Var22.p(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    gd0Var22.f45954u0.M1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    gd0Var22.f45954u0.M1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
