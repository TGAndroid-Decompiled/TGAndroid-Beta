package qh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.z41;
public final class u implements TextWatcher {
    public final v f46732a;

    public u(v vVar) {
        this.f46732a = vVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        v vVar = this.f46732a;
        TL_iv.RichMessage richMessage = vVar.f46749e0;
        if (richMessage != null && richMessage != null) {
            vVar.f46749e0 = null;
            vVar.f46746b0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            z41 z41Var = vVar.V;
            if (z41Var != null) {
                z41Var.N(true);
            }
        }
        vVar.O();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
