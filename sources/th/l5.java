package th;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.j70;
public final class l5 implements View.OnClickListener {
    public final int f48561a;
    public final t5 f48562b;

    public l5(t5 t5Var, int i10) {
        this.f48561a = i10;
        this.f48562b = t5Var;
    }

    @Override
    public final void onClick(View view) {
        Set<String> languages;
        switch (this.f48561a) {
            case 0:
                t5 t5Var = this.f48562b;
                a aVar = t5Var.f48785x;
                if (aVar != null && aVar.f48330e) {
                    boolean z10 = !aVar.f48331f;
                    aVar.f48331f = z10;
                    ((CheckBoxBase) t5Var.f48779e.f41209b).f(-1, z10, true);
                    q5 q5Var = t5Var.f48786y;
                    if (q5Var != null) {
                        a aVar2 = t5Var.f48785x;
                        boolean z11 = aVar2.f48331f;
                        p3 p3Var = ((y2) q5Var).f48903a;
                        aVar2.f48331f = z11;
                        b2 b2Var = p3Var.F3;
                        if (b2Var != null) {
                            b2Var.d();
                            p3Var.F3.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                t5 t5Var2 = this.f48562b;
                q5 q5Var2 = t5Var2.f48786y;
                if (q5Var2 != null) {
                    a aVar3 = t5Var2.f48785x;
                    p3 p3Var2 = ((y2) q5Var2).f48903a;
                    if (aVar3 != null && (aVar3.f48328b instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f48328b;
                        j70 q12 = p3Var2.f48638d3.q1(view);
                        q12.W(g6.b0(AndroidUtilities.dp(3.0f), g6.v0(g6.f23062d6, p3Var2.c3)));
                        q12.Z = true;
                        q12.X = AndroidUtilities.dp(350.0f);
                        q12.i(new i2(p3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            q12.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        q12.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            q12.i(new sf.a(p3Var2, aVar3, str, 10), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        q12.Z();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
