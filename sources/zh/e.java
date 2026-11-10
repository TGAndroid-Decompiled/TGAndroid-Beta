package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.dd;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.s9;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.wp;
public final class e extends FrameLayout implements c6 {
    public final fi.d f60308a;
    public final i6 f60309b;
    public final i6 f60310c;
    public final s9 d;
    public final Paint f60311e;
    public final bg.q f60312f;
    public final wp h;
    public final wp[] f60313n;

    public e(Context context, s9 s9Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f60311e = paint;
        this.f60312f = new bg.q(new u5.e(this, 12));
        this.h = new wp(2131231117, 0);
        this.f60313n = new wp[1];
        this.d = s9Var;
        setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f));
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, 0.0f, 536870912);
        paint.setColor(m6.x0(null, m6.f27890d6, false));
        fi.d dVar = new fi.d(context, null, true);
        this.f60308a = dVar;
        h6 h6Var = dVar.d;
        h6Var.D = false;
        h6Var.E = true;
        h6Var.F = true;
        h6Var.G = true;
        h6Var.H = false;
        ?? imageView = new ImageView(context);
        i6 i6Var = new i6(context, false, false, false);
        this.f60309b = i6Var;
        i6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        t6.Y(i6Var, m6.G6, null);
        i6 i6Var2 = new i6(context, false, false, false);
        this.f60310c = i6Var2;
        i6Var2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        TLRPC.Document document = s9Var.d.sticker;
        if (document != null) {
            imageView.g(44, 44, document);
        }
        addView(i6Var, ha.d(-1, 18.0f, 51, 64.0f, 15.0f, 15.0f, 0.0f));
        addView(i6Var2, ha.d(-1, 17.0f, 51, 64.0f, 34.0f, 15.0f, 0.0f));
        addView((View) imageView, ha.d(44, 44.0f, 51, 14.0f, 11.0f, 0.0f, 0.0f));
        addView(dVar, ha.d(-1, 44.0f, 80, 15.0f, 0.0f, 15.0f, 15.0f));
        b(false);
    }

    public final void a(long j3, boolean z9) {
        String h02 = org.telegram.messenger.g0.h0((int) j3, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(this.h, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) id.M0(2131750415, null));
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) h02);
        this.f60308a.i(spannableStringBuilder, z9, true);
    }

    public final void b(boolean z9) {
        s9 s9Var = this.d;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = s9Var.f25442f;
        if (tL_starGiftAuctionState != null) {
            this.f60309b.c(id.a0(null, null, 2131750414, id.E(tL_starGiftAuctionState.current_round, ','), id.E(s9Var.f25442f.total_rounds, ',')), z9, true);
        }
        String m10 = jg.g.m(s9Var.f25441e.bid_amount, ',', new StringBuilder("⭐️"));
        int d = s9Var.d();
        wp[] wpVarArr = this.f60313n;
        i6 i6Var = this.f60310c;
        if (d != 2 && d != 3) {
            i6Var.c(dd.a1(false, org.telegram.messenger.g0.X2(id.a0(null, null, 2131750417, m10, Integer.valueOf(s9Var.f25444i))), 0.66f, wpVarArr), z9, true);
            t6.Y(i6Var, m6.G6, null);
            return;
        }
        i6Var.c(dd.a1(false, org.telegram.messenger.g0.X2(id.a0(null, null, 2131750416, m10)), 0.66f, wpVarArr), z9, true);
        t6.Y(i6Var, m6.f28131q7, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRoundRect(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(14.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f60311e);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f60312f.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(146), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.f60311e.setColor(m6.x0(null, m6.f27890d6, false));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
