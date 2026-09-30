package org.telegram.ui;

import android.view.View;
public final class sy0 implements View.OnClickListener {
    public final int f38001a;
    public final Runnable f38002b;

    public sy0(int i10, Runnable runnable) {
        this.f38001a = i10;
        this.f38002b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38001a) {
            case 0:
                this.f38002b.run();
                return;
            default:
                Runnable runnable = this.f38002b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
