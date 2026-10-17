package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class zs extends org.telegram.ui.ActionBar.m1 {
    public final ct f43798o;

    public zs(ct ctVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f43798o = ctVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        gt gtVar = this.f43798o.f35984a;
        gtVar.f37321k = null;
        gtVar.K = false;
        if (gtVar.R) {
            gtVar.n();
        }
        View view = gtVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.e8) {
                ((org.telegram.ui.Cells.e8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.c8) {
                ((org.telegram.ui.Cells.c8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.f2) {
                ((org.telegram.ui.Cells.f2) view).setScaled(false);
            }
            gtVar.h = null;
        }
    }
}
