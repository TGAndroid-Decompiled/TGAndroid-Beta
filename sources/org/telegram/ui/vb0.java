package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
public final class vb0 implements TextWatcher {
    public final int f50633a;
    public boolean f50634b;
    public final View f50635c;

    public vb0(int i7, View view) {
        this.f50633a = i7;
        this.f50635c = view;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        int j3;
        int i10 = this.f50633a;
        View view = this.f50635c;
        switch (i10) {
            case 0:
                wb0 wb0Var = (wb0) view;
                if (this.f50634b) {
                    if (wb0Var.f51018f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (wb0Var.D) {
                            wb0Var.f51018f.callOnClick();
                        }
                        org.telegram.messenger.g0.Z3(wb0Var.f51018f, true, 0.1f, true, true);
                        return;
                    } else if (wb0Var.f51018f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(wb0Var.f51018f, false, 0.1f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                boolean isEmpty = TextUtils.isEmpty(editable);
                if (isEmpty != this.f50634b) {
                    TextView textView = (TextView) view;
                    this.f50634b = isEmpty;
                    if (isEmpty) {
                        i7 = 2131746321;
                    } else {
                        i7 = 2131754486;
                    }
                    textView.setText(org.telegram.messenger.id.M0(i7, null));
                    return;
                }
                return;
            case 2:
                tg.k2 k2Var = (tg.k2) view;
                tg.j2 j2Var = k2Var.f55820q0;
                if (this.f50634b && k2Var.f55826w0 > 0 && k2Var.f55827x0 > 0 && !k2Var.f55829z0 && j2Var.getLayout() != null) {
                    float f10 = org.telegram.messenger.g0.f22563q.y / 3.0f;
                    float height = j2Var.getLayout().getHeight();
                    if (height > f10 && (j3 = Utilities.j((int) ((f10 / height) * k2Var.getBaseFontSize()), k2Var.f55827x0, k2Var.f55826w0)) != k2Var.getBaseFontSize()) {
                        k2Var.setBaseFontSize(j3);
                        Runnable runnable = k2Var.f55828y0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                k2Var.s();
                return;
            default:
                zh.n1 n1Var = (zh.n1) view;
                if (!this.f50634b && editable.length() > 12) {
                    this.f50634b = true;
                    editable.delete(12, editable.length());
                    org.telegram.messenger.g0.F3(n1Var);
                    try {
                        n1Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.f50634b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z9;
        switch (this.f50633a) {
            case 0:
            case 1:
                return;
            case 2:
                if (i11 > 3) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f50634b = z9;
                return;
            default:
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f50633a;
    }

    public vb0(kg.x0 x0Var, TextView textView) {
        this.f50633a = 1;
        this.f50635c = textView;
        this.f50634b = TextUtils.isEmpty(x0Var.getText());
    }

    public vb0(wb0 wb0Var, boolean z9) {
        this.f50633a = 0;
        this.f50635c = wb0Var;
        this.f50634b = z9;
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
