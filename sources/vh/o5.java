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
import org.telegram.ui.Components.p70;
public final class o5 implements View.OnClickListener {
    public final int f46125a;
    public final w5 f46126b;

    public o5(w5 w5Var, int i10) {
        this.f46125a = i10;
        this.f46126b = w5Var;
    }

    @Override
    public final void onClick(View view) {
        Set<String> languages;
        switch (this.f46125a) {
            case 0:
                w5 w5Var = this.f46126b;
                a aVar = w5Var.f46346x;
                if (aVar != null && aVar.e) {
                    boolean z4 = !aVar.f45855f;
                    aVar.f45855f = z4;
                    ((CheckBoxBase) w5Var.e.f36598b).f(-1, z4, true);
                    t5 t5Var = w5Var.f46347y;
                    if (t5Var != null) {
                        a aVar2 = w5Var.f46346x;
                        boolean z10 = aVar2.f45855f;
                        s3 s3Var = ((b3) t5Var).f45897a;
                        aVar2.f45855f = z10;
                        d2 d2Var = s3Var.G3;
                        if (d2Var != null) {
                            d2Var.d();
                            s3Var.G3.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                w5 w5Var2 = this.f46126b;
                t5 t5Var2 = w5Var2.f46347y;
                if (t5Var2 != null) {
                    a aVar3 = w5Var2.f46346x;
                    s3 s3Var2 = ((b3) t5Var2).f45897a;
                    if (aVar3 != null && (aVar3.f45853b instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f45853b;
                        p70 C = s3Var2.f46209e3.C(view);
                        C.W(j6.b0(AndroidUtilities.dp(3.0f), j6.v0(j6.f19881d6, s3Var2.f46207d3)));
                        C.Z = true;
                        C.X = AndroidUtilities.dp(350.0f);
                        C.i(new k2(s3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
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
                            C.i(new tf.k1(s3Var2, aVar3, str, 11), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
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
