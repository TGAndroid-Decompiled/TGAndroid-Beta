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
public final class sg1 extends ViewGroup {
    public AnimatorSet f42386a;
    public boolean f42387b;
    public final ArrayList f42388c;
    public org.telegram.ui.Components.j30 d;
    public org.telegram.ui.Components.j30 f42389e;
    public final UsersSelectActivity f42390f;

    public sg1(UsersSelectActivity usersSelectActivity, Context context) {
        super(context);
        this.f42390f = usersSelectActivity;
        this.f42388c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.j30 j30Var, boolean z10) {
        UsersSelectActivity usersSelectActivity = this.f42390f;
        usersSelectActivity.K.add(j30Var);
        long uid = j30Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f36358w++;
        }
        usersSelectActivity.J.k(j30Var, uid);
        ig.f fVar = usersSelectActivity.f36352c;
        fVar.setHintVisible(false, TextUtils.isEmpty(fVar.getText()));
        AnimatorSet animatorSet = this.f42386a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f42386a.setupEndValues();
            this.f42386a.cancel();
        }
        this.f42387b = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f42386a = animatorSet2;
            animatorSet2.addListener(new cc1(this, 4));
            this.f42386a.setDuration(150L);
            this.d = j30Var;
            ArrayList arrayList = this.f42388c;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f, 1.0f));
        }
        addView(j30Var);
    }

    public final void b(org.telegram.ui.Components.j30 j30Var) {
        UsersSelectActivity usersSelectActivity = this.f42390f;
        usersSelectActivity.v = true;
        long uid = j30Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f36358w--;
        }
        usersSelectActivity.J.l(uid);
        usersSelectActivity.K.remove(j30Var);
        j30Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f42386a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            this.f42386a.cancel();
        }
        this.f42387b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f42386a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.ok0(17, this, j30Var));
        this.f42386a.setDuration(150L);
        this.f42389e = j30Var;
        ArrayList arrayList = this.f42388c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f42389e, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f42389e, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f42389e, View.ALPHA, 1.0f, 0.0f));
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
        int x4;
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
            arrayList = this.f42388c;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Components.j30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f42389e && childAt.getMeasuredWidth() + i14 > dp) {
                    dp2 = org.telegram.messenger.x3.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.x3.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.f42387b) {
                    org.telegram.ui.Components.j30 j30Var = this.f42389e;
                    if (childAt == j30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (j30Var != null) {
                        float f9 = dp4;
                        if (childAt.getTranslationX() != f9) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, property2, f9));
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
                if (childAt != this.f42389e) {
                    i14 = org.telegram.messenger.x3.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.x3.C(9.0f, childAt.getMeasuredWidth(), i15);
            }
            i13++;
        }
        if (AndroidUtilities.isTablet()) {
            x4 = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            x4 = b.x(158.0f, Math.min(point.x, point.y), 3);
        }
        if (dp - i14 < x4) {
            dp2 += AndroidUtilities.dp(40.0f);
            i14 = 0;
        }
        if (dp - i15 < x4) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        UsersSelectActivity usersSelectActivity = this.f42390f;
        usersSelectActivity.f36352c.measure(View.MeasureSpec.makeMeasureSpec(dp - i14, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
        if (!this.f42387b) {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            int dp6 = AndroidUtilities.dp(16.0f) + i14;
            usersSelectActivity.M = dp2;
            if (this.f42386a != null) {
                int dp7 = AndroidUtilities.dp(42.0f) + dp2;
                if (usersSelectActivity.f36360y != dp7) {
                    arrayList.add(ObjectAnimator.ofInt(usersSelectActivity, "containerHeight", dp7));
                }
                float f11 = dp6;
                if (usersSelectActivity.f36352c.getTranslationX() != f11) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f36352c, property2, f11));
                }
                float translationY = usersSelectActivity.f36352c.getTranslationY();
                float f12 = usersSelectActivity.M;
                if (translationY != f12) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f36352c, property, f12));
                }
                usersSelectActivity.f36352c.setAllowDrawCursor(false);
                this.f42386a.playTogether(arrayList);
                this.f42386a.start();
                this.f42387b = true;
            } else {
                usersSelectActivity.f36360y = dp5;
                usersSelectActivity.f36352c.setTranslationX(dp6);
                usersSelectActivity.f36352c.setTranslationY(usersSelectActivity.M);
            }
        } else if (this.f42386a != null && !usersSelectActivity.v && this.f42389e == null) {
            ig.f fVar = usersSelectActivity.f36352c;
            fVar.bringPointIntoView(fVar.getSelectionStart());
        }
        setMeasuredDimension(size, usersSelectActivity.f36360y);
    }
}
