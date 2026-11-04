package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class r6 extends n6 {
    public final z6 d;

    public r6(z6 z6Var, Context context) {
        super(context);
        this.d = z6Var;
        ((ViewGroup.MarginLayoutParams) this.f47894a.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(5.0f);
        this.f47894a.setOnClickListener(new a(this, 5));
    }
}
