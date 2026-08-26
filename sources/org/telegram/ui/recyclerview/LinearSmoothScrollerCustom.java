package org.telegram.ui.recyclerview;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public class LinearSmoothScrollerCustom extends RecyclerView.SmoothScroller {
    private static final float MILLISECONDS_PER_INCH = 25.0f;
    public static final int POSITION_END = 1;
    public static final int POSITION_MIDDLE = 0;
    public static final int POSITION_TOP = 2;
    private static final float TARGET_SEEK_EXTRA_SCROLL_RATIO = 1.2f;
    private static final int TARGET_SEEK_SCROLL_DISTANCE_PX = 10000;
    private final float MILLISECONDS_PER_PX;
    private float durationMultiplier;
    protected final DecelerateInterpolator mDecelerateInterpolator;
    protected int mInterimTargetDx;
    protected int mInterimTargetDy;
    protected final LinearInterpolator mLinearInterpolator;
    protected PointF mTargetVector;
    private int offset;
    private int scrollPosition;

    public LinearSmoothScrollerCustom(Context context, int i) {
        this.mLinearInterpolator = new LinearInterpolator();
        this.mDecelerateInterpolator = new DecelerateInterpolator(1.5f);
        this.mInterimTargetDx = 0;
        this.mInterimTargetDy = 0;
        this.durationMultiplier = 1.0f;
        this.MILLISECONDS_PER_PX = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.scrollPosition = i;
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
            } else {
                paddingTop = i2 == 0 ? (height - i) / 2 : (layoutManager.getPaddingTop() + this.offset) - AndroidUtilities.dp(88.0f);
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

    public int calculateTimeForDeceleration(int i) {
        return (int) Math.ceil(((double) calculateTimeForScrolling(i)) / 0.3356d);
    }

    public int calculateTimeForScrolling(int i) {
        return (int) Math.ceil(Math.abs(i) * this.MILLISECONDS_PER_PX);
    }

    @Override
    public PointF computeScrollVectorForPosition(int i) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).computeScrollVectorForPosition(i);
        }
        return null;
    }

    public void onEnd() {
    }

    @Override
    public void onSeekTargetStep(int i, int i2, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        if (getChildCount() == 0) {
            stop();
            return;
        }
        int i3 = this.mInterimTargetDx;
        int i4 = i3 - i;
        if (i3 * i4 <= 0) {
            i4 = 0;
        }
        this.mInterimTargetDx = i4;
        int i5 = this.mInterimTargetDy;
        int i6 = i5 - i2;
        int i7 = i5 * i6 > 0 ? i6 : 0;
        this.mInterimTargetDy = i7;
        if (i4 == 0 && i7 == 0) {
            updateActionForInterimTarget(action);
        }
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onStop() {
        this.mInterimTargetDy = 0;
        this.mInterimTargetDx = 0;
        this.mTargetVector = null;
    }

    @Override
    public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        int iCalculateDyToMakeVisible = calculateDyToMakeVisible(view);
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(iCalculateDyToMakeVisible);
        if (iCalculateTimeForDeceleration > 0) {
            action.update(0, -iCalculateDyToMakeVisible, Math.max((int) (this.durationMultiplier * 400.0f), iCalculateTimeForDeceleration), this.mDecelerateInterpolator);
        } else {
            onEnd();
        }
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void updateActionForInterimTarget(RecyclerView.SmoothScroller.Action action) {
        PointF pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(getTargetPosition());
        if (pointFComputeScrollVectorForPosition == null || (pointFComputeScrollVectorForPosition.x == 0.0f && pointFComputeScrollVectorForPosition.y == 0.0f)) {
            action.mJumpToPosition = getTargetPosition();
            stop();
            return;
        }
        normalize(pointFComputeScrollVectorForPosition);
        this.mTargetVector = pointFComputeScrollVectorForPosition;
        this.mInterimTargetDx = (int) (pointFComputeScrollVectorForPosition.x * 10000.0f);
        this.mInterimTargetDy = (int) (pointFComputeScrollVectorForPosition.y * 10000.0f);
        action.update((int) (this.mInterimTargetDx * 1.2f), (int) (this.mInterimTargetDy * 1.2f), (int) (calculateTimeForScrolling(10000) * 1.2f), this.mLinearInterpolator);
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
}
