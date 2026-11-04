package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class uy0 implements View.OnApplyWindowInsetsListener {
    public final int f50350a;
    public final Object f50351b;

    public uy0(Object obj, int i3) {
        this.f50350a = i3;
        this.f50351b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f50350a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f50351b, windowInsets);
            default:
                return c11.b((wz0) this.f50351b, view, windowInsets);
        }
    }
}
