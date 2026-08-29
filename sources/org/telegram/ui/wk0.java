package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class wk0 extends org.telegram.ui.Components.il0 {
    public final Context f44314c;
    public final PasscodeActivity d;

    public wk0(PasscodeActivity passcodeActivity, Context context) {
        this.d = passcodeActivity;
        this.f44314c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int b10 = n1Var.b();
        PasscodeActivity passcodeActivity = this.d;
        i10 = passcodeActivity.fingerprintRow;
        if (b10 != i10) {
            i11 = passcodeActivity.autoLockRow;
            if (b10 != i11 && b10 != passcodeActivity.F) {
                i12 = passcodeActivity.changePasscodeRow;
                if (b10 != i12) {
                    i13 = passcodeActivity.disablePasscodeRow;
                    if (b10 != i13) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.H;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        PasscodeActivity passcodeActivity = this.d;
        i11 = passcodeActivity.fingerprintRow;
        if (i10 != i11 && i10 != passcodeActivity.F) {
            i12 = passcodeActivity.changePasscodeRow;
            if (i10 != i12) {
                i13 = passcodeActivity.autoLockRow;
                if (i10 != i13) {
                    i14 = passcodeActivity.disablePasscodeRow;
                    if (i10 != i14) {
                        if (i10 != passcodeActivity.D && i10 != passcodeActivity.G && i10 != passcodeActivity.C) {
                            if (i10 == passcodeActivity.E) {
                                return 3;
                            }
                            if (i10 == 0) {
                                return 4;
                            }
                            return 0;
                        }
                        return 2;
                    }
                    return 1;
                }
                return 1;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        String formatString;
        int i15 = n1Var.f6436f;
        View view = n1Var.f6432a;
        PasscodeActivity passcodeActivity = this.d;
        if (i15 != 0) {
            if (i15 != 1) {
                int i16 = 3;
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 == 4) {
                            xk0 xk0Var = (xk0) view;
                            xk0Var.f44603a.f(R.raw.utyan_passcode, 100, 100, null);
                            xk0Var.f44603a.d();
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                    k4Var.setHeight(46);
                    if (i10 == passcodeActivity.E) {
                        k4Var.setText(LocaleController.getString(R.string.ScreenCaptureHeader));
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i10 == passcodeActivity.C) {
                    y8Var.setText(LocaleController.getString(R.string.PasscodeScreenHint));
                    y8Var.setBackground(null);
                    y8Var.getTextView().setGravity(1);
                    return;
                } else if (i10 == passcodeActivity.D) {
                    y8Var.setText(LocaleController.getString(R.string.AutoLockInfo));
                    org.telegram.ui.Components.y80 textView = y8Var.getTextView();
                    if (LocaleController.isRTL) {
                        i16 = 5;
                    }
                    textView.setGravity(i16);
                    return;
                } else if (i10 == passcodeActivity.G) {
                    y8Var.setText(LocaleController.getString(R.string.ScreenCaptureInfo));
                    org.telegram.ui.Components.y80 textView2 = y8Var.getTextView();
                    if (LocaleController.isRTL) {
                        i16 = 5;
                    }
                    textView2.setGravity(i16);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view;
            i12 = passcodeActivity.changePasscodeRow;
            if (i10 != i12) {
                i13 = passcodeActivity.autoLockRow;
                if (i10 != i13) {
                    i14 = passcodeActivity.disablePasscodeRow;
                    if (i10 == i14) {
                        y9Var.b(LocaleController.getString(R.string.DisablePasscode), false);
                        int i17 = org.telegram.ui.ActionBar.g6.f23295q7;
                        y9Var.setTag(Integer.valueOf(i17));
                        y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                        return;
                    }
                    return;
                }
                int i18 = SharedConfig.autoLockIn;
                if (i18 == 0) {
                    formatString = LocaleController.formatString("AutoLockDisabled", R.string.AutoLockDisabled, new Object[0]);
                } else if (i18 < 3600) {
                    formatString = LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", i18 / 60, new Object[0]));
                } else if (i18 < 86400) {
                    formatString = LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", (int) Math.ceil((i18 / 60.0f) / 60.0f), new Object[0]));
                } else {
                    formatString = LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Days", (int) Math.ceil(((i18 / 60.0f) / 60.0f) / 24.0f), new Object[0]));
                }
                y9Var.c(LocaleController.getString(R.string.AutoLock), formatString, false, true);
                int i19 = org.telegram.ui.ActionBar.g6.G6;
                y9Var.setTag(Integer.valueOf(i19));
                y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i19, false));
                return;
            }
            y9Var.b(LocaleController.getString(R.string.ChangePasscode), true);
            if (SharedConfig.passcodeHash.isEmpty()) {
                int i20 = org.telegram.ui.ActionBar.g6.E6;
                y9Var.setTag(Integer.valueOf(i20));
                y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
                return;
            }
            int i21 = org.telegram.ui.ActionBar.g6.G6;
            y9Var.setTag(Integer.valueOf(i21));
            y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i21, false));
            return;
        }
        org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
        i11 = passcodeActivity.fingerprintRow;
        if (i10 == i11) {
            q8Var.f(LocaleController.getString(R.string.UnlockFingerprint), SharedConfig.useFingerprintLock, false);
        } else if (i10 == passcodeActivity.F) {
            q8Var.f(LocaleController.getString(R.string.ScreenCaptureShowContent), SharedConfig.allowScreenCapture, false);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View q8Var;
        Context context = this.f44314c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        q8Var = new org.telegram.ui.Cells.y8(context);
                    } else {
                        q8Var = new xk0(context);
                        q8Var.setTag(-33024);
                    }
                } else {
                    q8Var = new org.telegram.ui.Cells.k4(context);
                }
            } else {
                q8Var = new org.telegram.ui.Cells.y9(context);
            }
        } else {
            q8Var = new org.telegram.ui.Cells.q8(context);
        }
        return new f2.n1(q8Var);
    }
}
