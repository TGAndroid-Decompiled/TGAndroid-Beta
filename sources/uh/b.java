package uh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.Emoji;
public final class b extends ReplacementSpan {
    public final Emoji.EmojiSpan f42742a;

    public b(Emoji.EmojiSpan emojiSpan) {
        this.f42742a = emojiSpan;
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return this.f42742a.getSize(paint, charSequence, i10, i11, fontMetricsInt);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
