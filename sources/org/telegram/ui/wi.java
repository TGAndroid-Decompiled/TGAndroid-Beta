package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class wi extends org.telegram.ui.Components.s30 {
    public final int E;

    public wi(int i9, int i10, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(i9, context, b6Var, z10);
        this.E = i10;
    }

    @Override
    public int c() {
        switch (this.E) {
            case 0:
                return AndroidUtilities.dp(56.0f) / 2;
            default:
                return super.c();
        }
    }

    @Override
    public void setVisibility(int i9) {
        switch (this.E) {
            case 1:
                super.setVisibility(i9);
                if (i9 != 0) {
                    try {
                        ((ViewGroup) getParent()).removeView(this);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 2:
                super.setVisibility(i9);
                if (i9 != 0) {
                    try {
                        ((ViewGroup) getParent()).removeView(this);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 3:
                super.setVisibility(i9);
                if (i9 != 0) {
                    try {
                        ((ViewGroup) getParent()).removeView(this);
                        return;
                    } catch (Exception unused3) {
                        return;
                    }
                }
                return;
            default:
                super.setVisibility(i9);
                return;
        }
    }
}
