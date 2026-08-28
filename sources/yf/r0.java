package yf;

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
import kh.w3;
import kh.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.y5;
public class r0 extends View {
    public float A;
    public StaticLayout B;
    public float C;
    public float D;
    public final int E;
    public final int F;
    public boolean G;
    public boolean H;
    public float I;
    public float J;
    public final RectF K;
    public final y5 L;
    public int f50078a;
    public String f50079b;
    public boolean f50080c;
    public final RectF d;
    public final TextPaint f50081e;
    public final Paint f50082f;
    public final Drawable h;
    public boolean f50083n;
    public final ImageReceiver f50084r;
    public final ImageReceiver f50085s;
    public TLRPC.Document v;
    public TLRPC.Document f50086w;
    public boolean f50087x;
    public final float f50088y;

    public r0(Context context, float f10) {
        super(context);
        this.f50079b = "";
        this.d = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        TextPaint textPaint = new TextPaint(1);
        this.f50081e = textPaint;
        this.f50082f = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f50084r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f50085s = imageReceiver2;
        this.A = 1.0f;
        this.K = new RectF();
        new Path();
        this.L = new y5(this, 350L, gr.h);
        this.f50088y = f10;
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver2.setCrossfadeWithOldImage(true);
        imageReceiver2.setInvalidateAll(true);
        int i9 = (int) (3.0f * f10);
        this.E = i9;
        int i10 = (int) (1.0f * f10);
        this.F = i10;
        setPadding(i9, i10, i9, i10);
        this.h = context.getResources().getDrawable(R.drawable.map_pin3).mutate();
        textPaint.setTextSize(f10 * 24.0f);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        NotificationCenter.listenEmojiLoading(this);
    }

    public static org.telegram.tgnet.TLRPC.Document b(java.lang.String r8, org.telegram.tgnet.TLRPC.TL_messages_stickerSet r9) {
        throw new UnsupportedOperationException("Method not decompiled: yf.r0.b(java.lang.String, org.telegram.tgnet.TLRPC$TL_messages_stickerSet):org.telegram.tgnet.TLRPC$Document");
    }

