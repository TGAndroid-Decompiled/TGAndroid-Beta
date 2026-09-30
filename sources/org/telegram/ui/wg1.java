package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class wg1 implements TextWatcher {
    public final int f39450a;
    public final zg1 f39451b;

    public wg1(zg1 zg1Var, int i10) {
        this.f39450a = i10;
        this.f39451b = zg1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.lj0 lj0Var;
        switch (this.f39450a) {
            case 0:
                this.f39451b.getClass();
                return;
            case 1:
                zg1 zg1Var = this.f39451b;
                if (!zg1Var.M) {
                    int i10 = zg1Var.O;
                    if (i10 == 0) {
                        org.telegram.ui.Components.lj0 animatedDrawable = zg1Var.f40580a.getAnimatedDrawable();
                        if (zg1Var.f40594n.length() > 0) {
                            if (zg1Var.f40594n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.lj0[] lj0VarArr = zg1Var.f40589f0;
                                if (animatedDrawable != lj0VarArr[3] && animatedDrawable != (lj0Var = lj0VarArr[5])) {
                                    zg1Var.f40580a.setAnimation(lj0Var);
                                    zg1Var.f40589f0[5].T(0.0f, false);
                                    zg1Var.f40580a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.lj0[] lj0VarArr2 = zg1Var.f40589f0;
                            if (animatedDrawable != lj0VarArr2[3]) {
                                org.telegram.ui.Components.lj0 lj0Var2 = lj0VarArr2[2];
                                if (animatedDrawable != lj0Var2) {
                                    zg1Var.f40580a.setAnimation(lj0Var2);
                                    zg1Var.f40589f0[2].P(49);
                                    zg1Var.f40589f0[2].T(0.0f, false);
                                    zg1Var.f40580a.d();
                                    return;
                                } else if (lj0Var2.f26008a0 < 49) {
                                    lj0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != zg1Var.f40589f0[3] || zg1Var.f40594n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.lj0[] lj0VarArr3 = zg1Var.f40589f0;
                            if (animatedDrawable != lj0VarArr3[5]) {
                                lj0VarArr3[2].P(-1);
                                org.telegram.ui.Components.lj0 lj0Var3 = zg1Var.f40589f0[2];
                                if (animatedDrawable != lj0Var3) {
                                    zg1Var.f40580a.setAnimation(lj0Var3);
                                    zg1Var.f40589f0[2].N(49, false, false);
                                }
                                zg1Var.f40580a.d();
                                return;
                            }
                        }
                        zg1Var.f40580a.setAnimation(zg1Var.f40589f0[4]);
                        zg1Var.f40589f0[4].T(0.0f, false);
                        zg1Var.f40580a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            zg1Var.f40589f0[6].P((int) ((Math.min(1.0f, zg1Var.f40594n.getLayout().getLineWidth(0) / zg1Var.f40594n.getWidth()) * 142.0f) + 18.0f));
                            zg1Var.f40580a.d();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else if (i10 == 8 && editable.length() > 0) {
                        zg1Var.H0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                zg1 zg1Var2 = this.f39451b;
                if (zg1Var2.F) {
                    if (zg1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(zg1Var2.E, true, 0.1f, true);
                        return;
                    } else if (zg1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(zg1Var2.E, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f39450a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f39450a;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
