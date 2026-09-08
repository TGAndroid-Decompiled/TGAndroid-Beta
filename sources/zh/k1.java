package zh;

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
import org.telegram.ui.Components.x9;
import org.telegram.ui.q31;
public final class k1 implements Runnable {
    public final int f52157a;
    public final KeyEvent.Callback f52158b;
    public final Object f52159c;
    public final Object d;
    public final TLObject f52160e;

    public k1(x2 x2Var, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable) {
        this.f52157a = 2;
        this.f52158b = x2Var;
        this.f52160e = starGift;
        this.d = arrayList;
        this.f52159c = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        switch (this.f52157a) {
            case 0:
                w3.S0((w3) this.f52158b, (MessageObject) this.f52159c, (ArrayList) this.d, (TL_stars.StarGift) this.f52160e);
                return;
            case 1:
                w3 w3Var = (w3) this.f52158b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f52159c;
                TLObject tLObject = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f52160e;
                if (tL_error == null && (tLObject instanceof TLRPC.Updates)) {
                    w3Var.f52816q0 = true;
                    w3Var.l1 = null;
                    w3Var.r1(inputSavedStarGift, (TLRPC.Updates) tLObject, new b1(w3Var, 5));
                    Utilities.stageQueue.postRunnable(new ug.r(19, w3Var, tLObject));
                    return;
                }
                w3Var.getBulletinFactory().d0(tL_error, false);
                return;
            default:
                x2 x2Var = (x2) this.f52158b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f52160e;
                ArrayList arrayList = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.f52159c;
                org.telegram.ui.Components.q6 q6Var = x2Var.H;
                x2Var.f52862h0 = false;
                if (starGift == null) {
                    aj0 aj0Var = x2Var.f52866l0;
                    if (aj0Var != null) {
                        aj0Var.d();
                        AndroidUtilities.runOnUIThread(new q31(18), 750L);
                    }
                    x2Var.Q.animate().alpha(0.0f).start();
                    x2Var.S.animate().alpha(1.0f).start();
                    x2Var.G.animate().alpha(1.0f).start();
                    x2Var.R.animate().alpha(0.0f).start();
                    x2Var.P.animate().alpha(1.0f).start();
                    x2Var.M.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList.size(), new Object[0])));
                    q6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                    q6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                    x2Var.I.setAlpha(0.0f);
                    if (x2Var.O != null) {
                        int i11 = 0;
                        while (true) {
                            yh.h1[] h1VarArr = x2Var.O;
                            if (i11 < h1VarArr.length) {
                                AndroidUtilities.removeFromParent(h1VarArr[i11]);
                                i11++;
                            } else {
                                x2Var.O = null;
                            }
                        }
                    }
                    x2Var.O = new yh.h1[arrayList.size()];
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList.get(i12);
                        yh.h1 h1Var = new yh.h1(x2Var.getContext(), x2Var.W, x2Var.f52850a);
                        h1Var.g(starGift2, false, false, false, false, true);
                        h1Var.f50355x.setVisibility(8);
                        h1Var.setRibbonColor(-3065286);
                        x9 x9Var = h1Var.f50356y;
                        FrameLayout.LayoutParams e7 = w7.x5.e(42, 42, 17);
                        h1Var.E = e7;
                        x9Var.setLayoutParams(e7);
                        int i13 = i12 + 1;
                        if (i13 >= arrayList.size()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        LinearLayout linearLayout = x2Var.N;
                        x2Var.O[i12] = h1Var;
                        if (z10) {
                            i10 = 0;
                        } else {
                            i10 = 6;
                        }
                        linearLayout.addView(h1Var, w7.x5.p(74, 74, 0.0f, 51, 0, 0, i10, 0));
                        i12 = i13;
                    }
                    return;
                }
                AndroidUtilities.runOnUIThread(runnable);
                return;
        }
    }

    public k1(w3 w3Var, Object obj, Object obj2, TLObject tLObject, int i10) {
        this.f52157a = i10;
        this.f52158b = w3Var;
        this.f52159c = obj;
        this.d = obj2;
        this.f52160e = tLObject;
    }
}
