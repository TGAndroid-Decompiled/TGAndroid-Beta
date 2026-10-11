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
    public AnimatorSet f44433a;
    public boolean f44434b;
    public final ArrayList f44435c;
    public org.telegram.ui.Components.e40 d;
    public org.telegram.ui.Components.e40 f44436e;
    public final UsersSelectActivity f44437f;

    public yh1(UsersSelectActivity usersSelectActivity, Context context) {
        super(context);
        this.f44437f = usersSelectActivity;
        this.f44435c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.e40 e40Var, boolean z10) {
        UsersSelectActivity usersSelectActivity = this.f44437f;
        usersSelectActivity.O.add(e40Var);
        long uid = e40Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f34628w++;
        }
        usersSelectActivity.N.k(e40Var, uid);
        ci.g2 g2Var = usersSelectActivity.f34622c;
        g2Var.setHintVisible(false, TextUtils.isEmpty(g2Var.getText()));
        AnimatorSet animatorSet = this.f44433a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f44433a.setupEndValues();
            this.f44433a.cancel();
        }
        this.f44434b = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f44433a = animatorSet2;
            animatorSet2.addListener(new dp0(this, 27));
            this.f44433a.setDuration(150L);
            this.d = e40Var;
            ArrayList arrayList = this.f44435c;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.d, View.ALPHA, 0.0f, 1.0f));
        }
        addView(e40Var);
    }

    public final void b(org.telegram.ui.Components.e40 e40Var) {
        UsersSelectActivity usersSelectActivity = this.f44437f;
        usersSelectActivity.v = true;
        long uid = e40Var.getUid();
        if (uid > -9223372036854775801L) {
            usersSelectActivity.f34628w--;
        }
        usersSelectActivity.N.l(uid);
        usersSelectActivity.O.remove(e40Var);
        e40Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f44433a;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            this.f44433a.cancel();
        }
        this.f44434b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f44433a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.wl0(16, this, e40Var));
        this.f44433a.setDuration(150L);
        this.f44436e = e40Var;
        ArrayList arrayList = this.f44435c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f44436e, View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f44436e, View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.f44436e, View.ALPHA, 1.0f, 0.0f));
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
        int A;
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
            arrayList = this.f44435c;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Components.e40) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                if (childAt != this.f44436e && childAt.getMeasuredWidth() + i14 > dp) {
                    dp2 = org.telegram.messenger.q.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.q.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.f44434b) {
                    org.telegram.ui.Components.e40 e40Var = this.f44436e;
                    if (childAt == e40Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (e40Var != null) {
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
                if (childAt != this.f44436e) {
                    i14 = org.telegram.messenger.q.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.q.C(9.0f, childAt.getMeasuredWidth(), i15);
            }
            i13++;
        }
        if (AndroidUtilities.isTablet()) {
            A = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            A = org.telegram.messenger.ai.A(158.0f, Math.min(point.x, point.y), 3);
        }
        if (dp - i14 < A) {
            dp2 += AndroidUtilities.dp(40.0f);
            i14 = 0;
        }
        if (dp - i15 < A) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        UsersSelectActivity usersSelectActivity = this.f44437f;
        usersSelectActivity.f34622c.measure(View.MeasureSpec.makeMeasureSpec(dp - i14, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
        if (!this.f44434b) {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            int dp6 = AndroidUtilities.dp(16.0f) + i14;
            usersSelectActivity.Q = dp2;
            if (this.f44433a != null) {
                int dp7 = AndroidUtilities.dp(42.0f) + dp2;
                if (usersSelectActivity.f34630y != dp7) {
                    arrayList.add(ObjectAnimator.ofInt(usersSelectActivity, "containerHeight", dp7));
                }
                float f11 = dp6;
                if (usersSelectActivity.f34622c.getTranslationX() != f11) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f34622c, property2, f11));
                }
                float translationY = usersSelectActivity.f34622c.getTranslationY();
                float f12 = usersSelectActivity.Q;
                if (translationY != f12) {
                    arrayList.add(ObjectAnimator.ofFloat(usersSelectActivity.f34622c, property, f12));
                }
                usersSelectActivity.f34622c.setAllowDrawCursor(false);
                this.f44433a.playTogether(arrayList);
                this.f44433a.start();
                this.f44434b = true;
            } else {
                usersSelectActivity.f34630y = dp5;
                usersSelectActivity.f34622c.setTranslationX(dp6);
                usersSelectActivity.f34622c.setTranslationY(usersSelectActivity.Q);
            }
        } else if (this.f44433a != null && !usersSelectActivity.v && this.f44436e == null) {
            ci.g2 g2Var = usersSelectActivity.f34622c;
            g2Var.bringPointIntoView(g2Var.getSelectionStart());
        }
        setMeasuredDimension(size, usersSelectActivity.f34630y);
    }
}
