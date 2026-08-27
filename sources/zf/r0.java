package zf;

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
import java.util.ArrayList;
import lh.v3;
import lh.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
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

    public int f50673a;

    public String f50674b;

    public boolean f50675c;
    public final RectF d;

    public final TextPaint f50676e;

    public final Paint f50677f;
    public final Drawable h;

    public boolean f50678n;

    public final ImageReceiver f50679r;

    public final ImageReceiver f50680s;
    public TLRPC.Document v;

    public TLRPC.Document f50681w;

    public boolean f50682x;

    public final float f50683y;

    public r0(Context context, float f10) {
        super(context);
        this.f50674b = "";
        this.d = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        TextPaint textPaint = new TextPaint(1);
        this.f50676e = textPaint;
        this.f50677f = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f50679r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f50680s = imageReceiver2;
        this.A = 1.0f;
        this.K = new RectF();
        new Path();
        this.L = new y5(this, 350L, er.h);
        this.f50683y = f10;
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver2.setCrossfadeWithOldImage(true);
        imageReceiver2.setInvalidateAll(true);
        int i10 = (int) (3.0f * f10);
        this.E = i10;
        int i11 = (int) (1.0f * f10);
        this.F = i11;
        setPadding(i10, i11, i10, i11);
        this.h = context.getResources().getDrawable(R.drawable.map_pin3).mutate();
        textPaint.setTextSize(f10 * 24.0f);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        NotificationCenter.listenEmojiLoading(this);
    }

    public static TLRPC.Document b(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.packs == null || tL_messages_stickerSet.documents == null) {
            return null;
        }
        for (int i10 = 0; i10 < tL_messages_stickerSet.packs.size(); i10++) {
            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i10);
            String str2 = tL_stickerPack.emoticon;
            if (str2 != null && str != null) {
                ArrayList<Emoji.EmojiSpanRange> emojis = Emoji.parseEmojis(str2);
                for (int i11 = 0; i11 < emojis.size(); i11++) {
                    if (TextUtils.equals(emojis.get(i11).code, str)) {
                        if (!tL_stickerPack.documents.isEmpty()) {
                            long jLongValue = tL_stickerPack.documents.get(0).longValue();
                            for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                                if (tL_messages_stickerSet.documents.get(i12).f22386id == jLongValue) {
                                    return tL_messages_stickerSet.documents.get(i12);
                                }
                            }
                            break;
                        }
                        break;
                    }
                }
            }
        }
        return null;
    }

    public static v3 c(String str) {
        Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str);
        if (emojiBigDrawable instanceof Emoji.SimpleEmojiDrawable) {
            ((Emoji.SimpleEmojiDrawable) emojiBigDrawable).fullSize = false;
        }
        if (emojiBigDrawable == null) {
            return null;
        }
        return new v3(emojiBigDrawable, 7);
    }

    public final void a(Canvas canvas) {
        f();
        if (this.B == null) {
            return;
        }
        int i10 = this.E;
        float f10 = i10;
        int i11 = this.F;
        float f11 = i11;
        float f12 = this.I + f10;
        float f13 = this.J + f11;
        RectF rectF = this.K;
        rectF.set(f10, f11, f12, f13);
        float f14 = this.J * 0.2f;
        canvas.drawRoundRect(rectF, f14, f14, this.f50677f);
        boolean z10 = this.f50678n;
        float f15 = this.f50683y;
        RectF rectF2 = this.d;
        if (z10) {
            float fE = this.L.e(this.H);
            if (fE > 0.0f) {
                float f16 = ((rectF2.left + 2.25f) * f15) + f10;
                float f17 = f15 * 21.33f;
                float fA = com.google.android.recaptcha.internal.a.A(this.J, f17, 2.0f, f11);
                ImageReceiver imageReceiver = this.f50680s;
                imageReceiver.setImageCoords(f16, fA, f17, f17);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                imageReceiver.setAlpha(fE);
                imageReceiver.draw(canvas);
                canvas.restore();
            }
            if (fE < 1.0f) {
                float f18 = ((rectF2.left + 2.25f) * f15) + f10;
                float f19 = f15 * 21.33f;
                float fA2 = com.google.android.recaptcha.internal.a.A(this.J, f19, 2.0f, f11);
                ImageReceiver imageReceiver2 = this.f50679r;
                imageReceiver2.setImageCoords(f18, fA2, f19, f19);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                imageReceiver2.setAlpha(1.0f - fE);
                imageReceiver2.draw(canvas);
                canvas.restore();
            }
        } else if (!this.f50682x) {
            float f20 = rectF2.left;
            float f21 = this.J;
            float f22 = f15 * 21.33f;
            Drawable drawable = this.h;
            drawable.setBounds(((int) (f20 * f15)) + i10, ((int) ((f21 - f22) / 2.0f)) + i11, i10 + ((int) ((f20 + 21.33f) * f15)), i11 + ((int) ((f22 + f21) / 2.0f)));
            drawable.draw(canvas);
        }
        canvas.save();
        canvas.translate(((rectF2.left + ((this.f50678n || this.f50682x) ? 2.25f : 0.0f) + 21.33f + 3.25f) * f15) + f10, (this.J / 2.0f) + f11);
        float f23 = this.A;
        canvas.scale(f23, f23);
        canvas.translate(-this.D, (-this.B.getHeight()) / 2.0f);
        this.B.draw(canvas);
        canvas.restore();
    }

    public final void d(int i10, final String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        ImageReceiver imageReceiver = this.f50680s;
        ImageReceiver imageReceiver2 = this.f50679r;
        if (zIsEmpty) {
            this.f50678n = false;
            this.v = null;
            this.f50681w = null;
            imageReceiver2.clearImage();
            imageReceiver.clearImage();
        } else {
            this.f50678n = true;
            this.v = null;
            this.f50681w = null;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            final int i11 = 0;
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName, 0, false, new Utilities.Callback(this) {

                public final r0 f50665b;

                {
                    this.f50665b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            r0 r0Var = this.f50665b;
                            r0Var.getClass();
                            String str2 = str;
                            TLRPC.Document documentB = r0.b(str2, (TLRPC.TL_messages_stickerSet) obj);
                            r0Var.v = documentB;
                            r0Var.f50679r.setImage(ImageLocation.getForDocument(documentB), "80_80", r0.c(str2), null, null, 0);
                            r0Var.f50680s.setImage(ImageLocation.getForDocument(r0Var.f50681w), "80_80", ImageLocation.getForDocument(r0Var.v), "80_80", null, null, r0.c(str2), 0L, null, null, 0);
                            break;
                        default:
                            r0 r0Var2 = this.f50665b;
                            r0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document documentB2 = r0.b(str3, (TLRPC.TL_messages_stickerSet) obj);
                            r0Var2.f50681w = documentB2;
                            if (documentB2 != null) {
                                r0Var2.f50680s.setImage(ImageLocation.getForDocument(documentB2), "80_80", ImageLocation.getForDocument(r0Var2.v), "80_80", null, null, r0.c(str3), 0L, null, null, 0);
                                break;
                            }
                            break;
                    }
                }
            });
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = "RestrictedEmoji";
            final int i12 = 1;
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName2, 0, false, new Utilities.Callback(this) {

                public final r0 f50665b;

                {
                    this.f50665b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            r0 r0Var = this.f50665b;
                            r0Var.getClass();
                            String str2 = str;
                            TLRPC.Document documentB = r0.b(str2, (TLRPC.TL_messages_stickerSet) obj);
                            r0Var.v = documentB;
                            r0Var.f50679r.setImage(ImageLocation.getForDocument(documentB), "80_80", r0.c(str2), null, null, 0);
                            r0Var.f50680s.setImage(ImageLocation.getForDocument(r0Var.f50681w), "80_80", ImageLocation.getForDocument(r0Var.v), "80_80", null, null, r0.c(str2), 0L, null, null, 0);
                            break;
                        default:
                            r0 r0Var2 = this.f50665b;
                            r0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document documentB2 = r0.b(str3, (TLRPC.TL_messages_stickerSet) obj);
                            r0Var2.f50681w = documentB2;
                            if (documentB2 != null) {
                                r0Var2.f50680s.setImage(ImageLocation.getForDocument(documentB2), "80_80", ImageLocation.getForDocument(r0Var2.v), "80_80", null, null, r0.c(str3), 0L, null, null, 0);
                                break;
                            }
                            break;
                    }
                }
            });
            imageReceiver2.setImage(ImageLocation.getForDocument(this.v), "80_80", c(str), null, null, 0);
            imageReceiver.setImage(ImageLocation.getForDocument(this.f50681w), "80_80", ImageLocation.getForDocument(this.v), "80_80", null, null, c(str), 0L, null, null, 0);
        }
        this.f50675c = true;
        requestLayout();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final void e(int i10, int i11) {
        Drawable drawable = this.h;
        TextPaint textPaint = this.f50676e;
        Paint paint = this.f50677f;
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
            int i12 = AndroidUtilities.computePerceivedBrightness(i11) < 0.721f ? -1 : -16777216;
            textPaint.setColor(i12);
            drawable.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void f() {
        float f10;
        if (this.f50675c) {
            String str = this.f50674b;
            TextPaint textPaint = this.f50676e;
            float fMeasureText = textPaint.measureText(str);
            int i10 = this.f50673a;
            int i11 = this.E;
            float f11 = (i10 - i11) - i11;
            RectF rectF = this.d;
            float f12 = 2.25f;
            float f13 = rectF.left + ((this.f50678n || this.f50682x) ? 2.25f : 0.0f) + 21.33f + 3.25f + rectF.right;
            float f14 = this.f50683y;
            float f15 = f11 - (f13 * f14);
            float fMin = Math.min(1.0f, f15 / fMeasureText);
            this.A = fMin;
            if (fMin < 0.4f) {
                f10 = 1.0f;
                String str2 = this.f50674b;
                this.B = new StaticLayout(str2, textPaint, w3.a(str2, textPaint), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                f10 = 1.0f;
                this.B = new StaticLayout(this.f50674b, textPaint, (int) Math.ceil(fMeasureText), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            this.C = 0.0f;
            this.D = Float.MAX_VALUE;
            for (int i12 = 0; i12 < this.B.getLineCount(); i12++) {
                this.C = Math.max(this.C, this.B.getLineWidth(i12));
                this.D = Math.min(this.D, this.B.getLineLeft(i12));
            }
            if (this.B.getLineCount() > 2) {
                this.A = 0.3f;
            } else {
                this.A = Math.min(f10, f15 / this.C);
            }
            float f16 = rectF.left;
            if (!this.f50678n && !this.f50682x) {
                f12 = 0.0f;
            }
            this.I = (this.C * this.A) + ((f16 + f12 + 21.33f + 3.25f + rectF.right) * f14);
            this.J = Math.max(f14 * 21.33f, this.B.getHeight() * this.A) + ((rectF.top + rectF.bottom) * f14);
            this.f50675c = false;
        }
    }

    public TLRPC.Document getCodeEmojiDocument() {
        TLRPC.Document document;
        return (!this.H || (document = this.f50681w) == null) ? this.v : document;
    }

    public int getHeightInternal() {
        int iRound = Math.round(this.J);
        int i10 = this.F;
        return iRound + i10 + i10;
    }

    public float getRadius() {
        return this.J * 0.2f;
    }

    public String getText() {
        return this.f50674b;
    }

    public int getTypesCount() {
        return 4;
    }

    public int getWidthInternal() {
        int iRound = Math.round(this.I);
        int i10 = this.E;
        return iRound + i10 + i10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
        if (this.H) {
            this.f50680s.onAttachedToWindow();
        } else {
            this.f50679r.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = false;
        this.f50679r.onDetachedFromWindow();
        this.f50680s.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        f();
        setMeasuredDimension(getWidthInternal(), getHeightInternal());
    }

    public void setIsVideo(boolean z10) {
        if (this.H != z10 && this.G) {
            ImageReceiver imageReceiver = this.f50680s;
            ImageReceiver imageReceiver2 = this.f50679r;
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

    public void setMaxWidth(int i10) {
        this.f50673a = i10;
        this.f50675c = true;
    }

    public void setText(String str) {
        this.f50674b = str;
        this.f50675c = true;
        requestLayout();
    }
}
