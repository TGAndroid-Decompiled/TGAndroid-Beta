package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class u91 implements RequestDelegate {
    public final int f50021a;
    public final TwoStepVerificationActivity f50022b;

    public u91(TwoStepVerificationActivity twoStepVerificationActivity, int i3) {
        this.f50021a = i3;
        this.f50022b = twoStepVerificationActivity;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f50021a) {
            case 0:
                final TwoStepVerificationActivity twoStepVerificationActivity = this.f50022b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        int i3 = r3;
                        TLObject tLObject2 = tLObject;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        switch (i3) {
                            case 0:
                                twoStepVerificationActivity2.t0();
                                if (tLObject2 instanceof TL_account.resetPasswordOk) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity2.getParentActivity());
                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747839, null), null);
                                    String M0 = org.telegram.messenger.bd.M0(2131746103, null);
                                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                    s1Var.S = M0;
                                    s1Var.U = org.telegram.messenger.bd.M0(2131746077, null);
                                    twoStepVerificationActivity2.showDialog(s1Var, new s5(twoStepVerificationActivity2, 17));
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordRequestedWait) {
                                    twoStepVerificationActivity2.J.pending_reset_date = ((TL_account.resetPasswordRequestedWait) tLObject2).until_date;
                                    twoStepVerificationActivity2.D0();
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordFailedWait) {
                                    int currentTime = ((TL_account.resetPasswordFailedWait) tLObject2).retry_date - twoStepVerificationActivity2.getConnectionsManager().getCurrentTime();
                                    if (currentTime > 86400) {
                                        G = org.telegram.messenger.bd.G(currentTime / 86400, "Days", new Object[0]);
                                    } else if (currentTime > 3600) {
                                        G = org.telegram.messenger.bd.G(currentTime / 86400, "Hours", new Object[0]);
                                    } else if (currentTime > 60) {
                                        G = org.telegram.messenger.bd.G(currentTime / 60, "Minutes", new Object[0]);
                                    } else {
                                        G = org.telegram.messenger.bd.G(Math.max(1, currentTime), "Seconds", new Object[0]);
                                    }
                                    twoStepVerificationActivity2.B0(org.telegram.messenger.bd.M0(2131746103, null), org.telegram.messenger.bd.a0("ResetPasswordWait", null, 2131746102, G));
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    twoStepVerificationActivity2.J.pending_reset_date = 0;
                                    twoStepVerificationActivity2.D0();
                                    return;
                                }
                                twoStepVerificationActivity2.getClass();
                                return;
                        }
                    }
                });
                return;
            case 1:
                final TwoStepVerificationActivity twoStepVerificationActivity2 = this.f50022b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TwoStepVerificationActivity.k0(twoStepVerificationActivity2, tL_error, tLObject);
                                return;
                            case 1:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity2, tL_error, tLObject);
                                return;
                            case 2:
                                TwoStepVerificationActivity.e0(twoStepVerificationActivity2, tL_error, tLObject);
                                return;
                            case 3:
                                TwoStepVerificationActivity.a0(twoStepVerificationActivity2, tL_error, tLObject);
                                return;
                            default:
                                TwoStepVerificationActivity.g0(twoStepVerificationActivity2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 2:
                final TwoStepVerificationActivity twoStepVerificationActivity3 = this.f50022b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        String G;
                        int i3 = r3;
                        TLObject tLObject2 = tLObject;
                        TwoStepVerificationActivity twoStepVerificationActivity22 = twoStepVerificationActivity3;
                        switch (i3) {
                            case 0:
                                twoStepVerificationActivity22.t0();
                                if (tLObject2 instanceof TL_account.resetPasswordOk) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity22.getParentActivity());
                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747839, null), null);
                                    String M0 = org.telegram.messenger.bd.M0(2131746103, null);
                                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                    s1Var.S = M0;
                                    s1Var.U = org.telegram.messenger.bd.M0(2131746077, null);
                                    twoStepVerificationActivity22.showDialog(s1Var, new s5(twoStepVerificationActivity22, 17));
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordRequestedWait) {
                                    twoStepVerificationActivity22.J.pending_reset_date = ((TL_account.resetPasswordRequestedWait) tLObject2).until_date;
                                    twoStepVerificationActivity22.D0();
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordFailedWait) {
                                    int currentTime = ((TL_account.resetPasswordFailedWait) tLObject2).retry_date - twoStepVerificationActivity22.getConnectionsManager().getCurrentTime();
                                    if (currentTime > 86400) {
                                        G = org.telegram.messenger.bd.G(currentTime / 86400, "Days", new Object[0]);
                                    } else if (currentTime > 3600) {
                                        G = org.telegram.messenger.bd.G(currentTime / 86400, "Hours", new Object[0]);
                                    } else if (currentTime > 60) {
                                        G = org.telegram.messenger.bd.G(currentTime / 60, "Minutes", new Object[0]);
                                    } else {
                                        G = org.telegram.messenger.bd.G(Math.max(1, currentTime), "Seconds", new Object[0]);
                                    }
                                    twoStepVerificationActivity22.B0(org.telegram.messenger.bd.M0(2131746103, null), org.telegram.messenger.bd.a0("ResetPasswordWait", null, 2131746102, G));
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    twoStepVerificationActivity22.J.pending_reset_date = 0;
                                    twoStepVerificationActivity22.D0();
                                    return;
                                }
                                twoStepVerificationActivity22.getClass();
                                return;
                        }
                    }
                });
                return;
            case 3:
                final TwoStepVerificationActivity twoStepVerificationActivity4 = this.f50022b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TwoStepVerificationActivity.k0(twoStepVerificationActivity4, tL_error, tLObject);
                                return;
                            case 1:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity4, tL_error, tLObject);
                                return;
                            case 2:
                                TwoStepVerificationActivity.e0(twoStepVerificationActivity4, tL_error, tLObject);
                                return;
                            case 3:
                                TwoStepVerificationActivity.a0(twoStepVerificationActivity4, tL_error, tLObject);
                                return;
                            default:
                                TwoStepVerificationActivity.g0(twoStepVerificationActivity4, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 4:
                final TwoStepVerificationActivity twoStepVerificationActivity5 = this.f50022b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TwoStepVerificationActivity.k0(twoStepVerificationActivity5, tL_error, tLObject);
                                return;
                            case 1:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity5, tL_error, tLObject);
                                return;
                            case 2:
                                TwoStepVerificationActivity.e0(twoStepVerificationActivity5, tL_error, tLObject);
                                return;
                            case 3:
                                TwoStepVerificationActivity.a0(twoStepVerificationActivity5, tL_error, tLObject);
                                return;
                            default:
                                TwoStepVerificationActivity.g0(twoStepVerificationActivity5, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 5:
                final TwoStepVerificationActivity twoStepVerificationActivity6 = this.f50022b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TwoStepVerificationActivity.k0(twoStepVerificationActivity6, tL_error, tLObject);
                                return;
                            case 1:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity6, tL_error, tLObject);
                                return;
                            case 2:
                                TwoStepVerificationActivity.e0(twoStepVerificationActivity6, tL_error, tLObject);
                                return;
                            case 3:
                                TwoStepVerificationActivity.a0(twoStepVerificationActivity6, tL_error, tLObject);
                                return;
                            default:
                                TwoStepVerificationActivity.g0(twoStepVerificationActivity6, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final TwoStepVerificationActivity twoStepVerificationActivity7 = this.f50022b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TwoStepVerificationActivity.k0(twoStepVerificationActivity7, tL_error, tLObject);
                                return;
                            case 1:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity7, tL_error, tLObject);
                                return;
                            case 2:
                                TwoStepVerificationActivity.e0(twoStepVerificationActivity7, tL_error, tLObject);
                                return;
                            case 3:
                                TwoStepVerificationActivity.a0(twoStepVerificationActivity7, tL_error, tLObject);
                                return;
                            default:
                                TwoStepVerificationActivity.g0(twoStepVerificationActivity7, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
