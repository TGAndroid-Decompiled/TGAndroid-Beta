package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class wa1 implements TextWatcher {
    public final int f53274a;
    public final za1 f53275b;

    public wa1(za1 za1Var, int i7) {
        this.f53274a = i7;
        this.f53275b = za1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.nh0 nh0Var;
        switch (this.f53274a) {
            case 0:
                this.f53275b.getClass();
                return;
            case 1:
                za1 za1Var = this.f53275b;
                if (!za1Var.N) {
                    int i7 = za1Var.P;
                    if (i7 == 0) {
                        org.telegram.ui.Components.nh0 animatedDrawable = za1Var.f54560a.getAnimatedDrawable();
                        if (za1Var.f54576n.length() > 0) {
                            if (za1Var.f54576n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.nh0[] nh0VarArr = za1Var.f54571g0;
                                if (animatedDrawable != nh0VarArr[3] && animatedDrawable != (nh0Var = nh0VarArr[5])) {
                                    za1Var.f54560a.setAnimation(nh0Var);
                                    za1Var.f54571g0[5].T(false, 0.0f);
                                    za1Var.f54560a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.nh0[] nh0VarArr2 = za1Var.f54571g0;
                            if (animatedDrawable != nh0VarArr2[3]) {
                                org.telegram.ui.Components.nh0 nh0Var2 = nh0VarArr2[2];
                                if (animatedDrawable != nh0Var2) {
                                    za1Var.f54560a.setAnimation(nh0Var2);
                                    za1Var.f54571g0[2].P(49);
                                    za1Var.f54571g0[2].T(false, 0.0f);
                                    za1Var.f54560a.d();
                                    return;
                                } else if (nh0Var2.f37801b0 < 49) {
                                    nh0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != za1Var.f54571g0[3] || za1Var.f54576n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.nh0[] nh0VarArr3 = za1Var.f54571g0;
                            if (animatedDrawable != nh0VarArr3[5]) {
                                nh0VarArr3[2].P(-1);
                                org.telegram.ui.Components.nh0 nh0Var3 = za1Var.f54571g0[2];
                                if (animatedDrawable != nh0Var3) {
                                    za1Var.f54560a.setAnimation(nh0Var3);
                                    za1Var.f54571g0[2].N(49, false, false);
                                }
                                za1Var.f54560a.d();
                                return;
                            }
                        }
                        za1Var.f54560a.setAnimation(za1Var.f54571g0[4]);
                        za1Var.f54571g0[4].T(false, 0.0f);
                        za1Var.f54560a.d();
                        return;
                    } else if (i7 == 1) {
                        try {
                            za1Var.f54571g0[6].P((int) ((Math.min(1.0f, za1Var.f54576n.getLayout().getLineWidth(0) / za1Var.f54576n.getWidth()) * 142.0f) + 18.0f));
                            za1Var.f54560a.d();
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
                za1 za1Var2 = this.f53275b;
                if (za1Var2.G) {
                    if (za1Var2.F.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.X3(za1Var2.F, true, 0.1f, true, true);
                        return;
                    } else if (za1Var2.F.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.X3(za1Var2.F, false, 0.1f, true, true);
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
        int i12 = this.f53274a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f53274a;
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
