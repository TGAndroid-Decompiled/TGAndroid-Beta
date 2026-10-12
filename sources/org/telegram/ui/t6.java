package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class t6 extends o6 {
    public final d7 d;

    public t6(d7 d7Var, Context context) {
        super(context);
        this.d = d7Var;
        ((ViewGroup.MarginLayoutParams) this.f38871a.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
        this.f38871a.setOnClickListener(new a(this, 6));
    }
}
