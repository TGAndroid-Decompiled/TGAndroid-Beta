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
    public CheckBoxBase E;
    public final p50 f52773a;
    public final e4 f52774b;
    public z2 f52775c;
    public org.telegram.ui.Components.mj0 d;
    public int f52776e;
    public int f52777f;
    public int h;
    public int f52778n;
    public int f52779r;
    public boolean f52780s;
    public int f52781w;
    public w3 f52782x;
    public boolean f52783y;

    public v1(Context context, p50 p50Var, e4 e4Var) {
        super(context);
        this.f52773a = p50Var;
        this.f52774b = e4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        z2 z2Var;
        w3 w3Var = this.f52782x;
        if (w3Var != null) {
            z2Var = w3Var.f53097i;
        } else {
            z2Var = null;
        }
        if (z2Var == null) {
            return 0;
        }
        p50 p50Var = this.f52773a;
        e4 e4Var = this.f52774b;
        if (e4Var != null && e4Var.H) {
            int measuredWidth = getMeasuredWidth();
            p50Var.getClass();
            int L = measuredWidth - org.telegram.messenger.g0.L(15);
            x3 x3Var = this.f52782x.f53094c;
            return org.telegram.messenger.m10.B(12.0f, x3Var.f53834f, L - x3Var.f53832c);
        }
        p50Var.getClass();
        return org.telegram.messenger.f3.D(12.0f, this.f52782x.f53094c.f53834f, (org.telegram.messenger.g0.L(15) + this.f52782x.f53094c.f53832c) - ((int) Math.ceil(z2Var.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i7;
        int boundLeft;
        this.f52773a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        if (this.E != null) {
            i7 = Math.min(Integer.MAX_VALUE, (this.f52776e - org.telegram.messenger.g0.L(26.0f)) - L);
        } else {
            i7 = Integer.MAX_VALUE;
        }
        w3 w3Var = this.f52782x;
        if (w3Var != null && w3Var.f53097i != null) {
            i7 = Math.min(i7, (this.f52782x.f53097i.k() + a()) - L);
        }
        z2 z2Var = this.f52775c;
        if (z2Var != null) {
            i7 = Math.min(i7, (z2Var.k() + z2Var.f54496s) - L);
        }
        org.telegram.ui.Components.mj0 mj0Var = this.d;
        if (mj0Var != null) {
            View view = mj0Var.f59245a;
            if ((view instanceof c3) && (boundLeft = ((c3) view).getBoundLeft()) != -1) {
                i7 = Math.min(i7, this.f52778n + boundLeft);
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
        this.f52773a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        w3 w3Var = this.f52782x;
        if (w3Var != null && w3Var.f53097i != null) {
            i7 = Math.max(Integer.MIN_VALUE, this.f52782x.f53097i.l() + a() + L);
        } else {
            i7 = Integer.MIN_VALUE;
        }
        z2 z2Var = this.f52775c;
        if (z2Var != null) {
            i7 = Math.max(i7, z2Var.l() + z2Var.f54496s + L);
        }
        org.telegram.ui.Components.mj0 mj0Var = this.d;
        if (mj0Var != null) {
            View view = mj0Var.f59245a;
            if ((view instanceof c3) && (boundRight = ((c3) view).getBoundRight()) != -1) {
                i7 = Math.max(i7, this.f52778n + boundRight);
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
        z2 z2Var = this.f52775c;
        if (z2Var != null) {
            lastLineBoundRight = z2Var.m() + z2Var.f54496s;
            this.f52773a.getClass();
            i7 = org.telegram.messenger.g0.L(18);
        } else {
            org.telegram.ui.Components.mj0 mj0Var = this.d;
            if (mj0Var != null) {
                View view = mj0Var.f59245a;
                if ((view instanceof c3) && (lastLineBoundRight = ((c3) view).getLastLineBoundRight()) != -1) {
                    i7 = this.f52778n;
                }
            }
            return -1;
        }
        return i7 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.m10.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.mj0 mj0Var = this.d;
        if (mj0Var != null) {
            mj0Var.f59245a.invalidate();
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        org.telegram.ui.Components.mj0 mj0Var = this.d;
        if (mj0Var != null) {
            View view = mj0Var.f59245a;
            if (view instanceof org.telegram.ui.Cells.h9) {
                ((org.telegram.ui.Cells.h9) view).k(arrayList);
            }
        }
        z2 z2Var = this.f52775c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f52775c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f52775c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        w3 w3Var;
        int i7;
        int i10;
        if (this.f52782x != null) {
            int measuredWidth = getMeasuredWidth();
            z2 z2Var = this.f52782x.f53097i;
            p50 p50Var = this.f52773a;
            if (z2Var != null) {
                canvas.save();
                e4 e4Var = this.f52774b;
                if (e4Var != null && e4Var.H) {
                    p50Var.getClass();
                    int L = measuredWidth - org.telegram.messenger.g0.L(15);
                    x3 x3Var = this.f52782x.f53094c;
                    float B = org.telegram.messenger.m10.B(12.0f, x3Var.f53834f, L - x3Var.f53832c);
                    int i11 = this.f52777f + this.h;
                    if (this.f52783y) {
                        i10 = org.telegram.messenger.g0.L(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(B, i11 - i10);
                } else {
                    p50Var.getClass();
                    float D = org.telegram.messenger.f3.D(12.0f, this.f52782x.f53094c.f53834f, (org.telegram.messenger.g0.L(15) + this.f52782x.f53094c.f53832c) - ((int) Math.ceil(w3Var.f53097i.d.getLineWidth(0))));
                    int i12 = this.f52777f + this.h;
                    if (this.f52783y) {
                        i7 = org.telegram.messenger.g0.L(1.0f);
                    } else {
                        i7 = 0;
                    }
                    canvas.translate(D, i12 - i7);
                }
                this.f52782x.f53097i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.E;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f52776e - org.telegram.messenger.g0.L(26.0f), this.f52777f, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                this.E.a(canvas);
            }
            if (this.f52775c != null) {
                canvas.save();
                canvas.translate(this.f52776e, this.f52777f);
                g4.t(p50Var, canvas, this, 0);
                this.f52775c.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f52775c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.h(this.f52773a, this.f52774b, z2Var));
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Components.mj0 mj0Var = this.d;
        if (mj0Var != null) {
            View view = mj0Var.f59245a;
            int i13 = this.f52778n;
            view.layout(i13, this.f52779r, view.getMeasuredWidth() + i13, this.d.f59245a.getMeasuredHeight() + this.f52779r);
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
        org.telegram.ui.Cells.i9 i9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i7);
        w3 w3Var = this.f52782x;
        int i17 = 1;
        if (w3Var != null) {
            this.f52775c = null;
            int i18 = w3Var.f53098j;
            p50 p50Var3 = this.f52773a;
            int i19 = 0;
            if (i18 == 0 && w3Var.f53094c.f53834f == 0) {
                p50Var3.getClass();
                i11 = org.telegram.messenger.g0.L(10);
            } else {
                i11 = 0;
            }
            this.f52777f = i11;
            this.h = 0;
            x3 x3Var = this.f52782x.f53094c;
            if (x3Var.d == size && x3Var.f53833e == org.telegram.messenger.bz.Z0) {
                p50Var = p50Var3;
            } else {
                x3Var.d = size;
                x3Var.f53833e = org.telegram.messenger.bz.Z0;
                x3Var.f53832c = 0;
                int size2 = x3Var.f53831b.size();
                boolean z10 = true;
                int i20 = 0;
                while (i20 < size2) {
                    w3 w3Var2 = (w3) this.f52782x.f53094c.f53831b.get(i20);
                    String str = w3Var2.f53096f;
                    if (str != null) {
                        if (w3Var2.f53092a && "•".equalsIgnoreCase(str)) {
                            w3Var2.f53097i = null;
                        } else {
                            String str2 = w3Var2.f53096f;
                            p50Var3.getClass();
                            p50 p50Var4 = p50Var3;
                            p50Var2 = p50Var4;
                            w3Var2.f53097i = g4.o(p50Var4, this, str2, null, size - org.telegram.messenger.g0.L(54), this.f52777f, this.f52782x, this.f52774b);
                            x3 x3Var2 = this.f52782x.f53094c;
                            x3Var2.f53832c = Math.max(x3Var2.f53832c, (int) Math.ceil(o4.d.getLineWidth(0)));
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
                if (g4.f48050p1 != null && !z10) {
                    x3 x3Var3 = this.f52782x.f53094c;
                    x3Var3.f53832c = Math.max(x3Var3.f53832c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            w3 w3Var3 = this.f52782x;
            this.f52783y = !w3Var3.f53094c.f53830a.ordered;
            if (w3Var3.f53092a) {
                if (this.E == null) {
                    p50Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.E = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.n6.Yl, org.telegram.ui.ActionBar.n6.f29861z5, org.telegram.ui.ActionBar.n6.f29581k7);
                    this.E.d(10);
                    this.E.k(true);
                    this.E.i(org.telegram.messenger.g0.L(5.0f));
                }
                this.E.f(-1, this.f52782x.f53093b, false);
            } else {
                this.E = null;
            }
            int i21 = 26;
            e4 e4Var = this.f52774b;
            if (e4Var != null && e4Var.H) {
                p50Var.getClass();
                if (this.E == null) {
                    i21 = 0;
                }
                this.f52776e = org.telegram.messenger.g0.L(i21 + 18);
            } else {
                p50Var.getClass();
                if (this.E == null) {
                    i21 = 0;
                }
                int L3 = org.telegram.messenger.g0.L(i21 + 24);
                x3 x3Var4 = this.f52782x.f53094c;
                this.f52776e = org.telegram.messenger.f3.D(12.0f, x3Var4.f53834f, L3 + x3Var4.f53832c);
            }
            p50Var.getClass();
            float f10 = 18;
            int L4 = (size - org.telegram.messenger.g0.L(f10)) - this.f52776e;
            if (e4Var != null && e4Var.H) {
                int L5 = org.telegram.messenger.g0.L(6.0f);
                x3 x3Var5 = this.f52782x.f53094c;
                L4 -= (org.telegram.messenger.g0.L(12.0f) * x3Var5.f53834f) + (L5 + x3Var5.f53832c);
            }
            w3 w3Var4 = this.f52782x;
            int i22 = L4;
            TL_iv.RichText richText = w3Var4.f53095e;
            if (richText != null) {
                if (e4Var != null && e4Var.H) {
                    alignment = org.telegram.ui.Components.yu0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                z2 n10 = g4.n(this.f52773a, this, null, richText, i22, 0, w3Var4, alignment, 0, this.f52774b);
                this.f52775c = n10;
                if (n10 != null && n10.d.getLineCount() > 0) {
                    z2 z2Var3 = this.f52782x.f53097i;
                    if (z2Var3 != null && z2Var3.d.getLineCount() > 0) {
                        this.h = (org.telegram.messenger.g0.L(2.5f) + this.f52782x.f53097i.d.getLineAscent(0)) - this.f52775c.d.getLineAscent(0);
                    }
                    i12 = this.f52775c.d.getHeight();
                    L = org.telegram.messenger.g0.L(8);
                    i16 = L + i12;
                }
                i16 = 0;
            } else {
                TL_iv.PageBlock pageBlock = w3Var4.d;
                if (pageBlock != null) {
                    int i23 = this.f52776e;
                    this.f52778n = i23;
                    int i24 = this.f52777f;
                    this.f52779r = i24;
                    org.telegram.ui.Components.mj0 mj0Var = this.d;
                    if (mj0Var != null) {
                        View view = mj0Var.f59245a;
                        if (view instanceof z1) {
                            float f11 = 8;
                            this.f52779r = i24 - org.telegram.messenger.g0.L(f11);
                            if (e4Var == null || !e4Var.H) {
                                this.f52778n -= org.telegram.messenger.g0.L(f10);
                            }
                            int L6 = i22 + org.telegram.messenger.g0.L(f10);
                            i14 = 0 - org.telegram.messenger.g0.L(f11);
                            i13 = L6;
                        } else {
                            if (!(view instanceof t1) && !(view instanceof p2) && !(view instanceof t2) && !(view instanceof q2)) {
                                if (g4.J(pageBlock)) {
                                    this.f52778n = 0;
                                    this.f52779r = 0;
                                    this.f52777f = 0;
                                    w3 w3Var5 = this.f52782x;
                                    if (w3Var5.f53098j == 0 && w3Var5.f53094c.f53834f == 0) {
                                        i15 = 0 - org.telegram.messenger.g0.L(10);
                                    } else {
                                        i15 = 0;
                                    }
                                    i14 = i15 - org.telegram.messenger.g0.L(8);
                                    i13 = size;
                                } else if (this.d.f59245a instanceof s2) {
                                    this.f52778n -= org.telegram.messenger.g0.L(f10);
                                    L2 = org.telegram.messenger.g0.L(36);
                                } else {
                                    i13 = i22;
                                    i14 = 0;
                                }
                            } else {
                                if (e4Var == null || !e4Var.H) {
                                    this.f52778n = i23 - org.telegram.messenger.g0.L(f10);
                                }
                                L2 = org.telegram.messenger.g0.L(f10);
                            }
                            i13 = L2 + i22;
                            i14 = 0;
                        }
                        this.d.f59245a.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f59245a instanceof z1) && (z2Var = this.f52782x.f53097i) != null && z2Var.d.getLineCount() > 0 && (z2Var2 = (z1Var = (z1) this.d.f59245a).f54478c) != null && z2Var2.d.getLineCount() > 0) {
                            this.h = (org.telegram.messenger.g0.L(2.5f) + this.f52782x.f53097i.d.getLineAscent(0)) - z1Var.f54478c.d.getLineAscent(0);
                        }
                        w3 w3Var6 = this.f52782x;
                        if (w3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f52780s = true;
                            this.f52779r = 0;
                            if (w3Var6.f53098j == 0 && w3Var6.f53094c.f53834f == 0) {
                                i14 -= org.telegram.messenger.g0.L(10);
                            }
                            i14 -= org.telegram.messenger.g0.L(8);
                        } else {
                            View view2 = this.d.f59245a;
                            if (view2 instanceof y1) {
                                this.f52780s = ((y1) view2).f54155w;
                            } else if (view2 instanceof v1) {
                                this.f52780s = ((v1) view2).f52780s;
                            }
                        }
                        if (this.f52780s && this.f52782x.f53097i != null) {
                            this.f52777f = ((this.d.f59245a.getMeasuredHeight() - this.f52782x.f53097i.d.getHeight()) / 2) - org.telegram.messenger.g0.L(4.0f);
                            this.f52783y = false;
                        }
                        i12 = this.d.f59245a.getMeasuredHeight() + i14;
                    } else {
                        i12 = 0;
                    }
                    L = org.telegram.messenger.g0.L(8);
                    i16 = L + i12;
                }
                i16 = 0;
            }
            if (i5.c.h(1, this.f52782x.f53094c.f53831b) == this.f52782x) {
                i16 += org.telegram.messenger.g0.L(8);
            }
            w3 w3Var7 = this.f52782x;
            if (w3Var7.f53098j == 0 && w3Var7.f53094c.f53834f == 0) {
                i17 = org.telegram.messenger.g0.L(10) + i16;
            } else {
                i17 = i16;
            }
            z2 z2Var4 = this.f52775c;
            if (z2Var4 != null) {
                z2Var4.f54496s = this.f52776e;
                z2Var4.f54497w = this.f52777f;
            }
            org.telegram.ui.Components.mj0 mj0Var2 = this.d;
            if (mj0Var2 != null && (mj0Var2.f59245a instanceof org.telegram.ui.Cells.h9) && (i9Var = ((g4) p50Var).Q0) != null) {
                ArrayList arrayList = i9Var.A0;
                arrayList.clear();
                ((org.telegram.ui.Cells.h9) this.d.f59245a).k(arrayList);
                int size3 = arrayList.size();
                while (i19 < size3) {
                    Object obj = arrayList.get(i19);
                    i19++;
                    org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) obj;
                    if (t9Var instanceof z2) {
                        z2 z2Var5 = (z2) t9Var;
                        z2Var5.f54496s += this.f52778n;
                        z2Var5.f54497w += this.f52779r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i17);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (g4.j(this.f52773a, this.f52774b, motionEvent, this, this.f52775c, this.f52776e, this.f52777f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(w3 w3Var) {
        w3 w3Var2 = this.f52782x;
        e4 e4Var = this.f52774b;
        if (w3Var2 != w3Var) {
            this.f52782x = w3Var;
            org.telegram.ui.Components.mj0 mj0Var = this.d;
            if (mj0Var != null) {
                removeView(mj0Var.f59245a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f52782x.d;
            if (pageBlock != null && e4Var != null) {
                int I = e4.I(pageBlock);
                this.f52781w = I;
                v4.f1 x10 = e4Var.x(this, I);
                this.d = (org.telegram.ui.Components.mj0) x10;
                addView(x10.f59245a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f52782x.d;
        if (pageBlock2 != null && e4Var != null) {
            e4Var.H(this.f52781w, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
