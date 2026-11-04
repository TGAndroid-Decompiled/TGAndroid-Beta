package t0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import org.telegram.ui.Components.y00;
public final class c extends InputConnectionWrapper {
    public final e f54769a;

    public c(InputConnection inputConnection, e eVar) {
        super(inputConnection, false);
        this.f54769a = eVar;
    }

    @Override
    public final boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        y00 y00Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            y00Var = new y00(new g(inputContentInfo));
        }
        if (this.f54769a.m(y00Var, i3, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i3, bundle);
    }
}
