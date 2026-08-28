package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ud0 implements TextWatcher {
    public final int f43221a = 0;
    public boolean f43222b;
    public final ViewGroup f43223c;

    public ud0(yf.v2 v2Var) {
        this.f43223c = v2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f43221a) {
            case 0:
                vd0 vd0Var = (vd0) this.f43223c;
                if (this.f43222b) {
                    if (vd0Var.f43450f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (vd0Var.f43456y) {
                            vd0Var.f43450f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(vd0Var.f43450f, true, 0.1f, true);
                        return;
                    } else if (vd0Var.f43450f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(vd0Var.f43450f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                yf.v2 v2Var = (yf.v2) this.f43223c;
                yf.u2 u2Var = v2Var.m0;
                if (this.f43222b && v2Var.f50144s0 > 0 && v2Var.f50145t0 > 0 && !v2Var.f50147v0 && u2Var.getLayout() != null) {
                    float f10 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = u2Var.getLayout().getHeight();
                    if (height > f10 && (clamp = Utilities.clamp((int) ((f10 / height) * v2Var.getBaseFontSize()), v2Var.f50145t0, v2Var.f50144s0)) != v2Var.getBaseFontSize()) {
                        v2Var.setBaseFontSize(clamp);
                        Runnable runnable = v2Var.f50146u0;
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
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        boolean z10;
        switch (this.f43221a) {
            case 0:
                return;
            default:
                if (i11 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f43222b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.f43221a;
    }

    public ud0(vd0 vd0Var, boolean z10) {
        this.f43223c = vd0Var;
        this.f43222b = z10;
    }

    private final void a(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
