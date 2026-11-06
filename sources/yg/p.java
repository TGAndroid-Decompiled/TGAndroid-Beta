package yg;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.g0;
public final class p extends ViewOutlineProvider {
    @Override
    public final void getOutline(View view, Outline outline) {
        float L = g0.L(12.0f);
        outline.setRoundRect(0, 0, view.getWidth(), (int) (view.getHeight() + L), L);
    }
}
