package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class ua1 implements TextWatcher {
    public final int f51896a;
    public final xa1 f51897b;

    public ua1(xa1 xa1Var, int i7) {
        this.f51896a = i7;
        this.f51897b = xa1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.ch0 ch0Var;
        switch (this.f51896a) {
            case 0:
                this.f51897b.getClass();
                return;
            case 1:
                xa1 xa1Var = this.f51897b;
                if (!xa1Var.N) {
                    int i7 = xa1Var.P;
                    if (i7 == 0) {
                        org.telegram.ui.Components.ch0 animatedDrawable = xa1Var.f53138a.getAnimatedDrawable();
                        if (xa1Var.f53154n.length() > 0) {
                            if (xa1Var.f53154n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.ch0[] ch0VarArr = xa1Var.f53149g0;
                                if (animatedDrawable != ch0VarArr[3] && animatedDrawable != (ch0Var = ch0VarArr[5])) {
                                    xa1Var.f53138a.setAnimation(ch0Var);
                                    xa1Var.f53149g0[5].T(false, 0.0f);
                                    xa1Var.f53138a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.ch0[] ch0VarArr2 = xa1Var.f53149g0;
                            if (animatedDrawable != ch0VarArr2[3]) {
                                org.telegram.ui.Components.ch0 ch0Var2 = ch0VarArr2[2];
                                if (animatedDrawable != ch0Var2) {
                                    xa1Var.f53138a.setAnimation(ch0Var2);
                                    xa1Var.f53149g0[2].P(49);
                                    xa1Var.f53149g0[2].T(false, 0.0f);
                                    xa1Var.f53138a.d();
                                    return;
                                } else if (ch0Var2.f33575b0 < 49) {
                                    ch0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != xa1Var.f53149g0[3] || xa1Var.f53154n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.ch0[] ch0VarArr3 = xa1Var.f53149g0;
                            if (animatedDrawable != ch0VarArr3[5]) {
                                ch0VarArr3[2].P(-1);
                                org.telegram.ui.Components.ch0 ch0Var3 = xa1Var.f53149g0[2];
                                if (animatedDrawable != ch0Var3) {
                                    xa1Var.f53138a.setAnimation(ch0Var3);
                                    xa1Var.f53149g0[2].N(49, false, false);
                                }
                                xa1Var.f53138a.d();
                                return;
                            }
                        }
                        xa1Var.f53138a.setAnimation(xa1Var.f53149g0[4]);
                        xa1Var.f53149g0[4].T(false, 0.0f);
                        xa1Var.f53138a.d();
                        return;
                    } else if (i7 == 1) {
                        try {
                            xa1Var.f53149g0[6].P((int) ((Math.min(1.0f, xa1Var.f53154n.getLayout().getLineWidth(0) / xa1Var.f53154n.getWidth()) * 142.0f) + 18.0f));
                            xa1Var.f53138a.d();
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    } else if (i7 == 8 && editable.length() > 0) {
                        xa1Var.M0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                xa1 xa1Var2 = this.f51897b;
                if (xa1Var2.G) {
                    if (xa1Var2.F.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Y3(xa1Var2.F, true, 0.1f, true, true);
                        return;
                    } else if (xa1Var2.F.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Y3(xa1Var2.F, false, 0.1f, true, true);
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
        int i12 = this.f51896a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f51896a;
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
