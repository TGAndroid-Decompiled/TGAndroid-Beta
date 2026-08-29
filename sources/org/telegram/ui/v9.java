package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class v9 extends EditTextBoldCursor {
    public final int f43484b;
    public final w9 f43485c;

    public v9(w9 w9Var, Context context, int i10) {
        super(context);
        this.f43484b = i10;
        this.f43485c = w9Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourcesProvider() {
        switch (this.f43484b) {
            case 0:
                return this.f43485c.d;
            default:
                return this.f43485c.d;
        }
    }
}
