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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.r6;
import w7.x5;
import yh.p7;
public final class e extends FrameLayout {
    public final ci.d f51204a;
    public final r6 f51205b;
    public final r6 f51206c;
    public final GiftAuctionController.Auction d;
    public final Paint f51207e;
    public final yf.n f51208f;
    public final er h;
    public final er[] f51209n;

    public e(Context context, GiftAuctionController.Auction auction) {
        super(context);
        Paint paint = new Paint(1);
        this.f51207e = paint;
        this.f51208f = new yf.n(new r5.d(this, 14));
        this.h = new er(R.drawable.filled_gift_sell_24, 0);
        this.f51209n = new er[1];
        this.d = auction;
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f));
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, 0.0f, 536870912);
        paint.setColor(i6.x0(null, i6.f20797d6, false));
        ci.d dVar = new ci.d(context, null, true);
        this.f51204a = dVar;
        q6 q6Var = dVar.d;
        q6Var.D = false;
        q6Var.E = true;
        q6Var.F = true;
        q6Var.G = true;
        q6Var.H = false;
        ?? imageView = new ImageView(context);
        r6 r6Var = new r6(context, false, false, false);
        this.f51205b = r6Var;
        r6Var.setTextSize(AndroidUtilities.dp(14.0f));
        r6Var.setTypeface(AndroidUtilities.bold());
        r6Var.setTextColor(i6.x0(null, i6.G6, false));
        r6 r6Var2 = new r6(context, false, false, false);
        this.f51206c = r6Var2;
        r6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        TLRPC.Document document = auction.gift.sticker;
        if (document != null) {
            imageView.g(44, 44, document);
        }
        addView(r6Var, x5.a(18.0f, 64.0f, 15.0f, 15.0f, 0.0f, -1, 51));
        addView(r6Var2, x5.a(17.0f, 64.0f, 34.0f, 15.0f, 0.0f, -1, 51));
        addView((View) imageView, x5.a(44.0f, 14.0f, 11.0f, 0.0f, 0.0f, 44, 51));
        addView(dVar, x5.a(44.0f, 15.0f, 0.0f, 15.0f, 15.0f, -1, 80));
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
        this.f51204a.g(spannableStringBuilder, z10, true);
    }

    public final void b(boolean z10) {
        GiftAuctionController.Auction auction = this.d;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        if (tL_starGiftAuctionState != null) {
            this.f51205b.c(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveRound, LocaleController.formatNumber(tL_starGiftAuctionState.current_round, ','), LocaleController.formatNumber(auction.auctionStateActive.total_rounds, ',')), z10, true);
        }
        String h = org.telegram.messenger.q.h(auction.auctionUserState.bid_amount, ',', new StringBuilder("⭐️"));
        boolean isOutbid = auction.getBidStatus().isOutbid();
        er[] erVarArr = this.f51209n;
        r6 r6Var = this.f51206c;
        if (isOutbid) {
            r6Var.c(p7.Y0(false, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveBidOutbid, h)), 0.66f, erVarArr), z10, true);
            r6Var.setTextColor(i6.x0(null, i6.f21037q7, false));
            return;
        }
        r6Var.c(p7.Y0(false, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveBidActive, h, Integer.valueOf(auction.getApproximatedMyPlace()))), 0.66f, erVarArr), z10, true);
        r6Var.setTextColor(i6.x0(null, i6.G6, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRoundRect(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), getMeasuredWidth() - AndroidUtilities.dp(14.0f), getMeasuredHeight() - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f51207e);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f51208f.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(146), 1073741824));
    }
}
