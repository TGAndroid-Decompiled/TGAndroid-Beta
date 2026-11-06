package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ti implements View.OnTouchListener {
    public View f50046a;
    public org.telegram.ui.ActionBar.g1 f50047b;
    public final Rect f50048c = new Rect();
    public boolean d;
    public boolean f50049e;
    public final org.telegram.ui.Components.z00 f50050f;
    public final int[] h;
    public View f50051n;
    public float f50052r;
    public float f50053s;
    public final View f50054w;
    public final an f50055x;

    public ti(an anVar, ImageView imageView) {
        this.f50055x = anVar;
        this.f50054w = imageView;
        org.telegram.ui.Components.z00 z00Var = new org.telegram.ui.Components.z00((Context) null, new f(this, 22));
        this.f50050f = z00Var;
        this.h = new int[2];
        z00Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f50046a = view;
        if (motionEvent.getAction() == 0) {
            this.f50052r = motionEvent.getX();
            this.f50053s = motionEvent.getY();
            this.f50049e = false;
        }
        this.f50050f.a(motionEvent);
        if (this.f50047b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f50046a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y10 = motionEvent.getY() + iArr[1];
            this.f50047b.getContentView().getLocationOnScreen(iArr);
            float f10 = x10 - iArr[0];
            float f11 = y10 - iArr[1];
            this.f50051n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f50047b.getContentView();
            for (int i7 = 0; i7 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i7++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i7);
                Rect rect = this.f50048c;
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
                        this.f50051n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f50052r) > org.telegram.messenger.g0.f22516e * 2.0f) || Math.abs(motionEvent.getY() - this.f50053s) > org.telegram.messenger.g0.f22516e * 2.0f) {
            this.f50049e = true;
            this.f50046a.setPressed(false);
            this.f50046a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.f50049e) {
            View view4 = this.f50051n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f50047b == null && (view2 = this.f50046a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
