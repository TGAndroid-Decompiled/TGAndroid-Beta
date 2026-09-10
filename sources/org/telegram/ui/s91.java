package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class s91 implements View.OnClickListener {
    public final int f36608a;
    public final Context f36609b;
    public final org.telegram.ui.ActionBar.f6 f36610c;

    public s91(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f36608a = i10;
        this.f36609b = context;
        this.f36610c = f6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36608a) {
            case 0:
                new xh.p7(this.f36609b, this.f36610c).show();
                return;
            case 1:
                new xh.p7(this.f36609b, this.f36610c).show();
                return;
            default:
                new xh.p7(this.f36609b, this.f36610c).show();
                return;
        }
    }
}
