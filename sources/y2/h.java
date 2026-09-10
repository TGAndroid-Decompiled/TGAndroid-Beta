package y2;

import android.view.View;
import java.util.concurrent.ExecutorService;
public final class h implements e2.h {
    public final int f46436a;

    @Override
    public final void accept(Object obj) {
        switch (this.f46436a) {
            case 0:
                ((ExecutorService) obj).shutdown();
                return;
            case 1:
                View view = (View) obj;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                return;
            case 2:
                ((View) obj).setTranslationY(0.0f);
                return;
            default:
                ((zh.k) ((View) obj)).invalidate();
                return;
        }
    }
}
