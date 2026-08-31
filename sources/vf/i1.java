package vf;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class i1 implements TextWatcher {
    public final TextView f49063a;
    public final Runnable[] f49064b;

    public i1(TextView textView, Runnable[] runnableArr) {
        this.f49063a = textView;
        this.f49064b = runnableArr;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f49063a.getAlpha() > 0.0f) {
            Runnable[] runnableArr = this.f49064b;
            AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
            AndroidUtilities.runOnUIThread(runnableArr[0]);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
