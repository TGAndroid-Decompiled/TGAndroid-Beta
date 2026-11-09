package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.view.View;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.tl.TL_iv;
public final class z2 implements org.telegram.ui.Cells.t9, tg0, org.telegram.ui.Components.fx0 {
    public SpannableStringBuilder D;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public org.telegram.ui.Components.n5 H;
    public ArrayList I;
    public Stack J;
    public AtomicReference K;
    public View L;
    public final q50 f52390a;
    public View f52391b;
    public boolean f52392c;
    public StaticLayout d;
    public org.telegram.ui.Components.s70 f52393e;
    public org.telegram.ui.Components.s70 f52394f;
    public org.telegram.ui.Components.s70 h;
    public TL_iv.PageBlock f52395n;
    public TL_iv.RichText f52396r;
    public int f52397s;
    public int f52398w;
    public int f52399x;
    public CharSequence f52400y;

    public z2(q50 q50Var) {
        this.f52390a = q50Var;
    }

    @Override
    public final Layout a() {
        return this.d;
    }

    @Override
    public final int b() {
        return 0;
    }

    @Override
    public final Rect c() {
        return null;
    }

    @Override
    public final void d(Canvas canvas, View view) {
        float width;
        Object obj;
        TL_iv.RichText richText;
        this.f52392c = true;
        this.f52391b = view;
        q50 q50Var = this.f52390a;
        float f10 = 0.0f;
        if (!q50Var.E.isEmpty()) {
            p3 p3Var = (p3) q50Var.E.get(q50Var.G);
            if (p3Var.f48601c == this.f52395n && ((obj = p3Var.f48600b) == (richText = this.f52396r) || ((obj instanceof String) && richText == null))) {
                if (-1 != p3Var.f48599a) {
                    org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(0);
                    this.h = s70Var;
                    s70Var.f37952n = false;
                    s70Var.d(this.d, p3Var.f48599a, 0.0f);
                    this.h.f37953o = 0;
                    StaticLayout staticLayout = this.d;
                    int i7 = p3Var.f48599a;
                    staticLayout.getSelectionPath(i7, q50Var.F.length() + i7, this.h);
                    this.h.f37952n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.s70 s70Var2 = this.h;
        if (s70Var2 != null) {
            canvas.drawPath(s70Var2, g4.f45880z1);
        }
        org.telegram.ui.Components.s70 s70Var3 = this.f52393e;
        if (s70Var3 != null) {
            canvas.drawPath(s70Var3, g4.f45879y1);
        }
        org.telegram.ui.Components.s70 s70Var4 = this.f52394f;
        if (s70Var4 != null) {
            canvas.drawPath(s70Var4, g4.A1);
        }
        if (q50Var.f48919c.i(canvas, this)) {
            view.invalidate();
        }
        if (q50Var.d == this && q50Var.f48918b == null && q50Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f10 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-org.telegram.messenger.g0.L(2.0f)) + f10, 0.0f, f10 + width + org.telegram.messenger.g0.L(2.0f), this.d.getHeight(), g4.f45878x1);
        }
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            xh.f.g(view, false, this.d.getPaint().getColor(), 0, this.K, 0, this.d, this.I, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f52392c = false;
    }

    @Override
    public final View e() {
        View view = this.L;
        if (view != null) {
            return view;
        }
        return this.f52391b;
    }

    @Override
    public final void f(View view) {
        if (view == null) {
            view = this.L;
        }
        org.telegram.ui.Components.r5.release(view, this.H);
        this.L = null;
    }

    @Override
    public final void g(int i7) {
        this.f52399x = i7;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f52400y;
    }

    @Override
    public final int getRow() {
        return this.f52399x;
    }

    @Override
    public final CharSequence getText() {
        return this.d.getText();
    }

    @Override
    public final int getX() {
        return this.f52397s;
    }

    @Override
    public final int getY() {
        return this.f52398w;
    }

    @Override
    public final void h(int i7) {
        this.f52398w = i7;
    }

    @Override
    public final void i(View view) {
        this.L = view;
        StaticLayout staticLayout = this.d;
        if (staticLayout != null) {
            this.H = org.telegram.ui.Components.r5.update(0, view, false, this.H, staticLayout);
        }
    }

    @Override
    public final void j(int i7) {
        this.f52397s = i7;
    }

    public final int k() {
        int i7 = this.E;
        if (i7 != -1) {
            return i7;
        }
        this.E = this.d.getWidth();
        for (int i10 = 0; i10 < this.d.getLineCount(); i10++) {
            this.E = Math.min(this.E, (int) this.d.getLineLeft(i10));
        }
        return this.E;
    }

    public final int l() {
        int i7 = this.F;
        if (i7 != -1) {
            return i7;
        }
        this.F = 0;
        for (int i10 = 0; i10 < this.d.getLineCount(); i10++) {
            this.F = Math.max(this.F, (int) this.d.getLineRight(i10));
        }
        return this.F;
    }

    public final int m() {
        int i7 = this.G;
        if (i7 != -1) {
            return i7;
        }
        this.G = 0;
        if (this.d.getLineCount() > 0) {
            int i10 = this.G;
            StaticLayout staticLayout = this.d;
            this.G = Math.max(i10, (int) staticLayout.getLineRight(staticLayout.getLineCount() - 1));
        }
        return this.G;
    }
}
