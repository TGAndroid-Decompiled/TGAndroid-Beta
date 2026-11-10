package zh;

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.m5;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.wq;
public final class i0 extends Drawable {
    public NinePatchDrawable f60381a;
    public NinePatchDrawable f60382b;
    public final TextPaint f60383c;
    public final ImageReceiver d;
    public final v8 f60384e;
    public final int f60385f;
    public final int f60386g;
    public final float h;
    public final float f60387i;
    public final int f60388j;
    public final int f60389k;
    public boolean f60390l;
    public CharSequence f60391m;
    public StaticLayout f60392n;
    public float f60393o;
    public float f60394p;
    public m5 f60395q;
    public View f60396r;
    public int f60397s;
    public int f60398t;
    public int f60399u;

    public i0() {
        TextPaint textPaint = new TextPaint(1);
        this.f60383c = textPaint;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.d = imageReceiver;
        this.f60384e = new v8((h6) null);
        int L = org.telegram.messenger.g0.L(10.66f);
        this.f60385f = L * 2;
        this.f60386g = org.telegram.messenger.g0.L(4.0f);
        this.h = org.telegram.messenger.g0.N(15.33f);
        this.f60387i = org.telegram.messenger.g0.N(7.33f);
        this.f60388j = org.telegram.messenger.g0.L(8.0f);
        this.f60389k = (int) org.telegram.messenger.g0.N(22.66f);
        wq wqVar = wq.f40046f;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setColor(-1);
        imageReceiver.J0(L);
    }

    public final void a() {
        if (this.f60381a == null) {
            Drawable drawable = org.telegram.messenger.t0.f25570b.getResources().getDrawable(2131231217);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            int i7 = (intrinsicHeight * 4) / 144;
            this.f60381a = c8.n0.a(createBitmap, new Rect((intrinsicWidth * 27) / 168, i7, (intrinsicWidth * 5) / 168, i7), (intrinsicWidth * 94) / 168, (intrinsicHeight * 71) / 144);
        }
        if (this.f60382b == null) {
            Drawable drawable2 = org.telegram.messenger.t0.f25570b.getResources().getDrawable(2131231218);
            int intrinsicWidth2 = drawable2.getIntrinsicWidth();
            int intrinsicHeight2 = drawable2.getIntrinsicHeight();
            Bitmap createBitmap2 = Bitmap.createBitmap(intrinsicWidth2, intrinsicHeight2, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            drawable2.setBounds(0, 0, intrinsicWidth2, intrinsicHeight2);
            drawable2.draw(canvas2);
            Paint paint = new Paint(1);
            float f10 = intrinsicWidth2;
            float f11 = intrinsicHeight2;
            paint.setShader(new LinearGradient(f10, 0.0f, 0.0f, f11, new int[]{1090519039, -805306369, 1090519039}, (float[]) null, Shader.TileMode.CLAMP));
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
            canvas2.drawRect(0.0f, 0.0f, f10, f11, paint);
            int i10 = (intrinsicHeight2 * 4) / 144;
            this.f60382b = c8.n0.a(createBitmap2, new Rect((intrinsicWidth2 * 27) / 168, i10, (intrinsicWidth2 * 5) / 168, i10), (intrinsicWidth2 * 94) / 168, (intrinsicHeight2 * 71) / 144);
        }
    }

    public final void b(int i7) {
        int i10;
        int ceil;
        a();
        if (i7 == this.f60397s && this.f60392n != null) {
            return;
        }
        this.f60397s = i7;
        if (!this.f60390l) {
            i10 = 0;
        } else {
            i10 = this.f60386g + this.f60385f;
        }
        int i11 = this.f60388j;
        int i12 = i10 + i11;
        int i13 = (i7 - i12) - i11;
        int i14 = this.f60389k;
        if (i13 > 0 && !TextUtils.isEmpty(this.f60391m)) {
            CharSequence charSequence = this.f60391m;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f60383c;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i13, alignment, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i15 = 0; i15 < lineCount; i15++) {
                f11 = Math.max(f11, staticLayout.getLineWidth(i15));
            }
            if (lineCount > 1 && (ceil = (int) Math.ceil(f11)) < i13) {
                StaticLayout staticLayout2 = new StaticLayout(this.f60391m, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout2.getLineCount() == lineCount) {
                    for (int i16 = 0; i16 < staticLayout2.getLineCount(); i16++) {
                        f10 = Math.max(f10, staticLayout2.getLineWidth(i16));
                    }
                    f11 = f10;
                    staticLayout = staticLayout2;
                }
            }
            this.f60392n = staticLayout;
            this.f60393o = i12;
            this.f60398t = ((int) Math.ceil(f11)) + i12 + i11;
            float lineBaseline = this.f60392n.getLineBaseline(0);
            StaticLayout staticLayout3 = this.f60392n;
            float f12 = this.h;
            this.f60399u = Math.max(i14, (int) Math.ceil((staticLayout3.getLineBaseline(this.f60392n.getLineCount() - 1) - lineBaseline) + f12 + this.f60387i));
            this.f60394p = f12 - lineBaseline;
            return;
        }
        this.f60392n = null;
        this.f60398t = i14;
        this.f60399u = i14;
    }

