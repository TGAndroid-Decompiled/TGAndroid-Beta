package zg;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
public final class f implements TextWatcher {
    public final i f52869a;

    public f(i iVar) {
        this.f52869a = iVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Utilities.Callback callback;
        i iVar = this.f52869a;
        if (!iVar.h && (callback = iVar.f52880n) != null && editable != null) {
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
