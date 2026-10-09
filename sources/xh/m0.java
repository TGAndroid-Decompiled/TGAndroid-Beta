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
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.x5;
import v7.r7;
public final class m0 extends Drawable {
    public NinePatchDrawable f51349a;
    public NinePatchDrawable f51350b;
    public final TextPaint f51351c;
    public final ImageReceiver d;
    public final j9 f51352e;
    public final int f51353f;
    public final int f51354g;
    public final float h;
    public final float f51355i;
    public final int f51356j;
    public final int f51357k;
    public boolean f51358l;
    public CharSequence f51359m;
    public StaticLayout f51360n;
    public float f51361o;
    public float f51362p;
    public x5 f51363q;
    public View f51364r;
    public int f51365s;
    public int f51366t;
    public int f51367u;

    public m0() {
        TextPaint textPaint = new TextPaint(1);
        this.f51351c = textPaint;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.d = imageReceiver;
        this.f51352e = new j9((e6) null);
        int dp = AndroidUtilities.dp(10.66f);
        this.f51353f = dp * 2;
        this.f51354g = AndroidUtilities.dp(4.0f);
        this.h = AndroidUtilities.dpf2(15.33f);
        this.f51355i = AndroidUtilities.dpf2(7.33f);
        this.f51356j = AndroidUtilities.dp(8.0f);
        this.f51357k = (int) AndroidUtilities.dpf2(22.66f);
        hs hsVar = hs.f27118f;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        imageReceiver.setRoundRadius(dp);
    }

    public final void a() {
        if (this.f51349a == null) {
            Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.gift_message_bubble_24);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            int i10 = (intrinsicHeight * 4) / 144;
            this.f51349a = r7.a(createBitmap, new Rect((intrinsicWidth * 27) / 168, i10, (intrinsicWidth * 5) / 168, i10), (intrinsicWidth * 94) / 168, (intrinsicHeight * 71) / 144);
        }
        if (this.f51350b == null) {
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
            this.f51350b = r7.a(createBitmap2, new Rect((intrinsicWidth2 * 27) / 168, i11, (intrinsicWidth2 * 5) / 168, i11), (intrinsicWidth2 * 94) / 168, (intrinsicHeight2 * 71) / 144);
        }
    }

    public final void b(int i10) {
        int i11;
        int ceil;
        a();
        if (i10 == this.f51365s && this.f51360n != null) {
            return;
        }
        this.f51365s = i10;
        if (!this.f51358l) {
            i11 = 0;
        } else {
            i11 = this.f51354g + this.f51353f;
        }
        int i12 = this.f51356j;
        int i13 = i11 + i12;
        int i14 = (i10 - i13) - i12;
        int i15 = this.f51357k;
        if (i14 > 0 && !TextUtils.isEmpty(this.f51359m)) {
            CharSequence charSequence = this.f51359m;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f51351c;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i14, alignment, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            float f7 = 0.0f;
            float f10 = 0.0f;
            for (int i16 = 0; i16 < lineCount; i16++) {
                f10 = Math.max(f10, staticLayout.getLineWidth(i16));
            }
            if (lineCount > 1 && (ceil = (int) Math.ceil(f10)) < i14) {
                StaticLayout staticLayout2 = new StaticLayout(this.f51359m, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout2.getLineCount() == lineCount) {
                    for (int i17 = 0; i17 < staticLayout2.getLineCount(); i17++) {
                        f7 = Math.max(f7, staticLayout2.getLineWidth(i17));
                    }
                    f10 = f7;
                    staticLayout = staticLayout2;
                }
            }
            this.f51360n = staticLayout;
            this.f51361o = i13;
            this.f51366t = ((int) Math.ceil(f10)) + i13 + i12;
            float lineBaseline = this.f51360n.getLineBaseline(0);
            StaticLayout staticLayout3 = this.f51360n;
            float f11 = this.h;
            this.f51367u = Math.max(i15, (int) Math.ceil((staticLayout3.getLineBaseline(this.f51360n.getLineCount() - 1) - lineBaseline) + f11 + this.f51355i));
            this.f51362p = f11 - lineBaseline;
            return;
        }
        this.f51360n = null;
        this.f51366t = i15;
        this.f51367u = i15;
    }

    public final void c(TLObject tLObject) {
        boolean z10;
        if (tLObject != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f51358l = z10;
        if (z10) {
            j9 j9Var = this.f51352e;
            j9Var.p(tLObject);
            boolean z11 = tLObject instanceof TLRPC.User;
            ImageReceiver imageReceiver = this.d;
            if (z11) {
                imageReceiver.setImage(ImageLocation.getForUser((TLRPC.User) tLObject, 1), "48_48", j9Var, null, null, 0);
            } else if (tLObject instanceof TLRPC.Chat) {
                imageReceiver.setImage(ImageLocation.getForChat((TLRPC.Chat) tLObject, 1), "48_48", j9Var, null, null, 0);
            } else {
                imageReceiver.setImageBitmap(j9Var);
            }
        }
        this.f51365s = -1;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        a();
        Rect bounds = getBounds();
        canvas.save();
        boolean z10 = this.f51358l;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        NinePatchDrawable ninePatchDrawable = this.f51349a;
        int i12 = bounds.left;
        int i13 = this.f51354g;
        int i14 = this.f51353f;
        if (z10) {
            i10 = i13 + i14;
        } else {
            i10 = 0;
        }
        yf.p.g(ninePatchDrawable, i12 + i10, bounds.top, bounds.right, bounds.bottom);
        this.f51349a.draw(canvas);
        NinePatchDrawable ninePatchDrawable2 = this.f51350b;
        int i15 = bounds.left;
        if (this.f51358l) {
            i11 = i13 + i14;
        } else {
            i11 = 0;
        }
        yf.p.g(ninePatchDrawable2, i15 + i11, bounds.top, bounds.right, bounds.bottom);
        this.f51350b.draw(canvas);
        if (this.f51360n != null) {
            canvas.save();
            canvas.translate(bounds.left + this.f51361o, bounds.top + this.f51362p);
            this.f51360n.draw(canvas);
            View view = this.f51364r;
            if (view != null && (this.f51359m instanceof Spanned)) {
                x5 update = b6.update(0, view, false, this.f51363q, this.f51360n);
                this.f51363q = update;
                b6.drawAnimatedEmojis(canvas, this.f51360n, update, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, null);
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
        return this.f51367u;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f51366t;
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
