package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class sn extends FrameLayout {
    public final rn f41491a;
    public final org.telegram.ui.ActionBar.d5 f41492b;
    public View f41493c;
    public int d;
    public boolean e;

    public sn(Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.f41492b = d5Var;
        rn rnVar = new rn(this, bundle);
        this.f41491a = rnVar;
        rnVar.Pa = true;
    }

    public void a() {
        int i10;
        rn rnVar = this.f41491a;
        if (rnVar.onFragmentCreate()) {
            this.f41493c = rnVar.fragmentView;
            rnVar.setParentLayout(this.f41492b);
            View view = this.f41493c;
            if (view == null) {
                this.f41493c = rnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    rnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f41493c);
                }
            }
            nj njVar = rnVar.f40903x0;
            if (njVar != null && (i10 = this.d) != 0) {
                njVar.setPadding(0, i10, 0, 0);
            }
            rnVar.ua();
            addView(this.f41493c, w7.z5.c(-1.0f, -1));
            if (this.e) {
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

    public void setTopPadding(int i10) {
        this.d = i10;
    }

    public void b(boolean z10) {
    }
}
