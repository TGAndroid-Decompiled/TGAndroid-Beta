package yh;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ml0;
public final class e5 implements Runnable {
    public final int f52520a;
    public final Object f52521b;
    public final Object f52522c;

    public e5(int i10, Object obj, Object obj2) {
        this.f52520a = i10;
        this.f52522c = obj;
        this.f52521b = obj2;
    }

    @Override
    public final void run() {
        int i10 = this.f52520a;
        int i11 = 0;
        Object obj = this.f52521b;
        Object obj2 = this.f52522c;
        switch (i10) {
            case 0:
                f5 f5Var = (f5) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = f5Var.f52606l;
                int i12 = f5Var.f52597a;
                if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                    MessagesController.getInstance(i12).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i12).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i13 = 0;
                        while (i13 < arrayList.size() && ((TL_stars.SavedStarGift) arrayList.get(i13)).pinned_to_top) {
                            i13++;
                        }
                        arrayList.add(i13, savedStarGift);
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(f5Var.f52598b), f5Var);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((MessagesController) obj2).lambda$processUpdates$377((TLRPC.Updates) ((TLObject) obj), false);
                return;
            case 2:
                new ad(((org.telegram.ui.ActionBar.e3[]) obj2)[0].topBulletinContainer, (org.telegram.ui.ActionBar.d6) obj).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            case 3:
                h8 h8Var = (h8) obj2;
                h8Var.S = true;
                h8Var.q(new k5((m5) obj, 2));
                AndroidUtilities.runOnUIThread(new q7(h8Var, 1), 240L);
                return;
            case 4:
                zg.q qVar = (zg.q) obj2;
                org.telegram.ui.Components.b6 b6Var = (org.telegram.ui.Components.b6) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qVar.f54739n.getText());
                org.telegram.ui.Components.b6[] b6VarArr = (org.telegram.ui.Components.b6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.b6.class);
                int length = b6VarArr.length;
                while (i11 < length) {
                    org.telegram.ui.Components.b6 b6Var2 = b6VarArr[i11];
                    if (b6Var2 == b6Var) {
                        int editTextSelectionEnd = qVar.f54739n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(b6Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(b6Var2);
                        qVar.f54739n.getText().delete(spanStart, spanEnd);
                        int i14 = spanEnd - spanStart;
                        zg.o oVar = qVar.f54739n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i14;
                        }
                        oVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                    i11++;
                }
                return;
            case 5:
                zg.q qVar2 = (zg.q) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (qVar2.Q != null && tL_error.text.equals("BOOSTS_REQUIRED")) {
                    zg.p0.f(-qVar2.M, qVar2.R, qVar2.Q);
                    return;
                }
                String str = tL_error.text;
                if (str.equals("REACTIONS_TOO_MANY")) {
                    str = LocaleController.formatPluralString("ReactionMaxCountError", qVar2.J, new Object[0]);
                }
                ad.a0(qVar2).t(str, null).j();
                return;
            case 6:
                org.telegram.ui.Components.b6 b6Var3 = (org.telegram.ui.Components.b6) obj;
                zg.q qVar3 = ((zg.p) obj2).f54733e2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(qVar3.f54739n.getText());
                org.telegram.ui.Components.b6[] b6VarArr2 = (org.telegram.ui.Components.b6[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.b6.class);
                int length2 = b6VarArr2.length;
                while (i11 < length2) {
                    org.telegram.ui.Components.b6 b6Var4 = b6VarArr2[i11];
                    if (b6Var4 == b6Var3) {
                        int editTextSelectionEnd2 = qVar3.f54739n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(b6Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(b6Var4);
                        qVar3.f54739n.getText().delete(spanStart2, spanEnd2);
                        int i15 = spanEnd2 - spanStart2;
                        zg.o oVar2 = qVar3.f54739n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i15;
                        }
                        oVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                    i11++;
                }
                return;
            case 7:
                zg.a0 a0Var = (zg.a0) obj2;
                ml0 ml0Var = (ml0) obj;
                a0Var.f54545l = true;
                a0Var.f54536a.invalidate();
                ml0Var.f28755b1 = false;
                ml0Var.invalidate();
                a0Var.c(true);
                return;
            case 8:
                zg.c0 c0Var = (zg.c0) obj2;
                zg.b bVar = (zg.b) obj;
                c0Var.getText().delete(c0Var.getText().getSpanStart(bVar), c0Var.getText().getSpanEnd(bVar));
                c0Var.setCursorVisible(true);
                c0Var.setLongClickable(true);
                return;
            default:
                zg.o0 o0Var = (zg.o0) obj2;
                zg.l0 l0Var = (zg.l0) obj;
                o0Var.getClass();
                TLRPC.ReactionCount reactionCount = l0Var.f54667a;
                org.telegram.ui.Cells.a0 a0Var2 = o0Var.f54731z;
                if (com.google.android.gms.internal.vision.e2.t(a0Var2)) {
                    ((org.telegram.ui.Cells.o4) a0Var2).f(reactionCount, true, 0.0f, 0.0f);
                }
                l0Var.Y.c(false);
                o0Var.S = null;
                o0Var.T = false;
                o0Var.U = null;
                return;
        }
    }
}
