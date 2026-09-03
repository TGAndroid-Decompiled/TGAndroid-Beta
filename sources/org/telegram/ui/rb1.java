package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;
public final class rb1 extends org.telegram.ui.Components.rl0 {
    public final int U2;

    public rb1(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.U2 = i10;
    }

    @Override
    public Integer V0(int i10) {
        switch (this.U2) {
            case 1:
                return 0;
            case 2:
                return 0;
            case 3:
                return 0;
            case 4:
            case 5:
            case 6:
            default:
                return super.V0(i10);
            case 7:
                return 0;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.U2) {
            case 0:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 5:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent = getParent().getParent();
                    boolean z4 = true;
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z4 = false;
                    }
                    parent.requestDisallowInterceptTouchEvent(z4);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 12:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 13:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent2 = getParent().getParent();
                    boolean z10 = true;
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z10 = false;
                    }
                    parent2.requestDisallowInterceptTouchEvent(z10);
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.U2) {
            case 6:
                int size = View.MeasureSpec.getSize(i11);
                int h = (getAdapter().h() * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(4.0f);
                if (h <= size) {
                    size = h;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                return;
            case 9:
                int size2 = View.MeasureSpec.getSize(i11);
                int h9 = (getAdapter().h() * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(4.0f);
                if (h9 <= size2) {
                    size2 = h9;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.U2) {
            case 11:
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
        switch (this.U2) {
            case 4:
                if (view instanceof org.telegram.ui.Cells.b6) {
                    super.q0(view, view2);
                    return;
                }
                return;
            case 10:
                if (view instanceof org.telegram.ui.Cells.b6) {
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
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        switch (this.U2) {
            case 4:
                rect.bottom = AndroidUtilities.dp(60.0f) + rect.bottom;
                return super.requestChildRectangleOnScreen(view, rect, z4);
            case 10:
                rect.bottom = AndroidUtilities.dp(60.0f) + rect.bottom;
                return super.requestChildRectangleOnScreen(view, rect, z4);
            default:
                return super.requestChildRectangleOnScreen(view, rect, z4);
        }
    }

    @Override
    public boolean requestFocus(int i10, Rect rect) {
        switch (this.U2) {
            case 8:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    public rb1(Context context) {
        super(context, null);
        this.U2 = 11;
    }
}
