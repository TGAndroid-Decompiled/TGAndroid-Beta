package uf;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class i1 implements TextWatcher {
    public final TextView f45384a;
    public final Runnable[] f45385b;

    public i1(TextView textView, Runnable[] runnableArr) {
        this.f45384a = textView;
        this.f45385b = runnableArr;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f45384a.getAlpha() > 0.0f) {
            Runnable[] runnableArr = this.f45385b;
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
