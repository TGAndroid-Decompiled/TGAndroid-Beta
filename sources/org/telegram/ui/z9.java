package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class z9 extends EditTextBoldCursor {
    public final int f40016b;
    public final aa f40017c;

    public z9(aa aaVar, Context context, int i10) {
        super(context);
        this.f40016b = i10;
        this.f40017c = aaVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        switch (this.f40016b) {
            case 0:
                return this.f40017c.d;
            default:
                return this.f40017c.d;
        }
    }
}
