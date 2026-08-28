package qh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.b6;
public final class b4 extends ReplacementSpan {
    public final TL_iv.textButton f46313a;
    public RichMessageLayout.RichButtonSpan f46314b;
    public View f46315c;
    public int d = UserConfig.selectedAccount;
    public b6 f46316e;

    public b4(TL_iv.textButton textbutton) {
        this.f46313a = textbutton;
    }

    public static boolean c(TL_keyboard.InlineButtonType inlineButtonType) {
        if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile)) {
            return false;
        }
        return true;
    }

    public final void a(int i9, View view, b6 b6Var) {
        View view2;
        RichMessageLayout.RichButtonSpan richButtonSpan = this.f46314b;
        if (richButtonSpan != null && (view2 = this.f46315c) != null) {
            richButtonSpan.detach(view2);
        }
        this.f46315c = view;
        this.d = i9;
        this.f46316e = b6Var;
        this.f46314b = null;
        b();
    }

    public final RichMessageLayout.RichButtonSpan b() {
        if (this.f46314b == null) {
            RichMessageLayout.RichButtonSpan createEditorButtonSpan = RichMessageLayout.createEditorButtonSpan(this.d, AndroidUtilities.dp(240.0f), this.f46316e, this.f46313a);
            this.f46314b = createEditorButtonSpan;
            View view = this.f46315c;
            if (view != null) {
                createEditorButtonSpan.attach(view);
            }
        }
        return this.f46314b;
    }

    public final void d(Editable editable) {
        ReplacementSpan[] replacementSpanArr;
        int spanStart = editable.getSpanStart(this);
        int spanEnd = editable.getSpanEnd(this);
        if (spanStart >= 0 && spanEnd > spanStart) {
            for (ReplacementSpan replacementSpan : (ReplacementSpan[]) editable.getSpans(spanStart, spanEnd, ReplacementSpan.class)) {
                if (replacementSpan != this) {
                    int spanStart2 = editable.getSpanStart(replacementSpan);
                    int spanEnd2 = editable.getSpanEnd(replacementSpan);
                    if (spanStart2 < spanEnd && spanEnd2 > spanStart) {
                        editable.removeSpan(replacementSpan);
                    }
                }
            }
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        b().draw(canvas, charSequence, i9, i10, f10, i11, i12, i13, paint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return b().getSize(paint, charSequence, i9, i10, fontMetricsInt);
    }
}
