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
    public final int f52517a;
    public final hd0 f52518b;
    public final TLRPC.TL_auth_signIn f52519c;

    public uc0(hd0 hd0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i7) {
        this.f52517a = i7;
        this.f52518b = hd0Var;
        this.f52519c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f52517a) {
            case 0:
                final hd0 hd0Var = this.f52518b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f52519c;
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
                        final hd0 hd0Var2 = hd0Var;
                        switch (i13) {
                            case 0:
                                int i14 = hd0Var2.f48316i0;
                                ee0 ee0Var = hd0Var2.f48331v0;
                                hd0Var2.y(false);
                                if (tL_error2 == null) {
                                    hd0Var2.f48314g0 = false;
                                    ee0Var.N1(false, true);
                                    hd0Var2.u();
                                    hd0Var2.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ee0Var.f47202s0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", hd0Var2.d);
                                        bundle.putString("phoneHash", hd0Var2.f48307c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        hd0Var2.p(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        hd0Var2.f48331v0.M1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        hd0Var2.f48331v0.M1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        hd0Var2.p(new o60(23, hd0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    hd0Var2.f48315h0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i12 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
                                        ConnectionsManager.getInstance(i12).sendRequest(getpassword, new uc0(hd0Var2, tL_auth_signIn2, 1), 10);
                                        hd0Var2.u();
                                        hd0Var2.t();
                                    } else {
                                        hd0Var2.f48314g0 = false;
                                        ee0Var.N1(false, true);
                                        if ((i14 == 3 && ((i11 = hd0Var2.f48317j0) == 4 || i11 == 2 || i11 == 17 || i11 == 16)) || ((i14 == 2 && ((i10 = hd0Var2.f48317j0) == 4 || i10 == 3)) || (i14 == 4 && ((i7 = hd0Var2.f48317j0) == 2 || i7 == 17 || i7 == 16)))) {
                                            hd0Var2.s();
                                        }
                                        if (i14 == 15) {
                                            org.telegram.messenger.ks.e().b(hd0Var2, 260);
                                        } else if (i14 == 2) {
                                            org.telegram.messenger.g0.C3(true);
                                            org.telegram.messenger.ks.e().b(hd0Var2, 260);
                                        } else if (i14 == 3) {
                                            org.telegram.messenger.g0.B3(true);
                                            org.telegram.messenger.ks.e().b(hd0Var2, 261);
                                            org.telegram.messenger.g0.g3(new org.telegram.ui.Components.me(29));
                                        }
                                        hd0Var2.f48313f0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748987, "InvalidPhoneNumber"));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    hd0Var2.c(true);
                                                    ee0Var.M1(0, true, null, true);
                                                    ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, "CodeExpired"));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131750671, "FloodWait"));
                                                } else {
                                                    String M0 = org.telegram.messenger.gd.M0(2131745876, null);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    org.telegram.ui.Cells.c0.u("ErrorOccurred", 2131751094, sb2, "\n");
                                                    sb2.append(tL_error2.text);
                                                    ee0Var.D1(M0, sb2.toString());
                                                }
                                            } else {
                                                hd0Var2.w();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                br brVar = hd0Var2.f48312f;
                                                er[] erVarArr = brVar.f46274f;
                                                if (i15 < erVarArr.length) {
                                                    erVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    brVar.f46273e = false;
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
                                hd0Var2.f48314g0 = false;
                                ee0 ee0Var2 = hd0Var2.f48331v0;
                                ee0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.b5.u0(ee0Var2.getParentActivity(), org.telegram.messenger.gd.M0(2131743583, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", hd0Var2.d);
                                    bundle2.putString("phoneHash", hd0Var2.f48307c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    hd0Var2.p(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    hd0Var2.f48331v0.M1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    hd0Var2.f48331v0.M1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                ee0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final hd0 hd0Var2 = this.f52518b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f52519c;
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
                        final hd0 hd0Var22 = hd0Var2;
                        switch (i13) {
                            case 0:
                                int i14 = hd0Var22.f48316i0;
                                ee0 ee0Var = hd0Var22.f48331v0;
                                hd0Var22.y(false);
                                if (tL_error2 == null) {
                                    hd0Var22.f48314g0 = false;
                                    ee0Var.N1(false, true);
                                    hd0Var22.u();
                                    hd0Var22.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ee0Var.f47202s0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", hd0Var22.d);
                                        bundle.putString("phoneHash", hd0Var22.f48307c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        hd0Var22.p(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        hd0Var22.f48331v0.M1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        hd0Var22.f48331v0.M1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        hd0Var22.p(new o60(23, hd0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    hd0Var22.f48315h0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i12 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
                                        ConnectionsManager.getInstance(i12).sendRequest(getpassword, new uc0(hd0Var22, tL_auth_signIn22, 1), 10);
                                        hd0Var22.u();
                                        hd0Var22.t();
                                    } else {
                                        hd0Var22.f48314g0 = false;
                                        ee0Var.N1(false, true);
                                        if ((i14 == 3 && ((i11 = hd0Var22.f48317j0) == 4 || i11 == 2 || i11 == 17 || i11 == 16)) || ((i14 == 2 && ((i10 = hd0Var22.f48317j0) == 4 || i10 == 3)) || (i14 == 4 && ((i7 = hd0Var22.f48317j0) == 2 || i7 == 17 || i7 == 16)))) {
                                            hd0Var22.s();
                                        }
                                        if (i14 == 15) {
                                            org.telegram.messenger.ks.e().b(hd0Var22, 260);
                                        } else if (i14 == 2) {
                                            org.telegram.messenger.g0.C3(true);
                                            org.telegram.messenger.ks.e().b(hd0Var22, 260);
                                        } else if (i14 == 3) {
                                            org.telegram.messenger.g0.B3(true);
                                            org.telegram.messenger.ks.e().b(hd0Var22, 261);
                                            org.telegram.messenger.g0.g3(new org.telegram.ui.Components.me(29));
                                        }
                                        hd0Var22.f48313f0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748987, "InvalidPhoneNumber"));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    hd0Var22.c(true);
                                                    ee0Var.M1(0, true, null, true);
                                                    ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, "CodeExpired"));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131750671, "FloodWait"));
                                                } else {
                                                    String M0 = org.telegram.messenger.gd.M0(2131745876, null);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    org.telegram.ui.Cells.c0.u("ErrorOccurred", 2131751094, sb2, "\n");
                                                    sb2.append(tL_error2.text);
                                                    ee0Var.D1(M0, sb2.toString());
                                                }
                                            } else {
                                                hd0Var22.w();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                br brVar = hd0Var22.f48312f;
                                                er[] erVarArr = brVar.f46274f;
                                                if (i15 < erVarArr.length) {
                                                    erVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    brVar.f46273e = false;
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
                                hd0Var22.f48314g0 = false;
                                ee0 ee0Var2 = hd0Var22.f48331v0;
                                ee0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.b5.u0(ee0Var2.getParentActivity(), org.telegram.messenger.gd.M0(2131743583, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", hd0Var22.d);
                                    bundle2.putString("phoneHash", hd0Var22.f48307c);
                                    bundle2.putString("code", tL_auth_signIn22.phone_code);
                                    hd0Var22.p(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    hd0Var22.f48331v0.M1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    hd0Var22.f48331v0.M1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                ee0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
