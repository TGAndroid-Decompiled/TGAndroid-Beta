package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class wc0 implements RequestDelegate {
    public final int f51030a;
    public final id0 f51031b;
    public final TLRPC.TL_auth_signIn f51032c;

    public wc0(id0 id0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i7) {
        this.f51030a = i7;
        this.f51031b = id0Var;
        this.f51032c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f51030a) {
            case 0:
                final id0 id0Var = this.f51031b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f51032c;
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
                        final id0 id0Var2 = id0Var;
                        switch (i13) {
                            case 0:
                                int i14 = id0Var2.f46634h0;
                                ee0 ee0Var = id0Var2.f46649u0;
                                id0Var2.y(false);
                                if (tL_error2 == null) {
                                    id0Var2.f46632f0 = false;
                                    ee0Var.N1(false, true);
                                    id0Var2.u();
                                    id0Var2.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ee0Var.f45389q0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", id0Var2.d);
                                        bundle.putString("phoneHash", id0Var2.f46626c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        id0Var2.p(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        id0Var2.f46649u0.M1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        id0Var2.f46649u0.M1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        id0Var2.p(new bd0(2, id0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    id0Var2.f46633g0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i12 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
                                        ConnectionsManager.getInstance(i12).sendRequest(getpassword, new wc0(id0Var2, tL_auth_signIn2, 1), 10);
                                        id0Var2.u();
                                        id0Var2.t();
                                    } else {
                                        id0Var2.f46632f0 = false;
                                        ee0Var.N1(false, true);
                                        if ((i14 == 3 && ((i11 = id0Var2.f46635i0) == 4 || i11 == 2 || i11 == 17 || i11 == 16)) || ((i14 == 2 && ((i10 = id0Var2.f46635i0) == 4 || i10 == 3)) || (i14 == 4 && ((i7 = id0Var2.f46635i0) == 2 || i7 == 17 || i7 == 16)))) {
                                            id0Var2.s();
                                        }
                                        if (i14 == 15) {
                                            org.telegram.messenger.qs.e().b(id0Var2, 257);
                                        } else if (i14 == 2) {
                                            org.telegram.messenger.g0.E3(true);
                                            org.telegram.messenger.qs.e().b(id0Var2, 257);
                                        } else if (i14 == 3) {
                                            org.telegram.messenger.g0.D3(true);
                                            org.telegram.messenger.qs.e().b(id0Var2, 258);
                                            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.vs(23));
                                        }
                                        id0Var2.f46630e0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749179, "InvalidPhoneNumber"));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    id0Var2.c(true);
                                                    ee0Var.M1(0, true, null, true);
                                                    ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, "FloodWait"));
                                                } else {
                                                    String M0 = org.telegram.messenger.id.M0(2131746071, null);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751105, sb2, "\n");
                                                    sb2.append(tL_error2.text);
                                                    ee0Var.D1(M0, sb2.toString());
                                                }
                                            } else {
                                                id0Var2.w();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                ar arVar = id0Var2.f46631f;
                                                dr[] drVarArr = arVar.f43768f;
                                                if (i15 < drVarArr.length) {
                                                    drVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    arVar.f43767e = false;
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
                                    org.telegram.messenger.g0.D3(false);
                                    return;
                                }
                                return;
                            default:
                                id0Var2.f46632f0 = false;
                                ee0 ee0Var2 = id0Var2.f46649u0;
                                ee0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.v4.u0(ee0Var2.getParentActivity(), org.telegram.messenger.id.M0(2131743820, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", id0Var2.d);
                                    bundle2.putString("phoneHash", id0Var2.f46626c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    id0Var2.p(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    id0Var2.f46649u0.M1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    id0Var2.f46649u0.M1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final id0 id0Var2 = this.f51031b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f51032c;
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
                        final id0 id0Var22 = id0Var2;
                        switch (i13) {
                            case 0:
                                int i14 = id0Var22.f46634h0;
                                ee0 ee0Var = id0Var22.f46649u0;
                                id0Var22.y(false);
                                if (tL_error2 == null) {
                                    id0Var22.f46632f0 = false;
                                    ee0Var.N1(false, true);
                                    id0Var22.u();
                                    id0Var22.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ee0Var.f45389q0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", id0Var22.d);
                                        bundle.putString("phoneHash", id0Var22.f46626c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        id0Var22.p(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        id0Var22.f46649u0.M1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        id0Var22.f46649u0.M1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        id0Var22.p(new bd0(2, id0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    id0Var22.f46633g0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i12 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
                                        ConnectionsManager.getInstance(i12).sendRequest(getpassword, new wc0(id0Var22, tL_auth_signIn22, 1), 10);
                                        id0Var22.u();
                                        id0Var22.t();
                                    } else {
                                        id0Var22.f46632f0 = false;
                                        ee0Var.N1(false, true);
                                        if ((i14 == 3 && ((i11 = id0Var22.f46635i0) == 4 || i11 == 2 || i11 == 17 || i11 == 16)) || ((i14 == 2 && ((i10 = id0Var22.f46635i0) == 4 || i10 == 3)) || (i14 == 4 && ((i7 = id0Var22.f46635i0) == 2 || i7 == 17 || i7 == 16)))) {
                                            id0Var22.s();
                                        }
                                        if (i14 == 15) {
                                            org.telegram.messenger.qs.e().b(id0Var22, 257);
                                        } else if (i14 == 2) {
                                            org.telegram.messenger.g0.E3(true);
                                            org.telegram.messenger.qs.e().b(id0Var22, 257);
                                        } else if (i14 == 3) {
                                            org.telegram.messenger.g0.D3(true);
                                            org.telegram.messenger.qs.e().b(id0Var22, 258);
                                            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.vs(23));
                                        }
                                        id0Var22.f46630e0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749179, "InvalidPhoneNumber"));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    id0Var22.c(true);
                                                    ee0Var.M1(0, true, null, true);
                                                    ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, "FloodWait"));
                                                } else {
                                                    String M0 = org.telegram.messenger.id.M0(2131746071, null);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751105, sb2, "\n");
                                                    sb2.append(tL_error2.text);
                                                    ee0Var.D1(M0, sb2.toString());
                                                }
                                            } else {
                                                id0Var22.w();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                ar arVar = id0Var22.f46631f;
                                                dr[] drVarArr = arVar.f43768f;
                                                if (i15 < drVarArr.length) {
                                                    drVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    arVar.f43767e = false;
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
                                    org.telegram.messenger.g0.D3(false);
                                    return;
                                }
                                return;
                            default:
                                id0Var22.f46632f0 = false;
                                ee0 ee0Var2 = id0Var22.f46649u0;
                                ee0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.v4.u0(ee0Var2.getParentActivity(), org.telegram.messenger.id.M0(2131743820, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", id0Var22.d);
                                    bundle2.putString("phoneHash", id0Var22.f46626c);
                                    bundle2.putString("code", tL_auth_signIn22.phone_code);
                                    id0Var22.p(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    id0Var22.f46649u0.M1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    id0Var22.f46649u0.M1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
