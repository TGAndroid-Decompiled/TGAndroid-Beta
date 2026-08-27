package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class x9 extends EditTextBoldCursor {

    public final int f44329b;

    public final y9 f44330c;

    public x9(y9 y9Var, Context context, int i10) {
        super(context);
        this.f44329b = i10;
        this.f44330c = y9Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourcesProvider() {
        switch (this.f44329b) {
            case 0:
                break;
        }
        return this.f44330c.d;
    }
}
