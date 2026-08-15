package org.telegram.ui.recyclerview;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public abstract class LinearSmoothScrollerEnd extends RecyclerView.SmoothScroller {
    private final float MILLISECONDS_PER_PX;
    protected PointF mTargetVector;
    protected final LinearInterpolator mLinearInterpolator = new LinearInterpolator();
    protected final DecelerateInterpolator mDecelerateInterpolator = new DecelerateInterpolator(1.5f);
    protected int mInterimTargetDx = 0;
    protected int mInterimTargetDy = 0;

    private int clampApplyScroll(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    @Override
    protected void onStart() {
    }

    public LinearSmoothScrollerEnd(Context context) {
        this.MILLISECONDS_PER_PX = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    protected void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        int iCalculateDxToMakeVisible = calculateDxToMakeVisible(view);
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(iCalculateDxToMakeVisible);
        if (iCalculateTimeForDeceleration > 0) {
            action.update(-iCalculateDxToMakeVisible, 0, Math.max(400, iCalculateTimeForDeceleration), this.mDecelerateInterpolator);
        }
    }

    @Override
    protected void onSeekTargetStep(int i, int i2, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        if (getChildCount() == 0) {
            stop();
            return;
        }
        this.mInterimTargetDx = clampApplyScroll(this.mInterimTargetDx, i);
        int iClampApplyScroll = clampApplyScroll(this.mInterimTargetDy, i2);
        this.mInterimTargetDy = iClampApplyScroll;
        if (this.mInterimTargetDx == 0 && iClampApplyScroll == 0) {
            updateActionForInterimTarget(action);
        }
    }

    @Override
    protected void onStop() {
        this.mInterimTargetDy = 0;
        this.mInterimTargetDx = 0;
        this.mTargetVector = null;
    }

    protected int calculateTimeForDeceleration(int i) {
        return (int) Math.ceil(calculateTimeForScrolling(i) / 0.3356d);
    }

    protected int calculateTimeForScrolling(int i) {
        return (int) Math.ceil(Math.abs(i) * this.MILLISECONDS_PER_PX);
    }

    protected void updateActionForInterimTarget(RecyclerView.SmoothScroller.Action action) {
        PointF pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(getTargetPosition());
        if (pointFComputeScrollVectorForPosition == null || (pointFComputeScrollVectorForPosition.x == 0.0f && pointFComputeScrollVectorForPosition.y == 0.0f)) {
            action.jumpTo(getTargetPosition());
            stop();
            return;
        }
        normalize(pointFComputeScrollVectorForPosition);
        this.mTargetVector = pointFComputeScrollVectorForPosition;
        this.mInterimTargetDx = (int) (pointFComputeScrollVectorForPosition.x * 10000.0f);
        this.mInterimTargetDy = (int) (pointFComputeScrollVectorForPosition.y * 10000.0f);
        action.update((int) (this.mInterimTargetDx * 1.2f), (int) (this.mInterimTargetDy * 1.2f), (int) (calculateTimeForScrolling(10000) * 1.2f), this.mLinearInterpolator);
    }

    public int calculateDxToMakeVisible(View view) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            int decoratedLeft = layoutManager.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            int decoratedRight = layoutManager.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            int paddingLeft = layoutManager.getPaddingLeft();
            int width = layoutManager.getWidth() - layoutManager.getPaddingRight();
            if (decoratedLeft > paddingLeft && decoratedRight < width) {
                return 0;
            }
            int i = decoratedRight - decoratedLeft;
            int i2 = (width - paddingLeft) - i;
            int i3 = i + i2;
            int i4 = i2 - decoratedLeft;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i3 - decoratedRight;
            if (i5 < 0) {
                return i5;
            }
        }
        return 0;
    }

    @Override
    public PointF computeScrollVectorForPosition(int i) {
        Object layoutManager = getLayoutManager();
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(i);
        }
        return null;
    }
}
