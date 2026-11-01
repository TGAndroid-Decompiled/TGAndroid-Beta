package th;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.uz;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class a3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f48790a;
    public final View f48791b;
    public final Object f48792c;

    public a3(int i10, View view, Object obj) {
        this.f48790a = i10;
        this.f48791b = view;
        this.f48792c = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f48790a;
        Object obj = this.f48792c;
        View view = this.f48791b;
        switch (i10) {
            case 0:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) view;
                boolean[] zArr = (boolean[]) obj;
                int i11 = ProfileStoriesView.f34063s0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue > 0.2f) {
                    zArr[0] = true;
                    if (uz.o() > 0) {
                        org.telegram.messenger.i0.b4(profileStoriesView);
                        org.telegram.messenger.i0.h3(new sg.v(profileStoriesView, 9), 180L);
                    }
                }
                profileStoriesView.W = Math.max(1.0f, floatValue);
                profileStoriesView.invalidate();
                return;
            default:
                l lVar = (l) view;
                View view2 = (View) obj;
                lVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = 1.0f - floatValue2;
                view2.setAlpha(f7);
                view2.setTranslationY((-org.telegram.messenger.i0.L(5.0f)) * floatValue2);
                lVar.D.setAlpha(floatValue2);
                lVar.D.setTranslationY(org.telegram.messenger.i0.L(5.0f) * f7);
                return;
        }
    }
}
