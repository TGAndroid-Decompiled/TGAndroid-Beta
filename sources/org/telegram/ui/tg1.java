package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class tg1 implements TextWatcher {
    public final int f38515a;
    public final wg1 f38516b;

    public tg1(wg1 wg1Var, int i10) {
        this.f38515a = i10;
        this.f38516b = wg1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.gj0 gj0Var;
        switch (this.f38515a) {
            case 0:
                this.f38516b.getClass();
                return;
            case 1:
                wg1 wg1Var = this.f38516b;
                if (!wg1Var.J) {
                    int i10 = wg1Var.L;
                    if (i10 == 0) {
                        org.telegram.ui.Components.gj0 animatedDrawable = wg1Var.f39681a.getAnimatedDrawable();
                        if (wg1Var.f39692n.length() > 0) {
                            if (wg1Var.f39692n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.gj0[] gj0VarArr = wg1Var.f39686c0;
                                if (animatedDrawable != gj0VarArr[3] && animatedDrawable != (gj0Var = gj0VarArr[5])) {
                                    wg1Var.f39681a.setAnimation(gj0Var);
                                    wg1Var.f39686c0[5].Q(0.0f, false);
                                    wg1Var.f39681a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.gj0[] gj0VarArr2 = wg1Var.f39686c0;
                            if (animatedDrawable != gj0VarArr2[3]) {
                                org.telegram.ui.Components.gj0 gj0Var2 = gj0VarArr2[2];
                                if (animatedDrawable != gj0Var2) {
                                    wg1Var.f39681a.setAnimation(gj0Var2);
                                    wg1Var.f39686c0[2].N(49);
                                    wg1Var.f39686c0[2].Q(0.0f, false);
                                    wg1Var.f39681a.d();
                                    return;
                                } else if (gj0Var2.Y < 49) {
                                    gj0Var2.N(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != wg1Var.f39686c0[3] || wg1Var.f39692n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.gj0[] gj0VarArr3 = wg1Var.f39686c0;
                            if (animatedDrawable != gj0VarArr3[5]) {
                                gj0VarArr3[2].N(-1);
                                org.telegram.ui.Components.gj0 gj0Var3 = wg1Var.f39686c0[2];
                                if (animatedDrawable != gj0Var3) {
                                    wg1Var.f39681a.setAnimation(gj0Var3);
                                    wg1Var.f39686c0[2].L(49, false, false);
                                }
                                wg1Var.f39681a.d();
                                return;
                            }
                        }
                        wg1Var.f39681a.setAnimation(wg1Var.f39686c0[4]);
                        wg1Var.f39686c0[4].Q(0.0f, false);
                        wg1Var.f39681a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            wg1Var.f39686c0[6].N((int) ((Math.min(1.0f, wg1Var.f39692n.getLayout().getLineWidth(0) / wg1Var.f39692n.getWidth()) * 142.0f) + 18.0f));
                            wg1Var.f39681a.d();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else if (i10 == 8 && editable.length() > 0) {
                        wg1Var.H0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                wg1 wg1Var2 = this.f38516b;
                if (wg1Var2.C) {
                    if (wg1Var2.B.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(wg1Var2.B, true, 0.1f, true);
                        return;
                    } else if (wg1Var2.B.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(wg1Var2.B, false, 0.1f, true);
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
        int i13 = this.f38515a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f38515a;
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
