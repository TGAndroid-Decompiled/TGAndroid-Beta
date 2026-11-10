package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class x9 extends EditTextBoldCursor {
    public final int G1;
    public final y9 H1;

    public x9(y9 y9Var, Context context, int i7) {
        super(context);
        this.G1 = i7;
        this.H1 = y9Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.h6 getResourcesProvider() {
        switch (this.G1) {
            case 0:
                return this.H1.d;
            default:
                return this.H1.d;
        }
    }
}
