package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class wg implements Runnable {
    public final int f44304a;
    public final View f44305b;

    public wg(int i10, View view) {
        this.f44304a = i10;
        this.f44305b = view;
    }

    @Override
    public final void run() {
        int i10 = this.f44304a;
        View view = this.f44305b;
        switch (i10) {
            case 0:
                try {
                    view.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                view.setBackgroundDrawable(null);
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.P8;
                AndroidUtilities.removeFromParent(view);
                return;
            case 3:
                Drawable[] drawableArr2 = PhotoViewer.P8;
                view.setVisibility(8);
                return;
            case 4:
                SharedConfig.setSuggestStickers(0);
                ((org.telegram.ui.Cells.y9) view).f26021c.c(LocaleController.getString(R.string.SuggestStickersAll), true, true);
                return;
            case 5:
                SharedConfig.setSuggestStickers(1);
                ((org.telegram.ui.Cells.y9) view).f26021c.c(LocaleController.getString(R.string.SuggestStickersInstalled), true, true);
                return;
            default:
                SharedConfig.setSuggestStickers(2);
                ((org.telegram.ui.Cells.y9) view).f26021c.c(LocaleController.getString(R.string.SuggestStickersNone), true, true);
                return;
        }
    }
}
