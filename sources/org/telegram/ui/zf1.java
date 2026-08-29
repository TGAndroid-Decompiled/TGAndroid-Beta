package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class zf1 implements TextWatcher {
    public final int f45208a;
    public final cg1 f45209b;

    public zf1(cg1 cg1Var, int i10) {
        this.f45208a = i10;
        this.f45209b = cg1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.xi0 xi0Var;
        switch (this.f45208a) {
            case 0:
                this.f45209b.getClass();
                return;
            case 1:
                cg1 cg1Var = this.f45209b;
                if (!cg1Var.I) {
                    int i10 = cg1Var.K;
                    if (i10 == 0) {
                        org.telegram.ui.Components.xi0 animatedDrawable = cg1Var.f37104a.getAnimatedDrawable();
                        if (cg1Var.f37115n.length() > 0) {
                            if (cg1Var.f37115n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.xi0[] xi0VarArr = cg1Var.f37107b0;
                                if (animatedDrawable != xi0VarArr[3] && animatedDrawable != (xi0Var = xi0VarArr[5])) {
                                    cg1Var.f37104a.setAnimation(xi0Var);
                                    cg1Var.f37107b0[5].Q(0.0f, false);
                                    cg1Var.f37104a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.xi0[] xi0VarArr2 = cg1Var.f37107b0;
                            if (animatedDrawable != xi0VarArr2[3]) {
                                org.telegram.ui.Components.xi0 xi0Var2 = xi0VarArr2[2];
                                if (animatedDrawable != xi0Var2) {
                                    cg1Var.f37104a.setAnimation(xi0Var2);
                                    cg1Var.f37107b0[2].N(49);
                                    cg1Var.f37107b0[2].Q(0.0f, false);
                                    cg1Var.f37104a.d();
                                    return;
                                } else if (xi0Var2.X < 49) {
                                    xi0Var2.N(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != cg1Var.f37107b0[3] || cg1Var.f37115n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.xi0[] xi0VarArr3 = cg1Var.f37107b0;
                            if (animatedDrawable != xi0VarArr3[5]) {
                                xi0VarArr3[2].N(-1);
                                org.telegram.ui.Components.xi0 xi0Var3 = cg1Var.f37107b0[2];
                                if (animatedDrawable != xi0Var3) {
                                    cg1Var.f37104a.setAnimation(xi0Var3);
                                    cg1Var.f37107b0[2].L(49, false, false);
                                }
                                cg1Var.f37104a.d();
                                return;
                            }
                        }
                        cg1Var.f37104a.setAnimation(cg1Var.f37107b0[4]);
                        cg1Var.f37107b0[4].Q(0.0f, false);
                        cg1Var.f37104a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            cg1Var.f37107b0[6].N((int) ((Math.min(1.0f, cg1Var.f37115n.getLayout().getLineWidth(0) / cg1Var.f37115n.getWidth()) * 142.0f) + 18.0f));
                            cg1Var.f37104a.d();
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    } else if (i10 == 8 && editable.length() > 0) {
                        cg1Var.H0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                cg1 cg1Var2 = this.f45209b;
                if (cg1Var2.B) {
                    if (cg1Var2.A.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(cg1Var2.A, true, 0.1f, true);
                        return;
                    } else if (cg1Var2.A.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(cg1Var2.A, false, 0.1f, true);
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
        int i13 = this.f45208a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f45208a;
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
