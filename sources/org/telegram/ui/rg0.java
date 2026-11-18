package org.telegram.ui;

import android.content.Context;
public final class rg0 extends ah.e {
    public final int f51596n;

    public rg0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.f51596n = i7;
    }

    @Override
    public final int getHeaderHeight() {
        switch (this.f51596n) {
            case 0:
                if (getResources().getConfiguration().orientation == 2) {
                    return org.telegram.messenger.g0.L(48.0f);
                }
                return org.telegram.messenger.g0.L(54.0f);
            default:
                if (getResources().getConfiguration().orientation == 2) {
                    return org.telegram.messenger.g0.L(48.0f);
                }
                return org.telegram.messenger.g0.L(54.0f);
        }
    }
}
