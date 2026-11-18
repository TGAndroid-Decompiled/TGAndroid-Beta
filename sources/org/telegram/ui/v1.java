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
public final class v1 extends ViewGroup implements org.telegram.ui.Cells.i9, c3 {
    public CheckBoxBase E;
    public final p50 f52645a;
    public final e4 f52646b;
    public z2 f52647c;
    public org.telegram.ui.Components.kj0 d;
    public int f52648e;
    public int f52649f;
    public int h;
    public int f52650n;
    public int f52651r;
    public boolean f52652s;
    public int f52653w;
    public w3 f52654x;
    public boolean f52655y;

    public v1(Context context, p50 p50Var, e4 e4Var) {
        super(context);
        this.f52645a = p50Var;
        this.f52646b = e4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        z2 z2Var;
        w3 w3Var = this.f52654x;
        if (w3Var != null) {
            z2Var = w3Var.f52908i;
        } else {
            z2Var = null;
        }
        if (z2Var == null) {
            return 0;
        }
        p50 p50Var = this.f52645a;
        e4 e4Var = this.f52646b;
        if (e4Var != null && e4Var.H) {
            int measuredWidth = getMeasuredWidth();
            p50Var.getClass();
            int L = measuredWidth - org.telegram.messenger.g0.L(15);
            x3 x3Var = this.f52654x.f52905c;
            return org.telegram.messenger.n10.B(12.0f, x3Var.f53549f, L - x3Var.f53547c);
        }
        p50Var.getClass();
        return org.telegram.messenger.f3.D(12.0f, this.f52654x.f52905c.f53549f, (org.telegram.messenger.g0.L(15) + this.f52654x.f52905c.f53547c) - ((int) Math.ceil(z2Var.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i7;
        int boundLeft;
        this.f52645a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        if (this.E != null) {
            i7 = Math.min(Integer.MAX_VALUE, (this.f52648e - org.telegram.messenger.g0.L(26.0f)) - L);
        } else {
            i7 = Integer.MAX_VALUE;
        }
        w3 w3Var = this.f52654x;
        if (w3Var != null && w3Var.f52908i != null) {
            i7 = Math.min(i7, (this.f52654x.f52908i.k() + a()) - L);
        }
        z2 z2Var = this.f52647c;
        if (z2Var != null) {
            i7 = Math.min(i7, (z2Var.k() + z2Var.f54332s) - L);
        }
        org.telegram.ui.Components.kj0 kj0Var = this.d;
        if (kj0Var != null) {
            View view = kj0Var.f59123a;
            if ((view instanceof c3) && (boundLeft = ((c3) view).getBoundLeft()) != -1) {
                i7 = Math.min(i7, this.f52650n + boundLeft);
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
        this.f52645a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        w3 w3Var = this.f52654x;
        if (w3Var != null && w3Var.f52908i != null) {
            i7 = Math.max(Integer.MIN_VALUE, this.f52654x.f52908i.l() + a() + L);
        } else {
            i7 = Integer.MIN_VALUE;
        }
        z2 z2Var = this.f52647c;
        if (z2Var != null) {
            i7 = Math.max(i7, z2Var.l() + z2Var.f54332s + L);
        }
        org.telegram.ui.Components.kj0 kj0Var = this.d;
        if (kj0Var != null) {
            View view = kj0Var.f59123a;
            if ((view instanceof c3) && (boundRight = ((c3) view).getBoundRight()) != -1) {
                i7 = Math.max(i7, this.f52650n + boundRight);
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
        z2 z2Var = this.f52647c;
        if (z2Var != null) {
            lastLineBoundRight = z2Var.m() + z2Var.f54332s;
            this.f52645a.getClass();
            i7 = org.telegram.messenger.g0.L(18);
        } else {
            org.telegram.ui.Components.kj0 kj0Var = this.d;
            if (kj0Var != null) {
                View view = kj0Var.f59123a;
                if ((view instanceof c3) && (lastLineBoundRight = ((c3) view).getLastLineBoundRight()) != -1) {
                    i7 = this.f52650n;
                }
            }
            return -1;
        }
        return i7 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.n10.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.kj0 kj0Var = this.d;
        if (kj0Var != null) {
            kj0Var.f59123a.invalidate();
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        org.telegram.ui.Components.kj0 kj0Var = this.d;
        if (kj0Var != null) {
            View view = kj0Var.f59123a;
            if (view instanceof org.telegram.ui.Cells.i9) {
                ((org.telegram.ui.Cells.i9) view).k(arrayList);
            }
        }
        z2 z2Var = this.f52647c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f52647c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f52647c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        w3 w3Var;
        int i7;
        int i10;
        if (this.f52654x != null) {
            int measuredWidth = getMeasuredWidth();
            z2 z2Var = this.f52654x.f52908i;
            p50 p50Var = this.f52645a;
            if (z2Var != null) {
                canvas.save();
                e4 e4Var = this.f52646b;
                if (e4Var != null && e4Var.H) {
                    p50Var.getClass();
                    int L = measuredWidth - org.telegram.messenger.g0.L(15);
                    x3 x3Var = this.f52654x.f52905c;
                    float B = org.telegram.messenger.n10.B(12.0f, x3Var.f53549f, L - x3Var.f53547c);
                    int i11 = this.f52649f + this.h;
                    if (this.f52655y) {
                        i10 = org.telegram.messenger.g0.L(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(B, i11 - i10);
                } else {
                    p50Var.getClass();
                    float D = org.telegram.messenger.f3.D(12.0f, this.f52654x.f52905c.f53549f, (org.telegram.messenger.g0.L(15) + this.f52654x.f52905c.f53547c) - ((int) Math.ceil(w3Var.f52908i.d.getLineWidth(0))));
                    int i12 = this.f52649f + this.h;
                    if (this.f52655y) {
                        i7 = org.telegram.messenger.g0.L(1.0f);
                    } else {
                        i7 = 0;
                    }
                    canvas.translate(D, i12 - i7);
                }
                this.f52654x.f52908i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.E;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f52648e - org.telegram.messenger.g0.L(26.0f), this.f52649f, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                this.E.a(canvas);
            }
            if (this.f52647c != null) {
                canvas.save();
                canvas.translate(this.f52648e, this.f52649f);
                g4.t(p50Var, canvas, this, 0);
                this.f52647c.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f52647c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.h(this.f52645a, this.f52646b, z2Var));
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Components.kj0 kj0Var = this.d;
        if (kj0Var != null) {
            View view = kj0Var.f59123a;
            int i13 = this.f52650n;
            view.layout(i13, this.f52651r, view.getMeasuredWidth() + i13, this.d.f59123a.getMeasuredHeight() + this.f52651r);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        p50 p50Var;
        TextPaint textPaint;
        p50 p50Var2;
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
        org.telegram.ui.Cells.j9 j9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i7);
        w3 w3Var = this.f52654x;
        int i17 = 1;
        if (w3Var != null) {
            this.f52647c = null;
            int i18 = w3Var.f52909j;
            p50 p50Var3 = this.f52645a;
            int i19 = 0;
            if (i18 == 0 && w3Var.f52905c.f53549f == 0) {
                p50Var3.getClass();
                i11 = org.telegram.messenger.g0.L(10);
            } else {
                i11 = 0;
            }
            this.f52649f = i11;
            this.h = 0;
            x3 x3Var = this.f52654x.f52905c;
            if (x3Var.d == size && x3Var.f53548e == org.telegram.messenger.bz.Z0) {
                p50Var = p50Var3;
            } else {
                x3Var.d = size;
                x3Var.f53548e = org.telegram.messenger.bz.Z0;
                x3Var.f53547c = 0;
                int size2 = x3Var.f53546b.size();
                boolean z10 = true;
                int i20 = 0;
                while (i20 < size2) {
                    w3 w3Var2 = (w3) this.f52654x.f52905c.f53546b.get(i20);
                    String str = w3Var2.f52907f;
                    if (str != null) {
                        if (w3Var2.f52903a && "•".equalsIgnoreCase(str)) {
                            w3Var2.f52908i = null;
                        } else {
                            String str2 = w3Var2.f52907f;
                            p50Var3.getClass();
                            p50 p50Var4 = p50Var3;
                            p50Var2 = p50Var4;
                            w3Var2.f52908i = g4.o(p50Var4, this, str2, null, size - org.telegram.messenger.g0.L(54), this.f52649f, this.f52654x, this.f52646b);
                            x3 x3Var2 = this.f52654x.f52905c;
                            x3Var2.f53547c = Math.max(x3Var2.f53547c, (int) Math.ceil(o4.d.getLineWidth(0)));
                            z10 = false;
                            i20++;
                            p50Var3 = p50Var2;
                        }
                    }
                    p50Var2 = p50Var3;
                    i20++;
                    p50Var3 = p50Var2;
                }
                p50Var = p50Var3;
                if (g4.f47865p1 != null && !z10) {
                    x3 x3Var3 = this.f52654x.f52905c;
                    x3Var3.f53547c = Math.max(x3Var3.f53547c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            w3 w3Var3 = this.f52654x;
            this.f52655y = !w3Var3.f52905c.f53545a.ordered;
            if (w3Var3.f52903a) {
                if (this.E == null) {
                    p50Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.E = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.n6.Yl, org.telegram.ui.ActionBar.n6.f29804z5, org.telegram.ui.ActionBar.n6.f29524k7);
                    this.E.d(10);
                    this.E.k(true);
                    this.E.i(org.telegram.messenger.g0.L(5.0f));
                }
                this.E.f(-1, this.f52654x.f52904b, false);
            } else {
                this.E = null;
            }
            int i21 = 26;
            e4 e4Var = this.f52646b;
            if (e4Var != null && e4Var.H) {
                p50Var.getClass();
                if (this.E == null) {
                    i21 = 0;
                }
                this.f52648e = org.telegram.messenger.g0.L(i21 + 18);
            } else {
                p50Var.getClass();
                if (this.E == null) {
                    i21 = 0;
                }
                int L3 = org.telegram.messenger.g0.L(i21 + 24);
                x3 x3Var4 = this.f52654x.f52905c;
                this.f52648e = org.telegram.messenger.f3.D(12.0f, x3Var4.f53549f, L3 + x3Var4.f53547c);
            }
            p50Var.getClass();
            float f10 = 18;
            int L4 = (size - org.telegram.messenger.g0.L(f10)) - this.f52648e;
            if (e4Var != null && e4Var.H) {
                int L5 = org.telegram.messenger.g0.L(6.0f);
                x3 x3Var5 = this.f52654x.f52905c;
                L4 -= (org.telegram.messenger.g0.L(12.0f) * x3Var5.f53549f) + (L5 + x3Var5.f53547c);
            }
            w3 w3Var4 = this.f52654x;
            int i22 = L4;
            TL_iv.RichText richText = w3Var4.f52906e;
            if (richText != null) {
                if (e4Var != null && e4Var.H) {
                    alignment = org.telegram.ui.Components.wu0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                z2 n10 = g4.n(this.f52645a, this, null, richText, i22, 0, w3Var4, alignment, 0, this.f52646b);
                this.f52647c = n10;
                if (n10 != null && n10.d.getLineCount() > 0) {
                    z2 z2Var3 = this.f52654x.f52908i;
                    if (z2Var3 != null && z2Var3.d.getLineCount() > 0) {
                        this.h = (org.telegram.messenger.g0.L(2.5f) + this.f52654x.f52908i.d.getLineAscent(0)) - this.f52647c.d.getLineAscent(0);
                    }
                    i12 = this.f52647c.d.getHeight();
                    L = org.telegram.messenger.g0.L(8);
                    i16 = L + i12;
                }
                i16 = 0;
            } else {
                TL_iv.PageBlock pageBlock = w3Var4.d;
                if (pageBlock != null) {
                    int i23 = this.f52648e;
                    this.f52650n = i23;
                    int i24 = this.f52649f;
                    this.f52651r = i24;
                    org.telegram.ui.Components.kj0 kj0Var = this.d;
                    if (kj0Var != null) {
                        View view = kj0Var.f59123a;
                        if (view instanceof z1) {
                            float f11 = 8;
                            this.f52651r = i24 - org.telegram.messenger.g0.L(f11);
                            if (e4Var == null || !e4Var.H) {
                                this.f52650n -= org.telegram.messenger.g0.L(f10);
                            }
                            int L6 = i22 + org.telegram.messenger.g0.L(f10);
                            i14 = 0 - org.telegram.messenger.g0.L(f11);
                            i13 = L6;
                        } else {
                            if (!(view instanceof t1) && !(view instanceof p2) && !(view instanceof t2) && !(view instanceof q2)) {
                                if (g4.J(pageBlock)) {
                                    this.f52650n = 0;
                                    this.f52651r = 0;
                                    this.f52649f = 0;
                                    w3 w3Var5 = this.f52654x;
                                    if (w3Var5.f52909j == 0 && w3Var5.f52905c.f53549f == 0) {
                                        i15 = 0 - org.telegram.messenger.g0.L(10);
                                    } else {
                                        i15 = 0;
                                    }
                                    i14 = i15 - org.telegram.messenger.g0.L(8);
                                    i13 = size;
                                } else if (this.d.f59123a instanceof s2) {
                                    this.f52650n -= org.telegram.messenger.g0.L(f10);
                                    L2 = org.telegram.messenger.g0.L(36);
                                } else {
                                    i13 = i22;
                                    i14 = 0;
                                }
                            } else {
                                if (e4Var == null || !e4Var.H) {
                                    this.f52650n = i23 - org.telegram.messenger.g0.L(f10);
                                }
                                L2 = org.telegram.messenger.g0.L(f10);
                            }
                            i13 = L2 + i22;
                            i14 = 0;
                        }
                        this.d.f59123a.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f59123a instanceof z1) && (z2Var = this.f52654x.f52908i) != null && z2Var.d.getLineCount() > 0 && (z2Var2 = (z1Var = (z1) this.d.f59123a).f54318c) != null && z2Var2.d.getLineCount() > 0) {
                            this.h = (org.telegram.messenger.g0.L(2.5f) + this.f52654x.f52908i.d.getLineAscent(0)) - z1Var.f54318c.d.getLineAscent(0);
                        }
                        w3 w3Var6 = this.f52654x;
                        if (w3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f52652s = true;
                            this.f52651r = 0;
                            if (w3Var6.f52909j == 0 && w3Var6.f52905c.f53549f == 0) {
                                i14 -= org.telegram.messenger.g0.L(10);
                            }
                            i14 -= org.telegram.messenger.g0.L(8);
                        } else {
                            View view2 = this.d.f59123a;
                            if (view2 instanceof y1) {
                                this.f52652s = ((y1) view2).f53964w;
                            } else if (view2 instanceof v1) {
                                this.f52652s = ((v1) view2).f52652s;
                            }
                        }
                        if (this.f52652s && this.f52654x.f52908i != null) {
                            this.f52649f = ((this.d.f59123a.getMeasuredHeight() - this.f52654x.f52908i.d.getHeight()) / 2) - org.telegram.messenger.g0.L(4.0f);
                            this.f52655y = false;
                        }
                        i12 = this.d.f59123a.getMeasuredHeight() + i14;
                    } else {
                        i12 = 0;
                    }
                    L = org.telegram.messenger.g0.L(8);
                    i16 = L + i12;
                }
                i16 = 0;
            }
            if (i5.c.h(1, this.f52654x.f52905c.f53546b) == this.f52654x) {
                i16 += org.telegram.messenger.g0.L(8);
            }
            w3 w3Var7 = this.f52654x;
            if (w3Var7.f52909j == 0 && w3Var7.f52905c.f53549f == 0) {
                i17 = org.telegram.messenger.g0.L(10) + i16;
            } else {
                i17 = i16;
            }
            z2 z2Var4 = this.f52647c;
            if (z2Var4 != null) {
                z2Var4.f54332s = this.f52648e;
                z2Var4.f54333w = this.f52649f;
            }
            org.telegram.ui.Components.kj0 kj0Var2 = this.d;
            if (kj0Var2 != null && (kj0Var2.f59123a instanceof org.telegram.ui.Cells.i9) && (j9Var = ((g4) p50Var).Q0) != null) {
                ArrayList arrayList = j9Var.A0;
                arrayList.clear();
                ((org.telegram.ui.Cells.i9) this.d.f59123a).k(arrayList);
                int size3 = arrayList.size();
                while (i19 < size3) {
                    Object obj = arrayList.get(i19);
                    i19++;
                    org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) obj;
                    if (u9Var instanceof z2) {
                        z2 z2Var5 = (z2) u9Var;
                        z2Var5.f54332s += this.f52650n;
                        z2Var5.f54333w += this.f52651r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i17);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (g4.j(this.f52645a, this.f52646b, motionEvent, this, this.f52647c, this.f52648e, this.f52649f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(w3 w3Var) {
        w3 w3Var2 = this.f52654x;
        e4 e4Var = this.f52646b;
        if (w3Var2 != w3Var) {
            this.f52654x = w3Var;
            org.telegram.ui.Components.kj0 kj0Var = this.d;
            if (kj0Var != null) {
                removeView(kj0Var.f59123a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f52654x.d;
            if (pageBlock != null && e4Var != null) {
                int I = e4.I(pageBlock);
                this.f52653w = I;
                v4.f1 x10 = e4Var.x(this, I);
                this.d = (org.telegram.ui.Components.kj0) x10;
                addView(x10.f59123a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f52654x.d;
        if (pageBlock2 != null && e4Var != null) {
            e4Var.H(this.f52653w, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
