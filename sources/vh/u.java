package vh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.w51;
public final class u implements TextWatcher {
    public final v f46186a;

    public u(v vVar) {
        this.f46186a = vVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        v vVar = this.f46186a;
        TL_iv.RichMessage richMessage = vVar.f46222f0;
        if (richMessage != null && richMessage != null) {
            vVar.f46222f0 = null;
            vVar.f46219c0.g(LocaleController.getString(R.string.ArticleAIGenerate), true, true);
            w51 w51Var = vVar.W;
            if (w51Var != null) {
                w51Var.N(true);
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
