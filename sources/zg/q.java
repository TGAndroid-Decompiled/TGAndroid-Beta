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
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.c71;
public final class q extends c71 {
    public boolean f49446d2;
    public final r f49447e2;

    public q(r rVar, r rVar2, Activity activity, e6 e6Var, int i10) {
        super(rVar2, activity, false, null, 6, false, e6Var, 16, i10);
        this.f49447e2 = rVar;
        this.f49446d2 = true;
        setDrawBackground(false);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f49446d2) {
            this.f49446d2 = false;
            this.f49447e2.f49474b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        r rVar = this.f49447e2;
        int i10 = rVar.J;
        ArrayList arrayList = rVar.F;
        LinkedHashMap linkedHashMap = rVar.E;
        if (linkedHashMap.containsKey(l4)) {
            arrayList.remove(l4);
            z5 z5Var = (z5) linkedHashMap.remove(l4);
            z5Var.setRemoved(new k(2, this, z5Var));
            rVar.W(z5Var);
            rVar.f49474b.x(l4, true);
            rVar.Y(false);
        } else if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i10) {
            xc.a0(rVar).t(LocaleController.formatPluralString("ReactionMaxCountError", i10, new Object[0]), null).j();
        } else {
            try {
                int editTextSelectionEnd = rVar.f49477n.getEditTextSelectionEnd();
                SpannableString spannableString = new SpannableString("b");
                z5 e = r0.e(document, l4, rVar.f49477n.getFontMetricsInt());
                e.cacheType = q5.g();
                e.setAdded();
                arrayList.add(w7.q.b(editTextSelectionEnd, 0, arrayList.size()), l4);
                linkedHashMap.put(l4, e);
                spannableString.setSpan(e, 0, spannableString.length(), 33);
                rVar.f49477n.getText().insert(editTextSelectionEnd, spannableString);
                rVar.f49477n.setSelection(editTextSelectionEnd + spannableString.length());
                rVar.f49474b.x(l4, true);
                rVar.Y(true);
                rVar.W(e);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }
}
