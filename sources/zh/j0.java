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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xq;
public final class j0 extends Drawable {
    public NinePatchDrawable f60262a;
    public NinePatchDrawable f60263b;
    public final TextPaint f60264c;
    public final ImageReceiver d;
    public final w8 f60265e;
    public final int f60266f;
    public final int f60267g;
    public final float h;
    public final float f60268i;
    public final int f60269j;
    public final int f60270k;
    public boolean f60271l;
    public CharSequence f60272m;
    public StaticLayout f60273n;
    public float f60274o;
    public float f60275p;
    public n5 f60276q;
    public View f60277r;
    public int f60278s;
    public int f60279t;
    public int f60280u;

    public j0() {
        TextPaint textPaint = new TextPaint(1);
        this.f60264c = textPaint;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.d = imageReceiver;
        this.f60265e = new w8((f6) null);
        int L = org.telegram.messenger.g0.L(10.66f);
        this.f60266f = L * 2;
        this.f60267g = org.telegram.messenger.g0.L(4.0f);
        this.h = org.telegram.messenger.g0.N(15.33f);
        this.f60268i = org.telegram.messenger.g0.N(7.33f);
        this.f60269j = org.telegram.messenger.g0.L(8.0f);
        this.f60270k = (int) org.telegram.messenger.g0.N(22.66f);
        xq xqVar = xq.f40310f;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setColor(-1);
        imageReceiver.J0(L);
    }

    public final void a() {
        if (this.f60262a == null) {
            Drawable drawable = org.telegram.messenger.t0.f25555b.getResources().getDrawable(2131231217);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            int i7 = (intrinsicHeight * 4) / 144;
            this.f60262a = c8.n0.a(createBitmap, new Rect((intrinsicWidth * 27) / 168, i7, (intrinsicWidth * 5) / 168, i7), (intrinsicWidth * 94) / 168, (intrinsicHeight * 71) / 144);
        }
        if (this.f60263b == null) {
            Drawable drawable2 = org.telegram.messenger.t0.f25555b.getResources().getDrawable(2131231218);
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
            this.f60263b = c8.n0.a(createBitmap2, new Rect((intrinsicWidth2 * 27) / 168, i10, (intrinsicWidth2 * 5) / 168, i10), (intrinsicWidth2 * 94) / 168, (intrinsicHeight2 * 71) / 144);
        }
    }

    public final void b(int i7) {
        int i10;
        int ceil;
        a();
        if (i7 == this.f60278s && this.f60273n != null) {
            return;
        }
        this.f60278s = i7;
        if (!this.f60271l) {
            i10 = 0;
        } else {
            i10 = this.f60267g + this.f60266f;
        }
        int i11 = this.f60269j;
        int i12 = i10 + i11;
        int i13 = (i7 - i12) - i11;
        int i14 = this.f60270k;
        if (i13 > 0 && !TextUtils.isEmpty(this.f60272m)) {
            CharSequence charSequence = this.f60272m;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f60264c;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i13, alignment, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i15 = 0; i15 < lineCount; i15++) {
                f11 = Math.max(f11, staticLayout.getLineWidth(i15));
            }
            if (lineCount > 1 && (ceil = (int) Math.ceil(f11)) < i13) {
                StaticLayout staticLayout2 = new StaticLayout(this.f60272m, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout2.getLineCount() == lineCount) {
                    for (int i16 = 0; i16 < staticLayout2.getLineCount(); i16++) {
                        f10 = Math.max(f10, staticLayout2.getLineWidth(i16));
                    }
                    f11 = f10;
                    staticLayout = staticLayout2;
                }
            }
            this.f60273n = staticLayout;
            this.f60274o = i12;
            this.f60279t = ((int) Math.ceil(f11)) + i12 + i11;
            float lineBaseline = this.f60273n.getLineBaseline(0);
            StaticLayout staticLayout3 = this.f60273n;
            float f12 = this.h;
            this.f60280u = Math.max(i14, (int) Math.ceil((staticLayout3.getLineBaseline(this.f60273n.getLineCount() - 1) - lineBaseline) + f12 + this.f60268i));
            this.f60275p = f12 - lineBaseline;
            return;
        }
        this.f60273n = null;
        this.f60279t = i14;
        this.f60280u = i14;
    }

    public final void c(TLObject tLObject) {
        boolean z9;
        if (tLObject != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f60271l = z9;
        if (z9) {
            w8 w8Var = this.f60265e;
            w8Var.l(tLObject);
            boolean z10 = tLObject instanceof TLRPC.User;
            ImageReceiver imageReceiver = this.d;
            if (z10) {
                imageReceiver.q0(hc.l(p10.f24459s0, 1, (TLRPC.User) tLObject), "48_48", w8Var, null, null, 0);
            } else if (tLObject instanceof TLRPC.Chat) {
                imageReceiver.q0(hc.a(1, (TLRPC.Chat) tLObject), "48_48", w8Var, null, null, 0);
            } else {
                imageReceiver.w0(w8Var);
            }
        }
        this.f60278s = -1;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        int i7;
        int i10;
        a();
        Rect bounds = getBounds();
        canvas.save();
        boolean z9 = this.f60271l;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        NinePatchDrawable ninePatchDrawable = this.f60262a;
        int i11 = bounds.left;
        int i12 = this.f60267g;
        int i13 = this.f60266f;
        if (z9) {
            i7 = i12 + i13;
        } else {
            i7 = 0;
        }
        bg.s.g(ninePatchDrawable, i11 + i7, bounds.top, bounds.right, bounds.bottom);
        this.f60262a.draw(canvas);
        NinePatchDrawable ninePatchDrawable2 = this.f60263b;
        int i14 = bounds.left;
        if (this.f60271l) {
            i10 = i12 + i13;
        } else {
            i10 = 0;
        }
        bg.s.g(ninePatchDrawable2, i14 + i10, bounds.top, bounds.right, bounds.bottom);
        this.f60263b.draw(canvas);
        if (this.f60273n != null) {
            canvas.save();
            canvas.translate(bounds.left + this.f60274o, bounds.top + this.f60275p);
            this.f60273n.draw(canvas);
            View view = this.f60277r;
            if (view != null && (this.f60272m instanceof Spanned)) {
                n5 update = r5.update(0, view, false, this.f60276q, this.f60273n);
                this.f60276q = update;
                r5.drawAnimatedEmojis(canvas, this.f60273n, update, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, null);
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
        return this.f60280u;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f60279t;
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
