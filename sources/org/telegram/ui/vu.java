package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class vu extends og.b {
    public final int d;
    public final Object e;

    public vu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.d) {
            case 0:
                su suVar = (su) ((xu) this.e).f39703c3.get(c1Var.b());
                int i10 = suVar.f15543a;
                if (i10 != 5 && (i10 != 2 || suVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i11 = c1Var.f42700f;
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
                return ((xu) this.e).f39703c3.size();
            default:
                return ((pc0) this.e).f36598s.size();
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((su) ((xu) this.e).f39703c3.get(i10)).f15543a;
            default:
                pc0 pc0Var = (pc0) this.e;
                if (i10 >= 0 && i10 < pc0Var.f36598s.size()) {
                    return ((jc0) pc0Var.f36598s.get(i10)).f15543a;
                }
                return 2;
        }
    }

    @Override
    public final void v(s4.c1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vu.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        int i11 = this.d;
        View view = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                xu xuVar = (xu) obj;
                bv bvVar = xuVar.f39714o3;
                org.telegram.ui.ActionBar.f6 f6Var = xuVar.f26191p2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        if (i10 != 7) {
                                            r8Var = new qu(bvVar, xuVar.getContext());
                                        } else {
                                            View knVar = new org.telegram.ui.Components.kn(xuVar.getContext(), 14);
                                            int i12 = org.telegram.ui.ActionBar.j6.f18862d6;
                                            int i13 = xu.f39700p3;
                                            knVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, xuVar.f26191p2));
                                            r8Var = knVar;
                                        }
                                    } else {
                                        ?? view2 = new View(xuVar.getContext());
                                        view2.f40341a = new Path();
                                        Paint paint = new Paint(1);
                                        view2.f40342b = paint;
                                        view2.f40343c = true;
                                        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18862d6, false));
                                        r8Var = view2;
                                    }
                                } else {
                                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(xuVar.getContext());
                                    r8Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19082p7, f6Var));
                                    r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18862d6, f6Var));
                                    r8Var = r8Var2;
                                }
                            } else {
                                View l4Var = new org.telegram.ui.Cells.l4(xuVar.getContext());
                                l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18862d6, f6Var));
                                r8Var = l4Var;
                            }
                        } else {
                            r8Var = new org.telegram.ui.Cells.e9(xuVar.getContext());
                        }
                    } else {
                        Context context = xuVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f31984a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(bvVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19244y6));
                        frameLayout.addView(textView, w7.x5.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        r8Var = frameLayout;
                    }
                } else {
                    Context context2 = xuVar.getContext();
                    int[] iArr = bv.f32566s;
                    uu uuVar = new uu(this, context2, iArr.length, iArr, bv.v);
                    xuVar.f39713n3 = uuVar;
                    uuVar.setInterceptTouch(false);
                    View view3 = xuVar.f39713n3;
                    view3.setTag(-33024);
                    r8Var = view3;
                }
                return new s4.c1(r8Var);
            default:
                pc0 pc0Var = (pc0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view = new org.telegram.ui.Cells.l4(context3);
                } else if (i10 == 1) {
                    view = new nc0(pc0Var, context3);
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.e9(context3);
                } else if (i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        view = new org.telegram.ui.Cells.r8(23, context3, null, false, true);
                    }
                } else {
                    view = new oc0(pc0Var, context3);
                }
                return new s4.c1(view);
        }
    }
}
