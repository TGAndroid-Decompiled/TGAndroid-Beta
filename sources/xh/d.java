package xh;

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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pq;
import w7.x5;
import yh.w7;
public final class d extends FrameLayout {
    public final ci.d f45778a;
    public final p6 f45779b;
    public final p6 f45780c;
    public final GiftAuctionController.Auction d;
    public final Paint e;
    public final yf.n f45781f;
    public final pq h;
    public final pq[] f45782n;

    public d(Context context, GiftAuctionController.Auction auction) {
        super(context);
        Paint paint = new Paint(1);
        this.e = paint;
        this.f45781f = new yf.n(new r5.d(this, 14));
        this.h = new pq(R.drawable.filled_gift_sell_24, 0);
        this.f45782n = new pq[1];
        this.d = auction;
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f));
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, 0.0f, 536870912);
        paint.setColor(h6.w0(null, h6.f18789d6, false));
        ci.d dVar = new ci.d(context, null, true);
        this.f45778a = dVar;
        dVar.d.o(false, true, true);
        ?? imageView = new ImageView(context);
        p6 p6Var = new p6(context, false, false, false);
        this.f45779b = p6Var;
        p6Var.setTextSize(AndroidUtilities.dp(14.0f));
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setTextColor(h6.w0(null, h6.G6, false));
        p6 p6Var2 = new p6(context, false, false, false);
        this.f45780c = p6Var2;
        p6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        TLRPC.Document document = auction.gift.sticker;
        if (document != null) {
            imageView.g(44, 44, document);
        }
        addView(p6Var, x5.d(-1, 18.0f, 51, 64.0f, 15.0f, 15.0f, 0.0f));
        addView(p6Var2, x5.d(-1, 17.0f, 51, 64.0f, 34.0f, 15.0f, 0.0f));
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
        this.f45778a.g(spannableStringBuilder, z10, true);
    }

    public final void b(boolean z10) {
        GiftAuctionController.Auction auction = this.d;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        if (tL_starGiftAuctionState != null) {
            this.f45779b.c(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveRound, LocaleController.formatNumber(tL_starGiftAuctionState.current_round, ','), LocaleController.formatNumber(auction.auctionStateActive.total_rounds, ',')), z10, true);
        }
        String k10 = hg.c.k(auction.auctionUserState.bid_amount, ',', new StringBuilder("⭐️"));
        boolean isOutbid = auction.getBidStatus().isOutbid();
        pq[] pqVarArr = this.f45782n;
        p6 p6Var = this.f45780c;
        if (isOutbid) {
            p6Var.c(w7.X0(false, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveBidOutbid, k10)), 0.66f, pqVarArr), z10, true);
            p6Var.setTextColor(h6.w0(null, h6.f19026q7, false));
            return;
        }
        p6Var.c(w7.X0(false, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveBidActive, k10, Integer.valueOf(auction.getApproximatedMyPlace()))), 0.66f, pqVarArr), z10, true);
        p6Var.setTextColor(h6.w0(null, h6.G6, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRoundRect(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), getMeasuredWidth() - AndroidUtilities.dp(14.0f), getMeasuredHeight() - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.e);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45781f.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(146), 1073741824));
    }
}
