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
    public final n50 f53805a;
    public View f53806b;
    public boolean f53807c;
    public StaticLayout d;
    public org.telegram.ui.Components.u70 f53808e;
    public org.telegram.ui.Components.u70 f53809f;
    public org.telegram.ui.Components.u70 h;
    public TL_iv.PageBlock f53810n;
    public TL_iv.RichText f53811r;
    public int f53812s;
    public int f53813w;
    public int f53814x;
    public CharSequence f53815y;

    public z2(n50 n50Var) {
        this.f53805a = n50Var;
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
        this.f53807c = true;
        this.f53806b = view;
        n50 n50Var = this.f53805a;
        float f10 = 0.0f;
        if (!n50Var.F.isEmpty()) {
            p3 p3Var = (p3) n50Var.F.get(n50Var.H);
            if (p3Var.f50119c == this.f53810n && ((obj = p3Var.f50118b) == (richText = this.f53811r) || ((obj instanceof String) && richText == null))) {
                if (-1 != p3Var.f50117a) {
                    org.telegram.ui.Components.u70 u70Var = new org.telegram.ui.Components.u70(0);
                    this.h = u70Var;
                    u70Var.f39949n = false;
                    u70Var.d(this.d, p3Var.f50117a, 0.0f);
                    this.h.f39950o = 0;
                    StaticLayout staticLayout = this.d;
                    int i7 = p3Var.f50117a;
                    staticLayout.getSelectionPath(i7, n50Var.G.length() + i7, this.h);
                    this.h.f39949n = true;
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
        org.telegram.ui.Components.u70 u70Var3 = this.f53808e;
        if (u70Var3 != null) {
            canvas.drawPath(u70Var3, g4.f47312z1);
        }
        org.telegram.ui.Components.u70 u70Var4 = this.f53809f;
        if (u70Var4 != null) {
            canvas.drawPath(u70Var4, g4.B1);
        }
        if (n50Var.f49450c.i(canvas, this)) {
            view.invalidate();
        }
        if (n50Var.d == this && n50Var.f49449b == null && n50Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f10 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-org.telegram.messenger.g0.L(2.0f)) + f10, 0.0f, f10 + width + org.telegram.messenger.g0.L(2.0f), this.d.getHeight(), g4.f47311y1);
        }
        ArrayList arrayList = this.J;
        if (arrayList != null && !arrayList.isEmpty()) {
            xh.f.g(view, false, this.d.getPaint().getColor(), 0, this.L, 0, this.d, this.J, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f53807c = false;
    }

    @Override
    public final View e() {
        View view = this.M;
        if (view != null) {
            return view;
        }
        return this.f53806b;
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
        this.f53814x = i7;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f53815y;
    }

    @Override
    public final int getRow() {
        return this.f53814x;
    }

    @Override
    public final CharSequence getText() {
        return this.d.getText();
    }

    @Override
    public final int getX() {
        return this.f53812s;
    }

    @Override
    public final int getY() {
        return this.f53813w;
    }

    @Override
    public final void h(int i7) {
        this.f53813w = i7;
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
        this.f53812s = i7;
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
