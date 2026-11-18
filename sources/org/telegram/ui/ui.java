package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ui implements View.OnTouchListener {
    public View f52571a;
    public org.telegram.ui.ActionBar.h1 f52572b;
    public final Rect f52573c = new Rect();
    public boolean d;
    public boolean f52574e;
    public final org.telegram.ui.Components.k10 f52575f;
    public final int[] h;
    public View f52576n;
    public float f52577r;
    public float f52578s;
    public final View f52579w;
    public final bn f52580x;

    public ui(bn bnVar, ImageView imageView) {
        this.f52580x = bnVar;
        this.f52579w = imageView;
        org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10((Context) null, new f(this, 22));
        this.f52575f = k10Var;
        this.h = new int[2];
        k10Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f52571a = view;
        if (motionEvent.getAction() == 0) {
            this.f52577r = motionEvent.getX();
            this.f52578s = motionEvent.getY();
            this.f52574e = false;
        }
        this.f52575f.a(motionEvent);
        if (this.f52572b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f52571a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y10 = motionEvent.getY() + iArr[1];
            this.f52572b.getContentView().getLocationOnScreen(iArr);
            float f10 = x10 - iArr[0];
            float f11 = y10 - iArr[1];
            this.f52576n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f52572b.getContentView();
            for (int i7 = 0; i7 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i7++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i7);
                Rect rect = this.f52573c;
                childAt.getHitRect(rect);
                childAt.getTag();
                if (childAt.getVisibility() == 0 && childAt.isClickable()) {
                    if (!rect.contains((int) f10, (int) f11)) {
                        childAt.setPressed(false);
                        childAt.setSelected(false);
                    } else {
                        childAt.setPressed(true);
                        childAt.setSelected(true);
                        childAt.drawableHotspotChanged(f10, f11 - childAt.getTop());
                        this.f52576n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f52577r) > org.telegram.messenger.g0.f24100e * 2.0f) || Math.abs(motionEvent.getY() - this.f52578s) > org.telegram.messenger.g0.f24100e * 2.0f) {
            this.f52574e = true;
            this.f52571a.setPressed(false);
            this.f52571a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.f52574e) {
            View view4 = this.f52576n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f52572b == null && (view2 = this.f52571a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
