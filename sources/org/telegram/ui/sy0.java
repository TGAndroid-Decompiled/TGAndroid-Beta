package org.telegram.ui;

import android.view.View;
public final class sy0 implements View.OnClickListener {
    public final int f37894a;
    public final Runnable f37895b;

    public sy0(int i10, Runnable runnable) {
        this.f37894a = i10;
        this.f37895b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37894a) {
            case 0:
                this.f37895b.run();
                return;
            default:
                Runnable runnable = this.f37895b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
