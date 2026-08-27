package rh;

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
import org.telegram.ui.Components.b70;

public final class l5 implements View.OnClickListener {

    public final int f47261a;

    public final t5 f47262b;

    public l5(t5 t5Var, int i10) {
        this.f47261a = i10;
        this.f47262b = t5Var;
    }

    @Override
    public final void onClick(View view) {
        Set<String> languages;
        switch (this.f47261a) {
            case 0:
                t5 t5Var = this.f47262b;
                a aVar = t5Var.f47487x;
                if (aVar != null && aVar.f47030e) {
                    boolean z10 = !aVar.f47031f;
                    aVar.f47031f = z10;
                    ((CheckBoxBase) t5Var.f47481e.f36554b).f(-1, z10, true);
                    q5 q5Var = t5Var.f47488y;
                    if (q5Var != null) {
                        a aVar2 = t5Var.f47487x;
                        boolean z11 = aVar2.f47031f;
                        p3 p3Var = ((y2) q5Var).f47605a;
                        aVar2.f47031f = z11;
                        b2 b2Var = p3Var.F3;
                        if (b2Var != null) {
                            b2Var.d();
                            p3Var.F3.h();
                        }
                    }
                    break;
                }
                break;
            default:
                t5 t5Var2 = this.f47262b;
                q5 q5Var2 = t5Var2.f47488y;
                if (q5Var2 != null) {
                    a aVar3 = t5Var2.f47487x;
                    p3 p3Var2 = ((y2) q5Var2).f47605a;
                    if (aVar3 != null && (aVar3.f47028b instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f47028b;
                        b70 b70VarA1 = p3Var2.f47340d3.A1(view);
                        b70VarA1.W(g6.b0(AndroidUtilities.dp(3.0f), g6.v0(g6.f23053d6, p3Var2.f47338c3)));
                        b70VarA1.Z = true;
                        b70VarA1.X = AndroidUtilities.dp(350.0f);
                        b70VarA1.i(new i2(p3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            b70VarA1.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        b70VarA1.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            b70VarA1.i(new qf.a(p3Var2, aVar3, str, 10), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        b70VarA1.Z();
                        break;
                    }
                }
                break;
        }
    }
}
