package org.telegram.ui;

import android.view.View;
public final class sd implements View.OnClickListener {
    public final int f36655a;
    public final org.telegram.ui.ActionBar.h3 f36656b;

    public sd(org.telegram.ui.ActionBar.h3 h3Var, int i10) {
        this.f36655a = i10;
        this.f36656b = h3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36655a) {
            case 0:
                this.f36656b.dismiss();
                return;
            default:
                this.f36656b.dismiss();
                return;
        }
    }
}
