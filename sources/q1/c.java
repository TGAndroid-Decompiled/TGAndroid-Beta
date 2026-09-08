package q1;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.l;
import java.lang.ref.WeakReference;
public final class c extends androidx.emoji2.text.i {
    public final WeakReference f44134a;
    public final WeakReference f44135b;

    public c(TextView textView, d dVar) {
        this.f44134a = new WeakReference(textView);
        this.f44135b = new WeakReference(dVar);
    }

    @Override
    public final void a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f44134a.get();
        InputFilter inputFilter = (InputFilter) this.f44135b.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        l a2 = l.a();
                        if (text == null) {
                            length = 0;
                        } else {
                            a2.getClass();
                            length = text.length();
                        }
                        CharSequence e7 = a2.e(0, length, text);
                        if (text != e7) {
                            int selectionStart = Selection.getSelectionStart(e7);
                            int selectionEnd = Selection.getSelectionEnd(e7);
                            textView.setText(e7);
                            if (e7 instanceof Spannable) {
                                Spannable spannable = (Spannable) e7;
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
