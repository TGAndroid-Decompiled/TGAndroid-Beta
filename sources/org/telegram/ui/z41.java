package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class z41 implements View.OnApplyWindowInsetsListener {
    public final int f44620a;
    public final Object f44621b;

    public z41(Object obj, int i10) {
        this.f44620a = i10;
        this.f44621b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f44620a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f44621b, windowInsets);
            default:
                return j71.b((c61) this.f44621b, view, windowInsets);
        }
    }
}
