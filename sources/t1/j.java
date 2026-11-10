package t1;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.l;
public final class j implements TransformationMethod {
    public final TransformationMethod f55382a;

    public j(TransformationMethod transformationMethod) {
        this.f55382a = transformationMethod;
    }

    @Override
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f55382a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && l.a().b() == 1) {
            l a10 = l.a();
            a10.getClass();
            return a10.e(0, charSequence.length(), charSequence);
        }
        return charSequence;
    }

    @Override
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z9, int i7, Rect rect) {
        TransformationMethod transformationMethod = this.f55382a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z9, i7, rect);
        }
    }
}
