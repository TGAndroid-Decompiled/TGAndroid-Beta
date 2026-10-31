package sg;

import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.o5;
import org.telegram.ui.i31;
public final class m extends i31 {
    public boolean f48389e2;
    public final o f48390f2;

    public m(o oVar, o oVar2, Activity activity, p6 p6Var, int i10) {
        super(oVar2, activity, false, null, 6, false, p6Var, 16, i10);
        this.f48390f2 = oVar;
        this.f48389e2 = true;
        setDrawBackground(false);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f48389e2) {
            this.f48389e2 = false;
            this.f48390f2.f48422b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        o oVar = this.f48390f2;
        int i10 = oVar.M;
        ArrayList arrayList = oVar.I;
        LinkedHashMap linkedHashMap = oVar.H;
        if (linkedHashMap.containsKey(l4)) {
            arrayList.remove(l4);
            o5 o5Var = (o5) linkedHashMap.remove(l4);
            o5Var.setRemoved(new rh.o(22, this, o5Var));
            oVar.b0(o5Var);
            oVar.f48422b.x(l4, true);
            oVar.d0(false);
        } else if (linkedHashMap.size() - (linkedHashMap.containsKey(-1L) ? 1 : 0) >= i10) {
            cc.a0(oVar).t(cd.G(i10, "ReactionMaxCountError", new Object[0]), null).j();
        } else {
            try {
                int editTextSelectionEnd = oVar.h.getEditTextSelectionEnd();
                SpannableString spannableString = new SpannableString("b");
                o5 e = q0.e(document, l4, oVar.h.getFontMetricsInt());
                e.cacheType = f5.f();
                e.setAdded();
                arrayList.add(w7.u.b(editTextSelectionEnd, 0, arrayList.size()), l4);
                linkedHashMap.put(l4, e);
                spannableString.setSpan(e, 0, spannableString.length(), 33);
                oVar.h.getText().insert(editTextSelectionEnd, spannableString);
                oVar.h.setSelection(editTextSelectionEnd + spannableString.length());
                oVar.f48422b.x(l4, true);
                oVar.d0(true);
                oVar.b0(e);
            } catch (Exception e7) {
                f8.g(e7, true);
            }
        }
    }
}
