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
public final class y1 extends ViewGroup implements org.telegram.ui.Cells.p9, e3 {
    public final p70 f40018a;
    public final g4 f40019b;
    public b3 f40020c;
    public org.telegram.ui.Components.gl0 d;
    public int e;
    public int f40021f;
    public int h;
    public int f40022n;
    public int f40023r;
    public boolean f40024s;
    public int v;
    public y3 f40025w;
    public boolean f40026x;
    public CheckBoxBase f40027y;

    public y1(Context context, p70 p70Var, g4 g4Var) {
        super(context);
        this.f40018a = p70Var;
        this.f40019b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        b3 b3Var;
        y3 y3Var = this.f40025w;
        if (y3Var != null) {
            b3Var = y3Var.f40045i;
        } else {
            b3Var = null;
        }
        if (b3Var == null) {
            return 0;
        }
        p70 p70Var = this.f40018a;
        g4 g4Var = this.f40019b;
        if (g4Var != null && g4Var.G) {
            int measuredWidth = getMeasuredWidth();
            p70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            z3 z3Var = this.f40025w.f40043c;
            return org.telegram.messenger.ok.B(12.0f, z3Var.f40329f, dp - z3Var.f40328c);
        }
        p70Var.getClass();
        return org.telegram.messenger.f0.D(12.0f, this.f40025w.f40043c.f40329f, (AndroidUtilities.dp(15) + this.f40025w.f40043c.f40328c) - ((int) Math.ceil(b3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.gl0 gl0Var = this.d;
        if (gl0Var != null) {
            View view = gl0Var.f42961a;
            if (view instanceof org.telegram.ui.Cells.p9) {
                ((org.telegram.ui.Cells.p9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        b3 b3Var = this.f40020c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f40018a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f40027y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        y3 y3Var = this.f40025w;
        if (y3Var != null && y3Var.f40045i != null) {
            i10 = Math.min(i10, (this.f40025w.f40045i.a() + a()) - dp);
        }
        b3 b3Var = this.f40020c;
        if (b3Var != null) {
            i10 = Math.min(i10, (b3Var.a() + b3Var.f32305s) - dp);
        }
        org.telegram.ui.Components.gl0 gl0Var = this.d;
        if (gl0Var != null) {
            View view = gl0Var.f42961a;
            if ((view instanceof e3) && (boundLeft = ((e3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f40022n + boundLeft);
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
        this.f40018a.getClass();
        int dp = AndroidUtilities.dp(18);
        y3 y3Var = this.f40025w;
        if (y3Var != null && y3Var.f40045i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f40025w.f40045i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        b3 b3Var = this.f40020c;
        if (b3Var != null) {
            i10 = Math.max(i10, b3Var.b() + b3Var.f32305s + dp);
        }
        org.telegram.ui.Components.gl0 gl0Var = this.d;
        if (gl0Var != null) {
            View view = gl0Var.f42961a;
            if ((view instanceof e3) && (boundRight = ((e3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f40022n + boundRight);
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
        b3 b3Var = this.f40020c;
        if (b3Var != null) {
            lastLineBoundRight = b3Var.c() + b3Var.f32305s;
            this.f40018a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.gl0 gl0Var = this.d;
            if (gl0Var != null) {
                View view = gl0Var.f42961a;
                if ((view instanceof e3) && (lastLineBoundRight = ((e3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f40022n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ok.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.gl0 gl0Var = this.d;
        if (gl0Var != null) {
            gl0Var.f42961a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f40020c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f40020c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        y3 y3Var;
        int i10;
        int i11;
        if (this.f40025w != null) {
            int measuredWidth = getMeasuredWidth();
            b3 b3Var = this.f40025w.f40045i;
            p70 p70Var = this.f40018a;
            if (b3Var != null) {
                canvas.save();
                g4 g4Var = this.f40019b;
                if (g4Var != null && g4Var.G) {
                    p70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    z3 z3Var = this.f40025w.f40043c;
                    float B = org.telegram.messenger.ok.B(12.0f, z3Var.f40329f, dp - z3Var.f40328c);
                    int i12 = this.f40021f + this.h;
                    if (this.f40026x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(B, i12 - i11);
                } else {
                    p70Var.getClass();
                    float D = org.telegram.messenger.f0.D(12.0f, this.f40025w.f40043c.f40329f, (AndroidUtilities.dp(15) + this.f40025w.f40043c.f40328c) - ((int) Math.ceil(y3Var.f40045i.d.getLineWidth(0))));
                    int i13 = this.f40021f + this.h;
                    if (this.f40026x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f40025w.f40045i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f40027y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f40021f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f40027y.a(canvas);
            }
            if (this.f40020c != null) {
                canvas.save();
                canvas.translate(this.e, this.f40021f);
                i4.v(p70Var, canvas, this, 0);
                this.f40020c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f40020c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f40018a, this.f40019b, b3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.gl0 gl0Var = this.d;
        if (gl0Var != null) {
            View view = gl0Var.f42961a;
            int i14 = this.f40022n;
            view.layout(i14, this.f40023r, view.getMeasuredWidth() + i14, this.d.f42961a.getMeasuredHeight() + this.f40023r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        p70 p70Var;
        TextPaint textPaint;
        p70 p70Var2;
        b3 q6;
        int i13;
        int dp;
        int dp2;
        int i14;
        int i15;
        int i16;
        b3 b3Var;
        c2 c2Var;
        b3 b3Var2;
        int i17;
        org.telegram.ui.Cells.q9 q9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        y3 y3Var = this.f40025w;
        int i18 = 1;
        if (y3Var != null) {
            this.f40020c = null;
            int i19 = y3Var.f40046j;
            p70 p70Var3 = this.f40018a;
            int i20 = 0;
            if (i19 == 0 && y3Var.f40043c.f40329f == 0) {
                p70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f40021f = i12;
            this.h = 0;
            z3 z3Var = this.f40025w.f40043c;
            if (z3Var.d == size && z3Var.e == SharedConfig.ivFontSize) {
                p70Var = p70Var3;
            } else {
                z3Var.d = size;
                z3Var.e = SharedConfig.ivFontSize;
                z3Var.f40328c = 0;
                int size2 = z3Var.f40327b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    y3 y3Var2 = (y3) this.f40025w.f40043c.f40327b.get(i21);
                    String str = y3Var2.f40044f;
                    if (str != null) {
                        if (y3Var2.f40041a && "•".equalsIgnoreCase(str)) {
                            y3Var2.f40045i = null;
                        } else {
                            String str2 = y3Var2.f40044f;
                            p70Var3.getClass();
                            p70 p70Var4 = p70Var3;
                            p70Var2 = p70Var4;
                            y3Var2.f40045i = i4.q(p70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f40021f, this.f40025w, this.f40019b);
                            z3 z3Var2 = this.f40025w.f40043c;
                            z3Var2.f40328c = Math.max(z3Var2.f40328c, (int) Math.ceil(q6.d.getLineWidth(0)));
                            z10 = false;
                            i21++;
                            p70Var3 = p70Var2;
                        }
                    }
                    p70Var2 = p70Var3;
                    i21++;
                    p70Var3 = p70Var2;
                }
                p70Var = p70Var3;
                if (i4.f34375n1 != null && !z10) {
                    z3 z3Var3 = this.f40025w.f40043c;
                    z3Var3.f40328c = Math.max(z3Var3.f40328c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            y3 y3Var3 = this.f40025w;
            this.f40026x = !y3Var3.f40043c.f40326a.ordered;
            if (y3Var3.f40041a) {
                if (this.f40027y == null) {
                    p70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f40027y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.h6.hl, org.telegram.ui.ActionBar.h6.f19461z5, org.telegram.ui.ActionBar.h6.f19188k7);
                    this.f40027y.d(10);
                    this.f40027y.k(true);
                    this.f40027y.i(AndroidUtilities.dp(5.0f));
                }
                this.f40027y.f(-1, this.f40025w.f40042b, false);
            } else {
                this.f40027y = null;
            }
            int i22 = 26;
            g4 g4Var = this.f40019b;
            if (g4Var != null && g4Var.G) {
                p70Var.getClass();
                if (this.f40027y == null) {
                    i22 = 0;
                }
                this.e = AndroidUtilities.dp(i22 + 18);
            } else {
                p70Var.getClass();
                if (this.f40027y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                z3 z3Var4 = this.f40025w.f40043c;
                this.e = org.telegram.messenger.f0.D(12.0f, z3Var4.f40329f, dp3 + z3Var4.f40328c);
            }
            p70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.e;
            if (g4Var != null && g4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                z3 z3Var5 = this.f40025w.f40043c;
                dp4 -= (AndroidUtilities.dp(12.0f) * z3Var5.f40329f) + (dp5 + z3Var5.f40328c);
            }
            y3 y3Var4 = this.f40025w;
            int i23 = dp4;
            TL_iv.RichText richText = y3Var4.e;
            if (richText != null) {
                if (g4Var != null && g4Var.G) {
                    alignment = org.telegram.ui.Components.uw0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                b3 p5 = i4.p(this.f40018a, this, null, richText, i23, 0, y3Var4, alignment, 0, this.f40019b);
                this.f40020c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    b3 b3Var3 = this.f40025w.f40045i;
                    if (b3Var3 != null && b3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f40025w.f40045i.d.getLineAscent(0)) - this.f40020c.d.getLineAscent(0);
                    }
                    i13 = this.f40020c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = y3Var4.d;
                if (pageBlock != null) {
                    int i24 = this.e;
                    this.f40022n = i24;
                    int i25 = this.f40021f;
                    this.f40023r = i25;
                    org.telegram.ui.Components.gl0 gl0Var = this.d;
                    if (gl0Var != null) {
                        View view = gl0Var.f42961a;
                        if (view instanceof c2) {
                            float f10 = 8;
                            this.f40023r = i25 - AndroidUtilities.dp(f10);
                            if (g4Var == null || !g4Var.G) {
                                this.f40022n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof w1) && !(view instanceof r2) && !(view instanceof v2) && !(view instanceof s2)) {
                                if (i4.L(pageBlock)) {
                                    this.f40022n = 0;
                                    this.f40023r = 0;
                                    this.f40021f = 0;
                                    y3 y3Var5 = this.f40025w;
                                    if (y3Var5.f40046j == 0 && y3Var5.f40043c.f40329f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f42961a instanceof u2) {
                                    this.f40022n -= AndroidUtilities.dp(f7);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (g4Var == null || !g4Var.G) {
                                    this.f40022n = i24 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f42961a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f42961a instanceof c2) && (b3Var = this.f40025w.f40045i) != null && b3Var.d.getLineCount() > 0 && (b3Var2 = (c2Var = (c2) this.d.f42961a).f32549c) != null && b3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f40025w.f40045i.d.getLineAscent(0)) - c2Var.f32549c.d.getLineAscent(0);
                        }
                        y3 y3Var6 = this.f40025w;
                        if (y3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f40024s = true;
                            this.f40023r = 0;
                            if (y3Var6.f40046j == 0 && y3Var6.f40043c.f40329f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f42961a;
                            if (view2 instanceof b2) {
                                this.f40024s = ((b2) view2).v;
                            } else if (view2 instanceof y1) {
                                this.f40024s = ((y1) view2).f40024s;
                            }
                        }
                        if (this.f40024s && this.f40025w.f40045i != null) {
                            this.f40021f = ((this.d.f42961a.getMeasuredHeight() - this.f40025w.f40045i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f40026x = false;
                        }
                        i13 = this.d.f42961a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (hg.c.g(1, this.f40025w.f40043c.f40327b) == this.f40025w) {
                i17 += AndroidUtilities.dp(8);
            }
            y3 y3Var7 = this.f40025w;
            if (y3Var7.f40046j == 0 && y3Var7.f40043c.f40329f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            b3 b3Var4 = this.f40020c;
            if (b3Var4 != null) {
                b3Var4.f32305s = this.e;
                b3Var4.v = this.f40021f;
            }
            org.telegram.ui.Components.gl0 gl0Var2 = this.d;
            if (gl0Var2 != null && (gl0Var2.f42961a instanceof org.telegram.ui.Cells.p9) && (q9Var = ((i4) p70Var).O0) != null) {
                ArrayList arrayList = q9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.p9) this.d.f42961a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) obj;
                    if (baVar instanceof b3) {
                        b3 b3Var5 = (b3) baVar;
                        b3Var5.f32305s += this.f40022n;
                        b3Var5.v += this.f40023r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.l(this.f40018a, this.f40019b, motionEvent, this, this.f40020c, this.e, this.f40021f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(y3 y3Var) {
        y3 y3Var2 = this.f40025w;
        g4 g4Var = this.f40019b;
        if (y3Var2 != y3Var) {
            this.f40025w = y3Var;
            org.telegram.ui.Components.gl0 gl0Var = this.d;
            if (gl0Var != null) {
                removeView(gl0Var.f42961a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f40025w.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.v = I;
                s4.c1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.gl0) x10;
                addView(x10.f42961a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f40025w.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
