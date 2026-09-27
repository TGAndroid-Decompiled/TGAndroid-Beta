package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class r41 implements View.OnApplyWindowInsetsListener {
    public final int f36992a;
    public final Object f36993b;

    public r41(Object obj, int i10) {
        this.f36992a = i10;
        this.f36993b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f36992a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f36993b, windowInsets);
            default:
                return y61.b((r51) this.f36993b, view, windowInsets);
        }
    }
}
