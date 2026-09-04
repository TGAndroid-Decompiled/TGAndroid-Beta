package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class yh1 extends ViewGroup {
    public AnimatorSet f43149a;
    public boolean f43150b;
    public final ArrayList f43151c;
    public org.telegram.ui.Components.m30 d;
    public org.telegram.ui.Components.m30 f43152e;
    public final UsersSelectActivity f43153f;

    public yh1(UsersSelectActivity usersSelectActivity, Context context) {
        super(context);
        this.f43153f = usersSelectActivity;
        this.f43151c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.m30 m30Var, boolean z10) {
        UsersSelectActivity usersSelectActivity = this.f43153f;
        usersSelectActivity.O.add(m30Var);
        long uid = m30Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f34245w++;
        }
        usersSelectActivity.N.k(m30Var, uid);
        di.h2 h2Var = usersSelectActivity.f34239c;
        h2Var.setHintVisible(false, TextUtils.isEmpty(h2Var.getText()));
        AnimatorSet animatorSet = this.f43149a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f43149a.setupEndValues();
            this.f43149a.cancel();
        }
        this.f43150b = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f43149a = animatorSet2;
            animatorSet2.addListener(new gk0(this, 29));
            this.f43149a.setDuration(150L);
            this.d = m30Var;
            ArrayList arrayList = this.f43151c;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f, 1.0f));
        }
        addView(m30Var);
    }

    public final void b(org.telegram.ui.Components.m30 m30Var) {
        UsersSelectActivity usersSelectActivity = this.f43153f;
        usersSelectActivity.v = true;
        long uid = m30Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f34245w--;
        }
        usersSelectActivity.N.l(uid);
        usersSelectActivity.O.remove(m30Var);
        m30Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f43149a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            this.f43149a.cancel();
        }
        this.f43150b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f43149a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.pk0(16, this, m30Var));
        this.f43149a.setDuration(150L);
        this.f43152e = m30Var;
        ArrayList arrayList = this.f43151c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f43152e, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f43152e, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f43152e, View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        Property property;
        Property property2;
        ArrayList arrayList;
        int y3;
        int i12;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            property = View.TRANSLATION_Y;
            property2 = View.TRANSLATION_X;
            arrayList = this.f43151c;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Components.m30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f43152e && childAt.getMeasuredWidth() + i14 > dp) {
                    dp2 = org.telegram.messenger.w1.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.w1.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.f43150b) {
                    org.telegram.ui.Components.m30 m30Var = this.f43152e;
                    if (childAt == m30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (m30Var != null) {
                        float f7 = dp4;
                        if (childAt.getTranslationX() != f7) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, property2, f7));
                        } else {
                            i12 = 1;
                        }
                        float f10 = dp2;
                        if (childAt.getTranslationY() != f10) {
                            float[] fArr = new float[i12];
                            fArr[0] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, property, fArr));
                        }
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                    }
                }
                if (childAt != this.f43152e) {
                    i14 = org.telegram.messenger.w1.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.w1.C(9.0f, childAt.getMeasuredWidth(), i15);
            }
            i13++;
        }
        if (AndroidUtilities.isTablet()) {
            y3 = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            y3 = org.telegram.messenger.wl.y(158.0f, Math.min(point.x, point.y), 3);
        }
        if (dp - i14 < y3) {
            dp2 += AndroidUtilities.dp(40.0f);
            i14 = 0;
        }
        if (dp - i15 < y3) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        UsersSelectActivity usersSelectActivity = this.f43153f;
        usersSelectActivity.f34239c.measure(View.MeasureSpec.makeMeasureSpec(dp - i14, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
        if (!this.f43150b) {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            int dp6 = AndroidUtilities.dp(16.0f) + i14;
            usersSelectActivity.Q = dp2;
            if (this.f43149a != null) {
                int dp7 = AndroidUtilities.dp(42.0f) + dp2;
                if (usersSelectActivity.f34247y != dp7) {
                    arrayList.add(ObjectAnimator.ofInt(usersSelectActivity, "containerHeight", dp7));
                }
                float f11 = dp6;
                if (usersSelectActivity.f34239c.getTranslationX() != f11) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f34239c, property2, f11));
                }
                float translationY = usersSelectActivity.f34239c.getTranslationY();
                float f12 = usersSelectActivity.Q;
                if (translationY != f12) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f34239c, property, f12));
                }
                usersSelectActivity.f34239c.setAllowDrawCursor(false);
                this.f43149a.playTogether(arrayList);
                this.f43149a.start();
                this.f43150b = true;
            } else {
                usersSelectActivity.f34247y = dp5;
                usersSelectActivity.f34239c.setTranslationX(dp6);
                usersSelectActivity.f34239c.setTranslationY(usersSelectActivity.Q);
            }
        } else if (this.f43149a != null && !usersSelectActivity.v && this.f43152e == null) {
            di.h2 h2Var = usersSelectActivity.f34239c;
            h2Var.bringPointIntoView(h2Var.getSelectionStart());
        }
        setMeasuredDimension(size, usersSelectActivity.f34247y);
    }
}
