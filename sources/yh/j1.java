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
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.l21;
public final class j1 implements Runnable {
    public final int f47543a;
    public final KeyEvent.Callback f47544b;
    public final Object f47545c;
    public final Object d;
    public final Object e;

    public j1(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i10) {
        this.f47543a = i10;
        this.f47544b = callback;
        this.f47545c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        switch (this.f47543a) {
            case 0:
                x3.R0((x3) this.f47544b, (TLObject) this.f47545c, (tg.r) this.d, (TLRPC.TL_error) this.e);
                return;
            case 1:
                x3.S0((x3) this.f47544b, (MessageObject) this.f47545c, (ArrayList) this.d, (TL_stars.StarGift) this.e);
                return;
            case 2:
                x3 x3Var = (x3) this.f47544b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject = (TLObject) this.f47545c;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.d;
                if (tL_error == null && (tLObject instanceof TLRPC.Updates)) {
                    x3Var.f48259q0 = true;
                    x3Var.l1 = null;
                    x3Var.r1(inputSavedStarGift, (TLRPC.Updates) tLObject, new b1(x3Var, 5));
                    Utilities.stageQueue.postRunnable(new u2.p0(18, x3Var, tLObject));
                    return;
                }
                x3Var.getBulletinFactory().d0(tL_error, false);
                return;
            default:
                x2 x2Var = (x2) this.f47544b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f47545c;
                ArrayList arrayList = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.Components.p6 p6Var = x2Var.H;
                x2Var.f48217h0 = false;
                if (starGift == null) {
                    lj0 lj0Var = x2Var.f48221l0;
                    if (lj0Var != null) {
                        lj0Var.d();
                        AndroidUtilities.runOnUIThread(new l21(19), 750L);
                    }
                    x2Var.Q.animate().alpha(0.0f).start();
                    x2Var.S.animate().alpha(1.0f).start();
                    x2Var.G.animate().alpha(1.0f).start();
                    x2Var.R.animate().alpha(0.0f).start();
                    x2Var.P.animate().alpha(1.0f).start();
                    x2Var.M.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList.size(), new Object[0])));
                    p6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                    p6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                    x2Var.I.setAlpha(0.0f);
                    if (x2Var.O != null) {
                        int i11 = 0;
                        while (true) {
                            xh.j1[] j1VarArr = x2Var.O;
                            if (i11 < j1VarArr.length) {
                                AndroidUtilities.removeFromParent(j1VarArr[i11]);
                                i11++;
                            } else {
                                x2Var.O = null;
                            }
                        }
                    }
                    x2Var.O = new xh.j1[arrayList.size()];
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList.get(i12);
                        xh.j1 j1Var = new xh.j1(x2Var.getContext(), x2Var.W, x2Var.f48206a);
                        j1Var.g(starGift2, false, false, false, false, true);
                        j1Var.f46223x.setVisibility(8);
                        j1Var.setRibbonColor(-3065286);
                        w9 w9Var = j1Var.f46224y;
                        FrameLayout.LayoutParams e = w7.y5.e(42, 42, 17);
                        j1Var.E = e;
                        w9Var.setLayoutParams(e);
                        int i13 = i12 + 1;
                        if (i13 >= arrayList.size()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        LinearLayout linearLayout = x2Var.N;
                        x2Var.O[i12] = j1Var;
                        if (z10) {
                            i10 = 0;
                        } else {
                            i10 = 6;
                        }
                        linearLayout.addView(j1Var, w7.y5.p(74, 74, 0.0f, 51, 0, 0, i10, 0));
                        i12 = i13;
                    }
                    return;
                }
                AndroidUtilities.runOnUIThread(runnable);
                return;
        }
    }

    public j1(TLObject tLObject, TLRPC.TL_error tL_error, TL_stars.InputSavedStarGift inputSavedStarGift, x3 x3Var) {
        this.f47543a = 2;
        this.f47544b = x3Var;
        this.e = tL_error;
        this.f47545c = tLObject;
        this.d = inputSavedStarGift;
    }
}
