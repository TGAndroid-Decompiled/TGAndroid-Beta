package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class z0 extends View implements org.telegram.ui.Cells.g9, c3 {
    public final n50 f53755a;
    public final e4 f53756b;
    public z2 f53757c;
    public z2 d;
    public int f53758e;
    public int f53759f;
    public int h;
    public TL_iv.pageBlockBlockquote f53760n;

    public z0(Context context, n50 n50Var, e4 e4Var) {
        super(context);
        this.f53755a = n50Var;
        this.f53756b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        int i7;
        n50 n50Var = this.f53755a;
        n50Var.getClass();
        float f10 = 18;
        int L = org.telegram.messenger.g0.L(f10);
        z2 z2Var = this.f53757c;
        if (z2Var != null) {
            i7 = Math.min(Integer.MAX_VALUE, (z2Var.k() + z2Var.f53777s) - L);
        } else {
            i7 = Integer.MAX_VALUE;
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            i7 = Math.min(i7, (z2Var2.k() + z2Var2.f53777s) - L);
        }
        if (i7 == Integer.MAX_VALUE) {
            return -1;
        }
        n50Var.getClass();
        return i7 - org.telegram.messenger.g0.L(f10);
    }

    @Override
    public int getBoundRight() {
        int i7;
        n50 n50Var = this.f53755a;
        n50Var.getClass();
        float f10 = 18;
        int L = org.telegram.messenger.g0.L(f10);
        z2 z2Var = this.f53757c;
        if (z2Var != null) {
            i7 = Math.max(Integer.MIN_VALUE, z2Var.l() + z2Var.f53777s + L);
        } else {
            i7 = Integer.MIN_VALUE;
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            i7 = Math.max(i7, z2Var2.l() + z2Var2.f53777s + L);
        }
        if (i7 == Integer.MIN_VALUE) {
            return -1;
        }
        n50Var.getClass();
        return org.telegram.messenger.g0.L(f10) + i7;
    }

    @Override
    public int getLastLineBoundRight() {
        int m10;
        int L;
        z2 z2Var = this.d;
        n50 n50Var = this.f53755a;
        if (z2Var != null) {
            m10 = z2Var.m() + z2Var.f53777s;
            n50Var.getClass();
            L = org.telegram.messenger.g0.L(18);
        } else {
            z2 z2Var2 = this.f53757c;
            if (z2Var2 != null) {
                m10 = z2Var2.m() + z2Var2.f53777s;
                n50Var.getClass();
                L = org.telegram.messenger.g0.L(18);
            } else {
                return -1;
            }
        }
        return L + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.i20.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f53757c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f53757c;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f53757c;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f53760n == null) {
            return;
        }
        z2 z2Var = this.f53757c;
        n50 n50Var = this.f53755a;
        int i7 = 0;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.f53759f, this.h);
            g4.t(n50Var, canvas, this, 0);
            this.f53757c.d(canvas, this);
            canvas.restore();
            i7 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f53759f, this.f53758e);
            g4.t(n50Var, canvas, this, i7);
            this.d.d(canvas, this);
            canvas.restore();
        }
        e4 e4Var = this.f53756b;
        if (e4Var != null && e4Var.H) {
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(20.0f);
            canvas.drawRect(measuredWidth, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f) + measuredWidth, getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f), g4.f47295s1);
        } else {
            n50Var.getClass();
            n50Var.getClass();
            canvas.drawRect(org.telegram.messenger.g0.L((this.f53760n.level * 14) + 18), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L((this.f53760n.level * 14) + 20), getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f), g4.f47295s1);
        }
        g4.s(canvas, n50Var, this.f53760n, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence h;
        CharSequence h7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        z2 z2Var = this.f53757c;
        e4 e4Var = this.f53756b;
        n50 n50Var = this.f53755a;
        if (z2Var != null && (h7 = g4.h(n50Var, e4Var, z2Var)) != null) {
            spannableStringBuilder.append(h7);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null && (h = g4.h(n50Var, e4Var, z2Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(h);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) org.telegram.messenger.hd.M0(2131754873, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i7);
        n50 n50Var = this.f53755a;
        n50Var.getClass();
        float f10 = 8;
        this.h = org.telegram.messenger.g0.L(f10);
        if (this.f53760n != null) {
            n50Var.getClass();
            int L = size - org.telegram.messenger.g0.L(50);
            if (this.f53760n.level > 0) {
                L -= org.telegram.messenger.g0.L(i12 * 14);
            }
            int i14 = L;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.f53760n;
            z2 o4 = g4.o(this.f53755a, this, null, pageblockblockquote.text, i14, this.h, pageblockblockquote, this.f53756b);
            this.f53757c = o4;
            if (o4 != null) {
                n50Var.getClass();
                i13 = this.f53757c.d.getHeight() + org.telegram.messenger.g0.L(f10);
            } else {
                i13 = 0;
            }
            i11 = i13;
            int i15 = this.f53760n.level;
            e4 e4Var = this.f53756b;
            if (i15 > 0) {
                if (e4Var != null && e4Var.H) {
                    this.f53759f = org.telegram.messenger.g0.L((i15 * 14) + 14);
                } else {
                    int L2 = org.telegram.messenger.g0.L(i15 * 14);
                    n50Var.getClass();
                    this.f53759f = org.telegram.messenger.g0.L(32) + L2;
                }
            } else if (e4Var != null && e4Var.H) {
                this.f53759f = org.telegram.messenger.g0.L(14.0f);
            } else {
                n50Var.getClass();
                this.f53759f = org.telegram.messenger.g0.L(32);
            }
            n50Var.getClass();
            int L3 = org.telegram.messenger.g0.L(f10) + i11;
            this.f53758e = L3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.f53760n;
            z2 o10 = g4.o(this.f53755a, this, null, pageblockblockquote2.caption, i14, L3, pageblockblockquote2, this.f53756b);
            this.d = o10;
            if (o10 != null) {
                n50Var.getClass();
                i11 += this.d.d.getHeight() + org.telegram.messenger.g0.L(f10);
            }
            if (i11 != 0) {
                n50Var.getClass();
                i11 += org.telegram.messenger.g0.L(f10);
            }
            z2 z2Var = this.f53757c;
            if (z2Var != null) {
                z2Var.f53777s = this.f53759f;
                z2Var.f53778w = this.h;
            }
            z2 z2Var2 = this.d;
            if (z2Var2 != null) {
                z2Var2.f53777s = this.f53759f;
                z2Var2.f53778w = this.f53758e;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!g4.j(this.f53755a, this.f53756b, motionEvent, this, this.f53757c, this.f53759f, this.h)) {
            if (!g4.j(this.f53755a, this.f53756b, motionEvent, this, this.d, this.f53759f, this.f53758e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.f53760n = pageblockblockquote;
        requestLayout();
    }
}
