package org.telegram.ui;

import android.view.View;
public final class vx0 implements View.OnClickListener {
    public final int f43795a;
    public final Runnable f43796b;

    public vx0(int i10, Runnable runnable) {
        this.f43795a = i10;
        this.f43796b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43795a) {
            case 0:
                this.f43796b.run();
                return;
            default:
                Runnable runnable = this.f43796b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
