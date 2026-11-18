package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class tc0 implements RequestDelegate {
    public final int f52253a;
    public final gd0 f52254b;
    public final TLRPC.TL_auth_signIn f52255c;

    public tc0(gd0 gd0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i7) {
        this.f52253a = i7;
        this.f52254b = gd0Var;
        this.f52255c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f52253a) {
            case 0:
                final gd0 gd0Var = this.f52254b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f52255c;
                org.telegram.messenger.g0.g3(new Runnable() {
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
                                int i14 = gd0Var2.f48065i0;
                                de0 de0Var = gd0Var2.f48080v0;
                                gd0Var2.y(false);
                                if (tL_error2 == null) {
                                    gd0Var2.f48063g0 = false;
                                    de0Var.N1(false, true);
                                    gd0Var2.u();
                                    gd0Var2.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            de0Var.f46958s0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", gd0Var2.d);
                                        bundle.putString("phoneHash", gd0Var2.f48056c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        gd0Var2.p(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        gd0Var2.f48080v0.M1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        gd0Var2.f48080v0.M1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        gd0Var2.p(new n60(23, gd0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    gd0Var2.f48064h0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i12 = ((org.telegram.ui.ActionBar.h2) de0Var).currentAccount;
                                        ConnectionsManager.getInstance(i12).sendRequest(getpassword, new tc0(gd0Var2, tL_auth_signIn2, 1), 10);
                                        gd0Var2.u();
                                        gd0Var2.t();
                                    } else {
                                        gd0Var2.f48063g0 = false;
                                        de0Var.N1(false, true);
                                        if ((i14 == 3 && ((i11 = gd0Var2.f48066j0) == 4 || i11 == 2 || i11 == 17 || i11 == 16)) || ((i14 == 2 && ((i10 = gd0Var2.f48066j0) == 4 || i10 == 3)) || (i14 == 4 && ((i7 = gd0Var2.f48066j0) == 2 || i7 == 17 || i7 == 16)))) {
                                            gd0Var2.s();
                                        }
                                        if (i14 == 15) {
                                            org.telegram.messenger.ks.e().b(gd0Var2, 259);
                                        } else if (i14 == 2) {
                                            org.telegram.messenger.g0.C3(true);
                                            org.telegram.messenger.ks.e().b(gd0Var2, 259);
                                        } else if (i14 == 3) {
                                            org.telegram.messenger.g0.B3(true);
                                            org.telegram.messenger.ks.e().b(gd0Var2, 260);
                                            org.telegram.messenger.g0.g3(new org.telegram.ui.Components.me(29));
                                        }
                                        gd0Var2.f48062f0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748987, "InvalidPhoneNumber"));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    gd0Var2.c(true);
                                                    de0Var.M1(0, true, null, true);
                                                    de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, "CodeExpired"));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131750671, "FloodWait"));
                                                } else {
                                                    String M0 = org.telegram.messenger.gd.M0(2131745876, null);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    org.telegram.ui.Cells.c0.u("ErrorOccurred", 2131751094, sb2, "\n");
                                                    sb2.append(tL_error2.text);
                                                    de0Var.D1(M0, sb2.toString());
                                                }
                                            } else {
                                                gd0Var2.w();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                br brVar = gd0Var2.f48061f;
                                                er[] erVarArr = brVar.f46283f;
                                                if (i15 < erVarArr.length) {
                                                    erVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    brVar.f46282e = false;
                                                    erVarArr[0].requestFocus();
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
                                    org.telegram.messenger.g0.B3(false);
                                    return;
                                }
                                return;
                            default:
                                gd0Var2.f48063g0 = false;
                                de0 de0Var2 = gd0Var2.f48080v0;
                                de0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.b5.u0(de0Var2.getParentActivity(), org.telegram.messenger.gd.M0(2131743583, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", gd0Var2.d);
                                    bundle2.putString("phoneHash", gd0Var2.f48056c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    gd0Var2.p(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    gd0Var2.f48080v0.M1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    gd0Var2.f48080v0.M1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                de0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final gd0 gd0Var2 = this.f52254b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f52255c;
                org.telegram.messenger.g0.g3(new Runnable() {
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
                                int i14 = gd0Var22.f48065i0;
                                de0 de0Var = gd0Var22.f48080v0;
                                gd0Var22.y(false);
                                if (tL_error2 == null) {
                                    gd0Var22.f48063g0 = false;
                                    de0Var.N1(false, true);
                                    gd0Var22.u();
                                    gd0Var22.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            de0Var.f46958s0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", gd0Var22.d);
                                        bundle.putString("phoneHash", gd0Var22.f48056c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        gd0Var22.p(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        gd0Var22.f48080v0.M1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        gd0Var22.f48080v0.M1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        gd0Var22.p(new n60(23, gd0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    gd0Var22.f48064h0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i12 = ((org.telegram.ui.ActionBar.h2) de0Var).currentAccount;
                                        ConnectionsManager.getInstance(i12).sendRequest(getpassword, new tc0(gd0Var22, tL_auth_signIn22, 1), 10);
                                        gd0Var22.u();
                                        gd0Var22.t();
                                    } else {
                                        gd0Var22.f48063g0 = false;
                                        de0Var.N1(false, true);
                                        if ((i14 == 3 && ((i11 = gd0Var22.f48066j0) == 4 || i11 == 2 || i11 == 17 || i11 == 16)) || ((i14 == 2 && ((i10 = gd0Var22.f48066j0) == 4 || i10 == 3)) || (i14 == 4 && ((i7 = gd0Var22.f48066j0) == 2 || i7 == 17 || i7 == 16)))) {
                                            gd0Var22.s();
                                        }
                                        if (i14 == 15) {
                                            org.telegram.messenger.ks.e().b(gd0Var22, 259);
                                        } else if (i14 == 2) {
                                            org.telegram.messenger.g0.C3(true);
                                            org.telegram.messenger.ks.e().b(gd0Var22, 259);
                                        } else if (i14 == 3) {
                                            org.telegram.messenger.g0.B3(true);
                                            org.telegram.messenger.ks.e().b(gd0Var22, 260);
                                            org.telegram.messenger.g0.g3(new org.telegram.ui.Components.me(29));
                                        }
                                        gd0Var22.f48062f0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748987, "InvalidPhoneNumber"));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    gd0Var22.c(true);
                                                    de0Var.M1(0, true, null, true);
                                                    de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, "CodeExpired"));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131750671, "FloodWait"));
                                                } else {
                                                    String M0 = org.telegram.messenger.gd.M0(2131745876, null);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    org.telegram.ui.Cells.c0.u("ErrorOccurred", 2131751094, sb2, "\n");
                                                    sb2.append(tL_error2.text);
                                                    de0Var.D1(M0, sb2.toString());
                                                }
                                            } else {
                                                gd0Var22.w();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                br brVar = gd0Var22.f48061f;
                                                er[] erVarArr = brVar.f46283f;
                                                if (i15 < erVarArr.length) {
                                                    erVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    brVar.f46282e = false;
                                                    erVarArr[0].requestFocus();
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
                                    org.telegram.messenger.g0.B3(false);
                                    return;
                                }
                                return;
                            default:
                                gd0Var22.f48063g0 = false;
                                de0 de0Var2 = gd0Var22.f48080v0;
                                de0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.b5.u0(de0Var2.getParentActivity(), org.telegram.messenger.gd.M0(2131743583, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", gd0Var22.d);
                                    bundle2.putString("phoneHash", gd0Var22.f48056c);
                                    bundle2.putString("code", tL_auth_signIn22.phone_code);
                                    gd0Var22.p(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    gd0Var22.f48080v0.M1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    gd0Var22.f48080v0.M1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                de0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
