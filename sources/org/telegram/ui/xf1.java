package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class xf1 implements TextWatcher {
    public final int f43599a;
    public final ag1 f43600b;

    public xf1(ag1 ag1Var, int i10) {
        this.f43599a = i10;
        this.f43600b = ag1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.xj0 xj0Var;
        switch (this.f43599a) {
            case 0:
                this.f43600b.getClass();
                return;
            case 1:
                ag1 ag1Var = this.f43600b;
                if (!ag1Var.M) {
                    int i10 = ag1Var.O;
                    if (i10 == 0) {
                        org.telegram.ui.Components.xj0 animatedDrawable = ag1Var.f35758a.getAnimatedDrawable();
                        if (ag1Var.f35772n.length() > 0) {
                            if (ag1Var.f35772n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.xj0[] xj0VarArr = ag1Var.f35767f0;
                                if (animatedDrawable != xj0VarArr[3] && animatedDrawable != (xj0Var = xj0VarArr[5])) {
                                    ag1Var.f35758a.setAnimation(xj0Var);
                                    ag1Var.f35767f0[5].T(0.0f, false);
                                    ag1Var.f35758a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.xj0[] xj0VarArr2 = ag1Var.f35767f0;
                            if (animatedDrawable != xj0VarArr2[3]) {
                                org.telegram.ui.Components.xj0 xj0Var2 = xj0VarArr2[2];
                                if (animatedDrawable != xj0Var2) {
                                    ag1Var.f35758a.setAnimation(xj0Var2);
                                    ag1Var.f35767f0[2].P(49);
                                    ag1Var.f35767f0[2].T(0.0f, false);
                                    ag1Var.f35758a.d();
                                    return;
                                } else if (xj0Var2.f32594a0 < 49) {
                                    xj0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != ag1Var.f35767f0[3] || ag1Var.f35772n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.xj0[] xj0VarArr3 = ag1Var.f35767f0;
                            if (animatedDrawable != xj0VarArr3[5]) {
                                xj0VarArr3[2].P(-1);
                                org.telegram.ui.Components.xj0 xj0Var3 = ag1Var.f35767f0[2];
                                if (animatedDrawable != xj0Var3) {
                                    ag1Var.f35758a.setAnimation(xj0Var3);
                                    ag1Var.f35767f0[2].N(49, false, false);
                                }
                                ag1Var.f35758a.d();
                                return;
                            }
                        }
                        ag1Var.f35758a.setAnimation(ag1Var.f35767f0[4]);
                        ag1Var.f35767f0[4].T(0.0f, false);
                        ag1Var.f35758a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            ag1Var.f35767f0[6].P((int) ((Math.min(1.0f, ag1Var.f35772n.getLayout().getLineWidth(0) / ag1Var.f35772n.getWidth()) * 142.0f) + 18.0f));
                            ag1Var.f35758a.d();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else if (i10 == 8 && editable.length() > 0) {
                        ag1Var.H0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                ag1 ag1Var2 = this.f43600b;
                if (ag1Var2.F) {
                    if (ag1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ag1Var2.E, true, 0.1f, true);
                        return;
                    } else if (ag1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ag1Var2.E, false, 0.1f, true);
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
        int i13 = this.f43599a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f43599a;
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
