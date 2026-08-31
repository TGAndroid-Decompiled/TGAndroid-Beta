package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x31 implements org.telegram.ui.Components.ko0 {
    public final org.telegram.ui.Components.lo0 f42955a;
    public final a41 f42956b;
    public final a41 f42957c;
    public final a41 d;
    public final y31 f42958e;

    public x31(y31 y31Var, org.telegram.ui.Components.lo0 lo0Var, a41 a41Var, a41 a41Var2, a41 a41Var3) {
        this.f42958e = y31Var;
        this.f42955a = lo0Var;
        this.f42956b = a41Var;
        this.f42957c = a41Var2;
        this.d = a41Var3;
    }

    @Override
    public final void X(float f10, boolean z4) {
        long j10;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f42958e.d;
        boolean isAttachedToWindow = this.f42955a.isAttachedToWindow();
        if (f10 > 0.7f) {
            j10 = (((float) 4089446400L) * ((f10 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j10 = (((float) 104333312) * (f10 / 0.7f)) + 524288.0f;
        }
        a41 a41Var = this.d;
        a41 a41Var2 = this.f42956b;
        a41 a41Var3 = this.f42957c;
        if (f10 >= 1.0f) {
            a41Var2.e(false, isAttachedToWindow);
            a41Var3.e(false, isAttachedToWindow);
            a41Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(a41Var3, false, 0.8f, isAttachedToWindow);
        } else if (f10 == 0.0f) {
            a41Var2.e(true, isAttachedToWindow);
            a41Var3.e(false, isAttachedToWindow);
            a41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(a41Var3, false, 0.8f, isAttachedToWindow);
        } else {
            a41Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j10, true, false)), false, true);
            a41Var2.e(false, isAttachedToWindow);
            a41Var3.e(true, isAttachedToWindow);
            a41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(a41Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z4) {
            saveToGallerySettingsActivity.X().limitVideo = j10;
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
    public final void A() {
    }
}
