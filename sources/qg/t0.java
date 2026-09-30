package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import ci.d4;
import ci.e4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.tr;
public class t0 extends View {
    public float E;
    public StaticLayout F;
    public float G;
    public float H;
    public final int I;
    public final int J;
    public boolean K;
    public boolean L;
    public float M;
    public float N;
    public final RectF O;
    public final e6 P;
    public int f42029a;
    public String f42030b;
    public boolean f42031c;
    public final RectF d;
    public final TextPaint e;
    public final Paint f42032f;
    public final Drawable h;
    public boolean f42033n;
    public final ImageReceiver f42034r;
    public final ImageReceiver f42035s;
    public TLRPC.Document v;
    public TLRPC.Document f42036w;
    public boolean f42037x;
    public final float f42038y;

    public t0(Context context, float f7) {
        super(context);
        this.f42030b = "";
        this.d = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        this.f42032f = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f42034r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f42035s = imageReceiver2;
        this.E = 1.0f;
        this.O = new RectF();
        new Path();
        this.P = new e6(this, 350L, tr.h);
        this.f42038y = f7;
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver2.setCrossfadeWithOldImage(true);
        imageReceiver2.setInvalidateAll(true);
        int i10 = (int) (3.0f * f7);
        this.I = i10;
        int i11 = (int) (1.0f * f7);
        this.J = i11;
        setPadding(i10, i11, i10, i11);
        this.h = context.getResources().getDrawable(R.drawable.map_pin3).mutate();
        textPaint.setTextSize(f7 * 24.0f);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        NotificationCenter.listenEmojiLoading(this);
    }

    public static org.telegram.tgnet.TLRPC.Document b(java.lang.String r8, org.telegram.tgnet.TLRPC.TL_messages_stickerSet r9) {
        throw new UnsupportedOperationException("Method not decompiled: qg.t0.b(java.lang.String, org.telegram.tgnet.TLRPC$TL_messages_stickerSet):org.telegram.tgnet.TLRPC$Document");
    }

