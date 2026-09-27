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
    public final Object e;

    public ru(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        switch (this.d) {
            case 0:
                ou ouVar = (ou) ((tu) this.e).f37917c3.get(c1Var.b());
                int i10 = ouVar.f15754a;
                if (i10 != 5 && (i10 != 2 || ouVar.h == -1)) {
                    return false;
                }
                return true;
            default:
                int i11 = c1Var.f43008f;
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
                return ((tu) this.e).f37917c3.size();
            default:
                return ((kc0) this.e).f35005s.size();
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.d) {
            case 0:
                return ((ou) ((tu) this.e).f37917c3.get(i10)).f15754a;
            default:
                kc0 kc0Var = (kc0) this.e;
                if (i10 >= 0 && i10 < kc0Var.f35005s.size()) {
                    return ((ec0) kc0Var.f35005s.get(i10)).f15754a;
                }
                return 2;
        }
    }

    @Override
    public final void v(s4.c1 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ru.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        int i11 = this.d;
        View view = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                tu tuVar = (tu) obj;
                xu xuVar = tuVar.f37928o3;
                org.telegram.ui.ActionBar.e6 e6Var = tuVar.f30709p2;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 6) {
                                        if (i10 != 7) {
                                            r8Var = new mu(xuVar, tuVar.getContext());
                                        } else {
                                            View mnVar = new org.telegram.ui.Components.mn(tuVar.getContext(), 14);
                                            int i12 = org.telegram.ui.ActionBar.i6.f19057d6;
                                            int i13 = tu.f37914p3;
                                            mnVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i12, tuVar.f30709p2));
                                            r8Var = mnVar;
                                        }
                                    } else {
                                        ?? view2 = new View(tuVar.getContext());
                                        view2.f38704a = new Path();
                                        Paint paint = new Paint(1);
                                        view2.f38705b = paint;
                                        view2.f38706c = true;
                                        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
                                        paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false));
                                        r8Var = view2;
                                    }
                                } else {
                                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(tuVar.getContext());
                                    r8Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19278p7, e6Var));
                                    r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19057d6, e6Var));
                                    r8Var = r8Var2;
                                }
                            } else {
                                View m4Var = new org.telegram.ui.Cells.m4(tuVar.getContext());
                                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19057d6, e6Var));
                                r8Var = m4Var;
                            }
                        } else {
                            r8Var = new org.telegram.ui.Cells.e9(tuVar.getContext());
                        }
                    } else {
                        Context context = tuVar.getContext();
                        ?? frameLayout = new FrameLayout(context);
                        TextView textView = new TextView(context);
                        frameLayout.f39460a = textView;
                        textView.setGravity(17);
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(xuVar.getThemedColor(org.telegram.ui.ActionBar.i6.f19442y6));
                        frameLayout.addView(textView, w7.y5.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
                        frameLayout.setTag(-33024);
                        r8Var = frameLayout;
                    }
                } else {
                    Context context2 = tuVar.getContext();
                    int[] iArr = xu.f40041s;
                    qu quVar = new qu(this, context2, iArr.length, iArr, xu.v);
                    tuVar.f37927n3 = quVar;
                    quVar.setInterceptTouch(false);
                    View view3 = tuVar.f37927n3;
                    view3.setTag(-33024);
                    r8Var = view3;
                }
                return new s4.c1(r8Var);
            default:
                kc0 kc0Var = (kc0) obj;
                Context context3 = viewGroup.getContext();
                if (i10 == 0) {
                    view = new org.telegram.ui.Cells.m4(context3);
                } else if (i10 == 1) {
                    view = new ic0(kc0Var, context3);
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.e9(context3);
                } else if (i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        view = new org.telegram.ui.Cells.r8(23, context3, null, false, true);
                    }
                } else {
                    view = new jc0(kc0Var, context3);
                }
                return new s4.c1(view);
        }
    }
}
