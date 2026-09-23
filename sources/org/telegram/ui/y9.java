package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class y9 extends EditTextBoldCursor {
    public final int f39765b;
    public final z9 f39766c;

    public y9(z9 z9Var, Context context, int i10) {
        super(context);
        this.f39765b = i10;
        this.f39766c = z9Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourcesProvider() {
        switch (this.f39765b) {
            case 0:
                return this.f39766c.d;
            default:
                return this.f39766c.d;
        }
    }
}
