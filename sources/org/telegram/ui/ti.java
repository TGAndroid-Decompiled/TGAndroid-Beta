package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ti implements View.OnTouchListener {
    public View f50065a;
    public org.telegram.ui.ActionBar.g1 f50066b;
    public final Rect f50067c = new Rect();
    public boolean d;
    public boolean f50068e;
    public final org.telegram.ui.Components.a10 f50069f;
    public final int[] h;
    public View f50070n;
    public float f50071r;
    public float f50072s;
    public final View f50073w;
    public final an f50074x;

    public ti(an anVar, ImageView imageView) {
        this.f50074x = anVar;
        this.f50073w = imageView;
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10((Context) null, new f(this, 22));
        this.f50069f = a10Var;
        this.h = new int[2];
        a10Var.v = true;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.f50065a = view;
        if (motionEvent.getAction() == 0) {
            this.f50071r = motionEvent.getX();
            this.f50072s = motionEvent.getY();
            this.f50068e = false;
        }
        this.f50069f.a(motionEvent);
        if (this.f50066b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.f50065a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y10 = motionEvent.getY() + iArr[1];
            this.f50066b.getContentView().getLocationOnScreen(iArr);
            float f10 = x10 - iArr[0];
            float f11 = y10 - iArr[1];
            this.f50070n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f50066b.getContentView();
            for (int i7 = 0; i7 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i7++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i7);
                Rect rect = this.f50067c;
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
                        this.f50070n = childAt;
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f50071r) > org.telegram.messenger.g0.f22542e * 2.0f) || Math.abs(motionEvent.getY() - this.f50072s) > org.telegram.messenger.g0.f22542e * 2.0f) {
            this.f50068e = true;
            this.f50065a.setPressed(false);
            this.f50065a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.f50068e) {
            View view4 = this.f50070n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            } else if (this.f50066b == null && (view2 = this.f50065a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
