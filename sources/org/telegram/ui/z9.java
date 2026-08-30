package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class z9 extends EditTextBoldCursor {
    public final int f40737b;
    public final aa f40738c;

    public z9(aa aaVar, Context context, int i10) {
        super(context);
        this.f40737b = i10;
        this.f40738c = aaVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        switch (this.f40737b) {
            case 0:
                return this.f40738c.d;
            default:
                return this.f40738c.d;
        }
    }
}
