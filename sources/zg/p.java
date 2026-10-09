package zg;

import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.s5;
import org.telegram.ui.k71;
import yh.t5;
public final class p extends k71 {
    public boolean f54645d2;
    public final q f54646e2;

    public p(q qVar, q qVar2, Activity activity, e6 e6Var, int i10) {
        super(qVar2, activity, false, null, 6, false, e6Var, 16, i10);
        this.f54646e2 = qVar;
        this.f54645d2 = true;
        setDrawBackground(false);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f54645d2) {
            this.f54645d2 = false;
            this.f54646e2.f54648b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        q qVar = this.f54646e2;
        int i10 = qVar.J;
        ArrayList arrayList = qVar.F;
        LinkedHashMap linkedHashMap = qVar.E;
        if (linkedHashMap.containsKey(l4)) {
            arrayList.remove(l4);
            b6 b6Var = (b6) linkedHashMap.remove(l4);
            b6Var.setRemoved(new t5(4, this, b6Var));
            qVar.W(b6Var);
            qVar.f54648b.x(l4, true);
            qVar.Y(false);
        } else if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i10) {
            ad.a0(qVar).t(LocaleController.formatPluralString("ReactionMaxCountError", i10, new Object[0]), null).j();
        } else {
            try {
                int editTextSelectionEnd = qVar.f54652n.getEditTextSelectionEnd();
                SpannableString spannableString = new SpannableString("b");
                b6 e7 = p0.e(document, l4, qVar.f54652n.getFontMetricsInt());
                e7.cacheType = s5.g();
                e7.setAdded();
                arrayList.add(w7.o.b(editTextSelectionEnd, 0, arrayList.size()), l4);
                linkedHashMap.put(l4, e7);
                spannableString.setSpan(e7, 0, spannableString.length(), 33);
                qVar.f54652n.getText().insert(editTextSelectionEnd, spannableString);
                qVar.f54652n.setSelection(editTextSelectionEnd + spannableString.length());
                qVar.f54648b.x(l4, true);
                qVar.Y(true);
                qVar.W(e7);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }
}
