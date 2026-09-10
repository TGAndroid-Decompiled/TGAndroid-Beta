package zh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class b3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f48302a;
    public final View f48303b;
    public final Object f48304c;

    public b3(int i10, View view, Object obj) {
        this.f48302a = i10;
        this.f48303b = view;
        this.f48304c = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f48302a;
        Object obj = this.f48304c;
        View view = this.f48303b;
        switch (i10) {
            case 0:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) view;
                boolean[] zArr = (boolean[]) obj;
                int i11 = ProfileStoriesView.f30630s0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!zArr[0] && floatValue > 0.2f) {
                    zArr[0] = true;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new xh.x(profileStoriesView, 25), 180L);
                    }
                }
                profileStoriesView.W = Math.max(1.0f, floatValue);
                profileStoriesView.invalidate();
                return;
            default:
                k kVar = (k) view;
                View view2 = (View) obj;
                kVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f7 = 1.0f - floatValue2;
                view2.setAlpha(f7);
                view2.setTranslationY((-AndroidUtilities.dp(5.0f)) * floatValue2);
                kVar.f48574y.setAlpha(floatValue2);
                kVar.f48574y.setTranslationY(AndroidUtilities.dp(5.0f) * f7);
                return;
        }
    }
}
