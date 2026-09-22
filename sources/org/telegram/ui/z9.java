package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class z9 extends EditTextBoldCursor {
    public final int f40162b;
    public final aa f40163c;

    public z9(aa aaVar, Context context, int i10) {
        super(context);
        this.f40162b = i10;
        this.f40163c = aaVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        switch (this.f40162b) {
            case 0:
                return this.f40163c.d;
            default:
                return this.f40163c.d;
        }
    }
}
