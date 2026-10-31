package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.d20;
import org.telegram.messenger.ic;
import org.telegram.messenger.jc;
import org.telegram.messenger.sc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.eq;
public final class a1 extends View {
    public eq f50894a;
    public boolean f50895b;
    public final int f50896c;
    public org.telegram.ui.Components.f5 d;
    public final b1 e;
    public ImageReceiver f50897f;
    public long h;
    public final jc[] f50898n;
    public ImageReceiver f50899r;
    public final dc f50900s;
    public boolean f50901w;

    public a1(Context context, b1 b1Var) {
        super(context);
        this.f50896c = d20.f15147s0;
        this.f50898n = new jc[2];
        this.f50900s = new dc(this);
        setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
        this.e = b1Var;
    }

    public final void a(TLRPC.Document document, boolean z10) {
        long j10;
        int i10;
        long j11 = this.h;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f19799id;
        }
        if (j11 != j10) {
            org.telegram.ui.Components.f5 f5Var = this.d;
            if (f5Var != null) {
                f5Var.n(this);
            }
            if (document != null) {
                int i11 = 1;
                this.f50895b = true;
                this.h = document.f19799id;
                int i12 = u1.f51993y1;
                if (!z10) {
                    i11 = 16388;
                }
                if (sc.e(i11)) {
                    i10 = 3;
                } else {
                    i10 = 13;
                }
                org.telegram.ui.Components.f5 l4 = org.telegram.ui.Components.f5.l(this.f50896c, i10, document);
                this.d = l4;
                if (this.f50901w) {
                    l4.a(this);
                    return;
                }
                return;
            }
            this.f50895b = false;
            this.h = 0L;
            this.d = null;
        }
    }

    public float getScale() {
        return this.f50900s.a(0.15f);
    }

    @Override
    public final void invalidate() {
        this.e.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50901w = true;
        org.telegram.ui.Components.f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.a(this);
        }
        ImageReceiver imageReceiver = this.f50897f;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50901w = false;
        org.telegram.ui.Components.f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.n(this);
        }
        ImageReceiver imageReceiver = this.f50897f;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f50897f;
        if (imageReceiver != null) {
            imageReceiver.y0(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f50897f.h(canvas, null);
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
        this.f50895b = false;
        if (this.f50897f == null) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            this.f50897f = imageReceiver;
            imageReceiver.E0(7);
            ImageReceiver imageReceiver2 = this.f50897f;
            imageReceiver2.R0 = true;
            if (this.f50901w) {
                imageReceiver2.P();
            }
        }
        this.f50897f.w0(drawable);
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f50900s.c(z10);
    }

    public void setSticker(TLRPC.Document document) {
        View view;
        String str;
        this.f50895b = false;
        if (document != null) {
            long j10 = this.h;
            long j11 = document.f19799id;
            if (j10 != j11) {
                this.h = j11;
                if (this.f50897f == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    this.f50897f = imageReceiver;
                    imageReceiver.E0(7);
                    ImageReceiver imageReceiver2 = this.f50897f;
                    imageReceiver2.R0 = true;
                    if (this.f50901w) {
                        imageReceiver2.P();
                    }
                }
                ImageReceiver imageReceiver3 = this.f50897f;
                if (!this.f50895b) {
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
                if (!sc.e(1)) {
                    str = str.concat("_firstframe");
                }
                this.f50897f.r0(ic.b(document), str, ic.c(w9, document), "80_80", null, 0L, null, document, 0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver4 = this.f50897f;
        if (imageReceiver4 != null) {
            this.h = 0L;
            imageReceiver4.f();
        }
    }
}
