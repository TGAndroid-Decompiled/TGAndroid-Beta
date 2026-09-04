package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.q6;
import w7.x5;
import zh.v7;
public final class d extends FrameLayout {
    public final di.d f50223a;
    public final q6 f50224b;
    public final q6 f50225c;
    public final GiftAuctionController.Auction d;
    public final Paint f50226e;
    public final yf.n f50227f;
    public final nq h;
    public final nq[] f50228n;

    public d(Context context, GiftAuctionController.Auction auction) {
        super(context);
        Paint paint = new Paint(1);
        this.f50226e = paint;
        this.f50227f = new yf.n(new rg.p2(this, 14));
        this.h = new nq(R.drawable.filled_gift_sell_24, 0);
        this.f50228n = new nq[1];
        this.d = auction;
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f));
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, 0.0f, 536870912);
        paint.setColor(j6.w0(null, j6.f20663d6, false));
        di.d dVar = new di.d(context, null, true);
        this.f50223a = dVar;
        dVar.d.o(false, true, true);
        ?? imageView = new ImageView(context);
        q6 q6Var = new q6(context, false, false, false);
        this.f50224b = q6Var;
        q6Var.setTextSize(AndroidUtilities.dp(14.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setTextColor(j6.w0(null, j6.G6, false));
        q6 q6Var2 = new q6(context, false, false, false);
        this.f50225c = q6Var2;
        q6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        TLRPC.Document document = auction.gift.sticker;
        if (document != null) {
            imageView.g(44, 44, document);
        }
        addView(q6Var, x5.d(-1, 18.0f, 51, 64.0f, 15.0f, 15.0f, 0.0f));
        addView(q6Var2, x5.d(-1, 17.0f, 51, 64.0f, 34.0f, 15.0f, 0.0f));
        addView((View) imageView, x5.d(44, 44.0f, 51, 14.0f, 11.0f, 0.0f, 0.0f));
        addView(dVar, x5.d(-1, 44.0f, 80, 15.0f, 0.0f, 15.0f, 15.0f));
        b(false);
    }

    public final void a(long j3, boolean z10) {
        String formatDurationNoHours = AndroidUtilities.formatDurationNoHours((int) j3, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(this.h, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2ActiveAuctionsActiveRaiseBid));
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) formatDurationNoHours);
        this.f50223a.g(spannableStringBuilder, z10, true);
    }

    public final void b(boolean z10) {
        GiftAuctionController.Auction auction = this.d;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        if (tL_starGiftAuctionState != null) {
            this.f50224b.c(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveRound, LocaleController.formatNumber(tL_starGiftAuctionState.current_round, ','), LocaleController.formatNumber(auction.auctionStateActive.total_rounds, ',')), z10, true);
        }
        String k10 = i2.g.k(auction.auctionUserState.bid_amount, ',', new StringBuilder("⭐️"));
        boolean isOutbid = auction.getBidStatus().isOutbid();
        nq[] nqVarArr = this.f50228n;
        q6 q6Var = this.f50225c;
        if (isOutbid) {
            q6Var.c(v7.X0(false, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveBidOutbid, k10)), 0.66f, nqVarArr), z10, true);
            q6Var.setTextColor(j6.w0(null, j6.f20898q7, false));
            return;
        }
        q6Var.c(v7.X0(false, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveBidActive, k10, Integer.valueOf(auction.getApproximatedMyPlace()))), 0.66f, nqVarArr), z10, true);
        q6Var.setTextColor(j6.w0(null, j6.G6, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRoundRect(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), getMeasuredWidth() - AndroidUtilities.dp(14.0f), getMeasuredHeight() - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f50226e);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50227f.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(146), 1073741824));
    }
}
