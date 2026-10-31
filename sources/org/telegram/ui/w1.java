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
    public final m60 f42849a;
    public final f4 f42850b;
    public z2 f42851c;
    public org.telegram.ui.Components.ck0 d;
    public int e;
    public int f42852f;
    public int h;
    public int f42853n;
    public int f42854r;
    public boolean f42855s;
    public int f42856w;
    public x3 f42857x;
    public boolean f42858y;

    public w1(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.f42849a = m60Var;
        this.f42850b = f4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        z2 z2Var;
        x3 x3Var = this.f42857x;
        if (x3Var != null) {
            z2Var = x3Var.f43430i;
        } else {
            z2Var = null;
        }
        if (z2Var == null) {
            return 0;
        }
        m60 m60Var = this.f42849a;
        f4 f4Var = this.f42850b;
        if (f4Var != null && f4Var.G) {
            int measuredWidth = getMeasuredWidth();
            m60Var.getClass();
            int L = measuredWidth - org.telegram.messenger.i0.L(15);
            y3 y3Var = this.f42857x.f43428c;
            return org.telegram.messenger.z20.A(12.0f, y3Var.f43690f, L - y3Var.f43689c);
        }
        m60Var.getClass();
        return org.telegram.messenger.m5.D(12.0f, this.f42857x.f43428c.f43690f, (org.telegram.messenger.i0.L(15) + this.f42857x.f43428c.f43689c) - ((int) Math.ceil(z2Var.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f42849a.getClass();
        int L = org.telegram.messenger.i0.L(18);
        if (this.D != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.e - org.telegram.messenger.i0.L(26.0f)) - L);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        x3 x3Var = this.f42857x;
        if (x3Var != null && x3Var.f43430i != null) {
            i10 = Math.min(i10, (this.f42857x.f43430i.k() + a()) - L);
        }
        z2 z2Var = this.f42851c;
        if (z2Var != null) {
            i10 = Math.min(i10, (z2Var.k() + z2Var.f43990s) - L);
        }
        org.telegram.ui.Components.ck0 ck0Var = this.d;
        if (ck0Var != null) {
            View view = ck0Var.f47898a;
            if ((view instanceof c3) && (boundLeft = ((c3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f42853n + boundLeft);
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
        this.f42849a.getClass();
        int L = org.telegram.messenger.i0.L(18);
        x3 x3Var = this.f42857x;
        if (x3Var != null && x3Var.f43430i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f42857x.f43430i.l() + a() + L);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        z2 z2Var = this.f42851c;
        if (z2Var != null) {
            i10 = Math.max(i10, z2Var.l() + z2Var.f43990s + L);
        }
        org.telegram.ui.Components.ck0 ck0Var = this.d;
        if (ck0Var != null) {
            View view = ck0Var.f47898a;
            if ((view instanceof c3) && (boundRight = ((c3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f42853n + boundRight);
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
        z2 z2Var = this.f42851c;
        if (z2Var != null) {
            lastLineBoundRight = z2Var.m() + z2Var.f43990s;
            this.f42849a.getClass();
            i10 = org.telegram.messenger.i0.L(18);
        } else {
            org.telegram.ui.Components.ck0 ck0Var = this.d;
            if (ck0Var != null) {
                View view = ck0Var.f47898a;
                if ((view instanceof c3) && (lastLineBoundRight = ((c3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f42853n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.z20.a(this);
    }

    @Override
    public final void h(ArrayList arrayList) {
        org.telegram.ui.Components.ck0 ck0Var = this.d;
        if (ck0Var != null) {
            View view = ck0Var.f47898a;
            if (view instanceof org.telegram.ui.Cells.j9) {
                ((org.telegram.ui.Cells.j9) view).h(arrayList);
            }
        }
        z2 z2Var = this.f42851c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.ck0 ck0Var = this.d;
        if (ck0Var != null) {
            ck0Var.f47898a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f42851c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f42851c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        x3 x3Var;
        int i10;
        int i11;
        if (this.f42857x != null) {
            int measuredWidth = getMeasuredWidth();
            z2 z2Var = this.f42857x.f43430i;
            m60 m60Var = this.f42849a;
            if (z2Var != null) {
                canvas.save();
                f4 f4Var = this.f42850b;
                if (f4Var != null && f4Var.G) {
                    m60Var.getClass();
                    int L = measuredWidth - org.telegram.messenger.i0.L(15);
                    y3 y3Var = this.f42857x.f43428c;
                    float A = org.telegram.messenger.z20.A(12.0f, y3Var.f43690f, L - y3Var.f43689c);
                    int i12 = this.f42852f + this.h;
                    if (this.f42858y) {
                        i11 = org.telegram.messenger.i0.L(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(A, i12 - i11);
                } else {
                    m60Var.getClass();
                    float D = org.telegram.messenger.m5.D(12.0f, this.f42857x.f43428c.f43690f, (org.telegram.messenger.i0.L(15) + this.f42857x.f43428c.f43689c) - ((int) Math.ceil(x3Var.f43430i.d.getLineWidth(0))));
                    int i13 = this.f42852f + this.h;
                    if (this.f42858y) {
                        i10 = org.telegram.messenger.i0.L(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f42857x.f43430i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.D;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - org.telegram.messenger.i0.L(26.0f), this.f42852f, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f));
                this.D.a(canvas);
            }
            if (this.f42851c != null) {
                canvas.save();
                canvas.translate(this.e, this.f42852f);
                h4.t(m60Var, canvas, this, 0);
                this.f42851c.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f42851c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.h(this.f42849a, this.f42850b, z2Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.ck0 ck0Var = this.d;
        if (ck0Var != null) {
            View view = ck0Var.f47898a;
            int i14 = this.f42853n;
            view.layout(i14, this.f42854r, view.getMeasuredWidth() + i14, this.d.f47898a.getMeasuredHeight() + this.f42854r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        m60 m60Var;
        TextPaint textPaint;
        m60 m60Var2;
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
        x3 x3Var = this.f42857x;
        int i18 = 1;
        if (x3Var != null) {
            this.f42851c = null;
            int i19 = x3Var.f43431j;
            m60 m60Var3 = this.f42849a;
            int i20 = 0;
            if (i19 == 0 && x3Var.f43428c.f43690f == 0) {
                m60Var3.getClass();
                i12 = org.telegram.messenger.i0.L(10);
            } else {
                i12 = 0;
            }
            this.f42852f = i12;
            this.h = 0;
            y3 y3Var = this.f42857x.f43428c;
            if (y3Var.d == size && y3Var.e == org.telegram.messenger.tz.Z0) {
                m60Var = m60Var3;
            } else {
                y3Var.d = size;
                y3Var.e = org.telegram.messenger.tz.Z0;
                y3Var.f43689c = 0;
                int size2 = y3Var.f43688b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    x3 x3Var2 = (x3) this.f42857x.f43428c.f43688b.get(i21);
                    String str = x3Var2.f43429f;
                    if (str != null) {
                        if (x3Var2.f43426a && "•".equalsIgnoreCase(str)) {
                            x3Var2.f43430i = null;
                        } else {
                            String str2 = x3Var2.f43429f;
                            m60Var3.getClass();
                            m60 m60Var4 = m60Var3;
                            m60Var2 = m60Var4;
                            x3Var2.f43430i = h4.o(m60Var4, this, str2, null, size - org.telegram.messenger.i0.L(54), this.f42852f, this.f42857x, this.f42850b);
                            y3 y3Var2 = this.f42857x.f43428c;
                            y3Var2.f43689c = Math.max(y3Var2.f43689c, (int) Math.ceil(o10.d.getLineWidth(0)));
                            z10 = false;
                            i21++;
                            m60Var3 = m60Var2;
                        }
                    }
                    m60Var2 = m60Var3;
                    i21++;
                    m60Var3 = m60Var2;
                }
                m60Var = m60Var3;
                if (h4.f37713o1 != null && !z10) {
                    y3 y3Var3 = this.f42857x.f43428c;
                    y3Var3.f43689c = Math.max(y3Var3.f43689c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            x3 x3Var3 = this.f42857x;
            this.f42858y = !x3Var3.f43428c.f43687a.ordered;
            if (x3Var3.f43426a) {
                if (this.D == null) {
                    m60Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.D = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.t6.Vl, org.telegram.ui.ActionBar.t6.f21329z5, org.telegram.ui.ActionBar.t6.f21059k7);
                    this.D.d(10);
                    this.D.k(true);
                    this.D.i(org.telegram.messenger.i0.L(5.0f));
                }
                this.D.f(-1, this.f42857x.f43427b, false);
            } else {
                this.D = null;
            }
            int i22 = 26;
            f4 f4Var = this.f42850b;
            if (f4Var != null && f4Var.G) {
                m60Var.getClass();
                if (this.D == null) {
                    i22 = 0;
                }
                this.e = org.telegram.messenger.i0.L(i22 + 18);
            } else {
                m60Var.getClass();
                if (this.D == null) {
                    i22 = 0;
                }
                int L3 = org.telegram.messenger.i0.L(i22 + 24);
                y3 y3Var4 = this.f42857x.f43428c;
                this.e = org.telegram.messenger.m5.D(12.0f, y3Var4.f43690f, L3 + y3Var4.f43689c);
            }
            m60Var.getClass();
            float f7 = 18;
            int L4 = (size - org.telegram.messenger.i0.L(f7)) - this.e;
            if (f4Var != null && f4Var.G) {
                int L5 = org.telegram.messenger.i0.L(6.0f);
                y3 y3Var5 = this.f42857x.f43428c;
                L4 -= (org.telegram.messenger.i0.L(12.0f) * y3Var5.f43690f) + (L5 + y3Var5.f43689c);
            }
            x3 x3Var4 = this.f42857x;
            int i23 = L4;
            TL_iv.RichText richText = x3Var4.e;
            if (richText != null) {
                if (f4Var != null && f4Var.G) {
                    alignment = org.telegram.ui.Components.ov0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                z2 n10 = h4.n(this.f42849a, this, null, richText, i23, 0, x3Var4, alignment, 0, this.f42850b);
                this.f42851c = n10;
                if (n10 != null && n10.d.getLineCount() > 0) {
                    z2 z2Var3 = this.f42857x.f43430i;
                    if (z2Var3 != null && z2Var3.d.getLineCount() > 0) {
                        this.h = (org.telegram.messenger.i0.L(2.5f) + this.f42857x.f43430i.d.getLineAscent(0)) - this.f42851c.d.getLineAscent(0);
                    }
                    i13 = this.f42851c.d.getHeight();
                    L = org.telegram.messenger.i0.L(8);
                    i17 = L + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = x3Var4.d;
                if (pageBlock != null) {
                    int i24 = this.e;
                    this.f42853n = i24;
                    int i25 = this.f42852f;
                    this.f42854r = i25;
                    org.telegram.ui.Components.ck0 ck0Var = this.d;
                    if (ck0Var != null) {
                        View view = ck0Var.f47898a;
                        if (view instanceof a2) {
                            float f10 = 8;
                            this.f42854r = i25 - org.telegram.messenger.i0.L(f10);
                            if (f4Var == null || !f4Var.G) {
                                this.f42853n -= org.telegram.messenger.i0.L(f7);
                            }
                            int L6 = i23 + org.telegram.messenger.i0.L(f7);
                            i15 = 0 - org.telegram.messenger.i0.L(f10);
                            i14 = L6;
                        } else {
                            if (!(view instanceof u1) && !(view instanceof p2) && !(view instanceof t2) && !(view instanceof q2)) {
                                if (h4.J(pageBlock)) {
                                    this.f42853n = 0;
                                    this.f42854r = 0;
                                    this.f42852f = 0;
                                    x3 x3Var5 = this.f42857x;
                                    if (x3Var5.f43431j == 0 && x3Var5.f43428c.f43690f == 0) {
                                        i16 = 0 - org.telegram.messenger.i0.L(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - org.telegram.messenger.i0.L(8);
                                    i14 = size;
                                } else if (this.d.f47898a instanceof s2) {
                                    this.f42853n -= org.telegram.messenger.i0.L(f7);
                                    L2 = org.telegram.messenger.i0.L(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (f4Var == null || !f4Var.G) {
                                    this.f42853n = i24 - org.telegram.messenger.i0.L(f7);
                                }
                                L2 = org.telegram.messenger.i0.L(f7);
                            }
                            i14 = L2 + i23;
                            i15 = 0;
                        }
                        this.d.f47898a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f47898a instanceof a2) && (z2Var = this.f42857x.f43430i) != null && z2Var.d.getLineCount() > 0 && (z2Var2 = (a2Var = (a2) this.d.f47898a).f35523c) != null && z2Var2.d.getLineCount() > 0) {
                            this.h = (org.telegram.messenger.i0.L(2.5f) + this.f42857x.f43430i.d.getLineAscent(0)) - a2Var.f35523c.d.getLineAscent(0);
                        }
                        x3 x3Var6 = this.f42857x;
                        if (x3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f42855s = true;
                            this.f42854r = 0;
                            if (x3Var6.f43431j == 0 && x3Var6.f43428c.f43690f == 0) {
                                i15 -= org.telegram.messenger.i0.L(10);
                            }
                            i15 -= org.telegram.messenger.i0.L(8);
                        } else {
                            View view2 = this.d.f47898a;
                            if (view2 instanceof z1) {
                                this.f42855s = ((z1) view2).f43975w;
                            } else if (view2 instanceof w1) {
                                this.f42855s = ((w1) view2).f42855s;
                            }
                        }
                        if (this.f42855s && this.f42857x.f43430i != null) {
                            this.f42852f = ((this.d.f47898a.getMeasuredHeight() - this.f42857x.f43430i.d.getHeight()) / 2) - org.telegram.messenger.i0.L(4.0f);
                            this.f42858y = false;
                        }
                        i13 = this.d.f47898a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    L = org.telegram.messenger.i0.L(8);
                    i17 = L + i13;
                }
                i17 = 0;
            }
            if (i0.a.g(1, this.f42857x.f43428c.f43688b) == this.f42857x) {
                i17 += org.telegram.messenger.i0.L(8);
            }
            x3 x3Var7 = this.f42857x;
            if (x3Var7.f43431j == 0 && x3Var7.f43428c.f43690f == 0) {
                i18 = org.telegram.messenger.i0.L(10) + i17;
            } else {
                i18 = i17;
            }
            z2 z2Var4 = this.f42851c;
            if (z2Var4 != null) {
                z2Var4.f43990s = this.e;
                z2Var4.f43991w = this.f42852f;
            }
            org.telegram.ui.Components.ck0 ck0Var2 = this.d;
            if (ck0Var2 != null && (ck0Var2.f47898a instanceof org.telegram.ui.Cells.j9) && (k9Var = ((h4) m60Var).P0) != null) {
                ArrayList arrayList = k9Var.A0;
                arrayList.clear();
                ((org.telegram.ui.Cells.j9) this.d.f47898a).h(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) obj;
                    if (u9Var instanceof z2) {
                        z2 z2Var5 = (z2) u9Var;
                        z2Var5.f43990s += this.f42853n;
                        z2Var5.f43991w += this.f42854r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (h4.j(this.f42849a, this.f42850b, motionEvent, this, this.f42851c, this.e, this.f42852f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(x3 x3Var) {
        x3 x3Var2 = this.f42857x;
        f4 f4Var = this.f42850b;
        if (x3Var2 != x3Var) {
            this.f42857x = x3Var;
            org.telegram.ui.Components.ck0 ck0Var = this.d;
            if (ck0Var != null) {
                removeView(ck0Var.f47898a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f42857x.d;
            if (pageBlock != null && f4Var != null) {
                int I = f4.I(pageBlock);
                this.f42856w = I;
                s4.c1 w9 = f4Var.w(this, I);
                this.d = (org.telegram.ui.Components.ck0) w9;
                addView(w9.f47898a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f42857x.d;
        if (pageBlock2 != null && f4Var != null) {
            f4Var.H(this.f42856w, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
