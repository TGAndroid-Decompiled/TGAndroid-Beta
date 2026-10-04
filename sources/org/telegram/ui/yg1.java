package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class yg1 implements TextWatcher {
    public final int f43223a;
    public final bh1 f43224b;

    public yg1(bh1 bh1Var, int i10) {
        this.f43223a = i10;
        this.f43224b = bh1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.kj0 kj0Var;
        switch (this.f43223a) {
            case 0:
                this.f43224b.getClass();
                return;
            case 1:
                bh1 bh1Var = this.f43224b;
                if (!bh1Var.M) {
                    int i10 = bh1Var.O;
                    if (i10 == 0) {
                        org.telegram.ui.Components.kj0 animatedDrawable = bh1Var.f35094a.getAnimatedDrawable();
                        if (bh1Var.f35109n.length() > 0) {
                            if (bh1Var.f35109n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.kj0[] kj0VarArr = bh1Var.f35104f0;
                                if (animatedDrawable != kj0VarArr[3] && animatedDrawable != (kj0Var = kj0VarArr[5])) {
                                    bh1Var.f35094a.setAnimation(kj0Var);
                                    bh1Var.f35104f0[5].T(0.0f, false);
                                    bh1Var.f35094a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.kj0[] kj0VarArr2 = bh1Var.f35104f0;
                            if (animatedDrawable != kj0VarArr2[3]) {
                                org.telegram.ui.Components.kj0 kj0Var2 = kj0VarArr2[2];
                                if (animatedDrawable != kj0Var2) {
                                    bh1Var.f35094a.setAnimation(kj0Var2);
                                    bh1Var.f35104f0[2].P(49);
                                    bh1Var.f35104f0[2].T(0.0f, false);
                                    bh1Var.f35094a.d();
                                    return;
                                } else if (kj0Var2.f28124a0 < 49) {
                                    kj0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != bh1Var.f35104f0[3] || bh1Var.f35109n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.kj0[] kj0VarArr3 = bh1Var.f35104f0;
                            if (animatedDrawable != kj0VarArr3[5]) {
                                kj0VarArr3[2].P(-1);
                                org.telegram.ui.Components.kj0 kj0Var3 = bh1Var.f35104f0[2];
                                if (animatedDrawable != kj0Var3) {
                                    bh1Var.f35094a.setAnimation(kj0Var3);
                                    bh1Var.f35104f0[2].N(49, false, false);
                                }
                                bh1Var.f35094a.d();
                                return;
                            }
                        }
                        bh1Var.f35094a.setAnimation(bh1Var.f35104f0[4]);
                        bh1Var.f35104f0[4].T(0.0f, false);
                        bh1Var.f35094a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            bh1Var.f35104f0[6].P((int) ((Math.min(1.0f, bh1Var.f35109n.getLayout().getLineWidth(0) / bh1Var.f35109n.getWidth()) * 142.0f) + 18.0f));
                            bh1Var.f35094a.d();
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    } else if (i10 == 8 && editable.length() > 0) {
                        bh1Var.H0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                bh1 bh1Var2 = this.f43224b;
                if (bh1Var2.F) {
                    if (bh1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(bh1Var2.E, true, 0.1f, true);
                        return;
                    } else if (bh1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(bh1Var2.E, false, 0.1f, true);
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
        int i13 = this.f43223a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f43223a;
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
