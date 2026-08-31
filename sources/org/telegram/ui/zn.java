package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class zn extends FrameLayout {
    public final yn f43958a;
    public final org.telegram.ui.ActionBar.f5 f43959b;
    public View f43960c;
    public int d;
    public boolean f43961e;

    public zn(Context context, org.telegram.ui.ActionBar.f5 f5Var, Bundle bundle) {
        super(context);
        this.f43961e = true;
        this.f43959b = f5Var;
        yn ynVar = new yn(this, bundle);
        this.f43958a = ynVar;
        ynVar.La = true;
    }

    public void a() {
        int i10;
        yn ynVar = this.f43958a;
        if (ynVar.onFragmentCreate()) {
            this.f43960c = ynVar.fragmentView;
            ynVar.setParentLayout(this.f43959b);
            View view = this.f43960c;
            if (view == null) {
                this.f43960c = ynVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    ynVar.onRemoveFromParent();
                    viewGroup.removeView(this.f43960c);
                }
            }
            qj qjVar = ynVar.f43362u0;
            if (qjVar != null && (i10 = this.d) != 0) {
                qjVar.setPadding(0, i10, 0, 0);
            }
            ynVar.pa();
            addView(this.f43960c, k7.c6.c(-1.0f, -1));
            if (this.f43961e) {
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
