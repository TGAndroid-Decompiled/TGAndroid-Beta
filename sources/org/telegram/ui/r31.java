package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class r31 implements View.OnApplyWindowInsetsListener {
    public final int f42844a;
    public final Object f42845b;

    public r31(Object obj, int i10) {
        this.f42844a = i10;
        this.f42845b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f42844a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f42845b, windowInsets);
            default:
                return b61.b((u41) this.f42845b, view, windowInsets);
        }
    }
}
