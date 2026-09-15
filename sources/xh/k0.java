package xh;

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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.x5;
import v7.u7;
public final class k0 extends Drawable {
    public NinePatchDrawable f45948a;
    public NinePatchDrawable f45949b;
    public final TextPaint f45950c;
    public final ImageReceiver d;
    public final f9 e;
    public final int f45951f;
    public final int f45952g;
    public final float h;
    public final float f45953i;
    public final int f45954j;
    public final int f45955k;
    public boolean f45956l;
    public CharSequence f45957m;
    public StaticLayout f45958n;
    public float f45959o;
    public float f45960p;
    public t5 f45961q;
    public View f45962r;
    public int f45963s;
    public int f45964t;
    public int f45965u;

    public k0() {
        TextPaint textPaint = new TextPaint(1);
        this.f45950c = textPaint;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.d = imageReceiver;
        this.e = new f9((e6) null);
        int dp = AndroidUtilities.dp(10.66f);
        this.f45951f = dp * 2;
        this.f45952g = AndroidUtilities.dp(4.0f);
        this.h = AndroidUtilities.dpf2(15.33f);
        this.f45953i = AndroidUtilities.dpf2(7.33f);
        this.f45954j = AndroidUtilities.dp(8.0f);
        this.f45955k = (int) AndroidUtilities.dpf2(22.66f);
        qr qrVar = qr.f27423f;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        imageReceiver.setRoundRadius(dp);
    }

    public final void a() {
        if (this.f45948a == null) {
            Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.gift_message_bubble_24);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            int i10 = (intrinsicHeight * 4) / 144;
            this.f45948a = u7.a(createBitmap, new Rect((intrinsicWidth * 27) / 168, i10, (intrinsicWidth * 5) / 168, i10), (intrinsicWidth * 94) / 168, (intrinsicHeight * 71) / 144);
        }
        if (this.f45949b == null) {
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
            this.f45949b = u7.a(createBitmap2, new Rect((intrinsicWidth2 * 27) / 168, i11, (intrinsicWidth2 * 5) / 168, i11), (intrinsicWidth2 * 94) / 168, (intrinsicHeight2 * 71) / 144);
        }
    }

    public final void b(int i10) {
        int i11;
        int ceil;
        a();
        if (i10 == this.f45963s && this.f45958n != null) {
            return;
        }
        this.f45963s = i10;
        if (!this.f45956l) {
            i11 = 0;
        } else {
            i11 = this.f45952g + this.f45951f;
        }
        int i12 = this.f45954j;
        int i13 = i11 + i12;
        int i14 = (i10 - i13) - i12;
        int i15 = this.f45955k;
        if (i14 > 0 && !TextUtils.isEmpty(this.f45957m)) {
            CharSequence charSequence = this.f45957m;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f45950c;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i14, alignment, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            float f7 = 0.0f;
            float f10 = 0.0f;
            for (int i16 = 0; i16 < lineCount; i16++) {
                f10 = Math.max(f10, staticLayout.getLineWidth(i16));
            }
            if (lineCount > 1 && (ceil = (int) Math.ceil(f10)) < i14) {
                StaticLayout staticLayout2 = new StaticLayout(this.f45957m, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout2.getLineCount() == lineCount) {
                    for (int i17 = 0; i17 < staticLayout2.getLineCount(); i17++) {
                        f7 = Math.max(f7, staticLayout2.getLineWidth(i17));
                    }
                    f10 = f7;
                    staticLayout = staticLayout2;
                }
            }
            this.f45958n = staticLayout;
            this.f45959o = i13;
            this.f45964t = ((int) Math.ceil(f10)) + i13 + i12;
            float lineBaseline = this.f45958n.getLineBaseline(0);
            StaticLayout staticLayout3 = this.f45958n;
            float f11 = this.h;
            this.f45965u = Math.max(i15, (int) Math.ceil((staticLayout3.getLineBaseline(this.f45958n.getLineCount() - 1) - lineBaseline) + f11 + this.f45953i));
            this.f45960p = f11 - lineBaseline;
            return;
        }
        this.f45958n = null;
        this.f45964t = i15;
        this.f45965u = i15;
    }

    public final void c(TLObject tLObject) {
        boolean z10;
        if (tLObject != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45956l = z10;
        if (z10) {
            f9 f9Var = this.e;
            f9Var.p(tLObject);
            boolean z11 = tLObject instanceof TLRPC.User;
            ImageReceiver imageReceiver = this.d;
            if (z11) {
                imageReceiver.setImage(ImageLocation.getForUser((TLRPC.User) tLObject, 1), "48_48", f9Var, null, null, 0);
            } else if (tLObject instanceof TLRPC.Chat) {
                imageReceiver.setImage(ImageLocation.getForChat((TLRPC.Chat) tLObject, 1), "48_48", f9Var, null, null, 0);
            } else {
                imageReceiver.setImageBitmap(f9Var);
            }
        }
        this.f45963s = -1;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        a();
        Rect bounds = getBounds();
        canvas.save();
        boolean z10 = this.f45956l;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        NinePatchDrawable ninePatchDrawable = this.f45948a;
        int i12 = bounds.left;
        int i13 = this.f45952g;
        int i14 = this.f45951f;
        if (z10) {
            i10 = i13 + i14;
        } else {
            i10 = 0;
        }
        yf.p.g(ninePatchDrawable, i12 + i10, bounds.top, bounds.right, bounds.bottom);
        this.f45948a.draw(canvas);
        NinePatchDrawable ninePatchDrawable2 = this.f45949b;
        int i15 = bounds.left;
        if (this.f45956l) {
            i11 = i13 + i14;
        } else {
            i11 = 0;
        }
        yf.p.g(ninePatchDrawable2, i15 + i11, bounds.top, bounds.right, bounds.bottom);
        this.f45949b.draw(canvas);
        if (this.f45958n != null) {
            canvas.save();
            canvas.translate(bounds.left + this.f45959o, bounds.top + this.f45960p);
            this.f45958n.draw(canvas);
            View view = this.f45962r;
            if (view != null && (this.f45957m instanceof Spanned)) {
                t5 update = x5.update(0, view, false, this.f45961q, this.f45958n);
                this.f45961q = update;
                x5.drawAnimatedEmojis(canvas, this.f45958n, update, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, null);
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
        return this.f45965u;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f45964t;
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
