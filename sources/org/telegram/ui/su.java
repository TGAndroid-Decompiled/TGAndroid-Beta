package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class su extends cg.c {
    public final int d;
    public final Object f41368e;

    public su(Object obj, int i10) {
        this.d = i10;
        this.f41368e = obj;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        switch (this.d) {
            case 0:
                pu puVar = (pu) ((uu) this.f41368e).Z2.get(m1Var.b());
                int i10 = puVar.f2505a;
                if (i10 != 5 && (i10 != 2 || puVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i11 = m1Var.f5879f;
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
                return ((uu) this.f41368e).Z2.size();
            default:
                return ((fc0) this.f41368e).f36850s.size();
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((pu) ((uu) this.f41368e).Z2.get(i10)).f2505a;
            default:
                fc0 fc0Var = (fc0) this.f41368e;
                if (i10 >= 0 && i10 < fc0Var.f36850s.size()) {
                    return ((zb0) fc0Var.f36850s.get(i10)).f2505a;
                }
                return 2;
        }
    }

    @Override
    public final void v(f2.m1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.su.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.o8 o8Var;
        int i11 = this.d;
        View view = null;
        Object obj = this.f41368e;
        switch (i11) {
            case 0:
                uu uuVar = (uu) obj;
                yu yuVar = uuVar.f42048l3;
                org.telegram.ui.ActionBar.g6 g6Var = uuVar.f31383m2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        if (i10 != 7) {
                                            o8Var = new nu(yuVar, uuVar.getContext());
                                        } else {
                                            View jnVar = new org.telegram.ui.Components.jn(uuVar.getContext(), 11);
                                            int i12 = org.telegram.ui.ActionBar.k6.f21659d6;
                                            int i13 = uu.f42037m3;
                                            jnVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i12, uuVar.f31383m2));
                                            o8Var = jnVar;
                                        }
                                    } else {
                                        ?? view2 = new View(uuVar.getContext());
                                        view2.f42886a = new Path();
                                        Paint paint = new Paint(1);
                                        view2.f42887b = paint;
                                        view2.f42888c = true;
                                        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                                        o8Var = view2;
                                    }
                                } else {
                                    org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(uuVar.getContext());
                                    o8Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21876p7, g6Var));
                                    o8Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, g6Var));
                                    o8Var = o8Var2;
                                }
                            } else {
                                View m4Var = new org.telegram.ui.Cells.m4(uuVar.getContext());
                                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, g6Var));
                                o8Var = m4Var;
                            }
                        } else {
                            o8Var = new org.telegram.ui.Cells.a9(uuVar.getContext());
                        }
                    } else {
                        Context context = uuVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f43459a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(yuVar.getThemedColor(org.telegram.ui.ActionBar.k6.f22036y6));
                        frameLayout.addView(textView, k7.c6.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        o8Var = frameLayout;
                    }
                } else {
                    Context context2 = uuVar.getContext();
                    int[] iArr = yu.f43707e;
                    ru ruVar = new ru(this, context2, iArr.length, iArr, yu.f43708f);
                    uuVar.f42047k3 = ruVar;
                    ruVar.setInterceptTouch(false);
                    View view3 = uuVar.f42047k3;
                    view3.setTag(-33024);
                    o8Var = view3;
                }
                return new f2.m1(o8Var);
            default:
                fc0 fc0Var = (fc0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view = new org.telegram.ui.Cells.m4(context3);
                } else if (i10 == 1) {
                    view = new dc0(fc0Var, context3);
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.a9(context3);
                } else if (i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        view = new org.telegram.ui.Cells.o8(23, context3, null, false, true);
                    }
                } else {
                    view = new ec0(fc0Var, context3);
                }
                return new f2.m1(view);
        }
    }
}