    public static d4 c(String str) {
        Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str);
        if (emojiBigDrawable instanceof Emoji.SimpleEmojiDrawable) {
            ((Emoji.SimpleEmojiDrawable) emojiBigDrawable).fullSize = false;
        }
        if (emojiBigDrawable == null) {
            return null;
        }
        return new d4(emojiBigDrawable, 7);
    }

    public final void a(Canvas canvas) {
        float f7;
        f();
        if (this.F == null) {
            return;
        }
        int i10 = this.I;
        float f10 = i10;
        int i11 = this.J;
        float f11 = i11;
        RectF rectF = this.O;
        rectF.set(f10, f11, this.M + f10, this.N + f11);
        float f12 = this.N * 0.2f;
        canvas.drawRoundRect(rectF, f12, f12, this.f42032f);
        boolean z10 = this.f42033n;
        float f13 = this.f42038y;
        RectF rectF2 = this.d;
        if (z10) {
            float e = this.P.e(this.L);
            if (e > 0.0f) {
                float f14 = f13 * 21.33f;
                float A = com.google.android.gms.internal.vision.e2.A(this.N, f14, 2.0f, f11);
                ImageReceiver imageReceiver = this.f42035s;
                imageReceiver.setImageCoords(((rectF2.left + 2.25f) * f13) + f10, A, f14, f14);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                imageReceiver.setAlpha(e);
                imageReceiver.draw(canvas);
                canvas.restore();
            }
            if (e < 1.0f) {
                float f15 = f13 * 21.33f;
                float A2 = com.google.android.gms.internal.vision.e2.A(this.N, f15, 2.0f, f11);
                ImageReceiver imageReceiver2 = this.f42034r;
                imageReceiver2.setImageCoords(((rectF2.left + 2.25f) * f13) + f10, A2, f15, f15);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                imageReceiver2.setAlpha(1.0f - e);
                imageReceiver2.draw(canvas);
                canvas.restore();
            }
        } else if (!this.f42037x) {
            float f16 = rectF2.left;
            float f17 = this.N;
            float f18 = f13 * 21.33f;
            Drawable drawable = this.h;
            drawable.setBounds(((int) (f16 * f13)) + i10, ((int) ((f17 - f18) / 2.0f)) + i11, i10 + ((int) ((f16 + 21.33f) * f13)), i11 + ((int) ((f18 + f17) / 2.0f)));
            drawable.draw(canvas);
        }
        canvas.save();
        float f19 = rectF2.left;
        if (!this.f42033n && !this.f42037x) {
            f7 = 0.0f;
        } else {
            f7 = 2.25f;
        }
        canvas.translate(((f19 + f7 + 21.33f + 3.25f) * f13) + f10, (this.N / 2.0f) + f11);
        float f20 = this.E;
        canvas.scale(f20, f20);
        canvas.translate(-this.H, (-this.F.getHeight()) / 2.0f);
        this.F.draw(canvas);
        canvas.restore();
    }

    public final void d(int i10, final String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        ImageReceiver imageReceiver = this.f42035s;
        ImageReceiver imageReceiver2 = this.f42034r;
        if (isEmpty) {
            this.f42033n = false;
            this.v = null;
            this.f42036w = null;
            imageReceiver2.clearImage();
            imageReceiver.clearImage();
        } else {
            this.f42033n = true;
            this.v = null;
            this.f42036w = null;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName, 0, false, new Utilities.Callback(this) {
                public final t0 f42017b;

                {
                    this.f42017b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r3) {
                        case 0:
                            t0 t0Var = this.f42017b;
                            t0Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = t0.b(str2, (TLRPC.TL_messages_stickerSet) obj);
                            t0Var.v = b10;
                            t0Var.f42034r.setImage(ImageLocation.getForDocument(b10), "80_80", t0.c(str2), null, null, 0);
                            t0Var.f42035s.setImage(ImageLocation.getForDocument(t0Var.f42036w), "80_80", ImageLocation.getForDocument(t0Var.v), "80_80", null, null, t0.c(str2), 0L, null, null, 0);
                            return;
                        default:
                            t0 t0Var2 = this.f42017b;
                            t0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = t0.b(str3, (TLRPC.TL_messages_stickerSet) obj);
                            t0Var2.f42036w = b11;
                            if (b11 != null) {
                                t0Var2.f42035s.setImage(ImageLocation.getForDocument(b11), "80_80", ImageLocation.getForDocument(t0Var2.v), "80_80", null, null, t0.c(str3), 0L, null, null, 0);
                                return;
                            }
                            return;
                    }
                }
            });
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = "RestrictedEmoji";
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName2, 0, false, new Utilities.Callback(this) {
                public final t0 f42017b;

                {
                    this.f42017b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r3) {
                        case 0:
                            t0 t0Var = this.f42017b;
                            t0Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = t0.b(str2, (TLRPC.TL_messages_stickerSet) obj);
                            t0Var.v = b10;
                            t0Var.f42034r.setImage(ImageLocation.getForDocument(b10), "80_80", t0.c(str2), null, null, 0);
                            t0Var.f42035s.setImage(ImageLocation.getForDocument(t0Var.f42036w), "80_80", ImageLocation.getForDocument(t0Var.v), "80_80", null, null, t0.c(str2), 0L, null, null, 0);
                            return;
                        default:
                            t0 t0Var2 = this.f42017b;
                            t0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = t0.b(str3, (TLRPC.TL_messages_stickerSet) obj);
                            t0Var2.f42036w = b11;
                            if (b11 != null) {
                                t0Var2.f42035s.setImage(ImageLocation.getForDocument(b11), "80_80", ImageLocation.getForDocument(t0Var2.v), "80_80", null, null, t0.c(str3), 0L, null, null, 0);
                                return;
                            }
                            return;
                    }
                }
            });
            imageReceiver2.setImage(ImageLocation.getForDocument(this.v), "80_80", c(str), null, null, 0);
            imageReceiver.setImage(ImageLocation.getForDocument(this.f42036w), "80_80", ImageLocation.getForDocument(this.v), "80_80", null, null, c(str), 0L, null, null, 0);
        }
        this.f42031c = true;
        requestLayout();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final void e(int i10, int i11) {
        int i12 = -16777216;
        Drawable drawable = this.h;
        TextPaint textPaint = this.e;
        Paint paint = this.f42032f;
        if (i10 == 0) {
            paint.setColor(-16777216);
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 1) {
            paint.setColor(1275068416);
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else if (i10 == 2) {
            paint.setColor(-1);
            textPaint.setColor(-16777216);
            drawable.setColorFilter(null);
        } else {
            paint.setColor(i11);
            if (AndroidUtilities.computePerceivedBrightness(i11) < 0.721f) {
                i12 = -1;
            }
            textPaint.setColor(i12);
            drawable.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void f() {
        float f7;
        float f10;
        if (!this.f42031c) {
            return;
        }
        String str = this.f42030b;
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText(str);
        int i10 = this.f42029a;
        int i11 = this.I;
        float f11 = (i10 - i11) - i11;
        RectF rectF = this.d;
        float f12 = rectF.left;
        float f13 = 2.25f;
        if (!this.f42033n && !this.f42037x) {
            f7 = 0.0f;
        } else {
            f7 = 2.25f;
        }
        float f14 = this.f42038y;
        float f15 = f11 - (((((f12 + f7) + 21.33f) + 3.25f) + rectF.right) * f14);
        float min = Math.min(1.0f, f15 / measureText);
        this.E = min;
        if (min < 0.4f) {
            f10 = 1.0f;
            String str2 = this.f42030b;
            this.F = new StaticLayout(str2, textPaint, e4.a(str2, textPaint), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        } else {
            f10 = 1.0f;
            this.F = new StaticLayout(this.f42030b, textPaint, (int) Math.ceil(measureText), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        this.G = 0.0f;
        this.H = Float.MAX_VALUE;
        for (int i12 = 0; i12 < this.F.getLineCount(); i12++) {
            this.G = Math.max(this.G, this.F.getLineWidth(i12));
            this.H = Math.min(this.H, this.F.getLineLeft(i12));
        }
        if (this.F.getLineCount() > 2) {
            this.E = 0.3f;
        } else {
            this.E = Math.min(f10, f15 / this.G);
        }
        float f16 = rectF.left;
        if (!this.f42033n && !this.f42037x) {
            f13 = 0.0f;
        }
        this.M = (this.G * this.E) + ((f16 + f13 + 21.33f + 3.25f + rectF.right) * f14);
        this.N = Math.max(f14 * 21.33f, this.F.getHeight() * this.E) + ((rectF.top + rectF.bottom) * f14);
        this.f42031c = false;
    }

    public TLRPC.Document getCodeEmojiDocument() {
        TLRPC.Document document;
        if (this.L && (document = this.f42036w) != null) {
            return document;
        }
        return this.v;
    }

    public int getHeightInternal() {
        int round = Math.round(this.N);
        int i10 = this.J;
        return round + i10 + i10;
    }

    public float getRadius() {
        return this.N * 0.2f;
    }

    public String getText() {
        return this.f42030b;
    }

    public int getTypesCount() {
        return 4;
    }

    public int getWidthInternal() {
        int round = Math.round(this.M);
        int i10 = this.I;
        return round + i10 + i10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        if (this.L) {
            this.f42035s.onAttachedToWindow();
        } else {
            this.f42034r.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K = false;
        this.f42034r.onDetachedFromWindow();
        this.f42035s.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        f();
        setMeasuredDimension(getWidthInternal(), getHeightInternal());
    }

    public void setIsVideo(boolean z10) {
        if (this.L != z10 && this.K) {
            ImageReceiver imageReceiver = this.f42035s;
            ImageReceiver imageReceiver2 = this.f42034r;
            if (z10) {
                imageReceiver2.onDetachedFromWindow();
                imageReceiver.onAttachedToWindow();
            } else {
                imageReceiver2.onAttachedToWindow();
                imageReceiver.onDetachedFromWindow();
            }
        }
        this.L = z10;
        invalidate();
    }

    public void setMaxWidth(int i10) {
        this.f42029a = i10;
        this.f42031c = true;
    }

    public void setText(String str) {
        this.f42030b = str;
        this.f42031c = true;
        requestLayout();
    }
}
