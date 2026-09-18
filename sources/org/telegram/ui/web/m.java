package org.telegram.ui.web;

import android.view.View;
import java.util.concurrent.ExecutorService;
public final class m implements e2.h {
    public final int f38872a;

    @Override
    public final void accept(Object obj) {
        switch (this.f38872a) {
            case 0:
                View view = (View) obj;
                if (view instanceof h) {
                    ((h) view).setChecked(false);
                    return;
                }
                return;
            case 1:
                View view2 = (View) obj;
                if (view2 instanceof h) {
                    ((h) view2).setChecked(false);
                    return;
                }
                return;
            case 2:
                ((u2.y0) obj).f43565b.release();
                return;
            default:
                ((ExecutorService) obj).shutdown();
                return;
        }
    }
}
