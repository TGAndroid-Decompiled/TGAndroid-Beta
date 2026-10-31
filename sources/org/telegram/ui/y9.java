package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class y9 extends EditTextBoldCursor {
    public final int G1;
    public final z9 H1;

    public y9(z9 z9Var, Context context, int i10) {
        super(context);
        this.G1 = i10;
        this.H1 = z9Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.p6 getResourcesProvider() {
        switch (this.G1) {
            case 0:
                return this.H1.d;
            default:
                return this.H1.d;
        }
    }
}
