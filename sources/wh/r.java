package wh;

import android.content.Context;
import android.view.View;
import bi.pb;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.Components.wv;
import xh.h5;
import xh.p7;
import zh.u7;
public final class r implements View.OnClickListener {
    public final int f44331a;
    public final Object f44332b;
    public final Object f44333c;
    public final Object d;

    public r(Object obj, Object obj2, Object obj3, int i10) {
        this.f44331a = i10;
        this.f44332b = obj;
        this.f44333c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f44331a;
        Object obj = this.d;
        Object obj2 = this.f44333c;
        Object obj3 = this.f44332b;
        switch (i10) {
            case 0:
                w.P((w) obj3, (boolean[]) obj2, (f6) obj);
                return;
            case 1:
                m2 m2Var = (m2) obj3;
                ((w70) obj2).u();
                wr0 wr0Var = m2Var.f44246a;
                e2 e2Var = new e2(m2Var, (TL_stars.SavedStarGift) obj, 0);
                HashMap hashMap = q2.T;
                wr0Var.h(null, e2Var);
                return;
            case 2:
                Context context = (Context) obj2;
                f6 f6Var = (f6) obj;
                if (((xh.a0) obj3).m0.f46926a == yf.b.f46928a) {
                    new p7(context, f6Var).show();
                    return;
                }
                return;
            case 3:
                final org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj2;
                final bi.d dVar = (bi.d) obj;
                h3Var.setCanDismissWithSwipe(false);
                dVar.setLoading(true);
                ((xh.w4) obj3).run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.h3 h3Var2 = h3Var;
                                if (booleanValue) {
                                    h3Var2.dismiss();
                                    return;
                                }
                                final bi.d dVar2 = dVar;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                h3Var2.setCanDismissWithSwipe(false);
                                                dVar2.setLoading(false);
                                                return;
                                            default:
                                                h3Var2.setCanDismissWithSwipe(false);
                                                dVar2.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.h3 h3Var3 = h3Var;
                                if (booleanValue2) {
                                    h3Var3.dismiss();
                                    return;
                                }
                                final bi.d dVar3 = dVar;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                h3Var3.setCanDismissWithSwipe(false);
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                h3Var3.setCanDismissWithSwipe(false);
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
            case 4:
                final org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) obj2;
                final bi.d dVar2 = (bi.d) obj;
                h3Var2.setCanDismissWithSwipe(false);
                dVar2.setLoading(true);
                ((h5) obj3).run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.h3 h3Var22 = h3Var2;
                                if (booleanValue) {
                                    h3Var22.dismiss();
                                    return;
                                }
                                final bi.d dVar22 = dVar2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                h3Var22.setCanDismissWithSwipe(false);
                                                dVar22.setLoading(false);
                                                return;
                                            default:
                                                h3Var22.setCanDismissWithSwipe(false);
                                                dVar22.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.h3 h3Var3 = h3Var2;
                                if (booleanValue2) {
                                    h3Var3.dismiss();
                                    return;
                                }
                                final bi.d dVar3 = dVar2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                h3Var3.setCanDismissWithSwipe(false);
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                h3Var3.setCanDismissWithSwipe(false);
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
            case 5:
                ((org.telegram.ui.web.y1) obj3).run(Long.valueOf(((long[]) obj2)[0]));
                ((org.telegram.ui.ActionBar.h3) obj).dismiss();
                return;
            case 6:
                zh.a3 a3Var = ((zh.v2) obj3).f48986l;
                a3Var.F0((pb) obj2, (TL_stories.StoryItem) obj);
                zh.v2 v2Var = a3Var.f48211t1;
                if (v2Var != null) {
                    v2Var.a();
                    return;
                }
                return;
            case 7:
                zh.v2 v2Var2 = (zh.v2) obj3;
                u7 u7Var = (u7) obj;
                ((org.telegram.ui.ActionBar.g1) obj2).performHapticFeedback(3);
                wc X = wc.X();
                if (X != null) {
                    X.Q(R.raw.ic_save_to_gallery, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new yg.q(11, v2Var2, u7Var))).j();
                    return;
                }
                return;
            default:
                zh.k3 k3Var = (zh.k3) obj3;
                bi.o1 o1Var = new bi.o1(k3Var, 12);
                zh.z3 z3Var = k3Var.f48586b;
                new wv(o1Var, z3Var.getContext(), z3Var.f49143s, (ArrayList) obj2).show();
                ((w70) obj).u();
                return;
        }
    }
}
