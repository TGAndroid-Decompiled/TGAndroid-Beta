package org.telegram.ui;

import org.telegram.messenger.LocaleController;

public final class x30 extends org.telegram.ui.Components.fc0 {
    public x30(LaunchActivity launchActivity) {
        super(launchActivity, null);
    }

    @Override
    public final CharSequence d(int i10) {
        return LocaleController.formatPluralString("Minutes", i10, new Object[0]);
    }
}
