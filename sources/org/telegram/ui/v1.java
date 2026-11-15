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
public final class v1 extends ViewGroup implements org.telegram.ui.Cells.g9, c3 {
    public CheckBoxBase E;
    public final n50 f52082a;
    public final e4 f52083b;
    public z2 f52084c;
    public org.telegram.ui.Components.cj0 d;
    public int f52085e;
    public int f52086f;
    public int h;
    public int f52087n;
    public int f52088r;
    public boolean f52089s;
    public int f52090w;
    public w3 f52091x;
    public boolean f52092y;

    public v1(Context context, n50 n50Var, e4 e4Var) {
        super(context);
        this.f52082a = n50Var;
        this.f52083b = e4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        z2 z2Var;
        w3 w3Var = this.f52091x;
        if (w3Var != null) {
            z2Var = w3Var.f52381i;
        } else {
            z2Var = null;
        }
        if (z2Var == null) {
            return 0;
        }
        n50 n50Var = this.f52082a;
        e4 e4Var = this.f52083b;
        if (e4Var != null && e4Var.H) {
            int measuredWidth = getMeasuredWidth();
            n50Var.getClass();
            int L = measuredWidth - org.telegram.messenger.g0.L(15);
            x3 x3Var = this.f52091x.f52378c;
            return org.telegram.messenger.i20.A(12.0f, x3Var.f53081f, L - x3Var.f53079c);
        }
        n50Var.getClass();
        return org.telegram.messenger.k5.D(12.0f, this.f52091x.f52378c.f53081f, (org.telegram.messenger.g0.L(15) + this.f52091x.f52378c.f53079c) - ((int) Math.ceil(z2Var.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i7;
        int boundLeft;
        this.f52082a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        if (this.E != null) {
            i7 = Math.min(Integer.MAX_VALUE, (this.f52085e - org.telegram.messenger.g0.L(26.0f)) - L);
        } else {
            i7 = Integer.MAX_VALUE;
        }
        w3 w3Var = this.f52091x;
        if (w3Var != null && w3Var.f52381i != null) {
            i7 = Math.min(i7, (this.f52091x.f52381i.k() + a()) - L);
        }
        z2 z2Var = this.f52084c;
        if (z2Var != null) {
            i7 = Math.min(i7, (z2Var.k() + z2Var.f53777s) - L);
        }
        org.telegram.ui.Components.cj0 cj0Var = this.d;
        if (cj0Var != null) {
            View view = cj0Var.f58535a;
            if ((view instanceof c3) && (boundLeft = ((c3) view).getBoundLeft()) != -1) {
                i7 = Math.min(i7, this.f52087n + boundLeft);
            }
        }
        if (i7 == Integer.MAX_VALUE) {
            return -1;
        }
        return i7;
    }

    @Override
    public int getBoundRight() {
        int i7;
        int boundRight;
        this.f52082a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        w3 w3Var = this.f52091x;
        if (w3Var != null && w3Var.f52381i != null) {
            i7 = Math.max(Integer.MIN_VALUE, this.f52091x.f52381i.l() + a() + L);
        } else {
            i7 = Integer.MIN_VALUE;
        }
        z2 z2Var = this.f52084c;
        if (z2Var != null) {
            i7 = Math.max(i7, z2Var.l() + z2Var.f53777s + L);
        }
        org.telegram.ui.Components.cj0 cj0Var = this.d;
        if (cj0Var != null) {
            View view = cj0Var.f58535a;
            if ((view instanceof c3) && (boundRight = ((c3) view).getBoundRight()) != -1) {
                i7 = Math.max(i7, this.f52087n + boundRight);
            }
        }
        if (i7 == Integer.MIN_VALUE) {
            return -1;
        }
        return i7;
    }

    @Override
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        int i7;
        z2 z2Var = this.f52084c;
        if (z2Var != null) {
            lastLineBoundRight = z2Var.m() + z2Var.f53777s;
            this.f52082a.getClass();
            i7 = org.telegram.messenger.g0.L(18);
        } else {
            org.telegram.ui.Components.cj0 cj0Var = this.d;
            if (cj0Var != null) {
                View view = cj0Var.f58535a;
                if ((view instanceof c3) && (lastLineBoundRight = ((c3) view).getLastLineBoundRight()) != -1) {
                    i7 = this.f52087n;
                }
            }
            return -1;
        }
        return i7 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.i20.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.cj0 cj0Var = this.d;
        if (cj0Var != null) {
            cj0Var.f58535a.invalidate();
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        org.telegram.ui.Components.cj0 cj0Var = this.d;
        if (cj0Var != null) {
            View view = cj0Var.f58535a;
            if (view instanceof org.telegram.ui.Cells.g9) {
                ((org.telegram.ui.Cells.g9) view).k(arrayList);
            }
        }
        z2 z2Var = this.f52084c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f52084c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f52084c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        w3 w3Var;
        int i7;
        int i10;
        if (this.f52091x != null) {
            int measuredWidth = getMeasuredWidth();
            z2 z2Var = this.f52091x.f52381i;
            n50 n50Var = this.f52082a;
            if (z2Var != null) {
                canvas.save();
                e4 e4Var = this.f52083b;
                if (e4Var != null && e4Var.H) {
                    n50Var.getClass();
                    int L = measuredWidth - org.telegram.messenger.g0.L(15);
                    x3 x3Var = this.f52091x.f52378c;
                    float A = org.telegram.messenger.i20.A(12.0f, x3Var.f53081f, L - x3Var.f53079c);
                    int i11 = this.f52086f + this.h;
                    if (this.f52092y) {
                        i10 = org.telegram.messenger.g0.L(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(A, i11 - i10);
                } else {
                    n50Var.getClass();
                    float D = org.telegram.messenger.k5.D(12.0f, this.f52091x.f52378c.f53081f, (org.telegram.messenger.g0.L(15) + this.f52091x.f52378c.f53079c) - ((int) Math.ceil(w3Var.f52381i.d.getLineWidth(0))));
                    int i12 = this.f52086f + this.h;
                    if (this.f52092y) {
                        i7 = org.telegram.messenger.g0.L(1.0f);
                    } else {
                        i7 = 0;
                    }
                    canvas.translate(D, i12 - i7);
                }
                this.f52091x.f52381i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.E;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f52085e - org.telegram.messenger.g0.L(26.0f), this.f52086f, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                this.E.a(canvas);
            }
            if (this.f52084c != null) {
                canvas.save();
                canvas.translate(this.f52085e, this.f52086f);
                g4.t(n50Var, canvas, this, 0);
                this.f52084c.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f52084c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.h(this.f52082a, this.f52083b, z2Var));
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Components.cj0 cj0Var = this.d;
        if (cj0Var != null) {
            View view = cj0Var.f58535a;
            int i13 = this.f52087n;
            view.layout(i13, this.f52088r, view.getMeasuredWidth() + i13, this.d.f58535a.getMeasuredHeight() + this.f52088r);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        n50 n50Var;
        TextPaint textPaint;
        n50 n50Var2;
        z2 o4;
        int i12;
        int L;
        int L2;
        int i13;
        int i14;
        int i15;
        z2 z2Var;
        z1 z1Var;
        z2 z2Var2;
        int i16;
        org.telegram.ui.Cells.h9 h9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i7);
        w3 w3Var = this.f52091x;
        int i17 = 1;
        if (w3Var != null) {
            this.f52084c = null;
            int i18 = w3Var.f52382j;
            n50 n50Var3 = this.f52082a;
            int i19 = 0;
            if (i18 == 0 && w3Var.f52378c.f53081f == 0) {
                n50Var3.getClass();
                i11 = org.telegram.messenger.g0.L(10);
            } else {
                i11 = 0;
            }
            this.f52086f = i11;
            this.h = 0;
            x3 x3Var = this.f52091x.f52378c;
            if (x3Var.d == size && x3Var.f53080e == org.telegram.messenger.gz.Z0) {
                n50Var = n50Var3;
            } else {
                x3Var.d = size;
                x3Var.f53080e = org.telegram.messenger.gz.Z0;
                x3Var.f53079c = 0;
                int size2 = x3Var.f53078b.size();
                boolean z10 = true;
                int i20 = 0;
                while (i20 < size2) {
                    w3 w3Var2 = (w3) this.f52091x.f52378c.f53078b.get(i20);
                    String str = w3Var2.f52380f;
                    if (str != null) {
                        if (w3Var2.f52376a && "•".equalsIgnoreCase(str)) {
                            w3Var2.f52381i = null;
                        } else {
                            String str2 = w3Var2.f52380f;
                            n50Var3.getClass();
                            n50 n50Var4 = n50Var3;
                            n50Var2 = n50Var4;
                            w3Var2.f52381i = g4.o(n50Var4, this, str2, null, size - org.telegram.messenger.g0.L(54), this.f52086f, this.f52091x, this.f52083b);
                            x3 x3Var2 = this.f52091x.f52378c;
                            x3Var2.f53079c = Math.max(x3Var2.f53079c, (int) Math.ceil(o4.d.getLineWidth(0)));
                            z10 = false;
                            i20++;
                            n50Var3 = n50Var2;
                        }
                    }
                    n50Var2 = n50Var3;
                    i20++;
                    n50Var3 = n50Var2;
                }
                n50Var = n50Var3;
                if (g4.f47292p1 != null && !z10) {
                    x3 x3Var3 = this.f52091x.f52378c;
                    x3Var3.f53079c = Math.max(x3Var3.f53079c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            w3 w3Var3 = this.f52091x;
            this.f52092y = !w3Var3.f52378c.f53077a.ordered;
            if (w3Var3.f52376a) {
                if (this.E == null) {
                    n50Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.E = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.j6.Yl, org.telegram.ui.ActionBar.j6.f29259z5, org.telegram.ui.ActionBar.j6.f28979k7);
                    this.E.d(10);
                    this.E.k(true);
                    this.E.i(org.telegram.messenger.g0.L(5.0f));
                }
                this.E.f(-1, this.f52091x.f52377b, false);
            } else {
                this.E = null;
            }
            int i21 = 26;
            e4 e4Var = this.f52083b;
            if (e4Var != null && e4Var.H) {
                n50Var.getClass();
                if (this.E == null) {
                    i21 = 0;
                }
                this.f52085e = org.telegram.messenger.g0.L(i21 + 18);
            } else {
                n50Var.getClass();
                if (this.E == null) {
                    i21 = 0;
                }
                int L3 = org.telegram.messenger.g0.L(i21 + 24);
                x3 x3Var4 = this.f52091x.f52378c;
                this.f52085e = org.telegram.messenger.k5.D(12.0f, x3Var4.f53081f, L3 + x3Var4.f53079c);
            }
            n50Var.getClass();
            float f10 = 18;
            int L4 = (size - org.telegram.messenger.g0.L(f10)) - this.f52085e;
            if (e4Var != null && e4Var.H) {
                int L5 = org.telegram.messenger.g0.L(6.0f);
                x3 x3Var5 = this.f52091x.f52378c;
                L4 -= (org.telegram.messenger.g0.L(12.0f) * x3Var5.f53081f) + (L5 + x3Var5.f53079c);
            }
            w3 w3Var4 = this.f52091x;
            int i22 = L4;
            TL_iv.RichText richText = w3Var4.f52379e;
            if (richText != null) {
                if (e4Var != null && e4Var.H) {
                    alignment = org.telegram.ui.Components.ou0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                z2 n10 = g4.n(this.f52082a, this, null, richText, i22, 0, w3Var4, alignment, 0, this.f52083b);
                this.f52084c = n10;
                if (n10 != null && n10.d.getLineCount() > 0) {
                    z2 z2Var3 = this.f52091x.f52381i;
                    if (z2Var3 != null && z2Var3.d.getLineCount() > 0) {
                        this.h = (org.telegram.messenger.g0.L(2.5f) + this.f52091x.f52381i.d.getLineAscent(0)) - this.f52084c.d.getLineAscent(0);
                    }
                    i12 = this.f52084c.d.getHeight();
                    L = org.telegram.messenger.g0.L(8);
                    i16 = L + i12;
                }
                i16 = 0;
            } else {
                TL_iv.PageBlock pageBlock = w3Var4.d;
                if (pageBlock != null) {
                    int i23 = this.f52085e;
                    this.f52087n = i23;
                    int i24 = this.f52086f;
                    this.f52088r = i24;
                    org.telegram.ui.Components.cj0 cj0Var = this.d;
                    if (cj0Var != null) {
                        View view = cj0Var.f58535a;
                        if (view instanceof z1) {
                            float f11 = 8;
                            this.f52088r = i24 - org.telegram.messenger.g0.L(f11);
                            if (e4Var == null || !e4Var.H) {
                                this.f52087n -= org.telegram.messenger.g0.L(f10);
                            }
                            int L6 = i22 + org.telegram.messenger.g0.L(f10);
                            i14 = 0 - org.telegram.messenger.g0.L(f11);
                            i13 = L6;
                        } else {
                            if (!(view instanceof t1) && !(view instanceof p2) && !(view instanceof t2) && !(view instanceof q2)) {
                                if (g4.J(pageBlock)) {
                                    this.f52087n = 0;
                                    this.f52088r = 0;
                                    this.f52086f = 0;
                                    w3 w3Var5 = this.f52091x;
                                    if (w3Var5.f52382j == 0 && w3Var5.f52378c.f53081f == 0) {
                                        i15 = 0 - org.telegram.messenger.g0.L(10);
                                    } else {
                                        i15 = 0;
                                    }
                                    i14 = i15 - org.telegram.messenger.g0.L(8);
                                    i13 = size;
                                } else if (this.d.f58535a instanceof s2) {
                                    this.f52087n -= org.telegram.messenger.g0.L(f10);
                                    L2 = org.telegram.messenger.g0.L(36);
                                } else {
                                    i13 = i22;
                                    i14 = 0;
                                }
                            } else {
                                if (e4Var == null || !e4Var.H) {
                                    this.f52087n = i23 - org.telegram.messenger.g0.L(f10);
                                }
                                L2 = org.telegram.messenger.g0.L(f10);
                            }
                            i13 = L2 + i22;
                            i14 = 0;
                        }
                        this.d.f58535a.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f58535a instanceof z1) && (z2Var = this.f52091x.f52381i) != null && z2Var.d.getLineCount() > 0 && (z2Var2 = (z1Var = (z1) this.d.f58535a).f53767c) != null && z2Var2.d.getLineCount() > 0) {
                            this.h = (org.telegram.messenger.g0.L(2.5f) + this.f52091x.f52381i.d.getLineAscent(0)) - z1Var.f53767c.d.getLineAscent(0);
                        }
                        w3 w3Var6 = this.f52091x;
                        if (w3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f52089s = true;
                            this.f52088r = 0;
                            if (w3Var6.f52382j == 0 && w3Var6.f52378c.f53081f == 0) {
                                i14 -= org.telegram.messenger.g0.L(10);
                            }
                            i14 -= org.telegram.messenger.g0.L(8);
                        } else {
                            View view2 = this.d.f58535a;
                            if (view2 instanceof y1) {
                                this.f52089s = ((y1) view2).f53384w;
                            } else if (view2 instanceof v1) {
                                this.f52089s = ((v1) view2).f52089s;
                            }
                        }
                        if (this.f52089s && this.f52091x.f52381i != null) {
                            this.f52086f = ((this.d.f58535a.getMeasuredHeight() - this.f52091x.f52381i.d.getHeight()) / 2) - org.telegram.messenger.g0.L(4.0f);
                            this.f52092y = false;
                        }
                        i12 = this.d.f58535a.getMeasuredHeight() + i14;
                    } else {
                        i12 = 0;
                    }
                    L = org.telegram.messenger.g0.L(8);
                    i16 = L + i12;
                }
                i16 = 0;
            }
            if (i5.c.h(1, this.f52091x.f52378c.f53078b) == this.f52091x) {
                i16 += org.telegram.messenger.g0.L(8);
            }
            w3 w3Var7 = this.f52091x;
            if (w3Var7.f52382j == 0 && w3Var7.f52378c.f53081f == 0) {
                i17 = org.telegram.messenger.g0.L(10) + i16;
            } else {
                i17 = i16;
            }
            z2 z2Var4 = this.f52084c;
            if (z2Var4 != null) {
                z2Var4.f53777s = this.f52085e;
                z2Var4.f53778w = this.f52086f;
            }
            org.telegram.ui.Components.cj0 cj0Var2 = this.d;
            if (cj0Var2 != null && (cj0Var2.f58535a instanceof org.telegram.ui.Cells.g9) && (h9Var = ((g4) n50Var).Q0) != null) {
                ArrayList arrayList = h9Var.A0;
                arrayList.clear();
                ((org.telegram.ui.Cells.g9) this.d.f58535a).k(arrayList);
                int size3 = arrayList.size();
                while (i19 < size3) {
                    Object obj = arrayList.get(i19);
                    i19++;
                    org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) obj;
                    if (s9Var instanceof z2) {
                        z2 z2Var5 = (z2) s9Var;
                        z2Var5.f53777s += this.f52087n;
                        z2Var5.f53778w += this.f52088r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i17);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (g4.j(this.f52082a, this.f52083b, motionEvent, this, this.f52084c, this.f52085e, this.f52086f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(w3 w3Var) {
        w3 w3Var2 = this.f52091x;
        e4 e4Var = this.f52083b;
        if (w3Var2 != w3Var) {
            this.f52091x = w3Var;
            org.telegram.ui.Components.cj0 cj0Var = this.d;
            if (cj0Var != null) {
                removeView(cj0Var.f58535a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f52091x.d;
            if (pageBlock != null && e4Var != null) {
                int I = e4.I(pageBlock);
                this.f52090w = I;
                v4.e1 x10 = e4Var.x(this, I);
                this.d = (org.telegram.ui.Components.cj0) x10;
                addView(x10.f58535a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f52091x.d;
        if (pageBlock2 != null && e4Var != null) {
            e4Var.H(this.f52090w, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
