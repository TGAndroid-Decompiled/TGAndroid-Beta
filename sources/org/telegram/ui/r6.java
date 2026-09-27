package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class r6 extends n6 {
    public final b7 d;

    public r6(b7 b7Var, Context context) {
        super(context);
        this.d = b7Var;
        ((ViewGroup.MarginLayoutParams) this.f35826a.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
        this.f35826a.setOnClickListener(new a(this, 6));
    }
}
