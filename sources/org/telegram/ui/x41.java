package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class x41 implements View.OnApplyWindowInsetsListener {
    public final int f43824a;
    public final Object f43825b;

    public x41(Object obj, int i10) {
        this.f43824a = i10;
        this.f43825b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f43824a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f43825b, windowInsets);
            default:
                return g71.b((z51) this.f43825b, view, windowInsets);
        }
    }
}
