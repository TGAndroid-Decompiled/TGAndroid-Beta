package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class t6 extends p6 {
    public final c7 d;

    public t6(c7 c7Var, Context context) {
        super(context);
        this.d = c7Var;
        ((ViewGroup.MarginLayoutParams) this.f42365a.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
        this.f42365a.setOnClickListener(new a(this, 5));
    }
}
