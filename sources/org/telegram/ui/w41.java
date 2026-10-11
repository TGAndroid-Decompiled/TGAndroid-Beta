package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class w41 implements View.OnApplyWindowInsetsListener {
    public final int f43209a;
    public final Object f43210b;

    public w41(Object obj, int i10) {
        this.f43209a = i10;
        this.f43210b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f43209a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f43210b, windowInsets);
            default:
                return f71.b((y51) this.f43210b, view, windowInsets);
        }
    }
}
