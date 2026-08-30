package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class v31 implements org.telegram.ui.Components.jo0 {
    public final org.telegram.ui.Components.ko0 f39072a;
    public final y31 f39073b;
    public final y31 f39074c;
    public final y31 d;
    public final w31 e;

    public v31(w31 w31Var, org.telegram.ui.Components.ko0 ko0Var, y31 y31Var, y31 y31Var2, y31 y31Var3) {
        this.e = w31Var;
        this.f39072a = ko0Var;
        this.f39073b = y31Var;
        this.f39074c = y31Var2;
        this.d = y31Var3;
    }

    @Override
    public final void Y(float f10, boolean z4) {
        long j10;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.f39072a.isAttachedToWindow();
        if (f10 > 0.7f) {
            j10 = (((float) 4089446400L) * ((f10 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j10 = (((float) 104333312) * (f10 / 0.7f)) + 524288.0f;
        }
        y31 y31Var = this.d;
        y31 y31Var2 = this.f39073b;
        y31 y31Var3 = this.f39074c;
        if (f10 >= 1.0f) {
            y31Var2.e(false, isAttachedToWindow);
            y31Var3.e(false, isAttachedToWindow);
            y31Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(y31Var3, false, 0.8f, isAttachedToWindow);
        } else if (f10 == 0.0f) {
            y31Var2.e(true, isAttachedToWindow);
            y31Var3.e(false, isAttachedToWindow);
            y31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(y31Var3, false, 0.8f, isAttachedToWindow);
        } else {
            y31Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j10, true, false)), false, true);
            y31Var2.e(false, isAttachedToWindow);
            y31Var3.e(true, isAttachedToWindow);
            y31Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(y31Var3, true, 0.8f, isAttachedToWindow);
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
    public final int j0() {
        return 0;
    }

    @Override
    public final void B() {
    }
}
