package xg;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.or0;
import xh.f2;
import xh.m;
import xh.n2;
import xh.r2;
import xh.v;
import yh.a0;
import yh.i5;
import yh.o7;
import yh.z4;
public final class e implements View.OnClickListener {
    public final int f45790a;
    public final Object f45791b;
    public final Object f45792c;
    public final Object d;

    public e(Object obj, Object obj2, Object obj3, int i10) {
        this.f45790a = i10;
        this.f45791b = obj;
        this.f45792c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f45790a;
        Object obj = this.d;
        Object obj2 = this.f45792c;
        Object obj3 = this.f45791b;
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
                n2 n2Var = (n2) obj3;
                ((n70) obj2).u();
                or0 or0Var = n2Var.f46062a;
                f2 f2Var = new f2(n2Var, (TL_stars.SavedStarGift) obj, 0);
                HashMap hashMap = r2.T;
                or0Var.h(null, f2Var);
                return;
            case 6:
                Context context = (Context) obj2;
                f6 f6Var = (f6) obj;
                if (((a0) obj3).m0.f48980a == zf.b.f48982a) {
                    new o7(context, f6Var).show();
                    return;
                }
                return;
            case 7:
                final g3 g3Var = (g3) obj2;
                final ci.d dVar = (ci.d) obj;
                g3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                ((z4) obj3).run(new Utilities.Callback() {
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
                ((i5) obj3).run(new Utilities.Callback() {
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
