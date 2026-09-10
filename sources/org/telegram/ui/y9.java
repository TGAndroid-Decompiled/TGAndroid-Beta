package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class y9 extends EditTextBoldCursor {
    public final int f38939b;
    public final z9 f38940c;

    public y9(z9 z9Var, Context context, int i10) {
        super(context);
        this.f38939b = i10;
        this.f38940c = z9Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        switch (this.f38939b) {
            case 0:
                return this.f38940c.d;
            default:
                return this.f38940c.d;
        }
    }
}
