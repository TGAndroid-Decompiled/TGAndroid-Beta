package t0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import org.telegram.ui.Components.qt;
public final class c extends InputConnectionWrapper {
    public final e f55257a;

    public c(InputConnection inputConnection, e eVar) {
        super(inputConnection, false);
        this.f55257a = eVar;
    }

    @Override
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        qt qtVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            qtVar = new qt(new g(inputContentInfo), 15);
        }
        if (this.f55257a.k(qtVar, i7, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i7, bundle);
    }
}
