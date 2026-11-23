package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ui implements View.OnTouchListener {
    public View f52667a;
    public org.telegram.ui.ActionBar.g1 f52668b;
    public final Rect f52669c = new Rect();
    public boolean d;
    public boolean f52670e;
    public final org.telegram.ui.Components.l10 f52671f;
    public final int[] h;
    public View f52672n;
    public float f52673r;
    public float f52674s;
    public final View f52675w;
    public final bn f52676x;

    public ui(bn bnVar, ImageView imageView) {
        this.f52676x = bnVar;
        this.f52675w = imageView;
        org.telegram.ui.Components.l10 l10Var = new org.telegram.ui.Components.l10((Context) null, new f(this, 22));
        this.f52671f = l10Var;
        this.h = new int[2];
        l10Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f52667a = view;
        if (motionEvent.getAction() == 0) {
            this.f52673r = motionEvent.getX();
            this.f52674s = motionEvent.getY();
            this.f52670e = false;
        }
        this.f52671f.a(motionEvent);
        if (this.f52668b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f52667a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y10 = motionEvent.getY() + iArr[1];
            this.f52668b.getContentView().getLocationOnScreen(iArr);
            float f10 = x10 - iArr[0];
            float f11 = y10 - iArr[1];
            this.f52672n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f52668b.getContentView();
            for (int i7 = 0; i7 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i7++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i7);
                Rect rect = this.f52669c;
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
                        this.f52672n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f52673r) > org.telegram.messenger.g0.f24205e * 2.0f) || Math.abs(motionEvent.getY() - this.f52674s) > org.telegram.messenger.g0.f24205e * 2.0f) {
            this.f52670e = true;
            this.f52667a.setPressed(false);
            this.f52667a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.f52670e) {
            View view4 = this.f52672n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f52668b == null && (view2 = this.f52667a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
