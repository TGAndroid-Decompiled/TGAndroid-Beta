package org.telegram.ui;

import android.view.View;
public final class uy0 implements View.OnClickListener {
    public final int f41499a;
    public final Runnable f41500b;

    public uy0(int i10, Runnable runnable) {
        this.f41499a = i10;
        this.f41500b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41499a) {
            case 0:
                this.f41500b.run();
                return;
            default:
                Runnable runnable = this.f41500b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
