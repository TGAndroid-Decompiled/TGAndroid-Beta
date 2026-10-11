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
import ci.c4;
import ci.d4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.is;
public class s0 extends View {
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
    public final g6 P;
    public int f46654a;
    public String f46655b;
    public boolean f46656c;
    public final RectF d;
    public final TextPaint f46657e;
    public final Paint f46658f;
    public final Drawable h;
    public boolean f46659n;
    public final ImageReceiver f46660r;
    public final ImageReceiver f46661s;
    public TLRPC.Document v;
    public TLRPC.Document f46662w;
    public boolean f46663x;
    public final float f46664y;

    public s0(Context context, float f7) {
        super(context);
        this.f46655b = "";
        this.d = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        TextPaint textPaint = new TextPaint(1);
        this.f46657e = textPaint;
        this.f46658f = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f46660r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f46661s = imageReceiver2;
        this.E = 1.0f;
        this.O = new RectF();
        new Path();
        this.P = new g6(this, 350L, is.h);
        this.f46664y = f7;
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

    public static org.telegram.tgnet.TLRPC.Document b(java.lang.String r7, org.telegram.tgnet.TLRPC.TL_messages_stickerSet r8) {
        throw new UnsupportedOperationException("Method not decompiled: qg.s0.b(java.lang.String, org.telegram.tgnet.TLRPC$TL_messages_stickerSet):org.telegram.tgnet.TLRPC$Document");
    }

    public static c4 c(String str) {
        Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str);
        if (emojiBigDrawable instanceof Emoji.SimpleEmojiDrawable) {
            ((Emoji.SimpleEmojiDrawable) emojiBigDrawable).fullSize = false;
        }
        if (emojiBigDrawable == null) {
            return null;
        }
        return new c4(emojiBigDrawable, 6);
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
        canvas.drawRoundRect(rectF, f12, f12, this.f46658f);
        boolean z10 = this.f46659n;
        float f13 = this.f46664y;
        RectF rectF2 = this.d;
        if (z10) {
            float e7 = this.P.e(this.L);
            if (e7 > 0.0f) {
                float f14 = f13 * 21.33f;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.N, f14, 2.0f, f11);
                ImageReceiver imageReceiver = this.f46661s;
                imageReceiver.setImageCoords(((rectF2.left + 2.25f) * f13) + f10, z11, f14, f14);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                imageReceiver.setAlpha(e7);
                imageReceiver.draw(canvas);
                canvas.restore();
            }
            if (e7 < 1.0f) {
                float f15 = f13 * 21.33f;
                float z12 = com.google.android.gms.internal.vision.e2.z(this.N, f15, 2.0f, f11);
                ImageReceiver imageReceiver2 = this.f46660r;
                imageReceiver2.setImageCoords(((rectF2.left + 2.25f) * f13) + f10, z12, f15, f15);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                imageReceiver2.setAlpha(1.0f - e7);
                imageReceiver2.draw(canvas);
                canvas.restore();
            }
        } else if (!this.f46663x) {
            float f16 = rectF2.left;
            float f17 = this.N;
            float f18 = f13 * 21.33f;
            Drawable drawable = this.h;
            drawable.setBounds(((int) (f16 * f13)) + i10, ((int) ((f17 - f18) / 2.0f)) + i11, i10 + ((int) ((f16 + 21.33f) * f13)), i11 + ((int) ((f18 + f17) / 2.0f)));
            drawable.draw(canvas);
        }
        canvas.save();
        float f19 = rectF2.left;
        if (!this.f46659n && !this.f46663x) {
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
        ImageReceiver imageReceiver = this.f46661s;
        ImageReceiver imageReceiver2 = this.f46660r;
        if (isEmpty) {
            this.f46659n = false;
            this.v = null;
            this.f46662w = null;
            imageReceiver2.clearImage();
            imageReceiver.clearImage();
        } else {
            this.f46659n = true;
            this.v = null;
            this.f46662w = null;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName, 0, false, new Utilities.Callback(this) {
                public final s0 f46641b;

                {
                    this.f46641b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r3) {
                        case 0:
                            s0 s0Var = this.f46641b;
                            s0Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = s0.b(str2, (TLRPC.TL_messages_stickerSet) obj);
                            s0Var.v = b10;
                            s0Var.f46660r.setImage(ImageLocation.getForDocument(b10), "80_80", s0.c(str2), null, null, 0);
                            s0Var.f46661s.setImage(ImageLocation.getForDocument(s0Var.f46662w), "80_80", ImageLocation.getForDocument(s0Var.v), "80_80", null, null, s0.c(str2), 0L, null, null, 0);
                            return;
                        default:
                            s0 s0Var2 = this.f46641b;
                            s0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = s0.b(str3, (TLRPC.TL_messages_stickerSet) obj);
                            s0Var2.f46662w = b11;
                            if (b11 != null) {
                                s0Var2.f46661s.setImage(ImageLocation.getForDocument(b11), "80_80", ImageLocation.getForDocument(s0Var2.v), "80_80", null, null, s0.c(str3), 0L, null, null, 0);
                                return;
                            }
                            return;
                    }
                }
            });
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = "RestrictedEmoji";
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName2, 0, false, new Utilities.Callback(this) {
                public final s0 f46641b;

                {
                    this.f46641b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r3) {
                        case 0:
                            s0 s0Var = this.f46641b;
                            s0Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = s0.b(str2, (TLRPC.TL_messages_stickerSet) obj);
                            s0Var.v = b10;
                            s0Var.f46660r.setImage(ImageLocation.getForDocument(b10), "80_80", s0.c(str2), null, null, 0);
                            s0Var.f46661s.setImage(ImageLocation.getForDocument(s0Var.f46662w), "80_80", ImageLocation.getForDocument(s0Var.v), "80_80", null, null, s0.c(str2), 0L, null, null, 0);
                            return;
                        default:
                            s0 s0Var2 = this.f46641b;
                            s0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = s0.b(str3, (TLRPC.TL_messages_stickerSet) obj);
                            s0Var2.f46662w = b11;
                            if (b11 != null) {
                                s0Var2.f46661s.setImage(ImageLocation.getForDocument(b11), "80_80", ImageLocation.getForDocument(s0Var2.v), "80_80", null, null, s0.c(str3), 0L, null, null, 0);
                                return;
                            }
                            return;
                    }
                }
            });
            imageReceiver2.setImage(ImageLocation.getForDocument(this.v), "80_80", c(str), null, null, 0);
            imageReceiver.setImage(ImageLocation.getForDocument(this.f46662w), "80_80", ImageLocation.getForDocument(this.v), "80_80", null, null, c(str), 0L, null, null, 0);
        }
        this.f46656c = true;
        requestLayout();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final void e(int i10, int i11) {
        int i12 = -16777216;
        Drawable drawable = this.h;
        TextPaint textPaint = this.f46657e;
        Paint paint = this.f46658f;
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
        if (!this.f46656c) {
            return;
        }
        String str = this.f46655b;
        TextPaint textPaint = this.f46657e;
        float measureText = textPaint.measureText(str);
        int i10 = this.f46654a;
        int i11 = this.I;
        float f11 = (i10 - i11) - i11;
        RectF rectF = this.d;
        float f12 = rectF.left;
        float f13 = 2.25f;
        if (!this.f46659n && !this.f46663x) {
            f7 = 0.0f;
        } else {
            f7 = 2.25f;
        }
        float f14 = this.f46664y;
        float f15 = f11 - (((((f12 + f7) + 21.33f) + 3.25f) + rectF.right) * f14);
        float min = Math.min(1.0f, f15 / measureText);
        this.E = min;
        if (min < 0.4f) {
            f10 = 1.0f;
            String str2 = this.f46655b;
            this.F = new StaticLayout(str2, textPaint, d4.a(str2, textPaint), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        } else {
            f10 = 1.0f;
            this.F = new StaticLayout(this.f46655b, textPaint, (int) Math.ceil(measureText), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
        if (!this.f46659n && !this.f46663x) {
            f13 = 0.0f;
        }
        this.M = (this.G * this.E) + ((f16 + f13 + 21.33f + 3.25f + rectF.right) * f14);
        this.N = Math.max(f14 * 21.33f, this.F.getHeight() * this.E) + ((rectF.top + rectF.bottom) * f14);
        this.f46656c = false;
    }

    public TLRPC.Document getCodeEmojiDocument() {
        TLRPC.Document document;
        if (this.L && (document = this.f46662w) != null) {
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
        return this.f46655b;
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
            this.f46661s.onAttachedToWindow();
        } else {
            this.f46660r.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K = false;
        this.f46660r.onDetachedFromWindow();
        this.f46661s.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        f();
        setMeasuredDimension(getWidthInternal(), getHeightInternal());
    }

    public void setIsVideo(boolean z10) {
        if (this.L != z10 && this.K) {
            ImageReceiver imageReceiver = this.f46661s;
            ImageReceiver imageReceiver2 = this.f46660r;
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
        this.f46654a = i10;
        this.f46656c = true;
    }

    public void setText(String str) {
        this.f46655b = str;
        this.f46656c = true;
        requestLayout();
    }
}
