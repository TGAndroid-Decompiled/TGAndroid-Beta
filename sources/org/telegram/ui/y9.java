package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class y9 extends EditTextBoldCursor {
    public final int f39779b;
    public final z9 f39780c;

    public y9(z9 z9Var, Context context, int i10) {
        super(context);
        this.f39779b = i10;
        this.f39780c = z9Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        switch (this.f39779b) {
            case 0:
                return this.f39780c.d;
            default:
                return this.f39780c.d;
        }
    }
}
