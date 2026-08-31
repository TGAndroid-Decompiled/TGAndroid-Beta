package wh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.x51;
public final class v implements TextWatcher {
    public final w f50088a;

    public v(w wVar) {
        this.f50088a = wVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        w wVar = this.f50088a;
        TL_iv.RichMessage richMessage = wVar.f50125f0;
        if (richMessage != null && richMessage != null) {
            wVar.f50125f0 = null;
            wVar.f50122c0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            x51 x51Var = wVar.W;
            if (x51Var != null) {
                x51Var.N(true);
            }
        }
        wVar.P();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
