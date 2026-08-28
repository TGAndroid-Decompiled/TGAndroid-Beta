package q1;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.k;
public final class j implements TransformationMethod {
    public final TransformationMethod f45914a;

    public j(TransformationMethod transformationMethod) {
        this.f45914a = transformationMethod;
    }

    @Override
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f45914a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && k.a().b() == 1) {
            k a2 = k.a();
            a2.getClass();
            return a2.e(0, charSequence.length(), charSequence);
        }
        return charSequence;
    }

    @Override
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i9, Rect rect) {
        TransformationMethod transformationMethod = this.f45914a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i9, rect);
        }
    }
}
