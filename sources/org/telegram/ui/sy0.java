package org.telegram.ui;

import android.view.View;
public final class sy0 implements View.OnClickListener {
    public final int f37892a;
    public final Runnable f37893b;

    public sy0(int i10, Runnable runnable) {
        this.f37892a = i10;
        this.f37893b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37892a) {
            case 0:
                this.f37893b.run();
                return;
            default:
                Runnable runnable = this.f37893b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
