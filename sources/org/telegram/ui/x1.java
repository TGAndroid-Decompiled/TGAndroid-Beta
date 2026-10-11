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
public final class x1 extends ViewGroup implements org.telegram.ui.Cells.n9, d3 {
    public final t70 f43917a;
    public final f4 f43918b;
    public a3 f43919c;
    public org.telegram.ui.Components.cm0 d;
    public int f43920e;
    public int f43921f;
    public int h;
    public int f43922n;
    public int f43923r;
    public boolean f43924s;
    public int v;
    public x3 f43925w;
    public boolean f43926x;
    public CheckBoxBase f43927y;

    public x1(Context context, t70 t70Var, f4 f4Var) {
        super(context);
        this.f43917a = t70Var;
        this.f43918b = f4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        a3 a3Var;
        x3 x3Var = this.f43925w;
        if (x3Var != null) {
            a3Var = x3Var.f43961i;
        } else {
            a3Var = null;
        }
        if (a3Var == null) {
            return 0;
        }
        t70 t70Var = this.f43917a;
        f4 f4Var = this.f43918b;
        if (f4Var != null && f4Var.G) {
            int measuredWidth = getMeasuredWidth();
            t70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            y3 y3Var = this.f43925w.f43958c;
            return org.telegram.messenger.ai.B(12.0f, y3Var.f44246f, dp - y3Var.f44244c);
        }
        t70Var.getClass();
        return org.telegram.messenger.q.D(12.0f, this.f43925w.f43958c.f44246f, (AndroidUtilities.dp(15) + this.f43925w.f43958c.f44244c) - ((int) Math.ceil(a3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.cm0 cm0Var = this.d;
        if (cm0Var != null) {
            View view = cm0Var.f47748a;
            if (view instanceof org.telegram.ui.Cells.n9) {
                ((org.telegram.ui.Cells.n9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        a3 a3Var = this.f43919c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f43917a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f43927y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f43920e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        x3 x3Var = this.f43925w;
        if (x3Var != null && x3Var.f43961i != null) {
            i10 = Math.min(i10, (this.f43925w.f43961i.a() + a()) - dp);
        }
        a3 a3Var = this.f43919c;
        if (a3Var != null) {
            i10 = Math.min(i10, (a3Var.a() + a3Var.f35862s) - dp);
        }
        org.telegram.ui.Components.cm0 cm0Var = this.d;
        if (cm0Var != null) {
            View view = cm0Var.f47748a;
            if ((view instanceof d3) && (boundLeft = ((d3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f43922n + boundLeft);
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
        this.f43917a.getClass();
        int dp = AndroidUtilities.dp(18);
        x3 x3Var = this.f43925w;
        if (x3Var != null && x3Var.f43961i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f43925w.f43961i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        a3 a3Var = this.f43919c;
        if (a3Var != null) {
            i10 = Math.max(i10, a3Var.b() + a3Var.f35862s + dp);
        }
        org.telegram.ui.Components.cm0 cm0Var = this.d;
        if (cm0Var != null) {
            View view = cm0Var.f47748a;
            if ((view instanceof d3) && (boundRight = ((d3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f43922n + boundRight);
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
        a3 a3Var = this.f43919c;
        if (a3Var != null) {
            lastLineBoundRight = a3Var.c() + a3Var.f35862s;
            this.f43917a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.cm0 cm0Var = this.d;
            if (cm0Var != null) {
                View view = cm0Var.f47748a;
                if ((view instanceof d3) && (lastLineBoundRight = ((d3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f43922n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ai.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.cm0 cm0Var = this.d;
        if (cm0Var != null) {
            cm0Var.f47748a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f43919c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f43919c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        x3 x3Var;
        int i10;
        int i11;
        if (this.f43925w != null) {
            int measuredWidth = getMeasuredWidth();
            a3 a3Var = this.f43925w.f43961i;
            t70 t70Var = this.f43917a;
            if (a3Var != null) {
                canvas.save();
                f4 f4Var = this.f43918b;
                if (f4Var != null && f4Var.G) {
                    t70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    y3 y3Var = this.f43925w.f43958c;
                    float B = org.telegram.messenger.ai.B(12.0f, y3Var.f44246f, dp - y3Var.f44244c);
                    int i12 = this.f43921f + this.h;
                    if (this.f43926x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(B, i12 - i11);
                } else {
                    t70Var.getClass();
                    float D = org.telegram.messenger.q.D(12.0f, this.f43925w.f43958c.f44246f, (AndroidUtilities.dp(15) + this.f43925w.f43958c.f44244c) - ((int) Math.ceil(x3Var.f43961i.d.getLineWidth(0))));
                    int i13 = this.f43921f + this.h;
                    if (this.f43926x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f43925w.f43961i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f43927y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f43920e - AndroidUtilities.dp(26.0f), this.f43921f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f43927y.a(canvas);
            }
            if (this.f43919c != null) {
                canvas.save();
                canvas.translate(this.f43920e, this.f43921f);
                h4.v(t70Var, canvas, this, 0);
                this.f43919c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f43919c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.j(this.f43917a, this.f43918b, a3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.cm0 cm0Var = this.d;
        if (cm0Var != null) {
            View view = cm0Var.f47748a;
            int i14 = this.f43922n;
            view.layout(i14, this.f43923r, view.getMeasuredWidth() + i14, this.d.f47748a.getMeasuredHeight() + this.f43923r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        t70 t70Var;
        TextPaint textPaint;
        t70 t70Var2;
        a3 q6;
        int i13;
        int dp;
        int dp2;
        int i14;
        int i15;
        int i16;
        a3 a3Var;
        b2 b2Var;
        a3 a3Var2;
        int i17;
        org.telegram.ui.Cells.o9 o9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        x3 x3Var = this.f43925w;
        int i18 = 1;
        if (x3Var != null) {
            this.f43919c = null;
            int i19 = x3Var.f43962j;
            t70 t70Var3 = this.f43917a;
            int i20 = 0;
            if (i19 == 0 && x3Var.f43958c.f44246f == 0) {
                t70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f43921f = i12;
            this.h = 0;
            y3 y3Var = this.f43925w.f43958c;
            if (y3Var.d == size && y3Var.f44245e == SharedConfig.ivFontSize) {
                t70Var = t70Var3;
            } else {
                y3Var.d = size;
                y3Var.f44245e = SharedConfig.ivFontSize;
                y3Var.f44244c = 0;
                int size2 = y3Var.f44243b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    x3 x3Var2 = (x3) this.f43925w.f43958c.f44243b.get(i21);
                    String str = x3Var2.f43960f;
                    if (str != null) {
                        if (x3Var2.f43956a && "•".equalsIgnoreCase(str)) {
                            x3Var2.f43961i = null;
                        } else {
                            String str2 = x3Var2.f43960f;
                            t70Var3.getClass();
                            t70 t70Var4 = t70Var3;
                            t70Var2 = t70Var4;
                            x3Var2.f43961i = h4.q(t70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f43921f, this.f43925w, this.f43918b);
                            y3 y3Var2 = this.f43925w.f43958c;
                            y3Var2.f44244c = Math.max(y3Var2.f44244c, (int) Math.ceil(q6.d.getLineWidth(0)));
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
                if (h4.f38252n1 != null && !z10) {
                    y3 y3Var3 = this.f43925w.f43958c;
                    y3Var3.f44244c = Math.max(y3Var3.f44244c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            x3 x3Var3 = this.f43925w;
            this.f43926x = !x3Var3.f43958c.f44242a.ordered;
            if (x3Var3.f43956a) {
                if (this.f43927y == null) {
                    t70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f43927y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.h6.hl, org.telegram.ui.ActionBar.h6.f21188z5, org.telegram.ui.ActionBar.h6.f20915k7);
                    this.f43927y.d(10);
                    this.f43927y.k(true);
                    this.f43927y.i(AndroidUtilities.dp(5.0f));
                }
                this.f43927y.f(-1, this.f43925w.f43957b, false);
            } else {
                this.f43927y = null;
            }
            int i22 = 26;
            f4 f4Var = this.f43918b;
            if (f4Var != null && f4Var.G) {
                t70Var.getClass();
                if (this.f43927y == null) {
                    i22 = 0;
                }
                this.f43920e = AndroidUtilities.dp(i22 + 18);
            } else {
                t70Var.getClass();
                if (this.f43927y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                y3 y3Var4 = this.f43925w.f43958c;
                this.f43920e = org.telegram.messenger.q.D(12.0f, y3Var4.f44246f, dp3 + y3Var4.f44244c);
            }
            t70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.f43920e;
            if (f4Var != null && f4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                y3 y3Var5 = this.f43925w.f43958c;
                dp4 -= (AndroidUtilities.dp(12.0f) * y3Var5.f44246f) + (dp5 + y3Var5.f44244c);
            }
            x3 x3Var4 = this.f43925w;
            int i23 = dp4;
            TL_iv.RichText richText = x3Var4.f43959e;
            if (richText != null) {
                if (f4Var != null && f4Var.G) {
                    alignment = org.telegram.ui.Components.ox0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                a3 p5 = h4.p(this.f43917a, this, null, richText, i23, 0, x3Var4, alignment, 0, this.f43918b);
                this.f43919c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    a3 a3Var3 = this.f43925w.f43961i;
                    if (a3Var3 != null && a3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f43925w.f43961i.d.getLineAscent(0)) - this.f43919c.d.getLineAscent(0);
                    }
                    i13 = this.f43919c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = x3Var4.d;
                if (pageBlock != null) {
                    int i24 = this.f43920e;
                    this.f43922n = i24;
                    int i25 = this.f43921f;
                    this.f43923r = i25;
                    org.telegram.ui.Components.cm0 cm0Var = this.d;
                    if (cm0Var != null) {
                        View view = cm0Var.f47748a;
                        if (view instanceof b2) {
                            float f10 = 8;
                            this.f43923r = i25 - AndroidUtilities.dp(f10);
                            if (f4Var == null || !f4Var.G) {
                                this.f43922n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof v1) && !(view instanceof q2) && !(view instanceof u2) && !(view instanceof r2)) {
                                if (h4.L(pageBlock)) {
                                    this.f43922n = 0;
                                    this.f43923r = 0;
                                    this.f43921f = 0;
                                    x3 x3Var5 = this.f43925w;
                                    if (x3Var5.f43962j == 0 && x3Var5.f43958c.f44246f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f47748a instanceof t2) {
                                    this.f43922n -= AndroidUtilities.dp(f7);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (f4Var == null || !f4Var.G) {
                                    this.f43922n = i24 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f47748a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f47748a instanceof b2) && (a3Var = this.f43925w.f43961i) != null && a3Var.d.getLineCount() > 0 && (a3Var2 = (b2Var = (b2) this.d.f47748a).f36242c) != null && a3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f43925w.f43961i.d.getLineAscent(0)) - b2Var.f36242c.d.getLineAscent(0);
                        }
                        x3 x3Var6 = this.f43925w;
                        if (x3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f43924s = true;
                            this.f43923r = 0;
                            if (x3Var6.f43962j == 0 && x3Var6.f43958c.f44246f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f47748a;
                            if (view2 instanceof a2) {
                                this.f43924s = ((a2) view2).v;
                            } else if (view2 instanceof x1) {
                                this.f43924s = ((x1) view2).f43924s;
                            }
                        }
                        if (this.f43924s && this.f43925w.f43961i != null) {
                            this.f43921f = ((this.d.f47748a.getMeasuredHeight() - this.f43925w.f43961i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f43926x = false;
                        }
                        i13 = this.d.f47748a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (hg.c.g(1, this.f43925w.f43958c.f44243b) == this.f43925w) {
                i17 += AndroidUtilities.dp(8);
            }
            x3 x3Var7 = this.f43925w;
            if (x3Var7.f43962j == 0 && x3Var7.f43958c.f44246f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            a3 a3Var4 = this.f43919c;
            if (a3Var4 != null) {
                a3Var4.f35862s = this.f43920e;
                a3Var4.v = this.f43921f;
            }
            org.telegram.ui.Components.cm0 cm0Var2 = this.d;
            if (cm0Var2 != null && (cm0Var2.f47748a instanceof org.telegram.ui.Cells.n9) && (o9Var = ((h4) t70Var).O0) != null) {
                ArrayList arrayList = o9Var.A0;
                arrayList.clear();
                ((org.telegram.ui.Cells.n9) this.d.f47748a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) obj;
                    if (z9Var instanceof a3) {
                        a3 a3Var5 = (a3) z9Var;
                        a3Var5.f35862s += this.f43922n;
                        a3Var5.v += this.f43923r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (h4.l(this.f43917a, this.f43918b, motionEvent, this, this.f43919c, this.f43920e, this.f43921f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(x3 x3Var) {
        x3 x3Var2 = this.f43925w;
        f4 f4Var = this.f43918b;
        if (x3Var2 != x3Var) {
            this.f43925w = x3Var;
            org.telegram.ui.Components.cm0 cm0Var = this.d;
            if (cm0Var != null) {
                removeView(cm0Var.f47748a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f43925w.d;
            if (pageBlock != null && f4Var != null) {
                int I = f4.I(pageBlock);
                this.v = I;
                s4.d1 x10 = f4Var.x(this, I);
                this.d = (org.telegram.ui.Components.cm0) x10;
                addView(x10.f47748a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f43925w.d;
        if (pageBlock2 != null && f4Var != null) {
            f4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
