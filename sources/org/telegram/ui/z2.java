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
public final class z2 implements org.telegram.ui.Cells.u9, vh0, org.telegram.ui.Components.iy0 {
    public SpannableStringBuilder D;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public org.telegram.ui.Components.k5 H;
    public ArrayList I;
    public Stack J;
    public AtomicReference K;
    public View L;
    public final l60 f43787a;
    public View f43788b;
    public boolean f43789c;
    public StaticLayout d;
    public org.telegram.ui.Components.k80 e;
    public org.telegram.ui.Components.k80 f43790f;
    public org.telegram.ui.Components.k80 h;
    public TL_iv.PageBlock f43791n;
    public TL_iv.RichText f43792r;
    public int f43793s;
    public int f43794w;
    public int f43795x;
    public CharSequence f43796y;

    public z2(l60 l60Var) {
        this.f43787a = l60Var;
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
        this.f43789c = true;
        this.f43788b = view;
        l60 l60Var = this.f43787a;
        float f7 = 0.0f;
        if (!l60Var.E.isEmpty()) {
            q3 q3Var = (q3) l60Var.E.get(l60Var.G);
            if (q3Var.f40674c == this.f43791n && ((obj = q3Var.f40673b) == (richText = this.f43792r) || ((obj instanceof String) && richText == null))) {
                if (-1 != q3Var.f40672a) {
                    org.telegram.ui.Components.k80 k80Var = new org.telegram.ui.Components.k80(0);
                    this.h = k80Var;
                    k80Var.f27779n = false;
                    k80Var.d(this.d, q3Var.f40672a, 0.0f);
                    this.h.f27780o = 0;
                    StaticLayout staticLayout = this.d;
                    int i10 = q3Var.f40672a;
                    staticLayout.getSelectionPath(i10, l60Var.F.length() + i10, this.h);
                    this.h.f27779n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.k80 k80Var2 = this.h;
        if (k80Var2 != null) {
            canvas.drawPath(k80Var2, h4.f37669z1);
        }
        org.telegram.ui.Components.k80 k80Var3 = this.e;
        if (k80Var3 != null) {
            canvas.drawPath(k80Var3, h4.f37668y1);
        }
        org.telegram.ui.Components.k80 k80Var4 = this.f43790f;
        if (k80Var4 != null) {
            canvas.drawPath(k80Var4, h4.A1);
        }
        if (l60Var.f39097c.i(canvas, this)) {
            view.invalidate();
        }
        if (l60Var.d == this && l60Var.f39096b == null && l60Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f7 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-org.telegram.messenger.i0.L(2.0f)) + f7, 0.0f, f7 + width + org.telegram.messenger.i0.L(2.0f), this.d.getHeight(), h4.f37667x1);
        }
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            nh.i.g(view, false, this.d.getPaint().getColor(), 0, this.K, 0, this.d, this.I, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f43789c = false;
    }

    @Override
    public final View e() {
        View view = this.L;
        if (view != null) {
            return view;
        }
        return this.f43788b;
    }

    @Override
    public final void f(View view) {
        if (view == null) {
            view = this.L;
        }
        org.telegram.ui.Components.o5.release(view, this.H);
        this.L = null;
    }

    @Override
    public final void g(int i10) {
        this.f43795x = i10;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f43796y;
    }

    @Override
    public final int getRow() {
        return this.f43795x;
    }

    @Override
    public final CharSequence getText() {
        return this.d.getText();
    }

    @Override
    public final int getX() {
        return this.f43793s;
    }

    @Override
    public final int getY() {
        return this.f43794w;
    }

    @Override
    public final void h(int i10) {
        this.f43794w = i10;
    }

    @Override
    public final void i(View view) {
        this.L = view;
        StaticLayout staticLayout = this.d;
        if (staticLayout != null) {
            this.H = org.telegram.ui.Components.o5.update(0, view, false, this.H, staticLayout);
        }
    }

    @Override
    public final void j(int i10) {
        this.f43793s = i10;
    }

    public final int k() {
        int i10 = this.E;
        if (i10 != -1) {
            return i10;
        }
        this.E = this.d.getWidth();
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.E = Math.min(this.E, (int) this.d.getLineLeft(i11));
        }
        return this.E;
    }

    public final int l() {
        int i10 = this.F;
        if (i10 != -1) {
            return i10;
        }
        this.F = 0;
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.F = Math.max(this.F, (int) this.d.getLineRight(i11));
        }
        return this.F;
    }

    public final int m() {
        int i10 = this.G;
        if (i10 != -1) {
            return i10;
        }
        this.G = 0;
        if (this.d.getLineCount() > 0) {
            int i11 = this.G;
            StaticLayout staticLayout = this.d;
            this.G = Math.max(i11, (int) staticLayout.getLineRight(staticLayout.getLineCount() - 1));
        }
        return this.G;
    }
}
