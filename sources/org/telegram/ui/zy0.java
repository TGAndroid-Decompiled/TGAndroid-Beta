package org.telegram.ui;

import android.view.View;
public final class zy0 implements View.OnClickListener {
    public final int f45165a;
    public final Runnable f45166b;

    public zy0(int i10, Runnable runnable) {
        this.f45165a = i10;
        this.f45166b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45165a) {
            case 0:
                this.f45166b.run();
                return;
            default:
                Runnable runnable = this.f45166b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
