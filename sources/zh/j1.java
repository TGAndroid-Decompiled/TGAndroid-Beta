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
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.z9;
import org.telegram.ui.b31;
public final class j1 implements Runnable {
    public final int f50688a;
    public final KeyEvent.Callback f50689b;
    public final Object f50690c;
    public final Object d;
    public final TLObject e;

    public j1(s2 s2Var, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable) {
        this.f50688a = 2;
        this.f50689b = s2Var;
        this.e = starGift;
        this.d = arrayList;
        this.f50690c = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        switch (this.f50688a) {
            case 0:
                r3.T0((r3) this.f50689b, (MessageObject) this.f50690c, (ArrayList) this.d, (TL_stars.StarGift) this.e);
                return;
            case 1:
                r3 r3Var = (r3) this.f50689b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f50690c;
                TLObject tLObject = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                if (tL_error == null && (tLObject instanceof TLRPC.Updates)) {
                    r3Var.f51101r0 = true;
                    r3Var.f51092m1 = null;
                    r3Var.s1(inputSavedStarGift, (TLRPC.Updates) tLObject, new a1(r3Var, 5));
                    Utilities.stageQueue.postRunnable(new m(4, r3Var, tLObject));
                    return;
                }
                r3Var.getBulletinFactory().f0(tL_error, false);
                return;
            default:
                s2 s2Var = (s2) this.f50689b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                ArrayList arrayList = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.f50690c;
                org.telegram.ui.Components.s6 s6Var = s2Var.H;
                s2Var.f51145h0 = false;
                if (starGift == null) {
                    bk0 bk0Var = s2Var.f51149l0;
                    if (bk0Var != null) {
                        bk0Var.d();
                        AndroidUtilities.runOnUIThread(new b31(22), 750L);
                    }
                    s2Var.Q.animate().alpha(0.0f).start();
                    s2Var.S.animate().alpha(1.0f).start();
                    s2Var.G.animate().alpha(1.0f).start();
                    s2Var.R.animate().alpha(0.0f).start();
                    s2Var.P.animate().alpha(1.0f).start();
                    s2Var.M.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList.size(), new Object[0])));
                    s6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                    s6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                    s2Var.I.setAlpha(0.0f);
                    if (s2Var.O != null) {
                        int i11 = 0;
                        while (true) {
                            yh.h1[] h1VarArr = s2Var.O;
                            if (i11 < h1VarArr.length) {
                                AndroidUtilities.removeFromParent(h1VarArr[i11]);
                                i11++;
                            } else {
                                s2Var.O = null;
                            }
                        }
                    }
                    s2Var.O = new yh.h1[arrayList.size()];
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList.get(i12);
                        yh.h1 h1Var = new yh.h1(s2Var.getContext(), s2Var.W, s2Var.f51134a);
                        h1Var.g(starGift2, false, false, false, false, true);
                        h1Var.f48910x.setVisibility(8);
                        h1Var.setRibbonColor(-3065286);
                        z9 z9Var = h1Var.f48911y;
                        FrameLayout.LayoutParams e = w7.z5.e(42, 42, 17);
                        h1Var.E = e;
                        z9Var.setLayoutParams(e);
                        int i13 = i12 + 1;
                        if (i13 >= arrayList.size()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        LinearLayout linearLayout = s2Var.N;
                        s2Var.O[i12] = h1Var;
                        if (z10) {
                            i10 = 0;
                        } else {
                            i10 = 6;
                        }
                        linearLayout.addView(h1Var, w7.z5.p(74, 74, 0.0f, 51, 0, 0, i10, 0));
                        i12 = i13;
                    }
                    return;
                }
                AndroidUtilities.runOnUIThread(runnable);
                return;
        }
    }

    public j1(r3 r3Var, Object obj, Object obj2, TLObject tLObject, int i10) {
        this.f50688a = i10;
        this.f50689b = r3Var;
        this.f50690c = obj;
        this.d = obj2;
        this.e = tLObject;
    }
}
