package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class tu extends og.b {
    public final int d;
    public final Object f41025e;

    public tu(Object obj, int i10) {
        this.d = i10;
        this.f41025e = obj;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.d) {
            case 0:
                qu quVar = (qu) ((vu) this.f41025e).j3.get(c1Var.b());
                int i10 = quVar.f17192a;
                if (i10 != 5 && (i10 != 2 || quVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i11 = c1Var.f46542f;
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
                return ((vu) this.f41025e).j3.size();
            default:
                return ((lc0) this.f41025e).f38283s.size();
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((qu) ((vu) this.f41025e).j3.get(i10)).f17192a;
            default:
                lc0 lc0Var = (lc0) this.f41025e;
                if (i10 >= 0 && i10 < lc0Var.f38283s.size()) {
                    return ((fc0) lc0Var.f38283s.get(i10)).f17192a;
                }
                return 2;
        }
    }

    @Override
    public final void v(s4.c1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tu.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        int i11 = this.d;
        View view = null;
        Object obj = this.f41025e;
        switch (i11) {
            case 0:
                vu vuVar = (vu) obj;
                zu zuVar = vuVar.f41838v3;
                org.telegram.ui.ActionBar.d6 d6Var = vuVar.f33560p2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        if (i10 != 7) {
                                            r8Var = new ou(zuVar, vuVar.getContext());
                                        } else {
                                            View nnVar = new org.telegram.ui.Components.nn(vuVar.getContext(), 14);
                                            int i12 = org.telegram.ui.ActionBar.i6.f20827d6;
                                            int i13 = vu.f41821w3;
                                            nnVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i12, vuVar.f33560p2));
                                            r8Var = nnVar;
                                        }
                                    } else {
                                        ?? view2 = new View(vuVar.getContext());
                                        view2.f43017a = new Path();
                                        Paint paint = new Paint(1);
                                        view2.f43018b = paint;
                                        view2.f43019c = true;
                                        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20827d6, false));
                                        r8Var = view2;
                                    }
                                } else {
                                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(vuVar.getContext());
                                    r8Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21049p7, d6Var));
                                    r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20827d6, d6Var));
                                    r8Var = r8Var2;
                                }
                            } else {
                                View m4Var = new org.telegram.ui.Cells.m4(vuVar.getContext());
                                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20827d6, d6Var));
                                r8Var = m4Var;
                            }
                        } else {
                            r8Var = new org.telegram.ui.Cells.e9(vuVar.getContext());
                        }
                    } else {
                        Context context = vuVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f43619a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(zuVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21214y6));
                        frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        r8Var = frameLayout;
                    }
                } else {
                    Context context2 = vuVar.getContext();
                    int[] iArr = zu.f43908s;
                    su suVar = new su(this, context2, iArr.length, iArr, zu.v);
                    vuVar.f41837u3 = suVar;
                    suVar.setInterceptTouch(false);
                    View view3 = vuVar.f41837u3;
                    view3.setTag(-33024);
                    r8Var = view3;
                }
                return new s4.c1(r8Var);
            default:
                lc0 lc0Var = (lc0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view = new org.telegram.ui.Cells.m4(context3);
                } else if (i10 == 1) {
                    view = new jc0(lc0Var, context3);
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.e9(context3);
                } else if (i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        view = new org.telegram.ui.Cells.r8(23, context3, null, false, true);
                    }
                } else {
                    view = new kc0(lc0Var, context3);
                }
                return new s4.c1(view);
        }
    }
}
