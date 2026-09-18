package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class x41 implements View.OnApplyWindowInsetsListener {
    public final int f39378a;
    public final Object f39379b;

    public x41(Object obj, int i10) {
        this.f39378a = i10;
        this.f39379b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f39378a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f39379b, windowInsets);
            default:
                return e71.b((x51) this.f39379b, view, windowInsets);
        }
    }
}
