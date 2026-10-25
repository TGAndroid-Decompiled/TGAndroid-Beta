package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class wn extends FrameLayout {
    public final vn f45518a;
    public final org.telegram.ui.ActionBar.j5 f45519b;
    public View f45520c;
    public int d;
    public boolean e;

    public wn(Context context, org.telegram.ui.ActionBar.j5 j5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.f45519b = j5Var;
        vn vnVar = new vn(this, bundle);
        this.f45518a = vnVar;
        vnVar.f44201bb = true;
    }

    public void a() {
        int i10;
        vn vnVar = this.f45518a;
        if (vnVar.onFragmentCreate()) {
            this.f45520c = vnVar.fragmentView;
            vnVar.setParentLayout(this.f45519b);
            View view = this.f45520c;
            if (view == null) {
                this.f45520c = vnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    vnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f45520c);
                }
            }
            oj ojVar = vnVar.f44468x0;
            if (ojVar != null && (i10 = this.d) != 0) {
                ojVar.setPadding(0, i10, 0, 0);
            }
            vnVar.za();
            addView(this.f45520c, org.telegram.ui.Components.gb1.g(-1.0f, -1));
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
