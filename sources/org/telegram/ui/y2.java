package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class y2 implements Runnable {
    public final int f54162a;
    public final g4 f54163b;

    public y2(g4 g4Var, int i7) {
        this.f54162a = i7;
        this.f54163b = g4Var;
    }

    @Override
    public final void run() {
        ArticleViewer$WindowView articleViewer$WindowView;
        org.telegram.ui.Cells.i9 i9Var;
        int i7 = this.f54162a;
        g4 g4Var = this.f54163b;
        switch (i7) {
            case 0:
                if (g4Var.L0 && (articleViewer$WindowView = g4Var.f48070g0) != null) {
                    g4Var.L0 = false;
                    if (g4Var.f50839b != null) {
                        try {
                            articleViewer$WindowView.performHapticFeedback(0, 2);
                        } catch (Exception unused) {
                        }
                        g4Var.X(((org.telegram.ui.Components.az0) g4Var.f50839b.f36682i).f33586b);
                        g4Var.f50839b = null;
                        g4Var.d = null;
                        View view = g4Var.f50842f;
                        if (view != null) {
                            view.invalidate();
                            return;
                        }
                        return;
                    }
                    View view2 = g4Var.f50842f;
                    if (view2 != null && g4Var.Q0.f0(view2)) {
                        if (g4Var.f50842f.getTag() != null && g4Var.f50842f.getTag() == "bottomSheet" && (i9Var = g4Var.R0) != null) {
                            i9Var.l0();
                        } else {
                            g4Var.Q0.l0();
                        }
                        if (g4Var.Q0.x()) {
                            try {
                                g4Var.f48070g0.performHapticFeedback(0, 2);
                                return;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                        return;
                    } else if (g4Var.d != null && g4Var.f50842f != null) {
                        try {
                            g4Var.f48070g0.performHapticFeedback(0, 2);
                        } catch (Exception unused3) {
                        }
                        int[] iArr = new int[2];
                        g4Var.f50842f.getLocationInWindow(iArr);
                        int L = (iArr[1] + g4Var.f50841e) - org.telegram.messenger.g0.L(54.0f);
                        if (L < 0) {
                            L = 0;
                        }
                        g4Var.f50842f.invalidate();
                        g4Var.h = true;
                        View view3 = g4Var.f50842f;
                        org.telegram.ui.ActionBar.g1 g1Var = g4Var.I;
                        if (g1Var != null && g1Var.isShowing()) {
                            g4Var.I.d(true);
                        } else {
                            if (g4Var.C0 == null) {
                                g4Var.E0 = new Rect();
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(g4Var.M, null);
                                g4Var.C0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                                g4Var.C0.setBackgroundDrawable(g4Var.M.getResources().getDrawable(2131231785));
                                g4Var.C0.setAnimationEnabled(false);
                                g4Var.C0.setOnTouchListener(new c0(g4Var, 0));
                                g4Var.C0.setDispatchKeyEventListener(new s(g4Var));
                                g4Var.C0.setShownFromBottom(false);
                                TextView textView = new TextView(g4Var.M);
                                g4Var.D0 = textView;
                                int i10 = org.telegram.ui.ActionBar.n6.f29543i6;
                                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i10, false), 2, -1);
                                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
                                textView.setBackground(h02);
                                org.telegram.ui.ActionBar.u6.j(textView, h02, null, M, null);
                                g4Var.D0.setGravity(16);
                                g4Var.D0.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
                                g4Var.D0.setTextSize(1, 15.0f);
                                g4Var.D0.setTypeface(org.telegram.messenger.g0.o());
                                g4Var.D0.setText(org.telegram.messenger.gd.N0(2131751755, null).toUpperCase());
                                g4Var.D0.setOnClickListener(new r(g4Var, 5));
                                g4Var.C0.addView(g4Var.D0, c8.na.c(48.0f, -2));
                                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(g4Var.C0, -2, -2);
                                g4Var.I = g1Var2;
                                g1Var2.f29034b = false;
                                g1Var2.setAnimationStyle(2131755192);
                                g4Var.I.setOutsideTouchable(true);
                                g4Var.I.setClippingEnabled(true);
                                g4Var.I.setInputMethodMode(2);
                                g4Var.I.setSoftInputMode(0);
                                g4Var.I.getContentView().setFocusableInTouchMode(true);
                                g4Var.I.setOnDismissListener(new d0(g4Var, 0));
                            }
                            org.telegram.ui.ActionBar.u6.U(g4Var.D0, org.telegram.ui.ActionBar.n6.E8, null);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = g4Var.C0;
                            if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                            }
                            g4Var.C0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                            g4Var.I.setFocusable(true);
                            g4Var.I.showAtLocation(view3, 48, 0, L);
                            g4Var.I.h();
                        }
                        g4Var.f48084v0[0].f49288b.setLayoutFrozen(true);
                        g4Var.f48084v0[0].f49288b.setLayoutFrozen(false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                if (g4Var.M0 == null) {
                    g4Var.M0 = new y2(g4Var, 0);
                }
                g4Var.M0.getClass();
                ArticleViewer$WindowView articleViewer$WindowView2 = g4Var.f48070g0;
                if (articleViewer$WindowView2 != null) {
                    articleViewer$WindowView2.postDelayed(g4Var.M0, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    return;
                }
                return;
        }
    }
}
