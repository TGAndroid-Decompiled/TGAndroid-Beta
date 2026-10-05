package org.telegram.ui;

import android.view.View;
public final class uy0 implements View.OnClickListener {
    public final int f41542a;
    public final Runnable f41543b;

    public uy0(int i10, Runnable runnable) {
        this.f41542a = i10;
        this.f41543b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41542a) {
            case 0:
                this.f41543b.run();
                return;
            default:
                Runnable runnable = this.f41543b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
