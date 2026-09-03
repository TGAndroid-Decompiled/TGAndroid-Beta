package wh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.w51;
public final class v implements TextWatcher {
    public final w f50125a;

    public v(w wVar) {
        this.f50125a = wVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        w wVar = this.f50125a;
        TL_iv.RichMessage richMessage = wVar.f50162f0;
        if (richMessage != null && richMessage != null) {
            wVar.f50162f0 = null;
            wVar.f50159c0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            w51 w51Var = wVar.W;
            if (w51Var != null) {
                w51Var.N(true);
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
