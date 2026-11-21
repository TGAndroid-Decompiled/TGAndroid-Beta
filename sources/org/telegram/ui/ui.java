package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ui implements View.OnTouchListener {
    public View f52573a;
    public org.telegram.ui.ActionBar.g1 f52574b;
    public final Rect f52575c = new Rect();
    public boolean d;
    public boolean f52576e;
    public final org.telegram.ui.Components.n10 f52577f;
    public final int[] h;
    public View f52578n;
    public float f52579r;
    public float f52580s;
    public final View f52581w;
    public final bn f52582x;

    public ui(bn bnVar, ImageView imageView) {
        this.f52582x = bnVar;
        this.f52581w = imageView;
        org.telegram.ui.Components.n10 n10Var = new org.telegram.ui.Components.n10((Context) null, new f(this, 22));
        this.f52577f = n10Var;
        this.h = new int[2];
        n10Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f52573a = view;
        if (motionEvent.getAction() == 0) {
            this.f52579r = motionEvent.getX();
            this.f52580s = motionEvent.getY();
            this.f52576e = false;
        }
        this.f52577f.a(motionEvent);
        if (this.f52574b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f52573a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y10 = motionEvent.getY() + iArr[1];
            this.f52574b.getContentView().getLocationOnScreen(iArr);
            float f10 = x10 - iArr[0];
            float f11 = y10 - iArr[1];
            this.f52578n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f52574b.getContentView();
            for (int i7 = 0; i7 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i7++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i7);
                Rect rect = this.f52575c;
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
                        this.f52578n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f52579r) > org.telegram.messenger.g0.f24125e * 2.0f) || Math.abs(motionEvent.getY() - this.f52580s) > org.telegram.messenger.g0.f24125e * 2.0f) {
            this.f52576e = true;
            this.f52573a.setPressed(false);
            this.f52573a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.f52576e) {
            View view4 = this.f52578n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f52574b == null && (view2 = this.f52573a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
