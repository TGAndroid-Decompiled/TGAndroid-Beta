package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class wn extends FrameLayout {
    public final vn f43128a;
    public final org.telegram.ui.ActionBar.z4 f43129b;
    public View f43130c;
    public int d;
    public boolean e;

    public wn(Context context, org.telegram.ui.ActionBar.z4 z4Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.f43129b = z4Var;
        vn vnVar = new vn(this, bundle);
        this.f43128a = vnVar;
        vnVar.f42100ib = true;
    }

    public void a() {
        int i10;
        vn vnVar = this.f43128a;
        if (vnVar.onFragmentCreate()) {
            this.f43130c = vnVar.fragmentView;
            vnVar.setParentLayout(this.f43129b);
            View view = this.f43130c;
            if (view == null) {
                this.f43130c = vnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    vnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f43130c);
                }
            }
            vj vjVar = vnVar.f42303z0;
            if (vjVar != null && (i10 = this.d) != 0) {
                vjVar.setPadding(0, i10, 0, 0);
            }
            vnVar.Ka();
            addView(this.f43130c, w7.b6.c(-1.0f, -1));
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
