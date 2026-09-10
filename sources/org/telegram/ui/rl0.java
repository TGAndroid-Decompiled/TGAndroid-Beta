package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class rl0 extends org.telegram.ui.Components.ul0 {
    public final Context f36386c;
    public final PasscodeActivity d;

    public rl0(PasscodeActivity passcodeActivity, Context context) {
        this.d = passcodeActivity;
        this.f36386c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int b10 = c1Var.b();
        PasscodeActivity passcodeActivity = this.d;
        i10 = passcodeActivity.fingerprintRow;
        if (b10 != i10) {
            i11 = passcodeActivity.autoLockRow;
            if (b10 != i11 && b10 != passcodeActivity.J) {
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
        return this.d.L;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        PasscodeActivity passcodeActivity = this.d;
        i11 = passcodeActivity.fingerprintRow;
        if (i10 != i11 && i10 != passcodeActivity.J) {
            i12 = passcodeActivity.changePasscodeRow;
            if (i10 != i12) {
                i13 = passcodeActivity.autoLockRow;
                if (i10 != i13) {
                    i14 = passcodeActivity.disablePasscodeRow;
                    if (i10 != i14) {
                        if (i10 != passcodeActivity.H && i10 != passcodeActivity.K && i10 != passcodeActivity.G) {
                            if (i10 == passcodeActivity.I) {
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
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        String formatString;
        int i15 = c1Var.f41613f;
        View view = c1Var.f41610a;
        PasscodeActivity passcodeActivity = this.d;
        if (i15 != 0) {
            if (i15 != 1) {
                int i16 = 3;
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 == 4) {
                            sl0 sl0Var = (sl0) view;
                            sl0Var.f36720a.f(R.raw.utyan_passcode, 100, 100, null);
                            sl0Var.f36720a.d();
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    m4Var.setHeight(46);
                    if (i10 == passcodeActivity.I) {
                        m4Var.setText(LocaleController.getString(R.string.ScreenCaptureHeader));
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                if (i10 == passcodeActivity.G) {
                    f9Var.setText(LocaleController.getString(R.string.PasscodeScreenHint));
                    f9Var.setBackground(null);
                    f9Var.getTextView().setGravity(1);
                    return;
                } else if (i10 == passcodeActivity.H) {
                    f9Var.setText(LocaleController.getString(R.string.AutoLockInfo));
                    org.telegram.ui.Components.m90 textView = f9Var.getTextView();
                    if (LocaleController.isRTL) {
                        i16 = 5;
                    }
                    textView.setGravity(i16);
                    return;
                } else if (i10 == passcodeActivity.K) {
                    f9Var.setText(LocaleController.getString(R.string.ScreenCaptureInfo));
                    org.telegram.ui.Components.m90 textView2 = f9Var.getTextView();
                    if (LocaleController.isRTL) {
                        i16 = 5;
                    }
                    textView2.setGravity(i16);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
            i12 = passcodeActivity.changePasscodeRow;
            if (i10 != i12) {
                i13 = passcodeActivity.autoLockRow;
                if (i10 != i13) {
                    i14 = passcodeActivity.disablePasscodeRow;
                    if (i10 == i14) {
                        gaVar.b(LocaleController.getString(R.string.DisablePasscode), false);
                        int i17 = org.telegram.ui.ActionBar.j6.f18162q7;
                        gaVar.setTag(Integer.valueOf(i17));
                        gaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
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
                gaVar.c(LocaleController.getString(R.string.AutoLock), formatString, false, true);
                int i19 = org.telegram.ui.ActionBar.j6.G6;
                gaVar.setTag(Integer.valueOf(i19));
                gaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
                return;
            }
            gaVar.b(LocaleController.getString(R.string.ChangePasscode), true);
            if (SharedConfig.passcodeHash.isEmpty()) {
                int i20 = org.telegram.ui.ActionBar.j6.E6;
                gaVar.setTag(Integer.valueOf(i20));
                gaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
                return;
            }
            int i21 = org.telegram.ui.ActionBar.j6.G6;
            gaVar.setTag(Integer.valueOf(i21));
            gaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i21, false));
            return;
        }
        org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
        i11 = passcodeActivity.fingerprintRow;
        if (i10 == i11) {
            x8Var.f(LocaleController.getString(R.string.UnlockFingerprint), SharedConfig.useFingerprintLock, false);
        } else if (i10 == passcodeActivity.J) {
            x8Var.f(LocaleController.getString(R.string.ScreenCaptureShowContent), SharedConfig.allowScreenCapture, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View x8Var;
        Context context = this.f36386c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        x8Var = new org.telegram.ui.Cells.f9(context);
                    } else {
                        x8Var = new sl0(context);
                        x8Var.setTag(-33024);
                    }
                } else {
                    x8Var = new org.telegram.ui.Cells.m4(context);
                }
            } else {
                x8Var = new org.telegram.ui.Cells.ga(context);
            }
        } else {
            x8Var = new org.telegram.ui.Cells.x8(context);
        }
        return new s4.c1(x8Var);
    }
}
