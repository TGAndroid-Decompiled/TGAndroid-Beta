package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class su extends og.b {
    public final int d;
    public final Object f41815e;

    public su(Object obj, int i10) {
        this.d = i10;
        this.f41815e = obj;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        switch (this.d) {
            case 0:
                pu puVar = (pu) ((uu) this.f41815e).f42600a3.get(d1Var.b());
                int i10 = puVar.f17129a;
                if (i10 != 5 && (i10 != 2 || puVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i11 = d1Var.f47706f;
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
                return ((uu) this.f41815e).f42600a3.size();
            default:
                return ((mc0) this.f41815e).f39879s.size();
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((pu) ((uu) this.f41815e).f42600a3.get(i10)).f17129a;
            default:
                mc0 mc0Var = (mc0) this.f41815e;
                if (i10 >= 0 && i10 < mc0Var.f39879s.size()) {
                    return ((gc0) mc0Var.f39879s.get(i10)).f17129a;
                }
                return 2;
        }
    }

    @Override
    public final void v(s4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.su.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        int i11 = this.d;
        View view = null;
        Object obj = this.f41815e;
        switch (i11) {
            case 0:
                uu uuVar = (uu) obj;
                yu yuVar = uuVar.f42611m3;
                org.telegram.ui.ActionBar.e6 e6Var = uuVar.f30511n2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        if (i10 != 7) {
                                            r8Var = new nu(yuVar, uuVar.getContext());
                                        } else {
                                            View aoVar = new org.telegram.ui.Components.ao(uuVar.getContext(), 14);
                                            int i12 = org.telegram.ui.ActionBar.i6.f20801d6;
                                            int i13 = uu.f42599n3;
                                            aoVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(i12, uuVar.f30511n2));
                                            r8Var = aoVar;
                                        }
                                    } else {
                                        ?? view2 = new View(uuVar.getContext());
                                        view2.f43801a = new Path();
                                        Paint paint = new Paint(1);
                                        view2.f43802b = paint;
                                        view2.f43803c = true;
                                        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false));
                                        r8Var = view2;
                                    }
                                } else {
                                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(uuVar.getContext());
                                    r8Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21022p7, e6Var));
                                    r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20801d6, e6Var));
                                    r8Var = r8Var2;
                                }
                            } else {
                                View m4Var = new org.telegram.ui.Cells.m4(uuVar.getContext());
                                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20801d6, e6Var));
                                r8Var = m4Var;
                            }
                        } else {
                            r8Var = new org.telegram.ui.Cells.e9(uuVar.getContext());
                        }
                    } else {
                        Context context = uuVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f44195a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(yuVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21185y6));
                        frameLayout.addView(textView, w7.x5.a(-2.0f, 24.0f, 0.0f, 24.0f, 14.0f, -1, 119));
                        frameLayout.setTag(-33024);
                        r8Var = frameLayout;
                    }
                } else {
                    Context context2 = uuVar.getContext();
                    int[] iArr = yu.f44453e;
                    ru ruVar = new ru(this, context2, iArr.length, iArr, yu.f44454f);
                    uuVar.f42610l3 = ruVar;
                    ruVar.setInterceptTouch(false);
                    View view3 = uuVar.f42610l3;
                    view3.setTag(-33024);
                    r8Var = view3;
                }
                return new s4.d1(r8Var);
            default:
                mc0 mc0Var = (mc0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view = new org.telegram.ui.Cells.m4(context3);
                } else if (i10 == 1) {
                    view = new kc0(mc0Var, context3);
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.e9(context3);
                } else if (i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        view = new org.telegram.ui.Cells.r8(23, context3, null, false, true);
                    }
                } else {
                    view = new lc0(mc0Var, context3);
                }
                return new s4.d1(view);
        }
    }
}
