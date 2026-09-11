package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class y9 extends EditTextBoldCursor {
    public final int f43026b;
    public final z9 f43027c;

    public y9(z9 z9Var, Context context, int i10) {
        super(context);
        this.f43026b = i10;
        this.f43027c = z9Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        switch (this.f43026b) {
            case 0:
                return this.f43027c.d;
            default:
                return this.f43027c.d;
        }
    }
}
