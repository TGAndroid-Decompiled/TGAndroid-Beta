package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class y2 implements Runnable {
    public final int f52055a;
    public final g4 f52056b;

    public y2(g4 g4Var, int i7) {
        this.f52055a = i7;
        this.f52056b = g4Var;
    }

    @Override
    public final void run() {
        ArticleViewer$WindowView articleViewer$WindowView;
        org.telegram.ui.Cells.i9 i9Var;
        int i7 = this.f52055a;
        g4 g4Var = this.f52056b;
        switch (i7) {
            case 0:
                if (g4Var.K0 && (articleViewer$WindowView = g4Var.f45829f0) != null) {
                    g4Var.K0 = false;
                    if (g4Var.f48268b != null) {
                        try {
                            articleViewer$WindowView.performHapticFeedback(0, 2);
                        } catch (Exception unused) {
                        }
                        g4Var.X(((org.telegram.ui.Components.py0) g4Var.f48268b.f40209i).f37087b);
                        g4Var.f48268b = null;
                        g4Var.d = null;
                        View view = g4Var.f48271f;
                        if (view != null) {
                            view.invalidate();
                            return;
                        }
                        return;
                    }
                    View view2 = g4Var.f48271f;
                    if (view2 != null && g4Var.P0.f0(view2)) {
                        if (g4Var.f48271f.getTag() != null && g4Var.f48271f.getTag() == "bottomSheet" && (i9Var = g4Var.Q0) != null) {
                            i9Var.l0();
                        } else {
                            g4Var.P0.l0();
                        }
                        if (g4Var.P0.x()) {
                            try {
                                g4Var.f45829f0.performHapticFeedback(0, 2);
                                return;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                        return;
                    } else if (g4Var.d != null && g4Var.f48271f != null) {
                        try {
                            g4Var.f45829f0.performHapticFeedback(0, 2);
                        } catch (Exception unused3) {
                        }
                        int[] iArr = new int[2];
                        g4Var.f48271f.getLocationInWindow(iArr);
                        int L = (iArr[1] + g4Var.f48270e) - org.telegram.messenger.g0.L(54.0f);
                        if (L < 0) {
                            L = 0;
                        }
                        g4Var.f48271f.invalidate();
                        g4Var.h = true;
                        View view3 = g4Var.f48271f;
                        org.telegram.ui.ActionBar.g1 g1Var = g4Var.H;
                        if (g1Var != null && g1Var.isShowing()) {
                            g4Var.H.d(true);
                        } else {
                            if (g4Var.B0 == null) {
                                g4Var.D0 = new Rect();
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(g4Var.L, null);
                                g4Var.B0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                                g4Var.B0.setBackgroundDrawable(g4Var.L.getResources().getDrawable(2131231781));
                                g4Var.B0.setAnimationEnabled(false);
                                g4Var.B0.setOnTouchListener(new d0(g4Var, 0));
                                g4Var.B0.setDispatchKeyEventListener(new s(g4Var));
                                g4Var.B0.setShownFromBottom(false);
                                TextView textView = new TextView(g4Var.L);
                                g4Var.C0 = textView;
                                int i10 = org.telegram.ui.ActionBar.k6.f27940i6;
                                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 2, -1);
                                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
                                textView.setBackground(h02);
                                org.telegram.ui.ActionBar.r6.k(textView, h02, null, N, null);
                                g4Var.C0.setGravity(16);
                                g4Var.C0.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
                                g4Var.C0.setTextSize(1, 15.0f);
                                g4Var.C0.setTypeface(org.telegram.messenger.g0.o());
                                g4Var.C0.setText(org.telegram.messenger.hd.M0(2131751767, null).toUpperCase());
                                g4Var.C0.setOnClickListener(new r(g4Var, 5));
                                g4Var.B0.addView(g4Var.C0, c8.ha.c(48.0f, -2));
                                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(g4Var.B0, -2, -2);
                                g4Var.H = g1Var2;
                                g1Var2.f27479b = false;
                                g1Var2.setAnimationStyle(2131755192);
                                g4Var.H.setOutsideTouchable(true);
                                g4Var.H.setClippingEnabled(true);
                                g4Var.H.setInputMethodMode(2);
                                g4Var.H.setSoftInputMode(0);
                                g4Var.H.getContentView().setFocusableInTouchMode(true);
                                g4Var.H.setOnDismissListener(new e0(g4Var, 0));
                            }
                            org.telegram.ui.ActionBar.r6.V(g4Var.C0, org.telegram.ui.ActionBar.k6.E8, null);
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = g4Var.B0;
                            if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                            }
                            g4Var.B0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
                            g4Var.H.setFocusable(true);
                            g4Var.H.showAtLocation(view3, 48, 0, L);
                            g4Var.H.h();
                        }
                        g4Var.f45843u0[0].f47088b.setLayoutFrozen(true);
                        g4Var.f45843u0[0].f47088b.setLayoutFrozen(false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                if (g4Var.L0 == null) {
                    g4Var.L0 = new y2(g4Var, 0);
                }
                g4Var.L0.getClass();
                ArticleViewer$WindowView articleViewer$WindowView2 = g4Var.f45829f0;
                if (articleViewer$WindowView2 != null) {
                    articleViewer$WindowView2.postDelayed(g4Var.L0, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    return;
                }
                return;
        }
    }
}
