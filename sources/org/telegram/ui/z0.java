package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class z0 extends View implements org.telegram.ui.Cells.i9, c3 {
    public final p50 f54349a;
    public final e4 f54350b;
    public z2 f54351c;
    public z2 d;
    public int f54352e;
    public int f54353f;
    public int h;
    public TL_iv.pageBlockBlockquote f54354n;

    public z0(Context context, p50 p50Var, e4 e4Var) {
        super(context);
        this.f54349a = p50Var;
        this.f54350b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        int i7;
        p50 p50Var = this.f54349a;
        p50Var.getClass();
        float f10 = 18;
        int L = org.telegram.messenger.g0.L(f10);
        z2 z2Var = this.f54351c;
        if (z2Var != null) {
            i7 = Math.min(Integer.MAX_VALUE, (z2Var.k() + z2Var.f54374s) - L);
        } else {
            i7 = Integer.MAX_VALUE;
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            i7 = Math.min(i7, (z2Var2.k() + z2Var2.f54374s) - L);
        }
        if (i7 == Integer.MAX_VALUE) {
            return -1;
        }
        p50Var.getClass();
        return i7 - org.telegram.messenger.g0.L(f10);
    }

    @Override
    public int getBoundRight() {
        int i7;
        p50 p50Var = this.f54349a;
        p50Var.getClass();
        float f10 = 18;
        int L = org.telegram.messenger.g0.L(f10);
        z2 z2Var = this.f54351c;
        if (z2Var != null) {
            i7 = Math.max(Integer.MIN_VALUE, z2Var.l() + z2Var.f54374s + L);
        } else {
            i7 = Integer.MIN_VALUE;
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            i7 = Math.max(i7, z2Var2.l() + z2Var2.f54374s + L);
        }
        if (i7 == Integer.MIN_VALUE) {
            return -1;
        }
        p50Var.getClass();
        return org.telegram.messenger.g0.L(f10) + i7;
    }

    @Override
    public int getLastLineBoundRight() {
        int m10;
        int L;
        z2 z2Var = this.d;
        p50 p50Var = this.f54349a;
        if (z2Var != null) {
            m10 = z2Var.m() + z2Var.f54374s;
            p50Var.getClass();
            L = org.telegram.messenger.g0.L(18);
        } else {
            z2 z2Var2 = this.f54351c;
            if (z2Var2 != null) {
                m10 = z2Var2.m() + z2Var2.f54374s;
                p50Var.getClass();
                L = org.telegram.messenger.g0.L(18);
            } else {
                return -1;
            }
        }
        return L + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.n10.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f54351c;
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
        z2 z2Var = this.f54351c;
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
        z2 z2Var = this.f54351c;
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
        if (this.f54354n == null) {
            return;
        }
        z2 z2Var = this.f54351c;
        p50 p50Var = this.f54349a;
        int i7 = 0;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.f54353f, this.h);
            g4.t(p50Var, canvas, this, 0);
            this.f54351c.d(canvas, this);
            canvas.restore();
            i7 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f54353f, this.f54352e);
            g4.t(p50Var, canvas, this, i7);
            this.d.d(canvas, this);
            canvas.restore();
        }
        e4 e4Var = this.f54350b;
        if (e4Var != null && e4Var.H) {
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(20.0f);
            canvas.drawRect(measuredWidth, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f) + measuredWidth, getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f), g4.f47938s1);
        } else {
            p50Var.getClass();
            p50Var.getClass();
            canvas.drawRect(org.telegram.messenger.g0.L((this.f54354n.level * 14) + 18), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L((this.f54354n.level * 14) + 20), getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f), g4.f47938s1);
        }
        g4.s(canvas, p50Var, this.f54354n, getMeasuredHeight());
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
        z2 z2Var = this.f54351c;
        e4 e4Var = this.f54350b;
        p50 p50Var = this.f54349a;
        if (z2Var != null && (h7 = g4.h(p50Var, e4Var, z2Var)) != null) {
            spannableStringBuilder.append(h7);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null && (h = g4.h(p50Var, e4Var, z2Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(h);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) org.telegram.messenger.gd.N0(2131754872, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i7);
        p50 p50Var = this.f54349a;
        p50Var.getClass();
        float f10 = 8;
        this.h = org.telegram.messenger.g0.L(f10);
        if (this.f54354n != null) {
            p50Var.getClass();
            int L = size - org.telegram.messenger.g0.L(50);
            if (this.f54354n.level > 0) {
                L -= org.telegram.messenger.g0.L(i12 * 14);
            }
            int i14 = L;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.f54354n;
            z2 o4 = g4.o(this.f54349a, this, null, pageblockblockquote.text, i14, this.h, pageblockblockquote, this.f54350b);
            this.f54351c = o4;
            if (o4 != null) {
                p50Var.getClass();
                i13 = this.f54351c.d.getHeight() + org.telegram.messenger.g0.L(f10);
            } else {
                i13 = 0;
            }
            i11 = i13;
            int i15 = this.f54354n.level;
            e4 e4Var = this.f54350b;
            if (i15 > 0) {
                if (e4Var != null && e4Var.H) {
                    this.f54353f = org.telegram.messenger.g0.L((i15 * 14) + 14);
                } else {
                    int L2 = org.telegram.messenger.g0.L(i15 * 14);
                    p50Var.getClass();
                    this.f54353f = org.telegram.messenger.g0.L(32) + L2;
                }
            } else if (e4Var != null && e4Var.H) {
                this.f54353f = org.telegram.messenger.g0.L(14.0f);
            } else {
                p50Var.getClass();
                this.f54353f = org.telegram.messenger.g0.L(32);
            }
            p50Var.getClass();
            int L3 = org.telegram.messenger.g0.L(f10) + i11;
            this.f54352e = L3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.f54354n;
            z2 o10 = g4.o(this.f54349a, this, null, pageblockblockquote2.caption, i14, L3, pageblockblockquote2, this.f54350b);
            this.d = o10;
            if (o10 != null) {
                p50Var.getClass();
                i11 += this.d.d.getHeight() + org.telegram.messenger.g0.L(f10);
            }
            if (i11 != 0) {
                p50Var.getClass();
                i11 += org.telegram.messenger.g0.L(f10);
            }
            z2 z2Var = this.f54351c;
            if (z2Var != null) {
                z2Var.f54374s = this.f54353f;
                z2Var.f54375w = this.h;
            }
            z2 z2Var2 = this.d;
            if (z2Var2 != null) {
                z2Var2.f54374s = this.f54353f;
                z2Var2.f54375w = this.f54352e;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!g4.j(this.f54349a, this.f54350b, motionEvent, this, this.f54351c, this.f54353f, this.h)) {
            if (!g4.j(this.f54349a, this.f54350b, motionEvent, this, this.d, this.f54353f, this.f54352e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.f54354n = pageblockblockquote;
        requestLayout();
    }
}
