package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class x41 implements View.OnApplyWindowInsetsListener {
    public final int f42592a;
    public final Object f42593b;

    public x41(Object obj, int i10) {
        this.f42592a = i10;
        this.f42593b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f42592a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f42593b, windowInsets);
            default:
                return f71.b((y51) this.f42593b, view, windowInsets);
        }
    }
}
