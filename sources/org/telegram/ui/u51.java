package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
public final class u51 extends org.telegram.ui.Components.tj0 {
    public final int f49984f3;

    public u51(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f49984f3 = i3;
    }

    @Override
    public Integer V0(int i3) {
        switch (this.f49984f3) {
            case 1:
                return 0;
            case 3:
                return 0;
            case 4:
                return 0;
            case 8:
                return 0;
            default:
                return super.V0(i3);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f49984f3) {
            case 0:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 2:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent = getParent().getParent();
                    boolean z10 = true;
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z10 = false;
                    }
                    parent.requestDisallowInterceptTouchEvent(z10);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 6:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent2 = getParent().getParent();
                    boolean z11 = true;
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z11 = false;
                    }
                    parent2.requestDisallowInterceptTouchEvent(z11);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 13:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f49984f3) {
            case 7:
                int size = View.MeasureSpec.getSize(i10);
                int b10 = (getAdapter().b() * org.telegram.messenger.g0.L(50.0f)) + org.telegram.messenger.g0.L(4.0f);
                if (b10 <= size) {
                    size = b10;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                return;
            case 10:
                int size2 = View.MeasureSpec.getSize(i10);
                int b11 = (getAdapter().b() * org.telegram.messenger.g0.L(50.0f)) + org.telegram.messenger.g0.L(4.0f);
                if (b11 <= size2) {
                    size2 = b11;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f49984f3) {
            case 12:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void r0(View view, View view2) {
        switch (this.f49984f3) {
            case 5:
                if (view instanceof org.telegram.ui.Cells.z5) {
                    super.r0(view, view2);
                    return;
                }
                return;
            case 11:
                if (view instanceof org.telegram.ui.Cells.z5) {
                    super.r0(view, view2);
                    return;
                }
                return;
            default:
                super.r0(view, view2);
                return;
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.f49984f3) {
            case 5:
                rect.bottom = org.telegram.messenger.g0.L(60.0f) + rect.bottom;
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 11:
                rect.bottom = org.telegram.messenger.g0.L(60.0f) + rect.bottom;
                return super.requestChildRectangleOnScreen(view, rect, z10);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z10);
        }
    }

    @Override
    public boolean requestFocus(int i3, Rect rect) {
        switch (this.f49984f3) {
            case 9:
                return false;
            default:
                return super.requestFocus(i3, rect);
        }
    }

    public u51(Context context) {
        super(context, null);
        this.f49984f3 = 12;
    }
}
