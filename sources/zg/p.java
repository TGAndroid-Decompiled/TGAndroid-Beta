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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.a71;
import yh.r5;
public final class p extends a71 {
    public boolean f49387d2;
    public final q f49388e2;

    public p(q qVar, q qVar2, Activity activity, d6 d6Var, int i10) {
        super(qVar2, activity, false, null, 6, false, d6Var, 16, i10);
        this.f49388e2 = qVar;
        this.f49387d2 = true;
        setDrawBackground(false);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f49387d2) {
            this.f49387d2 = false;
            this.f49388e2.f49415b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        q qVar = this.f49388e2;
        int i10 = qVar.J;
        ArrayList arrayList = qVar.F;
        LinkedHashMap linkedHashMap = qVar.E;
        if (linkedHashMap.containsKey(l4)) {
            arrayList.remove(l4);
            z5 z5Var = (z5) linkedHashMap.remove(l4);
            z5Var.setRemoved(new r5(5, this, z5Var));
            qVar.W(z5Var);
            qVar.f49415b.x(l4, true);
            qVar.Y(false);
        } else if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i10) {
            yc.a0(qVar).t(LocaleController.formatPluralString("ReactionMaxCountError", i10, new Object[0]), null).j();
        } else {
            try {
                int editTextSelectionEnd = qVar.f49418n.getEditTextSelectionEnd();
                SpannableString spannableString = new SpannableString("b");
                z5 e = q0.e(document, l4, qVar.f49418n.getFontMetricsInt());
                e.cacheType = q5.g();
                e.setAdded();
                arrayList.add(w7.q.b(editTextSelectionEnd, 0, arrayList.size()), l4);
                linkedHashMap.put(l4, e);
                spannableString.setSpan(e, 0, spannableString.length(), 33);
                qVar.f49418n.getText().insert(editTextSelectionEnd, spannableString);
                qVar.f49418n.setSelection(editTextSelectionEnd + spannableString.length());
                qVar.f49415b.x(l4, true);
                qVar.Y(true);
                qVar.W(e);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }
}
