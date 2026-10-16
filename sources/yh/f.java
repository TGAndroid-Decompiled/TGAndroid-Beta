package yh;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import w7.z5;
public final class f extends db implements GiftAuctionController.OnActiveAuctionsUpdateListeners {
    public final m61 X;
    public final LongSparseArray Y;
    public ArrayList Z;
    public boolean f48851a0;
    public a71 f48852b0;

    public f(Context context) {
        super(context, null, false, false, 2, null);
        int i10 = 0;
        this.Y = new LongSparseArray();
        this.Z = new ArrayList();
        setBackgroundColor(g6.x0(null, g6.f19543a7, false));
        GiftAuctionController.getInstance(this.currentAccount).subscribeToActiveAuctionsUpdates(this);
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.X = m61.j(-1, linearLayout);
        this.d.setPadding(this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f), this.backgroundPaddingLeft, AndroidUtilities.dp(9.0f));
        this.d.setOverScrollMode(2);
        this.f48852b0.N(false);
        ArrayList<GiftAuctionController.Auction> activeAuctions = GiftAuctionController.getInstance(this.currentAccount).getActiveAuctions();
        int size = activeAuctions.size();
        while (i10 < size) {
            GiftAuctionController.Auction auction = activeAuctions.get(i10);
            i10++;
            GiftAuctionController.Auction auction2 = auction;
            e eVar = new e(context, auction2);
            eVar.f48816a.setOnClickListener(new yg.e(this, context, auction2, 1));
            linearLayout.addView(eVar, z5.n(-1, -2));
            this.Y.put(auction2.giftId, eVar);
        }
        onActiveAuctionsUpdate(activeAuctions);
    }

    @Override
    public final CharSequence B() {
        ArrayList arrayList = this.Z;
        if (arrayList == null) {
            return null;
        }
        return LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveAuctionsTitle, Integer.valueOf(arrayList.size()));
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
        this.e.setTitle(B());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GiftAuctionController.Auction auction = (GiftAuctionController.Auction) it.next();
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
            if (tL_starGiftAuctionState != null) {
                i10 = tL_starGiftAuctionState.next_round_at;
            } else {
                i10 = 0;
            }
            e eVar = (e) this.Y.get(auction.giftId);
            if (eVar != null) {
                eVar.b(this.f48851a0);
                long max = Math.max(0, i10 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
                eVar.a(max, this.f48851a0);
                eVar.f48819f.a(max);
            }
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f48851a0 = true;
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        a71 a71Var = new a71(this.d, getContext(), this.currentAccount, 0, true, new ii.a(this, 12), this.resourcesProvider);
        this.f48852b0 = a71Var;
        a71Var.f23145r = false;
        return a71Var;
    }
}
