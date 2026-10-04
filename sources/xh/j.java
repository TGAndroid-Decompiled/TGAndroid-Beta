package xh;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.FileLog;
public final class j implements TextWatcher {
    public final View[] f50019a;
    public final m f50020b;

    public j(m mVar, View[] viewArr) {
        this.f50020b = mVar;
        this.f50019a = viewArr;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        float f7;
        View[] viewArr = this.f50019a;
        try {
            if (Integer.parseInt(editable.toString()) >= this.f50020b.f50086l0.getMinimumBid()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewPropertyAnimator animate = viewArr[0].animate();
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            animate.alpha(f7).setDuration(180L).start();
            viewArr[0].setEnabled(z10);
            viewArr[0].setClickable(z10);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
