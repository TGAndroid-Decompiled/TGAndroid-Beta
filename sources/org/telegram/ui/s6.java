package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.FileLog;
public final class s6 extends org.telegram.ui.ActionBar.k3 {
    public final int f43366b = 1;

    public s6(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(i10, context, u6Var, z10);
    }

    @Override
    public boolean canDismissWithTouchOutside() {
        switch (this.f43366b) {
            case 0:
                return false;
            default:
                return super.canDismissWithTouchOutside();
        }
    }

    @Override
    public void onThemeColorsChanged() {
        switch (this.f43366b) {
            case 1:
                super.onThemeColorsChanged();
                try {
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23425h5);
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

    public s6(Context context, boolean z10) {
        super(context, z10);
    }
}
