package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class z9 extends EditTextBoldCursor {
    public final int f44515b;
    public final aa f44516c;

    public z9(aa aaVar, Context context, int i10) {
        super(context);
        this.f44515b = i10;
        this.f44516c = aaVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        switch (this.f44515b) {
            case 0:
                return this.f44516c.d;
            default:
                return this.f44516c.d;
        }
    }
}