    public final void c(TLObject tLObject) {
        boolean z9;
        if (tLObject != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f60390l = z9;
        if (z9) {
            v8 v8Var = this.f60384e;
            v8Var.l(tLObject);
            boolean z10 = tLObject instanceof TLRPC.User;
            ImageReceiver imageReceiver = this.d;
            if (z10) {
                imageReceiver.q0(hc.l(p10.f24474s0, 1, (TLRPC.User) tLObject), "48_48", v8Var, null, null, 0);
            } else if (tLObject instanceof TLRPC.Chat) {
                imageReceiver.q0(hc.a(1, (TLRPC.Chat) tLObject), "48_48", v8Var, null, null, 0);
            } else {
                imageReceiver.w0(v8Var);
            }
        }
        this.f60397s = -1;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        int i7;
        int i10;
        a();
        Rect bounds = getBounds();
        canvas.save();
        boolean z9 = this.f60390l;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        NinePatchDrawable ninePatchDrawable = this.f60381a;
        int i11 = bounds.left;
        int i12 = this.f60386g;
        int i13 = this.f60385f;
        if (z9) {
            i7 = i12 + i13;
        } else {
            i7 = 0;
        }
        bg.s.g(ninePatchDrawable, i11 + i7, bounds.top, bounds.right, bounds.bottom);
        this.f60381a.draw(canvas);
        NinePatchDrawable ninePatchDrawable2 = this.f60382b;
        int i14 = bounds.left;
        if (this.f60390l) {
            i10 = i12 + i13;
        } else {
            i10 = 0;
        }
        bg.s.g(ninePatchDrawable2, i14 + i10, bounds.top, bounds.right, bounds.bottom);
        this.f60382b.draw(canvas);
        if (this.f60392n != null) {
            canvas.save();
            canvas.translate(bounds.left + this.f60393o, bounds.top + this.f60394p);
            this.f60392n.draw(canvas);
            View view = this.f60396r;
            if (view != null && (this.f60391m instanceof Spanned)) {
                m5 update = q5.update(0, view, false, this.f60395q, this.f60392n);
                this.f60395q = update;
                q5.drawAnimatedEmojis(canvas, this.f60392n, update, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, null);
            }
            canvas.restore();
        }
        if (f10 > 0.0f) {
            int i15 = bounds.left;
            ImageReceiver imageReceiver = this.d;
            imageReceiver.y0(i15, bounds.bottom - i13, i13, i13);
            canvas.save();
            canvas.scale(f10, f10, imageReceiver.r(), imageReceiver.s());
            imageReceiver.h(canvas, null);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f60399u;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f60398t;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
