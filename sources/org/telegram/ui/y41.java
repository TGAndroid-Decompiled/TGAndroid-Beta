package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class y41 implements View.OnApplyWindowInsetsListener {
    public final int f39818a;
    public final Object f39819b;

    public y41(Object obj, int i10) {
        this.f39818a = i10;
        this.f39819b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f39818a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f39819b, windowInsets);
            default:
                return f71.b((y51) this.f39819b, view, windowInsets);
        }
    }
}
