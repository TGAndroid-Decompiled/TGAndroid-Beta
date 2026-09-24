package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class yn extends FrameLayout {
    public final xn f40177a;
    public final org.telegram.ui.ActionBar.b5 f40178b;
    public View f40179c;
    public int d;
    public boolean e;

    public yn(Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.f40178b = b5Var;
        xn xnVar = new xn(this, bundle);
        this.f40177a = xnVar;
        xnVar.Oa = true;
    }

    public void a() {
        int i10;
        xn xnVar = this.f40177a;
        if (xnVar.onFragmentCreate()) {
            this.f40179c = xnVar.fragmentView;
            xnVar.setParentLayout(this.f40178b);
            View view = this.f40179c;
            if (view == null) {
                this.f40179c = xnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    xnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f40179c);
                }
            }
            rj rjVar = xnVar.f39680x0;
            if (rjVar != null && (i10 = this.d) != 0) {
                rjVar.setPadding(0, i10, 0, 0);
            }
            xnVar.pa();
            addView(this.f40179c, w7.y5.c(-1.0f, -1));
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
