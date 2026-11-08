package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class wa1 implements TextWatcher {
    public final int f51047a;
    public final za1 f51048b;

    public wa1(za1 za1Var, int i7) {
        this.f51047a = i7;
        this.f51048b = za1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.zg0 zg0Var;
        switch (this.f51047a) {
            case 0:
                this.f51048b.getClass();
                return;
            case 1:
                za1 za1Var = this.f51048b;
                if (!za1Var.M) {
                    int i7 = za1Var.O;
                    if (i7 == 0) {
                        org.telegram.ui.Components.zg0 animatedDrawable = za1Var.f52496a.getAnimatedDrawable();
                        if (za1Var.f52511n.length() > 0) {
                            if (za1Var.f52511n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.zg0[] zg0VarArr = za1Var.f52506f0;
                                if (animatedDrawable != zg0VarArr[3] && animatedDrawable != (zg0Var = zg0VarArr[5])) {
                                    za1Var.f52496a.setAnimation(zg0Var);
                                    za1Var.f52506f0[5].T(false, 0.0f);
                                    za1Var.f52496a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.zg0[] zg0VarArr2 = za1Var.f52506f0;
                            if (animatedDrawable != zg0VarArr2[3]) {
                                org.telegram.ui.Components.zg0 zg0Var2 = zg0VarArr2[2];
                                if (animatedDrawable != zg0Var2) {
                                    za1Var.f52496a.setAnimation(zg0Var2);
                                    za1Var.f52506f0[2].P(49);
                                    za1Var.f52506f0[2].T(false, 0.0f);
                                    za1Var.f52496a.d();
                                    return;
                                } else if (zg0Var2.f40989a0 < 49) {
                                    zg0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != za1Var.f52506f0[3] || za1Var.f52511n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.zg0[] zg0VarArr3 = za1Var.f52506f0;
                            if (animatedDrawable != zg0VarArr3[5]) {
                                zg0VarArr3[2].P(-1);
                                org.telegram.ui.Components.zg0 zg0Var3 = za1Var.f52506f0[2];
                                if (animatedDrawable != zg0Var3) {
                                    za1Var.f52496a.setAnimation(zg0Var3);
                                    za1Var.f52506f0[2].N(49, false, false);
                                }
                                za1Var.f52496a.d();
                                return;
                            }
                        }
                        za1Var.f52496a.setAnimation(za1Var.f52506f0[4]);
                        za1Var.f52506f0[4].T(false, 0.0f);
                        za1Var.f52496a.d();
                        return;
                    } else if (i7 == 1) {
                        try {
                            za1Var.f52506f0[6].P((int) ((Math.min(1.0f, za1Var.f52511n.getLayout().getLineWidth(0) / za1Var.f52511n.getWidth()) * 142.0f) + 18.0f));
                            za1Var.f52496a.d();
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    } else if (i7 == 8 && editable.length() > 0) {
                        za1Var.M0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                za1 za1Var2 = this.f51048b;
                if (za1Var2.F) {
                    if (za1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(za1Var2.E, true, 0.1f, true, true);
                        return;
                    } else if (za1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(za1Var2.E, false, 0.1f, true, true);
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
        int i12 = this.f51047a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f51047a;
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
