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
public final class v1 extends ViewGroup implements org.telegram.ui.Cells.h9, c3 {
    public CheckBoxBase D;
    public final r50 f50605a;
    public final e4 f50606b;
    public z2 f50607c;
    public org.telegram.ui.Components.xi0 d;
    public int f50608e;
    public int f50609f;
    public int h;
    public int f50610n;
    public int f50611r;
    public boolean f50612s;
    public int f50613w;
    public w3 f50614x;
    public boolean f50615y;

    public v1(Context context, r50 r50Var, e4 e4Var) {
        super(context);
        this.f50605a = r50Var;
        this.f50606b = e4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        z2 z2Var;
        w3 w3Var = this.f50614x;
        if (w3Var != null) {
            z2Var = w3Var.f50888i;
        } else {
            z2Var = null;
        }
        if (z2Var == null) {
            return 0;
        }
        r50 r50Var = this.f50605a;
        e4 e4Var = this.f50606b;
        if (e4Var != null && e4Var.G) {
            int measuredWidth = getMeasuredWidth();
            r50Var.getClass();
            int L = measuredWidth - org.telegram.messenger.g0.L(15);
            x3 x3Var = this.f50614x.f50885c;
            return org.telegram.messenger.camera.q.A(12.0f, x3Var.f51505f, L - x3Var.f51503c);
        }
        r50Var.getClass();
        return org.telegram.messenger.k5.D(12.0f, this.f50614x.f50885c.f51505f, (org.telegram.messenger.g0.L(15) + this.f50614x.f50885c.f51503c) - ((int) Math.ceil(z2Var.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i7;
        int boundLeft;
        this.f50605a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        if (this.D != null) {
            i7 = Math.min(Integer.MAX_VALUE, (this.f50608e - org.telegram.messenger.g0.L(26.0f)) - L);
        } else {
            i7 = Integer.MAX_VALUE;
        }
        w3 w3Var = this.f50614x;
        if (w3Var != null && w3Var.f50888i != null) {
            i7 = Math.min(i7, (this.f50614x.f50888i.k() + a()) - L);
        }
        z2 z2Var = this.f50607c;
        if (z2Var != null) {
            i7 = Math.min(i7, (z2Var.k() + z2Var.f52183s) - L);
        }
        org.telegram.ui.Components.xi0 xi0Var = this.d;
        if (xi0Var != null) {
            View view = xi0Var.f57052a;
            if ((view instanceof c3) && (boundLeft = ((c3) view).getBoundLeft()) != -1) {
                i7 = Math.min(i7, this.f50610n + boundLeft);
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
        this.f50605a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        w3 w3Var = this.f50614x;
        if (w3Var != null && w3Var.f50888i != null) {
            i7 = Math.max(Integer.MIN_VALUE, this.f50614x.f50888i.l() + a() + L);
        } else {
            i7 = Integer.MIN_VALUE;
        }
        z2 z2Var = this.f50607c;
        if (z2Var != null) {
            i7 = Math.max(i7, z2Var.l() + z2Var.f52183s + L);
        }
        org.telegram.ui.Components.xi0 xi0Var = this.d;
        if (xi0Var != null) {
            View view = xi0Var.f57052a;
            if ((view instanceof c3) && (boundRight = ((c3) view).getBoundRight()) != -1) {
                i7 = Math.max(i7, this.f50610n + boundRight);
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
        z2 z2Var = this.f50607c;
        if (z2Var != null) {
            lastLineBoundRight = z2Var.m() + z2Var.f52183s;
            this.f50605a.getClass();
            i7 = org.telegram.messenger.g0.L(18);
        } else {
            org.telegram.ui.Components.xi0 xi0Var = this.d;
            if (xi0Var != null) {
                View view = xi0Var.f57052a;
                if ((view instanceof c3) && (lastLineBoundRight = ((c3) view).getLastLineBoundRight()) != -1) {
                    i7 = this.f50610n;
                }
            }
            return -1;
        }
        return i7 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.xi0 xi0Var = this.d;
        if (xi0Var != null) {
            xi0Var.f57052a.invalidate();
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        org.telegram.ui.Components.xi0 xi0Var = this.d;
        if (xi0Var != null) {
            View view = xi0Var.f57052a;
            if (view instanceof org.telegram.ui.Cells.h9) {
                ((org.telegram.ui.Cells.h9) view).k(arrayList);
            }
        }
        z2 z2Var = this.f50607c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f50607c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f50607c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        w3 w3Var;
        int i7;
        int i10;
        if (this.f50614x != null) {
            int measuredWidth = getMeasuredWidth();
            z2 z2Var = this.f50614x.f50888i;
            r50 r50Var = this.f50605a;
            if (z2Var != null) {
                canvas.save();
                e4 e4Var = this.f50606b;
                if (e4Var != null && e4Var.G) {
                    r50Var.getClass();
                    int L = measuredWidth - org.telegram.messenger.g0.L(15);
                    x3 x3Var = this.f50614x.f50885c;
                    float A = org.telegram.messenger.camera.q.A(12.0f, x3Var.f51505f, L - x3Var.f51503c);
                    int i11 = this.f50609f + this.h;
                    if (this.f50615y) {
                        i10 = org.telegram.messenger.g0.L(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(A, i11 - i10);
                } else {
                    r50Var.getClass();
                    float D = org.telegram.messenger.k5.D(12.0f, this.f50614x.f50885c.f51505f, (org.telegram.messenger.g0.L(15) + this.f50614x.f50885c.f51503c) - ((int) Math.ceil(w3Var.f50888i.d.getLineWidth(0))));
                    int i12 = this.f50609f + this.h;
                    if (this.f50615y) {
                        i7 = org.telegram.messenger.g0.L(1.0f);
                    } else {
                        i7 = 0;
                    }
                    canvas.translate(D, i12 - i7);
                }
                this.f50614x.f50888i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.D;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f50608e - org.telegram.messenger.g0.L(26.0f), this.f50609f, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                this.D.a(canvas);
            }
            if (this.f50607c != null) {
                canvas.save();
                canvas.translate(this.f50608e, this.f50609f);
                g4.t(r50Var, canvas, this, 0);
                this.f50607c.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f50607c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.h(this.f50605a, this.f50606b, z2Var));
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Components.xi0 xi0Var = this.d;
        if (xi0Var != null) {
            View view = xi0Var.f57052a;
            int i13 = this.f50610n;
            view.layout(i13, this.f50611r, view.getMeasuredWidth() + i13, this.d.f57052a.getMeasuredHeight() + this.f50611r);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        r50 r50Var;
        TextPaint textPaint;
        r50 r50Var2;
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
        org.telegram.ui.Cells.i9 i9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i7);
        w3 w3Var = this.f50614x;
        int i17 = 1;
        if (w3Var != null) {
            this.f50607c = null;
            int i18 = w3Var.f50889j;
            r50 r50Var3 = this.f50605a;
            int i19 = 0;
            if (i18 == 0 && w3Var.f50885c.f51505f == 0) {
                r50Var3.getClass();
                i11 = org.telegram.messenger.g0.L(10);
            } else {
                i11 = 0;
            }
            this.f50609f = i11;
            this.h = 0;
            x3 x3Var = this.f50614x.f50885c;
            if (x3Var.d == size && x3Var.f51504e == org.telegram.messenger.iz.Z0) {
                r50Var = r50Var3;
            } else {
                x3Var.d = size;
                x3Var.f51504e = org.telegram.messenger.iz.Z0;
                x3Var.f51503c = 0;
                int size2 = x3Var.f51502b.size();
                boolean z9 = true;
                int i20 = 0;
                while (i20 < size2) {
                    w3 w3Var2 = (w3) this.f50614x.f50885c.f51502b.get(i20);
                    String str = w3Var2.f50887f;
                    if (str != null) {
                        if (w3Var2.f50883a && "•".equalsIgnoreCase(str)) {
                            w3Var2.f50888i = null;
                        } else {
                            String str2 = w3Var2.f50887f;
                            r50Var3.getClass();
                            r50 r50Var4 = r50Var3;
                            r50Var2 = r50Var4;
                            w3Var2.f50888i = g4.o(r50Var4, this, str2, null, size - org.telegram.messenger.g0.L(54), this.f50609f, this.f50614x, this.f50606b);
                            x3 x3Var2 = this.f50614x.f50885c;
                            x3Var2.f51503c = Math.max(x3Var2.f51503c, (int) Math.ceil(o4.d.getLineWidth(0)));
                            z9 = false;
                            i20++;
                            r50Var3 = r50Var2;
                        }
                    }
                    r50Var2 = r50Var3;
                    i20++;
                    r50Var3 = r50Var2;
                }
                r50Var = r50Var3;
                if (g4.f45938o1 != null && !z9) {
                    x3 x3Var3 = this.f50614x.f50885c;
                    x3Var3.f51503c = Math.max(x3Var3.f51503c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            w3 w3Var3 = this.f50614x;
            this.f50615y = !w3Var3.f50885c.f51501a.ordered;
            if (w3Var3.f50883a) {
                if (this.D == null) {
                    r50Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.D = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.m6.Vl, org.telegram.ui.ActionBar.m6.f28299z5, org.telegram.ui.ActionBar.m6.f28020k7);
                    this.D.d(10);
                    this.D.k(true);
                    this.D.i(org.telegram.messenger.g0.L(5.0f));
                }
                this.D.f(-1, this.f50614x.f50884b, false);
            } else {
                this.D = null;
            }
            int i21 = 26;
            e4 e4Var = this.f50606b;
            if (e4Var != null && e4Var.G) {
                r50Var.getClass();
                if (this.D == null) {
                    i21 = 0;
                }
                this.f50608e = org.telegram.messenger.g0.L(i21 + 18);
            } else {
                r50Var.getClass();
                if (this.D == null) {
                    i21 = 0;
                }
                int L3 = org.telegram.messenger.g0.L(i21 + 24);
                x3 x3Var4 = this.f50614x.f50885c;
                this.f50608e = org.telegram.messenger.k5.D(12.0f, x3Var4.f51505f, L3 + x3Var4.f51503c);
            }
            r50Var.getClass();
            float f10 = 18;
            int L4 = (size - org.telegram.messenger.g0.L(f10)) - this.f50608e;
            if (e4Var != null && e4Var.G) {
                int L5 = org.telegram.messenger.g0.L(6.0f);
                x3 x3Var5 = this.f50614x.f50885c;
                L4 -= (org.telegram.messenger.g0.L(12.0f) * x3Var5.f51505f) + (L5 + x3Var5.f51503c);
            }
            w3 w3Var4 = this.f50614x;
            int i22 = L4;
            TL_iv.RichText richText = w3Var4.f50886e;
            if (richText != null) {
                if (e4Var != null && e4Var.G) {
                    alignment = org.telegram.ui.Components.nu0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                z2 n10 = g4.n(this.f50605a, this, null, richText, i22, 0, w3Var4, alignment, 0, this.f50606b);
                this.f50607c = n10;
                if (n10 != null && n10.d.getLineCount() > 0) {
                    z2 z2Var3 = this.f50614x.f50888i;
                    if (z2Var3 != null && z2Var3.d.getLineCount() > 0) {
                        this.h = (org.telegram.messenger.g0.L(2.5f) + this.f50614x.f50888i.d.getLineAscent(0)) - this.f50607c.d.getLineAscent(0);
                    }
                    i12 = this.f50607c.d.getHeight();
                    L = org.telegram.messenger.g0.L(8);
                    i16 = L + i12;
                }
                i16 = 0;
            } else {
                TL_iv.PageBlock pageBlock = w3Var4.d;
                if (pageBlock != null) {
                    int i23 = this.f50608e;
                    this.f50610n = i23;
                    int i24 = this.f50609f;
                    this.f50611r = i24;
                    org.telegram.ui.Components.xi0 xi0Var = this.d;
                    if (xi0Var != null) {
                        View view = xi0Var.f57052a;
                        if (view instanceof z1) {
                            float f11 = 8;
                            this.f50611r = i24 - org.telegram.messenger.g0.L(f11);
                            if (e4Var == null || !e4Var.G) {
                                this.f50610n -= org.telegram.messenger.g0.L(f10);
                            }
                            int L6 = i22 + org.telegram.messenger.g0.L(f10);
                            i14 = 0 - org.telegram.messenger.g0.L(f11);
                            i13 = L6;
                        } else {
                            if (!(view instanceof t1) && !(view instanceof p2) && !(view instanceof t2) && !(view instanceof q2)) {
                                if (g4.J(pageBlock)) {
                                    this.f50610n = 0;
                                    this.f50611r = 0;
                                    this.f50609f = 0;
                                    w3 w3Var5 = this.f50614x;
                                    if (w3Var5.f50889j == 0 && w3Var5.f50885c.f51505f == 0) {
                                        i15 = 0 - org.telegram.messenger.g0.L(10);
                                    } else {
                                        i15 = 0;
                                    }
                                    i14 = i15 - org.telegram.messenger.g0.L(8);
                                    i13 = size;
                                } else if (this.d.f57052a instanceof s2) {
                                    this.f50610n -= org.telegram.messenger.g0.L(f10);
                                    L2 = org.telegram.messenger.g0.L(36);
                                } else {
                                    i13 = i22;
                                    i14 = 0;
                                }
                            } else {
                                if (e4Var == null || !e4Var.G) {
                                    this.f50610n = i23 - org.telegram.messenger.g0.L(f10);
                                }
                                L2 = org.telegram.messenger.g0.L(f10);
                            }
                            i13 = L2 + i22;
                            i14 = 0;
                        }
                        this.d.f57052a.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f57052a instanceof z1) && (z2Var = this.f50614x.f50888i) != null && z2Var.d.getLineCount() > 0 && (z2Var2 = (z1Var = (z1) this.d.f57052a).f52172c) != null && z2Var2.d.getLineCount() > 0) {
                            this.h = (org.telegram.messenger.g0.L(2.5f) + this.f50614x.f50888i.d.getLineAscent(0)) - z1Var.f52172c.d.getLineAscent(0);
                        }
                        w3 w3Var6 = this.f50614x;
                        if (w3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f50612s = true;
                            this.f50611r = 0;
                            if (w3Var6.f50889j == 0 && w3Var6.f50885c.f51505f == 0) {
                                i14 -= org.telegram.messenger.g0.L(10);
                            }
                            i14 -= org.telegram.messenger.g0.L(8);
                        } else {
                            View view2 = this.d.f57052a;
                            if (view2 instanceof y1) {
                                this.f50612s = ((y1) view2).f51866w;
                            } else if (view2 instanceof v1) {
                                this.f50612s = ((v1) view2).f50612s;
                            }
                        }
                        if (this.f50612s && this.f50614x.f50888i != null) {
                            this.f50609f = ((this.d.f57052a.getMeasuredHeight() - this.f50614x.f50888i.d.getHeight()) / 2) - org.telegram.messenger.g0.L(4.0f);
                            this.f50615y = false;
                        }
                        i12 = this.d.f57052a.getMeasuredHeight() + i14;
                    } else {
                        i12 = 0;
                    }
                    L = org.telegram.messenger.g0.L(8);
                    i16 = L + i12;
                }
                i16 = 0;
            }
            if (jg.g.i(1, this.f50614x.f50885c.f51502b) == this.f50614x) {
                i16 += org.telegram.messenger.g0.L(8);
            }
            w3 w3Var7 = this.f50614x;
            if (w3Var7.f50889j == 0 && w3Var7.f50885c.f51505f == 0) {
                i17 = org.telegram.messenger.g0.L(10) + i16;
            } else {
                i17 = i16;
            }
            z2 z2Var4 = this.f50607c;
            if (z2Var4 != null) {
                z2Var4.f52183s = this.f50608e;
                z2Var4.f52184w = this.f50609f;
            }
            org.telegram.ui.Components.xi0 xi0Var2 = this.d;
            if (xi0Var2 != null && (xi0Var2.f57052a instanceof org.telegram.ui.Cells.h9) && (i9Var = ((g4) r50Var).P0) != null) {
                ArrayList arrayList = i9Var.A0;
                arrayList.clear();
                ((org.telegram.ui.Cells.h9) this.d.f57052a).k(arrayList);
                int size3 = arrayList.size();
                while (i19 < size3) {
                    Object obj = arrayList.get(i19);
                    i19++;
                    org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) obj;
                    if (t9Var instanceof z2) {
                        z2 z2Var5 = (z2) t9Var;
                        z2Var5.f52183s += this.f50610n;
                        z2Var5.f52184w += this.f50611r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i17);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (g4.j(this.f50605a, this.f50606b, motionEvent, this, this.f50607c, this.f50608e, this.f50609f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(w3 w3Var) {
        w3 w3Var2 = this.f50614x;
        e4 e4Var = this.f50606b;
        if (w3Var2 != w3Var) {
            this.f50614x = w3Var;
            org.telegram.ui.Components.xi0 xi0Var = this.d;
            if (xi0Var != null) {
                removeView(xi0Var.f57052a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f50614x.d;
            if (pageBlock != null && e4Var != null) {
                int I = e4.I(pageBlock);
                this.f50613w = I;
                v4.d1 x10 = e4Var.x(this, I);
                this.d = (org.telegram.ui.Components.xi0) x10;
                addView(x10.f57052a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f50614x.d;
        if (pageBlock2 != null && e4Var != null) {
            e4Var.H(this.f50613w, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
