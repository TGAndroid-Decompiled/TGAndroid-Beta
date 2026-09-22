package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class v41 implements View.OnApplyWindowInsetsListener {
    public final int f38358a;
    public final Object f38359b;

    public v41(Object obj, int i10) {
        this.f38358a = i10;
        this.f38359b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f38358a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f38359b, windowInsets);
            default:
                return d71.b((w51) this.f38359b, view, windowInsets);
        }
    }
}
