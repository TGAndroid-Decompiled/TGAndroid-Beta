package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.AndroidUtilities;

public final class ta1 extends org.telegram.ui.Components.zk0 {
    public final int T2;

    public ta1(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.T2 = i10;
    }

    @Override
    public Integer W0(int i10) {
        switch (this.T2) {
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
                return super.W0(i10);
            case 7:
                return 0;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
            case 0:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                break;
            case 5:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent = getParent().getParent();
                    boolean z10 = true;
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z10 = false;
                    }
                    parent.requestDisallowInterceptTouchEvent(z10);
                }
                break;
            case 12:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                break;
            case 13:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent2 = getParent().getParent();
                    boolean z11 = true;
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z11 = false;
                    }
                    parent2.requestDisallowInterceptTouchEvent(z11);
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.T2) {
            case 6:
                int size = View.MeasureSpec.getSize(i11);
                int iH = (getAdapter().h() * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(4.0f);
                if (iH <= size) {
                    size = iH;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                break;
            case 9:
                int size2 = View.MeasureSpec.getSize(i11);
                int iH2 = (getAdapter().h() * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(4.0f);
                if (iH2 <= size2) {
                    size2 = iH2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
            case 11:
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void q0(View view, View view2) {
        switch (this.T2) {
            case 4:
                if (view instanceof org.telegram.ui.Cells.z5) {
                    super.q0(view, view2);
                    break;
                }
                break;
            case 10:
                if (view instanceof org.telegram.ui.Cells.z5) {
                    super.q0(view, view2);
                    break;
                }
                break;
            default:
                super.q0(view, view2);
                break;
        }
    }

    @Override
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.T2) {
            case 4:
                rect.bottom = AndroidUtilities.dp(60.0f) + rect.bottom;
                break;
            case 10:
                rect.bottom = AndroidUtilities.dp(60.0f) + rect.bottom;
                break;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override
    public boolean requestFocus(int i10, Rect rect) {
        switch (this.T2) {
            case 8:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    public ta1(Context context) {
        super(context, null);
        this.T2 = 11;
    }
}
