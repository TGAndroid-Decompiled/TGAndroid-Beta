package sg;

import org.telegram.messenger.AndroidUtilities;
public final class j1 extends wg.c {
    @Override
    public final int getHeaderHeight() {
        if (getResources().getConfiguration().orientation == 2) {
            return AndroidUtilities.dp(48.0f);
        }
        return AndroidUtilities.dp(54.0f);
    }
}
