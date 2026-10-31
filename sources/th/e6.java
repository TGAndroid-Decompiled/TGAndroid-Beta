package th;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
public final class e6 {
    public static CharSequence[] f48926y;
    public int f48927a;
    public Long f48928b;
    public Integer f48929c;
    public Integer d;
    public boolean e;
    public TLRPC.Document f48931g;
    public SpannableStringBuilder f48934k;
    public String f48935l;
    public boolean f48936m;
    public qz0 f48937n;
    public qz0 f48938o;
    public boolean f48939p;
    public boolean f48940q;
    public View f48941r;
    public Runnable f48942s;
    public int f48946x;
    public boolean f48930f = true;
    public final org.telegram.ui.Components.t5 h = new org.telegram.ui.Components.t5(0, 350, gr.h);
    public final dc f48932i = new dc((View) null);
    public final org.telegram.ui.Cells.y f48933j = org.telegram.ui.ActionBar.t6.a0(553648127, 0, 0);
    public final Paint f48943t = new Paint(1);
    public final Paint f48944u = new Paint(1);
    public final Path v = new Path();
    public final RectF f48945w = new RectF();

    public static CharSequence d() {
        if (f48926y == null) {
            f48926y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f48926y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            dq dqVar = new dq(2131231188, 0);
            dqVar.c(org.telegram.messenger.i0.L(16.0f));
            dqVar.G = 1.0f;
            dqVar.f25508r = -org.telegram.messenger.i0.L(1.0f);
            dqVar.f25509s = org.telegram.messenger.i0.L(1.0f);
            ((SpannableStringBuilder) f48926y[0]).setSpan(dqVar, 0, 1, 33);
        }
        return f48926y[0];
    }

    public final void a(Canvas canvas, float f7) {
        float f10;
        Typeface o10;
        String str = "";
        if (this.f48937n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f48934k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f48931g;
            if (document != null) {
                f10 = 12.0f;
            } else {
                f10 = 14.0f;
            }
            if (document != null) {
                o10 = null;
            } else {
                o10 = org.telegram.messenger.i0.o();
            }
            this.f48937n = new qz0(spannableStringBuilder, f10, o10);
        }
        if (this.f48938o == null || this.f48936m) {
            String str2 = this.f48935l;
            if (str2 != null) {
                str = str2;
            }
            this.f48938o = new qz0(str, 14.0f, null);
        }
        float d = this.h.d(this.f48930f);
        Paint paint = this.f48943t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f7, Math.max(this.f48937n.f29774c, this.f48938o.f29774c) + org.telegram.messenger.i0.W1(d, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(18.0f)));
        this.f48946x = min;
        int W1 = org.telegram.messenger.i0.W1(d, org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(22.0f));
        float f11 = min;
        RectF rectF = this.f48945w;
        rectF.set(0.0f, 0.0f, f11, W1);
        canvas.save();
        float a2 = this.f48932i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float W12 = org.telegram.messenger.i0.W1(d, org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(11.0f));
        canvas.drawRoundRect(rectF, W12, W12, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, W12, W12, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = this.f48933j;
        yVar.setBounds(0, 0, min, W1);
        yVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(42.0f));
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(0.0f, 0.0f, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(42.0f));
        Paint paint2 = this.f48944u;
        paint2.setColor(-1);
        float f12 = 1.0f - d;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f), paint2);
        canvas.restore();
        int L = min - org.telegram.messenger.i0.L(20.0f);
        if (f11 < f7) {
            L = (int) Math.min(org.telegram.messenger.i0.L(12.0f) + L, f7 - org.telegram.messenger.i0.L(20.0f));
        }
        qz0 qz0Var = this.f48937n;
        float f13 = L;
        qz0Var.f29784p = f13;
        qz0Var.c(org.telegram.messenger.i0.W1(d, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(7.0f)), org.telegram.messenger.i0.W1(d, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(11.0f)), 1.0f, -1, canvas);
        qz0 qz0Var2 = this.f48938o;
        qz0Var2.f29784p = f13;
        qz0Var2.c(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f7;
        if (this.f48930f) {
            f7 = 22.0f;
        } else {
            f7 = 42.0f;
        }
        return org.telegram.messenger.i0.L(f7);
    }

    public final void c() {
        if (!this.f48939p && !this.f48940q && this.f48928b != null && this.f48929c != null && this.f48941r != null) {
            this.f48940q = true;
            vp.r1(this.f48927a).O1().g0(this.f48929c.intValue(), this.f48928b.longValue(), new ph.h1(this, 17));
        }
    }

    public final void e(float f7, float f10, boolean z10) {
        this.f48932i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.y yVar = this.f48933j;
        yVar.setState(iArr);
        if (z10) {
            yVar.setHotspot(f7, f10);
        }
    }
}
