package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class x41 implements View.OnApplyWindowInsetsListener {
    public final int f43868a;
    public final Object f43869b;

    public x41(Object obj, int i10) {
        this.f43868a = i10;
        this.f43869b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f43868a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f43869b, windowInsets);
            default:
                return g71.b((z51) this.f43869b, view, windowInsets);
        }
    }
}
