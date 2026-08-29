package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class vn extends FrameLayout {
    public final un f43683a;
    public final org.telegram.ui.ActionBar.b5 f43684b;
    public View f43685c;
    public int d;
    public boolean f43686e;

    public vn(Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context);
        this.f43686e = true;
        this.f43684b = b5Var;
        un unVar = new un(this, bundle);
        this.f43683a = unVar;
        unVar.Ka = true;
    }

    public void a() {
        int i10;
        un unVar = this.f43683a;
        if (unVar.onFragmentCreate()) {
            this.f43685c = unVar.fragmentView;
            unVar.setParentLayout(this.f43684b);
            View view = this.f43685c;
            if (view == null) {
                this.f43685c = unVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    unVar.onRemoveFromParent();
                    viewGroup.removeView(this.f43685c);
                }
            }
            lj ljVar = unVar.f42973t0;
            if (ljVar != null && (i10 = this.d) != 0) {
                ljVar.setPadding(0, i10, 0, 0);
            }
            unVar.pa();
            addView(this.f43685c, i7.f6.c(-1.0f, -1));
            if (this.f43686e) {
                unVar.onResume();
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
