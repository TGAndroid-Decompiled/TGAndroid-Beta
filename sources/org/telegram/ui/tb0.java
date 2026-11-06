package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
public final class tb0 implements TextWatcher {
    public final int f49989a;
    public boolean f49990b;
    public final View f49991c;

    public tb0(int i7, View view) {
        this.f49989a = i7;
        this.f49991c = view;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        int j3;
        int i10 = this.f49989a;
        View view = this.f49991c;
        switch (i10) {
            case 0:
                ub0 ub0Var = (ub0) view;
                if (this.f49990b) {
                    if (ub0Var.f50359f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (ub0Var.D) {
                            ub0Var.f50359f.callOnClick();
                        }
                        org.telegram.messenger.g0.Z3(ub0Var.f50359f, true, 0.1f, true, true);
                        return;
                    } else if (ub0Var.f50359f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(ub0Var.f50359f, false, 0.1f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                boolean isEmpty = TextUtils.isEmpty(editable);
                if (isEmpty != this.f49990b) {
                    TextView textView = (TextView) view;
                    this.f49990b = isEmpty;
                    if (isEmpty) {
                        i7 = 2131746320;
                    } else {
                        i7 = 2131754486;
                    }
                    textView.setText(org.telegram.messenger.hd.M0(i7, null));
                    return;
                }
                return;
            case 2:
                tg.k2 k2Var = (tg.k2) view;
                tg.j2 j2Var = k2Var.f55691q0;
                if (this.f49990b && k2Var.f55697w0 > 0 && k2Var.f55698x0 > 0 && !k2Var.f55700z0 && j2Var.getLayout() != null) {
                    float f10 = org.telegram.messenger.g0.f22537q.y / 3.0f;
                    float height = j2Var.getLayout().getHeight();
                    if (height > f10 && (j3 = Utilities.j((int) ((f10 / height) * k2Var.getBaseFontSize()), k2Var.f55698x0, k2Var.f55697w0)) != k2Var.getBaseFontSize()) {
                        k2Var.setBaseFontSize(j3);
                        Runnable runnable = k2Var.f55699y0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                k2Var.s();
                return;
            default:
                zh.o1 o1Var = (zh.o1) view;
                if (!this.f49990b && editable.length() > 12) {
                    this.f49990b = true;
                    editable.delete(12, editable.length());
                    org.telegram.messenger.g0.F3(o1Var);
                    try {
                        o1Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.f49990b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z9;
        switch (this.f49989a) {
            case 0:
            case 1:
                return;
            case 2:
                if (i11 > 3) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f49990b = z9;
                return;
            default:
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f49989a;
    }

    public tb0(kg.x0 x0Var, TextView textView) {
        this.f49989a = 1;
        this.f49991c = textView;
        this.f49990b = TextUtils.isEmpty(x0Var.getText());
    }

    public tb0(ub0 ub0Var, boolean z9) {
        this.f49989a = 0;
        this.f49991c = ub0Var;
        this.f49990b = z9;
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
