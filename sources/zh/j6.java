package zh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xc;
public final class j6 {
    public static CharSequence[] f48542y;
    public int f48543a;
    public Long f48544b;
    public Integer f48545c;
    public Integer d;
    public boolean e;
    public TLRPC.Document f48547g;
    public SpannableStringBuilder f48550k;
    public String f48551l;
    public boolean f48552m;
    public t01 f48553n;
    public t01 f48554o;
    public boolean f48555p;
    public boolean f48556q;
    public View f48557r;
    public Runnable f48558s;
    public int f48562x;
    public boolean f48546f = true;
    public final org.telegram.ui.Components.d6 h = new org.telegram.ui.Components.d6(0, 350, wr.h);
    public final xc f48548i = new xc((View) null);
    public final org.telegram.ui.Cells.z f48549j = org.telegram.ui.ActionBar.j6.Y(553648127, 0, 0);
    public final Paint f48559t = new Paint(1);
    public final Paint f48560u = new Paint(1);
    public final Path v = new Path();
    public final RectF f48561w = new RectF();

    public static CharSequence d() {
        if (f48542y == null) {
            f48542y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f48542y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            uq uqVar = new uq(R.drawable.filled_widget_music, 0);
            uqVar.setSize(AndroidUtilities.dp(16.0f));
            uqVar.spaceScaleX = 1.0f;
            uqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f48542y[0]).setSpan(uqVar, 0, 1, 33);
        }
        return f48542y[0];
    }

    public final void a(Canvas canvas, float f7) {
        float f10;
        Typeface bold;
        String str = "";
        if (this.f48553n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f48550k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f48547g;
            if (document != null) {
                f10 = 12.0f;
            } else {
                f10 = 14.0f;
            }
            if (document != null) {
                bold = null;
            } else {
                bold = AndroidUtilities.bold();
            }
            this.f48553n = new t01(spannableStringBuilder, f10, bold);
        }
        if (this.f48554o == null || this.f48552m) {
            String str2 = this.f48551l;
            if (str2 != null) {
                str = str2;
            }
            this.f48554o = new t01(str, 14.0f, null);
        }
        float e = this.h.e(this.f48546f);
        Paint paint = this.f48559t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f7, Math.max(this.f48553n.f27247c, this.f48554o.f27247c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e));
        this.f48562x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e);
        float f11 = min;
        RectF rectF = this.f48561w;
        rectF.set(0.0f, 0.0f, f11, lerp);
        canvas.save();
        float a2 = this.f48548i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f48549j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f48560u;
        paint2.setColor(-1);
        float f12 = 1.0f - e;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f11 < f7) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f7 - AndroidUtilities.dp(20.0f));
        }
        t01 t01Var = this.f48553n;
        float f13 = dp;
        t01Var.f27257p = f13;
        t01Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e), 1.0f, -1, canvas);
        t01 t01Var2 = this.f48554o;
        t01Var2.f27257p = f13;
        t01Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f7;
        if (this.f48546f) {
            f7 = 22.0f;
        } else {
            f7 = 42.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c() {
        if (!this.f48555p && !this.f48556q && this.f48544b != null && this.f48545c != null && this.f48557r != null) {
            this.f48556q = true;
            MessagesController.getInstance(this.f48543a).getStoriesController().d0(this.f48544b.longValue(), this.f48545c.intValue(), new bi.i5(this, 11));
        }
    }

    public final void e(float f7, float f10, boolean z10) {
        this.f48548i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f48549j;
        zVar.setState(iArr);
        if (z10) {
            zVar.setHotspot(f7, f10);
        }
    }
}
