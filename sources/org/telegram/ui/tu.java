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
    public final Object e;

    public tu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.d) {
            case 0:
                qu quVar = (qu) ((vu) this.e).f38624c3.get(c1Var.b());
                int i10 = quVar.f15531a;
                if (i10 != 5 && (i10 != 2 || quVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i11 = c1Var.f42674f;
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
                return ((vu) this.e).f38624c3.size();
            default:
                return ((nc0) this.e).f35958s.size();
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((qu) ((vu) this.e).f38624c3.get(i10)).f15531a;
            default:
                nc0 nc0Var = (nc0) this.e;
                if (i10 >= 0 && i10 < nc0Var.f35958s.size()) {
                    return ((hc0) nc0Var.f35958s.get(i10)).f15531a;
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
        Object obj = this.e;
        switch (i11) {
            case 0:
                vu vuVar = (vu) obj;
                zu zuVar = vuVar.f38635o3;
                org.telegram.ui.ActionBar.e6 e6Var = vuVar.f25969p2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        if (i10 != 7) {
                                            r8Var = new ou(zuVar, vuVar.getContext());
                                        } else {
                                            View knVar = new org.telegram.ui.Components.kn(vuVar.getContext(), 14);
                                            int i12 = org.telegram.ui.ActionBar.i6.f18834d6;
                                            int i13 = vu.f38621p3;
                                            knVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i12, vuVar.f25969p2));
                                            r8Var = knVar;
                                        }
                                    } else {
                                        ?? view2 = new View(vuVar.getContext());
                                        view2.f39692a = new Path();
                                        Paint paint = new Paint(1);
                                        view2.f39693b = paint;
                                        view2.f39694c = true;
                                        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false));
                                        r8Var = view2;
                                    }
                                } else {
                                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(vuVar.getContext());
                                    r8Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19053p7, e6Var));
                                    r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18834d6, e6Var));
                                    r8Var = r8Var2;
                                }
                            } else {
                                View m4Var = new org.telegram.ui.Cells.m4(vuVar.getContext());
                                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18834d6, e6Var));
                                r8Var = m4Var;
                            }
                        } else {
                            r8Var = new org.telegram.ui.Cells.e9(vuVar.getContext());
                        }
                    } else {
                        Context context = vuVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f39962a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(zuVar.getThemedColor(org.telegram.ui.ActionBar.i6.f19215y6));
                        frameLayout.addView(textView, w7.x5.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        r8Var = frameLayout;
                    }
                } else {
                    Context context2 = vuVar.getContext();
                    int[] iArr = zu.e;
                    su suVar = new su(this, context2, iArr.length, iArr, zu.f40293f);
                    vuVar.f38634n3 = suVar;
                    suVar.setInterceptTouch(false);
                    View view3 = vuVar.f38634n3;
                    view3.setTag(-33024);
                    r8Var = view3;
                }
                return new s4.c1(r8Var);
            default:
                nc0 nc0Var = (nc0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view = new org.telegram.ui.Cells.m4(context3);
                } else if (i10 == 1) {
                    view = new lc0(nc0Var, context3);
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.e9(context3);
                } else if (i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        view = new org.telegram.ui.Cells.r8(23, context3, null, false, true);
                    }
                } else {
                    view = new mc0(nc0Var, context3);
                }
                return new s4.c1(view);
        }
    }
}
