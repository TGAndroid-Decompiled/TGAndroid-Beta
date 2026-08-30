package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ru extends bg.c {
    public final int d;
    public final Object e;

    public ru(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        switch (this.d) {
            case 0:
                ou ouVar = (ou) ((tu) this.e).Z2.get(l1Var.b());
                int i10 = ouVar.f1808a;
                if (i10 != 5 && (i10 != 2 || ouVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i11 = l1Var.f5788f;
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
                return ((tu) this.e).Z2.size();
            default:
                return ((ec0) this.e).f33988s.size();
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((ou) ((tu) this.e).Z2.get(i10)).f1808a;
            default:
                ec0 ec0Var = (ec0) this.e;
                if (i10 >= 0 && i10 < ec0Var.f33988s.size()) {
                    return ((yb0) ec0Var.f33988s.get(i10)).f1808a;
                }
                return 2;
        }
    }

    @Override
    public final void v(f2.l1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ru.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.o8 o8Var;
        int i11 = this.d;
        View view = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                tu tuVar = (tu) obj;
                xu xuVar = tuVar.f38761l3;
                org.telegram.ui.ActionBar.f6 f6Var = tuVar.f28750m2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        if (i10 != 7) {
                                            o8Var = new mu(xuVar, tuVar.getContext());
                                        } else {
                                            View hnVar = new org.telegram.ui.Components.hn(tuVar.getContext(), 11);
                                            int i12 = org.telegram.ui.ActionBar.j6.f19906d6;
                                            int i13 = tu.f38750m3;
                                            hnVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, tuVar.f28750m2));
                                            o8Var = hnVar;
                                        }
                                    } else {
                                        ?? view2 = new View(tuVar.getContext());
                                        view2.f39246a = new Path();
                                        Paint paint = new Paint(1);
                                        view2.f39247b = paint;
                                        view2.f39248c = true;
                                        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                                        o8Var = view2;
                                    }
                                } else {
                                    org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(tuVar.getContext());
                                    o8Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20122p7, f6Var));
                                    o8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, f6Var));
                                    o8Var = o8Var2;
                                }
                            } else {
                                View m4Var = new org.telegram.ui.Cells.m4(tuVar.getContext());
                                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, f6Var));
                                o8Var = m4Var;
                            }
                        } else {
                            o8Var = new org.telegram.ui.Cells.a9(tuVar.getContext());
                        }
                    } else {
                        Context context = tuVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f39795a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(xuVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20281y6));
                        frameLayout.addView(textView, k7.b6.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        o8Var = frameLayout;
                    }
                } else {
                    Context context2 = tuVar.getContext();
                    int[] iArr = xu.e;
                    qu quVar = new qu(this, context2, iArr.length, iArr, xu.f40307f);
                    tuVar.f38760k3 = quVar;
                    quVar.setInterceptTouch(false);
                    View view3 = tuVar.f38760k3;
                    view3.setTag(-33024);
                    o8Var = view3;
                }
                return new f2.l1(o8Var);
            default:
                ec0 ec0Var = (ec0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view = new org.telegram.ui.Cells.m4(context3);
                } else if (i10 == 1) {
                    view = new cc0(ec0Var, context3);
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.a9(context3);
                } else if (i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        view = new org.telegram.ui.Cells.o8(23, context3, null, false, true);
                    }
                } else {
                    view = new dc0(ec0Var, context3);
                }
                return new f2.l1(view);
        }
    }
}
