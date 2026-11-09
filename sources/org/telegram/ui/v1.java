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
    public final q50 f50531a;
    public final e4 f50532b;
    public z2 f50533c;
    public org.telegram.ui.Components.yi0 d;
    public int f50534e;
    public int f50535f;
    public int h;
    public int f50536n;
    public int f50537r;
    public boolean f50538s;
    public int f50539w;
    public w3 f50540x;
    public boolean f50541y;

    public v1(Context context, q50 q50Var, e4 e4Var) {
        super(context);
        this.f50531a = q50Var;
        this.f50532b = e4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        z2 z2Var;
        w3 w3Var = this.f50540x;
        if (w3Var != null) {
            z2Var = w3Var.f50844i;
        } else {
            z2Var = null;
        }
        if (z2Var == null) {
            return 0;
        }
        q50 q50Var = this.f50531a;
        e4 e4Var = this.f50532b;
        if (e4Var != null && e4Var.G) {
            int measuredWidth = getMeasuredWidth();
            q50Var.getClass();
            int L = measuredWidth - org.telegram.messenger.g0.L(15);
            x3 x3Var = this.f50540x.f50841c;
            return org.telegram.messenger.camera.q.A(12.0f, x3Var.f51536f, L - x3Var.f51534c);
        }
        q50Var.getClass();
        return org.telegram.messenger.k5.D(12.0f, this.f50540x.f50841c.f51536f, (org.telegram.messenger.g0.L(15) + this.f50540x.f50841c.f51534c) - ((int) Math.ceil(z2Var.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i7;
        int boundLeft;
        this.f50531a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        if (this.D != null) {
            i7 = Math.min(Integer.MAX_VALUE, (this.f50534e - org.telegram.messenger.g0.L(26.0f)) - L);
        } else {
            i7 = Integer.MAX_VALUE;
        }
        w3 w3Var = this.f50540x;
        if (w3Var != null && w3Var.f50844i != null) {
            i7 = Math.min(i7, (this.f50540x.f50844i.k() + a()) - L);
        }
        z2 z2Var = this.f50533c;
        if (z2Var != null) {
            i7 = Math.min(i7, (z2Var.k() + z2Var.f52397s) - L);
        }
        org.telegram.ui.Components.yi0 yi0Var = this.d;
        if (yi0Var != null) {
            View view = yi0Var.f57056a;
            if ((view instanceof c3) && (boundLeft = ((c3) view).getBoundLeft()) != -1) {
                i7 = Math.min(i7, this.f50536n + boundLeft);
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
        this.f50531a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        w3 w3Var = this.f50540x;
        if (w3Var != null && w3Var.f50844i != null) {
            i7 = Math.max(Integer.MIN_VALUE, this.f50540x.f50844i.l() + a() + L);
        } else {
            i7 = Integer.MIN_VALUE;
        }
        z2 z2Var = this.f50533c;
        if (z2Var != null) {
            i7 = Math.max(i7, z2Var.l() + z2Var.f52397s + L);
        }
        org.telegram.ui.Components.yi0 yi0Var = this.d;
        if (yi0Var != null) {
            View view = yi0Var.f57056a;
            if ((view instanceof c3) && (boundRight = ((c3) view).getBoundRight()) != -1) {
                i7 = Math.max(i7, this.f50536n + boundRight);
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
        z2 z2Var = this.f50533c;
        if (z2Var != null) {
            lastLineBoundRight = z2Var.m() + z2Var.f52397s;
            this.f50531a.getClass();
            i7 = org.telegram.messenger.g0.L(18);
        } else {
            org.telegram.ui.Components.yi0 yi0Var = this.d;
            if (yi0Var != null) {
                View view = yi0Var.f57056a;
                if ((view instanceof c3) && (lastLineBoundRight = ((c3) view).getLastLineBoundRight()) != -1) {
                    i7 = this.f50536n;
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
        org.telegram.ui.Components.yi0 yi0Var = this.d;
        if (yi0Var != null) {
            yi0Var.f57056a.invalidate();
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        org.telegram.ui.Components.yi0 yi0Var = this.d;
        if (yi0Var != null) {
            View view = yi0Var.f57056a;
            if (view instanceof org.telegram.ui.Cells.h9) {
                ((org.telegram.ui.Cells.h9) view).k(arrayList);
            }
        }
        z2 z2Var = this.f50533c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f50533c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f50533c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        w3 w3Var;
        int i7;
        int i10;
        if (this.f50540x != null) {
            int measuredWidth = getMeasuredWidth();
            z2 z2Var = this.f50540x.f50844i;
            q50 q50Var = this.f50531a;
            if (z2Var != null) {
                canvas.save();
                e4 e4Var = this.f50532b;
                if (e4Var != null && e4Var.G) {
                    q50Var.getClass();
                    int L = measuredWidth - org.telegram.messenger.g0.L(15);
                    x3 x3Var = this.f50540x.f50841c;
                    float A = org.telegram.messenger.camera.q.A(12.0f, x3Var.f51536f, L - x3Var.f51534c);
                    int i11 = this.f50535f + this.h;
                    if (this.f50541y) {
                        i10 = org.telegram.messenger.g0.L(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(A, i11 - i10);
                } else {
                    q50Var.getClass();
                    float D = org.telegram.messenger.k5.D(12.0f, this.f50540x.f50841c.f51536f, (org.telegram.messenger.g0.L(15) + this.f50540x.f50841c.f51534c) - ((int) Math.ceil(w3Var.f50844i.d.getLineWidth(0))));
                    int i12 = this.f50535f + this.h;
                    if (this.f50541y) {
                        i7 = org.telegram.messenger.g0.L(1.0f);
                    } else {
                        i7 = 0;
                    }
                    canvas.translate(D, i12 - i7);
                }
                this.f50540x.f50844i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.D;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f50534e - org.telegram.messenger.g0.L(26.0f), this.f50535f, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                this.D.a(canvas);
            }
            if (this.f50533c != null) {
                canvas.save();
                canvas.translate(this.f50534e, this.f50535f);
                g4.t(q50Var, canvas, this, 0);
                this.f50533c.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f50533c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.h(this.f50531a, this.f50532b, z2Var));
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Components.yi0 yi0Var = this.d;
        if (yi0Var != null) {
            View view = yi0Var.f57056a;
            int i13 = this.f50536n;
            view.layout(i13, this.f50537r, view.getMeasuredWidth() + i13, this.d.f57056a.getMeasuredHeight() + this.f50537r);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        q50 q50Var;
        TextPaint textPaint;
        q50 q50Var2;
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
        w3 w3Var = this.f50540x;
        int i17 = 1;
        if (w3Var != null) {
            this.f50533c = null;
            int i18 = w3Var.f50845j;
            q50 q50Var3 = this.f50531a;
            int i19 = 0;
            if (i18 == 0 && w3Var.f50841c.f51536f == 0) {
                q50Var3.getClass();
                i11 = org.telegram.messenger.g0.L(10);
            } else {
                i11 = 0;
            }
            this.f50535f = i11;
            this.h = 0;
            x3 x3Var = this.f50540x.f50841c;
            if (x3Var.d == size && x3Var.f51535e == org.telegram.messenger.iz.Z0) {
                q50Var = q50Var3;
            } else {
                x3Var.d = size;
                x3Var.f51535e = org.telegram.messenger.iz.Z0;
                x3Var.f51534c = 0;
                int size2 = x3Var.f51533b.size();
                boolean z9 = true;
                int i20 = 0;
                while (i20 < size2) {
                    w3 w3Var2 = (w3) this.f50540x.f50841c.f51533b.get(i20);
                    String str = w3Var2.f50843f;
                    if (str != null) {
                        if (w3Var2.f50839a && "•".equalsIgnoreCase(str)) {
                            w3Var2.f50844i = null;
                        } else {
                            String str2 = w3Var2.f50843f;
                            q50Var3.getClass();
                            q50 q50Var4 = q50Var3;
                            q50Var2 = q50Var4;
                            w3Var2.f50844i = g4.o(q50Var4, this, str2, null, size - org.telegram.messenger.g0.L(54), this.f50535f, this.f50540x, this.f50532b);
                            x3 x3Var2 = this.f50540x.f50841c;
                            x3Var2.f51534c = Math.max(x3Var2.f51534c, (int) Math.ceil(o4.d.getLineWidth(0)));
                            z9 = false;
                            i20++;
                            q50Var3 = q50Var2;
                        }
                    }
                    q50Var2 = q50Var3;
                    i20++;
                    q50Var3 = q50Var2;
                }
                q50Var = q50Var3;
                if (g4.f45869o1 != null && !z9) {
                    x3 x3Var3 = this.f50540x.f50841c;
                    x3Var3.f51534c = Math.max(x3Var3.f51534c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            w3 w3Var3 = this.f50540x;
            this.f50541y = !w3Var3.f50841c.f51532a.ordered;
            if (w3Var3.f50839a) {
                if (this.D == null) {
                    q50Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.D = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.l6.Vl, org.telegram.ui.ActionBar.l6.f28274z5, org.telegram.ui.ActionBar.l6.f27995k7);
                    this.D.d(10);
                    this.D.k(true);
                    this.D.i(org.telegram.messenger.g0.L(5.0f));
                }
                this.D.f(-1, this.f50540x.f50840b, false);
            } else {
                this.D = null;
            }
            int i21 = 26;
            e4 e4Var = this.f50532b;
            if (e4Var != null && e4Var.G) {
                q50Var.getClass();
                if (this.D == null) {
                    i21 = 0;
                }
                this.f50534e = org.telegram.messenger.g0.L(i21 + 18);
            } else {
                q50Var.getClass();
                if (this.D == null) {
                    i21 = 0;
                }
                int L3 = org.telegram.messenger.g0.L(i21 + 24);
                x3 x3Var4 = this.f50540x.f50841c;
                this.f50534e = org.telegram.messenger.k5.D(12.0f, x3Var4.f51536f, L3 + x3Var4.f51534c);
            }
            q50Var.getClass();
            float f10 = 18;
            int L4 = (size - org.telegram.messenger.g0.L(f10)) - this.f50534e;
            if (e4Var != null && e4Var.G) {
                int L5 = org.telegram.messenger.g0.L(6.0f);
                x3 x3Var5 = this.f50540x.f50841c;
                L4 -= (org.telegram.messenger.g0.L(12.0f) * x3Var5.f51536f) + (L5 + x3Var5.f51534c);
            }
            w3 w3Var4 = this.f50540x;
            int i22 = L4;
            TL_iv.RichText richText = w3Var4.f50842e;
            if (richText != null) {
                if (e4Var != null && e4Var.G) {
                    alignment = org.telegram.ui.Components.ou0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                z2 n10 = g4.n(this.f50531a, this, null, richText, i22, 0, w3Var4, alignment, 0, this.f50532b);
                this.f50533c = n10;
                if (n10 != null && n10.d.getLineCount() > 0) {
                    z2 z2Var3 = this.f50540x.f50844i;
                    if (z2Var3 != null && z2Var3.d.getLineCount() > 0) {
                        this.h = (org.telegram.messenger.g0.L(2.5f) + this.f50540x.f50844i.d.getLineAscent(0)) - this.f50533c.d.getLineAscent(0);
                    }
                    i12 = this.f50533c.d.getHeight();
                    L = org.telegram.messenger.g0.L(8);
                    i16 = L + i12;
                }
                i16 = 0;
            } else {
                TL_iv.PageBlock pageBlock = w3Var4.d;
                if (pageBlock != null) {
                    int i23 = this.f50534e;
                    this.f50536n = i23;
                    int i24 = this.f50535f;
                    this.f50537r = i24;
                    org.telegram.ui.Components.yi0 yi0Var = this.d;
                    if (yi0Var != null) {
                        View view = yi0Var.f57056a;
                        if (view instanceof z1) {
                            float f11 = 8;
                            this.f50537r = i24 - org.telegram.messenger.g0.L(f11);
                            if (e4Var == null || !e4Var.G) {
                                this.f50536n -= org.telegram.messenger.g0.L(f10);
                            }
                            int L6 = i22 + org.telegram.messenger.g0.L(f10);
                            i14 = 0 - org.telegram.messenger.g0.L(f11);
                            i13 = L6;
                        } else {
                            if (!(view instanceof t1) && !(view instanceof p2) && !(view instanceof t2) && !(view instanceof q2)) {
                                if (g4.J(pageBlock)) {
                                    this.f50536n = 0;
                                    this.f50537r = 0;
                                    this.f50535f = 0;
                                    w3 w3Var5 = this.f50540x;
                                    if (w3Var5.f50845j == 0 && w3Var5.f50841c.f51536f == 0) {
                                        i15 = 0 - org.telegram.messenger.g0.L(10);
                                    } else {
                                        i15 = 0;
                                    }
                                    i14 = i15 - org.telegram.messenger.g0.L(8);
                                    i13 = size;
                                } else if (this.d.f57056a instanceof s2) {
                                    this.f50536n -= org.telegram.messenger.g0.L(f10);
                                    L2 = org.telegram.messenger.g0.L(36);
                                } else {
                                    i13 = i22;
                                    i14 = 0;
                                }
                            } else {
                                if (e4Var == null || !e4Var.G) {
                                    this.f50536n = i23 - org.telegram.messenger.g0.L(f10);
                                }
                                L2 = org.telegram.messenger.g0.L(f10);
                            }
                            i13 = L2 + i22;
                            i14 = 0;
                        }
                        this.d.f57056a.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f57056a instanceof z1) && (z2Var = this.f50540x.f50844i) != null && z2Var.d.getLineCount() > 0 && (z2Var2 = (z1Var = (z1) this.d.f57056a).f52385c) != null && z2Var2.d.getLineCount() > 0) {
                            this.h = (org.telegram.messenger.g0.L(2.5f) + this.f50540x.f50844i.d.getLineAscent(0)) - z1Var.f52385c.d.getLineAscent(0);
                        }
                        w3 w3Var6 = this.f50540x;
                        if (w3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f50538s = true;
                            this.f50537r = 0;
                            if (w3Var6.f50845j == 0 && w3Var6.f50841c.f51536f == 0) {
                                i14 -= org.telegram.messenger.g0.L(10);
                            }
                            i14 -= org.telegram.messenger.g0.L(8);
                        } else {
                            View view2 = this.d.f57056a;
                            if (view2 instanceof y1) {
                                this.f50538s = ((y1) view2).f51820w;
                            } else if (view2 instanceof v1) {
                                this.f50538s = ((v1) view2).f50538s;
                            }
                        }
                        if (this.f50538s && this.f50540x.f50844i != null) {
                            this.f50535f = ((this.d.f57056a.getMeasuredHeight() - this.f50540x.f50844i.d.getHeight()) / 2) - org.telegram.messenger.g0.L(4.0f);
                            this.f50541y = false;
                        }
                        i12 = this.d.f57056a.getMeasuredHeight() + i14;
                    } else {
                        i12 = 0;
                    }
                    L = org.telegram.messenger.g0.L(8);
                    i16 = L + i12;
                }
                i16 = 0;
            }
            if (jg.g.i(1, this.f50540x.f50841c.f51533b) == this.f50540x) {
                i16 += org.telegram.messenger.g0.L(8);
            }
            w3 w3Var7 = this.f50540x;
            if (w3Var7.f50845j == 0 && w3Var7.f50841c.f51536f == 0) {
                i17 = org.telegram.messenger.g0.L(10) + i16;
            } else {
                i17 = i16;
            }
            z2 z2Var4 = this.f50533c;
            if (z2Var4 != null) {
                z2Var4.f52397s = this.f50534e;
                z2Var4.f52398w = this.f50535f;
            }
            org.telegram.ui.Components.yi0 yi0Var2 = this.d;
            if (yi0Var2 != null && (yi0Var2.f57056a instanceof org.telegram.ui.Cells.h9) && (i9Var = ((g4) q50Var).P0) != null) {
                ArrayList arrayList = i9Var.A0;
                arrayList.clear();
                ((org.telegram.ui.Cells.h9) this.d.f57056a).k(arrayList);
                int size3 = arrayList.size();
                while (i19 < size3) {
                    Object obj = arrayList.get(i19);
                    i19++;
                    org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) obj;
                    if (t9Var instanceof z2) {
                        z2 z2Var5 = (z2) t9Var;
                        z2Var5.f52397s += this.f50536n;
                        z2Var5.f52398w += this.f50537r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i17);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (g4.j(this.f50531a, this.f50532b, motionEvent, this, this.f50533c, this.f50534e, this.f50535f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(w3 w3Var) {
        w3 w3Var2 = this.f50540x;
        e4 e4Var = this.f50532b;
        if (w3Var2 != w3Var) {
            this.f50540x = w3Var;
            org.telegram.ui.Components.yi0 yi0Var = this.d;
            if (yi0Var != null) {
                removeView(yi0Var.f57056a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f50540x.d;
            if (pageBlock != null && e4Var != null) {
                int I = e4.I(pageBlock);
                this.f50539w = I;
                v4.d1 x10 = e4Var.x(this, I);
                this.d = (org.telegram.ui.Components.yi0) x10;
                addView(x10.f57056a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f50540x.d;
        if (pageBlock2 != null && e4Var != null) {
            e4Var.H(this.f50539w, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
