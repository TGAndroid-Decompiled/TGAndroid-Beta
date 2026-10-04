package org.telegram.ui;

import android.view.View;
public final class uy0 implements View.OnClickListener {
    public final int f41507a;
    public final Runnable f41508b;

    public uy0(int i10, Runnable runnable) {
        this.f41507a = i10;
        this.f41508b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41507a) {
            case 0:
                this.f41508b.run();
                return;
            default:
                Runnable runnable = this.f41508b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
