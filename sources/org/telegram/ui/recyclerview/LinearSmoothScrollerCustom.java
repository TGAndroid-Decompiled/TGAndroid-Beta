package org.telegram.ui.recyclerview;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public class LinearSmoothScrollerCustom extends RecyclerView.SmoothScroller {
    private final float MILLISECONDS_PER_PX;
    private float durationMultiplier;
    protected final DecelerateInterpolator mDecelerateInterpolator;
    protected int mInterimTargetDx;
    protected int mInterimTargetDy;
    protected final LinearInterpolator mLinearInterpolator;
    protected PointF mTargetVector;
    private int offset;
    private int scrollPosition;

    private int clampApplyScroll(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    public void onEnd() {
    }

    @Override
    protected void onStart() {
    }

    public LinearSmoothScrollerCustom(Context context, int i) {
        this.mLinearInterpolator = new LinearInterpolator();
        this.mDecelerateInterpolator = new DecelerateInterpolator(1.5f);
        this.mInterimTargetDx = 0;
        this.mInterimTargetDy = 0;
        this.durationMultiplier = 1.0f;
        this.MILLISECONDS_PER_PX = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.scrollPosition = i;
    }

    public LinearSmoothScrollerCustom(Context context, int i, float f) {
        this.mLinearInterpolator = new LinearInterpolator();
        this.mDecelerateInterpolator = new DecelerateInterpolator(1.5f);
        this.mInterimTargetDx = 0;
        this.mInterimTargetDy = 0;
        this.durationMultiplier = f;
        this.MILLISECONDS_PER_PX = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f;
        this.scrollPosition = i;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    @Override
    protected void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        int iCalculateDyToMakeVisible = calculateDyToMakeVisible(view);
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(iCalculateDyToMakeVisible);
        if (iCalculateTimeForDeceleration > 0) {
            action.update(0, -iCalculateDyToMakeVisible, Math.max((int) (this.durationMultiplier * 400.0f), iCalculateTimeForDeceleration), this.mDecelerateInterpolator);
        } else {
            onEnd();
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

    public int calculateDyToMakeVisible(View view) {
        int paddingTop;
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            int decoratedTop = layoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int decoratedBottom = layoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int height = (layoutManager.getHeight() - layoutManager.getPaddingBottom()) - layoutManager.getPaddingTop();
            int i = decoratedBottom - decoratedTop;
            int i2 = this.scrollPosition;
            if (i2 == 2) {
                paddingTop = layoutManager.getPaddingTop() + this.offset;
            } else if (i > height) {
                paddingTop = 0;
            } else if (i2 == 0) {
                paddingTop = (height - i) / 2;
            } else {
                paddingTop = (layoutManager.getPaddingTop() + this.offset) - AndroidUtilities.dp(88.0f);
            }
            int i3 = i + paddingTop;
            int i4 = paddingTop - decoratedTop;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i3 - decoratedBottom;
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
