package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public final class wf1 implements TextWatcher {

    public final int f44111a;

    public final zf1 f44112b;

    public wf1(zf1 zf1Var, int i10) {
        this.f44111a = i10;
        this.f44112b = zf1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.oi0 oi0Var;
        switch (this.f44111a) {
            case 0:
                this.f44112b.getClass();
                break;
            case 1:
                zf1 zf1Var = this.f44112b;
                if (!zf1Var.I) {
                    int i10 = zf1Var.K;
                    if (i10 == 0) {
                        org.telegram.ui.Components.oi0 animatedDrawable = zf1Var.f45161a.getAnimatedDrawable();
                        if (zf1Var.f45172n.length() <= 0) {
                            if (animatedDrawable != zf1Var.f45164b0[3] || zf1Var.f45172n.getTransformationMethod() != null) {
                                org.telegram.ui.Components.oi0[] oi0VarArr = zf1Var.f45164b0;
                                if (animatedDrawable != oi0VarArr[5]) {
                                    oi0VarArr[2].N(-1);
                                    org.telegram.ui.Components.oi0 oi0Var2 = zf1Var.f45164b0[2];
                                    if (animatedDrawable != oi0Var2) {
                                        zf1Var.f45161a.setAnimation(oi0Var2);
                                        zf1Var.f45164b0[2].L(49, false, false);
                                    }
                                    zf1Var.f45161a.d();
                                }
                            }
                            zf1Var.f45161a.setAnimation(zf1Var.f45164b0[4]);
                            zf1Var.f45164b0[4].Q(0.0f, false);
                            zf1Var.f45161a.d();
                            break;
                        } else if (zf1Var.f45172n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.oi0[] oi0VarArr2 = zf1Var.f45164b0;
                            if (animatedDrawable != oi0VarArr2[3]) {
                                org.telegram.ui.Components.oi0 oi0Var3 = oi0VarArr2[2];
                                if (animatedDrawable != oi0Var3) {
                                    zf1Var.f45161a.setAnimation(oi0Var3);
                                    zf1Var.f45164b0[2].N(49);
                                    zf1Var.f45164b0[2].Q(0.0f, false);
                                    zf1Var.f45161a.d();
                                } else if (oi0Var3.X < 49) {
                                    oi0Var3.N(49);
                                }
                            }
                            break;
                        } else {
                            org.telegram.ui.Components.oi0[] oi0VarArr3 = zf1Var.f45164b0;
                            if (animatedDrawable != oi0VarArr3[3] && animatedDrawable != (oi0Var = oi0VarArr3[5])) {
                                zf1Var.f45161a.setAnimation(oi0Var);
                                zf1Var.f45164b0[5].Q(0.0f, false);
                                zf1Var.f45161a.d();
                                break;
                            }
                        }
                    } else if (i10 == 1) {
                        try {
                            zf1Var.f45164b0[6].N((int) ((Math.min(1.0f, zf1Var.f45172n.getLayout().getLineWidth(0) / zf1Var.f45172n.getWidth()) * 142.0f) + 18.0f));
                            zf1Var.f45161a.d();
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            return;
                        }
                        break;
                    } else if (i10 == 8 && editable.length() > 0) {
                        zf1Var.H0(true);
                        break;
                    }
                }
                break;
            default:
                zf1 zf1Var2 = this.f44112b;
                if (zf1Var2.B) {
                    if (zf1Var2.A.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(zf1Var2.A, true, 0.1f, true);
                        break;
                    } else if (zf1Var2.A.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(zf1Var2.A, false, 0.1f, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f44111a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f44111a;
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
