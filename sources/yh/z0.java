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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.n21;
public final class z0 implements Runnable {
    public final int f52335a;
    public final KeyEvent.Callback f52336b;
    public final Object f52337c;
    public final Object d;
    public final Object f52338e;

    public z0(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i10) {
        this.f52335a = i10;
        this.f52336b = callback;
        this.f52337c = obj;
        this.d = obj2;
        this.f52338e = obj3;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        switch (this.f52335a) {
            case 0:
                y3.Y((y3) this.f52336b, (boolean[]) this.f52337c, (TL_stars.StarGiftAttribute) this.d, (ad[]) this.f52338e);
                return;
            case 1:
                y3.R0((y3) this.f52336b, (TLObject) this.f52337c, (tg.q) this.d, (TLRPC.TL_error) this.f52338e);
                return;
            case 2:
                y3.S0((y3) this.f52336b, (MessageObject) this.f52337c, (ArrayList) this.d, (TL_stars.StarGift) this.f52338e);
                return;
            case 3:
                y3 y3Var = (y3) this.f52336b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f52337c;
                TLObject tLObject = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f52338e;
                if (tL_error == null && (tLObject instanceof TLRPC.Updates)) {
                    y3Var.f52310q0 = true;
                    y3Var.l1 = null;
                    y3Var.r1(inputSavedStarGift, (TLRPC.Updates) tLObject, new d1(y3Var, 5));
                    Utilities.stageQueue.postRunnable(new u2.i0(19, y3Var, tLObject));
                    return;
                }
                y3Var.getBulletinFactory().d0(tL_error, false);
                return;
            default:
                y2 y2Var = (y2) this.f52336b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f52337c;
                ArrayList arrayList = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.f52338e;
                org.telegram.ui.Components.p6 p6Var = y2Var.H;
                y2Var.f52268h0 = false;
                if (starGift == null) {
                    nj0 nj0Var = y2Var.f52272l0;
                    if (nj0Var != null) {
                        nj0Var.d();
                        AndroidUtilities.runOnUIThread(new n21(19), 750L);
                    }
                    y2Var.Q.animate().alpha(0.0f).start();
                    y2Var.S.animate().alpha(1.0f).start();
                    y2Var.G.animate().alpha(1.0f).start();
                    y2Var.R.animate().alpha(0.0f).start();
                    y2Var.P.animate().alpha(1.0f).start();
                    y2Var.M.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList.size(), new Object[0])));
                    p6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                    p6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                    y2Var.I.setAlpha(0.0f);
                    if (y2Var.O != null) {
                        int i11 = 0;
                        while (true) {
                            xh.i1[] i1VarArr = y2Var.O;
                            if (i11 < i1VarArr.length) {
                                AndroidUtilities.removeFromParent(i1VarArr[i11]);
                                i11++;
                            } else {
                                y2Var.O = null;
                            }
                        }
                    }
                    y2Var.O = new xh.i1[arrayList.size()];
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList.get(i12);
                        xh.i1 i1Var = new xh.i1(y2Var.getContext(), y2Var.W, y2Var.f52256a);
                        i1Var.g(starGift2, false, false, false, false, true);
                        i1Var.f50020x.setVisibility(8);
                        i1Var.setRibbonColor(-3065286);
                        w9 w9Var = i1Var.f50021y;
                        FrameLayout.LayoutParams e7 = w7.z5.e(42, 42, 17);
                        i1Var.E = e7;
                        w9Var.setLayoutParams(e7);
                        int i13 = i12 + 1;
                        if (i13 >= arrayList.size()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        LinearLayout linearLayout = y2Var.N;
                        y2Var.O[i12] = i1Var;
                        if (z10) {
                            i10 = 0;
                        } else {
                            i10 = 6;
                        }
                        linearLayout.addView(i1Var, w7.z5.p(74, 74, 0.0f, 51, 0, 0, i10, 0));
                        i12 = i13;
                    }
                    return;
                }
                AndroidUtilities.runOnUIThread(runnable);
                return;
        }
    }
}
