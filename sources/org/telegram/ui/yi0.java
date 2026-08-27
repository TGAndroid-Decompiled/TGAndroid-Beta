package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class yi0 extends gg.d {
    @Override
    public final int getHeaderHeight() {
        return getResources().getConfiguration().orientation == 2 ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(54.0f);
    }
}
