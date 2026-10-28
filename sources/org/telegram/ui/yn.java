package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class yn extends FrameLayout {
    public final xn f46049a;
    public final org.telegram.ui.ActionBar.j5 f46050b;
    public View f46051c;
    public int d;
    public boolean e;

    public yn(Context context, org.telegram.ui.ActionBar.j5 j5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.f46050b = j5Var;
        xn xnVar = new xn(this, bundle);
        this.f46049a = xnVar;
        xnVar.f45124fb = true;
    }

    public void a() {
        int i10;
        xn xnVar = this.f46049a;
        if (xnVar.onFragmentCreate()) {
            this.f46051c = xnVar.fragmentView;
            xnVar.setParentLayout(this.f46050b);
            View view = this.f46051c;
            if (view == null) {
                this.f46051c = xnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    xnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f46051c);
                }
            }
            rj rjVar = xnVar.f45339x0;
            if (rjVar != null && (i10 = this.d) != 0) {
                rjVar.setPadding(0, i10, 0, 0);
            }
            xnVar.Ca();
            addView(this.f46051c, org.telegram.ui.Components.kb1.g(-1.0f, -1));
            if (this.e) {
                xnVar.onResume();
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
