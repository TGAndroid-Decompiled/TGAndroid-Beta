package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class vi implements View.OnTouchListener {
    public View f50738a;
    public org.telegram.ui.ActionBar.g1 f50739b;
    public final Rect f50740c = new Rect();
    public boolean d;
    public boolean f50741e;
    public final org.telegram.ui.Components.z00 f50742f;
    public final int[] h;
    public View f50743n;
    public float f50744r;
    public float f50745s;
    public final View f50746w;
    public final cn f50747x;

    public vi(cn cnVar, ImageView imageView) {
        this.f50747x = cnVar;
        this.f50746w = imageView;
        org.telegram.ui.Components.z00 z00Var = new org.telegram.ui.Components.z00((Context) null, new f(this, 22));
        this.f50742f = z00Var;
        this.h = new int[2];
        z00Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f50738a = view;
        if (motionEvent.getAction() == 0) {
            this.f50744r = motionEvent.getX();
            this.f50745s = motionEvent.getY();
            this.f50741e = false;
        }
        this.f50742f.a(motionEvent);
        if (this.f50739b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f50738a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y10 = motionEvent.getY() + iArr[1];
            this.f50739b.getContentView().getLocationOnScreen(iArr);
            float f10 = x10 - iArr[0];
            float f11 = y10 - iArr[1];
            this.f50743n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f50739b.getContentView();
            for (int i7 = 0; i7 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i7++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i7);
                Rect rect = this.f50740c;
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
                        this.f50743n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f50744r) > org.telegram.messenger.g0.f22546e * 2.0f) || Math.abs(motionEvent.getY() - this.f50745s) > org.telegram.messenger.g0.f22546e * 2.0f) {
            this.f50741e = true;
            this.f50738a.setPressed(false);
            this.f50738a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.f50741e) {
            View view4 = this.f50743n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f50739b == null && (view2 = this.f50738a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
