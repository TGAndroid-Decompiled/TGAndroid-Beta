package xg;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.y70;
import xh.g2;
import xh.m;
import xh.o2;
import xh.s2;
import xh.v;
import yh.a0;
import yh.g5;
import yh.m7;
import yh.x4;
public final class e implements View.OnClickListener {
    public final int f46081a;
    public final Object f46082b;
    public final Object f46083c;
    public final Object d;

    public e(Object obj, Object obj2, Object obj3, int i10) {
        this.f46081a = i10;
        this.f46082b = obj;
        this.f46083c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f46081a;
        Object obj = this.d;
        Object obj2 = this.f46083c;
        Object obj3 = this.f46082b;
        switch (i10) {
            case 0:
                ((i) obj3).a(view, (HashSet) obj2, (Runnable) obj);
                return;
            case 1:
                new m((Context) obj2, null, null, (GiftAuctionController.Auction) obj).show();
                ((xh.e) obj3).dismiss();
                return;
            case 2:
                m.R((m) obj3, (boolean[]) obj2, (f6) obj);
                return;
            case 3:
                v.R((v) obj3, (Context) obj2, (f6) obj);
                return;
            case 4:
                v.P((v) obj3, (boolean[]) obj2, (f6) obj);
                return;
            case 5:
                o2 o2Var = (o2) obj3;
                ((y70) obj2).u();
                bs0 bs0Var = o2Var.f46368a;
                g2 g2Var = new g2(o2Var, (TL_stars.SavedStarGift) obj, 0);
                HashMap hashMap = s2.T;
                bs0Var.h(null, g2Var);
                return;
            case 6:
                Context context = (Context) obj2;
                f6 f6Var = (f6) obj;
                if (((a0) obj3).m0.f49272a == zf.b.f49274a) {
                    new m7(context, f6Var).show();
                    return;
                }
                return;
            case 7:
                final f3 f3Var = (f3) obj2;
                final ci.d dVar = (ci.d) obj;
                f3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                ((x4) obj3).run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                                if (booleanValue) {
                                    f3Var2.dismiss();
                                    return;
                                }
                                final ci.d dVar2 = dVar;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                f3Var2.setCanDismissWithSwipe(false);
                                                dVar2.setLoading(false);
                                                return;
                                            default:
                                                f3Var2.setCanDismissWithSwipe(false);
                                                dVar2.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.f3 f3Var3 = f3Var;
                                if (booleanValue2) {
                                    f3Var3.dismiss();
                                    return;
                                }
                                final ci.d dVar3 = dVar;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                f3Var3.setCanDismissWithSwipe(false);
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                f3Var3.setCanDismissWithSwipe(false);
                                                dVar3.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                        }
                    }
                });
                return;
            default:
                final f3 f3Var2 = (f3) obj2;
                final ci.d dVar2 = (ci.d) obj;
                f3Var2.setCanDismissWithSwipe(false);
                dVar2.setLoading(true);
                ((g5) obj3).run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.f3 f3Var22 = f3Var2;
                                if (booleanValue) {
                                    f3Var22.dismiss();
                                    return;
                                }
                                final ci.d dVar22 = dVar2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                f3Var22.setCanDismissWithSwipe(false);
                                                dVar22.setLoading(false);
                                                return;
                                            default:
                                                f3Var22.setCanDismissWithSwipe(false);
                                                dVar22.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.f3 f3Var3 = f3Var2;
                                if (booleanValue2) {
                                    f3Var3.dismiss();
                                    return;
                                }
                                final ci.d dVar3 = dVar2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                f3Var3.setCanDismissWithSwipe(false);
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                f3Var3.setCanDismissWithSwipe(false);
                                                dVar3.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
