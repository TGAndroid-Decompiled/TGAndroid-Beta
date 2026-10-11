package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ru extends og.b {
    public final int d;
    public final Object f41511e;

    public ru(Object obj, int i10) {
        this.d = i10;
        this.f41511e = obj;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        switch (this.d) {
            case 0:
                ou ouVar = (ou) ((tu) this.f41511e).f42266a3.get(d1Var.b());
                int i10 = ouVar.f17175a;
                if (i10 != 5 && (i10 != 2 || ouVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i11 = d1Var.f47752f;
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
                return ((tu) this.f41511e).f42266a3.size();
            default:
                return ((lc0) this.f41511e).f39589s.size();
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((ou) ((tu) this.f41511e).f42266a3.get(i10)).f17175a;
            default:
                lc0 lc0Var = (lc0) this.f41511e;
                if (i10 >= 0 && i10 < lc0Var.f39589s.size()) {
                    return ((fc0) lc0Var.f39589s.get(i10)).f17175a;
                }
                return 2;
        }
    }

    @Override
    public final void v(s4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ru.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        int i11 = this.d;
        View view = null;
        Object obj = this.f41511e;
        switch (i11) {
            case 0:
                tu tuVar = (tu) obj;
                xu xuVar = tuVar.f42277m3;
                org.telegram.ui.ActionBar.d6 d6Var = tuVar.f30807n2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        if (i10 != 7) {
                                            r8Var = new mu(xuVar, tuVar.getContext());
                                        } else {
                                            View aoVar = new org.telegram.ui.Components.ao(tuVar.getContext(), 14);
                                            int i12 = org.telegram.ui.ActionBar.h6.f20786d6;
                                            int i13 = tu.f42265n3;
                                            aoVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i12, tuVar.f30807n2));
                                            r8Var = aoVar;
                                        }
                                    } else {
                                        ?? view2 = new View(tuVar.getContext());
                                        view2.f43139a = new Path();
                                        Paint paint = new Paint(1);
                                        view2.f43140b = paint;
                                        view2.f43141c = true;
                                        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false));
                                        r8Var = view2;
                                    }
                                } else {
                                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(tuVar.getContext());
                                    r8Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21007p7, d6Var));
                                    r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20786d6, d6Var));
                                    r8Var = r8Var2;
                                }
                            } else {
                                View m4Var = new org.telegram.ui.Cells.m4(tuVar.getContext());
                                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20786d6, d6Var));
                                r8Var = m4Var;
                            }
                        } else {
                            r8Var = new org.telegram.ui.Cells.e9(tuVar.getContext());
                        }
                    } else {
                        Context context = tuVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f43876a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(xuVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21171y6));
                        frameLayout.addView(textView, w7.x5.a(-2.0f, 24.0f, 0.0f, 24.0f, 14.0f, -1, 119));
                        frameLayout.setTag(-33024);
                        r8Var = frameLayout;
                    }
                } else {
                    Context context2 = tuVar.getContext();
                    int[] iArr = xu.f44182e;
                    qu quVar = new qu(this, context2, iArr.length, iArr, xu.f44183f);
                    tuVar.f42276l3 = quVar;
                    quVar.setInterceptTouch(false);
                    View view3 = tuVar.f42276l3;
                    view3.setTag(-33024);
                    r8Var = view3;
                }
                return new s4.d1(r8Var);
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
                return new s4.d1(view);
        }
    }
}
