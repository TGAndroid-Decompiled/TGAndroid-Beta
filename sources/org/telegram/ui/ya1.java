package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class ya1 implements TextWatcher {
    public final int f54151a;
    public final bb1 f54152b;

    public ya1(bb1 bb1Var, int i7) {
        this.f54151a = i7;
        this.f54152b = bb1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.oh0 oh0Var;
        switch (this.f54151a) {
            case 0:
                this.f54152b.getClass();
                return;
            case 1:
                bb1 bb1Var = this.f54152b;
                if (!bb1Var.N) {
                    int i7 = bb1Var.P;
                    if (i7 == 0) {
                        org.telegram.ui.Components.oh0 animatedDrawable = bb1Var.f45831a.getAnimatedDrawable();
                        if (bb1Var.f45847n.length() > 0) {
                            if (bb1Var.f45847n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.oh0[] oh0VarArr = bb1Var.f45842g0;
                                if (animatedDrawable != oh0VarArr[3] && animatedDrawable != (oh0Var = oh0VarArr[5])) {
                                    bb1Var.f45831a.setAnimation(oh0Var);
                                    bb1Var.f45842g0[5].T(false, 0.0f);
                                    bb1Var.f45831a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.oh0[] oh0VarArr2 = bb1Var.f45842g0;
                            if (animatedDrawable != oh0VarArr2[3]) {
                                org.telegram.ui.Components.oh0 oh0Var2 = oh0VarArr2[2];
                                if (animatedDrawable != oh0Var2) {
                                    bb1Var.f45831a.setAnimation(oh0Var2);
                                    bb1Var.f45842g0[2].P(49);
                                    bb1Var.f45842g0[2].T(false, 0.0f);
                                    bb1Var.f45831a.d();
                                    return;
                                } else if (oh0Var2.f38213b0 < 49) {
                                    oh0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != bb1Var.f45842g0[3] || bb1Var.f45847n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.oh0[] oh0VarArr3 = bb1Var.f45842g0;
                            if (animatedDrawable != oh0VarArr3[5]) {
                                oh0VarArr3[2].P(-1);
                                org.telegram.ui.Components.oh0 oh0Var3 = bb1Var.f45842g0[2];
                                if (animatedDrawable != oh0Var3) {
                                    bb1Var.f45831a.setAnimation(oh0Var3);
                                    bb1Var.f45842g0[2].N(49, false, false);
                                }
                                bb1Var.f45831a.d();
                                return;
                            }
                        }
                        bb1Var.f45831a.setAnimation(bb1Var.f45842g0[4]);
                        bb1Var.f45842g0[4].T(false, 0.0f);
                        bb1Var.f45831a.d();
                        return;
                    } else if (i7 == 1) {
                        try {
                            bb1Var.f45842g0[6].P((int) ((Math.min(1.0f, bb1Var.f45847n.getLayout().getLineWidth(0) / bb1Var.f45847n.getWidth()) * 142.0f) + 18.0f));
                            bb1Var.f45831a.d();
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    } else if (i7 == 8 && editable.length() > 0) {
                        bb1Var.M0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                bb1 bb1Var2 = this.f54152b;
                if (bb1Var2.G) {
                    if (bb1Var2.F.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.X3(bb1Var2.F, true, 0.1f, true, true);
                        return;
                    } else if (bb1Var2.F.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.X3(bb1Var2.F, false, 0.1f, true, true);
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
        int i12 = this.f54151a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f54151a;
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
