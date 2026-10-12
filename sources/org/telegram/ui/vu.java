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
    public final Object f42853e;

    public vu(Object obj, int i10) {
        this.d = i10;
        this.f42853e = obj;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        switch (this.d) {
            case 0:
                su suVar = (su) ((xu) this.f42853e).f44167a3.get(d1Var.b());
                int i10 = suVar.f16877a;
                if (i10 != 5 && (i10 != 2 || suVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i11 = d1Var.f47901f;
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
                return ((xu) this.f42853e).f44167a3.size();
            default:
                return ((nc0) this.f42853e).f40382s.size();
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((su) ((xu) this.f42853e).f44167a3.get(i10)).f16877a;
            default:
                nc0 nc0Var = (nc0) this.f42853e;
                if (i10 >= 0 && i10 < nc0Var.f40382s.size()) {
                    return ((hc0) nc0Var.f40382s.get(i10)).f16877a;
                }
                return 2;
        }
    }

    @Override
    public final void v(s4.d1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vu.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        int i11 = this.d;
        View view = null;
        Object obj = this.f42853e;
        switch (i11) {
            case 0:
                xu xuVar = (xu) obj;
                bv bvVar = xuVar.f44178m3;
                org.telegram.ui.ActionBar.c6 c6Var = xuVar.f32467n2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        if (i10 != 7) {
                                            r8Var = new qu(bvVar, xuVar.getContext());
                                        } else {
                                            View coVar = new org.telegram.ui.Components.co(xuVar.getContext(), 14);
                                            int i12 = org.telegram.ui.ActionBar.h6.f20560d6;
                                            int i13 = xu.f44166n3;
                                            coVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i12, xuVar.f32467n2));
                                            r8Var = coVar;
                                        }
                                    } else {
                                        ?? view2 = new View(xuVar.getContext());
                                        view2.f44923a = new Path();
                                        Paint paint = new Paint(1);
                                        view2.f44924b = paint;
                                        view2.f44925c = true;
                                        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false));
                                        r8Var = view2;
                                    }
                                } else {
                                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(xuVar.getContext());
                                    r8Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20781p7, c6Var));
                                    r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d6, c6Var));
                                    r8Var = r8Var2;
                                }
                            } else {
                                View m4Var = new org.telegram.ui.Cells.m4(xuVar.getContext());
                                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d6, c6Var));
                                r8Var = m4Var;
                            }
                        } else {
                            r8Var = new org.telegram.ui.Cells.e9(xuVar.getContext());
                        }
                    } else {
                        Context context = xuVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f35985a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(bvVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20946y6));
                        frameLayout.addView(textView, w7.w5.a(-2.0f, 24.0f, 0.0f, 24.0f, 14.0f, -1, 119));
                        frameLayout.setTag(-33024);
                        r8Var = frameLayout;
                    }
                } else {
                    Context context2 = xuVar.getContext();
                    int[] iArr = bv.f36255e;
                    uu uuVar = new uu(this, context2, iArr.length, iArr, bv.f36256f);
                    xuVar.f44177l3 = uuVar;
                    uuVar.setInterceptTouch(false);
                    View view3 = xuVar.f44177l3;
                    view3.setTag(-33024);
                    r8Var = view3;
                }
                return new s4.d1(r8Var);
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
                return new s4.d1(view);
        }
    }
}
