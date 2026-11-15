package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ti implements View.OnTouchListener {
    public View f51591a;
    public org.telegram.ui.ActionBar.g1 f51592b;
    public final Rect f51593c = new Rect();
    public boolean d;
    public boolean f51594e;
    public final org.telegram.ui.Components.d10 f51595f;
    public final int[] h;
    public View f51596n;
    public float f51597r;
    public float f51598s;
    public final View f51599w;
    public final an f51600x;

    public ti(an anVar, ImageView imageView) {
        this.f51600x = anVar;
        this.f51599w = imageView;
        org.telegram.ui.Components.d10 d10Var = new org.telegram.ui.Components.d10((Context) null, new f(this, 22));
        this.f51595f = d10Var;
        this.h = new int[2];
        d10Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f51591a = view;
        if (motionEvent.getAction() == 0) {
            this.f51597r = motionEvent.getX();
            this.f51598s = motionEvent.getY();
            this.f51594e = false;
        }
        this.f51595f.a(motionEvent);
        if (this.f51592b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f51591a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y10 = motionEvent.getY() + iArr[1];
            this.f51592b.getContentView().getLocationOnScreen(iArr);
            float f10 = x10 - iArr[0];
            float f11 = y10 - iArr[1];
            this.f51596n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f51592b.getContentView();
            for (int i7 = 0; i7 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i7++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i7);
                Rect rect = this.f51593c;
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
                        this.f51596n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f51597r) > org.telegram.messenger.g0.f23588e * 2.0f) || Math.abs(motionEvent.getY() - this.f51598s) > org.telegram.messenger.g0.f23588e * 2.0f) {
            this.f51594e = true;
            this.f51591a.setPressed(false);
            this.f51591a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.f51594e) {
            View view4 = this.f51596n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f51592b == null && (view2 = this.f51591a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
