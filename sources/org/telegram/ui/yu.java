package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class yu extends pg.b {
    public final int d;
    public final Object e;

    public yu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        switch (this.d) {
            case 0:
                vu vuVar = (vu) ((av) this.e).f34346a3.get(b1Var.b());
                int i10 = vuVar.f43203a;
                if (i10 != 5 && (i10 != 2 || vuVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i11 = b1Var.f44841f;
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
                return ((av) this.e).f34346a3.size();
            default:
                return ((rc0) this.e).f39763s.size();
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((vu) ((av) this.e).f34346a3.get(i10)).f43203a;
            default:
                rc0 rc0Var = (rc0) this.e;
                if (i10 >= 0 && i10 < rc0Var.f39763s.size()) {
                    return ((lc0) rc0Var.f39763s.get(i10)).f43203a;
                }
                return 2;
        }
    }

    @Override
    public final void v(s4.b1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yu.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        int i11 = this.d;
        View view = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                av avVar = (av) obj;
                ev evVar = avVar.f34358m3;
                org.telegram.ui.ActionBar.c6 c6Var = avVar.f27439n2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        if (i10 != 7) {
                                            r8Var = new tu(evVar, avVar.getContext());
                                        } else {
                                            View xnVar = new org.telegram.ui.Components.xn(avVar.getContext(), 14);
                                            int i12 = org.telegram.ui.ActionBar.g6.f19901d6;
                                            int i13 = av.f34345n3;
                                            xnVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i12, avVar.f27439n2));
                                            r8Var = xnVar;
                                        }
                                    } else {
                                        ?? view2 = new View(avVar.getContext());
                                        view2.f35077a = new Path();
                                        Paint paint = new Paint(1);
                                        view2.f35078b = paint;
                                        view2.f35079c = true;
                                        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                                        r8Var = view2;
                                    }
                                } else {
                                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(avVar.getContext());
                                    r8Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20122p7, c6Var));
                                    r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, c6Var));
                                    r8Var = r8Var2;
                                }
                            } else {
                                View m4Var = new org.telegram.ui.Cells.m4(avVar.getContext());
                                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, c6Var));
                                r8Var = m4Var;
                            }
                        } else {
                            r8Var = new org.telegram.ui.Cells.e9(avVar.getContext());
                        }
                    } else {
                        Context context = avVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f35393a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(evVar.getThemedColor(org.telegram.ui.ActionBar.g6.f20288y6));
                        frameLayout.addView(textView, w7.a6.a(-2.0f, 24.0f, 0.0f, 24.0f, 14.0f, -1, 119));
                        frameLayout.setTag(-33024);
                        r8Var = frameLayout;
                    }
                } else {
                    Context context2 = avVar.getContext();
                    int[] iArr = ev.e;
                    xu xuVar = new xu(this, context2, iArr.length, iArr, ev.f35676f);
                    avVar.f34357l3 = xuVar;
                    xuVar.setInterceptTouch(false);
                    View view3 = avVar.f34357l3;
                    view3.setTag(-33024);
                    r8Var = view3;
                }
                return new s4.b1(r8Var);
            default:
                rc0 rc0Var = (rc0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view = new org.telegram.ui.Cells.m4(context3);
                } else if (i10 == 1) {
                    view = new pc0(rc0Var, context3);
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.e9(context3);
                } else if (i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        view = new org.telegram.ui.Cells.r8(23, context3, null, false, true);
                    }
                } else {
                    view = new qc0(rc0Var, context3);
                }
                return new s4.b1(view);
        }
    }
}
