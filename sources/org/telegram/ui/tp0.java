package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class tp0 extends org.telegram.ui.Components.zu0 {

    public int f42990s0;

    public boolean f42991t0;

    public int f42992u0;

    public final aq0 f42993v0;

    public tp0(aq0 aq0Var, Context context) {
        super(context, null);
        this.f42993v0 = aq0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int paddingRight;
        int paddingLeft;
        int i15;
        int i16;
        int paddingTop;
        org.telegram.ui.Components.tt ttVar;
        int measuredHeight;
        int measuredHeight2;
        int i17 = this.f42990s0;
        int i18 = i12 - i10;
        aq0 aq0Var = this.f42993v0;
        if (i17 != i18) {
            this.f42990s0 = i18;
            yp0 yp0Var = aq0Var.H;
            if (yp0Var != null) {
                yp0Var.l();
            }
            org.telegram.ui.ActionBar.n1 n1Var = aq0Var.f36609i0;
            if (n1Var != null && n1Var.isShowing()) {
                aq0Var.f36609i0.d(true);
            }
        }
        int childCount = getChildCount();
        int emojiPadding = (aq0Var.Z == null || aq0Var.V.getParent() != this || AndroidUtilities.dp(20.0f) < 0 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : aq0Var.Z.getEmojiPadding();
        setBottomClip(emojiPadding);
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i20 = layoutParams.gravity;
                if (i20 == -1) {
                    i20 = 51;
                }
                int i21 = i20 & 112;
                int i22 = i20 & 7;
                if (i22 != 1) {
                    if (i22 != 5) {
                        paddingLeft = getPaddingLeft() + layoutParams.leftMargin;
                    } else {
                        i14 = (i18 - measuredWidth) - layoutParams.rightMargin;
                        paddingRight = getPaddingRight();
                    }
                    if (i21 != 16) {
                        if (i21 != 48) {
                            paddingTop = layoutParams.topMargin + getPaddingTop();
                        } else if (i21 != 80) {
                            paddingTop = layoutParams.topMargin;
                        } else {
                            i15 = ((i13 - emojiPadding) - i11) - measuredHeight3;
                            i16 = layoutParams.bottomMargin;
                        }
                        ttVar = aq0Var.Z;
                        if (ttVar != null && ttVar.l(childAt)) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            paddingTop = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                    } else {
                        i15 = ((((i13 - emojiPadding) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i16 = layoutParams.bottomMargin;
                    }
                    paddingTop = i15 - i16;
                    ttVar = aq0Var.Z;
                    if (ttVar != null) {
                        if (AndroidUtilities.isTablet()) {
                            measuredHeight = getMeasuredHeight();
                            measuredHeight2 = childAt.getMeasuredHeight();
                        } else {
                            measuredHeight = getMeasuredHeight();
                            measuredHeight2 = childAt.getMeasuredHeight();
                        }
                        paddingTop = measuredHeight - measuredHeight2;
                    }
                    childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                } else {
                    i14 = ((i18 - measuredWidth) / 2) + layoutParams.leftMargin;
                    paddingRight = layoutParams.rightMargin;
                }
                paddingLeft = i14 - paddingRight;
                if (i21 != 16) {
                    if (i21 != 48) {
                        paddingTop = layoutParams.topMargin + getPaddingTop();
                    } else if (i21 != 80) {
                        paddingTop = layoutParams.topMargin;
                    } else {
                        i15 = ((i13 - emojiPadding) - i11) - measuredHeight3;
                        i16 = layoutParams.bottomMargin;
                    }
                    ttVar = aq0Var.Z;
                    if (ttVar != null) {
                        if (AndroidUtilities.isTablet()) {
                            measuredHeight = getMeasuredHeight();
                            measuredHeight2 = childAt.getMeasuredHeight();
                        } else {
                            measuredHeight = getMeasuredHeight();
                            measuredHeight2 = childAt.getMeasuredHeight();
                        }
                        paddingTop = measuredHeight - measuredHeight2;
                    }
                    childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                } else {
                    i15 = ((((i13 - emojiPadding) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                    i16 = layoutParams.bottomMargin;
                }
                paddingTop = i15 - i16;
                ttVar = aq0Var.Z;
                if (ttVar != null) {
                    if (AndroidUtilities.isTablet()) {
                        measuredHeight = getMeasuredHeight();
                        measuredHeight2 = childAt.getMeasuredHeight();
                    } else {
                        measuredHeight = getMeasuredHeight();
                        measuredHeight2 = childAt.getMeasuredHeight();
                    }
                    paddingTop = measuredHeight - measuredHeight2;
                }
                childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
            }
        }
        S();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.tt ttVar;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean zIsTablet = AndroidUtilities.isTablet();
        aq0 aq0Var = this.f42993v0;
        if (zIsTablet) {
            aq0Var.f36601c0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                aq0Var.f36601c0 = 4;
            } else {
                aq0Var.f36601c0 = 3;
            }
        }
        this.f42991t0 = true;
        int iDp = ((size2 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f)) / aq0Var.f36601c0;
        aq0Var.N = iDp;
        if (this.f42992u0 != iDp) {
            this.f42992u0 = iDp;
            AndroidUtilities.runOnUIThread(new zk0(this, 13));
        }
        if (aq0Var.U) {
            aq0Var.I.y1(1);
        } else {
            aq0Var.I.y1(Math.max(1, ((aq0Var.f36601c0 - 1) * AndroidUtilities.dp(2.0f)) + (aq0Var.N * aq0Var.f36601c0)));
        }
        this.f42991t0 = false;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(iMakeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int iR = R();
        if (AndroidUtilities.dp(20.0f) >= 0 && !AndroidUtilities.isInMultiwindow && aq0Var.Z != null && aq0Var.V.getParent() == this) {
            size4 -= aq0Var.Z.getEmojiPadding();
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, 1073741824);
        }
        int i12 = size4;
        int i13 = iMakeMeasureSpec;
        if (iR > AndroidUtilities.dp(20.0f) && (ttVar = aq0Var.Z) != null) {
            this.f42991t0 = true;
            ttVar.j();
            this.f42991t0 = false;
        }
        org.telegram.ui.Components.tt ttVar2 = aq0Var.Z;
        if (ttVar2 != null && ttVar2.f32878e) {
            aq0Var.fragmentView.setTranslationY(0.0f);
            aq0Var.G.setTranslationY(0.0f);
            aq0Var.J.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.tt ttVar3 = aq0Var.Z;
                if (ttVar3 == null || !ttVar3.l(childAt)) {
                    measureChildWithMargins(childAt, i10, 0, i13, 0);
                } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                } else if (AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (i12 - AndroidUtilities.statusBarHeight)), 1073741824));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i12 - AndroidUtilities.statusBarHeight), 1073741824));
                }
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f42991t0) {
            return;
        }
        super.requestLayout();
    }
}
