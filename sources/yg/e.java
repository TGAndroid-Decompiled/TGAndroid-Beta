package yg;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.ns0;
import yh.e2;
import yh.m2;
import yh.n;
import yh.q2;
import yh.w;
import zh.a5;
import zh.f7;
import zh.q4;
import zh.z;
public final class e implements View.OnClickListener {
    public final int f48757a;
    public final Object f48758b;
    public final Object f48759c;
    public final Object d;

    public e(Object obj, Object obj2, Object obj3, int i10) {
        this.f48757a = i10;
        this.f48758b = obj;
        this.f48759c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f48757a;
        Object obj = this.d;
        Object obj2 = this.f48759c;
        Object obj3 = this.f48758b;
        switch (i10) {
            case 0:
                ((i) obj3).a(view, (HashSet) obj2, (Runnable) obj);
                return;
            case 1:
                new n((Context) obj2, null, null, (GiftAuctionController.Auction) obj).show();
                ((yh.f) obj3).dismiss();
                return;
            case 2:
                n.S((n) obj3, (boolean[]) obj2, (c6) obj);
                return;
            case 3:
                w.S((w) obj3, (Context) obj2, (c6) obj);
                return;
            case 4:
                w.Q((w) obj3, (boolean[]) obj2, (c6) obj);
                return;
            case 5:
                m2 m2Var = (m2) obj3;
                ((m80) obj2).u();
                ns0 ns0Var = m2Var.f48994a;
                e2 e2Var = new e2(m2Var, (TL_stars.SavedStarGift) obj, 0);
                HashMap hashMap = q2.T;
                ns0Var.h(null, e2Var);
                return;
            case 6:
                Context context = (Context) obj2;
                c6 c6Var = (c6) obj;
                if (((z) obj3).m0.f627a == ag.b.f629a) {
                    new f7(context, c6Var).show();
                    return;
                }
                return;
            case 7:
                final e3 e3Var = (e3) obj2;
                final di.d dVar = (di.d) obj;
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
                                final di.d dVar2 = dVar;
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
                                final di.d dVar3 = dVar;
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
                final di.d dVar2 = (di.d) obj;
                e3Var2.setCanDismissWithSwipe(false);
                dVar2.setLoading(true);
                ((a5) obj3).run(new Utilities.Callback() {
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
                                final di.d dVar22 = dVar2;
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
                                final di.d dVar3 = dVar2;
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
