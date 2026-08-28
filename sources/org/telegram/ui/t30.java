package org.telegram.ui;

import org.telegram.messenger.LocaleController;
public final class t30 extends org.telegram.ui.Components.bc0 {
    public t30(LaunchActivity launchActivity) {
        super(launchActivity, null);
    }

    @Override
    public final CharSequence d(int i9) {
        return LocaleController.formatPluralString("Hours", i9, new Object[0]);
    }
}
