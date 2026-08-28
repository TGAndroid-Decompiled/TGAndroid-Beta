package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class xf1 implements TextWatcher {
    public final int f44513a;
    public final ag1 f44514b;

    public xf1(ag1 ag1Var, int i9) {
        this.f44513a = i9;
        this.f44514b = ag1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.mi0 mi0Var;
        switch (this.f44513a) {
            case 0:
                this.f44514b.getClass();
                return;
            case 1:
                ag1 ag1Var = this.f44514b;
                if (!ag1Var.I) {
                    int i9 = ag1Var.K;
                    if (i9 == 0) {
                        org.telegram.ui.Components.mi0 animatedDrawable = ag1Var.f36481a.getAnimatedDrawable();
                        if (ag1Var.f36492n.length() > 0) {
                            if (ag1Var.f36492n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.mi0[] mi0VarArr = ag1Var.f36484b0;
                                if (animatedDrawable != mi0VarArr[3] && animatedDrawable != (mi0Var = mi0VarArr[5])) {
                                    ag1Var.f36481a.setAnimation(mi0Var);
                                    ag1Var.f36484b0[5].Q(0.0f, false);
                                    ag1Var.f36481a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.mi0[] mi0VarArr2 = ag1Var.f36484b0;
                            if (animatedDrawable != mi0VarArr2[3]) {
                                org.telegram.ui.Components.mi0 mi0Var2 = mi0VarArr2[2];
                                if (animatedDrawable != mi0Var2) {
                                    ag1Var.f36481a.setAnimation(mi0Var2);
                                    ag1Var.f36484b0[2].N(49);
                                    ag1Var.f36484b0[2].Q(0.0f, false);
                                    ag1Var.f36481a.d();
                                    return;
                                } else if (mi0Var2.X < 49) {
                                    mi0Var2.N(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != ag1Var.f36484b0[3] || ag1Var.f36492n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.mi0[] mi0VarArr3 = ag1Var.f36484b0;
                            if (animatedDrawable != mi0VarArr3[5]) {
                                mi0VarArr3[2].N(-1);
                                org.telegram.ui.Components.mi0 mi0Var3 = ag1Var.f36484b0[2];
                                if (animatedDrawable != mi0Var3) {
                                    ag1Var.f36481a.setAnimation(mi0Var3);
                                    ag1Var.f36484b0[2].L(49, false, false);
                                }
                                ag1Var.f36481a.d();
                                return;
                            }
                        }
                        ag1Var.f36481a.setAnimation(ag1Var.f36484b0[4]);
                        ag1Var.f36484b0[4].Q(0.0f, false);
                        ag1Var.f36481a.d();
                        return;
                    } else if (i9 == 1) {
                        try {
                            ag1Var.f36484b0[6].N((int) ((Math.min(1.0f, ag1Var.f36492n.getLayout().getLineWidth(0) / ag1Var.f36492n.getWidth()) * 142.0f) + 18.0f));
                            ag1Var.f36481a.d();
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    } else if (i9 == 8 && editable.length() > 0) {
                        ag1Var.G0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                ag1 ag1Var2 = this.f44514b;
                if (ag1Var2.B) {
                    if (ag1Var2.A.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ag1Var2.A, true, 0.1f, true);
                        return;
                    } else if (ag1Var2.A.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ag1Var2.A, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.f44513a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.f44513a;
    }

    private final void a(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
