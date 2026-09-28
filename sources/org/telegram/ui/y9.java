package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class y9 extends EditTextBoldCursor {
    public final int f40091b;
    public final z9 f40092c;

    public y9(z9 z9Var, Context context, int i10) {
        super(context);
        this.f40091b = i10;
        this.f40092c = z9Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourcesProvider() {
        switch (this.f40091b) {
            case 0:
                return this.f40092c.d;
            default:
                return this.f40092c.d;
        }
    }
}
