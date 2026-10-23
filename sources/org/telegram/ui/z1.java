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
    public final f70 f44028a;
    public final i4 f44029b;
    public c3 f44030c;
    public org.telegram.ui.Components.wl0 d;
    public int e;
    public int f44031f;
    public int h;
    public int f44032n;
    public int f44033r;
    public boolean f44034s;
    public int v;
    public z3 f44035w;
    public boolean f44036x;
    public CheckBoxBase f44037y;

    public z1(Context context, f70 f70Var, i4 i4Var) {
        super(context);
        this.f44028a = f70Var;
        this.f44029b = i4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        c3 c3Var;
        z3 z3Var = this.f44035w;
        if (z3Var != null) {
            c3Var = z3Var.f44050i;
        } else {
            c3Var = null;
        }
        if (c3Var == null) {
            return 0;
        }
        f70 f70Var = this.f44028a;
        i4 i4Var = this.f44029b;
        if (i4Var != null && i4Var.G) {
            int measuredWidth = getMeasuredWidth();
            f70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            a4 a4Var = this.f44035w.f44048c;
            return org.telegram.messenger.sl.B(12.0f, a4Var.f35569f, dp - a4Var.f35568c);
        }
        f70Var.getClass();
        return org.telegram.messenger.v0.D(12.0f, this.f44035w.f44048c.f35569f, (AndroidUtilities.dp(15) + this.f44035w.f44048c.f35568c) - ((int) Math.ceil(c3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f46343a;
            if (view instanceof org.telegram.ui.Cells.n9) {
                ((org.telegram.ui.Cells.n9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        c3 c3Var = this.f44030c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f44028a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f44037y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        z3 z3Var = this.f44035w;
        if (z3Var != null && z3Var.f44050i != null) {
            i10 = Math.min(i10, (this.f44035w.f44050i.a() + a()) - dp);
        }
        c3 c3Var = this.f44030c;
        if (c3Var != null) {
            i10 = Math.min(i10, (c3Var.a() + c3Var.f36233s) - dp);
        }
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f46343a;
            if ((view instanceof f3) && (boundLeft = ((f3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f44032n + boundLeft);
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
        this.f44028a.getClass();
        int dp = AndroidUtilities.dp(18);
        z3 z3Var = this.f44035w;
        if (z3Var != null && z3Var.f44050i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f44035w.f44050i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        c3 c3Var = this.f44030c;
        if (c3Var != null) {
            i10 = Math.max(i10, c3Var.b() + c3Var.f36233s + dp);
        }
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f46343a;
            if ((view instanceof f3) && (boundRight = ((f3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f44032n + boundRight);
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
        c3 c3Var = this.f44030c;
        if (c3Var != null) {
            lastLineBoundRight = c3Var.c() + c3Var.f36233s;
            this.f44028a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.wl0 wl0Var = this.d;
            if (wl0Var != null) {
                View view = wl0Var.f46343a;
                if ((view instanceof f3) && (lastLineBoundRight = ((f3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f44032n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.sl.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            wl0Var.f46343a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f44030c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f44030c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        z3 z3Var;
        int i10;
        int i11;
        if (this.f44035w != null) {
            int measuredWidth = getMeasuredWidth();
            c3 c3Var = this.f44035w.f44050i;
            f70 f70Var = this.f44028a;
            if (c3Var != null) {
                canvas.save();
                i4 i4Var = this.f44029b;
                if (i4Var != null && i4Var.G) {
                    f70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    a4 a4Var = this.f44035w.f44048c;
                    float B = org.telegram.messenger.sl.B(12.0f, a4Var.f35569f, dp - a4Var.f35568c);
                    int i12 = this.f44031f + this.h;
                    if (this.f44036x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(B, i12 - i11);
                } else {
                    f70Var.getClass();
                    float D = org.telegram.messenger.v0.D(12.0f, this.f44035w.f44048c.f35569f, (AndroidUtilities.dp(15) + this.f44035w.f44048c.f35568c) - ((int) Math.ceil(z3Var.f44050i.d.getLineWidth(0))));
                    int i13 = this.f44031f + this.h;
                    if (this.f44036x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f44035w.f44050i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f44037y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f44031f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f44037y.a(canvas);
            }
            if (this.f44030c != null) {
                canvas.save();
                canvas.translate(this.e, this.f44031f);
                k4.v(f70Var, canvas, this, 0);
                this.f44030c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        c3 c3Var = this.f44030c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.j(this.f44028a, this.f44029b, c3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f46343a;
            int i14 = this.f44032n;
            view.layout(i14, this.f44033r, view.getMeasuredWidth() + i14, this.d.f46343a.getMeasuredHeight() + this.f44033r);
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
        z3 z3Var = this.f44035w;
        int i18 = 1;
        if (z3Var != null) {
            this.f44030c = null;
            int i19 = z3Var.f44051j;
            f70 f70Var3 = this.f44028a;
            int i20 = 0;
            if (i19 == 0 && z3Var.f44048c.f35569f == 0) {
                f70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f44031f = i12;
            this.h = 0;
            a4 a4Var = this.f44035w.f44048c;
            if (a4Var.d == size && a4Var.e == SharedConfig.ivFontSize) {
                f70Var = f70Var3;
            } else {
                a4Var.d = size;
                a4Var.e = SharedConfig.ivFontSize;
                a4Var.f35568c = 0;
                int size2 = a4Var.f35567b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    z3 z3Var2 = (z3) this.f44035w.f44048c.f35567b.get(i21);
                    String str = z3Var2.f44049f;
                    if (str != null) {
                        if (z3Var2.f44046a && "•".equalsIgnoreCase(str)) {
                            z3Var2.f44050i = null;
                        } else {
                            String str2 = z3Var2.f44049f;
                            f70Var3.getClass();
                            f70 f70Var4 = f70Var3;
                            f70Var2 = f70Var4;
                            z3Var2.f44050i = k4.q(f70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f44031f, this.f44035w, this.f44029b);
                            a4 a4Var2 = this.f44035w.f44048c;
                            a4Var2.f35568c = Math.max(a4Var2.f35568c, (int) Math.ceil(q6.d.getLineWidth(0)));
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
                if (k4.f38772o1 != null && !z10) {
                    a4 a4Var3 = this.f44035w.f44048c;
                    a4Var3.f35568c = Math.max(a4Var3.f35568c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            z3 z3Var3 = this.f44035w;
            this.f44036x = !z3Var3.f44048c.f35566a.ordered;
            if (z3Var3.f44046a) {
                if (this.f44037y == null) {
                    f70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f44037y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.k6.hl, org.telegram.ui.ActionBar.k6.f21587z5, org.telegram.ui.ActionBar.k6.f21311k7);
                    this.f44037y.d(10);
                    this.f44037y.k(true);
                    this.f44037y.i(AndroidUtilities.dp(5.0f));
                }
                this.f44037y.f(-1, this.f44035w.f44047b, false);
            } else {
                this.f44037y = null;
            }
            int i22 = 26;
            i4 i4Var = this.f44029b;
            if (i4Var != null && i4Var.G) {
                f70Var.getClass();
                if (this.f44037y == null) {
                    i22 = 0;
                }
                this.e = AndroidUtilities.dp(i22 + 18);
            } else {
                f70Var.getClass();
                if (this.f44037y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                a4 a4Var4 = this.f44035w.f44048c;
                this.e = org.telegram.messenger.v0.D(12.0f, a4Var4.f35569f, dp3 + a4Var4.f35568c);
            }
            f70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.e;
            if (i4Var != null && i4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                a4 a4Var5 = this.f44035w.f44048c;
                dp4 -= (AndroidUtilities.dp(12.0f) * a4Var5.f35569f) + (dp5 + a4Var5.f35568c);
            }
            z3 z3Var4 = this.f44035w;
            int i23 = dp4;
            TL_iv.RichText richText = z3Var4.e;
            if (richText != null) {
                if (i4Var != null && i4Var.G) {
                    alignment = org.telegram.ui.Components.ix0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                c3 p5 = k4.p(this.f44028a, this, null, richText, i23, 0, z3Var4, alignment, 0, this.f44029b);
                this.f44030c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    c3 c3Var3 = this.f44035w.f44050i;
                    if (c3Var3 != null && c3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f44035w.f44050i.d.getLineAscent(0)) - this.f44030c.d.getLineAscent(0);
                    }
                    i13 = this.f44030c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = z3Var4.d;
                if (pageBlock != null) {
                    int i24 = this.e;
                    this.f44032n = i24;
                    int i25 = this.f44031f;
                    this.f44033r = i25;
                    org.telegram.ui.Components.wl0 wl0Var = this.d;
                    if (wl0Var != null) {
                        View view = wl0Var.f46343a;
                        if (view instanceof d2) {
                            float f10 = 8;
                            this.f44033r = i25 - AndroidUtilities.dp(f10);
                            if (i4Var == null || !i4Var.G) {
                                this.f44032n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof x1) && !(view instanceof s2) && !(view instanceof w2) && !(view instanceof t2)) {
                                if (k4.L(pageBlock)) {
                                    this.f44032n = 0;
                                    this.f44033r = 0;
                                    this.f44031f = 0;
                                    z3 z3Var5 = this.f44035w;
                                    if (z3Var5.f44051j == 0 && z3Var5.f44048c.f35569f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f46343a instanceof v2) {
                                    this.f44032n -= AndroidUtilities.dp(f7);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (i4Var == null || !i4Var.G) {
                                    this.f44032n = i24 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f46343a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f46343a instanceof d2) && (c3Var = this.f44035w.f44050i) != null && c3Var.d.getLineCount() > 0 && (c3Var2 = (d2Var = (d2) this.d.f46343a).f36483c) != null && c3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f44035w.f44050i.d.getLineAscent(0)) - d2Var.f36483c.d.getLineAscent(0);
                        }
                        z3 z3Var6 = this.f44035w;
                        if (z3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f44034s = true;
                            this.f44033r = 0;
                            if (z3Var6.f44051j == 0 && z3Var6.f44048c.f35569f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f46343a;
                            if (view2 instanceof c2) {
                                this.f44034s = ((c2) view2).v;
                            } else if (view2 instanceof z1) {
                                this.f44034s = ((z1) view2).f44034s;
                            }
                        }
                        if (this.f44034s && this.f44035w.f44050i != null) {
                            this.f44031f = ((this.d.f46343a.getMeasuredHeight() - this.f44035w.f44050i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f44036x = false;
                        }
                        i13 = this.d.f46343a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (i2.o1.i(1, this.f44035w.f44048c.f35567b) == this.f44035w) {
                i17 += AndroidUtilities.dp(8);
            }
            z3 z3Var7 = this.f44035w;
            if (z3Var7.f44051j == 0 && z3Var7.f44048c.f35569f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            c3 c3Var4 = this.f44030c;
            if (c3Var4 != null) {
                c3Var4.f36233s = this.e;
                c3Var4.v = this.f44031f;
            }
            org.telegram.ui.Components.wl0 wl0Var2 = this.d;
            if (wl0Var2 != null && (wl0Var2.f46343a instanceof org.telegram.ui.Cells.n9) && (o9Var = ((k4) f70Var).P0) != null) {
                ArrayList arrayList = o9Var.A0;
                arrayList.clear();
                ((org.telegram.ui.Cells.n9) this.d.f46343a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) obj;
                    if (z9Var instanceof c3) {
                        c3 c3Var5 = (c3) z9Var;
                        c3Var5.f36233s += this.f44032n;
                        c3Var5.v += this.f44033r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (k4.l(this.f44028a, this.f44029b, motionEvent, this, this.f44030c, this.e, this.f44031f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(z3 z3Var) {
        z3 z3Var2 = this.f44035w;
        i4 i4Var = this.f44029b;
        if (z3Var2 != z3Var) {
            this.f44035w = z3Var;
            org.telegram.ui.Components.wl0 wl0Var = this.d;
            if (wl0Var != null) {
                removeView(wl0Var.f46343a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f44035w.d;
            if (pageBlock != null && i4Var != null) {
                int I = i4.I(pageBlock);
                this.v = I;
                s4.b1 x10 = i4Var.x(this, I);
                this.d = (org.telegram.ui.Components.wl0) x10;
                addView(x10.f46343a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f44035w.d;
        if (pageBlock2 != null && i4Var != null) {
            i4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
