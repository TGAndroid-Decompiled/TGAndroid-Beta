package vh;

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
import org.telegram.ui.ActionBar.f6;
public final class e4 extends ReplacementSpan {
    public final TL_iv.textButton f45878a;
    public RichMessageLayout.RichButtonSpan f45879b;
    public View f45880c;
    public int d = UserConfig.selectedAccount;
    public f6 e;

    public e4(TL_iv.textButton textbutton) {
        this.f45878a = textbutton;
    }

    public static boolean c(TL_keyboard.InlineButtonType inlineButtonType) {
        if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile)) {
            return false;
        }
        return true;
    }

    public final void a(int i10, View view, f6 f6Var) {
        View view2;
        RichMessageLayout.RichButtonSpan richButtonSpan = this.f45879b;
        if (richButtonSpan != null && (view2 = this.f45880c) != null) {
            richButtonSpan.detach(view2);
        }
        this.f45880c = view;
        this.d = i10;
        this.e = f6Var;
        this.f45879b = null;
        b();
    }

    public final RichMessageLayout.RichButtonSpan b() {
        if (this.f45879b == null) {
            RichMessageLayout.RichButtonSpan createEditorButtonSpan = RichMessageLayout.createEditorButtonSpan(this.d, AndroidUtilities.dp(240.0f), this.e, this.f45878a);
            this.f45879b = createEditorButtonSpan;
            View view = this.f45880c;
            if (view != null) {
                createEditorButtonSpan.attach(view);
            }
        }
        return this.f45879b;
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
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        b().draw(canvas, charSequence, i10, i11, f10, i12, i13, i14, paint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return b().getSize(paint, charSequence, i10, i11, fontMetricsInt);
    }
}
