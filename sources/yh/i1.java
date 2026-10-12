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
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.w21;
public final class i1 implements Runnable {
    public final int f52899a;
    public final KeyEvent.Callback f52900b;
    public final Object f52901c;
    public final Object d;
    public final Object f52902e;

    public i1(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i10) {
        this.f52899a = i10;
        this.f52900b = callback;
        this.f52901c = obj;
        this.d = obj2;
        this.f52902e = obj3;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        switch (this.f52899a) {
            case 0:
                s3.S0((s3) this.f52900b, (TLObject) this.f52901c, (pi.i) this.d, (TLRPC.TL_error) this.f52902e);
                return;
            case 1:
                s3.T0((s3) this.f52900b, (MessageObject) this.f52901c, (ArrayList) this.d, (TL_stars.StarGift) this.f52902e);
                return;
            case 2:
                s3 s3Var = (s3) this.f52900b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f52902e;
                TLObject tLObject = (TLObject) this.f52901c;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.d;
                if (tL_error == null && (tLObject instanceof TLRPC.Updates)) {
                    s3Var.f53427r0 = true;
                    s3Var.f53418m1 = null;
                    s3Var.s1(inputSavedStarGift, (TLRPC.Updates) tLObject, new a1(s3Var, 5));
                    Utilities.stageQueue.postRunnable(new tg.y(22, s3Var, tLObject));
                    return;
                }
                s3Var.getBulletinFactory().f0(tL_error, false);
                return;
            default:
                t2 t2Var = (t2) this.f52900b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f52901c;
                ArrayList arrayList = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.f52902e;
                org.telegram.ui.Components.r6 r6Var = t2Var.H;
                t2Var.f53465h0 = false;
                if (starGift == null) {
                    ik0 ik0Var = t2Var.f53469l0;
                    if (ik0Var != null) {
                        ik0Var.d();
                        AndroidUtilities.runOnUIThread(new w21(21), 750L);
                    }
                    t2Var.Q.animate().alpha(0.0f).start();
                    t2Var.S.animate().alpha(1.0f).start();
                    t2Var.G.animate().alpha(1.0f).start();
                    t2Var.R.animate().alpha(0.0f).start();
                    t2Var.P.animate().alpha(1.0f).start();
                    t2Var.M.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList.size(), new Object[0])));
                    r6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                    r6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                    t2Var.I.setAlpha(0.0f);
                    if (t2Var.O != null) {
                        int i11 = 0;
                        while (true) {
                            xh.i1[] i1VarArr = t2Var.O;
                            if (i11 < i1VarArr.length) {
                                AndroidUtilities.removeFromParent(i1VarArr[i11]);
                                i11++;
                            } else {
                                t2Var.O = null;
                            }
                        }
                    }
                    t2Var.O = new xh.i1[arrayList.size()];
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList.get(i12);
                        xh.i1 i1Var = new xh.i1(t2Var.getContext(), t2Var.W, t2Var.f53453a);
                        i1Var.g(starGift2, false, false, false, false, true);
                        i1Var.f51537x.setVisibility(8);
                        i1Var.setRibbonColor(-3065286);
                        y9 y9Var = i1Var.f51538y;
                        FrameLayout.LayoutParams e7 = w7.w5.e(42, 42, 17);
                        i1Var.E = e7;
                        y9Var.setLayoutParams(e7);
                        int i13 = i12 + 1;
                        if (i13 >= arrayList.size()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        LinearLayout linearLayout = t2Var.N;
                        t2Var.O[i12] = i1Var;
                        if (z10) {
                            i10 = 0;
                        } else {
                            i10 = 6;
                        }
                        linearLayout.addView(i1Var, w7.w5.p(74, 74, 0.0f, 51, 0, 0, i10, 0));
                        i12 = i13;
                    }
                    return;
                }
                AndroidUtilities.runOnUIThread(runnable);
                return;
        }
    }

    public i1(TLObject tLObject, TLRPC.TL_error tL_error, TL_stars.InputSavedStarGift inputSavedStarGift, s3 s3Var) {
        this.f52899a = 2;
        this.f52900b = s3Var;
        this.f52902e = tL_error;
        this.f52901c = tLObject;
        this.d = inputSavedStarGift;
    }
}
