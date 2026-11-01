package th;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.rz0;
public final class e6 {
    public static CharSequence[] f48940y;
    public int f48941a;
    public Long f48942b;
    public Integer f48943c;
    public Integer d;
    public boolean e;
    public TLRPC.Document f48945g;
    public SpannableStringBuilder f48948k;
    public String f48949l;
    public boolean f48950m;
    public rz0 f48951n;
    public rz0 f48952o;
    public boolean f48953p;
    public boolean f48954q;
    public View f48955r;
    public Runnable f48956s;
    public int f48960x;
    public boolean f48944f = true;
    public final org.telegram.ui.Components.t5 h = new org.telegram.ui.Components.t5(0, 350, gr.h);
    public final dc f48946i = new dc((View) null);
    public final org.telegram.ui.Cells.y f48947j = org.telegram.ui.ActionBar.t6.a0(553648127, 0, 0);
    public final Paint f48957t = new Paint(1);
    public final Paint f48958u = new Paint(1);
    public final Path v = new Path();
    public final RectF f48959w = new RectF();

    public static CharSequence d() {
        if (f48940y == null) {
            f48940y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f48940y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            dq dqVar = new dq(2131231188, 0);
            dqVar.c(org.telegram.messenger.i0.L(16.0f));
            dqVar.G = 1.0f;
            dqVar.f25568r = -org.telegram.messenger.i0.L(1.0f);
            dqVar.f25569s = org.telegram.messenger.i0.L(1.0f);
            ((SpannableStringBuilder) f48940y[0]).setSpan(dqVar, 0, 1, 33);
        }
        return f48940y[0];
    }

    public final void a(Canvas canvas, float f7) {
        float f10;
        Typeface o10;
        String str = "";
        if (this.f48951n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f48948k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f48945g;
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
            this.f48951n = new rz0(spannableStringBuilder, f10, o10);
        }
        if (this.f48952o == null || this.f48950m) {
            String str2 = this.f48949l;
            if (str2 != null) {
                str = str2;
            }
            this.f48952o = new rz0(str, 14.0f, null);
        }
        float d = this.h.d(this.f48944f);
        Paint paint = this.f48957t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f7, Math.max(this.f48951n.f30126c, this.f48952o.f30126c) + org.telegram.messenger.i0.W1(d, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(18.0f)));
        this.f48960x = min;
        int W1 = org.telegram.messenger.i0.W1(d, org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(22.0f));
        float f11 = min;
        RectF rectF = this.f48959w;
        rectF.set(0.0f, 0.0f, f11, W1);
        canvas.save();
        float a2 = this.f48946i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float W12 = org.telegram.messenger.i0.W1(d, org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(11.0f));
        canvas.drawRoundRect(rectF, W12, W12, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, W12, W12, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = this.f48947j;
        yVar.setBounds(0, 0, min, W1);
        yVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(42.0f));
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(0.0f, 0.0f, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(42.0f));
        Paint paint2 = this.f48958u;
        paint2.setColor(-1);
        float f12 = 1.0f - d;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f), paint2);
        canvas.restore();
        int L = min - org.telegram.messenger.i0.L(20.0f);
        if (f11 < f7) {
            L = (int) Math.min(org.telegram.messenger.i0.L(12.0f) + L, f7 - org.telegram.messenger.i0.L(20.0f));
        }
        rz0 rz0Var = this.f48951n;
        float f13 = L;
        rz0Var.f30136p = f13;
        rz0Var.c(org.telegram.messenger.i0.W1(d, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(7.0f)), org.telegram.messenger.i0.W1(d, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(11.0f)), 1.0f, -1, canvas);
        rz0 rz0Var2 = this.f48952o;
        rz0Var2.f30136p = f13;
        rz0Var2.c(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f7;
        if (this.f48944f) {
            f7 = 22.0f;
        } else {
            f7 = 42.0f;
        }
        return org.telegram.messenger.i0.L(f7);
    }

    public final void c() {
        if (!this.f48953p && !this.f48954q && this.f48942b != null && this.f48943c != null && this.f48955r != null) {
            this.f48954q = true;
            wp.r1(this.f48941a).O1().g0(this.f48943c.intValue(), this.f48942b.longValue(), new ph.h1(this, 17));
        }
    }

    public final void e(float f7, float f10, boolean z10) {
        this.f48946i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.y yVar = this.f48947j;
        yVar.setState(iArr);
        if (z10) {
            yVar.setHotspot(f7, f10);
        }
    }
}
