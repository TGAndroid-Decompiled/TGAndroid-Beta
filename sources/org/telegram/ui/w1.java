package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
public final class w1 extends ViewGroup implements org.telegram.ui.Cells.g9, d3 {
    public CheckBoxBase E;
    public final i50 f50654a;
    public final g4 f50655b;
    public a3 f50656c;
    public org.telegram.ui.Components.bj0 d;
    public int f50657e;
    public int f50658f;
    public int h;
    public int f50659n;
    public int f50660r;
    public boolean f50661s;
    public int f50662w;
    public x3 f50663x;
    public boolean f50664y;

    public w1(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.f50654a = i50Var;
        this.f50655b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        a3 a3Var;
        x3 x3Var = this.f50663x;
        if (x3Var != null) {
            a3Var = x3Var.f51709i;
        } else {
            a3Var = null;
        }
        if (a3Var == null) {
            return 0;
        }
        i50 i50Var = this.f50654a;
        g4 g4Var = this.f50655b;
        if (g4Var != null && g4Var.H) {
            int measuredWidth = getMeasuredWidth();
            i50Var.getClass();
            int L = measuredWidth - org.telegram.messenger.g0.L(15);
            y3 y3Var = this.f50663x.f51706c;
            return org.telegram.messenger.camera.q.A(12.0f, y3Var.f52167f, L - y3Var.f52165c);
        }
        i50Var.getClass();
        return org.telegram.messenger.k5.D(12.0f, this.f50663x.f51706c.f52167f, (org.telegram.messenger.g0.L(15) + this.f50663x.f51706c.f52165c) - ((int) Math.ceil(a3Var.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i3;
        int boundLeft;
        this.f50654a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        if (this.E != null) {
            i3 = Math.min(Integer.MAX_VALUE, (this.f50657e - org.telegram.messenger.g0.L(26.0f)) - L);
        } else {
            i3 = Integer.MAX_VALUE;
        }
        x3 x3Var = this.f50663x;
        if (x3Var != null && x3Var.f51709i != null) {
            i3 = Math.min(i3, (this.f50663x.f51709i.k() + a()) - L);
        }
        a3 a3Var = this.f50656c;
        if (a3Var != null) {
            i3 = Math.min(i3, (a3Var.k() + a3Var.f43579s) - L);
        }
        org.telegram.ui.Components.bj0 bj0Var = this.d;
        if (bj0Var != null) {
            View view = bj0Var.f55540a;
            if ((view instanceof d3) && (boundLeft = ((d3) view).getBoundLeft()) != -1) {
                i3 = Math.min(i3, this.f50659n + boundLeft);
            }
        }
        if (i3 == Integer.MAX_VALUE) {
            return -1;
        }
        return i3;
    }

    @Override
    public int getBoundRight() {
        int i3;
        int boundRight;
        this.f50654a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        x3 x3Var = this.f50663x;
        if (x3Var != null && x3Var.f51709i != null) {
            i3 = Math.max(Integer.MIN_VALUE, this.f50663x.f51709i.l() + a() + L);
        } else {
            i3 = Integer.MIN_VALUE;
        }
        a3 a3Var = this.f50656c;
        if (a3Var != null) {
            i3 = Math.max(i3, a3Var.l() + a3Var.f43579s + L);
        }
        org.telegram.ui.Components.bj0 bj0Var = this.d;
        if (bj0Var != null) {
            View view = bj0Var.f55540a;
            if ((view instanceof d3) && (boundRight = ((d3) view).getBoundRight()) != -1) {
                i3 = Math.max(i3, this.f50659n + boundRight);
            }
        }
        if (i3 == Integer.MIN_VALUE) {
            return -1;
        }
        return i3;
    }

    @Override
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        int i3;
        a3 a3Var = this.f50656c;
        if (a3Var != null) {
            lastLineBoundRight = a3Var.m() + a3Var.f43579s;
            this.f50654a.getClass();
            i3 = org.telegram.messenger.g0.L(18);
        } else {
            org.telegram.ui.Components.bj0 bj0Var = this.d;
            if (bj0Var != null) {
                View view = bj0Var.f55540a;
                if ((view instanceof d3) && (lastLineBoundRight = ((d3) view).getLastLineBoundRight()) != -1) {
                    i3 = this.f50659n;
                }
            }
            return -1;
        }
        return i3 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.bj0 bj0Var = this.d;
        if (bj0Var != null) {
            bj0Var.f55540a.invalidate();
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        org.telegram.ui.Components.bj0 bj0Var = this.d;
        if (bj0Var != null) {
            View view = bj0Var.f55540a;
            if (view instanceof org.telegram.ui.Cells.g9) {
                ((org.telegram.ui.Cells.g9) view).k(arrayList);
            }
        }
        a3 a3Var = this.f50656c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f50656c;
        if (a3Var != null) {
            a3Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f50656c;
        if (a3Var != null) {
            a3Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        x3 x3Var;
        int i3;
        int i10;
        if (this.f50663x != null) {
            int measuredWidth = getMeasuredWidth();
            a3 a3Var = this.f50663x.f51709i;
            i50 i50Var = this.f50654a;
            if (a3Var != null) {
                canvas.save();
                g4 g4Var = this.f50655b;
                if (g4Var != null && g4Var.H) {
                    i50Var.getClass();
                    int L = measuredWidth - org.telegram.messenger.g0.L(15);
                    y3 y3Var = this.f50663x.f51706c;
                    float A = org.telegram.messenger.camera.q.A(12.0f, y3Var.f52167f, L - y3Var.f52165c);
                    int i11 = this.f50658f + this.h;
                    if (this.f50664y) {
                        i10 = org.telegram.messenger.g0.L(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(A, i11 - i10);
                } else {
                    i50Var.getClass();
                    float D = org.telegram.messenger.k5.D(12.0f, this.f50663x.f51706c.f52167f, (org.telegram.messenger.g0.L(15) + this.f50663x.f51706c.f52165c) - ((int) Math.ceil(x3Var.f51709i.d.getLineWidth(0))));
                    int i12 = this.f50658f + this.h;
                    if (this.f50664y) {
                        i3 = org.telegram.messenger.g0.L(1.0f);
                    } else {
                        i3 = 0;
                    }
                    canvas.translate(D, i12 - i3);
                }
                this.f50663x.f51709i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.E;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f50657e - org.telegram.messenger.g0.L(26.0f), this.f50658f, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                this.E.a(canvas);
            }
            if (this.f50656c != null) {
                canvas.save();
                canvas.translate(this.f50657e, this.f50658f);
                i4.t(i50Var, canvas, this, 0);
                this.f50656c.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f50656c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.h(this.f50654a, this.f50655b, a3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        org.telegram.ui.Components.bj0 bj0Var = this.d;
        if (bj0Var != null) {
            View view = bj0Var.f55540a;
            int i13 = this.f50659n;
            view.layout(i13, this.f50660r, view.getMeasuredWidth() + i13, this.d.f55540a.getMeasuredHeight() + this.f50660r);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        i50 i50Var;
        TextPaint textPaint;
        i50 i50Var2;
        a3 o10;
        int i12;
        int L;
        int L2;
        int i13;
        int i14;
        int i15;
        a3 a3Var;
        a2 a2Var;
        a3 a3Var2;
        int i16;
        org.telegram.ui.Cells.h9 h9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i3);
        x3 x3Var = this.f50663x;
        int i17 = 1;
        if (x3Var != null) {
            this.f50656c = null;
            int i18 = x3Var.f51710j;
            i50 i50Var3 = this.f50654a;
            int i19 = 0;
            if (i18 == 0 && x3Var.f51706c.f52167f == 0) {
                i50Var3.getClass();
                i11 = org.telegram.messenger.g0.L(10);
            } else {
                i11 = 0;
            }
            this.f50658f = i11;
            this.h = 0;
            y3 y3Var = this.f50663x.f51706c;
            if (y3Var.d == size && y3Var.f52166e == org.telegram.messenger.az.Z0) {
                i50Var = i50Var3;
            } else {
                y3Var.d = size;
                y3Var.f52166e = org.telegram.messenger.az.Z0;
                y3Var.f52165c = 0;
                int size2 = y3Var.f52164b.size();
                boolean z10 = true;
                int i20 = 0;
                while (i20 < size2) {
                    x3 x3Var2 = (x3) this.f50663x.f51706c.f52164b.get(i20);
                    String str = x3Var2.f51708f;
                    if (str != null) {
                        if (x3Var2.f51704a && "•".equalsIgnoreCase(str)) {
                            x3Var2.f51709i = null;
                        } else {
                            String str2 = x3Var2.f51708f;
                            i50Var3.getClass();
                            i50 i50Var4 = i50Var3;
                            i50Var2 = i50Var4;
                            x3Var2.f51709i = i4.o(i50Var4, this, str2, null, size - org.telegram.messenger.g0.L(54), this.f50658f, this.f50663x, this.f50655b);
                            y3 y3Var2 = this.f50663x.f51706c;
                            y3Var2.f52165c = Math.max(y3Var2.f52165c, (int) Math.ceil(o10.d.getLineWidth(0)));
                            z10 = false;
                            i20++;
                            i50Var3 = i50Var2;
                        }
                    }
                    i50Var2 = i50Var3;
                    i20++;
                    i50Var3 = i50Var2;
                }
                i50Var = i50Var3;
                if (i4.f46066p1 != null && !z10) {
                    y3 y3Var3 = this.f50663x.f51706c;
                    y3Var3.f52165c = Math.max(y3Var3.f52165c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            x3 x3Var3 = this.f50663x;
            this.f50664y = !x3Var3.f51706c.f52163a.ordered;
            if (x3Var3.f51704a) {
                if (this.E == null) {
                    i50Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.E = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.k6.Vl, org.telegram.ui.ActionBar.k6.f28289z5, org.telegram.ui.ActionBar.k6.f28008k7);
                    this.E.d(10);
                    this.E.k(true);
                    this.E.i(org.telegram.messenger.g0.L(5.0f));
                }
                this.E.f(-1, this.f50663x.f51705b, false);
            } else {
                this.E = null;
            }
            int i21 = 26;
            g4 g4Var = this.f50655b;
            if (g4Var != null && g4Var.H) {
                i50Var.getClass();
                if (this.E == null) {
                    i21 = 0;
                }
                this.f50657e = org.telegram.messenger.g0.L(i21 + 18);
            } else {
                i50Var.getClass();
                if (this.E == null) {
                    i21 = 0;
                }
                int L3 = org.telegram.messenger.g0.L(i21 + 24);
                y3 y3Var4 = this.f50663x.f51706c;
                this.f50657e = org.telegram.messenger.k5.D(12.0f, y3Var4.f52167f, L3 + y3Var4.f52165c);
            }
            i50Var.getClass();
            float f10 = 18;
            int L4 = (size - org.telegram.messenger.g0.L(f10)) - this.f50657e;
            if (g4Var != null && g4Var.H) {
                int L5 = org.telegram.messenger.g0.L(6.0f);
                y3 y3Var5 = this.f50663x.f51706c;
                L4 -= (org.telegram.messenger.g0.L(12.0f) * y3Var5.f52167f) + (L5 + y3Var5.f52165c);
            }
            x3 x3Var4 = this.f50663x;
            int i22 = L4;
            TL_iv.RichText richText = x3Var4.f51707e;
            if (richText != null) {
                if (g4Var != null && g4Var.H) {
                    alignment = org.telegram.ui.Components.lu0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                a3 n4 = i4.n(this.f50654a, this, null, richText, i22, 0, x3Var4, alignment, 0, this.f50655b);
                this.f50656c = n4;
                if (n4 != null && n4.d.getLineCount() > 0) {
                    a3 a3Var3 = this.f50663x.f51709i;
                    if (a3Var3 != null && a3Var3.d.getLineCount() > 0) {
                        this.h = (org.telegram.messenger.g0.L(2.5f) + this.f50663x.f51709i.d.getLineAscent(0)) - this.f50656c.d.getLineAscent(0);
                    }
                    i12 = this.f50656c.d.getHeight();
                    L = org.telegram.messenger.g0.L(8);
                    i16 = L + i12;
                }
                i16 = 0;
            } else {
                TL_iv.PageBlock pageBlock = x3Var4.d;
                if (pageBlock != null) {
                    int i23 = this.f50657e;
                    this.f50659n = i23;
                    int i24 = this.f50658f;
                    this.f50660r = i24;
                    org.telegram.ui.Components.bj0 bj0Var = this.d;
                    if (bj0Var != null) {
                        View view = bj0Var.f55540a;
                        if (view instanceof a2) {
                            float f11 = 8;
                            this.f50660r = i24 - org.telegram.messenger.g0.L(f11);
                            if (g4Var == null || !g4Var.H) {
                                this.f50659n -= org.telegram.messenger.g0.L(f10);
                            }
                            int L6 = i22 + org.telegram.messenger.g0.L(f10);
                            i14 = 0 - org.telegram.messenger.g0.L(f11);
                            i13 = L6;
                        } else {
                            if (!(view instanceof u1) && !(view instanceof q2) && !(view instanceof u2) && !(view instanceof r2)) {
                                if (i4.J(pageBlock)) {
                                    this.f50659n = 0;
                                    this.f50660r = 0;
                                    this.f50658f = 0;
                                    x3 x3Var5 = this.f50663x;
                                    if (x3Var5.f51710j == 0 && x3Var5.f51706c.f52167f == 0) {
                                        i15 = 0 - org.telegram.messenger.g0.L(10);
                                    } else {
                                        i15 = 0;
                                    }
                                    i14 = i15 - org.telegram.messenger.g0.L(8);
                                    i13 = size;
                                } else if (this.d.f55540a instanceof t2) {
                                    this.f50659n -= org.telegram.messenger.g0.L(f10);
                                    L2 = org.telegram.messenger.g0.L(36);
                                } else {
                                    i13 = i22;
                                    i14 = 0;
                                }
                            } else {
                                if (g4Var == null || !g4Var.H) {
                                    this.f50659n = i23 - org.telegram.messenger.g0.L(f10);
                                }
                                L2 = org.telegram.messenger.g0.L(f10);
                            }
                            i13 = L2 + i22;
                            i14 = 0;
                        }
                        this.d.f55540a.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f55540a instanceof a2) && (a3Var = this.f50663x.f51709i) != null && a3Var.d.getLineCount() > 0 && (a3Var2 = (a2Var = (a2) this.d.f55540a).f43565c) != null && a3Var2.d.getLineCount() > 0) {
                            this.h = (org.telegram.messenger.g0.L(2.5f) + this.f50663x.f51709i.d.getLineAscent(0)) - a2Var.f43565c.d.getLineAscent(0);
                        }
                        x3 x3Var6 = this.f50663x;
                        if (x3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f50661s = true;
                            this.f50660r = 0;
                            if (x3Var6.f51710j == 0 && x3Var6.f51706c.f52167f == 0) {
                                i14 -= org.telegram.messenger.g0.L(10);
                            }
                            i14 -= org.telegram.messenger.g0.L(8);
                        } else {
                            View view2 = this.d.f55540a;
                            if (view2 instanceof z1) {
                                this.f50661s = ((z1) view2).f52499w;
                            } else if (view2 instanceof w1) {
                                this.f50661s = ((w1) view2).f50661s;
                            }
                        }
                        if (this.f50661s && this.f50663x.f51709i != null) {
                            this.f50658f = ((this.d.f55540a.getMeasuredHeight() - this.f50663x.f51709i.d.getHeight()) / 2) - org.telegram.messenger.g0.L(4.0f);
                            this.f50664y = false;
                        }
                        i12 = this.d.f55540a.getMeasuredHeight() + i14;
                    } else {
                        i12 = 0;
                    }
                    L = org.telegram.messenger.g0.L(8);
                    i16 = L + i12;
                }
                i16 = 0;
            }
            if (k2.p1.h(1, this.f50663x.f51706c.f52164b) == this.f50663x) {
                i16 += org.telegram.messenger.g0.L(8);
            }
            x3 x3Var7 = this.f50663x;
            if (x3Var7.f51710j == 0 && x3Var7.f51706c.f52167f == 0) {
                i17 = org.telegram.messenger.g0.L(10) + i16;
            } else {
                i17 = i16;
            }
            a3 a3Var4 = this.f50656c;
            if (a3Var4 != null) {
                a3Var4.f43579s = this.f50657e;
                a3Var4.f43580w = this.f50658f;
            }
            org.telegram.ui.Components.bj0 bj0Var2 = this.d;
            if (bj0Var2 != null && (bj0Var2.f55540a instanceof org.telegram.ui.Cells.g9) && (h9Var = ((i4) i50Var).Q0) != null) {
                ArrayList arrayList = h9Var.A0;
                arrayList.clear();
                ((org.telegram.ui.Cells.g9) this.d.f55540a).k(arrayList);
                int size3 = arrayList.size();
                while (i19 < size3) {
                    Object obj = arrayList.get(i19);
                    i19++;
                    org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) obj;
                    if (s9Var instanceof a3) {
                        a3 a3Var5 = (a3) s9Var;
                        a3Var5.f43579s += this.f50659n;
                        a3Var5.f43580w += this.f50660r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i17);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.j(this.f50654a, this.f50655b, motionEvent, this, this.f50656c, this.f50657e, this.f50658f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(x3 x3Var) {
        x3 x3Var2 = this.f50663x;
        g4 g4Var = this.f50655b;
        if (x3Var2 != x3Var) {
            this.f50663x = x3Var;
            org.telegram.ui.Components.bj0 bj0Var = this.d;
            if (bj0Var != null) {
                removeView(bj0Var.f55540a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f50663x.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.f50662w = I;
                u4.d1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.bj0) x10;
                addView(x10.f55540a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f50663x.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.f50662w, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
