package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class se implements Runnable {
    public final int f40104a;
    public final fo f40105b;

    public se(fo foVar, int i10) {
        this.f40104a = i10;
        this.f40105b = foVar;
    }

    @Override
    public final void run() {
        sk skVar;
        int i10;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject;
        int i11;
        int i12 = this.f40104a;
        TLRPC.ChatTheme chatTheme = null;
        int i13 = 0;
        fo foVar = this.f40105b;
        switch (i12) {
            case 0:
                foVar.L5 = null;
                if (foVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(foVar.getParentActivity(), 0, foVar.f35932ea);
                    boolean isChannel = ChatObject.isChannel(foVar.e);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                    if (isChannel && !foVar.e.megagroup) {
                        a2Var.T = LocaleController.getString(R.string.JoinByPeekChannelText);
                        a2Var.R = LocaleController.getString(R.string.JoinByPeekChannelTitle);
                    } else {
                        a2Var.T = LocaleController.getString(R.string.JoinByPeekGroupText);
                        a2Var.R = LocaleController.getString(R.string.JoinByPeekGroupTitle);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.JoinByPeekJoin), new xe(foVar, 2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xe(foVar, 3));
                    foVar.showDialog(a2Var);
                    return;
                }
                return;
            case 1:
                foVar.b7();
                return;
            case 2:
                fo.n0(foVar);
                return;
            case 3:
                foVar.ta(null, foVar.f36103s8);
                foVar.f36103s8 = null;
                return;
            case 4:
                if (!org.telegram.ui.ActionBar.m2.hasSheets(foVar) && (skVar = foVar.Y) != null) {
                    skVar.setFieldFocused(true);
                    foVar.Y.F0();
                    return;
                }
                return;
            case 5:
                foVar.t9();
                AndroidUtilities.forEachViews((RecyclerView) foVar.f36160x0, (Utilities.Callback<View>) new jf(foVar, 6));
                foVar.x7();
                jk jkVar = foVar.X2;
                if (jkVar != null) {
                    jkVar.setTranslationX(foVar.W8() / 2.0f);
                }
                ik ikVar = foVar.Y2;
                if (ikVar != null) {
                    ikVar.setTranslationX(foVar.W8() / 2.0f);
                }
                FrameLayout frameLayout = foVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(foVar.W8() / 2.0f);
                }
                foVar.V6();
                foVar.w7();
                return;
            case 6:
                hf1 a02 = hf1.a0(-foVar.T5, 0L);
                a02.f36789y = foVar;
                foVar.presentFragment(a02);
                return;
            case 7:
                foVar.fc(true);
                return;
            case 8:
                foVar.f35984j1.d(true);
                return;
            case 9:
                foVar.getNotificationCenter().onAnimationFinish(foVar.F9);
                return;
            case 10:
                int childCount = foVar.f36160x0.getChildCount();
                while (i13 < childCount) {
                    View childAt = foVar.f36160x0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                        if (u1Var2.getMessageObject().type == 4) {
                            u1Var2.t2();
                        }
                    }
                    i13++;
                }
                return;
            case 11:
                foVar.Bb = true;
                foVar.Bc(true);
                return;
            case 12:
                il ilVar = foVar.f35895bb;
                if (ilVar != null) {
                    ilVar.requestLayout();
                    return;
                }
                return;
            case 13:
                fo.J0(foVar);
                return;
            case 14:
                foVar.zb(false, true);
                return;
            case 15:
                foVar.resumeDelayedFragmentAnimation();
                al alVar = foVar.W9;
                AndroidUtilities.cancelRunOnUIThread(alVar);
                alVar.run();
                foVar.getNotificationCenter().runDelayedNotifications();
                return;
            case 16:
                TLRPC.UserFull userFull = foVar.f35878a8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                foVar.mb(chatTheme);
                return;
            case 17:
                fo.u0(foVar);
                return;
            case 18:
                foVar.L7 = Integer.MAX_VALUE;
                foVar.N7 = false;
                foVar.O7 = 0L;
                foVar.P7 = null;
                foVar.Q7 = null;
                foVar.R7 = null;
                foVar.S7 = -1;
                foVar.M7 = false;
                foVar.ad(false);
                foVar.U7 = null;
                return;
            case 19:
                foVar.c7();
                return;
            case 20:
                foVar.Y.F0();
                return;
            case 21:
                AndroidUtilities.forEachViews((RecyclerView) foVar.f36160x0, (Utilities.Callback<View>) new bi.f(11));
                rm rmVar = foVar.A0;
                if (rmVar != null) {
                    rmVar.O(true);
                    return;
                }
                return;
            case 22:
                fo foVar2 = this.f40105b;
                int i14 = foVar2.f36078qb;
                if (i14 != 0) {
                    foVar2.j(i14, foVar2.f36092rb, foVar2.f36106sb, foVar2.f36119tb, foVar2.f36131ub, foVar2.f36144vb);
                    foVar2.f36078qb = 0;
                    return;
                }
                return;
            case 23:
                if (!foVar.f36011l3 && foVar.f36160x0 != null && foVar.getParentActivity() != null && foVar.fragmentView != null) {
                    org.telegram.ui.Components.dq dqVar = foVar.f36135v2;
                    if (dqVar == null || dqVar.getTag() == null) {
                        if (foVar.f36135v2 == null) {
                            xm xmVar = foVar.X0;
                            int indexOfChild = xmVar.indexOfChild(foVar.S);
                            if (indexOfChild != -1) {
                                i10 = 1;
                                org.telegram.ui.Components.dq dqVar2 = new org.telegram.ui.Components.dq(foVar.getParentActivity(), foVar.f35932ea);
                                foVar.f36135v2 = dqVar2;
                                xmVar.addView(dqVar2, indexOfChild + 1, w7.a6.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                                foVar.f36135v2.setAlpha(0.0f);
                                foVar.f36135v2.setVisibility(4);
                            } else {
                                return;
                            }
                        } else {
                            i10 = 1;
                        }
                        int childCount2 = foVar.f36160x0.getChildCount();
                        for (int i15 = 0; i15 < childCount2; i15++) {
                            View childAt2 = foVar.f36160x0.getChildAt(i15);
                            if ((childAt2 instanceof org.telegram.ui.Cells.u1) && (messageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt2).getMessageObject()) != null && messageObject.isOutOwner() && messageObject.isSent()) {
                                org.telegram.ui.Components.dq dqVar3 = foVar.f36135v2;
                                ImageView imageView = dqVar3.f24471c;
                                org.telegram.ui.Components.qg qgVar = dqVar3.e;
                                if (qgVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(qgVar);
                                    dqVar3.e = null;
                                }
                                int[] iArr = new int[2];
                                u1Var.getLocationInWindow(iArr);
                                int i16 = iArr[i10];
                                ((View) dqVar3.getParent()).getLocationInWindow(iArr);
                                int i17 = i16 - iArr[i10];
                                View view = (View) u1Var.getParent();
                                dqVar3.measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
                                if (i17 > AndroidUtilities.dp(10.0f) + dqVar3.getMeasuredHeight()) {
                                    int c10 = org.telegram.messenger.yh.c(6.0f, u1Var.getChecksY(), i17);
                                    int dp = AndroidUtilities.dp(5.0f) + u1Var.getChecksX();
                                    int measuredWidth = view.getMeasuredWidth();
                                    float measuredHeight = c10 - dqVar3.getMeasuredHeight();
                                    dqVar3.f24472f = measuredHeight;
                                    dqVar3.setTranslationY(measuredHeight);
                                    int left = u1Var.getLeft() + dp;
                                    int dp2 = AndroidUtilities.dp(15.0f);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        int measuredWidth2 = (measuredWidth - dqVar3.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
                                        dqVar3.setTranslationX(measuredWidth2);
                                        dp2 += measuredWidth2;
                                    } else {
                                        dqVar3.setTranslationX(0.0f);
                                    }
                                    float left2 = ((u1Var.getLeft() + dp) - dp2) - (imageView.getMeasuredWidth() / 2);
                                    imageView.setTranslationX(left2);
                                    if (left > view.getMeasuredWidth() / 2) {
                                        if (left2 < AndroidUtilities.dp(10.0f)) {
                                            float dp3 = left2 - AndroidUtilities.dp(10.0f);
                                            dqVar3.setTranslationX(dqVar3.getTranslationX() + dp3);
                                            imageView.setTranslationX(left2 - dp3);
                                        }
                                    } else if (left2 > dqVar3.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
                                        float measuredWidth3 = (left2 - dqVar3.getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
                                        dqVar3.setTranslationX(measuredWidth3);
                                        imageView.setTranslationX(left2 - measuredWidth3);
                                    } else if (left2 < AndroidUtilities.dp(10.0f)) {
                                        float dp4 = left2 - AndroidUtilities.dp(10.0f);
                                        dqVar3.setTranslationX(dqVar3.getTranslationX() + dp4);
                                        imageView.setTranslationX(left2 - dp4);
                                    }
                                    dqVar3.setPivotX(left2);
                                    dqVar3.setPivotY(dqVar3.getMeasuredHeight());
                                    AnimatorSet animatorSet = dqVar3.d;
                                    if (animatorSet != null) {
                                        animatorSet.cancel();
                                        dqVar3.d = null;
                                    }
                                    dqVar3.setTag(Integer.valueOf(i10));
                                    dqVar3.setVisibility(0);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    dqVar3.d = animatorSet2;
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dqVar3, View.ALPHA, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dqVar3, View.SCALE_X, 0.0f, 1.0f);
                                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(dqVar3, View.SCALE_Y, 0.0f, 1.0f);
                                    Animator[] animatorArr = new Animator[3];
                                    animatorArr[0] = ofFloat;
                                    animatorArr[i10] = ofFloat2;
                                    animatorArr[2] = ofFloat3;
                                    animatorSet2.playTogether(animatorArr);
                                    dqVar3.d.addListener(new org.telegram.ui.Components.cq(dqVar3, 0));
                                    dqVar3.d.setDuration(180L);
                                    dqVar3.d.start();
                                    while (i13 < 2) {
                                        ViewPropertyAnimator interpolator = dqVar3.f24469a[i13].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(org.telegram.ui.Components.es.f24773i);
                                        if (i13 == 0) {
                                            i11 = 132;
                                        } else {
                                            i11 = 500;
                                        }
                                        interpolator.setStartDelay(i11 + 140).setDuration(100L).setListener(new fi.v2(dqVar3, i13, 6)).start();
                                        i13++;
                                    }
                                    foVar.getMessagesController().removeSuggestion(0L, "NEWCOMER_TICKS");
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 24:
                fo.G0(foVar);
                return;
            case 25:
                AndroidUtilities.forEachViews((RecyclerView) foVar.f36160x0, (Utilities.Callback<View>) new bi.f(10));
                rm rmVar2 = foVar.A0;
                if (rmVar2 != null) {
                    rmVar2.O(false);
                    return;
                }
                return;
            case 26:
                AndroidUtilities.removeFromParent(foVar.K0);
                return;
            case 27:
                sk skVar2 = foVar.Y;
                if (skVar2 != null && foVar.ob != 5) {
                    skVar2.F0();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.dp dpVar = ((org.telegram.ui.Components.dp[]) foVar.f35871a0.f895b)[0];
                org.telegram.ui.ActionBar.h5 h5Var = dpVar.d;
                org.telegram.ui.ActionBar.h5 h5Var2 = dpVar.e;
                foVar.F1 = !foVar.F1;
                h5Var.setPivotX(0.0f);
                h5Var2.setPivotX(0.0f);
                if (foVar.F1) {
                    h5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    h5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    h5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    h5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                AndroidUtilities.runOnUIThread(foVar.G1, 6000L);
                return;
            default:
                foVar.yc();
                return;
        }
    }
}
