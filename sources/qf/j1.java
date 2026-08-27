package qf;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class j1 implements TextWatcher {

    public final TextView f46328a;

    public final Runnable[] f46329b;

    public j1(TextView textView, Runnable[] runnableArr) {
        this.f46328a = textView;
        this.f46329b = runnableArr;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f46328a.getAlpha() > 0.0f) {
            Runnable[] runnableArr = this.f46329b;
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
