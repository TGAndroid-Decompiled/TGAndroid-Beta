package org.telegram.ui;

import android.view.View;
public final class uy0 implements View.OnClickListener {
    public final int f41500a;
    public final Runnable f41501b;

    public uy0(int i10, Runnable runnable) {
        this.f41500a = i10;
        this.f41501b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41500a) {
            case 0:
                this.f41501b.run();
                return;
            default:
                Runnable runnable = this.f41501b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
