package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class r41 implements View.OnApplyWindowInsetsListener {
    public final int f39915a;
    public final Object f39916b;

    public r41(Object obj, int i10) {
        this.f39915a = i10;
        this.f39916b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f39915a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f39916b, windowInsets);
            default:
                return y61.b((r51) this.f39916b, view, windowInsets);
        }
    }
}
