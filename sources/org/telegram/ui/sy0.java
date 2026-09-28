package org.telegram.ui;

import android.view.View;
public final class sy0 implements View.OnClickListener {
    public final int f37893a;
    public final Runnable f37894b;

    public sy0(int i10, Runnable runnable) {
        this.f37893a = i10;
        this.f37894b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37893a) {
            case 0:
                this.f37894b.run();
                return;
            default:
                Runnable runnable = this.f37894b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
