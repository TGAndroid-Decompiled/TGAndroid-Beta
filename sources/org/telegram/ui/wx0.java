package org.telegram.ui;

import android.view.View;
public final class wx0 implements View.OnClickListener {
    public final int f44274a;
    public final Runnable f44275b;

    public wx0(int i9, Runnable runnable) {
        this.f44274a = i9;
        this.f44275b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44274a) {
            case 0:
                this.f44275b.run();
                return;
            default:
                Runnable runnable = this.f44275b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
