package org.telegram.ui;

import android.view.View;
import j$.util.Objects;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class rh implements Utilities.CallbackReturn {
    public final int f42104a;

    public rh(int i10) {
        this.f42104a = i10;
    }

    @Override
    public final Object run(Object obj) {
        boolean z10 = true;
        switch (this.f42104a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                return Boolean.valueOf((messageObject == null || messageObject.getFactCheck() == null) ? false : false);
            case 1:
                MessageObject messageObject2 = (MessageObject) obj;
                return Boolean.valueOf((messageObject2 == null || messageObject2.getEffect() == null) ? false : false);
            case 2:
                return LocaleController.formatPluralString("Hours", ((Integer) obj).intValue(), new Object[0]);
            case 3:
                return LocaleController.formatPluralString("Minutes", ((Integer) obj).intValue(), new Object[0]);
            case 4:
                View view = (View) obj;
                return Boolean.valueOf(((view instanceof org.telegram.ui.Cells.y8) || (view instanceof org.telegram.ui.Cells.x6) || (view instanceof k10) || (view instanceof org.telegram.ui.Cells.s3) || (view instanceof org.telegram.ui.Cells.z1) || Objects.equals(view.getTag(), -33024)) ? false : false);
            case 5:
                return Boolean.valueOf(org.telegram.ui.Components.k51.K(((Integer) obj).intValue()));
            default:
                return String.format(Locale.US, "%.1f%%", Float.valueOf(((Integer) obj).intValue() / 10.0f));
        }
    }
}
