package t0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import org.telegram.ui.Components.rt;
public final class c extends InputConnectionWrapper {
    public final e f55361a;

    public c(InputConnection inputConnection, e eVar) {
        super(inputConnection, false);
        this.f55361a = eVar;
    }

    @Override
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        rt rtVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            rtVar = new rt(new g(inputContentInfo), 15);
        }
        if (this.f55361a.k(rtVar, i7, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i7, bundle);
    }
}
