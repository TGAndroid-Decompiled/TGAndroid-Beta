package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class wn extends FrameLayout {
    public final vn f43336a;
    public final org.telegram.ui.ActionBar.z4 f43337b;
    public View f43338c;
    public int d;
    public boolean e;

    public wn(Context context, org.telegram.ui.ActionBar.z4 z4Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.f43337b = z4Var;
        vn vnVar = new vn(this, bundle);
        this.f43336a = vnVar;
        vnVar.f42289ib = true;
    }

    public void a() {
        int i10;
        vn vnVar = this.f43336a;
        if (vnVar.onFragmentCreate()) {
            this.f43338c = vnVar.fragmentView;
            vnVar.setParentLayout(this.f43337b);
            View view = this.f43338c;
            if (view == null) {
                this.f43338c = vnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    vnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f43338c);
                }
            }
            vj vjVar = vnVar.f42492z0;
            if (vjVar != null && (i10 = this.d) != 0) {
                vjVar.setPadding(0, i10, 0, 0);
            }
            vnVar.Fa();
            addView(this.f43338c, w7.b6.c(-1.0f, -1));
            if (this.e) {
                vnVar.onResume();
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
