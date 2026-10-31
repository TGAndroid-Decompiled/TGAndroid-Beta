package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class s01 implements View.OnApplyWindowInsetsListener {
    public final int f41324a;
    public final Object f41325b;

    public s01(Object obj, int i10) {
        this.f41324a = i10;
        this.f41325b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f41324a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f41325b, windowInsets);
            default:
                return e31.b((y11) this.f41325b, view, windowInsets);
        }
    }
}
