package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class x9 extends EditTextBoldCursor {
    public final int M1;
    public final y9 N1;

    public x9(y9 y9Var, Context context, int i7) {
        super(context);
        this.M1 = i7;
        this.N1 = y9Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        switch (this.M1) {
            case 0:
                return this.N1.d;
            default:
                return this.N1.d;
        }
    }
}
