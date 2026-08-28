package t0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
public final class d extends InputConnectionWrapper {
    public final f f47589a;

    public d(InputConnection inputConnection, f fVar) {
        super(inputConnection, false);
        this.f47589a = fVar;
    }

    @Override
    public final boolean commitContent(InputContentInfo inputContentInfo, int i9, Bundle bundle) {
        j jVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            jVar = new j(new h(inputContentInfo));
        }
        if (this.f47589a.h(jVar, i9, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i9, bundle);
    }
}
