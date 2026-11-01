package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.u9;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.f6;
import rh.h8;
import w7.b6;
public final class d extends FrameLayout implements k6 {
    public final vh.d f45026a;
    public final f6 f45027b;
    public final f6 f45028c;
    public final u9 d;
    public final Paint e;
    public final rf.m f45029f;
    public final dq h;
    public final dq[] f45030n;

    public d(Context context, u9 u9Var) {
        super(context);
        Paint paint = new Paint(1);
        this.e = paint;
        this.f45029f = new rf.m(new mg.l(this, 19));
        this.h = new dq(2131231117, 0);
        this.f45030n = new dq[1];
        this.d = u9Var;
        setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(9.0f));
        paint.setShadowLayer(org.telegram.messenger.i0.L(1.0f), 0.0f, 0.0f, 536870912);
        paint.setColor(t6.x0(null, t6.f20930d6, false));
        vh.d dVar = new vh.d(context, null, true);
        this.f45026a = dVar;
        e6 e6Var = dVar.d;
        e6Var.D = false;
        e6Var.E = true;
        e6Var.F = true;
        e6Var.G = true;
        e6Var.H = false;
        ?? imageView = new ImageView(context);
        f6 f6Var = new f6(context, false, false, false);
        this.f45027b = f6Var;
        f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        a7.Z(f6Var, t6.G6, null);
        f6 f6Var2 = new f6(context, false, false, false);
        this.f45028c = f6Var2;
        f6Var2.setTextSize(org.telegram.messenger.i0.L(12.0f));
        TLRPC.Document document = u9Var.d.sticker;
        if (document != null) {
            imageView.g(44, 44, document);
        }
        addView(f6Var, b6.d(-1, 18.0f, 51, 64.0f, 15.0f, 15.0f, 0.0f));
        addView(f6Var2, b6.d(-1, 17.0f, 51, 64.0f, 34.0f, 15.0f, 0.0f));
        addView((View) imageView, b6.d(44, 44.0f, 51, 14.0f, 11.0f, 0.0f, 0.0f));
        addView(dVar, b6.d(-1, 44.0f, 80, 15.0f, 0.0f, 15.0f, 15.0f));
        b(false);
    }

    public final void a(long j10, boolean z10) {
        String h02 = org.telegram.messenger.i0.h0((int) j10, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(this.h, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) dd.L0(2131750424, null));
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) h02);
        this.f45026a.i(spannableStringBuilder, z10, true);
    }

    public final void b(boolean z10) {
        u9 u9Var = this.d;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = u9Var.f18405f;
        if (tL_starGiftAuctionState != null) {
            this.f45027b.c(dd.a0(null, null, 2131750423, dd.E(tL_starGiftAuctionState.current_round, ','), dd.E(u9Var.f18405f.total_rounds, ',')), z10, true);
        }
        String k10 = i0.a.k(u9Var.e.bid_amount, ',', new StringBuilder("⭐️"));
        int d = u9Var.d();
        dq[] dqVarArr = this.f45030n;
        f6 f6Var = this.f45028c;
        if (d != 2 && d != 3) {
            f6Var.c(h8.a1(false, org.telegram.messenger.i0.W2(dd.a0(null, null, 2131750426, k10, Integer.valueOf(u9Var.f18407i))), 0.66f, dqVarArr), z10, true);
            a7.Z(f6Var, t6.G6, null);
            return;
        }
        f6Var.c(h8.a1(false, org.telegram.messenger.i0.W2(dd.a0(null, null, 2131750425, k10)), 0.66f, dqVarArr), z10, true);
        a7.Z(f6Var, t6.f21171q7, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRoundRect(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(9.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(14.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), this.e);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45029f.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(146), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.e.setColor(t6.x0(null, t6.f20930d6, false));
            invalidate();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
