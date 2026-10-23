package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class un extends FrameLayout {
    public final tn f42477a;
    public final org.telegram.ui.ActionBar.h5 f42478b;
    public View f42479c;
    public int d;
    public boolean e;

    public un(Context context, org.telegram.ui.ActionBar.h5 h5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.f42478b = h5Var;
        tn tnVar = new tn(this, bundle);
        this.f42477a = tnVar;
        tnVar.f41472bb = true;
    }

    public void a() {
        int i10;
        tn tnVar = this.f42477a;
        if (tnVar.onFragmentCreate()) {
            this.f42479c = tnVar.fragmentView;
            tnVar.setParentLayout(this.f42478b);
            View view = this.f42479c;
            if (view == null) {
                this.f42479c = tnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    tnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f42479c);
                }
            }
            nj njVar = tnVar.f41737x0;
            if (njVar != null && (i10 = this.d) != 0) {
                njVar.setPadding(0, i10, 0, 0);
            }
            tnVar.ua();
            addView(this.f42479c, w7.z5.c(-1.0f, -1));
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
