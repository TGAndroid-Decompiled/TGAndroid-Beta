package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
public final class uv0 implements View.OnClickListener {
    public final int f42354a;
    public final Runnable f42355b;

    public uv0(int i10, Runnable runnable) {
        this.f42354a = i10;
        this.f42355b = runnable;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f42354a;
        Runnable runnable = this.f42355b;
        switch (i10) {
            case 0:
                RectF rectF = ProfileActivity.S6;
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
