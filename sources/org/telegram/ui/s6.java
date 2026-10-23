package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class s6 extends o6 {
    public final c7 d;

    public s6(c7 c7Var, Context context) {
        super(context);
        this.d = c7Var;
        ((ViewGroup.MarginLayoutParams) this.f40078a.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
        this.f40078a.setOnClickListener(new a(this, 6));
    }
}