    public static w3 c(String str) {
        Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str);
        if (emojiBigDrawable instanceof Emoji.SimpleEmojiDrawable) {
            ((Emoji.SimpleEmojiDrawable) emojiBigDrawable).fullSize = false;
        }
        if (emojiBigDrawable == null) {
            return null;
        }
        return new w3(emojiBigDrawable, 7);
    }

    public final void a(Canvas canvas) {
        float f10;
        f();
        if (this.B == null) {
            return;
        }
        int i9 = this.E;
        float f11 = i9;
        int i10 = this.F;
        float f12 = i10;
        RectF rectF = this.K;
        rectF.set(f11, f12, this.I + f11, this.J + f12);
        float f13 = this.J * 0.2f;
        canvas.drawRoundRect(rectF, f13, f13, this.f50082f);
        boolean z10 = this.f50083n;
        float f14 = this.f50088y;
        RectF rectF2 = this.d;
        if (z10) {
            float e10 = this.L.e(this.H);
            if (e10 > 0.0f) {
                float f15 = f14 * 21.33f;
                float A = e2.c.A(this.J, f15, 2.0f, f12);
                ImageReceiver imageReceiver = this.f50085s;
                imageReceiver.setImageCoords(((rectF2.left + 2.25f) * f14) + f11, A, f15, f15);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                imageReceiver.setAlpha(e10);
                imageReceiver.draw(canvas);
                canvas.restore();
            }
            if (e10 < 1.0f) {
                float f16 = f14 * 21.33f;
                float A2 = e2.c.A(this.J, f16, 2.0f, f12);
                ImageReceiver imageReceiver2 = this.f50084r;
                imageReceiver2.setImageCoords(((rectF2.left + 2.25f) * f14) + f11, A2, f16, f16);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                imageReceiver2.setAlpha(1.0f - e10);
                imageReceiver2.draw(canvas);
                canvas.restore();
            }
        } else if (!this.f50087x) {
            float f17 = rectF2.left;
            float f18 = this.J;
            float f19 = f14 * 21.33f;
            Drawable drawable = this.h;
            drawable.setBounds(((int) (f17 * f14)) + i9, ((int) ((f18 - f19) / 2.0f)) + i10, i9 + ((int) ((f17 + 21.33f) * f14)), i10 + ((int) ((f19 + f18) / 2.0f)));
            drawable.draw(canvas);
        }
        canvas.save();
        float f20 = rectF2.left;
        if (!this.f50083n && !this.f50087x) {
            f10 = 0.0f;
        } else {
            f10 = 2.25f;
        }
        canvas.translate(((f20 + f10 + 21.33f + 3.25f) * f14) + f11, (this.J / 2.0f) + f12);
        float f21 = this.A;
        canvas.scale(f21, f21);
        canvas.translate(-this.D, (-this.B.getHeight()) / 2.0f);
        this.B.draw(canvas);
        canvas.restore();
    }

    public final void d(int i9, final String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        ImageReceiver imageReceiver = this.f50085s;
        ImageReceiver imageReceiver2 = this.f50084r;
        if (isEmpty) {
            this.f50083n = false;
            this.v = null;
            this.f50086w = null;
            imageReceiver2.clearImage();
            imageReceiver.clearImage();
        } else {
            this.f50083n = true;
            this.v = null;
            this.f50086w = null;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            MediaDataController.getInstance(i9).getStickerSet(tL_inputStickerSetShortName, 0, false, new Utilities.Callback(this) {
                public final r0 f50071b;

                {
                    this.f50071b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r3) {
                        case 0:
                            r0 r0Var = this.f50071b;
                            r0Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = r0.b(str2, (TLRPC.TL_messages_stickerSet) obj);
                            r0Var.v = b10;
                            r0Var.f50084r.setImage(ImageLocation.getForDocument(b10), "80_80", r0.c(str2), null, null, 0);
                            r0Var.f50085s.setImage(ImageLocation.getForDocument(r0Var.f50086w), "80_80", ImageLocation.getForDocument(r0Var.v), "80_80", null, null, r0.c(str2), 0L, null, null, 0);
                            return;
                        default:
                            r0 r0Var2 = this.f50071b;
                            r0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = r0.b(str3, (TLRPC.TL_messages_stickerSet) obj);
                            r0Var2.f50086w = b11;
                            if (b11 != null) {
                                r0Var2.f50085s.setImage(ImageLocation.getForDocument(b11), "80_80", ImageLocation.getForDocument(r0Var2.v), "80_80", null, null, r0.c(str3), 0L, null, null, 0);
                                return;
                            }
                            return;
                    }
                }
            });
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = "RestrictedEmoji";
            MediaDataController.getInstance(i9).getStickerSet(tL_inputStickerSetShortName2, 0, false, new Utilities.Callback(this) {
                public final r0 f50071b;

                {
                    this.f50071b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (r3) {
                        case 0:
                            r0 r0Var = this.f50071b;
                            r0Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = r0.b(str2, (TLRPC.TL_messages_stickerSet) obj);
                            r0Var.v = b10;
                            r0Var.f50084r.setImage(ImageLocation.getForDocument(b10), "80_80", r0.c(str2), null, null, 0);
                            r0Var.f50085s.setImage(ImageLocation.getForDocument(r0Var.f50086w), "80_80", ImageLocation.getForDocument(r0Var.v), "80_80", null, null, r0.c(str2), 0L, null, null, 0);
                            return;
                        default:
                            r0 r0Var2 = this.f50071b;
                            r0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = r0.b(str3, (TLRPC.TL_messages_stickerSet) obj);
                            r0Var2.f50086w = b11;
                            if (b11 != null) {
                                r0Var2.f50085s.setImage(ImageLocation.getForDocument(b11), "80_80", ImageLocation.getForDocument(r0Var2.v), "80_80", null, null, r0.c(str3), 0L, null, null, 0);
                                return;
                            }
                            return;
                    }
                }
            });
            imageReceiver2.setImage(ImageLocation.getForDocument(this.v), "80_80", c(str), null, null, 0);
            imageReceiver.setImage(ImageLocation.getForDocument(this.f50086w), "80_80", ImageLocation.getForDocument(this.v), "80_80", null, null, c(str), 0L, null, null, 0);
        }
        this.f50080c = true;
        requestLayout();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final void e(int i9, int i10) {
        int i11 = -16777216;
        Drawable drawable = this.h;
        TextPaint textPaint = this.f50081e;
        Paint paint = this.f50082f;
        if (i9 == 0) {
            paint.setColor(-16777216);
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i9 == 1) {
            paint.setColor(1275068416);
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else if (i9 == 2) {
            paint.setColor(-1);
            textPaint.setColor(-16777216);
            drawable.setColorFilter(null);
        } else {
            paint.setColor(i10);
            if (AndroidUtilities.computePerceivedBrightness(i10) < 0.721f) {
                i11 = -1;
            }
            textPaint.setColor(i11);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void f() {
        float f10;
        float f11;
        if (!this.f50080c) {
            return;
        }
        String str = this.f50079b;
        TextPaint textPaint = this.f50081e;
        float measureText = textPaint.measureText(str);
        int i9 = this.f50078a;
        int i10 = this.E;
        float f12 = (i9 - i10) - i10;
        RectF rectF = this.d;
        float f13 = rectF.left;
        float f14 = 2.25f;
        if (!this.f50083n && !this.f50087x) {
            f10 = 0.0f;
        } else {
            f10 = 2.25f;
        }
        float f15 = this.f50088y;
        float f16 = f12 - (((((f13 + f10) + 21.33f) + 3.25f) + rectF.right) * f15);
        float min = Math.min(1.0f, f16 / measureText);
        this.A = min;
        if (min < 0.4f) {
            f11 = 1.0f;
            String str2 = this.f50079b;
            this.B = new StaticLayout(str2, textPaint, x3.a(str2, textPaint), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        } else {
            f11 = 1.0f;
            this.B = new StaticLayout(this.f50079b, textPaint, (int) Math.ceil(measureText), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        this.C = 0.0f;
        this.D = Float.MAX_VALUE;
        for (int i11 = 0; i11 < this.B.getLineCount(); i11++) {
            this.C = Math.max(this.C, this.B.getLineWidth(i11));
            this.D = Math.min(this.D, this.B.getLineLeft(i11));
        }
        if (this.B.getLineCount() > 2) {
            this.A = 0.3f;
        } else {
            this.A = Math.min(f11, f16 / this.C);
        }
        float f17 = rectF.left;
        if (!this.f50083n && !this.f50087x) {
            f14 = 0.0f;
        }
        this.I = (this.C * this.A) + ((f17 + f14 + 21.33f + 3.25f + rectF.right) * f15);
        this.J = Math.max(f15 * 21.33f, this.B.getHeight() * this.A) + ((rectF.top + rectF.bottom) * f15);
        this.f50080c = false;
    }

    public TLRPC.Document getCodeEmojiDocument() {
        TLRPC.Document document;
        if (this.H && (document = this.f50086w) != null) {
            return document;
        }
        return this.v;
    }

    public int getHeightInternal() {
        int round = Math.round(this.J);
        int i9 = this.F;
        return round + i9 + i9;
    }

    public float getRadius() {
        return this.J * 0.2f;
    }

    public String getText() {
        return this.f50079b;
    }

    public int getTypesCount() {
        return 4;
    }

    public int getWidthInternal() {
        int round = Math.round(this.I);
        int i9 = this.E;
        return round + i9 + i9;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
        if (this.H) {
            this.f50085s.onAttachedToWindow();
        } else {
            this.f50084r.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = false;
        this.f50084r.onDetachedFromWindow();
        this.f50085s.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        f();
        setMeasuredDimension(getWidthInternal(), getHeightInternal());
    }

    public void setIsVideo(boolean z10) {
        if (this.H != z10 && this.G) {
            ImageReceiver imageReceiver = this.f50085s;
            ImageReceiver imageReceiver2 = this.f50084r;
            if (z10) {
                imageReceiver2.onDetachedFromWindow();
                imageReceiver.onAttachedToWindow();
            } else {
                imageReceiver2.onAttachedToWindow();
                imageReceiver.onDetachedFromWindow();
            }
        }
        this.H = z10;
        invalidate();
    }

    public void setMaxWidth(int i9) {
        this.f50078a = i9;
        this.f50080c = true;
    }

    public void setText(String str) {
        this.f50079b = str;
        this.f50080c = true;
        requestLayout();
    }
}
