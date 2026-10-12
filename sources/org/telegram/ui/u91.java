package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class u91 implements View.OnClickListener {
    public final int f40605a;
    public final Context f40606b;
    public final org.telegram.ui.ActionBar.c6 f40607c;

    public u91(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f40605a = i10;
        this.f40606b = context;
        this.f40607c = c6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40605a) {
            case 0:
                new zh.f7(this.f40606b, this.f40607c).show();
                return;
            case 1:
                new zh.f7(this.f40606b, this.f40607c).show();
                return;
            default:
                new zh.f7(this.f40606b, this.f40607c).show();
                return;
        }
    }
}
