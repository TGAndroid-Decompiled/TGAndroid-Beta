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
    public final n50 f52084a;
    public final e4 f52085b;
    public z2 f52086c;
    public org.telegram.ui.Components.cj0 d;
    public int f52087e;
    public int f52088f;
    public int h;
    public int f52089n;
    public int f52090r;
    public boolean f52091s;
    public int f52092w;
    public w3 f52093x;
    public boolean f52094y;

    public v1(Context context, n50 n50Var, e4 e4Var) {
        super(context);
        this.f52084a = n50Var;
        this.f52085b = e4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        z2 z2Var;
        w3 w3Var = this.f52093x;
        if (w3Var != null) {
            z2Var = w3Var.f52378i;
        } else {
            z2Var = null;
        }
        if (z2Var == null) {
            return 0;
        }
        n50 n50Var = this.f52084a;
        e4 e4Var = this.f52085b;
        if (e4Var != null && e4Var.H) {
            int measuredWidth = getMeasuredWidth();
            n50Var.getClass();
            int L = measuredWidth - org.telegram.messenger.g0.L(15);
            x3 x3Var = this.f52093x.f52375c;
            return org.telegram.messenger.i20.A(12.0f, x3Var.f53082f, L - x3Var.f53080c);
        }
        n50Var.getClass();
        return org.telegram.messenger.k5.D(12.0f, this.f52093x.f52375c.f53082f, (org.telegram.messenger.g0.L(15) + this.f52093x.f52375c.f53080c) - ((int) Math.ceil(z2Var.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i7;
        int boundLeft;
        this.f52084a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        if (this.E != null) {
            i7 = Math.min(Integer.MAX_VALUE, (this.f52087e - org.telegram.messenger.g0.L(26.0f)) - L);
        } else {
            i7 = Integer.MAX_VALUE;
        }
        w3 w3Var = this.f52093x;
        if (w3Var != null && w3Var.f52378i != null) {
            i7 = Math.min(i7, (this.f52093x.f52378i.k() + a()) - L);
        }
        z2 z2Var = this.f52086c;
        if (z2Var != null) {
            i7 = Math.min(i7, (z2Var.k() + z2Var.f53812s) - L);
        }
        org.telegram.ui.Components.cj0 cj0Var = this.d;
        if (cj0Var != null) {
            View view = cj0Var.f58535a;
            if ((view instanceof c3) && (boundLeft = ((c3) view).getBoundLeft()) != -1) {
                i7 = Math.min(i7, this.f52089n + boundLeft);
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
        this.f52084a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        w3 w3Var = this.f52093x;
        if (w3Var != null && w3Var.f52378i != null) {
            i7 = Math.max(Integer.MIN_VALUE, this.f52093x.f52378i.l() + a() + L);
        } else {
            i7 = Integer.MIN_VALUE;
        }
        z2 z2Var = this.f52086c;
        if (z2Var != null) {
            i7 = Math.max(i7, z2Var.l() + z2Var.f53812s + L);
        }
        org.telegram.ui.Components.cj0 cj0Var = this.d;
        if (cj0Var != null) {
            View view = cj0Var.f58535a;
            if ((view instanceof c3) && (boundRight = ((c3) view).getBoundRight()) != -1) {
                i7 = Math.max(i7, this.f52089n + boundRight);
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
        z2 z2Var = this.f52086c;
        if (z2Var != null) {
            lastLineBoundRight = z2Var.m() + z2Var.f53812s;
            this.f52084a.getClass();
            i7 = org.telegram.messenger.g0.L(18);
        } else {
            org.telegram.ui.Components.cj0 cj0Var = this.d;
            if (cj0Var != null) {
                View view = cj0Var.f58535a;
                if ((view instanceof c3) && (lastLineBoundRight = ((c3) view).getLastLineBoundRight()) != -1) {
                    i7 = this.f52089n;
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
        z2 z2Var = this.f52086c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f52086c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f52086c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        w3 w3Var;
        int i7;
        int i10;
        if (this.f52093x != null) {
            int measuredWidth = getMeasuredWidth();
            z2 z2Var = this.f52093x.f52378i;
            n50 n50Var = this.f52084a;
            if (z2Var != null) {
                canvas.save();
                e4 e4Var = this.f52085b;
                if (e4Var != null && e4Var.H) {
                    n50Var.getClass();
                    int L = measuredWidth - org.telegram.messenger.g0.L(15);
                    x3 x3Var = this.f52093x.f52375c;
                    float A = org.telegram.messenger.i20.A(12.0f, x3Var.f53082f, L - x3Var.f53080c);
                    int i11 = this.f52088f + this.h;
                    if (this.f52094y) {
                        i10 = org.telegram.messenger.g0.L(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(A, i11 - i10);
                } else {
                    n50Var.getClass();
                    float D = org.telegram.messenger.k5.D(12.0f, this.f52093x.f52375c.f53082f, (org.telegram.messenger.g0.L(15) + this.f52093x.f52375c.f53080c) - ((int) Math.ceil(w3Var.f52378i.d.getLineWidth(0))));
                    int i12 = this.f52088f + this.h;
                    if (this.f52094y) {
                        i7 = org.telegram.messenger.g0.L(1.0f);
                    } else {
                        i7 = 0;
                    }
                    canvas.translate(D, i12 - i7);
                }
                this.f52093x.f52378i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.E;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f52087e - org.telegram.messenger.g0.L(26.0f), this.f52088f, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                this.E.a(canvas);
            }
            if (this.f52086c != null) {
                canvas.save();
                canvas.translate(this.f52087e, this.f52088f);
                g4.t(n50Var, canvas, this, 0);
                this.f52086c.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f52086c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.h(this.f52084a, this.f52085b, z2Var));
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Components.cj0 cj0Var = this.d;
        if (cj0Var != null) {
            View view = cj0Var.f58535a;
            int i13 = this.f52089n;
            view.layout(i13, this.f52090r, view.getMeasuredWidth() + i13, this.d.f58535a.getMeasuredHeight() + this.f52090r);
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
        w3 w3Var = this.f52093x;
        int i17 = 1;
        if (w3Var != null) {
            this.f52086c = null;
            int i18 = w3Var.f52379j;
            n50 n50Var3 = this.f52084a;
            int i19 = 0;
            if (i18 == 0 && w3Var.f52375c.f53082f == 0) {
                n50Var3.getClass();
                i11 = org.telegram.messenger.g0.L(10);
            } else {
                i11 = 0;
            }
            this.f52088f = i11;
            this.h = 0;
            x3 x3Var = this.f52093x.f52375c;
            if (x3Var.d == size && x3Var.f53081e == org.telegram.messenger.gz.Z0) {
                n50Var = n50Var3;
            } else {
                x3Var.d = size;
                x3Var.f53081e = org.telegram.messenger.gz.Z0;
                x3Var.f53080c = 0;
                int size2 = x3Var.f53079b.size();
                boolean z10 = true;
                int i20 = 0;
                while (i20 < size2) {
                    w3 w3Var2 = (w3) this.f52093x.f52375c.f53079b.get(i20);
                    String str = w3Var2.f52377f;
                    if (str != null) {
                        if (w3Var2.f52373a && "•".equalsIgnoreCase(str)) {
                            w3Var2.f52378i = null;
                        } else {
                            String str2 = w3Var2.f52377f;
                            n50Var3.getClass();
                            n50 n50Var4 = n50Var3;
                            n50Var2 = n50Var4;
                            w3Var2.f52378i = g4.o(n50Var4, this, str2, null, size - org.telegram.messenger.g0.L(54), this.f52088f, this.f52093x, this.f52085b);
                            x3 x3Var2 = this.f52093x.f52375c;
                            x3Var2.f53080c = Math.max(x3Var2.f53080c, (int) Math.ceil(o4.d.getLineWidth(0)));
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
                if (g4.f47302p1 != null && !z10) {
                    x3 x3Var3 = this.f52093x.f52375c;
                    x3Var3.f53080c = Math.max(x3Var3.f53080c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            w3 w3Var3 = this.f52093x;
            this.f52094y = !w3Var3.f52375c.f53078a.ordered;
            if (w3Var3.f52373a) {
                if (this.E == null) {
                    n50Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.E = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.j6.Yl, org.telegram.ui.ActionBar.j6.f29259z5, org.telegram.ui.ActionBar.j6.f28979k7);
                    this.E.d(10);
                    this.E.k(true);
                    this.E.i(org.telegram.messenger.g0.L(5.0f));
                }
                this.E.f(-1, this.f52093x.f52374b, false);
            } else {
                this.E = null;
            }
            int i21 = 26;
            e4 e4Var = this.f52085b;
            if (e4Var != null && e4Var.H) {
                n50Var.getClass();
                if (this.E == null) {
                    i21 = 0;
                }
                this.f52087e = org.telegram.messenger.g0.L(i21 + 18);
            } else {
                n50Var.getClass();
                if (this.E == null) {
                    i21 = 0;
                }
                int L3 = org.telegram.messenger.g0.L(i21 + 24);
                x3 x3Var4 = this.f52093x.f52375c;
                this.f52087e = org.telegram.messenger.k5.D(12.0f, x3Var4.f53082f, L3 + x3Var4.f53080c);
            }
            n50Var.getClass();
            float f10 = 18;
            int L4 = (size - org.telegram.messenger.g0.L(f10)) - this.f52087e;
            if (e4Var != null && e4Var.H) {
                int L5 = org.telegram.messenger.g0.L(6.0f);
                x3 x3Var5 = this.f52093x.f52375c;
                L4 -= (org.telegram.messenger.g0.L(12.0f) * x3Var5.f53082f) + (L5 + x3Var5.f53080c);
            }
            w3 w3Var4 = this.f52093x;
            int i22 = L4;
            TL_iv.RichText richText = w3Var4.f52376e;
            if (richText != null) {
                if (e4Var != null && e4Var.H) {
                    alignment = org.telegram.ui.Components.ou0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                z2 n10 = g4.n(this.f52084a, this, null, richText, i22, 0, w3Var4, alignment, 0, this.f52085b);
                this.f52086c = n10;
                if (n10 != null && n10.d.getLineCount() > 0) {
                    z2 z2Var3 = this.f52093x.f52378i;
                    if (z2Var3 != null && z2Var3.d.getLineCount() > 0) {
                        this.h = (org.telegram.messenger.g0.L(2.5f) + this.f52093x.f52378i.d.getLineAscent(0)) - this.f52086c.d.getLineAscent(0);
                    }
                    i12 = this.f52086c.d.getHeight();
                    L = org.telegram.messenger.g0.L(8);
                    i16 = L + i12;
                }
                i16 = 0;
            } else {
                TL_iv.PageBlock pageBlock = w3Var4.d;
                if (pageBlock != null) {
                    int i23 = this.f52087e;
                    this.f52089n = i23;
                    int i24 = this.f52088f;
                    this.f52090r = i24;
                    org.telegram.ui.Components.cj0 cj0Var = this.d;
                    if (cj0Var != null) {
                        View view = cj0Var.f58535a;
                        if (view instanceof z1) {
                            float f11 = 8;
                            this.f52090r = i24 - org.telegram.messenger.g0.L(f11);
                            if (e4Var == null || !e4Var.H) {
                                this.f52089n -= org.telegram.messenger.g0.L(f10);
                            }
                            int L6 = i22 + org.telegram.messenger.g0.L(f10);
                            i14 = 0 - org.telegram.messenger.g0.L(f11);
                            i13 = L6;
                        } else {
                            if (!(view instanceof t1) && !(view instanceof p2) && !(view instanceof t2) && !(view instanceof q2)) {
                                if (g4.J(pageBlock)) {
                                    this.f52089n = 0;
                                    this.f52090r = 0;
                                    this.f52088f = 0;
                                    w3 w3Var5 = this.f52093x;
                                    if (w3Var5.f52379j == 0 && w3Var5.f52375c.f53082f == 0) {
                                        i15 = 0 - org.telegram.messenger.g0.L(10);
                                    } else {
                                        i15 = 0;
                                    }
                                    i14 = i15 - org.telegram.messenger.g0.L(8);
                                    i13 = size;
                                } else if (this.d.f58535a instanceof s2) {
                                    this.f52089n -= org.telegram.messenger.g0.L(f10);
                                    L2 = org.telegram.messenger.g0.L(36);
                                } else {
                                    i13 = i22;
                                    i14 = 0;
                                }
                            } else {
                                if (e4Var == null || !e4Var.H) {
                                    this.f52089n = i23 - org.telegram.messenger.g0.L(f10);
                                }
                                L2 = org.telegram.messenger.g0.L(f10);
                            }
                            i13 = L2 + i22;
                            i14 = 0;
                        }
                        this.d.f58535a.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f58535a instanceof z1) && (z2Var = this.f52093x.f52378i) != null && z2Var.d.getLineCount() > 0 && (z2Var2 = (z1Var = (z1) this.d.f58535a).f53802c) != null && z2Var2.d.getLineCount() > 0) {
                            this.h = (org.telegram.messenger.g0.L(2.5f) + this.f52093x.f52378i.d.getLineAscent(0)) - z1Var.f53802c.d.getLineAscent(0);
                        }
                        w3 w3Var6 = this.f52093x;
                        if (w3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f52091s = true;
                            this.f52090r = 0;
                            if (w3Var6.f52379j == 0 && w3Var6.f52375c.f53082f == 0) {
                                i14 -= org.telegram.messenger.g0.L(10);
                            }
                            i14 -= org.telegram.messenger.g0.L(8);
                        } else {
                            View view2 = this.d.f58535a;
                            if (view2 instanceof y1) {
                                this.f52091s = ((y1) view2).f53380w;
                            } else if (view2 instanceof v1) {
                                this.f52091s = ((v1) view2).f52091s;
                            }
                        }
                        if (this.f52091s && this.f52093x.f52378i != null) {
                            this.f52088f = ((this.d.f58535a.getMeasuredHeight() - this.f52093x.f52378i.d.getHeight()) / 2) - org.telegram.messenger.g0.L(4.0f);
                            this.f52094y = false;
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
            if (i5.c.h(1, this.f52093x.f52375c.f53079b) == this.f52093x) {
                i16 += org.telegram.messenger.g0.L(8);
            }
            w3 w3Var7 = this.f52093x;
            if (w3Var7.f52379j == 0 && w3Var7.f52375c.f53082f == 0) {
                i17 = org.telegram.messenger.g0.L(10) + i16;
            } else {
                i17 = i16;
            }
            z2 z2Var4 = this.f52086c;
            if (z2Var4 != null) {
                z2Var4.f53812s = this.f52087e;
                z2Var4.f53813w = this.f52088f;
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
                        z2Var5.f53812s += this.f52089n;
                        z2Var5.f53813w += this.f52090r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i17);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (g4.j(this.f52084a, this.f52085b, motionEvent, this, this.f52086c, this.f52087e, this.f52088f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(w3 w3Var) {
        w3 w3Var2 = this.f52093x;
        e4 e4Var = this.f52085b;
        if (w3Var2 != w3Var) {
            this.f52093x = w3Var;
            org.telegram.ui.Components.cj0 cj0Var = this.d;
            if (cj0Var != null) {
                removeView(cj0Var.f58535a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f52093x.d;
            if (pageBlock != null && e4Var != null) {
                int I = e4.I(pageBlock);
                this.f52092w = I;
                v4.e1 x10 = e4Var.x(this, I);
                this.d = (org.telegram.ui.Components.cj0) x10;
                addView(x10.f58535a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f52093x.d;
        if (pageBlock2 != null && e4Var != null) {
            e4Var.H(this.f52092w, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
