package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class u6 extends q6 {
    public final d7 d;

    public u6(d7 d7Var, Context context) {
        super(context);
        this.d = d7Var;
        ((ViewGroup.MarginLayoutParams) this.f37313a.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
        this.f37313a.setOnClickListener(new a(this, 6));
    }
}
