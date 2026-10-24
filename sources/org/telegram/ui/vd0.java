package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class vd0 implements TextWatcher {
    public final int f42704a = 0;
    public boolean f42705b;
    public final ViewGroup f42706c;

    public vd0(rg.w2 w2Var) {
        this.f42706c = w2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f42704a) {
            case 0:
                wd0 wd0Var = (wd0) this.f42706c;
                if (this.f42705b) {
                    if (wd0Var.f42999f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (wd0Var.f43005y) {
                            wd0Var.f42999f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(wd0Var.f42999f, true, 0.1f, true);
                        return;
                    } else if (wd0Var.f42999f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(wd0Var.f42999f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                rg.w2 w2Var = (rg.w2) this.f42706c;
                rg.v2 v2Var = w2Var.f46110q0;
                if (this.f42705b && w2Var.f46116w0 > 0 && w2Var.f46117x0 > 0 && !w2Var.f46119z0 && v2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = v2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * w2Var.getBaseFontSize()), w2Var.f46117x0, w2Var.f46116w0)) != w2Var.getBaseFontSize()) {
                        w2Var.setBaseFontSize(clamp);
                        Runnable runnable = w2Var.f46118y0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                w2Var.s();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        switch (this.f42704a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f42705b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f42704a;
    }

    public vd0(wd0 wd0Var, boolean z10) {
        this.f42706c = wd0Var;
        this.f42705b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
