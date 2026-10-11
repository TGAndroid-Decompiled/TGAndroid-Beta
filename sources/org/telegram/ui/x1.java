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
public final class x1 extends ViewGroup implements org.telegram.ui.Cells.n9, d3 {
    public final t70 f43951a;
    public final f4 f43952b;
    public a3 f43953c;
    public org.telegram.ui.Components.bm0 d;
    public int f43954e;
    public int f43955f;
    public int h;
    public int f43956n;
    public int f43957r;
    public boolean f43958s;
    public int v;
    public x3 f43959w;
    public boolean f43960x;
    public CheckBoxBase f43961y;

    public x1(Context context, t70 t70Var, f4 f4Var) {
        super(context);
        this.f43951a = t70Var;
        this.f43952b = f4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        a3 a3Var;
        x3 x3Var = this.f43959w;
        if (x3Var != null) {
            a3Var = x3Var.f43995i;
        } else {
            a3Var = null;
        }
        if (a3Var == null) {
            return 0;
        }
        t70 t70Var = this.f43951a;
        f4 f4Var = this.f43952b;
        if (f4Var != null && f4Var.G) {
            int measuredWidth = getMeasuredWidth();
            t70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(15);
            y3 y3Var = this.f43959w.f43992c;
            return org.telegram.messenger.ai.B(12.0f, y3Var.f44280f, dp - y3Var.f44278c);
        }
        t70Var.getClass();
        return org.telegram.messenger.q.D(12.0f, this.f43959w.f43992c.f44280f, (AndroidUtilities.dp(15) + this.f43959w.f43992c.f44278c) - ((int) Math.ceil(a3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.bm0 bm0Var = this.d;
        if (bm0Var != null) {
            View view = bm0Var.f47782a;
            if (view instanceof org.telegram.ui.Cells.n9) {
                ((org.telegram.ui.Cells.n9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        a3 a3Var = this.f43953c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f43951a.getClass();
        int dp = AndroidUtilities.dp(18);
        if (this.f43961y != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f43954e - AndroidUtilities.dp(26.0f)) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        x3 x3Var = this.f43959w;
        if (x3Var != null && x3Var.f43995i != null) {
            i10 = Math.min(i10, (this.f43959w.f43995i.a() + a()) - dp);
        }
        a3 a3Var = this.f43953c;
        if (a3Var != null) {
            i10 = Math.min(i10, (a3Var.a() + a3Var.f35896s) - dp);
        }
        org.telegram.ui.Components.bm0 bm0Var = this.d;
        if (bm0Var != null) {
            View view = bm0Var.f47782a;
            if ((view instanceof d3) && (boundLeft = ((d3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f43956n + boundLeft);
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
        this.f43951a.getClass();
        int dp = AndroidUtilities.dp(18);
        x3 x3Var = this.f43959w;
        if (x3Var != null && x3Var.f43995i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f43959w.f43995i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        a3 a3Var = this.f43953c;
        if (a3Var != null) {
            i10 = Math.max(i10, a3Var.b() + a3Var.f35896s + dp);
        }
        org.telegram.ui.Components.bm0 bm0Var = this.d;
        if (bm0Var != null) {
            View view = bm0Var.f47782a;
            if ((view instanceof d3) && (boundRight = ((d3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f43956n + boundRight);
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
        a3 a3Var = this.f43953c;
        if (a3Var != null) {
            lastLineBoundRight = a3Var.c() + a3Var.f35896s;
            this.f43951a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.bm0 bm0Var = this.d;
            if (bm0Var != null) {
                View view = bm0Var.f47782a;
                if ((view instanceof d3) && (lastLineBoundRight = ((d3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f43956n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ai.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.bm0 bm0Var = this.d;
        if (bm0Var != null) {
            bm0Var.f47782a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f43953c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f43953c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        x3 x3Var;
        int i10;
        int i11;
        if (this.f43959w != null) {
            int measuredWidth = getMeasuredWidth();
            a3 a3Var = this.f43959w.f43995i;
            t70 t70Var = this.f43951a;
            if (a3Var != null) {
                canvas.save();
                f4 f4Var = this.f43952b;
                if (f4Var != null && f4Var.G) {
                    t70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(15);
                    y3 y3Var = this.f43959w.f43992c;
                    float B = org.telegram.messenger.ai.B(12.0f, y3Var.f44280f, dp - y3Var.f44278c);
                    int i12 = this.f43955f + this.h;
                    if (this.f43960x) {
                        i11 = AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(B, i12 - i11);
                } else {
                    t70Var.getClass();
                    float D = org.telegram.messenger.q.D(12.0f, this.f43959w.f43992c.f44280f, (AndroidUtilities.dp(15) + this.f43959w.f43992c.f44278c) - ((int) Math.ceil(x3Var.f43995i.d.getLineWidth(0))));
                    int i13 = this.f43955f + this.h;
                    if (this.f43960x) {
                        i10 = AndroidUtilities.dp(1.0f);
                    } else {
                        i10 = 0;
                    }
                    canvas.translate(D, i13 - i10);
                }
                this.f43959w.f43995i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f43961y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f43954e - AndroidUtilities.dp(26.0f), this.f43955f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f43961y.a(canvas);
            }
            if (this.f43953c != null) {
                canvas.save();
                canvas.translate(this.f43954e, this.f43955f);
                h4.v(t70Var, canvas, this, 0);
                this.f43953c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f43953c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.j(this.f43951a, this.f43952b, a3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.bm0 bm0Var = this.d;
        if (bm0Var != null) {
            View view = bm0Var.f47782a;
            int i14 = this.f43956n;
            view.layout(i14, this.f43957r, view.getMeasuredWidth() + i14, this.d.f47782a.getMeasuredHeight() + this.f43957r);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        t70 t70Var;
        TextPaint textPaint;
        t70 t70Var2;
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
        org.telegram.ui.Cells.o9 o9Var;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        x3 x3Var = this.f43959w;
        int i18 = 1;
        if (x3Var != null) {
            this.f43953c = null;
            int i19 = x3Var.f43996j;
            t70 t70Var3 = this.f43951a;
            int i20 = 0;
            if (i19 == 0 && x3Var.f43992c.f44280f == 0) {
                t70Var3.getClass();
                i12 = AndroidUtilities.dp(10);
            } else {
                i12 = 0;
            }
            this.f43955f = i12;
            this.h = 0;
            y3 y3Var = this.f43959w.f43992c;
            if (y3Var.d == size && y3Var.f44279e == SharedConfig.ivFontSize) {
                t70Var = t70Var3;
            } else {
                y3Var.d = size;
                y3Var.f44279e = SharedConfig.ivFontSize;
                y3Var.f44278c = 0;
                int size2 = y3Var.f44277b.size();
                boolean z10 = true;
                int i21 = 0;
                while (i21 < size2) {
                    x3 x3Var2 = (x3) this.f43959w.f43992c.f44277b.get(i21);
                    String str = x3Var2.f43994f;
                    if (str != null) {
                        if (x3Var2.f43990a && "•".equalsIgnoreCase(str)) {
                            x3Var2.f43995i = null;
                        } else {
                            String str2 = x3Var2.f43994f;
                            t70Var3.getClass();
                            t70 t70Var4 = t70Var3;
                            t70Var2 = t70Var4;
                            x3Var2.f43995i = h4.q(t70Var4, this, str2, null, size - AndroidUtilities.dp(54), this.f43955f, this.f43959w, this.f43952b);
                            y3 y3Var2 = this.f43959w.f43992c;
                            y3Var2.f44278c = Math.max(y3Var2.f44278c, (int) Math.ceil(q6.d.getLineWidth(0)));
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
                if (h4.f38286n1 != null && !z10) {
                    y3 y3Var3 = this.f43959w.f43992c;
                    y3Var3.f44278c = Math.max(y3Var3.f44278c, (int) Math.ceil(textPaint.measureText("00.")));
                }
            }
            x3 x3Var3 = this.f43959w;
            this.f43960x = !x3Var3.f43992c.f44276a.ordered;
            if (x3Var3.f43990a) {
                if (this.f43961y == null) {
                    t70Var.getClass();
                    CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, null);
                    this.f43961y = checkBoxBase;
                    checkBoxBase.h(org.telegram.ui.ActionBar.h6.hl, org.telegram.ui.ActionBar.h6.f21224z5, org.telegram.ui.ActionBar.h6.f20951k7);
                    this.f43961y.d(10);
                    this.f43961y.k(true);
                    this.f43961y.i(AndroidUtilities.dp(5.0f));
                }
                this.f43961y.f(-1, this.f43959w.f43991b, false);
            } else {
                this.f43961y = null;
            }
            int i22 = 26;
            f4 f4Var = this.f43952b;
            if (f4Var != null && f4Var.G) {
                t70Var.getClass();
                if (this.f43961y == null) {
                    i22 = 0;
                }
                this.f43954e = AndroidUtilities.dp(i22 + 18);
            } else {
                t70Var.getClass();
                if (this.f43961y == null) {
                    i22 = 0;
                }
                int dp3 = AndroidUtilities.dp(i22 + 24);
                y3 y3Var4 = this.f43959w.f43992c;
                this.f43954e = org.telegram.messenger.q.D(12.0f, y3Var4.f44280f, dp3 + y3Var4.f44278c);
            }
            t70Var.getClass();
            float f7 = 18;
            int dp4 = (size - AndroidUtilities.dp(f7)) - this.f43954e;
            if (f4Var != null && f4Var.G) {
                int dp5 = AndroidUtilities.dp(6.0f);
                y3 y3Var5 = this.f43959w.f43992c;
                dp4 -= (AndroidUtilities.dp(12.0f) * y3Var5.f44280f) + (dp5 + y3Var5.f44278c);
            }
            x3 x3Var4 = this.f43959w;
            int i23 = dp4;
            TL_iv.RichText richText = x3Var4.f43993e;
            if (richText != null) {
                if (f4Var != null && f4Var.G) {
                    alignment = org.telegram.ui.Components.nx0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                a3 p5 = h4.p(this.f43951a, this, null, richText, i23, 0, x3Var4, alignment, 0, this.f43952b);
                this.f43953c = p5;
                if (p5 != null && p5.d.getLineCount() > 0) {
                    a3 a3Var3 = this.f43959w.f43995i;
                    if (a3Var3 != null && a3Var3.d.getLineCount() > 0) {
                        this.h = (AndroidUtilities.dp(2.5f) + this.f43959w.f43995i.d.getLineAscent(0)) - this.f43953c.d.getLineAscent(0);
                    }
                    i13 = this.f43953c.d.getHeight();
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            } else {
                TL_iv.PageBlock pageBlock = x3Var4.d;
                if (pageBlock != null) {
                    int i24 = this.f43954e;
                    this.f43956n = i24;
                    int i25 = this.f43955f;
                    this.f43957r = i25;
                    org.telegram.ui.Components.bm0 bm0Var = this.d;
                    if (bm0Var != null) {
                        View view = bm0Var.f47782a;
                        if (view instanceof b2) {
                            float f10 = 8;
                            this.f43957r = i25 - AndroidUtilities.dp(f10);
                            if (f4Var == null || !f4Var.G) {
                                this.f43956n -= AndroidUtilities.dp(f7);
                            }
                            int dp6 = i23 + AndroidUtilities.dp(f7);
                            i15 = 0 - AndroidUtilities.dp(f10);
                            i14 = dp6;
                        } else {
                            if (!(view instanceof v1) && !(view instanceof q2) && !(view instanceof u2) && !(view instanceof r2)) {
                                if (h4.L(pageBlock)) {
                                    this.f43956n = 0;
                                    this.f43957r = 0;
                                    this.f43955f = 0;
                                    x3 x3Var5 = this.f43959w;
                                    if (x3Var5.f43996j == 0 && x3Var5.f43992c.f44280f == 0) {
                                        i16 = 0 - AndroidUtilities.dp(10);
                                    } else {
                                        i16 = 0;
                                    }
                                    i15 = i16 - AndroidUtilities.dp(8);
                                    i14 = size;
                                } else if (this.d.f47782a instanceof t2) {
                                    this.f43956n -= AndroidUtilities.dp(f7);
                                    dp2 = AndroidUtilities.dp(36);
                                } else {
                                    i14 = i23;
                                    i15 = 0;
                                }
                            } else {
                                if (f4Var == null || !f4Var.G) {
                                    this.f43956n = i24 - AndroidUtilities.dp(f7);
                                }
                                dp2 = AndroidUtilities.dp(f7);
                            }
                            i14 = dp2 + i23;
                            i15 = 0;
                        }
                        this.d.f47782a.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.d.f47782a instanceof b2) && (a3Var = this.f43959w.f43995i) != null && a3Var.d.getLineCount() > 0 && (a3Var2 = (b2Var = (b2) this.d.f47782a).f36276c) != null && a3Var2.d.getLineCount() > 0) {
                            this.h = (AndroidUtilities.dp(2.5f) + this.f43959w.f43995i.d.getLineAscent(0)) - b2Var.f36276c.d.getLineAscent(0);
                        }
                        x3 x3Var6 = this.f43959w;
                        if (x3Var6.d instanceof TL_iv.pageBlockDetails) {
                            this.f43958s = true;
                            this.f43957r = 0;
                            if (x3Var6.f43996j == 0 && x3Var6.f43992c.f44280f == 0) {
                                i15 -= AndroidUtilities.dp(10);
                            }
                            i15 -= AndroidUtilities.dp(8);
                        } else {
                            View view2 = this.d.f47782a;
                            if (view2 instanceof a2) {
                                this.f43958s = ((a2) view2).v;
                            } else if (view2 instanceof x1) {
                                this.f43958s = ((x1) view2).f43958s;
                            }
                        }
                        if (this.f43958s && this.f43959w.f43995i != null) {
                            this.f43955f = ((this.d.f47782a.getMeasuredHeight() - this.f43959w.f43995i.d.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.f43960x = false;
                        }
                        i13 = this.d.f47782a.getMeasuredHeight() + i15;
                    } else {
                        i13 = 0;
                    }
                    dp = AndroidUtilities.dp(8);
                    i17 = dp + i13;
                }
                i17 = 0;
            }
            if (hg.c.g(1, this.f43959w.f43992c.f44277b) == this.f43959w) {
                i17 += AndroidUtilities.dp(8);
            }
            x3 x3Var7 = this.f43959w;
            if (x3Var7.f43996j == 0 && x3Var7.f43992c.f44280f == 0) {
                i18 = AndroidUtilities.dp(10) + i17;
            } else {
                i18 = i17;
            }
            a3 a3Var4 = this.f43953c;
            if (a3Var4 != null) {
                a3Var4.f35896s = this.f43954e;
                a3Var4.v = this.f43955f;
            }
            org.telegram.ui.Components.bm0 bm0Var2 = this.d;
            if (bm0Var2 != null && (bm0Var2.f47782a instanceof org.telegram.ui.Cells.n9) && (o9Var = ((h4) t70Var).O0) != null) {
                ArrayList arrayList = o9Var.A0;
                arrayList.clear();
                ((org.telegram.ui.Cells.n9) this.d.f47782a).fillTextLayoutBlocks(arrayList);
                int size3 = arrayList.size();
                while (i20 < size3) {
                    Object obj = arrayList.get(i20);
                    i20++;
                    org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) obj;
                    if (z9Var instanceof a3) {
                        a3 a3Var5 = (a3) z9Var;
                        a3Var5.f35896s += this.f43956n;
                        a3Var5.v += this.f43957r;
                    }
                }
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (h4.l(this.f43951a, this.f43952b, motionEvent, this, this.f43953c, this.f43954e, this.f43955f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(x3 x3Var) {
        x3 x3Var2 = this.f43959w;
        f4 f4Var = this.f43952b;
        if (x3Var2 != x3Var) {
            this.f43959w = x3Var;
            org.telegram.ui.Components.bm0 bm0Var = this.d;
            if (bm0Var != null) {
                removeView(bm0Var.f47782a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f43959w.d;
            if (pageBlock != null && f4Var != null) {
                int I = f4.I(pageBlock);
                this.v = I;
                s4.d1 x10 = f4Var.x(this, I);
                this.d = (org.telegram.ui.Components.bm0) x10;
                addView(x10.f47782a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f43959w.d;
        if (pageBlock2 != null && f4Var != null) {
            f4Var.H(this.v, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
