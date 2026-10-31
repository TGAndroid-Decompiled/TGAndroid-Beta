package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class y2 implements Runnable {
    public final int f43683a;
    public final h4 f43684b;

    public y2(h4 h4Var, int i10) {
        this.f43683a = i10;
        this.f43684b = h4Var;
    }

    @Override
    public final void run() {
        ArticleViewer$WindowView articleViewer$WindowView;
        org.telegram.ui.Cells.k9 k9Var;
        int i10 = this.f43683a;
        h4 h4Var = this.f43684b;
        switch (i10) {
            case 0:
                if (h4Var.K0 && (articleViewer$WindowView = h4Var.f37732f0) != null) {
                    h4Var.K0 = false;
                    if (h4Var.f39481b != null) {
                        try {
                            articleViewer$WindowView.performHapticFeedback(0, 2);
                        } catch (Exception unused) {
                        }
                        h4Var.X(((org.telegram.ui.Components.uz0) h4Var.f39481b.f29568i).f31101b);
                        h4Var.f39481b = null;
                        h4Var.d = null;
                        View view = h4Var.f39483f;
                        if (view != null) {
                            view.invalidate();
                            return;
                        }
                        return;
                    }
                    View view2 = h4Var.f39483f;
                    if (view2 != null && h4Var.P0.f0(view2)) {
                        if (h4Var.f39483f.getTag() != null && h4Var.f39483f.getTag() == "bottomSheet" && (k9Var = h4Var.Q0) != null) {
                            k9Var.l0();
                        } else {
                            h4Var.P0.l0();
                        }
                        if (h4Var.P0.x()) {
                            try {
                                h4Var.f37732f0.performHapticFeedback(0, 2);
                                return;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                        return;
                    } else if (h4Var.d != null && h4Var.f39483f != null) {
                        try {
                            h4Var.f37732f0.performHapticFeedback(0, 2);
                        } catch (Exception unused3) {
                        }
                        int[] iArr = new int[2];
                        h4Var.f39483f.getLocationInWindow(iArr);
                        int L = (iArr[1] + h4Var.e) - org.telegram.messenger.i0.L(54.0f);
                        if (L < 0) {
                            L = 0;
                        }
                        h4Var.f39483f.invalidate();
                        h4Var.h = true;
                        View view3 = h4Var.f39483f;
                        org.telegram.ui.ActionBar.k1 k1Var = h4Var.H;
                        if (k1Var != null && k1Var.isShowing()) {
                            h4Var.H.d(true);
                        } else {
                            if (h4Var.B0 == null) {
                                h4Var.D0 = new Rect();
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(h4Var.L, null);
                                h4Var.B0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f));
                                h4Var.B0.setBackgroundDrawable(h4Var.L.getResources().getDrawable(2131231780));
                                h4Var.B0.setAnimationEnabled(false);
                                h4Var.B0.setOnTouchListener(new d0(h4Var, 0));
                                h4Var.B0.setDispatchKeyEventListener(new r(h4Var));
                                h4Var.B0.setShownFromBottom(false);
                                TextView textView = new TextView(h4Var.L);
                                h4Var.C0 = textView;
                                int i11 = org.telegram.ui.ActionBar.t6.f21020i6;
                                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i11, false), 2, -1);
                                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
                                textView.setBackground(h02);
                                org.telegram.ui.ActionBar.a7.k(textView, h02, null, N, null);
                                h4Var.C0.setGravity(16);
                                h4Var.C0.setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(20.0f), 0);
                                h4Var.C0.setTextSize(1, 15.0f);
                                h4Var.C0.setTypeface(org.telegram.messenger.i0.o());
                                h4Var.C0.setText(org.telegram.messenger.cd.L0(2131751767, null).toUpperCase());
                                h4Var.C0.setOnClickListener(new q(h4Var, 5));
                                h4Var.B0.addView(h4Var.C0, w7.b6.c(48.0f, -2));
                                org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(h4Var.B0, -2, -2);
                                h4Var.H = k1Var2;
                                k1Var2.f20455b = false;
                                k1Var2.setAnimationStyle(2131755192);
                                h4Var.H.setOutsideTouchable(true);
                                h4Var.H.setClippingEnabled(true);
                                h4Var.H.setInputMethodMode(2);
                                h4Var.H.setSoftInputMode(0);
                                h4Var.H.getContentView().setFocusableInTouchMode(true);
                                h4Var.H.setOnDismissListener(new e0(h4Var, 0));
                            }
                            org.telegram.ui.ActionBar.a7.V(h4Var.C0, org.telegram.ui.ActionBar.t6.E8, null);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = h4Var.B0;
                            if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                            }
                            h4Var.B0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), Integer.MIN_VALUE));
                            h4Var.H.setFocusable(true);
                            h4Var.H.showAtLocation(view3, 48, 0, L);
                            h4Var.H.h();
                        }
                        h4Var.f37746u0[0].f39038b.setLayoutFrozen(true);
                        h4Var.f37746u0[0].f39038b.setLayoutFrozen(false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                if (h4Var.L0 == null) {
                    h4Var.L0 = new y2(h4Var, 0);
                }
                h4Var.L0.getClass();
                ArticleViewer$WindowView articleViewer$WindowView2 = h4Var.f37732f0;
                if (articleViewer$WindowView2 != null) {
                    articleViewer$WindowView2.postDelayed(h4Var.L0, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    return;
                }
                return;
        }
    }
}
