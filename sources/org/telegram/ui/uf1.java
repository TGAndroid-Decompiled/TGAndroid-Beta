package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uf1 implements RequestDelegate {
    public final int f41922a;
    public final TwoStepVerificationActivity f41923b;

    public uf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41922a = i10;
        this.f41923b = twoStepVerificationActivity;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f41922a) {
            case 0:
                final TwoStepVerificationActivity twoStepVerificationActivity = this.f41923b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String formatPluralString;
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        switch (i10) {
                            case 0:
                                twoStepVerificationActivity2.o0();
                                if (tLObject2 instanceof TL_account.resetPasswordOk) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity2.getParentActivity());
                                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                                    String string = LocaleController.getString(R.string.ResetPassword);
                                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                                    d2Var.O = string;
                                    d2Var.Q = LocaleController.getString(R.string.RestorePasswordResetPasswordOk);
                                    twoStepVerificationActivity2.showDialog(d2Var, new v5(twoStepVerificationActivity2, 18));
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordRequestedWait) {
                                    twoStepVerificationActivity2.F.pending_reset_date = ((TL_account.resetPasswordRequestedWait) tLObject2).until_date;
                                    twoStepVerificationActivity2.y0();
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordFailedWait) {
                                    int currentTime = ((TL_account.resetPasswordFailedWait) tLObject2).retry_date - twoStepVerificationActivity2.getConnectionsManager().getCurrentTime();
                                    if (currentTime > 86400) {
                                        formatPluralString = LocaleController.formatPluralString("Days", currentTime / 86400, new Object[0]);
                                    } else if (currentTime > 3600) {
                                        formatPluralString = LocaleController.formatPluralString("Hours", currentTime / 86400, new Object[0]);
                                    } else if (currentTime > 60) {
                                        formatPluralString = LocaleController.formatPluralString("Minutes", currentTime / 60, new Object[0]);
                                    } else {
                                        formatPluralString = LocaleController.formatPluralString("Seconds", Math.max(1, currentTime), new Object[0]);
                                    }
                                    twoStepVerificationActivity2.w0(LocaleController.getString(R.string.ResetPassword), LocaleController.formatString("ResetPasswordWait", R.string.ResetPasswordWait, formatPluralString));
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    twoStepVerificationActivity2.F.pending_reset_date = 0;
                                    twoStepVerificationActivity2.y0();
                                    return;
                                }
                                twoStepVerificationActivity2.getClass();
                                return;
                        }
                    }
                });
                return;
            case 1:
                final TwoStepVerificationActivity twoStepVerificationActivity2 = this.f41923b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TwoStepVerificationActivity.f0(twoStepVerificationActivity2, tL_error, tLObject);
                                return;
                            case 1:
                                TwoStepVerificationActivity.U(twoStepVerificationActivity2, tL_error, tLObject);
                                return;
                            case 2:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity2, tL_error, tLObject);
                                return;
                            case 3:
                                TwoStepVerificationActivity.V(twoStepVerificationActivity2, tL_error, tLObject);
                                return;
                            default:
                                TwoStepVerificationActivity.b0(twoStepVerificationActivity2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 2:
                final TwoStepVerificationActivity twoStepVerificationActivity3 = this.f41923b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String formatPluralString;
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        TwoStepVerificationActivity twoStepVerificationActivity22 = twoStepVerificationActivity3;
                        switch (i10) {
                            case 0:
                                twoStepVerificationActivity22.o0();
                                if (tLObject2 instanceof TL_account.resetPasswordOk) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity22.getParentActivity());
                                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                                    String string = LocaleController.getString(R.string.ResetPassword);
                                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                                    d2Var.O = string;
                                    d2Var.Q = LocaleController.getString(R.string.RestorePasswordResetPasswordOk);
                                    twoStepVerificationActivity22.showDialog(d2Var, new v5(twoStepVerificationActivity22, 18));
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordRequestedWait) {
                                    twoStepVerificationActivity22.F.pending_reset_date = ((TL_account.resetPasswordRequestedWait) tLObject2).until_date;
                                    twoStepVerificationActivity22.y0();
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordFailedWait) {
                                    int currentTime = ((TL_account.resetPasswordFailedWait) tLObject2).retry_date - twoStepVerificationActivity22.getConnectionsManager().getCurrentTime();
                                    if (currentTime > 86400) {
                                        formatPluralString = LocaleController.formatPluralString("Days", currentTime / 86400, new Object[0]);
                                    } else if (currentTime > 3600) {
                                        formatPluralString = LocaleController.formatPluralString("Hours", currentTime / 86400, new Object[0]);
                                    } else if (currentTime > 60) {
                                        formatPluralString = LocaleController.formatPluralString("Minutes", currentTime / 60, new Object[0]);
                                    } else {
                                        formatPluralString = LocaleController.formatPluralString("Seconds", Math.max(1, currentTime), new Object[0]);
                                    }
                                    twoStepVerificationActivity22.w0(LocaleController.getString(R.string.ResetPassword), LocaleController.formatString("ResetPasswordWait", R.string.ResetPasswordWait, formatPluralString));
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    twoStepVerificationActivity22.F.pending_reset_date = 0;
                                    twoStepVerificationActivity22.y0();
                                    return;
                                }
                                twoStepVerificationActivity22.getClass();
                                return;
                        }
                    }
                });
                return;
            case 3:
                final TwoStepVerificationActivity twoStepVerificationActivity4 = this.f41923b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TwoStepVerificationActivity.f0(twoStepVerificationActivity4, tL_error, tLObject);
                                return;
                            case 1:
                                TwoStepVerificationActivity.U(twoStepVerificationActivity4, tL_error, tLObject);
                                return;
                            case 2:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity4, tL_error, tLObject);
                                return;
                            case 3:
                                TwoStepVerificationActivity.V(twoStepVerificationActivity4, tL_error, tLObject);
                                return;
                            default:
                                TwoStepVerificationActivity.b0(twoStepVerificationActivity4, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 4:
                final TwoStepVerificationActivity twoStepVerificationActivity5 = this.f41923b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TwoStepVerificationActivity.f0(twoStepVerificationActivity5, tL_error, tLObject);
                                return;
                            case 1:
                                TwoStepVerificationActivity.U(twoStepVerificationActivity5, tL_error, tLObject);
                                return;
                            case 2:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity5, tL_error, tLObject);
                                return;
                            case 3:
                                TwoStepVerificationActivity.V(twoStepVerificationActivity5, tL_error, tLObject);
                                return;
                            default:
                                TwoStepVerificationActivity.b0(twoStepVerificationActivity5, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 5:
                final TwoStepVerificationActivity twoStepVerificationActivity6 = this.f41923b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TwoStepVerificationActivity.f0(twoStepVerificationActivity6, tL_error, tLObject);
                                return;
                            case 1:
                                TwoStepVerificationActivity.U(twoStepVerificationActivity6, tL_error, tLObject);
                                return;
                            case 2:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity6, tL_error, tLObject);
                                return;
                            case 3:
                                TwoStepVerificationActivity.V(twoStepVerificationActivity6, tL_error, tLObject);
                                return;
                            default:
                                TwoStepVerificationActivity.b0(twoStepVerificationActivity6, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final TwoStepVerificationActivity twoStepVerificationActivity7 = this.f41923b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TwoStepVerificationActivity.f0(twoStepVerificationActivity7, tL_error, tLObject);
                                return;
                            case 1:
                                TwoStepVerificationActivity.U(twoStepVerificationActivity7, tL_error, tLObject);
                                return;
                            case 2:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity7, tL_error, tLObject);
                                return;
                            case 3:
                                TwoStepVerificationActivity.V(twoStepVerificationActivity7, tL_error, tLObject);
                                return;
                            default:
                                TwoStepVerificationActivity.b0(twoStepVerificationActivity7, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
