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
public final class z1 extends ViewGroup implements org.telegram.ui.Cells.n9, f3 {
    public final f70 f43991a;
    public final i4 f43992b;
    public c3 f43993c;
    public org.telegram.ui.Components.vl0 d;
    public int e;
    public int f43994f;
    public int h;
    public int f43995n;
    public int f43996r;
    public boolean f43997s;
    public int v;
    public z3 f43998w;
    public boolean f43999x;
    public CheckBoxBase f44000y;

    public z1(Context context, f70 f70Var, i4 i4Var) {
        super(context);
        this.f43991a = f70Var;
        this.f43992b = i4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        c3 c3Var;
        z3 z3Var = this.f43998w;
        if (z3Var != null) {
            c3Var = z3Var.f44014i;
        } else {
            c3Var = null;
        }
        if (c3Var == null) {
            return 0;
        }
        f70 f70Var = this.f43991a;
        i4 i4Var = this.f43992b;
        if (i4Var != null && i4Var.G) {
            int measuredWidth = getMeasuredWidth();
            f70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            a4 a4Var = this.f43998w.f44012c;
            return org.telegram.messenger.tl.B(12.0f, a4Var.f35574f, dp - a4Var.f35573c);
        }
        f70Var.getClass();
        return org.telegram.messenger.v0.D(12.0f, this.f43998w.f44012c.f35574f, (AndroidUtilities.dp(15) + this.f43998w.f44012c.f35573c) - ((int) Math.ceil(c3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            View view = vl0Var.f46342a;
            if (view instanceof org.telegram.ui.Cells.n9) {
                ((org.telegram.ui.Cells.n9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        c3 c3Var = this.f43993c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f43991a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f44000y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        z3 z3Var = this.f43998w;
        if (z3Var != null && z3Var.f44014i != null) {
            i10 = Math.min(i10, (this.f43998w.f44014i.a() + a()) - dp);
        }
        c3 c3Var = this.f43993c;
        if (c3Var != null) {
            i10 = Math.min(i10, (c3Var.a() + c3Var.f36208s) - dp);
        }
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            View view = vl0Var.f46342a;
            if ((view instanceof f3) && (boundLeft = ((f3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f43995n + boundLeft);
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
        this.f43991a.getClass();
        int dp = AndroidUtilities.dp(18);
        z3 z3Var = this.f43998w;
        if (z3Var != null && z3Var.f44014i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f43998w.f44014i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        c3 c3Var = this.f43993c;
        if (c3Var != null) {
            i10 = Math.max(i10, c3Var.b() + c3Var.f36208s + dp);
        }
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            View view = vl0Var.f46342a;
            if ((view instanceof f3) && (boundRight = ((f3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f43995n + boundRight);
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
        c3 c3Var = this.f43993c;
        if (c3Var != null) {
            lastLineBoundRight = c3Var.c() + c3Var.f36208s;
            this.f43991a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.vl0 vl0Var = this.d;
            if (vl0Var != null) {
                View view = vl0Var.f46342a;
                if ((view instanceof f3) && (lastLineBoundRight = ((f3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f43995n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.tl.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            vl0Var.f46342a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f43993c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f43993c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        z3 z3Var;
        int i10;
        int i11;
        if (this.f43998w != null) {
            int measuredWidth = getMeasuredWidth();
            c3 c3Var = this.f43998w.f44014i;
            f70 f70Var = this.f43991a;
            if (c3Var != null) {
                canvas.save();
                i4 i4Var = this.f43992b;
                if (i4Var != null && i4Var.G) {
                    f70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    a4 a4Var = this.f43998w.f44012c;
                    float B = org.telegram.messenger.tl.B(12.0f, a4Var.f35574f, dp - a4Var.f35573c);
                    int i12 = this.f43994f + this.h;
                    if (this.f43999x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(B, i12 - i11);
                } else {
                    f70Var.getClass();
                    float D = org.telegram.messenger.v0.D(12.0f, this.f43998w.f44012c.f35574f, (AndroidUtilities.dp(15) + this.f43998w.f44012c.f35573c) - ((int) Math.ceil(z3Var.f44014i.d.getLineWidth(0))));
                    int i13 = this.f43994f + this.h;
                    if (this.f43999x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f43998w.f44014i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f44000y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f43994f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f44000y.a(canvas);
            }
            if (this.f43993c != null) {
                canvas.save();
                canvas.translate(this.e, this.f43994f);
                k4.v(f70Var, canvas, this, 0);
                this.f43993c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        c3 c3Var = this.f43993c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.j(this.f43991a, this.f43992b, c3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            View view = vl0Var.f46342a;
            int i14 = this.f43995n;
            view.layout(i14, this.f43996r, view.getMeasuredWidth() + i14, this.d.f46342a.getMeasuredHeight() + this.f43996r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        f70 f70Var;
        TextPaint textPaint;
        f70 f70Var2;
        c3 q6;
        int i13;
        int dp;
        int dp2;
        int i14;
        int i15;
        int i16;
        c3 c3Var;
        d2 d2Var;
        c3 c3Var2;
        int i17;
        org.telegram.ui.Cells.o9 o9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        z3 z3Var = this.f43998w;
        int i18 = 1;
        if (z3Var != null) {
            this.f43993c = null;
            int i19 = z3Var.f44015j;
            f70 f70Var3 = this.f43991a;
            int i20 = 0;
            if (i19 == 0 && z3Var.f44012c.f35574f == 0) {
                f70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f43994f = i12;
            this.h = 0;
            a4 a4Var = this.f43998w.f44012c;
            if (a4Var.d == size && a4Var.e == SharedConfig.ivFontSize) {
                f70Var = f70Var3;
            } else {
                a4Var.d = size;
                a4Var.e = SharedConfig.ivFontSize;
                a4Var.f35573c = 0;
                int size2 = a4Var.f35572b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    z3 z3Var2 = (z3) this.f43998w.f44012c.f35572b.get(i21);
                    String str = z3Var2.f44013f;
                    if (str != null) {
                        if (z3Var2.f44010a && "•".equalsIgnoreCase(str)) {
                            z3Var2.f44014i = null;
                        } else {
                            String str2 = z3Var2.f44013f;
                            f70Var3.getClass();
                            f70 f70Var4 = f70Var3;
                            f70Var2 = f70Var4;
                            z3Var2.f44014i = k4.q(f70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f43994f, this.f43998w, this.f43992b);
                            a4 a4Var2 = this.f43998w.f44012c;
                            a4Var2.f35573c = Math.max(a4Var2.f35573c, (int) Math.ceil(q6.d.getLineWidth(0)));
                            z10 = false;
                            i21++;
                            f70Var3 = f70Var2;
                        }
                    }
                    f70Var2 = f70Var3;
                    i21++;
                    f70Var3 = f70Var2;
                }
                f70Var = f70Var3;
                if (k4.f38741o1 != null && !z10) {
                    a4 a4Var3 = this.f43998w.f44012c;
                    a4Var3.f35573c = Math.max(a4Var3.f35573c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            z3 z3Var3 = this.f43998w;
            this.f43999x = !z3Var3.f44012c.f35571a.ordered;
            if (z3Var3.f44010a) {
                if (this.f44000y == null) {
                    f70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f44000y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.k6.hl, org.telegram.ui.ActionBar.k6.f21588z5, org.telegram.ui.ActionBar.k6.f21312k7);
                    this.f44000y.d(10);
                    this.f44000y.k(true);
                    this.f44000y.i(AndroidUtilities.dp(5.0f));
                }
                this.f44000y.f(-1, this.f43998w.f44011b, false);
            } else {
                this.f44000y = null;
            }
            int i22 = 26;
            i4 i4Var = this.f43992b;
            if (i4Var != null && i4Var.G) {
                f70Var.getClass();
                if (this.f44000y == null) {
                    i22 = 0;
                }
                this.e = AndroidUtilities.dp(i22 + 18);
            } else {
                f70Var.getClass();
                if (this.f44000y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                a4 a4Var4 = this.f43998w.f44012c;
                this.e = org.telegram.messenger.v0.D(12.0f, a4Var4.f35574f, dp3 + a4Var4.f35573c);
            }
            f70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.e;
            if (i4Var != null && i4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                a4 a4Var5 = this.f43998w.f44012c;
                dp4 -= (AndroidUtilities.dp(12.0f) * a4Var5.f35574f) + (dp5 + a4Var5.f35573c);
            }
            z3 z3Var4 = this.f43998w;
            int i23 = dp4;
            TL_iv.RichText richText = z3Var4.e;
            if (richText != null) {
                if (i4Var != null && i4Var.G) {
                    alignment = org.telegram.ui.Components.hx0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                c3 p5 = k4.p(this.f43991a, this, null, richText, i23, 0, z3Var4, alignment, 0, this.f43992b);
                this.f43993c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    c3 c3Var3 = this.f43998w.f44014i;
                    if (c3Var3 != null && c3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f43998w.f44014i.d.getLineAscent(0)) - this.f43993c.d.getLineAscent(0);
                    }
                    i13 = this.f43993c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = z3Var4.d;
                if (pageBlock != null) {
                    int i24 = this.e;
                    this.f43995n = i24;
                    int i25 = this.f43994f;
                    this.f43996r = i25;
                    org.telegram.ui.Components.vl0 vl0Var = this.d;
                    if (vl0Var != null) {
                        View view = vl0Var.f46342a;
                        if (view instanceof d2) {
                            float f10 = 8;
                            this.f43996r = i25 - AndroidUtilities.dp(f10);
                            if (i4Var == null || !i4Var.G) {
                                this.f43995n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof x1) && !(view instanceof s2) && !(view instanceof w2) && !(view instanceof t2)) {
                                if (k4.L(pageBlock)) {
                                    this.f43995n = 0;
                                    this.f43996r = 0;
                                    this.f43994f = 0;
                                    z3 z3Var5 = this.f43998w;
                                    if (z3Var5.f44015j == 0 && z3Var5.f44012c.f35574f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f46342a instanceof v2) {
                                    this.f43995n -= AndroidUtilities.dp(f7);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (i4Var == null || !i4Var.G) {
                                    this.f43995n = i24 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f46342a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f46342a instanceof d2) && (c3Var = this.f43998w.f44014i) != null && c3Var.d.getLineCount() > 0 && (c3Var2 = (d2Var = (d2) this.d.f46342a).f36451c) != null && c3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f43998w.f44014i.d.getLineAscent(0)) - d2Var.f36451c.d.getLineAscent(0);
                        }
                        z3 z3Var6 = this.f43998w;
                        if (z3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f43997s = true;
                            this.f43996r = 0;
                            if (z3Var6.f44015j == 0 && z3Var6.f44012c.f35574f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f46342a;
                            if (view2 instanceof c2) {
                                this.f43997s = ((c2) view2).v;
                            } else if (view2 instanceof z1) {
                                this.f43997s = ((z1) view2).f43997s;
                            }
                        }
                        if (this.f43997s && this.f43998w.f44014i != null) {
                            this.f43994f = ((this.d.f46342a.getMeasuredHeight() - this.f43998w.f44014i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f43999x = false;
                        }
                        i13 = this.d.f46342a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (i2.o1.i(1, this.f43998w.f44012c.f35572b) == this.f43998w) {
                i17 += AndroidUtilities.dp(8);
            }
            z3 z3Var7 = this.f43998w;
            if (z3Var7.f44015j == 0 && z3Var7.f44012c.f35574f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            c3 c3Var4 = this.f43993c;
            if (c3Var4 != null) {
                c3Var4.f36208s = this.e;
                c3Var4.v = this.f43994f;
            }
            org.telegram.ui.Components.vl0 vl0Var2 = this.d;
            if (vl0Var2 != null && (vl0Var2.f46342a instanceof org.telegram.ui.Cells.n9) && (o9Var = ((k4) f70Var).P0) != null) {
                ArrayList arrayList = o9Var.A0;
                arrayList.clear();
                ((org.telegram.ui.Cells.n9) this.d.f46342a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) obj;
                    if (z9Var instanceof c3) {
                        c3 c3Var5 = (c3) z9Var;
                        c3Var5.f36208s += this.f43995n;
                        c3Var5.v += this.f43996r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (k4.l(this.f43991a, this.f43992b, motionEvent, this, this.f43993c, this.e, this.f43994f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(z3 z3Var) {
        z3 z3Var2 = this.f43998w;
        i4 i4Var = this.f43992b;
        if (z3Var2 != z3Var) {
            this.f43998w = z3Var;
            org.telegram.ui.Components.vl0 vl0Var = this.d;
            if (vl0Var != null) {
                removeView(vl0Var.f46342a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f43998w.d;
            if (pageBlock != null && i4Var != null) {
                int I = i4.I(pageBlock);
                this.v = I;
                s4.b1 x10 = i4Var.x(this, I);
                this.d = (org.telegram.ui.Components.vl0) x10;
                addView(x10.f46342a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f43998w.d;
        if (pageBlock2 != null && i4Var != null) {
            i4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
