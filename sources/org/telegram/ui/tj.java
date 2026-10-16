package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class tj implements View.OnTouchListener {
    public View f40124a;
    public org.telegram.ui.ActionBar.m1 f40125b;
    public final Rect f40126c = new Rect();
    public boolean d;
    public boolean e;
    public final org.telegram.ui.Components.w20 f40127f;
    public final int[] h;
    public View f40128n;
    public float f40129r;
    public float f40130s;
    public final View v;
    public final fo f40131w;

    public tj(fo foVar, ImageView imageView) {
        this.f40131w = foVar;
        this.v = imageView;
        org.telegram.ui.Components.w20 w20Var = new org.telegram.ui.Components.w20((Context) null, new g(this, 24));
        this.f40127f = w20Var;
        this.h = new int[2];
        w20Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f40124a = view;
        if (motionEvent.getAction() == 0) {
            this.f40129r = motionEvent.getX();
            this.f40130s = motionEvent.getY();
            this.e = false;
        }
        this.f40127f.a(motionEvent);
        if (this.f40125b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f40124a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y3 = motionEvent.getY() + iArr[1];
            this.f40125b.getContentView().getLocationOnScreen(iArr);
            float f7 = x10 - iArr[0];
            float f10 = y3 - iArr[1];
            this.f40128n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f40125b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                Rect rect = this.f40126c;
                childAt.getHitRect(rect);
                childAt.getTag();
                if (childAt.getVisibility() == 0 && childAt.isClickable()) {
                    if (!rect.contains((int) f7, (int) f10)) {
                        childAt.setPressed(false);
                        childAt.setSelected(false);
                    } else {
                        childAt.setPressed(true);
                        childAt.setSelected(true);
                        childAt.drawableHotspotChanged(f7, f10 - childAt.getTop());
                        this.f40128n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f40129r) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.f40130s) > AndroidUtilities.touchSlop * 2.0f) {
            this.e = true;
            this.f40124a.setPressed(false);
            this.f40124a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.e) {
            View view4 = this.f40128n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f40125b == null && (view2 = this.f40124a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
