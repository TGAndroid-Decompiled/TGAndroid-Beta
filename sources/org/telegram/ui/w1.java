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
public final class w1 extends ViewGroup implements org.telegram.ui.Cells.j9, c3 {
    public CheckBoxBase D;
    public final l60 f42648a;
    public final f4 f42649b;
    public z2 f42650c;
    public org.telegram.ui.Components.dk0 d;
    public int e;
    public int f42651f;
    public int h;
    public int f42652n;
    public int f42653r;
    public boolean f42654s;
    public int f42655w;
    public x3 f42656x;
    public boolean f42657y;

    public w1(Context context, l60 l60Var, f4 f4Var) {
        super(context);
        this.f42648a = l60Var;
        this.f42649b = f4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        z2 z2Var;
        x3 x3Var = this.f42656x;
        if (x3Var != null) {
            z2Var = x3Var.f43217i;
        } else {
            z2Var = null;
        }
        if (z2Var == null) {
            return 0;
        }
        l60 l60Var = this.f42648a;
        f4 f4Var = this.f42649b;
        if (f4Var != null && f4Var.G) {
            int measuredWidth = getMeasuredWidth();
            l60Var.getClass();
            int L = measuredWidth - org.telegram.messenger.i0.L(15);
            y3 y3Var = this.f42656x.f43215c;
            return org.telegram.messenger.a30.A(12.0f, y3Var.f43550f, L - y3Var.f43549c);
        }
        l60Var.getClass();
        return org.telegram.messenger.m5.D(12.0f, this.f42656x.f43215c.f43550f, (org.telegram.messenger.i0.L(15) + this.f42656x.f43215c.f43549c) - ((int) Math.ceil(z2Var.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f42648a.getClass();
        int L = org.telegram.messenger.i0.L(18);
        if (this.D != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.e - org.telegram.messenger.i0.L(26.0f)) - L);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        x3 x3Var = this.f42656x;
        if (x3Var != null && x3Var.f43217i != null) {
            i10 = Math.min(i10, (this.f42656x.f43217i.k() + a()) - L);
        }
        z2 z2Var = this.f42650c;
        if (z2Var != null) {
            i10 = Math.min(i10, (z2Var.k() + z2Var.f43793s) - L);
        }
        org.telegram.ui.Components.dk0 dk0Var = this.d;
        if (dk0Var != null) {
            View view = dk0Var.f47909a;
            if ((view instanceof c3) && (boundLeft = ((c3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f42652n + boundLeft);
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10;
    }

    @Override
    public int getBoundRight() {
        int i10;
        int boundRight;
        this.f42648a.getClass();
        int L = org.telegram.messenger.i0.L(18);
        x3 x3Var = this.f42656x;
        if (x3Var != null && x3Var.f43217i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f42656x.f43217i.l() + a() + L);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        z2 z2Var = this.f42650c;
        if (z2Var != null) {
            i10 = Math.max(i10, z2Var.l() + z2Var.f43793s + L);
        }
        org.telegram.ui.Components.dk0 dk0Var = this.d;
        if (dk0Var != null) {
            View view = dk0Var.f47909a;
            if ((view instanceof c3) && (boundRight = ((c3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f42652n + boundRight);
            }
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        return i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        int i10;
        z2 z2Var = this.f42650c;
        if (z2Var != null) {
            lastLineBoundRight = z2Var.m() + z2Var.f43793s;
            this.f42648a.getClass();
            i10 = org.telegram.messenger.i0.L(18);
        } else {
            org.telegram.ui.Components.dk0 dk0Var = this.d;
            if (dk0Var != null) {
                View view = dk0Var.f47909a;
                if ((view instanceof c3) && (lastLineBoundRight = ((c3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f42652n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.a30.a(this);
    }

    @Override
    public final void h(ArrayList arrayList) {
        org.telegram.ui.Components.dk0 dk0Var = this.d;
        if (dk0Var != null) {
            View view = dk0Var.f47909a;
            if (view instanceof org.telegram.ui.Cells.j9) {
                ((org.telegram.ui.Cells.j9) view).h(arrayList);
            }
        }
        z2 z2Var = this.f42650c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.dk0 dk0Var = this.d;
        if (dk0Var != null) {
            dk0Var.f47909a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f42650c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f42650c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        x3 x3Var;
        int i10;
        int i11;
        if (this.f42656x != null) {
            int measuredWidth = getMeasuredWidth();
            z2 z2Var = this.f42656x.f43217i;
            l60 l60Var = this.f42648a;
            if (z2Var != null) {
                canvas.save();
                f4 f4Var = this.f42649b;
                if (f4Var != null && f4Var.G) {
                    l60Var.getClass();
                    int L = measuredWidth - org.telegram.messenger.i0.L(15);
                    y3 y3Var = this.f42656x.f43215c;
                    float A = org.telegram.messenger.a30.A(12.0f, y3Var.f43550f, L - y3Var.f43549c);
                    int i12 = this.f42651f + this.h;
                    if (this.f42657y) {
                        i11 = org.telegram.messenger.i0.L(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(A, i12 - i11);
                } else {
                    l60Var.getClass();
                    float D = org.telegram.messenger.m5.D(12.0f, this.f42656x.f43215c.f43550f, (org.telegram.messenger.i0.L(15) + this.f42656x.f43215c.f43549c) - ((int) Math.ceil(x3Var.f43217i.d.getLineWidth(0))));
                    int i13 = this.f42651f + this.h;
                    if (this.f42657y) {
                        i10 = org.telegram.messenger.i0.L(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f42656x.f43217i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.D;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - org.telegram.messenger.i0.L(26.0f), this.f42651f, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f));
                this.D.a(canvas);
            }
            if (this.f42650c != null) {
                canvas.save();
                canvas.translate(this.e, this.f42651f);
                h4.t(l60Var, canvas, this, 0);
                this.f42650c.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f42650c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.h(this.f42648a, this.f42649b, z2Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.dk0 dk0Var = this.d;
        if (dk0Var != null) {
            View view = dk0Var.f47909a;
            int i14 = this.f42652n;
            view.layout(i14, this.f42653r, view.getMeasuredWidth() + i14, this.d.f47909a.getMeasuredHeight() + this.f42653r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        l60 l60Var;
        TextPaint textPaint;
        l60 l60Var2;
        z2 o10;
        int i13;
        int L;
        int L2;
        int i14;
        int i15;
        int i16;
        z2 z2Var;
        a2 a2Var;
        z2 z2Var2;
        int i17;
        org.telegram.ui.Cells.k9 k9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        x3 x3Var = this.f42656x;
        int i18 = 1;
        if (x3Var != null) {
            this.f42650c = null;
            int i19 = x3Var.f43218j;
            l60 l60Var3 = this.f42648a;
            int i20 = 0;
            if (i19 == 0 && x3Var.f43215c.f43550f == 0) {
                l60Var3.getClass();
                i12 = org.telegram.messenger.i0.L(10);
            } else {
                i12 = 0;
            }
            this.f42651f = i12;
            this.h = 0;
            y3 y3Var = this.f42656x.f43215c;
            if (y3Var.d == size && y3Var.e == org.telegram.messenger.uz.Z0) {
                l60Var = l60Var3;
            } else {
                y3Var.d = size;
                y3Var.e = org.telegram.messenger.uz.Z0;
                y3Var.f43549c = 0;
                int size2 = y3Var.f43548b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    x3 x3Var2 = (x3) this.f42656x.f43215c.f43548b.get(i21);
                    String str = x3Var2.f43216f;
                    if (str != null) {
                        if (x3Var2.f43213a && "•".equalsIgnoreCase(str)) {
                            x3Var2.f43217i = null;
                        } else {
                            String str2 = x3Var2.f43216f;
                            l60Var3.getClass();
                            l60 l60Var4 = l60Var3;
                            l60Var2 = l60Var4;
                            x3Var2.f43217i = h4.o(l60Var4, this, str2, null, size - org.telegram.messenger.i0.L(54), this.f42651f, this.f42656x, this.f42649b);
                            y3 y3Var2 = this.f42656x.f43215c;
                            y3Var2.f43549c = Math.max(y3Var2.f43549c, (int) Math.ceil(o10.d.getLineWidth(0)));
                            z10 = false;
                            i21++;
                            l60Var3 = l60Var2;
                        }
                    }
                    l60Var2 = l60Var3;
                    i21++;
                    l60Var3 = l60Var2;
                }
                l60Var = l60Var3;
                if (h4.f37658o1 != null && !z10) {
                    y3 y3Var3 = this.f42656x.f43215c;
                    y3Var3.f43549c = Math.max(y3Var3.f43549c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            x3 x3Var3 = this.f42656x;
            this.f42657y = !x3Var3.f43215c.f43547a.ordered;
            if (x3Var3.f43213a) {
                if (this.D == null) {
                    l60Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.D = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.t6.Vl, org.telegram.ui.ActionBar.t6.f21330z5, org.telegram.ui.ActionBar.t6.f21060k7);
                    this.D.d(10);
                    this.D.k(true);
                    this.D.i(org.telegram.messenger.i0.L(5.0f));
                }
                this.D.f(-1, this.f42656x.f43214b, false);
            } else {
                this.D = null;
            }
            int i22 = 26;
            f4 f4Var = this.f42649b;
            if (f4Var != null && f4Var.G) {
                l60Var.getClass();
                if (this.D == null) {
                    i22 = 0;
                }
                this.e = org.telegram.messenger.i0.L(i22 + 18);
            } else {
                l60Var.getClass();
                if (this.D == null) {
                    i22 = 0;
                }
                int L3 = org.telegram.messenger.i0.L(i22 + 24);
                y3 y3Var4 = this.f42656x.f43215c;
                this.e = org.telegram.messenger.m5.D(12.0f, y3Var4.f43550f, L3 + y3Var4.f43549c);
            }
            l60Var.getClass();
            float f7 = 18;
            int L4 = (size - org.telegram.messenger.i0.L(f7)) - this.e;
            if (f4Var != null && f4Var.G) {
                int L5 = org.telegram.messenger.i0.L(6.0f);
                y3 y3Var5 = this.f42656x.f43215c;
                L4 -= (org.telegram.messenger.i0.L(12.0f) * y3Var5.f43550f) + (L5 + y3Var5.f43549c);
            }
            x3 x3Var4 = this.f42656x;
            int i23 = L4;
            TL_iv.RichText richText = x3Var4.e;
            if (richText != null) {
                if (f4Var != null && f4Var.G) {
                    alignment = org.telegram.ui.Components.pv0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                z2 n10 = h4.n(this.f42648a, this, null, richText, i23, 0, x3Var4, alignment, 0, this.f42649b);
                this.f42650c = n10;
                if (n10 != null && n10.d.getLineCount() > 0) {
                    z2 z2Var3 = this.f42656x.f43217i;
                    if (z2Var3 != null && z2Var3.d.getLineCount() > 0) {
                        this.h = (org.telegram.messenger.i0.L(2.5f) + this.f42656x.f43217i.d.getLineAscent(0)) - this.f42650c.d.getLineAscent(0);
                    }
                    i13 = this.f42650c.d.getHeight();
                    L = org.telegram.messenger.i0.L(8);
                    i17 = L + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = x3Var4.d;
                if (pageBlock != null) {
                    int i24 = this.e;
                    this.f42652n = i24;
                    int i25 = this.f42651f;
                    this.f42653r = i25;
                    org.telegram.ui.Components.dk0 dk0Var = this.d;
                    if (dk0Var != null) {
                        View view = dk0Var.f47909a;
                        if (view instanceof a2) {
                            float f10 = 8;
                            this.f42653r = i25 - org.telegram.messenger.i0.L(f10);
                            if (f4Var == null || !f4Var.G) {
                                this.f42652n -= org.telegram.messenger.i0.L(f7);
                            }
                            int L6 = i23 + org.telegram.messenger.i0.L(f7);
                            i15 = 0 - org.telegram.messenger.i0.L(f10);
                            i14 = L6;
                        } else {
                            if (!(view instanceof u1) && !(view instanceof p2) && !(view instanceof t2) && !(view instanceof q2)) {
                                if (h4.J(pageBlock)) {
                                    this.f42652n = 0;
                                    this.f42653r = 0;
                                    this.f42651f = 0;
                                    x3 x3Var5 = this.f42656x;
                                    if (x3Var5.f43218j == 0 && x3Var5.f43215c.f43550f == 0) {
                                        i16 = 0 - org.telegram.messenger.i0.L(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - org.telegram.messenger.i0.L(8);
                                    i14 = size;
                                } else if (this.d.f47909a instanceof s2) {
                                    this.f42652n -= org.telegram.messenger.i0.L(f7);
                                    L2 = org.telegram.messenger.i0.L(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (f4Var == null || !f4Var.G) {
                                    this.f42652n = i24 - org.telegram.messenger.i0.L(f7);
                                }
                                L2 = org.telegram.messenger.i0.L(f7);
                            }
                            i14 = L2 + i23;
                            i15 = 0;
                        }
                        this.d.f47909a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f47909a instanceof a2) && (z2Var = this.f42656x.f43217i) != null && z2Var.d.getLineCount() > 0 && (z2Var2 = (a2Var = (a2) this.d.f47909a).f35538c) != null && z2Var2.d.getLineCount() > 0) {
                            this.h = (org.telegram.messenger.i0.L(2.5f) + this.f42656x.f43217i.d.getLineAscent(0)) - a2Var.f35538c.d.getLineAscent(0);
                        }
                        x3 x3Var6 = this.f42656x;
                        if (x3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f42654s = true;
                            this.f42653r = 0;
                            if (x3Var6.f43218j == 0 && x3Var6.f43215c.f43550f == 0) {
                                i15 -= org.telegram.messenger.i0.L(10);
                            }
                            i15 -= org.telegram.messenger.i0.L(8);
                        } else {
                            View view2 = this.d.f47909a;
                            if (view2 instanceof z1) {
                                this.f42654s = ((z1) view2).f43780w;
                            } else if (view2 instanceof w1) {
                                this.f42654s = ((w1) view2).f42654s;
                            }
                        }
                        if (this.f42654s && this.f42656x.f43217i != null) {
                            this.f42651f = ((this.d.f47909a.getMeasuredHeight() - this.f42656x.f43217i.d.getHeight()) / 2) - org.telegram.messenger.i0.L(4.0f);
                            this.f42657y = false;
                        }
                        i13 = this.d.f47909a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    L = org.telegram.messenger.i0.L(8);
                    i17 = L + i13;
                }
                i17 = 0;
            }
            if (i0.a.g(1, this.f42656x.f43215c.f43548b) == this.f42656x) {
                i17 += org.telegram.messenger.i0.L(8);
            }
            x3 x3Var7 = this.f42656x;
            if (x3Var7.f43218j == 0 && x3Var7.f43215c.f43550f == 0) {
                i18 = org.telegram.messenger.i0.L(10) + i17;
            } else {
                i18 = i17;
            }
            z2 z2Var4 = this.f42650c;
            if (z2Var4 != null) {
                z2Var4.f43793s = this.e;
                z2Var4.f43794w = this.f42651f;
            }
            org.telegram.ui.Components.dk0 dk0Var2 = this.d;
            if (dk0Var2 != null && (dk0Var2.f47909a instanceof org.telegram.ui.Cells.j9) && (k9Var = ((h4) l60Var).P0) != null) {
                ArrayList arrayList = k9Var.A0;
                arrayList.clear();
                ((org.telegram.ui.Cells.j9) this.d.f47909a).h(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) obj;
                    if (u9Var instanceof z2) {
                        z2 z2Var5 = (z2) u9Var;
                        z2Var5.f43793s += this.f42652n;
                        z2Var5.f43794w += this.f42653r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (h4.j(this.f42648a, this.f42649b, motionEvent, this, this.f42650c, this.e, this.f42651f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(x3 x3Var) {
        x3 x3Var2 = this.f42656x;
        f4 f4Var = this.f42649b;
        if (x3Var2 != x3Var) {
            this.f42656x = x3Var;
            org.telegram.ui.Components.dk0 dk0Var = this.d;
            if (dk0Var != null) {
                removeView(dk0Var.f47909a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f42656x.d;
            if (pageBlock != null && f4Var != null) {
                int I = f4.I(pageBlock);
                this.f42655w = I;
                s4.c1 w9 = f4Var.w(this, I);
                this.d = (org.telegram.ui.Components.dk0) w9;
                addView(w9.f47909a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f42656x.d;
        if (pageBlock2 != null && f4Var != null) {
            f4Var.H(this.f42655w, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
