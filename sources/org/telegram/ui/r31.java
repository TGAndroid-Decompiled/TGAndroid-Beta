package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class r31 implements View.OnApplyWindowInsetsListener {
    public final int f41851a;
    public final Object f41852b;

    public r31(Object obj, int i10) {
        this.f41851a = i10;
        this.f41852b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f41851a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f41852b, windowInsets);
            default:
                return z51.b((s41) this.f41852b, view, windowInsets);
        }
    }
}
