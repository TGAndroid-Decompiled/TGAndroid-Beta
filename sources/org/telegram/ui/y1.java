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
    public final p70 f40016a;
    public final g4 f40017b;
    public b3 f40018c;
    public org.telegram.ui.Components.hl0 d;
    public int e;
    public int f40019f;
    public int h;
    public int f40020n;
    public int f40021r;
    public boolean f40022s;
    public int v;
    public y3 f40023w;
    public boolean f40024x;
    public CheckBoxBase f40025y;

    public y1(Context context, p70 p70Var, g4 g4Var) {
        super(context);
        this.f40016a = p70Var;
        this.f40017b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        b3 b3Var;
        y3 y3Var = this.f40023w;
        if (y3Var != null) {
            b3Var = y3Var.f40043i;
        } else {
            b3Var = null;
        }
        if (b3Var == null) {
            return 0;
        }
        p70 p70Var = this.f40016a;
        g4 g4Var = this.f40017b;
        if (g4Var != null && g4Var.G) {
            int measuredWidth = getMeasuredWidth();
            p70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            z3 z3Var = this.f40023w.f40041c;
            return org.telegram.messenger.ok.B(12.0f, z3Var.f40327f, dp - z3Var.f40326c);
        }
        p70Var.getClass();
        return org.telegram.messenger.f0.D(12.0f, this.f40023w.f40041c.f40327f, (AndroidUtilities.dp(15) + this.f40023w.f40041c.f40326c) - ((int) Math.ceil(b3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.hl0 hl0Var = this.d;
        if (hl0Var != null) {
            View view = hl0Var.f42959a;
            if (view instanceof org.telegram.ui.Cells.p9) {
                ((org.telegram.ui.Cells.p9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        b3 b3Var = this.f40018c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f40016a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f40025y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        y3 y3Var = this.f40023w;
        if (y3Var != null && y3Var.f40043i != null) {
            i10 = Math.min(i10, (this.f40023w.f40043i.a() + a()) - dp);
        }
        b3 b3Var = this.f40018c;
        if (b3Var != null) {
            i10 = Math.min(i10, (b3Var.a() + b3Var.f32303s) - dp);
        }
        org.telegram.ui.Components.hl0 hl0Var = this.d;
        if (hl0Var != null) {
            View view = hl0Var.f42959a;
            if ((view instanceof e3) && (boundLeft = ((e3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f40020n + boundLeft);
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
        this.f40016a.getClass();
        int dp = AndroidUtilities.dp(18);
        y3 y3Var = this.f40023w;
        if (y3Var != null && y3Var.f40043i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f40023w.f40043i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        b3 b3Var = this.f40018c;
        if (b3Var != null) {
            i10 = Math.max(i10, b3Var.b() + b3Var.f32303s + dp);
        }
        org.telegram.ui.Components.hl0 hl0Var = this.d;
        if (hl0Var != null) {
            View view = hl0Var.f42959a;
            if ((view instanceof e3) && (boundRight = ((e3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f40020n + boundRight);
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
        b3 b3Var = this.f40018c;
        if (b3Var != null) {
            lastLineBoundRight = b3Var.c() + b3Var.f32303s;
            this.f40016a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.hl0 hl0Var = this.d;
            if (hl0Var != null) {
                View view = hl0Var.f42959a;
                if ((view instanceof e3) && (lastLineBoundRight = ((e3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f40020n;
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
        org.telegram.ui.Components.hl0 hl0Var = this.d;
        if (hl0Var != null) {
            hl0Var.f42959a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f40018c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f40018c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        y3 y3Var;
        int i10;
        int i11;
        if (this.f40023w != null) {
            int measuredWidth = getMeasuredWidth();
            b3 b3Var = this.f40023w.f40043i;
            p70 p70Var = this.f40016a;
            if (b3Var != null) {
                canvas.save();
                g4 g4Var = this.f40017b;
                if (g4Var != null && g4Var.G) {
                    p70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    z3 z3Var = this.f40023w.f40041c;
                    float B = org.telegram.messenger.ok.B(12.0f, z3Var.f40327f, dp - z3Var.f40326c);
                    int i12 = this.f40019f + this.h;
                    if (this.f40024x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(B, i12 - i11);
                } else {
                    p70Var.getClass();
                    float D = org.telegram.messenger.f0.D(12.0f, this.f40023w.f40041c.f40327f, (AndroidUtilities.dp(15) + this.f40023w.f40041c.f40326c) - ((int) Math.ceil(y3Var.f40043i.d.getLineWidth(0))));
                    int i13 = this.f40019f + this.h;
                    if (this.f40024x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f40023w.f40043i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f40025y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f40019f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f40025y.a(canvas);
            }
            if (this.f40018c != null) {
                canvas.save();
                canvas.translate(this.e, this.f40019f);
                i4.v(p70Var, canvas, this, 0);
                this.f40018c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f40018c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f40016a, this.f40017b, b3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.hl0 hl0Var = this.d;
        if (hl0Var != null) {
            View view = hl0Var.f42959a;
            int i14 = this.f40020n;
            view.layout(i14, this.f40021r, view.getMeasuredWidth() + i14, this.d.f42959a.getMeasuredHeight() + this.f40021r);
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
        y3 y3Var = this.f40023w;
        int i18 = 1;
        if (y3Var != null) {
            this.f40018c = null;
            int i19 = y3Var.f40044j;
            p70 p70Var3 = this.f40016a;
            int i20 = 0;
            if (i19 == 0 && y3Var.f40041c.f40327f == 0) {
                p70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f40019f = i12;
            this.h = 0;
            z3 z3Var = this.f40023w.f40041c;
            if (z3Var.d == size && z3Var.e == SharedConfig.ivFontSize) {
                p70Var = p70Var3;
            } else {
                z3Var.d = size;
                z3Var.e = SharedConfig.ivFontSize;
                z3Var.f40326c = 0;
                int size2 = z3Var.f40325b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    y3 y3Var2 = (y3) this.f40023w.f40041c.f40325b.get(i21);
                    String str = y3Var2.f40042f;
                    if (str != null) {
                        if (y3Var2.f40039a && "•".equalsIgnoreCase(str)) {
                            y3Var2.f40043i = null;
                        } else {
                            String str2 = y3Var2.f40042f;
                            p70Var3.getClass();
                            p70 p70Var4 = p70Var3;
                            p70Var2 = p70Var4;
                            y3Var2.f40043i = i4.q(p70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f40019f, this.f40023w, this.f40017b);
                            z3 z3Var2 = this.f40023w.f40041c;
                            z3Var2.f40326c = Math.max(z3Var2.f40326c, (int) Math.ceil(q6.d.getLineWidth(0)));
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
                if (i4.f34373n1 != null && !z10) {
                    z3 z3Var3 = this.f40023w.f40041c;
                    z3Var3.f40326c = Math.max(z3Var3.f40326c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            y3 y3Var3 = this.f40023w;
            this.f40024x = !y3Var3.f40041c.f40324a.ordered;
            if (y3Var3.f40039a) {
                if (this.f40025y == null) {
                    p70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f40025y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.h6.hl, org.telegram.ui.ActionBar.h6.f19460z5, org.telegram.ui.ActionBar.h6.f19187k7);
                    this.f40025y.d(10);
                    this.f40025y.k(true);
                    this.f40025y.i(AndroidUtilities.dp(5.0f));
                }
                this.f40025y.f(-1, this.f40023w.f40040b, false);
            } else {
                this.f40025y = null;
            }
            int i22 = 26;
            g4 g4Var = this.f40017b;
            if (g4Var != null && g4Var.G) {
                p70Var.getClass();
                if (this.f40025y == null) {
                    i22 = 0;
                }
                this.e = AndroidUtilities.dp(i22 + 18);
            } else {
                p70Var.getClass();
                if (this.f40025y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                z3 z3Var4 = this.f40023w.f40041c;
                this.e = org.telegram.messenger.f0.D(12.0f, z3Var4.f40327f, dp3 + z3Var4.f40326c);
            }
            p70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.e;
            if (g4Var != null && g4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                z3 z3Var5 = this.f40023w.f40041c;
                dp4 -= (AndroidUtilities.dp(12.0f) * z3Var5.f40327f) + (dp5 + z3Var5.f40326c);
            }
            y3 y3Var4 = this.f40023w;
            int i23 = dp4;
            TL_iv.RichText richText = y3Var4.e;
            if (richText != null) {
                if (g4Var != null && g4Var.G) {
                    alignment = org.telegram.ui.Components.vw0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                b3 p5 = i4.p(this.f40016a, this, null, richText, i23, 0, y3Var4, alignment, 0, this.f40017b);
                this.f40018c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    b3 b3Var3 = this.f40023w.f40043i;
                    if (b3Var3 != null && b3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f40023w.f40043i.d.getLineAscent(0)) - this.f40018c.d.getLineAscent(0);
                    }
                    i13 = this.f40018c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = y3Var4.d;
                if (pageBlock != null) {
                    int i24 = this.e;
                    this.f40020n = i24;
                    int i25 = this.f40019f;
                    this.f40021r = i25;
                    org.telegram.ui.Components.hl0 hl0Var = this.d;
                    if (hl0Var != null) {
                        View view = hl0Var.f42959a;
                        if (view instanceof c2) {
                            float f10 = 8;
                            this.f40021r = i25 - AndroidUtilities.dp(f10);
                            if (g4Var == null || !g4Var.G) {
                                this.f40020n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof w1) && !(view instanceof r2) && !(view instanceof v2) && !(view instanceof s2)) {
                                if (i4.L(pageBlock)) {
                                    this.f40020n = 0;
                                    this.f40021r = 0;
                                    this.f40019f = 0;
                                    y3 y3Var5 = this.f40023w;
                                    if (y3Var5.f40044j == 0 && y3Var5.f40041c.f40327f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f42959a instanceof u2) {
                                    this.f40020n -= AndroidUtilities.dp(f7);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (g4Var == null || !g4Var.G) {
                                    this.f40020n = i24 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f42959a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f42959a instanceof c2) && (b3Var = this.f40023w.f40043i) != null && b3Var.d.getLineCount() > 0 && (b3Var2 = (c2Var = (c2) this.d.f42959a).f32547c) != null && b3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f40023w.f40043i.d.getLineAscent(0)) - c2Var.f32547c.d.getLineAscent(0);
                        }
                        y3 y3Var6 = this.f40023w;
                        if (y3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f40022s = true;
                            this.f40021r = 0;
                            if (y3Var6.f40044j == 0 && y3Var6.f40041c.f40327f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f42959a;
                            if (view2 instanceof b2) {
                                this.f40022s = ((b2) view2).v;
                            } else if (view2 instanceof y1) {
                                this.f40022s = ((y1) view2).f40022s;
                            }
                        }
                        if (this.f40022s && this.f40023w.f40043i != null) {
                            this.f40019f = ((this.d.f42959a.getMeasuredHeight() - this.f40023w.f40043i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f40024x = false;
                        }
                        i13 = this.d.f42959a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (hg.c.g(1, this.f40023w.f40041c.f40325b) == this.f40023w) {
                i17 += AndroidUtilities.dp(8);
            }
            y3 y3Var7 = this.f40023w;
            if (y3Var7.f40044j == 0 && y3Var7.f40041c.f40327f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            b3 b3Var4 = this.f40018c;
            if (b3Var4 != null) {
                b3Var4.f32303s = this.e;
                b3Var4.v = this.f40019f;
            }
            org.telegram.ui.Components.hl0 hl0Var2 = this.d;
            if (hl0Var2 != null && (hl0Var2.f42959a instanceof org.telegram.ui.Cells.p9) && (q9Var = ((i4) p70Var).O0) != null) {
                ArrayList arrayList = q9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.p9) this.d.f42959a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) obj;
                    if (baVar instanceof b3) {
                        b3 b3Var5 = (b3) baVar;
                        b3Var5.f32303s += this.f40020n;
                        b3Var5.v += this.f40021r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.l(this.f40016a, this.f40017b, motionEvent, this, this.f40018c, this.e, this.f40019f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(y3 y3Var) {
        y3 y3Var2 = this.f40023w;
        g4 g4Var = this.f40017b;
        if (y3Var2 != y3Var) {
            this.f40023w = y3Var;
            org.telegram.ui.Components.hl0 hl0Var = this.d;
            if (hl0Var != null) {
                removeView(hl0Var.f42959a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f40023w.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.v = I;
                s4.c1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.hl0) x10;
                addView(x10.f42959a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f40023w.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
