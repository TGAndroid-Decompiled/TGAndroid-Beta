package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x41 implements org.telegram.ui.Components.fp0 {
    public final org.telegram.ui.Components.gp0 f41428a;
    public final a51 f41429b;
    public final a51 f41430c;
    public final a51 d;
    public final y41 e;

    public x41(y41 y41Var, org.telegram.ui.Components.gp0 gp0Var, a51 a51Var, a51 a51Var2, a51 a51Var3) {
        this.e = y41Var;
        this.f41428a = gp0Var;
        this.f41429b = a51Var;
        this.f41430c = a51Var2;
        this.d = a51Var3;
    }

    @Override
    public final void X(float f7, boolean z10) {
        long j10;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.f41428a.isAttachedToWindow();
        if (f7 > 0.7f) {
            j10 = (((float) 4089446400L) * ((f7 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j10 = (((float) 104333312) * (f7 / 0.7f)) + 524288.0f;
        }
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        a51 a51Var = this.d;
        a51 a51Var2 = this.f41429b;
        a51 a51Var3 = this.f41430c;
        if (i10 >= 0) {
            a51Var2.e(false, isAttachedToWindow);
            a51Var3.e(false, isAttachedToWindow);
            a51Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(a51Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            a51Var2.e(true, isAttachedToWindow);
            a51Var3.e(false, isAttachedToWindow);
            a51Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(a51Var3, false, 0.8f, isAttachedToWindow);
        } else {
            a51Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j10, true, false)), false, true);
            a51Var2.e(false, isAttachedToWindow);
            a51Var3.e(true, isAttachedToWindow);
            a51Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(a51Var3, true, 0.8f, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.X().limitVideo = j10;
            saveToGallerySettingsActivity.Y();
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        return null;
    }

    @Override
    public final int k0() {
        return 0;
    }

    @Override
    public final void z() {
    }
}
