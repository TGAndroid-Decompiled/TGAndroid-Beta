package t0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import org.telegram.ui.Components.qf;
public final class c extends InputConnectionWrapper {
    public final e f57561a;

    public c(InputConnection inputConnection, e eVar) {
        super(inputConnection, false);
        this.f57561a = eVar;
    }

    @Override
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        qf qfVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            qfVar = new qf(new g(inputContentInfo), 18);
        }
        if (this.f57561a.d(qfVar, i7, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i7, bundle);
    }
}
