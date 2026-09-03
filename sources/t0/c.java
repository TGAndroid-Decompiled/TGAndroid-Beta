package t0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
public final class c extends InputConnectionWrapper {
    public final e f44489a;

    public c(InputConnection inputConnection, e eVar) {
        super(inputConnection, false);
        this.f44489a = eVar;
    }

    @Override
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        i iVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            iVar = new i(new g(inputContentInfo));
        }
        if (this.f44489a.h(iVar, i10, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i10, bundle);
    }
}
