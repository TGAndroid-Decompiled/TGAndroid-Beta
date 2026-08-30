package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class zn extends FrameLayout {
    public final yn f40837a;
    public final org.telegram.ui.ActionBar.e5 f40838b;
    public View f40839c;
    public int d;
    public boolean e;

    public zn(Context context, org.telegram.ui.ActionBar.e5 e5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.f40838b = e5Var;
        yn ynVar = new yn(this, bundle);
        this.f40837a = ynVar;
        ynVar.La = true;
    }

    public void a() {
        int i10;
        yn ynVar = this.f40837a;
        if (ynVar.onFragmentCreate()) {
            this.f40839c = ynVar.fragmentView;
            ynVar.setParentLayout(this.f40838b);
            View view = this.f40839c;
            if (view == null) {
                this.f40839c = ynVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    ynVar.onRemoveFromParent();
                    viewGroup.removeView(this.f40839c);
                }
            }
            qj qjVar = ynVar.f40193u0;
            if (qjVar != null && (i10 = this.d) != 0) {
                qjVar.setPadding(0, i10, 0, 0);
            }
            ynVar.pa();
            addView(this.f40839c, k7.b6.c(-1.0f, -1));
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

    public void b(boolean z4) {
    }
}
