package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.dd;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.zq;
public final class d extends FrameLayout implements p6 {
    public final fi.d f52923a;
    public final s6 f52924b;
    public final s6 f52925c;
    public final GiftAuctionController.Auction d;
    public final Paint e;
    public final ag.t f52926f;
    public final zq h;
    public final zq[] f52927n;

    public d(Context context, GiftAuctionController.Auction auction) {
        super(context);
        Paint paint = new Paint(1);
        this.e = paint;
        this.f52926f = new ag.t(new x2.e(this, 4));
        this.h = new zq(R.drawable.filled_gift_sell_24, 0);
        this.f52927n = new zq[1];
        this.d = auction;
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f));
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, 0.0f, 536870912);
        paint.setColor(y6.x0(null, y6.f23354d6, false));
        fi.d dVar = new fi.d(context, null, true);
        this.f52923a = dVar;
        r6 r6Var = dVar.d;
        r6Var.D = false;
        r6Var.E = true;
        r6Var.F = true;
        r6Var.G = true;
        r6Var.H = false;
        ?? imageView = new ImageView(context);
        s6 s6Var = new s6(context, false, false, false);
        this.f52924b = s6Var;
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        f7.Z(s6Var, y6.G6, null);
        s6 s6Var2 = new s6(context, false, false, false);
        this.f52925c = s6Var2;
        s6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        TLRPC.Document document = auction.gift.sticker;
        if (document != null) {
            imageView.g(44, 44, document);
        }
        addView(s6Var, gb1.h(-1, 18.0f, 51, 64.0f, 15.0f, 15.0f, 0.0f));
        addView(s6Var2, gb1.h(-1, 17.0f, 51, 64.0f, 34.0f, 15.0f, 0.0f));
        addView((View) imageView, gb1.h(44, 44.0f, 51, 14.0f, 11.0f, 0.0f, 0.0f));
        addView(dVar, gb1.h(-1, 44.0f, 80, 15.0f, 0.0f, 15.0f, 15.0f));
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
        this.f52923a.i(spannableStringBuilder, z10, true);
    }

    public final void b(boolean z10) {
        GiftAuctionController.Auction auction = this.d;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        if (tL_starGiftAuctionState != null) {
            this.f52924b.c(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveRound, LocaleController.formatNumber(tL_starGiftAuctionState.current_round, ','), LocaleController.formatNumber(auction.auctionStateActive.total_rounds, ',')), z10, true);
        }
        String i10 = org.telegram.messenger.t.i(auction.auctionUserState.bid_amount, ',', new StringBuilder("⭐️"));
        boolean isOutbid = auction.getBidStatus().isOutbid();
        zq[] zqVarArr = this.f52927n;
        s6 s6Var = this.f52925c;
        if (isOutbid) {
            s6Var.c(dd.W0(false, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveBidOutbid, i10)), 0.66f, zqVarArr), z10, true);
            f7.Z(s6Var, y6.f23596q7, null);
            return;
        }
        s6Var.c(dd.W0(false, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveBidActive, i10, Integer.valueOf(auction.getApproximatedMyPlace()))), 0.66f, zqVarArr), z10, true);
        f7.Z(s6Var, y6.G6, null);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRoundRect(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), getMeasuredWidth() - AndroidUtilities.dp(14.0f), getMeasuredHeight() - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.e);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f52926f.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(146), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.e.setColor(y6.x0(null, y6.f23354d6, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
