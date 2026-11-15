package t0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import org.telegram.ui.Components.ff;
public final class c extends InputConnectionWrapper {
    public final e f56942a;

    public c(InputConnection inputConnection, e eVar) {
        super(inputConnection, false);
        this.f56942a = eVar;
    }

    @Override
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        ff ffVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            ffVar = new ff(new g(inputContentInfo), 17);
        }
        if (this.f56942a.o(ffVar, i7, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i7, bundle);
    }
}
