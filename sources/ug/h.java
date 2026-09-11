package ug;

import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.vc0;
public final class h extends vc0 {
    @Override
    public final CharSequence d(int i10) {
        return LocaleController.formatPluralString("Hours", i10, new Object[0]);
    }
}
