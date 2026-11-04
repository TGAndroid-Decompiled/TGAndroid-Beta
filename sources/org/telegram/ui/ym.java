package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class ym extends FrameLayout {
    public final xm f52363a;
    public final org.telegram.ui.ActionBar.q4 f52364b;
    public View f52365c;
    public int d;
    public boolean f52366e;

    public ym(Context context, org.telegram.ui.ActionBar.q4 q4Var, Bundle bundle) {
        super(context);
        this.f52366e = true;
        this.f52364b = q4Var;
        xm xmVar = new xm(this, bundle);
        this.f52363a = xmVar;
        xmVar.jb = true;
    }

    public void a() {
        int i3;
        xm xmVar = this.f52363a;
        if (xmVar.onFragmentCreate()) {
            this.f52365c = xmVar.fragmentView;
            xmVar.setParentLayout(this.f52364b);
            View view = this.f52365c;
            if (view == null) {
                this.f52365c = xmVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    xmVar.onRemoveFromParent();
                    viewGroup.removeView(this.f52365c);
                }
            }
            wi wiVar = xmVar.A0;
            if (wiVar != null && (i3 = this.d) != 0) {
                wiVar.setPadding(0, i3, 0, 0);
            }
            xmVar.Pa();
            addView(this.f52365c, b8.mf.c(-1.0f, -1));
            if (this.f52366e) {
                xmVar.onResume();
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

    public void setTopPadding(int i3) {
        this.d = i3;
    }

    public void b(boolean z10) {
    }
}
