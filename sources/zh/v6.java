package zh;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.wr;
public final class v6 {
    public final y2 f48991a;
    public final org.telegram.ui.Components.d6 f48992b;
    public final TextPaint f48993c;
    public final StaticLayout d;
    public final float e;
    public final float f48994f;
    public float f48995g;
    public boolean h;
    public int f48996i;

    public v6(a3 a3Var, y2 y2Var) {
        float f7;
        this.f48991a = y2Var;
        this.f48992b = new org.telegram.ui.Components.d6(a3Var, 0L, 360L, wr.h);
        TextPaint textPaint = new TextPaint(1);
        this.f48993c = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.StorySeekHelp), textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineLeft(0);
        } else {
            f7 = 0.0f;
        }
        this.e = f7;
        this.f48994f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
