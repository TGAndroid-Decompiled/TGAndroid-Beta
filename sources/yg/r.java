package yg;

import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y5;
import org.telegram.ui.l71;
public final class r extends l71 {
    public boolean f47131d2;
    public final s f47132e2;

    public r(s sVar, s sVar2, Activity activity, f6 f6Var, int i10) {
        super(sVar2, activity, false, null, 6, false, f6Var, 16, i10);
        this.f47132e2 = sVar;
        this.f47131d2 = true;
        setDrawBackground(false);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f47131d2) {
            this.f47131d2 = false;
            this.f47132e2.f47134b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        s sVar = this.f47132e2;
        int i10 = sVar.J;
        ArrayList arrayList = sVar.F;
        LinkedHashMap linkedHashMap = sVar.E;
        if (linkedHashMap.containsKey(l4)) {
            arrayList.remove(l4);
            y5 y5Var = (y5) linkedHashMap.remove(l4);
            y5Var.setRemoved(new q(0, this, y5Var));
            sVar.W(y5Var);
            sVar.f47134b.x(l4, true);
            sVar.Y(false);
        } else if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i10) {
            wc.a0(sVar).t(LocaleController.formatPluralString("ReactionMaxCountError", i10, new Object[0]), null).j();
        } else {
            try {
                int editTextSelectionEnd = sVar.f47137n.getEditTextSelectionEnd();
                SpannableString spannableString = new SpannableString("b");
                y5 e = r0.e(document, l4, sVar.f47137n.getFontMetricsInt());
                e.cacheType = p5.g();
                e.setAdded();
                arrayList.add(w7.q.b(editTextSelectionEnd, 0, arrayList.size()), l4);
                linkedHashMap.put(l4, e);
                spannableString.setSpan(e, 0, spannableString.length(), 33);
                sVar.f47137n.getText().insert(editTextSelectionEnd, spannableString);
                sVar.f47137n.setSelection(editTextSelectionEnd + spannableString.length());
                sVar.f47134b.x(l4, true);
                sVar.Y(true);
                sVar.W(e);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }
}
