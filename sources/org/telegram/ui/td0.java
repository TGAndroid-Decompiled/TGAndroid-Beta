package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class td0 implements TextWatcher {
    public final int f41650a = 0;
    public boolean f41651b;
    public final ViewGroup f41652c;

    public td0(rg.u2 u2Var) {
        this.f41652c = u2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f41650a) {
            case 0:
                ud0 ud0Var = (ud0) this.f41652c;
                if (this.f41651b) {
                    if (ud0Var.f41933f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (ud0Var.f41939y) {
                            ud0Var.f41933f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(ud0Var.f41933f, true, 0.1f, true);
                        return;
                    } else if (ud0Var.f41933f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ud0Var.f41933f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                rg.u2 u2Var = (rg.u2) this.f41652c;
                rg.t2 t2Var = u2Var.f45658q0;
                if (this.f41651b && u2Var.f45664w0 > 0 && u2Var.f45665x0 > 0 && !u2Var.f45667z0 && t2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = t2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * u2Var.getBaseFontSize()), u2Var.f45665x0, u2Var.f45664w0)) != u2Var.getBaseFontSize()) {
                        u2Var.setBaseFontSize(clamp);
                        Runnable runnable = u2Var.f45666y0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                u2Var.s();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        switch (this.f41650a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f41651b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f41650a;
    }

    public td0(ud0 ud0Var, boolean z10) {
        this.f41652c = ud0Var;
        this.f41651b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
