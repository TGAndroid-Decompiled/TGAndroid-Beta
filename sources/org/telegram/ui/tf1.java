package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class tf1 implements TextWatcher {
    public final int f41742a;
    public final xf1 f41743b;

    public tf1(xf1 xf1Var, int i10) {
        this.f41742a = i10;
        this.f41743b = xf1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.uj0 uj0Var;
        switch (this.f41742a) {
            case 0:
                this.f41743b.getClass();
                return;
            case 1:
                xf1 xf1Var = this.f41743b;
                if (!xf1Var.M) {
                    int i10 = xf1Var.O;
                    if (i10 == 0) {
                        org.telegram.ui.Components.uj0 animatedDrawable = xf1Var.f43112a.getAnimatedDrawable();
                        if (xf1Var.f43126n.length() > 0) {
                            if (xf1Var.f43126n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.uj0[] uj0VarArr = xf1Var.f43121f0;
                                if (animatedDrawable != uj0VarArr[3] && animatedDrawable != (uj0Var = uj0VarArr[5])) {
                                    xf1Var.f43112a.setAnimation(uj0Var);
                                    xf1Var.f43121f0[5].T(0.0f, false);
                                    xf1Var.f43112a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.uj0[] uj0VarArr2 = xf1Var.f43121f0;
                            if (animatedDrawable != uj0VarArr2[3]) {
                                org.telegram.ui.Components.uj0 uj0Var2 = uj0VarArr2[2];
                                if (animatedDrawable != uj0Var2) {
                                    xf1Var.f43112a.setAnimation(uj0Var2);
                                    xf1Var.f43121f0[2].P(49);
                                    xf1Var.f43121f0[2].T(0.0f, false);
                                    xf1Var.f43112a.d();
                                    return;
                                } else if (uj0Var2.f31001a0 < 49) {
                                    uj0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != xf1Var.f43121f0[3] || xf1Var.f43126n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.uj0[] uj0VarArr3 = xf1Var.f43121f0;
                            if (animatedDrawable != uj0VarArr3[5]) {
                                uj0VarArr3[2].P(-1);
                                org.telegram.ui.Components.uj0 uj0Var3 = xf1Var.f43121f0[2];
                                if (animatedDrawable != uj0Var3) {
                                    xf1Var.f43112a.setAnimation(uj0Var3);
                                    xf1Var.f43121f0[2].N(49, false, false);
                                }
                                xf1Var.f43112a.d();
                                return;
                            }
                        }
                        xf1Var.f43112a.setAnimation(xf1Var.f43121f0[4]);
                        xf1Var.f43121f0[4].T(0.0f, false);
                        xf1Var.f43112a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            xf1Var.f43121f0[6].P((int) ((Math.min(1.0f, xf1Var.f43126n.getLayout().getLineWidth(0) / xf1Var.f43126n.getWidth()) * 142.0f) + 18.0f));
                            xf1Var.f43112a.d();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else if (i10 == 8 && editable.length() > 0) {
                        xf1Var.H0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                xf1 xf1Var2 = this.f41743b;
                if (xf1Var2.F) {
                    if (xf1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(xf1Var2.E, true, 0.1f, true);
                        return;
                    } else if (xf1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(xf1Var2.E, false, 0.1f, true);
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
        int i13 = this.f41742a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f41742a;
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
