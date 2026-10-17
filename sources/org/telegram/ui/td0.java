package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class td0 implements TextWatcher {
    public final int f41659a = 0;
    public boolean f41660b;
    public final ViewGroup f41661c;

    public td0(rg.v2 v2Var) {
        this.f41661c = v2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f41659a) {
            case 0:
                ud0 ud0Var = (ud0) this.f41661c;
                if (this.f41660b) {
                    if (ud0Var.f41959f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (ud0Var.f41965y) {
                            ud0Var.f41959f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(ud0Var.f41959f, true, 0.1f, true);
                        return;
                    } else if (ud0Var.f41959f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ud0Var.f41959f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                rg.v2 v2Var = (rg.v2) this.f41661c;
                rg.u2 u2Var = v2Var.f45687q0;
                if (this.f41660b && v2Var.f45693w0 > 0 && v2Var.f45694x0 > 0 && !v2Var.f45696z0 && u2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = u2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * v2Var.getBaseFontSize()), v2Var.f45694x0, v2Var.f45693w0)) != v2Var.getBaseFontSize()) {
                        v2Var.setBaseFontSize(clamp);
                        Runnable runnable = v2Var.f45695y0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                v2Var.s();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        switch (this.f41659a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f41660b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f41659a;
    }

    public td0(ud0 ud0Var, boolean z10) {
        this.f41661c = ud0Var;
        this.f41660b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
