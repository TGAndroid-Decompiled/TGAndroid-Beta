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
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.u9;
import org.telegram.ui.p91;
public final class k1 implements Runnable {
    public final int f47384a;
    public final KeyEvent.Callback f47385b;
    public final Object f47386c;
    public final Object d;
    public final TLObject e;

    public k1(a3 a3Var, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable) {
        this.f47384a = 2;
        this.f47385b = a3Var;
        this.e = starGift;
        this.d = arrayList;
        this.f47386c = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        switch (this.f47384a) {
            case 0:
                a4.S0((a4) this.f47385b, (MessageObject) this.f47386c, (ArrayList) this.d, (TL_stars.StarGift) this.e);
                return;
            case 1:
                a4 a4Var = (a4) this.f47385b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f47386c;
                TLObject tLObject = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                if (tL_error == null && (tLObject instanceof TLRPC.Updates)) {
                    a4Var.f46998q0 = true;
                    a4Var.l1 = null;
                    a4Var.r1(inputSavedStarGift, (TLRPC.Updates) tLObject, new b1(a4Var, 5));
                    Utilities.stageQueue.postRunnable(new uh.i(13, a4Var, tLObject));
                    return;
                }
                a4Var.getBulletinFactory().d0(tL_error, false);
                return;
            default:
                a3 a3Var = (a3) this.f47385b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                ArrayList arrayList = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.f47386c;
                org.telegram.ui.Components.n6 n6Var = a3Var.H;
                a3Var.f46956h0 = false;
                if (starGift == null) {
                    bj0 bj0Var = a3Var.f46960l0;
                    if (bj0Var != null) {
                        bj0Var.d();
                        AndroidUtilities.runOnUIThread(new p91(17), 750L);
                    }
                    a3Var.Q.animate().alpha(0.0f).start();
                    a3Var.S.animate().alpha(1.0f).start();
                    a3Var.G.animate().alpha(1.0f).start();
                    a3Var.R.animate().alpha(0.0f).start();
                    a3Var.P.animate().alpha(1.0f).start();
                    a3Var.M.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList.size(), new Object[0])));
                    n6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                    n6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                    a3Var.I.setAlpha(0.0f);
                    if (a3Var.O != null) {
                        int i11 = 0;
                        while (true) {
                            xh.i1[] i1VarArr = a3Var.O;
                            if (i11 < i1VarArr.length) {
                                AndroidUtilities.removeFromParent(i1VarArr[i11]);
                                i11++;
                            } else {
                                a3Var.O = null;
                            }
                        }
                    }
                    a3Var.O = new xh.i1[arrayList.size()];
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList.get(i12);
                        xh.i1 i1Var = new xh.i1(a3Var.getContext(), a3Var.W, a3Var.f46945a);
                        i1Var.g(starGift2, false, false, false, false, true);
                        i1Var.f45947x.setVisibility(8);
                        i1Var.setRibbonColor(-3065286);
                        u9 u9Var = i1Var.f45948y;
                        FrameLayout.LayoutParams e = w7.x5.e(42, 42, 17);
                        i1Var.E = e;
                        u9Var.setLayoutParams(e);
                        int i13 = i12 + 1;
                        if (i13 >= arrayList.size()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        LinearLayout linearLayout = a3Var.N;
                        a3Var.O[i12] = i1Var;
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

    public k1(a4 a4Var, Object obj, Object obj2, TLObject tLObject, int i10) {
        this.f47384a = i10;
        this.f47385b = a4Var;
        this.f47386c = obj;
        this.d = obj2;
        this.e = tLObject;
    }
}
