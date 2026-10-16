package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class u91 implements View.OnClickListener {
    public final int f40331a;
    public final Context f40332b;
    public final org.telegram.ui.ActionBar.c6 f40333c;

    public u91(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f40331a = i10;
        this.f40332b = context;
        this.f40333c = c6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40331a) {
            case 0:
                new zh.f7(this.f40332b, this.f40333c).show();
                return;
            case 1:
                new zh.f7(this.f40332b, this.f40333c).show();
                return;
            default:
                new zh.f7(this.f40332b, this.f40333c).show();
                return;
        }
    }
}
