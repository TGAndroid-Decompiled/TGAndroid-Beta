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
public final class z2 implements org.telegram.ui.Cells.t9, rg0, org.telegram.ui.Components.ex0 {
    public SpannableStringBuilder D;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public org.telegram.ui.Components.n5 H;
    public ArrayList I;
    public Stack J;
    public AtomicReference K;
    public View L;
    public final o50 f52434a;
    public View f52435b;
    public boolean f52436c;
    public StaticLayout d;
    public org.telegram.ui.Components.r70 f52437e;
    public org.telegram.ui.Components.r70 f52438f;
    public org.telegram.ui.Components.r70 h;
    public TL_iv.PageBlock f52439n;
    public TL_iv.RichText f52440r;
    public int f52441s;
    public int f52442w;
    public int f52443x;
    public CharSequence f52444y;

    public z2(o50 o50Var) {
        this.f52434a = o50Var;
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
        this.f52436c = true;
        this.f52435b = view;
        o50 o50Var = this.f52434a;
        float f10 = 0.0f;
        if (!o50Var.E.isEmpty()) {
            p3 p3Var = (p3) o50Var.E.get(o50Var.G);
            if (p3Var.f48597c == this.f52439n && ((obj = p3Var.f48596b) == (richText = this.f52440r) || ((obj instanceof String) && richText == null))) {
                if (-1 != p3Var.f48595a) {
                    org.telegram.ui.Components.r70 r70Var = new org.telegram.ui.Components.r70(0);
                    this.h = r70Var;
                    r70Var.f37521n = false;
                    r70Var.d(this.d, p3Var.f48595a, 0.0f);
                    this.h.f37522o = 0;
                    StaticLayout staticLayout = this.d;
                    int i7 = p3Var.f48595a;
                    staticLayout.getSelectionPath(i7, o50Var.F.length() + i7, this.h);
                    this.h.f37521n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.r70 r70Var2 = this.h;
        if (r70Var2 != null) {
            canvas.drawPath(r70Var2, g4.f45820z1);
        }
        org.telegram.ui.Components.r70 r70Var3 = this.f52437e;
        if (r70Var3 != null) {
            canvas.drawPath(r70Var3, g4.f45819y1);
        }
        org.telegram.ui.Components.r70 r70Var4 = this.f52438f;
        if (r70Var4 != null) {
            canvas.drawPath(r70Var4, g4.A1);
        }
        if (o50Var.f48268c.i(canvas, this)) {
            view.invalidate();
        }
        if (o50Var.d == this && o50Var.f48267b == null && o50Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f10 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-org.telegram.messenger.g0.L(2.0f)) + f10, 0.0f, f10 + width + org.telegram.messenger.g0.L(2.0f), this.d.getHeight(), g4.f45818x1);
        }
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            xh.f.g(view, false, this.d.getPaint().getColor(), 0, this.K, 0, this.d, this.I, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f52436c = false;
    }

    @Override
    public final View e() {
        View view = this.L;
        if (view != null) {
            return view;
        }
        return this.f52435b;
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
        this.f52443x = i7;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f52444y;
    }

    @Override
    public final int getRow() {
        return this.f52443x;
    }

    @Override
    public final CharSequence getText() {
        return this.d.getText();
    }

    @Override
    public final int getX() {
        return this.f52441s;
    }

    @Override
    public final int getY() {
        return this.f52442w;
    }

    @Override
    public final void h(int i7) {
        this.f52442w = i7;
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
        this.f52441s = i7;
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
