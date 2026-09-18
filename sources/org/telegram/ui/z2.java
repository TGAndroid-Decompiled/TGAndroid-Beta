package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class z2 implements Runnable {
    public final int f39951a;
    public final h4 f39952b;

    public z2(h4 h4Var, int i10) {
        this.f39951a = i10;
        this.f39952b = h4Var;
    }

    @Override
    public final void run() {
        ArticleViewer$WindowView articleViewer$WindowView;
        org.telegram.ui.Cells.q9 q9Var;
        switch (this.f39951a) {
            case 0:
                h4 h4Var = this.f39952b;
                if (h4Var.J0 && (articleViewer$WindowView = h4Var.f34060f0) != null) {
                    h4Var.J0 = false;
                    if (h4Var.f37896b != null) {
                        try {
                            articleViewer$WindowView.performHapticFeedback(0, 2);
                        } catch (Exception unused) {
                        }
                        h4Var.Z(((org.telegram.ui.Components.z01) h4Var.f37896b.f26369i).f30697b);
                        h4Var.f37896b = null;
                        h4Var.d = null;
                        View view = h4Var.f37898f;
                        if (view != null) {
                            view.invalidate();
                            return;
                        }
                        return;
                    }
                    View view2 = h4Var.f37898f;
                    if (view2 != null && h4Var.O0.g0(view2)) {
                        if (h4Var.f37898f.getTag() != null && h4Var.f37898f.getTag() == "bottomSheet" && (q9Var = h4Var.P0) != null) {
                            q9Var.m0();
                        } else {
                            h4Var.O0.m0();
                        }
                        if (h4Var.O0.y()) {
                            try {
                                h4Var.f34060f0.performHapticFeedback(0, 2);
                                return;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                        return;
                    } else if (h4Var.d != null && h4Var.f37898f != null) {
                        try {
                            h4Var.f34060f0.performHapticFeedback(0, 2);
                        } catch (Exception unused3) {
                        }
                        int[] iArr = new int[2];
                        h4Var.f37898f.getLocationInWindow(iArr);
                        int dp = (iArr[1] + h4Var.e) - AndroidUtilities.dp(54.0f);
                        if (dp < 0) {
                            dp = 0;
                        }
                        h4Var.f37898f.invalidate();
                        h4Var.h = true;
                        View view3 = h4Var.f37898f;
                        org.telegram.ui.ActionBar.n1 n1Var = h4Var.H;
                        if (n1Var != null && n1Var.isShowing()) {
                            h4Var.H.d(true);
                        } else {
                            if (h4Var.A0 == null) {
                                h4Var.C0 = new Rect();
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(h4Var.L, null);
                                h4Var.A0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                                h4Var.A0.setBackgroundDrawable(h4Var.L.getResources().getDrawable(R.drawable.menu_copy));
                                h4Var.A0.setAnimationEnabled(false);
                                h4Var.A0.setOnTouchListener(new d0(h4Var, 0));
                                h4Var.A0.setDispatchKeyEventListener(new t(h4Var));
                                h4Var.A0.setShownFromBottom(false);
                                TextView textView = new TextView(h4Var.L);
                                h4Var.B0 = textView;
                                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19152i6, false), 2, -1));
                                h4Var.B0.setGravity(16);
                                h4Var.B0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                                h4Var.B0.setTextSize(1, 15.0f);
                                h4Var.B0.setTypeface(AndroidUtilities.bold());
                                h4Var.B0.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                                h4Var.B0.setOnClickListener(new s(h4Var, 5));
                                h4Var.A0.addView(h4Var.B0, w7.y5.c(48.0f, -2));
                                org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(h4Var.A0, -2, -2);
                                h4Var.H = n1Var2;
                                n1Var2.f19608b = false;
                                n1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                                h4Var.H.setOutsideTouchable(true);
                                h4Var.H.setClippingEnabled(true);
                                h4Var.H.setInputMethodMode(2);
                                h4Var.H.setSoftInputMode(0);
                                h4Var.H.getContentView().setFocusableInTouchMode(true);
                                h4Var.H.setOnDismissListener(new e0(h4Var, 0));
                            }
                            h4Var.B0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
                            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = h4Var.A0;
                            if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false));
                            }
                            h4Var.A0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                            h4Var.H.setFocusable(true);
                            h4Var.H.showAtLocation(view3, 48, 0, dp);
                            h4Var.H.h();
                        }
                        h4Var.f34074u0[0].f35224b.setLayoutFrozen(true);
                        h4Var.f34074u0[0].f35224b.setLayoutFrozen(false);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                h4 h4Var2 = this.f39952b;
                if (h4Var2.K0 == null) {
                    h4Var2.K0 = new z2(h4Var2, 0);
                }
                h4Var2.K0.getClass();
                ArticleViewer$WindowView articleViewer$WindowView2 = h4Var2.f34060f0;
                if (articleViewer$WindowView2 != null) {
                    articleViewer$WindowView2.postDelayed(h4Var2.K0, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    return;
                }
                return;
        }
    }
}
