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
public final class x1 extends ViewGroup implements org.telegram.ui.Cells.p9, d3 {
    public final u70 f39427a;
    public final f4 f39428b;
    public a3 f39429c;
    public org.telegram.ui.Components.vk0 d;
    public int e;
    public int f39430f;
    public int h;
    public int f39431n;
    public int f39432r;
    public boolean f39433s;
    public int v;
    public x3 f39434w;
    public boolean f39435x;
    public CheckBoxBase f39436y;

    public x1(Context context, u70 u70Var, f4 f4Var) {
        super(context);
        this.f39427a = u70Var;
        this.f39428b = f4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        a3 a3Var;
        x3 x3Var = this.f39434w;
        if (x3Var != null) {
            a3Var = x3Var.f39480i;
        } else {
            a3Var = null;
        }
        if (a3Var == null) {
            return 0;
        }
        u70 u70Var = this.f39427a;
        f4 f4Var = this.f39428b;
        if (f4Var != null && f4Var.G) {
            int measuredWidth = getMeasuredWidth();
            u70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            y3 y3Var = this.f39434w.f39478c;
            return org.telegram.messenger.wl.A(12.0f, y3Var.f39746f, dp - y3Var.f39745c);
        }
        u70Var.getClass();
        return org.telegram.messenger.w1.D(12.0f, this.f39434w.f39478c.f39746f, (AndroidUtilities.dp(15) + this.f39434w.f39478c.f39745c) - ((int) Math.ceil(a3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f42675a;
            if (view instanceof org.telegram.ui.Cells.p9) {
                ((org.telegram.ui.Cells.p9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        a3 a3Var = this.f39429c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f39427a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f39436y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        x3 x3Var = this.f39434w;
        if (x3Var != null && x3Var.f39480i != null) {
            i10 = Math.min(i10, (this.f39434w.f39480i.a() + a()) - dp);
        }
        a3 a3Var = this.f39429c;
        if (a3Var != null) {
            i10 = Math.min(i10, (a3Var.a() + a3Var.f31679s) - dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f42675a;
            if ((view instanceof d3) && (boundLeft = ((d3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f39431n + boundLeft);
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
        this.f39427a.getClass();
        int dp = AndroidUtilities.dp(18);
        x3 x3Var = this.f39434w;
        if (x3Var != null && x3Var.f39480i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f39434w.f39480i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        a3 a3Var = this.f39429c;
        if (a3Var != null) {
            i10 = Math.max(i10, a3Var.b() + a3Var.f31679s + dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f42675a;
            if ((view instanceof d3) && (boundRight = ((d3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f39431n + boundRight);
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
        a3 a3Var = this.f39429c;
        if (a3Var != null) {
            lastLineBoundRight = a3Var.c() + a3Var.f31679s;
            this.f39427a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                View view = vk0Var.f42675a;
                if ((view instanceof d3) && (lastLineBoundRight = ((d3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f39431n;
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
            vk0Var.f42675a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f39429c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f39429c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        x3 x3Var;
        int i10;
        int i11;
        if (this.f39434w != null) {
            int measuredWidth = getMeasuredWidth();
            a3 a3Var = this.f39434w.f39480i;
            u70 u70Var = this.f39427a;
            if (a3Var != null) {
                canvas.save();
                f4 f4Var = this.f39428b;
                if (f4Var != null && f4Var.G) {
                    u70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    y3 y3Var = this.f39434w.f39478c;
                    float A = org.telegram.messenger.wl.A(12.0f, y3Var.f39746f, dp - y3Var.f39745c);
                    int i12 = this.f39430f + this.h;
                    if (this.f39435x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(A, i12 - i11);
                } else {
                    u70Var.getClass();
                    float D = org.telegram.messenger.w1.D(12.0f, this.f39434w.f39478c.f39746f, (AndroidUtilities.dp(15) + this.f39434w.f39478c.f39745c) - ((int) Math.ceil(x3Var.f39480i.d.getLineWidth(0))));
                    int i13 = this.f39430f + this.h;
                    if (this.f39435x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f39434w.f39480i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f39436y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f39430f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f39436y.a(canvas);
            }
            if (this.f39429c != null) {
                canvas.save();
                canvas.translate(this.e, this.f39430f);
                h4.v(u70Var, canvas, this, 0);
                this.f39429c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f39429c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.j(this.f39427a, this.f39428b, a3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f42675a;
            int i14 = this.f39431n;
            view.layout(i14, this.f39432r, view.getMeasuredWidth() + i14, this.d.f42675a.getMeasuredHeight() + this.f39432r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        u70 u70Var;
        TextPaint textPaint;
        u70 u70Var2;
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
        org.telegram.ui.Cells.q9 q9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        x3 x3Var = this.f39434w;
        int i18 = 1;
        if (x3Var != null) {
            this.f39429c = null;
            int i19 = x3Var.f39481j;
            u70 u70Var3 = this.f39427a;
            int i20 = 0;
            if (i19 == 0 && x3Var.f39478c.f39746f == 0) {
                u70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f39430f = i12;
            this.h = 0;
            y3 y3Var = this.f39434w.f39478c;
            if (y3Var.d == size && y3Var.e == SharedConfig.ivFontSize) {
                u70Var = u70Var3;
            } else {
                y3Var.d = size;
                y3Var.e = SharedConfig.ivFontSize;
                y3Var.f39745c = 0;
                int size2 = y3Var.f39744b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    x3 x3Var2 = (x3) this.f39434w.f39478c.f39744b.get(i21);
                    String str = x3Var2.f39479f;
                    if (str != null) {
                        if (x3Var2.f39476a && "•".equalsIgnoreCase(str)) {
                            x3Var2.f39480i = null;
                        } else {
                            String str2 = x3Var2.f39479f;
                            u70Var3.getClass();
                            u70 u70Var4 = u70Var3;
                            u70Var2 = u70Var4;
                            x3Var2.f39480i = h4.q(u70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f39430f, this.f39434w, this.f39428b);
                            y3 y3Var2 = this.f39434w.f39478c;
                            y3Var2.f39745c = Math.max(y3Var2.f39745c, (int) Math.ceil(q6.d.getLineWidth(0)));
                            z10 = false;
                            i21++;
                            u70Var3 = u70Var2;
                        }
                    }
                    u70Var2 = u70Var3;
                    i21++;
                    u70Var3 = u70Var2;
                }
                u70Var = u70Var3;
                if (h4.f34118n1 != null && !z10) {
                    y3 y3Var3 = this.f39434w.f39478c;
                    y3Var3.f39745c = Math.max(y3Var3.f39745c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            x3 x3Var3 = this.f39434w;
            this.f39435x = !x3Var3.f39478c.f39743a.ordered;
            if (x3Var3.f39476a) {
                if (this.f39436y == null) {
                    u70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f39436y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.i6.hl, org.telegram.ui.ActionBar.i6.f19236z5, org.telegram.ui.ActionBar.i6.f18965k7);
                    this.f39436y.d(10);
                    this.f39436y.k(true);
                    this.f39436y.i(AndroidUtilities.dp(5.0f));
                }
                this.f39436y.f(-1, this.f39434w.f39477b, false);
            } else {
                this.f39436y = null;
            }
            int i22 = 26;
            f4 f4Var = this.f39428b;
            if (f4Var != null && f4Var.G) {
                u70Var.getClass();
                if (this.f39436y == null) {
                    i22 = 0;
                }
                this.e = AndroidUtilities.dp(i22 + 18);
            } else {
                u70Var.getClass();
                if (this.f39436y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                y3 y3Var4 = this.f39434w.f39478c;
                this.e = org.telegram.messenger.w1.D(12.0f, y3Var4.f39746f, dp3 + y3Var4.f39745c);
            }
            u70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.e;
            if (f4Var != null && f4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                y3 y3Var5 = this.f39434w.f39478c;
                dp4 -= (AndroidUtilities.dp(12.0f) * y3Var5.f39746f) + (dp5 + y3Var5.f39745c);
            }
            x3 x3Var4 = this.f39434w;
            int i23 = dp4;
            TL_iv.RichText richText = x3Var4.e;
            if (richText != null) {
                if (f4Var != null && f4Var.G) {
                    alignment = org.telegram.ui.Components.jw0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                a3 p5 = h4.p(this.f39427a, this, null, richText, i23, 0, x3Var4, alignment, 0, this.f39428b);
                this.f39429c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    a3 a3Var3 = this.f39434w.f39480i;
                    if (a3Var3 != null && a3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f39434w.f39480i.d.getLineAscent(0)) - this.f39429c.d.getLineAscent(0);
                    }
                    i13 = this.f39429c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = x3Var4.d;
                if (pageBlock != null) {
                    int i24 = this.e;
                    this.f39431n = i24;
                    int i25 = this.f39430f;
                    this.f39432r = i25;
                    org.telegram.ui.Components.vk0 vk0Var = this.d;
                    if (vk0Var != null) {
                        View view = vk0Var.f42675a;
                        if (view instanceof b2) {
                            float f10 = 8;
                            this.f39432r = i25 - AndroidUtilities.dp(f10);
                            if (f4Var == null || !f4Var.G) {
                                this.f39431n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof v1) && !(view instanceof q2) && !(view instanceof u2) && !(view instanceof r2)) {
                                if (h4.L(pageBlock)) {
                                    this.f39431n = 0;
                                    this.f39432r = 0;
                                    this.f39430f = 0;
                                    x3 x3Var5 = this.f39434w;
                                    if (x3Var5.f39481j == 0 && x3Var5.f39478c.f39746f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f42675a instanceof t2) {
                                    this.f39431n -= AndroidUtilities.dp(f7);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (f4Var == null || !f4Var.G) {
                                    this.f39431n = i24 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f42675a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f42675a instanceof b2) && (a3Var = this.f39434w.f39480i) != null && a3Var.d.getLineCount() > 0 && (a3Var2 = (b2Var = (b2) this.d.f42675a).f32027c) != null && a3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f39434w.f39480i.d.getLineAscent(0)) - b2Var.f32027c.d.getLineAscent(0);
                        }
                        x3 x3Var6 = this.f39434w;
                        if (x3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f39433s = true;
                            this.f39432r = 0;
                            if (x3Var6.f39481j == 0 && x3Var6.f39478c.f39746f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f42675a;
                            if (view2 instanceof a2) {
                                this.f39433s = ((a2) view2).v;
                            } else if (view2 instanceof x1) {
                                this.f39433s = ((x1) view2).f39433s;
                            }
                        }
                        if (this.f39433s && this.f39434w.f39480i != null) {
                            this.f39430f = ((this.d.f42675a.getMeasuredHeight() - this.f39434w.f39480i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f39435x = false;
                        }
                        i13 = this.d.f42675a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (hg.k0.h(1, this.f39434w.f39478c.f39744b) == this.f39434w) {
                i17 += AndroidUtilities.dp(8);
            }
            x3 x3Var7 = this.f39434w;
            if (x3Var7.f39481j == 0 && x3Var7.f39478c.f39746f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            a3 a3Var4 = this.f39429c;
            if (a3Var4 != null) {
                a3Var4.f31679s = this.e;
                a3Var4.v = this.f39430f;
            }
            org.telegram.ui.Components.vk0 vk0Var2 = this.d;
            if (vk0Var2 != null && (vk0Var2.f42675a instanceof org.telegram.ui.Cells.p9) && (q9Var = ((h4) u70Var).O0) != null) {
                ArrayList arrayList = q9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.p9) this.d.f42675a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) obj;
                    if (baVar instanceof a3) {
                        a3 a3Var5 = (a3) baVar;
                        a3Var5.f31679s += this.f39431n;
                        a3Var5.v += this.f39432r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (h4.l(this.f39427a, this.f39428b, motionEvent, this, this.f39429c, this.e, this.f39430f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(x3 x3Var) {
        x3 x3Var2 = this.f39434w;
        f4 f4Var = this.f39428b;
        if (x3Var2 != x3Var) {
            this.f39434w = x3Var;
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                removeView(vk0Var.f42675a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f39434w.d;
            if (pageBlock != null && f4Var != null) {
                int I = f4.I(pageBlock);
                this.v = I;
                s4.c1 x10 = f4Var.x(this, I);
                this.d = (org.telegram.ui.Components.vk0) x10;
                addView(x10.f42675a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f39434w.d;
        if (pageBlock2 != null && f4Var != null) {
            f4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
