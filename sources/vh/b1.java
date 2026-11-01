package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.e20;
import org.telegram.messenger.jc;
import org.telegram.messenger.kc;
import org.telegram.messenger.tc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.eq;
public final class b1 extends View {
    public eq f50947a;
    public boolean f50948b;
    public final int f50949c;
    public org.telegram.ui.Components.f5 d;
    public final c1 e;
    public ImageReceiver f50950f;
    public long h;
    public final kc[] f50951n;
    public ImageReceiver f50952r;
    public final dc f50953s;
    public boolean f50954w;

    public b1(Context context, c1 c1Var) {
        super(context);
        this.f50949c = e20.f15506s0;
        this.f50951n = new kc[2];
        this.f50953s = new dc(this);
        setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
        this.e = c1Var;
    }

    public final void a(TLRPC.Document document, boolean z10) {
        long j10;
        int i10;
        long j11 = this.h;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f19800id;
        }
        if (j11 != j10) {
            org.telegram.ui.Components.f5 f5Var = this.d;
            if (f5Var != null) {
                f5Var.n(this);
            }
            if (document != null) {
                int i11 = 1;
                this.f50948b = true;
                this.h = document.f19800id;
                int i12 = u1.f52000y1;
                if (!z10) {
                    i11 = 16388;
                }
                if (tc.e(i11)) {
                    i10 = 3;
                } else {
                    i10 = 13;
                }
                org.telegram.ui.Components.f5 l4 = org.telegram.ui.Components.f5.l(this.f50949c, i10, document);
                this.d = l4;
                if (this.f50954w) {
                    l4.a(this);
                    return;
                }
                return;
            }
            this.f50948b = false;
            this.h = 0L;
            this.d = null;
        }
    }

    public float getScale() {
        return this.f50953s.a(0.15f);
    }

    @Override
    public final void invalidate() {
        this.e.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50954w = true;
        org.telegram.ui.Components.f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.a(this);
        }
        ImageReceiver imageReceiver = this.f50950f;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50954w = false;
        org.telegram.ui.Components.f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.n(this);
        }
        ImageReceiver imageReceiver = this.f50950f;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f50950f;
        if (imageReceiver != null) {
            imageReceiver.y0(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f50950f.h(canvas, null);
            return;
        }
        org.telegram.ui.Components.f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.d.draw(canvas);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        org.telegram.ui.Components.f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.n(this);
        }
        this.d = null;
        this.h = 0L;
        this.f50948b = false;
        if (this.f50950f == null) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            this.f50950f = imageReceiver;
            imageReceiver.E0(7);
            ImageReceiver imageReceiver2 = this.f50950f;
            imageReceiver2.R0 = true;
            if (this.f50954w) {
                imageReceiver2.P();
            }
        }
        this.f50950f.w0(drawable);
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f50953s.c(z10);
    }

    public void setSticker(TLRPC.Document document) {
        View view;
        String str;
        this.f50948b = false;
        if (document != null) {
            long j10 = this.h;
            long j11 = document.f19800id;
            if (j10 != j11) {
                this.h = j11;
                if (this.f50950f == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    this.f50950f = imageReceiver;
                    imageReceiver.E0(7);
                    ImageReceiver imageReceiver2 = this.f50950f;
                    imageReceiver2.R0 = true;
                    if (this.f50954w) {
                        imageReceiver2.P();
                    }
                }
                ImageReceiver imageReceiver3 = this.f50950f;
                if (!this.f50948b) {
                    view = this;
                } else {
                    view = this.e;
                }
                imageReceiver3.H0(view);
                TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    str = "80_80_g";
                } else {
                    str = "80_80";
                }
                if (!tc.e(1)) {
                    str = str.concat("_firstframe");
                }
                this.f50950f.r0(jc.b(document), str, jc.c(w9, document), "80_80", null, 0L, null, document, 0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver4 = this.f50950f;
        if (imageReceiver4 != null) {
            this.h = 0L;
            imageReceiver4.f();
        }
    }
}
