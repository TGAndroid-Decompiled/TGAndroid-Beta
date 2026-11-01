package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class s01 implements View.OnApplyWindowInsetsListener {
    public final int f41183a;
    public final Object f41184b;

    public s01(Object obj, int i10) {
        this.f41183a = i10;
        this.f41184b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f41183a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f41184b, windowInsets);
            default:
                return c31.b((w11) this.f41184b, view, windowInsets);
        }
    }
}
