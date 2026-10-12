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
    public final w70 f44229a;
    public final g4 f44230b;
    public b3 f44231c;
    public org.telegram.ui.Components.gm0 d;
    public int f44232e;
    public int f44233f;
    public int h;
    public int f44234n;
    public int f44235r;
    public boolean f44236s;
    public int v;
    public y3 f44237w;
    public boolean f44238x;
    public CheckBoxBase f44239y;

    public y1(Context context, w70 w70Var, g4 g4Var) {
        super(context);
        this.f44229a = w70Var;
        this.f44230b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        b3 b3Var;
        y3 y3Var = this.f44237w;
        if (y3Var != null) {
            b3Var = y3Var.f44284i;
        } else {
            b3Var = null;
        }
        if (b3Var == null) {
            return 0;
        }
        w70 w70Var = this.f44229a;
        g4 g4Var = this.f44230b;
        if (g4Var != null && g4Var.G) {
            int measuredWidth = getMeasuredWidth();
            w70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            z3 z3Var = this.f44237w.f44281c;
            return org.telegram.messenger.am.B(12.0f, z3Var.f44608f, dp - z3Var.f44606c);
        }
        w70Var.getClass();
        return org.telegram.messenger.v0.D(12.0f, this.f44237w.f44281c.f44608f, (AndroidUtilities.dp(15) + this.f44237w.f44281c.f44606c) - ((int) Math.ceil(b3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.gm0 gm0Var = this.d;
        if (gm0Var != null) {
            View view = gm0Var.f47889a;
            if (view instanceof org.telegram.ui.Cells.n9) {
                ((org.telegram.ui.Cells.n9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        b3 b3Var = this.f44231c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f44229a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f44239y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f44232e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        y3 y3Var = this.f44237w;
        if (y3Var != null && y3Var.f44284i != null) {
            i10 = Math.min(i10, (this.f44237w.f44284i.a() + a()) - dp);
        }
        b3 b3Var = this.f44231c;
        if (b3Var != null) {
            i10 = Math.min(i10, (b3Var.a() + b3Var.f36044s) - dp);
        }
        org.telegram.ui.Components.gm0 gm0Var = this.d;
        if (gm0Var != null) {
            View view = gm0Var.f47889a;
            if ((view instanceof e3) && (boundLeft = ((e3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f44234n + boundLeft);
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
        this.f44229a.getClass();
        int dp = AndroidUtilities.dp(18);
        y3 y3Var = this.f44237w;
        if (y3Var != null && y3Var.f44284i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f44237w.f44284i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        b3 b3Var = this.f44231c;
        if (b3Var != null) {
            i10 = Math.max(i10, b3Var.b() + b3Var.f36044s + dp);
        }
        org.telegram.ui.Components.gm0 gm0Var = this.d;
        if (gm0Var != null) {
            View view = gm0Var.f47889a;
            if ((view instanceof e3) && (boundRight = ((e3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f44234n + boundRight);
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
        b3 b3Var = this.f44231c;
        if (b3Var != null) {
            lastLineBoundRight = b3Var.c() + b3Var.f36044s;
            this.f44229a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.gm0 gm0Var = this.d;
            if (gm0Var != null) {
                View view = gm0Var.f47889a;
                if ((view instanceof e3) && (lastLineBoundRight = ((e3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f44234n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.am.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.gm0 gm0Var = this.d;
        if (gm0Var != null) {
            gm0Var.f47889a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f44231c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f44231c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        y3 y3Var;
        int i10;
        int i11;
        if (this.f44237w != null) {
            int measuredWidth = getMeasuredWidth();
            b3 b3Var = this.f44237w.f44284i;
            w70 w70Var = this.f44229a;
            if (b3Var != null) {
                canvas.save();
                g4 g4Var = this.f44230b;
                if (g4Var != null && g4Var.G) {
                    w70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    z3 z3Var = this.f44237w.f44281c;
                    float B = org.telegram.messenger.am.B(12.0f, z3Var.f44608f, dp - z3Var.f44606c);
                    int i12 = this.f44233f + this.h;
                    if (this.f44238x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(B, i12 - i11);
                } else {
                    w70Var.getClass();
                    float D = org.telegram.messenger.v0.D(12.0f, this.f44237w.f44281c.f44608f, (AndroidUtilities.dp(15) + this.f44237w.f44281c.f44606c) - ((int) Math.ceil(y3Var.f44284i.d.getLineWidth(0))));
                    int i13 = this.f44233f + this.h;
                    if (this.f44238x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f44237w.f44284i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f44239y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f44232e - AndroidUtilities.dp(26.0f), this.f44233f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f44239y.a(canvas);
            }
            if (this.f44231c != null) {
                canvas.save();
                canvas.translate(this.f44232e, this.f44233f);
                i4.v(w70Var, canvas, this, 0);
                this.f44231c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f44231c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f44229a, this.f44230b, b3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.gm0 gm0Var = this.d;
        if (gm0Var != null) {
            View view = gm0Var.f47889a;
            int i14 = this.f44234n;
            view.layout(i14, this.f44235r, view.getMeasuredWidth() + i14, this.d.f47889a.getMeasuredHeight() + this.f44235r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        w70 w70Var;
        TextPaint textPaint;
        w70 w70Var2;
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
        y3 y3Var = this.f44237w;
        int i18 = 1;
        if (y3Var != null) {
            this.f44231c = null;
            int i19 = y3Var.f44285j;
            w70 w70Var3 = this.f44229a;
            int i20 = 0;
            if (i19 == 0 && y3Var.f44281c.f44608f == 0) {
                w70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f44233f = i12;
            this.h = 0;
            z3 z3Var = this.f44237w.f44281c;
            if (z3Var.d == size && z3Var.f44607e == SharedConfig.ivFontSize) {
                w70Var = w70Var3;
            } else {
                z3Var.d = size;
                z3Var.f44607e = SharedConfig.ivFontSize;
                z3Var.f44606c = 0;
                int size2 = z3Var.f44605b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    y3 y3Var2 = (y3) this.f44237w.f44281c.f44605b.get(i21);
                    String str = y3Var2.f44283f;
                    if (str != null) {
                        if (y3Var2.f44279a && "•".equalsIgnoreCase(str)) {
                            y3Var2.f44284i = null;
                        } else {
                            String str2 = y3Var2.f44283f;
                            w70Var3.getClass();
                            w70 w70Var4 = w70Var3;
                            w70Var2 = w70Var4;
                            y3Var2.f44284i = i4.q(w70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f44233f, this.f44237w, this.f44230b);
                            z3 z3Var2 = this.f44237w.f44281c;
                            z3Var2.f44606c = Math.max(z3Var2.f44606c, (int) Math.ceil(q6.d.getLineWidth(0)));
                            z10 = false;
                            i21++;
                            w70Var3 = w70Var2;
                        }
                    }
                    w70Var2 = w70Var3;
                    i21++;
                    w70Var3 = w70Var2;
                }
                w70Var = w70Var3;
                if (i4.f38628n1 != null && !z10) {
                    z3 z3Var3 = this.f44237w.f44281c;
                    z3Var3.f44606c = Math.max(z3Var3.f44606c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            y3 y3Var3 = this.f44237w;
            this.f44238x = !y3Var3.f44281c.f44604a.ordered;
            if (y3Var3.f44279a) {
                if (this.f44239y == null) {
                    w70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f44239y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.h6.hl, org.telegram.ui.ActionBar.h6.f20962z5, org.telegram.ui.ActionBar.h6.f20688k7);
                    this.f44239y.d(10);
                    this.f44239y.k(true);
                    this.f44239y.i(AndroidUtilities.dp(5.0f));
                }
                this.f44239y.f(-1, this.f44237w.f44280b, false);
            } else {
                this.f44239y = null;
            }
            int i22 = 26;
            g4 g4Var = this.f44230b;
            if (g4Var != null && g4Var.G) {
                w70Var.getClass();
                if (this.f44239y == null) {
                    i22 = 0;
                }
                this.f44232e = AndroidUtilities.dp(i22 + 18);
            } else {
                w70Var.getClass();
                if (this.f44239y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                z3 z3Var4 = this.f44237w.f44281c;
                this.f44232e = org.telegram.messenger.v0.D(12.0f, z3Var4.f44608f, dp3 + z3Var4.f44606c);
            }
            w70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.f44232e;
            if (g4Var != null && g4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                z3 z3Var5 = this.f44237w.f44281c;
                dp4 -= (AndroidUtilities.dp(12.0f) * z3Var5.f44608f) + (dp5 + z3Var5.f44606c);
            }
            y3 y3Var4 = this.f44237w;
            int i23 = dp4;
            TL_iv.RichText richText = y3Var4.f44282e;
            if (richText != null) {
                if (g4Var != null && g4Var.G) {
                    alignment = org.telegram.ui.Components.sx0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                b3 p5 = i4.p(this.f44229a, this, null, richText, i23, 0, y3Var4, alignment, 0, this.f44230b);
                this.f44231c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    b3 b3Var3 = this.f44237w.f44284i;
                    if (b3Var3 != null && b3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f44237w.f44284i.d.getLineAscent(0)) - this.f44231c.d.getLineAscent(0);
                    }
                    i13 = this.f44231c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = y3Var4.d;
                if (pageBlock != null) {
                    int i24 = this.f44232e;
                    this.f44234n = i24;
                    int i25 = this.f44233f;
                    this.f44235r = i25;
                    org.telegram.ui.Components.gm0 gm0Var = this.d;
                    if (gm0Var != null) {
                        View view = gm0Var.f47889a;
                        if (view instanceof c2) {
                            float f10 = 8;
                            this.f44235r = i25 - AndroidUtilities.dp(f10);
                            if (g4Var == null || !g4Var.G) {
                                this.f44234n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof w1) && !(view instanceof r2) && !(view instanceof v2) && !(view instanceof s2)) {
                                if (i4.L(pageBlock)) {
                                    this.f44234n = 0;
                                    this.f44235r = 0;
                                    this.f44233f = 0;
                                    y3 y3Var5 = this.f44237w;
                                    if (y3Var5.f44285j == 0 && y3Var5.f44281c.f44608f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f47889a instanceof u2) {
                                    this.f44234n -= AndroidUtilities.dp(f7);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (g4Var == null || !g4Var.G) {
                                    this.f44234n = i24 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f47889a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f47889a instanceof c2) && (b3Var = this.f44237w.f44284i) != null && b3Var.d.getLineCount() > 0 && (b3Var2 = (c2Var = (c2) this.d.f47889a).f36301c) != null && b3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f44237w.f44284i.d.getLineAscent(0)) - c2Var.f36301c.d.getLineAscent(0);
                        }
                        y3 y3Var6 = this.f44237w;
                        if (y3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f44236s = true;
                            this.f44235r = 0;
                            if (y3Var6.f44285j == 0 && y3Var6.f44281c.f44608f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f47889a;
                            if (view2 instanceof b2) {
                                this.f44236s = ((b2) view2).v;
                            } else if (view2 instanceof y1) {
                                this.f44236s = ((y1) view2).f44236s;
                            }
                        }
                        if (this.f44236s && this.f44237w.f44284i != null) {
                            this.f44233f = ((this.d.f47889a.getMeasuredHeight() - this.f44237w.f44284i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f44238x = false;
                        }
                        i13 = this.d.f47889a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (hg.c.h(1, this.f44237w.f44281c.f44605b) == this.f44237w) {
                i17 += AndroidUtilities.dp(8);
            }
            y3 y3Var7 = this.f44237w;
            if (y3Var7.f44285j == 0 && y3Var7.f44281c.f44608f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            b3 b3Var4 = this.f44231c;
            if (b3Var4 != null) {
                b3Var4.f36044s = this.f44232e;
                b3Var4.v = this.f44233f;
            }
            org.telegram.ui.Components.gm0 gm0Var2 = this.d;
            if (gm0Var2 != null && (gm0Var2.f47889a instanceof org.telegram.ui.Cells.n9) && (o9Var = ((i4) w70Var).O0) != null) {
                ArrayList arrayList = o9Var.A0;
                arrayList.clear();
                ((org.telegram.ui.Cells.n9) this.d.f47889a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) obj;
                    if (z9Var instanceof b3) {
                        b3 b3Var5 = (b3) z9Var;
                        b3Var5.f36044s += this.f44234n;
                        b3Var5.v += this.f44235r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.l(this.f44229a, this.f44230b, motionEvent, this, this.f44231c, this.f44232e, this.f44233f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(y3 y3Var) {
        y3 y3Var2 = this.f44237w;
        g4 g4Var = this.f44230b;
        if (y3Var2 != y3Var) {
            this.f44237w = y3Var;
            org.telegram.ui.Components.gm0 gm0Var = this.d;
            if (gm0Var != null) {
                removeView(gm0Var.f47889a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f44237w.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.v = I;
                s4.d1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.gm0) x10;
                addView(x10.f47889a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f44237w.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
