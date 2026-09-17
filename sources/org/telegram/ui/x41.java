package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class x41 implements View.OnApplyWindowInsetsListener {
    public final int f39373a;
    public final Object f39374b;

    public x41(Object obj, int i10) {
        this.f39373a = i10;
        this.f39374b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f39373a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f39374b, windowInsets);
            default:
                return e71.b((x51) this.f39374b, view, windowInsets);
        }
    }
}
