package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ui implements View.OnTouchListener {
    public View f52577a;
    public org.telegram.ui.ActionBar.g1 f52578b;
    public final Rect f52579c = new Rect();
    public boolean d;
    public boolean f52580e;
    public final org.telegram.ui.Components.n10 f52581f;
    public final int[] h;
    public View f52582n;
    public float f52583r;
    public float f52584s;
    public final View f52585w;
    public final bn f52586x;

    public ui(bn bnVar, ImageView imageView) {
        this.f52586x = bnVar;
        this.f52585w = imageView;
        org.telegram.ui.Components.n10 n10Var = new org.telegram.ui.Components.n10((Context) null, new f(this, 22));
        this.f52581f = n10Var;
        this.h = new int[2];
        n10Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f52577a = view;
        if (motionEvent.getAction() == 0) {
            this.f52583r = motionEvent.getX();
            this.f52584s = motionEvent.getY();
            this.f52580e = false;
        }
        this.f52581f.a(motionEvent);
        if (this.f52578b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f52577a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y10 = motionEvent.getY() + iArr[1];
            this.f52578b.getContentView().getLocationOnScreen(iArr);
            float f10 = x10 - iArr[0];
            float f11 = y10 - iArr[1];
            this.f52582n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f52578b.getContentView();
            for (int i7 = 0; i7 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i7++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i7);
                Rect rect = this.f52579c;
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
                        this.f52582n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f52583r) > org.telegram.messenger.g0.f24025e * 2.0f) || Math.abs(motionEvent.getY() - this.f52584s) > org.telegram.messenger.g0.f24025e * 2.0f) {
            this.f52580e = true;
            this.f52577a.setPressed(false);
            this.f52577a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.f52580e) {
            View view4 = this.f52582n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f52578b == null && (view2 = this.f52577a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
