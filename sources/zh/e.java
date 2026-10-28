package zh;

import android.content.Context;
import android.util.LongSparseArray;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.u61;
public final class e extends bb implements GiftAuctionController.OnActiveAuctionsUpdateListeners {
    public final u61 X;
    public final LongSparseArray Y;
    public ArrayList Z;
    public boolean f53015a0;
    public k71 f53016b0;
    public int f53017c0;

    public e(Context context) {
        super(context, null, false, false, 2, null);
        int i10 = 0;
        this.Y = new LongSparseArray();
        this.Z = new ArrayList();
        int x02 = y6.x0(null, y6.f23300a7, false);
        this.f53017c0 = x02;
        setBackgroundColor(x02);
        GiftAuctionController.getInstance(this.currentAccount).subscribeToActiveAuctionsUpdates(this);
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.X = u61.j(-1, linearLayout);
        this.d.setPadding(this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f), this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f));
        this.d.setOverScrollMode(2);
        this.f53016b0.O(false);
        ArrayList<GiftAuctionController.Auction> activeAuctions = GiftAuctionController.getInstance(this.currentAccount).getActiveAuctions();
        int size = activeAuctions.size();
        while (i10 < size) {
            GiftAuctionController.Auction auction = activeAuctions.get(i10);
            i10++;
            GiftAuctionController.Auction auction2 = auction;
            d dVar = new d(context, auction2);
            dVar.f52984a.setOnClickListener(new b51(this, context, auction2, 4));
            linearLayout.addView(dVar, kb1.r(-1, -2));
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
        this.e.setTitle(y());
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
                dVar.b(this.f53015a0);
                long max = Math.max(0, i10 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
                dVar.a(max, this.f53015a0);
                dVar.f52987f.a(max);
            }
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f53015a0 = true;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int x02 = y6.x0(null, y6.f23300a7, false);
            if (x02 != this.f53017c0) {
                this.f53017c0 = x02;
                setBackgroundColor(x02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final mm0 v(nm0 nm0Var) {
        k71 k71Var = new k71(this.d, getContext(), this.currentAccount, 0, true, new hi.e2(this, 26), this.resourcesProvider);
        this.f53016b0 = k71Var;
        k71Var.f29878r = false;
        return k71Var;
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
