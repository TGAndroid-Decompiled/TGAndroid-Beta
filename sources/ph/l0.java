package ph;

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
import org.telegram.messenger.e20;
import org.telegram.messenger.jc;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.r8;
import w7.k9;
public final class l0 extends Drawable {
    public NinePatchDrawable f45186a;
    public NinePatchDrawable f45187b;
    public final TextPaint f45188c;
    public final ImageReceiver d;
    public final r8 e;
    public final int f45189f;
    public final int f45190g;
    public final float h;
    public final float f45191i;
    public final int f45192j;
    public final int f45193k;
    public boolean f45194l;
    public CharSequence f45195m;
    public StaticLayout f45196n;
    public float f45197o;
    public float f45198p;
    public k5 f45199q;
    public View f45200r;
    public int f45201s;
    public int f45202t;
    public int f45203u;

    public l0() {
        TextPaint textPaint = new TextPaint(1);
        this.f45188c = textPaint;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.d = imageReceiver;
        this.e = new r8((p6) null);
        int L = org.telegram.messenger.i0.L(10.66f);
        this.f45189f = L * 2;
        this.f45190g = org.telegram.messenger.i0.L(4.0f);
        this.h = org.telegram.messenger.i0.N(15.33f);
        this.f45191i = org.telegram.messenger.i0.N(7.33f);
        this.f45192j = org.telegram.messenger.i0.L(8.0f);
        this.f45193k = (int) org.telegram.messenger.i0.N(22.66f);
        gr grVar = gr.f26523f;
        textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint.setColor(-1);
        imageReceiver.J0(L);
    }

    public final void a() {
        if (this.f45186a == null) {
            Drawable drawable = org.telegram.messenger.w0.f18945b.getResources().getDrawable(2131231218);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            int i10 = (intrinsicHeight * 4) / 144;
            this.f45186a = k9.a(createBitmap, new Rect((intrinsicWidth * 27) / 168, i10, (intrinsicWidth * 5) / 168, i10), (intrinsicWidth * 94) / 168, (intrinsicHeight * 71) / 144);
        }
        if (this.f45187b == null) {
            Drawable drawable2 = org.telegram.messenger.w0.f18945b.getResources().getDrawable(2131231219);
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
            this.f45187b = k9.a(createBitmap2, new Rect((intrinsicWidth2 * 27) / 168, i11, (intrinsicWidth2 * 5) / 168, i11), (intrinsicWidth2 * 94) / 168, (intrinsicHeight2 * 71) / 144);
        }
    }

    public final void b(int i10) {
        int i11;
        int ceil;
        a();
        if (i10 == this.f45201s && this.f45196n != null) {
            return;
        }
        this.f45201s = i10;
        if (!this.f45194l) {
            i11 = 0;
        } else {
            i11 = this.f45190g + this.f45189f;
        }
        int i12 = this.f45192j;
        int i13 = i11 + i12;
        int i14 = (i10 - i13) - i12;
        int i15 = this.f45193k;
        if (i14 > 0 && !TextUtils.isEmpty(this.f45195m)) {
            CharSequence charSequence = this.f45195m;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f45188c;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i14, alignment, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            float f7 = 0.0f;
            float f10 = 0.0f;
            for (int i16 = 0; i16 < lineCount; i16++) {
                f10 = Math.max(f10, staticLayout.getLineWidth(i16));
            }
            if (lineCount > 1 && (ceil = (int) Math.ceil(f10)) < i14) {
                StaticLayout staticLayout2 = new StaticLayout(this.f45195m, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout2.getLineCount() == lineCount) {
                    for (int i17 = 0; i17 < staticLayout2.getLineCount(); i17++) {
                        f7 = Math.max(f7, staticLayout2.getLineWidth(i17));
                    }
                    f10 = f7;
                    staticLayout = staticLayout2;
                }
            }
            this.f45196n = staticLayout;
            this.f45197o = i13;
            this.f45202t = ((int) Math.ceil(f10)) + i13 + i12;
            float lineBaseline = this.f45196n.getLineBaseline(0);
            StaticLayout staticLayout3 = this.f45196n;
            float f11 = this.h;
            this.f45203u = Math.max(i15, (int) Math.ceil((staticLayout3.getLineBaseline(this.f45196n.getLineCount() - 1) - lineBaseline) + f11 + this.f45191i));
            this.f45198p = f11 - lineBaseline;
            return;
        }
        this.f45196n = null;
        this.f45202t = i15;
        this.f45203u = i15;
    }

    public final void c(TLObject tLObject) {
        boolean z10;
        if (tLObject != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45194l = z10;
        if (z10) {
            r8 r8Var = this.e;
            r8Var.l(tLObject);
            boolean z11 = tLObject instanceof TLRPC.User;
            ImageReceiver imageReceiver = this.d;
            if (z11) {
                imageReceiver.q0(jc.l(e20.f15506s0, 1, (TLRPC.User) tLObject), "48_48", r8Var, null, null, 0);
            } else if (tLObject instanceof TLRPC.Chat) {
                imageReceiver.q0(jc.a(1, (TLRPC.Chat) tLObject), "48_48", r8Var, null, null, 0);
            } else {
                imageReceiver.w0(r8Var);
            }
        }
        this.f45201s = -1;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        a();
        Rect bounds = getBounds();
        canvas.save();
        boolean z10 = this.f45194l;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        NinePatchDrawable ninePatchDrawable = this.f45186a;
        int i12 = bounds.left;
        int i13 = this.f45190g;
        int i14 = this.f45189f;
        if (z10) {
            i10 = i13 + i14;
        } else {
            i10 = 0;
        }
        rf.o.g(ninePatchDrawable, i12 + i10, bounds.top, bounds.right, bounds.bottom);
        this.f45186a.draw(canvas);
        NinePatchDrawable ninePatchDrawable2 = this.f45187b;
        int i15 = bounds.left;
        if (this.f45194l) {
            i11 = i13 + i14;
        } else {
            i11 = 0;
        }
        rf.o.g(ninePatchDrawable2, i15 + i11, bounds.top, bounds.right, bounds.bottom);
        this.f45187b.draw(canvas);
        if (this.f45196n != null) {
            canvas.save();
            canvas.translate(bounds.left + this.f45197o, bounds.top + this.f45198p);
            this.f45196n.draw(canvas);
            View view = this.f45200r;
            if (view != null && (this.f45195m instanceof Spanned)) {
                k5 update = o5.update(0, view, false, this.f45199q, this.f45196n);
                this.f45199q = update;
                o5.drawAnimatedEmojis(canvas, this.f45196n, update, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, null);
            }
            canvas.restore();
        }
        if (f7 > 0.0f) {
            int i16 = bounds.left;
            ImageReceiver imageReceiver = this.d;
            imageReceiver.y0(i16, bounds.bottom - i14, i14, i14);
            canvas.save();
            canvas.scale(f7, f7, imageReceiver.r(), imageReceiver.s());
            imageReceiver.h(canvas, null);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f45203u;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f45202t;
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
