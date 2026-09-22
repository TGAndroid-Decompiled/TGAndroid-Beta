package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class y9 extends EditTextBoldCursor {
    public final int f39780b;
    public final z9 f39781c;

    public y9(z9 z9Var, Context context, int i10) {
        super(context);
        this.f39780b = i10;
        this.f39781c = z9Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        switch (this.f39780b) {
            case 0:
                return this.f39781c.d;
            default:
                return this.f39781c.d;
        }
    }
}
