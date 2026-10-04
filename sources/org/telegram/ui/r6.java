package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class r6 extends n6 {
    public final a7 d;

    public r6(a7 a7Var, Context context) {
        super(context);
        this.d = a7Var;
        ((ViewGroup.MarginLayoutParams) this.f38823a.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
        this.f38823a.setOnClickListener(new a(this, 6));
    }
}
