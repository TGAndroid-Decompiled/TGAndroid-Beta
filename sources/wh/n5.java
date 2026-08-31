package wh;

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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.q70;
public final class n5 implements View.OnClickListener {
    public final int f49891a;
    public final v5 f49892b;

    public n5(v5 v5Var, int i10) {
        this.f49891a = i10;
        this.f49892b = v5Var;
    }

    @Override
    public final void onClick(View view) {
        Set<String> languages;
        switch (this.f49891a) {
            case 0:
                v5 v5Var = this.f49892b;
                a aVar = v5Var.f50118x;
                if (aVar != null && aVar.f49618e) {
                    boolean z4 = !aVar.f49619f;
                    aVar.f49619f = z4;
                    ((CheckBoxBase) v5Var.f50112e.f37946b).f(-1, z4, true);
                    s5 s5Var = v5Var.f50119y;
                    if (s5Var != null) {
                        a aVar2 = v5Var.f50118x;
                        boolean z10 = aVar2.f49619f;
                        r3 r3Var = ((a3) s5Var).f49640a;
                        aVar2.f49619f = z10;
                        d2 d2Var = r3Var.G3;
                        if (d2Var != null) {
                            d2Var.d();
                            r3Var.G3.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                v5 v5Var2 = this.f49892b;
                s5 s5Var2 = v5Var2.f50119y;
                if (s5Var2 != null) {
                    a aVar3 = v5Var2.f50118x;
                    r3 r3Var2 = ((a3) s5Var2).f49640a;
                    if (aVar3 != null && (aVar3.f49616b instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f49616b;
                        q70 P = r3Var2.f49979e3.P(view);
                        P.W(k6.b0(AndroidUtilities.dp(3.0f), k6.v0(k6.f21659d6, r3Var2.f49977d3)));
                        P.Z = true;
                        P.X = AndroidUtilities.dp(350.0f);
                        P.i(new k2(r3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            P.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        P.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            P.i(new uf.h1(r3Var2, aVar3, str, 12), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        P.Z();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
