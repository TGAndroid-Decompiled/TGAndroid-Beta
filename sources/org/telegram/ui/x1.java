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
    public final u70 f39424a;
    public final f4 f39425b;
    public a3 f39426c;
    public org.telegram.ui.Components.vk0 d;
    public int e;
    public int f39427f;
    public int h;
    public int f39428n;
    public int f39429r;
    public boolean f39430s;
    public int v;
    public x3 f39431w;
    public boolean f39432x;
    public CheckBoxBase f39433y;

    public x1(Context context, u70 u70Var, f4 f4Var) {
        super(context);
        this.f39424a = u70Var;
        this.f39425b = f4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        a3 a3Var;
        x3 x3Var = this.f39431w;
        if (x3Var != null) {
            a3Var = x3Var.f39485i;
        } else {
            a3Var = null;
        }
        if (a3Var == null) {
            return 0;
        }
        u70 u70Var = this.f39424a;
        f4 f4Var = this.f39425b;
        if (f4Var != null && f4Var.G) {
            int measuredWidth = getMeasuredWidth();
            u70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            y3 y3Var = this.f39431w.f39483c;
            return org.telegram.messenger.vl.A(12.0f, y3Var.f39751f, dp - y3Var.f39750c);
        }
        u70Var.getClass();
        return org.telegram.messenger.y0.D(12.0f, this.f39431w.f39483c.f39751f, (AndroidUtilities.dp(15) + this.f39431w.f39483c.f39750c) - ((int) Math.ceil(a3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f42671a;
            if (view instanceof org.telegram.ui.Cells.p9) {
                ((org.telegram.ui.Cells.p9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        a3 a3Var = this.f39426c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f39424a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f39433y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        x3 x3Var = this.f39431w;
        if (x3Var != null && x3Var.f39485i != null) {
            i10 = Math.min(i10, (this.f39431w.f39485i.a() + a()) - dp);
        }
        a3 a3Var = this.f39426c;
        if (a3Var != null) {
            i10 = Math.min(i10, (a3Var.a() + a3Var.f31668s) - dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f42671a;
            if ((view instanceof d3) && (boundLeft = ((d3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f39428n + boundLeft);
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
        this.f39424a.getClass();
        int dp = AndroidUtilities.dp(18);
        x3 x3Var = this.f39431w;
        if (x3Var != null && x3Var.f39485i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f39431w.f39485i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        a3 a3Var = this.f39426c;
        if (a3Var != null) {
            i10 = Math.max(i10, a3Var.b() + a3Var.f31668s + dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f42671a;
            if ((view instanceof d3) && (boundRight = ((d3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f39428n + boundRight);
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
        a3 a3Var = this.f39426c;
        if (a3Var != null) {
            lastLineBoundRight = a3Var.c() + a3Var.f31668s;
            this.f39424a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                View view = vk0Var.f42671a;
                if ((view instanceof d3) && (lastLineBoundRight = ((d3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f39428n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.vl.b(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            vk0Var.f42671a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f39426c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f39426c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        x3 x3Var;
        int i10;
        int i11;
        if (this.f39431w != null) {
            int measuredWidth = getMeasuredWidth();
            a3 a3Var = this.f39431w.f39485i;
            u70 u70Var = this.f39424a;
            if (a3Var != null) {
                canvas.save();
                f4 f4Var = this.f39425b;
                if (f4Var != null && f4Var.G) {
                    u70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    y3 y3Var = this.f39431w.f39483c;
                    float A = org.telegram.messenger.vl.A(12.0f, y3Var.f39751f, dp - y3Var.f39750c);
                    int i12 = this.f39427f + this.h;
                    if (this.f39432x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(A, i12 - i11);
                } else {
                    u70Var.getClass();
                    float D = org.telegram.messenger.y0.D(12.0f, this.f39431w.f39483c.f39751f, (AndroidUtilities.dp(15) + this.f39431w.f39483c.f39750c) - ((int) Math.ceil(x3Var.f39485i.d.getLineWidth(0))));
                    int i13 = this.f39427f + this.h;
                    if (this.f39432x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f39431w.f39485i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f39433y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f39427f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f39433y.a(canvas);
            }
            if (this.f39426c != null) {
                canvas.save();
                canvas.translate(this.e, this.f39427f);
                h4.v(u70Var, canvas, this, 0);
                this.f39426c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f39426c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.j(this.f39424a, this.f39425b, a3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f42671a;
            int i14 = this.f39428n;
            view.layout(i14, this.f39429r, view.getMeasuredWidth() + i14, this.d.f42671a.getMeasuredHeight() + this.f39429r);
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
        x3 x3Var = this.f39431w;
        int i18 = 1;
        if (x3Var != null) {
            this.f39426c = null;
            int i19 = x3Var.f39486j;
            u70 u70Var3 = this.f39424a;
            int i20 = 0;
            if (i19 == 0 && x3Var.f39483c.f39751f == 0) {
                u70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f39427f = i12;
            this.h = 0;
            y3 y3Var = this.f39431w.f39483c;
            if (y3Var.d == size && y3Var.e == SharedConfig.ivFontSize) {
                u70Var = u70Var3;
            } else {
                y3Var.d = size;
                y3Var.e = SharedConfig.ivFontSize;
                y3Var.f39750c = 0;
                int size2 = y3Var.f39749b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    x3 x3Var2 = (x3) this.f39431w.f39483c.f39749b.get(i21);
                    String str = x3Var2.f39484f;
                    if (str != null) {
                        if (x3Var2.f39481a && "•".equalsIgnoreCase(str)) {
                            x3Var2.f39485i = null;
                        } else {
                            String str2 = x3Var2.f39484f;
                            u70Var3.getClass();
                            u70 u70Var4 = u70Var3;
                            u70Var2 = u70Var4;
                            x3Var2.f39485i = h4.q(u70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f39427f, this.f39431w, this.f39425b);
                            y3 y3Var2 = this.f39431w.f39483c;
                            y3Var2.f39750c = Math.max(y3Var2.f39750c, (int) Math.ceil(q6.d.getLineWidth(0)));
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
                if (h4.f34057n1 != null && !z10) {
                    y3 y3Var3 = this.f39431w.f39483c;
                    y3Var3.f39750c = Math.max(y3Var3.f39750c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            x3 x3Var3 = this.f39431w;
            this.f39432x = !x3Var3.f39483c.f39748a.ordered;
            if (x3Var3.f39481a) {
                if (this.f39433y == null) {
                    u70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f39433y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.i6.hl, org.telegram.ui.ActionBar.i6.f19233z5, org.telegram.ui.ActionBar.i6.f18962k7);
                    this.f39433y.d(10);
                    this.f39433y.k(true);
                    this.f39433y.i(AndroidUtilities.dp(5.0f));
                }
                this.f39433y.f(-1, this.f39431w.f39482b, false);
            } else {
                this.f39433y = null;
            }
            int i22 = 26;
            f4 f4Var = this.f39425b;
            if (f4Var != null && f4Var.G) {
                u70Var.getClass();
                if (this.f39433y == null) {
                    i22 = 0;
                }
                this.e = AndroidUtilities.dp(i22 + 18);
            } else {
                u70Var.getClass();
                if (this.f39433y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                y3 y3Var4 = this.f39431w.f39483c;
                this.e = org.telegram.messenger.y0.D(12.0f, y3Var4.f39751f, dp3 + y3Var4.f39750c);
            }
            u70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.e;
            if (f4Var != null && f4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                y3 y3Var5 = this.f39431w.f39483c;
                dp4 -= (AndroidUtilities.dp(12.0f) * y3Var5.f39751f) + (dp5 + y3Var5.f39750c);
            }
            x3 x3Var4 = this.f39431w;
            int i23 = dp4;
            TL_iv.RichText richText = x3Var4.e;
            if (richText != null) {
                if (f4Var != null && f4Var.G) {
                    alignment = org.telegram.ui.Components.jw0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                a3 p5 = h4.p(this.f39424a, this, null, richText, i23, 0, x3Var4, alignment, 0, this.f39425b);
                this.f39426c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    a3 a3Var3 = this.f39431w.f39485i;
                    if (a3Var3 != null && a3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f39431w.f39485i.d.getLineAscent(0)) - this.f39426c.d.getLineAscent(0);
                    }
                    i13 = this.f39426c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = x3Var4.d;
                if (pageBlock != null) {
                    int i24 = this.e;
                    this.f39428n = i24;
                    int i25 = this.f39427f;
                    this.f39429r = i25;
                    org.telegram.ui.Components.vk0 vk0Var = this.d;
                    if (vk0Var != null) {
                        View view = vk0Var.f42671a;
                        if (view instanceof b2) {
                            float f10 = 8;
                            this.f39429r = i25 - AndroidUtilities.dp(f10);
                            if (f4Var == null || !f4Var.G) {
                                this.f39428n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof v1) && !(view instanceof q2) && !(view instanceof u2) && !(view instanceof r2)) {
                                if (h4.L(pageBlock)) {
                                    this.f39428n = 0;
                                    this.f39429r = 0;
                                    this.f39427f = 0;
                                    x3 x3Var5 = this.f39431w;
                                    if (x3Var5.f39486j == 0 && x3Var5.f39483c.f39751f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f42671a instanceof t2) {
                                    this.f39428n -= AndroidUtilities.dp(f7);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (f4Var == null || !f4Var.G) {
                                    this.f39428n = i24 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f42671a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f42671a instanceof b2) && (a3Var = this.f39431w.f39485i) != null && a3Var.d.getLineCount() > 0 && (a3Var2 = (b2Var = (b2) this.d.f42671a).f32018c) != null && a3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f39431w.f39485i.d.getLineAscent(0)) - b2Var.f32018c.d.getLineAscent(0);
                        }
                        x3 x3Var6 = this.f39431w;
                        if (x3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f39430s = true;
                            this.f39429r = 0;
                            if (x3Var6.f39486j == 0 && x3Var6.f39483c.f39751f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f42671a;
                            if (view2 instanceof a2) {
                                this.f39430s = ((a2) view2).v;
                            } else if (view2 instanceof x1) {
                                this.f39430s = ((x1) view2).f39430s;
                            }
                        }
                        if (this.f39430s && this.f39431w.f39485i != null) {
                            this.f39427f = ((this.d.f42671a.getMeasuredHeight() - this.f39431w.f39485i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f39432x = false;
                        }
                        i13 = this.d.f42671a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (hg.c.h(1, this.f39431w.f39483c.f39749b) == this.f39431w) {
                i17 += AndroidUtilities.dp(8);
            }
            x3 x3Var7 = this.f39431w;
            if (x3Var7.f39486j == 0 && x3Var7.f39483c.f39751f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            a3 a3Var4 = this.f39426c;
            if (a3Var4 != null) {
                a3Var4.f31668s = this.e;
                a3Var4.v = this.f39427f;
            }
            org.telegram.ui.Components.vk0 vk0Var2 = this.d;
            if (vk0Var2 != null && (vk0Var2.f42671a instanceof org.telegram.ui.Cells.p9) && (q9Var = ((h4) u70Var).O0) != null) {
                ArrayList arrayList = q9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.p9) this.d.f42671a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) obj;
                    if (baVar instanceof a3) {
                        a3 a3Var5 = (a3) baVar;
                        a3Var5.f31668s += this.f39428n;
                        a3Var5.v += this.f39429r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (h4.l(this.f39424a, this.f39425b, motionEvent, this, this.f39426c, this.e, this.f39427f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(x3 x3Var) {
        x3 x3Var2 = this.f39431w;
        f4 f4Var = this.f39425b;
        if (x3Var2 != x3Var) {
            this.f39431w = x3Var;
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                removeView(vk0Var.f42671a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f39431w.d;
            if (pageBlock != null && f4Var != null) {
                int I = f4.I(pageBlock);
                this.v = I;
                s4.c1 x10 = f4Var.x(this, I);
                this.d = (org.telegram.ui.Components.vk0) x10;
                addView(x10.f42671a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f39431w.d;
        if (pageBlock2 != null && f4Var != null) {
            f4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
