package yh;

import ai.ld;
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
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.yq;
import w7.z5;
public final class d extends FrameLayout {
    public final ei.d f50210a;
    public final q6 f50211b;
    public final q6 f50212c;
    public final GiftAuctionController.Auction d;
    public final Paint e;
    public final zf.n f50213f;
    public final yq h;
    public final yq[] f50214n;

    public d(Context context, GiftAuctionController.Auction auction) {
        super(context);
        Paint paint = new Paint(1);
        this.e = paint;
        this.f50213f = new zf.n(new qg.g0(this, 27));
        this.h = new yq(R.drawable.filled_gift_sell_24, 0);
        this.f50214n = new yq[1];
        this.d = auction;
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f));
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, 0.0f, 536870912);
        paint.setColor(h6.x0(null, h6.f20986d6, false));
        ei.d dVar = new ei.d(context, null, true);
        this.f50210a = dVar;
        p6 p6Var = dVar.d;
        p6Var.D = false;
        p6Var.E = true;
        p6Var.F = true;
        p6Var.G = true;
        p6Var.H = false;
        ?? imageView = new ImageView(context);
        q6 q6Var = new q6(context, false, false, false);
        this.f50211b = q6Var;
        q6Var.setTextSize(AndroidUtilities.dp(14.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setTextColor(h6.x0(null, h6.G6, false));
        q6 q6Var2 = new q6(context, false, false, false);
        this.f50212c = q6Var2;
        q6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        TLRPC.Document document = auction.gift.sticker;
        if (document != null) {
            imageView.g(44, 44, document);
        }
        addView(q6Var, z5.a(18.0f, 64.0f, 15.0f, 15.0f, 0.0f, -1, 51));
        addView(q6Var2, z5.a(17.0f, 64.0f, 34.0f, 15.0f, 0.0f, -1, 51));
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
        this.f50210a.g(spannableStringBuilder, z10, true);
    }

    public final void b(boolean z10) {
        GiftAuctionController.Auction auction = this.d;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        if (tL_starGiftAuctionState != null) {
            this.f50211b.c(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveRound, LocaleController.formatNumber(tL_starGiftAuctionState.current_round, ','), LocaleController.formatNumber(auction.auctionStateActive.total_rounds, ',')), z10, true);
        }
        String h = org.telegram.messenger.q.h(auction.auctionUserState.bid_amount, ',', new StringBuilder("⭐️"));
        boolean isOutbid = auction.getBidStatus().isOutbid();
        yq[] yqVarArr = this.f50214n;
        q6 q6Var = this.f50212c;
        if (isOutbid) {
            q6Var.c(ld.Y0(false, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveBidOutbid, h)), 0.66f, yqVarArr), z10, true);
            q6Var.setTextColor(h6.x0(null, h6.f21224q7, false));
            return;
        }
        q6Var.c(ld.Y0(false, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveBidActive, h, Integer.valueOf(auction.getApproximatedMyPlace()))), 0.66f, yqVarArr), z10, true);
        q6Var.setTextColor(h6.x0(null, h6.G6, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRoundRect(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), getMeasuredWidth() - AndroidUtilities.dp(14.0f), getMeasuredHeight() - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.e);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50213f.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(146), 1073741824));
    }
}
