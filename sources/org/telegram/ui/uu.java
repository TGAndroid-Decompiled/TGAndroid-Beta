package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class uu extends og.b {
    public final int d;
    public final Object e;

    public uu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.d) {
            case 0:
                ru ruVar = (ru) ((wu) this.e).f39245c3.get(c1Var.b());
                int i10 = ruVar.f15672a;
                if (i10 != 5 && (i10 != 2 || ruVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i11 = c1Var.f42932f;
                if (i11 != 4 && i11 != 3 && i11 != 5) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int h() {
        switch (this.d) {
            case 0:
                return ((wu) this.e).f39245c3.size();
            default:
                return ((oc0) this.e).f36170s.size();
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((ru) ((wu) this.e).f39245c3.get(i10)).f15672a;
            default:
                oc0 oc0Var = (oc0) this.e;
                if (i10 >= 0 && i10 < oc0Var.f36170s.size()) {
                    return ((ic0) oc0Var.f36170s.get(i10)).f15672a;
                }
                return 2;
        }
    }

    @Override
    public final void v(s4.c1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uu.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        int i11 = this.d;
        View view = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                wu wuVar = (wu) obj;
                av avVar = wuVar.f39256o3;
                org.telegram.ui.ActionBar.e6 e6Var = wuVar.f30090p2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        if (i10 != 7) {
                                            r8Var = new pu(avVar, wuVar.getContext());
                                        } else {
                                            View knVar = new org.telegram.ui.Components.kn(wuVar.getContext(), 14);
                                            int i12 = org.telegram.ui.ActionBar.j6.f19062d6;
                                            int i13 = wu.f39242p3;
                                            knVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, wuVar.f30090p2));
                                            r8Var = knVar;
                                        }
                                    } else {
                                        ?? view2 = new View(wuVar.getContext());
                                        view2.f39899a = new Path();
                                        Paint paint = new Paint(1);
                                        view2.f39900b = paint;
                                        view2.f39901c = true;
                                        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19062d6, false));
                                        r8Var = view2;
                                    }
                                } else {
                                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(wuVar.getContext());
                                    r8Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19283p7, e6Var));
                                    r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19062d6, e6Var));
                                    r8Var = r8Var2;
                                }
                            } else {
                                View m4Var = new org.telegram.ui.Cells.m4(wuVar.getContext());
                                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19062d6, e6Var));
                                r8Var = m4Var;
                            }
                        } else {
                            r8Var = new org.telegram.ui.Cells.e9(wuVar.getContext());
                        }
                    } else {
                        Context context = wuVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f40557a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(avVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19445y6));
                        frameLayout.addView(textView, w7.y5.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        r8Var = frameLayout;
                    }
                } else {
                    Context context2 = wuVar.getContext();
                    int[] iArr = av.f32144s;
                    tu tuVar = new tu(this, context2, iArr.length, iArr, av.v);
                    wuVar.f39255n3 = tuVar;
                    tuVar.setInterceptTouch(false);
                    View view3 = wuVar.f39255n3;
                    view3.setTag(-33024);
                    r8Var = view3;
                }
                return new s4.c1(r8Var);
            default:
                oc0 oc0Var = (oc0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view = new org.telegram.ui.Cells.m4(context3);
                } else if (i10 == 1) {
                    view = new mc0(oc0Var, context3);
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.e9(context3);
                } else if (i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        view = new org.telegram.ui.Cells.r8(23, context3, null, false, true);
                    }
                } else {
                    view = new nc0(oc0Var, context3);
                }
                return new s4.c1(view);
        }
    }
}
