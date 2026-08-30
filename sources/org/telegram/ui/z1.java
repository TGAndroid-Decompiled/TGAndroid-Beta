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
public final class z1 extends ViewGroup implements org.telegram.ui.Cells.l9, g3 {
    public final n70 f40627a;
    public final j4 f40628b;
    public d3 f40629c;
    public org.telegram.ui.Components.el0 d;
    public int e;
    public int f40630f;
    public int h;
    public int f40631n;
    public int f40632r;
    public boolean f40633s;
    public int v;
    public b4 f40634w;
    public boolean f40635x;
    public CheckBoxBase f40636y;

    public z1(Context context, n70 n70Var, j4 j4Var) {
        super(context);
        this.f40627a = n70Var;
        this.f40628b = j4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        d3 d3Var;
        b4 b4Var = this.f40634w;
        if (b4Var != null) {
            d3Var = b4Var.f32785i;
        } else {
            d3Var = null;
        }
        if (d3Var == null) {
            return 0;
        }
        n70 n70Var = this.f40627a;
        j4 j4Var = this.f40628b;
        if (j4Var != null && j4Var.D) {
            int measuredWidth = getMeasuredWidth();
            n70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            c4 c4Var = this.f40634w.f32783c;
            return b.z(12.0f, c4Var.f33089f, dp - c4Var.f33088c);
        }
        n70Var.getClass();
        return org.telegram.messenger.y3.D(12.0f, this.f40634w.f32783c.f33089f, (AndroidUtilities.dp(15) + this.f40634w.f32783c.f33088c) - ((int) Math.ceil(d3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            View view = el0Var.f5785a;
            if (view instanceof org.telegram.ui.Cells.l9) {
                ((org.telegram.ui.Cells.l9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        d3 d3Var = this.f40629c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f40627a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f40636y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        b4 b4Var = this.f40634w;
        if (b4Var != null && b4Var.f32785i != null) {
            i10 = Math.min(i10, (this.f40634w.f32785i.a() + a()) - dp);
        }
        d3 d3Var = this.f40629c;
        if (d3Var != null) {
            i10 = Math.min(i10, (d3Var.a() + d3Var.f33499s) - dp);
        }
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            View view = el0Var.f5785a;
            if ((view instanceof g3) && (boundLeft = ((g3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f40631n + boundLeft);
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
        this.f40627a.getClass();
        int dp = AndroidUtilities.dp(18);
        b4 b4Var = this.f40634w;
        if (b4Var != null && b4Var.f32785i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f40634w.f32785i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        d3 d3Var = this.f40629c;
        if (d3Var != null) {
            i10 = Math.max(i10, d3Var.b() + d3Var.f33499s + dp);
        }
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            View view = el0Var.f5785a;
            if ((view instanceof g3) && (boundRight = ((g3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f40631n + boundRight);
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
        d3 d3Var = this.f40629c;
        if (d3Var != null) {
            lastLineBoundRight = d3Var.c() + d3Var.f33499s;
            this.f40627a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.el0 el0Var = this.d;
            if (el0Var != null) {
                View view = el0Var.f5785a;
                if ((view instanceof g3) && (lastLineBoundRight = ((g3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f40631n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            el0Var.f5785a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f40629c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f40629c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        b4 b4Var;
        int i10;
        int i11;
        if (this.f40634w != null) {
            int measuredWidth = getMeasuredWidth();
            d3 d3Var = this.f40634w.f32785i;
            n70 n70Var = this.f40627a;
            if (d3Var != null) {
                canvas.save();
                j4 j4Var = this.f40628b;
                if (j4Var != null && j4Var.D) {
                    n70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    c4 c4Var = this.f40634w.f32783c;
                    float z4 = b.z(12.0f, c4Var.f33089f, dp - c4Var.f33088c);
                    int i12 = this.f40630f + this.h;
                    if (this.f40635x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(z4, i12 - i11);
                } else {
                    n70Var.getClass();
                    float D = org.telegram.messenger.y3.D(12.0f, this.f40634w.f32783c.f33089f, (AndroidUtilities.dp(15) + this.f40634w.f32783c.f33088c) - ((int) Math.ceil(b4Var.f32785i.d.getLineWidth(0))));
                    int i13 = this.f40630f + this.h;
                    if (this.f40635x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f40634w.f32785i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f40636y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f40630f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f40636y.a(canvas);
            }
            if (this.f40629c != null) {
                canvas.save();
                canvas.translate(this.e, this.f40630f);
                l4.v(n70Var, canvas, this, 0);
                this.f40629c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f40629c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.f40627a, this.f40628b, d3Var));
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            View view = el0Var.f5785a;
            int i14 = this.f40631n;
            view.layout(i14, this.f40632r, view.getMeasuredWidth() + i14, this.d.f5785a.getMeasuredHeight() + this.f40632r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        n70 n70Var;
        TextPaint textPaint;
        n70 n70Var2;
        d3 q10;
        int i13;
        int dp;
        int dp2;
        int i14;
        int i15;
        int i16;
        d3 d3Var;
        d2 d2Var;
        d3 d3Var2;
        int i17;
        org.telegram.ui.Cells.m9 m9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        b4 b4Var = this.f40634w;
        int i18 = 1;
        if (b4Var != null) {
            this.f40629c = null;
            int i19 = b4Var.f32786j;
            n70 n70Var3 = this.f40627a;
            int i20 = 0;
            if (i19 == 0 && b4Var.f32783c.f33089f == 0) {
                n70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f40630f = i12;
            this.h = 0;
            c4 c4Var = this.f40634w.f32783c;
            if (c4Var.d == size && c4Var.e == SharedConfig.ivFontSize) {
                n70Var = n70Var3;
            } else {
                c4Var.d = size;
                c4Var.e = SharedConfig.ivFontSize;
                c4Var.f33088c = 0;
                int size2 = c4Var.f33087b.size();
                boolean z4 = true;
                int i21 = 0;
                while (i21 < size2) {
                    b4 b4Var2 = (b4) this.f40634w.f32783c.f33087b.get(i21);
                    String str = b4Var2.f32784f;
                    if (str != null) {
                        if (b4Var2.f32781a && "•".equalsIgnoreCase(str)) {
                            b4Var2.f32785i = null;
                        } else {
                            String str2 = b4Var2.f32784f;
                            n70Var3.getClass();
                            n70 n70Var4 = n70Var3;
                            n70Var2 = n70Var4;
                            b4Var2.f32785i = l4.q(n70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f40630f, this.f40634w, this.f40628b);
                            c4 c4Var2 = this.f40634w.f32783c;
                            c4Var2.f33088c = Math.max(c4Var2.f33088c, (int) Math.ceil(q10.d.getLineWidth(0)));
                            z4 = false;
                            i21++;
                            n70Var3 = n70Var2;
                        }
                    }
                    n70Var2 = n70Var3;
                    i21++;
                    n70Var3 = n70Var2;
                }
                n70Var = n70Var3;
                if (l4.f35915k1 != null && !z4) {
                    c4 c4Var3 = this.f40634w.f32783c;
                    c4Var3.f33088c = Math.max(c4Var3.f33088c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            b4 b4Var3 = this.f40634w;
            this.f40635x = !b4Var3.f32783c.f33086a.ordered;
            if (b4Var3.f32781a) {
                if (this.f40636y == null) {
                    n70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f40636y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.j6.hl, org.telegram.ui.ActionBar.j6.f20297z5, org.telegram.ui.ActionBar.j6.f20032k7);
                    this.f40636y.d(10);
                    this.f40636y.k(true);
                    this.f40636y.i(AndroidUtilities.dp(5.0f));
                }
                this.f40636y.f(-1, this.f40634w.f32782b, false);
            } else {
                this.f40636y = null;
            }
            int i22 = 26;
            j4 j4Var = this.f40628b;
            if (j4Var != null && j4Var.D) {
                n70Var.getClass();
                if (this.f40636y == null) {
                    i22 = 0;
                }
                this.e = AndroidUtilities.dp(i22 + 18);
            } else {
                n70Var.getClass();
                if (this.f40636y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                c4 c4Var4 = this.f40634w.f32783c;
                this.e = org.telegram.messenger.y3.D(12.0f, c4Var4.f33089f, dp3 + c4Var4.f33088c);
            }
            n70Var.getClass();
            float f10 = 18;
            int dp4 = (size - AndroidUtilities.dp(f10)) - this.e;
            if (j4Var != null && j4Var.D) {
                int dp5 = AndroidUtilities.dp(6.0f);
                c4 c4Var5 = this.f40634w.f32783c;
                dp4 -= (AndroidUtilities.dp(12.0f) * c4Var5.f33089f) + (dp5 + c4Var5.f33088c);
            }
            b4 b4Var4 = this.f40634w;
            int i23 = dp4;
            TL_iv.RichText richText = b4Var4.e;
            if (richText != null) {
                if (j4Var != null && j4Var.D) {
                    alignment = org.telegram.ui.Components.kw0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                d3 p10 = l4.p(this.f40627a, this, null, richText, i23, 0, b4Var4, alignment, 0, this.f40628b);
                this.f40629c = p10;
                if (p10 != null && p10.d.getLineCount() > 0) {
                    d3 d3Var3 = this.f40634w.f32785i;
                    if (d3Var3 != null && d3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f40634w.f32785i.d.getLineAscent(0)) - this.f40629c.d.getLineAscent(0);
                    }
                    i13 = this.f40629c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = b4Var4.d;
                if (pageBlock != null) {
                    int i24 = this.e;
                    this.f40631n = i24;
                    int i25 = this.f40630f;
                    this.f40632r = i25;
                    org.telegram.ui.Components.el0 el0Var = this.d;
                    if (el0Var != null) {
                        View view = el0Var.f5785a;
                        if (view instanceof d2) {
                            float f11 = 8;
                            this.f40632r = i25 - AndroidUtilities.dp(f11);
                            if (j4Var == null || !j4Var.D) {
                                this.f40631n -= AndroidUtilities.dp(f10);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f10);
                            i15 = 0 - AndroidUtilities.dp(f11);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof x1) && !(view instanceof t2) && !(view instanceof x2) && !(view instanceof u2)) {
                                if (l4.L(pageBlock)) {
                                    this.f40631n = 0;
                                    this.f40632r = 0;
                                    this.f40630f = 0;
                                    b4 b4Var5 = this.f40634w;
                                    if (b4Var5.f32786j == 0 && b4Var5.f32783c.f33089f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f5785a instanceof w2) {
                                    this.f40631n -= AndroidUtilities.dp(f10);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (j4Var == null || !j4Var.D) {
                                    this.f40631n = i24 - AndroidUtilities.dp(f10);
                                }
                                dp2 = AndroidUtilities.dp(f10);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f5785a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f5785a instanceof d2) && (d3Var = this.f40634w.f32785i) != null && d3Var.d.getLineCount() > 0 && (d3Var2 = (d2Var = (d2) this.d.f5785a).f33489c) != null && d3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f40634w.f32785i.d.getLineAscent(0)) - d2Var.f33489c.d.getLineAscent(0);
                        }
                        b4 b4Var6 = this.f40634w;
                        if (b4Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f40633s = true;
                            this.f40632r = 0;
                            if (b4Var6.f32786j == 0 && b4Var6.f32783c.f33089f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f5785a;
                            if (view2 instanceof c2) {
                                this.f40633s = ((c2) view2).v;
                            } else if (view2 instanceof z1) {
                                this.f40633s = ((z1) view2).f40633s;
                            }
                        }
                        if (this.f40633s && this.f40634w.f32785i != null) {
                            this.f40630f = ((this.d.f5785a.getMeasuredHeight() - this.f40634w.f32785i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f40635x = false;
                        }
                        i13 = this.d.f5785a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (kh.a2.i(1, this.f40634w.f32783c.f33087b) == this.f40634w) {
                i17 += AndroidUtilities.dp(8);
            }
            b4 b4Var7 = this.f40634w;
            if (b4Var7.f32786j == 0 && b4Var7.f32783c.f33089f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            d3 d3Var4 = this.f40629c;
            if (d3Var4 != null) {
                d3Var4.f33499s = this.e;
                d3Var4.v = this.f40630f;
            }
            org.telegram.ui.Components.el0 el0Var2 = this.d;
            if (el0Var2 != null && (el0Var2.f5785a instanceof org.telegram.ui.Cells.l9) && (m9Var = ((l4) n70Var).L0) != null) {
                ArrayList arrayList = m9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.l9) this.d.f5785a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) obj;
                    if (x9Var instanceof d3) {
                        d3 d3Var5 = (d3) x9Var;
                        d3Var5.f33499s += this.f40631n;
                        d3Var5.v += this.f40632r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (l4.l(this.f40627a, this.f40628b, motionEvent, this, this.f40629c, this.e, this.f40630f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(b4 b4Var) {
        b4 b4Var2 = this.f40634w;
        j4 j4Var = this.f40628b;
        if (b4Var2 != b4Var) {
            this.f40634w = b4Var;
            org.telegram.ui.Components.el0 el0Var = this.d;
            if (el0Var != null) {
                removeView(el0Var.f5785a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f40634w.d;
            if (pageBlock != null && j4Var != null) {
                int I = j4.I(pageBlock);
                this.v = I;
                f2.l1 x10 = j4Var.x(this, I);
                this.d = (org.telegram.ui.Components.el0) x10;
                addView(x10.f5785a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f40634w.d;
        if (pageBlock2 != null && j4Var != null) {
            j4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
