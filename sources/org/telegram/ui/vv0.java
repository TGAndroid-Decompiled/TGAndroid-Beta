package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
public final class vv0 implements View.OnClickListener {
    public final int f42825a;
    public final Runnable f42826b;

    public vv0(int i10, Runnable runnable) {
        this.f42825a = i10;
        this.f42826b = runnable;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f42825a;
        Runnable runnable = this.f42826b;
        switch (i10) {
            case 0:
                RectF rectF = ProfileActivity.R6;
                runnable.run();
                return;
            default:
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
