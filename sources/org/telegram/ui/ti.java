package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ti implements View.OnTouchListener {
    public View f51592a;
    public org.telegram.ui.ActionBar.g1 f51593b;
    public final Rect f51594c = new Rect();
    public boolean d;
    public boolean f51595e;
    public final org.telegram.ui.Components.d10 f51596f;
    public final int[] h;
    public View f51597n;
    public float f51598r;
    public float f51599s;
    public final View f51600w;
    public final an f51601x;

    public ti(an anVar, ImageView imageView) {
        this.f51601x = anVar;
        this.f51600w = imageView;
        org.telegram.ui.Components.d10 d10Var = new org.telegram.ui.Components.d10((Context) null, new f(this, 22));
        this.f51596f = d10Var;
        this.h = new int[2];
        d10Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f51592a = view;
        if (motionEvent.getAction() == 0) {
            this.f51598r = motionEvent.getX();
            this.f51599s = motionEvent.getY();
            this.f51595e = false;
        }
        this.f51596f.a(motionEvent);
        if (this.f51593b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f51592a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y10 = motionEvent.getY() + iArr[1];
            this.f51593b.getContentView().getLocationOnScreen(iArr);
            float f10 = x10 - iArr[0];
            float f11 = y10 - iArr[1];
            this.f51597n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f51593b.getContentView();
            for (int i7 = 0; i7 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i7++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i7);
                Rect rect = this.f51594c;
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
                        this.f51597n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f51598r) > org.telegram.messenger.g0.f23590e * 2.0f) || Math.abs(motionEvent.getY() - this.f51599s) > org.telegram.messenger.g0.f23590e * 2.0f) {
            this.f51595e = true;
            this.f51592a.setPressed(false);
            this.f51592a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.f51595e) {
            View view4 = this.f51597n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f51593b == null && (view2 = this.f51592a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
