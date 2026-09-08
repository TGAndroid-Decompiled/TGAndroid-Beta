package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class x41 implements View.OnApplyWindowInsetsListener {
    public final int f42619a;
    public final Object f42620b;

    public x41(Object obj, int i10) {
        this.f42619a = i10;
        this.f42620b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f42619a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f42620b, windowInsets);
            default:
                return f71.b((y51) this.f42620b, view, windowInsets);
        }
    }
}
