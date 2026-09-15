package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
public final class u41 implements View.OnApplyWindowInsetsListener {
    public final int f37855a;
    public final Object f37856b;

    public u41(Object obj, int i10) {
        this.f37855a = i10;
        this.f37856b = obj;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f37855a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.f37856b, windowInsets);
            default:
                return c71.b((v51) this.f37856b, view, windowInsets);
        }
    }
}
