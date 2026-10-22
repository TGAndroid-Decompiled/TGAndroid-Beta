package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class sn extends FrameLayout {
    public final rn f41499a;
    public final org.telegram.ui.ActionBar.d5 f41500b;
    public View f41501c;
    public int d;
    public boolean e;

    public sn(Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.f41500b = d5Var;
        rn rnVar = new rn(this, bundle);
        this.f41499a = rnVar;
        rnVar.Pa = true;
    }

    public void a() {
        int i10;
        rn rnVar = this.f41499a;
        if (rnVar.onFragmentCreate()) {
            this.f41501c = rnVar.fragmentView;
            rnVar.setParentLayout(this.f41500b);
            View view = this.f41501c;
            if (view == null) {
                this.f41501c = rnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    rnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f41501c);
                }
            }
            nj njVar = rnVar.f40904x0;
            if (njVar != null && (i10 = this.d) != 0) {
                njVar.setPadding(0, i10, 0, 0);
            }
            rnVar.ua();
            addView(this.f41501c, w7.z5.c(-1.0f, -1));
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
