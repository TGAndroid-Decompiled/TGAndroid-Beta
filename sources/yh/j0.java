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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w5;
import v7.v7;
public final class j0 extends Drawable {
    public NinePatchDrawable f50301a;
    public NinePatchDrawable f50302b;
    public final TextPaint f50303c;
    public final ImageReceiver d;
    public final h9 e;
    public final int f50304f;
    public final int f50305g;
    public final float h;
    public final float f50306i;
    public final int f50307j;
    public final int f50308k;
    public boolean f50309l;
    public CharSequence f50310m;
    public StaticLayout f50311n;
    public float f50312o;
    public float f50313p;
    public w5 f50314q;
    public View f50315r;
    public int f50316s;
    public int f50317t;
    public int f50318u;

    public j0() {
        TextPaint textPaint = new TextPaint(1);
        this.f50303c = textPaint;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.d = imageReceiver;
        this.e = new h9((d6) null);
        int dp = AndroidUtilities.dp(10.66f);
        this.f50304f = dp * 2;
        this.f50305g = AndroidUtilities.dp(4.0f);
        this.h = AndroidUtilities.dpf2(15.33f);
        this.f50306i = AndroidUtilities.dpf2(7.33f);
        this.f50307j = AndroidUtilities.dp(8.0f);
        this.f50308k = (int) AndroidUtilities.dpf2(22.66f);
        bs bsVar = bs.f25030f;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        imageReceiver.setRoundRadius(dp);
    }

    public final void a() {
        if (this.f50301a == null) {
            Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.gift_message_bubble_24);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            int i10 = (intrinsicHeight * 4) / 144;
            this.f50301a = v7.a(createBitmap, new Rect((intrinsicWidth * 27) / 168, i10, (intrinsicWidth * 5) / 168, i10), (intrinsicWidth * 94) / 168, (intrinsicHeight * 71) / 144);
        }
        if (this.f50302b == null) {
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
            this.f50302b = v7.a(createBitmap2, new Rect((intrinsicWidth2 * 27) / 168, i11, (intrinsicWidth2 * 5) / 168, i11), (intrinsicWidth2 * 94) / 168, (intrinsicHeight2 * 71) / 144);
        }
    }

    public final void b(int i10) {
        int i11;
        int ceil;
        a();
        if (i10 == this.f50316s && this.f50311n != null) {
            return;
        }
        this.f50316s = i10;
        if (!this.f50309l) {
            i11 = 0;
        } else {
            i11 = this.f50305g + this.f50304f;
        }
        int i12 = this.f50307j;
        int i13 = i11 + i12;
        int i14 = (i10 - i13) - i12;
        int i15 = this.f50308k;
        if (i14 > 0 && !TextUtils.isEmpty(this.f50310m)) {
            CharSequence charSequence = this.f50310m;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f50303c;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i14, alignment, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            float f7 = 0.0f;
            float f10 = 0.0f;
            for (int i16 = 0; i16 < lineCount; i16++) {
                f10 = Math.max(f10, staticLayout.getLineWidth(i16));
            }
            if (lineCount > 1 && (ceil = (int) Math.ceil(f10)) < i14) {
                StaticLayout staticLayout2 = new StaticLayout(this.f50310m, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout2.getLineCount() == lineCount) {
                    for (int i17 = 0; i17 < staticLayout2.getLineCount(); i17++) {
                        f7 = Math.max(f7, staticLayout2.getLineWidth(i17));
                    }
                    f10 = f7;
                    staticLayout = staticLayout2;
                }
            }
            this.f50311n = staticLayout;
            this.f50312o = i13;
            this.f50317t = ((int) Math.ceil(f10)) + i13 + i12;
            float lineBaseline = this.f50311n.getLineBaseline(0);
            StaticLayout staticLayout3 = this.f50311n;
            float f11 = this.h;
            this.f50318u = Math.max(i15, (int) Math.ceil((staticLayout3.getLineBaseline(this.f50311n.getLineCount() - 1) - lineBaseline) + f11 + this.f50306i));
            this.f50313p = f11 - lineBaseline;
            return;
        }
        this.f50311n = null;
        this.f50317t = i15;
        this.f50318u = i15;
    }

    public final void c(TLObject tLObject) {
        boolean z10;
        if (tLObject != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f50309l = z10;
        if (z10) {
            h9 h9Var = this.e;
            h9Var.p(tLObject);
            boolean z11 = tLObject instanceof TLRPC.User;
            ImageReceiver imageReceiver = this.d;
            if (z11) {
                imageReceiver.setImage(ImageLocation.getForUser((TLRPC.User) tLObject, 1), "48_48", h9Var, null, null, 0);
            } else if (tLObject instanceof TLRPC.Chat) {
                imageReceiver.setImage(ImageLocation.getForChat((TLRPC.Chat) tLObject, 1), "48_48", h9Var, null, null, 0);
            } else {
                imageReceiver.setImageBitmap(h9Var);
            }
        }
        this.f50316s = -1;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        a();
        Rect bounds = getBounds();
        canvas.save();
        boolean z10 = this.f50309l;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        NinePatchDrawable ninePatchDrawable = this.f50301a;
        int i12 = bounds.left;
        int i13 = this.f50305g;
        int i14 = this.f50304f;
        if (z10) {
            i10 = i13 + i14;
        } else {
            i10 = 0;
        }
        zf.p.g(ninePatchDrawable, i12 + i10, bounds.top, bounds.right, bounds.bottom);
        this.f50301a.draw(canvas);
        NinePatchDrawable ninePatchDrawable2 = this.f50302b;
        int i15 = bounds.left;
        if (this.f50309l) {
            i11 = i13 + i14;
        } else {
            i11 = 0;
        }
        zf.p.g(ninePatchDrawable2, i15 + i11, bounds.top, bounds.right, bounds.bottom);
        this.f50302b.draw(canvas);
        if (this.f50311n != null) {
            canvas.save();
            canvas.translate(bounds.left + this.f50312o, bounds.top + this.f50313p);
            this.f50311n.draw(canvas);
            View view = this.f50315r;
            if (view != null && (this.f50310m instanceof Spanned)) {
                w5 update = a6.update(0, view, false, this.f50314q, this.f50311n);
                this.f50314q = update;
                a6.drawAnimatedEmojis(canvas, this.f50311n, update, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, null);
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
        return this.f50318u;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f50317t;
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
