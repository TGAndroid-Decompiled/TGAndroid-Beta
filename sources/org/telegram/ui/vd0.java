package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class vd0 implements TextWatcher {
    public final int f44319a = 0;
    public boolean f44320b;
    public final ViewGroup f44321c;

    public vd0(sg.w2 w2Var) {
        this.f44321c = w2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int clamp;
        switch (this.f44319a) {
            case 0:
                wd0 wd0Var = (wd0) this.f44321c;
                if (this.f44320b) {
                    if (wd0Var.f44640f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (wd0Var.f44646y) {
                            wd0Var.f44640f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(wd0Var.f44640f, true, 0.1f, true);
                        return;
                    } else if (wd0Var.f44640f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(wd0Var.f44640f, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                sg.w2 w2Var = (sg.w2) this.f44321c;
                sg.v2 v2Var = w2Var.f48588q0;
                if (this.f44320b && w2Var.f48594w0 > 0 && w2Var.f48595x0 > 0 && !w2Var.f48597z0 && v2Var.getLayout() != null) {
                    float f7 = AndroidUtilities.displaySize.y / 3.0f;
                    float height = v2Var.getLayout().getHeight();
                    if (height > f7 && (clamp = Utilities.clamp((int) ((f7 / height) * w2Var.getBaseFontSize()), w2Var.f48595x0, w2Var.f48594w0)) != w2Var.getBaseFontSize()) {
                        w2Var.setBaseFontSize(clamp);
                        Runnable runnable = w2Var.f48596y0;
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
        switch (this.f44319a) {
            case 0:
                return;
            default:
                if (i12 > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f44320b = z10;
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f44319a;
    }

    public vd0(wd0 wd0Var, boolean z10) {
        this.f44321c = wd0Var;
        this.f44320b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
