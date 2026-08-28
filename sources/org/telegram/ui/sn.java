package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class sn extends FrameLayout {
    public final rn f42731a;
    public final org.telegram.ui.ActionBar.b5 f42732b;
    public View f42733c;
    public int d;
    public boolean f42734e;

    public sn(Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context);
        this.f42734e = true;
        this.f42732b = b5Var;
        rn rnVar = new rn(this, bundle);
        this.f42731a = rnVar;
        rnVar.Ka = true;
    }

    public void a() {
        int i9;
        rn rnVar = this.f42731a;
        if (rnVar.onFragmentCreate()) {
            this.f42733c = rnVar.fragmentView;
            rnVar.setParentLayout(this.f42732b);
            View view = this.f42733c;
            if (view == null) {
                this.f42733c = rnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    rnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f42733c);
                }
            }
            ij ijVar = rnVar.f42077t0;
            if (ijVar != null && (i9 = this.d) != 0) {
                ijVar.setPadding(0, i9, 0, 0);
            }
            rnVar.pa();
            addView(this.f42733c, g7.e6.c(-1.0f, -1));
            if (this.f42734e) {
                rnVar.onResume();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setTopPadding(int i9) {
        this.d = i9;
    }

    public void b(boolean z10) {
    }
}
