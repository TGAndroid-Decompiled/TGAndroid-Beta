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
public final class rg1 extends ViewGroup {
    public AnimatorSet f43151a;
    public boolean f43152b;
    public final ArrayList f43153c;
    public org.telegram.ui.Components.x30 d;
    public org.telegram.ui.Components.x30 e;
    public final UsersSelectActivity f43154f;

    public rg1(UsersSelectActivity usersSelectActivity, Context context) {
        super(context);
        this.f43154f = usersSelectActivity;
        this.f43153c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.x30 x30Var, boolean z10) {
        UsersSelectActivity usersSelectActivity = this.f43154f;
        usersSelectActivity.O.add(x30Var);
        long uid = x30Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f36326w++;
        }
        usersSelectActivity.N.k(x30Var, uid);
        fi.c2 c2Var = usersSelectActivity.f36321c;
        c2Var.setHintVisible(false, TextUtils.isEmpty(c2Var.getText()));
        AnimatorSet animatorSet = this.f43151a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f43151a.setupEndValues();
            this.f43151a.cancel();
        }
        this.f43152b = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f43151a = animatorSet2;
            animatorSet2.addListener(new fc1(this, 4));
            this.f43151a.setDuration(150L);
            this.d = x30Var;
            ArrayList arrayList = this.f43153c;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f, 1.0f));
        }
        addView(x30Var);
    }

    public final void b(org.telegram.ui.Components.x30 x30Var) {
        UsersSelectActivity usersSelectActivity = this.f43154f;
        usersSelectActivity.v = true;
        long uid = x30Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f36326w--;
        }
        usersSelectActivity.N.l(uid);
        usersSelectActivity.O.remove(x30Var);
        x30Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f43151a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            this.f43151a.cancel();
        }
        this.f43152b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f43151a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.ll0(15, this, x30Var));
        this.f43151a.setDuration(150L);
        this.e = x30Var;
        ArrayList arrayList = this.f43153c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.e, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, View.ALPHA, 1.0f, 0.0f));
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
        int B;
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
            arrayList = this.f43153c;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Components.x30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.e && childAt.getMeasuredWidth() + i14 > dp) {
                    dp2 = org.telegram.messenger.t.D(8.0f, childAt.getMeasuredHeight(), dp2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.t.D(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.f43152b) {
                    org.telegram.ui.Components.x30 x30Var = this.e;
                    if (childAt == x30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (x30Var != null) {
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
                if (childAt != this.e) {
                    i14 = org.telegram.messenger.t.D(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.t.D(9.0f, childAt.getMeasuredWidth(), i15);
            }
            i13++;
        }
        if (AndroidUtilities.isTablet()) {
            B = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            B = org.telegram.messenger.vh.B(158.0f, Math.min(point.x, point.y), 3);
        }
        if (dp - i14 < B) {
            dp2 += AndroidUtilities.dp(40.0f);
            i14 = 0;
        }
        if (dp - i15 < B) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        UsersSelectActivity usersSelectActivity = this.f43154f;
        usersSelectActivity.f36321c.measure(View.MeasureSpec.makeMeasureSpec(dp - i14, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
        if (!this.f43152b) {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            int dp6 = AndroidUtilities.dp(16.0f) + i14;
            usersSelectActivity.Q = dp2;
            if (this.f43151a != null) {
                int dp7 = AndroidUtilities.dp(42.0f) + dp2;
                if (usersSelectActivity.f36328y != dp7) {
                    arrayList.add(ObjectAnimator.ofInt(usersSelectActivity, "containerHeight", dp7));
                }
                float f11 = dp6;
                if (usersSelectActivity.f36321c.getTranslationX() != f11) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f36321c, property2, f11));
                }
                float translationY = usersSelectActivity.f36321c.getTranslationY();
                float f12 = usersSelectActivity.Q;
                if (translationY != f12) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f36321c, property, f12));
                }
                usersSelectActivity.f36321c.setAllowDrawCursor(false);
                this.f43151a.playTogether(arrayList);
                this.f43151a.start();
                this.f43152b = true;
            } else {
                usersSelectActivity.f36328y = dp5;
                usersSelectActivity.f36321c.setTranslationX(dp6);
                usersSelectActivity.f36321c.setTranslationY(usersSelectActivity.Q);
            }
        } else if (this.f43151a != null && !usersSelectActivity.v && this.e == null) {
            fi.c2 c2Var = usersSelectActivity.f36321c;
            c2Var.bringPointIntoView(c2Var.getSelectionStart());
        }
        setMeasuredDimension(size, usersSelectActivity.f36328y);
    }
}
