package vf;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class i1 implements TextWatcher {
    public final TextView f49064a;
    public final Runnable[] f49065b;

    public i1(TextView textView, Runnable[] runnableArr) {
        this.f49064a = textView;
        this.f49065b = runnableArr;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f49064a.getAlpha() > 0.0f) {
            Runnable[] runnableArr = this.f49065b;
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
