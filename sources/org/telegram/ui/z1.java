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
public final class z1 extends ViewGroup implements org.telegram.ui.Cells.l9, g3 {
    public final o70 f43754a;
    public final j4 f43755b;
    public d3 f43756c;
    public org.telegram.ui.Components.el0 d;
    public int f43757e;
    public int f43758f;
    public int h;
    public int f43759n;
    public int f43760r;
    public boolean f43761s;
    public int v;
    public b4 f43762w;
    public boolean f43763x;
    public CheckBoxBase f43764y;

    public z1(Context context, o70 o70Var, j4 j4Var) {
        super(context);
        this.f43754a = o70Var;
        this.f43755b = j4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        d3 d3Var;
        b4 b4Var = this.f43762w;
        if (b4Var != null) {
            d3Var = b4Var.f35347i;
        } else {
            d3Var = null;
        }
        if (d3Var == null) {
            return 0;
        }
        o70 o70Var = this.f43754a;
        j4 j4Var = this.f43755b;
        if (j4Var != null && j4Var.D) {
            int measuredWidth = getMeasuredWidth();
            o70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            c4 c4Var = this.f43762w.f35344c;
            return b.z(12.0f, c4Var.f35682f, dp - c4Var.f35680c);
        }
        o70Var.getClass();
        return org.telegram.messenger.y3.D(12.0f, this.f43762w.f35344c.f35682f, (AndroidUtilities.dp(15) + this.f43762w.f35344c.f35680c) - ((int) Math.ceil(d3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            View view = el0Var.f5875a;
            if (view instanceof org.telegram.ui.Cells.l9) {
                ((org.telegram.ui.Cells.l9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        d3 d3Var = this.f43756c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f43754a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f43764y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f43757e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        b4 b4Var = this.f43762w;
        if (b4Var != null && b4Var.f35347i != null) {
            i10 = Math.min(i10, (this.f43762w.f35347i.a() + a()) - dp);
        }
        d3 d3Var = this.f43756c;
        if (d3Var != null) {
            i10 = Math.min(i10, (d3Var.a() + d3Var.f35964s) - dp);
        }
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            View view = el0Var.f5875a;
            if ((view instanceof g3) && (boundLeft = ((g3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f43759n + boundLeft);
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
        this.f43754a.getClass();
        int dp = AndroidUtilities.dp(18);
        b4 b4Var = this.f43762w;
        if (b4Var != null && b4Var.f35347i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f43762w.f35347i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        d3 d3Var = this.f43756c;
        if (d3Var != null) {
            i10 = Math.max(i10, d3Var.b() + d3Var.f35964s + dp);
        }
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            View view = el0Var.f5875a;
            if ((view instanceof g3) && (boundRight = ((g3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f43759n + boundRight);
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
        d3 d3Var = this.f43756c;
        if (d3Var != null) {
            lastLineBoundRight = d3Var.c() + d3Var.f35964s;
            this.f43754a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.el0 el0Var = this.d;
            if (el0Var != null) {
                View view = el0Var.f5875a;
                if ((view instanceof g3) && (lastLineBoundRight = ((g3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f43759n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            el0Var.f5875a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f43756c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f43756c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        b4 b4Var;
        int i10;
        int i11;
        if (this.f43762w != null) {
            int measuredWidth = getMeasuredWidth();
            d3 d3Var = this.f43762w.f35347i;
            o70 o70Var = this.f43754a;
            if (d3Var != null) {
                canvas.save();
                j4 j4Var = this.f43755b;
                if (j4Var != null && j4Var.D) {
                    o70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    c4 c4Var = this.f43762w.f35344c;
                    float z4 = b.z(12.0f, c4Var.f35682f, dp - c4Var.f35680c);
                    int i12 = this.f43758f + this.h;
                    if (this.f43763x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(z4, i12 - i11);
                } else {
                    o70Var.getClass();
                    float D = org.telegram.messenger.y3.D(12.0f, this.f43762w.f35344c.f35682f, (AndroidUtilities.dp(15) + this.f43762w.f35344c.f35680c) - ((int) Math.ceil(b4Var.f35347i.d.getLineWidth(0))));
                    int i13 = this.f43758f + this.h;
                    if (this.f43763x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f43762w.f35347i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f43764y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f43757e - AndroidUtilities.dp(26.0f), this.f43758f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f43764y.a(canvas);
            }
            if (this.f43756c != null) {
                canvas.save();
                canvas.translate(this.f43757e, this.f43758f);
                l4.v(o70Var, canvas, this, 0);
                this.f43756c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f43756c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.f43754a, this.f43755b, d3Var));
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            View view = el0Var.f5875a;
            int i14 = this.f43759n;
            view.layout(i14, this.f43760r, view.getMeasuredWidth() + i14, this.d.f5875a.getMeasuredHeight() + this.f43760r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        o70 o70Var;
        TextPaint textPaint;
        o70 o70Var2;
        d3 q10;
        int i13;
        int dp;
        int dp2;
        int i14;
        int i15;
        int i16;
        d3 d3Var;
        d2 d2Var;
        d3 d3Var2;
        int i17;
        org.telegram.ui.Cells.m9 m9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        b4 b4Var = this.f43762w;
        int i18 = 1;
        if (b4Var != null) {
            this.f43756c = null;
            int i19 = b4Var.f35348j;
            o70 o70Var3 = this.f43754a;
            int i20 = 0;
            if (i19 == 0 && b4Var.f35344c.f35682f == 0) {
                o70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f43758f = i12;
            this.h = 0;
            c4 c4Var = this.f43762w.f35344c;
            if (c4Var.d == size && c4Var.f35681e == SharedConfig.ivFontSize) {
                o70Var = o70Var3;
            } else {
                c4Var.d = size;
                c4Var.f35681e = SharedConfig.ivFontSize;
                c4Var.f35680c = 0;
                int size2 = c4Var.f35679b.size();
                boolean z4 = true;
                int i21 = 0;
                while (i21 < size2) {
                    b4 b4Var2 = (b4) this.f43762w.f35344c.f35679b.get(i21);
                    String str = b4Var2.f35346f;
                    if (str != null) {
                        if (b4Var2.f35342a && "•".equalsIgnoreCase(str)) {
                            b4Var2.f35347i = null;
                        } else {
                            String str2 = b4Var2.f35346f;
                            o70Var3.getClass();
                            o70 o70Var4 = o70Var3;
                            o70Var2 = o70Var4;
                            b4Var2.f35347i = l4.q(o70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f43758f, this.f43762w, this.f43755b);
                            c4 c4Var2 = this.f43762w.f35344c;
                            c4Var2.f35680c = Math.max(c4Var2.f35680c, (int) Math.ceil(q10.d.getLineWidth(0)));
                            z4 = false;
                            i21++;
                            o70Var3 = o70Var2;
                        }
                    }
                    o70Var2 = o70Var3;
                    i21++;
                    o70Var3 = o70Var2;
                }
                o70Var = o70Var3;
                if (l4.f38494k1 != null && !z4) {
                    c4 c4Var3 = this.f43762w.f35344c;
                    c4Var3.f35680c = Math.max(c4Var3.f35680c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            b4 b4Var3 = this.f43762w;
            this.f43763x = !b4Var3.f35344c.f35678a.ordered;
            if (b4Var3.f35342a) {
                if (this.f43764y == null) {
                    o70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f43764y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.k6.hl, org.telegram.ui.ActionBar.k6.f22054z5, org.telegram.ui.ActionBar.k6.f21788k7);
                    this.f43764y.d(10);
                    this.f43764y.k(true);
                    this.f43764y.i(AndroidUtilities.dp(5.0f));
                }
                this.f43764y.f(-1, this.f43762w.f35343b, false);
            } else {
                this.f43764y = null;
            }
            int i22 = 26;
            j4 j4Var = this.f43755b;
            if (j4Var != null && j4Var.D) {
                o70Var.getClass();
                if (this.f43764y == null) {
                    i22 = 0;
                }
                this.f43757e = AndroidUtilities.dp(i22 + 18);
            } else {
                o70Var.getClass();
                if (this.f43764y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                c4 c4Var4 = this.f43762w.f35344c;
                this.f43757e = org.telegram.messenger.y3.D(12.0f, c4Var4.f35682f, dp3 + c4Var4.f35680c);
            }
            o70Var.getClass();
            float f10 = 18;
            int dp4 = (size - AndroidUtilities.dp(f10)) - this.f43757e;
            if (j4Var != null && j4Var.D) {
                int dp5 = AndroidUtilities.dp(6.0f);
                c4 c4Var5 = this.f43762w.f35344c;
                dp4 -= (AndroidUtilities.dp(12.0f) * c4Var5.f35682f) + (dp5 + c4Var5.f35680c);
            }
            b4 b4Var4 = this.f43762w;
            int i23 = dp4;
            TL_iv.RichText richText = b4Var4.f35345e;
            if (richText != null) {
                if (j4Var != null && j4Var.D) {
                    alignment = org.telegram.ui.Components.kw0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                d3 p10 = l4.p(this.f43754a, this, null, richText, i23, 0, b4Var4, alignment, 0, this.f43755b);
                this.f43756c = p10;
                if (p10 != null && p10.d.getLineCount() > 0) {
                    d3 d3Var3 = this.f43762w.f35347i;
                    if (d3Var3 != null && d3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f43762w.f35347i.d.getLineAscent(0)) - this.f43756c.d.getLineAscent(0);
                    }
                    i13 = this.f43756c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = b4Var4.d;
                if (pageBlock != null) {
                    int i24 = this.f43757e;
                    this.f43759n = i24;
                    int i25 = this.f43758f;
                    this.f43760r = i25;
                    org.telegram.ui.Components.el0 el0Var = this.d;
                    if (el0Var != null) {
                        View view = el0Var.f5875a;
                        if (view instanceof d2) {
                            float f11 = 8;
                            this.f43760r = i25 - AndroidUtilities.dp(f11);
                            if (j4Var == null || !j4Var.D) {
                                this.f43759n -= AndroidUtilities.dp(f10);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f10);
                            i15 = 0 - AndroidUtilities.dp(f11);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof x1) && !(view instanceof t2) && !(view instanceof x2) && !(view instanceof u2)) {
                                if (l4.L(pageBlock)) {
                                    this.f43759n = 0;
                                    this.f43760r = 0;
                                    this.f43758f = 0;
                                    b4 b4Var5 = this.f43762w;
                                    if (b4Var5.f35348j == 0 && b4Var5.f35344c.f35682f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f5875a instanceof w2) {
                                    this.f43759n -= AndroidUtilities.dp(f10);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (j4Var == null || !j4Var.D) {
                                    this.f43759n = i24 - AndroidUtilities.dp(f10);
                                }
                                dp2 = AndroidUtilities.dp(f10);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f5875a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f5875a instanceof d2) && (d3Var = this.f43762w.f35347i) != null && d3Var.d.getLineCount() > 0 && (d3Var2 = (d2Var = (d2) this.d.f5875a).f35943c) != null && d3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f43762w.f35347i.d.getLineAscent(0)) - d2Var.f35943c.d.getLineAscent(0);
                        }
                        b4 b4Var6 = this.f43762w;
                        if (b4Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f43761s = true;
                            this.f43760r = 0;
                            if (b4Var6.f35348j == 0 && b4Var6.f35344c.f35682f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f5875a;
                            if (view2 instanceof c2) {
                                this.f43761s = ((c2) view2).v;
                            } else if (view2 instanceof z1) {
                                this.f43761s = ((z1) view2).f43761s;
                            }
                        }
                        if (this.f43761s && this.f43762w.f35347i != null) {
                            this.f43758f = ((this.d.f5875a.getMeasuredHeight() - this.f43762w.f35347i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f43763x = false;
                        }
                        i13 = this.d.f5875a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (l.d.i(1, this.f43762w.f35344c.f35679b) == this.f43762w) {
                i17 += AndroidUtilities.dp(8);
            }
            b4 b4Var7 = this.f43762w;
            if (b4Var7.f35348j == 0 && b4Var7.f35344c.f35682f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            d3 d3Var4 = this.f43756c;
            if (d3Var4 != null) {
                d3Var4.f35964s = this.f43757e;
                d3Var4.v = this.f43758f;
            }
            org.telegram.ui.Components.el0 el0Var2 = this.d;
            if (el0Var2 != null && (el0Var2.f5875a instanceof org.telegram.ui.Cells.l9) && (m9Var = ((l4) o70Var).L0) != null) {
                ArrayList arrayList = m9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.l9) this.d.f5875a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) obj;
                    if (x9Var instanceof d3) {
                        d3 d3Var5 = (d3) x9Var;
                        d3Var5.f35964s += this.f43759n;
                        d3Var5.v += this.f43760r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (l4.l(this.f43754a, this.f43755b, motionEvent, this, this.f43756c, this.f43757e, this.f43758f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(b4 b4Var) {
        b4 b4Var2 = this.f43762w;
        j4 j4Var = this.f43755b;
        if (b4Var2 != b4Var) {
            this.f43762w = b4Var;
            org.telegram.ui.Components.el0 el0Var = this.d;
            if (el0Var != null) {
                removeView(el0Var.f5875a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f43762w.d;
            if (pageBlock != null && j4Var != null) {
                int I = j4.I(pageBlock);
                this.v = I;
                f2.m1 x10 = j4Var.x(this, I);
                this.d = (org.telegram.ui.Components.el0) x10;
                addView(x10.f5875a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f43762w.d;
        if (pageBlock2 != null && j4Var != null) {
            j4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
