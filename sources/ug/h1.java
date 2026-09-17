package ug;

import org.telegram.messenger.AndroidUtilities;
public final class h1 extends yg.c {
    @Override
    public final int getHeaderHeight() {
        if (getResources().getConfiguration().orientation == 2) {
            return AndroidUtilities.dp(48.0f);
        }
        return AndroidUtilities.dp(54.0f);
    }
}
