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
public final class z2 implements org.telegram.ui.Cells.s9, rg0, org.telegram.ui.Components.hx0 {
    public SpannableStringBuilder E;
    public int F = -1;
    public int G = -1;
    public int H = -1;
    public org.telegram.ui.Components.l5 I;
    public ArrayList J;
    public Stack K;
    public AtomicReference L;
    public View M;
    public final n50 f53770a;
    public View f53771b;
    public boolean f53772c;
    public StaticLayout d;
    public org.telegram.ui.Components.u70 f53773e;
    public org.telegram.ui.Components.u70 f53774f;
    public org.telegram.ui.Components.u70 h;
    public TL_iv.PageBlock f53775n;
    public TL_iv.RichText f53776r;
    public int f53777s;
    public int f53778w;
    public int f53779x;
    public CharSequence f53780y;

    public z2(n50 n50Var) {
        this.f53770a = n50Var;
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
        this.f53772c = true;
        this.f53771b = view;
        n50 n50Var = this.f53770a;
        float f10 = 0.0f;
        if (!n50Var.F.isEmpty()) {
            p3 p3Var = (p3) n50Var.F.get(n50Var.H);
            if (p3Var.f50096c == this.f53775n && ((obj = p3Var.f50095b) == (richText = this.f53776r) || ((obj instanceof String) && richText == null))) {
                if (-1 != p3Var.f50094a) {
                    org.telegram.ui.Components.u70 u70Var = new org.telegram.ui.Components.u70(0);
                    this.h = u70Var;
                    u70Var.f39946n = false;
                    u70Var.d(this.d, p3Var.f50094a, 0.0f);
                    this.h.f39947o = 0;
                    StaticLayout staticLayout = this.d;
                    int i7 = p3Var.f50094a;
                    staticLayout.getSelectionPath(i7, n50Var.G.length() + i7, this.h);
                    this.h.f39946n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.u70 u70Var2 = this.h;
        if (u70Var2 != null) {
            canvas.drawPath(u70Var2, g4.A1);
        }
        org.telegram.ui.Components.u70 u70Var3 = this.f53773e;
        if (u70Var3 != null) {
            canvas.drawPath(u70Var3, g4.f47302z1);
        }
        org.telegram.ui.Components.u70 u70Var4 = this.f53774f;
        if (u70Var4 != null) {
            canvas.drawPath(u70Var4, g4.B1);
        }
        if (n50Var.f49449c.i(canvas, this)) {
            view.invalidate();
        }
        if (n50Var.d == this && n50Var.f49448b == null && n50Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f10 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-org.telegram.messenger.g0.L(2.0f)) + f10, 0.0f, f10 + width + org.telegram.messenger.g0.L(2.0f), this.d.getHeight(), g4.f47301y1);
        }
        ArrayList arrayList = this.J;
        if (arrayList != null && !arrayList.isEmpty()) {
            xh.f.g(view, false, this.d.getPaint().getColor(), 0, this.L, 0, this.d, this.J, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f53772c = false;
    }

    @Override
    public final View e() {
        View view = this.M;
        if (view != null) {
            return view;
        }
        return this.f53771b;
    }

    @Override
    public final void f(View view) {
        if (view == null) {
            view = this.M;
        }
        org.telegram.ui.Components.p5.release(view, this.I);
        this.M = null;
    }

    @Override
    public final void g(int i7) {
        this.f53779x = i7;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f53780y;
    }

    @Override
    public final int getRow() {
        return this.f53779x;
    }

    @Override
    public final CharSequence getText() {
        return this.d.getText();
    }

    @Override
    public final int getX() {
        return this.f53777s;
    }

    @Override
    public final int getY() {
        return this.f53778w;
    }

    @Override
    public final void h(int i7) {
        this.f53778w = i7;
    }

    @Override
    public final void i(View view) {
        this.M = view;
        StaticLayout staticLayout = this.d;
        if (staticLayout != null) {
            this.I = org.telegram.ui.Components.p5.update(0, view, false, this.I, staticLayout);
        }
    }

    @Override
    public final void j(int i7) {
        this.f53777s = i7;
    }

    public final int k() {
        int i7 = this.F;
        if (i7 != -1) {
            return i7;
        }
        this.F = this.d.getWidth();
        for (int i10 = 0; i10 < this.d.getLineCount(); i10++) {
            this.F = Math.min(this.F, (int) this.d.getLineLeft(i10));
        }
        return this.F;
    }

    public final int l() {
        int i7 = this.G;
        if (i7 != -1) {
            return i7;
        }
        this.G = 0;
        for (int i10 = 0; i10 < this.d.getLineCount(); i10++) {
            this.G = Math.max(this.G, (int) this.d.getLineRight(i10));
        }
        return this.G;
    }

    public final int m() {
        int i7 = this.H;
        if (i7 != -1) {
            return i7;
        }
        this.H = 0;
        if (this.d.getLineCount() > 0) {
            int i10 = this.H;
            StaticLayout staticLayout = this.d;
            this.H = Math.max(i10, (int) staticLayout.getLineRight(staticLayout.getLineCount() - 1));
        }
        return this.H;
    }
}
