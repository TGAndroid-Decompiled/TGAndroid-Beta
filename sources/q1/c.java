package q1;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.l;
import java.lang.ref.WeakReference;
public final class c extends androidx.emoji2.text.i {
    public final WeakReference f44424a;
    public final WeakReference f44425b;

    public c(TextView textView, d dVar) {
        this.f44424a = new WeakReference(textView);
        this.f44425b = new WeakReference(dVar);
    }

    @Override
    public final void a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f44424a.get();
        InputFilter inputFilter = (InputFilter) this.f44425b.get();
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
                        CharSequence e6 = a2.e(0, length, text);
                        if (text != e6) {
                            int selectionStart = Selection.getSelectionStart(e6);
                            int selectionEnd = Selection.getSelectionEnd(e6);
                            textView.setText(e6);
                            if (e6 instanceof Spannable) {
                                Spannable spannable = (Spannable) e6;
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
