package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class z9 extends EditTextBoldCursor {
    public final int f43855b;
    public final aa f43856c;

    public z9(aa aaVar, Context context, int i10) {
        super(context);
        this.f43855b = i10;
        this.f43856c = aaVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourcesProvider() {
        switch (this.f43855b) {
            case 0:
                return this.f43856c.d;
            default:
                return this.f43856c.d;
        }
    }
}
