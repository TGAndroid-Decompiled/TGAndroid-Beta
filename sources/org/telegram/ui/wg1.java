package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class wg1 implements TextWatcher {
    public final int f39362a;
    public final zg1 f39363b;

    public wg1(zg1 zg1Var, int i10) {
        this.f39362a = i10;
        this.f39363b = zg1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.ij0 ij0Var;
        switch (this.f39362a) {
            case 0:
                this.f39363b.getClass();
                return;
            case 1:
                zg1 zg1Var = this.f39363b;
                if (!zg1Var.M) {
                    int i10 = zg1Var.O;
                    if (i10 == 0) {
                        org.telegram.ui.Components.ij0 animatedDrawable = zg1Var.f40471a.getAnimatedDrawable();
                        if (zg1Var.f40485n.length() > 0) {
                            if (zg1Var.f40485n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.ij0[] ij0VarArr = zg1Var.f40480f0;
                                if (animatedDrawable != ij0VarArr[3] && animatedDrawable != (ij0Var = ij0VarArr[5])) {
                                    zg1Var.f40471a.setAnimation(ij0Var);
                                    zg1Var.f40480f0[5].T(0.0f, false);
                                    zg1Var.f40471a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.ij0[] ij0VarArr2 = zg1Var.f40480f0;
                            if (animatedDrawable != ij0VarArr2[3]) {
                                org.telegram.ui.Components.ij0 ij0Var2 = ij0VarArr2[2];
                                if (animatedDrawable != ij0Var2) {
                                    zg1Var.f40471a.setAnimation(ij0Var2);
                                    zg1Var.f40480f0[2].P(49);
                                    zg1Var.f40480f0[2].T(0.0f, false);
                                    zg1Var.f40471a.d();
                                    return;
                                } else if (ij0Var2.f25069a0 < 49) {
                                    ij0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != zg1Var.f40480f0[3] || zg1Var.f40485n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.ij0[] ij0VarArr3 = zg1Var.f40480f0;
                            if (animatedDrawable != ij0VarArr3[5]) {
                                ij0VarArr3[2].P(-1);
                                org.telegram.ui.Components.ij0 ij0Var3 = zg1Var.f40480f0[2];
                                if (animatedDrawable != ij0Var3) {
                                    zg1Var.f40471a.setAnimation(ij0Var3);
                                    zg1Var.f40480f0[2].N(49, false, false);
                                }
                                zg1Var.f40471a.d();
                                return;
                            }
                        }
                        zg1Var.f40471a.setAnimation(zg1Var.f40480f0[4]);
                        zg1Var.f40480f0[4].T(0.0f, false);
                        zg1Var.f40471a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            zg1Var.f40480f0[6].P((int) ((Math.min(1.0f, zg1Var.f40485n.getLayout().getLineWidth(0) / zg1Var.f40485n.getWidth()) * 142.0f) + 18.0f));
                            zg1Var.f40471a.d();
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
                zg1 zg1Var2 = this.f39363b;
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
        int i13 = this.f39362a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f39362a;
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
