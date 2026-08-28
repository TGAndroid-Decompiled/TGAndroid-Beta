package pf;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class j1 implements TextWatcher {
    public final TextView f45655a;
    public final Runnable[] f45656b;

    public j1(TextView textView, Runnable[] runnableArr) {
        this.f45655a = textView;
        this.f45656b = runnableArr;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f45655a.getAlpha() > 0.0f) {
            Runnable[] runnableArr = this.f45656b;
            AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
            AndroidUtilities.runOnUIThread(runnableArr[0]);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
