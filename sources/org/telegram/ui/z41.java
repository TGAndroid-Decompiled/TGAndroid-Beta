package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class z41 implements View.OnApplyWindowInsetsListener {
    public final int f44615a;
    public final Object f44616b;

    public z41(Object obj, int i10) {
        this.f44615a = i10;
        this.f44616b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f44615a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f44616b, windowInsets);
            default:
                return j71.b((c61) this.f44616b, view, windowInsets);
        }
    }
}
