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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.s6;
import w7.z5;
import zh.p7;
public final class e extends FrameLayout {
    public final di.d f48816a;
    public final s6 f48817b;
    public final s6 f48818c;
    public final GiftAuctionController.Auction d;
    public final Paint e;
    public final zf.o f48819f;
    public final br h;
    public final br[] f48820n;

    public e(Context context, GiftAuctionController.Auction auction) {
        super(context);
        Paint paint = new Paint(1);
        this.e = paint;
        this.f48819f = new zf.o(new rg.b0(this, 18));
        this.h = new br(R.drawable.filled_gift_sell_24, 0);
        this.f48820n = new br[1];
        this.d = auction;
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f));
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, 0.0f, 536870912);
        paint.setColor(g6.x0(null, g6.f19601d6, false));
        di.d dVar = new di.d(context, null, true);
        this.f48816a = dVar;
        r6 r6Var = dVar.d;
        r6Var.D = false;
        r6Var.E = true;
        r6Var.F = true;
        r6Var.G = true;
        r6Var.H = false;
        ?? imageView = new ImageView(context);
        s6 s6Var = new s6(context, false, false, false);
        this.f48817b = s6Var;
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setTextColor(g6.x0(null, g6.G6, false));
        s6 s6Var2 = new s6(context, false, false, false);
        this.f48818c = s6Var2;
        s6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        TLRPC.Document document = auction.gift.sticker;
        if (document != null) {
            imageView.g(44, 44, document);
        }
        addView(s6Var, z5.a(18.0f, 64.0f, 15.0f, 15.0f, 0.0f, -1, 51));
        addView(s6Var2, z5.a(17.0f, 64.0f, 34.0f, 15.0f, 0.0f, -1, 51));
        addView((View) imageView, z5.a(44.0f, 14.0f, 11.0f, 0.0f, 0.0f, 44, 51));
        addView(dVar, z5.a(44.0f, 15.0f, 0.0f, 15.0f, 15.0f, -1, 80));
        b(false);
    }

    public final void a(long j10, boolean z10) {
        String formatDurationNoHours = AndroidUtilities.formatDurationNoHours((int) j10, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(this.h, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2ActiveAuctionsActiveRaiseBid));
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) formatDurationNoHours);
        this.f48816a.g(spannableStringBuilder, z10, true);
    }

    public final void b(boolean z10) {
        GiftAuctionController.Auction auction = this.d;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        if (tL_starGiftAuctionState != null) {
            this.f48817b.c(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveRound, LocaleController.formatNumber(tL_starGiftAuctionState.current_round, ','), LocaleController.formatNumber(auction.auctionStateActive.total_rounds, ',')), z10, true);
        }
        String h = org.telegram.messenger.g0.h(auction.auctionUserState.bid_amount, ',', new StringBuilder("⭐️"));
        boolean isOutbid = auction.getBidStatus().isOutbid();
        br[] brVarArr = this.f48820n;
        s6 s6Var = this.f48818c;
        if (isOutbid) {
            s6Var.c(p7.Y0(false, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveBidOutbid, h)), 0.66f, brVarArr), z10, true);
            s6Var.setTextColor(g6.x0(null, g6.f19839q7, false));
            return;
        }
        s6Var.c(p7.Y0(false, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveBidActive, h, Integer.valueOf(auction.getApproximatedMyPlace()))), 0.66f, brVarArr), z10, true);
        s6Var.setTextColor(g6.x0(null, g6.G6, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRoundRect(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), getMeasuredWidth() - AndroidUtilities.dp(14.0f), getMeasuredHeight() - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.e);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48819f.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(146), 1073741824));
    }
}
