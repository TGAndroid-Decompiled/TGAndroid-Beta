package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class tu0 extends vh.n {
    public final org.telegram.ui.Cells.y9 U;
    public ArrayList V;
    public boolean W;
    public Layout f42292a0;
    public org.telegram.ui.Components.x5 f42293b0;
    public boolean f42294c0;
    public org.telegram.ui.Components.ma0 f42295d0;
    public Layout f42296e0;
    public Path f42297f0;

    public tu0(Context context, ru0 ru0Var, org.telegram.ui.Cells.y9 y9Var, final Utilities.Callback2 callback2, final Utilities.Callback3 callback3) {
        super(context);
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        this.F = new org.telegram.ui.Components.ha0(this) {
            public final tu0 f41992b;

            {
                this.f41992b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r3) {
                    case 0:
                        tu0 tu0Var = this.f41992b;
                        tu0Var.getClass();
                        ((Utilities.Callback2) callback2).run(clickableSpan, tu0Var);
                        return;
                    default:
                        tu0 tu0Var2 = this.f41992b;
                        ((Utilities.Callback3) callback2).run(clickableSpan, tu0Var2, new uk0(tu0Var2, 22));
                        return;
                }
            }
        };
        this.G = new org.telegram.ui.Components.ha0(this) {
            public final tu0 f41992b;

            {
                this.f41992b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r3) {
                    case 0:
                        tu0 tu0Var = this.f41992b;
                        tu0Var.getClass();
                        ((Utilities.Callback2) callback3).run(clickableSpan, tu0Var);
                        return;
                    default:
                        tu0 tu0Var2 = this.f41992b;
                        ((Utilities.Callback3) callback3).run(clickableSpan, tu0Var2, new uk0(tu0Var2, 22));
                        return;
                }
            }
        };
        this.U = y9Var;
        w7.c6.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(w7.w5.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new o60(ru0Var, 18));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        float f7;
        if (this.f42294c0) {
            Layout layout = getLayout();
            Path path = this.f42297f0;
            if (path == null || this.f42296e0 != layout) {
                if (path == null) {
                    this.f42297f0 = new Path();
                } else {
                    path.rewind();
                }
                if (layout != null) {
                    float dp = AndroidUtilities.dp(16.0f);
                    float dp2 = AndroidUtilities.dp(8.0f);
                    float f10 = 0.0f;
                    int i11 = 0;
                    while (i11 < layout.getLineCount()) {
                        float f11 = dp / 3.0f;
                        float lineLeft = layout.getLineLeft(i11) - f11;
                        float lineRight = layout.getLineRight(i11) + f11;
                        if (i11 == 0) {
                            f10 = layout.getLineTop(i11) - (dp2 / 3.0f);
                        }
                        float lineBottom = layout.getLineBottom(i11);
                        if (i11 >= layout.getLineCount() - 1) {
                            f7 = (dp2 / 3.0f) + lineBottom;
                        } else {
                            f7 = lineBottom;
                        }
                        this.f42297f0.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + f10, getPaddingLeft() + lineRight, getPaddingTop() + f7, Path.Direction.CW);
                        i11++;
                        f10 = f7;
                    }
                }
                this.f42296e0 = layout;
            }
            if (this.f42295d0 == null) {
                org.telegram.ui.Components.ma0 ma0Var = new org.telegram.ui.Components.ma0();
                this.f42295d0 = ma0Var;
                ma0Var.f28482y = this.f42297f0;
                ma0Var.k(4.0f);
                this.f42295d0.g(org.telegram.ui.ActionBar.h6.m1(0.3f, -1), org.telegram.ui.ActionBar.h6.m1(0.1f, -1), org.telegram.ui.ActionBar.h6.m1(0.2f, -1), org.telegram.ui.ActionBar.h6.m1(0.7f, -1));
                this.f42295d0.setCallback(this);
            }
            this.f42295d0.setBounds(0, 0, getWidth(), getHeight());
            this.f42295d0.draw(canvas);
        }
        if (this.f42294c0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 178, 31);
        }
        if (this.V != null && this.W) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            for (int i12 = 0; i12 < this.V.size(); i12++) {
                org.telegram.ui.Components.wj0 wj0Var = (org.telegram.ui.Components.wj0) this.V.get(i12);
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                if (this.W) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = 0;
                }
                getPaint();
                wj0Var.a(canvas, width + i10, -1);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (this.f42294c0) {
            canvas.restore();
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        canvas.clipRect(0.0f, getScrollY(), getWidth() - getPaddingRight(), (getScrollY() + getHeight()) - (getPaddingBottom() * 0.75f));
        org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, getLayout(), this.f42293b0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.b6.release(this, this.f42293b0);
        this.V = org.telegram.ui.Components.ak0.e(null, this.V);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Cells.y9 y9Var = this.U;
        if (y9Var != null && y9Var.x()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (y9Var != null && getStaticTextLayout() != null && y9Var.f23552p0 == this) {
                y9Var.W(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.f42292a0 != getLayout()) {
            boolean z10 = true;
            int i10 = 0;
            this.f42293b0 = org.telegram.ui.Components.b6.update(0, this, this.f42293b0, getLayout());
            this.V = org.telegram.ui.Components.ak0.e(getLayout(), this.V);
            if (getLayout() == null || !(getLayout().getText() instanceof Spanned) || ((org.telegram.ui.Components.zj0[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), org.telegram.ui.Components.zj0.class)).length <= 0) {
                z10 = false;
            }
            this.W = z10;
            if (z10) {
                i10 = 32;
            }
            w7.c6.a(this, 16.0f, 8.0f, i10 + 16, 8.0f);
            this.f42292a0 = getLayout();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        this.f42293b0 = org.telegram.ui.Components.b6.update(0, this, this.f42293b0, getLayout());
        this.V = org.telegram.ui.Components.ak0.e(getLayout(), this.V);
    }

    public void setLoading(boolean z10) {
        if (this.f42294c0 == z10) {
            return;
        }
        this.f42294c0 = z10;
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
        if (drawable != this.f42295d0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
