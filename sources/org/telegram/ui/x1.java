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
public final class x1 extends ViewGroup implements org.telegram.ui.Cells.q9, d3 {
    public final u70 f39281a;
    public final f4 f39282b;
    public a3 f39283c;
    public org.telegram.ui.Components.fl0 d;
    public int e;
    public int f39284f;
    public int h;
    public int f39285n;
    public int f39286r;
    public boolean f39287s;
    public int v;
    public x3 f39288w;
    public boolean f39289x;
    public CheckBoxBase f39290y;

    public x1(Context context, u70 u70Var, f4 f4Var) {
        super(context);
        this.f39281a = u70Var;
        this.f39282b = f4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        a3 a3Var;
        x3 x3Var = this.f39288w;
        if (x3Var != null) {
            a3Var = x3Var.f39334i;
        } else {
            a3Var = null;
        }
        if (a3Var == null) {
            return 0;
        }
        u70 u70Var = this.f39281a;
        f4 f4Var = this.f39282b;
        if (f4Var != null && f4Var.G) {
            int measuredWidth = getMeasuredWidth();
            u70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            y3 y3Var = this.f39288w.f39332c;
            return org.telegram.messenger.rk.B(12.0f, y3Var.f39792f, dp - y3Var.f39791c);
        }
        u70Var.getClass();
        return org.telegram.messenger.l0.D(12.0f, this.f39288w.f39332c.f39792f, (AndroidUtilities.dp(15) + this.f39288w.f39332c.f39791c) - ((int) Math.ceil(a3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            View view = fl0Var.f42974a;
            if (view instanceof org.telegram.ui.Cells.q9) {
                ((org.telegram.ui.Cells.q9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        a3 a3Var = this.f39283c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f39281a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f39290y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        x3 x3Var = this.f39288w;
        if (x3Var != null && x3Var.f39334i != null) {
            i10 = Math.min(i10, (this.f39288w.f39334i.a() + a()) - dp);
        }
        a3 a3Var = this.f39283c;
        if (a3Var != null) {
            i10 = Math.min(i10, (a3Var.a() + a3Var.f31975s) - dp);
        }
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            View view = fl0Var.f42974a;
            if ((view instanceof d3) && (boundLeft = ((d3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f39285n + boundLeft);
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
        this.f39281a.getClass();
        int dp = AndroidUtilities.dp(18);
        x3 x3Var = this.f39288w;
        if (x3Var != null && x3Var.f39334i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f39288w.f39334i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        a3 a3Var = this.f39283c;
        if (a3Var != null) {
            i10 = Math.max(i10, a3Var.b() + a3Var.f31975s + dp);
        }
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            View view = fl0Var.f42974a;
            if ((view instanceof d3) && (boundRight = ((d3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f39285n + boundRight);
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
        a3 a3Var = this.f39283c;
        if (a3Var != null) {
            lastLineBoundRight = a3Var.c() + a3Var.f31975s;
            this.f39281a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.fl0 fl0Var = this.d;
            if (fl0Var != null) {
                View view = fl0Var.f42974a;
                if ((view instanceof d3) && (lastLineBoundRight = ((d3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f39285n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.rk.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            fl0Var.f42974a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f39283c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f39283c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        x3 x3Var;
        int i10;
        int i11;
        if (this.f39288w != null) {
            int measuredWidth = getMeasuredWidth();
            a3 a3Var = this.f39288w.f39334i;
            u70 u70Var = this.f39281a;
            if (a3Var != null) {
                canvas.save();
                f4 f4Var = this.f39282b;
                if (f4Var != null && f4Var.G) {
                    u70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    y3 y3Var = this.f39288w.f39332c;
                    float B = org.telegram.messenger.rk.B(12.0f, y3Var.f39792f, dp - y3Var.f39791c);
                    int i12 = this.f39284f + this.h;
                    if (this.f39289x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(B, i12 - i11);
                } else {
                    u70Var.getClass();
                    float D = org.telegram.messenger.l0.D(12.0f, this.f39288w.f39332c.f39792f, (AndroidUtilities.dp(15) + this.f39288w.f39332c.f39791c) - ((int) Math.ceil(x3Var.f39334i.d.getLineWidth(0))));
                    int i13 = this.f39284f + this.h;
                    if (this.f39289x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f39288w.f39334i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f39290y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f39284f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f39290y.a(canvas);
            }
            if (this.f39283c != null) {
                canvas.save();
                canvas.translate(this.e, this.f39284f);
                h4.v(u70Var, canvas, this, 0);
                this.f39283c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f39283c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.j(this.f39281a, this.f39282b, a3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            View view = fl0Var.f42974a;
            int i14 = this.f39285n;
            view.layout(i14, this.f39286r, view.getMeasuredWidth() + i14, this.d.f42974a.getMeasuredHeight() + this.f39286r);
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
        org.telegram.ui.Cells.r9 r9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        x3 x3Var = this.f39288w;
        int i18 = 1;
        if (x3Var != null) {
            this.f39283c = null;
            int i19 = x3Var.f39335j;
            u70 u70Var3 = this.f39281a;
            int i20 = 0;
            if (i19 == 0 && x3Var.f39332c.f39792f == 0) {
                u70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f39284f = i12;
            this.h = 0;
            y3 y3Var = this.f39288w.f39332c;
            if (y3Var.d == size && y3Var.e == SharedConfig.ivFontSize) {
                u70Var = u70Var3;
            } else {
                y3Var.d = size;
                y3Var.e = SharedConfig.ivFontSize;
                y3Var.f39791c = 0;
                int size2 = y3Var.f39790b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    x3 x3Var2 = (x3) this.f39288w.f39332c.f39790b.get(i21);
                    String str = x3Var2.f39333f;
                    if (str != null) {
                        if (x3Var2.f39330a && "•".equalsIgnoreCase(str)) {
                            x3Var2.f39334i = null;
                        } else {
                            String str2 = x3Var2.f39333f;
                            u70Var3.getClass();
                            u70 u70Var4 = u70Var3;
                            u70Var2 = u70Var4;
                            x3Var2.f39334i = h4.q(u70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f39284f, this.f39288w, this.f39282b);
                            y3 y3Var2 = this.f39288w.f39332c;
                            y3Var2.f39791c = Math.max(y3Var2.f39791c, (int) Math.ceil(q6.d.getLineWidth(0)));
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
                if (h4.f34081n1 != null && !z10) {
                    y3 y3Var3 = this.f39288w.f39332c;
                    y3Var3.f39791c = Math.max(y3Var3.f39791c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            x3 x3Var3 = this.f39288w;
            this.f39289x = !x3Var3.f39332c.f39789a.ordered;
            if (x3Var3.f39330a) {
                if (this.f39290y == null) {
                    u70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f39290y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.j6.hl, org.telegram.ui.ActionBar.j6.f19495z5, org.telegram.ui.ActionBar.j6.f19223k7);
                    this.f39290y.d(10);
                    this.f39290y.k(true);
                    this.f39290y.i(AndroidUtilities.dp(5.0f));
                }
                this.f39290y.f(-1, this.f39288w.f39331b, false);
            } else {
                this.f39290y = null;
            }
            int i22 = 26;
            f4 f4Var = this.f39282b;
            if (f4Var != null && f4Var.G) {
                u70Var.getClass();
                if (this.f39290y == null) {
                    i22 = 0;
                }
                this.e = AndroidUtilities.dp(i22 + 18);
            } else {
                u70Var.getClass();
                if (this.f39290y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                y3 y3Var4 = this.f39288w.f39332c;
                this.e = org.telegram.messenger.l0.D(12.0f, y3Var4.f39792f, dp3 + y3Var4.f39791c);
            }
            u70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.e;
            if (f4Var != null && f4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                y3 y3Var5 = this.f39288w.f39332c;
                dp4 -= (AndroidUtilities.dp(12.0f) * y3Var5.f39792f) + (dp5 + y3Var5.f39791c);
            }
            x3 x3Var4 = this.f39288w;
            int i23 = dp4;
            TL_iv.RichText richText = x3Var4.e;
            if (richText != null) {
                if (f4Var != null && f4Var.G) {
                    alignment = org.telegram.ui.Components.uw0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                a3 p5 = h4.p(this.f39281a, this, null, richText, i23, 0, x3Var4, alignment, 0, this.f39282b);
                this.f39283c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    a3 a3Var3 = this.f39288w.f39334i;
                    if (a3Var3 != null && a3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f39288w.f39334i.d.getLineAscent(0)) - this.f39283c.d.getLineAscent(0);
                    }
                    i13 = this.f39283c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = x3Var4.d;
                if (pageBlock != null) {
                    int i24 = this.e;
                    this.f39285n = i24;
                    int i25 = this.f39284f;
                    this.f39286r = i25;
                    org.telegram.ui.Components.fl0 fl0Var = this.d;
                    if (fl0Var != null) {
                        View view = fl0Var.f42974a;
                        if (view instanceof b2) {
                            float f10 = 8;
                            this.f39286r = i25 - AndroidUtilities.dp(f10);
                            if (f4Var == null || !f4Var.G) {
                                this.f39285n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof v1) && !(view instanceof q2) && !(view instanceof u2) && !(view instanceof r2)) {
                                if (h4.L(pageBlock)) {
                                    this.f39285n = 0;
                                    this.f39286r = 0;
                                    this.f39284f = 0;
                                    x3 x3Var5 = this.f39288w;
                                    if (x3Var5.f39335j == 0 && x3Var5.f39332c.f39792f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f42974a instanceof t2) {
                                    this.f39285n -= AndroidUtilities.dp(f7);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (f4Var == null || !f4Var.G) {
                                    this.f39285n = i24 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f42974a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f42974a instanceof b2) && (a3Var = this.f39288w.f39334i) != null && a3Var.d.getLineCount() > 0 && (a3Var2 = (b2Var = (b2) this.d.f42974a).f32240c) != null && a3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f39288w.f39334i.d.getLineAscent(0)) - b2Var.f32240c.d.getLineAscent(0);
                        }
                        x3 x3Var6 = this.f39288w;
                        if (x3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f39287s = true;
                            this.f39286r = 0;
                            if (x3Var6.f39335j == 0 && x3Var6.f39332c.f39792f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f42974a;
                            if (view2 instanceof a2) {
                                this.f39287s = ((a2) view2).v;
                            } else if (view2 instanceof x1) {
                                this.f39287s = ((x1) view2).f39287s;
                            }
                        }
                        if (this.f39287s && this.f39288w.f39334i != null) {
                            this.f39284f = ((this.d.f42974a.getMeasuredHeight() - this.f39288w.f39334i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f39289x = false;
                        }
                        i13 = this.d.f42974a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (hg.k0.g(1, this.f39288w.f39332c.f39790b) == this.f39288w) {
                i17 += AndroidUtilities.dp(8);
            }
            x3 x3Var7 = this.f39288w;
            if (x3Var7.f39335j == 0 && x3Var7.f39332c.f39792f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            a3 a3Var4 = this.f39283c;
            if (a3Var4 != null) {
                a3Var4.f31975s = this.e;
                a3Var4.v = this.f39284f;
            }
            org.telegram.ui.Components.fl0 fl0Var2 = this.d;
            if (fl0Var2 != null && (fl0Var2.f42974a instanceof org.telegram.ui.Cells.q9) && (r9Var = ((h4) u70Var).O0) != null) {
                ArrayList arrayList = r9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.q9) this.d.f42974a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) obj;
                    if (caVar instanceof a3) {
                        a3 a3Var5 = (a3) caVar;
                        a3Var5.f31975s += this.f39285n;
                        a3Var5.v += this.f39286r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (h4.l(this.f39281a, this.f39282b, motionEvent, this, this.f39283c, this.e, this.f39284f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(x3 x3Var) {
        x3 x3Var2 = this.f39288w;
        f4 f4Var = this.f39282b;
        if (x3Var2 != x3Var) {
            this.f39288w = x3Var;
            org.telegram.ui.Components.fl0 fl0Var = this.d;
            if (fl0Var != null) {
                removeView(fl0Var.f42974a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f39288w.d;
            if (pageBlock != null && f4Var != null) {
                int I = f4.I(pageBlock);
                this.v = I;
                s4.c1 x10 = f4Var.x(this, I);
                this.d = (org.telegram.ui.Components.fl0) x10;
                addView(x10.f42974a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f39288w.d;
        if (pageBlock2 != null && f4Var != null) {
            f4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
