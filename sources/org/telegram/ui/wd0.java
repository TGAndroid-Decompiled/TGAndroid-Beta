package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class wd0 implements TextWatcher {
    public final int f43010a = 0;
    public boolean f43011b;
    public final ViewGroup f43012c;

    public wd0(rg.w2 w2Var) {
        this.f43012c = w2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f43010a) {
            case 0:
                xd0 xd0Var = (xd0) this.f43012c;
                if (this.f43011b) {
                    if (xd0Var.f43576f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (xd0Var.f43582y) {
                            xd0Var.f43576f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(xd0Var.f43576f, true, 0.1f, true);
                        return;
                    } else if (xd0Var.f43576f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(xd0Var.f43576f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                rg.w2 w2Var = (rg.w2) this.f43012c;
                rg.v2 v2Var = w2Var.f46111q0;
                if (this.f43011b && w2Var.f46117w0 > 0 && w2Var.f46118x0 > 0 && !w2Var.f46120z0 && v2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = v2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * w2Var.getBaseFontSize()), w2Var.f46118x0, w2Var.f46117w0)) != w2Var.getBaseFontSize()) {
                        w2Var.setBaseFontSize(clamp);
                        Runnable runnable = w2Var.f46119y0;
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
        switch (this.f43010a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f43011b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f43010a;
    }

    public wd0(xd0 xd0Var, boolean z10) {
        this.f43012c = xd0Var;
        this.f43011b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
