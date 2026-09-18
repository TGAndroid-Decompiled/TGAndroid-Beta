package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class v41 implements View.OnApplyWindowInsetsListener {
    public final int f38286a;
    public final Object f38287b;

    public v41(Object obj, int i10) {
        this.f38286a = i10;
        this.f38287b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f38286a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f38287b, windowInsets);
            default:
                return c71.b((v51) this.f38287b, view, windowInsets);
        }
    }
}
