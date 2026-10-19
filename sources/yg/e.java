package yg;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
public final class e implements TextWatcher {
    public final h f50141a;

    public e(h hVar) {
        this.f50141a = hVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Utilities.Callback callback;
        h hVar = this.f50141a;
        if (!hVar.h && (callback = hVar.f50152n) != null && editable != null) {
            callback.run(editable.toString());
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
