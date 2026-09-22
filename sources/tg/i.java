package tg;

import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.uc0;
public final class i extends uc0 {
    @Override
    public final CharSequence d(int i10) {
        return LocaleController.formatPluralString("Hours", i10, new Object[0]);
    }
}
