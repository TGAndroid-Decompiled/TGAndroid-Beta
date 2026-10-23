package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class yf1 implements TextWatcher {
    public final int f43847a;
    public final bg1 f43848b;

    public yf1(bg1 bg1Var, int i10) {
        this.f43847a = i10;
        this.f43848b = bg1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.yj0 yj0Var;
        switch (this.f43847a) {
            case 0:
                this.f43848b.getClass();
                return;
            case 1:
                bg1 bg1Var = this.f43848b;
                if (!bg1Var.M) {
                    int i10 = bg1Var.O;
                    if (i10 == 0) {
                        org.telegram.ui.Components.yj0 animatedDrawable = bg1Var.f36080a.getAnimatedDrawable();
                        if (bg1Var.f36094n.length() > 0) {
                            if (bg1Var.f36094n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.yj0[] yj0VarArr = bg1Var.f36089f0;
                                if (animatedDrawable != yj0VarArr[3] && animatedDrawable != (yj0Var = yj0VarArr[5])) {
                                    bg1Var.f36080a.setAnimation(yj0Var);
                                    bg1Var.f36089f0[5].T(0.0f, false);
                                    bg1Var.f36080a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.yj0[] yj0VarArr2 = bg1Var.f36089f0;
                            if (animatedDrawable != yj0VarArr2[3]) {
                                org.telegram.ui.Components.yj0 yj0Var2 = yj0VarArr2[2];
                                if (animatedDrawable != yj0Var2) {
                                    bg1Var.f36080a.setAnimation(yj0Var2);
                                    bg1Var.f36089f0[2].P(49);
                                    bg1Var.f36089f0[2].T(0.0f, false);
                                    bg1Var.f36080a.d();
                                    return;
                                } else if (yj0Var2.f32933a0 < 49) {
                                    yj0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != bg1Var.f36089f0[3] || bg1Var.f36094n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.yj0[] yj0VarArr3 = bg1Var.f36089f0;
                            if (animatedDrawable != yj0VarArr3[5]) {
                                yj0VarArr3[2].P(-1);
                                org.telegram.ui.Components.yj0 yj0Var3 = bg1Var.f36089f0[2];
                                if (animatedDrawable != yj0Var3) {
                                    bg1Var.f36080a.setAnimation(yj0Var3);
                                    bg1Var.f36089f0[2].N(49, false, false);
                                }
                                bg1Var.f36080a.d();
                                return;
                            }
                        }
                        bg1Var.f36080a.setAnimation(bg1Var.f36089f0[4]);
                        bg1Var.f36089f0[4].T(0.0f, false);
                        bg1Var.f36080a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            bg1Var.f36089f0[6].P((int) ((Math.min(1.0f, bg1Var.f36094n.getLayout().getLineWidth(0) / bg1Var.f36094n.getWidth()) * 142.0f) + 18.0f));
                            bg1Var.f36080a.d();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else if (i10 == 8 && editable.length() > 0) {
                        bg1Var.H0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                bg1 bg1Var2 = this.f43848b;
                if (bg1Var2.F) {
                    if (bg1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(bg1Var2.E, true, 0.1f, true);
                        return;
                    } else if (bg1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(bg1Var2.E, false, 0.1f, true);
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
        int i13 = this.f43847a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f43847a;
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
