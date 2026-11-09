package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class ya1 implements TextWatcher {
    public final int f52068a;
    public final bb1 f52069b;

    public ya1(bb1 bb1Var, int i7) {
        this.f52068a = i7;
        this.f52069b = bb1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.ah0 ah0Var;
        switch (this.f52068a) {
            case 0:
                this.f52069b.getClass();
                return;
            case 1:
                bb1 bb1Var = this.f52069b;
                if (!bb1Var.M) {
                    int i7 = bb1Var.O;
                    if (i7 == 0) {
                        org.telegram.ui.Components.ah0 animatedDrawable = bb1Var.f43950a.getAnimatedDrawable();
                        if (bb1Var.f43965n.length() > 0) {
                            if (bb1Var.f43965n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.ah0[] ah0VarArr = bb1Var.f43960f0;
                                if (animatedDrawable != ah0VarArr[3] && animatedDrawable != (ah0Var = ah0VarArr[5])) {
                                    bb1Var.f43950a.setAnimation(ah0Var);
                                    bb1Var.f43960f0[5].T(false, 0.0f);
                                    bb1Var.f43950a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.ah0[] ah0VarArr2 = bb1Var.f43960f0;
                            if (animatedDrawable != ah0VarArr2[3]) {
                                org.telegram.ui.Components.ah0 ah0Var2 = ah0VarArr2[2];
                                if (animatedDrawable != ah0Var2) {
                                    bb1Var.f43950a.setAnimation(ah0Var2);
                                    bb1Var.f43960f0[2].P(49);
                                    bb1Var.f43960f0[2].T(false, 0.0f);
                                    bb1Var.f43950a.d();
                                    return;
                                } else if (ah0Var2.f31820a0 < 49) {
                                    ah0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != bb1Var.f43960f0[3] || bb1Var.f43965n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.ah0[] ah0VarArr3 = bb1Var.f43960f0;
                            if (animatedDrawable != ah0VarArr3[5]) {
                                ah0VarArr3[2].P(-1);
                                org.telegram.ui.Components.ah0 ah0Var3 = bb1Var.f43960f0[2];
                                if (animatedDrawable != ah0Var3) {
                                    bb1Var.f43950a.setAnimation(ah0Var3);
                                    bb1Var.f43960f0[2].N(49, false, false);
                                }
                                bb1Var.f43950a.d();
                                return;
                            }
                        }
                        bb1Var.f43950a.setAnimation(bb1Var.f43960f0[4]);
                        bb1Var.f43960f0[4].T(false, 0.0f);
                        bb1Var.f43950a.d();
                        return;
                    } else if (i7 == 1) {
                        try {
                            bb1Var.f43960f0[6].P((int) ((Math.min(1.0f, bb1Var.f43965n.getLayout().getLineWidth(0) / bb1Var.f43965n.getWidth()) * 142.0f) + 18.0f));
                            bb1Var.f43950a.d();
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
                bb1 bb1Var2 = this.f52069b;
                if (bb1Var2.F) {
                    if (bb1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(bb1Var2.E, true, 0.1f, true, true);
                        return;
                    } else if (bb1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(bb1Var2.E, false, 0.1f, true, true);
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
        int i12 = this.f52068a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f52068a;
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
