package tg;

import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ed0;
public final class h extends ed0 {
    @Override
    public final CharSequence d(int i10) {
        return LocaleController.formatPluralString("Minutes", i10, new Object[0]);
    }
}
