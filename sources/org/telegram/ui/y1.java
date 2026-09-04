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
    public final v70 f42937a;
    public final g4 f42938b;
    public b3 f42939c;
    public org.telegram.ui.Components.vk0 d;
    public int f42940e;
    public int f42941f;
    public int h;
    public int f42942n;
    public int f42943r;
    public boolean f42944s;
    public int v;
    public y3 f42945w;
    public boolean f42946x;
    public CheckBoxBase f42947y;

    public y1(Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.f42937a = v70Var;
        this.f42938b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        b3 b3Var;
        y3 y3Var = this.f42945w;
        if (y3Var != null) {
            b3Var = y3Var.f42975i;
        } else {
            b3Var = null;
        }
        if (b3Var == null) {
            return 0;
        }
        v70 v70Var = this.f42937a;
        g4 g4Var = this.f42938b;
        if (g4Var != null && g4Var.G) {
            int measuredWidth = getMeasuredWidth();
            v70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            z3 z3Var = this.f42945w.f42972c;
            return org.telegram.messenger.wl.A(12.0f, z3Var.f43278f, dp - z3Var.f43276c);
        }
        v70Var.getClass();
        return org.telegram.messenger.w1.D(12.0f, this.f42945w.f42972c.f43278f, (AndroidUtilities.dp(15) + this.f42945w.f42972c.f43276c) - ((int) Math.ceil(b3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f45738a;
            if (view instanceof org.telegram.ui.Cells.p9) {
                ((org.telegram.ui.Cells.p9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        b3 b3Var = this.f42939c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f42937a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f42947y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f42940e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        y3 y3Var = this.f42945w;
        if (y3Var != null && y3Var.f42975i != null) {
            i10 = Math.min(i10, (this.f42945w.f42975i.a() + a()) - dp);
        }
        b3 b3Var = this.f42939c;
        if (b3Var != null) {
            i10 = Math.min(i10, (b3Var.a() + b3Var.f34617s) - dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f45738a;
            if ((view instanceof e3) && (boundLeft = ((e3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f42942n + boundLeft);
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
        this.f42937a.getClass();
        int dp = AndroidUtilities.dp(18);
        y3 y3Var = this.f42945w;
        if (y3Var != null && y3Var.f42975i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f42945w.f42975i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        b3 b3Var = this.f42939c;
        if (b3Var != null) {
            i10 = Math.max(i10, b3Var.b() + b3Var.f34617s + dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f45738a;
            if ((view instanceof e3) && (boundRight = ((e3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f42942n + boundRight);
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
        b3 b3Var = this.f42939c;
        if (b3Var != null) {
            lastLineBoundRight = b3Var.c() + b3Var.f34617s;
            this.f42937a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                View view = vk0Var.f45738a;
                if ((view instanceof e3) && (lastLineBoundRight = ((e3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f42942n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.wl.b(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            vk0Var.f45738a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f42939c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f42939c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        y3 y3Var;
        int i10;
        int i11;
        if (this.f42945w != null) {
            int measuredWidth = getMeasuredWidth();
            b3 b3Var = this.f42945w.f42975i;
            v70 v70Var = this.f42937a;
            if (b3Var != null) {
                canvas.save();
                g4 g4Var = this.f42938b;
                if (g4Var != null && g4Var.G) {
                    v70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    z3 z3Var = this.f42945w.f42972c;
                    float A = org.telegram.messenger.wl.A(12.0f, z3Var.f43278f, dp - z3Var.f43276c);
                    int i12 = this.f42941f + this.h;
                    if (this.f42946x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(A, i12 - i11);
                } else {
                    v70Var.getClass();
                    float D = org.telegram.messenger.w1.D(12.0f, this.f42945w.f42972c.f43278f, (AndroidUtilities.dp(15) + this.f42945w.f42972c.f43276c) - ((int) Math.ceil(y3Var.f42975i.d.getLineWidth(0))));
                    int i13 = this.f42941f + this.h;
                    if (this.f42946x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f42945w.f42975i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f42947y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f42940e - AndroidUtilities.dp(26.0f), this.f42941f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f42947y.a(canvas);
            }
            if (this.f42939c != null) {
                canvas.save();
                canvas.translate(this.f42940e, this.f42941f);
                i4.v(v70Var, canvas, this, 0);
                this.f42939c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f42939c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f42937a, this.f42938b, b3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f45738a;
            int i14 = this.f42942n;
            view.layout(i14, this.f42943r, view.getMeasuredWidth() + i14, this.d.f45738a.getMeasuredHeight() + this.f42943r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        v70 v70Var;
        TextPaint textPaint;
        v70 v70Var2;
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
        y3 y3Var = this.f42945w;
        int i18 = 1;
        if (y3Var != null) {
            this.f42939c = null;
            int i19 = y3Var.f42976j;
            v70 v70Var3 = this.f42937a;
            int i20 = 0;
            if (i19 == 0 && y3Var.f42972c.f43278f == 0) {
                v70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f42941f = i12;
            this.h = 0;
            z3 z3Var = this.f42945w.f42972c;
            if (z3Var.d == size && z3Var.f43277e == SharedConfig.ivFontSize) {
                v70Var = v70Var3;
            } else {
                z3Var.d = size;
                z3Var.f43277e = SharedConfig.ivFontSize;
                z3Var.f43276c = 0;
                int size2 = z3Var.f43275b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    y3 y3Var2 = (y3) this.f42945w.f42972c.f43275b.get(i21);
                    String str = y3Var2.f42974f;
                    if (str != null) {
                        if (y3Var2.f42970a && "•".equalsIgnoreCase(str)) {
                            y3Var2.f42975i = null;
                        } else {
                            String str2 = y3Var2.f42974f;
                            v70Var3.getClass();
                            v70 v70Var4 = v70Var3;
                            v70Var2 = v70Var4;
                            y3Var2.f42975i = i4.q(v70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f42941f, this.f42945w, this.f42938b);
                            z3 z3Var2 = this.f42945w.f42972c;
                            z3Var2.f43276c = Math.max(z3Var2.f43276c, (int) Math.ceil(q6.d.getLineWidth(0)));
                            z10 = false;
                            i21++;
                            v70Var3 = v70Var2;
                        }
                    }
                    v70Var2 = v70Var3;
                    i21++;
                    v70Var3 = v70Var2;
                }
                v70Var = v70Var3;
                if (i4.f37199n1 != null && !z10) {
                    z3 z3Var3 = this.f42945w.f42972c;
                    z3Var3.f43276c = Math.max(z3Var3.f43276c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            y3 y3Var3 = this.f42945w;
            this.f42946x = !y3Var3.f42972c.f43274a.ordered;
            if (y3Var3.f42970a) {
                if (this.f42947y == null) {
                    v70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f42947y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.j6.hl, org.telegram.ui.ActionBar.j6.f21060z5, org.telegram.ui.ActionBar.j6.f20792k7);
                    this.f42947y.d(10);
                    this.f42947y.k(true);
                    this.f42947y.i(AndroidUtilities.dp(5.0f));
                }
                this.f42947y.f(-1, this.f42945w.f42971b, false);
            } else {
                this.f42947y = null;
            }
            int i22 = 26;
            g4 g4Var = this.f42938b;
            if (g4Var != null && g4Var.G) {
                v70Var.getClass();
                if (this.f42947y == null) {
                    i22 = 0;
                }
                this.f42940e = AndroidUtilities.dp(i22 + 18);
            } else {
                v70Var.getClass();
                if (this.f42947y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                z3 z3Var4 = this.f42945w.f42972c;
                this.f42940e = org.telegram.messenger.w1.D(12.0f, z3Var4.f43278f, dp3 + z3Var4.f43276c);
            }
            v70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.f42940e;
            if (g4Var != null && g4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                z3 z3Var5 = this.f42945w.f42972c;
                dp4 -= (AndroidUtilities.dp(12.0f) * z3Var5.f43278f) + (dp5 + z3Var5.f43276c);
            }
            y3 y3Var4 = this.f42945w;
            int i23 = dp4;
            TL_iv.RichText richText = y3Var4.f42973e;
            if (richText != null) {
                if (g4Var != null && g4Var.G) {
                    alignment = org.telegram.ui.Components.iw0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                b3 p5 = i4.p(this.f42937a, this, null, richText, i23, 0, y3Var4, alignment, 0, this.f42938b);
                this.f42939c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    b3 b3Var3 = this.f42945w.f42975i;
                    if (b3Var3 != null && b3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f42945w.f42975i.d.getLineAscent(0)) - this.f42939c.d.getLineAscent(0);
                    }
                    i13 = this.f42939c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = y3Var4.d;
                if (pageBlock != null) {
                    int i24 = this.f42940e;
                    this.f42942n = i24;
                    int i25 = this.f42941f;
                    this.f42943r = i25;
                    org.telegram.ui.Components.vk0 vk0Var = this.d;
                    if (vk0Var != null) {
                        View view = vk0Var.f45738a;
                        if (view instanceof c2) {
                            float f10 = 8;
                            this.f42943r = i25 - AndroidUtilities.dp(f10);
                            if (g4Var == null || !g4Var.G) {
                                this.f42942n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof w1) && !(view instanceof r2) && !(view instanceof v2) && !(view instanceof s2)) {
                                if (i4.L(pageBlock)) {
                                    this.f42942n = 0;
                                    this.f42943r = 0;
                                    this.f42941f = 0;
                                    y3 y3Var5 = this.f42945w;
                                    if (y3Var5.f42976j == 0 && y3Var5.f42972c.f43278f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f45738a instanceof u2) {
                                    this.f42942n -= AndroidUtilities.dp(f7);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (g4Var == null || !g4Var.G) {
                                    this.f42942n = i24 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f45738a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f45738a instanceof c2) && (b3Var = this.f42945w.f42975i) != null && b3Var.d.getLineCount() > 0 && (b3Var2 = (c2Var = (c2) this.d.f45738a).f34977c) != null && b3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f42945w.f42975i.d.getLineAscent(0)) - c2Var.f34977c.d.getLineAscent(0);
                        }
                        y3 y3Var6 = this.f42945w;
                        if (y3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f42944s = true;
                            this.f42943r = 0;
                            if (y3Var6.f42976j == 0 && y3Var6.f42972c.f43278f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f45738a;
                            if (view2 instanceof b2) {
                                this.f42944s = ((b2) view2).v;
                            } else if (view2 instanceof y1) {
                                this.f42944s = ((y1) view2).f42944s;
                            }
                        }
                        if (this.f42944s && this.f42945w.f42975i != null) {
                            this.f42941f = ((this.d.f45738a.getMeasuredHeight() - this.f42945w.f42975i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f42946x = false;
                        }
                        i13 = this.d.f45738a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (i2.g.h(1, this.f42945w.f42972c.f43275b) == this.f42945w) {
                i17 += AndroidUtilities.dp(8);
            }
            y3 y3Var7 = this.f42945w;
            if (y3Var7.f42976j == 0 && y3Var7.f42972c.f43278f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            b3 b3Var4 = this.f42939c;
            if (b3Var4 != null) {
                b3Var4.f34617s = this.f42940e;
                b3Var4.v = this.f42941f;
            }
            org.telegram.ui.Components.vk0 vk0Var2 = this.d;
            if (vk0Var2 != null && (vk0Var2.f45738a instanceof org.telegram.ui.Cells.p9) && (q9Var = ((i4) v70Var).O0) != null) {
                ArrayList arrayList = q9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.p9) this.d.f45738a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) obj;
                    if (baVar instanceof b3) {
                        b3 b3Var5 = (b3) baVar;
                        b3Var5.f34617s += this.f42942n;
                        b3Var5.v += this.f42943r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.l(this.f42937a, this.f42938b, motionEvent, this, this.f42939c, this.f42940e, this.f42941f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(y3 y3Var) {
        y3 y3Var2 = this.f42945w;
        g4 g4Var = this.f42938b;
        if (y3Var2 != y3Var) {
            this.f42945w = y3Var;
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                removeView(vk0Var.f45738a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f42945w.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.v = I;
                s4.c1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.vk0) x10;
                addView(x10.f45738a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f42945w.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
