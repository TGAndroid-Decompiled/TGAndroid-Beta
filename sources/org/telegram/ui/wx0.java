package org.telegram.ui;

import android.view.View;

public final class wx0 implements View.OnClickListener {

    public final int f44208a;

    public final Runnable f44209b;

    public wx0(int i10, Runnable runnable) {
        this.f44208a = i10;
        this.f44209b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44208a) {
            case 0:
                this.f44209b.run();
                break;
            default:
                Runnable runnable = this.f44209b;
                if (runnable != null) {
                    runnable.run();
                }
                break;
        }
    }
}
