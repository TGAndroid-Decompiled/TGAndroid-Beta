package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.FileLog;
public final class r6 extends org.telegram.ui.ActionBar.h3 {
    public final int f41031b = 1;

    public r6(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(i10, context, g6Var, z10);
    }

    @Override
    public boolean canDismissWithTouchOutside() {
        switch (this.f41031b) {
            case 0:
                return false;
            default:
                return super.canDismissWithTouchOutside();
        }
    }

    @Override
    public void onThemeColorsChanged() {
        switch (this.f41031b) {
            case 1:
                super.onThemeColorsChanged();
                try {
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21254h5);
                    if (this.navBarColor != themedColor) {
                        fixNavigationBar(themedColor);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                super.onThemeColorsChanged();
                return;
        }
    }

    public r6(Context context, boolean z10) {
        super(context, z10);
    }
}
