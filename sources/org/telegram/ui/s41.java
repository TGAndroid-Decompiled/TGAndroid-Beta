package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s41 implements org.telegram.ui.Components.pp0 {
    public final org.telegram.ui.Components.qp0 f41806a;
    public final v41 f41807b;
    public final v41 f41808c;
    public final v41 d;
    public final t41 f41809e;

    public s41(t41 t41Var, org.telegram.ui.Components.qp0 qp0Var, v41 v41Var, v41 v41Var2, v41 v41Var3) {
        this.f41809e = t41Var;
        this.f41806a = qp0Var;
        this.f41807b = v41Var;
        this.f41808c = v41Var2;
        this.d = v41Var3;
    }

    @Override
    public final void X(float f7, boolean z10) {
        long j3;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f41809e.d;
        boolean isAttachedToWindow = this.f41806a.isAttachedToWindow();
        if (f7 > 0.7f) {
            j3 = (((float) 4089446400L) * ((f7 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j3 = (((float) 104333312) * (f7 / 0.7f)) + 524288.0f;
        }
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        v41 v41Var = this.d;
        v41 v41Var2 = this.f41807b;
        v41 v41Var3 = this.f41808c;
        if (i10 >= 0) {
            v41Var2.e(false, isAttachedToWindow);
            v41Var3.e(false, isAttachedToWindow);
            v41Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(v41Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            v41Var2.e(true, isAttachedToWindow);
            v41Var3.e(false, isAttachedToWindow);
            v41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(v41Var3, false, 0.8f, isAttachedToWindow);
        } else {
            v41Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j3, true, false)), false, true);
            v41Var2.e(false, isAttachedToWindow);
            v41Var3.e(true, isAttachedToWindow);
            v41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(v41Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.X().limitVideo = j3;
            saveToGallerySettingsActivity.Y();
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        return null;
    }

    @Override
    public final int m0() {
        return 0;
    }

    @Override
    public final void z() {
    }
}
