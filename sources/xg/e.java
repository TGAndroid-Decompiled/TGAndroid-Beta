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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nr0;
import xh.f2;
import xh.m;
import xh.n2;
import xh.r2;
import xh.v;
import yh.a0;
import yh.h5;
import yh.n7;
import yh.y4;
public final class e implements View.OnClickListener {
    public final int f45758a;
    public final Object f45759b;
    public final Object f45760c;
    public final Object d;

    public e(Object obj, Object obj2, Object obj3, int i10) {
        this.f45758a = i10;
        this.f45759b = obj;
        this.f45760c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f45758a;
        Object obj = this.d;
        Object obj2 = this.f45760c;
        Object obj3 = this.f45759b;
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
                n2 n2Var = (n2) obj3;
                ((n70) obj2).u();
                nr0 nr0Var = n2Var.f46030a;
                f2 f2Var = new f2(n2Var, (TL_stars.SavedStarGift) obj, 0);
                HashMap hashMap = r2.T;
                nr0Var.h(null, f2Var);
                return;
            case 6:
                Context context = (Context) obj2;
                e6 e6Var = (e6) obj;
                if (((a0) obj3).m0.f48945a == zf.b.f48947a) {
                    new n7(context, e6Var).show();
                    return;
                }
                return;
            case 7:
                final f3 f3Var = (f3) obj2;
                final ci.d dVar = (ci.d) obj;
                f3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                ((y4) obj3).run(new Utilities.Callback() {
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
                ((h5) obj3).run(new Utilities.Callback() {
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
