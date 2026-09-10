package zh;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.x20;
public final class f3 {
    public final ImageReceiver f48408a;
    public int f48409b;
    public StaticLayout f48410c;
    public final TextPaint d;
    public f4 e;
    public final g3 f48411f;

    public f3(g3 g3Var) {
        this.f48411f = g3Var;
        ImageReceiver imageReceiver = new ImageReceiver(g3Var);
        this.f48408a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i10) {
        g3 g3Var = this.f48411f;
        ArrayList arrayList = g3Var.E;
        if (i10 >= 0 && i10 < arrayList.size()) {
            this.e = (f4) arrayList.get(i10);
            boolean z10 = g3Var.v;
            ImageReceiver imageReceiver = this.f48408a;
            if (z10) {
                imageReceiver.onAttachedToWindow();
            }
            f4 f4Var = this.e;
            TL_stories.StoryItem storyItem = f4Var.f48412a;
            if (storyItem != null) {
                a6.x(imageReceiver, storyItem);
            } else {
                h5 h5Var = f4Var.f48413b;
                x20[] x20VarArr = a6.f48257a;
                if (h5Var.f48473c.K) {
                    imageReceiver.setImage(ImageLocation.getForPath(h5Var.f48474f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.setImage(ImageLocation.getForPath(h5Var.e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.f48412a;
        g3 g3Var = this.f48411f;
        if (storyItem != null) {
            g3.a(g3Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f48410c = null;
            return;
        }
        int i10 = (int) (g3Var.J + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = uw0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, false, null, Integer.MAX_VALUE, 1, true);
        this.f48410c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            g3.a(g3Var, spannableStringBuilder2, this.e.f48412a.views, true);
            this.f48410c = uw0.c(spannableStringBuilder2, textPaint, (int) (g3Var.J + 1.0f), alignment, 0.0f, false, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
