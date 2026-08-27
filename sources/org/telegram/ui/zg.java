package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

public final class zg implements Runnable {

    public final int f45178a;

    public final View f45179b;

    public zg(int i10, View view) {
        this.f45178a = i10;
        this.f45179b = view;
    }

    @Override
    public final void run() {
        int i10 = this.f45178a;
        View view = this.f45179b;
        switch (i10) {
            case 0:
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                    return;
                }
                break;
            case 1:
                view.setBackgroundDrawable(null);
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.P8;
                AndroidUtilities.removeFromParent(view);
                break;
            case 3:
                Drawable[] drawableArr2 = PhotoViewer.P8;
                view.setVisibility(8);
                break;
            case 4:
                SharedConfig.setSuggestStickers(0);
                ((org.telegram.ui.Cells.x9) view).f25958c.c(LocaleController.getString(R.string.SuggestStickersAll), true, true);
                break;
            case 5:
                SharedConfig.setSuggestStickers(1);
                ((org.telegram.ui.Cells.x9) view).f25958c.c(LocaleController.getString(R.string.SuggestStickersInstalled), true, true);
                break;
            default:
                SharedConfig.setSuggestStickers(2);
                ((org.telegram.ui.Cells.x9) view).f25958c.c(LocaleController.getString(R.string.SuggestStickersNone), true, true);
                break;
        }
    }
}
