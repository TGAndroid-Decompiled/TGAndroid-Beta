package org.telegram.ui;

import android.view.View;
public final class sy0 implements View.OnClickListener {
    public final int f37876a;
    public final Runnable f37877b;

    public sy0(int i10, Runnable runnable) {
        this.f37876a = i10;
        this.f37877b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37876a) {
            case 0:
                this.f37877b.run();
                return;
            default:
                Runnable runnable = this.f37877b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
