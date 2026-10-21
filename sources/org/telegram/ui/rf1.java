package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class rf1 implements TextWatcher {
    public final int f41211a;
    public final vf1 f41212b;

    public rf1(vf1 vf1Var, int i10) {
        this.f41211a = i10;
        this.f41212b = vf1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.vj0 vj0Var;
        switch (this.f41211a) {
            case 0:
                this.f41212b.getClass();
                return;
            case 1:
                vf1 vf1Var = this.f41212b;
                if (!vf1Var.M) {
                    int i10 = vf1Var.O;
                    if (i10 == 0) {
                        org.telegram.ui.Components.vj0 animatedDrawable = vf1Var.f42230a.getAnimatedDrawable();
                        if (vf1Var.f42244n.length() > 0) {
                            if (vf1Var.f42244n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.vj0[] vj0VarArr = vf1Var.f42239f0;
                                if (animatedDrawable != vj0VarArr[3] && animatedDrawable != (vj0Var = vj0VarArr[5])) {
                                    vf1Var.f42230a.setAnimation(vj0Var);
                                    vf1Var.f42239f0[5].T(0.0f, false);
                                    vf1Var.f42230a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.vj0[] vj0VarArr2 = vf1Var.f42239f0;
                            if (animatedDrawable != vj0VarArr2[3]) {
                                org.telegram.ui.Components.vj0 vj0Var2 = vj0VarArr2[2];
                                if (animatedDrawable != vj0Var2) {
                                    vf1Var.f42230a.setAnimation(vj0Var2);
                                    vf1Var.f42239f0[2].P(49);
                                    vf1Var.f42239f0[2].T(0.0f, false);
                                    vf1Var.f42230a.d();
                                    return;
                                } else if (vj0Var2.f31265a0 < 49) {
                                    vj0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != vf1Var.f42239f0[3] || vf1Var.f42244n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.vj0[] vj0VarArr3 = vf1Var.f42239f0;
                            if (animatedDrawable != vj0VarArr3[5]) {
                                vj0VarArr3[2].P(-1);
                                org.telegram.ui.Components.vj0 vj0Var3 = vf1Var.f42239f0[2];
                                if (animatedDrawable != vj0Var3) {
                                    vf1Var.f42230a.setAnimation(vj0Var3);
                                    vf1Var.f42239f0[2].N(49, false, false);
                                }
                                vf1Var.f42230a.d();
                                return;
                            }
                        }
                        vf1Var.f42230a.setAnimation(vf1Var.f42239f0[4]);
                        vf1Var.f42239f0[4].T(0.0f, false);
                        vf1Var.f42230a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            vf1Var.f42239f0[6].P((int) ((Math.min(1.0f, vf1Var.f42244n.getLayout().getLineWidth(0) / vf1Var.f42244n.getWidth()) * 142.0f) + 18.0f));
                            vf1Var.f42230a.d();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else if (i10 == 8 && editable.length() > 0) {
                        vf1Var.H0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                vf1 vf1Var2 = this.f41212b;
                if (vf1Var2.F) {
                    if (vf1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(vf1Var2.E, true, 0.1f, true);
                        return;
                    } else if (vf1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(vf1Var2.E, false, 0.1f, true);
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
        int i13 = this.f41211a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f41211a;
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
