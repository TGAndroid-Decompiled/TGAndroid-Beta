package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class wn extends FrameLayout {
    public final vn f45521a;
    public final org.telegram.ui.ActionBar.j5 f45522b;
    public View f45523c;
    public int d;
    public boolean e;

    public wn(Context context, org.telegram.ui.ActionBar.j5 j5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.f45522b = j5Var;
        vn vnVar = new vn(this, bundle);
        this.f45521a = vnVar;
        vnVar.f44204bb = true;
    }

    public void a() {
        int i10;
        vn vnVar = this.f45521a;
        if (vnVar.onFragmentCreate()) {
            this.f45523c = vnVar.fragmentView;
            vnVar.setParentLayout(this.f45522b);
            View view = this.f45523c;
            if (view == null) {
                this.f45523c = vnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    vnVar.onRemoveFromParent();
                    viewGroup.removeView(this.f45523c);
                }
            }
            oj ojVar = vnVar.f44471x0;
            if (ojVar != null && (i10 = this.d) != 0) {
                ojVar.setPadding(0, i10, 0, 0);
            }
            vnVar.za();
            addView(this.f45523c, org.telegram.ui.Components.gb1.g(-1.0f, -1));
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
