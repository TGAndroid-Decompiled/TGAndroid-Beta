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
public final class z1 extends ViewGroup implements org.telegram.ui.Cells.p9, f3 {
    public final s70 f40367a;
    public final h4 f40368b;
    public c3 f40369c;
    public org.telegram.ui.Components.il0 d;
    public int e;
    public int f40370f;
    public int h;
    public int f40371n;
    public int f40372r;
    public boolean f40373s;
    public int v;
    public z3 f40374w;
    public boolean f40375x;
    public CheckBoxBase f40376y;

    public z1(Context context, s70 s70Var, h4 h4Var) {
        super(context);
        this.f40367a = s70Var;
        this.f40368b = h4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        c3 c3Var;
        z3 z3Var = this.f40374w;
        if (z3Var != null) {
            c3Var = z3Var.f40389i;
        } else {
            c3Var = null;
        }
        if (c3Var == null) {
            return 0;
        }
        s70 s70Var = this.f40367a;
        h4 h4Var = this.f40368b;
        if (h4Var != null && h4Var.G) {
            int measuredWidth = getMeasuredWidth();
            s70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            a4 a4Var = this.f40374w.f40387c;
            return org.telegram.messenger.qk.B(12.0f, a4Var.f31963f, dp - a4Var.f31962c);
        }
        s70Var.getClass();
        return org.telegram.messenger.l0.D(12.0f, this.f40374w.f40387c.f31963f, (AndroidUtilities.dp(15) + this.f40374w.f40387c.f31962c) - ((int) Math.ceil(c3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f43005a;
            if (view instanceof org.telegram.ui.Cells.p9) {
                ((org.telegram.ui.Cells.p9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        c3 c3Var = this.f40369c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f40367a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f40376y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        z3 z3Var = this.f40374w;
        if (z3Var != null && z3Var.f40389i != null) {
            i10 = Math.min(i10, (this.f40374w.f40389i.a() + a()) - dp);
        }
        c3 c3Var = this.f40369c;
        if (c3Var != null) {
            i10 = Math.min(i10, (c3Var.a() + c3Var.f32507s) - dp);
        }
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f43005a;
            if ((view instanceof f3) && (boundLeft = ((f3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f40371n + boundLeft);
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
        this.f40367a.getClass();
        int dp = AndroidUtilities.dp(18);
        z3 z3Var = this.f40374w;
        if (z3Var != null && z3Var.f40389i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f40374w.f40389i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        c3 c3Var = this.f40369c;
        if (c3Var != null) {
            i10 = Math.max(i10, c3Var.b() + c3Var.f32507s + dp);
        }
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f43005a;
            if ((view instanceof f3) && (boundRight = ((f3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f40371n + boundRight);
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
        c3 c3Var = this.f40369c;
        if (c3Var != null) {
            lastLineBoundRight = c3Var.c() + c3Var.f32507s;
            this.f40367a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.il0 il0Var = this.d;
            if (il0Var != null) {
                View view = il0Var.f43005a;
                if ((view instanceof f3) && (lastLineBoundRight = ((f3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f40371n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.qk.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            il0Var.f43005a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f40369c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f40369c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        z3 z3Var;
        int i10;
        int i11;
        if (this.f40374w != null) {
            int measuredWidth = getMeasuredWidth();
            c3 c3Var = this.f40374w.f40389i;
            s70 s70Var = this.f40367a;
            if (c3Var != null) {
                canvas.save();
                h4 h4Var = this.f40368b;
                if (h4Var != null && h4Var.G) {
                    s70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    a4 a4Var = this.f40374w.f40387c;
                    float B = org.telegram.messenger.qk.B(12.0f, a4Var.f31963f, dp - a4Var.f31962c);
                    int i12 = this.f40370f + this.h;
                    if (this.f40375x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(B, i12 - i11);
                } else {
                    s70Var.getClass();
                    float D = org.telegram.messenger.l0.D(12.0f, this.f40374w.f40387c.f31963f, (AndroidUtilities.dp(15) + this.f40374w.f40387c.f31962c) - ((int) Math.ceil(z3Var.f40389i.d.getLineWidth(0))));
                    int i13 = this.f40370f + this.h;
                    if (this.f40375x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f40374w.f40389i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f40376y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f40370f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f40376y.a(canvas);
            }
            if (this.f40369c != null) {
                canvas.save();
                canvas.translate(this.e, this.f40370f);
                j4.v(s70Var, canvas, this, 0);
                this.f40369c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        c3 c3Var = this.f40369c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.j(this.f40367a, this.f40368b, c3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f43005a;
            int i14 = this.f40371n;
            view.layout(i14, this.f40372r, view.getMeasuredWidth() + i14, this.d.f43005a.getMeasuredHeight() + this.f40372r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        s70 s70Var;
        TextPaint textPaint;
        s70 s70Var2;
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
        org.telegram.ui.Cells.q9 q9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        z3 z3Var = this.f40374w;
        int i18 = 1;
        if (z3Var != null) {
            this.f40369c = null;
            int i19 = z3Var.f40390j;
            s70 s70Var3 = this.f40367a;
            int i20 = 0;
            if (i19 == 0 && z3Var.f40387c.f31963f == 0) {
                s70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f40370f = i12;
            this.h = 0;
            a4 a4Var = this.f40374w.f40387c;
            if (a4Var.d == size && a4Var.e == SharedConfig.ivFontSize) {
                s70Var = s70Var3;
            } else {
                a4Var.d = size;
                a4Var.e = SharedConfig.ivFontSize;
                a4Var.f31962c = 0;
                int size2 = a4Var.f31961b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    z3 z3Var2 = (z3) this.f40374w.f40387c.f31961b.get(i21);
                    String str = z3Var2.f40388f;
                    if (str != null) {
                        if (z3Var2.f40385a && "•".equalsIgnoreCase(str)) {
                            z3Var2.f40389i = null;
                        } else {
                            String str2 = z3Var2.f40388f;
                            s70Var3.getClass();
                            s70 s70Var4 = s70Var3;
                            s70Var2 = s70Var4;
                            z3Var2.f40389i = j4.q(s70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f40370f, this.f40374w, this.f40368b);
                            a4 a4Var2 = this.f40374w.f40387c;
                            a4Var2.f31962c = Math.max(a4Var2.f31962c, (int) Math.ceil(q6.d.getLineWidth(0)));
                            z10 = false;
                            i21++;
                            s70Var3 = s70Var2;
                        }
                    }
                    s70Var2 = s70Var3;
                    i21++;
                    s70Var3 = s70Var2;
                }
                s70Var = s70Var3;
                if (j4.f34594n1 != null && !z10) {
                    a4 a4Var3 = this.f40374w.f40387c;
                    a4Var3.f31962c = Math.max(a4Var3.f31962c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            z3 z3Var3 = this.f40374w;
            this.f40375x = !z3Var3.f40387c.f31960a.ordered;
            if (z3Var3.f40385a) {
                if (this.f40376y == null) {
                    s70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f40376y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.i6.hl, org.telegram.ui.ActionBar.i6.f19460z5, org.telegram.ui.ActionBar.i6.f19186k7);
                    this.f40376y.d(10);
                    this.f40376y.k(true);
                    this.f40376y.i(AndroidUtilities.dp(5.0f));
                }
                this.f40376y.f(-1, this.f40374w.f40386b, false);
            } else {
                this.f40376y = null;
            }
            int i22 = 26;
            h4 h4Var = this.f40368b;
            if (h4Var != null && h4Var.G) {
                s70Var.getClass();
                if (this.f40376y == null) {
                    i22 = 0;
                }
                this.e = AndroidUtilities.dp(i22 + 18);
            } else {
                s70Var.getClass();
                if (this.f40376y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                a4 a4Var4 = this.f40374w.f40387c;
                this.e = org.telegram.messenger.l0.D(12.0f, a4Var4.f31963f, dp3 + a4Var4.f31962c);
            }
            s70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.e;
            if (h4Var != null && h4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                a4 a4Var5 = this.f40374w.f40387c;
                dp4 -= (AndroidUtilities.dp(12.0f) * a4Var5.f31963f) + (dp5 + a4Var5.f31962c);
            }
            z3 z3Var4 = this.f40374w;
            int i23 = dp4;
            TL_iv.RichText richText = z3Var4.e;
            if (richText != null) {
                if (h4Var != null && h4Var.G) {
                    alignment = org.telegram.ui.Components.ww0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                c3 p5 = j4.p(this.f40367a, this, null, richText, i23, 0, z3Var4, alignment, 0, this.f40368b);
                this.f40369c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    c3 c3Var3 = this.f40374w.f40389i;
                    if (c3Var3 != null && c3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f40374w.f40389i.d.getLineAscent(0)) - this.f40369c.d.getLineAscent(0);
                    }
                    i13 = this.f40369c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = z3Var4.d;
                if (pageBlock != null) {
                    int i24 = this.e;
                    this.f40371n = i24;
                    int i25 = this.f40370f;
                    this.f40372r = i25;
                    org.telegram.ui.Components.il0 il0Var = this.d;
                    if (il0Var != null) {
                        View view = il0Var.f43005a;
                        if (view instanceof d2) {
                            float f10 = 8;
                            this.f40372r = i25 - AndroidUtilities.dp(f10);
                            if (h4Var == null || !h4Var.G) {
                                this.f40371n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof x1) && !(view instanceof s2) && !(view instanceof w2) && !(view instanceof t2)) {
                                if (j4.L(pageBlock)) {
                                    this.f40371n = 0;
                                    this.f40372r = 0;
                                    this.f40370f = 0;
                                    z3 z3Var5 = this.f40374w;
                                    if (z3Var5.f40390j == 0 && z3Var5.f40387c.f31963f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f43005a instanceof v2) {
                                    this.f40371n -= AndroidUtilities.dp(f7);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (h4Var == null || !h4Var.G) {
                                    this.f40371n = i24 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f43005a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f43005a instanceof d2) && (c3Var = this.f40374w.f40389i) != null && c3Var.d.getLineCount() > 0 && (c3Var2 = (d2Var = (d2) this.d.f43005a).f32847c) != null && c3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f40374w.f40389i.d.getLineAscent(0)) - d2Var.f32847c.d.getLineAscent(0);
                        }
                        z3 z3Var6 = this.f40374w;
                        if (z3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f40373s = true;
                            this.f40372r = 0;
                            if (z3Var6.f40390j == 0 && z3Var6.f40387c.f31963f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f43005a;
                            if (view2 instanceof c2) {
                                this.f40373s = ((c2) view2).v;
                            } else if (view2 instanceof z1) {
                                this.f40373s = ((z1) view2).f40373s;
                            }
                        }
                        if (this.f40373s && this.f40374w.f40389i != null) {
                            this.f40370f = ((this.d.f43005a.getMeasuredHeight() - this.f40374w.f40389i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f40375x = false;
                        }
                        i13 = this.d.f43005a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (hg.k0.g(1, this.f40374w.f40387c.f31961b) == this.f40374w) {
                i17 += AndroidUtilities.dp(8);
            }
            z3 z3Var7 = this.f40374w;
            if (z3Var7.f40390j == 0 && z3Var7.f40387c.f31963f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            c3 c3Var4 = this.f40369c;
            if (c3Var4 != null) {
                c3Var4.f32507s = this.e;
                c3Var4.v = this.f40370f;
            }
            org.telegram.ui.Components.il0 il0Var2 = this.d;
            if (il0Var2 != null && (il0Var2.f43005a instanceof org.telegram.ui.Cells.p9) && (q9Var = ((j4) s70Var).O0) != null) {
                ArrayList arrayList = q9Var.F0;
                arrayList.clear();
                ((org.telegram.ui.Cells.p9) this.d.f43005a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) obj;
                    if (baVar instanceof c3) {
                        c3 c3Var5 = (c3) baVar;
                        c3Var5.f32507s += this.f40371n;
                        c3Var5.v += this.f40372r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (j4.l(this.f40367a, this.f40368b, motionEvent, this, this.f40369c, this.e, this.f40370f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(z3 z3Var) {
        z3 z3Var2 = this.f40374w;
        h4 h4Var = this.f40368b;
        if (z3Var2 != z3Var) {
            this.f40374w = z3Var;
            org.telegram.ui.Components.il0 il0Var = this.d;
            if (il0Var != null) {
                removeView(il0Var.f43005a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f40374w.d;
            if (pageBlock != null && h4Var != null) {
                int I = h4.I(pageBlock);
                this.v = I;
                s4.c1 x10 = h4Var.x(this, I);
                this.d = (org.telegram.ui.Components.il0) x10;
                addView(x10.f43005a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f40374w.d;
        if (pageBlock2 != null && h4Var != null) {
            h4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
