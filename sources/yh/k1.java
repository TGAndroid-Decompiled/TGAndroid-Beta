package yh;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.u9;
import org.telegram.ui.o91;
public final class k1 implements Runnable {
    public final int f47301a;
    public final KeyEvent.Callback f47302b;
    public final Object f47303c;
    public final Object d;
    public final TLObject e;

    public k1(z2 z2Var, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable) {
        this.f47301a = 2;
        this.f47302b = z2Var;
        this.e = starGift;
        this.d = arrayList;
        this.f47303c = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        switch (this.f47301a) {
            case 0:
                z3.S0((z3) this.f47302b, (MessageObject) this.f47303c, (ArrayList) this.d, (TL_stars.StarGift) this.e);
                return;
            case 1:
                z3 z3Var = (z3) this.f47302b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f47303c;
                TLObject tLObject = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                if (tL_error == null && (tLObject instanceof TLRPC.Updates)) {
                    z3Var.f48041q0 = true;
                    z3Var.l1 = null;
                    z3Var.r1(inputSavedStarGift, (TLRPC.Updates) tLObject, new b1(z3Var, 5));
                    Utilities.stageQueue.postRunnable(new uh.i(13, z3Var, tLObject));
                    return;
                }
                z3Var.getBulletinFactory().d0(tL_error, false);
                return;
            default:
                z2 z2Var = (z2) this.f47302b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                ArrayList arrayList = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.f47303c;
                org.telegram.ui.Components.n6 n6Var = z2Var.H;
                z2Var.f47999h0 = false;
                if (starGift == null) {
                    aj0 aj0Var = z2Var.f48003l0;
                    if (aj0Var != null) {
                        aj0Var.d();
                        AndroidUtilities.runOnUIThread(new o91(17), 750L);
                    }
                    z2Var.Q.animate().alpha(0.0f).start();
                    z2Var.S.animate().alpha(1.0f).start();
                    z2Var.G.animate().alpha(1.0f).start();
                    z2Var.R.animate().alpha(0.0f).start();
                    z2Var.P.animate().alpha(1.0f).start();
                    z2Var.M.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList.size(), new Object[0])));
                    n6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                    n6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                    z2Var.I.setAlpha(0.0f);
                    if (z2Var.O != null) {
                        int i11 = 0;
                        while (true) {
                            xh.i1[] i1VarArr = z2Var.O;
                            if (i11 < i1VarArr.length) {
                                AndroidUtilities.removeFromParent(i1VarArr[i11]);
                                i11++;
                            } else {
                                z2Var.O = null;
                            }
                        }
                    }
                    z2Var.O = new xh.i1[arrayList.size()];
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList.get(i12);
                        xh.i1 i1Var = new xh.i1(z2Var.getContext(), z2Var.W, z2Var.f47988a);
                        i1Var.g(starGift2, false, false, false, false, true);
                        i1Var.f45920x.setVisibility(8);
                        i1Var.setRibbonColor(-3065286);
                        u9 u9Var = i1Var.f45921y;
                        FrameLayout.LayoutParams e = w7.x5.e(42, 42, 17);
                        i1Var.E = e;
                        u9Var.setLayoutParams(e);
                        int i13 = i12 + 1;
                        if (i13 >= arrayList.size()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        LinearLayout linearLayout = z2Var.N;
                        z2Var.O[i12] = i1Var;
                        if (z10) {
                            i10 = 0;
                        } else {
                            i10 = 6;
                        }
                        linearLayout.addView(i1Var, w7.x5.p(74, 74, 0.0f, 51, 0, 0, i10, 0));
                        i12 = i13;
                    }
                    return;
                }
                AndroidUtilities.runOnUIThread(runnable);
                return;
        }
    }

    public k1(z3 z3Var, Object obj, Object obj2, TLObject tLObject, int i10) {
        this.f47301a = i10;
        this.f47302b = z3Var;
        this.f47303c = obj;
        this.d = obj2;
        this.e = tLObject;
    }
}
