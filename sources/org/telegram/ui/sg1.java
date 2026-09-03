package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class sg1 implements TextWatcher {
    public final int f41238a;
    public final vg1 f41239b;

    public sg1(vg1 vg1Var, int i10) {
        this.f41238a = i10;
        this.f41239b = vg1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.hj0 hj0Var;
        switch (this.f41238a) {
            case 0:
                this.f41239b.getClass();
                return;
            case 1:
                vg1 vg1Var = this.f41239b;
                if (!vg1Var.J) {
                    int i10 = vg1Var.L;
                    if (i10 == 0) {
                        org.telegram.ui.Components.hj0 animatedDrawable = vg1Var.f42110a.getAnimatedDrawable();
                        if (vg1Var.f42122n.length() > 0) {
                            if (vg1Var.f42122n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.hj0[] hj0VarArr = vg1Var.f42115c0;
                                if (animatedDrawable != hj0VarArr[3] && animatedDrawable != (hj0Var = hj0VarArr[5])) {
                                    vg1Var.f42110a.setAnimation(hj0Var);
                                    vg1Var.f42115c0[5].Q(0.0f, false);
                                    vg1Var.f42110a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.hj0[] hj0VarArr2 = vg1Var.f42115c0;
                            if (animatedDrawable != hj0VarArr2[3]) {
                                org.telegram.ui.Components.hj0 hj0Var2 = hj0VarArr2[2];
                                if (animatedDrawable != hj0Var2) {
                                    vg1Var.f42110a.setAnimation(hj0Var2);
                                    vg1Var.f42115c0[2].N(49);
                                    vg1Var.f42115c0[2].Q(0.0f, false);
                                    vg1Var.f42110a.d();
                                    return;
                                } else if (hj0Var2.Y < 49) {
                                    hj0Var2.N(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != vg1Var.f42115c0[3] || vg1Var.f42122n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.hj0[] hj0VarArr3 = vg1Var.f42115c0;
                            if (animatedDrawable != hj0VarArr3[5]) {
                                hj0VarArr3[2].N(-1);
                                org.telegram.ui.Components.hj0 hj0Var3 = vg1Var.f42115c0[2];
                                if (animatedDrawable != hj0Var3) {
                                    vg1Var.f42110a.setAnimation(hj0Var3);
                                    vg1Var.f42115c0[2].L(49, false, false);
                                }
                                vg1Var.f42110a.d();
                                return;
                            }
                        }
                        vg1Var.f42110a.setAnimation(vg1Var.f42115c0[4]);
                        vg1Var.f42115c0[4].Q(0.0f, false);
                        vg1Var.f42110a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            vg1Var.f42115c0[6].N((int) ((Math.min(1.0f, vg1Var.f42122n.getLayout().getLineWidth(0) / vg1Var.f42122n.getWidth()) * 142.0f) + 18.0f));
                            vg1Var.f42110a.d();
                            return;
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            return;
                        }
                    } else if (i10 == 8 && editable.length() > 0) {
                        vg1Var.H0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                vg1 vg1Var2 = this.f41239b;
                if (vg1Var2.C) {
                    if (vg1Var2.B.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(vg1Var2.B, true, 0.1f, true);
                        return;
                    } else if (vg1Var2.B.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(vg1Var2.B, false, 0.1f, true);
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
        int i13 = this.f41238a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f41238a;
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
