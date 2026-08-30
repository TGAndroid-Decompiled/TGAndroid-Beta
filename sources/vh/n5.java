package vh;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.o70;
public final class n5 implements View.OnClickListener {
    public final int f46028a;
    public final v5 f46029b;

    public n5(v5 v5Var, int i10) {
        this.f46028a = i10;
        this.f46029b = v5Var;
    }

    @Override
    public final void onClick(View view) {
        Set<String> languages;
        switch (this.f46028a) {
            case 0:
                v5 v5Var = this.f46029b;
                a aVar = v5Var.f46245x;
                if (aVar != null && aVar.e) {
                    boolean z4 = !aVar.f45777f;
                    aVar.f45777f = z4;
                    ((CheckBoxBase) v5Var.e.f34695b).f(-1, z4, true);
                    s5 s5Var = v5Var.f46246y;
                    if (s5Var != null) {
                        a aVar2 = v5Var.f46245x;
                        boolean z10 = aVar2.f45777f;
                        r3 r3Var = ((a3) s5Var).f45801a;
                        aVar2.f45777f = z10;
                        c2 c2Var = r3Var.G3;
                        if (c2Var != null) {
                            c2Var.d();
                            r3Var.G3.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                v5 v5Var2 = this.f46029b;
                s5 s5Var2 = v5Var2.f46246y;
                if (s5Var2 != null) {
                    a aVar3 = v5Var2.f46245x;
                    r3 r3Var2 = ((a3) s5Var2).f45801a;
                    if (aVar3 != null && (aVar3.f45775b instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f45775b;
                        o70 C = r3Var2.f46112e3.C(view);
                        C.W(j6.b0(AndroidUtilities.dp(3.0f), j6.v0(j6.f19906d6, r3Var2.f46110d3)));
                        C.Z = true;
                        C.X = AndroidUtilities.dp(350.0f);
                        C.i(new j2(r3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            C.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        C.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            C.i(new tf.h1(r3Var2, aVar3, str, 12), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        C.Z();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
