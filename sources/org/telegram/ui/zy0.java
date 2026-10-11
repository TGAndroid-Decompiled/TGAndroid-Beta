package org.telegram.ui;

import android.view.View;
public final class zy0 implements View.OnClickListener {
    public final int f45131a;
    public final Runnable f45132b;

    public zy0(int i10, Runnable runnable) {
        this.f45131a = i10;
        this.f45132b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45131a) {
            case 0:
                this.f45132b.run();
                return;
            default:
                Runnable runnable = this.f45132b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
