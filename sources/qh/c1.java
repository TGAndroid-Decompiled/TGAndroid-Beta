package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rc;
public final class c1 extends View {
    public boolean f45044a;
    public final int f45045b;
    public org.telegram.ui.Components.l5 f45046c;
    public final d1 d;
    public ImageReceiver f45047e;
    public long f45048f;
    public final ImageReceiver.BackgroundThreadDrawHolder[] h;
    public ImageReceiver f45049n;
    public final rc f45050r;
    public boolean f45051s;

    public c1(Context context, d1 d1Var) {
        super(context);
        this.f45045b = UserConfig.selectedAccount;
        this.h = new ImageReceiver.BackgroundThreadDrawHolder[2];
        this.f45050r = new rc(this);
        setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.d = d1Var;
    }

    public final void a(TLRPC.Document document, boolean z4) {
        long j10;
        int i10;
        long j11 = this.f45048f;
        if (document == null) {
            j10 = 0;
        } else {
            j10 = document.f20849id;
        }
        if (j11 != j10) {
            org.telegram.ui.Components.l5 l5Var = this.f45046c;
            if (l5Var != null) {
                l5Var.o(this);
            }
            if (document != null) {
                int i11 = 1;
                this.f45044a = true;
                this.f45048f = document.f20849id;
                int i12 = y1.D;
                if (!z4) {
                    i11 = 16388;
                }
                if (LiteMode.isEnabled(i11)) {
                    i10 = 3;
                } else {
                    i10 = 13;
                }
                org.telegram.ui.Components.l5 m9 = org.telegram.ui.Components.l5.m(this.f45045b, i10, document);
                this.f45046c = m9;
                if (this.f45051s) {
                    m9.a(this);
                    return;
                }
                return;
            }
            this.f45044a = false;
            this.f45048f = 0L;
            this.f45046c = null;
        }
    }

    public float getScale() {
        return this.f45050r.a(0.15f);
    }

    @Override
    public final void invalidate() {
        this.d.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45051s = true;
        org.telegram.ui.Components.l5 l5Var = this.f45046c;
        if (l5Var != null) {
            l5Var.a(this);
        }
        ImageReceiver imageReceiver = this.f45047e;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45051s = false;
        org.telegram.ui.Components.l5 l5Var = this.f45046c;
        if (l5Var != null) {
            l5Var.o(this);
        }
        ImageReceiver imageReceiver = this.f45047e;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f45047e;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f45047e.draw(canvas);
            return;
        }
        org.telegram.ui.Components.l5 l5Var = this.f45046c;
        if (l5Var != null) {
            l5Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f45046c.draw(canvas);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        org.telegram.ui.Components.l5 l5Var = this.f45046c;
        if (l5Var != null) {
            l5Var.o(this);
        }
        this.f45046c = null;
        this.f45048f = 0L;
        this.f45044a = false;
        if (this.f45047e == null) {
            ImageReceiver imageReceiver = new ImageReceiver();
            this.f45047e = imageReceiver;
            imageReceiver.setLayerNum(7);
            this.f45047e.setAspectFit(true);
            if (this.f45051s) {
                this.f45047e.onAttachedToWindow();
            }
        }
        this.f45047e.setImageBitmap(drawable);
    }

    @Override
    public void setPressed(boolean z4) {
        super.setPressed(z4);
        this.f45050r.c(z4);
    }

    public void setSticker(TLRPC.Document document) {
        View view;
        String str;
        this.f45044a = false;
        if (document != null) {
            long j10 = this.f45048f;
            long j11 = document.f20849id;
            if (j10 != j11) {
                this.f45048f = j11;
                if (this.f45047e == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    this.f45047e = imageReceiver;
                    imageReceiver.setLayerNum(7);
                    this.f45047e.setAspectFit(true);
                    if (this.f45051s) {
                        this.f45047e.onAttachedToWindow();
                    }
                }
                ImageReceiver imageReceiver2 = this.f45047e;
                if (!this.f45044a) {
                    view = this;
                } else {
                    view = this.d;
                }
                imageReceiver2.setParentView(view);
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                if ("video/webm".equals(document.mime_type)) {
                    str = "80_80_g";
                } else {
                    str = "80_80";
                }
                if (!LiteMode.isEnabled(1)) {
                    str = str.concat("_firstframe");
                }
                this.f45047e.setImage(ImageLocation.getForDocument(document), str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80", null, 0L, null, document, 0);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver3 = this.f45047e;
        if (imageReceiver3 != null) {
            this.f45048f = 0L;
            imageReceiver3.clearImage();
        }
    }
}
