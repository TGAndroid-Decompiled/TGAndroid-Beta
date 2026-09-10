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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
public final class z1 extends ViewGroup implements org.telegram.ui.Cells.r9, f3 {
    public final t70 f39149a;
    public final h4 f39150b;
    public c3 f39151c;
    public org.telegram.ui.Components.fl0 d;
    public int e;
    public int f39152f;
    public int h;
    public int f39153n;
    public int f39154r;
    public boolean f39155s;
    public int v;
    public z3 f39156w;
    public boolean f39157x;
    public CheckBoxBase f39158y;

    public z1(Context context, t70 t70Var, h4 h4Var) {
        super(context);
        this.f39149a = t70Var;
        this.f39150b = h4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        c3 c3Var;
        z3 z3Var = this.f39156w;
        if (z3Var != null) {
            c3Var = z3Var.f39199i;
        } else {
            c3Var = null;
        }
        if (c3Var == null) {
            return 0;
        }
        t70 t70Var = this.f39149a;
        h4 h4Var = this.f39150b;
        if (h4Var != null && h4Var.G) {
            int measuredWidth = getMeasuredWidth();
            t70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            a4 a4Var = this.f39156w.f39197c;
            return org.telegram.messenger.em.A(12.0f, a4Var.f30796f, dp - a4Var.f30795c);
        }
        t70Var.getClass();
        return org.telegram.messenger.a2.D(12.0f, this.f39156w.f39197c.f30796f, (AndroidUtilities.dp(15) + this.f39156w.f39197c.f30795c) - ((int) Math.ceil(c3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            View view = fl0Var.f41610a;
            if (view instanceof org.telegram.ui.Cells.r9) {
                ((org.telegram.ui.Cells.r9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        c3 c3Var = this.f39151c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f39149a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f39158y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        z3 z3Var = this.f39156w;
        if (z3Var != null && z3Var.f39199i != null) {
            i10 = Math.min(i10, (this.f39156w.f39199i.a() + a()) - dp);
        }
        c3 c3Var = this.f39151c;
        if (c3Var != null) {
            i10 = Math.min(i10, (c3Var.a() + c3Var.f31515s) - dp);
        }
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            View view = fl0Var.f41610a;
            if ((view instanceof f3) && (boundLeft = ((f3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f39153n + boundLeft);
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
        this.f39149a.getClass();
        int dp = AndroidUtilities.dp(18);
        z3 z3Var = this.f39156w;
        if (z3Var != null && z3Var.f39199i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f39156w.f39199i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        c3 c3Var = this.f39151c;
        if (c3Var != null) {
            i10 = Math.max(i10, c3Var.b() + c3Var.f31515s + dp);
        }
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            View view = fl0Var.f41610a;
            if ((view instanceof f3) && (boundRight = ((f3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f39153n + boundRight);
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
        c3 c3Var = this.f39151c;
        if (c3Var != null) {
            lastLineBoundRight = c3Var.c() + c3Var.f31515s;
            this.f39149a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.fl0 fl0Var = this.d;
            if (fl0Var != null) {
                View view = fl0Var.f41610a;
                if ((view instanceof f3) && (lastLineBoundRight = ((f3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f39153n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.em.b(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            fl0Var.f41610a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f39151c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f39151c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        z3 z3Var;
        int i10;
        int i11;
        if (this.f39156w != null) {
            int measuredWidth = getMeasuredWidth();
            c3 c3Var = this.f39156w.f39199i;
            t70 t70Var = this.f39149a;
            if (c3Var != null) {
                canvas.save();
                h4 h4Var = this.f39150b;
                if (h4Var != null && h4Var.G) {
                    t70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    a4 a4Var = this.f39156w.f39197c;
                    float A = org.telegram.messenger.em.A(12.0f, a4Var.f30796f, dp - a4Var.f30795c);
                    int i12 = this.f39152f + this.h;
                    if (this.f39157x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(A, i12 - i11);
                } else {
                    t70Var.getClass();
                    float D = org.telegram.messenger.a2.D(12.0f, this.f39156w.f39197c.f30796f, (AndroidUtilities.dp(15) + this.f39156w.f39197c.f30795c) - ((int) Math.ceil(z3Var.f39199i.d.getLineWidth(0))));
                    int i13 = this.f39152f + this.h;
                    if (this.f39157x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f39156w.f39199i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f39158y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f39152f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f39158y.a(canvas);
            }
            if (this.f39151c != null) {
                canvas.save();
                canvas.translate(this.e, this.f39152f);
                j4.v(t70Var, canvas, this, 0);
                this.f39151c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        c3 c3Var = this.f39151c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.j(this.f39149a, this.f39150b, c3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            View view = fl0Var.f41610a;
            int i14 = this.f39153n;
            view.layout(i14, this.f39154r, view.getMeasuredWidth() + i14, this.d.f41610a.getMeasuredHeight() + this.f39154r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        t70 t70Var;
        TextPaint textPaint;
        t70 t70Var2;
        c3 q6;
        int i13;
        int dp;
        int dp2;
        int i14;
        int i15;
        int i16;
        c3 c3Var;
        d2 d2Var;
        c3 c3Var2;
        int i17;
        org.telegram.ui.Cells.s9 s9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        z3 z3Var = this.f39156w;
        int i18 = 1;
        if (z3Var != null) {
            this.f39151c = null;
            int i19 = z3Var.f39200j;
            t70 t70Var3 = this.f39149a;
            int i20 = 0;
            if (i19 == 0 && z3Var.f39197c.f30796f == 0) {
                t70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f39152f = i12;
            this.h = 0;
            a4 a4Var = this.f39156w.f39197c;
            if (a4Var.d == size && a4Var.e == SharedConfig.ivFontSize) {
                t70Var = t70Var3;
            } else {
                a4Var.d = size;
                a4Var.e = SharedConfig.ivFontSize;
                a4Var.f30795c = 0;
                int size2 = a4Var.f30794b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    z3 z3Var2 = (z3) this.f39156w.f39197c.f30794b.get(i21);
                    String str = z3Var2.f39198f;
                    if (str != null) {
                        if (z3Var2.f39195a && "•".equalsIgnoreCase(str)) {
                            z3Var2.f39199i = null;
                        } else {
                            String str2 = z3Var2.f39198f;
                            t70Var3.getClass();
                            t70 t70Var4 = t70Var3;
                            t70Var2 = t70Var4;
                            z3Var2.f39199i = j4.q(t70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f39152f, this.f39156w, this.f39150b);
                            a4 a4Var2 = this.f39156w.f39197c;
                            a4Var2.f30795c = Math.max(a4Var2.f30795c, (int) Math.ceil(q6.d.getLineWidth(0)));
                            z10 = false;
                            i21++;
                            t70Var3 = t70Var2;
                        }
                    }
                    t70Var2 = t70Var3;
                    i21++;
                    t70Var3 = t70Var2;
                }
                t70Var = t70Var3;
                if (j4.f33887n1 != null && !z10) {
                    a4 a4Var3 = this.f39156w.f39197c;
                    a4Var3.f30795c = Math.max(a4Var3.f30795c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            z3 z3Var3 = this.f39156w;
            this.f39157x = !z3Var3.f39197c.f30793a.ordered;
            if (z3Var3.f39195a) {
                if (this.f39158y == null) {
                    t70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f39158y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.j6.hl, org.telegram.ui.ActionBar.j6.f18324z5, org.telegram.ui.ActionBar.j6.f18056k7);
                    this.f39158y.d(10);
                    this.f39158y.k(true);
                    this.f39158y.i(AndroidUtilities.dp(5.0f));
                }
                this.f39158y.f(-1, this.f39156w.f39196b, false);
            } else {
                this.f39158y = null;
            }
            int i22 = 26;
            h4 h4Var = this.f39150b;
            if (h4Var != null && h4Var.G) {
                t70Var.getClass();
                if (this.f39158y == null) {
                    i22 = 0;
                }
                this.e = AndroidUtilities.dp(i22 + 18);
            } else {
                t70Var.getClass();
                if (this.f39158y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                a4 a4Var4 = this.f39156w.f39197c;
                this.e = org.telegram.messenger.a2.D(12.0f, a4Var4.f30796f, dp3 + a4Var4.f30795c);
            }
            t70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.e;
            if (h4Var != null && h4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                a4 a4Var5 = this.f39156w.f39197c;
                dp4 -= (AndroidUtilities.dp(12.0f) * a4Var5.f30796f) + (dp5 + a4Var5.f30795c);
            }
            z3 z3Var4 = this.f39156w;
            int i23 = dp4;
            TL_iv.RichText richText = z3Var4.e;
            if (richText != null) {
                if (h4Var != null && h4Var.G) {
                    alignment = org.telegram.ui.Components.uw0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                c3 p5 = j4.p(this.f39149a, this, null, richText, i23, 0, z3Var4, alignment, 0, this.f39150b);
                this.f39151c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    c3 c3Var3 = this.f39156w.f39199i;
                    if (c3Var3 != null && c3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f39156w.f39199i.d.getLineAscent(0)) - this.f39151c.d.getLineAscent(0);
                    }
                    i13 = this.f39151c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = z3Var4.d;
                if (pageBlock != null) {
                    int i24 = this.e;
                    this.f39153n = i24;
                    int i25 = this.f39152f;
                    this.f39154r = i25;
                    org.telegram.ui.Components.fl0 fl0Var = this.d;
                    if (fl0Var != null) {
                        View view = fl0Var.f41610a;
                        if (view instanceof d2) {
                            float f10 = 8;
                            this.f39154r = i25 - AndroidUtilities.dp(f10);
                            if (h4Var == null || !h4Var.G) {
                                this.f39153n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof x1) && !(view instanceof s2) && !(view instanceof w2) && !(view instanceof t2)) {
                                if (j4.L(pageBlock)) {
                                    this.f39153n = 0;
                                    this.f39154r = 0;
                                    this.f39152f = 0;
                                    z3 z3Var5 = this.f39156w;
                                    if (z3Var5.f39200j == 0 && z3Var5.f39197c.f30796f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f41610a instanceof v2) {
                                    this.f39153n -= AndroidUtilities.dp(f7);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (h4Var == null || !h4Var.G) {
                                    this.f39153n = i24 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f41610a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f41610a instanceof d2) && (c3Var = this.f39156w.f39199i) != null && c3Var.d.getLineCount() > 0 && (c3Var2 = (d2Var = (d2) this.d.f41610a).f31808c) != null && c3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f39156w.f39199i.d.getLineAscent(0)) - d2Var.f31808c.d.getLineAscent(0);
                        }
                        z3 z3Var6 = this.f39156w;
                        if (z3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f39155s = true;
                            this.f39154r = 0;
                            if (z3Var6.f39200j == 0 && z3Var6.f39197c.f30796f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f41610a;
                            if (view2 instanceof c2) {
                                this.f39155s = ((c2) view2).v;
                            } else if (view2 instanceof z1) {
                                this.f39155s = ((z1) view2).f39155s;
                            }
                        }
                        if (this.f39155s && this.f39156w.f39199i != null) {
                            this.f39152f = ((this.d.f41610a.getMeasuredHeight() - this.f39156w.f39199i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f39157x = false;
                        }
                        i13 = this.d.f41610a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (hc.b.i(1, this.f39156w.f39197c.f30794b) == this.f39156w) {
                i17 += AndroidUtilities.dp(8);
            }
            z3 z3Var7 = this.f39156w;
            if (z3Var7.f39200j == 0 && z3Var7.f39197c.f30796f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            c3 c3Var4 = this.f39151c;
            if (c3Var4 != null) {
                c3Var4.f31515s = this.e;
                c3Var4.v = this.f39152f;
            }
            org.telegram.ui.Components.fl0 fl0Var2 = this.d;
            if (fl0Var2 != null && (fl0Var2.f41610a instanceof org.telegram.ui.Cells.r9) && (s9Var = ((j4) t70Var).O0) != null) {
                ArrayList arrayList = s9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.r9) this.d.f41610a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.da daVar = (org.telegram.ui.Cells.da) obj;
                    if (daVar instanceof c3) {
                        c3 c3Var5 = (c3) daVar;
                        c3Var5.f31515s += this.f39153n;
                        c3Var5.v += this.f39154r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (j4.l(this.f39149a, this.f39150b, motionEvent, this, this.f39151c, this.e, this.f39152f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(z3 z3Var) {
        z3 z3Var2 = this.f39156w;
        h4 h4Var = this.f39150b;
        if (z3Var2 != z3Var) {
            this.f39156w = z3Var;
            org.telegram.ui.Components.fl0 fl0Var = this.d;
            if (fl0Var != null) {
                removeView(fl0Var.f41610a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f39156w.d;
            if (pageBlock != null && h4Var != null) {
                int I = h4.I(pageBlock);
                this.v = I;
                s4.c1 x10 = h4Var.x(this, I);
                this.d = (org.telegram.ui.Components.fl0) x10;
                addView(x10.f41610a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f39156w.d;
        if (pageBlock2 != null && h4Var != null) {
            h4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
