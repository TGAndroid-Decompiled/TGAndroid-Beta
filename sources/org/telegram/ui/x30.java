package org.telegram.ui;

import org.telegram.messenger.LocaleController;
public final class x30 extends org.telegram.ui.Components.qd0 {
    public x30(LaunchActivity launchActivity) {
        super(launchActivity, null);
    }

    @Override
    public final CharSequence d(int i10) {
        return LocaleController.formatPluralString("Hours", i10, new Object[0]);
    }
}
