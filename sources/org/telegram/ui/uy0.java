package org.telegram.ui;

import android.view.View;
public final class uy0 implements View.OnClickListener {
    public final int f38236a;
    public final Runnable f38237b;

    public uy0(int i10, Runnable runnable) {
        this.f38236a = i10;
        this.f38237b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38236a) {
            case 0:
                this.f38237b.run();
                return;
            default:
                Runnable runnable = this.f38237b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
