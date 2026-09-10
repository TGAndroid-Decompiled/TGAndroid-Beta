package wh;

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
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.uq;
import w7.a6;
import xh.z7;
public final class d extends FrameLayout {
    public final bi.d f44041a;
    public final o6 f44042b;
    public final o6 f44043c;
    public final GiftAuctionController.Auction d;
    public final Paint e;
    public final xf.n f44044f;
    public final uq h;
    public final uq[] f44045n;

    public d(Context context, GiftAuctionController.Auction auction) {
        super(context);
        Paint paint = new Paint(1);
        this.e = paint;
        this.f44044f = new xf.n(new th.e(this, 3));
        this.h = new uq(R.drawable.filled_gift_sell_24, 0);
        this.f44045n = new uq[1];
        this.d = auction;
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f));
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, 0.0f, 536870912);
        paint.setColor(j6.w0(null, j6.f17928d6, false));
        bi.d dVar = new bi.d(context, null, true);
        this.f44041a = dVar;
        dVar.d.o(false, true, true);
        ?? imageView = new ImageView(context);
        o6 o6Var = new o6(context, false, false, false);
        this.f44042b = o6Var;
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setTextColor(j6.w0(null, j6.G6, false));
        o6 o6Var2 = new o6(context, false, false, false);
        this.f44043c = o6Var2;
        o6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        TLRPC.Document document = auction.gift.sticker;
        if (document != null) {
            imageView.g(44, 44, document);
        }
        addView(o6Var, a6.d(-1, 18.0f, 51, 64.0f, 15.0f, 15.0f, 0.0f));
        addView(o6Var2, a6.d(-1, 17.0f, 51, 64.0f, 34.0f, 15.0f, 0.0f));
        addView((View) imageView, a6.d(44, 44.0f, 51, 14.0f, 11.0f, 0.0f, 0.0f));
        addView(dVar, a6.d(-1, 44.0f, 80, 15.0f, 0.0f, 15.0f, 15.0f));
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
        this.f44041a.g(spannableStringBuilder, z10, true);
    }

    public final void b(boolean z10) {
        GiftAuctionController.Auction auction = this.d;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        if (tL_starGiftAuctionState != null) {
            this.f44042b.c(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveRound, LocaleController.formatNumber(tL_starGiftAuctionState.current_round, ','), LocaleController.formatNumber(auction.auctionStateActive.total_rounds, ',')), z10, true);
        }
        String l4 = hc.b.l(auction.auctionUserState.bid_amount, ',', new StringBuilder("⭐️"));
        boolean isOutbid = auction.getBidStatus().isOutbid();
        uq[] uqVarArr = this.f44045n;
        o6 o6Var = this.f44043c;
        if (isOutbid) {
            o6Var.c(z7.X0(false, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveBidOutbid, l4)), 0.66f, uqVarArr), z10, true);
            o6Var.setTextColor(j6.w0(null, j6.f18162q7, false));
            return;
        }
        o6Var.c(z7.X0(false, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveBidActive, l4, Integer.valueOf(auction.getApproximatedMyPlace()))), 0.66f, uqVarArr), z10, true);
        o6Var.setTextColor(j6.w0(null, j6.G6, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRoundRect(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), getMeasuredWidth() - AndroidUtilities.dp(14.0f), getMeasuredHeight() - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.e);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44044f.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(146), 1073741824));
    }
}
