package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class za1 implements TextWatcher {
    public final int f52397a;
    public final cb1 f52398b;

    public za1(cb1 cb1Var, int i7) {
        this.f52397a = i7;
        this.f52398b = cb1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.zg0 zg0Var;
        switch (this.f52397a) {
            case 0:
                this.f52398b.getClass();
                return;
            case 1:
                cb1 cb1Var = this.f52398b;
                if (!cb1Var.M) {
                    int i7 = cb1Var.O;
                    if (i7 == 0) {
                        org.telegram.ui.Components.zg0 animatedDrawable = cb1Var.f44292a.getAnimatedDrawable();
                        if (cb1Var.f44307n.length() > 0) {
                            if (cb1Var.f44307n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.zg0[] zg0VarArr = cb1Var.f44302f0;
                                if (animatedDrawable != zg0VarArr[3] && animatedDrawable != (zg0Var = zg0VarArr[5])) {
                                    cb1Var.f44292a.setAnimation(zg0Var);
                                    cb1Var.f44302f0[5].T(false, 0.0f);
                                    cb1Var.f44292a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.zg0[] zg0VarArr2 = cb1Var.f44302f0;
                            if (animatedDrawable != zg0VarArr2[3]) {
                                org.telegram.ui.Components.zg0 zg0Var2 = zg0VarArr2[2];
                                if (animatedDrawable != zg0Var2) {
                                    cb1Var.f44292a.setAnimation(zg0Var2);
                                    cb1Var.f44302f0[2].P(49);
                                    cb1Var.f44302f0[2].T(false, 0.0f);
                                    cb1Var.f44292a.d();
                                    return;
                                } else if (zg0Var2.f40962a0 < 49) {
                                    zg0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != cb1Var.f44302f0[3] || cb1Var.f44307n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.zg0[] zg0VarArr3 = cb1Var.f44302f0;
                            if (animatedDrawable != zg0VarArr3[5]) {
                                zg0VarArr3[2].P(-1);
                                org.telegram.ui.Components.zg0 zg0Var3 = cb1Var.f44302f0[2];
                                if (animatedDrawable != zg0Var3) {
                                    cb1Var.f44292a.setAnimation(zg0Var3);
                                    cb1Var.f44302f0[2].N(49, false, false);
                                }
                                cb1Var.f44292a.d();
                                return;
                            }
                        }
                        cb1Var.f44292a.setAnimation(cb1Var.f44302f0[4]);
                        cb1Var.f44302f0[4].T(false, 0.0f);
                        cb1Var.f44292a.d();
                        return;
                    } else if (i7 == 1) {
                        try {
                            cb1Var.f44302f0[6].P((int) ((Math.min(1.0f, cb1Var.f44307n.getLayout().getLineWidth(0) / cb1Var.f44307n.getWidth()) * 142.0f) + 18.0f));
                            cb1Var.f44292a.d();
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    } else if (i7 == 8 && editable.length() > 0) {
                        cb1Var.M0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                cb1 cb1Var2 = this.f52398b;
                if (cb1Var2.F) {
                    if (cb1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(cb1Var2.E, true, 0.1f, true, true);
                        return;
                    } else if (cb1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(cb1Var2.E, false, 0.1f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f52397a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f52397a;
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
