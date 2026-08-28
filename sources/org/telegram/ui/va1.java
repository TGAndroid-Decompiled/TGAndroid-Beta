package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
public final class va1 extends org.telegram.ui.Components.wk0 {
    public final int T2;

    public va1(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.T2 = i9;
    }

    @Override
    public Integer W0(int i9) {
        switch (this.T2) {
            case 1:
                return 0;
            case 3:
                return 0;
            case 4:
                return 0;
            case 8:
                return 0;
            default:
                return super.W0(i9);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
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
    public void onMeasure(int i9, int i10) {
        switch (this.T2) {
            case 7:
                int size = View.MeasureSpec.getSize(i10);
                int h = (getAdapter().h() * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(4.0f);
                if (h <= size) {
                    size = h;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                return;
            case 10:
                int size2 = View.MeasureSpec.getSize(i10);
                int h10 = (getAdapter().h() * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(4.0f);
                if (h10 <= size2) {
                    size2 = h10;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
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
    public void q0(View view, View view2) {
        switch (this.T2) {
            case 5:
                if (view instanceof org.telegram.ui.Cells.c6) {
                    super.q0(view, view2);
                    return;
                }
                return;
            case 11:
                if (view instanceof org.telegram.ui.Cells.c6) {
                    super.q0(view, view2);
                    return;
                }
                return;
            default:
                super.q0(view, view2);
                return;
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.T2) {
            case 5:
                rect.bottom = AndroidUtilities.dp(60.0f) + rect.bottom;
                return super.requestChildRectangleOnScreen(view, rect, z10);
            case 11:
                rect.bottom = AndroidUtilities.dp(60.0f) + rect.bottom;
                return super.requestChildRectangleOnScreen(view, rect, z10);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z10);
        }
    }

    @Override
    public boolean requestFocus(int i9, Rect rect) {
        switch (this.T2) {
            case 9:
                return false;
            default:
                return super.requestFocus(i9, rect);
        }
    }

    public va1(Context context) {
        super(context, null);
        this.T2 = 12;
    }
}
