package org.telegram.ui;

import android.view.View;
public final class rd implements View.OnClickListener {
    public final int f37035a;
    public final org.telegram.ui.ActionBar.f3 f37036b;

    public rd(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f37035a = i10;
        this.f37036b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37035a) {
            case 0:
                this.f37036b.dismiss();
                return;
            default:
                this.f37036b.dismiss();
                return;
        }
    }
}
