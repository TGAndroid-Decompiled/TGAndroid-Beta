package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class va1 implements TextWatcher {
    public final int f50683a;
    public final ya1 f50684b;

    public va1(ya1 ya1Var, int i7) {
        this.f50683a = i7;
        this.f50684b = ya1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.zg0 zg0Var;
        switch (this.f50683a) {
            case 0:
                this.f50684b.getClass();
                return;
            case 1:
                ya1 ya1Var = this.f50684b;
                if (!ya1Var.M) {
                    int i7 = ya1Var.O;
                    if (i7 == 0) {
                        org.telegram.ui.Components.zg0 animatedDrawable = ya1Var.f52180a.getAnimatedDrawable();
                        if (ya1Var.f52195n.length() > 0) {
                            if (ya1Var.f52195n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.zg0[] zg0VarArr = ya1Var.f52190f0;
                                if (animatedDrawable != zg0VarArr[3] && animatedDrawable != (zg0Var = zg0VarArr[5])) {
                                    ya1Var.f52180a.setAnimation(zg0Var);
                                    ya1Var.f52190f0[5].T(false, 0.0f);
                                    ya1Var.f52180a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.zg0[] zg0VarArr2 = ya1Var.f52190f0;
                            if (animatedDrawable != zg0VarArr2[3]) {
                                org.telegram.ui.Components.zg0 zg0Var2 = zg0VarArr2[2];
                                if (animatedDrawable != zg0Var2) {
                                    ya1Var.f52180a.setAnimation(zg0Var2);
                                    ya1Var.f52190f0[2].P(49);
                                    ya1Var.f52190f0[2].T(false, 0.0f);
                                    ya1Var.f52180a.d();
                                    return;
                                } else if (zg0Var2.f40970a0 < 49) {
                                    zg0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != ya1Var.f52190f0[3] || ya1Var.f52195n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.zg0[] zg0VarArr3 = ya1Var.f52190f0;
                            if (animatedDrawable != zg0VarArr3[5]) {
                                zg0VarArr3[2].P(-1);
                                org.telegram.ui.Components.zg0 zg0Var3 = ya1Var.f52190f0[2];
                                if (animatedDrawable != zg0Var3) {
                                    ya1Var.f52180a.setAnimation(zg0Var3);
                                    ya1Var.f52190f0[2].N(49, false, false);
                                }
                                ya1Var.f52180a.d();
                                return;
                            }
                        }
                        ya1Var.f52180a.setAnimation(ya1Var.f52190f0[4]);
                        ya1Var.f52190f0[4].T(false, 0.0f);
                        ya1Var.f52180a.d();
                        return;
                    } else if (i7 == 1) {
                        try {
                            ya1Var.f52190f0[6].P((int) ((Math.min(1.0f, ya1Var.f52195n.getLayout().getLineWidth(0) / ya1Var.f52195n.getWidth()) * 142.0f) + 18.0f));
                            ya1Var.f52180a.d();
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    } else if (i7 == 8 && editable.length() > 0) {
                        ya1Var.M0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                ya1 ya1Var2 = this.f50684b;
                if (ya1Var2.F) {
                    if (ya1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(ya1Var2.E, true, 0.1f, true, true);
                        return;
                    } else if (ya1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(ya1Var2.E, false, 0.1f, true, true);
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
        int i12 = this.f50683a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f50683a;
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
