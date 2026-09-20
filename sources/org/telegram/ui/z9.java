package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class z9 extends EditTextBoldCursor {
    public final int f40140b;
    public final aa f40141c;

    public z9(aa aaVar, Context context, int i10) {
        super(context);
        this.f40140b = i10;
        this.f40141c = aaVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        switch (this.f40140b) {
            case 0:
                return this.f40141c.d;
            default:
                return this.f40141c.d;
        }
    }
}
