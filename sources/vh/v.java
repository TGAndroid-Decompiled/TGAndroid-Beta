package vh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.w51;
public final class v implements TextWatcher {
    public final w f46289a;

    public v(w wVar) {
        this.f46289a = wVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        w wVar = this.f46289a;
        TL_iv.RichMessage richMessage = wVar.f46321f0;
        if (richMessage != null && richMessage != null) {
            wVar.f46321f0 = null;
            wVar.f46318c0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
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
