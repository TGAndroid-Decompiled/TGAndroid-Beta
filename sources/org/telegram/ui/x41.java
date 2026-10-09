package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class x41 implements View.OnApplyWindowInsetsListener {
    public final int f43822a;
    public final Object f43823b;

    public x41(Object obj, int i10) {
        this.f43822a = i10;
        this.f43823b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f43822a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f43823b, windowInsets);
            default:
                return g71.b((z51) this.f43823b, view, windowInsets);
        }
    }
}
