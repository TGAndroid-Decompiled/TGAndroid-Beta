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
    public final v70 f42964a;
    public final g4 f42965b;
    public b3 f42966c;
    public org.telegram.ui.Components.vk0 d;
    public int f42967e;
    public int f42968f;
    public int h;
    public int f42969n;
    public int f42970r;
    public boolean f42971s;
    public int v;
    public y3 f42972w;
    public boolean f42973x;
    public CheckBoxBase f42974y;

    public y1(Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.f42964a = v70Var;
        this.f42965b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        b3 b3Var;
        y3 y3Var = this.f42972w;
        if (y3Var != null) {
            b3Var = y3Var.f43002i;
        } else {
            b3Var = null;
        }
        if (b3Var == null) {
            return 0;
        }
        v70 v70Var = this.f42964a;
        g4 g4Var = this.f42965b;
        if (g4Var != null && g4Var.G) {
            int measuredWidth = getMeasuredWidth();
            v70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            z3 z3Var = this.f42972w.f42999c;
            return org.telegram.messenger.wl.A(12.0f, z3Var.f43305f, dp - z3Var.f43303c);
        }
        v70Var.getClass();
        return org.telegram.messenger.w1.D(12.0f, this.f42972w.f42999c.f43305f, (AndroidUtilities.dp(15) + this.f42972w.f42999c.f43303c) - ((int) Math.ceil(b3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f45766a;
            if (view instanceof org.telegram.ui.Cells.p9) {
                ((org.telegram.ui.Cells.p9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        b3 b3Var = this.f42966c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f42964a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f42974y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f42967e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        y3 y3Var = this.f42972w;
        if (y3Var != null && y3Var.f43002i != null) {
            i10 = Math.min(i10, (this.f42972w.f43002i.a() + a()) - dp);
        }
        b3 b3Var = this.f42966c;
        if (b3Var != null) {
            i10 = Math.min(i10, (b3Var.a() + b3Var.f34644s) - dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f45766a;
            if ((view instanceof e3) && (boundLeft = ((e3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f42969n + boundLeft);
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
        this.f42964a.getClass();
        int dp = AndroidUtilities.dp(18);
        y3 y3Var = this.f42972w;
        if (y3Var != null && y3Var.f43002i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f42972w.f43002i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        b3 b3Var = this.f42966c;
        if (b3Var != null) {
            i10 = Math.max(i10, b3Var.b() + b3Var.f34644s + dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f45766a;
            if ((view instanceof e3) && (boundRight = ((e3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f42969n + boundRight);
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
        b3 b3Var = this.f42966c;
        if (b3Var != null) {
            lastLineBoundRight = b3Var.c() + b3Var.f34644s;
            this.f42964a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                View view = vk0Var.f45766a;
                if ((view instanceof e3) && (lastLineBoundRight = ((e3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f42969n;
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
            vk0Var.f45766a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f42966c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f42966c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        y3 y3Var;
        int i10;
        int i11;
        if (this.f42972w != null) {
            int measuredWidth = getMeasuredWidth();
            b3 b3Var = this.f42972w.f43002i;
            v70 v70Var = this.f42964a;
            if (b3Var != null) {
                canvas.save();
                g4 g4Var = this.f42965b;
                if (g4Var != null && g4Var.G) {
                    v70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    z3 z3Var = this.f42972w.f42999c;
                    float A = org.telegram.messenger.wl.A(12.0f, z3Var.f43305f, dp - z3Var.f43303c);
                    int i12 = this.f42968f + this.h;
                    if (this.f42973x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(A, i12 - i11);
                } else {
                    v70Var.getClass();
                    float D = org.telegram.messenger.w1.D(12.0f, this.f42972w.f42999c.f43305f, (AndroidUtilities.dp(15) + this.f42972w.f42999c.f43303c) - ((int) Math.ceil(y3Var.f43002i.d.getLineWidth(0))));
                    int i13 = this.f42968f + this.h;
                    if (this.f42973x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f42972w.f43002i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f42974y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f42967e - AndroidUtilities.dp(26.0f), this.f42968f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f42974y.a(canvas);
            }
            if (this.f42966c != null) {
                canvas.save();
                canvas.translate(this.f42967e, this.f42968f);
                i4.v(v70Var, canvas, this, 0);
                this.f42966c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f42966c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f42964a, this.f42965b, b3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f45766a;
            int i14 = this.f42969n;
            view.layout(i14, this.f42970r, view.getMeasuredWidth() + i14, this.d.f45766a.getMeasuredHeight() + this.f42970r);
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
        y3 y3Var = this.f42972w;
        int i18 = 1;
        if (y3Var != null) {
            this.f42966c = null;
            int i19 = y3Var.f43003j;
            v70 v70Var3 = this.f42964a;
            int i20 = 0;
            if (i19 == 0 && y3Var.f42999c.f43305f == 0) {
                v70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f42968f = i12;
            this.h = 0;
            z3 z3Var = this.f42972w.f42999c;
            if (z3Var.d == size && z3Var.f43304e == SharedConfig.ivFontSize) {
                v70Var = v70Var3;
            } else {
                z3Var.d = size;
                z3Var.f43304e = SharedConfig.ivFontSize;
                z3Var.f43303c = 0;
                int size2 = z3Var.f43302b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    y3 y3Var2 = (y3) this.f42972w.f42999c.f43302b.get(i21);
                    String str = y3Var2.f43001f;
                    if (str != null) {
                        if (y3Var2.f42997a && "•".equalsIgnoreCase(str)) {
                            y3Var2.f43002i = null;
                        } else {
                            String str2 = y3Var2.f43001f;
                            v70Var3.getClass();
                            v70 v70Var4 = v70Var3;
                            v70Var2 = v70Var4;
                            y3Var2.f43002i = i4.q(v70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f42968f, this.f42972w, this.f42965b);
                            z3 z3Var2 = this.f42972w.f42999c;
                            z3Var2.f43303c = Math.max(z3Var2.f43303c, (int) Math.ceil(q6.d.getLineWidth(0)));
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
                if (i4.f37226n1 != null && !z10) {
                    z3 z3Var3 = this.f42972w.f42999c;
                    z3Var3.f43303c = Math.max(z3Var3.f43303c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            y3 y3Var3 = this.f42972w;
            this.f42973x = !y3Var3.f42999c.f43301a.ordered;
            if (y3Var3.f42997a) {
                if (this.f42974y == null) {
                    v70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f42974y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.j6.hl, org.telegram.ui.ActionBar.j6.f21087z5, org.telegram.ui.ActionBar.j6.f20819k7);
                    this.f42974y.d(10);
                    this.f42974y.k(true);
                    this.f42974y.i(AndroidUtilities.dp(5.0f));
                }
                this.f42974y.f(-1, this.f42972w.f42998b, false);
            } else {
                this.f42974y = null;
            }
            int i22 = 26;
            g4 g4Var = this.f42965b;
            if (g4Var != null && g4Var.G) {
                v70Var.getClass();
                if (this.f42974y == null) {
                    i22 = 0;
                }
                this.f42967e = AndroidUtilities.dp(i22 + 18);
            } else {
                v70Var.getClass();
                if (this.f42974y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                z3 z3Var4 = this.f42972w.f42999c;
                this.f42967e = org.telegram.messenger.w1.D(12.0f, z3Var4.f43305f, dp3 + z3Var4.f43303c);
            }
            v70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.f42967e;
            if (g4Var != null && g4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                z3 z3Var5 = this.f42972w.f42999c;
                dp4 -= (AndroidUtilities.dp(12.0f) * z3Var5.f43305f) + (dp5 + z3Var5.f43303c);
            }
            y3 y3Var4 = this.f42972w;
            int i23 = dp4;
            TL_iv.RichText richText = y3Var4.f43000e;
            if (richText != null) {
                if (g4Var != null && g4Var.G) {
                    alignment = org.telegram.ui.Components.iw0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                b3 p5 = i4.p(this.f42964a, this, null, richText, i23, 0, y3Var4, alignment, 0, this.f42965b);
                this.f42966c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    b3 b3Var3 = this.f42972w.f43002i;
                    if (b3Var3 != null && b3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f42972w.f43002i.d.getLineAscent(0)) - this.f42966c.d.getLineAscent(0);
                    }
                    i13 = this.f42966c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = y3Var4.d;
                if (pageBlock != null) {
                    int i24 = this.f42967e;
                    this.f42969n = i24;
                    int i25 = this.f42968f;
                    this.f42970r = i25;
                    org.telegram.ui.Components.vk0 vk0Var = this.d;
                    if (vk0Var != null) {
                        View view = vk0Var.f45766a;
                        if (view instanceof c2) {
                            float f10 = 8;
                            this.f42970r = i25 - AndroidUtilities.dp(f10);
                            if (g4Var == null || !g4Var.G) {
                                this.f42969n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof w1) && !(view instanceof r2) && !(view instanceof v2) && !(view instanceof s2)) {
                                if (i4.L(pageBlock)) {
                                    this.f42969n = 0;
                                    this.f42970r = 0;
                                    this.f42968f = 0;
                                    y3 y3Var5 = this.f42972w;
                                    if (y3Var5.f43003j == 0 && y3Var5.f42999c.f43305f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f45766a instanceof u2) {
                                    this.f42969n -= AndroidUtilities.dp(f7);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (g4Var == null || !g4Var.G) {
                                    this.f42969n = i24 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f45766a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f45766a instanceof c2) && (b3Var = this.f42972w.f43002i) != null && b3Var.d.getLineCount() > 0 && (b3Var2 = (c2Var = (c2) this.d.f45766a).f35004c) != null && b3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f42972w.f43002i.d.getLineAscent(0)) - c2Var.f35004c.d.getLineAscent(0);
                        }
                        y3 y3Var6 = this.f42972w;
                        if (y3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f42971s = true;
                            this.f42970r = 0;
                            if (y3Var6.f43003j == 0 && y3Var6.f42999c.f43305f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f45766a;
                            if (view2 instanceof b2) {
                                this.f42971s = ((b2) view2).v;
                            } else if (view2 instanceof y1) {
                                this.f42971s = ((y1) view2).f42971s;
                            }
                        }
                        if (this.f42971s && this.f42972w.f43002i != null) {
                            this.f42968f = ((this.d.f45766a.getMeasuredHeight() - this.f42972w.f43002i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f42973x = false;
                        }
                        i13 = this.d.f45766a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (i2.g.h(1, this.f42972w.f42999c.f43302b) == this.f42972w) {
                i17 += AndroidUtilities.dp(8);
            }
            y3 y3Var7 = this.f42972w;
            if (y3Var7.f43003j == 0 && y3Var7.f42999c.f43305f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            b3 b3Var4 = this.f42966c;
            if (b3Var4 != null) {
                b3Var4.f34644s = this.f42967e;
                b3Var4.v = this.f42968f;
            }
            org.telegram.ui.Components.vk0 vk0Var2 = this.d;
            if (vk0Var2 != null && (vk0Var2.f45766a instanceof org.telegram.ui.Cells.p9) && (q9Var = ((i4) v70Var).O0) != null) {
                ArrayList arrayList = q9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.p9) this.d.f45766a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) obj;
                    if (baVar instanceof b3) {
                        b3 b3Var5 = (b3) baVar;
                        b3Var5.f34644s += this.f42969n;
                        b3Var5.v += this.f42970r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.l(this.f42964a, this.f42965b, motionEvent, this, this.f42966c, this.f42967e, this.f42968f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(y3 y3Var) {
        y3 y3Var2 = this.f42972w;
        g4 g4Var = this.f42965b;
        if (y3Var2 != y3Var) {
            this.f42972w = y3Var;
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                removeView(vk0Var.f45766a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f42972w.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.v = I;
                s4.c1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.vk0) x10;
                addView(x10.f45766a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f42972w.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
