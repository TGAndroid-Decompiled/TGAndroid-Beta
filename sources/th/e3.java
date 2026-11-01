package th;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.jc;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.u10;
public final class e3 {
    public final ImageReceiver f48912a;
    public int f48913b;
    public StaticLayout f48914c;
    public final TextPaint d;
    public e4 e;
    public final f3 f48915f;

    public e3(f3 f3Var) {
        this.f48915f = f3Var;
        ImageReceiver imageReceiver = new ImageReceiver(f3Var);
        this.f48912a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.f14425z1 = true;
        imageReceiver.J0(org.telegram.messenger.i0.L(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
    }

    public final void a(int i10) {
        f3 f3Var = this.f48915f;
        ArrayList arrayList = f3Var.E;
        if (i10 >= 0 && i10 < arrayList.size()) {
            this.e = (e4) arrayList.get(i10);
            boolean z10 = f3Var.f48972w;
            ImageReceiver imageReceiver = this.f48912a;
            if (z10) {
                imageReceiver.P();
            }
            e4 e4Var = this.e;
            TL_stories.StoryItem storyItem = e4Var.f48916a;
            if (storyItem != null) {
                w5.x(imageReceiver, storyItem);
            } else {
                d5 d5Var = e4Var.f48917b;
                u10[] u10VarArr = w5.f49587a;
                if (d5Var.f48892c.K) {
                    imageReceiver.r0(jc.g(d5Var.f48893f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.r0(jc.g(d5Var.e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.f48916a;
        f3 f3Var = this.f48915f;
        if (storyItem != null) {
            f3.a(f3Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f48914c = null;
            return;
        }
        int i10 = (int) (f3Var.J + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = pv0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, null, Integer.MAX_VALUE, 1, true);
        this.f48914c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            f3.a(f3Var, spannableStringBuilder2, this.e.f48916a.views, true);
            this.f48914c = pv0.c(spannableStringBuilder2, textPaint, (int) (f3Var.J + 1.0f), alignment, 0.0f, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
