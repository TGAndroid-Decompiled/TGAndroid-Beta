package xg;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.bs0;
import xh.h2;
import xh.m;
import xh.p2;
import xh.t2;
import xh.v;
import yh.a0;
import yh.f5;
import yh.l7;
import yh.w4;
public final class e implements View.OnClickListener {
    public final int f46086a;
    public final Object f46087b;
    public final Object f46088c;
    public final Object d;

    public e(Object obj, Object obj2, Object obj3, int i10) {
        this.f46086a = i10;
        this.f46087b = obj;
        this.f46088c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f46086a;
        Object obj = this.d;
        Object obj2 = this.f46088c;
        Object obj3 = this.f46087b;
        switch (i10) {
            case 0:
                ((i) obj3).a(view, (HashSet) obj2, (Runnable) obj);
                return;
            case 1:
                new m((Context) obj2, null, null, (GiftAuctionController.Auction) obj).show();
                ((xh.e) obj3).dismiss();
                return;
            case 2:
                m.R((m) obj3, (boolean[]) obj2, (e6) obj);
                return;
            case 3:
                v.R((v) obj3, (Context) obj2, (e6) obj);
                return;
            case 4:
                v.P((v) obj3, (boolean[]) obj2, (e6) obj);
                return;
            case 5:
                p2 p2Var = (p2) obj3;
                ((a80) obj2).u();
                bs0 bs0Var = p2Var.f46405a;
                h2 h2Var = new h2(p2Var, (TL_stars.SavedStarGift) obj, 0);
                HashMap hashMap = t2.T;
                bs0Var.h(null, h2Var);
                return;
            case 6:
                Context context = (Context) obj2;
                e6 e6Var = (e6) obj;
                if (((a0) obj3).m0.f49268a == zf.b.f49270a) {
                    new l7(context, e6Var).show();
                    return;
                }
                return;
            case 7:
                final g3 g3Var = (g3) obj2;
                final ci.d dVar = (ci.d) obj;
                g3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                ((w4) obj3).run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.g3 g3Var2 = g3Var;
                                if (booleanValue) {
                                    g3Var2.dismiss();
                                    return;
                                }
                                final ci.d dVar2 = dVar;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                g3Var2.setCanDismissWithSwipe(false);
                                                dVar2.setLoading(false);
                                                return;
                                            default:
                                                g3Var2.setCanDismissWithSwipe(false);
                                                dVar2.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.g3 g3Var3 = g3Var;
                                if (booleanValue2) {
                                    g3Var3.dismiss();
                                    return;
                                }
                                final ci.d dVar3 = dVar;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                g3Var3.setCanDismissWithSwipe(false);
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                g3Var3.setCanDismissWithSwipe(false);
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
                final g3 g3Var2 = (g3) obj2;
                final ci.d dVar2 = (ci.d) obj;
                g3Var2.setCanDismissWithSwipe(false);
                dVar2.setLoading(true);
                ((f5) obj3).run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.g3 g3Var22 = g3Var2;
                                if (booleanValue) {
                                    g3Var22.dismiss();
                                    return;
                                }
                                final ci.d dVar22 = dVar2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                g3Var22.setCanDismissWithSwipe(false);
                                                dVar22.setLoading(false);
                                                return;
                                            default:
                                                g3Var22.setCanDismissWithSwipe(false);
                                                dVar22.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.g3 g3Var3 = g3Var2;
                                if (booleanValue2) {
                                    g3Var3.dismiss();
                                    return;
                                }
                                final ci.d dVar3 = dVar2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                g3Var3.setCanDismissWithSwipe(false);
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                g3Var3.setCanDismissWithSwipe(false);
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
