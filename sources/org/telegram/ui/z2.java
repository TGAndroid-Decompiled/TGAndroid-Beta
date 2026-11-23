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
public final class z2 implements org.telegram.ui.Cells.t9, ug0, org.telegram.ui.Components.px0 {
    public SpannableStringBuilder E;
    public int F = -1;
    public int G = -1;
    public int H = -1;
    public org.telegram.ui.Components.t5 I;
    public ArrayList J;
    public Stack K;
    public AtomicReference L;
    public View M;
    public final p50 f54489a;
    public View f54490b;
    public boolean f54491c;
    public StaticLayout d;
    public org.telegram.ui.Components.e80 f54492e;
    public org.telegram.ui.Components.e80 f54493f;
    public org.telegram.ui.Components.e80 h;
    public TL_iv.PageBlock f54494n;
    public TL_iv.RichText f54495r;
    public int f54496s;
    public int f54497w;
    public int f54498x;
    public CharSequence f54499y;

    public z2(p50 p50Var) {
        this.f54489a = p50Var;
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
        this.f54491c = true;
        this.f54490b = view;
        p50 p50Var = this.f54489a;
        float f10 = 0.0f;
        if (!p50Var.F.isEmpty()) {
            p3 p3Var = (p3) p50Var.F.get(p50Var.H);
            if (p3Var.f50813c == this.f54494n && ((obj = p3Var.f50812b) == (richText = this.f54495r) || ((obj instanceof String) && richText == null))) {
                if (-1 != p3Var.f50811a) {
                    org.telegram.ui.Components.e80 e80Var = new org.telegram.ui.Components.e80(0);
                    this.h = e80Var;
                    e80Var.f34637n = false;
                    e80Var.d(this.d, p3Var.f50811a, 0.0f);
                    this.h.f34638o = 0;
                    StaticLayout staticLayout = this.d;
                    int i7 = p3Var.f50811a;
                    staticLayout.getSelectionPath(i7, p50Var.G.length() + i7, this.h);
                    this.h.f34637n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.e80 e80Var2 = this.h;
        if (e80Var2 != null) {
            canvas.drawPath(e80Var2, g4.A1);
        }
        org.telegram.ui.Components.e80 e80Var3 = this.f54492e;
        if (e80Var3 != null) {
            canvas.drawPath(e80Var3, g4.f48060z1);
        }
        org.telegram.ui.Components.e80 e80Var4 = this.f54493f;
        if (e80Var4 != null) {
            canvas.drawPath(e80Var4, g4.B1);
        }
        if (p50Var.f50840c.i(canvas, this)) {
            view.invalidate();
        }
        if (p50Var.d == this && p50Var.f50839b == null && p50Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f10 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-org.telegram.messenger.g0.L(2.0f)) + f10, 0.0f, f10 + width + org.telegram.messenger.g0.L(2.0f), this.d.getHeight(), g4.f48059y1);
        }
        ArrayList arrayList = this.J;
        if (arrayList != null && !arrayList.isEmpty()) {
            xh.f.g(view, false, this.d.getPaint().getColor(), 0, this.L, 0, this.d, this.J, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f54491c = false;
    }

    @Override
    public final View e() {
        View view = this.M;
        if (view != null) {
            return view;
        }
        return this.f54490b;
    }

    @Override
    public final void f(View view) {
        if (view == null) {
            view = this.M;
        }
        org.telegram.ui.Components.x5.release(view, this.I);
        this.M = null;
    }

    @Override
    public final void g(int i7) {
        this.f54498x = i7;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f54499y;
    }

    @Override
    public final int getRow() {
        return this.f54498x;
    }

    @Override
    public final CharSequence getText() {
        return this.d.getText();
    }

    @Override
    public final int getX() {
        return this.f54496s;
    }

    @Override
    public final int getY() {
        return this.f54497w;
    }

    @Override
    public final void h(int i7) {
        this.f54497w = i7;
    }

    @Override
    public final void i(View view) {
        this.M = view;
        StaticLayout staticLayout = this.d;
        if (staticLayout != null) {
            this.I = org.telegram.ui.Components.x5.update(0, view, false, this.I, staticLayout);
        }
    }

    @Override
    public final void j(int i7) {
        this.f54496s = i7;
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
