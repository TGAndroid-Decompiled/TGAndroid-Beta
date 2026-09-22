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
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.v9;
import org.telegram.ui.u21;
public final class k1 implements Runnable {
    public final int f47643a;
    public final KeyEvent.Callback f47644b;
    public final Object f47645c;
    public final Object d;
    public final TLObject e;

    public k1(y2 y2Var, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable) {
        this.f47643a = 2;
        this.f47644b = y2Var;
        this.e = starGift;
        this.d = arrayList;
        this.f47645c = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        switch (this.f47643a) {
            case 0:
                y3.S0((y3) this.f47644b, (MessageObject) this.f47645c, (ArrayList) this.d, (TL_stars.StarGift) this.e);
                return;
            case 1:
                y3 y3Var = (y3) this.f47644b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f47645c;
                TLObject tLObject = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                if (tL_error == null && (tLObject instanceof TLRPC.Updates)) {
                    y3Var.f48350q0 = true;
                    y3Var.l1 = null;
                    y3Var.r1(inputSavedStarGift, (TLRPC.Updates) tLObject, new b1(y3Var, 5));
                    Utilities.stageQueue.postRunnable(new u2.j0(19, y3Var, tLObject));
                    return;
                }
                y3Var.getBulletinFactory().d0(tL_error, false);
                return;
            default:
                y2 y2Var = (y2) this.f47644b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                ArrayList arrayList = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.f47645c;
                org.telegram.ui.Components.o6 o6Var = y2Var.H;
                y2Var.f48308h0 = false;
                if (starGift == null) {
                    nj0 nj0Var = y2Var.f48312l0;
                    if (nj0Var != null) {
                        nj0Var.d();
                        AndroidUtilities.runOnUIThread(new u21(19), 750L);
                    }
                    y2Var.Q.animate().alpha(0.0f).start();
                    y2Var.S.animate().alpha(1.0f).start();
                    y2Var.G.animate().alpha(1.0f).start();
                    y2Var.R.animate().alpha(0.0f).start();
                    y2Var.P.animate().alpha(1.0f).start();
                    y2Var.M.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList.size(), new Object[0])));
                    o6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                    o6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                    y2Var.I.setAlpha(0.0f);
                    if (y2Var.O != null) {
                        int i11 = 0;
                        while (true) {
                            xh.j1[] j1VarArr = y2Var.O;
                            if (i11 < j1VarArr.length) {
                                AndroidUtilities.removeFromParent(j1VarArr[i11]);
                                i11++;
                            } else {
                                y2Var.O = null;
                            }
                        }
                    }
                    y2Var.O = new xh.j1[arrayList.size()];
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList.get(i12);
                        xh.j1 j1Var = new xh.j1(y2Var.getContext(), y2Var.W, y2Var.f48297a);
                        j1Var.g(starGift2, false, false, false, false, true);
                        j1Var.f46263x.setVisibility(8);
                        j1Var.setRibbonColor(-3065286);
                        v9 v9Var = j1Var.f46264y;
                        FrameLayout.LayoutParams e = w7.y5.e(42, 42, 17);
                        j1Var.E = e;
                        v9Var.setLayoutParams(e);
                        int i13 = i12 + 1;
                        if (i13 >= arrayList.size()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        LinearLayout linearLayout = y2Var.N;
                        y2Var.O[i12] = j1Var;
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

    public k1(y3 y3Var, Object obj, Object obj2, TLObject tLObject, int i10) {
        this.f47643a = i10;
        this.f47644b = y3Var;
        this.f47645c = obj;
        this.d = obj2;
        this.e = tLObject;
    }
}
