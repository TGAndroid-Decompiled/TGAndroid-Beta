package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class s6 extends o6 {
    public final b7 d;

    public s6(b7 b7Var, Context context) {
        super(context);
        this.d = b7Var;
        ((ViewGroup.MarginLayoutParams) this.f39544a.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
        this.f39544a.setOnClickListener(new a(this, 6));
    }
}
