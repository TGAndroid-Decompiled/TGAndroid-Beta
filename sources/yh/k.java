package yh;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewPropertyAnimator;
import org.telegram.messenger.FileLog;
public final class k implements TextWatcher {
    public final View[] f48924a;
    public final n f48925b;

    public k(n nVar, View[] viewArr) {
        this.f48925b = nVar;
        this.f48924a = viewArr;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        float f7;
        View[] viewArr = this.f48924a;
        try {
            if (Integer.parseInt(editable.toString()) >= this.f48925b.f49017l0.getMinimumBid()) {
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
