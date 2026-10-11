package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class y9 extends EditTextBoldCursor {
    public final int f44321b;
    public final z9 f44322c;

    public y9(z9 z9Var, Context context, int i10) {
        super(context);
        this.f44321b = i10;
        this.f44322c = z9Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourcesProvider() {
        switch (this.f44321b) {
            case 0:
                return this.f44322c.d;
            default:
                return this.f44322c.d;
        }
    }
}
