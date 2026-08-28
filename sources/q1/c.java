package q1;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.k;
import java.lang.ref.WeakReference;
public final class c extends androidx.emoji2.text.h {
    public final WeakReference f45900a;
    public final WeakReference f45901b;

    public c(TextView textView, d dVar) {
        this.f45900a = new WeakReference(textView);
        this.f45901b = new WeakReference(dVar);
    }

    @Override
    public final void a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f45900a.get();
        InputFilter inputFilter = (InputFilter) this.f45901b.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        k a2 = k.a();
                        if (text == null) {
                            length = 0;
                        } else {
                            a2.getClass();
                            length = text.length();
                        }
                        CharSequence e10 = a2.e(0, length, text);
                        if (text != e10) {
                            int selectionStart = Selection.getSelectionStart(e10);
                            int selectionEnd = Selection.getSelectionEnd(e10);
                            textView.setText(e10);
                            if (e10 instanceof Spannable) {
                                Spannable spannable = (Spannable) e10;
                                if (selectionStart >= 0 && selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionStart, selectionEnd);
                                    return;
                                } else if (selectionStart >= 0) {
                                    Selection.setSelection(spannable, selectionStart);
                                    return;
                                } else if (selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionEnd);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
