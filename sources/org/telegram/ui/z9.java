package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class z9 extends EditTextBoldCursor {
    public final int f44517b;
    public final aa f44518c;

    public z9(aa aaVar, Context context, int i10) {
        super(context);
        this.f44517b = i10;
        this.f44518c = aaVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        switch (this.f44517b) {
            case 0:
                return this.f44518c.d;
            default:
                return this.f44518c.d;
        }
    }
}
