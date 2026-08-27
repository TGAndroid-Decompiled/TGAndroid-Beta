package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class xd0 implements TextWatcher {

    public final int f44419a = 0;

    public boolean f44420b;

    public final ViewGroup f44421c;

    public xd0(zf.v2 v2Var) {
        this.f44421c = v2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int iClamp;
        switch (this.f44419a) {
            case 0:
                yd0 yd0Var = (yd0) this.f44421c;
                if (this.f44420b) {
                    if (yd0Var.f44785f.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        if (yd0Var.f44791y) {
                            yd0Var.f44785f.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(yd0Var.f44785f, true, 0.1f, true);
                        break;
                    } else if (yd0Var.f44785f.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(yd0Var.f44785f, false, 0.1f, true);
                        break;
                    }
                }
                break;
            default:
                zf.v2 v2Var = (zf.v2) this.f44421c;
                zf.u2 u2Var = v2Var.m0;
                if (this.f44420b && v2Var.f50739s0 > 0 && v2Var.f50740t0 > 0 && !v2Var.f50742v0 && u2Var.getLayout() != null) {
                    int height = u2Var.getLayout().getHeight();
                    float f10 = AndroidUtilities.displaySize.y / 3.0f;
                    float f11 = height;
                    if (f11 > f10 && (iClamp = Utilities.clamp((int) ((f10 / f11) * v2Var.getBaseFontSize()), v2Var.f50740t0, v2Var.f50739s0)) != v2Var.getBaseFontSize()) {
                        v2Var.setBaseFontSize(iClamp);
                        Runnable runnable = v2Var.f50741u0;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                v2Var.s();
                break;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f44419a) {
            case 0:
                break;
            default:
                this.f44420b = i12 > 3;
                break;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f44419a;
    }

    public xd0(yd0 yd0Var, boolean z10) {
        this.f44421c = yd0Var;
        this.f44420b = z10;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
