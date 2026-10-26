package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class td0 implements TextWatcher {
    public final int f43809a = 0;
    public boolean f43810b;
    public final ViewGroup f43811c;

    public td0(sg.x2 x2Var) {
        this.f43811c = x2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f43809a) {
            case 0:
                ud0 ud0Var = (ud0) this.f43811c;
                if (this.f43810b) {
                    if (ud0Var.f44105f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (ud0Var.f44111y) {
                            ud0Var.f44105f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(ud0Var.f44105f, true, 0.1f, true);
                        return;
                    } else if (ud0Var.f44105f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ud0Var.f44105f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                sg.x2 x2Var = (sg.x2) this.f43811c;
                sg.w2 w2Var = x2Var.f48563q0;
                if (this.f43810b && x2Var.f48569w0 > 0 && x2Var.f48570x0 > 0 && !x2Var.f48572z0 && w2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = w2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * x2Var.getBaseFontSize()), x2Var.f48570x0, x2Var.f48569w0)) != x2Var.getBaseFontSize()) {
                        x2Var.setBaseFontSize(clamp);
                        Runnable runnable = x2Var.f48571y0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                x2Var.s();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        switch (this.f43809a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f43810b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f43809a;
    }

    public td0(ud0 ud0Var, boolean z10) {
        this.f43811c = ud0Var;
        this.f43810b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
