package th;

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
import org.telegram.ui.ActionBar.c6;
public final class c4 extends ReplacementSpan {
    public final TL_iv.textButton f48388a;
    public RichMessageLayout.RichButtonSpan f48389b;
    public View f48390c;
    public int d = UserConfig.selectedAccount;
    public c6 f48391e;

    public c4(TL_iv.textButton textbutton) {
        this.f48388a = textbutton;
    }

    public static boolean c(TL_keyboard.InlineButtonType inlineButtonType) {
        if (!(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) && !(inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile)) {
            return false;
        }
        return true;
    }

    public final void a(int i10, View view, c6 c6Var) {
        View view2;
        RichMessageLayout.RichButtonSpan richButtonSpan = this.f48389b;
        if (richButtonSpan != null && (view2 = this.f48390c) != null) {
            richButtonSpan.detach(view2);
        }
        this.f48390c = view;
        this.d = i10;
        this.f48391e = c6Var;
        this.f48389b = null;
        b();
    }

    public final RichMessageLayout.RichButtonSpan b() {
        if (this.f48389b == null) {
            RichMessageLayout.RichButtonSpan createEditorButtonSpan = RichMessageLayout.createEditorButtonSpan(this.d, AndroidUtilities.dp(240.0f), this.f48391e, this.f48388a);
            this.f48389b = createEditorButtonSpan;
            View view = this.f48390c;
            if (view != null) {
                createEditorButtonSpan.attach(view);
            }
        }
        return this.f48389b;
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
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
        b().draw(canvas, charSequence, i10, i11, f9, i12, i13, i14, paint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return b().getSize(paint, charSequence, i10, i11, fontMetricsInt);
    }
}
