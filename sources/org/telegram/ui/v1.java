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
    public final o50 f50543a;
    public final e4 f50544b;
    public z2 f50545c;
    public org.telegram.ui.Components.xi0 d;
    public int f50546e;
    public int f50547f;
    public int h;
    public int f50548n;
    public int f50549r;
    public boolean f50550s;
    public int f50551w;
    public w3 f50552x;
    public boolean f50553y;

    public v1(Context context, o50 o50Var, e4 e4Var) {
        super(context);
        this.f50543a = o50Var;
        this.f50544b = e4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        z2 z2Var;
        w3 w3Var = this.f50552x;
        if (w3Var != null) {
            z2Var = w3Var.f50901i;
        } else {
            z2Var = null;
        }
        if (z2Var == null) {
            return 0;
        }
        o50 o50Var = this.f50543a;
        e4 e4Var = this.f50544b;
        if (e4Var != null && e4Var.G) {
            int measuredWidth = getMeasuredWidth();
            o50Var.getClass();
            int L = measuredWidth - org.telegram.messenger.g0.L(15);
            x3 x3Var = this.f50552x.f50898c;
            return org.telegram.messenger.camera.q.A(12.0f, x3Var.f51726f, L - x3Var.f51724c);
        }
        o50Var.getClass();
        return org.telegram.messenger.k5.D(12.0f, this.f50552x.f50898c.f51726f, (org.telegram.messenger.g0.L(15) + this.f50552x.f50898c.f51724c) - ((int) Math.ceil(z2Var.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i7;
        int boundLeft;
        this.f50543a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        if (this.D != null) {
            i7 = Math.min(Integer.MAX_VALUE, (this.f50546e - org.telegram.messenger.g0.L(26.0f)) - L);
        } else {
            i7 = Integer.MAX_VALUE;
        }
        w3 w3Var = this.f50552x;
        if (w3Var != null && w3Var.f50901i != null) {
            i7 = Math.min(i7, (this.f50552x.f50901i.k() + a()) - L);
        }
        z2 z2Var = this.f50545c;
        if (z2Var != null) {
            i7 = Math.min(i7, (z2Var.k() + z2Var.f52441s) - L);
        }
        org.telegram.ui.Components.xi0 xi0Var = this.d;
        if (xi0Var != null) {
            View view = xi0Var.f56951a;
            if ((view instanceof c3) && (boundLeft = ((c3) view).getBoundLeft()) != -1) {
                i7 = Math.min(i7, this.f50548n + boundLeft);
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
        this.f50543a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        w3 w3Var = this.f50552x;
        if (w3Var != null && w3Var.f50901i != null) {
            i7 = Math.max(Integer.MIN_VALUE, this.f50552x.f50901i.l() + a() + L);
        } else {
            i7 = Integer.MIN_VALUE;
        }
        z2 z2Var = this.f50545c;
        if (z2Var != null) {
            i7 = Math.max(i7, z2Var.l() + z2Var.f52441s + L);
        }
        org.telegram.ui.Components.xi0 xi0Var = this.d;
        if (xi0Var != null) {
            View view = xi0Var.f56951a;
            if ((view instanceof c3) && (boundRight = ((c3) view).getBoundRight()) != -1) {
                i7 = Math.max(i7, this.f50548n + boundRight);
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
        z2 z2Var = this.f50545c;
        if (z2Var != null) {
            lastLineBoundRight = z2Var.m() + z2Var.f52441s;
            this.f50543a.getClass();
            i7 = org.telegram.messenger.g0.L(18);
        } else {
            org.telegram.ui.Components.xi0 xi0Var = this.d;
            if (xi0Var != null) {
                View view = xi0Var.f56951a;
                if ((view instanceof c3) && (lastLineBoundRight = ((c3) view).getLastLineBoundRight()) != -1) {
                    i7 = this.f50548n;
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
            xi0Var.f56951a.invalidate();
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        org.telegram.ui.Components.xi0 xi0Var = this.d;
        if (xi0Var != null) {
            View view = xi0Var.f56951a;
            if (view instanceof org.telegram.ui.Cells.h9) {
                ((org.telegram.ui.Cells.h9) view).k(arrayList);
            }
        }
        z2 z2Var = this.f50545c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f50545c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f50545c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        w3 w3Var;
        int i7;
        int i10;
        if (this.f50552x != null) {
            int measuredWidth = getMeasuredWidth();
            z2 z2Var = this.f50552x.f50901i;
            o50 o50Var = this.f50543a;
            if (z2Var != null) {
                canvas.save();
                e4 e4Var = this.f50544b;
                if (e4Var != null && e4Var.G) {
                    o50Var.getClass();
                    int L = measuredWidth - org.telegram.messenger.g0.L(15);
                    x3 x3Var = this.f50552x.f50898c;
                    float A = org.telegram.messenger.camera.q.A(12.0f, x3Var.f51726f, L - x3Var.f51724c);
                    int i11 = this.f50547f + this.h;
                    if (this.f50553y) {
                        i10 = org.telegram.messenger.g0.L(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(A, i11 - i10);
                } else {
                    o50Var.getClass();
                    float D = org.telegram.messenger.k5.D(12.0f, this.f50552x.f50898c.f51726f, (org.telegram.messenger.g0.L(15) + this.f50552x.f50898c.f51724c) - ((int) Math.ceil(w3Var.f50901i.d.getLineWidth(0))));
                    int i12 = this.f50547f + this.h;
                    if (this.f50553y) {
                        i7 = org.telegram.messenger.g0.L(1.0f);
                    } else {
                        i7 = 0;
                    }
                    canvas.translate(D, i12 - i7);
                }
                this.f50552x.f50901i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.D;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f50546e - org.telegram.messenger.g0.L(26.0f), this.f50547f, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                this.D.a(canvas);
            }
            if (this.f50545c != null) {
                canvas.save();
                canvas.translate(this.f50546e, this.f50547f);
                g4.t(o50Var, canvas, this, 0);
                this.f50545c.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f50545c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.h(this.f50543a, this.f50544b, z2Var));
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Components.xi0 xi0Var = this.d;
        if (xi0Var != null) {
            View view = xi0Var.f56951a;
            int i13 = this.f50548n;
            view.layout(i13, this.f50549r, view.getMeasuredWidth() + i13, this.d.f56951a.getMeasuredHeight() + this.f50549r);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        o50 o50Var;
        TextPaint textPaint;
        o50 o50Var2;
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
        w3 w3Var = this.f50552x;
        int i17 = 1;
        if (w3Var != null) {
            this.f50545c = null;
            int i18 = w3Var.f50902j;
            o50 o50Var3 = this.f50543a;
            int i19 = 0;
            if (i18 == 0 && w3Var.f50898c.f51726f == 0) {
                o50Var3.getClass();
                i11 = org.telegram.messenger.g0.L(10);
            } else {
                i11 = 0;
            }
            this.f50547f = i11;
            this.h = 0;
            x3 x3Var = this.f50552x.f50898c;
            if (x3Var.d == size && x3Var.f51725e == org.telegram.messenger.iz.Z0) {
                o50Var = o50Var3;
            } else {
                x3Var.d = size;
                x3Var.f51725e = org.telegram.messenger.iz.Z0;
                x3Var.f51724c = 0;
                int size2 = x3Var.f51723b.size();
                boolean z9 = true;
                int i20 = 0;
                while (i20 < size2) {
                    w3 w3Var2 = (w3) this.f50552x.f50898c.f51723b.get(i20);
                    String str = w3Var2.f50900f;
                    if (str != null) {
                        if (w3Var2.f50896a && "•".equalsIgnoreCase(str)) {
                            w3Var2.f50901i = null;
                        } else {
                            String str2 = w3Var2.f50900f;
                            o50Var3.getClass();
                            o50 o50Var4 = o50Var3;
                            o50Var2 = o50Var4;
                            w3Var2.f50901i = g4.o(o50Var4, this, str2, null, size - org.telegram.messenger.g0.L(54), this.f50547f, this.f50552x, this.f50544b);
                            x3 x3Var2 = this.f50552x.f50898c;
                            x3Var2.f51724c = Math.max(x3Var2.f51724c, (int) Math.ceil(o4.d.getLineWidth(0)));
                            z9 = false;
                            i20++;
                            o50Var3 = o50Var2;
                        }
                    }
                    o50Var2 = o50Var3;
                    i20++;
                    o50Var3 = o50Var2;
                }
                o50Var = o50Var3;
                if (g4.f45809o1 != null && !z9) {
                    x3 x3Var3 = this.f50552x.f50898c;
                    x3Var3.f51724c = Math.max(x3Var3.f51724c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            w3 w3Var3 = this.f50552x;
            this.f50553y = !w3Var3.f50898c.f51722a.ordered;
            if (w3Var3.f50896a) {
                if (this.D == null) {
                    o50Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.D = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.k6.Vl, org.telegram.ui.ActionBar.k6.f28258z5, org.telegram.ui.ActionBar.k6.f27979k7);
                    this.D.d(10);
                    this.D.k(true);
                    this.D.i(org.telegram.messenger.g0.L(5.0f));
                }
                this.D.f(-1, this.f50552x.f50897b, false);
            } else {
                this.D = null;
            }
            int i21 = 26;
            e4 e4Var = this.f50544b;
            if (e4Var != null && e4Var.G) {
                o50Var.getClass();
                if (this.D == null) {
                    i21 = 0;
                }
                this.f50546e = org.telegram.messenger.g0.L(i21 + 18);
            } else {
                o50Var.getClass();
                if (this.D == null) {
                    i21 = 0;
                }
                int L3 = org.telegram.messenger.g0.L(i21 + 24);
                x3 x3Var4 = this.f50552x.f50898c;
                this.f50546e = org.telegram.messenger.k5.D(12.0f, x3Var4.f51726f, L3 + x3Var4.f51724c);
            }
            o50Var.getClass();
            float f10 = 18;
            int L4 = (size - org.telegram.messenger.g0.L(f10)) - this.f50546e;
            if (e4Var != null && e4Var.G) {
                int L5 = org.telegram.messenger.g0.L(6.0f);
                x3 x3Var5 = this.f50552x.f50898c;
                L4 -= (org.telegram.messenger.g0.L(12.0f) * x3Var5.f51726f) + (L5 + x3Var5.f51724c);
            }
            w3 w3Var4 = this.f50552x;
            int i22 = L4;
            TL_iv.RichText richText = w3Var4.f50899e;
            if (richText != null) {
                if (e4Var != null && e4Var.G) {
                    alignment = org.telegram.ui.Components.mu0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                z2 n10 = g4.n(this.f50543a, this, null, richText, i22, 0, w3Var4, alignment, 0, this.f50544b);
                this.f50545c = n10;
                if (n10 != null && n10.d.getLineCount() > 0) {
                    z2 z2Var3 = this.f50552x.f50901i;
                    if (z2Var3 != null && z2Var3.d.getLineCount() > 0) {
                        this.h = (org.telegram.messenger.g0.L(2.5f) + this.f50552x.f50901i.d.getLineAscent(0)) - this.f50545c.d.getLineAscent(0);
                    }
                    i12 = this.f50545c.d.getHeight();
                    L = org.telegram.messenger.g0.L(8);
                    i16 = L + i12;
                }
                i16 = 0;
            } else {
                TL_iv.PageBlock pageBlock = w3Var4.d;
                if (pageBlock != null) {
                    int i23 = this.f50546e;
                    this.f50548n = i23;
                    int i24 = this.f50547f;
                    this.f50549r = i24;
                    org.telegram.ui.Components.xi0 xi0Var = this.d;
                    if (xi0Var != null) {
                        View view = xi0Var.f56951a;
                        if (view instanceof z1) {
                            float f11 = 8;
                            this.f50549r = i24 - org.telegram.messenger.g0.L(f11);
                            if (e4Var == null || !e4Var.G) {
                                this.f50548n -= org.telegram.messenger.g0.L(f10);
                            }
                            int L6 = i22 + org.telegram.messenger.g0.L(f10);
                            i14 = 0 - org.telegram.messenger.g0.L(f11);
                            i13 = L6;
                        } else {
                            if (!(view instanceof t1) && !(view instanceof p2) && !(view instanceof t2) && !(view instanceof q2)) {
                                if (g4.J(pageBlock)) {
                                    this.f50548n = 0;
                                    this.f50549r = 0;
                                    this.f50547f = 0;
                                    w3 w3Var5 = this.f50552x;
                                    if (w3Var5.f50902j == 0 && w3Var5.f50898c.f51726f == 0) {
                                        i15 = 0 - org.telegram.messenger.g0.L(10);
                                    } else {
                                        i15 = 0;
                                    }
                                    i14 = i15 - org.telegram.messenger.g0.L(8);
                                    i13 = size;
                                } else if (this.d.f56951a instanceof s2) {
                                    this.f50548n -= org.telegram.messenger.g0.L(f10);
                                    L2 = org.telegram.messenger.g0.L(36);
                                } else {
                                    i13 = i22;
                                    i14 = 0;
                                }
                            } else {
                                if (e4Var == null || !e4Var.G) {
                                    this.f50548n = i23 - org.telegram.messenger.g0.L(f10);
                                }
                                L2 = org.telegram.messenger.g0.L(f10);
                            }
                            i13 = L2 + i22;
                            i14 = 0;
                        }
                        this.d.f56951a.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f56951a instanceof z1) && (z2Var = this.f50552x.f50901i) != null && z2Var.d.getLineCount() > 0 && (z2Var2 = (z1Var = (z1) this.d.f56951a).f52423c) != null && z2Var2.d.getLineCount() > 0) {
                            this.h = (org.telegram.messenger.g0.L(2.5f) + this.f50552x.f50901i.d.getLineAscent(0)) - z1Var.f52423c.d.getLineAscent(0);
                        }
                        w3 w3Var6 = this.f50552x;
                        if (w3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f50550s = true;
                            this.f50549r = 0;
                            if (w3Var6.f50902j == 0 && w3Var6.f50898c.f51726f == 0) {
                                i14 -= org.telegram.messenger.g0.L(10);
                            }
                            i14 -= org.telegram.messenger.g0.L(8);
                        } else {
                            View view2 = this.d.f56951a;
                            if (view2 instanceof y1) {
                                this.f50550s = ((y1) view2).f52047w;
                            } else if (view2 instanceof v1) {
                                this.f50550s = ((v1) view2).f50550s;
                            }
                        }
                        if (this.f50550s && this.f50552x.f50901i != null) {
                            this.f50547f = ((this.d.f56951a.getMeasuredHeight() - this.f50552x.f50901i.d.getHeight()) / 2) - org.telegram.messenger.g0.L(4.0f);
                            this.f50553y = false;
                        }
                        i12 = this.d.f56951a.getMeasuredHeight() + i14;
                    } else {
                        i12 = 0;
                    }
                    L = org.telegram.messenger.g0.L(8);
                    i16 = L + i12;
                }
                i16 = 0;
            }
            if (jg.g.i(1, this.f50552x.f50898c.f51723b) == this.f50552x) {
                i16 += org.telegram.messenger.g0.L(8);
            }
            w3 w3Var7 = this.f50552x;
            if (w3Var7.f50902j == 0 && w3Var7.f50898c.f51726f == 0) {
                i17 = org.telegram.messenger.g0.L(10) + i16;
            } else {
                i17 = i16;
            }
            z2 z2Var4 = this.f50545c;
            if (z2Var4 != null) {
                z2Var4.f52441s = this.f50546e;
                z2Var4.f52442w = this.f50547f;
            }
            org.telegram.ui.Components.xi0 xi0Var2 = this.d;
            if (xi0Var2 != null && (xi0Var2.f56951a instanceof org.telegram.ui.Cells.h9) && (i9Var = ((g4) o50Var).P0) != null) {
                ArrayList arrayList = i9Var.A0;
                arrayList.clear();
                ((org.telegram.ui.Cells.h9) this.d.f56951a).k(arrayList);
                int size3 = arrayList.size();
                while (i19 < size3) {
                    Object obj = arrayList.get(i19);
                    i19++;
                    org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) obj;
                    if (t9Var instanceof z2) {
                        z2 z2Var5 = (z2) t9Var;
                        z2Var5.f52441s += this.f50548n;
                        z2Var5.f52442w += this.f50549r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i17);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (g4.j(this.f50543a, this.f50544b, motionEvent, this, this.f50545c, this.f50546e, this.f50547f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(w3 w3Var) {
        w3 w3Var2 = this.f50552x;
        e4 e4Var = this.f50544b;
        if (w3Var2 != w3Var) {
            this.f50552x = w3Var;
            org.telegram.ui.Components.xi0 xi0Var = this.d;
            if (xi0Var != null) {
                removeView(xi0Var.f56951a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f50552x.d;
            if (pageBlock != null && e4Var != null) {
                int I = e4.I(pageBlock);
                this.f50551w = I;
                v4.d1 x10 = e4Var.x(this, I);
                this.d = (org.telegram.ui.Components.xi0) x10;
                addView(x10.f56951a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f50552x.d;
        if (pageBlock2 != null && e4Var != null) {
            e4Var.H(this.f50551w, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
