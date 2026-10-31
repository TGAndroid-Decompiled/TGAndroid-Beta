package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.ArrayList;
public final class vr0 extends nh.p {
    public final org.telegram.ui.Cells.t9 U;
    public ArrayList V;
    public boolean W;
    public Layout f42802a0;
    public org.telegram.ui.Components.k5 f42803b0;
    public boolean f42804c0;
    public org.telegram.ui.Components.t80 f42805d0;
    public Layout f42806e0;
    public Path f42807f0;

    public vr0(Context context, tr0 tr0Var, org.telegram.ui.Cells.t9 t9Var, final org.telegram.messenger.j20 j20Var, final org.telegram.messenger.l20 l20Var) {
        super(context);
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        this.F = new org.telegram.ui.Components.o80(this) {
            public final vr0 f42521b;

            {
                this.f42521b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r3) {
                    case 0:
                        vr0 vr0Var = this.f42521b;
                        vr0Var.getClass();
                        ((org.telegram.messenger.j20) j20Var).a(clickableSpan, vr0Var);
                        return;
                    default:
                        vr0 vr0Var2 = this.f42521b;
                        ((org.telegram.messenger.l20) j20Var).a(clickableSpan, vr0Var2, new mg0(vr0Var2, 25));
                        return;
                }
            }
        };
        this.G = new org.telegram.ui.Components.o80(this) {
            public final vr0 f42521b;

            {
                this.f42521b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r3) {
                    case 0:
                        vr0 vr0Var = this.f42521b;
                        vr0Var.getClass();
                        ((org.telegram.messenger.j20) l20Var).a(clickableSpan, vr0Var);
                        return;
                    default:
                        vr0 vr0Var2 = this.f42521b;
                        ((org.telegram.messenger.l20) l20Var).a(clickableSpan, vr0Var2, new mg0(vr0Var2, 25));
                        return;
                }
            }
        };
        this.U = t9Var;
        w7.i6.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(w7.b6.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new f50(tr0Var, 20));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        float f7;
        if (this.f42804c0) {
            Layout layout = getLayout();
            Path path = this.f42807f0;
            if (path == null || this.f42806e0 != layout) {
                if (path == null) {
                    this.f42807f0 = new Path();
                } else {
                    path.rewind();
                }
                if (layout != null) {
                    float L = org.telegram.messenger.i0.L(16.0f);
                    float L2 = org.telegram.messenger.i0.L(8.0f);
                    float f10 = 0.0f;
                    int i11 = 0;
                    while (i11 < layout.getLineCount()) {
                        float f11 = L / 3.0f;
                        float lineLeft = layout.getLineLeft(i11) - f11;
                        float lineRight = layout.getLineRight(i11) + f11;
                        if (i11 == 0) {
                            f10 = layout.getLineTop(i11) - (L2 / 3.0f);
                        }
                        float lineBottom = layout.getLineBottom(i11);
                        if (i11 >= layout.getLineCount() - 1) {
                            f7 = (L2 / 3.0f) + lineBottom;
                        } else {
                            f7 = lineBottom;
                        }
                        this.f42807f0.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + f10, getPaddingLeft() + lineRight, getPaddingTop() + f7, Path.Direction.CW);
                        i11++;
                        f10 = f7;
                    }
                }
                this.f42806e0 = layout;
            }
            if (this.f42805d0 == null) {
                org.telegram.ui.Components.t80 t80Var = new org.telegram.ui.Components.t80();
                this.f42805d0 = t80Var;
                t80Var.f30521y = this.f42807f0;
                t80Var.k(4.0f);
                this.f42805d0.g(org.telegram.ui.ActionBar.t6.r1(0.3f, -1), org.telegram.ui.ActionBar.t6.r1(0.1f, -1), org.telegram.ui.ActionBar.t6.r1(0.2f, -1), org.telegram.ui.ActionBar.t6.r1(0.7f, -1));
                this.f42805d0.setCallback(this);
            }
            this.f42805d0.setBounds(0, 0, getWidth(), getHeight());
            this.f42805d0.draw(canvas);
        }
        if (this.f42804c0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 178, 31);
        }
        if (this.V != null && this.W) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            for (int i12 = 0; i12 < this.V.size(); i12++) {
                org.telegram.ui.Components.sh0 sh0Var = (org.telegram.ui.Components.sh0) this.V.get(i12);
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                if (this.W) {
                    i10 = org.telegram.messenger.i0.L(32.0f);
                } else {
                    i10 = 0;
                }
                getPaint();
                sh0Var.a(canvas, width + i10, -1);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (this.f42804c0) {
            canvas.restore();
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        canvas.clipRect(0.0f, getScrollY(), getWidth() - getPaddingRight(), (getScrollY() + getHeight()) - (getPaddingBottom() * 0.75f));
        org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, getLayout(), this.f42803b0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.o5.release(this, this.f42803b0);
        this.V = org.telegram.ui.Components.wh0.e(null, this.V);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Cells.t9 t9Var = this.U;
        if (t9Var != null && t9Var.x()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (t9Var != null && getStaticTextLayout() != null && t9Var.f23109p0 == this) {
                t9Var.W(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.f42802a0 != getLayout()) {
            boolean z10 = true;
            int i10 = 0;
            this.f42803b0 = org.telegram.ui.Components.o5.update(0, this, this.f42803b0, getLayout());
            this.V = org.telegram.ui.Components.wh0.e(getLayout(), this.V);
            if (getLayout() == null || !(getLayout().getText() instanceof Spanned) || ((org.telegram.ui.Components.vh0[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), org.telegram.ui.Components.vh0.class)).length <= 0) {
                z10 = false;
            }
            this.W = z10;
            if (z10) {
                i10 = 32;
            }
            w7.i6.a(this, 16.0f, 8.0f, i10 + 16, 8.0f);
            this.f42802a0 = getLayout();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        this.f42803b0 = org.telegram.ui.Components.o5.update(0, this, this.f42803b0, getLayout());
        this.V = org.telegram.ui.Components.wh0.e(getLayout(), this.V);
    }

    public void setLoading(boolean z10) {
        if (this.f42804c0 == z10) {
            return;
        }
        this.f42804c0 = z10;
        invalidate();
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        if (z10 != isPressed()) {
            z11 = true;
        } else {
            z11 = false;
        }
        super.setPressed(z10);
        if (z11) {
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f42805d0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
