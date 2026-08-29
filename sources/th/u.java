package th;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.k51;
public final class u implements TextWatcher {
    public final v f48787a;

    public u(v vVar) {
        this.f48787a = vVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        v vVar = this.f48787a;
        TL_iv.RichMessage richMessage = vVar.f48809e0;
        if (richMessage != null && richMessage != null) {
            vVar.f48809e0 = null;
            vVar.f48806b0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            k51 k51Var = vVar.V;
            if (k51Var != null) {
                k51Var.N(true);
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
