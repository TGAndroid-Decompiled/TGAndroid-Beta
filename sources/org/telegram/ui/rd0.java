package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class rd0 implements TextWatcher {
    public final int f41130a = 0;
    public boolean f41131b;
    public final ViewGroup f41132c;

    public rd0(rg.v2 v2Var) {
        this.f41132c = v2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f41130a) {
            case 0:
                sd0 sd0Var = (sd0) this.f41132c;
                if (this.f41131b) {
                    if (sd0Var.f41435f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (sd0Var.f41441y) {
                            sd0Var.f41435f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(sd0Var.f41435f, true, 0.1f, true);
                        return;
                    } else if (sd0Var.f41435f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(sd0Var.f41435f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                rg.v2 v2Var = (rg.v2) this.f41132c;
                rg.u2 u2Var = v2Var.f45659q0;
                if (this.f41131b && v2Var.f45665w0 > 0 && v2Var.f45666x0 > 0 && !v2Var.f45668z0 && u2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = u2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * v2Var.getBaseFontSize()), v2Var.f45666x0, v2Var.f45665w0)) != v2Var.getBaseFontSize()) {
                        v2Var.setBaseFontSize(clamp);
                        Runnable runnable = v2Var.f45667y0;
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
        switch (this.f41130a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f41131b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f41130a;
    }

    public rd0(sd0 sd0Var, boolean z10) {
        this.f41132c = sd0Var;
        this.f41131b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
