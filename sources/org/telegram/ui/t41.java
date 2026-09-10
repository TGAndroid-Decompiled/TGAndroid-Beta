package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class t41 implements org.telegram.ui.Components.no0 {
    public final org.telegram.ui.Components.oo0 f36835a;
    public final w41 f36836b;
    public final w41 f36837c;
    public final w41 d;
    public final u41 e;

    public t41(u41 u41Var, org.telegram.ui.Components.oo0 oo0Var, w41 w41Var, w41 w41Var2, w41 w41Var3) {
        this.e = u41Var;
        this.f36835a = oo0Var;
        this.f36836b = w41Var;
        this.f36837c = w41Var2;
        this.d = w41Var3;
    }

    @Override
    public final void W(float f7, boolean z10) {
        long j3;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.e.d;
        boolean isAttachedToWindow = this.f36835a.isAttachedToWindow();
        if (f7 > 0.7f) {
            j3 = (((float) 4089446400L) * ((f7 - 0.7f) / 0.3f)) + ((float) 104857600);
        } else {
            j3 = (((float) 104333312) * (f7 / 0.7f)) + 524288.0f;
        }
        w41 w41Var = this.d;
        w41 w41Var2 = this.f36836b;
        w41 w41Var3 = this.f36837c;
        if (f7 >= 1.0f) {
            w41Var2.e(false, isAttachedToWindow);
            w41Var3.e(false, isAttachedToWindow);
            w41Var.e(true, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(w41Var3, false, 0.8f, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            w41Var2.e(true, isAttachedToWindow);
            w41Var3.e(false, isAttachedToWindow);
            w41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(w41Var3, false, 0.8f, isAttachedToWindow);
        } else {
            w41Var3.c(LocaleController.formatString("UpToFileSize", R.string.UpToFileSize, AndroidUtilities.formatFileSize(j3, true, false)), false, true);
            w41Var2.e(false, isAttachedToWindow);
            w41Var3.e(true, isAttachedToWindow);
            w41Var.e(false, isAttachedToWindow);
            AndroidUtilities.updateViewVisibilityAnimated(w41Var3, true, 0.8f, isAttachedToWindow);
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
    public final int k0() {
        return 0;
    }

    @Override
    public final void y() {
    }
}
