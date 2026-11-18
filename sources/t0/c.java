package t0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import org.telegram.ui.Components.of;
public final class c extends InputConnectionWrapper {
    public final e f57518a;

    public c(InputConnection inputConnection, e eVar) {
        super(inputConnection, false);
        this.f57518a = eVar;
    }

    @Override
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        of ofVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            ofVar = new of(new g(inputContentInfo), 18);
        }
        if (this.f57518a.d(ofVar, i7, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i7, bundle);
    }
}
