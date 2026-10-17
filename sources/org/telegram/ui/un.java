package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class un extends FrameLayout {
    public final tn f42016a;
    public final org.telegram.ui.ActionBar.d5 f42017b;
    public View f42018c;
    public int d;
    public boolean e;

    public un(Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.f42017b = d5Var;
        tn tnVar = new tn(this, bundle);
        this.f42016a = tnVar;
        tnVar.Pa = true;
    }

    public void a() {
        int i10;
        tn tnVar = this.f42016a;
        if (tnVar.onFragmentCreate()) {
            this.f42018c = tnVar.fragmentView;
            tnVar.setParentLayout(this.f42017b);
            View view = this.f42018c;
            if (view == null) {
                this.f42018c = tnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    tnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f42018c);
                }
            }
            pj pjVar = tnVar.f41433x0;
            if (pjVar != null && (i10 = this.d) != 0) {
                pjVar.setPadding(0, i10, 0, 0);
            }
            tnVar.ua();
            addView(this.f42018c, w7.z5.d(-1.0f, -1));
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
