package xh;

import android.content.Context;
import android.util.LongSparseArray;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import w7.z5;
public final class e extends cb implements GiftAuctionController.OnActiveAuctionsUpdateListeners {
    public final g61 X;
    public final LongSparseArray Y;
    public ArrayList Z;
    public boolean f49928a0;
    public u61 f49929b0;

    public e(Context context) {
        super(context, null, false, false, 2, null);
        int i10 = 0;
        this.Y = new LongSparseArray();
        this.Z = new ArrayList();
        setBackgroundColor(i6.w0(null, i6.f20766a7, false));
        GiftAuctionController.getInstance(this.currentAccount).subscribeToActiveAuctionsUpdates(this);
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.X = g61.j(-1, linearLayout);
        this.d.setPadding(this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f), this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f));
        this.d.setOverScrollMode(2);
        this.f49929b0.N(false);
        ArrayList<GiftAuctionController.Auction> activeAuctions = GiftAuctionController.getInstance(this.currentAccount).getActiveAuctions();
        int size = activeAuctions.size();
        while (i10 < size) {
            GiftAuctionController.Auction auction = activeAuctions.get(i10);
            i10++;
            GiftAuctionController.Auction auction2 = auction;
            d dVar = new d(context, auction2);
            dVar.f49918a.setOnClickListener(new xg.e(this, context, auction2, 1));
            linearLayout.addView(dVar, z5.n(-1, -2));
            this.Y.put(auction2.giftId, dVar);
        }
        onActiveAuctionsUpdate(activeAuctions);
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromActiveAuctionsUpdates(this);
        super.dismiss();
    }

    @Override
    public final void onActiveAuctionsUpdate(List list) {
        int i10;
        this.Z = new ArrayList(list);
        this.f25307e.setTitle(y());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GiftAuctionController.Auction auction = (GiftAuctionController.Auction) it.next();
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
            if (tL_starGiftAuctionState != null) {
                i10 = tL_starGiftAuctionState.next_round_at;
            } else {
                i10 = 0;
            }
            d dVar = (d) this.Y.get(auction.giftId);
            if (dVar != null) {
                dVar.b(this.f49928a0);
                long max = Math.max(0, i10 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
                dVar.a(max, this.f49928a0);
                dVar.f49922f.a(max);
            }
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f49928a0 = true;
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        u61 u61Var = new u61(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 12), this.resourcesProvider);
        this.f49929b0 = u61Var;
        u61Var.f31313r = false;
        return u61Var;
    }

    @Override
    public final CharSequence y() {
        ArrayList arrayList = this.Z;
        if (arrayList == null) {
            return null;
        }
        return LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveAuctionsTitle, Integer.valueOf(arrayList.size()));
    }
}
