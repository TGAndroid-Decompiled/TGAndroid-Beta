package sf;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class j1 implements TextWatcher {
    public final TextView f47828a;
    public final Runnable[] f47829b;

    public j1(TextView textView, Runnable[] runnableArr) {
        this.f47828a = textView;
        this.f47829b = runnableArr;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f47828a.getAlpha() > 0.0f) {
            Runnable[] runnableArr = this.f47829b;
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
