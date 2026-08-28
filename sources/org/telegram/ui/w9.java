package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class w9 extends EditTextBoldCursor {
    public final int f43708b;
    public final x9 f43709c;

    public w9(x9 x9Var, Context context, int i9) {
        super(context);
        this.f43708b = i9;
        this.f43709c = x9Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.b6 getResourcesProvider() {
        switch (this.f43708b) {
            case 0:
                return this.f43709c.d;
            default:
                return this.f43709c.d;
        }
    }
}
