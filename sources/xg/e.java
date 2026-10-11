package xg;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.ss0;
import xh.g2;
import xh.o;
import xh.o2;
import xh.s2;
import xh.x;
import yh.f7;
import yh.q4;
import yh.y;
import yh.z4;
public final class e implements View.OnClickListener {
    public final int f51254a;
    public final Object f51255b;
    public final Object f51256c;
    public final Object d;

    public e(Object obj, Object obj2, Object obj3, int i10) {
        this.f51254a = i10;
        this.f51255b = obj;
        this.f51256c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f51254a;
        Object obj = this.d;
        Object obj2 = this.f51256c;
        Object obj3 = this.f51255b;
        switch (i10) {
            case 0:
                ((i) obj3).a(view, (HashSet) obj2, (Runnable) obj);
                return;
            case 1:
                new o((Context) obj2, null, null, (GiftAuctionController.Auction) obj).show();
                ((xh.f) obj3).dismiss();
                return;
            case 2:
                o.S((o) obj3, (boolean[]) obj2, (d6) obj);
                return;
            case 3:
                x.S((x) obj3, (Context) obj2, (d6) obj);
                return;
            case 4:
                x.Q((x) obj3, (boolean[]) obj2, (d6) obj);
                return;
            case 5:
                o2 o2Var = (o2) obj3;
                ((p80) obj2).u();
                ss0 ss0Var = o2Var.f51556a;
                g2 g2Var = new g2(o2Var, (TL_stars.SavedStarGift) obj, 0);
                HashMap hashMap = s2.T;
                ss0Var.h(null, g2Var);
                return;
            case 6:
                Context context = (Context) obj2;
                d6 d6Var = (d6) obj;
                if (((y) obj3).m0.f54562a == zf.b.f54564a) {
                    new f7(context, d6Var).show();
                    return;
                }
                return;
            case 7:
                final e3 e3Var = (e3) obj2;
                final ci.d dVar = (ci.d) obj;
                e3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                ((q4) obj3).run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.e3 e3Var2 = e3Var;
                                if (booleanValue) {
                                    e3Var2.dismiss();
                                    return;
                                }
                                final ci.d dVar2 = dVar;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                e3Var2.setCanDismissWithSwipe(false);
                                                dVar2.setLoading(false);
                                                return;
                                            default:
                                                e3Var2.setCanDismissWithSwipe(false);
                                                dVar2.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.e3 e3Var3 = e3Var;
                                if (booleanValue2) {
                                    e3Var3.dismiss();
                                    return;
                                }
                                final ci.d dVar3 = dVar;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                e3Var3.setCanDismissWithSwipe(false);
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                e3Var3.setCanDismissWithSwipe(false);
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
                final e3 e3Var2 = (e3) obj2;
                final ci.d dVar2 = (ci.d) obj;
                e3Var2.setCanDismissWithSwipe(false);
                dVar2.setLoading(true);
                ((z4) obj3).run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.e3 e3Var22 = e3Var2;
                                if (booleanValue) {
                                    e3Var22.dismiss();
                                    return;
                                }
                                final ci.d dVar22 = dVar2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                e3Var22.setCanDismissWithSwipe(false);
                                                dVar22.setLoading(false);
                                                return;
                                            default:
                                                e3Var22.setCanDismissWithSwipe(false);
                                                dVar22.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.e3 e3Var3 = e3Var2;
                                if (booleanValue2) {
                                    e3Var3.dismiss();
                                    return;
                                }
                                final ci.d dVar3 = dVar2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                e3Var3.setCanDismissWithSwipe(false);
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                e3Var3.setCanDismissWithSwipe(false);
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
