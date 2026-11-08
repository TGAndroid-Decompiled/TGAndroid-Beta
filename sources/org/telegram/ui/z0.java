package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class z0 extends View implements org.telegram.ui.Cells.h9, c3 {
    public final o50 f52392a;
    public final e4 f52393b;
    public z2 f52394c;
    public z2 d;
    public int f52395e;
    public int f52396f;
    public int h;
    public TL_iv.pageBlockBlockquote f52397n;

    public z0(Context context, o50 o50Var, e4 e4Var) {
        super(context);
        this.f52392a = o50Var;
        this.f52393b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        int i7;
        o50 o50Var = this.f52392a;
        o50Var.getClass();
        float f10 = 18;
        int L = org.telegram.messenger.g0.L(f10);
        z2 z2Var = this.f52394c;
        if (z2Var != null) {
            i7 = Math.min(Integer.MAX_VALUE, (z2Var.k() + z2Var.f52421s) - L);
        } else {
            i7 = Integer.MAX_VALUE;
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            i7 = Math.min(i7, (z2Var2.k() + z2Var2.f52421s) - L);
        }
        if (i7 == Integer.MAX_VALUE) {
            return -1;
        }
        o50Var.getClass();
        return i7 - org.telegram.messenger.g0.L(f10);
    }

    @Override
    public int getBoundRight() {
        int i7;
        o50 o50Var = this.f52392a;
        o50Var.getClass();
        float f10 = 18;
        int L = org.telegram.messenger.g0.L(f10);
        z2 z2Var = this.f52394c;
        if (z2Var != null) {
            i7 = Math.max(Integer.MIN_VALUE, z2Var.l() + z2Var.f52421s + L);
        } else {
            i7 = Integer.MIN_VALUE;
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            i7 = Math.max(i7, z2Var2.l() + z2Var2.f52421s + L);
        }
        if (i7 == Integer.MIN_VALUE) {
            return -1;
        }
        o50Var.getClass();
        return org.telegram.messenger.g0.L(f10) + i7;
    }

    @Override
    public int getLastLineBoundRight() {
        int m10;
        int L;
        z2 z2Var = this.d;
        o50 o50Var = this.f52392a;
        if (z2Var != null) {
            m10 = z2Var.m() + z2Var.f52421s;
            o50Var.getClass();
            L = org.telegram.messenger.g0.L(18);
        } else {
            z2 z2Var2 = this.f52394c;
            if (z2Var2 != null) {
                m10 = z2Var2.m() + z2Var2.f52421s;
                o50Var.getClass();
                L = org.telegram.messenger.g0.L(18);
            } else {
                return -1;
            }
        }
        return L + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f52394c;
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
        z2 z2Var = this.f52394c;
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
        z2 z2Var = this.f52394c;
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
        if (this.f52397n == null) {
            return;
        }
        z2 z2Var = this.f52394c;
        o50 o50Var = this.f52392a;
        int i7 = 0;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.f52396f, this.h);
            g4.t(o50Var, canvas, this, 0);
            this.f52394c.d(canvas, this);
            canvas.restore();
            i7 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f52396f, this.f52395e);
            g4.t(o50Var, canvas, this, i7);
            this.d.d(canvas, this);
            canvas.restore();
        }
        e4 e4Var = this.f52393b;
        if (e4Var != null && e4Var.G) {
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(20.0f);
            canvas.drawRect(measuredWidth, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f) + measuredWidth, getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f), g4.f45789r1);
        } else {
            o50Var.getClass();
            o50Var.getClass();
            canvas.drawRect(org.telegram.messenger.g0.L((this.f52397n.level * 14) + 18), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L((this.f52397n.level * 14) + 20), getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f), g4.f45789r1);
        }
        g4.s(canvas, o50Var, this.f52397n, getMeasuredHeight());
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
        z2 z2Var = this.f52394c;
        e4 e4Var = this.f52393b;
        o50 o50Var = this.f52392a;
        if (z2Var != null && (h7 = g4.h(o50Var, e4Var, z2Var)) != null) {
            spannableStringBuilder.append(h7);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null && (h = g4.h(o50Var, e4Var, z2Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(h);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) org.telegram.messenger.id.M0(2131754873, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i7);
        o50 o50Var = this.f52392a;
        o50Var.getClass();
        float f10 = 8;
        this.h = org.telegram.messenger.g0.L(f10);
        if (this.f52397n != null) {
            o50Var.getClass();
            int L = size - org.telegram.messenger.g0.L(50);
            if (this.f52397n.level > 0) {
                L -= org.telegram.messenger.g0.L(i12 * 14);
            }
            int i14 = L;
            TL_iv.pageBlockBlockquote pageblockblockquote = this.f52397n;
            z2 o4 = g4.o(this.f52392a, this, null, pageblockblockquote.text, i14, this.h, pageblockblockquote, this.f52393b);
            this.f52394c = o4;
            if (o4 != null) {
                o50Var.getClass();
                i13 = this.f52394c.d.getHeight() + org.telegram.messenger.g0.L(f10);
            } else {
                i13 = 0;
            }
            i11 = i13;
            int i15 = this.f52397n.level;
            e4 e4Var = this.f52393b;
            if (i15 > 0) {
                if (e4Var != null && e4Var.G) {
                    this.f52396f = org.telegram.messenger.g0.L((i15 * 14) + 14);
                } else {
                    int L2 = org.telegram.messenger.g0.L(i15 * 14);
                    o50Var.getClass();
                    this.f52396f = org.telegram.messenger.g0.L(32) + L2;
                }
            } else if (e4Var != null && e4Var.G) {
                this.f52396f = org.telegram.messenger.g0.L(14.0f);
            } else {
                o50Var.getClass();
                this.f52396f = org.telegram.messenger.g0.L(32);
            }
            o50Var.getClass();
            int L3 = org.telegram.messenger.g0.L(f10) + i11;
            this.f52395e = L3;
            TL_iv.pageBlockBlockquote pageblockblockquote2 = this.f52397n;
            z2 o10 = g4.o(this.f52392a, this, null, pageblockblockquote2.caption, i14, L3, pageblockblockquote2, this.f52393b);
            this.d = o10;
            if (o10 != null) {
                o50Var.getClass();
                i11 += this.d.d.getHeight() + org.telegram.messenger.g0.L(f10);
            }
            if (i11 != 0) {
                o50Var.getClass();
                i11 += org.telegram.messenger.g0.L(f10);
            }
            z2 z2Var = this.f52394c;
            if (z2Var != null) {
                z2Var.f52421s = this.f52396f;
                z2Var.f52422w = this.h;
            }
            z2 z2Var2 = this.d;
            if (z2Var2 != null) {
                z2Var2.f52421s = this.f52396f;
                z2Var2.f52422w = this.f52395e;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!g4.j(this.f52392a, this.f52393b, motionEvent, this, this.f52394c, this.f52396f, this.h)) {
            if (!g4.j(this.f52392a, this.f52393b, motionEvent, this, this.d, this.f52396f, this.f52395e) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
        this.f52397n = pageblockblockquote;
        requestLayout();
    }
}
