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
public final class y1 extends ViewGroup implements org.telegram.ui.Cells.q9, e3 {
    public final r70 f39691a;
    public final g4 f39692b;
    public b3 f39693c;
    public org.telegram.ui.Components.wk0 d;
    public int e;
    public int f39694f;
    public int h;
    public int f39695n;
    public int f39696r;
    public boolean f39697s;
    public int v;
    public y3 f39698w;
    public boolean f39699x;
    public CheckBoxBase f39700y;

    public y1(Context context, r70 r70Var, g4 g4Var) {
        super(context);
        this.f39691a = r70Var;
        this.f39692b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        b3 b3Var;
        y3 y3Var = this.f39698w;
        if (y3Var != null) {
            b3Var = y3Var.f39713i;
        } else {
            b3Var = null;
        }
        if (b3Var == null) {
            return 0;
        }
        r70 r70Var = this.f39691a;
        g4 g4Var = this.f39692b;
        if (g4Var != null && g4Var.G) {
            int measuredWidth = getMeasuredWidth();
            r70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            z3 z3Var = this.f39698w.f39711c;
            return org.telegram.messenger.ul.A(12.0f, z3Var.f39953f, dp - z3Var.f39952c);
        }
        r70Var.getClass();
        return org.telegram.messenger.z0.D(12.0f, this.f39698w.f39711c.f39953f, (AndroidUtilities.dp(15) + this.f39698w.f39711c.f39952c) - ((int) Math.ceil(b3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        if (wk0Var != null) {
            View view = wk0Var.f42627a;
            if (view instanceof org.telegram.ui.Cells.q9) {
                ((org.telegram.ui.Cells.q9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        b3 b3Var = this.f39693c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f39691a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f39700y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        y3 y3Var = this.f39698w;
        if (y3Var != null && y3Var.f39713i != null) {
            i10 = Math.min(i10, (this.f39698w.f39713i.a() + a()) - dp);
        }
        b3 b3Var = this.f39693c;
        if (b3Var != null) {
            i10 = Math.min(i10, (b3Var.a() + b3Var.f31947s) - dp);
        }
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        if (wk0Var != null) {
            View view = wk0Var.f42627a;
            if ((view instanceof e3) && (boundLeft = ((e3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f39695n + boundLeft);
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
        this.f39691a.getClass();
        int dp = AndroidUtilities.dp(18);
        y3 y3Var = this.f39698w;
        if (y3Var != null && y3Var.f39713i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f39698w.f39713i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        b3 b3Var = this.f39693c;
        if (b3Var != null) {
            i10 = Math.max(i10, b3Var.b() + b3Var.f31947s + dp);
        }
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        if (wk0Var != null) {
            View view = wk0Var.f42627a;
            if ((view instanceof e3) && (boundRight = ((e3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f39695n + boundRight);
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
        b3 b3Var = this.f39693c;
        if (b3Var != null) {
            lastLineBoundRight = b3Var.c() + b3Var.f31947s;
            this.f39691a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.wk0 wk0Var = this.d;
            if (wk0Var != null) {
                View view = wk0Var.f42627a;
                if ((view instanceof e3) && (lastLineBoundRight = ((e3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f39695n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ul.b(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        if (wk0Var != null) {
            wk0Var.f42627a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f39693c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f39693c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        y3 y3Var;
        int i10;
        int i11;
        if (this.f39698w != null) {
            int measuredWidth = getMeasuredWidth();
            b3 b3Var = this.f39698w.f39713i;
            r70 r70Var = this.f39691a;
            if (b3Var != null) {
                canvas.save();
                g4 g4Var = this.f39692b;
                if (g4Var != null && g4Var.G) {
                    r70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    z3 z3Var = this.f39698w.f39711c;
                    float A = org.telegram.messenger.ul.A(12.0f, z3Var.f39953f, dp - z3Var.f39952c);
                    int i12 = this.f39694f + this.h;
                    if (this.f39699x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(A, i12 - i11);
                } else {
                    r70Var.getClass();
                    float D = org.telegram.messenger.z0.D(12.0f, this.f39698w.f39711c.f39953f, (AndroidUtilities.dp(15) + this.f39698w.f39711c.f39952c) - ((int) Math.ceil(y3Var.f39713i.d.getLineWidth(0))));
                    int i13 = this.f39694f + this.h;
                    if (this.f39699x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f39698w.f39713i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f39700y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f39694f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f39700y.a(canvas);
            }
            if (this.f39693c != null) {
                canvas.save();
                canvas.translate(this.e, this.f39694f);
                i4.v(r70Var, canvas, this, 0);
                this.f39693c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f39693c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f39691a, this.f39692b, b3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        if (wk0Var != null) {
            View view = wk0Var.f42627a;
            int i14 = this.f39695n;
            view.layout(i14, this.f39696r, view.getMeasuredWidth() + i14, this.d.f42627a.getMeasuredHeight() + this.f39696r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        r70 r70Var;
        TextPaint textPaint;
        r70 r70Var2;
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
        org.telegram.ui.Cells.r9 r9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        y3 y3Var = this.f39698w;
        int i18 = 1;
        if (y3Var != null) {
            this.f39693c = null;
            int i19 = y3Var.f39714j;
            r70 r70Var3 = this.f39691a;
            int i20 = 0;
            if (i19 == 0 && y3Var.f39711c.f39953f == 0) {
                r70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f39694f = i12;
            this.h = 0;
            z3 z3Var = this.f39698w.f39711c;
            if (z3Var.d == size && z3Var.e == SharedConfig.ivFontSize) {
                r70Var = r70Var3;
            } else {
                z3Var.d = size;
                z3Var.e = SharedConfig.ivFontSize;
                z3Var.f39952c = 0;
                int size2 = z3Var.f39951b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    y3 y3Var2 = (y3) this.f39698w.f39711c.f39951b.get(i21);
                    String str = y3Var2.f39712f;
                    if (str != null) {
                        if (y3Var2.f39709a && "•".equalsIgnoreCase(str)) {
                            y3Var2.f39713i = null;
                        } else {
                            String str2 = y3Var2.f39712f;
                            r70Var3.getClass();
                            r70 r70Var4 = r70Var3;
                            r70Var2 = r70Var4;
                            y3Var2.f39713i = i4.q(r70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f39694f, this.f39698w, this.f39692b);
                            z3 z3Var2 = this.f39698w.f39711c;
                            z3Var2.f39952c = Math.max(z3Var2.f39952c, (int) Math.ceil(q6.d.getLineWidth(0)));
                            z10 = false;
                            i21++;
                            r70Var3 = r70Var2;
                        }
                    }
                    r70Var2 = r70Var3;
                    i21++;
                    r70Var3 = r70Var2;
                }
                r70Var = r70Var3;
                if (i4.f33988n1 != null && !z10) {
                    z3 z3Var3 = this.f39698w.f39711c;
                    z3Var3.f39952c = Math.max(z3Var3.f39952c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            y3 y3Var3 = this.f39698w;
            this.f39699x = !y3Var3.f39711c.f39950a.ordered;
            if (y3Var3.f39709a) {
                if (this.f39700y == null) {
                    r70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f39700y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.h6.hl, org.telegram.ui.ActionBar.h6.f19188z5, org.telegram.ui.ActionBar.h6.f18917k7);
                    this.f39700y.d(10);
                    this.f39700y.k(true);
                    this.f39700y.i(AndroidUtilities.dp(5.0f));
                }
                this.f39700y.f(-1, this.f39698w.f39710b, false);
            } else {
                this.f39700y = null;
            }
            int i22 = 26;
            g4 g4Var = this.f39692b;
            if (g4Var != null && g4Var.G) {
                r70Var.getClass();
                if (this.f39700y == null) {
                    i22 = 0;
                }
                this.e = AndroidUtilities.dp(i22 + 18);
            } else {
                r70Var.getClass();
                if (this.f39700y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                z3 z3Var4 = this.f39698w.f39711c;
                this.e = org.telegram.messenger.z0.D(12.0f, z3Var4.f39953f, dp3 + z3Var4.f39952c);
            }
            r70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.e;
            if (g4Var != null && g4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                z3 z3Var5 = this.f39698w.f39711c;
                dp4 -= (AndroidUtilities.dp(12.0f) * z3Var5.f39953f) + (dp5 + z3Var5.f39952c);
            }
            y3 y3Var4 = this.f39698w;
            int i23 = dp4;
            TL_iv.RichText richText = y3Var4.e;
            if (richText != null) {
                if (g4Var != null && g4Var.G) {
                    alignment = org.telegram.ui.Components.jw0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                b3 p5 = i4.p(this.f39691a, this, null, richText, i23, 0, y3Var4, alignment, 0, this.f39692b);
                this.f39693c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    b3 b3Var3 = this.f39698w.f39713i;
                    if (b3Var3 != null && b3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f39698w.f39713i.d.getLineAscent(0)) - this.f39693c.d.getLineAscent(0);
                    }
                    i13 = this.f39693c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = y3Var4.d;
                if (pageBlock != null) {
                    int i24 = this.e;
                    this.f39695n = i24;
                    int i25 = this.f39694f;
                    this.f39696r = i25;
                    org.telegram.ui.Components.wk0 wk0Var = this.d;
                    if (wk0Var != null) {
                        View view = wk0Var.f42627a;
                        if (view instanceof c2) {
                            float f10 = 8;
                            this.f39696r = i25 - AndroidUtilities.dp(f10);
                            if (g4Var == null || !g4Var.G) {
                                this.f39695n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof w1) && !(view instanceof r2) && !(view instanceof v2) && !(view instanceof s2)) {
                                if (i4.L(pageBlock)) {
                                    this.f39695n = 0;
                                    this.f39696r = 0;
                                    this.f39694f = 0;
                                    y3 y3Var5 = this.f39698w;
                                    if (y3Var5.f39714j == 0 && y3Var5.f39711c.f39953f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f42627a instanceof u2) {
                                    this.f39695n -= AndroidUtilities.dp(f7);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (g4Var == null || !g4Var.G) {
                                    this.f39695n = i24 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f42627a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f42627a instanceof c2) && (b3Var = this.f39698w.f39713i) != null && b3Var.d.getLineCount() > 0 && (b3Var2 = (c2Var = (c2) this.d.f42627a).f32239c) != null && b3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f39698w.f39713i.d.getLineAscent(0)) - c2Var.f32239c.d.getLineAscent(0);
                        }
                        y3 y3Var6 = this.f39698w;
                        if (y3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f39697s = true;
                            this.f39696r = 0;
                            if (y3Var6.f39714j == 0 && y3Var6.f39711c.f39953f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f42627a;
                            if (view2 instanceof b2) {
                                this.f39697s = ((b2) view2).v;
                            } else if (view2 instanceof y1) {
                                this.f39697s = ((y1) view2).f39697s;
                            }
                        }
                        if (this.f39697s && this.f39698w.f39713i != null) {
                            this.f39694f = ((this.d.f42627a.getMeasuredHeight() - this.f39698w.f39713i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f39699x = false;
                        }
                        i13 = this.d.f42627a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (hg.c.h(1, this.f39698w.f39711c.f39951b) == this.f39698w) {
                i17 += AndroidUtilities.dp(8);
            }
            y3 y3Var7 = this.f39698w;
            if (y3Var7.f39714j == 0 && y3Var7.f39711c.f39953f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            b3 b3Var4 = this.f39693c;
            if (b3Var4 != null) {
                b3Var4.f31947s = this.e;
                b3Var4.v = this.f39694f;
            }
            org.telegram.ui.Components.wk0 wk0Var2 = this.d;
            if (wk0Var2 != null && (wk0Var2.f42627a instanceof org.telegram.ui.Cells.q9) && (r9Var = ((i4) r70Var).O0) != null) {
                ArrayList arrayList = r9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.q9) this.d.f42627a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) obj;
                    if (caVar instanceof b3) {
                        b3 b3Var5 = (b3) caVar;
                        b3Var5.f31947s += this.f39695n;
                        b3Var5.v += this.f39696r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.l(this.f39691a, this.f39692b, motionEvent, this, this.f39693c, this.e, this.f39694f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(y3 y3Var) {
        y3 y3Var2 = this.f39698w;
        g4 g4Var = this.f39692b;
        if (y3Var2 != y3Var) {
            this.f39698w = y3Var;
            org.telegram.ui.Components.wk0 wk0Var = this.d;
            if (wk0Var != null) {
                removeView(wk0Var.f42627a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f39698w.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.v = I;
                s4.c1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.wk0) x10;
                addView(x10.f42627a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f39698w.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
