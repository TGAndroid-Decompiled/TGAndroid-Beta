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
    public final float MILLISECONDS_PER_PX;
    public final float durationMultiplier;
    public final DecelerateInterpolator mDecelerateInterpolator;
    public int mInterimTargetDx;
    public int mInterimTargetDy;
    public final LinearInterpolator mLinearInterpolator;
    public int offset;
    public final int scrollPosition;

    public LinearSmoothScrollerCustom(Context context, int i) {
        this.mLinearInterpolator = new LinearInterpolator();
        this.mDecelerateInterpolator = new DecelerateInterpolator(1.5f);
        this.mInterimTargetDx = 0;
        this.mInterimTargetDy = 0;
        this.durationMultiplier = 1.0f;
        this.MILLISECONDS_PER_PX = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.scrollPosition = i;
    }

    @Override
    public final PointF computeScrollVectorForPosition(int i) {
        RecyclerView.LayoutManager layoutManager = this.mLayoutManager;
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).computeScrollVectorForPosition(i);
        }
        return null;
    }

    public void onEnd() {
    }

    @Override
    public final void onSeekTargetStep(int i, int i2, RecyclerView.SmoothScroller.Action action) {
        if (this.mRecyclerView.mLayout.getChildCount() == 0) {
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
            PointF pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition);
            if (pointFComputeScrollVectorForPosition == null || (pointFComputeScrollVectorForPosition.x == 0.0f && pointFComputeScrollVectorForPosition.y == 0.0f)) {
                action.mJumpToPosition = this.mTargetPosition;
                stop();
            } else {
                RecyclerView.SmoothScroller.normalize(pointFComputeScrollVectorForPosition);
                this.mInterimTargetDx = (int) (pointFComputeScrollVectorForPosition.x * 10000.0f);
                this.mInterimTargetDy = (int) (pointFComputeScrollVectorForPosition.y * 10000.0f);
                action.update((int) (this.mInterimTargetDx * 1.2f), (int) (this.mInterimTargetDy * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.MILLISECONDS_PER_PX)) * 1.2f), this.mLinearInterpolator);
            }
        }
    }

    @Override
    public void onStart() {
    }

    @Override
    public final void onStop() {
        this.mInterimTargetDy = 0;
        this.mInterimTargetDx = 0;
    }

    @Override
    public final void onTargetFound(View view, RecyclerView.SmoothScroller.Action action) {
        int i;
        int paddingTop;
        RecyclerView.LayoutManager layoutManager = this.mLayoutManager;
        if (layoutManager == null || !layoutManager.canScrollVertically()) {
            i = 0;
        } else {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            int top = (view.getTop() - ((RecyclerView.LayoutParams) view.getLayoutParams()).mDecorInsets.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int bottom = view.getBottom() + ((RecyclerView.LayoutParams) view.getLayoutParams()).mDecorInsets.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int paddingBottom = (layoutManager.mHeight - layoutManager.getPaddingBottom()) - layoutManager.getPaddingTop();
            int i2 = bottom - top;
            int i3 = this.scrollPosition;
            if (i3 == 2) {
                paddingTop = layoutManager.getPaddingTop() + this.offset;
            } else if (i2 > paddingBottom) {
                paddingTop = 0;
            } else {
                paddingTop = i3 == 0 ? (paddingBottom - i2) / 2 : (layoutManager.getPaddingTop() + this.offset) - AndroidUtilities.dp(88.0f);
            }
            int i4 = i2 + paddingTop;
            i = paddingTop - top;
            if (i <= 0 && (i = i4 - bottom) >= 0) {
                i = 0;
            }
        }
        int iCeil = (int) Math.ceil(((double) ((int) Math.ceil(Math.abs(i) * this.MILLISECONDS_PER_PX))) / 0.3356d);
        if (iCeil > 0) {
            action.update(0, -i, Math.max((int) (this.durationMultiplier * 400.0f), iCeil), this.mDecelerateInterpolator);
        } else {
            onEnd();
        }
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
