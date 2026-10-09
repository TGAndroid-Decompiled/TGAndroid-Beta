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
public final class y1 extends ViewGroup implements org.telegram.ui.Cells.n9, e3 {
    public final t70 f44190a;
    public final g4 f44191b;
    public b3 f44192c;
    public org.telegram.ui.Components.am0 d;
    public int f44193e;
    public int f44194f;
    public int h;
    public int f44195n;
    public int f44196r;
    public boolean f44197s;
    public int v;
    public y3 f44198w;
    public boolean f44199x;
    public CheckBoxBase f44200y;

    public y1(Context context, t70 t70Var, g4 g4Var) {
        super(context);
        this.f44190a = t70Var;
        this.f44191b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        b3 b3Var;
        y3 y3Var = this.f44198w;
        if (y3Var != null) {
            b3Var = y3Var.f44235i;
        } else {
            b3Var = null;
        }
        if (b3Var == null) {
            return 0;
        }
        t70 t70Var = this.f44190a;
        g4 g4Var = this.f44191b;
        if (g4Var != null && g4Var.G) {
            int measuredWidth = getMeasuredWidth();
            t70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            z3 z3Var = this.f44198w.f44232c;
            return org.telegram.messenger.bi.B(12.0f, z3Var.f44471f, dp - z3Var.f44469c);
        }
        t70Var.getClass();
        return org.telegram.messenger.q.D(12.0f, this.f44198w.f44232c.f44471f, (AndroidUtilities.dp(15) + this.f44198w.f44232c.f44469c) - ((int) Math.ceil(b3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.am0 am0Var = this.d;
        if (am0Var != null) {
            View view = am0Var.f47656a;
            if (view instanceof org.telegram.ui.Cells.n9) {
                ((org.telegram.ui.Cells.n9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        b3 b3Var = this.f44192c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f44190a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f44200y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f44193e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        y3 y3Var = this.f44198w;
        if (y3Var != null && y3Var.f44235i != null) {
            i10 = Math.min(i10, (this.f44198w.f44235i.a() + a()) - dp);
        }
        b3 b3Var = this.f44192c;
        if (b3Var != null) {
            i10 = Math.min(i10, (b3Var.a() + b3Var.f36115s) - dp);
        }
        org.telegram.ui.Components.am0 am0Var = this.d;
        if (am0Var != null) {
            View view = am0Var.f47656a;
            if ((view instanceof e3) && (boundLeft = ((e3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f44195n + boundLeft);
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
        this.f44190a.getClass();
        int dp = AndroidUtilities.dp(18);
        y3 y3Var = this.f44198w;
        if (y3Var != null && y3Var.f44235i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f44198w.f44235i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        b3 b3Var = this.f44192c;
        if (b3Var != null) {
            i10 = Math.max(i10, b3Var.b() + b3Var.f36115s + dp);
        }
        org.telegram.ui.Components.am0 am0Var = this.d;
        if (am0Var != null) {
            View view = am0Var.f47656a;
            if ((view instanceof e3) && (boundRight = ((e3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f44195n + boundRight);
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
        b3 b3Var = this.f44192c;
        if (b3Var != null) {
            lastLineBoundRight = b3Var.c() + b3Var.f36115s;
            this.f44190a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.am0 am0Var = this.d;
            if (am0Var != null) {
                View view = am0Var.f47656a;
                if ((view instanceof e3) && (lastLineBoundRight = ((e3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f44195n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.bi.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.am0 am0Var = this.d;
        if (am0Var != null) {
            am0Var.f47656a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f44192c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f44192c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        y3 y3Var;
        int i10;
        int i11;
        if (this.f44198w != null) {
            int measuredWidth = getMeasuredWidth();
            b3 b3Var = this.f44198w.f44235i;
            t70 t70Var = this.f44190a;
            if (b3Var != null) {
                canvas.save();
                g4 g4Var = this.f44191b;
                if (g4Var != null && g4Var.G) {
                    t70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    z3 z3Var = this.f44198w.f44232c;
                    float B = org.telegram.messenger.bi.B(12.0f, z3Var.f44471f, dp - z3Var.f44469c);
                    int i12 = this.f44194f + this.h;
                    if (this.f44199x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(B, i12 - i11);
                } else {
                    t70Var.getClass();
                    float D = org.telegram.messenger.q.D(12.0f, this.f44198w.f44232c.f44471f, (AndroidUtilities.dp(15) + this.f44198w.f44232c.f44469c) - ((int) Math.ceil(y3Var.f44235i.d.getLineWidth(0))));
                    int i13 = this.f44194f + this.h;
                    if (this.f44199x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f44198w.f44235i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f44200y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f44193e - AndroidUtilities.dp(26.0f), this.f44194f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f44200y.a(canvas);
            }
            if (this.f44192c != null) {
                canvas.save();
                canvas.translate(this.f44193e, this.f44194f);
                i4.v(t70Var, canvas, this, 0);
                this.f44192c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f44192c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f44190a, this.f44191b, b3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.am0 am0Var = this.d;
        if (am0Var != null) {
            View view = am0Var.f47656a;
            int i14 = this.f44195n;
            view.layout(i14, this.f44196r, view.getMeasuredWidth() + i14, this.d.f47656a.getMeasuredHeight() + this.f44196r);
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
        org.telegram.ui.Cells.o9 o9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        y3 y3Var = this.f44198w;
        int i18 = 1;
        if (y3Var != null) {
            this.f44192c = null;
            int i19 = y3Var.f44236j;
            t70 t70Var3 = this.f44190a;
            int i20 = 0;
            if (i19 == 0 && y3Var.f44232c.f44471f == 0) {
                t70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f44194f = i12;
            this.h = 0;
            z3 z3Var = this.f44198w.f44232c;
            if (z3Var.d == size && z3Var.f44470e == SharedConfig.ivFontSize) {
                t70Var = t70Var3;
            } else {
                z3Var.d = size;
                z3Var.f44470e = SharedConfig.ivFontSize;
                z3Var.f44469c = 0;
                int size2 = z3Var.f44468b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    y3 y3Var2 = (y3) this.f44198w.f44232c.f44468b.get(i21);
                    String str = y3Var2.f44234f;
                    if (str != null) {
                        if (y3Var2.f44230a && "•".equalsIgnoreCase(str)) {
                            y3Var2.f44235i = null;
                        } else {
                            String str2 = y3Var2.f44234f;
                            t70Var3.getClass();
                            t70 t70Var4 = t70Var3;
                            t70Var2 = t70Var4;
                            y3Var2.f44235i = i4.q(t70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f44194f, this.f44198w, this.f44191b);
                            z3 z3Var2 = this.f44198w.f44232c;
                            z3Var2.f44469c = Math.max(z3Var2.f44469c, (int) Math.ceil(q6.d.getLineWidth(0)));
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
                if (i4.f38480n1 != null && !z10) {
                    z3 z3Var3 = this.f44198w.f44232c;
                    z3Var3.f44469c = Math.max(z3Var3.f44469c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            y3 y3Var3 = this.f44198w;
            this.f44199x = !y3Var3.f44232c.f44467a.ordered;
            if (y3Var3.f44230a) {
                if (this.f44200y == null) {
                    t70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f44200y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.i6.hl, org.telegram.ui.ActionBar.i6.f21198z5, org.telegram.ui.ActionBar.i6.f20926k7);
                    this.f44200y.d(10);
                    this.f44200y.k(true);
                    this.f44200y.i(AndroidUtilities.dp(5.0f));
                }
                this.f44200y.f(-1, this.f44198w.f44231b, false);
            } else {
                this.f44200y = null;
            }
            int i22 = 26;
            g4 g4Var = this.f44191b;
            if (g4Var != null && g4Var.G) {
                t70Var.getClass();
                if (this.f44200y == null) {
                    i22 = 0;
                }
                this.f44193e = AndroidUtilities.dp(i22 + 18);
            } else {
                t70Var.getClass();
                if (this.f44200y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                z3 z3Var4 = this.f44198w.f44232c;
                this.f44193e = org.telegram.messenger.q.D(12.0f, z3Var4.f44471f, dp3 + z3Var4.f44469c);
            }
            t70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.f44193e;
            if (g4Var != null && g4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                z3 z3Var5 = this.f44198w.f44232c;
                dp4 -= (AndroidUtilities.dp(12.0f) * z3Var5.f44471f) + (dp5 + z3Var5.f44469c);
            }
            y3 y3Var4 = this.f44198w;
            int i23 = dp4;
            TL_iv.RichText richText = y3Var4.f44233e;
            if (richText != null) {
                if (g4Var != null && g4Var.G) {
                    alignment = org.telegram.ui.Components.mx0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                b3 p5 = i4.p(this.f44190a, this, null, richText, i23, 0, y3Var4, alignment, 0, this.f44191b);
                this.f44192c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    b3 b3Var3 = this.f44198w.f44235i;
                    if (b3Var3 != null && b3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f44198w.f44235i.d.getLineAscent(0)) - this.f44192c.d.getLineAscent(0);
                    }
                    i13 = this.f44192c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = y3Var4.d;
                if (pageBlock != null) {
                    int i24 = this.f44193e;
                    this.f44195n = i24;
                    int i25 = this.f44194f;
                    this.f44196r = i25;
                    org.telegram.ui.Components.am0 am0Var = this.d;
                    if (am0Var != null) {
                        View view = am0Var.f47656a;
                        if (view instanceof c2) {
                            float f10 = 8;
                            this.f44196r = i25 - AndroidUtilities.dp(f10);
                            if (g4Var == null || !g4Var.G) {
                                this.f44195n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof w1) && !(view instanceof r2) && !(view instanceof v2) && !(view instanceof s2)) {
                                if (i4.L(pageBlock)) {
                                    this.f44195n = 0;
                                    this.f44196r = 0;
                                    this.f44194f = 0;
                                    y3 y3Var5 = this.f44198w;
                                    if (y3Var5.f44236j == 0 && y3Var5.f44232c.f44471f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f47656a instanceof u2) {
                                    this.f44195n -= AndroidUtilities.dp(f7);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (g4Var == null || !g4Var.G) {
                                    this.f44195n = i24 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f47656a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f47656a instanceof c2) && (b3Var = this.f44198w.f44235i) != null && b3Var.d.getLineCount() > 0 && (b3Var2 = (c2Var = (c2) this.d.f47656a).f36496c) != null && b3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f44198w.f44235i.d.getLineAscent(0)) - c2Var.f36496c.d.getLineAscent(0);
                        }
                        y3 y3Var6 = this.f44198w;
                        if (y3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f44197s = true;
                            this.f44196r = 0;
                            if (y3Var6.f44236j == 0 && y3Var6.f44232c.f44471f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f47656a;
                            if (view2 instanceof b2) {
                                this.f44197s = ((b2) view2).v;
                            } else if (view2 instanceof y1) {
                                this.f44197s = ((y1) view2).f44197s;
                            }
                        }
                        if (this.f44197s && this.f44198w.f44235i != null) {
                            this.f44194f = ((this.d.f47656a.getMeasuredHeight() - this.f44198w.f44235i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f44199x = false;
                        }
                        i13 = this.d.f47656a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (hg.c.g(1, this.f44198w.f44232c.f44468b) == this.f44198w) {
                i17 += AndroidUtilities.dp(8);
            }
            y3 y3Var7 = this.f44198w;
            if (y3Var7.f44236j == 0 && y3Var7.f44232c.f44471f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            b3 b3Var4 = this.f44192c;
            if (b3Var4 != null) {
                b3Var4.f36115s = this.f44193e;
                b3Var4.v = this.f44194f;
            }
            org.telegram.ui.Components.am0 am0Var2 = this.d;
            if (am0Var2 != null && (am0Var2.f47656a instanceof org.telegram.ui.Cells.n9) && (o9Var = ((i4) t70Var).O0) != null) {
                ArrayList arrayList = o9Var.A0;
                arrayList.clear();
                ((org.telegram.ui.Cells.n9) this.d.f47656a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) obj;
                    if (z9Var instanceof b3) {
                        b3 b3Var5 = (b3) z9Var;
                        b3Var5.f36115s += this.f44195n;
                        b3Var5.v += this.f44196r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.l(this.f44190a, this.f44191b, motionEvent, this, this.f44192c, this.f44193e, this.f44194f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(y3 y3Var) {
        y3 y3Var2 = this.f44198w;
        g4 g4Var = this.f44191b;
        if (y3Var2 != y3Var) {
            this.f44198w = y3Var;
            org.telegram.ui.Components.am0 am0Var = this.d;
            if (am0Var != null) {
                removeView(am0Var.f47656a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f44198w.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.v = I;
                s4.d1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.am0) x10;
                addView(x10.f47656a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f44198w.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
