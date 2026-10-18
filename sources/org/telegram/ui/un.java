package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class un extends FrameLayout {
    public final tn f41989a;
    public final org.telegram.ui.ActionBar.d5 f41990b;
    public View f41991c;
    public int d;
    public boolean e;

    public un(Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.f41990b = d5Var;
        tn tnVar = new tn(this, bundle);
        this.f41989a = tnVar;
        tnVar.Pa = true;
    }

    public void a() {
        int i10;
        tn tnVar = this.f41989a;
        if (tnVar.onFragmentCreate()) {
            this.f41991c = tnVar.fragmentView;
            tnVar.setParentLayout(this.f41990b);
            View view = this.f41991c;
            if (view == null) {
                this.f41991c = tnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    tnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f41991c);
                }
            }
            pj pjVar = tnVar.f41419x0;
            if (pjVar != null && (i10 = this.d) != 0) {
                pjVar.setPadding(0, i10, 0, 0);
            }
            tnVar.ua();
            addView(this.f41991c, w7.z5.c(-1.0f, -1));
            if (this.e) {
                tnVar.onResume();
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
