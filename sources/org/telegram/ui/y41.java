package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class y41 implements View.OnApplyWindowInsetsListener {
    public final int f39798a;
    public final Object f39799b;

    public y41(Object obj, int i10) {
        this.f39798a = i10;
        this.f39799b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f39798a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f39799b, windowInsets);
            default:
                return f71.b((y51) this.f39799b, view, windowInsets);
        }
    }
}
