package t0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import m2.t;
public final class c extends InputConnectionWrapper {
    public final e f48533a;

    public c(InputConnection inputConnection, e eVar) {
        super(inputConnection, false);
        this.f48533a = eVar;
    }

    @Override
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        t tVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            tVar = new t(new g(inputContentInfo), 27);
        }
        if (this.f48533a.o(tVar, i10, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i10, bundle);
    }
}
