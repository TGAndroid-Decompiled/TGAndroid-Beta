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
    public final int f51548a;
    public final ed0 f51549b;
    public final TLRPC.TL_auth_signIn f51550c;

    public tc0(ed0 ed0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i7) {
        this.f51548a = i7;
        this.f51549b = ed0Var;
        this.f51550c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f51548a) {
            case 0:
                final ed0 ed0Var = this.f51549b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f51550c;
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
                        final ed0 ed0Var2 = ed0Var;
                        switch (i13) {
                            case 0:
                                int i14 = ed0Var2.f46744i0;
                                ce0 ce0Var = ed0Var2.f46759v0;
                                ed0Var2.y(false);
                                if (tL_error2 == null) {
                                    ed0Var2.f46742g0 = false;
                                    ce0Var.N1(false, true);
                                    ed0Var2.u();
                                    ed0Var2.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ce0Var.f46110s0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", ed0Var2.d);
                                        bundle.putString("phoneHash", ed0Var2.f46735c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        ed0Var2.p(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        ed0Var2.f46759v0.M1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        ed0Var2.f46759v0.M1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        ed0Var2.p(new g50(28, ed0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    ed0Var2.f46743h0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i12 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
                                        ConnectionsManager.getInstance(i12).sendRequest(getpassword, new tc0(ed0Var2, tL_auth_signIn2, 1), 10);
                                        ed0Var2.u();
                                        ed0Var2.t();
                                    } else {
                                        ed0Var2.f46742g0 = false;
                                        ce0Var.N1(false, true);
                                        if ((i14 == 3 && ((i11 = ed0Var2.f46745j0) == 4 || i11 == 2 || i11 == 17 || i11 == 16)) || ((i14 == 2 && ((i10 = ed0Var2.f46745j0) == 4 || i10 == 3)) || (i14 == 4 && ((i7 = ed0Var2.f46745j0) == 2 || i7 == 17 || i7 == 16)))) {
                                            ed0Var2.s();
                                        }
                                        if (i14 == 15) {
                                            org.telegram.messenger.ns.e().b(ed0Var2, 257);
                                        } else if (i14 == 2) {
                                            org.telegram.messenger.g0.D3(true);
                                            org.telegram.messenger.ns.e().b(ed0Var2, 257);
                                        } else if (i14 == 3) {
                                            org.telegram.messenger.g0.C3(true);
                                            org.telegram.messenger.ns.e().b(ed0Var2, 258);
                                            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ih(27));
                                        }
                                        ed0Var2.f46741f0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749179, "InvalidPhoneNumber"));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    ed0Var2.c(true);
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
                                                ed0Var2.w();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                ar arVar = ed0Var2.f46740f;
                                                dr[] drVarArr = arVar.f45491f;
                                                if (i15 < drVarArr.length) {
                                                    drVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    arVar.f45490e = false;
                                                    drVarArr[0].requestFocus();
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
                                    org.telegram.messenger.g0.C3(false);
                                    return;
                                }
                                return;
                            default:
                                ed0Var2.f46742g0 = false;
                                ce0 ce0Var2 = ed0Var2.f46759v0;
                                ce0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.t4.u0(ce0Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131743820, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", ed0Var2.d);
                                    bundle2.putString("phoneHash", ed0Var2.f46735c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    ed0Var2.p(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    ed0Var2.f46759v0.M1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    ed0Var2.f46759v0.M1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final ed0 ed0Var2 = this.f51549b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f51550c;
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
                        final ed0 ed0Var22 = ed0Var2;
                        switch (i13) {
                            case 0:
                                int i14 = ed0Var22.f46744i0;
                                ce0 ce0Var = ed0Var22.f46759v0;
                                ed0Var22.y(false);
                                if (tL_error2 == null) {
                                    ed0Var22.f46742g0 = false;
                                    ce0Var.N1(false, true);
                                    ed0Var22.u();
                                    ed0Var22.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ce0Var.f46110s0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", ed0Var22.d);
                                        bundle.putString("phoneHash", ed0Var22.f46735c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        ed0Var22.p(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        ed0Var22.f46759v0.M1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        ed0Var22.f46759v0.M1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        ed0Var22.p(new g50(28, ed0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    ed0Var22.f46743h0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i12 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
                                        ConnectionsManager.getInstance(i12).sendRequest(getpassword, new tc0(ed0Var22, tL_auth_signIn22, 1), 10);
                                        ed0Var22.u();
                                        ed0Var22.t();
                                    } else {
                                        ed0Var22.f46742g0 = false;
                                        ce0Var.N1(false, true);
                                        if ((i14 == 3 && ((i11 = ed0Var22.f46745j0) == 4 || i11 == 2 || i11 == 17 || i11 == 16)) || ((i14 == 2 && ((i10 = ed0Var22.f46745j0) == 4 || i10 == 3)) || (i14 == 4 && ((i7 = ed0Var22.f46745j0) == 2 || i7 == 17 || i7 == 16)))) {
                                            ed0Var22.s();
                                        }
                                        if (i14 == 15) {
                                            org.telegram.messenger.ns.e().b(ed0Var22, 257);
                                        } else if (i14 == 2) {
                                            org.telegram.messenger.g0.D3(true);
                                            org.telegram.messenger.ns.e().b(ed0Var22, 257);
                                        } else if (i14 == 3) {
                                            org.telegram.messenger.g0.C3(true);
                                            org.telegram.messenger.ns.e().b(ed0Var22, 258);
                                            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ih(27));
                                        }
                                        ed0Var22.f46741f0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749179, "InvalidPhoneNumber"));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    ed0Var22.c(true);
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
                                                ed0Var22.w();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                ar arVar = ed0Var22.f46740f;
                                                dr[] drVarArr = arVar.f45491f;
                                                if (i15 < drVarArr.length) {
                                                    drVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    arVar.f45490e = false;
                                                    drVarArr[0].requestFocus();
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
                                    org.telegram.messenger.g0.C3(false);
                                    return;
                                }
                                return;
                            default:
                                ed0Var22.f46742g0 = false;
                                ce0 ce0Var2 = ed0Var22.f46759v0;
                                ce0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.t4.u0(ce0Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131743820, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", ed0Var22.d);
                                    bundle2.putString("phoneHash", ed0Var22.f46735c);
                                    bundle2.putString("code", tL_auth_signIn22.phone_code);
                                    ed0Var22.p(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    ed0Var22.f46759v0.M1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    ed0Var22.f46759v0.M1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
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
