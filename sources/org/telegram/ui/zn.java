package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class zn extends FrameLayout {
    public final yn f40196a;
    public final org.telegram.ui.ActionBar.c5 f40197b;
    public View f40198c;
    public int d;
    public boolean e;

    public zn(Context context, org.telegram.ui.ActionBar.c5 c5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.f40197b = c5Var;
        yn ynVar = new yn(this, bundle);
        this.f40196a = ynVar;
        ynVar.Oa = true;
    }

    public void a() {
        int i10;
        yn ynVar = this.f40196a;
        if (ynVar.onFragmentCreate()) {
            this.f40198c = ynVar.fragmentView;
            ynVar.setParentLayout(this.f40197b);
            View view = this.f40198c;
            if (view == null) {
                this.f40198c = ynVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    ynVar.onRemoveFromParent();
                    viewGroup.removeView(this.f40198c);
                }
            }
            rj rjVar = ynVar.f39596x0;
            if (rjVar != null && (i10 = this.d) != 0) {
                rjVar.setPadding(0, i10, 0, 0);
            }
            ynVar.pa();
            addView(this.f40198c, w7.x5.c(-1.0f, -1));
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
