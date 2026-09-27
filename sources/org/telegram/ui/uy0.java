package org.telegram.ui;

import android.view.View;
public final class uy0 implements View.OnClickListener {
    public final int f38379a;
    public final Runnable f38380b;

    public uy0(int i10, Runnable runnable) {
        this.f38379a = i10;
        this.f38380b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38379a) {
            case 0:
                this.f38380b.run();
                return;
            default:
                Runnable runnable = this.f38380b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
