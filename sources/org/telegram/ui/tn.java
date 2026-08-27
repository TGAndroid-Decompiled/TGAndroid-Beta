package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public abstract class tn extends FrameLayout {

    public final sn f42977a;

    public final org.telegram.ui.ActionBar.b5 f42978b;

    public View f42979c;
    public int d;

    public boolean f42980e;

    public tn(Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context);
        this.f42980e = true;
        this.f42978b = b5Var;
        sn snVar = new sn(this, bundle);
        this.f42977a = snVar;
        snVar.Ka = true;
    }

    public void a() {
        int i10;
        sn snVar = this.f42977a;
        if (snVar.onFragmentCreate()) {
            this.f42979c = snVar.fragmentView;
            snVar.setParentLayout(this.f42978b);
            View view = this.f42979c;
            if (view == null) {
                this.f42979c = snVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    snVar.onRemoveFromParent();
                    viewGroup.removeView(this.f42979c);
                }
            }
            kj kjVar = snVar.f42213t0;
            if (kjVar != null && (i10 = this.d) != 0) {
                kjVar.setPadding(0, i10, 0, 0);
            }
            snVar.pa();
            addView(this.f42979c, h7.z5.c(-1.0f, -1));
            if (this.f42980e) {
                snVar.onResume();
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
