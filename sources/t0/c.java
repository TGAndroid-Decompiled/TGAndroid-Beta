package t0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import org.telegram.ui.Cells.aa;
public final class c extends InputConnectionWrapper {
    public final e f57637a;

    public c(InputConnection inputConnection, e eVar) {
        super(inputConnection, false);
        this.f57637a = eVar;
    }

    @Override
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        aa aaVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            aaVar = new aa(new g(inputContentInfo), 19);
        }
        if (this.f57637a.e(aaVar, i7, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i7, bundle);
    }
}
