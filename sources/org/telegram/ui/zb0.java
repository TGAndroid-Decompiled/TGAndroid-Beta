package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zb0 implements Runnable {
    public final int f52599a = 0;
    public final cc0 f52600b;
    public final TLRPC.TL_error f52601c;
    public final Bundle d;
    public final TLObject f52602e;

    public zb0(cc0 cc0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f52600b = cc0Var;
        this.f52602e = tLObject;
        this.d = bundle;
        this.f52601c = tL_error;
    }

    @Override
    public final void run() {
        String str;
        int i3 = this.f52599a;
        TLObject tLObject = this.f52602e;
        Bundle bundle = this.d;
        TLRPC.TL_error tL_error = this.f52601c;
        cc0 cc0Var = this.f52600b;
        switch (i3) {
            case 0:
                xd0 xd0Var = cc0Var.f44298b0;
                cc0Var.N = false;
                cc0Var.f44305w.invalidate();
                if (tLObject != null) {
                    cc0Var.T = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    cc0Var.U = tL_auth_sentCode;
                    xd0Var.p1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (tL_error != null && (str = tL_error.text) != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749187, null));
                        return;
                    } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            cc0Var.c(true);
                            xd0Var.D1(0, true, null, true);
                            xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, null));
                            return;
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131750688, null));
                            return;
                        } else if (tL_error.code != -1000) {
                            String M0 = org.telegram.messenger.bd.M0(2131746081, null);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.messenger.camera.q.q(null, 2131751106, sb2, "\n");
                            sb2.append(tL_error.text);
                            xd0Var.u1(M0, sb2.toString());
                            return;
                        } else {
                            return;
                        }
                    } else {
                        xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749191, null));
                        return;
                    }
                } else {
                    return;
                }
            default:
                xd0 xd0Var2 = cc0Var.f44298b0;
                cc0Var.S = false;
                if (tL_error == null) {
                    xd0Var2.p1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                } else {
                    String str2 = tL_error.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749187, null));
                        } else if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                cc0Var.c(true);
                                xd0Var2.D1(0, true, null, true);
                                xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, null));
                            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131750688, null));
                            } else if (tL_error.code != -1000) {
                                String M02 = org.telegram.messenger.bd.M0(2131746081, null);
                                StringBuilder sb3 = new StringBuilder();
                                org.telegram.messenger.camera.q.q(null, 2131751106, sb3, "\n");
                                sb3.append(tL_error.text);
                                xd0Var2.u1(M02, sb3.toString());
                            }
                        } else {
                            xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749191, null));
                        }
                    }
                }
                xd0Var2.t1(false, true);
                return;
        }
    }

    public zb0(cc0 cc0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f52600b = cc0Var;
        this.f52601c = tL_error;
        this.d = bundle;
        this.f52602e = tLObject;
    }
}
