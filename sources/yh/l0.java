package yh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.x5;
import v7.v7;
public final class l0 extends Drawable {
    public NinePatchDrawable f48953a;
    public NinePatchDrawable f48954b;
    public final TextPaint f48955c;
    public final ImageReceiver d;
    public final k9 e;
    public final int f48956f;
    public final int f48957g;
    public final float h;
    public final float f48958i;
    public final int f48959j;
    public final int f48960k;
    public boolean f48961l;
    public CharSequence f48962m;
    public StaticLayout f48963n;
    public float f48964o;
    public float f48965p;
    public x5 f48966q;
    public View f48967r;
    public int f48968s;
    public int f48969t;
    public int f48970u;

    public l0() {
        TextPaint textPaint = new TextPaint(1);
        this.f48955c = textPaint;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.d = imageReceiver;
        this.e = new k9((c6) null);
        int dp = AndroidUtilities.dp(10.66f);
        this.f48956f = dp * 2;
        this.f48957g = AndroidUtilities.dp(4.0f);
        this.h = AndroidUtilities.dpf2(15.33f);
        this.f48958i = AndroidUtilities.dpf2(7.33f);
        this.f48959j = AndroidUtilities.dp(8.0f);
        this.f48960k = (int) AndroidUtilities.dpf2(22.66f);
        es esVar = es.f24465f;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        imageReceiver.setRoundRadius(dp);
    }

    public final void a() {
        if (this.f48953a == null) {
            Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.gift_message_bubble_24);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            int i10 = (intrinsicHeight * 4) / 144;
            this.f48953a = v7.a(createBitmap, new Rect((intrinsicWidth * 27) / 168, i10, (intrinsicWidth * 5) / 168, i10), (intrinsicWidth * 94) / 168, (intrinsicHeight * 71) / 144);
        }
        if (this.f48954b == null) {
            Drawable drawable2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.gift_message_bubble_border_24);
            int intrinsicWidth2 = drawable2.getIntrinsicWidth();
            int intrinsicHeight2 = drawable2.getIntrinsicHeight();
            Bitmap createBitmap2 = Bitmap.createBitmap(intrinsicWidth2, intrinsicHeight2, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            drawable2.setBounds(0, 0, intrinsicWidth2, intrinsicHeight2);
            drawable2.draw(canvas2);
            Paint paint = new Paint(1);
            float f7 = intrinsicWidth2;
            float f10 = intrinsicHeight2;
            paint.setShader(new LinearGradient(f7, 0.0f, 0.0f, f10, new int[]{1090519039, -805306369, 1090519039}, (float[]) null, Shader.TileMode.CLAMP));
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
            canvas2.drawRect(0.0f, 0.0f, f7, f10, paint);
            int i11 = (intrinsicHeight2 * 4) / 144;
            this.f48954b = v7.a(createBitmap2, new Rect((intrinsicWidth2 * 27) / 168, i11, (intrinsicWidth2 * 5) / 168, i11), (intrinsicWidth2 * 94) / 168, (intrinsicHeight2 * 71) / 144);
        }
    }

    public final void b(int i10) {
        int i11;
        int ceil;
        a();
        if (i10 == this.f48968s && this.f48963n != null) {
            return;
        }
        this.f48968s = i10;
        if (!this.f48961l) {
            i11 = 0;
        } else {
            i11 = this.f48957g + this.f48956f;
        }
        int i12 = this.f48959j;
        int i13 = i11 + i12;
        int i14 = (i10 - i13) - i12;
        int i15 = this.f48960k;
        if (i14 > 0 && !TextUtils.isEmpty(this.f48962m)) {
            CharSequence charSequence = this.f48962m;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f48955c;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i14, alignment, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            float f7 = 0.0f;
            float f10 = 0.0f;
            for (int i16 = 0; i16 < lineCount; i16++) {
                f10 = Math.max(f10, staticLayout.getLineWidth(i16));
            }
            if (lineCount > 1 && (ceil = (int) Math.ceil(f10)) < i14) {
                StaticLayout staticLayout2 = new StaticLayout(this.f48962m, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout2.getLineCount() == lineCount) {
                    for (int i17 = 0; i17 < staticLayout2.getLineCount(); i17++) {
                        f7 = Math.max(f7, staticLayout2.getLineWidth(i17));
                    }
                    f10 = f7;
                    staticLayout = staticLayout2;
                }
            }
            this.f48963n = staticLayout;
            this.f48964o = i13;
            this.f48969t = ((int) Math.ceil(f10)) + i13 + i12;
            float lineBaseline = this.f48963n.getLineBaseline(0);
            StaticLayout staticLayout3 = this.f48963n;
            float f11 = this.h;
            this.f48970u = Math.max(i15, (int) Math.ceil((staticLayout3.getLineBaseline(this.f48963n.getLineCount() - 1) - lineBaseline) + f11 + this.f48958i));
            this.f48965p = f11 - lineBaseline;
            return;
        }
        this.f48963n = null;
        this.f48969t = i15;
        this.f48970u = i15;
    }

    public final void c(TLObject tLObject) {
        boolean z10;
        if (tLObject != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48961l = z10;
        if (z10) {
            k9 k9Var = this.e;
            k9Var.p(tLObject);
            boolean z11 = tLObject instanceof TLRPC.User;
            ImageReceiver imageReceiver = this.d;
            if (z11) {
                imageReceiver.setImage(ImageLocation.getForUser((TLRPC.User) tLObject, 1), "48_48", k9Var, null, null, 0);
            } else if (tLObject instanceof TLRPC.Chat) {
                imageReceiver.setImage(ImageLocation.getForChat((TLRPC.Chat) tLObject, 1), "48_48", k9Var, null, null, 0);
            } else {
                imageReceiver.setImageBitmap(k9Var);
            }
        }
        this.f48968s = -1;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        a();
        Rect bounds = getBounds();
        canvas.save();
        boolean z10 = this.f48961l;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        NinePatchDrawable ninePatchDrawable = this.f48953a;
        int i12 = bounds.left;
        int i13 = this.f48957g;
        int i14 = this.f48956f;
        if (z10) {
            i10 = i13 + i14;
        } else {
            i10 = 0;
        }
        zf.q.g(ninePatchDrawable, i12 + i10, bounds.top, bounds.right, bounds.bottom);
        this.f48953a.draw(canvas);
        NinePatchDrawable ninePatchDrawable2 = this.f48954b;
        int i15 = bounds.left;
        if (this.f48961l) {
            i11 = i13 + i14;
        } else {
            i11 = 0;
        }
        zf.q.g(ninePatchDrawable2, i15 + i11, bounds.top, bounds.right, bounds.bottom);
        this.f48954b.draw(canvas);
        if (this.f48963n != null) {
            canvas.save();
            canvas.translate(bounds.left + this.f48964o, bounds.top + this.f48965p);
            this.f48963n.draw(canvas);
            View view = this.f48967r;
            if (view != null && (this.f48962m instanceof Spanned)) {
                x5 update = b6.update(0, view, false, this.f48966q, this.f48963n);
                this.f48966q = update;
                b6.drawAnimatedEmojis(canvas, this.f48963n, update, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, null);
            }
            canvas.restore();
        }
        if (f7 > 0.0f) {
            int i16 = bounds.left;
            ImageReceiver imageReceiver = this.d;
            imageReceiver.setImageCoords(i16, bounds.bottom - i14, i14, i14);
            canvas.save();
            canvas.scale(f7, f7, imageReceiver.getCenterX(), imageReceiver.getCenterY());
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f48970u;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f48969t;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
