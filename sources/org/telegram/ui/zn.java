package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class zn extends FrameLayout {
    public final yn f40556a;
    public final org.telegram.ui.ActionBar.d5 f40557b;
    public View f40558c;
    public int d;
    public boolean e;

    public zn(Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.f40557b = d5Var;
        yn ynVar = new yn(this, bundle);
        this.f40556a = ynVar;
        ynVar.Oa = true;
    }

    public void a() {
        int i10;
        yn ynVar = this.f40556a;
        if (ynVar.onFragmentCreate()) {
            this.f40558c = ynVar.fragmentView;
            ynVar.setParentLayout(this.f40557b);
            View view = this.f40558c;
            if (view == null) {
                this.f40558c = ynVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    ynVar.onRemoveFromParent();
                    viewGroup.removeView(this.f40558c);
                }
            }
            tj tjVar = ynVar.f39977x0;
            if (tjVar != null && (i10 = this.d) != 0) {
                tjVar.setPadding(0, i10, 0, 0);
            }
            ynVar.pa();
            addView(this.f40558c, w7.y5.c(-1.0f, -1));
            if (this.e) {
                ynVar.onResume();
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

    public void setTopPadding(int i10) {
        this.d = i10;
    }

    public void b(boolean z10) {
    }
}
