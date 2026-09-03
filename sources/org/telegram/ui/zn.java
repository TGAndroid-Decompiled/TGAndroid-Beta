package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class zn extends FrameLayout {
    public final yn f43986a;
    public final org.telegram.ui.ActionBar.f5 f43987b;
    public View f43988c;
    public int d;
    public boolean f43989e;

    public zn(Context context, org.telegram.ui.ActionBar.f5 f5Var, Bundle bundle) {
        super(context);
        this.f43989e = true;
        this.f43987b = f5Var;
        yn ynVar = new yn(this, bundle);
        this.f43986a = ynVar;
        ynVar.La = true;
    }

    public void a() {
        int i10;
        yn ynVar = this.f43986a;
        if (ynVar.onFragmentCreate()) {
            this.f43988c = ynVar.fragmentView;
            ynVar.setParentLayout(this.f43987b);
            View view = this.f43988c;
            if (view == null) {
                this.f43988c = ynVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    ynVar.onRemoveFromParent();
                    viewGroup.removeView(this.f43988c);
                }
            }
            qj qjVar = ynVar.f43340u0;
            if (qjVar != null && (i10 = this.d) != 0) {
                qjVar.setPadding(0, i10, 0, 0);
            }
            ynVar.pa();
            addView(this.f43988c, k7.c6.c(-1.0f, -1));
            if (this.f43989e) {
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

    public void b(boolean z4) {
    }
}
