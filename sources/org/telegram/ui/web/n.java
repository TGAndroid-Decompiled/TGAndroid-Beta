package org.telegram.ui.web;

import android.view.View;
import java.util.concurrent.ExecutorService;
public final class n implements e2.h {
    public final int f42183a;

    @Override
    public final void accept(Object obj) {
        switch (this.f42183a) {
            case 0:
                View view = (View) obj;
                if (view instanceof i) {
                    ((i) view).setChecked(false);
                    return;
                }
                return;
            case 1:
                View view2 = (View) obj;
                if (view2 instanceof i) {
                    ((i) view2).setChecked(false);
                    return;
                }
                return;
            case 2:
                ((u2.y0) obj).f46860b.release();
                return;
            default:
                ((ExecutorService) obj).shutdown();
                return;
        }
    }
}
