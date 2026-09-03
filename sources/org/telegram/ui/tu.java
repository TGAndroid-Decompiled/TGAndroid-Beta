package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class tu extends bg.c {
    public final int d;
    public final Object e;

    public tu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        switch (this.d) {
            case 0:
                qu quVar = (qu) ((vu) this.e).Z2.get(l1Var.b());
                int i10 = quVar.f1830a;
                if (i10 != 5 && (i10 != 2 || quVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i11 = l1Var.f5777f;
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
                return ((vu) this.e).Z2.size();
            default:
                return ((gc0) this.e).f34414s.size();
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((qu) ((vu) this.e).Z2.get(i10)).f1830a;
            default:
                gc0 gc0Var = (gc0) this.e;
                if (i10 >= 0 && i10 < gc0Var.f34414s.size()) {
                    return ((ac0) gc0Var.f34414s.get(i10)).f1830a;
                }
                return 2;
        }
    }

    @Override
    public final void v(f2.l1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tu.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.n8 n8Var;
        int i11 = this.d;
        View view = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                vu vuVar = (vu) obj;
                zu zuVar = vuVar.f39203l3;
                org.telegram.ui.ActionBar.f6 f6Var = vuVar.f28511m2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        if (i10 != 7) {
                                            n8Var = new ou(zuVar, vuVar.getContext());
                                        } else {
                                            View gnVar = new org.telegram.ui.Components.gn(vuVar.getContext(), 11);
                                            int i12 = org.telegram.ui.ActionBar.j6.f19881d6;
                                            int i13 = vu.f39192m3;
                                            gnVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, vuVar.f28511m2));
                                            n8Var = gnVar;
                                        }
                                    } else {
                                        ?? view2 = new View(vuVar.getContext());
                                        view2.f40070a = new Path();
                                        Paint paint = new Paint(1);
                                        view2.f40071b = paint;
                                        view2.f40072c = true;
                                        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                                        n8Var = view2;
                                    }
                                } else {
                                    org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(vuVar.getContext());
                                    n8Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20097p7, f6Var));
                                    n8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, f6Var));
                                    n8Var = n8Var2;
                                }
                            } else {
                                View l4Var = new org.telegram.ui.Cells.l4(vuVar.getContext());
                                l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, f6Var));
                                n8Var = l4Var;
                            }
                        } else {
                            n8Var = new org.telegram.ui.Cells.z8(vuVar.getContext());
                        }
                    } else {
                        Context context = vuVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f40329a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(zuVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20256y6));
                        frameLayout.addView(textView, k7.b6.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        n8Var = frameLayout;
                    }
                } else {
                    Context context2 = vuVar.getContext();
                    int[] iArr = zu.e;
                    su suVar = new su(this, context2, iArr.length, iArr, zu.f40874f);
                    vuVar.f39202k3 = suVar;
                    suVar.setInterceptTouch(false);
                    View view3 = vuVar.f39202k3;
                    view3.setTag(-33024);
                    n8Var = view3;
                }
                return new f2.l1(n8Var);
            default:
                gc0 gc0Var = (gc0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view = new org.telegram.ui.Cells.l4(context3);
                } else if (i10 == 1) {
                    view = new ec0(gc0Var, context3);
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.z8(context3);
                } else if (i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        view = new org.telegram.ui.Cells.n8(23, context3, null, false, true);
                    }
                } else {
                    view = new fc0(gc0Var, context3);
                }
                return new f2.l1(view);
        }
    }
}
