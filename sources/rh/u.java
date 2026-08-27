package rh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b51;

public final class u implements TextWatcher {

    public final v f47489a;

    public u(v vVar) {
        this.f47489a = vVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        v vVar = this.f47489a;
        TL_iv.RichMessage richMessage = vVar.f47511e0;
        if (richMessage != null && richMessage != null) {
            vVar.f47511e0 = null;
            vVar.f47508b0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            b51 b51Var = vVar.V;
            if (b51Var != null) {
                b51Var.N(true);
            }
        }
        vVar.P();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
