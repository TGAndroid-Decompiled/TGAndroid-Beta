package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class qu extends og.b {
    public final int d;
    public final Object e;

    public qu(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.d) {
            case 0:
                nu nuVar = (nu) ((su) this.e).f37421c3.get(c1Var.b());
                int i10 = nuVar.f15508a;
                if (i10 != 5 && (i10 != 2 || nuVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i11 = c1Var.f42630f;
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
                return ((su) this.e).f37421c3.size();
            default:
                return ((ic0) this.e).f34108s.size();
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((nu) ((su) this.e).f37421c3.get(i10)).f15508a;
            default:
                ic0 ic0Var = (ic0) this.e;
                if (i10 >= 0 && i10 < ic0Var.f34108s.size()) {
                    return ((cc0) ic0Var.f34108s.get(i10)).f15508a;
                }
                return 2;
        }
    }

    @Override
    public final void v(s4.c1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qu.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s8 s8Var;
        int i11 = this.d;
        View view = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                su suVar = (su) obj;
                wu wuVar = suVar.f37432o3;
                org.telegram.ui.ActionBar.d6 d6Var = suVar.f26222p2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        if (i10 != 7) {
                                            s8Var = new lu(wuVar, suVar.getContext());
                                        } else {
                                            View lnVar = new org.telegram.ui.Components.ln(suVar.getContext(), 14);
                                            int i12 = org.telegram.ui.ActionBar.h6.f18789d6;
                                            int i13 = su.f37418p3;
                                            lnVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(i12, suVar.f26222p2));
                                            s8Var = lnVar;
                                        }
                                    } else {
                                        ?? view2 = new View(suVar.getContext());
                                        view2.f38220a = new Path();
                                        Paint paint = new Paint(1);
                                        view2.f38221b = paint;
                                        view2.f38222c = true;
                                        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                                        s8Var = view2;
                                    }
                                } else {
                                    org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(suVar.getContext());
                                    s8Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19008p7, d6Var));
                                    s8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, d6Var));
                                    s8Var = s8Var2;
                                }
                            } else {
                                View m4Var = new org.telegram.ui.Cells.m4(suVar.getContext());
                                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, d6Var));
                                s8Var = m4Var;
                            }
                        } else {
                            s8Var = new org.telegram.ui.Cells.f9(suVar.getContext());
                        }
                    } else {
                        Context context = suVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f38480a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(wuVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19170y6));
                        frameLayout.addView(textView, w7.x5.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        s8Var = frameLayout;
                    }
                } else {
                    Context context2 = suVar.getContext();
                    int[] iArr = wu.e;
                    pu puVar = new pu(this, context2, iArr.length, iArr, wu.f39089f);
                    suVar.f37431n3 = puVar;
                    puVar.setInterceptTouch(false);
                    View view3 = suVar.f37431n3;
                    view3.setTag(-33024);
                    s8Var = view3;
                }
                return new s4.c1(s8Var);
            default:
                ic0 ic0Var = (ic0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view = new org.telegram.ui.Cells.m4(context3);
                } else if (i10 == 1) {
                    view = new gc0(ic0Var, context3);
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.f9(context3);
                } else if (i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        view = new org.telegram.ui.Cells.s8(23, context3, null, false, true);
                    }
                } else {
                    view = new hc0(ic0Var, context3);
                }
                return new s4.c1(view);
        }
    }
}
