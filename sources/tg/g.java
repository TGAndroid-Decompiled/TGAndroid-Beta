package tg;

import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.hd0;
public final class g extends hd0 {
    @Override
    public final CharSequence d(int i10) {
        return LocaleController.formatPluralString("Hours", i10, new Object[0]);
    }
}
