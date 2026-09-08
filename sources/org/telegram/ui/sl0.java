package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class sl0 extends org.telegram.ui.Components.kl0 {
    public final Context f40497c;
    public final PasscodeActivity d;

    public sl0(PasscodeActivity passcodeActivity, Context context) {
        this.d = passcodeActivity;
        this.f40497c = context;
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
        int i15 = c1Var.f45770f;
        View view = c1Var.f45766a;
        PasscodeActivity passcodeActivity = this.d;
        if (i15 != 0) {
            if (i15 != 1) {
                int i16 = 3;
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 == 4) {
                            tl0 tl0Var = (tl0) view;
                            tl0Var.f40819a.f(R.raw.utyan_passcode, 100, 100, null);
                            tl0Var.f40819a.d();
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                    l4Var.setHeight(46);
                    if (i10 == passcodeActivity.I) {
                        l4Var.setText(LocaleController.getString(R.string.ScreenCaptureHeader));
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                if (i10 == passcodeActivity.G) {
                    e9Var.setText(LocaleController.getString(R.string.PasscodeScreenHint));
                    e9Var.setBackground(null);
                    e9Var.getTextView().setGravity(1);
                    return;
                } else if (i10 == passcodeActivity.H) {
                    e9Var.setText(LocaleController.getString(R.string.AutoLockInfo));
                    org.telegram.ui.Components.d90 textView = e9Var.getTextView();
                    if (LocaleController.isRTL) {
                        i16 = 5;
                    }
                    textView.setGravity(i16);
                    return;
                } else if (i10 == passcodeActivity.K) {
                    e9Var.setText(LocaleController.getString(R.string.ScreenCaptureInfo));
                    org.telegram.ui.Components.d90 textView2 = e9Var.getTextView();
                    if (LocaleController.isRTL) {
                        i16 = 5;
                    }
                    textView2.setGravity(i16);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
            i12 = passcodeActivity.changePasscodeRow;
            if (i10 != i12) {
                i13 = passcodeActivity.autoLockRow;
                if (i10 != i13) {
                    i14 = passcodeActivity.disablePasscodeRow;
                    if (i10 == i14) {
                        eaVar.b(LocaleController.getString(R.string.DisablePasscode), false);
                        int i17 = org.telegram.ui.ActionBar.j6.f20925q7;
                        eaVar.setTag(Integer.valueOf(i17));
                        eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
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
                eaVar.c(LocaleController.getString(R.string.AutoLock), formatString, false, true);
                int i19 = org.telegram.ui.ActionBar.j6.G6;
                eaVar.setTag(Integer.valueOf(i19));
                eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
                return;
            }
            eaVar.b(LocaleController.getString(R.string.ChangePasscode), true);
            if (SharedConfig.passcodeHash.isEmpty()) {
                int i20 = org.telegram.ui.ActionBar.j6.E6;
                eaVar.setTag(Integer.valueOf(i20));
                eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
                return;
            }
            int i21 = org.telegram.ui.ActionBar.j6.G6;
            eaVar.setTag(Integer.valueOf(i21));
            eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i21, false));
            return;
        }
        org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
        i11 = passcodeActivity.fingerprintRow;
        if (i10 == i11) {
            w8Var.f(LocaleController.getString(R.string.UnlockFingerprint), SharedConfig.useFingerprintLock, false);
        } else if (i10 == passcodeActivity.J) {
            w8Var.f(LocaleController.getString(R.string.ScreenCaptureShowContent), SharedConfig.allowScreenCapture, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View w8Var;
        Context context = this.f40497c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        w8Var = new org.telegram.ui.Cells.e9(context);
                    } else {
                        w8Var = new tl0(context);
                        w8Var.setTag(-33024);
                    }
                } else {
                    w8Var = new org.telegram.ui.Cells.l4(context);
                }
            } else {
                w8Var = new org.telegram.ui.Cells.ea(context);
            }
        } else {
            w8Var = new org.telegram.ui.Cells.w8(context);
        }
        return new s4.c1(w8Var);
    }
}
