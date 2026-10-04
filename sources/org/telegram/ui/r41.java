package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class r41 implements View.OnApplyWindowInsetsListener {
    public final int f39920a;
    public final Object f39921b;

    public r41(Object obj, int i10) {
        this.f39920a = i10;
        this.f39921b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f39920a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f39921b, windowInsets);
            default:
                return y61.b((r51) this.f39921b, view, windowInsets);
        }
    }
}
