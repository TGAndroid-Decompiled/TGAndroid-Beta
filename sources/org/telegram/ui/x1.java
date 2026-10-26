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
public final class x1 extends ViewGroup implements org.telegram.ui.Cells.r9, e3 {
    public final h70 f45616a;
    public final h4 f45617b;
    public a3 f45618c;
    public org.telegram.ui.Components.vl0 d;
    public int e;
    public int f45619f;
    public int h;
    public int f45620n;
    public int f45621r;
    public boolean f45622s;
    public int v;
    public y3 f45623w;
    public boolean f45624x;
    public CheckBoxBase f45625y;

    public x1(Context context, h70 h70Var, h4 h4Var) {
        super(context);
        this.f45616a = h70Var;
        this.f45617b = h4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        a3 a3Var;
        y3 y3Var = this.f45623w;
        if (y3Var != null) {
            a3Var = y3Var.f45948i;
        } else {
            a3Var = null;
        }
        if (a3Var == null) {
            return 0;
        }
        h70 h70Var = this.f45616a;
        h4 h4Var = this.f45617b;
        if (h4Var != null && h4Var.G) {
            int measuredWidth = getMeasuredWidth();
            h70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            z3 z3Var = this.f45623w.f45946c;
            return org.telegram.messenger.vh.C(12.0f, z3Var.f46166f, dp - z3Var.f46165c);
        }
        h70Var.getClass();
        return org.telegram.messenger.vh.b(12.0f, this.f45623w.f45946c.f46166f, (AndroidUtilities.dp(15) + this.f45623w.f45946c.f46165c) - ((int) Math.ceil(a3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            View view = vl0Var.f47738a;
            if (view instanceof org.telegram.ui.Cells.r9) {
                ((org.telegram.ui.Cells.r9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        a3 a3Var = this.f45618c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f45616a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f45625y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        y3 y3Var = this.f45623w;
        if (y3Var != null && y3Var.f45948i != null) {
            i10 = Math.min(i10, (this.f45623w.f45948i.a() + a()) - dp);
        }
        a3 a3Var = this.f45618c;
        if (a3Var != null) {
            i10 = Math.min(i10, (a3Var.a() + a3Var.f37634s) - dp);
        }
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            View view = vl0Var.f47738a;
            if ((view instanceof e3) && (boundLeft = ((e3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f45620n + boundLeft);
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
        this.f45616a.getClass();
        int dp = AndroidUtilities.dp(18);
        y3 y3Var = this.f45623w;
        if (y3Var != null && y3Var.f45948i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f45623w.f45948i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        a3 a3Var = this.f45618c;
        if (a3Var != null) {
            i10 = Math.max(i10, a3Var.b() + a3Var.f37634s + dp);
        }
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            View view = vl0Var.f47738a;
            if ((view instanceof e3) && (boundRight = ((e3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f45620n + boundRight);
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
        a3 a3Var = this.f45618c;
        if (a3Var != null) {
            lastLineBoundRight = a3Var.c() + a3Var.f37634s;
            this.f45616a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.vl0 vl0Var = this.d;
            if (vl0Var != null) {
                View view = vl0Var.f47738a;
                if ((view instanceof e3) && (lastLineBoundRight = ((e3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f45620n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return d3.b(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            vl0Var.f47738a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f45618c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f45618c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        y3 y3Var;
        int i10;
        int i11;
        if (this.f45623w != null) {
            int measuredWidth = getMeasuredWidth();
            a3 a3Var = this.f45623w.f45948i;
            h70 h70Var = this.f45616a;
            if (a3Var != null) {
                canvas.save();
                h4 h4Var = this.f45617b;
                if (h4Var != null && h4Var.G) {
                    h70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    z3 z3Var = this.f45623w.f45946c;
                    float C = org.telegram.messenger.vh.C(12.0f, z3Var.f46166f, dp - z3Var.f46165c);
                    int i12 = this.f45619f + this.h;
                    if (this.f45624x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(C, i12 - i11);
                } else {
                    h70Var.getClass();
                    float b10 = org.telegram.messenger.vh.b(12.0f, this.f45623w.f45946c.f46166f, (AndroidUtilities.dp(15) + this.f45623w.f45946c.f46165c) - ((int) Math.ceil(y3Var.f45948i.d.getLineWidth(0))));
                    int i13 = this.f45619f + this.h;
                    if (this.f45624x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(b10, i13 - i10);
                }
                this.f45623w.f45948i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f45625y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f45619f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f45625y.a(canvas);
            }
            if (this.f45618c != null) {
                canvas.save();
                canvas.translate(this.e, this.f45619f);
                j4.v(h70Var, canvas, this, 0);
                this.f45618c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f45618c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.j(this.f45616a, this.f45617b, a3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            View view = vl0Var.f47738a;
            int i14 = this.f45620n;
            view.layout(i14, this.f45621r, view.getMeasuredWidth() + i14, this.d.f47738a.getMeasuredHeight() + this.f45621r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        h70 h70Var;
        TextPaint textPaint;
        h70 h70Var2;
        a3 q5;
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
        org.telegram.ui.Cells.s9 s9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        y3 y3Var = this.f45623w;
        int i18 = 1;
        if (y3Var != null) {
            this.f45618c = null;
            int i19 = y3Var.f45949j;
            h70 h70Var3 = this.f45616a;
            int i20 = 0;
            if (i19 == 0 && y3Var.f45946c.f46166f == 0) {
                h70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f45619f = i12;
            this.h = 0;
            z3 z3Var = this.f45623w.f45946c;
            if (z3Var.d == size && z3Var.e == SharedConfig.ivFontSize) {
                h70Var = h70Var3;
            } else {
                z3Var.d = size;
                z3Var.e = SharedConfig.ivFontSize;
                z3Var.f46165c = 0;
                int size2 = z3Var.f46164b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    y3 y3Var2 = (y3) this.f45623w.f45946c.f46164b.get(i21);
                    String str = y3Var2.f45947f;
                    if (str != null) {
                        if (y3Var2.f45944a && "•".equalsIgnoreCase(str)) {
                            y3Var2.f45948i = null;
                        } else {
                            String str2 = y3Var2.f45947f;
                            h70Var3.getClass();
                            h70 h70Var4 = h70Var3;
                            h70Var2 = h70Var4;
                            y3Var2.f45948i = j4.q(h70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f45619f, this.f45623w, this.f45617b);
                            z3 z3Var2 = this.f45623w.f45946c;
                            z3Var2.f46165c = Math.max(z3Var2.f46165c, (int) Math.ceil(q5.d.getLineWidth(0)));
                            z10 = false;
                            i21++;
                            h70Var3 = h70Var2;
                        }
                    }
                    h70Var2 = h70Var3;
                    i21++;
                    h70Var3 = h70Var2;
                }
                h70Var = h70Var3;
                if (j4.f40416o1 != null && !z10) {
                    z3 z3Var3 = this.f45623w.f45946c;
                    z3Var3.f46165c = Math.max(z3Var3.f46165c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            y3 y3Var3 = this.f45623w;
            this.f45624x = !y3Var3.f45946c.f46163a.ordered;
            if (y3Var3.f45944a) {
                if (this.f45625y == null) {
                    h70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f45625y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.y6.hl, org.telegram.ui.ActionBar.y6.f23766z5, org.telegram.ui.ActionBar.y6.f23485k7);
                    this.f45625y.d(10);
                    this.f45625y.k(true);
                    this.f45625y.i(AndroidUtilities.dp(5.0f));
                }
                this.f45625y.f(-1, this.f45623w.f45945b, false);
            } else {
                this.f45625y = null;
            }
            int i22 = 26;
            h4 h4Var = this.f45617b;
            if (h4Var != null && h4Var.G) {
                h70Var.getClass();
                if (this.f45625y == null) {
                    i22 = 0;
                }
                this.e = AndroidUtilities.dp(i22 + 18);
            } else {
                h70Var.getClass();
                if (this.f45625y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                z3 z3Var4 = this.f45623w.f45946c;
                this.e = org.telegram.messenger.vh.b(12.0f, z3Var4.f46166f, dp3 + z3Var4.f46165c);
            }
            h70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.e;
            if (h4Var != null && h4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                z3 z3Var5 = this.f45623w.f45946c;
                dp4 -= (AndroidUtilities.dp(12.0f) * z3Var5.f46166f) + (dp5 + z3Var5.f46165c);
            }
            y3 y3Var4 = this.f45623w;
            int i23 = dp4;
            TL_iv.RichText richText = y3Var4.e;
            if (richText != null) {
                if (h4Var != null && h4Var.G) {
                    alignment = org.telegram.ui.Components.px0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                a3 p10 = j4.p(this.f45616a, this, null, richText, i23, 0, y3Var4, alignment, 0, this.f45617b);
                this.f45618c = p10;
                if (p10 != null && p10.d.getLineCount() > 0) {
                    a3 a3Var3 = this.f45623w.f45948i;
                    if (a3Var3 != null && a3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f45623w.f45948i.d.getLineAscent(0)) - this.f45618c.d.getLineAscent(0);
                    }
                    i13 = this.f45618c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = y3Var4.d;
                if (pageBlock != null) {
                    int i24 = this.e;
                    this.f45620n = i24;
                    int i25 = this.f45619f;
                    this.f45621r = i25;
                    org.telegram.ui.Components.vl0 vl0Var = this.d;
                    if (vl0Var != null) {
                        View view = vl0Var.f47738a;
                        if (view instanceof b2) {
                            float f10 = 8;
                            this.f45621r = i25 - AndroidUtilities.dp(f10);
                            if (h4Var == null || !h4Var.G) {
                                this.f45620n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof v1) && !(view instanceof q2) && !(view instanceof u2) && !(view instanceof r2)) {
                                if (j4.L(pageBlock)) {
                                    this.f45620n = 0;
                                    this.f45621r = 0;
                                    this.f45619f = 0;
                                    y3 y3Var5 = this.f45623w;
                                    if (y3Var5.f45949j == 0 && y3Var5.f45946c.f46166f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f47738a instanceof t2) {
                                    this.f45620n -= AndroidUtilities.dp(f7);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (h4Var == null || !h4Var.G) {
                                    this.f45620n = i24 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f47738a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f47738a instanceof b2) && (a3Var = this.f45623w.f45948i) != null && a3Var.d.getLineCount() > 0 && (a3Var2 = (b2Var = (b2) this.d.f47738a).f37953c) != null && a3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f45623w.f45948i.d.getLineAscent(0)) - b2Var.f37953c.d.getLineAscent(0);
                        }
                        y3 y3Var6 = this.f45623w;
                        if (y3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f45622s = true;
                            this.f45621r = 0;
                            if (y3Var6.f45949j == 0 && y3Var6.f45946c.f46166f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f47738a;
                            if (view2 instanceof a2) {
                                this.f45622s = ((a2) view2).v;
                            } else if (view2 instanceof x1) {
                                this.f45622s = ((x1) view2).f45622s;
                            }
                        }
                        if (this.f45622s && this.f45623w.f45948i != null) {
                            this.f45619f = ((this.d.f47738a.getMeasuredHeight() - this.f45623w.f45948i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f45624x = false;
                        }
                        i13 = this.d.f47738a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (ic.a.g(1, this.f45623w.f45946c.f46164b) == this.f45623w) {
                i17 += AndroidUtilities.dp(8);
            }
            y3 y3Var7 = this.f45623w;
            if (y3Var7.f45949j == 0 && y3Var7.f45946c.f46166f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            a3 a3Var4 = this.f45618c;
            if (a3Var4 != null) {
                a3Var4.f37634s = this.e;
                a3Var4.v = this.f45619f;
            }
            org.telegram.ui.Components.vl0 vl0Var2 = this.d;
            if (vl0Var2 != null && (vl0Var2.f47738a instanceof org.telegram.ui.Cells.r9) && (s9Var = ((j4) h70Var).P0) != null) {
                ArrayList arrayList = s9Var.A0;
                arrayList.clear();
                ((org.telegram.ui.Cells.r9) this.d.f47738a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.da daVar = (org.telegram.ui.Cells.da) obj;
                    if (daVar instanceof a3) {
                        a3 a3Var5 = (a3) daVar;
                        a3Var5.f37634s += this.f45620n;
                        a3Var5.v += this.f45621r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (j4.l(this.f45616a, this.f45617b, motionEvent, this, this.f45618c, this.e, this.f45619f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(y3 y3Var) {
        y3 y3Var2 = this.f45623w;
        h4 h4Var = this.f45617b;
        if (y3Var2 != y3Var) {
            this.f45623w = y3Var;
            org.telegram.ui.Components.vl0 vl0Var = this.d;
            if (vl0Var != null) {
                removeView(vl0Var.f47738a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f45623w.d;
            if (pageBlock != null && h4Var != null) {
                int I = h4.I(pageBlock);
                this.v = I;
                s4.e1 x9 = h4Var.x(this, I);
                this.d = (org.telegram.ui.Components.vl0) x9;
                addView(x9.f47738a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f45623w.d;
        if (pageBlock2 != null && h4Var != null) {
            h4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
