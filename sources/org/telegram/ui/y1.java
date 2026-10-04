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
    public final t70 f42991a;
    public final g4 f42992b;
    public b3 f42993c;
    public org.telegram.ui.Components.il0 d;
    public int f42994e;
    public int f42995f;
    public int h;
    public int f42996n;
    public int f42997r;
    public boolean f42998s;
    public int v;
    public y3 f42999w;
    public boolean f43000x;
    public CheckBoxBase f43001y;

    public y1(Context context, t70 t70Var, g4 g4Var) {
        super(context);
        this.f42991a = t70Var;
        this.f42992b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        b3 b3Var;
        y3 y3Var = this.f42999w;
        if (y3Var != null) {
            b3Var = y3Var.f43033i;
        } else {
            b3Var = null;
        }
        if (b3Var == null) {
            return 0;
        }
        t70 t70Var = this.f42991a;
        g4 g4Var = this.f42992b;
        if (g4Var != null && g4Var.G) {
            int measuredWidth = getMeasuredWidth();
            t70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            z3 z3Var = this.f42999w.f43030c;
            return org.telegram.messenger.ok.A(12.0f, z3Var.f43694f, dp - z3Var.f43692c);
        }
        t70Var.getClass();
        return org.telegram.messenger.f0.D(12.0f, this.f42999w.f43030c.f43694f, (AndroidUtilities.dp(15) + this.f42999w.f43030c.f43692c) - ((int) Math.ceil(b3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f46524a;
            if (view instanceof org.telegram.ui.Cells.p9) {
                ((org.telegram.ui.Cells.p9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        b3 b3Var = this.f42993c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f42991a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f43001y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f42994e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        y3 y3Var = this.f42999w;
        if (y3Var != null && y3Var.f43033i != null) {
            i10 = Math.min(i10, (this.f42999w.f43033i.a() + a()) - dp);
        }
        b3 b3Var = this.f42993c;
        if (b3Var != null) {
            i10 = Math.min(i10, (b3Var.a() + b3Var.f34979s) - dp);
        }
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f46524a;
            if ((view instanceof e3) && (boundLeft = ((e3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f42996n + boundLeft);
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
        this.f42991a.getClass();
        int dp = AndroidUtilities.dp(18);
        y3 y3Var = this.f42999w;
        if (y3Var != null && y3Var.f43033i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f42999w.f43033i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        b3 b3Var = this.f42993c;
        if (b3Var != null) {
            i10 = Math.max(i10, b3Var.b() + b3Var.f34979s + dp);
        }
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f46524a;
            if ((view instanceof e3) && (boundRight = ((e3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f42996n + boundRight);
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
        b3 b3Var = this.f42993c;
        if (b3Var != null) {
            lastLineBoundRight = b3Var.c() + b3Var.f34979s;
            this.f42991a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.il0 il0Var = this.d;
            if (il0Var != null) {
                View view = il0Var.f46524a;
                if ((view instanceof e3) && (lastLineBoundRight = ((e3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f42996n;
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
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            il0Var.f46524a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f42993c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f42993c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        y3 y3Var;
        int i10;
        int i11;
        if (this.f42999w != null) {
            int measuredWidth = getMeasuredWidth();
            b3 b3Var = this.f42999w.f43033i;
            t70 t70Var = this.f42991a;
            if (b3Var != null) {
                canvas.save();
                g4 g4Var = this.f42992b;
                if (g4Var != null && g4Var.G) {
                    t70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    z3 z3Var = this.f42999w.f43030c;
                    float A = org.telegram.messenger.ok.A(12.0f, z3Var.f43694f, dp - z3Var.f43692c);
                    int i12 = this.f42995f + this.h;
                    if (this.f43000x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(A, i12 - i11);
                } else {
                    t70Var.getClass();
                    float D = org.telegram.messenger.f0.D(12.0f, this.f42999w.f43030c.f43694f, (AndroidUtilities.dp(15) + this.f42999w.f43030c.f43692c) - ((int) Math.ceil(y3Var.f43033i.d.getLineWidth(0))));
                    int i13 = this.f42995f + this.h;
                    if (this.f43000x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f42999w.f43033i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f43001y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f42994e - AndroidUtilities.dp(26.0f), this.f42995f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f43001y.a(canvas);
            }
            if (this.f42993c != null) {
                canvas.save();
                canvas.translate(this.f42994e, this.f42995f);
                i4.v(t70Var, canvas, this, 0);
                this.f42993c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f42993c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f42991a, this.f42992b, b3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f46524a;
            int i14 = this.f42996n;
            view.layout(i14, this.f42997r, view.getMeasuredWidth() + i14, this.d.f46524a.getMeasuredHeight() + this.f42997r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        t70 t70Var;
        TextPaint textPaint;
        t70 t70Var2;
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
        y3 y3Var = this.f42999w;
        int i18 = 1;
        if (y3Var != null) {
            this.f42993c = null;
            int i19 = y3Var.f43034j;
            t70 t70Var3 = this.f42991a;
            int i20 = 0;
            if (i19 == 0 && y3Var.f43030c.f43694f == 0) {
                t70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f42995f = i12;
            this.h = 0;
            z3 z3Var = this.f42999w.f43030c;
            if (z3Var.d == size && z3Var.f43693e == SharedConfig.ivFontSize) {
                t70Var = t70Var3;
            } else {
                z3Var.d = size;
                z3Var.f43693e = SharedConfig.ivFontSize;
                z3Var.f43692c = 0;
                int size2 = z3Var.f43691b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    y3 y3Var2 = (y3) this.f42999w.f43030c.f43691b.get(i21);
                    String str = y3Var2.f43032f;
                    if (str != null) {
                        if (y3Var2.f43028a && "•".equalsIgnoreCase(str)) {
                            y3Var2.f43033i = null;
                        } else {
                            String str2 = y3Var2.f43032f;
                            t70Var3.getClass();
                            t70 t70Var4 = t70Var3;
                            t70Var2 = t70Var4;
                            y3Var2.f43033i = i4.q(t70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f42995f, this.f42999w, this.f42992b);
                            z3 z3Var2 = this.f42999w.f43030c;
                            z3Var2.f43692c = Math.max(z3Var2.f43692c, (int) Math.ceil(q6.d.getLineWidth(0)));
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
                if (i4.f37242n1 != null && !z10) {
                    z3 z3Var3 = this.f42999w.f43030c;
                    z3Var3.f43692c = Math.max(z3Var3.f43692c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            y3 y3Var3 = this.f42999w;
            this.f43000x = !y3Var3.f43030c.f43690a.ordered;
            if (y3Var3.f43028a) {
                if (this.f43001y == null) {
                    t70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f43001y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.i6.hl, org.telegram.ui.ActionBar.i6.f21223z5, org.telegram.ui.ActionBar.i6.f20948k7);
                    this.f43001y.d(10);
                    this.f43001y.k(true);
                    this.f43001y.i(AndroidUtilities.dp(5.0f));
                }
                this.f43001y.f(-1, this.f42999w.f43029b, false);
            } else {
                this.f43001y = null;
            }
            int i22 = 26;
            g4 g4Var = this.f42992b;
            if (g4Var != null && g4Var.G) {
                t70Var.getClass();
                if (this.f43001y == null) {
                    i22 = 0;
                }
                this.f42994e = AndroidUtilities.dp(i22 + 18);
            } else {
                t70Var.getClass();
                if (this.f43001y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                z3 z3Var4 = this.f42999w.f43030c;
                this.f42994e = org.telegram.messenger.f0.D(12.0f, z3Var4.f43694f, dp3 + z3Var4.f43692c);
            }
            t70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.f42994e;
            if (g4Var != null && g4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                z3 z3Var5 = this.f42999w.f43030c;
                dp4 -= (AndroidUtilities.dp(12.0f) * z3Var5.f43694f) + (dp5 + z3Var5.f43692c);
            }
            y3 y3Var4 = this.f42999w;
            int i23 = dp4;
            TL_iv.RichText richText = y3Var4.f43031e;
            if (richText != null) {
                if (g4Var != null && g4Var.G) {
                    alignment = org.telegram.ui.Components.fx0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                b3 p5 = i4.p(this.f42991a, this, null, richText, i23, 0, y3Var4, alignment, 0, this.f42992b);
                this.f42993c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    b3 b3Var3 = this.f42999w.f43033i;
                    if (b3Var3 != null && b3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f42999w.f43033i.d.getLineAscent(0)) - this.f42993c.d.getLineAscent(0);
                    }
                    i13 = this.f42993c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = y3Var4.d;
                if (pageBlock != null) {
                    int i24 = this.f42994e;
                    this.f42996n = i24;
                    int i25 = this.f42995f;
                    this.f42997r = i25;
                    org.telegram.ui.Components.il0 il0Var = this.d;
                    if (il0Var != null) {
                        View view = il0Var.f46524a;
                        if (view instanceof c2) {
                            float f10 = 8;
                            this.f42997r = i25 - AndroidUtilities.dp(f10);
                            if (g4Var == null || !g4Var.G) {
                                this.f42996n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof w1) && !(view instanceof r2) && !(view instanceof v2) && !(view instanceof s2)) {
                                if (i4.L(pageBlock)) {
                                    this.f42996n = 0;
                                    this.f42997r = 0;
                                    this.f42995f = 0;
                                    y3 y3Var5 = this.f42999w;
                                    if (y3Var5.f43034j == 0 && y3Var5.f43030c.f43694f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f46524a instanceof u2) {
                                    this.f42996n -= AndroidUtilities.dp(f7);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (g4Var == null || !g4Var.G) {
                                    this.f42996n = i24 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f46524a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f46524a instanceof c2) && (b3Var = this.f42999w.f43033i) != null && b3Var.d.getLineCount() > 0 && (b3Var2 = (c2Var = (c2) this.d.f46524a).f35257c) != null && b3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f42999w.f43033i.d.getLineAscent(0)) - c2Var.f35257c.d.getLineAscent(0);
                        }
                        y3 y3Var6 = this.f42999w;
                        if (y3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f42998s = true;
                            this.f42997r = 0;
                            if (y3Var6.f43034j == 0 && y3Var6.f43030c.f43694f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f46524a;
                            if (view2 instanceof b2) {
                                this.f42998s = ((b2) view2).v;
                            } else if (view2 instanceof y1) {
                                this.f42998s = ((y1) view2).f42998s;
                            }
                        }
                        if (this.f42998s && this.f42999w.f43033i != null) {
                            this.f42995f = ((this.d.f46524a.getMeasuredHeight() - this.f42999w.f43033i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f43000x = false;
                        }
                        i13 = this.d.f46524a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (hg.k0.g(1, this.f42999w.f43030c.f43691b) == this.f42999w) {
                i17 += AndroidUtilities.dp(8);
            }
            y3 y3Var7 = this.f42999w;
            if (y3Var7.f43034j == 0 && y3Var7.f43030c.f43694f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            b3 b3Var4 = this.f42993c;
            if (b3Var4 != null) {
                b3Var4.f34979s = this.f42994e;
                b3Var4.v = this.f42995f;
            }
            org.telegram.ui.Components.il0 il0Var2 = this.d;
            if (il0Var2 != null && (il0Var2.f46524a instanceof org.telegram.ui.Cells.p9) && (q9Var = ((i4) t70Var).O0) != null) {
                ArrayList arrayList = q9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.p9) this.d.f46524a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) obj;
                    if (baVar instanceof b3) {
                        b3 b3Var5 = (b3) baVar;
                        b3Var5.f34979s += this.f42996n;
                        b3Var5.v += this.f42997r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.l(this.f42991a, this.f42992b, motionEvent, this, this.f42993c, this.f42994e, this.f42995f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(y3 y3Var) {
        y3 y3Var2 = this.f42999w;
        g4 g4Var = this.f42992b;
        if (y3Var2 != y3Var) {
            this.f42999w = y3Var;
            org.telegram.ui.Components.il0 il0Var = this.d;
            if (il0Var != null) {
                removeView(il0Var.f46524a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f42999w.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.v = I;
                s4.c1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.il0) x10;
                addView(x10.f46524a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f42999w.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
