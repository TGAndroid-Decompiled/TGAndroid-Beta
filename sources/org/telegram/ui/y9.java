package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class y9 extends EditTextBoldCursor {
    public final int f43027b;
    public final z9 f43028c;

    public y9(z9 z9Var, Context context, int i10) {
        super(context);
        this.f43027b = i10;
        this.f43028c = z9Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        switch (this.f43027b) {
            case 0:
                return this.f43028c.d;
            default:
                return this.f43028c.d;
        }
    }
}
